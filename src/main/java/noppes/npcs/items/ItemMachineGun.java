// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.item.EnumAction;
import net.minecraft.nbt.NBTTagCompound;
import org.lwjgl.opengl.GL11;
import noppes.npcs.entity.EntityProjectile;
import net.minecraft.entity.Entity;
import noppes.npcs.CustomNpcs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;

public class ItemMachineGun extends ItemNpcInterface
{
    public ItemMachineGun(final int par1) {
        super(par1);
        this.setMaxDamage(80);
        this.setCreativeTab((CreativeTabs)CustomItems.tabWeapon);
    }
    
    public void onPlayerStoppedUsing(final ItemStack stack, final World par2World, final EntityPlayer player, final int count) {
        if (player.capabilities.isCreativeMode) {
            return;
        }
        final int ticks = this.getMaxItemUseDuration(stack) - count;
        int shotsleft = stack.stackTagCompound.getInteger("ShotsLeft") - ticks / 6;
        if (stack.stackTagCompound.getBoolean("Reloading2")) {
            shotsleft = ticks / 5;
            if (ticks > 40) {
                shotsleft = 8;
            }
            if (shotsleft > 1) {
                stack.stackTagCompound.setInteger("ShotsLeft", shotsleft);
                stack.stackTagCompound.setBoolean("Reloading2", false);
            }
        }
        else if (shotsleft <= 0) {
            stack.stackTagCompound.setBoolean("Reloading2", true);
            stack.damageItem(1, (EntityLivingBase)player);
        }
        else {
            stack.stackTagCompound.setInteger("ShotsLeft", shotsleft);
        }
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        if (player.worldObj.isRemote) {
            return;
        }
        final int ticks = this.getMaxItemUseDuration(stack) - count;
        if (ticks % 6 != 0) {
            return;
        }
        final int shotsleft = stack.stackTagCompound.getInteger("ShotsLeft") - ticks / 6;
        if (!player.capabilities.isCreativeMode || !CustomNpcs.GunsEnabled) {
            if (stack.stackTagCompound.getBoolean("Reloading2") && this.hasItem(player, CustomItems.bulletBlack)) {
                if (ticks > 0 && ticks <= 24) {
                    player.worldObj.playSoundAtEntity((Entity)player, "customnpcs:gun.ak47.load", 1.0f, 1.0f);
                }
                return;
            }
            if (shotsleft <= 0 || !this.hasItem(player, CustomItems.bulletBlack) || !CustomNpcs.GunsEnabled) {
                player.worldObj.playSoundAtEntity((Entity)player, "customnpcs:gun.empty", 1.0f, 1.0f);
                return;
            }
        }
        else {
            stack.stackTagCompound.removeTag("Reloading2");
        }
        final EntityProjectile projectile = new EntityProjectile(player.worldObj, (EntityLivingBase)player, new ItemStack(CustomItems.bulletBlack, 1, 0), false);
        projectile.damage = 4.0f;
        projectile.setSpeed(40);
        projectile.shoot(2.0f);
        if (!player.capabilities.isCreativeMode) {
            this.consumeItem(player, CustomItems.bulletBlack);
        }
        player.worldObj.playSoundAtEntity((Entity)player, "customnpcs:gun.pistol.shot", 0.9f, ItemMachineGun.itemRand.nextFloat() * 0.3f + 0.8f);
        player.worldObj.spawnEntityInWorld((Entity)projectile);
    }
    
    @Override
    public void renderSpecial() {
        GL11.glRotatef(-6.0f, 0.0f, 0.0f, 1.0f);
        GL11.glScalef(0.8f, 0.7f, 0.7f);
        GL11.glTranslatef(0.2f, 0.0f, 0.2f);
    }
    
    public ItemStack onItemRightClick(final ItemStack stack, final World world, final EntityPlayer player) {
        if (stack.stackTagCompound == null) {
            stack.stackTagCompound = new NBTTagCompound();
        }
        if (!player.capabilities.isCreativeMode && !this.hasItem(player, CustomItems.bulletBlack)) {
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
