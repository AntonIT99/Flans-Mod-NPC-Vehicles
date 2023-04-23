//Deobfuscated with https://github.com/SimplyProgrammer/Minecraft-Deobfuscator3000 using mappings "C:\Users\alpha\Documents\Minecraft\Minecraft-Deobfuscator3000-1.2.3\1.7.10 stable mappings"!

//Decompiled by Procyon!

package com.wolffsmod.model.manus.mw;

import com.wolffsmod.model.*;
import net.minecraft.client.model.*;
import com.flansmod.client.tmt.*;

public class ModelBoxer1 extends ModelFlanVehicle
{
    int textureX = 512;
    int textureY = 512;
    
    public ModelBoxer1()
    {
        bodyModel = new ModelRendererTurbo[103];
        bodyModel[0] = new ModelRendererTurbo(this,  0,  440, textureX, textureY); // Boden
        bodyModel[1] = new ModelRendererTurbo(this,  0,  420, textureX, textureY); // SeiteR
        bodyModel[2] = new ModelRendererTurbo(this,  0,  400, textureX, textureY); // SeiteL
        bodyModel[3] = new ModelRendererTurbo(this,  0,  360, textureX, textureY); // Dach
        bodyModel[4] = new ModelRendererTurbo(this,  210,  360, textureX, textureY); // Dachluke
        bodyModel[5] = new ModelRendererTurbo(this,  115,  230, textureX, textureY); // Trennwand
        bodyModel[6] = new ModelRendererTurbo(this,  0,  345, textureX, textureY); // KFR
        bodyModel[7] = new ModelRendererTurbo(this,  0,  330, textureX, textureY); // KFL
        bodyModel[8] = new ModelRendererTurbo(this,  310,  330, textureX, textureY); // Front
        bodyModel[9] = new ModelRendererTurbo(this,  70,  480, textureX, textureY); // FahrerSicht
        bodyModel[10] = new ModelRendererTurbo(this,  125,  480, textureX, textureY); // Heckluke
        bodyModel[11] = new ModelRendererTurbo(this,  230,  480, textureX, textureY); // HM
        bodyModel[12] = new ModelRendererTurbo(this,  285,  480, textureX, textureY); // HL1
        bodyModel[13] = new ModelRendererTurbo(this,  300,  480, textureX, textureY); // HL2
        bodyModel[14] = new ModelRendererTurbo(this,  315,  480, textureX, textureY); // HR1
        bodyModel[15] = new ModelRendererTurbo(this,  330,  480, textureX, textureY); // HR2
        bodyModel[16] = new ModelRendererTurbo(this,  0,  270, textureX, textureY); //
        bodyModel[17] = new ModelRendererTurbo(this,  380,  330, textureX, textureY); //
        bodyModel[18] = new ModelRendererTurbo(this,  430,  330, textureX, textureY); //
        bodyModel[19] = new ModelRendererTurbo(this,  60,  270, textureX, textureY); //
        bodyModel[20] = new ModelRendererTurbo(this,  160,  270, textureX, textureY); //
        bodyModel[21] = new ModelRendererTurbo(this,  160,  290, textureX, textureY); //
        bodyModel[22] = new ModelRendererTurbo(this,  270,  270, textureX, textureY); //
        bodyModel[23] = new ModelRendererTurbo(this,  320,  270, textureX, textureY); //
        bodyModel[24] = new ModelRendererTurbo(this,  370,  270, textureX, textureY); //
        bodyModel[25] = new ModelRendererTurbo(this,  420,  270, textureX, textureY); //
        bodyModel[26] = new ModelRendererTurbo(this,  470,  270, textureX, textureY); //
        bodyModel[27] = new ModelRendererTurbo(this,  265,  440, textureX, textureY); //
        bodyModel[28] = new ModelRendererTurbo(this,  295,  440, textureX, textureY); //
        bodyModel[29] = new ModelRendererTurbo(this,  270,  290, textureX, textureY); //
        bodyModel[30] = new ModelRendererTurbo(this,  320,  290, textureX, textureY); //
        bodyModel[31] = new ModelRendererTurbo(this,  370,  290, textureX, textureY); //
        bodyModel[32] = new ModelRendererTurbo(this,  420,  290, textureX, textureY); //
        bodyModel[33] = new ModelRendererTurbo(this,  470,  290, textureX, textureY); //
        bodyModel[34] = new ModelRendererTurbo(this,  315,  440, textureX, textureY); //
        bodyModel[35] = new ModelRendererTurbo(this,  345,  440, textureX, textureY); //
        bodyModel[36] = new ModelRendererTurbo(this,  345,  480, textureX, textureY); //
        bodyModel[37] = new ModelRendererTurbo(this,  345,  490, textureX, textureY); //
        bodyModel[38] = new ModelRendererTurbo(this,  345,  500, textureX, textureY); //
        bodyModel[39] = new ModelRendererTurbo(this,  355,  500, textureX, textureY); //
        bodyModel[40] = new ModelRendererTurbo(this,  370,  480, textureX, textureY); //
        bodyModel[41] = new ModelRendererTurbo(this,  370,  480, textureX, textureY); //
        bodyModel[42] = new ModelRendererTurbo(this,  370,  500, textureX, textureY); //
        bodyModel[43] = new ModelRendererTurbo(this,  380,  500, textureX, textureY); //
        bodyModel[44] = new ModelRendererTurbo(this,  390,  490, textureX, textureY); //
        bodyModel[45] = new ModelRendererTurbo(this,  325,  230, textureX, textureY); // Sitz11
        bodyModel[46] = new ModelRendererTurbo(this,  325,  250, textureX, textureY); // Sitz12
        bodyModel[47] = new ModelRendererTurbo(this,  325,  230, textureX, textureY); // Sitz21
        bodyModel[48] = new ModelRendererTurbo(this,  325,  250, textureX, textureY); // Sitz22
        bodyModel[49] = new ModelRendererTurbo(this,  185,  230, textureX, textureY); // Konsole1
        bodyModel[50] = new ModelRendererTurbo(this,  185,  225, textureX, textureY); // Konsole2
        bodyModel[51] = new ModelRendererTurbo(this,  260,  225, textureX, textureY); // Konsole3
        bodyModel[52] = new ModelRendererTurbo(this,  0,  230, textureX, textureY); // Trennwand1
        bodyModel[53] = new ModelRendererTurbo(this,  20,  230, textureX, textureY); // Trennwand2
        bodyModel[54] = new ModelRendererTurbo(this,  55,  230, textureX, textureY); // Trennwand3
        bodyModel[55] = new ModelRendererTurbo(this,  80,  230, textureX, textureY); // Trennwand4
        bodyModel[56] = new ModelRendererTurbo(this,  266,  405, textureX, textureY); // FahrerSicht
        bodyModel[57] = new ModelRendererTurbo(this,  494,  494, textureX, textureY); // Moni1
        bodyModel[58] = new ModelRendererTurbo(this,  470,  494, textureX, textureY); // Moni2
        bodyModel[59] = new ModelRendererTurbo(this,  494,  480, textureX, textureY); // Moni3
        bodyModel[60] = new ModelRendererTurbo(this,  470,  480, textureX, textureY); // Moni4
        bodyModel[61] = new ModelRendererTurbo(this,  435,  499, textureX, textureY); // Feuer1
        bodyModel[62] = new ModelRendererTurbo(this,  425,  499, textureX, textureY); // Feuer2
        bodyModel[63] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // SL1
        bodyModel[64] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // SL2
        bodyModel[65] = new ModelRendererTurbo(this,  0,  200, textureX, textureY); // SL3
        bodyModel[66] = new ModelRendererTurbo(this,  25,  200, textureX, textureY); // SL4
        bodyModel[67] = new ModelRendererTurbo(this,  175,  200, textureX, textureY); // SL5
        bodyModel[68] = new ModelRendererTurbo(this,  0,  215, textureX, textureY); // SL6
        bodyModel[69] = new ModelRendererTurbo(this,  175,  200, textureX, textureY); // SL7
        bodyModel[70] = new ModelRendererTurbo(this,  0,  215, textureX, textureY); // SL8
        bodyModel[71] = new ModelRendererTurbo(this,  175,  200, textureX, textureY); // SL9
        bodyModel[72] = new ModelRendererTurbo(this,  0,  215, textureX, textureY); // SL10
        bodyModel[73] = new ModelRendererTurbo(this,  175,  200, textureX, textureY); // SL11
        bodyModel[74] = new ModelRendererTurbo(this,  0,  215, textureX, textureY); // SL12
        bodyModel[75] = new ModelRendererTurbo(this,  175,  200, textureX, textureY); // SL13
        bodyModel[76] = new ModelRendererTurbo(this,  395,  200, textureX, textureY); // SL14
        bodyModel[77] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // SR1
        bodyModel[78] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // SR2
        bodyModel[79] = new ModelRendererTurbo(this,  200,  200, textureX, textureY); // SR3
        bodyModel[80] = new ModelRendererTurbo(this,  225,  200, textureX, textureY); // SR4
        bodyModel[81] = new ModelRendererTurbo(this,  370,  200, textureX, textureY); // SR5
        bodyModel[82] = new ModelRendererTurbo(this,  0,  215, textureX, textureY); // SR6
        bodyModel[83] = new ModelRendererTurbo(this,  370,  200, textureX, textureY); // SR7
        bodyModel[84] = new ModelRendererTurbo(this,  0,  215, textureX, textureY); // SR8
        bodyModel[85] = new ModelRendererTurbo(this,  370,  200, textureX, textureY); // SR9
        bodyModel[86] = new ModelRendererTurbo(this,  0,  215, textureX, textureY); // SR10
        bodyModel[87] = new ModelRendererTurbo(this,  370,  200, textureX, textureY); // SR11
        bodyModel[88] = new ModelRendererTurbo(this,  0,  215, textureX, textureY); // SR12
        bodyModel[89] = new ModelRendererTurbo(this,  370,  200, textureX, textureY); // SR13
        bodyModel[90] = new ModelRendererTurbo(this,  300,  380, textureX, textureY); // Luftnase
        bodyModel[91] = new ModelRendererTurbo(this,  260,  360, textureX, textureY); // Dach1
        bodyModel[92] = new ModelRendererTurbo(this,  275,  370, textureX, textureY); // Dach2
        bodyModel[93] = new ModelRendererTurbo(this,  300,  370, textureX, textureY); // WL1
        bodyModel[94] = new ModelRendererTurbo(this,  340,  370, textureX, textureY); // WL2
        bodyModel[95] = new ModelRendererTurbo(this,  340,  370, textureX, textureY); // WL3
        bodyModel[96] = new ModelRendererTurbo(this,  340,  370, textureX, textureY); // WL4
        bodyModel[97] = new ModelRendererTurbo(this,  340,  370, textureX, textureY); // Wl5
        bodyModel[98] = new ModelRendererTurbo(this,  300,  370, textureX, textureY); // WR1
        bodyModel[99] = new ModelRendererTurbo(this,  340,  370, textureX, textureY); // WR2
        bodyModel[100] = new ModelRendererTurbo(this,  340,  370, textureX, textureY); // WR3
        bodyModel[101] = new ModelRendererTurbo(this,  340,  370, textureX, textureY); // WR4
        bodyModel[102] = new ModelRendererTurbo(this,  340,  370, textureX, textureY); // WR5

        bodyModel[0].addBox(0F, 0F, 0F, 112, 1, 34, 0F); // Boden
        bodyModel[0].setRotationPoint(-54F, -1F, -17F);

        bodyModel[1].addBox(0F, 0F, 0F, 112, 15, 2, 0F); // SeiteR
        bodyModel[1].setRotationPoint(-54F, -16F, -17F);

        bodyModel[2].addBox(0F, 0F, 0F, 112, 15, 2, 0F); // SeiteL
        bodyModel[2].setRotationPoint(-54F, -16F, 15F);

        bodyModel[3].addBox(0F, 0F, 0F, 83, 1, 30, 0F); // Dach
        bodyModel[3].setRotationPoint(-55F, -31F, -15F);

        bodyModel[4].addBox(0F, 0F, 0F, 14, 1, 14, 0F); // Dachluke
        bodyModel[4].setRotationPoint(-7F, -32F, -7F);

        bodyModel[6].addBox(0F, 0F, 0F, 129, 1, 9, 0F); // KFR
        bodyModel[6].setRotationPoint(-55F, -17F, -24F);

        bodyModel[7].addBox(0F, 0F, 0F, 129, 1, 9, 0F); // KFL
        bodyModel[7].setRotationPoint(-55F, -17F, 15F);

        bodyModel[8].addBox(0F, 0F, 0F, 2, 1, 30, 0F); // Front
        bodyModel[8].setRotationPoint(72F, -17F, -15F);

        bodyModel[9].addBox(0F, 0F, 0F, 21, 5, 14, 0F); // FahrerSicht
        bodyModel[9].setRotationPoint(28F, -31F, -16F);
        bodyModel[9].rotateAngleZ = -0.08726646F;

        bodyModel[11].addBox(0F, 0F, 0F, 2, 4, 24, 0F); // HM
        bodyModel[11].setRotationPoint(-55F, -30F, -12F);
        bodyModel[11].rotateAngleZ = 0.06981317F;

        bodyModel[12].addBox(0F, 0F, 0F, 2, 16, 4, 0F); // HL1
        bodyModel[12].setRotationPoint(-54F, -17F, 11F);

        bodyModel[13].addBox(0F, 0F, 0F, 2, 15, 4, 0F); // HL2
        bodyModel[13].setRotationPoint(-55F, -30F, 11F);
        bodyModel[13].rotateAngleZ = 0.06981317F;

        bodyModel[14].addBox(0F, 0F, 0F, 2, 16, 4, 0F); // HR1
        bodyModel[14].setRotationPoint(-54F, -17F, -15F);

        bodyModel[15].addBox(0F, 0F, 0F, 2, 15, 4, 0F); // HR2
        bodyModel[15].setRotationPoint(-55F, -30F, -15F);
        bodyModel[15].rotateAngleZ = 0.06981317F;

        bodyModel[16].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(16, 0, 16, 0), new Coord2D(16, 16, 16, 16), new Coord2D(0, 16, 0, 16) } ), 34, 16, 16, 55, 34, ModelRendererTurbo.MR_FRONT, new float[] {23, 16, 16});
        bodyModel[16].setRotationPoint(74F, 0F, 17F);
//
        bodyModel[17].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(9, 0, 9, 0), new Coord2D(6, 14, 6, 14), new Coord2D(0, 14, 0, 14) } ), 83, 9, 14, 44, 83, ModelRendererTurbo.MR_FRONT, new float[] {14, 6, 15, 9});
        bodyModel[17].rotateAngleY = -1.57079633F;
        bodyModel[17].setRotationPoint(28F, -17F, 15F);

        bodyModel[18].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(9, 0, 9, 0), new Coord2D(6, 14, 6, 14), new Coord2D(0, 14, 0, 14) } ), 83, 9, 14, 44, 83, ModelRendererTurbo.MR_FRONT, new float[] {14, 6, 15, 9});
        bodyModel[18].rotateAngleY = 1.57079633F;
        bodyModel[18].setRotationPoint(-55F, -17F, -15F);

        bodyModel[19].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(48, 0, 48, 0), new Coord2D(45, 48, 45, 48), new Coord2D(3, 48, 3, 48) } ), 1, 48, 48, 188, 1, ModelRendererTurbo.MR_FRONT, new float[] {49, 42, 49, 48});
        bodyModel[19].rotateAngleY = -1.57079633F;
        bodyModel[19].rotateAngleX = 1.27409034F;
        bodyModel[19].setRotationPoint(74F, -17F, -24F);

        bodyModel[20].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(46, 0, 46, 0), new Coord2D(46, 14, 46, 14) } ), 1, 46, 14, 109, 1, ModelRendererTurbo.MR_FRONT, new float[] {49, 14, 46});
        bodyModel[20].rotateAngleX = 0.20943951F;
        bodyModel[20].setRotationPoint(74F, -17F, 24F);

        bodyModel[21].addShape3D(0, 0, -1, new Shape2D(new Coord2D[] { new Coord2D(0, 0, 0, 0), new Coord2D(46, 0, 46, 0), new Coord2D(46, 14, 46, 14) } ), 1, 46, 14, 109, 1, ModelRendererTurbo.MR_FRONT, new float[] {49, 14, 46});
        bodyModel[21].rotateAngleX = -0.20943951F;
        bodyModel[21].setRotationPoint(74F, -17F, -24F);

        bodyModel[22].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(14, 0, 14, 0), new Coord2D(20, 7, 20, 7) } ), 7, 20, 7, 47, 7, ModelRendererTurbo.MR_FRONT, new float[] {20, 10, 7, 10});
        bodyModel[22].setRotationPoint(74F, -9F, 24F);

        bodyModel[23].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) } ), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20, 10, 6, 10});
        bodyModel[23].setRotationPoint(45F, -9F, 24F);

        bodyModel[24].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) } ), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20, 10, 6, 10});
        bodyModel[24].setRotationPoint(15F, -9F, 24F);

        bodyModel[25].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) } ), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20, 10, 6, 10});
        bodyModel[25].setRotationPoint(-14F, -9F, 24F);

        bodyModel[26].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(9, 0, 9, 0), new Coord2D(10, 7, 10, 7) } ), 9, 10, 7, 30, 9, ModelRendererTurbo.MR_FRONT, new float[] {10, 8, 2, 10});
        bodyModel[26].setRotationPoint(-45F, -9F, 24F);

        bodyModel[27].addBox(0F, 0F, 0F, 6, 9, 7, 0F);
        bodyModel[27].setRotationPoint(2F, -9F, 17F);

        bodyModel[28].addBox(0F, 0F, 0F, 2, 9, 7, 0F);
        bodyModel[28].setRotationPoint(-54F, -9F, 17F);

        bodyModel[29].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(14, 0, 14, 0), new Coord2D(20, 7, 20, 7) } ), 7, 20, 7, 47, 7, ModelRendererTurbo.MR_FRONT, new float[] {20, 10, 7, 10});
        bodyModel[29].setRotationPoint(74F, -9F, -17F);

        bodyModel[30].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) } ), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20, 10, 6, 10});
        bodyModel[30].setRotationPoint(45F, -9F, -17F);

        bodyModel[31].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) } ), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20, 10, 6, 10});
        bodyModel[31].setRotationPoint(15F, -9F, -17F);

        bodyModel[32].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(13, 0, 13, 0), new Coord2D(20, 7, 20, 7) } ), 7, 20, 7, 46, 7, ModelRendererTurbo.MR_FRONT, new float[] {20, 10, 6, 10});
        bodyModel[32].setRotationPoint(-14F, -9F, -17F);

        bodyModel[33].addShape3D(0, 0, 0, new Shape2D(new Coord2D[] { new Coord2D(0, 7, 0, 7), new Coord2D(7, 0, 7, 0), new Coord2D(9, 0, 9, 0), new Coord2D(10, 7, 10, 7) } ), 9, 10, 7, 30, 9, ModelRendererTurbo.MR_FRONT, new float[] {10, 8, 2, 10});
        bodyModel[33].setRotationPoint(-45F, -9F, -15F);

        bodyModel[34].addBox(0F, 0F, 0F, 6, 9, 7, 0F);
        bodyModel[34].setRotationPoint(2F, -9F, -24F);

        bodyModel[35].addBox(0F, 0F, 0F, 2, 9, 7, 0F);
        bodyModel[35].setRotationPoint(-54F, -9F, -24F);

        bodyModel[36].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // SiegelL1
        bodyModel[36].setRotationPoint(66F, -17F, 24F);

        bodyModel[37].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // SiegelL2
        bodyModel[37].setRotationPoint(66F, -15F, 24F);

        bodyModel[38].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // SiegelL3
        bodyModel[38].setRotationPoint(66F, -20F, 28F);

        bodyModel[39].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // SiegelL4
        bodyModel[39].setRotationPoint(66F, -27F, 26F);

        bodyModel[40].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // SiegelR1
        bodyModel[40].setRotationPoint(66F, -17F, -28F);

        bodyModel[41].addBox(0F, 0F, 0F, 1, 1, 4, 0F); // SiegelR2
        bodyModel[41].setRotationPoint(66F, -15F, -28F);

        bodyModel[42].addBox(0F, 0F, 0F, 1, 6, 1, 0F); // SiegelR3
        bodyModel[42].setRotationPoint(66F, -20F, -29F);

        bodyModel[43].addBox(0F, 0F, 0F, 1, 7, 4, 0F); // SiegelR4
        bodyModel[43].setRotationPoint(66F, -27F, -30F);

        bodyModel[44].addBox(0F, 0F, 0F, 17, 3, 5, 0F); // Luft
        bodyModel[44].setRotationPoint(46F, -19F, 25F);
        bodyModel[44].rotateAngleX = 1.361357F;
        bodyModel[44].rotateAngleY = 3.176499F;
        bodyModel[44].rotateAngleZ = 0.296706F;

        bodyModel[45].addBox(0F, 0F, 0F, 14, 2, 12, 0F); // Sitz11
        bodyModel[45].setRotationPoint(32F, -3F, -15F);

        bodyModel[46].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Sitz12
        bodyModel[46].setRotationPoint(32F, -3F, -15F);
        bodyModel[46].rotateAngleZ = 1.815142F;

        bodyModel[47].addBox(0F, 0F, 0F, 14, 2, 12, 0F); // Sitz21
        bodyModel[47].setRotationPoint(32F, -3F, 3F);

        bodyModel[48].addBox(0F, 0F, 0F, 18, 2, 12, 0F); // Sitz22
        bodyModel[48].setRotationPoint(32F, -3F, 3F);
        bodyModel[48].rotateAngleZ = 1.815142F;

        bodyModel[49].addTrapezoid(0F, 0F, 0F, 9, 11, 4, 0.0F, -1.0F, ModelRendererTurbo.MR_TOP);
        bodyModel[49].setRotationPoint(49F, -12F, -11F);

        bodyModel[50].addBox(0F, 0F, 0F, 5, 11, 30, 0F); // Konsole2
        bodyModel[50].setRotationPoint(53F, -12F, -15F);

        bodyModel[51].addBox(0F, 0F, 0F, 1, 12, 30, 0F); // Konsole3
        bodyModel[51].setRotationPoint(53F, -12F, -15F);
        bodyModel[51].rotateAngleZ = -0.2792527F;

        bodyModel[52].addBox(0F, 0F, 0F, 1, 29, 8, 0F); // Trennwand1
        bodyModel[52].setRotationPoint(27F, -30F, -15F);

        bodyModel[53].addBox(0F, 0F, 0F, 1, 4, 14, 0F); // Trennwand2
        bodyModel[53].setRotationPoint(27F, -30F, -7F);

        bodyModel[54].addBox(0F, 0F, 0F, 1, 29, 8, 0F); // Trennwand3
        bodyModel[54].setRotationPoint(27F, -30F, 7F);

        bodyModel[55].addBox(0F, 0F, 0F, 1, 2, 14, 0F); // Trennwand4
        bodyModel[55].setRotationPoint(27F, -3F, -7F);

        bodyModel[56].flip = true;
        bodyModel[56].addBox(0F, 0F, 0F, 21, 5, 14, 0F); // FahrerSicht
        bodyModel[56].setRotationPoint(28F, -31F, -16F);
        bodyModel[56].rotateAngleZ = -0.08726646F;

        bodyModel[57].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Moni1
        bodyModel[57].setRotationPoint(55F, -12F, -5F);
        bodyModel[57].rotateAngleY = 3.14159265F;
        bodyModel[57].rotateAngleZ = -2.722714F;

        bodyModel[58].addBox(0F, 0F, 0F, 1, 10, 8, 0F); // Moni2
        bodyModel[58].setRotationPoint(55F, -12F, 13F);
        bodyModel[58].rotateAngleY = 3.14159265F;
        bodyModel[58].rotateAngleZ = -2.722714F;

        bodyModel[59].addBox(0F, 0F, 0F, 8, 10, 1, 0F); // Moni3
        bodyModel[59].setRotationPoint(41F, -26F, -15F);
        bodyModel[59].rotateAngleX = 0.2617994F;
        bodyModel[59].rotateAngleY = 3.14159265F;

        bodyModel[60].addBox(0F, 0F, 0F, 8, 10, 1, 0F); // Moni4
        bodyModel[60].setRotationPoint(33F, -26F, 15F);
        bodyModel[60].rotateAngleX = 0.2617994F;

        bodyModel[61].addBox(0F, 0F, 0F, 11, 9, 4, 0F); // Feuer1
        bodyModel[61].setRotationPoint(47F, -10F, 7F);

        bodyModel[62].addBox(0F, 0F, 0F, 2, 5, 1, 0F); // Feuer2
        bodyModel[62].setRotationPoint(48F, -15F, 8.5F);

        bodyModel[63].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // SL1
        bodyModel[63].setRotationPoint(-51F, -4F, 5F);

        bodyModel[64].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // SL2
        bodyModel[64].setRotationPoint(-22F, -4F, 5F);

        bodyModel[65].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // SL3
        bodyModel[65].setRotationPoint(7F, -4F, 5F);

        bodyModel[66].addBox(0F, 0F, 0F, 61, 2, 11, 0F); // SL4
        bodyModel[66].setRotationPoint(-52F, -6F, 4F);

        bodyModel[67].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // SL5
        bodyModel[67].setRotationPoint(-52F, -10F, 5F);

        bodyModel[68].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // SL6
        bodyModel[68].setRotationPoint(-51F, -6F, 12F);
        bodyModel[68].rotateAngleX = 1.308997F;

        bodyModel[69].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // SL7
        bodyModel[69].setRotationPoint(-37F, -10F, 5F);

        bodyModel[70].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // SL8
        bodyModel[70].setRotationPoint(-36F, -6F, 12F);
        bodyModel[70].rotateAngleX = 1.308997F;

        bodyModel[71].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // SL9
        bodyModel[71].setRotationPoint(-22F, -10F, 5F);

        bodyModel[72].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // SL10
        bodyModel[72].setRotationPoint(-21F, -6F, 12F);
        bodyModel[72].rotateAngleX = 1.308997F;

        bodyModel[73].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // SL11
        bodyModel[73].setRotationPoint(-7F, -10F, 5F);

        bodyModel[74].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // SL12
        bodyModel[74].setRotationPoint(-6F, -6F, 12F);
        bodyModel[74].rotateAngleX = 1.308997F;

        bodyModel[75].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // SL13
        bodyModel[75].setRotationPoint(8F, -10F, 5F);

        bodyModel[76].addBox(0F, 0F, 0F, 15, 29, 6, 0F); // SL14
        bodyModel[76].setRotationPoint(11F, -30F, 9F);

        bodyModel[77].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // SR1
        bodyModel[77].setRotationPoint(-51F, -4F, -15F);

        bodyModel[78].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // SR2
        bodyModel[78].setRotationPoint(-22F, -4F, -15F);

        bodyModel[79].addBox(0F, 0F, 0F, 1, 3, 10, 0F); // SR3
        bodyModel[79].setRotationPoint(7F, -4F, -15F);

        bodyModel[80].addBox(0F, 0F, 0F, 61, 2, 11, 0F); // SR4
        bodyModel[80].setRotationPoint(-52F, -6F, -15F);

        bodyModel[81].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // SR5
        bodyModel[81].setRotationPoint(-52F, -10F, -15F);

        bodyModel[82].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // SR6
        bodyModel[82].setRotationPoint(-37F, -6F, -12F);
        bodyModel[82].rotateAngleX = 1.308997F;
        bodyModel[82].rotateAngleY = 3.14159265F;

        bodyModel[83].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // SR7
        bodyModel[83].setRotationPoint(-37F, -10F, -15F);

        bodyModel[84].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // SR8
        bodyModel[84].setRotationPoint(-22F, -6F, -12F);
        bodyModel[84].rotateAngleX = 1.308997F;
        bodyModel[84].rotateAngleY = 3.14159265F;

        bodyModel[85].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // SR9
        bodyModel[85].setRotationPoint(-22F, -10F, -15F);

        bodyModel[86].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // SR10
        bodyModel[86].setRotationPoint(-7F, -6F, -12F);
        bodyModel[86].rotateAngleX = 1.308997F;
        bodyModel[86].rotateAngleY = 3.14159265F;

        bodyModel[87].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // SR11
        bodyModel[87].setRotationPoint(-7F, -10F, -15F);

        bodyModel[88].addBox(0F, 0F, 0F, 14, 1, 10, 0F); // SR12
        bodyModel[88].setRotationPoint(8F, -6F, -12F);
        bodyModel[88].rotateAngleX = 1.308997F;
        bodyModel[88].rotateAngleY = 3.14159265F;

        bodyModel[89].addBox(0F, 0F, 0F, 1, 4, 10, 0F); // SR13
        bodyModel[89].setRotationPoint(8F, -10F, -15F);

        bodyModel[90].addBox(0F, 0F, 0F, 6, 1, 10, 0F); // Luftnase
        bodyModel[90].setRotationPoint(59F, -22F, 5F);
        bodyModel[90].rotateAngleY = 3.14159265F;
        bodyModel[90].rotateAngleZ = 0.296706F;

        bodyModel[91].addBox(0F, 0F, 0F, 11, 2, 6, 0F); // Dach1
        bodyModel[91].setRotationPoint(-26F, -33F, -17F);

        bodyModel[92].addBox(0F, 0F, 0F, 7, 3, 4, 0F); // Dach2
        bodyModel[92].setRotationPoint(-55F, -34F, -2F);

        bodyModel[93].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // WL1
        bodyModel[93].setRotationPoint(-52F, -32F, 15F);

        bodyModel[94].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // WL2
        bodyModel[94].setRotationPoint(-49F, -32F, 15.5F);
        bodyModel[94].rotateAngleY = 0.9599311F;
        bodyModel[94].rotateAngleZ = 2.268928F;

        bodyModel[95].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // WL3
        bodyModel[95].setRotationPoint(-46F, -32F, 15.5F);
        bodyModel[95].rotateAngleY = 0.8726646F;
        bodyModel[95].rotateAngleZ = 2.268928F;

        bodyModel[96].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // WL4
        bodyModel[96].setRotationPoint(-43F, -32F, 15.5F);
        bodyModel[96].rotateAngleY = 0.8726646F;
        bodyModel[96].rotateAngleZ = 2.268928F;

        bodyModel[97].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // Wl5
        bodyModel[97].setRotationPoint(-40F, -32F, 15.5F);
        bodyModel[97].rotateAngleY = 0.6108652F;
        bodyModel[97].rotateAngleZ = 2.268928F;

        bodyModel[98].addBox(0F, 0F, 0F, 12, 1, 3, 0F); // WR1
        bodyModel[98].setRotationPoint(-52F, -32F, -18F);

        bodyModel[99].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // WR2
        bodyModel[99].setRotationPoint(-51F, -32F, -16.5F);
        bodyModel[99].rotateAngleY = -0.9599311F;
        bodyModel[99].rotateAngleZ = 2.268928F;

        bodyModel[100].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // WR3
        bodyModel[100].setRotationPoint(-48F, -32F, -16.5F);
        bodyModel[100].rotateAngleY = -0.8726646F;
        bodyModel[100].rotateAngleZ = 2.268928F;

        bodyModel[101].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // WR4
        bodyModel[101].setRotationPoint(-45F, -32F, -16.5F);
        bodyModel[101].rotateAngleY = -0.8726646F;
        bodyModel[101].rotateAngleZ = 2.268928F;

        bodyModel[102].addBox(0F, 0F, 0F, 2, 4, 2, 0F); // WR5
        bodyModel[102].setRotationPoint(-42F, -32F, -16.5F);
        bodyModel[102].rotateAngleY = -0.6108652F;
        bodyModel[102].rotateAngleZ = 2.268928F;


        leftFrontWheelModel = new ModelRendererTurbo[2];
        leftFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);
        leftFrontWheelModel[1] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);

        leftFrontWheelModel[0].addShape3D(11F, -11F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 16, 22, 16), new Coord2D(16, 22, 16, 22), new Coord2D(6, 22, 6, 22), new Coord2D(0, 16, 0, 16), new Coord2D(0, 6, 0, 6) } ), 7, 22, 22, 76, 7, ModelRendererTurbo.MR_FRONT, new float[] {9, 10, 9, 10, 9, 10, 9, 10});
        leftFrontWheelModel[0].setRotationPoint(49F, -1F, 20.5F);

        leftFrontWheelModel[1].addShape3D(11F, -11F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 16, 22, 16), new Coord2D(16, 22, 16, 22), new Coord2D(6, 22, 6, 22), new Coord2D(0, 16, 0, 16), new Coord2D(0, 6, 0, 6) } ), 7, 22, 22, 76, 7, ModelRendererTurbo.MR_FRONT, new float[] {9, 10, 9, 10, 9, 10, 9, 10});
        leftFrontWheelModel[1].setRotationPoint(21F, -1F, 20.5F);


        rightFrontWheelModel = new ModelRendererTurbo[2];
        rightFrontWheelModel[0] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);
        rightFrontWheelModel[1] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);

        rightFrontWheelModel[0].addShape3D(11F, -11F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 16, 22, 16), new Coord2D(16, 22, 16, 22), new Coord2D(6, 22, 6, 22), new Coord2D(0, 16, 0, 16), new Coord2D(0, 6, 0, 6) } ), 7, 22, 22, 76, 7, ModelRendererTurbo.MR_FRONT, new float[] {9, 10, 9, 10, 9, 10, 9, 10});
        rightFrontWheelModel[0].setRotationPoint(49F, -1F, -20.5F);

        rightFrontWheelModel[1].addShape3D(11F, -11F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 16, 22, 16), new Coord2D(16, 22, 16, 22), new Coord2D(6, 22, 6, 22), new Coord2D(0, 16, 0, 16), new Coord2D(0, 6, 0, 6) } ), 7, 22, 22, 76, 7, ModelRendererTurbo.MR_FRONT, new float[] {9, 10, 9, 10, 9, 10, 9, 10});
        rightFrontWheelModel[1].setRotationPoint(21F, -1F, -20.5F);


        leftBackWheelModel = new ModelRendererTurbo[2];
        leftBackWheelModel[0] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);
        leftBackWheelModel[1] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);

        leftBackWheelModel[0].addShape3D(11F, -11F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 16, 22, 16), new Coord2D(16, 22, 16, 22), new Coord2D(6, 22, 6, 22), new Coord2D(0, 16, 0, 16), new Coord2D(0, 6, 0, 6) } ), 7, 22, 22, 76, 7, ModelRendererTurbo.MR_FRONT, new float[] {9, 10, 9, 10, 9, 10, 9, 10});
        leftBackWheelModel[0].setRotationPoint(-11F, -1F, 20.5F);

        leftBackWheelModel[1].addShape3D(11F, -11F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 16, 22, 16), new Coord2D(16, 22, 16, 22), new Coord2D(6, 22, 6, 22), new Coord2D(0, 16, 0, 16), new Coord2D(0, 6, 0, 6) } ), 7, 22, 22, 76, 7, ModelRendererTurbo.MR_FRONT, new float[] {9, 10, 9, 10, 9, 10, 9, 10});
        leftBackWheelModel[1].setRotationPoint(-37F, -1F, 20.5F);


        rightBackWheelModel = new ModelRendererTurbo[2];
        rightBackWheelModel[0] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);
        rightBackWheelModel[1] = new ModelRendererTurbo(this, 0, 483, textureX, textureY);

        rightBackWheelModel[0].addShape3D(11F, -11F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 16, 22, 16), new Coord2D(16, 22, 16, 22), new Coord2D(6, 22, 6, 22), new Coord2D(0, 16, 0, 16), new Coord2D(0, 6, 0, 6) } ), 7, 22, 22, 76, 7, ModelRendererTurbo.MR_FRONT, new float[] {9, 10, 9, 10, 9, 10, 9, 10});
        rightBackWheelModel[0].setRotationPoint(-11F, -1F, -20.5F);

        rightBackWheelModel[1].addShape3D(11F, -11F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(6, 0, 6, 0), new Coord2D(16, 0, 16, 0), new Coord2D(22, 6, 22, 6), new Coord2D(22, 16, 22, 16), new Coord2D(16, 22, 16, 22), new Coord2D(6, 22, 6, 22), new Coord2D(0, 16, 0, 16), new Coord2D(0, 6, 0, 6) } ), 7, 22, 22, 76, 7, ModelRendererTurbo.MR_FRONT, new float[] {9, 10, 9, 10, 9, 10, 9, 10});
        rightBackWheelModel[1].setRotationPoint(-37F, -1F, -20.5F);


        bodyDoorOpenModel = new ModelRendererTurbo[2];
        bodyDoorOpenModel[0] = new ModelRendererTurbo(this,  115,  230, textureX, textureY); // Trennwand
        bodyDoorOpenModel[1] = new ModelRendererTurbo(this,  125,  480, textureX, textureY); // Heckluke

        bodyDoorOpenModel[0].addBox(0F, 0F, 0F, 1, 24, 15, 0F); // Tuer
        bodyDoorOpenModel[0].setRotationPoint(27.5F, -26.5F, -7.5F);
        bodyDoorOpenModel[0].rotateAngleY = 2.094395F;

        bodyDoorOpenModel[1].addBox(0F, 0F, 0F, 27, 1, 24, 0F); // Heckluke
        bodyDoorOpenModel[1].setRotationPoint(-54F, 0F, -12F);
        bodyDoorOpenModel[1].rotateAngleZ = -2.77507351F;


        bodyDoorCloseModel = new ModelRendererTurbo[2];
        bodyDoorCloseModel[0] = new ModelRendererTurbo(this,  115,  230, textureX, textureY); // Trennwand
        bodyDoorCloseModel[1] = new ModelRendererTurbo(this,  125,  480, textureX, textureY); // Heckluke

        bodyDoorCloseModel[0].addBox(0F, 0F, 0F, 1, 24, 15, 0F); // Tuer
        bodyDoorCloseModel[0].setRotationPoint(26.5F, -26.5F, -7.5F);

        bodyDoorCloseModel[1].addBox(0F, 0F, 0F, 27, 1, 24, 0F); // Heckluke
        bodyDoorCloseModel[1].setRotationPoint(-55F, 0F, -12F);
        bodyDoorCloseModel[1].rotateAngleZ = 1.605703F;


        // Steering Wheel
        steeringWheelModel = new ModelRendererTurbo[1];
        steeringWheelModel[0] = new ModelRendererTurbo(this, 0, 150, textureX, textureY);

        steeringWheelModel[0].addBox(0F, -4F, -4F, 1, 8, 8, 0F); // Lenkrad
        steeringWheelModel[0].setRotationPoint(50F, -11F, -8F);
        steeringWheelModel[0].rotateAngleZ = -0.19198621F;


        translateAll(0, -2, 0);


        flipAll();
    }
}
