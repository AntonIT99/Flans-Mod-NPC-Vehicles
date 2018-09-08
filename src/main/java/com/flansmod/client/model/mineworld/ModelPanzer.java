package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelPanzer
  extends ModelVehicle
{
  int textureX = 1024;
  int textureY = 1024;
  
  public ModelPanzer()
  {
    bodyModel = new ModelRendererTurbo[24];
    bodyModel[0] = new ModelRendererTurbo(this, 145, 1, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 417, 1, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 545, 1, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 617, 1, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 801, 1, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 633, 33, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 17, 57, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 385, 1, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 465, 1, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 265, 57, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 865, 33, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 985, 1, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 385, 17, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 481, 41, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 425, 25, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 985, 17, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 121, 9, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 17, 73, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 753, 73, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 849, 121, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 1, 129, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 561, 25, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 625, 57, textureX, textureY);
    
    bodyModel[0].addBox(0.0F, 0.0F, -1.0F, 100, 14, 35, 0.0F);
    bodyModel[0].setRotationPoint(-45.0F, -11.0F, -17.0F);
    
    bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 2, 3, 36, 0.0F);
    bodyModel[1].setRotationPoint(61.0F, -11.7F, -18.0F);
    bodyModel[1].rotateAngleZ = -0.244346F;
    
    bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 12, 2, 36, 0.0F);
    bodyModel[2].setRotationPoint(50.0F, -14.0F, -18.0F);
    bodyModel[2].rotateAngleZ = -0.20944F;
    
    bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 8, 3, 50, 0.0F);
    bodyModel[3].setRotationPoint(42.0F, -14.0F, -25.0F);
    
    bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 87, 25, 1, 0.0F);
    bodyModel[4].setRotationPoint(-37.0F, -20.0F, 27.0F);
    bodyModel[4].rotateAngleX = -0.01745329F;
    
    bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 87, 25, 1, 0.0F);
    bodyModel[5].setRotationPoint(-37.0F, -20.0F, -29.0F);
    bodyModel[5].rotateAngleX = 0.01745329F;
    
    bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 80, 4, 35, 0.0F);
    bodyModel[6].setRotationPoint(-30.0F, 3.0F, -18.0F);
    
    bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 97, 3, 50, 0.0F);
    bodyModel[7].setRotationPoint(-47.0F, -14.0F, -25.0F);
    
    bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 10, 3, 8, 0.0F);
    bodyModel[8].setRotationPoint(-55.5F, -8.5F, -25.0F);
    bodyModel[8].rotateAngleZ = 0.5759587F;
    
    bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 10, 3, 8, 0.0F);
    bodyModel[9].setRotationPoint(-55.5F, -8.5F, 17.0F);
    bodyModel[9].rotateAngleZ = 0.5759587F;
    
    bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 84, 7, 42, 0.0F);
    bodyModel[10].setRotationPoint(-45.0F, -21.0F, -21.0F);
    
    bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 11, 8, 30, 0.0F);
    bodyModel[11].setRotationPoint(38.5F, -21.0F, -15.0F);
    
    bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 12, 8, 6, 0.0F);
    bodyModel[12].setRotationPoint(39.0F, -21.0F, -21.0F);
    bodyModel[12].rotateAngleY = 0.5235988F;
    
    bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 12, 8, 6, 0.0F);
    bodyModel[13].setRotationPoint(39.0F, -13.0F, 21.0F);
    bodyModel[13].rotateAngleX = 3.154392F;
    bodyModel[13].rotateAngleY = -0.5235988F;
    
    bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 13, 2, 36, 0.0F);
    bodyModel[14].setRotationPoint(50.0F, -13.0F, -18.0F);
    bodyModel[14].rotateAngleZ = -0.20944F;
    
    bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 2, 4, 5, 0.0F);
    bodyModel[15].setRotationPoint(49.0F, -19.5F, -12.0F);
    
    bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
    bodyModel[16].setRotationPoint(50.0F, -17.299999F, -9.7F);
    
    bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 1, 3, 9, 0.0F);
    bodyModel[17].setRotationPoint(49.0F, -19.0F, 4.0F);
    
    bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 13, 3, 8, 0.0F);
    bodyModel[18].setRotationPoint(50.0F, -13.93333F, -25.0F);
    bodyModel[18].rotateAngleZ = -0.0872665F;
    
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 13, 3, 8, 0.0F);
    bodyModel[19].setRotationPoint(50.0F, -13.9F, 17.0F);
    bodyModel[19].rotateAngleZ = -0.0872665F;
    
    bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 1, 2, 55, 0.0F);
    bodyModel[20].setRotationPoint(-17.0F, -16.0F, -28.0F);
    
    bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 1, 2, 55, 0.0F);
    bodyModel[21].setRotationPoint(37.0F, -16.0F, -28.0F);
    
    bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 8, 2, 8, 0.0F);
    bodyModel[22].setRotationPoint(36.0F, -22.5F, 6.0F);
    
    bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 8, 2, 8, 0.0F);
    bodyModel[23].setRotationPoint(36.0F, -22.5F, -16.0F);
    



    turretModel = new ModelRendererTurbo[33];
    turretModel[0] = new ModelRendererTurbo(this, 465, 17, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 17, 25, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 81, 1, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 617, 33, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 833, 33, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 921, 33, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 17, 41, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 921, 49, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 553, 57, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 601, 73, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 705, 73, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 785, 73, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 977, 25, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 73, 41, textureX, textureY);
    turretModel[14] = new ModelRendererTurbo(this, 977, 33, textureX, textureY);
    turretModel[15] = new ModelRendererTurbo(this, 417, 41, textureX, textureY);
    turretModel[16] = new ModelRendererTurbo(this, 841, 73, textureX, textureY);
    turretModel[17] = new ModelRendererTurbo(this, 561, 1, textureX, textureY);
    turretModel[18] = new ModelRendererTurbo(this, 465, 41, textureX, textureY);
    turretModel[19] = new ModelRendererTurbo(this, 833, 49, textureX, textureY);
    turretModel[20] = new ModelRendererTurbo(this, 673, 73, textureX, textureY);
    turretModel[21] = new ModelRendererTurbo(this, 417, 9, textureX, textureY);
    turretModel[22] = new ModelRendererTurbo(this, 41, 9, textureX, textureY);
    turretModel[23] = new ModelRendererTurbo(this, 417, 1, textureX, textureY);
    turretModel[24] = new ModelRendererTurbo(this, 73, 9, textureX, textureY);
    turretModel[25] = new ModelRendererTurbo(this, 561, 17, textureX, textureY);
    turretModel[26] = new ModelRendererTurbo(this, 65, 129, textureX, textureY);
    turretModel[27] = new ModelRendererTurbo(this, 129, 129, textureX, textureY);
    turretModel[28] = new ModelRendererTurbo(this, 193, 129, textureX, textureY);
    turretModel[29] = new ModelRendererTurbo(this, 241, 129, textureX, textureY);
    turretModel[30] = new ModelRendererTurbo(this, 265, 129, textureX, textureY);
    turretModel[31] = new ModelRendererTurbo(this, 297, 129, textureX, textureY);
    turretModel[32] = new ModelRendererTurbo(this, 329, 129, textureX, textureY);
    
    turretModel[0].addBox(0.0F, -30.0F, -12.4F, 23, 6, 2, 0.0F);
    turretModel[0].setRotationPoint(-1.0F, 0.0F, 0.0F);
    turretModel[0].rotateAngleX = 0.1570796F;
    turretModel[0].rotateAngleY = 0.1396263F;
    
    turretModel[1].addBox(-1.0F, -30.0F, 10.6F, 22, 6, 2, 0.0F);
    turretModel[1].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[1].rotateAngleX = -0.1570796F;
    turretModel[1].rotateAngleY = -0.1396263F;
    
    turretModel[2].addBox(25.0F, -25.5F, -13.5F, 2, 9, 27, 0.0F);
    turretModel[2].setRotationPoint(0.0F, -4.0F, 0.0F);
    turretModel[2].rotateAngleZ = 0.0872665F;
    
    turretModel[3].addBox(-18.5F, -31.0F, -20.299999F, 20, 12, 2, 0.0F);
    turretModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[3].rotateAngleX = -0.1396263F;
    
    turretModel[4].addBox(-18.5F, -31.0F, 18.299999F, 20, 12, 2, 0.0F);
    turretModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[4].rotateAngleX = 0.1396263F;
    
    turretModel[5].addBox(-1.0F, -31.0F, 18.5F, 22, 6, 2, 0.0F);
    turretModel[5].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[5].rotateAngleX = 0.1396263F;
    turretModel[5].rotateAngleY = -0.1396263F;
    
    turretModel[6].addBox(0.0F, -31.0F, -20.5F, 23, 6, 2, 0.0F);
    turretModel[6].setRotationPoint(-1.0F, 0.0F, 0.0F);
    turretModel[6].rotateAngleX = -0.1396263F;
    turretModel[6].rotateAngleY = 0.1396263F;
    
    turretModel[7].addBox(0.0F, -34.400002F, -13.5F, 23, 2, 27, 0.0F);
    turretModel[7].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[7].rotateAngleZ = -0.03490658F;
    
    turretModel[8].addBox(0.0F, -34.400002F, 0.0F, 6, 2, 31, 0.0F);
    turretModel[8].setRotationPoint(-4.5F, 0.0F, -15.5F);
    
    turretModel[9].addBox(-10.5F, -23.0F, -15.5F, 20, 3, 31, 0.0F);
    turretModel[9].setRotationPoint(-8.0F, -1.0F, 0.0F);
    
    turretModel[10].addBox(1.5F, -24.0F, -14.5F, 8, 3, 29, 0.0F);
    turretModel[10].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[11].addBox(9.5F, -24.0F, -13.0F, 14, 3, 26, 0.0F);
    turretModel[11].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[12].addBox(-2.0F, -34.299999F, 10.6F, 18, 1, 5, 0.0F);
    turretModel[12].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[12].rotateAngleY = -0.1396263F;
    turretModel[12].rotateAngleZ = -0.03490658F;
    
    turretModel[13].addBox(-2.0F, -22.0F, 11.0F, 23, 1, 5, 0.0F);
    turretModel[13].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[13].rotateAngleY = -0.1396263F;
    
    turretModel[14].addBox(-2.0F, -34.299999F, -15.6F, 18, 1, 5, 0.0F);
    turretModel[14].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[14].rotateAngleY = 0.1396263F;
    turretModel[14].rotateAngleZ = -0.03490658F;
    
    turretModel[15].addBox(-2.0F, -22.0F, -16.0F, 23, 1, 5, 0.0F);
    turretModel[15].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[15].rotateAngleY = 0.1396263F;
    
    turretModel[16].addBox(-24.5F, -30.5F, -15.0F, 3, 13, 30, 0.0F);
    turretModel[16].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[16].rotateAngleZ = -0.1745329F;
    
    turretModel[17].addBox(-18.5F, -34.5F, -5.5F, 3, 2, 11, 0.0F);
    turretModel[17].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[18].addBox(-18.5F, -34.400002F, -15.5F, 14, 2, 10, 0.0F);
    turretModel[18].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[19].addBox(-18.5F, -34.400002F, 5.5F, 14, 2, 10, 0.0F);
    turretModel[19].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[20].addBox(-31.0F, -34.0F, -9.0F, 12, 10, 18, 0.0F);
    turretModel[20].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[21].addBox(18.0F, -29.0F, 5.0F, 8, 3, 6, 0.0F);
    turretModel[21].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[22].addBox(-16.0F, -37.0F, -5.0F, 1, 3, 10, 0.0F);
    turretModel[22].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[23].addBox(-15.0F, -36.0F, 5.0F, 10, 3, 1, 0.0F);
    turretModel[23].setRotationPoint(0.0F, -1.0F, 0.0F);
    
    turretModel[24].addBox(-5.0F, -37.0F, -5.0F, 1, 3, 10, 0.0F);
    turretModel[24].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[25].addBox(-15.0F, -37.0F, -6.0F, 10, 3, 1, 0.0F);
    turretModel[25].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[26].addBox(-5.0F, -34.0F, 20.0F, 28, 12, 1, 0.0F);
    turretModel[26].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[26].rotateAngleX = 0.03490658F;
    turretModel[26].rotateAngleY = -0.1745329F;
    
    turretModel[27].addBox(-5.0F, -34.0F, -21.0F, 28, 12, 1, 0.0F);
    turretModel[27].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[27].rotateAngleX = -0.03490658F;
    turretModel[27].rotateAngleY = 0.1745329F;
    
    turretModel[28].addBox(-21.0F, -34.0F, 20.5F, 22, 12, 1, 0.0F);
    turretModel[28].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[28].rotateAngleX = 0.03490658F;
    turretModel[28].rotateAngleY = 0.10472F;
    
    turretModel[29].addBox(-21.0F, -34.0F, -21.5F, 22, 12, 1, 0.0F);
    turretModel[29].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[29].rotateAngleX = -0.03490658F;
    turretModel[29].rotateAngleY = -0.10472F;
    
    turretModel[30].addBox(-34.5F, -34.0F, -12.0F, 1, 12, 24, 0.0F);
    turretModel[30].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[30].rotateAngleZ = -0.03490658F;
    
    turretModel[31].addBox(-20.0F, -34.0F, 28.5F, 12, 12, 1, 0.0F);
    turretModel[31].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[31].rotateAngleX = 0.03490658F;
    turretModel[31].rotateAngleY = 0.6283185F;
    
    turretModel[32].addBox(-20.0F, -34.0F, -29.5F, 12, 12, 1, 0.0F);
    turretModel[32].setRotationPoint(0.0F, 0.0F, 0.0F);
    turretModel[32].rotateAngleX = -0.03490658F;
    turretModel[32].rotateAngleY = -0.6283185F;
    



    barrelModel = new ModelRendererTurbo[4];
    barrelModel[0] = new ModelRendererTurbo(this, 17, 57, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 881, 81, textureX, textureY);
    barrelModel[2] = new ModelRendererTurbo(this, 505, 1, textureX, textureY);
    barrelModel[3] = new ModelRendererTurbo(this, 145, 9, textureX, textureY);
    
    barrelModel[0].addBox(1.0F, -2.5F, -6.0F, 13, 5, 9, 0.0F);
    barrelModel[0].setRotationPoint(24.0F, -26.0F, 0.0F);
    
    barrelModel[1].addBox(-10.0F, -1.5F, -3.0F, 59, 3, 3, 0.0F);
    barrelModel[1].setRotationPoint(24.0F, -26.0F, 0.0F);
    
    barrelModel[2].addBox(49.0F, -2.0F, -3.5F, 7, 4, 4, 0.0F);
    barrelModel[2].setRotationPoint(24.0F, -26.0F, 0.0F);
    
    barrelModel[3].addBox(1.5F, -4.5F, -7.0F, 1, 9, 11, 0.0F);
    barrelModel[3].setRotationPoint(24.0F, -26.0F, 0.0F);
    



    leftTrackModel = new ModelRendererTurbo[16];
    leftTrackModel[0] = new ModelRendererTurbo(this, 249, 113, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 265, 57, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 673, 121, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 841, 73, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 521, 81, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 913, 105, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 569, 97, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 777, 105, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 809, 105, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 953, 105, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 985, 105, textureX, textureY);
    leftTrackModel[12] = new ModelRendererTurbo(this, 873, 121, textureX, textureY);
    leftTrackModel[13] = new ModelRendererTurbo(this, 945, 121, textureX, textureY);
    leftTrackModel[14] = new ModelRendererTurbo(this, 977, 121, textureX, textureY);
    leftTrackModel[15] = new ModelRendererTurbo(this, 17, 129, textureX, textureY);
    
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 104, 1, 8, 0.0F);
    leftTrackModel[0].setRotationPoint(-46.0F, -9.0F, -27.0F);
    
    leftTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    leftTrackModel[1].setRotationPoint(-46.0F, -8.0F, -27.0F);
    
    leftTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    leftTrackModel[2].setRotationPoint(57.0F, -8.0F, -27.0F);
    
    leftTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 90, 1, 8, 0.0F);
    leftTrackModel[3].setRotationPoint(-39.0F, 9.0F, -27.0F);
    
    leftTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 13, 8, 0.0F);
    leftTrackModel[4].setRotationPoint(58.0F, -1.0F, -19.0F);
    leftTrackModel[4].rotateAngleY = -3.141593F;
    leftTrackModel[4].rotateAngleZ = 0.5759587F;
    
    leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 13, 8, 0.0F);
    leftTrackModel[5].setRotationPoint(-46.0F, -1.0F, -27.0F);
    leftTrackModel[5].rotateAngleZ = 0.5759587F;
    
    leftTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
    leftTrackModel[6].setRotationPoint(-45.0F, -8.0F, -26.0F);
    
    leftTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    leftTrackModel[7].setRotationPoint(45.0F, 3.0F, -24.0F);
    
    leftTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    leftTrackModel[8].setRotationPoint(35.0F, 3.0F, -24.0F);
    
    leftTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    leftTrackModel[9].setRotationPoint(24.0F, 3.0F, -24.0F);
    
    leftTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    leftTrackModel[10].setRotationPoint(11.0F, 3.0F, -24.0F);
    
    leftTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    leftTrackModel[11].setRotationPoint(-1.0F, 3.0F, -24.0F);
    
    leftTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    leftTrackModel[12].setRotationPoint(-14.0F, 3.0F, -24.0F);
    
    leftTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    leftTrackModel[13].setRotationPoint(-26.0F, 3.0F, -24.0F);
    
    leftTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    leftTrackModel[14].setRotationPoint(-38.0F, 3.0F, -24.0F);
    
    leftTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
    leftTrackModel[15].setRotationPoint(49.0F, -8.0F, -26.0F);
    



    rightTrackModel = new ModelRendererTurbo[16];
    rightTrackModel[0] = new ModelRendererTurbo(this, 17, 113, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 873, 41, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 481, 57, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 481, 113, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 601, 57, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 281, 65, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 545, 57, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 481, 81, textureX, textureY);
    rightTrackModel[8] = new ModelRendererTurbo(this, 921, 49, textureX, textureY);
    rightTrackModel[9] = new ModelRendererTurbo(this, 17, 89, textureX, textureY);
    rightTrackModel[10] = new ModelRendererTurbo(this, 753, 89, textureX, textureY);
    rightTrackModel[11] = new ModelRendererTurbo(this, 881, 89, textureX, textureY);
    rightTrackModel[12] = new ModelRendererTurbo(this, 913, 89, textureX, textureY);
    rightTrackModel[13] = new ModelRendererTurbo(this, 945, 89, textureX, textureY);
    rightTrackModel[14] = new ModelRendererTurbo(this, 977, 89, textureX, textureY);
    rightTrackModel[15] = new ModelRendererTurbo(this, 537, 97, textureX, textureY);
    
    rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 105, 1, 8, 0.0F);
    rightTrackModel[0].setRotationPoint(-47.0F, -9.0F, 18.1F);
    
    rightTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    rightTrackModel[1].setRotationPoint(-47.0F, -8.0F, 18.1F);
    
    rightTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    rightTrackModel[2].setRotationPoint(57.0F, -8.0F, 18.1F);
    
    rightTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 91, 1, 8, 0.0F);
    rightTrackModel[3].setRotationPoint(-40.0F, 9.0F, 18.0F);
    
    rightTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 13, 8, 0.0F);
    rightTrackModel[4].setRotationPoint(58.0F, -1.0F, 26.1F);
    rightTrackModel[4].rotateAngleY = -3.141593F;
    rightTrackModel[4].rotateAngleZ = 0.5759587F;
    
    rightTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 13, 8, 0.0F);
    rightTrackModel[5].setRotationPoint(-47.0F, -1.0F, 18.1F);
    rightTrackModel[5].rotateAngleZ = 0.5759587F;
    
    rightTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
    rightTrackModel[6].setRotationPoint(49.0F, -8.0F, 17.0F);
    
    rightTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
    rightTrackModel[7].setRotationPoint(-46.0F, -8.0F, 17.0F);
    
    rightTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    rightTrackModel[8].setRotationPoint(-38.0F, 3.0F, 17.0F);
    
    rightTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    rightTrackModel[9].setRotationPoint(-26.0F, 3.0F, 17.0F);
    
    rightTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    rightTrackModel[10].setRotationPoint(-14.0F, 3.0F, 17.0F);
    
    rightTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    rightTrackModel[11].setRotationPoint(-1.0F, 3.0F, 17.0F);
    
    rightTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    rightTrackModel[12].setRotationPoint(11.0F, 3.0F, 17.0F);
    
    rightTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    rightTrackModel[13].setRotationPoint(24.0F, 3.0F, 17.0F);
    
    rightTrackModel[14].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    rightTrackModel[14].setRotationPoint(35.0F, 3.0F, 17.0F);
    
    rightTrackModel[15].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    rightTrackModel[15].setRotationPoint(45.0F, 3.0F, 17.0F);
    

    ModelRendererTurbo[][] mg42Model = new ModelRendererTurbo[3][];
    

    mg42Model[0] = new ModelRendererTurbo[0];
    

    mg42Model[1] = new ModelRendererTurbo[4];
    mg42Model[1][0] = new ModelRendererTurbo(this, 0, 205, textureX, textureY);
    mg42Model[1][1] = new ModelRendererTurbo(this, 0, 200, textureX, textureY);
    mg42Model[1][2] = new ModelRendererTurbo(this, 8, 203, textureX, textureY);
    mg42Model[1][3] = new ModelRendererTurbo(this, 18, 196, textureX, textureY);
    
    mg42Model[1][0].addBox(6.0F, 10.0F, -1.0F, 16, 2, 2);
    mg42Model[1][1].addBox(10.0F, 12.0F, -1.0F, 2, 3, 2);
    mg42Model[1][2].addBox(22.0F, 10.5F, -0.5F, 4, 1, 1);
    mg42Model[1][3].addBox(14.0F, 10.0F, -6.0F, 2, 4, 5);
    for (ModelRendererTurbo gunPart : mg42Model[1]) {
      gunPart.setRotationPoint(-10.0F, -55.0F, 0.0F);
    }
    mg42Model[2] = new ModelRendererTurbo[0];
    
    registerGunModel("MG42", mg42Model);
    
    translateAll(0, 0, 0);
    

    flipAll();
  }
}


/* Location:           C:\Users\anthony\Desktop\
 * Qualified Name:     com.flansmod.client.model.ww2.ModelPanzer
 * JD-Core Version:    0.7.0.1
 */