// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.CustomNpcs;
import net.minecraft.item.EnumAction;
import net.minecraft.util.MathHelper;
import noppes.npcs.entity.EntityMagicProjectile;
import noppes.npcs.enchants.EnchantInterface;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.Entity;
import noppes.npcs.entity.EntityProjectile;
import net.minecraft.world.WorldServer;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import org.lwjgl.opengl.GL11;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;
import noppes.npcs.constants.EnumNpcToolMaterial;
import noppes.npcs.util.IProjectileCallback;

public class ItemStaff extends ItemNpcInterface implements IProjectileCallback
{
    private EnumNpcToolMaterial material;
    
    public ItemStaff(final int par1, final EnumNpcToolMaterial material) {
        super(par1);
        this.material = material;
        this.setCreativeTab((CreativeTabs)CustomItems.tabWeapon);
    }
    
    @Override
    public void renderSpecial() {
        GL11.glScalef(1.0f, 1.14f, 1.0f);
        GL11.glTranslatef(0.14f, -0.3f, 0.08f);
    }
    
    public void onPlayerStoppedUsing(final ItemStack stack, final World worldObj, final EntityPlayer player, final int par4) {
        if (worldObj.isRemote) {
            return;
        }
        if (stack.stackTagCompound == null) {
            return;
        }
        final Entity entity = ((WorldServer)player.worldObj).getEntityByID(stack.stackTagCompound.getInteger("MagicProjectile"));
        if (entity == null || !(entity instanceof EntityProjectile)) {
            return;
        }
        final EntityProjectile item = (EntityProjectile)entity;
        item.callback = this;
        item.callbackItem = stack;
        item.explosive = true;
        item.explosiveDamage = false;
        item.explosiveRadius = 1;
        final EntityProjectile entityProjectile = item;
        final EntityProjectile entityProjectile2 = item;
        final float rotationYaw = player.rotationYaw;
        entityProjectile2.rotationYaw = rotationYaw;
        entityProjectile.prevRotationYaw = rotationYaw;
        final EntityProjectile entityProjectile3 = item;
        final EntityProjectile entityProjectile4 = item;
        final float rotationPitch = player.rotationPitch;
        entityProjectile4.rotationPitch = rotationPitch;
        entityProjectile3.prevRotationPitch = rotationPitch;
        item.shoot(2.0f);
        player.worldObj.playSoundAtEntity((Entity)player, "customnpcs:magic.shot", 1.0f, 1.0f);
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        final int tick = this.getMaxItemUseDuration(stack) - count;
        if (player.worldObj.isRemote) {
            this.spawnParticle(stack, player);
            return;
        }
        final int chargeTime = 20 + this.material.getHarvestLevel() * 8;
        if (tick == chargeTime) {
            if (!player.capabilities.isCreativeMode && !this.hasInfinite(stack)) {
                if (!this.hasItem(player, CustomItems.mana)) {
                    return;
                }
                this.consumeItem(player, CustomItems.mana);
            }
            player.worldObj.playSoundAtEntity((Entity)player, "customnpcs:magic.charge", 1.0f, 1.0f);
            if (stack.stackTagCompound == null) {
                stack.stackTagCompound = new NBTTagCompound();
            }
            int damage = 6 + this.material.getDamageVsEntity() + player.worldObj.rand.nextInt(4);
            damage += (int)(damage * EnchantInterface.getLevel(EnchantInterface.Damage, stack) * 0.5f);
            final EntityProjectile projectile = new EntityMagicProjectile(player.worldObj, player, this.getProjectile(stack), false);
            projectile.damage = damage;
            projectile.setSpeed(25);
            final double dx = -MathHelper.sin((float)(player.rotationYaw / 180.0f * 3.141592653589793)) * MathHelper.cos((float)(player.rotationPitch / 180.0f * 3.141592653589793));
            final double dz = MathHelper.cos((float)(player.rotationYaw / 180.0f * 3.141592653589793)) * MathHelper.cos((float)(player.rotationPitch / 180.0f * 3.141592653589793));
            projectile.setPosition(player.posX + dx * 0.8, player.posY + 1.5 - player.rotationPitch / 80.0f, player.posZ + dz * 0.8);
            player.worldObj.spawnEntityInWorld((Entity)projectile);
            stack.stackTagCompound.setInteger("MagicProjectile", projectile.getEntityId());
        }
        if (tick > chargeTime && stack.stackTagCompound != null) {
            final Entity entity = ((WorldServer)player.worldObj).getEntityByID(stack.stackTagCompound.getInteger("MagicProjectile"));
            if (entity == null || !(entity instanceof EntityProjectile)) {
                return;
            }
            final EntityProjectile item = (EntityProjectile)entity;
            item.ticksInAir = 0;
            final double dx = -MathHelper.sin((float)(player.rotationYaw / 180.0f * 3.141592653589793)) * MathHelper.cos((float)(player.rotationPitch / 180.0f * 3.141592653589793));
            final double dz = MathHelper.cos((float)(player.rotationYaw / 180.0f * 3.141592653589793)) * MathHelper.cos((float)(player.rotationPitch / 180.0f * 3.141592653589793));
            item.setPosition(player.posX + dx * 0.8, player.posY + 1.5 - player.rotationPitch / 80.0f, player.posZ + dz * 0.8);
        }
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 72000;
    }
    
    public EnumAction getItemUseAction(final ItemStack par1ItemStack) {
        return EnumAction.bow;
    }
    
    public ItemStack getProjectile(final ItemStack stack) {
        if (stack.getItem() == CustomItems.staffWood) {
            return new ItemStack(CustomItems.spellNature);
        }
        if (stack.getItem() == CustomItems.staffStone || stack.getItem() == CustomItems.staffDemonic) {
            return new ItemStack(CustomItems.spellDark);
        }
        if (stack.getItem() == CustomItems.staffIron || stack.getItem() == CustomItems.staffMithril) {
            return new ItemStack(CustomItems.spellHoly);
        }
        if (stack.getItem() == CustomItems.staffBronze) {
            return new ItemStack(CustomItems.spellLightning);
        }
        if (stack.getItem() == CustomItems.staffGold) {
            return new ItemStack(CustomItems.spellFire);
        }
        if (stack.getItem() == CustomItems.staffDiamond || stack.getItem() == CustomItems.staffFrost) {
            return new ItemStack(CustomItems.spellIce);
        }
        if (stack.getItem() == CustomItems.staffEmerald) {
            return new ItemStack(CustomItems.spellArcane);
        }
        return new ItemStack(CustomItems.orb, 1, stack.getItemDamage());
    }
    
    public void spawnParticle(final ItemStack stack, final EntityPlayer player) {
        if (stack.getItem() == CustomItems.staffWood) {
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 5, 2);
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 12, 2);
        }
        else if (stack.getItem() == CustomItems.staffStone || stack.getItem() == CustomItems.staffDemonic) {
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 5649239, 2);
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 4400964, 2);
        }
        else if (stack.getItem() == CustomItems.staffBronze) {
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 8648694, 2);
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 6091007, 2);
        }
        else if (stack.getItem() == CustomItems.staffIron || stack.getItem() == CustomItems.staffMithril) {
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 16580553, 2);
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 15728535, 2);
        }
        else if (stack.getItem() == CustomItems.staffGold) {
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 1, 2);
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 14, 2);
        }
        else if (stack.getItem() == CustomItems.staffDiamond || stack.getItem() == CustomItems.staffFrost) {
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 9756653, 2);
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 4503295, 2);
        }
        else if (stack.getItem() == CustomItems.staffEmerald) {
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 16761831, 2);
            CustomNpcs.proxy.spawnParticle((EntityLivingBase)player, "Spell", 16487167, 2);
        }
    }
    
    @Override
    public int getItemEnchantability() {
        return this.material.getEnchantability();
    }
    
    public boolean isItemTool(final ItemStack par1ItemStack) {
        return true;
    }
    
    @Override
    public boolean onImpact(final EntityProjectile entityProjectile, final EntityLivingBase entity, final ItemStack itemstack) {
        final int confusion = EnchantInterface.getLevel(EnchantInterface.Confusion, itemstack);
        if (confusion > 0 && entity.getRNG().nextInt(4) > confusion) {
            entity.addPotionEffect(new PotionEffect(Potion.confusion.id, 100));
        }
        final int poison = EnchantInterface.getLevel(EnchantInterface.Poison, itemstack);
        if (poison > 0 && entity.getRNG().nextInt(4) > poison) {
            entity.addPotionEffect(new PotionEffect(Potion.poison.id, 100));
        }
        return false;
    }
    
    public boolean hasInfinite(final ItemStack stack) {
        return EnchantInterface.getLevel(EnchantInterface.Infinite, stack) > 0;
    }
}
