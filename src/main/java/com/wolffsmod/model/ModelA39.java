package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;




public class ModelA39
  extends ModelVehicle
{
  int textureX = 512;
  int textureY = 512;

  
  public ModelA39() {
    bodyModel = new ModelRendererTurbo[340];
    bodyModel[0] = new ModelRendererTurbo(this, 0, 37, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 280, 0, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 280, 45, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 45, 76, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 0, 76, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 240, 90, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 0, 90, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 89, 75, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 105, 75, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 45, 115, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 174, 114, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 0, 115, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 104, 115, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 85, 115, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 250, 115, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 125, 115, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 225, 115, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 270, 115, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 315, 115, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 395, 45, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 415, 45, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 415, 60, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 430, 60, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 384, 60, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 435, 45, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 400, 60, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 450, 45, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 50, 140, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 50, 140, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 50, 140, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 50, 140, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 40, 135, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 75, 165, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 50, 175, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 50, 165, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 50, 140, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 50, 140, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 50, 140, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 50, 140, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[94] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[95] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[96] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[97] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[98] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[99] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[100] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[101] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[102] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[103] = new ModelRendererTurbo(this, 25, 165, textureX, textureY);
    bodyModel[104] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[105] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[106] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[107] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[108] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[109] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[110] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[111] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[112] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[113] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[114] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[115] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[116] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[117] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[118] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[119] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[120] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[121] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[122] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[123] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[124] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[125] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[126] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[127] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[128] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[129] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[130] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[131] = new ModelRendererTurbo(this, 0, 175, textureX, textureY);
    bodyModel[132] = new ModelRendererTurbo(this, 75, 165, textureX, textureY);
    bodyModel[133] = new ModelRendererTurbo(this, 50, 175, textureX, textureY);
    bodyModel[134] = new ModelRendererTurbo(this, 50, 165, textureX, textureY);
    bodyModel[135] = new ModelRendererTurbo(this, 205, 134, textureX, textureY);
    bodyModel[136] = new ModelRendererTurbo(this, 395, 75, textureX, textureY);
    bodyModel[137] = new ModelRendererTurbo(this, 385, 75, textureX, textureY);
    bodyModel[138] = new ModelRendererTurbo(this, 205, 165, textureX, textureY);
    bodyModel[139] = new ModelRendererTurbo(this, 0, 185, textureX, textureY);
    bodyModel[140] = new ModelRendererTurbo(this, 15, 185, textureX, textureY);
    bodyModel[141] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
    bodyModel[142] = new ModelRendererTurbo(this, 15, 200, textureX, textureY);
    bodyModel[143] = new ModelRendererTurbo(this, 205, 148, textureX, textureY);
    bodyModel[144] = new ModelRendererTurbo(this, 205, 175, textureX, textureY);
    bodyModel[145] = new ModelRendererTurbo(this, 395, 75, textureX, textureY);
    bodyModel[146] = new ModelRendererTurbo(this, 0, 185, textureX, textureY);
    bodyModel[147] = new ModelRendererTurbo(this, 15, 185, textureX, textureY);
    bodyModel[148] = new ModelRendererTurbo(this, 385, 75, textureX, textureY);
    bodyModel[149] = new ModelRendererTurbo(this, 15, 200, textureX, textureY);
    bodyModel[150] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
    bodyModel[151] = new ModelRendererTurbo(this, 0, 255, textureX, textureY);
    bodyModel[152] = new ModelRendererTurbo(this, 105, 255, textureX, textureY);
    bodyModel[153] = new ModelRendererTurbo(this, 150, 255, textureX, textureY);
    bodyModel[154] = new ModelRendererTurbo(this, 234, 255, textureX, textureY);
    bodyModel[155] = new ModelRendererTurbo(this, 0, 255, textureX, textureY);
    bodyModel[156] = new ModelRendererTurbo(this, 0, 285, textureX, textureY);
    bodyModel[157] = new ModelRendererTurbo(this, 110, 280, textureX, textureY);
    bodyModel[158] = new ModelRendererTurbo(this, 35, 285, textureX, textureY);
    bodyModel[159] = new ModelRendererTurbo(this, 30, 255, textureX, textureY);
    bodyModel[160] = new ModelRendererTurbo(this, 160, 300, textureX, textureY);
    bodyModel[161] = new ModelRendererTurbo(this, 180, 300, textureX, textureY);
    bodyModel[162] = new ModelRendererTurbo(this, 215, 300, textureX, textureY);
    bodyModel[163] = new ModelRendererTurbo(this, 245, 300, textureX, textureY);
    bodyModel[164] = new ModelRendererTurbo(this, 290, 255, textureX, textureY);
    bodyModel[165] = new ModelRendererTurbo(this, 315, 255, textureX, textureY);
    bodyModel[166] = new ModelRendererTurbo(this, 290, 285, textureX, textureY);
    bodyModel[167] = new ModelRendererTurbo(this, 290, 290, textureX, textureY);
    bodyModel[168] = new ModelRendererTurbo(this, 375, 215, textureX, textureY);
    bodyModel[169] = new ModelRendererTurbo(this, 365, 245, textureX, textureY);
    bodyModel[170] = new ModelRendererTurbo(this, 365, 260, textureX, textureY);
    bodyModel[171] = new ModelRendererTurbo(this, 365, 135, textureX, textureY);
    bodyModel[172] = new ModelRendererTurbo(this, 175, 190, textureX, textureY);
    bodyModel[173] = new ModelRendererTurbo(this, 200, 190, textureX, textureY);
    bodyModel[174] = new ModelRendererTurbo(this, 225, 190, textureX, textureY);
    bodyModel[175] = new ModelRendererTurbo(this, 250, 190, textureX, textureY);
    bodyModel[176] = new ModelRendererTurbo(this, 355, 255, textureX, textureY);
    bodyModel[177] = new ModelRendererTurbo(this, 0, 335, textureX, textureY);
    bodyModel[178] = new ModelRendererTurbo(this, 140, 335, textureX, textureY);
    bodyModel[179] = new ModelRendererTurbo(this, 80, 335, textureX, textureY);
    bodyModel[180] = new ModelRendererTurbo(this, 210, 330, textureX, textureY);
    bodyModel[181] = new ModelRendererTurbo(this, 210, 355, textureX, textureY);
    bodyModel[182] = new ModelRendererTurbo(this, 330, 330, textureX, textureY);
    bodyModel[183] = new ModelRendererTurbo(this, 270, 380, textureX, textureY);
    bodyModel[184] = new ModelRendererTurbo(this, 375, 380, textureX, textureY);
    bodyModel[185] = new ModelRendererTurbo(this, 0, 335, textureX, textureY);
    bodyModel[186] = new ModelRendererTurbo(this, 15, 335, textureX, textureY);
    bodyModel[187] = new ModelRendererTurbo(this, 0, 345, textureX, textureY);
    bodyModel[188] = new ModelRendererTurbo(this, 30, 335, textureX, textureY);
    bodyModel[189] = new ModelRendererTurbo(this, 27, 345, textureX, textureY);
    bodyModel[190] = new ModelRendererTurbo(this, 40, 345, textureX, textureY);
    bodyModel[191] = new ModelRendererTurbo(this, 25, 360, textureX, textureY);
    bodyModel[192] = new ModelRendererTurbo(this, 440, 215, textureX, textureY);
    bodyModel[193] = new ModelRendererTurbo(this, 465, 215, textureX, textureY);
    bodyModel[194] = new ModelRendererTurbo(this, 485, 215, textureX, textureY);
    bodyModel[195] = new ModelRendererTurbo(this, 457, 245, textureX, textureY);
    bodyModel[196] = new ModelRendererTurbo(this, 410, 245, textureX, textureY);
    bodyModel[197] = new ModelRendererTurbo(this, 430, 245, textureX, textureY);
    bodyModel[198] = new ModelRendererTurbo(this, 441, 242, textureX, textureY);
    bodyModel[199] = new ModelRendererTurbo(this, 441, 246, textureX, textureY);
    bodyModel[200] = new ModelRendererTurbo(this, 441, 250, textureX, textureY);
    bodyModel[201] = new ModelRendererTurbo(this, 450, 245, textureX, textureY);
    bodyModel[202] = new ModelRendererTurbo(this, 450, 245, textureX, textureY);
    bodyModel[203] = new ModelRendererTurbo(this, 450, 245, textureX, textureY);
    bodyModel[204] = new ModelRendererTurbo(this, 450, 245, textureX, textureY);
    bodyModel[205] = new ModelRendererTurbo(this, 450, 245, textureX, textureY);
    bodyModel[206] = new ModelRendererTurbo(this, 450, 245, textureX, textureY);
    bodyModel[207] = new ModelRendererTurbo(this, 450, 245, textureX, textureY);
    bodyModel[208] = new ModelRendererTurbo(this, 450, 245, textureX, textureY);
    bodyModel[209] = new ModelRendererTurbo(this, 0, 418, textureX, textureY);
    bodyModel[210] = new ModelRendererTurbo(this, 35, 418, textureX, textureY);
    bodyModel[211] = new ModelRendererTurbo(this, 64, 418, textureX, textureY);
    bodyModel[212] = new ModelRendererTurbo(this, 90, 418, textureX, textureY);
    bodyModel[213] = new ModelRendererTurbo(this, 90, 425, textureX, textureY);
    bodyModel[214] = new ModelRendererTurbo(this, 105, 418, textureX, textureY);
    bodyModel[215] = new ModelRendererTurbo(this, 105, 425, textureX, textureY);
    bodyModel[216] = new ModelRendererTurbo(this, 114, 418, textureX, textureY);
    bodyModel[217] = new ModelRendererTurbo(this, 140, 418, textureX, textureY);
    bodyModel[218] = new ModelRendererTurbo(this, 0, 432, textureX, textureY);
    bodyModel[219] = new ModelRendererTurbo(this, 5, 432, textureX, textureY);
    bodyModel[220] = new ModelRendererTurbo(this, 40, 432, textureX, textureY);
    bodyModel[221] = new ModelRendererTurbo(this, 30, 432, textureX, textureY);
    bodyModel[222] = new ModelRendererTurbo(this, 55, 432, textureX, textureY);
    bodyModel[223] = new ModelRendererTurbo(this, 65, 432, textureX, textureY);
    bodyModel[224] = new ModelRendererTurbo(this, 80, 432, textureX, textureY);
    bodyModel[225] = new ModelRendererTurbo(this, 135, 418, textureX, textureY);
    bodyModel[226] = new ModelRendererTurbo(this, 75, 432, textureX, textureY);
    bodyModel[227] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
    bodyModel[228] = new ModelRendererTurbo(this, 46, 445, textureX, textureY);
    bodyModel[229] = new ModelRendererTurbo(this, 0, 465, textureX, textureY);
    bodyModel[230] = new ModelRendererTurbo(this, 50, 465, textureX, textureY);
    bodyModel[231] = new ModelRendererTurbo(this, 95, 455, textureX, textureY);
    bodyModel[232] = new ModelRendererTurbo(this, 30, 444, textureX, textureY);
    bodyModel[233] = new ModelRendererTurbo(this, 44, 447, textureX, textureY);
    bodyModel[234] = new ModelRendererTurbo(this, 30, 451, textureX, textureY);
    bodyModel[235] = new ModelRendererTurbo(this, 130, 451, textureX, textureY);
    bodyModel[236] = new ModelRendererTurbo(this, 198, 451, textureX, textureY);
    bodyModel[237] = new ModelRendererTurbo(this, 166, 451, textureX, textureY);
    bodyModel[238] = new ModelRendererTurbo(this, 153, 451, textureX, textureY);
    bodyModel[239] = new ModelRendererTurbo(this, 153, 451, textureX, textureY);
    bodyModel[240] = new ModelRendererTurbo(this, 153, 451, textureX, textureY);
    bodyModel[241] = new ModelRendererTurbo(this, 153, 451, textureX, textureY);
    bodyModel[242] = new ModelRendererTurbo(this, 153, 457, textureX, textureY);
    bodyModel[243] = new ModelRendererTurbo(this, 164, 451, textureX, textureY);
    bodyModel[244] = new ModelRendererTurbo(this, 165, 457, textureX, textureY);
    bodyModel[245] = new ModelRendererTurbo(this, 185, 451, textureX, textureY);
    bodyModel[246] = new ModelRendererTurbo(this, 153, 465, textureX, textureY);
    bodyModel[247] = new ModelRendererTurbo(this, 153, 468, textureX, textureY);
    bodyModel[248] = new ModelRendererTurbo(this, 145, 476, textureX, textureY);
    bodyModel[249] = new ModelRendererTurbo(this, 157, 472, textureX, textureY);
    bodyModel[250] = new ModelRendererTurbo(this, 145, 465, textureX, textureY);
    bodyModel[251] = new ModelRendererTurbo(this, 165, 476, textureX, textureY);
    bodyModel[252] = new ModelRendererTurbo(this, 165, 480, textureX, textureY);
    bodyModel[253] = new ModelRendererTurbo(this, 165, 472, textureX, textureY);
    bodyModel[254] = new ModelRendererTurbo(this, 165, 484, textureX, textureY);
    bodyModel[255] = new ModelRendererTurbo(this, 165, 484, textureX, textureY);
    bodyModel[256] = new ModelRendererTurbo(this, 165, 484, textureX, textureY);
    bodyModel[257] = new ModelRendererTurbo(this, 165, 484, textureX, textureY);
    bodyModel[258] = new ModelRendererTurbo(this, 165, 484, textureX, textureY);
    bodyModel[259] = new ModelRendererTurbo(this, 165, 484, textureX, textureY);
    bodyModel[260] = new ModelRendererTurbo(this, 165, 484, textureX, textureY);
    bodyModel[261] = new ModelRendererTurbo(this, 165, 484, textureX, textureY);
    bodyModel[262] = new ModelRendererTurbo(this, 269, 190, textureX, textureY);
    bodyModel[263] = new ModelRendererTurbo(this, 269, 190, textureX, textureY);
    bodyModel[264] = new ModelRendererTurbo(this, 269, 190, textureX, textureY);
    bodyModel[265] = new ModelRendererTurbo(this, 269, 190, textureX, textureY);
    bodyModel[266] = new ModelRendererTurbo(this, 269, 190, textureX, textureY);
    bodyModel[267] = new ModelRendererTurbo(this, 269, 190, textureX, textureY);
    bodyModel[268] = new ModelRendererTurbo(this, 220, 418, textureX, textureY);
    bodyModel[269] = new ModelRendererTurbo(this, 220, 418, textureX, textureY);
    bodyModel[270] = new ModelRendererTurbo(this, 307, 418, textureX, textureY);
    bodyModel[271] = new ModelRendererTurbo(this, 307, 430, textureX, textureY);
    bodyModel[272] = new ModelRendererTurbo(this, 350, 418, textureX, textureY);
    bodyModel[273] = new ModelRendererTurbo(this, 350, 425, textureX, textureY);
    bodyModel[274] = new ModelRendererTurbo(this, 360, 418, textureX, textureY);
    bodyModel[275] = new ModelRendererTurbo(this, 360, 418, textureX, textureY);
    bodyModel[276] = new ModelRendererTurbo(this, 360, 418, textureX, textureY);
    bodyModel[277] = new ModelRendererTurbo(this, 360, 418, textureX, textureY);
    bodyModel[278] = new ModelRendererTurbo(this, 360, 418, textureX, textureY);
    bodyModel[279] = new ModelRendererTurbo(this, 360, 418, textureX, textureY);
    bodyModel[280] = new ModelRendererTurbo(this, 360, 425, textureX, textureY);
    bodyModel[281] = new ModelRendererTurbo(this, 360, 425, textureX, textureY);
    bodyModel[282] = new ModelRendererTurbo(this, 360, 425, textureX, textureY);
    bodyModel[283] = new ModelRendererTurbo(this, 360, 418, textureX, textureY);
    bodyModel[284] = new ModelRendererTurbo(this, 360, 418, textureX, textureY);
    bodyModel[285] = new ModelRendererTurbo(this, 360, 418, textureX, textureY);
    bodyModel[286] = new ModelRendererTurbo(this, 360, 418, textureX, textureY);
    bodyModel[287] = new ModelRendererTurbo(this, 360, 425, textureX, textureY);
    bodyModel[288] = new ModelRendererTurbo(this, 360, 425, textureX, textureY);
    bodyModel[289] = new ModelRendererTurbo(this, 375, 418, textureX, textureY);
    bodyModel[290] = new ModelRendererTurbo(this, 375, 418, textureX, textureY);
    bodyModel[291] = new ModelRendererTurbo(this, 375, 425, textureX, textureY);
    bodyModel[292] = new ModelRendererTurbo(this, 20, 372, textureX, textureY);
    bodyModel[293] = new ModelRendererTurbo(this, 20, 372, textureX, textureY);
    bodyModel[294] = new ModelRendererTurbo(this, 75, 374, textureX, textureY);
    bodyModel[295] = new ModelRendererTurbo(this, 75, 374, textureX, textureY);
    bodyModel[296] = new ModelRendererTurbo(this, 75, 374, textureX, textureY);
    bodyModel[297] = new ModelRendererTurbo(this, 120, 374, textureX, textureY);
    bodyModel[298] = new ModelRendererTurbo(this, 210, 376, textureX, textureY);
    bodyModel[299] = new ModelRendererTurbo(this, 75, 374, textureX, textureY);
    bodyModel[300] = new ModelRendererTurbo(this, 75, 374, textureX, textureY);
    bodyModel[301] = new ModelRendererTurbo(this, 75, 374, textureX, textureY);
    bodyModel[302] = new ModelRendererTurbo(this, 75, 374, textureX, textureY);
    bodyModel[303] = new ModelRendererTurbo(this, 44, 447, textureX, textureY);
    bodyModel[304] = new ModelRendererTurbo(this, 44, 447, textureX, textureY);
    bodyModel[305] = new ModelRendererTurbo(this, 44, 447, textureX, textureY);
    bodyModel[306] = new ModelRendererTurbo(this, 152, 374, textureX, textureY);
    bodyModel[307] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
    bodyModel[308] = new ModelRendererTurbo(this, 0, 453, textureX, textureY);
    bodyModel[309] = new ModelRendererTurbo(this, 0, 466, textureX, textureY);
    bodyModel[310] = new ModelRendererTurbo(this, 35, 466, textureX, textureY);
    bodyModel[311] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[312] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[313] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[314] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[315] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[316] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[317] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
    bodyModel[318] = new ModelRendererTurbo(this, 0, 453, textureX, textureY);
    bodyModel[319] = new ModelRendererTurbo(this, 0, 466, textureX, textureY);
    bodyModel[320] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[321] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[322] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[323] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[324] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[325] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    bodyModel[326] = new ModelRendererTurbo(this, 76, 451, textureX, textureY);
    bodyModel[327] = new ModelRendererTurbo(this, 90, 452, textureX, textureY);
    bodyModel[328] = new ModelRendererTurbo(this, 90, 456, textureX, textureY);
    bodyModel[329] = new ModelRendererTurbo(this, 79, 465, textureX, textureY);
    bodyModel[330] = new ModelRendererTurbo(this, 79, 475, textureX, textureY);
    bodyModel[331] = new ModelRendererTurbo(this, 79, 475, textureX, textureY);
    bodyModel[332] = new ModelRendererTurbo(this, 147, 490, textureX, textureY);
    bodyModel[333] = new ModelRendererTurbo(this, 147, 490, textureX, textureY);
    bodyModel[334] = new ModelRendererTurbo(this, 30, 451, textureX, textureY);
    bodyModel[335] = new ModelRendererTurbo(this, 147, 490, textureX, textureY);
    bodyModel[336] = new ModelRendererTurbo(this, 153, 490, textureX, textureY);
    bodyModel[337] = new ModelRendererTurbo(this, 153, 490, textureX, textureY);
    bodyModel[338] = new ModelRendererTurbo(this, 153, 496, textureX, textureY);
    bodyModel[339] = new ModelRendererTurbo(this, 153, 496, textureX, textureY);
    
    bodyModel[0].addShapeBox(0.0F, 0.0F, -15.0F, 105, 3, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[0].setRotationPoint(-53.0F, 1.0F, 0.0F);
    
    bodyModel[1].addBox(0.0F, 0.0F, -15.0F, 105, 3, 30, 0.0F);
    bodyModel[1].setRotationPoint(-53.0F, -2.0F, 0.0F);
    
    bodyModel[2].addShapeBox(0.0F, 0.0F, -15.0F, 83, 8, 30, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(-53.0F, -10.0F, 0.0F);
    
    bodyModel[3].addShapeBox(0.0F, 0.0F, -15.0F, 22, 8, 30, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -5.0F, 0.0F, -3.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[3].setRotationPoint(30.0F, -10.0F, 0.0F);
    
    bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 19, 5, 1, 0.0F);
    bodyModel[4].setRotationPoint(30.0F, -10.0F, 14.0F);
    
    bodyModel[5].addBox(0.0F, 0.0F, -1.0F, 19, 5, 1, 0.0F);
    bodyModel[5].setRotationPoint(30.0F, -10.0F, -14.0F);
    
    bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 102, 1, 14, 0.0F);
    bodyModel[6].setRotationPoint(-53.0F, -10.0F, 15.0F);
    
    bodyModel[7].addBox(0.0F, 0.0F, -14.0F, 102, 1, 14, 0.0F);
    bodyModel[7].setRotationPoint(-53.0F, -10.0F, -15.0F);
    
    bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 2, 8, 1, 0.0F);
    bodyModel[8].setRotationPoint(-53.0F, -10.0F, 14.0F);
    
    bodyModel[9].addBox(0.0F, 0.0F, -1.0F, 2, 8, 1, 0.0F);
    bodyModel[9].setRotationPoint(-53.0F, -10.0F, -14.0F);
    
    bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[10].setRotationPoint(49.0F, -10.0F, 15.0F);
    (bodyModel[10]).rotateAngleZ = -0.46251225F;
    
    bodyModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[11].setRotationPoint(53.0F, -8.0F, 15.0F);
    (bodyModel[11]).rotateAngleZ = -0.7853982F;
    
    bodyModel[12].addShapeBox(0.0F, 0.0F, -14.0F, 4, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[12].setRotationPoint(49.0F, -10.0F, -15.0F);
    (bodyModel[12]).rotateAngleZ = -0.46251225F;
    
    bodyModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[13].setRotationPoint(49.0F, -10.0F, 14.0F);
    
    bodyModel[14].addShapeBox(0.0F, 0.0F, -1.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[14].setRotationPoint(49.0F, -10.0F, -14.0F);
    
    bodyModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[15].setRotationPoint(52.0F, -8.0F, 14.0F);
    
    bodyModel[16].addShapeBox(0.0F, 0.0F, -14.0F, 4, 1, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[16].setRotationPoint(53.0F, -8.0F, -15.0F);
    (bodyModel[16]).rotateAngleZ = -0.7853982F;
    
    bodyModel[17].addShapeBox(0.0F, 0.0F, -1.0F, 4, 6, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[17].setRotationPoint(52.0F, -8.0F, -14.0F);
    
    bodyModel[18].addShapeBox(-4.0F, 0.0F, 0.0F, 4, 1, 14, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F);
    bodyModel[18].setRotationPoint(-53.0F, -10.0F, 15.0F);
    (bodyModel[18]).rotateAngleZ = 0.46251225F;
    
    bodyModel[19].addShapeBox(-4.0F, 0.0F, -14.0F, 4, 1, 14, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F);
    bodyModel[19].setRotationPoint(-53.0F, -10.0F, -15.0F);
    (bodyModel[19]).rotateAngleZ = 0.46251225F;
    
    bodyModel[20].addShapeBox(-4.0F, 0.0F, 0.0F, 4, 11, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
    bodyModel[20].setRotationPoint(-53.0F, -10.0F, 14.0F);
    
    bodyModel[21].addShapeBox(-4.0F, 0.0F, -1.0F, 4, 11, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
    bodyModel[21].setRotationPoint(-53.0F, -10.0F, -14.0F);
    
    bodyModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 3, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[22].setRotationPoint(49.0F, -5.0F, 15.0F);
    
    bodyModel[23].addShapeBox(0.0F, 0.0F, -1.0F, 3, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[23].setRotationPoint(49.0F, -5.0F, -15.0F);
    
    bodyModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 3, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[24].setRotationPoint(46.0F, -5.0F, 15.0F);
    
    bodyModel[25].addShapeBox(0.0F, 0.0F, 0.0F, 3, 9, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
    bodyModel[25].setRotationPoint(43.0F, -5.0F, 15.0F);
    
    bodyModel[26].addShapeBox(0.0F, 0.0F, -1.0F, 3, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[26].setRotationPoint(46.0F, -5.0F, -15.0F);
    
    bodyModel[27].addShapeBox(0.0F, 0.0F, -1.0F, 3, 9, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
    bodyModel[27].setRotationPoint(43.0F, -5.0F, -15.0F);
    
    bodyModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[28].setRotationPoint(28.0F, 2.0F, 15.0F);
    
    bodyModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 6, 5, 14, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[29].setRotationPoint(28.0F, -3.0F, 15.0F);
    
    bodyModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[30].setRotationPoint(6.0F, 2.0F, 15.0F);
    
    bodyModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 6, 5, 14, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[31].setRotationPoint(6.0F, -3.0F, 15.0F);
    
    bodyModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[32].setRotationPoint(-16.0F, 2.0F, 15.0F);
    
    bodyModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 6, 5, 14, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[33].setRotationPoint(-16.0F, -3.0F, 15.0F);
    
    bodyModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[34].setRotationPoint(-38.0F, 2.0F, 15.0F);
    
    bodyModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 6, 5, 14, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[35].setRotationPoint(-38.0F, -3.0F, 15.0F);
    
    bodyModel[36].addShapeBox(0.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[36].setRotationPoint(32.0F, 3.0F, 27.0F);
    (bodyModel[36]).rotateAngleZ = -0.2617994F;
    
    bodyModel[37].addShapeBox(0.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[37].setRotationPoint(32.0F, 3.0F, 16.0F);
    (bodyModel[37]).rotateAngleZ = -0.2617994F;
    
    bodyModel[38].addShapeBox(-6.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[38].setRotationPoint(30.0F, 3.0F, 27.0F);
    (bodyModel[38]).rotateAngleZ = 0.2617994F;
    
    bodyModel[39].addShapeBox(-6.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[39].setRotationPoint(30.0F, 3.0F, 16.0F);
    (bodyModel[39]).rotateAngleZ = 0.2617994F;
    
    bodyModel[40].addShapeBox(-4.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[40].setRotationPoint(30.0F, -2.0F, 27.0F);
    (bodyModel[40]).rotateAngleZ = -0.7853982F;
    
    bodyModel[41].addShapeBox(-4.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[41].setRotationPoint(30.0F, -2.0F, 16.0F);
    (bodyModel[41]).rotateAngleZ = -0.7853982F;
    
    bodyModel[42].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[42].setRotationPoint(37.0F, 6.0F, 17.0F);
    
    bodyModel[43].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[43].setRotationPoint(24.0F, 6.0F, 17.0F);
    
    bodyModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 62, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[44].setRotationPoint(46.5F, -1.5F, -31.0F);
    
    bodyModel[45].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[45].setRotationPoint(26.0F, -3.0F, 17.0F);
    
    bodyModel[46].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[46].setRotationPoint(15.0F, 6.0F, 17.0F);
    
    bodyModel[47].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[47].setRotationPoint(2.0F, 6.0F, 17.0F);
    
    bodyModel[48].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[48].setRotationPoint(-7.0F, 6.0F, 17.0F);
    
    bodyModel[49].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[49].setRotationPoint(-19.0F, 6.0F, 17.0F);
    
    bodyModel[50].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[50].setRotationPoint(-29.0F, 6.0F, 17.0F);
    
    bodyModel[51].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[51].setRotationPoint(-42.0F, 6.0F, 17.0F);
    
    bodyModel[52].addShapeBox(0.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[52].setRotationPoint(10.0F, 3.0F, 27.0F);
    (bodyModel[52]).rotateAngleZ = -0.2617994F;
    
    bodyModel[53].addShapeBox(0.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[53].setRotationPoint(10.0F, 3.0F, 16.0F);
    (bodyModel[53]).rotateAngleZ = -0.2617994F;
    
    bodyModel[54].addShapeBox(0.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[54].setRotationPoint(-12.0F, 3.0F, 27.0F);
    (bodyModel[54]).rotateAngleZ = -0.2617994F;
    
    bodyModel[55].addShapeBox(0.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[55].setRotationPoint(-12.0F, 3.0F, 16.0F);
    (bodyModel[55]).rotateAngleZ = -0.2617994F;
    
    bodyModel[56].addShapeBox(0.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[56].setRotationPoint(-34.0F, 3.0F, 27.0F);
    (bodyModel[56]).rotateAngleZ = -0.2617994F;
    
    bodyModel[57].addShapeBox(0.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[57].setRotationPoint(-34.0F, 3.0F, 16.0F);
    (bodyModel[57]).rotateAngleZ = -0.2617994F;
    
    bodyModel[58].addShapeBox(-6.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[58].setRotationPoint(8.0F, 3.0F, 16.0F);
    (bodyModel[58]).rotateAngleZ = 0.2617994F;
    
    bodyModel[59].addShapeBox(-6.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[59].setRotationPoint(8.0F, 3.0F, 27.0F);
    (bodyModel[59]).rotateAngleZ = 0.2617994F;
    
    bodyModel[60].addShapeBox(-6.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[60].setRotationPoint(-13.0F, 3.0F, 27.0F);
    (bodyModel[60]).rotateAngleZ = 0.2617994F;
    
    bodyModel[61].addShapeBox(-6.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[61].setRotationPoint(-13.0F, 3.0F, 16.0F);
    (bodyModel[61]).rotateAngleZ = 0.2617994F;
    
    bodyModel[62].addShapeBox(-6.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[62].setRotationPoint(-36.0F, 3.0F, 27.0F);
    (bodyModel[62]).rotateAngleZ = 0.2617994F;
    
    bodyModel[63].addShapeBox(-6.0F, -1.0F, 0.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[63].setRotationPoint(-36.0F, 3.0F, 16.0F);
    (bodyModel[63]).rotateAngleZ = 0.2617994F;
    
    bodyModel[64].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[64].setRotationPoint(13.0F, -3.0F, 17.0F);
    
    bodyModel[65].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[65].setRotationPoint(4.0F, -3.0F, 17.0F);
    
    bodyModel[66].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[66].setRotationPoint(-9.0F, -3.0F, 17.0F);
    
    bodyModel[67].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[67].setRotationPoint(-18.0F, -3.0F, 17.0F);
    
    bodyModel[68].addShapeBox(0.0F, -1.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[68].setRotationPoint(-31.0F, -3.0F, 17.0F);
    
    bodyModel[69].addShapeBox(-1.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[69].setRotationPoint(10.0F, -2.0F, 27.0F);
    (bodyModel[69]).rotateAngleZ = 0.7853982F;
    
    bodyModel[70].addShapeBox(-1.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[70].setRotationPoint(10.0F, -2.0F, 16.0F);
    (bodyModel[70]).rotateAngleZ = 0.7853982F;
    
    bodyModel[71].addShapeBox(-1.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[71].setRotationPoint(-12.0F, -2.0F, 27.0F);
    (bodyModel[71]).rotateAngleZ = 0.7853982F;
    
    bodyModel[72].addShapeBox(-1.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[72].setRotationPoint(-12.0F, -2.0F, 16.0F);
    (bodyModel[72]).rotateAngleZ = 0.7853982F;
    
    bodyModel[73].addShapeBox(-1.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[73].setRotationPoint(-34.0F, -2.0F, 27.0F);
    (bodyModel[73]).rotateAngleZ = 0.7853982F;
    
    bodyModel[74].addShapeBox(-1.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[74].setRotationPoint(-34.0F, -2.0F, 16.0F);
    (bodyModel[74]).rotateAngleZ = 0.7853982F;
    
    bodyModel[75].addShapeBox(-4.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[75].setRotationPoint(8.0F, -2.0F, 27.0F);
    (bodyModel[75]).rotateAngleZ = -0.7853982F;
    
    bodyModel[76].addShapeBox(-4.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[76].setRotationPoint(8.0F, -2.0F, 16.0F);
    (bodyModel[76]).rotateAngleZ = -0.7853982F;
    
    bodyModel[77].addShapeBox(-4.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[77].setRotationPoint(-14.0F, -2.0F, 27.0F);
    (bodyModel[77]).rotateAngleZ = -0.7853982F;
    
    bodyModel[78].addShapeBox(-4.0F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[78].setRotationPoint(-14.0F, -2.0F, 16.0F);
    (bodyModel[78]).rotateAngleZ = -0.7853982F;
    
    bodyModel[79].addShapeBox(-2.0F, -4.0F, 0.0F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[79].setRotationPoint(-49.0F, 2.0F, 15.0F);
    (bodyModel[79]).rotateAngleZ = 0.5235988F;
    
    bodyModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[80].setRotationPoint(-52.0F, -1.5F, 16.0F);
    
    bodyModel[81].addShapeBox(-2.0F, -4.0F, 0.0F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[81].setRotationPoint(-49.0F, 2.0F, 28.0F);
    (bodyModel[81]).rotateAngleZ = 0.5235988F;
    
    bodyModel[82].addShapeBox(0.0F, 0.0F, -14.0F, 6, 5, 14, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[82].setRotationPoint(28.0F, -3.0F, -15.0F);
    
    bodyModel[83].addShapeBox(0.0F, 0.0F, -14.0F, 6, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[83].setRotationPoint(28.0F, 2.0F, -15.0F);
    
    bodyModel[84].addShapeBox(0.0F, 0.0F, -14.0F, 6, 5, 14, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[84].setRotationPoint(6.0F, -3.0F, -15.0F);
    
    bodyModel[85].addShapeBox(0.0F, 0.0F, -14.0F, 6, 5, 14, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[85].setRotationPoint(-16.0F, -3.0F, -15.0F);
    
    bodyModel[86].addShapeBox(0.0F, 0.0F, -14.0F, 6, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[86].setRotationPoint(-16.0F, 2.0F, -15.0F);
    
    bodyModel[87].addShapeBox(0.0F, 0.0F, -14.0F, 6, 5, 14, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[87].setRotationPoint(-38.0F, -3.0F, -15.0F);
    
    bodyModel[88].addShapeBox(0.0F, 0.0F, -14.0F, 6, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[88].setRotationPoint(-38.0F, 2.0F, -15.0F);
    
    bodyModel[89].addShapeBox(0.0F, 0.0F, -14.0F, 6, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[89].setRotationPoint(6.0F, 2.0F, -15.0F);
    
    bodyModel[90].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[90].setRotationPoint(26.0F, -3.0F, -17.0F);
    
    bodyModel[91].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[91].setRotationPoint(13.0F, -3.0F, -17.0F);
    
    bodyModel[92].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[92].setRotationPoint(4.0F, -3.0F, -17.0F);
    
    bodyModel[93].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[93].setRotationPoint(-9.0F, -3.0F, -17.0F);
    
    bodyModel[94].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[94].setRotationPoint(-18.0F, -3.0F, -17.0F);
    
    bodyModel[95].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[95].setRotationPoint(-31.0F, -3.0F, -17.0F);
    
    bodyModel[96].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[96].setRotationPoint(37.0F, 6.0F, -17.0F);
    
    bodyModel[97].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[97].setRotationPoint(24.0F, 6.0F, -17.0F);
    
    bodyModel[98].addShapeBox(0.0F, -1.0F, -11.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[98].setRotationPoint(15.0F, 6.0F, -16.0F);
    
    bodyModel[99].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[99].setRotationPoint(2.0F, 6.0F, -17.0F);
    
    bodyModel[100].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[100].setRotationPoint(-7.0F, 6.0F, -17.0F);
    
    bodyModel[101].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[101].setRotationPoint(-20.0F, 6.0F, -17.0F);
    
    bodyModel[102].addShapeBox(0.0F, -1.0F, -11.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[102].setRotationPoint(-29.0F, 6.0F, -16.0F);
    
    bodyModel[103].addShapeBox(0.0F, -1.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[103].setRotationPoint(-42.0F, 6.0F, -17.0F);
    
    bodyModel[104].addShapeBox(0.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[104].setRotationPoint(32.0F, 3.0F, -27.0F);
    (bodyModel[104]).rotateAngleZ = -0.2617994F;
    
    bodyModel[105].addShapeBox(0.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[105].setRotationPoint(32.0F, 3.0F, -16.0F);
    (bodyModel[105]).rotateAngleZ = -0.2617994F;
    
    bodyModel[106].addShapeBox(0.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[106].setRotationPoint(10.0F, 3.0F, -27.0F);
    (bodyModel[106]).rotateAngleZ = -0.2617994F;
    
    bodyModel[107].addShapeBox(0.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[107].setRotationPoint(10.0F, 3.0F, -16.0F);
    (bodyModel[107]).rotateAngleZ = -0.2617994F;
    
    bodyModel[108].addShapeBox(0.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[108].setRotationPoint(-12.0F, 3.0F, -27.0F);
    (bodyModel[108]).rotateAngleZ = -0.2617994F;
    
    bodyModel[109].addShapeBox(0.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[109].setRotationPoint(-12.0F, 3.0F, -16.0F);
    (bodyModel[109]).rotateAngleZ = -0.2617994F;
    
    bodyModel[110].addShapeBox(0.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[110].setRotationPoint(-34.0F, 3.0F, -27.0F);
    (bodyModel[110]).rotateAngleZ = -0.2617994F;
    
    bodyModel[111].addShapeBox(0.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[111].setRotationPoint(-34.0F, 3.0F, -16.0F);
    (bodyModel[111]).rotateAngleZ = -0.2617994F;
    
    bodyModel[112].addShapeBox(-6.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[112].setRotationPoint(30.0F, 3.0F, -27.0F);
    (bodyModel[112]).rotateAngleZ = 0.2617994F;
    
    bodyModel[113].addShapeBox(-6.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[113].setRotationPoint(30.0F, 3.0F, -16.0F);
    (bodyModel[113]).rotateAngleZ = 0.2617994F;
    
    bodyModel[114].addShapeBox(-6.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[114].setRotationPoint(8.0F, 3.0F, -27.0F);
    (bodyModel[114]).rotateAngleZ = 0.2617994F;
    
    bodyModel[115].addShapeBox(-6.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[115].setRotationPoint(8.0F, 3.0F, -16.0F);
    (bodyModel[115]).rotateAngleZ = 0.2617994F;
    
    bodyModel[116].addShapeBox(-6.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[116].setRotationPoint(-14.0F, 3.0F, -27.0F);
    (bodyModel[116]).rotateAngleZ = 0.2617994F;
    
    bodyModel[117].addShapeBox(-6.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[117].setRotationPoint(-14.0F, 3.0F, -16.0F);
    (bodyModel[117]).rotateAngleZ = 0.2617994F;
    
    bodyModel[118].addShapeBox(-6.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[118].setRotationPoint(-36.0F, 3.0F, -27.0F);
    (bodyModel[118]).rotateAngleZ = 0.2617994F;
    
    bodyModel[119].addShapeBox(-7.0F, -1.0F, -1.0F, 6, 3, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F);
    bodyModel[119].setRotationPoint(-35.0F, 3.0F, -16.0F);
    (bodyModel[119]).rotateAngleZ = 0.2617994F;
    
    bodyModel[120].addShapeBox(-1.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[120].setRotationPoint(10.0F, -2.0F, -27.0F);
    (bodyModel[120]).rotateAngleZ = 0.7853982F;
    
    bodyModel[121].addShapeBox(-1.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[121].setRotationPoint(10.0F, -2.0F, -16.0F);
    (bodyModel[121]).rotateAngleZ = 0.7853982F;
    
    bodyModel[122].addShapeBox(-1.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[122].setRotationPoint(-12.0F, -2.0F, -27.0F);
    (bodyModel[122]).rotateAngleZ = 0.7853982F;
    
    bodyModel[123].addShapeBox(-1.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[123].setRotationPoint(-12.0F, -2.0F, -16.0F);
    (bodyModel[123]).rotateAngleZ = 0.7853982F;
    
    bodyModel[124].addShapeBox(-1.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[124].setRotationPoint(-34.0F, -2.0F, -27.0F);
    (bodyModel[124]).rotateAngleZ = 0.7853982F;
    
    bodyModel[125].addShapeBox(-1.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[125].setRotationPoint(-34.0F, -2.0F, -16.0F);
    (bodyModel[125]).rotateAngleZ = 0.7853982F;
    
    bodyModel[126].addShapeBox(-4.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[126].setRotationPoint(30.0F, -2.0F, -27.0F);
    (bodyModel[126]).rotateAngleZ = -0.7853982F;
    
    bodyModel[127].addShapeBox(-4.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[127].setRotationPoint(30.0F, -2.0F, -16.0F);
    (bodyModel[127]).rotateAngleZ = -0.7853982F;
    
    bodyModel[128].addShapeBox(-4.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[128].setRotationPoint(8.0F, -2.0F, -27.0F);
    (bodyModel[128]).rotateAngleZ = -0.7853982F;
    
    bodyModel[129].addShapeBox(-4.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[129].setRotationPoint(8.0F, -2.0F, -16.0F);
    (bodyModel[129]).rotateAngleZ = -0.7853982F;
    
    bodyModel[130].addShapeBox(-4.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[130].setRotationPoint(-14.0F, -2.0F, -27.0F);
    (bodyModel[130]).rotateAngleZ = -0.7853982F;
    
    bodyModel[131].addShapeBox(-4.0F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[131].setRotationPoint(-14.0F, -2.0F, -16.0F);
    (bodyModel[131]).rotateAngleZ = -0.7853982F;
    
    bodyModel[132].addShapeBox(-2.0F, -4.0F, -1.0F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[132].setRotationPoint(-49.0F, 2.0F, -15.0F);
    (bodyModel[132]).rotateAngleZ = 0.5235988F;
    
    bodyModel[133].addShapeBox(0.0F, 0.0F, -12.0F, 2, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[133].setRotationPoint(-52.0F, -1.5F, -16.0F);
    
    bodyModel[134].addShapeBox(-2.0F, -4.0F, -1.0F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[134].setRotationPoint(-49.0F, 2.0F, -28.0F);
    (bodyModel[134]).rotateAngleZ = 0.5235988F;
    
    bodyModel[135].addShapeBox(0.0F, 0.0F, 0.0F, 100, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
    bodyModel[135].setRotationPoint(-51.0F, -5.0F, 29.0F);
    
    bodyModel[136].addShapeBox(0.0F, 0.0F, 0.0F, 3, 9, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F);
    bodyModel[136].setRotationPoint(49.0F, -5.0F, 29.0F);
    
    bodyModel[137].addShapeBox(0.0F, 0.0F, 0.0F, 2, 9, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -1.0F, 0.5F);
    bodyModel[137].setRotationPoint(-53.0F, -5.0F, 29.0F);
    
    bodyModel[138].addShapeBox(0.0F, 0.0F, 0.0F, 100, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[138].setRotationPoint(-51.0F, -10.0F, 29.0F);
    
    bodyModel[139].addShapeBox(0.0F, 0.0F, 0.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[139].setRotationPoint(49.0F, -10.0F, 29.0F);
    
    bodyModel[140].addShapeBox(0.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[140].setRotationPoint(52.0F, -8.0F, 29.0F);
    
    bodyModel[141].addShapeBox(-4.0F, 0.0F, 0.0F, 4, 11, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
    bodyModel[141].setRotationPoint(-53.0F, -10.0F, 29.0F);
    
    bodyModel[142].addBox(0.0F, 0.0F, 0.0F, 2, 8, 1, 0.0F);
    bodyModel[142].setRotationPoint(-53.0F, -10.0F, 29.0F);
    
    bodyModel[143].addShapeBox(0.0F, 0.0F, -1.0F, 100, 9, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[143].setRotationPoint(-51.0F, -5.0F, -29.0F);
    
    bodyModel[144].addShapeBox(0.0F, 0.0F, -1.0F, 100, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[144].setRotationPoint(-51.0F, -10.0F, -29.0F);
    
    bodyModel[145].addShapeBox(0.0F, 0.0F, -1.0F, 3, 9, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[145].setRotationPoint(49.0F, -5.0F, -29.0F);
    
    bodyModel[146].addShapeBox(0.0F, 0.0F, -1.0F, 4, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[146].setRotationPoint(49.0F, -10.0F, -29.0F);
    
    bodyModel[147].addShapeBox(0.0F, 0.0F, -1.0F, 4, 6, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[147].setRotationPoint(52.0F, -8.0F, -29.0F);
    
    bodyModel[148].addShapeBox(0.0F, 0.0F, -1.0F, 2, 9, 1, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    bodyModel[148].setRotationPoint(-53.0F, -5.0F, -29.0F);
    
    bodyModel[149].addBox(0.0F, 0.0F, -1.0F, 2, 8, 1, 0.0F);
    bodyModel[149].setRotationPoint(-53.0F, -10.0F, -29.0F);
    
    bodyModel[150].addShapeBox(-4.0F, 0.0F, -1.0F, 4, 11, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
    bodyModel[150].setRotationPoint(-53.0F, -10.0F, -29.0F);
    
    bodyModel[151].addShapeBox(0.0F, 0.0F, -28.0F, 25, 20, 52, 0.0F, 0.0F, 0.0F, 0.0F, -15.0F, -1.0F, 0.0F, -15.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[151].setRotationPoint(5.0F, -30.0F, 0.0F);
    
    bodyModel[152].addShapeBox(0.0F, 0.0F, -8.0F, 14, 4, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -4.0F, 0.0F, -1.5F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 2.0F, 0.0F, 0.0F, 5.0F);
    bodyModel[152].setRotationPoint(15.0F, -29.0F, 0.0F);
    
    bodyModel[153].addShapeBox(0.0F, 0.0F, -12.0F, 14, 14, 25, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 5.0F);
    bodyModel[153].setRotationPoint(15.0F, -25.0F, 0.0F);
    
    bodyModel[154].addShapeBox(0.0F, 0.0F, 0.0F, 7, 11, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[154].setRotationPoint(15.0F, -29.0F, 5.0F);
    
    bodyModel[155].addShapeBox(0.0F, 0.0F, 0.0F, 1, 10, 19, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[155].setRotationPoint(22.0F, -28.35F, 5.0F);
    
    bodyModel[156].addShapeBox(0.0F, 0.0F, 0.0F, 10, 9, 5, 0.0F, 0.0F, -0.1F, 0.0F, -7.0F, -0.1F, 0.0F, -9.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[156].setRotationPoint(20.0F, -19.0F, 24.0F);
    
    bodyModel[157].addShapeBox(0.0F, 0.0F, 0.0F, 7, 19, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, -2.0F, -0.65F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[157].setRotationPoint(15.0F, -29.0F, 24.0F);
    
    bodyModel[158].addShapeBox(0.0F, 0.0F, 0.0F, 1, 10, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.6F, -1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.6F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F);
    bodyModel[158].setRotationPoint(22.0F, -28.35F, 24.0F);
    
    bodyModel[159].addShapeBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[159].setRotationPoint(20.0F, -28.35F, 28.0F);
    
    bodyModel[160].addShapeBox(0.0F, 0.0F, 0.0F, 5, 19, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -1.65F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[160].setRotationPoint(15.0F, -29.0F, 28.0F);
    
    bodyModel[161].addShapeBox(0.0F, 0.0F, 0.0F, 10, 20, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[161].setRotationPoint(5.0F, -30.0F, 24.0F);
    
    bodyModel[162].addShapeBox(0.0F, 0.0F, 0.0F, 10, 20, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[162].setRotationPoint(5.0F, -30.0F, 28.0F);
    
    bodyModel[163].addShapeBox(0.0F, 0.0F, 0.0F, 15, 19, 1, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -19.0F, 0.0F, 0.0F, -19.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[163].setRotationPoint(15.0F, -29.0F, -29.0F);
    
    bodyModel[164].addShapeBox(0.0F, 0.0F, 0.0F, 10, 20, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[164].setRotationPoint(5.0F, -30.0F, -29.0F);
    
    bodyModel[165].addBox(0.0F, -0.5F, 0.0F, 10, 1, 22, 0.0F);
    bodyModel[165].setRotationPoint(5.0F, -30.0F, -28.0F);
    (bodyModel[165]).rotateAngleZ = -0.10471976F;
    
    bodyModel[166].addBox(0.0F, -0.5F, 0.0F, 10, 1, 34, 0.0F);
    bodyModel[166].setRotationPoint(5.0F, -30.0F, -6.0F);
    (bodyModel[166]).rotateAngleZ = -0.10471976F;
    
    bodyModel[167].addShapeBox(10.0F, -0.5F, 0.0F, 7, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[167].setRotationPoint(5.0F, -30.0F, 24.0F);
    (bodyModel[167]).rotateAngleZ = -0.10471976F;
    
    bodyModel[168].addShapeBox(10.0F, -0.5F, -19.0F, 7, 1, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[168].setRotationPoint(5.0F, -30.0F, 19.0F);
    (bodyModel[168]).rotateAngleZ = -0.10471976F;
    
    bodyModel[169].addShapeBox(10.0F, -0.5F, -21.0F, 14, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[169].setRotationPoint(5.0F, -30.0F, 13.0F);
    (bodyModel[169]).rotateAngleZ = -0.10471976F;
    
    bodyModel[170].addShapeBox(17.0F, -0.5F, -13.0F, 7, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[170].setRotationPoint(5.0F, -30.0F, 13.0F);
    (bodyModel[170]).rotateAngleZ = -0.10471976F;
    
    bodyModel[171].addShapeBox(0.0F, 0.0F, -28.0F, 13, 20, 56, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[171].setRotationPoint(-8.0F, -30.0F, 0.0F);
    
    bodyModel[172].addShapeBox(0.0F, 0.0F, 0.0F, 7, 20, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[172].setRotationPoint(-2.0F, -30.0F, 28.0F);
    
    bodyModel[173].addShapeBox(0.0F, 0.0F, 0.0F, 6, 20, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[173].setRotationPoint(-8.0F, -30.0F, 28.0F);
    
    bodyModel[174].addShapeBox(0.0F, 0.0F, -1.0F, 7, 20, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[174].setRotationPoint(-2.0F, -30.0F, -28.0F);
    
    bodyModel[175].addShapeBox(0.0F, 0.0F, -1.0F, 6, 20, 1, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[175].setRotationPoint(-8.0F, -30.0F, -28.0F);
    
    bodyModel[176].addBox(0.0F, -0.5F, 0.0F, 13, 1, 56, 0.0F);
    bodyModel[176].setRotationPoint(-8.0F, -30.0F, -28.0F);
    
    bodyModel[177].addBox(0.0F, 0.0F, -29.0F, 7, 21, 58, 0.0F);
    bodyModel[177].setRotationPoint(-15.0F, -30.5F, 0.0F);
    
    bodyModel[178].addShapeBox(0.0F, 0.0F, -29.0F, 5, 21, 58, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F);
    bodyModel[178].setRotationPoint(-20.0F, -30.5F, 0.0F);
    
    bodyModel[179].addShapeBox(0.0F, 0.0F, -16.0F, 24, 5, 32, 0.0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[179].setRotationPoint(-51.0F, -15.0F, 0.0F);
    
    bodyModel[180].addShapeBox(0.0F, 0.0F, 0.0F, 42, 5, 14, 0.0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, -1.2F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[180].setRotationPoint(-51.0F, -15.0F, 16.0F);
    
    bodyModel[181].addShapeBox(0.0F, 0.0F, -14.0F, 42, 5, 14, 0.0F, -1.2F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[181].setRotationPoint(-51.0F, -15.0F, -16.0F);
    
    bodyModel[182].addShapeBox(0.0F, 0.0F, -16.0F, 23, 7, 32, 0.0F, -23.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -23.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[182].setRotationPoint(-43.0F, -22.0F, 0.0F);
    
    bodyModel[183].addShapeBox(0.0F, 0.0F, 0.0F, 34, 7, 14, 0.0F, -23.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -25.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -0.5F, -5.0F, 1.0F, -0.5F);
    bodyModel[183].setRotationPoint(-43.0F, -22.0F, 16.0F);
    
    bodyModel[184].addShapeBox(0.0F, 0.0F, -14.0F, 34, 7, 14, 0.0F, -25.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -23.0F, 0.0F, 0.0F, -5.0F, 1.0F, -0.5F, 0.0F, 1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[184].setRotationPoint(-43.0F, -22.0F, -16.0F);
    
    bodyModel[185].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[185].setRotationPoint(-55.0F, -10.0F, 8.0F);
    
    bodyModel[186].addShapeBox(0.0F, 0.0F, -2.0F, 5, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[186].setRotationPoint(-55.0F, -10.0F, -8.0F);
    
    bodyModel[187].addShape3D(0.0F, 0.0F, -13.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 26.0F, 5, 5, 20, 26, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    bodyModel[187].setRotationPoint(-51.0F, -10.0F, 0.0F);
    
    bodyModel[188].addShapeBox(-3.0F, 0.0F, -2.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[188].setRotationPoint(-56.0F, -12.0F, 0.0F);
    (bodyModel[188]).rotateAngleZ = 0.6981317F;
    
    bodyModel[189].addBox(-0.5F, 5.0F, -2.0F, 1, 8, 4, 0.0F);
    bodyModel[189].setRotationPoint(-49.8F, -15.0F, 0.0F);
    (bodyModel[189]).rotateAngleZ = -0.2268928F;
    
    bodyModel[190].addShapeBox(-0.5F, 5.0F, -2.0F, 1, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[190].setRotationPoint(-49.8F, -15.0F, 4.0F);
    (bodyModel[190]).rotateAngleZ = -0.2268928F;
    
    bodyModel[191].addShapeBox(-0.5F, 5.0F, -4.0F, 1, 8, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[191].setRotationPoint(-49.8F, -15.0F, 0.0F);
    (bodyModel[191]).rotateAngleZ = -0.2268928F;
    
    bodyModel[192].addShapeBox(0.0F, -8.5F, -3.0F, 3, 16, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[192].setRotationPoint(29.0F, -19.0F, 0.0F);
    
    bodyModel[193].addShapeBox(0.0F, 0.0F, 0.0F, 3, 16, 5, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, -4.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, -4.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[193].setRotationPoint(29.0F, -27.5F, -8.0F);
    
    bodyModel[194].addShapeBox(0.0F, 0.0F, 0.0F, 3, 16, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -5.0F, -4.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -5.0F, -4.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[194].setRotationPoint(29.0F, -27.5F, 3.0F);
    
    bodyModel[195].addShapeBox(0.0F, -0.5F, 0.0F, 2, 1, 6, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F);
    bodyModel[195].setRotationPoint(29.0F, -21.0F, 5.0F);
    
    bodyModel[196].addShapeBox(0.0F, -0.5F, 0.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F);
    bodyModel[196].setRotationPoint(29.0F, -18.0F, 5.0F);
    
    bodyModel[197].addShapeBox(0.0F, -0.5F, 0.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F);
    bodyModel[197].setRotationPoint(29.0F, -20.0F, 5.0F);
    
    bodyModel[198].addShapeBox(0.0F, -0.5F, 0.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F);
    bodyModel[198].setRotationPoint(29.0F, -20.0F, 10.0F);
    
    bodyModel[199].addShapeBox(0.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[199].setRotationPoint(29.0F, -20.0F, 8.0F);
    
    bodyModel[200].addShapeBox(0.0F, -0.5F, 0.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[200].setRotationPoint(29.0F, -19.0F, 8.0F);
    
    bodyModel[201].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    bodyModel[201].setRotationPoint(31.0F, -26.5F, -3.5F);
    
    bodyModel[202].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    bodyModel[202].setRotationPoint(31.0F, -26.5F, 2.5F);
    
    bodyModel[203].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    bodyModel[203].setRotationPoint(31.0F, -23.0F, -7.0F);
    
    bodyModel[204].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    bodyModel[204].setRotationPoint(31.0F, -23.0F, 6.0F);
    
    bodyModel[205].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    bodyModel[205].setRotationPoint(31.0F, -17.0F, -7.0F);
    
    bodyModel[206].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    bodyModel[206].setRotationPoint(31.0F, -13.5F, -3.5F);
    
    bodyModel[207].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    bodyModel[207].setRotationPoint(31.0F, -13.5F, 2.5F);
    
    bodyModel[208].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    bodyModel[208].setRotationPoint(30.0F, -17.0F, 6.0F);
    
    bodyModel[209].addBox(1.0F, -1.0F, -8.0F, 6, 1, 11, 0.0F);
    bodyModel[209].setRotationPoint(5.0F, -30.0F, -19.0F);
    (bodyModel[209]).rotateAngleZ = -0.10471976F;
    
    bodyModel[210].addShapeBox(7.0F, -1.0F, -8.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[210].setRotationPoint(5.0F, -30.0F, -19.0F);
    (bodyModel[210]).rotateAngleZ = -0.10471976F;
    
    bodyModel[211].addShapeBox(0.0F, -1.0F, -8.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[211].setRotationPoint(5.0F, -30.0F, -19.0F);
    (bodyModel[211]).rotateAngleZ = -0.10471976F;
    
    bodyModel[212].addShapeBox(9.5F, -2.0F, -3.0F, 1, 2, 4, 0.0F, 3.0F, 0.0F, -1.0F, -3.5F, 0.0F, -0.5F, -1.0F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F, 3.0F, 0.0F, -1.0F, -3.5F, 0.0F, -0.5F, -1.0F, 0.0F, -1.0F, 0.5F, 0.0F, -0.5F);
    bodyModel[212].setRotationPoint(5.0F, -30.0F, -24.0F);
    (bodyModel[212]).rotateAngleZ = -0.10471976F;
    
    bodyModel[213].addShapeBox(9.5F, -2.0F, -4.0F, 1, 2, 3, 0.0F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -1.0F, -3.5F, 0.0F, 0.5F, 3.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -1.0F, -3.5F, 0.0F, 0.5F, 3.0F, 0.0F, 0.0F);
    bodyModel[213].setRotationPoint(5.0F, -30.0F, -16.0F);
    (bodyModel[213]).rotateAngleZ = -0.10471976F;
    
    bodyModel[214].addShapeBox(2.5F, -2.0F, -2.8F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    bodyModel[214].setRotationPoint(5.0F, -30.0F, -24.0F);
    (bodyModel[214]).rotateAngleZ = -0.10471976F;
    
    bodyModel[215].addShapeBox(2.5F, -2.0F, -2.2F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.5F, 0.0F, -0.3F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.5F, 0.0F, -0.3F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[215].setRotationPoint(5.0F, -30.0F, -15.0F);
    (bodyModel[215]).rotateAngleZ = -0.10471976F;
    
    bodyModel[216].addBox(2.0F, -1.5F, -5.5F, 5, 1, 7, 0.0F);
    bodyModel[216].setRotationPoint(5.0F, -30.0F, -19.5F);
    (bodyModel[216]).rotateAngleZ = -0.10471976F;
    
    bodyModel[217].addShapeBox(7.0F, -1.5F, -5.5F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[217].setRotationPoint(5.0F, -30.0F, -19.5F);
    (bodyModel[217]).rotateAngleZ = -0.10471976F;
    
    bodyModel[218].addBox(0.5F, -2.0F, -3.5F, 2, 1, 4, 0.0F);
    bodyModel[218].setRotationPoint(5.0F, -30.0F, -20.0F);
    (bodyModel[218]).rotateAngleZ = -0.10471976F;
    
    bodyModel[219].addBox(6.0F, -1.0F, -4.0F, 6, 1, 9, 0.0F);
    bodyModel[219].setRotationPoint(3.0F, -30.0F, 13.0F);
    (bodyModel[219]).rotateAngleZ = -0.10471976F;
    
    bodyModel[220].addBox(5.0F, -1.5F, -3.0F, 1, 1, 7, 0.0F);
    bodyModel[220].setRotationPoint(3.0F, -30.0F, 13.0F);
    (bodyModel[220]).rotateAngleZ = -0.10471976F;
    
    bodyModel[221].addShapeBox(0.0F, -0.5F, -3.0F, 3, 1, 3, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[221].setRotationPoint(18.0F, -29.0F, 5.0F);
    
    bodyModel[222].addShapeBox(0.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[222].setRotationPoint(18.5F, -30.0F, 4.5F);
    
    bodyModel[223].addShapeBox(0.0F, -0.5F, -3.0F, 3, 1, 3, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[223].setRotationPoint(17.0F, -29.2F, 25.0F);
    
    bodyModel[224].addShapeBox(0.0F, -0.5F, -2.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[224].setRotationPoint(17.5F, -30.2F, 24.5F);
    
    bodyModel[225].addShapeBox(0.0F, 0.0F, -14.0F, 13, 1, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[225].setRotationPoint(-19.0F, -31.0F, 0.0F);
    
    bodyModel[226].addBox(0.0F, 0.0F, 0.0F, 7, 1, 17, 0.0F);
    bodyModel[226].setRotationPoint(-15.0F, -31.0F, 12.0F);
    
    bodyModel[227].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 17, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F);
    bodyModel[227].setRotationPoint(-20.0F, -31.0F, 12.0F);
    
    bodyModel[228].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[228].setRotationPoint(-8.0F, -31.0F, 12.0F);
    
    bodyModel[229].addBox(0.0F, 0.0F, -17.0F, 7, 1, 17, 0.0F);
    bodyModel[229].setRotationPoint(-15.0F, -31.0F, -12.0F);
    
    bodyModel[230].addShapeBox(0.0F, 0.0F, -17.0F, 5, 1, 17, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F);
    bodyModel[230].setRotationPoint(-20.0F, -31.0F, -12.0F);
    
    bodyModel[231].addShapeBox(0.0F, 0.0F, -17.0F, 5, 1, 17, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[231].setRotationPoint(-8.0F, -31.0F, -12.0F);
    
    bodyModel[232].addShapeBox(0.0F, 0.5F, -4.0F, 4, 1, 4, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[232].setRotationPoint(8.0F, -31.0F, -8.0F);
    
    bodyModel[233].addShapeBox(0.0F, 0.0F, -4.0F, 4, 1, 4, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[233].setRotationPoint(-4.0F, -31.0F, 0.0F);
    
    bodyModel[234].addShapeBox(0.0F, 0.0F, -4.0F, 4, 1, 4, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[234].setRotationPoint(0.0F, -31.0F, 9.0F);
    
    bodyModel[235].addShapeBox(0.0F, 0.0F, -11.0F, 5, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[235].setRotationPoint(-14.0F, -31.5F, 26.0F);
    
    bodyModel[236].addShapeBox(0.0F, 0.0F, -11.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[236].setRotationPoint(-9.0F, -31.5F, 26.0F);
    
    bodyModel[237].addShapeBox(0.0F, 0.0F, -11.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
    bodyModel[237].setRotationPoint(-17.0F, -31.5F, 26.0F);
    
    bodyModel[238].addShapeBox(-1.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[238].setRotationPoint(-4.0F, -32.0F, 19.0F);
    
    bodyModel[239].addShapeBox(-1.0F, 0.0F, -3.2F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[239].setRotationPoint(-4.0F, -32.0F, 18.0F);
    (bodyModel[239]).rotateAngleY = -0.7853982F;
    
    bodyModel[240].addShapeBox(-1.0F, 0.0F, 0.2F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[240].setRotationPoint(-4.0F, -32.0F, 23.0F);
    (bodyModel[240]).rotateAngleY = 0.7853982F;
    
    bodyModel[241].addShapeBox(-1.0F, 0.0F, -0.2F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[241].setRotationPoint(-7.0F, -32.0F, 26.0F);
    (bodyModel[241]).rotateAngleY = 0.7853982F;
    
    bodyModel[242].addShapeBox(-3.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[242].setRotationPoint(-10.0F, -32.0F, 27.0F);
    
    bodyModel[243].addShapeBox(-1.0F, 0.0F, -2.5F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[243].setRotationPoint(-7.0F, -33.0F, 15.0F);
    (bodyModel[243]).rotateAngleY = -0.7853982F;
    
    bodyModel[244].addShapeBox(-3.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[244].setRotationPoint(-10.0F, -32.0F, 14.0F);
    
    bodyModel[245].addShapeBox(-1.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[245].setRotationPoint(-17.0F, -32.0F, 17.0F);
    
    bodyModel[246].addShapeBox(-1.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F, -1.0F, 0.2F, 0.0F, -5.0F, 0.2F, 0.0F, -5.0F, 0.2F, 0.0F, -1.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[246].setRotationPoint(-18.0F, -32.0F, 18.0F);
    
    bodyModel[247].addShapeBox(-1.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F, -1.0F, 0.2F, 0.0F, -5.0F, 0.2F, 0.0F, -5.0F, 0.2F, 0.0F, -1.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[247].setRotationPoint(-18.0F, -32.0F, 22.0F);
    
    bodyModel[248].addShapeBox(0.0F, 0.0F, -4.0F, 1, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[248].setRotationPoint(23.0F, -27.35F, 20.0F);
    
    bodyModel[249].addShapeBox(0.0F, 0.0F, -2.0F, 1, 8, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[249].setRotationPoint(23.0F, -27.35F, 16.0F);
    
    bodyModel[250].addShapeBox(0.0F, 0.0F, -2.0F, 1, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[250].setRotationPoint(23.0F, -27.35F, 22.0F);
    
    bodyModel[251].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[251].setRotationPoint(22.0F, -23.0F, 17.0F);
    
    bodyModel[252].addShapeBox(0.0F, -0.5F, 0.0F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[252].setRotationPoint(22.0F, -22.0F, 17.0F);
    
    bodyModel[253].addBox(0.0F, 0.5F, 0.0F, 7, 1, 1, 0.0F);
    bodyModel[253].setRotationPoint(22.0F, -24.0F, 17.5F);
    
    bodyModel[254].addShapeBox(-0.2F, 0.5F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);
    bodyModel[254].setRotationPoint(22.0F, -27.35F, 16.0F);
    
    bodyModel[255].addShapeBox(-0.2F, -0.5F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);
    bodyModel[255].setRotationPoint(22.0F, -26.35F, 19.0F);
    
    bodyModel[256].addShapeBox(-0.2F, 0.0F, 0.5F, 2, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);
    bodyModel[256].setRotationPoint(22.0F, -25.35F, 20.0F);
    
    bodyModel[257].addShapeBox(-0.2F, 0.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);
    bodyModel[257].setRotationPoint(22.0F, -25.35F, 15.0F);
    
    bodyModel[258].addShapeBox(-0.2F, 0.0F, 0.5F, 2, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);
    bodyModel[258].setRotationPoint(22.0F, -22.35F, 20.0F);
    
    bodyModel[259].addShapeBox(-0.2F, 0.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);
    bodyModel[259].setRotationPoint(22.0F, -22.35F, 15.0F);
    
    bodyModel[260].addShapeBox(-0.2F, 0.5F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);
    bodyModel[260].setRotationPoint(22.0F, -21.35F, 16.0F);
    
    bodyModel[261].addShapeBox(-0.2F, 0.5F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);
    bodyModel[261].setRotationPoint(22.0F, -21.35F, 19.0F);
    
    bodyModel[262].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 12, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
    bodyModel[262].setRotationPoint(9.5F, -17.0F, 28.0F);
    (bodyModel[262]).rotateAngleY = -1.5707964F;
    (bodyModel[262]).rotateAngleZ = -1.5707964F;
    
    bodyModel[263].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 12, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
    bodyModel[263].setRotationPoint(-7.5F, -17.0F, 28.0F);
    (bodyModel[263]).rotateAngleY = -1.5707964F;
    (bodyModel[263]).rotateAngleZ = -1.5707964F;
    
    bodyModel[264].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 12, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
    bodyModel[264].setRotationPoint(3.5F, -24.0F, 28.0F);
    (bodyModel[264]).rotateAngleY = -1.5707964F;
    (bodyModel[264]).rotateAngleZ = -1.5707964F;
    
    bodyModel[265].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 12, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
    bodyModel[265].setRotationPoint(11.5F, -17.0F, -30.0F);
    (bodyModel[265]).rotateAngleY = -1.5707964F;
    (bodyModel[265]).rotateAngleZ = -1.5707964F;
    
    bodyModel[266].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 12, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
    bodyModel[266].setRotationPoint(-7.5F, -17.0F, -30.0F);
    (bodyModel[266]).rotateAngleY = -1.5707964F;
    (bodyModel[266]).rotateAngleZ = -1.5707964F;
    
    bodyModel[267].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 12, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
    bodyModel[267].setRotationPoint(-7.5F, -24.0F, -30.0F);
    (bodyModel[267]).rotateAngleY = -1.5707964F;
    (bodyModel[267]).rotateAngleZ = -1.5707964F;
    
    bodyModel[268].addShapeBox(0.0F, -0.5F, -12.0F, 19, 1, 24, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[268].setRotationPoint(30.0F, -10.0F, 0.0F);
    (bodyModel[268]).rotateAngleZ = -0.25743607F;
    
    bodyModel[269].addShapeBox(2.0F, -0.5F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[269].setRotationPoint(30.0F, -11.0F, 0.0F);
    (bodyModel[269]).rotateAngleZ = -0.25743607F;
    
    bodyModel[270].addShapeBox(4.0F, -0.2F, -7.0F, 12, 1, 6, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[270].setRotationPoint(30.0F, -11.0F, 0.0F);
    (bodyModel[270]).rotateAngleZ = -0.25743607F;
    
    bodyModel[271].addShapeBox(4.0F, -0.2F, 1.0F, 12, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F);
    bodyModel[271].setRotationPoint(30.0F, -11.0F, 0.0F);
    (bodyModel[271]).rotateAngleZ = -0.25743607F;
    
    bodyModel[272].addShapeBox(16.0F, -0.5F, -7.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[272].setRotationPoint(30.0F, -11.0F, 0.0F);
    (bodyModel[272]).rotateAngleZ = -0.25743607F;
    
    bodyModel[273].addShapeBox(16.0F, -0.5F, 6.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[273].setRotationPoint(30.0F, -11.0F, 0.0F);
    (bodyModel[273]).rotateAngleZ = -0.25743607F;
    
    bodyModel[274].addShapeBox(0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[274].setRotationPoint(52.0F, -2.0F, -11.0F);
    
    bodyModel[275].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[275].setRotationPoint(52.0F, -2.0F, -8.0F);
    
    bodyModel[276].addShapeBox(-0.2F, 0.0F, -1.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[276].setRotationPoint(52.0F, -2.0F, -1.5F);
    
    bodyModel[277].addShapeBox(-0.2F, 0.0F, 0.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[277].setRotationPoint(52.0F, -2.0F, 1.5F);
    
    bodyModel[278].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[278].setRotationPoint(52.0F, -2.0F, 11.0F);
    
    bodyModel[279].addShapeBox(0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[279].setRotationPoint(52.0F, -2.0F, 8.0F);
    
    bodyModel[280].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[280].setRotationPoint(52.0F, -1.0F, -11.0F);
    
    bodyModel[281].addShapeBox(-0.2F, 0.0F, -1.5F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[281].setRotationPoint(52.0F, -1.0F, 0.0F);
    
    bodyModel[282].addShapeBox(0.0F, 0.0F, -3.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[282].setRotationPoint(52.0F, -1.0F, 11.0F);
    
    bodyModel[283].addShapeBox(0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[283].setRotationPoint(-55.0F, -2.0F, -11.0F);
    
    bodyModel[284].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[284].setRotationPoint(-55.0F, -2.0F, -8.0F);
    
    bodyModel[285].addShapeBox(0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[285].setRotationPoint(-55.0F, -2.0F, 8.0F);
    
    bodyModel[286].addShapeBox(-3.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[286].setRotationPoint(-52.0F, -2.0F, 11.0F);
    
    bodyModel[287].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    bodyModel[287].setRotationPoint(-55.0F, -1.0F, -11.0F);
    
    bodyModel[288].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 3, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    bodyModel[288].setRotationPoint(-55.0F, -1.0F, 8.0F);
    
    bodyModel[289].addShapeBox(0.0F, 0.0F, 0.0F, 5, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[289].setRotationPoint(-57.0F, -1.0F, 3.5F);
    
    bodyModel[290].addShapeBox(0.0F, 0.0F, -1.0F, 5, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[290].setRotationPoint(-57.0F, -1.0F, -3.5F);
    
    bodyModel[291].addShapeBox(0.0F, 0.0F, -3.5F, 4, 4, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[291].setRotationPoint(-58.0F, -1.5F, 0.0F);
    
    bodyModel[292].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[292].setRotationPoint(36.0F, -10.5F, 14.0F);
    
    bodyModel[293].addShapeBox(0.0F, 0.0F, -16.0F, 2, 1, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[293].setRotationPoint(36.0F, -10.5F, -14.0F);
    
    bodyModel[294].addShapeBox(-24.0F, -0.5F, -6.0F, 12, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[294].setRotationPoint(-20.0F, -22.0F, 0.0F);
    (bodyModel[294]).rotateAngleZ = 0.29670596F;
    
    bodyModel[295].addShapeBox(-13.5F, -1.0F, -5.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[295].setRotationPoint(-20.0F, -22.0F, 0.0F);
    (bodyModel[295]).rotateAngleZ = 0.29670596F;
    
    bodyModel[296].addShapeBox(-13.5F, -1.0F, 3.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[296].setRotationPoint(-20.0F, -22.0F, 0.0F);
    (bodyModel[296]).rotateAngleZ = 0.29670596F;
    
    bodyModel[297].addShapeBox(-10.0F, -0.5F, 5.0F, 10, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[297].setRotationPoint(-20.0F, -22.0F, 0.0F);
    (bodyModel[297]).rotateAngleZ = 0.29670596F;
    
    bodyModel[298].addShapeBox(-10.0F, -0.5F, -15.0F, 10, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[298].setRotationPoint(-20.0F, -22.0F, 0.0F);
    (bodyModel[298]).rotateAngleZ = 0.29670596F;
    
    bodyModel[299].addShapeBox(-11.5F, -1.0F, 6.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[299].setRotationPoint(-20.0F, -22.0F, 0.0F);
    (bodyModel[299]).rotateAngleZ = 0.29670596F;
    
    bodyModel[300].addShapeBox(-11.5F, -1.0F, 12.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[300].setRotationPoint(-20.0F, -22.0F, 0.0F);
    (bodyModel[300]).rotateAngleZ = 0.29670596F;
    
    bodyModel[301].addShapeBox(-11.5F, -1.0F, -8.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[301].setRotationPoint(-20.0F, -22.0F, 0.0F);
    (bodyModel[301]).rotateAngleZ = 0.29670596F;
    
    bodyModel[302].addShapeBox(-11.5F, -1.0F, -14.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[302].setRotationPoint(-20.0F, -22.0F, 0.0F);
    (bodyModel[302]).rotateAngleZ = 0.29670596F;
    
    bodyModel[303].addShapeBox(-4.0F, 0.0F, -4.0F, 4, 1, 4, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[303].setRotationPoint(-20.0F, -23.0F, 0.0F);
    (bodyModel[303]).rotateAngleZ = 0.29670596F;
    
    bodyModel[304].addShapeBox(-19.0F, 0.0F, 11.0F, 4, 1, 4, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[304].setRotationPoint(-20.0F, -23.0F, 0.0F);
    (bodyModel[304]).rotateAngleZ = 0.29670596F;
    
    bodyModel[305].addShapeBox(-19.0F, 0.0F, -15.0F, 4, 1, 4, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[305].setRotationPoint(-20.0F, -23.0F, 0.0F);
    (bodyModel[305]).rotateAngleZ = 0.29670596F;
    
    bodyModel[306].addBox(1.0F, -1.0F, 5.0F, 6, 1, 4, 0.0F);
    bodyModel[306].setRotationPoint(-49.0F, -15.0F, 16.0F);
    (bodyModel[306]).rotateAngleX = -0.08726646F;
    
    bodyModel[307].addBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F);
    bodyModel[307].setRotationPoint(23.0F, -25.0F, 25.0F);
    (bodyModel[307]).rotateAngleZ = 0.17453294F;
    
    bodyModel[308].addShapeBox(0.0F, 2.0F, 0.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[308].setRotationPoint(23.0F, -25.0F, 25.0F);
    (bodyModel[308]).rotateAngleZ = 0.17453294F;
    
    bodyModel[309].addShapeBox(0.0F, 4.0F, 0.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[309].setRotationPoint(23.0F, -25.0F, 25.0F);
    (bodyModel[309]).rotateAngleZ = 0.17453294F;
    
    bodyModel[310].addShapeBox(0.0F, 0.0F, 0.0F, 1, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F);
    bodyModel[310].setRotationPoint(23.0F, -25.0F, 25.0F);
    
    bodyModel[311].addBox(0.0F, 0.5F, 0.5F, 2, 1, 1, 0.0F);
    bodyModel[311].setRotationPoint(26.0F, -25.5F, 25.0F);
    (bodyModel[311]).rotateAngleZ = 0.17453294F;
    
    bodyModel[312].addBox(0.0F, 0.5F, 2.5F, 2, 1, 1, 0.0F);
    bodyModel[312].setRotationPoint(26.0F, -25.5F, 25.0F);
    (bodyModel[312]).rotateAngleZ = 0.17453294F;
    
    bodyModel[313].addBox(0.0F, 0.5F, 0.5F, 2, 1, 1, 0.0F);
    bodyModel[313].setRotationPoint(26.2F, -23.5F, 25.0F);
    (bodyModel[313]).rotateAngleX = -0.05235988F;
    (bodyModel[313]).rotateAngleY = 0.29670596F;
    (bodyModel[313]).rotateAngleZ = 0.17453294F;
    
    bodyModel[314].addBox(0.0F, 0.5F, 2.5F, 2, 1, 1, 0.0F);
    bodyModel[314].setRotationPoint(26.2F, -23.5F, 25.0F);
    (bodyModel[314]).rotateAngleX = -0.05235988F;
    (bodyModel[314]).rotateAngleY = 0.29670596F;
    (bodyModel[314]).rotateAngleZ = 0.17453294F;
    
    bodyModel[315].addBox(0.0F, 0.5F, 0.5F, 2, 1, 1, 0.0F);
    bodyModel[315].setRotationPoint(26.6F, -21.5F, 25.0F);
    (bodyModel[315]).rotateAngleX = -0.08726646F;
    (bodyModel[315]).rotateAngleY = 0.5061455F;
    (bodyModel[315]).rotateAngleZ = 0.17453294F;
    
    bodyModel[316].addBox(0.0F, 0.5F, 2.5F, 2, 1, 1, 0.0F);
    bodyModel[316].setRotationPoint(26.6F, -21.5F, 25.0F);
    (bodyModel[316]).rotateAngleX = -0.08726646F;
    (bodyModel[316]).rotateAngleY = 0.4712389F;
    (bodyModel[316]).rotateAngleZ = 0.17453294F;
    
    bodyModel[317].addBox(0.0F, 4.0F, 0.0F, 3, 2, 4, 0.0F);
    bodyModel[317].setRotationPoint(18.0F, -27.0F, -27.0F);
    (bodyModel[317]).rotateAngleZ = 0.6632251F;
    
    bodyModel[318].addShapeBox(0.0F, 2.0F, 0.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[318].setRotationPoint(18.0F, -27.0F, -27.0F);
    (bodyModel[318]).rotateAngleZ = 0.6632251F;
    
    bodyModel[319].addShapeBox(0.0F, 0.0F, 0.0F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[319].setRotationPoint(18.0F, -27.0F, -27.0F);
    (bodyModel[319]).rotateAngleZ = 0.6632251F;
    
    bodyModel[320].addBox(0.0F, 0.5F, 0.5F, 2, 1, 1, 0.0F);
    bodyModel[320].setRotationPoint(22.7F, -25.5F, -27.0F);
    (bodyModel[320]).rotateAngleZ = 0.6632251F;
    
    bodyModel[321].addBox(0.0F, 0.5F, 2.5F, 2, 1, 1, 0.0F);
    bodyModel[321].setRotationPoint(22.7F, -25.5F, -27.0F);
    (bodyModel[321]).rotateAngleZ = 0.6632251F;
    
    bodyModel[322].addBox(0.0F, 0.5F, -1.5F, 2, 1, 1, 0.0F);
    bodyModel[322].setRotationPoint(21.5F, -27.0F, -23.0F);
    (bodyModel[322]).rotateAngleX = 0.17453294F;
    (bodyModel[322]).rotateAngleY = -0.29670596F;
    (bodyModel[322]).rotateAngleZ = 0.6632251F;
    
    bodyModel[323].addBox(0.0F, 0.5F, -3.5F, 2, 1, 1, 0.0F);
    bodyModel[323].setRotationPoint(21.5F, -27.0F, -23.0F);
    (bodyModel[323]).rotateAngleX = 0.17453294F;
    (bodyModel[323]).rotateAngleY = -0.29670596F;
    (bodyModel[323]).rotateAngleZ = 0.6632251F;
    
    bodyModel[324].addBox(0.0F, 0.5F, -1.5F, 2, 1, 1, 0.0F);
    bodyModel[324].setRotationPoint(20.4F, -28.6F, -23.0F);
    (bodyModel[324]).rotateAngleX = 0.2617994F;
    (bodyModel[324]).rotateAngleY = -0.5235988F;
    (bodyModel[324]).rotateAngleZ = 0.62831855F;
    
    bodyModel[325].addBox(0.0F, 0.5F, -3.5F, 2, 1, 1, 0.0F);
    bodyModel[325].setRotationPoint(20.4F, -28.6F, -23.0F);
    (bodyModel[325]).rotateAngleX = 0.2617994F;
    (bodyModel[325]).rotateAngleY = -0.5235988F;
    (bodyModel[325]).rotateAngleZ = 0.62831855F;
    
    bodyModel[326].addBox(0.0F, 0.0F, 0.0F, 5, 8, 1, 0.0F);
    bodyModel[326].setRotationPoint(22.0F, -27.0F, 24.0F);
    
    bodyModel[327].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[327].setRotationPoint(23.0F, -21.0F, 22.0F);
    (bodyModel[327]).rotateAngleY = 0.34906584F;
    
    bodyModel[328].addShapeBox(0.0F, 0.0F, -1.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[328].setRotationPoint(21.0F, -27.0F, 29.0F);
    (bodyModel[328]).rotateAngleY = -0.6021386F;
    
    bodyModel[329].addBox(0.0F, 0.0F, 0.0F, 4, 7, 1, 0.0F);
    bodyModel[329].setRotationPoint(18.0F, -27.0F, -23.0F);
    (bodyModel[329]).rotateAngleZ = 0.6632251F;
    
    bodyModel[330].addShapeBox(-2.0F, 1.0F, 1.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[330].setRotationPoint(18.0F, -27.0F, -23.0F);
    (bodyModel[330]).rotateAngleZ = 0.6632251F;
    
    bodyModel[331].addShapeBox(-2.0F, 5.0F, 1.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[331].setRotationPoint(18.0F, -27.0F, -23.0F);
    (bodyModel[331]).rotateAngleZ = 0.6632251F;
    
    bodyModel[332].addShapeBox(-0.5F, -20.0F, -0.5F, 1, 20, 1, 0.0F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F);
    bodyModel[332].setRotationPoint(-2.0F, -31.0F, -2.0F);
    
    bodyModel[333].addShapeBox(-0.5F, -20.0F, -0.5F, 1, 20, 1, 0.0F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F);
    bodyModel[333].setRotationPoint(2.0F, -31.0F, 7.0F);
    
    bodyModel[334].addShapeBox(0.0F, 0.3F, -4.0F, 4, 1, 4, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[334].setRotationPoint(6.0F, -31.0F, 23.0F);
    
    bodyModel[335].addShapeBox(5.5F, -19.0F, 13.5F, 1, 20, 1, 0.0F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F);
    bodyModel[335].setRotationPoint(2.0F, -31.0F, 7.0F);
    
    bodyModel[336].addShapeBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[336].setRotationPoint(43.0F, -9.0F, -10.0F);
    
    bodyModel[337].addShapeBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[337].setRotationPoint(43.0F, -9.0F, 8.0F);
    
    bodyModel[338].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[338].setRotationPoint(46.0F, -9.0F, -10.0F);
    
    bodyModel[339].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[339].setRotationPoint(46.0F, -9.0F, 8.0F);

    
    barrelModel = new ModelRendererTurbo[20];
    barrelModel[0] = new ModelRendererTurbo(this, 0, 485, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 23, 485, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 0, 505, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 105, 485, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 120, 485, textureX, textureY);
    barrelModel[5] = new ModelRendererTurbo(this, 135, 485, textureX, textureY);
    barrelModel[6] = new ModelRendererTurbo(this, 42, 485, textureX, textureY);
    barrelModel[7] = new ModelRendererTurbo(this, 55, 485, textureX, textureY);
    barrelModel[8] = new ModelRendererTurbo(this, 65, 485, textureX, textureY);
    barrelModel[9] = new ModelRendererTurbo(this, 77, 485, textureX, textureY);
    barrelModel[10] = new ModelRendererTurbo(this, 89, 485, textureX, textureY);
    barrelModel[11] = new ModelRendererTurbo(this, 89, 488, textureX, textureY);
    barrelModel[12] = new ModelRendererTurbo(this, 95, 485, textureX, textureY);
    barrelModel[13] = new ModelRendererTurbo(this, 95, 488, textureX, textureY);
    barrelModel[14] = new ModelRendererTurbo(this, 104, 485, textureX, textureY);
    barrelModel[15] = new ModelRendererTurbo(this, 104, 485, textureX, textureY);
    barrelModel[16] = new ModelRendererTurbo(this, 104, 485, textureX, textureY);
    barrelModel[17] = new ModelRendererTurbo(this, 104, 485, textureX, textureY);
    barrelModel[18] = new ModelRendererTurbo(this, 104, 485, textureX, textureY);
    barrelModel[19] = new ModelRendererTurbo(this, 104, 485, textureX, textureY);
    
    barrelModel[0].addBox(0.0F, -1.5F, -1.5F, 7, 3, 3, 0.0F);
    barrelModel[0].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[1].addShapeBox(7.0F, -1.5F, -1.5F, 5, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F);
    barrelModel[1].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[2].addShapeBox(12.0F, -1.5F, -1.5F, 52, 3, 3, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    barrelModel[2].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[3].addBox(6.0F, -6.0F, -2.0F, 1, 12, 4, 0.0F);
    barrelModel[3].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[4].addShapeBox(6.0F, -6.0F, -6.0F, 1, 12, 4, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[4].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[5].addShapeBox(6.0F, -6.0F, 2.0F, 1, 12, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F);
    barrelModel[5].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[6].addShapeBox(62.0F, -1.5F, -1.5F, 2, 3, 3, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    barrelModel[6].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[7].addShapeBox(64.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, -0.2F, -0.2F);
    barrelModel[7].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[8].addShapeBox(65.0F, -1.5F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F);
    barrelModel[8].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[9].addShapeBox(65.0F, 0.5F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    barrelModel[9].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[10].addShapeBox(66.0F, -0.5F, -1.5F, 1, 1, 1, 0.0F, 0.2F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F);
    barrelModel[10].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[11].addShapeBox(66.0F, -0.5F, 0.5F, 1, 1, 1, 0.0F, 0.2F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, 0.2F, 0.2F, 0.2F, 0.2F);
    barrelModel[11].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[12].addShapeBox(67.0F, -1.7F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.1F, 0.0F, -0.4F, -0.1F, 0.0F, -0.4F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F);
    barrelModel[12].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[13].addShapeBox(67.0F, 0.7F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, -0.4F, -0.1F, -0.3F, 0.0F, -0.1F, -0.3F, 0.0F, -0.1F, 0.0F, -0.4F, -0.1F, 0.0F, -0.4F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F);
    barrelModel[13].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[14].addBox(6.5F, -3.5F, -0.5F, 1, 1, 1, 0.0F);
    barrelModel[14].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[15].addBox(6.5F, -2.0F, -3.5F, 1, 1, 1, 0.0F);
    barrelModel[15].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[16].addBox(6.5F, -2.0F, 2.5F, 1, 1, 1, 0.0F);
    barrelModel[16].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[17].addBox(6.5F, 2.5F, -0.5F, 1, 1, 1, 0.0F);
    barrelModel[17].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[18].addBox(6.5F, 1.0F, -3.5F, 1, 1, 1, 0.0F);
    barrelModel[18].setRotationPoint(27.0F, -19.5F, 0.0F);
    
    barrelModel[19].addBox(6.5F, 1.0F, 2.5F, 1, 1, 1, 0.0F);
    barrelModel[19].setRotationPoint(27.0F, -19.5F, 0.0F);

    
    leftTrackWheelModels = new ModelRendererTurbo[16];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 155, 140, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    leftTrackWheelModels[12] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    leftTrackWheelModels[13] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    leftTrackWheelModels[14] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    leftTrackWheelModels[15] = new ModelRendererTurbo(this, 155, 165, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(5.0F, -5.0F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 10.0F, 10, 10, 36, 10, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[0].setRotationPoint(47.5F, -0.5F, -27.0F);
    
    leftTrackWheelModels[1].addShape3D(3.5F, -3.5F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[1].setRotationPoint(37.5F, 5.5F, -27.0F);
    
    leftTrackWheelModels[2].addShape3D(3.5F, -3.5F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[2].setRotationPoint(24.5F, 5.5F, -27.0F);
    
    leftTrackWheelModels[3].addShape3D(3.5F, -3.5F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[3].setRotationPoint(15.5F, 5.5F, -27.0F);
    
    leftTrackWheelModels[4].addShape3D(3.5F, -3.5F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[4].setRotationPoint(2.5F, 5.5F, -27.0F);
    
    leftTrackWheelModels[5].addShape3D(3.5F, -3.5F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[5].setRotationPoint(-6.5F, 5.5F, -27.0F);
    
    leftTrackWheelModels[6].addShape3D(3.5F, -3.5F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[6].setRotationPoint(-19.5F, 5.5F, -27.0F);
    
    leftTrackWheelModels[7].addShape3D(3.5F, -3.5F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[7].setRotationPoint(-28.5F, 5.5F, -27.0F);
    
    leftTrackWheelModels[8].addShape3D(3.5F, -3.5F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[8].setRotationPoint(-41.5F, 5.5F, -27.0F);
    
    leftTrackWheelModels[9].addShape3D(2.0F, -2.0F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[9].setRotationPoint(26.5F, -3.5F, -27.0F);
    
    leftTrackWheelModels[10].addShape3D(2.0F, -2.0F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[10].setRotationPoint(13.5F, -3.5F, -27.0F);
    
    leftTrackWheelModels[11].addShape3D(2.0F, -2.0F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[11].setRotationPoint(4.5F, -3.5F, -27.0F);
    
    leftTrackWheelModels[12].addShape3D(2.0F, -2.0F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[12].setRotationPoint(-8.5F, -3.5F, -27.0F);
    
    leftTrackWheelModels[13].addShape3D(2.0F, -2.0F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[13].setRotationPoint(-17.5F, -3.5F, -27.0F);
    
    leftTrackWheelModels[14].addShape3D(2.0F, -2.0F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[14].setRotationPoint(-30.5F, -3.5F, -27.0F);
    
    leftTrackWheelModels[15].addShape3D(5.0F, -5.0F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 10.0F, 10, 10, 36, 10, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[15].setRotationPoint(-51.5F, -0.5F, -27.0F);

    
    rightTrackWheelModels = new ModelRendererTurbo[16];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 155, 140, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 120, 135, textureX, textureY);
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    rightTrackWheelModels[12] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    rightTrackWheelModels[13] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    rightTrackWheelModels[14] = new ModelRendererTurbo(this, 120, 165, textureX, textureY);
    rightTrackWheelModels[15] = new ModelRendererTurbo(this, 155, 165, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 10.0F, 10, 10, 36, 10, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[0].setRotationPoint(47.5F, -0.5F, 27.0F);
    
    rightTrackWheelModels[1].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[1].setRotationPoint(26.5F, -3.5F, 27.0F);
    
    rightTrackWheelModels[2].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[2].setRotationPoint(37.5F, 5.5F, 27.0F);
    
    rightTrackWheelModels[3].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[3].setRotationPoint(13.5F, -3.5F, 27.0F);
    
    rightTrackWheelModels[4].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[4].setRotationPoint(24.5F, 5.5F, 27.0F);
    
    rightTrackWheelModels[5].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[5].setRotationPoint(15.5F, 5.5F, 27.0F);
    
    rightTrackWheelModels[6].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[6].setRotationPoint(2.5F, 5.5F, 27.0F);
    
    rightTrackWheelModels[7].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[7].setRotationPoint(-6.5F, 5.5F, 27.0F);
    
    rightTrackWheelModels[8].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[8].setRotationPoint(-18.5F, 5.5F, 27.0F);
    
    rightTrackWheelModels[9].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[9].setRotationPoint(-28.5F, 5.5F, 27.0F);
    
    rightTrackWheelModels[10].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 10.0F, 7, 7, 24, 10, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[10].setRotationPoint(-41.5F, 5.5F, 27.0F);
    
    rightTrackWheelModels[11].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[11].setRotationPoint(4.5F, -3.5F, 27.0F);
    
    rightTrackWheelModels[12].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[12].setRotationPoint(-8.5F, -3.5F, 27.0F);
    
    rightTrackWheelModels[13].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[13].setRotationPoint(-17.5F, -3.5F, 27.0F);
    
    rightTrackWheelModels[14].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 10.0F, 4, 4, 16, 10, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[14].setRotationPoint(-30.5F, -3.5F, 27.0F);
    
    rightTrackWheelModels[15].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 10.0F, 10, 10, 36, 10, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[15].setRotationPoint(-51.5F, -0.5F, 27.0F);

    
    leftTrackModel = new ModelRendererTurbo[12];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 215, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 232, 215, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 269, 215, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 307, 215, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 343, 215, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 0, 235, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 195, 235, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 250, 235, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 287, 235, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 325, 235, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 287, 235, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 325, 235, textureX, textureY);
    
    leftTrackModel[0].addBox(0.0F, -2.0F, -12.0F, 104, 2, 12, 0.0F);
    leftTrackModel[0].setRotationPoint(-54.0F, -5.0F, -16.0F);
    
    leftTrackModel[1].addBox(0.0F, 0.0F, -12.0F, 5, 2, 12, 0.0F);
    leftTrackModel[1].setRotationPoint(50.0F, -7.0F, -16.0F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2].addShapeBox(0.0F, 0.0F, -12.0F, 5, 2, 12, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
    leftTrackModel[2].setRotationPoint(53.5F, -3.0F, -16.0F);
    (leftTrackModel[2]).rotateAngleZ = -1.5707964F;
    
    leftTrackModel[3].addShapeBox(-4.0F, -2.0F, -12.0F, 4, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[3].setRotationPoint(53.5F, 2.0F, -16.0F);
    (leftTrackModel[3]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[4].addShapeBox(-13.0F, -2.0F, -12.0F, 12, 2, 12, 0.0F, -0.2F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    leftTrackModel[4].setRotationPoint(51.5F, 4.5F, -16.0F);
    (leftTrackModel[4]).rotateAngleZ = 0.44505897F;
    
    leftTrackModel[5].addBox(0.0F, -2.0F, -12.0F, 84, 2, 12, 0.0F);
    leftTrackModel[5].setRotationPoint(-44.0F, 10.0F, -16.0F);
    
    leftTrackModel[6].addShapeBox(0.0F, -2.0F, -12.0F, 12, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[6].setRotationPoint(-54.5F, 5.0F, -16.0F);
    (leftTrackModel[6]).rotateAngleZ = -0.44505897F;
    
    leftTrackModel[7].addShapeBox(-4.0F, -2.0F, -12.0F, 4, 2, 12, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    leftTrackModel[7].setRotationPoint(-54.5F, 5.0F, -16.0F);
    (leftTrackModel[7]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[8].addShapeBox(0.0F, 2.0F, -12.0F, 5, 2, 12, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
    leftTrackModel[8].setRotationPoint(-53.5F, -3.0F, -16.0F);
    (leftTrackModel[8]).rotateAngleZ = -1.5707964F;
    
    leftTrackModel[9].addBox(-5.0F, 0.0F, -12.0F, 5, 2, 12, 0.0F);
    leftTrackModel[9].setRotationPoint(-54.0F, -7.0F, -16.0F);
    (leftTrackModel[9]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[10].addShapeBox(0.0F, 2.0F, 0.0F, 5, 2, 12, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
    leftTrackModel[10].setRotationPoint(-53.5F, -3.0F, 16.0F);
    (leftTrackModel[10]).rotateAngleZ = -1.5707964F;
    
    leftTrackModel[11].addBox(-5.0F, 0.0F, 0.0F, 5, 2, 12, 0.0F);
    leftTrackModel[11].setRotationPoint(-54.0F, -7.0F, 16.0F);
    (leftTrackModel[11]).rotateAngleZ = 0.7853982F;

    
    rightTrackModel = new ModelRendererTurbo[8];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 215, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 232, 215, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 269, 215, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 307, 215, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 343, 215, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 0, 235, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 195, 235, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 250, 235, textureX, textureY);
    
    rightTrackModel[0].addBox(0.0F, -2.0F, 0.0F, 102, 2, 12, 0.0F);
    rightTrackModel[0].setRotationPoint(-53.0F, -5.0F, 16.0F);
    
    rightTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 5, 2, 12, 0.0F);
    rightTrackModel[1].setRotationPoint(50.0F, -7.0F, 16.0F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 12, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.45F, 0.0F, 0.0F);
    rightTrackModel[2].setRotationPoint(53.5F, -3.0F, 16.0F);
    (rightTrackModel[2]).rotateAngleZ = -1.5707964F;
    
    rightTrackModel[3].addShapeBox(-4.0F, -2.0F, 0.0F, 4, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[3].setRotationPoint(53.5F, 2.0F, 16.0F);
    (rightTrackModel[3]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[4].addShapeBox(-13.0F, -2.0F, 0.0F, 12, 2, 12, 0.0F, -0.2F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    rightTrackModel[4].setRotationPoint(51.5F, 4.5F, 16.0F);
    (rightTrackModel[4]).rotateAngleZ = 0.44505897F;
    
    rightTrackModel[5].addBox(0.0F, -2.0F, 0.0F, 84, 2, 12, 0.0F);
    rightTrackModel[5].setRotationPoint(-44.0F, 10.0F, 16.0F);
    
    rightTrackModel[6].addShapeBox(0.0F, -2.0F, 0.0F, 12, 2, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[6].setRotationPoint(-54.5F, 5.0F, 16.0F);
    (rightTrackModel[6]).rotateAngleZ = -0.44505897F;
    
    rightTrackModel[7].addShapeBox(-4.0F, -2.0F, 0.0F, 4, 2, 12, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    rightTrackModel[7].setRotationPoint(-54.5F, 5.0F, 16.0F);
    (rightTrackModel[7]).rotateAngleZ = -0.7853982F;

    
    ModelRendererTurbo[][] turretGun = new ModelRendererTurbo[3][];

    
    turretGun[0] = new ModelRendererTurbo[36];
    turretGun[0][0] = new ModelRendererTurbo(this, 167, 471, textureX, textureY);
    turretGun[0][1] = new ModelRendererTurbo(this, 169, 491, textureX, textureY);
    turretGun[0][2] = new ModelRendererTurbo(this, 220, 471, textureX, textureY);
    turretGun[0][3] = new ModelRendererTurbo(this, 266, 471, textureX, textureY);
    turretGun[0][4] = new ModelRendererTurbo(this, 220, 491, textureX, textureY);
    turretGun[0][5] = new ModelRendererTurbo(this, 267, 492, textureX, textureY);
    turretGun[0][6] = new ModelRendererTurbo(this, 250, 491, textureX, textureY);
    turretGun[0][7] = new ModelRendererTurbo(this, 267, 447, textureX, textureY);
    turretGun[0][8] = new ModelRendererTurbo(this, 305, 450, textureX, textureY);
    turretGun[0][9] = new ModelRendererTurbo(this, 229, 450, textureX, textureY);
    turretGun[0][10] = new ModelRendererTurbo(this, 300, 471, textureX, textureY);
    turretGun[0][11] = new ModelRendererTurbo(this, 323, 471, textureX, textureY);
    turretGun[0][12] = new ModelRendererTurbo(this, 304, 493, textureX, textureY);
    turretGun[0][13] = new ModelRendererTurbo(this, 321, 493, textureX, textureY);
    turretGun[0][14] = new ModelRendererTurbo(this, 340, 493, textureX, textureY);
    turretGun[0][15] = new ModelRendererTurbo(this, 338, 493, textureX, textureY);
    turretGun[0][16] = new ModelRendererTurbo(this, 338, 486, textureX, textureY);
    turretGun[0][17] = new ModelRendererTurbo(this, 348, 486, textureX, textureY);
    turretGun[0][18] = new ModelRendererTurbo(this, 358, 486, textureX, textureY);
    turretGun[0][19] = new ModelRendererTurbo(this, 358, 486, textureX, textureY);
    turretGun[0][20] = new ModelRendererTurbo(this, 358, 486, textureX, textureY);
    turretGun[0][21] = new ModelRendererTurbo(this, 338, 476, textureX, textureY);
    turretGun[0][22] = new ModelRendererTurbo(this, 338, 472, textureX, textureY);
    turretGun[0][23] = new ModelRendererTurbo(this, 338, 467, textureX, textureY);
    turretGun[0][24] = new ModelRendererTurbo(this, 338, 472, textureX, textureY);
    turretGun[0][25] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
    turretGun[0][26] = new ModelRendererTurbo(this, 35, 466, textureX, textureY);
    turretGun[0][27] = new ModelRendererTurbo(this, 0, 453, textureX, textureY);
    turretGun[0][28] = new ModelRendererTurbo(this, 0, 466, textureX, textureY);
    turretGun[0][29] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    turretGun[0][30] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    turretGun[0][31] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    turretGun[0][32] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    turretGun[0][33] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    turretGun[0][34] = new ModelRendererTurbo(this, 0, 475, textureX, textureY);
    turretGun[0][35] = new ModelRendererTurbo(this, 338, 459, textureX, textureY);
    
    turretGun[0][0].addShapeBox(-3.5F, 2.0F, -8.5F, 7, 1, 17, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][0].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][1].addShapeBox(3.5F, 2.0F, -8.5F, 5, 1, 17, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -5.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][1].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][2].addShapeBox(-8.5F, 2.0F, -8.5F, 5, 1, 17, 0.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F);
    turretGun[0][2].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][3].addShapeBox(-3.5F, -2.0F, -7.5F, 7, 4, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][3].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][4].addShapeBox(3.5F, -8.0F, -7.5F, 2, 4, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][4].setRotationPoint(-11.5F, -28.0F, -20.5F);
    
    turretGun[0][5].addShapeBox(-7.5F, -2.0F, -7.5F, 4, 4, 15, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    turretGun[0][5].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][6].addShapeBox(5.5F, -2.0F, -5.5F, 2, 4, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][6].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][7].addShapeBox(-3.5F, -3.0F, -7.5F, 7, 1, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][7].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][8].addShapeBox(3.5F, -3.0F, -7.5F, 2, 1, 15, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][8].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][9].addShapeBox(-7.5F, -3.0F, -7.5F, 4, 1, 15, 0.0F, -0.5F, 0.0F, -4.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -2.5F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    turretGun[0][9].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][10].addShapeBox(5.5F, -3.0F, -5.5F, 2, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][10].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][11].addShapeBox(4.5F, -2.0F, -7.5F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][11].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][12].addShapeBox(6.5F, -2.0F, -7.5F, 1, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][12].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][13].addShapeBox(3.5F, -2.0F, -7.5F, 1, 4, 6, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    turretGun[0][13].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][14].addShapeBox(7.5F, 1.5F, -5.5F, 3, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    turretGun[0][14].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][15].addShapeBox(7.5F, -2.0F, -5.5F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
    turretGun[0][15].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][16].addShapeBox(7.5F, -2.0F, 2.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
    turretGun[0][16].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][17].addShapeBox(7.5F, -2.0F, -1.75F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
    turretGun[0][17].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][18].addShapeBox(10.0F, -2.0F, -2.25F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
    turretGun[0][18].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][19].addShapeBox(10.0F, -2.0F, -5.25F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
    turretGun[0][19].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][20].addShapeBox(10.0F, -2.0F, 0.75F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F);
    turretGun[0][20].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][21].addShapeBox(-4.5F, -3.3F, -1.5F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][21].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][22].addShapeBox(-3.5F, -3.5F, -2.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][22].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][23].addShapeBox(-0.5F, -5.0F, 1.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][23].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][24].addShapeBox(1.5F, -3.5F, -2.5F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][24].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][25].addBox(4.0F, -1.5F, 7.5F, 3, 2, 4, 0.0F);
    turretGun[0][25].setRotationPoint(-11.5F, -34.0F, -20.5F);
    (turretGun[0][25]).rotateAngleZ = 0.17453294F;
    
    turretGun[0][26].addShapeBox(3.5F, -4.0F, 7.5F, 1, 6, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F);
    turretGun[0][26].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[0][27].addShapeBox(4.0F, -3.5F, 7.5F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][27].setRotationPoint(-11.5F, -34.0F, -20.5F);
    (turretGun[0][27]).rotateAngleZ = 0.17453294F;
    
    turretGun[0][28].addShapeBox(4.0F, 0.5F, 7.5F, 3, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[0][28].setRotationPoint(-11.5F, -34.0F, -20.5F);
    (turretGun[0][28]).rotateAngleZ = 0.17453294F;
    
    turretGun[0][29].addBox(7.0F, -1.0F, 8.0F, 2, 1, 1, 0.0F);
    turretGun[0][29].setRotationPoint(-11.5F, -34.0F, -20.5F);
    (turretGun[0][29]).rotateAngleZ = 0.17453294F;
    
    turretGun[0][30].addBox(7.0F, -1.0F, 10.0F, 2, 1, 1, 0.0F);
    turretGun[0][30].setRotationPoint(-11.5F, -34.0F, -20.5F);
    (turretGun[0][30]).rotateAngleZ = 0.17453294F;
    
    turretGun[0][31].addShapeBox(6.1F, -3.0F, 8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F);
    turretGun[0][31].setRotationPoint(-11.5F, -34.0F, -20.5F);
    (turretGun[0][31]).rotateAngleZ = 0.17453294F;
    
    turretGun[0][32].addShapeBox(6.6F, -3.0F, 10.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F);
    turretGun[0][32].setRotationPoint(-11.5F, -34.0F, -20.5F);
    (turretGun[0][32]).rotateAngleZ = 0.17453294F;
    
    turretGun[0][33].addShapeBox(6.1F, 1.0F, 10.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F);
    turretGun[0][33].setRotationPoint(-11.5F, -34.0F, -20.5F);
    (turretGun[0][33]).rotateAngleZ = 0.17453294F;
    
    turretGun[0][34].addShapeBox(6.6F, 1.0F, 8.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F);
    turretGun[0][34].setRotationPoint(-11.5F, -34.0F, -20.5F);
    (turretGun[0][34]).rotateAngleZ = 0.17453294F;
    
    turretGun[0][35].addBox(4.5F, -2.0F, 5.5F, 1, 1, 2, 0.0F);
    turretGun[0][35].setRotationPoint(-11.5F, -34.0F, -20.5F);

    
    turretGun[1] = new ModelRendererTurbo[2];
    turretGun[1][0] = new ModelRendererTurbo(this, 315, 485, textureX, textureY);
    turretGun[1][1] = new ModelRendererTurbo(this, 315, 485, textureX, textureY);
    
    turretGun[1][0].addShapeBox(6.0F, -1.5F, -3.5F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[1][0].setRotationPoint(-11.5F, -34.0F, -20.5F);
    
    turretGun[1][1].addShapeBox(6.0F, -1.5F, -0.5F, 7, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretGun[1][1].setRotationPoint(-11.5F, -34.0F, -20.5F);

    
    for (ModelRendererTurbo gunPart : turretGun[1]) {
      gunPart.setRotationPoint(-11.5F, -34.0F, -20.5F);
    }
    
    turretGun[2] = new ModelRendererTurbo[0];
    
    registerGunModel("Browning", turretGun);
    
    translateAll(-27.0F, 0.0F, 0.0F);

    
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
		for(int i = 0; i < steeringWheelModel.length; i++)
		{
			steeringWheelModel[i].render(f5);
		}
	}
}
