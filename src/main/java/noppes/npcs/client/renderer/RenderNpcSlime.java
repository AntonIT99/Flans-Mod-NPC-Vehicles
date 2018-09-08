// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.renderer;

import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;
import noppes.npcs.entity.EntityNPCInterface;
import net.minecraft.client.model.ModelBase;

public class RenderNpcSlime extends RenderNPCInterface
{
    private ModelBase scaleAmount;
    
    public RenderNpcSlime(final ModelBase par1ModelBase, final ModelBase par2ModelBase, final float par3) {
        super(par1ModelBase, par3);
        this.scaleAmount = par2ModelBase;
    }
    
    protected int shouldSlimeRenderPass(final EntityNPCInterface par1EntitySlime, final int par2, final float par3) {
        if (par1EntitySlime.isInvisible()) {
            return 0;
        }
        if (par2 == 0) {
            this.setRenderPassModel(this.scaleAmount);
            GL11.glEnable(2977);
            GL11.glEnable(3042);
            GL11.glBlendFunc(770, 771);
            return 1;
        }
        if (par2 == 1) {
            GL11.glDisable(3042);
            GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
        }
        return -1;
    }
    
    protected int shouldRenderPass(final EntityLivingBase par1EntityLiving, final int par2, final float par3) {
        return this.shouldSlimeRenderPass((EntityNPCInterface)par1EntityLiving, par2, par3);
    }
}
