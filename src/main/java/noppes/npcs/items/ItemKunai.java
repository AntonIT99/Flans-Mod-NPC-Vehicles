// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import org.lwjgl.opengl.GL11;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import noppes.npcs.entity.EntityProjectile;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class ItemKunai extends ItemNpcWeaponInterface
{
    public ItemKunai(final int par1, final Item.ToolMaterial tool) {
        super(par1, tool);
    }
    
    public void onPlayerStoppedUsing(final ItemStack par1ItemStack, final World worldObj, final EntityPlayer player, final int par4) {
        if (worldObj.isRemote) {
            player.swingItem();
            return;
        }
        final EntityProjectile projectile = new EntityProjectile(worldObj, (EntityLivingBase)player, par1ItemStack, false);
        projectile.damage = this.func_150931_i();
        projectile.destroyedOnEntityHit = false;
        projectile.canBePickedUp = !player.capabilities.isCreativeMode;
        projectile.setIs3D(true);
        projectile.setStickInWall(true);
        projectile.setHasGravity(true);
        projectile.setSpeed(12);
        projectile.shoot(1.0f);
        if (!player.capabilities.isCreativeMode) {
            par1ItemStack.damageItem(1, (EntityLivingBase)player);
            if (par1ItemStack.stackSize == 0) {
                return;
            }
            player.inventory.mainInventory[player.inventory.currentItem] = null;
        }
        worldObj.playSoundAtEntity((Entity)player, "customnpcs:misc.swosh", 1.0f, 1.0f);
        worldObj.spawnEntityInWorld((Entity)projectile);
    }
    
    public ItemStack onItemRightClick(final ItemStack par1ItemStack, final World par2World, final EntityPlayer par3EntityPlayer) {
        par3EntityPlayer.setItemInUse(par1ItemStack, this.getMaxItemUseDuration(par1ItemStack));
        return par1ItemStack;
    }
    
    public int getMaxItemUseDuration(final ItemStack par1ItemStack) {
        return 72000;
    }
    
    @Override
    public void renderSpecial() {
        GL11.glScalef(0.4f, 0.4f, 0.4f);
        GL11.glTranslatef(-0.4f, 0.5f, 0.1f);
    }
    
    public boolean shouldRotateAroundWhenRendering() {
        return true;
    }
}
