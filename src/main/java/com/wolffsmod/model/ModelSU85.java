package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;


public class ModelSU85
  extends ModelVehicle
{
  int textureX = 512;
  int textureY = 512;


  
  public ModelSU85() {
    bodyModel = new ModelRendererTurbo[87];
    bodyModel[0] = new ModelRendererTurbo(this, 0, 410, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 67, 405, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 67, 405, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 67, 405, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 67, 405, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 67, 405, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 355, 370, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 0, 340, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 235, 408, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 0, 405, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 0, 415, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 0, 420, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 0, 430, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 0, 310, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 0, 325, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 0, 437, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 13, 437, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 0, 446, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 0, 456, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 0, 463, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 47, 405, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 67, 410, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 60, 405, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 67, 415, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 67, 420, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 80, 420, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 90, 420, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 0, 340, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 0, 355, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 0, 370, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 8, 370, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 18, 370, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 27, 370, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 190, 445, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 190, 445, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 190, 450, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 225, 450, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 260, 450, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 245, 320, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 245, 275, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 245, 365, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 290, 365, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 215, 405, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 240, 405, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 245, 375, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 260, 375, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 300, 375, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 320, 375, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 275, 450, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 305, 450, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 215, 425, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 245, 425, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 0, 70, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 0, 100, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 20, 100, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 40, 100, textureX, textureY);
    bodyModel[56] = new ModelRendererTurbo(this, 30, 70, textureX, textureY);
    bodyModel[57] = new ModelRendererTurbo(this, 60, 100, textureX, textureY);
    bodyModel[58] = new ModelRendererTurbo(this, 80, 100, textureX, textureY);
    bodyModel[59] = new ModelRendererTurbo(this, 100, 100, textureX, textureY);
    bodyModel[60] = new ModelRendererTurbo(this, 60, 70, textureX, textureY);
    bodyModel[61] = new ModelRendererTurbo(this, 120, 100, textureX, textureY);
    bodyModel[62] = new ModelRendererTurbo(this, 140, 100, textureX, textureY);
    bodyModel[63] = new ModelRendererTurbo(this, 160, 100, textureX, textureY);
    bodyModel[64] = new ModelRendererTurbo(this, 90, 70, textureX, textureY);
    bodyModel[65] = new ModelRendererTurbo(this, 180, 100, textureX, textureY);
    bodyModel[66] = new ModelRendererTurbo(this, 200, 100, textureX, textureY);
    bodyModel[67] = new ModelRendererTurbo(this, 220, 100, textureX, textureY);
    bodyModel[68] = new ModelRendererTurbo(this, 0, 275, textureX, textureY);
    bodyModel[69] = new ModelRendererTurbo(this, 0, 235, textureX, textureY);
    bodyModel[70] = new ModelRendererTurbo(this, 0, 190, textureX, textureY);
    bodyModel[71] = new ModelRendererTurbo(this, 0, 165, textureX, textureY);
    bodyModel[72] = new ModelRendererTurbo(this, 30, 165, textureX, textureY);
    bodyModel[73] = new ModelRendererTurbo(this, 30, 173, textureX, textureY);
    bodyModel[74] = new ModelRendererTurbo(this, 62, 165, textureX, textureY);
    bodyModel[75] = new ModelRendererTurbo(this, 110, 165, textureX, textureY);
    bodyModel[76] = new ModelRendererTurbo(this, 110, 177, textureX, textureY);
    bodyModel[77] = new ModelRendererTurbo(this, 140, 165, textureX, textureY);
    bodyModel[78] = new ModelRendererTurbo(this, 210, 165, textureX, textureY);
    bodyModel[79] = new ModelRendererTurbo(this, 210, 185, textureX, textureY);
    bodyModel[80] = new ModelRendererTurbo(this, 210, 200, textureX, textureY);
    bodyModel[81] = new ModelRendererTurbo(this, 210, 220, textureX, textureY);
    bodyModel[82] = new ModelRendererTurbo(this, 200, 220, textureX, textureY);
    bodyModel[83] = new ModelRendererTurbo(this, 190, 220, textureX, textureY);
    bodyModel[84] = new ModelRendererTurbo(this, 180, 220, textureX, textureY);
    bodyModel[85] = new ModelRendererTurbo(this, 170, 221, textureX, textureY);
    
    bodyModel[86] = new ModelRendererTurbo(this, 425, 0, textureX, textureY);
    
    bodyModel[86].addBox(-2.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);
    bodyModel[86].setRotationPoint(45.0F, -17.5F, -9.5F);

    
    bodyModel[0].addBox(0.0F, 0.0F, 0.0F, 2, 2, 59, 0.0F);
    bodyModel[0].setRotationPoint(-63.5F, -2.5F, -29.5F);
    
    bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 2, 2, 57, 0.0F);
    bodyModel[1].setRotationPoint(-48.0F, 0.0F, -28.5F);
    
    bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 2, 2, 57, 0.0F);
    bodyModel[2].setRotationPoint(-31.0F, 0.0F, -28.5F);
    
    bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 2, 2, 57, 0.0F);
    bodyModel[3].setRotationPoint(-14.0F, 0.0F, -28.5F);
    
    bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 2, 2, 57, 0.0F);
    bodyModel[4].setRotationPoint(6.0F, 0.0F, -28.5F);
    
    bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 2, 2, 57, 0.0F);
    bodyModel[5].setRotationPoint(24.0F, 0.0F, -28.5F);
    
    bodyModel[6].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(2.0D, 3.0D, 2, 3), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 1.0D, 0, 1) }), 56.0F, 3, 3, 12, 56, 0, new float[] { 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F, 2.0F, 1.0F });
    bodyModel[6].setRotationPoint(40.5F, -1.5F, 28.0F);
    
    bodyModel[7].addFlexBox(0.0F, 0.0F, 0.0F, 95, 8, 52, 0.0F, -10.0F, -14.0F, -7.0F, -7.0F, 4);
    bodyModel[7].setRotationPoint(-64.0F, -21.0F, -26.0F);
    
    bodyModel[8].addFlexBox(0.0F, 0.0F, 0.0F, 37, 2, 38, 0.0F, -3.0F, -2.0F, -2.0F, -2.0F, 4);
    bodyModel[8].setRotationPoint(-54.0F, -23.0F, -19.0F);
    
    bodyModel[9].addFlexBox(7.0F, -2.0F, 7.0F, 9, 4, 4, 0.0F, 0.0F, -5.0F, -1.0F, -1.0F, 4);
    bodyModel[9].setRotationPoint(-71.0F, -8.0F, 0.0F);
    (bodyModel[9]).rotateAngleZ = 0.6632251F;
    
    bodyModel[10].addBox(5.0F, -1.0F, 8.0F, 6, 2, 2, 0.0F);
    bodyModel[10].setRotationPoint(-71.0F, -8.0F, 0.0F);
    (bodyModel[10]).rotateAngleZ = 0.6632251F;
    
    bodyModel[11].addFlexBox(7.0F, -2.0F, -11.0F, 9, 4, 4, 0.0F, 0.0F, -5.0F, -1.0F, -1.0F, 4);
    bodyModel[11].setRotationPoint(-71.0F, -8.0F, 0.0F);
    (bodyModel[11]).rotateAngleZ = 0.6632251F;
    
    bodyModel[12].addBox(5.0F, -1.0F, -10.0F, 6, 2, 2, 0.0F);
    bodyModel[12].setRotationPoint(-71.0F, -8.0F, 0.0F);
    (bodyModel[12]).rotateAngleZ = 0.6632251F;
    
    bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 107, 1, 12, 0.0F);
    bodyModel[13].setRotationPoint(-64.0F, -13.0F, -30.0F);
    
    bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 107, 1, 12, 0.0F);
    bodyModel[14].setRotationPoint(-64.0F, -13.0F, 18.0F);
    
    bodyModel[15].addTrapezoid(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F, -0.4F, 3);
    bodyModel[15].setRotationPoint(16.5F, -21.0F, 25.0F);
    
    bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[16].setRotationPoint(17.0F, -20.0F, 20.0F);
    
    bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 24, 4, 4, 0.0F);
    bodyModel[17].setRotationPoint(3.0F, -17.0F, 25.8F);
    
    bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 11, 1, 4, 0.0F);
    bodyModel[18].setRotationPoint(-63.5F, -14.0F, 26.0F);
    
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 11, 1, 4, 0.0F);
    bodyModel[19].setRotationPoint(-63.5F, -14.0F, -30.0F);
    
    bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
    bodyModel[20].setRotationPoint(-52.0F, -13.5F, -29.0F);
    
    bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 24, 1, 1, 0.0F);
    bodyModel[21].setRotationPoint(-49.0F, -13.3F, -28.5F);
    
    bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 29, 1, 1, 0.0F);
    bodyModel[22].setRotationPoint(-26.0F, -13.3F, -29.0F);
    
    bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 24, 1, 1, 0.0F);
    bodyModel[23].setRotationPoint(2.0F, -13.3F, -28.5F);
    
    bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 3, 1, 2, 0.0F);
    bodyModel[24].setRotationPoint(26.0F, -13.5F, -29.0F);
    
    bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[25].setRotationPoint(-41.0F, -13.5F, -29.0F);
    
    bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[26].setRotationPoint(17.0F, -13.5F, -29.0F);
    
    bodyModel[27].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(9.0D, 2.0D, 9, 2), new Coord2D(9.0D, 7.0D, 9, 7), new Coord2D(7.0D, 9.0D, 7, 9), new Coord2D(2.0D, 9.0D, 2, 9), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 9, 9, 32, 4, 0, new float[] { 3.0F, 5.0F, 3.0F, 5.0F, 3.0F, 5.0F, 3.0F, 5.0F });
    bodyModel[27].setRotationPoint(-57.0F, 3.0F, 18.0F);
    
    bodyModel[28].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(9.0D, 2.0D, 9, 2), new Coord2D(9.0D, 7.0D, 9, 7), new Coord2D(7.0D, 9.0D, 7, 9), new Coord2D(2.0D, 9.0D, 2, 9), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 9, 9, 32, 4, 0, new float[] { 3.0F, 5.0F, 3.0F, 5.0F, 3.0F, 5.0F, 3.0F, 5.0F });
    bodyModel[28].setRotationPoint(-57.0F, 3.0F, -14.0F);
    
    bodyModel[29].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[29].setRotationPoint(40.0F, -11.0F, -12.0F);
    
    bodyModel[30].addBox(-0.3F, 2.0F, -13.0F, 1, 5, 3, 0.0F);
    bodyModel[30].setRotationPoint(44.0F, -5.0F, 0.0F);
    (bodyModel[30]).rotateAngleZ = -2.2602015F;
    
    bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[31].setRotationPoint(40.0F, -11.0F, 11.0F);
    
    bodyModel[32].addBox(-0.3F, 2.0F, 10.0F, 1, 5, 3, 0.0F);
    bodyModel[32].setRotationPoint(44.0F, -5.0F, 0.0F);
    (bodyModel[32]).rotateAngleZ = -2.2602015F;
    
    bodyModel[33].addBox(-0.8F, 1.5F, -8.0F, 1, 10, 16, 0.0F);
    bodyModel[33].setRotationPoint(44.0F, -5.0F, 0.0F);
    (bodyModel[33]).rotateAngleZ = -2.2602015F;
    
    bodyModel[34].addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[34].setRotationPoint(-66.0F, -1.0F, 10.0F);
    
    bodyModel[35].addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[35].setRotationPoint(-66.0F, -1.0F, -11.0F);
    
    bodyModel[36].addBox(7.0F, 0.0F, -6.0F, 9, 1, 9, 0.0F);
    bodyModel[36].setRotationPoint(-71.0F, -8.0F, 0.0F);
    (bodyModel[36]).rotateAngleZ = 0.6632251F;
    
    bodyModel[37].addBox(6.5F, -0.5F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[37].setRotationPoint(-71.0F, -8.0F, 0.0F);
    (bodyModel[37]).rotateAngleZ = 0.6632251F;
    
    bodyModel[38].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(105.0D, 0.0D, 105, 0), new Coord2D(112.0D, 7.0D, 112, 7) }), 36.0F, 112, 7, 230, 36, 0, new float[] { 112.0F, 10.0F, 95.0F, 13.0F });
    bodyModel[38].setRotationPoint(44.0F, 2.0F, 18.0F);
    
    bodyModel[39].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(112.0D, 0.0D, 112, 0), new Coord2D(115.0D, 3.0D, 115, 3), new Coord2D(108.0D, 8.0D, 108, 8), new Coord2D(10.0D, 8.0D, 10, 8) }), 36.0F, 115, 8, 237, 36, 0, new float[] { 16.0F, 95.0F, 9.0F, 5.0F, 112.0F });
    bodyModel[39].setRotationPoint(44.0F, -5.0F, 18.0F);
    
    bodyModel[40].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(13.0D, 8.0D, 13, 8), new Coord2D(1.0D, 8.0D, 1, 8) }), 1.0F, 13, 8, 42, 1, 0, new float[] { 9.0F, 12.0F, 8.0F, 13.0F });
    bodyModel[40].setRotationPoint(44.0F, -5.0F, -17.0F);
    
    bodyModel[41].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(13.0D, 8.0D, 13, 8), new Coord2D(1.0D, 8.0D, 1, 8) }), 1.0F, 13, 8, 42, 1, 0, new float[] { 9.0F, 12.0F, 8.0F, 13.0F });
    bodyModel[41].setRotationPoint(44.0F, -5.0F, 18.0F);
    
    bodyModel[42].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(9.0D, 1.0D, 9, 1), new Coord2D(0.0D, 3.0D, 0, 3) }), 12.0F, 9, 3, 22, 12, 0, new float[] { 1.0F, 10.0F, 1.0F, 10.0F });
    bodyModel[42].setRotationPoint(-64.0F, -10.0F, 30.0F);
    
    bodyModel[43].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(9.0D, 1.0D, 9, 1), new Coord2D(0.0D, 3.0D, 0, 3) }), 12.0F, 9, 3, 22, 12, 0, new float[] { 1.0F, 10.0F, 1.0F, 10.0F });
    bodyModel[43].setRotationPoint(-64.0F, -10.0F, -18.0F);
    
    bodyModel[44].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2) }), 12.0F, 3, 2, 10, 12, 0, new float[] { 4.0F, 1.0F, 4.0F, 1.0F });
    bodyModel[44].setRotationPoint(46.0F, -11.0F, 30.0F);
    
    bodyModel[45].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(3.0D, 2.0D, 3, 2) }), 12.0F, 3, 2, 10, 12, 0, new float[] { 4.0F, 1.0F, 4.0F, 1.0F });
    bodyModel[45].setRotationPoint(46.0F, -11.0F, -18.0F);
    
    bodyModel[46].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(3.0D, 5.0D, 3, 5) }), 12.0F, 4, 6, 16, 12, 0, new float[] { 6.0F, 2.0F, 1.0F, 6.0F, 1.0F });
    bodyModel[46].setRotationPoint(50.0F, -6.0F, 30.0F);
    
    bodyModel[47].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(3.0D, 5.0D, 3, 5) }), 12.0F, 4, 6, 16, 12, 0, new float[] { 6.0F, 2.0F, 1.0F, 6.0F, 1.0F });
    bodyModel[47].setRotationPoint(50.0F, -6.0F, -18.0F);
    
    bodyModel[48].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(7.0D, 8.0D, 7, 8), new Coord2D(4.0D, 7.0D, 4, 7), new Coord2D(3.0D, 6.0D, 3, 6) }), 1.0F, 7, 8, 28, 1, 0, new float[] { 6.0F, 2.0F, 4.0F, 9.0F, 7.0F });
    bodyModel[48].setRotationPoint(50.0F, -5.0F, -17.0F);
    
    bodyModel[49].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(7.0D, 8.0D, 7, 8), new Coord2D(4.0D, 7.0D, 4, 7), new Coord2D(3.0D, 6.0D, 3, 6) }), 1.0F, 7, 8, 28, 1, 0, new float[] { 6.0F, 2.0F, 4.0F, 9.0F, 7.0F });
    bodyModel[49].setRotationPoint(50.0F, -5.0F, 18.0F);
    
    bodyModel[50].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(9.0D, 2.0D, 9, 2), new Coord2D(9.0D, 3.0D, 9, 3), new Coord2D(0.0D, 5.0D, 0, 5) }), 1.0F, 9, 5, 23, 1, 0, new float[] { 9.0F, 10.0F, 1.0F, 3.0F });
    bodyModel[50].setRotationPoint(-64.0F, -8.0F, 18.0F);
    
    bodyModel[51].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(9.0D, 2.0D, 9, 2), new Coord2D(9.0D, 3.0D, 9, 3), new Coord2D(0.0D, 5.0D, 0, 5) }), 1.0F, 9, 5, 23, 1, 0, new float[] { 9.0F, 10.0F, 1.0F, 3.0F });
    bodyModel[51].setRotationPoint(-64.0F, -8.0F, -17.0F);
    
    bodyModel[52].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 19.0F, 7, 7, 24, 19, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    (bodyModel[52]).rotateAngleY = -1.5707964F;
    bodyModel[52].setRotationPoint(-38.0F, -16.0F, 21.0F);
    
    bodyModel[53].addBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
    bodyModel[53].setRotationPoint(-43.0F, -18.0F, 21.0F);
    
    bodyModel[54].addBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
    bodyModel[54].setRotationPoint(-53.0F, -18.0F, 21.0F);
    
    bodyModel[55].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    bodyModel[55].setRotationPoint(-48.5F, -23.5F, 23.5F);
    
    bodyModel[56].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 19.0F, 7, 7, 24, 19, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    (bodyModel[56]).rotateAngleY = -1.5707964F;
    bodyModel[56].setRotationPoint(-38.0F, -16.0F, -28.0F);
    
    bodyModel[57].addBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
    bodyModel[57].setRotationPoint(-53.0F, -18.0F, -28.0F);
    
    bodyModel[58].addBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
    bodyModel[58].setRotationPoint(-43.0F, -18.0F, -28.0F);
    
    bodyModel[59].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    bodyModel[59].setRotationPoint(-48.5F, -23.5F, -25.5F);
    
    bodyModel[60].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 19.0F, 7, 7, 24, 19, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    (bodyModel[60]).rotateAngleY = -1.5707964F;
    bodyModel[60].setRotationPoint(-18.5F, -16.0F, -28.0F);
    
    bodyModel[61].addBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
    bodyModel[61].setRotationPoint(-33.5F, -18.0F, -28.0F);
    
    bodyModel[62].addBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
    bodyModel[62].setRotationPoint(-23.5F, -18.0F, -28.0F);
    
    bodyModel[63].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    bodyModel[63].setRotationPoint(-29.0F, -23.5F, -25.5F);
    
    bodyModel[64].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 19.0F, 7, 7, 24, 19, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    (bodyModel[64]).rotateAngleY = -1.5707964F;
    bodyModel[64].setRotationPoint(-18.5F, -16.0F, 21.0F);
    
    bodyModel[65].addBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
    bodyModel[65].setRotationPoint(-33.5F, -18.0F, 21.0F);
    
    bodyModel[66].addBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
    bodyModel[66].setRotationPoint(-23.5F, -18.0F, 21.0F);
    
    bodyModel[67].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    bodyModel[67].setRotationPoint(-29.0F, -23.5F, 23.5F);
    
    bodyModel[68].addFlexBox(0.0F, 0.0F, 0.0F, 49, 18, 14, 0.0F, -1.0F, -21.0F, -6.0F, 0.0F, 4);
    bodyModel[68].setRotationPoint(-15.0F, -31.0F, -26.0F);
    
    bodyModel[69].addFlexBox(0.0F, 0.0F, 0.0F, 28, 18, 16, 0.0F, -1.0F, -0.0F, 0.0F, 0.0F, 4);
    bodyModel[69].setRotationPoint(-15.0F, -31.0F, -12.0F);
    
    bodyModel[70].addFlexBox(0.0F, 0.0F, 0.0F, 49, 18, 22, 0.0F, -1.0F, -21.0F, 0.0F, -6.0F, 4);
    bodyModel[70].setRotationPoint(-15.0F, -31.0F, 4.0F);
    
    bodyModel[71].addBox(0.0F, -1.0F, 0.0F, 3, 3, 18, 0.0F);
    bodyModel[71].setRotationPoint(13.0F, -31.0F, -13.0F);
    (bodyModel[71]).rotateAngleZ = -0.715585F;
    
    bodyModel[72].addBox(3.0F, -1.0F, 0.0F, 21, 3, 2, 0.0F);
    bodyModel[72].setRotationPoint(13.0F, -31.0F, -13.0F);
    (bodyModel[72]).rotateAngleZ = -0.715585F;
    
    bodyModel[73].addBox(3.0F, -1.0F, 16.0F, 21, 3, 2, 0.0F);
    bodyModel[73].setRotationPoint(13.0F, -31.0F, -13.0F);
    (bodyModel[73]).rotateAngleZ = -0.715585F;
    
    bodyModel[74].addBox(24.0F, -1.0F, 0.0F, 3, 3, 18, 0.0F);
    bodyModel[74].setRotationPoint(13.0F, -31.0F, -13.0F);
    (bodyModel[74]).rotateAngleZ = -0.715585F;
    
    bodyModel[75].addShape3D(3.0F, -3.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 6, 6, 20, 2, 0, new float[] { 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F });
    (bodyModel[75]).rotateAngleX = 1.5707964F;
    bodyModel[75].setRotationPoint(-11.0F, -33.0F, -17.0F);
    
    bodyModel[76].addShape3D(3.0F, -3.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 6, 6, 20, 2, 0, new float[] { 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F });
    (bodyModel[76]).rotateAngleX = 1.5707964F;
    bodyModel[76].setRotationPoint(-7.5F, -33.0F, -10.0F);
    
    bodyModel[77].addShape3D(8.0F, -8.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(14.0D, 2.0D, 14, 2), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(14.0D, 14.0D, 14, 14), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(2.0D, 14.0D, 2, 14), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(2.0D, 2.0D, 2, 2) }), 21.0F, 16, 16, 56, 21, 0, new float[] { 4.0F, 4.0F, 6.0F, 4.0F, 4.0F, 6.0F, 4.0F, 4.0F, 6.0F, 4.0F, 4.0F, 6.0F });
    (bodyModel[77]).rotateAngleX = 1.5707964F;
    bodyModel[77].setRotationPoint(4.0F, -34.0F, -17.0F);
    
    bodyModel[78].addShape3D(7.0F, -7.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(14.0D, 4.0D, 14, 4), new Coord2D(14.0D, 10.0D, 14, 10), new Coord2D(10.0D, 14.0D, 10, 14), new Coord2D(4.0D, 14.0D, 4, 14), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 14, 14, 48, 1, 0, new float[] { 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F });
    (bodyModel[78]).rotateAngleX = 1.5707964F;
    bodyModel[78].setRotationPoint(4.0F, -35.0F, -17.0F);
    
    bodyModel[79].addBox(13.0F, -1.0F, 19.0F, 13, 1, 11, 0.0F);
    bodyModel[79].setRotationPoint(12.0F, -31.0F, -13.0F);
    (bodyModel[79]).rotateAngleZ = -0.715585F;
    
    bodyModel[80].addBox(0.0F, 0.0F, 0.0F, 12, 1, 15, 0.0F);
    bodyModel[80].setRotationPoint(-14.0F, -31.5F, -4.0F);
    
    bodyModel[81].addBox(0.0F, 0.0F, 0.0F, 12, 2, 14, 0.0F);
    bodyModel[81].setRotationPoint(1.5F, -31.5F, -1.0F);
    
    bodyModel[82].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    bodyModel[82].setRotationPoint(9.5F, -32.0F, -1.5F);
    
    bodyModel[83].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    bodyModel[83].setRotationPoint(3.5F, -32.0F, -1.5F);
    
    bodyModel[84].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    bodyModel[84].setRotationPoint(9.5F, -32.0F, 12.5F);
    
    bodyModel[85].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    bodyModel[85].setRotationPoint(3.5F, -32.0F, 12.5F);


    
    turretModel = new ModelRendererTurbo[3];
    turretModel[0] = new ModelRendererTurbo(this, 0, 135, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 0, 135, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 75, 135, textureX, textureY);
    
    turretModel[0].addTrapezoid(12.0F, -29.0F, -11.0F, 21, 12, 14, 0.0F, -0.5F, 2);
    
    turretModel[1].addBox(21.0F, -32.0F, -5.5F, 3, 4, 1, 0.0F);
    
    turretModel[2].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(10.0D, 16.0D, 10, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(3.0D, 15.0D, 3, 15), new Coord2D(1.0D, 13.0D, 1, 13), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(1.0D, 3.0D, 1, 3), new Coord2D(3.0D, 1.0D, 3, 1), new Coord2D(5.0D, 0.0D, 5, 0) }), 5.0F, 10, 16, 50, 5, 0, new float[] { 5.0F, 3.0F, 3.0F, 6.0F, 6.0F, 3.0F, 3.0F, 5.0F, 16.0F });
    (turretModel[2]).rotateAngleX = 1.5707964F;
    turretModel[2].setRotationPoint(32.5F, -29.2F, 5.0F);


    
    barrelModel = new ModelRendererTurbo[5];
    barrelModel[0] = new ModelRendererTurbo(this, 135, 130, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 175, 130, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 200, 130, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 270, 130, textureX, textureY);
    barrelModel[4] = new ModelRendererTurbo(this, 425, 130, textureX, textureY);
    
    barrelModel[0].addFlexBox(0.0F, -8.0F, -6.0F, 3, 14, 14, 0.0F, -4.0F, -2.0F, -2.0F, -4.0F, 2);
    barrelModel[0].setRotationPoint(33.0F, -22.0F, -5.0F);
    
    barrelModel[1].addFlexBox(3.0F, -4.0F, -4.0F, 3, 8, 8, 0.0F, -2.0F, -2.0F, -2.0F, -2.0F, 2);
    barrelModel[1].setRotationPoint(33.0F, -22.0F, -5.0F);
    
    barrelModel[2].addTrapezoid(-14.0F, -2.5F, -2.5F, 21, 5, 5, 0.0F, -0.3F, 2);
    barrelModel[2].setRotationPoint(33.0F, -22.0F, -5.0F);
    
    barrelModel[3].addTrapezoid(7.0F, -2.0F, -2.0F, 53, 4, 4, 0.0F, -0.5F, 2);
    barrelModel[3].setRotationPoint(33.0F, -22.0F, -5.0F);
    
    barrelModel[4].addBox(2.0F, -5.0F, -0.5F, 3, 4, 1, 0.0F);
    barrelModel[4].setRotationPoint(33.0F, -22.0F, -5.0F);


    
    leftTrackModel = new ModelRendererTurbo[22];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 0, 478, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 26, 478, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 53, 482, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 68, 486, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 87, 478, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 102, 484, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 118, 478, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 137, 482, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 158, 475, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 173, 482, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 180, 500, textureX, textureY);
    leftTrackModel[12] = new ModelRendererTurbo(this, 188, 478, textureX, textureY);
    leftTrackModel[13] = new ModelRendererTurbo(this, 213, 483, textureX, textureY);
    leftTrackModel[14] = new ModelRendererTurbo(this, 237, 478, textureX, textureY);
    leftTrackModel[15] = new ModelRendererTurbo(this, 260, 481, textureX, textureY);
    leftTrackModel[16] = new ModelRendererTurbo(this, 275, 478, textureX, textureY);
    leftTrackModel[17] = new ModelRendererTurbo(this, 296, 480, textureX, textureY);
    leftTrackModel[18] = new ModelRendererTurbo(this, 311, 474, textureX, textureY);
    leftTrackModel[19] = new ModelRendererTurbo(this, 326, 481, textureX, textureY);
    leftTrackModel[20] = new ModelRendererTurbo(this, 360, 493, textureX, textureY);
    leftTrackModel[21] = new ModelRendererTurbo(this, 348, 478, textureX, textureY);
    
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 78, 1, 11, 0.0F);
    leftTrackModel[0].setRotationPoint(-50.0F, 9.0F, -30.0F);
    
    leftTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 8, 11, 0.0F);
    leftTrackModel[1].setRotationPoint(28.0F, 10.0F, -30.0F);
    (leftTrackModel[1]).rotateAngleZ = 2.064738F;
    
    leftTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 7, 1, 11, 0.0F);
    leftTrackModel[2].setRotationPoint(41.0F, 3.0F, -30.0F);
    (leftTrackModel[2]).rotateAngleZ = -2.647651F;
    
    leftTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 1, 3, 11, 0.0F);
    leftTrackModel[3].setRotationPoint(41.0F, 3.0F, -30.0F);
    (leftTrackModel[3]).rotateAngleZ = 2.356194F;
    
    leftTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 3, 1, 11, 0.0F);
    leftTrackModel[4].setRotationPoint(45.0F, -1.0F, -30.0F);
    (leftTrackModel[4]).rotateAngleZ = -2.356194F;
    
    leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 4, 11, 0.0F);
    leftTrackModel[5].setRotationPoint(44.0F, -5.0F, -30.0F);
    
    leftTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 3, 11, 0.0F);
    leftTrackModel[6].setRotationPoint(45.0F, -5.0F, -30.0F);
    (leftTrackModel[6]).rotateAngleZ = -2.356194F;
    
    leftTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 3, 1, 11, 0.0F);
    leftTrackModel[7].setRotationPoint(41.0F, -9.0F, -30.0F);
    (leftTrackModel[7]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 4, 1, 11, 0.0F);
    leftTrackModel[8].setRotationPoint(37.0F, -9.0F, -30.0F);
    
    leftTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 5, 11, 0.0F);
    leftTrackModel[9].setRotationPoint(37.0F, -9.0F, -30.0F);
    (leftTrackModel[9]).rotateAngleZ = -1.460139F;
    
    leftTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 5, 11, 0.0F);
    leftTrackModel[10].setRotationPoint(28.0F, -7.0F, -30.0F);
    (leftTrackModel[10]).rotateAngleZ = 1.681454F;
    
    leftTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 78, 1, 11, 0.0F);
    leftTrackModel[11].setRotationPoint(-50.0F, -8.0F, -30.0F);
    
    leftTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 6, 1, 11, 0.0F);
    leftTrackModel[12].setRotationPoint(-50.0F, -7.0F, -30.0F);
    (leftTrackModel[12]).rotateAngleZ = 3.041924F;
    
    leftTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 5, 1, 11, 0.0F);
    leftTrackModel[13].setRotationPoint(-60.0F, -9.0F, -30.0F);
    (leftTrackModel[13]).rotateAngleZ = -0.09966865F;
    
    leftTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 5, 1, 11, 0.0F);
    leftTrackModel[14].setRotationPoint(-65.0F, -9.0F, -30.0F);
    
    leftTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 1, 4, 11, 0.0F);
    leftTrackModel[15].setRotationPoint(-65.0F, -9.0F, -30.0F);
    (leftTrackModel[15]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[16].addBox(0.0F, 0.0F, 0.0F, 4, 1, 11, 0.0F);
    leftTrackModel[16].setRotationPoint(-70.0F, -4.0F, -30.0F);
    (leftTrackModel[16]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[17].addBox(0.0F, 0.0F, 0.0F, 1, 5, 11, 0.0F);
    leftTrackModel[17].setRotationPoint(-70.0F, -4.0F, -30.0F);
    
    leftTrackModel[18].addBox(0.0F, 0.0F, 0.0F, 1, 4, 11, 0.0F);
    leftTrackModel[18].setRotationPoint(-70.0F, 1.0F, -30.0F);
    (leftTrackModel[18]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[19].addBox(0.0F, 0.0F, 0.0F, 4, 1, 11, 0.0F);
    leftTrackModel[19].setRotationPoint(-65.0F, 6.0F, -30.0F);
    (leftTrackModel[19]).rotateAngleZ = 2.356194F;
    
    leftTrackModel[20].addBox(0.0F, 0.0F, 0.0F, 1, 8, 11, 0.0F);
    leftTrackModel[20].setRotationPoint(-65.0F, 6.0F, -30.0F);
    (leftTrackModel[20]).rotateAngleZ = 1.310194F;
    
    leftTrackModel[21].addBox(0.0F, 0.0F, 0.0F, 8, 1, 11, 0.0F);
    leftTrackModel[21].setRotationPoint(-50.0F, 10.0F, -30.0F);
    (leftTrackModel[21]).rotateAngleZ = 2.88099F;


    
    rightTrackModel = new ModelRendererTurbo[22];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 500, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 0, 478, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 26, 478, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 53, 482, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 68, 486, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 87, 478, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 102, 484, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 118, 478, textureX, textureY);
    rightTrackModel[8] = new ModelRendererTurbo(this, 137, 482, textureX, textureY);
    rightTrackModel[9] = new ModelRendererTurbo(this, 158, 475, textureX, textureY);
    rightTrackModel[10] = new ModelRendererTurbo(this, 173, 482, textureX, textureY);
    rightTrackModel[11] = new ModelRendererTurbo(this, 180, 500, textureX, textureY);
    rightTrackModel[12] = new ModelRendererTurbo(this, 188, 478, textureX, textureY);
    rightTrackModel[13] = new ModelRendererTurbo(this, 213, 483, textureX, textureY);
    rightTrackModel[14] = new ModelRendererTurbo(this, 237, 478, textureX, textureY);
    rightTrackModel[15] = new ModelRendererTurbo(this, 260, 481, textureX, textureY);
    rightTrackModel[16] = new ModelRendererTurbo(this, 275, 478, textureX, textureY);
    rightTrackModel[17] = new ModelRendererTurbo(this, 296, 480, textureX, textureY);
    rightTrackModel[18] = new ModelRendererTurbo(this, 311, 474, textureX, textureY);
    rightTrackModel[19] = new ModelRendererTurbo(this, 326, 481, textureX, textureY);
    rightTrackModel[20] = new ModelRendererTurbo(this, 360, 493, textureX, textureY);
    rightTrackModel[21] = new ModelRendererTurbo(this, 348, 478, textureX, textureY);
    
    rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 78, 1, 11, 0.0F);
    rightTrackModel[0].setRotationPoint(-50.0F, 9.0F, 19.0F);
    
    rightTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 8, 11, 0.0F);
    rightTrackModel[1].setRotationPoint(28.0F, 10.0F, 19.0F);
    (rightTrackModel[1]).rotateAngleZ = 2.064738F;
    
    rightTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 7, 1, 11, 0.0F);
    rightTrackModel[2].setRotationPoint(41.0F, 3.0F, 19.0F);
    (rightTrackModel[2]).rotateAngleZ = -2.647651F;
    
    rightTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 1, 3, 11, 0.0F);
    rightTrackModel[3].setRotationPoint(41.0F, 3.0F, 19.0F);
    (rightTrackModel[3]).rotateAngleZ = 2.356194F;
    
    rightTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 3, 1, 11, 0.0F);
    rightTrackModel[4].setRotationPoint(45.0F, -1.0F, 19.0F);
    (rightTrackModel[4]).rotateAngleZ = -2.356194F;
    
    rightTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 4, 11, 0.0F);
    rightTrackModel[5].setRotationPoint(44.0F, -5.0F, 19.0F);
    
    rightTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 1, 3, 11, 0.0F);
    rightTrackModel[6].setRotationPoint(45.0F, -5.0F, 19.0F);
    (rightTrackModel[6]).rotateAngleZ = -2.356194F;
    
    rightTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 3, 1, 11, 0.0F);
    rightTrackModel[7].setRotationPoint(41.0F, -9.0F, 19.0F);
    (rightTrackModel[7]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 4, 1, 11, 0.0F);
    rightTrackModel[8].setRotationPoint(37.0F, -9.0F, 19.0F);
    
    rightTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 1, 5, 11, 0.0F);
    rightTrackModel[9].setRotationPoint(37.0F, -9.0F, 19.0F);
    (rightTrackModel[9]).rotateAngleZ = -1.460139F;
    
    rightTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 5, 11, 0.0F);
    rightTrackModel[10].setRotationPoint(28.0F, -7.0F, 19.0F);
    (rightTrackModel[10]).rotateAngleZ = 1.681454F;
    
    rightTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 78, 1, 11, 0.0F);
    rightTrackModel[11].setRotationPoint(-50.0F, -8.0F, 19.0F);
    
    rightTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 6, 1, 11, 0.0F);
    rightTrackModel[12].setRotationPoint(-50.0F, -7.0F, 19.0F);
    (rightTrackModel[12]).rotateAngleZ = 3.041924F;
    
    rightTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 5, 1, 11, 0.0F);
    rightTrackModel[13].setRotationPoint(-60.0F, -9.0F, 19.0F);
    (rightTrackModel[13]).rotateAngleZ = -0.09966865F;
    
    rightTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 5, 1, 11, 0.0F);
    rightTrackModel[14].setRotationPoint(-65.0F, -9.0F, 19.0F);
    
    rightTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 1, 4, 11, 0.0F);
    rightTrackModel[15].setRotationPoint(-65.0F, -9.0F, 19.0F);
    (rightTrackModel[15]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[16].addBox(0.0F, 0.0F, 0.0F, 4, 1, 11, 0.0F);
    rightTrackModel[16].setRotationPoint(-70.0F, -4.0F, 19.0F);
    (rightTrackModel[16]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[17].addBox(0.0F, 0.0F, 0.0F, 1, 5, 11, 0.0F);
    rightTrackModel[17].setRotationPoint(-70.0F, -4.0F, 19.0F);
    
    rightTrackModel[18].addBox(0.0F, 0.0F, 0.0F, 1, 4, 11, 0.0F);
    rightTrackModel[18].setRotationPoint(-70.0F, 1.0F, 19.0F);
    (rightTrackModel[18]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[19].addBox(0.0F, 0.0F, 0.0F, 4, 1, 11, 0.0F);
    rightTrackModel[19].setRotationPoint(-65.0F, 6.0F, 19.0F);
    (rightTrackModel[19]).rotateAngleZ = 2.356194F;
    
    rightTrackModel[20].addBox(0.0F, 0.0F, 0.0F, 1, 8, 11, 0.0F);
    rightTrackModel[20].setRotationPoint(-65.0F, 6.0F, 19.0F);
    (rightTrackModel[20]).rotateAngleZ = 1.310194F;
    
    rightTrackModel[21].addBox(0.0F, 0.0F, 0.0F, 8, 1, 11, 0.0F);
    rightTrackModel[21].setRotationPoint(-50.0F, 10.0F, 19.0F);
    (rightTrackModel[21]).rotateAngleZ = 2.88099F;


    
    leftTrackWheelModels = new ModelRendererTurbo[14];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 390, 497, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 390, 497, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 390, 475, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 390, 475, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 390, 453, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 390, 453, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 390, 431, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 390, 431, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 390, 409, textureX, textureY);
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 390, 409, textureX, textureY);
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 390, 387, textureX, textureY);
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 390, 387, textureX, textureY);
    leftTrackWheelModels[12] = new ModelRendererTurbo(this, 390, 370, textureX, textureY);
    leftTrackWheelModels[13] = new ModelRendererTurbo(this, 390, 370, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 13, 13, 44, 1, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[0].setRotationPoint(-62.5F, -1.5F, -28.5F);
    
    leftTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 13, 13, 44, 1, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    leftTrackWheelModels[1].setRotationPoint(-62.5F, -1.5F, -20.5F);
    
    leftTrackWheelModels[2].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    leftTrackWheelModels[2].setRotationPoint(-47.0F, 1.0F, -26.58F);
    
    leftTrackWheelModels[3].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    leftTrackWheelModels[3].setRotationPoint(-47.0F, 1.0F, -22.5F);
    
    leftTrackWheelModels[4].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    leftTrackWheelModels[4].setRotationPoint(-30.0F, 1.0F, -26.5F);
    
    leftTrackWheelModels[5].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    leftTrackWheelModels[5].setRotationPoint(-30.0F, 1.0F, -22.5F);
    
    leftTrackWheelModels[6].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    leftTrackWheelModels[6].setRotationPoint(-13.0F, 1.0F, -26.5F);
    
    leftTrackWheelModels[7].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    leftTrackWheelModels[7].setRotationPoint(-13.0F, 1.0F, -22.5F);
    
    leftTrackWheelModels[8].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    leftTrackWheelModels[8].setRotationPoint(7.0F, 1.0F, -26.5F);
    
    leftTrackWheelModels[9].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    leftTrackWheelModels[9].setRotationPoint(7.0F, 1.0F, -22.5F);
    
    leftTrackWheelModels[10].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    leftTrackWheelModels[10].setRotationPoint(25.0F, 1.0F, -26.5F);
    
    leftTrackWheelModels[11].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    leftTrackWheelModels[11].setRotationPoint(25.0F, 1.0F, -22.5F);
    
    leftTrackWheelModels[12].addShape3D(5.0F, -5.0F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 10, 10, 36, 1, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[12].setRotationPoint(39.0F, -3.0F, -27.0F);
    
    leftTrackWheelModels[13].addShape3D(5.0F, -5.0F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 10, 10, 36, 1, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[13].setRotationPoint(39.0F, -3.0F, -22.0F);


    
    rightTrackWheelModels = new ModelRendererTurbo[14];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 390, 497, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 390, 497, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 390, 475, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 390, 475, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 390, 453, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 390, 453, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 390, 431, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 390, 431, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 390, 409, textureX, textureY);
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 390, 409, textureX, textureY);
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 390, 387, textureX, textureY);
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 390, 387, textureX, textureY);
    rightTrackWheelModels[12] = new ModelRendererTurbo(this, 390, 370, textureX, textureY);
    rightTrackWheelModels[13] = new ModelRendererTurbo(this, 390, 370, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 13, 13, 44, 1, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[0].setRotationPoint(-62.5F, -1.5F, 28.5F);
    
    rightTrackWheelModels[1].addShape3D(6.5F, -6.5F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 13, 13, 44, 1, 0, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    rightTrackWheelModels[1].setRotationPoint(-62.5F, -1.5F, 20.5F);
    
    rightTrackWheelModels[2].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    rightTrackWheelModels[2].setRotationPoint(-47.0F, 1.0F, 26.5F);
    
    rightTrackWheelModels[3].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    rightTrackWheelModels[3].setRotationPoint(-47.0F, 1.0F, 22.5F);
    
    rightTrackWheelModels[4].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    rightTrackWheelModels[4].setRotationPoint(-30.0F, 1.0F, 26.5F);
    
    rightTrackWheelModels[5].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    rightTrackWheelModels[5].setRotationPoint(-30.0F, 1.0F, 22.5F);
    
    rightTrackWheelModels[6].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    rightTrackWheelModels[6].setRotationPoint(-13.0F, 1.0F, 26.5F);
    
    rightTrackWheelModels[7].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    rightTrackWheelModels[7].setRotationPoint(-13.0F, 1.0F, 22.5F);
    
    rightTrackWheelModels[8].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    rightTrackWheelModels[8].setRotationPoint(7.0F, 1.0F, 26.5F);
    
    rightTrackWheelModels[9].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    rightTrackWheelModels[9].setRotationPoint(7.0F, 1.0F, 22.5F);
    
    rightTrackWheelModels[10].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    rightTrackWheelModels[10].setRotationPoint(25.0F, 1.0F, 26.5F);
    
    rightTrackWheelModels[11].addShape3D(8.0F, -8.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 3.0F, 16, 16, 56, 3, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    rightTrackWheelModels[11].setRotationPoint(25.0F, 1.0F, 22.5F);
    
    rightTrackWheelModels[12].addShape3D(5.0F, -5.0F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 10, 10, 36, 1, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[12].setRotationPoint(39.0F, -3.0F, 27.0F);
    
    rightTrackWheelModels[13].addShape3D(5.0F, -5.0F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 1.0F, 10, 10, 36, 1, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[13].setRotationPoint(39.0F, -3.0F, 22.0F);


    /*ModelRendererTurbo[][] MGFrontModel = new ModelRendererTurbo[3][];

    
    MGFrontModel[0] = new ModelRendererTurbo[0];

    
    MGFrontModel[1] = new ModelRendererTurbo[1];
    MGFrontModel[1][0] = new ModelRendererTurbo(this, 425, 0, textureX, textureY);
    
    MGFrontModel[1][0].addBox(-2.0F, -0.5F, -0.5F, 7, 1, 1, 0.0F);

    
    for (ModelRendererTurbo gunPart : MGFrontModel[1])
    {
      gunPart.setRotationPoint(45.0F, -17.5F, -9.5F);
    }

    
    MGFrontModel[2] = new ModelRendererTurbo[0];
    
    registerGunModel("FrontMG", MGFrontModel);*/

    
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
