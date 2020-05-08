package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelT35
  extends ModelVehicle {
  int textureX = 1024;
  int textureY = 512;

  
  public ModelT35() {
    bodyModel = new ModelRendererTurbo[240];
    bodyModel[0] = new ModelRendererTurbo(this, 0, 1, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 289, 1, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 369, 1, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 449, 1, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 545, 1, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 641, 1, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 753, 1, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 849, 1, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 1, 2, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 937, 1, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 257, 1, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 257, 1, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 281, 49, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 337, 1, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 289, 1, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 377, 1, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 417, 1, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 513, 1, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 601, 49, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 609, 1, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 721, 1, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 553, 1, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 817, 1, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 905, 1, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 905, 41, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 945, 49, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 985, 1, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 337, 17, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 25, 1, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 337, 1, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 1, 57, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 57, 57, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 113, 57, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 169, 57, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 225, 57, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 249, 65, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 513, 17, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 817, 17, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 361, 1, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 641, 1, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 657, 1, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 417, 17, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 609, 17, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 721, 17, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 17, 1, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 393, 1, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 513, 1, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 905, 17, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 545, 1, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 569, 1, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 721, 1, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 289, 65, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 745, 1, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 761, 1, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 937, 1, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 641, 9, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 1, 17, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 753, 9, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 945, 9, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 769, 1, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 865, 1, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 753, 1, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 865, 9, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 17, 9, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 905, 1, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 257, 17, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 289, 17, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 385, 9, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 393, 9, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 569, 9, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 649, 1, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 513, 17, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 545, 17, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 961, 9, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 305, 17, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 313, 17, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 377, 17, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 817, 17, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 849, 17, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 985, 17, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 945, 41, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 993, 41, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 33, 57, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 89, 57, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 145, 57, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 201, 57, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 585, 57, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 905, 57, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 945, 57, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 993, 57, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 49, 65, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 777, 17, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 961, 17, textureX, textureY);
    bodyModel[94] = new ModelRendererTurbo(this, 297, 65, textureX, textureY);
    bodyModel[95] = new ModelRendererTurbo(this, 409, 65, textureX, textureY);
    bodyModel[96] = new ModelRendererTurbo(this, 105, 65, textureX, textureY);
    bodyModel[97] = new ModelRendererTurbo(this, 161, 65, textureX, textureY);
    bodyModel[98] = new ModelRendererTurbo(this, 217, 65, textureX, textureY);
    bodyModel[99] = new ModelRendererTurbo(this, 361, 65, textureX, textureY);
    bodyModel[100] = new ModelRendererTurbo(this, 385, 65, textureX, textureY);
    bodyModel[101] = new ModelRendererTurbo(this, 409, 65, textureX, textureY);
    bodyModel[102] = new ModelRendererTurbo(this, 473, 65, textureX, textureY);
    bodyModel[103] = new ModelRendererTurbo(this, 505, 65, textureX, textureY);
    bodyModel[104] = new ModelRendererTurbo(this, 433, 65, textureX, textureY);
    bodyModel[105] = new ModelRendererTurbo(this, 537, 65, textureX, textureY);
    bodyModel[106] = new ModelRendererTurbo(this, 609, 65, textureX, textureY);
    bodyModel[107] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY);
    bodyModel[108] = new ModelRendererTurbo(this, 721, 25, textureX, textureY);
    bodyModel[109] = new ModelRendererTurbo(this, 633, 65, textureX, textureY);
    bodyModel[110] = new ModelRendererTurbo(this, 1, 57, textureX, textureY);
    bodyModel[111] = new ModelRendererTurbo(this, 665, 65, textureX, textureY);
    bodyModel[112] = new ModelRendererTurbo(this, 905, 25, textureX, textureY);
    bodyModel[113] = new ModelRendererTurbo(this, 689, 65, textureX, textureY);
    bodyModel[114] = new ModelRendererTurbo(this, 721, 65, textureX, textureY);
    bodyModel[115] = new ModelRendererTurbo(this, 569, 65, textureX, textureY);
    bodyModel[116] = new ModelRendererTurbo(this, 753, 65, textureX, textureY);
    bodyModel[117] = new ModelRendererTurbo(this, 257, 57, textureX, textureY);
    bodyModel[118] = new ModelRendererTurbo(this, 785, 65, textureX, textureY);
    bodyModel[119] = new ModelRendererTurbo(this, 289, 41, textureX, textureY);
    bodyModel[120] = new ModelRendererTurbo(this, 809, 65, textureX, textureY);
    bodyModel[121] = new ModelRendererTurbo(this, 841, 65, textureX, textureY);
    bodyModel[122] = new ModelRendererTurbo(this, 865, 65, textureX, textureY);
    bodyModel[123] = new ModelRendererTurbo(this, 329, 41, textureX, textureY);
    bodyModel[124] = new ModelRendererTurbo(this, 585, 73, textureX, textureY);
    bodyModel[125] = new ModelRendererTurbo(this, 881, 73, textureX, textureY);
    bodyModel[126] = new ModelRendererTurbo(this, 849, 73, textureX, textureY);
    bodyModel[127] = new ModelRendererTurbo(this, 1, 81, textureX, textureY);
    bodyModel[128] = new ModelRendererTurbo(this, 33, 81, textureX, textureY);
    bodyModel[129] = new ModelRendererTurbo(this, 57, 81, textureX, textureY);
    bodyModel[130] = new ModelRendererTurbo(this, 449, 41, textureX, textureY);
    bodyModel[131] = new ModelRendererTurbo(this, 81, 81, textureX, textureY);
    bodyModel[132] = new ModelRendererTurbo(this, 113, 81, textureX, textureY);
    bodyModel[133] = new ModelRendererTurbo(this, 137, 81, textureX, textureY);
    bodyModel[134] = new ModelRendererTurbo(this, 489, 41, textureX, textureY);
    bodyModel[135] = new ModelRendererTurbo(this, 161, 81, textureX, textureY);
    bodyModel[136] = new ModelRendererTurbo(this, 193, 81, textureX, textureY);
    bodyModel[137] = new ModelRendererTurbo(this, 225, 81, textureX, textureY);
    bodyModel[138] = new ModelRendererTurbo(this, 361, 81, textureX, textureY);
    bodyModel[139] = new ModelRendererTurbo(this, 385, 81, textureX, textureY);
    bodyModel[140] = new ModelRendererTurbo(this, 417, 81, textureX, textureY);
    bodyModel[141] = new ModelRendererTurbo(this, 249, 81, textureX, textureY);
    bodyModel[142] = new ModelRendererTurbo(this, 473, 81, textureX, textureY);
    bodyModel[143] = new ModelRendererTurbo(this, 497, 81, textureX, textureY);
    bodyModel[144] = new ModelRendererTurbo(this, 961, 41, textureX, textureY);
    bodyModel[145] = new ModelRendererTurbo(this, 521, 81, textureX, textureY);
    bodyModel[146] = new ModelRendererTurbo(this, 553, 81, textureX, textureY);
    bodyModel[147] = new ModelRendererTurbo(this, 609, 81, textureX, textureY);
    bodyModel[148] = new ModelRendererTurbo(this, 633, 81, textureX, textureY);
    bodyModel[149] = new ModelRendererTurbo(this, 657, 81, textureX, textureY);
    bodyModel[150] = new ModelRendererTurbo(this, 681, 81, textureX, textureY);
    bodyModel[151] = new ModelRendererTurbo(this, 705, 81, textureX, textureY);
    bodyModel[152] = new ModelRendererTurbo(this, 729, 81, textureX, textureY);
    bodyModel[153] = new ModelRendererTurbo(this, 761, 81, textureX, textureY);
    bodyModel[154] = new ModelRendererTurbo(this, 793, 81, textureX, textureY);
    bodyModel[155] = new ModelRendererTurbo(this, 817, 81, textureX, textureY);
    bodyModel[156] = new ModelRendererTurbo(this, 913, 81, textureX, textureY);
    bodyModel[157] = new ModelRendererTurbo(this, 313, 89, textureX, textureY);
    bodyModel[158] = new ModelRendererTurbo(this, 521, 89, textureX, textureY);
    bodyModel[159] = new ModelRendererTurbo(this, 577, 89, textureX, textureY);
    bodyModel[160] = new ModelRendererTurbo(this, 841, 89, textureX, textureY);
    bodyModel[161] = new ModelRendererTurbo(this, 865, 89, textureX, textureY);
    bodyModel[162] = new ModelRendererTurbo(this, 937, 89, textureX, textureY);
    bodyModel[163] = new ModelRendererTurbo(this, 41, 89, textureX, textureY);
    bodyModel[164] = new ModelRendererTurbo(this, 969, 89, textureX, textureY);
    bodyModel[165] = new ModelRendererTurbo(this, 1, 97, textureX, textureY);
    bodyModel[166] = new ModelRendererTurbo(this, 65, 97, textureX, textureY);
    bodyModel[167] = new ModelRendererTurbo(this, 897, 89, textureX, textureY);
    bodyModel[168] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY);
    bodyModel[169] = new ModelRendererTurbo(this, 97, 97, textureX, textureY);
    bodyModel[170] = new ModelRendererTurbo(this, 129, 97, textureX, textureY);
    bodyModel[171] = new ModelRendererTurbo(this, 153, 97, textureX, textureY);
    bodyModel[172] = new ModelRendererTurbo(this, 177, 97, textureX, textureY);
    bodyModel[173] = new ModelRendererTurbo(this, 217, 97, textureX, textureY);
    bodyModel[174] = new ModelRendererTurbo(this, 481, 89, textureX, textureY);
    bodyModel[175] = new ModelRendererTurbo(this, 249, 97, textureX, textureY);
    bodyModel[176] = new ModelRendererTurbo(this, 281, 97, textureX, textureY);
    bodyModel[177] = new ModelRendererTurbo(this, 361, 97, textureX, textureY);
    bodyModel[178] = new ModelRendererTurbo(this, 393, 97, textureX, textureY);
    bodyModel[179] = new ModelRendererTurbo(this, 417, 97, textureX, textureY);
    bodyModel[180] = new ModelRendererTurbo(this, 545, 97, textureX, textureY);
    bodyModel[181] = new ModelRendererTurbo(this, 441, 97, textureX, textureY);
    bodyModel[182] = new ModelRendererTurbo(this, 593, 97, textureX, textureY);
    bodyModel[183] = new ModelRendererTurbo(this, 617, 97, textureX, textureY);
    bodyModel[184] = new ModelRendererTurbo(this, 657, 97, textureX, textureY);
    bodyModel[185] = new ModelRendererTurbo(this, 921, 89, textureX, textureY);
    bodyModel[186] = new ModelRendererTurbo(this, 497, 97, textureX, textureY);
    bodyModel[187] = new ModelRendererTurbo(this, 689, 97, textureX, textureY);
    bodyModel[188] = new ModelRendererTurbo(this, 721, 97, textureX, textureY);
    bodyModel[189] = new ModelRendererTurbo(this, 753, 97, textureX, textureY);
    bodyModel[190] = new ModelRendererTurbo(this, 777, 97, textureX, textureY);
    bodyModel[191] = new ModelRendererTurbo(this, 801, 97, textureX, textureY);
    bodyModel[192] = new ModelRendererTurbo(this, 865, 97, textureX, textureY);
    bodyModel[193] = new ModelRendererTurbo(this, 945, 97, textureX, textureY);
    bodyModel[194] = new ModelRendererTurbo(this, 177, 105, textureX, textureY);
    bodyModel[195] = new ModelRendererTurbo(this, 617, 105, textureX, textureY);
    bodyModel[196] = new ModelRendererTurbo(this, 905, 97, textureX, textureY);
    bodyModel[197] = new ModelRendererTurbo(this, 25, 105, textureX, textureY);
    bodyModel[198] = new ModelRendererTurbo(this, 49, 105, textureX, textureY);
    bodyModel[199] = new ModelRendererTurbo(this, 137, 105, textureX, textureY);
    bodyModel[200] = new ModelRendererTurbo(this, 209, 105, textureX, textureY);
    bodyModel[201] = new ModelRendererTurbo(this, 233, 105, textureX, textureY);
    bodyModel[202] = new ModelRendererTurbo(this, 881, 105, textureX, textureY);
    bodyModel[203] = new ModelRendererTurbo(this, 817, 17, textureX, textureY);
    bodyModel[204] = new ModelRendererTurbo(this, 1, 113, textureX, textureY);
    bodyModel[205] = new ModelRendererTurbo(this, 833, 17, textureX, textureY);
    bodyModel[206] = new ModelRendererTurbo(this, 953, 137, textureX, textureY);
    bodyModel[207] = new ModelRendererTurbo(this, 97, 137, textureX, textureY);
    bodyModel[208] = new ModelRendererTurbo(this, 129, 153, textureX, textureY);
    bodyModel[209] = new ModelRendererTurbo(this, 433, 137, textureX, textureY);
    bodyModel[210] = new ModelRendererTurbo(this, 921, 49, textureX, textureY);
    bodyModel[211] = new ModelRendererTurbo(this, 1, 145, textureX, textureY);
    bodyModel[212] = new ModelRendererTurbo(this, 857, 137, textureX, textureY);
    bodyModel[213] = new ModelRendererTurbo(this, 473, 153, textureX, textureY);
    bodyModel[214] = new ModelRendererTurbo(this, 817, 145, textureX, textureY);
    bodyModel[215] = new ModelRendererTurbo(this, 65, 57, textureX, textureY);
    bodyModel[216] = new ModelRendererTurbo(this, 849, 17, textureX, textureY);
    bodyModel[217] = new ModelRendererTurbo(this, 985, 17, textureX, textureY);
    bodyModel[218] = new ModelRendererTurbo(this, 1017, 33, textureX, textureY);
    bodyModel[219] = new ModelRendererTurbo(this, 945, 41, textureX, textureY);
    bodyModel[220] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY);
    bodyModel[221] = new ModelRendererTurbo(this, 585, 49, textureX, textureY);
    bodyModel[222] = new ModelRendererTurbo(this, 601, 49, textureX, textureY);
    bodyModel[223] = new ModelRendererTurbo(this, 121, 57, textureX, textureY);
    bodyModel[224] = new ModelRendererTurbo(this, 905, 49, textureX, textureY);
    bodyModel[225] = new ModelRendererTurbo(this, 33, 57, textureX, textureY);
    bodyModel[226] = new ModelRendererTurbo(this, 49, 57, textureX, textureY);
    bodyModel[227] = new ModelRendererTurbo(this, 89, 57, textureX, textureY);
    bodyModel[228] = new ModelRendererTurbo(this, 105, 57, textureX, textureY);
    bodyModel[229] = new ModelRendererTurbo(this, 145, 57, textureX, textureY);
    bodyModel[230] = new ModelRendererTurbo(this, 161, 57, textureX, textureY);
    bodyModel[231] = new ModelRendererTurbo(this, 65, 145, textureX, textureY);
    bodyModel[232] = new ModelRendererTurbo(this, 889, 145, textureX, textureY);
    bodyModel[233] = new ModelRendererTurbo(this, 177, 57, textureX, textureY);
    bodyModel[234] = new ModelRendererTurbo(this, 185, 57, textureX, textureY);
    bodyModel[235] = new ModelRendererTurbo(this, 273, 153, textureX, textureY);
    bodyModel[236] = new ModelRendererTurbo(this, 889, 145, textureX, textureY);
    bodyModel[237] = new ModelRendererTurbo(this, 377, 153, textureX, textureY);
    bodyModel[238] = new ModelRendererTurbo(this, 345, 153, textureX, textureY);
    bodyModel[239] = new ModelRendererTurbo(this, 649, 153, textureX, textureY);
    
    bodyModel[0].addBox(-56.0F, 0.0F, -16.0F, 111, 21, 32, 0.0F);
    bodyModel[0].setRotationPoint(-17.0F, -20.0F, 0.0F);
    
    bodyModel[1].addShapeBox(0.0F, 0.0F, -16.0F, 4, 7, 32, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(38.0F, -20.0F, 0.0F);
    
    bodyModel[2].addBox(0.0F, 0.0F, -16.0F, 4, 14, 32, 0.0F);
    bodyModel[2].setRotationPoint(38.0F, -13.0F, 0.0F);
    
    bodyModel[3].addShapeBox(0.0F, 0.0F, -16.0F, 12, 4, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[3].setRotationPoint(42.0F, -13.0F, 0.0F);
    
    bodyModel[4].addShapeBox(0.0F, 0.0F, -16.0F, 12, 10, 32, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -9.0F, 0.0F, -1.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[4].setRotationPoint(42.0F, -9.0F, 0.0F);
    
    bodyModel[5].addShapeBox(0.0F, 0.0F, -16.0F, 21, 13, 32, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[5].setRotationPoint(-94.0F, -20.0F, 0.0F);
    
    bodyModel[6].addShapeBox(0.0F, 0.0F, -16.0F, 13, 8, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[6].setRotationPoint(-86.0F, -7.0F, 0.0F);
    
    bodyModel[7].addShapeBox(0.0F, 0.0F, -16.0F, 8, 8, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
    bodyModel[7].setRotationPoint(-94.0F, -7.0F, 0.0F);
    
    bodyModel[8].addShapeBox(0.0F, 0.0F, -16.0F, 4, 5, 5, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[8].setRotationPoint(-98.0F, -12.0F, 0.0F);
    
    bodyModel[9].addShapeBox(0.0F, 0.0F, -16.0F, 4, 5, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
    bodyModel[9].setRotationPoint(-98.0F, -7.0F, 0.0F);
    
    bodyModel[10].addShapeBox(0.0F, 0.0F, 11.0F, 4, 5, 5, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[10].setRotationPoint(-98.0F, -12.0F, 0.0F);
    
    bodyModel[11].addShapeBox(0.0F, 0.0F, -11.0F, 4, 5, 22, 0.0F, -4.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[11].setRotationPoint(-98.0F, -12.0F, 0.0F);
    
    bodyModel[12].addBox(-75.0F, 0.0F, 0.0F, 146, 1, 10, 0.0F);
    bodyModel[12].setRotationPoint(-19.0F, -20.0F, 16.0F);
    
    bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 6, 1, 10, 0.0F);
    bodyModel[13].setRotationPoint(52.0F, -20.0F, 16.0F);
    (bodyModel[13]).rotateAngleZ = -0.5235988F;
    
    bodyModel[14].addShapeBox(0.0F, 0.0F, -1.0F, 14, 10, 1, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -3.0F, -0.8F, 0.0F, -0.5F, -0.8F, 0.0F, -0.5F, 0.0F, -4.0F, -3.0F, 0.0F);
    bodyModel[14].setRotationPoint(38.0F, -20.0F, 16.0F);
    
    bodyModel[15].addShapeBox(0.0F, 0.0F, -1.0F, 5, 10, 1, 0.0F, 0.0F, 0.0F, -0.8F, 0.2F, -3.0F, -0.8F, 0.2F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.8F, -3.0F, 0.0F, -0.8F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[15].setRotationPoint(52.0F, -20.0F, 16.0F);
    
    bodyModel[16].addShapeBox(0.0F, 0.0F, -1.0F, 21, 8, 1, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, -7.9F, -0.8F, 0.0F, -7.9F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[16].setRotationPoint(-94.0F, -20.0F, 16.0F);
    
    bodyModel[17].addBox(-9.0F, 0.0F, 0.0F, 9, 1, 10, 0.0F);
    bodyModel[17].setRotationPoint(-94.0F, -20.0F, 16.0F);
    (bodyModel[17]).rotateAngleZ = 0.715585F;
    
    bodyModel[18].addShapeBox(-1.0F, 0.0F, -1.0F, 5, 11, 1, 0.0F, 1.8F, -5.9F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 1.8F, -5.9F, 0.0F, -2.0F, -0.7F, -0.8F, 0.0F, -3.0F, -0.8F, 0.0F, -3.0F, 0.0F, -2.0F, -0.7F, 0.0F);
    bodyModel[18].setRotationPoint(-98.0F, -20.0F, 16.0F);
    
    bodyModel[19].addBox(-75.0F, 0.0F, -10.0F, 146, 1, 10, 0.0F);
    bodyModel[19].setRotationPoint(-19.0F, -20.0F, -16.0F);
    
    bodyModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 14, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, -4.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.8F, -4.0F, -3.0F, -0.8F);
    bodyModel[20].setRotationPoint(38.0F, -20.0F, -16.0F);
    
    bodyModel[21].addBox(0.0F, 0.0F, -10.0F, 6, 1, 10, 0.0F);
    bodyModel[21].setRotationPoint(52.0F, -20.0F, -16.0F);
    (bodyModel[21]).rotateAngleZ = -0.5235988F;
    
    bodyModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 5, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, -3.0F, 0.0F, 0.2F, -3.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.8F, 0.0F, -0.5F, -0.8F);
    bodyModel[22].setRotationPoint(52.0F, -20.0F, -16.0F);
    
    bodyModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 21, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -7.9F, 0.0F, 0.0F, -7.9F, -0.8F, 0.0F, 0.0F, -0.8F);
    bodyModel[23].setRotationPoint(-94.0F, -20.0F, -16.0F);
    
    bodyModel[24].addBox(-9.0F, 0.0F, -10.0F, 9, 1, 10, 0.0F);
    bodyModel[24].setRotationPoint(-94.0F, -20.0F, -16.0F);
    (bodyModel[24]).rotateAngleZ = 0.715585F;
    
    bodyModel[25].addShapeBox(0.0F, 0.0F, -15.0F, 2, 2, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[25].setRotationPoint(-75.0F, -21.0F, 0.0F);
    
    bodyModel[26].addShapeBox(0.0F, 0.0F, -15.0F, 6, 7, 30, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[26].setRotationPoint(-96.0F, -19.0F, 0.0F);
    
    bodyModel[27].addShapeBox(0.0F, 0.0F, -15.0F, 15, 7, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[27].setRotationPoint(-90.0F, -21.0F, 0.0F);
    
    bodyModel[28].addShapeBox(0.0F, 0.0F, 11.0F, 15, 7, 4, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[28].setRotationPoint(-90.0F, -21.0F, 0.0F);
    
    bodyModel[29].addShapeBox(0.5F, -1.0F, -14.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[29].setRotationPoint(-96.0F, -12.0F, 0.0F);
    
    bodyModel[30].addShapeBox(0.5F, -1.0F, 12.0F, 1, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[30].setRotationPoint(-96.0F, -12.0F, 0.0F);
    
    bodyModel[31].addShapeBox(-2.0F, 0.0F, -22.0F, 3, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[31].setRotationPoint(-76.0F, -21.0F, 11.0F);
    (bodyModel[31]).rotateAngleZ = -0.61086524F;
    
    bodyModel[32].addShapeBox(-2.0F, 0.0F, -22.0F, 3, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[32].setRotationPoint(-79.0F, -20.5F, 11.0F);
    (bodyModel[32]).rotateAngleZ = -0.61086524F;
    
    bodyModel[33].addShapeBox(-2.0F, 0.0F, -22.0F, 3, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[33].setRotationPoint(-82.0F, -20.0F, 11.0F);
    (bodyModel[33]).rotateAngleZ = -0.61086524F;
    
    bodyModel[34].addShapeBox(-2.0F, 0.0F, -22.0F, 3, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[34].setRotationPoint(-85.0F, -19.5F, 11.0F);
    (bodyModel[34]).rotateAngleZ = -0.61086524F;
    
    bodyModel[35].addShapeBox(-2.0F, 0.0F, -22.0F, 3, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[35].setRotationPoint(-88.0F, -19.0F, 11.0F);
    (bodyModel[35]).rotateAngleZ = -0.61086524F;
    
    bodyModel[36].addShapeBox(0.0F, 0.0F, -14.0F, 3, 2, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[36].setRotationPoint(-72.0F, -22.0F, 0.0F);
    
    bodyModel[37].addShapeBox(0.0F, 0.0F, -14.0F, 1, 2, 28, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[37].setRotationPoint(-73.0F, -22.0F, 0.0F);
    
    bodyModel[38].addShapeBox(0.0F, 0.0F, -14.0F, 1, 2, 28, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[38].setRotationPoint(-69.0F, -22.0F, 0.0F);
    
    bodyModel[39].addShapeBox(-4.0F, -1.0F, -1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[39].setRotationPoint(-72.0F, -21.0F, 0.0F);
    (bodyModel[39]).rotateAngleZ = -0.6981317F;
    
    bodyModel[40].addShapeBox(0.0F, 0.0F, 14.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[40].setRotationPoint(-72.0F, -22.0F, 0.0F);
    
    bodyModel[41].addShapeBox(0.0F, 0.0F, -16.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[41].setRotationPoint(-72.0F, -22.0F, 0.0F);
    
    bodyModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 23, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[42].setRotationPoint(-66.0F, -22.0F, 8.0F);
    
    bodyModel[43].addShapeBox(0.0F, 0.0F, -8.0F, 23, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[43].setRotationPoint(-66.0F, -22.0F, -8.0F);
    
    bodyModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 23, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F);
    bodyModel[44].setRotationPoint(-66.0F, -22.0F, 16.0F);
    
    bodyModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.0F, -0.1F, 0.0F, -0.9F, -0.1F, 0.0F, -0.9F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F);
    bodyModel[45].setRotationPoint(-66.0F, -22.0F, 16.0F);
    
    bodyModel[46].addShapeBox(-1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, -0.9F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.9F, -0.1F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.9F, -1.5F, 0.0F);
    bodyModel[46].setRotationPoint(-43.0F, -22.0F, 16.0F);
    
    bodyModel[47].addShapeBox(-1.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, -0.9F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.9F, -0.1F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -0.9F, -1.5F, 0.0F);
    bodyModel[47].setRotationPoint(-54.5F, -22.0F, 16.0F);
    
    bodyModel[48].addShapeBox(0.0F, 0.0F, -2.0F, 23, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F);
    bodyModel[48].setRotationPoint(-66.0F, -22.0F, -16.0F);
    
    bodyModel[49].addShapeBox(0.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, 0.0F, -0.1F, 0.0F, -0.9F, -0.1F, 0.0F, -0.9F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -1.5F, 0.0F, -0.9F, -1.5F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[49].setRotationPoint(-66.0F, -22.0F, -16.0F);
    
    bodyModel[50].addShapeBox(-1.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, -0.9F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.9F, -0.1F, 0.0F, -0.9F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
    bodyModel[50].setRotationPoint(-54.5F, -22.0F, -16.0F);
    
    bodyModel[51].addShapeBox(-1.0F, 0.0F, -2.0F, 1, 2, 2, 0.0F, -0.9F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.9F, -0.1F, 0.0F, -0.9F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
    bodyModel[51].setRotationPoint(-43.0F, -22.0F, -16.0F);
    
    bodyModel[52].addShapeBox(0.0F, 0.0F, -7.0F, 14, 2, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[52].setRotationPoint(-62.0F, -20.5F, 0.0F);
    
    bodyModel[53].addShapeBox(-2.0F, 0.0F, -6.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[53].setRotationPoint(-48.0F, -21.0F, 0.0F);
    
    bodyModel[54].addShapeBox(-2.0F, 0.0F, 5.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[54].setRotationPoint(-48.0F, -21.0F, 0.0F);
    
    bodyModel[55].addShapeBox(0.0F, 0.0F, -2.0F, 10, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[55].setRotationPoint(-60.0F, -21.0F, 0.0F);
    
    bodyModel[56].addShapeBox(0.0F, 0.0F, 2.0F, 10, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[56].setRotationPoint(-60.0F, -21.0F, 0.0F);
    
    bodyModel[57].addShapeBox(0.0F, 0.0F, -5.0F, 10, 1, 3, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[57].setRotationPoint(-60.0F, -21.0F, 0.0F);
    
    bodyModel[58].addShapeBox(0.0F, 0.0F, 0.5F, 4, 2, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
    bodyModel[58].setRotationPoint(-68.0F, -21.0F, 0.0F);
    
    bodyModel[59].addShapeBox(0.0F, 0.0F, -4.5F, 4, 2, 4, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
    bodyModel[59].setRotationPoint(-68.0F, -21.0F, 0.0F);
    
    bodyModel[60].addShapeBox(0.0F, -3.0F, -5.5F, 2, 4, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
    bodyModel[60].setRotationPoint(42.0F, -13.0F, 0.0F);
    
    bodyModel[61].addShapeBox(0.0F, -5.0F, -5.5F, 2, 2, 4, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
    bodyModel[61].setRotationPoint(42.0F, -13.0F, 0.0F);
    
    bodyModel[62].addShapeBox(1.1F, -4.0F, -5.0F, 1, 3, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[62].setRotationPoint(42.0F, -13.0F, 0.0F);
    
    bodyModel[63].addShapeBox(0.0F, -3.0F, 1.5F, 2, 4, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
    bodyModel[63].setRotationPoint(42.0F, -13.0F, 0.0F);
    
    bodyModel[64].addShapeBox(0.0F, -5.0F, 1.5F, 2, 2, 4, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
    bodyModel[64].setRotationPoint(42.0F, -13.0F, 0.0F);
    
    bodyModel[65].addShapeBox(1.1F, -4.0F, 2.0F, 1, 3, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[65].setRotationPoint(42.0F, -13.0F, 0.0F);
    
    bodyModel[66].addShapeBox(-1.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[66].setRotationPoint(42.0F, -13.0F, 0.0F);
    
    bodyModel[67].addShapeBox(1.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F);
    bodyModel[67].setRotationPoint(42.0F, -13.0F, 0.0F);
    
    bodyModel[68].addShapeBox(-0.9F, 1.0F, 0.0F, 1, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[68].setRotationPoint(38.0F, -20.0F, 6.0F);
    (bodyModel[68]).rotateAngleZ = 0.5235988F;
    
    bodyModel[69].addShapeBox(-0.9F, 4.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[69].setRotationPoint(38.0F, -20.0F, 6.0F);
    (bodyModel[69]).rotateAngleZ = 0.5235988F;
    
    bodyModel[70].addShapeBox(-0.9F, 4.0F, 3.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[70].setRotationPoint(38.0F, -20.0F, 6.0F);
    (bodyModel[70]).rotateAngleZ = 0.5235988F;
    
    bodyModel[71].addShapeBox(-0.9F, 5.0F, 0.0F, 1, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[71].setRotationPoint(38.0F, -20.0F, 6.0F);
    (bodyModel[71]).rotateAngleZ = 0.5235988F;
    
    bodyModel[72].addShapeBox(0.0F, 0.0F, -5.0F, 7, 1, 5, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[72].setRotationPoint(30.5F, -20.2F, 14.0F);
    
    bodyModel[73].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
    bodyModel[73].setRotationPoint(30.5F, -20.2F, 3.0F);
    
    bodyModel[74].addShapeBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[74].setRotationPoint(31.5F, -20.3F, 15.0F);
    
    bodyModel[75].addShapeBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[75].setRotationPoint(35.5F, -20.3F, 15.0F);
    
    bodyModel[76].addShapeBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[76].setRotationPoint(35.5F, -20.3F, 4.0F);
    
    bodyModel[77].addShapeBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[77].setRotationPoint(31.5F, -20.3F, 4.0F);
    
    bodyModel[78].addShapeBox(0.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[78].setRotationPoint(34.0F, -20.3F, 26.0F);
    
    bodyModel[79].addShapeBox(0.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[79].setRotationPoint(13.0F, -20.3F, 26.0F);
    
    bodyModel[80].addShapeBox(0.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[80].setRotationPoint(-12.0F, -20.3F, 26.0F);
    
    bodyModel[81].addShapeBox(0.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[81].setRotationPoint(-34.0F, -20.3F, 26.0F);
    
    bodyModel[82].addShapeBox(0.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[82].setRotationPoint(-70.0F, -20.3F, 26.0F);
    
    bodyModel[83].addShapeBox(0.0F, 0.0F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[83].setRotationPoint(51.0F, -20.3F, 26.0F);
    
    bodyModel[84].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F, 0.2F);
    bodyModel[84].setRotationPoint(51.0F, -20.3F, -26.0F);
    
    bodyModel[85].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[85].setRotationPoint(34.0F, -20.3F, -26.0F);
    
    bodyModel[86].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[86].setRotationPoint(13.0F, -20.3F, -26.0F);
    
    bodyModel[87].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[87].setRotationPoint(-12.0F, -20.3F, -26.0F);
    
    bodyModel[88].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[88].setRotationPoint(-34.0F, -20.3F, -26.0F);
    
    bodyModel[89].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[89].setRotationPoint(-70.0F, -20.3F, -26.0F);
    
    bodyModel[90].addShapeBox(-9.0F, -0.3F, -10.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F);
    bodyModel[90].setRotationPoint(-94.0F, -20.0F, 26.0F);
    (bodyModel[90]).rotateAngleZ = 0.715585F;
    
    bodyModel[91].addShapeBox(-9.0F, -0.3F, 0.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.2F, 0.0F, -0.7F, 0.2F);
    bodyModel[91].setRotationPoint(-94.0F, -20.0F, -26.0F);
    (bodyModel[91]).rotateAngleZ = 0.715585F;
    
    bodyModel[92].addShapeBox(0.0F, 0.0F, 0.0F, 1, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    bodyModel[92].setRotationPoint(51.0F, -20.3F, -15.8F);
    
    bodyModel[93].addShapeBox(0.0F, 0.0F, -1.0F, 1, 10, 1, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[93].setRotationPoint(51.0F, -20.3F, 15.8F);
    
    bodyModel[94].addShapeBox(-1.5F, -1.5F, -25.0F, 3, 3, 50, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[94].setRotationPoint(49.0F, -9.0F, 0.0F);
    
    bodyModel[95].addShapeBox(-2.0F, -2.0F, -25.0F, 4, 4, 50, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[95].setRotationPoint(-90.0F, -7.0F, 0.0F);
    
    bodyModel[96].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[96].setRotationPoint(31.0F, -15.0F, 16.0F);
    
    bodyModel[97].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[97].setRotationPoint(15.0F, -15.0F, 16.0F);
    
    bodyModel[98].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[98].setRotationPoint(-8.0F, -14.75F, 16.0F);
    
    bodyModel[99].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[99].setRotationPoint(-29.0F, -14.5F, 16.0F);
    
    bodyModel[100].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[100].setRotationPoint(-54.0F, -14.25F, 16.0F);
    
    bodyModel[101].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[101].setRotationPoint(-79.0F, -14.0F, 16.0F);
    
    bodyModel[102].addShapeBox(0.0F, 0.0F, 0.0F, 6, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[102].setRotationPoint(25.0F, -4.0F, 16.0F);
    
    bodyModel[103].addShapeBox(0.0F, 0.0F, 0.0F, 6, 7, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[103].setRotationPoint(25.0F, -11.0F, 16.0F);
    
    bodyModel[104].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[104].setRotationPoint(27.0F, -5.0F, 16.0F);
    
    bodyModel[105].addShapeBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
    bodyModel[105].setRotationPoint(28.0F, -2.0F, 18.0F);
    
    bodyModel[106].addShapeBox(0.0F, 0.0F, 0.0F, 5, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[106].setRotationPoint(37.0F, -2.0F, 18.0F);
    
    bodyModel[107].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[107].setRotationPoint(35.0F, 1.0F, 18.0F);
    
    bodyModel[108].addShapeBox(0.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[108].setRotationPoint(29.0F, -11.0F, 20.5F);
    (bodyModel[108]).rotateAngleZ = -0.6632251F;
    
    bodyModel[109].addShapeBox(-7.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[109].setRotationPoint(28.0F, -2.0F, 18.0F);
    
    bodyModel[110].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[110].setRotationPoint(19.0F, 1.0F, 18.0F);
    
    bodyModel[111].addShapeBox(0.0F, 0.0F, 0.0F, 5, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[111].setRotationPoint(14.0F, -2.0F, 18.0F);
    
    bodyModel[112].addShapeBox(-16.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F);
    bodyModel[112].setRotationPoint(27.0F, -11.0F, 20.5F);
    (bodyModel[112]).rotateAngleZ = 0.6632251F;
    
    bodyModel[113].addShapeBox(0.0F, 0.0F, 0.0F, 6, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[113].setRotationPoint(-6.0F, -4.0F, 16.0F);
    
    bodyModel[114].addShapeBox(0.0F, 0.0F, 0.0F, 6, 7, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[114].setRotationPoint(-6.0F, -11.0F, 16.0F);
    
    bodyModel[115].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[115].setRotationPoint(-4.0F, -5.0F, 16.0F);
    
    bodyModel[116].addShapeBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
    bodyModel[116].setRotationPoint(-3.0F, -2.0F, 18.0F);
    
    bodyModel[117].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[117].setRotationPoint(4.0F, 1.0F, 18.0F);
    
    bodyModel[118].addShapeBox(0.0F, 0.0F, 0.0F, 5, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[118].setRotationPoint(6.0F, -2.0F, 18.0F);
    
    bodyModel[119].addShapeBox(0.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[119].setRotationPoint(-2.0F, -11.0F, 20.5F);
    (bodyModel[119]).rotateAngleZ = -0.6632251F;
    
    bodyModel[120].addShapeBox(-7.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[120].setRotationPoint(-3.0F, -2.0F, 18.0F);
    
    bodyModel[121].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[121].setRotationPoint(-12.0F, 1.0F, 18.0F);
    
    bodyModel[122].addShapeBox(0.0F, 0.0F, 0.0F, 5, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[122].setRotationPoint(-17.0F, -2.0F, 18.0F);
    
    bodyModel[123].addShapeBox(-16.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F);
    bodyModel[123].setRotationPoint(-4.0F, -11.0F, 20.5F);
    (bodyModel[123]).rotateAngleZ = 0.6632251F;
    
    bodyModel[124].addShapeBox(0.0F, 0.0F, 0.0F, 6, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[124].setRotationPoint(-37.0F, -4.0F, 16.0F);
    
    bodyModel[125].addShapeBox(0.0F, 0.0F, 0.0F, 6, 7, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[125].setRotationPoint(-37.0F, -11.0F, 16.0F);
    
    bodyModel[126].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[126].setRotationPoint(-35.0F, -5.0F, 16.0F);
    
    bodyModel[127].addShapeBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
    bodyModel[127].setRotationPoint(-34.0F, -2.0F, 18.0F);
    
    bodyModel[128].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[128].setRotationPoint(-27.0F, 1.0F, 18.0F);
    
    bodyModel[129].addShapeBox(0.0F, 0.0F, 0.0F, 5, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[129].setRotationPoint(-25.0F, -2.0F, 18.0F);
    
    bodyModel[130].addShapeBox(0.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[130].setRotationPoint(-33.0F, -11.0F, 20.5F);
    (bodyModel[130]).rotateAngleZ = -0.6632251F;
    
    bodyModel[131].addShapeBox(-7.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[131].setRotationPoint(-34.0F, -2.0F, 18.0F);
    
    bodyModel[132].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[132].setRotationPoint(-43.0F, 1.0F, 18.0F);
    
    bodyModel[133].addShapeBox(0.0F, 0.0F, 0.0F, 5, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[133].setRotationPoint(-48.0F, -2.0F, 18.0F);
    
    bodyModel[134].addShapeBox(-16.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F);
    bodyModel[134].setRotationPoint(-35.0F, -11.0F, 20.5F);
    (bodyModel[134]).rotateAngleZ = 0.6632251F;
    
    bodyModel[135].addShapeBox(0.0F, 0.0F, 0.0F, 6, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[135].setRotationPoint(-68.0F, -4.0F, 16.0F);
    
    bodyModel[136].addShapeBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
    bodyModel[136].setRotationPoint(-65.0F, -2.0F, 18.0F);
    
    bodyModel[137].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[137].setRotationPoint(-58.0F, 1.0F, 18.0F);
    
    bodyModel[138].addShapeBox(0.0F, 0.0F, 0.0F, 5, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[138].setRotationPoint(-56.0F, -2.0F, 18.0F);
    
    bodyModel[139].addShapeBox(-7.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[139].setRotationPoint(-65.0F, -2.0F, 18.0F);
    
    bodyModel[140].addShapeBox(0.0F, 0.0F, 0.0F, 6, 7, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[140].setRotationPoint(-68.0F, -11.0F, 16.0F);
    
    bodyModel[141].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[141].setRotationPoint(-66.0F, -5.0F, 16.0F);
    
    bodyModel[142].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[142].setRotationPoint(-74.0F, 1.0F, 18.0F);
    
    bodyModel[143].addShapeBox(0.0F, 0.0F, 0.0F, 5, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[143].setRotationPoint(-79.0F, -2.0F, 18.0F);
    
    bodyModel[144].addShapeBox(0.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[144].setRotationPoint(-64.0F, -11.0F, 20.5F);
    (bodyModel[144]).rotateAngleZ = -0.6632251F;
    
    bodyModel[145].addShapeBox(-16.0F, 0.0F, 0.0F, 16, 1, 1, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F);
    bodyModel[145].setRotationPoint(-66.0F, -11.0F, 20.5F);
    (bodyModel[145]).rotateAngleZ = 0.6632251F;
    
    bodyModel[146].addShapeBox(0.0F, 0.0F, -9.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[146].setRotationPoint(31.0F, -15.0F, -16.0F);
    
    bodyModel[147].addShapeBox(0.0F, 0.0F, -9.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[147].setRotationPoint(15.0F, -15.0F, -16.0F);
    
    bodyModel[148].addShapeBox(0.0F, 0.0F, -9.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[148].setRotationPoint(-8.0F, -14.75F, -16.0F);
    
    bodyModel[149].addShapeBox(0.0F, 0.0F, -9.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[149].setRotationPoint(-29.0F, -14.5F, -16.0F);
    
    bodyModel[150].addShapeBox(0.0F, 0.0F, -9.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[150].setRotationPoint(-54.0F, -14.25F, -16.0F);
    
    bodyModel[151].addShapeBox(0.0F, 0.0F, -9.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[151].setRotationPoint(-79.0F, -14.0F, -16.0F);
    
    bodyModel[152].addShapeBox(0.0F, 0.0F, -7.0F, 6, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[152].setRotationPoint(25.0F, -4.0F, -16.0F);
    
    bodyModel[153].addShapeBox(0.0F, 0.0F, -7.0F, 6, 7, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[153].setRotationPoint(25.0F, -11.0F, -16.0F);
    
    bodyModel[154].addShapeBox(0.0F, 0.0F, -9.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[154].setRotationPoint(27.0F, -5.0F, -16.0F);
    
    bodyModel[155].addShapeBox(0.0F, 0.0F, -6.0F, 7, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
    bodyModel[155].setRotationPoint(28.0F, -2.0F, -18.0F);
    
    bodyModel[156].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[156].setRotationPoint(35.0F, 1.0F, -18.0F);
    
    bodyModel[157].addShapeBox(0.0F, 0.0F, -6.0F, 5, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[157].setRotationPoint(37.0F, -2.0F, -18.0F);
    
    bodyModel[158].addShapeBox(-7.0F, 0.0F, -6.0F, 7, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[158].setRotationPoint(28.0F, -2.0F, -18.0F);
    
    bodyModel[159].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[159].setRotationPoint(19.0F, 1.0F, -18.0F);
    
    bodyModel[160].addShapeBox(0.0F, 0.0F, -6.0F, 5, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[160].setRotationPoint(14.0F, -2.0F, -18.0F);
    
    bodyModel[161].addShapeBox(0.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[161].setRotationPoint(29.0F, -11.0F, -20.5F);
    (bodyModel[161]).rotateAngleZ = -0.6632251F;
    
    bodyModel[162].addShapeBox(-16.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F);
    bodyModel[162].setRotationPoint(27.0F, -11.0F, -20.5F);
    (bodyModel[162]).rotateAngleZ = 0.6632251F;
    
    bodyModel[163].addShapeBox(0.0F, 0.0F, -9.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[163].setRotationPoint(-4.0F, -5.0F, -16.0F);
    
    bodyModel[164].addShapeBox(0.0F, 0.0F, -7.0F, 6, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[164].setRotationPoint(-6.0F, -4.0F, -16.0F);
    
    bodyModel[165].addShapeBox(0.0F, 0.0F, -7.0F, 6, 7, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[165].setRotationPoint(-6.0F, -11.0F, -16.0F);
    
    bodyModel[166].addShapeBox(0.0F, 0.0F, -6.0F, 7, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
    bodyModel[166].setRotationPoint(-3.0F, -2.0F, -18.0F);
    
    bodyModel[167].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[167].setRotationPoint(4.0F, 1.0F, -18.0F);
    
    bodyModel[168].addShapeBox(0.0F, 0.0F, -6.0F, 5, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[168].setRotationPoint(6.0F, -2.0F, -18.0F);
    
    bodyModel[169].addShapeBox(-7.0F, 0.0F, -6.0F, 7, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[169].setRotationPoint(-3.0F, -2.0F, -18.0F);
    
    bodyModel[170].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[170].setRotationPoint(-12.0F, 1.0F, -18.0F);
    
    bodyModel[171].addShapeBox(0.0F, 0.0F, -6.0F, 5, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[171].setRotationPoint(-17.0F, -2.0F, -18.0F);
    
    bodyModel[172].addShapeBox(0.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[172].setRotationPoint(-2.0F, -11.0F, -20.5F);
    (bodyModel[172]).rotateAngleZ = -0.6632251F;
    
    bodyModel[173].addShapeBox(-16.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F);
    bodyModel[173].setRotationPoint(-4.0F, -11.0F, -20.5F);
    (bodyModel[173]).rotateAngleZ = 0.6632251F;
    
    bodyModel[174].addShapeBox(0.0F, 0.0F, -9.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[174].setRotationPoint(-35.0F, -5.0F, -16.0F);
    
    bodyModel[175].addShapeBox(0.0F, 0.0F, -7.0F, 6, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[175].setRotationPoint(-37.0F, -4.0F, -16.0F);
    
    bodyModel[176].addShapeBox(0.0F, 0.0F, -7.0F, 6, 7, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[176].setRotationPoint(-37.0F, -11.0F, -16.0F);
    
    bodyModel[177].addShapeBox(0.0F, 0.0F, -6.0F, 7, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
    bodyModel[177].setRotationPoint(-34.0F, -2.0F, -18.0F);
    
    bodyModel[178].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[178].setRotationPoint(-27.0F, 1.0F, -18.0F);
    
    bodyModel[179].addShapeBox(0.0F, 0.0F, -6.0F, 5, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[179].setRotationPoint(-25.0F, -2.0F, -18.0F);
    
    bodyModel[180].addShapeBox(-7.0F, 0.0F, -6.0F, 7, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[180].setRotationPoint(-34.0F, -2.0F, -18.0F);
    
    bodyModel[181].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[181].setRotationPoint(-43.0F, 1.0F, -18.0F);
    
    bodyModel[182].addShapeBox(0.0F, 0.0F, -6.0F, 5, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[182].setRotationPoint(-48.0F, -2.0F, -18.0F);
    
    bodyModel[183].addShapeBox(0.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[183].setRotationPoint(-33.0F, -11.0F, -20.5F);
    (bodyModel[183]).rotateAngleZ = -0.6632251F;
    
    bodyModel[184].addShapeBox(-16.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F);
    bodyModel[184].setRotationPoint(-35.0F, -11.0F, -20.5F);
    (bodyModel[184]).rotateAngleZ = 0.6632251F;
    
    bodyModel[185].addShapeBox(0.0F, 0.0F, -9.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[185].setRotationPoint(-66.0F, -5.0F, -16.0F);
    
    bodyModel[186].addShapeBox(0.0F, 0.0F, -7.0F, 6, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[186].setRotationPoint(-68.0F, -4.0F, -16.0F);
    
    bodyModel[187].addShapeBox(0.0F, 0.0F, -7.0F, 6, 7, 7, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[187].setRotationPoint(-68.0F, -11.0F, -16.0F);
    
    bodyModel[188].addShapeBox(0.0F, 0.0F, -6.0F, 7, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F);
    bodyModel[188].setRotationPoint(-65.0F, -2.0F, -18.0F);
    
    bodyModel[189].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[189].setRotationPoint(-58.0F, 1.0F, -18.0F);
    
    bodyModel[190].addShapeBox(0.0F, 0.0F, -6.0F, 5, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[190].setRotationPoint(-56.0F, -2.0F, -18.0F);
    
    bodyModel[191].addShapeBox(-7.0F, 0.0F, -6.0F, 7, 7, 6, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[191].setRotationPoint(-65.0F, -2.0F, -18.0F);
    
    bodyModel[192].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[192].setRotationPoint(-74.0F, 1.0F, -18.0F);
    
    bodyModel[193].addShapeBox(0.0F, 0.0F, -6.0F, 5, 7, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[193].setRotationPoint(-79.0F, -2.0F, -18.0F);
    
    bodyModel[194].addShapeBox(0.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[194].setRotationPoint(-64.0F, -11.0F, -20.5F);
    (bodyModel[194]).rotateAngleZ = -0.6632251F;
    
    bodyModel[195].addShapeBox(-16.0F, 0.0F, -1.0F, 16, 1, 1, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F);
    bodyModel[195].setRotationPoint(-66.0F, -11.0F, -20.5F);
    (bodyModel[195]).rotateAngleZ = 0.6632251F;
    
    bodyModel[196].addShapeBox(0.0F, 0.0F, 0.0F, 2, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[196].setRotationPoint(11.5F, -10.0F, 16.0F);
    
    bodyModel[197].addShapeBox(0.0F, 0.0F, 0.0F, 2, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[197].setRotationPoint(-19.5F, -10.0F, 16.0F);
    
    bodyModel[198].addShapeBox(0.0F, 0.0F, 0.0F, 2, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[198].setRotationPoint(-50.5F, -10.0F, 16.0F);
    
    bodyModel[199].addShapeBox(0.0F, 0.0F, -9.0F, 2, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[199].setRotationPoint(11.5F, -10.0F, -16.0F);
    
    bodyModel[200].addShapeBox(0.0F, 0.0F, -9.0F, 2, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[200].setRotationPoint(-19.5F, -10.0F, -16.0F);
    
    bodyModel[201].addShapeBox(0.0F, 0.0F, -9.0F, 2, 9, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[201].setRotationPoint(-50.5F, -10.0F, -16.0F);
    
    bodyModel[202].addShapeBox(0.0F, -2.0F, 0.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[202].setRotationPoint(42.0F, -2.0F, 18.0F);
    (bodyModel[202]).rotateAngleZ = 0.6230825F;
    
    bodyModel[203].addShapeBox(0.0F, -2.0F, 0.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[203].setRotationPoint(42.0F, -2.0F, 16.0F);
    (bodyModel[203]).rotateAngleZ = 0.6230825F;
    
    bodyModel[204].addShapeBox(0.0F, -2.0F, -6.0F, 2, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[204].setRotationPoint(42.0F, -2.0F, -18.0F);
    (bodyModel[204]).rotateAngleZ = 0.6230825F;
    
    bodyModel[205].addShapeBox(0.0F, -2.0F, -2.0F, 2, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[205].setRotationPoint(42.0F, -2.0F, -16.0F);
    (bodyModel[205]).rotateAngleZ = 0.6230825F;
    
    bodyModel[206].addShapeBox(0.0F, 0.0F, 0.0F, 27, 17, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[206].setRotationPoint(12.0F, -15.0F, 25.0F);
    
    bodyModel[207].addShapeBox(0.0F, 0.0F, 0.0F, 14, 17, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[207].setRotationPoint(39.0F, -15.0F, 25.0F);
    
    bodyModel[208].addShapeBox(0.0F, 0.0F, 0.0F, 86, 17, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[208].setRotationPoint(-74.0F, -15.0F, 25.0F);
    
    bodyModel[209].addShapeBox(0.0F, 0.0F, 0.0F, 17, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[209].setRotationPoint(-91.0F, -14.0F, 25.0F);
    
    bodyModel[210].addShapeBox(0.0F, 0.0F, 0.0F, 5, 14, 1, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[210].setRotationPoint(-96.0F, -14.0F, 25.0F);
    
    bodyModel[211].addShapeBox(0.0F, 0.0F, -1.0F, 27, 17, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[211].setRotationPoint(12.0F, -15.0F, -25.0F);
    
    bodyModel[212].addShapeBox(0.0F, 0.0F, -1.0F, 14, 17, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[212].setRotationPoint(39.0F, -15.0F, -25.0F);
    
    bodyModel[213].addShapeBox(0.0F, 0.0F, -1.0F, 86, 17, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[213].setRotationPoint(-74.0F, -15.0F, -25.0F);
    
    bodyModel[214].addShapeBox(0.0F, 0.0F, -1.0F, 17, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[214].setRotationPoint(-91.0F, -14.0F, -25.0F);
    
    bodyModel[215].addShapeBox(0.0F, 0.0F, -1.0F, 5, 14, 1, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F);
    bodyModel[215].setRotationPoint(-96.0F, -14.0F, -25.0F);
    
    bodyModel[216].addShapeBox(0.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[216].setRotationPoint(51.0F, -20.3F, 26.3F);
    
    bodyModel[217].addShapeBox(0.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[217].setRotationPoint(34.0F, -20.3F, 26.3F);
    
    bodyModel[218].addShapeBox(0.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[218].setRotationPoint(13.0F, -20.3F, 26.3F);
    
    bodyModel[219].addShapeBox(0.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[219].setRotationPoint(-12.0F, -20.3F, 26.3F);
    
    bodyModel[220].addShapeBox(0.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[220].setRotationPoint(-34.0F, -20.3F, 26.3F);
    
    bodyModel[221].addShapeBox(0.0F, 0.0F, -1.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[221].setRotationPoint(-70.0F, -20.3F, 26.3F);
    
    bodyModel[222].addShapeBox(-9.0F, -0.3F, -1.0F, 1, 8, 1, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[222].setRotationPoint(-94.0F, -20.0F, 26.3F);
    (bodyModel[222]).rotateAngleZ = 0.715585F;
    
    bodyModel[223].addShapeBox(-1.0F, 0.0F, 0.0F, 5, 11, 1, 0.0F, 1.8F, -5.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 1.8F, -5.9F, -0.8F, -2.0F, -0.7F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -0.8F, -2.0F, -0.7F, -0.8F);
    bodyModel[223].setRotationPoint(-98.0F, -20.0F, -16.0F);
    
    bodyModel[224].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    bodyModel[224].setRotationPoint(51.0F, -20.3F, -26.3F);
    
    bodyModel[225].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    bodyModel[225].setRotationPoint(34.0F, -20.3F, -26.3F);
    
    bodyModel[226].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    bodyModel[226].setRotationPoint(13.0F, -20.3F, -26.3F);
    
    bodyModel[227].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    bodyModel[227].setRotationPoint(-12.0F, -20.3F, -26.3F);
    
    bodyModel[228].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    bodyModel[228].setRotationPoint(-34.0F, -20.3F, -26.3F);
    
    bodyModel[229].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    bodyModel[229].setRotationPoint(-70.0F, -20.3F, -26.3F);
    
    bodyModel[230].addShapeBox(-9.0F, -0.3F, 0.0F, 1, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    bodyModel[230].setRotationPoint(-94.0F, -20.0F, -26.3F);
    (bodyModel[230]).rotateAngleZ = 0.715585F;
    
    bodyModel[231].addShapeBox(0.0F, 0.0F, 0.0F, 13, 14, 1, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, -6.0F, -0.7F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[231].setRotationPoint(42.0F, -13.0F, 15.0F);
    
    bodyModel[232].addShapeBox(0.0F, 0.0F, 0.0F, 13, 14, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    bodyModel[232].setRotationPoint(42.0F, -13.0F, -16.0F);
    
    bodyModel[233].addShapeBox(-9.0F, -0.3F, 0.0F, 1, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    bodyModel[233].setRotationPoint(-94.0F, -20.0F, 15.5F);
    (bodyModel[233]).rotateAngleZ = 0.715585F;
    
    bodyModel[234].addShapeBox(-9.0F, -0.3F, -1.0F, 1, 8, 1, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[234].setRotationPoint(-94.0F, -20.0F, -15.5F);
    (bodyModel[234]).rotateAngleZ = 0.715585F;
    
    bodyModel[235].addBox(-9.0F, 0.0F, -16.0F, 19, 11, 32, 0.0F);
    bodyModel[235].setRotationPoint(0.0F, -31.0F, 0.0F);
    
    bodyModel[236].addShapeBox(0.0F, 0.0F, -16.0F, 7, 11, 32, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[236].setRotationPoint(10.0F, -31.0F, 0.0F);
    
    bodyModel[237].addShapeBox(-8.0F, 0.0F, -16.0F, 8, 11, 32, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
    bodyModel[237].setRotationPoint(-9.0F, -31.0F, 0.0F);
    
    bodyModel[238].addBox(-9.0F, 0.0F, -7.0F, 17, 11, 7, 0.0F);
    bodyModel[238].setRotationPoint(0.0F, -31.0F, -16.0F);
    
    bodyModel[239].addBox(-9.0F, 0.0F, 0.0F, 17, 11, 7, 0.0F);
    bodyModel[239].setRotationPoint(-2.0F, -31.0F, 16.0F);

    
    turretModel = new ModelRendererTurbo[65];
    turretModel[0] = new ModelRendererTurbo(this, 673, 153, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 721, 153, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 785, 153, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 33, 161, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 81, 161, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 433, 161, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 801, 169, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 945, 169, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 129, 177, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 313, 105, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 1, 25, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 377, 25, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 473, 137, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 153, 177, textureX, textureY);
    turretModel[14] = new ModelRendererTurbo(this, 201, 177, textureX, textureY);
    turretModel[15] = new ModelRendererTurbo(this, 225, 177, textureX, textureY);
    turretModel[16] = new ModelRendererTurbo(this, 449, 177, textureX, textureY);
    turretModel[17] = new ModelRendererTurbo(this, 497, 177, textureX, textureY);
    turretModel[18] = new ModelRendererTurbo(this, 849, 161, textureX, textureY);
    turretModel[19] = new ModelRendererTurbo(this, 537, 177, textureX, textureY);
    turretModel[20] = new ModelRendererTurbo(this, 585, 177, textureX, textureY);
    turretModel[21] = new ModelRendererTurbo(this, 1, 169, textureX, textureY);
    turretModel[22] = new ModelRendererTurbo(this, 17, 25, textureX, textureY);
    turretModel[23] = new ModelRendererTurbo(this, 513, 25, textureX, textureY);
    turretModel[24] = new ModelRendererTurbo(this, 473, 105, textureX, textureY);
    turretModel[25] = new ModelRendererTurbo(this, 601, 113, textureX, textureY);
    turretModel[26] = new ModelRendererTurbo(this, 761, 153, textureX, textureY);
    turretModel[27] = new ModelRendererTurbo(this, 721, 153, textureX, textureY);
    turretModel[28] = new ModelRendererTurbo(this, 937, 153, textureX, textureY);
    turretModel[29] = new ModelRendererTurbo(this, 873, 161, textureX, textureY);
    turretModel[30] = new ModelRendererTurbo(this, 545, 25, textureX, textureY);
    turretModel[31] = new ModelRendererTurbo(this, 761, 25, textureX, textureY);
    turretModel[32] = new ModelRendererTurbo(this, 681, 113, textureX, textureY);
    turretModel[33] = new ModelRendererTurbo(this, 985, 161, textureX, textureY);
    turretModel[34] = new ModelRendererTurbo(this, 81, 161, textureX, textureY);
    turretModel[35] = new ModelRendererTurbo(this, 265, 105, textureX, textureY);
    turretModel[36] = new ModelRendererTurbo(this, 737, 105, textureX, textureY);
    turretModel[37] = new ModelRendererTurbo(this, 537, 129, textureX, textureY);
    turretModel[38] = new ModelRendererTurbo(this, 457, 161, textureX, textureY);
    turretModel[39] = new ModelRendererTurbo(this, 945, 161, textureX, textureY);
    turretModel[40] = new ModelRendererTurbo(this, 33, 169, textureX, textureY);
    turretModel[41] = new ModelRendererTurbo(this, 497, 177, textureX, textureY);
    turretModel[42] = new ModelRendererTurbo(this, 537, 177, textureX, textureY);
    turretModel[43] = new ModelRendererTurbo(this, 585, 177, textureX, textureY);
    turretModel[44] = new ModelRendererTurbo(this, 945, 25, textureX, textureY);
    turretModel[45] = new ModelRendererTurbo(this, 217, 57, textureX, textureY);
    turretModel[46] = new ModelRendererTurbo(this, 233, 57, textureX, textureY);
    turretModel[47] = new ModelRendererTurbo(this, 201, 57, textureX, textureY);
    turretModel[48] = new ModelRendererTurbo(this, 945, 57, textureX, textureY);
    turretModel[49] = new ModelRendererTurbo(this, 633, 185, textureX, textureY);
    turretModel[50] = new ModelRendererTurbo(this, 665, 9, textureX, textureY);
    turretModel[51] = new ModelRendererTurbo(this, 25, 17, textureX, textureY);
    turretModel[52] = new ModelRendererTurbo(this, 569, 81, textureX, textureY);
    turretModel[53] = new ModelRendererTurbo(this, 25, 97, textureX, textureY);
    turretModel[54] = new ModelRendererTurbo(this, 521, 105, textureX, textureY);
    turretModel[55] = new ModelRendererTurbo(this, 377, 65, textureX, textureY);
    turretModel[56] = new ModelRendererTurbo(this, 401, 65, textureX, textureY);
    turretModel[57] = new ModelRendererTurbo(this, 561, 25, textureX, textureY);
    turretModel[58] = new ModelRendererTurbo(this, 737, 185, textureX, textureY);
    turretModel[59] = new ModelRendererTurbo(this, 961, 57, textureX, textureY);
    turretModel[60] = new ModelRendererTurbo(this, 993, 57, textureX, textureY);
    turretModel[61] = new ModelRendererTurbo(this, 417, 17, textureX, textureY);
    turretModel[62] = new ModelRendererTurbo(this, 473, 17, textureX, textureY);
    turretModel[63] = new ModelRendererTurbo(this, 569, 17, textureX, textureY);
    turretModel[64] = new ModelRendererTurbo(this, 609, 17, textureX, textureY);
    
    turretModel[0].addShapeBox(3.0F, 0.0F, -15.0F, 5, 10, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretModel[0].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[1].addShapeBox(8.0F, 0.0F, -13.0F, 5, 3, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    turretModel[1].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[2].addShapeBox(13.0F, 0.0F, -8.0F, 3, 10, 16, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    turretModel[2].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[3].addShapeBox(-7.0F, 0.0F, -15.0F, 5, 10, 30, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    turretModel[3].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[4].addShapeBox(-12.0F, 7.0F, -13.0F, 5, 3, 26, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F);
    turretModel[4].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[5].addShapeBox(-15.0F, 7.0F, -8.0F, 3, 3, 16, 0.0F, -0.5F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -5.0F);
    turretModel[5].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[6].addShapeBox(-16.0F, 0.0F, -13.0F, 9, 7, 26, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F);
    turretModel[6].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[7].addShapeBox(8.0F, 8.0F, -13.0F, 5, 2, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    turretModel[7].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[8].addShapeBox(8.0F, 3.0F, -8.0F, 5, 5, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    turretModel[8].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[9].addShapeBox(8.0F, 4.0F, -13.0F, 4, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[9].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[10].addShapeBox(8.0F, 3.0F, -13.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[10].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[11].addShapeBox(8.0F, 7.0F, -13.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    turretModel[11].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[12].addShapeBox(8.0F, 3.0F, -13.0F, 3, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, -3.3F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, -3.3F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[12].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[13].addShapeBox(-2.0F, 0.0F, -15.0F, 5, 10, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[13].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[14].addShapeBox(-20.0F, 0.0F, -10.0F, 4, 7, 20, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -5.0F);
    turretModel[14].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[15].addShapeBox(-2.0F, -1.0F, -15.0F, 5, 1, 30, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[15].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[16].addShapeBox(3.0F, -1.0F, -15.0F, 5, 1, 30, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretModel[16].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[17].addShapeBox(8.0F, -1.0F, -13.0F, 5, 1, 26, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    turretModel[17].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[18].addShapeBox(13.0F, -1.0F, -8.0F, 3, 1, 16, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -5.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -5.0F, -0.5F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    turretModel[18].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[19].addShapeBox(-7.0F, -1.0F, -15.0F, 5, 1, 30, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    turretModel[19].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[20].addShapeBox(-16.0F, -1.0F, -13.0F, 9, 1, 26, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F);
    turretModel[20].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[21].addShapeBox(-20.0F, -1.0F, -10.0F, 4, 1, 20, 0.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -5.0F);
    turretModel[21].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[22].addShapeBox(-2.0F, -2.0F, 20.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[22].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[23].addShapeBox(3.0F, -2.0F, 19.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    turretModel[23].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[24].addShapeBox(9.0F, -2.0F, 13.0F, 8, 1, 7, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F);
    turretModel[24].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[25].addShapeBox(-17.0F, -2.0F, 16.0F, 15, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
    turretModel[25].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[26].addShapeBox(-24.0F, -2.0F, 10.0F, 7, 1, 7, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F);
    turretModel[26].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[27].addShapeBox(-27.0F, -2.0F, 4.0F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, -3.0F, 0.0F, 0.0F);
    turretModel[27].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[28].addShapeBox(-27.0F, -2.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[28].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[29].addShapeBox(9.0F, -2.0F, -20.0F, 8, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F);
    turretModel[29].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[30].addShapeBox(3.0F, -2.0F, -21.0F, 6, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    turretModel[30].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[31].addShapeBox(-2.0F, -2.0F, -21.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[31].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[32].addShapeBox(-17.0F, -2.0F, -21.0F, 15, 1, 5, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
    turretModel[32].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[33].addShapeBox(-24.0F, -2.0F, -17.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -0.5F, 0.0F, -0.25F);
    turretModel[33].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[34].addShapeBox(-27.0F, -2.0F, -11.0F, 3, 1, 7, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[34].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F);
    turretModel[35].setRotationPoint(2.0F, -43.0F, -20.0F);
    (turretModel[35]).rotateAngleX = -0.87266463F;
    
    turretModel[36].addShapeBox(1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F);
    turretModel[36].setRotationPoint(9.0F, -43.0F, -19.0F);
    (turretModel[36]).rotateAngleX = -0.7853982F;
    (turretModel[36]).rotateAngleY = 0.62831855F;
    
    turretModel[37].addShapeBox(-10.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F);
    turretModel[37].setRotationPoint(-2.0F, -43.0F, -20.0F);
    (turretModel[37]).rotateAngleX = -0.7853982F;
    (turretModel[37]).rotateAngleY = -0.2617994F;
    
    turretModel[38].addShapeBox(-1.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F);
    turretModel[38].setRotationPoint(-23.0F, -43.0F, -11.0F);
    (turretModel[38]).rotateAngleX = -0.7853982F;
    (turretModel[38]).rotateAngleY = -0.7853982F;
    
    turretModel[39].addShapeBox(1.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F);
    turretModel[39].setRotationPoint(9.0F, -43.0F, 19.0F);
    (turretModel[39]).rotateAngleX = 0.7853982F;
    (turretModel[39]).rotateAngleY = -0.62831855F;
    
    turretModel[40].addShapeBox(0.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F);
    turretModel[40].setRotationPoint(2.0F, -43.0F, 20.0F);
    (turretModel[40]).rotateAngleX = 0.87266463F;
    
    turretModel[41].addShapeBox(-10.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F);
    turretModel[41].setRotationPoint(-2.0F, -43.0F, 20.0F);
    (turretModel[41]).rotateAngleX = 0.7853982F;
    (turretModel[41]).rotateAngleY = 0.2617994F;
    
    turretModel[42].addShapeBox(-1.0F, 0.0F, -11.0F, 1, 1, 11, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F);
    turretModel[42].setRotationPoint(-23.0F, -43.0F, 11.0F);
    (turretModel[42]).rotateAngleX = 0.7853982F;
    (turretModel[42]).rotateAngleY = 0.7853982F;
    
    turretModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 11, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    turretModel[43].setRotationPoint(-9.0F, -43.0F, -19.0F);
    
    turretModel[44].addShapeBox(-9.5F, -2.0F, -9.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[44].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[45].addShapeBox(5.0F, -1.0F, -8.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[45].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[46].addShapeBox(5.0F, -1.0F, 5.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[46].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[47].addShapeBox(5.5F, -4.0F, -8.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[47].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[48].addShapeBox(5.5F, -4.0F, 6.0F, 2, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[48].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[49].addShapeBox(-10.0F, -0.25F, -6.5F, 7, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[49].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[50].addShapeBox(-4.0F, -0.5F, -4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[50].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[51].addShapeBox(-4.0F, -0.5F, 3.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[51].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[52].addShapeBox(2.0F, -0.25F, -3.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F);
    turretModel[52].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[53].addShapeBox(2.0F, -0.25F, -6.0F, 4, 1, 5, 0.0F, -1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F);
    turretModel[53].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[54].addShapeBox(2.0F, -0.25F, 1.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, -2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.0F, -2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    turretModel[54].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[55].addShapeBox(6.0F, -0.25F, -4.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[55].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[56].addShapeBox(6.0F, -0.25F, 0.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    turretModel[56].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[57].addShapeBox(-1.0F, -0.25F, -2.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -1.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.75F);
    turretModel[57].setRotationPoint(0.0F, -42.0F, 0.0F);
    
    turretModel[58].addShapeBox(13.0F, 0.0F, -6.0F, 3, 8, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[58].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[59].addShapeBox(16.0F, 0.0F, -5.0F, 2, 8, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[59].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[60].addShapeBox(16.0F, 0.0F, 4.0F, 2, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    turretModel[60].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[61].addShapeBox(16.0F, 1.0F, -5.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F);
    turretModel[61].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[62].addShapeBox(16.0F, 6.0F, -5.5F, 2, 1, 1, 0.0F, 0.0F, -0.75F, 0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[62].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[63].addShapeBox(16.0F, 1.0F, 4.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.5F);
    turretModel[63].setRotationPoint(0.0F, -41.0F, 0.0F);
    
    turretModel[64].addShapeBox(16.0F, 6.0F, 4.5F, 2, 1, 1, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F);
    turretModel[64].setRotationPoint(0.0F, -41.0F, 0.0F);

    
    barrelModel = new ModelRendererTurbo[9];
    barrelModel[0] = new ModelRendererTurbo(this, 1009, 57, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 105, 113, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 753, 25, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 769, 113, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 1, 169, textureX, textureY);
    barrelModel[5] = new ModelRendererTurbo(this, 321, 41, textureX, textureY);
    barrelModel[6] = new ModelRendererTurbo(this, 425, 65, textureX, textureY);
    barrelModel[7] = new ModelRendererTurbo(this, 865, 25, textureX, textureY);
    barrelModel[8] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
    
    barrelModel[0].addShapeBox(2.0F, -1.5F, -2.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[0].setRotationPoint(14.0F, -38.0F, 0.0F);
    
    barrelModel[1].addShapeBox(5.0F, -1.5F, -2.0F, 7, 3, 3, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.4F, -0.5F, 0.0F, -0.4F, -0.5F, 0.0F, -0.2F, -0.2F);
    barrelModel[1].setRotationPoint(14.0F, -38.0F, 0.0F);
    
    barrelModel[2].addShapeBox(12.0F, -1.5F, -2.0F, 1, 3, 3, 0.0F, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[2].setRotationPoint(14.0F, -38.0F, 0.0F);
    
    barrelModel[3].addShapeBox(0.0F, 1.5F, -2.5F, 12, 3, 4, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
    barrelModel[3].setRotationPoint(14.0F, -38.0F, 0.0F);
    
    barrelModel[4].addShapeBox(3.0F, -3.0F, -4.0F, 1, 8, 8, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
    barrelModel[4].setRotationPoint(14.0F, -38.0F, 0.0F);
    
    barrelModel[5].addShapeBox(-0.4F, -1.5F, -1.5F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[5].setRotationPoint(12.0F, -35.5F, -10.5F);
    
    barrelModel[6].addShapeBox(-0.4F, -0.5F, -0.5F, 7, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[6].setRotationPoint(12.0F, -35.5F, -10.5F);
    
    barrelModel[7].addShapeBox(-0.4F, 0.5F, -0.5F, 5, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[7].setRotationPoint(12.0F, -35.5F, -10.5F);
    
    barrelModel[8].addShapeBox(3.6F, -0.5F, -0.5F, 1, 2, 1, 0.0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F);
    barrelModel[8].setRotationPoint(12.0F, -35.5F, -10.5F);

    
    leftTrackWheelModels = new ModelRendererTurbo[17];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 167, 222, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 113, 222, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 588, 249, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 549, 249, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 511, 249, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 472, 249, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 433, 249, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 394, 249, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 355, 249, textureX, textureY);
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 316, 249, textureX, textureY);
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 482, 222, textureX, textureY);
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 459, 222, textureX, textureY);
    leftTrackWheelModels[12] = new ModelRendererTurbo(this, 436, 222, textureX, textureY);
    leftTrackWheelModels[13] = new ModelRendererTurbo(this, 413, 222, textureX, textureY);
    leftTrackWheelModels[14] = new ModelRendererTurbo(this, 390, 222, textureX, textureY);
    leftTrackWheelModels[15] = new ModelRendererTurbo(this, 367, 222, textureX, textureY);
    leftTrackWheelModels[16] = new ModelRendererTurbo(this, 323, 223, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(7.5F, -7.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(15.0D, 5.0D, 15, 5), new Coord2D(15.0D, 10.0D, 15, 10), new Coord2D(10.0D, 15.0D, 10, 15), new Coord2D(5.0D, 15.0D, 5, 15), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 5.0D, 0, 5) }), 6.0F, 15, 15, 52, 6, 0, new float[] { 8.0F, 5.0F, 8.0F, 5.0F, 8.0F, 5.0F, 8.0F, 5.0F });
    leftTrackWheelModels[0].setRotationPoint(49.0F, -9.0F, 24.0F);
    
    leftTrackWheelModels[1].addShape3D(7.5F, -7.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(15.0D, 5.0D, 15, 5), new Coord2D(15.0D, 10.0D, 15, 10), new Coord2D(10.0D, 15.0D, 10, 15), new Coord2D(5.0D, 15.0D, 5, 15), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 5.0D, 0, 5) }), 6.0F, 15, 15, 52, 6, 0, new float[] { 8.0F, 5.0F, 8.0F, 5.0F, 8.0F, 5.0F, 8.0F, 5.0F });
    leftTrackWheelModels[1].setRotationPoint(-90.0F, -7.0F, 24.0F);
    
    leftTrackWheelModels[2].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[2].setRotationPoint(36.0F, 3.0F, 23.0F);
    
    leftTrackWheelModels[3].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[3].setRotationPoint(20.0F, 3.0F, 23.0F);
    
    leftTrackWheelModels[4].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[4].setRotationPoint(5.0F, 3.0F, 23.0F);
    
    leftTrackWheelModels[5].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[5].setRotationPoint(-11.0F, 3.0F, 23.0F);
    
    leftTrackWheelModels[6].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[6].setRotationPoint(-26.0F, 3.0F, 23.0F);
    
    leftTrackWheelModels[7].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[7].setRotationPoint(-42.0F, 3.0F, 23.0F);
    
    leftTrackWheelModels[8].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[8].setRotationPoint(-57.0F, 3.0F, 23.0F);
    
    leftTrackWheelModels[9].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[9].setRotationPoint(-73.0F, 3.0F, 23.0F);
    
    leftTrackWheelModels[10].addShape3D(2.5F, -2.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    leftTrackWheelModels[10].setRotationPoint(32.0F, -14.0F, 23.0F);
    
    leftTrackWheelModels[11].addShape3D(2.5F, -2.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    leftTrackWheelModels[11].setRotationPoint(16.0F, -14.0F, 23.0F);
    
    leftTrackWheelModels[12].addShape3D(2.5F, -2.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    leftTrackWheelModels[12].setRotationPoint(-7.0F, -13.75F, 23.0F);
    
    leftTrackWheelModels[13].addShape3D(2.5F, -2.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    leftTrackWheelModels[13].setRotationPoint(-28.0F, -13.5F, 23.0F);
    
    leftTrackWheelModels[14].addShape3D(2.5F, -2.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    leftTrackWheelModels[14].setRotationPoint(-53.0F, -13.25F, 23.0F);
    
    leftTrackWheelModels[15].addShape3D(2.5F, -2.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    leftTrackWheelModels[15].setRotationPoint(-78.0F, -13.0F, 23.0F);
    
    leftTrackWheelModels[16].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 4, 4, 16, 4, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[16].setRotationPoint(45.0F, 0.5F, 23.0F);

    
    rightTrackWheelModels = new ModelRendererTurbo[14];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 56, 222, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 222, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 343, 222, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 277, 249, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 238, 249, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 302, 223, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 199, 249, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 160, 249, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 121, 249, textureX, textureY);
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 82, 249, textureX, textureY);
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 43, 249, textureX, textureY);
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 2, 248, textureX, textureY);
    rightTrackWheelModels[12] = new ModelRendererTurbo(this, 273, 222, textureX, textureY);
    rightTrackWheelModels[13] = new ModelRendererTurbo(this, 249, 234, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(7.5F, -7.5F, -6.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(15.0D, 5.0D, 15, 5), new Coord2D(15.0D, 10.0D, 15, 10), new Coord2D(10.0D, 15.0D, 10, 15), new Coord2D(5.0D, 15.0D, 5, 15), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 5.0D, 0, 5) }), 6.0F, 15, 15, 52, 6, 0, new float[] { 8.0F, 5.0F, 8.0F, 5.0F, 8.0F, 5.0F, 8.0F, 5.0F });
    rightTrackWheelModels[0].setRotationPoint(49.0F, -9.0F, -24.0F);
    
    rightTrackWheelModels[1].addShape3D(7.5F, -7.5F, -6.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(15.0D, 5.0D, 15, 5), new Coord2D(15.0D, 10.0D, 15, 10), new Coord2D(10.0D, 15.0D, 10, 15), new Coord2D(5.0D, 15.0D, 5, 15), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 5.0D, 0, 5) }), 6.0F, 15, 15, 52, 6, 0, new float[] { 8.0F, 5.0F, 8.0F, 5.0F, 8.0F, 5.0F, 8.0F, 5.0F });
    rightTrackWheelModels[1].setRotationPoint(-90.0F, -7.0F, -24.0F);
    
    rightTrackWheelModels[2].addShape3D(2.5F, -2.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    rightTrackWheelModels[2].setRotationPoint(32.0F, -14.0F, -23.0F);
    
    rightTrackWheelModels[3].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[3].setRotationPoint(36.0F, 3.0F, -23.0F);
    
    rightTrackWheelModels[4].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[4].setRotationPoint(20.0F, 3.0F, -23.0F);
    
    rightTrackWheelModels[5].addShape3D(2.0F, -2.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 4, 4, 16, 4, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[5].setRotationPoint(45.0F, 0.5F, -23.0F);
    
    rightTrackWheelModels[6].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[6].setRotationPoint(5.0F, 3.0F, -23.0F);
    
    rightTrackWheelModels[7].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[7].setRotationPoint(-11.0F, 3.0F, -23.0F);
    
    rightTrackWheelModels[8].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[8].setRotationPoint(-26.0F, 3.0F, -23.0F);
    
    rightTrackWheelModels[9].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[9].setRotationPoint(-42.0F, 3.0F, -23.0F);
    
    rightTrackWheelModels[10].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[10].setRotationPoint(-57.0F, 3.0F, -23.0F);
    
    rightTrackWheelModels[11].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[11].setRotationPoint(-73.0F, 3.0F, -23.0F);
    
    rightTrackWheelModels[12].addShape3D(2.5F, -2.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    rightTrackWheelModels[12].setRotationPoint(16.0F, -14.0F, -23.0F);
    
    rightTrackWheelModels[13].addShape3D(2.5F, -2.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    rightTrackWheelModels[13].setRotationPoint(-7.0F, -13.75F, -23.0F);

    
    leftTrackModel = new ModelRendererTurbo[22];
    leftTrackModel[0] = new ModelRendererTurbo(this, 513, 113, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 649, 105, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 825, 105, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 249, 121, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 961, 105, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 73, 113, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 601, 121, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 161, 113, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 849, 113, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 921, 113, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 953, 121, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 1, 129, textureX, textureY);
    leftTrackModel[12] = new ModelRendererTurbo(this, 105, 121, textureX, textureY);
    leftTrackModel[13] = new ModelRendererTurbo(this, 185, 121, textureX, textureY);
    leftTrackModel[14] = new ModelRendererTurbo(this, 881, 121, textureX, textureY);
    leftTrackModel[15] = new ModelRendererTurbo(this, 137, 129, textureX, textureY);
    leftTrackModel[16] = new ModelRendererTurbo(this, 185, 137, textureX, textureY);
    leftTrackModel[17] = new ModelRendererTurbo(this, 489, 129, textureX, textureY);
    leftTrackModel[18] = new ModelRendererTurbo(this, 553, 129, textureX, textureY);
    leftTrackModel[19] = new ModelRendererTurbo(this, 825, 129, textureX, textureY);
    leftTrackModel[20] = new ModelRendererTurbo(this, 913, 129, textureX, textureY);
    leftTrackModel[21] = new ModelRendererTurbo(this, 585, 137, textureX, textureY);
    
    leftTrackModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 37, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[0].setRotationPoint(14.5F, -18.5F, 17.0F);
    
    leftTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 10, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[1].setRotationPoint(51.5F, -18.5F, 17.0F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[2].setRotationPoint(58.5F, -11.5F, 17.0F);
    (leftTrackModel[2]).rotateAngleZ = -1.5707964F;
    
    leftTrackModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 113, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[3].setRotationPoint(-75.0F, 8.0F, 17.0F);
    
    leftTrackModel[4].addShapeBox(0.0F, -2.0F, 0.0F, 17, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[4].setRotationPoint(38.0F, 10.0F, 17.0F);
    (leftTrackModel[4]).rotateAngleZ = 0.6230825F;
    
    leftTrackModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 9, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[5].setRotationPoint(58.5F, -6.5F, 17.0F);
    (leftTrackModel[5]).rotateAngleZ = -2.3561945F;
    
    leftTrackModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 107, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[6].setRotationPoint(-92.5F, -16.5F, 17.0F);
    (leftTrackModel[6]).rotateAngleZ = 0.01867502F;
    
    leftTrackModel[7].addShapeBox(0.0F, -2.0F, 0.0F, 5, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[7].setRotationPoint(-99.5F, -9.5F, 17.0F);
    (leftTrackModel[7]).rotateAngleZ = -1.5707964F;
    
    leftTrackModel[8].addShapeBox(-9.0F, 0.0F, 0.0F, 9, 2, 8, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
    leftTrackModel[8].setRotationPoint(-99.5F, -4.5F, 17.0F);
    (leftTrackModel[8]).rotateAngleZ = 2.3561945F;
    
    leftTrackModel[9].addShapeBox(-10.0F, 0.0F, 0.0F, 10, 2, 8, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
    leftTrackModel[9].setRotationPoint(-92.5F, -16.5F, 17.0F);
    (leftTrackModel[9]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[10].addShapeBox(-20.0F, -2.0F, 0.0F, 20, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[10].setRotationPoint(-75.0F, 10.0F, 17.0F);
    (leftTrackModel[10]).rotateAngleZ = -0.4223697F;
    
    leftTrackModel[11].addShapeBox(0.0F, 0.0F, -8.0F, 37, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[11].setRotationPoint(14.5F, -18.5F, -17.0F);
    
    leftTrackModel[12].addShapeBox(0.0F, 0.0F, -8.0F, 10, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[12].setRotationPoint(51.5F, -18.5F, -17.0F);
    (leftTrackModel[12]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[13].addShapeBox(0.0F, 0.0F, -8.0F, 5, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[13].setRotationPoint(58.5F, -11.5F, -17.0F);
    (leftTrackModel[13]).rotateAngleZ = -1.5707964F;
    
    leftTrackModel[14].addShapeBox(0.0F, 0.0F, -8.0F, 9, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[14].setRotationPoint(58.5F, -6.5F, -17.0F);
    (leftTrackModel[14]).rotateAngleZ = -2.3561945F;
    
    leftTrackModel[15].addShapeBox(0.0F, -2.0F, -8.0F, 17, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[15].setRotationPoint(38.0F, 10.0F, -17.0F);
    (leftTrackModel[15]).rotateAngleZ = 0.6230825F;
    
    leftTrackModel[16].addShapeBox(0.0F, 0.0F, -8.0F, 113, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[16].setRotationPoint(-75.0F, 8.0F, -17.0F);
    
    leftTrackModel[17].addShapeBox(-20.0F, -2.0F, -8.0F, 20, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[17].setRotationPoint(-75.0F, 10.0F, -17.0F);
    (leftTrackModel[17]).rotateAngleZ = -0.4223697F;
    
    leftTrackModel[18].addShapeBox(-9.0F, 0.0F, -8.0F, 9, 2, 8, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
    leftTrackModel[18].setRotationPoint(-99.5F, -4.5F, -17.0F);
    (leftTrackModel[18]).rotateAngleZ = 2.3561945F;
    
    leftTrackModel[19].addShapeBox(0.0F, -2.0F, -8.0F, 5, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[19].setRotationPoint(-99.5F, -9.5F, -17.0F);
    (leftTrackModel[19]).rotateAngleZ = -1.5707964F;
    
    leftTrackModel[20].addShapeBox(-10.0F, 0.0F, -8.0F, 10, 2, 8, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F);
    leftTrackModel[20].setRotationPoint(-92.5F, -16.5F, -17.0F);
    (leftTrackModel[20]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[21].addShapeBox(0.0F, 0.0F, -8.0F, 107, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[21].setRotationPoint(-92.5F, -16.5F, -17.0F);
    (leftTrackModel[21]).rotateAngleZ = 0.01867502F;

    
    rightTrackModel = new ModelRendererTurbo[3];
    rightTrackModel[0] = new ModelRendererTurbo(this, 249, 222, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 225, 222, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 225, 234, textureX, textureY);
    
    rightTrackModel[0].addShape3D(2.5F, -2.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    rightTrackModel[0].setRotationPoint(-28.0F, -13.5F, -23.0F);
    
    rightTrackModel[1].addShape3D(2.5F, -2.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    rightTrackModel[1].setRotationPoint(-53.0F, -13.25F, -23.0F);
    
    rightTrackModel[2].addShape3D(2.5F, -2.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1) }), 4.0F, 5, 5, 20, 4, 0, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    rightTrackModel[2].setRotationPoint(-78.0F, -13.0F, -23.0F);
    
    
    trailerModel = new ModelRendererTurbo[14];
    trailerModel[0] = new ModelRendererTurbo(this, 873, 193, textureX, textureY);
    trailerModel[1] = new ModelRendererTurbo(this, 297, 201, textureX, textureY);
    trailerModel[2] = new ModelRendererTurbo(this, 353, 201, textureX, textureY);
    trailerModel[3] = new ModelRendererTurbo(this, 449, 185, textureX, textureY);
    trailerModel[4] = new ModelRendererTurbo(this, 769, 185, textureX, textureY);
    trailerModel[5] = new ModelRendererTurbo(this, 985, 177, textureX, textureY);
    trailerModel[6] = new ModelRendererTurbo(this, 1, 73, textureX, textureY);
    trailerModel[7] = new ModelRendererTurbo(this, 185, 113, textureX, textureY);
    trailerModel[8] = new ModelRendererTurbo(this, 665, 17, textureX, textureY);
    trailerModel[9] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY);
    trailerModel[10] = new ModelRendererTurbo(this, 313, 25, textureX, textureY);
    trailerModel[11] = new ModelRendererTurbo(this, 393, 25, textureX, textureY);
    trailerModel[12] = new ModelRendererTurbo(this, 233, 65, textureX, textureY);
    trailerModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY);
    
    trailerModel[0].addBox(-10.0F, -5.0F, -4.0F, 20, 11, 8, 0.0F);
    trailerModel[0].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[1].addShapeBox(-10.0F, -5.0F, 4.0F, 20, 11, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
    trailerModel[1].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[2].addShapeBox(-10.0F, -5.0F, -10.0F, 20, 11, 6, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    trailerModel[2].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[3].addBox(8.0F, -4.0F, -6.0F, 2, 7, 12, 0.0F);
    trailerModel[3].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[4].addShapeBox(10.0F, -4.0F, -6.0F, 2, 7, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    trailerModel[4].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[5].addBox(-7.0F, -5.25F, -6.0F, 7, 1, 12, 0.0F);
    trailerModel[5].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[6].addShapeBox(-7.0F, -5.25F, -9.0F, 7, 1, 3, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    trailerModel[6].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[7].addShapeBox(-7.0F, -5.25F, 6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    trailerModel[7].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[8].addBox(-1.0F, -5.5F, -8.0F, 2, 1, 1, 0.0F);
    trailerModel[8].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[9].addBox(-1.0F, -5.5F, -2.0F, 2, 1, 1, 0.0F);
    trailerModel[9].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[10].addBox(-1.0F, -5.5F, 1.0F, 2, 1, 1, 0.0F);
    trailerModel[10].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[11].addBox(-1.0F, -5.5F, 7.0F, 2, 1, 1, 0.0F);
    trailerModel[11].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[12].addBox(3.0F, -6.5F, 4.0F, 2, 2, 2, 0.0F);
    trailerModel[12].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    trailerModel[13].addBox(3.5F, -7.5F, 4.5F, 1, 2, 1, 0.0F);
    trailerModel[13].setRotationPoint(26.5F, -26.0F, -8.0F);

    
    bodyDoorCloseModel = new ModelRendererTurbo[5];
    
    bodyDoorCloseModel = new ModelRendererTurbo[5];
    bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 849, 105, textureX, textureY);
    bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 441, 81, textureX, textureY);
    bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 993, 73, textureX, textureY);
    bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 625, 81, textureX, textureY);
    bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 369, 9, textureX, textureY);
    
    bodyDoorCloseModel[0].addShapeBox(0.0F, -2.0F, -1.5F, 6, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyDoorCloseModel[0].setRotationPoint(36.5F, -26.0F, -8.0F);
    
    bodyDoorCloseModel[1].addShapeBox(6.0F, -2.0F, -1.5F, 5, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    bodyDoorCloseModel[1].setRotationPoint(36.5F, -26.0F, -8.0F);
    
    bodyDoorCloseModel[2].addShapeBox(11.0F, -1.5F, -1.0F, 11, 2, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    bodyDoorCloseModel[2].setRotationPoint(36.5F, -26.0F, -8.0F);
    
    bodyDoorCloseModel[3].addShapeBox(0.0F, -1.0F, -2.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyDoorCloseModel[3].setRotationPoint(36.5F, -26.0F, -8.0F);
    
    bodyDoorCloseModel[4].addShapeBox(3.0F, 2.0F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyDoorCloseModel[4].setRotationPoint(36.5F, -26.0F, -8.0F);


    
    for (ModelRendererTurbo noseGunPart : trailerModel)
      noseGunPart.setRotationPoint(26.0F, -26.0F, -8.0F); 
    for (ModelRendererTurbo noseGunPart : bodyDoorCloseModel) {
      noseGunPart.setRotationPoint(36.0F, -26.0F, -8.0F);
    }
    //registerGunModel("Nose", noseGunModel);
    
    
    bodyDoorOpenModel = new ModelRendererTurbo[14];
    bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 873, 193, textureX, textureY);
    bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 297, 201, textureX, textureY);
    bodyDoorOpenModel[2] = new ModelRendererTurbo(this, 353, 201, textureX, textureY);
    bodyDoorOpenModel[3] = new ModelRendererTurbo(this, 449, 185, textureX, textureY);
    bodyDoorOpenModel[4] = new ModelRendererTurbo(this, 769, 185, textureX, textureY);
    bodyDoorOpenModel[5] = new ModelRendererTurbo(this, 985, 177, textureX, textureY);
    bodyDoorOpenModel[6] = new ModelRendererTurbo(this, 1, 73, textureX, textureY);
    bodyDoorOpenModel[7] = new ModelRendererTurbo(this, 185, 113, textureX, textureY);
    bodyDoorOpenModel[8] = new ModelRendererTurbo(this, 665, 17, textureX, textureY);
    bodyDoorOpenModel[9] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY);
    bodyDoorOpenModel[10] = new ModelRendererTurbo(this, 313, 25, textureX, textureY);
    bodyDoorOpenModel[11] = new ModelRendererTurbo(this, 393, 25, textureX, textureY);
    bodyDoorOpenModel[12] = new ModelRendererTurbo(this, 233, 65, textureX, textureY);
    bodyDoorOpenModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY);
    
    bodyDoorOpenModel[0].addBox(-10.0F, -5.0F, -4.0F, 20, 11, 8, 0.0F);
    bodyDoorOpenModel[0].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[1].addShapeBox(-10.0F, -5.0F, 4.0F, 20, 11, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F);
    bodyDoorOpenModel[1].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[2].addShapeBox(-10.0F, -5.0F, -10.0F, 20, 11, 6, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyDoorOpenModel[2].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[3].addBox(8.0F, -4.0F, -6.0F, 2, 7, 12, 0.0F);
    bodyDoorOpenModel[3].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[4].addShapeBox(10.0F, -4.0F, -6.0F, 2, 7, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyDoorOpenModel[4].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[5].addBox(-7.0F, -5.25F, -6.0F, 7, 1, 12, 0.0F);
    bodyDoorOpenModel[5].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[6].addShapeBox(-7.0F, -5.25F, -9.0F, 7, 1, 3, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyDoorOpenModel[6].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[7].addShapeBox(-7.0F, -5.25F, 6.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyDoorOpenModel[7].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[8].addBox(-1.0F, -5.5F, -8.0F, 2, 1, 1, 0.0F);
    bodyDoorOpenModel[8].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[9].addBox(-1.0F, -5.5F, -2.0F, 2, 1, 1, 0.0F);
    bodyDoorOpenModel[9].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[10].addBox(-1.0F, -5.5F, 1.0F, 2, 1, 1, 0.0F);
    bodyDoorOpenModel[10].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[11].addBox(-1.0F, -5.5F, 7.0F, 2, 1, 1, 0.0F);
    bodyDoorOpenModel[11].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[12].addBox(3.0F, -6.5F, 4.0F, 2, 2, 2, 0.0F);
    bodyDoorOpenModel[12].setRotationPoint(26.5F, -26.0F, -8.0F);
    
    bodyDoorOpenModel[13].addBox(3.5F, -7.5F, 4.5F, 1, 2, 1, 0.0F);
    bodyDoorOpenModel[13].setRotationPoint(26.5F, -26.0F, -8.0F);

    
    steeringWheelModel = new ModelRendererTurbo[5];
    steeringWheelModel[0] = new ModelRendererTurbo(this, 849, 105, textureX, textureY);
    steeringWheelModel[1] = new ModelRendererTurbo(this, 441, 81, textureX, textureY);
    steeringWheelModel[2] = new ModelRendererTurbo(this, 993, 73, textureX, textureY);
    steeringWheelModel[3] = new ModelRendererTurbo(this, 625, 81, textureX, textureY);
    steeringWheelModel[4] = new ModelRendererTurbo(this, 369, 9, textureX, textureY);
    
    steeringWheelModel[0].addShapeBox(0.0F, -2.0F, -1.5F, 6, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    steeringWheelModel[0].setRotationPoint(36.5F, -26.0F, -8.0F);
    
    steeringWheelModel[1].addShapeBox(6.0F, -2.0F, -1.5F, 5, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    steeringWheelModel[1].setRotationPoint(36.5F, -26.0F, -8.0F);
    
    steeringWheelModel[2].addShapeBox(11.0F, -1.5F, -1.0F, 11, 2, 2, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    steeringWheelModel[2].setRotationPoint(36.5F, -26.0F, -8.0F);
    
    steeringWheelModel[3].addShapeBox(0.0F, -1.0F, -2.0F, 4, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    steeringWheelModel[3].setRotationPoint(36.5F, -26.0F, -8.0F);
    
    steeringWheelModel[4].addShapeBox(3.0F, 2.0F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    steeringWheelModel[4].setRotationPoint(36.5F, -26.0F, -8.0F);

    
    for (ModelRendererTurbo noseGunPart : bodyDoorOpenModel)
      noseGunPart.setRotationPoint(-26.0F, -26.0F, 8.0F); 
    for (ModelRendererTurbo noseGunPart : steeringWheelModel) {
      noseGunPart.setRotationPoint(-16.0F, -26.0F, 8.0F);
    }
    //registerGunModel("Nose2", noseGun2Model);
    
    frontWheelModel = new ModelRendererTurbo[7];
    frontWheelModel[0] = new ModelRendererTurbo(this, 1, 193, textureX, textureY);
    frontWheelModel[1] = new ModelRendererTurbo(this, 89, 193, textureX, textureY);
    frontWheelModel[2] = new ModelRendererTurbo(this, 409, 201, textureX, textureY);
    frontWheelModel[3] = new ModelRendererTurbo(this, 641, 201, textureX, textureY);
    frontWheelModel[4] = new ModelRendererTurbo(this, 673, 201, textureX, textureY);
    frontWheelModel[5] = new ModelRendererTurbo(this, 817, 25, textureX, textureY);
    frontWheelModel[6] = new ModelRendererTurbo(this, 833, 25, textureX, textureY);
    
    frontWheelModel[0].addBox(-3.0F, -9.0F, -7.5F, 5, 9, 15, 0.0F);
    frontWheelModel[0].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    frontWheelModel[1].addShapeBox(-8.0F, -9.0F, -7.5F, 5, 9, 15, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F);
    frontWheelModel[1].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    frontWheelModel[2].addShapeBox(2.0F, -1.0F, -7.5F, 5, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    frontWheelModel[2].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    frontWheelModel[3].addShapeBox(2.0F, -9.0F, -7.5F, 6, 8, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    frontWheelModel[3].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    frontWheelModel[4].addShapeBox(-5.0F, -9.2F, -4.5F, 5, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    frontWheelModel[4].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    frontWheelModel[5].addShapeBox(-1.0F, -9.5F, -3.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    frontWheelModel[5].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    frontWheelModel[6].addShapeBox(-1.0F, -9.5F, 2.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    frontWheelModel[6].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    backWheelModel = new ModelRendererTurbo[6];
    backWheelModel[0] = new ModelRendererTurbo(this, 289, 65, textureX, textureY);
    backWheelModel[1] = new ModelRendererTurbo(this, 497, 65, textureX, textureY);
    backWheelModel[2] = new ModelRendererTurbo(this, 529, 65, textureX, textureY);
    backWheelModel[3] = new ModelRendererTurbo(this, 561, 65, textureX, textureY);
    backWheelModel[4] = new ModelRendererTurbo(this, 961, 49, textureX, textureY);
    backWheelModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY);

    
    backWheelModel[0].addBox(-1.0F, -1.0F, -2.0F, 2, 2, 4, 0.0F);
    backWheelModel[0].setRotationPoint(30.0F, -24.5F, 9.0F);
    
    backWheelModel[1].addShapeBox(-1.0F, -2.0F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    backWheelModel[1].setRotationPoint(30.0F, -24.5F, 9.0F);
    
    backWheelModel[2].addShapeBox(-1.0F, 1.0F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    backWheelModel[2].setRotationPoint(30.0F, -24.5F, 9.0F);
    
    backWheelModel[3].addShapeBox(-0.5F, -0.5F, -0.5F, 7, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    backWheelModel[3].setRotationPoint(30.0F, -24.5F, 9.0F);
    
    backWheelModel[4].addShapeBox(-0.5F, 0.5F, -0.5F, 5, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    backWheelModel[4].setRotationPoint(30.0F, -24.5F, 9.0F);
    
    backWheelModel[5].addShapeBox(3.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F);
    backWheelModel[5].setRotationPoint(30.0F, -24.5F, 9.0F);

    
    for (ModelRendererTurbo noseGunPart : frontWheelModel)
      noseGunPart.setRotationPoint(22.0F, -20.0F, 11.0F); 
    for (ModelRendererTurbo noseGunPart : backWheelModel) {
      noseGunPart.setRotationPoint(30.0F, -24.0F, 9.0F);
    }
    //registerGunModel("Nose3", noseGun3Model);

    
    leftFrontWheelModel = new ModelRendererTurbo[7];
    leftFrontWheelModel[0] = new ModelRendererTurbo(this, 1, 193, textureX, textureY);
    leftFrontWheelModel[1] = new ModelRendererTurbo(this, 89, 193, textureX, textureY);
    leftFrontWheelModel[2] = new ModelRendererTurbo(this, 409, 201, textureX, textureY);
    leftFrontWheelModel[3] = new ModelRendererTurbo(this, 641, 201, textureX, textureY);
    leftFrontWheelModel[4] = new ModelRendererTurbo(this, 673, 201, textureX, textureY);
    leftFrontWheelModel[5] = new ModelRendererTurbo(this, 817, 25, textureX, textureY);
    leftFrontWheelModel[6] = new ModelRendererTurbo(this, 833, 25, textureX, textureY);
    
    leftFrontWheelModel[0].addBox(-3.0F, -9.0F, -7.5F, 5, 9, 15, 0.0F);
    leftFrontWheelModel[0].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    leftFrontWheelModel[1].addShapeBox(-8.0F, -9.0F, -7.5F, 5, 9, 15, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F);
    leftFrontWheelModel[1].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    leftFrontWheelModel[2].addShapeBox(2.0F, -1.0F, -7.5F, 5, 1, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    leftFrontWheelModel[2].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    leftFrontWheelModel[3].addShapeBox(2.0F, -9.0F, -7.5F, 6, 8, 15, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    leftFrontWheelModel[3].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    leftFrontWheelModel[4].addShapeBox(-5.0F, -9.2F, -4.5F, 5, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftFrontWheelModel[4].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    leftFrontWheelModel[5].addShapeBox(-1.0F, -9.5F, -3.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftFrontWheelModel[5].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    leftFrontWheelModel[6].addShapeBox(-1.0F, -9.5F, 2.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftFrontWheelModel[6].setRotationPoint(22.0F, -20.0F, 11.0F);
    
    rightFrontWheelModel = new ModelRendererTurbo[6];
    rightFrontWheelModel[0] = new ModelRendererTurbo(this, 289, 65, textureX, textureY);
    rightFrontWheelModel[1] = new ModelRendererTurbo(this, 497, 65, textureX, textureY);
    rightFrontWheelModel[2] = new ModelRendererTurbo(this, 529, 65, textureX, textureY);
    rightFrontWheelModel[3] = new ModelRendererTurbo(this, 561, 65, textureX, textureY);
    rightFrontWheelModel[4] = new ModelRendererTurbo(this, 961, 49, textureX, textureY);
    rightFrontWheelModel[5] = new ModelRendererTurbo(this, 273, 1, textureX, textureY);

    
    rightFrontWheelModel[0].addBox(-1.0F, -1.0F, -2.0F, 2, 2, 4, 0.0F);
    rightFrontWheelModel[0].setRotationPoint(30.0F, -24.5F, 9.0F);
    
    rightFrontWheelModel[1].addShapeBox(-1.0F, -2.0F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightFrontWheelModel[1].setRotationPoint(30.0F, -24.5F, 9.0F);
    
    rightFrontWheelModel[2].addShapeBox(-1.0F, 1.0F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    rightFrontWheelModel[2].setRotationPoint(30.0F, -24.5F, 9.0F);
    
    rightFrontWheelModel[3].addShapeBox(-0.5F, -0.5F, -0.5F, 7, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    rightFrontWheelModel[3].setRotationPoint(30.0F, -24.5F, 9.0F);
    
    rightFrontWheelModel[4].addShapeBox(-0.5F, 0.5F, -0.5F, 5, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    rightFrontWheelModel[4].setRotationPoint(30.0F, -24.5F, 9.0F);
    
    rightFrontWheelModel[5].addShapeBox(3.5F, -0.5F, -0.5F, 1, 2, 1, 0.0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F);
    rightFrontWheelModel[5].setRotationPoint(30.0F, -24.5F, 9.0F);

    
    for (ModelRendererTurbo noseGunPart : leftFrontWheelModel)
      noseGunPart.setRotationPoint(-22.0F, -20.0F, -11.0F); 
    for (ModelRendererTurbo noseGunPart : rightFrontWheelModel) {
      noseGunPart.setRotationPoint(-14.0F, -24.0F, -13.0F);
    }
    //registerGunModel("Nose4", noseGun4Model);
    
    translateAll(0.0F, 0.0F, 0.0F);

    
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
		for(int i = 0; i < trailerModel.length; i++)
		{
			trailerModel[i].render(f5);
		}
		for(int i = 0; i < bodyDoorCloseModel.length; i++)
		{
			bodyDoorCloseModel[i].render(f5);
		}
		for(int i = 0; i < bodyDoorOpenModel.length; i++)
		{
			bodyDoorOpenModel[i].render(f5);
		}
		for(int i = 0; i < steeringWheelModel.length; i++)
		{
			steeringWheelModel[i].render(f5);
		}
		for(int i = 0; i < frontWheelModel.length; i++)
		{
			frontWheelModel[i].render(f5);
		}
		for(int i = 0; i < backWheelModel.length; i++)
		{
			backWheelModel[i].render(f5);
		}
		for(int i = 0; i < leftFrontWheelModel.length; i++)
		{
			leftFrontWheelModel[i].render(f5);
		}
		for(int i = 0; i < rightFrontWheelModel.length; i++)
		{
			rightFrontWheelModel[i].render(f5);
		}
	}
}
