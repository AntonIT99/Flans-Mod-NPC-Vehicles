//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.flansmod.client.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelChair2 extends ModelVehicle
{
    int textureX;
    int textureY;
    
    public ModelChair2() {
        this.textureX = 64;
        this.textureY = 64;
        (this.bodyModel = new ModelRendererTurbo[17])[0] = new ModelRendererTurbo((ModelBase)this, 47, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 38, 1, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 16, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 16, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 16, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 16, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 16, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 8, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 8, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 8, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 8, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 0, 8, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 8, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 8, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 8, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 0, 8, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 0, 8, this.textureX, this.textureY);
        this.bodyModel[0].addBox(-1.0f, 0.0f, -1.0f, 2, 3, 2, 0.0f);
        this.bodyModel[0].setRotationPoint(0.0f, 0.0f, 0.0f);
        this.bodyModel[1].addShapeBox(-1.0f, -2.0f, -1.0f, 2, 5, 2, 0.0f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.0f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f, 0.2f, 0.3f, 0.2f);
        this.bodyModel[1].setRotationPoint(0.0f, 5.0f, 0.0f);
        this.bodyModel[2].addShapeBox(-8.8f, -2.0f, -1.0f, 8, 2, 2, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, 8.0f, 0.0f);
        this.bodyModel[3].addShapeBox(-8.8f, -2.0f, -1.0f, 8, 2, 2, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(0.0f, 8.0f, 0.0f);
        this.bodyModel[3].rotateAngleY = -1.2566371f;
        this.bodyModel[4].addShapeBox(-8.8f, -2.0f, -1.0f, 8, 2, 2, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(0.0f, 8.0f, 0.0f);
        this.bodyModel[4].rotateAngleY = -2.5132742f;
        this.bodyModel[5].addShapeBox(-8.8f, -2.0f, -1.0f, 8, 2, 2, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(0.0f, 8.0f, 0.0f);
        this.bodyModel[5].rotateAngleY = -3.7699113f;
        this.bodyModel[6].addShapeBox(-8.8f, -2.0f, -1.0f, 8, 2, 2, 0.0f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, -0.5f, -0.3f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(0.0f, 8.0f, 0.0f);
        this.bodyModel[6].rotateAngleY = -5.0265484f;
        this.bodyModel[7].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f);
        this.bodyModel[7].setRotationPoint(6.5f, 8.5f, 4.8f);
        this.bodyModel[8].addShapeBox(-1.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[8].setRotationPoint(6.7f, 8.7f, 4.8f);
        this.bodyModel[9].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f);
        this.bodyModel[9].setRotationPoint(6.5f, 8.5f, -4.8f);
        this.bodyModel[10].addShapeBox(-1.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[10].setRotationPoint(6.7f, 8.7f, -4.8f);
        this.bodyModel[11].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f);
        this.bodyModel[11].setRotationPoint(-2.5f, 8.5f, 7.8f);
        this.bodyModel[12].addShapeBox(-1.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[12].setRotationPoint(-2.3f, 8.7f, 7.8f);
        this.bodyModel[13].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f);
        this.bodyModel[13].setRotationPoint(-2.5f, 8.5f, -7.8f);
        this.bodyModel[14].addShapeBox(-1.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[14].setRotationPoint(-2.3f, 8.7f, -7.8f);
        this.bodyModel[15].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f, 0.0f, 0.4f, 0.0f);
        this.bodyModel[15].setRotationPoint(-8.0f, 8.5f, 0.0f);
        this.bodyModel[16].addShapeBox(-1.5f, -0.5f, -0.5f, 1, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f, 0.0f, 0.2f, 0.0f);
        this.bodyModel[16].setRotationPoint(-7.8f, 8.7f, 0.0f);
        (this.turretModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase)this, 40, 18, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase)this, 15, 16, this.textureX, this.textureY);
        this.turretModel[0].addBox(-6.0f, -1.0f, -6.0f, 12, 2, 12, 0.0f);
        this.turretModel[0].setRotationPoint(0.0f, -1.0f, 0.0f);
        this.turretModel[1].addBox(-7.0f, -7.0f, -1.0f, 1, 8, 2, 0.0f);
        this.turretModel[1].setRotationPoint(0.0f, -1.0f, 0.0f);
        this.turretModel[2].addBox(-7.0f, -13.0f, -5.0f, 1, 6, 10, 0.0f);
        this.turretModel[2].setRotationPoint(0.0f, -1.0f, 0.0f);
        (this.leftFrontWheelModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo((ModelBase)this, 0, 5, this.textureX, this.textureY);
        this.leftFrontWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 5, this.textureX, this.textureY);
        this.leftFrontWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 5, this.textureX, this.textureY);
        this.leftFrontWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 5, this.textureX, this.textureY);
        this.leftFrontWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 5, this.textureX, this.textureY);
        this.leftFrontWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 5, this.textureX, this.textureY);
        this.leftFrontWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 5, this.textureX, this.textureY);
        this.leftFrontWheelModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 5, this.textureX, this.textureY);
        this.leftFrontWheelModel[0].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 0, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f);
        this.leftFrontWheelModel[0].setRotationPoint(6.1f, 9.1f, 4.8f);
        this.leftFrontWheelModel[1].addShapeBox(-0.5f, -0.5f, 0.8f, 1, 1, 0, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f);
        this.leftFrontWheelModel[1].setRotationPoint(6.1f, 9.1f, 4.8f);
        this.leftFrontWheelModel[2].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 0, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f);
        this.leftFrontWheelModel[2].setRotationPoint(-2.9f, 9.1f, 7.8f);
        this.leftFrontWheelModel[3].addShapeBox(-0.5f, -0.5f, 0.8f, 1, 1, 0, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f);
        this.leftFrontWheelModel[3].setRotationPoint(-2.9f, 9.1f, 7.8f);
        this.leftFrontWheelModel[4].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 0, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f);
        this.leftFrontWheelModel[4].setRotationPoint(-2.9f, 9.1f, -7.8f);
        this.leftFrontWheelModel[5].addShapeBox(-0.5f, -0.5f, 0.8f, 1, 1, 0, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f);
        this.leftFrontWheelModel[5].setRotationPoint(-2.9f, 9.1f, -7.8f);
        this.leftFrontWheelModel[6].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 0, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f);
        this.leftFrontWheelModel[6].setRotationPoint(-8.4f, 9.1f, 0.0f);
        this.leftFrontWheelModel[7].addShapeBox(-0.5f, -0.5f, 0.8f, 1, 1, 0, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f);
        this.leftFrontWheelModel[7].setRotationPoint(-8.4f, 9.1f, 0.0f);
        (this.rightFrontWheelModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 0, 5, this.textureX, this.textureY);
        this.rightFrontWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 5, this.textureX, this.textureY);
        this.rightFrontWheelModel[0].addShapeBox(-0.5f, -0.5f, -0.5f, 1, 1, 0, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f);
        this.rightFrontWheelModel[0].setRotationPoint(6.1f, 9.1f, -4.8f);
        this.rightFrontWheelModel[1].addShapeBox(-0.5f, -0.5f, 0.8f, 1, 1, 0, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.3f, 0.4f, 0.4f, 0.0f, 0.4f, 0.4f, 0.0f);
        this.rightFrontWheelModel[1].setRotationPoint(6.1f, 9.1f, -4.8f);
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
}
