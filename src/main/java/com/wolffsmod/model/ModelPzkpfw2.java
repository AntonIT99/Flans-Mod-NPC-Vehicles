package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelPzkpfw2
  extends ModelVehicle
{
  public ModelPzkpfw2() {
    bodyModel = new ModelRendererTurbo[108];
    bodyModel[0] = new ModelRendererTurbo(this, 0, 0, 512, 512);
    bodyModel[0].addShapeBox(-34.0F, 0.0F, -11.0F, 68, 8, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[0].setRotationPoint(0.0F, -6.0F, 0.0F);
    
    bodyModel[1] = new ModelRendererTurbo(this, 0, 37, 512, 512);
    bodyModel[1].addShapeBox(-33.0F, 0.0F, -11.0F, 65, 1, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F);
    bodyModel[1].setRotationPoint(0.0F, 2.0F, 0.0F);
    
    bodyModel[2] = new ModelRendererTurbo(this, 200, 0, 512, 512);
    bodyModel[2].addShapeBox(0.0F, 0.0F, -11.0F, 13, 4, 22, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[2].setRotationPoint(21.0F, -10.0F, 0.0F);
    
    bodyModel[3] = new ModelRendererTurbo(this, 200, 37, 512, 512);
    bodyModel[3].addBox(-34.0F, 0.0F, -11.0F, 55, 4, 22, 0.0F);
    bodyModel[3].setRotationPoint(0.0F, -10.0F, 0.0F);
    
    bodyModel[4] = new ModelRendererTurbo(this, 290, 0, 512, 512);
    bodyModel[4].addShapeBox(-10.0F, 0.0F, -11.0F, 31, 5, 22, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[4].setRotationPoint(0.0F, -15.0F, 0.0F);
    
    bodyModel[5] = new ModelRendererTurbo(this, 370, 37, 512, 512);
    bodyModel[5].addShapeBox(-23.0F, 0.0F, 0.0F, 23, 5, 12, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[5].setRotationPoint(-10.0F, -15.0F, -11.0F);
    
    bodyModel[6] = new ModelRendererTurbo(this, 0, 70, 512, 512);
    bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 52, 1, 7, 0.0F);
    bodyModel[6].setRotationPoint(-27.0F, -10.0F, 11.0F);
    
    bodyModel[7] = new ModelRendererTurbo(this, 130, 70, 512, 512);
    bodyModel[7].addBox(0.0F, 0.0F, -7.0F, 52, 1, 7, 0.0F);
    bodyModel[7].setRotationPoint(-27.0F, -10.0F, -11.0F);
    
    bodyModel[8] = new ModelRendererTurbo(this, 260, 70, 512, 512);
    bodyModel[8].addBox(-9.0F, 0.0F, 0.0F, 9, 1, 7, 0.0F);
    bodyModel[8].setRotationPoint(-27.0F, -10.0F, 11.0F);
    (bodyModel[8]).rotateAngleZ = 0.1134464F;
    
    bodyModel[9] = new ModelRendererTurbo(this, 295, 70, 512, 512);
    bodyModel[9].addBox(-6.0F, 0.0F, 0.0F, 6, 1, 7, 0.0F);
    bodyModel[9].setRotationPoint(-36.0F, -9.0F, 11.0F);
    (bodyModel[9]).rotateAngleZ = 0.7853982F;
    
    bodyModel[10] = new ModelRendererTurbo(this, 330, 70, 512, 512);
    bodyModel[10].addBox(-9.0F, 0.0F, -7.0F, 9, 1, 7, 0.0F);
    bodyModel[10].setRotationPoint(-27.0F, -10.0F, -11.0F);
    (bodyModel[10]).rotateAngleZ = 0.1134464F;
    
    bodyModel[11] = new ModelRendererTurbo(this, 370, 70, 512, 512);
    bodyModel[11].addBox(-6.0F, 0.0F, -7.0F, 6, 1, 7, 0.0F);
    bodyModel[11].setRotationPoint(-36.0F, -9.0F, -11.0F);
    (bodyModel[11]).rotateAngleZ = 0.7853982F;
    
    bodyModel[12] = new ModelRendererTurbo(this, 0, 85, 512, 512);
    bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 8, 1, 7, 0.0F);
    bodyModel[12].setRotationPoint(25.0F, -10.0F, 11.0F);
    (bodyModel[12]).rotateAngleZ = -0.122173F;
    
    bodyModel[13] = new ModelRendererTurbo(this, 35, 85, 512, 512);
    bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 5, 1, 7, 0.0F);
    bodyModel[13].setRotationPoint(33.0F, -9.0F, 11.0F);
    (bodyModel[13]).rotateAngleZ = -0.6457718F;
    
    bodyModel[14] = new ModelRendererTurbo(this, 70, 85, 512, 512);
    bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 3, 1, 7, 0.0F);
    bodyModel[14].setRotationPoint(37.0F, -6.0F, 11.0F);
    (bodyModel[14]).rotateAngleZ = -1.5707964F;
    
    bodyModel[15] = new ModelRendererTurbo(this, 100, 85, 512, 512);
    bodyModel[15].addBox(0.0F, 0.0F, -7.0F, 8, 1, 7, 0.0F);
    bodyModel[15].setRotationPoint(25.0F, -10.0F, -11.0F);
    (bodyModel[15]).rotateAngleZ = -0.122173F;
    
    bodyModel[16] = new ModelRendererTurbo(this, 140, 85, 512, 512);
    bodyModel[16].addBox(0.0F, 0.0F, -7.0F, 5, 1, 7, 0.0F);
    bodyModel[16].setRotationPoint(33.0F, -9.0F, -11.0F);
    (bodyModel[16]).rotateAngleZ = -0.6457718F;
    
    bodyModel[17] = new ModelRendererTurbo(this, 70, 85, 512, 512);
    bodyModel[17].addBox(0.0F, 0.0F, -7.0F, 3, 1, 7, 0.0F);
    bodyModel[17].setRotationPoint(37.0F, -6.0F, -11.0F);
    (bodyModel[17]).rotateAngleZ = -1.5707964F;
    
    bodyModel[18] = new ModelRendererTurbo(this, 180, 85, 512, 512);
    bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 12, 7, 0, 0.0F);
    bodyModel[18].setRotationPoint(21.0F, -9.0F, 11.0F);
    
    bodyModel[19] = new ModelRendererTurbo(this, 220, 85, 512, 512);
    bodyModel[19].addShapeBox(0.0F, 0.0F, 0.0F, 4, 6, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[19].setRotationPoint(33.0F, -8.0F, 11.0F);
    
    bodyModel[20] = new ModelRendererTurbo(this, 180, 85, 512, 512);
    bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 12, 7, 0, 0.0F);
    bodyModel[20].setRotationPoint(21.0F, -9.0F, -11.0F);
    
    bodyModel[21] = new ModelRendererTurbo(this, 220, 85, 512, 512);
    bodyModel[21].addShapeBox(0.0F, 0.0F, 0.0F, 4, 6, 0, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[21].setRotationPoint(33.0F, -8.0F, -11.0F);
    
    bodyModel[22] = new ModelRendererTurbo(this, 0, 100, 512, 512);
    bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 17, 5, 5, 0.0F);
    bodyModel[22].setRotationPoint(-10.0F, -15.0F, 11.0F);
    
    bodyModel[23] = new ModelRendererTurbo(this, 50, 100, 512, 512);
    bodyModel[23].addShapeBox(0.0F, 0.0F, 0.0F, 14, 5, 5, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, -4.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -4.9F, 0.0F, 0.0F, 0.0F);
    bodyModel[23].setRotationPoint(7.0F, -15.0F, 11.0F);
    
    bodyModel[24] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[24].setRotationPoint(20.0F, -6.0F, 11.0F);
    
    bodyModel[25] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[25].setRotationPoint(5.0F, -5.5F, 11.0F);
    
    bodyModel[26] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[26].setRotationPoint(-8.0F, -5.5F, 11.0F);
    
    bodyModel[27] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[27].setRotationPoint(-20.0F, -5.0F, 11.0F);
    
    bodyModel[28] = new ModelRendererTurbo(this, 0, 120, 512, 512);
    bodyModel[28].addBox(0.0F, 0.0F, -13.0F, 3, 6, 26, 0.0F);
    bodyModel[28].setRotationPoint(29.0F, -5.0F, 0.0F);
    
    bodyModel[29] = new ModelRendererTurbo(this, 0, 120, 512, 512);
    bodyModel[29].addBox(-3.0F, 0.0F, -13.0F, 3, 6, 26, 0.0F);
    bodyModel[29].setRotationPoint(29.0F, -5.0F, 0.0F);
    
    bodyModel[30] = new ModelRendererTurbo(this, 113, 100, 512, 512);
    bodyModel[30].addBox(0.0F, 0.0F, 0.0F, 6, 4, 1, 0.0F);
    bodyModel[30].setRotationPoint(-35.0F, -3.0F, 10.0F);
    
    bodyModel[31] = new ModelRendererTurbo(this, 113, 100, 512, 512);
    bodyModel[31].addBox(0.0F, 0.0F, -1.0F, 6, 4, 1, 0.0F);
    bodyModel[31].setRotationPoint(-35.0F, -3.0F, -10.0F);
    
    bodyModel[32] = new ModelRendererTurbo(this, 100, 110, 512, 512);
    bodyModel[32].addBox(-1.0F, -1.0F, 0.0F, 4, 4, 3, 0.0F);
    bodyModel[32].setRotationPoint(-33.0F, -2.0F, 11.0F);
    
    bodyModel[33] = new ModelRendererTurbo(this, 135, 100, 512, 512);
    bodyModel[33].addBox(-6.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F);
    bodyModel[33].setRotationPoint(22.0F, 1.0F, 11.0F);
    (bodyModel[33]).rotateAngleZ = 0.6108652F;
    
    bodyModel[34] = new ModelRendererTurbo(this, 135, 100, 512, 512);
    bodyModel[34].addBox(-6.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F);
    bodyModel[34].setRotationPoint(12.0F, 1.0F, 11.0F);
    (bodyModel[34]).rotateAngleZ = 0.6108652F;
    
    bodyModel[35] = new ModelRendererTurbo(this, 135, 100, 512, 512);
    bodyModel[35].addBox(-6.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F);
    bodyModel[35].setRotationPoint(2.0F, 1.0F, 11.0F);
    (bodyModel[35]).rotateAngleZ = 0.6108652F;
    
    bodyModel[36] = new ModelRendererTurbo(this, 135, 100, 512, 512);
    bodyModel[36].addBox(-6.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F);
    bodyModel[36].setRotationPoint(-8.0F, 1.0F, 11.0F);
    (bodyModel[36]).rotateAngleZ = 0.6108652F;
    
    bodyModel[37] = new ModelRendererTurbo(this, 135, 100, 512, 512);
    bodyModel[37].addBox(-6.0F, 0.0F, 0.0F, 6, 2, 1, 0.0F);
    bodyModel[37].setRotationPoint(-18.0F, 1.0F, 11.0F);
    (bodyModel[37]).rotateAngleZ = 0.6108652F;
    
    bodyModel[38] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[38].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[38].setRotationPoint(18.0F, 4.0F, 12.0F);
    
    bodyModel[39] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[39].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[39].setRotationPoint(8.0F, 4.0F, 12.0F);
    
    bodyModel[40] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[40].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[40].setRotationPoint(-2.0F, 4.0F, 12.0F);
    
    bodyModel[41] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[41].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[41].setRotationPoint(-12.0F, 4.0F, 12.0F);
    
    bodyModel[42] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[42].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[42].setRotationPoint(-22.0F, 4.0F, 12.0F);
    
    bodyModel[43] = new ModelRendererTurbo(this, 160, 100, 512, 512);
    bodyModel[43].addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
    bodyModel[43].setRotationPoint(20.0F, -2.0F, 11.0F);
    
    bodyModel[44] = new ModelRendererTurbo(this, 160, 100, 512, 512);
    bodyModel[44].addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
    bodyModel[44].setRotationPoint(10.0F, -2.0F, 11.0F);
    
    bodyModel[45] = new ModelRendererTurbo(this, 160, 100, 512, 512);
    bodyModel[45].addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
    bodyModel[45].setRotationPoint(0.0F, -2.0F, 11.0F);
    
    bodyModel[46] = new ModelRendererTurbo(this, 160, 100, 512, 512);
    bodyModel[46].addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
    bodyModel[46].setRotationPoint(-10.0F, -2.0F, 11.0F);
    
    bodyModel[47] = new ModelRendererTurbo(this, 160, 100, 512, 512);
    bodyModel[47].addBox(0.0F, 0.0F, 0.0F, 3, 4, 1, 0.0F);
    bodyModel[47].setRotationPoint(-20.0F, -2.0F, 11.0F);
    
    bodyModel[48] = new ModelRendererTurbo(this, 180, 100, 512, 512);
    bodyModel[48].addShapeBox(-6.0F, 0.0F, -0.1F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[48].setRotationPoint(21.0F, -2.0F, 11.0F);
    (bodyModel[48]).rotateAngleZ = -0.3490658F;
    
    bodyModel[49] = new ModelRendererTurbo(this, 180, 100, 512, 512);
    bodyModel[49].addShapeBox(-6.0F, 0.0F, -0.1F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[49].setRotationPoint(11.0F, -2.0F, 11.0F);
    (bodyModel[49]).rotateAngleZ = -0.3490658F;
    
    bodyModel[50] = new ModelRendererTurbo(this, 180, 100, 512, 512);
    bodyModel[50].addShapeBox(-6.0F, 0.0F, -0.1F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[50].setRotationPoint(1.0F, -2.0F, 11.0F);
    (bodyModel[50]).rotateAngleZ = -0.3490658F;
    
    bodyModel[51] = new ModelRendererTurbo(this, 180, 100, 512, 512);
    bodyModel[51].addShapeBox(-6.0F, 0.0F, -0.1F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[51].setRotationPoint(-9.0F, -2.0F, 11.0F);
    (bodyModel[51]).rotateAngleZ = -0.3490658F;
    
    bodyModel[52] = new ModelRendererTurbo(this, 180, 100, 512, 512);
    bodyModel[52].addShapeBox(-6.0F, 0.0F, -0.1F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[52].setRotationPoint(-19.0F, -2.0F, 11.0F);
    (bodyModel[52]).rotateAngleZ = -0.1745329F;
    
    bodyModel[53] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[53].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[53].setRotationPoint(20.0F, -6.0F, -11.0F);
    
    bodyModel[54] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[54].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[54].setRotationPoint(5.0F, -6.0F, -11.0F);
    
    bodyModel[55] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[55].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[55].setRotationPoint(-8.0F, -5.0F, -11.0F);
    
    bodyModel[56] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[56].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[56].setRotationPoint(-20.0F, -5.0F, -11.0F);
    
    bodyModel[57] = new ModelRendererTurbo(this, 100, 110, 512, 512);
    bodyModel[57].addBox(-1.0F, -1.0F, -3.0F, 4, 4, 3, 0.0F);
    bodyModel[57].setRotationPoint(-33.0F, -2.0F, -11.0F);
    
    bodyModel[58] = new ModelRendererTurbo(this, 135, 100, 512, 512);
    bodyModel[58].addBox(-6.0F, 0.0F, -1.0F, 6, 2, 1, 0.0F);
    bodyModel[58].setRotationPoint(22.0F, 1.0F, -11.0F);
    (bodyModel[58]).rotateAngleZ = 0.6108652F;
    
    bodyModel[59] = new ModelRendererTurbo(this, 135, 100, 512, 512);
    bodyModel[59].addBox(-6.0F, 0.0F, -1.0F, 6, 2, 1, 0.0F);
    bodyModel[59].setRotationPoint(12.0F, 1.0F, -11.0F);
    (bodyModel[59]).rotateAngleZ = 0.6108652F;
    
    bodyModel[60] = new ModelRendererTurbo(this, 135, 100, 512, 512);
    bodyModel[60].addBox(-6.0F, 0.0F, -1.0F, 6, 2, 1, 0.0F);
    bodyModel[60].setRotationPoint(2.0F, 1.0F, -11.0F);
    (bodyModel[60]).rotateAngleZ = 0.6108652F;
    
    bodyModel[61] = new ModelRendererTurbo(this, 135, 100, 512, 512);
    bodyModel[61].addBox(-6.0F, 0.0F, -1.0F, 6, 2, 1, 0.0F);
    bodyModel[61].setRotationPoint(-8.0F, 1.0F, -11.0F);
    (bodyModel[61]).rotateAngleZ = 0.6108652F;
    
    bodyModel[62] = new ModelRendererTurbo(this, 135, 100, 512, 512);
    bodyModel[62].addBox(-6.0F, 0.0F, -1.0F, 6, 2, 1, 0.0F);
    bodyModel[62].setRotationPoint(-18.0F, 1.0F, -11.0F);
    (bodyModel[62]).rotateAngleZ = 0.6108652F;
    
    bodyModel[63] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[63].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[63].setRotationPoint(18.0F, 4.0F, -12.0F);
    
    bodyModel[64] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[64].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[64].setRotationPoint(8.0F, 4.0F, -12.0F);
    
    bodyModel[65] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[65].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[65].setRotationPoint(-2.0F, 4.0F, -12.0F);
    
    bodyModel[66] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[66].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[66].setRotationPoint(-12.0F, 4.0F, -12.0F);
    
    bodyModel[67] = new ModelRendererTurbo(this, 100, 100, 512, 512);
    bodyModel[67].addBox(0.0F, 0.0F, -3.0F, 1, 1, 3, 0.0F);
    bodyModel[67].setRotationPoint(-22.0F, 4.0F, -12.0F);
    
    bodyModel[68] = new ModelRendererTurbo(this, 160, 100, 512, 512);
    bodyModel[68].addBox(0.0F, 0.0F, -1.0F, 3, 4, 1, 0.0F);
    bodyModel[68].setRotationPoint(20.0F, -2.0F, -11.0F);
    
    bodyModel[69] = new ModelRendererTurbo(this, 160, 100, 512, 512);
    bodyModel[69].addBox(0.0F, 0.0F, -1.0F, 3, 4, 1, 0.0F);
    bodyModel[69].setRotationPoint(10.0F, -2.0F, -11.0F);
    
    bodyModel[70] = new ModelRendererTurbo(this, 160, 100, 512, 512);
    bodyModel[70].addBox(0.0F, 0.0F, -1.0F, 3, 4, 1, 0.0F);
    bodyModel[70].setRotationPoint(0.0F, -2.0F, -11.0F);
    
    bodyModel[71] = new ModelRendererTurbo(this, 160, 100, 512, 512);
    bodyModel[71].addBox(0.0F, 0.0F, -1.0F, 3, 4, 1, 0.0F);
    bodyModel[71].setRotationPoint(-10.0F, -2.0F, -11.0F);
    
    bodyModel[72] = new ModelRendererTurbo(this, 160, 100, 512, 512);
    bodyModel[72].addBox(0.0F, 0.0F, -1.0F, 3, 4, 1, 0.0F);
    bodyModel[72].setRotationPoint(-20.0F, -2.0F, -11.0F);
    
    bodyModel[73] = new ModelRendererTurbo(this, 180, 100, 512, 512);
    bodyModel[73].addShapeBox(-6.0F, 0.0F, -0.9F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[73].setRotationPoint(21.0F, -2.0F, -11.0F);
    (bodyModel[73]).rotateAngleZ = -0.3490658F;
    
    bodyModel[74] = new ModelRendererTurbo(this, 180, 100, 512, 512);
    bodyModel[74].addShapeBox(-6.0F, 0.0F, -0.9F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[74].setRotationPoint(11.0F, -2.0F, -11.0F);
    (bodyModel[74]).rotateAngleZ = -0.3490658F;
    
    bodyModel[75] = new ModelRendererTurbo(this, 180, 100, 512, 512);
    bodyModel[75].addShapeBox(-6.0F, 0.0F, -0.9F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[75].setRotationPoint(1.0F, -2.0F, -11.0F);
    (bodyModel[75]).rotateAngleZ = -0.3490658F;
    
    bodyModel[76] = new ModelRendererTurbo(this, 180, 100, 512, 512);
    bodyModel[76].addShapeBox(-6.0F, 0.0F, -0.9F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[76].setRotationPoint(-9.0F, -2.0F, -11.0F);
    (bodyModel[76]).rotateAngleZ = -0.3490658F;
    
    bodyModel[77] = new ModelRendererTurbo(this, 180, 100, 512, 512);
    bodyModel[77].addShapeBox(-6.0F, 0.0F, -0.9F, 6, 2, 1, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, 0.0F);
    bodyModel[77].setRotationPoint(-19.0F, -2.0F, -11.0F);
    (bodyModel[77]).rotateAngleZ = -0.1745329F;
    
    bodyModel[78] = new ModelRendererTurbo(this, 0, 270, 512, 512);
    bodyModel[78].addShapeBox(-1.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.2F, 0.0F, -0.5F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, -0.2F, 0.0F, 0.0F, 0.0F);
    bodyModel[78].setRotationPoint(20.0F, -14.5F, 0.5F);
    
    bodyModel[79] = new ModelRendererTurbo(this, 30, 270, 512, 512);
    bodyModel[79].addShapeBox(-1.0F, 0.0F, 0.0F, 2, 2, 9, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.1F, 0.0F, -0.2F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, 0.0F, 0.0F);
    bodyModel[79].setRotationPoint(20.0F, -12.1F, 0.0F);
    
    bodyModel[80] = new ModelRendererTurbo(this, 60, 270, 512, 512);
    bodyModel[80].addBox(0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F);
    bodyModel[80].setRotationPoint(19.6F, -12.8F, 2.0F);
    
    bodyModel[81] = new ModelRendererTurbo(this, 80, 270, 512, 512);
    bodyModel[81].addShapeBox(-1.0F, 0.0F, 0.0F, 2, 2, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -0.1F, 0.0F, -0.5F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F);
    bodyModel[81].setRotationPoint(20.0F, -14.1F, -8.5F);
    
    bodyModel[82] = new ModelRendererTurbo(this, 110, 270, 512, 512);
    bodyModel[82].addShapeBox(-1.0F, 0.0F, 0.0F, 2, 2, 8, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.3F, -0.1F, 0.0F, -0.3F, -0.1F, 0.0F, 0.0F, 0.0F);
    bodyModel[82].setRotationPoint(20.0F, -12.1F, -9.0F);
    
    bodyModel[83] = new ModelRendererTurbo(this, 140, 270, 512, 512);
    bodyModel[83].addBox(0.0F, 0.0F, 0.0F, 5, 3, 1, 0.0F);
    bodyModel[83].setRotationPoint(12.5F, -14.0F, -11.5F);
    
    bodyModel[84] = new ModelRendererTurbo(this, 160, 270, 512, 512);
    bodyModel[84].addBox(-0.5F, 1.0F, 3.0F, 1, 3, 5, 0.0F);
    bodyModel[84].setRotationPoint(21.0F, -15.0F, 11.0F);
    (bodyModel[84]).rotateAngleY = 1.239184F;
    
    bodyModel[85] = new ModelRendererTurbo(this, 180, 270, 512, 512);
    bodyModel[85].addShapeBox(0.0F, 0.0F, 0.0F, 18, 5, 7, 0.0F, 0.0F, 0.0F, -1.0F, -1.0F, 0.0F, -1.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[85].setRotationPoint(-7.0F, -15.0F, -18.0F);
    
    bodyModel[86] = new ModelRendererTurbo(this, 0, 290, 512, 512);
    bodyModel[86].addBox(0.0F, 0.0F, 0.0F, 11, 2, 6, 0.0F);
    bodyModel[86].setRotationPoint(-27.0F, -12.0F, -18.0F);
    
    bodyModel[87] = new ModelRendererTurbo(this, 45, 290, 512, 512);
    bodyModel[87].addShapeBox(0.0F, 0.0F, 0.0F, 22, 5, 7, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.5F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[87].setRotationPoint(-32.5F, -15.0F, 11.0F);
    
    bodyModel[88] = new ModelRendererTurbo(this, 110, 290, 512, 512);
    bodyModel[88].addBox(0.0F, 0.0F, 0.0F, 4, 4, 9, 0.0F);
    bodyModel[88].setRotationPoint(-36.0F, -9.9F, 0.0F);
    
    bodyModel[89] = new ModelRendererTurbo(this, 140, 290, 512, 512);
    bodyModel[89].addShapeBox(0.0F, 0.0F, 0.0F, 1, 4, 9, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F);
    bodyModel[89].setRotationPoint(-37.0F, -9.9F, 0.0F);
    
    bodyModel[90] = new ModelRendererTurbo(this, 170, 290, 512, 512);
    bodyModel[90].addShapeBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 1.0F, -1.0F, 0.0F, 1.0F, -1.0F, 0.0F, -1.0F, 0.0F, 0.0F);
    bodyModel[90].setRotationPoint(-35.0F, -10.5F, -8.0F);
    
    bodyModel[91] = new ModelRendererTurbo(this, 190, 290, 512, 512);
    bodyModel[91].addShapeBox(0.0F, 0.0F, 0.0F, 2, 5, 7, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    bodyModel[91].setRotationPoint(-37.0F, -10.5F, -8.0F);
    
    bodyModel[92] = new ModelRendererTurbo(this, 215, 290, 512, 512);
    bodyModel[92].addShapeBox(0.0F, 0.0F, 0.0F, 1, 5, 7, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F);
    bodyModel[92].setRotationPoint(-38.0F, -10.5F, -8.0F);
    
    bodyModel[93] = new ModelRendererTurbo(this, 240, 290, 512, 512);
    bodyModel[93].addBox(-1.0F, -1.0F, -2.0F, 1, 1, 2, 0.0F);
    bodyModel[93].setRotationPoint(-37.0F, -8.5F, -7.5F);
    (bodyModel[93]).rotateAngleZ = -0.7853982F;
    
    bodyModel[94] = new ModelRendererTurbo(this, 240, 300, 512, 512);
    bodyModel[94].addBox(0.0F, -2.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[94].setRotationPoint(-37.0F, -8.5F, -9.5F);
    (bodyModel[94]).rotateAngleZ = 0.7853982F;
    
    bodyModel[95] = new ModelRendererTurbo(this, 0, 310, 512, 512);
    bodyModel[95].addBox(0.0F, 0.0F, 0.0F, 10, 1, 10, 0.0F);
    bodyModel[95].setRotationPoint(-20.0F, -10.5F, 1.0F);
    
    bodyModel[96] = new ModelRendererTurbo(this, 50, 310, 512, 512);
    bodyModel[96].addBox(0.0F, 0.0F, 0.0F, 5, 1, 8, 0.0F);
    bodyModel[96].setRotationPoint(-33.0F, -10.1F, 2.0F);
    
    bodyModel[97] = new ModelRendererTurbo(this, 90, 310, 512, 512);
    bodyModel[97].addBox(-23.0F, -0.1F, 0.0F, 5, 1, 7, 0.0F);
    bodyModel[97].setRotationPoint(-10.0F, -15.0F, -10.0F);
    (bodyModel[97]).rotateAngleZ = 0.1692969F;
    
    bodyModel[98] = new ModelRendererTurbo(this, 130, 310, 512, 512);
    bodyModel[98].addBox(0.0F, 0.0F, 0.0F, 1, 3, 5, 0.0F);
    bodyModel[98].setRotationPoint(-10.5F, -14.0F, 3.0F);
    
    bodyModel[99] = new ModelRendererTurbo(this, 150, 310, 512, 512);
    bodyModel[99].addBox(0.0F, 0.0F, 0.0F, 1, 2, 1, 0.0F);
    bodyModel[99].setRotationPoint(24.0F, -12.0F, -15.0F);
    
    bodyModel[100] = new ModelRendererTurbo(this, 150, 310, 512, 512);
    bodyModel[100].addBox(0.0F, 0.0F, -1.0F, 1, 2, 1, 0.0F);
    bodyModel[100].setRotationPoint(24.0F, -12.0F, 15.0F);
    
    bodyModel[101] = new ModelRendererTurbo(this, 165, 310, 512, 512);
    bodyModel[101].addShapeBox(-0.5F, 0.0F, -0.5F, 2, 2, 2, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F);
    bodyModel[101].setRotationPoint(24.0F, -13.0F, -15.0F);
    
    bodyModel[102] = new ModelRendererTurbo(this, 165, 310, 512, 512);
    bodyModel[102].addShapeBox(-0.5F, 0.0F, -1.5F, 2, 2, 2, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.2F, -0.2F);
    bodyModel[102].setRotationPoint(24.0F, -13.0F, 15.0F);
    
    bodyModel[103] = new ModelRendererTurbo(this, 180, 310, 512, 512);
    bodyModel[103].addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
    bodyModel[103].setRotationPoint(20.0F, -11.0F, -16.0F);
    
    bodyModel[104] = new ModelRendererTurbo(this, 195, 310, 512, 512);
    bodyModel[104].addBox(0.0F, 0.0F, 0.0F, 4, 1, 2, 0.0F);
    bodyModel[104].setRotationPoint(19.0F, -10.5F, -15.5F);
    
    bodyModel[105] = new ModelRendererTurbo(this, 215, 310, 512, 512);
    bodyModel[105].addBox(-6.0F, 0.0F, 0.0F, 6, 1, 1, 0.0F);
    bodyModel[105].setRotationPoint(19.0F, -10.8F, -14.5F);
    (bodyModel[105]).rotateAngleY = -0.2617994F;
    
    bodyModel[106] = new ModelRendererTurbo(this, 215, 310, 512, 512);
    bodyModel[106].addBox(-6.0F, 0.0F, -1.0F, 6, 1, 1, 0.0F);
    bodyModel[106].setRotationPoint(19.0F, -10.8F, -14.5F);
    (bodyModel[106]).rotateAngleY = 0.2617994F;
    
    bodyModel[107] = new ModelRendererTurbo(this, 0, 325, 512, 512);
    bodyModel[107].addShape3D(1.0F, 0.0F, -3.5F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 2.0F, 7, 7, 24, 2, 4, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    bodyModel[107].setRotationPoint(22.0F, -10.0F, -5.0F);
    (bodyModel[107]).rotateAngleZ = -0.31415927F;
    
    leftTrackWheelModels = new ModelRendererTurbo[11];
    leftTrackWheelModels[0] = new ModelRendererTurbo(this, 80, 120, 512, 512);
    leftTrackWheelModels[0].addShape3D(5.0F, -5.0F, -4.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    leftTrackWheelModels[0].setRotationPoint(29.0F, -2.0F, 13.0F);
    
    leftTrackWheelModels[1] = new ModelRendererTurbo(this, 80, 140, 512, 512);
    leftTrackWheelModels[1].addShape3D(3.5F, -3.5F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[1].setRotationPoint(18.5F, 4.5F, 13.5F);
    
    leftTrackWheelModels[2] = new ModelRendererTurbo(this, 80, 140, 512, 512);
    leftTrackWheelModels[2].addShape3D(3.5F, -3.5F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[2].setRotationPoint(8.5F, 4.5F, 13.5F);
    
    leftTrackWheelModels[3] = new ModelRendererTurbo(this, 80, 140, 512, 512);
    leftTrackWheelModels[3].addShape3D(3.5F, -3.5F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[3].setRotationPoint(-1.5F, 4.5F, 13.5F);
    
    leftTrackWheelModels[4] = new ModelRendererTurbo(this, 80, 140, 512, 512);
    leftTrackWheelModels[4].addShape3D(3.5F, -3.5F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[4].setRotationPoint(-11.5F, 4.5F, 13.5F);
    
    leftTrackWheelModels[5] = new ModelRendererTurbo(this, 80, 140, 512, 512);
    leftTrackWheelModels[5].addShape3D(3.5F, -3.5F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    leftTrackWheelModels[5].setRotationPoint(-21.5F, 4.5F, 13.5F);
    
    leftTrackWheelModels[6] = new ModelRendererTurbo(this, 120, 120, 512, 512);
    leftTrackWheelModels[6].addShape3D(4.0F, -4.0F, -3.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 8, 8, 28, 3, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    leftTrackWheelModels[6].setRotationPoint(-32.0F, -1.0F, 13.5F);
    
    leftTrackWheelModels[7] = new ModelRendererTurbo(this, 155, 120, 512, 512);
    leftTrackWheelModels[7].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[7].setRotationPoint(5.5F, -5.0F, 14.0F);
    
    leftTrackWheelModels[8] = new ModelRendererTurbo(this, 155, 120, 512, 512);
    leftTrackWheelModels[8].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[8].setRotationPoint(20.5F, -5.5F, 14.0F);
    
    leftTrackWheelModels[9] = new ModelRendererTurbo(this, 155, 120, 512, 512);
    leftTrackWheelModels[9].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[9].setRotationPoint(-7.5F, -5.0F, 14.0F);
    
    leftTrackWheelModels[10] = new ModelRendererTurbo(this, 155, 120, 512, 512);
    leftTrackWheelModels[10].addBox(-1.5F, -1.5F, 0.0F, 3, 3, 2, 0.0F);
    leftTrackWheelModels[10].setRotationPoint(-19.5F, -4.6F, 14.0F);
    
    leftTrackModel = new ModelRendererTurbo[11];
    leftTrackModel[0] = new ModelRendererTurbo(this, 0, 160, 512, 512);
    leftTrackModel[0].addBox(0.0F, 0.0F, 0.0F, 52, 1, 5, 0.0F);
    leftTrackModel[0].setRotationPoint(-21.0F, -7.0F, 12.5F);
    (leftTrackModel[0]).rotateAngleZ = 0.02094395F;
    
    leftTrackModel[1] = new ModelRendererTurbo(this, 130, 160, 512, 512);
    leftTrackModel[1].addShapeBox(0.0F, 0.0F, 0.0F, 5, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[1].setRotationPoint(31.0F, -8.0F, 12.5F);
    (leftTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[2] = new ModelRendererTurbo(this, 155, 160, 512, 512);
    leftTrackModel[2].addBox(0.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F);
    leftTrackModel[2].setRotationPoint(34.0F, -4.0F, 12.5F);
    
    leftTrackModel[3] = new ModelRendererTurbo(this, 170, 160, 512, 512);
    leftTrackModel[3].addBox(0.0F, -1.0F, 0.0F, 13, 1, 5, 0.0F);
    leftTrackModel[3].setRotationPoint(20.0F, 9.0F, 12.5F);
    (leftTrackModel[3]).rotateAngleZ = 0.4468043F;
    
    leftTrackModel[4] = new ModelRendererTurbo(this, 220, 160, 512, 512);
    leftTrackModel[4].addBox(0.0F, 0.0F, 0.0F, 43, 1, 5, 0.0F);
    leftTrackModel[4].setRotationPoint(-23.0F, 8.0F, 12.5F);
    
    leftTrackModel[5] = new ModelRendererTurbo(this, 340, 160, 512, 512);
    leftTrackModel[5].addBox(0.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F);
    leftTrackModel[5].setRotationPoint(-37.0F, -3.0F, 12.5F);
    
    leftTrackModel[6] = new ModelRendererTurbo(this, 320, 160, 512, 512);
    leftTrackModel[6].addShapeBox(0.0F, -13.0F, 0.0F, 1, 13, 5, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[6].setRotationPoint(-23.0F, 9.0F, 12.5F);
    (leftTrackModel[6]).rotateAngleZ = 1.143191F;
    
    leftTrackModel[7] = new ModelRendererTurbo(this, 360, 160, 512, 512);
    leftTrackModel[7].addShapeBox(0.0F, 0.0F, 0.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    leftTrackModel[7].setRotationPoint(-37.0F, -3.0F, 12.5F);
    (leftTrackModel[7]).rotateAngleZ = 0.7853982F;
    
    leftTrackModel[8] = new ModelRendererTurbo(this, 390, 160, 512, 512);
    leftTrackModel[8].addBox(0.0F, 0.0F, 0.0F, 13, 1, 5, 0.0F);
    leftTrackModel[8].setRotationPoint(-34.0F, -6.0F, 12.5F);
    (leftTrackModel[8]).rotateAngleZ = 0.07853982F;
    
    leftTrackModel[9] = new ModelRendererTurbo(this, 440, 160, 512, 512);
    leftTrackModel[9].addBox(-1.0F, 0.0F, 0.0F, 1, 5, 5, 0.0F);
    leftTrackModel[9].setRotationPoint(35.0F, 0.0F, 12.5F);
    (leftTrackModel[9]).rotateAngleZ = -0.7853982F;
    
    leftTrackModel[10] = new ModelRendererTurbo(this, 460, 160, 512, 512);
    leftTrackModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 4, 5, 0.0F);
    leftTrackModel[10].setRotationPoint(-37.0F, 1.0F, 12.5F);
    (leftTrackModel[10]).rotateAngleZ = 0.7853982F;
    
    rightTrackWheelModels = new ModelRendererTurbo[11];
    rightTrackWheelModels[0] = new ModelRendererTurbo(this, 80, 120, 512, 512);
    rightTrackWheelModels[0].addShape3D(5.0F, -5.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(7.0D, 0.0D, 7, 0), new Coord2D(10.0D, 3.0D, 10, 3), new Coord2D(10.0D, 7.0D, 10, 7), new Coord2D(7.0D, 10.0D, 7, 10), new Coord2D(3.0D, 10.0D, 3, 10), new Coord2D(0.0D, 7.0D, 0, 7), new Coord2D(0.0D, 3.0D, 0, 3) }), 4.0F, 10, 10, 36, 4, 0, new float[] { 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F, 5.0F, 4.0F });
    rightTrackWheelModels[0].setRotationPoint(29.0F, -2.0F, -13.0F);
    
    rightTrackWheelModels[1] = new ModelRendererTurbo(this, 80, 140, 512, 512);
    rightTrackWheelModels[1].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[1].setRotationPoint(18.5F, 4.5F, -13.5F);
    
    rightTrackWheelModels[2] = new ModelRendererTurbo(this, 80, 140, 512, 512);
    rightTrackWheelModels[2].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[2].setRotationPoint(8.5F, 4.5F, -13.5F);
    
    rightTrackWheelModels[3] = new ModelRendererTurbo(this, 80, 140, 512, 512);
    rightTrackWheelModels[3].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[3].setRotationPoint(-1.5F, 4.5F, -13.5F);
    
    rightTrackWheelModels[4] = new ModelRendererTurbo(this, 80, 140, 512, 512);
    rightTrackWheelModels[4].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[4].setRotationPoint(-11.5F, 4.5F, -13.5F);
    
    rightTrackWheelModels[5] = new ModelRendererTurbo(this, 80, 140, 512, 512);
    rightTrackWheelModels[5].addShape3D(3.5F, -3.5F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(5.0D, 0.0D, 5, 0), new Coord2D(7.0D, 2.0D, 7, 2), new Coord2D(7.0D, 5.0D, 7, 5), new Coord2D(5.0D, 7.0D, 5, 7), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 5.0D, 0, 5), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 7, 7, 24, 3, 0, new float[] { 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F, 3.0F });
    rightTrackWheelModels[5].setRotationPoint(-21.5F, 4.5F, -13.5F);
    
    rightTrackWheelModels[6] = new ModelRendererTurbo(this, 120, 120, 512, 512);
    rightTrackWheelModels[6].addShape3D(4.0F, -4.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(2.0D, 0.0D, 2, 0), new Coord2D(6.0D, 0.0D, 6, 0), new Coord2D(8.0D, 2.0D, 8, 2), new Coord2D(8.0D, 6.0D, 8, 6), new Coord2D(6.0D, 8.0D, 6, 8), new Coord2D(2.0D, 8.0D, 2, 8), new Coord2D(0.0D, 6.0D, 0, 6), new Coord2D(0.0D, 2.0D, 0, 2) }), 3.0F, 8, 8, 28, 3, 0, new float[] { 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F, 3.0F, 4.0F });
    rightTrackWheelModels[6].setRotationPoint(-32.0F, -1.0F, -13.5F);
    
    rightTrackWheelModels[7] = new ModelRendererTurbo(this, 155, 120, 512, 512);
    rightTrackWheelModels[7].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[7].setRotationPoint(5.5F, -5.0F, -14.0F);
    
    rightTrackWheelModels[8] = new ModelRendererTurbo(this, 155, 120, 512, 512);
    rightTrackWheelModels[8].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[8].setRotationPoint(20.5F, -5.5F, -14.0F);
    
    rightTrackWheelModels[9] = new ModelRendererTurbo(this, 155, 120, 512, 512);
    rightTrackWheelModels[9].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[9].setRotationPoint(-7.5F, -5.0F, -14.0F);
    
    rightTrackWheelModels[10] = new ModelRendererTurbo(this, 155, 120, 512, 512);
    rightTrackWheelModels[10].addBox(-1.5F, -1.5F, -3.0F, 3, 3, 2, 0.0F);
    rightTrackWheelModels[10].setRotationPoint(-19.5F, -4.6F, -14.0F);
    
    rightTrackModel = new ModelRendererTurbo[11];
    rightTrackModel[0] = new ModelRendererTurbo(this, 0, 160, 512, 512);
    rightTrackModel[0].addBox(0.0F, 0.0F, -5.0F, 52, 1, 5, 0.0F);
    rightTrackModel[0].setRotationPoint(-21.0F, -7.0F, -12.5F);
    (rightTrackModel[0]).rotateAngleZ = 0.02094395F;
    
    rightTrackModel[1] = new ModelRendererTurbo(this, 130, 160, 512, 512);
    rightTrackModel[1].addShapeBox(0.0F, 0.0F, -5.0F, 5, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[1].setRotationPoint(31.0F, -8.0F, -12.5F);
    (rightTrackModel[1]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[2] = new ModelRendererTurbo(this, 155, 160, 512, 512);
    rightTrackModel[2].addBox(0.0F, 0.0F, -5.0F, 1, 4, 5, 0.0F);
    rightTrackModel[2].setRotationPoint(34.0F, -4.0F, -12.5F);
    
    rightTrackModel[3] = new ModelRendererTurbo(this, 170, 160, 512, 512);
    rightTrackModel[3].addBox(0.0F, -1.0F, -5.0F, 13, 1, 5, 0.0F);
    rightTrackModel[3].setRotationPoint(20.0F, 9.0F, -12.5F);
    (rightTrackModel[3]).rotateAngleZ = 0.4468043F;
    
    rightTrackModel[4] = new ModelRendererTurbo(this, 220, 160, 512, 512);
    rightTrackModel[4].addBox(0.0F, 0.0F, -5.0F, 43, 1, 5, 0.0F);
    rightTrackModel[4].setRotationPoint(-23.0F, 8.0F, -12.5F);
    
    rightTrackModel[5] = new ModelRendererTurbo(this, 340, 160, 512, 512);
    rightTrackModel[5].addBox(0.0F, 0.0F, -5.0F, 1, 4, 5, 0.0F);
    rightTrackModel[5].setRotationPoint(-37.0F, -3.0F, -12.5F);
    
    rightTrackModel[6] = new ModelRendererTurbo(this, 320, 160, 512, 512);
    rightTrackModel[6].addShapeBox(0.0F, -13.0F, -5.0F, 1, 13, 5, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, -0.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[6].setRotationPoint(-23.0F, 9.0F, -12.5F);
    (rightTrackModel[6]).rotateAngleZ = 1.143191F;
    
    rightTrackModel[7] = new ModelRendererTurbo(this, 360, 160, 512, 512);
    rightTrackModel[7].addShapeBox(0.0F, 0.0F, -5.0F, 4, 1, 5, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    rightTrackModel[7].setRotationPoint(-37.0F, -3.0F, -12.5F);
    (rightTrackModel[7]).rotateAngleZ = 0.7853982F;
    
    rightTrackModel[8] = new ModelRendererTurbo(this, 390, 160, 512, 512);
    rightTrackModel[8].addBox(0.0F, 0.0F, -5.0F, 13, 1, 5, 0.0F);
    rightTrackModel[8].setRotationPoint(-34.0F, -6.0F, -12.5F);
    (rightTrackModel[8]).rotateAngleZ = 0.07853982F;
    
    rightTrackModel[9] = new ModelRendererTurbo(this, 440, 160, 512, 512);
    rightTrackModel[9].addBox(-1.0F, 0.0F, -5.0F, 1, 5, 5, 0.0F);
    rightTrackModel[9].setRotationPoint(35.0F, 0.0F, -12.5F);
    (rightTrackModel[9]).rotateAngleZ = -0.7853982F;
    
    rightTrackModel[10] = new ModelRendererTurbo(this, 460, 160, 512, 512);
    rightTrackModel[10].addBox(0.0F, 0.0F, -5.0F, 1, 4, 5, 0.0F);
    rightTrackModel[10].setRotationPoint(-37.0F, 1.0F, -12.5F);
    (rightTrackModel[10]).rotateAngleZ = 0.7853982F;
    
    turretModel = new ModelRendererTurbo[16];
    turretModel[0] = new ModelRendererTurbo(this, 0, 180, 512, 512);
    turretModel[0].addShapeBox(2.0F, -8.0F, -8.0F, 9, 8, 16, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[0].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[1] = new ModelRendererTurbo(this, 55, 180, 512, 512);
    turretModel[1].addBox(-9.0F, -8.0F, -7.0F, 11, 8, 14, 0.0F);
    turretModel[1].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[2] = new ModelRendererTurbo(this, 110, 180, 512, 512);
    turretModel[2].addShapeBox(2.0F, -8.0F, 8.0F, 9, 8, 3, 0.0F, 0.0F, 0.0F, 0.0F, -2.0F, -2.0F, 0.0F, -2.0F, -2.0F, -2.9F, 0.0F, 0.0F, -2.9F, 0.0F, 0.0F, -2.9F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F);
    turretModel[2].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[3] = new ModelRendererTurbo(this, 110, 193, 512, 512);
    turretModel[3].addShapeBox(2.0F, -8.0F, -11.0F, 9, 8, 3, 0.0F, 0.0F, 0.0F, -2.9F, -2.0F, -2.0F, -2.9F, -2.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, -2.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.9F);
    turretModel[3].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[4] = new ModelRendererTurbo(this, 140, 180, 512, 512);
    turretModel[4].addShapeBox(-3.0F, -8.0F, 7.0F, 5, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.9F, 0.0F, 0.0F, -2.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F);
    turretModel[4].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[5] = new ModelRendererTurbo(this, 140, 195, 512, 512);
    turretModel[5].addShapeBox(-3.0F, -8.0F, -11.0F, 5, 8, 4, 0.0F, 0.0F, 0.0F, -2.6F, 0.0F, 0.0F, -2.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[5].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[6] = new ModelRendererTurbo(this, 165, 180, 512, 512);
    turretModel[6].addShapeBox(-6.0F, -8.0F, 7.0F, 3, 8, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.6F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, -1.0F);
    turretModel[6].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[7] = new ModelRendererTurbo(this, 165, 195, 512, 512);
    turretModel[7].addShapeBox(-6.0F, -8.0F, -11.0F, 3, 8, 4, 0.0F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, -2.6F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.3F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[7].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[8] = new ModelRendererTurbo(this, 190, 180, 512, 512);
    turretModel[8].addShapeBox(-12.0F, -8.0F, 7.0F, 6, 8, 4, 0.0F, -2.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -3.0F, -2.9F, 0.0F, -3.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.9F, 0.0F, 0.0F, -1.0F, -1.0F, -3.0F, -2.5F);
    turretModel[8].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[9] = new ModelRendererTurbo(this, 190, 195, 512, 512);
    turretModel[9].addShapeBox(-12.0F, -8.0F, -11.0F, 6, 8, 4, 0.0F, -2.9F, 0.0F, -3.9F, 0.0F, 0.0F, -3.0F, 0.0F, 0.0F, 0.0F, -2.9F, 0.0F, 0.0F, -1.0F, -3.0F, -3.2F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[9].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[10] = new ModelRendererTurbo(this, 215, 180, 512, 512);
    turretModel[10].addShapeBox(-11.0F, -8.0F, -7.0F, 3, 8, 14, 0.0F, -2.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -2.9F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[10].setRotationPoint(4.0F, -15.0F, 2.5F);
    
    turretModel[11] = new ModelRendererTurbo(this, 0, 215, 512, 512);
    turretModel[11].addShapeBox(9.0F, -6.0F, 6.0F, 1, 4, 4, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, -0.4F, 0.0F, 0.5F, -0.4F, -1.9F, 0.0F, 0.0F, -1.9F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[11].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[12] = new ModelRendererTurbo(this, 0, 230, 512, 512);
    turretModel[12].addShapeBox(9.0F, -6.0F, -10.0F, 1, 4, 4, 0.0F, 0.0F, 0.0F, -1.9F, 0.5F, -0.4F, -1.9F, 0.5F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[12].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[13] = new ModelRendererTurbo(this, 20, 215, 512, 512);
    turretModel[13].addShapeBox(10.5F, -6.0F, 6.0F, 1, 4, 4, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, -1.4F, 0.0F, 0.0F, -1.4F, -1.5F, 0.0F, -0.4F, -1.9F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, -0.6F, 0.0F, 0.0F, 0.0F);
    turretModel[13].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[14] = new ModelRendererTurbo(this, 20, 230, 512, 512);
    turretModel[14].addShapeBox(10.5F, -6.0F, -10.0F, 1, 4, 4, 0.0F, 0.0F, -0.4F, -1.9F, 0.0F, -1.4F, -1.5F, 0.0F, -1.4F, 0.0F, 0.0F, -0.4F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, -0.6F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    turretModel[14].setRotationPoint(5.0F, -15.0F, 2.5F);
    
    turretModel[15] = new ModelRendererTurbo(this, 0, 250, 512, 512);
    turretModel[15].addShape3D(-9.0F, 7.5F, -9.0F, new Shape2D(new Coord2D[] { new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(8.0D, 0.0D, 8, 0), new Coord2D(11.0D, 3.0D, 11, 3), new Coord2D(11.0D, 8.0D, 11, 8), new Coord2D(8.0D, 11.0D, 8, 11), new Coord2D(3.0D, 11.0D, 3, 11), new Coord2D(0.0D, 8.0D, 0, 8), new Coord2D(0.0D, 3.0D, 0, 3) }), 2.0F, 11, 11, 40, 2, 4, new float[] { 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F, 5.0F });
    turretModel[15].setRotationPoint(5.0F, -15.0F, -2.5F);
    
    barrelModel = new ModelRendererTurbo[5];
    barrelModel[0] = new ModelRendererTurbo(this, 40, 215, 512, 512);
    barrelModel[0].addBox(-1.0F, -1.3F, -7.0F, 1, 3, 14, 0.0F);
    barrelModel[0].setRotationPoint(15.0F, -19.0F, 2.5F);
    
    barrelModel[1] = new ModelRendererTurbo(this, 80, 215, 512, 512);
    barrelModel[1].addShapeBox(0.0F, -1.3F, -7.0F, 1, 3, 14, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, -1.0F, 0.0F, 0.0F, 0.0F, 0.0F);
    barrelModel[1].setRotationPoint(15.0F, -19.0F, 2.5F);
    
    barrelModel[2] = new ModelRendererTurbo(this, 120, 215, 512, 512);
    barrelModel[2].addBox(0.0F, -0.3F, 4.0F, 12, 1, 1, 0.0F);
    barrelModel[2].setRotationPoint(15.0F, -19.0F, 2.5F);
    
    barrelModel[3] = new ModelRendererTurbo(this, 120, 225, 512, 512);
    barrelModel[3].addShapeBox(12.0F, -0.3F, 4.0F, 3, 1, 1, 0.0F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F, 0.0F, 0.2F, 0.2F);
    barrelModel[3].setRotationPoint(15.0F, -19.0F, 2.5F);
    
    barrelModel[4] = new ModelRendererTurbo(this, 155, 215, 512, 512);
    barrelModel[4].addShapeBox(0.0F, 0.0F, -5.0F, 7, 1, 1, 0.0F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F, 0.0F, -0.2F, -0.2F);
    barrelModel[4].setRotationPoint(15.0F, -19.0F, 2.5F);
    
    translateAll(-5.0F, 1.0F, -3.5F);
    
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
