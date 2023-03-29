package com.flansmod.common.guns;

import java.util.Collections;
import java.util.List;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

import com.flansmod.common.FlansMod;
import com.flansmod.common.driveables.EnumWeaponType;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.flansmod.common.types.IGunboxDescriptionable;
import com.flansmod.common.vector.Vector3f;

import net.minecraft.client.settings.KeyBinding;
import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.GameSettings;

/**
 * Implemented from old source.
 */
public class ItemBullet extends ItemShootable implements IFlanItem, IGunboxDescriptionable {
    public BulletType type;

    public String originGunbox = "";
    
    public String getOriginGunBox() { return originGunbox; }
    public void setOriginGunBox(String e) { originGunbox = e; }

    public ItemBullet(BulletType infoType) {
        super(infoType);
        type = infoType;
        setMaxStackSize(type.maxStackSize);
        setHasSubtypes(true);
        type.item = this;
        switch (type.weaponType) {
            case SHELL:
            case BOMB:
            case MINE:
            case MISSILE:
                setCreativeTab(FlansMod.tabFlanDriveables);
                break;
            default:
                setCreativeTab(FlansMod.tabFlanGuns);
        }
    }

    public boolean isRepairable() {
        return canRepair;
    }

    @SideOnly(Side.CLIENT)
    @Override
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        return type.colour;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b) {
        if (type.fancyDescription && FlansMod.showItemDescriptions) {
            KeyBinding shift = Minecraft.getMinecraft().gameSettings.keyBindSneak;

            if (!type.packName.isEmpty() && FlansMod.showPackNameInItemDescriptions) {
                lines.add("\u00a7o" + type.packName);
            }
            if (type.description != null) {
                Collections.addAll(lines, type.description.split("_"));
            }
            //Reveal all the bullet stats when holding down the sneak key
            if (!GameSettings.isKeyDown(shift)) {
                lines.add("Hold \u00a7b\u00a7o" + GameSettings.getKeyDisplayString(shift.getKeyCode()) + "\u00a7r\u00a77 for details");
            } else {
                lines.add("");
                if (originGunbox != "") {
                    lines.add("\u00a79Box" + "\u00a77: " + originGunbox);
                }
                lines.add("\u00a79Damage" + "\u00a77: " + roundFloat(type.damageVsLiving, 2));
                lines.add("\u00a79Penetration" + "\u00a77: " + roundFloat(type.penetratingPower, 2));
                lines.add("\u00a79Rounds" + "\u00a77: " + type.roundsPerItem);
                lines.add("\u00a79Fall Speed" + "\u00a77: " + roundFloat(type.fallSpeed, 2));

                if (type.explosionRadius > 0) {
                    lines.add("\u00a79Explosion Radius" + "\u00a77: " + roundFloat(type.explosionRadius, 2));
                    lines.add("\u00a79Explosion Power" + "\u00a77: " + roundFloat(type.explosionPower, 2));
                }
                if (type.numBullets > -1) {
                    lines.add("\u00a79Shot" + "\u00a77: " + type.numBullets);
                }

                if (type.bulletSpread > -1) {
                    lines.add("\u00a79Spread" + "\u00a77: " + type.bulletSpread);
                }
                if (type.lockOnToLivings || type.lockOnToMechas || type.lockOnToPlanes || type.lockOnToPlayers || type.lockOnToVehicles) {
                    lines.add("\u00a79Guidance:" + "\u00a77: " + "LockOn");
                } else if (type.manualGuidance) {
                    lines.add("\u00a79Guidance:" + "\u00a77: " + "Manual");
                } else if (type.laserGuidance) {
                    lines.add("\u00a79Guidance:" + "\u00a77: " + "Laser");
                } else if (type.weaponType == EnumWeaponType.MISSILE) {
                    lines.add("\u00a79Guidance:" + "\u00a77: " + "Unguided");
                }

                lines.add("");

            }
        } else {
            if (!type.packName.isEmpty() && FlansMod.showPackNameInItemDescriptions) {
                lines.add(type.packName);
            }
            if (type.description != null) {
                Collections.addAll(lines, type.description.split("_"));
            }
        }
        
    }

    //Can be overriden to allow new types of bullets to be created, for planes
    public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw,
                                     float pitch, double motionX, double motionY, double motionZ,
                                     EntityLivingBase shooter, float gunDamage, int itemDamage, InfoType shotFrom) {
        return new EntityBullet(worldObj, origin, yaw, pitch, motionX, motionY, motionZ, shooter, gunDamage, this.type, shotFrom);
    }

    //Can be overriden to allow new types of bullets to be created, vector constructor
    public EntityShootable getEntity(World worldObj, Vector3f origin, Vector3f direction,
                                     EntityLivingBase shooter, float spread, float damage, float speed, int itemDamage, InfoType shotFrom) {
        return new EntityBullet(worldObj, origin, direction, shooter, spread, damage, this.type, speed, shotFrom);
    }

    //Can be overriden to allow new types of bullets to be created, AA/MG constructor
    public EntityShootable getEntity(World worldObj, Vec3 origin, float yaw,
                                     float pitch, EntityLivingBase shooter, float spread, float damage, float speed,
                                     int itemDamage, InfoType shotFrom) {
        return new EntityBullet(worldObj, origin, yaw, pitch, shooter, spread, damage, this.type, speed, shotFrom);
    }

    //Can be overriden to allow new types of bullets to be created, Handheld constructor
    public EntityShootable getEntity(World worldObj, EntityLivingBase player,
                                     float bulletSpread, float damage, float bulletSpeed, boolean b,
                                     int itemDamage, InfoType shotFrom) {
        return new EntityBullet(worldObj, player, bulletSpread, damage, this.type, bulletSpeed, b, shotFrom);
    }

    @Override
    public InfoType getInfoType() {
        return type;
    }
    
    public static float roundFloat(float value, int points) {
        int pow = 10;
        for (int i = 1; i < points; i++)
            pow *= 10;
        float result = value * pow;

        return (float) (int) ((result - (int) result) >= 0.5f ? result + 1 : result) / pow;
    }
}
