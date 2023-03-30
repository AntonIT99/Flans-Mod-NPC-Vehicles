package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelBoxer2
        extends ModelVehicle
{
    int textureX = 512;
    int textureY = 512;


    public ModelBoxer2() {
        bodyModel = new ModelRendererTurbo[104];
        bodyModel[0] = new ModelRendererTurbo(this, 0, 440, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 0, 420, textureX, textureY);
        bodyModel[2] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 0, 360, textureX, textureY);
        bodyModel[4] = new ModelRendererTurbo(this, 210, 360, textureX, textureY);
        bodyModel[5] = new ModelRendererTurbo(this, 115, 230, textureX, textureY);
        bodyModel[6] = new ModelRendererTurbo(this, 0, 345, textureX, textureY);
        bodyModel[7] = new ModelRendererTurbo(this, 0, 330, textureX, textureY);
        bodyModel[8] = new ModelRendererTurbo(this, 310, 330, textureX, textureY);
        bodyModel[9] = new ModelRendererTurbo(this, 70, 480, textureX, textureY);
        bodyModel[10] = new ModelRendererTurbo(this, 125, 480, textureX, textureY);
        bodyModel[11] = new ModelRendererTurbo(this, 230, 480, textureX, textureY);
        bodyModel[12] = new ModelRendererTurbo(this, 285, 480, textureX, textureY);
        bodyModel[13] = new ModelRendererTurbo(this, 300, 480, textureX, textureY);
        bodyModel[14] = new ModelRendererTurbo(this, 315, 480, textureX, textureY);
        bodyModel[15] = new ModelRendererTurbo(this, 330, 480, textureX, textureY);
        bodyModel[16] = new ModelRendererTurbo(this, 0, 270, textureX, textureY);
        bodyModel[17] = new ModelRendererTurbo(this, 380, 330, textureX, textureY);
        bodyModel[18] = new ModelRendererTurbo(this, 430, 330, textureX, textureY);
        bodyModel[19] = new ModelRendererTurbo(this, 60, 270, textureX, textureY);
        bodyModel[20] = new ModelRendererTurbo(this, 160, 270, textureX, textureY);
        bodyModel[21] = new ModelRendererTurbo(this, 160, 290, textureX, textureY);
        bodyModel[22] = new ModelRendererTurbo(this, 270, 270, textureX, textureY);
        bodyModel[23] = new ModelRendererTurbo(this, 320, 270, textureX, textureY);
        bodyModel[24] = new ModelRendererTurbo(this, 370, 270, textureX, textureY);
        bodyModel[25] = new ModelRendererTurbo(this, 420, 270, textureX, textureY);
        bodyModel[26] = new ModelRendererTurbo(this, 470, 270, textureX, textureY);
        bodyModel[27] = new ModelRendererTurbo(this, 265, 440, textureX, textureY);
        bodyModel[28] = new ModelRendererTurbo(this, 295, 440, textureX, textureY);
        bodyModel[29] = new ModelRendererTurbo(this, 270, 290, textureX, textureY);
        bodyModel[30] = new ModelRendererTurbo(this, 320, 290, textureX, textureY);
        bodyModel[31] = new ModelRendererTurbo(this, 370, 290, textureX, textureY);
        bodyModel[32] = new ModelRendererTurbo(this, 420, 290, textureX, textureY);
        bodyModel[33] = new ModelRendererTurbo(this, 470, 290, textureX, textureY);
        bodyModel[34] = new ModelRendererTurbo(this, 315, 440, textureX, textureY);
        bodyModel[35] = new ModelRendererTurbo(this, 345, 440, textureX, textureY);
        bodyModel[36] = new ModelRendererTurbo(this, 345, 480, textureX, textureY);
        bodyModel[37] = new ModelRendererTurbo(this, 345, 490, textureX, textureY);
        bodyModel[38] = new ModelRendererTurbo(this, 345, 500, textureX, textureY);
        bodyModel[39] = new ModelRendererTurbo(this, 355, 500, textureX, textureY);
        bodyModel[40] = new ModelRendererTurbo(this, 370, 480, textureX, textureY);
        bodyModel[41] = new ModelRendererTurbo(this, 370, 480, textureX, textureY);
        bodyModel[42] = new ModelRendererTurbo(this, 370, 500, textureX, textureY);
        bodyModel[43] = new ModelRendererTurbo(this, 380, 500, textureX, textureY);
        bodyModel[44] = new ModelRendererTurbo(this, 390, 490, textureX, textureY);
        bodyModel[45] = new ModelRendererTurbo(this, 325, 230, textureX, textureY);
        bodyModel[46] = new ModelRendererTurbo(this, 325, 250, textureX, textureY);
        bodyModel[47] = new ModelRendererTurbo(this, 325, 230, textureX, textureY);
        bodyModel[48] = new ModelRendererTurbo(this, 325, 250, textureX, textureY);
        bodyModel[49] = new ModelRendererTurbo(this, 185, 230, textureX, textureY);
        bodyModel[50] = new ModelRendererTurbo(this, 185, 225, textureX, textureY);
        bodyModel[51] = new ModelRendererTurbo(this, 260, 225, textureX, textureY);
        bodyModel[52] = new ModelRendererTurbo(this, 0, 230, textureX, textureY);
        bodyModel[53] = new ModelRendererTurbo(this, 20, 230, textureX, textureY);
        bodyModel[54] = new ModelRendererTurbo(this, 55, 230, textureX, textureY);
        bodyModel[55] = new ModelRendererTurbo(this, 80, 230, textureX, textureY);
        bodyModel[56] = new ModelRendererTurbo(this, 266, 405, textureX, textureY);
        bodyModel[57] = new ModelRendererTurbo(this, 494, 494, textureX, textureY);
        bodyModel[58] = new ModelRendererTurbo(this, 470, 494, textureX, textureY);
        bodyModel[59] = new ModelRendererTurbo(this, 494, 480, textureX, textureY);
        bodyModel[60] = new ModelRendererTurbo(this, 470, 480, textureX, textureY);
        bodyModel[61] = new ModelRendererTurbo(this, 435, 499, textureX, textureY);
        bodyModel[62] = new ModelRendererTurbo(this, 425, 499, textureX, textureY);
        bodyModel[63] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
        bodyModel[64] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
        bodyModel[65] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
        bodyModel[66] = new ModelRendererTurbo(this, 25, 200, textureX, textureY);
        bodyModel[67] = new ModelRendererTurbo(this, 175, 200, textureX, textureY);
        bodyModel[68] = new ModelRendererTurbo(this, 0, 215, textureX, textureY);
        bodyModel[69] = new ModelRendererTurbo(this, 175, 200, textureX, textureY);
        bodyModel[70] = new ModelRendererTurbo(this, 0, 215, textureX, textureY);
        bodyModel[71] = new ModelRendererTurbo(this, 175, 200, textureX, textureY);
        bodyModel[72] = new ModelRendererTurbo(this, 0, 215, textureX, textureY);
        bodyModel[73] = new ModelRendererTurbo(this, 175, 200, textureX, textureY);
        bodyModel[74] = new ModelRendererTurbo(this, 0, 215, textureX, textureY);
        bodyModel[75] = new ModelRendererTurbo(this, 175, 200, textureX, textureY);
        bodyModel[76] = new ModelRendererTurbo(this, 395, 200, textureX, textureY);
        bodyModel[77] = new ModelRendererTurbo(this, 200, 200, textureX, textureY);
        bodyModel[78] = new ModelRendererTurbo(this, 200, 200, textureX, textureY);
        bodyModel[79] = new ModelRendererTurbo(this, 200, 200, textureX, textureY);
        bodyModel[80] = new ModelRendererTurbo(this, 225, 200, textureX, textureY);
        bodyModel[81] = new ModelRendererTurbo(this, 370, 200, textureX, textureY);
        bodyModel[82] = new ModelRendererTurbo(this, 0, 215, textureX, textureY);
        bodyModel[83] = new ModelRendererTurbo(this, 370, 200, textureX, textureY);
        bodyModel[84] = new ModelRendererTurbo(this, 0, 215, textureX, textureY);
        bodyModel[85] = new ModelRendererTurbo(this, 370, 200, textureX, textureY);
        bodyModel[86] = new ModelRendererTurbo(this, 0, 215, textureX, textureY);
        bodyModel[87] = new ModelRendererTurbo(this, 370, 200, textureX, textureY);
        bodyModel[88] = new ModelRendererTurbo(this, 0, 215, textureX, textureY);
        bodyModel[89] = new ModelRendererTurbo(this, 370, 200, textureX, textureY);
        bodyModel[90] = new ModelRendererTurbo(this, 300, 380, textureX, textureY);
        bodyModel[91] = new ModelRendererTurbo(this, 260, 360, textureX, textureY);
        bodyModel[92] = new ModelRendererTurbo(this, 275, 370, textureX, textureY);
        bodyModel[93] = new ModelRendererTurbo(this, 300, 370, textureX, textureY);
        bodyModel[94] = new ModelRendererTurbo(this, 340, 370, textureX, textureY);
        bodyModel[95] = new ModelRendererTurbo(this, 340, 370, textureX, textureY);
        bodyModel[96] = new ModelRendererTurbo(this, 340, 370, textureX, textureY);
        bodyModel[97] = new ModelRendererTurbo(this, 340, 370, textureX, textureY);
        bodyModel[98] = new ModelRendererTurbo(this, 300, 370, textureX, textureY);
        bodyModel[99] = new ModelRendererTurbo(this, 340, 370, textureX, textureY);
        bodyModel[100] = new ModelRendererTurbo(this, 340, 370, textureX, textureY);
        bodyModel[101] = new ModelRendererTurbo(this, 340, 370, textureX, textureY);
        bodyModel[102] = new ModelRendererTurbo(this, 340, 370, textureX, textureY);
        bodyModel[103] = new ModelRendererTurbo(this, 0, 271, textureX, textureY);

        bodyModel[0].addBox(0.0F, 0.0F, 0.0F, 112, 1, 34, 0.0F);
        bodyModel[0].setRotationPoint(-54.0F, -1.0F, -17.0F);

        bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 112, 15, 2, 0.0F);
        bodyModel[1].setRotationPoint(-54.0F, -16.0F, -17.0F);

        bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 112, 15, 2, 0.0F);
        bodyModel[2].setRotationPoint(-54.0F, -16.0F, 15.0F);

        bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 83, 1, 30, 0.0F);
        bodyModel[3].setRotationPoint(-55.0F, -31.0F, -15.0F);

        bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 14, 1, 14, 0.0F);
        bodyModel[4].setRotationPoint(-7.0F, -32.0F, -7.0F);

        bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 129, 1, 9, 0.0F);
        bodyModel[6].setRotationPoint(-55.0F, -17.0F, -24.0F);

        bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 129, 1, 9, 0.0F);
        bodyModel[7].setRotationPoint(-55.0F, -17.0F, 15.0F);

        bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 2, 1, 30, 0.0F);
        bodyModel[8].setRotationPoint(72.0F, -17.0F, -15.0F);

        bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 21, 5, 14, 0.0F);
        bodyModel[9].setRotationPoint(28.0F, -31.0F, -16.0F);
        (bodyModel[9]).rotateAngleZ = -0.08726646F;

        bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 2, 4, 24, 0.0F);
        bodyModel[11].setRotationPoint(-55.0F, -30.0F, -12.0F);
        (bodyModel[11]).rotateAngleZ = 0.06981317F;

        bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 2, 16, 4, 0.0F);
        bodyModel[12].setRotationPoint(-54.0F, -17.0F, 11.0F);

        bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 2, 15, 4, 0.0F);
        bodyModel[13].setRotationPoint(-55.0F, -30.0F, 11.0F);
        (bodyModel[13]).rotateAngleZ = 0.06981317F;

        bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 2, 16, 4, 0.0F);
        bodyModel[14].setRotationPoint(-54.0F, -17.0F, -15.0F);

        bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 2, 15, 4, 0.0F);
        bodyModel[15].setRotationPoint(-55.0F, -30.0F, -15.0F);
        (bodyModel[15]).rotateAngleZ = 0.06981317F;

        bodyModel[16].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(16.0D, 16.0D, 16, 16), new Coord2D(0.0D, 16.0D, 0, 16) }), 34.0F, 16, 16, 55, 34, 0, new float[] { 23.0F, 16.0F, 16.0F });
        bodyModel[16].setRotationPoint(74.0F, 0.0F, 17.0F);

        bodyModel[17].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(6.0D, 14.0D, 6, 14), new Coord2D(0.0D, 14.0D, 0, 14) }), 83.0F, 9, 14, 44, 83, 0, new float[] { 14.0F, 6.0F, 15.0F, 9.0F });
        (bodyModel[17]).rotateAngleY = -1.5707964F;
        bodyModel[17].setRotationPoint(28.0F, -17.0F, 15.0F);

        bodyModel[18].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(6.0D, 14.0D, 6, 14), new Coord2D(0.0D, 14.0D, 0, 14) }), 83.0F, 9, 14, 44, 83, 0, new float[] { 14.0F, 6.0F, 15.0F, 9.0F });
        (bodyModel[18]).rotateAngleY = 1.5707964F;
        bodyModel[18].setRotationPoint(-55.0F, -17.0F, -15.0F);

        bodyModel[19].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(48.0D, 0.0D, 48, 0), new Coord2D(45.0D, 48.0D, 45, 48), new Coord2D(3.0D, 48.0D, 3, 48) }), 1.0F, 48, 48, 188, 1, 0, new float[] { 49.0F, 42.0F, 49.0F, 48.0F });
        (bodyModel[19]).rotateAngleY = -1.5707964F;
        (bodyModel[19]).rotateAngleX = 1.2740903F;
        bodyModel[19].setRotationPoint(74.0F, -17.0F, -24.0F);

        bodyModel[20].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(46.0D, 0.0D, 46, 0), new Coord2D(46.0D, 14.0D, 46, 14) }), 1.0F, 46, 14, 109, 1, 0, new float[] { 49.0F, 14.0F, 46.0F });
        (bodyModel[20]).rotateAngleX = 0.20943952F;
        bodyModel[20].setRotationPoint(74.0F, -17.0F, 24.0F);

        bodyModel[21].addShape3D(0.0F, 0.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(46.0D, 0.0D, 46, 0), new Coord2D(46.0D, 14.0D, 46, 14) }), 1.0F, 46, 14, 109, 1, 0, new float[] { 49.0F, 14.0F, 46.0F });
        (bodyModel[21]).rotateAngleX = -0.20943952F;
        bodyModel[21].setRotationPoint(74.0F, -17.0F, -24.0F);

        bodyModel[22].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(20.0D, 7.0D, 20, 7) }), 7.0F, 20, 7, 47, 7, 0, new float[] { 20.0F, 10.0F, 7.0F, 10.0F });
        bodyModel[22].setRotationPoint(74.0F, -9.0F, 24.0F);

        bodyModel[23].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(20.0D, 7.0D, 20, 7) }), 7.0F, 20, 7, 46, 7, 0, new float[] { 20.0F, 10.0F, 6.0F, 10.0F });
        bodyModel[23].setRotationPoint(45.0F, -9.0F, 24.0F);

        bodyModel[24].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(20.0D, 7.0D, 20, 7) }), 7.0F, 20, 7, 46, 7, 0, new float[] { 20.0F, 10.0F, 6.0F, 10.0F });
        bodyModel[24].setRotationPoint(15.0F, -9.0F, 24.0F);

        bodyModel[25].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(20.0D, 7.0D, 20, 7) }), 7.0F, 20, 7, 46, 7, 0, new float[] { 20.0F, 10.0F, 6.0F, 10.0F });
        bodyModel[25].setRotationPoint(-14.0F, -9.0F, 24.0F);

        bodyModel[26].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(10.0D, 7.0D, 10, 7) }), 9.0F, 10, 7, 30, 9, 0, new float[] { 10.0F, 8.0F, 2.0F, 10.0F });
        bodyModel[26].setRotationPoint(-45.0F, -9.0F, 24.0F);

        bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 6, 9, 7, 0.0F);
        bodyModel[27].setRotationPoint(2.0F, -9.0F, 17.0F);

        bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 2, 9, 7, 0.0F);
        bodyModel[28].setRotationPoint(-54.0F, -9.0F, 17.0F);

        bodyModel[29].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(20.0D, 7.0D, 20, 7) }), 7.0F, 20, 7, 47, 7, 0, new float[] { 20.0F, 10.0F, 7.0F, 10.0F });
        bodyModel[29].setRotationPoint(74.0F, -9.0F, -17.0F);

        bodyModel[30].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(20.0D, 7.0D, 20, 7) }), 7.0F, 20, 7, 46, 7, 0, new float[] { 20.0F, 10.0F, 6.0F, 10.0F });
        bodyModel[30].setRotationPoint(45.0F, -9.0F, -17.0F);

        bodyModel[31].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(20.0D, 7.0D, 20, 7) }), 7.0F, 20, 7, 46, 7, 0, new float[] { 20.0F, 10.0F, 6.0F, 10.0F });
        bodyModel[31].setRotationPoint(15.0F, -9.0F, -17.0F);

        bodyModel[32].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(20.0D, 7.0D, 20, 7) }), 7.0F, 20, 7, 46, 7, 0, new float[] { 20.0F, 10.0F, 6.0F, 10.0F });
        bodyModel[32].setRotationPoint(-14.0F, -9.0F, -17.0F);

        bodyModel[33].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(10.0D, 7.0D, 10, 7) }), 9.0F, 10, 7, 30, 9, 0, new float[] { 10.0F, 8.0F, 2.0F, 10.0F });
        bodyModel[33].setRotationPoint(-45.0F, -9.0F, -15.0F);

        bodyModel[34].addBox(0.0F, 0.0F, 0.0F, 6, 9, 7, 0.0F);
        bodyModel[34].setRotationPoint(2.0F, -9.0F, -24.0F);

        bodyModel[35].addBox(0.0F, 0.0F, 0.0F, 2, 9, 7, 0.0F);
        bodyModel[35].setRotationPoint(-54.0F, -9.0F, -24.0F);

        bodyModel[36].addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        bodyModel[36].setRotationPoint(66.0F, -17.0F, 24.0F);

        bodyModel[37].addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        bodyModel[37].setRotationPoint(66.0F, -15.0F, 24.0F);

        bodyModel[38].addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        bodyModel[38].setRotationPoint(66.0F, -20.0F, 28.0F);

        bodyModel[39].addBox(0.0F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
        bodyModel[39].setRotationPoint(66.0F, -27.0F, 26.0F);

        bodyModel[40].addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        bodyModel[40].setRotationPoint(66.0F, -17.0F, -28.0F);

        bodyModel[41].addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
        bodyModel[41].setRotationPoint(66.0F, -15.0F, -28.0F);

        bodyModel[42].addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        bodyModel[42].setRotationPoint(66.0F, -20.0F, -29.0F);

        bodyModel[43].addBox(0.0F, 0.0F, 0.0F, 1, 7, 4, 0.0F);
        bodyModel[43].setRotationPoint(66.0F, -27.0F, -30.0F);

        bodyModel[44].addBox(0.0F, 0.0F, 0.0F, 17, 3, 5, 0.0F);
        bodyModel[44].setRotationPoint(46.0F, -19.0F, 25.0F);
        (bodyModel[44]).rotateAngleX = 1.361357F;
        (bodyModel[44]).rotateAngleY = 3.176499F;
        (bodyModel[44]).rotateAngleZ = 0.296706F;

        bodyModel[45].addBox(0.0F, 0.0F, 0.0F, 14, 2, 12, 0.0F);
        bodyModel[45].setRotationPoint(32.0F, -3.0F, -15.0F);

        bodyModel[46].addBox(0.0F, 0.0F, 0.0F, 18, 2, 12, 0.0F);
        bodyModel[46].setRotationPoint(32.0F, -3.0F, -15.0F);
        (bodyModel[46]).rotateAngleZ = 1.815142F;

        bodyModel[47].addBox(0.0F, 0.0F, 0.0F, 14, 2, 12, 0.0F);
        bodyModel[47].setRotationPoint(32.0F, -3.0F, 3.0F);

        bodyModel[48].addBox(0.0F, 0.0F, 0.0F, 18, 2, 12, 0.0F);
        bodyModel[48].setRotationPoint(32.0F, -3.0F, 3.0F);
        (bodyModel[48]).rotateAngleZ = 1.815142F;

        bodyModel[49].addTrapezoid(0.0F, 0.0F, 0.0F, 9, 11, 4, 0.0F, -1.0F, 4);
        bodyModel[49].setRotationPoint(49.0F, -12.0F, -11.0F);

        bodyModel[50].addBox(0.0F, 0.0F, 0.0F, 5, 11, 30, 0.0F);
        bodyModel[50].setRotationPoint(53.0F, -12.0F, -15.0F);

        bodyModel[51].addBox(0.0F, 0.0F, 0.0F, 1, 12, 30, 0.0F);
        bodyModel[51].setRotationPoint(53.0F, -12.0F, -15.0F);
        (bodyModel[51]).rotateAngleZ = -0.2792527F;

        bodyModel[52].addBox(0.0F, 0.0F, 0.0F, 1, 29, 8, 0.0F);
        bodyModel[52].setRotationPoint(27.0F, -30.0F, -15.0F);

        bodyModel[53].addBox(0.0F, 0.0F, 0.0F, 1, 4, 14, 0.0F);
        bodyModel[53].setRotationPoint(27.0F, -30.0F, -7.0F);

        bodyModel[54].addBox(0.0F, 0.0F, 0.0F, 1, 29, 8, 0.0F);
        bodyModel[54].setRotationPoint(27.0F, -30.0F, 7.0F);

        bodyModel[55].addBox(0.0F, 0.0F, 0.0F, 1, 2, 14, 0.0F);
        bodyModel[55].setRotationPoint(27.0F, -3.0F, -7.0F);

    /*(bodyModel[56]).flip = true;
    bodyModel[56].addBox(0.0F, 0.0F, 0.0F, 21, 5, 14, 0.0F);
    bodyModel[56].setRotationPoint(28.0F, -31.0F, -16.0F);
    (bodyModel[56]).rotateAngleZ = -0.08726646F;*/

        bodyModel[57].addBox(0.0F, 0.0F, 0.0F, 1, 10, 8, 0.0F);
        bodyModel[57].setRotationPoint(55.0F, -12.0F, -5.0F);
        (bodyModel[57]).rotateAngleY = 3.1415927F;
        (bodyModel[57]).rotateAngleZ = -2.722714F;

        bodyModel[58].addBox(0.0F, 0.0F, 0.0F, 1, 10, 8, 0.0F);
        bodyModel[58].setRotationPoint(55.0F, -12.0F, 13.0F);
        (bodyModel[58]).rotateAngleY = 3.1415927F;
        (bodyModel[58]).rotateAngleZ = -2.722714F;

        bodyModel[59].addBox(0.0F, 0.0F, 0.0F, 8, 10, 1, 0.0F);
        bodyModel[59].setRotationPoint(41.0F, -26.0F, -15.0F);
        (bodyModel[59]).rotateAngleX = 0.2617994F;
        (bodyModel[59]).rotateAngleY = 3.1415927F;

        bodyModel[60].addBox(0.0F, 0.0F, 0.0F, 8, 10, 1, 0.0F);
        bodyModel[60].setRotationPoint(33.0F, -26.0F, 15.0F);
        (bodyModel[60]).rotateAngleX = 0.2617994F;

        bodyModel[61].addBox(0.0F, 0.0F, 0.0F, 11, 9, 4, 0.0F);
        bodyModel[61].setRotationPoint(47.0F, -10.0F, 7.0F);

        bodyModel[62].addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
        bodyModel[62].setRotationPoint(48.0F, -15.0F, 8.5F);

        bodyModel[63].addBox(0.0F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        bodyModel[63].setRotationPoint(-51.0F, -4.0F, 5.0F);

        bodyModel[64].addBox(0.0F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        bodyModel[64].setRotationPoint(-22.0F, -4.0F, 5.0F);

        bodyModel[65].addBox(0.0F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        bodyModel[65].setRotationPoint(7.0F, -4.0F, 5.0F);

        bodyModel[66].addBox(0.0F, 0.0F, 0.0F, 61, 2, 11, 0.0F);
        bodyModel[66].setRotationPoint(-52.0F, -6.0F, 4.0F);

        bodyModel[67].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[67].setRotationPoint(-52.0F, -10.0F, 5.0F);

        bodyModel[68].addBox(0.0F, 0.0F, 0.0F, 14, 1, 10, 0.0F);
        bodyModel[68].setRotationPoint(-51.0F, -6.0F, 12.0F);
        (bodyModel[68]).rotateAngleX = 1.308997F;

        bodyModel[69].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[69].setRotationPoint(-37.0F, -10.0F, 5.0F);

        bodyModel[70].addBox(0.0F, 0.0F, 0.0F, 14, 1, 10, 0.0F);
        bodyModel[70].setRotationPoint(-36.0F, -6.0F, 12.0F);
        (bodyModel[70]).rotateAngleX = 1.308997F;

        bodyModel[71].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[71].setRotationPoint(-22.0F, -10.0F, 5.0F);

        bodyModel[72].addBox(0.0F, 0.0F, 0.0F, 14, 1, 10, 0.0F);
        bodyModel[72].setRotationPoint(-21.0F, -6.0F, 12.0F);
        (bodyModel[72]).rotateAngleX = 1.308997F;

        bodyModel[73].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[73].setRotationPoint(-7.0F, -10.0F, 5.0F);

        bodyModel[74].addBox(0.0F, 0.0F, 0.0F, 14, 1, 10, 0.0F);
        bodyModel[74].setRotationPoint(-6.0F, -6.0F, 12.0F);
        (bodyModel[74]).rotateAngleX = 1.308997F;

        bodyModel[75].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[75].setRotationPoint(8.0F, -10.0F, 5.0F);

        bodyModel[76].addBox(0.0F, 0.0F, 0.0F, 15, 29, 6, 0.0F);
        bodyModel[76].setRotationPoint(11.0F, -30.0F, 9.0F);

        bodyModel[77].addBox(0.0F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        bodyModel[77].setRotationPoint(-51.0F, -4.0F, -15.0F);

        bodyModel[78].addBox(0.0F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        bodyModel[78].setRotationPoint(-22.0F, -4.0F, -15.0F);

        bodyModel[79].addBox(0.0F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        bodyModel[79].setRotationPoint(7.0F, -4.0F, -15.0F);

        bodyModel[80].addBox(0.0F, 0.0F, 0.0F, 61, 2, 11, 0.0F);
        bodyModel[80].setRotationPoint(-52.0F, -6.0F, -15.0F);

        bodyModel[81].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[81].setRotationPoint(-52.0F, -10.0F, -15.0F);

        bodyModel[82].addBox(0.0F, 0.0F, 0.0F, 14, 1, 10, 0.0F);
        bodyModel[82].setRotationPoint(-37.0F, -6.0F, -12.0F);
        (bodyModel[82]).rotateAngleX = 1.308997F;
        (bodyModel[82]).rotateAngleY = 3.1415927F;

        bodyModel[83].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[83].setRotationPoint(-37.0F, -10.0F, -15.0F);

        bodyModel[84].addBox(0.0F, 0.0F, 0.0F, 14, 1, 10, 0.0F);
        bodyModel[84].setRotationPoint(-22.0F, -6.0F, -12.0F);
        (bodyModel[84]).rotateAngleX = 1.308997F;
        (bodyModel[84]).rotateAngleY = 3.1415927F;

        bodyModel[85].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[85].setRotationPoint(-22.0F, -10.0F, -15.0F);

        bodyModel[86].addBox(0.0F, 0.0F, 0.0F, 14, 1, 10, 0.0F);
        bodyModel[86].setRotationPoint(-7.0F, -6.0F, -12.0F);
        (bodyModel[86]).rotateAngleX = 1.308997F;
        (bodyModel[86]).rotateAngleY = 3.1415927F;

        bodyModel[87].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[87].setRotationPoint(-7.0F, -10.0F, -15.0F);

        bodyModel[88].addBox(0.0F, 0.0F, 0.0F, 14, 1, 10, 0.0F);
        bodyModel[88].setRotationPoint(8.0F, -6.0F, -12.0F);
        (bodyModel[88]).rotateAngleX = 1.308997F;
        (bodyModel[88]).rotateAngleY = 3.1415927F;

        bodyModel[89].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[89].setRotationPoint(8.0F, -10.0F, -15.0F);

        bodyModel[90].addBox(0.0F, 0.0F, 0.0F, 6, 1, 10, 0.0F);
        bodyModel[90].setRotationPoint(59.0F, -22.0F, 5.0F);
        (bodyModel[90]).rotateAngleY = 3.1415927F;
        (bodyModel[90]).rotateAngleZ = 0.296706F;

        bodyModel[91].addBox(0.0F, 0.0F, 0.0F, 11, 2, 6, 0.0F);
        bodyModel[91].setRotationPoint(-26.0F, -33.0F, -17.0F);

        bodyModel[92].addBox(0.0F, 0.0F, 0.0F, 7, 3, 4, 0.0F);
        bodyModel[92].setRotationPoint(-55.0F, -34.0F, -2.0F);

        bodyModel[93].addBox(0.0F, 0.0F, 0.0F, 12, 1, 3, 0.0F);
        bodyModel[93].setRotationPoint(-52.0F, -32.0F, 15.0F);

        bodyModel[94].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        bodyModel[94].setRotationPoint(-49.0F, -32.0F, 15.5F);
        (bodyModel[94]).rotateAngleY = 0.9599311F;
        (bodyModel[94]).rotateAngleZ = 2.268928F;

        bodyModel[95].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        bodyModel[95].setRotationPoint(-46.0F, -32.0F, 15.5F);
        (bodyModel[95]).rotateAngleY = 0.8726646F;
        (bodyModel[95]).rotateAngleZ = 2.268928F;

        bodyModel[96].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        bodyModel[96].setRotationPoint(-43.0F, -32.0F, 15.5F);
        (bodyModel[96]).rotateAngleY = 0.8726646F;
        (bodyModel[96]).rotateAngleZ = 2.268928F;

        bodyModel[97].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        bodyModel[97].setRotationPoint(-40.0F, -32.0F, 15.5F);
        (bodyModel[97]).rotateAngleY = 0.6108652F;
        (bodyModel[97]).rotateAngleZ = 2.268928F;

        bodyModel[98].addBox(0.0F, 0.0F, 0.0F, 12, 1, 3, 0.0F);
        bodyModel[98].setRotationPoint(-52.0F, -32.0F, -18.0F);

        bodyModel[99].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        bodyModel[99].setRotationPoint(-51.0F, -32.0F, -16.5F);
        (bodyModel[99]).rotateAngleY = -0.9599311F;
        (bodyModel[99]).rotateAngleZ = 2.268928F;

        bodyModel[100].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        bodyModel[100].setRotationPoint(-48.0F, -32.0F, -16.5F);
        (bodyModel[100]).rotateAngleY = -0.8726646F;
        (bodyModel[100]).rotateAngleZ = 2.268928F;

        bodyModel[101].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        bodyModel[101].setRotationPoint(-45.0F, -32.0F, -16.5F);
        (bodyModel[101]).rotateAngleY = -0.8726646F;
        (bodyModel[101]).rotateAngleZ = 2.268928F;

        bodyModel[102].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
        bodyModel[102].setRotationPoint(-42.0F, -32.0F, -16.5F);
        (bodyModel[102]).rotateAngleY = -0.6108652F;
        (bodyModel[102]).rotateAngleZ = 2.268928F;

        bodyModel[103].addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        bodyModel[103].setRotationPoint(11.5F, -37.0F, -0.5F);


        leftFrontWheelModel = new ModelRendererTurbo[2];
        leftFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);
        leftFrontWheelModel[1] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);

        leftFrontWheelModel[0].addShape3D(11.0F, -11.0F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(22.0D, 6.0D, 22, 6), new Coord2D(22.0D, 16.0D, 22, 16), new Coord2D(16.0D, 22.0D, 16, 22), new Coord2D(6.0D, 22.0D, 6, 22), new Coord2D(0.0D, 16.0D, 0, 16), new Coord2D(0.0D, 6.0D, 0, 6) }), 7.0F, 22, 22, 76, 7, 0, new float[] { 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F });
        leftFrontWheelModel[0].setRotationPoint(49.0F, -1.0F, 20.5F);

        leftFrontWheelModel[1].addShape3D(11.0F, -11.0F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(22.0D, 6.0D, 22, 6), new Coord2D(22.0D, 16.0D, 22, 16), new Coord2D(16.0D, 22.0D, 16, 22), new Coord2D(6.0D, 22.0D, 6, 22), new Coord2D(0.0D, 16.0D, 0, 16), new Coord2D(0.0D, 6.0D, 0, 6) }), 7.0F, 22, 22, 76, 7, 0, new float[] { 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F });
        leftFrontWheelModel[1].setRotationPoint(21.0F, -1.0F, 20.5F);


        rightFrontWheelModel = new ModelRendererTurbo[2];
        rightFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);
        rightFrontWheelModel[1] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);

        rightFrontWheelModel[0].addShape3D(11.0F, -11.0F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(22.0D, 6.0D, 22, 6), new Coord2D(22.0D, 16.0D, 22, 16), new Coord2D(16.0D, 22.0D, 16, 22), new Coord2D(6.0D, 22.0D, 6, 22), new Coord2D(0.0D, 16.0D, 0, 16), new Coord2D(0.0D, 6.0D, 0, 6) }), 7.0F, 22, 22, 76, 7, 0, new float[] { 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F });
        rightFrontWheelModel[0].setRotationPoint(49.0F, -1.0F, -20.5F);

        rightFrontWheelModel[1].addShape3D(11.0F, -11.0F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(22.0D, 6.0D, 22, 6), new Coord2D(22.0D, 16.0D, 22, 16), new Coord2D(16.0D, 22.0D, 16, 22), new Coord2D(6.0D, 22.0D, 6, 22), new Coord2D(0.0D, 16.0D, 0, 16), new Coord2D(0.0D, 6.0D, 0, 6) }), 7.0F, 22, 22, 76, 7, 0, new float[] { 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F });
        rightFrontWheelModel[1].setRotationPoint(21.0F, -1.0F, -20.5F);


        leftBackWheelModel = new ModelRendererTurbo[2];
        leftBackWheelModel[0] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);
        leftBackWheelModel[1] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);

        leftBackWheelModel[0].addShape3D(11.0F, -11.0F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(22.0D, 6.0D, 22, 6), new Coord2D(22.0D, 16.0D, 22, 16), new Coord2D(16.0D, 22.0D, 16, 22), new Coord2D(6.0D, 22.0D, 6, 22), new Coord2D(0.0D, 16.0D, 0, 16), new Coord2D(0.0D, 6.0D, 0, 6) }), 7.0F, 22, 22, 76, 7, 0, new float[] { 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F });
        leftBackWheelModel[0].setRotationPoint(-11.0F, -1.0F, 20.5F);

        leftBackWheelModel[1].addShape3D(11.0F, -11.0F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(22.0D, 6.0D, 22, 6), new Coord2D(22.0D, 16.0D, 22, 16), new Coord2D(16.0D, 22.0D, 16, 22), new Coord2D(6.0D, 22.0D, 6, 22), new Coord2D(0.0D, 16.0D, 0, 16), new Coord2D(0.0D, 6.0D, 0, 6) }), 7.0F, 22, 22, 76, 7, 0, new float[] { 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F });
        leftBackWheelModel[1].setRotationPoint(-37.0F, -1.0F, 20.5F);


        rightBackWheelModel = new ModelRendererTurbo[2];
        rightBackWheelModel[0] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);
        rightBackWheelModel[1] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);

        rightBackWheelModel[0].addShape3D(11.0F, -11.0F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(22.0D, 6.0D, 22, 6), new Coord2D(22.0D, 16.0D, 22, 16), new Coord2D(16.0D, 22.0D, 16, 22), new Coord2D(6.0D, 22.0D, 6, 22), new Coord2D(0.0D, 16.0D, 0, 16), new Coord2D(0.0D, 6.0D, 0, 6) }), 7.0F, 22, 22, 76, 7, 0, new float[] { 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F });
        rightBackWheelModel[0].setRotationPoint(-11.0F, -1.0F, -20.5F);

        rightBackWheelModel[1].addShape3D(11.0F, -11.0F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(22.0D, 6.0D, 22, 6), new Coord2D(22.0D, 16.0D, 22, 16), new Coord2D(16.0D, 22.0D, 16, 22), new Coord2D(6.0D, 22.0D, 6, 22), new Coord2D(0.0D, 16.0D, 0, 16), new Coord2D(0.0D, 6.0D, 0, 6) }), 7.0F, 22, 22, 76, 7, 0, new float[] { 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F, 9.0F, 10.0F });
        rightBackWheelModel[1].setRotationPoint(-37.0F, -1.0F, -20.5F);


        bodyDoorOpenModel = new ModelRendererTurbo[2];
        bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 115, 230, textureX, textureY);
        bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 125, 480, textureX, textureY);

        bodyDoorOpenModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 24, 15, 0.0F);
        bodyDoorOpenModel[0].setRotationPoint(27.5F, -26.5F, -7.5F);
        (bodyDoorOpenModel[0]).rotateAngleY = 2.094395F;

        bodyDoorOpenModel[1].addBox(0.0F, 0.0F, 0.0F, 27, 1, 24, 0.0F);
        bodyDoorOpenModel[1].setRotationPoint(-54.0F, 0.0F, -12.0F);
        (bodyDoorOpenModel[1]).rotateAngleZ = -2.7750735F;


        bodyDoorCloseModel = new ModelRendererTurbo[2];
        bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 115, 230, textureX, textureY);
        bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 125, 480, textureX, textureY);

        bodyDoorCloseModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 24, 15, 0.0F);
        bodyDoorCloseModel[0].setRotationPoint(26.5F, -26.5F, -7.5F);

        bodyDoorCloseModel[1].addBox(0.0F, 0.0F, 0.0F, 27, 1, 24, 0.0F);
        bodyDoorCloseModel[1].setRotationPoint(-55.0F, 0.0F, -12.0F);
        (bodyDoorCloseModel[1]).rotateAngleZ = 1.605703F;



        steeringWheelModel = new ModelRendererTurbo[1];
        steeringWheelModel[0] = new ModelRendererTurbo(this, 0, 150, textureX, textureY);

        steeringWheelModel[0].addBox(0.0F, -4.0F, -4.0F, 1, 8, 8, 0.0F);
        steeringWheelModel[0].setRotationPoint(50.0F, -11.0F, -8.0F);
        (steeringWheelModel[0]).rotateAngleZ = -0.1919862F;



        //ModelRendererTurbo[][] HKGMGModel = new ModelRendererTurbo[3][];


        //HKGMGModel[0] = new ModelRendererTurbo[0];


        turretModel = new ModelRendererTurbo[15];
        turretModel[0] = new ModelRendererTurbo(this, 490, 130, textureX, textureY);
        turretModel[1] = new ModelRendererTurbo(this, 504, 137, textureX, textureY);
        turretModel[2] = new ModelRendererTurbo(this, 496, 141, textureX, textureY);
        turretModel[3] = new ModelRendererTurbo(this, 502, 144, textureX, textureY);
        turretModel[4] = new ModelRendererTurbo(this, 483, 139, textureX, textureY);
        turretModel[5] = new ModelRendererTurbo(this, 484, 130, textureX, textureY);
        turretModel[6] = new ModelRendererTurbo(this, 496, 150, textureX, textureY);
        turretModel[7] = new ModelRendererTurbo(this, 484, 155, textureX, textureY);
        turretModel[8] = new ModelRendererTurbo(this, 448, 130, textureX, textureY);
        turretModel[9] = new ModelRendererTurbo(this, 448, 130, textureX, textureY);
        turretModel[10] = new ModelRendererTurbo(this, 463, 130, textureX, textureY);
        turretModel[11] = new ModelRendererTurbo(this, 463, 139, textureX, textureY);
        turretModel[12] = new ModelRendererTurbo(this, 468, 139, textureX, textureY);
        turretModel[13] = new ModelRendererTurbo(this, 463, 139, textureX, textureY);
        turretModel[14] = new ModelRendererTurbo(this, 468, 139, textureX, textureY);

        turretModel[0].addBox(-7.0F, -2.5F, -1.5F, 8, 3, 3, 0.0F);

        turretModel[1].addBox(-3.0F, -2.0F, -2.0F, 3, 2, 1, 0.0F);

        turretModel[2].addShapeBox(1.0F, -1.5F, -0.5F, 7, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);

        turretModel[3].addBox(8.0F, -1.5F, -0.5F, 4, 1, 1, 0.0F);

        turretModel[4].addShapeBox(-6.0F, 0.0F, -4.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F);

        turretModel[5].addBox(-5.5F, -2.0F, 1.0F, 1, 2, 1, 0.0F);

        turretModel[6].addShapeBox(-11.5F, -5.0F, 1.0F, 7, 3, 1, 0.0F, 0.0F, 0.0F, -0.4999F, 0.0F, -2.9999F, -0.4999F, 0.0F, -2.9999F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, -0.4999F, -1.0F, 0.0F, -0.4999F, -1.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F);

        turretModel[7].addBox(-6.0F, -2.9999F, -0.5F, 2, 1, 1, 0.0F);

        turretModel[8].addShapeBox(-6.0F, -4.0F, -0.5F, 2, 30, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -29.0F, 0.0F, 0.0F, -29.0F, 0.0F, -29.0F, 0.0F, 0.0F, -29.0F, 0.0F, 0.0F, -29.0F, -29.0F, 0.0F, -29.0F, -29.0F);

        (turretModel[9]).flip = true;
        turretModel[9].addShapeBox(-6.0F, -4.0F, -0.5F, 2, 30, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -29.0F, 0.0F, 0.0F, -29.0F, 0.0F, -29.0F, 0.0F, 0.0F, -29.0F, 0.0F, 0.0F, -29.0F, -29.0F, 0.0F, -29.0F, -29.0F);

        turretModel[10].addBox(-2.0F, -0.5F, 1.5F, 2, 3, 5, 0.0F);

        turretModel[11].addShapeBox(-0.9F, -1.0F, 2.3F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.0F, -0.1F, -0.1F);

        turretModel[12].addShapeBox(-1.9F, -1.0F, 2.3F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);

        turretModel[13].addShapeBox(-0.9F, -1.8F, 1.3F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0.0F, -0.1F, -0.1F);

        turretModel[14].addShapeBox(-1.9F, -1.8F, 1.3F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);


        for (ModelRendererTurbo gunPart : turretModel)
        {
            gunPart.setRotationPoint(12.0F, -37.0F, 0.0F);
        }


        //HKGMGModel[2] = new ModelRendererTurbo[0];

        //registerGunModel("HKGMG", HKGMGModel);


        translateAll(0, 0, 0);


        flipAll();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for (ModelRendererTurbo value : bodyModel)
        {
            value.render(f5);
        }
        for (ModelRendererTurbo value : turretModel)
        {
            value.render(f5);
        }
        for (ModelRendererTurbo value : bodyDoorCloseModel)
        {
            value.render(f5);
        }
        for (ModelRendererTurbo value : leftFrontWheelModel)
        {
            value.render(f5);
        }
        for (ModelRendererTurbo value : rightFrontWheelModel)
        {
            value.render(f5);
        }
        for (ModelRendererTurbo turbo : leftBackWheelModel)
        {
            turbo.render(f5);
        }
        for (ModelRendererTurbo rendererTurbo : rightBackWheelModel)
        {
            rendererTurbo.render(f5);
        }
        for (ModelRendererTurbo modelRendererTurbo : steeringWheelModel)
        {
            modelRendererTurbo.render(f5);
        }
    }
}
