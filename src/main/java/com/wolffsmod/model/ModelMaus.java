package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelMaus
  extends ModelVehicle {
  int textureX = 1000;
  int textureY = 1000;

  
  public ModelMaus() {
    bodyModel = new ModelRendererTurbo[149];
    
    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, 1000, 1000);
    bodyModel[0].addShapeBox(0.0F, 0.0F, -8.0F, 143, 10, 16, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[0].setRotationPoint(-72.0F, -9.0F, 0.0F);
    
    bodyModel[1] = new ModelRendererTurbo(this, 0, 35, 1000, 1000);
    bodyModel[1].addShapeBox(0.0F, 0.0F, -8.0F, 16, 14, 16, 0.0F, 0.0F, 0.0F, 0.0F, -15.9F, 0.0F, 0.0F, -15.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(53.0F, -23.0F, 0.0F);
    
    bodyModel[2] = new ModelRendererTurbo(this, 0, 115, 1000, 1000);
    bodyModel[2].addBox(0.0F, 0.0F, -27.0F, 116, 2, 54, 0.0F);
    bodyModel[2].setRotationPoint(-62.0F, -24.0F, 0.0F);
    
    bodyModel[3] = new ModelRendererTurbo(this, 160, 35, 1000, 1000);
    bodyModel[3].addShapeBox(0.0F, 0.0F, -8.0F, 10, 13, 16, 0.0F, -9.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[3].setRotationPoint(-72.0F, -22.0F, 0.0F);
    
    bodyModel[4] = new ModelRendererTurbo(this, 0, 195, 1000, 1000);
    bodyModel[4].addShapeBox(0.0F, 0.0F, -1.0F, 10, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[4].setRotationPoint(62.0F, -9.0F, -7.0F);
    
    bodyModel[5] = new ModelRendererTurbo(this, 30, 195, 1000, 1000);
    bodyModel[5].addShapeBox(0.0F, 0.0F, 0.0F, 10, 10, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[5].setRotationPoint(62.0F, -9.0F, 7.0F);
    
    bodyModel[6] = new ModelRendererTurbo(this, 60, 195, 1000, 1000);
    bodyModel[6].addBox(-2.0F, 0.0F, 0.0F, 2, 5, 21, 0.0F);
    bodyModel[6].setRotationPoint(71.0F, -9.0F, -29.0F);
    (bodyModel[6]).rotateAngleZ = 0.1919862F;
    
    bodyModel[7] = new ModelRendererTurbo(this, 115, 195, 1000, 1000);
    bodyModel[7].addBox(-2.0F, 0.0F, -21.0F, 2, 5, 21, 0.0F);
    bodyModel[7].setRotationPoint(71.0F, -9.0F, 29.0F);
    (bodyModel[7]).rotateAngleZ = 0.1919862F;
    
    bodyModel[8] = new ModelRendererTurbo(this, 0, 225, 1000, 1000);
    bodyModel[8].addShapeBox(0.0F, 0.0F, -2.0F, 125, 13, 2, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[8].setRotationPoint(-72.0F, -22.0F, -27.0F);
    
    bodyModel[9] = new ModelRendererTurbo(this, 0, 260, 1000, 1000);
    bodyModel[9].addShapeBox(0.0F, 0.0F, 0.0F, 125, 13, 2, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -11.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[9].setRotationPoint(-72.0F, -22.0F, 27.0F);
    
    bodyModel[10] = new ModelRendererTurbo(this, 340, 0, 1000, 1000);
    bodyModel[10].addShapeBox(0.0F, -0.3F, -29.0F, 2, 23, 58, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, -1.5F, 0.0F, -0.3F, -1.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[10].setRotationPoint(53.0F, -23.0F, 0.0F);
    (bodyModel[10]).rotateAngleZ = 0.826937F;
    
    bodyModel[11] = new ModelRendererTurbo(this, 170, 190, 1000, 1000);
    bodyModel[11].addShapeBox(0.0F, 0.0F, -2.0F, 17, 19, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, -14.8F, 0.0F, -0.8F, -14.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[11].setRotationPoint(53.0F, -23.0F, -27.0F);
    
    bodyModel[12] = new ModelRendererTurbo(this, 215, 190, 1000, 1000);
    bodyModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 17, 19, 2, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, -14.8F, 0.0F, -0.8F, -14.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[12].setRotationPoint(53.0F, -23.0F, 27.0F);
    
    bodyModel[13] = new ModelRendererTurbo(this, 0, 315, 1000, 1000);
    bodyModel[13].addShapeBox(0.0F, 0.0F, -2.0F, 125, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[13].setRotationPoint(-72.0F, -9.0F, -27.0F);
    
    bodyModel[14] = new ModelRendererTurbo(this, 0, 290, 1000, 1000);
    bodyModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 125, 10, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[14].setRotationPoint(-72.0F, -9.0F, 27.0F);
    
    bodyModel[15] = new ModelRendererTurbo(this, 300, 195, 1000, 1000);
    bodyModel[15].addShapeBox(0.0F, -0.1F, -29.0F, 2, 18, 58, 0.0F, 0.0F, -0.1F, -1.5F, 0.05F, -1.0F, 0.0F, 0.05F, -1.0F, 0.0F, 0.0F, -0.1F, -1.5F, 0.0F, -1.5F, -1.5F, 0.05F, 0.0F, 0.0F, 0.05F, 0.0F, 0.0F, 0.0F, -1.5F, -1.5F);
    bodyModel[15].setRotationPoint(-62.0F, -24.0F, 0.0F);
    (bodyModel[15]).rotateAngleZ = -0.7016224F;
    
    bodyModel[16] = new ModelRendererTurbo(this, 0, 340, 1000, 1000);
    bodyModel[16].addShapeBox(0.0F, 0.0F, -2.0F, 116, 2, 2, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[16].setRotationPoint(-62.0F, -24.0F, -27.0F);
    
    bodyModel[17] = new ModelRendererTurbo(this, 0, 350, 1000, 1000);
    bodyModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 116, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[17].setRotationPoint(-62.0F, -24.0F, 27.0F);
    
    bodyModel[18] = new ModelRendererTurbo(this, 0, 370, 1000, 1000);
    bodyModel[18].addBox(0.0F, -14.0F, -8.0F, 115, 13, 16, 0.0F);
    bodyModel[18].setRotationPoint(-62.0F, -8.0F, 0.0F);
    
    bodyModel[19] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 2, 2, 19, 0.0F);
    bodyModel[19].setRotationPoint(38.0F, -3.0F, 8.0F);
    
    bodyModel[20] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 2, 2, 19, 0.0F);
    bodyModel[20].setRotationPoint(22.0F, -3.0F, 8.0F);
    
    bodyModel[21] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 2, 2, 19, 0.0F);
    bodyModel[21].setRotationPoint(6.0F, -3.0F, 8.0F);
    
    bodyModel[22] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 2, 2, 19, 0.0F);
    bodyModel[22].setRotationPoint(-10.0F, -3.0F, 8.0F);
    
    bodyModel[23] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 2, 2, 19, 0.0F);
    bodyModel[23].setRotationPoint(-26.0F, -3.0F, 8.0F);
    
    bodyModel[24] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 2, 2, 19, 0.0F);
    bodyModel[24].setRotationPoint(-42.0F, -3.0F, 8.0F);
    
    bodyModel[25] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[25].setRotationPoint(38.0F, -3.0F, 13.0F);
    
    bodyModel[26] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[26].setRotationPoint(38.0F, -3.0F, 22.0F);
    
    bodyModel[27] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[27].setRotationPoint(22.0F, -3.0F, 13.0F);
    
    bodyModel[28] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[28].setRotationPoint(22.0F, -3.0F, 22.0F);
    
    bodyModel[29] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[29].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[29].setRotationPoint(6.0F, -3.0F, 13.0F);
    
    bodyModel[30] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[30].setRotationPoint(6.0F, -3.0F, 22.0F);
    
    bodyModel[31] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[31].setRotationPoint(-10.0F, -3.0F, 13.0F);
    
    bodyModel[32] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[32].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[32].setRotationPoint(-10.0F, -3.0F, 22.0F);
    
    bodyModel[33] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[33].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[33].setRotationPoint(-26.0F, -3.0F, 13.0F);
    
    bodyModel[34] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[34].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[34].setRotationPoint(-26.0F, -3.0F, 22.0F);
    
    bodyModel[35] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[35].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[35].setRotationPoint(-42.0F, -3.0F, 13.0F);
    
    bodyModel[36] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[36].addBox(0.0F, 0.0F, 0.0F, 2, 4, 1, 0.0F);
    bodyModel[36].setRotationPoint(-42.0F, -3.0F, 22.0F);
    
    bodyModel[37] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[37].addBox(-4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[37].setRotationPoint(40.0F, -3.0F, 15.5F);
    (bodyModel[37]).rotateAngleZ = -0.4363323F;
    
    bodyModel[38] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[38].addBox(-4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[38].setRotationPoint(24.0F, -3.0F, 15.5F);
    (bodyModel[38]).rotateAngleZ = -0.4363323F;
    
    bodyModel[39] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[39].addBox(-4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[39].setRotationPoint(8.0F, -3.0F, 15.5F);
    (bodyModel[39]).rotateAngleZ = -0.4363323F;
    
    bodyModel[40] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[40].addBox(-4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[40].setRotationPoint(-8.0F, -3.0F, 15.5F);
    (bodyModel[40]).rotateAngleZ = -0.4363323F;
    
    bodyModel[41] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[41].addBox(-4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[41].setRotationPoint(-24.0F, -3.0F, 15.5F);
    (bodyModel[41]).rotateAngleZ = -0.4363323F;
    
    bodyModel[42] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[42].addBox(-4.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[42].setRotationPoint(-40.0F, -3.0F, 15.5F);
    (bodyModel[42]).rotateAngleZ = -0.4363323F;
    
    bodyModel[43] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[43].addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[43].setRotationPoint(38.0F, -3.0F, 18.5F);
    (bodyModel[43]).rotateAngleZ = 0.4363323F;
    
    bodyModel[44] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[44].addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[44].setRotationPoint(22.0F, -3.0F, 18.5F);
    (bodyModel[44]).rotateAngleZ = 0.4363323F;
    
    bodyModel[45] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[45].addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[45].setRotationPoint(6.0F, -3.0F, 18.5F);
    (bodyModel[45]).rotateAngleZ = 0.4363323F;
    
    bodyModel[46] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[46].addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[46].setRotationPoint(-10.0F, -3.0F, 18.5F);
    (bodyModel[46]).rotateAngleZ = 0.4363323F;
    
    bodyModel[47] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[47].addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[47].setRotationPoint(-26.0F, -3.0F, 18.5F);
    (bodyModel[47]).rotateAngleZ = 0.4363323F;
    
    bodyModel[48] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[48].addBox(0.0F, 0.0F, 0.0F, 4, 2, 1, 0.0F);
    bodyModel[48].setRotationPoint(-42.0F, -3.0F, 18.5F);
    (bodyModel[48]).rotateAngleZ = 0.4363323F;
    
    bodyModel[49] = new ModelRendererTurbo(this, 80, 75, 1000, 1000);
    bodyModel[49].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 19, 0.0F);
    bodyModel[49].setRotationPoint(61.0F, -3.0F, 8.0F);
    
    bodyModel[50] = new ModelRendererTurbo(this, 80, 75, 1000, 1000);
    bodyModel[50].addBox(-2.0F, -2.0F, 0.0F, 4, 4, 19, 0.0F);
    bodyModel[50].setRotationPoint(-64.0F, -3.0F, 8.0F);
    
    bodyModel[51] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[51].addBox(0.0F, 0.0F, -19.0F, 2, 2, 19, 0.0F);
    bodyModel[51].setRotationPoint(38.0F, -3.0F, -8.0F);
    
    bodyModel[52] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[52].addBox(0.0F, 0.0F, -19.0F, 2, 2, 19, 0.0F);
    bodyModel[52].setRotationPoint(22.0F, -3.0F, -8.0F);
    
    bodyModel[53] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[53].addBox(0.0F, 0.0F, -19.0F, 2, 2, 19, 0.0F);
    bodyModel[53].setRotationPoint(6.0F, -3.0F, -8.0F);
    
    bodyModel[54] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[54].addBox(0.0F, 0.0F, -19.0F, 2, 2, 19, 0.0F);
    bodyModel[54].setRotationPoint(-10.0F, -3.0F, -8.0F);
    
    bodyModel[55] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[55].addBox(0.0F, 0.0F, -19.0F, 2, 2, 19, 0.0F);
    bodyModel[55].setRotationPoint(-26.0F, -3.0F, -8.0F);
    
    bodyModel[56] = new ModelRendererTurbo(this, 0, 75, 1000, 1000);
    bodyModel[56].addBox(0.0F, 0.0F, -19.0F, 2, 2, 19, 0.0F);
    bodyModel[56].setRotationPoint(-42.0F, -3.0F, -8.0F);
    
    bodyModel[57] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[57].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[57].setRotationPoint(38.0F, -3.0F, -13.0F);
    
    bodyModel[58] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[58].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[58].setRotationPoint(38.0F, -3.0F, -22.0F);
    
    bodyModel[59] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[59].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[59].setRotationPoint(22.0F, -3.0F, -13.0F);
    
    bodyModel[60] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[60].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[60].setRotationPoint(22.0F, -3.0F, -22.0F);
    
    bodyModel[61] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[61].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[61].setRotationPoint(6.0F, -3.0F, -13.0F);
    
    bodyModel[62] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[62].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[62].setRotationPoint(6.0F, -3.0F, -22.0F);
    
    bodyModel[63] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[63].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[63].setRotationPoint(-10.0F, -3.0F, -13.0F);
    
    bodyModel[64] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[64].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[64].setRotationPoint(-10.0F, -3.0F, -22.0F);
    
    bodyModel[65] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[65].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[65].setRotationPoint(-26.0F, -3.0F, -13.0F);
    
    bodyModel[66] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[66].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[66].setRotationPoint(-26.0F, -3.0F, -22.0F);
    
    bodyModel[67] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[67].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[67].setRotationPoint(-42.0F, -3.0F, -13.0F);
    
    bodyModel[68] = new ModelRendererTurbo(this, 50, 75, 1000, 1000);
    bodyModel[68].addBox(0.0F, 0.0F, -1.0F, 2, 4, 1, 0.0F);
    bodyModel[68].setRotationPoint(-42.0F, -3.0F, -22.0F);
    
    bodyModel[69] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[69].addBox(-4.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[69].setRotationPoint(40.0F, -3.0F, -15.5F);
    (bodyModel[69]).rotateAngleZ = -0.4363323F;
    
    bodyModel[70] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[70].addBox(-4.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[70].setRotationPoint(24.0F, -3.0F, -15.5F);
    (bodyModel[70]).rotateAngleZ = -0.4363323F;
    
    bodyModel[71] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[71].addBox(-4.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[71].setRotationPoint(8.0F, -3.0F, -15.5F);
    (bodyModel[71]).rotateAngleZ = -0.4363323F;
    
    bodyModel[72] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[72].addBox(-4.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[72].setRotationPoint(-8.0F, -3.0F, -15.5F);
    (bodyModel[72]).rotateAngleZ = -0.4363323F;
    
    bodyModel[73] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[73].addBox(-4.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[73].setRotationPoint(-24.0F, -3.0F, -15.5F);
    (bodyModel[73]).rotateAngleZ = -0.4363323F;
    
    bodyModel[74] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[74].addBox(-4.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[74].setRotationPoint(-40.0F, -3.0F, -15.5F);
    (bodyModel[74]).rotateAngleZ = -0.4363323F;
    
    bodyModel[75] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[75].addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[75].setRotationPoint(38.0F, -3.0F, -18.5F);
    (bodyModel[75]).rotateAngleZ = 0.4363323F;
    
    bodyModel[76] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[76].addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[76].setRotationPoint(22.0F, -3.0F, -18.5F);
    (bodyModel[76]).rotateAngleZ = 0.4363323F;
    
    bodyModel[77] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[77].addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[77].setRotationPoint(6.0F, -3.0F, -18.5F);
    (bodyModel[77]).rotateAngleZ = 0.4363323F;
    
    bodyModel[78] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[78].addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[78].setRotationPoint(-10.0F, -3.0F, -18.5F);
    (bodyModel[78]).rotateAngleZ = 0.4363323F;
    
    bodyModel[79] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[79].addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[79].setRotationPoint(-26.0F, -3.0F, -18.5F);
    (bodyModel[79]).rotateAngleZ = 0.4363323F;
    
    bodyModel[80] = new ModelRendererTurbo(this, 20, 103, 1000, 1000);
    bodyModel[80].addBox(0.0F, 0.0F, -1.0F, 4, 2, 1, 0.0F);
    bodyModel[80].setRotationPoint(-42.0F, -3.0F, -18.5F);
    (bodyModel[80]).rotateAngleZ = 0.4363323F;
    
    bodyModel[81] = new ModelRendererTurbo(this, 80, 75, 1000, 1000);
    bodyModel[81].addBox(-2.0F, -2.0F, -19.0F, 4, 4, 19, 0.0F);
    bodyModel[81].setRotationPoint(61.0F, -3.0F, -8.0F);
    
    bodyModel[82] = new ModelRendererTurbo(this, 80, 75, 1000, 1000);
    bodyModel[82].addBox(-2.0F, -2.0F, -19.0F, 4, 4, 19, 0.0F);
    bodyModel[82].setRotationPoint(-64.0F, -3.0F, -8.0F);
    
    bodyModel[83] = new ModelRendererTurbo(this, 125, 50, 1000, 1000);
    bodyModel[83].addShapeBox(0.0F, 0.0F, 0.0F, 6, 3, 8, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[83].setRotationPoint(28.0F, -27.0F, 0.0F);
    
    bodyModel[84] = new ModelRendererTurbo(this, 125, 30, 1000, 1000);
    bodyModel[84].addShapeBox(0.0F, 0.0F, -8.0F, 6, 3, 8, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
    bodyModel[84].setRotationPoint(28.0F, -27.0F, 0.0F);
    
    bodyModel[85] = new ModelRendererTurbo(this, 350, 100, 1000, 1000);
    bodyModel[85].addShapeBox(0.0F, 0.0F, 0.0F, 15, 3, 8, 0.0F, -12.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -14.0F, -2.0F, 0.0F, -1.0F, -2.0F, -0.5F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F);
    bodyModel[85].setRotationPoint(16.0F, -27.0F, 8.0F);
    
    bodyModel[86] = new ModelRendererTurbo(this, 350, 120, 1000, 1000);
    bodyModel[86].addShapeBox(0.0F, 0.0F, -8.0F, 15, 3, 8, 0.0F, -1.0F, -2.0F, -0.5F, -14.0F, -2.0F, 0.0F, -2.0F, 0.0F, 0.0F, -12.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -14.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -14.0F, 0.0F, 0.0F);
    bodyModel[86].setRotationPoint(16.0F, -27.0F, -8.0F);
    
    bodyModel[87] = new ModelRendererTurbo(this, 350, 140, 1000, 1000);
    bodyModel[87].addShapeBox(0.0F, 0.0F, 0.0F, 3, 3, 5, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[87].setRotationPoint(37.0F, -27.0F, 14.0F);
    
    bodyModel[88] = new ModelRendererTurbo(this, 385, 140, 1000, 1000);
    bodyModel[88].addShapeBox(0.0F, 0.0F, 0.0F, 5, 3, 8, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -4.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[88].setRotationPoint(35.0F, -27.0F, 19.0F);
    
    bodyModel[89] = new ModelRendererTurbo(this, 430, 140, 1000, 1000);
    bodyModel[89].addShapeBox(0.0F, 0.0F, 0.0F, 8, 3, 3, 0.0F, 0.0F, -2.0F, -2.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[89].setRotationPoint(32.0F, -27.0F, 14.0F);
    
    bodyModel[90] = new ModelRendererTurbo(this, 350, 165, 1000, 1000);
    bodyModel[90].addShapeBox(0.0F, 0.0F, -5.0F, 3, 3, 5, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[90].setRotationPoint(37.0F, -27.0F, -14.0F);
    
    bodyModel[91] = new ModelRendererTurbo(this, 385, 165, 1000, 1000);
    bodyModel[91].addShapeBox(0.0F, 0.0F, -8.0F, 5, 3, 8, 0.0F, 0.0F, -2.0F, 0.0F, -4.0F, -2.0F, 0.0F, -2.0F, 0.0F, 1.0F, -2.0F, 0.0F, 1.0F, -1.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
    bodyModel[91].setRotationPoint(35.0F, -27.0F, -19.0F);
    
    bodyModel[92] = new ModelRendererTurbo(this, 430, 165, 1000, 1000);
    bodyModel[92].addShapeBox(0.0F, 0.0F, -3.0F, 8, 3, 3, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[92].setRotationPoint(32.0F, -27.0F, -14.0F);
    
    bodyModel[93] = new ModelRendererTurbo(this, 300, 280, 1000, 1000);
    bodyModel[93].addShape3D(0.0F, -1.0F, -7.5F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(9.0D, 2.0D, 9, 2), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(7.0D, 15.0D, 7, 15), new Coord2D(2.0D, 15.0D, 2, 15), new Coord2D(0.0D, 13.0D, 0, 13), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(2.0D, 0.0D, 2, 0) }), 1.0F, 9, 15, 46, 1, 4, new float[] { 2.0F, 3.0F, 11.0F, 3.0F, 5.0F, 3.0F, 11.0F, 3.0F, 5.0F });
    bodyModel[93].setRotationPoint(41.0F, -24.5F, 0.0F);
    
    bodyModel[94] = new ModelRendererTurbo(this, 370, 280, 1000, 1000);
    bodyModel[94].addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
    bodyModel[94].setRotationPoint(39.0F, -25.0F, -5.0F);
    
    bodyModel[95] = new ModelRendererTurbo(this, 370, 280, 1000, 1000);
    bodyModel[95].addBox(0.0F, 0.0F, -2.0F, 4, 1, 2, 0.0F);
    bodyModel[95].setRotationPoint(39.0F, -25.0F, 5.0F);
    
    bodyModel[96] = new ModelRendererTurbo(this, 395, 280, 1000, 1000);
    bodyModel[96].addBox(0.0F, 0.0F, 0.0F, 3, 1, 6, 0.0F);
    bodyModel[96].setRotationPoint(50.5F, -24.5F, 0.0F);
    
    bodyModel[97] = new ModelRendererTurbo(this, 420, 280, 1000, 1000);
    bodyModel[97].addBox(0.0F, 0.0F, 0.0F, 2, 3, 5, 0.0F);
    bodyModel[97].setRotationPoint(51.0F, -25.5F, 0.5F);
    
    bodyModel[98] = new ModelRendererTurbo(this, 295, 310, 1000, 1000);
    bodyModel[98].addTrapezoid(0.0F, 0.0F, 0.0F, 4, 1, 4, 0.0F, -0.5F, 4);
    bodyModel[98].setRotationPoint(48.0F, -25.0F, -12.0F);
    
    bodyModel[99] = new ModelRendererTurbo(this, 295, 330, 1000, 1000);
    bodyModel[99].addShape3D(0.0F, -1.0F, -5.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(1.0D, 0.0D, 1, 0) }), 1.0F, 5, 5, 20, 1, 4, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    bodyModel[99].setRotationPoint(30.0F, -25.0F, -23.0F);
    
    bodyModel[100] = new ModelRendererTurbo(this, 295, 360, 1000, 1000);
    bodyModel[100].addShape3D(0.0F, -1.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(1.0D, 0.0D, 1, 0) }), 1.0F, 5, 5, 20, 1, 4, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    bodyModel[100].setRotationPoint(30.0F, -25.0F, 23.0F);
    
    bodyModel[101] = new ModelRendererTurbo(this, 295, 380, 1000, 1000);
    bodyModel[101].addShape3D(0.0F, -1.0F, -6.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(6.0D, 2.0D, 6, 2), new Coord2D(6.0D, 4.0D, 6, 4), new Coord2D(4.0D, 6.0D, 4, 6), new Coord2D(2.0D, 6.0D, 2, 6), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 2.0D, 0, 2) }), 1.0F, 6, 6, 20, 1, 4, new float[] { 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F });
    bodyModel[101].setRotationPoint(32.0F, -25.0F, 7.0F);
    
    bodyModel[102] = new ModelRendererTurbo(this, 345, 310, 1000, 1000);
    bodyModel[102].addShapeBox(0.0F, 0.0F, 0.0F, 3, 2, 3, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[102].setRotationPoint(15.0F, -25.5F, 23.0F);
    
    bodyModel[103] = new ModelRendererTurbo(this, 345, 310, 1000, 1000);
    bodyModel[103].addShapeBox(0.0F, 0.0F, -3.0F, 3, 2, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[103].setRotationPoint(15.0F, -25.5F, -23.0F);
    
    bodyModel[104] = new ModelRendererTurbo(this, 380, 310, 1000, 1000);
    bodyModel[104].addBox(0.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
    bodyModel[104].setRotationPoint(15.0F, -25.5F, 26.0F);
    
    bodyModel[105] = new ModelRendererTurbo(this, 380, 310, 1000, 1000);
    bodyModel[105].addBox(0.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F);
    bodyModel[105].setRotationPoint(15.0F, -25.5F, -26.0F);
    
    bodyModel[106] = new ModelRendererTurbo(this, 415, 310, 1000, 1000);
    bodyModel[106].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
    bodyModel[106].setRotationPoint(61.0F, -20.0F, 22.0F);
    
    bodyModel[107] = new ModelRendererTurbo(this, 430, 310, 1000, 1000);
    bodyModel[107].addBox(0.0F, 0.0F, -3.0F, 1, 3, 3, 0.0F);
    bodyModel[107].setRotationPoint(61.0F, -20.0F, -22.0F);
    
    bodyModel[108] = new ModelRendererTurbo(this, 450, 310, 1000, 1000);
    bodyModel[108].addBox(0.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F);
    bodyModel[108].setRotationPoint(60.5F, -19.5F, -23.5F);
    
    bodyModel[109] = new ModelRendererTurbo(this, 450, 310, 1000, 1000);
    bodyModel[109].addBox(0.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F);
    bodyModel[109].setRotationPoint(60.5F, -19.5F, 23.5F);
    
    bodyModel[110] = new ModelRendererTurbo(this, 471, 310, 1000, 1000);
    bodyModel[110].addBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F);
    bodyModel[110].setRotationPoint(-69.0F, -19.0F, 20.0F);
    
    bodyModel[111] = new ModelRendererTurbo(this, 350, 330, 1000, 1000);
    bodyModel[111].addBox(-2.0F, 0.0F, -1.5F, 2, 3, 3, 0.0F);
    bodyModel[111].setRotationPoint(-62.0F, -24.0F, 0.0F);
    (bodyModel[111]).rotateAngleZ = -0.7016224F;
    
    bodyModel[112] = new ModelRendererTurbo(this, 375, 330, 1000, 1000);
    bodyModel[112].addShapeBox(-3.0F, 2.0F, 0.0F, 3, 5, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[112].setRotationPoint(-62.0F, -24.0F, 7.0F);
    (bodyModel[112]).rotateAngleZ = -0.7016224F;
    
    bodyModel[113] = new ModelRendererTurbo(this, 375, 330, 1000, 1000);
    bodyModel[113].addShapeBox(-3.0F, 2.0F, -1.0F, 3, 5, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[113].setRotationPoint(-62.0F, -24.0F, -7.0F);
    (bodyModel[113]).rotateAngleZ = -0.7016224F;
    
    bodyModel[114] = new ModelRendererTurbo(this, 400, 330, 1000, 1000);
    bodyModel[114].addShapeBox(-3.0F, 11.0F, 0.0F, 3, 5, 1, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    bodyModel[114].setRotationPoint(-62.0F, -24.0F, 7.0F);
    (bodyModel[114]).rotateAngleZ = -0.7016224F;
    
    bodyModel[115] = new ModelRendererTurbo(this, 400, 330, 1000, 1000);
    bodyModel[115].addShapeBox(-3.0F, 11.0F, -1.0F, 3, 5, 1, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    bodyModel[115].setRotationPoint(-62.0F, -24.0F, -7.0F);
    (bodyModel[115]).rotateAngleZ = -0.7016224F;
    
    bodyModel[116] = new ModelRendererTurbo(this, 400, 345, 1000, 1000);
    bodyModel[116].addBox(-1.0F, 7.0F, 0.0F, 1, 4, 1, 0.0F);
    bodyModel[116].setRotationPoint(-62.0F, -24.0F, 7.0F);
    (bodyModel[116]).rotateAngleZ = -0.7016224F;
    
    bodyModel[117] = new ModelRendererTurbo(this, 400, 345, 1000, 1000);
    bodyModel[117].addBox(-1.0F, 7.0F, -1.0F, 1, 4, 1, 0.0F);
    bodyModel[117].setRotationPoint(-62.0F, -24.0F, -7.0F);
    (bodyModel[117]).rotateAngleZ = -0.7016224F;
    
    bodyModel[118] = new ModelRendererTurbo(this, 420, 330, 1000, 1000);
    bodyModel[118].addShapeBox(0.0F, 0.0F, 0.0F, 15, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
    bodyModel[118].setRotationPoint(-69.0F, 1.0F, 27.0F);
    
    bodyModel[119] = new ModelRendererTurbo(this, 470, 330, 1000, 1000);
    bodyModel[119].addShapeBox(0.0F, 0.0F, -2.0F, 15, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F);
    bodyModel[119].setRotationPoint(-69.0F, 1.0F, -27.0F);
    
    bodyModel[120] = new ModelRendererTurbo(this, 350, 360, 1000, 1000);
    bodyModel[120].addBox(0.0F, -2.0F, 0.0F, 1, 3, 1, 0.0F);
    bodyModel[120].setRotationPoint(30.0F, -24.0F, 24.0F);
    (bodyModel[120]).rotateAngleZ = 0.2617994F;
    
    bodyModel[121] = new ModelRendererTurbo(this, 350, 360, 1000, 1000);
    bodyModel[121].addBox(0.0F, -2.0F, -1.0F, 1, 3, 1, 0.0F);
    bodyModel[121].setRotationPoint(30.0F, -24.0F, -24.0F);
    (bodyModel[121]).rotateAngleZ = 0.2617994F;
    
    bodyModel[122] = new ModelRendererTurbo(this, 375, 360, 1000, 1000);
    bodyModel[122].addShapeBox(0.0F, -50.0F, 0.0F, 1, 50, 1, 0.0F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F);
    bodyModel[122].setRotationPoint(30.0F, -24.0F, 24.0F);
    (bodyModel[122]).rotateAngleZ = 0.2617994F;
    
    bodyModel[123] = new ModelRendererTurbo(this, 375, 360, 1000, 1000);
    bodyModel[123].addShapeBox(0.0F, -50.0F, -1.0F, 1, 50, 1, 0.0F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F);
    bodyModel[123].setRotationPoint(30.0F, -24.0F, -24.0F);
    (bodyModel[123]).rotateAngleZ = 0.2617994F;
    
    bodyModel[124] = new ModelRendererTurbo(this, 420, 350, 1000, 1000);
    bodyModel[124].addShapeBox(0.0F, 0.0F, 0.0F, 17, 2, 2, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[124].setRotationPoint(-71.0F, 1.0F, 6.0F);
    
    bodyModel[125] = new ModelRendererTurbo(this, 470, 350, 1000, 1000);
    bodyModel[125].addShapeBox(0.0F, 0.0F, -2.0F, 17, 2, 2, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[125].setRotationPoint(-71.0F, 1.0F, -6.0F);
    
    bodyModel[126] = new ModelRendererTurbo(this, 520, 350, 1000, 1000);
    bodyModel[126].addBox(-2.0F, 2.0F, 0.0F, 4, 3, 1, 0.0F);
    bodyModel[126].setRotationPoint(71.0F, -9.0F, -5.0F);
    (bodyModel[126]).rotateAngleZ = -0.6283185F;
    
    bodyModel[127] = new ModelRendererTurbo(this, 545, 350, 1000, 1000);
    bodyModel[127].addBox(-2.0F, 2.0F, -1.0F, 4, 3, 1, 0.0F);
    bodyModel[127].setRotationPoint(71.0F, -9.0F, 5.0F);
    (bodyModel[127]).rotateAngleZ = -0.6283185F;
    
    bodyModel[128] = new ModelRendererTurbo(this, 570, 350, 1000, 1000);
    bodyModel[128].addBox(-2.0F, 4.0F, -0.5F, 4, 3, 1, 0.0F);
    bodyModel[128].setRotationPoint(-72.0F, -9.0F, 0.0F);
    (bodyModel[128]).rotateAngleZ = 0.2792527F;
    
    bodyModel[129] = new ModelRendererTurbo(this, 265, 35, 1000, 1000);
    bodyModel[129].addShapeBox(0.0F, 0.0F, 0.0F, 17, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[129].setRotationPoint(53.0F, -4.0F, 27.0F);
    
    bodyModel[130] = new ModelRendererTurbo(this, 265, 35, 1000, 1000);
    bodyModel[130].addShapeBox(0.0F, 0.0F, -2.0F, 17, 5, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[130].setRotationPoint(53.0F, -4.0F, -27.0F);
    
    bodyModel[131] = new ModelRendererTurbo(this, 220, 55, 1000, 1000);
    bodyModel[131].addShapeBox(-4.0F, 0.0F, 0.0F, 4, 10, 2, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.0F, 0.0F);
    bodyModel[131].setRotationPoint(-72.0F, -9.0F, 6.0F);
    (bodyModel[131]).rotateAngleZ = 0.2792527F;
    
    bodyModel[132] = new ModelRendererTurbo(this, 245, 55, 1000, 1000);
    bodyModel[132].addShapeBox(-4.0F, 0.0F, -2.0F, 4, 10, 2, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F, 0.0F, 0.0F, -3.0F, 0.0F);
    bodyModel[132].setRotationPoint(-72.0F, -9.0F, -6.0F);
    (bodyModel[132]).rotateAngleZ = 0.2792527F;
    
    bodyModel[133] = new ModelRendererTurbo(this, 75, 515, 1000, 1000);
    bodyModel[133].addShapeBox(0.0F, 0.0F, 0.0F, 11, 3, 1, 0.0F, 0.0F, -2.0F, 0.0F, -2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[133].setRotationPoint(22.0F, -27.0F, 2.0F);
    
    bodyModel[134] = new ModelRendererTurbo(this, 75, 530, 1000, 1000);
    bodyModel[134].addShapeBox(0.0F, 0.0F, -1.0F, 11, 3, 1, 0.0F, 0.0F, -2.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[134].setRotationPoint(22.0F, -27.0F, -2.0F);
    
    bodyModel[135] = new ModelRendererTurbo(this, 130, 530, 1000, 1000);
    bodyModel[135].addShapeBox(0.0F, 0.0F, 0.0F, 11, 3, 1, 0.0F, 0.0F, -2.0F, 0.0F, -4.5F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[135].setRotationPoint(22.0F, -27.0F, 7.0F);
    
    bodyModel[136] = new ModelRendererTurbo(this, 130, 515, 1000, 1000);
    bodyModel[136].addShapeBox(0.0F, 0.0F, -1.0F, 11, 3, 1, 0.0F, 0.0F, -2.0F, 0.0F, -5.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[136].setRotationPoint(22.0F, -27.0F, -7.0F);
    
    bodyModel[137] = new ModelRendererTurbo(this, 180, 515, 1000, 1000);
    bodyModel[137].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[137].setRotationPoint(17.0F, -25.0F, 2.0F);
    
    bodyModel[138] = new ModelRendererTurbo(this, 180, 530, 1000, 1000);
    bodyModel[138].addShapeBox(0.0F, 0.0F, -1.0F, 5, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[138].setRotationPoint(17.0F, -25.0F, -2.0F);
    
    bodyModel[139] = new ModelRendererTurbo(this, 205, 515, 1000, 1000);
    bodyModel[139].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[139].setRotationPoint(17.0F, -25.0F, 7.0F);
    
    bodyModel[140] = new ModelRendererTurbo(this, 205, 530, 1000, 1000);
    bodyModel[140].addShapeBox(0.0F, 0.0F, -1.0F, 5, 1, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[140].setRotationPoint(17.0F, -25.0F, -7.0F);
    
    bodyModel[141] = new ModelRendererTurbo(this, 240, 515, 1000, 1000);
    bodyModel[141].addShapeBox(0.0F, 0.0F, 0.0F, 7, 2, 1, 0.0F, 0.0F, -1.9F, 0.0F, -0.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[141].setRotationPoint(19.0F, -26.0F, 10.0F);
    
    bodyModel[142] = new ModelRendererTurbo(this, 240, 530, 1000, 1000);
    bodyModel[142].addShapeBox(0.0F, 0.0F, -1.0F, 7, 2, 1, 0.0F, 0.0F, -1.9F, 0.0F, -1.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[142].setRotationPoint(19.0F, -26.0F, -10.0F);
    
    bodyModel[143] = new ModelRendererTurbo(this, 280, 515, 1000, 1000);
    bodyModel[143].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 14, 0.0F, -1.0F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, -1.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[143].setRotationPoint(18.0F, -25.0F, 0.0F);
    
    bodyModel[144] = new ModelRendererTurbo(this, 280, 515, 1000, 1000);
    bodyModel[144].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 14, 0.0F, -1.0F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, -1.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[144].setRotationPoint(20.0F, -25.0F, 0.0F);
    
    bodyModel[145] = new ModelRendererTurbo(this, 280, 515, 1000, 1000);
    bodyModel[145].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 14, 0.0F, -1.0F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, -1.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[145].setRotationPoint(22.0F, -25.0F, 0.0F);
    
    bodyModel[146] = new ModelRendererTurbo(this, 280, 515, 1000, 1000);
    bodyModel[146].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 14, 0.0F, -1.0F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, -1.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[146].setRotationPoint(24.0F, -25.0F, 0.0F);
    
    bodyModel[147] = new ModelRendererTurbo(this, 280, 515, 1000, 1000);
    bodyModel[147].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 14, 0.0F, -1.0F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, -1.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[147].setRotationPoint(26.0F, -25.0F, 0.0F);
    
    bodyModel[148] = new ModelRendererTurbo(this, 280, 515, 1000, 1000);
    bodyModel[148].addShapeBox(0.0F, 0.0F, -7.0F, 1, 1, 14, 0.0F, -1.0F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, 0.5F, -0.1F, 0.0F, -1.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[148].setRotationPoint(28.0F, -25.0F, 0.0F);

    
    leftTrackWheelModels = new ModelRendererTurbo[38];
    
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 410, 1000, 1000);
    leftTrackWheelModels[0].addShape3D(6.0F, -6.0F, -15.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 15.0F, 12, 12, 40, 15, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[0].setRotationPoint(61.0F, -3.0F, 10.0F);
    
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 515, 1000, 1000);
    leftTrackWheelModels[1].addShape3D(6.0F, -6.0F, -15.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 15.0F, 12, 12, 40, 15, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[1].setRotationPoint(-64.0F, -3.0F, 10.0F);
    
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[2].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[2].setRotationPoint(43.0F, 4.0F, 10.0F);
    
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[3].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[3].setRotationPoint(35.0F, 4.0F, 15.0F);
    
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[4].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[4].setRotationPoint(43.0F, 4.0F, 18.0F);
    
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[5].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[5].setRotationPoint(35.0F, 4.0F, 23.0F);
    
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[6].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[6].setRotationPoint(27.0F, 4.0F, 10.0F);
    
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[7].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[7].setRotationPoint(19.0F, 4.0F, 15.0F);
    
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[8].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[8].setRotationPoint(27.0F, 4.0F, 18.0F);
    
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[9].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[9].setRotationPoint(19.0F, 4.0F, 23.0F);
    
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[10].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[10].setRotationPoint(11.0F, 4.0F, 10.0F);
    
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[11].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[11].setRotationPoint(3.0F, 4.0F, 15.0F);
    
    leftTrackWheelModels[12] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[12].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[12].setRotationPoint(11.0F, 4.0F, 18.0F);
    
    leftTrackWheelModels[13] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[13].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[13].setRotationPoint(3.0F, 4.0F, 23.0F);
    
    leftTrackWheelModels[14] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[14].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[14].setRotationPoint(-5.0F, 4.0F, 10.0F);
    
    leftTrackWheelModels[15] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[15].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[15].setRotationPoint(-13.0F, 4.0F, 15.0F);
    
    leftTrackWheelModels[16] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[16].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[16].setRotationPoint(-5.0F, 4.0F, 18.0F);
    
    leftTrackWheelModels[17] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[17].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[17].setRotationPoint(-13.0F, 4.0F, 23.0F);
    
    leftTrackWheelModels[18] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[18].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[18].setRotationPoint(-21.0F, 4.0F, 10.0F);
    
    leftTrackWheelModels[19] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[19].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[19].setRotationPoint(-29.0F, 4.0F, 15.0F);
    
    leftTrackWheelModels[20] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[20].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[20].setRotationPoint(-21.0F, 4.0F, 18.0F);
    
    leftTrackWheelModels[21] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[21].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[21].setRotationPoint(-29.0F, 4.0F, 23.0F);
    
    leftTrackWheelModels[22] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[22].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[22].setRotationPoint(-37.0F, 4.0F, 10.0F);
    
    leftTrackWheelModels[23] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[23].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[23].setRotationPoint(-45.0F, 4.0F, 15.0F);
    
    leftTrackWheelModels[24] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[24].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[24].setRotationPoint(-37.0F, 4.0F, 18.0F);
    
    leftTrackWheelModels[25] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    leftTrackWheelModels[25].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[25].setRotationPoint(-45.0F, 4.0F, 23.0F);
    
    leftTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[26].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[26].setRotationPoint(42.0F, -4.0F, 18.0F);
    
    leftTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[27].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[27].setRotationPoint(36.0F, -4.0F, 15.0F);
    
    leftTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[28].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[28].setRotationPoint(26.0F, -4.0F, 18.0F);
    
    leftTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[29].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[29].setRotationPoint(20.0F, -4.0F, 15.0F);
    
    leftTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[30].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[30].setRotationPoint(10.0F, -4.0F, 18.0F);
    
    leftTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[31].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[31].setRotationPoint(4.0F, -4.0F, 15.0F);
    
    leftTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[32].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[32].setRotationPoint(-6.0F, -4.0F, 18.0F);
    
    leftTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[33].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[33].setRotationPoint(-12.0F, -4.0F, 15.0F);
    
    leftTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[34].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[34].setRotationPoint(-22.0F, -4.0F, 18.0F);
    
    leftTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[35].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[35].setRotationPoint(-28.0F, -4.0F, 15.0F);
    
    leftTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[36].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[36].setRotationPoint(-38.0F, -4.0F, 18.0F);
    
    leftTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    leftTrackWheelModels[37].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[37].setRotationPoint(-44.0F, -4.0F, 15.0F);
    
    leftTrackModel = new ModelRendererTurbo[38];
    
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 450, 1000, 1000);
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 6, 3, 17, 0.0F);
    leftTrackModel[0].setRotationPoint(58.0F, -11.0F, 9.0F);
    
    leftTrackModel[1] = new ModelRendererTurbo(this, 55, 450, 1000, 1000);
    leftTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 7, 3, 17, 0.0F);
    leftTrackModel[1].setRotationPoint(64.0F, -11.0F, 9.0F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2] = new ModelRendererTurbo(this, 110, 450, 1000, 1000);
    leftTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 3, 6, 17, 0.0F);
    leftTrackModel[2].setRotationPoint(66.0F, -6.0F, 9.0F);
    
    leftTrackModel[3] = new ModelRendererTurbo(this, 160, 450, 1000, 1000);
    leftTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 7, 3, 17, 0.0F);
    leftTrackModel[3].setRotationPoint(69.0F, 0.0F, 9.0F);
    (leftTrackModel[3]).rotateAngleZ = -2.356194F;
    
    leftTrackModel[4] = new ModelRendererTurbo(this, 500, 450, 1000, 1000);
    leftTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 19, 3, 17, 0.0F);
    leftTrackModel[4].setRotationPoint(64.0F, 5.0F, 9.0F);
    (leftTrackModel[4]).rotateAngleZ = -2.88852F;
    
    leftTrackModel[5] = new ModelRendererTurbo(this, 0, 485, 1000, 1000);
    leftTrackModel[5].addBox(0.0F, -3.0F, 0.0F, 95, 3, 17, 0.0F);
    leftTrackModel[5].setRotationPoint(-49.0F, 10.0F, 9.0F);
    
    leftTrackModel[6] = new ModelRendererTurbo(this, 217, 450, 1000, 1000);
    leftTrackModel[6].addBox(-19.0F, 0.0F, 0.0F, 19, 3, 17, 0.0F);
    leftTrackModel[6].setRotationPoint(-67.0F, 5.0F, 9.0F);
    (leftTrackModel[6]).rotateAngleZ = 2.88852F;
    
    leftTrackModel[7] = new ModelRendererTurbo(this, 295, 450, 1000, 1000);
    leftTrackModel[7].addBox(-7.0F, 0.0F, 0.0F, 7, 3, 17, 0.0F);
    leftTrackModel[7].setRotationPoint(-72.0F, 0.0F, 9.0F);
    (leftTrackModel[7]).rotateAngleZ = 2.356194F;
    
    leftTrackModel[8] = new ModelRendererTurbo(this, 350, 450, 1000, 1000);
    leftTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 3, 6, 17, 0.0F);
    leftTrackModel[8].setRotationPoint(-72.0F, -6.0F, 9.0F);
    
    leftTrackModel[9] = new ModelRendererTurbo(this, 400, 450, 1000, 1000);
    leftTrackModel[9].addBox(0.0F, -3.0F, 0.0F, 7, 3, 17, 0.0F);
    leftTrackModel[9].setRotationPoint(-67.0F, -11.0F, 9.0F);
    (leftTrackModel[9]).rotateAngleZ = -2.356194F;
    
    leftTrackModel[10] = new ModelRendererTurbo(this, 65, 410, 1000, 1000);
    leftTrackModel[10].addBox(-6.0F, 0.0F, 0.0F, 6, 3, 17, 0.0F);
    leftTrackModel[10].setRotationPoint(-61.0F, -11.0F, 9.0F);
    
    leftTrackModel[11] = new ModelRendererTurbo(this, 120, 410, 1000, 1000);
    leftTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 9, 3, 17, 0.0F);
    leftTrackModel[11].setRotationPoint(-61.0F, -11.0F, 9.0F);
    (leftTrackModel[11]).rotateAngleZ = -0.3839724F;
    
    leftTrackModel[12] = new ModelRendererTurbo(this, 250, 485, 1000, 1000);
    leftTrackModel[12].addBox(0.0F, -3.0F, 0.0F, 105, 3, 17, 0.0F);
    leftTrackModel[12].setRotationPoint(-54.0F, -5.0F, 9.0F);
    
    leftTrackModel[13] = new ModelRendererTurbo(this, 180, 410, 1000, 1000);
    leftTrackModel[13].addBox(-9.0F, 0.0F, 0.0F, 9, 3, 17, 0.0F);
    leftTrackModel[13].setRotationPoint(58.0F, -11.0F, 9.0F);
    (leftTrackModel[13]).rotateAngleZ = 0.3839724F;
    
    leftTrackModel[14] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[14].setRotationPoint(33.0F, 2.0F, 12.0F);
    
    leftTrackModel[15] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[15].setRotationPoint(33.0F, 2.0F, 12.0F);
    (leftTrackModel[15]).rotateAngleZ = 0.3141593F;
    
    leftTrackModel[16] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[16].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[16].setRotationPoint(17.0F, 2.0F, 12.0F);
    
    leftTrackModel[17] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[17].addBox(0.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[17].setRotationPoint(17.0F, 2.0F, 12.0F);
    (leftTrackModel[17]).rotateAngleZ = 0.3141593F;
    
    leftTrackModel[18] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[18].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[18].setRotationPoint(1.0F, 2.0F, 12.0F);
    
    leftTrackModel[19] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[19].addBox(0.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[19].setRotationPoint(1.0F, 2.0F, 12.0F);
    (leftTrackModel[19]).rotateAngleZ = 0.3141593F;
    
    leftTrackModel[20] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[20].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[20].setRotationPoint(-15.0F, 2.0F, 12.0F);
    
    leftTrackModel[21] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[21].addBox(0.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[21].setRotationPoint(-15.0F, 2.0F, 12.0F);
    (leftTrackModel[21]).rotateAngleZ = 0.3141593F;
    
    leftTrackModel[22] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[22].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[22].setRotationPoint(-31.0F, 2.0F, 12.0F);
    
    leftTrackModel[23] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[23].addBox(0.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[23].setRotationPoint(-31.0F, 2.0F, 12.0F);
    (leftTrackModel[23]).rotateAngleZ = 0.3141593F;
    
    leftTrackModel[24] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[24].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[24].setRotationPoint(-47.0F, 2.0F, 12.0F);
    
    leftTrackModel[25] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[25].addBox(0.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[25].setRotationPoint(-47.0F, 2.0F, 12.0F);
    (leftTrackModel[25]).rotateAngleZ = 0.3141593F;
    
    leftTrackModel[26] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[26].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[26].setRotationPoint(33.0F, 2.0F, 20.0F);
    
    leftTrackModel[27] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[27].addBox(-12.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[27].setRotationPoint(45.0F, 2.0F, 20.0F);
    (leftTrackModel[27]).rotateAngleZ = -0.3141593F;
    
    leftTrackModel[28] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[28].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[28].setRotationPoint(17.0F, 2.0F, 20.0F);
    
    leftTrackModel[29] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[29].addBox(-12.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[29].setRotationPoint(29.0F, 2.0F, 20.0F);
    (leftTrackModel[29]).rotateAngleZ = -0.3141593F;
    
    leftTrackModel[30] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[30].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[30].setRotationPoint(1.0F, 2.0F, 20.0F);
    
    leftTrackModel[31] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[31].addBox(-12.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[31].setRotationPoint(13.0F, 2.0F, 20.0F);
    (leftTrackModel[31]).rotateAngleZ = -0.3141593F;
    
    leftTrackModel[32] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[32].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[32].setRotationPoint(-15.0F, 2.0F, 20.0F);
    
    leftTrackModel[33] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[33].addBox(-12.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[33].setRotationPoint(-3.0F, 2.0F, 20.0F);
    (leftTrackModel[33]).rotateAngleZ = -0.3141593F;
    
    leftTrackModel[34] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[34].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[34].setRotationPoint(-31.0F, 2.0F, 20.0F);
    
    leftTrackModel[35] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[35].addBox(-12.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[35].setRotationPoint(-19.0F, 2.0F, 20.0F);
    (leftTrackModel[35]).rotateAngleZ = -0.3141593F;
    
    leftTrackModel[36] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[36].addBox(0.0F, 0.0F, 0.0F, 12, 4, 3, 0.0F);
    leftTrackModel[36].setRotationPoint(-47.0F, 2.0F, 20.0F);
    
    leftTrackModel[37] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    leftTrackModel[37].addBox(-12.0F, 0.0F, 0.0F, 12, 2, 3, 0.0F);
    leftTrackModel[37].setRotationPoint(-35.0F, 2.0F, 20.0F);
    (leftTrackModel[37]).rotateAngleZ = -0.3141593F;
    
    rightTrackWheelModels = new ModelRendererTurbo[38];
    
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 410, 1000, 1000);
    rightTrackWheelModels[0].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 15.0F, 12, 12, 40, 15, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[0].setRotationPoint(61.0F, -3.0F, -10.0F);
    
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 515, 1000, 1000);
    rightTrackWheelModels[1].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 15.0F, 12, 12, 40, 15, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[1].setRotationPoint(-64.0F, -3.0F, -10.0F);
    
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[2].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[2].setRotationPoint(43.0F, 4.0F, -10.0F);
    
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[3].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[3].setRotationPoint(35.0F, 4.0F, -15.0F);
    
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[4].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[4].setRotationPoint(43.0F, 4.0F, -18.0F);
    
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[5].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[5].setRotationPoint(35.0F, 4.0F, -23.0F);
    
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[6].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[6].setRotationPoint(27.0F, 4.0F, -10.0F);
    
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[7].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[7].setRotationPoint(19.0F, 4.0F, -15.0F);
    
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[8].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[8].setRotationPoint(27.0F, 4.0F, -18.0F);
    
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[9].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[9].setRotationPoint(19.0F, 4.0F, -23.0F);
    
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[10].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[10].setRotationPoint(11.0F, 4.0F, -10.0F);
    
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[11].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[11].setRotationPoint(3.0F, 4.0F, -15.0F);
    
    rightTrackWheelModels[12] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[12].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[12].setRotationPoint(11.0F, 4.0F, -18.0F);
    
    rightTrackWheelModels[13] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[13].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[13].setRotationPoint(3.0F, 4.0F, -23.0F);
    
    rightTrackWheelModels[14] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[14].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[14].setRotationPoint(-5.0F, 4.0F, -10.0F);
    
    rightTrackWheelModels[15] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[15].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[15].setRotationPoint(-13.0F, 4.0F, -15.0F);
    
    rightTrackWheelModels[16] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[16].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[16].setRotationPoint(-5.0F, 4.0F, -18.0F);
    
    rightTrackWheelModels[17] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[17].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[17].setRotationPoint(-13.0F, 4.0F, -23.0F);
    
    rightTrackWheelModels[18] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[18].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[18].setRotationPoint(-21.0F, 4.0F, -10.0F);
    
    rightTrackWheelModels[19] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[19].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[19].setRotationPoint(-29.0F, 4.0F, -15.0F);
    
    rightTrackWheelModels[20] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[20].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[20].setRotationPoint(-21.0F, 4.0F, -18.0F);
    
    rightTrackWheelModels[21] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[21].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[21].setRotationPoint(-29.0F, 4.0F, -23.0F);
    
    rightTrackWheelModels[22] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[22].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[22].setRotationPoint(-37.0F, 4.0F, -10.0F);
    
    rightTrackWheelModels[23] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[23].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[23].setRotationPoint(-45.0F, 4.0F, -15.0F);
    
    rightTrackWheelModels[24] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[24].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[24].setRotationPoint(-37.0F, 4.0F, -18.0F);
    
    rightTrackWheelModels[25] = new ModelRendererTurbo(this, 245, 410, 1000, 1000);
    rightTrackWheelModels[25].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[25].setRotationPoint(-45.0F, 4.0F, -23.0F);
    
    rightTrackWheelModels[26] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[26].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[26].setRotationPoint(42.0F, -4.0F, -18.0F);
    
    rightTrackWheelModels[27] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[27].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[27].setRotationPoint(36.0F, -4.0F, -15.0F);
    
    rightTrackWheelModels[28] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[28].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[28].setRotationPoint(26.0F, -4.0F, -18.0F);
    
    rightTrackWheelModels[29] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[29].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[29].setRotationPoint(20.0F, -4.0F, -15.0F);
    
    rightTrackWheelModels[30] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[30].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[30].setRotationPoint(10.0F, -4.0F, -18.0F);
    
    rightTrackWheelModels[31] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[31].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[31].setRotationPoint(4.0F, -4.0F, -15.0F);
    
    rightTrackWheelModels[32] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[32].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[32].setRotationPoint(-6.0F, -4.0F, -18.0F);
    
    rightTrackWheelModels[33] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[33].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[33].setRotationPoint(-12.0F, -4.0F, -15.0F);
    
    rightTrackWheelModels[34] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[34].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[34].setRotationPoint(-22.0F, -4.0F, -18.0F);
    
    rightTrackWheelModels[35] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[35].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[35].setRotationPoint(-28.0F, -4.0F, -15.0F);
    
    rightTrackWheelModels[36] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[36].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[36].setRotationPoint(-38.0F, -4.0F, -18.0F);
    
    rightTrackWheelModels[37] = new ModelRendererTurbo(this, 0, 103, 1000, 1000);
    rightTrackWheelModels[37].addBox(-1.5F, -1.5F, -2.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[37].setRotationPoint(-44.0F, -4.0F, -15.0F);
    
    rightTrackModel = new ModelRendererTurbo[38];
    
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 450, 1000, 1000);
    rightTrackModel[0].addBox(0.0F, 0.0F, -17.0F, 6, 3, 17, 0.0F);
    rightTrackModel[0].setRotationPoint(58.0F, -11.0F, -9.0F);
    
    rightTrackModel[1] = new ModelRendererTurbo(this, 55, 450, 1000, 1000);
    rightTrackModel[1].addBox(0.0F, 0.0F, -17.0F, 7, 3, 17, 0.0F);
    rightTrackModel[1].setRotationPoint(64.0F, -11.0F, -9.0F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2] = new ModelRendererTurbo(this, 110, 450, 1000, 1000);
    rightTrackModel[2].addBox(0.0F, 0.0F, -17.0F, 3, 6, 17, 0.0F);
    rightTrackModel[2].setRotationPoint(66.0F, -6.0F, -9.0F);
    
    rightTrackModel[3] = new ModelRendererTurbo(this, 160, 450, 1000, 1000);
    rightTrackModel[3].addBox(0.0F, 0.0F, -17.0F, 7, 3, 17, 0.0F);
    rightTrackModel[3].setRotationPoint(69.0F, 0.0F, -9.0F);
    (rightTrackModel[3]).rotateAngleZ = -2.356194F;
    
    rightTrackModel[4] = new ModelRendererTurbo(this, 500, 450, 1000, 1000);
    rightTrackModel[4].addBox(0.0F, 0.0F, -17.0F, 19, 3, 17, 0.0F);
    rightTrackModel[4].setRotationPoint(64.0F, 5.0F, -9.0F);
    (rightTrackModel[4]).rotateAngleZ = -2.88852F;
    
    rightTrackModel[5] = new ModelRendererTurbo(this, 0, 485, 1000, 1000);
    rightTrackModel[5].addBox(0.0F, -3.0F, -17.0F, 95, 3, 17, 0.0F);
    rightTrackModel[5].setRotationPoint(-49.0F, 10.0F, -9.0F);
    
    rightTrackModel[6] = new ModelRendererTurbo(this, 217, 450, 1000, 1000);
    rightTrackModel[6].addBox(-19.0F, 0.0F, -17.0F, 19, 3, 17, 0.0F);
    rightTrackModel[6].setRotationPoint(-67.0F, 5.0F, -9.0F);
    (rightTrackModel[6]).rotateAngleZ = 2.88852F;
    
    rightTrackModel[7] = new ModelRendererTurbo(this, 295, 450, 1000, 1000);
    rightTrackModel[7].addBox(-7.0F, 0.0F, -17.0F, 7, 3, 17, 0.0F);
    rightTrackModel[7].setRotationPoint(-72.0F, 0.0F, -9.0F);
    (rightTrackModel[7]).rotateAngleZ = 2.356194F;
    
    rightTrackModel[8] = new ModelRendererTurbo(this, 350, 450, 1000, 1000);
    rightTrackModel[8].addBox(0.0F, 0.0F, -17.0F, 3, 6, 17, 0.0F);
    rightTrackModel[8].setRotationPoint(-72.0F, -6.0F, -9.0F);
    
    rightTrackModel[9] = new ModelRendererTurbo(this, 400, 450, 1000, 1000);
    rightTrackModel[9].addBox(0.0F, -3.0F, -17.0F, 7, 3, 17, 0.0F);
    rightTrackModel[9].setRotationPoint(-67.0F, -11.0F, -9.0F);
    (rightTrackModel[9]).rotateAngleZ = -2.356194F;
    
    rightTrackModel[10] = new ModelRendererTurbo(this, 65, 410, 1000, 1000);
    rightTrackModel[10].addBox(-6.0F, 0.0F, -17.0F, 6, 3, 17, 0.0F);
    rightTrackModel[10].setRotationPoint(-61.0F, -11.0F, -9.0F);
    
    rightTrackModel[11] = new ModelRendererTurbo(this, 120, 410, 1000, 1000);
    rightTrackModel[11].addBox(0.0F, 0.0F, -17.0F, 9, 3, 17, 0.0F);
    rightTrackModel[11].setRotationPoint(-61.0F, -11.0F, -9.0F);
    (rightTrackModel[11]).rotateAngleZ = -0.3839724F;
    
    rightTrackModel[12] = new ModelRendererTurbo(this, 250, 485, 1000, 1000);
    rightTrackModel[12].addBox(0.0F, -3.0F, -17.0F, 105, 3, 17, 0.0F);
    rightTrackModel[12].setRotationPoint(-54.0F, -5.0F, -9.0F);
    
    rightTrackModel[13] = new ModelRendererTurbo(this, 180, 410, 1000, 1000);
    rightTrackModel[13].addBox(-9.0F, 0.0F, -17.0F, 9, 3, 17, 0.0F);
    rightTrackModel[13].setRotationPoint(58.0F, -11.0F, -9.0F);
    (rightTrackModel[13]).rotateAngleZ = 0.3839724F;
    
    rightTrackModel[14] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[14].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[14].setRotationPoint(33.0F, 2.0F, -12.0F);
    
    rightTrackModel[15] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[15].addBox(0.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[15].setRotationPoint(33.0F, 2.0F, -12.0F);
    (rightTrackModel[15]).rotateAngleZ = 0.3141593F;
    
    rightTrackModel[16] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[16].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[16].setRotationPoint(17.0F, 2.0F, -12.0F);
    
    rightTrackModel[17] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[17].addBox(0.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[17].setRotationPoint(17.0F, 2.0F, -12.0F);
    (rightTrackModel[17]).rotateAngleZ = 0.3141593F;
    
    rightTrackModel[18] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[18].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[18].setRotationPoint(1.0F, 2.0F, -12.0F);
    
    rightTrackModel[19] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[19].addBox(0.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[19].setRotationPoint(1.0F, 2.0F, -12.0F);
    (rightTrackModel[19]).rotateAngleZ = 0.3141593F;
    
    rightTrackModel[20] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[20].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[20].setRotationPoint(-15.0F, 2.0F, -12.0F);
    
    rightTrackModel[21] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[21].addBox(0.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[21].setRotationPoint(-15.0F, 2.0F, -12.0F);
    (rightTrackModel[21]).rotateAngleZ = 0.3141593F;
    
    rightTrackModel[22] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[22].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[22].setRotationPoint(-31.0F, 2.0F, -12.0F);
    
    rightTrackModel[23] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[23].addBox(0.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[23].setRotationPoint(-31.0F, 2.0F, -12.0F);
    (rightTrackModel[23]).rotateAngleZ = 0.3141593F;
    
    rightTrackModel[24] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[24].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[24].setRotationPoint(-47.0F, 2.0F, -12.0F);
    
    rightTrackModel[25] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[25].addBox(0.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[25].setRotationPoint(-47.0F, 2.0F, -12.0F);
    (rightTrackModel[25]).rotateAngleZ = 0.3141593F;
    
    rightTrackModel[26] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[26].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[26].setRotationPoint(33.0F, 2.0F, -20.0F);
    
    rightTrackModel[27] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[27].addBox(-12.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[27].setRotationPoint(45.0F, 2.0F, -20.0F);
    (rightTrackModel[27]).rotateAngleZ = -0.3141593F;
    
    rightTrackModel[28] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[28].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[28].setRotationPoint(17.0F, 2.0F, -20.0F);
    
    rightTrackModel[29] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[29].addBox(-12.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[29].setRotationPoint(29.0F, 2.0F, -20.0F);
    (rightTrackModel[29]).rotateAngleZ = -0.3141593F;
    
    rightTrackModel[30] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[30].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[30].setRotationPoint(1.0F, 2.0F, -20.0F);
    
    rightTrackModel[31] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[31].addBox(-12.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[31].setRotationPoint(13.0F, 2.0F, -20.0F);
    (rightTrackModel[31]).rotateAngleZ = -0.3141593F;
    
    rightTrackModel[32] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[32].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[32].setRotationPoint(-15.0F, 2.0F, -20.0F);
    
    rightTrackModel[33] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[33].addBox(-12.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[33].setRotationPoint(-3.0F, 2.0F, -20.0F);
    (rightTrackModel[33]).rotateAngleZ = -0.3141593F;
    
    rightTrackModel[34] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[34].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[34].setRotationPoint(-31.0F, 2.0F, -20.0F);
    
    rightTrackModel[35] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[35].addBox(-12.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[35].setRotationPoint(-19.0F, 2.0F, -20.0F);
    (rightTrackModel[35]).rotateAngleZ = -0.3141593F;
    
    rightTrackModel[36] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[36].addBox(0.0F, 0.0F, -3.0F, 12, 4, 3, 0.0F);
    rightTrackModel[36].setRotationPoint(-47.0F, 2.0F, -20.0F);
    
    rightTrackModel[37] = new ModelRendererTurbo(this, 280, 410, 1000, 1000);
    rightTrackModel[37].addBox(-12.0F, 0.0F, -3.0F, 12, 2, 3, 0.0F);
    rightTrackModel[37].setRotationPoint(-35.0F, 2.0F, -20.0F);
    (rightTrackModel[37]).rotateAngleZ = -0.3141593F;
    
    turretModel = new ModelRendererTurbo[16];
    turretModel[0] = new ModelRendererTurbo(this, 500, 0, 1000, 1000);
    turretModel[0].addBox(-24.0F, -1.0F, -25.0F, 50, 1, 50, 0.0F);
    turretModel[0].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[1] = new ModelRendererTurbo(this, 500, 65, 1000, 1000);
    turretModel[1].addShapeBox(-37.0F, -22.0F, -25.0F, 63, 21, 50, 0.0F, -4.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -10.0F, -4.0F, 0.0F, -10.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[1].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[2] = new ModelRendererTurbo(this, 750, 0, 1000, 1000);
    turretModel[2].addShapeBox(-39.0F, -22.0F, -25.0F, 2, 21, 50, 0.0F, -5.9F, 0.0F, -10.0F, 4.0F, 0.0F, -10.0F, 4.0F, 0.0F, -10.0F, -5.9F, 0.0F, -10.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F);
    turretModel[2].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[3] = new ModelRendererTurbo(this, 500, 150, 1000, 1000);
    turretModel[3].addShapeBox(26.0F, -22.0F, -19.0F, 10, 7, 38, 0.0F, 0.0F, 0.0F, -4.0F, -3.0F, -2.0F, -3.0F, -3.0F, -2.0F, -3.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -0.67F, 0.0F, 0.0F, -0.67F, 0.0F, 0.0F, -0.67F, 0.0F, 0.0F, -0.67F);
    turretModel[3].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[4] = new ModelRendererTurbo(this, 615, 150, 1000, 1000);
    turretModel[4].addShapeBox(26.0F, -15.0F, -22.0F, 10, 9, 44, 0.0F, 0.0F, 0.0F, -3.67F, 0.0F, 0.0F, -3.67F, 0.0F, 0.0F, -3.67F, 0.0F, 0.0F, -3.67F, 0.0F, 0.0F, 0.62F, 0.0F, 0.0F, 0.62F, 0.0F, 0.0F, 0.62F, 0.0F, 0.0F, 0.62F);
    turretModel[4].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[5] = new ModelRendererTurbo(this, 740, 150, 1000, 1000);
    turretModel[5].addShapeBox(26.0F, -6.0F, -25.0F, 10, 5, 50, 0.0F, 0.0F, 0.0F, -2.38F, 0.0F, 0.0F, -2.38F, 0.0F, 0.0F, -2.38F, 0.0F, 0.0F, -2.38F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[5].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[6] = new ModelRendererTurbo(this, 500, 215, 1000, 1000);
    turretModel[6].addShapeBox(26.0F, -1.0F, -25.0F, 7, 1, 50, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -6.9F, 0.0F, 0.0F, -6.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[6].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[7] = new ModelRendererTurbo(this, 140, 75, 1000, 1000);
    turretModel[7].addTrapezoid(13.0F, -27.0F, 5.0F, 5, 5, 5, 0.0F, -1.0F, 4);
    turretModel[7].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[8] = new ModelRendererTurbo(this, 175, 75, 1000, 1000);
    turretModel[8].addBox(-1.0F, -24.0F, -13.0F, 5, 2, 5, 0.0F);
    turretModel[8].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[9] = new ModelRendererTurbo(this, 175, 95, 1000, 1000);
    turretModel[9].addShapeBox(1.0F, -27.0F, -12.0F, 2, 3, 3, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[9].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[10] = new ModelRendererTurbo(this, 220, 75, 1000, 1000);
    turretModel[10].addShape3D(-12.0F, 22.0F, -12.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(9.0D, 2.0D, 9, 2), new Coord2D(9.0D, 7.0D, 9, 7), new Coord2D(7.0D, 9.0D, 7, 9), new Coord2D(2.0D, 9.0D, 2, 9), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 2.0D, 0, 2) }), 1.0F, 9, 9, 32, 1, 4, new float[] { 3.0F, 5.0F, 3.0F, 5.0F, 3.0F, 5.0F, 3.0F, 5.0F });
    turretModel[10].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[11] = new ModelRendererTurbo(this, 220, 35, 1000, 1000);
    turretModel[11].addShape3D(-12.0F, 22.0F, 3.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(9.0D, 2.0D, 9, 2), new Coord2D(9.0D, 7.0D, 9, 7), new Coord2D(7.0D, 9.0D, 7, 9), new Coord2D(2.0D, 9.0D, 2, 9), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 2.0D, 0, 2) }), 1.0F, 9, 9, 32, 1, 4, new float[] { 3.0F, 5.0F, 3.0F, 5.0F, 3.0F, 5.0F, 3.0F, 5.0F });
    turretModel[11].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[12] = new ModelRendererTurbo(this, 270, 75, 1000, 1000);
    turretModel[12].addShape3D(-4.0F, 22.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 1.0F, 8, 8, 28, 1, 4, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    turretModel[12].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[13] = new ModelRendererTurbo(this, 270, 75, 1000, 1000);
    turretModel[13].addShape3D(-25.0F, 22.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 1.0F, 8, 8, 28, 1, 4, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    turretModel[13].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    turretModel[14] = new ModelRendererTurbo(this, 520, 330, 1000, 1000);
    turretModel[14].addShape3D(1.0F, -11.0F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(5.0D, 1.0D, 5, 1), new Coord2D(5.0D, 4.0D, 5, 4), new Coord2D(4.0D, 5.0D, 4, 5), new Coord2D(1.0D, 5.0D, 1, 5), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(0.0D, 1.0D, 0, 1), new Coord2D(1.0D, 0.0D, 1, 0) }), 2.0F, 5, 5, 20, 2, 3, new float[] { 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F, 2.0F, 3.0F });
    turretModel[14].setRotationPoint(-57.0F, -46.0F, 0.0F);
    (turretModel[14]).rotateAngleZ = -0.3207129F;
    
    turretModel[15] = new ModelRendererTurbo(this, 325, 525, 1000, 1000);
    turretModel[15].addBox(35.01F, -14.0F, 9.0F, 1, 4, 1, 0.0F);
    turretModel[15].setRotationPoint(-22.0F, -24.0F, 0.0F);
    
    barrelModel = new ModelRendererTurbo[14];
    
    barrelModel[0] = new ModelRendererTurbo(this, 630, 215, 1000, 1000);
    barrelModel[0].addBox(0.0F, -4.5F, -11.0F, 10, 9, 18, 0.0F);
    barrelModel[0].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[1] = new ModelRendererTurbo(this, 705, 215, 1000, 1000);
    barrelModel[1].addShapeBox(9.0F, -7.0F, -11.0F, 4, 14, 18, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -1.0F, 0.0F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[1].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[2] = new ModelRendererTurbo(this, 765, 215, 1000, 1000);
    barrelModel[2].addTrapezoid(13.0F, -5.0F, -5.0F, 9, 10, 10, 0.0F, -1.0F, 2);
    barrelModel[2].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[3] = new ModelRendererTurbo(this, 805, 215, 1000, 1000);
    barrelModel[3].addTrapezoid(22.0F, -3.0F, -3.0F, 7, 6, 6, 0.0F, -0.5F, 2);
    barrelModel[3].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[4] = new ModelRendererTurbo(this, 500, 290, 1000, 1000);
    barrelModel[4].addTrapezoid(29.0F, -2.5F, -2.5F, 60, 5, 5, 0.0F, -0.25F, 2);
    barrelModel[4].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[5] = new ModelRendererTurbo(this, 500, 315, 1000, 1000);
    barrelModel[5].addBox(11.0F, -5.1F, 4.1F, 5, 1, 1, 0.0F);
    barrelModel[5].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[6] = new ModelRendererTurbo(this, 500, 315, 1000, 1000);
    barrelModel[6].addBox(11.0F, -1.0F, 4.5F, 5, 1, 1, 0.0F);
    barrelModel[6].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[7] = new ModelRendererTurbo(this, 500, 315, 1000, 1000);
    barrelModel[7].addBox(11.0F, 4.1F, 4.1F, 5, 1, 1, 0.0F);
    barrelModel[7].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[8] = new ModelRendererTurbo(this, 500, 315, 1000, 1000);
    barrelModel[8].addBox(11.0F, -5.1F, -5.1F, 5, 1, 1, 0.0F);
    barrelModel[8].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[9] = new ModelRendererTurbo(this, 500, 315, 1000, 1000);
    barrelModel[9].addBox(11.0F, 4.1F, -5.1F, 5, 1, 1, 0.0F);
    barrelModel[9].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[10] = new ModelRendererTurbo(this, 525, 315, 1000, 1000);
    barrelModel[10].addTrapezoid(13.0F, 0.0F, -9.5F, 5, 4, 4, 0.0F, -0.5F, 2);
    barrelModel[10].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[11] = new ModelRendererTurbo(this, 560, 315, 1000, 1000);
    barrelModel[11].addBox(13.0F, 1.0F, -8.5F, 23, 2, 2, 0.0F);
    barrelModel[11].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[12] = new ModelRendererTurbo(this, 500, 315, 1000, 1000);
    barrelModel[12].addBox(9.0F, -1.0F, -8.5F, 5, 1, 1, 0.0F);
    barrelModel[12].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    barrelModel[13] = new ModelRendererTurbo(this, 500, 315, 1000, 1000);
    barrelModel[13].addBox(9.0F, 4.0F, -8.5F, 5, 1, 1, 0.0F);
    barrelModel[13].setRotationPoint(4.0F, -34.5F, 0.0F);
    
    bodyDoorCloseModel = new ModelRendererTurbo[2];
    
    bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 0, 550, 1000, 1000);
    bodyDoorCloseModel[0].addBox(-4.5F, 0.0F, -1.0F, 9, 9, 1, 0.0F);
    bodyDoorCloseModel[0].setRotationPoint(0.0F, -21.0F, 29.1F);
    
    bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 0, 550, 1000, 1000);
    bodyDoorCloseModel[1].addBox(-4.5F, 0.0F, 0.0F, 9, 9, 1, 0.0F);
    bodyDoorCloseModel[1].setRotationPoint(0.0F, -21.0F, -29.1F);
    
    bodyDoorOpenModel = new ModelRendererTurbo[2];
    bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 0, 580, 1000, 1000);
    bodyDoorOpenModel[0].addShapeBox(-233.5F, -34.5F, -1.0F, 460, 92, 1, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F);
    bodyDoorOpenModel[0].setRotationPoint(0.0F, -22.0F, 29.1F);
    
    bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 0, 700, 1000, 1000);
    bodyDoorOpenModel[1].addShapeBox(-233.5F, -34.5F, 0.0F, 460, 92, 1, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F, -172.5F, -34.5F, 0.0F);
    bodyDoorOpenModel[1].setRotationPoint(0.0F, -22.0F, -29.1F);
    
    translateAll(22.0F, 0.0F, 0.0F);
    
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
