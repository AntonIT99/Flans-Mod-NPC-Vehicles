//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.ww2;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelWW2_Plane_ME262_1 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelWW2_Plane_ME262_1() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo((ModelBase)this, 100, 460, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 190, 460, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 400, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 80, 400, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 150, 400, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 230, 400, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 230, 430, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 300, 480, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 320, 480, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 320, 490, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 370, 480, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 370, 495, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 80, 430, this.textureX, this.textureY);
        this.bodyModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 15, 20, 26, 0.0f, -3.0f, 3);
        this.bodyModel[0].setRotationPoint(-27.0f, -30.0f, -13.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 12, 20, 26, 0.0f);
        this.bodyModel[1].setRotationPoint(-12.0f, -30.0f, -13.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 10, 20, 26, 0.0f);
        this.bodyModel[2].setRotationPoint(0.0f, -30.0f, -13.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 16, 1, 16, 0.0f);
        this.bodyModel[3].setRotationPoint(10.0f, -11.0f, -8.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 12, 20, 26, 0.0f);
        this.bodyModel[4].setRotationPoint(26.0f, -30.0f, -13.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 16, 20, 5, 0.0f);
        this.bodyModel[5].setRotationPoint(10.0f, -30.0f, -13.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 16, 20, 5, 0.0f);
        this.bodyModel[6].setRotationPoint(10.0f, -30.0f, 8.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 1, 12, 8, 0.0f);
        this.bodyModel[7].setRotationPoint(10.0f, -37.0f, -4.0f);
        this.bodyModel[7].rotateAngleZ = -0.9424778f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 16, 1, 8, 0.0f);
        this.bodyModel[8].setRotationPoint(10.0f, -37.0f, -4.0f);
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 14, 1, 8, 0.0f);
        this.bodyModel[9].setRotationPoint(26.0f, -37.0f, -4.0f);
        this.bodyModel[9].rotateAngleZ = -0.5235988f;
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 16, 10, 1, 0.0f);
        this.bodyModel[10].setRotationPoint(10.0f, -37.0f, -4.0f);
        this.bodyModel[10].rotateAngleX = -0.6806784f;
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 16, 1, 10, 0.0f);
        this.bodyModel[11].setRotationPoint(10.0f, -37.0f, 4.0f);
        this.bodyModel[11].rotateAngleX = -0.8901179f;
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 6, 7, 4, 0.0f);
        this.bodyModel[12].setRotationPoint(10.0f, -18.0f, -2.0f);
        this.noseModel = new ModelRendererTurbo[1];
        (this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 460, this.textureX, this.textureY)).addFlexBox(0.0f, 0.0f, 0.0f, 26, 14, 20, 0.0f, -6.0f, -6.0f, -8.0f, -8.0f, 3);
        this.noseModel[0].setRotationPoint(-53.0f, -27.0f, -10.0f);
        (this.leftWingModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 240, 360, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 290, 360, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 410, 360, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 460, 360, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo((ModelBase)this, 240, 180, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo((ModelBase)this, 340, 180, this.textureX, this.textureY);
        this.leftWingModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 8, 14, 14, 0.0f, -2.0f, 3);
        this.leftWingModel[0].setRotationPoint(-20.0f, -14.0f, 30.0f);
        this.leftWingModel[1].addBox(0.0f, 0.0f, 0.0f, 43, 14, 14, 0.0f);
        this.leftWingModel[1].setRotationPoint(-12.0f, -14.0f, 30.0f);
        this.leftWingModel[2].addTrapezoid(0.0f, 0.0f, 0.0f, 10, 14, 14, 0.0f, -3.0f, 2);
        this.leftWingModel[2].setRotationPoint(31.0f, -14.0f, 30.0f);
        this.leftWingModel[3].addTrapezoid(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f, -0.9999f, 2);
        this.leftWingModel[3].setRotationPoint(41.0f, -8.0f, 36.0f);
        this.leftWingModel[4].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(37.0, 0.0, 37, 0), new Coord2D(37.0, 32.0, 37, 32), new Coord2D(44.0, 86.0, 44, 86), new Coord2D(34.0, 90.0, 34, 90), new Coord2D(29.0, 88.0, 29, 88) }), 2.0f, 44, 90, 234, 2, 0, new float[] { 93.0f, 6.0f, 11.0f, 55.0f, 32.0f, 37.0f });
        this.leftWingModel[4].setRotationPoint(-6.0f, -13.0f, 12.0f);
        this.leftWingModel[4].rotateAngleX = 4.642576f;
        this.leftWingModel[4].rotateAngleZ = 3.1415927f;
        this.leftWingModel[5].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(5.0, 0.0, 5, 0), new Coord2D(0.0, 18.0, 0, 18) }), 2.0f, 5, 18, 42, 2, 0, new float[] { 18.0f, 19.0f, 5.0f });
        this.leftWingModel[5].setRotationPoint(31.0f, -13.0f, 12.0f);
        this.leftWingModel[5].rotateAngleX = 4.642576f;
        this.leftWingModel[5].rotateAngleZ = 3.1415927f;
        (this.rightWingModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 0, 360, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 50, 360, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 170, 360, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 220, 360, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo((ModelBase)this, 0, 180, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo((ModelBase)this, 100, 180, this.textureX, this.textureY);
        this.rightWingModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 8, 14, 14, 0.0f, -2.0f, 3);
        this.rightWingModel[0].setRotationPoint(-20.0f, -14.0f, -44.0f);
        this.rightWingModel[1].addBox(0.0f, 0.0f, 0.0f, 43, 14, 14, 0.0f);
        this.rightWingModel[1].setRotationPoint(-12.0f, -14.0f, -44.0f);
        this.rightWingModel[2].addTrapezoid(0.0f, 0.0f, 0.0f, 10, 14, 14, 0.0f, -3.0f, 2);
        this.rightWingModel[2].setRotationPoint(31.0f, -14.0f, -44.0f);
        this.rightWingModel[3].addTrapezoid(0.0f, 0.0f, 0.0f, 3, 2, 2, 0.0f, -0.9999f, 2);
        this.rightWingModel[3].setRotationPoint(41.0f, -8.0f, -38.0f);
        this.rightWingModel[4].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(37.0, 0.0, 37, 0), new Coord2D(37.0, 32.0, 37, 32), new Coord2D(44.0, 86.0, 44, 86), new Coord2D(34.0, 90.0, 34, 90), new Coord2D(29.0, 88.0, 29, 88) }), 2.0f, 44, 90, 234, 2, 0, new float[] { 93.0f, 6.0f, 11.0f, 55.0f, 32.0f, 37.0f });
        this.rightWingModel[4].setRotationPoint(-6.0f, -11.0f, -12.0f);
        this.rightWingModel[4].rotateAngleX = 1.6406094f;
        this.rightWingModel[4].rotateAngleZ = 3.1415927f;
        this.rightWingModel[5].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(5.0, 0.0, 5, 0), new Coord2D(0.0, 18.0, 0, 18) }), 2.0f, 5, 18, 42, 2, 0, new float[] { 18.0f, 19.0f, 5.0f });
        this.rightWingModel[5].setRotationPoint(31.0f, -11.0f, -12.0f);
        this.rightWingModel[5].rotateAngleX = 1.6406094f;
        this.rightWingModel[5].rotateAngleZ = 3.1415927f;
        (this.tailModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 280, 400, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 280, 450, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 0, 280, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 100, 280, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 210, 280, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 300, 280, this.textureX, this.textureY);
        this.tailModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 42, 20, 26, 0.0f, -6.0f, 2);
        this.tailModel[0].setRotationPoint(38.0f, -30.0f, -13.0f);
        this.tailModel[1].addFlexBox(0.0f, 0.0f, 0.0f, 42, 8, 14, 0.0f, -3.5f, -3.5f, -6.0f, -6.0f, 2);
        this.tailModel[1].setRotationPoint(80.0f, -24.0f, -7.0f);
        this.tailModel[2].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(44.0, 0.0, 44, 0), new Coord2D(43.0, 4.0, 43, 4), new Coord2D(4.0, 4.0, 4, 4) }), 2.0f, 44, 4, 94, 2, 0, new float[] { 6.0f, 39.0f, 5.0f, 44.0f });
        this.tailModel[2].setRotationPoint(78.0f, -20.0f, -1.0f);
        this.tailModel[2].rotateAngleY = 3.1415927f;
        this.tailModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(31.0, 0.0, 31, 0), new Coord2D(31.0, 27.0, 31, 27), new Coord2D(28.0, 26.0, 28, 26) }), 2.0f, 31, 27, 101, 2, 0, new float[] { 39.0f, 4.0f, 27.0f, 31.0f });
        this.tailModel[3].setRotationPoint(82.0f, -24.0f, -1.0f);
        this.tailModel[3].rotateAngleY = 3.1415927f;
        this.tailModel[4].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(18.0, 0.0, 18, 0), new Coord2D(18.0, 28.0, 18, 28), new Coord2D(16.0, 28.0, 16, 28), new Coord2D(13.0, 26.0, 13, 26) }), 1.0f, 18, 28, 82, 1, 0, new float[] { 30.0f, 4.0f, 2.0f, 28.0f, 18.0f });
        this.tailModel[4].setRotationPoint(92.0f, -30.0f, -1.0f);
        this.tailModel[4].rotateAngleX = 1.5707964f;
        this.tailModel[4].rotateAngleZ = 3.1415927f;
        this.tailModel[5].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(18.0, 0.0, 18, 0), new Coord2D(18.0, 28.0, 18, 28), new Coord2D(16.0, 28.0, 16, 28), new Coord2D(13.0, 26.0, 13, 26) }), 1.0f, 18, 28, 82, 1, 0, new float[] { 30.0f, 4.0f, 2.0f, 28.0f, 18.0f });
        this.tailModel[5].setRotationPoint(92.0f, -31.0f, 1.0f);
        this.tailModel[5].rotateAngleX = 4.712389f;
        this.tailModel[5].rotateAngleZ = 3.1415927f;
        (this.propellerModels = new ModelRendererTurbo[2][3])[0] = this.makeProp(-20, -7, -37);
        this.propellerModels[1] = this.makeProp(-20, -7, 37);
        (this.yawFlapModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 110, 430, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 130, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0f, 0.0f, -0.5f, 5, 2, 1, 0.0f);
        this.yawFlapModel[0].setRotationPoint(15.0f, -18.0f, 0.0f);
        this.yawFlapModel[0].rotateAngleX = 3.141593f;
        this.yawFlapModel[0].rotateAngleZ = 1.570796f;
        this.yawFlapModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(8.0, 0.0, 8, 0), new Coord2D(5.0, 25.0, 5, 25), new Coord2D(0.0, 27.0, 0, 27) }), 2.0f, 8, 27, 67, 2, 0, new float[] { 27.0f, 6.0f, 26.0f, 8.0f });
        this.yawFlapModel[1].setRotationPoint(113.0f, -24.0f, -1.0f);
        this.yawFlapModel[1].rotateAngleY = 3.1415927f;
        this.yawFlapModel[1].rotateAngleX = 3.1415927f;
        this.yawFlapModel[1].rotateAngleZ = 3.1415927f;
        (this.pitchFlapLeftModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 150, 130, this.textureX, this.textureY);
        this.pitchFlapLeftModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(7.0, 2.0, 7, 2), new Coord2D(5.0, 26.0, 5, 26), new Coord2D(0.0, 28.0, 0, 28) }), 1.0f, 7, 28, 67, 1, 0, new float[] { 28.0f, 6.0f, 25.0f, 8.0f });
        this.pitchFlapLeftModel[0].setRotationPoint(110.0f, -31.0f, 1.0f);
        this.pitchFlapLeftModel[0].rotateAngleX = 1.5707964f;
        this.pitchFlapLeftModel[0].rotateAngleZ = 3.1415927f;
        this.pitchFlapLeftModel[0].rotateAngleY = 3.1415927f;
        (this.pitchFlapRightModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 75, 130, this.textureX, this.textureY);
        this.pitchFlapRightModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(7.0, 2.0, 7, 2), new Coord2D(5.0, 26.0, 5, 26), new Coord2D(0.0, 28.0, 0, 28) }), 1.0f, 7, 28, 67, 1, 0, new float[] { 28.0f, 6.0f, 25.0f, 8.0f });
        this.pitchFlapRightModel[0].setRotationPoint(110.0f, -30.0f, -1.0f);
        this.pitchFlapRightModel[0].rotateAngleX = 4.712389f;
        this.pitchFlapRightModel[0].rotateAngleZ = 3.1415927f;
        this.pitchFlapRightModel[0].rotateAngleY = 3.1415927f;
        (this.bodyWheelModel = new ModelRendererTurbo[7])[0] = new ModelRendererTurbo((ModelBase)this, 0, 330, this.textureX, this.textureY);
        this.bodyWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 30, 330, this.textureX, this.textureY);
        this.bodyWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 40, 330, this.textureX, this.textureY);
        this.bodyWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 60, 330, this.textureX, this.textureY);
        this.bodyWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 70, 330, this.textureX, this.textureY);
        this.bodyWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 90, 330, this.textureX, this.textureY);
        this.bodyWheelModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 345, this.textureX, this.textureY);
        this.bodyWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 8, 8, 3, 0.0f);
        this.bodyWheelModel[0].setRotationPoint(-48.0f, 2.0f, -1.5f);
        this.bodyWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 6, 1, 0.0f);
        this.bodyWheelModel[1].setRotationPoint(-45.0f, 1.0f, -2.5f);
        this.bodyWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 2, 4, 0.0f);
        this.bodyWheelModel[2].setRotationPoint(-45.0f, -1.0f, -2.5f);
        this.bodyWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 1, 19, 2, 0.0f);
        this.bodyWheelModel[3].setRotationPoint(-39.0f, -18.0f, -1.0f);
        this.bodyWheelModel[3].rotateAngleZ = -0.3141593f;
        this.bodyWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 10, 6, 0.0f);
        this.bodyWheelModel[4].setRotationPoint(-40.0f, -18.0f, -3.0f);
        this.bodyWheelModel[4].rotateAngleZ = -0.3141593f;
        this.bodyWheelModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 13, 2, 0.0f);
        this.bodyWheelModel[5].setRotationPoint(-33.0f, -18.0f, -1.0f);
        this.bodyWheelModel[5].rotateAngleZ = -0.7679449f;
        this.bodyWheelModel[6].addBox(0.0f, 0.0f, 0.0f, 15, 9, 1, 0.0f);
        this.bodyWheelModel[6].setRotationPoint(-27.0f, -14.0f, 4.0f);
        (this.leftWingWheelModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 160, 330, this.textureX, this.textureY);
        this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 190, 330, this.textureX, this.textureY);
        this.leftWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 160, 350, this.textureX, this.textureY);
        this.leftWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 200, 330, this.textureX, this.textureY);
        this.leftWingWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 11, 11, 3, 0.0f);
        this.leftWingWheelModel[0].setRotationPoint(11.0f, -1.0f, 23.0f);
        this.leftWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 20, 1, 0.0f);
        this.leftWingWheelModel[1].setRotationPoint(11.0f, -13.0f, 26.0f);
        this.leftWingWheelModel[1].rotateAngleZ = 0.2094395f;
        this.leftWingWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 13, 6, 1, 0.0f);
        this.leftWingWheelModel[2].setRotationPoint(10.0f, -1.0f, 27.0f);
        this.leftWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 5, 11, 1, 0.0f);
        this.leftWingWheelModel[3].setRotationPoint(16.0f, -13.0f, 28.0f);
        this.leftWingWheelModel[3].rotateAngleX = -0.1396263f;
        this.leftWingWheelModel[3].rotateAngleY = 3.141593f;
        (this.rightWingWheelModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 100, 330, this.textureX, this.textureY);
        this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 130, 330, this.textureX, this.textureY);
        this.rightWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 100, 350, this.textureX, this.textureY);
        this.rightWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 140, 330, this.textureX, this.textureY);
        this.rightWingWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 11, 11, 3, 0.0f);
        this.rightWingWheelModel[0].setRotationPoint(11.0f, -1.0f, -26.0f);
        this.rightWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 20, 1, 0.0f);
        this.rightWingWheelModel[1].setRotationPoint(11.0f, -13.0f, -27.0f);
        this.rightWingWheelModel[1].rotateAngleZ = 0.2094395f;
        this.rightWingWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 13, 6, 1, 0.0f);
        this.rightWingWheelModel[2].setRotationPoint(10.0f, -1.0f, -28.0f);
        this.rightWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 5, 11, 1, 0.0f);
        this.rightWingWheelModel[3].setRotationPoint(11.0f, -13.0f, -28.0f);
        this.rightWingWheelModel[3].rotateAngleX = -0.1396263f;
        this.translateAll(0, 0, 0);
        this.flipAll();
    }
    
    private ModelRendererTurbo[] makeProp(final int i, final int j, final int k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 100, 270, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 100, 270, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 100, 270, this.textureX, this.textureY) };
        return prop;
    }
}
