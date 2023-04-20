package com.wolffsmod.model.price;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;


public class ModelRadioStation extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRadioStation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[32];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 1
		bodyModel[7] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1
		bodyModel[8] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 9
		bodyModel[11] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 9
		bodyModel[12] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 9
		bodyModel[13] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 25
		bodyModel[14] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 25
		bodyModel[15] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 25
		bodyModel[16] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 25
		bodyModel[17] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 25
		bodyModel[19] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 25
		bodyModel[20] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 33
		bodyModel[22] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 33
		bodyModel[24] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 33
		bodyModel[25] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 33
		bodyModel[28] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 33
		bodyModel[29] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 0
		bodyModel[31] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 48

		bodyModel[0].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 1
		bodyModel[0].setRotationPoint(-8F, -11F, -8F);

		bodyModel[1].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 1
		bodyModel[1].setRotationPoint(22F, -11F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 1
		bodyModel[2].setRotationPoint(-8F, -11F, 6F);

		bodyModel[3].addBox(0F, 0F, 0F, 2, 11, 2, 0F); // Box 1
		bodyModel[3].setRotationPoint(22F, -11F, 6F);

		bodyModel[4].addBox(0F, 0F, 0F, 32, 2, 16, 0F); // Box 5
		bodyModel[4].setRotationPoint(-8F, -16F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1
		bodyModel[5].setRotationPoint(21F, -14F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 3, 16, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 1
		bodyModel[6].setRotationPoint(-8.5F, -14F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 28, 3, 2, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 1
		bodyModel[7].setRotationPoint(-6F, -14F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 30, 21, 21, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, -14F, 0F, 0F, -14F, 0F, -14F, 0F, -20F, -14F, 0F, -20F, -14F, -14F, 0F, -14F, -14F); // Box 9
		bodyModel[8].setRotationPoint(13F, -23F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 30, 19, 19, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, -14F, 0F, 0F, -14F, 0F, -14F, 0F, -20F, -14F, 0F, -20F, -14F, -14F, 0F, -14F, -14F); // Box 9
		bodyModel[9].setRotationPoint(-2F, -20F, 0F);
		bodyModel[9].rotateAngleY = 0.26179939F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 21, 19, 21, 0F, 0F, -0.75F, -0.75F, -20F, -0.75F, -0.75F, -20F, -0.75F, -14.75F, 0F, -0.75F, -14.75F, 0F, -14F, -0.75F, -20F, -14F, -0.75F, -20F, -14F, -14.75F, 0F, -14F, -14.75F); // Box 9
		bodyModel[10].setRotationPoint(-1F, -21F, -0.75F);
		bodyModel[10].rotateAngleY = 0.26179939F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 21, 19, 21, 0F, 0F, -0.75F, -0.75F, -20F, -0.75F, -0.75F, -20F, -0.75F, -14.75F, 0F, -0.75F, -14.75F, 0F, -14F, -0.75F, -20F, -14F, -0.75F, -20F, -14F, -14.75F, 0F, -14F, -14.75F); // Box 9
		bodyModel[11].setRotationPoint(6F, -21F, 1.1F);
		bodyModel[11].rotateAngleY = 0.26179939F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 20, 20, 20, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, -14F, 0F, 0F, -14F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, -14F, 0F, -14F, -14F); // Box 9
		bodyModel[12].setRotationPoint(-6F, -22F, -7F);

		bodyModel[13].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 25
		bodyModel[13].setRotationPoint(-5F, -24F, -5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[14].setRotationPoint(-5F, -24F, -3F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[15].setRotationPoint(-5F, -24F, -6F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 25
		bodyModel[16].setRotationPoint(-5.5F, -25F, -5.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[17].setRotationPoint(-5.5F, -25F, -2.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[18].setRotationPoint(-5.5F, -25F, -6.5F);

		bodyModel[19].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 25
		bodyModel[19].setRotationPoint(-4F, -28F, -5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(-4F, -29F, -5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 33
		bodyModel[21].setRotationPoint(-3.5F, -44F, -4.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 33
		bodyModel[22].setRotationPoint(-3.5F, -35F, -4.5F);
		bodyModel[22].rotateAngleZ = -0.78539816F;

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F); // Box 33
		bodyModel[23].setRotationPoint(-9.15F, -29F, -4.5F);
		bodyModel[23].rotateAngleZ = 0.78539816F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 33
		bodyModel[24].setRotationPoint(2.36F, -29.65F, -4.5F);
		bodyModel[24].rotateAngleZ = -0.78539816F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F); // Box 33
		bodyModel[25].setRotationPoint(-3.29F, -34.38F, -4.5F);
		bodyModel[25].rotateAngleZ = 0.78539816F;

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 33
		bodyModel[26].setRotationPoint(-3.5F, -35F, -3.5F);
		bodyModel[26].rotateAngleY = -1.57079633F;
		bodyModel[26].rotateAngleZ = -0.78539816F;

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F); // Box 33
		bodyModel[27].setRotationPoint(-3.5F, -29F, 2.16F);
		bodyModel[27].rotateAngleY = -1.57079633F;
		bodyModel[27].rotateAngleZ = 0.78539816F;

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 33
		bodyModel[28].setRotationPoint(-3.5F, -29.65F, -9.38F);
		bodyModel[28].rotateAngleY = -1.57079633F;
		bodyModel[28].rotateAngleZ = -0.78539816F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F); // Box 33
		bodyModel[29].setRotationPoint(-3.49F, -34.38F, -3.72F);
		bodyModel[29].rotateAngleY = -1.57079633F;
		bodyModel[29].rotateAngleZ = 0.78539816F;

		bodyModel[30].addBox(0F, 0F, 0F, 32, 16, 14, 0F); // Box 0
		bodyModel[30].setRotationPoint(-8F, -16F, -24F);

		bodyModel[31].addBox(0F, 0F, 0F, 2, 3, 1, 0F); // Box 48
		bodyModel[31].setRotationPoint(7F, -16F, -10F);



		translateAll(0F, 0F, 0F);


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
