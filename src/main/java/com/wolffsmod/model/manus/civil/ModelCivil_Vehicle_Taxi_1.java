//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.civil;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelCivil_Vehicle_Taxi_1 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelCivil_Vehicle_Taxi_1() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[20])[0] = new ModelRendererTurbo((ModelBase)this, 0, 225, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 466, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 31, 372, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 372, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 82, 270, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 269, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 450, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 434, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 86, 394, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 386, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 359, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 27, 359, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 311, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 86, 347, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 86, 311, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 155, 388, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 155, 348, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 82, 225, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 90, 225, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 198, this.textureX, this.textureY);
        this.bodyModel[0].addBox(8.0f, -8.0f, -14.0f, 12, 14, 28, 0.0f);
        this.bodyModel[1].addBox(-24.0f, 4.0f, -16.0f, 32, 2, 32, 0.0f);
        this.bodyModel[2].addBox(8.0f, -8.0f, -16.0f, 12, 9, 2, 0.0f);
        this.bodyModel[3].addBox(8.0f, -8.0f, 14.0f, 12, 9, 2, 0.0f);
        this.bodyModel[4].addBox(-6.0f, -7.0f, -14.0f, 1, 11, 28, 0.0f);
        this.bodyModel[5].addBox(-34.0f, -8.0f, -14.0f, 12, 12, 28, 0.0f);
        this.bodyModel[6].addBox(-24.0f, -8.0f, -16.0f, 32, 12, 2, 0.0f);
        this.bodyModel[7].addBox(-24.0f, -8.0f, 14.0f, 32, 12, 2, 0.0f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 13, 32, 0.0f);
        this.bodyModel[8].setRotationPoint(-20.0f, -19.0f, -16.0f);
        this.bodyModel[8].rotateAngleZ = -0.5235988f;
        this.bodyModel[9].addBox(20.0f, -8.0f, -16.0f, 10, 14, 32, 0.0f);
        this.bodyModel[10].addBox(-34.0f, -8.0f, 14.0f, 10, 9, 2, 0.0f);
        this.bodyModel[11].addBox(-34.0f, -8.0f, -16.0f, 10, 9, 2, 0.0f);
        this.bodyModel[12].addBox(-44.0f, -8.0f, -16.0f, 10, 14, 32, 0.0f);
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 1, 12, 32, 0.0f);
        this.bodyModel[13].setRotationPoint(5.0f, -18.0f, -16.0f);
        this.bodyModel[13].rotateAngleZ = 0.4363323f;
        this.bodyModel[14].addBox(-21.0f, -19.0f, -16.0f, 27, 1, 32, 0.0f);
        this.bodyModel[15].addBox(-45.0f, 2.0f, -17.0f, 6, 4, 34, 0.0f);
        this.bodyModel[16].addBox(25.0f, 2.0f, -17.0f, 6, 4, 34, 0.0f);
        this.bodyModel[17].addBox(-7.0f, -18.0f, -16.0f, 2, 10, 1, 0.0f);
        this.bodyModel[18].addBox(-7.0f, -18.0f, 15.0f, 2, 10, 1, 0.0f);
        this.bodyModel[19].addBox(-8.0f, -24.0f, -8.5f, 3, 7, 17, 0.0f);
        this.leftBackWheelModel = new ModelRendererTurbo[1];
        (this.leftBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 502, this.textureX, this.textureY)).addBox(-4.0f, -4.0f, -1.0f, 8, 8, 2, 0.0f);
        this.leftBackWheelModel[0].setRotationPoint(-29.0f, 6.0f, -15.0f);
        this.rightBackWheelModel = new ModelRendererTurbo[1];
        (this.rightBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 502, this.textureX, this.textureY)).addBox(-4.0f, -4.0f, -1.0f, 8, 8, 2, 0.0f);
        this.rightBackWheelModel[0].setRotationPoint(-29.0f, 6.0f, 15.0f);
        this.leftFrontWheelModel = new ModelRendererTurbo[1];
        (this.leftFrontWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 502, this.textureX, this.textureY)).addBox(-4.0f, -4.0f, -1.0f, 8, 8, 2, 0.0f);
        this.leftFrontWheelModel[0].setRotationPoint(14.0f, 6.0f, -15.0f);
        this.rightFrontWheelModel = new ModelRendererTurbo[1];
        (this.rightFrontWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 502, this.textureX, this.textureY)).addBox(-4.0f, -4.0f, -1.0f, 8, 8, 2, 0.0f);
        this.rightFrontWheelModel[0].setRotationPoint(14.0f, 6.0f, 15.0f);
        this.steeringWheelModel = new ModelRendererTurbo[1];
        (this.steeringWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 150, this.textureX, this.textureY)).addBox(0.0f, -4.0f, -4.0f, 1, 8, 8, 0.0f);
        this.steeringWheelModel[0].setRotationPoint(7.0f, -7.0f, 8.0f);
        this.steeringWheelModel[0].rotateAngleZ = -0.1919862f;
        this.flipAll();
        this.translateAll(8, 0, 0);
    }
}
