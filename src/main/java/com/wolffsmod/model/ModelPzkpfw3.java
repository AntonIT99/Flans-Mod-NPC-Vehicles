package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelPzkpfw3
  extends ModelVehicle {
  int textureX = 512;
  int textureY = 512;

  
  public ModelPzkpfw3() {
    bodyModel = new ModelRendererTurbo[185];
    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 0, 45, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 0, 86, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 0, 130, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 170, 173, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 260, 0, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 260, 45, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 0, 220, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 130, 220, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 190, 220, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 230, 220, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 280, 220, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 0, 220, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 130, 220, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 190, 220, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 230, 220, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 280, 220, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 320, 220, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 320, 220, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 0, 240, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 50, 240, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 100, 240, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 150, 240, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 0, 255, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 0, 255, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 0, 255, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 45, 255, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 90, 255, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 90, 255, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 90, 255, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 120, 255, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 120, 255, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 120, 255, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 120, 255, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 0, 280, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 40, 280, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 0, 280, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 40, 280, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 140, 255, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 160, 255, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 201, 232, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 80, 280, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 215, 255, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 0, 295, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 0, 295, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 20, 295, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 20, 295, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 35, 295, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 35, 295, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 50, 295, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 50, 295, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 50, 295, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 70, 295, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 90, 295, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 0, 295, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 0, 295, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 20, 295, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 20, 295, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 35, 295, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 35, 295, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 50, 295, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 50, 295, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 50, 295, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 70, 295, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 90, 295, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 110, 295, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 0, 310, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 0, 310, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 30, 316, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[94] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[95] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[96] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[97] = new ModelRendererTurbo(this, 0, 320, textureX, textureY);
    bodyModel[98] = new ModelRendererTurbo(this, 0, 305, textureX, textureY);
    bodyModel[99] = new ModelRendererTurbo(this, 35, 305, textureX, textureY);
    bodyModel[100] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
    bodyModel[101] = new ModelRendererTurbo(this, 0, 450, textureX, textureY);
    bodyModel[102] = new ModelRendererTurbo(this, 10, 450, textureX, textureY);
    bodyModel[103] = new ModelRendererTurbo(this, 10, 450, textureX, textureY);
    bodyModel[104] = new ModelRendererTurbo(this, 25, 448, textureX, textureY);
    bodyModel[105] = new ModelRendererTurbo(this, 25, 448, textureX, textureY);
    bodyModel[106] = new ModelRendererTurbo(this, 40, 448, textureX, textureY);
    bodyModel[107] = new ModelRendererTurbo(this, 0, 488, textureX, textureY);
    bodyModel[108] = new ModelRendererTurbo(this, 60, 450, textureX, textureY);
    bodyModel[109] = new ModelRendererTurbo(this, 80, 450, textureX, textureY);
    bodyModel[110] = new ModelRendererTurbo(this, 190, 460, textureX, textureY);
    bodyModel[111] = new ModelRendererTurbo(this, 255, 460, textureX, textureY);
    bodyModel[112] = new ModelRendererTurbo(this, 290, 460, textureX, textureY);
    bodyModel[113] = new ModelRendererTurbo(this, 310, 460, textureX, textureY);
    bodyModel[114] = new ModelRendererTurbo(this, 290, 470, textureX, textureY);
    bodyModel[115] = new ModelRendererTurbo(this, 327, 460, textureX, textureY);
    bodyModel[116] = new ModelRendererTurbo(this, 350, 460, textureX, textureY);
    bodyModel[117] = new ModelRendererTurbo(this, 365, 460, textureX, textureY);
    bodyModel[118] = new ModelRendererTurbo(this, 365, 470, textureX, textureY);
    bodyModel[119] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[120] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[121] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[122] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[123] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[124] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[125] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[126] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[127] = new ModelRendererTurbo(this, 200, 300, textureX, textureY);
    bodyModel[128] = new ModelRendererTurbo(this, 240, 300, textureX, textureY);
    bodyModel[129] = new ModelRendererTurbo(this, 300, 300, textureX, textureY);
    bodyModel[130] = new ModelRendererTurbo(this, 300, 310, textureX, textureY);
    bodyModel[131] = new ModelRendererTurbo(this, 315, 300, textureX, textureY);
    bodyModel[132] = new ModelRendererTurbo(this, 315, 315, textureX, textureY);
    bodyModel[133] = new ModelRendererTurbo(this, 315, 315, textureX, textureY);
    bodyModel[134] = new ModelRendererTurbo(this, 325, 300, textureX, textureY);
    bodyModel[135] = new ModelRendererTurbo(this, 340, 300, textureX, textureY);
    bodyModel[136] = new ModelRendererTurbo(this, 340, 315, textureX, textureY);
    bodyModel[137] = new ModelRendererTurbo(this, 350, 315, textureX, textureY);
    bodyModel[138] = new ModelRendererTurbo(this, 350, 315, textureX, textureY);
    bodyModel[139] = new ModelRendererTurbo(this, 360, 315, textureX, textureY);
    bodyModel[140] = new ModelRendererTurbo(this, 400, 315, textureX, textureY);
    bodyModel[141] = new ModelRendererTurbo(this, 400, 315, textureX, textureY);
    bodyModel[142] = new ModelRendererTurbo(this, 410, 315, textureX, textureY);
    bodyModel[143] = new ModelRendererTurbo(this, 220, 440, textureX, textureY);
    bodyModel[144] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[145] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[146] = new ModelRendererTurbo(this, 380, 460, textureX, textureY);
    bodyModel[147] = new ModelRendererTurbo(this, 190, 460, textureX, textureY);
    bodyModel[148] = new ModelRendererTurbo(this, 213, 232, textureX, textureY);
    bodyModel[149] = new ModelRendererTurbo(this, 201, 242, textureX, textureY);
    bodyModel[150] = new ModelRendererTurbo(this, 201, 239, textureX, textureY);
    bodyModel[151] = new ModelRendererTurbo(this, 202, 246, textureX, textureY);
    bodyModel[152] = new ModelRendererTurbo(this, 0, 340, textureX, textureY);
    bodyModel[153] = new ModelRendererTurbo(this, 0, 328, textureX, textureY);
    bodyModel[154] = new ModelRendererTurbo(this, 85, 450, textureX, textureY);
    bodyModel[155] = new ModelRendererTurbo(this, 75, 450, textureX, textureY);
    bodyModel[156] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    bodyModel[157] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    bodyModel[158] = new ModelRendererTurbo(this, 233, 255, textureX, textureY);
    bodyModel[159] = new ModelRendererTurbo(this, 261, 255, textureX, textureY);
    bodyModel[160] = new ModelRendererTurbo(this, 250, 259, textureX, textureY);
    bodyModel[161] = new ModelRendererTurbo(this, 250, 255, textureX, textureY);
    bodyModel[162] = new ModelRendererTurbo(this, 140, 255, textureX, textureY);
    bodyModel[163] = new ModelRendererTurbo(this, 35, 305, textureX, textureY);
    bodyModel[164] = new ModelRendererTurbo(this, 54, 335, textureX, textureY);
    bodyModel[165] = new ModelRendererTurbo(this, 45, 335, textureX, textureY);
    bodyModel[166] = new ModelRendererTurbo(this, 29, 335, textureX, textureY);
    bodyModel[167] = new ModelRendererTurbo(this, 20, 335, textureX, textureY);
    bodyModel[168] = new ModelRendererTurbo(this, 21, 321, textureX, textureY);
    bodyModel[169] = new ModelRendererTurbo(this, 38, 335, textureX, textureY);
    bodyModel[170] = new ModelRendererTurbo(this, 22, 331, textureX, textureY);
    bodyModel[171] = new ModelRendererTurbo(this, 15, 331, textureX, textureY);
    bodyModel[172] = new ModelRendererTurbo(this, 22, 317, textureX, textureY);
    bodyModel[173] = new ModelRendererTurbo(this, 14, 321, textureX, textureY);
    bodyModel[174] = new ModelRendererTurbo(this, 14, 317, textureX, textureY);
    bodyModel[175] = new ModelRendererTurbo(this, 0, 310, textureX, textureY);
    bodyModel[176] = new ModelRendererTurbo(this, 0, 310, textureX, textureY);
    bodyModel[177] = new ModelRendererTurbo(this, 80, 287, textureX, textureY);
    bodyModel[178] = new ModelRendererTurbo(this, 0, 173, textureX, textureY);
    bodyModel[179] = new ModelRendererTurbo(this, 99, 86, textureX, textureY);
    bodyModel[180] = new ModelRendererTurbo(this, 99, 101, textureX, textureY);
    bodyModel[181] = new ModelRendererTurbo(this, 99, 101, textureX, textureY);
    bodyModel[182] = new ModelRendererTurbo(this, 99, 101, textureX, textureY);
    bodyModel[183] = new ModelRendererTurbo(this, 99, 101, textureX, textureY);
    bodyModel[184] = new ModelRendererTurbo(this, 99, 101, textureX, textureY);
    
    bodyModel[0].addShapeBox(-37.0F, 0.0F, -15.0F, 79, 8, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[0].setRotationPoint(0.0F, -9.0F, 0.0F);
    
    bodyModel[1].addShapeBox(-37.0F, 0.0F, -15.0F, 79, 3, 30, 0.0F, -3.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    bodyModel[2].addShapeBox(0.0F, 0.0F, -15.0F, 16, 4, 30, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(26.0F, -13.0F, 0.0F);
    
    bodyModel[3].addBox(-37.0F, 0.0F, -15.0F, 63, 4, 30, 0.0F);
    bodyModel[3].setRotationPoint(0.0F, -13.0F, 0.0F);
    
    bodyModel[4].addShapeBox(-28.0F, 0.0F, -15.0F, 26, 6, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[4].setRotationPoint(0.0F, -19.0F, 0.0F);
    
    bodyModel[5].addShapeBox(-19.0F, 0.0F, -15.0F, 17, 6, 30, 0.0F, -3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -4.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[5].setRotationPoint(-26.0F, -19.0F, 0.0F);
    
    bodyModel[6].addShapeBox(-8.0F, 0.0F, -15.0F, 8, 6, 30, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    bodyModel[6].setRotationPoint(-37.0F, -13.0F, 0.0F);
    
    bodyModel[7].addBox(-27.0F, 0.0F, 0.0F, 51, 1, 10, 0.0F);
    bodyModel[7].setRotationPoint(0.0F, -14.0F, 15.0F);
    
    bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 17, 1, 10, 0.0F);
    bodyModel[8].setRotationPoint(24.0F, -14.0F, 15.0F);
    (bodyModel[8]).rotateAngleZ = -0.05759586F;
    
    bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 6, 1, 10, 0.0F);
    bodyModel[9].setRotationPoint(41.0F, -13.0F, 15.0F);
    (bodyModel[9]).rotateAngleZ = -0.6981317F;
    
    bodyModel[10].addBox(-13.0F, 0.0F, 0.0F, 13, 1, 10, 0.0F);
    bodyModel[10].setRotationPoint(-27.0F, -14.0F, 15.0F);
    (bodyModel[10]).rotateAngleZ = 0.07504916F;
    
    bodyModel[11].addBox(-6.0F, 0.0F, 0.0F, 6, 1, 10, 0.0F);
    bodyModel[11].setRotationPoint(-40.0F, -13.0F, 15.0F);
    (bodyModel[11]).rotateAngleZ = 0.6981317F;
    
    bodyModel[12].addBox(-27.0F, 0.0F, -10.0F, 51, 1, 10, 0.0F);
    bodyModel[12].setRotationPoint(0.0F, -14.0F, -15.0F);
    
    bodyModel[13].addBox(0.0F, 0.0F, -10.0F, 17, 1, 10, 0.0F);
    bodyModel[13].setRotationPoint(24.0F, -14.0F, -15.0F);
    (bodyModel[13]).rotateAngleZ = -0.05759586F;
    
    bodyModel[14].addBox(0.0F, 0.0F, -10.0F, 6, 1, 10, 0.0F);
    bodyModel[14].setRotationPoint(41.0F, -13.0F, -15.0F);
    (bodyModel[14]).rotateAngleZ = -0.6981317F;
    
    bodyModel[15].addBox(-13.0F, 0.0F, -10.0F, 13, 1, 10, 0.0F);
    bodyModel[15].setRotationPoint(-27.0F, -14.0F, -15.0F);
    (bodyModel[15]).rotateAngleZ = 0.07504916F;
    
    bodyModel[16].addBox(-6.0F, 0.0F, -10.0F, 6, 1, 10, 0.0F);
    bodyModel[16].setRotationPoint(-40.0F, -13.0F, -15.0F);
    (bodyModel[16]).rotateAngleZ = 0.6981317F;
    
    bodyModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 22, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -18.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -18.0F, 0.0F, 0.0F);
    bodyModel[17].setRotationPoint(24.0F, -13.0F, 15.0F);
    
    bodyModel[18].addShapeBox(0.0F, 0.0F, -1.0F, 22, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -18.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -18.0F, 0.0F, 0.0F);
    bodyModel[18].setRotationPoint(24.0F, -13.0F, -15.0F);
    
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 19, 2, 5, 0.0F);
    bodyModel[19].setRotationPoint(-28.0F, -19.0F, 15.0F);
    
    bodyModel[20].addBox(0.0F, 0.0F, -5.0F, 19, 2, 5, 0.0F);
    bodyModel[20].setRotationPoint(-28.0F, -19.0F, -15.0F);
    
    bodyModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 19, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[21].setRotationPoint(-28.0F, -17.0F, 15.0F);
    
    bodyModel[22].addShapeBox(0.0F, 0.0F, -5.0F, 19, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[22].setRotationPoint(-28.0F, -17.0F, -15.0F);
    
    bodyModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 5, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[23].setRotationPoint(-26.0F, -20.3F, 7.5F);
    
    bodyModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 5, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[24].setRotationPoint(-26.0F, -20.3F, 1.5F);
    
    bodyModel[25].addShapeBox(0.0F, 0.0F, -5.0F, 13, 1, 5, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[25].setRotationPoint(-26.0F, -20.3F, -1.5F);
    
    bodyModel[26].addBox(0.0F, 0.0F, -5.0F, 13, 1, 5, 0.0F);
    bodyModel[26].setRotationPoint(-26.0F, -19.5F, -7.5F);
    
    bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 11, 1, 4, 0.0F);
    bodyModel[27].setRotationPoint(-25.0F, -20.0F, 2.0F);
    
    bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 12, 1, 4, 0.0F);
    bodyModel[28].setRotationPoint(-25.5F, -20.0F, 8.0F);
    
    bodyModel[29].addBox(0.0F, 0.0F, -4.0F, 11, 1, 4, 0.0F);
    bodyModel[29].setRotationPoint(-25.0F, -20.0F, -2.0F);
    
    bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    bodyModel[30].setRotationPoint(-14.0F, -20.0F, 9.0F);
    
    bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    bodyModel[31].setRotationPoint(-14.0F, -20.0F, 4.0F);
    
    bodyModel[32].addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    bodyModel[32].setRotationPoint(-14.0F, -20.0F, -6.0F);
    
    bodyModel[33].addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    bodyModel[33].setRotationPoint(-14.0F, -20.0F, -11.0F);
    
    bodyModel[34].addBox(-11.0F, -1.0F, 0.0F, 4, 1, 8, 0.0F);
    bodyModel[34].setRotationPoint(-28.0F, -19.0F, 3.0F);
    (bodyModel[34]).rotateAngleZ = 0.2817994F;
    
    bodyModel[35].addShapeBox(-12.0F, -1.5F, -0.5F, 6, 1, 9, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[35].setRotationPoint(-28.0F, -19.0F, 3.0F);
    (bodyModel[35]).rotateAngleZ = 0.2817994F;
    
    bodyModel[36].addBox(-11.0F, -1.0F, -8.0F, 4, 1, 8, 0.0F);
    bodyModel[36].setRotationPoint(-28.0F, -19.0F, -3.0F);
    (bodyModel[36]).rotateAngleZ = 0.2817994F;
    
    bodyModel[37].addShapeBox(-12.0F, -1.5F, -8.5F, 6, 1, 9, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[37].setRotationPoint(-28.0F, -19.0F, -3.0F);
    (bodyModel[37]).rotateAngleZ = 0.2817994F;
    
    bodyModel[38].addShapeBox(0.0F, 0.0F, -1.0F, 5, 3, 1, 0.0F, -1.0F, -1.45F, -0.5F, -1.0F, -1.45F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.45F, -0.5F, -1.0F, -1.45F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[38].setRotationPoint(16.0F, -18.0F, -15.0F);
    
    bodyModel[39].addShapeBox(-3.0F, 0.0F, 0.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[39].setRotationPoint(27.0F, -17.0F, 4.0F);
    
    bodyModel[40].addBox(-1.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
    bodyModel[40].setRotationPoint(26.0F, -15.0F, 5.5F);
    
    bodyModel[41].addShapeBox(-9.0F, -1.0F, -2.0F, 9, 1, 4, 0.0F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F);
    bodyModel[41].setRotationPoint(-28.0F, -19.0F, 0.0F);
    (bodyModel[41]).rotateAngleZ = 0.2817994F;
    
    bodyModel[42].addShapeBox(-3.0F, 0.0F, 0.0F, 3, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[42].setRotationPoint(27.0F, -18.5F, -11.0F);
    
    bodyModel[43].addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
    bodyModel[43].setRotationPoint(23.0F, -10.0F, 15.0F);
    
    bodyModel[44].addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
    bodyModel[44].setRotationPoint(-22.0F, -10.0F, 15.0F);
    
    bodyModel[45].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    bodyModel[45].setRotationPoint(23.5F, -6.0F, 15.0F);
    
    bodyModel[46].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    bodyModel[46].setRotationPoint(-21.5F, -6.0F, 15.0F);
    
    bodyModel[47].addBox(0.0F, 0.0F, -0.5F, 3, 2, 3, 0.0F);
    bodyModel[47].setRotationPoint(23.0F, -2.0F, 15.0F);
    
    bodyModel[48].addBox(0.0F, 0.0F, -0.5F, 3, 2, 3, 0.0F);
    bodyModel[48].setRotationPoint(-22.0F, -2.0F, 15.0F);
    
    bodyModel[49].addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
    bodyModel[49].setRotationPoint(2.0F, -10.0F, 15.0F);
    
    bodyModel[50].addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
    bodyModel[50].setRotationPoint(19.0F, -10.0F, 15.0F);
    
    bodyModel[51].addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
    bodyModel[51].setRotationPoint(-16.0F, -10.0F, 15.0F);
    
    bodyModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[52].setRotationPoint(36.0F, -8.0F, 15.0F);
    
    bodyModel[53].addShapeBox(-3.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[53].setRotationPoint(36.0F, -8.0F, 15.0F);
    
    bodyModel[54].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[54].setRotationPoint(31.0F, -1.0F, 15.0F);
    (bodyModel[54]).rotateAngleZ = -1.134464F;
    
    bodyModel[55].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[55].setRotationPoint(22.0F, -1.0F, 15.0F);
    (bodyModel[55]).rotateAngleZ = -1.134464F;
    
    bodyModel[56].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[56].setRotationPoint(13.0F, -1.0F, 15.0F);
    (bodyModel[56]).rotateAngleZ = -1.134464F;
    
    bodyModel[57].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[57].setRotationPoint(4.0F, -1.0F, 15.0F);
    (bodyModel[57]).rotateAngleZ = -1.134464F;
    
    bodyModel[58].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[58].setRotationPoint(-5.0F, -1.0F, 15.0F);
    (bodyModel[58]).rotateAngleZ = -1.134464F;
    
    bodyModel[59].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[59].setRotationPoint(-14.0F, -1.0F, 15.0F);
    (bodyModel[59]).rotateAngleZ = -1.134464F;
    
    bodyModel[60].addBox(0.0F, 0.0F, -2.0F, 2, 4, 5, 0.0F);
    bodyModel[60].setRotationPoint(-33.0F, -7.0F, 15.0F);
    
    bodyModel[61].addBox(0.0F, 0.0F, -3.0F, 3, 4, 3, 0.0F);
    bodyModel[61].setRotationPoint(23.0F, -10.0F, -15.0F);
    
    bodyModel[62].addBox(0.0F, 0.0F, -3.0F, 3, 4, 3, 0.0F);
    bodyModel[62].setRotationPoint(-22.0F, -10.0F, -15.0F);
    
    bodyModel[63].addBox(0.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
    bodyModel[63].setRotationPoint(23.5F, -6.0F, -15.0F);
    
    bodyModel[64].addBox(0.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
    bodyModel[64].setRotationPoint(-21.5F, -6.0F, -15.0F);
    
    bodyModel[65].addBox(0.0F, 0.0F, -2.5F, 3, 2, 3, 0.0F);
    bodyModel[65].setRotationPoint(23.0F, -2.0F, -15.0F);
    
    bodyModel[66].addBox(0.0F, 0.0F, -2.5F, 3, 2, 3, 0.0F);
    bodyModel[66].setRotationPoint(-22.0F, -2.0F, -15.0F);
    
    bodyModel[67].addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
    bodyModel[67].setRotationPoint(2.0F, -10.0F, -15.0F);
    
    bodyModel[68].addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
    bodyModel[68].setRotationPoint(19.0F, -10.0F, -15.0F);
    
    bodyModel[69].addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
    bodyModel[69].setRotationPoint(-16.0F, -10.0F, -15.0F);
    
    bodyModel[70].addShapeBox(0.0F, 0.0F, -2.0F, 3, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[70].setRotationPoint(36.0F, -8.0F, -15.0F);
    
    bodyModel[71].addShapeBox(-3.0F, 0.0F, -2.0F, 3, 6, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[71].setRotationPoint(36.0F, -8.0F, -15.0F);
    
    bodyModel[72].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[72].setRotationPoint(31.0F, -1.0F, -15.0F);
    (bodyModel[72]).rotateAngleZ = -1.134464F;
    
    bodyModel[73].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[73].setRotationPoint(22.0F, -1.0F, -15.0F);
    (bodyModel[73]).rotateAngleZ = -1.134464F;
    
    bodyModel[74].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[74].setRotationPoint(13.0F, -1.0F, -15.0F);
    (bodyModel[74]).rotateAngleZ = -1.134464F;
    
    bodyModel[75].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[75].setRotationPoint(4.0F, -1.0F, -15.0F);
    (bodyModel[75]).rotateAngleZ = -1.134464F;
    
    bodyModel[76].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[76].setRotationPoint(-5.0F, -1.0F, -15.0F);
    (bodyModel[76]).rotateAngleZ = -1.134464F;
    
    bodyModel[77].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[77].setRotationPoint(-14.0F, -1.0F, -15.0F);
    (bodyModel[77]).rotateAngleZ = -1.134464F;
    
    bodyModel[78].addBox(0.0F, 0.0F, -3.0F, 2, 4, 5, 0.0F);
    bodyModel[78].setRotationPoint(-33.0F, -7.0F, -15.0F);
    
    bodyModel[79].addShapeBox(0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
    bodyModel[79].setRotationPoint(32.0F, -14.0F, -19.0F);
    
    bodyModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
    bodyModel[80].setRotationPoint(32.0F, -14.0F, 19.0F);
    
    bodyModel[81].addBox(-2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    bodyModel[81].setRotationPoint(34.0F, -16.5F, -20.5F);
    
    bodyModel[82].addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[82].setRotationPoint(36.0F, -5.0F, 17.0F);
    
    bodyModel[83].addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[83].setRotationPoint(-32.0F, -5.0F, 17.0F);
    
    bodyModel[84].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[84].setRotationPoint(24.5F, 2.5F, 17.0F);
    
    bodyModel[85].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[85].setRotationPoint(15.5F, 2.5F, 17.0F);
    
    bodyModel[86].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[86].setRotationPoint(6.5F, 2.5F, 17.0F);
    
    bodyModel[87].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[87].setRotationPoint(-2.5F, 2.5F, 17.0F);
    
    bodyModel[88].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[88].setRotationPoint(-11.5F, 2.5F, 17.0F);
    
    bodyModel[89].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[89].setRotationPoint(-20.5F, 2.5F, 17.0F);
    
    bodyModel[90].addBox(-0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[90].setRotationPoint(36.0F, -5.0F, -17.0F);
    
    bodyModel[91].addBox(-0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[91].setRotationPoint(-32.0F, -5.0F, -17.0F);
    
    bodyModel[92].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[92].setRotationPoint(24.5F, 2.5F, -17.0F);
    
    bodyModel[93].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[93].setRotationPoint(15.5F, 2.5F, -17.0F);
    
    bodyModel[94].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[94].setRotationPoint(6.5F, 2.5F, -17.0F);
    
    bodyModel[95].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[95].setRotationPoint(-2.5F, 2.5F, -17.0F);
    
    bodyModel[96].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[96].setRotationPoint(-11.5F, 2.5F, -17.0F);
    
    bodyModel[97].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[97].setRotationPoint(-20.5F, 2.5F, -17.0F);
    
    bodyModel[98].addBox(0.0F, 0.0F, 1.0F, 6, 3, 8, 0.0F);
    bodyModel[98].setRotationPoint(3.0F, -17.0F, 15.0F);
    
    bodyModel[99].addBox(0.0F, 0.0F, 0.0F, 9, 2, 7, 0.0F);
    bodyModel[99].setRotationPoint(-7.0F, -16.0F, 15.5F);
    
    bodyModel[100].addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
    bodyModel[100].setRotationPoint(-43.0F, -9.5F, 1.0F);
    
    bodyModel[101].addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
    bodyModel[101].setRotationPoint(-43.0F, -9.5F, -1.0F);
    
    bodyModel[102].addBox(0.0F, 0.0F, -0.5F, 5, 1, 1, 0.0F);
    bodyModel[102].setRotationPoint(-48.0F, -6.5F, 1.0F);
    
    bodyModel[103].addBox(0.0F, 0.0F, -0.5F, 5, 1, 1, 0.0F);
    bodyModel[103].setRotationPoint(-48.0F, -6.5F, -1.0F);
    
    bodyModel[104].addBox(0.0F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
    bodyModel[104].setRotationPoint(-48.0F, -12.5F, 1.0F);
    
    bodyModel[105].addBox(0.0F, 0.0F, -0.5F, 1, 6, 1, 0.0F);
    bodyModel[105].setRotationPoint(-48.0F, -12.5F, -1.0F);
    
    bodyModel[106].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[106].setRotationPoint(-48.5F, -13.5F, -1.0F);
    
    bodyModel[107].addShape3D(6.0F, -6.0F, -12.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 2.0D, 0, 2) }), 12.0F, 6, 6, 20, 12, 0, new float[] { 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F });
    bodyModel[107].setRotationPoint(-50.5F, -15.0F, 2.0F);
    
    bodyModel[108].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    bodyModel[108].setRotationPoint(-48.5F, -16.5F, 11.5F);
    
    bodyModel[109].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[109].setRotationPoint(-48.0F, -17.0F, 12.0F);
    
    bodyModel[110].addShapeBox(0.0F, -1.0F, -7.0F, 1, 2, 11, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[110].setRotationPoint(28.0F, -13.0F, 0.0F);
    (bodyModel[110]).rotateAngleZ = 0.3316126F;
    
    bodyModel[111].addShapeBox(0.0F, -6.0F, -7.0F, 1, 5, 11, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[111].setRotationPoint(28.0F, -13.0F, 0.0F);
    (bodyModel[111]).rotateAngleZ = 0.3316126F;
    
    bodyModel[112].addShapeBox(0.0F, -6.0F, -10.0F, 1, 2, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
    bodyModel[112].setRotationPoint(28.0F, -13.0F, 0.0F);
    (bodyModel[112]).rotateAngleZ = 0.3316126F;
    
    bodyModel[113].addShapeBox(0.0F, -6.0F, -15.0F, 1, 7, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[113].setRotationPoint(28.0F, -13.0F, 0.0F);
    (bodyModel[113]).rotateAngleZ = 0.3316126F;
    
    bodyModel[114].addShapeBox(0.0F, -1.0F, -10.0F, 1, 2, 3, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[114].setRotationPoint(28.0F, -13.0F, 0.0F);
    (bodyModel[114]).rotateAngleZ = 0.3316126F;
    
    bodyModel[115].addShapeBox(0.0F, -6.0F, 4.0F, 1, 1, 8, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[115].setRotationPoint(28.0F, -13.0F, 0.0F);
    (bodyModel[115]).rotateAngleZ = 0.3316126F;
    
    bodyModel[116].addShapeBox(0.0F, -6.0F, 12.0F, 1, 5, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[116].setRotationPoint(28.0F, -13.0F, 0.0F);
    (bodyModel[116]).rotateAngleZ = 0.3316126F;
    
    bodyModel[117].addShapeBox(0.0F, -5.0F, 4.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[117].setRotationPoint(28.0F, -13.0F, 0.0F);
    (bodyModel[117]).rotateAngleZ = 0.3316126F;
    
    bodyModel[118].addShapeBox(0.0F, -5.0F, 10.0F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[118].setRotationPoint(28.0F, -13.0F, 0.0F);
    (bodyModel[118]).rotateAngleZ = 0.3316126F;
    
    bodyModel[119].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[119].setRotationPoint(24.0F, -19.0F, -14.5F);
    
    bodyModel[120].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[120].setRotationPoint(24.0F, -19.0F, -9.0F);
    
    bodyModel[121].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[121].setRotationPoint(24.0F, -19.0F, -6.0F);
    
    bodyModel[122].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[122].setRotationPoint(24.0F, -19.0F, -3.0F);
    
    bodyModel[123].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[123].setRotationPoint(24.0F, -19.0F, 2.0F);
    
    bodyModel[124].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[124].setRotationPoint(24.0F, -19.0F, 4.0F);
    
    bodyModel[125].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[125].setRotationPoint(24.0F, -19.0F, 11.0F);
    
    bodyModel[126].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[126].setRotationPoint(24.0F, -19.0F, 13.5F);
    
    bodyModel[127].addBox(0.0F, 0.5F, -6.0F, 2, 7, 16, 0.0F);
    bodyModel[127].setRotationPoint(42.0F, -9.0F, 0.0F);
    (bodyModel[127]).rotateAngleZ = -0.2530727F;
    
    bodyModel[128].addShapeBox(2.0F, 3.0F, -12.0F, 1, 2, 24, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[128].setRotationPoint(42.0F, -9.0F, 0.0F);
    (bodyModel[128]).rotateAngleZ = -0.2530727F;
    
    bodyModel[129].addShapeBox(0.0F, 3.0F, -12.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[129].setRotationPoint(42.0F, -9.0F, 0.0F);
    (bodyModel[129]).rotateAngleZ = -0.2530727F;
    
    bodyModel[130].addShapeBox(0.0F, 3.0F, 11.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[130].setRotationPoint(42.0F, -9.0F, 0.0F);
    (bodyModel[130]).rotateAngleZ = -0.2530727F;
    
    bodyModel[131].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[131].setRotationPoint(11.0F, -15.0F, -21.0F);
    
    bodyModel[132].addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
    bodyModel[132].setRotationPoint(11.0F, -14.5F, -19.5F);
    (bodyModel[132]).rotateAngleY = 0.2617994F;
    
    bodyModel[133].addBox(0.0F, 0.0F, -1.0F, 7, 1, 1, 0.0F);
    bodyModel[133].setRotationPoint(11.0F, -14.5F, -19.5F);
    (bodyModel[133]).rotateAngleY = -0.2617994F;
    
    bodyModel[134].addBox(-2.0F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
    bodyModel[134].setRotationPoint(10.5F, -14.5F, -19.5F);
    
    bodyModel[135].addShapeBox(0.0F, 0.0F, -1.5F, 30, 2, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[135].setRotationPoint(-36.5F, -18.0F, -22.0F);
    
    bodyModel[136].addBox(0.0F, 0.0F, -0.5F, 1, 4, 1, 0.0F);
    bodyModel[136].setRotationPoint(-32.0F, -17.0F, -22.0F);
    
    bodyModel[137].addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
    bodyModel[137].setRotationPoint(-21.0F, -17.0F, -22.0F);
    
    bodyModel[138].addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
    bodyModel[138].setRotationPoint(-8.0F, -17.0F, -22.0F);
    
    bodyModel[139].addBox(0.0F, 0.0F, 0.0F, 15, 3, 1, 0.0F);
    bodyModel[139].setRotationPoint(-24.0F, -17.5F, 21.5F);
    
    bodyModel[140].addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
    bodyModel[140].setRotationPoint(-23.0F, -18.0F, 21.0F);
    
    bodyModel[141].addBox(0.0F, 0.0F, 0.0F, 1, 4, 2, 0.0F);
    bodyModel[141].setRotationPoint(-12.0F, -18.0F, 21.0F);
    
    bodyModel[142].addShapeBox(0.0F, 0.0F, -0.5F, 6, 2, 1, 0.0F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    bodyModel[142].setRotationPoint(-20.0F, -19.0F, 22.0F);
    
    bodyModel[143].addShapeBox(0.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
    bodyModel[143].setRotationPoint(22.0F, -16.5F, -9.25F);
    
    bodyModel[144].addShapeBox(0.0F, 0.0F, -8.0F, 1, 1, 16, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[144].setRotationPoint(22.0F, -20.0F, 0.0F);
    
    bodyModel[145].addShapeBox(-4.0F, 0.0F, -7.0F, 5, 1, 7, 0.0F, -0.45F, -0.3F, 0.0F, -4.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -4.45F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
    bodyModel[145].setRotationPoint(22.0F, -20.0F, -8.0F);
    
    bodyModel[146].addShapeBox(-4.0F, 0.0F, 0.0F, 5, 1, 7, 0.0F, -4.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -4.45F, -0.3F, 0.0F, -0.45F, -0.3F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[146].setRotationPoint(22.0F, -20.0F, 8.0F);
    
    bodyModel[147].addShapeBox(0.0F, -1.0F, 12.0F, 1, 2, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[147].setRotationPoint(28.0F, -13.0F, 0.0F);
    (bodyModel[147]).rotateAngleZ = 0.3316126F;
    
    bodyModel[148].addShapeBox(-1.0F, 0.0F, 0.0F, 1, 2, 8, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    bodyModel[148].setRotationPoint(29.0F, -14.0F, 4.0F);
    
    bodyModel[149].addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
    bodyModel[149].setRotationPoint(26.5F, -15.0F, 4.5F);
    
    bodyModel[150].addBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
    bodyModel[150].setRotationPoint(26.5F, -15.0F, 10.5F);
    
    bodyModel[151].addBox(-2.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F);
    bodyModel[151].setRotationPoint(26.5F, -14.0F, 4.5F);
    
    bodyModel[152].addShapeBox(4.75F, 0.0F, 0.0F, 1, 3, 8, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
    bodyModel[152].setRotationPoint(3.0F, -17.0F, 16.0F);
    
    bodyModel[153].addShapeBox(0.25F, 0.0F, 0.0F, 1, 3, 8, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
    bodyModel[153].setRotationPoint(3.0F, -17.0F, 16.0F);
    
    bodyModel[154].addBox(-1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[154].setRotationPoint(-44.0F, -13.0F, 12.0F);
    
    bodyModel[155].addBox(-1.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[155].setRotationPoint(-44.0F, -13.0F, 3.0F);
    
    bodyModel[156].addShape3D(0.0F, 0.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    bodyModel[156].setRotationPoint(17.5F, -14.0F, 24.0F);
    (bodyModel[156]).rotateAngleX = 1.5707964F;
    
    bodyModel[157].addShape3D(-2.0F, 0.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    bodyModel[157].setRotationPoint(-27.0F, -14.0F, 24.0F);
    (bodyModel[157]).rotateAngleX = 1.5707964F;
    (bodyModel[157]).rotateAngleZ = 0.07504916F;
    
    bodyModel[158].addShapeBox(-3.0F, 3.0F, 0.0F, 3, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[158].setRotationPoint(27.0F, -18.5F, -11.0F);
    
    bodyModel[159].addShapeBox(-3.0F, 3.0F, 0.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[159].setRotationPoint(27.0F, -19.5F, -11.0F);
    
    bodyModel[160].addShapeBox(-3.0F, 3.0F, 3.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[160].setRotationPoint(27.0F, -19.5F, -11.0F);
    
    bodyModel[161].addShapeBox(-3.0F, 2.0F, -0.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[161].setRotationPoint(27.0F, -18.5F, -9.0F);
    
    bodyModel[162].addShapeBox(0.0F, 0.0F, 0.0F, 5, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.45F, -0.5F, -1.0F, -1.45F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.45F, -0.5F, -1.0F, -1.45F, -0.5F);
    bodyModel[162].setRotationPoint(16.0F, -18.0F, 15.0F);
    
    bodyModel[163].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 7, 0.0F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F);
    bodyModel[163].setRotationPoint(-7.0F, -16.0F, 15.5F);
    
    bodyModel[164].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[164].setRotationPoint(34.0F, -17.5F, -20.5F);
    
    bodyModel[165].addShapeBox(-2.0F, 2.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    bodyModel[165].setRotationPoint(34.0F, -17.5F, -20.5F);
    
    bodyModel[166].addShapeBox(-2.0F, 2.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    bodyModel[166].setRotationPoint(34.0F, -17.5F, 18.5F);
    
    bodyModel[167].addBox(-2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    bodyModel[167].setRotationPoint(34.0F, -16.5F, 18.5F);
    
    bodyModel[168].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[168].setRotationPoint(34.0F, -17.5F, 18.5F);
    
    bodyModel[169].addShapeBox(-0.85F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
    bodyModel[169].setRotationPoint(34.0F, -16.5F, -20.5F);
    
    bodyModel[170].addShapeBox(-0.85F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
    bodyModel[170].setRotationPoint(34.0F, -17.5F, -20.5F);
    
    bodyModel[171].addShapeBox(-0.85F, 2.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F);
    bodyModel[171].setRotationPoint(34.0F, -17.5F, -20.5F);
    
    bodyModel[172].addShapeBox(-0.85F, 2.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F);
    bodyModel[172].setRotationPoint(34.0F, -17.5F, 18.5F);
    
    bodyModel[173].addShapeBox(-0.85F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
    bodyModel[173].setRotationPoint(34.0F, -16.5F, 18.5F);
    
    bodyModel[174].addShapeBox(-0.85F, 0.0F, 0.0F, 1, 1, 2, 0.0F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, -0.6F, -0.5F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F);
    bodyModel[174].setRotationPoint(34.0F, -17.5F, 18.5F);
    
    bodyModel[175].addShapeBox(0.0F, 0.0F, -1.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F);
    bodyModel[175].setRotationPoint(32.0F, -15.0F, -19.0F);
    
    bodyModel[176].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F, -0.5F, 0.0F, -0.1F);
    bodyModel[176].setRotationPoint(32.0F, -15.0F, 19.0F);
    
    bodyModel[177].addBox(-9.0F, -2.0F, -2.0F, 9, 1, 4, 0.0F);
    bodyModel[177].setRotationPoint(-28.0F, -19.0F, 0.0F);
    (bodyModel[177]).rotateAngleZ = 0.2817994F;
    
    bodyModel[178].addShapeBox(-2.0F, 0.0F, -15.0F, 28, 6, 30, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[178].setRotationPoint(0.0F, -19.0F, 0.0F);
    
    bodyModel[179].addShapeBox(4.5F, -0.2F, 1.0F, 6, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[179].setRotationPoint(26.0F, -13.0F, 0.0F);
    (bodyModel[179]).rotateAngleZ = -0.0837758F;
    
    bodyModel[180].addShapeBox(5.5F, -0.2F, -11.0F, 5, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[180].setRotationPoint(26.0F, -13.0F, 0.0F);
    (bodyModel[180]).rotateAngleZ = -0.0837758F;
    
    bodyModel[181].addShapeBox(10.0F, -0.4F, -10.0F, 1, 1, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
    bodyModel[181].setRotationPoint(26.0F, -13.0F, 0.0F);
    (bodyModel[181]).rotateAngleZ = -0.0837758F;
    
    bodyModel[182].addShapeBox(10.0F, -0.4F, -4.0F, 1, 1, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
    bodyModel[182].setRotationPoint(26.0F, -13.0F, 0.0F);
    (bodyModel[182]).rotateAngleZ = -0.0837758F;
    
    bodyModel[183].addShapeBox(10.0F, -0.4F, 2.0F, 1, 1, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
    bodyModel[183].setRotationPoint(26.0F, -13.0F, 0.0F);
    (bodyModel[183]).rotateAngleZ = -0.0837758F;
    
    bodyModel[184].addShapeBox(10.0F, -0.4F, 10.0F, 1, 1, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
    bodyModel[184].setRotationPoint(26.0F, -13.0F, 0.0F);
    (bodyModel[184]).rotateAngleZ = -0.0837758F;

    
    turretModel = new ModelRendererTurbo[87];
    turretModel[0] = new ModelRendererTurbo(this, 0, 340, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 100, 340, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 180, 340, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 250, 340, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 300, 340, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 340, 340, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 370, 340, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 400, 340, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 430, 340, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 200, 390, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 280, 390, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 340, 390, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 400, 390, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 0, 420, textureX, textureY);
    turretModel[14] = new ModelRendererTurbo(this, 50, 420, textureX, textureY);
    turretModel[15] = new ModelRendererTurbo(this, 100, 420, textureX, textureY);
    turretModel[16] = new ModelRendererTurbo(this, 150, 420, textureX, textureY);
    turretModel[17] = new ModelRendererTurbo(this, 153, 373, textureX, textureY);
    turretModel[18] = new ModelRendererTurbo(this, 56, 393, textureX, textureY);
    turretModel[19] = new ModelRendererTurbo(this, 56, 374, textureX, textureY);
    turretModel[20] = new ModelRendererTurbo(this, 231, 374, textureX, textureY);
    turretModel[21] = new ModelRendererTurbo(this, 195, 374, textureX, textureY);
    turretModel[22] = new ModelRendererTurbo(this, 154, 391, textureX, textureY);
    turretModel[23] = new ModelRendererTurbo(this, 93, 405, textureX, textureY);
    turretModel[24] = new ModelRendererTurbo(this, 23, 376, textureX, textureY);
    turretModel[25] = new ModelRendererTurbo(this, 155, 406, textureX, textureY);
    turretModel[26] = new ModelRendererTurbo(this, 147, 368, textureX, textureY);
    turretModel[27] = new ModelRendererTurbo(this, 101, 374, textureX, textureY);
    turretModel[28] = new ModelRendererTurbo(this, 112, 367, textureX, textureY);
    turretModel[29] = new ModelRendererTurbo(this, 101, 367, textureX, textureY);
    turretModel[30] = new ModelRendererTurbo(this, 124, 375, textureX, textureY);
    turretModel[31] = new ModelRendererTurbo(this, 115, 375, textureX, textureY);
    turretModel[32] = new ModelRendererTurbo(this, 123, 368, textureX, textureY);
    turretModel[33] = new ModelRendererTurbo(this, 138, 373, textureX, textureY);
    turretModel[34] = new ModelRendererTurbo(this, 165, 349, textureX, textureY);
    turretModel[35] = new ModelRendererTurbo(this, 154, 349, textureX, textureY);
    turretModel[36] = new ModelRendererTurbo(this, 169, 358, textureX, textureY);
    turretModel[37] = new ModelRendererTurbo(this, 164, 358, textureX, textureY);
    turretModel[38] = new ModelRendererTurbo(this, 138, 368, textureX, textureY);
    turretModel[39] = new ModelRendererTurbo(this, 133, 373, textureX, textureY);
    turretModel[40] = new ModelRendererTurbo(this, 165, 340, textureX, textureY);
    turretModel[41] = new ModelRendererTurbo(this, 154, 340, textureX, textureY);
    turretModel[42] = new ModelRendererTurbo(this, 159, 358, textureX, textureY);
    turretModel[43] = new ModelRendererTurbo(this, 154, 358, textureX, textureY);
    turretModel[44] = new ModelRendererTurbo(this, 143, 340, textureX, textureY);
    turretModel[45] = new ModelRendererTurbo(this, 133, 368, textureX, textureY);
    turretModel[46] = new ModelRendererTurbo(this, 150, 430, textureX, textureY);
    turretModel[47] = new ModelRendererTurbo(this, 50, 420, textureX, textureY);
    turretModel[48] = new ModelRendererTurbo(this, 400, 390, textureX, textureY);
    turretModel[49] = new ModelRendererTurbo(this, 0, 420, textureX, textureY);
    turretModel[50] = new ModelRendererTurbo(this, 100, 420, textureX, textureY);
    turretModel[51] = new ModelRendererTurbo(this, 127, 409, textureX, textureY);
    turretModel[52] = new ModelRendererTurbo(this, 127, 405, textureX, textureY);
    turretModel[53] = new ModelRendererTurbo(this, 126, 429, textureX, textureY);
    turretModel[54] = new ModelRendererTurbo(this, 142, 408, textureX, textureY);
    turretModel[55] = new ModelRendererTurbo(this, 200, 390, textureX, textureY);
    turretModel[56] = new ModelRendererTurbo(this, 189, 399, textureX, textureY);
    turretModel[57] = new ModelRendererTurbo(this, 189, 395, textureX, textureY);
    turretModel[58] = new ModelRendererTurbo(this, 200, 403, textureX, textureY);
    turretModel[59] = new ModelRendererTurbo(this, 200, 399, textureX, textureY);
    turretModel[60] = new ModelRendererTurbo(this, 200, 395, textureX, textureY);
    turretModel[61] = new ModelRendererTurbo(this, 94, 368, textureX, textureY);
    turretModel[62] = new ModelRendererTurbo(this, 75, 368, textureX, textureY);
    turretModel[63] = new ModelRendererTurbo(this, 75, 368, textureX, textureY);
    turretModel[64] = new ModelRendererTurbo(this, 75, 368, textureX, textureY);
    turretModel[65] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[66] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[67] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[68] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[69] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[70] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[71] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[72] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[73] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[74] = new ModelRendererTurbo(this, 87, 368, textureX, textureY);
    turretModel[75] = new ModelRendererTurbo(this, 75, 368, textureX, textureY);
    turretModel[76] = new ModelRendererTurbo(this, 75, 368, textureX, textureY);
    turretModel[77] = new ModelRendererTurbo(this, 75, 368, textureX, textureY);
    turretModel[78] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[79] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[80] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[81] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[82] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[83] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[84] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[85] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    turretModel[86] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    
    turretModel[0].addShapeBox(0.0F, -10.0F, -11.0F, 14, 10, 22, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[0].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[1].addBox(-10.0F, -10.0F, -8.0F, 10, 10, 16, 0.0F);
    turretModel[1].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[2].addShapeBox(-16.0F, -10.0F, -9.0F, 6, 10, 18, 0.0F, -2.0F, 0.0F, -7.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -2.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 3.1F, 0.0F, 0.0F, 3.1F, 0.0F, 0.0F, -7.0F);
    turretModel[2].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[3].addShapeBox(-10.0F, -10.0F, 8.0F, 10, 10, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, -6.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.9F);
    turretModel[3].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[4].addShapeBox(-10.0F, -10.0F, -15.0F, 10, 10, 7, 0.0F, 0.0F, 0.0F, -6.9F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[4].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[5].addShapeBox(0.0F, -10.0F, 11.0F, 7, 10, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -3.9F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[5].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[6].addShapeBox(0.0F, -10.0F, -15.0F, 7, 10, 4, 0.0F, 0.0F, 0.0F, -3.9F, 0.0F, -0.6F, -3.9F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[6].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[7].addShapeBox(7.0F, -10.0F, 11.0F, 7, 10, 4, 0.0F, 0.0F, -0.6F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, -3.9F, 0.0F, -0.6F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, -3.0F, -1.5F, 0.0F, 0.0F, 0.0F);
    turretModel[7].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[8].addShapeBox(7.0F, -10.0F, -15.0F, 7, 10, 4, 0.0F, 0.0F, -0.6F, -3.9F, -2.0F, -1.0F, -3.9F, -2.0F, -1.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, -3.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.9F);
    turretModel[8].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[9].addBox(10.0F, -6.0F, -10.0F, 6, 3, 20, 0.0F);
    turretModel[9].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[10].addShapeBox(10.0F, -8.0F, -10.0F, 6, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[10].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[11].addShapeBox(10.0F, -3.0F, -10.0F, 6, 2, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[11].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[12].addBox(-25.0F, -16.0F, -2.0F, 15, 8, 4, 0.0F);
    turretModel[12].setRotationPoint(5.0F, -13.0F, 0.0F);
    
    turretModel[13].addShapeBox(-25.0F, -10.0F, 2.0F, 15, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    turretModel[13].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[14].addShapeBox(-25.0F, -10.0F, -5.0F, 15, 8, 3, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[14].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[15].addShapeBox(-24.0F, -10.0F, 5.0F, 14, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    turretModel[15].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[16].addShapeBox(-24.0F, -10.0F, -9.0F, 14, 4, 4, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[16].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[17].addBox(-10.0F, -13.0F, -7.0F, 6, 3, 14, 0.0F);
    turretModel[17].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[18].addShapeBox(-4.0F, -13.0F, -7.0F, 4, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
    turretModel[18].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[19].addShapeBox(-14.0F, -13.0F, -7.0F, 4, 3, 14, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
    turretModel[19].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[20].addBox(-10.0F, -14.0F, -6.5F, 6, 1, 13, 0.0F);
    turretModel[20].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[21].addShapeBox(-4.0F, -14.0F, -6.5F, 4, 1, 13, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, -3.5F, -0.6F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, -3.5F, -0.6F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F);
    turretModel[21].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[22].addShapeBox(-14.0F, -14.0F, -6.5F, 4, 1, 13, 0.0F, -0.6F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, -3.5F, -0.6F, 0.0F, -3.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, -3.5F);
    turretModel[22].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[23].addBox(-9.0F, -14.2F, -6.0F, 4, 1, 12, 0.0F);
    turretModel[23].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[24].addShapeBox(-5.0F, -14.2F, -6.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
    turretModel[24].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[25].addShapeBox(-13.0F, -14.2F, -6.0F, 4, 1, 12, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
    turretModel[25].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[26].addBox(-4.0F, 0.6F, -1.5F, 2, 1, 2, 0.0F);
    turretModel[26].setRotationPoint(-4.0F, -34.0F, 6.0F);
    (turretModel[26]).rotateAngleY = 0.7853982F;
    
    turretModel[27].addBox(2.0F, -0.5F, 0.0F, 2, 1, 4, 0.0F);
    turretModel[27].setRotationPoint(5.0F, -29.0F, -7.0F);
    (turretModel[27]).rotateAngleZ = -0.08726646F;
    
    turretModel[28].addShapeBox(4.0F, -0.5F, 0.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    turretModel[28].setRotationPoint(5.0F, -29.0F, -7.0F);
    (turretModel[28]).rotateAngleZ = -0.08726646F;
    
    turretModel[29].addShapeBox(1.0F, -0.5F, 0.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    turretModel[29].setRotationPoint(5.0F, -29.0F, -7.0F);
    (turretModel[29]).rotateAngleZ = -0.08726646F;
    
    turretModel[30].addBox(0.0F, -0.15F, 0.0F, 1, 1, 3, 0.0F);
    turretModel[30].setRotationPoint(3.0F, -29.0F, 6.0F);
    
    turretModel[31].addShapeBox(1.0F, -0.15F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    turretModel[31].setRotationPoint(3.0F, -29.0F, 6.0F);
    
    turretModel[32].addShapeBox(-1.0F, -0.15F, 0.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    turretModel[32].setRotationPoint(3.0F, -29.0F, 6.0F);
    
    turretModel[33].addBox(0.0F, -0.25F, 0.0F, 1, 1, 1, 0.0F);
    turretModel[33].setRotationPoint(1.5F, -29.0F, 7.0F);
    
    turretModel[34].addBox(-5.0F, 1.0F, -0.8F, 4, 7, 1, 0.0F);
    turretModel[34].setRotationPoint(5.0F, -29.0F, 11.1F);
    (turretModel[34]).rotateAngleX = 0.34906584F;
    (turretModel[34]).rotateAngleY = 0.29147F;
    
    turretModel[35].addBox(-8.0F, 1.0F, -0.8F, 3, 7, 1, 0.0F);
    turretModel[35].setRotationPoint(5.0F, -29.0F, 11.1F);
    (turretModel[35]).rotateAngleX = 0.34906584F;
    (turretModel[35]).rotateAngleY = 0.29147F;
    
    turretModel[36].addBox(-1.5F, 1.5F, -0.6F, 1, 6, 1, 0.0F);
    turretModel[36].setRotationPoint(5.0F, -29.0F, 11.1F);
    (turretModel[36]).rotateAngleX = 0.34906584F;
    (turretModel[36]).rotateAngleY = 0.29147F;
    
    turretModel[37].addBox(-8.5F, 1.5F, -0.6F, 1, 6, 1, 0.0F);
    turretModel[37].setRotationPoint(5.0F, -29.0F, 11.1F);
    (turretModel[37]).rotateAngleX = 0.34906584F;
    (turretModel[37]).rotateAngleY = 0.29147F;
    
    turretModel[38].addShapeBox(-4.75F, 3.5F, -0.3F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -1.4F, 0.0F, -0.5F, -1.4F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
    turretModel[38].setRotationPoint(5.0F, -29.0F, 11.1F);
    (turretModel[38]).rotateAngleX = 0.34906584F;
    (turretModel[38]).rotateAngleY = 0.29147F;
    
    turretModel[39].addShapeBox(-6.75F, 3.5F, -0.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[39].setRotationPoint(5.0F, -29.0F, 11.1F);
    (turretModel[39]).rotateAngleX = 0.34906584F;
    (turretModel[39]).rotateAngleY = 0.29147F;
    
    turretModel[40].addBox(-5.0F, 1.0F, -0.2F, 4, 7, 1, 0.0F);
    turretModel[40].setRotationPoint(5.0F, -29.0F, -11.1F);
    (turretModel[40]).rotateAngleX = -0.34906584F;
    (turretModel[40]).rotateAngleY = -0.28448868F;
    
    turretModel[41].addBox(-8.0F, 1.0F, -0.2F, 3, 7, 1, 0.0F);
    turretModel[41].setRotationPoint(5.0F, -29.0F, -11.1F);
    (turretModel[41]).rotateAngleX = -0.34906584F;
    (turretModel[41]).rotateAngleY = -0.28448868F;
    
    turretModel[42].addBox(-1.5F, 1.5F, -0.6F, 1, 6, 1, 0.0F);
    turretModel[42].setRotationPoint(5.0F, -29.0F, -11.1F);
    (turretModel[42]).rotateAngleX = -0.34906584F;
    (turretModel[42]).rotateAngleY = -0.28448868F;
    
    turretModel[43].addBox(-8.5F, 1.5F, -0.6F, 1, 6, 1, 0.0F);
    turretModel[43].setRotationPoint(5.0F, -29.0F, -11.1F);
    (turretModel[43]).rotateAngleX = -0.34906584F;
    (turretModel[43]).rotateAngleY = -0.28448868F;
    
    turretModel[44].addShapeBox(-4.75F, 3.5F, -0.7F, 3, 2, 1, 0.0F, -0.5F, -1.4F, 0.0F, -0.5F, -1.4F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    turretModel[44].setRotationPoint(5.0F, -29.0F, -11.1F);
    (turretModel[44]).rotateAngleX = -0.34906584F;
    (turretModel[44]).rotateAngleY = -0.28448868F;
    
    turretModel[45].addShapeBox(-6.75F, 3.5F, -0.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[45].setRotationPoint(5.0F, -29.0F, -11.1F);
    (turretModel[45]).rotateAngleX = -0.34906584F;
    (turretModel[45]).rotateAngleY = -0.28448868F;
    
    turretModel[46].addShapeBox(-24.0F, -12.0F, -9.0F, 10, 1, 4, 0.0F, -2.0F, -0.7F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[46].setRotationPoint(5.0F, -18.0F, 0.0F);
    
    turretModel[47].addShapeBox(-25.0F, -11.0F, -5.0F, 11, 1, 3, 0.0F, -1.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[47].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[48].addShapeBox(-25.0F, -17.0F, -2.0F, 11, 1, 4, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[48].setRotationPoint(5.0F, -13.0F, 0.0F);
    
    turretModel[49].addShapeBox(-25.0F, -11.0F, 2.0F, 11, 1, 3, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    turretModel[49].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[50].addShapeBox(-24.0F, -11.0F, 5.0F, 10, 1, 4, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, -0.7F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    turretModel[50].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[51].addShapeBox(-14.0F, -12.0F, -9.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.25F, -0.5F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[51].setRotationPoint(5.0F, -18.0F, 0.0F);
    
    turretModel[52].addShapeBox(-14.0F, -12.0F, 7.0F, 4, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[52].setRotationPoint(5.0F, -18.0F, 0.0F);
    
    turretModel[53].addShapeBox(-14.0F, -12.0F, 3.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, -3.0F, -1.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[53].setRotationPoint(5.0F, -18.0F, 0.0F);
    
    turretModel[54].addShapeBox(-14.0F, -12.0F, -7.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.25F, 0.0F, -1.0F, 0.25F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    turretModel[54].setRotationPoint(5.0F, -18.0F, 0.0F);
    
    turretModel[55].addShapeBox(12.0F, -6.0F, -11.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[55].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[56].addShapeBox(12.0F, -8.0F, -11.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, -0.9F, -2.0F, 0.0F, -0.9F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[56].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[57].addShapeBox(12.0F, -3.0F, -11.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, -2.0F, 0.0F, -0.9F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[57].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[58].addShapeBox(12.0F, -6.0F, 10.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[58].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[59].addShapeBox(12.0F, -8.0F, 10.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[59].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[60].addShapeBox(12.0F, -3.0F, 10.0F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F);
    turretModel[60].setRotationPoint(5.0F, -19.0F, 0.0F);
    
    turretModel[61].addShapeBox(10.0F, 0.0F, -0.1F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
    turretModel[61].setRotationPoint(5.0F, -29.0F, -11.1F);
    (turretModel[61]).rotateAngleX = -0.40142572F;
    (turretModel[61]).rotateAngleZ = -0.08726646F;
    
    turretModel[62].addShapeBox(0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
    turretModel[62].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[62]).rotateAngleX = -0.40142572F;
    (turretModel[62]).rotateAngleZ = 0.17453294F;
    
    turretModel[63].addShapeBox(0.0F, 1.5F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
    turretModel[63].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[63]).rotateAngleX = -0.40142572F;
    (turretModel[63]).rotateAngleY = -0.2617994F;
    (turretModel[63]).rotateAngleZ = 0.08726646F;
    
    turretModel[64].addShapeBox(0.0F, 3.0F, -1.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
    turretModel[64].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[64]).rotateAngleX = -0.40142572F;
    (turretModel[64]).rotateAngleY = -0.5235988F;
    (turretModel[64]).rotateAngleZ = 0.08726646F;
    
    turretModel[65].addShapeBox(0.2F, 0.0F, -1.25F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
    turretModel[65].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[65]).rotateAngleX = -0.40142572F;
    (turretModel[65]).rotateAngleZ = 0.17453294F;
    
    turretModel[66].addShapeBox(0.2F, 1.5F, -1.25F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
    turretModel[66].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[66]).rotateAngleX = -0.40142572F;
    (turretModel[66]).rotateAngleY = -0.2617994F;
    (turretModel[66]).rotateAngleZ = 0.08726646F;
    
    turretModel[67].addShapeBox(0.2F, 3.0F, -1.25F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
    turretModel[67].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[67]).rotateAngleX = -0.40142572F;
    (turretModel[67]).rotateAngleY = -0.5235988F;
    (turretModel[67]).rotateAngleZ = 0.08726646F;
    
    turretModel[68].addShapeBox(0.2F, 0.0F, -1.25F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
    turretModel[68].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[68]).rotateAngleX = -0.40142572F;
    (turretModel[68]).rotateAngleZ = 0.17453294F;
    
    turretModel[69].addShapeBox(0.2F, 0.0F, -1.25F, 2, 1, 1, 0.0F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
    turretModel[69].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[69]).rotateAngleX = -0.40142572F;
    (turretModel[69]).rotateAngleZ = 0.17453294F;
    
    turretModel[70].addShapeBox(0.2F, 1.5F, -1.25F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
    turretModel[70].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[70]).rotateAngleX = -0.40142572F;
    (turretModel[70]).rotateAngleY = -0.2617994F;
    (turretModel[70]).rotateAngleZ = 0.08726646F;
    
    turretModel[71].addShapeBox(0.2F, 1.5F, -1.25F, 2, 1, 1, 0.0F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
    turretModel[71].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[71]).rotateAngleX = -0.40142572F;
    (turretModel[71]).rotateAngleY = -0.2617994F;
    (turretModel[71]).rotateAngleZ = 0.08726646F;
    
    turretModel[72].addShapeBox(0.2F, 3.0F, -1.25F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
    turretModel[72].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[72]).rotateAngleX = -0.40142572F;
    (turretModel[72]).rotateAngleY = -0.5235988F;
    (turretModel[72]).rotateAngleZ = 0.08726646F;
    
    turretModel[73].addShapeBox(0.2F, 3.0F, -1.25F, 2, 1, 1, 0.0F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
    turretModel[73].setRotationPoint(14.9F, -28.0F, -11.1F);
    (turretModel[73]).rotateAngleX = -0.40142572F;
    (turretModel[73]).rotateAngleY = -0.5235988F;
    (turretModel[73]).rotateAngleZ = 0.08726646F;
    
    turretModel[74].addShapeBox(10.0F, 0.0F, -0.9F, 2, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
    turretModel[74].setRotationPoint(5.0F, -29.0F, 11.1F);
    (turretModel[74]).rotateAngleX = 0.40142572F;
    (turretModel[74]).rotateAngleZ = -0.08726646F;
    
    turretModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
    turretModel[75].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[75]).rotateAngleX = 0.40142572F;
    (turretModel[75]).rotateAngleZ = 0.17453294F;
    
    turretModel[76].addShapeBox(0.0F, 1.5F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
    turretModel[76].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[76]).rotateAngleX = 0.40142572F;
    (turretModel[76]).rotateAngleY = 0.2617994F;
    (turretModel[76]).rotateAngleZ = 0.08726646F;
    
    turretModel[77].addShapeBox(0.0F, 3.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, -0.8F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F);
    turretModel[77].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[77]).rotateAngleX = 0.40142572F;
    (turretModel[77]).rotateAngleY = 0.5235988F;
    (turretModel[77]).rotateAngleZ = 0.08726646F;
    
    turretModel[78].addShapeBox(0.2F, 0.0F, 0.25F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
    turretModel[78].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[78]).rotateAngleX = 0.40142572F;
    (turretModel[78]).rotateAngleZ = 0.17453294F;
    
    turretModel[79].addShapeBox(0.2F, 0.0F, 0.25F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
    turretModel[79].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[79]).rotateAngleX = 0.40142572F;
    (turretModel[79]).rotateAngleZ = 0.17453294F;
    
    turretModel[80].addShapeBox(0.2F, 0.0F, 0.25F, 2, 1, 1, 0.0F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
    turretModel[80].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[80]).rotateAngleX = 0.40142572F;
    (turretModel[80]).rotateAngleZ = 0.17453294F;
    
    turretModel[81].addShapeBox(0.2F, 1.5F, 0.25F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
    turretModel[81].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[81]).rotateAngleX = 0.40142572F;
    (turretModel[81]).rotateAngleY = 0.2617994F;
    (turretModel[81]).rotateAngleZ = 0.08726646F;
    
    turretModel[82].addShapeBox(0.2F, 1.5F, 0.25F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
    turretModel[82].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[82]).rotateAngleX = 0.40142572F;
    (turretModel[82]).rotateAngleY = 0.2617994F;
    (turretModel[82]).rotateAngleZ = 0.08726646F;
    
    turretModel[83].addShapeBox(0.2F, 1.5F, 0.25F, 2, 1, 1, 0.0F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
    turretModel[83].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[83]).rotateAngleX = 0.40142572F;
    (turretModel[83]).rotateAngleY = 0.2617994F;
    (turretModel[83]).rotateAngleZ = 0.08726646F;
    
    turretModel[84].addShapeBox(0.2F, 3.0F, 0.25F, 2, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
    turretModel[84].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[84]).rotateAngleX = 0.40142572F;
    (turretModel[84]).rotateAngleY = 0.5235988F;
    (turretModel[84]).rotateAngleZ = 0.08726646F;
    
    turretModel[85].addShapeBox(0.2F, 3.0F, 0.25F, 2, 1, 1, 0.0F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F);
    turretModel[85].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[85]).rotateAngleX = 0.40142572F;
    (turretModel[85]).rotateAngleY = 0.5235988F;
    (turretModel[85]).rotateAngleZ = 0.08726646F;
    
    turretModel[86].addShapeBox(0.2F, 3.0F, 0.25F, 2, 1, 1, 0.0F, 0.0F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.5F, -0.75F, 0.25F, 0.0F, -0.75F, 0.25F, 0.0F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.5F, 0.25F, -0.25F, 0.0F, 0.25F, -0.25F);
    turretModel[86].setRotationPoint(14.9F, -28.0F, 11.1F);
    (turretModel[86]).rotateAngleX = 0.40142572F;
    (turretModel[86]).rotateAngleY = 0.5235988F;
    (turretModel[86]).rotateAngleZ = 0.08726646F;

    
    barrelModel = new ModelRendererTurbo[20];
    barrelModel[0] = new ModelRendererTurbo(this, 9, 436, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 70, 440, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 110, 440, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 140, 440, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 220, 440, textureX, textureY);
    barrelModel[5] = new ModelRendererTurbo(this, 0, 460, textureX, textureY);
    barrelModel[6] = new ModelRendererTurbo(this, 60, 460, textureX, textureY);
    barrelModel[7] = new ModelRendererTurbo(this, 120, 460, textureX, textureY);
    barrelModel[8] = new ModelRendererTurbo(this, 180, 440, textureX, textureY);
    barrelModel[9] = new ModelRendererTurbo(this, 200, 440, textureX, textureY);
    barrelModel[10] = new ModelRendererTurbo(this, 9, 432, textureX, textureY);
    barrelModel[11] = new ModelRendererTurbo(this, 0, 436, textureX, textureY);
    barrelModel[12] = new ModelRendererTurbo(this, 0, 432, textureX, textureY);
    barrelModel[13] = new ModelRendererTurbo(this, 50, 438, textureX, textureY);
    barrelModel[14] = new ModelRendererTurbo(this, 50, 436, textureX, textureY);
    barrelModel[15] = new ModelRendererTurbo(this, 50, 434, textureX, textureY);
    barrelModel[16] = new ModelRendererTurbo(this, 50, 432, textureX, textureY);
    barrelModel[17] = new ModelRendererTurbo(this, 220, 444, textureX, textureY);
    barrelModel[18] = new ModelRendererTurbo(this, 141, 450, textureX, textureY);
    barrelModel[19] = new ModelRendererTurbo(this, 152, 450, textureX, textureY);
    
    barrelModel[0].addShapeBox(14.0F, -1.0F, -1.0F, 3, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, 0.0F);
    barrelModel[0].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[1].addBox(0.0F, -1.5F, -1.5F, 13, 3, 3, 0.0F);
    barrelModel[1].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[2].addShapeBox(0.0F, -2.0F, 0.0F, 9, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[2].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[3].addShapeBox(0.0F, -2.0F, -4.0F, 9, 4, 4, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[3].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[4].addShapeBox(0.0F, -1.5F, -6.5F, 8, 1, 1, 0.0F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F, 0.0F, -0.15F, -0.15F);
    barrelModel[4].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[5].addBox(4.0F, -1.5F, -10.5F, 1, 3, 21, 0.0F);
    barrelModel[5].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[6].addShapeBox(2.0F, -3.5F, -10.5F, 3, 2, 21, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    barrelModel[6].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[7].addShapeBox(2.0F, 1.5F, -10.5F, 3, 2, 21, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[7].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[8].addBox(4.5F, -2.0F, 6.5F, 1, 4, 2, 0.0F);
    barrelModel[8].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[9].addShapeBox(13.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F);
    barrelModel[9].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[10].addShapeBox(14.0F, 0.0F, -1.0F, 3, 1, 2, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F);
    barrelModel[10].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[11].addShapeBox(14.0F, -1.0F, -1.0F, 3, 2, 1, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.6F);
    barrelModel[11].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[12].addShapeBox(14.0F, -1.0F, 0.0F, 3, 2, 1, 0.0F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.6F, 0.0F, -0.4F, -0.2F, 0.0F, -0.4F, 0.0F);
    barrelModel[12].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[13].addShapeBox(0.0F, -1.5F, -4.0F, 9, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[13].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[14].addShapeBox(0.0F, 0.5F, -4.0F, 9, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[14].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[15].addShapeBox(0.0F, -1.5F, 3.0F, 9, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[15].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[16].addShapeBox(0.0F, 0.5F, 3.0F, 9, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[16].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[17].addShapeBox(0.0F, -1.5F, -6.5F, 7, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    barrelModel[17].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[18].addShapeBox(8.0F, -2.0F, -4.0F, 1, 4, 4, 0.0F, -0.4F, -0.4F, 0.1F, 0.0F, -0.4F, 0.1F, 0.0F, 0.1F, 0.0F, -0.4F, 0.1F, 0.0F, -0.4F, -0.4F, 0.1F, 0.0F, -0.4F, 0.1F, 0.0F, 0.1F, 0.0F, -0.4F, 0.1F, 0.0F);
    barrelModel[18].setRotationPoint(17.0F, -23.5F, 0.0F);
    
    barrelModel[19].addShapeBox(8.0F, -2.0F, 0.0F, 1, 4, 4, 0.0F, -0.4F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F);
    barrelModel[19].setRotationPoint(17.0F, -23.5F, 0.0F);

    
    leftTrackWheelModels = new ModelRendererTurbo[12];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 30, 320, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 30, 320, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 120, 320, textureX, textureY);
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 90, 320, textureX, textureY);
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 90, 320, textureX, textureY);
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 90, 320, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(6.0F, -6.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 1.0F, 12, 12, 40, 1, 0, new float[] { 0.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[0].setRotationPoint(36.0F, -5.0F, 21.5F);
    
    leftTrackWheelModels[1].addShape3D(6.0F, -6.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 1.0F, 12, 12, 40, 1, 0, new float[] { 0.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[1].setRotationPoint(36.0F, -5.0F, 18.5F);
    
    leftTrackWheelModels[2].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[2].setRotationPoint(25.0F, 3.0F, 18.5F);
    
    leftTrackWheelModels[3].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[3].setRotationPoint(16.0F, 3.0F, 18.5F);
    
    leftTrackWheelModels[4].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[4].setRotationPoint(7.0F, 3.0F, 18.5F);
    
    leftTrackWheelModels[5].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[5].setRotationPoint(-2.0F, 3.0F, 18.5F);
    
    leftTrackWheelModels[6].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[6].setRotationPoint(-11.0F, 3.0F, 18.5F);
    
    leftTrackWheelModels[7].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[7].setRotationPoint(-20.0F, 3.0F, 18.5F);
    
    leftTrackWheelModels[8].addShape3D(6.0F, -6.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 4.0F, 12, 12, 40, 4, 0, new float[] { 0.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[8].setRotationPoint(-32.0F, -5.0F, 18.5F);
    
    leftTrackWheelModels[9].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
    leftTrackWheelModels[9].setRotationPoint(19.5F, -9.5F, 18.5F);
    
    leftTrackWheelModels[10].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
    leftTrackWheelModels[10].setRotationPoint(2.5F, -9.5F, 18.5F);
    
    leftTrackWheelModels[11].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
    leftTrackWheelModels[11].setRotationPoint(-15.5F, -9.5F, 18.5F);

    
    rightTrackWheelModels = new ModelRendererTurbo[12];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 30, 320, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 30, 320, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 60, 320, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 120, 320, textureX, textureY);
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 90, 320, textureX, textureY);
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 90, 320, textureX, textureY);
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 90, 320, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 1.0F, 12, 12, 40, 1, 0, new float[] { 0.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[0].setRotationPoint(36.0F, -5.0F, -21.5F);
    
    rightTrackWheelModels[1].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 1.0F, 12, 12, 40, 1, 0, new float[] { 0.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[1].setRotationPoint(36.0F, -5.0F, -18.5F);
    
    rightTrackWheelModels[2].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[2].setRotationPoint(25.0F, 3.0F, -18.5F);
    
    rightTrackWheelModels[3].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[3].setRotationPoint(16.0F, 3.0F, -18.5F);
    
    rightTrackWheelModels[4].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[4].setRotationPoint(7.0F, 3.0F, -18.5F);
    
    rightTrackWheelModels[5].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[5].setRotationPoint(-2.0F, 3.0F, -18.5F);
    
    rightTrackWheelModels[6].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[6].setRotationPoint(-11.0F, 3.0F, -18.5F);
    
    rightTrackWheelModels[7].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[7].setRotationPoint(-20.0F, 3.0F, -18.5F);
    
    rightTrackWheelModels[8].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 4.0F, 12, 12, 40, 4, 0, new float[] { 0.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[8].setRotationPoint(-32.0F, -5.0F, -18.5F);
    
    rightTrackWheelModels[9].addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
    rightTrackWheelModels[9].setRotationPoint(19.5F, -9.5F, -18.5F);
    
    rightTrackWheelModels[10].addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
    rightTrackWheelModels[10].setRotationPoint(2.5F, -9.5F, -18.5F);
    
    rightTrackWheelModels[11].addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
    rightTrackWheelModels[11].setRotationPoint(-15.5F, -9.5F, -18.5F);

    
    leftTrackModel = new ModelRendererTurbo[8];
    leftTrackModel[0] = new ModelRendererTurbo(this, 310, 267, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 200, 267, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 250, 267, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 280, 267, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 0, 267, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 150, 267, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 175, 267, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 123, 267, textureX, textureY);
    
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 74, 2, 7, 0.0F);
    leftTrackModel[0].setRotationPoint(-35.0F, -12.0F, 17.0F);
    
    leftTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[1].setRotationPoint(39.0F, -12.0F, 17.0F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2].addBox(-2.0F, 0.0F, 0.0F, 2, 6, 7, 0.0F);
    leftTrackModel[2].setRotationPoint(43.0F, -8.0F, 17.0F);
    
    leftTrackModel[3].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 19, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F);
    leftTrackModel[3].setRotationPoint(43.0F, -2.0F, 17.0F);
    (leftTrackModel[3]).rotateAngleZ = -1.012291F;
    
    leftTrackModel[4].addBox(-49.0F, 0.0F, 0.0F, 50, 2, 7, 0.0F);
    leftTrackModel[4].setRotationPoint(26.0F, 6.0F, 17.0F);
    
    leftTrackModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 2, 19, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F);
    leftTrackModel[5].setRotationPoint(-39.0F, -2.0F, 17.0F);
    (leftTrackModel[5]).rotateAngleZ = 1.012291F;
    
    leftTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 2, 6, 7, 0.0F);
    leftTrackModel[6].setRotationPoint(-39.0F, -8.0F, 17.0F);
    
    leftTrackModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F);
    leftTrackModel[7].setRotationPoint(-35.0F, -12.0F, 17.0F);
    (leftTrackModel[7]).rotateAngleZ = -0.7853982F;

    
    rightTrackModel = new ModelRendererTurbo[8];
    rightTrackModel[0] = new ModelRendererTurbo(this, 310, 267, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 200, 267, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 250, 267, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 280, 267, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 0, 267, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 150, 267, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 175, 267, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 123, 267, textureX, textureY);
    
    rightTrackModel[0].addBox(0.0F, 0.0F, -7.0F, 74, 2, 7, 0.0F);
    rightTrackModel[0].setRotationPoint(-35.0F, -12.0F, -17.0F);
    
    rightTrackModel[1].addShapeBox(0.0F, 0.0F, -7.0F, 5, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[1].setRotationPoint(39.0F, -12.0F, -17.0F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2].addBox(-2.0F, 0.0F, -7.0F, 2, 6, 7, 0.0F);
    rightTrackModel[2].setRotationPoint(43.0F, -8.0F, -17.0F);
    
    rightTrackModel[3].addShapeBox(-2.0F, 0.0F, -7.0F, 2, 19, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F);
    rightTrackModel[3].setRotationPoint(43.0F, -2.0F, -17.0F);
    (rightTrackModel[3]).rotateAngleZ = -1.012291F;
    
    rightTrackModel[4].addBox(-49.0F, 0.0F, -7.0F, 50, 2, 7, 0.0F);
    rightTrackModel[4].setRotationPoint(26.0F, 6.0F, -17.0F);
    
    rightTrackModel[5].addShapeBox(0.0F, 0.0F, -7.0F, 2, 19, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F, 0.0F, -0.12F, 0.0F);
    rightTrackModel[5].setRotationPoint(-39.0F, -2.0F, -17.0F);
    (rightTrackModel[5]).rotateAngleZ = 1.012291F;
    
    rightTrackModel[6].addBox(0.0F, 0.0F, -7.0F, 2, 6, 7, 0.0F);
    rightTrackModel[6].setRotationPoint(-39.0F, -8.0F, -17.0F);
    
    rightTrackModel[7].addShapeBox(0.0F, 0.0F, -7.0F, 2, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F, 0.0F, 0.65F, 0.0F);
    rightTrackModel[7].setRotationPoint(-35.0F, -12.0F, -17.0F);
    (rightTrackModel[7]).rotateAngleZ = -0.7853982F;
    
    translateAll(-5.0F, 2.0F, 0.0F);
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
