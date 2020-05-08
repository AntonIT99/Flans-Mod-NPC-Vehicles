package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelTKS
  extends ModelVehicle {
  int textureX = 512;
  int textureY = 512;

  
  public ModelTKS() {
    bodyModel = new ModelRendererTurbo[94];
    bodyModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 305, 1, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 369, 1, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 409, 1, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 113, 1, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 217, 1, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 241, 1, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 137, 1, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 281, 1, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 1, 81, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 289, 1, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 353, 1, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 489, 1, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 369, 1, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 401, 9, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 81, 9, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 113, 9, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 137, 9, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 217, 9, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 233, 9, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 249, 9, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 281, 9, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 441, 9, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 1, 17, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 113, 1, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 297, 9, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 313, 9, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 353, 9, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 369, 9, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 409, 9, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 497, 9, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 57, 17, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 73, 17, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 225, 9, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 113, 17, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 441, 17, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 1, 25, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 497, 17, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 441, 25, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 465, 25, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 129, 17, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 145, 17, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 57, 25, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 489, 25, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 1, 33, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 65, 33, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 121, 33, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 137, 33, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 377, 9, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 417, 9, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 217, 17, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 153, 33, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 169, 33, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 225, 33, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 212, 103, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 218, 96, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 207, 96, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 196, 96, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 185, 96, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 90, 45, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 338, 45, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 0, 43, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 262, 45, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 186, 45, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 60, 38, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 156, 42, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 1, 103, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 66, 103, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 206, 84, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 204, 103, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 182, 103, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 177, 54, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 187, 109, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 196, 103, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 176, 40, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 166, 82, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 0, 50, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 232, 52, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 0, 37, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 232, 39, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 195, 91, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 227, 87, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 59, 63, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 212, 103, textureX, textureY);
    bodyModel[86] = new ModelRendererTurbo(this, 113, 1, textureX, textureY);
    bodyModel[87] = new ModelRendererTurbo(this, 227, 83, textureX, textureY);
    bodyModel[88] = new ModelRendererTurbo(this, 213, 84, textureX, textureY);
    bodyModel[89] = new ModelRendererTurbo(this, 220, 90, textureX, textureY);
    bodyModel[90] = new ModelRendererTurbo(this, 220, 87, textureX, textureY);
    bodyModel[91] = new ModelRendererTurbo(this, 220, 84, textureX, textureY);
    bodyModel[92] = new ModelRendererTurbo(this, 213, 91, textureX, textureY);
    bodyModel[93] = new ModelRendererTurbo(this, 213, 88, textureX, textureY);
    
    bodyModel[0].addBox(0.0F, 0.0F, -11.0F, 26, 8, 22, 0.0F);
    bodyModel[0].setRotationPoint(-14.0F, -3.0F, 0.0F);
    
    bodyModel[1].addShapeBox(0.0F, 0.0F, -11.0F, 6, 8, 22, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F);
    bodyModel[1].setRotationPoint(-20.0F, -3.0F, 0.0F);
    
    bodyModel[2].addShapeBox(0.0F, 0.0F, -11.0F, 9, 6, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(12.0F, -3.0F, 0.0F);
    
    bodyModel[3].addShapeBox(0.0F, 0.0F, -11.0F, 8, 2, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[3].setRotationPoint(12.0F, 3.0F, 0.0F);
    
    bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 33, 1, 5, 0.0F);
    bodyModel[4].setRotationPoint(-14.0F, -3.0F, 11.0F);
    
    bodyModel[5].addBox(-8.0F, 0.0F, 0.0F, 8, 1, 5, 0.0F);
    bodyModel[5].setRotationPoint(-14.0F, -3.0F, 11.0F);
    (bodyModel[5]).rotateAngleZ = 0.2617994F;
    
    bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F);
    bodyModel[6].setRotationPoint(19.0F, -3.0F, 11.0F);
    (bodyModel[6]).rotateAngleZ = -0.61086524F;
    
    bodyModel[7].addShapeBox(-8.0F, 0.0F, -1.0F, 8, 4, 1, 0.0F, -0.27F, -2.08F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.27F, -2.08F, 0.0F, -0.53F, -0.96F, -0.5F, -6.0F, 0.0F, -0.5F, -6.0F, 0.0F, 0.0F, -0.53F, -0.96F, 0.0F);
    bodyModel[7].setRotationPoint(-14.0F, -3.0F, 11.0F);
    
    bodyModel[8].addShapeBox(0.0F, 0.0F, -1.0F, 7, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.9F, -0.5F, 0.0F, -0.65F, -0.5F, 0.0F, -0.65F, 0.0F, 0.0F, -2.9F, 0.0F);
    bodyModel[8].setRotationPoint(12.0F, -3.0F, 11.0F);
    
    bodyModel[9].addShapeBox(0.0F, 0.0F, -1.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.72F, -2.3F, -0.5F, -0.72F, -2.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.65F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, -0.65F, 0.0F);
    bodyModel[9].setRotationPoint(19.0F, -3.0F, 11.0F);
    
    bodyModel[10].addBox(0.0F, 0.0F, -5.0F, 33, 1, 5, 0.0F);
    bodyModel[10].setRotationPoint(-14.0F, -3.0F, -11.0F);
    
    bodyModel[11].addBox(-8.0F, 0.0F, -5.0F, 8, 1, 5, 0.0F);
    bodyModel[11].setRotationPoint(-14.0F, -3.0F, -11.0F);
    (bodyModel[11]).rotateAngleZ = 0.2617994F;
    
    bodyModel[12].addBox(0.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F);
    bodyModel[12].setRotationPoint(19.0F, -3.0F, -11.0F);
    (bodyModel[12]).rotateAngleZ = -0.61086524F;
    
    bodyModel[13].addShapeBox(-8.0F, 0.0F, 0.0F, 8, 4, 1, 0.0F, -0.27F, -2.08F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.27F, -2.08F, -0.5F, -0.53F, -0.96F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, -0.5F, -0.53F, -0.96F, -0.5F);
    bodyModel[13].setRotationPoint(-14.0F, -3.0F, -11.0F);
    
    bodyModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 7, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.9F, 0.0F, 0.0F, -0.65F, 0.0F, 0.0F, -0.65F, -0.5F, 0.0F, -2.9F, -0.5F);
    bodyModel[14].setRotationPoint(12.0F, -3.0F, -11.0F);
    
    bodyModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 4, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.72F, -2.3F, 0.0F, -0.72F, -2.3F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.65F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, -0.65F, -0.5F);
    bodyModel[15].setRotationPoint(19.0F, -3.0F, -11.0F);
    
    bodyModel[16].addShapeBox(0.0F, 0.0F, -16.0F, 1, 1, 32, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[16].setRotationPoint(17.0F, 2.0F, 0.0F);
    
    bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[17].setRotationPoint(-0.5F, 2.0F, 11.0F);
    
    bodyModel[18].addShapeBox(-7.0F, 0.0F, 0.0F, 7, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F);
    bodyModel[18].setRotationPoint(0.5F, 2.0F, 12.0F);
    
    bodyModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 7, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F);
    bodyModel[19].setRotationPoint(0.5F, 2.0F, 12.0F);
    
    bodyModel[20].addShapeBox(-0.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[20].setRotationPoint(6.5F, 4.0F, 12.0F);
    
    bodyModel[21].addShapeBox(-0.5F, 0.0F, 0.0F, 3, 1, 3, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[21].setRotationPoint(-7.5F, 4.0F, 12.0F);
    
    bodyModel[22].addShapeBox(-0.5F, 0.0F, 0.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
    bodyModel[22].setRotationPoint(6.5F, 5.0F, 12.0F);
    
    bodyModel[23].addShapeBox(-0.5F, 0.0F, 0.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
    bodyModel[23].setRotationPoint(-7.5F, 5.0F, 12.0F);
    
    bodyModel[24].addShapeBox(-0.5F, 0.0F, 0.0F, 28, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[24].setRotationPoint(-14.5F, 5.0F, 15.0F);
    
    bodyModel[25].addShapeBox(-0.5F, 0.0F, -1.0F, 28, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[25].setRotationPoint(-14.5F, 5.0F, 12.0F);
    
    bodyModel[26].addShapeBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[26].setRotationPoint(13.5F, 5.0F, 15.0F);
    
    bodyModel[27].addShapeBox(-0.5F, 0.0F, 0.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[27].setRotationPoint(12.5F, 3.0F, 11.0F);
    
    bodyModel[28].addShapeBox(-5.5F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.5F, -0.6F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.2F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -0.2F, 0.0F);
    bodyModel[28].setRotationPoint(-14.5F, 5.0F, 12.0F);
    
    bodyModel[29].addShapeBox(-5.5F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, -0.6F, -0.5F, 0.5F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, -0.2F, -0.5F);
    bodyModel[29].setRotationPoint(-14.5F, 5.0F, 15.0F);
    
    bodyModel[30].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[30].setRotationPoint(-19.0F, 5.0F, 12.0F);
    
    bodyModel[31].addShapeBox(-0.5F, 0.0F, -0.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[31].setRotationPoint(11.0F, 7.0F, 12.0F);
    
    bodyModel[32].addShapeBox(-0.5F, 0.0F, -0.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[32].setRotationPoint(4.0F, 7.0F, 12.0F);
    
    bodyModel[33].addShapeBox(-0.5F, 0.0F, -0.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[33].setRotationPoint(-3.0F, 7.0F, 12.0F);
    
    bodyModel[34].addShapeBox(-0.5F, 0.0F, -0.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[34].setRotationPoint(-10.0F, 7.0F, 12.0F);
    
    bodyModel[35].addShapeBox(-0.5F, 0.0F, 0.0F, 1, 5, 5, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, -0.5F, 0.0F, -1.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[35].setRotationPoint(11.5F, 0.0F, 11.0F);
    
    bodyModel[36].addShapeBox(-0.5F, 0.0F, 0.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[36].setRotationPoint(-14.5F, 2.0F, 11.0F);
    
    bodyModel[37].addShapeBox(-0.5F, 0.0F, 0.0F, 25, 3, 1, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[37].setRotationPoint(-12.5F, 0.0F, 14.0F);
    
    bodyModel[38].addShapeBox(-0.5F, 0.0F, 0.0F, 25, 3, 1, 0.0F, 0.0F, -2.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[38].setRotationPoint(-12.5F, 0.0F, 12.0F);
    
    bodyModel[39].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[39].setRotationPoint(-0.5F, 2.0F, -11.0F);
    
    bodyModel[40].addShapeBox(-7.0F, 0.0F, -3.0F, 7, 3, 3, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F);
    bodyModel[40].setRotationPoint(0.5F, 2.0F, -12.0F);
    
    bodyModel[41].addShapeBox(0.0F, 0.0F, -3.0F, 7, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -1.0F, -0.5F);
    bodyModel[41].setRotationPoint(0.5F, 2.0F, -12.0F);
    
    bodyModel[42].addShapeBox(-0.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[42].setRotationPoint(-7.5F, 4.0F, -12.0F);
    
    bodyModel[43].addShapeBox(-0.5F, 0.0F, -3.0F, 3, 1, 3, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[43].setRotationPoint(6.5F, 4.0F, -12.0F);
    
    bodyModel[44].addShapeBox(-0.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
    bodyModel[44].setRotationPoint(-7.5F, 5.0F, -12.0F);
    
    bodyModel[45].addShapeBox(-0.5F, 0.0F, -3.0F, 3, 3, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F);
    bodyModel[45].setRotationPoint(6.5F, 5.0F, -12.0F);
    
    bodyModel[46].addShapeBox(-0.5F, 0.0F, -1.0F, 28, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[46].setRotationPoint(-14.5F, 5.0F, -15.0F);
    
    bodyModel[47].addShapeBox(-0.5F, 0.0F, 0.0F, 28, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[47].setRotationPoint(-14.5F, 5.0F, -12.0F);
    
    bodyModel[48].addShapeBox(-0.5F, 0.0F, -5.0F, 2, 2, 5, 0.0F, 0.0F, 0.0F, -0.9F, -1.0F, 0.0F, -0.9F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[48].setRotationPoint(12.5F, 3.0F, -11.0F);
    
    bodyModel[49].addShapeBox(-0.5F, 0.0F, -5.0F, 1, 5, 5, 0.0F, -0.5F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[49].setRotationPoint(11.5F, 0.0F, -11.0F);
    
    bodyModel[50].addShapeBox(-5.5F, 0.0F, -1.0F, 5, 2, 1, 0.0F, 0.5F, -0.6F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -0.6F, 0.0F, 0.5F, -0.2F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.5F, -0.2F, 0.0F);
    bodyModel[50].setRotationPoint(-14.5F, 5.0F, -15.0F);
    
    bodyModel[51].addShapeBox(-5.5F, 0.0F, 0.0F, 5, 2, 1, 0.0F, 0.5F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, -0.6F, -0.5F, 0.5F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.5F, -0.2F, -0.5F);
    bodyModel[51].setRotationPoint(-14.5F, 5.0F, -12.0F);
    
    bodyModel[52].addShapeBox(-0.5F, -0.5F, -3.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[52].setRotationPoint(-19.0F, 5.0F, -12.0F);
    
    bodyModel[53].addShapeBox(-0.5F, 0.0F, -5.0F, 2, 3, 5, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[53].setRotationPoint(-14.5F, 2.0F, -11.0F);
    
    bodyModel[54].addShapeBox(-0.5F, 0.0F, -1.0F, 25, 3, 1, 0.0F, 0.0F, -2.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, 0.0F, -0.5F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[54].setRotationPoint(-12.5F, 0.0F, -12.0F);
    
    bodyModel[55].addShapeBox(-0.5F, 0.0F, -1.0F, 25, 3, 1, 0.0F, 0.0F, -2.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, -2.0F, -0.5F, -0.5F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[55].setRotationPoint(-12.5F, 0.0F, -14.0F);
    
    bodyModel[56].addShapeBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[56].setRotationPoint(13.5F, 5.0F, 12.0F);
    
    bodyModel[57].addShapeBox(-0.5F, 0.0F, -3.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[57].setRotationPoint(11.0F, 7.0F, -12.0F);
    
    bodyModel[58].addShapeBox(-0.5F, 0.0F, -3.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[58].setRotationPoint(4.0F, 7.0F, -12.0F);
    
    bodyModel[59].addShapeBox(-0.5F, 0.0F, -3.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[59].setRotationPoint(-3.0F, 7.0F, -12.0F);
    
    bodyModel[60].addShapeBox(-0.5F, 0.0F, -3.5F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[60].setRotationPoint(-10.0F, 7.0F, -12.0F);
    
    bodyModel[61].addShapeBox(-10.0F, 0.0F, -15.0F, 17, 6, 30, 0.0F, -2.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[61].setRotationPoint(-1.0F, -9.0F, 0.0F);
    
    bodyModel[62].addShapeBox(-10.0F, 0.0F, -15.0F, 5, 6, 30, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
    bodyModel[62].setRotationPoint(-4.0F, -9.0F, 0.0F);
    
    bodyModel[63].addShapeBox(-8.0F, 0.0F, -15.0F, 14, 4, 30, 0.0F, -4.0F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -1.5F, 0.0F, -4.0F, -4.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[63].setRotationPoint(-1.0F, -13.0F, 0.0F);
    
    bodyModel[64].addShapeBox(-8.0F, 0.0F, -15.0F, 7, 4, 30, 0.0F, -4.0F, 0.0F, -7.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, -7.0F, 0.0F, 0.0F, -4.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
    bodyModel[64].setRotationPoint(-4.0F, -13.0F, 0.0F);
    
    bodyModel[65].addShapeBox(-10.0F, 0.0F, -15.0F, 7, 6, 30, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, -3.0F, -4.0F, -1.0F, -3.0F, -4.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[65].setRotationPoint(15.0F, -9.0F, 0.0F);
    
    bodyModel[66].addShapeBox(-9.0F, 0.0F, -15.0F, 7, 7, 17, 0.0F, 0.5F, 0.0F, -4.0F, -1.5F, -2.0F, -7.0F, -1.5F, -2.0F, -7.0F, 0.5F, 0.0F, -4.0F, -0.5F, -3.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, -0.5F, -3.0F, 0.0F);
    bodyModel[66].setRotationPoint(13.0F, -13.0F, 0.0F);
    
    bodyModel[67].addShapeBox(-3.0F, 0.0F, 0.0F, 3, 6, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[67].setRotationPoint(-12.0F, -9.0F, -1.0F);
    
    bodyModel[68].addShape3D(1.5F, -1.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 11.0F, 3, 3, 12, 11, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    bodyModel[68].setRotationPoint(-15.0F, -11.0F, 0.0F);
    
    bodyModel[69].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    bodyModel[69].setRotationPoint(-15.0F, -11.0F, -1.0F);
    
    bodyModel[70].addShapeBox(-2.0F, -5.0F, 0.0F, 2, 5, 1, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[70].setRotationPoint(-14.0F, -9.0F, -0.5F);
    (bodyModel[70]).rotateAngleZ = -0.7853982F;
    
    bodyModel[71].addShapeBox(0.0F, -5.0F, 0.0F, 2, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[71].setRotationPoint(-14.0F, -9.0F, -0.5F);
    (bodyModel[71]).rotateAngleZ = -0.7853982F;
    
    bodyModel[72].addShapeBox(0.0F, -0.5F, 0.0F, 5, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
    bodyModel[72].setRotationPoint(-15.0F, -11.0F, -8.5F);
    (bodyModel[72]).rotateAngleZ = -0.33161256F;
    
    bodyModel[73].addShapeBox(-6.0F, -0.2F, 0.0F, 5, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[73].setRotationPoint(-14.0F, -3.0F, -1.0F);
    (bodyModel[73]).rotateAngleZ = 0.5934119F;
    
    bodyModel[74].addShapeBox(0.0F, -0.5F, 0.0F, 2, 1, 1, 0.0F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
    bodyModel[74].setRotationPoint(-15.0F, -11.0F, -10.5F);
    (bodyModel[74]).rotateAngleZ = -0.5235988F;
    
    bodyModel[75].addShapeBox(2.0F, -0.5F, -1.0F, 1, 1, 2, 0.0F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F, 0.0F, 0.5F, 0.0F, -0.5F, 0.5F, 0.0F, -0.5F, 0.0F, -0.25F, 0.0F, 0.0F, -0.25F);
    bodyModel[75].setRotationPoint(-15.0F, -11.0F, -10.5F);
    (bodyModel[75]).rotateAngleZ = -0.5235988F;
    
    bodyModel[76].addShapeBox(-5.0F, -0.2F, 0.0F, 5, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[76].setRotationPoint(2.5F, -13.0F, 0.0F);
    
    bodyModel[77].addShapeBox(2.0F, -0.2F, 0.0F, 3, 1, 11, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[77].setRotationPoint(-7.5F, -13.0F, 0.0F);
    
    bodyModel[78].addShapeBox(0.0F, -0.2F, 0.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -3.0F);
    bodyModel[78].setRotationPoint(-7.5F, -13.0F, 0.0F);
    
    bodyModel[79].addShapeBox(2.0F, -0.2F, -11.0F, 4, 1, 11, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[79].setRotationPoint(-7.5F, -13.0F, 0.0F);
    
    bodyModel[80].addShapeBox(0.0F, -0.2F, -11.0F, 3, 1, 11, 0.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[80].setRotationPoint(-7.5F, -13.0F, 0.0F);
    
    bodyModel[81].addShapeBox(-4.0F, -0.2F, -11.0F, 4, 1, 11, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[81].setRotationPoint(2.5F, -13.0F, 0.0F);
    
    bodyModel[82].addShapeBox(-3.0F, -0.2F, -3.0F, 2, 1, 2, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[82].setRotationPoint(2.5F, -14.0F, 0.0F);
    
    bodyModel[83].addShapeBox(-1.3F, -1.7F, -1.0F, 2, 1, 2, 0.0F, 0.5F, 0.5F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F, 0.5F, -1.0F, 0.2F, 0.0F, -1.0F, 0.2F, 0.0F, -1.0F, 0.2F, 0.5F, -1.0F, 0.2F);
    bodyModel[83].setRotationPoint(11.0F, -8.0F, -6.5F);
    
    bodyModel[84].addShapeBox(-0.8F, 1.0F, 0.0F, 1, 3, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[84].setRotationPoint(3.5F, -13.0F, 5.0F);
    (bodyModel[84]).rotateAngleZ = 0.2443461F;
    
    bodyModel[85].addShapeBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[85].setRotationPoint(13.5F, 5.0F, -12.0F);
    
    bodyModel[86].addShapeBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[86].setRotationPoint(13.5F, 5.0F, -16.0F);
    
    bodyModel[87].addShapeBox(-1.3F, 0.7F, -1.0F, 2, 1, 2, 0.0F, 0.5F, -1.0F, 0.2F, 0.0F, -1.0F, 0.2F, 0.0F, -1.0F, 0.2F, 0.5F, -1.0F, 0.2F, 0.5F, 0.5F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.5F, 0.5F, 0.2F);
    bodyModel[87].setRotationPoint(11.0F, -7.0F, -6.5F);
    
    bodyModel[88].addShapeBox(-1.3F, -1.5F, -2.2F, 2, 2, 1, 0.0F, 0.5F, 0.2F, 0.5F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, -1.0F, 0.5F, 0.2F, -1.0F, 0.5F, 0.2F, 0.5F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, -1.0F, 0.5F, 0.2F, -1.0F);
    bodyModel[88].setRotationPoint(11.0F, -7.0F, -6.5F);
    
    bodyModel[89].addShapeBox(-1.3F, -1.5F, 1.2F, 2, 2, 1, 0.0F, 0.5F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.5F, 0.5F, 0.2F, -1.0F, 0.0F, 0.2F, -1.0F, 0.0F, 0.2F, 0.2F, 0.5F, 0.2F, 0.5F);
    bodyModel[89].setRotationPoint(11.0F, -7.0F, -6.5F);
    
    bodyModel[90].addShapeBox(-1.3F, -1.7F, -2.2F, 2, 1, 1, 0.0F, 0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.2F, 0.0F, 0.2F, 0.0F, 0.5F, 0.5F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F);
    bodyModel[90].setRotationPoint(11.0F, -8.0F, -6.5F);
    
    bodyModel[91].addShapeBox(-1.3F, -1.7F, 0.2F, 2, 1, 1, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, -1.0F, 0.2F, 0.5F, -1.0F, 0.5F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F);
    bodyModel[91].setRotationPoint(11.0F, -8.0F, -5.5F);
    
    bodyModel[92].addShapeBox(-1.3F, 0.7F, -2.2F, 2, 1, 1, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.5F, -1.0F, 0.0F, 0.5F, -1.0F, 0.5F, 0.0F, -1.0F, 0.2F, 0.0F, 0.2F, 0.0F, 0.5F, 0.5F, 0.0F);
    bodyModel[92].setRotationPoint(11.0F, -7.0F, -6.5F);
    
    bodyModel[93].addShapeBox(-1.3F, 0.7F, 1.2F, 2, 1, 1, 0.0F, 0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.5F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, -1.0F, 0.2F, 0.5F, -1.0F, 0.5F);
    bodyModel[93].setRotationPoint(11.0F, -7.0F, -6.5F);

    
    barrelModel = new ModelRendererTurbo[13];
    barrelModel[0] = new ModelRendererTurbo(this, 1, 6, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 144, 115, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 131, 115, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 118, 115, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 1, 12, textureX, textureY);
    barrelModel[5] = new ModelRendererTurbo(this, 35, 12, textureX, textureY);
    barrelModel[6] = new ModelRendererTurbo(this, 30, 12, textureX, textureY);
    barrelModel[7] = new ModelRendererTurbo(this, 25, 12, textureX, textureY);
    barrelModel[8] = new ModelRendererTurbo(this, 20, 12, textureX, textureY);
    barrelModel[9] = new ModelRendererTurbo(this, 6, 9, textureX, textureY);
    barrelModel[10] = new ModelRendererTurbo(this, 1, 9, textureX, textureY);
    barrelModel[11] = new ModelRendererTurbo(this, 35, 12, textureX, textureY);
    barrelModel[12] = new ModelRendererTurbo(this, 35, 12, textureX, textureY);
    
    barrelModel[0].addShapeBox(-2.0F, -0.5F, -0.5F, 11, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[0].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[1].addShapeBox(-0.3F, -1.0F, -2.5F, 1, 2, 5, 0.0F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F, 0.0F, 0.2F, -0.3F);
    barrelModel[1].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[2].addShapeBox(-0.3F, -2.0F, -2.5F, 1, 1, 5, 0.0F, 0.0F, 0.2F, -1.3F, 0.0F, 0.2F, -1.3F, 0.0F, 0.2F, -1.3F, 0.0F, 0.2F, -1.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F);
    barrelModel[2].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[3].addShapeBox(-0.3F, 1.0F, -2.5F, 1, 1, 5, 0.0F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, -0.2F, -0.3F, 0.0F, 0.2F, -1.3F, 0.0F, 0.2F, -1.3F, 0.0F, 0.2F, -1.3F, 0.0F, 0.2F, -1.3F);
    barrelModel[3].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[4].addShapeBox(-2.0F, 0.25F, -0.5F, 8, 1, 1, 0.0F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F);
    barrelModel[4].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[5].addShapeBox(4.0F, -0.5F, -0.5F, 1, 2, 1, 0.0F, 0.0F, -0.18F, -0.18F, 0.0F, -0.18F, -0.18F, 0.0F, -0.18F, -0.18F, 0.0F, -0.18F, -0.18F, 0.0F, -0.48F, -0.18F, 0.0F, -0.48F, -0.18F, 0.0F, -0.48F, -0.18F, 0.0F, -0.48F, -0.18F);
    barrelModel[5].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[6].addShapeBox(9.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F);
    barrelModel[6].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[7].addShapeBox(9.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.35F, -0.35F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.35F, -0.35F, 0.0F, -0.35F, -0.35F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.35F, -0.35F);
    barrelModel[7].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[8].addShapeBox(1.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F);
    barrelModel[8].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[9].addShapeBox(0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F);
    barrelModel[9].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[10].addShapeBox(1.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F, -0.3F, -0.1F, -0.1F);
    barrelModel[10].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[11].addShapeBox(7.0F, -0.5F, -0.5F, 1, 1, 1, 0.0F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F);
    barrelModel[11].setRotationPoint(11.0F, -7.5F, -6.5F);
    
    barrelModel[12].addShapeBox(7.0F, -1.0F, -0.5F, 1, 1, 1, 0.0F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.5F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F);
    barrelModel[12].setRotationPoint(11.0F, -7.5F, -6.5F);

    
    leftTrackWheelModels = new ModelRendererTurbo[10];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 41, 103, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 100, 117, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 83, 117, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 66, 117, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 100, 110, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 41, 114, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 54, 128, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 41, 128, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 28, 128, textureX, textureY);
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 15, 128, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(3.5F, -3.5F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[0].setRotationPoint(17.5F, 2.5F, 12.0F);
    
    leftTrackWheelModels[1].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[1].setRotationPoint(11.0F, 7.5F, 14.5F);
    
    leftTrackWheelModels[2].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[2].setRotationPoint(4.0F, 7.5F, 14.5F);
    
    leftTrackWheelModels[3].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[3].setRotationPoint(-3.0F, 7.5F, 14.5F);
    
    leftTrackWheelModels[4].addShape3D(2.0F, -2.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[4].setRotationPoint(-10.0F, 7.5F, 14.5F);
    
    leftTrackWheelModels[5].addShape3D(3.0F, -3.0F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 6, 6, 20, 2, 0, new float[] { 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F });
    leftTrackWheelModels[5].setRotationPoint(-19.0F, 5.0F, 12.0F);
    
    leftTrackWheelModels[6].addShape3D(1.5F, -1.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[6].setRotationPoint(9.8F, 0.7F, 14.0F);
    
    leftTrackWheelModels[7].addShape3D(1.5F, -1.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[7].setRotationPoint(3.3F, 1.2F, 14.0F);
    
    leftTrackWheelModels[8].addShape3D(1.5F, -1.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[8].setRotationPoint(-3.5F, 1.7F, 14.0F);
    
    leftTrackWheelModels[9].addShape3D(1.5F, -1.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[9].setRotationPoint(-11.3F, 2.4F, 14.0F);

    
    rightTrackWheelModels = new ModelRendererTurbo[10];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 15, 103, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 100, 103, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 83, 110, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 83, 103, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 66, 110, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 15, 114, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 54, 123, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 41, 123, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 28, 123, textureX, textureY);
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 15, 123, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[0].setRotationPoint(17.5F, 2.5F, -12.0F);
    
    rightTrackWheelModels[1].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[1].setRotationPoint(11.0F, 7.5F, -14.5F);
    
    rightTrackWheelModels[2].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[2].setRotationPoint(4.0F, 7.5F, -14.5F);
    
    rightTrackWheelModels[3].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[3].setRotationPoint(-3.0F, 7.5F, -14.5F);
    
    rightTrackWheelModels[4].addShape3D(2.0F, -2.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[4].setRotationPoint(-10.0F, 7.5F, -14.5F);
    
    rightTrackWheelModels[5].addShape3D(3.0F, -3.0F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 6, 6, 20, 2, 0, new float[] { 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F });
    rightTrackWheelModels[5].setRotationPoint(-19.0F, 5.0F, -12.0F);
    
    rightTrackWheelModels[6].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[6].setRotationPoint(-11.3F, 2.4F, -14.0F);
    
    rightTrackWheelModels[7].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[7].setRotationPoint(-3.5F, 1.7F, -14.0F);
    
    rightTrackWheelModels[8].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[8].setRotationPoint(3.3F, 1.2F, -14.0F);
    
    rightTrackWheelModels[9].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 1.0F, 3, 3, 12, 1, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[9].setRotationPoint(9.8F, 0.7F, -14.0F);

    
    leftTrackModel = new ModelRendererTurbo[11];
    leftTrackModel[0] = new ModelRendererTurbo(this, 167, 109, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 167, 103, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 93, 45, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 135, 109, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 83, 96, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 83, 89, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 138, 83, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 195, 84, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 104, 37, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 135, 103, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 1, 96, textureX, textureY);
    
    leftTrackModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    leftTrackModel[0].setRotationPoint(16.0F, -1.5F, 11.5F);
    
    leftTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    leftTrackModel[1].setRotationPoint(19.0F, -1.5F, 11.5F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2].addShapeBox(-0.5F, 0.0F, 0.0F, 1, 3, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    leftTrackModel[2].setRotationPoint(21.0F, 1.0F, 11.5F);
    
    leftTrackModel[3].addShapeBox(0.0F, -1.0F, 0.0F, 4, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[3].setRotationPoint(19.0F, 6.5F, 11.5F);
    (leftTrackModel[3]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[4].addShapeBox(0.0F, -1.0F, 0.0F, 8, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, -0.16F, -0.5F, 0.0F, -0.16F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.16F, 0.0F, 0.0F, -0.16F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[4].setRotationPoint(12.0F, 10.0F, 11.5F);
    (leftTrackModel[4]).rotateAngleZ = 0.46251225F;
    
    leftTrackModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 23, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    leftTrackModel[5].setRotationPoint(-11.0F, 9.5F, 11.5F);
    
    leftTrackModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 9, 1, 4, 0.0F, 0.15F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F);
    leftTrackModel[6].setRotationPoint(-20.0F, 8.0F, 11.5F);
    (leftTrackModel[6]).rotateAngleZ = -0.16406095F;
    
    leftTrackModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F);
    leftTrackModel[7].setRotationPoint(-23.0F, 4.0F, 11.5F);
    
    leftTrackModel[8].addShapeBox(-1.0F, -0.2F, 0.0F, 1, 3, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F);
    leftTrackModel[8].setRotationPoint(-22.0F, 6.0F, 11.5F);
    (leftTrackModel[8]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[9].addShapeBox(-4.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F);
    leftTrackModel[9].setRotationPoint(-20.0F, 1.5F, 11.5F);
    (leftTrackModel[9]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 36, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    leftTrackModel[10].setRotationPoint(-20.0F, 1.5F, 11.5F);
    (leftTrackModel[10]).rotateAngleZ = 0.08307767F;

    
    rightTrackModel = new ModelRendererTurbo[11];
    rightTrackModel[0] = new ModelRendererTurbo(this, 152, 109, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 152, 103, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 93, 37, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 118, 109, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 108, 96, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 83, 83, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 138, 89, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 100, 65, textureX, textureY);
    rightTrackModel[8] = new ModelRendererTurbo(this, 184, 84, textureX, textureY);
    rightTrackModel[9] = new ModelRendererTurbo(this, 118, 103, textureX, textureY);
    rightTrackModel[10] = new ModelRendererTurbo(this, 1, 89, textureX, textureY);
    
    rightTrackModel[0].addShapeBox(0.0F, 0.0F, -4.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    rightTrackModel[0].setRotationPoint(16.0F, -1.5F, -11.5F);
    
    rightTrackModel[1].addShapeBox(0.0F, 0.0F, -4.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.55F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.55F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    rightTrackModel[1].setRotationPoint(19.0F, -1.5F, -11.5F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2].addShapeBox(-0.5F, 0.0F, -4.0F, 1, 3, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    rightTrackModel[2].setRotationPoint(21.0F, 1.0F, -11.5F);
    
    rightTrackModel[3].addShapeBox(0.0F, -1.0F, -4.0F, 4, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[3].setRotationPoint(19.0F, 6.5F, -11.5F);
    (rightTrackModel[3]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[4].addShapeBox(0.0F, -1.0F, -4.0F, 8, 1, 4, 0.0F, 0.0F, -0.5F, 0.0F, -0.16F, -0.5F, 0.0F, -0.16F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -0.16F, 0.0F, 0.0F, -0.16F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[4].setRotationPoint(12.0F, 10.0F, -11.5F);
    (rightTrackModel[4]).rotateAngleZ = 0.46251225F;
    
    rightTrackModel[5].addShapeBox(0.0F, 0.0F, -4.0F, 23, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    rightTrackModel[5].setRotationPoint(-11.0F, 9.5F, -11.5F);
    
    rightTrackModel[6].addShapeBox(0.0F, 0.0F, -4.0F, 9, 1, 4, 0.0F, 0.15F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F);
    rightTrackModel[6].setRotationPoint(-20.0F, 8.0F, -11.5F);
    (rightTrackModel[6]).rotateAngleZ = -0.16406095F;
    
    rightTrackModel[7].addShapeBox(-1.0F, -0.2F, -4.0F, 1, 3, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F);
    rightTrackModel[7].setRotationPoint(-22.0F, 6.0F, -11.5F);
    (rightTrackModel[7]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[8].addShapeBox(0.0F, 0.0F, -4.0F, 1, 2, 4, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, 0.0F);
    rightTrackModel[8].setRotationPoint(-23.0F, 4.0F, -11.5F);
    
    rightTrackModel[9].addShapeBox(-4.0F, 0.0F, -4.0F, 4, 1, 4, 0.0F, -0.45F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.45F, 0.0F, 0.0F, -0.45F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.45F, -0.5F, 0.0F);
    rightTrackModel[9].setRotationPoint(-20.0F, 1.5F, -11.5F);
    (rightTrackModel[9]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[10].addShapeBox(0.0F, 0.0F, -4.0F, 36, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.15F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F, 0.15F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    rightTrackModel[10].setRotationPoint(-20.0F, 1.5F, -11.5F);
    (rightTrackModel[10]).rotateAngleZ = 0.08307767F;


    
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
