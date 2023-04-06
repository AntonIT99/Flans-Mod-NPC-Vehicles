//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: RobertLee
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRobertLee extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelRobertLee() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[58];
		bodyDoorOpenModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initbodyDoorOpenModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 337, 41, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 161, 65, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 57, 89, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 121, 89, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 50
		bodyModel[36] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 51
		bodyModel[37] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 52
		bodyModel[38] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 53
		bodyModel[39] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 95
		bodyModel[40] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 96
		bodyModel[41] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 97
		bodyModel[42] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 98
		bodyModel[43] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 99
		bodyModel[44] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 100
		bodyModel[45] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 101
		bodyModel[46] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 102
		bodyModel[47] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 103
		bodyModel[48] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 104
		bodyModel[49] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 95
		bodyModel[50] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 96
		bodyModel[51] = new ModelRendererTurbo(this, 313, 65, textureX, textureY); // Box 97
		bodyModel[52] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 99
		bodyModel[53] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 65, 108, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 449, 97, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 59

		bodyModel[0].addShapeBox(0F, 0F, 0F, 45, 6, 18, 0F,0F, -0.25F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -0.25F, -6F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 1
		bodyModel[0].setRotationPoint(-30F, -4F, -9F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 45, 6, 18, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, -0.25F); // Box 2
		bodyModel[1].setRotationPoint(-30F, 2F, -9F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 45, 6, 18, 0F,0F, 0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.25F, 0F, -1.25F, -6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1.25F, -6F); // Box 3
		bodyModel[2].setRotationPoint(-30F, 8F, -9F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 51, 6, 18, 0F,0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, -6F); // Box 4
		bodyModel[3].setRotationPoint(15F, 8F, -9F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 51, 6, 18, 0F,0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F); // Box 5
		bodyModel[4].setRotationPoint(15F, 2F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 51, 6, 18, 0F,0F, 0F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, 0F, -6F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F); // Box 6
		bodyModel[5].setRotationPoint(15F, -4F, -9F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, 0F, -0.5F, 0F, 0.5F, -1.25F, 0F, 0.5F, -1.25F, 0F, 0F, -0.5F, 0F, -0.5F, -6F, 0F, -1.25F, -6F, 0F, -1.25F, -6F, 0F, -0.5F, -6F); // Box 7
		bodyModel[6].setRotationPoint(66F, 8F, -9F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, 0F, -0.5F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, -1.25F, 0F, 0F, -0.5F); // Box 8
		bodyModel[7].setRotationPoint(66F, 2F, -9F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, -0.5F, -6F, 0F, -1.75F, -6F, 0F, -1.75F, -6F, 0F, -0.5F, -6F, 0F, 0F, -0.5F, 0F, 1F, -1.25F, 0F, 1F, -1.25F, 0F, 0F, -0.5F); // Box 9
		bodyModel[8].setRotationPoint(66F, -4F, -9F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 15, 0F,0F, 0F, 0.25F, 0F, -0.25F, -0.75F, 0F, -0.25F, -0.75F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.5F, 0.25F); // Box 10
		bodyModel[9].setRotationPoint(77F, 3F, -7.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, 0.25F, -4.5F, 0F, -0.75F, -5F, 0F, -0.75F, -5F, 0F, 0.25F, -4.5F, 0F, 0F, 0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0F, 0.25F); // Box 11
		bodyModel[10].setRotationPoint(77F, -2F, -7.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, -0.5F, 0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0.25F, 0F, 0.75F, -4.5F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0.75F, -4.5F); // Box 12
		bodyModel[11].setRotationPoint(77F, 7F, -7.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 4, 13, 0F,0F, -0.25F, 0.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.5F); // Box 13
		bodyModel[12].setRotationPoint(81F, 3F, -6.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 4, 5, 13, 0F,0F, 0.25F, -4F, 0F, -0.75F, -4.5F, 0F, -0.75F, -4.5F, 0F, 0.25F, -4F, 0F, -0.75F, 0.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.75F, 0.25F); // Box 14
		bodyModel[13].setRotationPoint(81F, -1F, -6.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 4, 5, 13, 0F,0F, -1.25F, 0.5F, 0F, -1.25F, -1F, 0F, -1.25F, -1F, 0F, -1.25F, 0.5F, 0F, 1.5F, -4F, 0F, 0.75F, -4.5F, 0F, 0.75F, -4.5F, 0F, 1.5F, -4F); // Box 15
		bodyModel[14].setRotationPoint(81F, 6F, -6.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 3, 11, 0F,0F, 0.25F, -0.25F, 0F, -0.25F, -2F, 0F, -0.25F, -2F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.25F, 0F); // Box 16
		bodyModel[15].setRotationPoint(85F, 4F, -5.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F,0F, 0.25F, -3.5F, 0F, -1.75F, -4.25F, 0F, -1.75F, -4.25F, 0F, 0.25F, -3.5F, 0F, -0.25F, -0.25F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, 0F, -0.25F, -0.25F); // Box 17
		bodyModel[16].setRotationPoint(85F, 0F, -5.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 5, 4, 11, 0F,0F, -0.25F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.25F, 0F, 0F, 0.75F, -3.5F, 0F, -1F, -4.25F, 0F, -1F, -4.25F, 0F, 0.75F, -3.5F); // Box 18
		bodyModel[17].setRotationPoint(85F, 7F, -5.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -0.25F, 0.5F, 0.5F, -0.5F, -1.75F, 0.5F, -0.5F, -1.75F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0.5F, -0.25F, -1.75F, 0.5F, -0.25F, -1.75F, 0F, 0F, 0.5F); // Box 19
		bodyModel[18].setRotationPoint(90F, 4F, -3F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -0.25F, -1.75F, -0.5F, -1.25F, -2.25F, -0.5F, -1.25F, -2.25F, 0F, -0.25F, -1.75F, 0F, -0.25F, 0.5F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0F, -0.25F, 0.5F); // Box 20
		bodyModel[19].setRotationPoint(90F, 1.5F, -3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, -0.25F, 0.5F, 0.5F, 0F, -1.75F, 0.5F, 0F, -1.75F, 0F, -0.25F, 0.5F, 0F, 0.25F, -1.75F, -0.25F, -1.25F, -2.25F, -0.25F, -1.25F, -2.25F, 0F, 0.25F, -1.75F); // Box 21
		bodyModel[20].setRotationPoint(90F, 6.75F, -3F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, -1F, -6F, 0F, -0.5F, -6F, 0F, -0.5F, -6F, 0F, -1F, -6F, 0F, 0.5F, -1.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.5F, -1.25F); // Box 22
		bodyModel[21].setRotationPoint(-41F, -4.25F, -9F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, 0.75F, -1.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.75F, -1.25F, 0F, -1.75F, -6F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -1.75F, -6F); // Box 23
		bodyModel[22].setRotationPoint(-41F, 7.75F, -9F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 6, 18, 0F,0F, -0.5F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.75F, -1.25F); // Box 24
		bodyModel[23].setRotationPoint(-41F, 1.75F, -9F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 19, 5, 16, 0F,0F, -0.5F, -2F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, -0.5F, -2F); // Box 25
		bodyModel[24].setRotationPoint(-60F, 1.75F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 19, 5, 16, 0F,0F, -0.25F, -6F, 0F, 1.25F, -5F, 0F, 1.25F, -5F, 0F, -0.25F, -6F, 0F, -0.75F, -2F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -2F); // Box 26
		bodyModel[25].setRotationPoint(-60F, -2F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 19, 5, 16, 0F,0F, -0.25F, -2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -0.25F, -2F, 0F, -0.75F, -6F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, -0.75F, -6F); // Box 27
		bodyModel[26].setRotationPoint(-60F, 6F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 27, 4, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 4F, 0F, -0.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-87F, 1.75F, -2F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 27, 4, 4, 0F,-16.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -16.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-87F, -2.25F, -2F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 27, 4, 4, 0F,0F, 1F, 0F, 0F, 0.5F, 4F, 0F, 0.5F, 4F, 0F, 1F, 0F, -16.5F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -16.5F, -1.5F, 0F); // Box 30
		bodyModel[29].setRotationPoint(-87F, 6.75F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0.5F, -1.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -1.25F, -1.25F, 0.5F, -1.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -1.25F, -1.25F); // Box 31
		bodyModel[30].setRotationPoint(-92F, 1.75F, -2F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F); // Box 32
		bodyModel[31].setRotationPoint(-85F, -5.25F, -0.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 4, 8, 1, 0F,1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 1.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 33
		bodyModel[32].setRotationPoint(-85F, 4.75F, -0.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,1.25F, -0.25F, 0F, 1.5F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.5F, -0.25F, 0F, -1F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 34
		bodyModel[33].setRotationPoint(-85F, 3.5F, 1.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 1, 9, 0F,-0.5F, -0.25F, 0F, -1F, -0.25F, 0F, 1.5F, -0.25F, 0F, 1.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1F, -0.25F, 0F, 1.5F, -0.25F, 0F, 1.25F, -0.25F, 0F); // Box 35
		bodyModel[34].setRotationPoint(-85F, 3.5F, -10.5F);

		bodyModel[35].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 50
		bodyModel[35].setRotationPoint(-92F, 3.75F, 0F);

		bodyModel[36].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 51
		bodyModel[36].setRotationPoint(-92F, 3.75F, 0F);

		bodyModel[37].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 52
		bodyModel[37].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[37].rotateAngleX = 0.87266463F;

		bodyModel[38].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 53
		bodyModel[38].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[38].rotateAngleX = 0.87266463F;

		bodyModel[39].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 95
		bodyModel[39].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[39].rotateAngleX = 1.74532925F;

		bodyModel[40].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 96
		bodyModel[40].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[40].rotateAngleX = 1.74532925F;

		bodyModel[41].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 97
		bodyModel[41].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[41].rotateAngleX = 2.70526034F;

		bodyModel[42].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 98
		bodyModel[42].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[42].rotateAngleX = 2.70526034F;

		bodyModel[43].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 99
		bodyModel[43].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[43].rotateAngleX = 4.45058959F;

		bodyModel[44].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 100
		bodyModel[44].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[44].rotateAngleX = 4.45058959F;

		bodyModel[45].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 101
		bodyModel[45].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[45].rotateAngleX = 3.4906585F;

		bodyModel[46].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 102
		bodyModel[46].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[46].rotateAngleX = 3.4906585F;

		bodyModel[47].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 103
		bodyModel[47].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[47].rotateAngleX = 5.32325422F;

		bodyModel[48].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 104
		bodyModel[48].setRotationPoint(-92F, 3.75F, 0F);
		bodyModel[48].rotateAngleX = 5.32325422F;

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 12, 3, 0F,0F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[49].setRotationPoint(40F, -14.5F, -1.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,0F, 0.25F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0.25F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.75F, -0.5F, 0F, -0.75F, 0F, 0F, 0F); // Box 96
		bodyModel[50].setRotationPoint(48F, -14.5F, -1.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 9, 12, 3, 0F,0F, -0.25F, -0.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, -0.75F, 2.5F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, -0.75F); // Box 97
		bodyModel[51].setRotationPoint(31F, -14.5F, -1.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,-0.75F, -0.25F, 0F, -0.5F, -0.25F, 0F, -3.75F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -0.75F, -0.25F, 0F, -0.5F, -0.25F, 0F, -3.75F, -0.25F, -0.5F, -1F, -0.25F, -0.5F); // Box 99
		bodyModel[52].setRotationPoint(41.5F, -10.5F, 1.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 38, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[53].setRotationPoint(-7F, -6F, -6F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 24, 6, 12, 0F,0F, 0F, 0F, -1F, -1.25F, -3.75F, -1F, -1.25F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, -3.5F, 2.5F, 0F, -3.5F, 0F, 0F, 0F); // Box 56
		bodyModel[54].setRotationPoint(31F, -6F, -6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 12, 6, 12, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[55].setRotationPoint(-19F, -6F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 13, 6, 12, 0F,1F, -2F, -4F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 1F, -2F, -4F, 3.25F, -0.5F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 3.25F, -0.5F, -3.25F); // Box 58
		bodyModel[56].setRotationPoint(-32F, -6F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 1, 6, 0F,-1F, -0.25F, -0.5F, -3.75F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.75F, -0.25F, 0F, -1F, -0.25F, -0.5F, -3.75F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.75F, -0.25F, 0F); // Box 59
		bodyModel[57].setRotationPoint(41.5F, -10.5F, -7.5F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 60
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 61

		bodyDoorOpenModel[0].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 60
		bodyDoorOpenModel[0].setRotationPoint(-41F, -12.25F, -0.5F);

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, 0F, 17, 11, 1, 0F,-4F, 0F, -0.4F, -4.5F, 0F, -0.4F, -4.5F, 0F, -0.4F, -4F, 0F, -0.4F, -4F, -6F, -0.4F, -4.5F, -6F, -0.4F, -4.5F, -6F, -0.4F, -4F, -6F, -0.4F); // Box 61
		bodyDoorOpenModel[1].setRotationPoint(-53.2F, -12F, -0.5F);
	}
}