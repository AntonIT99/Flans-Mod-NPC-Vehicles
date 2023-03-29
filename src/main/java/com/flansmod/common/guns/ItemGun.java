package com.flansmod.common.guns;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import com.flansmod.common.network.*;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import com.flansmod.client.AimType;
import com.flansmod.client.FlansModClient;
import com.flansmod.client.debug.EntityDebugDot;
import com.flansmod.client.debug.EntityDebugVector;
import com.flansmod.client.model.GunAnimations;
import com.flansmod.common.FlansMod;
import com.flansmod.common.PlayerData;
import com.flansmod.common.PlayerHandler;
import com.flansmod.common.RotatedAxes;
import com.flansmod.common.driveables.EntityDriveable;
import com.flansmod.common.driveables.EntityPlane;
import com.flansmod.common.driveables.EntitySeat;
import com.flansmod.common.driveables.EntityVehicle;
import com.flansmod.common.driveables.mechas.EntityMecha;
import com.flansmod.common.eventhandlers.GunFiredEvent;
import com.flansmod.common.guns.raytracing.BulletHit;
import com.flansmod.common.guns.raytracing.EntityHit;
import com.flansmod.common.guns.raytracing.EnumHitboxType;
import com.flansmod.common.guns.raytracing.PlayerBulletHit;
import com.flansmod.common.guns.raytracing.PlayerHitbox;
import com.flansmod.common.guns.raytracing.PlayerSnapshot;
import com.flansmod.common.paintjob.IPaintableItem;
import com.flansmod.common.paintjob.PaintableType;
import com.flansmod.common.paintjob.Paintjob;
import com.flansmod.common.teams.EntityFlag;
import com.flansmod.common.teams.EntityFlagpole;
import com.flansmod.common.teams.EntityGunItem;
import com.flansmod.common.teams.Team;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.IGunboxDescriptionable;
import com.flansmod.common.vector.Vector3f;

import com.google.common.collect.Multimap;

import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.client.settings.GameSettings;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.EnumAction;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.IIcon;
import net.minecraft.util.MathHelper;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.MovingObjectPosition.MovingObjectType;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.Constants;
import net.minecraftforge.event.world.BlockEvent;

public class ItemGun extends Item implements IPaintableItem, IGunboxDescriptionable {
    public GunType type;
    private static boolean rightMouseHeld;
    private static boolean leftMouseHeld;
    private static boolean lastLeftMouseHeld;
    public static boolean crouching = false;
    public static boolean sprinting = false;
    public static boolean shooting = false;
    public String originGunbox = "";
    private boolean canClick = true;
    private boolean lastIsShooting = false;

    public String getOriginGunBox() { return originGunbox; }
    public void setOriginGunBox(String e) { originGunbox = e; }
    // This is a bodge - the server needs to hold state that is held on the client.
    public boolean isScoped = false;
    public int soundDelay;
    public int lockOnSoundDelay;

    public int impactX = 0;
    public int impactY = 0;
    public int impactZ = 0;

    
    @Override
    public InfoType getInfoType() {
        return type;
    }

    @Override
    public PaintableType GetPaintableType() {
        return type;
    }

    public IIcon[] icons;
    private IIcon defaultIcon;

    public ItemGun(GunType gun) {
        maxStackSize = 1;
        type = gun;
        type.item = this;
        setHasSubtypes(true);
        setCreativeTab(FlansMod.tabFlanGuns);
        GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
    }

    /**
     * Make sure client and server side NBT tags update
     */
    @Override
    public boolean getShareTag() {
        return true;
    }

    /**
     * Get the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets)
     */
    public ItemStack getBulletItemStack(ItemStack gun, int id) {
        //If the gun has no tags, give it some
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
            return null;
        }

        String s;
        if (type.getSecondaryFire(gun))
            s = "secondaryAmmo";
        else
            s = "ammo";

        //If the gun has no ammo tags, give it some
        if (!gun.stackTagCompound.hasKey(s)) {
            NBTTagList ammoTagsList = new NBTTagList();
            for (int i = 0; i < type.getNumAmmoItemsInGun(gun); i++) {
                ammoTagsList.appendTag(new NBTTagCompound());
            }
            gun.stackTagCompound.setTag(s, ammoTagsList);
            return null;
        }
        //Take the list of ammo tags
        NBTTagList ammoTagsList = gun.stackTagCompound.getTagList(s, Constants.NBT.TAG_COMPOUND);
        //Get the specific ammo tags required
        NBTTagCompound ammoTags = ammoTagsList.getCompoundTagAt(id);
        return ItemStack.loadItemStackFromNBT(ammoTags);
    }

    /**
     * Set the bullet item stack stored in the gun's NBT data (the loaded magazine / bullets)
     */
    public void setBulletItemStack(ItemStack gun, ItemStack bullet, int id) {
        //If the gun has no tags, give it some
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }

        String s;
        if (type.getSecondaryFire(gun))
            s = "secondaryAmmo";
        else
            s = "ammo";

        //If the gun has no ammo tags, give it some
        if (!gun.stackTagCompound.hasKey(s)) {
            NBTTagList ammoTagsList = new NBTTagList();
            for (int i = 0; i < type.getNumAmmoItemsInGun(gun); i++) {
                ammoTagsList.appendTag(new NBTTagCompound());
            }
            gun.stackTagCompound.setTag(s, ammoTagsList);
        }
        //Take the list of ammo tags
        NBTTagList ammoTagsList = gun.stackTagCompound.getTagList(s, Constants.NBT.TAG_COMPOUND);
        //Get the specific ammo tags required
        NBTTagCompound ammoTags = ammoTagsList.getCompoundTagAt(id);
        //Represent empty slots by null types
        if (bullet == null) {
            ammoTags = new NBTTagCompound();
        } else {
            //Set the tags to match the bullet stack
            bullet.writeToNBT(ammoTags);
        }
    }

    @Override
    @SuppressWarnings("unchecked")
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean advancedTooltips) {
        KeyBinding shift = Minecraft.getMinecraft().gameSettings.keyBindSneak;
        String paintName = type.getPaintjob(stack.getItemDamage()).displayName;
        if (!paintName.equals("default") && !paintName.isEmpty())
            lines.add("\u00a7b\u00a7o" + paintName);

        if (!type.packName.isEmpty() && FlansMod.showPackNameInItemDescriptions) {
            lines.add("\u00a7o" + type.packName);
        }
        if (type.description != null) {
            Collections.addAll(lines, type.description.split("_"));
        }

        if (FlansMod.showItemDescriptions) {
            // Reveal all the gun stats when holding down the sneak key
            if (!GameSettings.isKeyDown(shift)) {
                // Show loaded ammo
                for (int i = 0; i < type.getNumAmmoItemsInGun(stack); i++) {
                    ItemStack bulletStack = getBulletItemStack(stack, i);
                    if (bulletStack != null && bulletStack.getItem() instanceof ItemBullet) {
                        BulletType bulletType = ((ItemBullet) bulletStack.getItem()).type;
                        String line = bulletType.name + " " + (bulletStack.getMaxDamage() - bulletStack.getItemDamage())
                                + "/" + bulletStack.getMaxDamage();
                        lines.add(line);
                    }
                }

                lines.add("Hold \u00a7b\u00a7o" + GameSettings.getKeyDisplayString(shift.getKeyCode())
                        + "\u00a7r\u00a77 for details");
            } else {
                lines.add("");

                if (originGunbox != "") {
                    lines.add("\u00a79Box" + "\u00a77: " + originGunbox);
                }

                AttachmentType barrel = type.getBarrel(stack);
                if (barrel != null && barrel.silencer)
                    lines.add("\u00a7e[Suppressed]");

                if (type.getSecondaryFire(stack))
                    lines.add("\u00a7e[Underbarrel]");

                lines.add("\u00a79Damage" + "\u00a77: " + roundFloat(type.getDamage(stack), 2));
                lines.add("\u00a79Recoil" + "\u00a77: " + roundFloat(type.getRecoilDisplay(stack), 2));
                String sprintingControl = String.format("%s%s", EnumChatFormatting.RED,
                        roundFloat(1 - type.getRecoilControl(stack, true, false), 2));
                String sneakingControl = String.format("%s%s", EnumChatFormatting.GREEN,
                        roundFloat(1 - type.getRecoilControl(stack, false, true), 2));
                String normalControl = String.format("%s%s", EnumChatFormatting.AQUA,
                        roundFloat(1 - type.getRecoilControl(stack, false, false), 2));
                lines.add("\u00a79Recoil Control" + "\u00a77: "
                        + String.format("%s %s %s", sprintingControl, normalControl, sneakingControl));
                lines.add("\u00a79Accuracy" + "\u00a77: " + roundFloat(type.getSpread(stack, false, false), 2));
                lines.add("\u00a79Reload Time" + "\u00a77: " + roundFloat(type.getReloadTime(stack) / 20, 2) + "s");
                lines.add("\u00a79Bullet Speed" + "\u00a77: " + roundFloat(type.getBulletSpeed(stack), 2));
                // TODO Convert to stack values so this works with attachments
                if (type.shootDelay != 0) {
                    lines.add("\u00a79FireRate" + "\u00a77: " + 1200 / type.shootDelay + "\u00a77rpm ");
                } else
                    lines.add("\u00a79FireRate" + "\u00a77: " + type.roundsPerMin + "\u00a77rpm ");
                lines.add("\u00a79Mode" + "\u00a77: \u00a7f" + type.getFireMode(stack).toString().toLowerCase());

                lines.add("");
                lines.add("\u00a7eAttachments");
                boolean empty = true;
                for (AttachmentType attachment : type.getCurrentAttachments(stack)) {
                    String line = attachment.name;
                    lines.add(line);
                    if (line != null)
                        empty = false;
                }

                if (empty)
                    lines.add("None");
            }
        }
    }

    @SideOnly(Side.CLIENT)
    private void onUpdateClient(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
        if (!(entity instanceof EntityPlayer))
            return;
        if (((EntityPlayer) entity).inventory.getCurrentItem() != itemstack) {
            if (soundDelay > 0) {
                soundDelay--;
            }
            return;
        }

        //Get useful objects
        Minecraft mc = Minecraft.getMinecraft();
        EntityPlayer player = (EntityPlayer) entity;
        PlayerData data = PlayerHandler.getPlayerData(player, Side.CLIENT);

        handleGunSwitchDelay(player, mc);

        //Play idle sounds
        if (soundDelay <= 0 && type.idleSound != null) {
            PacketPlaySound.sendSoundPacket(entity.posX, entity.posY, entity.posZ, type.idleSoundRange, entity.dimension, type.idleSound, false);
            soundDelay = type.idleSoundLength;
        }

        //If crouching, translate weapon model (zoom)
        crouching = player.isSneaking();
        //If running, reposition the gun
        sprinting = player.isSprinting();

        //This code is not for deployables
        if (type.deployable)
            return;


        GameSettings gameSettings = FMLClientHandler.instance().getClient().gameSettings;
        //If in a GUI
        if (FMLClientHandler.instance().getClient().currentScreen != null) {
            leftMouseHeld = false;
            rightMouseHeld = false;
            FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, false, player.rotationYaw, player.rotationPitch));
            FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, false, player.rotationYaw, player.rotationPitch));
            if (FlansModClient.currentScope != null) {
                FlansModClient.currentScope = null;
                gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
                gameSettings.fovSetting = FlansModClient.originalFOV;

                //Send default spread packet to server
                FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, type.getDefaultSpread(itemstack)));
            }
        } else if (mc.objectMouseOver != null && (mc.objectMouseOver.entityHit instanceof EntityFlagpole || mc.objectMouseOver.entityHit instanceof EntityFlag || mc.objectMouseOver.entityHit instanceof EntityGunItem || (mc.objectMouseOver.entityHit instanceof EntityGrenade && ((EntityGrenade) mc.objectMouseOver.entityHit).type.isDeployableBag))) {
            //Do not shoot ammo bags, flags or dropped gun items
        }

        //Else do shoot code
        else {
            //Get whether mice are held
            boolean lastRightMouseHeld = rightMouseHeld;
            lastLeftMouseHeld = leftMouseHeld;
            rightMouseHeld = Mouse.isButtonDown(FlansModClient.fireButton.getButton());
            leftMouseHeld = Mouse.isButtonDown(FlansModClient.aimButton.getButton());

            boolean offHandFull = false;

            //----------------------------- Off hand item ---------------------------------------------------------------------
            if (type.getOneHanded()) {
                if (data.offHandGunSlot == player.inventory.currentItem + 1)
                    data.offHandGunSlot = 0;
                //Cycle selection
                int dWheel = Mouse.getDWheel();
                if (Keyboard.isKeyDown(mc.gameSettings.keyBindSneak.getKeyCode()) && dWheel != 0) {
                    data.cycleOffHandItem(player, dWheel);
                }

                if (data.offHandGunSlot != 0) {
                    offHandFull = true;
                    ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                    if (offHandGunStack != null && offHandGunStack.getItem() instanceof ItemGun) {
                        GunType offHandGunType = ((ItemGun) offHandGunStack.getItem()).type;
                        if (offHandGunType.usableByPlayers) {
                            //If we are using a burst mode gun, and there is burst left to be done, try to do it
                            if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && data.burstRoundsRemainingLeft > 0) {
                                if (clientSideShoot(player, offHandGunStack, offHandGunType, true))
                                    player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, null);
                            } else {
                                //Send packet when firing a semi or starting to fire a full
                                if (leftMouseHeld && !lastLeftMouseHeld) {
                                    FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, true, player.rotationYaw, player.rotationPitch));
                                    if (clientSideShoot(player, offHandGunStack, offHandGunType, true))
                                        player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, null);
                                }
                                if ((offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO || offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN) && !leftMouseHeld && lastLeftMouseHeld) //Full auto. Send released mouse packet
                                {
                                    FlansMod.getPacketHandler().sendToServer(new PacketGunFire(true, false, player.rotationYaw, player.rotationPitch));
                                }
                                if ((offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO || offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN) && leftMouseHeld) {
                                    if (clientSideShoot(player, offHandGunStack, offHandGunType, true)) {
                                        player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, null);
                                    }
                                }
                            }
                        }
                    } else data.offHandGunSlot = 0;
                }
            }

            //--------------------------------- Main hand item ---------------------------------------------
            if (type.usableByPlayers) {
                //If we are using a burst mode gun, and there is burst left to be done, try to do it
                if (type.getFireMode(itemstack) == EnumFireMode.BURST && data.burstRoundsRemainingRight > 0) {
                    if (clientSideShoot(player, itemstack, type, false))
                        player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
                } else {
                    //Send packet when firing a semi or starting to fire a full
                    if (rightMouseHeld && !lastRightMouseHeld) {
                        FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, true, player.rotationYaw, player.rotationPitch));
                        if (clientSideShoot(player, itemstack, type, false))
                            player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
                    }
                    //Full auto. Send released mouse packet
                    if ((type.getFireMode(itemstack) == EnumFireMode.FULLAUTO || type.getFireMode(itemstack) == EnumFireMode.MINIGUN) && !rightMouseHeld && lastRightMouseHeld) {
                        FlansMod.getPacketHandler().sendToServer(new PacketGunFire(false, false, player.rotationYaw, player.rotationPitch));
                    }
                    if ((type.getFireMode(itemstack) == EnumFireMode.FULLAUTO || type.getFireMode(itemstack) == EnumFireMode.MINIGUN) && rightMouseHeld) {
                        if (clientSideShoot(player, itemstack, type, false))
                            player.inventory.setInventorySlotContents(player.inventory.currentItem, null);
                    }
                }
            }
            IScope currentScope = type.getCurrentScope(itemstack);
            if (FlansModClient.aimType == AimType.TOGGLE) {
                if (!offHandFull && (type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM) && Mouse.isButtonDown(FlansModClient.aimButton.getButton()) && FlansModClient.scopeTime <= 0 && FMLClientHandler.instance().getClient().currentScreen == null) {
                    if (FlansModClient.currentScope == null) {
                        /*if(type.allowNightVision)
                            isNightVision = true;
                        if(type.allowSlow)
                            isSlow = true;*/
                        FlansModClient.currentScope = currentScope;
                        FlansModClient.lastZoomLevel = currentScope.hasVariableZoom()?getCurrentVariableZoom(itemstack):currentScope.getZoomFactor();
                        FlansModClient.lastFOVZoomLevel = currentScope.hasVariableZoom()?1F:currentScope.getFOVFactor();
                        float f = FlansModClient.originalMouseSensitivity = gameSettings.mouseSensitivity;
                        gameSettings.mouseSensitivity = f / (float) Math.sqrt(currentScope.hasVariableZoom()?getCurrentVariableZoom(itemstack):currentScope.getZoomFactor());
                        FlansModClient.originalThirdPerson = gameSettings.thirdPersonView;
                        gameSettings.thirdPersonView = 0;


                        // This fixes some of the issues with FOV getting changed by repeated scoping
                        // and unscoping.
                        // In effect, it says that we should only set the 'original' zoom of the client
                        // if we know the FOV is
                        // unaffected from scoping.
                        if (Math.abs(FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) < 0.0001F) {
                            FlansModClient.originalFOV = gameSettings.fovSetting;
                        }

                        //Send ads spread packet to server
                        sendADSSpreadToServer(itemstack, player.isSneaking(), player.isSprinting());
                        isScoped = FlansModClient.currentScope != null;
                        FlansMod.getPacketHandler().sendToServer(new PacketGunState(isScoped));
                    } else {
                        //if(type.allowNightVision)
                        //isNightVision = false;
                        FlansModClient.currentScope = null;
                        gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                        gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
                        gameSettings.fovSetting = FlansModClient.originalFOV;

                        //Send default spread packet to server
                        FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, type.getDefaultSpread(itemstack)));
                        isScoped = FlansModClient.currentScope != null;
                        FlansMod.getPacketHandler().sendToServer(new PacketGunState(isScoped));
                    }
                    FlansModClient.scopeTime = 10;
                }
            } else {
                if (!offHandFull && (type.secondaryFunction == EnumSecondaryFunction.ADS_ZOOM || type.secondaryFunction == EnumSecondaryFunction.ZOOM) && Mouse.isButtonDown(FlansModClient.aimButton.getButton()) && /*FlansModClient.scopeTime <= 0 &&*/ FMLClientHandler.instance().getClient().currentScreen == null) {
                    if (FlansModClient.currentScope == null) {
                        /*if(type.allowNightVision)
                            isNightVision = true;
                        if(type.allowSlow)
                            isSlow = true;*/
                        FlansModClient.currentScope = currentScope;
                        FlansModClient.lastZoomLevel = currentScope.hasVariableZoom()?getCurrentVariableZoom(itemstack):currentScope.getZoomFactor();
                        FlansModClient.lastFOVZoomLevel = currentScope.hasVariableZoom()?1F:currentScope.getFOVFactor();
                        float f = FlansModClient.originalMouseSensitivity = gameSettings.mouseSensitivity;
                        gameSettings.mouseSensitivity = f / (float) Math.sqrt(currentScope.hasVariableZoom()?getCurrentVariableZoom(itemstack):currentScope.getZoomFactor());
                        FlansModClient.originalThirdPerson = gameSettings.thirdPersonView;
                        gameSettings.thirdPersonView = 0;

                        // This fixes some of the issues with FOV getting changed by repeated scoping and unscoping.
                        // In effect, it says that we should only set the 'original' zoom of the client if we know the FOV is
                        // unaffected from scoping.
                        if (Math.abs(FlansModClient.zoomProgress - FlansModClient.lastZoomProgress) < 0.0001F) {
                            FlansModClient.originalFOV = gameSettings.fovSetting;
                        }

                        //Send ads spread packet to server
                        sendADSSpreadToServer(itemstack, player.isSneaking(), player.isSprinting());
                        isScoped = FlansModClient.currentScope != null;
                        FlansMod.getPacketHandler().sendToServer(new PacketGunState(isScoped));
                    }
                    FlansModClient.scopeTime = 10;
                } else {
                    if (!Mouse.isButtonDown(FlansModClient.aimButton.getButton())) {
                        if (FlansModClient.currentScope != null) {
                            FlansModClient.currentScope = null;
                            gameSettings.mouseSensitivity = FlansModClient.originalMouseSensitivity;
                            gameSettings.thirdPersonView = FlansModClient.originalThirdPerson;
                            gameSettings.fovSetting = FlansModClient.originalFOV;

                            //Send default spread packet to server
                            FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(itemstack, type.getDefaultSpread(itemstack)));
                            isScoped = FlansModClient.currentScope != null;
                            FlansMod.getPacketHandler().sendToServer(new PacketGunState(isScoped));
                        }
                    }
                }
            }
        }

        if (soundDelay > 0) {
            soundDelay--;
        }
    }

    @SideOnly(Side.CLIENT)
    private void handleGunSwitchDelay(EntityPlayer entity, Minecraft mc) {

        if (mc.thePlayer == entity
                && Minecraft.getMinecraft().thePlayer.inventory.currentItem
                != GunAnimations.lastInventorySlot) {
            GunAnimations.lastInventorySlot = mc.thePlayer.inventory.currentItem;
            ItemStack stack = mc.thePlayer.getHeldItem();
            GunAnimations animations = FlansModClient.getGunAnimations((EntityLivingBase) entity, false);
            if (stack != null && stack.getItem() instanceof ItemGun) {
                float animationLength = ((ItemGun) stack.getItem()).type.switchDelay;
                if (animationLength == 0) {
                    animations.switchAnimationLength = animations.switchAnimationProgress = 0;
                } else {
                    animations.switchAnimationProgress = 1;
                    animations.switchAnimationLength = animationLength;
                    PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT).shootTimeRight = Math.max(PlayerHandler.getPlayerData(mc.thePlayer, Side.CLIENT).shootTimeRight, animationLength);
                }

            }
        }
    }
    public void increaseZoom(ItemStack gun){
        if(getCurrentVariableZoom(gun)<type.getCurrentScope(gun).getMaxZoom()){
            setVariableZoom(gun,getCurrentVariableZoom(gun)+type.getCurrentScope(gun).getZoomAugment());
            FlansModClient.lastZoomLevel=getCurrentVariableZoom(gun);
            FlansModClient.zoomProgress=0.9F;
        }
    }
    public void decreaseZoom(ItemStack gun){
        if(getCurrentVariableZoom(gun)>type.getCurrentScope(gun).getMinZoom()){
            setVariableZoom(gun,getCurrentVariableZoom(gun)-type.getCurrentScope(gun).getZoomAugment());
            FlansModClient.lastZoomLevel=getCurrentVariableZoom(gun);
            FlansModClient.zoomProgress=0.9F;
        }
    }

    public float getCurrentVariableZoom(ItemStack gun){
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }
        String s = "currentZoom";
        if (!gun.stackTagCompound.hasKey(s)) {
            setVariableZoom(gun,type.getCurrentScope(gun).getMinZoom());
        }
        return gun.stackTagCompound.getFloat(s);
    }

    public void setVariableZoom(ItemStack gun, float zoom) {
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }
        String s = "currentZoom";
        if (!gun.stackTagCompound.hasKey(s)) {
            gun.stackTagCompound.setFloat(s, zoom);
        }
        gun.stackTagCompound.setFloat(s, zoom);
    }



    public void sendADSSpreadToServer(ItemStack stack, boolean sneaking, boolean sprinting) {
        //Send ads spread packet to server
        float spread = type.getSpread(stack, sneaking, sprinting);
        if (type.numBullets == 1) {
            // Single shot
            spread *= (type.adsSpreadModifier == -1 ? FlansMod.defaultADSSpreadMultiplier : type.adsSpreadModifier);
        } else {
            // Shotgun
            spread *= (type.adsSpreadModifierShotgun == -1 ? FlansMod.defaultADSSpreadMultiplierShotgun : type.adsSpreadModifierShotgun);
        }

        FlansMod.getPacketHandler().sendToServer(new PacketGunSpread(stack, spread));
    }

    /**
     * Client side shoot method for animations and delayers
     *
     * @return whether to consume the gun item
     */
    public boolean clientSideShoot(EntityPlayer player, ItemStack stack, GunType gunType, boolean left) {
        PlayerData data = PlayerHandler.getPlayerData(player);

        if (type.meleeSound != null)
            PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, type.meleeSoundRange, player.dimension, type.meleeSound, true);
        //Do custom melee code here
        if (type.secondaryFunctionWhenShoot != null) {
            if (type.secondaryFunctionWhenShoot == EnumSecondaryFunction.CUSTOM_MELEE) {
                //Do animation
                if (player.worldObj.isRemote) {
                    GunAnimations animations = FlansModClient.getGunAnimations(player, false);
                    animations.doMelee(type.meleeTime);
                }
                //Do custom melee hit detection
                if (data != null) {
                    data.doMelee(player, type.meleeTime, type);
                }
            }
        }

        // ShootTime <= 0 and player is sprinting zoomed or player is not sprinting, or the player can hipFireWhileSprinting
        boolean canActuallyHipFire = (gunType.hipFireWhileSprinting != 2) && !(gunType.hipFireWhileSprinting == 0 && FlansMod.disableSprintHipFireByDefault);
        if (FlansModClient.shootTime(left) <= 0 && ((sprinting && isScoped) || !sprinting || canActuallyHipFire) && !(player.ridingEntity instanceof EntitySeat)) {
//			boolean onLastBullet = false;
            boolean hasAmmo = false;
            for (int i = 0; i < gunType.getNumAmmoItemsInGun(stack); i++) {
                ItemStack bulletStack = getBulletItemStack(stack, i);
                if (bulletStack != null && bulletStack.getItem() != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage()) {
//					if(bulletStack.getMaxDamage() - bulletStack.getItemDamage() == 1 && gunType.model.slideLockOnEmpty)
//						onLastBullet = true;
                    hasAmmo = true;
                    break;
                }
            }
            if (hasAmmo) {
                GunAnimations animations;
                if (left) {
                    if (FlansModClient.gunAnimationsLeft.containsKey(player))
                        animations = FlansModClient.gunAnimationsLeft.get(player);
                    else {
                        animations = new GunAnimations();
                        FlansModClient.gunAnimationsLeft.put(player, animations);
                    }
                } else {
                    if (FlansModClient.gunAnimationsRight.containsKey(player))
                        animations = FlansModClient.gunAnimationsRight.get(player);
                    else {
                        animations = new GunAnimations();
                        FlansModClient.gunAnimationsRight.put(player, animations);
                    }
                }
                int pumpDelay = gunType.model == null ? 0 : gunType.model.pumpDelay;
                int pumpTime = gunType.model == null ? 1 : gunType.model.pumpTime;
                int hammerDelay = gunType.model == null ? 0 : gunType.model.hammerDelay;
                int casingDelay = gunType.model == null ? 0 : gunType.model.casingDelay;
                float hammerAngle = gunType.model == null ? 0 : gunType.model.hammerAngle;
                float althammerAngle = gunType.model == null ? 0 : gunType.model.althammerAngle;

//				animations.onGunEmpty(onLastBullet);
                animations.doShoot(pumpDelay, pumpTime, hammerDelay, hammerAngle, althammerAngle, casingDelay);
                if(type.useFancyRecoil) {
                    FlansModClient.playerRecoil.addRecoil(type.getRecoil(stack));
                }
                //Old client side recoil, moved to PacketGunRecoil
				/*if(!player.isSneaking())
				{
					FlansModClient.playerRecoilPitch += gunType.getRecoilPitch(stack);
					FlansModClient.playerRecoilYaw += gunType.getRecoilYaw(stack);
				}
				else
				{
					FlansModClient.playerRecoilPitch += gunType.getRecoilPitch(stack) - gunType.decreaseRecoilPitch;
					FlansModClient.playerRecoilYaw += gunType.getRecoilYaw(stack) / gunType.decreaseRecoilYaw;
				}*/
                if (left)
                    FlansModClient.shootTimeLeft += gunType.getShootDelay(stack);
                else FlansModClient.shootTimeRight += gunType.getShootDelay(stack);
                if (gunType.consumeGunUponUse)
                    return true;

            }
            if (gunType.getFireMode(stack) == EnumFireMode.BURST) {
                if (left) {
                    if (data.burstRoundsRemainingLeft > 0)
                        data.burstRoundsRemainingLeft--;
                    else data.burstRoundsRemainingLeft = gunType.numBurstRounds;
                } else {
                    if (data.burstRoundsRemainingRight > 0)
                        data.burstRoundsRemainingRight--;
                    else data.burstRoundsRemainingRight = gunType.numBurstRounds;
                }
            }
        }
        return false;
    }

    public void onUpdateServer(ItemStack itemstack, World world, Entity entity, int i, boolean flag) {
        if (itemstack.getTagCompound() == null || itemstack.getTagCompound().hasNoTags()) {
            GunType gunType = this.type;
            NBTTagCompound tags = new NBTTagCompound();
            tags.setString("Paint", gunType.defaultPaintjob.iconName);
            NBTTagList ammoTagsList = new NBTTagList();
            for (int j = 0; j < gunType.getNumAmmoItemsInGun(itemstack); j++) {
                ammoTagsList.appendTag(new NBTTagCompound());
            }
            tags.setTag("ammo", ammoTagsList);
            itemstack.stackTagCompound = tags;
        }

        // For... NBT issues caused by bukkit.
        if (!itemstack.getTagCompound().hasKey("ammo") || !itemstack.getTagCompound().hasKey("Paint")) {
            NBTTagList ammoTagsList = new NBTTagList();
            for (int j = 0; j < type.getNumAmmoItemsInGun(itemstack); j++) {
                ammoTagsList.appendTag(new NBTTagCompound());
            }
            itemstack.getTagCompound().setTag("ammo", ammoTagsList);

            itemstack.getTagCompound().setString("Paint", type.defaultPaintjob.iconName);

            type.checkForTags(itemstack);
        }
        //TODO Temp marker
		/*
		//If enabled a speed nerf will be applied for each gun after gunCarryLimt starting at 0.6 and decreasing by 0.1 for each additional
		if(FlansMod.gunCarryLimitEnable && entity instanceof EntityPlayer)
		{
			EntityPlayer player = (EntityPlayer) entity;
			int gunCount = 0;
			for (int slot = 0; slot < 9; slot++)
			{
				ItemStack itemInSlot = player.inventory.getStackInSlot(slot);
				ItemStack current = player.inventory.getCurrentItem();
				if(itemInSlot != null && itemInSlot.getItem() instanceof ItemGun)
				{
					gunCount++;
				}
			}
			if(gunCount > FlansMod.gunCarryLimit)
			{
				float movementSpeed = MathUtils.clampf((float) (0.1 - (0.04f + (0.010f * (gunCount - FlansMod.gunCarryLimit)))), 0.01f, 0.1f);
				//player.capabilities.setPlayerWalkSpeed(walkSpeed);
				//player.jumpMovementFactor = 0.002F;
				FlansMod.getPacketHandler().sendTo(new PacketUpdateSpeed(0.01F, 0.002F), (EntityPlayerMP) player);
			}
			else
			{
				//player.capabilities.setPlayerWalkSpeed(0.1F);
				//player.jumpMovementFactor = 0.02F; //(default)
				FlansMod.getPacketHandler().sendTo(new PacketUpdateSpeed(0.1F, 0.02F), (EntityPlayerMP) player);
			}
		}
		*/

        if (entity instanceof EntityPlayerMP) {
            EntityPlayerMP player = (EntityPlayerMP) entity;
            PlayerData data = PlayerHandler.getPlayerData(player);
            if (data == null)
                return;

            if (player.inventory.getCurrentItem() != itemstack) {
                //If the player is no longer holding a gun, emulate a release of the shoot button
                if (player.inventory.getCurrentItem() == null || player.inventory.getCurrentItem().getItem() == null || !(player.inventory.getCurrentItem().getItem() instanceof ItemGun)) {
                    data.isShootingRight = data.isShootingLeft = false;
                    data.offHandGunSlot = 0;
                    isScoped = false;
/*                    (new PacketSelectOffHandGun(0)).handleServerSide(player);*/
                }
                return;
            }

            //Right hand gun - main gun
            if (type.getFireMode(itemstack) == EnumFireMode.BURST && data.burstRoundsRemainingRight > 0) {
                player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(itemstack, type, world, player, false));
            }
            if (data.isShootingRight) {
                //Shoot burst and full auto weapons
                if (type.getFireMode(itemstack) == EnumFireMode.FULLAUTO) {
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(itemstack, type, world, player, false));
                }
                //Play looping sounds for minigun
                if (type.useLoopingSounds && data.loopedSoundDelay <= 0 && data.minigunSpeed > 0.1F && !data.reloadingRight) {
                    data.loopedSoundDelay = data.shouldPlayWarmupSound ? type.warmupSoundLength : type.loopedSoundLength;
                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, data.shouldPlayWarmupSound ? type.warmupSound : type.loopedSound, false);
                    data.shouldPlayWarmupSound = false;
                }
                //Minigun is sufficiently fast to shoot
                if (type.getFireMode(itemstack) == EnumFireMode.MINIGUN && data.minigunSpeed > type.minigunStartSpeed)
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(itemstack, type, world, player, false));
            } else {
                if (type.useLoopingSounds && data.shouldPlayCooldownSound) {
                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, type.cooldownSound, false);
                    data.shouldPlayCooldownSound = false;
                }
            }

            lastIsShooting = data.isShootingRight;

            //Left hand gun - offhand gun.
            if (type.getOneHanded() && data.offHandGunSlot != 0) {
                ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                if (offHandGunStack != null && offHandGunStack.getItem() instanceof ItemGun) {
                    GunType offHandGunType = ((ItemGun) offHandGunStack.getItem()).type;

                    if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && data.burstRoundsRemainingLeft > 0) {
                        player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, offHandGunType, world, player, true));
                    }
                    if (data.isShootingLeft) {
                        //Shoot full auto weapons
                        if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.FULLAUTO) {
                            player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, offHandGunType, world, player, true));
                        }
                        //Play looping sounds for minigun
                        if (offHandGunType.useLoopingSounds && data.loopedSoundDelay <= 0 && data.minigunSpeed > 0.1F && !data.reloadingLeft) {
                            data.loopedSoundDelay = data.shouldPlayWarmupSound ? offHandGunType.warmupSoundLength : offHandGunType.loopedSoundLength;
                            PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, data.shouldPlayWarmupSound ? offHandGunType.warmupSound : offHandGunType.loopedSound, false);
                            data.shouldPlayWarmupSound = false;
                        }
                        //Minigun is sufficiently fast to shoot
                        if (offHandGunType.getFireMode(offHandGunStack) == EnumFireMode.MINIGUN && data.minigunSpeed > offHandGunType.minigunStartSpeed)
                            player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, offHandGunType, world, player, true));
                    } else {
                        if (offHandGunType.useLoopingSounds && data.shouldPlayCooldownSound) {
                            PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, FlansMod.soundRange, player.dimension, offHandGunType.cooldownSound, false);
                            data.shouldPlayCooldownSound = false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public void onUpdate(ItemStack itemstack, World world, Entity pEntity, int i, boolean flag) {
        if (world.isRemote)
            onUpdateClient(itemstack, world, pEntity, i, flag);
        else
            onUpdateServer(itemstack, world, pEntity, i, flag);

        if (!(pEntity instanceof EntityPlayer))
            return;

        EntityPlayer player = (EntityPlayer) pEntity;
        PlayerData data = PlayerHandler.getPlayerData(player);
        if (data == null)
            return;

        checkForLockOn(player, data);
        checkForMelee(player, data, itemstack, world);
    }

    private void checkForMelee(EntityPlayer player, PlayerData data, ItemStack itemstack, World world) {

        if (data.meleeLength > 0 && type.meleePath.size() > 0 && player.inventory.getCurrentItem() == itemstack) {
            for (int k = 0; k < type.meleeDamagePoints.size(); k++) {
                Vector3f meleeDamagePoint = type.meleeDamagePoints.get(k);
                //Do a raytrace from the prev pos to the current pos and attack anything in the way
                Vector3f nextPos = type.meleePath.get((data.meleeProgress + 1) % type.meleePath.size());
                Vector3f nextAngles = type.meleePathAngles.get((data.meleeProgress + 1) % type.meleePathAngles.size());
                RotatedAxes nextAxes = new RotatedAxes().rotateGlobalRoll(-nextAngles.x).rotateGlobalPitch(-nextAngles.z).rotateGlobalYaw(-nextAngles.y);

                Vector3f nextPosInGunCoords = nextAxes.findLocalVectorGlobally(meleeDamagePoint);
                Vector3f.add(nextPos, nextPosInGunCoords, nextPosInGunCoords);
                Vector3f.add(new Vector3f(0F, 0F, 0F), nextPosInGunCoords, nextPosInGunCoords);
                Vector3f nextPosInPlayerCoords = new RotatedAxes(player.rotationYaw + 90F, player.rotationPitch, 0F).findLocalVectorGlobally(nextPosInGunCoords);


                if (!FlansMod.proxy.isThePlayer(player))
                    nextPosInPlayerCoords.y += 1.6F;

                Vector3f nextPosInWorldCoords = new Vector3f(player.posX + nextPosInPlayerCoords.x, player.posY + nextPosInPlayerCoords.y, player.posZ + nextPosInPlayerCoords.z);

                Vector3f dPos = data.lastMeleePositions[k] == null ? new Vector3f() : Vector3f.sub(nextPosInWorldCoords, data.lastMeleePositions[k], null);

                if (player.worldObj.isRemote && FlansMod.DEBUG && data.lastMeleePositions[k] != null)
                    player.worldObj.spawnEntityInWorld(new EntityDebugVector(player.worldObj, data.lastMeleePositions[k], dPos, 200, 1F, 0F, 0F));

                //Do the raytrace
                {
                    //Create a list for all bullet hits
                    ArrayList<BulletHit> hits = new ArrayList<BulletHit>();

                    //Iterate over all entities
                    for (int j = 0; j < world.loadedEntityList.size(); j++) {
                        Object obj = world.loadedEntityList.get(j);
                        //Get players
                        if (obj != player) {
                            if (obj instanceof EntityPlayer) {
                                EntityPlayer otherPlayer = (EntityPlayer) obj;
                                PlayerData otherData = PlayerHandler.getPlayerData(otherPlayer);
                                boolean shouldDoNormalHitDetect = false;
                                if (otherData != null) {
                                    if (otherPlayer.isDead || otherData.team == Team.spectators) {
                                        continue;
                                    }
                                    int snapshotToTry = player instanceof EntityPlayerMP ? ((EntityPlayerMP) player).ping / 50 : 0;
                                    if (snapshotToTry >= otherData.snapshots.length)
                                        snapshotToTry = otherData.snapshots.length - 1;

                                    PlayerSnapshot snapshot = otherData.snapshots[snapshotToTry];
                                    if (snapshot == null)
                                        snapshot = otherData.snapshots[0];

                                    //DEBUG
                                    //snapshot = new PlayerSnapshot(player);

                                    //Check one last time for a null snapshot. If this is the case, fall back to normal hit detection
                                    if (snapshot == null)
                                        shouldDoNormalHitDetect = true;
                                    else {
                                        //Raytrace
                                        ArrayList<BulletHit> playerHits = snapshot.raytrace(data.lastMeleePositions[k] == null ? nextPosInWorldCoords : data.lastMeleePositions[k], dPos);
                                        hits.addAll(playerHits);
                                    }
                                }

                                //If we couldn't get a snapshot, use normal entity hitbox calculations
                                if (otherData == null || shouldDoNormalHitDetect) {
                                    MovingObjectPosition mop = data.lastMeleePositions[k] == null ? player.boundingBox.calculateIntercept(nextPosInWorldCoords.toVec3(), Vec3.createVectorHelper(0F, 0F, 0F)) : player.boundingBox.calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                    if (mop != null) {
                                        Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleePositions[k].x, mop.hitVec.yCoord - data.lastMeleePositions[k].y, mop.hitVec.zCoord - data.lastMeleePositions[k].z);
                                        float hitLambda = 1F;
                                        if (dPos.x != 0F)
                                            hitLambda = hitPoint.x / dPos.x;
                                        else if (dPos.y != 0F)
                                            hitLambda = hitPoint.y / dPos.y;
                                        else if (dPos.z != 0F)
                                            hitLambda = hitPoint.z / dPos.z;
                                        if (hitLambda < 0)
                                            hitLambda = -hitLambda;

                                        hits.add(new PlayerBulletHit(new PlayerHitbox(otherPlayer, new RotatedAxes(), new Vector3f(), new Vector3f(), new Vector3f(), new Vector3f(), EnumHitboxType.BODY), hitLambda));
                                    }
                                }
                            } else {
                                Entity entity = (Entity) obj;
                                if (!entity.isDead && (entity instanceof EntityLivingBase || entity instanceof EntityAAGun) && entity.boundingBox != null && data.lastMeleePositions != null && data.lastMeleePositions[k] != null) {
                                    MovingObjectPosition mop = entity.boundingBox.calculateIntercept(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3());
                                    if (mop != null) {
                                        Vector3f hitPoint = new Vector3f(mop.hitVec.xCoord - data.lastMeleePositions[k].x, mop.hitVec.yCoord - data.lastMeleePositions[k].y, mop.hitVec.zCoord - data.lastMeleePositions[k].z);
                                        float hitLambda = 1F;
                                        if (dPos.x != 0F)
                                            hitLambda = hitPoint.x / dPos.x;
                                        else if (dPos.y != 0F)
                                            hitLambda = hitPoint.y / dPos.y;
                                        else if (dPos.z != 0F)
                                            hitLambda = hitPoint.z / dPos.z;
                                        if (hitLambda < 0)
                                            hitLambda = -hitLambda;

                                        hits.add(new EntityHit(entity, hitLambda));
                                    }
                                }
                            }
                        }
                    }

                    //We hit something
                    if (!hits.isEmpty()) {
                        //Sort the hits according to the intercept position
                        Collections.sort(hits);

                        float swingDistance = dPos.length();

                        for (BulletHit bulletHit : hits) {
                            if (!DoesHitBlock(data.lastMeleePositions[k].toVec3(), nextPosInWorldCoords.toVec3(), Math.abs(bulletHit.intersectTime), player)) {
                                if (bulletHit instanceof PlayerBulletHit) {
                                    PlayerBulletHit playerHit = (PlayerBulletHit) bulletHit;
                                    float damageMultiplier = 1F;
                                    switch (playerHit.hitbox.type) {
                                        case LEFTITEM:
                                        case RIGHTITEM: //Hit a shield. Stop the swing.
                                        {
                                            data.meleeProgress = data.meleeLength = 0;
                                            return;
                                        }
                                        case HEAD:
                                            damageMultiplier = 2F;
                                            break;
                                        case RIGHTARM:
                                        case LEFTARM:
                                            damageMultiplier = 0.6F;
                                            break;
                                        default:
                                    }

                                    if (playerHit.hitbox.player.attackEntityFrom(getMeleeDamage(player), swingDistance * type.getMeleeDamage(itemstack, false))) {
                                        //If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
                                        playerHit.hitbox.player.arrowHitTimer++;
                                        playerHit.hitbox.player.hurtResistantTime = playerHit.hitbox.player.maxHurtResistantTime / 2;
                                    }

                                    if (FlansMod.DEBUG)
                                        world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * playerHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * playerHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * playerHit.intersectTime), 1000, 1F, 0F, 0F));
                                } else if (bulletHit instanceof EntityHit) {
                                    EntityHit entityHit = (EntityHit) bulletHit;
                                    if (entityHit.entity.attackEntityFrom(DamageSource.causePlayerDamage(player), swingDistance * type.getMeleeDamage(itemstack, ((EntityHit) bulletHit).entity instanceof EntityDriveable)) && entityHit.entity instanceof EntityLivingBase) {
                                        EntityLivingBase living = (EntityLivingBase) entityHit.entity;
                                        //If the attack was allowed, we should remove their immortality cooldown so we can shoot them again. Without this, any rapid fire gun become useless
                                        living.arrowHitTimer++;
                                        living.hurtResistantTime = living.maxHurtResistantTime / 2;
                                    }

                                    if (FlansMod.DEBUG)
                                        world.spawnEntityInWorld(new EntityDebugDot(world, new Vector3f(data.lastMeleePositions[k].x + dPos.x * entityHit.intersectTime, data.lastMeleePositions[k].y + dPos.y * entityHit.intersectTime, data.lastMeleePositions[k].z + dPos.z * entityHit.intersectTime), 1000, 1F, 0F, 0F));
                                }
                            }
                        }
                    }
                }
                //End raytrace

                data.lastMeleePositions[k] = nextPosInWorldCoords;
            }

            //Increment the progress meter
            data.meleeProgress++;
            //If we are done, reset the counters
            if (data.meleeProgress == data.meleeLength)
                data.meleeProgress = data.meleeLength = 0;
        }
    }

    private void checkForLockOn(EntityPlayer player, PlayerData data) {
        if (!type.canSetPosition)
            this.impactX = this.impactY = this.impactZ = 0;

        if (lockOnSoundDelay > 0)
            lockOnSoundDelay--;

        Entity closestEntity = null;
        if (type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers || type.lockOnToVehicles) {
            for (Object obj : player.worldObj.loadedEntityList) {
                Entity entity = (Entity) obj;
                Vec3 playerVec = player.getLookVec();
                double dXYZ = Math.sqrt((entity.posX - player.posX) * (entity.posX - player.posX) + (entity.posY - player.posY) * (entity.posY - player.posY) + (entity.posZ - player.posZ) * (entity.posZ - player.posZ));
                Vector3f relPosVec = new Vector3f(entity.posX - player.posX, entity.posY - player.posY, entity.posZ - player.posZ);
                Vector3f playerVec3f = new Vector3f(playerVec.xCoord, playerVec.yCoord, playerVec.zCoord);
                float angle = Math.abs(Vector3f.angle(playerVec3f, relPosVec));
                if (angle < Math.toRadians(type.canLockOnAngle) && dXYZ < type.maxRangeLockOn) {
                    String etype = entity.getEntityData().getString("EntityType");
                    if ((type.lockOnToMechas && entity instanceof EntityMecha) ||
                            (type.lockOnToVehicles && entity instanceof EntityVehicle) ||
                            (type.lockOnToVehicles && etype.equals("Vehicle")) || // for vehicle of other Mod
                            (type.lockOnToPlanes && entity instanceof EntityPlane) ||
                            (type.lockOnToPlanes && etype.equals("Plane")) || // for plane of other Mod
                            (type.lockOnToPlayers && entity instanceof EntityPlayer) ||
                            (type.lockOnToLivings && entity instanceof EntityLivingBase)) {
                        //if(entity instanceof EntityMecha || entity instanceof EntityVehicle || entity instanceof EntityPlane || entity instanceof EntityPlayer || entity instanceof EntityLivingBase)
                        if (!data.reloadingRight)
                            closestEntity = entity;
                        //closestAngle = angle;
                    }
                }
            }

            if (closestEntity != null) {
                closestEntity.getEntityData().setBoolean("LockOn", true);
            }

            if (closestEntity != null && lockOnSoundDelay <= 0 && !player.worldObj.isRemote && player.getCurrentEquippedItem() != null) {
                if (player.getCurrentEquippedItem().getItem() instanceof ItemGun) {
                    ItemGun itemGun;
                    itemGun = (ItemGun) player.getCurrentEquippedItem().getItem();
                    PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 10, player.dimension, itemGun.type.lockOnSound, false);
                    //PacketPlaySound.sendSoundPacket(player.posX, player.posY, player.posZ, 100, player.dimension, itemGun.type.shootSound, false);
                    lockOnSoundDelay = type.lockOnSoundTime;
                    if (closestEntity instanceof EntityDriveable && ((EntityDriveable) closestEntity).getDriveableType().hasFlare) {
                        EntityDriveable entityDriveable = (EntityDriveable) closestEntity;
                        PacketPlaySound.sendSoundPacket(closestEntity.posX, closestEntity.posY, closestEntity.posZ,
                                entityDriveable.getDriveableType().lockedOnSoundRange,
                                closestEntity.dimension, entityDriveable.getDriveableType().lockingOnSound, false);
                    }
                }
            }
        }
    }

    public boolean DoesHitBlock(Vec3 startPos, Vec3 endPos, float time, EntityPlayer player) {
        Vec3 delta = endPos.subtract(startPos);
        Vec3 hitPos = endPos;

        Vec3 playerPos = Vec3.createVectorHelper(player.posX, player.posY + 1.4 + (player.worldObj.isRemote ? (player.isSneaking() ? -1.4 : -1.6) : 0), player.posZ);
        MovingObjectPosition mop = player.worldObj.rayTraceBlocks(playerPos, hitPos);

        if (mop != null) {
            player.worldObj.spawnEntityInWorld(new EntityDebugDot(player.worldObj, new Vector3f(mop.hitVec.xCoord, mop.hitVec.yCoord, mop.hitVec.zCoord), 2000, 0.5F, 1, 0.5F));
            return player.worldObj.getBlock(mop.blockX, mop.blockY, mop.blockZ).getBlockHardness(player.worldObj, mop.blockX, mop.blockY, mop.blockZ) > 0.2;
        }

        return false;
    }

    public DamageSource getMeleeDamage(EntityPlayer attacker) {
        return new EntityDamageSourceFlans(type.shortName, attacker, attacker, type, false, true);
    }

    public void onMouseHeld(ItemStack stack, World world, EntityPlayerMP player, boolean left, boolean isShooting) {
        PlayerData data = PlayerHandler.getPlayerData(player);
        if (data != null && data.shootClickDelay == 0) {
            //Drivers can't shoot
            if (player.ridingEntity instanceof EntitySeat)
                return;
            if (left && data.offHandGunSlot != 0) {
                ItemStack offHandGunStack = player.inventory.getStackInSlot(data.offHandGunSlot - 1);
                GunType gunType = ((ItemGun) offHandGunStack.getItem()).type;
                data.isShootingLeft = isShooting;
                if (gunType.getFireMode(offHandGunStack) == EnumFireMode.SEMIAUTO && isShooting) {
                    data.isShootingLeft = false;
                    player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, gunType, world, player, true));
                }
                if (gunType.getFireMode(offHandGunStack) == EnumFireMode.BURST && isShooting && data.burstRoundsRemainingLeft == 0) {
                    data.isShootingLeft = false;
                    data.burstRoundsRemainingLeft = gunType.numBurstRounds;
                    player.inventory.setInventorySlotContents(data.offHandGunSlot - 1, tryToShoot(offHandGunStack, gunType, world, player, true));
                }
            } else {
                data.isShootingRight = isShooting;
                if (type.getFireMode(stack) == EnumFireMode.SEMIAUTO && isShooting) {
                    data.isShootingRight = false;
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(stack, type, world, player, false));
                }
                if (type.getFireMode(stack) == EnumFireMode.BURST && isShooting && data.burstRoundsRemainingRight == 0) {
                    data.isShootingRight = false;
                    data.burstRoundsRemainingRight = type.numBurstRounds;
                    player.inventory.setInventorySlotContents(player.inventory.currentItem, tryToShoot(stack, type, world, player, false));
                }
            }
            //Play the warmup sound for miniguns immediately
            if (type.useLoopingSounds && isShooting) {
                data.shouldPlayWarmupSound = true;
            }
        }
    }


    public ItemStack tryToShoot(ItemStack gunStack, GunType gunType, World world, EntityPlayerMP entityplayer, boolean left) {
        sprinting = entityplayer.isSprinting();
        if (type.deployable || !type.usableByPlayers)
            return gunStack;
        PlayerData data = PlayerHandler.getPlayerData(entityplayer);
        //Shoot delay ticker is at (or below) 0. Try and shoot the next bullet
        if ((left && data.shootTimeLeft <= 0) || (!left && data.shootTimeRight <= 0)) {
            //Go through the bullet stacks in the gun and see if any of them are not null
            int bulletID = 0;
            ItemStack bulletStack = null;
            for (; bulletID < gunType.getNumAmmoItemsInGun(gunStack); bulletID++) {
                ItemStack checkingStack = getBulletItemStack(gunStack, bulletID);
                if (checkingStack != null && checkingStack.getItem() != null && checkingStack.getItemDamage() < checkingStack.getMaxDamage()) {
                    bulletStack = checkingStack;
                    break;
                }
            }
            boolean canActuallyHipFire = (gunType.hipFireWhileSprinting != 2) && !(gunType.hipFireWhileSprinting == 0 && FlansMod.disableSprintHipFireByDefault);
            //If no bullet stack was found, reload

            if (bulletStack == null && FlansMod.reloadOnRightClick) {
                int maxAmmo = type.getNumAmmoItemsInGun(gunStack);
                boolean singlesReload = maxAmmo > 1;
                int reloadCount;

                if (singlesReload) {
                    reloadCount = 0;
                    for (int i = 0; i < type.getNumAmmoItemsInGun(gunStack); i++) {
                        ItemStack oldBulletStack = ((ItemGun) gunStack.getItem()).getBulletItemStack(gunStack, i);
                        if (oldBulletStack != null && (oldBulletStack.getMaxDamage() - oldBulletStack.getItemDamage()) == 0) {
                            reloadCount += 1;
                        } else if (oldBulletStack == null) {
                            reloadCount += 1;
                        }
                    }
                } else {
                    reloadCount = 1;
                }

                if (reload(gunStack, gunType, world, entityplayer, false, left)) {
                    //Set player shoot delay to be the reload delay
                    //Set both gun delays to avoid reloading two guns at once
                    //data.shootTimeRight = data.shootTimeLeft = (int)gunType.getReloadTime(gunStack);

                    float reloadTime = singlesReload ? (type.getReloadTime(gunStack) / maxAmmo) * reloadCount : type.getReloadTime(gunStack);
                    data.shootTimeRight += reloadTime;
                    data.shootTimeLeft += reloadTime;
                    if (left) {
                        data.reloadingLeft = true;
                        data.burstRoundsRemainingLeft = 0;
                    } else {
                        data.reloadingRight = true;
                        data.burstRoundsRemainingRight = 0;
                    }
                    //Send reload packet to induce reload effects client side
                    //ItemGun.setReloadCount(gunStack, reloadCount);
                    FlansMod.getPacketHandler().sendTo(new PacketReload(left, reloadCount, (int) reloadTime, singlesReload), entityplayer);
                    //Play reload sound
                    String soundToPlay = null;
                    AttachmentType grip = gunType.getGrip(gunStack);

                    if (gunType.getSecondaryFire(gunStack) && grip != null && grip.secondaryReloadSound != null)
                        soundToPlay = grip.secondaryReloadSound;
                    else if (gunType.reloadSoundOnEmpty != null)
                        soundToPlay = gunType.reloadSoundOnEmpty;
                    else if (gunType.reloadSound != null)
                        soundToPlay = gunType.reloadSound;

                    if (soundToPlay != null) {
                        PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ,
                                type.reloadSoundRange, entityplayer.dimension, soundToPlay, true);
                    }
                } else if ((gunType.clickSoundOnEmpty != null) && canClick) {
                    PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.reloadSoundRange, entityplayer.dimension, gunType.clickSoundOnEmpty, true);
                    canClick = false;
                } else if (data.isShootingRight != lastIsShooting) {
                    PacketPlaySound.sendSoundPacket(entityplayer.posX, entityplayer.posY, entityplayer.posZ, type.reloadSoundRange, entityplayer.dimension, gunType.clickSoundOnEmptyRepeated, true);
                }

            }
            //A bullet stack was found, so try shooting with it
            else if (bulletStack != null && bulletStack.getItem() instanceof ItemShootable && ((sprinting && isScoped) || !sprinting || canActuallyHipFire) && !(entityplayer.ridingEntity instanceof EntitySeat)) {
                //Shoot
            	GunFiredEvent gunFireEvent = new GunFiredEvent(entityplayer);
            	MinecraftForge.EVENT_BUS.post(gunFireEvent);
            	if(gunFireEvent.isCanceled()) return gunStack;
            	
                shoot(gunStack, gunType, world, bulletStack, entityplayer, left);
                canClick = true;

                //Damage the bullet item
                bulletStack.setItemDamage(bulletStack.getItemDamage() + 1);

                //Update the stack in the gun
                setBulletItemStack(gunStack, bulletStack, bulletID);

                if (gunType.consumeGunUponUse)
                    return null;
            }

            if (gunType.getFireMode(gunStack) == EnumFireMode.BURST) {
                if (left && data.burstRoundsRemainingLeft > 0)
                    data.burstRoundsRemainingLeft--;
                if (!left && data.burstRoundsRemainingRight > 0)
                    data.burstRoundsRemainingRight--;
            }
        }
        return gunStack;
    }

    /**
     * Reload method. Called automatically when firing with an empty clip
     */
    public boolean reload(ItemStack gunStack, GunType gunType, World world, EntityPlayer player, boolean forceReload, boolean left) {
        return reload(gunStack, gunType, world, player, player.inventory, player.capabilities.isCreativeMode, forceReload);
    }

    /**
     * Reload method. Called automatically when firing with an empty clip
     */
    public boolean reload(ItemStack gunStack, GunType gunType, World world, Entity entity, IInventory inventory, boolean creative, boolean forceReload) {
        boolean reloadedSomething = false;

        //Load the gun without having the ammo if gunDevMode is enabled
        if (FlansMod.gunDevMode) {
            ShootableType ammo = type.getDefaultAmmo();
            if (ammo != null) {
                ItemStack stackToLoad = new ItemStack(ammo.item);
                stackToLoad.stackSize = 1;
                setBulletItemStack(gunStack, stackToLoad, 0);
                return true;
            }
        }

        //Deployable guns cannot be reloaded in the inventory
        if (gunType.deployable)
            return false;
        //Melee cannot be reloaded
        if (gunType.ammo.isEmpty())
            return false;
        //If you cannot reload half way through a clip, reject the player for trying to do so
        if (forceReload && !gunType.canForceReload)
            return false;

        String preferredAmmoShortname = ((ItemGun) gunStack.getItem()).getPreferredAmmoStack(gunStack);
        //Check each ammo slot, one at a time
        for (int i = 0; i < gunType.getNumAmmoItemsInGun(gunStack); i++) {
            //Get the stack in the slot
            ItemStack bulletStack = getBulletItemStack(gunStack, i);
            //If there is no magazine, if the magazine is empty or if this is a forced reload
            if (bulletStack == null || bulletStack.getItemDamage() == bulletStack.getMaxDamage() || forceReload) {
                //Iterate over all inventory slots and find the magazine / bullet item with the most bullets
                int bestSlot = -1;
                int bulletsInBestSlot = 0;
                boolean bestSlotIsPreferred = false;
                for (int j = 0; j < inventory.getSizeInventory(); j++) {
                    ItemStack item = inventory.getStackInSlot(j);
                    if (item != null && item.getItem() instanceof ItemShootable && gunType.isAmmo(((ItemShootable) (item.getItem())).type, gunStack)) {
                        int bulletsInThisSlot = item.getMaxDamage() - item.getItemDamage();
                        boolean isPreferred = ((ItemShootable) item.getItem()).type.shortName.equals(preferredAmmoShortname);
                        if (isPreferred) {
                            if (!bestSlotIsPreferred || bulletsInThisSlot > bulletsInBestSlot) {
                                bestSlot = j;
				                bulletsInBestSlot = bulletsInThisSlot;
                                bestSlotIsPreferred = true;
                            }
                        } else if (!bestSlotIsPreferred && bulletsInThisSlot > bulletsInBestSlot) {
                            bestSlot = j;
                            bestSlotIsPreferred = false;
                        }
                    }
                }
                //If there was a valid non-empty magazine / bullet item somewhere in the inventory, load it
                if (bestSlot != -1) {
                    ItemStack newBulletStack = inventory.getStackInSlot(bestSlot);
                    //Unload the old magazine (Drop an item if it is required and the player is not in creative mode)
                    if (bulletStack != null && bulletStack.getItem() instanceof ItemShootable && ((ItemShootable) bulletStack.getItem()).type.dropItemOnReload != null && !creative && bulletStack.getItemDamage() == bulletStack.getMaxDamage())
                        dropItem(world, entity, ((ItemShootable) bulletStack.getItem()).type.dropItemOnReload);
                    //The magazine was not finished, pull it out and give it back to the player or, failing that, drop it
                    if (bulletStack != null && bulletStack.getItemDamage() < bulletStack.getMaxDamage()) {
                        if (!InventoryHelper.addItemStackToInventory(inventory, bulletStack, creative))
                            entity.entityDropItem(bulletStack, 0.5F);
                    }

                    //Load the new magazine
                    ItemStack stackToLoad = newBulletStack.copy();
                    stackToLoad.stackSize = 1;
                    setBulletItemStack(gunStack, stackToLoad, i);

                    //Remove the magazine from the inventory
                    if (!creative)
                        newBulletStack.stackSize--;
                    if (newBulletStack.stackSize <= 0)
                        newBulletStack = null;
                    inventory.setInventorySlotContents(bestSlot, newBulletStack);

                    //Tell the sound player that we reloaded something
                    reloadedSomething = true;
                }
            }
        }

        return reloadedSomething;
    }
	
    /**
     * Method for dropping items on reload and on shoot
     */
    public static void dropItem(World world, Entity entity, String itemName) {
        if (itemName != null) {
            int damage = 0;
            if (itemName.contains(".")) {
                damage = Integer.parseInt(itemName.split("\\.")[1]);
                itemName = itemName.split("\\.")[0];
            }
            ItemStack dropStack = InfoType.getRecipeElement(itemName, damage);
            entity.entityDropItem(dropStack, 0.5F);
        }
    }


    /**
     * Method for shooting to avoid repeated code
     */
    private void shoot(ItemStack stack, GunType gunType, World world, ItemStack bulletStack, EntityPlayer entityPlayer, boolean left) {
        //flash(entityplayer);
        ShootableType bullet = ((ItemShootable) bulletStack.getItem()).type;
        boolean lastBullet = false;
        ItemStack[] bulletStacks = new ItemStack[type.getNumAmmoItemsInGun(stack)];
        for (int i = 0; i < type.getNumAmmoItemsInGun(stack); i++) {
            bulletStacks[i] = ((ItemGun) stack.getItem()).getBulletItemStack(stack, i);
            if (bulletStacks[i] != null && bulletStacks[i].getItem() instanceof ItemBullet && (bulletStacks[i].getMaxDamage() - bulletStacks[i].getItemDamage() == 1))
                lastBullet = true;
        }

        // Play a sound if the previous sound has finished
        if (soundDelay <= 0 && gunType.shootSound != null) {
            AttachmentType barrel = gunType.getBarrel(stack);
            AttachmentType grip = gunType.getGrip(stack);

            boolean silenced = barrel != null && barrel.silencer && !gunType.getSecondaryFire(stack);
            //world.playSoundAtEntity(entityplayer, type.shootSound, 10F, type.distortSound ? 1.0F / (world.rand.nextFloat() * 0.4F + 0.8F) : 1.0F);
            String soundToPlay = null;
            if (gunType.getSecondaryFire(stack) && grip != null && grip.secondaryShootSound != null)
                soundToPlay = grip.secondaryShootSound;
            else if (lastBullet && gunType.lastShootSound != null)
                soundToPlay = gunType.lastShootSound;
            else if (silenced && gunType.suppressedShootSound != null)
                soundToPlay = gunType.suppressedShootSound;
            else if (gunType.shootSound != null)
                soundToPlay = gunType.shootSound;

            if (soundToPlay != null)
                PacketPlaySound.sendSoundPacket(entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, type.gunSoundRange, entityPlayer.dimension, soundToPlay, gunType.distortSound, silenced);
            soundDelay = gunType.shootSoundLength;
            if (type.distantShootSound != null) {
                FlansMod.packetHandler.sendToDonut(new PacketPlaySound(entityPlayer.posX, entityPlayer.posY,
                        entityPlayer.posZ, type.distantShootSound), entityPlayer.posX, entityPlayer.posY,
                        entityPlayer.posZ, type.gunSoundRange, type.distantSoundRange, entityPlayer.dimension);
            }
        }

         AttachmentType barrel = gunType.getBarrel(stack);
         if ((barrel == null || !barrel.disableMuzzleFlash) && type.getShouldShowMuzzleFlash()) {
             PacketMuzzleFlash p = new PacketMuzzleFlash(entityPlayer, type.muzzleFlashParticle, type.muzzleFlashParticleSize, type.flashTexture == null, gunType.shortName);
             FlansMod.packetHandler.sendToAllAround(p, entityPlayer.posX, entityPlayer.posY, entityPlayer.posZ, 160, entityPlayer.dimension);
         }

        
        if (!world.isRemote && bulletStack.getItem() instanceof ItemShootable) {
            // Spawn the bullet entities
            ItemShootable itemShootable = (ItemShootable) bulletStack.getItem();
            ShootableType shootableType = itemShootable.type;
            int numBullets = -1;
            float spread = -1.0F;


            if (shootableType instanceof BulletType) {
                if (gunType.allowNumBulletsByBulletType) {
                    numBullets = ((BulletType) shootableType).numBullets;
                }
                if (gunType.allowSpreadByBullet) {
                    spread = ((BulletType) shootableType).bulletSpread;
                }
            }


            if (numBullets <= 0) {
                numBullets = gunType.getNumBullets(stack);
            }

            if (spread <= 0) {
                spread = gunType.getSpread(stack, entityPlayer.isSneaking(), entityPlayer.isSprinting());
            }

            for (int k = 0; k < numBullets; k++) {
                world.spawnEntityInWorld(itemShootable.getEntity(
                        world,
                        entityPlayer,
                        spread,
                        gunType.getDamage(stack),
                        gunType.getBulletSpeed(stack, bulletStack),
                        numBullets > 1,
                        bulletStack.getItemDamage(),
                        gunType));
            }
            if(!gunType.useFancyRecoil) {
                FlansMod.packetHandler.sendTo(new PacketGunRecoil(gunType.getRecoilPitch(stack, entityPlayer.isSneaking(), entityPlayer.isSprinting()), gunType.getRecoilYaw(stack, entityPlayer.isSneaking(), entityPlayer.isSprinting())), (EntityPlayerMP) entityPlayer);
            }
            // Drop item on shooting if bullet requires it
            if (bullet.dropItemOnShoot != null && !entityPlayer.capabilities.isCreativeMode)
                dropItem(world, entityPlayer, bullet.dropItemOnShoot);
            // Drop item on shooting if gun requires it
            if (gunType.dropItemOnShoot != null)// && !entityplayer.capabilities.isCreativeMode)
                dropItem(world, entityPlayer, gunType.dropItemOnShoot);
        }
        if (left)
            PlayerHandler.getPlayerData(entityPlayer).shootTimeLeft += gunType.getShootDelay(stack);
        else PlayerHandler.getPlayerData(entityPlayer).shootTimeRight += gunType.getShootDelay(stack);
    }

    /**
     * Deployable guns only
     */
    @Override
    public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer entityplayer) {
        if (type.deployable) {
            //Raytracing
            float cosYaw = MathHelper.cos(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
            float sinYaw = MathHelper.sin(-entityplayer.rotationYaw * 0.01745329F - 3.141593F);
            float cosPitch = -MathHelper.cos(-entityplayer.rotationPitch * 0.01745329F);
            float sinPitch = MathHelper.sin(-entityplayer.rotationPitch * 0.01745329F);
            double length = 5D;
            Vec3 posVec = Vec3.createVectorHelper(entityplayer.posX, entityplayer.posY + 1.62D - entityplayer.yOffset, entityplayer.posZ);
            Vec3 lookVec = posVec.addVector(sinYaw * cosPitch * length, sinPitch * length, cosYaw * cosPitch * length);
            MovingObjectPosition look = world.rayTraceBlocks(posVec, lookVec, true);

            //Result check
            if (look != null && look.typeOfHit == MovingObjectType.BLOCK) {
                if (look.sideHit == 1) {
                    int playerDir = MathHelper.floor_double(((entityplayer.rotationYaw * 4F) / 360F) + 0.5D) & 3;
                    int i = look.blockX;
                    int j = look.blockY;
                    int k = look.blockZ;
                    if (!world.isRemote) {
                        if (world.getBlock(i, j, k) == Blocks.snow) {
                            j--;
                        }
                        if (isSolid(world, i, j, k) && (world.getBlock(i, j + 1, k) == Blocks.air || world.getBlock(i, j + 1, k) == Blocks.snow) && (world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j + 1, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.air) && (world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.air || world.getBlock(i + (playerDir == 1 ? 1 : 0) - (playerDir == 3 ? 1 : 0), j, k - (playerDir == 0 ? 1 : 0) + (playerDir == 2 ? 1 : 0)) == Blocks.snow)) {
                            for (EntityMG mg : EntityMG.mgs) {
                                if (mg.blockX == i && mg.blockY == j + 1 && mg.blockZ == k && !mg.isDead)
                                    return itemstack;
                            }
                            if (!world.isRemote) {
                                world.spawnEntityInWorld(new EntityMG(world, i, j + 1, k, playerDir, type));
                            }
                            if (!entityplayer.capabilities.isCreativeMode)
                                itemstack.stackSize = 0;
                        }
                    }
                }
            }
        }
        //Stop the gun bobbing up and down when holding shoot and looking at a block
        if (world.isRemote) {
            for (int i = 0; i < 3; i++)
                Minecraft.getMinecraft().entityRenderer.itemRenderer.updateEquippedItem();
        }
        return itemstack;
    }

    private boolean isSolid(World world, int i, int j, int k) {
        Block block = world.getBlock(i, j, k);
        return block != null && block.getMaterial().isSolid() && block.isOpaqueCube();
    }

    //Stop damage being done to entities when scoping etc.
    @Override
    public boolean onLeftClickEntity(ItemStack stack, EntityPlayer player, Entity entity) {
        return type.secondaryFunction != EnumSecondaryFunction.MELEE;
    }

    @Override
    public boolean isFull3D() {
        return true;
    }

    @Override
    public boolean onEntitySwing(EntityLivingBase entityLiving, ItemStack stack) {
        if (type.meleeSound != null)
            PacketPlaySound.sendSoundPacket(entityLiving.posX, entityLiving.posY, entityLiving.posZ, type.meleeSoundRange, entityLiving.dimension, type.meleeSound, true);
        //Do custom melee code here
        if (type.secondaryFunction == EnumSecondaryFunction.CUSTOM_MELEE) {
            //Do animation
            if (entityLiving.worldObj.isRemote) {
                GunAnimations animations = FlansModClient.getGunAnimations(entityLiving, false);
                animations.doMelee(type.meleeTime);
            }
            //Do custom melee hit detection
            if (entityLiving instanceof EntityPlayer) {
                PlayerData data = PlayerHandler.getPlayerData((EntityPlayer) entityLiving);
                data.doMelee((EntityPlayer) entityLiving, type.meleeTime, type);
            }
        }
        return type.secondaryFunction != EnumSecondaryFunction.MELEE;
    }

    @Override
    public boolean onBlockStartBreak(ItemStack itemstack, int X, int Y, int Z, EntityPlayer player) {
        return true;
    }

    @Override
    public boolean func_150897_b(Block p_150897_1_) {
        return false;
    }

    @SubscribeEvent
    public void onEventBlockBreak(BlockEvent.BreakEvent event) {
        EntityPlayer player = event.getPlayer();
        if (player != null && player.getHeldItem() != null) {
            if (player.getHeldItem().getItem() instanceof ItemGun) {
                event.setCanceled(true);
            }
        }
    }

    @SubscribeEvent
    public void onPlayerInteract(PlayerInteractEvent event) {
        if (event.action != PlayerInteractEvent.Action.RIGHT_CLICK_BLOCK)
            return;
        EntityPlayer player = event.entityPlayer;
        if (player == null || player.getHeldItem() == null)
            return;
        if (!(player.getHeldItem().getItem() instanceof ItemGun))
            return;

        if (FlansMod.holdingGunsDisablesAll)
            event.setCanceled(true);

        TileEntity tileEntity = event.world.getTileEntity(event.x, event.y, event.z);
        if (FlansMod.holdingGunsDisablesChests && tileEntity != null && tileEntity instanceof IInventory)
            event.setCanceled(true);
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        return type.colour;
    }


    public boolean isItemStackDamageable() {
        return true;
    }

    // ----------------- Paintjobs -----------------

    @Override
    public void getSubItems(Item item, CreativeTabs tabs, List list) {
        PaintableType type = ((IPaintableItem) item).GetPaintableType();
        if (FlansMod.addAllPaintjobsToCreative) {
            for (Paintjob paintjob : type.paintjobs)
                addPaintjobToList(item, type, paintjob, list);
        } else addPaintjobToList(item, type, type.defaultPaintjob, list);
    }

    private void addPaintjobToList(Item item, PaintableType type, Paintjob paintjob, List list) {
        ItemStack paintableStack = new ItemStack(item, 1, paintjob.ID);
        NBTTagCompound tags = new NBTTagCompound();
        paintableStack.setTagCompound(tags);
        list.add(paintableStack);
    }

    // ---------------------------------------------

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        icons = new IIcon[type.paintjobs.size()];

        defaultIcon = icon.registerIcon("flansmod:null");
        itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
        for (int i = 0; i < type.paintjobs.size(); i++) {
            icons[i] = icon.registerIcon("FlansMod:" + type.paintjobs.get(i).iconName);
        }
    }

    @SideOnly(Side.CLIENT)
    public IIcon getIconIndex(ItemStack stack)
    {
        try {
            if (stack.getItemDamage() < icons.length) {
                return icons[stack.getItemDamage()];
            } else {
                return icons[0];
            }
        } catch (NullPointerException e) {
            return null;
        }
    }

    @Override
    public int getMaxItemUseDuration(ItemStack par1ItemStack) {
        return 100;
    }

    @Override
    public EnumAction getItemUseAction(ItemStack par1ItemStack) {
        return type != null ? type.itemUseAction : EnumAction.bow;
    }

    @Override
    public Multimap getAttributeModifiers(ItemStack stack) {
        Multimap map = super.getAttributeModifiers(stack);
        map.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "KnockbackResist", type.knockbackModifier, 0));
        map.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "MovementSpeed", type.getMovementSpeed(stack) - 1F, 2));
        if (type.secondaryFunction == EnumSecondaryFunction.MELEE)
            map.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier", type.meleeDamage, 0));
        return map;
    }

    //Round values to n number of decimal points
    public static float roundFloat(float value, int points) {
        int pow = 10;
        for (int i = 1; i < points; i++)
            pow *= 10;
        float result = value * pow;

        return (float) (int) ((result - (int) result) >= 0.5f ? result + 1 : result) / pow;
    }
	
    public void setPreferredAmmoStack(ItemStack gun, String ammoName) {
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }
        String s = "preferredAmmo";
        if (!gun.stackTagCompound.hasKey(s)) {
            gun.stackTagCompound.setString(s, ammoName);
        }
        gun.stackTagCompound.setString(s, ammoName);
    }

    public String getPreferredAmmoStack(ItemStack gun) {
        if (!gun.hasTagCompound()) {
            gun.stackTagCompound = new NBTTagCompound();
        }
        String s = "preferredAmmo";
        if (!gun.stackTagCompound.hasKey(s)) {
            setPreferredAmmoStack(gun,type.ammo.get(0).shortName);
        }
        return gun.stackTagCompound.getString(s);
    }
}
