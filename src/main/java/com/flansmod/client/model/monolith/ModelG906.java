//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: g906
// Model Creator: 
// Created on: 30.07.2020 - 19:37:07
// Last changed on: 30.07.2020 - 19:37:07

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelG906 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelG906() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[51];
		turretModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initturretModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 113, 17, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 145, 17, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 153, 17, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 23
		bodyModel[21] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 24
		bodyModel[22] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 25
		bodyModel[23] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 26
		bodyModel[24] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 27
		bodyModel[25] = new ModelRendererTurbo(this, 305, 1, textureX, textureY); // Box 28
		bodyModel[26] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 29
		bodyModel[27] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 30
		bodyModel[28] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 31
		bodyModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 32
		bodyModel[30] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 33
		bodyModel[31] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 34
		bodyModel[32] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 35
		bodyModel[33] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 36
		bodyModel[34] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 37
		bodyModel[35] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 38
		bodyModel[36] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 39
		bodyModel[37] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 40
		bodyModel[38] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 41
		bodyModel[39] = new ModelRendererTurbo(this, 257, 17, textureX, textureY); // Box 42
		bodyModel[40] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 43
		bodyModel[41] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 44
		bodyModel[42] = new ModelRendererTurbo(this, 289, 17, textureX, textureY); // Box 45
		bodyModel[43] = new ModelRendererTurbo(this, 305, 17, textureX, textureY); // Box 46
		bodyModel[44] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 47
		bodyModel[45] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 48
		bodyModel[46] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 49
		bodyModel[47] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 50
		bodyModel[48] = new ModelRendererTurbo(this, 465, 17, textureX, textureY); // Box 51
		bodyModel[49] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 52
		bodyModel[50] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 53

		bodyModel[0].addShapeBox(0F, 0F, 0F, 11, 4, 10, 0F,45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F, 45F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-18F, -1F, -5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 7, 4, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(12F, -5F, -4.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 4, 9, 0F,-0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -0.5F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(18.5F, -5F, -4.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -1.4F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(-11.5F, -14F, -2F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 26, 4, 10, 0F,-0.5F, -1F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(38F, -5F, -5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 26, 4, 10, 0F,0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(38F, -1F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 25, 1, 10, 0F,-0.5F, 0F, -1F, -22F, 0.5F, -1.5F, -22F, 0.5F, -1.5F, -0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0.5F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(39F, -5F, -5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(11.5F, -6F, -3.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 4, 13, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.4F, 0F, 0F, 1.4F, 0F, 0F, 1.4F, 0F, 0F, -1.4F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(13.5F, -14F, -2F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 3, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -3F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -2F); // Box 10
		bodyModel[9].setRotationPoint(-78F, 0F, -5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 11
		bodyModel[10].setRotationPoint(-78F, -1F, -5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 15, 1, 10, 0F,0F, 0F, -2F, -3F, 0F, -0.8F, -3F, 0F, -0.8F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 12
		bodyModel[11].setRotationPoint(-78F, -2F, -5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[12].setRotationPoint(22.5F, -9F, -3.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 21, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		bodyModel[13].setRotationPoint(18.5F, -26F, -0.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 15
		bodyModel[14].setRotationPoint(-38F, -17F, -0.5F);
		bodyModel[14].rotateAngleZ = 0.08726646F;

		bodyModel[15].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 16
		bodyModel[15].setRotationPoint(-40F, -32F, -0.5F);
		bodyModel[15].rotateAngleZ = 0.13089969F;

		bodyModel[16].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F); // Box 17
		bodyModel[16].setRotationPoint(-40F, -34F, -0.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F); // Box 18
		bodyModel[17].setRotationPoint(-40F, -32F, -3F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-1.5F, -1.5F, -0.5F);

		bodyModel[19].addShapeBox(1.5F, -0.7F, -0.5F, 4, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 22
		bodyModel[19].setRotationPoint(-17F, -2F, 0F);

		bodyModel[20].addShapeBox(-4.5F, -0.7F, -0.5F, 6, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 23
		bodyModel[20].setRotationPoint(-17F, -2F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[21].setRotationPoint(-18.5F, -1.5F, -0.5F);

		bodyModel[22].addShapeBox(1.5F, -0.7F, -0.5F, 4, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 25
		bodyModel[22].setRotationPoint(31.5F, -2F, 0F);

		bodyModel[23].addShapeBox(-4.5F, -0.7F, -0.5F, 6, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 26
		bodyModel[23].setRotationPoint(31.5F, -2F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[24].setRotationPoint(30F, -1.5F, -0.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[25].setRotationPoint(24.2F, -3.5F, -1F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[26].setRotationPoint(24.2F, -5.5F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 30
		bodyModel[27].setRotationPoint(26.2F, -6.2F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 31
		bodyModel[28].setRotationPoint(9F, -5.2F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[29].setRotationPoint(7F, -4.5F, -1F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[30].setRotationPoint(7F, -2.5F, -1F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,-0.4F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, 0F, 0.5F, -0.4F, -0.4F, 0.5F, -0.4F, -0.4F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 34
		bodyModel[31].setRotationPoint(19.5F, -8F, -3.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,-0.5F, 0F, 0F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[32].setRotationPoint(-26F, -5F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 36
		bodyModel[33].setRotationPoint(-23F, -5.7F, -1F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[34].setRotationPoint(-26F, -3F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[35].setRotationPoint(-54F, -4.5F, -1F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[36].setRotationPoint(-52.5F, -6.5F, -0.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 40
		bodyModel[37].setRotationPoint(-53.5F, -6.5F, -0.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 41
		bodyModel[38].setRotationPoint(-57F, -6.5F, -0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 42
		bodyModel[39].setRotationPoint(-31.5F, -3.9F, -0.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[40].setRotationPoint(-32.5F, -3.5F, -0.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 44
		bodyModel[41].setRotationPoint(-33.5F, -3.5F, -0.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 45
		bodyModel[42].setRotationPoint(40F, -7.7F, -0.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 46
		bodyModel[43].setRotationPoint(42F, -8.1F, -0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[44].setRotationPoint(41F, -7.7F, -0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 12, 5, 10, 0F,4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, -2F, -2F, 4.5F, 1F, -2F, 4.5F, 1F, -2F, 4.5F, -2F, -2F); // Box 48
		bodyModel[45].setRotationPoint(-58.5F, 3F, -5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 12, 5, 10, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -1F, -2.5F, -4F, 0F, -2F, -2F, 0F, -2F, -2F, -1F, -2.5F, -4F); // Box 49
		bodyModel[46].setRotationPoint(-75F, 3F, -5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 16, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, -2.8F, 0F, 0F, -2.8F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2F); // Box 50
		bodyModel[47].setRotationPoint(38F, 3F, -5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, -2F, 35F, 0F, -2F, 35F, 0F, -2F, 35F, 0F, -2F); // Box 51
		bodyModel[48].setRotationPoint(-7F, 3F, -5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 10, 6, 10, 0F,0F, 0F, -2.8F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -2.8F, 0F, 0F, -3.5F, -2F, -2F, -4.5F, -2F, -2F, -4.5F, 0F, 0F, -3.5F); // Box 52
		bodyModel[49].setRotationPoint(54F, 3F, -5F);

		bodyModel[50].addShapeBox(-10.5F, -3.5F, 0F, 14, 13, 1, 0F,-3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F); // Box 53
		bodyModel[50].setRotationPoint(-39.8F, -32F, -0.5F);
		bodyModel[50].rotateAngleZ = 0.17453293F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 20
		turretModel[1] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 21

		turretModel[0].addShapeBox(-4.5F, -0.7F, -0.5F, 6, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 20
		turretModel[0].setRotationPoint(0F, -2F, 0F);

		turretModel[1].addShapeBox(1.5F, -0.7F, -0.5F, 4, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 21
		turretModel[1].setRotationPoint(0F, -2F, 0F);
	}
}