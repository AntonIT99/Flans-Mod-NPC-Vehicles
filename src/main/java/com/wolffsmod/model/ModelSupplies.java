package com.wolffsmod.model; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Shape2D;

import net.minecraft.entity.Entity;

public class ModelSupplies
extends ModelVehicle
{
int textureX = 512;
int textureY = 512;

		{
			bodyModel = new ModelRendererTurbo[19];
			bodyModel[0] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 108
			bodyModel[1] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 108
			bodyModel[2] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 108
			bodyModel[3] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 108
			bodyModel[4] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 108
			bodyModel[5] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Box 108
			bodyModel[6] = new ModelRendererTurbo(this, 145, 241, textureX, textureY); // Box 108
			bodyModel[7] = new ModelRendererTurbo(this, 345, 233, textureX, textureY); // Box 108
			bodyModel[8] = new ModelRendererTurbo(this, 281, 241, textureX, textureY); // Box 108
			bodyModel[9] = new ModelRendererTurbo(this, 185, 249, textureX, textureY); // Box 108
			bodyModel[10] = new ModelRendererTurbo(this, 305, 241, textureX, textureY); // Box 108
			bodyModel[11] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box 108
			bodyModel[12] = new ModelRendererTurbo(this, 225, 257, textureX, textureY); // Box 108
			bodyModel[13] = new ModelRendererTurbo(this, 41, 265, textureX, textureY); // Box 108
			bodyModel[14] = new ModelRendererTurbo(this, 313, 257, textureX, textureY); // Box 108
			bodyModel[15] = new ModelRendererTurbo(this, 329, 257, textureX, textureY); // Box 108
			bodyModel[16] = new ModelRendererTurbo(this, 97, 265, textureX, textureY); // Box 108
			bodyModel[17] = new ModelRendererTurbo(this, 105, 265, textureX, textureY); // Box 108
			bodyModel[18] = new ModelRendererTurbo(this, 153, 320, textureX, textureY); // Box 108

			bodyModel[0].addShapeBox(0F, 0F, 0F, 2, 30, 35, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[0].setRotationPoint(8F, -23F, -27F);

			bodyModel[1].addShapeBox(0F, 0F, 0F, 61, 3, 41, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[1].setRotationPoint(-51F, -26F, -30F);

			bodyModel[2].addShapeBox(0F, 0F, 0F, 61, 30, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[2].setRotationPoint(-51F, -23F, 8F);

			bodyModel[3].addShapeBox(0F, 0F, 0F, 61, 30, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[3].setRotationPoint(-51F, -23F, -30F);

			bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 30, 17, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[4].setRotationPoint(-50F, -23F, -27F);

			bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 108
			bodyModel[5].setRotationPoint(-51.5F, -23F, -12.5F);

			bodyModel[6].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[6].setRotationPoint(-51F, -23F, -19F);

			bodyModel[7].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 108
			bodyModel[7].setRotationPoint(-51.5F, -23F, -19.5F);

			bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[8].setRotationPoint(-51F, -6F, -21F);

			bodyModel[9].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 108
			bodyModel[9].setRotationPoint(-52F, -6.5F, -21.5F);

			bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[10].setRotationPoint(-51F, -23F, -12F);

			bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 30, 18, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[11].setRotationPoint(-50F, -23F, -10F);

			bodyModel[12].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 108
			bodyModel[12].setRotationPoint(-51.5F, -23F, -9.5F);

			bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[13].setRotationPoint(-51F, -6F, -9F);

			bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 108
			bodyModel[14].setRotationPoint(-52F, -6.5F, -0.5F);

			bodyModel[15].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F); // Box 108
			bodyModel[15].setRotationPoint(-51.5F, -23F, -2.5F);

			bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[16].setRotationPoint(-51F, -23F, -9F);

			bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 30, 1, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[17].setRotationPoint(-51F, -23F, -2F);

			bodyModel[18].addShapeBox(0F, 0F, 0F, 61, 3, 41, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
			bodyModel[18].setRotationPoint(-51F, 7F, -30F);



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

			
		}
	}
