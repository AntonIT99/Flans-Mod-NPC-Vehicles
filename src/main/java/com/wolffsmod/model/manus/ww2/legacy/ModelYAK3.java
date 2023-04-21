
package com.wolffsmod.model.manus.ww2.legacy;

import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.wolffsmod.model.ModelFlanPlane;

public class ModelYAK3 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    boolean VarGear;
    boolean VarDoor;
    boolean VarWing;
    
    public ModelYAK3() {
        textureX = 512;
        textureY = 512;
        VarGear = false;
        VarDoor = true;
        VarWing = true;
        (bodyModel = new ModelRendererTurbo[16])[0] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 40, 470, textureX, textureY);
        bodyModel[2] = new ModelRendererTurbo(this, 110, 470, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 160, 470, textureX, textureY);
        bodyModel[4] = new ModelRendererTurbo(this, 240, 470, textureX, textureY);
        bodyModel[5] = new ModelRendererTurbo(this, 325, 470, textureX, textureY);
        bodyModel[6] = new ModelRendererTurbo(this, 370, 470, textureX, textureY);
        bodyModel[7] = new ModelRendererTurbo(this, 370, 490, textureX, textureY);
        bodyModel[8] = new ModelRendererTurbo(this, 430, 470, textureX, textureY);
        bodyModel[9] = new ModelRendererTurbo(this, 450, 470, textureX, textureY);
        bodyModel[10] = new ModelRendererTurbo(this, 450, 480, textureX, textureY);
        bodyModel[11] = new ModelRendererTurbo(this, 450, 495, textureX, textureY);
        bodyModel[12] = new ModelRendererTurbo(this, 310, 430, textureX, textureY);
        bodyModel[13] = new ModelRendererTurbo(this, 340, 430, textureX, textureY);
        bodyModel[14] = new ModelRendererTurbo(this, 0, 430, textureX, textureY);
        bodyModel[15] = new ModelRendererTurbo(this, 60, 430, textureX, textureY);
        bodyModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 8, 10, 10, 0.0f, -5.0f, 3);
        bodyModel[0].setRotationPoint(-48.0f, -22.0f, -5.0f);
        bodyModel[1].addTrapezoid(0.0f, 0.0f, 0.0f, 17, 17, 16, 0.0f, -3.0f, 3);
        bodyModel[1].setRotationPoint(-40.0f, -25.0f, -8.0f);
        bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 12, 9, 10, 0.0f);
        bodyModel[2].setRotationPoint(-35.0f, -17.0f, -5.0f);
        bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 23, 17, 16, 0.0f);
        bodyModel[3].setRotationPoint(-23.0f, -25.0f, -8.0f);
        bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 25, 1, 16, 0.0f);
        bodyModel[4].setRotationPoint(0.0f, -9.0f, -8.0f);
        bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 5, 25, 16, 0.0f);
        bodyModel[5].setRotationPoint(25.0f, -33.0f, -8.0f);
        bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 25, 16, 1, 0.0f);
        bodyModel[6].setRotationPoint(0.0f, -25.0f, -8.0f);
        bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 25, 16, 1, 0.0f);
        bodyModel[7].setRotationPoint(0.0f, -25.0f, 7.0f);
        bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 1, 12, 8, 0.0f);
        bodyModel[8].setRotationPoint(6.0f, -33.0f, -4.0f);
        bodyModel[8].rotateAngleZ = -0.7853982f;
        bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 19, 1, 8, 0.0f);
        bodyModel[9].setRotationPoint(6.0f, -33.0f, -4.0f);
        bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 19, 9, 1, 0.0f);
        bodyModel[10].setRotationPoint(6.0f, -33.0f, -4.0f);
        bodyModel[10].rotateAngleX = -0.4363323f;
        bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 19, 1, 9, 0.0f);
        bodyModel[11].setRotationPoint(6.0f, -33.0f, 4.0f);
        bodyModel[11].rotateAngleX = -1.134464f;
        bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 2, 17, 12, 0.0f);
        bodyModel[12].setRotationPoint(18.0f, -9.0f, -6.0f);
        bodyModel[12].rotateAngleZ = 2.70526f;
        bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 6, 5, 4, 0.0f);
        bodyModel[13].setRotationPoint(0.0f, -14.0f, -2.0f);
        bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 17, 4, 12, 0.0f);
        bodyModel[14].setRotationPoint(-2.0f, -8.0f, -6.0f);
        bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 4, 10, 12, 0.0f);
        bodyModel[15].setRotationPoint(15.0f, -4.0f, -6.0f);
        bodyModel[15].rotateAngleZ = 1.989675f;
        (tailModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
        tailModel[1] = new ModelRendererTurbo(this, 0, 340, textureX, textureY);
        tailModel[2] = new ModelRendererTurbo(this, 90, 340, textureX, textureY);
        tailModel[3] = new ModelRendererTurbo(this, 170, 340, textureX, textureY);
        tailModel[4] = new ModelRendererTurbo(this, 110, 430, textureX, textureY);
        tailModel[5] = new ModelRendererTurbo(this, 110, 440, textureX, textureY);
        tailModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 49, 25, 16, 0.0f, -7.0f, 2);
        tailModel[0].setRotationPoint(30.0f, -33.0f, -8.0f);
        tailModel[0].setRotationPoint(30.0f, -33.0f, -8.0f);
        tailModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(17.0, 0.0, 17, 0), new Coord2D(17.0, 25.0, 17, 25), new Coord2D(10.0, 27.0, 10, 27), new Coord2D(6.0, 24.0, 6, 24), new Coord2D(0.0, 11.0, 0, 11) }), 2.0f, 17, 27, 81, 2, 0, new float[] { 11.0f, 15.0f, 5.0f, 8.0f, 25.0f, 17.0f });
        tailModel[1].setRotationPoint(79.0f, -15.0f, -1.0f);
        tailModel[1].rotateAngleY = 3.1415927f;
        tailModel[2].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(14.0, 0.0, 14, 0), new Coord2D(14.0, 27.0, 14, 27), new Coord2D(11.0, 26.0, 11, 26) }), 1.0f, 14, 27, 74, 1, 0, new float[] { 29.0f, 4.0f, 27.0f, 14.0f });
        tailModel[2].setRotationPoint(79.0f, -24.0f, 1.0f);
        tailModel[2].rotateAngleX = 1.5707964f;
        tailModel[2].rotateAngleY = 3.1415927f;
        tailModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(14.0, 0.0, 14, 0), new Coord2D(14.0, 27.0, 14, 27), new Coord2D(11.0, 26.0, 11, 26) }), 1.0f, 14, 27, 74, 1, 0, new float[] { 29.0f, 4.0f, 27.0f, 14.0f });
        tailModel[3].setRotationPoint(79.0f, -23.0f, -1.0f);
        tailModel[3].rotateAngleX = 4.712389f;
        tailModel[3].rotateAngleY = 3.1415927f;
        if (VarGear) 
        {
            tailModel[4].addBox(0.0f, 0.0f, 0.0f, 4, 4, 1, 0.0f);
            tailModel[4].setRotationPoint(79.0f, -14.0f, -0.5f);
            tailModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 8, 2, 0.0f);
            tailModel[5].setRotationPoint(78.0f, -19.0f, -1.0f);
            tailModel[5].rotateAngleZ = 0.3490658f;
        }
        (rightWingModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 0, 455, textureX, textureY);
        rightWingModel[1] = new ModelRendererTurbo(this, 250, 340, textureX, textureY);
        rightWingModel[2] = new ModelRendererTurbo(this, 250, 350, textureX, textureY);
        rightWingModel[3] = new ModelRendererTurbo(this, 360, 340, textureX, textureY);
        rightWingModel[4] = new ModelRendererTurbo(this, 130, 430, textureX, textureY);
        rightWingModel[5] = new ModelRendererTurbo(this, 160, 430, textureX, textureY);
        rightWingModel[6] = new ModelRendererTurbo(this, 170, 430, textureX, textureY);
        rightWingModel[7] = new ModelRendererTurbo(this, 200, 430, textureX, textureY);
        rightWingModel[0].addBox(0.0f, 0.0f, 0.0f, 11, 1, 1, 0.0f);
        rightWingModel[0].setRotationPoint(-20.0f, -10.0f, -29.0f);
        rightWingModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(47.0, 0.0, 47, 0), new Coord2D(43.0, 6.0, 43, 6), new Coord2D(4.0, 6.0, 4, 6) }), 2.0f, 47, 6, 102, 2, 0, new float[] { 8.0f, 39.0f, 8.0f, 47.0f });
        rightWingModel[1].setRotationPoint(-19.0f, -8.0f, -8.0f);
        rightWingModel[1].rotateAngleX = 4.712389f;
        rightWingModel[1].rotateAngleY = 3.1415927f;
        rightWingModel[2].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(39.0, 0.0, 39, 0), new Coord2D(36.0, 15.0, 36, 15), new Coord2D(2.0, 15.0, 2, 15) }), 2.0f, 39, 15, 105, 2, 0, new float[] { 16.0f, 34.0f, 16.0f, 39.0f });
        rightWingModel[2].setRotationPoint(-15.0f, -8.0f, -14.0f);
        rightWingModel[2].rotateAngleX = 4.712389f;
        rightWingModel[2].rotateAngleY = 3.1415927f;
        rightWingModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(34.0, 0.0, 34, 0), new Coord2D(22.0, 44.0, 22, 44), new Coord2D(18.0, 48.0, 18, 48), new Coord2D(10.0, 50.0, 10, 50), new Coord2D(6.0, 46.0, 6, 46) }), 2.0f, 34, 50, 148, 2, 0, new float[] { 47.0f, 6.0f, 9.0f, 6.0f, 46.0f, 34.0f });
        rightWingModel[3].setRotationPoint(-13.0f, -8.0f, -29.0f);
        rightWingModel[3].rotateAngleX = 4.832389f;
        rightWingModel[3].rotateAngleY = 3.1415927f;
        if (VarGear) 
        {
            rightWingModel[4].addBox(0.0f, 0.0f, 0.0f, 10, 10, 2, 0.0f);
            rightWingModel[4].setRotationPoint(-16.0f, 0.0f, -28.0f);
            rightWingModel[5].addBox(0.0f, 0.0f, 0.0f, 3, 17, 1, 0.0f);
            rightWingModel[5].setRotationPoint(-7.0f, -10.0f, -29.0f);
            rightWingModel[5].rotateAngleZ = -0.3839724f;
            rightWingModel[6].addBox(0.0f, 0.0f, 0.0f, 12, 6, 1, 0.0f);
            rightWingModel[6].setRotationPoint(-17.0f, 0.0f, -30.0f);
            rightWingModel[7].addBox(0.0f, 0.0f, 0.0f, 5, 11, 1, 0.0f);
            rightWingModel[7].setRotationPoint(-8.0f, -10.0f, -30.0f);
            rightWingModel[7].rotateAngleZ = -0.3839724f;
        }
        (leftWingModel = new ModelRendererTurbo[8])[0] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
        leftWingModel[1] = new ModelRendererTurbo(this, 0, 280, textureX, textureY);
        leftWingModel[2] = new ModelRendererTurbo(this, 0, 290, textureX, textureY);
        leftWingModel[3] = new ModelRendererTurbo(this, 110, 280, textureX, textureY);
        leftWingModel[4] = new ModelRendererTurbo(this, 220, 430, textureX, textureY);
        leftWingModel[5] = new ModelRendererTurbo(this, 250, 430, textureX, textureY);
        leftWingModel[6] = new ModelRendererTurbo(this, 260, 430, textureX, textureY);
        leftWingModel[7] = new ModelRendererTurbo(this, 290, 430, textureX, textureY);
        leftWingModel[0].addBox(0.0f, 0.0f, 0.0f, 11, 1, 1, 0.0f);
        leftWingModel[0].setRotationPoint(-20.0f, -10.0f, 28.0f);
        leftWingModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(47.0, 0.0, 47, 0), new Coord2D(43.0, 6.0, 43, 6), new Coord2D(4.0, 6.0, 4, 6) }), 2.0f, 47, 6, 102, 2, 0, new float[] { 8.0f, 39.0f, 8.0f, 47.0f });
        leftWingModel[1].setRotationPoint(-19.0f, -10.0f, 8.0f);
        leftWingModel[1].rotateAngleX = 1.5707964f;
        leftWingModel[1].rotateAngleY = 3.1415927f;
        leftWingModel[2].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(39.0, 0.0, 39, 0), new Coord2D(36.0, 15.0, 36, 15), new Coord2D(2.0, 15.0, 2, 15) }), 2.0f, 39, 15, 105, 2, 0, new float[] { 16.0f, 34.0f, 16.0f, 39.0f });
        leftWingModel[2].setRotationPoint(-15.0f, -10.0f, 14.0f);
        leftWingModel[2].rotateAngleX = 1.5707964f;
        leftWingModel[2].rotateAngleY = 3.1415927f;
        leftWingModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(34.0, 0.0, 34, 0), new Coord2D(28.0, 46.0, 28, 46), new Coord2D(24.0, 50.0, 24, 50), new Coord2D(16.0, 48.0, 16, 48), new Coord2D(12.0, 44.0, 12, 44) }), 2.0f, 34, 50, 148, 2, 0, new float[] { 46.0f, 6.0f, 9.0f, 6.0f, 47.0f, 34.0f });
        leftWingModel[3].setRotationPoint(21.0f, -8.0f, 29.0f);
        leftWingModel[3].rotateAngleX = 4.832389f;
        if (VarGear) 
        {
            leftWingModel[4].addBox(0.0f, 0.0f, 0.0f, 10, 10, 2, 0.0f);
            leftWingModel[4].setRotationPoint(-16.0f, 0.0f, 26.0f);
            leftWingModel[5].addBox(0.0f, 0.0f, 0.0f, 3, 17, 1, 0.0f);
            leftWingModel[5].setRotationPoint(-7.0f, -10.0f, 28.0f);
            leftWingModel[5].rotateAngleZ = -0.3839724f;
            leftWingModel[6].addBox(0.0f, 0.0f, 0.0f, 12, 6, 1, 0.0f);
            leftWingModel[6].setRotationPoint(-17.0f, 0.0f, 29.0f);
            leftWingModel[7].addBox(0.0f, 0.0f, 0.0f, 5, 11, 1, 0.0f);
            leftWingModel[7].setRotationPoint(-8.0f, -10.0f, 29.0f);
            leftWingModel[7].rotateAngleZ = -0.3839724f;
        }
        (propellerModels = new ModelRendererTurbo[1][3])[0] = makeProp(-42, -17, 0);
        (yawFlapModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo(this, 340, 440, textureX, textureY);
        yawFlapModel[1] = new ModelRendererTurbo(this, 0, 240, textureX, textureY);
        yawFlapModel[0].addBox(0.0f, 0.0f, -0.5f, 5, 2, 1, 0.0f);
        yawFlapModel[0].setRotationPoint(5.0f, -14.0f, 0.0f);
        yawFlapModel[0].rotateAngleX = 3.141593f;
        yawFlapModel[0].rotateAngleZ = 1.570796f;
        yawFlapModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(2.0, 1.0, 2, 1), new Coord2D(7.0, 4.0, 7, 4), new Coord2D(7.0, 10.0, 7, 10), new Coord2D(4.0, 19.0, 4, 19), new Coord2D(0.0, 25.0, 0, 25) }), 2.0f, 7, 25, 58, 2, 0, new float[] { 25.0f, 8.0f, 10.0f, 6.0f, 6.0f, 3.0f });
        yawFlapModel[1].setRotationPoint(96.0f, -15.0f, -1.0f);
        yawFlapModel[1].rotateAngleX = 3.1415927f;
        yawFlapModel[1].rotateAngleZ = 3.1415927f;
        (pitchFlapRightModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo(this, 70, 240, textureX, textureY);
        pitchFlapRightModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(7.0, 4.0, 7, 4), new Coord2D(3.0, 24.0, 3, 24), new Coord2D(0.0, 27.0, 0, 27) }), 1.0f, 7, 27, 62, 1, 0, new float[] { 27.0f, 5.0f, 21.0f, 9.0f });
        pitchFlapRightModel[0].setRotationPoint(93.0f, -23.0f, -1.0f);
        pitchFlapRightModel[0].rotateAngleX = 4.712389f;
        pitchFlapRightModel[0].rotateAngleY = 3.1415927f;
        (pitchFlapLeftModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo(this, 140, 240, textureX, textureY);
        pitchFlapLeftModel[0].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(7.0, 4.0, 7, 4), new Coord2D(3.0, 24.0, 3, 24), new Coord2D(0.0, 27.0, 0, 27) }), 1.0f, 7, 27, 62, 1, 0, new float[] { 27.0f, 5.0f, 21.0f, 9.0f });
        pitchFlapLeftModel[0].setRotationPoint(93.0f, -24.0f, 1.0f);
        pitchFlapLeftModel[0].rotateAngleX = 1.5707964f;
        pitchFlapLeftModel[0].rotateAngleY = 3.1415927f;
        pitchFlapLeftWingModel = new ModelRendererTurbo[0];
        pitchFlapRightWingModel = new ModelRendererTurbo[0];
        topWingModel = new ModelRendererTurbo[0];
        flipAll();
    }
    
    private ModelRendererTurbo[] makeProp(final int i, final int j, final int k) 
    {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo(this, 100, 430, textureX, textureY), new ModelRendererTurbo(this, 100, 430, textureX, textureY), new ModelRendererTurbo(this, 100, 430, textureX, textureY) };
        prop[0].addBox(-0.0f, -24.0f, -3.0f, 1, 24, 3, 0.0f);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].addBox(-0.0f, -24.0f, -3.0f, 1, 24, 3, 0.0f);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].addBox(-0.0f, -24.0f, -3.0f, 1, 24, 3, 0.0f);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}
