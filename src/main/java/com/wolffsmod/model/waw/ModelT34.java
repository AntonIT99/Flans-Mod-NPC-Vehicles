package com.wolffsmod.model.waw;

import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.model.ModelFlanVehicle;

public class ModelT34 extends ModelFlanVehicle
{
    public ModelT34()
    {
        int textureX = 512;
        int textureY = 512;

        bodyModel = new ModelRendererTurbo[58];
        bodyModel[0] = new ModelRendererTurbo(this, 0, 242, textureX, textureY);
        bodyModel[1] = new ModelRendererTurbo(this, 70, 242, textureX, textureY);
        bodyModel[2] = new ModelRendererTurbo(this, 70, 242, textureX, textureY);
        bodyModel[3] = new ModelRendererTurbo(this, 70, 242, textureX, textureY);
        bodyModel[4] = new ModelRendererTurbo(this, 70, 242, textureX, textureY);
        bodyModel[5] = new ModelRendererTurbo(this, 70, 242, textureX, textureY);
        bodyModel[6] = new ModelRendererTurbo(this, 30, 242, textureX, textureY);
        bodyModel[7] = new ModelRendererTurbo(this, 0, 242, textureX, textureY);
        bodyModel[8] = new ModelRendererTurbo(this, 70, 242, textureX, textureY);
        bodyModel[9] = new ModelRendererTurbo(this, 70, 242, textureX, textureY);
        bodyModel[10] = new ModelRendererTurbo(this, 70, 242, textureX, textureY);
        bodyModel[11] = new ModelRendererTurbo(this, 70, 242, textureX, textureY);
        bodyModel[12] = new ModelRendererTurbo(this, 70, 242, textureX, textureY);
        bodyModel[13] = new ModelRendererTurbo(this, 30, 242, textureX, textureY);
        bodyModel[14] = new ModelRendererTurbo(this, 88, 490, textureX, textureY);
        bodyModel[15] = new ModelRendererTurbo(this, 68, 489, textureX, textureY);
        bodyModel[16] = new ModelRendererTurbo(this, 19, 488, textureX, textureY);
        bodyModel[17] = new ModelRendererTurbo(this, 39, 489, textureX, textureY);
        bodyModel[18] = new ModelRendererTurbo(this, 185, 503, textureX, textureY);
        bodyModel[19] = new ModelRendererTurbo(this, 0, 488, textureX, textureY);
        bodyModel[20] = new ModelRendererTurbo(this, 141, 503, textureX, textureY);
        bodyModel[21] = new ModelRendererTurbo(this, 0, 503, textureX, textureY);
        bodyModel[22] = new ModelRendererTurbo(this, 108, 490, textureX, textureY);
        bodyModel[23] = new ModelRendererTurbo(this, 88, 490, textureX, textureY);
        bodyModel[24] = new ModelRendererTurbo(this, 68, 489, textureX, textureY);
        bodyModel[25] = new ModelRendererTurbo(this, 19, 488, textureX, textureY);
        bodyModel[26] = new ModelRendererTurbo(this, 39, 489, textureX, textureY);
        bodyModel[27] = new ModelRendererTurbo(this, 185, 503, textureX, textureY);
        bodyModel[28] = new ModelRendererTurbo(this, 0, 488, textureX, textureY);
        bodyModel[29] = new ModelRendererTurbo(this, 141, 503, textureX, textureY);
        bodyModel[30] = new ModelRendererTurbo(this, 0, 503, textureX, textureY);
        bodyModel[31] = new ModelRendererTurbo(this, 108, 490, textureX, textureY);
        bodyModel[32] = new ModelRendererTurbo(this, 0, 114, textureX, textureY);
        bodyModel[33] = new ModelRendererTurbo(this, 0, 150, textureX, textureY);
        bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[36] = new ModelRendererTurbo(this, 118, 261, textureX, textureY);
        bodyModel[37] = new ModelRendererTurbo(this, 118, 242, textureX, textureY);
        bodyModel[38] = new ModelRendererTurbo(this, 246, 225, textureX, textureY);
        bodyModel[39] = new ModelRendererTurbo(this, 246, 240, textureX, textureY);
        bodyModel[40] = new ModelRendererTurbo(this, 246, 191, textureX, textureY);
        bodyModel[41] = new ModelRendererTurbo(this, 246, 207, textureX, textureY);
        bodyModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[43] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[46] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[47] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[48] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[49] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[50] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[51] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
        bodyModel[52] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
        bodyModel[53] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
        bodyModel[54] = new ModelRendererTurbo(this, 44, 400, textureX, textureY);
        bodyModel[55] = new ModelRendererTurbo(this, 44, 400, textureX, textureY);
        bodyModel[56] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        bodyModel[57] = new ModelRendererTurbo(this, 105, 300, textureX, textureY);

        bodyModel[0].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2)}, 4.0F, 8, 8, 26, 4, 0, new float[]{4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 2.0F});
        bodyModel[0].setRotationPoint(36.0F, 4.0F, -18.0F);

        bodyModel[1].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4)}, 4.0F, 13, 13, 41, 4, 0, new float[]{5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 4.0F});
        bodyModel[1].setRotationPoint(27.0F, 9.0F, -18.0F);

        bodyModel[2].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4)}, 4.0F, 13, 13, 41, 4, 0, new float[]{5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 4.0F});
        bodyModel[2].setRotationPoint(13.0F, 9.0F, -18.0F);

        bodyModel[3].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4)}, 4.0F, 13, 13, 41, 4, 0, new float[]{5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 4.0F});
        bodyModel[3].setRotationPoint(-1.0F, 9.0F, -18.0F);

        bodyModel[4].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4)}, 4.0F, 13, 13, 41, 4, 0, new float[]{5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 4.0F});
        bodyModel[4].setRotationPoint(-15.0F, 9.0F, -18.0F);

        bodyModel[5].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4)}, 4.0F, 13, 13, 41, 4, 0, new float[]{5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 4.0F});
        bodyModel[5].setRotationPoint(-29.0F, 9.0F, -18.0F);

        bodyModel[6].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3)}, 4.0F, 11, 11, 36, 4, 0, new float[]{5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 3.0F});
        bodyModel[6].setRotationPoint(-43.0F, 7.0F, -18.0F);

        bodyModel[7].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2)}, 4.0F, 8, 8, 26, 4, 0, new float[]{4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 2.0F});
        bodyModel[7].setRotationPoint(36.0F, 4.0F, 22.0F);

        bodyModel[8].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4)}, 4.0F, 13, 13, 41, 4, 0, new float[]{5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 4.0F});
        bodyModel[8].setRotationPoint(27.0F, 9.0F, 22.0F);

        bodyModel[9].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4)}, 4.0F, 13, 13, 41, 4, 0, new float[]{5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 4.0F});
        bodyModel[9].setRotationPoint(13.0F, 9.0F, 22.0F);

        bodyModel[10].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4)}, 4.0F, 13, 13, 41, 4, 0, new float[]{5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 4.0F});
        bodyModel[10].setRotationPoint(-1.0F, 9.0F, 22.0F);

        bodyModel[11].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4)}, 4.0F, 13, 13, 41, 4, 0, new float[]{5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 4.0F});
        bodyModel[11].setRotationPoint(-15.0F, 9.0F, 22.0F);

        bodyModel[12].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4)}, 4.0F, 13, 13, 41, 4, 0, new float[]{5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 4.0F});
        bodyModel[12].setRotationPoint(-29.0F, 9.0F, 22.0F);

        bodyModel[13].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3)}, 4.0F, 11, 11, 36, 4, 0, new float[]{5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 3.0F});
        bodyModel[13].setRotationPoint(-43.0F, 7.0F, 22.0F);

        bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F);
        bodyModel[14].setRotationPoint(36.0F, -2.0F, -24.0F);

        bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F);
        bodyModel[15].setRotationPoint(37.0F, -2.0F, -24.0F);
        (bodyModel[15]).rotateAngleZ = -2.356194F;

        bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 1, 5, 8, 0.0F);
        bodyModel[16].setRotationPoint(-55.0F, -1.0F, -24.0F);

        bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 5, 1, 8, 0.0F);
        bodyModel[17].setRotationPoint(-55.0F, -1.0F, -24.0F);
        (bodyModel[17]).rotateAngleZ = 0.8377581F;

        bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 85, 1, 8, 0.0F);
        bodyModel[18].setRotationPoint(-51.0F, -5.0F, -24.0F);

        bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 1, 5, 8, 0.0F);
        bodyModel[19].setRotationPoint(-55.0F, 4.0F, -24.0F);
        (bodyModel[19]).rotateAngleZ = 0.8901179F;

        bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 13, 1, 8, 0.0F);
        bodyModel[20].setRotationPoint(-38.0F, 10.0F, -24.0F);
        (bodyModel[20]).rotateAngleZ = 2.949606F;

        bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 61, 1, 8, 0.0F);
        bodyModel[21].setRotationPoint(-38.0F, 9.0F, -24.0F);

        bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 16, 1, 8, 0.0F);
        bodyModel[22].setRotationPoint(37.0F, 2.0F, -24.0F);
        (bodyModel[22]).rotateAngleZ = -2.635447F;

        bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F);
        bodyModel[23].setRotationPoint(36.0F, -2.0F, 16.0F);

        bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 1, 4, 8, 0.0F);
        bodyModel[24].setRotationPoint(37.0F, -2.0F, 16.0F);
        (bodyModel[24]).rotateAngleZ = -2.356194F;

        bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 1, 5, 8, 0.0F);
        bodyModel[25].setRotationPoint(-55.0F, -1.0F, 16.0F);

        bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 5, 1, 8, 0.0F);
        bodyModel[26].setRotationPoint(-55.0F, -1.0F, 16.0F);
        (bodyModel[26]).rotateAngleZ = 0.8377581F;

        bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 85, 1, 8, 0.0F);
        bodyModel[27].setRotationPoint(-51.0F, -5.0F, 16.0F);

        bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 1, 5, 8, 0.0F);
        bodyModel[28].setRotationPoint(-55.0F, 4.0F, 16.0F);
        (bodyModel[28]).rotateAngleZ = 0.8901179F;

        bodyModel[29].addBox(0.0F, 0.0F, 0.0F, 13, 1, 8, 0.0F);
        bodyModel[29].setRotationPoint(-38.0F, 10.0F, 16.0F);
        (bodyModel[29]).rotateAngleZ = 2.949606F;

        bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 61, 1, 8, 0.0F);
        bodyModel[30].setRotationPoint(-38.0F, 9.0F, 16.0F);

        bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 16, 1, 8, 0.0F);
        bodyModel[31].setRotationPoint(37.0F, 2.0F, 16.0F);
        (bodyModel[31]).rotateAngleZ = -2.635447F;

        bodyModel[32].addBox(0.0F, 0.0F, 0.0F, 52, 1, 30, 0.0F);
        bodyModel[32].setRotationPoint(-38.0F, -17.0F, -15.0F);

        bodyModel[33].addBox(0.0F, 0.0F, 0.0F, 67, 1, 30, 0.0F);
        bodyModel[33].setRotationPoint(-43.0F, 2.0F, -15.0F);

        bodyModel[34].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(11.0D, 4.0D, 11, 4), new Coord2D(0.0D, 12.0D, 0, 12)}, 30.0F, 11, 12, 38, 30, 0, new float[]{3.0F, 9.0F, 14.0F, 12.0F});
        (bodyModel[34]).rotateAngleY = 3.1415927F;
        bodyModel[34].setRotationPoint(24.0F, 3.0F, -15.0F);

        bodyModel[35].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(13.0D, 7.0D, 13, 7), new Coord2D(4.0D, 12.0D, 4, 12)}, 30.0F, 13, 12, 38, 30, 0, new float[]{15.0F, 10.0F, 13.0F});
        bodyModel[35].setRotationPoint(-43.0F, 3.0F, 15.0F);

        bodyModel[36].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(37.0D, 0.0D, 37, 0), new Coord2D(44.0D, 13.0D, 44, 13), new Coord2D(0.0D, 13.0D, 0, 13)}, 1.0F, 44, 13, 102, 1, 0, new float[]{30.0F, 15.0F, 44.0F, 13.0F});
        (bodyModel[36]).rotateAngleY = 4.712389F;
        (bodyModel[36]).rotateAngleX = 2.2863815F;
        bodyModel[36].setRotationPoint(-38.0F, -17.0F, -22.0F);

        bodyModel[37].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(37.0D, 0.0D, 37, 0), new Coord2D(44.0D, 13.0D, 44, 13), new Coord2D(0.0D, 13.0D, 0, 13)}, 1.0F, 44, 13, 102, 1, 0, new float[]{30.0F, 15.0F, 44.0F, 13.0F});
        bodyModel[37].setRotationPoint(14.0F, -17.0F, 22.0F);
        (bodyModel[37]).rotateAngleY = 1.5707964F;
        (bodyModel[37]).rotateAngleX = -4.049164F;

        bodyModel[38].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(63.0D, 0.0D, 63, 0), new Coord2D(73.0D, 11.0D, 73, 11), new Coord2D(0.0D, 11.0D, 0, 11)}, 1.0F, 73, 11, 151, 1, 0, new float[]{52.0F, 15.0F, 73.0F, 11.0F});
        bodyModel[38].setRotationPoint(25.0F, -17.0F, -15.0F);
        (bodyModel[38]).rotateAngleX = 2.4347343F;

        bodyModel[39].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(62.0D, 0.0D, 62, 0), new Coord2D(73.0D, 11.0D, 73, 11), new Coord2D(0.0D, 11.0D, 0, 11)}, 1.0F, 73, 11, 151, 1, 0, new float[]{52.0F, 15.0F, 73.0F, 11.0F});
        bodyModel[39].setRotationPoint(-48.0F, -17.0F, 15.0F);
        (bodyModel[39]).rotateAngleX = 2.4347343F;
        (bodyModel[39]).rotateAngleY = 3.1415927F;

        bodyModel[40].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(86.0D, 0.0D, 86, 0), new Coord2D(101.0D, 5.0D, 101, 5), new Coord2D(94.0D, 12.0D, 94, 12), new Coord2D(9.0D, 12.0D, 9, 12), new Coord2D(0.0D, 5.0D, 0, 5)}, 1.0F, 101, 12, 197, 1, 0, new float[]{70.0F, 16.0F, 10.0F, 85.0F, 11.0F, 5.0F});
        bodyModel[40].setRotationPoint(43.0F, 3.0F, -15.0F);

        bodyModel[41].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(86.0D, 0.0D, 86, 0), new Coord2D(101.0D, 5.0D, 101, 5), new Coord2D(94.0D, 12.0D, 94, 12), new Coord2D(9.0D, 12.0D, 9, 12), new Coord2D(0.0D, 5.0D, 0, 5)}, 1.0F, 101, 12, 197, 1, 0, new float[]{70.0F, 16.0F, 10.0F, 85.0F, 11.0F, 5.0F});
        bodyModel[41].setRotationPoint(43.0F, 3.0F, 16.0F);

        bodyModel[42].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(9.0D, 6.0D, 9, 6), new Coord2D(9.0D, 7.0D, 9, 7), new Coord2D(0.0D, 0.0D, 0, 0)}, 8.0F, 9, 7, 23, 8, 0, new float[]{1.0F, 10.0F, 1.0F, 11.0F});
        bodyModel[42].setRotationPoint(43.0F, -2.0F, -16.0F);

        bodyModel[43].addBox(0.0F, 0.0F, 0.0F, 85, 1, 8, 0.0F);
        bodyModel[43].setRotationPoint(-51.0F, -9.0F, -24.0F);

        bodyModel[44].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(7.0D, 6.0D, 7, 6), new Coord2D(7.0D, 7.0D, 7, 7), new Coord2D(0.0D, 0.0D, 0, 0)}, 8.0F, 7, 7, 20, 8, 0, new float[]{1.0F, 8.0F, 1.0F, 10.0F});
        bodyModel[44].setRotationPoint(-58.0F, -2.0F, -24.0F);
        (bodyModel[44]).rotateAngleY = 3.1415927F;

        bodyModel[45].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(9.0D, 6.0D, 9, 6), new Coord2D(9.0D, 7.0D, 9, 7), new Coord2D(0.0D, 0.0D, 0, 0)}, 8.0F, 9, 7, 23, 8, 0, new float[]{1.0F, 10.0F, 1.0F, 11.0F});
        bodyModel[45].setRotationPoint(43.0F, -2.0F, 24.0F);

        bodyModel[46].addBox(0.0F, 0.0F, 0.0F, 85, 1, 8, 0.0F);
        bodyModel[46].setRotationPoint(-51.0F, -9.0F, 16.0F);

        bodyModel[47].addShape3D(0.0F, 0.0F, 0.0F, new Coord2D[]{new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(7.0D, 6.0D, 7, 6), new Coord2D(7.0D, 7.0D, 7, 7), new Coord2D(0.0D, 0.0D, 0, 0)}, 8.0F, 7, 7, 20, 8, 0, new float[]{1.0F, 8.0F, 1.0F, 10.0F});
        bodyModel[47].setRotationPoint(-58.0F, -2.0F, 16.0F);
        (bodyModel[47]).rotateAngleY = 3.1415927F;

        bodyModel[48].addBox(0.0F, 0.0F, 0.0F, 16, 3, 16, 0.0F);
        bodyModel[48].setRotationPoint(-8.0F, -20.0F, -8.0F);

        bodyModel[49].addBox(-51.0F, -1.0F, -18.0F, 5, 5, 8, 0.0F);

        bodyModel[50].addBox(-51.0F, -1.0F, 10.0F, 5, 5, 8, 0.0F);

        bodyModel[51].addBox(-24.0F, -18.0F, -23.0F, 15, 6, 6, 0.0F);

        bodyModel[52].addBox(-40.0F, -18.0F, -23.0F, 15, 6, 6, 0.0F);

        bodyModel[53].addBox(-40.0F, -18.0F, 17.0F, 15, 6, 6, 0.0F);

        bodyModel[54].addBox(-46.0F, -17.0F, -21.0F, 6, 6, 8, 0.0F);

        bodyModel[55].addBox(-46.0F, -17.0F, 13.0F, 6, 6, 8, 0.0F);

        bodyModel[56].addBox(17.0F, -13.0F, -10.0F, 6, 5, 5, 0.0F);

        bodyModel[57].addBox(23.0F, -12.0F, -8.0F, 5, 1, 1, 0.0F);


        turretModel = new ModelRendererTurbo[4];
        turretModel[0] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
        turretModel[1] = new ModelRendererTurbo(this, 67, 200, textureX, textureY);
        turretModel[2] = new ModelRendererTurbo(this, 147, 200, textureX, textureY);
        turretModel[3] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);

        turretModel[0].addTrapezoid(7.0F, -29.0F, -12.0F, 8, 11, 24, 0.0F, -3.0F, 2);

        turretModel[1].addBox(-7.0F, -29.0F, -12.0F, 14, 11, 24, 0.0F);

        turretModel[2].addTrapezoid(-20.0F, -29.0F, -12.0F, 13, 11, 24, 0.0F, -2.0F, 3);

        turretModel[3].addBox(-7.0F, -30.0F, -7.0F, 14, 1, 14, 0.0F);


        barrelModel = new ModelRendererTurbo[3];
        barrelModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        barrelModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
        barrelModel[2] = new ModelRendererTurbo(this, 0, 300, textureX, textureY);


        barrelModel[0].addBox(0.0F, 0.0F, 0.0F, 4, 5, 5, 0.0F);
        barrelModel[0].setRotationPoint(15.0F, -26.0F, -2.5F);

        barrelModel[1].addBox(-4.0F, 0.0F, 0.0F, 4, 5, 5, 0.0F);
        barrelModel[1].setRotationPoint(15.0F, -26.0F, -2.5F);

        barrelModel[2].addTrapezoid(4.0F, 1.0F, 1.0F, 48, 3, 3, 0.0F, -0.5F, 2);
        barrelModel[2].setRotationPoint(15.0F, -26.0F, -2.5F);

        flipAll();
    }
}
