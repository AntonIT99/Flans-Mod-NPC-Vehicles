//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.civil;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelCivil_Vehicle_PoliceTruck_2 extends ModelFlanVehicle
{
    int textureX;
    int textureY;
    
    public ModelCivil_Vehicle_PoliceTruck_2() {
        this.textureX = 512;
        this.textureY = 512;
        (this.bodyModel = new ModelRendererTurbo[42])[0] = new ModelRendererTurbo((ModelBase)this, 0, 440, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase)this, 90, 440, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase)this, 90, 455, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase)this, 100, 440, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase)this, 185, 440, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase)this, 270, 440, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase)this, 380, 440, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase)this, 0, 380, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase)this, 120, 380, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase)this, 200, 380, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase)this, 280, 380, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase)this, 360, 380, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase)this, 360, 400, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase)this, 400, 380, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase)this, 0, 320, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase)this, 110, 320, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase)this, 110, 340, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase)this, 155, 320, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase)this, 280, 320, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase)this, 350, 320, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase)this, 0, 260, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase)this, 90, 260, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase)this, 160, 260, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase)this, 330, 260, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase)this, 400, 260, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase)this, 0, 200, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase)this, 0, 230, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase)this, 0, 80, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase)this, 0, 40, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase)this, 0, 40, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase)this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase)this, 30, 0, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase)this, 50, 0, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase)this, 100, 0, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase)this, 50, 0, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase)this, 100, 0, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase)this, 200, 45, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase)this, 200, 25, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase)this, 200, 0, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase)this, 200, 45, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase)this, 200, 25, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase)this, 200, 0, this.textureX, this.textureY);
        this.bodyModel[0].addBox(0.0f, 0.0f, 0.0f, 4, 6, 38, 0.0f);
        this.bodyModel[0].setRotationPoint(23.0f, -2.0f, -19.0f);
        this.bodyModel[1].addBox(0.0f, 0.0f, 0.0f, 2, 8, 2, 0.0f);
        this.bodyModel[1].setRotationPoint(26.0f, -3.0f, 9.0f);
        this.bodyModel[2].addBox(0.0f, 0.0f, 0.0f, 2, 8, 2, 0.0f);
        this.bodyModel[2].setRotationPoint(26.0f, -3.0f, -11.0f);
        this.bodyModel[3].addBox(0.0f, 0.0f, 0.0f, 3, 13, 36, 0.0f);
        this.bodyModel[3].setRotationPoint(23.0f, -15.0f, -18.0f);
        this.bodyModel[4].addBox(0.0f, 0.0f, 0.0f, 15, 15, 26, 0.0f);
        this.bodyModel[4].setRotationPoint(8.0f, -11.0f, -13.0f);
        this.bodyModel[5].addShapeBox(0.0f, 0.0f, 0.0f, 18, 2, 36, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.9999f, 0.0f, 0.0f, -1.999f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[5].setRotationPoint(8.0f, -15.0f, -18.0f);
        this.bodyModel[6].addShapeBox(0.0f, 0.0f, 0.0f, 17, 2, 20, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, -0.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[6].setRotationPoint(9.0f, -17.0f, -10.0f);
        this.bodyModel[7].addBox(0.0f, 0.0f, 0.0f, 19, 5, 36, 0.0f);
        this.bodyModel[7].setRotationPoint(-10.0f, -2.0f, -18.0f);
        this.bodyModel[8].addBox(0.0f, 0.0f, 0.0f, 2, 12, 36, 0.0f);
        this.bodyModel[8].setRotationPoint(7.0f, -28.0f, 18.0f);
        this.bodyModel[8].rotateAngleX = 3.141593f;
        this.bodyModel[8].rotateAngleZ = -2.96706f;
        this.bodyModel[9].addBox(0.0f, 0.0f, 0.0f, 2, 15, 36, 0.0f);
        this.bodyModel[9].setRotationPoint(7.0f, -17.0f, -18.0f);
        this.bodyModel[10].addBox(0.0f, 0.0f, 0.0f, 1, 5, 36, 0.0f);
        this.bodyModel[10].setRotationPoint(-10.0f, -30.0f, -18.0f);
        this.bodyModel[11].addBox(0.0f, 0.0f, 0.0f, 16, 15, 1, 0.0f);
        this.bodyModel[11].setRotationPoint(-9.0f, -17.0f, 17.0f);
        this.bodyModel[12].addBox(0.0f, 0.0f, 0.0f, 16, 15, 1, 0.0f);
        this.bodyModel[12].setRotationPoint(-9.0f, -17.0f, -18.0f);
        this.bodyModel[13].addBox(0.0f, 0.0f, 0.0f, 17, 2, 36, 0.0f);
        this.bodyModel[13].setRotationPoint(-10.0f, -29.0f, -18.0f);
        this.bodyModel[14].addBox(0.0f, 0.0f, 0.0f, 16, 1, 36, 0.0f);
        this.bodyModel[14].setRotationPoint(-9.0f, -30.0f, -18.0f);
        this.bodyModel[14].rotateAngleZ = -0.05235988f;
        this.bodyModel[15].addBox(0.0f, 0.0f, 0.0f, 14, 12, 5, 0.0f);
        this.bodyModel[15].setRotationPoint(9.0f, -15.0f, -18.0f);
        this.bodyModel[16].addBox(0.0f, 0.0f, 0.0f, 14, 11, 5, 0.0f);
        this.bodyModel[16].setRotationPoint(9.0f, -15.0f, 13.0f);
        this.bodyModel[17].addBox(0.0f, 0.0f, 0.0f, 23, 7, 36, 0.0f);
        this.bodyModel[17].setRotationPoint(-33.0f, -4.0f, -18.0f);
        this.bodyModel[18].addBox(0.0f, 0.0f, 0.0f, 14, 8, 18, 0.0f);
        this.bodyModel[18].setRotationPoint(-47.0f, -4.0f, -9.0f);
        this.bodyModel[19].addBox(0.0f, 0.0f, 0.0f, 14, 1, 36, 0.0f);
        this.bodyModel[19].setRotationPoint(-47.0f, -4.0f, -18.0f);
        this.bodyModel[20].addBox(0.0f, 0.0f, 0.0f, 8, 7, 36, 0.0f);
        this.bodyModel[20].setRotationPoint(-55.0f, -4.0f, -18.0f);
        this.bodyModel[21].addBox(0.0f, 0.0f, 0.0f, 16, 1, 16, 0.0f);
        this.bodyModel[21].setRotationPoint(-30.0f, -31.0f, -8.0f);
        this.bodyModel[22].addBox(0.0f, 0.0f, 0.0f, 45, 1, 36, 0.0f);
        this.bodyModel[22].setRotationPoint(-55.0f, -30.0f, -18.0f);
        this.bodyModel[23].addBox(0.0f, 0.0f, 0.0f, 4, 4, 26, 0.0f);
        this.bodyModel[23].setRotationPoint(-53.0f, -34.0f, -13.0f);
        this.bodyModel[24].addBox(0.0f, 0.0f, 0.0f, 4, 4, 26, 0.0f);
        this.bodyModel[24].setRotationPoint(-6.0f, -33.0f, -13.0f);
        this.bodyModel[25].addBox(0.0f, 0.0f, 0.0f, 45, 25, 1, 0.0f);
        this.bodyModel[25].setRotationPoint(-55.0f, -29.0f, 17.0f);
        this.bodyModel[26].addBox(0.0f, 0.0f, 0.0f, 45, 25, 1, 0.0f);
        this.bodyModel[26].setRotationPoint(-55.0f, -29.0f, -18.0f);
        this.bodyModel[27].addBox(0.0f, 0.0f, 0.0f, 5, 6, 38, 0.0f);
        this.bodyModel[27].setRotationPoint(-56.0f, 0.0f, -19.0f);
        this.bodyModel[28].addBox(0.0f, 0.0f, 0.0f, 2, 2, 28, 0.0f);
        this.bodyModel[28].setRotationPoint(15.0f, 3.0f, -14.0f);
        this.bodyModel[29].addBox(0.0f, 0.0f, 0.0f, 2, 2, 28, 0.0f);
        this.bodyModel[29].setRotationPoint(-41.0f, 3.0f, -14.0f);
        this.bodyModel[30].addBox(0.0f, 0.0f, 0.0f, 1, 26, 8, 0.0f);
        this.bodyModel[30].setRotationPoint(-10.0f, -25.0f, 10.0f);
        this.bodyModel[31].addBox(0.0f, 0.0f, 0.0f, 1, 26, 8, 0.0f);
        this.bodyModel[31].setRotationPoint(-10.0f, -25.0f, -18.0f);
        this.bodyModel[32].addBox(0.0f, 0.0f, 0.0f, 12, 4, 12, 0.0f);
        this.bodyModel[32].setRotationPoint(-7.0f, -7.0f, 3.0f);
        this.bodyModel[33].addBox(0.0f, 0.0f, 0.0f, 15, 1, 12, 0.0f);
        this.bodyModel[33].setRotationPoint(-7.0f, -6.0f, 3.0f);
        this.bodyModel[33].rotateAngleZ = 1.692969f;
        this.bodyModel[34].addBox(0.0f, 0.0f, 0.0f, 12, 4, 12, 0.0f);
        this.bodyModel[34].setRotationPoint(-7.0f, -7.0f, -15.0f);
        this.bodyModel[35].addBox(0.0f, 0.0f, 0.0f, 15, 1, 12, 0.0f);
        this.bodyModel[35].setRotationPoint(-7.0f, -6.0f, -15.0f);
        this.bodyModel[35].rotateAngleZ = 1.692969f;
        this.bodyModel[36].addShapeBox(0.0f, 0.0f, 0.0f, 42, 4, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[36].setRotationPoint(-53.0f, -8.0f, 8.0f);
        this.bodyModel[37].addBox(0.0f, 0.0f, 0.0f, 42, 1, 12, 0.0f);
        this.bodyModel[37].setRotationPoint(-53.0f, -9.0f, 5.0f);
        this.bodyModel[38].addShapeBox(0.0f, 0.0f, 0.0f, 42, 20, 2, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[38].setRotationPoint(-53.0f, -29.0f, 15.0f);
        this.bodyModel[39].addShapeBox(0.0f, 0.0f, 0.0f, 42, 4, 9, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2.0f, 0.0f, 0.0f, -2.0f);
        this.bodyModel[39].setRotationPoint(-53.0f, -8.0f, -17.0f);
        this.bodyModel[40].addBox(0.0f, 0.0f, 0.0f, 42, 1, 12, 0.0f);
        this.bodyModel[40].setRotationPoint(-53.0f, -9.0f, -17.0f);
        this.bodyModel[41].addShapeBox(0.0f, 0.0f, 0.0f, 42, 20, 2, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, -1.5f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        this.bodyModel[41].setRotationPoint(-53.0f, -29.0f, -17.0f);
        (this.leftBackWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 40, 495, this.textureX, this.textureY);
        this.leftBackWheelModel[0].addShape3D(6.0f, -6.0f, -2.5f, new Shape2D(new Coord2D[] { new Coord2D(3.0, 0.0, 3, 0), new Coord2D(9.0, 0.0, 9, 0), new Coord2D(12.0, 3.0, 12, 3), new Coord2D(12.0, 9.0, 12, 9), new Coord2D(9.0, 12.0, 9, 12), new Coord2D(3.0, 12.0, 3, 12), new Coord2D(0.0, 9.0, 0, 9), new Coord2D(0.0, 3.0, 0, 3) }), 5.0f, 12, 12, 40, 5, 0, new float[] { 6.0f, 4.0f, 6.0f, 4.0f, 6.0f, 4.0f, 6.0f, 3.0f });
        this.leftBackWheelModel[0].setRotationPoint(-40.0f, 4.0f, -16.0f);
        (this.rightBackWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 40, 495, this.textureX, this.textureY);
        this.rightBackWheelModel[0].addShape3D(6.0f, -6.0f, -2.5f, new Shape2D(new Coord2D[] { new Coord2D(3.0, 0.0, 3, 0), new Coord2D(9.0, 0.0, 9, 0), new Coord2D(12.0, 3.0, 12, 3), new Coord2D(12.0, 9.0, 12, 9), new Coord2D(9.0, 12.0, 9, 12), new Coord2D(3.0, 12.0, 3, 12), new Coord2D(0.0, 9.0, 0, 9), new Coord2D(0.0, 3.0, 0, 3) }), 5.0f, 12, 12, 40, 5, 0, new float[] { 6.0f, 4.0f, 6.0f, 4.0f, 6.0f, 4.0f, 6.0f, 3.0f });
        this.rightBackWheelModel[0].setRotationPoint(-40.0f, 4.0f, 16.0f);
        (this.leftFrontWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 40, 495, this.textureX, this.textureY);
        this.leftFrontWheelModel[0].addShape3D(6.0f, -6.0f, -2.5f, new Shape2D(new Coord2D[] { new Coord2D(3.0, 0.0, 3, 0), new Coord2D(9.0, 0.0, 9, 0), new Coord2D(12.0, 3.0, 12, 3), new Coord2D(12.0, 9.0, 12, 9), new Coord2D(9.0, 12.0, 9, 12), new Coord2D(3.0, 12.0, 3, 12), new Coord2D(0.0, 9.0, 0, 9), new Coord2D(0.0, 3.0, 0, 3) }), 5.0f, 12, 12, 40, 5, 0, new float[] { 6.0f, 4.0f, 6.0f, 4.0f, 6.0f, 4.0f, 6.0f, 3.0f });
        this.leftFrontWheelModel[0].setRotationPoint(16.0f, 4.0f, -16.0f);
        (this.rightFrontWheelModel = new ModelRendererTurbo[1])[0] = new ModelRendererTurbo((ModelBase)this, 40, 495, this.textureX, this.textureY);
        this.rightFrontWheelModel[0].addShape3D(6.0f, -6.0f, -2.5f, new Shape2D(new Coord2D[] { new Coord2D(3.0, 0.0, 3, 0), new Coord2D(9.0, 0.0, 9, 0), new Coord2D(12.0, 3.0, 12, 3), new Coord2D(12.0, 9.0, 12, 9), new Coord2D(9.0, 12.0, 9, 12), new Coord2D(3.0, 12.0, 3, 12), new Coord2D(0.0, 9.0, 0, 9), new Coord2D(0.0, 3.0, 0, 3) }), 5.0f, 12, 12, 40, 5, 0, new float[] { 6.0f, 4.0f, 6.0f, 4.0f, 6.0f, 4.0f, 6.0f, 3.0f });
        this.rightFrontWheelModel[0].setRotationPoint(16.0f, 4.0f, 16.0f);
        (this.bodyDoorCloseModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 200, 180, this.textureX, this.textureY);
        this.bodyDoorCloseModel[1] = new ModelRendererTurbo((ModelBase)this, 239, 180, this.textureX, this.textureY);
        this.bodyDoorCloseModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 27, 17, 0.0f);
        this.bodyDoorCloseModel[0].setRotationPoint(-56.0f, -29.0f, -17.0f);
        this.bodyDoorCloseModel[1].addBox(0.0f, 0.0f, -17.0f, 1, 27, 17, 0.0f);
        this.bodyDoorCloseModel[1].setRotationPoint(-56.0f, -29.0f, 17.0f);
        (this.bodyDoorOpenModel = new ModelRendererTurbo[2])[0] = new ModelRendererTurbo((ModelBase)this, 200, 180, this.textureX, this.textureY);
        this.bodyDoorOpenModel[1] = new ModelRendererTurbo((ModelBase)this, 239, 180, this.textureX, this.textureY);
        this.bodyDoorOpenModel[0].addBox(0.0f, 0.0f, 0.0f, 1, 27, 17, 0.0f);
        this.bodyDoorOpenModel[0].setRotationPoint(-55.0f, -29.0f, -17.0f);
        this.bodyDoorOpenModel[0].rotateAngleY = 2.094395f;
        this.bodyDoorOpenModel[1].addBox(0.0f, 0.0f, -17.0f, 1, 27, 17, 0.0f);
        this.bodyDoorOpenModel[1].setRotationPoint(-55.0f, -29.0f, 17.0f);
        this.bodyDoorOpenModel[1].rotateAngleY = -2.094395f;
        this.steeringWheelModel = new ModelRendererTurbo[1];
        (this.steeringWheelModel[0] = new ModelRendererTurbo((ModelBase)this, 495, 0, this.textureX, this.textureY)).addBox(0.0f, -4.0f, -4.0f, 1, 8, 8, 0.0f);
        this.steeringWheelModel[0].setRotationPoint(5.5f, -15.0f, 9.0f);
        this.steeringWheelModel[0].rotateAngleZ = -0.1919862f;
        this.flipAll();
        this.translateAll(12, 0, 0);
    }
}