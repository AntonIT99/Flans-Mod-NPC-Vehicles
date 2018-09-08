// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.blocks;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBase;

public class ModelAnvil extends ModelBase
{
    ModelRenderer Tail;
    ModelRenderer Nose1;
    ModelRenderer Nose2;
    ModelRenderer Nose3;
    ModelRenderer Nose4;
    ModelRenderer Head1;
    ModelRenderer Head2;
    ModelRenderer Neck2;
    ModelRenderer Bottom2;
    ModelRenderer Bottom3;
    ModelRenderer Foot4;
    
    public ModelAnvil() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        (this.Tail = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 4);
        this.Tail.setRotationPoint(-7.0f, 12.0f, -2.0f);
        (this.Nose1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 5, 6);
        this.Nose1.setRotationPoint(6.0f, 10.0f, -3.0f);
        (this.Nose2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 4, 5);
        this.Nose2.setRotationPoint(7.0f, 10.0f, -2.5f);
        (this.Nose3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 3, 4);
        this.Nose3.setRotationPoint(8.0f, 10.0f, -2.0f);
        (this.Nose4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 1, 2, 2);
        this.Nose4.setRotationPoint(9.0f, 10.0f, -1.0f);
        (this.Head1 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 12, 4, 7);
        this.Head1.setRotationPoint(-6.0f, 12.0f, -3.5f);
        (this.Head2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 14, 2, 9);
        this.Head2.setRotationPoint(-8.0f, 10.0f, -4.5f);
        (this.Neck2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 1, 6);
        this.Neck2.setRotationPoint(-5.0f, 16.0f, -3.0f);
        (this.Bottom2 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 10, 2, 7);
        this.Bottom2.setRotationPoint(-5.0f, 20.0f, -3.5f);
        (this.Bottom3 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 8, 3, 4);
        this.Bottom3.setRotationPoint(-4.0f, 17.0f, -2.0f);
        (this.Foot4 = new ModelRenderer((ModelBase)this, 0, 0)).addBox(0.0f, 0.0f, 0.0f, 14, 2, 10);
        this.Foot4.setRotationPoint(-7.0f, 22.0f, -5.0f);
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.Tail.render(f5);
        this.Nose1.render(f5);
        this.Nose2.render(f5);
        this.Nose3.render(f5);
        this.Nose4.render(f5);
        this.Head1.render(f5);
        this.Head2.render(f5);
        this.Neck2.render(f5);
        this.Bottom2.render(f5);
        this.Bottom3.render(f5);
        this.Foot4.render(f5);
    }
}
