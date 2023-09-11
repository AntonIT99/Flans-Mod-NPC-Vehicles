//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.monolith;

import com.wolffsmod.model.*;
import com.flansmod.client.tmt.*;
import net.minecraft.client.model.*;

public class ModelOnager extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelOnager() {
        this.textureX = 256;
        this.textureY = 128;
        this.bodyModel = new ModelRendererTurbo[20];
        this.leftBackWheelModel = new ModelRendererTurbo[6];
        this.rightBackWheelModel = new ModelRendererTurbo[6];
        this.initbodyModel_1();
        this.initleftBackWheelModel_1();
        this.initrightBackWheelModel_1();
        this.translateAll(0.0f, 0.0f, 0.0f);
        this.flipAll();
    }
    
    private void initbodyModel_1() {
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 1, 1, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 1, 17, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 105, 33, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 169, 33, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 233, 25, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 145, 33, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 49, 49, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 97, 65, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 233, 49, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 177, 65, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 193, 65, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 209, 65, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 1, 81, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 1, 41, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 1, 89, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 233, 9, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 169, 33, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 49, 41, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 9, 81, this.textureX, this.textureY);
        this.bodyModel[0].addShapeBox(0.0f, 0.0f, 0.0f, 80, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[0].setRotationPoint(-40.0f, 3.5f, -17.5f);
        this.bodyModel[1].addShapeBox(0.0f, 0.0f, 0.0f, 80, 4, 5, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[1].setRotationPoint(-40.0f, 3.5f, 12.5f);
        this.bodyModel[2].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 25, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[2].setRotationPoint(-40.0f, 3.5f, -12.5f);
        this.bodyModel[3].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 25, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[3].setRotationPoint(36.0f, 3.5f, -12.5f);
        this.bodyModel[4].addShapeBox(0.0f, 0.0f, 0.0f, 5, 20, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[4].setRotationPoint(1.0f, -16.0f, -16.5f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 5, 20, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(1.0f, -16.0f, 13.5f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 5, 3, 33, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(1.0f, -19.0f, -16.5f);
        this.bodyModel[7].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 35, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[7].setRotationPoint(6.0f, -1.0f, -17.5f);
        this.bodyModel[8].addShapeBox(0.0f, 0.0f, 0.0f, 4, 4, 33, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f, -0.4f, -0.4f, 0.0f);
        this.bodyModel[8].setRotationPoint(-5.0f, 3.5f, -16.5f);
        this.bodyModel[9].addShapeBox(0.0f, 0.0f, 0.0f, 4, 38, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[9].setRotationPoint(1.0f, -10.0f, 13.5f);
        this.bodyModel[9].rotateAngleZ = 1.0995574f;
        this.bodyModel[10].addShapeBox(0.0f, 0.0f, 0.0f, 4, 38, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[10].setRotationPoint(1.0f, -10.0f, -16.5f);
        this.bodyModel[10].rotateAngleZ = 1.0995574f;
        this.bodyModel[11].addShapeBox(0.0f, 0.0f, 0.0f, 4, 38, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[11].setRotationPoint(4.0f, -13.0f, 13.5f);
        this.bodyModel[11].rotateAngleZ = -1.0995574f;
        this.bodyModel[12].addShapeBox(0.0f, 0.0f, 0.0f, 4, 38, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[12].setRotationPoint(4.0f, -13.0f, -16.5f);
        this.bodyModel[12].rotateAngleZ = -1.0995574f;
        this.bodyModel[13].addShapeBox(0.5f, 4.0f, 0.0f, 2, 35, 3, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[13].setRotationPoint(-20.0f, -30.0f, -1.5f);
        this.bodyModel[13].rotateAngleZ = 0.41887903f;
        this.bodyModel[14].addShapeBox(-1.5f, -6.0f, -2.0f, 4, 10, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[14].setRotationPoint(-20.0f, -30.0f, -2.5f);
        this.bodyModel[14].rotateAngleZ = 0.41887903f;
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 2, 3, 37, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[15].setRotationPoint(6.0f, -16.0f, -18.5f);
        this.bodyModel[16].addShapeBox(0.0f, 0.0f, 0.0f, 9, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[16].setRotationPoint(1.0f, -16.0f, -24.5f);
        this.bodyModel[16].rotateAngleY = 0.7330383f;
        this.bodyModel[17].addShapeBox(0.0f, 0.0f, 0.0f, 9, 3, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[17].setRotationPoint(0.0f, -16.0f, 23.0f);
        this.bodyModel[17].rotateAngleY = -0.7330383f;
        this.bodyModel[18].addShapeBox(0.0f, 0.0f, 0.0f, 28, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[18].setRotationPoint(-14.0f, -15.0f, 0.0f);
        this.bodyModel[18].rotateAngleY = -1.0297443f;
        this.bodyModel[19].addShapeBox(0.0f, 0.0f, 0.0f, 28, 1, 1, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[19].setRotationPoint(-13.0f, -15.0f, -1.0f);
        this.bodyModel[19].rotateAngleY = 1.0297443f;
    }
    
    private void initleftBackWheelModel_1() {
        this.leftBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 169, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 201, 25, this.textureX, this.textureY);
        this.leftBackWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 1, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 33, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 65, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 97, 33, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[0].setRotationPoint(24.0f, 5.5f, 17.5f);
        this.leftBackWheelModel[1].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[1].setRotationPoint(24.0f, 5.5f, 17.5f);
        this.leftBackWheelModel[2].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[2].setRotationPoint(24.0f, 5.5f, 17.5f);
        this.leftBackWheelModel[3].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[3].setRotationPoint(-24.0f, 5.5f, 17.5f);
        this.leftBackWheelModel[4].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[4].setRotationPoint(-24.0f, 5.5f, 17.5f);
        this.leftBackWheelModel[5].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.leftBackWheelModel[5].setRotationPoint(-24.0f, 5.5f, 17.5f);
    }
    
    private void initrightBackWheelModel_1() {
        this.rightBackWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 177, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 209, 1, this.textureX, this.textureY);
        this.rightBackWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 169, 9, this.textureX, this.textureY);
        this.rightBackWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 201, 9, this.textureX, this.textureY);
        this.rightBackWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 177, 17, this.textureX, this.textureY);
        this.rightBackWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 209, 17, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[0].setRotationPoint(-24.0f, 5.5f, -21.5f);
        this.rightBackWheelModel[1].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[1].setRotationPoint(-24.0f, 5.5f, -21.5f);
        this.rightBackWheelModel[2].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[2].setRotationPoint(-24.0f, 5.5f, -21.5f);
        this.rightBackWheelModel[3].addShapeBox(-4.5f, 1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[3].setRotationPoint(24.0f, 5.5f, -21.5f);
        this.rightBackWheelModel[4].addShapeBox(-4.5f, -1.5f, 0.0f, 9, 3, 4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[4].setRotationPoint(24.0f, 5.5f, -21.5f);
        this.rightBackWheelModel[5].addShapeBox(-4.5f, -4.5f, 0.0f, 9, 3, 4, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, -3.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.rightBackWheelModel[5].setRotationPoint(24.0f, 5.5f, -21.5f);
    }
}
