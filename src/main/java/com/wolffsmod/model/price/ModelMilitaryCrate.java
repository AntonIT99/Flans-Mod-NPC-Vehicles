package com.wolffsmod.model.price;

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;
import net.minecraft.client.model.ModelBase;
import net.minecraft.entity.Entity;



public class ModelMilitaryCrate extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMilitaryCrate() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[21];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 20

		bodyModel[0].addBox(0F, 0F, 0F, 5, 17, 5, 0F); // Box 0
		bodyModel[0].setRotationPoint(-12F, -17F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-12F, -18F, -8F);
		bodyModel[1].rotateAngleX = 0.06981317F;

		bodyModel[2].addBox(0F, 0F, 0F, 5, 17, 5, 0F); // Box 2
		bodyModel[2].setRotationPoint(9F, -16.95F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 16, 17, 15, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F); // Box 3
		bodyModel[3].setRotationPoint(-7F, -17F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 4
		bodyModel[4].setRotationPoint(-7F, -17F, 7F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 1, 16, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(7F, -18F, -8F);
		bodyModel[5].rotateAngleX = 0.06981317F;

		bodyModel[6].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-1F, -18F, -8F);
		bodyModel[6].rotateAngleX = 0.06981317F;

		bodyModel[7].addBox(0F, 0F, 0F, 3, 2, 1, 0F); // Box 7
		bodyModel[7].setRotationPoint(6F, -17F, 7F);

		bodyModel[8].addBox(0F, 0F, 0F, 6, 2, 1, 0F); // Box 8
		bodyModel[8].setRotationPoint(-2F, -17F, 7F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[9].setRotationPoint(-5F, -18F, -8.5F);
		bodyModel[9].rotateAngleX = 0.06981317F;

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 1, 16, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[10].setRotationPoint(3F, -18F, -8.5F);
		bodyModel[10].rotateAngleX = 0.06981317F;

		bodyModel[11].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-4F, -17.5F, 6.8F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(4F, -17.5F, 6.9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.9F, 0F, 0F, -0.79F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-5F, -19.2F, 7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F, 0F, -0.9F, 0F, 0F, -0.79F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(3F, -19.2F, 7F);

		bodyModel[15].addBox(0F, 0F, 0F, 5, 17, 5, 0F); // Box 15
		bodyModel[15].setRotationPoint(-12F, -17F, 3F);

		bodyModel[16].addBox(0F, 0F, 0F, 5, 6, 6, 0F); // Box 16
		bodyModel[16].setRotationPoint(-12F, -17F, -3F);

		bodyModel[17].addBox(0F, 0F, 0F, 4, 11, 6, 0F); // Box 17
		bodyModel[17].setRotationPoint(-11F, -11F, -3F);

		bodyModel[18].addBox(0F, 0F, 0F, 5, 17, 5, 0F); // Box 18
		bodyModel[18].setRotationPoint(9F, -16.95F, 3F);

		bodyModel[19].addBox(0F, 0F, 0F, 5, 6, 6, 0F); // Box 19
		bodyModel[19].setRotationPoint(9F, -16.95F, -3F);

		bodyModel[20].addBox(0F, 0F, 0F, 4, 11, 6, 0F); // Box 20
		bodyModel[20].setRotationPoint(9F, -10.95F, -3F);



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
