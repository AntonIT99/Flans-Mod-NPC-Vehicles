package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class Model38t
  extends ModelVehicle {
  int textureX = 500;
  int textureY = 500;

  
  public Model38t() {
    bodyModel = new ModelRendererTurbo[108];
    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, 500, 500);
    bodyModel[0].addShapeBox(-39.0F, 0.0F, -13.0F, 64, 12, 26, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[0].setRotationPoint(0.0F, -9.0F, 0.0F);
    
    bodyModel[1] = new ModelRendererTurbo(this, 300, 0, 500, 500);
    bodyModel[1].addShapeBox(0.0F, 0.0F, -13.0F, 13, 8, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(25.0F, -7.0F, 0.0F);
    
    bodyModel[2] = new ModelRendererTurbo(this, 0, 41, 500, 500);
    bodyModel[2].addShapeBox(0.0F, 0.0F, -13.0F, 12, 2, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(25.0F, 1.0F, 0.0F);
    
    bodyModel[3] = new ModelRendererTurbo(this, 300, 58, 500, 500);
    bodyModel[3].addShapeBox(0.0F, 0.0F, -13.0F, 13, 2, 26, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[3].setRotationPoint(25.0F, -9.0F, 0.0F);
    
    bodyModel[4] = new ModelRendererTurbo(this, 140, 58, 500, 500);
    bodyModel[4].addShapeBox(0.0F, 0.0F, -13.0F, 34, 8, 26, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[4].setRotationPoint(-9.0F, -17.0F, 0.0F);
    
    bodyModel[5] = new ModelRendererTurbo(this, 0, 77, 500, 500);
    bodyModel[5].addBox(0.0F, -4.0F, 0.0F, 1, 3, 5, 0.0F);
    bodyModel[5].setRotationPoint(25.0F, -9.0F, 7.0F);
    (bodyModel[5]).rotateAngleZ = 0.2443461F;
    
    bodyModel[6] = new ModelRendererTurbo(this, 0, 90, 500, 500);
    bodyModel[6].addBox(0.0F, -5.5F, 0.0F, 1, 3, 5, 0.0F);
    bodyModel[6].setRotationPoint(25.0F, -9.0F, -10.0F);
    (bodyModel[6]).rotateAngleZ = 0.2443461F;
    
    bodyModel[7] = new ModelRendererTurbo(this, 20, 77, 500, 500);
    bodyModel[7].addShapeBox(0.0F, -2.0F, 0.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[7].setRotationPoint(25.0F, -9.0F, 0.0F);
    (bodyModel[7]).rotateAngleZ = 0.2443461F;
    
    bodyModel[8] = new ModelRendererTurbo(this, 40, 77, 500, 500);
    bodyModel[8].addBox(0.0F, 0.0F, -3.0F, 8, 4, 3, 0.0F);
    bodyModel[8].setRotationPoint(30.0F, -5.0F, -12.0F);
    
    bodyModel[9] = new ModelRendererTurbo(this, 75, 77, 500, 500);
    bodyModel[9].addShapeBox(0.0F, 0.0F, -3.0F, 8, 2, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[9].setRotationPoint(30.0F, -7.0F, -12.0F);
    
    bodyModel[10] = new ModelRendererTurbo(this, 20, 90, 500, 500);
    bodyModel[10].addShapeBox(0.0F, 0.0F, -3.0F, 8, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[10].setRotationPoint(30.0F, -1.0F, -12.0F);
    
    bodyModel[11] = new ModelRendererTurbo(this, 180, 105, 500, 500);
    bodyModel[11].addBox(0.0F, 0.0F, -14.0F, 3, 5, 28, 0.0F);
    bodyModel[11].setRotationPoint(-36.0F, -5.0F, 0.0F);
    
    bodyModel[12] = new ModelRendererTurbo(this, 250, 105, 500, 500);
    bodyModel[12].addBox(0.0F, 0.0F, -17.0F, 2, 2, 34, 0.0F);
    bodyModel[12].setRotationPoint(-35.0F, -1.0F, 0.0F);
    
    bodyModel[13] = new ModelRendererTurbo(this, 0, 150, 500, 500);
    bodyModel[13].addBox(0.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
    bodyModel[13].setRotationPoint(14.0F, -3.0F, 13.0F);
    
    bodyModel[14] = new ModelRendererTurbo(this, 0, 150, 500, 500);
    bodyModel[14].addBox(0.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
    bodyModel[14].setRotationPoint(-17.0F, -3.0F, 13.0F);
    
    bodyModel[15] = new ModelRendererTurbo(this, 30, 150, 500, 500);
    bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 17, 4, 1, 0.0F);
    bodyModel[15].setRotationPoint(7.0F, 0.0F, 13.5F);
    
    bodyModel[16] = new ModelRendererTurbo(this, 30, 150, 500, 500);
    bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 17, 4, 1, 0.0F);
    bodyModel[16].setRotationPoint(-24.0F, 0.0F, 13.5F);
    
    bodyModel[17] = new ModelRendererTurbo(this, 70, 150, 500, 500);
    bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[17].setRotationPoint(22.0F, 2.0F, 14.0F);
    
    bodyModel[18] = new ModelRendererTurbo(this, 70, 150, 500, 500);
    bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[18].setRotationPoint(7.0F, 2.0F, 14.0F);
    
    bodyModel[19] = new ModelRendererTurbo(this, 70, 150, 500, 500);
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[19].setRotationPoint(-9.0F, 2.0F, 14.0F);
    
    bodyModel[20] = new ModelRendererTurbo(this, 70, 150, 500, 500);
    bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[20].setRotationPoint(-24.0F, 2.0F, 14.0F);
    
    bodyModel[21] = new ModelRendererTurbo(this, 0, 150, 500, 500);
    bodyModel[21].addBox(0.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
    bodyModel[21].setRotationPoint(14.0F, -3.0F, -13.0F);
    
    bodyModel[22] = new ModelRendererTurbo(this, 0, 150, 500, 500);
    bodyModel[22].addBox(0.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
    bodyModel[22].setRotationPoint(-17.0F, -3.0F, -13.0F);
    
    bodyModel[23] = new ModelRendererTurbo(this, 30, 150, 500, 500);
    bodyModel[23].addBox(0.0F, 0.0F, -1.0F, 17, 4, 1, 0.0F);
    bodyModel[23].setRotationPoint(7.0F, 0.0F, -13.5F);
    
    bodyModel[24] = new ModelRendererTurbo(this, 30, 150, 500, 500);
    bodyModel[24].addBox(0.0F, 0.0F, -1.0F, 17, 4, 1, 0.0F);
    bodyModel[24].setRotationPoint(-24.0F, 0.0F, -13.5F);
    
    bodyModel[25] = new ModelRendererTurbo(this, 70, 150, 500, 500);
    bodyModel[25].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[25].setRotationPoint(22.0F, 2.0F, -14.0F);
    
    bodyModel[26] = new ModelRendererTurbo(this, 70, 150, 500, 500);
    bodyModel[26].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[26].setRotationPoint(7.0F, 2.0F, -14.0F);
    
    bodyModel[27] = new ModelRendererTurbo(this, 70, 150, 500, 500);
    bodyModel[27].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[27].setRotationPoint(-9.0F, 2.0F, -14.0F);
    
    bodyModel[28] = new ModelRendererTurbo(this, 70, 150, 500, 500);
    bodyModel[28].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[28].setRotationPoint(-24.0F, 2.0F, -14.0F);
    
    bodyModel[29] = new ModelRendererTurbo(this, 0, 210, 500, 500);
    bodyModel[29].addBox(1.0F, 0.0F, -7.0F, 77, 1, 8, 0.0F);
    bodyModel[29].setRotationPoint(-41.0F, -8.0F, -14.0F);
    (bodyModel[29]).rotateAngleZ = 0.03839725F;
    
    bodyModel[30] = new ModelRendererTurbo(this, 0, 210, 500, 500);
    bodyModel[30].addBox(1.0F, 0.0F, -1.0F, 77, 1, 8, 0.0F);
    bodyModel[30].setRotationPoint(-41.0F, -8.0F, 14.0F);
    (bodyModel[30]).rotateAngleZ = 0.03839725F;
    
    bodyModel[31] = new ModelRendererTurbo(this, 100, 150, 500, 500);
    bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 3, 1, 8, 0.0F);
    bodyModel[31].setRotationPoint(37.0F, -11.0F, 13.0F);
    (bodyModel[31]).rotateAngleZ = -0.4363323F;
    
    bodyModel[32] = new ModelRendererTurbo(this, 100, 150, 500, 500);
    bodyModel[32].addBox(0.0F, 0.0F, -8.0F, 3, 1, 8, 0.0F);
    bodyModel[32].setRotationPoint(37.0F, -11.0F, -13.0F);
    (bodyModel[32]).rotateAngleZ = -0.4363323F;
    
    bodyModel[33] = new ModelRendererTurbo(this, 140, 150, 500, 500);
    bodyModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 7, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, -2.0F, -0.5F);
    bodyModel[33].setRotationPoint(-40.0F, -8.0F, 13.0F);
    
    bodyModel[34] = new ModelRendererTurbo(this, 140, 150, 500, 500);
    bodyModel[34].addShapeBox(0.0F, 0.0F, -1.0F, 7, 3, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[34].setRotationPoint(-40.0F, -8.0F, -13.0F);
    
    bodyModel[35] = new ModelRendererTurbo(this, 160, 150, 500, 500);
    bodyModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 16, 7, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[35].setRotationPoint(23.0F, -10.0F, -13.0F);
    
    bodyModel[36] = new ModelRendererTurbo(this, 160, 150, 500, 500);
    bodyModel[36].addShapeBox(0.0F, 0.0F, -1.0F, 16, 7, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[36].setRotationPoint(23.0F, -10.0F, 14.0F);
    
    bodyModel[37] = new ModelRendererTurbo(this, 200, 150, 500, 500);
    bodyModel[37].addBox(0.0F, -1.0F, 0.0F, 1, 4, 1, 0.0F);
    bodyModel[37].setRotationPoint(37.0F, -11.0F, -13.0F);
    (bodyModel[37]).rotateAngleZ = -0.4363323F;
    
    bodyModel[38] = new ModelRendererTurbo(this, 200, 150, 500, 500);
    bodyModel[38].addBox(0.0F, -1.0F, -1.0F, 1, 4, 1, 0.0F);
    bodyModel[38].setRotationPoint(37.0F, -11.0F, 13.0F);
    (bodyModel[38]).rotateAngleZ = -0.4363323F;
    
    bodyModel[39] = new ModelRendererTurbo(this, 210, 150, 500, 500);
    bodyModel[39].addBox(0.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F);
    bodyModel[39].setRotationPoint(37.0F, -11.0F, -21.0F);
    (bodyModel[39]).rotateAngleZ = -0.4363323F;
    
    bodyModel[40] = new ModelRendererTurbo(this, 210, 150, 500, 500);
    bodyModel[40].addBox(0.0F, -1.0F, -8.0F, 1, 1, 8, 0.0F);
    bodyModel[40].setRotationPoint(37.0F, -11.0F, 21.0F);
    (bodyModel[40]).rotateAngleZ = -0.4363323F;
    
    bodyModel[41] = new ModelRendererTurbo(this, 330, 150, 500, 500);
    bodyModel[41].addBox(5.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F);
    bodyModel[41].setRotationPoint(-41.0F, -8.0F, 13.0F);
    (bodyModel[41]).rotateAngleZ = 0.03839725F;
    
    bodyModel[42] = new ModelRendererTurbo(this, 330, 150, 500, 500);
    bodyModel[42].addBox(5.0F, -1.0F, -8.0F, 1, 1, 8, 0.0F);
    bodyModel[42].setRotationPoint(-41.0F, -8.0F, -13.0F);
    (bodyModel[42]).rotateAngleZ = 0.03839725F;
    
    bodyModel[43] = new ModelRendererTurbo(this, 330, 150, 500, 500);
    bodyModel[43].addBox(23.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F);
    bodyModel[43].setRotationPoint(-41.0F, -8.0F, 13.0F);
    (bodyModel[43]).rotateAngleZ = 0.03839725F;
    
    bodyModel[44] = new ModelRendererTurbo(this, 330, 150, 500, 500);
    bodyModel[44].addBox(23.0F, -1.0F, -8.0F, 1, 1, 8, 0.0F);
    bodyModel[44].setRotationPoint(-41.0F, -8.0F, -13.0F);
    (bodyModel[44]).rotateAngleZ = 0.03839725F;
    
    bodyModel[45] = new ModelRendererTurbo(this, 235, 150, 500, 500);
    bodyModel[45].addBox(0.0F, -4.0F, 0.0F, 1, 2, 6, 0.0F);
    bodyModel[45].setRotationPoint(25.0F, -9.0F, 0.0F);
    (bodyModel[45]).rotateAngleZ = 0.2443461F;
    
    bodyModel[46] = new ModelRendererTurbo(this, 332, 105, 500, 500);
    bodyModel[46].addBox(-0.5F, 1.0F, -2.0F, 3, 8, 4, 0.0F);
    bodyModel[46].setRotationPoint(-36.0F, -9.0F, 0.0F);
    (bodyModel[46]).rotateAngleZ = -0.1570796F;
    
    bodyModel[47] = new ModelRendererTurbo(this, 355, 105, 500, 500);
    bodyModel[47].addShapeBox(-0.5F, 1.0F, 0.0F, 3, 8, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[47].setRotationPoint(-36.0F, -9.0F, 2.0F);
    (bodyModel[47]).rotateAngleZ = -0.1570796F;
    
    bodyModel[48] = new ModelRendererTurbo(this, 355, 105, 500, 500);
    bodyModel[48].addShapeBox(-0.5F, 1.0F, -2.0F, 3, 8, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[48].setRotationPoint(-36.0F, -9.0F, -2.0F);
    (bodyModel[48]).rotateAngleZ = -0.1570796F;
    
    bodyModel[49] = new ModelRendererTurbo(this, 370, 105, 500, 500);
    bodyModel[49].addBox(-2.0F, 3.5F, -1.5F, 4, 3, 3, 0.0F);
    bodyModel[49].setRotationPoint(-36.0F, -9.0F, 0.0F);
    (bodyModel[49]).rotateAngleZ = -0.1570796F;
    
    bodyModel[50] = new ModelRendererTurbo(this, 0, 230, 500, 500);
    bodyModel[50].addShapeBox(0.0F, -6.0F, 0.0F, 1, 2, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[50].setRotationPoint(25.0F, -9.0F, 0.0F);
    (bodyModel[50]).rotateAngleZ = 0.2443461F;
    
    bodyModel[51] = new ModelRendererTurbo(this, 25, 230, 500, 500);
    bodyModel[51].addBox(0.0F, 0.0F, -13.0F, 23, 4, 26, 0.0F);
    bodyModel[51].setRotationPoint(-32.0F, -13.0F, 0.0F);
    
    bodyModel[52] = new ModelRendererTurbo(this, 135, 230, 500, 500);
    bodyModel[52].addShapeBox(0.0F, 0.0F, -13.0F, 19, 4, 26, 0.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[52].setRotationPoint(-28.0F, -17.0F, 0.0F);
    
    bodyModel[53] = new ModelRendererTurbo(this, 250, 230, 500, 500);
    bodyModel[53].addShapeBox(0.0F, 0.0F, -13.0F, 4, 4, 26, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[53].setRotationPoint(-36.0F, -13.0F, 0.0F);
    
    bodyModel[54] = new ModelRendererTurbo(this, 400, 0, 500, 500);
    bodyModel[54].addShapeBox(0.0F, 0.0F, -13.0F, 4, 4, 26, 0.0F, -3.9F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, 0.0F, 0.0F, -9.0F, -3.9F, 0.0F, -9.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[54].setRotationPoint(-32.0F, -17.0F, 0.0F);
    
    bodyModel[55] = new ModelRendererTurbo(this, 400, 60, 500, 500);
    bodyModel[55].addShapeBox(0.0F, 0.0F, 0.0F, 23, 3, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[55].setRotationPoint(-32.0F, -13.0F, 13.0F);
    
    bodyModel[56] = new ModelRendererTurbo(this, 400, 75, 500, 500);
    bodyModel[56].addShapeBox(0.0F, 0.0F, -2.0F, 23, 3, 2, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[56].setRotationPoint(-32.0F, -13.0F, -13.0F);
    
    bodyModel[57] = new ModelRendererTurbo(this, 400, 105, 500, 500);
    bodyModel[57].addBox(43.0F, -1.0F, -8.0F, 1, 1, 8, 0.0F);
    bodyModel[57].setRotationPoint(-41.0F, -8.0F, -13.0F);
    (bodyModel[57]).rotateAngleZ = 0.03839725F;
    
    bodyModel[58] = new ModelRendererTurbo(this, 400, 105, 500, 500);
    bodyModel[58].addBox(63.0F, -1.0F, -8.0F, 1, 1, 8, 0.0F);
    bodyModel[58].setRotationPoint(-41.0F, -8.0F, -13.0F);
    (bodyModel[58]).rotateAngleZ = 0.03839725F;
    
    bodyModel[59] = new ModelRendererTurbo(this, 400, 105, 500, 500);
    bodyModel[59].addBox(43.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F);
    bodyModel[59].setRotationPoint(-41.0F, -8.0F, 13.0F);
    (bodyModel[59]).rotateAngleZ = 0.03839725F;
    
    bodyModel[60] = new ModelRendererTurbo(this, 400, 105, 500, 500);
    bodyModel[60].addBox(63.0F, -1.0F, 0.0F, 1, 1, 8, 0.0F);
    bodyModel[60].setRotationPoint(-41.0F, -8.0F, 13.0F);
    (bodyModel[60]).rotateAngleZ = 0.03839725F;
    
    bodyModel[61] = new ModelRendererTurbo(this, 380, 150, 500, 500);
    bodyModel[61].addBox(0.0F, 0.0F, -1.0F, 5, 5, 1, 0.0F);
    bodyModel[61].setRotationPoint(14.0F, -16.0F, -13.0F);
    
    bodyModel[62] = new ModelRendererTurbo(this, 400, 150, 500, 500);
    bodyModel[62].addBox(0.0F, 0.0F, -0.5F, 5, 3, 1, 0.0F);
    bodyModel[62].setRotationPoint(11.0F, -13.0F, 13.0F);
    
    bodyModel[63] = new ModelRendererTurbo(this, 200, 170, 500, 500);
    bodyModel[63].addShape3D(0.0F, -5.0F, -0.5F, new Shape2D(new Coord2D[] { new Coord2D(5.0D, 5.0D, 5, 5), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(8.0D, 3.0D, 8, 3), new Coord2D(5.0D, 5.0D, 5, 5) }), 10.0F, 8, 5, 33, 10, 3, new float[] { 8.0F, 4.0F, 3.0F, 8.0F, 5.0F, 5.0F });
    bodyModel[63].setRotationPoint(-8.5F, -14.0F, -13.0F);
    
    bodyModel[64] = new ModelRendererTurbo(this, 430, 150, 500, 500);
    bodyModel[64].addBox(0.0F, 0.0F, 0.0F, 11, 1, 2, 0.0F);
    bodyModel[64].setRotationPoint(-9.0F, -15.0F, -15.5F);
    
    bodyModel[65] = new ModelRendererTurbo(this, 240, 170, 500, 500);
    bodyModel[65].addBox(0.0F, -0.5F, 0.0F, 1, 2, 3, 0.0F);
    bodyModel[65].setRotationPoint(2.0F, -15.0F, -16.0F);
    
    bodyModel[66] = new ModelRendererTurbo(this, 260, 170, 500, 500);
    bodyModel[66].addBox(0.0F, -0.5F, -3.0F, 1, 2, 3, 0.0F);
    bodyModel[66].setRotationPoint(-10.0F, -15.0F, -13.0F);
    
    bodyModel[67] = new ModelRendererTurbo(this, 300, 170, 500, 500);
    bodyModel[67].addBox(0.0F, 0.0F, -2.0F, 5, 1, 2, 0.0F);
    bodyModel[67].setRotationPoint(-6.0F, -15.0F, -15.5F);
    (bodyModel[67]).rotateAngleY = 0.03490658F;
    
    bodyModel[68] = new ModelRendererTurbo(this, 350, 170, 500, 500);
    bodyModel[68].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[68].setRotationPoint(36.0F, -8.0F, 10.0F);
    
    bodyModel[69] = new ModelRendererTurbo(this, 370, 170, 500, 500);
    bodyModel[69].addShapeBox(-1.0F, -1.0F, 0.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
    bodyModel[69].setRotationPoint(36.0F, -9.0F, 9.0F);
    
    bodyModel[70] = new ModelRendererTurbo(this, 330, 195, 500, 500);
    bodyModel[70].addBox(44.5F, -2.0F, -7.0F, 7, 2, 7, 0.0F);
    bodyModel[70].setRotationPoint(-41.0F, -8.0F, -13.0F);
    (bodyModel[70]).rotateAngleZ = 0.03839725F;
    
    bodyModel[71] = new ModelRendererTurbo(this, 370, 195, 500, 500);
    bodyModel[71].addBox(53.7F, -0.5F, -6.0F, 9, 1, 1, 0.0F);
    bodyModel[71].setRotationPoint(-41.0F, -8.0F, -13.0F);
    (bodyModel[71]).rotateAngleZ = 0.03839725F;
    
    bodyModel[72] = new ModelRendererTurbo(this, 410, 195, 500, 500);
    bodyModel[72].addBox(60.3F, -0.7F, -6.5F, 2, 1, 4, 0.0F);
    bodyModel[72].setRotationPoint(-41.0F, -8.0F, -13.0F);
    (bodyModel[72]).rotateAngleZ = 0.03839725F;
    
    bodyModel[73] = new ModelRendererTurbo(this, 40, 77, 500, 500);
    bodyModel[73].addBox(0.0F, 0.0F, 0.0F, 8, 4, 3, 0.0F);
    bodyModel[73].setRotationPoint(30.0F, -5.0F, 12.0F);
    
    bodyModel[74] = new ModelRendererTurbo(this, 75, 77, 500, 500);
    bodyModel[74].addShapeBox(0.0F, 0.0F, 0.0F, 8, 2, 3, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[74].setRotationPoint(30.0F, -7.0F, 12.0F);
    
    bodyModel[75] = new ModelRendererTurbo(this, 20, 90, 500, 500);
    bodyModel[75].addShapeBox(0.0F, 0.0F, 0.0F, 8, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[75].setRotationPoint(30.0F, -1.0F, 12.0F);
    
    bodyModel[76] = new ModelRendererTurbo(this, 190, 185, 500, 500);
    bodyModel[76].addBox(0.0F, 0.0F, 0.0F, 5, 3, 3, 0.0F);
    bodyModel[76].setRotationPoint(-39.0F, -8.5F, -11.0F);
    
    bodyModel[77] = new ModelRendererTurbo(this, 215, 185, 500, 500);
    bodyModel[77].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[77].setRotationPoint(-38.5F, -8.0F, -8.0F);
    
    bodyModel[78] = new ModelRendererTurbo(this, 190, 195, 500, 500);
    bodyModel[78].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[78].setRotationPoint(-39.5F, -9.0F, -7.0F);
    
    bodyModel[79] = new ModelRendererTurbo(this, 240, 195, 500, 500);
    bodyModel[79].addBox(0.0F, 0.0F, 0.0F, 4, 2, 18, 0.0F);
    bodyModel[79].setRotationPoint(-39.5F, -11.0F, -7.0F);
    
    bodyModel[80] = new ModelRendererTurbo(this, 320, 230, 500, 500);
    bodyModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 18, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[80].setRotationPoint(-39.5F, -12.0F, -7.0F);
    
    bodyModel[81] = new ModelRendererTurbo(this, 320, 215, 500, 500);
    bodyModel[81].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, -1.9F);
    bodyModel[81].setRotationPoint(-38.5F, -11.0F, 11.0F);
    
    bodyModel[82] = new ModelRendererTurbo(this, 335, 215, 500, 500);
    bodyModel[82].addBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F);
    bodyModel[82].setRotationPoint(-38.5F, -16.0F, 11.0F);
    
    bodyModel[83] = new ModelRendererTurbo(this, 200, 0, 500, 500);
    bodyModel[83].addBox(0.0F, 0.0F, 0.0F, 11, 1, 1, 0.0F);
    bodyModel[83].setRotationPoint(-4.0F, -15.0F, 12.5F);
    
    bodyModel[84] = new ModelRendererTurbo(this, 200, 5, 500, 500);
    bodyModel[84].addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
    bodyModel[84].setRotationPoint(5.0F, -16.5F, 12.2F);
    
    bodyModel[85] = new ModelRendererTurbo(this, 200, 15, 500, 500);
    bodyModel[85].addBox(0.0F, 0.0F, 0.0F, 12, 1, 1, 0.0F);
    bodyModel[85].setRotationPoint(-8.5F, -13.0F, 12.5F);
    
    bodyModel[86] = new ModelRendererTurbo(this, 200, 25, 500, 500);
    bodyModel[86].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    bodyModel[86].setRotationPoint(-8.4F, -13.5F, 12.8F);
    
    bodyModel[87] = new ModelRendererTurbo(this, 240, 0, 500, 500);
    bodyModel[87].addShapeBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[87].setRotationPoint(-7.9F, -13.0F, 12.5F);
    
    bodyModel[88] = new ModelRendererTurbo(this, 240, 10, 500, 500);
    bodyModel[88].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
    bodyModel[88].setRotationPoint(-7.9F, -12.0F, 12.5F);
    
    bodyModel[89] = new ModelRendererTurbo(this, 255, 0, 500, 500);
    bodyModel[89].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[89].setRotationPoint(8.0F, -16.5F, 12.2F);
    
    bodyModel[90] = new ModelRendererTurbo(this, 255, 10, 500, 500);
    bodyModel[90].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[90].setRotationPoint(-3.0F, -15.5F, 13.0F);
    
    bodyModel[91] = new ModelRendererTurbo(this, 255, 10, 500, 500);
    bodyModel[91].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[91].setRotationPoint(1.0F, -13.5F, 13.0F);
    
    bodyModel[92] = new ModelRendererTurbo(this, 255, 10, 500, 500);
    bodyModel[92].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[92].setRotationPoint(-6.0F, -13.5F, 13.0F);
    
    bodyModel[93] = new ModelRendererTurbo(this, 270, 0, 500, 500);
    bodyModel[93].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
    bodyModel[93].setRotationPoint(8.5F, -16.5F, 12.5F);
    
    bodyModel[94] = new ModelRendererTurbo(this, 390, 170, 500, 500);
    bodyModel[94].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[94].setRotationPoint(37.0F, -10.0F, 9.0F);
    
    bodyModel[95] = new ModelRendererTurbo(this, 0, 265, 500, 500);
    bodyModel[95].addBox(0.0F, 0.0F, 0.0F, 4, 2, 2, 0.0F);
    bodyModel[95].setRotationPoint(24.0F, -13.0F, 2.0F);
    
    bodyModel[96] = new ModelRendererTurbo(this, 15, 265, 500, 500);
    bodyModel[96].addShapeBox(4.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[96].setRotationPoint(24.0F, -13.0F, 2.0F);
    
    bodyModel[97] = new ModelRendererTurbo(this, 30, 265, 500, 500);
    bodyModel[97].addBox(0.0F, 0.0F, 0.0F, 10, 1, 1, 0.0F);
    bodyModel[97].setRotationPoint(24.0F, -13.2F, 2.5F);
    
    bodyModel[98] = new ModelRendererTurbo(this, 60, 265, 500, 500);
    bodyModel[98].addBox(-1.0F, -0.5F, -0.5F, 4, 3, 3, 0.0F);
    bodyModel[98].setRotationPoint(23.0F, -13.0F, 2.0F);
    
    bodyModel[99] = new ModelRendererTurbo(this, 0, 280, 500, 500);
    bodyModel[99].addShapeBox(-7.0F, 0.0F, -13.0F, 14, 1, 26, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[99].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    bodyModel[100] = new ModelRendererTurbo(this, 85, 280, 500, 500);
    bodyModel[100].addShapeBox(7.0F, 0.0F, -13.0F, 6, 1, 26, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -6.5F, -0.5F, 0.0F, -6.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[100].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    bodyModel[101] = new ModelRendererTurbo(this, 160, 280, 500, 500);
    bodyModel[101].addShapeBox(-13.0F, 0.0F, -13.0F, 6, 1, 26, 0.0F, -0.5F, 0.0F, -6.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -6.5F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F);
    bodyModel[101].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    bodyModel[102] = new ModelRendererTurbo(this, 40, 390, 500, 500);
    bodyModel[102].addBox(0.0F, 0.0F, 0.0F, 3, 1, 9, 0.0F);
    bodyModel[102].setRotationPoint(19.5F, -17.3F, 3.0F);
    
    bodyModel[103] = new ModelRendererTurbo(this, 70, 390, 500, 500);
    bodyModel[103].addBox(-3.0F, 0.0F, 0.0F, 3, 1, 9, 0.0F);
    bodyModel[103].setRotationPoint(19.5F, -17.3F, 3.0F);
    
    bodyModel[104] = new ModelRendererTurbo(this, 105, 390, 500, 500);
    bodyModel[104].addBox(2.0F, -0.4F, -7.0F, 8, 1, 14, 0.0F);
    bodyModel[104].setRotationPoint(25.0F, -9.0F, 0.0F);
    (bodyModel[104]).rotateAngleZ = -0.148353F;
    
    bodyModel[105] = new ModelRendererTurbo(this, 0, 405, 500, 500);
    bodyModel[105].addBox(1.0F, -2.0F, 0.0F, 8, 2, 6, 0.0F);
    bodyModel[105].setRotationPoint(25.0F, -9.0F, 7.0F);
    (bodyModel[105]).rotateAngleZ = -0.148353F;
    
    bodyModel[106] = new ModelRendererTurbo(this, 35, 405, 500, 500);
    bodyModel[106].addBox(0.0F, 1.0F, -7.0F, 2, 6, 14, 0.0F);
    bodyModel[106].setRotationPoint(38.0F, -7.0F, 0.0F);
    (bodyModel[106]).rotateAngleZ = -0.1308997F;
    
    bodyModel[107] = new ModelRendererTurbo(this, 75, 405, 500, 500);
    bodyModel[107].addShapeBox(-4.0F, 0.0F, -2.0F, 4, 4, 9, 0.0F, -1.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, -3.9F, -2.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[107].setRotationPoint(-32.0F, -13.0F, 0.0F);

    
    leftTrackWheelModels = new ModelRendererTurbo[8];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 170, 500, 500);
    leftTrackWheelModels[0].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[0].setRotationPoint(23.0F, 3.0F, -17.0F);
    
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 170, 500, 500);
    leftTrackWheelModels[1].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[1].setRotationPoint(8.0F, 3.0F, -17.0F);
    
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 170, 500, 500);
    leftTrackWheelModels[2].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[2].setRotationPoint(-8.0F, 3.0F, -17.0F);
    
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 170, 500, 500);
    leftTrackWheelModels[3].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[3].setRotationPoint(-23.0F, 3.0F, -17.0F);
    
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 50, 170, 500, 500);
    leftTrackWheelModels[4].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[4].setRotationPoint(34.0F, -3.0F, -15.0F);
    
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 100, 170, 500, 500);
    leftTrackWheelModels[5].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[5].setRotationPoint(-34.0F, 0.0F, -15.0F);
    
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 150, 170, 500, 500);
    leftTrackWheelModels[6].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 6, 0.0F);
    leftTrackWheelModels[6].setRotationPoint(0.0F, -4.0F, -15.0F);
    
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 150, 170, 500, 500);
    leftTrackWheelModels[7].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 6, 0.0F);
    leftTrackWheelModels[7].setRotationPoint(15.0F, -5.0F, -15.0F);
    
    leftTrackModel = new ModelRendererTurbo[8];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 105, 500, 500);
    leftTrackModel[0].addBox(0.0F, 0.0F, -6.0F, 72, 2, 6, 0.0F);
    leftTrackModel[0].setRotationPoint(-36.0F, -5.0F, -14.0F);
    (leftTrackModel[0]).rotateAngleZ = 0.04188791F;
    
    leftTrackModel[1] = new ModelRendererTurbo(this, 100, 117, 500, 500);
    leftTrackModel[1].addShapeBox(0.0F, 0.0F, -6.0F, 4, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[1].setRotationPoint(36.0F, -8.0F, -14.0F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2] = new ModelRendererTurbo(this, 130, 117, 500, 500);
    leftTrackModel[2].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F);
    leftTrackModel[2].setRotationPoint(37.0F, -5.0F, -14.0F);
    
    leftTrackModel[3] = new ModelRendererTurbo(this, 0, 195, 500, 500);
    leftTrackModel[3].addBox(0.0F, -2.0F, -6.0F, 17, 2, 6, 0.0F);
    leftTrackModel[3].setRotationPoint(26.0F, 10.0F, -14.0F);
    (leftTrackModel[3]).rotateAngleZ = 0.69813174F;
    
    leftTrackModel[4] = new ModelRendererTurbo(this, 0, 129, 500, 500);
    leftTrackModel[4].addBox(0.0F, 0.0F, -6.0F, 53, 2, 6, 0.0F);
    leftTrackModel[4].setRotationPoint(-27.0F, 8.0F, -14.0F);
    
    leftTrackModel[5] = new ModelRendererTurbo(this, 60, 195, 500, 500);
    leftTrackModel[5].addShapeBox(0.0F, -2.0F, -6.0F, 14, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[5].setRotationPoint(-39.0F, 2.0F, -14.0F);
    (leftTrackModel[5]).rotateAngleZ = -0.5934119F;
    
    leftTrackModel[6] = new ModelRendererTurbo(this, 120, 195, 500, 500);
    leftTrackModel[6].addBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F);
    leftTrackModel[6].setRotationPoint(-39.0F, -2.0F, -14.0F);
    
    leftTrackModel[7] = new ModelRendererTurbo(this, 150, 195, 500, 500);
    leftTrackModel[7].addShapeBox(-4.0F, 0.0F, -6.0F, 4, 2, 6, 0.0F, 0.2F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    leftTrackModel[7].setRotationPoint(-36.0F, -5.0F, -14.0F);
    (leftTrackModel[7]).rotateAngleZ = 0.7853982F;
    
    rightTrackWheelModels = new ModelRendererTurbo[8];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 170, 500, 500);
    rightTrackWheelModels[0].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[0].setRotationPoint(23.0F, 3.0F, 17.0F);
    
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 170, 500, 500);
    rightTrackWheelModels[1].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[1].setRotationPoint(8.0F, 3.0F, 17.0F);
    
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 170, 500, 500);
    rightTrackWheelModels[2].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[2].setRotationPoint(-8.0F, 3.0F, 17.0F);
    
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 170, 500, 500);
    rightTrackWheelModels[3].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[3].setRotationPoint(-23.0F, 3.0F, 17.0F);
    
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 50, 170, 500, 500);
    rightTrackWheelModels[4].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[4].setRotationPoint(34.0F, -3.0F, 15.0F);
    
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 100, 170, 500, 500);
    rightTrackWheelModels[5].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[5].setRotationPoint(-34.0F, 0.0F, 15.0F);
    
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 150, 170, 500, 500);
    rightTrackWheelModels[6].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 6, 0.0F);
    rightTrackWheelModels[6].setRotationPoint(0.0F, -4.0F, 15.0F);
    
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 150, 170, 500, 500);
    rightTrackWheelModels[7].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 6, 0.0F);
    rightTrackWheelModels[7].setRotationPoint(15.0F, -5.0F, -15.0F);
    
    rightTrackModel = new ModelRendererTurbo[8];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 105, 500, 500);
    rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 72, 2, 6, 0.0F);
    rightTrackModel[0].setRotationPoint(-36.0F, -5.0F, 14.0F);
    (rightTrackModel[0]).rotateAngleZ = 0.04188791F;
    
    rightTrackModel[1] = new ModelRendererTurbo(this, 100, 117, 500, 500);
    rightTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[1].setRotationPoint(36.0F, -8.0F, 14.0F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2] = new ModelRendererTurbo(this, 130, 117, 500, 500);
    rightTrackModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F);
    rightTrackModel[2].setRotationPoint(37.0F, -5.0F, 14.0F);
    
    rightTrackModel[3] = new ModelRendererTurbo(this, 0, 195, 500, 500);
    rightTrackModel[3].addBox(0.0F, -2.0F, 0.0F, 17, 2, 6, 0.0F);
    rightTrackModel[3].setRotationPoint(26.0F, 10.0F, 14.0F);
    (rightTrackModel[3]).rotateAngleZ = 0.69813174F;
    
    rightTrackModel[4] = new ModelRendererTurbo(this, 0, 129, 500, 500);
    rightTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 53, 2, 6, 0.0F);
    rightTrackModel[4].setRotationPoint(-27.0F, 8.0F, 14.0F);
    
    rightTrackModel[5] = new ModelRendererTurbo(this, 60, 195, 500, 500);
    rightTrackModel[5].addShapeBox(0.0F, -2.0F, 0.0F, 14, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[5].setRotationPoint(-39.0F, 2.0F, 14.0F);
    (rightTrackModel[5]).rotateAngleZ = -0.5934119F;
    
    rightTrackModel[6] = new ModelRendererTurbo(this, 120, 195, 500, 500);
    rightTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F);
    rightTrackModel[6].setRotationPoint(-39.0F, -2.0F, 14.0F);
    
    rightTrackModel[7] = new ModelRendererTurbo(this, 150, 195, 500, 500);
    rightTrackModel[7].addShapeBox(-4.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F, 0.2F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    rightTrackModel[7].setRotationPoint(-36.0F, -5.0F, 14.0F);
    (rightTrackModel[7]).rotateAngleZ = 0.7853982F;
    
    turretModel = new ModelRendererTurbo[20];
    turretModel[0] = new ModelRendererTurbo(this, 0, 320, 500, 500);
    turretModel[0].addShapeBox(0.0F, -9.0F, -13.0F, 7, 9, 26, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretModel[0].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[1] = new ModelRendererTurbo(this, 75, 320, 500, 500);
    turretModel[1].addShapeBox(7.0F, -9.0F, -11.0F, 5, 9, 22, 0.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, -3.0F, -4.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretModel[1].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[2] = new ModelRendererTurbo(this, 135, 320, 500, 500);
    turretModel[2].addShapeBox(-10.0F, -9.0F, -13.0F, 10, 9, 26, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    turretModel[2].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[3] = new ModelRendererTurbo(this, 220, 320, 500, 500);
    turretModel[3].addShapeBox(-16.0F, -9.0F, -11.0F, 6, 9, 22, 0.0F, -1.0F, -1.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, -1.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    turretModel[3].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[4] = new ModelRendererTurbo(this, 285, 320, 500, 500);
    turretModel[4].addShapeBox(-18.0F, -8.0F, -9.0F, 2, 8, 18, 0.0F, -1.0F, -0.5F, -5.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, -0.5F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -5.0F);
    turretModel[4].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[5] = new ModelRendererTurbo(this, 335, 320, 500, 500);
    turretModel[5].addShapeBox(7.0F, -9.0F, -10.0F, 5, 8, 20, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[5].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[6] = new ModelRendererTurbo(this, 0, 360, 500, 500);
    turretModel[6].addShape3D(-9.0F, 9.0F, -10.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 4.0F, 13, 13, 44, 4, 4, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    turretModel[6].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[7] = new ModelRendererTurbo(this, 60, 360, 500, 500);
    turretModel[7].addBox(2.0F, -12.9F, 0.0F, 3, 4, 6, 0.0F);
    turretModel[7].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[8] = new ModelRendererTurbo(this, 85, 360, 500, 500);
    turretModel[8].addShapeBox(-5.0F, -12.9F, -5.0F, 5, 4, 2, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[8].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[9] = new ModelRendererTurbo(this, 85, 370, 500, 500);
    turretModel[9].addShapeBox(-5.0F, -12.9F, 10.0F, 5, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[9].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[10] = new ModelRendererTurbo(this, 60, 375, 500, 500);
    turretModel[10].addShapeBox(-11.0F, -12.9F, 1.0F, 2, 4, 5, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[10].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    turretModel[11] = new ModelRendererTurbo(this, 110, 360, 500, 500);
    turretModel[11].addShapeBox(0.0F, 0.0F, 1.5F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[11].setRotationPoint(14.0F, -27.0F, 0.0F);
    (turretModel[11]).rotateAngleZ = 0.1047198F;
    
    turretModel[12] = new ModelRendererTurbo(this, 110, 370, 500, 500);
    turretModel[12].addShapeBox(0.0F, 0.0F, -2.5F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[12].setRotationPoint(14.0F, -27.0F, 0.0F);
    (turretModel[12]).rotateAngleZ = 0.1047198F;
    
    turretModel[13] = new ModelRendererTurbo(this, 125, 360, 500, 500);
    turretModel[13].addShapeBox(0.0F, 4.0F, 1.5F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[13].setRotationPoint(14.0F, -27.0F, 0.0F);
    (turretModel[13]).rotateAngleZ = 0.1047198F;
    
    turretModel[14] = new ModelRendererTurbo(this, 125, 370, 500, 500);
    turretModel[14].addShapeBox(0.0F, 4.0F, -2.5F, 3, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.5F, 0.0F, -1.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[14].setRotationPoint(14.0F, -27.0F, 0.0F);
    (turretModel[14]).rotateAngleZ = 0.1047198F;
    
    turretModel[15] = new ModelRendererTurbo(this, 145, 360, 500, 500);
    turretModel[15].addShapeBox(0.0F, 3.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[15].setRotationPoint(14.0F, -27.0F, 4.0F);
    (turretModel[15]).rotateAngleZ = 0.1047198F;
    
    turretModel[16] = new ModelRendererTurbo(this, 145, 370, 500, 500);
    turretModel[16].addShapeBox(0.0F, 3.0F, 0.0F, 1, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[16].setRotationPoint(14.0F, -27.0F, 7.0F);
    (turretModel[16]).rotateAngleZ = 0.1047198F;
    
    turretModel[17] = new ModelRendererTurbo(this, 160, 360, 500, 500);
    turretModel[17].addBox(-0.5F, 4.0F, 0.0F, 1, 1, 2, 0.0F);
    turretModel[17].setRotationPoint(14.0F, -27.0F, 5.0F);
    (turretModel[17]).rotateAngleZ = 0.1047198F;
    
    turretModel[18] = new ModelRendererTurbo(this, 0, 390, 500, 500);
    turretModel[18].addShapeBox(3.0F, -13.0F, -1.0F, 2, 4, 2, 0.0F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F);
    turretModel[18].setRotationPoint(3.0F, -18.0F, 9.0F);
    
    turretModel[19] = new ModelRendererTurbo(this, 20, 390, 500, 500);
    turretModel[19].addBox(3.0F, -15.0F, 8.0F, 2, 2, 2, 0.0F);
    turretModel[19].setRotationPoint(3.0F, -18.0F, 0.0F);
    
    barrelModel = new ModelRendererTurbo[11];
    barrelModel[0] = new ModelRendererTurbo(this, 180, 360, 500, 500);
    barrelModel[0].addBox(0.0F, -1.5F, -1.5F, 5, 3, 3, 0.0F);
    barrelModel[0].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    barrelModel[1] = new ModelRendererTurbo(this, 180, 370, 500, 500);
    barrelModel[1].addShapeBox(0.0F, -2.5F, -1.5F, 5, 1, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[1].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    barrelModel[2] = new ModelRendererTurbo(this, 180, 380, 500, 500);
    barrelModel[2].addShapeBox(0.0F, 1.5F, -1.5F, 5, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    barrelModel[2].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    barrelModel[3] = new ModelRendererTurbo(this, 205, 360, 500, 500);
    barrelModel[3].addTrapezoid(5.0F, -2.0F, -1.0F, 1, 2, 2, 0.0F, -0.5F, 2);
    barrelModel[3].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    barrelModel[4] = new ModelRendererTurbo(this, 205, 370, 500, 500);
    barrelModel[4].addShapeBox(5.0F, 0.0F, -1.0F, 4, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F);
    barrelModel[4].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    barrelModel[5] = new ModelRendererTurbo(this, 230, 360, 500, 500);
    barrelModel[5].addShapeBox(9.0F, 0.0F, -1.0F, 13, 2, 2, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    barrelModel[5].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    barrelModel[6] = new ModelRendererTurbo(this, 230, 370, 500, 500);
    barrelModel[6].addBox(22.0F, 0.0F, -1.0F, 2, 2, 2, 0.0F);
    barrelModel[6].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    barrelModel[7] = new ModelRendererTurbo(this, 60, 265, 500, 500);
    barrelModel[7].addBox(-3.0F, -1.0F, -8.0F, 4, 3, 3, 0.0F);
    barrelModel[7].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    barrelModel[8] = new ModelRendererTurbo(this, 0, 265, 500, 500);
    barrelModel[8].addBox(0.0F, -0.5F, -7.5F, 4, 2, 2, 0.0F);
    barrelModel[8].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    barrelModel[9] = new ModelRendererTurbo(this, 15, 265, 500, 500);
    barrelModel[9].addShapeBox(4.0F, -0.5F, -7.5F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[9].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    barrelModel[10] = new ModelRendererTurbo(this, 30, 265, 500, 500);
    barrelModel[10].addBox(0.0F, -0.8F, -7.0F, 10, 1, 1, 0.0F);
    barrelModel[10].setRotationPoint(14.0F, -23.0F, 0.0F);
    
    translateAll(-3.0F, 0.0F, 0.0F);
    
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
