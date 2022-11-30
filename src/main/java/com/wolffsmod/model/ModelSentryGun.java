// 
// Decompiled by Procyon v0.5.36
// 

package com.wolffsmod.model;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelSentryGun extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelSentryGun() {
        this.textureX = 64;
        this.textureY = 64;
        (this.bodyModel = new ModelRendererTurbo[18])[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 32, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 40, 0, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 48, 0, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 56, 0, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 10, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 19, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 16, 19, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 27, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 17, 27, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 37, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 49, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 12, 49, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 24, 49, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 34, 18, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 34, 20, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 34, 22, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 34, 24, this.textureX, this.textureY);
        this.bodyModel[0].addBox(-4.0f, -8.0f, -4.0f, 8, 2, 8, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[0].rotateAngleY = -3.1415927f;
        this.bodyModel[0].rotateAngleZ = 3.1241393f;
        this.bodyModel[1].addShapeBox(-4.0f, -24.0f, -4.0f, 2, 16, 2, 0.0f, 4.0f, 0.0f, 4.0f, -4.0f, 0.0f, 4.0f, -4.0f, 0.0f, -4.0f, 4.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[1].rotateAngleY = -3.1415927f;
        this.bodyModel[1].rotateAngleZ = 3.1241393f;
        this.bodyModel[2].addShapeBox(2.0f, -24.0f, -4.0f, 2, 16, 2, 0.0f, -4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f, 4.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[2].rotateAngleY = -3.1415927f;
        this.bodyModel[2].rotateAngleZ = 3.1241393f;
        this.bodyModel[3].addShapeBox(2.0f, -24.0f, 2.0f, 2, 16, 2, 0.0f, -4.0f, 0.0f, -4.0f, 4.0f, 0.0f, -4.0f, 4.0f, 0.0f, 4.0f, -4.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[3].rotateAngleY = -3.1415927f;
        this.bodyModel[3].rotateAngleZ = 3.1241393f;
        this.bodyModel[4].addShapeBox(-4.0f, -24.0f, 2.0f, 2, 16, 2, 0.0f, 4.0f, 0.0f, -4.0f, -4.0f, 0.0f, -4.0f, -4.0f, 0.0f, 4.0f, 4.0f, 0.0f, 4.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[4].rotateAngleY = -3.1415927f;
        this.bodyModel[4].rotateAngleZ = 3.1241393f;
        this.bodyModel[5].addBox(-4.0f, -6.0f, -4.0f, 8, 1, 8, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[5].rotateAngleY = -3.1415927f;
        this.bodyModel[5].rotateAngleZ = 3.1241393f;
        this.bodyModel[6].addBox(-2.0f, -5.0f, -4.0f, 4, 7, 1, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[6].rotateAngleY = -3.1415927f;
        this.bodyModel[6].rotateAngleZ = 3.1241393f;
        this.bodyModel[7].addBox(-2.0f, -5.0f, 3.0f, 4, 7, 1, 0.0f);
        this.bodyModel[7].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[7].rotateAngleY = -3.1415927f;
        this.bodyModel[7].rotateAngleZ = 3.1241393f;
        this.bodyModel[8].addBox(-3.0f, -6.0f, 4.0f, 6, 6, 2, 0.0f);
        this.bodyModel[8].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[8].rotateAngleY = -3.1415927f;
        this.bodyModel[8].rotateAngleZ = 3.1241393f;
        this.bodyModel[9].addBox(-3.0f, -5.0f, -9.0f, 6, 5, 5, 0.0f);
        this.bodyModel[9].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[9].rotateAngleY = -3.1415927f;
        this.bodyModel[9].rotateAngleZ = 3.1241393f;
        this.bodyModel[10].addBox(-4.0f, -3.0f, -3.0f, 8, 6, 6, 0.0f);
        this.bodyModel[10].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[11].addBox(4.0f, -1.0f, -2.0f, 2, 4, 4, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[12].addBox(8.0f, -1.0f, -2.0f, 2, 4, 4, 0.0f);
        this.bodyModel[12].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[13].addBox(14.0f, -1.0f, -2.0f, 4, 4, 4, 0.0f);
        this.bodyModel[13].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[14].addBox(6.0f, 1.5f, 0.5f, 14, 1, 1, 0.0f);
        this.bodyModel[14].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[15].addBox(6.0f, 1.5f, -1.5f, 14, 1, 1, 0.0f);
        this.bodyModel[15].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[16].addBox(6.0f, -0.5f, -1.5f, 14, 1, 1, 0.0f);
        this.bodyModel[16].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.bodyModel[17].addBox(6.0f, -0.5f, 0.5f, 14, 1, 1, 0.0f);
        this.bodyModel[17].setRotationPoint(0.0f, -13.8f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < this.bodyModel.length; ++i) {
            this.bodyModel[i].render(f5);
        }
    }
    
    public void setRotationAngles(final float f, final float f1, final float f2, final float f3, final float f4, final float f5, final Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        for (int i = 10; i < 18; ++i) {
            this.bodyModel[i].rotateAngleY = f3 / 57.295776f - 1.5707964f;
        }
    }
}