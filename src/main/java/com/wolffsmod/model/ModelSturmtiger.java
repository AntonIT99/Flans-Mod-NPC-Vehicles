package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelSturmtiger
  extends ModelVehicle {
  int textureX = 512;
  int textureY = 512;

  
  public ModelSturmtiger() {
    bodyModel = new ModelRendererTurbo[168];
    bodyModel[0] = new ModelRendererTurbo(this, 418, 267, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 321, 1, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 249, 49, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 1, 65, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 1, 158, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 217, 97, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 1, 106, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 201, 121, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 289, 1, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 369, 1, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 1, 129, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 1, 137, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 218, 1, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 236, 1, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 1, 145, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 1, 153, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 289, 1, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 329, 1, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 409, 1, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 449, 1, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 191, 3, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 192, 16, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 206, 37, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 174, 3, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 119, 351, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 77, 351, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 132, 40, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 469, 179, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 469, 165, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 443, 179, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 443, 165, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 463, 151, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 463, 137, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 462, 123, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 462, 110, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 205, 152, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 169, 140, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 152, 140, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 135, 140, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 118, 140, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 101, 140, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 84, 140, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 67, 140, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 52, 140, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 461, 97, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 410, 97, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 410, 123, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 410, 110, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 435, 110, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 435, 123, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 435, 97, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 146, 29, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 35, 140, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 18, 140, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 1, 140, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 222, 152, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 282, 44, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 265, 44, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 10, 92, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 10, 88, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 301, 24, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 10, 83, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 127, 1, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 156, 19, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 135, 19, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 114, 19, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 164, 9, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 258, 143, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 92, 172, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 92, 179, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 1, 35, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 27, 38, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 3, 161, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 70, 19, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 1, 215, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 490, 97, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 14, 38, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 63, 19, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 62, 233, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 33, 23, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 33, 26, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 31, 8, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 31, 11, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 63, 19, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 387, 162, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 396, 17, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 31, 14, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 31, 17, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 231, 224, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 33, 32, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 33, 35, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 166, 334, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 104, 284, textureX, textureY);
    bodyModel[94] = new ModelRendererTurbo(this, 166, 316, textureX, textureY);
    bodyModel[95] = new ModelRendererTurbo(this, 64, 214, textureX, textureY);
    bodyModel[96] = new ModelRendererTurbo(this, 448, 17, textureX, textureY);
    bodyModel[97] = new ModelRendererTurbo(this, 95, 61, textureX, textureY);
    bodyModel[98] = new ModelRendererTurbo(this, 363, 186, textureX, textureY);
    bodyModel[99] = new ModelRendererTurbo(this, 266, 1, textureX, textureY);
    bodyModel[100] = new ModelRendererTurbo(this, 321, 23, textureX, textureY);
    bodyModel[101] = new ModelRendererTurbo(this, 445, 194, textureX, textureY);
    bodyModel[102] = new ModelRendererTurbo(this, 410, 136, textureX, textureY);
    bodyModel[103] = new ModelRendererTurbo(this, 11, 9, textureX, textureY);
    bodyModel[104] = new ModelRendererTurbo(this, 287, 162, textureX, textureY);
    bodyModel[105] = new ModelRendererTurbo(this, 259, 162, textureX, textureY);
    bodyModel[106] = new ModelRendererTurbo(this, 22, 1, textureX, textureY);
    bodyModel[107] = new ModelRendererTurbo(this, 22, 5, textureX, textureY);
    bodyModel[108] = new ModelRendererTurbo(this, 40, 40, textureX, textureY);
    bodyModel[109] = new ModelRendererTurbo(this, 40, 45, textureX, textureY);
    bodyModel[110] = new ModelRendererTurbo(this, 83, 20, textureX, textureY);
    bodyModel[111] = new ModelRendererTurbo(this, 243, 71, textureX, textureY);
    bodyModel[112] = new ModelRendererTurbo(this, 40, 50, textureX, textureY);
    bodyModel[113] = new ModelRendererTurbo(this, 63, 3, textureX, textureY);
    bodyModel[114] = new ModelRendererTurbo(this, 10, 69, textureX, textureY);
    bodyModel[115] = new ModelRendererTurbo(this, 419, 163, textureX, textureY);
    bodyModel[116] = new ModelRendererTurbo(this, 86, 60, textureX, textureY);
    bodyModel[117] = new ModelRendererTurbo(this, 77, 60, textureX, textureY);
    bodyModel[118] = new ModelRendererTurbo(this, 68, 60, textureX, textureY);
    bodyModel[119] = new ModelRendererTurbo(this, 59, 60, textureX, textureY);
    bodyModel[120] = new ModelRendererTurbo(this, 50, 60, textureX, textureY);
    bodyModel[121] = new ModelRendererTurbo(this, 41, 60, textureX, textureY);
    bodyModel[122] = new ModelRendererTurbo(this, 224, 246, textureX, textureY);
    bodyModel[123] = new ModelRendererTurbo(this, 223, 269, textureX, textureY);
    bodyModel[124] = new ModelRendererTurbo(this, 326, 270, textureX, textureY);
    bodyModel[125] = new ModelRendererTurbo(this, 326, 248, textureX, textureY);
    bodyModel[126] = new ModelRendererTurbo(this, 156, 212, textureX, textureY);
    bodyModel[127] = new ModelRendererTurbo(this, 212, 250, textureX, textureY);
    bodyModel[128] = new ModelRendererTurbo(this, 185, 212, textureX, textureY);
    bodyModel[129] = new ModelRendererTurbo(this, 153, 246, textureX, textureY);
    bodyModel[130] = new ModelRendererTurbo(this, 336, 223, textureX, textureY);
    bodyModel[131] = new ModelRendererTurbo(this, 318, 223, textureX, textureY);
    bodyModel[132] = new ModelRendererTurbo(this, 388, 218, textureX, textureY);
    bodyModel[133] = new ModelRendererTurbo(this, 431, 222, textureX, textureY);
    bodyModel[134] = new ModelRendererTurbo(this, 440, 229, textureX, textureY);
    bodyModel[135] = new ModelRendererTurbo(this, 440, 222, textureX, textureY);
    bodyModel[136] = new ModelRendererTurbo(this, 431, 233, textureX, textureY);
    bodyModel[137] = new ModelRendererTurbo(this, 411, 240, textureX, textureY);
    bodyModel[138] = new ModelRendererTurbo(this, 12, 219, textureX, textureY);
    bodyModel[139] = new ModelRendererTurbo(this, 435, 238, textureX, textureY);
    bodyModel[140] = new ModelRendererTurbo(this, 482, 222, textureX, textureY);
    bodyModel[141] = new ModelRendererTurbo(this, 453, 222, textureX, textureY);
    bodyModel[142] = new ModelRendererTurbo(this, 490, 249, textureX, textureY);
    bodyModel[143] = new ModelRendererTurbo(this, 478, 249, textureX, textureY);
    bodyModel[144] = new ModelRendererTurbo(this, 463, 247, textureX, textureY);
    bodyModel[145] = new ModelRendererTurbo(this, 273, 180, textureX, textureY);
    bodyModel[146] = new ModelRendererTurbo(this, 336, 182, textureX, textureY);
    bodyModel[147] = new ModelRendererTurbo(this, 327, 193, textureX, textureY);
    bodyModel[148] = new ModelRendererTurbo(this, 300, 193, textureX, textureY);
    bodyModel[149] = new ModelRendererTurbo(this, 273, 193, textureX, textureY);
    bodyModel[150] = new ModelRendererTurbo(this, 322, 195, textureX, textureY);
    bodyModel[151] = new ModelRendererTurbo(this, 127, 212, textureX, textureY);
    bodyModel[152] = new ModelRendererTurbo(this, 112, 231, textureX, textureY);
    bodyModel[153] = new ModelRendererTurbo(this, 112, 217, textureX, textureY);
    bodyModel[154] = new ModelRendererTurbo(this, 127, 234, textureX, textureY);
    bodyModel[155] = new ModelRendererTurbo(this, 296, 296, textureX, textureY);
    bodyModel[156] = new ModelRendererTurbo(this, 280, 296, textureX, textureY);
    bodyModel[157] = new ModelRendererTurbo(this, 263, 295, textureX, textureY);
    bodyModel[158] = new ModelRendererTurbo(this, 267, 180, textureX, textureY);
    bodyModel[159] = new ModelRendererTurbo(this, 273, 180, textureX, textureY);
    bodyModel[160] = new ModelRendererTurbo(this, 273, 186, textureX, textureY);
    bodyModel[161] = new ModelRendererTurbo(this, 272, 206, textureX, textureY);
    bodyModel[162] = new ModelRendererTurbo(this, 267, 176, textureX, textureY);
    bodyModel[163] = new ModelRendererTurbo(this, 273, 183, textureX, textureY);
    bodyModel[164] = new ModelRendererTurbo(this, 273, 192, textureX, textureY);
    bodyModel[165] = new ModelRendererTurbo(this, 290, 193, textureX, textureY);
    bodyModel[166] = new ModelRendererTurbo(this, 211, 247, textureX, textureY);
    bodyModel[167] = new ModelRendererTurbo(this, 211, 247, textureX, textureY);
    
    bodyModel[0].addShapeBox(0.0F, 0.0F, -16.0F, 14, 15, 32, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[0].setRotationPoint(37.0F, -12.0F, 0.0F);
    
    bodyModel[1].addShapeBox(0.0F, 0.0F, -16.0F, 4, 15, 32, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(36.0F, -12.0F, 0.0F);
    
    bodyModel[2].addShapeBox(0.0F, 0.0F, -16.0F, 78, 15, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(-42.0F, -12.0F, 0.0F);
    
    bodyModel[3].addShapeBox(0.0F, 0.0F, -16.0F, 77, 7, 32, 0.0F, 0.0F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[3].setRotationPoint(-42.0F, -19.0F, 0.0F);
    
    bodyModel[4].addShapeBox(0.0F, 0.0F, -16.0F, 5, 22, 32, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F);
    bodyModel[4].setRotationPoint(-47.0F, -19.0F, 0.0F);
    
    bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 82, 11, 10, 0.0F, 0.0F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, -1.1F, 0.0F, 0.0F);
    bodyModel[5].setRotationPoint(-47.0F, -19.0F, 16.0F);
    
    bodyModel[6].addShapeBox(0.0F, 0.0F, -10.0F, 82, 11, 10, 0.0F, 0.0F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, -1.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.1F, 0.0F, 0.0F, 0.0F, -3.5F, 0.0F, 0.0F, -3.5F, 0.0F, -1.1F, 0.0F, 0.0F);
    bodyModel[6].setRotationPoint(-47.0F, -19.0F, -16.0F);
    
    bodyModel[7].addShapeBox(0.0F, 0.0F, -26.0F, 2, 2, 52, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[7].setRotationPoint(35.0F, -13.0F, 0.0F);
    
    bodyModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 14, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[8].setRotationPoint(37.0F, -13.0F, 16.0F);
    (bodyModel[8]).rotateAngleZ = -0.20943952F;
    
    bodyModel[9].addShapeBox(0.0F, 0.0F, -10.0F, 14, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[9].setRotationPoint(37.0F, -13.0F, -16.0F);
    (bodyModel[9]).rotateAngleZ = -0.20943952F;
    
    bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 82, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[10].setRotationPoint(-46.0F, -12.0F, 26.0F);
    (bodyModel[10]).rotateAngleX = -0.64053583F;
    (bodyModel[10]).rotateAngleZ = 0.04363323F;
    
    bodyModel[11].addShapeBox(0.09F, 1.0F, 3.0F, 82, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.5F, -0.2F, 0.0F, 0.5F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[11].setRotationPoint(-46.0F, -10.0F, 26.0F);
    (bodyModel[11]).rotateAngleZ = 0.04363323F;
    
    bodyModel[12].addShapeBox(0.09F, -1.0F, 0.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[12].setRotationPoint(-46.0F, -10.0F, 26.0F);
    (bodyModel[12]).rotateAngleZ = 0.04363323F;
    
    bodyModel[13].addShapeBox(81.59F, -1.0F, 0.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[13].setRotationPoint(-46.0F, -10.0F, 26.0F);
    (bodyModel[13]).rotateAngleZ = 0.04363323F;
    
    bodyModel[14].addShapeBox(0.0F, 0.0F, -5.0F, 82, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.5F, -0.4F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[14].setRotationPoint(-46.0F, -12.0F, -26.0F);
    (bodyModel[14]).rotateAngleX = 0.64053583F;
    (bodyModel[14]).rotateAngleZ = 0.04363323F;
    
    bodyModel[15].addShapeBox(0.09F, 1.0F, -4.0F, 82, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.5F, -0.2F, 0.0F, 0.5F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[15].setRotationPoint(-46.0F, -10.0F, -26.0F);
    (bodyModel[15]).rotateAngleZ = 0.04363323F;
    
    bodyModel[16].addShapeBox(0.09F, -1.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[16].setRotationPoint(-46.0F, -10.0F, -26.0F);
    (bodyModel[16]).rotateAngleZ = 0.04363323F;
    
    bodyModel[17].addShapeBox(81.59F, -1.0F, -3.0F, 1, 3, 3, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[17].setRotationPoint(-46.0F, -10.0F, -26.0F);
    (bodyModel[17]).rotateAngleZ = 0.04363323F;
    
    bodyModel[18].addShapeBox(0.0F, 0.0F, 0.0F, 14, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    bodyModel[18].setRotationPoint(37.0F, -13.0F, 26.0F);
    (bodyModel[18]).rotateAngleX = -0.17453294F;
    (bodyModel[18]).rotateAngleZ = -0.20943952F;
    
    bodyModel[19].addShapeBox(0.0F, 0.0F, -4.0F, 14, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[19].setRotationPoint(37.0F, -13.0F, -26.0F);
    (bodyModel[19]).rotateAngleX = 0.17453294F;
    (bodyModel[19]).rotateAngleZ = -0.20943952F;
    
    bodyModel[20].addShapeBox(-8.0F, 0.0F, 0.0F, 8, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[20].setRotationPoint(-46.0F, -8.5F, 16.0F);
    (bodyModel[20]).rotateAngleZ = 0.87266463F;
    
    bodyModel[21].addShapeBox(-8.0F, 0.0F, -10.0F, 8, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[21].setRotationPoint(-46.0F, -8.5F, -16.0F);
    (bodyModel[21]).rotateAngleZ = 0.87266463F;
    
    bodyModel[22].addShapeBox(-8.0F, 0.0F, 0.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    bodyModel[22].setRotationPoint(-46.0F, -8.5F, 26.0F);
    (bodyModel[22]).rotateAngleX = -0.08726646F;
    (bodyModel[22]).rotateAngleZ = 0.87266463F;
    
    bodyModel[23].addShapeBox(-8.0F, 0.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[23].setRotationPoint(-46.0F, -8.5F, -26.0F);
    (bodyModel[23]).rotateAngleX = 0.08726646F;
    (bodyModel[23]).rotateAngleZ = 0.87266463F;
    
    bodyModel[24].addShape3D(5.5F, -5.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 11, 11, 40, 2, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    bodyModel[24].setRotationPoint(43.0F, -2.0F, 17.0F);
    
    bodyModel[25].addShape3D(5.5F, -5.5F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 11, 11, 40, 2, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    bodyModel[25].setRotationPoint(43.0F, -2.0F, -17.0F);
    
    bodyModel[26].addBox(-1.5F, -1.5F, -28.0F, 3, 3, 56, 0.0F);
    bodyModel[26].setRotationPoint(43.0F, -2.0F, 0.0F);
    
    bodyModel[27].addBox(-1.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[27].setRotationPoint(-41.0F, 1.0F, 18.0F);
    
    bodyModel[28].addBox(-1.0F, -1.0F, -9.5F, 2, 2, 10, 0.0F);
    bodyModel[28].setRotationPoint(33.0F, 3.0F, 27.0F);
    
    bodyModel[29].addBox(-1.0F, -1.0F, -9.5F, 2, 2, 10, 0.0F);
    bodyModel[29].setRotationPoint(24.0F, 3.0F, 27.0F);
    
    bodyModel[30].addBox(-1.0F, -1.0F, -9.5F, 2, 2, 10, 0.0F);
    bodyModel[30].setRotationPoint(15.0F, 3.0F, 27.0F);
    
    bodyModel[31].addBox(-1.0F, -1.0F, -9.5F, 2, 2, 10, 0.0F);
    bodyModel[31].setRotationPoint(6.0F, 3.0F, 27.0F);
    
    bodyModel[32].addBox(-1.0F, -1.0F, -9.5F, 2, 2, 10, 0.0F);
    bodyModel[32].setRotationPoint(-3.0F, 3.0F, 27.0F);
    
    bodyModel[33].addBox(-1.0F, -1.0F, -9.5F, 2, 2, 10, 0.0F);
    bodyModel[33].setRotationPoint(-12.0F, 3.0F, 27.0F);
    
    bodyModel[34].addBox(-1.0F, -1.0F, -9.5F, 2, 2, 10, 0.0F);
    bodyModel[34].setRotationPoint(-21.0F, 3.0F, 27.0F);
    
    bodyModel[35].addBox(-1.0F, -1.0F, -9.5F, 2, 2, 10, 0.0F);
    bodyModel[35].setRotationPoint(-30.0F, 3.0F, 27.0F);
    
    bodyModel[36].addBox(-5.0F, -1.0F, -2.0F, 6, 2, 2, 0.0F);
    bodyModel[36].setRotationPoint(33.0F, 3.0F, 18.0F);
    (bodyModel[36]).rotateAngleZ = -0.2268928F;
    
    bodyModel[37].addBox(-5.0F, -1.0F, -2.0F, 6, 2, 2, 0.0F);
    bodyModel[37].setRotationPoint(24.0F, 3.0F, 18.0F);
    (bodyModel[37]).rotateAngleZ = -0.2268928F;
    
    bodyModel[38].addBox(-5.0F, -1.0F, -2.0F, 6, 2, 2, 0.0F);
    bodyModel[38].setRotationPoint(15.0F, 3.0F, 18.0F);
    (bodyModel[38]).rotateAngleZ = -0.2268928F;
    
    bodyModel[39].addBox(-5.0F, -1.0F, -2.0F, 6, 2, 2, 0.0F);
    bodyModel[39].setRotationPoint(6.0F, 3.0F, 18.0F);
    (bodyModel[39]).rotateAngleZ = -0.2268928F;
    
    bodyModel[40].addBox(-5.0F, -1.0F, -2.0F, 6, 2, 2, 0.0F);
    bodyModel[40].setRotationPoint(-3.0F, 3.0F, 18.0F);
    (bodyModel[40]).rotateAngleZ = -0.2268928F;
    
    bodyModel[41].addBox(-5.0F, -1.0F, -2.0F, 6, 2, 2, 0.0F);
    bodyModel[41].setRotationPoint(-12.0F, 3.0F, 18.0F);
    (bodyModel[41]).rotateAngleZ = -0.2268928F;
    
    bodyModel[42].addBox(-5.0F, -1.0F, -2.0F, 6, 2, 2, 0.0F);
    bodyModel[42].setRotationPoint(-21.0F, 3.0F, 18.0F);
    (bodyModel[42]).rotateAngleZ = -0.2268928F;
    
    bodyModel[43].addBox(-5.0F, -1.0F, -2.0F, 6, 2, 2, 0.0F);
    bodyModel[43].setRotationPoint(-30.0F, 3.0F, 18.0F);
    (bodyModel[43]).rotateAngleZ = -0.2268928F;
    
    bodyModel[44].addBox(-1.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
    bodyModel[44].setRotationPoint(-41.0F, 1.0F, 17.0F);
    (bodyModel[44]).rotateAngleZ = 0.2617994F;
    
    bodyModel[45].addBox(-1.0F, -1.0F, -0.5F, 2, 2, 10, 0.0F);
    bodyModel[45].setRotationPoint(33.0F, 3.0F, -27.0F);
    
    bodyModel[46].addBox(-1.0F, -1.0F, -0.5F, 2, 2, 10, 0.0F);
    bodyModel[46].setRotationPoint(24.0F, 3.0F, -27.0F);
    
    bodyModel[47].addBox(-1.0F, -1.0F, -0.5F, 2, 2, 10, 0.0F);
    bodyModel[47].setRotationPoint(15.0F, 3.0F, -27.0F);
    
    bodyModel[48].addBox(-1.0F, -1.0F, -0.5F, 2, 2, 10, 0.0F);
    bodyModel[48].setRotationPoint(6.0F, 3.0F, -27.0F);
    
    bodyModel[49].addBox(-1.0F, -1.0F, -0.5F, 2, 2, 10, 0.0F);
    bodyModel[49].setRotationPoint(-3.0F, 3.0F, -27.0F);
    
    bodyModel[50].addBox(-1.0F, -1.0F, -0.5F, 2, 2, 10, 0.0F);
    bodyModel[50].setRotationPoint(-12.0F, 3.0F, -27.0F);
    
    bodyModel[51].addBox(-1.0F, -1.0F, -0.5F, 2, 2, 10, 0.0F);
    bodyModel[51].setRotationPoint(-21.0F, 3.0F, -27.0F);
    
    bodyModel[52].addBox(-1.0F, -1.0F, -0.5F, 2, 2, 10, 0.0F);
    bodyModel[52].setRotationPoint(-30.0F, 3.0F, -27.0F);
    
    bodyModel[53].addBox(-5.0F, -1.0F, 0.0F, 6, 2, 2, 0.0F);
    bodyModel[53].setRotationPoint(33.0F, 3.0F, -18.0F);
    (bodyModel[53]).rotateAngleZ = -0.2268928F;
    
    bodyModel[54].addBox(-5.0F, -1.0F, 0.0F, 6, 2, 2, 0.0F);
    bodyModel[54].setRotationPoint(24.0F, 3.0F, -18.0F);
    (bodyModel[54]).rotateAngleZ = -0.2268928F;
    
    bodyModel[55].addBox(-5.0F, -1.0F, 0.0F, 6, 2, 2, 0.0F);
    bodyModel[55].setRotationPoint(15.0F, 3.0F, -18.0F);
    (bodyModel[55]).rotateAngleZ = -0.2268928F;
    
    bodyModel[56].addBox(-5.0F, -1.0F, 0.0F, 6, 2, 2, 0.0F);
    bodyModel[56].setRotationPoint(6.0F, 3.0F, -18.0F);
    (bodyModel[56]).rotateAngleZ = -0.2268928F;
    
    bodyModel[57].addBox(-5.0F, -1.0F, 0.0F, 6, 2, 2, 0.0F);
    bodyModel[57].setRotationPoint(-3.0F, 3.0F, -18.0F);
    (bodyModel[57]).rotateAngleZ = -0.2268928F;
    
    bodyModel[58].addBox(-5.0F, -1.0F, 0.0F, 6, 2, 2, 0.0F);
    bodyModel[58].setRotationPoint(-12.0F, 3.0F, -18.0F);
    (bodyModel[58]).rotateAngleZ = -0.2268928F;
    
    bodyModel[59].addBox(-5.0F, -1.0F, 0.0F, 6, 2, 2, 0.0F);
    bodyModel[59].setRotationPoint(-21.0F, 3.0F, -18.0F);
    (bodyModel[59]).rotateAngleZ = -0.2268928F;
    
    bodyModel[60].addBox(-5.0F, -1.0F, 0.0F, 6, 2, 2, 0.0F);
    bodyModel[60].setRotationPoint(-30.0F, 3.0F, -18.0F);
    (bodyModel[60]).rotateAngleZ = -0.2268928F;
    
    bodyModel[61].addBox(-1.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F);
    bodyModel[61].setRotationPoint(-41.0F, 1.0F, -18.0F);
    
    bodyModel[62].addBox(-1.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
    bodyModel[62].setRotationPoint(-41.0F, 1.0F, -17.0F);
    (bodyModel[62]).rotateAngleZ = 0.2617994F;
    
    bodyModel[63].addShapeBox(-5.0F, 10.0F, 0.0F, 5, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[63].setRotationPoint(-47.0F, -19.0F, 4.0F);
    (bodyModel[63]).rotateAngleZ = 0.10471976F;
    
    bodyModel[64].addShapeBox(-5.0F, 10.0F, -5.0F, 5, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[64].setRotationPoint(-47.0F, -19.0F, -4.0F);
    (bodyModel[64]).rotateAngleZ = 0.10471976F;
    
    bodyModel[65].addShapeBox(-5.0F, 1.0F, 0.0F, 5, 14, 5, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[65].setRotationPoint(-47.0F, -19.0F, 4.0F);
    (bodyModel[65]).rotateAngleZ = 0.10471976F;
    
    bodyModel[66].addShapeBox(-5.0F, 1.0F, -5.0F, 5, 14, 5, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[66].setRotationPoint(-47.0F, -19.0F, -4.0F);
    (bodyModel[66]).rotateAngleZ = 0.10471976F;
    
    bodyModel[67].addShapeBox(-4.5F, -1.0F, 0.5F, 4, 2, 4, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[67].setRotationPoint(-47.0F, -19.0F, 4.0F);
    (bodyModel[67]).rotateAngleZ = 0.10471976F;
    
    bodyModel[68].addShapeBox(-4.5F, -1.0F, -4.5F, 4, 2, 4, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[68].setRotationPoint(-47.0F, -19.0F, -4.0F);
    (bodyModel[68]).rotateAngleZ = 0.10471976F;
    
    bodyModel[69].addShapeBox(-5.0F, -2.0F, 0.0F, 5, 1, 5, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[69].setRotationPoint(-47.0F, -19.0F, 4.0F);
    (bodyModel[69]).rotateAngleZ = 0.10471976F;
    
    bodyModel[70].addShapeBox(-5.0F, -2.0F, -5.0F, 5, 1, 5, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[70].setRotationPoint(-47.0F, -19.0F, -4.0F);
    (bodyModel[70]).rotateAngleZ = 0.10471976F;
    
    bodyModel[71].addShapeBox(-5.0F, -3.0F, 0.0F, 5, 19, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[71].setRotationPoint(-47.0F, -19.0F, 3.0F);
    (bodyModel[71]).rotateAngleZ = 0.10471976F;
    
    bodyModel[72].addShapeBox(-5.0F, 0.0F, 6.0F, 5, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[72].setRotationPoint(-47.0F, -19.0F, 3.0F);
    (bodyModel[72]).rotateAngleZ = 0.10471976F;
    
    bodyModel[73].addShapeBox(-6.0F, -3.0F, 0.0F, 1, 19, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[73].setRotationPoint(-47.0F, -19.0F, 3.0F);
    (bodyModel[73]).rotateAngleZ = 0.10471976F;
    
    bodyModel[74].addShapeBox(-5.0F, -3.0F, 6.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[74].setRotationPoint(-47.0F, -19.0F, 3.0F);
    (bodyModel[74]).rotateAngleZ = 0.10471976F;
    
    bodyModel[75].addShapeBox(-5.0F, -3.0F, -1.0F, 5, 19, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[75].setRotationPoint(-47.0F, -19.0F, -3.0F);
    (bodyModel[75]).rotateAngleZ = 0.10471976F;
    
    bodyModel[76].addShapeBox(-6.0F, -3.0F, -7.0F, 1, 19, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[76].setRotationPoint(-47.0F, -19.0F, -3.0F);
    (bodyModel[76]).rotateAngleZ = 0.10471976F;
    
    bodyModel[77].addShapeBox(-5.0F, 0.0F, -7.0F, 5, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[77].setRotationPoint(-47.0F, -19.0F, -3.0F);
    (bodyModel[77]).rotateAngleZ = 0.10471976F;
    
    bodyModel[78].addShapeBox(-5.0F, -3.0F, -7.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[78].setRotationPoint(-47.0F, -19.0F, -3.0F);
    (bodyModel[78]).rotateAngleZ = 0.10471976F;
    
    bodyModel[79].addShapeBox(-8.0F, -1.0F, 0.0F, 8, 1, 17, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[79].setRotationPoint(-30.0F, -19.0F, 9.0F);
    
    bodyModel[80].addShapeBox(-8.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[80].setRotationPoint(-38.0F, -19.0F, 9.0F);
    
    bodyModel[81].addShapeBox(-8.0F, -1.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[81].setRotationPoint(-38.0F, -19.0F, 26.0F);
    
    bodyModel[82].addShapeBox(-11.0F, -1.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[82].setRotationPoint(-19.0F, -19.0F, 9.0F);
    
    bodyModel[83].addShapeBox(-11.0F, -1.0F, -1.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[83].setRotationPoint(-19.0F, -19.0F, 26.0F);
    
    bodyModel[84].addShapeBox(-1.0F, -1.0F, 0.0F, 1, 1, 17, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[84].setRotationPoint(-18.0F, -19.0F, 9.0F);
    
    bodyModel[85].addShapeBox(-1.0F, -1.0F, -26.0F, 1, 1, 52, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[85].setRotationPoint(-46.0F, -19.0F, 0.0F);
    
    bodyModel[86].addShapeBox(-8.0F, -1.0F, -17.0F, 8, 1, 17, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[86].setRotationPoint(-30.0F, -19.0F, -9.0F);
    
    bodyModel[87].addShapeBox(-11.0F, -1.0F, -1.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[87].setRotationPoint(-19.0F, -19.0F, -9.0F);
    
    bodyModel[88].addShapeBox(-11.0F, -1.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[88].setRotationPoint(-19.0F, -19.0F, -26.0F);
    
    bodyModel[89].addShapeBox(-1.0F, -1.0F, -17.0F, 1, 1, 17, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[89].setRotationPoint(-18.0F, -19.0F, -9.0F);
    
    bodyModel[90].addShapeBox(-8.0F, -1.0F, -1.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[90].setRotationPoint(-38.0F, -19.0F, -9.0F);
    
    bodyModel[91].addShapeBox(-8.0F, -1.0F, 0.0F, 8, 1, 1, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[91].setRotationPoint(-38.0F, -19.0F, -26.0F);
    
    bodyModel[92].addShapeBox(-11.0F, -1.0F, 0.0F, 11, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[92].setRotationPoint(-19.0F, -19.0F, 10.0F);
    
    bodyModel[93].addShapeBox(-8.0F, -1.0F, 0.0F, 8, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[93].setRotationPoint(-38.0F, -19.0F, 10.0F);
    
    bodyModel[94].addShapeBox(-11.0F, -1.0F, -15.0F, 11, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[94].setRotationPoint(-19.0F, -19.0F, -10.0F);
    
    bodyModel[95].addShapeBox(-8.0F, -1.0F, -15.0F, 8, 1, 15, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[95].setRotationPoint(-38.0F, -19.0F, -10.0F);
    
    bodyModel[96].addShapeBox(-8.0F, -1.0F, -8.5F, 8, 1, 17, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[96].setRotationPoint(-38.0F, -19.0F, 0.0F);
    
    bodyModel[97].addShapeBox(-3.0F, -1.0F, 5.0F, 3, 1, 2, 0.0F, 0.0F, 0.2F, 0.0F, -2.0F, 0.2F, 0.0F, -2.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[97].setRotationPoint(-36.0F, -19.0F, 0.0F);
    
    bodyModel[98].addShapeBox(-3.0F, -1.0F, -7.0F, 3, 1, 2, 0.0F, 0.0F, 0.2F, 0.0F, -2.0F, 0.2F, 0.0F, -2.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[98].setRotationPoint(-36.0F, -19.0F, 0.0F);
    
    bodyModel[99].addShapeBox(-2.0F, -1.0F, -4.0F, 4, 1, 8, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[99].setRotationPoint(-31.0F, -19.0F, 0.0F);
    
    bodyModel[100].addShapeBox(2.0F, -1.0F, -4.0F, 2, 1, 8, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[100].setRotationPoint(-31.0F, -19.0F, 0.0F);
    
    bodyModel[101].addShapeBox(-4.0F, -1.0F, -4.0F, 2, 1, 8, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[101].setRotationPoint(-31.0F, -19.0F, 0.0F);
    
    bodyModel[102].addShapeBox(-2.0F, -1.0F, -5.0F, 2, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[102].setRotationPoint(-23.0F, -19.0F, 0.0F);
    
    bodyModel[103].addShapeBox(0.0F, -1.0F, -2.0F, 4, 1, 4, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[103].setRotationPoint(-44.0F, -20.0F, 3.0F);
    
    bodyModel[104].addShapeBox(0.0F, -1.0F, -4.0F, 5, 1, 8, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[104].setRotationPoint(-36.5F, -19.3F, 17.5F);
    
    bodyModel[105].addShapeBox(0.0F, -1.0F, -4.0F, 5, 1, 8, 0.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[105].setRotationPoint(-36.5F, -19.3F, -17.5F);
    
    bodyModel[106].addShapeBox(0.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[106].setRotationPoint(-21.0F, -19.0F, 17.5F);
    
    bodyModel[107].addShapeBox(0.0F, -1.0F, -1.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[107].setRotationPoint(-21.0F, -19.0F, -17.5F);
    
    bodyModel[108].addShapeBox(-3.0F, 3.0F, 0.0F, 3, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[108].setRotationPoint(-47.0F, -19.0F, -23.0F);
    (bodyModel[108]).rotateAngleZ = 0.10471976F;
    
    bodyModel[109].addShapeBox(-3.0F, 3.0F, 0.0F, 3, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[109].setRotationPoint(-47.0F, -19.0F, -15.0F);
    (bodyModel[109]).rotateAngleZ = 0.10471976F;
    
    bodyModel[110].addShapeBox(-2.5F, 3.5F, -2.0F, 2, 2, 13, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[110].setRotationPoint(-47.0F, -19.0F, -23.0F);
    (bodyModel[110]).rotateAngleZ = 0.10471976F;
    
    bodyModel[111].addShapeBox(-4.5F, 3.5F, 1.0F, 2, 2, 6, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -2.0F);
    bodyModel[111].setRotationPoint(-47.0F, -19.0F, -23.0F);
    (bodyModel[111]).rotateAngleZ = 0.10471976F;
    
    bodyModel[112].addShapeBox(-2.5F, 2.5F, -3.0F, 2, 4, 1, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[112].setRotationPoint(-47.0F, -19.0F, -23.0F);
    (bodyModel[112]).rotateAngleZ = 0.10471976F;
    
    bodyModel[113].addShapeBox(-0.5F, 15.5F, -2.0F, 1, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[113].setRotationPoint(-47.0F, -19.0F, 0.0F);
    (bodyModel[113]).rotateAngleZ = 0.10471976F;
    
    bodyModel[114].addShapeBox(-0.5F, 14.5F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[114].setRotationPoint(-47.0F, -19.0F, 0.0F);
    (bodyModel[114]).rotateAngleZ = 0.10471976F;
    
    bodyModel[115].addShapeBox(-0.5F, 17.5F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[115].setRotationPoint(-47.0F, -19.0F, 0.0F);
    (bodyModel[115]).rotateAngleZ = 0.10471976F;
    
    bodyModel[116].addShapeBox(-0.5F, 16.5F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[116].setRotationPoint(-47.0F, -19.0F, 13.0F);
    (bodyModel[116]).rotateAngleZ = 0.10471976F;
    
    bodyModel[117].addShapeBox(-0.5F, 16.5F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[117].setRotationPoint(-47.0F, -19.0F, -13.0F);
    (bodyModel[117]).rotateAngleZ = 0.10471976F;
    
    bodyModel[118].addShapeBox(-0.5F, 15.5F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[118].setRotationPoint(-47.0F, -19.0F, 13.0F);
    (bodyModel[118]).rotateAngleZ = 0.10471976F;
    
    bodyModel[119].addShapeBox(-0.5F, 17.5F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[119].setRotationPoint(-47.0F, -19.0F, 13.0F);
    (bodyModel[119]).rotateAngleZ = 0.10471976F;
    
    bodyModel[120].addShapeBox(-0.5F, 15.5F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[120].setRotationPoint(-47.0F, -19.0F, -13.0F);
    (bodyModel[120]).rotateAngleZ = 0.10471976F;
    
    bodyModel[121].addShapeBox(-0.5F, 17.5F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[121].setRotationPoint(-47.0F, -19.0F, -13.0F);
    (bodyModel[121]).rotateAngleZ = 0.10471976F;
    
    bodyModel[122].addShapeBox(-2.0F, -7.0F, -26.0F, 2, 10, 10, 0.0F, 0.0F, 2.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 1.2F, -2.5F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 1.2F, -2.5F, 0.0F);
    bodyModel[122].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[122]).rotateAngleZ = 0.7853982F;
    
    bodyModel[123].addShapeBox(-2.0F, -7.0F, 16.0F, 2, 10, 10, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 2.0F, 0.2F, 1.2F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 1.2F, -2.5F, 0.2F);
    bodyModel[123].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[123]).rotateAngleZ = 0.7853982F;
    
    bodyModel[124].addShapeBox(0.0F, -16.0F, 0.0F, 51, 16, 2, 0.0F, -2.0F, -0.05F, 0.0F, -15.0F, -0.05F, 0.0F, -15.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[124].setRotationPoint(-17.0F, -19.0F, -26.2F);
    (bodyModel[124]).rotateAngleX = -0.34906584F;
    
    bodyModel[125].addShapeBox(0.0F, -16.0F, -2.0F, 51, 16, 2, 0.0F, -2.0F, 0.0F, 0.0F, -15.0F, 0.0F, 0.0F, -15.0F, -0.05F, 0.0F, -2.0F, -0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[125].setRotationPoint(-17.0F, -19.0F, 26.2F);
    (bodyModel[125]).rotateAngleX = 0.34906584F;
    
    bodyModel[126].addShapeBox(-2.0F, -29.0F, -26.0F, 2, 22, 10, 0.0F, 0.0F, 0.0F, -5.3F, 0.0F, -0.7F, -5.3F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[126].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[126]).rotateAngleZ = 0.7853982F;
    
    bodyModel[127].addShapeBox(-34.0F, 0.0F, -21.0F, 34, 2, 42, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    bodyModel[127].setRotationPoint(19.0F, -34.0F, 0.0F);
    
    bodyModel[128].addShapeBox(-2.0F, -29.0F, 16.0F, 2, 22, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, -5.3F, 0.0F, 0.0F, -5.3F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, -2.0F, 0.2F);
    bodyModel[128].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[128]).rotateAngleZ = 0.7853982F;
    
    bodyModel[129].addShapeBox(0.0F, -15.0F, -26.0F, 2, 15, 52, 0.0F, 0.0F, 0.1F, -5.3F, 0.0F, 0.15F, -5.3F, 0.0F, 0.15F, -5.3F, 0.0F, 0.1F, -5.3F, 0.0F, 0.0F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, -0.2F, 0.2F, 0.0F, 0.0F, 0.2F);
    bodyModel[129].setRotationPoint(-17.0F, -19.0F, 0.0F);
    (bodyModel[129]).rotateAngleZ = -0.13264503F;
    
    bodyModel[130].addShapeBox(0.0F, 7.5F, 0.0F, 3, 14, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -5.0F, -3.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -5.0F, -3.0F, 0.0F, -4.0F, 0.0F);
    bodyModel[130].setRotationPoint(19.0F, -34.0F, 0.0F);
    (bodyModel[130]).rotateAngleZ = 0.7853982F;
    
    bodyModel[131].addShapeBox(0.0F, 7.5F, -15.0F, 3, 14, 5, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -5.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -5.0F, -3.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[131].setRotationPoint(19.0F, -34.0F, 0.0F);
    (bodyModel[131]).rotateAngleZ = 0.7853982F;
    
    bodyModel[132].addShapeBox(0.0F, 0.0F, 0.0F, 3, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[132].setRotationPoint(33.0F, -19.0F, 7.0F);
    
    bodyModel[133].addShapeBox(0.0F, 20.0F, -22.0F, 1, 7, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[133].setRotationPoint(19.0F, -34.0F, 0.0F);
    (bodyModel[133]).rotateAngleZ = 0.7853982F;
    
    bodyModel[134].addShapeBox(0.0F, 20.0F, -20.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[134].setRotationPoint(19.0F, -34.0F, 0.0F);
    (bodyModel[134]).rotateAngleZ = 0.7853982F;
    
    bodyModel[135].addShapeBox(0.0F, 25.0F, -20.0F, 1, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[135].setRotationPoint(19.0F, -34.0F, 0.0F);
    (bodyModel[135]).rotateAngleZ = 0.7853982F;
    
    bodyModel[136].addShapeBox(0.0F, 20.0F, -17.0F, 1, 7, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[136].setRotationPoint(19.0F, -34.0F, 0.0F);
    (bodyModel[136]).rotateAngleZ = 0.7853982F;
    
    bodyModel[137].addShapeBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);
    bodyModel[137].setRotationPoint(33.0F, -18.5F, -19.0F);
    
    bodyModel[138].addShapeBox(-2.0F, -29.0F, -16.0F, 2, 32, 21, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 1.2F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.2F, -2.5F, 0.0F);
    bodyModel[138].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[138]).rotateAngleZ = 0.7853982F;
    
    bodyModel[139].addShapeBox(-2.0F, -13.0F, 5.0F, 2, 16, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.2F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.2F, -2.5F, 0.0F);
    bodyModel[139].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[139]).rotateAngleZ = 0.7853982F;
    
    bodyModel[140].addShapeBox(-2.0F, -29.0F, 5.0F, 2, 11, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[140].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[140]).rotateAngleZ = 0.7853982F;
    
    bodyModel[141].addShapeBox(-2.0F, -29.0F, 5.0F, 2, 11, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[141].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[141]).rotateAngleZ = 0.7853982F;
    
    bodyModel[142].addShapeBox(-2.0F, -18.0F, 5.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[142].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[142]).rotateAngleZ = 0.7853982F;
    
    bodyModel[143].addShapeBox(-2.0F, -18.0F, 13.0F, 2, 5, 3, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[143].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[143]).rotateAngleZ = 0.7853982F;
    
    bodyModel[144].addShapeBox(-2.0F, -18.0F, 8.0F, 1, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[144].setRotationPoint(39.0F, -14.0F, 0.0F);
    (bodyModel[144]).rotateAngleZ = 0.7853982F;
    
    bodyModel[145].addShapeBox(-26.0F, 0.0F, 0.0F, 26, 1, 10, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    bodyModel[145].setRotationPoint(11.0F, -34.2F, -10.0F);
    
    bodyModel[146].addTrapezoid(-5.0F, 0.0F, 0.0F, 5, 2, 5, 0.0F, -1.0F, 4);
    bodyModel[146].setRotationPoint(17.0F, -36.0F, -17.0F);
    
    bodyModel[147].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[147].setRotationPoint(-10.0F, -34.5F, 1.0F);
    
    bodyModel[148].addShapeBox(4.0F, 0.0F, 0.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[148].setRotationPoint(-10.0F, -34.5F, 1.0F);
    
    bodyModel[149].addShapeBox(-3.0F, 0.0F, 0.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
    bodyModel[149].setRotationPoint(-10.0F, -34.5F, 1.0F);
    
    bodyModel[150].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[150].setRotationPoint(-7.0F, -35.5F, 4.0F);
    
    bodyModel[151].addShapeBox(-0.5F, -9.0F, -5.0F, 2, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[151].setRotationPoint(-17.0F, -19.0F, 0.0F);
    (bodyModel[151]).rotateAngleZ = -0.13089968F;
    
    bodyModel[152].addShapeBox(-0.5F, -12.0F, -5.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[152].setRotationPoint(-17.0F, -19.0F, 0.0F);
    (bodyModel[152]).rotateAngleZ = -0.13089968F;
    
    bodyModel[153].addShapeBox(-0.5F, -5.0F, -5.0F, 2, 3, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F);
    bodyModel[153].setRotationPoint(-17.0F, -19.0F, 0.0F);
    (bodyModel[153]).rotateAngleZ = -0.13089968F;
    
    bodyModel[154].addShapeBox(-1.0F, -8.0F, 3.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[154].setRotationPoint(-17.0F, -19.0F, 0.0F);
    (bodyModel[154]).rotateAngleZ = -0.13089968F;
    
    bodyModel[155].addShapeBox(0.0F, 8.0F, -11.5F, 3, 13, 4, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -5.0F, -3.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -5.0F, -3.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[155].setRotationPoint(19.0F, -34.0F, 0.0F);
    (bodyModel[155]).rotateAngleZ = 0.7853982F;
    
    bodyModel[156].addShapeBox(0.0F, 8.0F, -2.5F, 3, 13, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -5.0F, -3.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -5.0F, -3.0F, 0.0F, -4.0F, 0.0F);
    bodyModel[156].setRotationPoint(19.0F, -34.0F, 0.0F);
    (bodyModel[156]).rotateAngleZ = 0.7853982F;
    
    bodyModel[157].addShapeBox(0.0F, 8.0F, -7.5F, 3, 13, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[157].setRotationPoint(19.0F, -34.0F, 0.0F);
    (bodyModel[157]).rotateAngleZ = 0.7853982F;
    
    bodyModel[158].addShapeBox(0.0F, 0.0F, 0.0F, 1, 25, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[158].setRotationPoint(-17.0F, -50.0F, -19.0F);
    
    bodyModel[159].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F);
    bodyModel[159].setRotationPoint(-17.0F, -27.0F, -19.0F);
    
    bodyModel[160].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F);
    bodyModel[160].setRotationPoint(-17.0F, -33.5F, -19.0F);
    
    bodyModel[161].addShapeBox(0.0F, 0.0F, 0.0F, 18, 1, 1, 0.0F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F);
    bodyModel[161].setRotationPoint(-17.0F, -45.5F, -19.0F);
    
    bodyModel[162].addShapeBox(0.0F, 0.0F, -0.5F, 18, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    bodyModel[162].setRotationPoint(-16.5F, -50.2F, -18.5F);
    (bodyModel[162]).rotateAngleZ = -0.2617994F;
    
    bodyModel[163].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[163].setRotationPoint(-1.0F, -45.0F, -19.0F);
    
    bodyModel[164].addShapeBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F);
    bodyModel[164].setRotationPoint(-17.0F, -43.0F, -19.0F);
    
    bodyModel[165].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F, 0.3F, 0.0F, 0.3F);
    bodyModel[165].setRotationPoint(-15.0F, -44.5F, -19.0F);
    
    bodyModel[166].addShapeBox(18.0F, -12.0F, -0.99F, 7, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[166].setRotationPoint(-17.0F, -19.0F, 26.2F);
    (bodyModel[166]).rotateAngleX = 0.34906584F;
    
    bodyModel[167].addShapeBox(18.0F, -12.0F, -0.01F, 7, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[167].setRotationPoint(-17.0F, -19.0F, -26.2F);
    (bodyModel[167]).rotateAngleX = -0.34906584F;

    
    barrelModel = new ModelRendererTurbo[45];
    barrelModel[0] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 323, 210, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 283, 210, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 211, 232, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 211, 223, textureX, textureY);
    barrelModel[5] = new ModelRendererTurbo(this, 247, 210, textureX, textureY);
    barrelModel[6] = new ModelRendererTurbo(this, 211, 210, textureX, textureY);
    barrelModel[7] = new ModelRendererTurbo(this, 296, 223, textureX, textureY);
    barrelModel[8] = new ModelRendererTurbo(this, 370, 228, textureX, textureY);
    barrelModel[9] = new ModelRendererTurbo(this, 354, 228, textureX, textureY);
    barrelModel[10] = new ModelRendererTurbo(this, 386, 230, textureX, textureY);
    barrelModel[11] = new ModelRendererTurbo(this, 412, 230, textureX, textureY);
    barrelModel[12] = new ModelRendererTurbo(this, 412, 221, textureX, textureY);
    barrelModel[13] = new ModelRendererTurbo(this, 284, 240, textureX, textureY);
    barrelModel[14] = new ModelRendererTurbo(this, 279, 240, textureX, textureY);
    barrelModel[15] = new ModelRendererTurbo(this, 274, 240, textureX, textureY);
    barrelModel[16] = new ModelRendererTurbo(this, 269, 240, textureX, textureY);
    barrelModel[17] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[18] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[19] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[20] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[21] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[22] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[23] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[24] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[25] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[26] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[27] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[28] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[29] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[30] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[31] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[32] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[33] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[34] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[35] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[36] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[37] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[38] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[39] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[40] = new ModelRendererTurbo(this, 256, 223, textureX, textureY);
    barrelModel[41] = new ModelRendererTurbo(this, 195, 191, textureX, textureY);
    barrelModel[42] = new ModelRendererTurbo(this, 195, 176, textureX, textureY);
    barrelModel[43] = new ModelRendererTurbo(this, 232, 231, textureX, textureY);
    barrelModel[44] = new ModelRendererTurbo(this, 232, 222, textureX, textureY);
    
    barrelModel[0].addShapeBox(-4.0F, -2.5F, -4.5F, 10, 5, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[0].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[1].addShapeBox(-4.0F, -4.5F, -4.5F, 10, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[1].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[2].addShapeBox(-4.0F, 2.5F, -4.5F, 10, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
    barrelModel[2].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[3].addShapeBox(6.0F, -2.5F, -4.5F, 7, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[3].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[4].addShapeBox(6.0F, -2.5F, 2.5F, 7, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[4].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[5].addShapeBox(6.0F, -4.5F, -4.5F, 7, 2, 9, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[5].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[6].addShapeBox(6.0F, 2.5F, -4.5F, 7, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
    barrelModel[6].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[7].addShapeBox(4.5F, -5.5F, -4.5F, 1, 10, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[7].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[8].addShapeBox(2.5F, -5.5F, -8.5F, 3, 10, 4, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    barrelModel[8].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[9].addShapeBox(2.5F, -5.5F, 4.5F, 3, 10, 4, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    barrelModel[9].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[10].addShapeBox(2.5F, -8.5F, -4.5F, 3, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    barrelModel[10].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[11].addShapeBox(2.5F, -8.5F, -8.5F, 3, 3, 4, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    barrelModel[11].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[12].addShapeBox(2.5F, -8.5F, 4.5F, 3, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[12].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[13].addShapeBox(12.0F, -5.5F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[13].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[14].addShapeBox(12.0F, -0.5F, -5.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[14].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[15].addShapeBox(12.0F, -0.5F, 4.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[15].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[16].addShapeBox(12.0F, 4.5F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[16].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[17].addShapeBox(12.01F, -4.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[17].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[18].addShapeBox(12.01F, -4.0F, 0.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[18].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[19].addShapeBox(12.01F, -4.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[19].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[20].addShapeBox(12.01F, -4.0F, -2.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[20].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[21].addShapeBox(12.01F, -4.0F, 1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[21].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[22].addShapeBox(12.01F, -2.5F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[22].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[23].addShapeBox(12.01F, -1.5F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[23].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[24].addShapeBox(12.01F, -0.5F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[24].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[25].addShapeBox(12.01F, 0.5F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[25].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[26].addShapeBox(12.01F, 1.5F, -4.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[26].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[27].addShapeBox(12.01F, -2.5F, 3.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[27].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[28].addShapeBox(12.01F, -1.5F, 3.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[28].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[29].addShapeBox(12.01F, -0.5F, 3.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[29].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[30].addShapeBox(12.01F, 0.5F, 3.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[30].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[31].addShapeBox(12.01F, 1.5F, 3.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[31].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[32].addShapeBox(12.01F, 3.0F, -2.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[32].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[33].addShapeBox(12.01F, 3.0F, -1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[33].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[34].addShapeBox(12.01F, 3.0F, -0.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[34].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[35].addShapeBox(12.01F, 3.0F, 0.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[35].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[36].addShapeBox(12.01F, 3.0F, 1.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[36].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[37].addShapeBox(12.01F, -3.5F, -3.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[37].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[38].addShapeBox(12.01F, -3.5F, 2.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[38].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[39].addShapeBox(12.01F, 2.5F, -3.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[39].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[40].addShapeBox(12.01F, 2.5F, 2.5F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[40].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[41].addShapeBox(13.0F, -5.5F, -5.5F, 1, 3, 11, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[41].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[42].addShapeBox(13.0F, 2.5F, -5.5F, 1, 3, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F);
    barrelModel[42].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[43].addShapeBox(13.0F, -2.5F, -5.5F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[43].setRotationPoint(30.0F, -23.0F, -5.0F);
    
    barrelModel[44].addShapeBox(13.0F, -2.5F, 2.5F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[44].setRotationPoint(30.0F, -23.0F, -5.0F);

    
    leftTrackWheelModels = new ModelRendererTurbo[36];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 140, 419, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 94, 419, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 48, 419, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 2, 419, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 418, 404, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 186, 419, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 466, 404, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 465, 384, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 418, 384, textureX, textureY);
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 372, 404, textureX, textureY);
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 371, 384, textureX, textureY);
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 324, 403, textureX, textureY);
    leftTrackWheelModels[12] = new ModelRendererTurbo(this, 232, 402, textureX, textureY);
    leftTrackWheelModels[13] = new ModelRendererTurbo(this, 186, 384, textureX, textureY);
    leftTrackWheelModels[14] = new ModelRendererTurbo(this, 39, 352, textureX, textureY);
    leftTrackWheelModels[15] = new ModelRendererTurbo(this, 471, 438, textureX, textureY);
    leftTrackWheelModels[16] = new ModelRendererTurbo(this, 471, 456, textureX, textureY);
    leftTrackWheelModels[17] = new ModelRendererTurbo(this, 430, 438, textureX, textureY);
    leftTrackWheelModels[18] = new ModelRendererTurbo(this, 386, 456, textureX, textureY);
    leftTrackWheelModels[19] = new ModelRendererTurbo(this, 386, 438, textureX, textureY);
    leftTrackWheelModels[20] = new ModelRendererTurbo(this, 174, 456, textureX, textureY);
    leftTrackWheelModels[21] = new ModelRendererTurbo(this, 260, 456, textureX, textureY);
    leftTrackWheelModels[22] = new ModelRendererTurbo(this, 217, 456, textureX, textureY);
    leftTrackWheelModels[23] = new ModelRendererTurbo(this, 344, 456, textureX, textureY);
    leftTrackWheelModels[24] = new ModelRendererTurbo(this, 302, 456, textureX, textureY);
    leftTrackWheelModels[25] = new ModelRendererTurbo(this, 430, 456, textureX, textureY);
    leftTrackWheelModels[26] = new ModelRendererTurbo(this, 132, 455, textureX, textureY);
    leftTrackWheelModels[27] = new ModelRendererTurbo(this, 1, 25, textureX, textureY);
    leftTrackWheelModels[28] = new ModelRendererTurbo(this, 175, 162, textureX, textureY);
    leftTrackWheelModels[29] = new ModelRendererTurbo(this, 206, 162, textureX, textureY);
    leftTrackWheelModels[30] = new ModelRendererTurbo(this, 161, 56, textureX, textureY);
    leftTrackWheelModels[31] = new ModelRendererTurbo(this, 57, 156, textureX, textureY);
    leftTrackWheelModels[32] = new ModelRendererTurbo(this, 78, 156, textureX, textureY);
    leftTrackWheelModels[33] = new ModelRendererTurbo(this, 248, 22, textureX, textureY);
    leftTrackWheelModels[34] = new ModelRendererTurbo(this, 31, 4, textureX, textureY);
    leftTrackWheelModels[35] = new ModelRendererTurbo(this, 31, 1, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[0].setRotationPoint(24.0F, 3.0F, 21.0F);
    
    leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[1].setRotationPoint(33.0F, 3.0F, 24.0F);
    
    leftTrackWheelModels[2].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[2].setRotationPoint(24.0F, 3.0F, 27.0F);
    
    leftTrackWheelModels[3].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[3].setRotationPoint(15.0F, 3.0F, 24.0F);
    
    leftTrackWheelModels[4].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[4].setRotationPoint(6.0F, 3.0F, 21.0F);
    
    leftTrackWheelModels[5].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[5].setRotationPoint(6.0F, 3.0F, 27.0F);
    
    leftTrackWheelModels[6].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[6].setRotationPoint(-3.0F, 3.0F, 24.0F);
    
    leftTrackWheelModels[7].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[7].setRotationPoint(-12.0F, 3.0F, 21.0F);
    
    leftTrackWheelModels[8].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[8].setRotationPoint(-12.0F, 3.0F, 27.0F);
    
    leftTrackWheelModels[9].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[9].setRotationPoint(-21.0F, 3.0F, 24.0F);
    
    leftTrackWheelModels[10].addShape3D(6.6F, -6.6F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[10].setRotationPoint(-30.0F, 3.0F, 27.0F);
    
    leftTrackWheelModels[11].addShape3D(6.5F, -6.5F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[11].setRotationPoint(-30.0F, 3.0F, 21.0F);
    
    leftTrackWheelModels[12].addShape3D(6.5F, -6.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[12].setRotationPoint(43.0F, -2.0F, 20.0F);
    
    leftTrackWheelModels[13].addShape3D(6.5F, -6.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[13].setRotationPoint(43.0F, -2.0F, 27.0F);
    
    leftTrackWheelModels[14].addShape3D(5.0F, -5.0F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[14].setRotationPoint(-41.0F, 1.0F, 24.0F);
    
    leftTrackWheelModels[15].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[15].setRotationPoint(33.0F, 3.0F, 24.0F);
    
    leftTrackWheelModels[16].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[16].setRotationPoint(15.0F, 3.0F, 24.0F);
    
    leftTrackWheelModels[17].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[17].setRotationPoint(-3.0F, 3.0F, 24.0F);
    
    leftTrackWheelModels[18].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[18].setRotationPoint(-21.0F, 3.0F, 24.0F);
    
    leftTrackWheelModels[19].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[19].setRotationPoint(24.0F, 3.0F, 21.0F);
    
    leftTrackWheelModels[20].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[20].setRotationPoint(24.0F, 3.0F, 27.0F);
    
    leftTrackWheelModels[21].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[21].setRotationPoint(6.0F, 3.0F, 27.0F);
    
    leftTrackWheelModels[22].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[22].setRotationPoint(6.0F, 3.0F, 21.0F);
    
    leftTrackWheelModels[23].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[23].setRotationPoint(-12.0F, 3.0F, 21.0F);
    
    leftTrackWheelModels[24].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[24].setRotationPoint(-12.0F, 3.0F, 27.0F);
    
    leftTrackWheelModels[25].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[25].setRotationPoint(-30.0F, 3.0F, 27.0F);
    
    leftTrackWheelModels[26].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[26].setRotationPoint(-30.0F, 3.0F, 21.0F);
    
    leftTrackWheelModels[27].addShapeBox(-5.0F, -2.0F, 0.0F, 10, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    leftTrackWheelModels[27].setRotationPoint(43.0F, -2.0F, 20.0F);
    
    leftTrackWheelModels[28].addShapeBox(-5.0F, -5.0F, 0.0F, 10, 3, 5, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -2.9F, 0.0F, -3.0F, -2.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    leftTrackWheelModels[28].setRotationPoint(43.0F, -2.0F, 20.0F);
    
    leftTrackWheelModels[29].addShapeBox(-5.0F, 2.0F, 0.0F, 10, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -2.9F, 0.0F, -3.0F, -2.9F, 0.0F);
    leftTrackWheelModels[29].setRotationPoint(43.0F, -2.0F, 20.0F);
    
    leftTrackWheelModels[30].addShapeBox(-4.0F, -2.0F, 0.0F, 8, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    leftTrackWheelModels[30].setRotationPoint(-41.0F, 1.0F, 23.5F);
    
    leftTrackWheelModels[31].addShapeBox(-4.0F, -4.0F, 0.0F, 8, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, -1.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    leftTrackWheelModels[31].setRotationPoint(-41.0F, 1.0F, 23.5F);
    
    leftTrackWheelModels[32].addShapeBox(-4.0F, 2.0F, 0.0F, 8, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, -1.9F, 0.0F);
    leftTrackWheelModels[32].setRotationPoint(-41.0F, 1.0F, 23.5F);
    
    leftTrackWheelModels[33].addShapeBox(-4.0F, -2.0F, 0.0F, 8, 4, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackWheelModels[33].setRotationPoint(-41.0F, 1.0F, 20.5F);
    
    leftTrackWheelModels[34].addShapeBox(-4.0F, -4.0F, 0.0F, 8, 2, 1, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackWheelModels[34].setRotationPoint(-41.0F, 1.0F, 20.5F);
    
    leftTrackWheelModels[35].addShapeBox(-4.0F, 2.0F, 0.0F, 8, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    leftTrackWheelModels[35].setRotationPoint(-41.0F, 1.0F, 20.5F);

    
    rightTrackWheelModels = new ModelRendererTurbo[36];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 278, 403, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 324, 384, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 15, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 188, 80, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 188, 71, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 86, 455, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 278, 384, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 343, 438, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 86, 438, textureX, textureY);
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 1, 402, textureX, textureY);
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 48, 402, textureX, textureY);
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 44, 455, textureX, textureY);
    rightTrackWheelModels[12] = new ModelRendererTurbo(this, 140, 402, textureX, textureY);
    rightTrackWheelModels[13] = new ModelRendererTurbo(this, 2, 455, textureX, textureY);
    rightTrackWheelModels[14] = new ModelRendererTurbo(this, 94, 402, textureX, textureY);
    rightTrackWheelModels[15] = new ModelRendererTurbo(this, 232, 384, textureX, textureY);
    rightTrackWheelModels[16] = new ModelRendererTurbo(this, 301, 438, textureX, textureY);
    rightTrackWheelModels[17] = new ModelRendererTurbo(this, 2, 438, textureX, textureY);
    rightTrackWheelModels[18] = new ModelRendererTurbo(this, 186, 402, textureX, textureY);
    rightTrackWheelModels[19] = new ModelRendererTurbo(this, 217, 438, textureX, textureY);
    rightTrackWheelModels[20] = new ModelRendererTurbo(this, 44, 438, textureX, textureY);
    rightTrackWheelModels[21] = new ModelRendererTurbo(this, 232, 419, textureX, textureY);
    rightTrackWheelModels[22] = new ModelRendererTurbo(this, 140, 384, textureX, textureY);
    rightTrackWheelModels[23] = new ModelRendererTurbo(this, 132, 438, textureX, textureY);
    rightTrackWheelModels[24] = new ModelRendererTurbo(this, 94, 384, textureX, textureY);
    rightTrackWheelModels[25] = new ModelRendererTurbo(this, 259, 438, textureX, textureY);
    rightTrackWheelModels[26] = new ModelRendererTurbo(this, 174, 438, textureX, textureY);
    rightTrackWheelModels[27] = new ModelRendererTurbo(this, 48, 384, textureX, textureY);
    rightTrackWheelModels[28] = new ModelRendererTurbo(this, 1, 384, textureX, textureY);
    rightTrackWheelModels[29] = new ModelRendererTurbo(this, 1, 352, textureX, textureY);
    rightTrackWheelModels[30] = new ModelRendererTurbo(this, 140, 56, textureX, textureY);
    rightTrackWheelModels[31] = new ModelRendererTurbo(this, 78, 166, textureX, textureY);
    rightTrackWheelModels[32] = new ModelRendererTurbo(this, 78, 161, textureX, textureY);
    rightTrackWheelModels[33] = new ModelRendererTurbo(this, 229, 22, textureX, textureY);
    rightTrackWheelModels[34] = new ModelRendererTurbo(this, 181, 19, textureX, textureY);
    rightTrackWheelModels[35] = new ModelRendererTurbo(this, 181, 15, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[0].setRotationPoint(43.0F, -2.0F, -20.0F);
    
    rightTrackWheelModels[1].addShape3D(6.5F, -6.5F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[1].setRotationPoint(43.0F, -2.0F, -27.0F);
    
    rightTrackWheelModels[2].addShapeBox(-5.0F, -2.0F, -5.0F, 10, 4, 5, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackWheelModels[2].setRotationPoint(43.0F, -2.0F, -20.0F);
    
    rightTrackWheelModels[3].addShapeBox(-5.0F, -5.0F, -5.0F, 10, 3, 5, 0.0F, -3.0F, -2.9F, 0.0F, -3.0F, -2.9F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackWheelModels[3].setRotationPoint(43.0F, -2.0F, -20.0F);
    
    rightTrackWheelModels[4].addShapeBox(-5.0F, 2.0F, -5.0F, 10, 3, 5, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.9F, 0.0F, -3.0F, -2.9F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    rightTrackWheelModels[4].setRotationPoint(43.0F, -2.0F, -20.0F);
    
    rightTrackWheelModels[5].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[5].setRotationPoint(33.0F, 3.0F, -24.0F);
    
    rightTrackWheelModels[6].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[6].setRotationPoint(33.0F, 3.0F, -24.0F);
    
    rightTrackWheelModels[7].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[7].setRotationPoint(24.0F, 3.0F, -27.0F);
    
    rightTrackWheelModels[8].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[8].setRotationPoint(24.0F, 3.0F, -21.0F);
    
    rightTrackWheelModels[9].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[9].setRotationPoint(24.0F, 3.0F, -27.0F);
    
    rightTrackWheelModels[10].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[10].setRotationPoint(24.0F, 3.0F, -21.0F);
    
    rightTrackWheelModels[11].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[11].setRotationPoint(15.0F, 3.0F, -24.0F);
    
    rightTrackWheelModels[12].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[12].setRotationPoint(15.0F, 3.0F, -24.0F);
    
    rightTrackWheelModels[13].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[13].setRotationPoint(6.0F, 3.0F, -27.0F);
    
    rightTrackWheelModels[14].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[14].setRotationPoint(6.0F, 3.0F, -21.0F);
    
    rightTrackWheelModels[15].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[15].setRotationPoint(6.0F, 3.0F, -27.0F);
    
    rightTrackWheelModels[16].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[16].setRotationPoint(6.0F, 3.0F, -21.0F);
    
    rightTrackWheelModels[17].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[17].setRotationPoint(-3.0F, 3.0F, -24.0F);
    
    rightTrackWheelModels[18].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[18].setRotationPoint(-3.0F, 3.0F, -24.0F);
    
    rightTrackWheelModels[19].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[19].setRotationPoint(-12.0F, 3.0F, -27.0F);
    
    rightTrackWheelModels[20].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[20].setRotationPoint(-12.0F, 3.0F, -21.0F);
    
    rightTrackWheelModels[21].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[21].setRotationPoint(-12.0F, 3.0F, -27.0F);
    
    rightTrackWheelModels[22].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[22].setRotationPoint(-12.0F, 3.0F, -21.0F);
    
    rightTrackWheelModels[23].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[23].setRotationPoint(-21.0F, 3.0F, -24.0F);
    
    rightTrackWheelModels[24].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[24].setRotationPoint(-21.0F, 3.0F, -24.0F);
    
    rightTrackWheelModels[25].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[25].setRotationPoint(-30.0F, 3.0F, -27.0F);
    
    rightTrackWheelModels[26].addShape3D(6.0F, -6.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[26].setRotationPoint(-30.0F, 3.0F, -21.0F);
    
    rightTrackWheelModels[27].addShape3D(6.6F, -6.6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[27].setRotationPoint(-30.0F, 3.0F, -27.0F);
    
    rightTrackWheelModels[28].addShape3D(6.5F, -6.5F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 2.0F, 13, 13, 44, 2, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[28].setRotationPoint(-30.0F, 3.0F, -21.0F);
    
    rightTrackWheelModels[29].addShape3D(5.0F, -5.0F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 10, 10, 36, 2, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[29].setRotationPoint(-41.0F, 1.0F, -24.0F);
    
    rightTrackWheelModels[30].addShapeBox(-4.0F, -2.0F, -2.0F, 8, 4, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackWheelModels[30].setRotationPoint(-41.0F, 1.0F, -23.5F);
    
    rightTrackWheelModels[31].addShapeBox(-4.0F, -4.0F, -2.0F, 8, 2, 2, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackWheelModels[31].setRotationPoint(-41.0F, 1.0F, -23.5F);
    
    rightTrackWheelModels[32].addShapeBox(-4.0F, 2.0F, -2.0F, 8, 2, 2, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    rightTrackWheelModels[32].setRotationPoint(-41.0F, 1.0F, -23.5F);
    
    rightTrackWheelModels[33].addShapeBox(-4.0F, -2.0F, -1.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    rightTrackWheelModels[33].setRotationPoint(-41.0F, 1.0F, -20.5F);
    
    rightTrackWheelModels[34].addShapeBox(-4.0F, -4.0F, -1.0F, 8, 2, 1, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, -1.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    rightTrackWheelModels[34].setRotationPoint(-41.0F, 1.0F, -20.5F);
    
    rightTrackWheelModels[35].addShapeBox(-4.0F, 2.0F, -1.0F, 8, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -1.9F, 0.0F, -2.0F, -1.9F, 0.0F);
    rightTrackWheelModels[35].setRotationPoint(-41.0F, 1.0F, -20.5F);

    
    leftTrackModel = new ModelRendererTurbo[13];
    leftTrackModel[0] = new ModelRendererTurbo(this, 229, 192, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 229, 178, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 367, 133, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 366, 119, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 54, 298, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 2, 335, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 53, 283, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 333, 133, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 332, 119, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 296, 133, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 222, 337, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 321, 337, textureX, textureY);
    leftTrackModel[12] = new ModelRendererTurbo(this, 399, 337, textureX, textureY);
    
    leftTrackModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[0].setRotationPoint(40.0F, -9.0F, 17.5F);
    
    leftTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[1].setRotationPoint(46.0F, -9.0F, 17.5F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[2].setRotationPoint(50.0F, -5.0F, 17.5F);
    (leftTrackModel[2]).rotateAngleZ = -1.5707964F;
    
    leftTrackModel[3].addShapeBox(-6.0F, -1.0F, 0.0F, 6, 1, 12, 0.0F, -0.34F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F);
    leftTrackModel[3].setRotationPoint(50.0F, 1.0F, 17.5F);
    (leftTrackModel[3]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[4].addShapeBox(-11.0F, -1.0F, 0.0F, 11, 1, 12, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    leftTrackModel[4].setRotationPoint(46.0F, 5.0F, 17.5F);
    (leftTrackModel[4]).rotateAngleZ = 0.4660029F;
    
    leftTrackModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 69, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[5].setRotationPoint(-33.0F, 9.0F, 17.5F);
    
    leftTrackModel[6].addShapeBox(0.0F, -1.0F, 0.0F, 12, 1, 12, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    leftTrackModel[6].setRotationPoint(-44.0F, 6.0F, 17.5F);
    (leftTrackModel[6]).rotateAngleZ = -0.34906584F;
    
    leftTrackModel[7].addShapeBox(0.0F, -1.0F, 0.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[7].setRotationPoint(-47.0F, -1.0F, 17.5F);
    (leftTrackModel[7]).rotateAngleZ = -1.5707964F;
    
    leftTrackModel[8].addShapeBox(0.0F, -1.0F, 0.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[8].setRotationPoint(-47.0F, 3.0F, 17.5F);
    (leftTrackModel[8]).rotateAngleZ = -0.80808747F;
    
    leftTrackModel[9].addShapeBox(-6.0F, 0.0F, 0.0F, 6, 1, 12, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F);
    leftTrackModel[9].setRotationPoint(-43.0F, -5.0F, 17.5F);
    (leftTrackModel[9]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[10].addShapeBox(-36.0F, 0.0F, 0.0F, 36, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[10].setRotationPoint(-7.0F, -5.0F, 17.5F);
    
    leftTrackModel[11].addShapeBox(-26.0F, 0.0F, 0.0F, 26, 1, 12, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F);
    leftTrackModel[11].setRotationPoint(19.0F, -6.0F, 17.5F);
    (leftTrackModel[11]).rotateAngleZ = 0.03839724F;
    
    leftTrackModel[12].addShapeBox(-21.0F, 0.0F, 0.0F, 21, 1, 12, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
    leftTrackModel[12].setRotationPoint(40.0F, -9.0F, 17.5F);
    (leftTrackModel[12]).rotateAngleZ = 0.14137167F;

    
    rightTrackModel = new ModelRendererTurbo[13];
    rightTrackModel[0] = new ModelRendererTurbo(this, 295, 119, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 194, 133, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 194, 119, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 231, 43, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 2, 296, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 1, 319, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 1, 280, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 279, 29, textureX, textureY);
    rightTrackModel[8] = new ModelRendererTurbo(this, 257, 27, textureX, textureY);
    rightTrackModel[9] = new ModelRendererTurbo(this, 231, 29, textureX, textureY);
    rightTrackModel[10] = new ModelRendererTurbo(this, 221, 319, textureX, textureY);
    rightTrackModel[11] = new ModelRendererTurbo(this, 320, 319, textureX, textureY);
    rightTrackModel[12] = new ModelRendererTurbo(this, 398, 319, textureX, textureY);
    
    rightTrackModel[0].addShapeBox(0.0F, 0.0F, -12.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[0].setRotationPoint(40.0F, -9.0F, -17.5F);
    
    rightTrackModel[1].addShapeBox(0.0F, 0.0F, -12.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[1].setRotationPoint(46.0F, -9.0F, -17.5F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2].addShapeBox(0.0F, 0.0F, -12.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[2].setRotationPoint(50.0F, -5.0F, -17.5F);
    (rightTrackModel[2]).rotateAngleZ = -1.5707964F;
    
    rightTrackModel[3].addShapeBox(-6.0F, -1.0F, -12.0F, 6, 1, 12, 0.0F, -0.34F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.34F, 0.0F, 0.0F);
    rightTrackModel[3].setRotationPoint(50.0F, 1.0F, -17.5F);
    (rightTrackModel[3]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[4].addShapeBox(-11.0F, -1.0F, -12.0F, 11, 1, 12, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    rightTrackModel[4].setRotationPoint(46.0F, 5.0F, -17.5F);
    (rightTrackModel[4]).rotateAngleZ = 0.4660029F;
    
    rightTrackModel[5].addShapeBox(0.0F, 0.0F, -12.0F, 69, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[5].setRotationPoint(-33.0F, 9.0F, -17.5F);
    
    rightTrackModel[6].addShapeBox(0.0F, -1.0F, -12.0F, 12, 1, 12, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    rightTrackModel[6].setRotationPoint(-44.0F, 6.0F, -17.5F);
    (rightTrackModel[6]).rotateAngleZ = -0.34906584F;
    
    rightTrackModel[7].addShapeBox(0.0F, -1.0F, -12.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[7].setRotationPoint(-47.0F, 3.0F, -17.5F);
    (rightTrackModel[7]).rotateAngleZ = -0.80808747F;
    
    rightTrackModel[8].addShapeBox(0.0F, -1.0F, -12.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[8].setRotationPoint(-47.0F, -1.0F, -17.5F);
    (rightTrackModel[8]).rotateAngleZ = -1.5707964F;
    
    rightTrackModel[9].addShapeBox(-6.0F, 0.0F, -12.0F, 6, 1, 12, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F);
    rightTrackModel[9].setRotationPoint(-43.0F, -5.0F, -17.5F);
    (rightTrackModel[9]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[10].addShapeBox(-36.0F, 0.0F, -12.0F, 36, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[10].setRotationPoint(-7.0F, -5.0F, -17.5F);
    
    rightTrackModel[11].addShapeBox(-26.0F, 0.0F, -12.0F, 26, 1, 12, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F);
    rightTrackModel[11].setRotationPoint(19.0F, -6.0F, -17.5F);
    (rightTrackModel[11]).rotateAngleZ = 0.03839724F;
    
    rightTrackModel[12].addShapeBox(-21.0F, 0.0F, -12.0F, 21, 1, 12, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F);
    rightTrackModel[12].setRotationPoint(40.0F, -9.0F, -17.5F);
    (rightTrackModel[12]).rotateAngleZ = 0.14137167F;


    
    translateAll(-30.0F, 0.0F, 5.0F);

    
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
