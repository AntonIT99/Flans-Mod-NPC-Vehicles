package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;


public class ModelZis3
  extends ModelVehicle
{
  int textureX = 512;
  int textureY = 256;

  
  public ModelZis3() {
    bodyModel = new ModelRendererTurbo[104];
    bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 9, 1, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 41, 1, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 73, 1, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 105, 1, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 121, 1, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 137, 1, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 153, 1, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 169, 1, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 185, 1, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 201, 1, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 217, 1, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 25, 1, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 249, 1, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 265, 1, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 273, 1, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 281, 1, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 289, 1, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 177, 1, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 193, 1, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 209, 1, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 321, 1, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 337, 1, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 353, 1, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 369, 1, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 385, 1, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 401, 1, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 225, 9, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 345, 1, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 425, 1, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 449, 1, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 473, 1, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 1, 9, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 377, 1, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 393, 1, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 417, 1, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 441, 1, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 465, 1, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 425, 1, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 473, 1, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 489, 1, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 497, 1, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 17, 9, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 505, 1, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 1, 9, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 41, 9, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 113, 9, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 49, 9, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 129, 9, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 73, 9, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 121, 9, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 145, 9, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 161, 9, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 185, 9, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 329, 9, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 345, 9, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 361, 9, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 441, 9, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 489, 9, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 1, 17, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 41, 17, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 89, 17, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 105, 17, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 129, 17, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 201, 17, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 225, 17, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 249, 17, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 265, 17, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 281, 17, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 305, 17, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 345, 17, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 369, 17, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 393, 17, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 417, 17, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 441, 17, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 465, 17, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 201, 9, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 465, 9, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 73, 17, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 81, 17, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 153, 17, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 489, 17, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 497, 17, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 505, 17, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 1, 25, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 9, 25, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 89, 25, textureX, textureY);
    bodyModel[94] = new ModelRendererTurbo(this, 281, 25, textureX, textureY);
    bodyModel[95] = new ModelRendererTurbo(this, 385, 25, textureX, textureY);
    bodyModel[96] = new ModelRendererTurbo(this, 1, 33, textureX, textureY);
    bodyModel[97] = new ModelRendererTurbo(this, 105, 33, textureX, textureY);
    bodyModel[98] = new ModelRendererTurbo(this, 209, 25, textureX, textureY);
    bodyModel[99] = new ModelRendererTurbo(this, 489, 25, textureX, textureY);
    bodyModel[100] = new ModelRendererTurbo(this, 225, 33, textureX, textureY);
    bodyModel[101] = new ModelRendererTurbo(this, 241, 33, textureX, textureY);
    bodyModel[102] = new ModelRendererTurbo(this, 49, 49, textureX, textureY);
    bodyModel[103] = new ModelRendererTurbo(this, 9, 57, textureX, textureY);
    
    bodyModel[0].addShapeBox(-0.5F, 0.0F, -15.0F, 1, 1, 30, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F, 0.1F, 0.1F, 0.0F);
    bodyModel[0].setRotationPoint(3.0F, 2.0F, 0.0F);
    
    bodyModel[1].addShapeBox(0.25F, 0.5F, -7.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(3.0F, 2.0F, 0.0F);
    
    bodyModel[2].addShapeBox(-0.5F, 1.0F, -11.0F, 1, 4, 22, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(3.0F, 2.0F, 0.0F);
    
    bodyModel[3].addShapeBox(0.25F, 0.5F, 6.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[3].setRotationPoint(3.0F, 2.0F, 0.0F);
    
    bodyModel[4].addShapeBox(-0.5F, 1.0F, -13.0F, 1, 4, 2, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    bodyModel[4].setRotationPoint(3.0F, 2.0F, 0.0F);
    
    bodyModel[5].addShapeBox(-0.5F, 1.0F, 11.0F, 1, 4, 2, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, -0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    bodyModel[5].setRotationPoint(3.0F, 2.0F, 0.0F);
    
    bodyModel[6].addBox(-0.5F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
    bodyModel[6].setRotationPoint(3.0F, 0.0F, -13.0F);
    
    bodyModel[7].addBox(-0.5F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
    bodyModel[7].setRotationPoint(3.0F, 0.0F, 11.0F);
    
    bodyModel[8].addBox(-3.5F, -1.0F, -5.0F, 3, 3, 10, 0.0F);
    bodyModel[8].setRotationPoint(3.0F, 2.0F, 0.0F);
    
    bodyModel[9].addShapeBox(-4.5F, -1.0F, 0.0F, 4, 1, 3, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[9].setRotationPoint(3.0F, 2.0F, 5.0F);
    
    bodyModel[10].addShapeBox(-4.5F, -1.0F, 0.0F, 4, 1, 3, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[10].setRotationPoint(3.0F, 4.0F, 5.0F);
    
    bodyModel[11].addShapeBox(-4.5F, -1.0F, -3.0F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
    bodyModel[11].setRotationPoint(3.0F, 2.0F, -5.0F);
    
    bodyModel[12].addShapeBox(-4.5F, -1.0F, -3.0F, 4, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[12].setRotationPoint(3.0F, 4.0F, -5.0F);
    
    bodyModel[13].addShapeBox(-3.5F, -1.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F);
    bodyModel[13].setRotationPoint(2.0F, 2.0F, 8.0F);
    
    bodyModel[14].addShapeBox(-3.5F, -1.0F, 0.0F, 3, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[14].setRotationPoint(2.0F, 4.0F, 8.0F);
    
    bodyModel[15].addShapeBox(-3.5F, -1.0F, 0.0F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[15].setRotationPoint(2.0F, 2.0F, -9.0F);
    
    bodyModel[16].addShapeBox(-3.5F, -1.0F, 0.0F, 3, 1, 1, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[16].setRotationPoint(2.0F, 4.0F, -9.0F);
    
    bodyModel[17].addShapeBox(-1.5F, 0.0F, 0.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[17].setRotationPoint(1.0F, 0.0F, 7.0F);
    
    bodyModel[18].addBox(-0.5F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    bodyModel[18].setRotationPoint(1.0F, 2.0F, 11.0F);
    
    bodyModel[19].addBox(-0.5F, 0.0F, -2.0F, 2, 2, 2, 0.0F);
    bodyModel[19].setRotationPoint(1.0F, 2.0F, -11.0F);
    
    bodyModel[20].addShapeBox(-0.5F, 0.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, -1.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[20].setRotationPoint(1.0F, 0.0F, 11.5F);
    
    bodyModel[21].addShapeBox(-0.5F, 0.0F, -1.0F, 2, 2, 1, 0.0F, 0.0F, -1.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[21].setRotationPoint(1.0F, 0.0F, -11.5F);
    
    bodyModel[22].addShapeBox(-1.5F, 0.0F, -1.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[22].setRotationPoint(1.0F, 0.0F, -7.0F);
    
    bodyModel[23].addShapeBox(-0.5F, 0.0F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[23].setRotationPoint(0.0F, 0.2F, 7.5F);
    (bodyModel[23]).rotateAngleY = -0.34906584F;
    
    bodyModel[24].addShapeBox(-1.5F, 0.0F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[24].setRotationPoint(0.0F, 0.2F, 7.5F);
    (bodyModel[24]).rotateAngleY = -0.34906584F;
    
    bodyModel[25].addShapeBox(-0.5F, 0.2F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[25].setRotationPoint(0.0F, 3.8F, 7.5F);
    (bodyModel[25]).rotateAngleY = -0.34906584F;
    
    bodyModel[26].addShapeBox(-1.5F, 0.2F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[26].setRotationPoint(0.0F, 3.8F, 7.5F);
    (bodyModel[26]).rotateAngleY = -0.34906584F;
    
    bodyModel[27].addShapeBox(-2.5F, -0.2F, -2.0F, 1, 5, 4, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[27].setRotationPoint(0.0F, 0.2F, 7.5F);
    (bodyModel[27]).rotateAngleY = -0.34906584F;
    
    bodyModel[28].addShapeBox(-0.5F, 0.0F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[28].setRotationPoint(0.0F, 0.2F, -7.5F);
    (bodyModel[28]).rotateAngleY = 0.34906584F;
    
    bodyModel[29].addShapeBox(-1.5F, 0.0F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[29].setRotationPoint(0.0F, 0.2F, -7.5F);
    (bodyModel[29]).rotateAngleY = 0.34906584F;
    
    bodyModel[30].addShapeBox(-0.5F, 0.2F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, -1.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[30].setRotationPoint(0.0F, 3.8F, -7.5F);
    (bodyModel[30]).rotateAngleY = 0.34906584F;
    
    bodyModel[31].addShapeBox(-1.5F, 0.2F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[31].setRotationPoint(0.0F, 3.8F, -7.5F);
    (bodyModel[31]).rotateAngleY = 0.34906584F;
    
    bodyModel[32].addShapeBox(-2.5F, -0.2F, -2.0F, 1, 5, 4, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[32].setRotationPoint(0.0F, 0.2F, -7.5F);
    (bodyModel[32]).rotateAngleY = 0.34906584F;
    
    bodyModel[33].addShapeBox(-5.5F, -1.0F, -3.5F, 2, 3, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[33].setRotationPoint(3.0F, 2.0F, 0.0F);
    
    bodyModel[34].addShapeBox(-50.5F, -1.0F, -1.0F, 49, 2, 2, 0.0F, 0.0F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F);
    bodyModel[34].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[34]).rotateAngleY = -0.34906584F;
    (bodyModel[34]).rotateAngleZ = 0.05235988F;
    
    bodyModel[35].addShapeBox(-48.5F, 1.0F, -0.5F, 4, 1, 1, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.6F, 0.5F, 0.0F);
    bodyModel[35].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[35]).rotateAngleY = -0.34906584F;
    (bodyModel[35]).rotateAngleZ = 0.05235988F;
    
    bodyModel[36].addShapeBox(-50.5F, 2.0F, -3.0F, 3, 3, 6, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[36].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[36]).rotateAngleY = -0.34906584F;
    (bodyModel[36]).rotateAngleZ = 0.05235988F;
    
    bodyModel[37].addShapeBox(-49.5F, 1.0F, -3.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
    bodyModel[37].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[37]).rotateAngleY = -0.34906584F;
    (bodyModel[37]).rotateAngleZ = 0.05235988F;
    
    bodyModel[38].addShapeBox(-50.5F, 2.0F, -3.0F, 3, 3, 6, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[38].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[38]).rotateAngleY = 0.34906584F;
    (bodyModel[38]).rotateAngleZ = 0.05235988F;
    
    bodyModel[39].addShapeBox(-49.5F, 1.0F, -3.0F, 2, 1, 6, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
    bodyModel[39].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[39]).rotateAngleY = 0.34906584F;
    (bodyModel[39]).rotateAngleZ = 0.05235988F;
    
    bodyModel[40].addShapeBox(-48.5F, 1.0F, -0.5F, 4, 1, 1, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.6F, 0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -0.6F, 0.5F, 0.0F);
    bodyModel[40].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[40]).rotateAngleY = 0.34906584F;
    (bodyModel[40]).rotateAngleZ = 0.05235988F;
    
    bodyModel[41].addShapeBox(-47.5F, -2.0F, -0.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[41].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[41]).rotateAngleY = -0.34906584F;
    (bodyModel[41]).rotateAngleZ = 0.05235988F;
    
    bodyModel[42].addShapeBox(-42.5F, -5.0F, -0.5F, 2, 4, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[42].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[42]).rotateAngleY = -0.34906584F;
    (bodyModel[42]).rotateAngleZ = 0.05235988F;
    
    bodyModel[43].addShapeBox(-47.5F, -2.0F, -0.5F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[43].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[43]).rotateAngleY = 0.34906584F;
    (bodyModel[43]).rotateAngleZ = 0.05235988F;
    
    bodyModel[44].addShapeBox(-42.5F, -5.0F, -0.5F, 2, 4, 1, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[44].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[44]).rotateAngleY = 0.34906584F;
    (bodyModel[44]).rotateAngleZ = 0.05235988F;
    
    bodyModel[45].addShapeBox(-45.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F);
    bodyModel[45].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[45]).rotateAngleY = -0.34906584F;
    (bodyModel[45]).rotateAngleZ = 0.05235988F;
    
    bodyModel[46].addShapeBox(-45.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F, -0.25F, 0.2F, 0.2F);
    bodyModel[46].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[46]).rotateAngleY = 0.34906584F;
    (bodyModel[46]).rotateAngleZ = 0.05235988F;
    
    bodyModel[47].addShapeBox(-48.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    bodyModel[47].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[47]).rotateAngleY = -0.34906584F;
    (bodyModel[47]).rotateAngleZ = 0.05235988F;
    
    bodyModel[48].addShapeBox(-48.5F, -2.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    bodyModel[48].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[48]).rotateAngleY = 0.34906584F;
    (bodyModel[48]).rotateAngleZ = 0.05235988F;
    
    bodyModel[49].addShapeBox(-50.5F, -0.7F, -2.0F, 5, 1, 1, 0.0F, -1.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -2.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[49].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[49]).rotateAngleY = -0.34906584F;
    (bodyModel[49]).rotateAngleZ = 0.05235988F;
    
    bodyModel[50].addShapeBox(-49.5F, -0.7F, -3.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[50].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[50]).rotateAngleY = -0.34906584F;
    (bodyModel[50]).rotateAngleZ = 0.05235988F;
    
    bodyModel[51].addShapeBox(-49.5F, -0.7F, -5.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[51].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[51]).rotateAngleY = -0.34906584F;
    (bodyModel[51]).rotateAngleZ = 0.05235988F;
    
    bodyModel[52].addShapeBox(-50.5F, -0.7F, -5.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F);
    bodyModel[52].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[52]).rotateAngleY = -0.34906584F;
    (bodyModel[52]).rotateAngleZ = 0.05235988F;
    
    bodyModel[53].addShapeBox(-48.5F, -0.7F, -5.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[53].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[53]).rotateAngleY = -0.34906584F;
    (bodyModel[53]).rotateAngleZ = 0.05235988F;
    
    bodyModel[54].addShapeBox(-50.5F, -0.7F, 1.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F);
    bodyModel[54].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[54]).rotateAngleY = 0.34906584F;
    (bodyModel[54]).rotateAngleZ = 0.05235988F;
    
    bodyModel[55].addShapeBox(-50.5F, -0.7F, 2.5F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[55].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[55]).rotateAngleY = 0.34906584F;
    (bodyModel[55]).rotateAngleZ = 0.05235988F;
    
    bodyModel[56].addShapeBox(-49.5F, -0.7F, 2.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[56].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[56]).rotateAngleY = 0.34906584F;
    (bodyModel[56]).rotateAngleZ = 0.05235988F;
    
    bodyModel[57].addShapeBox(-49.5F, -0.7F, 4.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[57].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[57]).rotateAngleY = 0.34906584F;
    (bodyModel[57]).rotateAngleZ = 0.05235988F;
    
    bodyModel[58].addShapeBox(-48.5F, -0.7F, 2.5F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[58].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[58]).rotateAngleY = 0.34906584F;
    (bodyModel[58]).rotateAngleZ = 0.05235988F;
    
    bodyModel[59].addBox(-3.0F, -6.0F, 0.0F, 6, 12, 2, 0.0F);
    bodyModel[59].setRotationPoint(3.0F, 2.5F, 14.0F);
    
    bodyModel[60].addShapeBox(3.0F, -6.0F, 0.0F, 3, 12, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[60].setRotationPoint(3.0F, 2.5F, 14.0F);
    
    bodyModel[61].addShapeBox(-6.0F, -6.0F, 0.0F, 3, 12, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
    bodyModel[61].setRotationPoint(3.0F, 2.5F, 14.0F);
    
    bodyModel[62].addBox(-1.5F, -1.5F, -0.5F, 3, 3, 3, 0.0F);
    bodyModel[62].setRotationPoint(3.0F, 2.5F, 14.0F);
    
    bodyModel[63].addBox(-3.0F, -7.5F, -0.5F, 6, 2, 3, 0.0F);
    bodyModel[63].setRotationPoint(3.0F, 2.5F, 14.0F);
    
    bodyModel[64].addShapeBox(-3.0F, -7.43F, -0.5F, 6, 2, 3, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F);
    bodyModel[64].setRotationPoint(3.0F, 2.5F, 14.0F);
    (bodyModel[64]).rotateAngleZ = -0.7853982F;
    
    bodyModel[65].addBox(-3.0F, -7.5F, -0.5F, 6, 2, 3, 0.0F);
    bodyModel[65].setRotationPoint(3.0F, 2.5F, 14.0F);
    (bodyModel[65]).rotateAngleZ = -1.5707964F;
    
    bodyModel[66].addBox(-3.0F, 5.5F, -0.5F, 6, 2, 3, 0.0F);
    bodyModel[66].setRotationPoint(3.0F, 2.5F, 14.0F);
    
    bodyModel[67].addBox(-3.0F, -7.5F, -0.5F, 6, 2, 3, 0.0F);
    bodyModel[67].setRotationPoint(3.0F, 2.5F, 14.0F);
    (bodyModel[67]).rotateAngleZ = 1.5707964F;
    
    bodyModel[68].addBox(-1.5F, -1.5F, -2.5F, 3, 3, 3, 0.0F);
    bodyModel[68].setRotationPoint(3.0F, 2.5F, -14.0F);
    
    bodyModel[69].addShapeBox(-3.0F, -7.43F, -0.5F, 6, 2, 3, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F);
    bodyModel[69].setRotationPoint(3.0F, 2.5F, 14.0F);
    (bodyModel[69]).rotateAngleZ = 0.7853982F;
    
    bodyModel[70].addShapeBox(-3.0F, -7.43F, -0.5F, 6, 2, 3, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F);
    bodyModel[70].setRotationPoint(3.0F, 2.5F, 14.0F);
    (bodyModel[70]).rotateAngleZ = -2.3561945F;
    
    bodyModel[71].addShapeBox(-3.0F, -7.43F, -0.5F, 6, 2, 3, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F);
    bodyModel[71].setRotationPoint(3.0F, 2.5F, 14.0F);
    (bodyModel[71]).rotateAngleZ = 2.3561945F;
    
    bodyModel[72].addBox(-3.0F, -6.0F, -2.0F, 6, 12, 2, 0.0F);
    bodyModel[72].setRotationPoint(3.0F, 2.5F, -14.0F);
    
    bodyModel[73].addShapeBox(3.0F, -6.0F, -2.0F, 3, 12, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[73].setRotationPoint(3.0F, 2.5F, -14.0F);
    
    bodyModel[74].addShapeBox(-6.0F, -6.0F, -2.0F, 3, 12, 2, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F);
    bodyModel[74].setRotationPoint(3.0F, 2.5F, -14.0F);
    
    bodyModel[75].addBox(-3.0F, -7.5F, -2.5F, 6, 2, 3, 0.0F);
    bodyModel[75].setRotationPoint(3.0F, 2.5F, -14.0F);
    
    bodyModel[76].addShapeBox(-3.0F, -7.43F, -2.5F, 6, 2, 3, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F);
    bodyModel[76].setRotationPoint(3.0F, 2.5F, -14.0F);
    (bodyModel[76]).rotateAngleZ = -0.7853982F;
    
    bodyModel[77].addBox(-3.0F, -7.5F, -2.5F, 6, 2, 3, 0.0F);
    bodyModel[77].setRotationPoint(3.0F, 2.5F, -14.0F);
    (bodyModel[77]).rotateAngleZ = -1.5707964F;
    
    bodyModel[78].addShapeBox(-3.0F, -7.43F, -2.5F, 6, 2, 3, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F);
    bodyModel[78].setRotationPoint(3.0F, 2.5F, -14.0F);
    (bodyModel[78]).rotateAngleZ = -2.3561945F;
    
    bodyModel[79].addBox(-3.0F, 5.5F, -2.5F, 6, 2, 3, 0.0F);
    bodyModel[79].setRotationPoint(3.0F, 2.5F, -14.0F);
    
    bodyModel[80].addShapeBox(-3.0F, -7.43F, -2.5F, 6, 2, 3, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F);
    bodyModel[80].setRotationPoint(3.0F, 2.5F, -14.0F);
    (bodyModel[80]).rotateAngleZ = 2.3561945F;
    
    bodyModel[81].addBox(-3.0F, -7.5F, -2.5F, 6, 2, 3, 0.0F);
    bodyModel[81].setRotationPoint(3.0F, 2.5F, -14.0F);
    (bodyModel[81]).rotateAngleZ = 1.5707964F;
    
    bodyModel[82].addShapeBox(-3.0F, -7.43F, -2.5F, 6, 2, 3, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F, 0.18F, 0.0F, 0.0F);
    bodyModel[82].setRotationPoint(3.0F, 2.5F, -14.0F);
    (bodyModel[82]).rotateAngleZ = 0.7853982F;
    
    bodyModel[83].addShapeBox(-0.5F, -3.0F, 0.25F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    bodyModel[83].setRotationPoint(3.0F, 2.5F, 14.0F);
    
    bodyModel[84].addShapeBox(-0.5F, -3.0F, 0.25F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    bodyModel[84].setRotationPoint(3.0F, 2.5F, 14.0F);
    (bodyModel[84]).rotateAngleZ = -1.2566371F;
    
    bodyModel[85].addShapeBox(-0.5F, -3.0F, 0.25F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    bodyModel[85].setRotationPoint(3.0F, 2.5F, 14.0F);
    (bodyModel[85]).rotateAngleZ = 1.2566371F;
    
    bodyModel[86].addShapeBox(-0.5F, -3.0F, 0.25F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    bodyModel[86].setRotationPoint(3.0F, 2.5F, 14.0F);
    (bodyModel[86]).rotateAngleZ = -2.5132742F;
    
    bodyModel[87].addShapeBox(-0.5F, -3.0F, 0.25F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    bodyModel[87].setRotationPoint(3.0F, 2.5F, 14.0F);
    (bodyModel[87]).rotateAngleZ = 2.5132742F;
    
    bodyModel[88].addShapeBox(-0.5F, -3.0F, -2.25F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    bodyModel[88].setRotationPoint(3.0F, 2.5F, -14.0F);
    
    bodyModel[89].addShapeBox(-0.5F, -3.0F, -2.25F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    bodyModel[89].setRotationPoint(3.0F, 2.5F, -14.0F);
    (bodyModel[89]).rotateAngleZ = 1.2566371F;
    
    bodyModel[90].addShapeBox(-0.5F, -3.0F, -2.25F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    bodyModel[90].setRotationPoint(3.0F, 2.5F, -14.0F);
    (bodyModel[90]).rotateAngleZ = -1.2566371F;
    
    bodyModel[91].addShapeBox(-0.5F, -3.0F, -2.25F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    bodyModel[91].setRotationPoint(3.0F, 2.5F, -14.0F);
    (bodyModel[91]).rotateAngleZ = -2.5132742F;
    
    bodyModel[92].addShapeBox(-0.5F, -3.0F, -2.25F, 1, 1, 2, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    bodyModel[92].setRotationPoint(3.0F, 2.5F, -14.0F);
    (bodyModel[92]).rotateAngleZ = 2.5132742F;
    
    bodyModel[93].addShapeBox(-50.5F, -1.0F, -1.0F, 49, 2, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -1.7F, 0.0F, -0.5F, -1.7F, 0.0F, -0.5F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F);
    bodyModel[93].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[93]).rotateAngleY = -0.34906584F;
    (bodyModel[93]).rotateAngleZ = 0.05235988F;
    
    bodyModel[94].addShapeBox(-50.5F, -1.0F, -1.0F, 49, 2, 2, 0.0F, 0.0F, -1.7F, 0.0F, -0.5F, -1.7F, 0.0F, -0.5F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    bodyModel[94].setRotationPoint(0.0F, 2.5F, 7.5F);
    (bodyModel[94]).rotateAngleY = -0.34906584F;
    (bodyModel[94]).rotateAngleZ = 0.05235988F;
    
    bodyModel[95].addShapeBox(-50.5F, -1.0F, -1.0F, 49, 2, 2, 0.0F, 0.0F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F);
    bodyModel[95].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[95]).rotateAngleY = 0.34906584F;
    (bodyModel[95]).rotateAngleZ = 0.05235988F;
    
    bodyModel[96].addShapeBox(-50.5F, -1.0F, -1.0F, 49, 2, 2, 0.0F, 0.0F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, -1.7F, 0.0F, -0.5F, -1.7F, 0.0F, -0.5F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F);
    bodyModel[96].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[96]).rotateAngleY = 0.34906584F;
    (bodyModel[96]).rotateAngleZ = 0.05235988F;
    
    bodyModel[97].addShapeBox(-50.5F, -1.0F, -1.0F, 49, 2, 2, 0.0F, 0.0F, -1.7F, 0.0F, -0.5F, -1.7F, 0.0F, -0.5F, -1.7F, 0.0F, 0.0F, -1.7F, 0.0F, 0.0F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    bodyModel[97].setRotationPoint(0.0F, 2.5F, -7.5F);
    (bodyModel[97]).rotateAngleY = 0.34906584F;
    (bodyModel[97]).rotateAngleZ = 0.05235988F;
    
    bodyModel[98].addShapeBox(-0.5F, -1.0F, -3.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[98].setRotationPoint(3.0F, 2.0F, 0.0F);
    
    bodyModel[99].addBox(-0.5F, 0.0F, -1.5F, 1, 5, 3, 0.0F);
    bodyModel[99].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    bodyModel[100].addShapeBox(0.5F, 0.0F, -1.5F, 1, 5, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[100].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    bodyModel[101].addShapeBox(-1.5F, 0.0F, -1.5F, 1, 5, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[101].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    bodyModel[102].addBox(1.5F, 0.5F, 0.5F, 4, 1, 1, 0.0F);
    bodyModel[102].setRotationPoint(3.0F, 0.0F, -13.0F);
    
    bodyModel[103].addBox(1.5F, 0.5F, -1.5F, 4, 1, 1, 0.0F);
    bodyModel[103].setRotationPoint(3.0F, 0.0F, 13.0F);

    
    turretModel = new ModelRendererTurbo[62];
    turretModel[0] = new ModelRendererTurbo(this, 193, 25, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 257, 33, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 281, 33, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 305, 33, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 329, 33, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 353, 33, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 377, 33, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 137, 9, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 153, 9, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 401, 33, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 17, 25, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 25, 17, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 417, 33, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 433, 33, textureX, textureY);
    turretModel[14] = new ModelRendererTurbo(this, 209, 25, textureX, textureY);
    turretModel[15] = new ModelRendererTurbo(this, 377, 9, textureX, textureY);
    turretModel[16] = new ModelRendererTurbo(this, 505, 25, textureX, textureY);
    turretModel[17] = new ModelRendererTurbo(this, 449, 33, textureX, textureY);
    turretModel[18] = new ModelRendererTurbo(this, 457, 9, textureX, textureY);
    turretModel[19] = new ModelRendererTurbo(this, 233, 57, textureX, textureY);
    turretModel[20] = new ModelRendererTurbo(this, 249, 57, textureX, textureY);
    turretModel[21] = new ModelRendererTurbo(this, 465, 49, textureX, textureY);
    turretModel[22] = new ModelRendererTurbo(this, 473, 33, textureX, textureY);
    turretModel[23] = new ModelRendererTurbo(this, 273, 57, textureX, textureY);
    turretModel[24] = new ModelRendererTurbo(this, 289, 57, textureX, textureY);
    turretModel[25] = new ModelRendererTurbo(this, 297, 57, textureX, textureY);
    turretModel[26] = new ModelRendererTurbo(this, 305, 57, textureX, textureY);
    turretModel[27] = new ModelRendererTurbo(this, 297, 17, textureX, textureY);
    turretModel[28] = new ModelRendererTurbo(this, 313, 57, textureX, textureY);
    turretModel[29] = new ModelRendererTurbo(this, 329, 57, textureX, textureY);
    turretModel[30] = new ModelRendererTurbo(this, 345, 57, textureX, textureY);
    turretModel[31] = new ModelRendererTurbo(this, 361, 17, textureX, textureY);
    turretModel[32] = new ModelRendererTurbo(this, 385, 17, textureX, textureY);
    turretModel[33] = new ModelRendererTurbo(this, 321, 17, textureX, textureY);
    turretModel[34] = new ModelRendererTurbo(this, 121, 57, textureX, textureY);
    turretModel[35] = new ModelRendererTurbo(this, 65, 65, textureX, textureY);
    turretModel[36] = new ModelRendererTurbo(this, 73, 65, textureX, textureY);
    turretModel[37] = new ModelRendererTurbo(this, 81, 65, textureX, textureY);
    turretModel[38] = new ModelRendererTurbo(this, 89, 65, textureX, textureY);
    turretModel[39] = new ModelRendererTurbo(this, 105, 65, textureX, textureY);
    turretModel[40] = new ModelRendererTurbo(this, 113, 65, textureX, textureY);
    turretModel[41] = new ModelRendererTurbo(this, 137, 65, textureX, textureY);
    turretModel[42] = new ModelRendererTurbo(this, 153, 57, textureX, textureY);
    turretModel[43] = new ModelRendererTurbo(this, 273, 33, textureX, textureY);
    turretModel[44] = new ModelRendererTurbo(this, 209, 65, textureX, textureY);
    turretModel[45] = new ModelRendererTurbo(this, 153, 57, textureX, textureY);
    turretModel[46] = new ModelRendererTurbo(this, 241, 57, textureX, textureY);
    turretModel[47] = new ModelRendererTurbo(this, 193, 57, textureX, textureY);
    turretModel[48] = new ModelRendererTurbo(this, 497, 33, textureX, textureY);
    turretModel[49] = new ModelRendererTurbo(this, 209, 41, textureX, textureY);
    turretModel[50] = new ModelRendererTurbo(this, 145, 65, textureX, textureY);
    turretModel[51] = new ModelRendererTurbo(this, 177, 65, textureX, textureY);
    turretModel[52] = new ModelRendererTurbo(this, 249, 41, textureX, textureY);
    turretModel[53] = new ModelRendererTurbo(this, 345, 41, textureX, textureY);
    turretModel[54] = new ModelRendererTurbo(this, 89, 65, textureX, textureY);
    turretModel[55] = new ModelRendererTurbo(this, 313, 57, textureX, textureY);
    turretModel[56] = new ModelRendererTurbo(this, 233, 65, textureX, textureY);
    turretModel[57] = new ModelRendererTurbo(this, 433, 57, textureX, textureY);
    turretModel[58] = new ModelRendererTurbo(this, 289, 65, textureX, textureY);
    turretModel[59] = new ModelRendererTurbo(this, 337, 65, textureX, textureY);
    turretModel[60] = new ModelRendererTurbo(this, 353, 57, textureX, textureY);
    turretModel[61] = new ModelRendererTurbo(this, 305, 65, textureX, textureY);
    
    turretModel[0].addShapeBox(-2.0F, 0.0F, -1.5F, 4, 1, 3, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
    turretModel[0].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[1].addShapeBox(-2.0F, 0.0F, 1.6F, 6, 1, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.2F, 0.25F, 0.2F, 0.2F);
    turretModel[1].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[2].addShapeBox(-2.0F, -1.0F, 1.6F, 6, 1, 2, 0.0F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F);
    turretModel[2].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[3].addShapeBox(-2.0F, 1.2F, 1.6F, 6, 1, 2, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.25F, 0.0F, 0.2F, 0.25F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.3F, 0.25F, -0.5F, -0.3F);
    turretModel[3].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[4].addShapeBox(-2.0F, 0.0F, -3.6F, 6, 1, 2, 0.0F, 0.25F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.0F, 0.25F, 0.2F, 0.0F);
    turretModel[4].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[5].addShapeBox(-2.0F, -1.0F, -3.6F, 6, 1, 2, 0.0F, 0.25F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F, 0.25F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F);
    turretModel[5].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[6].addShapeBox(-2.0F, 1.2F, -3.6F, 6, 1, 2, 0.0F, 0.25F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, -0.5F, -0.3F, 0.0F, -0.5F, -0.3F, 0.0F, -0.5F, -0.5F, 0.25F, -0.5F, -0.5F);
    turretModel[6].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[7].addShapeBox(4.0F, 0.1F, -3.2F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[7].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[8].addShapeBox(4.0F, 0.1F, 2.2F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[8].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[9].addShapeBox(-2.0F, -4.0F, 2.2F, 6, 4, 1, 0.0F, -4.0F, -0.5F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -4.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F);
    turretModel[9].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[10].addShapeBox(4.0F, -4.0F, 2.2F, 5, 4, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -2.5F, -0.2F, 0.0F, -2.5F, -0.2F, 0.0F, -0.5F, -0.2F);
    turretModel[10].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[11].addShapeBox(9.0F, -5.0F, 2.2F, 1, 4, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.2F, 0.0F, -1.5F, -0.2F, 0.0F, -1.5F, -0.1F, 0.0F, 0.0F, -0.1F);
    turretModel[11].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[12].addShapeBox(-2.0F, -4.0F, -3.2F, 6, 4, 1, 0.0F, -4.0F, -0.5F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -4.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F);
    turretModel[12].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[13].addShapeBox(4.0F, -4.0F, -3.2F, 5, 4, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -2.5F, -0.2F, 0.0F, -2.5F, -0.2F, 0.0F, -0.5F, -0.2F);
    turretModel[13].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[14].addShapeBox(9.0F, -5.0F, -3.2F, 1, 4, 1, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, -1.0F, -0.1F, 0.0F, -1.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.1F, 0.0F, -1.5F, -0.1F, 0.0F, -1.5F, -0.2F, 0.0F, 0.0F, -0.2F);
    turretModel[14].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[15].addShapeBox(-2.0F, -2.0F, -3.1F, 1, 1, 1, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F);
    turretModel[15].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[16].addShapeBox(-2.0F, -2.0F, -3.2F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F);
    turretModel[16].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[17].addShapeBox(-2.0F, -2.0F, 2.2F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F);
    turretModel[17].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[18].addShapeBox(-2.0F, -2.0F, 2.1F, 1, 1, 1, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F);
    turretModel[18].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[19].addShapeBox(-5.0F, -2.0F, 2.2F, 3, 2, 2, 0.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -0.2F, 0.0F, -1.0F, -1.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -1.2F, 0.0F, -1.0F, -0.2F);
    turretModel[19].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[20].addShapeBox(-9.0F, -1.0F, 4.2F, 10, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    turretModel[20].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[21].addShapeBox(-8.5F, -1.0F, 3.4F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    turretModel[21].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[22].addShapeBox(0.5F, -1.0F, 4.2F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[22].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[23].addShapeBox(-5.5F, -1.0F, 4.2F, 6, 1, 1, 0.0F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F);
    turretModel[23].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[24].addShapeBox(-10.0F, -1.0F, 3.7F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[24].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[25].addShapeBox(-10.0F, -2.0F, 3.7F, 1, 1, 2, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[25].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[26].addShapeBox(-10.0F, 0.0F, 3.7F, 1, 1, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F);
    turretModel[26].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[27].addShapeBox(-11.5F, -1.0F, 4.9F, 2, 1, 1, 0.0F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, -0.8F, -0.3F, -0.3F);
    turretModel[27].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[28].addShapeBox(-6.0F, -2.0F, 3.2F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[28].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[29].addShapeBox(-9.0F, -2.0F, 3.2F, 3, 2, 1, 0.0F, -0.5F, -1.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -0.5F, -1.0F, -0.2F, -0.5F, 0.0F, -0.2F, 0.0F, -1.0F, -0.2F, 0.0F, -1.0F, -0.2F, -0.5F, 0.0F, -0.2F);
    turretModel[29].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[30].addShapeBox(-7.5F, -2.5F, 6.2F, 4, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    turretModel[30].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[31].addShapeBox(-7.5F, -3.5F, 6.2F, 4, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    turretModel[31].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[32].addShapeBox(-7.5F, -0.5F, 6.2F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F);
    turretModel[32].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[33].addShapeBox(-7.5F, -2.0F, 6.7F, 1, 1, 1, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F);
    turretModel[33].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[34].addShapeBox(-1.0F, -11.0F, 5.0F, 1, 12, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[34].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[34]).rotateAngleZ = 0.2617994F;
    
    turretModel[35].addShapeBox(-1.0F, -13.0F, 3.0F, 1, 9, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[35].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[35]).rotateAngleZ = 0.2617994F;
    
    turretModel[36].addShapeBox(-1.0F, -13.0F, 2.0F, 1, 8, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[36].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[36]).rotateAngleZ = 0.2617994F;
    
    turretModel[37].addShapeBox(-1.0F, -13.0F, -3.0F, 1, 8, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[37].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[37]).rotateAngleZ = 0.2617994F;
    
    turretModel[38].addShapeBox(-1.0F, -13.0F, -10.0F, 1, 14, 6, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[38].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[38]).rotateAngleZ = 0.2617994F;
    
    turretModel[39].addShapeBox(-1.0F, -13.0F, -4.0F, 1, 11, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[39].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[39]).rotateAngleZ = 0.2617994F;
    
    turretModel[40].addShapeBox(-1.0F, -11.0F, 10.0F, 1, 10, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[40].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[40]).rotateAngleZ = 0.2617994F;
    
    turretModel[41].addShapeBox(-1.0F, -13.0F, -12.0F, 1, 12, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[41].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[41]).rotateAngleZ = 0.2617994F;
    
    turretModel[42].addShapeBox(-1.0F, -18.0F, -12.0F, 1, 5, 17, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[42].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[42]).rotateAngleZ = 0.2617994F;
    
    turretModel[43].addShapeBox(-1.0F, -18.0F, 5.0F, 1, 2, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[43].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[43]).rotateAngleZ = 0.2617994F;
    
    turretModel[44].addShapeBox(-1.0F, -18.0F, 9.0F, 1, 7, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[44].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[44]).rotateAngleZ = 0.2617994F;
    
    turretModel[45].addShapeBox(-1.0F, -18.0F, -17.0F, 1, 11, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[45].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[45]).rotateAngleZ = 0.2617994F;
    
    turretModel[46].addShapeBox(-1.0F, -18.0F, 12.0F, 1, 11, 5, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[46].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[46]).rotateAngleZ = 0.2617994F;
    
    turretModel[47].addShapeBox(-1.0F, -20.0F, -17.0F, 1, 2, 34, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[47].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[47]).rotateAngleZ = 0.2617994F;
    
    turretModel[48].addShapeBox(-1.0F, -13.0F, -2.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, -0.5F, -0.9F, 0.0F);
    turretModel[48].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[48]).rotateAngleZ = 0.2617994F;
    
    turretModel[49].addShapeBox(-1.0F, -13.0F, 1.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[49].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[49]).rotateAngleZ = 0.2617994F;
    
    turretModel[50].addShapeBox(-1.0F, -7.0F, -14.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[50].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[50]).rotateAngleZ = 0.2617994F;
    
    turretModel[51].addShapeBox(-1.0F, -7.0F, 12.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, -0.5F, -1.9F, 0.0F);
    turretModel[51].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[51]).rotateAngleZ = 0.2617994F;
    
    turretModel[52].addShapeBox(-1.0F, -1.0F, -11.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[52].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[52]).rotateAngleZ = 0.2617994F;
    
    turretModel[53].addShapeBox(-1.0F, -1.0F, 10.0F, 1, 1, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, -0.5F, -0.9F, 0.0F);
    turretModel[53].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[53]).rotateAngleZ = 0.2617994F;
    
    turretModel[54].addShapeBox(-1.0F, -2.0F, -0.8F, 1, 2, 1, 0.0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F);
    turretModel[54].setRotationPoint(7.0F, -5.0F, 3.0F);
    (turretModel[54]).rotateAngleZ = 0.2268928F;
    
    turretModel[55].addShapeBox(-1.0F, -7.0F, -0.8F, 1, 7, 9, 0.0F, -0.2F, -0.1F, -8.2F, -0.2F, 0.0F, -8.2F, -0.2F, 0.0F, -0.2F, -0.2F, -0.1F, -0.2F, -0.05F, -0.05F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -8.2F, -0.05F, -0.05F, -8.2F);
    turretModel[55].setRotationPoint(6.5F, -7.0F, 3.0F);
    (turretModel[55]).rotateAngleZ = 0.89011794F;
    
    turretModel[56].addShapeBox(-1.0F, -2.0F, -0.2F, 1, 2, 1, 0.0F, -0.2F, -0.5F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.05F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F);
    turretModel[56].setRotationPoint(7.0F, -5.0F, -3.0F);
    (turretModel[56]).rotateAngleZ = 0.2268928F;
    
    turretModel[57].addShapeBox(-1.0F, -7.0F, -9.2F, 1, 7, 9, 0.0F, -0.2F, -0.1F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -8.2F, -0.2F, -0.1F, -8.2F, -0.05F, -0.05F, -8.2F, -0.2F, 0.0F, -8.2F, -0.2F, 0.0F, -0.2F, -0.05F, -0.05F, -0.2F);
    turretModel[57].setRotationPoint(6.5F, -7.0F, -2.0F);
    (turretModel[57]).rotateAngleZ = 0.89011794F;
    
    turretModel[58].addShapeBox(-3.5F, -15.0F, 10.0F, 3, 6, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[58].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[58]).rotateAngleZ = 0.2617994F;
    
    turretModel[59].addShapeBox(-2.5F, -13.0F, -9.0F, 2, 6, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[59].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[59]).rotateAngleZ = 0.2617994F;
    
    turretModel[60].addShapeBox(-3.0F, -13.0F, -9.0F, 1, 6, 4, 0.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F);
    turretModel[60].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[60]).rotateAngleZ = 0.2617994F;
    
    turretModel[61].addShapeBox(-1.0F, -13.0F, 4.0F, 1, 7, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[61].setRotationPoint(4.0F, 0.0F, 0.0F);
    (turretModel[61]).rotateAngleZ = 0.2617994F;

    
    barrelModel = new ModelRendererTurbo[79];
    barrelModel[0] = new ModelRendererTurbo(this, 1, 41, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 97, 41, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 249, 41, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 449, 33, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 473, 33, textureX, textureY);
    barrelModel[5] = new ModelRendererTurbo(this, 393, 9, textureX, textureY);
    barrelModel[6] = new ModelRendererTurbo(this, 185, 41, textureX, textureY);
    barrelModel[7] = new ModelRendererTurbo(this, 297, 41, textureX, textureY);
    barrelModel[8] = new ModelRendererTurbo(this, 353, 41, textureX, textureY);
    barrelModel[9] = new ModelRendererTurbo(this, 433, 41, textureX, textureY);
    barrelModel[10] = new ModelRendererTurbo(this, 1, 49, textureX, textureY);
    barrelModel[11] = new ModelRendererTurbo(this, 57, 49, textureX, textureY);
    barrelModel[12] = new ModelRendererTurbo(this, 137, 49, textureX, textureY);
    barrelModel[13] = new ModelRendererTurbo(this, 217, 49, textureX, textureY);
    barrelModel[14] = new ModelRendererTurbo(this, 273, 49, textureX, textureY);
    barrelModel[15] = new ModelRendererTurbo(this, 329, 49, textureX, textureY);
    barrelModel[16] = new ModelRendererTurbo(this, 481, 41, textureX, textureY);
    barrelModel[17] = new ModelRendererTurbo(this, 209, 41, textureX, textureY);
    barrelModel[18] = new ModelRendererTurbo(this, 497, 33, textureX, textureY);
    barrelModel[19] = new ModelRendererTurbo(this, 377, 49, textureX, textureY);
    barrelModel[20] = new ModelRendererTurbo(this, 465, 33, textureX, textureY);
    barrelModel[21] = new ModelRendererTurbo(this, 505, 33, textureX, textureY);
    barrelModel[22] = new ModelRendererTurbo(this, 201, 41, textureX, textureY);
    barrelModel[23] = new ModelRendererTurbo(this, 233, 41, textureX, textureY);
    barrelModel[24] = new ModelRendererTurbo(this, 417, 9, textureX, textureY);
    barrelModel[25] = new ModelRendererTurbo(this, 393, 49, textureX, textureY);
    barrelModel[26] = new ModelRendererTurbo(this, 89, 41, textureX, textureY);
    barrelModel[27] = new ModelRendererTurbo(this, 505, 9, textureX, textureY);
    barrelModel[28] = new ModelRendererTurbo(this, 17, 17, textureX, textureY);
    barrelModel[29] = new ModelRendererTurbo(this, 449, 49, textureX, textureY);
    barrelModel[30] = new ModelRendererTurbo(this, 473, 49, textureX, textureY);
    barrelModel[31] = new ModelRendererTurbo(this, 497, 49, textureX, textureY);
    barrelModel[32] = new ModelRendererTurbo(this, 1, 57, textureX, textureY);
    barrelModel[33] = new ModelRendererTurbo(this, 17, 57, textureX, textureY);
    barrelModel[34] = new ModelRendererTurbo(this, 33, 57, textureX, textureY);
    barrelModel[35] = new ModelRendererTurbo(this, 49, 57, textureX, textureY);
    barrelModel[36] = new ModelRendererTurbo(this, 65, 57, textureX, textureY);
    barrelModel[37] = new ModelRendererTurbo(this, 57, 17, textureX, textureY);
    barrelModel[38] = new ModelRendererTurbo(this, 73, 57, textureX, textureY);
    barrelModel[39] = new ModelRendererTurbo(this, 97, 57, textureX, textureY);
    barrelModel[40] = new ModelRendererTurbo(this, 89, 57, textureX, textureY);
    barrelModel[41] = new ModelRendererTurbo(this, 113, 57, textureX, textureY);
    barrelModel[42] = new ModelRendererTurbo(this, 129, 57, textureX, textureY);
    barrelModel[43] = new ModelRendererTurbo(this, 121, 17, textureX, textureY);
    barrelModel[44] = new ModelRendererTurbo(this, 145, 57, textureX, textureY);
    barrelModel[45] = new ModelRendererTurbo(this, 161, 57, textureX, textureY);
    barrelModel[46] = new ModelRendererTurbo(this, 177, 57, textureX, textureY);
    barrelModel[47] = new ModelRendererTurbo(this, 145, 17, textureX, textureY);
    barrelModel[48] = new ModelRendererTurbo(this, 217, 17, textureX, textureY);
    barrelModel[49] = new ModelRendererTurbo(this, 185, 57, textureX, textureY);
    barrelModel[50] = new ModelRendererTurbo(this, 201, 57, textureX, textureY);
    barrelModel[51] = new ModelRendererTurbo(this, 217, 57, textureX, textureY);
    barrelModel[52] = new ModelRendererTurbo(this, 409, 17, textureX, textureY);
    barrelModel[53] = new ModelRendererTurbo(this, 433, 17, textureX, textureY);
    barrelModel[54] = new ModelRendererTurbo(this, 457, 17, textureX, textureY);
    barrelModel[55] = new ModelRendererTurbo(this, 361, 57, textureX, textureY);
    barrelModel[56] = new ModelRendererTurbo(this, 369, 57, textureX, textureY);
    barrelModel[57] = new ModelRendererTurbo(this, 409, 57, textureX, textureY);
    barrelModel[58] = new ModelRendererTurbo(this, 425, 57, textureX, textureY);
    barrelModel[59] = new ModelRendererTurbo(this, 465, 57, textureX, textureY);
    barrelModel[60] = new ModelRendererTurbo(this, 481, 57, textureX, textureY);
    barrelModel[61] = new ModelRendererTurbo(this, 497, 57, textureX, textureY);
    barrelModel[62] = new ModelRendererTurbo(this, 1, 65, textureX, textureY);
    barrelModel[63] = new ModelRendererTurbo(this, 17, 65, textureX, textureY);
    barrelModel[64] = new ModelRendererTurbo(this, 33, 65, textureX, textureY);
    barrelModel[65] = new ModelRendererTurbo(this, 481, 17, textureX, textureY);
    barrelModel[66] = new ModelRendererTurbo(this, 49, 65, textureX, textureY);
    barrelModel[67] = new ModelRendererTurbo(this, 497, 25, textureX, textureY);
    barrelModel[68] = new ModelRendererTurbo(this, 233, 33, textureX, textureY);
    barrelModel[69] = new ModelRendererTurbo(this, 249, 33, textureX, textureY);
    barrelModel[70] = new ModelRendererTurbo(this, 257, 65, textureX, textureY);
    barrelModel[71] = new ModelRendererTurbo(this, 265, 65, textureX, textureY);
    barrelModel[72] = new ModelRendererTurbo(this, 273, 65, textureX, textureY);
    barrelModel[73] = new ModelRendererTurbo(this, 281, 65, textureX, textureY);
    barrelModel[74] = new ModelRendererTurbo(this, 361, 65, textureX, textureY);
    barrelModel[75] = new ModelRendererTurbo(this, 377, 65, textureX, textureY);
    barrelModel[76] = new ModelRendererTurbo(this, 393, 65, textureX, textureY);
    barrelModel[77] = new ModelRendererTurbo(this, 409, 65, textureX, textureY);
    barrelModel[78] = new ModelRendererTurbo(this, 457, 65, textureX, textureY);
    
    barrelModel[0].addShapeBox(-18.0F, -1.0F, -2.3F, 43, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, -0.2F, 0.0F, 0.3F, -0.2F);
    barrelModel[0].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[1].addShapeBox(-18.0F, -1.0F, 1.3F, 43, 1, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, -0.2F, 0.0F, 0.3F, -0.2F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F);
    barrelModel[1].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[2].addShapeBox(-1.0F, 0.3F, -2.5F, 21, 1, 5, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F);
    barrelModel[2].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[3].addShapeBox(-16.0F, 0.3F, -2.5F, 3, 1, 5, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F, 0.0F, -0.5F, -0.7F);
    barrelModel[3].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[4].addShapeBox(20.0F, 0.3F, -2.5F, 5, 1, 5, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F);
    barrelModel[4].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[5].addShapeBox(24.0F, -1.0F, -1.5F, 1, 1, 3, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -0.2F, 0.3F, 0.0F);
    barrelModel[5].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[6].addShapeBox(21.0F, -2.0F, -2.5F, 4, 1, 5, 0.0F, 0.0F, -0.2F, -2.0F, 0.0F, -0.2F, -2.0F, 0.0F, -0.2F, -2.0F, 0.0F, -0.2F, -2.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    barrelModel[6].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[7].addShapeBox(-1.0F, -4.0F, -1.5F, 21, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[7].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[8].addShapeBox(20.0F, -4.0F, -1.5F, 35, 1, 3, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    barrelModel[8].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[9].addShapeBox(-1.0F, -3.0F, -1.5F, 21, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    barrelModel[9].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[10].addShapeBox(-1.0F, -5.0F, -1.5F, 21, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[10].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[11].addShapeBox(20.0F, -4.8F, -1.5F, 35, 1, 3, 0.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    barrelModel[11].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[12].addShapeBox(20.0F, -3.2F, -1.5F, 35, 1, 3, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F);
    barrelModel[12].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[13].addShapeBox(-1.0F, -8.5F, -1.5F, 23, 1, 3, 0.0F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    barrelModel[13].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[14].addShapeBox(-1.0F, -7.7F, -1.5F, 23, 1, 3, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    barrelModel[14].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[15].addShapeBox(-1.0F, -6.9F, -1.5F, 23, 1, 3, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F, 0.0F, 0.0F, -1.2F);
    barrelModel[15].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[16].addShapeBox(-4.0F, -4.0F, -2.5F, 3, 3, 5, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    barrelModel[16].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[17].addShapeBox(-4.0F, -5.5F, -2.5F, 3, 1, 5, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.5F, -0.2F, 0.0F, 0.5F, -0.2F, 0.0F, 0.5F, -0.2F, 0.0F, 0.5F, -0.2F);
    barrelModel[17].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[18].addShapeBox(-5.0F, -6.0F, -2.5F, 1, 5, 5, 0.0F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    barrelModel[18].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[19].addShapeBox(-9.0F, -2.0F, -2.5F, 4, 1, 5, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    barrelModel[19].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[20].addShapeBox(-7.0F, -5.5F, -2.3F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
    barrelModel[20].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[21].addShapeBox(-7.0F, -5.5F, 1.3F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
    barrelModel[21].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[22].addShapeBox(-9.0F, -5.5F, -2.3F, 2, 3, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
    barrelModel[22].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[23].addShapeBox(-9.0F, -5.5F, 1.3F, 2, 3, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
    barrelModel[23].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[24].addShapeBox(-7.0F, -5.0F, -1.5F, 2, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[24].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[25].addShapeBox(-4.0F, -1.4F, -1.0F, 28, 2, 2, 0.0F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F, 0.0F, -0.4F, -0.4F);
    barrelModel[25].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[26].addShapeBox(-9.0F, -1.0F, -1.5F, 1, 1, 3, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F);
    barrelModel[26].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[27].addShapeBox(22.0F, -7.5F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    barrelModel[27].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[28].addShapeBox(23.5F, -7.5F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[28].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[29].addShapeBox(20.5F, -4.2F, -2.5F, 3, 3, 5, 0.0F, -1.5F, 0.1F, -1.0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F, -1.0F, -1.5F, 0.1F, -1.0F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F, 0.0F, 0.2F, -0.2F);
    barrelModel[29].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[30].addShapeBox(22.5F, -6.9F, -1.5F, 1, 3, 3, 0.0F, -0.2F, 0.0F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, 0.0F, -0.8F, -0.2F, 0.0F, -0.8F, 0.5F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.5F, -0.4F, 0.0F);
    barrelModel[30].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[31].addShapeBox(16.0F, -4.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
    barrelModel[31].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[32].addShapeBox(16.0F, -5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
    barrelModel[32].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[33].addShapeBox(16.0F, -3.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F);
    barrelModel[33].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[34].addShapeBox(16.0F, -7.7F, -1.5F, 1, 1, 3, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    barrelModel[34].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[35].addShapeBox(16.0F, -8.5F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[35].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[36].addShapeBox(16.0F, -6.9F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F);
    barrelModel[36].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[37].addShapeBox(16.0F, -5.7F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[37].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[38].addShapeBox(14.5F, -1.8F, -2.5F, 4, 1, 5, 0.0F, -1.5F, 0.2F, -1.8F, -1.5F, 0.2F, -1.8F, -1.5F, 0.2F, -1.8F, -1.5F, 0.2F, -1.8F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    barrelModel[38].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[39].addShapeBox(1.5F, -1.8F, -2.5F, 4, 1, 5, 0.0F, -1.5F, 0.2F, -1.8F, -1.5F, 0.2F, -1.8F, -1.5F, 0.2F, -1.8F, -1.5F, 0.2F, -1.8F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    barrelModel[39].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[40].addShapeBox(3.0F, -3.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F);
    barrelModel[40].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[41].addShapeBox(3.0F, -4.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
    barrelModel[41].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[42].addShapeBox(3.0F, -5.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
    barrelModel[42].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[43].addShapeBox(3.0F, -5.7F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[43].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[44].addShapeBox(3.0F, -6.9F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F);
    barrelModel[44].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[45].addShapeBox(3.0F, -7.7F, -1.5F, 1, 1, 3, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F);
    barrelModel[45].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[46].addShapeBox(3.0F, -8.5F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F, 0.0F, 0.2F, -1.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[46].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[47].addShapeBox(-3.0F, -7.5F, -0.5F, 2, 1, 1, 0.0F, 0.5F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.2F);
    barrelModel[47].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[48].addShapeBox(-4.0F, -7.5F, -0.5F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[48].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[49].addShapeBox(11.3F, 0.8F, -3.5F, 3, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[49].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[50].addShapeBox(11.3F, -4.2F, -3.5F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
    barrelModel[50].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[51].addShapeBox(11.3F, -4.2F, 2.5F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, -2.0F, 0.2F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[51].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[52].addShapeBox(11.3F, -0.2F, 3.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
    barrelModel[52].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[53].addShapeBox(11.3F, 0.8F, 3.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F);
    barrelModel[53].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[54].addShapeBox(11.3F, -1.2F, 3.5F, 3, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.1F, -1.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
    barrelModel[54].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[55].addShapeBox(11.8F, -2.7F, 3.5F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[55].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[56].addShapeBox(0.0F, -2.5F, -1.5F, 16, 3, 2, 0.0F, 0.0F, -2.2F, -1.2F, 0.0F, -1.1F, -0.2F, 0.0F, -1.1F, -1.2F, 0.0F, -2.2F, -0.2F, 0.0F, -0.2F, -1.2F, 0.0F, -1.3F, -0.2F, 0.0F, -1.3F, -1.2F, 0.0F, -0.2F, -0.2F);
    barrelModel[56].setRotationPoint(-5.5F, -2.5F, 5.0F);
    
    barrelModel[57].addShapeBox(-9.0F, -4.0F, 2.3F, 5, 3, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    barrelModel[57].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[58].addShapeBox(-10.0F, -6.0F, 2.8F, 7, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F);
    barrelModel[58].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[59].addShapeBox(-13.0F, -6.0F, 2.8F, 3, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, -3.0F, -0.8F);
    barrelModel[59].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[60].addShapeBox(55.0F, -5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[60].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[61].addShapeBox(55.0F, -4.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[61].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[62].addShapeBox(55.0F, -3.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    barrelModel[62].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[63].addShapeBox(57.0F, -5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.3F, -0.7F, 0.0F, 0.3F, -0.7F, 0.0F, 0.0F, -1.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -1.0F);
    barrelModel[63].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[64].addShapeBox(59.0F, -5.0F, -1.5F, 3, 1, 3, 0.0F, 0.0F, 0.3F, -0.7F, 0.0F, 0.3F, -0.7F, 0.0F, 0.3F, -0.7F, 0.0F, 0.3F, -0.7F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F);
    barrelModel[64].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[65].addShapeBox(59.0F, -4.0F, 0.8F, 1, 1, 1, 0.0F, 0.0F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F);
    barrelModel[65].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[66].addShapeBox(59.0F, -3.0F, -1.5F, 3, 1, 3, 0.0F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, 0.3F, 0.0F, 0.3F, -0.7F, 0.0F, 0.3F, -0.7F, 0.0F, 0.3F, -0.7F, 0.0F, 0.3F, -0.7F);
    barrelModel[66].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[67].addShapeBox(59.0F, -4.0F, -1.8F, 1, 1, 1, 0.0F, 0.0F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F);
    barrelModel[67].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[68].addShapeBox(61.0F, -4.0F, 0.8F, 1, 1, 1, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F);
    barrelModel[68].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[69].addShapeBox(61.0F, -4.0F, -1.8F, 1, 1, 1, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, -0.5F, 0.3F, 0.0F);
    barrelModel[69].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[70].addShapeBox(62.0F, -5.3F, -1.0F, 1, 1, 2, 0.0F, 0.0F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F, 0.0F, -0.7F, -0.2F, 0.0F, 0.0F, 0.1F, -0.9F, 0.0F, 0.1F, -0.9F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F);
    barrelModel[70].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[71].addShapeBox(62.0F, -2.7F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.1F, -0.9F, 0.0F, 0.1F, -0.9F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F, -0.9F, -0.7F, -0.2F, 0.0F, -0.7F, -0.2F);
    barrelModel[71].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[72].addShapeBox(62.0F, -4.3F, -1.1F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, -0.4F, 0.0F, -0.9F, -0.4F, 0.0F, -0.9F, -0.4F, -0.7F, 0.0F, -0.4F, -0.7F);
    barrelModel[72].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[73].addShapeBox(62.0F, -4.3F, 0.1F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.7F, -0.9F, 0.0F, -0.7F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -0.7F, -0.9F, -0.4F, -0.7F, -0.9F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F);
    barrelModel[73].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[74].addShapeBox(57.0F, -5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.3F, -0.7F, 0.0F, 0.3F, -2.3F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, -2.3F, 0.0F, -0.3F, -2.0F);
    barrelModel[74].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[75].addShapeBox(57.0F, -5.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.3F, -2.3F, 0.0F, 0.3F, -0.7F, 0.0F, 0.0F, -1.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, -2.3F, 0.0F, -0.3F, 0.3F, 0.0F, 0.0F, 0.0F);
    barrelModel[75].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[76].addShapeBox(57.0F, -3.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.3F, -2.0F, 0.0F, -0.3F, -2.3F, 0.0F, -0.3F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.3F, -2.3F, 0.0F, 0.3F, -0.7F, 0.0F, 0.0F, -1.0F);
    barrelModel[76].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[77].addShapeBox(57.0F, -3.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.3F, 0.0F, -0.3F, -2.3F, 0.0F, -0.3F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.3F, -0.7F, 0.0F, 0.3F, -2.3F, 0.0F, 0.0F, -2.0F);
    barrelModel[77].setRotationPoint(-1.5F, -2.5F, 0.0F);
    
    barrelModel[78].addShapeBox(57.0F, -3.0F, -1.5F, 2, 1, 3, 0.0F, 0.0F, -0.3F, -1.0F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -0.7F, 0.0F, -0.3F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.3F, -0.7F, 0.0F, 0.3F, -0.7F, 0.0F, 0.0F, -1.0F);
    barrelModel[78].setRotationPoint(-1.5F, -2.5F, 0.0F);


    
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
