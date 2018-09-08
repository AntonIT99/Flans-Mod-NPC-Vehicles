// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.item.EnumAction;
import net.minecraft.nbt.NBTTagCompound;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import noppes.npcs.entity.EntityProjectile;
import net.minecraft.init.Items;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;

public class ItemCrossbow extends ItemNpcInterface
{
    public ItemCrossbow(final int par1) {
        super(par1);
        this.setMaxDamage(129);
        this.setCreativeTab((CreativeTabs)CustomItems.tabWeapon);
    }
    
    public void onPlayerStoppedUsing(final ItemStack stack, final World par2World, final EntityPlayer player, final int count) {
        if (player.worldObj.isRemote) {
            return;
        }
        if (stack.stackTagCompound.getInteger("IsLoaded") == 1 || player.capabilities.isCreativeMode) {
            if (stack.stackTagCompound.getInteger("Reloading") == 1 && !player.capabilities.isCreativeMode) {
                stack.stackTagCompound.setInteger("Reloading", 0);
                return;
            }
            stack.damageItem(1, (EntityLivingBase)player);
            final EntityProjectile projectile = new EntityProjectile(player.worldObj, (EntityLivingBase)player, new ItemStack(Items.arrow, 1, 0), false);
            projectile.damage = 10.0f;
            projectile.setSpeed(20);
            projectile.setHasGravity(true);
            projectile.shoot(2.0f);
            if (!player.capabilities.isCreativeMode) {
                this.consumeItem(player, CustomItems.crossbowBolt);
            }
            player.worldObj.playSoundAtEntity((Entity)player, "random.bow", 0.9f, ItemCrossbow.itemRand.nextFloat() * 0.3f + 0.8f);
            player.worldObj.spawnEntityInWorld((Entity)projectile);
            stack.stackTagCompound.setInteger("IsLoaded", 0);
        }
    }
    
    public void onUsingTick(final ItemStack stack, final EntityPlayer player, final int count) {
        if (player.worldObj.isRemote) {
            return;
        }
        final int ticks = this.getMaxItemUseDuration(stack) - count;
        if (!player.capabilities.isCreativeMode && stack.stackTagCompound.getInteger("Reloading") == 1 && this.hasItem(player, CustomItems.crossbowBolt)) {
            if (ticks == 20) {
                player.worldObj.playSoundAtEntity((Entity)player, "random.click", 1.0f, 1.0f);
                stack.stackTagCompound.setInteger("IsLoaded", 1);
            }
        }
    }
    
    @Override
    public void renderSpecial() {
        GL11.glRotatef(96.0f, 1.0f, 0.0f, 0.0f);
        GL11.glRotatef(-10.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(0.8f, 0.8f, 0.8f);
        GL11.glTranslatef(0.5f, -0.7f, -0.4f);
    }
    
    public ItemStack onItemRightClick(final ItemStack stack, final World world, final EntityPlayer player) {
        if (stack.stackTagCompound == null) {
            stack.stackTagCompound = new NBTTagCompound();
        }
        if (!player.capabilities.isCreativeMode && this.hasItem(player, CustomItems.crossbowBolt) && stack.stackTagCompound.getInteger("IsLoaded") == 0) {
            stack.stackTagCompound.setInteger("Reloading", 1);
        }
        player.setItemInUse(stack, this.getMaxItemUseDuration(stack));
        return stack;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 72000;
    }
    
    public EnumAction getItemUseAction(final ItemStack stack) {
        if (stack.stackTagCompound == null || stack.stackTagCompound.getInteger("Reloading") == 0) {
            return EnumAction.bow;
        }
        return EnumAction.block;
    }
}
