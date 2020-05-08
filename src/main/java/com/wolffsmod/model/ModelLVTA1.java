package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelLVTA1
  extends ModelVehicle {
  int textureX = 512;
  int textureY = 512;

  
  public ModelLVTA1() {
    bodyModel = new ModelRendererTurbo[167];
    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 0, 65, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 150, 65, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 0, 130, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 300, 0, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 250, 130, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 250, 160, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 140, 185, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 0, 185, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 140, 205, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 200, 185, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 0, 210, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 75, 210, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 180, 210, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 0, 260, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 50, 260, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 32, 260, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 0, 275, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 20, 275, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 0, 330, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 30, 330, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 140, 185, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 0, 185, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 140, 205, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 200, 185, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 0, 210, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 20, 210, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 45, 210, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 0, 260, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 50, 260, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 50, 260, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 0, 275, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 20, 275, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 20, 275, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 0, 330, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 30, 330, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 185, 350, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 185, 350, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 0, 365, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 0, 365, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[94] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[95] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[96] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[97] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[98] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[99] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[100] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[101] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[102] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[103] = new ModelRendererTurbo(this, 80, 365, textureX, textureY);
    bodyModel[104] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
    bodyModel[105] = new ModelRendererTurbo(this, 0, 380, textureX, textureY);
    bodyModel[106] = new ModelRendererTurbo(this, 15, 380, textureX, textureY);
    bodyModel[107] = new ModelRendererTurbo(this, 15, 380, textureX, textureY);
    bodyModel[108] = new ModelRendererTurbo(this, 15, 390, textureX, textureY);
    bodyModel[109] = new ModelRendererTurbo(this, 15, 390, textureX, textureY);
    bodyModel[110] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
    bodyModel[111] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
    bodyModel[112] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
    bodyModel[113] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
    bodyModel[114] = new ModelRendererTurbo(this, 124, 380, textureX, textureY);
    bodyModel[115] = new ModelRendererTurbo(this, 240, 380, textureX, textureY);
    bodyModel[116] = new ModelRendererTurbo(this, 0, 445, textureX, textureY);
    bodyModel[117] = new ModelRendererTurbo(this, 60, 330, textureX, textureY);
    bodyModel[118] = new ModelRendererTurbo(this, 60, 330, textureX, textureY);
    bodyModel[119] = new ModelRendererTurbo(this, 60, 330, textureX, textureY);
    bodyModel[120] = new ModelRendererTurbo(this, 60, 330, textureX, textureY);
    bodyModel[121] = new ModelRendererTurbo(this, 60, 330, textureX, textureY);
    bodyModel[122] = new ModelRendererTurbo(this, 60, 330, textureX, textureY);
    bodyModel[123] = new ModelRendererTurbo(this, 84, 330, textureX, textureY);
    bodyModel[124] = new ModelRendererTurbo(this, 85, 330, textureX, textureY);
    bodyModel[125] = new ModelRendererTurbo(this, 85, 330, textureX, textureY);
    bodyModel[126] = new ModelRendererTurbo(this, 85, 330, textureX, textureY);
    bodyModel[127] = new ModelRendererTurbo(this, 85, 330, textureX, textureY);
    bodyModel[128] = new ModelRendererTurbo(this, 85, 330, textureX, textureY);
    bodyModel[129] = new ModelRendererTurbo(this, 99, 330, textureX, textureY);
    bodyModel[130] = new ModelRendererTurbo(this, 99, 330, textureX, textureY);
    bodyModel[131] = new ModelRendererTurbo(this, 135, 330, textureX, textureY);
    bodyModel[132] = new ModelRendererTurbo(this, 135, 330, textureX, textureY);
    bodyModel[133] = new ModelRendererTurbo(this, 158, 330, textureX, textureY);
    bodyModel[134] = new ModelRendererTurbo(this, 158, 330, textureX, textureY);
    bodyModel[135] = new ModelRendererTurbo(this, 135, 330, textureX, textureY);
    bodyModel[136] = new ModelRendererTurbo(this, 135, 330, textureX, textureY);
    bodyModel[137] = new ModelRendererTurbo(this, 158, 330, textureX, textureY);
    bodyModel[138] = new ModelRendererTurbo(this, 158, 330, textureX, textureY);
    bodyModel[139] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[140] = new ModelRendererTurbo(this, 105, 365, textureX, textureY);
    bodyModel[141] = new ModelRendererTurbo(this, 135, 365, textureX, textureY);
    bodyModel[142] = new ModelRendererTurbo(this, 170, 365, textureX, textureY);
    bodyModel[143] = new ModelRendererTurbo(this, 170, 365, textureX, textureY);
    bodyModel[144] = new ModelRendererTurbo(this, 180, 365, textureX, textureY);
    bodyModel[145] = new ModelRendererTurbo(this, 180, 365, textureX, textureY);
    bodyModel[146] = new ModelRendererTurbo(this, 135, 365, textureX, textureY);
    bodyModel[147] = new ModelRendererTurbo(this, 170, 365, textureX, textureY);
    bodyModel[148] = new ModelRendererTurbo(this, 170, 365, textureX, textureY);
    bodyModel[149] = new ModelRendererTurbo(this, 190, 365, textureX, textureY);
    bodyModel[150] = new ModelRendererTurbo(this, 215, 365, textureX, textureY);
    bodyModel[151] = new ModelRendererTurbo(this, 225, 365, textureX, textureY);
    bodyModel[152] = new ModelRendererTurbo(this, 239, 365, textureX, textureY);
    bodyModel[153] = new ModelRendererTurbo(this, 239, 365, textureX, textureY);
    bodyModel[154] = new ModelRendererTurbo(this, 260, 365, textureX, textureY);
    bodyModel[155] = new ModelRendererTurbo(this, 260, 365, textureX, textureY);
    bodyModel[156] = new ModelRendererTurbo(this, 280, 365, textureX, textureY);
    bodyModel[157] = new ModelRendererTurbo(this, 310, 365, textureX, textureY);
    bodyModel[158] = new ModelRendererTurbo(this, 245, 350, textureX, textureY);
    bodyModel[159] = new ModelRendererTurbo(this, 245, 350, textureX, textureY);
    bodyModel[160] = new ModelRendererTurbo(this, 285, 350, textureX, textureY);
    bodyModel[161] = new ModelRendererTurbo(this, 285, 350, textureX, textureY);
    bodyModel[162] = new ModelRendererTurbo(this, 285, 350, textureX, textureY);
    bodyModel[163] = new ModelRendererTurbo(this, 285, 350, textureX, textureY);
    bodyModel[164] = new ModelRendererTurbo(this, 315, 365, textureX, textureY);
    bodyModel[165] = new ModelRendererTurbo(this, 395, 365, textureX, textureY);
    bodyModel[166] = new ModelRendererTurbo(this, 395, 400, textureX, textureY);
    
    bodyModel[0].addTrapezoid(0.0F, 0.0F, -19.0F, 97, 13, 38, 0.0F, 0.0F, 4);
    bodyModel[0].setRotationPoint(-58.0F, -24.0F, 0.0F);
    
    bodyModel[1].addShapeBox(0.0F, 0.0F, -19.0F, 30, 6, 38, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -4.5F, 0.0F, -1.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(39.0F, -24.0F, 0.0F);
    
    bodyModel[2].addShapeBox(0.0F, 0.0F, -19.0F, 30, 20, 38, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, -10.0F, 0.0F, -9.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(39.0F, -18.0F, 0.0F);
    
    bodyModel[3].addBox(0.0F, 0.0F, -19.0F, 74, 13, 38, 0.0F);
    bodyModel[3].setRotationPoint(-35.0F, -11.0F, 0.0F);
    
    bodyModel[4].addShapeBox(0.0F, 0.0F, -19.0F, 23, 13, 38, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.0F, -4.0F, 0.0F);
    bodyModel[4].setRotationPoint(-58.0F, -11.0F, 0.0F);
    
    bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 87, 9, 7, 0.0F);
    bodyModel[5].setRotationPoint(-37.0F, -15.0F, 19.0F);
    
    bodyModel[6].addBox(0.0F, 0.0F, -7.0F, 87, 9, 7, 0.0F);
    bodyModel[6].setRotationPoint(-37.0F, -15.0F, -19.0F);
    
    bodyModel[7].addShapeBox(1.0F, -1.0F, 0.0F, 18, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.9F, 0.0F, 0.0F, -7.9F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[7].setRotationPoint(31.0F, -5.0F, 19.0F);
    
    bodyModel[8].addBox(0.0F, 1.0F, 0.0F, 55, 8, 7, 0.0F);
    bodyModel[8].setRotationPoint(-23.0F, -7.0F, 19.0F);
    
    bodyModel[9].addShapeBox(0.0F, -1.0F, 0.0F, 14, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
    bodyModel[9].setRotationPoint(-37.0F, -5.0F, 19.0F);
    
    bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 15, 14, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.9F, 0.0F);
    bodyModel[10].setRotationPoint(-52.0F, -15.0F, 19.0F);
    
    bodyModel[11].addBox(14.0F, 0.0F, 1.5F, 5, 5, 4, 0.0F);
    bodyModel[11].setRotationPoint(32.0F, 1.0F, 19.0F);
    (bodyModel[11]).rotateAngleZ = 0.41887903F;
    
    bodyModel[12].addBox(8.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[12].setRotationPoint(32.0F, 2.0F, 19.0F);
    (bodyModel[12]).rotateAngleZ = 0.41887903F;
    
    bodyModel[13].addBox(-4.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[13].setRotationPoint(43.0F, -2.0F, 19.0F);
    (bodyModel[13]).rotateAngleZ = 1.2042772F;
    
    bodyModel[14].addBox(0.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[14].setRotationPoint(32.0F, 2.0F, 19.0F);
    (bodyModel[14]).rotateAngleZ = 0.41887903F;
    
    bodyModel[15].addBox(-4.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[15].setRotationPoint(36.0F, 1.0F, 19.0F);
    (bodyModel[15]).rotateAngleZ = 1.2042772F;
    
    bodyModel[16].addBox(0.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[16].setRotationPoint(25.0F, 2.0F, 19.0F);
    
    bodyModel[17].addBox(0.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[17].setRotationPoint(17.0F, 2.0F, 19.0F);
    
    bodyModel[18].addBox(0.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[18].setRotationPoint(9.0F, 2.0F, 19.0F);
    
    bodyModel[19].addBox(0.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[19].setRotationPoint(1.0F, 2.0F, 19.0F);
    
    bodyModel[20].addBox(0.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[20].setRotationPoint(-7.0F, 2.0F, 19.0F);
    
    bodyModel[21].addBox(0.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[21].setRotationPoint(-15.0F, 2.0F, 19.0F);
    
    bodyModel[22].addBox(0.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[22].setRotationPoint(-23.0F, 2.0F, 19.0F);
    
    bodyModel[23].addBox(-5.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[23].setRotationPoint(30.0F, 2.0F, 19.0F);
    (bodyModel[23]).rotateAngleZ = 0.7853982F;
    
    bodyModel[24].addBox(-5.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[24].setRotationPoint(22.0F, 2.0F, 19.0F);
    (bodyModel[24]).rotateAngleZ = 0.7853982F;
    
    bodyModel[25].addBox(-5.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[25].setRotationPoint(14.0F, 2.0F, 19.0F);
    (bodyModel[25]).rotateAngleZ = 0.7853982F;
    
    bodyModel[26].addBox(-5.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[26].setRotationPoint(6.0F, 2.0F, 19.0F);
    (bodyModel[26]).rotateAngleZ = 0.7853982F;
    
    bodyModel[27].addBox(-5.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[27].setRotationPoint(-2.0F, 2.0F, 19.0F);
    (bodyModel[27]).rotateAngleZ = 0.7853982F;
    
    bodyModel[28].addBox(-5.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[28].setRotationPoint(-10.0F, 2.0F, 19.0F);
    (bodyModel[28]).rotateAngleZ = 0.7853982F;
    
    bodyModel[29].addBox(-5.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[29].setRotationPoint(-18.0F, 2.0F, 19.0F);
    (bodyModel[29]).rotateAngleZ = 0.7853982F;
    
    bodyModel[30].addBox(8.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[30].setRotationPoint(-37.0F, -1.0F, 19.0F);
    (bodyModel[30]).rotateAngleZ = -0.20943952F;
    
    bodyModel[31].addBox(0.0F, 0.0F, 1.0F, 6, 2, 5, 0.0F);
    bodyModel[31].setRotationPoint(-37.0F, -1.0F, 19.0F);
    (bodyModel[31]).rotateAngleZ = -0.20943952F;
    
    bodyModel[32].addBox(-4.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[32].setRotationPoint(-25.0F, 2.0F, 19.0F);
    (bodyModel[32]).rotateAngleZ = 0.57595867F;
    
    bodyModel[33].addBox(-5.0F, 0.0F, 1.5F, 4, 1, 4, 0.0F);
    bodyModel[33].setRotationPoint(-31.0F, 0.0F, 19.0F);
    (bodyModel[33]).rotateAngleZ = 0.57595867F;
    
    bodyModel[34].addBox(-1.0F, -1.0F, -23.0F, 2, 2, 46, 0.0F);
    bodyModel[34].setRotationPoint(57.0F, -12.0F, 0.0F);
    
    bodyModel[35].addBox(-1.0F, -1.0F, -26.0F, 2, 2, 52, 0.0F);
    bodyModel[35].setRotationPoint(-51.0F, -16.0F, 0.0F);
    
    bodyModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 7, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[36].setRotationPoint(-38.0F, -18.0F, 19.0F);
    
    bodyModel[37].addBox(0.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F);
    bodyModel[37].setRotationPoint(-26.0F, -19.0F, 20.0F);
    
    bodyModel[38].addBox(0.0F, 0.0F, 0.0F, 1, 3, 5, 0.0F);
    bodyModel[38].setRotationPoint(20.0F, -18.0F, 20.0F);
    
    bodyModel[39].addBox(0.0F, 0.0F, 0.0F, 6, 3, 1, 0.0F);
    bodyModel[39].setRotationPoint(-50.0F, -18.0F, 25.0F);
    
    bodyModel[40].addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
    bodyModel[40].setRotationPoint(37.0F, -17.0F, 20.0F);
    
    bodyModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 3, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[41].setRotationPoint(-41.0F, -18.0F, 19.0F);
    
    bodyModel[42].addBox(0.0F, 0.0F, 0.0F, 4, 3, 6, 0.0F);
    bodyModel[42].setRotationPoint(-45.0F, -18.0F, 19.0F);
    
    bodyModel[43].addShapeBox(1.0F, -1.0F, -7.0F, 18, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.9F, 0.0F, 0.0F, -7.9F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[43].setRotationPoint(31.0F, -5.0F, -19.0F);
    
    bodyModel[44].addBox(0.0F, 1.0F, -7.0F, 55, 8, 7, 0.0F);
    bodyModel[44].setRotationPoint(-23.0F, -7.0F, -19.0F);
    
    bodyModel[45].addShapeBox(0.0F, -1.0F, -7.0F, 14, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
    bodyModel[45].setRotationPoint(-37.0F, -5.0F, -19.0F);
    
    bodyModel[46].addShapeBox(0.0F, 0.0F, -7.0F, 15, 14, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -13.9F, 0.0F);
    bodyModel[46].setRotationPoint(-52.0F, -15.0F, -19.0F);
    
    bodyModel[47].addBox(14.0F, 0.0F, -5.5F, 5, 5, 4, 0.0F);
    bodyModel[47].setRotationPoint(32.0F, 1.0F, -19.0F);
    (bodyModel[47]).rotateAngleZ = 0.41887903F;
    
    bodyModel[48].addBox(8.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[48].setRotationPoint(32.0F, 2.0F, -19.0F);
    (bodyModel[48]).rotateAngleZ = 0.41887903F;
    
    bodyModel[49].addBox(-4.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[49].setRotationPoint(43.0F, -2.0F, -19.0F);
    (bodyModel[49]).rotateAngleZ = 1.2042772F;
    
    bodyModel[50].addBox(0.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[50].setRotationPoint(32.0F, 2.0F, -19.0F);
    (bodyModel[50]).rotateAngleZ = 0.41887903F;
    
    bodyModel[51].addBox(-4.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[51].setRotationPoint(36.0F, 1.0F, -19.0F);
    (bodyModel[51]).rotateAngleZ = 1.2042772F;
    
    bodyModel[52].addBox(0.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[52].setRotationPoint(25.0F, 2.0F, -19.0F);
    
    bodyModel[53].addBox(0.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[53].setRotationPoint(17.0F, 2.0F, -19.0F);
    
    bodyModel[54].addBox(0.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[54].setRotationPoint(9.0F, 2.0F, -19.0F);
    
    bodyModel[55].addBox(0.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[55].setRotationPoint(1.0F, 2.0F, -19.0F);
    
    bodyModel[56].addBox(0.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[56].setRotationPoint(-7.0F, 2.0F, -19.0F);
    
    bodyModel[57].addBox(0.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[57].setRotationPoint(-15.0F, 2.0F, -19.0F);
    
    bodyModel[58].addBox(0.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[58].setRotationPoint(-23.0F, 2.0F, -19.0F);
    
    bodyModel[59].addBox(-5.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[59].setRotationPoint(30.0F, 2.0F, -19.0F);
    (bodyModel[59]).rotateAngleZ = 0.7853982F;
    
    bodyModel[60].addBox(-5.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[60].setRotationPoint(22.0F, 2.0F, -19.0F);
    (bodyModel[60]).rotateAngleZ = 0.7853982F;
    
    bodyModel[61].addBox(-5.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[61].setRotationPoint(14.0F, 2.0F, -19.0F);
    (bodyModel[61]).rotateAngleZ = 0.7853982F;
    
    bodyModel[62].addBox(-5.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[62].setRotationPoint(6.0F, 2.0F, -19.0F);
    (bodyModel[62]).rotateAngleZ = 0.7853982F;
    
    bodyModel[63].addBox(-5.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[63].setRotationPoint(-2.0F, 2.0F, -19.0F);
    (bodyModel[63]).rotateAngleZ = 0.7853982F;
    
    bodyModel[64].addBox(-5.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[64].setRotationPoint(-10.0F, 2.0F, -19.0F);
    (bodyModel[64]).rotateAngleZ = 0.7853982F;
    
    bodyModel[65].addBox(-5.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[65].setRotationPoint(-18.0F, 2.0F, -19.0F);
    (bodyModel[65]).rotateAngleZ = 0.7853982F;
    
    bodyModel[66].addBox(8.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[66].setRotationPoint(-37.0F, -1.0F, -19.0F);
    (bodyModel[66]).rotateAngleZ = -0.20943952F;
    
    bodyModel[67].addBox(0.0F, 0.0F, -6.0F, 6, 2, 5, 0.0F);
    bodyModel[67].setRotationPoint(-37.0F, -1.0F, -19.0F);
    (bodyModel[67]).rotateAngleZ = -0.20943952F;
    
    bodyModel[68].addBox(-4.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[68].setRotationPoint(-25.0F, 2.0F, -19.0F);
    (bodyModel[68]).rotateAngleZ = 0.57595867F;
    
    bodyModel[69].addBox(-5.0F, 0.0F, -5.5F, 4, 1, 4, 0.0F);
    bodyModel[69].setRotationPoint(-31.0F, 0.0F, -19.0F);
    (bodyModel[69]).rotateAngleZ = 0.57595867F;
    
    bodyModel[70].addShapeBox(0.0F, 0.0F, -6.0F, 7, 3, 6, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[70].setRotationPoint(-38.0F, -18.0F, -19.0F);
    
    bodyModel[71].addBox(0.0F, 0.0F, -5.0F, 1, 4, 5, 0.0F);
    bodyModel[71].setRotationPoint(-26.0F, -19.0F, -20.0F);
    
    bodyModel[72].addBox(0.0F, 0.0F, -5.0F, 1, 3, 5, 0.0F);
    bodyModel[72].setRotationPoint(20.0F, -18.0F, -20.0F);
    
    bodyModel[73].addBox(0.0F, 0.0F, -1.0F, 6, 3, 1, 0.0F);
    bodyModel[73].setRotationPoint(-50.0F, -18.0F, -25.0F);
    
    bodyModel[74].addBox(0.0F, 0.0F, 0.0F, 1, 2, 5, 0.0F);
    bodyModel[74].setRotationPoint(37.0F, -17.0F, 20.0F);
    
    bodyModel[75].addBox(0.0F, 0.0F, -5.0F, 1, 2, 5, 0.0F);
    bodyModel[75].setRotationPoint(37.0F, -17.0F, -20.0F);
    
    bodyModel[76].addShapeBox(0.0F, 0.0F, -6.0F, 3, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[76].setRotationPoint(-41.0F, -18.0F, -19.0F);
    
    bodyModel[77].addBox(0.0F, 0.0F, -6.0F, 4, 3, 6, 0.0F);
    bodyModel[77].setRotationPoint(-45.0F, -18.0F, -19.0F);
    
    bodyModel[78].addShapeBox(0.0F, 0.0F, 0.0F, 82, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
    bodyModel[78].setRotationPoint(-43.0F, -23.0F, 19.0F);
    
    bodyModel[79].addShapeBox(0.0F, 0.0F, -7.0F, 82, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
    bodyModel[79].setRotationPoint(-43.0F, -23.0F, -19.0F);
    
    bodyModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 19, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[80].setRotationPoint(-58.0F, -24.0F, 19.0F);
    
    bodyModel[81].addShapeBox(0.0F, 0.0F, -7.0F, 19, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[81].setRotationPoint(-58.0F, -24.0F, -19.0F);
    
    bodyModel[82].addShapeBox(0.0F, 0.0F, 0.0F, 30, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[82].setRotationPoint(39.0F, -23.0F, 19.0F);
    (bodyModel[82]).rotateAngleZ = -0.15707964F;
    
    bodyModel[83].addShapeBox(0.0F, 0.0F, -7.0F, 30, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[83].setRotationPoint(39.0F, -23.0F, -19.0F);
    (bodyModel[83]).rotateAngleZ = -0.15707964F;
    
    bodyModel[84].addShapeBox(30.5F, -1.0F, -26.0F, 1, 1, 53, 0.0F, 0.4F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.4F, 0.3F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F);
    bodyModel[84].setRotationPoint(38.0F, -23.0F, 0.0F);
    (bodyModel[84]).rotateAngleZ = -0.15707964F;
    
    bodyModel[85].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[85].setRotationPoint(38.0F, -24.0F, 19.0F);
    
    bodyModel[86].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[86].setRotationPoint(38.0F, -24.0F, -19.0F);
    
    bodyModel[87].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[87].setRotationPoint(25.0F, -24.0F, 19.0F);
    
    bodyModel[88].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[88].setRotationPoint(25.0F, -24.0F, -19.0F);
    
    bodyModel[89].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[89].setRotationPoint(12.0F, -24.0F, 19.0F);
    
    bodyModel[90].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[90].setRotationPoint(12.0F, -24.0F, -19.0F);
    
    bodyModel[91].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[91].setRotationPoint(-1.0F, -24.0F, 19.0F);
    
    bodyModel[92].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[92].setRotationPoint(-1.0F, -24.0F, -19.0F);
    
    bodyModel[93].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[93].setRotationPoint(-14.0F, -24.0F, 19.0F);
    
    bodyModel[94].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[94].setRotationPoint(-14.0F, -24.0F, -19.0F);
    
    bodyModel[95].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[95].setRotationPoint(-27.0F, -24.0F, 19.0F);
    
    bodyModel[96].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[96].setRotationPoint(-27.0F, -24.0F, -19.0F);
    
    bodyModel[97].addShapeBox(8.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[97].setRotationPoint(39.0F, -24.0F, 19.0F);
    (bodyModel[97]).rotateAngleZ = -0.15707964F;
    
    bodyModel[98].addShapeBox(8.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[98].setRotationPoint(39.0F, -24.0F, -19.0F);
    (bodyModel[98]).rotateAngleZ = -0.15707964F;
    
    bodyModel[99].addShapeBox(16.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[99].setRotationPoint(39.0F, -24.0F, 19.0F);
    (bodyModel[99]).rotateAngleZ = -0.15707964F;
    
    bodyModel[100].addShapeBox(16.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[100].setRotationPoint(39.0F, -24.0F, -19.0F);
    (bodyModel[100]).rotateAngleZ = -0.15707964F;
    
    bodyModel[101].addShapeBox(16.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[101].setRotationPoint(39.0F, -24.0F, 19.0F);
    (bodyModel[101]).rotateAngleZ = -0.15707964F;
    
    bodyModel[102].addShapeBox(24.0F, 0.0F, 0.0F, 1, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[102].setRotationPoint(39.0F, -24.0F, 19.0F);
    (bodyModel[102]).rotateAngleZ = -0.15707964F;
    
    bodyModel[103].addShapeBox(24.0F, 0.0F, -7.0F, 1, 1, 7, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[103].setRotationPoint(39.0F, -24.0F, -19.0F);
    (bodyModel[103]).rotateAngleZ = -0.15707964F;
    
    bodyModel[104].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[104].setRotationPoint(-62.0F, -24.0F, 25.0F);
    
    bodyModel[105].addShapeBox(0.0F, 0.0F, -1.0F, 4, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[105].setRotationPoint(-62.0F, -24.0F, -25.0F);
    
    bodyModel[106].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[106].setRotationPoint(-62.0F, -24.0F, 23.0F);
    
    bodyModel[107].addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
    bodyModel[107].setRotationPoint(-62.0F, -24.0F, -23.0F);
    
    bodyModel[108].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[108].setRotationPoint(-62.0F, -24.0F, 19.0F);
    
    bodyModel[109].addShapeBox(0.0F, 0.0F, -4.0F, 4, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F);
    bodyModel[109].setRotationPoint(-62.0F, -24.0F, -19.0F);
    
    bodyModel[110].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[110].setRotationPoint(-56.0F, -25.0F, 2.0F);
    
    bodyModel[111].addShapeBox(0.0F, 0.0F, -2.0F, 10, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[111].setRotationPoint(-56.0F, -25.0F, -2.0F);
    
    bodyModel[112].addShapeBox(0.0F, 0.0F, 0.0F, 10, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[112].setRotationPoint(-56.0F, -25.0F, 8.0F);
    
    bodyModel[113].addShapeBox(0.0F, 0.0F, -2.0F, 10, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[113].setRotationPoint(-56.0F, -25.0F, -8.0F);
    
    bodyModel[114].addShapeBox(0.0F, -5.0F, -19.0F, 16, 5, 38, 0.0F, 0.0F, -4.99F, 0.0F, -6.0F, 0.0F, -5.0F, -6.0F, 0.0F, -5.0F, 0.0F, -4.99F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[114].setRotationPoint(39.0F, -24.0F, 0.0F);
    (bodyModel[114]).rotateAngleZ = -0.15707964F;
    
    bodyModel[115].addShapeBox(0.0F, -5.0F, -19.0F, 10, 5, 38, 0.0F, 0.0F, 0.05F, -5.0F, 0.05F, 0.0F, -5.0F, 0.05F, 0.0F, -5.0F, 0.0F, 0.05F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.99F, -5.0F, 0.0F, -4.99F, -5.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[115].setRotationPoint(39.0F, -24.0F, 0.0F);
    (bodyModel[115]).rotateAngleZ = -0.15707964F;
    
    bodyModel[116].addShapeBox(0.0F, 0.0F, -19.0F, 53, 5, 38, 0.0F, 0.0F, 0.0F, -5.0F, 0.76F, 0.0F, -5.0F, 0.76F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[116].setRotationPoint(-14.0F, -29.0F, 0.0F);
    
    bodyModel[117].addShapeBox(0.0F, 0.0F, 0.0F, 8, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[117].setRotationPoint(-61.0F, -23.0F, 19.0F);
    
    bodyModel[118].addShapeBox(0.0F, 0.0F, -1.0F, 8, 5, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[118].setRotationPoint(-61.0F, -23.0F, -19.0F);
    
    bodyModel[119].addShapeBox(0.0F, 0.0F, 0.0F, 8, 5, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -5.0F, 0.0F, -0.25F, -5.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
    bodyModel[119].setRotationPoint(-61.0F, -23.0F, 22.0F);
    
    bodyModel[120].addShapeBox(0.0F, 0.0F, -1.0F, 8, 5, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, -5.0F, 0.0F, -0.25F, -5.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
    bodyModel[120].setRotationPoint(-61.0F, -23.0F, -22.0F);
    
    bodyModel[121].addShapeBox(0.0F, 0.0F, 0.0F, 8, 5, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -5.0F, 0.0F, -0.5F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[121].setRotationPoint(-61.0F, -23.0F, 25.0F);
    
    bodyModel[122].addShapeBox(0.0F, 0.0F, -1.0F, 8, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[122].setRotationPoint(-61.0F, -23.0F, -25.0F);
    
    bodyModel[123].addShapeBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[123].setRotationPoint(-61.0F, -18.0F, 19.0F);
    
    bodyModel[124].addShapeBox(0.0F, 0.0F, -1.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[124].setRotationPoint(-61.0F, -18.0F, -19.0F);
    
    bodyModel[125].addShapeBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
    bodyModel[125].setRotationPoint(-61.0F, -18.0F, 22.0F);
    
    bodyModel[126].addShapeBox(0.0F, 0.0F, -1.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
    bodyModel[126].setRotationPoint(-61.0F, -18.0F, -22.0F);
    
    bodyModel[127].addShapeBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[127].setRotationPoint(-61.0F, -18.0F, 25.0F);
    
    bodyModel[128].addShapeBox(0.0F, 0.0F, -1.0F, 3, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[128].setRotationPoint(-61.0F, -18.0F, -25.0F);
    
    bodyModel[129].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[129].setRotationPoint(-61.0F, -23.0F, 19.0F);
    
    bodyModel[130].addShapeBox(0.0F, 0.0F, -7.0F, 7, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[130].setRotationPoint(-61.0F, -23.0F, -19.0F);
    
    bodyModel[131].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
    bodyModel[131].setRotationPoint(-61.0F, -20.5F, 19.5F);
    (bodyModel[131]).rotateAngleX = -0.5235988F;
    
    bodyModel[132].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
    bodyModel[132].setRotationPoint(-61.0F, -22.5F, 19.5F);
    (bodyModel[132]).rotateAngleX = -0.5235988F;
    
    bodyModel[133].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
    bodyModel[133].setRotationPoint(-61.0F, -22.5F, 22.75F);
    (bodyModel[133]).rotateAngleX = -0.5235988F;
    
    bodyModel[134].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
    bodyModel[134].setRotationPoint(-61.0F, -18.5F, 19.5F);
    (bodyModel[134]).rotateAngleX = -0.5235988F;
    
    bodyModel[135].addShapeBox(0.0F, 0.0F, -7.0F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[135].setRotationPoint(-61.0F, -22.5F, -19.5F);
    (bodyModel[135]).rotateAngleX = 0.5235988F;
    
    bodyModel[136].addShapeBox(0.0F, 0.0F, -7.0F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[136].setRotationPoint(-61.0F, -20.5F, -19.5F);
    (bodyModel[136]).rotateAngleX = 0.5235988F;
    
    bodyModel[137].addShapeBox(0.0F, 0.0F, -3.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
    bodyModel[137].setRotationPoint(-61.0F, -22.5F, -22.75F);
    (bodyModel[137]).rotateAngleX = 0.5235988F;
    
    bodyModel[138].addShapeBox(0.0F, 0.0F, -3.5F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F);
    bodyModel[138].setRotationPoint(-61.0F, -18.5F, -19.5F);
    (bodyModel[138]).rotateAngleX = 0.5235988F;
    
    bodyModel[139].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    bodyModel[139].setRotationPoint(5.0F, 0.0F, 0.0F);
    
    bodyModel[140].addBox(1.0F, -0.1F, -8.0F, 5, 1, 8, 0.0F);
    bodyModel[140].setRotationPoint(49.7F, -27.5F, 12.0F);
    (bodyModel[140]).rotateAngleZ = -0.8552113F;
    
    bodyModel[141].addBox(2.0F, 0.0F, 0.0F, 7, 1, 8, 0.0F);
    bodyModel[141].setRotationPoint(40.0F, -29.1F, -12.0F);
    (bodyModel[141]).rotateAngleZ = -0.15707964F;
    
    bodyModel[142].addBox(3.0F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[142].setRotationPoint(40.0F, -29.1F, -13.0F);
    (bodyModel[142]).rotateAngleZ = -0.15707964F;
    
    bodyModel[143].addBox(7.0F, -0.2F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[143].setRotationPoint(40.0F, -29.1F, -13.0F);
    (bodyModel[143]).rotateAngleZ = -0.15707964F;
    
    bodyModel[144].addShapeBox(0.5F, -0.3F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[144].setRotationPoint(49.7F, -27.5F, 11.0F);
    (bodyModel[144]).rotateAngleZ = -0.8552113F;
    
    bodyModel[145].addShapeBox(0.5F, -0.3F, -1.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[145].setRotationPoint(49.7F, -27.5F, 6.0F);
    (bodyModel[145]).rotateAngleZ = -0.8552113F;
    
    bodyModel[146].addBox(2.0F, 0.0F, -8.0F, 7, 1, 8, 0.0F);
    bodyModel[146].setRotationPoint(40.0F, -29.1F, 12.0F);
    (bodyModel[146]).rotateAngleZ = -0.15707964F;
    
    bodyModel[147].addBox(3.0F, -0.2F, -2.0F, 1, 1, 2, 0.0F);
    bodyModel[147].setRotationPoint(40.0F, -29.1F, 13.0F);
    (bodyModel[147]).rotateAngleZ = -0.15707964F;
    
    bodyModel[148].addBox(7.0F, -0.2F, -2.0F, 1, 1, 2, 0.0F);
    bodyModel[148].setRotationPoint(40.0F, -29.1F, 13.0F);
    (bodyModel[148]).rotateAngleZ = -0.15707964F;
    
    bodyModel[149].addShapeBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[149].setRotationPoint(50.0F, -26.4F, -10.0F);
    
    bodyModel[150].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[150].setRotationPoint(54.0F, -25.4F, -9.0F);
    
    bodyModel[151].addShapeBox(0.0F, -0.5F, -0.5F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[151].setRotationPoint(54.0F, -24.4F, -8.0F);
    
    bodyModel[152].addShapeBox(0.0F, -0.5F, 0.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[152].setRotationPoint(54.0F, -23.0F, -18.0F);
    
    bodyModel[153].addShapeBox(0.0F, -0.5F, -3.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[153].setRotationPoint(54.0F, -23.0F, 18.0F);
    
    bodyModel[154].addShapeBox(0.0F, -0.5F, 0.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[154].setRotationPoint(54.0F, -23.5F, -18.0F);
    
    bodyModel[155].addShapeBox(0.0F, -0.5F, -2.5F, 3, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[155].setRotationPoint(54.0F, -23.5F, 18.0F);
    
    bodyModel[156].addShapeBox(0.0F, 0.0F, 0.0F, 3, 3, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[156].setRotationPoint(49.0F, -25.0F, 16.0F);
    
    bodyModel[157].addShapeBox(0.0F, 0.0F, 0.0F, 1, 15, 1, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F);
    bodyModel[157].setRotationPoint(50.5F, -40.0F, 16.5F);
    
    bodyModel[158].addBox(0.0F, 1.0F, -0.8F, 8, 5, 1, 0.0F);
    bodyModel[158].setRotationPoint(29.0F, -29.0F, 14.0F);
    (bodyModel[158]).rotateAngleX = 0.7853982F;
    
    bodyModel[159].addBox(0.0F, 1.0F, -0.2F, 8, 5, 1, 0.0F);
    bodyModel[159].setRotationPoint(29.0F, -29.0F, -14.0F);
    (bodyModel[159]).rotateAngleX = -0.7853982F;
    
    bodyModel[160].addBox(0.0F, 0.5F, -0.6F, 1, 2, 1, 0.0F);
    bodyModel[160].setRotationPoint(30.0F, -29.0F, 14.0F);
    (bodyModel[160]).rotateAngleX = 0.7853982F;
    
    bodyModel[161].addBox(0.0F, 0.5F, -0.6F, 1, 2, 1, 0.0F);
    bodyModel[161].setRotationPoint(35.0F, -29.0F, 14.0F);
    (bodyModel[161]).rotateAngleX = 0.7853982F;
    
    bodyModel[162].addBox(0.0F, 0.5F, -0.4F, 1, 2, 1, 0.0F);
    bodyModel[162].setRotationPoint(30.0F, -29.0F, -14.0F);
    (bodyModel[162]).rotateAngleX = -0.7853982F;
    
    bodyModel[163].addBox(0.0F, 0.5F, -0.4F, 1, 2, 1, 0.0F);
    bodyModel[163].setRotationPoint(35.0F, -29.0F, -14.0F);
    (bodyModel[163]).rotateAngleX = -0.7853982F;
    
    bodyModel[164].addBox(0.0F, 0.0F, -13.0F, 10, 1, 26, 0.0F);
    bodyModel[164].setRotationPoint(-5.0F, -30.0F, 0.0F);
    
    bodyModel[165].addShapeBox(0.0F, 0.0F, -13.0F, 8, 1, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[165].setRotationPoint(5.0F, -30.0F, 0.0F);
    
    bodyModel[166].addShapeBox(0.0F, 0.0F, -13.0F, 8, 1, 26, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F);
    bodyModel[166].setRotationPoint(-13.0F, -30.0F, 0.0F);

    
    turretModel = new ModelRendererTurbo[14];
    turretModel[0] = new ModelRendererTurbo(this, 265, 185, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 265, 223, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 425, 185, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 355, 185, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 355, 205, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 355, 185, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 355, 185, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 355, 185, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 355, 185, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 410, 185, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 410, 185, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 315, 365, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 395, 400, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 395, 365, textureX, textureY);
    
    turretModel[0].addShapeBox(0.0F, 0.0F, -12.0F, 5, 10, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[0].setRotationPoint(0.0F, -40.0F, 0.0F);
    
    turretModel[1].addShapeBox(0.0F, 0.0F, -12.0F, 8, 10, 24, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -5.0F, 0.0F, -1.0F, -5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -6.0F, 1.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F);
    turretModel[1].setRotationPoint(5.0F, -40.0F, 0.0F);
    
    turretModel[2].addShapeBox(0.0F, 0.0F, -12.0F, 15, 10, 24, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
    turretModel[2].setRotationPoint(-15.0F, -40.0F, 0.0F);
    
    turretModel[3].addShapeBox(0.0F, 0.0F, -11.5F, 12, 1, 13, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
    turretModel[3].setRotationPoint(-12.0F, -40.2F, 0.0F);
    
    turretModel[4].addShapeBox(0.0F, 0.0F, 0.5F, 12, 1, 9, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F);
    turretModel[4].setRotationPoint(-12.0F, -40.2F, 2.0F);
    
    turretModel[5].addShapeBox(0.0F, -0.2F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[5].setRotationPoint(-13.0F, -40.2F, 0.0F);
    
    turretModel[6].addShapeBox(0.0F, -0.2F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[6].setRotationPoint(-13.0F, -40.2F, -8.0F);
    
    turretModel[7].addShapeBox(0.0F, -0.2F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[7].setRotationPoint(-13.0F, -40.2F, 3.0F);
    
    turretModel[8].addShapeBox(0.0F, -0.2F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[8].setRotationPoint(-13.0F, -40.2F, 7.0F);
    
    turretModel[9].addShapeBox(0.0F, -0.2F, 0.0F, 2, 2, 5, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[9].setRotationPoint(1.0F, -41.2F, -9.0F);
    
    turretModel[10].addShapeBox(0.0F, -0.2F, 0.0F, 2, 2, 5, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[10].setRotationPoint(1.0F, -41.2F, 5.0F);
    
    turretModel[11].addShapeBox(0.0F, 0.0F, -13.0F, 10, 1, 26, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[11].setRotationPoint(-5.0F, -31.0F, 0.0F);
    
    turretModel[12].addShapeBox(0.0F, 0.0F, -13.0F, 8, 1, 26, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F);
    turretModel[12].setRotationPoint(-13.0F, -31.0F, 0.0F);
    
    turretModel[13].addShapeBox(0.0F, 0.0F, -13.0F, 8, 1, 26, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F);
    turretModel[13].setRotationPoint(5.0F, -31.0F, 0.0F);

    
    barrelModel = new ModelRendererTurbo[9];
    barrelModel[0] = new ModelRendererTurbo(this, 355, 225, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 355, 235, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 405, 235, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 425, 235, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 385, 235, textureX, textureY);
    barrelModel[5] = new ModelRendererTurbo(this, 355, 260, textureX, textureY);
    barrelModel[6] = new ModelRendererTurbo(this, 380, 260, textureX, textureY);
    barrelModel[7] = new ModelRendererTurbo(this, 380, 270, textureX, textureY);
    barrelModel[8] = new ModelRendererTurbo(this, 355, 275, textureX, textureY);
    
    barrelModel[0].addBox(3.0F, -1.0F, -1.0F, 13, 2, 2, 0.0F);
    barrelModel[0].setRotationPoint(8.0F, -35.0F, 0.0F);
    
    barrelModel[1].addBox(3.5F, -2.5F, -3.5F, 3, 6, 7, 0.0F);
    barrelModel[1].setRotationPoint(8.0F, -35.0F, 0.0F);
    
    barrelModel[2].addShapeBox(6.5F, -3.5F, -5.0F, 2, 8, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.8F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.8F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[2].setRotationPoint(8.0F, -35.0F, 0.0F);
    
    barrelModel[3].addShapeBox(6.5F, -3.5F, -3.0F, 2, 8, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[3].setRotationPoint(8.0F, -35.0F, 0.0F);
    
    barrelModel[4].addShapeBox(6.5F, -3.5F, 3.0F, 2, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.0F, 0.0F);
    barrelModel[4].setRotationPoint(8.0F, -35.0F, 0.0F);
    
    barrelModel[5].addShapeBox(8.0F, -1.0F, -1.5F, 3, 6, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[5].setRotationPoint(8.0F, -36.0F, 0.0F);
    
    barrelModel[6].addShapeBox(16.0F, -1.0F, -1.0F, 18, 2, 2, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.2F, -0.2F);
    barrelModel[6].setRotationPoint(8.0F, -35.0F, 0.0F);
    
    barrelModel[7].addBox(3.0F, -0.5F, -3.0F, 11, 1, 1, 0.0F);
    barrelModel[7].setRotationPoint(8.0F, -35.0F, 0.0F);
    
    barrelModel[8].addBox(3.0F, -1.0F, 2.0F, 6, 1, 1, 0.0F);
    barrelModel[8].setRotationPoint(8.0F, -35.0F, 0.0F);

    
    leftTrackWheelModels = new ModelRendererTurbo[15];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 240, textureX, textureY);
    leftTrackWheelModels[12] = new ModelRendererTurbo(this, 40, 240, textureX, textureY);
    leftTrackWheelModels[13] = new ModelRendererTurbo(this, 50, 275, textureX, textureY);
    leftTrackWheelModels[14] = new ModelRendererTurbo(this, 50, 275, textureX, textureY);
    
    leftTrackWheelModels[0].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[0].setRotationPoint(27.0F, 6.0F, 21.0F);
    
    leftTrackWheelModels[1].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[1].setRotationPoint(19.0F, 6.0F, 21.0F);
    
    leftTrackWheelModels[2].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[2].setRotationPoint(11.0F, 6.0F, 21.0F);
    
    leftTrackWheelModels[3].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[3].setRotationPoint(3.0F, 6.0F, 21.0F);
    
    leftTrackWheelModels[4].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[4].setRotationPoint(-5.0F, 6.0F, 21.0F);
    
    leftTrackWheelModels[5].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[5].setRotationPoint(-13.0F, 6.0F, 21.0F);
    
    leftTrackWheelModels[6].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[6].setRotationPoint(-21.0F, 6.0F, 21.0F);
    
    leftTrackWheelModels[7].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[7].setRotationPoint(42.0F, 2.0F, 21.0F);
    
    leftTrackWheelModels[8].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[8].setRotationPoint(35.0F, 5.0F, 21.0F);
    
    leftTrackWheelModels[9].addBox(-2.0F, -1.5F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[9].setRotationPoint(-28.0F, 4.0F, 21.0F);
    
    leftTrackWheelModels[10].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 3, 0.0F);
    leftTrackWheelModels[10].setRotationPoint(-35.0F, 3.0F, 21.0F);
    
    leftTrackWheelModels[11].addShape3D(5.0F, -5.0F, -5.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 10, 10, 36, 5, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[11].setRotationPoint(57.0F, -12.0F, 20.0F);
    
    leftTrackWheelModels[12].addShape3D(4.0F, -4.0F, -5.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 5.0F, 8, 8, 28, 5, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[12].setRotationPoint(-51.0F, -16.0F, 20.0F);
    
    leftTrackWheelModels[13].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 3, 0.0F);
    leftTrackWheelModels[13].setRotationPoint(-25.5F, -18.0F, 21.0F);
    
    leftTrackWheelModels[14].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 3, 0.0F);
    leftTrackWheelModels[14].setRotationPoint(20.5F, -17.5F, 21.0F);

    
    rightTrackWheelModels = new ModelRendererTurbo[15];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 0, 225, textureX, textureY);
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 240, textureX, textureY);
    rightTrackWheelModels[12] = new ModelRendererTurbo(this, 40, 240, textureX, textureY);
    rightTrackWheelModels[13] = new ModelRendererTurbo(this, 50, 275, textureX, textureY);
    rightTrackWheelModels[14] = new ModelRendererTurbo(this, 50, 275, textureX, textureY);
    
    rightTrackWheelModels[0].addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[0].setRotationPoint(42.0F, 2.0F, -21.0F);
    
    rightTrackWheelModels[1].addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[1].setRotationPoint(35.0F, 5.0F, -21.0F);
    
    rightTrackWheelModels[2].addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[2].setRotationPoint(27.0F, 6.0F, -21.0F);
    
    rightTrackWheelModels[3].addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[3].setRotationPoint(19.0F, 6.0F, -21.0F);
    
    rightTrackWheelModels[4].addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[4].setRotationPoint(11.0F, 6.0F, -21.0F);
    
    rightTrackWheelModels[5].addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[5].setRotationPoint(3.0F, 6.0F, -21.0F);
    
    rightTrackWheelModels[6].addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[6].setRotationPoint(-5.0F, 6.0F, -21.0F);
    
    rightTrackWheelModels[7].addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[7].setRotationPoint(-13.0F, 6.0F, -21.0F);
    
    rightTrackWheelModels[8].addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[8].setRotationPoint(-21.0F, 6.0F, -21.0F);
    
    rightTrackWheelModels[9].addBox(-2.0F, -1.5F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[9].setRotationPoint(-28.0F, 4.0F, -21.0F);
    
    rightTrackWheelModels[10].addBox(-2.0F, -2.0F, -3.0F, 4, 4, 3, 0.0F);
    rightTrackWheelModels[10].setRotationPoint(-35.0F, 3.0F, -21.0F);
    
    rightTrackWheelModels[11].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 5.0F, 10, 10, 36, 5, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[11].setRotationPoint(57.0F, -12.0F, -20.0F);
    
    rightTrackWheelModels[12].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 5.0F, 8, 8, 28, 5, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[12].setRotationPoint(-51.0F, -16.0F, -20.0F);
    
    rightTrackWheelModels[13].addBox(-1.5F, -2.0F, -3.0F, 3, 3, 3, 0.0F);
    rightTrackWheelModels[13].setRotationPoint(-25.5F, -18.0F, -21.0F);
    
    rightTrackWheelModels[14].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 3, 0.0F);
    rightTrackWheelModels[14].setRotationPoint(20.5F, -17.5F, -21.0F);

    
    leftTrackModel = new ModelRendererTurbo[13];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 290, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 35, 290, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 65, 290, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 140, 290, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 170, 290, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 0, 310, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 120, 310, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 175, 310, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 200, 310, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 230, 310, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 230, 330, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 265, 310, textureX, textureY);
    leftTrackModel[12] = new ModelRendererTurbo(this, 310, 330, textureX, textureY);
    
    leftTrackModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[0].setRotationPoint(60.0F, -19.0F, 19.0F);
    (leftTrackModel[0]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[1].addBox(0.0F, -1.0F, 0.0F, 3, 6, 7, 0.0F);
    leftTrackModel[1].setRotationPoint(61.0F, -14.0F, 19.0F);
    
    leftTrackModel[2].addShapeBox(-0.5F, -3.0F, 0.0F, 25, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[2].setRotationPoint(44.0F, 6.0F, 19.0F);
    (leftTrackModel[2]).rotateAngleZ = 0.6422812F;
    
    leftTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 7, 3, 7, 0.0F);
    leftTrackModel[3].setRotationPoint(36.0F, 6.0F, 19.0F);
    (leftTrackModel[3]).rotateAngleZ = 0.36651915F;
    
    leftTrackModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 10, 3, 7, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F);
    leftTrackModel[4].setRotationPoint(27.0F, 7.0F, 19.0F);
    (leftTrackModel[4]).rotateAngleZ = 0.12217305F;
    
    leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 48, 3, 7, 0.0F);
    leftTrackModel[5].setRotationPoint(-21.0F, 7.0F, 19.0F);
    
    leftTrackModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 16, 3, 7, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F);
    leftTrackModel[6].setRotationPoint(-36.0F, 4.0F, 19.0F);
    (leftTrackModel[6]).rotateAngleZ = -0.19198622F;
    
    leftTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 3, 29, 7, 0.0F);
    leftTrackModel[7].setRotationPoint(-57.0F, -14.0F, 19.0F);
    (leftTrackModel[7]).rotateAngleZ = 0.7679449F;
    
    leftTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 3, 4, 7, 0.0F);
    leftTrackModel[8].setRotationPoint(-57.0F, -18.0F, 19.0F);
    
    leftTrackModel[9].addShapeBox(-6.0F, 0.0F, 0.0F, 6, 3, 7, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
    leftTrackModel[9].setRotationPoint(-53.0F, -22.0F, 19.0F);
    (leftTrackModel[9]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 29, 3, 7, 0.0F);
    leftTrackModel[10].setRotationPoint(-53.0F, -22.0F, 19.0F);
    
    leftTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 46, 3, 7, 0.0F);
    leftTrackModel[11].setRotationPoint(-24.0F, -22.0F, 19.0F);
    (leftTrackModel[11]).rotateAngleZ = -0.01745329F;
    
    leftTrackModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 38, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.07F, 0.0F, 0.0F, 0.07F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[12].setRotationPoint(22.0F, -21.2F, 19.0F);
    (leftTrackModel[12]).rotateAngleZ = -0.05759587F;

    
    rightTrackModel = new ModelRendererTurbo[13];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 290, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 35, 290, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 65, 290, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 140, 290, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 170, 290, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 0, 310, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 120, 310, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 175, 310, textureX, textureY);
    rightTrackModel[8] = new ModelRendererTurbo(this, 200, 310, textureX, textureY);
    rightTrackModel[9] = new ModelRendererTurbo(this, 230, 310, textureX, textureY);
    rightTrackModel[10] = new ModelRendererTurbo(this, 230, 330, textureX, textureY);
    rightTrackModel[11] = new ModelRendererTurbo(this, 265, 310, textureX, textureY);
    rightTrackModel[12] = new ModelRendererTurbo(this, 310, 330, textureX, textureY);
    
    rightTrackModel[0].addShapeBox(0.0F, 0.0F, -7.0F, 6, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.35F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[0].setRotationPoint(60.0F, -19.0F, -19.0F);
    (rightTrackModel[0]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[1].addBox(0.0F, -1.0F, -7.0F, 3, 6, 7, 0.0F);
    rightTrackModel[1].setRotationPoint(61.0F, -14.0F, -19.0F);
    
    rightTrackModel[2].addShapeBox(-0.5F, -3.0F, -7.0F, 25, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[2].setRotationPoint(44.0F, 6.0F, -19.0F);
    (rightTrackModel[2]).rotateAngleZ = 0.6422812F;
    
    rightTrackModel[3].addBox(0.0F, 0.0F, -7.0F, 7, 3, 7, 0.0F);
    rightTrackModel[3].setRotationPoint(36.0F, 6.0F, -19.0F);
    (rightTrackModel[3]).rotateAngleZ = 0.36651915F;
    
    rightTrackModel[4].addShapeBox(0.0F, 0.0F, -7.0F, 10, 3, 7, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F);
    rightTrackModel[4].setRotationPoint(27.0F, 7.0F, -19.0F);
    (rightTrackModel[4]).rotateAngleZ = 0.12217305F;
    
    rightTrackModel[5].addBox(0.0F, 0.0F, -7.0F, 48, 3, 7, 0.0F);
    rightTrackModel[5].setRotationPoint(-21.0F, 7.0F, -19.0F);
    
    rightTrackModel[6].addShapeBox(0.0F, 0.0F, -7.0F, 16, 3, 7, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F);
    rightTrackModel[6].setRotationPoint(-36.0F, 4.0F, -19.0F);
    (rightTrackModel[6]).rotateAngleZ = -0.19198622F;
    
    rightTrackModel[7].addBox(0.0F, 0.0F, -7.0F, 3, 29, 7, 0.0F);
    rightTrackModel[7].setRotationPoint(-57.0F, -14.0F, -19.0F);
    (rightTrackModel[7]).rotateAngleZ = 0.7679449F;
    
    rightTrackModel[8].addBox(0.0F, 0.0F, -7.0F, 3, 4, 7, 0.0F);
    rightTrackModel[8].setRotationPoint(-57.0F, -18.0F, -19.0F);
    
    rightTrackModel[9].addShapeBox(-6.0F, 0.0F, -7.0F, 6, 3, 7, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F);
    rightTrackModel[9].setRotationPoint(-53.0F, -22.0F, -19.0F);
    (rightTrackModel[9]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[10].addBox(0.0F, 0.0F, -7.0F, 29, 3, 7, 0.0F);
    rightTrackModel[10].setRotationPoint(-53.0F, -22.0F, -19.0F);
    
    rightTrackModel[11].addBox(0.0F, 0.0F, -7.0F, 46, 3, 7, 0.0F);
    rightTrackModel[11].setRotationPoint(-24.0F, -22.0F, -19.0F);
    (rightTrackModel[11]).rotateAngleZ = -0.01745329F;
    
    rightTrackModel[12].addShapeBox(0.0F, 0.0F, -7.0F, 38, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.07F, 0.0F, 0.0F, 0.07F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[12].setRotationPoint(22.0F, -21.2F, -19.0F);
    (rightTrackModel[12]).rotateAngleZ = -0.05759587F;


    
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
		for(int i = 0; i < steeringWheelModel.length; i++)
		{
			steeringWheelModel[i].render(f5);
		}
	}
}
