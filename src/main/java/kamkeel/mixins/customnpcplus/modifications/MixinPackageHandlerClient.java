package kamkeel.mixins.customnpcplus.modifications;

import io.netty.buffer.ByteBuf;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.StatCollector;
import noppes.npcs.*;
import noppes.npcs.client.*;
import noppes.npcs.config.ConfigClient;
import noppes.npcs.constants.EnumPacketClient;
import noppes.npcs.controllers.RecipeController;
import noppes.npcs.controllers.data.Animation;
import noppes.npcs.controllers.data.RecipeCarpentry;
import noppes.npcs.entity.EntityDialogNpc;
import noppes.npcs.entity.EntityNPCInterface;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Overwrite;
import java.io.IOException;
import java.util.HashMap;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.achievement.GuiAchievement;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.network.PacketBuffer;
import net.minecraft.stats.Achievement;
import net.minecraft.util.ChatComponentTranslation;
import net.minecraft.util.StatCollector;
import net.minecraft.village.MerchantRecipeList;
import noppes.npcs.NoppesStringUtils;
import noppes.npcs.PacketHandlerServer;
import noppes.npcs.Server;
import noppes.npcs.client.ClientProxy.FontContainer;
import noppes.npcs.client.controllers.MusicController;
import noppes.npcs.client.controllers.ScriptClientSound;
import noppes.npcs.client.controllers.ScriptSoundController;
import noppes.npcs.client.gui.GuiNpcMobSpawnerAdd;
import noppes.npcs.client.gui.OverlayQuestTracking;
import noppes.npcs.client.gui.customoverlay.OverlayCustom;
import noppes.npcs.client.gui.player.GuiBook;
import noppes.npcs.client.gui.util.GuiContainerNPCInterface;
import noppes.npcs.client.gui.util.GuiNPCInterface;
import noppes.npcs.client.gui.util.IGuiClose;
import noppes.npcs.client.gui.util.IGuiData;
import noppes.npcs.client.gui.util.IGuiError;
import noppes.npcs.client.gui.util.IScrollData;
import noppes.npcs.constants.EnumGuiType;
import cpw.mods.fml.common.ObfuscationReflectionHelper;

import net.minecraft.block.material.Material;

import java.io.IOException;

@Mixin(value = PacketHandlerClient.class)
public abstract class MixinPackageHandlerClient  {


	// EXAMPLE of an OVERWRITE for a FULL METHOD
//	@Overwrite(remap = false)
//	private void client(ByteBuf buffer, EntityPlayer player, EnumPacketClient type) throws IOException {
//	// PASTE client() from PACKET HANDLER CLIENT
//		// WITH MODIFICATIONS
//	}

	// EXAMPLE of an INJECTION into a METHOD at a specific LINE / VALUE
//	@Inject(method = "renderWorld", at = @At(value = "RETURN"))
//	private void renderFirstPersonOverlays(float p_78476_1_, long p_78476_2_, CallbackInfo callbackInfo)
//	{
//		EntityPlayer player = Minecraft.getMinecraft().thePlayer;
//		if (ClientEventHandler.hasOverlays(player)) {
//			GL11.glPushMatrix();
//			ClientEventHandler.renderCNPCPlayer.renderHand(p_78476_1_,0);
//			GL11.glPopMatrix();
//		}
//	}
}