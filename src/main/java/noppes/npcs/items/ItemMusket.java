// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.item.EnumAction;
import net.minecraft.nbt.NBTTagCompound;
import org.lwjgl.opengl.GL11;
import noppes.npcs.constants.EnumParticleType;
import noppes.npcs.entity.EntityProjectile;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.Entity;
import noppes.npcs.CustomNpcs;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;

public class ItemMusket extends ItemNpcInterface
{
    public ItemMusket(final int par1) {
        super(par1);
        this.setMaxDamage(129);
        this.setCreativeTab((CreativeTabs)CustomItems.tabWeapon);
    }
    
    public void onPlayerStoppedUsing(final ItemStack stack, final World par2World, final EntityPlayer player, final int count) {
        if (player.worldObj.isRemote) {
            return;
        }
        if ((!stack.stackTagCompound.getBoolean("IsLoaded2") && !player.capabilities.isCreativeMode) || !CustomNpcs.GunsEnabled) {
            player.worldObj.playSoundAtEntity((Entity)player, "customnpcs:gun.empty", 1.0f, 1.0f);
            return;
        }
        if (stack.stackTagCompound.getBoolean("Reloading2") && !player.capabilities.isCreativeMode) {
            stack.stackTagCompound.setBoolean("Reloading2", false);
            return;
        }
        stack.damageItem(1, (EntityLivingBase)player);
        final EntityProjectile projectile = new EntityProjectile(player.worldObj, (EntityLivingBase)player, new ItemStack(CustomItems.bulletBlack, 1, 0), false);
        projectile.damage = 16.0f;
        projectile.setSpeed(50);
        projectile.setParticleEffect(EnumParticleType.Smoke);
        projectile.shoot(2.0f);
        if (!player.capabilities.isCreativeMode) {
            this.consumeItem(player, CustomItems.bulletBlack);
        }
        player.worldObj.playSoundAtEntity((Entity)player, "random.explode", 0.9f, ItemMusket.itemRand.nextFloat() * 0.3f + 1.8f);
        player.worldObj.playSoundAtEntity((Entity)player, "ambient.weather.thunder", 2.0f, ItemMusket.itemRand.nextFloat() * 0.3f + 1.8f);
        player.worldObj.spawnEntityInWorld((Entity)projectile);
        stack.stackTagCompound.setBoolean("IsLoaded2", false);
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        if (player.worldObj.isRemote) {
            return;
        }
        final int ticks = this.getMaxItemUseDuration(stack) - count;
        if (!player.capabilities.isCreativeMode && stack.stackTagCompound.getBoolean("Reloading2") && this.hasItem(player, CustomItems.bulletBlack)) {
            if (ticks == 60) {
                player.worldObj.playSoundAtEntity((Entity)player, "customnpcs:gun.ak47.load", 1.0f, 1.0f);
                stack.stackTagCompound.setBoolean("IsLoaded2", true);
            }
        }
    }
    
    @Override
    public void renderSpecial() {
        GL11.glRotatef(-6.0f, 0.0f, 0.0f, 1.0f);
        GL11.glScalef(0.7f, 0.7f, 0.7f);
        GL11.glTranslatef(0.4f, 0.0f, 0.2f);
    }
    
    public ItemStack onItemRightClick(final ItemStack stack, final World world, final EntityPlayer player) {
        if (stack.stackTagCompound == null) {
            stack.stackTagCompound = new NBTTagCompound();
        }
        if (!player.capabilities.isCreativeMode && this.hasItem(player, CustomItems.bulletBlack) && !stack.stackTagCompound.getBoolean("IsLoaded2")) {
            stack.stackTagCompound.setBoolean("Reloading2", true);
        }
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 72000;
    }
    
    public EnumAction getItemUseAction(final ItemStack stack) {
        if (stack.stackTagCompound == null || !stack.stackTagCompound.getBoolean("Reloading2")) {
            return EnumAction.bow;
        }
        return EnumAction.block;
    }
}
