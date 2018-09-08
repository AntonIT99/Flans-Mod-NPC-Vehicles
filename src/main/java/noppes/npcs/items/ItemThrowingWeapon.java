// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.item.Item;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.creativetab.CreativeTabs;
import noppes.npcs.CustomItems;

public class ItemThrowingWeapon extends ItemNpcInterface
{
    private boolean rotating;
    private int damage;
    private boolean dropItem;
    
    public ItemThrowingWeapon(final int par1) {
        super(par1);
        this.rotating = false;
        this.damage = 2;
        this.dropItem = false;
        this.setCreativeTab((CreativeTabs)CustomItems.tabWeapon);
    }
    
    public void onPlayerStoppedUsing(final ItemStack par1ItemStack, final World worldObj, final EntityPlayer player, final int par4) {
        if (worldObj.isRemote) {
            player.swingItem();
            return;
        }
        final EntityProjectile projectile = new EntityProjectile(worldObj, (EntityLivingBase)player, new ItemStack(par1ItemStack.getItem(), 1, par1ItemStack.getItemDamage()), false);
        projectile.damage = this.damage;
        projectile.canBePickedUp = (!player.capabilities.isCreativeMode && this.dropItem);
        projectile.setRotating(this.rotating);
        projectile.setIs3D(true);
        projectile.setStickInWall(true);
        projectile.setHasGravity(true);
        projectile.setSpeed(12);
        if (!player.capabilities.isCreativeMode) {
            this.consumeItem(player, this);
        }
        projectile.shoot(1.0f);
        worldObj.playSoundAtEntity((Entity)player, "customnpcs:misc.swosh", 1.0f, 1.0f);
        worldObj.spawnEntityInWorld((Entity)projectile);
    }
    
    public ItemThrowingWeapon setRotating() {
        this.rotating = true;
        return this;
    }
    
    public ItemThrowingWeapon setDamage(final int damage) {
        this.damage = damage;
        return this;
    }
    
    public ItemThrowingWeapon setDropItem() {
        this.dropItem = true;
        return this;
    }
    
    @Override
    public void renderSpecial() {
        super.renderSpecial();
        GL11.glTranslatef(0.2f, 0.1f, 0.06f);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 72000;
    }
}
