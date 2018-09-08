// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.fx;

import net.minecraft.client.renderer.Tessellator;
import net.minecraft.world.World;
import net.minecraft.client.particle.EntityFX;

public class EntityRainbowFX extends EntityFX
{
    public static float[][] colorTable;
    float reddustParticleScale;
    
    public EntityRainbowFX(final World world, final double d, final double d1, final double d2, final double f, final double f1, final double f2) {
        this(world, d, d1, d2, 1.0f, f, f1, f2);
    }
    
    public EntityRainbowFX(final World world, final double d, final double d1, final double d2, final float f, double f1, final double f2, final double f3) {
        super(world, d, d1, d2, 0.0, 0.0, 0.0);
        this.motionX *= 0.10000000149011612;
        this.motionY *= 0.10000000149011612;
        this.motionZ *= 0.10000000149011612;
        if (f1 == 0.0) {
            f1 = 1.0;
        }
        final int i = world.rand.nextInt(EntityRainbowFX.colorTable.length);
        this.particleRed = EntityRainbowFX.colorTable[i][0];
        this.particleGreen = EntityRainbowFX.colorTable[i][1];
        this.particleBlue = EntityRainbowFX.colorTable[i][2];
        this.particleScale *= 0.75f;
        this.particleScale *= f;
        this.reddustParticleScale = this.particleScale;
        this.particleMaxAge = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.particleMaxAge *= (int)f;
        this.noClip = false;
    }
    
    public void renderParticle(final Tessellator tessellator, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        float f6 = (this.particleAge + f) / this.particleMaxAge * 32.0f;
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (f6 > 1.0f) {
            f6 = 1.0f;
        }
        this.particleScale = this.reddustParticleScale * f6;
        super.renderParticle(tessellator, f, f1, f2, f3, f4, f5);
    }
    
    public void onUpdate() {
        this.prevPosX = this.posX;
        this.prevPosY = this.posY;
        this.prevPosZ = this.posZ;
        if (this.particleAge++ >= this.particleMaxAge) {
            this.setDead();
        }
        this.setParticleTextureIndex(7 - this.particleAge * 8 / this.particleMaxAge);
        this.moveEntity(this.motionX, this.motionY, this.motionZ);
        if (this.posY == this.prevPosY) {
            this.motionX *= 1.1;
            this.motionZ *= 1.1;
        }
        this.motionX *= 0.9599999785423279;
        this.motionY *= 0.9599999785423279;
        this.motionZ *= 0.9599999785423279;
        if (this.onGround) {
            this.motionX *= 0.699999988079071;
            this.motionZ *= 0.699999988079071;
        }
    }
    
    static {
        EntityRainbowFX.colorTable = new float[][] { { 1.0f, 0.0f, 0.0f }, { 1.0f, 0.5f, 0.0f }, { 1.0f, 1.0f, 0.0f }, { 0.0f, 1.0f, 0.0f }, { 0.0f, 0.0f, 1.0f }, { 0.0f, 4375.0f, 0.0f, 1.0f }, { 0.5625f, 0.0f, 1.0f } };
    }
}
