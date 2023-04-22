package com.wolffsmod.model.kikkoceccato;

import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import com.wolffsmod.model.ModelFlanVehicle;

import net.minecraft.client.model.ModelBase;

public class ModelPanzerI extends ModelFlanVehicle
{
    int textureX = 512;
    int textureY = 512;


    public ModelPanzerI()
    {
        this.bodyModel = new ModelRendererTurbo[91];
        this.bodyModel[0] = new ModelRendererTurbo((ModelBase) this, 242, 421, this.textureX, this.textureY);
        this.bodyModel[1] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[2] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[3] = new ModelRendererTurbo((ModelBase) this, 68, 45, this.textureX, this.textureY);
        this.bodyModel[4] = new ModelRendererTurbo((ModelBase) this, 4, 195, this.textureX, this.textureY);
        this.bodyModel[5] = new ModelRendererTurbo((ModelBase) this, 68, 22, this.textureX, this.textureY);
        this.bodyModel[6] = new ModelRendererTurbo((ModelBase) this, 68, 44, this.textureX, this.textureY);
        this.bodyModel[7] = new ModelRendererTurbo((ModelBase) this, 4, 195, this.textureX, this.textureY);
        this.bodyModel[8] = new ModelRendererTurbo((ModelBase) this, 68, 22, this.textureX, this.textureY);
        this.bodyModel[9] = new ModelRendererTurbo((ModelBase) this, 57, 21, this.textureX, this.textureY);
        this.bodyModel[10] = new ModelRendererTurbo((ModelBase) this, 109, 62, this.textureX, this.textureY);
        this.bodyModel[11] = new ModelRendererTurbo((ModelBase) this, 3, 96, this.textureX, this.textureY);
        this.bodyModel[12] = new ModelRendererTurbo((ModelBase) this, 5, 235, this.textureX, this.textureY);
        this.bodyModel[13] = new ModelRendererTurbo((ModelBase) this, 38, 148, this.textureX, this.textureY);
        this.bodyModel[14] = new ModelRendererTurbo((ModelBase) this, 38, 148, this.textureX, this.textureY);
        this.bodyModel[15] = new ModelRendererTurbo((ModelBase) this, 5, 235, this.textureX, this.textureY);
        this.bodyModel[16] = new ModelRendererTurbo((ModelBase) this, 9, 175, this.textureX, this.textureY);
        this.bodyModel[17] = new ModelRendererTurbo((ModelBase) this, 173, 28, this.textureX, this.textureY);
        this.bodyModel[18] = new ModelRendererTurbo((ModelBase) this, 129, 122, this.textureX, this.textureY);
        this.bodyModel[19] = new ModelRendererTurbo((ModelBase) this, 22, 269, this.textureX, this.textureY);
        this.bodyModel[20] = new ModelRendererTurbo((ModelBase) this, 172, 28, this.textureX, this.textureY);
        this.bodyModel[21] = new ModelRendererTurbo((ModelBase) this, 129, 122, this.textureX, this.textureY);
        this.bodyModel[22] = new ModelRendererTurbo((ModelBase) this, 23, 270, this.textureX, this.textureY);
        this.bodyModel[23] = new ModelRendererTurbo((ModelBase) this, 249, 21, this.textureX, this.textureY);
        this.bodyModel[24] = new ModelRendererTurbo((ModelBase) this, 296, 316, this.textureX, this.textureY);
        this.bodyModel[25] = new ModelRendererTurbo((ModelBase) this, 12, 91, this.textureX, this.textureY);
        this.bodyModel[26] = new ModelRendererTurbo((ModelBase) this, 12, 102, this.textureX, this.textureY);
        this.bodyModel[27] = new ModelRendererTurbo((ModelBase) this, 14, 112, this.textureX, this.textureY);
        this.bodyModel[28] = new ModelRendererTurbo((ModelBase) this, 10, 120, this.textureX, this.textureY);
        this.bodyModel[29] = new ModelRendererTurbo((ModelBase) this, 14, 112, this.textureX, this.textureY);
        this.bodyModel[30] = new ModelRendererTurbo((ModelBase) this, 10, 120, this.textureX, this.textureY);
        this.bodyModel[31] = new ModelRendererTurbo((ModelBase) this, 292, 74, this.textureX, this.textureY);
        this.bodyModel[32] = new ModelRendererTurbo((ModelBase) this, 116, 368, this.textureX, this.textureY);
        this.bodyModel[33] = new ModelRendererTurbo((ModelBase) this, 116, 172, this.textureX, this.textureY);
        this.bodyModel[34] = new ModelRendererTurbo((ModelBase) this, 91, 227, this.textureX, this.textureY);
        this.bodyModel[35] = new ModelRendererTurbo((ModelBase) this, 14, 244, this.textureX, this.textureY);
        this.bodyModel[36] = new ModelRendererTurbo((ModelBase) this, 14, 244, this.textureX, this.textureY);
        this.bodyModel[37] = new ModelRendererTurbo((ModelBase) this, 14, 244, this.textureX, this.textureY);
        this.bodyModel[38] = new ModelRendererTurbo((ModelBase) this, 14, 244, this.textureX, this.textureY);
        this.bodyModel[39] = new ModelRendererTurbo((ModelBase) this, 35, 363, this.textureX, this.textureY);
        this.bodyModel[40] = new ModelRendererTurbo((ModelBase) this, 34, 372, this.textureX, this.textureY);
        this.bodyModel[41] = new ModelRendererTurbo((ModelBase) this, 196, 376, this.textureX, this.textureY);
        this.bodyModel[42] = new ModelRendererTurbo((ModelBase) this, 34, 372, this.textureX, this.textureY);
        this.bodyModel[43] = new ModelRendererTurbo((ModelBase) this, 101, 364, this.textureX, this.textureY);
        this.bodyModel[44] = new ModelRendererTurbo((ModelBase) this, 225, 4, this.textureX, this.textureY);
        this.bodyModel[45] = new ModelRendererTurbo((ModelBase) this, 300, 300, this.textureX, this.textureY);
        this.bodyModel[46] = new ModelRendererTurbo((ModelBase) this, 300, 300, this.textureX, this.textureY);
        this.bodyModel[47] = new ModelRendererTurbo((ModelBase) this, 34, 372, this.textureX, this.textureY);
        this.bodyModel[48] = new ModelRendererTurbo((ModelBase) this, 34, 372, this.textureX, this.textureY);
        this.bodyModel[49] = new ModelRendererTurbo((ModelBase) this, 101, 364, this.textureX, this.textureY);
        this.bodyModel[50] = new ModelRendererTurbo((ModelBase) this, 225, 4, this.textureX, this.textureY);
        this.bodyModel[51] = new ModelRendererTurbo((ModelBase) this, 300, 300, this.textureX, this.textureY);
        this.bodyModel[52] = new ModelRendererTurbo((ModelBase) this, 300, 300, this.textureX, this.textureY);
        this.bodyModel[53] = new ModelRendererTurbo((ModelBase) this, 95, 284, this.textureX, this.textureY);
        this.bodyModel[54] = new ModelRendererTurbo((ModelBase) this, 95, 284, this.textureX, this.textureY);
        this.bodyModel[55] = new ModelRendererTurbo((ModelBase) this, 261, 271, this.textureX, this.textureY);
        this.bodyModel[56] = new ModelRendererTurbo((ModelBase) this, 270, 280, this.textureX, this.textureY);
        this.bodyModel[57] = new ModelRendererTurbo((ModelBase) this, 7, 390, this.textureX, this.textureY);
        this.bodyModel[58] = new ModelRendererTurbo((ModelBase) this, 7, 390, this.textureX, this.textureY);
        this.bodyModel[59] = new ModelRendererTurbo((ModelBase) this, 7, 390, this.textureX, this.textureY);
        this.bodyModel[60] = new ModelRendererTurbo((ModelBase) this, 261, 271, this.textureX, this.textureY);
        this.bodyModel[61] = new ModelRendererTurbo((ModelBase) this, 283, 280, this.textureX, this.textureY);
        this.bodyModel[62] = new ModelRendererTurbo((ModelBase) this, 35, 363, this.textureX, this.textureY);
        this.bodyModel[63] = new ModelRendererTurbo((ModelBase) this, 38, 148, this.textureX, this.textureY);
        this.bodyModel[64] = new ModelRendererTurbo((ModelBase) this, 383, 23, this.textureX, this.textureY);
        this.bodyModel[65] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[66] = new ModelRendererTurbo((ModelBase) this, 59, 28, this.textureX, this.textureY);
        this.bodyModel[67] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[68] = new ModelRendererTurbo((ModelBase) this, 362, 60, this.textureX, this.textureY);
        this.bodyModel[69] = new ModelRendererTurbo((ModelBase) this, 362, 60, this.textureX, this.textureY);
        this.bodyModel[70] = new ModelRendererTurbo((ModelBase) this, 195, 363, this.textureX, this.textureY);
        this.bodyModel[71] = new ModelRendererTurbo((ModelBase) this, 300, 360, this.textureX, this.textureY);
        this.bodyModel[72] = new ModelRendererTurbo((ModelBase) this, 290, 251, this.textureX, this.textureY);
        this.bodyModel[73] = new ModelRendererTurbo((ModelBase) this, 330, 251, this.textureX, this.textureY);
        this.bodyModel[74] = new ModelRendererTurbo((ModelBase) this, 450, 100, this.textureX, this.textureY);
        this.bodyModel[75] = new ModelRendererTurbo((ModelBase) this, 397, 100, this.textureX, this.textureY);
        this.bodyModel[76] = new ModelRendererTurbo((ModelBase) this, 433, 100, this.textureX, this.textureY);
        this.bodyModel[77] = new ModelRendererTurbo((ModelBase) this, 433, 100, this.textureX, this.textureY);
        this.bodyModel[78] = new ModelRendererTurbo((ModelBase) this, 259, 118, this.textureX, this.textureY);
        this.bodyModel[79] = new ModelRendererTurbo((ModelBase) this, 260, 119, this.textureX, this.textureY);
        this.bodyModel[80] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[81] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[82] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[83] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[84] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[85] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[86] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.bodyModel[87] = new ModelRendererTurbo((ModelBase) this, 249, 21, this.textureX, this.textureY);
        this.bodyModel[88] = new ModelRendererTurbo((ModelBase) this, 296, 316, this.textureX, this.textureY);
        this.bodyModel[89] = new ModelRendererTurbo((ModelBase) this, 12, 91, this.textureX, this.textureY);
        this.bodyModel[90] = new ModelRendererTurbo((ModelBase) this, 12, 102, this.textureX, this.textureY);

        this.bodyModel[0].addShapeBox(-63.0F, 8.0F, -32.0F, 24, 23, 44, 0.0F, 9.0F, 21.3F, 0.0F, 69.0F, 21.3F, 0.0F, 69.0F, 21.3F, 0.0F, 9.0F, 21.3F, 0.0F, 1.0F, -21.5F, 0.0F, 69.25F, -21.5F, 0.0F, 69.25F, -21.5F, 0.0F, 1.0F, -21.5F, 0.0F);
        this.bodyModel[0].setRotationPoint(10.75F, 0.0F, 15.0F);

        this.bodyModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.6F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 11.5F, 0.6F, 0.0F, 11.5F, 4.7F, 13.3F, 0.0F, -4.2F, 13.6F, 0.0F, -4.2F, 13.6F, 11.5F, 4.7F, 13.3F, 11.5F);
        this.bodyModel[1].setRotationPoint(-64.7F, -12.0F, -29.5F);

        this.bodyModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.6F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 11.5F, 0.6F, 0.0F, 11.5F, 4.7F, 13.3F, 0.0F, -4.2F, 13.6F, 0.0F, -4.2F, 13.6F, 11.5F, 4.7F, 13.3F, 11.5F);
        this.bodyModel[2].setRotationPoint(-64.7F, -12.0F, 27.0F);

        this.bodyModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, -1.3F, 0.0F, 4.0F, -1.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 1.2F, 0.0F, 3.5F, 1.2F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.bodyModel[3].setRotationPoint(56.5F, -14.75F, 27.5F);

        this.bodyModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, -0.5F, 0.75F, 0.0F, 5.0F, -4.05F, 0.0F, 5.0F, -4.05F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, -0.85F, 0.0F, 4.2F, 3.7F, 0.0F, 4.2F, 3.7F, 0.0F, 0.0F, -0.85F, 0.0F);
        this.bodyModel[4].setRotationPoint(61.0F, -12.7F, 27.5F);

        this.bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 1.15F, 0.0F, 3.5F, 1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, -1.3F, 0.0F, 4.0F, -1.3F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.bodyModel[5].setRotationPoint(68.0F, -3.75F, 27.5F);
        (this.bodyModel[5]).rotateAngleZ = 1.7104226F;

        this.bodyModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, -1.3F, 0.0F, 4.0F, -1.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 1.2F, 0.0F, 3.5F, 1.2F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.bodyModel[6].setRotationPoint(56.5F, -14.75F, -29.0F);

        this.bodyModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, -0.5F, 0.75F, 0.0F, 5.0F, -4.05F, 0.0F, 5.0F, -4.05F, 0.0F, -0.5F, 0.75F, 0.0F, 0.0F, -0.85F, 0.0F, 4.2F, 3.7F, 0.0F, 4.2F, 3.7F, 0.0F, 0.0F, -0.85F, 0.0F);
        this.bodyModel[7].setRotationPoint(61.0F, -12.7F, -29.0F);

        this.bodyModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 3.5F, 1.15F, 0.0F, 3.5F, 1.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 4.0F, -1.3F, 0.0F, 4.0F, -1.3F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.bodyModel[8].setRotationPoint(68.0F, -3.75F, -29.0F);
        (this.bodyModel[8]).rotateAngleZ = 1.7104226F;

        this.bodyModel[9].addShapeBox(0.0F, 0.0F, -32.0F, 1, 11, 41, 0.0F, 12.3F, -1.25F, 4.1F, -3.6F, -1.25F, -0.45F, -3.6F, -1.25F, -0.1F, 12.3F, -1.25F, 4.4F, 11.8F, 4.8F, 10.6F, 0.0F, 0.0F, 0.85F, 0.0F, 0.0F, 1.2F, 11.8F, 4.8F, 10.9F);
        this.bodyModel[9].setRotationPoint(22.75F, -30.0F, 16.6F);

        this.bodyModel[10].addShapeBox(-24.0F, -4.0F, 0.0F, 33, 13, 37, 0.0F, 3.15F, -8.7F, 0.8F, 0.6F, -2.15F, -0.05F, 0.6F, -2.15F, 1.4F, 3.15F, -8.7F, 2.4F, 5.0F, 1.55F, 2.95F, -4.25F, 1.55F, 3.15F, -4.25F, 1.55F, 4.1F, 5.0F, 1.55F, 4.1F);
        this.bodyModel[10].setRotationPoint(-32.0F, -22.5F, -14.0F);
        (this.bodyModel[10]).rotateAngleZ = -0.03490659F;

        this.bodyModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 42, 1, 42, 0.0F, 0.25F, 0.5F, 1.25F, -4.46F, -11.9F, 1.25F, -4.46F, -11.9F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, -1.45F, 1.25F, -4.49F, 10.95F, 1.25F, -4.49F, 10.95F, -0.25F, 0.25F, -1.45F, -0.25F);
        this.bodyModel[11].setRotationPoint(24.0F, -18.5F, -15.0F);

        this.bodyModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 31, 1, 1, 0.0F, -12.75F, 3.65F, 0.25F, -4.6F, -0.75F, 0.25F, -4.6F, -0.75F, -1.25F, -12.7F, 3.65F, -1.25F, 0.7F, 0.15F, 10.1F, -4.6F, -0.25F, 0.25F, -4.6F, -0.25F, -1.25F, 0.2F, -0.4F, -1.25F);
        this.bodyModel[12].setRotationPoint(11.0F, -15.3F, -16.0F);

        this.bodyModel[13].addShapeBox(-50.0F, 0.0F, -2.0F, 140, 1, 18, 0.0F, 0.0F, -0.1F, 0.5F, -18.5F, 1.2F, 0.0F, -18.5F, 1.2F, -6.0F, 0.0F, -0.1F, -6.0F, 0.0F, 0.5F, 0.5F, -18.5F, -1.0F, 0.0F, -18.5F, -1.0F, -6.0F, 0.0F, 0.5F, -6.0F);
        this.bodyModel[13].setRotationPoint(-15.0F, -13.5F, -27.0F);

        this.bodyModel[14].addShapeBox(-50.0F, 0.0F, -2.0F, 140, 1, 18, 0.0F, 0.0F, -0.1F, 0.5F, -18.5F, 1.2F, 0.0F, -18.5F, 1.2F, -6.0F, 0.0F, -0.1F, -6.0F, 0.0F, 0.5F, 0.5F, -18.5F, -1.0F, 0.0F, -18.5F, -1.0F, -6.0F, 0.0F, 0.5F, -6.0F);
        this.bodyModel[14].setRotationPoint(-15.0F, -13.5F, -27.0F);

        this.bodyModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 31, 1, 1, 0.0F, -12.7F, 3.65F, -1.25F, -4.6F, -0.75F, -1.25F, -4.6F, -0.75F, 0.25F, -12.75F, 3.65F, 0.25F, 0.2F, -0.4F, -1.25F, -4.6F, -0.25F, -1.25F, -4.6F, -0.25F, 0.25F, 0.7F, 0.15F, 10.1F);
        this.bodyModel[15].setRotationPoint(11.0F, -15.3F, 25.5F);

        this.bodyModel[16].addShapeBox(0.0F, 0.0F, -28.0F, 1, 9, 44, 0.0F, 0.0F, 0.2F, -0.25F, -0.15F, 0.6F, -0.25F, -0.15F, 0.6F, -0.75F, 0.0F, 0.2F, -0.75F, -0.4F, 8.65F, -0.25F, 1.0F, 7.0F, -0.25F, 1.0F, 7.15F, -0.75F, -0.1F, 8.75F, -0.75F);
        this.bodyModel[16].setRotationPoint(60.5F, -6.5F, 11.5F);
        (this.bodyModel[16]).rotateAngleZ = -0.5235988F;

        this.bodyModel[17].addShapeBox(5.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F, 23.0F, 1.0F, 0.0F, -9.5F, 1.0F, 0.0F, -9.5F, 1.0F, -0.9F, 23.0F, 1.0F, -0.9F, 23.0F, -0.25F, 0.0F, -5.0F, -0.25F, 0.0F, -5.0F, -0.25F, -0.9F, 23.0F, -0.25F, -0.9F);
        this.bodyModel[17].setRotationPoint(53.0F, -13.3F, 26.8F);

        this.bodyModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F, 23.0F, 3.75F, 0.0F, -5.0F, 3.75F, 0.0F, -5.0F, 3.75F, -0.95F, 23.0F, 3.75F, -0.95F, 23.0F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, -0.95F, 23.0F, -0.25F, -0.95F);
        this.bodyModel[18].setRotationPoint(58.0F, -8.8F, 26.8F);

        this.bodyModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F, 25.0F, 3.55F, 0.0F, -1.75F, 3.55F, 0.0F, -1.75F, 3.55F, -0.95F, 25.0F, 3.55F, -0.95F, 25.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.95F, 25.0F, -0.25F, -0.95F);
        this.bodyModel[19].setRotationPoint(60.0F, -4.5F, 26.8F);

        this.bodyModel[20].addShapeBox(5.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F, 23.0F, 1.0F, -0.9F, -9.5F, 1.0F, -0.9F, -9.5F, 1.0F, 0.0F, 23.0F, 1.0F, 0.0F, 23.0F, -0.25F, -0.9F, -5.0F, -0.25F, -0.9F, -5.0F, -0.25F, 0.0F, 23.0F, -0.25F, 0.0F);
        this.bodyModel[20].setRotationPoint(53.0F, -13.3F, -18.2F);

        this.bodyModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F, 23.0F, 3.75F, -0.95F, -5.0F, 3.75F, -0.95F, -5.0F, 3.75F, 0.0F, 23.0F, 3.75F, 0.0F, 23.0F, -0.25F, -0.95F, 0.25F, -0.25F, -0.95F, 0.25F, -0.25F, 0.0F, 23.0F, -0.25F, 0.0F);
        this.bodyModel[21].setRotationPoint(58.0F, -8.8F, -18.2F);

        this.bodyModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F, 25.0F, 3.55F, -0.95F, -1.75F, 3.55F, -0.95F, -1.75F, 3.55F, 0.0F, 25.0F, 3.55F, 0.0F, 25.0F, -0.25F, -0.95F, 0.0F, -0.25F, -0.95F, 0.0F, -0.25F, 0.0F, 25.0F, -0.25F, 0.0F);
        this.bodyModel[22].setRotationPoint(60.0F, -4.5F, -18.2F);

        this.bodyModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -2.05F, 1.12F, 3.5F, 1.05F, 1.12F, 3.5F, 1.05F, 1.12F, 0.0F, -2.05F, 1.12F, 0.0F, 0.0F, -0.05F, 1.7F, 2.2F, 0.0F, 3.5F, 2.2F, 0.0F, 0.0F, 0.0F, -0.05F, 0.0F);
        this.bodyModel[23].setRotationPoint(63.55F, -5.5F, -9.25F);
        (this.bodyModel[23]).rotateAngleY = -3.1415927F;

        this.bodyModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.65F, 0.05F, 1.7F, 1.55F, 0.0F, 3.5F, 1.55F, 0.0F, 0.0F, 0.65F, 0.05F, 0.0F, 1.75F, 3.9F, -0.95F, 4.3F, 3.9F, 3.5F, 4.3F, 3.9F, 0.0F, 1.75F, 3.9F, 0.0F);
        this.bodyModel[24].setRotationPoint(62.9F, -4.5F, -9.25F);
        (this.bodyModel[24]).rotateAngleY = -3.1415927F;

        this.bodyModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 7, 3, 1, 0.0F, 0.0F, 0.05F, -0.95F, 0.1F, 0.05F, 3.5F, 0.1F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, -0.95F, -0.05F, -0.95F, 1.85F, -0.05F, 3.5F, 1.85F, -0.05F, 0.0F, -0.95F, -0.05F, 0.0F);
        this.bodyModel[25].setRotationPoint(64.65F, 0.45F, -9.25F);
        (this.bodyModel[25]).rotateAngleY = -3.1415927F;

        this.bodyModel[26].addShapeBox(1.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -0.2F, 0.1F, -0.95F, 0.05F, 0.1F, 3.5F, 0.05F, 0.1F, 0.0F, -0.15F, 0.1F, 0.0F, -3.05F, 0.0F, -0.65F, 1.8F, 0.0F, 3.5F, 1.8F, 0.0F, 0.0F, -3.05F, 0.0F, 0.0F);
        this.bodyModel[26].setRotationPoint(64.85F, 3.5F, -9.25F);
        (this.bodyModel[26]).rotateAngleY = -3.1415927F;

        this.bodyModel[27].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F, -0.05F, 0.0F, -0.65F, -0.2F, 0.0F, 3.5F, -0.2F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -2.05F, 0.05F, 0.0F, 0.4F, 0.05F, 3.5F, 0.4F, 0.05F, 0.0F, -2.05F, 0.05F, 0.0F);
        this.bodyModel[27].setRotationPoint(60.85F, 6.5F, -9.25F);
        (this.bodyModel[27]).rotateAngleY = -3.1415927F;

        this.bodyModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, -0.05F, 3.5F, -0.6F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, -0.05F, 0.2F, 3.5F, -0.05F, 0.2F, 0.0F, 0.0F, -0.95F, 0.0F);
        this.bodyModel[28].setRotationPoint(58.8F, 7.5F, -9.25F);
        (this.bodyModel[28]).rotateAngleY = -3.1415927F;

        this.bodyModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F, -0.05F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 3.5F, -0.05F, 0.0F, -0.65F, -2.05F, 0.05F, 0.0F, 0.4F, 0.05F, 0.0F, 0.4F, 0.05F, 3.5F, -2.05F, 0.05F, 0.0F);
        this.bodyModel[29].setRotationPoint(60.85F, 6.5F, 20.75F);
        (this.bodyModel[29]).rotateAngleY = -3.1415927F;

        this.bodyModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, -0.05F, 0.0F, -0.6F, -0.05F, 3.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.95F, 0.0F, -0.05F, 0.2F, 0.0F, -0.05F, 0.2F, 3.5F, 0.0F, -0.95F, 0.0F);
        this.bodyModel[30].setRotationPoint(58.8F, 7.5F, 20.75F);
        (this.bodyModel[30]).rotateAngleY = -3.1415927F;

        this.bodyModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 11, 14, 45, 0.0F, 0.0F, 0.0F, -0.55F, 9.0F, 0.0F, -1.3F, 9.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.55F, 0.0F, 1.5F, -0.55F, 0.0F, 1.0F, -1.3F, 0.0F, 1.0F, -0.9F, 0.0F, 1.5F, -0.55F);
        this.bodyModel[31].setRotationPoint(41.0F, -6.0F, -17.5F);

        this.bodyModel[32].addShapeBox(0.0F, 0.0F, -24.0F, 7, 14, 48, 0.0F, 1.3F, 0.3F, -6.35F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 1.0F, 1.3F, 0.3F, -5.85F, 8.5F, 0.9F, -2.15F, 0.5F, 0.55F, 6.9F, 0.5F, 0.55F, 7.4F, 8.5F, 0.9F, -1.85F);
        this.bodyModel[32].setRotationPoint(-19.05F, -28.5F, 5.0F);

        this.bodyModel[33].addShapeBox(0.0F, 0.0F, -24.0F, 22, 15, 48, 0.0F, -0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 1.0F, -0.5F, 0.25F, 1.0F, -0.5F, -0.45F, 6.95F, 1.0F, -0.65F, 7.0F, 1.0F, -0.65F, 7.5F, -0.5F, -0.45F, 7.45F);
        this.bodyModel[33].setRotationPoint(-12.05F, -28.5F, 5.0F);

        this.bodyModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
        this.bodyModel[34].setRotationPoint(20.25F, -26.5F, 8.5F);
        (this.bodyModel[34]).rotateAngleZ = 0.3577925F;

        this.bodyModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
        this.bodyModel[35].setRotationPoint(19.75F, -26.5F, 25.6F);
        (this.bodyModel[35]).rotateAngleY = 1.1170107F;
        (this.bodyModel[35]).rotateAngleZ = 0.3577925F;

        this.bodyModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
        this.bodyModel[36].setRotationPoint(11.0F, -26.5F, -19.55F);
        (this.bodyModel[36]).rotateAngleY = -1.1170107F;
        (this.bodyModel[36]).rotateAngleZ = 0.3577925F;

        this.bodyModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F);
        this.bodyModel[37].setRotationPoint(-12.0F, -26.5F, 30.08F);
        (this.bodyModel[37]).rotateAngleY = 2.1816616F;
        (this.bodyModel[37]).rotateAngleZ = 0.3403392F;

        this.bodyModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 10, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F);
        this.bodyModel[38].setRotationPoint(-20.75F, -26.5F, -13.75F);
        (this.bodyModel[38]).rotateAngleY = -2.1991148F;
        (this.bodyModel[38]).rotateAngleZ = 0.3577925F;

        this.bodyModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 23, 3, 3, 0.0F, 0.0F, 3.15F, 0.75F, 0.0F, 3.15F, 0.75F, 0.0F, 1.4F, -2.3F, 0.0F, 1.4F, -2.3F, 0.0F, -1.75F, 0.75F, 0.0F, -2.0F, 0.75F, 0.0F, -2.0F, -1.75F, 0.0F, -1.75F, -1.75F);
        this.bodyModel[39].setRotationPoint(-63.0F, -14.65F, 37.75F);

        this.bodyModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 23, 1, 3, 0.0F, 0.0F, 1.1F, 1.15F, 0.0F, 1.1F, 1.15F, 0.0F, -0.35F, -2.0F, 0.0F, -0.35F, -2.0F, 0.0F, -1.55F, 1.15F, 0.0F, -1.55F, 1.15F, 0.0F, -0.1F, -2.0F, 0.0F, -0.1F, -2.0F);
        this.bodyModel[40].setRotationPoint(-63.0F, -18.15F, 36.0F);

        this.bodyModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 23, 3, 2, 0.0F, 0.0F, 2.15F, -2.0F, 0.0F, 2.15F, -2.0F, 0.0F, 3.15F, 1.25F, 0.0F, 3.15F, 1.25F, 0.0F, -1.75F, -1.0F, 0.0F, -1.75F, -1.0F, 0.0F, -1.75F, 1.25F, 0.0F, -1.75F, 1.25F);
        this.bodyModel[41].setRotationPoint(-63.0F, -14.65F, 26.75F);

        this.bodyModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 23, 1, 3, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 1.1F, -0.85F, 0.0F, 1.1F, -0.85F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -1.55F, -0.85F, 0.0F, -1.55F, -0.85F);
        this.bodyModel[42].setRotationPoint(-63.0F, -18.15F, 30.0F);

        this.bodyModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 23, 1, 3, 0.0F, 0.0F, 1.1F, 0.1F, 0.0F, 1.1F, 0.1F, 0.0F, 1.1F, -0.4F, 0.0F, 1.1F, -0.4F, 0.0F, -1.55F, 0.1F, 0.0F, -1.55F, 0.1F, 0.0F, -1.55F, -0.4F, 0.0F, -1.55F, -0.4F);
        this.bodyModel[43].setRotationPoint(-63.0F, -18.15F, 32.25F);

        this.bodyModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 21, 2, 2, 0.0F, 0.0F, 1.9F, 0.5F, 0.0F, 1.9F, 0.5F, 0.0F, 1.9F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, 1.4F, 0.5F, 0.0F, 1.4F, 0.5F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F);
        this.bodyModel[44].setRotationPoint(-62.0F, -16.75F, 32.75F);

        this.bodyModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 21, 2, 1, 0.0F, 0.0F, 0.25F, 0.7F, 0.0F, 0.25F, 0.7F, 0.0F, 1.9F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 1.4F, 0.5F, 0.0F, 1.4F, 0.5F);
        this.bodyModel[45].setRotationPoint(-62.0F, -16.75F, 30.75F);

        this.bodyModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 21, 2, 1, 0.0F, 0.0F, 1.9F, 0.5F, 0.0F, 1.9F, 0.5F, 0.0F, 0.25F, 0.7F, 0.0F, 0.25F, 0.7F, 0.0F, 1.4F, 0.5F, 0.0F, 1.4F, 0.5F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F);
        this.bodyModel[46].setRotationPoint(-62.0F, -16.75F, 35.25F);

        this.bodyModel[47].addShapeBox(0.0F, 0.0F, 0.0F, 23, 1, 3, 0.0F, 0.0F, 1.1F, 1.15F, 0.0F, 1.1F, 1.15F, 0.0F, -0.35F, -2.0F, 0.0F, -0.35F, -2.0F, 0.0F, -1.55F, 1.15F, 0.0F, -1.55F, 1.15F, 0.0F, -0.1F, -2.0F, 0.0F, -0.1F, -2.0F);
        this.bodyModel[47].setRotationPoint(-63.0F, -18.15F, -20.75F);

        this.bodyModel[48].addShapeBox(0.0F, 0.0F, 0.0F, 23, 1, 3, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 1.1F, -0.85F, 0.0F, 1.1F, -0.85F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -1.55F, -0.85F, 0.0F, -1.55F, -0.85F);
        this.bodyModel[48].setRotationPoint(-63.0F, -18.15F, -26.75F);

        this.bodyModel[49].addShapeBox(0.0F, 0.0F, 0.0F, 23, 1, 3, 0.0F, 0.0F, 1.1F, 0.1F, 0.0F, 1.1F, 0.1F, 0.0F, 1.1F, -0.4F, 0.0F, 1.1F, -0.4F, 0.0F, -1.55F, 0.1F, 0.0F, -1.55F, 0.1F, 0.0F, -1.55F, -0.4F, 0.0F, -1.55F, -0.4F);
        this.bodyModel[49].setRotationPoint(-63.0F, -18.15F, -24.5F);

        this.bodyModel[50].addShapeBox(0.0F, 0.0F, 0.0F, 21, 2, 2, 0.0F, 0.0F, 1.9F, 0.5F, 0.0F, 1.9F, 0.5F, 0.0F, 1.9F, 0.0F, 0.0F, 1.9F, 0.0F, 0.0F, 1.4F, 0.5F, 0.0F, 1.4F, 0.5F, 0.0F, 1.4F, 0.0F, 0.0F, 1.4F, 0.0F);
        this.bodyModel[50].setRotationPoint(-62.0F, -16.75F, -24.0F);

        this.bodyModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 21, 2, 1, 0.0F, 0.0F, 0.25F, 0.7F, 0.0F, 0.25F, 0.7F, 0.0F, 1.9F, 0.5F, 0.0F, 2.0F, 0.5F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 1.4F, 0.5F, 0.0F, 1.4F, 0.5F);
        this.bodyModel[51].setRotationPoint(-62.0F, -16.75F, -26.0F);

        this.bodyModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 21, 2, 1, 0.0F, 0.0F, 1.9F, 0.5F, 0.0F, 1.9F, 0.5F, 0.0F, 0.25F, 0.7F, 0.0F, 0.25F, 0.7F, 0.0F, 1.4F, 0.5F, 0.0F, 1.4F, 0.5F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, 0.7F);
        this.bodyModel[52].setRotationPoint(-62.0F, -16.75F, -21.5F);

        this.bodyModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.5F, 1.15F, 0.0F, 0.5F, 1.15F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.15F, 0.0F, 0.5F, 1.15F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
        this.bodyModel[53].setRotationPoint(-66.0F, -16.5F, 33.55F);

        this.bodyModel[54].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.5F, 1.15F, 0.0F, 0.5F, 1.15F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 1.15F, 0.0F, 0.5F, 1.15F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
        this.bodyModel[54].setRotationPoint(-66.0F, -16.5F, -23.2F);

        this.bodyModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.bodyModel[55].setRotationPoint(-41.0F, -17.25F, 32.35F);

        this.bodyModel[56].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -0.5F, 1.0F, -2.0F, 0.5F, 6.0F, 0.75F, 0.5F, 4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.5F, 1.0F, -2.0F, -0.5F, 6.0F, 0.75F, -0.5F, 4.0F);
        this.bodyModel[56].setRotationPoint(-32.0F, -16.75F, 26.35F);

        this.bodyModel[57].addBox(0.0F, 0.0F, 0.0F, 2, 2, 59, 0.0F);
        this.bodyModel[57].setRotationPoint(23.4F, -8.65F, -24.5F);

        this.bodyModel[58].addBox(0.0F, 0.0F, 0.0F, 2, 2, 59, 0.0F);
        this.bodyModel[58].setRotationPoint(1.5F, -8.2F, -24.5F);

        this.bodyModel[59].addBox(0.0F, 0.0F, 0.0F, 2, 2, 59, 0.0F);
        this.bodyModel[59].setRotationPoint(-16.8F, -7.4F, -24.5F);

        this.bodyModel[60].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.bodyModel[60].setRotationPoint(-41.0F, -17.25F, -24.25F);

        this.bodyModel[61].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, 0.75F, 0.5F, 4.0F, -2.0F, 0.5F, 6.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, 1.0F, 0.75F, -0.5F, 4.0F, -2.0F, -0.5F, 6.0F, 0.0F, 0.5F, 1.0F, 0.0F, 0.0F, 1.0F);
        this.bodyModel[61].setRotationPoint(-32.0F, -16.75F, -18.25F);

        this.bodyModel[62].addShapeBox(0.0F, 0.0F, 0.0F, 23, 3, 3, 0.0F, 0.0F, 1.4F, -2.3F, 0.0F, 1.4F, -2.3F, 0.0F, 3.15F, 0.75F, 0.0F, 3.15F, 0.75F, 0.0F, -1.75F, -1.75F, 0.0F, -2.0F, -1.75F, 0.0F, -2.0F, 0.75F, 0.0F, -1.75F, 0.75F);
        this.bodyModel[62].setRotationPoint(-63.0F, -14.65F, -30.5F);

        this.bodyModel[63].addShapeBox(-50.0F, 0.0F, -2.0F, 140, 1, 18, 0.0F, 0.0F, -0.1F, 0.5F, -18.5F, 1.2F, 0.0F, -18.5F, 1.2F, -6.0F, 0.0F, -0.1F, -6.0F, 0.0F, 0.5F, 0.5F, -18.5F, -1.0F, 0.0F, -18.5F, -1.0F, -6.0F, 0.0F, 0.5F, -6.0F);
        this.bodyModel[63].setRotationPoint(-15.0F, -13.5F, 29.5F);

        this.bodyModel[64].addShapeBox(0.0F, 0.0F, 0.0F, 3, 3, 55, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.5F, 0.0F);
        this.bodyModel[64].setRotationPoint(53.5F, -3.0F, -23.0F);

        this.bodyModel[65].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 53.0F, 0.0F, 0.0F, 53.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 53.0F, 0.0F, 0.0F, 53.0F);
        this.bodyModel[65].setRotationPoint(-28.5F, 6.5F, -22.0F);

        this.bodyModel[66].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 53.0F, 0.0F, 0.0F, 53.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 53.0F, 0.0F, 0.0F, 53.0F);
        this.bodyModel[66].setRotationPoint(11.5F, 6.5F, -22.0F);

        this.bodyModel[67].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 53.0F, 0.0F, 0.0F, 53.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 53.0F, 0.0F, 0.0F, 53.0F);
        this.bodyModel[67].setRotationPoint(-8.9F, 6.5F, -22.0F);

        this.bodyModel[68].addShapeBox(0.0F, 0.0F, 0.0F, 21, 4, 1, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
        this.bodyModel[68].setRotationPoint(-10.75F, -17.5F, 34.5F);
        (this.bodyModel[68]).rotateAngleX = 0.41887903F;
        (this.bodyModel[68]).rotateAngleZ = 0.01745329F;

        this.bodyModel[69].addShapeBox(0.0F, 0.0F, 0.0F, 21, 4, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, 1.25F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.bodyModel[69].setRotationPoint(-10.75F, -18.5F, -25.0F);
        (this.bodyModel[69]).rotateAngleX = -0.41887903F;
        (this.bodyModel[69]).rotateAngleZ = 0.01745329F;

        this.bodyModel[70].addShapeBox(0.0F, 0.0F, 0.0F, 23, 3, 2, 0.0F, 0.0F, 3.15F, 1.25F, 0.0F, 3.15F, 1.25F, 0.0F, 2.15F, -2.0F, 0.0F, 2.15F, -2.0F, 0.0F, -1.75F, 1.25F, 0.0F, -1.75F, 1.25F, 0.0F, -1.75F, -1.0F, 0.0F, -1.75F, -1.0F);
        this.bodyModel[70].setRotationPoint(-63.0F, -14.65F, -18.5F);

        this.bodyModel[71].addShapeBox(0.0F, 0.0F, 0.0F, 1, 8, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, -7.0F, 0.0F, -5.0F, -7.0F);
        this.bodyModel[71].setRotationPoint(-61.0F, -11.5F, 15.0F);

        this.bodyModel[72].addShapeBox(0.0F, 0.0F, 0.0F, 1, 8, 8, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -5.0F, -7.0F, 0.0F, -5.0F, -7.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F);
        this.bodyModel[72].setRotationPoint(-61.0F, -11.5F, 9.0F);

        this.bodyModel[73].addShapeBox(0.0F, 0.0F, 0.0F, 1, 8, 8, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -5.0F, -7.0F, 0.0F, -5.0F, -7.0F);
        this.bodyModel[73].setRotationPoint(-61.0F, -11.5F, 14.0F);

        this.bodyModel[74].addShapeBox(0.0F, 0.0F, 0.0F, 1, 15, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.bodyModel[74].setRotationPoint(-60.6F, -9.4F, 2.5F);
        (this.bodyModel[74]).rotateAngleZ = 0.34906584F;

        this.bodyModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 1, 13, 5, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        this.bodyModel[75].setRotationPoint(-60.25F, -8.5F, -2.5F);
        (this.bodyModel[75]).rotateAngleZ = 0.34906584F;

        this.bodyModel[76].addShapeBox(0.0F, 0.0F, 0.0F, 1, 13, 5, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F);
        this.bodyModel[76].setRotationPoint(-60.25F, -8.5F, 7.5F);
        (this.bodyModel[76]).rotateAngleZ = 0.34906584F;

        this.bodyModel[77].addShapeBox(0.0F, 0.0F, 0.0F, 1, 13, 5, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F);
        this.bodyModel[77].setRotationPoint(-59.75F, -5.5F, -1.5F);
        (this.bodyModel[77]).rotateAngleX = 0.7853982F;
        (this.bodyModel[77]).rotateAngleZ = 0.34906584F;

        this.bodyModel[78].addShapeBox(0.0F, 0.0F, 0.0F, 1, 12, 2, 0.0F, 1.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F, 1.75F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, -0.5F);
        this.bodyModel[78].setRotationPoint(-60.85F, -9.5F, 25.0F);
        (this.bodyModel[78]).rotateAngleZ = 0.34906584F;

        this.bodyModel[79].addShapeBox(0.0F, 0.0F, 0.0F, 1, 12, 2, 0.0F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F, 0.25F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 1.75F, 0.0F, -0.25F);
        this.bodyModel[79].setRotationPoint(-60.85F, -9.5F, -17.0F);
        (this.bodyModel[79]).rotateAngleZ = 0.34906584F;

        this.bodyModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.95F, 5.0F, 1.0F, 1.12F, 5.0F, 1.0F, 1.12F, 0.0F, 0.0F, -0.95F, 0.0F, 1.1F, 4.9F, 5.0F, 5.0F, 4.95F, 5.0F, 5.0F, 4.95F, 0.0F, 1.1F, 4.9F, 0.0F);
        this.bodyModel[80].setRotationPoint(63.55F, -5.5F, -15.25F);
        (this.bodyModel[80]).rotateAngleY = -3.1415927F;

        this.bodyModel[81].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 1.1F, 4.9F, 5.0F, 5.0F, 4.85F, 5.0F, 5.0F, 4.85F, 0.0F, 1.1F, 4.9F, 0.0F, 0.15F, -2.9F, 5.0F, 1.75F, 0.15F, 5.0F, 1.75F, 0.15F, 0.0F, 0.15F, -2.8F, 0.0F);
        this.bodyModel[81].setRotationPoint(63.55F, 5.3F, -15.25F);
        (this.bodyModel[81]).rotateAngleY = -3.1415927F;

        this.bodyModel[82].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 1.25F, 4.85F, 5.0F, 1.0F, 10.85F, 5.0F, 1.0F, 10.85F, 0.0F, 1.25F, 4.85F, 0.0F, -0.7F, -4.75F, 5.0F, 5.7F, -3.6F, 5.0F, 5.75F, -3.6F, 0.0F, -0.7F, -4.65F, 0.0F);
        this.bodyModel[82].setRotationPoint(59.55F, 11.3F, -15.25F);
        (this.bodyModel[82]).rotateAngleY = -3.1415927F;

        this.bodyModel[83].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 1.1F, 4.9F, 0.0F, 5.0F, 4.85F, 0.0F, 5.0F, 4.85F, 5.0F, 1.1F, 4.9F, 5.0F, 0.15F, -2.8F, 0.0F, 1.75F, 0.15F, 0.0F, 1.75F, 0.15F, 5.0F, 0.15F, -2.9F, 5.0F);
        this.bodyModel[83].setRotationPoint(63.55F, 5.3F, 26.75F);
        (this.bodyModel[83]).rotateAngleY = -3.1415927F;

        this.bodyModel[84].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 1.25F, 4.85F, 0.0F, 1.0F, 10.85F, 0.0F, 1.0F, 10.85F, 5.0F, 1.25F, 4.85F, 5.0F, -0.7F, -4.65F, 0.0F, 5.75F, -3.6F, 0.0F, 5.7F, -3.6F, 5.0F, -0.7F, -4.75F, 5.0F);
        this.bodyModel[84].setRotationPoint(59.55F, 11.3F, 26.75F);
        (this.bodyModel[84]).rotateAngleY = -3.1415927F;

        this.bodyModel[85].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.95F, 0.0F, 1.0F, 1.12F, 0.0F, 1.0F, 1.12F, 5.0F, 0.0F, -0.95F, 5.0F, 1.1F, 4.9F, 0.0F, 5.0F, 4.95F, 0.0F, 5.0F, 4.95F, 5.0F, 1.1F, 4.9F, 5.0F);
        this.bodyModel[85].setRotationPoint(63.55F, -5.5F, 26.75F);
        (this.bodyModel[85]).rotateAngleY = -3.1415927F;

        this.bodyModel[86].addBox(0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F);
        this.bodyModel[86].setRotationPoint(-21.0F, -28.25F, 13.25F);
        (this.bodyModel[86]).rotateAngleZ = -0.41887903F;

        this.bodyModel[87].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -2.05F, 1.12F, 0.0F, 1.05F, 1.12F, 0.0F, 1.05F, 1.12F, 3.5F, -2.05F, 1.12F, 3.5F, 0.0F, -0.05F, 0.0F, 2.2F, 0.0F, 0.0F, 2.2F, 0.0F, 3.5F, 0.0F, -0.05F, 1.7F);
        this.bodyModel[87].setRotationPoint(63.55F, -5.5F, 20.75F);
        (this.bodyModel[87]).rotateAngleY = -3.1415927F;

        this.bodyModel[88].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.65F, 0.05F, 0.0F, 1.55F, 0.0F, 0.0F, 1.55F, 0.0F, 3.5F, 0.65F, 0.05F, 1.7F, 1.75F, 3.9F, 0.0F, 4.3F, 3.9F, 0.0F, 4.3F, 3.9F, 3.5F, 1.75F, 3.9F, -0.95F);
        this.bodyModel[88].setRotationPoint(62.9F, -4.5F, 20.75F);
        (this.bodyModel[88]).rotateAngleY = -3.1415927F;

        this.bodyModel[89].addShapeBox(0.0F, 0.0F, 0.0F, 7, 3, 1, 0.0F, 0.0F, 0.05F, 0.0F, 0.1F, 0.05F, 0.0F, 0.1F, 0.05F, 3.5F, 0.0F, 0.05F, -0.95F, -0.95F, -0.05F, 0.0F, 1.85F, -0.05F, 0.0F, 1.85F, -0.05F, 3.5F, -0.95F, -0.05F, -0.95F);
        this.bodyModel[89].setRotationPoint(64.65F, 0.45F, 20.75F);
        (this.bodyModel[89]).rotateAngleY = -3.1415927F;

        this.bodyModel[90].addShapeBox(1.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -0.15F, 0.1F, 0.0F, 0.05F, 0.1F, 0.0F, 0.05F, 0.1F, 3.5F, -0.2F, 0.1F, -0.95F, -3.05F, 0.0F, 0.0F, 1.8F, 0.0F, 0.0F, 1.8F, 0.0F, 3.5F, -3.05F, 0.0F, -0.65F);
        this.bodyModel[90].setRotationPoint(64.85F, 3.5F, 20.75F);
        (this.bodyModel[90]).rotateAngleY = -3.1415927F;


        this.turretModel = new ModelRendererTurbo[23];
        this.turretModel[0] = new ModelRendererTurbo((ModelBase) this, 9, 128, this.textureX, this.textureY);
        this.turretModel[1] = new ModelRendererTurbo((ModelBase) this, 59, 465, this.textureX, this.textureY);
        this.turretModel[2] = new ModelRendererTurbo((ModelBase) this, 385, 24, this.textureX, this.textureY);
        this.turretModel[3] = new ModelRendererTurbo((ModelBase) this, 6, 466, this.textureX, this.textureY);
        this.turretModel[4] = new ModelRendererTurbo((ModelBase) this, 104, 176, this.textureX, this.textureY);
        this.turretModel[5] = new ModelRendererTurbo((ModelBase) this, 9, 128, this.textureX, this.textureY);
        this.turretModel[6] = new ModelRendererTurbo((ModelBase) this, 395, 25, this.textureX, this.textureY);
        this.turretModel[7] = new ModelRendererTurbo((ModelBase) this, 220, 175, this.textureX, this.textureY);
        this.turretModel[8] = new ModelRendererTurbo((ModelBase) this, 349, 175, this.textureX, this.textureY);
        this.turretModel[9] = new ModelRendererTurbo((ModelBase) this, 352, 246, this.textureX, this.textureY);
        this.turretModel[10] = new ModelRendererTurbo((ModelBase) this, 353, 297, this.textureX, this.textureY);
        this.turretModel[11] = new ModelRendererTurbo((ModelBase) this, 353, 345, this.textureX, this.textureY);
        this.turretModel[12] = new ModelRendererTurbo((ModelBase) this, 353, 396, this.textureX, this.textureY);
        this.turretModel[13] = new ModelRendererTurbo((ModelBase) this, 220, 125, this.textureX, this.textureY);
        this.turretModel[14] = new ModelRendererTurbo((ModelBase) this, 236, 387, this.textureX, this.textureY);
        this.turretModel[15] = new ModelRendererTurbo((ModelBase) this, 118, 462, this.textureX, this.textureY);
        this.turretModel[16] = new ModelRendererTurbo((ModelBase) this, 182, 475, this.textureX, this.textureY);
        this.turretModel[17] = new ModelRendererTurbo((ModelBase) this, 348, 20, this.textureX, this.textureY);
        this.turretModel[18] = new ModelRendererTurbo((ModelBase) this, 348, 20, this.textureX, this.textureY);
        this.turretModel[19] = new ModelRendererTurbo((ModelBase) this, 16, 393, this.textureX, this.textureY);
        this.turretModel[20] = new ModelRendererTurbo((ModelBase) this, 16, 393, this.textureX, this.textureY);
        this.turretModel[21] = new ModelRendererTurbo((ModelBase) this, 107, 29, this.textureX, this.textureY);
        this.turretModel[22] = new ModelRendererTurbo((ModelBase) this, 107, 29, this.textureX, this.textureY);

        this.turretModel[0].addShapeBox(7.0F, -1.25F, 17.5F, 12, 1, 1, 0.0F, 0.35F, -1.0F, 6.0F, -1.0F, 3.65F, 4.0F, -12.35F, -1.0F, 0.15F, 0.35F, -1.0F, 0.15F, 0.35F, 0.0F, 5.95F, 0.65F, 0.0F, 6.75F, -12.35F, 0.0F, 0.15F, 0.35F, 0.0F, 0.15F);
        this.turretModel[0].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[1].addShapeBox(19.0F, -1.0F, -10.5F, 1, 5, 22, 0.0F, 2.0F, 3.9F, 0.0F, -2.0F, 3.9F, 2.75F, -2.0F, 3.9F, 2.0F, 2.0F, 3.9F, 0.0F, 0.0F, -4.25F, 0.0F, -0.35F, -4.25F, 0.0F, -0.35F, -4.25F, -0.75F, 0.0F, -4.25F, -0.75F);
        this.turretModel[1].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[2].addShapeBox(17.0F, -5.9F, 12.5F, 1, 1, 1, 0.0F, 9.4F, 6.0F, -2.4F, -1.8F, 3.85F, 1.7F, -1.8F, 3.85F, -2.65F, 9.4F, 6.0F, 1.45F, 10.35F, 4.6F, -6.05F, 0.0F, 0.0F, -0.95F, 0.0F, 0.0F, 0.0F, 10.35F, 4.65F, 5.17F);
        this.turretModel[2].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[3].addShapeBox(15.0F, -9.8F, -10.5F, 1, 1, 22, 0.0F, -0.35F, -1.0F, 0.0F, 0.25F, -0.05F, 0.1F, 0.25F, -0.05F, -0.65F, -0.35F, -1.0F, -0.7F, -2.0F, 3.9F, 0.5F, 2.0F, 3.9F, 2.75F, 2.0F, 3.9F, 2.0F, -2.0F, 3.9F, 2.0F);
        this.turretModel[3].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[4].addShapeBox(15.0F, -10.0F, -10.5F, 1, 1, 21, 0.0F, 7.4F, 1.9F, 4.2F, 0.25F, -0.25F, 0.1F, 0.25F, -0.25F, 0.35F, 7.4F, 1.9F, 4.45F, 8.35F, 8.75F, 1.0F, 3.0F, 8.75F, 0.0F, 3.0F, 8.75F, 0.0F, 8.35F, 8.75F, 1.0F);
        this.turretModel[4].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[5].addShapeBox(7.0F, -1.25F, -18.25F, 12, 1, 1, 0.0F, 0.35F, -0.95F, 0.1F, -12.25F, -0.95F, 0.1F, -1.0F, 3.65F, 4.0F, 0.35F, -1.0F, 5.75F, 0.35F, 0.0F, 0.1F, -12.25F, 0.0F, 0.1F, 0.65F, 0.0F, 6.75F, 0.35F, 0.0F, 5.75F);
        this.turretModel[5].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[6].addShapeBox(17.0F, -5.9F, -13.25F, 1, 1, 1, 0.0F, 9.4F, 6.0F, 1.45F, -1.75F, 3.85F, -2.65F, -1.75F, 3.85F, 1.65F, 9.4F, 6.0F, -2.45F, 10.4F, 4.65F, 5.17F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 10.3F, 4.6F, -6.05F);
        this.turretModel[6].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[7].addShapeBox(3.55F, -11.75F, -14.75F, 4, 12, 30, 0.0F, -0.05F, 0.1F, 0.5F, 0.05F, 0.15F, -0.05F, 0.05F, 0.15F, -0.3F, -0.05F, 0.1F, 0.25F, -0.05F, -0.5F, 4.25F, -0.95F, -0.5F, 3.7F, -0.9F, -0.5F, 3.4F, -0.05F, -0.5F, 4.0F);
        this.turretModel[7].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[8].addShapeBox(-0.45F, -11.75F, -14.75F, 4, 12, 31, 0.0F, -0.05F, 0.075F, 0.0F, 0.05F, 0.1F, 0.5F, 0.05F, 0.1F, -0.75F, -0.05F, 0.075F, -1.25F, -0.05F, -0.5F, 4.5F, 0.05F, -0.5F, 4.25F, 0.05F, -0.5F, 3.0F, -0.05F, -0.5F, 3.25F);
        this.turretModel[8].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[9].addShapeBox(-4.45F, -11.75F, -14.75F, 4, 12, 40, 0.0F, 0.0F, 0.1F, -1.5F, 0.05F, 0.075F, 0.0F, 0.05F, 0.075F, -10.25F, 0.1F, 0.1F, -11.75F, 0.0F, -0.5F, 3.75F, 0.05F, -0.5F, 4.5F, 0.05F, -0.5F, -5.75F, -0.05F, -0.5F, -6.7F);
        this.turretModel[9].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[10].addShapeBox(-8.55F, -11.75F, -14.75F, 4, 12, 30, 0.0F, 0.0F, 0.075F, -4.0F, 0.1F, 0.1F, -1.5F, 0.0F, 0.1F, -1.75F, 0.0F, 0.075F, -4.25F, -0.05F, -0.5F, 1.55F, 0.1F, -0.5F, 3.75F, 0.15F, -0.5F, 3.3F, -0.05F, -0.5F, 1.3F);
        this.turretModel[10].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[11].addShapeBox(-11.55F, -11.75F, -14.75F, 3, 12, 40, 0.0F, 0.05F, 0.1F, -8.0F, 0.0F, 0.075F, -4.0F, 0.0F, 0.075F, -14.25F, 0.05F, 0.1F, -18.25F, 0.0F, -0.5F, -0.95F, 0.05F, -0.5F, 1.55F, 0.05F, -0.5F, -8.7F, 0.0F, -0.5F, -11.2F);
        this.turretModel[11].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[12].addShapeBox(-16.55F, -11.75F, -15.0F, 5, 12, 31, 0.0F, -3.0F, 0.1F, -12.5F, -0.05F, 0.1F, -8.25F, -0.05F, 0.1F, -9.0F, -3.0F, 0.1F, -13.25F, -1.6F, -0.5F, -5.2F, 0.0F, -0.5F, -1.2F, 0.0F, -0.5F, -1.95F, -1.6F, -0.5F, -5.95F);
        this.turretModel[12].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[13].addShapeBox(-13.6F, -11.85F, 1.75F, 1, 11, 1, 0.0F, -0.05F, 0.0F, 4.25F, -0.95F, 0.0F, -1.0F, -1.0F, 0.0F, -1.15F, 0.0F, 0.0F, -4.1F, 1.35F, 0.6F, 11.55F, -2.35F, 0.6F, -8.3F, -5.0F, 0.6F, 0.2F, 4.0F, 0.6F, -6.45F);
        this.turretModel[13].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[14].addShapeBox(17.0F, -6.25F, -10.5F, 3, 2, 21, 0.0F, 0.0F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, -0.75F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.turretModel[14].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[15].addShapeBox(16.0F, -9.25F, -10.5F, 4, 3, 21, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
        this.turretModel[15].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[16].addShapeBox(16.0F, -4.25F, -10.5F, 4, 3, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.turretModel[16].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[17].addShapeBox(-1.5F, -2.25F, -18.5F, 11, 9, 1, 0.0F, 0.0F, 0.7F, 0.0F, -2.55F, 0.7F, -0.5F, -2.55F, 0.7F, 0.0F, 0.0F, 0.7F, 0.0F, 0.0F, -5.0F, 0.0F, -1.65F, -5.3F, -0.5F, -1.65F, -5.3F, 0.0F, 0.0F, -5.0F, 0.0F);
        this.turretModel[17].setRotationPoint(0.0F, -28.5F, 0.0F);
        (this.turretModel[17]).rotateAngleX = -0.31415927F;
        (this.turretModel[17]).rotateAngleY = -0.03490659F;

        this.turretModel[18].addShapeBox(-1.5F, -2.25F, 17.8F, 11, 9, 1, 0.0F, 0.0F, 0.7F, 0.0F, -2.55F, 0.7F, 0.0F, -2.55F, 0.7F, -0.5F, 0.0F, 0.7F, 0.0F, 0.0F, -5.0F, 0.0F, -1.65F, -5.3F, 0.0F, -1.65F, -5.3F, -0.5F, 0.0F, -5.0F, 0.0F);
        this.turretModel[18].setRotationPoint(0.0F, -28.5F, 0.0F);
        (this.turretModel[18]).rotateAngleX = 0.31415927F;
        (this.turretModel[18]).rotateAngleY = -0.03490659F;

        this.turretModel[19].addShapeBox(16.0F, -3.25F, -4.75F, 1, 7, 9, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F);
        this.turretModel[19].setRotationPoint(0.0F, -28.5F, 0.0F);
        (this.turretModel[19]).rotateAngleY = 2.5132742F;
        (this.turretModel[19]).rotateAngleZ = 0.3577925F;

        this.turretModel[20].addShapeBox(16.0F, -3.25F, -3.75F, 1, 7, 9, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F);
        this.turretModel[20].setRotationPoint(0.0F, -28.5F, 0.0F);
        (this.turretModel[20]).rotateAngleY = 3.7175512F;
        (this.turretModel[20]).rotateAngleZ = 0.3577925F;

        this.turretModel[21].addShapeBox(13.5F, -11.0F, 2.5F, 1, 1, 1, 0.0F, -0.125F, 0.5F, -0.125F, -0.125F, 0.5F, -0.125F, -0.125F, 0.5F, -0.125F, -0.125F, 0.5F, -0.125F, 0.05F, 0.0F, 0.05F, 0.05F, 0.0F, 0.05F, 0.05F, 0.0F, 0.05F, 0.05F, 0.0F, 0.05F);
        this.turretModel[21].setRotationPoint(0.0F, -28.5F, 0.0F);

        this.turretModel[22].addShapeBox(13.5F, -11.0F, -3.5F, 1, 1, 1, 0.0F, -0.125F, 0.5F, -0.125F, -0.125F, 0.5F, -0.125F, -0.125F, 0.5F, -0.125F, -0.125F, 0.5F, -0.125F, 0.05F, 0.0F, 0.05F, 0.05F, 0.0F, 0.05F, 0.05F, 0.0F, 0.05F, 0.05F, 0.0F, 0.05F);
        this.turretModel[22].setRotationPoint(0.0F, -28.5F, 0.0F);


        this.barrelModel = new ModelRendererTurbo[14];
        this.barrelModel[0] = new ModelRendererTurbo((ModelBase) this, 267, 228, this.textureX, this.textureY);
        this.barrelModel[1] = new ModelRendererTurbo((ModelBase) this, 258, 257, this.textureX, this.textureY);
        this.barrelModel[2] = new ModelRendererTurbo((ModelBase) this, 270, 240, this.textureX, this.textureY);
        this.barrelModel[3] = new ModelRendererTurbo((ModelBase) this, 270, 240, this.textureX, this.textureY);
        this.barrelModel[4] = new ModelRendererTurbo((ModelBase) this, 267, 228, this.textureX, this.textureY);
        this.barrelModel[5] = new ModelRendererTurbo((ModelBase) this, 258, 257, this.textureX, this.textureY);
        this.barrelModel[6] = new ModelRendererTurbo((ModelBase) this, 270, 240, this.textureX, this.textureY);
        this.barrelModel[7] = new ModelRendererTurbo((ModelBase) this, 298, 228, this.textureX, this.textureY);
        this.barrelModel[8] = new ModelRendererTurbo((ModelBase) this, 270, 240, this.textureX, this.textureY);
        this.barrelModel[9] = new ModelRendererTurbo((ModelBase) this, 270, 240, this.textureX, this.textureY);
        this.barrelModel[10] = new ModelRendererTurbo((ModelBase) this, 270, 240, this.textureX, this.textureY);
        this.barrelModel[11] = new ModelRendererTurbo((ModelBase) this, 270, 240, this.textureX, this.textureY);
        this.barrelModel[12] = new ModelRendererTurbo((ModelBase) this, 270, 240, this.textureX, this.textureY);
        this.barrelModel[13] = new ModelRendererTurbo((ModelBase) this, 298, 228, this.textureX, this.textureY);

        this.barrelModel[0].addShapeBox(3.0F, -1.25F, -0.75F, 10, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        this.barrelModel[0].setRotationPoint(16.75F, -33.25F, 7.75F);

        this.barrelModel[1].addShapeBox(3.0F, -0.75F, -1.25F, 10, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
        this.barrelModel[1].setRotationPoint(16.75F, -33.25F, 7.75F);

        this.barrelModel[2].addShapeBox(3.0F, -1.25F, -0.25F, 10, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.barrelModel[2].setRotationPoint(16.75F, -33.25F, 7.75F);

        this.barrelModel[3].addShapeBox(3.0F, -0.25F, -0.25F, 10, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
        this.barrelModel[3].setRotationPoint(16.75F, -33.25F, 7.75F);

        this.barrelModel[4].addShapeBox(3.0F, -1.25F, -0.75F, 10, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F);
        this.barrelModel[4].setRotationPoint(16.75F, -33.25F, -7.75F);

        this.barrelModel[5].addShapeBox(3.0F, -0.75F, -1.25F, 10, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 1.0F, 0.0F, -0.5F, 1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F);
        this.barrelModel[5].setRotationPoint(16.75F, -33.25F, -7.75F);

        this.barrelModel[6].addShapeBox(3.0F, -1.25F, -1.25F, 10, 1, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
        this.barrelModel[6].setRotationPoint(16.75F, -33.25F, -7.75F);

        this.barrelModel[7].addShapeBox(13.0F, -1.25F, -1.25F, 1, 1, 2, 0.0F, 0.0F, -0.55F, -0.55F, 0.5F, -0.925F, -0.925F, 0.5F, -0.925F, -0.425F, 0.0F, -0.55F, -0.05F, 0.0F, 0.95F, -0.55F, 0.5F, 0.575F, -0.925F, 0.5F, 0.575F, -0.425F, 0.0F, 0.95F, -0.05F);
        this.barrelModel[7].setRotationPoint(16.75F, -33.25F, 7.75F);

        this.barrelModel[8].addShapeBox(3.0F, -1.25F, 0.25F, 10, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
        this.barrelModel[8].setRotationPoint(16.75F, -33.25F, -7.75F);

        this.barrelModel[9].addShapeBox(3.0F, 0.25F, -1.25F, 10, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
        this.barrelModel[9].setRotationPoint(16.75F, -33.25F, -7.75F);

        this.barrelModel[10].addShapeBox(3.0F, 0.25F, 0.25F, 10, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F);
        this.barrelModel[10].setRotationPoint(16.75F, -33.25F, -7.75F);

        this.barrelModel[11].addShapeBox(3.0F, -1.25F, -0.75F, 10, 1, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
        this.barrelModel[11].setRotationPoint(16.75F, -33.25F, 7.75F);

        this.barrelModel[12].addShapeBox(3.0F, -0.25F, -0.75F, 10, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
        this.barrelModel[12].setRotationPoint(16.75F, -33.25F, 7.75F);

        this.barrelModel[13].addShapeBox(13.0F, -1.25F, -1.25F, 1, 1, 2, 0.0F, 0.0F, -0.55F, -0.55F, 0.5F, -0.925F, -0.925F, 0.5F, -0.925F, -0.425F, 0.0F, -0.55F, -0.05F, 0.0F, 0.95F, -0.55F, 0.5F, 0.575F, -0.925F, 0.5F, 0.575F, -0.425F, 0.0F, 0.95F, -0.05F);
        this.barrelModel[13].setRotationPoint(16.75F, -33.25F, -7.75F);


        this.leftTrackWheelModels = new ModelRendererTurbo[9];
        this.leftTrackWheelModels[0] = new ModelRendererTurbo((ModelBase) this, 4, 34, this.textureX, this.textureY);
        this.leftTrackWheelModels[1] = new ModelRendererTurbo((ModelBase) this, 4, 34, this.textureX, this.textureY);
        this.leftTrackWheelModels[2] = new ModelRendererTurbo((ModelBase) this, 4, 34, this.textureX, this.textureY);
        this.leftTrackWheelModels[3] = new ModelRendererTurbo((ModelBase) this, 4, 34, this.textureX, this.textureY);
        this.leftTrackWheelModels[4] = new ModelRendererTurbo((ModelBase) this, 0, 59, this.textureX, this.textureY);
        this.leftTrackWheelModels[5] = new ModelRendererTurbo((ModelBase) this, 425, 346, this.textureX, this.textureY);
        this.leftTrackWheelModels[6] = new ModelRendererTurbo((ModelBase) this, 230, 117, this.textureX, this.textureY);
        this.leftTrackWheelModels[7] = new ModelRendererTurbo((ModelBase) this, 230, 117, this.textureX, this.textureY);
        this.leftTrackWheelModels[8] = new ModelRendererTurbo((ModelBase) this, 230, 117, this.textureX, this.textureY);

        this.leftTrackWheelModels[0].addShape3D(9.0F, -9.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(12.0D, 0.0D, 12, 0), new Coord2D(18.0D, 6.0D, 18, 6), new Coord2D(18.0D, 12.0D, 18, 12), new Coord2D(12.0D, 18.0D, 12, 18), new Coord2D(6.0D, 18.0D, 6, 18), new Coord2D(0.0D, 12.0D, 0, 12)}), 3.0F, 18, 18, 60, 3, 0, new float[]{6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F});
        this.leftTrackWheelModels[0].setRotationPoint(14.25F, 7.5F, -22.0F);

        this.leftTrackWheelModels[1].addShape3D(9.0F, -9.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(12.0D, 0.0D, 12, 0), new Coord2D(18.0D, 6.0D, 18, 6), new Coord2D(18.0D, 12.0D, 18, 12), new Coord2D(12.0D, 18.0D, 12, 18), new Coord2D(6.0D, 18.0D, 6, 18), new Coord2D(0.0D, 12.0D, 0, 12)}), 3.0F, 18, 18, 60, 3, 0, new float[]{6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F});
        this.leftTrackWheelModels[1].setRotationPoint(34.15F, 7.25F, -22.0F);

        this.leftTrackWheelModels[2].addShape3D(9.0F, -9.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(12.0D, 0.0D, 12, 0), new Coord2D(18.0D, 6.0D, 18, 6), new Coord2D(18.0D, 12.0D, 18, 12), new Coord2D(12.0D, 18.0D, 12, 18), new Coord2D(6.0D, 18.0D, 6, 18), new Coord2D(0.0D, 12.0D, 0, 12)}), 3.0F, 18, 18, 60, 3, 0, new float[]{6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F});
        this.leftTrackWheelModels[2].setRotationPoint(-7.9F, 7.5F, -22.0F);

        this.leftTrackWheelModels[3].addShape3D(9.0F, -9.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(12.0D, 0.0D, 12, 0), new Coord2D(18.0D, 6.0D, 18, 6), new Coord2D(18.0D, 12.0D, 18, 12), new Coord2D(12.0D, 18.0D, 12, 18), new Coord2D(6.0D, 18.0D, 6, 18), new Coord2D(0.0D, 12.0D, 0, 12)}), 3.0F, 18, 18, 60, 3, 0, new float[]{6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F});
        this.leftTrackWheelModels[3].setRotationPoint(-27.5F, 7.5F, -22.0F);

        this.leftTrackWheelModels[4].addShape3D(10.5F, -10.5F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(21.0D, 7.0D, 21, 7), new Coord2D(21.0D, 14.0D, 21, 14), new Coord2D(14.0D, 21.0D, 14, 21), new Coord2D(7.0D, 21.0D, 7, 21), new Coord2D(0.0D, 14.0D, 0, 14)}), 3.0F, 21, 21, 68, 3, 0, new float[]{7.0F, 10.0F, 7.0F, 10.0F, 7.0F, 10.0F, 7.0F, 10.0F});
        this.leftTrackWheelModels[4].setRotationPoint(-52.5F, 6.65F, -22.0F);

        this.leftTrackWheelModels[5].addShape3D(10.5F, -10.5F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(21.0D, 7.0D, 21, 7), new Coord2D(21.0D, 14.0D, 21, 14), new Coord2D(14.0D, 21.0D, 14, 21), new Coord2D(7.0D, 21.0D, 7, 21), new Coord2D(0.0D, 14.0D, 0, 14)}), 3.0F, 21, 21, 68, 3, 0, new float[]{7.0F, 10.0F, 7.0F, 10.0F, 7.0F, 10.0F, 7.0F, 10.0F});
        this.leftTrackWheelModels[5].setRotationPoint(54.8F, -1.35F, -22.0F);

        this.leftTrackWheelModels[6].addShape3D(3.0F, -3.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4)}), 3.0F, 6, 6, 20, 3, 0, new float[]{2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F});
        this.leftTrackWheelModels[6].setRotationPoint(-15.8F, -6.4F, -22.0F);

        this.leftTrackWheelModels[7].addShape3D(3.0F, -3.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4)}), 3.0F, 6, 6, 20, 3, 0, new float[]{2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F});
        this.leftTrackWheelModels[7].setRotationPoint(2.5F, -7.2F, -22.0F);

        this.leftTrackWheelModels[8].addShape3D(3.0F, -3.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4)}), 3.0F, 6, 6, 20, 3, 0, new float[]{2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F});
        this.leftTrackWheelModels[8].setRotationPoint(24.4F, -7.65F, -22.0F);


        this.rightTrackWheelModels = new ModelRendererTurbo[9];
        this.rightTrackWheelModels[0] = new ModelRendererTurbo((ModelBase) this, 4, 34, this.textureX, this.textureY);
        this.rightTrackWheelModels[1] = new ModelRendererTurbo((ModelBase) this, 4, 34, this.textureX, this.textureY);
        this.rightTrackWheelModels[2] = new ModelRendererTurbo((ModelBase) this, 4, 34, this.textureX, this.textureY);
        this.rightTrackWheelModels[3] = new ModelRendererTurbo((ModelBase) this, 4, 34, this.textureX, this.textureY);
        this.rightTrackWheelModels[4] = new ModelRendererTurbo((ModelBase) this, 0, 59, this.textureX, this.textureY);
        this.rightTrackWheelModels[5] = new ModelRendererTurbo((ModelBase) this, 230, 117, this.textureX, this.textureY);
        this.rightTrackWheelModels[6] = new ModelRendererTurbo((ModelBase) this, 230, 117, this.textureX, this.textureY);
        this.rightTrackWheelModels[7] = new ModelRendererTurbo((ModelBase) this, 230, 117, this.textureX, this.textureY);
        this.rightTrackWheelModels[8] = new ModelRendererTurbo((ModelBase) this, 425, 346, this.textureX, this.textureY);

        this.rightTrackWheelModels[0].addShape3D(9.0F, -9.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(12.0D, 0.0D, 12, 0), new Coord2D(18.0D, 6.0D, 18, 6), new Coord2D(18.0D, 12.0D, 18, 12), new Coord2D(12.0D, 18.0D, 12, 18), new Coord2D(6.0D, 18.0D, 6, 18), new Coord2D(0.0D, 12.0D, 0, 12)}), 3.0F, 18, 18, 60, 3, 0, new float[]{6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F});
        this.rightTrackWheelModels[0].setRotationPoint(14.25F, 7.5F, 35.0F);

        this.rightTrackWheelModels[1].addShape3D(9.0F, -9.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(12.0D, 0.0D, 12, 0), new Coord2D(18.0D, 6.0D, 18, 6), new Coord2D(18.0D, 12.0D, 18, 12), new Coord2D(12.0D, 18.0D, 12, 18), new Coord2D(6.0D, 18.0D, 6, 18), new Coord2D(0.0D, 12.0D, 0, 12)}), 3.0F, 18, 18, 60, 3, 0, new float[]{6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F});
        this.rightTrackWheelModels[1].setRotationPoint(34.15F, 7.25F, 35.0F);

        this.rightTrackWheelModels[2].addShape3D(9.0F, -9.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(12.0D, 0.0D, 12, 0), new Coord2D(18.0D, 6.0D, 18, 6), new Coord2D(18.0D, 12.0D, 18, 12), new Coord2D(12.0D, 18.0D, 12, 18), new Coord2D(6.0D, 18.0D, 6, 18), new Coord2D(0.0D, 12.0D, 0, 12)}), 3.0F, 18, 18, 60, 3, 0, new float[]{6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F});
        this.rightTrackWheelModels[2].setRotationPoint(-7.9F, 7.5F, 35.0F);

        this.rightTrackWheelModels[3].addShape3D(9.0F, -9.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(12.0D, 0.0D, 12, 0), new Coord2D(18.0D, 6.0D, 18, 6), new Coord2D(18.0D, 12.0D, 18, 12), new Coord2D(12.0D, 18.0D, 12, 18), new Coord2D(6.0D, 18.0D, 6, 18), new Coord2D(0.0D, 12.0D, 0, 12)}), 3.0F, 18, 18, 60, 3, 0, new float[]{6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F, 6.0F, 9.0F});
        this.rightTrackWheelModels[3].setRotationPoint(-27.5F, 7.5F, 35.0F);

        this.rightTrackWheelModels[4].addShape3D(10.5F, -10.5F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(21.0D, 7.0D, 21, 7), new Coord2D(21.0D, 14.0D, 21, 14), new Coord2D(14.0D, 21.0D, 14, 21), new Coord2D(7.0D, 21.0D, 7, 21), new Coord2D(0.0D, 14.0D, 0, 14)}), 3.0F, 21, 21, 68, 3, 0, new float[]{7.0F, 10.0F, 7.0F, 10.0F, 7.0F, 10.0F, 7.0F, 10.0F});
        this.rightTrackWheelModels[4].setRotationPoint(-52.5F, 6.65F, 35.0F);

        this.rightTrackWheelModels[5].addShape3D(3.0F, -3.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4)}), 3.0F, 6, 6, 20, 3, 0, new float[]{2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F});
        this.rightTrackWheelModels[5].setRotationPoint(-15.8F, -6.4F, 35.0F);

        this.rightTrackWheelModels[6].addShape3D(3.0F, -3.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4)}), 3.0F, 6, 6, 20, 3, 0, new float[]{2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F});
        this.rightTrackWheelModels[6].setRotationPoint(2.5F, -7.2F, 35.0F);

        this.rightTrackWheelModels[7].addShape3D(3.0F, -3.0F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4)}), 3.0F, 6, 6, 20, 3, 0, new float[]{2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F});
        this.rightTrackWheelModels[7].setRotationPoint(24.4F, -7.65F, 35.0F);

        this.rightTrackWheelModels[8].addShape3D(10.5F, -10.5F, 0.0F, new Shape2D(new Coord2D[]{new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(21.0D, 7.0D, 21, 7), new Coord2D(21.0D, 14.0D, 21, 14), new Coord2D(14.0D, 21.0D, 14, 21), new Coord2D(7.0D, 21.0D, 7, 21), new Coord2D(0.0D, 14.0D, 0, 14)}), 3.0F, 21, 21, 68, 3, 0, new float[]{7.0F, 10.0F, 7.0F, 10.0F, 7.0F, 10.0F, 7.0F, 10.0F});
        this.rightTrackWheelModels[8].setRotationPoint(54.8F, -1.35F, 35.0F);


        this.leftTrackModel = new ModelRendererTurbo[27];
        this.leftTrackModel[0] = new ModelRendererTurbo((ModelBase) this, 156, 251, this.textureX, this.textureY);
        this.leftTrackModel[1] = new ModelRendererTurbo((ModelBase) this, 156, 272, this.textureX, this.textureY);
        this.leftTrackModel[2] = new ModelRendererTurbo((ModelBase) this, 92, 253, this.textureX, this.textureY);
        this.leftTrackModel[3] = new ModelRendererTurbo((ModelBase) this, 4, 340, this.textureX, this.textureY);
        this.leftTrackModel[4] = new ModelRendererTurbo((ModelBase) this, 81, 79, this.textureX, this.textureY);
        this.leftTrackModel[5] = new ModelRendererTurbo((ModelBase) this, 184, 41, this.textureX, this.textureY);
        this.leftTrackModel[6] = new ModelRendererTurbo((ModelBase) this, 222, 271, this.textureX, this.textureY);
        this.leftTrackModel[7] = new ModelRendererTurbo((ModelBase) this, 180, 333, this.textureX, this.textureY);
        this.leftTrackModel[8] = new ModelRendererTurbo((ModelBase) this, 239, 329, this.textureX, this.textureY);
        this.leftTrackModel[9] = new ModelRendererTurbo((ModelBase) this, 301, 178, this.textureX, this.textureY);
        this.leftTrackModel[10] = new ModelRendererTurbo((ModelBase) this, 101, 380, this.textureX, this.textureY);
        this.leftTrackModel[11] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.leftTrackModel[12] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.leftTrackModel[13] = new ModelRendererTurbo((ModelBase) this, 101, 395, this.textureX, this.textureY);
        this.leftTrackModel[14] = new ModelRendererTurbo((ModelBase) this, 97, 119, this.textureX, this.textureY);
        this.leftTrackModel[15] = new ModelRendererTurbo((ModelBase) this, 113, 85, this.textureX, this.textureY);
        this.leftTrackModel[16] = new ModelRendererTurbo((ModelBase) this, 203, 6, this.textureX, this.textureY);
        this.leftTrackModel[17] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.leftTrackModel[18] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.leftTrackModel[19] = new ModelRendererTurbo((ModelBase) this, 136, 448, this.textureX, this.textureY);
        this.leftTrackModel[20] = new ModelRendererTurbo((ModelBase) this, 382, 6, this.textureX, this.textureY);
        this.leftTrackModel[21] = new ModelRendererTurbo((ModelBase) this, 349, 151, this.textureX, this.textureY);
        this.leftTrackModel[22] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.leftTrackModel[23] = new ModelRendererTurbo((ModelBase) this, 189, 248, this.textureX, this.textureY);
        this.leftTrackModel[24] = new ModelRendererTurbo((ModelBase) this, 210, 227, this.textureX, this.textureY);
        this.leftTrackModel[25] = new ModelRendererTurbo((ModelBase) this, 35, 277, this.textureX, this.textureY);
        this.leftTrackModel[26] = new ModelRendererTurbo((ModelBase) this, 47, 316, this.textureX, this.textureY);

        this.leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 7, 10, 0.0F);
        this.leftTrackModel[0].setRotationPoint(65.3F, -4.9F, -28.75F);

        this.leftTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 2, 9, 10, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -7.0F, -2.0F, 0.0F, 7.0F, -2.0F, 0.0F, 7.0F, -2.0F, 0.0F, -7.0F, -2.0F, 0.0F);
        this.leftTrackModel[1].setRotationPoint(58.3F, -11.9F, -28.75F);

        this.leftTrackModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 12, 10, 0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -5.0F, 0.0F);
        this.leftTrackModel[2].setRotationPoint(58.3F, 2.1F, -28.75F);

        this.leftTrackModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 75, 2, 10, 0.0F, 2.0F, -1.3F, 0.0F, 0.3F, 0.7F, 0.0F, 0.3F, 0.7F, 0.0F, 2.0F, -1.3F, 0.0F, 0.5F, 0.7F, 0.0F, 1.45F, -1.55F, 0.0F, 1.45F, -1.55F, 0.0F, 0.5F, 0.7F, 0.0F);
        this.leftTrackModel[3].setRotationPoint(-16.15F, -12.2F, -28.75F);

        this.leftTrackModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 18.0F, 1.3F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 18.0F, 1.3F, 0.0F, 13.0F, 4.0F, 0.0F, -4.0F, 1.3F, 0.0F, -4.0F, 1.3F, 0.0F, 13.0F, 4.0F, 0.0F);
        this.leftTrackModel[4].setRotationPoint(19.0F, 6.2F, -27.0F);

        this.leftTrackModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -14.75F, 4.45F, 0.0F, 16.0F, 4.6F, 0.0F, 16.0F, 4.6F, 0.0F, -14.75F, 4.45F, 0.0F, -14.75F, -2.5F, 0.0F, 21.0F, 0.7F, 0.0F, 21.0F, 0.7F, 0.0F, -14.75F, -2.5F, 0.0F);
        this.leftTrackModel[5].setRotationPoint(-16.0F, 9.5F, -27.0F);

        this.leftTrackModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 2, 29, 10, 0.0F, -7.0F, 0.0F, 0.0F, 5.0F, -2.0F, 0.0F, 5.0F, -2.0F, 0.0F, -7.0F, 0.0F, 0.0F, 18.4F, -21.6F, 0.0F, -19.5F, -19.6F, 0.0F, -19.5F, -19.6F, 0.0F, 18.4F, -21.6F, 0.0F);
        this.leftTrackModel[6].setRotationPoint(51.3F, 9.1F, -28.75F);

        this.leftTrackModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 20, 1, 10, 0.0F, 0.0F, -3.4F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 4.4F, 0.0F, 1.35F, 0.4F, 0.0F, 1.35F, 0.4F, 0.0F, 0.0F, 4.4F, 0.0F);
        this.leftTrackModel[7].setRotationPoint(-38.0F, -10.9F, -28.75F);

        this.leftTrackModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 18, 1, 10, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.5F, 0.0F);
        this.leftTrackModel[8].setRotationPoint(-56.0F, -7.5F, -28.75F);

        this.leftTrackModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 3, 15, 1, 0.0F, 0.6F, -0.6F, 0.0F, -0.2F, 0.25F, 0.0F, -0.2F, 0.25F, 2.25F, 0.6F, -0.6F, 2.25F, -4.3F, -0.3F, 0.0F, 4.5F, -1.4F, 0.0F, 4.5F, -1.4F, 2.25F, -4.3F, -0.3F, 2.25F);
        this.leftTrackModel[9].setRotationPoint(29.0F, -8.5F, -21.5F);

        this.leftTrackModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 10, 3, 1, 0.0F, 2.95F, -4.45F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.95F, -4.45F, 0.0F, 1.25F, 3.45F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, 1.25F, 3.45F, 0.0F);
        this.leftTrackModel[10].setRotationPoint(-5.0F, 0.5F, -26.5F);

        this.leftTrackModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 3.0F, -0.4F, 0.0F, -1.9F, 0.35F, 0.0F, -1.9F, 0.35F, 0.0F, 3.0F, -0.4F, 0.0F, 3.25F, 0.05F, 0.0F, 0.65F, 0.45F, 0.0F, 0.65F, 0.45F, 0.0F, 3.25F, 0.05F, 0.0F);
        this.leftTrackModel[11].setRotationPoint(5.5F, 3.5F, -26.5F);

        this.leftTrackModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.45F, -0.4F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, 0.5F, 0.45F, -0.4F, 0.5F, 0.8F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.8F, -0.15F, 0.8F);
        this.leftTrackModel[12].setRotationPoint(7.0F, 4.5F, -26.9F);

        this.leftTrackModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 10, 3, 1, 0.0F, -1.25F, -0.6F, 0.0F, 2.0F, -3.6F, 0.0F, 2.0F, -3.6F, 0.0F, -1.25F, -0.6F, 0.0F, -0.4F, 0.65F, 0.0F, 1.1F, 3.45F, 0.0F, 1.1F, 3.45F, 0.0F, -0.4F, 0.65F, 0.0F);
        this.leftTrackModel[13].setRotationPoint(-41.0F, 0.0F, -26.5F);

        this.leftTrackModel[14].addShapeBox(36.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 44.75F, 2.25F, 0.0F, -38.5F, 3.0F, 0.0F, -38.5F, 3.0F, -0.5F, 44.75F, 2.25F, -0.5F, 41.5F, 2.0F, 0.0F, -36.0F, 0.1F, 0.0F, -36.0F, 0.1F, -0.5F, 41.5F, 2.0F, -0.5F);
        this.leftTrackModel[14].setRotationPoint(-38.0F, 8.5F, -26.75F);

        this.leftTrackModel[15].addShapeBox(-40.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -34.45F, 4.0F, 0.0F, 37.75F, 2.25F, 0.0F, 37.75F, 2.25F, -0.5F, -34.45F, 4.0F, -0.5F, -34.45F, -2.0F, 0.0F, 41.0F, 2.0F, 0.0F, 41.0F, 2.0F, -0.5F, -34.45F, -2.0F, -0.5F);
        this.leftTrackModel[15].setRotationPoint(-45.5F, 8.5F, -26.75F);

        this.leftTrackModel[16].addShapeBox(-40.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, -40.0F, 0.0F, 0.0F, 41.45F, 1.0F, 0.0F, 41.45F, 1.0F, -0.5F, -40.0F, 0.0F, -0.5F, -40.95F, 1.75F, 0.0F, 41.45F, 1.0F, 0.0F, 41.45F, 1.1F, -0.5F, -40.95F, 1.75F, -0.5F);
        this.leftTrackModel[16].setRotationPoint(-56.5F, 5.5F, -26.75F);

        this.leftTrackModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.9F, 0.35F, 0.0F, 3.0F, -0.2F, 0.0F, 3.0F, -0.2F, 0.0F, -1.9F, 0.35F, 0.0F, 0.65F, 0.45F, 0.0F, 3.25F, 0.05F, 0.0F, 3.25F, 0.05F, 0.0F, 0.65F, 0.45F, 0.0F);
        this.leftTrackModel[17].setRotationPoint(-42.5F, 4.0F, -26.5F);

        this.leftTrackModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.35F, -0.5F, -0.3F, 0.45F, -0.4F, -0.3F, 0.45F, -0.4F, 0.5F, -0.35F, -0.5F, 0.5F, 0.0F, 0.05F, 0.0F, 0.8F, -0.15F, 0.0F, 0.8F, -0.15F, 0.8F, 0.0F, 0.05F, 0.8F);
        this.leftTrackModel[18].setRotationPoint(-43.5F, 4.85F, -26.9F);

        this.leftTrackModel[19].addShapeBox(1.0F, 0.0F, 0.0F, 46, 4, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F);
        this.leftTrackModel[19].setRotationPoint(-41.0F, 4.5F, -28.0F);

        this.leftTrackModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 21, 2, 2, 0.0F, 0.65F, -0.25F, 0.0F, 1.3F, 1.15F, 0.0F, 1.3F, 1.15F, 0.0F, 0.65F, -0.25F, 0.0F, 0.65F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.25F, 0.0F);
        this.leftTrackModel[20].setRotationPoint(14.15F, 6.25F, -22.0F);

        this.leftTrackModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 17, 9, 1, 0.0F, -7.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.5F, 1.0F, -7.0F, 0.5F, 1.0F, -5.0F, -0.2F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 1.0F, -5.0F, -0.2F, 1.0F);
        this.leftTrackModel[21].setRotationPoint(11.5F, -2.5F, -21.75F);
        (this.leftTrackModel[21]).rotateAngleX = -0.03490659F;

        this.leftTrackModel[22].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.leftTrackModel[22].setRotationPoint(-54.0F, 5.5F, -26.0F);

        this.leftTrackModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 2, 14, 10, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -2.0F, -5.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, -2.0F, -5.0F, 0.0F);
        this.leftTrackModel[23].setRotationPoint(-58.35F, 9.5F, -28.75F);

        this.leftTrackModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 2, 12, 10, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 7.0F, -5.0F, 0.0F, -7.0F, -5.0F, 0.0F, -7.0F, -5.0F, 0.0F, 7.0F, -5.0F, 0.0F);
        this.leftTrackModel[24].setRotationPoint(-58.0F, -4.0F, -28.75F);

        this.leftTrackModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 2, 7, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
        this.leftTrackModel[25].setRotationPoint(-65.0F, 2.5F, -28.75F);

        this.leftTrackModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 90, 2, 10, 0.0F, 0.35F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
        this.leftTrackModel[26].setRotationPoint(-56.0F, 16.5F, -28.75F);


        this.rightTrackModel = new ModelRendererTurbo[27];
        this.rightTrackModel[0] = new ModelRendererTurbo((ModelBase) this, 156, 251, this.textureX, this.textureY);
        this.rightTrackModel[1] = new ModelRendererTurbo((ModelBase) this, 156, 272, this.textureX, this.textureY);
        this.rightTrackModel[2] = new ModelRendererTurbo((ModelBase) this, 92, 253, this.textureX, this.textureY);
        this.rightTrackModel[3] = new ModelRendererTurbo((ModelBase) this, 4, 340, this.textureX, this.textureY);
        this.rightTrackModel[4] = new ModelRendererTurbo((ModelBase) this, 35, 277, this.textureX, this.textureY);
        this.rightTrackModel[5] = new ModelRendererTurbo((ModelBase) this, 81, 79, this.textureX, this.textureY);
        this.rightTrackModel[6] = new ModelRendererTurbo((ModelBase) this, 184, 41, this.textureX, this.textureY);
        this.rightTrackModel[7] = new ModelRendererTurbo((ModelBase) this, 203, 6, this.textureX, this.textureY);
        this.rightTrackModel[8] = new ModelRendererTurbo((ModelBase) this, 47, 316, this.textureX, this.textureY);
        this.rightTrackModel[9] = new ModelRendererTurbo((ModelBase) this, 222, 271, this.textureX, this.textureY);
        this.rightTrackModel[10] = new ModelRendererTurbo((ModelBase) this, 189, 248, this.textureX, this.textureY);
        this.rightTrackModel[11] = new ModelRendererTurbo((ModelBase) this, 180, 333, this.textureX, this.textureY);
        this.rightTrackModel[12] = new ModelRendererTurbo((ModelBase) this, 239, 329, this.textureX, this.textureY);
        this.rightTrackModel[13] = new ModelRendererTurbo((ModelBase) this, 210, 227, this.textureX, this.textureY);
        this.rightTrackModel[14] = new ModelRendererTurbo((ModelBase) this, 136, 448, this.textureX, this.textureY);
        this.rightTrackModel[15] = new ModelRendererTurbo((ModelBase) this, 97, 119, this.textureX, this.textureY);
        this.rightTrackModel[16] = new ModelRendererTurbo((ModelBase) this, 101, 380, this.textureX, this.textureY);
        this.rightTrackModel[17] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.rightTrackModel[18] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.rightTrackModel[19] = new ModelRendererTurbo((ModelBase) this, 101, 395, this.textureX, this.textureY);
        this.rightTrackModel[20] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.rightTrackModel[21] = new ModelRendererTurbo((ModelBase) this, 301, 178, this.textureX, this.textureY);
        this.rightTrackModel[22] = new ModelRendererTurbo((ModelBase) this, 382, 6, this.textureX, this.textureY);
        this.rightTrackModel[23] = new ModelRendererTurbo((ModelBase) this, 349, 151, this.textureX, this.textureY);
        this.rightTrackModel[24] = new ModelRendererTurbo((ModelBase) this, 113, 85, this.textureX, this.textureY);
        this.rightTrackModel[25] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);
        this.rightTrackModel[26] = new ModelRendererTurbo((ModelBase) this, 0, 0, this.textureX, this.textureY);

        this.rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 7, 10, 0.0F);
        this.rightTrackModel[0].setRotationPoint(65.3F, -4.9F, 28.5F);

        this.rightTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 2, 10, 10, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, -7.0F, -3.0F, 0.0F, 7.0F, -3.0F, 0.0F, 7.0F, -3.0F, 0.0F, -7.0F, -3.0F, 0.0F);
        this.rightTrackModel[1].setRotationPoint(58.3F, -11.9F, 28.5F);

        this.rightTrackModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 12, 10, 0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, -5.0F, 0.0F);
        this.rightTrackModel[2].setRotationPoint(58.3F, 2.1F, 28.5F);

        this.rightTrackModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 75, 2, 10, 0.0F, 2.0F, -1.3F, 0.0F, 0.3F, 0.7F, 0.0F, 0.3F, 0.7F, 0.0F, 2.0F, -1.3F, 0.0F, 0.5F, 0.7F, 0.0F, 1.45F, -1.55F, 0.0F, 1.45F, -1.55F, 0.0F, 0.5F, 0.7F, 0.0F);
        this.rightTrackModel[3].setRotationPoint(-16.15F, -12.2F, 28.5F);

        this.rightTrackModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 2, 7, 10, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
        this.rightTrackModel[4].setRotationPoint(-65.0F, 2.5F, 28.5F);

        this.rightTrackModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 18.0F, 1.3F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 18.0F, 1.3F, 0.0F, 13.0F, 4.0F, 0.0F, -4.0F, 1.3F, 0.0F, -4.0F, 1.3F, 0.0F, 13.0F, 4.0F, 0.0F);
        this.rightTrackModel[5].setRotationPoint(19.0F, 6.2F, 35.0F);

        this.rightTrackModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -15.75F, 4.45F, 0.0F, 16.0F, 4.6F, 0.0F, 16.0F, 4.6F, 0.0F, -15.75F, 4.45F, 0.0F, -14.75F, -2.5F, 0.0F, 21.0F, 0.7F, 0.0F, 21.0F, 0.7F, 0.0F, -14.75F, -2.5F, 0.0F);
        this.rightTrackModel[6].setRotationPoint(-16.0F, 9.5F, 35.0F);

        this.rightTrackModel[7].addShapeBox(-40.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F, -40.0F, 0.0F, -0.5F, 41.45F, 1.0F, -0.5F, 41.45F, 1.0F, 0.0F, -40.0F, 0.0F, 0.0F, -40.95F, 1.75F, -0.5F, 41.45F, 1.1F, -0.5F, 41.45F, 1.0F, 0.0F, -40.95F, 1.75F, 0.0F);
        this.rightTrackModel[7].setRotationPoint(-56.5F, 5.5F, 34.75F);

        this.rightTrackModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 90, 2, 10, 0.0F, 0.35F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
        this.rightTrackModel[8].setRotationPoint(-56.0F, 16.5F, 28.5F);

        this.rightTrackModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 2, 29, 10, 0.0F, -7.0F, 0.0F, 0.0F, 5.0F, -2.0F, 0.0F, 5.0F, -2.0F, 0.0F, -7.0F, 0.0F, 0.0F, 18.4F, -21.6F, 0.0F, -19.5F, -19.6F, 0.0F, -19.5F, -19.6F, 0.0F, 18.4F, -21.6F, 0.0F);
        this.rightTrackModel[9].setRotationPoint(51.3F, 9.1F, 28.5F);

        this.rightTrackModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 2, 14, 10, 0.0F, 7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 7.0F, 0.0F, 0.0F, -2.0F, -5.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, -2.0F, -5.0F, 0.0F);
        this.rightTrackModel[10].setRotationPoint(-58.35F, 9.5F, 28.5F);

        this.rightTrackModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 20, 1, 10, 0.0F, 0.0F, -3.4F, 0.0F, -0.15F, 0.0F, 0.0F, -0.15F, 0.0F, 0.0F, 0.0F, -3.4F, 0.0F, 0.0F, 4.4F, 0.0F, 1.35F, 0.4F, 0.0F, 1.35F, 0.4F, 0.0F, 0.0F, 4.4F, 0.0F);
        this.rightTrackModel[11].setRotationPoint(-38.0F, -10.9F, 28.5F);

        this.rightTrackModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 18, 1, 10, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 2.5F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 2.5F, 0.0F);
        this.rightTrackModel[12].setRotationPoint(-56.0F, -7.5F, 28.5F);

        this.rightTrackModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 2, 12, 10, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 7.0F, -5.0F, 0.0F, -7.0F, -5.0F, 0.0F, -7.0F, -5.0F, 0.0F, 7.0F, -5.0F, 0.0F);
        this.rightTrackModel[13].setRotationPoint(-58.0F, -4.0F, 28.5F);

        this.rightTrackModel[14].addShapeBox(1.0F, 0.0F, 0.0F, 46, 4, 1, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.75F, 0.0F, 0.0F, 0.75F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.5F, 0.0F);
        this.rightTrackModel[14].setRotationPoint(-41.0F, 4.5F, 37.0F);

        this.rightTrackModel[15].addShapeBox(36.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 44.75F, 2.25F, -0.5F, -38.5F, 3.0F, -0.5F, -38.5F, 3.0F, 0.0F, 44.75F, 2.25F, 0.0F, 41.5F, 2.0F, -0.5F, -36.0F, 0.1F, -0.5F, -36.0F, 0.1F, 0.0F, 41.5F, 2.0F, 0.0F);
        this.rightTrackModel[15].setRotationPoint(-38.0F, 8.5F, 34.75F);

        this.rightTrackModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 10, 3, 1, 0.0F, 2.95F, -4.45F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 2.95F, -4.45F, 0.0F, 1.25F, 3.45F, 0.0F, -0.4F, -0.35F, 0.0F, -0.4F, -0.35F, 0.0F, 1.25F, 3.45F, 0.0F);
        this.rightTrackModel[16].setRotationPoint(-5.0F, 0.5F, 35.5F);

        this.rightTrackModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 3.0F, -0.4F, 0.0F, -1.9F, 0.35F, 0.0F, -1.9F, 0.35F, 0.0F, 3.0F, -0.4F, 0.0F, 3.25F, 0.05F, 0.0F, 0.65F, 0.45F, 0.0F, 0.65F, 0.45F, 0.0F, 3.25F, 0.05F, 0.0F);
        this.rightTrackModel[17].setRotationPoint(5.5F, 3.5F, 35.5F);

        this.rightTrackModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.45F, -0.4F, -0.3F, -0.35F, -0.5F, -0.3F, -0.35F, -0.5F, 0.5F, 0.45F, -0.4F, 0.5F, 0.8F, -0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.8F, 0.8F, -0.15F, 0.8F);
        this.rightTrackModel[18].setRotationPoint(7.0F, 4.5F, 35.1F);

        this.rightTrackModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 10, 3, 1, 0.0F, -1.25F, -0.6F, 0.0F, 2.0F, -3.6F, 0.0F, 2.0F, -3.6F, 0.0F, -1.25F, -0.6F, 0.0F, -0.4F, 0.65F, 0.0F, 1.1F, 3.45F, 0.0F, 1.1F, 3.45F, 0.0F, -0.4F, 0.65F, 0.0F);
        this.rightTrackModel[19].setRotationPoint(-41.0F, 0.0F, 35.5F);

        this.rightTrackModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -0.35F, -0.5F, -0.3F, 0.45F, -0.4F, -0.3F, 0.45F, -0.4F, 0.5F, -0.35F, -0.5F, 0.5F, 0.0F, 0.05F, 0.0F, 0.8F, -0.15F, 0.0F, 0.8F, -0.15F, 0.8F, 0.0F, 0.05F, 0.8F);
        this.rightTrackModel[20].setRotationPoint(-43.5F, 4.85F, 35.1F);

        this.rightTrackModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 3, 15, 1, 0.0F, 0.6F, -0.6F, 0.0F, -0.2F, 0.25F, 0.0F, -0.2F, 0.25F, 2.25F, 0.6F, -0.6F, 2.25F, -4.3F, -0.3F, 0.0F, 4.5F, -1.4F, 0.0F, 4.5F, -1.4F, 2.25F, -4.3F, -0.3F, 2.25F);
        this.rightTrackModel[21].setRotationPoint(29.0F, -8.5F, 28.25F);

        this.rightTrackModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 21, 2, 2, 0.0F, 0.65F, -0.25F, 0.0F, 1.3F, 1.15F, 0.0F, 1.3F, 1.15F, 0.0F, 0.65F, -0.25F, 0.0F, 0.65F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.25F, 0.0F);
        this.rightTrackModel[22].setRotationPoint(14.15F, 6.25F, 30.0F);

        this.rightTrackModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 17, 9, 1, 0.0F, -7.0F, 0.5F, 1.0F, -2.0F, 0.5F, 1.0F, -2.0F, 0.5F, 0.0F, -7.0F, 0.5F, 0.0F, -5.0F, -0.2F, 1.0F, 1.0F, -1.0F, 1.0F, 1.0F, -1.0F, 0.0F, -5.0F, -0.2F, 0.0F);
        this.rightTrackModel[23].setRotationPoint(11.5F, -2.5F, 31.0F);
        (this.rightTrackModel[23]).rotateAngleX = -0.03490659F;

        this.rightTrackModel[24].addShapeBox(-40.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, -34.45F, 4.0F, -0.5F, 37.75F, 2.25F, -0.5F, 37.75F, 2.25F, 0.0F, -34.45F, 4.0F, 0.0F, -34.45F, -2.0F, -0.5F, 41.0F, 2.0F, -0.5F, 41.0F, 2.0F, 0.0F, -34.45F, -2.0F, 0.0F);
        this.rightTrackModel[24].setRotationPoint(-45.5F, 8.5F, 34.75F);

        this.rightTrackModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, -1.9F, 0.35F, 0.0F, 3.0F, -0.2F, 0.0F, 3.0F, -0.2F, 0.0F, -1.9F, 0.35F, 0.0F, 0.65F, 0.45F, 0.0F, 3.25F, 0.05F, 0.0F, 3.25F, 0.05F, 0.0F, 0.65F, 0.45F, 0.0F);
        this.rightTrackModel[25].setRotationPoint(-42.5F, 4.0F, 35.5F);

        this.rightTrackModel[26].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.rightTrackModel[26].setRotationPoint(-54.0F, 5.5F, 35.0F);


        translateAll(-0.4F, -0.25F, 0.0F);


        flipAll();
    }
}
