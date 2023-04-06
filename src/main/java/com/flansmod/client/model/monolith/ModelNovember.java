//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: November
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelNovember extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelNovember() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[64];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 38
		bodyModel[2] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 39
		bodyModel[3] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 40
		bodyModel[4] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 41
		bodyModel[5] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 41, 25, textureX, textureY); // Box 43
		bodyModel[7] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 44
		bodyModel[8] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 45
		bodyModel[9] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Box 46
		bodyModel[10] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 47
		bodyModel[11] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 48
		bodyModel[12] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 49
		bodyModel[13] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 50
		bodyModel[14] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 51
		bodyModel[15] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 52
		bodyModel[16] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 54
		bodyModel[17] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 55
		bodyModel[18] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 56
		bodyModel[19] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 57
		bodyModel[20] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 58
		bodyModel[21] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 59
		bodyModel[22] = new ModelRendererTurbo(this, 353, 49, textureX, textureY); // Box 60
		bodyModel[23] = new ModelRendererTurbo(this, 401, 49, textureX, textureY); // Box 61
		bodyModel[24] = new ModelRendererTurbo(this, 449, 49, textureX, textureY); // Box 62
		bodyModel[25] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 63
		bodyModel[26] = new ModelRendererTurbo(this, 41, 73, textureX, textureY); // Box 64
		bodyModel[27] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 65
		bodyModel[28] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 66
		bodyModel[29] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 67
		bodyModel[30] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 68
		bodyModel[31] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 69
		bodyModel[32] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 70
		bodyModel[33] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 71
		bodyModel[34] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 72
		bodyModel[35] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 73
		bodyModel[36] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 74
		bodyModel[37] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 75
		bodyModel[38] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 76
		bodyModel[39] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 77
		bodyModel[40] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 19
		bodyModel[41] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		bodyModel[42] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 23
		bodyModel[43] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 24
		bodyModel[44] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 25
		bodyModel[45] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 26
		bodyModel[46] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 27
		bodyModel[47] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 85
		bodyModel[48] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 86
		bodyModel[49] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 87
		bodyModel[50] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 88
		bodyModel[51] = new ModelRendererTurbo(this, 481, 49, textureX, textureY); // Box 89
		bodyModel[52] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 90
		bodyModel[53] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 91
		bodyModel[54] = new ModelRendererTurbo(this, 433, 1, textureX, textureY); // Box 92
		bodyModel[55] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 93
		bodyModel[56] = new ModelRendererTurbo(this, 465, 1, textureX, textureY); // Box 94
		bodyModel[57] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 95
		bodyModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 96
		bodyModel[59] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 97
		bodyModel[60] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 98
		bodyModel[61] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 99
		bodyModel[62] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 100
		bodyModel[63] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 101

		bodyModel[0].addShapeBox(0F, 0F, 0F, 57, 4, 12, 0F,0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[0].setRotationPoint(-33F, -1F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 57, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[1].setRotationPoint(-33F, 3F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 57, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 39
		bodyModel[2].setRotationPoint(-33F, 9F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.25F, -3.5F, 0F, -1.25F, -3.5F, 0F, -1.25F, -3.5F, 0F, -0.25F, -3.5F); // Box 40
		bodyModel[3].setRotationPoint(74F, 9F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 6, 12, 0F,0F, 0F, 0F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 41
		bodyModel[4].setRotationPoint(74F, 3F, -6F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 4, 12, 0F,0F, -0.5F, -3.75F, 0F, -1.5F, -3.75F, 0F, -1.5F, -3.75F, 0F, -0.5F, -3.75F, 0F, 0F, 0F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 0F); // Box 42
		bodyModel[5].setRotationPoint(74F, -1F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 50, 4, 12, 0F,0F, 0F, -3.75F, 0F, -0.5F, -3.75F, 0F, -0.5F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[6].setRotationPoint(24F, -1F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 50, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.25F, -3.5F, 0F, -0.25F, -3.5F, 0F, 0F, -3.5F); // Box 44
		bodyModel[7].setRotationPoint(24F, 9F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 50, 6, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[8].setRotationPoint(24F, 3F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, -1.5F, -3.75F, 0F, -2.75F, -4.25F, 0F, -2.75F, -4.25F, 0F, -1.5F, -3.75F, 0F, 0.5F, -0.75F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 0.5F, -0.75F); // Box 46
		bodyModel[9].setRotationPoint(81F, -1F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, -0.5F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0F, 0F, -0.5F, 0F, -1.25F, -3.5F, 0F, -1.75F, -4F, 0F, -1.75F, -4F, 0F, -1.25F, -3.5F); // Box 47
		bodyModel[10].setRotationPoint(81F, 9F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0F, -0.5F, -0.75F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -0.5F, -0.75F, 0F, 0F, -0.5F, 0F, -0.25F, -1.5F, 0F, -0.25F, -1.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[11].setRotationPoint(81F, 3F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 3, 6, 12, 0F,0F, -1F, -1.5F, 0F, -2.25F, -3.75F, 0F, -2.25F, -3.75F, 0F, -1F, -1.5F, 0F, -0.25F, -1.5F, 0F, -1F, -3.75F, 0F, -1F, -3.75F, 0F, -0.25F, -1.5F); // Box 49
		bodyModel[12].setRotationPoint(85F, 3F, -6F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, -2.75F, -4.25F, 0F, -5.5F, -4.5F, 0F, -5.5F, -4.5F, 0F, -2.75F, -4.25F, 0F, 1F, -1.5F, 0F, 2.25F, -3.75F, 0F, 2.25F, -3.75F, 0F, 1F, -1.5F); // Box 50
		bodyModel[13].setRotationPoint(85F, -1F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 4, 12, 0F,0F, 0.25F, -1.5F, 0F, 1F, -3.75F, 0F, 1F, -3.75F, 0F, 0.25F, -1.5F, 0F, -1.75F, -4F, 0F, -4.25F, -4.75F, 0F, -4.25F, -4.75F, 0F, -1.75F, -4F); // Box 51
		bodyModel[14].setRotationPoint(85F, 9F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,0F, 0F, 0.5F, 1.5F, 0F, -0.75F, 1.5F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1F); // Box 52
		bodyModel[15].setRotationPoint(78F, 11F, -3F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 4, 6, 0F,7.5F, -1F, -2.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 7.5F, -1F, -2.75F, -2F, -0.25F, -1.5F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -2F, -0.25F, -1.5F); // Box 54
		bodyModel[16].setRotationPoint(74F, 11F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 55
		bodyModel[17].setRotationPoint(75.25F, 0.25F, -9F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 1, 7, 0F,0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 56
		bodyModel[18].setRotationPoint(75.25F, 0.25F, 2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 20, 4, 12, 0F,0F, -0.25F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, -0.25F, -3.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 57
		bodyModel[19].setRotationPoint(-53F, -1F, -6F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 20, 6, 12, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F); // Box 58
		bodyModel[20].setRotationPoint(-53F, 3F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 20, 4, 12, 0F,0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -3.75F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, -0.5F, -3.75F); // Box 59
		bodyModel[21].setRotationPoint(-53F, 9F, -6F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -2F, 0F, -0.5F, -3.75F, 0F, -0.5F, -3.75F, 0F, -0.5F, -3.75F, 0F, -0.5F, -3.75F); // Box 60
		bodyModel[22].setRotationPoint(-62F, 9F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 9, 6, 12, 0F,0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -2F); // Box 61
		bodyModel[23].setRotationPoint(-62F, 3F, -6F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 4, 12, 0F,0F, -0.25F, -4F, 0F, -0.25F, -3.75F, 0F, -0.25F, -3.75F, 0F, -0.25F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F); // Box 62
		bodyModel[24].setRotationPoint(-62F, -1F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,0F, -0.25F, -4F, 0F, -0.25F, -3F, 0F, -0.25F, -3F, 0F, -0.25F, -4F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 63
		bodyModel[25].setRotationPoint(-71F, -1F, -5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,0F, 0F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2.25F, 0F, -0.5F, -3.75F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, -0.5F, -3.75F); // Box 64
		bodyModel[26].setRotationPoint(-71F, 9F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 6, 10, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2.25F); // Box 65
		bodyModel[27].setRotationPoint(-71F, 3F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,0F, -0.25F, -4.25F, 0F, -0.25F, -4F, 0F, -0.25F, -4F, 0F, -0.25F, -4.25F, 0F, 0F, -3.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3.25F); // Box 66
		bodyModel[28].setRotationPoint(-78F, -1F, -5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 7, 6, 4, 0F,0F, 0F, -0.25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.25F, 0F, 2.5F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 2.5F, -0.5F); // Box 67
		bodyModel[29].setRotationPoint(-78F, 3F, -2F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 4, 10, 0F,0F, -2.5F, -3.5F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, -2.5F, -3.5F, 0F, -0.5F, -3.75F, 0F, -0.5F, -3.75F, 0F, -0.5F, -3.75F, 0F, -0.5F, -3.75F); // Box 68
		bodyModel[30].setRotationPoint(-78F, 9F, -5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 6, 8, 4, 0F,0F, -0.75F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.75F, -1.25F); // Box 69
		bodyModel[31].setRotationPoint(-84F, 3F, -2F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 4, 4, 0F,-2.5F, 1.25F, -1.5F, 0F, -0.25F, -1.25F, 0F, -0.25F, -1.25F, -2.5F, 1.25F, -1.5F, 0F, 0.75F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0.75F, -1.25F); // Box 70
		bodyModel[32].setRotationPoint(-84F, -1F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 5, 4, 4, 0F,0F, 1.25F, -1.5F, 2.5F, 1.25F, -1.5F, 2.5F, 1.25F, -1.5F, 0F, 1.25F, -1.5F, 0F, 0.75F, -1.5F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.25F, 0F, 0.75F, -1.5F); // Box 71
		bodyModel[33].setRotationPoint(-89F, -1F, -2F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 9, 1, 2, 0F,0F, -0.75F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.75F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, -0.5F); // Box 72
		bodyModel[34].setRotationPoint(-87F, 11F, -1F);

		bodyModel[35].addShapeBox(-5F, 0F, -0.5F, 5, 8, 1, 0F,0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F, 0F, -0.1F, -0.2F); // Box 73
		bodyModel[35].setRotationPoint(-84F, 3.75F, 0F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 74
		bodyModel[36].setRotationPoint(-84.25F, 7.25F, 0F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 75
		bodyModel[37].setRotationPoint(-84.25F, 7.25F, -7F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 15F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 15F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[38].setRotationPoint(-78.25F, 7.25F, -10F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0F, 0F, 0F, 15F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 15F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 77
		bodyModel[39].setRotationPoint(-78.25F, 7.25F, 2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 19
		bodyModel[40].setRotationPoint(-80F, 7.25F, -5F);

		bodyModel[41].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 20
		bodyModel[41].setRotationPoint(-80F, 7.75F, -4.5F);

		bodyModel[42].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 23
		bodyModel[42].setRotationPoint(-80F, 7.75F, -4.5F);
		bodyModel[42].rotateAngleX = 1.04719755F;

		bodyModel[43].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 24
		bodyModel[43].setRotationPoint(-80F, 7.75F, -4.5F);
		bodyModel[43].rotateAngleX = 2.0943951F;

		bodyModel[44].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 25
		bodyModel[44].setRotationPoint(-80F, 7.75F, -4.5F);
		bodyModel[44].rotateAngleX = 3.14159265F;

		bodyModel[45].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 26
		bodyModel[45].setRotationPoint(-80F, 7.75F, -4.5F);
		bodyModel[45].rotateAngleX = 4.1887902F;

		bodyModel[46].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 27
		bodyModel[46].setRotationPoint(-80F, 7.75F, -4.5F);
		bodyModel[46].rotateAngleX = 5.23598776F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 7, 4, 3, 0F,0F, -0.25F, 0F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 85
		bodyModel[47].setRotationPoint(27F, -4.5F, -1.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 1.5F, 0.5F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.25F, 0F, 1.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 86
		bodyModel[48].setRotationPoint(34F, -4.5F, -1.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,0F, 1.5F, 0.25F, -0.5F, 1.5F, -0.5F, -0.5F, 1.5F, -0.5F, 0F, 1.5F, 0.25F, 0F, 0F, 0.5F, 0.75F, 0F, -0.25F, 0.75F, 0F, -0.25F, 0F, 0F, 0.5F); // Box 87
		bodyModel[49].setRotationPoint(39F, -4.5F, -1.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 3, 2, 0F,0F, -2.75F, -0.75F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, -2.75F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.75F); // Box 88
		bodyModel[50].setRotationPoint(21F, -3.5F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, -0.75F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, -0.5F, 0F, 0.25F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, 0.25F, 0F); // Box 89
		bodyModel[51].setRotationPoint(27F, -5.5F, -1.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.75F, -2.5F, -0.75F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.75F, -2.5F, -0.75F, 0F, 2.75F, -0.75F, 0F, -0.75F, 0.5F, 0F, -0.75F, 0.5F, 0F, 2.75F, -0.75F); // Box 90
		bodyModel[52].setRotationPoint(21F, -4.5F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 1F, 0F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 1F, 0F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.5F); // Box 91
		bodyModel[53].setRotationPoint(34F, -5.5F, -1.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0F, 0F, -0.25F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0F, 0F, -0.25F, 0F, -0.5F, 0.25F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, -0.5F, 0.25F); // Box 92
		bodyModel[54].setRotationPoint(39F, -6.5F, -1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0.5F, 1.5F, -0.5F, -1F, 1.5F, -1.25F, -1F, 1.5F, -1.25F, 0.5F, 1.5F, -0.5F, -0.75F, 0F, -0.25F, 0.5F, 0F, -1.25F, 0.5F, 0F, -1.25F, -0.75F, 0F, -0.25F); // Box 93
		bodyModel[55].setRotationPoint(41F, -4.5F, -1.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.25F, -0.5F, -0.75F, -0.25F, -0.75F, -0.75F, -0.25F, -0.75F, 0F, -0.25F, -0.5F, 0F, -0.5F, 0F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, -0.75F, 0F, -0.5F, 0F); // Box 94
		bodyModel[56].setRotationPoint(40.5F, -6.5F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 95
		bodyModel[57].setRotationPoint(-80F, 7.25F, 4F);

		bodyModel[58].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[58].setRotationPoint(-80F, 7.75F, 4.5F);

		bodyModel[59].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[59].setRotationPoint(-80F, 7.75F, 4.5F);
		bodyModel[59].rotateAngleX = 1.04719755F;

		bodyModel[60].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[60].setRotationPoint(-80F, 7.75F, 4.5F);
		bodyModel[60].rotateAngleX = 2.0943951F;

		bodyModel[61].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[61].setRotationPoint(-80F, 7.75F, 4.5F);
		bodyModel[61].rotateAngleX = 3.14159265F;

		bodyModel[62].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[62].setRotationPoint(-80F, 7.75F, 4.5F);
		bodyModel[62].rotateAngleX = 4.1887902F;

		bodyModel[63].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[63].setRotationPoint(-80F, 7.75F, 4.5F);
		bodyModel[63].rotateAngleX = 5.23598776F;
	}
}