//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.mw;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelTU22M extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelTU22M() {
        this.textureX = 1024;
        this.textureY = 1024;
        this.noseModel = new ModelRendererTurbo[1];
        (this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 960, this.textureX, this.textureY)).addTrapezoid(0.0f, 0.0f, 0.0f, 80, 32, 32, 0.0f, -16.0f, 3);
        this.noseModel[0].setRotationPoint(-339.0f, -54.0f, -16.0f);
        (this.bodyModel = new ModelRendererTurbo[16])[0] = new ModelRendererTurbo((ModelBase)this, 231, 960, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 323, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 283, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 262, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 240, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 104, 262, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 64, 240, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 874, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 220, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 220, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 745, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 181, 0, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 181, 0, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 55, 60, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 55, 60, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 70, 105, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 16, 32, 32, 0.0f);
        this.bodyModel[0].setRotationPoint(-259.0f, -54.0f, -16.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 48, 16, 32, 0.0f);
        this.bodyModel[1].setRotationPoint(-243.0f, -38.0f, -16.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 29, 1, 32, 0.0f);
        this.bodyModel[2].setRotationPoint(-224.0f, -70.0f, -16.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 48, 16, 1, 0.0f);
        this.bodyModel[3].setRotationPoint(-243.0f, -54.0f, -16.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 29, 15, 1, 0.0f);
        this.bodyModel[4].setRotationPoint(-224.0f, -69.0f, -16.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 48, 16, 1, 0.0f);
        this.bodyModel[5].setRotationPoint(-243.0f, -54.0f, 15.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 29, 15, 1, 0.0f);
        this.bodyModel[6].setRotationPoint(-224.0f, -69.0f, 15.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 160, 48, 32, 0.0f);
        this.bodyModel[7].setRotationPoint(-195.0f, -70.0f, -16.0f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 23, 2, 12, 0.0f);
        this.bodyModel[8].setRotationPoint(-227.0f, -38.0f, -14.0f);
        this.bodyModel[8].rotateAngleZ = 1.22173f;
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 23, 2, 12, 0.0f);
        this.bodyModel[9].setRotationPoint(-227.0f, -38.0f, 2.0f);
        this.bodyModel[9].rotateAngleZ = 1.22173f;
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 184, 48, 72, 0.0f);
        this.bodyModel[10].setRotationPoint(-35.0f, -70.0f, -36.0f);
        this.bodyModel[11].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(56.0, 8.0, 56, 8), new Coord2D(112.0, 38.0, 112, 38), new Coord2D(56.0, 48.0, 56, 48), new Coord2D(0.0, 48.0, 0, 48) }), 20.0f, 112, 48, 281, 20, 0, new float[] { 48.0f, 56.0f, 57.0f, 64.0f, 57.0f });
        this.bodyModel[11].setRotationPoint(-35.0f, -22.0f, -16.0f);
        this.bodyModel[12].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(56.0, 8.0, 56, 8), new Coord2D(112.0, 38.0, 112, 38), new Coord2D(56.0, 48.0, 56, 48), new Coord2D(0.0, 48.0, 0, 48) }), 20.0f, 112, 48, 281, 20, 0, new float[] { 48.0f, 56.0f, 57.0f, 64.0f, 57.0f });
        this.bodyModel[12].setRotationPoint(-35.0f, -22.0f, 36.0f);
        this.bodyModel[13].addShapeBox(0.0f, 0.0f, 0.0f, 21, 16, 2, 0.0f, 0.0f, -15.9999f, 8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -15.999f, -8.0f, -1.0f, 0.0f, 8.0f, 0.0f, -15.0f, 0.0f, 0.0f, -15.0f, 0.0f, -1.0f, 0.0f, -8.0f);
        this.bodyModel[13].setRotationPoint(-245.0f, -70.0f, 8.0f);
        this.bodyModel[14].addShapeBox(0.0f, 0.0f, 0.0f, 21, 16, 2, 0.0f, 0.0f, -15.999f, -8.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -15.9999f, 8.0f, -1.0f, 0.0f, -8.0f, 0.0f, -15.0f, 0.0f, 0.0f, -15.0f, 0.0f, -1.0f, 0.0f, 8.0f);
        this.bodyModel[14].setRotationPoint(-245.0f, -70.0f, -10.0f);
        this.bodyModel[15].addShapeBox(0.0f, 0.0f, 0.0f, 2, 1, 32, 0.0f, 0.0f, -1.5238096f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5238096f, 0.0f, 0.0f, 1.5238096f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.5238096f, 0.0f);
        this.bodyModel[15].setRotationPoint(-226.0f, -70.0f, -16.0f);
        (this.tailModel = new ModelRendererTurbo[10])[0] = new ModelRendererTurbo((ModelBase)this, 0, 617, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 503, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 165, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 165, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 488, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 414, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo((ModelBase)this, 181, 76, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo((ModelBase)this, 181, 115, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo((ModelBase)this, 181, 188, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo((ModelBase)this, 181, 211, this.textureX, this.textureY);
        this.tailModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 80, 48, 72, 0.0f, -3.0f, 2);
        this.tailModel[0].setRotationPoint(149.0f, -70.0f, -36.0f);
        this.tailModel[1].addTrapezoid(0.0f, 0.0f, 0.0f, 64, 42, 66, 0.0f, -4.0f, 2);
        this.tailModel[1].setRotationPoint(229.0f, -67.0f, -33.0f);
        this.tailModel[2].addBox(0.0f, 0.0f, 0.0f, 8, 26, 26, 0.0f);
        this.tailModel[2].setRotationPoint(293.0f, -59.0f, -28.0f);
        this.tailModel[3].addBox(0.0f, 0.0f, 0.0f, 8, 26, 26, 0.0f);
        this.tailModel[3].setRotationPoint(293.0f, -59.0f, 2.0f);
        this.tailModel[4].addBox(0.0f, 0.0f, 0.0f, 144, 7, 4, 0.0f);
        this.tailModel[4].setRotationPoint(149.0f, -70.0f, -2.0f);
        this.tailModel[5].addBox(0.0f, 0.0f, 0.0f, 80, 2, 70, 0.0f);
        this.tailModel[5].setRotationPoint(198.0f, -35.0f, -35.0f);
        this.tailModel[6].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(275.0, 0.0, 275, 0), new Coord2D(275.0, 28.0, 275, 28), new Coord2D(176.0, 28.0, 176, 28), new Coord2D(0.0, 0.0, 0, 0) }), 4.0f, 275, 28, 580, 4, 0, new float[] { 275.0f, 28.0f, 99.0f, 178.0f });
        this.tailModel[6].setRotationPoint(13.0f, -70.0f, -2.0f);
        this.tailModel[6].rotateAngleY = 3.1415927f;
        this.tailModel[7].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(99.0, 0.0, 99, 0), new Coord2D(99.0, 64.0, 99, 64) }), 4.0f, 99, 64, 281, 4, 0, new float[] { 99.0f, 64.0f, 118.0f });
        this.tailModel[7].setRotationPoint(189.0f, -98.0f, -2.0f);
        this.tailModel[7].rotateAngleY = 3.1415927f;
        this.tailModel[8].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(5.0, 0.0, 5, 0), new Coord2D(7.0, 16.0, 7, 16), new Coord2D(0.0, 16.0, 0, 16) }), 4.0f, 7, 16, 44, 4, 0, new float[] { 5.0f, 16.0f, 7.0f, 16.0f });
        this.tailModel[8].setRotationPoint(288.0f, -70.0f, -2.0f);
        this.tailModel[8].rotateAngleY = 3.1415927f;
        this.tailModel[9].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(23.0, 0.0, 23, 0), new Coord2D(25.0, 8.0, 25, 8), new Coord2D(30.0, 10.0, 30, 10), new Coord2D(0.0, 12.0, 0, 12) }), 4.0f, 30, 12, 79, 4, 0, new float[] { 23.0f, 8.0f, 5.0f, 30.0f, 12.0f });
        this.tailModel[9].setRotationPoint(288.0f, -150.0f, -2.0f);
        this.tailModel[9].rotateAngleY = 3.1415927f;
        (this.rightWingModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 641, 952, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 539, 674, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 314, 511, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 588, 356, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo((ModelBase)this, 215, 503, this.textureX, this.textureY);
        this.rightWingModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(160.0, 0.0, 160, 0), new Coord2D(64.0, 66.0, 64, 66), new Coord2D(32.0, 48.0, 32, 48), new Coord2D(4.0, 40.0, 4, 40), new Coord2D(0.0, 0.0, 0, 0) }), 6.0f, 160, 66, 383, 6, 0, new float[] { 160.0f, 116.0f, 37.0f, 29.0f, 40.0f });
        this.rightWingModel[0].rotateAngleX = 1.5707964f;
        this.rightWingModel[0].setRotationPoint(125.0f, -36.0f, -36.0f);
        this.rightWingModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(28.0, 8.0, 28, 8), new Coord2D(60.0, 26.0, 60, 26), new Coord2D(8.0, 176.0, 8, 176), new Coord2D(0.0, 186.0, 0, 186) }), 4.0f, 60, 186, 423, 4, 0, new float[] { 29.0f, 37.0f, 159.0f, 13.0f, 186.0f });
        this.rightWingModel[1].rotateAngleX = 1.5707964f;
        this.rightWingModel[1].setRotationPoint(121.0f, -35.0f, -76.0f);
        this.rightWingModel[2].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(8.0, 0.0, 8, 0), new Coord2D(8.0, 40.0, 8, 40), new Coord2D(0.0, 40.0, 0, 40) }), 4.0f, 8, 40, 88, 4, 0, new float[] { 40.0f, 8.0f, 40.0f });
        this.rightWingModel[2].rotateAngleX = 1.5707964f;
        this.rightWingModel[2].setRotationPoint(129.0f, -35.0f, -76.0f);
        this.rightWingModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(9.0, 0.0, 9, 0), new Coord2D(24.0, 0.0, 24, 0), new Coord2D(24.0, 82.0, 24, 82), new Coord2D(0.0, 86.0, 0, 86) }), 4.0f, 24, 86, 207, 4, 0, new float[] { 15.0f, 82.0f, 24.0f, 86.0f });
        this.rightWingModel[3].rotateAngleX = 1.5707964f;
        this.rightWingModel[3].setRotationPoint(145.0f, -35.0f, -180.0f);
        this.rightWingModel[4].addTrapezoid(0.0f, 0.0f, 0.0f, 38, 10, 2, 0.0f, -0.0f, 3);
        this.rightWingModel[4].setRotationPoint(39.0f, -38.0f, -91.0f);
        (this.leftWingModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 641, 877, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 539, 477, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 314, 462, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 588, 263, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo((ModelBase)this, 215, 503, this.textureX, this.textureY);
        this.leftWingModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(160.0, 0.0, 160, 0), new Coord2D(64.0, 66.0, 64, 66), new Coord2D(32.0, 48.0, 32, 48), new Coord2D(4.0, 40.0, 4, 40), new Coord2D(0.0, 0.0, 0, 0) }), 6.0f, 160, 66, 383, 6, 0, new float[] { 160.0f, 116.0f, 37.0f, 29.0f, 40.0f });
        this.leftWingModel[0].rotateAngleX = 4.712389f;
        this.leftWingModel[0].setRotationPoint(125.0f, -30.0f, 36.0f);
        this.leftWingModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(28.0, 8.0, 28, 8), new Coord2D(60.0, 26.0, 60, 26), new Coord2D(8.0, 176.0, 8, 176), new Coord2D(0.0, 186.0, 0, 186) }), 4.0f, 60, 186, 423, 4, 0, new float[] { 29.0f, 37.0f, 159.0f, 13.0f, 186.0f });
        this.leftWingModel[1].rotateAngleX = 4.712389f;
        this.leftWingModel[1].setRotationPoint(121.0f, -31.0f, 76.0f);
        this.leftWingModel[2].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(8.0, 0.0, 8, 0), new Coord2D(8.0, 40.0, 8, 40), new Coord2D(0.0, 40.0, 0, 40) }), 4.0f, 8, 40, 88, 4, 0, new float[] { 40.0f, 8.0f, 40.0f });
        this.leftWingModel[2].rotateAngleX = 4.712389f;
        this.leftWingModel[2].setRotationPoint(129.0f, -31.0f, 76.0f);
        this.leftWingModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(9.0, 0.0, 9, 0), new Coord2D(24.0, 0.0, 24, 0), new Coord2D(24.0, 82.0, 24, 82), new Coord2D(0.0, 86.0, 0, 86) }), 4.0f, 24, 86, 207, 4, 0, new float[] { 15.0f, 82.0f, 24.0f, 86.0f });
        this.leftWingModel[3].rotateAngleX = 4.712389f;
        this.leftWingModel[3].setRotationPoint(145.0f, -31.0f, 180.0f);
        this.leftWingModel[4].addTrapezoid(0.0f, 0.0f, 0.0f, 38, 10, 2, 0.0f, -0.0f, 3);
        this.leftWingModel[4].setRotationPoint(39.0f, -38.0f, 91.0f);
        this.propellerModels = new ModelRendererTurbo[0][0];
        (this.yawFlapModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 212, 231, this.textureX, this.textureY);
        this.yawFlapModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(7.0, 0.0, 7, 0), new Coord2D(8.0, 8.0, 8, 8), new Coord2D(23.0, 64.0, 23, 64), new Coord2D(0.0, 64.0, 0, 64) }), 4.0f, 23, 64, 160, 4, 0, new float[] { 7.0f, 8.0f, 58.0f, 23.0f, 64.0f });
        this.yawFlapModel[0].setRotationPoint(288.0f, -86.0f, -2.0f);
        this.yawFlapModel[0].rotateAngleX = 3.1415927f;
        this.yawFlapModel[0].rotateAngleZ = 3.1415927f;
        (this.pitchFlapLeftModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 244, 314, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShape3D(68.0f, -2.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(96.0, 0.0, 96, 0), new Coord2D(136.0, 56.0, 136, 56), new Coord2D(120.0, 61.0, 120, 61), new Coord2D(96.0, 61.0, 96, 61) }), 2.0f, 136, 61, 319, 2, 0, new float[] { 96.0f, 69.0f, 17.0f, 24.0f, 114.0f });
        this.pitchFlapLeftModel[0].rotateAngleY = 3.1415927f;
        this.pitchFlapLeftModel[0].rotateAngleX = 1.5707964f;
        this.pitchFlapLeftModel[0].setRotationPoint(266.0f, -35.0f, 37.0f);
        (this.pitchFlapRightModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 244, 383, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addShape3D(68.0f, -2.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(96.0, 0.0, 96, 0), new Coord2D(136.0, 56.0, 136, 56), new Coord2D(120.0, 61.0, 120, 61), new Coord2D(96.0, 61.0, 96, 61) }), 2.0f, 136, 61, 319, 2, 0, new float[] { 96.0f, 69.0f, 17.0f, 24.0f, 114.0f });
        this.pitchFlapRightModel[0].rotateAngleY = 3.1415927f;
        this.pitchFlapRightModel[0].rotateAngleX = 4.712389f;
        this.pitchFlapRightModel[0].setRotationPoint(266.0f, -33.0f, -37.0f);
        this.topWingModel = new ModelRendererTurbo[0];
        (this.pitchFlapRightWingModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 588, 122, this.textureX, this.textureY);
        this.pitchFlapRightWingModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(8.0, 0.0, 8, 0), new Coord2D(15.0, 64.0, 15, 64), new Coord2D(0.0, 64.0, 0, 64) }), 4.0f, 15, 64, 151, 4, 0, new float[] { 8.0f, 64.0f, 15.0f, 64.0f });
        this.pitchFlapRightWingModel[0].rotateAngleY = 3.1415927f;
        this.pitchFlapRightWingModel[0].rotateAngleX = 4.712389f;
        this.pitchFlapRightWingModel[0].setRotationPoint(121.0f, -31.0f, -116.0f);
        (this.pitchFlapLeftWingModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 588, 192, this.textureX, this.textureY);
        this.pitchFlapLeftWingModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(8.0, 0.0, 8, 0), new Coord2D(15.0, 64.0, 15, 64), new Coord2D(0.0, 64.0, 0, 64) }), 4.0f, 15, 64, 151, 4, 0, new float[] { 8.0f, 64.0f, 15.0f, 64.0f });
        this.pitchFlapLeftWingModel[0].rotateAngleY = 3.1415927f;
        this.pitchFlapLeftWingModel[0].rotateAngleX = 1.5707964f;
        this.pitchFlapLeftWingModel[0].setRotationPoint(121.0f, -35.0f, 116.0f);
        (this.bodyWheelModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo((ModelBase)this, 0, 130, this.textureX, this.textureY);
        this.bodyWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 20, 130, this.textureX, this.textureY);
        this.bodyWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 34, 130, this.textureX, this.textureY);
        this.bodyWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 34, 130, this.textureX, this.textureY);
        this.bodyWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 50, this.textureX, this.textureY);
        this.bodyWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 35, this.textureX, this.textureY);
        this.bodyWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 4, 27, 4, 0.0f);
        this.bodyWheelModel[0].setRotationPoint(-178.0f, -22.0f, -2.0f);
        this.bodyWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 15, 2, 0.0f);
        this.bodyWheelModel[1].setRotationPoint(-166.0f, -23.0f, -1.0f);
        this.bodyWheelModel[1].rotateAngleZ = -0.6632251f;
        this.bodyWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 12, 12, 4, 0.0f);
        this.bodyWheelModel[2].setRotationPoint(-182.0f, -2.0f, 2.0f);
        this.bodyWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 12, 12, 4, 0.0f);
        this.bodyWheelModel[3].setRotationPoint(-182.0f, -2.0f, -6.0f);
        this.bodyWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 14, 12, 0.0f);
        this.bodyWheelModel[4].setRotationPoint(-180.0f, -22.0f, -6.0f);
        this.bodyWheelModel[5].addBox(0.0f, 0.0f, 0.0f, 22, 9, 1, 0.0f);
        this.bodyWheelModel[5].setRotationPoint(-166.0f, -22.0f, 7.0f);
        this.bodyWheelModel[6].addBox(0.0f, 0.0f, 0.0f, 22, 9, 1, 0.0f);
        this.bodyWheelModel[6].setRotationPoint(-166.0f, -22.0f, -8.0f);
        (this.leftWingWheelModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 0, 85, this.textureX, this.textureY);
        this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 40, 85, this.textureX, this.textureY);
        this.leftWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 40, 85, this.textureX, this.textureY);
        this.leftWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 20, 85, this.textureX, this.textureY);
        this.leftWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 55, 30, this.textureX, this.textureY);
        this.leftWingWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 4, 36, 4, 0.0f);
        this.leftWingWheelModel[0].setRotationPoint(83.0f, -31.0f, 75.0f);
        this.leftWingWheelModel[0].rotateAngleZ = -0.2443461f;
        this.leftWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 36, 12, 4, 0.0f);
        this.leftWingWheelModel[1].setRotationPoint(61.0f, -2.0f, 71.0f);
        this.leftWingWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 36, 12, 4, 0.0f);
        this.leftWingWheelModel[2].setRotationPoint(61.0f, -2.0f, 79.0f);
        this.leftWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 4, 23, 4, 0.0f);
        this.leftWingWheelModel[3].setRotationPoint(93.0f, -33.0f, 75.0f);
        this.leftWingWheelModel[3].rotateAngleZ = -0.6283185f;
        this.leftWingWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 24, 23, 1, 0.0f);
        this.leftWingWheelModel[4].setRotationPoint(73.0f, -31.0f, 81.0f);
        (this.rightWingWheelModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 0, 85, this.textureX, this.textureY);
        this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 40, 85, this.textureX, this.textureY);
        this.rightWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 40, 85, this.textureX, this.textureY);
        this.rightWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 20, 85, this.textureX, this.textureY);
        this.rightWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 55, 0, this.textureX, this.textureY);
        this.rightWingWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 4, 36, 4, 0.0f);
        this.rightWingWheelModel[0].setRotationPoint(83.0f, -31.0f, -79.0f);
        this.rightWingWheelModel[0].rotateAngleZ = -0.2443461f;
        this.rightWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 36, 12, 4, 0.0f);
        this.rightWingWheelModel[1].setRotationPoint(61.0f, -2.0f, -83.0f);
        this.rightWingWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 36, 12, 4, 0.0f);
        this.rightWingWheelModel[2].setRotationPoint(61.0f, -2.0f, -75.0f);
        this.rightWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 4, 23, 4, 0.0f);
        this.rightWingWheelModel[3].setRotationPoint(93.0f, -33.0f, -79.0f);
        this.rightWingWheelModel[3].rotateAngleZ = -0.6283185f;
        this.rightWingWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 24, 23, 1, 0.0f);
        this.rightWingWheelModel[4].setRotationPoint(73.0f, -31.0f, -82.0f);
        this.propellerModels = new ModelRendererTurbo[2][3];
        this.propellerModels[0][0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.propellerModels[0][1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.propellerModels[0][2] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.propellerModels[0][0].addBox(-0.0f, -0.0f, -0.0f, 1, 1, 1, 0.0f);
        this.propellerModels[0][1].addBox(-0.0f, -0.0f, -0.0f, 1, 1, 1, 0.0f);
        this.propellerModels[0][2].addBox(-0.0f, -0.0f, -0.0f, 1, 1, 1, 0.0f);
        this.propellerModels[0][0].setRotationPoint(205.0f, -46.0f, -31.0f);
        this.propellerModels[0][1].setRotationPoint(205.0f, -46.0f, -31.0f);
        this.propellerModels[0][2].setRotationPoint(205.0f, -46.0f, -31.0f);
        this.propellerModels[1][0] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.propellerModels[1][1] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.propellerModels[1][2] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.propellerModels[1][0].addBox(-0.0f, -0.0f, -0.0f, 1, 1, 1, 0.0f);
        this.propellerModels[1][1].addBox(-0.0f, -0.0f, -0.0f, 1, 1, 1, 0.0f);
        this.propellerModels[1][2].addBox(-0.0f, -0.0f, -0.0f, 1, 1, 1, 0.0f);
        this.propellerModels[1][0].setRotationPoint(205.0f, -46.0f, 31.0f);
        this.propellerModels[1][1].setRotationPoint(205.0f, -46.0f, 31.0f);
        this.propellerModels[1][2].setRotationPoint(205.0f, -46.0f, 31.0f);
        this.translateAll(0, -2, 0);
        this.flipAll();
    }
}
