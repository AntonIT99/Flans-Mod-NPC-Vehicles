package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelHMMWV2
  extends ModelVehicle
{
  int textureX = 512;
  int textureY = 512;

  
  public ModelHMMWV2() {
    bodyModel = new ModelRendererTurbo[40];
    bodyModel[0] = new ModelRendererTurbo(this, 84, 166, textureX, textureY);
    bodyModel[1] = new ModelRendererTurbo(this, 303, 0, textureX, textureY);
    bodyModel[2] = new ModelRendererTurbo(this, 0, 55, textureX, textureY);
    bodyModel[3] = new ModelRendererTurbo(this, 303, 0, textureX, textureY);
    bodyModel[4] = new ModelRendererTurbo(this, 0, 312, textureX, textureY);
    bodyModel[5] = new ModelRendererTurbo(this, 0, 260, textureX, textureY);
    bodyModel[6] = new ModelRendererTurbo(this, 206, 153, textureX, textureY);
    bodyModel[7] = new ModelRendererTurbo(this, 0, 455, textureX, textureY);
    bodyModel[8] = new ModelRendererTurbo(this, 206, 196, textureX, textureY);
    bodyModel[9] = new ModelRendererTurbo(this, 0, 455, textureX, textureY);
    bodyModel[10] = new ModelRendererTurbo(this, 93, 224, textureX, textureY);
    bodyModel[11] = new ModelRendererTurbo(this, 0, 352, textureX, textureY);
    bodyModel[12] = new ModelRendererTurbo(this, 206, 109, textureX, textureY);
    bodyModel[13] = new ModelRendererTurbo(this, 0, 208, textureX, textureY);
    bodyModel[14] = new ModelRendererTurbo(this, 0, 186, textureX, textureY);
    bodyModel[15] = new ModelRendererTurbo(this, 0, 407, textureX, textureY);
    bodyModel[16] = new ModelRendererTurbo(this, 303, 0, textureX, textureY);
    bodyModel[17] = new ModelRendererTurbo(this, 25, 136, textureX, textureY);
    bodyModel[18] = new ModelRendererTurbo(this, 25, 154, textureX, textureY);
    bodyModel[19] = new ModelRendererTurbo(this, 25, 136, textureX, textureY);
    bodyModel[20] = new ModelRendererTurbo(this, 25, 136, textureX, textureY);
    bodyModel[21] = new ModelRendererTurbo(this, 25, 136, textureX, textureY);
    bodyModel[22] = new ModelRendererTurbo(this, 53, 154, textureX, textureY);
    bodyModel[23] = new ModelRendererTurbo(this, 25, 154, textureX, textureY);
    bodyModel[24] = new ModelRendererTurbo(this, 53, 154, textureX, textureY);
    bodyModel[25] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[26] = new ModelRendererTurbo(this, 303, 0, textureX, textureY);
    bodyModel[27] = new ModelRendererTurbo(this, 93, 289, textureX, textureY);
    bodyModel[28] = new ModelRendererTurbo(this, 93, 289, textureX, textureY);
    bodyModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[30] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[31] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[34] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[35] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    bodyModel[37] = new ModelRendererTurbo(this, 0, 109, textureX, textureY);
    bodyModel[38] = new ModelRendererTurbo(this, 0, 136, textureX, textureY);
    bodyModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
    
    bodyModel[0].addBox(0.0F, 0.0F, 0.0F, 3, 13, 38, 0.0F);
    bodyModel[0].setRotationPoint(13.0F, -12.0F, -19.0F);
    
    bodyModel[1].addBox(0.0F, 0.0F, 0.0F, 2, 2, 28, 0.0F);
    bodyModel[1].setRotationPoint(-30.0F, 2.0F, -14.0F);
    
    bodyModel[2].addBox(0.0F, 0.0F, 0.0F, 27, 8, 20, 0.0F);
    bodyModel[2].setRotationPoint(-42.0F, -7.0F, -10.0F);
    
    bodyModel[3].addBox(0.0F, 0.0F, 0.0F, 2, 2, 28, 0.0F);
    bodyModel[3].setRotationPoint(25.0F, 2.0F, -14.0F);
    
    bodyModel[4].addBox(0.0F, 0.0F, 0.0F, 21, 9, 20, 0.0F);
    bodyModel[4].setRotationPoint(16.0F, -8.0F, -10.0F);
    
    bodyModel[5].addBox(0.0F, 0.0F, 0.0F, 2, 2, 38, 0.0F);
    bodyModel[5].setRotationPoint(35.0F, -5.0F, -19.0F);
    
    bodyModel[6].addBox(0.0F, 0.0F, 0.0F, 31, 1, 38, 0.0F);
    bodyModel[6].setRotationPoint(-15.0F, 1.0F, -19.0F);
    
    bodyModel[7].addBox(0.0F, 0.0F, 0.0F, 28, 22, 1, 0.0F);
    bodyModel[7].setRotationPoint(-15.0F, -21.0F, -19.0F);
    
    bodyModel[8].addBox(0.0F, 0.0F, 0.0F, 24, 1, 38, 0.0F);
    bodyModel[8].setRotationPoint(-39.0F, -8.0F, -19.0F);
    
    bodyModel[9].addBox(0.0F, 0.0F, 0.0F, 28, 22, 1, 0.0F);
    bodyModel[9].setRotationPoint(-15.0F, -21.0F, 18.0F);
    
    bodyModel[10].addBox(0.0F, 0.0F, 0.0F, 1, 22, 36, 0.0F);
    bodyModel[10].setRotationPoint(-15.0F, -21.0F, -18.0F);
    
    bodyModel[11].addBox(0.0F, 0.0F, 0.0F, 20, 3, 38, 0.0F);
    bodyModel[11].setRotationPoint(16.0F, -8.0F, -19.0F);
    
    bodyModel[12].addBox(0.0F, 0.0F, 0.0F, 29, 1, 38, 0.0F);
    bodyModel[12].setRotationPoint(-15.0F, -22.0F, -19.0F);
    
    bodyModel[13].addBox(0.0F, 0.0F, 0.0F, 4, 8, 38, 0.0F);
    bodyModel[13].setRotationPoint(-43.0F, -8.0F, -19.0F);
    
    bodyModel[14].addBox(0.0F, 0.0F, 0.0F, 16, 1, 16, 0.0F);
    bodyModel[14].setRotationPoint(-8.0F, -22.5F, -8.0F);
    
    bodyModel[15].addBox(0.0F, 0.0F, 0.0F, 1, 7, 36, 0.0F);
    bodyModel[15].setRotationPoint(38.0F, -11.0F, -18.0F);
    
    bodyModel[16].addBox(0.0F, 0.0F, 0.0F, 4, 2, 10, 0.0F);
    bodyModel[16].setRotationPoint(-31.0F, 1.0F, -5.0F);
    
    bodyModel[17].addBox(0.0F, 0.0F, 0.0F, 12, 2, 12, 0.0F);
    bodyModel[17].setRotationPoint(-14.0F, -1.0F, 3.0F);
    
    bodyModel[18].addBox(0.0F, 0.0F, 0.0F, 1, 11, 12, 0.0F);
    bodyModel[18].setRotationPoint(-1.0F, -11.0F, 3.0F);
    
    bodyModel[19].addBox(0.0F, 0.0F, 0.0F, 12, 2, 12, 0.0F);
    bodyModel[19].setRotationPoint(0.0F, -1.0F, 3.0F);
    
    bodyModel[20].addBox(0.0F, 0.0F, 0.0F, 12, 2, 12, 0.0F);
    bodyModel[20].setRotationPoint(-14.0F, -1.0F, -15.0F);
    
    bodyModel[21].addBox(0.0F, 0.0F, 0.0F, 12, 2, 12, 0.0F);
    bodyModel[21].setRotationPoint(0.0F, -1.0F, -15.0F);
    
    bodyModel[22].addBox(0.0F, 0.0F, 0.0F, 1, 10, 12, 0.0F);
    bodyModel[22].setRotationPoint(-14.0F, -11.0F, 3.0F);
    
    bodyModel[23].addBox(0.0F, 0.0F, 0.0F, 1, 11, 12, 0.0F);
    bodyModel[23].setRotationPoint(-1.0F, -11.0F, -15.0F);
    
    bodyModel[24].addBox(0.0F, 0.0F, 0.0F, 1, 10, 12, 0.0F);
    bodyModel[24].setRotationPoint(-14.0F, -11.0F, -15.0F);
    
    bodyModel[25].addBox(0.0F, 0.0F, 0.0F, 1, 2, 20, 0.0F);
    bodyModel[25].setRotationPoint(37.0F, -5.0F, -10.0F);
    
    bodyModel[26].addBox(0.0F, 0.0F, 0.0F, 4, 2, 10, 0.0F);
    bodyModel[26].setRotationPoint(24.0F, 1.0F, -5.0F);
    
    bodyModel[27].addBox(0.0F, 0.0F, 0.0F, 28, 15, 1, 0.0F);
    bodyModel[27].setRotationPoint(-43.0F, -23.0F, 18.0F);
    
    bodyModel[28].addBox(0.0F, 0.0F, 0.0F, 28, 15, 1, 0.0F);
    bodyModel[28].setRotationPoint(-43.0F, -23.0F, -19.0F);
    
    bodyModel[29].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(5.0D, 9.0D, 5, 9), new Coord2D(0.0D, 9.0D, 0, 9) }), 1.0F, 5, 9, 25, 1, 0, new float[] { 4.0F, 7.0F, 5.0F, 9.0F });
    bodyModel[29].setRotationPoint(-15.0F, 2.0F, -18.0F);
    
    bodyModel[30].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 2.0D, 3, 2), new Coord2D(5.0D, 9.0D, 5, 9), new Coord2D(0.0D, 9.0D, 0, 9) }), 1.0F, 5, 9, 25, 1, 0, new float[] { 4.0F, 7.0F, 5.0F, 9.0F });
    bodyModel[30].setRotationPoint(-15.0F, 2.0F, 19.0F);
    
    bodyModel[31].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 7.0D, 0, 7) }), 1.0F, 2, 7, 20, 1, 0, new float[] { 9.0F, 2.0F, 9.0F });
    (bodyModel[31]).rotateAngleY = 3.1415927F;
    bodyModel[31].setRotationPoint(16.0F, 2.0F, -19.0F);
    
    bodyModel[32].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 7.0D, 0, 7) }), 1.0F, 2, 7, 20, 1, 0, new float[] { 9.0F, 2.0F, 9.0F });
    (bodyModel[32]).rotateAngleY = 3.1415927F;
    bodyModel[32].setRotationPoint(16.0F, 2.0F, 18.0F);
    
    bodyModel[33].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 7.0D, 0, 7) }), 1.0F, 2, 7, 16, 1, 0, new float[] { 7.0F, 2.0F, 7.0F });
    (bodyModel[33]).rotateAngleY = 3.1415927F;
    bodyModel[33].setRotationPoint(-39.0F, 0.0F, -19.0F);
    
    bodyModel[34].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(2.0D, 7.0D, 2, 7), new Coord2D(0.0D, 7.0D, 0, 7) }), 1.0F, 2, 7, 16, 1, 0, new float[] { 7.0F, 2.0F, 7.0F });
    (bodyModel[34]).rotateAngleY = 3.1415927F;
    bodyModel[34].setRotationPoint(-39.0F, 0.0F, 18.0F);
    
    bodyModel[35].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(20.0D, 0.0D, 20, 0), new Coord2D(20.0D, 2.0D, 20, 2), new Coord2D(0.0D, 4.0D, 0, 4) }), 9.0F, 20, 4, 46, 9, 0, new float[] { 20.0F, 2.0F, 20.0F, 4.0F });
    (bodyModel[35]).rotateAngleY = 3.1415927F;
    bodyModel[35].setRotationPoint(16.0F, -8.0F, -19.0F);
    
    bodyModel[36].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(20.0D, 0.0D, 20, 0), new Coord2D(20.0D, 2.0D, 20, 2), new Coord2D(0.0D, 4.0D, 0, 4) }), 9.0F, 20, 4, 46, 9, 0, new float[] { 20.0F, 2.0F, 20.0F, 4.0F });
    (bodyModel[36]).rotateAngleY = 3.1415927F;
    bodyModel[36].setRotationPoint(16.0F, -8.0F, 10.0F);
    
    bodyModel[37].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(21.0D, 0.0D, 21, 0), new Coord2D(21.0D, 3.0D, 21, 3), new Coord2D(0.0D, 4.0D, 0, 4) }), 20.0F, 21, 4, 49, 20, 0, new float[] { 4.0F, 21.0F, 4.0F, 21.0F });
    (bodyModel[37]).rotateAngleY = 3.1415927F;
    bodyModel[37].setRotationPoint(16.0F, -8.0F, -10.0F);
    
    bodyModel[38].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(3.0D, 0.0D, 3, 0), new Coord2D(1.0D, 9.0D, 1, 9), new Coord2D(0.0D, 9.0D, 0, 9) }), 38.0F, 3, 9, 22, 38, 0, new float[] { 9.0F, 1.0F, 9.0F, 3.0F });
    (bodyModel[38]).rotateAngleY = 3.1415927F;
    bodyModel[38].setRotationPoint(13.0F, -12.0F, -19.0F);
    
    bodyModel[39].addShape3D(0.0F, 0.0F, 0.0F, new Shape2D(new Coord2D[] { new Coord2D(0.0D, 0.0D, 0, 0), new Coord2D(1.0D, 0.0D, 1, 0), new Coord2D(1.0D, 2.0D, 1, 2), new Coord2D(0.0D, 2.0D, 0, 2) }), 36.0F, 2, 1, 6, 1, 0, new float[] { 1.0F, 2.0F, 1.0F, 2.0F });
    (bodyModel[39]).rotateAngleY = 3.1415927F;
    bodyModel[39].setRotationPoint(-43.0F, -8.0F, -18.0F);

    
    leftFrontWheelModel = new ModelRendererTurbo[1];
    leftFrontWheelModel[0] = new ModelRendererTurbo(this, 45, 493, textureX, textureY);
    
    leftFrontWheelModel[0].addShape3D(7.0F, -7.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(14.0D, 4.0D, 14, 4), new Coord2D(14.0D, 10.0D, 14, 10), new Coord2D(10.0D, 14.0D, 10, 14), new Coord2D(4.0D, 14.0D, 4, 14), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 4.0D, 0, 4) }), 5.0F, 14, 14, 45, 5, 0, new float[] { 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 4.0F });
    leftFrontWheelModel[0].setRotationPoint(26.0F, 3.0F, 17.0F);

    
    leftBackWheelModel = new ModelRendererTurbo[1];
    leftBackWheelModel[0] = new ModelRendererTurbo(this, 45, 493, textureX, textureY);
    
    leftBackWheelModel[0].addShape3D(7.0F, -7.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(14.0D, 4.0D, 14, 4), new Coord2D(14.0D, 10.0D, 14, 10), new Coord2D(10.0D, 14.0D, 10, 14), new Coord2D(4.0D, 14.0D, 4, 14), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 4.0D, 0, 4) }), 5.0F, 14, 14, 45, 5, 0, new float[] { 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 4.0F });
    leftBackWheelModel[0].setRotationPoint(-29.0F, 3.0F, 17.0F);

    
    rightFrontWheelModel = new ModelRendererTurbo[1];
    rightFrontWheelModel[0] = new ModelRendererTurbo(this, 45, 493, textureX, textureY);
    
    rightFrontWheelModel[0].addShape3D(7.0F, -7.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(14.0D, 4.0D, 14, 4), new Coord2D(14.0D, 10.0D, 14, 10), new Coord2D(10.0D, 14.0D, 10, 14), new Coord2D(4.0D, 14.0D, 4, 14), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 4.0D, 0, 4) }), 5.0F, 14, 14, 45, 5, 0, new float[] { 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 4.0F });
    rightFrontWheelModel[0].setRotationPoint(26.0F, 3.0F, -16.0F);

    
    rightBackWheelModel = new ModelRendererTurbo[1];
    rightBackWheelModel[0] = new ModelRendererTurbo(this, 45, 493, textureX, textureY);
    
    rightBackWheelModel[0].addShape3D(7.0F, -7.0F, -2.0F, new Shape2D(new Coord2D[] { new Coord2D(4.0D, 0.0D, 4, 0), new Coord2D(10.0D, 0.0D, 10, 0), new Coord2D(14.0D, 4.0D, 14, 4), new Coord2D(14.0D, 10.0D, 14, 10), new Coord2D(10.0D, 14.0D, 10, 14), new Coord2D(4.0D, 14.0D, 4, 14), new Coord2D(0.0D, 10.0D, 0, 10), new Coord2D(0.0D, 4.0D, 0, 4) }), 5.0F, 14, 14, 45, 5, 0, new float[] { 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 6.0F, 4.0F });
    rightBackWheelModel[0].setRotationPoint(-29.0F, 3.0F, -16.0F);


    
    steeringWheelModel = new ModelRendererTurbo[1];
    steeringWheelModel[0] = new ModelRendererTurbo(this, 70, 455, textureX, textureY);
    
    steeringWheelModel[0].addBox(0.0F, -4.0F, -4.0F, 1, 8, 8, 0.0F);
    steeringWheelModel[0].setRotationPoint(12.5F, -12.0F, 10.0F);
    (steeringWheelModel[0]).rotateAngleZ = -0.1919862F;

    
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
		for(int i = 0; i < bodyDoorCloseModel.length; i++)
		{
			bodyDoorCloseModel[i].render(f5);
		}
		for(int i = 0; i < leftFrontWheelModel.length; i++)
		{
			leftFrontWheelModel[i].render(f5);
		}
		for(int i = 0; i < rightFrontWheelModel.length; i++)
		{
			rightFrontWheelModel[i].render(f5);
		}
		for(int i = 0; i < leftBackWheelModel.length; i++)
		{
			leftBackWheelModel[i].render(f5);
		}
		for(int i = 0; i < rightBackWheelModel.length; i++)
		{
			rightBackWheelModel[i].render(f5);
		}
		for(int i = 0; i < steeringWheelModel.length; i++)
		{
			steeringWheelModel[i].render(f5);
		}
	}
}
