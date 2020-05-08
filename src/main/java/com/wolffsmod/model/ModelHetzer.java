package com.wolffsmod.model;


import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;


public class ModelHetzer
  extends ModelVehicle
{
  int textureX = 500;
  int textureY = 256;

  
  public ModelHetzer() {
    bodyModel = new ModelRendererTurbo[77];
    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, 512, 256);
    bodyModel[0].addShapeBox(-39.0F, 0.0F, -13.0F, 78, 9, 26, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[0].setRotationPoint(0.0F, -7.0F, 0.0F);
    
    bodyModel[1] = new ModelRendererTurbo(this, 250, 0, 512, 256);
    bodyModel[1].addShapeBox(-37.0F, 0.0F, -14.0F, 76, 3, 28, 0.0F, -1.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[1].setRotationPoint(0.0F, -10.0F, 0.0F);
    
    bodyModel[2] = new ModelRendererTurbo(this, 0, 38, 512, 256);
    bodyModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 20, 12, 21, 0.0F, 0.0F, 0.0F, 0.0F, -19.9F, 0.0F, 0.0F, -19.9F, 0.0F, -8.9F, 0.0F, 0.0F, -8.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(14.0F, -22.0F, 0.0F);
    
    bodyModel[3] = new ModelRendererTurbo(this, 56, 75, 512, 256);
    bodyModel[3].addShapeBox(0.0F, 0.0F, 0.0F, 20, 12, 11, 0.0F, 0.0F, 0.0F, -8.9F, -19.9F, 0.0F, -8.9F, -19.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[3].setRotationPoint(14.0F, -22.0F, -21.0F);
    
    bodyModel[4] = new ModelRendererTurbo(this, 140, 38, 512, 256);
    bodyModel[4].addShapeBox(0.0F, 0.0F, -21.0F, 24, 12, 42, 0.0F, 0.0F, 0.0F, -8.9F, 0.0F, 0.0F, -8.9F, 0.0F, 0.0F, -8.9F, 0.0F, 0.0F, -8.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[4].setRotationPoint(-10.0F, -22.0F, 0.0F);
    
    bodyModel[5] = new ModelRendererTurbo(this, 0, 77, 512, 256);
    bodyModel[5].addBox(-10.0F, 0.0F, 0.0F, 10, 12, 10, 0.0F);
    bodyModel[5].setRotationPoint(24.0F, -22.0F, -10.0F);
    
    bodyModel[6] = new ModelRendererTurbo(this, 85, 44, 512, 256);
    bodyModel[6].addShapeBox(-4.0F, 0.0F, 0.0F, 4, 12, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -3.0F, 0.0F, -3.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[6].setRotationPoint(28.0F, -22.0F, -10.0F);
    
    bodyModel[7] = new ModelRendererTurbo(this, 290, 38, 512, 256);
    bodyModel[7].addShapeBox(-27.0F, 0.0F, -21.0F, 27, 12, 42, 0.0F, -1.5F, -11.0F, -8.9F, 0.0F, 0.0F, -8.9F, 0.0F, 0.0F, -8.9F, -1.5F, -11.0F, -9.0F, -1.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -7.0F);
    bodyModel[7].setRotationPoint(-10.0F, -22.0F, 0.0F);
    
    bodyModel[8] = new ModelRendererTurbo(this, 0, 105, 512, 256);
    bodyModel[8].addBox(0.0F, 0.0F, -4.0F, 8, 4, 4, 0.0F);
    bodyModel[8].setRotationPoint(30.0F, -5.0F, -11.0F);
    
    bodyModel[9] = new ModelRendererTurbo(this, 90, 105, 512, 256);
    bodyModel[9].addShapeBox(0.0F, 0.0F, -4.0F, 8, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[9].setRotationPoint(30.0F, -7.0F, -11.0F);
    
    bodyModel[10] = new ModelRendererTurbo(this, 90, 105, 512, 256);
    bodyModel[10].addShapeBox(0.0F, 0.0F, -4.0F, 8, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[10].setRotationPoint(30.0F, -1.0F, -11.0F);
    
    bodyModel[11] = new ModelRendererTurbo(this, 180, 105, 512, 256);
    bodyModel[11].addShapeBox(0.0F, 0.0F, -13.5F, 3, 5, 27, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.2F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -1.5F, 0.0F);
    bodyModel[11].setRotationPoint(-37.0F, -5.0F, 0.0F);
    
    bodyModel[12] = new ModelRendererTurbo(this, 250, 105, 512, 256);
    bodyModel[12].addBox(0.0F, 0.0F, -17.0F, 2, 2, 34, 0.0F);
    bodyModel[12].setRotationPoint(-35.0F, -1.0F, 0.0F);
    
    bodyModel[13] = new ModelRendererTurbo(this, 0, 150, 512, 256);
    bodyModel[13].addBox(0.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
    bodyModel[13].setRotationPoint(14.0F, -3.0F, 13.0F);
    
    bodyModel[14] = new ModelRendererTurbo(this, 0, 150, 512, 256);
    bodyModel[14].addBox(0.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
    bodyModel[14].setRotationPoint(-17.0F, -3.0F, 13.0F);
    
    bodyModel[15] = new ModelRendererTurbo(this, 30, 150, 512, 256);
    bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 17, 4, 1, 0.0F);
    bodyModel[15].setRotationPoint(7.0F, 0.0F, 13.5F);
    
    bodyModel[16] = new ModelRendererTurbo(this, 30, 150, 512, 256);
    bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 17, 4, 1, 0.0F);
    bodyModel[16].setRotationPoint(-24.0F, 0.0F, 13.5F);
    
    bodyModel[17] = new ModelRendererTurbo(this, 70, 150, 512, 256);
    bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[17].setRotationPoint(22.0F, 2.0F, 14.0F);
    
    bodyModel[18] = new ModelRendererTurbo(this, 70, 150, 512, 256);
    bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[18].setRotationPoint(7.0F, 2.0F, 14.0F);
    
    bodyModel[19] = new ModelRendererTurbo(this, 70, 150, 512, 256);
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[19].setRotationPoint(-9.0F, 2.0F, 14.0F);
    
    bodyModel[20] = new ModelRendererTurbo(this, 70, 150, 512, 256);
    bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[20].setRotationPoint(-24.0F, 2.0F, 14.0F);
    
    bodyModel[21] = new ModelRendererTurbo(this, 0, 150, 512, 256);
    bodyModel[21].addBox(0.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
    bodyModel[21].setRotationPoint(14.0F, -3.0F, -13.0F);
    
    bodyModel[22] = new ModelRendererTurbo(this, 0, 150, 512, 256);
    bodyModel[22].addBox(0.0F, 0.0F, -2.0F, 3, 6, 4, 0.0F);
    bodyModel[22].setRotationPoint(-17.0F, -3.0F, -13.0F);
    
    bodyModel[23] = new ModelRendererTurbo(this, 30, 150, 512, 256);
    bodyModel[23].addBox(0.0F, 0.0F, -1.0F, 17, 4, 1, 0.0F);
    bodyModel[23].setRotationPoint(7.0F, 0.0F, -13.5F);
    
    bodyModel[24] = new ModelRendererTurbo(this, 30, 150, 512, 256);
    bodyModel[24].addBox(0.0F, 0.0F, -1.0F, 17, 4, 1, 0.0F);
    bodyModel[24].setRotationPoint(-24.0F, 0.0F, -13.5F);
    
    bodyModel[25] = new ModelRendererTurbo(this, 70, 150, 512, 256);
    bodyModel[25].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[25].setRotationPoint(22.0F, 2.0F, -14.0F);
    
    bodyModel[26] = new ModelRendererTurbo(this, 70, 150, 512, 256);
    bodyModel[26].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[26].setRotationPoint(7.0F, 2.0F, -14.0F);
    
    bodyModel[27] = new ModelRendererTurbo(this, 70, 150, 512, 256);
    bodyModel[27].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[27].setRotationPoint(-9.0F, 2.0F, -14.0F);
    
    bodyModel[28] = new ModelRendererTurbo(this, 70, 150, 512, 256);
    bodyModel[28].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[28].setRotationPoint(-24.0F, 2.0F, -14.0F);
    
    bodyModel[29] = new ModelRendererTurbo(this, 100, 150, 512, 256);
    bodyModel[29].addBox(0.0F, 0.0F, -7.0F, 40, 1, 8, 0.0F);
    bodyModel[29].setRotationPoint(-41.0F, -10.0F, -14.0F);
    (bodyModel[29]).rotateAngleX = 0.06981317F;
    
    bodyModel[30] = new ModelRendererTurbo(this, 100, 150, 512, 256);
    bodyModel[30].addBox(0.0F, 0.0F, -1.0F, 40, 1, 8, 0.0F);
    bodyModel[30].setRotationPoint(-41.0F, -10.0F, 14.0F);
    (bodyModel[30]).rotateAngleX = -0.06981317F;
    
    bodyModel[31] = new ModelRendererTurbo(this, 205, 150, 512, 256);
    bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 7, 1, 7, 0.0F);
    bodyModel[31].setRotationPoint(32.0F, -11.0F, 13.0F);
    (bodyModel[31]).rotateAngleZ = -0.1047198F;
    
    bodyModel[32] = new ModelRendererTurbo(this, 205, 150, 512, 256);
    bodyModel[32].addBox(0.0F, 0.0F, -7.0F, 7, 1, 7, 0.0F);
    bodyModel[32].setRotationPoint(32.0F, -11.0F, -13.0F);
    (bodyModel[32]).rotateAngleZ = -0.1047198F;
    
    bodyModel[33] = new ModelRendererTurbo(this, 240, 150, 512, 256);
    bodyModel[33].addShapeBox(0.0F, 0.0F, 0.0F, 7, 6, 2, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, -1.6F, -1.0F, 0.0F, -1.6F);
    bodyModel[33].setRotationPoint(-41.0F, -10.0F, 12.0F);
    
    bodyModel[34] = new ModelRendererTurbo(this, 240, 150, 512, 256);
    bodyModel[34].addShapeBox(0.0F, 0.0F, -2.0F, 7, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, -1.0F, 0.0F, -1.6F, 0.0F, 0.0F, -1.6F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F);
    bodyModel[34].setRotationPoint(-41.0F, -10.0F, -12.0F);
    
    bodyModel[35] = new ModelRendererTurbo(this, 260, 150, 512, 256);
    bodyModel[35].addShapeBox(0.0F, 0.0F, 0.0F, 7, 4, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F, -0.8F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[35].setRotationPoint(32.0F, -11.0F, -14.0F);
    
    bodyModel[36] = new ModelRendererTurbo(this, 260, 150, 512, 256);
    bodyModel[36].addShapeBox(0.0F, 0.0F, -2.0F, 7, 4, 2, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.8F, -1.0F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[36].setRotationPoint(32.0F, -11.0F, 14.0F);
    
    bodyModel[37] = new ModelRendererTurbo(this, 290, 150, 512, 256);
    bodyModel[37].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 2.0F, 0.0F, 0.0F, 2.0F);
    bodyModel[37].setRotationPoint(38.0F, -12.0F, -14.0F);
    
    bodyModel[38] = new ModelRendererTurbo(this, 290, 150, 512, 256);
    bodyModel[38].addShapeBox(0.0F, 0.0F, -2.0F, 2, 5, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.0F, -1.0F, 0.0F, 2.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[38].setRotationPoint(38.0F, -12.0F, 14.0F);
    
    bodyModel[39] = new ModelRendererTurbo(this, 305, 150, 512, 256);
    bodyModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 6, 0.0F, -1.0F, -1.5F, 0.0F, -0.5F, -1.6F, 0.0F, 0.0F, -0.2F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, -0.4F, 0.0F, -0.6F, -0.2F, 0.0F, -0.6F, 0.0F, 0.6F, -0.5F, -0.4F, 0.6F);
    bodyModel[39].setRotationPoint(38.0F, -12.0F, -20.0F);
    
    bodyModel[40] = new ModelRendererTurbo(this, 305, 150, 512, 256);
    bodyModel[40].addShapeBox(0.0F, 0.0F, -6.0F, 2, 3, 6, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, -1.6F, 0.0F, -1.0F, -1.5F, 0.0F, -0.5F, -0.4F, 0.6F, -0.6F, 0.0F, 0.6F, -0.6F, -0.2F, 0.0F, -0.5F, -0.4F, 0.0F);
    bodyModel[40].setRotationPoint(38.0F, -12.0F, 20.0F);
    
    bodyModel[41] = new ModelRendererTurbo(this, 330, 150, 512, 256);
    bodyModel[41].addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
    bodyModel[41].setRotationPoint(-36.0F, -11.0F, 11.0F);
    (bodyModel[41]).rotateAngleX = -0.06981317F;
    
    bodyModel[42] = new ModelRendererTurbo(this, 330, 150, 512, 256);
    bodyModel[42].addBox(0.0F, 0.0F, -9.0F, 1, 1, 9, 0.0F);
    bodyModel[42].setRotationPoint(-36.0F, -11.0F, -11.0F);
    (bodyModel[42]).rotateAngleX = 0.06981317F;
    
    bodyModel[43] = new ModelRendererTurbo(this, 330, 150, 512, 256);
    bodyModel[43].addBox(0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F);
    bodyModel[43].setRotationPoint(-20.0F, -11.0F, 11.0F);
    (bodyModel[43]).rotateAngleX = -0.06981317F;
    
    bodyModel[44] = new ModelRendererTurbo(this, 330, 150, 512, 256);
    bodyModel[44].addBox(0.0F, 0.0F, -9.0F, 1, 1, 9, 0.0F);
    bodyModel[44].setRotationPoint(-20.0F, -11.0F, -11.0F);
    (bodyModel[44]).rotateAngleX = 0.06981317F;
    
    bodyModel[45] = new ModelRendererTurbo(this, 355, 150, 512, 256);
    bodyModel[45].addBox(0.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F);
    bodyModel[45].setRotationPoint(22.0F, -17.0F, 5.0F);
    
    bodyModel[46] = new ModelRendererTurbo(this, 330, 105, 512, 256);
    bodyModel[46].addShapeBox(-3.0F, 0.0F, -2.0F, 3, 8, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[46].setRotationPoint(-36.0F, -8.0F, 0.0F);
    
    bodyModel[47] = new ModelRendererTurbo(this, 355, 105, 512, 256);
    bodyModel[47].addShapeBox(-3.0F, 0.0F, 0.0F, 3, 8, 2, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.8F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.15F, -2.0F, 0.0F);
    bodyModel[47].setRotationPoint(-36.0F, -8.0F, 2.0F);
    
    bodyModel[48] = new ModelRendererTurbo(this, 355, 105, 512, 256);
    bodyModel[48].addShapeBox(-3.0F, 0.0F, -2.0F, 3, 8, 2, 0.0F, -0.8F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.15F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[48].setRotationPoint(-36.0F, -8.0F, -2.0F);
    
    bodyModel[49] = new ModelRendererTurbo(this, 370, 105, 512, 256);
    bodyModel[49].addBox(-4.0F, -1.5F, -1.5F, 4, 3, 3, 0.0F);
    bodyModel[49].setRotationPoint(-37.0F, -4.0F, 0.0F);
    (bodyModel[49]).rotateAngleZ = -0.2047198F;
    
    bodyModel[50] = new ModelRendererTurbo(this, 0, 105, 512, 256);
    bodyModel[50].addBox(0.0F, 0.0F, 0.0F, 8, 4, 4, 0.0F);
    bodyModel[50].setRotationPoint(30.0F, -5.0F, 11.0F);
    
    bodyModel[51] = new ModelRendererTurbo(this, 90, 105, 512, 256);
    bodyModel[51].addShapeBox(0.0F, 0.0F, 0.0F, 8, 2, 4, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[51].setRotationPoint(30.0F, -7.0F, 11.0F);
    
    bodyModel[52] = new ModelRendererTurbo(this, 90, 105, 512, 256);
    bodyModel[52].addShapeBox(0.0F, 0.0F, 0.0F, 8, 2, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[52].setRotationPoint(30.0F, -1.0F, 11.0F);
    
    bodyModel[53] = new ModelRendererTurbo(this, 0, 230, 512, 256);
    bodyModel[53].addBox(-2.0F, -1.0F, -2.0F, 5, 6, 4, 0.0F);
    bodyModel[53].setRotationPoint(-25.0F, -17.5F, 0.0F);
    
    bodyModel[54] = new ModelRendererTurbo(this, 25, 230, 512, 256);
    bodyModel[54].addBox(-6.0F, -1.0F, -1.0F, 5, 2, 2, 0.0F);
    bodyModel[54].setRotationPoint(-25.0F, -17.0F, 0.0F);
    (bodyModel[54]).rotateAngleY = 0.3490658F;
    (bodyModel[54]).rotateAngleZ = 0.3490658F;
    
    bodyModel[55] = new ModelRendererTurbo(this, 50, 230, 512, 256);
    bodyModel[55].addBox(-14.1F, -2.0F, -2.0F, 9, 4, 4, 0.0F);
    bodyModel[55].setRotationPoint(-25.0F, -17.0F, 0.0F);
    (bodyModel[55]).rotateAngleX = -0.1134464F;
    (bodyModel[55]).rotateAngleY = 0.3490658F;
    (bodyModel[55]).rotateAngleZ = 0.3490658F;
    
    bodyModel[56] = new ModelRendererTurbo(this, 80, 230, 512, 256);
    bodyModel[56].addBox(-14.1F, -1.75F, -8.6F, 4, 4, 6, 0.0F);
    bodyModel[56].setRotationPoint(-25.0F, -17.0F, 0.0F);
    (bodyModel[56]).rotateAngleZ = 0.3490658F;
    
    bodyModel[57] = new ModelRendererTurbo(this, 400, 105, 512, 256);
    bodyModel[57].addShape3D(19.0F, -7.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(19.0D, 0.0D, 19, 0), new Coord2D(19.0D, 7.0D, 19, 7), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 19, 7, 54, 1, 0, new float[] { 4.0F, 3.0F, 19.0F, 7.0F, 15.0F, 6.0F });
    bodyModel[57].setRotationPoint(13.0F, -10.0F, 21.0F);
    
    bodyModel[58] = new ModelRendererTurbo(this, 400, 120, 512, 256);
    bodyModel[58].addBox(0.0F, 0.0F, 0.0F, 20, 7, 1, 0.0F);
    bodyModel[58].setRotationPoint(-7.5F, -10.0F, 21.0F);
    
    bodyModel[59] = new ModelRendererTurbo(this, 400, 135, 512, 256);
    bodyModel[59].addShape3D(20.0F, -7.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(20.0D, 4.0D, 20, 4), new Coord2D(20.0D, 7.0D, 20, 7), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 0.0D, 0, 0) }), 1.0F, 20, 7, 52, 1, 0, new float[] { 7.0F, 20.0F, 3.0F, 6.0F, 16.0F });
    bodyModel[59].setRotationPoint(-28.0F, -10.0F, 21.0F);
    
    bodyModel[60] = new ModelRendererTurbo(this, 400, 105, 512, 256);
    bodyModel[60].addShape3D(19.0F, -7.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(19.0D, 0.0D, 19, 0), new Coord2D(19.0D, 7.0D, 19, 7), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 19, 7, 54, 1, 0, new float[] { 4.0F, 3.0F, 19.0F, 7.0F, 15.0F, 6.0F });
    bodyModel[60].setRotationPoint(13.0F, -10.0F, -21.0F);
    
    bodyModel[61] = new ModelRendererTurbo(this, 400, 120, 512, 256);
    bodyModel[61].addBox(0.0F, 0.0F, -1.0F, 20, 7, 1, 0.0F);
    bodyModel[61].setRotationPoint(-7.5F, -10.0F, -21.0F);
    
    bodyModel[62] = new ModelRendererTurbo(this, 400, 135, 512, 256);
    bodyModel[62].addShape3D(20.0F, -7.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(16.0D, 0.0D, 16, 0), new Coord2D(20.0D, 4.0D, 20, 4), new Coord2D(20.0D, 7.0D, 20, 7), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 0.0D, 0, 0) }), 1.0F, 20, 7, 52, 1, 0, new float[] { 7.0F, 20.0F, 3.0F, 6.0F, 16.0F });
    bodyModel[62].setRotationPoint(-28.0F, -10.0F, -21.0F);
    
    bodyModel[63] = new ModelRendererTurbo(this, 280, 195, 512, 256);
    bodyModel[63].addBox(-12.0F, -2.0F, -3.0F, 12, 2, 6, 0.0F);
    bodyModel[63].setRotationPoint(-10.0F, -22.0F, 0.0F);
    (bodyModel[63]).rotateAngleZ = 0.4014257F;
    
    bodyModel[64] = new ModelRendererTurbo(this, 380, 150, 512, 256);
    bodyModel[64].addBox(0.0F, 0.0F, -1.0F, 4, 2, 2, 0.0F);
    bodyModel[64].setRotationPoint(-6.0F, -24.0F, 10.5F);
    
    bodyModel[65] = new ModelRendererTurbo(this, 400, 150, 512, 256);
    bodyModel[65].addBox(-10.0F, -2.0F, -2.0F, 2, 3, 4, 0.0F);
    bodyModel[65].setRotationPoint(-10.0F, -22.0F, -8.0F);
    (bodyModel[65]).rotateAngleZ = 0.4014257F;
    
    bodyModel[66] = new ModelRendererTurbo(this, 200, 170, 512, 256);
    bodyModel[66].addShape3D(0.0F, -4.0F, -7.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 4.0D, 4, 4), new Coord2D(2.0D, 4.0D, 2, 4), new Coord2D(0.0D, 2.0D, 0, 2), new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(4.0D, 4.0D, 4, 4) }), 8.0F, 4, 4, 21, 8, 3, new float[] { 6.0F, 4.0F, 4.0F, 2.0F, 3.0F, 2.0F });
    bodyModel[66].setRotationPoint(-35.0F, -14.0F, 14.0F);
    (bodyModel[66]).rotateAngleX = -0.06981317F;
    
    bodyModel[67] = new ModelRendererTurbo(this, 430, 150, 512, 256);
    bodyModel[67].addShapeBox(0.0F, 0.0F, 0.0F, 1, 28, 1, 0.0F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F, -0.25F, 0.0F, -0.25F);
    bodyModel[67].setRotationPoint(-16.0F, -39.0F, -15.0F);
    
    bodyModel[68] = new ModelRendererTurbo(this, 240, 170, 512, 256);
    bodyModel[68].addBox(-1.5F, 0.0F, -1.5F, 3, 3, 3, 0.0F);
    bodyModel[68].setRotationPoint(6.0F, -25.0F, 8.0F);
    
    bodyModel[69] = new ModelRendererTurbo(this, 260, 170, 512, 256);
    bodyModel[69].addShapeBox(-9.0F, -4.0F, 1.5F, 10, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[69].setRotationPoint(6.0F, -23.5F, 8.0F);
    (bodyModel[69]).rotateAngleY = -0.4363323F;
    
    bodyModel[70] = new ModelRendererTurbo(this, 300, 170, 512, 256);
    bodyModel[70].addShapeBox(-8.0F, -4.0F, -2.5F, 10, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[70].setRotationPoint(6.0F, -23.5F, 8.0F);
    (bodyModel[70]).rotateAngleY = 0.03490658F;
    
    bodyModel[71] = new ModelRendererTurbo(this, 350, 170, 512, 256);
    bodyModel[71].addBox(0.0F, 0.0F, -0.5F, 1, 2, 1, 0.0F);
    bodyModel[71].setRotationPoint(32.0F, -13.0F, 17.0F);
    
    bodyModel[72] = new ModelRendererTurbo(this, 370, 170, 512, 256);
    bodyModel[72].addTrapezoid(-1.0F, -1.5F, -1.5F, 3, 3, 3, 0.0F, -1.0F, 3);
    bodyModel[72].setRotationPoint(32.0F, -13.5F, 17.0F);
    
    bodyModel[73] = new ModelRendererTurbo(this, 330, 195, 512, 256);
    bodyModel[73].addBox(0.0F, 0.0F, 0.0F, 8, 1, 5, 0.0F);
    bodyModel[73].setRotationPoint(-8.0F, -22.5F, 4.0F);
    
    bodyModel[74] = new ModelRendererTurbo(this, 370, 195, 512, 256);
    bodyModel[74].addBox(0.0F, 0.0F, -5.0F, 8, 1, 5, 0.0F);
    bodyModel[74].setRotationPoint(-8.0F, -22.5F, 4.0F);
    
    bodyModel[75] = new ModelRendererTurbo(this, 410, 195, 512, 256);
    bodyModel[75].addBox(-6.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F);
    bodyModel[75].setRotationPoint(-4.0F, -22.5F, -11.0F);
    
    bodyModel[76] = new ModelRendererTurbo(this, 450, 195, 512, 256);
    bodyModel[76].addBox(-4.0F, 0.0F, 0.0F, 4, 1, 7, 0.0F);
    bodyModel[76].setRotationPoint(-10.0F, -22.5F, -11.0F);
    (bodyModel[76]).rotateAngleZ = 0.4014257F;
    
    leftTrackWheelModels = new ModelRendererTurbo[7];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 170, 512, 256);
    leftTrackWheelModels[0].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[0].setRotationPoint(23.0F, 3.0F, -17.0F);
    
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 170, 512, 256);
    leftTrackWheelModels[1].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[1].setRotationPoint(8.0F, 3.0F, -17.0F);
    
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 170, 512, 256);
    leftTrackWheelModels[2].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[2].setRotationPoint(-8.0F, 3.0F, -17.0F);
    
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 170, 512, 256);
    leftTrackWheelModels[3].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[3].setRotationPoint(-23.0F, 3.0F, -17.0F);
    
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 50, 170, 512, 256);
    leftTrackWheelModels[4].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[4].setRotationPoint(34.0F, -3.0F, -15.0F);
    
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 100, 170, 512, 256);
    leftTrackWheelModels[5].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[5].setRotationPoint(-34.0F, 0.0F, -15.0F);
    
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 150, 170, 512, 256);
    leftTrackWheelModels[6].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 6, 0.0F);
    leftTrackWheelModels[6].setRotationPoint(0.0F, -5.0F, -15.0F);
    
    rightTrackWheelModels = new ModelRendererTurbo[7];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 170, 512, 256);
    rightTrackWheelModels[0].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[0].setRotationPoint(23.0F, 3.0F, 17.0F);
    
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 0, 170, 512, 256);
    rightTrackWheelModels[1].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[1].setRotationPoint(8.0F, 3.0F, 17.0F);
    
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 0, 170, 512, 256);
    rightTrackWheelModels[2].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[2].setRotationPoint(-8.0F, 3.0F, 17.0F);
    
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 0, 170, 512, 256);
    rightTrackWheelModels[3].addShape3D(6.0F, -6.0F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 3.0F, 12, 12, 40, 3, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[3].setRotationPoint(-23.0F, 3.0F, 17.0F);
    
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 50, 170, 512, 256);
    rightTrackWheelModels[4].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[4].setRotationPoint(34.0F, -3.0F, 15.0F);
    
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 100, 170, 512, 256);
    rightTrackWheelModels[5].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[5].setRotationPoint(-34.0F, 0.0F, 15.0F);
    
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 150, 170, 512, 256);
    rightTrackWheelModels[6].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 6, 0.0F);
    rightTrackWheelModels[6].setRotationPoint(0.0F, -5.0F, 15.0F);
    
    leftTrackModel = new ModelRendererTurbo[9];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 117, 512, 256);
    leftTrackModel[0].addBox(0.0F, 0.0F, -6.0F, 36, 2, 6, 0.0F);
    leftTrackModel[0].setRotationPoint(0.0F, -8.0F, -14.0F);
    
    leftTrackModel[1] = new ModelRendererTurbo(this, 100, 117, 512, 256);
    leftTrackModel[1].addShapeBox(0.0F, 0.0F, -6.0F, 4, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[1].setRotationPoint(36.0F, -8.0F, -14.0F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2] = new ModelRendererTurbo(this, 130, 117, 512, 256);
    leftTrackModel[2].addShapeBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F);
    leftTrackModel[2].setRotationPoint(37.0F, -5.0F, -14.0F);
    
    leftTrackModel[3] = new ModelRendererTurbo(this, 0, 195, 512, 256);
    leftTrackModel[3].addBox(0.0F, -2.0F, -6.0F, 17, 2, 6, 0.0F);
    leftTrackModel[3].setRotationPoint(26.0F, 10.0F, -14.0F);
    
    (leftTrackModel[3]).rotateAngleZ = 0.69813174F;
    leftTrackModel[4] = new ModelRendererTurbo(this, 0, 129, 512, 256);
    leftTrackModel[4].addBox(0.0F, 0.0F, -6.0F, 53, 2, 6, 0.0F);
    leftTrackModel[4].setRotationPoint(-27.0F, 8.0F, -14.0F);
    
    leftTrackModel[5] = new ModelRendererTurbo(this, 60, 195, 512, 256);
    leftTrackModel[5].addShapeBox(0.0F, -2.0F, -6.0F, 14, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[5].setRotationPoint(-39.0F, 2.0F, -14.0F);
    (leftTrackModel[5]).rotateAngleZ = -0.5934119F;
    
    leftTrackModel[6] = new ModelRendererTurbo(this, 120, 195, 512, 256);
    leftTrackModel[6].addBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F);
    leftTrackModel[6].setRotationPoint(-39.0F, -2.0F, -14.0F);
    
    leftTrackModel[7] = new ModelRendererTurbo(this, 150, 195, 512, 256);
    leftTrackModel[7].addShapeBox(-4.0F, 0.0F, -6.0F, 4, 2, 6, 0.0F, 0.2F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    leftTrackModel[7].setRotationPoint(-36.0F, -5.0F, -14.0F);
    (leftTrackModel[7]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[8] = new ModelRendererTurbo(this, 180, 195, 512, 256);
    leftTrackModel[8].addBox(-36.0F, 0.0F, -6.0F, 36, 2, 6, 0.0F);
    leftTrackModel[8].setRotationPoint(0.0F, -8.0F, -14.0F);
    (leftTrackModel[8]).rotateAngleZ = 0.08726646F;
    
    rightTrackModel = new ModelRendererTurbo[9];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 117, 512, 256);
    rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 36, 2, 6, 0.0F);
    rightTrackModel[0].setRotationPoint(0.0F, -8.0F, 14.0F);
    
    rightTrackModel[1] = new ModelRendererTurbo(this, 100, 117, 512, 256);
    rightTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[1].setRotationPoint(36.0F, -8.0F, 14.0F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2] = new ModelRendererTurbo(this, 130, 117, 512, 256);
    rightTrackModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F, 0.0F, 0.1F, 0.0F);
    rightTrackModel[2].setRotationPoint(37.0F, -5.0F, 14.0F);
    
    rightTrackModel[3] = new ModelRendererTurbo(this, 0, 195, 512, 256);
    rightTrackModel[3].addBox(0.0F, -2.0F, 0.0F, 17, 2, 6, 0.0F);
    rightTrackModel[3].setRotationPoint(26.0F, 10.0F, 14.0F);
    (rightTrackModel[3]).rotateAngleZ = 0.69813174F;
    
    rightTrackModel[4] = new ModelRendererTurbo(this, 0, 129, 512, 256);
    rightTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 53, 2, 6, 0.0F);
    rightTrackModel[4].setRotationPoint(-27.0F, 8.0F, 14.0F);
    
    rightTrackModel[5] = new ModelRendererTurbo(this, 60, 195, 512, 256);
    rightTrackModel[5].addShapeBox(0.0F, -2.0F, 0.0F, 14, 2, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.25F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[5].setRotationPoint(-39.0F, 2.0F, 14.0F);
    (rightTrackModel[5]).rotateAngleZ = -0.5934119F;
    
    rightTrackModel[6] = new ModelRendererTurbo(this, 120, 195, 512, 256);
    rightTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F);
    rightTrackModel[6].setRotationPoint(-39.0F, -2.0F, 14.0F);
    
    rightTrackModel[7] = new ModelRendererTurbo(this, 150, 195, 512, 256);
    rightTrackModel[7].addShapeBox(-4.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F, 0.2F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F);
    rightTrackModel[7].setRotationPoint(-36.0F, -5.0F, 14.0F);
    (rightTrackModel[7]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[8] = new ModelRendererTurbo(this, 180, 195, 512, 256);
    rightTrackModel[8].addBox(-36.0F, 0.0F, 0.0F, 36, 2, 6, 0.0F);
    rightTrackModel[8].setRotationPoint(0.0F, -8.0F, 14.0F);
    (rightTrackModel[8]).rotateAngleZ = 0.08726646F;
    
    barrelModel = new ModelRendererTurbo[3];
    barrelModel[0] = new ModelRendererTurbo(this, 0, 215, 512, 256);
    barrelModel[0].addShapeBox(0.0F, -1.5F, -1.5F, 45, 3, 3, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F);
    barrelModel[0].setRotationPoint(22.0F, -15.0F, -5.0F);
    
    barrelModel[1] = new ModelRendererTurbo(this, 120, 215, 512, 256);
    barrelModel[1].addShapeBox(12.0F, -3.0F, -3.0F, 5, 6, 6, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, -1.5F, 0.0F, -1.5F, -1.5F, 0.0F, 0.0F, 0.0F);
    barrelModel[1].setRotationPoint(22.0F, -15.0F, -5.0F);
    
    barrelModel[2] = new ModelRendererTurbo(this, 150, 215, 512, 256);
    barrelModel[2].addShapeBox(6.0F, -6.5F, -5.5F, 6, 10, 11, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.5F, -2.5F, 0.0F, -3.5F, -2.5F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -0.5F, -2.5F, 0.0F, -0.5F, -2.5F, 0.0F, -3.0F, 0.0F);
    barrelModel[2].setRotationPoint(22.0F, -15.0F, -5.0F);
    
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
