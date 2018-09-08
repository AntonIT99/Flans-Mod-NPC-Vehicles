// 
// Decompiled by Procyon v0.5.30
// 

package noppes.npcs.client.model.part.tails;

import net.minecraft.entity.Entity;
import noppes.npcs.client.model.util.ModelPlaneRenderer;
import net.minecraft.client.model.ModelBase;
import noppes.npcs.client.model.ModelMPM;
import net.minecraft.client.model.ModelRenderer;

public class ModelDragonTail extends ModelRenderer
{
    public ModelDragonTail(final ModelMPM base) {
        super((ModelBase)base);
        final int x = 52;
        final int y = 16;
        final ModelRenderer dragon = new ModelRenderer((ModelBase)base, x, y);
        dragon.setRotationPoint(0.0f, 0.0f, 3.0f);
        this.addChild(dragon);
        final ModelRenderer DragonTail2 = new ModelRenderer((ModelBase)base, x, y);
        DragonTail2.setRotationPoint(0.0f, 2.0f, 2.0f);
        final ModelRenderer DragonTail3 = new ModelRenderer((ModelBase)base, x, y);
        DragonTail3.setRotationPoint(0.0f, 4.5f, 4.0f);
        final ModelRenderer DragonTail4 = new ModelRenderer((ModelBase)base, x, y);
        DragonTail4.setRotationPoint(0.0f, 7.0f, 5.75f);
        final ModelRenderer DragonTail5 = new ModelRenderer((ModelBase)base, x, y);
        DragonTail5.setRotationPoint(0.0f, 9.0f, 8.0f);
        final ModelPlaneRenderer planeLeft = new ModelPlaneRenderer((ModelBase)base, x, y);
        planeLeft.addSidePlane(-1.5f, -1.5f, -1.5f, 3, 3);
        final ModelPlaneRenderer planeRight = new ModelPlaneRenderer((ModelBase)base, x, y);
        planeRight.addSidePlane(-1.5f, -1.5f, -1.5f, 3, 3);
        this.setRotation(planeRight, 3.1415927f, 3.1415927f, 0.0f);
        final ModelPlaneRenderer planeTop = new ModelPlaneRenderer((ModelBase)base, x, y);
        planeTop.addTopPlane(-1.5f, -1.5f, -1.5f, 3, 3);
        this.setRotation(planeTop, 0.0f, -1.5707964f, 0.0f);
        final ModelPlaneRenderer planeBottom = new ModelPlaneRenderer((ModelBase)base, x, y);
        planeBottom.addTopPlane(-1.5f, -1.5f, -1.5f, 3, 3);
        this.setRotation(planeBottom, 0.0f, -1.5707964f, 3.1415927f);
        final ModelPlaneRenderer planeBack = new ModelPlaneRenderer((ModelBase)base, x, y);
        planeBack.addBackPlane(-1.5f, -1.5f, -1.5f, 3, 3);
        this.setRotation(planeBack, 0.0f, 0.0f, 1.5707964f);
        final ModelPlaneRenderer planeFront = new ModelPlaneRenderer((ModelBase)base, x, y);
        planeFront.addBackPlane(-1.5f, -1.5f, -1.5f, 3, 3);
        this.setRotation(planeFront, 0.0f, 3.1415927f, -1.5707964f);
        dragon.addChild((ModelRenderer)planeLeft);
        dragon.addChild((ModelRenderer)planeRight);
        dragon.addChild((ModelRenderer)planeTop);
        dragon.addChild((ModelRenderer)planeBottom);
        dragon.addChild((ModelRenderer)planeFront);
        dragon.addChild((ModelRenderer)planeBack);
        DragonTail2.addChild((ModelRenderer)planeLeft);
        DragonTail2.addChild((ModelRenderer)planeRight);
        DragonTail2.addChild((ModelRenderer)planeTop);
        DragonTail2.addChild((ModelRenderer)planeBottom);
        DragonTail2.addChild((ModelRenderer)planeFront);
        DragonTail2.addChild((ModelRenderer)planeBack);
        DragonTail3.addChild((ModelRenderer)planeLeft);
        DragonTail3.addChild((ModelRenderer)planeRight);
        DragonTail3.addChild((ModelRenderer)planeTop);
        DragonTail3.addChild((ModelRenderer)planeBottom);
        DragonTail3.addChild((ModelRenderer)planeFront);
        DragonTail3.addChild((ModelRenderer)planeBack);
        DragonTail4.addChild((ModelRenderer)planeLeft);
        DragonTail4.addChild((ModelRenderer)planeRight);
        DragonTail4.addChild((ModelRenderer)planeTop);
        DragonTail4.addChild((ModelRenderer)planeBottom);
        DragonTail4.addChild((ModelRenderer)planeFront);
        DragonTail4.addChild((ModelRenderer)planeBack);
        dragon.addChild(DragonTail2);
        dragon.addChild(DragonTail3);
        dragon.addChild(DragonTail4);
    }
    
    public void setRotationAngles(final float par1, final float par2, final float par3, final float par4, final float par5, final float par6, final Entity entity) {
    }
    
    private void setRotation(final ModelRenderer model, final float x, final float y, final float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }
}
