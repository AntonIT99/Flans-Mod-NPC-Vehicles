//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSoldato extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelSoldato() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[42];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 18
		bodyModel[13] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 28
		bodyModel[14] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 29
		bodyModel[15] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 30
		bodyModel[16] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 39
		bodyModel[17] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 40
		bodyModel[18] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 42
		bodyModel[19] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 43
		bodyModel[20] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 44
		bodyModel[21] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 47
		bodyModel[22] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 48
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 49
		bodyModel[24] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 50
		bodyModel[25] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 51
		bodyModel[26] = new ModelRendererTurbo(this, 265, 33, textureX, textureY); // Box 52
		bodyModel[27] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 1
		bodyModel[28] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 2
		bodyModel[29] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 3
		bodyModel[30] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 5
		bodyModel[31] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 6
		bodyModel[32] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 7
		bodyModel[33] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 8
		bodyModel[34] = new ModelRendererTurbo(this, 409, 17, textureX, textureY); // Box 9
		bodyModel[35] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 10
		bodyModel[36] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 11
		bodyModel[37] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 12
		bodyModel[38] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 13
		bodyModel[39] = new ModelRendererTurbo(this, 249, 33, textureX, textureY); // Box 14
		bodyModel[40] = new ModelRendererTurbo(this, 361, 33, textureX, textureY); // Box 15
		bodyModel[41] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 16

		bodyModel[0].addShapeBox(0F, 0F, 0F, 33, 4, 12, 0F,0F, 0F, -0.5F, 0F, 2F, -5.5F, 0F, 2F, -5.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(37F, 0F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 57, 4, 12, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 2
		bodyModel[1].setRotationPoint(-20F, 0F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 35, 4, 10, 0F,0.5F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -2F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 3
		bodyModel[2].setRotationPoint(-55F, 0F, -5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 57, 1, 12, 0F,0F, 0F, -3F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 4
		bodyModel[3].setRotationPoint(-20F, -1F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 36, 1, 12, 0F,-0.8F, -1.4F, -3.5F, 0F, 0F, -3F, 0F, 0F, -3F, -0.8F, -1.4F, -3.5F, -0.5F, 0.5F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0.5F, -3F); // Box 5
		bodyModel[4].setRotationPoint(-56F, -1F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 33, 2, 12, 0F,0F, 2F, -5.5F, -0.5F, 0.1F, -5.5F, -0.5F, 0.1F, -5.5F, 0F, 2F, -5.5F, 0F, 0F, -0.5F, 0F, -2F, -5.5F, 0F, -2F, -5.5F, 0F, 0F, -0.5F); // Box 6
		bodyModel[5].setRotationPoint(37F, -2F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 7
		bodyModel[6].setRotationPoint(28.5F, -5F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 9
		bodyModel[7].setRotationPoint(35.5F, -10F, -0.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[8].setRotationPoint(36.5F, -9F, -0.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 11
		bodyModel[9].setRotationPoint(38.5F, -10F, -0.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 12
		bodyModel[10].setRotationPoint(35.5F, -4.5F, 0.3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[11].setRotationPoint(22.5F, -11.5F, -1.5F);
		bodyModel[11].rotateAngleZ = 0.05235988F;

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[12].setRotationPoint(6.5F, -11.5F, -1.5F);
		bodyModel[12].rotateAngleZ = 0.05235988F;

		bodyModel[13].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 28
		bodyModel[13].setRotationPoint(0F, -4.7F, -2.5F);
		bodyModel[13].rotateAngleY = 4.71238898F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 29
		bodyModel[14].setRotationPoint(0F, -4.7F, -2.5F);
		bodyModel[14].rotateAngleY = 4.71238898F;

		bodyModel[15].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 30
		bodyModel[15].setRotationPoint(1F, -3.8F, -2F);
		bodyModel[15].rotateAngleY = 1.74532925F;

		bodyModel[16].addShapeBox(-5F, -1F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 39
		bodyModel[16].setRotationPoint(-32F, -3F, -3F);
		bodyModel[16].rotateAngleY = -3.14159265F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[17].setRotationPoint(-33.5F, -2.3F, -3.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 26, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 42
		bodyModel[18].setRotationPoint(26.5F, -25.5F, -0.5F);
		bodyModel[18].rotateAngleZ = 0.03490659F;

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 32, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 43
		bodyModel[19].setRotationPoint(-11.5F, -31.5F, -0.5F);
		bodyModel[19].rotateAngleZ = 0.05235988F;

		bodyModel[20].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 44
		bodyModel[20].setRotationPoint(27F, -20.5F, -3.5F);
		bodyModel[20].rotateAngleZ = 0.03490659F;

		bodyModel[21].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 47
		bodyModel[21].setRotationPoint(-11F, -22.5F, -3.5F);
		bodyModel[21].rotateAngleZ = 0.03490659F;

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 48
		bodyModel[22].setRotationPoint(-56.5F, -8F, -0.5F);
		bodyModel[22].rotateAngleZ = 0.13962634F;

		bodyModel[23].addShapeBox(-12.2F, -3F, 0F, 19, 16, 1, 0F,-5.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -4.5F, -3.5F, -0.4F, -5.5F, -3.5F, -0.4F, -5.5F, -6.5F, -0.4F, -4.5F, -6.5F, -0.4F, -4.5F, -6.5F, -0.4F, -5.5F, -6.5F, -0.4F); // Box 49
		bodyModel[23].setRotationPoint(-58.5F, -8F, -0.5F);
		bodyModel[23].rotateAngleZ = 0.13962634F;

		bodyModel[24].addShapeBox(0F, 0F, 0F, 33, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, -0.5F, -5.5F, -3F, -0.5F, -5.5F, 0F, 0F, -1.5F); // Box 50
		bodyModel[24].setRotationPoint(37F, 4F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 57, 3, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -2F); // Box 51
		bodyModel[25].setRotationPoint(-20F, 4F, -6F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 35, 3, 10, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1.5F, -0.8F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1.5F, -0.8F, -4.5F); // Box 52
		bodyModel[26].setRotationPoint(-55F, 4F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[27].setRotationPoint(16.5F, -11.5F, -1.5F);
		bodyModel[27].rotateAngleZ = 0.05235988F;

		bodyModel[28].addShapeBox(-5F, -1F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 2
		bodyModel[28].setRotationPoint(-19F, -3F, 0F);
		bodyModel[28].rotateAngleY = -3.14159265F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[29].setRotationPoint(-20.5F, -2.3F, -0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[30].setRotationPoint(-33.5F, -2.3F, 2.5F);

		bodyModel[31].addShapeBox(-5F, -1F, -1F, 12, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, -4F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 6
		bodyModel[31].setRotationPoint(-32F, -3F, 3F);
		bodyModel[31].rotateAngleY = -3.14159265F;

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 7
		bodyModel[32].setRotationPoint(-44.5F, -3.8F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F); // Box 8
		bodyModel[33].setRotationPoint(-48.5F, -3.8F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[34].setRotationPoint(-43.5F, -2.8F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 10
		bodyModel[35].setRotationPoint(1F, -4.7F, 3F);
		bodyModel[35].rotateAngleY = 1.57079633F;

		bodyModel[36].addShapeBox(-2F, 0F, 0F, 3, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 11
		bodyModel[36].setRotationPoint(1F, -4.7F, 3F);
		bodyModel[36].rotateAngleY = 1.57079633F;

		bodyModel[37].addShapeBox(-0.8F, 0F, 0F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 12
		bodyModel[37].setRotationPoint(1F, -3.8F, 3F);
		bodyModel[37].rotateAngleY = 1.74532925F;

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,-0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F); // Box 13
		bodyModel[38].setRotationPoint(28.5F, -8.8F, -5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,-0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F); // Box 14
		bodyModel[39].setRotationPoint(28.5F, -8.8F, 4F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F); // Box 15
		bodyModel[40].setRotationPoint(28.5F, -8.8F, -5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 4, 10, 0F,-0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F); // Box 16
		bodyModel[41].setRotationPoint(38.5F, -8.8F, -5F);
	}
}