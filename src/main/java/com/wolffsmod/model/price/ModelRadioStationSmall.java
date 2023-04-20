package com.wolffsmod.model.price;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;

public class ModelRadioStationSmall extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelRadioStationSmall() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[22];
		bodyModel[0] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[1] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 9
		bodyModel[2] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 9
		bodyModel[3] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 25
		bodyModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 25
		bodyModel[5] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 25
		bodyModel[6] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 25
		bodyModel[7] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 25
		bodyModel[8] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 25
		bodyModel[9] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 25
		bodyModel[10] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 25
		bodyModel[11] = new ModelRendererTurbo(this, 289, 9, textureX, textureY); // Box 33
		bodyModel[12] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 33
		bodyModel[13] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 33
		bodyModel[14] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 33
		bodyModel[15] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 33
		bodyModel[16] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 33
		bodyModel[17] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 33
		bodyModel[18] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 33
		bodyModel[19] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 33
		bodyModel[20] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 5
		bodyModel[21] = new ModelRendererTurbo(this, 114, -2, textureX, textureY); // Box 5

		bodyModel[0].addBox(0F, 0F, 0F, 16, 17, 16, 0F); // Box 5
		bodyModel[0].setRotationPoint(-8F, 0F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 30, 21, 21, 0F, 0F, 0F, 0F, -20F, 0F, 0F, -20F, 0F, -14F, 0F, 0F, -14F, 0F, -14F, 0F, -20F, -14F, 0F, -20F, -14F, -14F, 0F, -14F, -14F); // Box 9
		bodyModel[1].setRotationPoint(-5F, -17F, -3F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 20, 20, 20, 0F, 0F, 0F, 0F, -14F, 0F, 0F, -14F, 0F, -14F, 0F, 0F, -14F, 0F, -14F, 0F, -14F, -14F, 0F, -14F, -14F, -14F, 0F, -14F, -14F); // Box 9
		bodyModel[2].setRotationPoint(-3F, -21F, -2.5F);

		bodyModel[3].addBox(0F, 0F, 0F, 4, 2, 2, 0F); // Box 25
		bodyModel[3].setRotationPoint(-2F, -23F, -0.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[4].setRotationPoint(-2F, -23F, 1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[5].setRotationPoint(-2F, -23F, -1.5F);

		bodyModel[6].addBox(0F, 0F, 0F, 5, 1, 3, 0F); // Box 25
		bodyModel[6].setRotationPoint(-2.5F, -24F, -1F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 25
		bodyModel[7].setRotationPoint(-2.5F, -24F, 2F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[8].setRotationPoint(-2.5F, -24F, -2F);

		bodyModel[9].addBox(0F, 0F, 0F, 2, 3, 2, 0F); // Box 25
		bodyModel[9].setRotationPoint(-1F, -27F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[10].setRotationPoint(-1F, -28F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 33
		bodyModel[11].setRotationPoint(-0.5F, -43F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 33
		bodyModel[12].setRotationPoint(-0.5F, -34F, 0F);
		bodyModel[12].rotateAngleZ = -0.78539816F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F); // Box 33
		bodyModel[13].setRotationPoint(-6.15F, -28F, 0F);
		bodyModel[13].rotateAngleZ = 0.78539816F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 33
		bodyModel[14].setRotationPoint(5.36F, -28.65F, 0F);
		bodyModel[14].rotateAngleZ = -0.78539816F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F); // Box 33
		bodyModel[15].setRotationPoint(-0.289999999999999F, -33.38F, 0F);
		bodyModel[15].rotateAngleZ = 0.78539816F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 33
		bodyModel[16].setRotationPoint(-0.5F, -34F, 1F);
		bodyModel[16].rotateAngleY = -1.57079633F;
		bodyModel[16].rotateAngleZ = -0.78539816F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F); // Box 33
		bodyModel[17].setRotationPoint(-0.5F, -28F, 6.66F);
		bodyModel[17].rotateAngleY = -1.57079633F;
		bodyModel[17].rotateAngleZ = 0.78539816F;

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 33
		bodyModel[18].setRotationPoint(-0.5F, -28.65F, -4.88F);
		bodyModel[18].rotateAngleY = -1.57079633F;
		bodyModel[18].rotateAngleZ = -0.78539816F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, -0.4F, -0.25F); // Box 33
		bodyModel[19].setRotationPoint(-0.49F, -33.38F, 0.779999999999999F);
		bodyModel[19].rotateAngleY = -1.57079633F;
		bodyModel[19].rotateAngleZ = 0.78539816F;

		bodyModel[20].addBox(0F, 0F, 0F, 16, 8, 16, 0F); // Box 5
		bodyModel[20].setRotationPoint(-8F, -10F, -8F);

		bodyModel[21].addBox(0F, 0F, 0F, 14, 8, 14, 0F); // Box 5
		bodyModel[21].setRotationPoint(-7F, -5F, -7F);



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
