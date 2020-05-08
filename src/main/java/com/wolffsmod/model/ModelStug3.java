package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelStug3
  extends ModelVehicle {
  int textureX = 500;
  int textureY = 256;

  public ModelStug3() {
    bodyModel = new ModelRendererTurbo[195];
    
    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, 512, 512);
    bodyModel[0].addShapeBox(-37.0F, 0.0F, -15.0F, 79, 8, 30, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F);
    bodyModel[0].setRotationPoint(0.0F, -7.0F, 0.0F);
    
    bodyModel[1] = new ModelRendererTurbo(this, 0, 45, 512, 512);
    bodyModel[1].addShapeBox(-37.0F, 0.0F, -15.0F, 79, 3, 30, 0.0F, -4.0F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -2.5F, 0.0F, 0.0F, -4.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, -10.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(0.0F, 1.0F, 0.0F);
    
    bodyModel[2] = new ModelRendererTurbo(this, 0, 86, 512, 512);
    bodyModel[2].addShapeBox(0.0F, 0.0F, -15.0F, 16, 4, 30, 0.0F, 0.0F, 0.0F, 0.0F, -4.0F, -1.0F, 0.0F, -4.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(26.0F, -11.0F, 0.0F);
    
    bodyModel[3] = new ModelRendererTurbo(this, 0, 130, 512, 512);
    bodyModel[3].addBox(-37.0F, 0.0F, -15.0F, 63, 4, 30, 0.0F);
    bodyModel[3].setRotationPoint(0.0F, -11.0F, 0.0F);
    
    bodyModel[4] = new ModelRendererTurbo(this, 0, 173, 512, 512);
    bodyModel[4].addBox(-28.0F, 0.0F, -15.0F, 41, 6, 30, 0.0F);
    bodyModel[4].setRotationPoint(0.0F, -17.0F, 0.0F);
    
    bodyModel[5] = new ModelRendererTurbo(this, 260, 0, 512, 512);
    bodyModel[5].addShapeBox(-19.0F, 0.0F, -15.0F, 17, 6, 30, 0.0F, -3.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -4.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[5].setRotationPoint(-26.0F, -17.0F, 0.0F);
    
    bodyModel[6] = new ModelRendererTurbo(this, 260, 45, 512, 512);
    bodyModel[6].addShapeBox(-8.0F, 0.0F, -15.0F, 8, 6, 30, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    bodyModel[6].setRotationPoint(-37.0F, -12.0F, 0.0F);
    
    bodyModel[7] = new ModelRendererTurbo(this, 0, 220, 512, 512);
    bodyModel[7].addBox(-27.0F, 0.0F, 0.0F, 51, 1, 10, 0.0F);
    bodyModel[7].setRotationPoint(0.0F, -12.0F, 15.0F);
    
    bodyModel[8] = new ModelRendererTurbo(this, 130, 220, 512, 512);
    bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 17, 1, 10, 0.0F);
    bodyModel[8].setRotationPoint(24.0F, -12.0F, 15.0F);
    (bodyModel[8]).rotateAngleZ = -0.05759586F;
    
    bodyModel[9] = new ModelRendererTurbo(this, 190, 220, 512, 512);
    bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 6, 1, 10, 0.0F);
    bodyModel[9].setRotationPoint(41.0F, -11.0F, 15.0F);
    (bodyModel[9]).rotateAngleZ = -0.6981317F;
    
    bodyModel[10] = new ModelRendererTurbo(this, 230, 220, 512, 512);
    bodyModel[10].addBox(-13.0F, 0.0F, 0.0F, 13, 1, 10, 0.0F);
    bodyModel[10].setRotationPoint(-27.0F, -12.0F, 15.0F);
    (bodyModel[10]).rotateAngleZ = 0.07504916F;
    
    bodyModel[11] = new ModelRendererTurbo(this, 280, 220, 512, 512);
    bodyModel[11].addBox(-6.0F, 0.0F, 0.0F, 6, 1, 10, 0.0F);
    bodyModel[11].setRotationPoint(-40.0F, -11.0F, 15.0F);
    (bodyModel[11]).rotateAngleZ = 0.6981317F;
    
    bodyModel[12] = new ModelRendererTurbo(this, 0, 220, 512, 512);
    bodyModel[12].addBox(-27.0F, 0.0F, -10.0F, 51, 1, 10, 0.0F);
    bodyModel[12].setRotationPoint(0.0F, -12.0F, -15.0F);
    
    bodyModel[13] = new ModelRendererTurbo(this, 130, 220, 512, 512);
    bodyModel[13].addBox(0.0F, 0.0F, -10.0F, 17, 1, 10, 0.0F);
    bodyModel[13].setRotationPoint(24.0F, -12.0F, -15.0F);
    (bodyModel[13]).rotateAngleZ = -0.05759586F;
    
    bodyModel[14] = new ModelRendererTurbo(this, 190, 220, 512, 512);
    bodyModel[14].addBox(0.0F, 0.0F, -10.0F, 6, 1, 10, 0.0F);
    bodyModel[14].setRotationPoint(41.0F, -11.0F, -15.0F);
    (bodyModel[14]).rotateAngleZ = -0.6981317F;
    
    bodyModel[15] = new ModelRendererTurbo(this, 230, 220, 512, 512);
    bodyModel[15].addBox(-13.0F, 0.0F, -10.0F, 13, 1, 10, 0.0F);
    bodyModel[15].setRotationPoint(-27.0F, -12.0F, -15.0F);
    (bodyModel[15]).rotateAngleZ = 0.07504916F;
    
    bodyModel[16] = new ModelRendererTurbo(this, 280, 220, 512, 512);
    bodyModel[16].addBox(-6.0F, 0.0F, -10.0F, 6, 1, 10, 0.0F);
    bodyModel[16].setRotationPoint(-40.0F, -11.0F, -15.0F);
    (bodyModel[16]).rotateAngleZ = 0.6981317F;
    
    bodyModel[17] = new ModelRendererTurbo(this, 320, 220, 512, 512);
    bodyModel[17].addShapeBox(0.0F, 0.0F, 0.0F, 22, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -18.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -18.0F, 0.0F, 0.0F);
    bodyModel[17].setRotationPoint(24.0F, -11.0F, 15.0F);
    
    bodyModel[18] = new ModelRendererTurbo(this, 320, 220, 512, 512);
    bodyModel[18].addShapeBox(0.0F, 0.0F, -1.0F, 22, 8, 1, 0.0F, 0.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -18.0F, 0.0F, 0.0F, -1.0F, -4.0F, 0.0F, -1.0F, -4.0F, 0.0F, -18.0F, 0.0F, 0.0F);
    bodyModel[18].setRotationPoint(24.0F, -11.0F, -15.0F);
    
    bodyModel[19] = new ModelRendererTurbo(this, 0, 240, 512, 512);
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 19, 2, 5, 0.0F);
    bodyModel[19].setRotationPoint(-28.0F, -17.0F, 15.0F);
    
    bodyModel[20] = new ModelRendererTurbo(this, 50, 240, 512, 512);
    bodyModel[20].addBox(0.0F, 0.0F, -5.0F, 19, 2, 5, 0.0F);
    bodyModel[20].setRotationPoint(-28.0F, -17.0F, -15.0F);
    
    bodyModel[21] = new ModelRendererTurbo(this, 100, 240, 512, 512);
    bodyModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 19, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F);
    bodyModel[21].setRotationPoint(-28.0F, -15.0F, 15.0F);
    
    bodyModel[22] = new ModelRendererTurbo(this, 150, 240, 512, 512);
    bodyModel[22].addShapeBox(0.0F, 0.0F, -5.0F, 19, 2, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[22].setRotationPoint(-28.0F, -15.0F, -15.0F);
    
    bodyModel[23] = new ModelRendererTurbo(this, 0, 380, 512, 512);
    bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 5, 1, 11, 0.0F);
    bodyModel[23].setRotationPoint(-19.0F, -18.3F, 2.0F);
    
    bodyModel[24] = new ModelRendererTurbo(this, 0, 380, 512, 512);
    bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 5, 1, 11, 0.0F);
    bodyModel[24].setRotationPoint(-25.0F, -18.3F, 2.0F);
    
    bodyModel[25] = new ModelRendererTurbo(this, 0, 380, 512, 512);
    bodyModel[25].addBox(0.0F, 0.0F, -11.0F, 5, 1, 11, 0.0F);
    bodyModel[25].setRotationPoint(-25.0F, -18.3F, -2.0F);
    
    bodyModel[26] = new ModelRendererTurbo(this, 45, 380, 512, 512);
    bodyModel[26].addBox(0.0F, 0.0F, -11.0F, 5, 1, 11, 0.0F);
    bodyModel[26].setRotationPoint(-19.0F, -18.5F, -2.0F);
    
    bodyModel[27] = new ModelRendererTurbo(this, 90, 380, 512, 512);
    bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 4, 1, 10, 0.0F);
    bodyModel[27].setRotationPoint(-24.5F, -18.0F, 2.5F);
    
    bodyModel[28] = new ModelRendererTurbo(this, 90, 380, 512, 512);
    bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 4, 1, 10, 0.0F);
    bodyModel[28].setRotationPoint(-18.5F, -18.0F, 2.5F);
    
    bodyModel[29] = new ModelRendererTurbo(this, 90, 380, 512, 512);
    bodyModel[29].addBox(0.0F, 0.0F, -10.0F, 4, 1, 10, 0.0F);
    bodyModel[29].setRotationPoint(-24.5F, -18.0F, -2.5F);
    
    bodyModel[30] = new ModelRendererTurbo(this, 125, 385, 512, 512);
    bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F);
    bodyModel[30].setRotationPoint(-17.0F, -18.0F, 1.5F);
    
    bodyModel[31] = new ModelRendererTurbo(this, 125, 385, 512, 512);
    bodyModel[31].addBox(0.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F);
    bodyModel[31].setRotationPoint(-23.0F, -18.0F, 1.5F);
    
    bodyModel[32] = new ModelRendererTurbo(this, 120, 255, 512, 512);
    bodyModel[32].addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    bodyModel[32].setRotationPoint(-26.0F, -18.0F, -5.5F);
    
    bodyModel[33] = new ModelRendererTurbo(this, 120, 255, 512, 512);
    bodyModel[33].addBox(0.0F, 0.0F, 0.0F, 2, 1, 2, 0.0F);
    bodyModel[33].setRotationPoint(-26.0F, -18.0F, -11.5F);
    
    bodyModel[34] = new ModelRendererTurbo(this, 0, 280, 512, 512);
    bodyModel[34].addBox(-11.5F, -0.5F, 0.0F, 3, 1, 8, 0.0F);
    bodyModel[34].setRotationPoint(-26.0F, -17.0F, 3.0F);
    (bodyModel[34]).rotateAngleZ = 0.2617994F;
    
    bodyModel[35] = new ModelRendererTurbo(this, 40, 280, 512, 512);
    bodyModel[35].addBox(-12.0F, -0.5F, -0.5F, 4, 1, 9, 0.0F);
    bodyModel[35].setRotationPoint(-26.0F, -17.0F, 3.0F);
    (bodyModel[35]).rotateAngleZ = 0.1919862F;
    
    bodyModel[36] = new ModelRendererTurbo(this, 0, 280, 512, 512);
    bodyModel[36].addBox(-11.5F, -0.5F, -8.0F, 3, 1, 8, 0.0F);
    bodyModel[36].setRotationPoint(-26.0F, -17.0F, -3.0F);
    (bodyModel[36]).rotateAngleZ = 0.2617994F;
    
    bodyModel[37] = new ModelRendererTurbo(this, 40, 280, 512, 512);
    bodyModel[37].addBox(-12.0F, -0.5F, -8.5F, 4, 1, 9, 0.0F);
    bodyModel[37].setRotationPoint(-26.0F, -17.0F, -3.0F);
    (bodyModel[37]).rotateAngleZ = 0.1919862F;
    
    bodyModel[38] = new ModelRendererTurbo(this, 140, 255, 512, 512);
    bodyModel[38].addBox(0.0F, 0.0F, 0.0F, 5, 3, 1, 0.0F);
    bodyModel[38].setRotationPoint(16.0F, -16.0F, 14.5F);
    
    bodyModel[39] = new ModelRendererTurbo(this, 270, 300, 512, 512);
    bodyModel[39].addShapeBox(0.0F, 0.0F, 0.0F, 5, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[39].setRotationPoint(20.0F, -21.0F, 4.0F);
    
    bodyModel[40] = new ModelRendererTurbo(this, 160, 255, 512, 512);
    bodyModel[40].addShapeBox(-3.0F, 0.0F, 0.0F, 3, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.5F, 0.0F, -0.5F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[40].setRotationPoint(27.0F, -19.0F, 5.0F);
    
    bodyModel[41] = new ModelRendererTurbo(this, 190, 255, 512, 512);
    bodyModel[41].addBox(-2.0F, 0.0F, 0.0F, 2, 1, 7, 0.0F);
    bodyModel[41].setRotationPoint(26.5F, -13.0F, 5.5F);
    
    bodyModel[42] = new ModelRendererTurbo(this, 160, 385, 512, 512);
    bodyModel[42].addBox(0.0F, -5.0F, 0.0F, 3, 5, 8, 0.0F);
    bodyModel[42].setRotationPoint(-47.0F, -7.0F, -12.0F);
    
    bodyModel[43] = new ModelRendererTurbo(this, 215, 255, 512, 512);
    bodyModel[43].addBox(-2.0F, 0.0F, 0.0F, 1, 1, 12, 0.0F);
    bodyModel[43].setRotationPoint(23.0F, -12.0F, -8.0F);
    
    bodyModel[44] = new ModelRendererTurbo(this, 0, 295, 512, 512);
    bodyModel[44].addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
    bodyModel[44].setRotationPoint(23.0F, -8.0F, 15.0F);
    
    bodyModel[45] = new ModelRendererTurbo(this, 0, 295, 512, 512);
    bodyModel[45].addBox(0.0F, 0.0F, 0.0F, 3, 4, 3, 0.0F);
    bodyModel[45].setRotationPoint(-22.0F, -8.0F, 15.0F);
    
    bodyModel[46] = new ModelRendererTurbo(this, 20, 295, 512, 512);
    bodyModel[46].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    bodyModel[46].setRotationPoint(23.5F, -4.0F, 15.0F);
    
    bodyModel[47] = new ModelRendererTurbo(this, 20, 295, 512, 512);
    bodyModel[47].addBox(0.0F, 0.0F, 0.0F, 2, 4, 2, 0.0F);
    bodyModel[47].setRotationPoint(-21.5F, -4.0F, 15.0F);
    
    bodyModel[48] = new ModelRendererTurbo(this, 35, 295, 512, 512);
    bodyModel[48].addBox(0.0F, 0.0F, -0.5F, 3, 2, 3, 0.0F);
    bodyModel[48].setRotationPoint(23.0F, 0.0F, 15.0F);
    
    bodyModel[49] = new ModelRendererTurbo(this, 35, 295, 512, 512);
    bodyModel[49].addBox(0.0F, 0.0F, -0.5F, 3, 2, 3, 0.0F);
    bodyModel[49].setRotationPoint(-22.0F, 0.0F, 15.0F);
    
    bodyModel[50] = new ModelRendererTurbo(this, 50, 295, 512, 512);
    bodyModel[50].addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
    bodyModel[50].setRotationPoint(2.0F, -8.0F, 15.0F);
    
    bodyModel[51] = new ModelRendererTurbo(this, 50, 295, 512, 512);
    bodyModel[51].addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
    bodyModel[51].setRotationPoint(19.0F, -8.0F, 15.0F);
    
    bodyModel[52] = new ModelRendererTurbo(this, 50, 295, 512, 512);
    bodyModel[52].addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
    bodyModel[52].setRotationPoint(-16.0F, -8.0F, 15.0F);
    
    bodyModel[53] = new ModelRendererTurbo(this, 70, 295, 512, 512);
    bodyModel[53].addShapeBox(0.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[53].setRotationPoint(36.0F, -6.0F, 15.0F);
    
    bodyModel[54] = new ModelRendererTurbo(this, 90, 295, 512, 512);
    bodyModel[54].addShapeBox(-3.0F, 0.0F, 0.0F, 3, 6, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[54].setRotationPoint(36.0F, -6.0F, 15.0F);
    
    bodyModel[55] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[55].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[55].setRotationPoint(31.0F, 1.0F, 15.0F);
    (bodyModel[55]).rotateAngleZ = -1.134464F;
    
    bodyModel[56] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[56].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[56].setRotationPoint(22.0F, 1.0F, 15.0F);
    (bodyModel[56]).rotateAngleZ = -1.134464F;
    
    bodyModel[57] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[57].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[57].setRotationPoint(13.0F, 1.0F, 15.0F);
    (bodyModel[57]).rotateAngleZ = -1.134464F;
    
    bodyModel[58] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[58].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[58].setRotationPoint(4.0F, 1.0F, 15.0F);
    (bodyModel[58]).rotateAngleZ = -1.134464F;
    
    bodyModel[59] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[59].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[59].setRotationPoint(-5.0F, 1.0F, 15.0F);
    (bodyModel[59]).rotateAngleZ = -1.134464F;
    
    bodyModel[60] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[60].addBox(0.0F, 0.0F, 0.0F, 2, 8, 2, 0.0F);
    bodyModel[60].setRotationPoint(-14.0F, 1.0F, 15.0F);
    (bodyModel[60]).rotateAngleZ = -1.134464F;
    
    bodyModel[61] = new ModelRendererTurbo(this, 0, 0, 512, 512);
    bodyModel[61].addBox(0.0F, 0.0F, -2.0F, 2, 4, 4, 0.0F);
    bodyModel[61].setRotationPoint(-33.0F, -5.0F, 15.0F);
    
    bodyModel[62] = new ModelRendererTurbo(this, 0, 295, 512, 512);
    bodyModel[62].addBox(0.0F, 0.0F, -3.0F, 3, 4, 3, 0.0F);
    bodyModel[62].setRotationPoint(23.0F, -8.0F, -15.0F);
    
    bodyModel[63] = new ModelRendererTurbo(this, 0, 295, 512, 512);
    bodyModel[63].addBox(0.0F, 0.0F, -3.0F, 3, 4, 3, 0.0F);
    bodyModel[63].setRotationPoint(-22.0F, -8.0F, -15.0F);
    
    bodyModel[64] = new ModelRendererTurbo(this, 20, 295, 512, 512);
    bodyModel[64].addBox(0.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
    bodyModel[64].setRotationPoint(23.5F, -4.0F, -15.0F);
    
    bodyModel[65] = new ModelRendererTurbo(this, 20, 295, 512, 512);
    bodyModel[65].addBox(0.0F, 0.0F, -2.0F, 2, 4, 2, 0.0F);
    bodyModel[65].setRotationPoint(-21.5F, -4.0F, -15.0F);
    
    bodyModel[66] = new ModelRendererTurbo(this, 35, 295, 512, 512);
    bodyModel[66].addBox(0.0F, 0.0F, -2.5F, 3, 2, 3, 0.0F);
    bodyModel[66].setRotationPoint(23.0F, 0.0F, -15.0F);
    
    bodyModel[67] = new ModelRendererTurbo(this, 35, 295, 512, 512);
    bodyModel[67].addBox(0.0F, 0.0F, -2.5F, 3, 2, 3, 0.0F);
    bodyModel[67].setRotationPoint(-22.0F, 0.0F, -15.0F);
    
    bodyModel[68] = new ModelRendererTurbo(this, 50, 295, 512, 512);
    bodyModel[68].addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
    bodyModel[68].setRotationPoint(2.0F, -8.0F, -15.0F);
    
    bodyModel[69] = new ModelRendererTurbo(this, 50, 295, 512, 512);
    bodyModel[69].addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
    bodyModel[69].setRotationPoint(19.0F, -8.0F, -15.0F);
    
    bodyModel[70] = new ModelRendererTurbo(this, 50, 295, 512, 512);
    bodyModel[70].addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
    bodyModel[70].setRotationPoint(-16.0F, -8.0F, -15.0F);
    
    bodyModel[71] = new ModelRendererTurbo(this, 70, 295, 512, 512);
    bodyModel[71].addShapeBox(0.0F, 0.0F, -2.0F, 3, 6, 2, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[71].setRotationPoint(36.0F, -6.0F, -15.0F);
    
    bodyModel[72] = new ModelRendererTurbo(this, 90, 295, 512, 512);
    bodyModel[72].addShapeBox(-3.0F, 0.0F, -2.0F, 3, 6, 2, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[72].setRotationPoint(36.0F, -6.0F, -15.0F);
    
    bodyModel[73] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[73].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[73].setRotationPoint(31.0F, 1.0F, -15.0F);
    (bodyModel[73]).rotateAngleZ = -1.134464F;
    
    bodyModel[74] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[74].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[74].setRotationPoint(22.0F, 1.0F, -15.0F);
    (bodyModel[74]).rotateAngleZ = -1.134464F;
    
    bodyModel[75] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[75].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[75].setRotationPoint(13.0F, 1.0F, -15.0F);
    (bodyModel[75]).rotateAngleZ = -1.134464F;
    
    bodyModel[76] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[76].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[76].setRotationPoint(4.0F, 1.0F, -15.0F);
    (bodyModel[76]).rotateAngleZ = -1.134464F;
    
    bodyModel[77] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[77].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[77].setRotationPoint(-5.0F, 1.0F, -15.0F);
    (bodyModel[77]).rotateAngleZ = -1.134464F;
    
    bodyModel[78] = new ModelRendererTurbo(this, 110, 295, 512, 512);
    bodyModel[78].addBox(0.0F, 0.0F, -2.0F, 2, 8, 2, 0.0F);
    bodyModel[78].setRotationPoint(-14.0F, 1.0F, -15.0F);
    (bodyModel[78]).rotateAngleZ = -1.134464F;
    
    bodyModel[79] = new ModelRendererTurbo(this, 0, 0, 512, 512);
    bodyModel[79].addBox(0.0F, 0.0F, -2.0F, 2, 4, 4, 0.0F);
    bodyModel[79].setRotationPoint(-33.0F, -5.0F, -15.0F);
    
    bodyModel[80] = new ModelRendererTurbo(this, 15, 305, 512, 512);
    bodyModel[80].addShapeBox(0.0F, 0.0F, 0.0F, 3, 5, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[80].setRotationPoint(38.0F, -12.0F, -13.0F);
    
    bodyModel[81] = new ModelRendererTurbo(this, 15, 305, 512, 512);
    bodyModel[81].addShapeBox(0.0F, 0.0F, -4.0F, 3, 5, 4, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[81].setRotationPoint(38.0F, -12.0F, 13.0F);
    
    bodyModel[82] = new ModelRendererTurbo(this, 15, 327, 512, 512);
    bodyModel[82].addShapeBox(0.0F, 0.0F, 0.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[82].setRotationPoint(39.0F, -13.0F, -13.0F);
    
    bodyModel[83] = new ModelRendererTurbo(this, 15, 327, 512, 512);
    bodyModel[83].addShapeBox(0.0F, 0.0F, -4.0F, 2, 1, 4, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[83].setRotationPoint(39.0F, -13.0F, 13.0F);
    
    bodyModel[84] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[84].addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[84].setRotationPoint(36.0F, -3.0F, 17.0F);
    
    bodyModel[85] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[85].addBox(-0.5F, -0.5F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[85].setRotationPoint(-32.0F, -3.0F, 17.0F);
    
    bodyModel[86] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[86].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[86].setRotationPoint(24.5F, 4.5F, 17.0F);
    
    bodyModel[87] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[87].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[87].setRotationPoint(15.5F, 4.5F, 17.0F);
    
    bodyModel[88] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[88].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[88].setRotationPoint(6.5F, 4.5F, 17.0F);
    
    bodyModel[89] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[89].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[89].setRotationPoint(-2.5F, 4.5F, 17.0F);
    
    bodyModel[90] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[90].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[90].setRotationPoint(-11.5F, 4.5F, 17.0F);
    
    bodyModel[91] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[91].addBox(0.0F, 0.0F, 0.0F, 1, 1, 6, 0.0F);
    bodyModel[91].setRotationPoint(-20.5F, 4.5F, 17.0F);
    
    bodyModel[92] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[92].addBox(-0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[92].setRotationPoint(36.0F, -3.0F, -17.0F);
    
    bodyModel[93] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[93].addBox(-0.5F, -0.5F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[93].setRotationPoint(-32.0F, -3.0F, -17.0F);
    
    bodyModel[94] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[94].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[94].setRotationPoint(24.5F, 4.5F, -17.0F);
    
    bodyModel[95] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[95].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[95].setRotationPoint(15.5F, 4.5F, -17.0F);
    
    bodyModel[96] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[96].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[96].setRotationPoint(6.5F, 4.5F, -17.0F);
    
    bodyModel[97] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[97].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[97].setRotationPoint(-2.5F, 4.5F, -17.0F);
    
    bodyModel[98] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[98].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[98].setRotationPoint(-11.5F, 4.5F, -17.0F);
    
    bodyModel[99] = new ModelRendererTurbo(this, 0, 320, 512, 512);
    bodyModel[99].addBox(0.0F, 0.0F, -6.0F, 1, 1, 6, 0.0F);
    bodyModel[99].setRotationPoint(-20.5F, 4.5F, -17.0F);
    
    bodyModel[100] = new ModelRendererTurbo(this, 0, 405, 512, 512);
    bodyModel[100].addBox(-9.0F, 0.0F, -15.0F, 22, 3, 30, 0.0F);
    bodyModel[100].setRotationPoint(0.0F, -20.0F, 0.0F);
    
    bodyModel[101] = new ModelRendererTurbo(this, 0, 340, 512, 512);
    bodyModel[101].addShapeBox(3.0F, 0.0F, -5.0F, 10, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[101].setRotationPoint(0.0F, -22.0F, 0.0F);
    
    bodyModel[102] = new ModelRendererTurbo(this, 50, 340, 512, 512);
    bodyModel[102].addBox(0.0F, 0.0F, 0.0F, 1, 4, 1, 0.0F);
    bodyModel[102].setRotationPoint(-38.0F, -8.5F, 1.0F);
    
    bodyModel[103] = new ModelRendererTurbo(this, 0, 450, 512, 512);
    bodyModel[103].addBox(0.0F, 0.0F, -1.0F, 1, 4, 1, 0.0F);
    bodyModel[103].setRotationPoint(-38.0F, -8.5F, -1.0F);
    
    bodyModel[104] = new ModelRendererTurbo(this, 10, 465, 512, 512);
    bodyModel[104].addShapeBox(0.0F, 0.0F, 0.0F, 5, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[104].setRotationPoint(-38.2F, -4.5F, 1.0F);
    
    bodyModel[105] = new ModelRendererTurbo(this, 45, 465, 512, 512);
    bodyModel[105].addShapeBox(0.0F, 0.0F, -9.0F, 5, 4, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[105].setRotationPoint(-38.2F, -4.5F, -1.0F);
    
    bodyModel[106] = new ModelRendererTurbo(this, 25, 448, 512, 512);
    bodyModel[106].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[106].setRotationPoint(-37.0F, -3.0F, 9.0F);
    
    bodyModel[107] = new ModelRendererTurbo(this, 25, 448, 512, 512);
    bodyModel[107].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[107].setRotationPoint(-37.0F, -3.0F, -9.0F);
    
    bodyModel[108] = new ModelRendererTurbo(this, 40, 448, 512, 512);
    bodyModel[108].addBox(-3.0F, 0.0F, 0.0F, 3, 1, 1, 0.0F);
    bodyModel[108].setRotationPoint(-37.0F, -3.0F, 11.0F);
    (bodyModel[108]).rotateAngleZ = 0.4363323F;
    
    bodyModel[109] = new ModelRendererTurbo(this, 40, 448, 512, 512);
    bodyModel[109].addBox(-3.0F, 0.0F, -1.0F, 3, 1, 1, 0.0F);
    bodyModel[109].setRotationPoint(-37.0F, -3.0F, -11.0F);
    (bodyModel[109]).rotateAngleZ = 0.4363323F;
    
    bodyModel[110] = new ModelRendererTurbo(this, 60, 450, 512, 512);
    bodyModel[110].addBox(0.0F, 0.0F, -2.0F, 2, 1, 4, 0.0F);
    bodyModel[110].setRotationPoint(-26.0F, -18.0F, 7.5F);
    
    bodyModel[111] = new ModelRendererTurbo(this, 80, 450, 512, 512);
    bodyModel[111].addBox(0.0F, 0.0F, -2.0F, 2, 1, 4, 0.0F);
    bodyModel[111].setRotationPoint(-15.0F, -18.0F, 7.5F);
    
    bodyModel[112] = new ModelRendererTurbo(this, 60, 340, 512, 512);
    bodyModel[112].addShapeBox(-11.0F, 0.0F, -5.0F, 14, 2, 10, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -7.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[112].setRotationPoint(0.0F, -23.0F, 0.0F);
    
    bodyModel[113] = new ModelRendererTurbo(this, 120, 340, 512, 512);
    bodyModel[113].addShapeBox(0.0F, 0.0F, 0.0F, 13, 2, 10, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[113].setRotationPoint(0.0F, -22.0F, 5.0F);
    
    bodyModel[114] = new ModelRendererTurbo(this, 170, 340, 512, 512);
    bodyModel[114].addShapeBox(0.0F, 0.0F, -10.0F, 13, 2, 10, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[114].setRotationPoint(0.0F, -22.0F, -5.0F);
    
    bodyModel[115] = new ModelRendererTurbo(this, 240, 315, 512, 512);
    bodyModel[115].addShapeBox(0.0F, 0.0F, 0.0F, 8, 5, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[115].setRotationPoint(12.0F, -22.0F, -9.0F);
    
    bodyModel[116] = new ModelRendererTurbo(this, 260, 340, 512, 512);
    bodyModel[116].addShapeBox(-2.0F, 0.0F, -5.0F, 2, 4, 10, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F);
    bodyModel[116].setRotationPoint(-9.0F, -21.0F, 0.0F);
    
    bodyModel[117] = new ModelRendererTurbo(this, 290, 340, 512, 512);
    bodyModel[117].addShapeBox(-11.0F, 0.0F, 0.0F, 11, 2, 10, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, -1.9F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[117].setRotationPoint(0.0F, -22.0F, 5.0F);
    
    bodyModel[118] = new ModelRendererTurbo(this, 350, 340, 512, 512);
    bodyModel[118].addShapeBox(-11.0F, 0.0F, -10.0F, 11, 2, 10, 0.0F, -0.5F, -1.9F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F);
    bodyModel[118].setRotationPoint(0.0F, -22.0F, -5.0F);
    
    bodyModel[119] = new ModelRendererTurbo(this, 0, 360, 512, 512);
    bodyModel[119].addShapeBox(0.0F, 0.0F, 0.0F, 1, 3, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
    bodyModel[119].setRotationPoint(-10.0F, -20.0F, 5.0F);
    
    bodyModel[120] = new ModelRendererTurbo(this, 30, 360, 512, 512);
    bodyModel[120].addShapeBox(0.0F, 0.0F, -10.0F, 1, 3, 10, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F);
    bodyModel[120].setRotationPoint(-10.0F, -20.0F, -5.0F);
    
    bodyModel[121] = new ModelRendererTurbo(this, 60, 360, 512, 512);
    bodyModel[121].addBox(-2.5F, 0.0F, -2.5F, 5, 3, 5, 0.0F);
    bodyModel[121].setRotationPoint(-1.0F, -25.5F, -2.0F);
    
    bodyModel[122] = new ModelRendererTurbo(this, 85, 360, 512, 512);
    bodyModel[122].addShapeBox(0.0F, 0.0F, 0.0F, 13, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[122].setRotationPoint(13.0F, -19.0F, -15.0F);
    
    bodyModel[123] = new ModelRendererTurbo(this, 130, 360, 512, 512);
    bodyModel[123].addShapeBox(0.0F, 0.0F, 0.0F, 13, 8, 11, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -2.0F, 0.0F, -1.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[123].setRotationPoint(13.0F, -19.0F, 4.0F);
    
    bodyModel[124] = new ModelRendererTurbo(this, 185, 380, 512, 512);
    bodyModel[124].addShapeBox(0.0F, -1.0F, 2.0F, 6, 1, 7, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -6.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -5.0F);
    bodyModel[124].setRotationPoint(2.0F, -22.0F, 5.0F);
    (bodyModel[124]).rotateAngleX = -0.09599311F;
    
    bodyModel[125] = new ModelRendererTurbo(this, 185, 395, 512, 512);
    bodyModel[125].addShapeBox(0.0F, -1.0F, 5.0F, 5, 1, 4, 0.0F, 0.0F, 0.0F, -3.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, -3.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.9F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -1.9F, 0.0F, 0.0F, 0.0F);
    bodyModel[125].setRotationPoint(8.0F, -22.0F, 5.0F);
    (bodyModel[125]).rotateAngleX = -0.09599311F;
    
    bodyModel[126] = new ModelRendererTurbo(this, 200, 360, 512, 512);
    bodyModel[126].addBox(0.0F, 0.0F, 0.0F, 1, 2, 9, 0.0F);
    bodyModel[126].setRotationPoint(28.0F, -12.0F, 3.0F);
    
    bodyModel[127] = new ModelRendererTurbo(this, 230, 360, 512, 512);
    bodyModel[127].addShapeBox(0.0F, 0.0F, 0.0F, 19, 7, 5, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[127].setRotationPoint(-7.0F, -19.0F, -20.0F);
    
    bodyModel[128] = new ModelRendererTurbo(this, 290, 360, 512, 512);
    bodyModel[128].addShapeBox(0.0F, 0.0F, 0.0F, 19, 7, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[128].setRotationPoint(-7.0F, -19.0F, 15.0F);
    
    bodyModel[129] = new ModelRendererTurbo(this, 150, 305, 512, 512);
    bodyModel[129].addShape3D(-4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 4, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    bodyModel[129].setRotationPoint(-33.0F, -15.5F, 20.0F);
    (bodyModel[129]).rotateAngleZ = 0.07504916F;
    
    bodyModel[130] = new ModelRendererTurbo(this, 150, 305, 512, 512);
    bodyModel[130].addShape3D(-4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 4, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    bodyModel[130].setRotationPoint(-33.0F, -15.5F, -20.0F);
    (bodyModel[130]).rotateAngleZ = 0.07504916F;
    
    bodyModel[131] = new ModelRendererTurbo(this, 200, 300, 512, 512);
    bodyModel[131].addShapeBox(0.0F, 0.0F, 0.0F, 13, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[131].setRotationPoint(12.0F, -21.0F, -15.0F);
    
    bodyModel[132] = new ModelRendererTurbo(this, 240, 300, 512, 512);
    bodyModel[132].addShapeBox(0.0F, 0.0F, 0.0F, 8, 5, 1, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[132].setRotationPoint(12.0F, -22.0F, 4.0F);
    
    bodyModel[133] = new ModelRendererTurbo(this, 295, 300, 512, 512);
    bodyModel[133].addShapeBox(0.0F, 0.0F, -1.0F, 13, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[133].setRotationPoint(12.0F, -21.0F, 15.0F);
    
    bodyModel[134] = new ModelRendererTurbo(this, 350, 360, 512, 512);
    bodyModel[134].addBox(0.0F, -1.0F, 0.0F, 1, 2, 12, 0.0F);
    bodyModel[134].setRotationPoint(25.0F, -11.0F, -8.0F);
    (bodyModel[134]).rotateAngleZ = 0.1570796F;
    
    bodyModel[135] = new ModelRendererTurbo(this, 315, 285, 512, 512);
    bodyModel[135].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[135].setRotationPoint(-4.0F, -13.0F, -24.0F);
    
    bodyModel[136] = new ModelRendererTurbo(this, 315, 315, 512, 512);
    bodyModel[136].addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
    bodyModel[136].setRotationPoint(-3.0F, -12.5F, -22.5F);
    (bodyModel[136]).rotateAngleY = 0.1745329F;
    
    bodyModel[137] = new ModelRendererTurbo(this, 315, 315, 512, 512);
    bodyModel[137].addBox(0.0F, 0.0F, -1.0F, 7, 1, 1, 0.0F);
    bodyModel[137].setRotationPoint(-3.0F, -12.5F, -22.5F);
    (bodyModel[137]).rotateAngleY = -0.1745329F;
    
    bodyModel[138] = new ModelRendererTurbo(this, 325, 300, 512, 512);
    bodyModel[138].addBox(-2.0F, 0.0F, -1.0F, 3, 1, 2, 0.0F);
    bodyModel[138].setRotationPoint(-4.5F, -12.5F, -22.5F);
    
    bodyModel[139] = new ModelRendererTurbo(this, 340, 300, 512, 512);
    bodyModel[139].addBox(0.0F, 0.0F, 0.0F, 36, 2, 2, 0.0F);
    bodyModel[139].setRotationPoint(-46.5F, -20.0F, -17.0F);
    (bodyModel[139]).rotateAngleZ = -0.02617994F;
    
    bodyModel[140] = new ModelRendererTurbo(this, 340, 315, 512, 512);
    bodyModel[140].addBox(0.0F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
    bodyModel[140].setRotationPoint(-40.0F, -18.0F, -16.0F);
    
    bodyModel[141] = new ModelRendererTurbo(this, 350, 315, 512, 512);
    bodyModel[141].addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
    bodyModel[141].setRotationPoint(-21.0F, -18.0F, -20.0F);
    
    bodyModel[142] = new ModelRendererTurbo(this, 350, 315, 512, 512);
    bodyModel[142].addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
    bodyModel[142].setRotationPoint(-12.0F, -18.0F, -20.0F);
    
    bodyModel[143] = new ModelRendererTurbo(this, 360, 325, 512, 512);
    bodyModel[143].addBox(0.0F, 0.0F, 0.0F, 15, 3, 2, 0.0F);
    bodyModel[143].setRotationPoint(-24.0F, -16.5F, -23.5F);
    
    bodyModel[144] = new ModelRendererTurbo(this, 400, 315, 512, 512);
    bodyModel[144].addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
    bodyModel[144].setRotationPoint(-23.0F, -16.0F, -24.0F);
    
    bodyModel[145] = new ModelRendererTurbo(this, 400, 315, 512, 512);
    bodyModel[145].addBox(0.0F, 0.0F, 0.0F, 1, 4, 3, 0.0F);
    bodyModel[145].setRotationPoint(-12.0F, -16.0F, -24.0F);
    
    bodyModel[146] = new ModelRendererTurbo(this, 410, 315, 512, 512);
    bodyModel[146].addBox(0.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F);
    bodyModel[146].setRotationPoint(-20.0F, -17.0F, -23.0F);
    
    bodyModel[147] = new ModelRendererTurbo(this, 270, 315, 512, 512);
    bodyModel[147].addShapeBox(0.0F, 0.0F, 0.0F, 5, 4, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[147].setRotationPoint(20.0F, -21.0F, -9.0F);
    
    bodyModel[148] = new ModelRendererTurbo(this, 340, 300, 512, 512);
    bodyModel[148].addBox(0.0F, 0.0F, -2.0F, 36, 2, 2, 0.0F);
    bodyModel[148].setRotationPoint(-46.5F, -20.0F, 17.0F);
    (bodyModel[148]).rotateAngleZ = -0.02617994F;
    
    bodyModel[149] = new ModelRendererTurbo(this, 340, 315, 512, 512);
    bodyModel[149].addBox(0.0F, 0.0F, -0.5F, 1, 7, 1, 0.0F);
    bodyModel[149].setRotationPoint(-40.0F, -18.0F, 16.0F);
    
    bodyModel[150] = new ModelRendererTurbo(this, 350, 315, 512, 512);
    bodyModel[150].addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
    bodyModel[150].setRotationPoint(-21.0F, -18.0F, 20.0F);
    
    bodyModel[151] = new ModelRendererTurbo(this, 350, 315, 512, 512);
    bodyModel[151].addBox(0.0F, 0.0F, -5.0F, 1, 1, 5, 0.0F);
    bodyModel[151].setRotationPoint(-12.0F, -18.0F, 20.0F);
    
    bodyModel[152] = new ModelRendererTurbo(this, 290, 315, 512, 512);
    bodyModel[152].addShapeBox(0.0F, -6.0F, 0.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[152].setRotationPoint(25.0F, -11.0F, -8.0F);
    (bodyModel[152]).rotateAngleZ = 0.1570796F;
    
    bodyModel[153] = new ModelRendererTurbo(this, 300, 315, 512, 512);
    bodyModel[153].addShapeBox(0.0F, -6.0F, 0.0F, 1, 5, 1, 0.0F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, -0.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[153].setRotationPoint(25.0F, -11.0F, 3.0F);
    (bodyModel[153]).rotateAngleZ = 0.1570796F;
    
    bodyModel[154] = new ModelRendererTurbo(this, 370, 410, 512, 512);
    bodyModel[154].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[154].setRotationPoint(-9.0F, -18.5F, 15.0F);
    
    bodyModel[155] = new ModelRendererTurbo(this, 370, 410, 512, 512);
    bodyModel[155].addBox(0.0F, 0.0F, -2.0F, 1, 1, 2, 0.0F);
    bodyModel[155].setRotationPoint(-9.0F, -18.0F, -15.0F);
    
    bodyModel[156] = new ModelRendererTurbo(this, 385, 410, 512, 512);
    bodyModel[156].addShapeBox(-0.5F, -35.0F, 0.5F, 1, 35, 1, 0.0F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F);
    bodyModel[156].setRotationPoint(-8.5F, -18.0F, 15.0F);
    (bodyModel[156]).rotateAngleZ = 0.5235988F;
    
    bodyModel[157] = new ModelRendererTurbo(this, 385, 410, 512, 512);
    bodyModel[157].addShapeBox(-0.5F, -35.0F, -1.5F, 1, 35, 1, 0.0F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F, -0.3F, 0.0F, -0.3F);
    bodyModel[157].setRotationPoint(-8.5F, -18.0F, -15.0F);
    (bodyModel[157]).rotateAngleZ = 0.5235988F;
    
    bodyModel[158] = new ModelRendererTurbo(this, 395, 410, 512, 512);
    bodyModel[158].addBox(0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F);
    bodyModel[158].setRotationPoint(-2.0F, -18.0F, 20.0F);
    
    bodyModel[159] = new ModelRendererTurbo(this, 395, 410, 512, 512);
    bodyModel[159].addBox(0.0F, 0.0F, 0.0F, 1, 6, 2, 0.0F);
    bodyModel[159].setRotationPoint(-14.0F, -18.0F, 20.0F);
    
    bodyModel[160] = new ModelRendererTurbo(this, 405, 410, 512, 512);
    bodyModel[160].addBox(0.0F, 0.0F, 0.0F, 18, 1, 1, 0.0F);
    bodyModel[160].setRotationPoint(-17.0F, -17.5F, 20.5F);
    
    bodyModel[161] = new ModelRendererTurbo(this, 405, 420, 512, 512);
    bodyModel[161].addBox(0.0F, 0.0F, 0.0F, 18, 1, 1, 0.0F);
    bodyModel[161].setRotationPoint(-15.0F, -15.5F, 20.5F);
    
    bodyModel[162] = new ModelRendererTurbo(this, 405, 430, 512, 512);
    bodyModel[162].addBox(0.0F, 0.0F, 0.0F, 5, 2, 2, 0.0F);
    bodyModel[162].setRotationPoint(-20.0F, -16.0F, 20.0F);
    
    bodyModel[163] = new ModelRendererTurbo(this, 405, 440, 512, 512);
    bodyModel[163].addBox(0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
    bodyModel[163].setRotationPoint(-13.0F, -12.5F, 20.5F);
    
    bodyModel[163] = new ModelRendererTurbo(this, 405, 450, 512, 512);
    bodyModel[163].addBox(0.0F, 0.0F, 0.0F, 15, 1, 1, 0.0F);
    bodyModel[163].setRotationPoint(-10.0F, -12.7F, 22.0F);
    
    bodyModel[164] = new ModelRendererTurbo(this, 405, 460, 512, 512);
    bodyModel[164].addBox(0.0F, 0.0F, 0.0F, 12, 1, 1, 0.0F);
    bodyModel[164].setRotationPoint(-27.0F, -12.5F, 22.0F);
    
    bodyModel[165] = new ModelRendererTurbo(this, 405, 470, 512, 512);
    bodyModel[165].addShapeBox(0.0F, 0.0F, 0.0F, 3, 1, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[165].setRotationPoint(-18.5F, -12.8F, 19.5F);
    
    bodyModel[166] = new ModelRendererTurbo(this, 100, 450, 512, 512);
    bodyModel[166].addBox(0.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
    bodyModel[166].setRotationPoint(18.0F, -12.5F, 17.0F);
    
    bodyModel[167] = new ModelRendererTurbo(this, 120, 450, 512, 512);
    bodyModel[167].addBox(0.0F, 0.0F, 0.0F, 1, 1, 4, 0.0F);
    bodyModel[167].setRotationPoint(18.0F, -12.5F, 18.0F);
    
    bodyModel[168] = new ModelRendererTurbo(this, 135, 450, 512, 512);
    bodyModel[168].addBox(0.0F, 0.0F, 0.0F, 7, 1, 1, 0.0F);
    bodyModel[168].setRotationPoint(12.0F, -12.5F, 22.0F);
    
    bodyModel[169] = new ModelRendererTurbo(this, 135, 460, 512, 512);
    bodyModel[169].addBox(1.0F, 0.0F, 0.0F, 9, 1, 1, 0.0F);
    bodyModel[169].setRotationPoint(24.0F, -12.5F, -18.0F);
    (bodyModel[169]).rotateAngleZ = -0.05759586F;
    
    bodyModel[170] = new ModelRendererTurbo(this, 135, 465, 512, 512);
    bodyModel[170].addBox(1.3F, 0.0F, -3.0F, 2, 1, 3, 0.0F);
    bodyModel[170].setRotationPoint(24.0F, -12.7F, -16.0F);
    (bodyModel[170]).rotateAngleZ = -0.05759586F;
    
    bodyModel[171] = new ModelRendererTurbo(this, 135, 475, 512, 512);
    bodyModel[171].addBox(0.0F, 0.0F, 0.0F, 9, 3, 5, 0.0F);
    bodyModel[171].setRotationPoint(15.0F, -16.0F, -23.0F);
    
    bodyModel[172] = new ModelRendererTurbo(this, 135, 490, 512, 512);
    bodyModel[172].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    bodyModel[172].setRotationPoint(15.0F, -13.0F, -23.0F);
    
    bodyModel[173] = new ModelRendererTurbo(this, 135, 490, 512, 512);
    bodyModel[173].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    bodyModel[173].setRotationPoint(15.0F, -13.0F, -19.0F);
    
    bodyModel[174] = new ModelRendererTurbo(this, 135, 490, 512, 512);
    bodyModel[174].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    bodyModel[174].setRotationPoint(23.0F, -13.0F, -23.0F);
    
    bodyModel[175] = new ModelRendererTurbo(this, 135, 490, 512, 512);
    bodyModel[175].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    bodyModel[175].setRotationPoint(23.0F, -13.0F, -19.0F);
    
    bodyModel[176] = new ModelRendererTurbo(this, 135, 499, 512, 512);
    bodyModel[176].addBox(6.0F, -1.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[176].setRotationPoint(24.0F, -11.8F, -18.5F);
    (bodyModel[176]).rotateAngleZ = -0.05759586F;
    
    bodyModel[177] = new ModelRendererTurbo(this, 135, 499, 512, 512);
    bodyModel[177].addBox(0.0F, 0.0F, -0.5F, 1, 1, 2, 0.0F);
    bodyModel[177].setRotationPoint(21.0F, -12.8F, 17.0F);
    
    bodyModel[178] = new ModelRendererTurbo(this, 135, 499, 512, 512);
    bodyModel[178].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[178].setRotationPoint(14.0F, -12.8F, 21.5F);
    
    bodyModel[179] = new ModelRendererTurbo(this, 135, 499, 512, 512);
    bodyModel[179].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[179].setRotationPoint(2.0F, -13.0F, 21.5F);
    
    bodyModel[180] = new ModelRendererTurbo(this, 135, 499, 512, 512);
    bodyModel[180].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[180].setRotationPoint(-7.0F, -13.0F, 21.5F);
    
    bodyModel[181] = new ModelRendererTurbo(this, 135, 499, 512, 512);
    bodyModel[181].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[181].setRotationPoint(-20.0F, -12.7F, 21.5F);
    
    bodyModel[182] = new ModelRendererTurbo(this, 135, 499, 512, 512);
    bodyModel[182].addBox(0.0F, 0.0F, 0.0F, 1, 1, 2, 0.0F);
    bodyModel[182].setRotationPoint(-26.0F, -12.7F, 21.5F);
    
    bodyModel[183] = new ModelRendererTurbo(this, 160, 450, 512, 512);
    bodyModel[183].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[183].setRotationPoint(33.0F, -13.0F, -23.0F);
    
    bodyModel[184] = new ModelRendererTurbo(this, 160, 450, 512, 512);
    bodyModel[184].addBox(0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
    bodyModel[184].setRotationPoint(33.0F, -12.0F, 23.0F);
    
    bodyModel[185] = new ModelRendererTurbo(this, 160, 450, 512, 512);
    bodyModel[185].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[185].setRotationPoint(33.0F, -12.0F, -20.5F);
    
    bodyModel[186] = new ModelRendererTurbo(this, 174, 450, 512, 512);
    bodyModel[186].addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
    bodyModel[186].setRotationPoint(32.5F, -14.0F, -21.0F);
    
    bodyModel[187] = new ModelRendererTurbo(this, 160, 450, 512, 512);
    bodyModel[187].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[187].setRotationPoint(33.9F, -13.0F, 19.0F);
    
    bodyModel[188] = new ModelRendererTurbo(this, 160, 460, 512, 512);
    bodyModel[188].addShapeBox(-2.0F, 0.0F, -1.0F, 2, 2, 3, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F);
    bodyModel[188].setRotationPoint(35.0F, -14.0F, 19.0F);
    
    bodyModel[189] = new ModelRendererTurbo(this, 190, 450, 512, 512);
    bodyModel[189].addShapeBox(0.0F, 0.0F, -3.0F, 3, 1, 3, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F);
    bodyModel[189].setRotationPoint(35.0F, -14.0F, 21.0F);
    
    bodyModel[190] = new ModelRendererTurbo(this, 210, 450, 512, 512);
    bodyModel[190].addBox(0.0F, 0.0F, 0.0F, 1, 2, 4, 0.0F);
    bodyModel[190].setRotationPoint(-40.0F, -13.5F, 18.0F);
    
    bodyModel[191] = new ModelRendererTurbo(this, 210, 460, 512, 512);
    bodyModel[191].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[191].setRotationPoint(-39.5F, -12.0F, 18.5F);
    
    bodyModel[192] = new ModelRendererTurbo(this, 225, 450, 512, 512);
    bodyModel[192].addBox(0.0F, 0.0F, 0.0F, 1, 2, 2, 0.0F);
    bodyModel[192].setRotationPoint(-40.0F, -13.5F, -21.0F);
    
    bodyModel[193] = new ModelRendererTurbo(this, 225, 460, 512, 512);
    bodyModel[193].addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    bodyModel[193].setRotationPoint(-39.5F, -12.0F, -20.5F);
    
    bodyModel[194] = new ModelRendererTurbo(this, 405, 440, 512, 512);
    bodyModel[194].addBox(0.0F, 0.0F, 0.0F, 5, 1, 4, 0.0F);
    bodyModel[194].setRotationPoint(-13.0F, -12.5F, 20.5F);
    
    leftTrackWheelModels = new ModelRendererTurbo[12];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 30, 320, 512, 512);
    leftTrackWheelModels[0].addShape3D(6.0F, -6.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 1.0F, 12, 12, 40, 1, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[0].setRotationPoint(36.0F, -3.0F, 21.5F);
    
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 30, 320, 512, 512);
    leftTrackWheelModels[1].addShape3D(6.0F, -6.0F, -1.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 1.0F, 12, 12, 40, 1, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[1].setRotationPoint(36.0F, -3.0F, 18.5F);
    
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    leftTrackWheelModels[2].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[2].setRotationPoint(25.0F, 5.0F, 18.5F);
    
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    leftTrackWheelModels[3].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[3].setRotationPoint(16.0F, 5.0F, 18.5F);
    
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    leftTrackWheelModels[4].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[4].setRotationPoint(7.0F, 5.0F, 18.5F);
    
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    leftTrackWheelModels[5].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[5].setRotationPoint(-2.0F, 5.0F, 18.5F);
    
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    leftTrackWheelModels[6].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[6].setRotationPoint(-11.0F, 5.0F, 18.5F);
    
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    leftTrackWheelModels[7].addShape3D(4.0F, -4.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[7].setRotationPoint(-20.0F, 5.0F, 18.5F);
    
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 120, 320, 512, 512);
    leftTrackWheelModels[8].addShape3D(6.0F, -6.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 4.0F, 12, 12, 40, 4, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    leftTrackWheelModels[8].setRotationPoint(-32.0F, -3.0F, 18.5F);
    
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 90, 320, 512, 512);
    leftTrackWheelModels[9].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
    leftTrackWheelModels[9].setRotationPoint(19.5F, -7.5F, 18.5F);
    
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 90, 320, 512, 512);
    leftTrackWheelModels[10].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
    leftTrackWheelModels[10].setRotationPoint(2.5F, -7.5F, 18.5F);
    
    leftTrackWheelModels[11] = new ModelRendererTurbo(this, 90, 320, 512, 512);
    leftTrackWheelModels[11].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 4, 0.0F);
    leftTrackWheelModels[11].setRotationPoint(-15.5F, -7.5F, 18.5F);

    
    leftTrackModel = new ModelRendererTurbo[8];
    leftTrackModel[0] = new ModelRendererTurbo(this, 310, 267, 512, 512);
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 74, 2, 7, 0.0F);
    leftTrackModel[0].setRotationPoint(-35.0F, -10.0F, 17.0F);
    
    leftTrackModel[1] = new ModelRendererTurbo(this, 200, 267, 512, 512);
    leftTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 5, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[1].setRotationPoint(39.0F, -10.0F, 17.0F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2] = new ModelRendererTurbo(this, 250, 267, 512, 512);
    leftTrackModel[2].addBox(-2.0F, 0.0F, 0.0F, 2, 6, 7, 0.0F);
    leftTrackModel[2].setRotationPoint(43.0F, -6.0F, 17.0F);
    
    leftTrackModel[3] = new ModelRendererTurbo(this, 280, 267, 512, 512);
    leftTrackModel[3].addBox(-2.0F, 0.0F, 0.0F, 2, 19, 7, 0.0F);
    leftTrackModel[3].setRotationPoint(43.0F, 0.0F, 17.0F);
    (leftTrackModel[3]).rotateAngleZ = -1.021018F;
    
    leftTrackModel[4] = new ModelRendererTurbo(this, 0, 267, 512, 512);
    leftTrackModel[4].addBox(-49.0F, 0.0F, 0.0F, 50, 2, 7, 0.0F);
    leftTrackModel[4].setRotationPoint(26.0F, 8.0F, 17.0F);
    
    leftTrackModel[5] = new ModelRendererTurbo(this, 150, 267, 512, 512);
    leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 2, 19, 7, 0.0F);
    leftTrackModel[5].setRotationPoint(-39.0F, 0.0F, 17.0F);
    (leftTrackModel[5]).rotateAngleZ = 1.021018F;
    
    leftTrackModel[6] = new ModelRendererTurbo(this, 175, 267, 512, 512);
    leftTrackModel[6].addBox(0.0F, 0.0F, 0.0F, 2, 6, 7, 0.0F);
    leftTrackModel[6].setRotationPoint(-39.0F, -6.0F, 17.0F);
    
    leftTrackModel[7] = new ModelRendererTurbo(this, 123, 267, 512, 512);
    leftTrackModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
    leftTrackModel[7].setRotationPoint(-35.0F, -10.0F, 17.0F);
    (leftTrackModel[7]).rotateAngleZ = -0.7853982F;
    
    rightTrackWheelModels = new ModelRendererTurbo[12];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 30, 320, 512, 512);
    rightTrackWheelModels[0].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 1.0F, 12, 12, 40, 1, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[0].setRotationPoint(36.0F, -3.0F, -21.5F);
    
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 30, 320, 512, 512);
    rightTrackWheelModels[1].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 1.0F, 12, 12, 40, 1, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[1].setRotationPoint(36.0F, -3.0F, -18.5F);
    
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    rightTrackWheelModels[2].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[2].setRotationPoint(25.0F, 5.0F, -18.5F);
    
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    rightTrackWheelModels[3].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[3].setRotationPoint(16.0F, 5.0F, -18.5F);
    
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    rightTrackWheelModels[4].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[4].setRotationPoint(7.0F, 5.0F, -18.5F);
    
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    rightTrackWheelModels[5].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[5].setRotationPoint(-2.0F, 5.0F, -18.5F);
    
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    rightTrackWheelModels[6].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[6].setRotationPoint(-11.0F, 5.0F, -18.5F);
    
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 60, 320, 512, 512);
    rightTrackWheelModels[7].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 4.0F, 8, 8, 28, 4, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[7].setRotationPoint(-20.0F, 5.0F, -18.5F);
    
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 120, 320, 512, 512);
    rightTrackWheelModels[8].addShape3D(6.0F, -6.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(12.0D, 4.0D, 12, 4), new Coord2D(12.0D, 8.0D, 12, 8), new Coord2D(8.0D, 12.0D, 8, 12), new Coord2D(4.0D, 12.0D, 4, 12), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 4.0D, 0, 4), new Coord2D(4.0D, 0.0D, 4, 0) }), 4.0F, 12, 12, 40, 4, 0, new float[] { 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F, 6.0F, 4.0F });
    rightTrackWheelModels[8].setRotationPoint(-32.0F, -3.0F, -18.5F);
    
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 90, 320, 512, 512);
    rightTrackWheelModels[9].addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
    rightTrackWheelModels[9].setRotationPoint(19.5F, -7.5F, -18.5F);
    
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 90, 320, 512, 512);
    rightTrackWheelModels[10].addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
    rightTrackWheelModels[10].setRotationPoint(2.5F, -7.5F, -18.5F);
    
    rightTrackWheelModels[11] = new ModelRendererTurbo(this, 90, 320, 512, 512);
    rightTrackWheelModels[11].addBox(-1.5F, -1.5F, -4.0F, 3, 3, 4, 0.0F);
    rightTrackWheelModels[11].setRotationPoint(-15.5F, -7.5F, -18.5F);
    
    rightTrackModel = new ModelRendererTurbo[8];
    rightTrackModel[0] = new ModelRendererTurbo(this, 310, 267, 512, 512);
    rightTrackModel[0].addBox(0.0F, 0.0F, -7.0F, 74, 2, 7, 0.0F);
    rightTrackModel[0].setRotationPoint(-35.0F, -10.0F, -17.0F);
    
    rightTrackModel[1] = new ModelRendererTurbo(this, 200, 267, 512, 512);
    rightTrackModel[1].addShapeBox(0.0F, 0.0F, -7.0F, 5, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[1].setRotationPoint(39.0F, -10.0F, -17.0F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2] = new ModelRendererTurbo(this, 250, 267, 512, 512);
    rightTrackModel[2].addBox(-2.0F, 0.0F, -7.0F, 2, 6, 7, 0.0F);
    rightTrackModel[2].setRotationPoint(43.0F, -6.0F, -17.0F);
    
    rightTrackModel[3] = new ModelRendererTurbo(this, 280, 267, 512, 512);
    rightTrackModel[3].addBox(-2.0F, 0.0F, -7.0F, 2, 19, 7, 0.0F);
    rightTrackModel[3].setRotationPoint(43.0F, 0.0F, -17.0F);
    (rightTrackModel[3]).rotateAngleZ = -1.021018F;
    
    rightTrackModel[4] = new ModelRendererTurbo(this, 0, 267, 512, 512);
    rightTrackModel[4].addBox(-49.0F, 0.0F, -7.0F, 50, 2, 7, 0.0F);
    rightTrackModel[4].setRotationPoint(26.0F, 8.0F, -17.0F);
    
    rightTrackModel[5] = new ModelRendererTurbo(this, 150, 267, 512, 512);
    rightTrackModel[5].addBox(0.0F, 0.0F, -7.0F, 2, 19, 7, 0.0F);
    rightTrackModel[5].setRotationPoint(-39.0F, 0.0F, -17.0F);
    (rightTrackModel[5]).rotateAngleZ = 1.021018F;
    
    rightTrackModel[6] = new ModelRendererTurbo(this, 175, 267, 512, 512);
    rightTrackModel[6].addBox(0.0F, 0.0F, -7.0F, 2, 6, 7, 0.0F);
    rightTrackModel[6].setRotationPoint(-39.0F, -6.0F, -17.0F);
    
    rightTrackModel[7] = new ModelRendererTurbo(this, 123, 267, 512, 512);
    rightTrackModel[7].addShapeBox(0.0F, 0.0F, -7.0F, 2, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F);
    rightTrackModel[7].setRotationPoint(-35.0F, -10.0F, -17.0F);
    (rightTrackModel[7]).rotateAngleZ = -0.7853982F;
    
    barrelModel = new ModelRendererTurbo[16];
    barrelModel[0] = new ModelRendererTurbo(this, 130, 410, 512, 512);
    barrelModel[0].addBox(-5.0F, -5.0F, -2.0F, 7, 7, 4, 0.0F);
    barrelModel[0].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[1] = new ModelRendererTurbo(this, 160, 410, 512, 512);
    barrelModel[1].addBox(2.0F, -7.0F, -5.0F, 1, 10, 10, 0.0F);
    barrelModel[1].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[2] = new ModelRendererTurbo(this, 185, 410, 512, 512);
    barrelModel[2].addShapeBox(3.0F, -5.5F, -3.5F, 10, 8, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F);
    barrelModel[2].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[3] = new ModelRendererTurbo(this, 225, 410, 512, 512);
    barrelModel[3].addBox(12.0F, -2.5F, -2.5F, 11, 5, 5, 0.0F);
    barrelModel[3].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[4] = new ModelRendererTurbo(this, 262, 410, 512, 512);
    barrelModel[4].addTrapezoid(23.0F, -1.5F, -1.5F, 22, 3, 3, 0.0F, -0.1F, 2);
    barrelModel[4].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[5] = new ModelRendererTurbo(this, 262, 420, 512, 512);
    barrelModel[5].addBox(46.0F, -1.5F, -1.5F, 2, 3, 3, 0.0F);
    barrelModel[5].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[6] = new ModelRendererTurbo(this, 275, 420, 512, 512);
    barrelModel[6].addTrapezoid(23.0F, -2.5F, -2.5F, 1, 5, 5, 0.0F, -1.0F, 2);
    barrelModel[6].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[7] = new ModelRendererTurbo(this, 275, 435, 512, 512);
    barrelModel[7].addTrapezoid(45.0F, -1.5F, -1.5F, 1, 3, 3, 0.0F, -0.1F, 3);
    barrelModel[7].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[8] = new ModelRendererTurbo(this, 315, 410, 512, 512);
    /*(barrelModel[8]).flip = true;
    barrelModel[8].addTrapezoid(48.0F, -2.5F, -2.5F, 2, 5, 5, 0.0F, -1.0F, 3);
    barrelModel[8].setRotationPoint(13.0F, -15.0F, -2.0F);*/
    
    barrelModel[9] = new ModelRendererTurbo(this, 315, 425, 512, 512);
    /*(barrelModel[9]).flip = true;
    barrelModel[9].addTrapezoid(50.0F, -2.5F, -2.5F, 1, 5, 5, 0.0F, -0.5F, 2);
    barrelModel[9].setRotationPoint(13.0F, -15.0F, -2.0F);*/
    
    barrelModel[10] = new ModelRendererTurbo(this, 335, 410, 512, 512);
   /* (barrelModel[10]).flip = true;
    barrelModel[10].addBox(51.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F);
    barrelModel[10].setRotationPoint(13.0F, -15.0F, -2.0F);*/
    
    barrelModel[11] = new ModelRendererTurbo(this, 355, 410, 512, 512);
    /*(barrelModel[11]).flip = true;
    barrelModel[11].addTrapezoid(55.0F, -2.0F, -2.0F, 1, 4, 4, 0.0F, -0.5F, 2);
    barrelModel[11].setRotationPoint(13.0F, -15.0F, -2.0F);*/
    
    barrelModel[12] = new ModelRendererTurbo(this, 315, 410, 512, 512);
    barrelModel[12].addTrapezoid(48.0F, -2.5F, -2.5F, 2, 5, 5, 0.0F, -1.0F, 3);
    barrelModel[12].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[13] = new ModelRendererTurbo(this, 315, 425, 512, 512);
    barrelModel[13].addTrapezoid(50.0F, -2.5F, -2.5F, 1, 5, 5, 0.0F, -0.5F, 2);
    barrelModel[13].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[14] = new ModelRendererTurbo(this, 335, 410, 512, 512);
    barrelModel[14].addBox(51.0F, -2.0F, -2.0F, 4, 4, 4, 0.0F);
    barrelModel[14].setRotationPoint(13.0F, -15.0F, -2.0F);
    
    barrelModel[15] = new ModelRendererTurbo(this, 355, 410, 512, 512);
    barrelModel[15].addTrapezoid(55.0F, -2.0F, -2.0F, 1, 4, 4, 0.0F, -0.5F, 2);
    barrelModel[15].setRotationPoint(13.0F, -15.0F, -2.0F);

    
    turretModel = new ModelRendererTurbo[2];
    turretModel[0] = new ModelRendererTurbo(this, 185, 360, 512, 512);
    turretModel[0].addBox(-7.0F, -13.0F, 10.0F, 1, 6, 1, 0.0F);
    turretModel[0].setRotationPoint(13.0F, -10.0F, -2.0F);
    
    turretModel[1] = new ModelRendererTurbo(this, 185, 370, 512, 512);
    turretModel[1].addShapeBox(-7.2F, -14.2F, 10.0F, 2, 1, 1, 0.0F, -1.0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -1.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, -0.5F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    turretModel[1].setRotationPoint(13.0F, -10.0F, -2.0F);
    
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
