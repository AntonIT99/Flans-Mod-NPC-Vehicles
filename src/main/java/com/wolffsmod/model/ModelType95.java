package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelType95
  extends ModelVehicle {
  int textureX = 512;
  int textureY = 512;

  
  public ModelType95() {
    bodyModel = new ModelRendererTurbo[130];
    bodyModel[0] = new ModelRendererTurbo(this, 193, 1, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 273, 1, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 337, 1, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 1, 9, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 425, 1, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 81, 41, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 145, 41, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 457, 17, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 241, 41, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 81, 9, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 313, 1, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 281, 41, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 257, 1, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 401, 1, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 457, 1, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 417, 9, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 97, 25, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 345, 41, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 153, 25, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 401, 41, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 1, 49, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 41, 49, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 489, 9, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 193, 1, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 313, 1, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 489, 25, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 153, 1, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 129, 41, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 345, 1, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 225, 41, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 297, 57, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 369, 57, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 1, 65, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 297, 65, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 177, 1, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 257, 1, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 417, 1, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 33, 83, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 281, 1, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 81, 49, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 433, 1, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 489, 1, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 449, 49, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 281, 9, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 401, 1, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 457, 1, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 193, 17, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 145, 49, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 145, 41, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 473, 49, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 241, 41, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 249, 49, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 433, 57, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 465, 49, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 433, 57, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 41, 65, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 505, 1, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 82, 68, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 257, 17, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 489, 57, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 489, 49, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 377, 65, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 385, 65, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 401, 65, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 417, 65, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 449, 65, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 81, 9, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 137, 9, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 273, 17, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 473, 65, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 1, 73, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 17, 73, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 25, 73, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 41, 73, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 57, 73, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 81, 73, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 345, 65, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 121, 73, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 256, 124, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 230, 124, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 20, 99, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 303, 123, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 195, 135, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 56, 161, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 35, 161, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 100, 128, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 260, 88, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 266, 145, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 288, 150, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 207, 155, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 214, 123, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 276, 139, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 24, 144, textureX, textureY);
    bodyModel[94] = new ModelRendererTurbo(this, 62, 104, textureX, textureY);
    bodyModel[95] = new ModelRendererTurbo(this, 0, 164, textureX, textureY);
    bodyModel[96] = new ModelRendererTurbo(this, 308, 131, textureX, textureY);
    bodyModel[97] = new ModelRendererTurbo(this, 294, 131, textureX, textureY);
    bodyModel[98] = new ModelRendererTurbo(this, 301, 153, textureX, textureY);
    bodyModel[99] = new ModelRendererTurbo(this, 295, 153, textureX, textureY);
    bodyModel[100] = new ModelRendererTurbo(this, 301, 149, textureX, textureY);
    bodyModel[101] = new ModelRendererTurbo(this, 301, 145, textureX, textureY);
    bodyModel[102] = new ModelRendererTurbo(this, 0, 160, textureX, textureY);
    bodyModel[103] = new ModelRendererTurbo(this, 272, 122, textureX, textureY);
    bodyModel[104] = new ModelRendererTurbo(this, 186, 144, textureX, textureY);
    bodyModel[105] = new ModelRendererTurbo(this, 99, 141, textureX, textureY);
    bodyModel[106] = new ModelRendererTurbo(this, 76, 163, textureX, textureY);
    bodyModel[107] = new ModelRendererTurbo(this, 146, 133, textureX, textureY);
    bodyModel[108] = new ModelRendererTurbo(this, 38, 112, textureX, textureY);
    bodyModel[109] = new ModelRendererTurbo(this, 426, 104, textureX, textureY);
    bodyModel[110] = new ModelRendererTurbo(this, 188, 123, textureX, textureY);
    bodyModel[111] = new ModelRendererTurbo(this, 53, 82, textureX, textureY);
    bodyModel[112] = new ModelRendererTurbo(this, 287, 145, textureX, textureY);
    bodyModel[113] = new ModelRendererTurbo(this, 281, 150, textureX, textureY);
    bodyModel[114] = new ModelRendererTurbo(this, 274, 150, textureX, textureY);
    bodyModel[115] = new ModelRendererTurbo(this, 266, 150, textureX, textureY);
    bodyModel[116] = new ModelRendererTurbo(this, 275, 145, textureX, textureY);
    bodyModel[117] = new ModelRendererTurbo(this, 282, 145, textureX, textureY);
    bodyModel[118] = new ModelRendererTurbo(this, 39, 107, textureX, textureY);
    bodyModel[119] = new ModelRendererTurbo(this, 161, 123, textureX, textureY);
    bodyModel[120] = new ModelRendererTurbo(this, 135, 123, textureX, textureY);
    bodyModel[121] = new ModelRendererTurbo(this, 282, 131, textureX, textureY);
    bodyModel[122] = new ModelRendererTurbo(this, 311, 138, textureX, textureY);
    bodyModel[123] = new ModelRendererTurbo(this, 33, 108, textureX, textureY);
    bodyModel[124] = new ModelRendererTurbo(this, 33, 113, textureX, textureY);
    bodyModel[125] = new ModelRendererTurbo(this, 295, 150, textureX, textureY);
    bodyModel[126] = new ModelRendererTurbo(this, 320, 122, textureX, textureY);
    bodyModel[127] = new ModelRendererTurbo(this, 36, 98, textureX, textureY);
    bodyModel[128] = new ModelRendererTurbo(this, 31, 98, textureX, textureY);
    bodyModel[129] = new ModelRendererTurbo(this, 295, 146, textureX, textureY);
    
    bodyModel[0].addShapeBox(0.0F, 0.0F, -10.0F, 18, 15, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -2.0F, -3.0F, 0.0F, -2.0F, -3.0F, 0.0F, -9.0F, 0.0F, 0.0F);
    bodyModel[0].setRotationPoint(12.0F, -11.0F, 0.0F);
    
    bodyModel[1].addShapeBox(0.0F, 0.0F, -10.0F, 9, 15, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.9F, 0.0F, 0.0F, -14.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(12.0F, -11.0F, 0.0F);
    
    bodyModel[2].addShapeBox(0.0F, 0.0F, -10.0F, 20, 15, 20, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(-8.0F, -11.0F, 0.0F);
    
    bodyModel[3].addShapeBox(0.0F, 0.0F, -10.0F, 26, 14, 20, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[3].setRotationPoint(-34.0F, -10.0F, 0.0F);
    
    bodyModel[4].addShapeBox(0.0F, 0.0F, -10.0F, 2, 12, 20, 0.0F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[4].setRotationPoint(-34.0F, -8.0F, 0.0F);
    
    bodyModel[5].addShapeBox(0.0F, 0.0F, -10.0F, 11, 5, 20, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.9F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.9F, 0.0F);
    bodyModel[5].setRotationPoint(-6.0F, -16.0F, 0.0F);
    
    bodyModel[6].addShapeBox(0.0F, 0.0F, -10.0F, 26, 8, 20, 0.0F, -10.0F, -2.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, -10.0F, -2.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[6].setRotationPoint(-34.0F, -16.0F, 0.0F);
    
    bodyModel[7].addShapeBox(0.0F, 0.0F, -10.0F, 2, 6, 20, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[7].setRotationPoint(-8.0F, -16.0F, 0.0F);
    
    bodyModel[8].addShapeBox(0.0F, 0.0F, -10.0F, 7, 5, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.35F, 0.0F);
    bodyModel[8].setRotationPoint(5.0F, -16.0F, 0.0F);
    
    bodyModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 20, 6, 9, 0.0F, -4.0F, 0.0F, -0.5F, -7.0F, 0.0F, -3.0F, -8.0F, 0.0F, -5.0F, -7.0F, 0.0F, -5.0F, 0.0F, 1.0F, -3.0F, 0.0F, 0.0F, -3.0F, -5.0F, 0.25F, 0.0F, -5.0F, 0.6F, 0.0F);
    bodyModel[9].setRotationPoint(-8.0F, -16.0F, 7.0F);
    
    bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 6, 7, 12, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[10].setRotationPoint(12.0F, -16.0F, -2.0F);
    
    bodyModel[11].addShapeBox(0.0F, 0.0F, -9.0F, 4, 7, 10, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -2.0F, -1.0F);
    bodyModel[11].setRotationPoint(12.0F, -16.0F, -1.0F);
    
    bodyModel[12].addShapeBox(-26.0F, 0.0F, 0.0F, 26, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[12].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[12]).rotateAngleZ = 0.07853982F;
    
    bodyModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[13].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[13]).rotateAngleZ = 0.07853982F;
    
    bodyModel[14].addShapeBox(-16.0F, 0.0F, -7.0F, 4, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[14].setRotationPoint(-8.0F, -10.0F, -10.0F);
    (bodyModel[14]).rotateAngleZ = 0.07853982F;
    
    bodyModel[15].addShapeBox(-26.0F, 0.0F, -7.0F, 10, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[15].setRotationPoint(-8.0F, -10.0F, -10.0F);
    (bodyModel[15]).rotateAngleZ = 0.07853982F;
    
    bodyModel[16].addShapeBox(-5.0F, 0.0F, 0.0F, 5, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F);
    bodyModel[16].setRotationPoint(12.0F, -11.0F, 10.0F);
    (bodyModel[16]).rotateAngleZ = 0.0588176F;
    
    bodyModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 17, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.03F, 0.0F, 0.0F, 0.03F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[17].setRotationPoint(12.0F, -11.0F, 10.0F);
    (bodyModel[17]).rotateAngleZ = 0.0588176F;
    
    bodyModel[18].addShapeBox(0.0F, 0.0F, -9.0F, 20, 6, 9, 0.0F, -7.0F, 0.0F, -5.0F, -8.0F, 0.0F, -5.0F, -7.0F, 0.0F, -3.0F, -4.0F, 0.0F, -0.5F, -5.0F, 0.6F, 0.0F, -5.0F, 0.25F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 1.0F, -3.0F);
    bodyModel[18].setRotationPoint(-8.0F, -16.0F, -7.0F);
    
    bodyModel[19].addShapeBox(-5.0F, 0.0F, -7.0F, 5, 1, 7, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[19].setRotationPoint(12.0F, -11.0F, -10.0F);
    (bodyModel[19]).rotateAngleZ = 0.0588176F;
    
    bodyModel[20].addShapeBox(0.0F, 0.0F, -7.0F, 17, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[20].setRotationPoint(12.0F, -11.0F, -10.0F);
    (bodyModel[20]).rotateAngleZ = 0.0588176F;
    
    bodyModel[21].addShapeBox(0.0F, 0.0F, -1.0F, 17, 7, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -5.9F, 0.0F, 0.9F, 0.0F, 0.0F, 0.9F, 0.0F, -0.5F, 0.0F, -5.9F, -0.5F);
    bodyModel[21].setRotationPoint(12.0F, -12.0F, -9.0F);
    
    bodyModel[22].addShapeBox(0.0F, 0.0F, 0.0F, 17, 7, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -5.9F, -0.5F, 0.9F, 0.0F, -0.5F, 0.9F, 0.0F, 0.0F, 0.0F, -5.9F, 0.0F);
    bodyModel[22].setRotationPoint(12.0F, -12.0F, 9.0F);
    
    bodyModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[23].setRotationPoint(29.0F, -12.0F, 10.0F);
    (bodyModel[23]).rotateAngleZ = -0.37524578F;
    
    bodyModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 4, 7, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.3F, -1.45F, -0.5F, -0.3F, -1.45F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, -0.5F, -3.0F, 0.0F, -0.5F, -3.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
    bodyModel[24].setRotationPoint(29.0F, -12.0F, 9.0F);
    
    bodyModel[25].addShapeBox(0.0F, 0.0F, -1.0F, 4, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, -1.45F, 0.0F, -0.3F, -1.45F, -0.5F, 0.0F, 0.0F, -0.5F, -0.9F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, -0.5F, -0.9F, 0.0F, -0.5F);
    bodyModel[25].setRotationPoint(29.0F, -12.0F, -9.0F);
    
    bodyModel[26].addShapeBox(0.0F, 0.0F, -7.0F, 4, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[26].setRotationPoint(29.0F, -12.0F, -10.0F);
    (bodyModel[26]).rotateAngleZ = -0.37524578F;
    
    bodyModel[27].addShapeBox(-3.0F, 0.0F, 0.0F, 3, 7, 1, 0.0F, 0.3F, -2.3F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.3F, -2.3F, 0.0F, -2.9F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -2.9F, 0.0F, 0.0F);
    bodyModel[27].setRotationPoint(-34.0F, -8.0F, 9.0F);
    
    bodyModel[28].addShapeBox(-4.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[28].setRotationPoint(-34.0F, -8.0F, 10.0F);
    (bodyModel[28]).rotateAngleZ = 0.61086524F;
    
    bodyModel[29].addShapeBox(-3.0F, 0.0F, -1.0F, 3, 8, 1, 0.0F, 0.3F, -2.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.3F, -2.3F, -0.5F, -2.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.9F, 0.0F, -0.5F);
    bodyModel[29].setRotationPoint(-34.0F, -8.0F, -9.0F);
    
    bodyModel[30].addShapeBox(-4.0F, 0.0F, -7.0F, 4, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[30].setRotationPoint(-34.0F, -8.0F, -10.0F);
    (bodyModel[30]).rotateAngleZ = 0.61086524F;
    
    bodyModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 31, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[31].setRotationPoint(-16.0F, -3.0F, 10.0F);
    
    bodyModel[32].addShapeBox(0.0F, 0.0F, -2.0F, 31, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[32].setRotationPoint(-16.0F, -3.0F, -10.0F);
    
    bodyModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 35, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[33].setRotationPoint(-18.0F, -2.0F, 10.0F);
    
    bodyModel[34].addShapeBox(0.0F, 0.0F, -1.0F, 35, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[34].setRotationPoint(-18.0F, -2.0F, -10.0F);
    
    bodyModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[35].setRotationPoint(17.0F, -3.0F, 10.0F);
    
    bodyModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[36].setRotationPoint(17.0F, 0.0F, 10.0F);
    
    bodyModel[37].addShapeBox(-6.0F, -1.0F, 0.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[37].setRotationPoint(18.0F, 1.0F, 10.0F);
    (bodyModel[37]).rotateAngleZ = 0.34906584F;
    
    bodyModel[38].addShapeBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[38].setRotationPoint(12.0F, 3.0F, 10.0F);
    
    bodyModel[39].addShapeBox(0.0F, -1.0F, 0.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[39].setRotationPoint(13.0F, 3.0F, 16.0F);
    
    bodyModel[40].addShapeBox(0.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[40].setRotationPoint(17.0F, 5.0F, 11.0F);
    
    bodyModel[41].addShapeBox(0.0F, -1.0F, 0.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[41].setRotationPoint(13.0F, 3.0F, 11.0F);
    
    bodyModel[42].addShapeBox(-4.0F, -1.0F, 0.0F, 4, 4, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[42].setRotationPoint(11.0F, 3.0F, 16.0F);
    
    bodyModel[43].addShapeBox(0.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[43].setRotationPoint(5.0F, 5.0F, 11.0F);
    
    bodyModel[44].addShapeBox(-4.0F, -1.0F, 0.0F, 4, 4, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[44].setRotationPoint(11.0F, 3.0F, 11.0F);
    
    bodyModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[45].setRotationPoint(-20.0F, -3.0F, 10.0F);
    
    bodyModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[46].setRotationPoint(-20.0F, 0.0F, 10.0F);
    
    bodyModel[47].addShapeBox(0.0F, -1.0F, 0.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[47].setRotationPoint(-19.0F, 1.0F, 10.0F);
    (bodyModel[47]).rotateAngleZ = -0.34906584F;
    
    bodyModel[48].addShapeBox(-1.0F, -1.0F, 0.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[48].setRotationPoint(-13.0F, 3.0F, 10.0F);
    
    bodyModel[49].addShapeBox(0.0F, -1.0F, 0.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[49].setRotationPoint(-12.0F, 3.0F, 16.0F);
    
    bodyModel[50].addShapeBox(0.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[50].setRotationPoint(-8.0F, 5.0F, 11.0F);
    
    bodyModel[51].addShapeBox(0.0F, -1.0F, 0.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[51].setRotationPoint(-12.0F, 3.0F, 11.0F);
    
    bodyModel[52].addShapeBox(-4.0F, -1.0F, 0.0F, 4, 4, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[52].setRotationPoint(-14.0F, 3.0F, 16.0F);
    
    bodyModel[53].addShapeBox(0.0F, -1.0F, 0.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[53].setRotationPoint(-20.0F, 5.0F, 11.0F);
    
    bodyModel[54].addShapeBox(-4.0F, -1.0F, 0.0F, 4, 4, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[54].setRotationPoint(-14.0F, 3.0F, 11.0F);
    
    bodyModel[55].addShapeBox(-1.0F, -1.0F, -17.0F, 2, 2, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[55].setRotationPoint(28.0F, -4.0F, 0.0F);
    
    bodyModel[56].addShapeBox(-1.0F, -1.0F, -17.0F, 2, 2, 34, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[56].setRotationPoint(-31.0F, 1.0F, 0.0F);
    
    bodyModel[57].addShapeBox(0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[57].setRotationPoint(17.0F, -3.0F, -10.0F);
    
    bodyModel[58].addShapeBox(0.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[58].setRotationPoint(17.0F, 0.0F, -10.0F);
    
    bodyModel[59].addShapeBox(-6.0F, -1.0F, -1.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[59].setRotationPoint(18.0F, 1.0F, -10.0F);
    (bodyModel[59]).rotateAngleZ = 0.34906584F;
    
    bodyModel[60].addShapeBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[60].setRotationPoint(12.0F, 3.0F, -10.0F);
    
    bodyModel[61].addShapeBox(0.0F, -1.0F, -1.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[61].setRotationPoint(13.0F, 3.0F, -11.0F);
    
    bodyModel[62].addShapeBox(0.0F, -1.0F, -1.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[62].setRotationPoint(13.0F, 3.0F, -16.0F);
    
    bodyModel[63].addShapeBox(0.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[63].setRotationPoint(17.0F, 5.0F, -11.0F);
    
    bodyModel[64].addShapeBox(-4.0F, -1.0F, -1.0F, 4, 4, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[64].setRotationPoint(11.0F, 3.0F, -16.0F);
    
    bodyModel[65].addShapeBox(-4.0F, -1.0F, -1.0F, 4, 4, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[65].setRotationPoint(11.0F, 3.0F, -11.0F);
    
    bodyModel[66].addShapeBox(0.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[66].setRotationPoint(5.0F, 5.0F, -11.0F);
    
    bodyModel[67].addShapeBox(0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[67].setRotationPoint(-20.0F, -3.0F, -10.0F);
    
    bodyModel[68].addShapeBox(0.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[68].setRotationPoint(-20.0F, 0.0F, -10.0F);
    
    bodyModel[69].addShapeBox(0.0F, -1.0F, -1.0F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[69].setRotationPoint(-19.0F, 1.0F, -10.0F);
    (bodyModel[69]).rotateAngleZ = -0.34906584F;
    
    bodyModel[70].addShapeBox(-1.0F, -1.0F, -7.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[70].setRotationPoint(-13.0F, 3.0F, -10.0F);
    
    bodyModel[71].addShapeBox(0.0F, -1.0F, -1.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[71].setRotationPoint(-12.0F, 3.0F, -16.0F);
    
    bodyModel[72].addShapeBox(0.0F, -1.0F, -1.0F, 4, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[72].setRotationPoint(-12.0F, 3.0F, -11.0F);
    
    bodyModel[73].addShapeBox(0.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[73].setRotationPoint(-8.0F, 5.0F, -11.0F);
    
    bodyModel[74].addShapeBox(-4.0F, -1.0F, -1.0F, 4, 4, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[74].setRotationPoint(-14.0F, 3.0F, -16.0F);
    
    bodyModel[75].addShapeBox(-4.0F, -1.0F, -1.0F, 4, 4, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[75].setRotationPoint(-14.0F, 3.0F, -11.0F);
    
    bodyModel[76].addShapeBox(0.0F, -1.0F, -6.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[76].setRotationPoint(-20.0F, 5.0F, -11.0F);
    
    bodyModel[77].addShapeBox(0.0F, 0.0F, -13.0F, 1, 1, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[77].setRotationPoint(10.0F, -4.5F, 0.0F);
    
    bodyModel[78].addShapeBox(0.0F, 0.0F, -13.0F, 1, 1, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[78].setRotationPoint(-12.0F, -3.5F, 0.0F);
    
    bodyModel[79].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 7, 7, 24, 2, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    bodyModel[79].setRotationPoint(28.0F, -4.0F, -9.6F);
    
    bodyModel[80].addShape3D(3.5F, -3.5F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 7, 7, 24, 2, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    bodyModel[80].setRotationPoint(28.0F, -4.0F, 9.6F);
    
    bodyModel[81].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[81].setRotationPoint(16.0F, -14.0F, 1.5F);
    
    bodyModel[82].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[82].setRotationPoint(16.0F, -15.0F, 1.5F);
    
    bodyModel[83].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[83].setRotationPoint(16.0F, -11.0F, 1.5F);
    
    bodyModel[84].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[84].setRotationPoint(16.0F, -13.5F, 3.5F);
    
    bodyModel[85].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -2.0F, 0.0F, -0.4F, -2.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F);
    bodyModel[85].setRotationPoint(16.0F, -12.5F, 3.5F);
    
    bodyModel[86].addShapeBox(-27.0F, -4.0F, -6.5F, 11, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[86].setRotationPoint(-8.0F, -10.0F, -10.0F);
    (bodyModel[86]).rotateAngleZ = 0.07853982F;
    
    bodyModel[87].addShapeBox(-27.0F, -5.0F, -6.5F, 11, 1, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[87].setRotationPoint(-8.0F, -10.0F, -10.0F);
    (bodyModel[87]).rotateAngleZ = 0.07853982F;
    
    bodyModel[88].addShapeBox(-28.5F, -3.0F, -4.5F, 2, 2, 2, 0.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -1.0F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -1.0F);
    bodyModel[88].setRotationPoint(-8.0F, -10.0F, -10.0F);
    (bodyModel[88]).rotateAngleZ = 0.07853982F;
    
    bodyModel[89].addShapeBox(-28.5F, -3.0F, -6.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, 0.0F, -0.25F, -0.5F, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    bodyModel[89].setRotationPoint(-8.0F, -10.0F, -10.0F);
    (bodyModel[89]).rotateAngleZ = 0.07853982F;
    
    bodyModel[90].addShapeBox(-6.0F, 0.0F, -2.25F, 6, 2, 2, 0.0F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F);
    bodyModel[90].setRotationPoint(-10.0F, -9.0F, -10.0F);
    
    bodyModel[91].addShapeBox(-16.0F, -4.5F, -6.0F, 2, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[91].setRotationPoint(-8.0F, -10.0F, -10.0F);
    (bodyModel[91]).rotateAngleZ = 0.07853982F;
    
    bodyModel[92].addShapeBox(-3.0F, 0.0F, -2.0F, 3, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[92].setRotationPoint(-20.0F, -12.0F, -12.5F);
    (bodyModel[92]).rotateAngleZ = 0.05235988F;
    
    bodyModel[93].addShapeBox(-4.0F, 0.0F, -4.0F, 4, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.25F, 0.0F, -3.0F, 0.25F, 0.0F, 0.0F, -2.0F, -0.1F, -3.0F, 0.0F, 0.0F, 0.0F, -2.25F, 0.0F, 0.0F, 0.25F, -0.1F, -3.0F, -2.0F);
    bodyModel[93].setRotationPoint(-16.0F, -12.0F, -10.5F);
    
    bodyModel[94].addShapeBox(-7.0F, -5.0F, 1.0F, 7, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[94].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[94]).rotateAngleZ = 0.07853982F;
    
    bodyModel[95].addShapeBox(-26.0F, -1.0F, 4.0F, 16, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    bodyModel[95].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[95]).rotateAngleZ = 0.07853982F;
    
    bodyModel[96].addShapeBox(-11.0F, -0.5F, 2.5F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[96].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[96]).rotateAngleZ = 0.07853982F;
    
    bodyModel[97].addShapeBox(-9.0F, -0.5F, 2.5F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[97].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[97]).rotateAngleZ = 0.07853982F;
    
    bodyModel[98].addShapeBox(-15.0F, -1.0F, 4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[98].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[98]).rotateAngleZ = 0.07853982F;
    
    bodyModel[99].addShapeBox(-25.0F, -1.0F, 4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[99].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[99]).rotateAngleZ = 0.07853982F;
    
    bodyModel[100].addShapeBox(-15.0F, -2.0F, 3.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[100].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[100]).rotateAngleZ = 0.07853982F;
    
    bodyModel[101].addShapeBox(-25.0F, -2.0F, 3.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[101].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[101]).rotateAngleZ = 0.07853982F;
    
    bodyModel[102].addShapeBox(-26.5F, -2.0F, 3.0F, 15, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    bodyModel[102].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[102]).rotateAngleZ = 0.07853982F;
    
    bodyModel[103].addShapeBox(-26.5F, -2.0F, 0.5F, 1, 1, 6, 0.0F, -0.5F, -0.1F, -2.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, -2.5F, -0.5F, -0.1F, -2.5F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, -0.5F, -0.1F, -2.5F);
    bodyModel[103].setRotationPoint(-8.0F, -10.0F, 10.0F);
    (bodyModel[103]).rotateAngleZ = 0.07853982F;
    
    bodyModel[104].addShapeBox(-8.0F, -4.0F, 0.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[104].setRotationPoint(-8.0F, -10.0F, 10.0F);
    
    bodyModel[105].addShapeBox(-17.0F, -2.0F, 0.5F, 9, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[105].setRotationPoint(-8.0F, -10.0F, 10.0F);
    
    bodyModel[106].addShapeBox(-17.0F, -3.0F, 0.5F, 5, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[106].setRotationPoint(-8.0F, -10.0F, 10.0F);
    
    bodyModel[107].addShapeBox(-14.0F, -3.5F, 0.0F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[107].setRotationPoint(-9.0F, -10.0F, 10.0F);
    
    bodyModel[108].addShapeBox(-18.0F, -3.0F, 0.5F, 1, 3, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    bodyModel[108].setRotationPoint(-8.0F, -10.0F, 10.0F);
    
    bodyModel[109].addShapeBox(-15.5F, -0.2F, -6.0F, 15, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[109].setRotationPoint(-8.0F, -16.0F, 0.0F);
    (bodyModel[109]).rotateAngleZ = 0.12217305F;
    
    bodyModel[110].addShapeBox(-11.5F, -0.2F, 0.0F, 6, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[110].setRotationPoint(-8.0F, -16.0F, 0.0F);
    (bodyModel[110]).rotateAngleZ = 0.12217305F;
    
    bodyModel[111].addShapeBox(-0.8F, 2.0F, -3.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[111].setRotationPoint(14.0F, -16.0F, -4.0F);
    (bodyModel[111]).rotateAngleZ = 0.27925268F;
    
    bodyModel[112].addShapeBox(-0.8F, 1.0F, -2.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[112].setRotationPoint(14.0F, -16.0F, -4.0F);
    (bodyModel[112]).rotateAngleZ = 0.27925268F;
    
    bodyModel[113].addShapeBox(-0.8F, 0.0F, -2.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[113].setRotationPoint(19.0F, -12.0F, -7.0F);
    
    bodyModel[114].addShapeBox(-0.8F, 0.0F, -2.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[114].setRotationPoint(19.0F, -12.0F, 9.0F);
    
    bodyModel[115].addShapeBox(-0.8F, 0.0F, -2.0F, 1, 2, 2, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F);
    bodyModel[115].setRotationPoint(18.0F, -12.0F, -7.0F);
    
    bodyModel[116].addShapeBox(-0.8F, 0.0F, -2.0F, 1, 2, 2, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F);
    bodyModel[116].setRotationPoint(18.0F, -12.0F, 9.0F);
    
    bodyModel[117].addShapeBox(-0.8F, 0.0F, -1.5F, 1, 3, 1, 0.0F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F);
    bodyModel[117].setRotationPoint(18.7F, -11.0F, -7.0F);
    
    bodyModel[118].addShapeBox(-0.8F, 0.0F, -1.5F, 1, 3, 1, 0.0F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F);
    bodyModel[118].setRotationPoint(18.7F, -11.0F, 9.0F);
    
    bodyModel[119].addShapeBox(11.0F, -0.2F, -8.0F, 6, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[119].setRotationPoint(12.0F, -11.0F, 0.0F);
    (bodyModel[119]).rotateAngleZ = -0.31939524F;
    
    bodyModel[120].addShapeBox(11.0F, -0.2F, 2.0F, 6, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[120].setRotationPoint(12.0F, -11.0F, 0.0F);
    (bodyModel[120]).rotateAngleZ = -0.31939524F;
    
    bodyModel[121].addShapeBox(16.2F, -0.2F, -1.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[121].setRotationPoint(12.0F, -11.0F, 0.0F);
    (bodyModel[121]).rotateAngleZ = -0.31939524F;
    
    bodyModel[122].addShapeBox(17.2F, 0.8F, -0.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[122].setRotationPoint(12.0F, -11.0F, 0.0F);
    (bodyModel[122]).rotateAngleZ = -0.31939524F;
    
    bodyModel[123].addShapeBox(-0.8F, 0.0F, -1.0F, 1, 3, 1, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    bodyModel[123].setRotationPoint(30.6F, -4.0F, -0.5F);
    
    bodyModel[124].addShapeBox(-0.8F, 0.0F, 0.0F, 1, 3, 1, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F);
    bodyModel[124].setRotationPoint(30.6F, -4.0F, 0.5F);
    
    bodyModel[125].addShapeBox(-0.8F, 2.0F, -0.5F, 1, 1, 1, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    bodyModel[125].setRotationPoint(30.6F, -4.0F, 0.0F);
    
    bodyModel[126].addShapeBox(0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[126].setRotationPoint(-35.0F, 0.0F, 0.0F);
    
    bodyModel[127].addShapeBox(0.0F, 0.0F, -1.0F, 1, 3, 1, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    bodyModel[127].setRotationPoint(-35.0F, 1.0F, -0.5F);
    
    bodyModel[128].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F);
    bodyModel[128].setRotationPoint(-35.0F, 1.0F, 0.5F);
    
    bodyModel[129].addShapeBox(0.0F, 0.0F, -0.5F, 1, 1, 1, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    bodyModel[129].setRotationPoint(-35.0F, 3.0F, 0.0F);

    
    turretModel = new ModelRendererTurbo[23];
    turretModel[0] = new ModelRendererTurbo(this, 75, 103, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 33, 103, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 68, 127, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 1, 118, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 1, 96, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 40, 127, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 288, 122, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 249, 154, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 241, 154, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 111, 90, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 97, 147, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 158, 133, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 128, 133, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 65, 147, textureX, textureY);
    turretModel[14] = new ModelRendererTurbo(this, 32, 147, textureX, textureY);
    turretModel[15] = new ModelRendererTurbo(this, 1, 144, textureX, textureY);
    turretModel[16] = new ModelRendererTurbo(this, 307, 150, textureX, textureY);
    turretModel[17] = new ModelRendererTurbo(this, 307, 146, textureX, textureY);
    turretModel[18] = new ModelRendererTurbo(this, 299, 141, textureX, textureY);
    turretModel[19] = new ModelRendererTurbo(this, 299, 138, textureX, textureY);
    turretModel[20] = new ModelRendererTurbo(this, 91, 161, textureX, textureY);
    turretModel[21] = new ModelRendererTurbo(this, 176, 132, textureX, textureY);
    turretModel[22] = new ModelRendererTurbo(this, 396, 90, textureX, textureY);
    
    turretModel[0].addShapeBox(-1.0F, -7.0F, -7.5F, 2, 7, 15, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[0].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[1].addShapeBox(1.0F, -7.0F, -7.5F, 5, 7, 15, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretModel[1].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[2].addShapeBox(6.0F, -8.0F, -5.5F, 3, 7, 11, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, -1.4F, -2.0F, -0.5F, -1.4F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, -2.0F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretModel[2].setRotationPoint(1.0F, -15.0F, 1.0F);
    
    turretModel[3].addShapeBox(-4.0F, -7.0F, -7.5F, 3, 7, 15, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    turretModel[3].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[4].addShapeBox(-6.0F, -7.0F, -6.5F, 2, 7, 13, 0.0F, -1.0F, 0.0F, -1.2F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, -2.0F);
    turretModel[4].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[5].addShapeBox(-9.0F, -7.0F, -5.5F, 3, 7, 10, 0.0F, 0.0F, 0.0F, -3.0F, 1.0F, 0.0F, -0.2F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -6.9F, 1.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, -6.9F);
    turretModel[5].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[6].addShapeBox(9.0F, -2.0F, -3.0F, 1, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[6].setRotationPoint(1.0F, -15.0F, 1.0F);
    
    turretModel[7].addShapeBox(8.0F, -6.0F, -3.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    turretModel[7].setRotationPoint(1.0F, -15.0F, 1.0F);
    
    turretModel[8].addShapeBox(8.0F, -6.0F, 2.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[8].setRotationPoint(1.0F, -15.0F, 1.0F);
    
    turretModel[9].addShapeBox(8.0F, -7.0F, -3.0F, 2, 1, 6, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[9].setRotationPoint(1.0F, -15.0F, 1.0F);
    
    turretModel[10].addShapeBox(-2.0F, -9.0F, -5.0F, 4, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F);
    turretModel[10].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[11].addShapeBox(2.0F, -9.0F, -5.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F);
    turretModel[11].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[12].addShapeBox(-5.0F, -9.0F, -5.0F, 3, 2, 10, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, -3.0F);
    turretModel[12].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[13].addShapeBox(-2.0F, -10.0F, -5.5F, 4, 1, 11, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[13].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[14].addShapeBox(2.0F, -10.0F, -5.5F, 4, 1, 11, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -3.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    turretModel[14].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[15].addShapeBox(-6.0F, -10.0F, -5.5F, 4, 1, 11, 0.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -3.0F, -0.5F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -3.0F);
    turretModel[15].setRotationPoint(1.0F, -16.0F, 1.0F);
    
    turretModel[16].addShapeBox(8.8F, -4.5F, -4.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[16].setRotationPoint(1.0F, -15.0F, 1.0F);
    
    turretModel[17].addShapeBox(8.8F, -4.5F, 3.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    turretModel[17].setRotationPoint(1.0F, -15.0F, 1.0F);
    
    turretModel[18].addShapeBox(0.0F, 1.0F, -0.5F, 4, 2, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[18].setRotationPoint(-8.0F, -21.5F, -2.0F);
    (turretModel[18]).rotateAngleY = -0.61086524F;
    
    turretModel[19].addShapeBox(0.0F, 0.0F, -0.5F, 4, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[19].setRotationPoint(-8.0F, -21.5F, -2.0F);
    (turretModel[19]).rotateAngleY = -0.61086524F;
    
    turretModel[20].addShapeBox(0.0F, 3.0F, -0.5F, 4, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    turretModel[20].setRotationPoint(-8.0F, -21.5F, -2.0F);
    (turretModel[20]).rotateAngleY = -0.61086524F;
    
    turretModel[21].addShapeBox(1.5F, 1.0F, -8.5F, 1, 1, 8, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[21].setRotationPoint(-8.0F, -21.5F, -2.0F);
    (turretModel[21]).rotateAngleY = -0.61086524F;
    
    turretModel[22].addShapeBox(1.5F, 2.0F, -8.5F, 1, 1, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, -2.0F, -0.4F, 0.0F, -2.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F);
    turretModel[22].setRotationPoint(-8.0F, -21.5F, -2.0F);
    (turretModel[22]).rotateAngleY = -0.61086524F;

    
    barrelModel = new ModelRendererTurbo[4];
    barrelModel[0] = new ModelRendererTurbo(this, 127, 150, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 225, 154, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 288, 138, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 35, 164, textureX, textureY);
    
    barrelModel[0].addShapeBox(-1.0F, -2.0F, -2.5F, 2, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[0].setRotationPoint(10.0F, -19.0F, 1.0F);
    
    barrelModel[1].addShapeBox(-1.0F, -1.5F, -2.0F, 5, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[1].setRotationPoint(10.0F, -19.0F, 1.0F);
    
    barrelModel[2].addShapeBox(4.0F, -1.5F, -2.0F, 3, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[2].setRotationPoint(10.0F, -19.0F, 1.0F);
    
    barrelModel[3].addShapeBox(0.0F, -0.5F, -1.5F, 17, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.2F);
    barrelModel[3].setRotationPoint(10.0F, -19.0F, 1.0F);

    
    leftTrackWheelModels = new ModelRendererTurbo[8];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 105, 73, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 153, 73, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 185, 73, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 217, 73, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 249, 73, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 281, 73, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 449, 41, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 129, 73, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[0].setRotationPoint(18.0F, 5.0F, 16.0F);
    
    leftTrackWheelModels[1].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[1].setRotationPoint(6.0F, 5.0F, 16.0F);
    
    leftTrackWheelModels[2].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[2].setRotationPoint(-7.0F, 5.0F, 16.0F);
    
    leftTrackWheelModels[3].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[3].setRotationPoint(-19.0F, 5.0F, 16.0F);
    
    leftTrackWheelModels[4].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[4].setRotationPoint(28.0F, -4.0F, 16.0F);
    
    leftTrackWheelModels[5].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[5].setRotationPoint(-31.0F, 1.0F, 16.0F);
    
    leftTrackWheelModels[6].addShape3D(1.5F, -1.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[6].setRotationPoint(10.5F, -4.0F, 14.0F);
    
    leftTrackWheelModels[7].addShape3D(1.5F, -1.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[7].setRotationPoint(-11.5F, -3.0F, 14.0F);

    
    rightTrackWheelModels = new ModelRendererTurbo[8];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 313, 73, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 409, 73, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 1, 81, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 177, 89, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 209, 89, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 241, 89, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 337, 73, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 353, 73, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[0].setRotationPoint(18.0F, 5.0F, -16.0F);
    
    rightTrackWheelModels[1].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[1].setRotationPoint(6.0F, 5.0F, -16.0F);
    
    rightTrackWheelModels[2].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[2].setRotationPoint(-7.0F, 5.0F, -16.0F);
    
    rightTrackWheelModels[3].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[3].setRotationPoint(-19.0F, 5.0F, -16.0F);
    
    rightTrackWheelModels[4].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[4].setRotationPoint(28.0F, -4.0F, -16.0F);
    
    rightTrackWheelModels[5].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[5].setRotationPoint(-31.0F, 1.0F, -16.0F);
    
    rightTrackWheelModels[6].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[6].setRotationPoint(10.5F, -4.0F, -14.0F);
    
    rightTrackWheelModels[7].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[7].setRotationPoint(-11.5F, -3.0F, -14.0F);

    
    leftTrackModel = new ModelRendererTurbo[15];
    leftTrackModel[0] = new ModelRendererTurbo(this, 245, 145, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 254, 136, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 191, 149, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 380, 113, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 173, 113, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 175, 149, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 159, 149, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 298, 88, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 270, 113, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 232, 136, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 269, 103, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 377, 103, textureX, textureY);
    leftTrackModel[12] = new ModelRendererTurbo(this, 329, 113, textureX, textureY);
    leftTrackModel[13] = new ModelRendererTurbo(this, 172, 103, textureX, textureY);
    leftTrackModel[14] = new ModelRendererTurbo(this, 431, 113, textureX, textureY);
    
    leftTrackModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[0].setRotationPoint(26.0F, -9.0F, 11.0F);
    
    leftTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[1].setRotationPoint(30.0F, -9.0F, 11.0F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[2].setRotationPoint(32.0F, -6.0F, 11.0F);
    
    leftTrackModel[3].addShapeBox(0.0F, -1.0F, 0.0F, 18, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[3].setRotationPoint(20.0F, 10.0F, 11.0F);
    (leftTrackModel[3]).rotateAngleZ = 0.7452556F;
    
    leftTrackModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 41, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[4].setRotationPoint(-21.0F, 9.0F, 11.0F);
    
    leftTrackModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[5].setRotationPoint(-36.0F, -1.0F, 11.0F);
    
    leftTrackModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 1, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
    leftTrackModel[6].setRotationPoint(-36.0F, 3.0F, 11.0F);
    (leftTrackModel[6]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[7].addShapeBox(0.0F, -1.0F, 0.0F, 13, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[7].setRotationPoint(-33.0F, 6.0F, 11.0F);
    (leftTrackModel[7]).rotateAngleZ = -0.3228859F;
    
    leftTrackModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 21, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[8].setRotationPoint(-33.0F, -4.0F, 11.0F);
    (leftTrackModel[8]).rotateAngleZ = 0.06981317F;
    
    leftTrackModel[9].addShapeBox(0.0F, -1.0F, 0.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[9].setRotationPoint(-33.0F, -4.0F, 11.0F);
    (leftTrackModel[9]).rotateAngleZ = -2.3561945F;
    
    leftTrackModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 22, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[10].setRotationPoint(-12.0F, -5.5F, 11.0F);
    (leftTrackModel[10]).rotateAngleZ = 0.04537856F;
    
    leftTrackModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 17, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[11].setRotationPoint(10.0F, -6.5F, 11.0F);
    (leftTrackModel[11]).rotateAngleZ = 0.1553343F;
    
    leftTrackModel[12].addShapeBox(0.0F, -1.0F, -6.0F, 18, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[12].setRotationPoint(20.0F, 10.0F, -11.0F);
    (leftTrackModel[12]).rotateAngleZ = 0.7452556F;
    
    leftTrackModel[13].addShapeBox(0.0F, 0.0F, -6.0F, 41, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[13].setRotationPoint(-21.0F, 9.0F, -11.0F);
    
    leftTrackModel[14].addShapeBox(0.0F, -1.0F, -6.0F, 13, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, -0.33F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[14].setRotationPoint(-33.0F, 6.0F, -11.0F);
    (leftTrackModel[14]).rotateAngleZ = -0.3228859F;

    
    rightTrackModel = new ModelRendererTurbo[9];
    rightTrackModel[0] = new ModelRendererTurbo(this, 210, 136, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 223, 145, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 143, 149, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 96, 87, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 81, 82, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 201, 145, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 114, 113, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 113, 103, textureX, textureY);
    rightTrackModel[8] = new ModelRendererTurbo(this, 328, 103, textureX, textureY);
    
    rightTrackModel[0].addShapeBox(0.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[0].setRotationPoint(26.0F, -9.0F, -11.0F);
    
    rightTrackModel[1].addShapeBox(0.0F, 0.0F, -6.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[1].setRotationPoint(30.0F, -9.0F, -11.0F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2].addShapeBox(0.0F, 0.0F, -6.0F, 1, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[2].setRotationPoint(32.0F, -6.0F, -11.0F);
    
    rightTrackModel[3].addShapeBox(0.0F, 0.0F, -6.0F, 1, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F);
    rightTrackModel[3].setRotationPoint(-36.0F, 3.0F, -11.0F);
    (rightTrackModel[3]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[4].addShapeBox(0.0F, 0.0F, -6.0F, 1, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[4].setRotationPoint(-36.0F, -1.0F, -11.0F);
    
    rightTrackModel[5].addShapeBox(0.0F, -1.0F, -6.0F, 4, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[5].setRotationPoint(-33.0F, -4.0F, -11.0F);
    (rightTrackModel[5]).rotateAngleZ = -2.3561945F;
    
    rightTrackModel[6].addShapeBox(0.0F, 0.0F, -6.0F, 21, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[6].setRotationPoint(-33.0F, -4.0F, -11.0F);
    (rightTrackModel[6]).rotateAngleZ = 0.06981317F;
    
    rightTrackModel[7].addShapeBox(0.0F, 0.0F, -6.0F, 22, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[7].setRotationPoint(-12.0F, -5.5F, -11.0F);
    (rightTrackModel[7]).rotateAngleZ = 0.04537856F;
    
    rightTrackModel[8].addShapeBox(0.0F, 0.0F, -6.0F, 17, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[8].setRotationPoint(10.0F, -6.5F, -11.0F);
    (rightTrackModel[8]).rotateAngleZ = 0.1553343F;


    
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
