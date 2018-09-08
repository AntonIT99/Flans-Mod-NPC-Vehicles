package com.flansmod.client.model.mineworld;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;

public class ModelSherman
  extends ModelVehicle
{
  int textureX = 1024;
  int textureY = 1024;
  
  public ModelSherman()
  {
    bodyModel = new ModelRendererTurbo[17];
    bodyModel[0] = new ModelRendererTurbo(this, 17, 1, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 281, 1, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 457, 1, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 713, 1, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 385, 65, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 513, 65, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 569, 65, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 625, 65, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 17, 73, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 193, 57, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 81, 73, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 249, 73, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 905, 65, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 161, 73, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 753, 57, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 345, 73, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 33, 1, textureX, textureY);
    
    bodyModel[0].addBox(0.0F, 0.0F, -1.0F, 95, 14, 35, 0.0F);
    bodyModel[0].setRotationPoint(-53.0F, -11.0F, -17.0F);
    
    bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 80, 4, 35, 0.0F);
    bodyModel[1].setRotationPoint(-38.0F, 3.0F, -18.0F);
    
    bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 100, 3, 54, 0.0F);
    bodyModel[2].setRotationPoint(-55.0F, -14.0F, -27.0F);
    
    bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 30, 17, 35, 0.0F);
    bodyModel[3].setRotationPoint(33.0F, -26.4F, -18.0F);
    bodyModel[3].rotateAngleZ = -0.8028514F;
    
    bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 35, 7, 49, 0.0F);
    bodyModel[4].setRotationPoint(-52.0F, -16.5F, -25.0F);
    bodyModel[4].rotateAngleZ = 0.2792527F;
    
    bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 19, 2, 7, 0.0F);
    bodyModel[5].setRotationPoint(33.0F, -26.4F, -25.0F);
    bodyModel[5].rotateAngleZ = -0.8028514F;
    
    bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 19, 2, 7, 0.0F);
    bodyModel[6].setRotationPoint(33.0F, -26.4F, 17.0F);
    bodyModel[6].rotateAngleZ = -0.8028514F;
    
    bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 52, 13, 4, 0.0F);
    bodyModel[7].setRotationPoint(-19.0F, -26.5F, -25.0F);
    
    bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 52, 13, 4, 0.0F);
    bodyModel[8].setRotationPoint(-19.0F, -26.5F, 20.0F);
    
    bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 2, 3, 50, 0.0F);
    bodyModel[9].setRotationPoint(-53.0F, -17.0F, -25.0F);
    
    bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 14, 7, 49, 0.0F);
    bodyModel[10].setRotationPoint(33.0F, -24.0F, -25.0F);
    bodyModel[10].rotateAngleZ = -0.8028514F;
    
    bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 22, 7, 49, 0.0F);
    bodyModel[11].setRotationPoint(-40.0F, -14.5F, -25.0F);
    bodyModel[11].rotateAngleZ = 0.2792527F;
    
    bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 11, 3, 10, 0.0F);
    bodyModel[12].setRotationPoint(45.0F, -14.0F, -27.5F);
    bodyModel[12].rotateAngleZ = -0.2792527F;
    
    bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 11, 3, 10, 0.0F);
    bodyModel[13].setRotationPoint(45.0F, -14.0F, 17.0F);
    bodyModel[13].rotateAngleZ = -0.2792527F;
    
    bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 52, 13, 42, 0.0F);
    bodyModel[14].setRotationPoint(-19.0F, -26.5F, -21.0F);
    
    bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 5, 5, 5, 0.0F);
    bodyModel[15].setRotationPoint(40.0F, -19.0F, -12.0F);
    
    bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 5, 1, 1, 0.0F);
    bodyModel[16].setRotationPoint(45.0F, -17.0F, -10.0F);
    



    turretModel = new ModelRendererTurbo[17];
    turretModel[0] = new ModelRendererTurbo(this, 513, 81, textureX, textureY);
    turretModel[1] = new ModelRendererTurbo(this, 713, 65, textureX, textureY);
    turretModel[2] = new ModelRendererTurbo(this, 345, 73, textureX, textureY);
    turretModel[3] = new ModelRendererTurbo(this, 249, 73, textureX, textureY);
    turretModel[4] = new ModelRendererTurbo(this, 385, 73, textureX, textureY);
    turretModel[5] = new ModelRendererTurbo(this, 945, 73, textureX, textureY);
    turretModel[6] = new ModelRendererTurbo(this, 617, 89, textureX, textureY);
    turretModel[7] = new ModelRendererTurbo(this, 665, 113, textureX, textureY);
    turretModel[8] = new ModelRendererTurbo(this, 209, 73, textureX, textureY);
    turretModel[9] = new ModelRendererTurbo(this, 985, 73, textureX, textureY);
    turretModel[10] = new ModelRendererTurbo(this, 17, 105, textureX, textureY);
    turretModel[11] = new ModelRendererTurbo(this, 185, 113, textureX, textureY);
    turretModel[12] = new ModelRendererTurbo(this, 481, 25, textureX, textureY);
    turretModel[13] = new ModelRendererTurbo(this, 713, 25, textureX, textureY);
    turretModel[14] = new ModelRendererTurbo(this, 713, 33, textureX, textureY);
    turretModel[15] = new ModelRendererTurbo(this, 1001, 41, textureX, textureY);
    turretModel[16] = new ModelRendererTurbo(this, 953, 57, textureX, textureY);
    
    turretModel[0].addBox(-16.0F, -42.0F, -15.0F, 35, 2, 30, 0.0F);
    turretModel[0].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[1].addBox(3.0F, -46.0F, -15.0F, 4, 2, 30, 0.0F);
    turretModel[1].setRotationPoint(-1.0F, 0.0F, 0.0F);
    turretModel[1].rotateAngleZ = -0.3665192F;
    
    turretModel[2].addBox(18.5F, -40.5F, -15.0F, 4, 4, 30, 0.0F);
    turretModel[2].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[3].addBox(-1.0F, -40.5F, 15.0F, 20, 11, 2, 0.0F);
    turretModel[3].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[4].addBox(-1.0F, -40.5F, -17.0F, 20, 11, 2, 0.0F);
    turretModel[4].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[5].addBox(19.0F, -37.0F, 12.0F, 4, 7, 30, 0.0F);
    turretModel[5].setRotationPoint(0.0F, 0.0F, -27.0F);
    
    turretModel[6].addBox(17.0F, -31.5F, -17.0F, 4, 5, 34, 0.0F);
    turretModel[6].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[7].addBox(-13.0F, -29.5F, -18.0F, 30, 3, 36, 0.0F);
    turretModel[7].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[8].addBox(-16.0F, -40.0F, -15.0F, 15, 11, 1, 0.0F);
    turretModel[8].setRotationPoint(0.0F, 0.0F, -1.0F);
    
    turretModel[9].addBox(-16.0F, -40.0F, 15.0F, 15, 11, 1, 0.0F);
    turretModel[9].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[10].addBox(-18.0F, -40.0F, -15.0F, 4, 10, 30, 0.0F);
    turretModel[10].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[11].addBox(-16.0F, -31.0F, -15.0F, 4, 3, 30, 0.0F);
    turretModel[11].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[12].addBox(15.0F, -37.0F, 7.0F, 9, 3, 5, 0.0F);
    turretModel[12].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[13].addBox(-4.0F, -44.0F, -13.0F, 10, 2, 1, 0.0F);
    turretModel[13].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[14].addBox(-4.0F, -44.0F, -2.0F, 10, 2, 1, 0.0F);
    turretModel[14].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[15].addBox(-5.0F, -44.0F, -12.0F, 1, 2, 10, 0.0F);
    turretModel[15].setRotationPoint(0.0F, 0.0F, 0.0F);
    
    turretModel[16].addBox(6.0F, -44.0F, -12.0F, 1, 2, 10, 0.0F);
    turretModel[16].setRotationPoint(0.0F, 0.0F, 0.0F);
    



    barrelModel = new ModelRendererTurbo[2];
    barrelModel[0] = new ModelRendererTurbo(this, 161, 89, textureX, textureY);
    barrelModel[1] = new ModelRendererTurbo(this, 937, 73, textureX, textureY);
    
    barrelModel[0].addBox(-1.0F, -2.0F, -2.0F, 35, 4, 4, 0.0F);
    barrelModel[0].setRotationPoint(25.0F, -36.0F, -0.5F);
    
    barrelModel[1].addBox(-2.0F, -4.0F, -7.0F, 3, 9, 14, 0.0F);
    barrelModel[1].setRotationPoint(25.0F, -36.0F, -0.5F);
    



    leftTrackModel = new ModelRendererTurbo[14];
    leftTrackModel[0] = new ModelRendererTurbo(this, 17, 57, textureX, textureY);
    leftTrackModel[1] = new ModelRendererTurbo(this, 249, 1, textureX, textureY);
    leftTrackModel[2] = new ModelRendererTurbo(this, 273, 1, textureX, textureY);
    leftTrackModel[3] = new ModelRendererTurbo(this, 817, 17, textureX, textureY);
    leftTrackModel[4] = new ModelRendererTurbo(this, 33, 9, textureX, textureY);
    leftTrackModel[5] = new ModelRendererTurbo(this, 849, 33, textureX, textureY);
    leftTrackModel[6] = new ModelRendererTurbo(this, 969, 49, textureX, textureY);
    leftTrackModel[7] = new ModelRendererTurbo(this, 249, 57, textureX, textureY);
    leftTrackModel[8] = new ModelRendererTurbo(this, 281, 57, textureX, textureY);
    leftTrackModel[9] = new ModelRendererTurbo(this, 313, 57, textureX, textureY);
    leftTrackModel[10] = new ModelRendererTurbo(this, 345, 57, textureX, textureY);
    leftTrackModel[11] = new ModelRendererTurbo(this, 377, 57, textureX, textureY);
    leftTrackModel[12] = new ModelRendererTurbo(this, 409, 57, textureX, textureY);
    leftTrackModel[13] = new ModelRendererTurbo(this, 761, 57, textureX, textureY);
    
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 104, 1, 8, 0.0F);
    leftTrackModel[0].setRotationPoint(-54.0F, -9.0F, -27.0F);
    
    leftTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    leftTrackModel[1].setRotationPoint(-54.0F, -8.0F, -27.0F);
    
    leftTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    leftTrackModel[2].setRotationPoint(49.0F, -8.0F, -27.0F);
    
    leftTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 90, 1, 8, 0.0F);
    leftTrackModel[3].setRotationPoint(-47.0F, 9.0F, -27.0F);
    
    leftTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 13, 8, 0.0F);
    leftTrackModel[4].setRotationPoint(50.0F, -1.0F, -19.0F);
    leftTrackModel[4].rotateAngleY = -3.141593F;
    leftTrackModel[4].rotateAngleZ = 0.5759587F;
    
    leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 13, 8, 0.0F);
    leftTrackModel[5].setRotationPoint(-54.0F, -1.0F, -27.0F);
    leftTrackModel[5].rotateAngleZ = 0.5759587F;
    
    leftTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
    leftTrackModel[6].setRotationPoint(-53.0F, -8.0F, -26.0F);
    
    leftTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    leftTrackModel[7].setRotationPoint(37.0F, 3.0F, -24.0F);
    
    leftTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 6, 7, 6, 0.0F);
    leftTrackModel[8].setRotationPoint(16.0F, 2.0F, -24.0F);
    
    leftTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 6, 7, 6, 0.0F);
    leftTrackModel[9].setRotationPoint(3.0F, 2.0F, -24.0F);
    
    leftTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 6, 7, 6, 0.0F);
    leftTrackModel[10].setRotationPoint(-16.0F, 2.0F, -24.0F);
    
    leftTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 6, 7, 6, 0.0F);
    leftTrackModel[11].setRotationPoint(-28.0F, 2.0F, -24.0F);
    
    leftTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    leftTrackModel[12].setRotationPoint(-46.0F, 3.0F, -24.0F);
    
    leftTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
    leftTrackModel[13].setRotationPoint(41.0F, -8.0F, -26.0F);
    



    rightTrackModel = new ModelRendererTurbo[14];
    rightTrackModel[0] = new ModelRendererTurbo(this, 281, 41, textureX, textureY);
    rightTrackModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY);
    rightTrackModel[2] = new ModelRendererTurbo(this, 297, 1, textureX, textureY);
    rightTrackModel[3] = new ModelRendererTurbo(this, 817, 1, textureX, textureY);
    rightTrackModel[4] = new ModelRendererTurbo(this, 481, 1, textureX, textureY);
    rightTrackModel[5] = new ModelRendererTurbo(this, 713, 1, textureX, textureY);
    rightTrackModel[6] = new ModelRendererTurbo(this, 249, 17, textureX, textureY);
    rightTrackModel[7] = new ModelRendererTurbo(this, 873, 33, textureX, textureY);
    rightTrackModel[8] = new ModelRendererTurbo(this, 289, 17, textureX, textureY);
    rightTrackModel[9] = new ModelRendererTurbo(this, 913, 33, textureX, textureY);
    rightTrackModel[10] = new ModelRendererTurbo(this, 945, 33, textureX, textureY);
    rightTrackModel[11] = new ModelRendererTurbo(this, 977, 33, textureX, textureY);
    rightTrackModel[12] = new ModelRendererTurbo(this, 905, 49, textureX, textureY);
    rightTrackModel[13] = new ModelRendererTurbo(this, 937, 49, textureX, textureY);
    
    rightTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 104, 1, 8, 0.0F);
    rightTrackModel[0].setRotationPoint(-54.0F, -9.0F, 18.1F);
    
    rightTrackModel[1].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    rightTrackModel[1].setRotationPoint(-54.0F, -8.0F, 18.1F);
    
    rightTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 7, 8, 0.0F);
    rightTrackModel[2].setRotationPoint(49.0F, -8.0F, 18.1F);
    
    rightTrackModel[3].addBox(0.0F, 0.0F, 0.0F, 90, 1, 8, 0.0F);
    rightTrackModel[3].setRotationPoint(-47.0F, 9.0F, 18.0F);
    
    rightTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 1, 13, 8, 0.0F);
    rightTrackModel[4].setRotationPoint(50.0F, -1.0F, 26.1F);
    rightTrackModel[4].rotateAngleY = -3.141593F;
    rightTrackModel[4].rotateAngleZ = 0.5759587F;
    
    rightTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 13, 8, 0.0F);
    rightTrackModel[5].setRotationPoint(-54.0F, -1.0F, 18.1F);
    rightTrackModel[5].rotateAngleZ = 0.5759587F;
    
    rightTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
    rightTrackModel[6].setRotationPoint(41.0F, -8.0F, 17.0F);
    
    rightTrackModel[7].addBox(0.0F, 0.0F, 0.0F, 8, 8, 8, 0.0F);
    rightTrackModel[7].setRotationPoint(-53.0F, -8.0F, 17.0F);
    
    rightTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    rightTrackModel[8].setRotationPoint(-46.0F, 3.0F, 17.0F);
    
    rightTrackModel[9].addBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F);
    rightTrackModel[9].setRotationPoint(-28.0F, 2.0F, 17.0F);
    
    rightTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F);
    rightTrackModel[10].setRotationPoint(-16.0F, 2.0F, 17.0F);
    
    rightTrackModel[11].addBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F);
    rightTrackModel[11].setRotationPoint(3.0F, 2.0F, 17.0F);
    
    rightTrackModel[12].addBox(0.0F, 0.0F, 0.0F, 7, 7, 6, 0.0F);
    rightTrackModel[12].setRotationPoint(16.0F, 2.0F, 17.0F);
    
    rightTrackModel[13].addBox(0.0F, 0.0F, 0.0F, 6, 6, 6, 0.0F);
    rightTrackModel[13].setRotationPoint(37.0F, 3.0F, 17.0F);
    

    translateAll(0, 0, 0);
    

    flipAll();
  }
}


/* Location:           C:\Users\anthony\Desktop\
 * Qualified Name:     com.flansmod.client.model.ww2.ModelSherman
 * JD-Core Version:    0.7.0.1
 */