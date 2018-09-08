// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.fx;

import net.minecraft.util.MathHelper;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.particle.EntityPortalFX;

public class EntityElementalStaffFX extends EntityPortalFX
{
    double x;
    double y;
    double z;
    EntityLivingBase player;
    
    public EntityElementalStaffFX(final EntityLivingBase player, final double d, final double d1, final double d2, final double f1, final double f2, final double f3, final int color) {
        super(player.worldObj, player.posX + d, player.posY + d1, player.posZ + d2, f1, f2, f3);
        this.player = player;
        this.x = d;
        this.y = d1;
        this.z = d2;
        float[] colors;
        if (color <= 15) {
            colors = EntitySheep.fleeceColorTable[color];
        }
        else {
            colors = new float[] { (color >> 16 & 0xFF) / 255.0f, (color >> 8 & 0xFF) / 255.0f, (color & 0xFF) / 255.0f };
        }
        this.particleRed = colors[0];
        this.particleGreen = colors[1];
        this.particleBlue = colors[2];
        this.particleMaxAge = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.noClip = false;
    }
    
    public void onUpdate() {
        if (this.player.isDead) {
            this.setDead();
            return;
        }
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        final float var2;
        float var1 = var2 = this.particleAge / this.particleMaxAge;
        var1 = -var1 + var1 * var1 * 2.0f;
        var1 = 1.0f - var1;
        final double dx = -MathHelper.sin((float)(this.player.rotationYaw / 180.0f * 3.141592653589793)) * MathHelper.cos((float)(this.player.rotationPitch / 180.0f * 3.141592653589793));
        final double dz = MathHelper.cos((float)(this.player.rotationYaw / 180.0f * 3.141592653589793)) * MathHelper.cos((float)(this.player.rotationPitch / 180.0f * 3.141592653589793));
        this.posX = this.player.posX + this.x + dx + this.motionX * var1;
        this.posY = this.player.posY + this.y + this.motionY * var1 + (1.0f - var2) - this.player.rotationPitch / 40.0f;
        this.posZ = this.player.posZ + this.z + dz + this.motionZ * var1;
        if (this.particleAge++ >= this.particleMaxAge) {
            this.setDead();
        }
    }
    
    public void setDead() {
        super.setDead();
    }
}
