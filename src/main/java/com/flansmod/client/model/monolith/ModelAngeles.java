//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Angeles
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAngeles extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelAngeles() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[64];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 37
		bodyModel[1] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 38
		bodyModel[2] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 39
		bodyModel[3] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 40
		bodyModel[4] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 41
		bodyModel[5] = new ModelRendererTurbo(this, 332, 89, textureX, textureY); // Box 42
		bodyModel[6] = new ModelRendererTurbo(this, 441, 9, textureX, textureY); // Box 43
		bodyModel[7] = new ModelRendererTurbo(this, 385, 33, textureX, textureY); // Box 44
		bodyModel[8] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 45
		bodyModel[9] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 46
		bodyModel[10] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 47
		bodyModel[11] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 48
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		bodyModel[13] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 50
		bodyModel[14] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 51
		bodyModel[15] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 52
		bodyModel[16] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 53
		bodyModel[17] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 58
		bodyModel[18] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 59
		bodyModel[19] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 60
		bodyModel[20] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 61
		bodyModel[21] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 62
		bodyModel[22] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 63
		bodyModel[23] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 64
		bodyModel[24] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 65
		bodyModel[25] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 66
		bodyModel[26] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 67
		bodyModel[27] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 68
		bodyModel[28] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 69
		bodyModel[29] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 70
		bodyModel[30] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 71
		bodyModel[31] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 72
		bodyModel[32] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 73
		bodyModel[33] = new ModelRendererTurbo(this, 257, 49, textureX, textureY); // Box 74
		bodyModel[34] = new ModelRendererTurbo(this, 305, 49, textureX, textureY); // Box 75
		bodyModel[35] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 76
		bodyModel[36] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 77
		bodyModel[37] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 78
		bodyModel[38] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 79
		bodyModel[39] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 80
		bodyModel[40] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 81
		bodyModel[41] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 82
		bodyModel[42] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 83
		bodyModel[43] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 84
		bodyModel[44] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 85
		bodyModel[45] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 86
		bodyModel[46] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 87
		bodyModel[47] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 88
		bodyModel[48] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 89
		bodyModel[49] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 90
		bodyModel[50] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 91
		bodyModel[51] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 92
		bodyModel[52] = new ModelRendererTurbo(this, 81, 65, textureX, textureY); // Box 93
		bodyModel[53] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 94
		bodyModel[54] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 95
		bodyModel[55] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 96
		bodyModel[56] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 97
		bodyModel[57] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 98
		bodyModel[58] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 99
		bodyModel[59] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 100
		bodyModel[60] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 101
		bodyModel[61] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 102
		bodyModel[62] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 103
		bodyModel[63] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 104

		bodyModel[0].addShapeBox(0F, 0F, 0F, 50, 5, 16, 0F,0F, -0.5F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -0.25F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[0].setRotationPoint(-35F, -7F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 100, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[1].setRotationPoint(-35F, -2F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 100, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F); // Box 39
		bodyModel[2].setRotationPoint(-35F, 4F, -8F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 20, 5, 16, 0F,0F, -2F, -5.5F, 0F, -0.5F, -5.5F, 0F, -0.25F, -5.5F, 0F, -2F, -5.5F, 0F, 1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1.5F); // Box 40
		bodyModel[3].setRotationPoint(-55F, -7F, -8F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 20, 6, 16, 0F,0F, -1F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F); // Box 41
		bodyModel[4].setRotationPoint(-55F, -2F, -8F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 20, 6, 16, 0F,0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -2F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, -5.5F, 0F, -2F, -5.5F); // Box 42
		bodyModel[5].setRotationPoint(-55F, 4F, -8F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 6, 16, 0F,0F, 1F, -4F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 1F, -4F, 0F, -4F, -6.5F, 0F, -2F, -5.5F, 0F, -2F, -5.5F, 0F, -4F, -6.5F); // Box 43
		bodyModel[6].setRotationPoint(-69F, 4F, -8F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 6, 16, 0F,0F, -2F, -4F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -2F, -4F, 0F, -1F, -4F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -1F, -4F); // Box 44
		bodyModel[7].setRotationPoint(-69F, -2F, -8F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 14, 5, 16, 0F,0F, -4.5F, -6.5F, 0F, -2F, -5.5F, 0F, -2F, -5.5F, 0F, -4.5F, -6.5F, 0F, 2F, -4F, 0F, 1F, -1.5F, 0F, 1F, -1.5F, 0F, 2F, -4F); // Box 45
		bodyModel[8].setRotationPoint(-69F, -7F, -8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 15, 3, 8, 0F,0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 46
		bodyModel[9].setRotationPoint(-84F, 0F, -4F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 15, 3, 8, 0F,-6.5F, -2F, -3F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, -6.5F, -2F, -3F, 0F, 0.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -3F); // Box 47
		bodyModel[10].setRotationPoint(-84F, -3F, -4F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 15, 3, 8, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, -6.5F, -2F, -3F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, -6.5F, -2F, -3F); // Box 48
		bodyModel[11].setRotationPoint(-84F, 3F, -4F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 2, 0F,-0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.5F); // Box 49
		bodyModel[12].setRotationPoint(-88F, 0.5F, -1F);

		bodyModel[13].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 50
		bodyModel[13].setRotationPoint(-86.25F, 1.5F, 0F);

		bodyModel[14].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 51
		bodyModel[14].setRotationPoint(-86.25F, 1.5F, 0F);

		bodyModel[15].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 52
		bodyModel[15].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[15].rotateAngleX = 0.87266463F;

		bodyModel[16].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 53
		bodyModel[16].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[16].rotateAngleX = 0.87266463F;

		bodyModel[17].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F,0F, -0.25F, 0F, -3.75F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -3.75F, -0.25F, 0F, 2F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 58
		bodyModel[17].setRotationPoint(-81F, 1.25F, -12F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 1, 11, 0F,0F, -0.25F, 0F, 2F, -0.25F, 0F, -3.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 2F, -0.25F, 0F, -3.75F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 59
		bodyModel[18].setRotationPoint(-81F, 1.25F, 1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,-0.5F, -0.25F, 0F, -1.75F, -0.25F, 0F, 2F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.75F, -0.25F, 0F, 2F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 60
		bodyModel[19].setRotationPoint(-85F, 1.5F, -8F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,-0.25F, -0.25F, 0F, 2F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.25F, -0.25F, 0F, 2F, -0.25F, 0F, -1.75F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 61
		bodyModel[20].setRotationPoint(-85F, 1.5F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 62
		bodyModel[21].setRotationPoint(-81.5F, -10F, -0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 10, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -2.25F, 0F, -0.25F, -2.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 63
		bodyModel[22].setRotationPoint(-81.5F, 0F, -0.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 5, 16, 0F,0F, -0.25F, -5.5F, 0F, -1F, -5.5F, 0F, -1F, -5.5F, 0F, -0.25F, -5.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 64
		bodyModel[23].setRotationPoint(65F, -7F, -8F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 7, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F); // Box 65
		bodyModel[24].setRotationPoint(65F, -2F, -8F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 7, 6, 16, 0F,0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -5.5F, 0F, -0.75F, -5.5F, 0F, -0.75F, -5.5F, 0F, 0F, -5.5F); // Box 66
		bodyModel[25].setRotationPoint(65F, 4F, -8F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 5, 6, 16, 0F,0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, -0.75F, -5.5F, 0F, -1.75F, -5.75F, 0F, -1.75F, -5.75F, 0F, -0.75F, -5.5F); // Box 67
		bodyModel[26].setRotationPoint(72F, 4F, -8F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 5, 6, 16, 0F,0F, 0F, -1F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F); // Box 68
		bodyModel[27].setRotationPoint(72F, -2F, -8F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 5, 16, 0F,0F, -1F, -5.5F, 0F, -2.25F, -5.5F, 0F, -2.25F, -5.5F, 0F, -1F, -5.5F, 0F, 0F, -1F, 0F, 0F, -2.25F, 0F, 0F, -2.25F, 0F, 0F, -1F); // Box 69
		bodyModel[28].setRotationPoint(72F, -7F, -8F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 5, 6, 16, 0F,0F, 0F, -2.25F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, -2.25F, 0F, 0F, -1.75F, 0F, -1F, -3F, 0F, -1F, -3F, 0F, 0F, -1.75F); // Box 70
		bodyModel[29].setRotationPoint(77F, -2F, -8F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 5, 16, 0F,0F, -2.25F, -5.5F, 0F, -3.55F, -5.75F, 0F, -3.55F, -5.75F, 0F, -2.25F, -5.5F, 0F, 0F, -2.25F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, -2.25F); // Box 71
		bodyModel[30].setRotationPoint(77F, -7F, -8F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 6, 16, 0F,0F, 0F, -1.75F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, 0F, -1.75F, 0F, -1.75F, -5.75F, 0F, -3.5F, -6F, 0F, -3.5F, -6F, 0F, -1.75F, -5.75F); // Box 72
		bodyModel[31].setRotationPoint(77F, 4F, -8F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, 0.5F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0.5F, 0F); // Box 73
		bodyModel[32].setRotationPoint(82F, -0.5F, -5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 3, 10, 0F,0F, -0.5F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, -0.5F, 0F, 0F, 1F, -3F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 1F, -3F); // Box 74
		bodyModel[33].setRotationPoint(82F, 2.5F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 2, 10, 0F,0F, 0.95F, -2.75F, 0F, -0.5F, -3.75F, 0F, -0.5F, -3.75F, 0F, 0.95F, -2.75F, 0F, -0.5F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, -0.5F, -0.5F); // Box 75
		bodyModel[34].setRotationPoint(82F, -2.5F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0.25F, 0F, -0.75F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0F, 0.75F); // Box 76
		bodyModel[35].setRotationPoint(85F, -0.5F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, -0.5F, -1.75F, 0F, -2F, -2.25F, 0F, -2F, -2.25F, 0F, -0.5F, -1.75F, 0F, 0F, 0.25F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, 0F, 0.25F); // Box 77
		bodyModel[36].setRotationPoint(85F, -2.5F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 1F, 0.75F, 0F, 0.75F, -1F, 0F, 0.75F, -1F, 0F, 1F, 0.75F, 0F, 0F, -1.75F, 0F, -1.5F, -2.25F, 0F, -1.5F, -2.25F, 0F, 0F, -1.75F); // Box 78
		bodyModel[37].setRotationPoint(85F, 3.5F, -3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0.25F, 0F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, 0.25F, 0F); // Box 79
		bodyModel[38].setRotationPoint(87F, 0.5F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1.25F, -0.65F, -0.5F, -1.5F, -0.65F, -0.5F, -1.5F, 0F, 0F, -1.25F, 0F, -0.25F, 0F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, 0F, -0.25F, 0F); // Box 80
		bodyModel[39].setRotationPoint(87F, -0.5F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.25F, 0F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, 0F, -0.25F, 0F, 0F, 0.5F, -1.25F, -0.65F, -0.5F, -1.5F, -0.65F, -0.5F, -1.5F, 0F, 0.5F, -1.25F); // Box 81
		bodyModel[40].setRotationPoint(87F, 2.5F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 12, 20, 2, 0F,-3F, 0F, 0.25F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.25F, -3F, -10F, 0.25F, -3F, -10F, 0.5F, -3F, -10F, 0.5F, -3F, -10F, 0.25F); // Box 82
		bodyModel[41].setRotationPoint(33F, -16.5F, -1F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 2, 10, 2, 0F,0F, 0F, 0.5F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0.5F); // Box 83
		bodyModel[42].setRotationPoint(42F, -16.5F, -1F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 8, 20, 2, 0F,-2F, -0.5F, -0.5F, -2F, 0F, 0.25F, -2F, 0F, 0.25F, -2F, -0.5F, -0.5F, -2F, -10F, -0.25F, -2F, -10F, 0.25F, -2F, -10F, 0.25F, -2F, -10F, -0.25F); // Box 84
		bodyModel[43].setRotationPoint(30F, -16.5F, -1F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0.25F, -0.75F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.75F, -0.25F, 0.25F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0F, -0.25F); // Box 85
		bodyModel[44].setRotationPoint(31F, -16.5F, -0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 10, 2, 0F,0.5F, -0.25F, 0F, -0.75F, -0.5F, -0.5F, -0.75F, -0.5F, -0.5F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F); // Box 86
		bodyModel[45].setRotationPoint(45F, -16.5F, -1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0.25F, 0F, -0.7F, 0.25F, 0F, -0.7F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.25F); // Box 87
		bodyModel[46].setRotationPoint(36F, -17.5F, -1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, -0.7F, 0.25F, -0.5F, -0.85F, -0.25F, -0.5F, -0.85F, -0.25F, 0F, -0.7F, 0.25F, 0F, 0F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0.5F); // Box 88
		bodyModel[47].setRotationPoint(42F, -17.5F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, -0.85F, -0.25F, 0F, -1.2F, -0.75F, 0F, -1.2F, -0.75F, -0.5F, -0.85F, -0.25F, -0.5F, 0.25F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, -0.5F, 0.25F, 0F); // Box 89
		bodyModel[48].setRotationPoint(44F, -17.5F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -1.1F, -0.6F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, -1.1F, -0.6F, 0F, 0.5F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, -0.5F); // Box 90
		bodyModel[49].setRotationPoint(32F, -17.5F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.2F, -1.4F, -0.75F, 0F, -1.1F, -0.6F, 0F, -1.1F, -0.6F, 0.2F, -1.4F, -0.75F, 0.25F, 0.75F, -0.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0.25F, 0.75F, -0.75F); // Box 91
		bodyModel[50].setRotationPoint(31F, -17.5F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,0.5F, -0.2F, 0F, 0.75F, -0.2F, 0F, -1.75F, -0.4F, 0F, -0.75F, -0.4F, 0F, 0.5F, -0.2F, 0F, 0.75F, -0.2F, 0F, -1.75F, -0.4F, 0F, -0.75F, -0.4F, 0F); // Box 92
		bodyModel[51].setRotationPoint(38F, -12.5F, -0.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 1, 8, 0F,-0.75F, -0.4F, 0F, -1.75F, -0.4F, 0F, 0.75F, -0.2F, 0F, 0.5F, -0.2F, 0F, -0.75F, -0.4F, 0F, -1.75F, -0.4F, 0F, 0.75F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 93
		bodyModel[52].setRotationPoint(38F, -12.5F, -7.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 50, 5, 16, 0F,0F, 0F, -5.5F, 0F, -0.25F, -5.5F, 0F, -0.25F, -5.5F, 0F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[53].setRotationPoint(15F, -7F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 95
		bodyModel[54].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[54].rotateAngleX = 1.74532925F;

		bodyModel[55].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 96
		bodyModel[55].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[55].rotateAngleX = 1.74532925F;

		bodyModel[56].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 97
		bodyModel[56].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[56].rotateAngleX = 2.70526034F;

		bodyModel[57].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 98
		bodyModel[57].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[57].rotateAngleX = 2.70526034F;

		bodyModel[58].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 99
		bodyModel[58].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[58].rotateAngleX = 4.45058959F;

		bodyModel[59].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 100
		bodyModel[59].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[59].rotateAngleX = 4.45058959F;

		bodyModel[60].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 101
		bodyModel[60].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[60].rotateAngleX = 3.4906585F;

		bodyModel[61].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 102
		bodyModel[61].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[61].rotateAngleX = 3.4906585F;

		bodyModel[62].addShapeBox(0F, 0F, -0.5F, 1, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, -0.5F, 1.75F); // Box 103
		bodyModel[62].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[62].rotateAngleX = 5.32325422F;

		bodyModel[63].addShapeBox(0F, 3F, -0.5F, 1, 1, 1, 0F,0F, 0F, -1.5F, -0.75F, 0F, -1F, 0F, 0F, 1.5F, -0.75F, 0.5F, 1.75F, 0F, 0.5F, -1.5F, -1F, 0F, -1.25F, -0.5F, 0F, 1F, -0.5F, 0F, 1.5F); // Box 104
		bodyModel[63].setRotationPoint(-86.25F, 1.5F, 0F);
		bodyModel[63].rotateAngleX = 5.32325422F;
	}
}