// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.fx;

import org.lwjgl.opengl.GL11;
import noppes.npcs.client.ClientProxy;
import net.minecraft.client.renderer.Tessellator;
import noppes.npcs.ModelPartData;
import net.minecraft.util.ResourceLocation;
import noppes.npcs.entity.EntityCustomNpc;
import net.minecraft.client.particle.EntityPortalFX;

public class EntityEnderFX extends EntityPortalFX
{
    private float portalParticleScale;
    private int particleNumber;
    private EntityCustomNpc npc;
    private static final ResourceLocation resource;
    private final ResourceLocation location;
    private boolean move;
    private float startX;
    private float startY;
    private float startZ;
    
    public EntityEnderFX(final EntityCustomNpc npc, final double par2, final double par4, final double par6, final double par8, final double par10, final double par12, final ModelPartData data) {
        super(npc.worldObj, par2, par4, par6, par8, par10, par12);
        this.move = true;
        this.startX = 0.0f;
        this.startY = 0.0f;
        this.startZ = 0.0f;
        this.npc = npc;
        this.particleNumber = npc.getRNG().nextInt(2);
        final float n = this.rand.nextFloat() * 0.2f + 0.5f;
        this.particleScale = n;
        this.portalParticleScale = n;
        this.particleRed = (data.color >> 16 & 0xFF) / 255.0f;
        this.particleGreen = (data.color >> 8 & 0xFF) / 255.0f;
        this.particleBlue = (data.color & 0xFF) / 255.0f;
        if (npc.getRNG().nextInt(3) == 1) {
            this.move = false;
            this.startX = (float)npc.posX;
            this.startY = (float)npc.posY;
            this.startZ = (float)npc.posZ;
        }
        if (data.playerTexture) {
            this.location = npc.textureLocation;
        }
        else {
            this.location = new ResourceLocation(data.texture);
        }
    }
    
    public void renderParticle(final Tessellator par1Tessellator, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
        if (this.move) {
            this.startX = (float)(this.npc.prevPosX + (this.npc.posX - this.npc.prevPosX) * par2);
            this.startY = (float)(this.npc.prevPosY + (this.npc.posY - this.npc.prevPosY) * par2);
            this.startZ = (float)(this.npc.prevPosZ + (this.npc.posZ - this.npc.prevPosZ) * par2);
        }
        final Tessellator tessellator = Tessellator.instance;
        tessellator.draw();
        float scale = (this.particleAge + par2) / this.particleMaxAge;
        scale = 1.0f - scale;
        scale *= scale;
        scale = 1.0f - scale;
        this.particleScale = this.portalParticleScale * scale;
        ClientProxy.bindTexture(this.location);
        final float f = 0.875f;
        final float f2 = f + 0.125f;
        final float f3 = 0.75f - this.particleNumber * 0.25f;
        final float f4 = f3 + 0.25f;
        final float f5 = 0.1f * this.particleScale;
        final float f6 = (float)(this.prevPosX + (this.posX - this.prevPosX) * par2 - EntityEnderFX.interpPosX + this.startX);
        final float f7 = (float)(this.prevPosY + (this.posY - this.prevPosY) * par2 - EntityEnderFX.interpPosY + this.startY);
        final float f8 = (float)(this.prevPosZ + (this.posZ - this.prevPosZ) * par2 - EntityEnderFX.interpPosZ + this.startZ);
        GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        tessellator.startDrawingQuads();
        tessellator.setBrightness(240);
        par1Tessellator.setColorOpaque_F(1.0f, 1.0f, 1.0f);
        par1Tessellator.setColorRGBA_F(this.particleRed, this.particleGreen, this.particleBlue, 1.0f);
        par1Tessellator.addVertexWithUV((double)(f6 - par3 * f5 - par6 * f5), (double)(f7 - par4 * f5), (double)(f8 - par5 * f5 - par7 * f5), (double)f2, (double)f4);
        par1Tessellator.addVertexWithUV((double)(f6 - par3 * f5 + par6 * f5), (double)(f7 + par4 * f5), (double)(f8 - par5 * f5 + par7 * f5), (double)f2, (double)f3);
        par1Tessellator.addVertexWithUV((double)(f6 + par3 * f5 + par6 * f5), (double)(f7 + par4 * f5), (double)(f8 + par5 * f5 + par7 * f5), (double)f, (double)f3);
        par1Tessellator.addVertexWithUV((double)(f6 + par3 * f5 - par6 * f5), (double)(f7 - par4 * f5), (double)(f8 + par5 * f5 - par7 * f5), (double)f, (double)f4);
        tessellator.draw();
        ClientProxy.bindTexture(EntityEnderFX.resource);
        tessellator.startDrawingQuads();
    }
    
    public int getFXLayer() {
        return 0;
    }
    
    static {
        resource = new ResourceLocation("textures/particle/particles.png");
    }
}
