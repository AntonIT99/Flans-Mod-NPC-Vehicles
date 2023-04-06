package com.flansmod.client;

import java.util.ArrayList;
import java.util.List;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.client.renderer.EntityRenderer;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MouseHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.EnumSkyBlock;
import net.minecraftforge.client.event.MouseEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent.ElementType;
import net.minecraftforge.common.MinecraftForge;

import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

import com.flansmod.client.gui.GuiDriveableController;
import com.flansmod.client.gui.GuiTeamScores;
import com.flansmod.client.model.RenderFlag;
import com.flansmod.client.model.RenderGun;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.driveables.DriveableData;
import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.EnumDriveablePart;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.guns.AttachmentType;
import com.flansmod.common.guns.EntityBullet;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemBullet;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.network.PacketBlood;
import com.flansmod.common.network.PacketChecker;
import com.flansmod.common.network.PacketTeamInfo;
import com.flansmod.common.network.PacketTeamInfo.PlayerScoreData;
import com.flansmod.common.teams.ItemTeamArmour;
import com.flansmod.common.teams.TeamsManager;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.vector.Vector3f;
import com.flansmod.common.vector.Vector3i;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.ObfuscationReflectionHelper;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.relauncher.Side;

public class TickHandlerClient
{

	//bob vaccine
	public static Entity lastMount;

	public static final ResourceLocation offHand = new ResourceLocation("flansmod","gui/offHand.png");
	public static ArrayList<Vector3i> blockLightOverrides = new ArrayList<Vector3i>();
	public static ArrayList<Vector3i>vehicleLightOverrides = new ArrayList<Vector3i>();
	public static int lightOverrideRefreshRate = 5;
	public static int vehicleLightOverrideRefreshRate = 1;
	int tickcount = 0;
	int tickcountflash = 0;
	int tickcountWounded = 0;
	boolean isInFlash;
	int flashTime;
	EntityPlayer entityPlayerFlash;
	private static GuiScreen guiDriveableController = null;

	public static float cringeBlood = 100;
	public static float cringeHemorrhaging = 0;

	public TickHandlerClient()
	{
		FMLCommonHandler.instance().bus().register(this);
		MinecraftForge.EVENT_BUS.register(this);
	}

	@SubscribeEvent
	public void eventHandler(MouseEvent event)
	{
		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
		if(player.getCurrentEquippedItem() != null && player.getCurrentEquippedItem().getItem() instanceof ItemGun)
		{
			if(((ItemGun)player.getCurrentEquippedItem().getItem()).type.oneHanded && Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindSneak.getKeyCode()) && Math.abs(event.dwheel) > 0)
				event.setCanceled(true);


		}
	}

	@SubscribeEvent
	public void eventHandler(RenderGameOverlayEvent event)
	{
		Minecraft mc = Minecraft.getMinecraft();
		String playerUsername = FlansModClient.minecraft.thePlayer.getCommandSenderName();
		//     System.out.println(cringeBlood + "this one is cringe");

		//	PacketBlood dataServer = FlansModClient.blood;
		//if(!world.isRemote) { }

		//wont activate if in a seat
		if((Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindJump.getKeyCode())) && !(mc.thePlayer.isRiding()) )
		{
			ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, FMLClientHandler.instance().getClient().entityRenderer, 1, "cameraZoom", "af", "field_78503_V");
			//	FlansModClient.minecraft.gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
		}


		//use this as a client value printer ingame	
		//	mc.fontRenderer.drawString("this is your poopoo not sustained elevator: " + FlansModClient.recoilElevator  , 2, 72, 0xdaa520);


		if(mc.thePlayer.ridingEntity instanceof EntitySeat)
		{

			EntityDriveable enterino = ((EntitySeat)mc.thePlayer.ridingEntity).driveable;

			if(enterino instanceof EntityVehicle)
			{

				EntityVehicle enterinoTank = (EntityVehicle)enterino;



				{


					//hide crosshair while tank sights
					/*
			 if(event.type == ElementType.CROSSHAIRS && mc.thePlayer != null && enterino != null)
				if(enterino.aiming) 
				{
					event.setCanceled(true);
					return;
				}
					 */

					//actually, crosshair always off if tank has sights and no radar
					if(event.type == ElementType.CROSSHAIRS && mc.thePlayer != null)
						if(enterino.getDriveableType().hasScope && !enterinoTank.hasRadar) 
						{
							event.setCanceled(true);
							return;
						}

				}
			}
		}


		//Remove crosshairs if looking down the sights of a gun
		//also labjac manual override to prevent carry over sights from vehicles
		//allah bookmark this is the one that undoes snipers
		//through in !isriding so tank sights dont get poopoo'd while using handbreak
		//if((Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindJump.getKeyCode())) )
		//	ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, FMLClientHandler.instance().getClient().entityRenderer, 1, "cameraZoom", "af", "field_78503_V");
		if(event.type == ElementType.CROSSHAIRS && mc.thePlayer != null && mc.thePlayer.getHeldItem() != null && mc.thePlayer.getHeldItem().getItem() instanceof ItemGun  && !mc.thePlayer.isRiding())
		{
			if(!((ItemGun)mc.thePlayer.getHeldItem().getItem()).type.showCrosshair || FlansModClient.currentScope != null || FlansModClient.lastZoomProgress < -0.8) 
			{
				event.setCanceled(true);
				return;
			}
		}




		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();

		Tessellator tessellator = Tessellator.instance;




		if(!event.isCancelable() && event.type == ElementType.HELMET)
		{




			//Scopes and helmet overlays
			String overlayTexture = null;
			if (FlansModClient.currentScope != null && FlansModClient.currentScope.hasZoomOverlay() && FMLClientHandler.instance().getClient().currentScreen == null && FlansModClient.zoomProgress > 0.8F)
			{
				overlayTexture = FlansModClient.currentScope.getZoomOverlay();
			}
			else if(mc.thePlayer != null)
			{
				ItemStack stack = mc.thePlayer.inventory.armorInventory[3];
				if(stack != null && stack.getItem() instanceof ItemTeamArmour)
				{
					//hardcoded forced overlay for face covering helmets
					if (((float)((ItemTeamArmour)stack.getItem()).type.faceArmor)/(float)(((ItemTeamArmour)stack.getItem()).type.headArmor+1)>0.7F && ((ItemTeamArmour)stack.getItem()).type.faceArmor!=1)
						overlayTexture = "faceHelmet";
					else if (((float)((ItemTeamArmour)stack.getItem()).type.faceArmor)/(float)(((ItemTeamArmour)stack.getItem()).type.headArmor+1)>0.2F && ((float)((ItemTeamArmour)stack.getItem()).type.faceArmor)/(float)(((ItemTeamArmour)stack.getItem()).type.headArmor+1)<=0.7F&& ((ItemTeamArmour)stack.getItem()).type.faceArmor!=1)
						overlayTexture = "cheekHelmet";
					else
						overlayTexture = ((ItemTeamArmour)stack.getItem()).type.overlay;
				}
				PacketTeamInfo teamInfo = FlansModClient.teamInfo;

				if(cringeHemorrhaging>1)
				{
					mc.fontRenderer.drawString("ORGAN FAILURE IMMINENT"  , 2, 72, 0xdaa520);
					mc.fontRenderer.drawString("SURGERY NEEDED"  , 2, 82, 0xff0000);
				}

				if(cringeBlood<=95 && cringeBlood>80)
				{
					overlayTexture = "blood1";
					//	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 60));
				}

				if(cringeBlood<=80 && cringeBlood>70)
				{
					overlayTexture = "blood2";
					//	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 60));
				}

				if(cringeBlood<=70 && cringeBlood>60)
				{
					overlayTexture = "blood3";
					//	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 60));
				}

				if(cringeBlood<=60 && cringeBlood>50)
				{
					overlayTexture = "blood4";
					//	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 60));
				}

				if(cringeBlood<=50 && cringeBlood>40)
				{
					overlayTexture = "blood5";
					//	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 60));
				}

				if(cringeBlood<=40 && cringeBlood>30)
				{
					overlayTexture = "blood6";
					//	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 60));
				}
				if(cringeBlood<=30 && cringeBlood>20)
				{
					overlayTexture = "blood7";
					//	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 60));
				}
				if(cringeBlood<=20 && cringeBlood>10)
				{
					overlayTexture = "blood8";
					//	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 60));
				}
				if(cringeBlood<=10)
				{
					overlayTexture = "blood9";
					//	player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 60));
				}
			}


			if(overlayTexture != null)
			{
				FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
				GL11.glEnable(3042 /* GL_BLEND */);
				GL11.glDisable(2929 /* GL_DEPTH_TEST */);
				GL11.glDepthMask(false);
				GL11.glBlendFunc(770, 771);
				GL11.glColor4f(1F, 1F, 1F, 1.0F);
				GL11.glDisable(3008 /* GL_ALPHA_TEST */);

				mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(overlayTexture));

				tessellator.startDrawingQuads();
				tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
				tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
				tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
				tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
				tessellator.draw();
				GL11.glDepthMask(true);
				GL11.glEnable(2929 /* GL_DEPTH_TEST */);
				GL11.glEnable(3008 /* GL_ALPHA_TEST */);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			}
		}

		if(!event.isCancelable() && event.type == ElementType.HOTBAR && FlansMod.bulletGuiEnable)
		{
			//Player ammo overlay
			if(mc.thePlayer != null)
			{

				//bleeding system TM labjac



				if(cringeBlood<100)
					mc.fontRenderer.drawString("Blood: " + cringeBlood  , 172, 30, 0xdaa520);	
				if(cringeHemorrhaging>0)
					mc.fontRenderer.drawString("FATAL BEEDING"  , 172, 42, 0xff0000);



				//	mc.fontRenderer.drawString("bleeding:" + dataServer.minorBleed  , 60, 62, 0xdaa520);	
				//	mc.fontRenderer.drawString("heavy bleed:" + dataServer.Bleed  , 60, 74, 0xdaa520);	
				//	mc.fontRenderer.drawString("hemorhagging:" + dataServer.hemorrhaging  , 60, 86, 0xdaa520);
				//	mc.fontRenderer.drawString("delay:" + dataServer.shootTimeRight  , 60, 98, 0xdaa520);

				ItemStack stack = mc.thePlayer.inventory.getCurrentItem();
				if(stack != null && stack.getItem() instanceof ItemGun)
				{
					ItemGun gunItem = (ItemGun)stack.getItem();
					GunType gunType = gunItem.type;
					int x = 0;
					for(int n = 0; n < gunType.getNumAmmoItemsInGun(stack); n++)
					{
						ItemStack bulletStack = ((ItemGun)stack.getItem()).getBulletItemStack(stack, n);
						if(bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
						{
							RenderHelper.enableGUIStandardItemLighting();
							GL11.glEnable(GL12.GL_RESCALE_NORMAL);
							OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
							drawSlotInventory(mc.fontRenderer, bulletStack, i / 2 + 16 + x, j - 65);
							GL11.glDisable(GL12.GL_RESCALE_NORMAL);
							RenderHelper.disableStandardItemLighting();
							String s = (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
							if(gunType.submode.length >= 2)
							{
								s = s + "[" + gunType.getFireMode(stack) + "]";
							}
							if(bulletStack.getMaxDamage() == 1)
								s = "";
							mc.fontRenderer.drawString(s, i / 2 + 32 + x, j - 59, 0x000000);
							mc.fontRenderer.drawString(s, i / 2 + 33 + x, j - 60, 0xffffff);
							x += 16 + mc.fontRenderer.getStringWidth(s);
						}
					}
					//Render secondary gun

					PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);







					if(gunType.oneHanded && data.offHandGunSlot != 0)
					{
						ItemStack offHandStack = mc.thePlayer.inventory.getStackInSlot(data.offHandGunSlot - 1);
						if(offHandStack != null && offHandStack.getItem() instanceof ItemGun)
						{
							GunType offHandGunType = ((ItemGun)offHandStack.getItem()).type;
							x = 0;
							for(int n = 0; n < offHandGunType.getNumAmmoItemsInGun(offHandStack); n++)
							{
								ItemStack bulletStack = ((ItemGun)offHandStack.getItem()).getBulletItemStack(offHandStack, n);
								if(bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage())
								{
									//Find the string we are displaying next to the ammo item
									String s = (bulletStack.getMaxDamage() - bulletStack.getItemDamage()) + "/" + bulletStack.getMaxDamage();
									if(gunType.submode.length >= 2)
									{
										s = s + "[" + gunType.getFireMode(offHandStack) + "]";
									}
									if(bulletStack.getMaxDamage() == 1)
										s = "";

									//Draw the slot and then move leftwards
									RenderHelper.enableGUIStandardItemLighting();
									GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
									GL11.glEnable(GL12.GL_RESCALE_NORMAL);
									OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
									drawSlotInventory(mc.fontRenderer, bulletStack, i / 2 - 32 - x, j - 65);
									x += 16 + mc.fontRenderer.getStringWidth(s);

									//Draw the string
									GL11.glDisable(GL12.GL_RESCALE_NORMAL);
									RenderHelper.disableStandardItemLighting();
									mc.fontRenderer.drawString(s, i / 2 - 16 - x, j - 59, 0x000000);
									mc.fontRenderer.drawString(s, i / 2 - 17 - x, j - 60, 0xffffff);
								}
							}
						}
					}
				}
			}

			PacketTeamInfo teamInfo = FlansModClient.teamInfo;

			if(teamInfo != null && FlansModClient.minecraft.thePlayer != null && (teamInfo.numTeams > 0 || !teamInfo.sortedByTeam) && teamInfo.getPlayerScoreData(FlansModClient.minecraft.thePlayer.getCommandSenderName()) != null)
			{
				GL11.glEnable(3042 /* GL_BLEND */);
				GL11.glDisable(2929 /* GL_DEPTH_TEST */);
				GL11.glDepthMask(false);
				GL11.glBlendFunc(770, 771);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				GL11.glDisable(3008 /* GL_ALPHA_TEST */);

				mc.renderEngine.bindTexture(GuiTeamScores.texture);

				tessellator.startDrawingQuads();
				tessellator.addVertexWithUV(i / 2 - 43, 35, -90D, 85D / 256D, 35D / 256D);
				tessellator.addVertexWithUV(i / 2 + 43, 35, -90D, 171D / 256D, 35D / 256D);
				tessellator.addVertexWithUV(i / 2 + 43, 0D, -90D, 171D / 256D, 0D / 256D);
				tessellator.addVertexWithUV(i / 2 - 43, 0D, -90D, 85D / 256D, 0D / 256D);
				tessellator.draw();

				//If we are in a two team gametype, draw the team scores at the top of the screen
				if(teamInfo.numTeams == 2 && teamInfo.sortedByTeam)
				{
					//Draw team 1 colour bit
					int colour = teamInfo.teamData[0].team.teamColour;
					GL11.glColor4f(((colour >> 16) & 0xff) / 256F, ((colour >> 8) & 0xff) / 256F, (colour & 0xff) / 256F, 1.0F);
					tessellator.startDrawingQuads();
					tessellator.addVertexWithUV(i / 2 - 43, 27, -90D, 0D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 - 19, 27, -90D, 24D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 - 19, 0D, -90D, 24D / 256D, 98D / 256D);
					tessellator.addVertexWithUV(i / 2 - 43, 0D, -90D, 0D / 256D, 98D / 256D);
					tessellator.draw();
					//Draw team 2 colour bit
					colour = teamInfo.teamData[1].team.teamColour;
					GL11.glColor4f(((colour >> 16) & 0xff) / 256F, ((colour >> 8) & 0xff) / 256F, (colour & 0xff) / 256F, 1.0F);
					tessellator.startDrawingQuads();
					tessellator.addVertexWithUV(i / 2 + 19, 27, -90D, 62D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 + 43, 27, -90D, 86D / 256D, 125D / 256D);
					tessellator.addVertexWithUV(i / 2 + 43, 0D, -90D, 86D / 256D, 98D / 256D);
					tessellator.addVertexWithUV(i / 2 + 19, 0D, -90D, 62D / 256D, 98D / 256D);
					tessellator.draw();

					GL11.glDepthMask(true);
					GL11.glEnable(2929 /* GL_DEPTH_TEST */);
					GL11.glEnable(3008 /* GL_ALPHA_TEST */);
					GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

					//Draw the team scores
					mc.fontRenderer.drawString(teamInfo.teamData[0].score + "", i / 2 - 35, 9, 0x000000);
					mc.fontRenderer.drawString(teamInfo.teamData[0].score + "", i / 2 - 36, 8, 0xffffff);
					mc.fontRenderer.drawString(teamInfo.teamData[1].score + "", i / 2 + 35 - mc.fontRenderer.getStringWidth(teamInfo.teamData[1].score + ""), 9, 0x000000);
					mc.fontRenderer.drawString(teamInfo.teamData[1].score + "", i / 2 + 34 - mc.fontRenderer.getStringWidth(teamInfo.teamData[1].score + ""), 8, 0xffffff);
				}

				mc.fontRenderer.drawString(teamInfo.gametype + "", i / 2 + 48, 9, 0x000000);
				mc.fontRenderer.drawString(teamInfo.gametype + "", i / 2 + 47, 8, 0xffffff);
				mc.fontRenderer.drawString(teamInfo.map + "", i / 2 - 47 - mc.fontRenderer.getStringWidth(teamInfo.map + ""), 9, 0x000000);
				mc.fontRenderer.drawString(teamInfo.map + "", i / 2 - 48 - mc.fontRenderer.getStringWidth(teamInfo.map + ""), 8, 0xffffff);

				int secondsLeft = teamInfo.timeLeft / 20;
				int minutesLeft = secondsLeft / 60;
				secondsLeft = secondsLeft % 60;
				String timeLeft = minutesLeft + ":" + (secondsLeft < 10 ? "0" + secondsLeft : secondsLeft);
				mc.fontRenderer.drawString(timeLeft, i / 2 - mc.fontRenderer.getStringWidth(timeLeft) / 2 - 1, 37, 0x000000);
				mc.fontRenderer.drawString(timeLeft, i / 2 - mc.fontRenderer.getStringWidth(timeLeft) / 2, 38, 0xffffff);


				GL11.glDepthMask(true);
				GL11.glEnable(2929 /* GL_DEPTH_TEST */);
				GL11.glEnable(3008 /* GL_ALPHA_TEST */);
				GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
				//	String playerUsername = FlansModClient.minecraft.thePlayer.getCommandSenderName();

				mc.fontRenderer.drawString(teamInfo.getPlayerScoreData(playerUsername).score + "", i / 2 - 7, 1, 0x000000);
				mc.fontRenderer.drawString(teamInfo.getPlayerScoreData(playerUsername).kills + "", i / 2 - 7, 9, 0x000000);
				mc.fontRenderer.drawString(teamInfo.getPlayerScoreData(playerUsername).deaths + "", i / 2 - 7, 17, 0x000000);
				mc.fontRenderer.drawString(teamInfo.getPlayerScoreData(playerUsername).shekels + "", i / 2 - 7, 25, 0x000000);
			}
			for (KillMessage killMessage : killMessages) {
				mc.fontRenderer.drawString("\u00a7" + killMessage.killerName + "     " + "\u00a7" + killMessage.killedName, i - mc.fontRenderer.getStringWidth(killMessage.killerName + "     " + killMessage.killedName) - 6, j - 32 - killMessage.line * 16, 0xffffff);
			}

			for (KillMessageDumb killMessage : killMessagesDumb) {
				mc.fontRenderer.drawString("\u00a7" + killMessage.killerName + "  somehow  killed  " + "\u00a7" + killMessage.killedName, i - mc.fontRenderer.getStringWidth(killMessage.killerName + "  somehow  killed  " + killMessage.killedName) - 6, j - 32 - killMessage.line * 16, 0xffffff);
			}

			//Draw icons indicated weapons used
			RenderHelper.enableGUIStandardItemLighting();
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			GL11.glEnable(GL12.GL_RESCALE_NORMAL);
			OpenGlHelper.setLightmapTextureCoords(OpenGlHelper.lightmapTexUnit, 240F, 240F);
			for (KillMessage killMessage : killMessages) {
				drawSlotInventory(mc.fontRenderer, new ItemStack(killMessage.weapon.item), i - mc.fontRenderer.getStringWidth("     " + killMessage.killedName) - 12, j - 36 - killMessage.line * 16);
			}
			GL11.glDisable(3042 /*GL_BLEND*/);
			RenderHelper.disableStandardItemLighting();

			//Off-hand weapon graphics
			mc.renderEngine.bindTexture(offHand);

			ItemStack currentStack = mc.thePlayer.inventory.getCurrentItem();
			PlayerData data = PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT);

			if(currentStack != null && currentStack.getItem() instanceof ItemGun && ((ItemGun)currentStack.getItem()).type.oneHanded)
			{
				for(int n = 0; n < 9; n++)
				{
					if(data.offHandGunSlot == n + 1)
					{
						tessellator.startDrawingQuads();
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 3, -90D, 16D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 3, -90D, 32D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 19, -90D, 32D / 64D, 0D / 32D);
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 19, -90D, 16D / 64D, 0D / 32D);
						tessellator.draw();
					}
					else if(data.isValidOffHandWeapon(mc.thePlayer, n + 1))
					{
						tessellator.startDrawingQuads();
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 3, -90D, 0D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 3, -90D, 16D / 64D, 16D / 32D);
						tessellator.addVertexWithUV(i / 2 - 72 + 20 * n, j - 19, -90D, 16D / 64D, 0D / 32D);
						tessellator.addVertexWithUV(i / 2 - 88 + 20 * n, j - 19, -90D, 0D / 64D, 0D / 32D);
						tessellator.draw();
					}
				}
			}


			//RenderHitCrossHair
			//		if(EntityBullet.hitCrossHair)
			//		{
			//			tickcount = 20;
			//			EntityBullet.hitCrossHair = false;
			//		}
			EntityPlayer player = Minecraft.getMinecraft().thePlayer;
			ItemStack currentHeldItem = player.getCurrentEquippedItem();
			//		if(tickcount > 0 && FlansMod.hitCrossHairEnable == true && currentHeldItem != null && currentHeldItem.getItem() instanceof ItemGun)
			//		{
			//			ItemStack stack = mc.thePlayer.inventory.getCurrentItem();
			//			ItemGun gunItem = (ItemGun)stack.getItem();
			//			GunType gunType = gunItem.type;
			//			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			//			GL11.glEnable(3042 /* GL_BLEND */);
			//			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			//			GL11.glDepthMask(false);
			//			GL11.glBlendFunc(770, 771);
			//			GL11.glColor4f(
			//					FlansMod.hitCrossHairColor[1],
			//					FlansMod.hitCrossHairColor[2],
			//					FlansMod.hitCrossHairColor[3],
			//					FlansMod.hitCrossHairColor[0] * (float)tickcount / 20);
			//			GL11.glDisable(3008 /* GL_ALPHA_TEST */);
			//Custom hit marker GUI if set in gun config
			//			if(gunType.hitTexture != null)
			//			{
			//				mc.renderEngine.bindTexture(FlansModResourceHandler.getAuxiliaryTexture(gunType.hitTexture));
			//			}
			//Default hit marker GUI
			//			else if (FlansMod.hdHitCrosshair == true)
			//			{
			//				mc.renderEngine.bindTexture(new ResourceLocation("flansmod", "gui/HDCrossHair.png"));
			//			}
			//			else
			//			{
			//				mc.renderEngine.bindTexture(new ResourceLocation("flansmod", "gui/CrossHair.png"));
			//			}

			//			tessellator.startDrawingQuads();
			//			tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			//			tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
			//			tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			//			tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			//			tessellator.draw();
			//			GL11.glDepthMask(true);
			//			GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			//			GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			//			GL11.glColor4f(1F, 1F, 1F, 1F);
			//		}

			//		if(mc.thePlayer.hurtTime > 0)
			//		{
			//			tickcountWounded = 40;
			//		}
			//		if(tickcountWounded > 0)
			//		{
			//			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			//			GL11.glEnable(3042 /* GL_BLEND */);
			//			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			//			GL11.glDepthMask(false);
			//			GL11.glBlendFunc(770, 771);
			//			GL11.glColor4f(
			//					FlansMod.hitCrossHairColor[1],
			//					FlansMod.hitCrossHairColor[2],
			//					FlansMod.hitCrossHairColor[3],
			//					FlansMod.hitCrossHairColor[0] * (float)tickcountWounded / 20);
			//			GL11.glDisable(3008 /* GL_ALPHA_TEST */);




			//				mc.renderEngine.bindTexture(new ResourceLocation("flansmod", "gui/Blood.png"));

			//				tessellator.startDrawingQuads();
			//				tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			//				tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
			//				tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			//				tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			//				tessellator.draw();
			//				GL11.glDepthMask(true);
			//				GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			//				GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			//				GL11.glColor4f(1F, 1F, 1F, 1F);
			//			}




			//heli gui
			if(mc.thePlayer.ridingEntity instanceof EntitySeat && ((EntitySeat)mc.thePlayer.ridingEntity).seatInfo.heliGuiSeat)
			{

				String gunnerOverlay = ((EntityDriveable)((EntitySeat)mc.thePlayer.ridingEntity).driveable).getDriveableType().heliGUI;
				if(gunnerOverlay != null)
				{
					FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
					GL11.glEnable(3042 /* GL_BLEND */);
					GL11.glDisable(2929 /* GL_DEPTH_TEST */);
					GL11.glDepthMask(false);
					GL11.glBlendFunc(770, 771);
					GL11.glColor4f(1F, 1F, 1F, 1.0F);
					GL11.glDisable(3008 /* GL_ALPHA_TEST */);

					mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(gunnerOverlay));

					tessellator.startDrawingQuads();
					tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
					tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
					tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
					tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
					tessellator.draw();
					GL11.glDepthMask(true);
					GL11.glEnable(2929 /* GL_DEPTH_TEST */);
					GL11.glEnable(3008 /* GL_ALPHA_TEST */);
					GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);

					ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, FMLClientHandler.instance().getClient().entityRenderer, ((EntitySeat)mc.thePlayer.ridingEntity).seatInfo.passengerZoom, "cameraZoom", "af", "field_78503_V");
				}
			}
			else if(mc.thePlayer.ridingEntity instanceof EntitySeat && !((EntitySeat)mc.thePlayer.ridingEntity).seatInfo.heliGuiSeat)
				ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, FMLClientHandler.instance().getClient().entityRenderer, 1, "cameraZoom", "af", "field_78503_V");

			//end heli gui



			//DEBUG vehicles
			if(mc.thePlayer.ridingEntity instanceof EntitySeat)
			{

				EntityDriveable ent = ((EntitySeat)mc.thePlayer.ridingEntity).driveable;
				Vector3f forwards = (Vector3f)ent.axes.getXAxis().normalise();
				//	float speed = (float) (ent.motionX * ent.motionX + ent.motionY * ent.motionY + ent.motionZ * ent.motionZ);
				float speed  =  (float) (forwards.x * (float)ent.motionX)*(forwards.x * (float)ent.motionX) + (forwards.y * (float)ent.motionY)*(forwards.y * (float)ent.motionY) + (forwards.z * (float)ent.motionZ)*(forwards.z * (float)ent.motionZ);

				float advancedSpeed = (float) Math.sqrt(speed);
				float cringedUniversalBuff = 1.0f; //nerfed back to 1.0 because high alt speeds allowed at low alt
				float Mach = 0f; //its called mach but i changed it to mph with a x 767
				int MaxSpeed = 0;





				//smarter mph meter
				if ((float)advancedSpeed*cringedUniversalBuff >=1.05 && (Math.abs(ent.motionX)>0.2 || Math.abs(ent.motionZ)>0.2))
					Mach = 767f*2.05041f*(float)Math.log(advancedSpeed*cringedUniversalBuff);

				else if ((Math.abs(ent.motionX)>0.2 || Math.abs(ent.motionZ)>0.2))
					Mach = (float) (0f + Math.sqrt(speed)*cringedUniversalBuff*74);
				else
					Mach = 0;


				//even smarter
				if(ent instanceof EntityPlane)
				{
					EntityPlane Planerino = (EntityPlane)ent;

					if(Planerino.control != null)
					{
						Mach = (float) (Planerino.control.V*2.23694);

						MaxSpeed = (int)Planerino.getPlaneType().maxSpeed;


						//overload
						if(Planerino.control.Gfactor > 4 && Planerino.control.Gfactor <6)
							mc.fontRenderer.drawString(String.format("OVERLOAD %.0f", Planerino.control.Gfactor) + "G", 198, 72, 0xB53333);
						else if(Planerino.control.Gfactor >= 6 )
							mc.fontRenderer.drawString(String.format("EXTREME OVERLOAD %.0f", Planerino.control.Gfactor) + "G", 182, 72, 0xFF0000);
					}
					else
						MaxSpeed = 0;

				}


				int healthP = (int)((float)ent.getDriveableData().parts.get(EnumDriveablePart.core).health / (float)ent.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth * 100);
				int colour = 0;
				if(healthP > 75){
					colour = 0xffffff;
				} else if (healthP < 75 && healthP > 50){
					colour = 0x00ff00;
				} else if (healthP < 50 && healthP > 25){
					colour = 0xdaa520;
				} else {
					colour = 0xff0000;
				}

				float fakeThrottle = (float) ent.throttle;


				//while afterburning, throttle will change color epic style
				int colourThrottle = 0;
				if(ent.throttle < 0.5 && ent.afterBurning){
					colourThrottle = 0xffffff;
				} else if (ent.throttle < 0.7 && ent.throttle > 0.5 && ent.afterBurning){
					colourThrottle = 0x00ff00;
				} else if (ent.throttle < 0.9 && ent.throttle > 0.7 && ent.afterBurning){
					colourThrottle = 0xdaa520;
				} else if (ent.throttle > 0.9 && ent.afterBurning){
					colourThrottle = 0xff0000;	
				} else {
					colourThrottle = 0xffffff;
				}

				if(Math.abs(ent.throttle) > 0.5)
					fakeThrottle = ent.throttle*1.075f;
				//limiters
				if(fakeThrottle > 1)
					fakeThrottle = 1;
				if(fakeThrottle < -1)
					fakeThrottle = -1;



				if(!(ent instanceof EntityMecha) && !ent.aiming)
				{
					if(!(ent instanceof EntityPlane))
						mc.fontRenderer.drawString(String.format("Throttle : %.0f%%", fakeThrottle*100), 2, 2, colourThrottle);
					else if((ent instanceof EntityPlane) )
					{
						EntityPlane Plane = (EntityPlane) ent;
						if(Plane.driveableData.landBrake>5 && !Plane.varFlap)
							mc.fontRenderer.drawString("Throttle : BRK", 2, 2, colourThrottle);
						if((Mach>0.1 || Mach<-0.1) && MaxSpeed < 1)
							mc.fontRenderer.drawString(String.format("Speed : %.0f", Mach) + "mph", 2, 22, 0xffffff);
						else if((Mach>0.1 || Mach<-0.1) && MaxSpeed >= 1 && Mach <= MaxSpeed)
							mc.fontRenderer.drawString(String.format("Speed : %.0f", Mach) + "mph / " + MaxSpeed +"mph", 2, 22, 0xffffff);
						else if((Mach>0.1 || Mach<-0.1) && MaxSpeed >= 1 && Mach > MaxSpeed)
							mc.fontRenderer.drawString(String.format("Speed : %.0f", Mach) + "mph / " + MaxSpeed +"mph", 2, 22, 0xFF0000);
						if((float)Mach/767f > 1)
							mc.fontRenderer.drawString(String.format("Mach %.1f", (float)Mach/767f), 2, 32, 0xffffff);
						else if(Plane.driveableData.landBrake>5 && Plane.varFlap)
							mc.fontRenderer.drawString("Throttle : BRK - flaps", 2, 2, colourThrottle);
						else if(Plane.varFlap)
							mc.fontRenderer.drawString(String.format("Throttle : %.0f%% - flaps", fakeThrottle*100), 2, 2, colourThrottle);
						else
							mc.fontRenderer.drawString(String.format("Throttle : %.0f%%", fakeThrottle*100), 2, 2, colourThrottle);



						if (Plane.driveableData.carrierTip>0 && !ent.mounted)
							mc.fontRenderer.drawString("Press "+ Keyboard.getKeyName(KeyInputHandler.bombKey.getKeyCode())+ " to dock", 172, 62, 0x00ff00);
					}
				}
				if(ent instanceof EntityMecha && ent.getDriveableData().panicTimer<=0 && ent.getDriveableData().morale>1)
				{
					mc.fontRenderer.drawString("Morale : " + (ent.getDriveableData().morale), 2, 2, 0xffffff);

				}
				if(ent instanceof EntityMecha && ent.getDriveableData().panicTimer>0)
					mc.fontRenderer.drawString(String.format("CONTROL LOST"), 2, 2, 0xff0000);
				//				mc.fontRenderer.drawString("Throttle : " + ent.throttle, 2, 2, 0xffffff);
				//mc.fontRenderer.drawString("Health : " + ent.getDriveableData().parts.get(EnumDriveablePart.core).health+ " / " +ent.getDriveableData().parts.get(EnumDriveablePart.core).maxHealth, 2, 12, 0xffffff);
				if(!ent.epicShip && !ent.aiming)
				{
					mc.fontRenderer.drawString("Health : " + healthP + "%" , 2, 12, colour);




					//debug speed 	mc.fontRenderer.drawString("Speed " + Math.sqrt(speed), 2, 32, 0xffffff);
				}

				if(Keyboard.isKeyDown(Minecraft.getMinecraft().gameSettings.keyBindSneak.getKeyCode()))
				{
					mc.fontRenderer.drawString(String.format("EXITING VEHICLE"), 2, 56, 0xffffff);
				}

				if(ent.epicShip)
				{
					int healthB = (int)((float)ent.getDriveableData().parts.get(EnumDriveablePart.buoyancy).health / (float)ent.getDriveableData().parts.get(EnumDriveablePart.buoyancy).maxHealth * 100);
					float notFlooding = 100 * ((EntityVehicle)ent).getDriveableData().notFlooding / (((EntityVehicle)ent).getDriveableData().notFloodingMax + 0.1f);
					int color = 0;
					if(notFlooding > 75){
						color = 0xffffff;
					} else if (notFlooding < 75 && notFlooding > 50){
						color = 0x00ff00;
					} else if (notFlooding < 50 && notFlooding > 25){
						color = 0xdaa520;
					} else {
						color = 0xff0000;
					}

					int kostaColor = 0;
					if(notFlooding > 75){
						kostaColor = 0xffffff;
					} else if (healthB < 75 && healthB > 50){
						kostaColor = 0x00ff00;
					} else if (healthB < 50 && healthB > 25){
						kostaColor = 0xdaa520;
					} else {
						kostaColor = 0xff0000;
					}
					mc.fontRenderer.drawString("Crew : " + ((EntityVehicle)ent).getDriveableData().totalCrew + "/" + ((EntityVehicle)ent).getDriveableData().maximumCrew , 2, 12, 0xffffff);
					if(notFlooding==100)
						mc.fontRenderer.drawString(String.format("Flooding : None"), 2, 22, 0xffffff);
					if(notFlooding<=99 && notFlooding>75)
						mc.fontRenderer.drawString(String.format("Flooding : Minor"), 2, 22, 0x00ff00);
					if(notFlooding<=75 && notFlooding>40)
						mc.fontRenderer.drawString(String.format("Flooding : Heavy"), 2, 22, 0x00ff00);
					if(notFlooding<=40 && notFlooding>10)
						mc.fontRenderer.drawString(String.format("Flooding : Severe"), 2, 22, 0xff0000);
					if(notFlooding<=10)
						mc.fontRenderer.drawString(String.format("Abandon Ship"), 2, 22, 0xff0000);
					//mc.fontRenderer.drawString(String.format("Flooding : %.2f", Math.sqrt(speed)), 2, 22, 0xffffff);
					//mc.fontRenderer.drawString(String.format("floodratio : " + (notFlooding)), 2, 62, 0xffffff);
					//mc.fontRenderer.drawString(String.format("floodmax : " + (((EntityVehicle)ent).getDriveableData().notFloodingMax)), 2, 52, 0xffffff);
					//mc.fontRenderer.drawString(String.format("flood : " + (((EntityVehicle)ent).getDriveableData().notFlooding)), 2, 62, 0xffffff);
					mc.fontRenderer.drawString(String.format("Buoyancy : " + (ent.getDriveableData().parts.get(EnumDriveablePart.buoyancy).health)), 2, 32, kostaColor);
				}



				if(!(ent instanceof EntityPlane))
				{


					if (!ent.aiming) // dont show random info while aiming
					{
						mc.fontRenderer.drawString(String.format("Gun Pitch : %.0f%%", ((EntitySeat)mc.thePlayer.ridingEntity).looking.getPitch() * (-1f)), 172, 12, 0xffffff);
						mc.fontRenderer.drawString(String.format("Yaw : %.0f%%", ((EntitySeat)mc.thePlayer.ridingEntity).looking.getYaw()), 172, 2, 0xffffff);
					}

					{
						float tankYaw = ((EntitySeat)mc.thePlayer.ridingEntity).looking.getYaw();
						String tankBarrelerino = "gui/tankerino.png";

						if ( (tankYaw<23 && tankYaw>=-22))
						{
							tankBarrelerino = "gui/0.png";
						}
						else if ( (tankYaw<68 && tankYaw>=23) )
						{
							tankBarrelerino = "gui/45.png";
						}
						else if ( (tankYaw<113 && tankYaw>=68) )
						{
							tankBarrelerino = "gui/90.png";
						}
						else if ( (tankYaw<158 && tankYaw>=113) )
						{
							tankBarrelerino = "gui/135.png";
						}
						else if ( (tankYaw<203 && tankYaw>=158) || (tankYaw> -180 && tankYaw< -158))
						{
							tankBarrelerino = "gui/180.png";
						}
						else if ( (tankYaw<-113 && tankYaw>=-158) )
						{
							tankBarrelerino = "gui/225.png";
						}
						else if ( (tankYaw<-68 && tankYaw>=-113) )
						{
							tankBarrelerino = "gui/270.png";
						}
						else if ( (tankYaw<-23 && tankYaw>=-68) )
						{
							tankBarrelerino = "gui/315.png";
						}
						else
							tankBarrelerino = "gui/0.png";



						//only show indicator if we say so
						if (ent.getDriveableType().showTurretIndicator)
						{
							FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
							GL11.glEnable(3042 /* GL_BLEND */);
							GL11.glDisable(2929 /* GL_DEPTH_TEST */);
							GL11.glDepthMask(false);
							GL11.glBlendFunc(770, 771);
							GL11.glColor4f(1F, 1F, 1F, 1.0F);
							GL11.glDisable(3008 /* GL_ALPHA_TEST */);

							mc.renderEngine.bindTexture(new ResourceLocation("flansmod", tankBarrelerino));

							tessellator.startDrawingQuads();
							tessellator.addVertexWithUV(i / 1.35 - 0.05 * j, 1.07*j, -90D, 0.0D, 1.0D);
							//bottom left?

							tessellator.addVertexWithUV(i / 2.3 + 1.0 * j, 1.07*j, -90D, 1.0D, 1.0D);
							//bottom right

							tessellator.addVertexWithUV(i / 2.3 + 1.0 * j, 0.7*j, -90D, 1.0D, 0.0D);
							//top right


							tessellator.addVertexWithUV(i / 1.35 - 0.05 * j, 0.7*j, -90D, 0.0D, 0.0D);
							//top left?

							tessellator.draw();
							GL11.glDepthMask(true);
							GL11.glEnable(2929 /* GL_DEPTH_TEST */);
							GL11.glEnable(3008 /* GL_ALPHA_TEST */);
							GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
						}

					}



					//where artillery was for vehicle driver only

					//workspace for artillery aiming
					if(ent.getDriveableType().gunRange || ((EntitySeat)mc.thePlayer.ridingEntity).calculator || ent.getDriveableType().walterMortar|| ent.getDriveableType().walterGunRange || ((EntitySeat)mc.thePlayer.ridingEntity).walterCalculator)
					{
						float pitch = -1f*((EntitySeat)mc.thePlayer.ridingEntity).looking.getPitch();


						float bulletSpeed = ent.getDriveableType().bulletSpeed;


						//pasenger gun speed checker
						if(mc.thePlayer.ridingEntity instanceof EntitySeat && ((EntitySeat)mc.thePlayer.ridingEntity).seatInfo.gunType != null)
							bulletSpeed = ((EntitySeat)mc.thePlayer.ridingEntity).seatInfo.gunType.bulletSpeed;


						//variable calculator overall
						float A = (-0.0200431f)*(bulletSpeed*bulletSpeed) + (-0.0190021f)*(bulletSpeed) + 0.0121473f;
						float B = (1.80951f)*(bulletSpeed*bulletSpeed) + (1.28548f)*(bulletSpeed) - 0.717027f;
						float C = (-1.71186f)*(bulletSpeed*bulletSpeed) + (28.3149f)*(bulletSpeed) - 17.7582f;

						//variable calculator fieldgun
						float Af = (-0.0154103f)*(bulletSpeed*bulletSpeed) + (-0.0536423f)*(bulletSpeed) + 0.0672506f;
						float Bf = (1.62975f)*(bulletSpeed*bulletSpeed) + (2.87832f)*(bulletSpeed) - 3.14029f;
						float Cf = (0.155543f)*(bulletSpeed*bulletSpeed) + (10.6558f)*(bulletSpeed) - 3.87799f;

						//variable calculator mortar
						float Am = (-0.025129f)*(bulletSpeed*bulletSpeed) + (0.0681265f)*(bulletSpeed) - 0.105299f;
						float Bm = (2.58971f)*(bulletSpeed*bulletSpeed) + (-11.2084f)*(bulletSpeed) + 16.2033f;
						float Cm = (-609.734f)*(bulletSpeed*bulletSpeed) + (460.235f)*(bulletSpeed) - 609.734f;

						//walter formula
						float WalterRange = -0.3228f * (pitch*pitch) + 29.3893f * (pitch) - 76.1646f;

						//walter mortar
						if(ent.getDriveableType().walterMortar)
							WalterRange = -0.1035f * (pitch*pitch) + 8.6336f * (pitch) + 53.001f;

						//float estimatedRange = (-0.106561f)*(pitch*pitch) + (9.12987f)*(pitch) + 31.2864f;
						float estimatedRange = (A)*(pitch*pitch) + (B)*(pitch) + C;

						//mortar calculator cringed broke ree
						float mortarRange = (Am)*(pitch*pitch) + (Bm)*(pitch) + Cm;

						//fieldgun calculator
						float fieldgunRange = (Af)*(pitch*pitch) + (Bf)*(pitch) + Cf;

						float displayRange = 69f;



						//as degree goes to 20, fieldgun goes to 0, general estimator goes to 1
						if(pitch>=0f && pitch < 20)
							displayRange =  fieldgunRange*( (20f - pitch )/20f ) + ( estimatedRange* ( pitch/20f ) );

						//at middle angles, just use the general calculator
						if(pitch>=20f && pitch < 90)
							displayRange = estimatedRange;

						//ree		if(ent.getDriveableType().walterGunRange || ((EntitySeat)mc.thePlayer.ridingEntity).walterCalculator)
						displayRange = WalterRange;

						/*
				//at high angles, phase into mortar formula
				if(pitch>=55f && pitch < 70)
					displayRange = ( estimatedRange*( (15f - (pitch - 55f)) /15f) ) + ( mortarRange* ( (pitch - 55f)/15f ) );

				if(pitch>=70f && pitch<90)
					displayRange = mortarRange;
						 */


						if (pitch > 0)
							mc.fontRenderer.drawString(String.format("Estimated Gun Range : %.0f",  displayRange), 172, 62, 0xffffff);
						if (displayRange > 350)
							mc.fontRenderer.drawString(String.format("Warning: Bullet May Freeze Outside of Render Range"), 172, 72, 0xff0000);

						//mc.fontRenderer.drawString(String.format("mortar : %.0f",  mortarRange), 122, 42, 0xffffff);

						//mc.fontRenderer.drawString(String.format("field : %.0f",  fieldgunRange), 122, 52, 0xffffff);

						//mc.fontRenderer.drawString(String.format("display : %.0f",  displayRange), 122, 62, 0xffffff);
						if( pitch<15f)
							mc.fontRenderer.drawString(String.format("Warning: Predicion Less Accurate at Low Angles"), 172, 82, 0xdaa520);



					}


				}

				if(ent instanceof EntityPlane)
				{
					EntityDriveable entP = (EntityDriveable)ent;
					if(entP.getDriveableType().hasFlare)
					{
						if(entP.ticksFlareUsing <= 0 && entP.flareDelay <= 0)
							mc.fontRenderer.drawString("Flare : READY"  , 2, 42, 0x00ff00);

						if(entP.ticksFlareUsing > 0)
							mc.fontRenderer.drawString("Flare : Deploying"  , 2, 52, 0xff0000);

						if(entP.flareDelay > 0)
							mc.fontRenderer.drawString("Flare : Reloading"  , 2, 62, 0xdaa520);
					}
					Vector3f up2 = (Vector3f)entP.axes.getYAxis().normalise();

					mc.fontRenderer.drawString(String.format("Plane Pitch : %.1f",  -1f*(float)entP.axes.getPitch()) + "°", 172, 22, 0xffffff);
					mc.fontRenderer.drawString(String.format("Plane Roll : %.1f", + -1f*(float)entP.axes.getRoll()) + "°", 172, 12, 0xffffff);
					if ((float)entP.axes.getYaw() < 22.5 && (float)entP.axes.getYaw() >= -22.5)
						mc.fontRenderer.drawString("Compass : East"  , 172, 2, 0xffffff);

					if ((float)entP.axes.getYaw() < 67.5 && (float)entP.axes.getYaw() >= 22.5)
						mc.fontRenderer.drawString("Compass: South-East"  , 172, 2, 0xffffff);

					if ((float)entP.axes.getYaw() >= 67.5 && (float)entP.axes.getYaw() < 112.5)
						mc.fontRenderer.drawString("Compass : South"  , 172, 2, 0xffffff);

					if ((float)entP.axes.getYaw() >= 112.5 && (float)entP.axes.getYaw() < 157.5)
						mc.fontRenderer.drawString("Compass : South-West"  , 172, 2, 0xffffff);

					if ((float)entP.axes.getYaw() < -157.5 || (float)entP.axes.getYaw() >= 157.5)
						mc.fontRenderer.drawString("Compass : West"  , 172, 2, 0xffffff);

					if ((float)entP.axes.getYaw() < -112.5 && (float)entP.axes.getYaw() >= -157.5)
						mc.fontRenderer.drawString("Compass: North-West"  , 172, 2, 0xffffff);

					if ((float)entP.axes.getYaw() > -112.5 && (float)entP.axes.getYaw() <= -67.5)
						mc.fontRenderer.drawString("Compass : North"  , 172, 2, 0xffffff);

					if ((float)entP.axes.getYaw() > -67.5 && (float)entP.axes.getYaw() <= -22.5)
						mc.fontRenderer.drawString("Compass : North-East"  , 172, 2, 0xffffff);

					//mc.fontRenderer.drawString(String.format("Altitude : %.0f%" + ((EntitySeat)mc.thePlayer.ridingEntity).posY), 122, 32, 0xffffff);
					int ceiling = 0;
					EntityPlane entPl = (EntityPlane)entP;

					//mc.fontRenderer.drawString(String.format("Altitude : %.0f" , ((EntitySeat)mc.thePlayer.ridingEntity).posY) + " Meters", 172, 32, 0xffffff);
					mc.fontRenderer.drawString(String.format("Altitude : %.0f" , ((EntitySeat)mc.thePlayer.ridingEntity).posY) + "m / " + entPl.getPlaneType().ceiling + "m", 172, 32, 0xffffff);

					if (entP.getDriveableType().rocketThrottle)
						mc.fontRenderer.drawString("Fuel : "+   entP.fuelTimer, 172, 42, 0xffffff);

					if (entP.getDriveableType().labjacFuel>10)
						mc.fontRenderer.drawString(String.format("Fuel : %.2f",   (float)entP.labjacFuel/12000) + " Minutes" , 288, 2, 0xffffff);
					//debug energy mc.fontRenderer.drawString(String.format("Energy : " + (float)entP.energy), 122, 72, 0xffffff);

					if (entP.mounted)
						mc.fontRenderer.drawString("Press "+ Keyboard.getKeyName(KeyInputHandler.gunKey.getKeyCode())+ " to undock", 172, 62, 0xff0000);




					//literal copy paste from tanks so plane can engine repair
					if( !entP.getDriveableType().epicShip)
					{
						if(entP.ticksRepairing <= 0 && entP.flareDelay <= 0 && ent.throttle < 0.01 && ent.throttle > -0.01   && !entP.worldObj.isAirBlock((int)entP.posX, (int)(entP.posY-5), (int)entP.posZ))
							mc.fontRenderer.drawString("Repair Ready - Press " + Keyboard.getKeyName(KeyInputHandler.repairKey.getKeyCode())  , 288, 12, 0x00ff00);

						if(entP.ticksRepairing <= 0 && entP.flareDelay <= 0 && ent.throttle > 0.01 || entP.ticksRepairing <= 0  && ent.throttle < -0.01)
						{
							mc.fontRenderer.drawString("You must land to repair"  , 288, 12, 0xdaa520);
						}
					}

					if(entP.ticksRepairing>0)
					{
						mc.fontRenderer.drawString("Repairing ticks: "  + entP.ticksRepairing, 288, 12, 0x00ff00);
					}

					//plane port
					if(entP.currentAmmo != null && !entP.currentAmmo.isEmpty())
					{
						mc.fontRenderer.drawString("Current Ammo ", 172, 52, 0xffffff); //display name of loaded ammo
						mc.fontRenderer.drawString(entP.currentAmmo, 172, 62, 0x24FF62);
					}
					if (entP.getDriveableType().hasPlaneRadar && entP.activeRadar)
						mc.fontRenderer.drawString("Radar Mode: ACTIVE", 288, 22, 0x24FF62);
					if (entP.getDriveableType().hasPlaneRadar && !entP.activeRadar)
						mc.fontRenderer.drawString("Radar Mode: PASSIVE", 288, 22, 0xDB2C00);
					if (entP.getDriveableType().hasPlaneRadar )
						mc.fontRenderer.drawString("Press " + Keyboard.getKeyName(KeyInputHandler.activeRadar.getKeyCode()) + " to toggle", 288, 32, 0xFF9024);

					//for debug purpose to see energy
					//	mc.fontRenderer.drawString("energy : " +  entP.energy + " allah", 122, 62, 0xffffff);

				}

				if(ent instanceof EntityMecha)
				{
					DriveableData datavehicle = ((EntityMecha)ent).getDriveableData();
					EntityDriveable entP = (EntityDriveable)ent;
					if(entP.getDriveableType().hasFlare)
					{
						if(entP.ticksFlareUsing <= 0 && entP.flareDelay <= 0 && ent.getDriveableData().panicTimer<=0)
							mc.fontRenderer.drawString("Trample : READY"  , 2, 32, 0x00ff00);

						if(entP.ticksFlareUsing > 0 && ent.getDriveableData().panicTimer<=0)
							mc.fontRenderer.drawString("Trampling"  , 2, 32, 0xff0000);

						if(entP.flareDelay > 0 && entP.ticksFlareUsing <= 0 && ent.getDriveableData().panicTimer<=0)
							mc.fontRenderer.drawString("Trample : Exhausted"  , 2, 32, 0xdaa520);
					}

					EntityMecha mecha = (EntityMecha)ent;
					//	mc.fontRenderer.drawString("secret throttle : " + mecha.poopooThrottle, 2, 42, 0xffffff);
				}

				if(ent instanceof EntityVehicle)
				{
					DriveableData datavehicle = ((EntityVehicle)ent).getDriveableData();
					EntityDriveable entP = (EntityDriveable)ent;
					if(entP.getDriveableType().hasFlare && !entP.getDriveableType().epicShip)
					{
						if(entP.ticksFlareUsing <= 0 && entP.flareDelay <= 0)
							mc.fontRenderer.drawString("Smoke : READY"  , 2, 62, 0x00ff00);

						if(entP.ticksFlareUsing > 0)
							mc.fontRenderer.drawString("Smoke : Deploying"  , 2, 62, 0xff0000);

						if(entP.flareDelay > 0)
							mc.fontRenderer.drawString("Smoke : Reloading"  , 2, 72, 0xdaa520);
					}

					if(((EntityVehicle) entP).getVehicleType().canRepair && !entP.getDriveableType().epicShip)
					{
						if(entP.ticksRepairing <= 0 && entP.flareDelay <= 0 && ent.throttle < 0.01 && ent.throttle > -0.01)
							mc.fontRenderer.drawString("Repair Ready - Press " + Keyboard.getKeyName(KeyInputHandler.repairKey.getKeyCode())  , 2, 42, 0x00ff00);

						if(entP.ticksRepairing <= 0 && entP.flareDelay <= 0 && ent.throttle > 0.01 || entP.ticksRepairing <= 0  && ent.throttle < -0.01)
						{
							mc.fontRenderer.drawString("You must be at"  , 2, 36, 0xdaa520);
							mc.fontRenderer.drawString("0 throttle to repair!"  , 2, 46, 0xdaa520);
						}
					}

					//radar
					if (entP.getDriveableType().hasRadar && entP.activeRadar)
						mc.fontRenderer.drawString("Radar Mode: ACTIVE", 292, 2, 0x24FF62);
					if (entP.getDriveableType().hasRadar && !entP.activeRadar)
						mc.fontRenderer.drawString("Radar Mode: PASSIVE", 292, 2, 0xDB2C00);
					if (entP.getDriveableType().hasRadar )
						mc.fontRenderer.drawString("Press " + Keyboard.getKeyName(KeyInputHandler.activeRadar.getKeyCode()) + " to toggle", 292, 12, 0xFF9024);

					//recoil display world
					if (entP.getDriveableType().shootDelayPrimary > 30)
					{
						if(entP.ticksRepairing>0)
						{
							mc.fontRenderer.drawString("Repairing ticks: "  + entP.ticksRepairing, 2, 42, 0x00ff00);
						}

						if(entP.recoilTimer > 1 )
						{
							mc.fontRenderer.drawString(String.format("Reload Time: %.1f", ((float)entP.recoilTimer/20f)) + " seconds", 172, 22, 0xff0000);
						}
						else if(entP.recoilTimer <= 0)
						{
							mc.fontRenderer.drawString("Shell : Ready", 172, 22, 0x00ff00);
						}
					}
					//end of recoil world


					//System.out.println("bullet: " + entP.currentAmmo);
					//System.out.println("bullet valid? " + shell != null && shell.getItem() instanceof ItemBullet && entP.getDriveableType().ammo.contains(((ItemBullet)shell.getItem()).type));
					if(entP.currentAmmo != null && !entP.currentAmmo.equals(""))
					{
						mc.fontRenderer.drawString("Current Ammo ", 172, 32, 0xffffff); //display name of loaded ammo
						mc.fontRenderer.drawString(entP.currentAmmo, 172, 42, 0x24FF62);
					}




					if(entP.getDriveableType().hasFlare && entP.getDriveableType().epicShip)
					{
						if(entP.ticksFlareUsing <= 0 && entP.flareDelay <= 0 && ent.throttle < 0.01 && ent.throttle > -0.01)
							mc.fontRenderer.drawString("Damage Control : READY"  , 2, 42, 0x00ff00);

						if(entP.ticksFlareUsing <= 0 && entP.flareDelay <= 0 && ent.throttle > 0.01 || entP.ticksFlareUsing <= 0 && entP.flareDelay <= 0 && ent.throttle < -0.01)
						{
							mc.fontRenderer.drawString("You must be at 0 throttle to Repair!"  , 2, 42, 0xdaa520);
							//mc.fontRenderer.drawString("0 throttle to repair!"  , 2, 52, 0xdaa520);
						}

						if(entP.ticksFlareUsing > 0)
							mc.fontRenderer.drawString("Damage Control : Repairing"  , 2, 42, 0xff0000);

						if(entP.flareDelay > 0 && entP.ticksFlareUsing <= 0)
							mc.fontRenderer.drawString("Damage Control : Resting"  , 2, 42, 0xdaa520);
					}

					if(entP.getDriveableType().hasAPS)
					{
						if(entP.APSdelay <= 5)
							mc.fontRenderer.drawString("APS : READY"  , 2, 52, 0x00ff00);


						if(entP.APSdelay > 5)
							mc.fontRenderer.drawString("APS : Reloading"  , 2, 52, 0xdaa520);
					}


					DriveableType allah = ((EntityVehicle)ent).getVehicleType();


					//labjac scope
					if(mc.thePlayer != null)
					{
						ItemStack stack = mc.thePlayer.inventory.armorInventory[3];
						String overlayTexture = null;
						if(allah.hasScope&&ent.aiming)
						{
							overlayTexture = allah.overlay;
							ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, FMLClientHandler.instance().getClient().entityRenderer, allah.gunsightZoom, "cameraZoom", "af", "field_78503_V");
							//moved night scope to entitydriveable
						}
						if(allah.hasScope&&(ent.aiming==false))
						{
							overlayTexture = null;
							ObfuscationReflectionHelper.setPrivateValue(EntityRenderer.class, FMLClientHandler.instance().getClient().entityRenderer, 1, "cameraZoom", "af", "field_78503_V");
						}



						if(overlayTexture != null)
						{
							FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
							GL11.glEnable(3042 /* GL_BLEND */);
							GL11.glDisable(2929 /* GL_DEPTH_TEST */);
							GL11.glDepthMask(false);
							GL11.glBlendFunc(770, 771);
							GL11.glColor4f(1F, 1F, 1F, 1.0F);
							GL11.glDisable(3008 /* GL_ALPHA_TEST */);

							mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(overlayTexture));

							tessellator.startDrawingQuads();
							tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
							tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
							tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
							tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
							tessellator.draw();
							GL11.glDepthMask(true);
							GL11.glEnable(2929 /* GL_DEPTH_TEST */);
							GL11.glEnable(3008 /* GL_ALPHA_TEST */);
							GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
						}

					}


					//end scopes
					if(((EntityVehicle)ent).getVehicleType().airship)
						mc.fontRenderer.drawString(String.format("Diving Throttle : %.0f%%", ent.divingFactor*100), 172, 32, 0xffffff);



					if(((EntityVehicle)ent).getVehicleType().canDive)
					{

						mc.fontRenderer.drawString(String.format("Diving Throttle : %.0f%%", ent.divingFactor*100), 172, 52, 0xffffff);

						if(((EntityVehicle)entP).getVehicleType().unlimitedOxygen==false)
							mc.fontRenderer.drawString("Oxygen (Seconds) : " + ent.oxygenMeter/160f  , 172, 62, colour);
						if(((EntityVehicle)entP).getVehicleType().unlimitedOxygen==true)
							mc.fontRenderer.drawString("Unlimited Oxygen", 172, 62, colour);


						int poopooDepth =  (int) (TeamsManager.seaLevel-entP.posY);

						if(poopooDepth>0)
						{
							mc.fontRenderer.drawString("Depth : " + poopooDepth  , 2, 72, colour);

							if(poopooDepth / (float)allah.maxDepth > 0.7)
								mc.fontRenderer.drawString("WARNING : Aproaching Max Depth"  , 172, 82, 0xdaa520);

							if(poopooDepth / (float)allah.maxDepth > 0.9)
								mc.fontRenderer.drawString("DANGER : COLLAPSE IMMINENT"  , 172, 92, 0xff0000);
						}

						//mc.fontRenderer.drawString("Depth : " + datavehicle.depth  , 2, 52, colour);

						//if((float)datavehicle.depth / -(float)allah.maxDepth > 0.7)
						//	mc.fontRenderer.drawString("WARNING : Aproaching Max Depth"  , 2, 62, 0xdaa520);

						//if((float)datavehicle.depth / -(float)allah.maxDepth > 0.9)
						//	mc.fontRenderer.drawString("DANGER : COLLAPSE IMMINENT"  , 2, 72, 0xff0000);


					}

					if(((EntityVehicle)ent).getDriveableType().showReload)
					{


						if(datavehicle.fakeReloadShell > 40)
							mc.fontRenderer.drawString("First Shot Delay (Seconds) : " + (datavehicle.fakeReloadShell-20)/20  , 2, 62, 0xdaa520);
						if(datavehicle.fakeReloadMissile > 40)
							mc.fontRenderer.drawString("First Shot Delay (Seconds) : " + (datavehicle.fakeReloadMissile-20)/20  , 2, 72, 0xdaa520);

					}



					if(((EntityVehicle)ent).getVehicleType().shootWithOpenDoor)
					{
						if(((EntityVehicle)ent).varDoor){
							mc.fontRenderer.drawString("Weapon : READY"  , 2, 62, 0x00ff00);
							mc.fontRenderer.drawString("["+ Keyboard.getKeyName(KeyInputHandler.doorKey.getKeyCode())+ " to disable]", 100, 62, 0x00ff00);
						}

						if(!((EntityVehicle)ent).varDoor){
							mc.fontRenderer.drawString("Weapon : DISABLED"  , 2, 62, 0xff0000);
							mc.fontRenderer.drawString("["+ Keyboard.getKeyName(KeyInputHandler.doorKey.getKeyCode())+ " to activate]", 100, 62, 0xff0000);
						}
					}
				}

				if(FlansMod.DEBUG && !ent.epicShip)
				{
					mc.fontRenderer.drawString("MotionX : " + ent.motionX, 2, 32, 0xffffff);
					mc.fontRenderer.drawString("MotionY : " + ent.motionY, 2, 42, 0xffffff);
					mc.fontRenderer.drawString("MotionZ : " + ent.motionZ, 2, 52, 0xffffff);
					mc.fontRenderer.drawString("Break Blocks : " + TeamsManager.driveablesBreakBlocks, 2, 62, 0xffffff);
				}
			}
		}
	}

	@SubscribeEvent
	public void renderTick(TickEvent.RenderTickEvent event)
	{
		switch(event.phase)
		{
		case START :
			RenderGun.smoothing = event.renderTickTime;
			renderTickStart(Minecraft.getMinecraft(), event.renderTickTime);
			break;
		case END :
			renderTickEnd(Minecraft.getMinecraft());
			break;
		}
	}

	@SubscribeEvent
	public void clientTick(TickEvent.ClientTickEvent event)
	{
		switch(event.phase)
		{
		case START :
			clientTickStart(Minecraft.getMinecraft());
			break;
		case END :
			clientTickEnd(Minecraft.getMinecraft());
			break;
		}
	}

	/** Handle flashlight block light override */
	public void clientTickStart(Minecraft mc)
	{


		//bob vaccine

		if(Minecraft.getMinecraft() != null && Minecraft.getMinecraft().thePlayer != null)
		{
			// System.out.println("poo poo pee pee");
			Entity ridden = Minecraft.getMinecraft().thePlayer.ridingEntity;

			//  if(FlansMod.lastMount != null && ridden == null) 	 
			if(lastMount != null && ridden == null)
			{
				//	System.out.println("tick handler tried to send packet");
				FlansMod.getPacketHandler().sendToServer(new PacketChecker());
			}

			lastMount = ridden;
			if(ridden != null)
				FlansMod.lastRidden = ridden;
		}





		if(tickcount > 0)
		{
			tickcount--;
		}
		if(tickcountWounded > 0)
		{
			tickcountWounded--;
		}
		if(FlansMod.ticker % lightOverrideRefreshRate == 0 && mc.theWorld != null)
		{
			//Check graphics setting and adjust refresh rate
			lightOverrideRefreshRate = mc.gameSettings.fancyGraphics ? 10 : 20;

			//Reset old light values
			for(Vector3i v : blockLightOverrides)
			{
				mc.theWorld.updateLightByType(EnumSkyBlock.Block, v.x, v.y, v.z);
			}
			//Clear the list
			blockLightOverrides.clear();

			//Find all flashlights
			for(Object obj : mc.theWorld.playerEntities)
			{
				EntityPlayer player = (EntityPlayer)obj;
				ItemStack currentHeldItem = player.getCurrentEquippedItem();
				if(currentHeldItem != null && currentHeldItem.getItem() instanceof ItemGun)
				{
					GunType type = ((ItemGun)currentHeldItem.getItem()).type;
					AttachmentType grip = type.getGrip(currentHeldItem);
					if(grip != null && grip.flashlight)
					{
						for(int i = 0; i < 2; i++)
						{
							MovingObjectPosition ray = player.rayTrace(grip.flashlightRange / 2F * (i + 1), 1F);
							if(ray != null)
							{
								int x = ray.blockX;
								int y = ray.blockY;
								int z = ray.blockZ;
								int side = ray.sideHit;
								switch(side)
								{
								case 0 : y--; break;
								case 1 : y++; break;
								case 2 : z--; break;
								case 3 : z++; break;
								case 4 : x--; break;
								case 5 : x++; break;
								}
								blockLightOverrides.add(new Vector3i(x, y, z));
								mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, 12);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y, z);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
							}
						}
					}
					if(type.matchlock)
					{
						for(int i = 0; i < 2; i++)
						{
							MovingObjectPosition ray = player.rayTrace(4f / 2F * (i + 1), 1F);
							if(ray != null)
							{
								int x = ray.blockX;
								int y = ray.blockY;
								int z = ray.blockZ;
								int side = ray.sideHit;
								switch(side)
								{
								case 0 : y--; break;
								case 1 : y++; break;
								case 2 : z--; break;
								case 3 : z++; break;
								case 4 : x--; break;
								case 5 : x++; break;
								}
								blockLightOverrides.add(new Vector3i(x, y, z));
								mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, 15);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y, z);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
								mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
							}
						}
					}
				}
			}

			for(Object obj : mc.theWorld.loadedEntityList)
			{

				//for player spotting in thermal vision
				if(obj instanceof EntityLiving && Minecraft.getMinecraft().entityRenderer.isShaderActive())
				{
					EntityLiving bullet = (EntityLiving)obj;

					//make all living things glow in the dark
					bullet.getBrightnessForRender(15728880f);

					//if the entity is a player, alsoc reate dynamic light
					if(obj instanceof EntityPlayer)
					{
						EntityPlayer human = (EntityPlayer)obj;
						human.getBrightnessForRender(15728880f);

						int x = MathHelper.floor_double(human.posX);
						int y = MathHelper.floor_double(human.posY);
						int z = MathHelper.floor_double(human.posZ);
						blockLightOverrides.add(new Vector3i(x, y, z));
						mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, 10);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
						//DynamicLights.addLightSource(iDynamicLightSource);
					}

				}

				if(obj instanceof EntityBullet)
				{
					EntityBullet bullet = (EntityBullet)obj;
					//IDynamicLightSource iDynamicLightSource = new AddFlansLightSource((Entity)bullet,15);
					if(!bullet.isDead && bullet.type.hasLight)
					{/*
						int x = MathHelper.floor_double(bullet.posX);
						int y = MathHelper.floor_double(bullet.posY);
						int z = MathHelper.floor_double(bullet.posZ);
						blockLightOverrides.add(new Vector3i(x, y, z));
						mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, 15);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);*/
						//DynamicLights.addLightSource(iDynamicLightSource);
					}else if(bullet.isDead && bullet.type.hasLight){
						//DynamicLights.removeLightSource(iDynamicLightSource);
					}
				}
				else if(obj instanceof EntityMecha)
				{
					EntityMecha mecha = (EntityMecha)obj;
					int x = MathHelper.floor_double(mecha.posX);
					int y = MathHelper.floor_double(mecha.posY);
					int z = MathHelper.floor_double(mecha.posZ);
					if(mecha.lightLevel() > 0)
					{
						blockLightOverrides.add(new Vector3i(x, y, z));
						mc.theWorld.setLightValue(EnumSkyBlock.Block, x, y, z, Math.max(mc.theWorld.getBlockLightValue(x, y, z), mecha.lightLevel()));
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x + 1, y, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x - 1, y + 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y + 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y - 1, z);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z + 1);
						mc.theWorld.updateLightByType(EnumSkyBlock.Block, x, y, z - 1);
					}
					if(mecha.forceDark())
					{
						for(int i = -3; i <= 3; i++)
						{
							for(int j = -3; j <= 3; j++)
							{
								for(int k = -3; k <= 3; k++)
								{
									int xd = i + x;
									int yd = j + y;
									int zd = k + z;
									blockLightOverrides.add(new Vector3i(xd, yd, zd));
									mc.theWorld.setLightValue(EnumSkyBlock.Sky, xd, yd, zd, Math.abs(i) + Math.abs(j) + Math.abs(k));
								}
							}
						}
					}
				}
			}
		}

		if(FlansMod.ticker % vehicleLightOverrideRefreshRate == 0 && mc.theWorld != null)
		{
			//Check graphics setting and adjust refresh rate
			vehicleLightOverrideRefreshRate = mc.gameSettings.fancyGraphics ? 1 : 2;

			//Reset old light values
			for(Vector3i v : vehicleLightOverrides)
			{
				mc.theWorld.updateLightByType(EnumSkyBlock.Block, v.x, v.y, v.z);
			}
			//Clear the list
			vehicleLightOverrides.clear();
		}
	}

	public void clientTickEnd(Minecraft minecraft)
	{ /* Client side only */
		for(int i = 0; i < killMessages.size(); i++)
		{
			killMessages.get(i).timer--;
			if(killMessages.get(i).timer == 0)
			{
				killMessages.remove(i);
			}
		}
		RenderFlag.angle += 2F;
		FlansModClient.tick();
	}

	public void renderTickStart(Minecraft mc, float smoothing)
	{
		// CAPTURE MOUSE INPUT!
		if (mc.currentScreen == null && FlansModClient.controlModeMouse)
		{
			MouseHelper mouse = mc.mouseHelper;
			Entity ridden = mc.thePlayer.ridingEntity;

			if (ridden instanceof EntityDriveable)
			{
				EntityDriveable entity = (EntityDriveable) ridden;
				entity.onMouseMoved(mouse.deltaX, mouse.deltaY);
			}
		}
		FlansModClient.renderTick(smoothing);

		if(mc.currentScreen instanceof GuiDriveableController)
		{
			guiDriveableController = mc.currentScreen;
			mc.currentScreen = null;
		}
		else
		{
			guiDriveableController = null;
		}
	}

	public void renderTickEnd(Minecraft mc)
	{
		if(mc.currentScreen==null && guiDriveableController!=null)
		{
			mc.currentScreen = guiDriveableController;
			guiDriveableController = null;
		}

		Tessellator tessellator = Tessellator.instance;
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();

		//FlashBan
		if(FlansModClient.isInFlash){
			isInFlash = true;
			flashTime = FlansModClient.flashTime;
			tickcountflash = 0;
			FlansModClient.isInFlash = false;
			FlansModClient.flashTime = 0;
		}
		if(isInFlash && tickcountflash < flashTime){
			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			GL11.glEnable(3042 /* GL_BLEND */);
			GL11.glDisable(2929 /* GL_DEPTH_TEST */);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(1F, 1F, 1F, 1.0F);
			GL11.glDisable(3008 /* GL_ALPHA_TEST */);

			mc.renderEngine.bindTexture(new ResourceLocation("flansmod", "gui/flash.png"));

			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929 /* GL_DEPTH_TEST */);
			GL11.glEnable(3008 /* GL_ALPHA_TEST */);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
			//System.out.println(mc.gameSettings.hideGUI);
			tickcountflash++;
		}else{
			isInFlash = false;
			flashTime = 0;
			tickcountflash = 0;
		}
		/*
		ScaledResolution scaledresolution = new ScaledResolution(FlansModClient.minecraft, FlansModClient.minecraft.displayWidth, FlansModClient.minecraft.displayHeight);
		int i = scaledresolution.getScaledWidth();
		int j = scaledresolution.getScaledHeight();

		String overlayTexture = null;
		if (FlansModClient.currentScope != null && FlansModClient.currentScope.hasZoomOverlay() && FMLClientHandler.instance().getClient().currentScreen == null && FlansModClient.zoomProgress > 0.8F)
		{
			overlayTexture = FlansModClient.currentScope.getZoomOverlay();
		}
		else if(mc.thePlayer != null)
		{
			ItemStack stack = mc.thePlayer.inventory.armorInventory[3];
			if(stack != null && stack.getItem() instanceof ItemTeamArmour)
			{
				overlayTexture = ((ItemTeamArmour)stack.getItem()).type.overlay;
			}
		}

		if(overlayTexture != null)
		{
			FlansModClient.minecraft.entityRenderer.setupOverlayRendering();
			GL11.glEnable(3042);
			GL11.glDisable(2929);
			GL11.glDepthMask(false);
			GL11.glBlendFunc(770, 771);
			GL11.glColor4f(mc.ingameGUI.prevVignetteBrightness, mc.ingameGUI.prevVignetteBrightness, mc.ingameGUI.prevVignetteBrightness, 1.0F);
			GL11.glDisable(3008);

			mc.renderEngine.bindTexture(FlansModResourceHandler.getScope(overlayTexture));

			Tessellator tessellator = Tessellator.instance;
			tessellator.startDrawingQuads();
			tessellator.addVertexWithUV(i / 2 - 2 * j, j, -90D, 0.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, j, -90D, 1.0D, 1.0D);
			tessellator.addVertexWithUV(i / 2 + 2 * j, 0.0D, -90D, 1.0D, 0.0D);
			tessellator.addVertexWithUV(i / 2 - 2 * j, 0.0D, -90D, 0.0D, 0.0D);
			tessellator.draw();
			GL11.glDepthMask(true);
			GL11.glEnable(2929);
			GL11.glEnable(3008);
			GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		}
		 */
	}

	private static void drawSlotInventory(FontRenderer fontRenderer, ItemStack itemstack, int i, int j){
		if(itemstack == null || itemstack.getItem() == null)
			return;
		itemRenderer.renderItemIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
		itemRenderer.renderItemOverlayIntoGUI(fontRenderer, FlansModClient.minecraft.renderEngine, itemstack, i, j);
	}

	public static void addKillMessage(boolean headshot, InfoType infoType, int itmDmg, String killer, String killed) {
		for (KillMessage killMessage : killMessages) {
			killMessage.line++;
			if (killMessage.line > 10)
				killMessage.timer = 0;
		}
		killMessages.add(new KillMessage(headshot, infoType, itmDmg, killer, killed));
	}

	public static void addKillMessageDumb(String killer, String killed) {
		for (KillMessage killMessage : killMessages) {
			killMessage.line++;
			if (killMessage.line > 10)
				killMessage.timer = 0;
		}
		killMessagesDumb.add(new KillMessageDumb(killer, killed));
	}



	private static RenderItem itemRenderer = new RenderItem();
	private static List<KillMessage> killMessages = new ArrayList<KillMessage>();
	private static List<KillMessageDumb> killMessagesDumb = new ArrayList<KillMessageDumb>();

	private static class KillMessageDumb {
		public KillMessageDumb(String killer, String killed) {
			killerName = killer;
			killedName = killed;
			line = 0;
			timer = 200;
		}
		public String killerName;
		public String killedName;
		public int timer;
		public int line;
	}

	private static class KillMessage {
		public KillMessage(boolean head, InfoType infoType, int itmDmg, String killer, String killed) {
			headshot = head;
			killerName = killer;
			killedName = killed;
			weapon = infoType;
			itemDamage = itmDmg;
			line = 0;
			timer = 200;
		}





		public String killerName;
		public String killedName;
		public InfoType weapon;
		public int itemDamage;
		public int timer;
		public int line;
		public boolean headshot;
	}
}