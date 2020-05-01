package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;


public class ModelRenaultFT17
  extends ModelVehicle
{
  int textureX = 512;
  int textureY = 512;
  
  public ModelRenaultFT17() {
    bodyModel = new ModelRendererTurbo[86];
    bodyModel[0] = new ModelRendererTurbo(this, 76, 454, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 108, 454, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 176, 454, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 234, 454, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 370, 454, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 432, 454, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 0, 400, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 0, 415, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 0, 430, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 9, 423, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 30, 400, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 89, 400, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 75, 423, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 113, 423, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 151, 400, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 151, 419, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 151, 440, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 171, 440, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 155, 370, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 190, 400, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 200, 400, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 200, 408, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 240, 400, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 267, 400, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 240, 430, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 245, 430, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 250, 430, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 250, 435, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 250, 440, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 250, 445, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 270, 430, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 270, 435, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 280, 440, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 280, 445, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 267, 415, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 287, 415, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 306, 400, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 306, 409, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 306, 420, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 314, 420, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 0, 350, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 0, 365, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 0, 375, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 32, 365, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 32, 375, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 44, 365, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 44, 375, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 56, 365, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 56, 375, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 71, 365, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 73, 375, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 94, 350, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 104, 350, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 114, 350, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 0, 390, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 86, 385, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 92, 385, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 125, 350, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 125, 360, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 125, 370, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 125, 380, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 107, 365, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 0, 300, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 0, 315, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 0, 325, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 32, 315, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 32, 325, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 44, 315, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 44, 325, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 56, 315, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 56, 325, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 71, 315, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 73, 325, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 94, 300, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 104, 300, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 114, 300, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 0, 335, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 0, 340, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 86, 335, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 92, 335, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 125, 300, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 125, 310, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 125, 320, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 125, 330, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 107, 315, textureX, textureY);
    
    bodyModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 3, 9, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -2.0F, 0.0F, -6.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.0F, 0.0F, -3.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[0].setRotationPoint(28.0F, -6.0F, -6.0F);
    
    bodyModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 13, 15, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, -4.0F, 0.0F, -6.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(15.0F, -12.0F, -10.0F);
    
    bodyModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 15, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(9.0F, -12.0F, -11.0F);
    
    bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 45, 15, 22, 0.0F);
    bodyModel[3].setRotationPoint(-36.0F, -12.0F, -11.0F);
    
    bodyModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 8, 15, 22, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F);
    bodyModel[4].setRotationPoint(-44.0F, -12.0F, -11.0F);
    
    bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 4, 15, 10, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F);
    bodyModel[5].setRotationPoint(-48.0F, -12.0F, -5.0F);
    
    bodyModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 6, 6, 7, 0.0F, 0.0F, 0.0F, 0.0F, -5.9999F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.9999F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[6].setRotationPoint(9.0F, -18.0F, -11.0F);
    
    bodyModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 6, 6, 8, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[7].setRotationPoint(9.0F, -18.0F, -4.0F);
    
    bodyModel[8].addShapeBox(0.0F, 0.0F, 0.0F, 6, 6, 7, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -5.9999F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.9999F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[8].setRotationPoint(9.0F, -18.0F, 4.0F);
    
    bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 20, 6, 22, 0.0F);
    bodyModel[9].setRotationPoint(-11.0F, -18.0F, -11.0F);
    
    bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 18, 8, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[10].setRotationPoint(-29.0F, -20.0F, 0.0F);
    
    bodyModel[11].addShapeBox(0.0F, 0.0F, 0.0F, 18, 8, 11, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[11].setRotationPoint(-29.0F, -20.0F, -11.0F);
    
    bodyModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 7, 8, 11, 0.0F, 0.0F, -2.9473684F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.2105265F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[12].setRotationPoint(-36.0F, -20.0F, 0.0F);
    
    bodyModel[13].addShapeBox(0.0F, 0.0F, 0.0F, 7, 8, 11, 0.0F, 0.0F, -4.2105265F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.9473684F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[13].setRotationPoint(-36.0F, -20.0F, -11.0F);
    
    bodyModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 8, 6, 11, 0.0F, 0.0F, -4.3157897F, 0.0F, 0.0F, -0.94736844F, 0.0F, 0.0F, -2.2105262F, 0.0F, 0.0F, -4.736842F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F);
    bodyModel[14].setRotationPoint(-44.0F, -18.0F, 0.0F);
    
    bodyModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 8, 6, 11, 0.0F, 0.0F, -4.736842F, -6.0F, 0.0F, -2.2105262F, 0.0F, 0.0F, -0.94736844F, 0.0F, 0.0F, -4.3157897F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[15].setRotationPoint(-44.0F, -18.0F, -11.0F);
    
    bodyModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 5, 0.0F, 0.0F, -1.9999F, 0.0F, 0.0F, -0.31578946F, 0.0F, 0.0F, -0.7368421F, 0.0F, 0.0F, -1.9999F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[16].setRotationPoint(-48.0F, -14.0F, 0.0F);
    
    bodyModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 5, 0.0F, 0.0F, -1.9999F, -2.0F, 0.0F, -0.7368421F, 0.0F, 0.0F, -0.31578946F, 0.0F, 0.0F, -1.9999F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[17].setRotationPoint(-48.0F, -14.0F, -5.0F);
    
    bodyModel[18].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(18.0D, 6.0D, 18, 6), new Coord2D(18.0D, 14.0D, 18, 14), new Coord2D(13.0D, 20.0D, 13, 20), new Coord2D(5.0D, 20.0D, 5, 20), new Coord2D(0.0D, 14.0D, 0, 14), new Coord2D(0.0D, 6.0D, 0, 6) }), 1.0F, 18, 20, 64, 1, 0, new float[] { 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F });
    (bodyModel[18]).rotateAngleX = 1.5707963F;
    
    bodyModel[18].setRotationPoint(9.0F, -19.0F, 10.0F);
    
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[19].setRotationPoint(-20.0F, -20.5F, -1.0F);
    
    bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 5, 2, 4, 0.0F);
    bodyModel[20].setRotationPoint(-29.0F, -21.0F, -2.0F);
    
    bodyModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 15, 2, 4, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 6.0F, 0.0F);
    bodyModel[21].setRotationPoint(-44.0F, -21.0F, -2.0F);
    
    bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 1, 16, 12, 0.0F);
    bodyModel[22].setRotationPoint(-61.0F, -6.0F, -6.0F);
    (bodyModel[22]).rotateAngleZ = 1.047198F;
    
    bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 7, 1, 12, 0.0F);
    bodyModel[23].setRotationPoint(-61.0F, -6.0F, -6.0F);
    (bodyModel[23]).rotateAngleZ = 2.199115F;
    
    bodyModel[24].addShapeBox(1.0F, 0.0F, 0.0F, 1, 14, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    bodyModel[24].setRotationPoint(-61.0F, -6.0F, -5.8F);
    (bodyModel[24]).rotateAngleZ = 1.047198F;
    
    bodyModel[25].addShapeBox(1.0F, 0.0F, 0.0F, 1, 14, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    bodyModel[25].setRotationPoint(-61.0F, -6.0F, 4.8F);
    (bodyModel[25]).rotateAngleZ = 1.047198F;
    
    bodyModel[26].addShapeBox(0.0F, 1.0F, 0.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    bodyModel[26].setRotationPoint(-61.0F, -6.0F, -5.8F);
    (bodyModel[26]).rotateAngleZ = 2.199115F;
    
    bodyModel[27].addShapeBox(0.0F, 1.0F, 0.0F, 7, 1, 1, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    bodyModel[27].setRotationPoint(-61.0F, -6.0F, 4.8F);
    (bodyModel[27]).rotateAngleZ = 2.199115F;
    
    bodyModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    bodyModel[28].setRotationPoint(-56.0F, -4.0F, 2.0F);
    (bodyModel[28]).rotateAngleZ = 0.7679449F;
    
    bodyModel[29].addShapeBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    bodyModel[29].setRotationPoint(-56.0F, -4.0F, -3.0F);
    (bodyModel[29]).rotateAngleZ = 0.7679449F;
    
    bodyModel[30].addShapeBox(0.0F, 0.0F, 0.0F, 15, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    bodyModel[30].setRotationPoint(-62.0F, -9.0F, 2.0F);
    (bodyModel[30]).rotateAngleZ = 0.1919862F;
    
    bodyModel[31].addShapeBox(0.0F, 0.0F, 0.0F, 15, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    bodyModel[31].setRotationPoint(-62.0F, -9.0F, -3.0F);
    (bodyModel[31]).rotateAngleZ = 0.1919862F;
    
    bodyModel[32].addShapeBox(3.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 4.7F, 0.0F, -0.3F, -5.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, 4.7F, 0.0F, -0.3F, -5.3F, 0.0F, -0.3F, -0.3F);
    bodyModel[32].setRotationPoint(-62.0F, -9.0F, 2.0F);
    (bodyModel[32]).rotateAngleZ = 0.1919862F;
    
    bodyModel[33].addShapeBox(3.0F, 0.0F, 0.0F, 8, 1, 1, 0.0F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -5.3F, 0.0F, -0.3F, 4.7F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -5.3F, 0.0F, -0.3F, 4.7F, 0.0F, -0.3F, -0.3F);
    bodyModel[33].setRotationPoint(-62.0F, -9.0F, -3.0F);
    (bodyModel[33]).rotateAngleZ = 0.1919862F;
    
    bodyModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 2.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[34].setRotationPoint(27.0F, 1.0F, 6.0F);
    
    bodyModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.5F, 0.0F, 0.0F, -0.5F, 2.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[35].setRotationPoint(27.0F, 1.0F, -13.0F);
    
    bodyModel[36].addBox(0.0F, 0.0F, 0.0F, 11, 3, 4, 0.0F);
    bodyModel[36].setRotationPoint(-25.0F, -15.0F, 11.0F);
    
    bodyModel[37].addBox(0.0F, 0.0F, 0.0F, 15, 3, 3, 0.0F);
    bodyModel[37].setRotationPoint(-39.0F, -13.0F, -14.0F);
    
    bodyModel[38].addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
    bodyModel[38].setRotationPoint(-41.0F, -12.0F, -13.0F);
    
    bodyModel[39].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[39].setRotationPoint(-41.0F, -12.0F, -13.0F);
    (bodyModel[39]).rotateAngleZ = -0.5585054F;
    
    bodyModel[40].addBox(0.0F, 0.0F, 0.0F, 39, 7, 7, 0.0F);
    bodyModel[40].setRotationPoint(-24.0F, 0.0F, -17.0F);
    
    bodyModel[41].addShapeBox(0.0F, 0.0F, 0.0F, 14, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[41].setRotationPoint(15.0F, 0.0F, -17.0F);
    
    bodyModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 14, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[42].setRotationPoint(15.0F, 0.0F, -13.0F);
    
    bodyModel[43].addShapeBox(0.0F, 0.0F, 0.0F, 4, 7, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[43].setRotationPoint(-28.0F, 0.0F, -17.0F);
    
    bodyModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 4, 7, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[44].setRotationPoint(-28.0F, 0.0F, -13.0F);
    
    bodyModel[45].addShapeBox(0.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 1.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -5.0F, 0.0F);
    bodyModel[45].setRotationPoint(-32.0F, 1.0F, -17.0F);
    
    bodyModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 1.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -5.0F, 0.0F);
    bodyModel[46].setRotationPoint(-32.0F, 1.0F, -13.0F);
    
    bodyModel[47].addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
    bodyModel[47].setRotationPoint(24.0F, -3.0F, -17.0F);
    
    bodyModel[48].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[48].setRotationPoint(-32.0F, 0.0F, -17.5F);
    
    bodyModel[49].addBox(0.0F, 0.0F, 0.0F, 12, 1, 4, 0.0F);
    bodyModel[49].setRotationPoint(14.0F, -2.5F, -16.5F);
    
    bodyModel[50].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
    bodyModel[50].setRotationPoint(10.0F, -2.5F, -15.0F);
    
    bodyModel[51].addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
    bodyModel[51].setRotationPoint(13.5F, -9.0F, -15.5F);
    
    bodyModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[52].setRotationPoint(12.0F, -9.0F, -16.0F);
    
    bodyModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[53].setRotationPoint(11.0F, -9.0F, -16.0F);
    
    bodyModel[54].addBox(0.0F, 0.0F, 0.0F, 41, 1, 1, 0.0F);
    bodyModel[54].setRotationPoint(-23.0F, -6.5F, -16.5F);
    (bodyModel[54]).rotateAngleZ = 0.08726646F;
    
    bodyModel[55].addBox(0.0F, 0.0F, 0.0F, 41, 1, 1, 0.0F);
    bodyModel[55].setRotationPoint(-23.0F, -6.5F, -13.5F);
    (bodyModel[55]).rotateAngleZ = 0.08726646F;
    
    bodyModel[56].addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
    bodyModel[56].setRotationPoint(-23.0F, -6.5F, -16.6F);
    (bodyModel[56]).rotateAngleZ = 0.08726646F;
    
    bodyModel[57].addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
    bodyModel[57].setRotationPoint(-23.0F, -6.5F, -13.4F);
    (bodyModel[57]).rotateAngleZ = 0.08726646F;
    
    bodyModel[58].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    bodyModel[58].setRotationPoint(6.0F, 4.0F, -15.5F);
    
    bodyModel[59].addBox(0.0F, 0.0F, 0.0F, 7, 4, 3, 0.0F);
    bodyModel[59].setRotationPoint(-4.0F, 4.0F, -15.5F);
    
    bodyModel[60].addBox(0.0F, 0.0F, 0.0F, 7, 4, 3, 0.0F);
    bodyModel[60].setRotationPoint(-14.0F, 4.0F, -15.5F);
    
    bodyModel[61].addBox(0.0F, 0.0F, 0.0F, 7, 4, 3, 0.0F);
    bodyModel[61].setRotationPoint(-24.0F, 4.0F, -15.5F);
    
    bodyModel[62].addBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
    bodyModel[62].setRotationPoint(24.0F, -1.0F, -16.5F);
    
    bodyModel[63].addBox(0.0F, 0.0F, 0.0F, 39, 7, 7, 0.0F);
    bodyModel[63].setRotationPoint(-24.0F, 0.0F, 10.0F);
    
    bodyModel[64].addShapeBox(0.0F, 0.0F, 0.0F, 14, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[64].setRotationPoint(15.0F, 0.0F, 16.0F);
    
    bodyModel[65].addShapeBox(0.0F, 0.0F, 0.0F, 14, 7, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[65].setRotationPoint(15.0F, 0.0F, 12.0F);
    
    bodyModel[66].addShapeBox(0.0F, 0.0F, 0.0F, 4, 7, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[66].setRotationPoint(-28.0F, 0.0F, 16.0F);
    
    bodyModel[67].addShapeBox(0.0F, 0.0F, 0.0F, 4, 7, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[67].setRotationPoint(-28.0F, 0.0F, 12.0F);
    
    bodyModel[68].addShapeBox(0.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 1.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -5.0F, 0.0F);
    bodyModel[68].setRotationPoint(-32.0F, 1.0F, 16.0F);
    
    bodyModel[69].addShapeBox(0.0F, 0.0F, 0.0F, 4, 6, 1, 0.0F, -2.0F, 2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 2.0F, 0.0F, 1.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, -5.0F, 0.0F);
    bodyModel[69].setRotationPoint(-32.0F, 1.0F, 12.0F);
    
    bodyModel[70].addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
    bodyModel[70].setRotationPoint(24.0F, -3.0F, 12.0F);
    
    bodyModel[71].addBox(0.0F, 0.0F, 0.0F, 2, 2, 6, 0.0F);
    bodyModel[71].setRotationPoint(-32.0F, 0.0F, 11.5F);
    
    bodyModel[72].addBox(0.0F, 0.0F, 0.0F, 12, 1, 4, 0.0F);
    bodyModel[72].setRotationPoint(14.0F, -2.5F, 12.5F);
    
    bodyModel[73].addBox(0.0F, 0.0F, 0.0F, 4, 1, 1, 0.0F);
    bodyModel[73].setRotationPoint(10.0F, -2.5F, 14.0F);
    
    bodyModel[74].addBox(0.0F, 0.0F, 0.0F, 2, 10, 2, 0.0F);
    bodyModel[74].setRotationPoint(13.5F, -9.0F, 13.5F);
    
    bodyModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[75].setRotationPoint(12.0F, -9.0F, 13.0F);
    
    bodyModel[76].addShapeBox(0.0F, 0.0F, 0.0F, 1, 9, 3, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[76].setRotationPoint(11.0F, -9.0F, 13.0F);
    
    bodyModel[77].addBox(0.0F, 0.0F, 0.0F, 41, 1, 1, 0.0F);
    bodyModel[77].setRotationPoint(-23.0F, -6.5F, 15.5F);
    (bodyModel[77]).rotateAngleZ = 0.08726646F;
    
    bodyModel[78].addBox(0.0F, 0.0F, 0.0F, 41, 1, 1, 0.0F);
    bodyModel[78].setRotationPoint(-23.0F, -6.5F, 12.5F);
    (bodyModel[78]).rotateAngleZ = 0.08726646F;
    
    bodyModel[79].addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
    bodyModel[79].setRotationPoint(-23.0F, -6.5F, 15.6F);
    (bodyModel[79]).rotateAngleZ = 0.08726646F;
    
    bodyModel[80].addBox(0.0F, 0.0F, 0.0F, 1, 7, 1, 0.0F);
    bodyModel[80].setRotationPoint(-23.0F, -6.5F, 12.4F);
    (bodyModel[80]).rotateAngleZ = 0.08726646F;
    
    bodyModel[81].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    bodyModel[81].setRotationPoint(6.0F, 4.0F, 12.5F);
    
    bodyModel[82].addBox(0.0F, 0.0F, 0.0F, 7, 4, 3, 0.0F);
    bodyModel[82].setRotationPoint(-4.0F, 4.0F, 12.5F);
    
    bodyModel[83].addBox(0.0F, 0.0F, 0.0F, 7, 4, 3, 0.0F);
    bodyModel[83].setRotationPoint(-14.0F, 4.0F, 12.5F);
    
    bodyModel[84].addBox(0.0F, 0.0F, 0.0F, 7, 4, 3, 0.0F);
    bodyModel[84].setRotationPoint(-24.0F, 4.0F, 12.5F);
    
    bodyModel[85].addBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F);
    bodyModel[85].setRotationPoint(24.0F, -1.0F, 12.5F);



    
    turretModel = new ModelRendererTurbo[5];
    turretModel[0] = new ModelRendererTurbo(this, 0, 260, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 62, 260, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 132, 260, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 174, 260, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 217, 260, textureX, textureY);
    
    turretModel[0].addShapeBox(0.0F, 0.0F, 0.0F, 6, 9, 24, 0.0F, 0.0F, -1.0F, -1.5F, -1.5F, -2.5F, -7.5F, -1.5F, -2.5F, -7.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F);
    turretModel[0].setRotationPoint(5.0F, -28.0F, -12.0F);
    
    turretModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 10, 9, 24, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[1].setRotationPoint(-5.0F, -28.0F, -12.0F);
    
    turretModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 6, 9, 24, 0.0F, -1.5F, 0.0F, -7.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, -7.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F);
    turretModel[2].setRotationPoint(-11.0F, -28.0F, -12.0F);
    
    turretModel[3].addBox(0.0F, 0.0F, 0.0F, 10, 4, 10, 0.0F);
    turretModel[3].setRotationPoint(-7.0F, -30.0F, -4.0F);
    
    turretModel[4].addShapeBox(0.0F, 0.0F, 0.0F, 12, 3, 12, 0.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[4].setRotationPoint(-8.0F, -33.0F, -5.0F);



    
    barrelModel = new ModelRendererTurbo[5];
    barrelModel[0] = new ModelRendererTurbo(this, 0, 250, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 18, 250, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 33, 250, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 56, 250, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 80, 250, textureX, textureY);
    
    barrelModel[0].addBox(-2.5F, -1.5F, -2.5F, 3, 3, 5, 0.0F);
    barrelModel[0].setRotationPoint(10.5F, -23.5F, 0.0F);
    
    barrelModel[1].addBox(0.5F, -1.3F, -2.0F, 4, 2, 2, 0.0F);
    barrelModel[1].setRotationPoint(10.5F, -23.5F, 0.0F);
    
    barrelModel[2].addBox(-2.2F, -1.0F, -1.5F, 9, 1, 1, 0.0F);
    barrelModel[2].setRotationPoint(10.5F, -23.5F, 0.0F);
    
    barrelModel[3].addBox(-2.7F, 0.2F, -1.5F, 9, 1, 1, 0.0F);
    barrelModel[3].setRotationPoint(10.5F, -23.5F, 0.0F);
    
    barrelModel[4].addBox(0.5F, -1.0F, 1.0F, 3, 1, 1, 0.0F);
    barrelModel[4].setRotationPoint(10.5F, -23.5F, 0.0F);



    
    leftTrackModel = new ModelRendererTurbo[18];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 497, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 17, 497, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 40, 497, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 57, 497, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 84, 497, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 101, 497, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 200, 497, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 225, 497, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 242, 497, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 265, 497, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 282, 497, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 299, 497, textureX, textureY);
    leftTrackModel[12] = new ModelRendererTurbo(this, 322, 497, textureX, textureY);
    leftTrackModel[13] = new ModelRendererTurbo(this, 339, 497, textureX, textureY);
    leftTrackModel[14] = new ModelRendererTurbo(this, 0, 464, textureX, textureY);
    leftTrackModel[15] = new ModelRendererTurbo(this, 414, 497, textureX, textureY);
    leftTrackModel[16] = new ModelRendererTurbo(this, 453, 497, textureX, textureY);
    leftTrackModel[17] = new ModelRendererTurbo(this, 476, 497, textureX, textureY);
    
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 8, 7, 0.0F);
    leftTrackModel[0].setRotationPoint(34.0F, -6.0F, -18.0F);
    
    leftTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    leftTrackModel[1].setRotationPoint(35.0F, 2.0F, -18.0F);
    (leftTrackModel[1]).rotateAngleZ = -2.356194F;
    
    leftTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F);
    leftTrackModel[2].setRotationPoint(29.0F, 8.0F, -18.0F);
    (leftTrackModel[2]).rotateAngleZ = 2.356194F;
    
    leftTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F);
    leftTrackModel[3].setRotationPoint(29.0F, 8.0F, -18.0F);
    (leftTrackModel[3]).rotateAngleZ = -2.972383F;
    
    leftTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 6, 7, 0.0F);
    leftTrackModel[4].setRotationPoint(18.0F, 10.0F, -18.0F);
    (leftTrackModel[4]).rotateAngleZ = 1.75065F;
    
    leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 42, 1, 7, 0.0F);
    leftTrackModel[5].setRotationPoint(-24.0F, 9.0F, -18.0F);
    
    leftTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 5, 1, 7, 0.0F);
    leftTrackModel[6].setRotationPoint(-24.0F, 10.0F, -18.0F);
    (leftTrackModel[6]).rotateAngleZ = 3.050556F;
    
    leftTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 1, 6, 7, 0.0F);
    leftTrackModel[7].setRotationPoint(-34.0F, 9.0F, -18.0F);
    (leftTrackModel[7]).rotateAngleZ = 1.47976F;
    
    leftTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    leftTrackModel[8].setRotationPoint(-34.0F, 9.0F, -18.0F);
    (leftTrackModel[8]).rotateAngleZ = 2.356194F;
    
    leftTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
    leftTrackModel[9].setRotationPoint(-39.0F, 4.0F, -18.0F);
    (leftTrackModel[9]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 6, 7, 0.0F);
    leftTrackModel[10].setRotationPoint(-39.0F, -2.0F, -18.0F);
    
    leftTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    leftTrackModel[11].setRotationPoint(-39.0F, -2.0F, -18.0F);
    (leftTrackModel[11]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
    leftTrackModel[12].setRotationPoint(-34.0F, -7.0F, -18.0F);
    (leftTrackModel[12]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 30, 1, 7, 0.0F);
    leftTrackModel[13].setRotationPoint(-34.0F, -7.0F, -18.0F);
    (leftTrackModel[13]).rotateAngleZ = 0.09773669F;
    
    leftTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 1, 22, 7, 0.0F);
    leftTrackModel[14].setRotationPoint(17.0F, -12.0F, -18.0F);
    (leftTrackModel[14]).rotateAngleZ = -1.473058F;
    
    leftTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 12, 1, 7, 0.0F);
    leftTrackModel[15].setRotationPoint(17.0F, -12.0F, -18.0F);
    
    leftTrackModel[16].addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    leftTrackModel[16].setRotationPoint(29.0F, -12.0F, -18.0F);
    (leftTrackModel[16]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[17].addBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F);
    leftTrackModel[17].setRotationPoint(35.0F, -6.0F, -18.0F);
    (leftTrackModel[17]).rotateAngleZ = -2.356194F;



    
    rightTrackModel = new ModelRendererTurbo[18];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 497, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 17, 497, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 40, 497, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 57, 497, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 84, 497, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 101, 497, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 200, 497, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 225, 497, textureX, textureY);
    rightTrackModel[8] = new ModelRendererTurbo(this, 242, 497, textureX, textureY);
    rightTrackModel[9] = new ModelRendererTurbo(this, 265, 497, textureX, textureY);
    rightTrackModel[10] = new ModelRendererTurbo(this, 282, 497, textureX, textureY);
    rightTrackModel[11] = new ModelRendererTurbo(this, 299, 497, textureX, textureY);
    rightTrackModel[12] = new ModelRendererTurbo(this, 322, 497, textureX, textureY);
    rightTrackModel[13] = new ModelRendererTurbo(this, 339, 497, textureX, textureY);
    rightTrackModel[14] = new ModelRendererTurbo(this, 0, 464, textureX, textureY);
    rightTrackModel[15] = new ModelRendererTurbo(this, 414, 497, textureX, textureY);
    rightTrackModel[16] = new ModelRendererTurbo(this, 453, 497, textureX, textureY);
    rightTrackModel[17] = new ModelRendererTurbo(this, 476, 497, textureX, textureY);
    
    rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 8, 7, 0.0F);
    rightTrackModel[0].setRotationPoint(34.0F, -6.0F, 11.0F);
    
    rightTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    rightTrackModel[1].setRotationPoint(35.0F, 2.0F, 11.0F);
    (rightTrackModel[1]).rotateAngleZ = -2.356194F;
    
    rightTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F);
    rightTrackModel[2].setRotationPoint(29.0F, 8.0F, 11.0F);
    (rightTrackModel[2]).rotateAngleZ = 2.356194F;
    
    rightTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F);
    rightTrackModel[3].setRotationPoint(29.0F, 8.0F, 11.0F);
    (rightTrackModel[3]).rotateAngleZ = -2.972383F;
    
    rightTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 6, 7, 0.0F);
    rightTrackModel[4].setRotationPoint(18.0F, 10.0F, 11.0F);
    (rightTrackModel[4]).rotateAngleZ = 1.75065F;
    
    rightTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 42, 1, 7, 0.0F);
    rightTrackModel[5].setRotationPoint(-24.0F, 9.0F, 11.0F);
    
    rightTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 5, 1, 7, 0.0F);
    rightTrackModel[6].setRotationPoint(-24.0F, 10.0F, 11.0F);
    (rightTrackModel[6]).rotateAngleZ = 3.050556F;
    
    rightTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 1, 6, 7, 0.0F);
    rightTrackModel[7].setRotationPoint(-34.0F, 9.0F, 11.0F);
    (rightTrackModel[7]).rotateAngleZ = 1.47976F;
    
    rightTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    rightTrackModel[8].setRotationPoint(-34.0F, 9.0F, 11.0F);
    (rightTrackModel[8]).rotateAngleZ = 2.356194F;
    
    rightTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
    rightTrackModel[9].setRotationPoint(-39.0F, 4.0F, 11.0F);
    (rightTrackModel[9]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 6, 7, 0.0F);
    rightTrackModel[10].setRotationPoint(-39.0F, -2.0F, 11.0F);
    
    rightTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    rightTrackModel[11].setRotationPoint(-39.0F, -2.0F, 11.0F);
    (rightTrackModel[11]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 4, 7, 0.0F);
    rightTrackModel[12].setRotationPoint(-34.0F, -7.0F, 11.0F);
    (rightTrackModel[12]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 30, 1, 7, 0.0F);
    rightTrackModel[13].setRotationPoint(-34.0F, -7.0F, 11.0F);
    (rightTrackModel[13]).rotateAngleZ = 0.09773669F;
    
    rightTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 1, 22, 7, 0.0F);
    rightTrackModel[14].setRotationPoint(17.0F, -12.0F, 11.0F);
    (rightTrackModel[14]).rotateAngleZ = -1.473058F;
    
    rightTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 12, 1, 7, 0.0F);
    rightTrackModel[15].setRotationPoint(17.0F, -12.0F, 11.0F);
    
    rightTrackModel[16].addBox(0.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    rightTrackModel[16].setRotationPoint(29.0F, -12.0F, 11.0F);
    (rightTrackModel[16]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[17].addBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F);
    rightTrackModel[17].setRotationPoint(35.0F, -6.0F, 11.0F);
    (rightTrackModel[17]).rotateAngleZ = -2.356194F;



    
    leftTrackWheelModels = new ModelRendererTurbo[17];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 18, 474, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 18, 454, textureX, textureY);
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    leftTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    leftTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    leftTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    leftTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    leftTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(9.0F, -9.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(18.0D, 5.0D, 18, 5), new Coord2D(18.0D, 13.0D, 18, 13), new Coord2D(13.0D, 18.0D, 13, 18), new Coord2D(5.0D, 18.0D, 5, 18), new Coord2D(0.0D, 13.0D, 0, 13), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 18, 18, 64, 3, 0, new float[] { 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F });
    leftTrackWheelModels[0].setRotationPoint(25.0F, -2.0F, -14.5F);
    
    leftTrackWheelModels[1].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[1].setRotationPoint(17.0F, 7.0F, -14.0F);
    
    leftTrackWheelModels[2].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[2].setRotationPoint(12.0F, 7.0F, -14.0F);
    
    leftTrackWheelModels[3].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[3].setRotationPoint(7.0F, 7.0F, -14.0F);
    
    leftTrackWheelModels[4].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[4].setRotationPoint(2.0F, 7.0F, -14.0F);
    
    leftTrackWheelModels[5].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[5].setRotationPoint(-3.0F, 7.0F, -14.0F);
    
    leftTrackWheelModels[6].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[6].setRotationPoint(-8.0F, 7.0F, -14.0F);
    
    leftTrackWheelModels[7].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[7].setRotationPoint(-13.0F, 7.0F, -14.0F);
    
    leftTrackWheelModels[8].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[8].setRotationPoint(-18.0F, 7.0F, -14.0F);
    
    leftTrackWheelModels[9].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    leftTrackWheelModels[9].setRotationPoint(-23.0F, 7.0F, -14.0F);
    
    leftTrackWheelModels[10].addShape3D(7.0F, -7.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(14.0D, 4.0D, 14, 4), new Coord2D(14.0D, 10.0D, 14, 10), new Coord2D(10.0D, 14.0D, 10, 14), new Coord2D(4.0D, 14.0D, 4, 14), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 14, 14, 48, 3, 0, new float[] { 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F });
    leftTrackWheelModels[10].setRotationPoint(-31.0F, 1.0F, -14.5F);
    
    leftTrackWheelModels[11].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[11].setRotationPoint(-22.5F, -6.0F, -14.5F);
    
    leftTrackWheelModels[12].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[12].setRotationPoint(-14.5F, -6.5F, -14.5F);
    
    leftTrackWheelModels[13].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[13].setRotationPoint(-6.5F, -7.1F, -14.5F);
    
    leftTrackWheelModels[14].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[14].setRotationPoint(1.5F, -8.0F, -14.5F);
    
    leftTrackWheelModels[15].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[15].setRotationPoint(9.5F, -8.8F, -14.5F);
    
    leftTrackWheelModels[16].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    leftTrackWheelModels[16].setRotationPoint(17.5F, -9.5F, -14.5F);



    
    rightTrackWheelModels = new ModelRendererTurbo[17];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 18, 474, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 62, 474, textureX, textureY);
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 18, 454, textureX, textureY);
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    rightTrackWheelModels[12] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    rightTrackWheelModels[13] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    rightTrackWheelModels[14] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    rightTrackWheelModels[15] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    rightTrackWheelModels[16] = new ModelRendererTurbo(this, 0, 454, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(9.0F, -9.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(18.0D, 5.0D, 18, 5), new Coord2D(18.0D, 13.0D, 18, 13), new Coord2D(13.0D, 18.0D, 13, 18), new Coord2D(5.0D, 18.0D, 5, 18), new Coord2D(0.0D, 13.0D, 0, 13), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 18, 18, 64, 3, 0, new float[] { 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F, 8.0F });
    rightTrackWheelModels[0].setRotationPoint(25.0F, -2.0F, 14.5F);
    
    rightTrackWheelModels[1].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[1].setRotationPoint(17.0F, 7.0F, 14.0F);
    
    rightTrackWheelModels[2].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[2].setRotationPoint(12.0F, 7.0F, 14.0F);
    
    rightTrackWheelModels[3].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[3].setRotationPoint(7.0F, 7.0F, 14.0F);
    
    rightTrackWheelModels[4].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[4].setRotationPoint(2.0F, 7.0F, 14.0F);
    
    rightTrackWheelModels[5].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[5].setRotationPoint(-3.0F, 7.0F, 14.0F);
    
    rightTrackWheelModels[6].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[6].setRotationPoint(-8.0F, 7.0F, 14.0F);
    
    rightTrackWheelModels[7].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[7].setRotationPoint(-13.0F, 7.0F, 14.0F);
    
    rightTrackWheelModels[8].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[8].setRotationPoint(-18.0F, 7.0F, 14.0F);
    
    rightTrackWheelModels[9].addShape3D(2.0F, -2.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(4.0D, 1.0D, 4, 1), new Coord2D(4.0D, 3.0D, 4, 3), new Coord2D(3.0D, 4.0D, 3, 4), new Coord2D(1.0D, 4.0D, 1, 4), new Coord2D(0.0D, 3.0D, 0, 3), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 4, 4, 16, 2, 0, new float[] { 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F, 2.0F });
    rightTrackWheelModels[9].setRotationPoint(-23.0F, 7.0F, 14.0F);
    
    rightTrackWheelModels[10].addShape3D(7.0F, -7.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(14.0D, 4.0D, 14, 4), new Coord2D(14.0D, 10.0D, 14, 10), new Coord2D(10.0D, 14.0D, 10, 14), new Coord2D(4.0D, 14.0D, 4, 14), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 4.0D, 0, 4) }), 3.0F, 14, 14, 48, 3, 0, new float[] { 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F });
    rightTrackWheelModels[10].setRotationPoint(-31.0F, 1.0F, 14.5F);
    
    rightTrackWheelModels[11].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[11].setRotationPoint(-22.5F, -6.0F, 14.5F);
    
    rightTrackWheelModels[12].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[12].setRotationPoint(-14.5F, -6.5F, 14.5F);
    
    rightTrackWheelModels[13].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[13].setRotationPoint(-6.5F, -7.1F, 14.5F);
    
    rightTrackWheelModels[14].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[14].setRotationPoint(1.5F, -8.0F, 14.5F);
    
    rightTrackWheelModels[15].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[15].setRotationPoint(9.5F, -8.8F, 14.5F);
    
    rightTrackWheelModels[16].addShape3D(1.5F, -1.5F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 2.0F, 3, 3, 12, 2, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    rightTrackWheelModels[16].setRotationPoint(17.5F, -9.5F, 14.5F);

    
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
