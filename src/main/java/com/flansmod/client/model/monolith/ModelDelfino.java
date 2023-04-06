//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelDelfino extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 32;

	public ModelDelfino() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[33];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 8
		bodyModel[7] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 33
		bodyModel[23] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 1
		bodyModel[24] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 2
		bodyModel[25] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 3
		bodyModel[26] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 4
		bodyModel[27] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 5
		bodyModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		bodyModel[29] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 7
		bodyModel[30] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 8
		bodyModel[31] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 9
		bodyModel[32] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 10

		bodyModel[0].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(2F, 2.5F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F,0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(2F, 2.5F, -4.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 8, 3, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F); // Box 3
		bodyModel[2].setRotationPoint(2F, 2.5F, 1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -2.5F, -0.5F); // Box 4
		bodyModel[3].setRotationPoint(7F, 2.5F, 1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F); // Box 5
		bodyModel[4].setRotationPoint(7F, 2.5F, -1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -2.5F, -0.5F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -0.2F, 0F); // Box 6
		bodyModel[5].setRotationPoint(7F, 2.5F, -4.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, -2.99F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, -2.99F, 0F, -3F, -1F); // Box 8
		bodyModel[6].setRotationPoint(14F, 2.5F, 1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.8F, 0F); // Box 9
		bodyModel[7].setRotationPoint(14F, 2.5F, -1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -3F, -1F, 0F, -3.5F, -2.99F, 0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -3.5F, -2.99F, 0F, -2.5F, 0F, 0F, -0.8F, 0F); // Box 10
		bodyModel[8].setRotationPoint(14F, 2.5F, -4.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(21F, 5F, -1.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, -0.3F, -0.3F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, 0F, -0.3F, -0.3F); // Box 12
		bodyModel[10].setRotationPoint(22.5F, 5F, -1.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F); // Box 13
		bodyModel[11].setRotationPoint(-5F, 2.5F, 1.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 14
		bodyModel[12].setRotationPoint(-5F, 2.5F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 7, 8, 3, 0F,0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-5F, 2.5F, -4.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F,0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -2.5F, -0.5F, 0F, -3F, -1F); // Box 16
		bodyModel[14].setRotationPoint(-9F, 2.5F, 1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F,0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.8F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-9F, 2.5F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 8, 3, 0F,0F, -3F, -1F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -2.5F, -0.5F, 0F, -0.2F, 0F, 0F, -0.8F, 0F); // Box 18
		bodyModel[16].setRotationPoint(-9F, 2.5F, -4.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 10, 8, 3, 0F,0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -3.5F, -2.99F, 0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -3F, -1F, 0F, -3.5F, -2.99F); // Box 19
		bodyModel[17].setRotationPoint(-19F, 2.5F, 1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 10, 8, 3, 0F,0F, -3.5F, -2.99F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, -2.99F, 0F, -3F, -1F, 0F, -0.8F, 0F, 0F, -2.5F, 0F); // Box 20
		bodyModel[18].setRotationPoint(-19F, 2.5F, -4.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 10, 8, 3, 0F,0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -2.5F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-19F, 2.5F, -1.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0.5F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.3F, -0.3F); // Box 22
		bodyModel[20].setRotationPoint(-20F, 5F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 3, 3, 0F,-0.5F, -1F, -1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -1F, -1F); // Box 23
		bodyModel[21].setRotationPoint(-22.5F, 5F, -1.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F); // Box 33
		bodyModel[22].setRotationPoint(-1F, 0.5F, -1F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F); // Box 1
		bodyModel[23].setRotationPoint(-22.5F, 4.5F, -0.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, -1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 2
		bodyModel[24].setRotationPoint(-22.5F, 6.5F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 3
		bodyModel[25].setRotationPoint(-24F, 4F, -0.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 4
		bodyModel[26].setRotationPoint(-24.5F, 4F, -0.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 1F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 5
		bodyModel[27].setRotationPoint(-24F, 8F, -0.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,1F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 6
		bodyModel[28].setRotationPoint(16.5F, 8.5F, -0.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.4F); // Box 7
		bodyModel[29].setRotationPoint(-23F, 6F, -0.5F);

		bodyModel[30].addShapeBox(0F, -1F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F); // Box 8
		bodyModel[30].setRotationPoint(-23F, 6.5F, 0F);

		bodyModel[31].addShapeBox(0F, -1F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F); // Box 9
		bodyModel[31].setRotationPoint(-23F, 6.5F, 0F);
		bodyModel[31].rotateAngleX = 2.35619449F;

		bodyModel[32].addShapeBox(0F, -1F, -0.5F, 1, 1, 1, 0F,-0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F); // Box 10
		bodyModel[32].setRotationPoint(-23F, 6.5F, 0F);
		bodyModel[32].rotateAngleX = -2.35619449F;
	}
}