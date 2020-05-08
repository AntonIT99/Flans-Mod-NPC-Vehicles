package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;


public class ModelML20
  extends ModelVehicle
{
  int textureX = 512;
  int textureY = 512;

  
  public ModelML20() {
    bodyModel = new ModelRendererTurbo[100];
    bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 1, 1, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 65, 1, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 89, 1, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 17, 1, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 97, 1, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 145, 1, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 177, 1, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 25, 1, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 81, 1, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 41, 1, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 129, 1, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 145, 1, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 209, 1, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 329, 1, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 209, 17, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 449, 1, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 481, 1, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 169, 1, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 9, 9, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 73, 17, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 329, 17, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 473, 1, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 41, 9, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 449, 1, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 329, 17, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 185, 1, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 129, 9, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 81, 9, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 353, 17, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 177, 9, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 369, 17, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 81, 33, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 201, 33, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 481, 25, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 321, 33, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 489, 17, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 353, 25, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 369, 33, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 393, 33, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 145, 9, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 169, 9, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 1, 25, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 17, 25, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 41, 25, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 57, 25, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 97, 25, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 113, 25, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 425, 33, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 441, 33, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 457, 33, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 129, 25, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 153, 25, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 177, 25, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 1, 41, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 385, 33, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 25, 41, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 49, 41, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 473, 41, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 1, 49, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 25, 49, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 49, 49, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 73, 49, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 97, 49, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 121, 49, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 145, 49, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 169, 49, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 345, 41, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 185, 49, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 497, 41, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 209, 49, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 225, 49, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 241, 49, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 265, 49, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 289, 49, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 305, 49, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 321, 49, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 361, 49, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 377, 49, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 393, 49, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 409, 49, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 473, 49, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 1, 57, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 25, 57, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 49, 57, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 73, 57, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 97, 57, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 121, 57, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 145, 57, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 337, 57, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 169, 57, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 409, 57, textureX, textureY);
    bodyModel[94] = new ModelRendererTurbo(this, 433, 57, textureX, textureY);
    bodyModel[95] = new ModelRendererTurbo(this, 457, 57, textureX, textureY);
    bodyModel[96] = new ModelRendererTurbo(this, 1, 65, textureX, textureY);
    bodyModel[97] = new ModelRendererTurbo(this, 481, 57, textureX, textureY);
    bodyModel[98] = new ModelRendererTurbo(this, 17, 65, textureX, textureY);
    bodyModel[99] = new ModelRendererTurbo(this, 57, 65, textureX, textureY);
    
    bodyModel[0].addShapeBox(-0.5F, -0.5F, -17.5F, 1, 1, 35, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F);
    bodyModel[0].setRotationPoint(-1.0F, 0.0F, 0.0F);
    
    bodyModel[1].addShapeBox(0.0F, 0.0F, -7.0F, 4, 5, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(1.0F, -4.0F, 0.0F);
    
    bodyModel[2].addShapeBox(-1.0F, -2.5F, -3.0F, 2, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F);
    bodyModel[2].setRotationPoint(-1.0F, 3.0F, 0.0F);
    
    bodyModel[3].addBox(-0.5F, -0.5F, 0.0F, 1, 1, 1, 0.0F);
    bodyModel[3].setRotationPoint(-1.0F, 1.0F, 11.0F);
    
    bodyModel[4].addShapeBox(-0.5F, -2.5F, 0.0F, 1, 2, 8, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    bodyModel[4].setRotationPoint(-1.0F, 3.0F, 3.0F);
    
    bodyModel[5].addShapeBox(-0.5F, -2.5F, -8.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[5].setRotationPoint(-1.0F, 3.0F, -3.0F);
    
    bodyModel[6].addBox(-0.5F, -0.5F, -1.0F, 1, 1, 1, 0.0F);
    bodyModel[6].setRotationPoint(-1.0F, 1.0F, -11.0F);
    
    bodyModel[7].addBox(0.0F, 0.0F, -7.0F, 8, 5, 14, 0.0F);
    bodyModel[7].setRotationPoint(-7.0F, -4.0F, 0.0F);
    
    bodyModel[8].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[8].setRotationPoint(5.0F, -4.0F, 0.0F);
    
    bodyModel[9].addShapeBox(0.0F, 0.0F, -7.0F, 1, 5, 14, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[9].setRotationPoint(-8.0F, -4.0F, 0.0F);
    
    bodyModel[10].addShapeBox(0.0F, 0.0F, -0.5F, 1, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[10].setRotationPoint(-7.0F, -5.5F, 5.0F);
    
    bodyModel[11].addShapeBox(-2.0F, 0.0F, -2.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[11].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[11]).rotateAngleY = -0.43633232F;
    
    bodyModel[12].addShapeBox(1.0F, 0.0F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[12].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[12]).rotateAngleY = -0.43633232F;
    
    bodyModel[13].addShapeBox(-2.0F, 0.0F, -2.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[13].setRotationPoint(-6.5F, 1.0F, 5.0F);
    (bodyModel[13]).rotateAngleY = -0.43633232F;
    
    bodyModel[14].addShapeBox(1.0F, 0.0F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[14].setRotationPoint(-6.5F, 1.0F, 5.0F);
    (bodyModel[14]).rotateAngleY = -0.43633232F;
    
    bodyModel[15].addShapeBox(-57.0F, 1.0F, -1.5F, 55, 12, 3, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[15].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[15]).rotateAngleY = -0.43633232F;
    
    bodyModel[16].addShapeBox(-57.0F, 0.0F, -2.0F, 55, 11, 4, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[16].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[16]).rotateAngleY = -0.43633232F;
    
    bodyModel[17].addShapeBox(-57.0F, 6.0F, -2.0F, 55, 8, 4, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[17].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[17]).rotateAngleY = -0.43633232F;
    
    bodyModel[18].addShapeBox(-60.0F, 10.0F, -5.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[18].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[18]).rotateAngleY = -0.43633232F;
    
    bodyModel[19].addShapeBox(-60.0F, 13.0F, -5.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[19].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[19]).rotateAngleY = -0.43633232F;
    
    bodyModel[20].addShapeBox(-60.0F, 11.0F, -1.5F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[20].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[20]).rotateAngleY = -0.43633232F;
    
    bodyModel[21].addShapeBox(-62.0F, 10.0F, -5.0F, 2, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[21].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[21]).rotateAngleY = -0.43633232F;
    
    bodyModel[22].addShapeBox(-63.0F, 10.0F, -5.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[22].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[22]).rotateAngleY = -0.43633232F;
    
    bodyModel[23].addShapeBox(-66.0F, 13.0F, -5.0F, 4, 1, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[23].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[23]).rotateAngleY = -0.43633232F;
    
    bodyModel[24].addShapeBox(-66.0F, 11.0F, 1.0F, 4, 2, 1, 0.0F, -2.9F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -2.9F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    bodyModel[24].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[24]).rotateAngleY = -0.43633232F;
    
    bodyModel[25].addShapeBox(-66.0F, 11.0F, -2.0F, 4, 2, 1, 0.0F, -2.9F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -2.9F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    bodyModel[25].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[25]).rotateAngleY = -0.43633232F;
    
    bodyModel[26].addShapeBox(-62.0F, 4.0F, -2.5F, 2, 6, 2, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
    bodyModel[26].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[26]).rotateAngleY = -0.43633232F;
    
    bodyModel[27].addShapeBox(-62.0F, 4.0F, 0.5F, 2, 6, 2, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
    bodyModel[27].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[27]).rotateAngleY = -0.43633232F;
    
    bodyModel[28].addShapeBox(0.0F, 0.0F, -0.5F, 1, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[28].setRotationPoint(-7.0F, -5.5F, -5.0F);
    
    bodyModel[29].addShapeBox(-2.0F, 0.0F, -2.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[29].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[29]).rotateAngleY = 0.43633232F;
    
    bodyModel[30].addShapeBox(1.0F, 0.0F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[30].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[30]).rotateAngleY = 0.43633232F;
    
    bodyModel[31].addShapeBox(-2.0F, 0.0F, -2.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[31].setRotationPoint(-6.5F, 1.0F, -5.0F);
    (bodyModel[31]).rotateAngleY = 0.43633232F;
    
    bodyModel[32].addShapeBox(1.0F, 0.0F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[32].setRotationPoint(-6.5F, 1.0F, -5.0F);
    (bodyModel[32]).rotateAngleY = 0.43633232F;
    
    bodyModel[33].addShapeBox(-57.0F, 1.0F, -1.5F, 55, 12, 3, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[33].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[33]).rotateAngleY = 0.43633232F;
    
    bodyModel[34].addShapeBox(-57.0F, 0.0F, -2.0F, 55, 11, 4, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[34].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[34]).rotateAngleY = 0.43633232F;
    
    bodyModel[35].addShapeBox(-57.0F, 6.0F, -2.0F, 55, 8, 4, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[35].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[35]).rotateAngleY = 0.43633232F;
    
    bodyModel[36].addShapeBox(-60.0F, 10.0F, -5.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[36].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[36]).rotateAngleY = 0.43633232F;
    
    bodyModel[37].addShapeBox(-60.0F, 13.0F, -5.0F, 3, 1, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[37].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[37]).rotateAngleY = 0.43633232F;
    
    bodyModel[38].addShapeBox(-60.0F, 11.0F, -1.5F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[38].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[38]).rotateAngleY = 0.43633232F;
    
    bodyModel[39].addShapeBox(-62.0F, 10.0F, -5.0F, 2, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[39].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[39]).rotateAngleY = 0.43633232F;
    
    bodyModel[40].addShapeBox(-63.0F, 10.0F, -5.0F, 1, 1, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[40].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[40]).rotateAngleY = 0.43633232F;
    
    bodyModel[41].addShapeBox(-66.0F, 13.0F, -5.0F, 4, 1, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[41].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[41]).rotateAngleY = 0.43633232F;
    
    bodyModel[42].addShapeBox(-66.0F, 11.0F, 1.0F, 4, 2, 1, 0.0F, -2.9F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -2.9F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    bodyModel[42].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[42]).rotateAngleY = 0.43633232F;
    
    bodyModel[43].addShapeBox(-66.0F, 11.0F, -2.0F, 4, 2, 1, 0.0F, -2.9F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, -2.9F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F);
    bodyModel[43].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[43]).rotateAngleY = 0.43633232F;
    
    bodyModel[44].addShapeBox(-62.0F, 4.0F, 0.5F, 2, 6, 2, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
    bodyModel[44].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[44]).rotateAngleY = 0.43633232F;
    
    bodyModel[45].addShapeBox(-62.0F, 4.0F, -2.5F, 2, 6, 2, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F);
    bodyModel[45].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[45]).rotateAngleY = 0.43633232F;
    
    bodyModel[46].addShapeBox(-61.0F, 5.0F, 0.5F, 2, 5, 2, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[46].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[46]).rotateAngleY = -0.43633232F;
    
    bodyModel[47].addShapeBox(-61.0F, 5.0F, -2.5F, 2, 5, 2, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[47].setRotationPoint(-6.5F, -5.0F, 5.0F);
    (bodyModel[47]).rotateAngleY = -0.43633232F;
    
    bodyModel[48].addShapeBox(-61.0F, 5.0F, 0.5F, 2, 5, 2, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[48].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[48]).rotateAngleY = 0.43633232F;
    
    bodyModel[49].addShapeBox(-61.0F, 5.0F, -2.5F, 2, 5, 2, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, -1.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[49].setRotationPoint(-6.5F, -5.0F, -5.0F);
    (bodyModel[49]).rotateAngleY = 0.43633232F;
    
    bodyModel[50].addShapeBox(-2.5F, -8.0F, 0.0F, 5, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[50].setRotationPoint(-1.0F, 0.0F, 13.0F);
    
    bodyModel[51].addShapeBox(2.5F, -8.0F, 0.0F, 5, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[51].setRotationPoint(-1.0F, 0.0F, 13.0F);
    
    bodyModel[52].addShapeBox(-7.5F, -8.0F, 0.0F, 5, 16, 1, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F);
    bodyModel[52].setRotationPoint(-1.0F, 0.0F, 13.0F);
    
    bodyModel[53].addShapeBox(-3.0F, -9.0F, -0.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F);
    bodyModel[53].setRotationPoint(-1.0F, 0.0F, 13.0F);
    
    bodyModel[54].addShapeBox(-4.5F, -8.45F, -0.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F);
    bodyModel[54].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[54]).rotateAngleZ = -0.7853982F;
    
    bodyModel[55].addShapeBox(-3.0F, -9.0F, -0.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F);
    bodyModel[55].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[55]).rotateAngleZ = -1.5707964F;
    
    bodyModel[56].addShapeBox(-4.5F, -8.45F, -0.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F);
    bodyModel[56].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[56]).rotateAngleZ = -2.3561945F;
    
    bodyModel[57].addShapeBox(-3.0F, -9.0F, -0.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F);
    bodyModel[57].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[57]).rotateAngleZ = -3.1415927F;
    
    bodyModel[58].addShapeBox(-4.5F, -8.45F, -0.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F);
    bodyModel[58].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[58]).rotateAngleZ = 0.7853982F;
    
    bodyModel[59].addShapeBox(-3.0F, -9.0F, -0.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F);
    bodyModel[59].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[59]).rotateAngleZ = 1.5707964F;
    
    bodyModel[60].addShapeBox(-4.5F, -8.45F, -0.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F);
    bodyModel[60].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[60]).rotateAngleZ = 2.3561945F;
    
    bodyModel[61].addShapeBox(-3.0F, -9.0F, 1.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
    bodyModel[61].setRotationPoint(-1.0F, 0.0F, 13.0F);
    
    bodyModel[62].addShapeBox(-4.5F, -8.45F, 1.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F);
    bodyModel[62].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[62]).rotateAngleZ = -0.7853982F;
    
    bodyModel[63].addShapeBox(-4.5F, -8.45F, 1.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F);
    bodyModel[63].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[63]).rotateAngleZ = 0.7853982F;
    
    bodyModel[64].addShapeBox(-3.0F, -9.0F, 1.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
    bodyModel[64].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[64]).rotateAngleZ = -1.5707964F;
    
    bodyModel[65].addShapeBox(-3.0F, -9.0F, 1.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
    bodyModel[65].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[65]).rotateAngleZ = 1.5707964F;
    
    bodyModel[66].addShapeBox(-4.5F, -8.45F, 1.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F);
    bodyModel[66].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[66]).rotateAngleZ = -2.3561945F;
    
    bodyModel[67].addShapeBox(-4.5F, -8.45F, 1.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F);
    bodyModel[67].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[67]).rotateAngleZ = 2.3561945F;
    
    bodyModel[68].addShapeBox(-3.0F, -9.0F, 1.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
    bodyModel[68].setRotationPoint(-1.0F, 0.0F, 13.0F);
    (bodyModel[68]).rotateAngleZ = -3.1415927F;
    
    bodyModel[69].addShapeBox(-1.5F, -1.5F, -4.0F, 3, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[69].setRotationPoint(-1.0F, 0.0F, -13.0F);
    
    bodyModel[70].addShapeBox(-2.5F, -2.5F, -0.5F, 5, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[70].setRotationPoint(-1.0F, 0.0F, 13.0F);
    
    bodyModel[71].addShapeBox(-2.5F, -8.0F, 2.0F, 5, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[71].setRotationPoint(-1.0F, 0.0F, 13.0F);
    
    bodyModel[72].addShapeBox(2.5F, -8.0F, 2.0F, 5, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[72].setRotationPoint(-1.0F, 0.0F, 13.0F);
    
    bodyModel[73].addShapeBox(-7.5F, -8.0F, 2.0F, 5, 16, 1, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F);
    bodyModel[73].setRotationPoint(-1.0F, 0.0F, 13.0F);
    
    bodyModel[74].addShapeBox(-1.5F, -1.5F, -1.0F, 3, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[74].setRotationPoint(-1.0F, 0.0F, 13.0F);
    
    bodyModel[75].addShapeBox(-2.5F, -2.5F, -3.5F, 5, 5, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[75].setRotationPoint(-1.0F, 0.0F, -13.0F);
    
    bodyModel[76].addShapeBox(-2.5F, -8.0F, -1.0F, 5, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[76].setRotationPoint(-1.0F, 0.0F, -13.0F);
    
    bodyModel[77].addShapeBox(-7.5F, -8.0F, -1.0F, 5, 16, 1, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F);
    bodyModel[77].setRotationPoint(-1.0F, 0.0F, -13.0F);
    
    bodyModel[78].addShapeBox(2.5F, -8.0F, -1.0F, 5, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[78].setRotationPoint(-1.0F, 0.0F, -13.0F);
    
    bodyModel[79].addShapeBox(-2.5F, -8.0F, -3.0F, 5, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[79].setRotationPoint(-1.0F, 0.0F, -13.0F);
    
    bodyModel[80].addShapeBox(2.5F, -8.0F, -3.0F, 5, 16, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[80].setRotationPoint(-1.0F, 0.0F, -13.0F);
    
    bodyModel[81].addShapeBox(-7.5F, -8.0F, -3.0F, 5, 16, 1, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F, 0.5F, -5.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -5.5F, 0.0F);
    bodyModel[81].setRotationPoint(-1.0F, 0.0F, -13.0F);
    
    bodyModel[82].addShapeBox(-3.0F, -9.0F, -1.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
    bodyModel[82].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[82]).rotateAngleZ = -3.1415927F;
    
    bodyModel[83].addShapeBox(-4.5F, -8.45F, -1.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F);
    bodyModel[83].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[83]).rotateAngleZ = -2.3561945F;
    
    bodyModel[84].addShapeBox(-4.5F, -8.45F, -1.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F);
    bodyModel[84].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[84]).rotateAngleZ = 2.3561945F;
    
    bodyModel[85].addShapeBox(-3.0F, -9.0F, -1.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
    bodyModel[85].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[85]).rotateAngleZ = -1.5707964F;
    
    bodyModel[86].addShapeBox(-3.0F, -9.0F, -1.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
    bodyModel[86].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[86]).rotateAngleZ = 1.5707964F;
    
    bodyModel[87].addShapeBox(-4.5F, -8.45F, -1.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F);
    bodyModel[87].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[87]).rotateAngleZ = 0.7853982F;
    
    bodyModel[88].addShapeBox(-4.5F, -8.45F, -1.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F);
    bodyModel[88].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[88]).rotateAngleZ = -0.7853982F;
    
    bodyModel[89].addShapeBox(-3.0F, -9.0F, -1.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F);
    bodyModel[89].setRotationPoint(-1.0F, 0.0F, -13.0F);
    
    bodyModel[90].addShapeBox(-3.0F, -9.0F, -3.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F);
    bodyModel[90].setRotationPoint(-1.0F, 0.0F, -13.0F);
    
    bodyModel[91].addShapeBox(-4.5F, -8.45F, -3.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F);
    bodyModel[91].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[91]).rotateAngleZ = -0.7853982F;
    
    bodyModel[92].addShapeBox(-3.0F, -9.0F, -3.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F);
    bodyModel[92].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[92]).rotateAngleZ = -1.5707964F;
    
    bodyModel[93].addShapeBox(-4.5F, -8.45F, -3.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F);
    bodyModel[93].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[93]).rotateAngleZ = 0.7853982F;
    
    bodyModel[94].addShapeBox(-3.0F, -9.0F, -3.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F);
    bodyModel[94].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[94]).rotateAngleZ = 1.5707964F;
    
    bodyModel[95].addShapeBox(-4.5F, -8.45F, -3.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F);
    bodyModel[95].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[95]).rotateAngleZ = -2.3561945F;
    
    bodyModel[96].addShapeBox(-4.5F, -8.45F, -3.5F, 9, 1, 2, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, 0.0F, -0.22F, 0.0F, -0.25F, -0.22F, 0.0F, -0.25F);
    bodyModel[96].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[96]).rotateAngleZ = 2.3561945F;
    
    bodyModel[97].addShapeBox(-3.0F, -9.0F, -3.5F, 6, 1, 2, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, 0.0F, -0.05F, 0.0F, -0.25F, -0.05F, 0.0F, -0.25F);
    bodyModel[97].setRotationPoint(-1.0F, 0.0F, -13.0F);
    (bodyModel[97]).rotateAngleZ = -3.1415927F;
    
    bodyModel[98].addShapeBox(-4.0F, 0.0F, -4.0F, 8, 1, 8, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
    bodyModel[98].setRotationPoint(0.0F, -5.0F, 0.0F);
    
    bodyModel[99].addShapeBox(4.0F, 0.0F, -4.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[99].setRotationPoint(0.0F, -5.0F, 0.0F);

    
    turretModel = new ModelRendererTurbo[80];
    turretModel[0] = new ModelRendererTurbo(this, 81, 65, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 41, 33, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 105, 65, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 497, 17, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 121, 65, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 153, 65, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 65, 33, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 105, 1, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 185, 65, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 241, 65, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 409, 65, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 337, 65, textureX, textureY);
    turretModel[14] = new ModelRendererTurbo(this, 505, 1, textureX, textureY);
    turretModel[15] = new ModelRendererTurbo(this, 201, 9, textureX, textureY);
    turretModel[16] = new ModelRendererTurbo(this, 1, 17, textureX, textureY);
    turretModel[17] = new ModelRendererTurbo(this, 321, 33, textureX, textureY);
    turretModel[18] = new ModelRendererTurbo(this, 337, 49, textureX, textureY);
    turretModel[19] = new ModelRendererTurbo(this, 89, 17, textureX, textureY);
    turretModel[20] = new ModelRendererTurbo(this, 201, 25, textureX, textureY);
    turretModel[21] = new ModelRendererTurbo(this, 505, 25, textureX, textureY);
    turretModel[22] = new ModelRendererTurbo(this, 345, 33, textureX, textureY);
    turretModel[23] = new ModelRendererTurbo(this, 417, 33, textureX, textureY);
    turretModel[24] = new ModelRendererTurbo(this, 473, 33, textureX, textureY);
    turretModel[25] = new ModelRendererTurbo(this, 73, 41, textureX, textureY);
    turretModel[26] = new ModelRendererTurbo(this, 49, 1, textureX, textureY);
    turretModel[27] = new ModelRendererTurbo(this, 9, 33, textureX, textureY);
    turretModel[28] = new ModelRendererTurbo(this, 25, 33, textureX, textureY);
    turretModel[29] = new ModelRendererTurbo(this, 361, 41, textureX, textureY);
    turretModel[30] = new ModelRendererTurbo(this, 257, 57, textureX, textureY);
    turretModel[31] = new ModelRendererTurbo(this, 49, 65, textureX, textureY);
    turretModel[32] = new ModelRendererTurbo(this, 57, 65, textureX, textureY);
    turretModel[33] = new ModelRendererTurbo(this, 73, 65, textureX, textureY);
    turretModel[34] = new ModelRendererTurbo(this, 201, 49, textureX, textureY);
    turretModel[35] = new ModelRendererTurbo(this, 265, 65, textureX, textureY);
    turretModel[36] = new ModelRendererTurbo(this, 97, 65, textureX, textureY);
    turretModel[37] = new ModelRendererTurbo(this, 353, 65, textureX, textureY);
    turretModel[38] = new ModelRendererTurbo(this, 441, 65, textureX, textureY);
    turretModel[39] = new ModelRendererTurbo(this, 457, 65, textureX, textureY);
    turretModel[40] = new ModelRendererTurbo(this, 241, 49, textureX, textureY);
    turretModel[41] = new ModelRendererTurbo(this, 281, 65, textureX, textureY);
    turretModel[42] = new ModelRendererTurbo(this, 473, 65, textureX, textureY);
    turretModel[43] = new ModelRendererTurbo(this, 257, 49, textureX, textureY);
    turretModel[44] = new ModelRendererTurbo(this, 497, 65, textureX, textureY);
    turretModel[45] = new ModelRendererTurbo(this, 281, 49, textureX, textureY);
    turretModel[46] = new ModelRendererTurbo(this, 97, 65, textureX, textureY);
    turretModel[47] = new ModelRendererTurbo(this, 473, 65, textureX, textureY);
    turretModel[48] = new ModelRendererTurbo(this, 505, 65, textureX, textureY);
    turretModel[49] = new ModelRendererTurbo(this, 1, 73, textureX, textureY);
    turretModel[50] = new ModelRendererTurbo(this, 121, 73, textureX, textureY);
    turretModel[51] = new ModelRendererTurbo(this, 449, 57, textureX, textureY);
    turretModel[52] = new ModelRendererTurbo(this, 145, 73, textureX, textureY);
    turretModel[53] = new ModelRendererTurbo(this, 9, 73, textureX, textureY);
    turretModel[54] = new ModelRendererTurbo(this, 49, 73, textureX, textureY);
    turretModel[55] = new ModelRendererTurbo(this, 73, 73, textureX, textureY);
    turretModel[56] = new ModelRendererTurbo(this, 137, 73, textureX, textureY);
    turretModel[57] = new ModelRendererTurbo(this, 169, 73, textureX, textureY);
    turretModel[58] = new ModelRendererTurbo(this, 145, 73, textureX, textureY);
    turretModel[59] = new ModelRendererTurbo(this, 185, 73, textureX, textureY);
    turretModel[60] = new ModelRendererTurbo(this, 209, 73, textureX, textureY);
    turretModel[61] = new ModelRendererTurbo(this, 225, 73, textureX, textureY);
    turretModel[62] = new ModelRendererTurbo(this, 249, 73, textureX, textureY);
    turretModel[63] = new ModelRendererTurbo(this, 489, 65, textureX, textureY);
    turretModel[64] = new ModelRendererTurbo(this, 161, 73, textureX, textureY);
    turretModel[65] = new ModelRendererTurbo(this, 281, 73, textureX, textureY);
    turretModel[66] = new ModelRendererTurbo(this, 201, 73, textureX, textureY);
    turretModel[67] = new ModelRendererTurbo(this, 217, 73, textureX, textureY);
    turretModel[68] = new ModelRendererTurbo(this, 297, 73, textureX, textureY);
    turretModel[69] = new ModelRendererTurbo(this, 241, 73, textureX, textureY);
    turretModel[70] = new ModelRendererTurbo(this, 313, 73, textureX, textureY);
    turretModel[71] = new ModelRendererTurbo(this, 329, 73, textureX, textureY);
    turretModel[72] = new ModelRendererTurbo(this, 337, 73, textureX, textureY);
    turretModel[73] = new ModelRendererTurbo(this, 345, 73, textureX, textureY);
    turretModel[74] = new ModelRendererTurbo(this, 353, 73, textureX, textureY);
    turretModel[75] = new ModelRendererTurbo(this, 369, 73, textureX, textureY);
    turretModel[76] = new ModelRendererTurbo(this, 385, 73, textureX, textureY);
    turretModel[77] = new ModelRendererTurbo(this, 401, 73, textureX, textureY);
    turretModel[78] = new ModelRendererTurbo(this, 417, 73, textureX, textureY);
    turretModel[79] = new ModelRendererTurbo(this, 433, 73, textureX, textureY);
    
    turretModel[0].addBox(3.0F, 0.0F, -4.0F, 3, 1, 8, 0.0F);
    turretModel[0].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[1].addShapeBox(-6.0F, 0.0F, 3.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
    turretModel[1].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[2].addShapeBox(6.0F, 0.0F, -4.0F, 1, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretModel[2].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[3].addShapeBox(-4.5F, 0.0F, -3.0F, 1, 1, 6, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F);
    turretModel[3].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[4].addShapeBox(-9.0F, -3.0F, 3.0F, 12, 3, 1, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    turretModel[4].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[5].addShapeBox(-9.0F, -5.0F, 3.0F, 11, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[5].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[6].addShapeBox(-9.0F, -6.0F, 3.0F, 7, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[6].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[7].addShapeBox(-5.0F, -9.0F, 3.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F);
    turretModel[7].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[8].addShapeBox(-3.0F, -9.0F, 3.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.2F, 0.0F, 0.0F, 0.2F);
    turretModel[8].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[9].addShapeBox(-6.0F, -9.0F, 3.0F, 1, 4, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, -1.0F, 0.2F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, -1.0F, 0.2F);
    turretModel[9].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[10].addShapeBox(-6.0F, 0.0F, -4.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F);
    turretModel[10].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[11].addShapeBox(-9.0F, -3.0F, -4.0F, 12, 3, 1, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    turretModel[11].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[12].addShapeBox(-9.0F, -5.0F, -4.0F, 11, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[12].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[13].addShapeBox(-9.0F, -6.0F, -4.0F, 7, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[13].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[14].addShapeBox(-5.0F, -9.0F, -4.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[14].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[15].addShapeBox(-6.0F, -9.0F, -4.0F, 1, 4, 1, 0.0F, 0.0F, -1.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    turretModel[15].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[16].addShapeBox(-3.0F, -9.0F, -4.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, -1.0F, 0.2F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, -1.0F, 0.2F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[16].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[17].addShapeBox(-8.0F, -8.0F, 3.0F, 3, 3, 1, 0.0F, -2.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[17].setRotationPoint(0.0F, -7.0F, 0.0F);
    
    turretModel[18].addShapeBox(-8.0F, -8.0F, -4.0F, 3, 3, 1, 0.0F, -2.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.25F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[18].setRotationPoint(0.0F, -7.0F, 0.0F);
    
    turretModel[19].addShapeBox(-6.0F, -3.0F, -6.0F, 1, 1, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[19].setRotationPoint(0.0F, -6.0F, 0.0F);
    (turretModel[19]).rotateAngleY = -0.17453294F;
    
    turretModel[20].addShapeBox(-6.5F, -4.5F, -7.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[20].setRotationPoint(0.0F, -6.0F, 0.0F);
    (turretModel[20]).rotateAngleY = -0.17453294F;
    
    turretModel[21].addShapeBox(-4.5F, -4.5F, -7.0F, 1, 4, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[21].setRotationPoint(0.0F, -6.0F, 0.0F);
    (turretModel[21]).rotateAngleY = -0.17453294F;
    
    turretModel[22].addShapeBox(-7.5F, -4.5F, -7.0F, 1, 4, 1, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    turretModel[22].setRotationPoint(0.0F, -6.0F, 0.0F);
    (turretModel[22]).rotateAngleY = -0.17453294F;
    
    turretModel[23].addShapeBox(-6.5F, -3.5F, -6.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    turretModel[23].setRotationPoint(0.0F, -6.0F, 0.0F);
    (turretModel[23]).rotateAngleY = -0.17453294F;
    
    turretModel[24].addShapeBox(-7.5F, -2.5F, -8.5F, 1, 1, 2, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F);
    turretModel[24].setRotationPoint(0.0F, -6.0F, 0.0F);
    (turretModel[24]).rotateAngleY = -0.17453294F;
    
    turretModel[25].addShapeBox(-4.0F, -3.0F, 4.0F, 1, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    turretModel[25].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[26].addShapeBox(0.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[26].setRotationPoint(-4.0F, -8.0F, 6.0F);
    (turretModel[26]).rotateAngleY = -0.2617994F;
    
    turretModel[27].addShapeBox(0.0F, -2.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[27].setRotationPoint(-4.0F, -8.0F, 6.0F);
    (turretModel[27]).rotateAngleY = -0.2617994F;
    
    turretModel[28].addShapeBox(0.0F, 1.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
    turretModel[28].setRotationPoint(-4.0F, -8.0F, 6.0F);
    (turretModel[28]).rotateAngleY = -0.2617994F;
    
    turretModel[29].addShapeBox(-1.0F, -1.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    turretModel[29].setRotationPoint(-4.0F, -8.0F, 6.0F);
    (turretModel[29]).rotateAngleY = -0.2617994F;
    
    turretModel[30].addShapeBox(-2.0F, -2.5F, -0.5F, 1, 4, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[30].setRotationPoint(-4.0F, -8.0F, 6.0F);
    (turretModel[30]).rotateAngleY = -0.2617994F;
    
    turretModel[31].addShapeBox(-2.0F, -2.5F, 1.5F, 1, 4, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F);
    turretModel[31].setRotationPoint(-4.0F, -8.0F, 6.0F);
    (turretModel[31]).rotateAngleY = -0.2617994F;
    
    turretModel[32].addShapeBox(-2.0F, -2.5F, -1.5F, 1, 4, 1, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[32].setRotationPoint(-4.0F, -8.0F, 6.0F);
    (turretModel[32]).rotateAngleY = -0.2617994F;
    
    turretModel[33].addShapeBox(0.0F, -1.0F, -4.0F, 3, 2, 4, 0.0F, 0.0F, -0.2F, -3.2F, 0.0F, -1.2F, -0.2F, 0.0F, -1.2F, -3.2F, 0.0F, -0.2F, -0.2F, 0.0F, -1.2F, -3.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -3.2F, 0.0F, -1.2F, -0.2F);
    turretModel[33].setRotationPoint(-3.0F, -8.0F, 6.8F);
    
    turretModel[34].addShapeBox(-3.5F, -2.0F, 1.0F, 2, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    turretModel[34].setRotationPoint(-4.0F, -8.0F, 6.0F);
    (turretModel[34]).rotateAngleY = -0.2617994F;
    
    turretModel[35].addShapeBox(1.0F, -2.0F, -3.0F, 2, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    turretModel[35].setRotationPoint(0.0F, -7.0F, 0.0F);
    
    turretModel[36].addShapeBox(-5.0F, -8.0F, 4.0F, 2, 2, 5, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, 0.0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F);
    turretModel[36].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[37].addShapeBox(-4.5F, -8.5F, 5.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[37].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[38].addShapeBox(-3.5F, -8.5F, 5.0F, 1, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[38].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[39].addShapeBox(-5.5F, -8.5F, 5.0F, 1, 3, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    turretModel[39].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[40].addShapeBox(-6.5F, -8.5F, 6.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[40].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[41].addBox(4.0F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
    turretModel[41].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[42].addShapeBox(0.0F, 0.0F, -5.0F, 4, 2, 5, 0.0F, 0.0F, -0.2F, -4.2F, 0.0F, -1.2F, -0.2F, 0.0F, -1.2F, -4.2F, 0.0F, -0.2F, -0.2F, 0.0F, -1.2F, -4.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -4.2F, 0.0F, -1.2F, -0.2F);
    turretModel[42].setRotationPoint(0.0F, -8.0F, 3.8F);
    
    turretModel[43].addBox(0.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F);
    turretModel[43].setRotationPoint(5.0F, -6.0F, 4.0F);
    (turretModel[43]).rotateAngleZ = 0.2617994F;
    
    turretModel[44].addBox(0.0F, -23.0F, 3.5F, 1, 22, 2, 0.0F);
    turretModel[44].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[44]).rotateAngleZ = 0.2617994F;
    
    turretModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F);
    turretModel[45].setRotationPoint(5.0F, -6.0F, 4.0F);
    (turretModel[45]).rotateAngleZ = 0.2617994F;
    
    turretModel[46].addShapeBox(0.0F, 0.0F, -1.0F, 1, 1, 1, 0.0F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.0F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F, 0.25F, 0.1F, 0.25F);
    turretModel[46].setRotationPoint(5.0F, -6.0F, -4.0F);
    (turretModel[46]).rotateAngleZ = 0.2617994F;
    
    turretModel[47].addBox(0.0F, -1.0F, -1.0F, 1, 2, 1, 0.0F);
    turretModel[47].setRotationPoint(5.0F, -6.0F, -4.0F);
    (turretModel[47]).rotateAngleZ = 0.2617994F;
    
    turretModel[48].addBox(0.0F, -23.0F, -5.5F, 1, 22, 2, 0.0F);
    turretModel[48].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[48]).rotateAngleZ = 0.2617994F;
    
    turretModel[49].addShapeBox(1.0F, -23.0F, -5.5F, 1, 22, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
    turretModel[49].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[49]).rotateAngleZ = 0.2617994F;
    
    turretModel[50].addShapeBox(-2.5F, -8.0F, 4.0F, 1, 5, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[50].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[51].addShapeBox(-2.5F, -3.0F, 7.0F, 1, 4, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[51].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[52].addShapeBox(-1.0F, -2.0F, 0.0F, 1, 2, 7, 0.0F, -0.5F, 0.07F, 0.0F, 0.0F, 0.07F, 0.0F, 0.0F, 0.07F, 0.0F, -0.5F, 0.07F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[52].setRotationPoint(-1.5F, -14.0F, 4.0F);
    (turretModel[52]).rotateAngleZ = 0.2443461F;
    
    turretModel[53].addShapeBox(-1.0F, -7.0F, 0.0F, 1, 7, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[53].setRotationPoint(-2.0F, -16.0F, 4.0F);
    (turretModel[53]).rotateAngleZ = 0.61086524F;
    
    turretModel[54].addShapeBox(-1.0F, -7.0F, 4.0F, 1, 7, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[54].setRotationPoint(-2.0F, -16.0F, 4.0F);
    (turretModel[54]).rotateAngleZ = 0.61086524F;
    
    turretModel[55].addShapeBox(-1.0F, -7.0F, 1.0F, 1, 4, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[55].setRotationPoint(-2.0F, -16.0F, 4.0F);
    (turretModel[55]).rotateAngleZ = 0.61086524F;
    
    turretModel[56].addShapeBox(-1.0F, -7.0F, 3.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[56].setRotationPoint(-2.0F, -16.0F, 0.0F);
    (turretModel[56]).rotateAngleZ = 0.61086524F;
    
    turretModel[57].addShapeBox(-1.0F, -7.0F, -3.0F, 1, 3, 6, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[57].setRotationPoint(-2.0F, -16.0F, 0.0F);
    (turretModel[57]).rotateAngleZ = 0.61086524F;
    
    turretModel[58].addShapeBox(-1.0F, -7.0F, -4.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[58].setRotationPoint(-2.0F, -16.0F, 0.0F);
    (turretModel[58]).rotateAngleZ = 0.61086524F;
    
    turretModel[59].addShapeBox(-2.5F, -8.0F, -11.0F, 1, 5, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[59].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[60].addShapeBox(-2.5F, -3.0F, -11.0F, 1, 4, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[60].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[61].addShapeBox(-1.0F, -2.0F, -7.0F, 1, 2, 7, 0.0F, -0.5F, 0.07F, 0.0F, 0.0F, 0.07F, 0.0F, 0.0F, 0.07F, 0.0F, -0.5F, 0.07F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[61].setRotationPoint(-1.5F, -14.0F, -4.0F);
    (turretModel[61]).rotateAngleZ = 0.2443461F;
    
    turretModel[62].addShapeBox(-1.0F, -7.0F, -7.0F, 1, 7, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[62].setRotationPoint(-2.0F, -16.0F, -4.0F);
    (turretModel[62]).rotateAngleZ = 0.61086524F;
    
    turretModel[63].addShapeBox(-1.0F, -4.0F, -3.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9F, -0.5F, 0.0F, -1.9F);
    turretModel[63].setRotationPoint(-2.0F, -16.0F, 0.0F);
    (turretModel[63]).rotateAngleZ = 0.61086524F;
    
    turretModel[64].addShapeBox(-1.0F, -4.0F, 1.0F, 1, 2, 2, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    turretModel[64].setRotationPoint(-2.0F, -16.0F, 0.0F);
    (turretModel[64]).rotateAngleZ = 0.61086524F;
    
    turretModel[65].addShapeBox(-3.0F, -4.5F, -10.0F, 1, 1, 6, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
    turretModel[65].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[66].addShapeBox(-6.5F, -4.5F, -5.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    turretModel[66].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[67].addShapeBox(-6.5F, -4.5F, 4.0F, 4, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    turretModel[67].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[68].addShapeBox(-3.0F, -4.5F, 4.0F, 1, 1, 6, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
    turretModel[68].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    turretModel[69].addShapeBox(-5.0F, -1.0F, 0.0F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[69].setRotationPoint(-4.0F, -18.0F, 3.0F);
    (turretModel[69]).rotateAngleZ = 1.1519173F;
    
    turretModel[70].addShapeBox(-5.0F, -1.0F, -1.0F, 5, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.5F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[70].setRotationPoint(-4.0F, -18.0F, -3.0F);
    (turretModel[70]).rotateAngleZ = 1.1519173F;
    
    turretModel[71].addShapeBox(-1.0F, -23.0F, -5.5F, 1, 22, 2, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F);
    turretModel[71].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[71]).rotateAngleZ = 0.2617994F;
    
    turretModel[72].addShapeBox(1.0F, -23.0F, 3.5F, 1, 22, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
    turretModel[72].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[72]).rotateAngleZ = 0.2617994F;
    
    turretModel[73].addShapeBox(-1.0F, -23.0F, 3.5F, 1, 22, 2, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F);
    turretModel[73].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[73]).rotateAngleZ = 0.2617994F;
    
    turretModel[74].addShapeBox(0.0F, -24.0F, 3.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[74].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[74]).rotateAngleZ = 0.2617994F;
    
    turretModel[75].addShapeBox(1.0F, -24.0F, 3.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    turretModel[75].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[75]).rotateAngleZ = 0.2617994F;
    
    turretModel[76].addShapeBox(-1.0F, -24.0F, 3.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    turretModel[76].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[76]).rotateAngleZ = 0.2617994F;
    
    turretModel[77].addShapeBox(0.0F, -24.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[77].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[77]).rotateAngleZ = 0.2617994F;
    
    turretModel[78].addShapeBox(-1.0F, -24.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    turretModel[78].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[78]).rotateAngleZ = 0.2617994F;
    
    turretModel[79].addShapeBox(1.0F, -24.0F, -6.0F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    turretModel[79].setRotationPoint(5.0F, -6.0F, 0.0F);
    (turretModel[79]).rotateAngleZ = 0.2617994F;

    
    barrelModel = new ModelRendererTurbo[128];
    barrelModel[0] = new ModelRendererTurbo(this, 353, 81, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 9, 89, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 105, 89, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 457, 73, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 473, 73, textureX, textureY);
    barrelModel[5] = new ModelRendererTurbo(this, 465, 65, textureX, textureY);
    barrelModel[6] = new ModelRendererTurbo(this, 185, 73, textureX, textureY);
    barrelModel[7] = new ModelRendererTurbo(this, 17, 81, textureX, textureY);
    barrelModel[8] = new ModelRendererTurbo(this, 361, 73, textureX, textureY);
    barrelModel[9] = new ModelRendererTurbo(this, 377, 73, textureX, textureY);
    barrelModel[10] = new ModelRendererTurbo(this, 193, 89, textureX, textureY);
    barrelModel[11] = new ModelRendererTurbo(this, 353, 89, textureX, textureY);
    barrelModel[12] = new ModelRendererTurbo(this, 9, 97, textureX, textureY);
    barrelModel[13] = new ModelRendererTurbo(this, 57, 81, textureX, textureY);
    barrelModel[14] = new ModelRendererTurbo(this, 81, 81, textureX, textureY);
    barrelModel[15] = new ModelRendererTurbo(this, 105, 81, textureX, textureY);
    barrelModel[16] = new ModelRendererTurbo(this, 273, 81, textureX, textureY);
    barrelModel[17] = new ModelRendererTurbo(this, 297, 81, textureX, textureY);
    barrelModel[18] = new ModelRendererTurbo(this, 473, 81, textureX, textureY);
    barrelModel[19] = new ModelRendererTurbo(this, 393, 73, textureX, textureY);
    barrelModel[20] = new ModelRendererTurbo(this, 409, 73, textureX, textureY);
    barrelModel[21] = new ModelRendererTurbo(this, 425, 73, textureX, textureY);
    barrelModel[22] = new ModelRendererTurbo(this, 441, 73, textureX, textureY);
    barrelModel[23] = new ModelRendererTurbo(this, 273, 89, textureX, textureY);
    barrelModel[24] = new ModelRendererTurbo(this, 289, 89, textureX, textureY);
    barrelModel[25] = new ModelRendererTurbo(this, 97, 89, textureX, textureY);
    barrelModel[26] = new ModelRendererTurbo(this, 473, 9, textureX, textureY);
    barrelModel[27] = new ModelRendererTurbo(this, 305, 89, textureX, textureY);
    barrelModel[28] = new ModelRendererTurbo(this, 449, 73, textureX, textureY);
    barrelModel[29] = new ModelRendererTurbo(this, 41, 81, textureX, textureY);
    barrelModel[30] = new ModelRendererTurbo(this, 73, 81, textureX, textureY);
    barrelModel[31] = new ModelRendererTurbo(this, 145, 25, textureX, textureY);
    barrelModel[32] = new ModelRendererTurbo(this, 169, 73, textureX, textureY);
    barrelModel[33] = new ModelRendererTurbo(this, 433, 89, textureX, textureY);
    barrelModel[34] = new ModelRendererTurbo(this, 489, 73, textureX, textureY);
    barrelModel[35] = new ModelRendererTurbo(this, 97, 81, textureX, textureY);
    barrelModel[36] = new ModelRendererTurbo(this, 113, 97, textureX, textureY);
    barrelModel[37] = new ModelRendererTurbo(this, 193, 97, textureX, textureY);
    barrelModel[38] = new ModelRendererTurbo(this, 457, 89, textureX, textureY);
    barrelModel[39] = new ModelRendererTurbo(this, 473, 89, textureX, textureY);
    barrelModel[40] = new ModelRendererTurbo(this, 289, 97, textureX, textureY);
    barrelModel[41] = new ModelRendererTurbo(this, 353, 97, textureX, textureY);
    barrelModel[42] = new ModelRendererTurbo(this, 433, 97, textureX, textureY);
    barrelModel[43] = new ModelRendererTurbo(this, 297, 73, textureX, textureY);
    barrelModel[44] = new ModelRendererTurbo(this, 457, 73, textureX, textureY);
    barrelModel[45] = new ModelRendererTurbo(this, 33, 81, textureX, textureY);
    barrelModel[46] = new ModelRendererTurbo(this, 105, 81, textureX, textureY);
    barrelModel[47] = new ModelRendererTurbo(this, 273, 81, textureX, textureY);
    barrelModel[48] = new ModelRendererTurbo(this, 297, 81, textureX, textureY);
    barrelModel[49] = new ModelRendererTurbo(this, 313, 81, textureX, textureY);
    barrelModel[50] = new ModelRendererTurbo(this, 321, 81, textureX, textureY);
    barrelModel[51] = new ModelRendererTurbo(this, 353, 81, textureX, textureY);
    barrelModel[52] = new ModelRendererTurbo(this, 473, 81, textureX, textureY);
    barrelModel[53] = new ModelRendererTurbo(this, 489, 81, textureX, textureY);
    barrelModel[54] = new ModelRendererTurbo(this, 265, 89, textureX, textureY);
    barrelModel[55] = new ModelRendererTurbo(this, 273, 89, textureX, textureY);
    barrelModel[56] = new ModelRendererTurbo(this, 289, 89, textureX, textureY);
    barrelModel[57] = new ModelRendererTurbo(this, 305, 89, textureX, textureY);
    barrelModel[58] = new ModelRendererTurbo(this, 313, 89, textureX, textureY);
    barrelModel[59] = new ModelRendererTurbo(this, 321, 89, textureX, textureY);
    barrelModel[60] = new ModelRendererTurbo(this, 425, 89, textureX, textureY);
    barrelModel[61] = new ModelRendererTurbo(this, 449, 89, textureX, textureY);
    barrelModel[62] = new ModelRendererTurbo(this, 489, 89, textureX, textureY);
    barrelModel[63] = new ModelRendererTurbo(this, 81, 97, textureX, textureY);
    barrelModel[64] = new ModelRendererTurbo(this, 89, 97, textureX, textureY);
    barrelModel[65] = new ModelRendererTurbo(this, 321, 97, textureX, textureY);
    barrelModel[66] = new ModelRendererTurbo(this, 449, 97, textureX, textureY);
    barrelModel[67] = new ModelRendererTurbo(this, 457, 97, textureX, textureY);
    barrelModel[68] = new ModelRendererTurbo(this, 465, 97, textureX, textureY);
    barrelModel[69] = new ModelRendererTurbo(this, 473, 97, textureX, textureY);
    barrelModel[70] = new ModelRendererTurbo(this, 481, 97, textureX, textureY);
    barrelModel[71] = new ModelRendererTurbo(this, 489, 97, textureX, textureY);
    barrelModel[72] = new ModelRendererTurbo(this, 497, 97, textureX, textureY);
    barrelModel[73] = new ModelRendererTurbo(this, 505, 97, textureX, textureY);
    barrelModel[74] = new ModelRendererTurbo(this, 1, 105, textureX, textureY);
    barrelModel[75] = new ModelRendererTurbo(this, 9, 105, textureX, textureY);
    barrelModel[76] = new ModelRendererTurbo(this, 17, 105, textureX, textureY);
    barrelModel[77] = new ModelRendererTurbo(this, 25, 105, textureX, textureY);
    barrelModel[78] = new ModelRendererTurbo(this, 33, 105, textureX, textureY);
    barrelModel[79] = new ModelRendererTurbo(this, 41, 105, textureX, textureY);
    barrelModel[80] = new ModelRendererTurbo(this, 49, 105, textureX, textureY);
    barrelModel[81] = new ModelRendererTurbo(this, 57, 105, textureX, textureY);
    barrelModel[82] = new ModelRendererTurbo(this, 65, 105, textureX, textureY);
    barrelModel[83] = new ModelRendererTurbo(this, 73, 105, textureX, textureY);
    barrelModel[84] = new ModelRendererTurbo(this, 81, 105, textureX, textureY);
    barrelModel[85] = new ModelRendererTurbo(this, 89, 105, textureX, textureY);
    barrelModel[86] = new ModelRendererTurbo(this, 97, 105, textureX, textureY);
    barrelModel[87] = new ModelRendererTurbo(this, 105, 105, textureX, textureY);
    barrelModel[88] = new ModelRendererTurbo(this, 113, 105, textureX, textureY);
    barrelModel[89] = new ModelRendererTurbo(this, 121, 105, textureX, textureY);
    barrelModel[90] = new ModelRendererTurbo(this, 129, 105, textureX, textureY);
    barrelModel[91] = new ModelRendererTurbo(this, 137, 105, textureX, textureY);
    barrelModel[92] = new ModelRendererTurbo(this, 145, 105, textureX, textureY);
    barrelModel[93] = new ModelRendererTurbo(this, 153, 105, textureX, textureY);
    barrelModel[94] = new ModelRendererTurbo(this, 161, 105, textureX, textureY);
    barrelModel[95] = new ModelRendererTurbo(this, 169, 105, textureX, textureY);
    barrelModel[96] = new ModelRendererTurbo(this, 177, 105, textureX, textureY);
    barrelModel[97] = new ModelRendererTurbo(this, 185, 105, textureX, textureY);
    barrelModel[98] = new ModelRendererTurbo(this, 193, 105, textureX, textureY);
    barrelModel[99] = new ModelRendererTurbo(this, 201, 105, textureX, textureY);
    barrelModel[100] = new ModelRendererTurbo(this, 209, 105, textureX, textureY);
    barrelModel[101] = new ModelRendererTurbo(this, 217, 105, textureX, textureY);
    barrelModel[102] = new ModelRendererTurbo(this, 225, 105, textureX, textureY);
    barrelModel[103] = new ModelRendererTurbo(this, 233, 105, textureX, textureY);
    barrelModel[104] = new ModelRendererTurbo(this, 241, 105, textureX, textureY);
    barrelModel[105] = new ModelRendererTurbo(this, 249, 105, textureX, textureY);
    barrelModel[106] = new ModelRendererTurbo(this, 257, 105, textureX, textureY);
    barrelModel[107] = new ModelRendererTurbo(this, 265, 105, textureX, textureY);
    barrelModel[108] = new ModelRendererTurbo(this, 273, 105, textureX, textureY);
    barrelModel[109] = new ModelRendererTurbo(this, 281, 105, textureX, textureY);
    barrelModel[110] = new ModelRendererTurbo(this, 289, 105, textureX, textureY);
    barrelModel[111] = new ModelRendererTurbo(this, 297, 105, textureX, textureY);
    barrelModel[112] = new ModelRendererTurbo(this, 305, 105, textureX, textureY);
    barrelModel[113] = new ModelRendererTurbo(this, 313, 105, textureX, textureY);
    barrelModel[114] = new ModelRendererTurbo(this, 321, 105, textureX, textureY);
    barrelModel[115] = new ModelRendererTurbo(this, 329, 105, textureX, textureY);
    barrelModel[116] = new ModelRendererTurbo(this, 345, 105, textureX, textureY);
    barrelModel[117] = new ModelRendererTurbo(this, 361, 105, textureX, textureY);
    barrelModel[118] = new ModelRendererTurbo(this, 377, 105, textureX, textureY);
    barrelModel[119] = new ModelRendererTurbo(this, 393, 105, textureX, textureY);
    barrelModel[120] = new ModelRendererTurbo(this, 409, 105, textureX, textureY);
    barrelModel[121] = new ModelRendererTurbo(this, 417, 105, textureX, textureY);
    barrelModel[122] = new ModelRendererTurbo(this, 425, 105, textureX, textureY);
    barrelModel[123] = new ModelRendererTurbo(this, 433, 105, textureX, textureY);
    barrelModel[124] = new ModelRendererTurbo(this, 441, 105, textureX, textureY);
    barrelModel[125] = new ModelRendererTurbo(this, 449, 105, textureX, textureY);
    barrelModel[126] = new ModelRendererTurbo(this, 457, 105, textureX, textureY);
    barrelModel[127] = new ModelRendererTurbo(this, 465, 105, textureX, textureY);
    
    barrelModel[0].addShapeBox(-19.0F, 3.0F, -3.0F, 45, 1, 6, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F);
    barrelModel[0].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[1].addShapeBox(-19.0F, 1.0F, 2.0F, 44, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[1].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[2].addShapeBox(-19.0F, 1.0F, -3.0F, 44, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[2].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[3].addShapeBox(25.0F, 1.0F, -3.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[3].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[4].addShapeBox(2.0F, 0.0F, 2.5F, 4, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, -1.5F, -1.0F, -1.5F);
    barrelModel[4].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[5].addShapeBox(6.0F, 0.0F, 2.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[5].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[6].addShapeBox(6.0F, 0.0F, 5.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[6].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[7].addShapeBox(2.0F, 0.0F, -6.5F, 4, 2, 4, 0.0F, -1.5F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -1.0F, -1.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[7].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[8].addShapeBox(6.0F, 0.0F, -6.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[8].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[9].addShapeBox(6.0F, 0.0F, -3.5F, 2, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[9].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[10].addShapeBox(-6.0F, -2.0F, -2.0F, 32, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[10].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[11].addShapeBox(-6.0F, 0.0F, -2.0F, 32, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    barrelModel[11].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[12].addShapeBox(-6.0F, -3.0F, -2.0F, 32, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[12].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[13].addShapeBox(22.0F, -2.0F, -2.5F, 3, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[13].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[14].addShapeBox(22.0F, -4.0F, -2.5F, 3, 2, 5, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[14].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[15].addShapeBox(22.0F, 0.0F, -2.5F, 3, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F);
    barrelModel[15].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[16].addShapeBox(1.0F, -2.0F, -2.5F, 3, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[16].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[17].addShapeBox(1.0F, -4.0F, -2.5F, 3, 2, 5, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[17].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[18].addShapeBox(1.0F, 0.0F, -2.5F, 3, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F, 0.0F, -0.5F, -1.5F);
    barrelModel[18].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[19].addShapeBox(22.0F, 0.0F, 1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[19].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[20].addShapeBox(22.0F, 0.0F, -2.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[20].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[21].addShapeBox(1.0F, 0.0F, 1.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[21].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[22].addShapeBox(1.0F, 0.0F, -2.5F, 3, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[22].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[23].addShapeBox(-7.0F, -3.0F, -3.0F, 1, 4, 6, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
    barrelModel[23].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[24].addShapeBox(-7.0F, -4.0F, -3.0F, 1, 1, 6, 0.0F, 0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
    barrelModel[24].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[25].addShapeBox(-9.0F, -3.0F, -2.0F, 1, 4, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[25].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[26].addShapeBox(-9.0F, -4.0F, -2.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[26].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[27].addShapeBox(-10.0F, -2.0F, -2.0F, 1, 3, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[27].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[28].addShapeBox(-10.0F, -4.0F, -2.0F, 1, 1, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[28].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[29].addShapeBox(-10.0F, -3.0F, -2.0F, 1, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[29].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[30].addShapeBox(-11.0F, -2.0F, -3.0F, 3, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.25F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[30].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[31].addShapeBox(-11.0F, -2.0F, -2.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[31].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[32].addShapeBox(-11.0F, -4.0F, 1.0F, 1, 2, 1, 0.0F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
    barrelModel[32].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[33].addShapeBox(-10.0F, 1.0F, -2.0F, 4, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[33].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[34].addShapeBox(-10.0F, 0.0F, -3.0F, 2, 1, 1, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[34].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[35].addShapeBox(-11.0F, 0.0F, -1.5F, 1, 1, 3, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[35].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[36].addShapeBox(26.0F, -2.0F, -2.0F, 36, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.25F, 0.0F, -0.5F, -0.25F, 0.0F, 0.0F, 0.0F);
    barrelModel[36].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[37].addShapeBox(26.0F, -3.0F, -2.0F, 36, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, 0.0F);
    barrelModel[37].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[38].addShapeBox(62.0F, -2.0F, -2.0F, 2, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[38].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[39].addShapeBox(62.0F, -3.0F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[39].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[40].addShapeBox(62.0F, 0.0F, -2.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    barrelModel[40].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[41].addShapeBox(26.0F, 0.0F, -2.0F, 36, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.25F, 0.0F, 0.5F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.25F, -1.5F, 0.0F, -0.25F, -1.5F, 0.0F, 0.0F, -1.0F);
    barrelModel[41].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[42].addShapeBox(64.0F, -2.5F, -1.5F, 6, 1, 3, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F);
    barrelModel[42].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[43].addShapeBox(64.25F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[43].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[44].addShapeBox(64.25F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[44].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[45].addShapeBox(64.75F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[45].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[46].addShapeBox(64.25F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[46].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[47].addShapeBox(64.75F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[47].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[48].addShapeBox(64.75F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[48].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[49].addShapeBox(65.25F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[49].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[50].addShapeBox(65.25F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[50].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[51].addShapeBox(65.25F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[51].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[52].addShapeBox(65.75F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[52].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[53].addShapeBox(65.75F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[53].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[54].addShapeBox(65.75F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[54].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[55].addShapeBox(66.25F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[55].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[56].addShapeBox(66.25F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[56].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[57].addShapeBox(66.25F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[57].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[58].addShapeBox(66.75F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[58].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[59].addShapeBox(66.75F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[59].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[60].addShapeBox(66.75F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[60].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[61].addShapeBox(67.25F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[61].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[62].addShapeBox(67.25F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[62].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[63].addShapeBox(67.25F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[63].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[64].addShapeBox(67.75F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[64].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[65].addShapeBox(67.75F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[65].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[66].addShapeBox(67.75F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[66].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[67].addShapeBox(68.25F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[67].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[68].addShapeBox(68.25F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[68].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[69].addShapeBox(68.25F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[69].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[70].addShapeBox(68.75F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[70].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[71].addShapeBox(68.75F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[71].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[72].addShapeBox(68.75F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[72].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[73].addShapeBox(69.25F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[73].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[74].addShapeBox(69.25F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[74].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[75].addShapeBox(69.25F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[75].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[76].addShapeBox(69.75F, -1.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[76].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[77].addShapeBox(69.75F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[77].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[78].addShapeBox(69.75F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[78].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[79].addShapeBox(64.25F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[79].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[80].addShapeBox(64.25F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[80].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[81].addShapeBox(64.25F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[81].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[82].addShapeBox(64.75F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[82].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[83].addShapeBox(64.75F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[83].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[84].addShapeBox(64.75F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[84].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[85].addShapeBox(65.25F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[85].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[86].addShapeBox(65.25F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[86].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[87].addShapeBox(65.25F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[87].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[88].addShapeBox(65.75F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[88].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[89].addShapeBox(65.75F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[89].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[90].addShapeBox(65.75F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[90].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[91].addShapeBox(66.25F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[91].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[92].addShapeBox(66.25F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[92].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[93].addShapeBox(66.25F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[93].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[94].addShapeBox(66.75F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[94].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[95].addShapeBox(66.75F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[95].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[96].addShapeBox(66.75F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[96].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[97].addShapeBox(67.25F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[97].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[98].addShapeBox(67.25F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[98].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[99].addShapeBox(67.25F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[99].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[100].addShapeBox(67.75F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[100].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[101].addShapeBox(67.75F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[101].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[102].addShapeBox(67.75F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[102].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[103].addShapeBox(68.25F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[103].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[104].addShapeBox(68.25F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[104].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[105].addShapeBox(68.25F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[105].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[106].addShapeBox(68.75F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[106].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[107].addShapeBox(68.75F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[107].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[108].addShapeBox(68.75F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[108].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[109].addShapeBox(69.25F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[109].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[110].addShapeBox(69.25F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[110].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[111].addShapeBox(69.25F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[111].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[112].addShapeBox(69.75F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.75F, 0.0F, -0.5F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[112].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[113].addShapeBox(69.75F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[113].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[114].addShapeBox(69.75F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.75F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[114].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[115].addShapeBox(64.0F, -3.0F, -1.25F, 6, 1, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[115].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[116].addShapeBox(64.0F, -3.0F, 0.25F, 6, 1, 1, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[116].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[117].addShapeBox(64.0F, -0.5F, -1.5F, 6, 1, 3, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.25F, -1.0F);
    barrelModel[117].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[118].addShapeBox(64.0F, 0.0F, -1.25F, 6, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
    barrelModel[118].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[119].addShapeBox(64.0F, 0.0F, 0.25F, 6, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F, 0.0F, -0.75F, -0.25F);
    barrelModel[119].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[120].addShapeBox(70.0F, -2.5F, -1.5F, 1, 1, 3, 0.0F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.5F);
    barrelModel[120].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[121].addShapeBox(70.0F, -2.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[121].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[122].addShapeBox(70.0F, -1.5F, -2.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[122].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[123].addShapeBox(70.0F, -1.5F, 1.25F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.75F, 0.0F, 0.0F, -0.5F);
    barrelModel[123].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[124].addShapeBox(70.0F, -2.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F);
    barrelModel[124].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[125].addShapeBox(70.0F, -0.5F, -1.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.25F, -0.75F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F);
    barrelModel[125].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[126].addShapeBox(70.0F, -0.5F, 0.75F, 1, 1, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, 0.0F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, 0.25F, 0.0F, -0.25F, -1.0F, 0.0F, -0.25F, -0.75F);
    barrelModel[126].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    barrelModel[127].addShapeBox(70.0F, -0.5F, -1.5F, 1, 1, 3, 0.0F, 0.0F, -0.75F, -0.5F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.75F, 0.0F, -0.75F, -0.5F, 0.0F, 0.25F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.25F, -1.0F);
    barrelModel[127].setRotationPoint(-4.0F, -13.0F, 0.0F);


    
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
