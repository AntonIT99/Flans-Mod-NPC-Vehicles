package com.wolffsmod.model;


import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelM4A1
  extends ModelVehicle
{
  int textureX = 512;
  int textureY = 512;


  
  public ModelM4A1() {
    bodyModel = new ModelRendererTurbo[234];
    bodyModel[0] = new ModelRendererTurbo(this, 233, 480, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 270, 480, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 327, 480, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 327, 480, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 327, 480, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 233, 480, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 305, 480, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 270, 480, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 327, 480, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 327, 480, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 327, 480, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 345, 480, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 345, 493, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 365, 480, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 345, 480, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 345, 493, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 365, 480, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 345, 480, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 345, 493, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 365, 480, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 345, 480, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 345, 493, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 365, 480, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 345, 480, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 345, 493, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 365, 480, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 345, 480, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 345, 493, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 365, 480, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 38, 460, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 76, 460, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 97, 460, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 115, 460, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 115, 470, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 126, 460, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 126, 465, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 126, 470, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 126, 475, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 147, 460, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 147, 465, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 147, 470, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 147, 475, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 38, 460, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 76, 460, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 97, 460, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 115, 460, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 115, 470, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 126, 460, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 126, 465, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 126, 470, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 126, 475, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 147, 460, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 147, 465, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 147, 470, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 147, 475, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 38, 460, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 76, 460, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 97, 460, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 115, 460, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 115, 470, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 126, 460, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 126, 465, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 126, 470, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 126, 475, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 147, 460, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 147, 465, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 147, 470, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 147, 475, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 38, 460, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 76, 460, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 97, 460, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 115, 460, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 115, 470, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 126, 460, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 126, 465, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 126, 470, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 126, 475, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 147, 460, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 147, 465, textureX, textureY);
    bodyModel[94] = new ModelRendererTurbo(this, 147, 470, textureX, textureY);
    bodyModel[95] = new ModelRendererTurbo(this, 147, 475, textureX, textureY);
    bodyModel[96] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[97] = new ModelRendererTurbo(this, 38, 460, textureX, textureY);
    bodyModel[98] = new ModelRendererTurbo(this, 76, 460, textureX, textureY);
    bodyModel[99] = new ModelRendererTurbo(this, 97, 460, textureX, textureY);
    bodyModel[100] = new ModelRendererTurbo(this, 115, 460, textureX, textureY);
    bodyModel[101] = new ModelRendererTurbo(this, 115, 470, textureX, textureY);
    bodyModel[102] = new ModelRendererTurbo(this, 126, 460, textureX, textureY);
    bodyModel[103] = new ModelRendererTurbo(this, 126, 465, textureX, textureY);
    bodyModel[104] = new ModelRendererTurbo(this, 126, 470, textureX, textureY);
    bodyModel[105] = new ModelRendererTurbo(this, 126, 475, textureX, textureY);
    bodyModel[106] = new ModelRendererTurbo(this, 147, 460, textureX, textureY);
    bodyModel[107] = new ModelRendererTurbo(this, 147, 465, textureX, textureY);
    bodyModel[108] = new ModelRendererTurbo(this, 147, 470, textureX, textureY);
    bodyModel[109] = new ModelRendererTurbo(this, 147, 475, textureX, textureY);
    bodyModel[110] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    bodyModel[111] = new ModelRendererTurbo(this, 38, 460, textureX, textureY);
    bodyModel[112] = new ModelRendererTurbo(this, 76, 460, textureX, textureY);
    bodyModel[113] = new ModelRendererTurbo(this, 97, 460, textureX, textureY);
    bodyModel[114] = new ModelRendererTurbo(this, 115, 460, textureX, textureY);
    bodyModel[115] = new ModelRendererTurbo(this, 115, 470, textureX, textureY);
    bodyModel[116] = new ModelRendererTurbo(this, 126, 460, textureX, textureY);
    bodyModel[117] = new ModelRendererTurbo(this, 126, 465, textureX, textureY);
    bodyModel[118] = new ModelRendererTurbo(this, 126, 470, textureX, textureY);
    bodyModel[119] = new ModelRendererTurbo(this, 126, 475, textureX, textureY);
    bodyModel[120] = new ModelRendererTurbo(this, 147, 460, textureX, textureY);
    bodyModel[121] = new ModelRendererTurbo(this, 147, 465, textureX, textureY);
    bodyModel[122] = new ModelRendererTurbo(this, 147, 470, textureX, textureY);
    bodyModel[123] = new ModelRendererTurbo(this, 147, 475, textureX, textureY);
    bodyModel[124] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
    bodyModel[125] = new ModelRendererTurbo(this, 235, 445, textureX, textureY);
    bodyModel[126] = new ModelRendererTurbo(this, 0, 373, textureX, textureY);
    bodyModel[127] = new ModelRendererTurbo(this, 102, 373, textureX, textureY);
    bodyModel[128] = new ModelRendererTurbo(this, 102, 400, textureX, textureY);
    bodyModel[129] = new ModelRendererTurbo(this, 224, 400, textureX, textureY);
    bodyModel[130] = new ModelRendererTurbo(this, 0, 335, textureX, textureY);
    bodyModel[131] = new ModelRendererTurbo(this, 256, 373, textureX, textureY);
    bodyModel[132] = new ModelRendererTurbo(this, 95, 335, textureX, textureY);
    bodyModel[133] = new ModelRendererTurbo(this, 123, 335, textureX, textureY);
    bodyModel[134] = new ModelRendererTurbo(this, 148, 335, textureX, textureY);
    bodyModel[135] = new ModelRendererTurbo(this, 143, 350, textureX, textureY);
    bodyModel[136] = new ModelRendererTurbo(this, 172, 335, textureX, textureY);
    bodyModel[137] = new ModelRendererTurbo(this, 196, 335, textureX, textureY);
    bodyModel[138] = new ModelRendererTurbo(this, 222, 335, textureX, textureY);
    bodyModel[139] = new ModelRendererTurbo(this, 222, 349, textureX, textureY);
    bodyModel[140] = new ModelRendererTurbo(this, 236, 335, textureX, textureY);
    bodyModel[141] = new ModelRendererTurbo(this, 263, 335, textureX, textureY);
    bodyModel[142] = new ModelRendererTurbo(this, 143, 360, textureX, textureY);
    bodyModel[143] = new ModelRendererTurbo(this, 287, 335, textureX, textureY);
    bodyModel[144] = new ModelRendererTurbo(this, 310, 335, textureX, textureY);
    bodyModel[145] = new ModelRendererTurbo(this, 0, 373, textureX, textureY);
    bodyModel[146] = new ModelRendererTurbo(this, 0, 373, textureX, textureY);
    bodyModel[147] = new ModelRendererTurbo(this, 10, 373, textureX, textureY);
    bodyModel[148] = new ModelRendererTurbo(this, 20, 373, textureX, textureY);
    bodyModel[149] = new ModelRendererTurbo(this, 20, 373, textureX, textureY);
    bodyModel[150] = new ModelRendererTurbo(this, 10, 373, textureX, textureY);
    bodyModel[151] = new ModelRendererTurbo(this, 1, 383, textureX, textureY);
    bodyModel[152] = new ModelRendererTurbo(this, 1, 400, textureX, textureY);
    bodyModel[153] = new ModelRendererTurbo(this, 0, 383, textureX, textureY);
    bodyModel[154] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
    bodyModel[155] = new ModelRendererTurbo(this, 0, 415, textureX, textureY);
    bodyModel[156] = new ModelRendererTurbo(this, 24, 415, textureX, textureY);
    bodyModel[157] = new ModelRendererTurbo(this, 32, 415, textureX, textureY);
    bodyModel[158] = new ModelRendererTurbo(this, 37, 415, textureX, textureY);
    bodyModel[159] = new ModelRendererTurbo(this, 0, 422, textureX, textureY);
    bodyModel[160] = new ModelRendererTurbo(this, 27, 422, textureX, textureY);
    bodyModel[161] = new ModelRendererTurbo(this, 39, 422, textureX, textureY);
    bodyModel[162] = new ModelRendererTurbo(this, 45, 422, textureX, textureY);
    bodyModel[163] = new ModelRendererTurbo(this, 340, 335, textureX, textureY);
    bodyModel[164] = new ModelRendererTurbo(this, 362, 335, textureX, textureY);
    bodyModel[165] = new ModelRendererTurbo(this, 357, 335, textureX, textureY);
    bodyModel[166] = new ModelRendererTurbo(this, 366, 335, textureX, textureY);
    bodyModel[167] = new ModelRendererTurbo(this, 340, 345, textureX, textureY);
    bodyModel[168] = new ModelRendererTurbo(this, 340, 345, textureX, textureY);
    bodyModel[169] = new ModelRendererTurbo(this, 340, 350, textureX, textureY);
    bodyModel[170] = new ModelRendererTurbo(this, 340, 355, textureX, textureY);
    bodyModel[171] = new ModelRendererTurbo(this, 340, 370, textureX, textureY);
    bodyModel[172] = new ModelRendererTurbo(this, 340, 375, textureX, textureY);
    bodyModel[173] = new ModelRendererTurbo(this, 350, 375, textureX, textureY);
    bodyModel[174] = new ModelRendererTurbo(this, 356, 375, textureX, textureY);
    bodyModel[175] = new ModelRendererTurbo(this, 0, 300, textureX, textureY);
    bodyModel[176] = new ModelRendererTurbo(this, 0, 306, textureX, textureY);
    bodyModel[177] = new ModelRendererTurbo(this, 0, 318, textureX, textureY);
    bodyModel[178] = new ModelRendererTurbo(this, 27, 300, textureX, textureY);
    bodyModel[179] = new ModelRendererTurbo(this, 27, 306, textureX, textureY);
    bodyModel[180] = new ModelRendererTurbo(this, 35, 318, textureX, textureY);
    bodyModel[181] = new ModelRendererTurbo(this, 55, 300, textureX, textureY);
    bodyModel[182] = new ModelRendererTurbo(this, 55, 300, textureX, textureY);
    bodyModel[183] = new ModelRendererTurbo(this, 55, 305, textureX, textureY);
    bodyModel[184] = new ModelRendererTurbo(this, 55, 305, textureX, textureY);
    bodyModel[185] = new ModelRendererTurbo(this, 70, 300, textureX, textureY);
    bodyModel[186] = new ModelRendererTurbo(this, 70, 300, textureX, textureY);
    bodyModel[187] = new ModelRendererTurbo(this, 70, 310, textureX, textureY);
    bodyModel[188] = new ModelRendererTurbo(this, 70, 310, textureX, textureY);
    bodyModel[189] = new ModelRendererTurbo(this, 95, 300, textureX, textureY);
    bodyModel[190] = new ModelRendererTurbo(this, 95, 300, textureX, textureY);
    bodyModel[191] = new ModelRendererTurbo(this, 95, 315, textureX, textureY);
    bodyModel[192] = new ModelRendererTurbo(this, 95, 315, textureX, textureY);
    bodyModel[193] = new ModelRendererTurbo(this, 95, 325, textureX, textureY);
    bodyModel[194] = new ModelRendererTurbo(this, 95, 325, textureX, textureY);
    bodyModel[195] = new ModelRendererTurbo(this, 118, 300, textureX, textureY);
    bodyModel[196] = new ModelRendererTurbo(this, 118, 310, textureX, textureY);
    bodyModel[197] = new ModelRendererTurbo(this, 132, 300, textureX, textureY);
    bodyModel[198] = new ModelRendererTurbo(this, 132, 310, textureX, textureY);
    bodyModel[199] = new ModelRendererTurbo(this, 142, 300, textureX, textureY);
    bodyModel[200] = new ModelRendererTurbo(this, 165, 300, textureX, textureY);
    bodyModel[201] = new ModelRendererTurbo(this, 175, 300, textureX, textureY);
    bodyModel[202] = new ModelRendererTurbo(this, 175, 300, textureX, textureY);
    bodyModel[203] = new ModelRendererTurbo(this, 175, 300, textureX, textureY);
    bodyModel[204] = new ModelRendererTurbo(this, 175, 300, textureX, textureY);
    bodyModel[205] = new ModelRendererTurbo(this, 185, 300, textureX, textureY);
    bodyModel[206] = new ModelRendererTurbo(this, 185, 310, textureX, textureY);
    bodyModel[207] = new ModelRendererTurbo(this, 195, 300, textureX, textureY);
    bodyModel[208] = new ModelRendererTurbo(this, 195, 310, textureX, textureY);
    bodyModel[209] = new ModelRendererTurbo(this, 220, 300, textureX, textureY);
    bodyModel[210] = new ModelRendererTurbo(this, 220, 310, textureX, textureY);
    bodyModel[211] = new ModelRendererTurbo(this, 230, 300, textureX, textureY);
    bodyModel[212] = new ModelRendererTurbo(this, 230, 317, textureX, textureY);
    bodyModel[213] = new ModelRendererTurbo(this, 260, 300, textureX, textureY);
    bodyModel[214] = new ModelRendererTurbo(this, 260, 318, textureX, textureY);
    bodyModel[215] = new ModelRendererTurbo(this, 293, 300, textureX, textureY);
    bodyModel[216] = new ModelRendererTurbo(this, 293, 315, textureX, textureY);
    bodyModel[217] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    bodyModel[218] = new ModelRendererTurbo(this, 50, 225, textureX, textureY);
    bodyModel[219] = new ModelRendererTurbo(this, 325, 300, textureX, textureY);
    bodyModel[220] = new ModelRendererTurbo(this, 110, 225, textureX, textureY);
    bodyModel[221] = new ModelRendererTurbo(this, 325, 225, textureX, textureY);
    bodyModel[222] = new ModelRendererTurbo(this, 325, 250, textureX, textureY);
    bodyModel[223] = new ModelRendererTurbo(this, 0, 205, textureX, textureY);
    bodyModel[224] = new ModelRendererTurbo(this, 240, 205, textureX, textureY);
    bodyModel[225] = new ModelRendererTurbo(this, 390, 300, textureX, textureY);
    bodyModel[226] = new ModelRendererTurbo(this, 425, 300, textureX, textureY);
    bodyModel[227] = new ModelRendererTurbo(this, 390, 317, textureX, textureY);
    bodyModel[228] = new ModelRendererTurbo(this, 425, 317, textureX, textureY);
    bodyModel[229] = new ModelRendererTurbo(this, 10, 373, textureX, textureY);
    bodyModel[230] = new ModelRendererTurbo(this, 20, 373, textureX, textureY);
    bodyModel[231] = new ModelRendererTurbo(this, 20, 373, textureX, textureY);
    bodyModel[232] = new ModelRendererTurbo(this, 10, 373, textureX, textureY);
    
    bodyModel[233] = new ModelRendererTurbo(this, 425, 0, textureX, textureY);
    
    bodyModel[233].addBox(-2.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
    bodyModel[233].setRotationPoint(45.0F, -17.5F, -9.5F);

    
    bodyModel[0].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 13.0F, 3, 3, 12, 13, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    bodyModel[0].setRotationPoint(-45.0F, -5.0F, -11.5F);
    
    bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[1].setRotationPoint(-33.5F, 2.5F, -25.0F);
    
    bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[2].setRotationPoint(-17.5F, 2.5F, -25.0F);
    
    bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[3].setRotationPoint(-5.5F, 2.5F, -25.0F);
    
    bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[4].setRotationPoint(10.5F, 2.5F, -25.0F);
    
    bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[5].setRotationPoint(22.5F, 2.5F, -25.0F);
    
    bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[6].setRotationPoint(38.5F, 2.5F, -25.0F);
    
    bodyModel[7].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 13.0F, 3, 3, 12, 13, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    bodyModel[7].setRotationPoint(51.0F, -4.0F, -13.0F);
    
    bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[8].setRotationPoint(23.0F, -10.0F, -24.0F);
    
    bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[9].setRotationPoint(-5.0F, -10.0F, -24.0F);
    
    bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[10].setRotationPoint(-33.0F, -10.0F, -24.0F);
    
    bodyModel[11].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 13.0F, 3, 3, 12, 13, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    bodyModel[11].setRotationPoint(-45.0F, -5.0F, 24.5F);
    
    bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[12].setRotationPoint(-33.5F, 2.5F, 17.0F);
    
    bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[13].setRotationPoint(-17.5F, 2.5F, 17.0F);
    
    bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[14].setRotationPoint(-5.5F, 2.5F, 17.0F);
    
    bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[15].setRotationPoint(10.5F, 2.5F, 17.0F);
    
    bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[16].setRotationPoint(22.5F, 2.5F, 17.0F);
    
    bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F);
    bodyModel[17].setRotationPoint(38.5F, 2.5F, 17.0F);
    
    bodyModel[18].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 13.0F, 3, 3, 12, 13, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    bodyModel[18].setRotationPoint(51.0F, -4.0F, 26.0F);
    
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[19].setRotationPoint(23.0F, -10.0F, 18.0F);
    
    bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[20].setRotationPoint(-5.0F, -10.0F, 18.0F);
    
    bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[21].setRotationPoint(-33.0F, -10.0F, 18.0F);
    
    bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
    bodyModel[22].setRotationPoint(37.0F, -11.0F, -23.0F);
    (bodyModel[22]).rotateAngleZ = -1.902409F;
    
    bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 7, 1, 4, 0.0F);
    bodyModel[23].setRotationPoint(30.0F, -12.0F, -23.0F);
    
    bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
    bodyModel[24].setRotationPoint(30.0F, -12.0F, -23.0F);
    (bodyModel[24]).rotateAngleZ = -0.6457718F;
    
    bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
    bodyModel[25].setRotationPoint(9.0F, -11.0F, -23.0F);
    (bodyModel[25]).rotateAngleZ = -1.902409F;
    
    bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 7, 1, 4, 0.0F);
    bodyModel[26].setRotationPoint(2.0F, -12.0F, -23.0F);
    
    bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
    bodyModel[27].setRotationPoint(2.0F, -12.0F, -23.0F);
    (bodyModel[27]).rotateAngleZ = -0.6457718F;
    
    bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
    bodyModel[28].setRotationPoint(-19.0F, -11.0F, -23.0F);
    (bodyModel[28]).rotateAngleZ = -1.902409F;
    
    bodyModel[29].addBox(0.0F, 0.0F, 0.0F, 7, 1, 4, 0.0F);
    bodyModel[29].setRotationPoint(-26.0F, -12.0F, -23.0F);
    
    bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
    bodyModel[30].setRotationPoint(-26.0F, -12.0F, -23.0F);
    (bodyModel[30]).rotateAngleZ = -0.6457718F;
    
    bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
    bodyModel[31].setRotationPoint(37.0F, -11.0F, 19.0F);
    (bodyModel[31]).rotateAngleZ = -1.902409F;
    
    bodyModel[32].addBox(0.0F, 0.0F, 0.0F, 7, 1, 4, 0.0F);
    bodyModel[32].setRotationPoint(30.0F, -12.0F, 19.0F);
    
    bodyModel[33].addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
    bodyModel[33].setRotationPoint(30.0F, -12.0F, 19.0F);
    (bodyModel[33]).rotateAngleZ = -0.6457718F;
    
    bodyModel[34].addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
    bodyModel[34].setRotationPoint(9.0F, -11.0F, 19.0F);
    (bodyModel[34]).rotateAngleZ = -1.902409F;
    
    bodyModel[35].addBox(0.0F, 0.0F, 0.0F, 7, 1, 4, 0.0F);
    bodyModel[35].setRotationPoint(2.0F, -12.0F, 19.0F);
    
    bodyModel[36].addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
    bodyModel[36].setRotationPoint(2.0F, -12.0F, 19.0F);
    (bodyModel[36]).rotateAngleZ = -0.6457718F;
    
    bodyModel[37].addBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F);
    bodyModel[37].setRotationPoint(-19.0F, -11.0F, 19.0F);
    (bodyModel[37]).rotateAngleZ = -1.902409F;
    
    bodyModel[38].addBox(0.0F, 0.0F, 0.0F, 7, 1, 4, 0.0F);
    bodyModel[38].setRotationPoint(-26.0F, -12.0F, 19.0F);
    
    bodyModel[39].addBox(0.0F, 0.0F, 0.0F, 1, 5, 4, 0.0F);
    bodyModel[39].setRotationPoint(-26.0F, -12.0F, 19.0F);
    (bodyModel[39]).rotateAngleZ = -0.6457718F;
    
    bodyModel[40].addBox(0.0F, 0.0F, 0.0F, 9, 3, 9, 0.0F);
    bodyModel[40].setRotationPoint(27.0F, -8.0F, -25.0F);
    
    bodyModel[41].addFlexBox(0.0F, 0.0F, 0.0F, 9, 1, 9, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[41].setRotationPoint(27.0F, -5.0F, -25.0F);
    
    bodyModel[42].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 3, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[42].setRotationPoint(28.5F, -4.0F, -19.0F);
    
    bodyModel[43].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 2, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[43].setRotationPoint(28.5F, -4.0F, -25.0F);
    
    bodyModel[44].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[44].setRotationPoint(23.5F, -8.0F, -19.5F);
    
    bodyModel[45].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[45].setRotationPoint(23.5F, -8.0F, -23.5F);
    
    bodyModel[46].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[46].setRotationPoint(31.5F, -2.0F, -24.5F);
    
    bodyModel[47].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[47].setRotationPoint(23.5F, -2.0F, -24.5F);
    
    bodyModel[48].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[48].setRotationPoint(31.5F, -2.0F, -18.5F);
    
    bodyModel[49].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[49].setRotationPoint(23.5F, -2.0F, -18.5F);
    
    bodyModel[50].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[50].setRotationPoint(31.5F, 0.0F, -24.5F);
    
    bodyModel[51].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[51].setRotationPoint(23.5F, 0.0F, -24.5F);
    
    bodyModel[52].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[52].setRotationPoint(31.5F, 0.0F, -18.5F);
    
    bodyModel[53].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[53].setRotationPoint(23.5F, 0.0F, -18.5F);
    
    bodyModel[54].addBox(0.0F, 0.0F, 0.0F, 9, 3, 9, 0.0F);
    bodyModel[54].setRotationPoint(27.0F, -8.0F, 16.0F);
    
    bodyModel[55].addFlexBox(0.0F, 0.0F, 0.0F, 9, 1, 9, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[55].setRotationPoint(27.0F, -5.0F, 16.0F);
    
    bodyModel[56].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 3, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[56].setRotationPoint(28.5F, -4.0F, 16.0F);
    
    bodyModel[57].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 2, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[57].setRotationPoint(28.5F, -4.0F, 23.0F);
    
    bodyModel[58].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[58].setRotationPoint(23.5F, -8.0F, 18.5F);
    
    bodyModel[59].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[59].setRotationPoint(23.5F, -8.0F, 22.5F);
    
    bodyModel[60].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[60].setRotationPoint(31.5F, -2.0F, 23.5F);
    
    bodyModel[61].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[61].setRotationPoint(23.5F, -2.0F, 23.5F);
    
    bodyModel[62].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[62].setRotationPoint(31.5F, -2.0F, 17.5F);
    
    bodyModel[63].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[63].setRotationPoint(23.5F, -2.0F, 17.5F);
    
    bodyModel[64].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[64].setRotationPoint(31.5F, 0.0F, 23.5F);
    
    bodyModel[65].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[65].setRotationPoint(23.5F, 0.0F, 23.5F);
    
    bodyModel[66].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[66].setRotationPoint(31.5F, 0.0F, 17.5F);
    
    bodyModel[67].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[67].setRotationPoint(23.5F, 0.0F, 17.5F);
    
    bodyModel[68].addBox(0.0F, 0.0F, 0.0F, 9, 3, 9, 0.0F);
    bodyModel[68].setRotationPoint(-1.0F, -8.0F, -25.0F);
    
    bodyModel[69].addFlexBox(0.0F, 0.0F, 0.0F, 9, 1, 9, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[69].setRotationPoint(-1.0F, -5.0F, -25.0F);
    
    bodyModel[70].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 3, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[70].setRotationPoint(0.5F, -4.0F, -19.0F);
    
    bodyModel[71].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 2, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[71].setRotationPoint(0.5F, -4.0F, -25.0F);
    
    bodyModel[72].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[72].setRotationPoint(-4.5F, -8.0F, -19.5F);
    
    bodyModel[73].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[73].setRotationPoint(-4.5F, -8.0F, -23.5F);
    
    bodyModel[74].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[74].setRotationPoint(3.5F, -2.0F, -24.5F);
    
    bodyModel[75].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[75].setRotationPoint(-4.5F, -2.0F, -24.5F);
    
    bodyModel[76].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[76].setRotationPoint(3.5F, -2.0F, -18.5F);
    
    bodyModel[77].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[77].setRotationPoint(-4.5F, -2.0F, -18.5F);
    
    bodyModel[78].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[78].setRotationPoint(3.5F, 0.0F, -24.5F);
    
    bodyModel[79].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[79].setRotationPoint(-4.5F, 0.0F, -24.5F);
    
    bodyModel[80].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[80].setRotationPoint(3.5F, 0.0F, -18.5F);
    
    bodyModel[81].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[81].setRotationPoint(-4.5F, 0.0F, -18.5F);
    
    bodyModel[82].addBox(0.0F, 0.0F, 0.0F, 9, 3, 9, 0.0F);
    bodyModel[82].setRotationPoint(-1.0F, -8.0F, 16.0F);
    
    bodyModel[83].addFlexBox(0.0F, 0.0F, 0.0F, 9, 1, 9, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[83].setRotationPoint(-1.0F, -5.0F, 16.0F);
    
    bodyModel[84].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 3, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[84].setRotationPoint(0.5F, -4.0F, 16.0F);
    
    bodyModel[85].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 2, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[85].setRotationPoint(0.5F, -4.0F, 23.0F);
    
    bodyModel[86].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[86].setRotationPoint(-4.5F, -8.0F, 18.5F);
    
    bodyModel[87].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[87].setRotationPoint(-4.5F, -8.0F, 22.5F);
    
    bodyModel[88].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[88].setRotationPoint(3.5F, -2.0F, 23.5F);
    
    bodyModel[89].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[89].setRotationPoint(-4.5F, -2.0F, 23.5F);
    
    bodyModel[90].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[90].setRotationPoint(3.5F, -2.0F, 17.5F);
    
    bodyModel[91].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[91].setRotationPoint(-4.5F, -2.0F, 17.5F);
    
    bodyModel[92].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[92].setRotationPoint(3.5F, 0.0F, 23.5F);
    
    bodyModel[93].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[93].setRotationPoint(-4.5F, 0.0F, 23.5F);
    
    bodyModel[94].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[94].setRotationPoint(3.5F, 0.0F, 17.5F);
    
    bodyModel[95].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[95].setRotationPoint(-4.5F, 0.0F, 17.5F);
    
    bodyModel[96].addBox(0.0F, 0.0F, 0.0F, 9, 3, 9, 0.0F);
    bodyModel[96].setRotationPoint(-29.0F, -8.0F, -25.0F);
    
    bodyModel[97].addFlexBox(0.0F, 0.0F, 0.0F, 9, 1, 9, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[97].setRotationPoint(-29.0F, -5.0F, -25.0F);
    
    bodyModel[98].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 3, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[98].setRotationPoint(-27.5F, -4.0F, -19.0F);
    
    bodyModel[99].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 2, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[99].setRotationPoint(-27.5F, -4.0F, -25.0F);
    
    bodyModel[100].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[100].setRotationPoint(-32.5F, -8.0F, -19.5F);
    
    bodyModel[101].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[101].setRotationPoint(-32.5F, -8.0F, -23.5F);
    
    bodyModel[102].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[102].setRotationPoint(-24.5F, -2.0F, -24.5F);
    
    bodyModel[103].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[103].setRotationPoint(-32.5F, -2.0F, -24.5F);
    
    bodyModel[104].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[104].setRotationPoint(-24.5F, -2.0F, -18.5F);
    
    bodyModel[105].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[105].setRotationPoint(-32.5F, -2.0F, -18.5F);
    
    bodyModel[106].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[106].setRotationPoint(-24.5F, 0.0F, -24.5F);
    
    bodyModel[107].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[107].setRotationPoint(-32.5F, 0.0F, -24.5F);
    
    bodyModel[108].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[108].setRotationPoint(-24.5F, 0.0F, -18.5F);
    
    bodyModel[109].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[109].setRotationPoint(-32.5F, 0.0F, -18.5F);
    
    bodyModel[110].addBox(0.0F, 0.0F, 0.0F, 9, 3, 9, 0.0F);
    bodyModel[110].setRotationPoint(-29.0F, -8.0F, 16.0F);
    
    bodyModel[111].addFlexBox(0.0F, 0.0F, 0.0F, 9, 1, 9, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[111].setRotationPoint(-29.0F, -5.0F, 16.0F);
    
    bodyModel[112].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 3, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[112].setRotationPoint(-27.5F, -4.0F, 16.0F);
    
    bodyModel[113].addFlexBox(0.0F, 0.0F, 0.0F, 6, 7, 2, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 5);
    bodyModel[113].setRotationPoint(-27.5F, -4.0F, 23.0F);
    
    bodyModel[114].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[114].setRotationPoint(-32.5F, -8.0F, 18.5F);
    
    bodyModel[115].addFlexBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 2.0F, -3.5F, 0.0F, 0.0F, 3);
    bodyModel[115].setRotationPoint(-32.5F, -8.0F, 22.5F);
    
    bodyModel[116].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[116].setRotationPoint(-24.5F, -2.0F, 23.5F);
    
    bodyModel[117].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[117].setRotationPoint(-32.5F, -2.0F, 23.5F);
    
    bodyModel[118].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 2);
    bodyModel[118].setRotationPoint(-24.5F, -2.0F, 17.5F);
    
    bodyModel[119].addFlexBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, -4.5F, 4.5F, 0.0F, 0.0F, 3);
    bodyModel[119].setRotationPoint(-32.5F, -2.0F, 17.5F);
    
    bodyModel[120].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[120].setRotationPoint(-24.5F, 0.0F, 23.5F);
    
    bodyModel[121].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[121].setRotationPoint(-32.5F, 0.0F, 23.5F);
    
    bodyModel[122].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 2);
    bodyModel[122].setRotationPoint(-24.5F, 0.0F, 17.5F);
    
    bodyModel[123].addFlexBox(0.0F, 0.0F, 0.0F, 8, 3, 1, 0.0F, -2.5F, 1.5F, 0.0F, 0.0F, 3);
    bodyModel[123].setRotationPoint(-32.5F, 0.0F, 17.5F);
    
    bodyModel[124].addBox(0.0F, 0.0F, 0.0F, 104, 1, 13, 0.0F);
    bodyModel[124].setRotationPoint(-54.0F, -15.0F, -28.0F);
    
    bodyModel[125].addBox(0.0F, 0.0F, 0.0F, 104, 1, 13, 0.0F);
    bodyModel[125].setRotationPoint(-54.0F, -15.0F, 15.0F);
    
    bodyModel[126].addBox(0.0F, 0.0F, 0.0F, 22, 13, 56, 0.0F);
    bodyModel[126].setRotationPoint(10.0F, -28.0F, -28.0F);
    
    bodyModel[127].addShapeBox(0.0F, 0.0F, 0.0F, 64, 13, 12, 0.0F, -2.0F, -5.0F, 0.0F, -27.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -27.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[127].setRotationPoint(-54.0F, -28.0F, 16.0F);
    
    bodyModel[128].addShapeBox(0.0F, 0.0F, 0.0F, 64, 13, 12, 0.0F, -2.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, -27.0F, 0.0F, 0.0F, -2.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -27.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[128].setRotationPoint(-54.0F, -28.0F, -28.0F);
    
    bodyModel[129].addShapeBox(0.0F, 0.0F, 0.0F, 36, 9, 32, 0.0F, -1.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[129].setRotationPoint(-53.0F, -28.0F, -16.0F);
    
    bodyModel[130].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(23.0D, 0.0D, 23, 0), new Coord2D(30.0D, 7.0D, 30, 7), new Coord2D(30.0D, 23.0D, 30, 23), new Coord2D(23.0D, 30.0D, 23, 30), new Coord2D(7.0D, 30.0D, 7, 30), new Coord2D(0.0D, 23.0D, 0, 23), new Coord2D(0.0D, 7.0D, 0, 7) }), 5.0F, 30, 30, 104, 5, 0, new float[] { 10.0F, 16.0F, 10.0F, 16.0F, 10.0F, 16.0F, 10.0F, 16.0F });
    (bodyModel[130]).rotateAngleX = 1.5707964F;
    bodyModel[130].setRotationPoint(15.0F, -29.0F, 15.0F);
    
    bodyModel[131].addBox(10.0F, -0.3F, 0.0F, 20, 4, 20, 0.0F);
    bodyModel[131].setRotationPoint(-52.0F, -23.0F, -10.0F);
    (bodyModel[131]).rotateAngleZ = 0.1396263F;
    
    bodyModel[132].addBox(0.0F, 0.0F, 0.0F, 1, 6, 22, 0.0F);
    bodyModel[132].setRotationPoint(21.0F, -30.0F, -11.0F);
    
    bodyModel[133].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 7.0D, 4, 7), new Coord2D(4.0D, 8.0D, 4, 8), new Coord2D(3.0D, 7.0D, 3, 7) }), 6.0F, 4, 8, 20, 6, 0, new float[] { 8.0F, 2.0F, 1.0F, 8.0F, 1.0F });
    (bodyModel[133]).rotateAngleX = 1.5707964F;
    bodyModel[133].setRotationPoint(22.0F, -30.0F, -11.0F);
    
    bodyModel[134].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(7.0D, 3.0D, 7, 3), new Coord2D(7.0D, 4.0D, 7, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 6.0F, 7, 4, 18, 6, 0, new float[] { 1.0F, 8.0F, 1.0F, 8.0F });
    (bodyModel[134]).rotateAngleX = 1.5707964F;
    bodyModel[134].setRotationPoint(18.0F, -30.0F, -18.0F);
    
    bodyModel[135].addBox(0.0F, 0.0F, 0.0F, 22, 6, 1, 0.0F);
    bodyModel[135].setRotationPoint(-11.0F, -30.0F, -22.0F);
    
    bodyModel[136].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(7.0D, 1.0D, 7, 1), new Coord2D(0.0D, 4.0D, 0, 4) }), 6.0F, 7, 4, 18, 6, 0, new float[] { 1.0F, 8.0F, 1.0F, 8.0F });
    (bodyModel[136]).rotateAngleX = 1.5707964F;
    bodyModel[136].setRotationPoint(-11.0F, -30.0F, -18.0F);
    
    bodyModel[137].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(1.0D, 7.0D, 1, 7), new Coord2D(0.0D, 8.0D, 0, 8) }), 6.0F, 4, 8, 20, 6, 0, new float[] { 1.0F, 2.0F, 8.0F, 1.0F, 8.0F });
    (bodyModel[137]).rotateAngleX = 1.5707964F;
    bodyModel[137].setRotationPoint(-18.0F, -30.0F, -11.0F);
    
    bodyModel[138].addBox(0.0F, 0.0F, 0.0F, 1, 6, 5, 0.0F);
    bodyModel[138].setRotationPoint(-22.0F, -30.0F, -11.0F);
    
    bodyModel[139].addBox(0.0F, 0.0F, 0.0F, 1, 6, 5, 0.0F);
    bodyModel[139].setRotationPoint(-22.0F, -30.0F, 6.0F);
    
    bodyModel[140].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(1.0D, 7.0D, 1, 7), new Coord2D(0.0D, 8.0D, 0, 8) }), 6.0F, 4, 8, 20, 6, 0, new float[] { 1.0F, 2.0F, 8.0F, 1.0F, 8.0F });
    (bodyModel[140]).rotateAngleX = -1.5707964F;
    bodyModel[140].setRotationPoint(-18.0F, -24.0F, 11.0F);
    
    bodyModel[141].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(7.0D, 1.0D, 7, 1), new Coord2D(0.0D, 4.0D, 0, 4) }), 6.0F, 7, 4, 18, 6, 0, new float[] { 1.0F, 8.0F, 1.0F, 8.0F });
    (bodyModel[141]).rotateAngleX = -1.5707964F;
    bodyModel[141].setRotationPoint(-11.0F, -24.0F, 18.0F);
    
    bodyModel[142].addBox(0.0F, 0.0F, 0.0F, 22, 6, 1, 0.0F);
    bodyModel[142].setRotationPoint(-11.0F, -30.0F, 21.0F);
    
    bodyModel[143].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(7.0D, 3.0D, 7, 3), new Coord2D(7.0D, 4.0D, 7, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 6.0F, 7, 4, 18, 6, 0, new float[] { 1.0F, 8.0F, 1.0F, 8.0F });
    (bodyModel[143]).rotateAngleX = -1.5707964F;
    bodyModel[143].setRotationPoint(18.0F, -24.0F, 18.0F);
    
    bodyModel[144].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 7.0D, 4, 7), new Coord2D(4.0D, 8.0D, 4, 8), new Coord2D(3.0D, 7.0D, 3, 7) }), 6.0F, 4, 8, 20, 6, 0, new float[] { 8.0F, 2.0F, 1.0F, 8.0F, 1.0F });
    (bodyModel[144]).rotateAngleX = -1.5707964F;
    bodyModel[144].setRotationPoint(22.0F, -24.0F, 11.0F);
    
    bodyModel[145].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, -0.3F, 3);
    bodyModel[145].setRotationPoint(37.0F, -24.0F, -22.0F);
    
    bodyModel[146].addTrapezoid(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, -0.3F, 3);
    bodyModel[146].setRotationPoint(37.0F, -24.0F, 20.0F);
    
    bodyModel[147].addBox(0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F);
    bodyModel[147].setRotationPoint(38.0F, -25.0F, -22.5F);
    
    bodyModel[148].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
    bodyModel[148].setRotationPoint(38.0F, -25.0F, -22.5F);
    (bodyModel[148]).rotateAngleZ = -1.308997F;
    
    bodyModel[149].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
    bodyModel[149].setRotationPoint(38.0F, -25.0F, 19.5F);
    (bodyModel[149]).rotateAngleZ = -1.308997F;
    
    bodyModel[150].addBox(0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F);
    bodyModel[150].setRotationPoint(38.0F, -25.0F, 19.5F);
    
    bodyModel[151].addBox(-4.0F, 0.0F, -6.5F, 8, 1, 13, 0.0F);
    bodyModel[151].setRotationPoint(26.0F, -28.3F, -14.0F);
    (bodyModel[151]).rotateAngleY = 0.1745329F;
    
    bodyModel[152].addBox(-4.0F, 0.0F, -6.5F, 8, 1, 13, 0.0F);
    bodyModel[152].setRotationPoint(26.0F, -28.3F, 14.0F);
    (bodyModel[152]).rotateAngleY = -0.1745329F;
    
    bodyModel[153].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[153].setRotationPoint(31.0F, -28.3F, -8.0F);
    
    bodyModel[154].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[154].setRotationPoint(31.0F, -28.3F, 4.0F);
    
    bodyModel[155].addBox(17.0F, 9.0F, -0.7F, 10, 1, 1, 0.0F);
    bodyModel[155].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[155]).rotateAngleX = 1.876229F;
    (bodyModel[155]).rotateAngleZ = 0.1396263F;
    
    bodyModel[156].addBox(15.0F, 7.0F, -0.6F, 2, 4, 1, 0.0F);
    bodyModel[156].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[156]).rotateAngleX = 1.876229F;
    (bodyModel[156]).rotateAngleZ = 0.1396263F;
    
    bodyModel[157].addBox(24.0F, 8.5F, -0.5F, 1, 2, 1, 0.0F);
    bodyModel[157].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[157]).rotateAngleX = 1.876229F;
    (bodyModel[157]).rotateAngleZ = 0.1396263F;
    
    bodyModel[158].addBox(14.5F, 7.5F, -0.5F, 3, 1, 1, 0.0F);
    bodyModel[158].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[158]).rotateAngleX = 1.876229F;
    (bodyModel[158]).rotateAngleZ = 0.1396263F;
    
    bodyModel[159].addBox(12.0F, 3.0F, -0.7F, 12, 1, 1, 0.0F);
    bodyModel[159].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[159]).rotateAngleX = 1.876229F;
    (bodyModel[159]).rotateAngleZ = 0.1396263F;
    
    bodyModel[160].addBox(23.0F, 2.0F, -0.6F, 4, 3, 1, 0.0F);
    bodyModel[160].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[160]).rotateAngleX = 1.876229F;
    (bodyModel[160]).rotateAngleZ = 0.1396263F;
    
    bodyModel[161].addBox(13.0F, 2.5F, -0.5F, 1, 2, 1, 0.0F);
    bodyModel[161].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[161]).rotateAngleX = 1.876229F;
    (bodyModel[161]).rotateAngleZ = 0.1396263F;
    
    bodyModel[162].addBox(25.0F, 1.5F, -0.5F, 1, 4, 1, 0.0F);
    bodyModel[162].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[162]).rotateAngleX = 1.876229F;
    (bodyModel[162]).rotateAngleZ = 0.1396263F;
    
    bodyModel[163].addBox(1.0F, -0.4F, 26.0F, 3, 1, 3, 0.0F);
    bodyModel[163].setRotationPoint(-52.0F, -23.0F, -16.0F);
    (bodyModel[163]).rotateAngleZ = 0.1396263F;
    
    bodyModel[164].addBox(2.0F, -0.3F, 9.0F, 1, 1, 17, 0.0F);
    bodyModel[164].setRotationPoint(-52.0F, -23.0F, -16.0F);
    (bodyModel[164]).rotateAngleZ = 0.1396263F;
    
    bodyModel[165].addBox(1.5F, -0.5F, 23.0F, 2, 1, 1, 0.0F);
    bodyModel[165].setRotationPoint(-52.0F, -23.0F, -16.0F);
    (bodyModel[165]).rotateAngleZ = 0.1396263F;
    
    bodyModel[166].addBox(1.5F, -0.5F, 10.0F, 2, 1, 1, 0.0F);
    bodyModel[166].setRotationPoint(-52.0F, -23.0F, -16.0F);
    (bodyModel[166]).rotateAngleZ = 0.1396263F;
    
    bodyModel[167].addBox(5.0F, -0.3F, 4.0F, 1, 1, 17, 0.0F);
    bodyModel[167].setRotationPoint(-52.0F, -23.0F, -16.0F);
    (bodyModel[167]).rotateAngleZ = 0.1396263F;
    
    bodyModel[168].addBox(4.0F, -0.4F, 3.0F, 3, 1, 1, 0.0F);
    bodyModel[168].setRotationPoint(-52.0F, -23.0F, -16.0F);
    (bodyModel[168]).rotateAngleZ = 0.1396263F;
    
    bodyModel[169].addBox(4.5F, -0.5F, 19.0F, 2, 1, 1, 0.0F);
    bodyModel[169].setRotationPoint(-52.0F, -23.0F, -16.0F);
    (bodyModel[169]).rotateAngleZ = 0.1396263F;
    
    bodyModel[170].addBox(4.5F, -0.5F, 6.0F, 2, 1, 1, 0.0F);
    bodyModel[170].setRotationPoint(-52.0F, -23.0F, -16.0F);
    (bodyModel[170]).rotateAngleZ = 0.1396263F;
    
    bodyModel[171].addBox(36.0F, 4.0F, -0.7F, 15, 1, 1, 0.0F);
    bodyModel[171].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[171]).rotateAngleX = 1.876229F;
    (bodyModel[171]).rotateAngleZ = 0.1396263F;
    
    bodyModel[172].addBox(51.0F, 3.5F, -0.7F, 2, 2, 1, 0.0F);
    bodyModel[172].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[172]).rotateAngleX = 1.876229F;
    (bodyModel[172]).rotateAngleZ = 0.1396263F;
    
    bodyModel[173].addBox(37.0F, 3.5F, -0.5F, 1, 2, 1, 0.0F);
    bodyModel[173].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[173]).rotateAngleX = 1.876229F;
    (bodyModel[173]).rotateAngleZ = 0.1396263F;
    
    bodyModel[174].addBox(48.0F, 3.5F, -0.5F, 1, 2, 1, 0.0F);
    bodyModel[174].setRotationPoint(-54.0F, -19.0F, -28.0F);
    (bodyModel[174]).rotateAngleX = 1.876229F;
    (bodyModel[174]).rotateAngleZ = 0.1396263F;
    
    bodyModel[175].addBox(0.0F, 0.0F, 0.0F, 9, 1, 3, 0.0F);
    bodyModel[175].setRotationPoint(-49.5F, -2.0F, 12.0F);
    
    bodyModel[176].addBox(0.0F, 0.0F, 0.0F, 9, 8, 1, 0.0F);
    bodyModel[176].setRotationPoint(-49.5F, -9.5F, 12.0F);
    
    bodyModel[177].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(9.0D, 4.0D, 9, 4), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 7.0D, 6, 7), new Coord2D(0.0D, 7.0D, 0, 7) }), 2.0F, 9, 7, 32, 2, 0, new float[] { 7.0F, 6.0F, 3.0F, 3.0F, 4.0F, 9.0F });
    bodyModel[177].setRotationPoint(-40.0F, -2.0F, 15.0F);
    
    bodyModel[178].addBox(0.0F, 0.0F, 0.0F, 9, 1, 3, 0.0F);
    bodyModel[178].setRotationPoint(-49.5F, -2.0F, -15.0F);
    
    bodyModel[179].addBox(0.0F, 0.0F, 0.0F, 9, 8, 1, 0.0F);
    bodyModel[179].setRotationPoint(-49.5F, -9.5F, -13.0F);
    
    bodyModel[180].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(9.0D, 4.0D, 9, 4), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 7.0D, 6, 7), new Coord2D(0.0D, 7.0D, 0, 7) }), 2.0F, 9, 7, 32, 2, 0, new float[] { 7.0F, 6.0F, 3.0F, 3.0F, 4.0F, 9.0F });
    bodyModel[180].setRotationPoint(-40.0F, -2.0F, -13.0F);
    
    bodyModel[181].addBox(0.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F);
    bodyModel[181].setRotationPoint(-44.0F, -3.0F, 10.0F);
    
    bodyModel[182].addBox(0.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F);
    bodyModel[182].setRotationPoint(-44.0F, -3.0F, -11.0F);
    
    bodyModel[183].addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
    bodyModel[183].setRotationPoint(-43.5F, -2.0F, 9.5F);
    
    bodyModel[184].addBox(0.0F, 0.0F, 0.0F, 1, 3, 2, 0.0F);
    bodyModel[184].setRotationPoint(-43.5F, -2.0F, -11.5F);
    
    bodyModel[185].addBox(0.0F, 0.0F, 0.0F, 6, 2, 5, 0.0F);
    bodyModel[185].setRotationPoint(-46.0F, -19.5F, 3.0F);
    
    bodyModel[186].addBox(0.0F, 0.0F, 0.0F, 6, 2, 5, 0.0F);
    bodyModel[186].setRotationPoint(-46.0F, -19.5F, -8.0F);
    
    bodyModel[187].addFlexBox(0.0F, 0.0F, 0.0F, 6, 2, 5, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2);
    bodyModel[187].setRotationPoint(-52.0F, -19.0F, 3.0F);
    
    bodyModel[188].addFlexBox(0.0F, 0.0F, 0.0F, 6, 2, 5, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 2);
    bodyModel[188].setRotationPoint(-52.0F, -19.0F, -8.0F);
    
    bodyModel[189].addBox(0.0F, 0.0F, 0.0F, 5, 6, 5, 0.0F);
    bodyModel[189].setRotationPoint(-46.5F, -19.0F, 10.0F);
    
    bodyModel[190].addBox(0.0F, 0.0F, 0.0F, 5, 6, 5, 0.0F);
    bodyModel[190].setRotationPoint(-46.5F, -19.0F, -15.0F);
    
    bodyModel[191].addTrapezoid(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F, -0.5F, 5);
    bodyModel[191].setRotationPoint(-45.5F, -14.0F, 11.0F);
    
    bodyModel[192].addTrapezoid(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F, -0.5F, 5);
    bodyModel[192].setRotationPoint(-45.5F, -14.0F, -14.0F);
    
    bodyModel[193].addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
    bodyModel[193].setRotationPoint(-47.0F, -15.0F, 9.5F);
    
    bodyModel[194].addBox(0.0F, 0.0F, 0.0F, 6, 1, 6, 0.0F);
    bodyModel[194].setRotationPoint(-47.0F, -15.0F, -15.5F);
    
    bodyModel[195].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[195].setRotationPoint(-54.0F, -19.0F, 12.0F);
    
    bodyModel[196].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
    bodyModel[196].setRotationPoint(-54.0F, -19.0F, -16.0F);
    
    bodyModel[197].addBox(0.0F, 0.0F, 0.0F, 11, 4, 1, 0.0F);
    bodyModel[197].setRotationPoint(-52.0F, -19.0F, 15.0F);
    
    bodyModel[198].addBox(0.0F, 0.0F, 0.0F, 11, 4, 1, 0.0F);
    bodyModel[198].setRotationPoint(-52.0F, -19.0F, -16.0F);
    
    bodyModel[199].addBox(0.0F, 0.0F, 0.0F, 1, 13, 17, 0.0F);
    bodyModel[199].setRotationPoint(-41.3F, -14.0F, -8.5F);
    
    bodyModel[200].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[200].setRotationPoint(-42.5F, -10.5F, 0.0F);
    
    bodyModel[201].addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
    bodyModel[201].setRotationPoint(-42.0F, -13.0F, 8.0F);
    
    bodyModel[202].addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
    bodyModel[202].setRotationPoint(-42.0F, -5.0F, 8.0F);
    
    bodyModel[203].addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
    bodyModel[203].setRotationPoint(-42.0F, -13.0F, -9.0F);
    
    bodyModel[204].addBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F);
    bodyModel[204].setRotationPoint(-42.0F, -5.0F, -9.0F);
    
    bodyModel[205].addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
    bodyModel[205].setRotationPoint(36.0F, -25.0F, -24.5F);
    
    bodyModel[206].addBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F);
    bodyModel[206].setRotationPoint(36.0F, -25.0F, 23.5F);
    
    bodyModel[207].addBox(0.0F, 0.0F, 0.0F, 10, 3, 1, 0.0F);
    bodyModel[207].setRotationPoint(42.0F, -6.0F, -6.0F);
    
    bodyModel[208].addBox(0.0F, 0.0F, 0.0F, 10, 3, 1, 0.0F);
    bodyModel[208].setRotationPoint(42.0F, -6.0F, 5.0F);
    
    bodyModel[209].addBox(0.0F, 0.0F, 0.0F, 3, 6, 1, 0.0F);
    bodyModel[209].setRotationPoint(-41.0F, -24.0F, 22.0F);
    
    bodyModel[210].addBox(0.0F, 0.0F, 0.0F, 3, 6, 1, 0.0F);
    bodyModel[210].setRotationPoint(-41.0F, -24.0F, -23.0F);
    
    bodyModel[211].addFlexBox(0.0F, 0.0F, 0.0F, 4, 6, 8, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 3);
    bodyModel[211].setRotationPoint(-49.0F, -25.0F, 18.0F);
    
    bodyModel[212].addFlexBox(0.0F, 0.0F, 0.0F, 4, 6, 8, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 3);
    bodyModel[212].setRotationPoint(-49.0F, -25.0F, -26.0F);
    
    bodyModel[213].addFlexBox(0.0F, 0.0F, 0.0F, 8, 7, 7, 0.0F, -1.5F, 0.0F, -1.0F, -1.0F, 2);
    bodyModel[213].setRotationPoint(36.0F, -22.0F, -13.0F);
    
    bodyModel[214].addFlexBox(0.0F, 0.0F, 0.0F, 2, 4, 4, 0.0F, -1.5F, -0.5F, -1.0F, -1.0F, 2);
    bodyModel[214].setRotationPoint(43.5F, -20.0F, -11.5F);
    
    bodyModel[215].addBox(0.0F, 0.0F, 0.0F, 14, 10, 1, 0.0F);
    bodyModel[215].setRotationPoint(10.0F, -25.0F, -28.3F);
    
    bodyModel[216].addBox(0.0F, 0.0F, 0.0F, 14, 10, 1, 0.0F);
    bodyModel[216].setRotationPoint(10.0F, -25.0F, 27.3F);
    
    bodyModel[217].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(13.0D, 13.0D, 13, 13) }), 56.0F, 13, 13, 45, 56, 0, new float[] { 19.0F, 13.0F, 13.0F });
    bodyModel[217].setRotationPoint(45.0F, -15.0F, 28.0F);
    
    bodyModel[218].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(27.0D, 12.0D, 27, 12), new Coord2D(27.0D, 44.0D, 27, 44), new Coord2D(0.0D, 56.0D, 0, 56) }), 13.0F, 27, 56, 148, 13, 0, new float[] { 56.0F, 30.0F, 32.0F, 30.0F });
    (bodyModel[218]).rotateAngleX = 1.5707964F;
    bodyModel[218].setRotationPoint(10.0F, -28.0F, 28.0F);
    
    bodyModel[219].addBox(0.0F, 0.0F, 0.0F, 1, 4, 30, 0.0F);
    bodyModel[219].setRotationPoint(-41.0F, -19.0F, -15.0F);
    
    bodyModel[220].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(5.0D, 3.0D, 5, 3), new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(90.0D, 0.0D, 90, 0), new Coord2D(92.0D, 1.0D, 92, 1), new Coord2D(92.0D, 16.0D, 92, 16), new Coord2D(6.0D, 16.0D, 6, 16), new Coord2D(0.0D, 11.0D, 0, 11) }), 30.0F, 92, 16, 209, 30, 0, new float[] { 5.0F, 8.0F, 86.0F, 15.0F, 3.0F, 76.0F, 10.0F, 6.0F });
    bodyModel[220].setRotationPoint(51.0F, 1.0F, 15.0F);
    
    bodyModel[221].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(17.0D, 0.0D, 17, 0), new Coord2D(17.0D, 16.0D, 17, 16), new Coord2D(9.0D, 16.0D, 9, 16), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(1.0D, 9.0D, 1, 9), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(1.0D, 3.0D, 1, 3) }), 7.0F, 17, 16, 61, 7, 0, new float[] { 5.0F, 4.0F, 4.0F, 3.0F, 8.0F, 8.0F, 16.0F, 13.0F });
    bodyModel[221].setRotationPoint(54.0F, 1.0F, 15.0F);
    
    bodyModel[222].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(17.0D, 0.0D, 17, 0), new Coord2D(17.0D, 16.0D, 17, 16), new Coord2D(9.0D, 16.0D, 9, 16), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(1.0D, 9.0D, 1, 9), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(1.0D, 3.0D, 1, 3) }), 7.0F, 17, 16, 61, 7, 0, new float[] { 5.0F, 4.0F, 4.0F, 3.0F, 8.0F, 8.0F, 16.0F, 13.0F });
    bodyModel[222].setRotationPoint(54.0F, 1.0F, -8.0F);
    
    bodyModel[223].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(98.0D, 0.0D, 98, 0), new Coord2D(108.0D, 15.0D, 108, 15), new Coord2D(7.0D, 15.0D, 7, 15), new Coord2D(4.0D, 14.0D, 4, 14), new Coord2D(0.0D, 11.0D, 0, 11) }), 1.0F, 108, 15, 236, 1, 0, new float[] { 8.0F, 5.0F, 4.0F, 101.0F, 19.0F, 90.0F, 9.0F });
    bodyModel[223].setRotationPoint(57.0F, 1.0F, 16.0F);
    
    bodyModel[224].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(98.0D, 0.0D, 98, 0), new Coord2D(108.0D, 15.0D, 108, 15), new Coord2D(7.0D, 15.0D, 7, 15), new Coord2D(4.0D, 14.0D, 4, 14), new Coord2D(0.0D, 11.0D, 0, 11) }), 1.0F, 108, 15, 236, 1, 0, new float[] { 8.0F, 5.0F, 4.0F, 101.0F, 19.0F, 90.0F, 9.0F });
    bodyModel[224].setRotationPoint(57.0F, 1.0F, -15.0F);
    
    bodyModel[225].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[225].setRotationPoint(50.0F, -15.0F, -28.0F);
    
    bodyModel[226].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 13, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -3.0F, -9.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 3.0F, -9.0F, 0.0F, 3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[226].setRotationPoint(53.0F, -14.0F, -28.0F);
    
    bodyModel[227].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[227].setRotationPoint(50.0F, -15.0F, 15.0F);
    
    bodyModel[228].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -9.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 3.0F, 0.0F, 0.0F, 3.0F, -9.0F, 0.0F, 0.0F, -3.0F);
    bodyModel[228].setRotationPoint(53.0F, -14.0F, 15.0F);
    
    bodyModel[229].addBox(0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F);
    bodyModel[229].setRotationPoint(38.0F, -25.0F, -22.5F);
    
    bodyModel[230].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
    bodyModel[230].setRotationPoint(38.0F, -25.0F, -22.5F);
    (bodyModel[230]).rotateAngleZ = -1.308997F;
    
    bodyModel[231].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
    bodyModel[231].setRotationPoint(38.0F, -25.0F, 19.5F);
    (bodyModel[231]).rotateAngleZ = -1.308997F;
    
    bodyModel[232].addBox(0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F);
    bodyModel[232].setRotationPoint(38.0F, -25.0F, 19.5F);


    
    turretModel = new ModelRendererTurbo[17];
    turretModel[0] = new ModelRendererTurbo(this, 0, 150, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 310, 90, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 222, 150, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 54, 150, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 272, 172, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 185, 150, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 300, 150, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 326, 158, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 0, 150, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 0, 158, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 350, 150, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 267, 150, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 0, 168, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 26, 150, textureX, textureY);
    turretModel[14] = new ModelRendererTurbo(this, 320, 185, textureX, textureY);
    turretModel[15] = new ModelRendererTurbo(this, 0, 75, textureX, textureY);
    turretModel[16] = new ModelRendererTurbo(this, 7, 75, textureX, textureY);
    
    turretModel[0].addShapeBox(7.0F, -43.0F, -17.0F, 8, 14, 34, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F);
    
    turretModel[1].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(19.0D, 1.0D, 19, 1), new Coord2D(26.0D, 8.0D, 26, 8), new Coord2D(26.0D, 30.0D, 26, 30), new Coord2D(19.0D, 37.0D, 19, 37), new Coord2D(13.0D, 38.0D, 13, 38), new Coord2D(5.0D, 38.0D, 5, 38), new Coord2D(0.0D, 36.0D, 0, 36) }), 14.0F, 26, 38, 118, 14, 0, new float[] { 34.0F, 6.0F, 8.0F, 7.0F, 10.0F, 22.0F, 10.0F, 7.0F, 8.0F, 6.0F });
    (turretModel[1]).rotateAngleX = 1.5707964F;
    turretModel[1].setRotationPoint(7.0F, -43.0F, 19.0F);
    
    turretModel[2].addShapeBox(-25.0F, -42.5F, -12.0F, 8, 13, 24, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -3.0F);
    
    turretModel[3].addBox(6.0F, -40.0F, -10.0F, 8, 9, 20, 0.0F);
    
    turretModel[4].addFlexBox(14.0F, -40.0F, -10.0F, 2, 9, 20, 0.0F, -1.0F, 1.0F, 0.0F, 0.0F, 2);
    
    turretModel[5].addFlexBox(16.0F, -41.0F, -10.5F, 1, 3, 21, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 4);
    
    turretModel[6].addBox(16.0F, -38.0F, -10.5F, 1, 5, 21, 0.0F);
    
    turretModel[7].addFlexBox(16.0F, -33.0F, -10.5F, 1, 3, 21, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 5);
    
    turretModel[8].addBox(3.0F, -44.5F, -9.0F, 2, 2, 4, 0.0F);
    
    turretModel[9].addTrapezoid(-1.0F, -44.5F, -3.0F, 6, 2, 6, 0.0F, -1.0F, 4);
    
    turretModel[10].addShape3D(8.0F, -8.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 2.0F, 16, 16, 56, 2, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    (turretModel[10]).rotateAngleX = 1.5707964F;
    turretModel[10].setRotationPoint(-9.0F, -44.5F, -7.0F);
    
    turretModel[11].addShape3D(4.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 10.0D, 8, 10), new Coord2D(6.0D, 12.0D, 6, 12), new Coord2D(2.0D, 12.0D, 2, 12), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 12, 36, 2, 0, new float[] { 3.0F, 8.0F, 3.0F, 4.0F, 3.0F, 8.0F, 3.0F, 4.0F });
    (turretModel[11]).rotateAngleX = 1.5707964F;
    (turretModel[11]).rotateAngleY = -0.2617994F;
    turretModel[11].setRotationPoint(-9.0F, -43.5F, 10.0F);
    
    turretModel[12].addTrapezoid(-25.0F, -44.5F, 5.0F, 4, 2, 4, 0.0F, -1.0F, 4);
    
    turretModel[13].addTrapezoid(-23.5F, -58.5F, 6.5F, 1, 14, 1, 0.0F, -0.4F, 4);
    
    turretModel[14].addShape3D(7.0F, -7.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(14.0D, 4.0D, 14, 4), new Coord2D(14.0D, 10.0D, 14, 10), new Coord2D(10.0D, 14.0D, 10, 14), new Coord2D(4.0D, 14.0D, 4, 14), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 4.0D, 0, 4) }), 4.0F, 14, 14, 48, 4, 0, new float[] { 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F });
    (turretModel[14]).rotateAngleX = 1.5707964F;
    turretModel[14].setRotationPoint(-9.0F, -45.0F, -7.0F);








    
    barrelModel = new ModelRendererTurbo[5];
    barrelModel[0] = new ModelRendererTurbo(this, 0, 120, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 0, 130, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 48, 120, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 74, 112, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 99, 120, textureX, textureY);
    
    barrelModel[0].addBox(-5.0F, -2.0F, -2.0F, 10, 4, 4, 0.0F);
    barrelModel[0].setRotationPoint(17.0F, -35.0F, 0.0F);
    
    barrelModel[1].addTrapezoid(5.0F, -1.5F, -1.5F, 30, 3, 3, 0.0F, -0.5F, 2);
    barrelModel[1].setRotationPoint(17.0F, -35.0F, 0.0F);
    
    barrelModel[2].addFlexBox(0.0F, -6.0F, -10.5F, 1, 3, 21, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 4);
    barrelModel[2].setRotationPoint(17.0F, -35.0F, 0.0F);
    
    barrelModel[3].addBox(0.0F, -3.0F, -10.5F, 1, 5, 21, 0.0F);
    barrelModel[3].setRotationPoint(17.0F, -35.0F, 0.0F);
    
    barrelModel[4].addFlexBox(0.0F, 2.0F, -10.5F, 1, 3, 21, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, 5);
    barrelModel[4].setRotationPoint(17.0F, -35.0F, 0.0F);


    
    leftTrackModel = new ModelRendererTurbo[16];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 502, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 0, 485, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 14, 480, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 38, 485, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 50, 480, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 69, 485, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 81, 480, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 94, 487, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 175, 502, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 112, 480, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 124, 488, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 141, 480, textureX, textureY);
    leftTrackModel[12] = new ModelRendererTurbo(this, 154, 487, textureX, textureY);
    leftTrackModel[13] = new ModelRendererTurbo(this, 166, 480, textureX, textureY);
    leftTrackModel[14] = new ModelRendererTurbo(this, 183, 483, textureX, textureY);
    leftTrackModel[15] = new ModelRendererTurbo(this, 195, 480, textureX, textureY);
    
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 77, 1, 9, 0.0F);
    leftTrackModel[0].setRotationPoint(-35.0F, 9.0F, -26.0F);
    
    leftTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 6, 9, 0.0F);
    leftTrackModel[1].setRotationPoint(42.0F, 10.0F, -26.0F);
    (leftTrackModel[1]).rotateAngleZ = 2.245537F;
    
    leftTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 7, 1, 9, 0.0F);
    leftTrackModel[2].setRotationPoint(52.0F, 2.0F, -26.0F);
    (leftTrackModel[2]).rotateAngleZ = -2.466852F;
    
    leftTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F);
    leftTrackModel[3].setRotationPoint(52.0F, 2.0F, -26.0F);
    (leftTrackModel[3]).rotateAngleZ = 2.356194F;
    
    leftTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F);
    leftTrackModel[4].setRotationPoint(57.0F, -3.0F, -26.0F);
    (leftTrackModel[4]).rotateAngleZ = -2.356194F;
    
    leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F);
    leftTrackModel[5].setRotationPoint(56.0F, -8.0F, -26.0F);
    
    leftTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F);
    leftTrackModel[6].setRotationPoint(57.0F, -8.0F, -26.0F);
    (leftTrackModel[6]).rotateAngleZ = -2.356194F;
    
    leftTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F);
    leftTrackModel[7].setRotationPoint(52.0F, -13.0F, -26.0F);
    (leftTrackModel[7]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 101, 1, 9, 0.0F);
    leftTrackModel[8].setRotationPoint(-49.0F, -13.0F, -26.0F);
    
    leftTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
    leftTrackModel[9].setRotationPoint(-49.0F, -13.0F, -26.0F);
    (leftTrackModel[9]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 3, 1, 9, 0.0F);
    leftTrackModel[10].setRotationPoint(-53.0F, -9.0F, -26.0F);
    (leftTrackModel[10]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F);
    leftTrackModel[11].setRotationPoint(-53.0F, -9.0F, -26.0F);
    
    leftTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
    leftTrackModel[12].setRotationPoint(-53.0F, -4.0F, -26.0F);
    (leftTrackModel[12]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 3, 1, 9, 0.0F);
    leftTrackModel[13].setRotationPoint(-49.0F, 0.0F, -26.0F);
    (leftTrackModel[13]).rotateAngleZ = 2.356194F;
    
    leftTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 1, 9, 9, 0.0F);
    leftTrackModel[14].setRotationPoint(-49.0F, 0.0F, -26.0F);
    (leftTrackModel[14]).rotateAngleZ = 0.9505469F;
    
    leftTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 9, 1, 9, 0.0F);
    leftTrackModel[15].setRotationPoint(-35.0F, 10.0F, -26.0F);
    (leftTrackModel[15]).rotateAngleZ = 2.521343F;


    
    rightTrackModel = new ModelRendererTurbo[16];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 502, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 0, 485, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 14, 480, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 38, 485, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 50, 480, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 69, 485, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 81, 480, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 94, 487, textureX, textureY);
    rightTrackModel[8] = new ModelRendererTurbo(this, 175, 502, textureX, textureY);
    rightTrackModel[9] = new ModelRendererTurbo(this, 112, 480, textureX, textureY);
    rightTrackModel[10] = new ModelRendererTurbo(this, 124, 488, textureX, textureY);
    rightTrackModel[11] = new ModelRendererTurbo(this, 141, 480, textureX, textureY);
    rightTrackModel[12] = new ModelRendererTurbo(this, 154, 487, textureX, textureY);
    rightTrackModel[13] = new ModelRendererTurbo(this, 166, 480, textureX, textureY);
    rightTrackModel[14] = new ModelRendererTurbo(this, 183, 483, textureX, textureY);
    rightTrackModel[15] = new ModelRendererTurbo(this, 195, 480, textureX, textureY);
    
    rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 77, 1, 9, 0.0F);
    rightTrackModel[0].setRotationPoint(-35.0F, 9.0F, 17.0F);
    
    rightTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 6, 9, 0.0F);
    rightTrackModel[1].setRotationPoint(42.0F, 10.0F, 17.0F);
    (rightTrackModel[1]).rotateAngleZ = 2.245537F;
    
    rightTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 7, 1, 9, 0.0F);
    rightTrackModel[2].setRotationPoint(52.0F, 2.0F, 17.0F);
    (rightTrackModel[2]).rotateAngleZ = -2.466852F;
    
    rightTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F);
    rightTrackModel[3].setRotationPoint(52.0F, 2.0F, 17.0F);
    (rightTrackModel[3]).rotateAngleZ = 2.356194F;
    
    rightTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F);
    rightTrackModel[4].setRotationPoint(57.0F, -3.0F, 17.0F);
    (rightTrackModel[4]).rotateAngleZ = -2.356194F;
    
    rightTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F);
    rightTrackModel[5].setRotationPoint(56.0F, -8.0F, 17.0F);
    
    rightTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F);
    rightTrackModel[6].setRotationPoint(57.0F, -8.0F, 17.0F);
    (rightTrackModel[6]).rotateAngleZ = -2.356194F;
    
    rightTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 4, 1, 9, 0.0F);
    rightTrackModel[7].setRotationPoint(52.0F, -13.0F, 17.0F);
    (rightTrackModel[7]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 101, 1, 9, 0.0F);
    rightTrackModel[8].setRotationPoint(-49.0F, -13.0F, 17.0F);
    
    rightTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
    rightTrackModel[9].setRotationPoint(-49.0F, -13.0F, 17.0F);
    (rightTrackModel[9]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 3, 1, 9, 0.0F);
    rightTrackModel[10].setRotationPoint(-53.0F, -9.0F, 17.0F);
    (rightTrackModel[10]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 1, 5, 9, 0.0F);
    rightTrackModel[11].setRotationPoint(-53.0F, -9.0F, 17.0F);
    
    rightTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
    rightTrackModel[12].setRotationPoint(-53.0F, -4.0F, 17.0F);
    (rightTrackModel[12]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 3, 1, 9, 0.0F);
    rightTrackModel[13].setRotationPoint(-49.0F, 0.0F, 17.0F);
    (rightTrackModel[13]).rotateAngleZ = 2.356194F;
    
    rightTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 1, 9, 9, 0.0F);
    rightTrackModel[14].setRotationPoint(-49.0F, 0.0F, 17.0F);
    (rightTrackModel[14]).rotateAngleZ = 0.9505469F;
    
    rightTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 9, 1, 9, 0.0F);
    rightTrackModel[15].setRotationPoint(-35.0F, 10.0F, 17.0F);
    (rightTrackModel[15]).rotateAngleZ = 2.521343F;


    
    leftTrackWheelModels = new ModelRendererTurbo[13];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 400, 430, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 400, 430, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 400, 390, textureX, textureY);
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 400, 390, textureX, textureY);
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 400, 380, textureX, textureY);
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 400, 380, textureX, textureY);
    leftTrackWheelModels[12] = new ModelRendererTurbo(this, 400, 380, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(5.5F, -5.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 11, 11, 40, 1, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[0].setRotationPoint(-46.5F, -6.5F, -23.5F);
    
    leftTrackWheelModels[1].addShape3D(5.5F, -5.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 11, 11, 40, 1, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[1].setRotationPoint(-46.5F, -6.5F, -18.5F);
    
    leftTrackWheelModels[2].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[2].setRotationPoint(-32.5F, 3.5F, -21.0F);
    
    leftTrackWheelModels[3].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[3].setRotationPoint(-16.5F, 3.5F, -21.0F);
    
    leftTrackWheelModels[4].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[4].setRotationPoint(-4.5F, 3.5F, -21.0F);
    
    leftTrackWheelModels[5].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[5].setRotationPoint(11.5F, 3.5F, -21.0F);

    
    leftTrackWheelModels[6].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[6].setRotationPoint(23.5F, 3.5F, -21.0F);
    
    leftTrackWheelModels[7].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[7].setRotationPoint(39.5F, 3.5F, -21.0F);
    
    leftTrackWheelModels[8].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 13, 13, 44, 1, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[8].setRotationPoint(49.5F, -5.5F, -25.3F);
    
    leftTrackWheelModels[9].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 13, 13, 44, 1, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[9].setRotationPoint(49.5F, -5.5F, -17.7F);
    
    leftTrackWheelModels[10].addShape3D(2.5F, -2.5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 3.0F, 5, 5, 20, 3, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    leftTrackWheelModels[10].setRotationPoint(23.5F, -9.5F, -21.0F);
    
    leftTrackWheelModels[11].addShape3D(2.5F, -2.5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 3.0F, 5, 5, 20, 3, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    leftTrackWheelModels[11].setRotationPoint(-4.5F, -9.5F, -21.0F);
    
    leftTrackWheelModels[12].addShape3D(2.5F, -2.5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 3.0F, 5, 5, 20, 3, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    leftTrackWheelModels[12].setRotationPoint(-32.5F, -9.5F, -21.0F);


    
    rightTrackWheelModels = new ModelRendererTurbo[13];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 400, 430, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 400, 430, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 400, 410, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 400, 390, textureX, textureY);
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 400, 390, textureX, textureY);
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 400, 380, textureX, textureY);
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 400, 380, textureX, textureY);
    rightTrackWheelModels[12] = new ModelRendererTurbo(this, 400, 380, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(5.5F, -5.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 11, 11, 40, 1, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[0].setRotationPoint(-46.5F, -6.5F, 23.5F);
    
    rightTrackWheelModels[1].addShape3D(5.5F, -5.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 11, 11, 40, 1, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[1].setRotationPoint(-46.5F, -6.5F, 18.5F);
    
    rightTrackWheelModels[2].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[2].setRotationPoint(-32.5F, 3.5F, 21.0F);
    
    rightTrackWheelModels[3].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[3].setRotationPoint(-16.5F, 3.5F, 21.0F);
    
    rightTrackWheelModels[4].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[4].setRotationPoint(-4.5F, 3.5F, 21.0F);
    
    rightTrackWheelModels[5].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[5].setRotationPoint(11.5F, 3.5F, 21.0F);
    
    rightTrackWheelModels[6].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[6].setRotationPoint(23.5F, 3.5F, 21.0F);
    
    rightTrackWheelModels[7].addShape3D(5.5F, -5.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 11, 11, 40, 5, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[7].setRotationPoint(39.5F, 3.5F, 21.0F);
    
    rightTrackWheelModels[8].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 13, 13, 44, 1, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[8].setRotationPoint(49.5F, -5.5F, 25.3F);
    
    rightTrackWheelModels[9].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 13, 13, 44, 1, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[9].setRotationPoint(49.5F, -5.5F, 17.7F);
    
    rightTrackWheelModels[10].addShape3D(2.5F, -2.5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 3.0F, 5, 5, 20, 3, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    rightTrackWheelModels[10].setRotationPoint(23.5F, -9.5F, 21.0F);
    
    rightTrackWheelModels[11].addShape3D(2.5F, -2.5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 3.0F, 5, 5, 20, 3, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    rightTrackWheelModels[11].setRotationPoint(-4.5F, -9.5F, 21.0F);
    
    rightTrackWheelModels[12].addShape3D(2.5F, -2.5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 3.0F, 5, 5, 20, 3, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    rightTrackWheelModels[12].setRotationPoint(-32.5F, -9.5F, 21.0F);

    
    /*ModelRendererTurbo[][] MGFrontModel = new ModelRendererTurbo[3][];

    
    MGFrontModel[0] = new ModelRendererTurbo[0];

    
    MGFrontModel[1] = new ModelRendererTurbo[1];
    MGFrontModel[1][0] = new ModelRendererTurbo(this, 425, 0, textureX, textureY);
    
    MGFrontModel[1][0].addBox(-2.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);

    
    for (ModelRendererTurbo gunPart : MGFrontModel[1])
    {
      gunPart.setRotationPoint(45.0F, -17.5F, -9.5F);
    }

    
    MGFrontModel[2] = new ModelRendererTurbo[0];
    
    registerGunModel("FrontMG", MGFrontModel);*/

    
    translateAll(0, 0, 0);

    
    flipAll();
  }
  @Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		for(int i = 0; i < bodyModel.length; i++)
		{
			bodyModel[i].render(f5);
		}
		for(int i = 0; i < turretModel.length; i++)
		{
			turretModel[i].render(f5);
		}
		for(int i = 0; i < barrelModel.length; i++)
		{
			barrelModel[i].render(f5);
		}
		for(int i = 0; i < leftTrackModel.length; i++)
		{
			leftTrackModel[i].render(f5);
		}
		for(int i = 0; i < rightTrackModel.length; i++)
		{
			rightTrackModel[i].render(f5);
		}
		for(int i = 0; i < leftTrackWheelModels.length; i++)
		{
			leftTrackWheelModels[i].render(f5);
		}
		for(int i = 0; i < rightTrackWheelModels.length; i++)
		{
			rightTrackWheelModels[i].render(f5);
		}
		
	}
}
