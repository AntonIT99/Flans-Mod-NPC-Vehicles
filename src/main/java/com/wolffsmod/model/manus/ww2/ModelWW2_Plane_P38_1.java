//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.ww2;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelWW2_Plane_P38_1 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelWW2_Plane_P38_1() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[14])[0] = new ModelRendererTurbo((ModelBase)this, 80, 470, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 160, 470, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 160, 490, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 210, 470, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 290, 470, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 310, 470, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 310, 485, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 310, 500, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 270, 500, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 370, 470, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 270, 450, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 270, 430, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 0, 430, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 50, 430, this.textureX, this.textureY);
        this.bodyModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 22, 20, 16, 0.0f, -1.0f, 3);
        this.bodyModel[0].setRotationPoint(-34.0f, -30.0f, -8.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 22, 17, 1, 0.0f);
        this.bodyModel[1].setRotationPoint(-12.0f, -30.0f, -8.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 22, 17, 1, 0.0f);
        this.bodyModel[2].setRotationPoint(-12.0f, -30.0f, 7.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 22, 3, 16, 0.0f);
        this.bodyModel[3].setRotationPoint(-12.0f, -13.0f, -8.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 18, 8, 0.0f);
        this.bodyModel[4].setRotationPoint(-9.0f, -37.0f, -4.0f);
        this.bodyModel[4].rotateAngleZ = -1.012291f;
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 16, 1, 8, 0.0f);
        this.bodyModel[5].setRotationPoint(-9.0f, -37.0f, -4.0f);
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 18, 1, 8, 0.0f);
        this.bodyModel[6].setRotationPoint(7.0f, -37.0f, -4.0f);
        this.bodyModel[6].rotateAngleZ = -0.6283185f;
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 16, 1, 8, 0.0f);
        this.bodyModel[7].setRotationPoint(-9.0f, -37.0f, 4.0f);
        this.bodyModel[7].rotateAngleX = -1.047198f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 16, 8, 1, 0.0f);
        this.bodyModel[8].setRotationPoint(-9.0f, -37.0f, -4.0f);
        this.bodyModel[8].rotateAngleX = -0.5235988f;
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 29, 2, 16, 0.0f);
        this.bodyModel[9].setRotationPoint(10.0f, -23.0f, -8.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 6, 5, 4, 0.0f);
        this.bodyModel[10].setRotationPoint(-12.0f, -18.0f, -2.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 20, 2, 12, 0.0f);
        this.bodyModel[11].setRotationPoint(0.0f, -13.0f, -6.0f);
        this.bodyModel[11].rotateAngleZ = 1.22173f;
        this.bodyModel[12].addTrapezoid(0.0f, 0.0f, 0.0f, 5, 20, 16, 0.0f, -1.0f, 2);
        this.bodyModel[12].setRotationPoint(10.0f, -30.0f, -8.0f);
        this.bodyModel[13].addTrapezoid(0.0f, 0.0f, 0.0f, 24, 18, 14, 0.0f, -6.0f, 2);
        this.bodyModel[13].setRotationPoint(15.0f, -29.0f, -7.0f);
        (this.noseModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 0, 470, this.textureX, this.textureY);
        this.noseModel[1] = new ModelRendererTurbo((ModelBase)this, 330, 270, this.textureX, this.textureY);
        this.noseModel[2] = new ModelRendererTurbo((ModelBase)this, 330, 270, this.textureX, this.textureY);
        this.noseModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 22, 18, 14, 0.0f, -6.0f, 3);
        this.noseModel[0].setRotationPoint(-56.0f, -29.0f, -7.0f);
        this.noseModel[1].addBox(0.0f, 0.0f, 0.0f, 20, 1, 1, 0.0f);
        this.noseModel[1].setRotationPoint(-52.0f, -26.0f, 1.0f);
        this.noseModel[2].addBox(0.0f, 0.0f, 0.0f, 20, 1, 1, 0.0f);
        this.noseModel[2].setRotationPoint(-52.0f, -26.0f, -2.0f);
        (this.leftWingModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 0, 350, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 50, 350, this.textureX, this.textureY);
        this.leftWingModel[2] = new ModelRendererTurbo((ModelBase)this, 120, 350, this.textureX, this.textureY);
        this.leftWingModel[3] = new ModelRendererTurbo((ModelBase)this, 180, 350, this.textureX, this.textureY);
        this.leftWingModel[4] = new ModelRendererTurbo((ModelBase)this, 260, 350, this.textureX, this.textureY);
        this.leftWingModel[5] = new ModelRendererTurbo((ModelBase)this, 100, 90, this.textureX, this.textureY);
        this.leftWingModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 9, 12, 12, 0.0f, -6.0f, 3);
        this.leftWingModel[0].setRotationPoint(-39.0f, -28.0f, 33.0f);
        this.leftWingModel[1].addTrapezoid(0.0f, 0.0f, 0.0f, 15, 20, 16, 0.0f, -2.0f, 3);
        this.leftWingModel[1].setRotationPoint(-30.0f, -30.0f, 31.0f);
        this.leftWingModel[2].addBox(0.0f, 0.0f, 0.0f, 10, 20, 16, 0.0f);
        this.leftWingModel[2].setRotationPoint(-15.0f, -30.0f, 31.0f);
        this.leftWingModel[3].addBox(0.0f, 0.0f, 0.0f, 26, 18, 12, 0.0f);
        this.leftWingModel[3].setRotationPoint(-5.0f, -30.0f, 33.0f);
        this.leftWingModel[4].addTrapezoid(0.0f, 0.0f, 0.0f, 32, 18, 12, 0.0f, -2.0f, 2);
        this.leftWingModel[4].setRotationPoint(21.0f, -30.0f, 33.0f);
        this.leftWingModel[5].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(46.0, 0.0, 46, 0), new Coord2D(36.0, 108.0, 36, 108), new Coord2D(33.0, 116.0, 33, 116), new Coord2D(29.0, 117.0, 29, 117), new Coord2D(23.0, 112.0, 23, 112), new Coord2D(18.0, 102.0, 18, 102) }), 2.0f, 46, 117, 293, 2, 0, new float[] { 104.0f, 12.0f, 8.0f, 5.0f, 9.0f, 109.0f, 46.0f });
        this.leftWingModel[5].setRotationPoint(39.0f, -21.0f, 8.0f);
        this.leftWingModel[5].rotateAngleX = -1.4407964f;
        (this.rightWingModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 0, 390, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 50, 390, this.textureX, this.textureY);
        this.rightWingModel[2] = new ModelRendererTurbo((ModelBase)this, 120, 390, this.textureX, this.textureY);
        this.rightWingModel[3] = new ModelRendererTurbo((ModelBase)this, 180, 390, this.textureX, this.textureY);
        this.rightWingModel[4] = new ModelRendererTurbo((ModelBase)this, 260, 390, this.textureX, this.textureY);
        this.rightWingModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 100, this.textureX, this.textureY);
        this.rightWingModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 9, 12, 12, 0.0f, -6.0f, 3);
        this.rightWingModel[0].setRotationPoint(-39.0f, -28.0f, -45.0f);
        this.rightWingModel[1].addTrapezoid(0.0f, 0.0f, 0.0f, 15, 20, 16, 0.0f, -2.0f, 3);
        this.rightWingModel[1].setRotationPoint(-30.0f, -30.0f, -47.0f);
        this.rightWingModel[2].addBox(0.0f, 0.0f, 0.0f, 10, 20, 16, 0.0f);
        this.rightWingModel[2].setRotationPoint(-15.0f, -30.0f, -47.0f);
        this.rightWingModel[3].addBox(0.0f, 0.0f, 0.0f, 26, 18, 12, 0.0f);
        this.rightWingModel[3].setRotationPoint(-5.0f, -30.0f, -45.0f);
        this.rightWingModel[4].addTrapezoid(0.0f, 0.0f, 0.0f, 32, 18, 12, 0.0f, -2.0f, 2);
        this.rightWingModel[4].setRotationPoint(21.0f, -30.0f, -45.0f);
        this.rightWingModel[5].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(46.0, 0.0, 46, 0), new Coord2D(28.0, 102.0, 28, 102), new Coord2D(23.0, 112.0, 23, 112), new Coord2D(17.0, 117.0, 17, 117), new Coord2D(13.0, 116.0, 13, 116), new Coord2D(10.0, 108.0, 10, 108) }), 2.0f, 46, 117, 293, 2, 0, new float[] { 109.0f, 9.0f, 5.0f, 8.0f, 12.0f, 104.0f, 46.0f });
        this.rightWingModel[5].setRotationPoint(-7.0f, -21.0f, -8.0f);
        this.rightWingModel[5].rotateAngleX = 4.842389f;
        this.rightWingModel[5].rotateAngleY = 3.1415927f;
        (this.tailModel = new ModelRendererTurbo[15])[0] = new ModelRendererTurbo((ModelBase)this, 355, 390, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 355, 420, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 130, 430, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 355, 350, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 355, 380, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 200, 430, this.textureX, this.textureY);
        this.tailModel[6] = new ModelRendererTurbo((ModelBase)this, 0, 300, this.textureX, this.textureY);
        this.tailModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 270, this.textureX, this.textureY);
        this.tailModel[8] = new ModelRendererTurbo((ModelBase)this, 0, 320, this.textureX, this.textureY);
        this.tailModel[9] = new ModelRendererTurbo((ModelBase)this, 0, 230, this.textureX, this.textureY);
        this.tailModel[10] = new ModelRendererTurbo((ModelBase)this, 60, 230, this.textureX, this.textureY);
        this.tailModel[11] = new ModelRendererTurbo((ModelBase)this, 120, 230, this.textureX, this.textureY);
        this.tailModel[12] = new ModelRendererTurbo((ModelBase)this, 190, 230, this.textureX, this.textureY);
        this.tailModel[13] = new ModelRendererTurbo((ModelBase)this, 260, 230, this.textureX, this.textureY);
        this.tailModel[14] = new ModelRendererTurbo((ModelBase)this, 330, 230, this.textureX, this.textureY);
        this.tailModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 54, 14, 8, 0.0f, -3.5f, 2);
        this.tailModel[0].setRotationPoint(53.0f, -28.0f, -43.0f);
        this.tailModel[1].addBox(0.0f, 0.0f, 0.0f, 45, 6, 1, 0.0f);
        this.tailModel[1].setRotationPoint(87.0f, -24.0f, -39.5f);
        this.tailModel[2].addTrapezoid(0.0f, 0.0f, 0.0f, 18, 12, 12, 0.0f, -1.0f, 2);
        this.tailModel[2].setRotationPoint(53.0f, -27.0f, -45.0f);
        this.tailModel[3].addTrapezoid(0.0f, 0.0f, 0.0f, 54, 14, 8, 0.0f, -3.5f, 2);
        this.tailModel[3].setRotationPoint(53.0f, -28.0f, 35.0f);
        this.tailModel[4].addBox(0.0f, 0.0f, 0.0f, 45, 6, 1, 0.0f);
        this.tailModel[4].setRotationPoint(87.0f, -24.0f, 38.5f);
        this.tailModel[5].addTrapezoid(0.0f, 0.0f, 0.0f, 18, 12, 12, 0.0f, -1.0f, 2);
        this.tailModel[5].setRotationPoint(53.0f, -27.0f, 33.0f);
        this.tailModel[6].addBox(0.0f, 0.0f, 0.0f, 20, 1, 10, 0.0f);
        this.tailModel[6].setRotationPoint(107.0f, -21.5f, -44.0f);
        this.tailModel[7].addBox(0.0f, 0.0f, 0.0f, 12, 1, 68, 0.0f);
        this.tailModel[7].setRotationPoint(107.0f, -21.5f, -34.0f);
        this.tailModel[8].addBox(0.0f, 0.0f, 0.0f, 20, 1, 10, 0.0f);
        this.tailModel[8].setRotationPoint(107.0f, -21.5f, 34.0f);
        this.tailModel[9].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(19.0, 5.0, 19, 5), new Coord2D(16.0, 9.0, 16, 9), new Coord2D(10.0, 10.0, 10, 10), new Coord2D(4.0, 9.0, 4, 9), new Coord2D(1.0, 5.0, 1, 5) }), 1.0f, 20, 10, 56, 1, 0, new float[] { 6.0f, 5.0f, 7.0f, 7.0f, 5.0f, 6.0f, 20.0f });
        this.tailModel[9].setRotationPoint(127.0f, -21.5f, -44.0f);
        this.tailModel[9].rotateAngleX = 1.5707964f;
        this.tailModel[10].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(20.0, 0.0, 20, 0), new Coord2D(19.0, 5.0, 19, 5), new Coord2D(16.0, 9.0, 16, 9), new Coord2D(10.0, 10.0, 10, 10), new Coord2D(4.0, 9.0, 4, 9), new Coord2D(1.0, 5.0, 1, 5) }), 1.0f, 20, 10, 56, 1, 0, new float[] { 6.0f, 5.0f, 7.0f, 7.0f, 5.0f, 6.0f, 20.0f });
        this.tailModel[10].setRotationPoint(127.0f, -20.5f, 44.0f);
        this.tailModel[10].rotateAngleX = 4.712389f;
        this.tailModel[11].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(25.0, 0.0, 25, 0), new Coord2D(24.0, 2.0, 24, 2), new Coord2D(20.0, 6.0, 20, 6), new Coord2D(14.0, 8.0, 14, 8), new Coord2D(12.0, 9.0, 12, 9), new Coord2D(4.0, 4.0, 4, 4) }), 1.0f, 25, 9, 60, 1, 0, new float[] { 6.0f, 10.0f, 3.0f, 7.0f, 6.0f, 3.0f, 25.0f });
        this.tailModel[11].setRotationPoint(107.0f, -18.0f, -38.5f);
        this.tailModel[11].rotateAngleX = 3.1415927f;
        this.tailModel[11].rotateAngleY = 3.1415927f;
        this.tailModel[12].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(25.0, 0.0, 25, 0), new Coord2D(24.0, 2.0, 24, 2), new Coord2D(20.0, 6.0, 20, 6), new Coord2D(14.0, 8.0, 14, 8), new Coord2D(12.0, 9.0, 12, 9), new Coord2D(4.0, 4.0, 4, 4) }), 1.0f, 25, 9, 60, 1, 0, new float[] { 6.0f, 10.0f, 3.0f, 7.0f, 6.0f, 3.0f, 25.0f });
        this.tailModel[12].setRotationPoint(107.0f, -18.0f, 39.5f);
        this.tailModel[12].rotateAngleX = 3.1415927f;
        this.tailModel[12].rotateAngleY = 3.1415927f;
        this.tailModel[13].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(14.0, 0.0, 14, 0), new Coord2D(14.0, 22.0, 14, 22), new Coord2D(12.0, 22.0, 12, 22), new Coord2D(6.0, 17.0, 6, 17), new Coord2D(2.0, 8.0, 2, 8) }), 1.0f, 14, 22, 65, 1, 0, new float[] { 9.0f, 10.0f, 8.0f, 2.0f, 22.0f, 14.0f });
        this.tailModel[13].setRotationPoint(107.0f, -24.0f, 38.5f);
        this.tailModel[13].rotateAngleY = 3.1415927f;
        this.tailModel[14].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(14.0, 0.0, 14, 0), new Coord2D(14.0, 22.0, 14, 22), new Coord2D(12.0, 22.0, 12, 22), new Coord2D(6.0, 17.0, 6, 17), new Coord2D(2.0, 8.0, 2, 8) }), 1.0f, 14, 22, 65, 1, 0, new float[] { 9.0f, 10.0f, 8.0f, 2.0f, 22.0f, 14.0f });
        this.tailModel[14].setRotationPoint(107.0f, -24.0f, -39.5f);
        this.tailModel[14].rotateAngleY = 3.1415927f;
        (this.propellerModels = new ModelRendererTurbo[2][3])[0] = this.makeProp(-32, -22, 39);
        this.propellerModels[1] = this.makeProp(-32, -22, -39);
        (this.yawFlapModel = new ModelRendererTurbo[3])[0] = new ModelRendererTurbo((ModelBase)this, 300, 450, this.textureX, this.textureY);
        this.yawFlapModel[1] = new ModelRendererTurbo((ModelBase)this, 200, 100, this.textureX, this.textureY);
        this.yawFlapModel[2] = new ModelRendererTurbo((ModelBase)this, 200, 130, this.textureX, this.textureY);
        this.yawFlapModel[0].addBox(0.0f, 0.0f, -0.5f, 5, 2, 1, 0.0f);
        this.yawFlapModel[0].setRotationPoint(-7.0f, -18.0f, 0.0f);
        this.yawFlapModel[0].rotateAngleX = 3.141593f;
        this.yawFlapModel[0].rotateAngleZ = 1.570796f;
        this.yawFlapModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(11.0, 0.0, 11, 0), new Coord2D(10.0, 8.0, 10, 8), new Coord2D(6.0, 17.0, 6, 17), new Coord2D(0.0, 22.0, 0, 22) }), 1.0f, 11, 22, 60, 1, 0, new float[] { 22.0f, 8.0f, 10.0f, 9.0f, 11.0f });
        this.yawFlapModel[1].setRotationPoint(121.0f, -24.0f, 38.5f);
        this.yawFlapModel[1].rotateAngleX = 3.1415927f;
        this.yawFlapModel[1].rotateAngleZ = 3.1415927f;
        this.yawFlapModel[2].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(11.0, 0.0, 11, 0), new Coord2D(10.0, 8.0, 10, 8), new Coord2D(6.0, 17.0, 6, 17), new Coord2D(0.0, 22.0, 0, 22) }), 1.0f, 11, 22, 60, 1, 0, new float[] { 22.0f, 8.0f, 10.0f, 9.0f, 11.0f });
        this.yawFlapModel[2].setRotationPoint(121.0f, -24.0f, -39.5f);
        this.yawFlapModel[2].rotateAngleX = 3.1415927f;
        this.yawFlapModel[2].rotateAngleZ = 3.1415927f;
        this.pitchFlapLeftModel = new ModelRendererTurbo[1];
        (this.pitchFlapLeftModel[0] = new ModelRendererTurbo((ModelBase)this, 100, 275, this.textureX, this.textureY)).addBox(0.0f, 0.0f, 0.0f, 8, 1, 68, 0.0f);
        this.pitchFlapLeftModel[0].setRotationPoint(119.0f, -21.5f, -34.0f);
        (this.bodyWheelModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 200, 270, this.textureX, this.textureY);
        this.bodyWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 230, 270, this.textureX, this.textureY);
        this.bodyWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 240, 270, this.textureX, this.textureY);
        this.bodyWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 255, 270, this.textureX, this.textureY);
        this.bodyWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 265, 270, this.textureX, this.textureY);
        this.bodyWheelModel[5] = new ModelRendererTurbo((ModelBase)this, 280, 270, this.textureX, this.textureY);
        this.bodyWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 10, 10, 3, 0.0f);
        this.bodyWheelModel[0].setRotationPoint(-42.0f, 0.0f, -1.5f);
        this.bodyWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 10, 1, 0.0f);
        this.bodyWheelModel[1].setRotationPoint(-36.0f, -3.0f, -2.5f);
        this.bodyWheelModel[1].rotateAngleZ = -0.2094395f;
        this.bodyWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 15, 3, 0.0f);
        this.bodyWheelModel[2].setRotationPoint(-33.0f, -16.0f, -1.5f);
        this.bodyWheelModel[2].rotateAngleZ = -0.2094395f;
        this.bodyWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 2, 15, 2, 0.0f);
        this.bodyWheelModel[3].setRotationPoint(-25.0f, -16.0f, -1.0f);
        this.bodyWheelModel[3].rotateAngleZ = -0.7330383f;
        this.bodyWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 1, 12, 6, 0.0f);
        this.bodyWheelModel[4].setRotationPoint(-34.0f, -16.0f, -3.0f);
        this.bodyWheelModel[4].rotateAngleZ = -0.2094395f;
        this.bodyWheelModel[5].addBox(0.0f, 0.0f, 0.0f, 20, 8, 1, 0.0f);
        this.bodyWheelModel[5].setRotationPoint(-28.0f, -12.0f, 4.0f);
        (this.leftWingWheelModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 200, 320, this.textureX, this.textureY);
        this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 235, 320, this.textureX, this.textureY);
        this.leftWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 250, 320, this.textureX, this.textureY);
        this.leftWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 260, 320, this.textureX, this.textureY);
        this.leftWingWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 13, 13, 3, 0.0f);
        this.leftWingWheelModel[0].setRotationPoint(13.0f, -3.0f, 37.0f);
        this.leftWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 19, 2, 0.0f);
        this.leftWingWheelModel[1].setRotationPoint(20.0f, -14.0f, 40.0f);
        this.leftWingWheelModel[1].rotateAngleZ = -0.1396263f;
        this.leftWingWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 15, 1, 0.0f);
        this.leftWingWheelModel[2].setRotationPoint(33.0f, -14.0f, 40.5f);
        this.leftWingWheelModel[2].rotateAngleZ = -1.134464f;
        this.leftWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 32, 10, 1, 0.0f);
        this.leftWingWheelModel[3].setRotationPoint(15.0f, -14.0f, 42.0f);
        (this.rightWingWheelModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 200, 290, this.textureX, this.textureY);
        this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 235, 290, this.textureX, this.textureY);
        this.rightWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 250, 290, this.textureX, this.textureY);
        this.rightWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 260, 290, this.textureX, this.textureY);
        this.rightWingWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 13, 13, 3, 0.0f);
        this.rightWingWheelModel[0].setRotationPoint(13.0f, -3.0f, -40.0f);
        this.rightWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 19, 2, 0.0f);
        this.rightWingWheelModel[1].setRotationPoint(20.0f, -14.0f, -42.0f);
        this.rightWingWheelModel[1].rotateAngleZ = -0.1396263f;
        this.rightWingWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 15, 1, 0.0f);
        this.rightWingWheelModel[2].setRotationPoint(33.0f, -14.0f, -41.5f);
        this.rightWingWheelModel[2].rotateAngleZ = -1.134464f;
        this.rightWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 32, 10, 1, 0.0f);
        this.rightWingWheelModel[3].setRotationPoint(15.0f, -14.0f, -43.0f);
        this.translateAll(0, 0, 0);
        this.flipAll();
    }
    
    private ModelRendererTurbo[] makeProp(final int i, final int j, final int k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 100, 270, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 100, 270, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 100, 270, this.textureX, this.textureY) };
        prop[0].addBox(-0.0f, -28.0f, -3.0f, 1, 28, 3, 0.0f);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].addBox(-0.0f, -28.0f, -3.0f, 1, 28, 3, 0.0f);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].addBox(-0.0f, -28.0f, -3.0f, 1, 28, 3, 0.0f);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}
