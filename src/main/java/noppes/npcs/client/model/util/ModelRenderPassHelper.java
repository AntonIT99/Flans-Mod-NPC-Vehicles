// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.util;

import net.minecraft.client.renderer.entity.NPCRendererHelper;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.client.renderer.entity.RendererLivingEntity;
import net.minecraft.client.model.ModelBase;

public class ModelRenderPassHelper extends ModelBase
{
    public RendererLivingEntity renderer;
    public EntityLivingBase entity;
    
    public void render(final Entity par1Entity, final float par2, final float par3, final float par4, final float par5, final float par6, final float par7) {
        final ModelBase model = NPCRendererHelper.getPassModel(this.renderer);
        model.isChild = this.isChild;
        model.render((Entity)this.entity, par2, par3, par4, par5, par6, par7);
    }
    
    public void setLivingAnimations(final EntityLivingBase par1EntityLivingBase, final float par2, final float par3, final float par4) {
        final ModelBase model = NPCRendererHelper.getPassModel(this.renderer);
        model.isChild = this.isChild;
        model.setLivingAnimations(this.entity, par2, par3, par4);
    }
}
