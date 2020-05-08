package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelType97
  extends ModelVehicle {
  int textureX = 500;
  int textureY = 500;



  
  public ModelType97() {
    bodyModel = new ModelRendererTurbo[148];
    
    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, 500, 500);
    bodyModel[0].addShapeBox(0.0F, 0.0F, -12.0F, 84, 5, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F);
    bodyModel[0].setRotationPoint(-43.0F, -5.0F, 0.0F);
    
    bodyModel[1] = new ModelRendererTurbo(this, 0, 35, 500, 500);
    bodyModel[1].addShapeBox(0.0F, 0.0F, -12.0F, 78, 3, 24, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(-40.0F, 0.0F, 0.0F);
    
    bodyModel[2] = new ModelRendererTurbo(this, 0, 65, 500, 500);
    bodyModel[2].addShapeBox(0.0F, 0.0F, 0.0F, 22, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, -1.5F, 0.0F, -3.0F, -2.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(19.0F, -10.0F, 0.0F);
    
    bodyModel[3] = new ModelRendererTurbo(this, 80, 65, 500, 500);
    bodyModel[3].addShapeBox(0.0F, 0.0F, -12.0F, 22, 5, 12, 0.0F, 0.0F, -1.0F, 0.0F, -3.0F, -2.5F, 0.0F, -5.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[3].setRotationPoint(19.0F, -10.0F, 0.0F);
    
    bodyModel[4] = new ModelRendererTurbo(this, 240, 0, 500, 500);
    bodyModel[4].addShapeBox(0.0F, 0.0F, -12.0F, 30, 11, 24, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[4].setRotationPoint(-9.0F, -16.0F, 0.0F);
    
    bodyModel[5] = new ModelRendererTurbo(this, 240, 45, 500, 500);
    bodyModel[5].addShapeBox(0.0F, 0.0F, -12.0F, 34, 6, 24, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[5].setRotationPoint(-43.0F, -11.0F, 0.0F);
    
    bodyModel[6] = new ModelRendererTurbo(this, 0, 90, 500, 500);
    bodyModel[6].addShapeBox(0.0F, 0.0F, 0.0F, 30, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[6].setRotationPoint(-9.0F, -16.0F, 12.0F);
    
    bodyModel[7] = new ModelRendererTurbo(this, 80, 90, 500, 500);
    bodyModel[7].addShapeBox(0.0F, 0.0F, -6.0F, 26, 5, 6, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[7].setRotationPoint(-9.0F, -16.0F, -12.0F);
    
    bodyModel[8] = new ModelRendererTurbo(this, 0, 110, 500, 500);
    bodyModel[8].addShapeBox(-21.0F, 0.0F, -18.0F, 21, 5, 36, 0.0F, 0.0F, -2.0F, -9.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -4.0F, 0.0F, -2.0F, -9.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F);
    bodyModel[8].setRotationPoint(-9.0F, -16.0F, 0.0F);
    
    bodyModel[9] = new ModelRendererTurbo(this, 130, 110, 500, 500);
    bodyModel[9].addShapeBox(-8.0F, 0.0F, -12.0F, 8, 3, 24, 0.0F, 0.0F, -2.9F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, -2.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[9].setRotationPoint(-30.0F, -14.0F, 0.0F);
    
    bodyModel[10] = new ModelRendererTurbo(this, 200, 110, 500, 500);
    bodyModel[10].addShapeBox(0.0F, 0.0F, 0.0F, 18, 6, 1, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[10].setRotationPoint(19.0F, -11.0F, 11.0F);
    
    bodyModel[11] = new ModelRendererTurbo(this, 200, 125, 500, 500);
    bodyModel[11].addShapeBox(0.0F, 0.0F, -1.0F, 18, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F);
    bodyModel[11].setRotationPoint(19.0F, -11.0F, -11.0F);
    
    bodyModel[12] = new ModelRendererTurbo(this, 165, 70, 500, 500);
    bodyModel[12].addShapeBox(0.0F, 0.0F, 0.0F, 20, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[12].setRotationPoint(17.0F, -11.0F, 12.0F);
    
    bodyModel[13] = new ModelRendererTurbo(this, 165, 90, 500, 500);
    bodyModel[13].addShapeBox(0.0F, 0.0F, -7.0F, 20, 1, 7, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[13].setRotationPoint(17.0F, -11.0F, -12.0F);
    
    bodyModel[14] = new ModelRendererTurbo(this, 0, 160, 500, 500);
    bodyModel[14].addShapeBox(0.0F, 0.0F, 0.0F, 3, 8, 13, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[14].setRotationPoint(19.0F, -16.0F, -12.0F);
    
    bodyModel[15] = new ModelRendererTurbo(this, 50, 160, 500, 500);
    bodyModel[15].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 12, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -3.0F, 0.0F, -1.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[15].setRotationPoint(22.0F, -16.0F, -14.0F);
    
    bodyModel[16] = new ModelRendererTurbo(this, 110, 160, 500, 500);
    bodyModel[16].addShapeBox(0.0F, 0.0F, 0.0F, 5, 5, 4, 0.0F, 0.0F, 0.0F, -2.0F, -4.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[16].setRotationPoint(17.0F, -16.0F, -18.0F);
    
    bodyModel[17] = new ModelRendererTurbo(this, 90, 160, 500, 500);
    bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 1, 2, 3, 0.0F);
    bodyModel[17].setRotationPoint(23.5F, -14.0F, -9.5F);
    
    bodyModel[18] = new ModelRendererTurbo(this, 90, 175, 500, 500);
    bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 1, 3, 3, 0.0F);
    bodyModel[18].setRotationPoint(23.2F, -11.0F, -9.5F);
    
    bodyModel[19] = new ModelRendererTurbo(this, 130, 145, 500, 500);
    bodyModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.7F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[19].setRotationPoint(22.0F, -11.0F, -12.0F);
    
    bodyModel[20] = new ModelRendererTurbo(this, 145, 145, 500, 500);
    bodyModel[20].addShapeBox(0.0F, 0.0F, 0.0F, 2, 3, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[20].setRotationPoint(22.0F, -11.0F, -11.0F);
    
    bodyModel[21] = new ModelRendererTurbo(this, 150, 160, 500, 500);
    bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 34, 1, 7, 0.0F);
    bodyModel[21].setRotationPoint(-43.0F, -11.0F, 12.0F);
    
    bodyModel[22] = new ModelRendererTurbo(this, 150, 175, 500, 500);
    bodyModel[22].addBox(0.0F, 0.0F, -7.0F, 34, 1, 7, 0.0F);
    bodyModel[22].setRotationPoint(-43.0F, -11.0F, -12.0F);
    
    bodyModel[23] = new ModelRendererTurbo(this, 170, 145, 500, 500);
    bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 5, 5, 2, 0.0F);
    bodyModel[23].setRotationPoint(17.0F, -16.0F, -14.0F);
    
    bodyModel[24] = new ModelRendererTurbo(this, 250, 110, 500, 500);
    bodyModel[24].addShapeBox(0.0F, 0.0F, 0.0F, 11, 6, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F);
    bodyModel[24].setRotationPoint(-43.0F, -11.0F, -12.0F);
    
    bodyModel[25] = new ModelRendererTurbo(this, 250, 125, 500, 500);
    bodyModel[25].addShapeBox(0.0F, 0.0F, -1.0F, 11, 6, 1, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[25].setRotationPoint(-43.0F, -11.0F, 12.0F);
    
    bodyModel[26] = new ModelRendererTurbo(this, 285, 110, 500, 500);
    bodyModel[26].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[26].setRotationPoint(-43.0F, -11.0F, -19.0F);
    (bodyModel[26]).rotateAngleZ = -0.7853982F;
    
    bodyModel[27] = new ModelRendererTurbo(this, 285, 125, 500, 500);
    bodyModel[27].addShapeBox(0.0F, 0.0F, -7.0F, 1, 3, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F);
    bodyModel[27].setRotationPoint(-43.0F, -11.0F, 19.0F);
    (bodyModel[27]).rotateAngleZ = -0.7853982F;
    
    bodyModel[28] = new ModelRendererTurbo(this, 315, 110, 500, 500);
    bodyModel[28].addShapeBox(0.0F, 0.0F, 0.0F, 2, 6, 1, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, 0.0F, -2.0F, -0.6F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6F, -2.0F, 0.0F, -0.6F);
    bodyModel[28].setRotationPoint(-45.0F, -11.0F, -12.0F);
    
    bodyModel[29] = new ModelRendererTurbo(this, 315, 125, 500, 500);
    bodyModel[29].addShapeBox(0.0F, 0.0F, -1.0F, 2, 6, 1, 0.0F, 0.0F, -2.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -2.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[29].setRotationPoint(-45.0F, -11.0F, 12.0F);
    
    bodyModel[30] = new ModelRendererTurbo(this, 0, 190, 500, 500);
    bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 13, 3, 6, 0.0F);
    bodyModel[30].setRotationPoint(-43.0F, -14.0F, 13.0F);
    
    bodyModel[31] = new ModelRendererTurbo(this, 45, 190, 500, 500);
    bodyModel[31].addBox(0.0F, 0.0F, -6.0F, 13, 3, 6, 0.0F);
    bodyModel[31].setRotationPoint(-43.0F, -14.0F, -13.0F);
    
    bodyModel[32] = new ModelRendererTurbo(this, 90, 190, 500, 500);
    bodyModel[32].addShapeBox(0.0F, 0.0F, 0.0F, 13, 1, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[32].setRotationPoint(-43.0F, -15.0F, 13.0F);
    
    bodyModel[33] = new ModelRendererTurbo(this, 130, 190, 500, 500);
    bodyModel[33].addShapeBox(0.0F, 0.0F, -6.0F, 13, 1, 6, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[33].setRotationPoint(-43.0F, -15.0F, -13.0F);
    
    bodyModel[34] = new ModelRendererTurbo(this, 180, 190, 500, 500);
    bodyModel[34].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[34].setRotationPoint(-30.0F, -14.0F, 14.0F);
    
    bodyModel[35] = new ModelRendererTurbo(this, 195, 190, 500, 500);
    bodyModel[35].addShapeBox(0.0F, 0.0F, -4.0F, 1, 3, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[35].setRotationPoint(-30.0F, -14.0F, -14.0F);
    
    bodyModel[36] = new ModelRendererTurbo(this, 215, 190, 500, 500);
    bodyModel[36].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[36].setRotationPoint(-29.0F, -13.0F, 9.0F);
    
    bodyModel[37] = new ModelRendererTurbo(this, 240, 190, 500, 500);
    bodyModel[37].addShapeBox(0.0F, 0.0F, -8.0F, 1, 1, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[37].setRotationPoint(-29.0F, -13.0F, -9.0F);
    
    bodyModel[38] = new ModelRendererTurbo(this, 270, 190, 500, 500);
    bodyModel[38].addShapeBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[38].setRotationPoint(-44.0F, -15.0F, 15.0F);
    
    bodyModel[39] = new ModelRendererTurbo(this, 270, 200, 500, 500);
    bodyModel[39].addShapeBox(0.0F, 0.0F, -2.0F, 2, 2, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[39].setRotationPoint(-44.0F, -15.0F, -15.0F);
    
    bodyModel[40] = new ModelRendererTurbo(this, 285, 190, 500, 500);
    bodyModel[40].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[40].setRotationPoint(-44.0F, -15.0F, 17.0F);
    
    bodyModel[41] = new ModelRendererTurbo(this, 285, 200, 500, 500);
    bodyModel[41].addShapeBox(0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[41].setRotationPoint(-44.0F, -15.0F, -17.0F);
    
    bodyModel[42] = new ModelRendererTurbo(this, 0, 210, 500, 500);
    bodyModel[42].addShapeBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[42].setRotationPoint(-30.0F, -16.0F, 18.0F);
    
    bodyModel[43] = new ModelRendererTurbo(this, 10, 210, 500, 500);
    bodyModel[43].addShapeBox(0.0F, 0.0F, -1.0F, 3, 5, 1, 0.0F, 0.0F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[43].setRotationPoint(-29.0F, -16.0F, 19.0F);
    (bodyModel[43]).rotateAngleY = -0.7906342F;
    
    bodyModel[44] = new ModelRendererTurbo(this, 25, 210, 500, 500);
    bodyModel[44].addShapeBox(0.0F, 0.0F, 0.0F, 1, 5, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[44].setRotationPoint(-28.0F, -16.0F, 14.0F);
    
    bodyModel[45] = new ModelRendererTurbo(this, 0, 220, 500, 500);
    bodyModel[45].addShapeBox(0.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F);
    bodyModel[45].setRotationPoint(-30.0F, -16.0F, -18.0F);
    
    bodyModel[46] = new ModelRendererTurbo(this, 10, 220, 500, 500);
    bodyModel[46].addShapeBox(0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[46].setRotationPoint(-29.0F, -16.0F, -19.0F);
    (bodyModel[46]).rotateAngleY = 0.7906342F;
    
    bodyModel[47] = new ModelRendererTurbo(this, 25, 220, 500, 500);
    bodyModel[47].addShapeBox(0.0F, 0.0F, -3.0F, 1, 5, 3, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[47].setRotationPoint(-28.0F, -16.0F, -14.0F);
    
    bodyModel[48] = new ModelRendererTurbo(this, 40, 210, 500, 500);
    bodyModel[48].addBox(0.0F, 0.0F, -9.0F, 6, 6, 18, 0.0F);
    bodyModel[48].setRotationPoint(-44.0F, -11.0F, 0.0F);
    
    bodyModel[49] = new ModelRendererTurbo(this, 95, 210, 500, 500);
    bodyModel[49].addShapeBox(0.0F, 0.0F, 0.0F, 5, 5, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    bodyModel[49].setRotationPoint(-44.0F, -4.5F, 11.0F);
    
    bodyModel[50] = new ModelRendererTurbo(this, 95, 220, 500, 500);
    bodyModel[50].addShapeBox(0.0F, 0.0F, -1.0F, 5, 5, 1, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    bodyModel[50].setRotationPoint(-44.0F, -4.5F, -11.0F);
    
    bodyModel[51] = new ModelRendererTurbo(this, 120, 210, 500, 500);
    bodyModel[51].addBox(0.0F, 0.0F, 0.0F, 5, 3, 2, 0.0F);
    bodyModel[51].setRotationPoint(-43.5F, -3.5F, 12.0F);
    
    bodyModel[52] = new ModelRendererTurbo(this, 120, 220, 500, 500);
    bodyModel[52].addBox(0.0F, 0.0F, -1.0F, 5, 3, 2, 0.0F);
    bodyModel[52].setRotationPoint(-43.5F, -3.5F, -12.0F);
    
    bodyModel[53] = new ModelRendererTurbo(this, 140, 210, 500, 500);
    bodyModel[53].addBox(0.0F, 0.0F, 0.0F, 35, 2, 2, 0.0F);
    bodyModel[53].setRotationPoint(-19.0F, -4.0F, 12.0F);
    
    bodyModel[54] = new ModelRendererTurbo(this, 140, 220, 500, 500);
    bodyModel[54].addBox(0.0F, 0.0F, -2.0F, 35, 2, 2, 0.0F);
    bodyModel[54].setRotationPoint(-19.0F, -4.0F, -12.0F);
    
    bodyModel[55] = new ModelRendererTurbo(this, 140, 240, 500, 500);
    bodyModel[55].addBox(0.0F, 0.0F, 0.0F, 7, 6, 3, 0.0F);
    bodyModel[55].setRotationPoint(34.5F, -5.5F, 11.0F);
    
    bodyModel[56] = new ModelRendererTurbo(this, 170, 240, 500, 500);
    bodyModel[56].addBox(0.0F, 0.0F, 0.0F, 2, 7, 1, 0.0F);
    bodyModel[56].setRotationPoint(32.0F, 1.0F, 12.0F);
    (bodyModel[56]).rotateAngleZ = -0.9599311F;
    
    bodyModel[57] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[57].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[57].setRotationPoint(27.0F, 4.0F, 13.0F);
    
    bodyModel[58] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[58].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[58].setRotationPoint(15.0F, 4.0F, 14.0F);
    
    bodyModel[59] = new ModelRendererTurbo(this, 205, 240, 500, 500);
    bodyModel[59].addShapeBox(0.0F, 0.0F, 0.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[59].setRotationPoint(11.0F, 0.0F, 15.5F);
    (bodyModel[59]).rotateAngleZ = -0.5585054F;
    
    bodyModel[60] = new ModelRendererTurbo(this, 205, 250, 500, 500);
    bodyModel[60].addShapeBox(-8.0F, 0.0F, 0.0F, 8, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F);
    bodyModel[60].setRotationPoint(9.0F, 0.0F, 15.5F);
    (bodyModel[60]).rotateAngleZ = 0.5585054F;
    
    bodyModel[61] = new ModelRendererTurbo(this, 230, 240, 500, 500);
    bodyModel[61].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    bodyModel[61].setRotationPoint(9.0F, 0.0F, 15.5F);
    
    bodyModel[62] = new ModelRendererTurbo(this, 0, 415, 500, 500);
    bodyModel[62].addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
    bodyModel[62].setRotationPoint(9.0F, 1.0F, 12.0F);
    
    bodyModel[63] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[63].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[63].setRotationPoint(3.0F, 4.0F, 14.0F);
    
    bodyModel[64] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[64].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[64].setRotationPoint(-8.0F, 4.0F, 14.0F);
    
    bodyModel[65] = new ModelRendererTurbo(this, 205, 240, 500, 500);
    bodyModel[65].addShapeBox(0.0F, 0.0F, 0.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[65].setRotationPoint(-12.0F, 0.0F, 15.5F);
    (bodyModel[65]).rotateAngleZ = -0.5585054F;
    
    bodyModel[66] = new ModelRendererTurbo(this, 205, 250, 500, 500);
    bodyModel[66].addShapeBox(-8.0F, 0.0F, 0.0F, 8, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F);
    bodyModel[66].setRotationPoint(-14.0F, 0.0F, 15.5F);
    (bodyModel[66]).rotateAngleZ = 0.5585054F;
    
    bodyModel[67] = new ModelRendererTurbo(this, 230, 240, 500, 500);
    bodyModel[67].addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
    bodyModel[67].setRotationPoint(-14.0F, 0.0F, 15.5F);
    
    bodyModel[68] = new ModelRendererTurbo(this, 0, 415, 500, 500);
    bodyModel[68].addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
    bodyModel[68].setRotationPoint(-14.0F, 1.0F, 12.0F);
    
    bodyModel[69] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[69].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[69].setRotationPoint(-20.0F, 4.0F, 14.0F);
    
    bodyModel[70] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[70].addBox(0.0F, 0.0F, 0.0F, 2, 2, 4, 0.0F);
    bodyModel[70].setRotationPoint(-32.0F, 4.0F, 13.0F);
    
    bodyModel[71] = new ModelRendererTurbo(this, 170, 240, 500, 500);
    bodyModel[71].addBox(-2.0F, 0.0F, 0.0F, 2, 7, 1, 0.0F);
    bodyModel[71].setRotationPoint(-35.0F, 1.0F, 12.0F);
    (bodyModel[71]).rotateAngleZ = 0.9599311F;
    
    bodyModel[72] = new ModelRendererTurbo(this, 195, 227, 500, 500);
    bodyModel[72].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[72].setRotationPoint(-2.5F, -5.5F, 12.0F);
    
    bodyModel[73] = new ModelRendererTurbo(this, 170, 227, 500, 500);
    bodyModel[73].addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
    bodyModel[73].setRotationPoint(23.0F, -4.5F, 12.0F);
    
    bodyModel[74] = new ModelRendererTurbo(this, 170, 227, 500, 500);
    bodyModel[74].addBox(-1.0F, -1.0F, 0.0F, 2, 2, 5, 0.0F);
    bodyModel[74].setRotationPoint(-26.0F, -4.5F, 12.0F);
    
    bodyModel[75] = new ModelRendererTurbo(this, 170, 227, 500, 500);
    bodyModel[75].addBox(0.0F, 0.0F, 0.0F, 2, 2, 5, 0.0F);
    bodyModel[75].setRotationPoint(-42.0F, -3.0F, 13.0F);
    
    bodyModel[76] = new ModelRendererTurbo(this, 245, 240, 500, 500);
    bodyModel[76].addBox(-3.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
    bodyModel[76].setRotationPoint(32.0F, 1.0F, 12.0F);
    (bodyModel[76]).rotateAngleZ = -0.9599311F;
    
    bodyModel[77] = new ModelRendererTurbo(this, 245, 250, 500, 500);
    bodyModel[77].addBox(0.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
    bodyModel[77].setRotationPoint(11.0F, 1.0F, 12.0F);
    
    bodyModel[78] = new ModelRendererTurbo(this, 265, 240, 500, 500);
    bodyModel[78].addBox(0.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
    bodyModel[78].setRotationPoint(17.0F, -4.0F, 12.0F);
    
    bodyModel[79] = new ModelRendererTurbo(this, 270, 250, 500, 500);
    bodyModel[79].addBox(1.0F, 0.0F, -0.5F, 10, 1, 2, 0.0F);
    bodyModel[79].setRotationPoint(18.0F, 1.0F, 12.0F);
    (bodyModel[79]).rotateAngleZ = 0.1570796F;
    
    bodyModel[80] = new ModelRendererTurbo(this, 20, 420, 500, 500);
    bodyModel[80].addBox(0.0F, 0.0F, 0.0F, 37, 1, 1, 0.0F);
    bodyModel[80].setRotationPoint(-20.0F, -3.5F, 12.0F);
    
    bodyModel[81] = new ModelRendererTurbo(this, 245, 240, 500, 500);
    bodyModel[81].addBox(0.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
    bodyModel[81].setRotationPoint(-35.0F, 1.0F, 12.0F);
    (bodyModel[81]).rotateAngleZ = 0.9599311F;
    
    bodyModel[82] = new ModelRendererTurbo(this, 245, 250, 500, 500);
    bodyModel[82].addBox(-8.0F, 0.0F, 0.0F, 8, 2, 1, 0.0F);
    bodyModel[82].setRotationPoint(-14.0F, 1.0F, 12.0F);
    
    bodyModel[83] = new ModelRendererTurbo(this, 265, 240, 500, 500);
    bodyModel[83].addBox(-2.0F, 0.0F, 0.0F, 2, 5, 1, 0.0F);
    bodyModel[83].setRotationPoint(-20.0F, -4.0F, 12.0F);
    
    bodyModel[84] = new ModelRendererTurbo(this, 270, 250, 500, 500);
    bodyModel[84].addBox(-11.0F, 0.0F, -1.0F, 10, 1, 2, 0.0F);
    bodyModel[84].setRotationPoint(-21.0F, 1.0F, 12.0F);
    (bodyModel[84]).rotateAngleZ = -0.1570796F;
    
    bodyModel[85] = new ModelRendererTurbo(this, 140, 240, 500, 500);
    bodyModel[85].addBox(0.0F, 0.0F, -3.0F, 7, 6, 3, 0.0F);
    bodyModel[85].setRotationPoint(34.5F, -5.5F, -11.0F);
    
    bodyModel[86] = new ModelRendererTurbo(this, 170, 240, 500, 500);
    bodyModel[86].addBox(0.0F, 0.0F, -1.0F, 2, 7, 1, 0.0F);
    bodyModel[86].setRotationPoint(32.0F, 1.0F, -12.0F);
    (bodyModel[86]).rotateAngleZ = -0.9599311F;
    
    bodyModel[87] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[87].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[87].setRotationPoint(27.0F, 4.0F, -13.0F);
    
    bodyModel[88] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[88].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[88].setRotationPoint(15.0F, 4.0F, -14.0F);
    
    bodyModel[89] = new ModelRendererTurbo(this, 205, 240, 500, 500);
    bodyModel[89].addShapeBox(0.0F, 0.0F, -1.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[89].setRotationPoint(11.0F, 0.0F, -15.5F);
    (bodyModel[89]).rotateAngleZ = -0.5585054F;
    
    bodyModel[90] = new ModelRendererTurbo(this, 205, 250, 500, 500);
    bodyModel[90].addShapeBox(-8.0F, 0.0F, -1.0F, 8, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F);
    bodyModel[90].setRotationPoint(9.0F, 0.0F, -15.5F);
    (bodyModel[90]).rotateAngleZ = 0.5585054F;
    
    bodyModel[91] = new ModelRendererTurbo(this, 230, 240, 500, 500);
    bodyModel[91].addBox(0.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F);
    bodyModel[91].setRotationPoint(9.0F, 0.0F, -15.5F);
    
    bodyModel[92] = new ModelRendererTurbo(this, 0, 415, 500, 500);
    bodyModel[92].addBox(0.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F);
    bodyModel[92].setRotationPoint(9.0F, 1.0F, -12.0F);
    
    bodyModel[93] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[93].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[93].setRotationPoint(3.0F, 4.0F, -14.0F);
    
    bodyModel[94] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[94].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[94].setRotationPoint(-8.0F, 4.0F, -14.0F);
    
    bodyModel[95] = new ModelRendererTurbo(this, 205, 240, 500, 500);
    bodyModel[95].addShapeBox(0.0F, 0.0F, -1.0F, 8, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[95].setRotationPoint(-12.0F, 0.0F, -15.5F);
    (bodyModel[95]).rotateAngleZ = -0.5585054F;
    
    bodyModel[96] = new ModelRendererTurbo(this, 205, 250, 500, 500);
    bodyModel[96].addShapeBox(-8.0F, 0.0F, -1.0F, 8, 4, 1, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F);
    bodyModel[96].setRotationPoint(-14.0F, 0.0F, -15.5F);
    (bodyModel[96]).rotateAngleZ = 0.5585054F;
    
    bodyModel[97] = new ModelRendererTurbo(this, 230, 240, 500, 500);
    bodyModel[97].addBox(0.0F, 0.0F, -1.0F, 2, 2, 1, 0.0F);
    bodyModel[97].setRotationPoint(-14.0F, 0.0F, -15.5F);
    
    bodyModel[98] = new ModelRendererTurbo(this, 0, 415, 500, 500);
    bodyModel[98].addBox(0.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F);
    bodyModel[98].setRotationPoint(-14.0F, 1.0F, -12.0F);
    
    bodyModel[99] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[99].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[99].setRotationPoint(-20.0F, 4.0F, -14.0F);
    
    bodyModel[100] = new ModelRendererTurbo(this, 185, 240, 500, 500);
    bodyModel[100].addBox(0.0F, 0.0F, -4.0F, 2, 2, 4, 0.0F);
    bodyModel[100].setRotationPoint(-32.0F, 4.0F, -13.0F);
    
    bodyModel[101] = new ModelRendererTurbo(this, 170, 240, 500, 500);
    bodyModel[101].addBox(-2.0F, 0.0F, -1.0F, 2, 7, 1, 0.0F);
    bodyModel[101].setRotationPoint(-35.0F, 1.0F, -12.0F);
    (bodyModel[101]).rotateAngleZ = 0.9599311F;
    
    bodyModel[102] = new ModelRendererTurbo(this, 195, 227, 500, 500);
    bodyModel[102].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[102].setRotationPoint(-2.5F, -5.5F, -12.0F);
    
    bodyModel[103] = new ModelRendererTurbo(this, 170, 227, 500, 500);
    bodyModel[103].addBox(-1.0F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
    bodyModel[103].setRotationPoint(23.0F, -4.5F, -12.0F);
    
    bodyModel[104] = new ModelRendererTurbo(this, 170, 227, 500, 500);
    bodyModel[104].addBox(-1.0F, -1.0F, -5.0F, 2, 2, 5, 0.0F);
    bodyModel[104].setRotationPoint(-26.0F, -4.5F, -12.0F);
    
    bodyModel[105] = new ModelRendererTurbo(this, 170, 227, 500, 500);
    bodyModel[105].addBox(0.0F, 0.0F, -5.0F, 2, 2, 5, 0.0F);
    bodyModel[105].setRotationPoint(-42.0F, -3.0F, -13.0F);
    
    bodyModel[106] = new ModelRendererTurbo(this, 245, 240, 500, 500);
    bodyModel[106].addBox(-3.0F, 0.0F, -1.0F, 3, 2, 1, 0.0F);
    bodyModel[106].setRotationPoint(32.0F, 1.0F, -12.0F);
    (bodyModel[106]).rotateAngleZ = -0.9599311F;
    
    bodyModel[107] = new ModelRendererTurbo(this, 245, 250, 500, 500);
    bodyModel[107].addBox(0.0F, 0.0F, -1.0F, 8, 2, 1, 0.0F);
    bodyModel[107].setRotationPoint(11.0F, 1.0F, -12.0F);
    
    bodyModel[108] = new ModelRendererTurbo(this, 265, 240, 500, 500);
    bodyModel[108].addBox(0.0F, 0.0F, -1.0F, 2, 5, 1, 0.0F);
    bodyModel[108].setRotationPoint(17.0F, -4.0F, -12.0F);
    
    bodyModel[109] = new ModelRendererTurbo(this, 270, 250, 500, 500);
    bodyModel[109].addBox(1.0F, 0.0F, -1.5F, 10, 1, 2, 0.0F);
    bodyModel[109].setRotationPoint(18.0F, 1.0F, -12.0F);
    (bodyModel[109]).rotateAngleZ = 0.1570796F;
    
    bodyModel[110] = new ModelRendererTurbo(this, 20, 420, 500, 500);
    bodyModel[110].addBox(0.0F, 0.0F, -1.0F, 37, 1, 1, 0.0F);
    bodyModel[110].setRotationPoint(-20.0F, -3.5F, -12.0F);
    
    bodyModel[111] = new ModelRendererTurbo(this, 245, 240, 500, 500);
    bodyModel[111].addBox(0.0F, 0.0F, -1.0F, 3, 2, 1, 0.0F);
    bodyModel[111].setRotationPoint(-35.0F, 1.0F, -12.0F);
    (bodyModel[111]).rotateAngleZ = 0.9599311F;
    
    bodyModel[112] = new ModelRendererTurbo(this, 245, 250, 500, 500);
    bodyModel[112].addBox(-8.0F, 0.0F, -1.0F, 8, 2, 1, 0.0F);
    bodyModel[112].setRotationPoint(-14.0F, 1.0F, -12.0F);
    
    bodyModel[113] = new ModelRendererTurbo(this, 265, 240, 500, 500);
    bodyModel[113].addBox(-2.0F, 0.0F, -1.0F, 2, 5, 1, 0.0F);
    bodyModel[113].setRotationPoint(-20.0F, -4.0F, -12.0F);
    
    bodyModel[114] = new ModelRendererTurbo(this, 270, 250, 500, 500);
    bodyModel[114].addBox(-11.0F, 0.0F, -1.0F, 10, 1, 2, 0.0F);
    bodyModel[114].setRotationPoint(-21.0F, 1.0F, -12.0F);
    (bodyModel[114]).rotateAngleZ = -0.1570796F;
    
    bodyModel[115] = new ModelRendererTurbo(this, 80, 295, 500, 500);
    bodyModel[115].addShapeBox(0.0F, 0.0F, 0.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[115].setRotationPoint(34.5F, 0.5F, 11.0F);
    
    bodyModel[116] = new ModelRendererTurbo(this, 110, 295, 500, 500);
    bodyModel[116].addShapeBox(0.0F, 0.0F, -3.0F, 7, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[116].setRotationPoint(34.5F, 0.5F, -11.0F);
    
    bodyModel[117] = new ModelRendererTurbo(this, 140, 295, 500, 500);
    bodyModel[117].addShapeBox(0.0F, 0.0F, 0.0F, 7, 3, 2, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[117].setRotationPoint(34.5F, -8.5F, 11.0F);
    
    bodyModel[118] = new ModelRendererTurbo(this, 170, 295, 500, 500);
    bodyModel[118].addShapeBox(0.0F, 0.0F, -2.0F, 7, 3, 2, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[118].setRotationPoint(34.5F, -8.5F, -11.0F);
    
    bodyModel[119] = new ModelRendererTurbo(this, 0, 400, 500, 500);
    bodyModel[119].addBox(-0.5F, 2.0F, -1.0F, 1, 3, 7, 0.0F);
    bodyModel[119].setRotationPoint(19.0F, -16.0F, 4.0F);
    (bodyModel[119]).rotateAngleZ = 0.1745329F;
    
    bodyModel[120] = new ModelRendererTurbo(this, 25, 400, 500, 500);
    bodyModel[120].addShapeBox(-0.5F, 1.0F, 0.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[120].setRotationPoint(19.0F, -16.0F, 4.0F);
    (bodyModel[120]).rotateAngleZ = 0.1745329F;
    
    bodyModel[121] = new ModelRendererTurbo(this, 40, 400, 500, 500);
    bodyModel[121].addShapeBox(-0.5F, 5.0F, 0.0F, 1, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[121].setRotationPoint(19.0F, -16.0F, 4.0F);
    (bodyModel[121]).rotateAngleZ = 0.1745329F;
    
    bodyModel[122] = new ModelRendererTurbo(this, 60, 400, 500, 500);
    bodyModel[122].addShapeBox(0.0F, -0.5F, 0.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[122].setRotationPoint(19.0F, -13.0F, 6.0F);
    
    bodyModel[123] = new ModelRendererTurbo(this, 60, 410, 500, 500);
    bodyModel[123].addShapeBox(0.0F, -0.5F, 0.0F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.4F, -2.0F, 0.0F, -0.4F, -2.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F);
    bodyModel[123].setRotationPoint(19.0F, -12.0F, 6.0F);
    
    bodyModel[124] = new ModelRendererTurbo(this, 90, 400, 500, 500);
    bodyModel[124].addBox(-20.0F, -0.2F, -6.0F, 18, 1, 12, 0.0F);
    bodyModel[124].setRotationPoint(-9.0F, -16.0F, 0.0F);
    (bodyModel[124]).rotateAngleZ = 0.09599311F;
    
    bodyModel[125] = new ModelRendererTurbo(this, 160, 400, 500, 500);
    bodyModel[125].addBox(0.0F, 0.0F, -0.5F, 1, 3, 1, 0.0F);
    bodyModel[125].setRotationPoint(36.0F, -9.0F, 0.0F);
    
    bodyModel[126] = new ModelRendererTurbo(this, 160, 410, 500, 500);
    bodyModel[126].addBox(-0.5F, -2.0F, -1.0F, 2, 2, 2, 0.0F);
    bodyModel[126].setRotationPoint(36.0F, -9.0F, 0.0F);
    
    bodyModel[127] = new ModelRendererTurbo(this, 175, 400, 500, 500);
    bodyModel[127].addBox(-2.0F, 0.0F, -1.0F, 2, 4, 2, 0.0F);
    bodyModel[127].setRotationPoint(41.2F, -5.0F, 0.0F);
    (bodyModel[127]).rotateAngleZ = -0.5759587F;
    
    bodyModel[128] = new ModelRendererTurbo(this, 190, 400, 500, 500);
    bodyModel[128].addBox(0.0F, 0.5F, -0.5F, 1, 1, 1, 0.0F);
    bodyModel[128].setRotationPoint(41.2F, -5.0F, 0.0F);
    (bodyModel[128]).rotateAngleZ = -0.5759587F;
    
    bodyModel[129] = new ModelRendererTurbo(this, 200, 400, 500, 500);
    bodyModel[129].addShapeBox(-0.5F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[129].setRotationPoint(41.2F, -4.0F, 0.5F);
    
    bodyModel[130] = new ModelRendererTurbo(this, 200, 410, 500, 500);
    bodyModel[130].addShapeBox(-0.5F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[130].setRotationPoint(41.2F, -4.0F, -0.5F);
    
    bodyModel[131] = new ModelRendererTurbo(this, 215, 400, 500, 500);
    bodyModel[131].addShapeBox(-0.5F, 0.0F, -0.5F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[131].setRotationPoint(41.2F, -3.0F, 0.0F);

    
    bodyModel[132] = new ModelRendererTurbo(this, 215, 410, 500, 500);
    bodyModel[132].addBox(-2.0F, 0.0F, 0.0F, 3, 2, 1, 0.0F);
    bodyModel[132].setRotationPoint(-40.0F, -1.0F, 9.0F);
    
    bodyModel[133] = new ModelRendererTurbo(this, 200, 400, 500, 500);
    bodyModel[133].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[133].setRotationPoint(-42.0F, 0.5F, 10.0F);
    
    bodyModel[134] = new ModelRendererTurbo(this, 200, 410, 500, 500);
    bodyModel[134].addShapeBox(0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[134].setRotationPoint(-42.0F, 0.5F, 9.0F);
    
    bodyModel[135] = new ModelRendererTurbo(this, 215, 400, 500, 500);
    bodyModel[135].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[135].setRotationPoint(-42.0F, 1.5F, 9.0F);
    
    bodyModel[136] = new ModelRendererTurbo(this, 215, 410, 500, 500);
    bodyModel[136].addBox(-2.0F, 0.0F, -1.0F, 3, 2, 1, 0.0F);
    bodyModel[136].setRotationPoint(-40.0F, -1.0F, -9.0F);
    
    bodyModel[137] = new ModelRendererTurbo(this, 200, 400, 500, 500);
    bodyModel[137].addShapeBox(0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[137].setRotationPoint(-42.0F, 0.5F, -10.0F);
    
    bodyModel[138] = new ModelRendererTurbo(this, 200, 410, 500, 500);
    bodyModel[138].addShapeBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F);
    bodyModel[138].setRotationPoint(-42.0F, 0.5F, -9.0F);
    
    bodyModel[139] = new ModelRendererTurbo(this, 215, 400, 500, 500);
    bodyModel[139].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[139].setRotationPoint(-42.0F, 1.5F, -10.0F);
    
    bodyModel[140] = new ModelRendererTurbo(this, 230, 400, 500, 500);
    bodyModel[140].addShapeBox(0.0F, 0.5F, 0.0F, 1, 1, 14, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F);
    bodyModel[140].setRotationPoint(-41.0F, -12.0F, -6.0F);
    
    bodyModel[141] = new ModelRendererTurbo(this, 265, 400, 500, 500);
    bodyModel[141].addBox(-1.5F, 0.6F, 0.0F, 4, 1, 2, 0.0F);
    bodyModel[141].setRotationPoint(-41.0F, -12.0F, -7.0F);
    
    bodyModel[142] = new ModelRendererTurbo(this, 265, 410, 500, 500);
    bodyModel[142].addShapeBox(-1.5F, 0.6F, -2.0F, 4, 1, 2, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, -1.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[142].setRotationPoint(-41.0F, -12.0F, -7.0F);
    
    bodyModel[143] = new ModelRendererTurbo(this, 285, 400, 500, 500);
    bodyModel[143].addBox(0.0F, 0.5F, 0.0F, 2, 3, 1, 0.0F);
    bodyModel[143].setRotationPoint(-41.5F, -14.0F, -3.0F);
    
    bodyModel[144] = new ModelRendererTurbo(this, 285, 400, 500, 500);
    bodyModel[144].addBox(0.0F, 0.5F, 0.0F, 2, 3, 1, 0.0F);
    bodyModel[144].setRotationPoint(-41.5F, -14.0F, 6.0F);
    
    bodyModel[145] = new ModelRendererTurbo(this, 230, 400, 500, 500);
    bodyModel[145].addShapeBox(0.0F, 0.0F, 0.0F, 1, 1, 14, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F);
    bodyModel[145].setRotationPoint(-41.0F, -13.0F, -6.0F);
    
    bodyModel[146] = new ModelRendererTurbo(this, 285, 410, 500, 500);
    bodyModel[146].addShapeBox(0.0F, -0.5F, 0.0F, 3, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F);
    bodyModel[146].setRotationPoint(-41.0F, -13.0F, 8.0F);
    
    bodyModel[147] = new ModelRendererTurbo(this, 300, 400, 500, 500);
    bodyModel[147].addShapeBox(-2.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.9F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.9F);
    bodyModel[147].setRotationPoint(-41.0F, -13.0F, 8.0F);
    
    leftTrackWheelModels = new ModelRendererTurbo[20];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 240, 500, 500);
    leftTrackWheelModels[0].addShape3D(4.0F, -4.0F, -5.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 5.0F, 8, 8, 28, 5, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[0].setRotationPoint(38.0F, -2.0F, 13.5F);
    
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[1].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[1].setRotationPoint(28.0F, 5.0F, 13.5F);
    
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[2].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[2].setRotationPoint(28.0F, 5.0F, 16.5F);
    
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[3].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[3].setRotationPoint(16.0F, 5.0F, 13.5F);
    
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[4].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[4].setRotationPoint(16.0F, 5.0F, 16.5F);
    
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[5].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[5].setRotationPoint(4.0F, 5.0F, 13.5F);
    
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[6].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[6].setRotationPoint(4.0F, 5.0F, 16.5F);
    
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[7].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[7].setRotationPoint(-7.0F, 5.0F, 13.5F);
    
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[8].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[8].setRotationPoint(-7.0F, 5.0F, 16.5F);
    
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[9].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[9].setRotationPoint(-19.0F, 5.0F, 13.5F);
    
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[10].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[10].setRotationPoint(-19.0F, 5.0F, 16.5F);
    
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[11].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[11].setRotationPoint(-31.0F, 5.0F, 13.5F);
    
    leftTrackWheelModels[12] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    leftTrackWheelModels[12].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[12].setRotationPoint(-31.0F, 5.0F, 16.5F);
    
    leftTrackWheelModels[13] = new ModelRendererTurbo(this, 75, 240, 500, 500);
    leftTrackWheelModels[13].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[13].setRotationPoint(-40.0F, -2.0F, 13.5F);
    
    leftTrackWheelModels[14] = new ModelRendererTurbo(this, 75, 240, 500, 500);
    leftTrackWheelModels[14].addShape3D(4.0F, -4.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[14].setRotationPoint(-40.0F, -2.0F, 16.5F);
    
    leftTrackWheelModels[15] = new ModelRendererTurbo(this, 105, 240, 500, 500);
    leftTrackWheelModels[15].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 1, 0.0F);
    leftTrackWheelModels[15].setRotationPoint(-26.0F, -4.5F, 14.5F);
    
    leftTrackWheelModels[16] = new ModelRendererTurbo(this, 105, 240, 500, 500);
    leftTrackWheelModels[16].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 1, 0.0F);
    leftTrackWheelModels[16].setRotationPoint(-26.0F, -4.5F, 16.5F);
    
    leftTrackWheelModels[17] = new ModelRendererTurbo(this, 120, 240, 500, 500);
    leftTrackWheelModels[17].addBox(-1.0F, -1.0F, 0.0F, 2, 2, 1, 0.0F);
    leftTrackWheelModels[17].setRotationPoint(-2.0F, -5.0F, 14.5F);
    
    leftTrackWheelModels[18] = new ModelRendererTurbo(this, 105, 240, 500, 500);
    leftTrackWheelModels[18].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 1, 0.0F);
    leftTrackWheelModels[18].setRotationPoint(23.0F, -4.5F, 14.5F);
    
    leftTrackWheelModels[19] = new ModelRendererTurbo(this, 105, 240, 500, 500);
    leftTrackWheelModels[19].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 1, 0.0F);
    leftTrackWheelModels[19].setRotationPoint(23.0F, -4.5F, 16.5F);
    
    leftTrackModel = new ModelRendererTurbo[8];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 265, 500, 500);
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 83, 2, 6, 0.0F);
    leftTrackModel[0].setRotationPoint(-43.0F, -7.0F, 13.0F);
    
    leftTrackModel[1] = new ModelRendererTurbo(this, 0, 280, 500, 500);
    leftTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F);
    leftTrackModel[1].setRotationPoint(40.0F, -7.0F, 13.0F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2] = new ModelRendererTurbo(this, 25, 280, 500, 500);
    leftTrackModel[2].addBox(-2.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F);
    leftTrackModel[2].setRotationPoint(43.0F, -4.0F, 13.0F);
    
    leftTrackModel[3] = new ModelRendererTurbo(this, 50, 280, 500, 500);
    leftTrackModel[3].addBox(-2.0F, 0.0F, 0.0F, 2, 16, 6, 0.0F);
    leftTrackModel[3].setRotationPoint(43.0F, 0.0F, 13.0F);
    (leftTrackModel[3]).rotateAngleZ = -0.9005899F;
    
    leftTrackModel[4] = new ModelRendererTurbo(this, 75, 280, 500, 500);
    leftTrackModel[4].addBox(-0.5F, -2.0F, 0.0F, 64, 2, 6, 0.0F);
    leftTrackModel[4].setRotationPoint(-33.0F, 10.0F, 13.0F);
    
    leftTrackModel[5] = new ModelRendererTurbo(this, 220, 280, 500, 500);
    leftTrackModel[5].addBox(0.0F, -2.0F, 0.0F, 16, 2, 6, 0.0F);
    leftTrackModel[5].setRotationPoint(-46.0F, 0.0F, 13.0F);
    (leftTrackModel[5]).rotateAngleZ = -0.6771877F;
    
    leftTrackModel[6] = new ModelRendererTurbo(this, 25, 295, 500, 500);
    leftTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 2, 4, 6, 0.0F);
    leftTrackModel[6].setRotationPoint(-46.0F, -4.0F, 13.0F);
    
    leftTrackModel[7] = new ModelRendererTurbo(this, 0, 295, 500, 500);
    leftTrackModel[7].addBox(-4.0F, 0.0F, 0.0F, 4, 2, 6, 0.0F);
    leftTrackModel[7].setRotationPoint(-43.0F, -7.0F, 13.0F);
    (leftTrackModel[7]).rotateAngleZ = 0.7853982F;
    
    rightTrackWheelModels = new ModelRendererTurbo[20];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 0, 240, 500, 500);
    rightTrackWheelModels[0].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 5.0F, 8, 8, 28, 5, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[0].setRotationPoint(38.0F, -2.0F, -13.5F);
    
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[1].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[1].setRotationPoint(28.0F, 5.0F, -13.5F);
    
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[2].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[2].setRotationPoint(28.0F, 5.0F, -16.5F);
    
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[3].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[3].setRotationPoint(16.0F, 5.0F, -13.5F);
    
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[4].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[4].setRotationPoint(16.0F, 5.0F, -16.5F);
    
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[5].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[5].setRotationPoint(4.0F, 5.0F, -13.5F);
    
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[6].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[6].setRotationPoint(4.0F, 5.0F, -16.5F);
    
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[7].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[7].setRotationPoint(-7.0F, 5.0F, -13.5F);
    
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[8].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[8].setRotationPoint(-7.0F, 5.0F, -16.5F);
    
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[9].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[9].setRotationPoint(-19.0F, 5.0F, -13.5F);
    
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[10].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[10].setRotationPoint(-19.0F, 5.0F, -16.5F);
    
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[11].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[11].setRotationPoint(-31.0F, 5.0F, -13.5F);
    
    rightTrackWheelModels[12] = new ModelRendererTurbo(this, 45, 240, 500, 500);
    rightTrackWheelModels[12].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[12].setRotationPoint(-31.0F, 5.0F, -16.5F);
    
    rightTrackWheelModels[13] = new ModelRendererTurbo(this, 75, 240, 500, 500);
    rightTrackWheelModels[13].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[13].setRotationPoint(-40.0F, -2.0F, -13.5F);
    
    rightTrackWheelModels[14] = new ModelRendererTurbo(this, 75, 240, 500, 500);
    rightTrackWheelModels[14].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 8, 8, 28, 2, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[14].setRotationPoint(-40.0F, -2.0F, -16.5F);
    
    rightTrackWheelModels[15] = new ModelRendererTurbo(this, 105, 240, 500, 500);
    rightTrackWheelModels[15].addBox(-1.5F, -1.5F, -1.0F, 3, 3, 1, 0.0F);
    rightTrackWheelModels[15].setRotationPoint(-26.0F, -4.5F, -14.5F);
    
    rightTrackWheelModels[16] = new ModelRendererTurbo(this, 105, 240, 500, 500);
    rightTrackWheelModels[16].addBox(-1.5F, -1.5F, -1.0F, 3, 3, 1, 0.0F);
    rightTrackWheelModels[16].setRotationPoint(-26.0F, -4.5F, -16.5F);
    
    rightTrackWheelModels[17] = new ModelRendererTurbo(this, 120, 240, 500, 500);
    rightTrackWheelModels[17].addBox(-1.0F, -1.0F, -1.0F, 2, 2, 1, 0.0F);
    rightTrackWheelModels[17].setRotationPoint(-2.0F, -5.0F, -14.5F);
    
    rightTrackWheelModels[18] = new ModelRendererTurbo(this, 105, 240, 500, 500);
    rightTrackWheelModels[18].addBox(-1.5F, -1.5F, -1.0F, 3, 3, 1, 0.0F);
    rightTrackWheelModels[18].setRotationPoint(23.0F, -4.5F, -14.5F);
    
    rightTrackWheelModels[19] = new ModelRendererTurbo(this, 105, 240, 500, 500);
    rightTrackWheelModels[19].addBox(-1.5F, -1.5F, -1.0F, 3, 3, 1, 0.0F);
    rightTrackWheelModels[19].setRotationPoint(23.0F, -4.5F, -16.5F);
    
    rightTrackModel = new ModelRendererTurbo[8];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 265, 500, 500);
    rightTrackModel[0].addBox(0.0F, 0.0F, -6.0F, 83, 2, 6, 0.0F);
    rightTrackModel[0].setRotationPoint(-43.0F, -7.0F, -13.0F);
    
    rightTrackModel[1] = new ModelRendererTurbo(this, 0, 280, 500, 500);
    rightTrackModel[1].addBox(0.0F, 0.0F, -6.0F, 4, 2, 6, 0.0F);
    rightTrackModel[1].setRotationPoint(40.0F, -7.0F, -13.0F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2] = new ModelRendererTurbo(this, 25, 280, 500, 500);
    rightTrackModel[2].addBox(-2.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F);
    rightTrackModel[2].setRotationPoint(43.0F, -4.0F, -13.0F);
    
    rightTrackModel[3] = new ModelRendererTurbo(this, 50, 280, 500, 500);
    rightTrackModel[3].addBox(-2.0F, 0.0F, -6.0F, 2, 16, 6, 0.0F);
    rightTrackModel[3].setRotationPoint(43.0F, 0.0F, -13.0F);
    (rightTrackModel[3]).rotateAngleZ = -0.9005899F;
    
    rightTrackModel[4] = new ModelRendererTurbo(this, 75, 280, 500, 500);
    rightTrackModel[4].addBox(-0.5F, -2.0F, -6.0F, 64, 2, 6, 0.0F);
    rightTrackModel[4].setRotationPoint(-33.0F, 10.0F, -13.0F);
    
    rightTrackModel[5] = new ModelRendererTurbo(this, 220, 280, 500, 500);
    rightTrackModel[5].addBox(0.0F, -2.0F, -6.0F, 16, 2, 6, 0.0F);
    rightTrackModel[5].setRotationPoint(-46.0F, 0.0F, -13.0F);
    (rightTrackModel[5]).rotateAngleZ = -0.6771877F;
    
    rightTrackModel[6] = new ModelRendererTurbo(this, 25, 295, 500, 500);
    rightTrackModel[6].addBox(0.0F, 0.0F, -6.0F, 2, 4, 6, 0.0F);
    rightTrackModel[6].setRotationPoint(-46.0F, -4.0F, -13.0F);
    
    rightTrackModel[7] = new ModelRendererTurbo(this, 0, 295, 500, 500);
    rightTrackModel[7].addBox(-4.0F, 0.0F, -6.0F, 4, 2, 6, 0.0F);
    rightTrackModel[7].setRotationPoint(-43.0F, -7.0F, -13.0F);
    (rightTrackModel[7]).rotateAngleZ = 0.7853982F;
    
    turretModel = new ModelRendererTurbo[39];
    turretModel[0] = new ModelRendererTurbo(this, 0, 310, 500, 500);
    turretModel[0].addShapeBox(2.0F, -8.0F, -11.0F, 4, 8, 22, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretModel[0].setRotationPoint(6.0F, -16.0F, -5.0F);
    
    turretModel[1] = new ModelRendererTurbo(this, 70, 310, 500, 500);
    turretModel[1].addShapeBox(6.0F, -8.0F, -9.0F, 5, 8, 18, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, -1.5F, -4.5F, -1.0F, -1.5F, -4.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
    turretModel[1].setRotationPoint(6.0F, -16.0F, -5.0F);
    
    turretModel[2] = new ModelRendererTurbo(this, 130, 310, 500, 500);
    turretModel[2].addShapeBox(-15.0F, -8.0F, 1.0F, 13, 8, 10, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[2].setRotationPoint(6.0F, -16.0F, -5.0F);
    
    turretModel[3] = new ModelRendererTurbo(this, 185, 310, 500, 500);
    turretModel[3].addShapeBox(-6.0F, -8.0F, -11.0F, 4, 8, 12, 0.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[3].setRotationPoint(6.0F, -16.0F, -5.0F);
    
    turretModel[4] = new ModelRendererTurbo(this, 235, 310, 500, 500);
    turretModel[4].addShapeBox(-15.0F, -8.0F, -7.0F, 9, 8, 10, 0.0F, -1.0F, 0.0F, -9.9F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -9.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[4].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[5] = new ModelRendererTurbo(this, 285, 310, 500, 500);
    turretModel[5].addShapeBox(-2.0F, -8.0F, -11.0F, 4, 8, 22, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[5].setRotationPoint(6.0F, -16.0F, -5.0F);
    
    turretModel[6] = new ModelRendererTurbo(this, 0, 350, 500, 500);
    turretModel[6].addBox(-0.5F, 3.0F, -2.0F, 1, 2, 4, 0.0F);
    turretModel[6].setRotationPoint(-8.0F, -24.0F, 1.0F);
    (turretModel[6]).rotateAngleZ = -0.122173F;
    
    turretModel[7] = new ModelRendererTurbo(this, 20, 350, 500, 500);
    turretModel[7].addShapeBox(-0.5F, 5.0F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    turretModel[7].setRotationPoint(-8.0F, -24.0F, 1.0F);
    (turretModel[7]).rotateAngleZ = -0.122173F;
    
    turretModel[8] = new ModelRendererTurbo(this, 35, 350, 500, 500);
    turretModel[8].addShapeBox(-0.5F, 2.0F, -2.0F, 1, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[8].setRotationPoint(-8.0F, -24.0F, 1.0F);
    (turretModel[8]).rotateAngleZ = -0.122173F;
    
    turretModel[9] = new ModelRendererTurbo(this, 50, 350, 500, 500);
    turretModel[9].addShapeBox(-9.0F, 0.0F, -0.5F, 9, 1, 1, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[9].setRotationPoint(-8.0F, -21.0F, 1.0F);
    
    turretModel[10] = new ModelRendererTurbo(this, 50, 360, 500, 500);
    turretModel[10].addShapeBox(-9.0F, 0.0F, -0.5F, 9, 1, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -0.4F, -2.0F, 0.0F, -0.4F);
    turretModel[10].setRotationPoint(-8.0F, -20.0F, 1.0F);
    
    turretModel[11] = new ModelRendererTurbo(this, 93, 350, 500, 500);
    turretModel[11].addShape3D(-8.0F, 10.0F, 5.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 2.0F, 12, 12, 40, 2, 5, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    turretModel[11].setRotationPoint(6.0F, -16.0F, -8.0F);
    
    turretModel[12] = new ModelRendererTurbo(this, 150, 350, 500, 500);
    turretModel[12].addShape3D(-8.5F, 10.0F, 5.5F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(9.0D, 0.0D, 9, 0), new Coord2D(13.0D, 4.0D, 13, 4), new Coord2D(13.0D, 9.0D, 13, 9), new Coord2D(9.0D, 13.0D, 9, 13), new Coord2D(4.0D, 13.0D, 4, 13), new Coord2D(0.0D, 9.0D, 0, 9), new Coord2D(0.0D, 4.0D, 0, 4) }), 1.0F, 13, 13, 44, 1, 5, new float[] { 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F, 6.0F, 5.0F });
    turretModel[12].setRotationPoint(6.0F, -16.0F, -8.0F);
    
    turretModel[13] = new ModelRendererTurbo(this, 210, 350, 500, 500);
    turretModel[13].addShapeBox(-4.5F, -11.0F, -5.5F, 5, 1, 13, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[13].setRotationPoint(6.0F, -16.0F, -8.0F);
    
    turretModel[14] = new ModelRendererTurbo(this, 255, 350, 500, 500);
    turretModel[14].addShapeBox(0.5F, -11.0F, -5.5F, 4, 1, 13, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -5.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F);
    turretModel[14].setRotationPoint(6.0F, -16.0F, -8.0F);
    
    turretModel[15] = new ModelRendererTurbo(this, 300, 350, 500, 500);
    turretModel[15].addShapeBox(-8.5F, -11.0F, -5.5F, 4, 1, 13, 0.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -5.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F);
    turretModel[15].setRotationPoint(6.0F, -16.0F, -8.0F);
    
    turretModel[16] = new ModelRendererTurbo(this, 0, 370, 500, 500);
    turretModel[16].addShapeBox(1.0F, -11.0F, -11.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F);
    turretModel[16].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[17] = new ModelRendererTurbo(this, 30, 370, 500, 500);
    turretModel[17].addShapeBox(6.0F, -11.0F, -8.0F, 5, 1, 3, 0.0F, -1.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
    turretModel[17].setRotationPoint(6.0F, -16.0F, -8.0F);
    
    turretModel[18] = new ModelRendererTurbo(this, 60, 370, 500, 500);
    turretModel[18].addShapeBox(1.0F, -11.0F, 12.0F, 6, 1, 3, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F);
    turretModel[18].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[19] = new ModelRendererTurbo(this, 90, 370, 500, 500);
    turretModel[19].addShapeBox(6.0F, -11.0F, 10.0F, 5, 1, 3, 0.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.0F);
    turretModel[19].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[20] = new ModelRendererTurbo(this, 120, 370, 500, 500);
    turretModel[20].addShapeBox(10.0F, -11.0F, -6.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    turretModel[20].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[21] = new ModelRendererTurbo(this, 140, 370, 500, 500);
    turretModel[21].addShapeBox(10.0F, -11.0F, 6.0F, 3, 1, 4, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[21].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[22] = new ModelRendererTurbo(this, 165, 370, 500, 500);
    turretModel[22].addBox(12.0F, -11.0F, -2.0F, 1, 1, 8, 0.0F);
    turretModel[22].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[23] = new ModelRendererTurbo(this, 190, 370, 500, 500);
    turretModel[23].addBox(-14.0F, -11.0F, 14.0F, 15, 1, 1, 0.0F);
    turretModel[23].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[24] = new ModelRendererTurbo(this, 190, 380, 500, 500);
    turretModel[24].addBox(-1.0F, -11.0F, -11.0F, 2, 1, 1, 0.0F);
    turretModel[24].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[25] = new ModelRendererTurbo(this, 205, 380, 500, 500);
    turretModel[25].addBox(-15.0F, -11.0F, 13.0F, 1, 1, 2, 0.0F);
    turretModel[25].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[26] = new ModelRendererTurbo(this, 205, 380, 500, 500);
    turretModel[26].addBox(-2.0F, -11.0F, -11.0F, 1, 1, 2, 0.0F);
    turretModel[26].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[27] = new ModelRendererTurbo(this, 230, 370, 500, 500);
    turretModel[27].addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
    turretModel[27].setRotationPoint(5.0F, -26.0F, -17.7F);
    (turretModel[27]).rotateAngleX = 0.8726646F;
    (turretModel[27]).rotateAngleY = -0.1745329F;
    
    turretModel[28] = new ModelRendererTurbo(this, 230, 370, 500, 500);
    turretModel[28].addBox(0.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F);
    turretModel[28].setRotationPoint(-8.0F, -26.0F, 7.7F);
    (turretModel[28]).rotateAngleX = -0.8726646F;
    (turretModel[28]).rotateAngleY = 0.1745329F;
    
    turretModel[29] = new ModelRendererTurbo(this, 230, 370, 500, 500);
    turretModel[29].addBox(0.0F, 0.0F, -1.0F, 1, 5, 1, 0.0F);
    turretModel[29].setRotationPoint(5.0F, -26.0F, 7.9F);
    (turretModel[29]).rotateAngleX = -0.8726646F;
    
    turretModel[30] = new ModelRendererTurbo(this, 230, 380, 500, 500);
    turretModel[30].addBox(-1.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
    turretModel[30].setRotationPoint(17.0F, -26.0F, -13.0F);
    (turretModel[30]).rotateAngleY = -0.4712389F;
    (turretModel[30]).rotateAngleZ = -0.8726646F;
    
    turretModel[31] = new ModelRendererTurbo(this, 230, 380, 500, 500);
    turretModel[31].addBox(-1.0F, 0.0F, -1.0F, 1, 6, 1, 0.0F);
    turretModel[31].setRotationPoint(17.0F, -26.0F, 3.0F);
    (turretModel[31]).rotateAngleY = 0.4712389F;
    (turretModel[31]).rotateAngleZ = -0.8726646F;
    
    turretModel[32] = new ModelRendererTurbo(this, 0, 380, 500, 500);
    turretModel[32].addShapeBox(10.0F, -7.0F, -1.0F, 2, 1, 6, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.9F, 0.0F, -1.0F, -0.9F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[32].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[33] = new ModelRendererTurbo(this, 20, 380, 500, 500);
    turretModel[33].addShapeBox(10.0F, -7.0F, -3.0F, 2, 6, 2, 0.0F, 0.0F, -0.5F, -0.5F, -1.0F, -0.9F, -1.0F, -1.0F, -0.9F, 0.0F, 0.0F, -0.5F, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -0.8F, 0.0F, 0.0F);
    turretModel[33].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[34] = new ModelRendererTurbo(this, 35, 380, 500, 500);
    turretModel[34].addShapeBox(10.0F, -7.0F, 5.0F, 2, 6, 2, 0.0F, 0.0F, -0.5F, 0.0F, -1.0F, -0.9F, 0.0F, -1.0F, -0.9F, -1.0F, 0.0F, -0.5F, -0.5F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, 0.0F);
    turretModel[34].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[35] = new ModelRendererTurbo(this, 75, 380, 500, 500);
    turretModel[35].addShapeBox(10.0F, -1.0F, -3.0F, 2, 1, 10, 0.0F, -0.8F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.8F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    turretModel[35].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[36] = new ModelRendererTurbo(this, 300, 410, 500, 500);
    turretModel[36].addBox(-3.0F, -12.0F, -1.0F, 2, 1, 2, 0.0F);
    turretModel[36].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[37] = new ModelRendererTurbo(this, 315, 400, 500, 500);
    turretModel[37].addShapeBox(-3.0F, -13.0F, -1.0F, 2, 1, 2, 0.0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[37].setRotationPoint(6.0F, -16.0F, -7.0F);
    
    turretModel[38] = new ModelRendererTurbo(this, 315, 410, 500, 500);
    turretModel[38].addTrapezoid(-3.0F, -9.0F, 9.0F, 2, 1, 2, 0.0F, -0.5F, 4);
    turretModel[38].setRotationPoint(6.0F, -16.0F, -7.0F);

    
    barrelModel = new ModelRendererTurbo[7];
    barrelModel[0] = new ModelRendererTurbo(this, 105, 380, 500, 500);
    barrelModel[0].addShapeBox(-1.0F, -1.0F, -3.0F, 3, 5, 6, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[0].setRotationPoint(16.0F, -21.0F, -5.0F);
    
    barrelModel[1] = new ModelRendererTurbo(this, 125, 380, 500, 500);
    barrelModel[1].addBox(0.0F, 0.0F, -2.0F, 15, 2, 2, 0.0F);
    barrelModel[1].setRotationPoint(16.0F, -21.0F, -5.5F);
    
    barrelModel[2] = new ModelRendererTurbo(this, 245, 370, 500, 500);
    barrelModel[2].addShapeBox(0.0F, 2.0F, -2.0F, 10, 2, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[2].setRotationPoint(16.0F, -21.0F, -5.5F);
    
    barrelModel[3] = new ModelRendererTurbo(this, 245, 380, 500, 500);
    barrelModel[3].addShapeBox(0.0F, 2.0F, -1.0F, 10, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F);
    barrelModel[3].setRotationPoint(16.0F, -21.0F, -5.5F);
    
    barrelModel[4] = new ModelRendererTurbo(this, 275, 370, 500, 500);
    barrelModel[4].addShapeBox(3.0F, 2.0F, -2.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    barrelModel[4].setRotationPoint(16.0F, -21.0F, -5.5F);
    
    barrelModel[5] = new ModelRendererTurbo(this, 275, 380, 500, 500);
    barrelModel[5].addShapeBox(8.0F, 2.0F, -2.5F, 2, 1, 3, 0.0F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F, 0.0F, 0.0F, -0.3F);
    barrelModel[5].setRotationPoint(16.0F, -21.0F, -5.5F);
    
    barrelModel[6] = new ModelRendererTurbo(this, 290, 370, 500, 500);
    barrelModel[6].addBox(10.0F, 2.0F, -2.0F, 1, 2, 2, 0.0F);
    barrelModel[6].setRotationPoint(16.0F, -21.0F, -5.5F);
    
    translateAll(-6.0F, 0.0F, 5.0F);
    
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
