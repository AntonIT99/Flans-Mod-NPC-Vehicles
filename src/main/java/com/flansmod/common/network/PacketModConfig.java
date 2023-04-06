package com.flansmod.common.network;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.flansmod.common.FlansMod;

import cpw.mods.fml.common.network.ByteBufUtils;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;

public class PacketModConfig extends PacketBase {
    boolean enableKillMessages;
    public boolean hitCrossHairEnable;
    public boolean bulletGuiEnable;
    public boolean fancyBulletGui;
    public boolean crosshairEnable;
    public boolean gunCarryLimitEnable;
    public int gunCarryLimit;
    public boolean realisticRecoil;
    public boolean enableSightDownwardMovement;
    public int armourEnchantability;
    public boolean hashKick;
    public boolean disableSprintHipFireByDefault;
    public boolean useNewPenSystem;
    public boolean gunsWorkInDeadParts;
    public boolean showDistanceInKillMessage;
    public boolean driveableHitboxes;
    public float driveableUpdateRange;
    public boolean reloadOnRightClick;
    public float defaultADSSpreadMultiplier;
    public float defaultADSSpreadMultiplierShotgun;
    public boolean seatCollisions;
    public boolean muzzleFlashParticles;
    public boolean showWoundFlashes;
    public float wheelSeatExpModifier;
    public boolean showPackItemDescription;
    public float masterDamageModifier;
    public float masterHeadshotModifier;
    public float masterLegModifier;
    public float masterRecoilModifier;
    public boolean masterDualWieldDisable;
    public boolean gunDevMode;
    public float nameTagRenderRange;
    public float nameTagSneakRenderRange;
    public float maxHealth;

    public int bonusRegenTickDelay;
    public int bonusRegenFoodLimit;
    public float bonusRegenAmount;

    public boolean allowCombiningAmmoOnReload;
    
    public boolean enableBlockPenetration;
    public float masterBlockPenetrationModifier;
    public String[] penetrableBlocksArray;


    public PacketModConfig() {
        enableKillMessages = FlansMod.enableKillMessages;
        hitCrossHairEnable = FlansMod.hitCrossHairEnable;
        bulletGuiEnable = FlansMod.bulletGuiEnable;
        fancyBulletGui = FlansMod.fancyBulletGui;
        crosshairEnable = FlansMod.crosshairEnable;
        gunCarryLimitEnable = FlansMod.gunCarryLimitEnable;
        gunCarryLimit = FlansMod.gunCarryLimit;
        realisticRecoil = FlansMod.realisticRecoil;
        enableSightDownwardMovement = FlansMod.enableSightDownwardMovement;
        armourEnchantability = FlansMod.armourEnchantability;
        hashKick = FlansMod.kickNonMatchingHashes;
        disableSprintHipFireByDefault= FlansMod.disableSprintHipFireByDefault;
        useNewPenSystem = FlansMod.useNewPenetrationSystem;
        gunsWorkInDeadParts = FlansMod.gunsInDeadPartsWork;
        showDistanceInKillMessage = FlansMod.showDistanceInKillMessage;
        driveableHitboxes = FlansMod.driveableHitboxes;
        driveableUpdateRange = FlansMod.driveableUpdateRange;
        reloadOnRightClick = FlansMod.reloadOnRightClick;
        defaultADSSpreadMultiplier = FlansMod.defaultADSSpreadMultiplier;
        defaultADSSpreadMultiplierShotgun = FlansMod.defaultADSSpreadMultiplierShotgun;
        seatCollisions = FlansMod.seatCollisions;
        muzzleFlashParticles = FlansMod.showMuzzleFlashParticlesDefault;
        showWoundFlashes = FlansMod.showFlashesWhenWounded;
        wheelSeatExpModifier = FlansMod.vehicleWheelSeatExplosionModifier;
        showPackItemDescription = FlansMod.showPackNameInItemDescriptions;
        masterDamageModifier = FlansMod.masterDamageModifier;
        masterHeadshotModifier = FlansMod.masterHeadshotModifier;
        masterLegModifier = FlansMod.masterLegModifier;
        masterRecoilModifier = FlansMod.masterRecoilModifier;
        masterDualWieldDisable = FlansMod.masterDualWieldDisable;
        gunDevMode = FlansMod.gunDevMode;
        nameTagRenderRange = FlansMod.nameTagRenderRange;
        nameTagSneakRenderRange = FlansMod.nameTagSneakRenderRange;
        maxHealth = FlansMod.maxHealth;

        bonusRegenTickDelay = FlansMod.bonusRegenTickDelay;
        bonusRegenFoodLimit = FlansMod.bonusRegenFoodLimit;
        bonusRegenAmount = FlansMod.bonusRegenAmount;

        allowCombiningAmmoOnReload = FlansMod.allowCombiningAmmoOnReload;
        
        enableBlockPenetration = FlansMod.enableBlockPenetration;
        masterBlockPenetrationModifier = FlansMod.masterBlockPenetrationModifier;
        penetrableBlocksArray = FlansMod.penetrableBlocksArray;
    }

    @Override
    public void encodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        data.writeBoolean(enableKillMessages);
        data.writeBoolean(hitCrossHairEnable);
        data.writeBoolean(bulletGuiEnable);
        data.writeBoolean(fancyBulletGui);
        data.writeBoolean(crosshairEnable);
        data.writeBoolean(gunCarryLimitEnable);
        data.writeInt(gunCarryLimit);
        data.writeBoolean(realisticRecoil);
        data.writeBoolean(enableSightDownwardMovement);
        data.writeInt(armourEnchantability);
        data.writeBoolean(hashKick);
        data.writeBoolean(disableSprintHipFireByDefault);
        data.writeBoolean(useNewPenSystem);
        data.writeBoolean(gunsWorkInDeadParts);
        data.writeBoolean(showDistanceInKillMessage);
        data.writeBoolean(driveableHitboxes);
        data.writeFloat(driveableUpdateRange);
        data.writeBoolean(reloadOnRightClick);
        data.writeFloat(defaultADSSpreadMultiplier);
        data.writeFloat(defaultADSSpreadMultiplierShotgun);
        data.writeBoolean(seatCollisions);
        data.writeBoolean(muzzleFlashParticles);
        data.writeBoolean(showWoundFlashes);
        data.writeFloat(wheelSeatExpModifier);
        data.writeBoolean(showPackItemDescription);
        data.writeFloat(masterDamageModifier);
        data.writeFloat(masterHeadshotModifier);
        data.writeFloat(masterLegModifier);
        data.writeFloat(masterRecoilModifier);
        data.writeBoolean(masterDualWieldDisable);
        data.writeBoolean(gunDevMode);
        data.writeFloat(nameTagRenderRange);
        data.writeFloat(nameTagSneakRenderRange);
        data.writeFloat(maxHealth);

        data.writeInt(bonusRegenTickDelay);
        data.writeInt(bonusRegenFoodLimit);
        data.writeFloat(bonusRegenAmount);

        data.writeBoolean(allowCombiningAmmoOnReload);
              
        data.writeBoolean(enableBlockPenetration);
        data.writeFloat(masterBlockPenetrationModifier);
        data.writeInt(penetrableBlocksArray.length);
        for(String s : penetrableBlocksArray) {
        	 writeUTF(data, s);
        }
		
    }

    @Override
    public void decodeInto(ChannelHandlerContext ctx, ByteBuf data) {
        enableKillMessages = data.readBoolean();
        hitCrossHairEnable = data.readBoolean();
        bulletGuiEnable = data.readBoolean();
        fancyBulletGui = data.readBoolean();
        crosshairEnable = data.readBoolean();
        gunCarryLimitEnable = data.readBoolean();
        gunCarryLimit = data.readInt();
        realisticRecoil = data.readBoolean();
        enableSightDownwardMovement = data.readBoolean();
        armourEnchantability = data.readInt();
        hashKick = data.readBoolean();
        disableSprintHipFireByDefault = data.readBoolean();
        useNewPenSystem = data.readBoolean();
        gunsWorkInDeadParts = data.readBoolean();
        showDistanceInKillMessage = data.readBoolean();
        driveableHitboxes = data.readBoolean();
        driveableUpdateRange = data.readFloat();
        reloadOnRightClick = data.readBoolean();
        defaultADSSpreadMultiplier = data.readFloat();
        defaultADSSpreadMultiplierShotgun = data.readFloat();
        seatCollisions = data.readBoolean();
        muzzleFlashParticles = data.readBoolean();
        showWoundFlashes = data.readBoolean();
        wheelSeatExpModifier = data.readFloat();
        showPackItemDescription = data.readBoolean();
        masterDamageModifier = data.readFloat();
        masterHeadshotModifier = data.readFloat();
        masterLegModifier = data.readFloat();
        masterRecoilModifier = data.readFloat();
        masterDualWieldDisable = data.readBoolean();
        gunDevMode = data.readBoolean();
        nameTagRenderRange = data.readFloat();
        nameTagSneakRenderRange = data.readFloat();
        maxHealth = data.readFloat();

        bonusRegenTickDelay = data.readInt();
        bonusRegenFoodLimit = data.readInt();
        bonusRegenAmount = data.readFloat();
        
        allowCombiningAmmoOnReload = data.readBoolean();
        
        enableBlockPenetration = data.readBoolean();
        masterBlockPenetrationModifier = data.readFloat();
        int penetrableBlocksArrayLength = data.readInt();
        String[] penetrableBlocksArray = new String[penetrableBlocksArrayLength];        
        for(int i = 0; i < penetrableBlocksArrayLength; i++) {
        	penetrableBlocksArray[i] = readUTF(data);
        }
        this.penetrableBlocksArray = penetrableBlocksArray;
    }

    @Override
    public void handleServerSide(EntityPlayerMP playerEntity) {

    }

    @Override
    @SideOnly(Side.CLIENT)
    public void handleClientSide(EntityPlayer clientPlayer) {
        FlansMod.enableKillMessages = enableKillMessages;
        FlansMod.hitCrossHairEnable = hitCrossHairEnable;
        FlansMod.bulletGuiEnable = bulletGuiEnable;
        FlansMod.fancyBulletGui = fancyBulletGui;
        FlansMod.crosshairEnable = crosshairEnable;
        FlansMod.gunCarryLimitEnable = gunCarryLimitEnable;
        FlansMod.gunCarryLimit = gunCarryLimit;
        FlansMod.realisticRecoil = realisticRecoil;
        FlansMod.enableSightDownwardMovement = enableSightDownwardMovement;
        FlansMod.armourEnchantability = armourEnchantability;
        FlansMod.kickNonMatchingHashes = hashKick;
        FlansMod.disableSprintHipFireByDefault = disableSprintHipFireByDefault;
        FlansMod.useNewPenetrationSystem = useNewPenSystem;
        FlansMod.gunsInDeadPartsWork = gunsWorkInDeadParts;
        FlansMod.showDistanceInKillMessage = showDistanceInKillMessage;
        FlansMod.driveableHitboxes = driveableHitboxes;
        FlansMod.driveableUpdateRange = driveableUpdateRange;
        FlansMod.reloadOnRightClick = reloadOnRightClick;
        FlansMod.defaultADSSpreadMultiplier = defaultADSSpreadMultiplier;
        FlansMod.defaultADSSpreadMultiplierShotgun = defaultADSSpreadMultiplierShotgun;
        FlansMod.seatCollisions = seatCollisions;
        FlansMod.showMuzzleFlashParticlesDefault = muzzleFlashParticles;
        FlansMod.showFlashesWhenWounded = showWoundFlashes;
        FlansMod.vehicleWheelSeatExplosionModifier = wheelSeatExpModifier;
        FlansMod.showPackNameInItemDescriptions = showPackItemDescription;
        FlansMod.masterDamageModifier = masterDamageModifier;
        FlansMod.masterHeadshotModifier = masterHeadshotModifier;
        FlansMod.masterLegModifier = masterLegModifier;
        FlansMod.masterRecoilModifier = masterRecoilModifier;
        FlansMod.masterDualWieldDisable = masterDualWieldDisable;
        FlansMod.gunDevMode = gunDevMode;
        FlansMod.nameTagRenderRange = nameTagRenderRange;
        FlansMod.nameTagSneakRenderRange = nameTagSneakRenderRange;
        FlansMod.maxHealth = maxHealth;

        FlansMod.bonusRegenTickDelay = bonusRegenTickDelay;
        FlansMod.bonusRegenFoodLimit = bonusRegenFoodLimit;
        FlansMod.bonusRegenAmount = bonusRegenAmount;
        
        FlansMod.allowCombiningAmmoOnReload = allowCombiningAmmoOnReload;
        
        FlansMod.enableBlockPenetration = enableBlockPenetration;
        FlansMod.masterBlockPenetrationModifier = masterBlockPenetrationModifier;
        FlansMod.penetrableBlocksArray = penetrableBlocksArray;
        FlansMod.convertPenetrableBlocksArray(penetrableBlocksArray);

        FlansMod.log("Config synced successfully");
    }
}
