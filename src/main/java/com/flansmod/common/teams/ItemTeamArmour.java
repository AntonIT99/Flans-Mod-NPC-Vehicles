package com.flansmod.common.teams;

import java.util.Collections;
import java.util.List;
import java.util.UUID;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.EntityDamageSourceIndirect;
import net.minecraft.world.World;
import net.minecraftforge.common.ISpecialArmor;
import net.minecraftforge.common.util.EnumHelper;

import com.flansmod.common.FlansMod;
import com.flansmod.common.guns.EntityDamageSourceFlans;
import com.flansmod.common.types.IFlanItem;
import com.flansmod.common.types.InfoType;
import com.google.common.collect.Multimap;

import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemTeamArmour extends ItemArmor implements ISpecialArmor, IFlanItem {
    public ArmourType type;
    protected static final UUID[] uuid = new UUID[]{UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID()};
    public static ArmorMaterial armorMat = EnumHelper.addArmorMaterial("FLANSARMOR", 10, new int[]{1, 3, 2, 1}, FlansMod.armourEnchantability);

    public ItemTeamArmour(ArmourType t) {
        super(armorMat, 0, t.type);
        type = t;
        type.item = this;
        setCreativeTab(FlansMod.tabFlanTeams);
        if (t.durability > 0) setMaxDamage(t.durability);
        else if (FlansMod.breakableArmor == 1)
            setMaxDamage(FlansMod.defaultArmorDurability);
        GameRegistry.registerItem(this, type.shortName, FlansMod.MODID);
    }

    public ItemTeamArmour(ItemArmor.ArmorMaterial armorMaterial, int renderIndex, int armourType) {
        super(armorMaterial, renderIndex, armourType);
    }

    @Override
    public ArmorProperties getProperties(EntityLivingBase player, ItemStack armor, DamageSource source, double damage, int slot) {
        if (source instanceof EntityDamageSourceFlans && !((EntityDamageSourceFlans) source).melee) {
            return new ArmorProperties(1, type.bulletDefence, Integer.MAX_VALUE);
        } else {
            return new ArmorProperties(1, type.defence, Integer.MAX_VALUE);

        }
    }

    @Override
    public int getArmorDisplay(EntityPlayer player, ItemStack armor, int slot) {
        return (int) (type.defence * 20);
    }

    @Override
    public void damageArmor(EntityLivingBase entity, ItemStack stack, DamageSource source, int damage, int slot) {
        //0 = Non-breakable, 1 = All breakable, 2 = Refer to armor config
        int breakType = FlansMod.breakableArmor;
        if (breakType == 2 && type.hasDurability || breakType == 1) {
            stack.damageItem(damage, entity);
        }
    }

    @Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String s) {
        return "flansmod:armor/" + type.armourTextureName + "_" + (type.type == 2 ? "2" : "1") + ".png";
    }

    @SuppressWarnings("unchecked")
    @Override
    public void addInformation(ItemStack stack, EntityPlayer player, List lines, boolean b) {
        if (type.description != null) {
            Collections.addAll(lines, type.description.split("_"));
        }
        if (Math.abs(type.jumpModifier - 1F) > 0.01F)
            lines.add("\u00a73+" + (int) ((type.jumpModifier - 1F) * 100F) + "% Jump Height");
        if (type.smokeProtection)
            lines.add("\u00a72+Smoke Protection");
        if (type.nightVision)
            lines.add("\u00a72+Night Vision");
        if (type.invisible)
            lines.add("\u00a72+Invisibility");
        if (type.negateFallDamage)
            lines.add("\u00a72+Negates Fire Damage");
        if (type.fireResistance)
            lines.add("\u00a72+Fire Resistance");
        if (type.waterBreathing)
            lines.add("\u00a72+Water Breathing");
    }

    @Override
    @SideOnly(Side.CLIENT)
    public int getColorFromItemStack(ItemStack par1ItemStack, int par2) {
        return type.colour;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public boolean requiresMultipleRenderPasses() {
        return false;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public void registerIcons(IIconRegister icon) {
        itemIcon = icon.registerIcon("FlansMod:" + type.iconPath);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public Multimap getAttributeModifiers(ItemStack stack) {
        Multimap map = super.getAttributeModifiers(stack);
        map.put(SharedMonsterAttributes.knockbackResistance.getAttributeUnlocalizedName(), new AttributeModifier(uuid[type.type], "KnockbackResist", type.knockbackModifier, 0));
        map.put(SharedMonsterAttributes.movementSpeed.getAttributeUnlocalizedName(), new AttributeModifier(uuid[type.type], "MovementSpeed", type.moveSpeedModifier - 1F, 2));
        return map;
    }

    @Override
    @SideOnly(Side.CLIENT)
    public ModelBiped getArmorModel(EntityLivingBase entityLiving, ItemStack itemStack, int armorSlot) {
        return type.model;
    }

    @Override
    public InfoType getInfoType() {
        return type;
    }

    @Override
    public void onArmorTick(World world, EntityPlayer player, ItemStack itemStack) {
        if (type.nightVision && FlansMod.ticker % 25 == 0)
            player.addPotionEffect(new PotionEffect(Potion.nightVision.id, 250));
        if (type.invisible && FlansMod.ticker % 25 == 0)
            player.addPotionEffect(new PotionEffect(Potion.invisibility.id, 250));
        if (type.jumpModifier > 1.01F && FlansMod.ticker % 25 == 0)
            player.addPotionEffect(new PotionEffect(Potion.jump.id, 250, (int) ((type.jumpModifier - 1F) * 2F), true));
        if (type.negateFallDamage)
            player.fallDistance = 0F;
        if (type.fireResistance && FlansMod.ticker % 25 == 0)
            player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 250));
        if (type.waterBreathing && FlansMod.ticker % 25 == 0)
            player.addPotionEffect(new PotionEffect(Potion.waterBreathing.id, 250));
        if (type.onWaterWalking) {
            if (player.isInWater()) {
                player.capabilities.allowFlying = true;
            } else {
                player.capabilities.isFlying = false;
            }
        }
    }
}
