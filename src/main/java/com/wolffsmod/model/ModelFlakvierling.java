// 
// Decompiled by Procyon v0.5.36
// 

package com.wolffsmod.model;

import net.minecraft.entity.Entity;
import net.minecraft.client.model.ModelBase;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.model.ModelVehicle;

public class ModelFlakvierling extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelFlakvierling() {
        this.textureX = 256;
        this.textureY = 256;
        (this.bodyModel = new ModelRendererTurbo[12])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 57, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 89, 1, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 153, 1, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 185, 1, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 129, 1, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 145, 1, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 25, 1, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-26.0f, 5.0f, -1.0f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 20, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 8.5f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 8.5f, 0.0f, 0.0f, -10.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-5.0f, 5.0f, -7.0f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 10, 1, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(-5.0f, 4.5f, -9.0f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 18, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(5.0f, 4.5f, -9.0f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 20, 1, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, -1.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -10.0f, -1.0f, 0.0f, 8.5f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(-5.0f, 5.0f, 4.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 4, 1, 18, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.bodyModel[5].setRotationPoint(-9.0f, 4.5f, -9.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.bodyModel[6].setRotationPoint(-25.0f, 4.0f, -0.5f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.bodyModel[7].setRotationPoint(12.5f, 4.0f, 13.5f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f);
        this.bodyModel[8].setRotationPoint(12.5f, 4.0f, -14.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f);
        this.bodyModel[9].setRotationPoint(12.5f, 3.0f, 13.5f);
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f);
        this.bodyModel[10].setRotationPoint(12.5f, 3.0f, -14.5f);
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 1, 3, 1, 0.0f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f, 0.25f, -1.35f, 0.25f);
        this.bodyModel[11].setRotationPoint(-25.0f, 3.0f, -0.5f);
        (this.turretModel = new ModelRendererTurbo[42])[0] = new ModelRendererTurbo((ModelBase)this, 137, 1, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 185, 9, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo((ModelBase)this, 233, 1, this.textureX, this.textureY);
        this.turretModel[4] = new ModelRendererTurbo((ModelBase)this, 57, 9, this.textureX, this.textureY);
        this.turretModel[5] = new ModelRendererTurbo((ModelBase)this, 81, 9, this.textureX, this.textureY);
        this.turretModel[6] = new ModelRendererTurbo((ModelBase)this, 129, 9, this.textureX, this.textureY);
        this.turretModel[7] = new ModelRendererTurbo((ModelBase)this, 41, 25, this.textureX, this.textureY);
        this.turretModel[8] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.turretModel[9] = new ModelRendererTurbo((ModelBase)this, 97, 25, this.textureX, this.textureY);
        this.turretModel[10] = new ModelRendererTurbo((ModelBase)this, 241, 17, this.textureX, this.textureY);
        this.turretModel[11] = new ModelRendererTurbo((ModelBase)this, 121, 25, this.textureX, this.textureY);
        this.turretModel[12] = new ModelRendererTurbo((ModelBase)this, 241, 33, this.textureX, this.textureY);
        this.turretModel[13] = new ModelRendererTurbo((ModelBase)this, 105, 41, this.textureX, this.textureY);
        this.turretModel[14] = new ModelRendererTurbo((ModelBase)this, 193, 41, this.textureX, this.textureY);
        this.turretModel[15] = new ModelRendererTurbo((ModelBase)this, 209, 41, this.textureX, this.textureY);
        this.turretModel[16] = new ModelRendererTurbo((ModelBase)this, 225, 41, this.textureX, this.textureY);
        this.turretModel[17] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.turretModel[18] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.turretModel[19] = new ModelRendererTurbo((ModelBase)this, 65, 25, this.textureX, this.textureY);
        this.turretModel[20] = new ModelRendererTurbo((ModelBase)this, 1, 49, this.textureX, this.textureY);
        this.turretModel[21] = new ModelRendererTurbo((ModelBase)this, 9, 49, this.textureX, this.textureY);
        this.turretModel[22] = new ModelRendererTurbo((ModelBase)this, 193, 41, this.textureX, this.textureY);
        this.turretModel[23] = new ModelRendererTurbo((ModelBase)this, 121, 49, this.textureX, this.textureY);
        this.turretModel[24] = new ModelRendererTurbo((ModelBase)this, 73, 49, this.textureX, this.textureY);
        this.turretModel[25] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.turretModel[26] = new ModelRendererTurbo((ModelBase)this, 209, 41, this.textureX, this.textureY);
        this.turretModel[27] = new ModelRendererTurbo((ModelBase)this, 153, 49, this.textureX, this.textureY);
        this.turretModel[28] = new ModelRendererTurbo((ModelBase)this, 97, 49, this.textureX, this.textureY);
        this.turretModel[29] = new ModelRendererTurbo((ModelBase)this, 241, 49, this.textureX, this.textureY);
        this.turretModel[30] = new ModelRendererTurbo((ModelBase)this, 225, 41, this.textureX, this.textureY);
        this.turretModel[31] = new ModelRendererTurbo((ModelBase)this, 9, 49, this.textureX, this.textureY);
        this.turretModel[32] = new ModelRendererTurbo((ModelBase)this, 49, 57, this.textureX, this.textureY);
        this.turretModel[33] = new ModelRendererTurbo((ModelBase)this, 145, 49, this.textureX, this.textureY);
        this.turretModel[34] = new ModelRendererTurbo((ModelBase)this, 97, 57, this.textureX, this.textureY);
        this.turretModel[35] = new ModelRendererTurbo((ModelBase)this, 121, 57, this.textureX, this.textureY);
        this.turretModel[36] = new ModelRendererTurbo((ModelBase)this, 121, 49, this.textureX, this.textureY);
        this.turretModel[37] = new ModelRendererTurbo((ModelBase)this, 185, 49, this.textureX, this.textureY);
        this.turretModel[38] = new ModelRendererTurbo((ModelBase)this, 1, 57, this.textureX, this.textureY);
        this.turretModel[39] = new ModelRendererTurbo((ModelBase)this, 73, 57, this.textureX, this.textureY);
        this.turretModel[40] = new ModelRendererTurbo((ModelBase)this, 137, 57, this.textureX, this.textureY);
        this.turretModel[41] = new ModelRendererTurbo((ModelBase)this, 39, 86, this.textureX, this.textureY);
        this.turretModel[0].addShapeBox(5.0f, 6.5f, -7.0f, 2, 1, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[0].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[1].addShapeBox(-7.0f, 6.5f, -7.0f, 2, 1, 14, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f);
        this.turretModel[1].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[2].addShapeBox(-5.0f, 6.5f, -7.0f, 10, 1, 14, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[2].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[3].addBox(-4.0f, -3.0f, 3.0f, 8, 10, 1, 0.0f);
        this.turretModel[3].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[4].addBox(-4.0f, -3.0f, -4.0f, 8, 10, 1, 0.0f);
        this.turretModel[4].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[5].addShapeBox(-4.0f, -5.0f, -4.0f, 8, 2, 1, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[5].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[6].addShapeBox(-4.0f, -5.0f, 3.0f, 8, 2, 1, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[6].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[7].addBox(-3.0f, -3.0f, -2.5f, 6, 7, 5, 0.0f);
        this.turretModel[7].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[8].addShapeBox(-3.0f, -7.0f, -3.0f, 6, 4, 6, 0.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[8].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[9].addShapeBox(-6.0f, -7.0f, -3.0f, 3, 4, 6, 0.0f, 2.0f, 1.0f, -2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 1.0f, -2.0f, 2.0f, 1.0f, -2.0f, 0.0f, -2.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, -2.0f);
        this.turretModel[9].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[10].addShapeBox(3.0f, -6.0f, -3.0f, 1, 3, 6, 0.0f, 0.0f, 1.0f, -2.0f, 0.0f, -1.0f, -3.0f, 0.0f, -1.0f, -3.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[10].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[11].addShapeBox(3.0f, -3.0f, -4.5f, 2, 7, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.turretModel[11].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[12].addShapeBox(5.5f, -3.0f, -3.0f, 1, 8, 6, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.turretModel[12].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[13].addShapeBox(5.5f, -2.0f, -12.0f, 1, 8, 6, 0.0f, 2.2f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.turretModel[13].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[14].addShapeBox(5.5f, -2.0f, 6.0f, 1, 8, 6, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f);
        this.turretModel[14].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[15].addShapeBox(5.5f, -8.0f, -12.0f, 1, 6, 6, 0.0f, 4.2f, 0.0f, -2.2f, -4.6f, 0.0f, -2.2f, -2.6f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.turretModel[15].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[16].addShapeBox(5.5f, -8.0f, 6.0f, 1, 6, 6, 0.0f, 2.2f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -4.6f, 0.0f, -2.2f, 4.2f, 0.0f, -2.2f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f);
        this.turretModel[16].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[17].addBox(-13.0f, 3.0f, -10.5f, 10, 1, 21, 0.0f);
        this.turretModel[17].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[18].addBox(-15.0f, 0.0f, -3.0f, 6, 1, 6, 0.0f);
        this.turretModel[18].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[19].addBox(-13.0f, 1.0f, -0.5f, 1, 2, 1, 0.0f);
        this.turretModel[19].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[20].addShapeBox(-16.0f, -2.0f, -1.0f, 1, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.turretModel[20].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[21].addBox(-16.0f, -5.0f, -2.5f, 1, 3, 5, 0.0f);
        this.turretModel[21].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[22].addBox(-13.0f, 1.0f, -2.5f, 1, 2, 1, 0.0f);
        this.turretModel[22].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[22].rotateAngleY = 0.7330383f;
        this.turretModel[23].addBox(-15.0f, 0.0f, -5.0f, 6, 1, 6, 0.0f);
        this.turretModel[23].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[23].rotateAngleY = 0.7330383f;
        this.turretModel[24].addShapeBox(-16.0f, -2.0f, -3.0f, 1, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.turretModel[24].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[24].rotateAngleY = 0.7330383f;
        this.turretModel[25].addBox(-16.0f, -5.0f, -4.5f, 1, 3, 5, 0.0f);
        this.turretModel[25].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[25].rotateAngleY = 0.7330383f;
        this.turretModel[26].addBox(-13.0f, 1.0f, 1.5f, 1, 2, 1, 0.0f);
        this.turretModel[26].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[26].rotateAngleY = -0.7330383f;
        this.turretModel[27].addBox(-15.0f, 0.0f, -1.0f, 6, 1, 6, 0.0f);
        this.turretModel[27].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[27].rotateAngleY = -0.7330383f;
        this.turretModel[28].addShapeBox(-16.0f, -2.0f, 1.0f, 1, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f);
        this.turretModel[28].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[28].rotateAngleY = -0.7330383f;
        this.turretModel[29].addBox(-16.0f, -5.0f, -0.5f, 1, 3, 5, 0.0f);
        this.turretModel[29].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[29].rotateAngleY = -0.7330383f;
        this.turretModel[30].addShapeBox(-4.0f, -14.0f, 1.0f, 1, 3, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.turretModel[30].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[31].addShapeBox(-4.0f, -14.0f, -2.0f, 1, 3, 1, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.2f, 1.0f, 0.0f, -0.2f, 1.0f, 0.0f);
        this.turretModel[31].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[32].addShapeBox(-9.0f, -11.0f, 1.0f, 6, 3, 3, 0.0f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f);
        this.turretModel[32].setRotationPoint(0.0f, 0.0f, -1.0f);
        this.turretModel[33].addShapeBox(-11.0f, -11.0f, 2.5f, 4, 3, 2, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f);
        this.turretModel[33].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[34].addBox(-6.0f, -5.0f, -2.0f, 4, 1, 4, 0.0f);
        this.turretModel[34].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[34].rotateAngleZ = 0.17453294f;
        this.turretModel[35].addBox(-5.5f, -6.0f, -1.5f, 3, 1, 3, 0.0f);
        this.turretModel[35].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[35].rotateAngleZ = 0.17453294f;
        this.turretModel[36].addShapeBox(-5.5f, -7.0f, -0.5f, 1, 1, 1, 0.0f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f, -0.2f, 0.2f, -0.2f);
        this.turretModel[36].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.turretModel[36].rotateAngleZ = 0.17453294f;
        this.turretModel[37].addShapeBox(3.0f, -2.0f, -14.0f, 1, 5, 2, 0.0f, 2.2f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.turretModel[37].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[38].addShapeBox(3.0f, -8.0f, -14.0f, 1, 6, 2, 0.0f, 4.2f, 0.0f, -2.2f, -4.6f, 0.0f, -2.2f, -2.1f, 0.0f, 2.2f, 1.7f, 0.0f, 2.2f, 2.2f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f);
        this.turretModel[38].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[39].addShapeBox(3.0f, -2.0f, 12.0f, 1, 5, 2, 0.0f, -0.2f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f, -0.2f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f);
        this.turretModel[39].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[40].addShapeBox(3.0f, -8.0f, 12.0f, 1, 6, 2, 0.0f, 1.7f, 0.0f, 2.2f, -2.1f, 0.0f, 2.2f, -4.6f, 0.0f, -2.2f, 4.2f, 0.0f, -2.2f, -0.2f, 0.0f, 0.0f, -0.1f, 0.0f, 0.0f, -2.6f, 0.0f, 0.0f, 2.2f, 0.0f, 0.0f);
        this.turretModel[40].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[41].addShapeBox(-3.0f, -8.8f, 5.0f, 35, 1, 35, 0.0f, 0.0f, 0.0f, 0.0f, -32.0f, 0.0f, 0.0f, -32.0f, 0.0f, -32.0f, 0.0f, 0.0f, -32.0f, 0.0f, 0.0f, 0.0f, -32.0f, 0.0f, 0.0f, -32.0f, 0.0f, -32.0f, 0.0f, 0.0f, -32.0f);
        this.turretModel[41].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.turretModel[41].rotateAngleY = 0.43633232f;
        this.turretModel[41].rotateAngleZ = -1.1868238f;
        (this.barrelModel = new ModelRendererTurbo[38])[0] = new ModelRendererTurbo((ModelBase)this, 137, 17, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 9, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase)this, 225, 17, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase)this, 113, 25, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo((ModelBase)this, 169, 25, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo((ModelBase)this, 193, 25, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo((ModelBase)this, 145, 33, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo((ModelBase)this, 33, 9, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo((ModelBase)this, 185, 9, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo((ModelBase)this, 33, 17, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo((ModelBase)this, 89, 25, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo((ModelBase)this, 161, 1, this.textureX, this.textureY);
        this.barrelModel[13] = new ModelRendererTurbo((ModelBase)this, 217, 25, this.textureX, this.textureY);
        this.barrelModel[14] = new ModelRendererTurbo((ModelBase)this, 73, 17, this.textureX, this.textureY);
        this.barrelModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.barrelModel[16] = new ModelRendererTurbo((ModelBase)this, 193, 33, this.textureX, this.textureY);
        this.barrelModel[17] = new ModelRendererTurbo((ModelBase)this, 217, 33, this.textureX, this.textureY);
        this.barrelModel[18] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.barrelModel[19] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.barrelModel[20] = new ModelRendererTurbo((ModelBase)this, 145, 41, this.textureX, this.textureY);
        this.barrelModel[21] = new ModelRendererTurbo((ModelBase)this, 225, 9, this.textureX, this.textureY);
        this.barrelModel[22] = new ModelRendererTurbo((ModelBase)this, 225, 25, this.textureX, this.textureY);
        this.barrelModel[23] = new ModelRendererTurbo((ModelBase)this, 233, 25, this.textureX, this.textureY);
        this.barrelModel[24] = new ModelRendererTurbo((ModelBase)this, 17, 33, this.textureX, this.textureY);
        this.barrelModel[25] = new ModelRendererTurbo((ModelBase)this, 25, 33, this.textureX, this.textureY);
        this.barrelModel[26] = new ModelRendererTurbo((ModelBase)this, 209, 33, this.textureX, this.textureY);
        this.barrelModel[27] = new ModelRendererTurbo((ModelBase)this, 233, 33, this.textureX, this.textureY);
        this.barrelModel[28] = new ModelRendererTurbo((ModelBase)this, 97, 41, this.textureX, this.textureY);
        this.barrelModel[29] = new ModelRendererTurbo((ModelBase)this, 89, 49, this.textureX, this.textureY);
        this.barrelModel[30] = new ModelRendererTurbo((ModelBase)this, 177, 49, this.textureX, this.textureY);
        this.barrelModel[31] = new ModelRendererTurbo((ModelBase)this, 17, 49, this.textureX, this.textureY);
        this.barrelModel[32] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.barrelModel[33] = new ModelRendererTurbo((ModelBase)this, 81, 49, this.textureX, this.textureY);
        this.barrelModel[34] = new ModelRendererTurbo((ModelBase)this, 89, 33, this.textureX, this.textureY);
        this.barrelModel[35] = new ModelRendererTurbo((ModelBase)this, 145, 57, this.textureX, this.textureY);
        this.barrelModel[36] = new ModelRendererTurbo((ModelBase)this, 161, 57, this.textureX, this.textureY);
        this.barrelModel[37] = new ModelRendererTurbo((ModelBase)this, 177, 57, this.textureX, this.textureY);
        this.barrelModel[0].addBox(-1.0f, -0.75f, -5.0f, 2, 2, 10, 0.0f);
        this.barrelModel[0].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[1].addShapeBox(-3.5f, -3.25f, 3.5f, 7, 2, 1, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[1].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[2].addShapeBox(-3.5f, -1.25f, 3.5f, 7, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[2].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[3].addShapeBox(-3.5f, 1.75f, 3.5f, 7, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.barrelModel[3].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[4].addShapeBox(-3.5f, -1.25f, -4.5f, 7, 3, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[4].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[5].addShapeBox(-3.5f, 1.75f, -4.5f, 7, 2, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f);
        this.barrelModel[5].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[6].addShapeBox(-3.5f, -3.25f, -4.5f, 7, 2, 1, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[6].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[7].addShapeBox(0.0f, -3.0f, 4.0f, 22, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.barrelModel[7].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[8].addShapeBox(-1.0f, -2.0f, 4.0f, 5, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.barrelModel[8].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[9].addShapeBox(-1.0f, 1.5f, 5.0f, 5, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.barrelModel[9].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[10].addShapeBox(-1.0f, -2.0f, -5.0f, 5, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.barrelModel[10].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[11].addShapeBox(-1.0f, 1.5f, -6.0f, 5, 1, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.barrelModel[11].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[12].addShapeBox(5.5f, -4.0f, 3.0f, 1, 6, 3, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.barrelModel[12].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[13].addShapeBox(4.5f, -5.0f, 3.0f, 1, 1, 3, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -2.0f, 0.0f);
        this.barrelModel[13].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[14].addShapeBox(-1.5f, -2.0f, 5.0f, 5, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[14].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[14].rotateAngleY = -0.06981317f;
        this.barrelModel[15].addShapeBox(-1.5f, 1.5f, 5.0f, 5, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[15].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[15].rotateAngleY = -0.06981317f;
        this.barrelModel[16].addShapeBox(-1.5f, -2.0f, -9.0f, 5, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[16].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[16].rotateAngleY = 0.06981317f;
        this.barrelModel[17].addShapeBox(-1.5f, 1.5f, -9.0f, 5, 1, 4, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, -1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[17].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[17].rotateAngleY = 0.06981317f;
        this.barrelModel[18].addShapeBox(0.0f, 0.5f, 4.0f, 22, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.barrelModel[18].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[19].addShapeBox(0.0f, 0.5f, -5.0f, 22, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.barrelModel[19].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[20].addShapeBox(0.0f, -3.0f, -5.0f, 22, 1, 1, 0.0f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f, 0.0f, -0.2f, -0.2f);
        this.barrelModel[20].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[21].addShapeBox(22.0f, -3.0f, 4.0f, 2, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        this.barrelModel[21].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[22].addShapeBox(22.0f, 0.5f, 4.0f, 2, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        this.barrelModel[22].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[23].addShapeBox(22.0f, 0.5f, -5.0f, 2, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        this.barrelModel[23].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[24].addShapeBox(22.0f, -3.0f, -5.0f, 2, 1, 1, 0.0f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f, 0.0f, -0.1f, -0.1f);
        this.barrelModel[24].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[25].addShapeBox(-5.0f, -2.5f, 4.0f, 4, 2, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.barrelModel[25].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[26].addShapeBox(-5.0f, 1.5f, 4.0f, 4, 2, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.barrelModel[26].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[27].addShapeBox(-5.0f, 1.5f, -5.0f, 4, 2, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.barrelModel[27].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[28].addShapeBox(-5.0f, -2.5f, -5.0f, 4, 2, 1, 0.0f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f);
        this.barrelModel[28].setRotationPoint(0.0f, -4.0f, 0.0f);
        this.barrelModel[29].addShapeBox(-1.5f, -2.0f, 2.5f, 2, 3, 1, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, -0.5f, -0.5f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[29].setRotationPoint(-7.5f, -11.0f, 0.0f);
        this.barrelModel[30].addBox(-1.0f, -2.0f, 0.5f, 1, 1, 2, 0.0f);
        this.barrelModel[30].setRotationPoint(-7.5f, -11.0f, 0.0f);
        this.barrelModel[31].addShapeBox(-1.0f, -3.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f);
        this.barrelModel[31].setRotationPoint(-7.5f, -11.0f, 0.0f);
        this.barrelModel[32].addBox(-1.0f, -2.0f, -1.5f, 1, 1, 1, 0.0f);
        this.barrelModel[32].setRotationPoint(-7.5f, -11.0f, 0.0f);
        this.barrelModel[33].addShapeBox(-1.0f, -1.0f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.barrelModel[33].setRotationPoint(-7.5f, -11.0f, 0.0f);
        this.barrelModel[34].addShapeBox(4.5f, -2.0f, 3.0f, 1, 1, 3, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 0.0f);
        this.barrelModel[34].setRotationPoint(0.0f, 1.0f, 0.0f);
        this.barrelModel[35].addShapeBox(4.5f, -5.0f, -6.0f, 1, 1, 3, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -2.0f, 0.0f);
        this.barrelModel[35].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[36].addShapeBox(5.5f, -4.0f, -6.0f, 1, 6, 3, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        this.barrelModel[36].setRotationPoint(0.0f, -3.0f, 0.0f);
        this.barrelModel[37].addShapeBox(4.5f, -2.0f, -6.0f, 1, 1, 3, 0.0f, 1.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, -2.0f, 0.0f, 1.0f, 2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 0.0f);
        this.barrelModel[37].setRotationPoint(0.0f, 1.0f, 0.0f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    public void render(final Entity entity, final float f, final float f1, final float f2, final float f3, final float f4, final float f5) {
        for (int i = 0; i < this.bodyModel.length; ++i) {
            this.bodyModel[i].render(f5);
        }
        for (int i = 0; i < this.turretModel.length; ++i) {
            this.turretModel[i].render(f5);
        }
        for (int i = 0; i < this.barrelModel.length; ++i) {
            this.barrelModel[i].render(f5);
        }
    }
}