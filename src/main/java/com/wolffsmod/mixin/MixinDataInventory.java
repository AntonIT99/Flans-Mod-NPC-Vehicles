package com.wolffsmod.mixin;

import com.flansmod.common.driveables.DriveableType;
import com.flansmod.common.driveables.ItemPlane;
import com.flansmod.common.driveables.ItemVehicle;
import com.flansmod.common.guns.AAGunType;
import com.flansmod.common.guns.GunType;
import com.flansmod.common.guns.ItemAAGun;
import com.flansmod.common.guns.ItemGun;
import com.flansmod.common.guns.ItemShootable;
import com.flansmod.common.guns.ShootableType;
import com.flansmod.common.teams.ItemTeamArmour;
import com.wolffsmod.customnpc.IMixinDataInventory;
import com.wolffsmod.customnpc.IMixinEntityNPCInterface;
import com.wolffsmod.customnpc.NPCInterfaceUtil;
import com.wolffsmod.flan.FlanUtils;
import noppes.npcs.DataInventory;
import noppes.npcs.constants.EnumNpcToolMaterial;
import noppes.npcs.constants.EnumParticleType;
import noppes.npcs.constants.EnumPotionType;
import noppes.npcs.enchants.EnchantInterface;
import noppes.npcs.entity.EntityNPCInterface;
import noppes.npcs.items.ItemCrossbow;
import noppes.npcs.items.ItemKunai;
import noppes.npcs.items.ItemMusket;
import noppes.npcs.items.ItemSlingshot;
import noppes.npcs.items.ItemStaff;
import noppes.npcs.items.ItemThrowingWeapon;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import net.minecraft.inventory.IInventory;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.concurrent.atomic.AtomicReference;

@Mixin(value = DataInventory.class)
public abstract class MixinDataInventory implements IMixinDataInventory, IInventory
{
    @Unique
    private boolean useWeaponMeleeStats = false;
    @Unique
    private boolean useWeaponRangedStats = false;
    @Unique
    private boolean useArmorStats = false;
    @Unique
    private boolean useDriveableStats = false;

    @Shadow(remap = false)
    public HashMap<Integer,ItemStack> weapons;
    @Shadow(remap = false)
    public HashMap<Integer,ItemStack> armor;
    @Shadow(remap = false)
    private EntityNPCInterface npc;

    @Inject(method = "writeEntityToNBT", at = @At(value = "TAIL"), remap = false)
    private void onWriteEntityToNBT(NBTTagCompound nbttagcompound, CallbackInfoReturnable<NBTTagCompound> cir)
    {
        nbttagcompound.setBoolean("UseWeaponMeleeStats", useWeaponMeleeStats);
        nbttagcompound.setBoolean("UseWeaponRangedStats", useWeaponRangedStats);
        nbttagcompound.setBoolean("UseArmorStats", useArmorStats);
        nbttagcompound.setBoolean("UseDriveableStats", useDriveableStats);
    }

    @Inject(method = "readEntityFromNBT", at = @At(value = "TAIL"), remap = false)
    public void onReadEntityFromNBT(NBTTagCompound nbttagcompound, CallbackInfo callbackInfo)
    {
        useWeaponMeleeStats = nbttagcompound.getBoolean("UseWeaponMeleeStats");
        useWeaponRangedStats = nbttagcompound.getBoolean("UseWeaponRangedStats");
        useArmorStats = nbttagcompound.getBoolean("UseArmorStats");
        useDriveableStats = nbttagcompound.getBoolean("UseDriveableStats");
    }

    @Inject(method = "setWeapons", at = @At(value = "TAIL"), remap = false)
    private void onSetWeapons(HashMap<Integer, ItemStack> list, CallbackInfo callbackInfo)
    {
        setWeaponStats();
        setKnockbackResistance(weapons, armor);
        setDriveableStats();
    }

    @Inject(method = "setArmor", at = @At(value = "TAIL"), remap = false)
    private void onSetArmor(HashMap<Integer, ItemStack> list, CallbackInfo callbackInfo)
    {
        setArmorStats(armor);
        setKnockbackResistance(weapons, armor);
    }

    @Inject(method = "setWeapon", at = @At(value = "TAIL"), remap = false)
    private void onSetWeapon(ItemStack item, CallbackInfo callbackInfo)
    {
        setWeaponStats();
        setKnockbackResistance(weapons, armor);
        setDriveableStats();
    }

    @Inject(method = "setProjectile", at = @At(value = "TAIL"), remap = false)
    private void onSetProjectile(ItemStack item, CallbackInfo callbackInfo)
    {
        setWeaponStats();
        setKnockbackResistance(weapons, armor);
    }

    @Inject(method = "setOffHand", at = @At(value = "TAIL"), remap = false)
    private void onSetOffHand(ItemStack item, CallbackInfo callbackInfo)
    {
        setWeaponStats();
        setKnockbackResistance(weapons, armor);
    }

    @Unique
    private void setDriveableStats()
    {
        ItemStack item = weapons.get(0);
        if (!useDriveableStats || item == null)
            return;

        DriveableType type = null;
        if (item.getItem() instanceof ItemVehicle)
            type = ((ItemVehicle)item.getItem()).type;
        else if (item.getItem() instanceof ItemPlane)
            type = ((ItemPlane)item.getItem()).type;

        if (type != null)
        {
            type.health.values().stream().map(box -> box.health).max(Comparator.naturalOrder()).ifPresent(health -> npc.stats.maxHealth = health);
            Optional<Float> damageMultiplierPrimary = FlanUtils.getDamageMultiplierPrimary(type);
            damageMultiplierPrimary.ifPresent(value -> npc.stats.pDamage = value);
            npc.stats.pSpeed = (int) type.bulletSpeed;
            npc.stats.accuracy = NPCInterfaceUtil.bulletSpreadToAccuracy(type.bulletSpread);
            npc.stats.minDelay = (int) Math.floor(type.shootDelay(false));
            npc.stats.maxDelay = (int) Math.ceil(type.shootDelay(false));
            npc.stats.fireRate = 0;
            npc.stats.shotCount = 1;
            if (type.shootSound(false) != null && !type.shootSound(false).isEmpty())
                npc.stats.fireSound = "flansmod:" + type.shootSound(false);
            if (type.engineSound != null && !type.engineSound.isEmpty())
                npc.advanced.stepSound = "flansmod:" + type.engineSound;
            npc.stats.resistances.knockback = 2F;
        }
        else if (item.getItem() instanceof ItemAAGun)
        {
            AAGunType aagunType = ((ItemAAGun)item.getItem()).type;
            npc.stats.maxHealth = aagunType.health;
            npc.stats.pDamage = aagunType.damage;
            npc.stats.accuracy = NPCInterfaceUtil.bulletSpreadToAccuracy(aagunType.accuracy);
            npc.stats.minDelay = aagunType.reloadTime;
            npc.stats.maxDelay = aagunType.reloadTime;
            npc.stats.fireRate = aagunType.shootDelay;

            if (aagunType.shootSound != null && !aagunType.shootSound.isEmpty())
                npc.stats.fireSound = "flansmod:" + aagunType.shootSound;
        }
    }

    @Unique
    private void setKnockbackResistance(Map<Integer, ItemStack> weapons, Map<Integer, ItemStack> armor)
    {
        if (useWeaponMeleeStats || useWeaponRangedStats || useArmorStats)
        {
            AtomicReference<Float> knockbackResistance = new AtomicReference<>(1F);
            List<ItemStack> itemList = new ArrayList<>();

            if (useWeaponMeleeStats || useWeaponRangedStats)
                itemList.addAll(weapons.values());
            if (useArmorStats)
                itemList.addAll(armor.values());

            for (ItemStack item : itemList)
            {
                getAttributeModifier(item, SharedMonsterAttributes.knockbackResistance).ifPresent(value -> knockbackResistance.set(knockbackResistance.get() + (float) value));
            }
            npc.stats.resistances.knockback = knockbackResistance.get();
        }
    }

    @Unique
    private void setArmorStats(HashMap<Integer, ItemStack> armor)
    {
        if (!useArmorStats)
            return;

        float meleeResistance = 1F;
        float projectileResistance = 1F;
        float explosionResistance = 1F;
        int protectionLevel = 0;
        int projectileProtectionLevel = 0;
        int blastProtectionLevel = 0;

        for (int i = 0; i < 4; i++)
        {
            if (armor.get(i) == null)
                continue;

            if (armor.get(i).getItem() instanceof ItemArmor)
            {
                if (armor.get(i).isItemEnchanted())
                {
                    protectionLevel += EnchantmentHelper.getEnchantmentLevel(Enchantment.protection.effectId, armor.get(i));
                    projectileProtectionLevel += EnchantmentHelper.getEnchantmentLevel(Enchantment.projectileProtection.effectId, armor.get(i));
                    blastProtectionLevel += EnchantmentHelper.getEnchantmentLevel(Enchantment.blastProtection.effectId, armor.get(i));
                }

                ItemArmor item = (ItemArmor) armor.get(i).getItem();
                if (item instanceof ItemTeamArmour)
                {
                    meleeResistance += ((ItemTeamArmour)item).type.defence;
                    projectileResistance += FlanUtils.getBulletDefence(((ItemTeamArmour)item).type);
                    explosionResistance += ((ItemTeamArmour)item).type.defence;

                    if (((ItemTeamArmour)item).type.negateFallDamage)
                        npc.stats.noFallDamage = true;
                    if (((ItemTeamArmour)item).type.fireResistance)
                        npc.stats.immuneToFire = true;
                    if (((ItemTeamArmour)item).type.waterBreathing)
                        npc.stats.drowningType = 0;
                }
                else
                {
                    meleeResistance += 0.04F * item.damageReduceAmount;
                    projectileResistance += 0.04F * item.damageReduceAmount;
                    explosionResistance += 0.04F * item.damageReduceAmount;
                }
            }
        }

        npc.stats.resistances.playermelee = meleeResistance + protectionLevel * 0.04F * (2F - meleeResistance);
        npc.stats.resistances.arrow = projectileResistance + projectileProtectionLevel * 0.04F * (2F - meleeResistance);
        npc.stats.resistances.explosion = explosionResistance + blastProtectionLevel * 0.04F * (2F - meleeResistance);
    }

    @Unique
    private void setWeaponStats()
    {
        if (useWeaponMeleeStats)
        {
            setMeleeStats(weapons.get(0), weapons.get(2));
        }

        if (useWeaponRangedStats)
        {
            setRangedStats(((IMixinEntityNPCInterface)npc).getGuns(), weapons.get(0), weapons.get(1));
        }
    }

    @Unique
    private void setMeleeStats(ItemStack mainWeapon, ItemStack offHandWeapon)
    {
        float damageMainWeapon = 0F;
        float damageOffHandWeapon = 0F;
        int fireAspectLevel;
        int meleeTime = 1;

        if (mainWeapon != null)
        {
            damageMainWeapon = getMeleeDamage(mainWeapon);
            if (mainWeapon.getItem() instanceof ItemGun)
            {
                meleeTime = ((ItemGun) mainWeapon.getItem()).type.meleeTime;
            }
        }
        if (offHandWeapon != null)
        {
            damageOffHandWeapon = getMeleeDamage(offHandWeapon);
            if (offHandWeapon.getItem() instanceof ItemGun)
            {
                meleeTime = Math.max(meleeTime, ((ItemGun) offHandWeapon.getItem()).type.meleeTime);
            }
        }

        fireAspectLevel = Math.max(EnchantmentHelper.getEnchantmentLevel(Enchantment.fireAspect.effectId, mainWeapon), EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, offHandWeapon));

        npc.stats.setAttackStrength(Math.max(damageMainWeapon, damageOffHandWeapon) + 1F);
        npc.stats.knockback = Math.max(EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, mainWeapon), EnchantmentHelper.getEnchantmentLevel(Enchantment.knockback.effectId, offHandWeapon));

        if (fireAspectLevel > 0)
        {
            npc.stats.potionType = EnumPotionType.Fire;
            npc.stats.potionDuration = 4 * fireAspectLevel;
        }

        if (meleeTime > 1)
            npc.stats.attackSpeed = meleeTime;
    }

    @Unique
    private float getMeleeDamage(ItemStack item)
    {
        if (item == null)
            return 0F;

        AtomicReference<Float> damage = new AtomicReference<>(0F);
        getAttributeModifier(item, SharedMonsterAttributes.attackDamage).ifPresent(value -> damage.set((float)value));

        if (item.isItemEnchanted())
        {
            EnchantmentHelper.getEnchantments(item).forEach(
                    (id, level) -> damage.set(damage.get() + Enchantment.enchantmentsList[(Integer)id].func_152376_a((Integer) level, EnumCreatureAttribute.UNDEFINED))
            );
        }

        return damage.get();
    }

    @Unique
    private OptionalDouble getAttributeModifier(ItemStack item, IAttribute attribute)
    {
        if (item != null)
        {
            AttributeModifier[] attributeModifier = (AttributeModifier[]) item.getItem().getAttributeModifiers(item).get(attribute.getAttributeUnlocalizedName()).toArray(new AttributeModifier[0]);
            if (attributeModifier.length > 0)
            {
                return OptionalDouble.of(attributeModifier[0].getAmount());
            }
        }
        return OptionalDouble.empty();
    }

    @Unique
    private void setRangedStats(List<ItemStack> guns, ItemStack mainWeapon, ItemStack projectile)
    {
        if (!guns.isEmpty())
        {
            int shotCount = 0;
            float damage = 0F;
            float bulletSpeed = Float.MAX_VALUE;
            float bulletSpread = 0F;
            float reloadTime = 0F;
            float fireRate = 0F;
            String fireSound = null;

            for (ItemStack gunItemStack: guns)
            {
                GunType gun = ((ItemGun) gunItemStack.getItem()).type;
                damage += gun.getDamage(gunItemStack);
                shotCount += gun.getNumBullets(gunItemStack);
                reloadTime = Math.max(reloadTime, gun.getReloadTime(gunItemStack));
                fireRate = Math.max(fireRate, gun.getShootDelay(gunItemStack));
                bulletSpread = Math.max(bulletSpread, gun.getSpread(gunItemStack, false, false));

                if (fireSound == null)
                    fireSound = NPCInterfaceUtil.getGunFireSound(gunItemStack, gun, false);

                bulletSpeed = Math.min(bulletSpeed, FlanUtils.getBulletSpeed(gun, gunItemStack, projectile));
            }

            npc.stats.pDamage = damage / guns.size();
            npc.stats.pSpeed = Math.round(Math.max(bulletSpeed, 1F));
            npc.stats.accuracy = NPCInterfaceUtil.bulletSpreadToAccuracy(bulletSpread);
            npc.stats.minDelay = (int)Math.floor(reloadTime);
            npc.stats.maxDelay = (int)Math.ceil(reloadTime);
            npc.stats.fireRate = Math.round(fireRate);
            npc.stats.shotCount = shotCount;

            if (fireSound != null && !fireSound.isEmpty())
                npc.stats.fireSound = "flansmod:" + fireSound;
        }

        if (projectile != null)
        {
            Item projectileItem = projectile.getItem();
            if (projectileItem instanceof ItemShootable)
            {
                ShootableType shootable = ((ItemShootable) projectileItem).type;
                npc.stats.burstCount = shootable.roundsPerItem;
            }
            else if (projectileItem instanceof noppes.npcs.items.ItemBullet && mainWeapon != null)
            {
                noppes.npcs.items.ItemBullet bullet = (noppes.npcs.items.ItemBullet) projectileItem;
                if (mainWeapon.getItem()  instanceof noppes.npcs.items.ItemGun)
                {
                    noppes.npcs.items.ItemGun gunItem = (noppes.npcs.items.ItemGun) mainWeapon.getItem();
                    EnumNpcToolMaterial gunMaterial = null;
                    for (EnumNpcToolMaterial material: EnumNpcToolMaterial.values())
                    {
                        if (material.getMaxUses() == gunItem.getMaxDamage())
                            gunMaterial = material;
                    }

                    if (gunMaterial != null)
                    {
                        int damage = (bullet.getBulletDamage() + gunMaterial.getDamageVsEntity() + 1) / 2 + 5;
                        damage += damage * EnchantInterface.getLevel(EnchantInterface.Damage, mainWeapon) * 0.5f;
                        npc.stats.pDamage = damage;
                    }
                    npc.stats.pSpeed = 40;
                    npc.stats.pPhysics = false;
                    npc.stats.fireSound = "customnpcs:gun.pistol.shot";
                }
            }
            else if (projectileItem instanceof ItemThrowingWeapon)
            {
                npc.stats.pDamage = 2;
                npc.stats.pSpeed = 12;
                npc.stats.pPhysics = true;
                npc.stats.pRender3D = true;
                npc.stats.pStick = true;
                npc.stats.pSpin = true;
                npc.stats.fireSound = "customnpcs:misc.swosh";
            }
            else if (projectileItem instanceof ItemKunai)
            {
                npc.stats.pDamage = ((ItemKunai)projectileItem).func_150931_i();
                npc.stats.pSpeed = 12;
                npc.stats.pPhysics = true;
                npc.stats.pRender3D = true;
                npc.stats.pStick = true;
            }
        }

        if (mainWeapon != null)
        {
            if (mainWeapon.getItem()  instanceof noppes.npcs.items.ItemMachineGun)
            {
                npc.stats.pDamage = 4;
                npc.stats.pSpeed = 40;
                npc.stats.pPhysics = false;
                npc.stats.fireSound = "customnpcs:gun.pistol.shot";
            }
            else if (mainWeapon.getItem()  instanceof ItemCrossbow)
            {
                npc.stats.pDamage = 10;
                npc.stats.pSpeed = 20;
                npc.stats.pPhysics = true;
                npc.stats.fireSound = "random.bow";
            }
            else if (mainWeapon.getItem()  instanceof ItemSlingshot)
            {
                npc.stats.pDamage = 4;
                npc.stats.pImpact = 1;
                npc.stats.pSpeed = 14;
                npc.stats.pPhysics = true;
                npc.stats.pSpin = true;
                npc.stats.fireSound = "random.bow";
            }
            else if (mainWeapon.getItem()  instanceof ItemMusket)
            {
                npc.stats.pDamage = 16;
                npc.stats.pSpeed = 50;
                npc.stats.pPhysics = false;
                npc.stats.pTrail = EnumParticleType.Smoke;
            }
            else if (mainWeapon.getItem()  instanceof ItemStaff)
            {
                ItemStaff staffItem = (ItemStaff) mainWeapon.getItem();
                EnumNpcToolMaterial staffMaterial = null;
                for (EnumNpcToolMaterial material: EnumNpcToolMaterial.values())
                {
                    if (material.getEnchantability() == staffItem.getItemEnchantability())
                        staffMaterial = material;
                }
                npc.stats.pExplode = true;
                if (staffMaterial != null)
                {
                    int damage = 6 + staffMaterial.getDamageVsEntity() + npc.worldObj.rand.nextInt(4);
                    damage += damage * EnchantInterface.getLevel(EnchantInterface.Damage, mainWeapon) * 0.5f;
                    npc.stats.pDamage = damage;
                }
                npc.stats.pSpeed = 25;
                npc.stats.fireSound = "customnpcs:magic.shot";
            }
        }
    }

    @Override
    public boolean getUseWeaponMeleeStats()
    {
        return useWeaponMeleeStats;
    }

    @Override
    public boolean getUseWeaponRangedStats()
    {
        return useWeaponRangedStats;
    }

    @Override
    public boolean getUseArmorStats()
    {
        return useArmorStats;
    }

    @Override
    public boolean getUseDriveableStats()
    {
        return useDriveableStats;
    }

    @Override
    public void setUseWeaponMeleeStats(boolean useWeaponMeleeStats)
    {
        this.useWeaponMeleeStats = useWeaponMeleeStats;
    }

    @Override
    public void setUseWeaponRangedStats(boolean useWeaponRangedStats)
    {
        this.useWeaponRangedStats = useWeaponRangedStats;
    }

    @Override
    public void setUseArmorStats(boolean useArmorStats)
    {
        this.useArmorStats = useArmorStats;
    }

    @Override
    public void setUseDriveableStats(boolean useDriveableStats)
    {
        this.useDriveableStats = useDriveableStats;
    }
}
