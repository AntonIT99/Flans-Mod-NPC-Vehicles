//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.cvts;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelLancasterKai extends ModelFlanPlane
{
    private int textureX;
    private int textureY;
    
    public ModelLancasterKai() {
        this.textureX = 512;
        this.textureY = 512;
        this.bodyModel = new ModelRendererTurbo[25];
        (this.bodyModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY)).addTrapezoid(-160.0f, -80.0f, -16.0f, 16, 32, 32, 0.0f, -4.0f, 3);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[18].flip = true;
        this.bodyModel[18].addTrapezoid(-160.0f, -80.0f, -16.0f, 16, 32, 32, 0.0f, -4.0f, 3);
        (this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 64, 0, this.textureX, this.textureY)).addBox(-144.0f, -80.0f, -15.0f, 16, 1, 30, 0.0f);
        (this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 127, 1, this.textureX, this.textureY)).addBox(-144.0f, -49.0f, -15.0f, 112, 1, 30, 0.0f);
        (this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 64, 32, this.textureX, this.textureY)).addTrapezoid(-128.0f, -96.0f, -16.0f, 64, 16, 32, 0.0f, -8.0f, 4);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 64, 32, this.textureX, this.textureY);
        this.bodyModel[16].flip = true;
        this.bodyModel[16].addTrapezoid(-128.0f, -96.0f, -16.0f, 64, 16, 32, 0.0f, -8.0f, 4);
        (this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 80, this.textureX, this.textureY)).addBox(-144.0f, -80.0f, -16.0f, 112, 32, 1, 0.0f);
        (this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 80, this.textureX, this.textureY)).addBox(-144.0f, -80.0f, -16.0f, 112, 32, 1, 0.0f);
        this.bodyModel[5].setRotationPoint(-176.0f, 0.0f, 0.0f);
        this.bodyModel[5].rotateAngleY = 3.1415927f;
        (this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 0, 445, this.textureX, this.textureY)).addBox(-8.0f, 16.0f, -8.0f, 16, 2, 16, 0.0f);
        this.bodyModel[19].setRotationPoint(-116.0f, -88.0f, 0.0f);
        this.bodyModel[19].rotateAngleY = 3.1415927f;
        (this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 0, 463, this.textureX, this.textureY)).addBox(-8.0f, 0.0f, -8.0f, 2, 16, 16, 0.0f);
        this.bodyModel[20].setRotationPoint(-116.0f, -88.0f, 0.0f);
        this.bodyModel[20].rotateAngleY = 3.1415927f;
        (this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 0, 445, this.textureX, this.textureY)).addBox(-8.0f, 16.0f, -8.0f, 16, 2, 16, 0.0f);
        this.bodyModel[21].setRotationPoint(-90.0f, -76.0f, 0.0f);
        this.bodyModel[21].rotateAngleY = 3.1415927f;
        (this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 0, 463, this.textureX, this.textureY)).addBox(-8.0f, 0.0f, -8.0f, 2, 16, 16, 0.0f);
        this.bodyModel[22].setRotationPoint(-90.0f, -76.0f, 0.0f);
        this.bodyModel[22].rotateAngleY = 3.1415927f;
        (this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 0, 445, this.textureX, this.textureY)).addBox(-8.0f, 16.0f, -8.0f, 16, 2, 16, 0.0f);
        this.bodyModel[23].setRotationPoint(-68.0f, -76.0f, 0.0f);
        this.bodyModel[23].rotateAngleY = 3.1415927f;
        (this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 0, 463, this.textureX, this.textureY)).addBox(-8.0f, 0.0f, -8.0f, 2, 16, 16, 0.0f);
        this.bodyModel[24].setRotationPoint(-68.0f, -76.0f, 0.0f);
        this.bodyModel[24].rotateAngleY = 3.1415927f;
        (this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 226, 80, this.textureX, this.textureY)).addBox(-71.0f, -96.0f, -15.0f, 103, 1, 30, 0.0f);
        (this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 432, 24, this.textureX, this.textureY)).addBox(-72.0f, -96.0f, -16.0f, 1, 16, 32, 0.0f);
        (this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 245, this.textureX, this.textureY)).addBox(0.0f, 0.0f, -16.0f, 199, 16, 1, 0.0f);
        this.bodyModel[8].setRotationPoint(-71.0f, -96.0f, 0.0f);
        (this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 245, this.textureX, this.textureY)).addBox(0.0f, 0.0f, -16.0f, 199, 16, 1, 0.0f);
        this.bodyModel[9].setRotationPoint(-71.0f, -96.0f, 0.0f);
        this.bodyModel[9].doMirror(false, false, true);
        (this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 38, 262, this.textureX, this.textureY)).addBox(0.0f, 0.0f, -16.0f, 160, 16, 1, 0.0f);
        this.bodyModel[10].setRotationPoint(-32.0f, -80.0f, 0.0f);
        (this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 38, 262, this.textureX, this.textureY)).addBox(0.0f, 0.0f, -16.0f, 160, 16, 1, 0.0f);
        this.bodyModel[11].setRotationPoint(-32.0f, -80.0f, 0.0f);
        this.bodyModel[11].doMirror(false, false, true);
        (this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 144, 279, this.textureX, this.textureY)).addTrapezoid(32.0f, -112.0f, -16.0f, 32, 16, 32, 0.0f, -8.0f, 4);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 144, 279, this.textureX, this.textureY);
        this.bodyModel[17].flip = true;
        this.bodyModel[17].addTrapezoid(32.0f, -112.0f, -16.0f, 32, 16, 32, 0.0f, -8.0f, 4);
        final ModelRendererTurbo[][] dorsalModel = { new ModelRendererTurbo[4], null, null };
        (dorsalModel[0][0] = new ModelRendererTurbo((ModelBase)this, 0, 445, this.textureX, this.textureY)).addBox(-8.0f, 16.0f, -8.0f, 16, 2, 16, 0.0f);
        (dorsalModel[0][1] = new ModelRendererTurbo((ModelBase)this, 0, 463, this.textureX, this.textureY)).addBox(-8.0f, 0.0f, -8.0f, 2, 16, 16, 0.0f);
        (dorsalModel[0][2] = new ModelRendererTurbo((ModelBase)this, 40, 381, this.textureX, this.textureY)).addBox(8.0f, -6.0f, -7.0f, 2, 24, 2, 0.0f);
        (dorsalModel[0][3] = new ModelRendererTurbo((ModelBase)this, 40, 381, this.textureX, this.textureY)).addBox(8.0f, -6.0f, 5.0f, 2, 24, 2, 0.0f);
        dorsalModel[1] = new ModelRendererTurbo[3];
        (dorsalModel[1][0] = new ModelRendererTurbo((ModelBase)this, 40, 411, this.textureX, this.textureY)).addBox(8.0f, -1.0f, 3.0f, 24, 2, 2, 0.0f);
        (dorsalModel[1][1] = new ModelRendererTurbo((ModelBase)this, 40, 411, this.textureX, this.textureY)).addBox(8.0f, -1.0f, -5.0f, 24, 2, 2, 0.0f);
        (dorsalModel[1][2] = new ModelRendererTurbo((ModelBase)this, 40, 415, this.textureX, this.textureY)).addBox(8.0f, -1.0f, -3.0f, 2, 2, 6, 0.0f);
        dorsalModel[2] = new ModelRendererTurbo[0];
        for (final ModelRendererTurbo[] arr$2 : dorsalModel) {
            final ModelRendererTurbo[] dorsalGunParts = arr$2;
            for (final ModelRendererTurbo dorsalGunPart : arr$2) {
                dorsalGunPart.setRotationPoint(48.0f, -104.0f, 0.0f);
            }
        }
        this.registerGunModel("Dorsal", dorsalModel);
        final ModelRendererTurbo[][] noseGunModel = { new ModelRendererTurbo[4], null, null };
        (noseGunModel[0][0] = new ModelRendererTurbo((ModelBase)this, 0, 445, this.textureX, this.textureY)).addBox(-8.0f, 16.0f, -8.0f, 16, 2, 16, 0.0f);
        (noseGunModel[0][1] = new ModelRendererTurbo((ModelBase)this, 0, 463, this.textureX, this.textureY)).addBox(-8.0f, 0.0f, -8.0f, 2, 16, 16, 0.0f);
        (noseGunModel[0][2] = new ModelRendererTurbo((ModelBase)this, 40, 381, this.textureX, this.textureY)).addBox(8.0f, -6.0f, -7.0f, 2, 24, 2, 0.0f);
        (noseGunModel[0][3] = new ModelRendererTurbo((ModelBase)this, 40, 381, this.textureX, this.textureY)).addBox(8.0f, -6.0f, 5.0f, 2, 24, 2, 0.0f);
        noseGunModel[1] = new ModelRendererTurbo[3];
        (noseGunModel[1][0] = new ModelRendererTurbo((ModelBase)this, 40, 411, this.textureX, this.textureY)).addBox(8.0f, -1.0f, 3.0f, 24, 2, 2, 0.0f);
        (noseGunModel[1][1] = new ModelRendererTurbo((ModelBase)this, 40, 411, this.textureX, this.textureY)).addBox(8.0f, -1.0f, -5.0f, 24, 2, 2, 0.0f);
        (noseGunModel[1][2] = new ModelRendererTurbo((ModelBase)this, 40, 415, this.textureX, this.textureY)).addBox(8.0f, -1.0f, -3.0f, 2, 2, 6, 0.0f);
        noseGunModel[2] = new ModelRendererTurbo[0];
        for (final ModelRendererTurbo[] arr$4 : noseGunModel) {
            final ModelRendererTurbo[] noseGunParts = arr$4;
            for (final ModelRendererTurbo noseGunPart : arr$4) {
                noseGunPart.setRotationPoint(-148.0f, -70.0f, 0.0f);
            }
        }
        this.registerGunModel("Nose", noseGunModel);
        final ModelRendererTurbo[][] tailGunModel = { new ModelRendererTurbo[4], null, null };
        (tailGunModel[0][0] = new ModelRendererTurbo((ModelBase)this, 0, 445, this.textureX, this.textureY)).addBox(-8.0f, 16.0f, -8.0f, 16, 2, 16, 0.0f);
        (tailGunModel[0][1] = new ModelRendererTurbo((ModelBase)this, 0, 463, this.textureX, this.textureY)).addBox(-8.0f, 0.0f, -8.0f, 2, 16, 16, 0.0f);
        (tailGunModel[0][2] = new ModelRendererTurbo((ModelBase)this, 40, 381, this.textureX, this.textureY)).addBox(8.0f, -6.0f, -7.0f, 2, 24, 2, 0.0f);
        (tailGunModel[0][3] = new ModelRendererTurbo((ModelBase)this, 40, 381, this.textureX, this.textureY)).addBox(8.0f, -6.0f, 5.0f, 2, 24, 2, 0.0f);
        tailGunModel[1] = new ModelRendererTurbo[3];
        (tailGunModel[1][0] = new ModelRendererTurbo((ModelBase)this, 40, 411, this.textureX, this.textureY)).addBox(8.0f, -1.0f, 3.0f, 24, 2, 2, 0.0f);
        (tailGunModel[1][1] = new ModelRendererTurbo((ModelBase)this, 40, 411, this.textureX, this.textureY)).addBox(8.0f, -1.0f, -5.0f, 24, 2, 2, 0.0f);
        (tailGunModel[1][2] = new ModelRendererTurbo((ModelBase)this, 40, 415, this.textureX, this.textureY)).addBox(8.0f, -1.0f, -3.0f, 2, 2, 6, 0.0f);
        tailGunModel[2] = new ModelRendererTurbo[0];
        for (final ModelRendererTurbo[] arr$6 : tailGunModel) {
            final ModelRendererTurbo[] tailGunParts = arr$6;
            for (final ModelRendererTurbo tailGunPart : arr$6) {
                tailGunPart.setRotationPoint(128.0f, -88.0f, 0.0f);
            }
        }
        this.registerGunModel("Tail", tailGunModel);
        (this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 52, 362, this.textureX, this.textureY)).addShape3D(128.0f, -65.0f, -15.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(160.0, 16.0, 160, 0), new Coord2D(160.0, 17.0, 160, 1), new Coord2D(0.0, 1.0, 0, 1) }), 30.0f, 160, 1, 322, 30, 0, new float[] { 1.0f, 160.0f, 1.0f, 160.0f });
        this.bodyModel[13].rotateAngleX = 3.1415927f;
        (this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 52, 345, this.textureX, this.textureY)).addShape3D(128.0f, -64.0f, -16.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(160.0, 0.0, 160, 0), new Coord2D(160.0, 16.0, 160, 16) }), 1.0f, 160, 16, 336, 1, 0, new float[] { 160.0f, 16.0f, 160.0f });
        this.bodyModel[14].rotateAngleX = 3.1415927f;
        (this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 52, 394, this.textureX, this.textureY)).addShape3D(128.0f, -64.0f, 15.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(160.0, 0.0, 160, 0), new Coord2D(160.0, 16.0, 160, 16) }), 1.0f, 160, 16, 336, 1, 0, new float[] { 160.0f, 16.0f, 160.0f });
        this.bodyModel[15].rotateAngleX = 3.1415927f;
        this.tailModel = new ModelRendererTurbo[7];
        (this.tailModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 279, this.textureX, this.textureY)).addBox(96.0f, 16.0f, -82.0f, 16, 64, 2, 0.0f);
        this.tailModel[0].rotateAngleX = -1.5707964f;
        (this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 279, this.textureX, this.textureY)).addBox(96.0f, 16.0f, -82.0f, 16, 64, 2, 0.0f);
        this.tailModel[1].doMirror(false, true, false);
        this.tailModel[1].rotateAngleX = -1.5707964f;
        (this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 72, 279, this.textureX, this.textureY)).addBox(96.0f, -128.0f, 80.0f, 16, 64, 2, 0.0f);
        (this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 72, 279, this.textureX, this.textureY)).addBox(96.0f, -128.0f, -82.0f, 16, 64, 2, 0.0f);
        (this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 240, 279, this.textureX, this.textureY)).addBox(64.0f, -96.0f, -15.0f, 64, 1, 30, 0.0f);
        (this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 304, 111, this.textureX, this.textureY)).addTrapezoid(128.0f, -96.0f, -16.0f, 16, 32, 32, 0.0f, -6.0f, 2);
        this.tailModel[6] = new ModelRendererTurbo((ModelBase)this, 304, 111, this.textureX, this.textureY);
        this.tailModel[6].flip = true;
        this.tailModel[6].addTrapezoid(128.0f, -96.0f, -16.0f, 16, 32, 32, 0.0f, -6.0f, 2);
        this.tailWheelModel = new ModelRendererTurbo[2];
        (this.tailWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 36, 463, this.textureX, this.textureY)).addBox(98.0f, -63.0f, -3.0f, 4, 16, 6);
        (this.tailWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 84, 447, this.textureX, this.textureY)).addBox(94.0f, -53.0f, -2.0f, 12, 12, 4);
        this.leftWingModel = new ModelRendererTurbo[6];
        (this.leftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 113, this.textureX, this.textureY)).addBox(-64.0f, 16.0f, -82.0f, 64, 96, 4, 0.0f);
        this.leftWingModel[0].rotateAngleX = -1.5707964f;
        (this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 136, 113, this.textureX, this.textureY)).addTrapezoid(-64.0f, 112.0f, -82.0f, 80, 128, 4, 0.0f, -2.0f, 5);
        this.leftWingModel[1].rotateAngleX = -1.5707964f;
        (this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 256, 32, this.textureX, this.textureY)).addTrapezoid(-112.0f, -80.0f, -64.0f, 64, 24, 24, 0.0f, -2.0f, 5);
        (this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 256, 32, this.textureX, this.textureY)).addTrapezoid(-96.0f, -80.0f, -128.0f, 64, 24, 24, 0.0f, -2.0f, 5);
        (this.leftWingModel[4] = new ModelRendererTurbo((ModelBase)this, 408, 24, this.textureX, this.textureY)).addBox(-115.0f, -76.0f, -60.0f, 6, 16, 16, 0.0f);
        (this.leftWingModel[5] = new ModelRendererTurbo((ModelBase)this, 408, 24, this.textureX, this.textureY)).addBox(-99.0f, -76.0f, -124.0f, 6, 16, 16, 0.0f);
        this.leftWingWheelModel = new ModelRendererTurbo[2];
        (this.leftWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 48, 415, this.textureX, this.textureY)).addBox(-82.0f, -56.0f, -58.0f, 4, 24, 12);
        (this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 80, 415, this.textureX, this.textureY)).addBox(-92.0f, -44.0f, -56.0f, 24, 24, 8);
        this.rightWingModel = new ModelRendererTurbo[6];
        (this.rightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 113, this.textureX, this.textureY)).addBox(-64.0f, 16.0f, -82.0f, 64, 96, 4, 0.0f);
        this.rightWingModel[0].doMirror(false, true, false);
        this.rightWingModel[0].rotateAngleX = -1.5707964f;
        (this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 136, 113, this.textureX, this.textureY)).addTrapezoid(-64.0f, 112.0f, -82.0f, 80, 128, 4, 0.0f, -2.0f, 5);
        this.rightWingModel[1].doMirror(false, true, false);
        this.rightWingModel[1].rotateAngleX = -1.5707964f;
        (this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 256, 32, this.textureX, this.textureY)).addTrapezoid(-112.0f, -80.0f, 40.0f, 64, 24, 24, 0.0f, -2.0f, 5);
        (this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 256, 32, this.textureX, this.textureY)).addTrapezoid(-96.0f, -80.0f, 104.0f, 64, 24, 24, 0.0f, -2.0f, 5);
        (this.rightWingModel[4] = new ModelRendererTurbo((ModelBase)this, 408, 24, this.textureX, this.textureY)).addBox(-115.0f, -76.0f, 44.0f, 6, 16, 16, 0.0f);
        (this.rightWingModel[5] = new ModelRendererTurbo((ModelBase)this, 408, 24, this.textureX, this.textureY)).addBox(-99.0f, -76.0f, 108.0f, 6, 16, 16, 0.0f);
        this.rightWingWheelModel = new ModelRendererTurbo[2];
        (this.rightWingWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 48, 415, this.textureX, this.textureY)).addBox(-82.0f, -56.0f, 46.0f, 4, 24, 12);
        (this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 80, 415, this.textureX, this.textureY)).addBox(-92.0f, -44.0f, 48.0f, 24, 24, 8);
        (this.propellerModels = new ModelRendererTurbo[4][3])[1] = this.makeProp(-114, -68, 52);
        this.propellerModels[0] = this.makeProp(-114, -68, -52);
        this.propellerModels[3] = this.makeProp(-98, -68, 116);
        this.propellerModels[2] = this.makeProp(-98, -68, -116);
        this.yawFlapModel = new ModelRendererTurbo[2];
        (this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 108, 279, this.textureX, this.textureY)).addBox(0.0f, -48.0f, -1.0f, 16, 64, 2, 0.0f);
        this.yawFlapModel[0].setPosition(112.0f, -80.0f, 81.0f);
        (this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 108, 279, this.textureX, this.textureY)).addBox(0.0f, -48.0f, -1.0f, 16, 64, 2, 0.0f);
        this.yawFlapModel[1].setPosition(112.0f, -80.0f, -81.0f);
        this.pitchFlapLeftWingModel = new ModelRendererTurbo[1];
        (this.pitchFlapLeftWingModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 345, this.textureX, this.textureY)).addBox(0.0f, -48.0f, -2.0f, 16, 96, 4, 0.0f);
        this.pitchFlapLeftWingModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapLeftWingModel[0].setPosition(0.0f, -80.0f, -64.0f);
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        (this.pitchFlapLeftModel[0] = new ModelRendererTurbo((ModelBase)this, 36, 279, this.textureX, this.textureY)).addBox(0.0f, -32.0f, -1.0f, 16, 64, 2, 0.0f);
        this.pitchFlapLeftModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapLeftModel[0].setPosition(112.0f, -81.0f, 48.0f);
        this.pitchFlapRightWingModel = new ModelRendererTurbo[1];
        (this.pitchFlapRightWingModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 345, this.textureX, this.textureY)).addBox(0.0f, -48.0f, -2.0f, 16, 96, 4, 0.0f);
        this.pitchFlapRightWingModel[0].doMirror(false, true, false);
        this.pitchFlapRightWingModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapRightWingModel[0].setPosition(0.0f, -80.0f, 64.0f);
        this.pitchFlapRightModel = new ModelRendererTurbo[1];
        (this.pitchFlapRightModel[0] = new ModelRendererTurbo((ModelBase)this, 36, 279, this.textureX, this.textureY)).addBox(0.0f, -32.0f, -1.0f, 16, 64, 2, 0.0f);
        this.pitchFlapRightModel[0].rotateAngleX = 1.570796f;
        this.pitchFlapRightModel[0].setPosition(112.0f, -81.0f, -48.0f);
        this.translateAll(0, 68, 0);
        this.flipAll();
    }
    
    private ModelRendererTurbo[] makeProp(final int i, final int j, final int k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 40, 345, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 40, 345, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 40, 345, this.textureX, this.textureY) };
        prop[0].addBox(-0.0f, -32.0f, -2.0f, 2, 32, 4, 0.0f);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].addBox(-0.0f, -32.0f, -2.0f, 2, 32, 4, 0.0f);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].addBox(-0.0f, -32.0f, -2.0f, 2, 32, 4, 0.0f);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}
