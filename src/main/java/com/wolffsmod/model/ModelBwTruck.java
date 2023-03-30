package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.entity.Entity;

public class ModelBwTruck extends ModelVehicle
{
    int textureX = 512;
    int textureY = 512;


    public ModelBwTruck()
    {
        bodyModel = new ModelRendererTurbo[97];
        bodyModel[0] = new ModelRendererTurbo(this, 410, 450, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 90, 450, textureX, textureY);
        bodyModel[2] = new ModelRendererTurbo(this, 180, 450, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
        bodyModel[4] = new ModelRendererTurbo(this, 180, 490, textureX, textureY);
        bodyModel[5] = new ModelRendererTurbo(this, 230, 490, textureX, textureY);
        bodyModel[6] = new ModelRendererTurbo(this, 250, 490, textureX, textureY);
        bodyModel[7] = new ModelRendererTurbo(this, 300, 490, textureX, textureY);
        bodyModel[8] = new ModelRendererTurbo(this, 300, 450, textureX, textureY);
        bodyModel[9] = new ModelRendererTurbo(this, 80, 380, textureX, textureY);
        bodyModel[10] = new ModelRendererTurbo(this, 80, 400, textureX, textureY);
        bodyModel[11] = new ModelRendererTurbo(this, 80, 380, textureX, textureY);
        bodyModel[12] = new ModelRendererTurbo(this, 80, 400, textureX, textureY);
        bodyModel[13] = new ModelRendererTurbo(this, 140, 380, textureX, textureY);
        bodyModel[14] = new ModelRendererTurbo(this, 235, 380, textureX, textureY);
        bodyModel[15] = new ModelRendererTurbo(this, 320, 380, textureX, textureY);
        bodyModel[16] = new ModelRendererTurbo(this, 320, 410, textureX, textureY);
        bodyModel[17] = new ModelRendererTurbo(this, 380, 410, textureX, textureY);
        bodyModel[18] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
        bodyModel[19] = new ModelRendererTurbo(this, 0, 465, textureX, textureY);
        bodyModel[20] = new ModelRendererTurbo(this, 50, 450, textureX, textureY);
        bodyModel[21] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
        bodyModel[22] = new ModelRendererTurbo(this, 0, 490, textureX, textureY);
        bodyModel[23] = new ModelRendererTurbo(this, 235, 428, textureX, textureY);
        bodyModel[24] = new ModelRendererTurbo(this, 180, 428, textureX, textureY);
        bodyModel[25] = new ModelRendererTurbo(this, 0, 340, textureX, textureY);
        bodyModel[26] = new ModelRendererTurbo(this, 260, 340, textureX, textureY);
        bodyModel[27] = new ModelRendererTurbo(this, 0, 340, textureX, textureY);
        bodyModel[28] = new ModelRendererTurbo(this, 260, 340, textureX, textureY);
        bodyModel[29] = new ModelRendererTurbo(this, 70, 340, textureX, textureY);
        bodyModel[30] = new ModelRendererTurbo(this, 60, 350, textureX, textureY);
        bodyModel[31] = new ModelRendererTurbo(this, 70, 360, textureX, textureY);
        bodyModel[32] = new ModelRendererTurbo(this, 70, 340, textureX, textureY);
        bodyModel[33] = new ModelRendererTurbo(this, 60, 350, textureX, textureY);
        bodyModel[34] = new ModelRendererTurbo(this, 70, 360, textureX, textureY);
        bodyModel[35] = new ModelRendererTurbo(this, 100, 340, textureX, textureY);
        bodyModel[36] = new ModelRendererTurbo(this, 100, 355, textureX, textureY);
        bodyModel[37] = new ModelRendererTurbo(this, 145, 340, textureX, textureY);
        bodyModel[38] = new ModelRendererTurbo(this, 145, 360, textureX, textureY);
        bodyModel[39] = new ModelRendererTurbo(this, 100, 340, textureX, textureY);
        bodyModel[40] = new ModelRendererTurbo(this, 100, 355, textureX, textureY);
        bodyModel[41] = new ModelRendererTurbo(this, 145, 340, textureX, textureY);
        bodyModel[42] = new ModelRendererTurbo(this, 145, 360, textureX, textureY);
        bodyModel[43] = new ModelRendererTurbo(this, 170, 330, textureX, textureY);
        bodyModel[44] = new ModelRendererTurbo(this, 80, 440, textureX, textureY);
        bodyModel[45] = new ModelRendererTurbo(this, 100, 435, textureX, textureY);
        bodyModel[46] = new ModelRendererTurbo(this, 90, 440, textureX, textureY);
        bodyModel[47] = new ModelRendererTurbo(this, 115, 435, textureX, textureY);
        bodyModel[48] = new ModelRendererTurbo(this, 0, 300, textureX, textureY);
        bodyModel[49] = new ModelRendererTurbo(this, 50, 295, textureX, textureY);
        bodyModel[50] = new ModelRendererTurbo(this, 100, 290, textureX, textureY);
        bodyModel[51] = new ModelRendererTurbo(this, 150, 285, textureX, textureY);
        bodyModel[52] = new ModelRendererTurbo(this, 240, 305, textureX, textureY);
        bodyModel[53] = new ModelRendererTurbo(this, 0, 250, textureX, textureY);
        bodyModel[54] = new ModelRendererTurbo(this, 30, 250, textureX, textureY);
        bodyModel[55] = new ModelRendererTurbo(this, 0, 280, textureX, textureY);
        bodyModel[56] = new ModelRendererTurbo(this, 10, 280, textureX, textureY);
        bodyModel[57] = new ModelRendererTurbo(this, 65, 250, textureX, textureY);
        bodyModel[58] = new ModelRendererTurbo(this, 65, 265, textureX, textureY);
        bodyModel[59] = new ModelRendererTurbo(this, 110, 250, textureX, textureY);
        bodyModel[60] = new ModelRendererTurbo(this, 145, 250, textureX, textureY);
        bodyModel[61] = new ModelRendererTurbo(this, 110, 270, textureX, textureY);
        bodyModel[62] = new ModelRendererTurbo(this, 145, 270, textureX, textureY);
        bodyModel[63] = new ModelRendererTurbo(this, 180, 250, textureX, textureY);
        bodyModel[64] = new ModelRendererTurbo(this, 190, 250, textureX, textureY);
        bodyModel[65] = new ModelRendererTurbo(this, 190, 255, textureX, textureY);
        bodyModel[66] = new ModelRendererTurbo(this, 180, 270, textureX, textureY);
        bodyModel[67] = new ModelRendererTurbo(this, 190, 270, textureX, textureY);
        bodyModel[68] = new ModelRendererTurbo(this, 190, 275, textureX, textureY);
        bodyModel[69] = new ModelRendererTurbo(this, 0, 195, textureX, textureY);
        bodyModel[70] = new ModelRendererTurbo(this, 80, 195, textureX, textureY);
        bodyModel[71] = new ModelRendererTurbo(this, 300, 195, textureX, textureY);
        bodyModel[72] = new ModelRendererTurbo(this, 300, 215, textureX, textureY);
        bodyModel[73] = new ModelRendererTurbo(this, 240, 250, textureX, textureY);
        bodyModel[74] = new ModelRendererTurbo(this, 250, 250, textureX, textureY);
        bodyModel[75] = new ModelRendererTurbo(this, 270, 250, textureX, textureY);
        bodyModel[76] = new ModelRendererTurbo(this, 255, 250, textureX, textureY);
        bodyModel[77] = new ModelRendererTurbo(this, 0, 160, textureX, textureY);
        bodyModel[78] = new ModelRendererTurbo(this, 140, 160, textureX, textureY);
        bodyModel[79] = new ModelRendererTurbo(this, 300, 160, textureX, textureY);
        bodyModel[80] = new ModelRendererTurbo(this, 140, 175, textureX, textureY);
        bodyModel[81] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
        bodyModel[82] = new ModelRendererTurbo(this, 0, 100, textureX, textureY);
        bodyModel[83] = new ModelRendererTurbo(this, 25, 100, textureX, textureY);
        bodyModel[84] = new ModelRendererTurbo(this, 65, 100, textureX, textureY);
        bodyModel[85] = new ModelRendererTurbo(this, 90, 100, textureX, textureY);
        bodyModel[86] = new ModelRendererTurbo(this, 100, 100, textureX, textureY);
        bodyModel[87] = new ModelRendererTurbo(this, 125, 100, textureX, textureY);
        bodyModel[88] = new ModelRendererTurbo(this, 125, 125, textureX, textureY);
        bodyModel[89] = new ModelRendererTurbo(this, 150, 100, textureX, textureY);
        bodyModel[90] = new ModelRendererTurbo(this, 0, 80, textureX, textureY);
        bodyModel[91] = new ModelRendererTurbo(this, 125, 80, textureX, textureY);
        bodyModel[92] = new ModelRendererTurbo(this, 0, 55, textureX, textureY);
        bodyModel[93] = new ModelRendererTurbo(this, 150, 55, textureX, textureY);
        bodyModel[94] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[95] = new ModelRendererTurbo(this, 0, 20, textureX, textureY);
        bodyModel[96] = new ModelRendererTurbo(this, 60, 0, textureX, textureY);

        bodyModel[0].addBox(0.0F, 0.0F, 0.0F, 6, 5, 38, 0.0F);
        bodyModel[0].setRotationPoint(40.0F, -4.0F, -19.0F);

        bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 5, 22, 36, 0.0F);
        bodyModel[1].setRotationPoint(40.0F, -22.0F, -18.0F);

        bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 22, 2, 36, 0.0F);
        bodyModel[2].setRotationPoint(18.0F, -11.0F, -18.0F);

        bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 1, 28, 36, 0.0F);
        bodyModel[3].setRotationPoint(17.0F, -37.0F, -18.0F);

        bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 22, 11, 1, 0.0F);
        bodyModel[4].setRotationPoint(18.0F, -22.0F, 17.0F);

        bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 7, 15, 1, 0.0F);
        bodyModel[5].setRotationPoint(18.0F, -37.0F, 17.0F);

        bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 22, 11, 1, 0.0F);
        bodyModel[6].setRotationPoint(18.0F, -22.0F, -18.0F);

        bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 7, 15, 1, 0.0F);
        bodyModel[7].setRotationPoint(18.0F, -37.0F, -18.0F);

        bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 17, 2, 36, 0.0F);
        bodyModel[8].setRotationPoint(17.0F, -39.0F, -18.0F);

        bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 14, 1, 14, 0.0F);
        bodyModel[9].setRotationPoint(23.0F, -12.0F, 2.0F);

        bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 2, 18, 14, 0.0F);
        bodyModel[10].setRotationPoint(20.0F, -28.0F, 2.0F);
        (bodyModel[10]).rotateAngleZ = 0.1745329F;

        bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 14, 1, 14, 0.0F);
        bodyModel[11].setRotationPoint(23.0F, -12.0F, -15.0F);

        bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 2, 18, 14, 0.0F);
        bodyModel[12].setRotationPoint(20.0F, -28.0F, -15.0F);
        (bodyModel[12]).rotateAngleZ = 0.1745329F;

        bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 10, 9, 36, 0.0F);
        bodyModel[13].setRotationPoint(30.0F, -9.0F, -18.0F);

        bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 13, 8, 28, 0.0F);
        bodyModel[14].setRotationPoint(17.0F, -9.0F, -14.0F);

        bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 44, 6, 16, 0.0F);
        bodyModel[15].setRotationPoint(-27.0F, -7.0F, -8.0F);

        bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 6, 6, 18, 0.0F);
        bodyModel[16].setRotationPoint(-33.0F, -7.0F, -9.0F);

        bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 19, 6, 16, 0.0F);
        bodyModel[17].setRotationPoint(-52.0F, -7.0F, -8.0F);

        bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 10, 2, 10, 0.0F);
        bodyModel[18].setRotationPoint(20.0F, -40.0F, -14.0F);

        bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 11, 4, 1, 0.0F);
        bodyModel[19].setRotationPoint(20.0F, -42.0F, -4.0F);

        bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
        bodyModel[20].setRotationPoint(30.0F, -42.0F, -14.0F);

        bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 11, 4, 1, 0.0F);
        bodyModel[21].setRotationPoint(20.0F, -42.0F, -15.0F);

        bodyModel[22].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 6.0F, 16, 16, 56, 6, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
        bodyModel[22].setRotationPoint(11.0F, -20.0F, -2.0F);
        (bodyModel[22]).rotateAngleY = 1.5707964F;

        bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 6, 1, 19, 0.0F);
        bodyModel[23].setRotationPoint(11.0F, -10.0F, -18.0F);
        (bodyModel[23]).rotateAngleX = 0.7853982F;

        bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 6, 1, 16, 0.0F);
        bodyModel[24].setRotationPoint(11.0F, -10.0F, -18.0F);

        bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 2, 2, 28, 0.0F);
        bodyModel[25].setRotationPoint(19.0F, 1.0F, -14.0F);

        bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 8, 3, 16, 0.0F);
        bodyModel[26].setRotationPoint(16.0F, -1.0F, -8.0F);

        bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 2, 2, 28, 0.0F);
        bodyModel[27].setRotationPoint(-32.0F, 1.0F, -14.0F);

        bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 8, 3, 16, 0.0F);
        bodyModel[28].setRotationPoint(-35.0F, -1.0F, -8.0F);

        bodyModel[29].addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        bodyModel[29].setRotationPoint(26.0F, -8.0F, 14.0F);
        (bodyModel[29]).rotateAngleZ = -0.8552113F;

        bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 12, 1, 6, 0.0F);
        bodyModel[30].setRotationPoint(14.0F, -8.0F, 14.0F);

        bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
        bodyModel[31].setRotationPoint(14.0F, -8.0F, 14.0F);
        (bodyModel[31]).rotateAngleZ = -0.715585F;

        bodyModel[32].addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
        bodyModel[32].setRotationPoint(26.0F, -8.0F, -20.0F);
        (bodyModel[32]).rotateAngleZ = -0.8552113F;

        bodyModel[33].addBox(0.0F, 0.0F, 0.0F, 12, 1, 6, 0.0F);
        bodyModel[33].setRotationPoint(14.0F, -8.0F, -20.0F);

        bodyModel[34].addBox(0.0F, 0.0F, 0.0F, 1, 6, 6, 0.0F);
        bodyModel[34].setRotationPoint(14.0F, -8.0F, -20.0F);
        (bodyModel[34]).rotateAngleZ = -0.715585F;

        bodyModel[35].addBox(0.0F, 0.0F, 0.0F, 6, 1, 11, 0.0F);
        bodyModel[35].setRotationPoint(-25.0F, -8.0F, 9.0F);
        (bodyModel[35]).rotateAngleZ = -0.8552113F;

        bodyModel[36].addBox(0.0F, 0.0F, 0.0F, 12, 1, 9, 0.0F);
        bodyModel[36].setRotationPoint(-37.0F, -8.0F, 11.0F);

        bodyModel[37].addBox(0.0F, 0.0F, 0.0F, 1, 6, 10, 0.0F);
        bodyModel[37].setRotationPoint(-37.0F, -8.0F, 10.0F);
        (bodyModel[37]).rotateAngleZ = -0.715585F;

        bodyModel[38].addBox(0.0F, 0.0F, 0.0F, 8, 7, 1, 0.0F);
        bodyModel[38].setRotationPoint(-34.0F, -8.0F, 9.0F);

        bodyModel[39].addBox(0.0F, 0.0F, 0.0F, 6, 1, 11, 0.0F);
        bodyModel[39].setRotationPoint(-25.0F, -8.0F, -20.0F);
        (bodyModel[39]).rotateAngleZ = -0.8552113F;

        bodyModel[40].addBox(0.0F, 0.0F, 0.0F, 12, 1, 10, 0.0F);
        bodyModel[40].setRotationPoint(-37.0F, -8.0F, -20.0F);

        bodyModel[41].addBox(0.0F, 0.0F, 0.0F, 1, 6, 11, 0.0F);
        bodyModel[41].setRotationPoint(-37.0F, -8.0F, -20.0F);
        (bodyModel[41]).rotateAngleZ = -0.715585F;

        bodyModel[42].addBox(0.0F, 0.0F, 0.0F, 8, 7, 1, 0.0F);
        bodyModel[42].setRotationPoint(-34.0F, -8.0F, -10.0F);

        bodyModel[43].addBox(0.0F, 0.0F, 0.0F, 4, 5, 38, 0.0F);
        bodyModel[43].setRotationPoint(-54.0F, -5.0F, -19.0F);

        bodyModel[44].addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        bodyModel[44].setRotationPoint(39.0F, -29.0F, 18.0F);

        bodyModel[45].addBox(0.0F, 0.0F, 0.0F, 1, 10, 4, 0.0F);
        bodyModel[45].setRotationPoint(38.0F, -33.0F, 19.0F);

        bodyModel[46].addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
        bodyModel[46].setRotationPoint(39.0F, -29.0F, -21.0F);

        bodyModel[47].addBox(0.0F, 0.0F, 0.0F, 1, 10, 4, 0.0F);
        bodyModel[47].setRotationPoint(38.0F, -33.0F, -23.0F);

        bodyModel[48].addBox(0.0F, 0.0F, 0.0F, 4, 2, 36, 0.0F);
        bodyModel[48].setRotationPoint(-52.0F, -9.0F, -18.0F);

        bodyModel[49].addBox(0.0F, 0.0F, 0.0F, 4, 2, 36, 0.0F);
        bodyModel[49].setRotationPoint(-43.0F, -9.0F, -18.0F);

        bodyModel[50].addBox(0.0F, 0.0F, 0.0F, 4, 2, 36, 0.0F);
        bodyModel[50].setRotationPoint(-23.0F, -9.0F, -18.0F);

        bodyModel[51].addBox(0.0F, 0.0F, 0.0F, 4, 2, 36, 0.0F);
        bodyModel[51].setRotationPoint(6.0F, -9.0F, -18.0F);

        bodyModel[52].addBox(0.0F, 0.0F, 0.0F, 65, 2, 16, 0.0F);
        bodyModel[52].setRotationPoint(-48.0F, -9.0F, -8.0F);

        bodyModel[53].addBox(0.0F, 0.0F, 0.0F, 5, 12, 16, 0.0F);
        bodyModel[53].setRotationPoint(11.0F, -21.0F, 3.0F);

        bodyModel[54].addBox(0.0F, 0.0F, 0.0F, 5, 3, 11, 0.0F);
        bodyModel[54].setRotationPoint(11.0F, -24.0F, 3.0F);

        bodyModel[55].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
        bodyModel[55].setRotationPoint(13.0F, -24.0F, 15.0F);

        bodyModel[56].addBox(0.0F, 0.0F, 0.0F, 5, 4, 12, 0.0F);
        bodyModel[56].setRotationPoint(11.0F, -28.0F, 5.0F);

        bodyModel[57].addBox(0.0F, 0.0F, 0.0F, 14, 6, 5, 0.0F);
        bodyModel[57].setRotationPoint(-5.0F, -7.0F, 13.0F);

        bodyModel[58].addBox(0.0F, 0.0F, 0.0F, 14, 6, 5, 0.0F);
        bodyModel[58].setRotationPoint(-5.0F, -7.0F, -18.0F);

        bodyModel[59].addBox(0.0F, 0.0F, 0.0F, 11, 8, 5, 0.0F);
        bodyModel[59].setRotationPoint(-21.0F, -7.0F, -18.0F);

        bodyModel[60].addBox(0.0F, 0.0F, 0.0F, 9, 8, 5, 0.0F);
        bodyModel[60].setRotationPoint(-50.0F, -7.0F, -18.0F);

        bodyModel[61].addBox(0.0F, 0.0F, 0.0F, 11, 8, 5, 0.0F);
        bodyModel[61].setRotationPoint(-21.0F, -7.0F, 13.0F);

        bodyModel[62].addBox(0.0F, 0.0F, 0.0F, 9, 8, 5, 0.0F);
        bodyModel[62].setRotationPoint(-50.0F, -7.0F, 13.0F);

        bodyModel[63].addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
        bodyModel[63].setRotationPoint(9.0F, -7.0F, 16.0F);

        bodyModel[64].addBox(0.0F, 0.0F, 0.0F, 20, 2, 1, 0.0F);
        bodyModel[64].setRotationPoint(-10.0F, -5.0F, 17.5F);

        bodyModel[65].addBox(0.0F, 0.0F, 0.0F, 20, 2, 1, 0.0F);
        bodyModel[65].setRotationPoint(-10.0F, 0.0F, 17.5F);

        bodyModel[66].addBox(0.0F, 0.0F, 0.0F, 1, 8, 2, 0.0F);
        bodyModel[66].setRotationPoint(9.0F, -7.0F, -18.0F);

        bodyModel[67].addBox(0.0F, 0.0F, 0.0F, 20, 2, 1, 0.0F);
        bodyModel[67].setRotationPoint(-10.0F, -5.0F, -18.5F);

        bodyModel[68].addBox(0.0F, 0.0F, 0.0F, 20, 2, 1, 0.0F);
        bodyModel[68].setRotationPoint(-10.0F, 0.0F, -18.5F);

        bodyModel[69].addBox(0.0F, 0.0F, 0.0F, 2, 13, 36, 0.0F);
        bodyModel[69].setRotationPoint(8.0F, -23.0F, -18.0F);

        bodyModel[70].addBox(0.0F, 0.0F, 0.0F, 66, 1, 40, 0.0F);
        bodyModel[70].setRotationPoint(-56.0F, -10.0F, -20.0F);

        bodyModel[71].addBox(0.0F, 0.0F, 0.0F, 66, 13, 2, 0.0F);
        bodyModel[71].setRotationPoint(-56.0F, -23.0F, 18.0F);

        bodyModel[72].addBox(0.0F, 0.0F, 0.0F, 66, 13, 2, 0.0F);
        bodyModel[72].setRotationPoint(-56.0F, -23.0F, -20.0F);

        bodyModel[73].addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
        bodyModel[73].setRotationPoint(-55.0F, -6.0F, -1.5F);

        bodyModel[74].addBox(0.0F, 0.0F, 0.0F, 1, 8, 6, 0.0F);
        bodyModel[74].setRotationPoint(-56.0F, -9.0F, 10.0F);

        bodyModel[75].addBox(0.0F, 0.0F, 0.0F, 1, 8, 6, 0.0F);
        bodyModel[75].setRotationPoint(-56.0F, -9.0F, -16.0F);

        bodyModel[76].addBox(0.0F, 0.0F, 0.0F, 1, 13, 38, 0.0F);
        bodyModel[76].setRotationPoint(-57.0F, -23.0F, -19.0F);

        bodyModel[77].addBox(0.0F, 0.0F, 0.0F, 66, 17, 1, 0.0F);
        bodyModel[77].setRotationPoint(-56.0F, -40.0F, 18.5F);

        bodyModel[78].addBox(0.0F, 0.0F, 0.0F, 66, 1, 10, 0.0F);
        bodyModel[78].setRotationPoint(-56.0F, -41.0F, 8.5F);

        bodyModel[79].addBox(0.0F, 0.0F, 0.0F, 66, 1, 17, 0.0F);
        bodyModel[79].setRotationPoint(-56.0F, -42.0F, -8.5F);

        bodyModel[80].addBox(0.0F, 0.0F, 0.0F, 66, 1, 10, 0.0F);
        bodyModel[80].setRotationPoint(-56.0F, -41.0F, -18.5F);

        bodyModel[81].addBox(0.0F, 0.0F, 0.0F, 66, 17, 1, 0.0F);
        bodyModel[81].setRotationPoint(-56.0F, -40.0F, -19.5F);

        bodyModel[82].addBox(0.0F, 0.0F, 0.0F, 1, 17, 10, 0.0F);
        bodyModel[82].setRotationPoint(9.0F, -40.0F, 8.5F);

        bodyModel[83].addBox(0.0F, 0.0F, 0.0F, 1, 18, 17, 0.0F);
        bodyModel[83].setRotationPoint(9.0F, -41.0F, -8.5F);

        bodyModel[84].addBox(0.0F, 0.0F, 0.0F, 1, 17, 10, 0.0F);
        bodyModel[84].setRotationPoint(9.0F, -40.0F, -18.5F);

        bodyModel[85].addBox(0.0F, 0.0F, 0.0F, 1, 14, 2, 0.0F);
        bodyModel[85].setRotationPoint(-56.0F, -37.0F, 16.5F);

        bodyModel[86].addBox(0.0F, 0.0F, 0.0F, 1, 3, 17, 0.0F);
        bodyModel[86].setRotationPoint(-56.0F, -41.0F, -8.5F);

        bodyModel[87].addBox(0.0F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        bodyModel[87].setRotationPoint(-56.0F, -40.0F, 8.5F);

        bodyModel[88].addBox(0.0F, 0.0F, 0.0F, 1, 3, 10, 0.0F);
        bodyModel[88].setRotationPoint(-56.0F, -40.0F, -18.5F);

        bodyModel[89].addBox(0.0F, 0.0F, 0.0F, 1, 14, 2, 0.0F);
        bodyModel[89].setRotationPoint(-56.0F, -37.0F, -18.5F);

        bodyModel[90].addBox(0.0F, 0.0F, 0.0F, 60, 6, 1, 0.0F);
        bodyModel[90].setRotationPoint(-54.0F, -16.0F, 7.0F);

        bodyModel[91].addBox(0.0F, 0.0F, 0.0F, 60, 6, 1, 0.0F);
        bodyModel[91].setRotationPoint(-54.0F, -16.0F, -8.0F);

        bodyModel[92].addBox(0.0F, 0.0F, 0.0F, 60, 1, 20, 0.0F);
        bodyModel[92].setRotationPoint(-54.0F, -17.0F, -10.0F);

        bodyModel[93].addTrapezoid(0.0F, 0.0F, 0.0F, 60, 10, 4, 0.0F, -1.0F, 4);
        bodyModel[93].setRotationPoint(-54.0F, -27.0F, -2.0F);

        bodyModel[94].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 15.0D, 11, 15), new Coord2D(11.0D, 17.0D, 11, 17), new Coord2D(8.0D, 17.0D, 8, 17), new Coord2D(5.0D, 14.0D, 5, 14) }), 1.0F, 11, 17, 47, 1, 0, new float[] { 15.0F, 5.0F, 3.0F, 2.0F, 17.0F, 5.0F });
        bodyModel[94].setRotationPoint(45.0F, -22.0F, -17.0F);

        bodyModel[95].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 15.0D, 11, 15), new Coord2D(11.0D, 17.0D, 11, 17), new Coord2D(8.0D, 17.0D, 8, 17), new Coord2D(5.0D, 14.0D, 5, 14) }), 1.0F, 11, 17, 47, 1, 0, new float[] { 15.0F, 5.0F, 3.0F, 2.0F, 17.0F, 5.0F });
        bodyModel[95].setRotationPoint(45.0F, -22.0F, 18.0F);

        bodyModel[96].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(6.0D, 1.0D, 6, 1), new Coord2D(6.0D, 3.0D, 6, 3), new Coord2D(3.0D, 3.0D, 3, 3) }), 34.0F, 6, 3, 17, 34, 0, new float[] { 5.0F, 3.0F, 2.0F, 7.0F });
        bodyModel[96].setRotationPoint(40.0F, -36.0F, 17.0F);


        leftFrontWheelModel = new ModelRendererTurbo[1];
        leftFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 490, textureX, textureY);

        leftFrontWheelModel[0].addShape3D(8.0F, -8.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 6.0F, 16, 16, 56, 6, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
        leftFrontWheelModel[0].setRotationPoint(20.0F, 2.0F, 17.0F);


        rightFrontWheelModel = new ModelRendererTurbo[1];
        rightFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 490, textureX, textureY);

        rightFrontWheelModel[0].addShape3D(8.0F, -8.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 6.0F, 16, 16, 56, 6, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
        rightFrontWheelModel[0].setRotationPoint(20.0F, 2.0F, -17.0F);



        leftBackWheelModel = new ModelRendererTurbo[1];
        leftBackWheelModel[0] = new ModelRendererTurbo(this, 0, 490, textureX, textureY);

        leftBackWheelModel[0].addShape3D(8.0F, -8.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 6.0F, 16, 16, 56, 6, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
        leftBackWheelModel[0].setRotationPoint(-31.0F, 2.0F, 17.0F);


        rightBackWheelModel = new ModelRendererTurbo[1];
        rightBackWheelModel[0] = new ModelRendererTurbo(this, 0, 490, textureX, textureY);

        rightBackWheelModel[0].addShape3D(8.0F, -8.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 6.0F, 16, 16, 56, 6, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
        rightBackWheelModel[0].setRotationPoint(-31.0F, 2.0F, -17.0F);



        steeringWheelModel = new ModelRendererTurbo[1];
        steeringWheelModel[0] = new ModelRendererTurbo(this, 100, 0, textureX, textureY);

        steeringWheelModel[0].addBox(0.0F, -4.0F, -4.0F, 1, 8, 8, 0.0F);
        steeringWheelModel[0].setRotationPoint(39.0F, -21.0F, 9.0F);
        (steeringWheelModel[0]).rotateAngleZ = -0.1919862F;


        translateAll(-16, 0, 0);


        flipAll();
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
    {
        for (ModelRendererTurbo modelRendererTurbo1 : bodyModel)
        {
            modelRendererTurbo1.render(f5);
        }
        for (ModelRendererTurbo element : turretModel)
        {
            element.render(f5);
        }
        for (ModelRendererTurbo item : barrelModel)
        {
            item.render(f5);
        }
        for (ModelRendererTurbo value : leftFrontWheelModel)
        {
            value.render(f5);
        }
        for (ModelRendererTurbo turbo : rightFrontWheelModel)
        {
            turbo.render(f5);
        }
        for (ModelRendererTurbo rendererTurbo : leftBackWheelModel)
        {
            rendererTurbo.render(f5);
        }
        for (ModelRendererTurbo modelRendererTurbo : rightBackWheelModel)
        {
            modelRendererTurbo.render(f5);
        }
        for (ModelRendererTurbo modelRendererTurbo : steeringWheelModel)
        {
            modelRendererTurbo.render(f5);
        }
    }
}
