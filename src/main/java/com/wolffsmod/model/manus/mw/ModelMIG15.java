//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.mw;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelMIG15 extends ModelFlanPlane
{
    int textureX;
    int textureY;
    
    public ModelMIG15() {
        this.textureX = 512;
        this.textureY = 512;
        this.noseModel = new ModelRendererTurbo[1];
        (this.noseModel[0] = new ModelRendererTurbo((ModelBase)this, 0, 450, this.textureX, this.textureY)).addTrapezoid(0.0f, 0.0f, 0.0f, 22, 22, 22, 0.0f, -4.0f, 3);
        this.noseModel[0].setRotationPoint(-36.0f, -21.0f, -11.0f);
        (this.bodyModel = new ModelRendererTurbo[13])[0] = new ModelRendererTurbo((ModelBase)this, 95, 450, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 150, 450, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 240, 450, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 320, 450, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 320, 480, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 0, 420, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 20, 420, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 20, 435, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 70, 420, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 70, 435, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 0, 500, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 130, 420, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 200, 420, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 3, 22, 22, 0.0f);
        this.bodyModel[0].setRotationPoint(-14.0f, -21.0f, -11.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 22, 3, 22, 0.0f);
        this.bodyModel[1].setRotationPoint(-11.0f, -2.0f, -11.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 16, 22, 22, 0.0f);
        this.bodyModel[2].setRotationPoint(11.0f, -21.0f, -11.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 22, 19, 4, 0.0f);
        this.bodyModel[3].setRotationPoint(-11.0f, -21.0f, -11.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 22, 19, 4, 0.0f);
        this.bodyModel[4].setRotationPoint(-11.0f, -21.0f, 7.0f);
        this.bodyModel[5].addBox(0.0f, 0.0f, 0.0f, 1, 12, 8, 0.0f);
        this.bodyModel[5].setRotationPoint(-4.0f, -28.0f, -4.0f);
        this.bodyModel[5].rotateAngleZ = -0.9075712f;
        this.bodyModel[6].addBox(0.0f, 0.0f, 0.0f, 15, 1, 8, 0.0f);
        this.bodyModel[6].setRotationPoint(-4.0f, -28.0f, -4.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 15, 1, 8, 0.0f);
        this.bodyModel[7].setRotationPoint(11.0f, -28.0f, -4.0f);
        this.bodyModel[7].rotateAngleZ = -0.5235988f;
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 15, 9, 1, 0.0f);
        this.bodyModel[8].setRotationPoint(-4.0f, -28.0f, -4.0f);
        this.bodyModel[8].rotateAngleX = -0.6108652f;
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 15, 1, 9, 0.0f);
        this.bodyModel[9].setRotationPoint(-4.0f, -28.0f, 4.0f);
        this.bodyModel[9].rotateAngleX = -0.9599311f;
        this.bodyModel[10].addTrapezoid(0.0f, 0.0f, 0.0f, 4, 9, 2, 0.0f, -1.0f, 4);
        this.bodyModel[10].setRotationPoint(18.0f, -30.0f, 6.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 22, 2, 12, 0.0f);
        this.bodyModel[11].setRotationPoint(7.0f, -2.0f, -6.0f);
        this.bodyModel[11].rotateAngleZ = 1.396263f;
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 6, 5, 4, 0.0f);
        this.bodyModel[12].setRotationPoint(-11.0f, -7.0f, -2.0f);
        (this.tailModel = new ModelRendererTurbo[6])[0] = new ModelRendererTurbo((ModelBase)this, 0, 370, this.textureX, this.textureY);
        this.tailModel[1] = new ModelRendererTurbo((ModelBase)this, 210, 370, this.textureX, this.textureY);
        this.tailModel[2] = new ModelRendererTurbo((ModelBase)this, 115, 370, this.textureX, this.textureY);
        this.tailModel[3] = new ModelRendererTurbo((ModelBase)this, 0, 270, this.textureX, this.textureY);
        this.tailModel[4] = new ModelRendererTurbo((ModelBase)this, 190, 270, this.textureX, this.textureY);
        this.tailModel[5] = new ModelRendererTurbo((ModelBase)this, 290, 270, this.textureX, this.textureY);
        this.tailModel[0].addTrapezoid(0.0f, 0.0f, 0.0f, 32, 22, 22, 0.0f, -1.0f, 2);
        this.tailModel[0].setRotationPoint(27.0f, -21.0f, -11.0f);
        this.tailModel[1].addTrapezoid(0.0f, 0.0f, 0.0f, 38, 20, 20, 0.0f, -4.0f, 2);
        this.tailModel[1].setRotationPoint(59.0f, -20.0f, -10.0f);
        this.tailModel[2].addBox(0.0f, 0.0f, 0.0f, 21, 2, 22, 0.0f);
        this.tailModel[2].setRotationPoint(27.0f, -11.0f, -11.0f);
        this.tailModel[3].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(46.0, 0.0, 46, 0), new Coord2D(52.0, 4.0, 52, 4), new Coord2D(75.0, 30.0, 75, 30), new Coord2D(75.0, 32.0, 75, 32), new Coord2D(72.0, 34.0, 72, 34), new Coord2D(62.0, 35.0, 62, 35), new Coord2D(56.0, 32.0, 56, 32) }), 2.0f, 75, 35, 178, 2, 0, new float[] { 65.0f, 7.0f, 11.0f, 4.0f, 2.0f, 35.0f, 8.0f, 46.0f });
        this.tailModel[3].setRotationPoint(51.0f, -12.0f, -1.0f);
        this.tailModel[3].rotateAngleY = 3.1415927f;
        this.tailModel[4].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(22.0, 0.0, 22, 0), new Coord2D(32.0, 21.0, 32, 21), new Coord2D(28.0, 24.0, 28, 24), new Coord2D(24.0, 25.0, 24, 25) }), 1.0f, 32, 25, 91, 1, 0, new float[] { 35.0f, 5.0f, 5.0f, 24.0f, 22.0f });
        this.tailModel[4].setRotationPoint(95.0f, -32.0f, -1.0f);
        this.tailModel[4].rotateAngleX = 1.5707964f;
        this.tailModel[4].rotateAngleZ = 3.1415927f;
        this.tailModel[5].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(22.0, 0.0, 22, 0), new Coord2D(32.0, 21.0, 32, 21), new Coord2D(28.0, 24.0, 28, 24), new Coord2D(24.0, 25.0, 24, 25) }), 1.0f, 32, 25, 91, 1, 0, new float[] { 35.0f, 5.0f, 5.0f, 24.0f, 22.0f });
        this.tailModel[5].rotateAngleX = 4.712389f;
        this.tailModel[5].rotateAngleZ = 3.1415927f;
        this.tailModel[5].setRotationPoint(95.0f, -33.0f, 1.0f);
        (this.rightWingModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 115, 400, this.textureX, this.textureY);
        this.rightWingModel[1] = new ModelRendererTurbo((ModelBase)this, 0, 180, this.textureX, this.textureY);
        this.rightWingModel[0].addBox(0.0f, 0.0f, 0.0f, 42, 2, 1, 0.0f);
        this.rightWingModel[0].setRotationPoint(6.0f, -11.0f, -12.0f);
        this.rightWingModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(40.0, 8.0, 40, 8), new Coord2D(74.0, 64.0, 74, 64), new Coord2D(68.0, 68.0, 68, 68), new Coord2D(52.0, 69.0, 52, 69), new Coord2D(44.0, 64.0, 44, 64) }), 2.0f, 74, 69, 227, 2, 0, new float[] { 78.0f, 10.0f, 17.0f, 8.0f, 66.0f, 8.0f, 40.0f });
        this.rightWingModel[1].setRotationPoint(6.0f, -9.0f, -12.0f);
        this.rightWingModel[1].rotateAngleX = 1.5707964f;
        this.rightWingModel[1].rotateAngleZ = 3.1415927f;
        (this.leftWingModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 115, 410, this.textureX, this.textureY);
        this.leftWingModel[1] = new ModelRendererTurbo((ModelBase)this, 240, 180, this.textureX, this.textureY);
        this.leftWingModel[0].addBox(0.0f, 0.0f, 0.0f, 42, 2, 1, 0.0f);
        this.leftWingModel[0].setRotationPoint(6.0f, -11.0f, 11.0f);
        this.leftWingModel[1].addShape3D(0.0f, 0.0f, 0.0f, new Shape2D(new Coord2D[] { new Coord2D(0.0, 0.0, 0, 0), new Coord2D(40.0, 0.0, 40, 0), new Coord2D(40.0, 8.0, 40, 8), new Coord2D(74.0, 64.0, 74, 64), new Coord2D(68.0, 68.0, 68, 68), new Coord2D(52.0, 69.0, 52, 69), new Coord2D(44.0, 64.0, 44, 64) }), 2.0f, 74, 69, 227, 2, 0, new float[] { 78.0f, 10.0f, 17.0f, 8.0f, 66.0f, 8.0f, 40.0f });
        this.leftWingModel[1].rotateAngleX = 4.712389f;
        this.leftWingModel[1].rotateAngleZ = 3.1415927f;
        this.leftWingModel[1].setRotationPoint(6.0f, -11.0f, 12.0f);
        this.yawFlapModel = new ModelRendererTurbo[1];
        (this.yawFlapModel[0] = new ModelRendererTurbo((ModelBase)this, 200, 440, this.textureX, this.textureY)).addBox(0.0f, 0.0f, -0.5f, 5, 2, 1, 0.0f);
        this.yawFlapModel[0].setRotationPoint(-7.0f, -7.0f, 0.0f);
        this.yawFlapModel[0].rotateAngleX = 3.141593f;
        this.yawFlapModel[0].rotateAngleZ = 1.5707964f;
        (this.bodyWheelModel = new ModelRendererTurbo[4])[0] = new ModelRendererTurbo((ModelBase)this, 0, 340, this.textureX, this.textureY);
        this.bodyWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 25, 340, this.textureX, this.textureY);
        this.bodyWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 40, 340, this.textureX, this.textureY);
        this.bodyWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 40, 350, this.textureX, this.textureY);
        this.bodyWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 7, 7, 2, 0.0f);
        this.bodyWheelModel[0].setRotationPoint(-18.0f, 3.0f, -1.0f);
        this.bodyWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 8, 3, 0.0f);
        this.bodyWheelModel[1].setRotationPoint(-18.0f, 0.0f, -1.5f);
        this.bodyWheelModel[1].rotateAngleZ = 0.3665192f;
        this.bodyWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 11, 3, 1, 0.0f);
        this.bodyWheelModel[2].setRotationPoint(-20.0f, 1.0f, 2.0f);
        this.bodyWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 11, 3, 1, 0.0f);
        this.bodyWheelModel[3].setRotationPoint(-20.0f, 1.0f, -3.0f);
        (this.leftWingWheelModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 135, 340, this.textureX, this.textureY);
        this.leftWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 165, 340, this.textureX, this.textureY);
        this.leftWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 175, 340, this.textureX, this.textureY);
        this.leftWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 135, 360, this.textureX, this.textureY);
        this.leftWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 185, 340, this.textureX, this.textureY);
        this.leftWingWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 11, 11, 2, 0.0f);
        this.leftWingWheelModel[0].setRotationPoint(30.0f, -1.0f, 30.0f);
        this.leftWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 18, 1, 0.0f);
        this.leftWingWheelModel[1].setRotationPoint(25.0f, -9.0f, 32.0f);
        this.leftWingWheelModel[1].rotateAngleZ = 0.5759587f;
        this.leftWingWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 9, 1, 0.0f);
        this.leftWingWheelModel[2].setRotationPoint(28.0f, -9.0f, 24.0f);
        this.leftWingWheelModel[2].rotateAngleX = 1.099557f;
        this.leftWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 11, 6, 1, 0.0f);
        this.leftWingWheelModel[3].setRotationPoint(30.0f, -1.0f, 33.0f);
        this.leftWingWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 5, 12, 1, 0.0f);
        this.leftWingWheelModel[4].setRotationPoint(25.0f, -8.0f, 33.0f);
        this.leftWingWheelModel[4].rotateAngleZ = 0.5759587f;
        (this.rightWingWheelModel = new ModelRendererTurbo[5])[0] = new ModelRendererTurbo((ModelBase)this, 70, 340, this.textureX, this.textureY);
        this.rightWingWheelModel[1] = new ModelRendererTurbo((ModelBase)this, 100, 340, this.textureX, this.textureY);
        this.rightWingWheelModel[2] = new ModelRendererTurbo((ModelBase)this, 110, 340, this.textureX, this.textureY);
        this.rightWingWheelModel[3] = new ModelRendererTurbo((ModelBase)this, 70, 360, this.textureX, this.textureY);
        this.rightWingWheelModel[4] = new ModelRendererTurbo((ModelBase)this, 120, 340, this.textureX, this.textureY);
        this.rightWingWheelModel[0].addBox(0.0f, 0.0f, 0.0f, 11, 11, 2, 0.0f);
        this.rightWingWheelModel[0].setRotationPoint(30.0f, -1.0f, -32.0f);
        this.rightWingWheelModel[1].addBox(0.0f, 0.0f, 0.0f, 3, 18, 1, 0.0f);
        this.rightWingWheelModel[1].setRotationPoint(25.0f, -9.0f, -33.0f);
        this.rightWingWheelModel[1].rotateAngleZ = 0.5759587f;
        this.rightWingWheelModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 9, 1, 0.0f);
        this.rightWingWheelModel[2].setRotationPoint(30.0f, -9.0f, -24.0f);
        this.rightWingWheelModel[2].rotateAngleX = 1.099557f;
        this.rightWingWheelModel[2].rotateAngleY = 3.141593f;
        this.rightWingWheelModel[3].addBox(0.0f, 0.0f, 0.0f, 11, 6, 1, 0.0f);
        this.rightWingWheelModel[3].setRotationPoint(30.0f, -1.0f, -34.0f);
        this.rightWingWheelModel[4].addBox(0.0f, 0.0f, 0.0f, 5, 12, 1, 0.0f);
        this.rightWingWheelModel[4].setRotationPoint(25.0f, -8.0f, -34.0f);
        this.rightWingWheelModel[4].rotateAngleZ = 0.5759587f;
        (this.propellerModels = new ModelRendererTurbo[1][8])[0] = this.makeProp1(-34, -10, 0);
        this.translateAll(0, -2, 0);
        this.flipAll();
    }
    
    private ModelRendererTurbo[] makeProp1(final int i, final int j, final int k) {
        final ModelRendererTurbo[] prop = { new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY), new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY) };
        prop[0].addBox(-1.0f, -2.0f, -2.0f, 1, 2, 2, 0.0f);
        prop[1].addBox(-1.0f, -2.0f, -2.0f, 1, 2, 2, 0.0f);
        prop[2].addBox(-1.0f, -2.0f, -2.0f, 1, 2, 2, 0.0f);
        prop[0].setRotationPoint((float)i, (float)j, (float)k);
        prop[1].setRotationPoint((float)i, (float)j, (float)k);
        prop[2].setRotationPoint((float)i, (float)j, (float)k);
        return prop;
    }
}