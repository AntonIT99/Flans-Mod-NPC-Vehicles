//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2019 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Bireme
// Model Creator: 
// Created on: 29.03.2019 - 14:53:14
// Last changed on: 29.03.2019 - 14:53:14

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelBireme extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelBireme() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[108];
		turretModel = new ModelRendererTurbo[4];
		leftFrontWheelModel = new ModelRendererTurbo[48];
		rightFrontWheelModel = new ModelRendererTurbo[48];

		initbodyModel_1();
		initturretModel_1();
		initleftFrontWheelModel_1();
		initrightFrontWheelModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 305, 9, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 281, 9, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 401, 9, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 465, 9, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 497, 17, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 32
		bodyModel[29] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 33
		bodyModel[30] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 34
		bodyModel[31] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 35
		bodyModel[32] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 36
		bodyModel[33] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 37
		bodyModel[34] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 38
		bodyModel[35] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 39
		bodyModel[36] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 40
		bodyModel[37] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 41
		bodyModel[38] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 42
		bodyModel[39] = new ModelRendererTurbo(this, 97, 25, textureX, textureY); // Box 43
		bodyModel[40] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 44
		bodyModel[41] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 45
		bodyModel[42] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 46
		bodyModel[43] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 47
		bodyModel[44] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 48
		bodyModel[45] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 49
		bodyModel[46] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 50
		bodyModel[47] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 51
		bodyModel[48] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 52
		bodyModel[49] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 53
		bodyModel[50] = new ModelRendererTurbo(this, 281, 25, textureX, textureY); // Box 54
		bodyModel[51] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 55
		bodyModel[52] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 57
		bodyModel[53] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 58
		bodyModel[54] = new ModelRendererTurbo(this, 257, 41, textureX, textureY); // Box 59
		bodyModel[55] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 60
		bodyModel[56] = new ModelRendererTurbo(this, 385, 41, textureX, textureY); // Box 61
		bodyModel[57] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 62
		bodyModel[58] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 63
		bodyModel[59] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 64
		bodyModel[60] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 65
		bodyModel[61] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 66
		bodyModel[62] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 67
		bodyModel[63] = new ModelRendererTurbo(this, 169, 73, textureX, textureY); // Box 68
		bodyModel[64] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 69
		bodyModel[65] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 70
		bodyModel[66] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 71
		bodyModel[67] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 72
		bodyModel[68] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 73
		bodyModel[69] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 74
		bodyModel[70] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 75
		bodyModel[71] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 76
		bodyModel[72] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 77
		bodyModel[73] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 78
		bodyModel[74] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 79
		bodyModel[75] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 80
		bodyModel[76] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 81
		bodyModel[77] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 82
		bodyModel[78] = new ModelRendererTurbo(this, 385, 89, textureX, textureY); // Box 83
		bodyModel[79] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 84
		bodyModel[80] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 85
		bodyModel[81] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 86
		bodyModel[82] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 87
		bodyModel[83] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 88
		bodyModel[84] = new ModelRendererTurbo(this, 41, 97, textureX, textureY); // Box 89
		bodyModel[85] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 90
		bodyModel[86] = new ModelRendererTurbo(this, 25, 105, textureX, textureY); // Box 91
		bodyModel[87] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 92
		bodyModel[88] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 93
		bodyModel[89] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 94
		bodyModel[90] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 95
		bodyModel[91] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 96
		bodyModel[92] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 97
		bodyModel[93] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 98
		bodyModel[94] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 99
		bodyModel[95] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 100
		bodyModel[96] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 101
		bodyModel[97] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 102
		bodyModel[98] = new ModelRendererTurbo(this, 73, 121, textureX, textureY); // Box 103
		bodyModel[99] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 104
		bodyModel[100] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 105
		bodyModel[101] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 106
		bodyModel[102] = new ModelRendererTurbo(this, 497, 113, textureX, textureY); // Box 107
		bodyModel[103] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 108
		bodyModel[104] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 109
		bodyModel[105] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 110
		bodyModel[106] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 206
		bodyModel[107] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 207

		bodyModel[0].addShapeBox(0F, 0F, 0F, 16, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(55F, 9F, -1.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 3, 3, 0F,0F, 0F, 1F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 4.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.25F); // Box 1
		bodyModel[1].setRotationPoint(55F, 5F, -1.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 2
		bodyModel[2].setRotationPoint(55F, 1F, -1.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(55F, -3F, -1.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 8, 3, 0F,-9F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(55F, -11F, -1.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(63F, -12F, -1.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(63F, -13F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(63F, -14F, -1.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 146, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[8].setRotationPoint(-91F, 9F, -1.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 65, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 9
		bodyModel[9].setRotationPoint(-48F, 14F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 113, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-76F, 9F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 2, 26, 0F,0F, 0F, -6F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, -1.9F, -11.5F, 0F, -1.9F, -11.5F, 0F, 0F, -6F); // Box 12
		bodyModel[11].setRotationPoint(55F, 12F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 15, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -0.5F, -11.5F, 0F, -0.5F, -11.5F, 0F, 0F, -8F); // Box 13
		bodyModel[12].setRotationPoint(17F, 14F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 22, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, 0F, 0F, -0.5F, -11.5F, 0F, -1.9F, -11.5F, 0F, -1.9F, -11.5F, 0F, -0.5F, -11.5F); // Box 14
		bodyModel[13].setRotationPoint(32F, 14F, -13F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 4, 3, 0F,0F, 2F, 2F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 2F, 2F, 0F, 0F, 2F, 0F, 4F, 8F, 0F, 4F, 8F, 0F, 0F, 2F); // Box 15
		bodyModel[14].setRotationPoint(-105F, 4F, -1.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 9, 5, 3, 0F,0F, 10F, 0F, 0F, 2F, 2F, 0F, 2F, 2F, 0F, 10F, 0F, 0F, -8F, 0F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -8F, 0F); // Box 16
		bodyModel[15].setRotationPoint(-114F, 4F, -1.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -3F, 0F); // Box 17
		bodyModel[16].setRotationPoint(-117F, -6F, -1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 18
		bodyModel[17].setRotationPoint(-117F, -10F, -1.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,-1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-117.5F, -14F, -1.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 4, 3, 0F,-1.5F, 0F, 0F, 2F, -2.5F, 0F, 2F, -2.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(-116F, -18F, -1.5F);

		bodyModel[20].addShapeBox(0F, -4F, 0F, 2, 8, 3, 0F,-9F, -0.5F, 0F, 8F, -1.5F, 0F, 8F, -1.5F, 0F, -9F, -0.5F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[20].setRotationPoint(-114.5F, -22F, -1.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,1F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 2F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, 2F, 0F, 0F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-112F, -17.5F, -0.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,1F, -1F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -0.5F, -2F, 0F, 0F, 0F); // Box 23
		bodyModel[22].setRotationPoint(-112F, -17.5F, -1.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, 2F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, -2F); // Box 24
		bodyModel[23].setRotationPoint(-109F, -17.5F, 3.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 2, 2, 0F,0F, 0F, -2F, 1F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 2F, 0F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 2F); // Box 25
		bodyModel[24].setRotationPoint(-109F, -17.5F, -5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,-1F, -1F, 1F, 1F, -1F, 3F, 1F, -1F, 0F, -1F, -1F, -2F, 0F, -0.5F, 1F, 0F, 1F, 3F, 0F, 1F, 0F, 0F, -0.5F, -2F); // Box 26
		bodyModel[25].setRotationPoint(-108F, -17.5F, -2.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 71, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[26].setRotationPoint(0F, -62F, -1F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 27
		bodyModel[27].setRotationPoint(0F, -61F, -1F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, -2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Box 32
		bodyModel[28].setRotationPoint(50F, -3F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, -3.5F, 5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -3.5F, 5F, 0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F); // Box 33
		bodyModel[29].setRotationPoint(37F, -3F, -1.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 34
		bodyModel[30].setRotationPoint(50F, 1F, -1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 2F, 0F, 0F, 7.1F, 0F, 0F, 5.35F, 0F, 0F, 5.35F, 0F, 0F, 7.1F); // Box 35
		bodyModel[31].setRotationPoint(50F, 5F, -1.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 34, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.5F, 0F, 0F, -11.5F, 0F, 0F, 0F); // Box 36
		bodyModel[32].setRotationPoint(37F, 9F, -13F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 1, 11, 0F,0F, 0F, 0.25F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0.25F, 0F, 0F, 1.35F, 0F, 0F, -1.95F, 0F, 0F, -1.95F, 0F, 0F, 1.35F); // Box 37
		bodyModel[33].setRotationPoint(55F, 8F, -5.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, -0.99F, 0F, 0F, -0.99F, 0F, 0F, 0F, 0F, 0F, 0F, 2.05F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.05F); // Box 38
		bodyModel[34].setRotationPoint(65F, 8F, -1.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 128, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[35].setRotationPoint(-91F, 0.5F, -6.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,1F, 0F, 3F, -1F, 0.5F, 3F, -1F, 0.5F, -4F, 1F, 0F, -4F, 1F, 3F, 1F, -2F, 3F, 0F, -2F, 4F, -0.5F, 2F, 3F, -2F); // Box 40
		bodyModel[36].setRotationPoint(-106F, -23.5F, 3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,1F, 0F, -4F, -1F, 0.5F, -4F, -1F, 0.5F, 3F, 1F, 0F, 3F, 2F, 3F, -2F, -2F, 4F, -0.5F, -2F, 3F, 0F, 1F, 3F, 1F); // Box 41
		bodyModel[37].setRotationPoint(-106F, -23.5F, -5.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 42
		bodyModel[38].setRotationPoint(-99F, 0.5F, -3.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 6, 1, 7, 0F,0F, 0.5F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, -2F); // Box 43
		bodyModel[39].setRotationPoint(-105F, -0.5F, -3.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.5F, -1F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, -1F, 0F, 1F, -1F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 1F, -1F); // Box 44
		bodyModel[40].setRotationPoint(-113F, -5.5F, -1.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 15, 8, 19, 0F,0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 3.5F, 0F, 2F, 3.5F, 0F, 0F, 0F); // Box 45
		bodyModel[41].setRotationPoint(-91F, 4F, -9.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F, -0.2F, 0.3F, 0F); // Box 46
		bodyModel[42].setRotationPoint(70.8F, 9F, -1.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 47
		bodyModel[43].setRotationPoint(70.8F, 9F, -0.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 48
		bodyModel[44].setRotationPoint(70.8F, 10F, -0.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 49
		bodyModel[45].setRotationPoint(70.8F, 11F, -0.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.1F, -0.1F); // Box 50
		bodyModel[46].setRotationPoint(74.4F, 9F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.1F, -0.1F); // Box 51
		bodyModel[47].setRotationPoint(74.4F, 10F, -0.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.1F, -0.1F); // Box 52
		bodyModel[48].setRotationPoint(74.4F, 11F, -0.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 18, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 53
		bodyModel[49].setRotationPoint(37F, 12F, -13F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 13, 4, 3, 0F,0F, 0F, 5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 5F, 0F, 0F, 8F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 8F); // Box 54
		bodyModel[50].setRotationPoint(37F, 1F, -1.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 13, 4, 7, 0F,0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 9.5F, 0F, 0F, 5.1F, 0F, 0F, 5.1F, 0F, 0F, 9.5F); // Box 55
		bodyModel[51].setRotationPoint(37F, 5F, -3.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 14, 3, 40, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 57
		bodyModel[52].setRotationPoint(-90F, 5F, -20F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[53].setRotationPoint(-75.5F, 0.8F, -13F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[54].setRotationPoint(-75.5F, 0.8F, 6F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[55].setRotationPoint(-75.5F, 0.8F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[56].setRotationPoint(-66F, 0.8F, -6F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[57].setRotationPoint(-66F, 0.8F, 6F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[58].setRotationPoint(-66F, 0.8F, -13F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[59].setRotationPoint(-57F, 0.8F, -6F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[60].setRotationPoint(-57F, 0.8F, 6F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[61].setRotationPoint(-57F, 0.8F, -13F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[62].setRotationPoint(-47.5F, 0.8F, -6F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[63].setRotationPoint(-47.5F, 0.8F, 6F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[64].setRotationPoint(-47.5F, 0.8F, -13F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[65].setRotationPoint(-38.5F, 0.8F, -6F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[66].setRotationPoint(-38.5F, 0.8F, 6F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[67].setRotationPoint(-38.5F, 0.8F, -13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[68].setRotationPoint(-29F, 0.8F, -6F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[69].setRotationPoint(-29F, 0.8F, 6F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[70].setRotationPoint(-29F, 0.8F, -13F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[71].setRotationPoint(-20F, 0.8F, -6F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[72].setRotationPoint(-20F, 0.8F, 6F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[73].setRotationPoint(-20F, 0.8F, -13F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[74].setRotationPoint(-10.5F, 0.8F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[75].setRotationPoint(-10.5F, 0.8F, 6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[76].setRotationPoint(-10.5F, 0.8F, -13F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[77].setRotationPoint(-1.5F, 0.8F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[78].setRotationPoint(-1.5F, 0.8F, 6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[79].setRotationPoint(-1.5F, 0.8F, -13F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[80].setRotationPoint(8F, 0.8F, -6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[81].setRotationPoint(8F, 0.8F, 6F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[82].setRotationPoint(8F, 0.8F, -13F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[83].setRotationPoint(17F, 0.8F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[84].setRotationPoint(17F, 0.8F, 6F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[85].setRotationPoint(17F, 0.8F, -13F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[86].setRotationPoint(26.5F, 0.8F, -6F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[87].setRotationPoint(26.5F, 0.8F, 6F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[88].setRotationPoint(26.5F, 0.8F, -13F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[89].setRotationPoint(36F, 0.8F, -6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[90].setRotationPoint(36F, 0.8F, 6F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 5, 7, 0F,0F, -1.5F, -3F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[91].setRotationPoint(36F, 0.8F, -13F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 113, 4, 8, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 97
		bodyModel[92].setRotationPoint(-76F, 5F, 12F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[93].setRotationPoint(-76F, 5F, -12F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[94].setRotationPoint(36F, 5F, -12F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 113, 4, 8, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 100
		bodyModel[95].setRotationPoint(-76F, 5F, -20F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 12, 2, 26, 0F,0F, 0F, -11.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11.5F, 0F, -1.9F, -11.5F, 0F, -0.5F, -11.5F, 0F, -0.5F, -11.5F, 0F, -1.9F, -11.5F); // Box 101
		bodyModel[96].setRotationPoint(-75F, 14F, -13F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 15, 2, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -11.5F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -0.5F, -11.5F); // Box 102
		bodyModel[97].setRotationPoint(-63F, 14F, -13F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 11, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[98].setRotationPoint(-99F, -0.5F, -2.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[99].setRotationPoint(-99F, -5.5F, -2.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[100].setRotationPoint(-98F, -4.5F, -3.5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 6, 4, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[101].setRotationPoint(-98F, -4.5F, 2.5F);

		bodyModel[102].addShapeBox(-0.5F, -16F, 0F, 1, 32, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[102].setRotationPoint(-87F, 7F, -14F);
		bodyModel[102].rotateAngleZ = -0.54105207F;

		bodyModel[103].addShapeBox(-1.5F, 6F, 0F, 3, 12, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F, 2F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 2F, -0.2F); // Box 108
		bodyModel[103].setRotationPoint(-87F, 7F, -14F);
		bodyModel[103].rotateAngleZ = -0.54105207F;

		bodyModel[104].addShapeBox(-0.5F, -16F, 0F, 1, 32, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[104].setRotationPoint(-87F, 7F, 13F);
		bodyModel[104].rotateAngleZ = -0.54105207F;

		bodyModel[105].addShapeBox(-1.5F, 6F, 0F, 3, 12, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F, 2F, -0.2F, 1F, 0F, -0.2F, 1F, 0F, -0.2F, 2F, 2F, -0.2F); // Box 110
		bodyModel[105].setRotationPoint(-87F, 7F, 13F);
		bodyModel[105].rotateAngleZ = -0.54105207F;

		bodyModel[106].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, 0F, -0.2F, -8F, 0F, -1.2F, -8F, 0F, 1F, 0F, 0F, 0F, 0F, -5F, 0.8F, -8F, -5F, -0.8F, -8F, -5F, 1F, 0F, -5F, 0F); // Box 206
		bodyModel[106].setRotationPoint(50F, 0F, -2.8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 16, 10, 1, 0F,0F, 0F, 0F, -8F, 0F, 1F, -8F, 0F, -1.2F, 0F, 0F, -0.2F, 0F, -5F, 0F, -8F, -5F, 1F, -8F, -5F, -0.8F, 0F, -5F, 0.8F); // Box 207
		bodyModel[107].setRotationPoint(50F, 0F, 1.85F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 217, 41, textureX, textureY); // Box 28
		turretModel[1] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 29
		turretModel[2] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 30
		turretModel[3] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 31

		turretModel[0].addShapeBox(2F, 0F, -61.5F, 1, 1, 63, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 28
		turretModel[0].setRotationPoint(0F, -58F, 0F);

		turretModel[1].addShapeBox(2F, 0F, -1.3F, 1, 1, 63, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F); // Box 29
		turretModel[1].setRotationPoint(0F, -57F, 0F);

		turretModel[2].addShapeBox(2.2F, 0F, -62.3F, 1, 41, 63, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 5.7F, 0F, -0.3F, 5.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 30
		turretModel[2].setRotationPoint(0F, -57F, 0F);

		turretModel[3].addShapeBox(2F, 0F, -1.5F, 1, 41, 63, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 5.7F, 0F, -0.3F, 5.7F, 0F); // Box 31
		turretModel[3].setRotationPoint(0F, -57F, 0F);
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 111
		leftFrontWheelModel[1] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 112
		leftFrontWheelModel[2] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 113
		leftFrontWheelModel[3] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 114
		leftFrontWheelModel[4] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 115
		leftFrontWheelModel[5] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 116
		leftFrontWheelModel[6] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 117
		leftFrontWheelModel[7] = new ModelRendererTurbo(this, 273, 129, textureX, textureY); // Box 118
		leftFrontWheelModel[8] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 119
		leftFrontWheelModel[9] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 120
		leftFrontWheelModel[10] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 121
		leftFrontWheelModel[11] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 122
		leftFrontWheelModel[12] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 123
		leftFrontWheelModel[13] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 124
		leftFrontWheelModel[14] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 125
		leftFrontWheelModel[15] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 126
		leftFrontWheelModel[16] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 127
		leftFrontWheelModel[17] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 128
		leftFrontWheelModel[18] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 129
		leftFrontWheelModel[19] = new ModelRendererTurbo(this, 369, 193, textureX, textureY); // Box 130
		leftFrontWheelModel[20] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 131
		leftFrontWheelModel[21] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Box 132
		leftFrontWheelModel[22] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 133
		leftFrontWheelModel[23] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 134
		leftFrontWheelModel[24] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box 135
		leftFrontWheelModel[25] = new ModelRendererTurbo(this, 57, 265, textureX, textureY); // Box 136
		leftFrontWheelModel[26] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 137
		leftFrontWheelModel[27] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 138
		leftFrontWheelModel[28] = new ModelRendererTurbo(this, 169, 265, textureX, textureY); // Box 139
		leftFrontWheelModel[29] = new ModelRendererTurbo(this, 225, 305, textureX, textureY); // Box 140
		leftFrontWheelModel[30] = new ModelRendererTurbo(this, 113, 201, textureX, textureY); // Box 141
		leftFrontWheelModel[31] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 142
		leftFrontWheelModel[32] = new ModelRendererTurbo(this, 337, 305, textureX, textureY); // Box 143
		leftFrontWheelModel[33] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 144
		leftFrontWheelModel[34] = new ModelRendererTurbo(this, 481, 201, textureX, textureY); // Box 145
		leftFrontWheelModel[35] = new ModelRendererTurbo(this, 313, 209, textureX, textureY); // Box 146
		leftFrontWheelModel[36] = new ModelRendererTurbo(this, 113, 313, textureX, textureY); // Box 147
		leftFrontWheelModel[37] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Box 148
		leftFrontWheelModel[38] = new ModelRendererTurbo(this, 369, 209, textureX, textureY); // Box 149
		leftFrontWheelModel[39] = new ModelRendererTurbo(this, 425, 209, textureX, textureY); // Box 150
		leftFrontWheelModel[40] = new ModelRendererTurbo(this, 393, 313, textureX, textureY); // Box 151
		leftFrontWheelModel[41] = new ModelRendererTurbo(this, 57, 321, textureX, textureY); // Box 152
		leftFrontWheelModel[42] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 153
		leftFrontWheelModel[43] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 154
		leftFrontWheelModel[44] = new ModelRendererTurbo(this, 169, 321, textureX, textureY); // Box 155
		leftFrontWheelModel[45] = new ModelRendererTurbo(this, 225, 361, textureX, textureY); // Box 156
		leftFrontWheelModel[46] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 157
		leftFrontWheelModel[47] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 158

		leftFrontWheelModel[0].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 111
		leftFrontWheelModel[0].setRotationPoint(34F, 7F, 19F);
		leftFrontWheelModel[0].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[1].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 112
		leftFrontWheelModel[1].setRotationPoint(34F, 7F, 19F);
		leftFrontWheelModel[1].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[2].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 113
		leftFrontWheelModel[2].setRotationPoint(31F, 6F, 19F);
		leftFrontWheelModel[2].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[3].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 114
		leftFrontWheelModel[3].setRotationPoint(31F, 6F, 19F);
		leftFrontWheelModel[3].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[4].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 115
		leftFrontWheelModel[4].setRotationPoint(24F, 7F, 19F);
		leftFrontWheelModel[4].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[5].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 116
		leftFrontWheelModel[5].setRotationPoint(24F, 7F, 19F);
		leftFrontWheelModel[5].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[6].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 117
		leftFrontWheelModel[6].setRotationPoint(21F, 6F, 19F);
		leftFrontWheelModel[6].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[7].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 118
		leftFrontWheelModel[7].setRotationPoint(21F, 6F, 19F);
		leftFrontWheelModel[7].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[8].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 119
		leftFrontWheelModel[8].setRotationPoint(15F, 7F, 19F);
		leftFrontWheelModel[8].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[9].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 120
		leftFrontWheelModel[9].setRotationPoint(15F, 7F, 19F);
		leftFrontWheelModel[9].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[10].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 121
		leftFrontWheelModel[10].setRotationPoint(12F, 6F, 19F);
		leftFrontWheelModel[10].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[11].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 122
		leftFrontWheelModel[11].setRotationPoint(12F, 6F, 19F);
		leftFrontWheelModel[11].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[12].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 123
		leftFrontWheelModel[12].setRotationPoint(6F, 7F, 19F);
		leftFrontWheelModel[12].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[13].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 124
		leftFrontWheelModel[13].setRotationPoint(6F, 7F, 19F);
		leftFrontWheelModel[13].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[14].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 125
		leftFrontWheelModel[14].setRotationPoint(3F, 6F, 19F);
		leftFrontWheelModel[14].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[15].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 126
		leftFrontWheelModel[15].setRotationPoint(3F, 6F, 19F);
		leftFrontWheelModel[15].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[16].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 127
		leftFrontWheelModel[16].setRotationPoint(-4F, 7F, 19F);
		leftFrontWheelModel[16].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[17].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 128
		leftFrontWheelModel[17].setRotationPoint(-4F, 7F, 19F);
		leftFrontWheelModel[17].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[18].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 129
		leftFrontWheelModel[18].setRotationPoint(-7F, 6F, 19F);
		leftFrontWheelModel[18].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[19].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 130
		leftFrontWheelModel[19].setRotationPoint(-7F, 6F, 19F);
		leftFrontWheelModel[19].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[20].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 131
		leftFrontWheelModel[20].setRotationPoint(-14F, 7F, 19F);
		leftFrontWheelModel[20].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[21].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 132
		leftFrontWheelModel[21].setRotationPoint(-17F, 6F, 19F);
		leftFrontWheelModel[21].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[22].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 133
		leftFrontWheelModel[22].setRotationPoint(-17F, 6F, 19F);
		leftFrontWheelModel[22].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[23].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 134
		leftFrontWheelModel[23].setRotationPoint(-14F, 7F, 19F);
		leftFrontWheelModel[23].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[24].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 135
		leftFrontWheelModel[24].setRotationPoint(-23F, 7F, 19F);
		leftFrontWheelModel[24].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[25].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 136
		leftFrontWheelModel[25].setRotationPoint(-26F, 6F, 19F);
		leftFrontWheelModel[25].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[26].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 137
		leftFrontWheelModel[26].setRotationPoint(-26F, 6F, 19F);
		leftFrontWheelModel[26].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[27].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 138
		leftFrontWheelModel[27].setRotationPoint(-23F, 7F, 19F);
		leftFrontWheelModel[27].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[28].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 139
		leftFrontWheelModel[28].setRotationPoint(-32F, 7F, 19F);
		leftFrontWheelModel[28].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[29].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 140
		leftFrontWheelModel[29].setRotationPoint(-35F, 6F, 19F);
		leftFrontWheelModel[29].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[30].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 141
		leftFrontWheelModel[30].setRotationPoint(-35F, 6F, 19F);
		leftFrontWheelModel[30].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[31].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 142
		leftFrontWheelModel[31].setRotationPoint(-32F, 7F, 19F);
		leftFrontWheelModel[31].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[32].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 143
		leftFrontWheelModel[32].setRotationPoint(-41F, 7F, 19F);
		leftFrontWheelModel[32].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[33].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 144
		leftFrontWheelModel[33].setRotationPoint(-44F, 6F, 19F);
		leftFrontWheelModel[33].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[34].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 145
		leftFrontWheelModel[34].setRotationPoint(-44F, 6F, 19F);
		leftFrontWheelModel[34].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[35].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 146
		leftFrontWheelModel[35].setRotationPoint(-41F, 7F, 19F);
		leftFrontWheelModel[35].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[36].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 147
		leftFrontWheelModel[36].setRotationPoint(-50F, 7F, 19F);
		leftFrontWheelModel[36].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[37].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 148
		leftFrontWheelModel[37].setRotationPoint(-53F, 6F, 19F);
		leftFrontWheelModel[37].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[38].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 149
		leftFrontWheelModel[38].setRotationPoint(-53F, 6F, 19F);
		leftFrontWheelModel[38].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[39].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 150
		leftFrontWheelModel[39].setRotationPoint(-50F, 7F, 19F);
		leftFrontWheelModel[39].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[40].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 151
		leftFrontWheelModel[40].setRotationPoint(-59F, 7F, 19F);
		leftFrontWheelModel[40].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[41].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 152
		leftFrontWheelModel[41].setRotationPoint(-62F, 6F, 19F);
		leftFrontWheelModel[41].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[42].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 153
		leftFrontWheelModel[42].setRotationPoint(-62F, 6F, 19F);
		leftFrontWheelModel[42].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[43].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 154
		leftFrontWheelModel[43].setRotationPoint(-59F, 7F, 19F);
		leftFrontWheelModel[43].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[44].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 155
		leftFrontWheelModel[44].setRotationPoint(-69F, 7F, 19F);
		leftFrontWheelModel[44].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[45].addShapeBox(-0.5F, -0.5F, -13F, 1, 1, 52, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F); // Box 156
		leftFrontWheelModel[45].setRotationPoint(-72F, 6F, 19F);
		leftFrontWheelModel[45].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[46].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 157
		leftFrontWheelModel[46].setRotationPoint(-72F, 6F, 19F);
		leftFrontWheelModel[46].rotateAngleX = -0.10471976F;

		leftFrontWheelModel[47].addShapeBox(-1F, 3.2F, 34F, 2, 1, 12, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F); // Box 158
		leftFrontWheelModel[47].setRotationPoint(-69F, 7F, 19F);
		leftFrontWheelModel[47].rotateAngleX = -0.10471976F;
	}

	private void initrightFrontWheelModel_1()
	{
		rightFrontWheelModel[0] = new ModelRendererTurbo(this, 337, 361, textureX, textureY); // Box 207
		rightFrontWheelModel[1] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 208
		rightFrontWheelModel[2] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 209
		rightFrontWheelModel[3] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 210
		rightFrontWheelModel[4] = new ModelRendererTurbo(this, 113, 369, textureX, textureY); // Box 211
		rightFrontWheelModel[5] = new ModelRendererTurbo(this, 225, 225, textureX, textureY); // Box 212
		rightFrontWheelModel[6] = new ModelRendererTurbo(this, 281, 369, textureX, textureY); // Box 213
		rightFrontWheelModel[7] = new ModelRendererTurbo(this, 257, 225, textureX, textureY); // Box 214
		rightFrontWheelModel[8] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); // Box 215
		rightFrontWheelModel[9] = new ModelRendererTurbo(this, 313, 225, textureX, textureY); // Box 216
		rightFrontWheelModel[10] = new ModelRendererTurbo(this, 57, 377, textureX, textureY); // Box 217
		rightFrontWheelModel[11] = new ModelRendererTurbo(this, 369, 225, textureX, textureY); // Box 218
		rightFrontWheelModel[12] = new ModelRendererTurbo(this, 169, 377, textureX, textureY); // Box 219
		rightFrontWheelModel[13] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 220
		rightFrontWheelModel[14] = new ModelRendererTurbo(this, 225, 417, textureX, textureY); // Box 221
		rightFrontWheelModel[15] = new ModelRendererTurbo(this, 457, 225, textureX, textureY); // Box 222
		rightFrontWheelModel[16] = new ModelRendererTurbo(this, 337, 417, textureX, textureY); // Box 223
		rightFrontWheelModel[17] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 224
		rightFrontWheelModel[18] = new ModelRendererTurbo(this, 1, 425, textureX, textureY); // Box 225
		rightFrontWheelModel[19] = new ModelRendererTurbo(this, 57, 233, textureX, textureY); // Box 226
		rightFrontWheelModel[20] = new ModelRendererTurbo(this, 113, 425, textureX, textureY); // Box 227
		rightFrontWheelModel[21] = new ModelRendererTurbo(this, 281, 425, textureX, textureY); // Box 228
		rightFrontWheelModel[22] = new ModelRendererTurbo(this, 113, 233, textureX, textureY); // Box 229
		rightFrontWheelModel[23] = new ModelRendererTurbo(this, 169, 233, textureX, textureY); // Box 230
		rightFrontWheelModel[24] = new ModelRendererTurbo(this, 393, 425, textureX, textureY); // Box 231
		rightFrontWheelModel[25] = new ModelRendererTurbo(this, 57, 433, textureX, textureY); // Box 232
		rightFrontWheelModel[26] = new ModelRendererTurbo(this, 481, 233, textureX, textureY); // Box 233
		rightFrontWheelModel[27] = new ModelRendererTurbo(this, 225, 241, textureX, textureY); // Box 234
		rightFrontWheelModel[28] = new ModelRendererTurbo(this, 169, 433, textureX, textureY); // Box 235
		rightFrontWheelModel[29] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 236
		rightFrontWheelModel[30] = new ModelRendererTurbo(this, 281, 249, textureX, textureY); // Box 237
		rightFrontWheelModel[31] = new ModelRendererTurbo(this, 425, 249, textureX, textureY); // Box 238
		rightFrontWheelModel[32] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 239
		rightFrontWheelModel[33] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 240
		rightFrontWheelModel[34] = new ModelRendererTurbo(this, 457, 249, textureX, textureY); // Box 241
		rightFrontWheelModel[35] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 242
		rightFrontWheelModel[36] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 243
		rightFrontWheelModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 244
		rightFrontWheelModel[38] = new ModelRendererTurbo(this, 337, 257, textureX, textureY); // Box 245
		rightFrontWheelModel[39] = new ModelRendererTurbo(this, 369, 257, textureX, textureY); // Box 246
		rightFrontWheelModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 247
		rightFrontWheelModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 248
		rightFrontWheelModel[42] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 249
		rightFrontWheelModel[43] = new ModelRendererTurbo(this, 57, 265, textureX, textureY); // Box 250
		rightFrontWheelModel[44] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 251
		rightFrontWheelModel[45] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 252
		rightFrontWheelModel[46] = new ModelRendererTurbo(this, 113, 265, textureX, textureY); // Box 253
		rightFrontWheelModel[47] = new ModelRendererTurbo(this, 169, 265, textureX, textureY); // Box 254

		rightFrontWheelModel[0].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 207
		rightFrontWheelModel[0].setRotationPoint(34F, 7F, -19F);
		rightFrontWheelModel[0].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[1].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 208
		rightFrontWheelModel[1].setRotationPoint(34F, 7F, -19F);
		rightFrontWheelModel[1].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[2].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 209
		rightFrontWheelModel[2].setRotationPoint(31F, 6F, -19F);
		rightFrontWheelModel[2].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[3].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 210
		rightFrontWheelModel[3].setRotationPoint(31F, 6F, -19F);
		rightFrontWheelModel[3].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[4].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 211
		rightFrontWheelModel[4].setRotationPoint(24F, 7F, -19F);
		rightFrontWheelModel[4].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[5].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 212
		rightFrontWheelModel[5].setRotationPoint(24F, 7F, -19F);
		rightFrontWheelModel[5].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[6].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 213
		rightFrontWheelModel[6].setRotationPoint(21F, 6F, -19F);
		rightFrontWheelModel[6].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[7].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 214
		rightFrontWheelModel[7].setRotationPoint(21F, 6F, -19F);
		rightFrontWheelModel[7].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[8].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 215
		rightFrontWheelModel[8].setRotationPoint(15F, 7F, -19F);
		rightFrontWheelModel[8].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[9].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 216
		rightFrontWheelModel[9].setRotationPoint(15F, 7F, -19F);
		rightFrontWheelModel[9].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[10].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 217
		rightFrontWheelModel[10].setRotationPoint(12F, 6F, -19F);
		rightFrontWheelModel[10].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[11].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 218
		rightFrontWheelModel[11].setRotationPoint(12F, 6F, -19F);
		rightFrontWheelModel[11].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[12].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 219
		rightFrontWheelModel[12].setRotationPoint(6F, 7F, -19F);
		rightFrontWheelModel[12].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[13].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 220
		rightFrontWheelModel[13].setRotationPoint(6F, 7F, -19F);
		rightFrontWheelModel[13].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[14].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 221
		rightFrontWheelModel[14].setRotationPoint(3F, 6F, -19F);
		rightFrontWheelModel[14].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[15].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 222
		rightFrontWheelModel[15].setRotationPoint(3F, 6F, -19F);
		rightFrontWheelModel[15].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[16].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 223
		rightFrontWheelModel[16].setRotationPoint(-4F, 7F, -19F);
		rightFrontWheelModel[16].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[17].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 224
		rightFrontWheelModel[17].setRotationPoint(-4F, 7F, -19F);
		rightFrontWheelModel[17].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[18].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 225
		rightFrontWheelModel[18].setRotationPoint(-7F, 6F, -19F);
		rightFrontWheelModel[18].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[19].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 226
		rightFrontWheelModel[19].setRotationPoint(-7F, 6F, -19F);
		rightFrontWheelModel[19].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[20].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 227
		rightFrontWheelModel[20].setRotationPoint(-14F, 7F, -19F);
		rightFrontWheelModel[20].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[21].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 228
		rightFrontWheelModel[21].setRotationPoint(-17F, 6F, -19F);
		rightFrontWheelModel[21].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[22].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 229
		rightFrontWheelModel[22].setRotationPoint(-17F, 6F, -19F);
		rightFrontWheelModel[22].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[23].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 230
		rightFrontWheelModel[23].setRotationPoint(-14F, 7F, -19F);
		rightFrontWheelModel[23].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[24].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 231
		rightFrontWheelModel[24].setRotationPoint(-23F, 7F, -19F);
		rightFrontWheelModel[24].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[25].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 232
		rightFrontWheelModel[25].setRotationPoint(-26F, 6F, -19F);
		rightFrontWheelModel[25].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[26].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 233
		rightFrontWheelModel[26].setRotationPoint(-26F, 6F, -19F);
		rightFrontWheelModel[26].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[27].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 234
		rightFrontWheelModel[27].setRotationPoint(-23F, 7F, -19F);
		rightFrontWheelModel[27].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[28].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 235
		rightFrontWheelModel[28].setRotationPoint(-32F, 7F, -19F);
		rightFrontWheelModel[28].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[29].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 236
		rightFrontWheelModel[29].setRotationPoint(-35F, 6F, -19F);
		rightFrontWheelModel[29].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[30].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 237
		rightFrontWheelModel[30].setRotationPoint(-35F, 6F, -19F);
		rightFrontWheelModel[30].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[31].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 238
		rightFrontWheelModel[31].setRotationPoint(-32F, 7F, -19F);
		rightFrontWheelModel[31].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[32].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 239
		rightFrontWheelModel[32].setRotationPoint(-41F, 7F, -19F);
		rightFrontWheelModel[32].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[33].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 240
		rightFrontWheelModel[33].setRotationPoint(-44F, 6F, -19F);
		rightFrontWheelModel[33].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[34].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 241
		rightFrontWheelModel[34].setRotationPoint(-44F, 6F, -19F);
		rightFrontWheelModel[34].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[35].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 242
		rightFrontWheelModel[35].setRotationPoint(-41F, 7F, -19F);
		rightFrontWheelModel[35].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[36].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 243
		rightFrontWheelModel[36].setRotationPoint(-50F, 7F, -19F);
		rightFrontWheelModel[36].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[37].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 244
		rightFrontWheelModel[37].setRotationPoint(-53F, 6F, -19F);
		rightFrontWheelModel[37].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[38].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 245
		rightFrontWheelModel[38].setRotationPoint(-53F, 6F, -19F);
		rightFrontWheelModel[38].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[39].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 246
		rightFrontWheelModel[39].setRotationPoint(-50F, 7F, -19F);
		rightFrontWheelModel[39].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[40].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 247
		rightFrontWheelModel[40].setRotationPoint(-59F, 7F, -19F);
		rightFrontWheelModel[40].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[41].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 248
		rightFrontWheelModel[41].setRotationPoint(-62F, 6F, -19F);
		rightFrontWheelModel[41].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[42].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 249
		rightFrontWheelModel[42].setRotationPoint(-62F, 6F, -19F);
		rightFrontWheelModel[42].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[43].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 250
		rightFrontWheelModel[43].setRotationPoint(-59F, 7F, -19F);
		rightFrontWheelModel[43].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[44].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 251
		rightFrontWheelModel[44].setRotationPoint(-69F, 7F, -19F);
		rightFrontWheelModel[44].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[45].addShapeBox(-0.5F, -0.5F, -39F, 1, 1, 52, 0F,-0.3F, -4.3F, 0F, -0.3F, -4.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 3.7F, 0F, -0.3F, 3.7F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 252
		rightFrontWheelModel[45].setRotationPoint(-72F, 6F, -19F);
		rightFrontWheelModel[45].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[46].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 253
		rightFrontWheelModel[46].setRotationPoint(-72F, 6F, -19F);
		rightFrontWheelModel[46].rotateAngleX = 0.10471976F;

		rightFrontWheelModel[47].addShapeBox(-1F, 3.2F, -47F, 2, 1, 12, 0F,1F, -1.4F, 0F, 1F, -1.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 1F, 0.6F, 0F, 1F, 0.6F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 254
		rightFrontWheelModel[47].setRotationPoint(-69F, 7F, -19F);
		rightFrontWheelModel[47].rotateAngleX = 0.10471976F;
	}
}