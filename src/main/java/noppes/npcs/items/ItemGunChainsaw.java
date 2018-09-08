// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.items;

import org.lwjgl.opengl.GL11;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;

public class ItemGunChainsaw extends ItemNpcWeaponInterface
{
    public ItemGunChainsaw(final int par1, final Item.ToolMaterial tool) {
        super(par1, tool);
    }
    
    public boolean hitEntity(final ItemStack par1ItemStack, final EntityLivingBase par2EntityLiving, final EntityLivingBase par3EntityLiving) {
        if (par2EntityLiving.getHealth() <= 0.0f) {
            return false;
        }
        final double x = par2EntityLiving.posX;
        final double y = par2EntityLiving.posY + par2EntityLiving.height / 2.0f;
        final double z = par2EntityLiving.posZ;
        par3EntityLiving.worldObj.playSoundEffect(x, y, z, "random.explode", 0.8f, (1.0f + (par3EntityLiving.worldObj.rand.nextFloat() - par3EntityLiving.worldObj.rand.nextFloat()) * 0.2f) * 0.7f);
        par3EntityLiving.worldObj.spawnParticle("largeexplode", x, y, z, 0.0, 0.0, 0.0);
        return super.hitEntity(par1ItemStack, par2EntityLiving, par3EntityLiving);
    }
    
    @Override
    public void renderSpecial() {
        super.renderSpecial();
        GL11.glTranslatef(-0.1f, 0.0f, -0.16f);
        GL11.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
        GL11.glRotatef(-16.0f, 0.0f, 0.0f, 1.0f);
    }
}
