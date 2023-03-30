package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;

public class ModelLeopardIIA6
  extends ModelVehicle
{
  int textureX = 512;
  int textureY = 512;

  
  public ModelLeopardIIA6() {
    bodyModel = new ModelRendererTurbo[56];
    bodyModel[0] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 220, 500, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 200, 500, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 220, 500, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 200, 430, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 230, 430, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 265, 430, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 415, 430, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 200, 450, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 230, 450, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 265, 450, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 415, 450, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 0, 410, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 0, 385, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 0, 345, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 0, 430, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 0, 285, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 300, 500, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 290, 500, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 280, 500, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 300, 500, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 290, 500, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 280, 500, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 160, 360, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 270, 360, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 315, 360, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 410, 360, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 410, 380, textureX, textureY);
    bodyModel[40] = new ModelRendererTurbo(this, 150, 285, textureX, textureY);
    bodyModel[41] = new ModelRendererTurbo(this, 150, 310, textureX, textureY);
    bodyModel[42] = new ModelRendererTurbo(this, 175, 285, textureX, textureY);
    bodyModel[43] = new ModelRendererTurbo(this, 175, 295, textureX, textureY);
    bodyModel[44] = new ModelRendererTurbo(this, 175, 305, textureX, textureY);
    bodyModel[45] = new ModelRendererTurbo(this, 175, 315, textureX, textureY);
    bodyModel[46] = new ModelRendererTurbo(this, 140, 490, textureX, textureY);
    bodyModel[47] = new ModelRendererTurbo(this, 165, 490, textureX, textureY);
    bodyModel[48] = new ModelRendererTurbo(this, 0, 130, textureX, textureY);
    bodyModel[49] = new ModelRendererTurbo(this, 10, 130, textureX, textureY);
    bodyModel[50] = new ModelRendererTurbo(this, 20, 130, textureX, textureY);
    bodyModel[51] = new ModelRendererTurbo(this, 30, 130, textureX, textureY);
    bodyModel[52] = new ModelRendererTurbo(this, 0, 120, textureX, textureY);
    bodyModel[53] = new ModelRendererTurbo(this, 20, 120, textureX, textureY);
    bodyModel[54] = new ModelRendererTurbo(this, 435, 330, textureX, textureY);
    bodyModel[55] = new ModelRendererTurbo(this, 435, 405, textureX, textureY);
    
    bodyModel[0].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[0].setRotationPoint(32.5F, 1.5F, -18.0F);
    
    bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[1].setRotationPoint(19.5F, 1.5F, -18.0F);
    
    bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[2].setRotationPoint(6.5F, 1.5F, -18.0F);
    
    bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[3].setRotationPoint(-6.5F, 1.5F, -18.0F);
    
    bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[4].setRotationPoint(-19.5F, 1.5F, -18.0F);
    
    bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[5].setRotationPoint(-32.5F, 1.5F, -18.0F);
    
    bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[6].setRotationPoint(-45.5F, 1.5F, -18.0F);
    
    bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
    bodyModel[7].setRotationPoint(44.0F, -7.0F, -18.0F);
    
    bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[8].setRotationPoint(32.5F, 1.5F, 14.0F);
    
    bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[9].setRotationPoint(19.5F, 1.5F, 14.0F);
    
    bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[10].setRotationPoint(6.5F, 1.5F, 14.0F);
    
    bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[11].setRotationPoint(-6.5F, 1.5F, 14.0F);
    
    bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[12].setRotationPoint(-19.5F, 1.5F, 14.0F);
    
    bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[13].setRotationPoint(-32.5F, 1.5F, 14.0F);
    
    bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
    bodyModel[14].setRotationPoint(-45.5F, 1.5F, 14.0F);
    
    bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 4, 4, 3, 0.0F);
    bodyModel[15].setRotationPoint(44.0F, -7.0F, 15.0F);
    
    bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 2, 3, 10, 0.0F);
    bodyModel[16].setRotationPoint(-65.0F, -11.0F, -27.0F);
    
    bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 14, 3, 1, 0.0F);
    bodyModel[17].setRotationPoint(-65.0F, -11.0F, -28.0F);
    
    bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 72, 6, 1, 0.0F);
    bodyModel[18].setRotationPoint(-51.0F, -11.0F, -28.0F);
    
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 44, 6, 1, 0.0F);
    bodyModel[19].setRotationPoint(-23.0F, -17.0F, -27.0F);
    
    bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 2, 3, 10, 0.0F);
    bodyModel[20].setRotationPoint(-65.0F, -11.0F, 17.0F);
    
    bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 14, 3, 1, 0.0F);
    bodyModel[21].setRotationPoint(-65.0F, -11.0F, 27.0F);
    
    bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 72, 6, 1, 0.0F);
    bodyModel[22].setRotationPoint(-51.0F, -11.0F, 27.0F);
    
    bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 44, 6, 1, 0.0F);
    bodyModel[23].setRotationPoint(-23.0F, -17.0F, 26.0F);
    
    bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 76, 18, 1, 0.0F);
    bodyModel[24].setRotationPoint(-55.0F, -17.0F, -17.0F);
    
    bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 76, 18, 1, 0.0F);
    bodyModel[25].setRotationPoint(-55.0F, -17.0F, 16.0F);
    
    bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 36, 1, 36, 0.0F);
    bodyModel[26].setRotationPoint(-18.0F, -19.0F, -18.0F);
    
    bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 76, 1, 34, 0.0F);
    bodyModel[27].setRotationPoint(-55.0F, 1.0F, -17.0F);
    
    bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 44, 1, 54, 0.0F);
    bodyModel[28].setRotationPoint(-23.0F, -18.0F, -27.0F);
    
    bodyModel[29].addBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
    bodyModel[29].setRotationPoint(43.5F, -17.0F, -25.0F);
    
    bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[30].setRotationPoint(44.0F, -16.0F, -27.0F);
    
    bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
    bodyModel[31].setRotationPoint(44.0F, -15.0F, -27.0F);
    
    bodyModel[32].addBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F);
    bodyModel[32].setRotationPoint(43.5F, -17.0F, 18.0F);
    
    bodyModel[33].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[33].setRotationPoint(44.0F, -16.0F, 25.0F);
    
    bodyModel[34].addBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F);
    bodyModel[34].setRotationPoint(44.0F, -15.0F, 26.0F);
    
    bodyModel[35].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(42.0D, 0.0D, 42, 0), new Coord2D(43.0D, 9.0D, 43, 9), new Coord2D(0.0D, 7.0D, 0, 7) }), 54.0F, 43, 9, 103, 54, 0, new float[] { 7.0F, 44.0F, 10.0F, 42.0F });
    bodyModel[35].setRotationPoint(-23.0F, -11.0F, 27.0F);
    
    bodyModel[36].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(10.0D, 13.0D, 10, 13), new Coord2D(0.0D, 13.0D, 0, 13) }), 34.0F, 10, 13, 43, 34, 0, new float[] { 13.0F, 10.0F, 12.0F, 8.0F });
    bodyModel[36].setRotationPoint(-55.0F, 2.0F, 17.0F);
    
    bodyModel[37].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(13.0D, 0.0D, 13, 0), new Coord2D(31.0D, 10.0D, 31, 10), new Coord2D(23.0D, 15.0D, 23, 15), new Coord2D(0.0D, 20.0D, 0, 20) }), 34.0F, 31, 20, 88, 34, 0, new float[] { 20.0F, 24.0F, 10.0F, 21.0F, 13.0F });
    bodyModel[37].setRotationPoint(21.0F, 2.0F, -17.0F);
    (bodyModel[37]).rotateAngleY = 3.1415927F;
    
    bodyModel[38].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(30.0D, 0.0D, 30, 0), new Coord2D(23.0D, 2.0D, 23, 2), new Coord2D(0.0D, 7.0D, 0, 7) }), 10.0F, 30, 7, 69, 10, 0, new float[] { 7.0F, 24.0F, 8.0F, 30.0F });
    bodyModel[38].setRotationPoint(21.0F, -11.0F, -27.0F);
    (bodyModel[38]).rotateAngleY = 3.1415927F;
    
    bodyModel[39].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(30.0D, 0.0D, 30, 0), new Coord2D(23.0D, 2.0D, 23, 2), new Coord2D(0.0D, 7.0D, 0, 7) }), 10.0F, 30, 7, 69, 10, 0, new float[] { 7.0F, 24.0F, 8.0F, 30.0F });
    bodyModel[39].setRotationPoint(21.0F, -11.0F, 17.0F);
    (bodyModel[39]).rotateAngleY = 3.1415927F;
    
    bodyModel[40].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(1.0D, 6.0D, 1, 6) }), 10.0F, 6, 6, 18, 10, 0, new float[] { 1.0F, 8.0F, 1.0F, 8.0F });
    bodyModel[40].setRotationPoint(50.0F, -5.0F, -27.0F);
    (bodyModel[40]).rotateAngleY = 3.1415927F;
    
    bodyModel[41].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(1.0D, 6.0D, 1, 6) }), 10.0F, 6, 6, 18, 10, 0, new float[] { 1.0F, 8.0F, 1.0F, 8.0F });
    bodyModel[41].setRotationPoint(50.0F, -5.0F, 17.0F);
    (bodyModel[41]).rotateAngleY = 3.1415927F;
    
    bodyModel[42].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(35.0D, 0.0D, 35, 0), new Coord2D(30.0D, 6.0D, 30, 6), new Coord2D(0.0D, 6.0D, 0, 6) }), 1.0F, 35, 6, 79, 1, 0, new float[] { 6.0F, 30.0F, 8.0F, 35.0F });
    (bodyModel[42]).rotateAngleY = 3.1415927F;
    bodyModel[42].setRotationPoint(21.0F, -5.0F, 16.0F);
    
    bodyModel[43].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(35.0D, 0.0D, 35, 0), new Coord2D(30.0D, 6.0D, 30, 6), new Coord2D(0.0D, 6.0D, 0, 6) }), 1.0F, 35, 6, 79, 1, 0, new float[] { 6.0F, 30.0F, 8.0F, 35.0F });
    (bodyModel[43]).rotateAngleY = 3.1415927F;
    bodyModel[43].setRotationPoint(21.0F, -5.0F, -28.0F);
    
    bodyModel[44].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(35.0D, 0.0D, 35, 0), new Coord2D(30.0D, 6.0D, 30, 6), new Coord2D(0.0D, 6.0D, 0, 6) }), 1.0F, 35, 6, 79, 1, 0, new float[] { 6.0F, 30.0F, 8.0F, 35.0F });
    (bodyModel[44]).rotateAngleY = 3.1415927F;
    bodyModel[44].setRotationPoint(21.0F, -5.0F, -17.0F);
    
    bodyModel[45].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(35.0D, 0.0D, 35, 0), new Coord2D(30.0D, 6.0D, 30, 6), new Coord2D(0.0D, 6.0D, 0, 6) }), 1.0F, 35, 6, 79, 1, 0, new float[] { 6.0F, 30.0F, 8.0F, 35.0F });
    (bodyModel[45]).rotateAngleY = 3.1415927F;
    bodyModel[45].setRotationPoint(21.0F, -5.0F, 27.0F);
    
    bodyModel[46].addBox(0.0F, 0.0F, 0.0F, 1, 10, 9, 0.0F);
    bodyModel[46].setRotationPoint(-64.0F, -9.0F, 18.0F);
    
    bodyModel[47].addBox(0.0F, 0.0F, 0.0F, 1, 10, 9, 0.0F);
    bodyModel[47].setRotationPoint(-64.0F, -9.0F, -27.0F);
    
    bodyModel[48].addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
    bodyModel[48].setRotationPoint(-65.0F, -4.0F, -13.0F);
    
    bodyModel[49].addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
    bodyModel[49].setRotationPoint(-65.0F, -4.0F, 12.0F);
    
    bodyModel[50].addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
    bodyModel[50].setRotationPoint(48.0F, -12.0F, 8.0F);
    
    bodyModel[51].addBox(0.0F, 0.0F, 0.0F, 3, 3, 1, 0.0F);
    bodyModel[51].setRotationPoint(48.0F, -12.0F, -9.0F);
    
    bodyModel[52].addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
    bodyModel[52].setRotationPoint(46.0F, -12.0F, -15.0F);
    
    bodyModel[53].addBox(0.0F, 0.0F, 0.0F, 4, 3, 3, 0.0F);
    bodyModel[53].setRotationPoint(46.0F, -12.0F, 12.0F);
    
    bodyModel[54].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 2.0F, 16, 16, 56, 2, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    bodyModel[54].setRotationPoint(-47.0F, -20.0F, 17.0F);
    (bodyModel[54]).rotateAngleX = 1.5707963F;
    (bodyModel[54]).rotateAngleZ = -0.03490658F;
    
    bodyModel[55].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(11.0D, 0.0D, 11, 0), new Coord2D(16.0D, 5.0D, 16, 5), new Coord2D(16.0D, 11.0D, 16, 11), new Coord2D(11.0D, 16.0D, 11, 16), new Coord2D(5.0D, 16.0D, 5, 16), new Coord2D(0.0D, 11.0D, 0, 11), new Coord2D(0.0D, 5.0D, 0, 5) }), 2.0F, 16, 16, 56, 2, 0, new float[] { 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F, 8.0F, 6.0F });
    bodyModel[55].setRotationPoint(-47.0F, -20.0F, -1.0F);
    (bodyModel[55]).rotateAngleX = 1.5707963F;
    (bodyModel[55]).rotateAngleZ = -0.03490658F;

    
    turretModel = new ModelRendererTurbo[37];
    turretModel[0] = new ModelRendererTurbo(this, 200, 145, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 400, 155, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 50, 100, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 0, 140, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 0, 35, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 75, 35, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 210, 330, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 335, 330, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 260, 300, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 330, 490, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 370, 490, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 410, 490, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 390, 490, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 330, 500, textureX, textureY);
    turretModel[14] = new ModelRendererTurbo(this, 410, 500, textureX, textureY);
    turretModel[15] = new ModelRendererTurbo(this, 200, 100, textureX, textureY);
    turretModel[16] = new ModelRendererTurbo(this, 200, 100, textureX, textureY);
    turretModel[17] = new ModelRendererTurbo(this, 290, 220, textureX, textureY);
    turretModel[18] = new ModelRendererTurbo(this, 290, 240, textureX, textureY);
    turretModel[19] = new ModelRendererTurbo(this, 0, 100, textureX, textureY);
    turretModel[20] = new ModelRendererTurbo(this, 30, 100, textureX, textureY);
    turretModel[21] = new ModelRendererTurbo(this, 75, 100, textureX, textureY);
    turretModel[22] = new ModelRendererTurbo(this, 40, 130, textureX, textureY);
    turretModel[23] = new ModelRendererTurbo(this, 50, 130, textureX, textureY);
    turretModel[24] = new ModelRendererTurbo(this, 60, 130, textureX, textureY);
    turretModel[25] = new ModelRendererTurbo(this, 0, 85, textureX, textureY);
    turretModel[26] = new ModelRendererTurbo(this, 35, 85, textureX, textureY);
    turretModel[27] = new ModelRendererTurbo(this, 35, 85, textureX, textureY);
    turretModel[28] = new ModelRendererTurbo(this, 35, 85, textureX, textureY);
    turretModel[29] = new ModelRendererTurbo(this, 35, 85, textureX, textureY);
    turretModel[30] = new ModelRendererTurbo(this, 0, 93, textureX, textureY);
    turretModel[31] = new ModelRendererTurbo(this, 35, 85, textureX, textureY);
    turretModel[32] = new ModelRendererTurbo(this, 35, 85, textureX, textureY);
    turretModel[33] = new ModelRendererTurbo(this, 35, 85, textureX, textureY);
    turretModel[34] = new ModelRendererTurbo(this, 35, 85, textureX, textureY);
    turretModel[35] = new ModelRendererTurbo(this, 50, 85, textureX, textureY);
    turretModel[36] = new ModelRendererTurbo(this, 75, 85, textureX, textureY);
    
    turretModel[0].addBox(-16.0F, -31.0F, -24.0F, 32, 12, 48, 0.0F);
    
    turretModel[1].addBox(16.0F, -35.0F, -19.0F, 3, 16, 38, 0.0F);
    (turretModel[1]).rotateAngleZ = 1.396263F;
    
    turretModel[2].addBox(-14.0F, -34.0F, -2.5F, 5, 3, 5, 0.0F);
    
    turretModel[3].addBox(-7.0F, -32.0F, -7.0F, 14, 1, 14, 0.0F);
    
    turretModel[4].addShapeBox(16.0F, -31.0F, -24.0F, 15, 12, 20, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.9999F, 0.0F, 9.0F, -5.9999F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.9999F, 0.0F, 9.0F, -5.9999F, 0.0F, -8.0F, 0.0F, 0.0F);
    
    turretModel[5].addShapeBox(16.0F, -31.0F, 4.0F, 15, 12, 20, 0.0F, -8.0F, 0.0F, 0.0F, 9.0F, -5.9999F, 0.0F, 0.0F, -5.9999F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 9.0F, -5.9999F, 0.0F, 0.0F, -5.9999F, 0.0F, 0.0F, 0.0F, 0.0F);
    
    turretModel[6].addShape3D(24.0F, 16.0F, 22.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(48.0D, 0.0D, 48, 0), new Coord2D(43.0D, 16.0D, 43, 16), new Coord2D(5.0D, 16.0D, 5, 16) }), 9.0F, 48, 16, 120, 9, 0, new float[] { 17.0F, 38.0F, 17.0F, 48.0F });
    (turretModel[6]).rotateAngleY = 1.5707963F;
    (turretModel[6]).rotateAngleX = -1.5707963F;
    
    turretModel[7].addShape3D(19.0F, 32.0F, 22.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(38.0D, 0.0D, 38, 0), new Coord2D(30.0D, 16.0D, 30, 16), new Coord2D(8.0D, 16.0D, 8, 16) }), 9.0F, 38, 16, 96, 9, 0, new float[] { 18.0F, 22.0F, 18.0F, 38.0F });
    (turretModel[7]).rotateAngleY = 1.5707963F;
    (turretModel[7]).rotateAngleX = -1.5707963F;
    
    turretModel[8].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(48.0D, 0.0D, 48, 0), new Coord2D(28.0D, 8.0D, 28, 8), new Coord2D(20.0D, 8.0D, 20, 8) }), 12.0F, 48, 8, 100, 12, 0, new float[] { 22.0F, 8.0F, 22.0F, 48.0F });
    turretModel[8].setRotationPoint(16.0F, -31.0F, 24.0F);
    (turretModel[8]).rotateAngleY = 1.5707963F;
    (turretModel[8]).rotateAngleX = 1.5707963F;
    
    turretModel[9].addBox(0.0F, 0.0F, 0.0F, 16, 7, 1, 0.0F);
    turretModel[9].setRotationPoint(-48.0F, -29.0F, 18.0F);
    
    turretModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
    turretModel[10].setRotationPoint(-48.0F, -29.0F, 11.0F);
    
    turretModel[11].addBox(0.0F, 0.0F, 0.0F, 15, 0, 7, 0.0F);
    turretModel[11].setRotationPoint(-47.0F, -22.0F, 11.0F);
    
    turretModel[12].addBox(0.0F, 0.0F, 0.0F, 1, 7, 7, 0.0F);
    turretModel[12].setRotationPoint(-48.0F, -29.0F, -18.0F);
    
    turretModel[13].addBox(0.0F, 0.0F, 0.0F, 16, 7, 1, 0.0F);
    turretModel[13].setRotationPoint(-48.0F, -29.0F, -19.0F);
    
    turretModel[14].addBox(0.0F, 0.0F, 0.0F, 15, 0, 7, 0.0F);
    turretModel[14].setRotationPoint(-47.0F, -22.0F, -18.0F);
    
    turretModel[15].addTrapezoid(0.0F, 0.0F, 0.0F, 1, 31, 1, 0.0F, -0.5F, 4);
    turretModel[15].setRotationPoint(-30.0F, -62.0F, 15.0F);
    
    turretModel[16].addTrapezoid(0.0F, 0.0F, 0.0F, 1, 31, 1, 0.0F, -0.5F, 4);
    turretModel[16].setRotationPoint(-30.0F, -62.0F, -16.0F);
    
    turretModel[17].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(24.0D, 0.0D, 24, 0), new Coord2D(24.0D, 12.0D, 24, 12), new Coord2D(14.0D, 12.0D, 14, 12), new Coord2D(0.0D, 6.0D, 0, 6) }), 2.0F, 24, 12, 64, 2, 0, new float[] { 16.0F, 16.0F, 10.0F, 12.0F, 10.0F });
    turretModel[17].setRotationPoint(40.0F, -19.0F, -2.0F);
    
    turretModel[18].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(24.0D, 0.0D, 24, 0), new Coord2D(24.0D, 12.0D, 24, 12), new Coord2D(14.0D, 12.0D, 14, 12), new Coord2D(0.0D, 6.0D, 0, 6) }), 2.0F, 24, 12, 64, 2, 0, new float[] { 16.0F, 16.0F, 10.0F, 12.0F, 10.0F });
    turretModel[18].setRotationPoint(40.0F, -19.0F, 4.0F);
    
    turretModel[19].addBox(0.0F, 0.0F, 0.0F, 5, 3, 8, 0.0F);
    turretModel[19].setRotationPoint(16.0F, -33.0F, -16.0F);
    
    turretModel[20].addBox(0.0F, 0.0F, 0.0F, 4, 3, 4, 0.0F);
    turretModel[20].setRotationPoint(-14.0F, -37.0F, -2.0F);
    
    turretModel[21].addBox(0.0F, 0.0F, 0.0F, 7, 2, 4, 0.0F);
    turretModel[21].setRotationPoint(14.0F, -33.0F, -2.0F);
    
    turretModel[22].addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
    turretModel[22].setRotationPoint(16.0F, -33.5F, -4.0F);
    
    turretModel[23].addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
    turretModel[23].setRotationPoint(16.0F, -33.5F, 3.0F);
    
    turretModel[24].addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
    turretModel[24].setRotationPoint(-20.0F, -33.0F, -0.5F);
    
    turretModel[25].addBox(0.0F, 0.0F, 0.0F, 11, 1, 3, 0.0F);
    turretModel[25].setRotationPoint(-32.0F, -24.0F, -21.0F);
    (turretModel[25]).rotateAngleY = -0.3141593F;
    
    turretModel[26].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
    turretModel[26].setRotationPoint(-31.0F, -24.0F, -21.0F);
    (turretModel[26]).rotateAngleY = -0.3141593F;
    (turretModel[26]).rotateAngleZ = 2.443461F;
    
    turretModel[27].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
    turretModel[27].setRotationPoint(-28.0F, -24.0F, -22.0F);
    (turretModel[27]).rotateAngleY = -0.3141593F;
    (turretModel[27]).rotateAngleZ = 2.443461F;
    
    turretModel[28].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
    turretModel[28].setRotationPoint(-25.0F, -24.0F, -23.0F);
    (turretModel[28]).rotateAngleY = -0.3141593F;
    (turretModel[28]).rotateAngleZ = 2.443461F;
    
    turretModel[29].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
    turretModel[29].setRotationPoint(-22.0F, -24.0F, -24.0F);
    (turretModel[29]).rotateAngleY = -0.3141593F;
    (turretModel[29]).rotateAngleZ = 2.443461F;
    
    turretModel[30].addBox(0.0F, 0.0F, 0.0F, 11, 1, 3, 0.0F);
    turretModel[30].setRotationPoint(-32.0F, -24.0F, 18.0F);
    (turretModel[30]).rotateAngleY = 0.3141593F;
    
    turretModel[31].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
    turretModel[31].setRotationPoint(-32.0F, -24.0F, 20.0F);
    (turretModel[31]).rotateAngleY = 0.3141593F;
    (turretModel[31]).rotateAngleZ = 2.443461F;
    
    turretModel[32].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
    turretModel[32].setRotationPoint(-29.0F, -24.0F, 21.0F);
    (turretModel[32]).rotateAngleY = 0.3141593F;
    (turretModel[32]).rotateAngleZ = 2.443461F;
    
    turretModel[33].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
    turretModel[33].setRotationPoint(-26.0F, -24.0F, 22.0F);
    (turretModel[33]).rotateAngleY = 0.3141593F;
    (turretModel[33]).rotateAngleZ = 2.443461F;
    
    turretModel[34].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
    turretModel[34].setRotationPoint(-23.0F, -24.0F, 23.0F);
    (turretModel[34]).rotateAngleY = 0.3141593F;
    (turretModel[34]).rotateAngleZ = 2.443461F;
    
    turretModel[35].addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
    turretModel[35].setRotationPoint(16.0F, -31.5F, -4.0F);
    
    turretModel[36].addBox(0.0F, 0.0F, 0.0F, 8, 1, 2, 0.0F);
    turretModel[36].setRotationPoint(16.0F, -31.5F, 2.0F);

    
    barrelModel = new ModelRendererTurbo[3];
    barrelModel[0] = new ModelRendererTurbo(this, 0, 190, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 170, 190, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 260, 275, textureX, textureY);
    
    barrelModel[0].addBox(8.0F, 4.5F, -1.5F, 80, 3, 3, 0.0F);
    barrelModel[0].setRotationPoint(16.0F, -31.0F, 0.0F);
    
    barrelModel[1].addBox(28.0F, 3.5F, -2.0F, 9, 4, 4, 0.0F);
    barrelModel[1].setRotationPoint(16.0F, -31.0F, 0.0F);
    
    barrelModel[2].addShape3D(24.0F, -12.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(14.0D, 0.0D, 14, 0), new Coord2D(24.0D, 0.0D, 24, 0), new Coord2D(24.0D, 12.0D, 24, 12), new Coord2D(14.0D, 12.0D, 14, 12), new Coord2D(0.0D, 6.0D, 0, 6) }), 4.0F, 24, 12, 64, 4, 0, new float[] { 16.0F, 16.0F, 10.0F, 12.0F, 10.0F });
    barrelModel[2].setRotationPoint(16.0F, -31.0F, 0.0F);

    
    leftTrackModel = new ModelRendererTurbo[7];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 25, 470, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 50, 470, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 110, 470, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 300, 470, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 365, 470, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 390, 470, textureX, textureY);
    
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
    leftTrackModel[0].setRotationPoint(51.0F, -7.0F, -27.0F);
    (leftTrackModel[0]).rotateAngleZ = -2.356194F;
    
    leftTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
    leftTrackModel[1].setRotationPoint(50.0F, -7.0F, -27.0F);
    
    leftTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 19, 1, 10, 0.0F);
    leftTrackModel[2].setRotationPoint(51.0F, -3.0F, -27.0F);
    (leftTrackModel[2]).rotateAngleZ = -2.408554F;
    
    leftTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 83, 1, 10, 0.0F);
    leftTrackModel[3].setRotationPoint(-46.0F, 9.0F, -27.0F);
    
    leftTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 20, 1, 10, 0.0F);
    leftTrackModel[4].setRotationPoint(-46.0F, 10.0F, -27.0F);
    (leftTrackModel[4]).rotateAngleZ = 2.4958208F;
    
    leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 6, 10, 0.0F);
    leftTrackModel[5].setRotationPoint(-62.0F, -8.0F, -27.0F);
    
    leftTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 1, 10, 0.0F);
    leftTrackModel[6].setRotationPoint(-62.0F, -8.0F, -27.0F);
    (leftTrackModel[6]).rotateAngleZ = 0.7853982F;

    
    rightTrackModel = new ModelRendererTurbo[7];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 470, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 25, 470, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 50, 470, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 110, 470, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 300, 470, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 365, 470, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 390, 470, textureX, textureY);
    
    rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
    rightTrackModel[0].setRotationPoint(51.0F, -7.0F, 17.0F);
    (rightTrackModel[0]).rotateAngleZ = -2.356194F;
    
    rightTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 4, 10, 0.0F);
    rightTrackModel[1].setRotationPoint(50.0F, -7.0F, 17.0F);
    
    rightTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 19, 1, 10, 0.0F);
    rightTrackModel[2].setRotationPoint(51.0F, -3.0F, 17.0F);
    (rightTrackModel[2]).rotateAngleZ = -2.408554F;
    
    rightTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 83, 1, 10, 0.0F);
    rightTrackModel[3].setRotationPoint(-46.0F, 9.0F, 17.0F);
    
    rightTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 20, 1, 10, 0.0F);
    rightTrackModel[4].setRotationPoint(-46.0F, 10.0F, 17.0F);
    (rightTrackModel[4]).rotateAngleZ = 2.4958208F;
    
    rightTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 6, 10, 0.0F);
    rightTrackModel[5].setRotationPoint(-62.0F, -8.0F, 17.0F);
    
    rightTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 4, 1, 10, 0.0F);
    rightTrackModel[6].setRotationPoint(-62.0F, -8.0F, 17.0F);
    (rightTrackModel[6]).rotateAngleZ = 0.7853982F;

    
    leftTrackWheelModels = new ModelRendererTurbo[9];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 50, 493, textureX, textureY);
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 100, 493, textureX, textureY);
    
    leftTrackWheelModels[0].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 8.0F, 8, 8, 28, 8, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[0].setRotationPoint(46.0F, -5.0F, -22.0F);
    
    leftTrackWheelModels[1].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[1].setRotationPoint(34.5F, 3.5F, -22.0F);
    
    leftTrackWheelModels[2].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[2].setRotationPoint(21.5F, 3.5F, -22.0F);
    
    leftTrackWheelModels[3].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[3].setRotationPoint(8.5F, 3.5F, -22.0F);
    
    leftTrackWheelModels[4].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[4].setRotationPoint(-4.5F, 3.5F, -22.0F);
    
    leftTrackWheelModels[5].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[5].setRotationPoint(-17.5F, 3.5F, -22.0F);
    
    leftTrackWheelModels[6].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[6].setRotationPoint(-30.5F, 3.5F, -22.0F);
    
    leftTrackWheelModels[7].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    leftTrackWheelModels[7].setRotationPoint(-43.5F, 3.5F, -22.0F);
    
    leftTrackWheelModels[8].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(10.0D, 2.0D, 10, 2), new Coord2D(10.0D, 8.0D, 10, 8), new Coord2D(8.0D, 10.0D, 8, 10), new Coord2D(2.0D, 10.0D, 2, 10), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 2.0D, 0, 2) }), 8.0F, 10, 10, 36, 8, 0, new float[] { 3.0F, 6.0F, 3.0F, 6.0F, 3.0F, 6.0F, 3.0F, 6.0F });
    leftTrackWheelModels[8].setRotationPoint(-56.0F, -5.0F, -22.0F);

    
    rightTrackWheelModels = new ModelRendererTurbo[9];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 50, 493, textureX, textureY);
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 0, 493, textureX, textureY);
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 100, 493, textureX, textureY);
    
    rightTrackWheelModels[0].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 8.0F, 8, 8, 28, 8, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[0].setRotationPoint(46.0F, -5.0F, 22.0F);
    
    rightTrackWheelModels[1].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[1].setRotationPoint(34.5F, 3.5F, 22.0F);
    
    rightTrackWheelModels[2].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[2].setRotationPoint(21.5F, 3.5F, 22.0F);
    
    rightTrackWheelModels[3].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[3].setRotationPoint(8.5F, 3.5F, 22.0F);
    
    rightTrackWheelModels[4].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[4].setRotationPoint(-4.5F, 3.5F, 22.0F);
    
    rightTrackWheelModels[5].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[5].setRotationPoint(-17.5F, 3.5F, 22.0F);
    
    rightTrackWheelModels[6].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[6].setRotationPoint(-30.5F, 3.5F, 22.0F);
    
    rightTrackWheelModels[7].addShape3D(5.5F, -5.5F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 8.0F, 11, 11, 40, 8, 0, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    rightTrackWheelModels[7].setRotationPoint(-43.5F, 3.5F, 22.0F);
    
    rightTrackWheelModels[8].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(10.0D, 2.0D, 10, 2), new Coord2D(10.0D, 8.0D, 10, 8), new Coord2D(8.0D, 10.0D, 8, 10), new Coord2D(2.0D, 10.0D, 2, 10), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 2.0D, 0, 2) }), 8.0F, 10, 10, 36, 8, 0, new float[] { 3.0F, 6.0F, 3.0F, 6.0F, 3.0F, 6.0F, 3.0F, 6.0F });
    rightTrackWheelModels[8].setRotationPoint(-56.0F, -5.0F, 22.0F);

    
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
		for(int i = 0; i < steeringWheelModel.length; i++)
		{
			steeringWheelModel[i].render(f5);
		}
	}
}
