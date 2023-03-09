package com.wolffsmod.model;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;


public class ModelMCOMStation extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMCOMStation() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[38];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 6
		bodyModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 6
		bodyModel[9] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 6
		bodyModel[10] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 6
		bodyModel[11] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 6
		bodyModel[12] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 6
		bodyModel[13] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 6
		bodyModel[14] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 6
		bodyModel[15] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 6
		bodyModel[16] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 6
		bodyModel[17] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 6
		bodyModel[18] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 6
		bodyModel[19] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 6
		bodyModel[20] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 6
		bodyModel[21] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 6
		bodyModel[22] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[23] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 6
		bodyModel[24] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 6
		bodyModel[25] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 6
		bodyModel[26] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 6
		bodyModel[27] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 6
		bodyModel[28] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 6
		bodyModel[30] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 6
		bodyModel[31] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 6
		bodyModel[32] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 6
		bodyModel[33] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 6
		bodyModel[34] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 6
		bodyModel[35] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 6
		bodyModel[36] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 6
		bodyModel[37] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 38

		bodyModel[0].addShapeBox(-8F, 0F, -8F, 64, 128, 64, 0F, -48F, -96F, -48F, 0F, -96F, -48F, 0F, -96F, 0F, -48F, -96F, 0F, -48F, 0F, -48F, 0F, 0F, -48F, 0F, 0F, 0F, -48F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-48F, -128F, -48F);

		bodyModel[1].addBox(-8F, 0F, -8F, 1, 32, 18, 0F); // Box 2
		bodyModel[1].setRotationPoint(-1F, -32F, -1F);

		bodyModel[2].addBox(-8F, 0F, -8F, 1, 32, 18, 0F); // Box 2
		bodyModel[2].setRotationPoint(16F, -32F, -1F);

		bodyModel[3].addBox(-8F, 0F, -8F, 16, 32, 1, 0F); // Box 4
		bodyModel[3].setRotationPoint(0F, -32F, -1F);

		bodyModel[4].addBox(-8F, 0F, -8F, 18, 1, 18, 0F); // Box 5
		bodyModel[4].setRotationPoint(-1F, -33F, -1F);

		bodyModel[5].addBox(-8F, 0F, -8F, 16, 2, 1, 0F); // Box 6
		bodyModel[5].setRotationPoint(0F, -12F, 16F);

		bodyModel[6].addBox(-8F, 0F, -8F, 16, 1, 1, 0F); // Box 6
		bodyModel[6].setRotationPoint(0F, -1F, 16F);

		bodyModel[7].addShapeBox(-8F, 0F, -8F, 2, 1, 18, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[7].setRotationPoint(-0.5F, -34F, -1F);

		bodyModel[8].addShapeBox(-8F, 0F, -8F, 2, 1, 18, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[8].setRotationPoint(2.5F, -34F, -1F);

		bodyModel[9].addShapeBox(-8F, 0F, -8F, 2, 1, 18, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[9].setRotationPoint(8.5F, -34F, -1F);

		bodyModel[10].addShapeBox(-8F, 0F, -8F, 2, 1, 18, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[10].setRotationPoint(11.5F, -34F, -1F);

		bodyModel[11].addShapeBox(-8F, 0F, -8F, 2, 1, 18, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[11].setRotationPoint(5.5F, -34F, -1F);

		bodyModel[12].addShapeBox(-8F, 0F, -8F, 2, 1, 18, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[12].setRotationPoint(14.5F, -34F, -1F);

		bodyModel[13].addShapeBox(-8F, 0F, -8F, 1, 1, 18, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[13].setRotationPoint(17F, -33F, -1F);

		bodyModel[14].addShapeBox(-8F, 0F, -8F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[14].setRotationPoint(17F, -32F, -1F);

		bodyModel[15].addShapeBox(-8F, 0F, -8F, 1, 1, 18, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[15].setRotationPoint(-2F, -33F, -1F);

		bodyModel[16].addShapeBox(-8F, 0F, -8F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[16].setRotationPoint(-2F, -32F, -1F);

		bodyModel[17].addShapeBox(-8F, 0F, -8F, 1, 20, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[17].setRotationPoint(-2F, -32F, 15F);

		bodyModel[18].addShapeBox(-8F, 0F, -8F, 1, 1, 18, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[18].setRotationPoint(-2F, -11F, -1F);

		bodyModel[19].addShapeBox(-8F, 0F, -8F, 1, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F); // Box 6
		bodyModel[19].setRotationPoint(-2F, -12F, -1F);

		bodyModel[20].addShapeBox(-8F, 0F, -8F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[20].setRotationPoint(-2F, -14F, -1F);

		bodyModel[21].addShapeBox(-8F, 0F, -8F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[21].setRotationPoint(-2F, -10F, -1F);

		bodyModel[22].addShapeBox(-8F, 0F, -8F, 1, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[22].setRotationPoint(-2F, -10F, 15F);

		bodyModel[23].addShapeBox(-8F, 0F, -8F, 1, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[23].setRotationPoint(-2F, -3F, -1F);

		bodyModel[24].addShapeBox(-8F, 0F, -8F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[24].setRotationPoint(-2F, -19F, -1F);

		bodyModel[25].addShapeBox(-8F, 0F, -8F, 1, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[25].setRotationPoint(-2F, -28F, -1F);

		bodyModel[26].addShapeBox(-8F, 0F, -8F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[26].setRotationPoint(-2F, -23F, -1F);

		bodyModel[27].addShapeBox(-8F, 0F, -8F, 1, 20, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[27].setRotationPoint(17F, -32F, 15F);

		bodyModel[28].addShapeBox(-8F, 0F, -8F, 1, 1, 18, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[28].setRotationPoint(17F, -11F, -1F);

		bodyModel[29].addShapeBox(-8F, 0F, -8F, 1, 1, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.375F, -0.375F, 0F, -0.375F, -0.375F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[29].setRotationPoint(17F, -12F, -1F);

		bodyModel[30].addShapeBox(-8F, 0F, -8F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[30].setRotationPoint(17F, -14F, -1F);

		bodyModel[31].addShapeBox(-8F, 0F, -8F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[31].setRotationPoint(17F, -10F, -1F);

		bodyModel[32].addShapeBox(-8F, 0F, -8F, 1, 10, 2, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[32].setRotationPoint(17F, -10F, 15F);

		bodyModel[33].addShapeBox(-8F, 0F, -8F, 1, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[33].setRotationPoint(17F, -3F, -1F);

		bodyModel[34].addShapeBox(-8F, 0F, -8F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[34].setRotationPoint(17F, -19F, -1F);

		bodyModel[35].addShapeBox(-8F, 0F, -8F, 1, 3, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[35].setRotationPoint(17F, -28F, -1F);

		bodyModel[36].addShapeBox(-8F, 0F, -8F, 1, 2, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[36].setRotationPoint(17F, -23F, -1F);

		bodyModel[37].addShapeBox(-8F, 0F, -8F, 40, 8, 13, 0F, 0F, -7F, 0F, -30F, -7F, 0F, -30F, -7F, -8F, 0F, -7F, -8F, 0F, 0F, 0F, -30F, 0F, 0F, -30F, 0F, -8F, 0F, 0F, -8F); // Box 38
		bodyModel[37].setRotationPoint(3F, -21.4F, 18.4F);
		bodyModel[37].rotateAngleX = -0.52359878F;



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
