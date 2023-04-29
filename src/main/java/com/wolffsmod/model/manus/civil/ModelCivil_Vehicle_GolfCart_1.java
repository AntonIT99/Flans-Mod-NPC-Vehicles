//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.civil;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelCivil_Vehicle_GolfCart_1 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelCivil_Vehicle_GolfCart_1() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[19])[0] = new ModelRendererTurbo((ModelBase)this, 0, 460, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 100, 460, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 190, 460, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 270, 460, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 420, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 110, 420, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 380, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 80, 380, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 170, 380, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 240, 380, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 240, 390, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 270, 380, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 360, 380, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 90, 340, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 90, 350, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 120, 340, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 0, 300, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 50, 300, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 14, 5, 28, 0.0f);
        this.bodyModel[0].setRotationPoint(-3.0f, -5.0f, -14.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 10, 2, 28, 0.0f);
        this.bodyModel[1].setRotationPoint(1.0f, -7.0f, -14.0f);
        this.bodyModel[1].rotateAngleZ = -0.1919862f;
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 4, 4, 28, 0.0f);
        this.bodyModel[2].setRotationPoint(-3.0f, 0.0f, -14.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 10, 7, 16, 0.0f);
        this.bodyModel[3].setRotationPoint(1.0f, -2.0f, -8.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 26, 2, 28, 0.0f);
        this.bodyModel[4].setRotationPoint(-26.0f, 4.0f, -14.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 10, 2, 2, 0.0f);
        this.bodyModel[5].setRotationPoint(-8.0f, -10.0f, 6.0f);
        this.bodyModel[5].rotateAngleZ = -0.8028514f;
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 10, 7, 28, 0.0f);
        this.bodyModel[6].setRotationPoint(-26.0f, -3.0f, -14.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 15, 3, 28, 0.0f);
        this.bodyModel[7].setRotationPoint(-30.0f, -6.0f, -14.0f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 3, 6, 28, 0.0f);
        this.bodyModel[8].setRotationPoint(-30.0f, -12.0f, -14.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 11, 4, 1, 0.0f);
        this.bodyModel[9].setRotationPoint(-27.0f, -10.0f, -14.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 11, 4, 1, 0.0f);
        this.bodyModel[10].setRotationPoint(-27.0f, -10.0f, 13.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 12, 4, 28, 0.0f);
        this.bodyModel[11].setRotationPoint(-38.0f, -3.0f, -14.0f);
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 3, 9, 28, 0.0f);
        this.bodyModel[12].setRotationPoint(-41.0f, -3.0f, -14.0f);
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 11, 2, 28, 0.0f);
        this.bodyModel[13].setRotationPoint(-41.0f, -5.0f, -14.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 10, 4, 1, 0.0f);
        this.bodyModel[14].setRotationPoint(-40.0f, -9.0f, -14.0f);
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 10, 4, 1, 0.0f);
        this.bodyModel[15].setRotationPoint(-40.0f, -9.0f, 13.0f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 12, 5, 16, 0.0f);
        this.bodyModel[16].setRotationPoint(-38.0f, 1.0f, -8.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 2, 2, 16, 0.0f);
        this.bodyModel[17].setRotationPoint(5.0f, 5.0f, -8.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 2, 2, 16, 0.0f);
        this.bodyModel[18].setRotationPoint(-33.0f, 5.0f, -8.0f);
        this.leftBackWheelModel = new ModelRendererTurbo[1];
        (this.leftBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 498, this.textureX, this.textureY)).addBox(-4.0f, -4.0f, -3.0f, 8, 8, 6, 0.0f);
        this.leftBackWheelModel[0].setRotationPoint(-32.0f, 6.0f, -11.0f);
        this.rightBackWheelModel = new ModelRendererTurbo[1];
        (this.rightBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 498, this.textureX, this.textureY)).addBox(-4.0f, -4.0f, -3.0f, 8, 8, 6, 0.0f);
        this.rightBackWheelModel[0].setRotationPoint(-32.0f, 6.0f, 11.0f);
        this.leftFrontWheelModel = new ModelRendererTurbo[1];
        (this.leftFrontWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 498, this.textureX, this.textureY)).addBox(-4.0f, -4.0f, -3.0f, 8, 8, 6, 0.0f);
        this.leftFrontWheelModel[0].setRotationPoint(6.0f, 6.0f, -11.0f);
        this.rightFrontWheelModel = new ModelRendererTurbo[1];
        (this.rightFrontWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 498, this.textureX, this.textureY)).addBox(-4.0f, -4.0f, -3.0f, 8, 8, 6, 0.0f);
        this.rightFrontWheelModel[0].setRotationPoint(6.0f, 6.0f, 11.0f);
        this.steeringWheelModel = new ModelRendererTurbo[1];
        (this.steeringWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 140, 420, this.textureX, this.textureY)).addBox(0.0f, -4.0f, -4.0f, 1, 8, 8, 0.0f);
        this.steeringWheelModel[0].setRotationPoint(-9.0f, -9.5f, 7.0f);
        this.steeringWheelModel[0].rotateAngleZ = -0.1919862f;
        this.flipAll();
        this.translateAll(13, 0, 0);
    }
}
