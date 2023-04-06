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

public class ModelAdmiralty extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 64;

	public ModelAdmiralty() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[69];

		initbodyModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[2] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 5
		bodyModel[3] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 6
		bodyModel[4] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 8
		bodyModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 14
		bodyModel[8] = new ModelRendererTurbo(this, 273, 17, textureX, textureY); // Box 15
		bodyModel[9] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 22
		bodyModel[11] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 23
		bodyModel[12] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 24
		bodyModel[13] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 39
		bodyModel[14] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 40
		bodyModel[15] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 41
		bodyModel[16] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 42
		bodyModel[17] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 43
		bodyModel[18] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 44
		bodyModel[19] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 48
		bodyModel[20] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 49
		bodyModel[21] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 50
		bodyModel[22] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 51
		bodyModel[23] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 52
		bodyModel[24] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 53
		bodyModel[25] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 55
		bodyModel[26] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 56
		bodyModel[27] = new ModelRendererTurbo(this, 153, 9, textureX, textureY); // Box 57
		bodyModel[28] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 58
		bodyModel[29] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 59
		bodyModel[30] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 60
		bodyModel[31] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 61
		bodyModel[32] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 62
		bodyModel[33] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 63
		bodyModel[34] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 64
		bodyModel[35] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 65
		bodyModel[36] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 66
		bodyModel[37] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 67
		bodyModel[38] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 68
		bodyModel[39] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 69
		bodyModel[40] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 70
		bodyModel[41] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 71
		bodyModel[42] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 72
		bodyModel[43] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 73
		bodyModel[44] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 74
		bodyModel[45] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 75
		bodyModel[46] = new ModelRendererTurbo(this, 177, 25, textureX, textureY); // Box 76
		bodyModel[47] = new ModelRendererTurbo(this, 409, 25, textureX, textureY); // Box 77
		bodyModel[48] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 78
		bodyModel[49] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 79
		bodyModel[50] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 80
		bodyModel[51] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 81
		bodyModel[52] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 82
		bodyModel[53] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 83
		bodyModel[54] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 84
		bodyModel[55] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 85
		bodyModel[56] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 86
		bodyModel[57] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 87
		bodyModel[58] = new ModelRendererTurbo(this, 273, 9, textureX, textureY); // Box 88
		bodyModel[59] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 89
		bodyModel[60] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 90
		bodyModel[61] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 91
		bodyModel[62] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 92
		bodyModel[63] = new ModelRendererTurbo(this, 257, 25, textureX, textureY); // Box 93
		bodyModel[64] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 94
		bodyModel[65] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 95
		bodyModel[66] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 96
		bodyModel[67] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 97
		bodyModel[68] = new ModelRendererTurbo(this, 289, 25, textureX, textureY); // Box 98

		bodyModel[0].addShapeBox(0F, 0F, 0F, 9, 4, 14, 0F,35F, 0.2F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0.2F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-8F, -1F, -7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 43, 5, 14, 0F,-0.5F, -1F, 0F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -4.5F, 0F, -1F, -4.5F, 0F, 0F, 0F); // Box 4
		bodyModel[1].setRotationPoint(36F, -6F, -7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 33, 4, 14, 0F,0F, 0F, 0F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 5
		bodyModel[2].setRotationPoint(36F, -1F, -7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 42, 1, 14, 0F,-0.5F, 0F, -0.5F, -22F, 0.5F, -1.5F, -22F, 0.5F, -1.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, -1.5F, -4.5F, 0F, -1.5F, -4.5F, 0.5F, 0F, 0F); // Box 6
		bodyModel[3].setRotationPoint(37F, -6F, -7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 13, 4, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 8
		bodyModel[4].setRotationPoint(25F, -13.5F, -2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 15, 4, 12, 0F,-1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, -5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -5F); // Box 10
		bodyModel[5].setRotationPoint(-78F, 0F, -6F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 14, 1, 12, 0F,0.5F, 0.5F, -4F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.5F, 0.5F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 11
		bodyModel[6].setRotationPoint(-77F, -1F, -6F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 33, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		bodyModel[7].setRotationPoint(34F, -35F, -0.5F);
		bodyModel[7].rotateAngleZ = 0.08726646F;

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 15
		bodyModel[8].setRotationPoint(-46F, -17F, -0.5F);
		bodyModel[8].rotateAngleZ = 0.12217305F;

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F, -0.35F, -0.3F, -0.35F); // Box 18
		bodyModel[9].setRotationPoint(-46F, -16F, -3F);

		bodyModel[10].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 22
		bodyModel[10].setRotationPoint(-17F, -4F, 0F);

		bodyModel[11].addShapeBox(-5.5F, -0.7F, -1.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 23
		bodyModel[11].setRotationPoint(-17F, -4F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[12].setRotationPoint(-19.5F, -2.5F, -1.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[13].setRotationPoint(-59.5F, -4F, -0.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 40
		bodyModel[14].setRotationPoint(-60.5F, -4F, -0.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 41
		bodyModel[15].setRotationPoint(-65F, -4F, -0.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 42
		bodyModel[16].setRotationPoint(40.5F, -7.9F, -5.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[17].setRotationPoint(39.5F, -7.5F, -5.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 44
		bodyModel[18].setRotationPoint(38.5F, -7.5F, -5.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 11, 5, 14, 0F,4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, -1.5F, -3F, -0.5F, 0.5F, -2F, -0.5F, 0.5F, -2F, 4.5F, -1.5F, -3F); // Box 48
		bodyModel[19].setRotationPoint(-58.5F, 3F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F,2F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -1F, -5F, -4F, -2.8F, -4F, 0F, -1.5F, -2F, 0F, -1.5F, -2F, -4F, -2.8F, -4F); // Box 49
		bodyModel[20].setRotationPoint(-75F, 3F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 33, 5, 14, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -2F); // Box 50
		bodyModel[21].setRotationPoint(36F, 3F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 9, 5, 14, 0F,35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 40F, 0.5F, -2F, 35F, 0F, -2F, 35F, 0F, -2F, 40F, 0.5F, -2F); // Box 51
		bodyModel[22].setRotationPoint(-8F, 3F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 6, 12, 0F,0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F, 0F, -1F, -3.5F, -2F, -2.5F, -5.5F, -2F, -2.5F, -5.5F, 0F, -1F, -3.5F); // Box 52
		bodyModel[23].setRotationPoint(69F, 3F, -6F);

		bodyModel[24].addShapeBox(-10.5F, -3.5F, 0F, 14, 13, 1, 0F,-3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F, -3.35F, -4F, -0.45F); // Box 53
		bodyModel[24].setRotationPoint(-78.8F, -10F, -0.5F);
		bodyModel[24].rotateAngleZ = 0.17453293F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,8F, 0.4F, -1F, 8F, 0.2F, 0F, 8F, 0.2F, 0F, 8F, 0.4F, -1F, 8F, 0F, -1F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, -1F); // Box 55
		bodyModel[25].setRotationPoint(-55F, -1F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 10, 5, 12, 0F,0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -3F); // Box 56
		bodyModel[26].setRotationPoint(69F, -2F, -6F);

		bodyModel[27].addShapeBox(-5.5F, -0.7F, 0.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 57
		bodyModel[27].setRotationPoint(-17F, -4F, 0F);

		bodyModel[28].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 58
		bodyModel[28].setRotationPoint(-17F, -4F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[29].setRotationPoint(-18.5F, -3.5F, -0.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 60
		bodyModel[30].setRotationPoint(40.5F, -7.9F, 4.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[31].setRotationPoint(39.5F, -7.5F, 4.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F); // Box 62
		bodyModel[32].setRotationPoint(38.5F, -7.5F, 4.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 63
		bodyModel[33].setRotationPoint(50.5F, -8.5F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[34].setRotationPoint(51.5F, -8.5F, -0.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 65
		bodyModel[35].setRotationPoint(53F, -8.5F, -0.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 13, 4, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 66
		bodyModel[36].setRotationPoint(14F, -13.5F, -2F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 3, 13, 4, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F); // Box 67
		bodyModel[37].setRotationPoint(-1F, -13.5F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F, -0.2F, 0.2F, 0.2F); // Box 68
		bodyModel[38].setRotationPoint(7.5F, -4.5F, -0.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 69
		bodyModel[39].setRotationPoint(10F, -4.5F, -0.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[40].setRotationPoint(8.5F, -4.5F, -0.5F);

		bodyModel[41].addShapeBox(-5.5F, -0.7F, -1.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 71
		bodyModel[41].setRotationPoint(-35F, -4F, 0F);

		bodyModel[42].addShapeBox(-5.5F, -0.7F, 0.5F, 10, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 72
		bodyModel[42].setRotationPoint(-35F, -4F, 0F);

		bodyModel[43].addShapeBox(4.5F, -0.7F, 0.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 73
		bodyModel[43].setRotationPoint(-35F, -4F, 0F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[44].setRotationPoint(-36.5F, -3.5F, -0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[45].setRotationPoint(-37.5F, -2.5F, -1.5F);

		bodyModel[46].addShapeBox(4.5F, -0.7F, -1.5F, 3, 1, 1, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.2F, 0F); // Box 76
		bodyModel[46].setRotationPoint(-35F, -4F, 0F);

		bodyModel[47].addShapeBox(-0.5F, -3.5F, 0F, 1, 19, 1, 0F,-0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F, -0.4F, -4F, -0.4F); // Box 77
		bodyModel[47].setRotationPoint(-78.8F, -10F, -0.5F);
		bodyModel[47].rotateAngleZ = 0.20943951F;

		bodyModel[48].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[48].setRotationPoint(4.5F, -2F, -1.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[49].setRotationPoint(4.5F, -2F, -4.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 80
		bodyModel[50].setRotationPoint(4.5F, -2F, 1.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[51].setRotationPoint(38.5F, -10F, -1.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[52].setRotationPoint(38F, -11F, -2.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 83
		bodyModel[53].setRotationPoint(42F, -13F, -2.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, -1.5F, 0F, -0.35F, -1.5F, 0F, -0.35F, 0F); // Box 84
		bodyModel[54].setRotationPoint(42F, -14F, -2.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,-0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[55].setRotationPoint(41F, -12F, -2.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F); // Box 86
		bodyModel[56].setRotationPoint(38.7F, -16F, -0.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F, -0.3F, 0.1F, -0.3F); // Box 87
		bodyModel[57].setRotationPoint(38.7F, -15F, -0.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, -0.25F, 0.1F, -0.25F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 88
		bodyModel[58].setRotationPoint(38.7F, -14F, -0.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 89
		bodyModel[59].setRotationPoint(41.75F, -13.5F, -2.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 90
		bodyModel[60].setRotationPoint(41.75F, -13.5F, 1.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 91
		bodyModel[61].setRotationPoint(45.25F, -13.5F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 92
		bodyModel[62].setRotationPoint(45.25F, -13.5F, -1F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 93
		bodyModel[63].setRotationPoint(43.5F, -13.5F, -1.8F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 94
		bodyModel[64].setRotationPoint(43.5F, -13.5F, 0.8F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 3, 0F,0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F); // Box 95
		bodyModel[65].setRotationPoint(43.5F, -10F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F); // Box 96
		bodyModel[66].setRotationPoint(-76F, 4F, -0.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[67].setRotationPoint(-26.5F, -7.5F, -1F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[68].setRotationPoint(-26F, -8F, -0.5F);
	}
}