// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelMailboxWow extends ModelBase
{
    ModelRenderer Shape4;
    ModelRenderer Shape1;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    
    public ModelMailboxWow() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        (this.Shape4 = new ModelRenderer((ModelBase)this, 59, 0)).addBox(0.0f, 0.0f, 0.0f, 8, 6, 0);
        this.Shape4.setRotationPoint(-4.0f, -4.0f, 0.0f);
        (this.Shape1 = new ModelRenderer((ModelBase)this, 0, 39)).addBox(0.0f, 0.0f, 0.0f, 8, 5, 8);
        this.Shape1.setRotationPoint(-4.0f, 19.0f, -4.0f);
        (this.Shape2 = new ModelRenderer((ModelBase)this, 0, 21)).addBox(0.0f, 0.0f, 0.0f, 6, 9, 6);
        this.Shape2.setRotationPoint(-3.0f, 10.0f, -3.0f);
        (this.Shape3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 12, 8, 12);
        this.Shape3.setRotationPoint(-6.0f, 2.0f, -6.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.Shape4.render(f5);
        this.Shape1.render(f5);
        this.Shape2.render(f5);
        this.Shape3.render(f5);
    }
}
