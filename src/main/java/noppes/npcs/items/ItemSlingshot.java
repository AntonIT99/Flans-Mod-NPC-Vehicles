// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import net.minecraft.item.EnumAction;
import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import noppes.npcs.constants.EnumParticleType;
import noppes.npcs.entity.EntityProjectile;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.Item;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;

public class ItemSlingshot extends ItemNpcInterface
{
    public ItemSlingshot(final int par1) {
        super(par1);
        this.maxStackSize = 1;
        this.setMaxDamage(384);
        this.setCreativeTab((CreativeTabs)CustomItems.tabWeapon);
    }
    
    public void onPlayerStoppedUsing(final ItemStack par1ItemStack, final World worldObj, final EntityPlayer player, final int par4) {
        if (worldObj.isRemote) {
            return;
        }
        final int ticks = this.getMaxItemUseDuration(par1ItemStack) - par4;
        if (ticks < 6) {
            return;
        }
        if (!player.capabilities.isCreativeMode && !this.consumeItem(player, Item.getItemFromBlock(Blocks.cobblestone))) {
            return;
        }
        par1ItemStack.damageItem(1, (EntityLivingBase)player);
        final EntityProjectile projectile = new EntityProjectile(worldObj, (EntityLivingBase)player, new ItemStack(Blocks.cobblestone), false);
        projectile.damage = 4.0f;
        projectile.punch = 1;
        projectile.setRotating(true);
        if (ticks > 24) {
            projectile.setParticleEffect(EnumParticleType.Crit);
            projectile.punch = 2;
        }
        projectile.setHasGravity(true);
        projectile.setSpeed(14);
        projectile.shoot(1.0f);
        worldObj.playSoundAtEntity((Entity)player, "random.bow", 1.0f, ItemSlingshot.itemRand.nextFloat() * 0.3f + 0.8f);
        worldObj.spawnEntityInWorld((Entity)projectile);
    }
    
    @Override
    public void renderSpecial() {
        GL11.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
        GL11.glScalef(0.5f, 0.5f, 0.5f);
        GL11.glTranslatef(0.0f, 0.5f, 0.0f);
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
}
