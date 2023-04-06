//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGnevny extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 128;

	public ModelGnevny() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[146];
		turretModel = new ModelRendererTurbo[6];
		trailerModel = new ModelRendererTurbo[6];

		initbodyModel_1();
		initturretModel_1();
		inittrailerModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 2
		bodyModel[5] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 3
		bodyModel[6] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 4
		bodyModel[7] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 5
		bodyModel[8] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		bodyModel[9] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 7
		bodyModel[10] = new ModelRendererTurbo(this, 33, 17, textureX, textureY); // Box 8
		bodyModel[11] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 9
		bodyModel[12] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 10
		bodyModel[13] = new ModelRendererTurbo(this, 177, 17, textureX, textureY); // Box 11
		bodyModel[14] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 12
		bodyModel[15] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 13
		bodyModel[16] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 14
		bodyModel[17] = new ModelRendererTurbo(this, 25, 33, textureX, textureY); // Box 15
		bodyModel[18] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 16
		bodyModel[19] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 17
		bodyModel[20] = new ModelRendererTurbo(this, 473, 25, textureX, textureY); // Box 18
		bodyModel[21] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 19
		bodyModel[22] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 20
		bodyModel[23] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 22
		bodyModel[24] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 23
		bodyModel[25] = new ModelRendererTurbo(this, 257, 34, textureX, textureY); // Box 24
		bodyModel[26] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 25
		bodyModel[27] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 26
		bodyModel[28] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 27
		bodyModel[29] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 28
		bodyModel[30] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 41
		bodyModel[31] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 42
		bodyModel[32] = new ModelRendererTurbo(this, 113, 33, textureX, textureY); // Box 43
		bodyModel[33] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 45
		bodyModel[35] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 46
		bodyModel[36] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 47
		bodyModel[37] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 48
		bodyModel[38] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 49
		bodyModel[39] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 50
		bodyModel[40] = new ModelRendererTurbo(this, 241, 33, textureX, textureY); // Box 51
		bodyModel[41] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 52
		bodyModel[42] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 53
		bodyModel[43] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 54
		bodyModel[44] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 55
		bodyModel[45] = new ModelRendererTurbo(this, 217, 33, textureX, textureY); // Box 56
		bodyModel[46] = new ModelRendererTurbo(this, 297, 33, textureX, textureY); // Box 57
		bodyModel[47] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 58
		bodyModel[48] = new ModelRendererTurbo(this, 305, 33, textureX, textureY); // Box 59
		bodyModel[49] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 60
		bodyModel[50] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 61
		bodyModel[51] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 62
		bodyModel[52] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 63
		bodyModel[53] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 64
		bodyModel[54] = new ModelRendererTurbo(this, 361, 41, textureX, textureY); // Box 65
		bodyModel[55] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 66
		bodyModel[56] = new ModelRendererTurbo(this, 161, 41, textureX, textureY); // Box 67
		bodyModel[57] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 68
		bodyModel[58] = new ModelRendererTurbo(this, 137, 49, textureX, textureY); // Box 69
		bodyModel[59] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 70
		bodyModel[60] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 71
		bodyModel[61] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 72
		bodyModel[62] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 73
		bodyModel[63] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 74
		bodyModel[64] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 75
		bodyModel[65] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 76
		bodyModel[66] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 77
		bodyModel[67] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 78
		bodyModel[68] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 79
		bodyModel[69] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 80
		bodyModel[70] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 81
		bodyModel[71] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 82
		bodyModel[72] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 83
		bodyModel[73] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 84
		bodyModel[74] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 85
		bodyModel[75] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 86
		bodyModel[76] = new ModelRendererTurbo(this, 281, 57, textureX, textureY); // Box 87
		bodyModel[77] = new ModelRendererTurbo(this, 289, 57, textureX, textureY); // Box 88
		bodyModel[78] = new ModelRendererTurbo(this, 65, 25, textureX, textureY); // Box 89
		bodyModel[79] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 90
		bodyModel[80] = new ModelRendererTurbo(this, 305, 57, textureX, textureY); // Box 91
		bodyModel[81] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 92
		bodyModel[82] = new ModelRendererTurbo(this, 321, 57, textureX, textureY); // Box 93
		bodyModel[83] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 94
		bodyModel[84] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 98
		bodyModel[85] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 105
		bodyModel[86] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 109
		bodyModel[87] = new ModelRendererTurbo(this, 113, 65, textureX, textureY); // Box 110
		bodyModel[88] = new ModelRendererTurbo(this, 129, 65, textureX, textureY); // Box 111
		bodyModel[89] = new ModelRendererTurbo(this, 409, 57, textureX, textureY); // Box 112
		bodyModel[90] = new ModelRendererTurbo(this, 329, 17, textureX, textureY); // Box 113
		bodyModel[91] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 114
		bodyModel[92] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 115
		bodyModel[93] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 116
		bodyModel[94] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 121
		bodyModel[95] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 0
		bodyModel[96] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 1
		bodyModel[97] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 2
		bodyModel[98] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 3
		bodyModel[99] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 4
		bodyModel[100] = new ModelRendererTurbo(this, 473, 65, textureX, textureY); // Box 5
		bodyModel[101] = new ModelRendererTurbo(this, 489, 65, textureX, textureY); // Box 6
		bodyModel[102] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 7
		bodyModel[103] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 8
		bodyModel[104] = new ModelRendererTurbo(this, 409, 41, textureX, textureY); // Box 9
		bodyModel[105] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 10
		bodyModel[106] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 11
		bodyModel[107] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 12
		bodyModel[108] = new ModelRendererTurbo(this, 33, 73, textureX, textureY); // Box 13
		bodyModel[109] = new ModelRendererTurbo(this, 73, 73, textureX, textureY); // Box 14
		bodyModel[110] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 15
		bodyModel[111] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 16
		bodyModel[112] = new ModelRendererTurbo(this, 105, 73, textureX, textureY); // Box 17
		bodyModel[113] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 18
		bodyModel[114] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 19
		bodyModel[115] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 20
		bodyModel[116] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 21
		bodyModel[117] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 22
		bodyModel[118] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 23
		bodyModel[119] = new ModelRendererTurbo(this, 217, 73, textureX, textureY); // Box 24
		bodyModel[120] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 25
		bodyModel[121] = new ModelRendererTurbo(this, 169, 57, textureX, textureY); // Box 26
		bodyModel[122] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 27
		bodyModel[123] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 28
		bodyModel[124] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 29
		bodyModel[125] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 30
		bodyModel[126] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 31
		bodyModel[127] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 32
		bodyModel[128] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 33
		bodyModel[129] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 34
		bodyModel[130] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 35
		bodyModel[131] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 36
		bodyModel[132] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 37
		bodyModel[133] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 38
		bodyModel[134] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 39
		bodyModel[135] = new ModelRendererTurbo(this, 401, 73, textureX, textureY); // Box 40
		bodyModel[136] = new ModelRendererTurbo(this, 409, 73, textureX, textureY); // Box 41
		bodyModel[137] = new ModelRendererTurbo(this, 417, 73, textureX, textureY); // Box 42
		bodyModel[138] = new ModelRendererTurbo(this, 9, 73, textureX, textureY); // Box 43
		bodyModel[139] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 44
		bodyModel[140] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 45
		bodyModel[141] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 46
		bodyModel[142] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 47
		bodyModel[143] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 48
		bodyModel[144] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 49
		bodyModel[145] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 50

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 5, 8, 0F,0.2F, -0.7F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.2F, -0.7F, 0F, -0.7F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, -0.7F, -0.5F, 0.5F); // Box 0
		bodyModel[0].setRotationPoint(-77.5F, -1.5F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 37, 5, 8, 0F,-0.5F, 0F, 0F, 0.5F, 0F, 3F, 0.5F, 0F, 3F, -0.5F, 0F, 0F, -1F, -0.5F, 0.5F, 0.5F, 0F, 3.2F, 0.5F, 0F, 3.2F, -1F, -0.5F, 0.5F); // Box 1
		bodyModel[1].setRotationPoint(-77.5F, -1.5F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 48, 5, 8, 0F,0.5F, 0F, 3F, -0.5F, 0F, 4F, -0.5F, 0F, 4F, 0.5F, 0F, 3F, 0.5F, 0F, 3.2F, -1F, 1F, 4F, -1F, 1F, 4F, 0.5F, 0F, 3.2F); // Box 0
		bodyModel[2].setRotationPoint(-39.5F, -1.5F, -4F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 6, 8, 0F,-0.5F, 0F, 4F, 0.5F, 0F, 3.5F, 0.5F, 0F, 3.5F, -0.5F, 0F, 4F, 0F, 0F, 4F, 0.5F, 0F, 2.5F, 0.5F, 0F, 2.5F, 0F, 0F, 4F); // Box 1
		bodyModel[3].setRotationPoint(7.5F, -1.5F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, 3.5F, 0F, 3.5F, 3.2F, 0F, 3.5F, -3.8F, 0F, 0F, -3.8F, 0F, 0F, 2.5F, 0F, 0F, 1.5F, 0F, 0F, -2F, 0F, 0F, -3F); // Box 2
		bodyModel[4].setRotationPoint(44F, -1.5F, -4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 20, 9, 11, 0F,0F, 0F, 1.7F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1.7F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F); // Box 3
		bodyModel[5].setRotationPoint(50F, -5F, -5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 15, 9, 11, 0F,0F, 0F, 1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0F, 1F, 0F, 0.5F, -2F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, -2F); // Box 4
		bodyModel[6].setRotationPoint(70F, -5F, -5.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 14, 9, 11, 0F,0F, 0.2F, -1F, 0F, 0.5F, -4.2F, 0F, 0.5F, -4.2F, 0F, 0.2F, -1F, 0F, 0.5F, -4F, -1F, 0.5F, -5.4F, -1F, 0.5F, -5.4F, 0F, 0.5F, -4F); // Box 5
		bodyModel[7].setRotationPoint(85F, -5F, -5.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 3, 9, 11, 0F,0F, 0.5F, -4.2F, -0.2F, 0.6F, -5.2F, -0.2F, 0.6F, -5.2F, 0F, 0.5F, -4.2F, 1F, 0.5F, -5.4F, -0.8F, -7.5F, -5.4F, -0.8F, -7.5F, -5.4F, 1F, 0.5F, -5.4F); // Box 6
		bodyModel[8].setRotationPoint(99F, -5F, -5.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 6, 6, 1, 0F,0F, 0F, -4F, 0F, 3.5F, -3.5F, 0F, 3.5F, 3.2F, 0F, 0F, 3.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 2.5F); // Box 7
		bodyModel[9].setRotationPoint(44F, -1.5F, 3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 6, 6, 7, 0F,0F, 0F, 3.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, 2.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 2.5F); // Box 8
		bodyModel[10].setRotationPoint(44F, -1.5F, -3.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 14, 3, 11, 0F,0F, 0.5F, -4F, -1F, 0.5F, -5.4F, -1F, 0.5F, -5.4F, 0F, 0.5F, -4F, 0F, 0.2F, -5.4F, -2F, 0F, -5.4F, -2F, 0F, -5.4F, 0F, 0.2F, -5.4F); // Box 9
		bodyModel[11].setRotationPoint(85F, 5F, -5.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 15, 3, 11, 0F,0F, 0.5F, -2F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, -2F, 0F, 0F, -5.4F, 0F, 0.2F, -5.4F, 0F, 0.2F, -5.4F, 0F, 0F, -5.4F); // Box 10
		bodyModel[12].setRotationPoint(70F, 5F, -5.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 20, 3, 11, 0F,0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0F, -5.4F, 0F, 0F, -5.4F); // Box 11
		bodyModel[13].setRotationPoint(50F, 5F, -5.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 6, 3, 7, 0F,0F, 0.5F, 3F, 0F, 0.5F, 2F, 0F, 0.5F, 2F, 0F, 0.5F, 3F, 0F, 0.2F, -3.4F, 0F, 0F, -3.4F, 0F, 0F, -3.4F, 0F, 0.2F, -3.4F); // Box 12
		bodyModel[14].setRotationPoint(44F, 5F, -3.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 36, 3, 8, 0F,0F, 0.5F, 4F, 0.5F, 0.5F, 2.5F, 0.5F, 0.5F, 2.5F, 0F, 0.5F, 4F, -0.5F, 0.3F, -3.8F, 0.5F, 0.2F, -3.8F, 0.5F, 0.2F, -3.8F, -0.5F, 0.3F, -3.8F); // Box 13
		bodyModel[15].setRotationPoint(7.5F, 5F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 48, 3, 8, 0F,0.5F, 2F, 3.2F, -1F, 1F, 4F, -1F, 1F, 4F, 0.5F, 2F, 3.2F, 0.5F, -1F, -3.8F, -0.5F, -0.2F, -3.8F, -0.5F, -0.2F, -3.8F, 0.5F, -1F, -3.8F); // Box 14
		bodyModel[16].setRotationPoint(-39.5F, 5.5F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 37, 3, 8, 0F,-1F, 0.5F, 0.5F, 0.5F, 0F, 3.2F, 0.5F, 0F, 3.2F, -1F, 0.5F, 0.5F, -19F, -1F, -3.8F, 0.5F, 1F, -3.8F, 0.5F, 1F, -3.8F, -19F, -1F, -3.8F); // Box 15
		bodyModel[17].setRotationPoint(-77.5F, 3.5F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, -0.5F, 5, 5, 1, 0F,0F, 0F, -0.3F, 1F, 0F, -0.3F, 1F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F); // Box 16
		bodyModel[18].setRotationPoint(-76.5F, 3.5F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 17
		bodyModel[19].setRotationPoint(-42F, -5F, -4F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Box 18
		bodyModel[20].setRotationPoint(-32F, -5F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[21].setRotationPoint(-40F, -5F, -4F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[22].setRotationPoint(-13F, -5F, -6F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 2F); // Box 22
		bodyModel[23].setRotationPoint(-9F, -5F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 23
		bodyModel[24].setRotationPoint(-14F, -5F, -6F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 4, 8, 0F,0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.5F); // Box 24
		bodyModel[25].setRotationPoint(9.5F, -5F, -4F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 39, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[26].setRotationPoint(11.5F, -5F, -4F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[27].setRotationPoint(-0.5F, -3.5F, -1.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 27
		bodyModel[28].setRotationPoint(-1.5F, -3.5F, -1.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 28
		bodyModel[29].setRotationPoint(0.5F, -3.5F, -1.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 41
		bodyModel[30].setRotationPoint(-23F, -3.5F, -1.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[31].setRotationPoint(-24F, -3.5F, -1.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 43
		bodyModel[32].setRotationPoint(-25F, -3.5F, -1.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 14, 4, 10, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 44
		bodyModel[33].setRotationPoint(50F, -8.8F, -5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 8, 10, 0F,0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0F, -1.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F); // Box 45
		bodyModel[34].setRotationPoint(48F, -8.8F, -5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 8, 4, 4, 0F,0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0F, 0F, 0.3F); // Box 46
		bodyModel[35].setRotationPoint(39.8F, -8.8F, -2F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 3, 4, 10, 0F,0F, 0F, -0.3F, 0.2F, 0F, -2.1F, 0.2F, 0F, -2.1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.2F, 0F, -2.1F, 0.2F, 0F, -2.1F, 0F, 0F, -0.3F); // Box 47
		bodyModel[36].setRotationPoint(64F, -8.8F, -5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 9, 3, 5, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 48
		bodyModel[37].setRotationPoint(49F, -12F, -2.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, -0.3F); // Box 49
		bodyModel[38].setRotationPoint(47.8F, -15F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -0.3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.3F, 0F, 0.2F, -0.3F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, -0.3F); // Box 50
		bodyModel[39].setRotationPoint(55F, -16F, -2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 5, 7, 0F,0F, 0F, 1F, -0.2F, 0F, -0.3F, -0.2F, 0F, -2.3F, 0F, 0F, -1F, 0F, -0.8F, 1F, -0.2F, -0.8F, -0.3F, -0.2F, -0.8F, -2.3F, 0F, -0.8F, -1F); // Box 51
		bodyModel[40].setRotationPoint(57F, -16F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,0F, -0.8F, 0F, 0.5F, -0.8F, -2.5F, 0.5F, -0.8F, -2.5F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, 0F, 0F, 0F); // Box 52
		bodyModel[41].setRotationPoint(52.5F, -13F, -5.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,1F, -0.8F, -4.5F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 1F, -0.8F, -4.5F, 1F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4.5F); // Box 53
		bodyModel[42].setRotationPoint(43.3F, -13F, -5.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 11, 0F,1F, -0.8F, 0F, 0.2F, -0.8F, 0F, 0.2F, -0.8F, 0F, 1F, -0.8F, 0F, 1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 1F, 0F, 0F); // Box 54
		bodyModel[43].setRotationPoint(48.3F, -13F, -5.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.8F, 1F, 0F, -0.8F, 1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.8F, 1F, -0.2F, -0.8F); // Box 55
		bodyModel[44].setRotationPoint(50.3F, -14F, -5.5F);

		bodyModel[45].addShapeBox(1F, 0F, 0F, 4, 2, 1, 0F,1F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.8F, 1F, 0F, -0.8F, 1F, -0.2F, 0F, 0.2F, -0.2F, 0F, 0.2F, -0.2F, -0.8F, 1F, -0.2F, -0.8F); // Box 56
		bodyModel[45].setRotationPoint(52.5F, -14F, -5.5F);
		bodyModel[45].rotateAngleY = 0.50614548F;

		bodyModel[46].addShapeBox(1F, 0F, 0F, 4, 2, 1, 0F,1F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0F, 1F, -0.2F, 0F); // Box 57
		bodyModel[46].setRotationPoint(52F, -14F, 4.6F);
		bodyModel[46].rotateAngleY = -0.50614548F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,1F, 0F, -0.8F, 0.2F, 0F, -0.8F, 0.2F, 0F, 0F, 1F, 0F, 0F, 1F, -0.2F, -0.8F, 0.2F, -0.2F, -0.8F, 0.2F, -0.2F, 0F, 1F, -0.2F, 0F); // Box 58
		bodyModel[47].setRotationPoint(50.3F, -14F, 4.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 59
		bodyModel[48].setRotationPoint(48.8F, -18.5F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 3, 4, 0F,0F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 60
		bodyModel[49].setRotationPoint(52.8F, -18.5F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 61
		bodyModel[50].setRotationPoint(49.3F, -18.1F, -3.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 62
		bodyModel[51].setRotationPoint(52.9F, -16.9F, -3.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 63
		bodyModel[52].setRotationPoint(50.5F, -19.5F, -0.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 6, 4, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 64
		bodyModel[53].setRotationPoint(18F, -11F, -2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 65
		bodyModel[54].setRotationPoint(42.8F, -5F, 4F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 66
		bodyModel[55].setRotationPoint(42.8F, -5F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 67
		bodyModel[56].setRotationPoint(47.8F, -5F, -5.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F); // Box 68
		bodyModel[57].setRotationPoint(47.8F, -5F, 3.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,0F, 0F, -1F, -1F, 0.5F, -0.5F, -1F, 0.5F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 69
		bodyModel[58].setRotationPoint(24.5F, -14F, -2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 7, 5, 4, 0F,1F, 0.5F, -0.5F, -1F, 3F, 0F, -1F, 3F, 0F, 1F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F); // Box 70
		bodyModel[59].setRotationPoint(26.5F, -14F, -2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 5, 4, 0F,1F, 3F, 0F, -1.5F, 3.3F, -1F, -1.5F, 3.3F, -1F, 1F, 3F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 71
		bodyModel[60].setRotationPoint(33.5F, -14F, -2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, -4F, 0F, 1F, 4.5F, 0F, -1F, 4.5F, 0F, -1F, -4F, 0F, 1F); // Box 72
		bodyModel[61].setRotationPoint(33.5F, -9F, -2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 7, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 3F, 0F, 0.5F, 4F, 0F, 1F, 4F, 0F, 1F, 3F, 0F, 0.5F); // Box 73
		bodyModel[62].setRotationPoint(26.5F, -9F, -2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 3F, 0F, -1F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, 3F, 0F, -1F); // Box 74
		bodyModel[63].setRotationPoint(24.5F, -9F, -2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F, -0.3F, 20F, -0.3F); // Box 75
		bodyModel[64].setRotationPoint(-9F, -31F, -0.5F);
		bodyModel[64].rotateAngleZ = 0.05235988F;

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 20F, -0.2F, -0.2F, 20F, -0.2F, -0.2F, 20F, -0.2F, -0.2F, 20F, -0.2F); // Box 76
		bodyModel[65].setRotationPoint(42.8F, -35.8F, -0.5F);
		bodyModel[65].rotateAngleZ = 0.03490659F;

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 2, 7, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F); // Box 77
		bodyModel[66].setRotationPoint(43.2F, -36F, -3.5F);
		bodyModel[66].rotateAngleZ = 0.03490659F;

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 9, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 78
		bodyModel[67].setRotationPoint(43.2F, -25F, -4.5F);
		bodyModel[67].rotateAngleZ = 0.03490659F;

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 79
		bodyModel[68].setRotationPoint(-9F, -26.5F, -3F);
		bodyModel[68].rotateAngleZ = 0.03490659F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 80
		bodyModel[69].setRotationPoint(-9F, -26.5F, -2.5F);
		bodyModel[69].rotateAngleZ = 0.06632251F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F); // Box 81
		bodyModel[70].setRotationPoint(43.5F, -30F, -3F);
		bodyModel[70].rotateAngleZ = 0.03490659F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 82
		bodyModel[71].setRotationPoint(-9F, -26.5F, -1.2F);
		bodyModel[71].rotateAngleZ = 0.06632251F;

		bodyModel[72].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 83
		bodyModel[72].setRotationPoint(-9F, -26.5F, 1.5F);
		bodyModel[72].rotateAngleZ = 0.06632251F;

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 84
		bodyModel[73].setRotationPoint(-9F, -26.5F, 0.2F);
		bodyModel[73].rotateAngleZ = 0.06632251F;

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 3F, -0.4F, -0.4F, 3F, -0.4F, -0.4F, 3F, -0.4F, -0.4F, 3F, -0.4F); // Box 85
		bodyModel[74].setRotationPoint(43.2F, -25F, -4.9F);
		bodyModel[74].rotateAngleX = 0.13962634F;
		bodyModel[74].rotateAngleZ = 0.13962634F;

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 3F, -0.4F, -0.4F, 3F, -0.4F, -0.4F, 3F, -0.4F, -0.4F, 3F, -0.4F); // Box 86
		bodyModel[75].setRotationPoint(43.2F, -25F, 3.9F);
		bodyModel[75].rotateAngleX = -0.13962634F;
		bodyModel[75].rotateAngleZ = 0.13962634F;

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 3F, -0.4F, -0.4F, 3F, -0.4F, -0.4F, 3F, -0.4F, -0.4F, 3F, -0.4F); // Box 87
		bodyModel[76].setRotationPoint(43.2F, -25F, -3.9F);
		bodyModel[76].rotateAngleX = 0.10471976F;
		bodyModel[76].rotateAngleZ = 0.10471976F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -3F, -0.4F, -0.4F, -3F, -0.4F, -0.4F, -3F, -0.4F, -0.4F, 3F, -0.4F); // Box 88
		bodyModel[77].setRotationPoint(43.2F, -25F, 2.9F);
		bodyModel[77].rotateAngleX = -0.10471976F;
		bodyModel[77].rotateAngleZ = 0.10471976F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.3F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, 50F, -0.4F, -0.4F, -0.3F, -0.4F, -0.4F); // Box 89
		bodyModel[78].setRotationPoint(-9F, -26.5F, -0.5F);
		bodyModel[78].rotateAngleZ = -0.02094395F;

		bodyModel[79].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F); // Box 90
		bodyModel[79].setRotationPoint(-8.5F, -26F, -1.8F);
		bodyModel[79].rotateAngleX = 0.03490659F;
		bodyModel[79].rotateAngleZ = -0.20943951F;

		bodyModel[80].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F); // Box 91
		bodyModel[80].setRotationPoint(-8.5F, -26F, 1.8F);
		bodyModel[80].rotateAngleX = -0.03490659F;
		bodyModel[80].rotateAngleZ = -0.20943951F;

		bodyModel[81].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F); // Box 92
		bodyModel[81].setRotationPoint(-8.5F, -26F, 0.8F);
		bodyModel[81].rotateAngleX = -0.01745329F;
		bodyModel[81].rotateAngleZ = -0.20943951F;

		bodyModel[82].addShapeBox(-0.5F, 0F, -0.5F, 1, 8, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F, -0.4F, 20F, -0.4F); // Box 93
		bodyModel[82].setRotationPoint(-8.5F, -26F, -0.8F);
		bodyModel[82].rotateAngleX = 0.01745329F;
		bodyModel[82].rotateAngleZ = -0.20943951F;

		bodyModel[83].addShapeBox(-1F, 0F, -1F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[83].setRotationPoint(63.5F, -9.8F, 0F);

		bodyModel[84].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[84].setRotationPoint(73.5F, -6.5F, 0F);

		bodyModel[85].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[85].setRotationPoint(-38F, -6.3F, 0F);
		bodyModel[85].rotateAngleY = -3.14159265F;

		bodyModel[86].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[86].setRotationPoint(-48F, -2.8F, 0F);
		bodyModel[86].rotateAngleY = -3.14159265F;

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 110
		bodyModel[87].setRotationPoint(-77.5F, -2F, -2F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 111
		bodyModel[88].setRotationPoint(-77.5F, -2F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 112
		bodyModel[89].setRotationPoint(101F, -14F, -0.5F);

		bodyModel[90].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 113
		bodyModel[90].setRotationPoint(101.5F, -8.5F, 0F);
		bodyModel[90].rotateAngleX = 0.20943951F;
		bodyModel[90].rotateAngleZ = -0.55850536F;

		bodyModel[91].addShapeBox(-0.5F, 0F, -0.5F, 1, 4, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 114
		bodyModel[91].setRotationPoint(101.5F, -8.5F, 0F);
		bodyModel[91].rotateAngleX = -0.20943951F;
		bodyModel[91].rotateAngleZ = -0.55850536F;

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 115
		bodyModel[92].setRotationPoint(-80F, -8.5F, -0.5F);
		bodyModel[92].rotateAngleZ = 0.34906585F;

		bodyModel[93].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[93].setRotationPoint(-10F, -6.5F, -4.9F);

		bodyModel[94].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[94].setRotationPoint(-10F, -6.5F, 4.9F);

		bodyModel[95].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 0
		bodyModel[95].setRotationPoint(-67.7F, -3.5F, 0F);
		bodyModel[95].rotateAngleY = -3.14159265F;

		bodyModel[96].addShapeBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 1
		bodyModel[96].setRotationPoint(-67.7F, -3.5F, 0F);
		bodyModel[96].rotateAngleY = -3.14159265F;
		bodyModel[96].rotateAngleZ = 0.55850536F;

		bodyModel[97].addShapeBox(0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,-0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 2
		bodyModel[97].setRotationPoint(-67.7F, -3.5F, 0F);
		bodyModel[97].rotateAngleY = -3.14159265F;
		bodyModel[97].rotateAngleZ = 0.55850536F;

		bodyModel[98].addShapeBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 3
		bodyModel[98].setRotationPoint(-33F, -7F, -3.5F);
		bodyModel[98].rotateAngleY = -1.57079633F;
		bodyModel[98].rotateAngleZ = 0.55850536F;

		bodyModel[99].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 4
		bodyModel[99].setRotationPoint(-33F, -7F, -3.5F);
		bodyModel[99].rotateAngleY = -1.57079633F;

		bodyModel[100].addShapeBox(0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,-0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 5
		bodyModel[100].setRotationPoint(-33F, -7F, -3.5F);
		bodyModel[100].rotateAngleY = -1.57079633F;
		bodyModel[100].rotateAngleZ = 0.55850536F;

		bodyModel[101].addShapeBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 6
		bodyModel[101].setRotationPoint(-33F, -7F, 3.5F);
		bodyModel[101].rotateAngleY = 1.57079633F;
		bodyModel[101].rotateAngleZ = 0.55850536F;

		bodyModel[102].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 7
		bodyModel[102].setRotationPoint(-33F, -7F, 3.5F);
		bodyModel[102].rotateAngleY = 1.57079633F;

		bodyModel[103].addShapeBox(0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,-0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 8
		bodyModel[103].setRotationPoint(-33F, -7F, 3.5F);
		bodyModel[103].rotateAngleY = 1.57079633F;
		bodyModel[103].rotateAngleZ = 0.55850536F;

		bodyModel[104].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 9
		bodyModel[104].setRotationPoint(45.5F, -7F, 5.5F);
		bodyModel[104].rotateAngleY = 1.57079633F;

		bodyModel[105].addShapeBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 10
		bodyModel[105].setRotationPoint(45.5F, -7F, 5.5F);
		bodyModel[105].rotateAngleY = 1.57079633F;
		bodyModel[105].rotateAngleZ = 0.55850536F;

		bodyModel[106].addShapeBox(0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,-0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 11
		bodyModel[106].setRotationPoint(45.5F, -7F, 5.5F);
		bodyModel[106].rotateAngleY = 1.57079633F;
		bodyModel[106].rotateAngleZ = 0.55850536F;

		bodyModel[107].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 12
		bodyModel[107].setRotationPoint(45.5F, -7F, -5.5F);
		bodyModel[107].rotateAngleY = -1.57079633F;

		bodyModel[108].addShapeBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 13
		bodyModel[108].setRotationPoint(45.5F, -7F, -5.5F);
		bodyModel[108].rotateAngleY = -1.57079633F;
		bodyModel[108].rotateAngleZ = 0.55850536F;

		bodyModel[109].addShapeBox(0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,-0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 14
		bodyModel[109].setRotationPoint(45.5F, -7F, -5.5F);
		bodyModel[109].rotateAngleY = -1.57079633F;
		bodyModel[109].rotateAngleZ = 0.55850536F;

		bodyModel[110].addShapeBox(0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,-0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 15
		bodyModel[110].setRotationPoint(47.5F, -14.1F, 4F);
		bodyModel[110].rotateAngleY = 1.57079633F;
		bodyModel[110].rotateAngleZ = 0.55850536F;

		bodyModel[111].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 16
		bodyModel[111].setRotationPoint(47.5F, -14.1F, 4F);
		bodyModel[111].rotateAngleY = 1.57079633F;

		bodyModel[112].addShapeBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 17
		bodyModel[112].setRotationPoint(47.5F, -14.1F, 4F);
		bodyModel[112].rotateAngleY = 1.57079633F;
		bodyModel[112].rotateAngleZ = 0.55850536F;

		bodyModel[113].addShapeBox(0.5F, -0.5F, -0.5F, 4, 1, 1, 0F,-0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F, -0.2F, -0.45F, -0.45F); // Box 18
		bodyModel[113].setRotationPoint(47.5F, -14.1F, -4F);
		bodyModel[113].rotateAngleY = -1.57079633F;
		bodyModel[113].rotateAngleZ = 0.55850536F;

		bodyModel[114].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 19
		bodyModel[114].setRotationPoint(47.5F, -14.1F, -4F);
		bodyModel[114].rotateAngleY = -1.57079633F;

		bodyModel[115].addShapeBox(-1.5F, -0.5F, -0.5F, 3, 1, 1, 0F,-0.2F, -0.25F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F); // Box 20
		bodyModel[115].setRotationPoint(47.5F, -14.1F, -4F);
		bodyModel[115].rotateAngleY = -1.57079633F;
		bodyModel[115].rotateAngleZ = 0.55850536F;

		bodyModel[116].addShapeBox(0F, 0F, 0F, 24, 1, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 21
		bodyModel[116].setRotationPoint(16F, -5.5F, 4F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F); // Box 22
		bodyModel[117].setRotationPoint(27F, -7.5F, 4F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.4F, 0.5F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.5F, -0.4F, -1.3F, -0.5F, -0.4F, -1.3F, 0F, -0.4F, 0F); // Box 23
		bodyModel[118].setRotationPoint(35F, -7.5F, 4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0.1F, 0F, 0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 24
		bodyModel[119].setRotationPoint(30.5F, -8F, 4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0.5F, 0F, 0.2F, 0.5F, -0.5F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, -0.2F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[120].setRotationPoint(30.5F, -8F, 6F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 26
		bodyModel[121].setRotationPoint(26.5F, -9.5F, 7F);

		bodyModel[122].addShapeBox(-0.5F, 0F, -3.5F, 1, 1, 4, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F); // Box 27
		bodyModel[122].setRotationPoint(27F, -9.5F, 7.5F);
		bodyModel[122].rotateAngleX = -0.68067841F;
		bodyModel[122].rotateAngleY = -0.41887902F;

		bodyModel[123].addShapeBox(-0.5F, 0F, -3.5F, 1, 1, 4, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F); // Box 28
		bodyModel[123].setRotationPoint(39F, -9.5F, 7.5F);
		bodyModel[123].rotateAngleX = -0.68067841F;
		bodyModel[123].rotateAngleY = -0.71558499F;

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 29
		bodyModel[124].setRotationPoint(38.5F, -9.5F, 7F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F); // Box 30
		bodyModel[125].setRotationPoint(38.5F, -5F, 6.5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F); // Box 31
		bodyModel[126].setRotationPoint(26.5F, -5F, 6.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F); // Box 32
		bodyModel[127].setRotationPoint(17F, -5F, 6.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 33
		bodyModel[128].setRotationPoint(17F, -9.5F, 7F);

		bodyModel[129].addShapeBox(-0.5F, 0F, -3.5F, 1, 1, 4, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F); // Box 34
		bodyModel[129].setRotationPoint(17.5F, -9.5F, 7.5F);
		bodyModel[129].rotateAngleX = -0.68067841F;
		bodyModel[129].rotateAngleY = 0.41887902F;

		bodyModel[130].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F); // Box 35
		bodyModel[130].setRotationPoint(16.5F, -7.5F, 4F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.4F, 0.5F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.5F, -0.4F, -1.3F, -0.5F, -0.4F, -1.3F, 0F, -0.4F, 0F); // Box 36
		bodyModel[131].setRotationPoint(23.5F, -7.5F, 4F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 37
		bodyModel[132].setRotationPoint(16F, -5.5F, -8F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 38
		bodyModel[133].setRotationPoint(26.5F, -9.5F, -8F);

		bodyModel[134].addShapeBox(-0.5F, 0F, -3.5F, 1, 1, 4, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F); // Box 39
		bodyModel[134].setRotationPoint(27F, -9.5F, -7.5F);
		bodyModel[134].rotateAngleX = -0.68067841F;
		bodyModel[134].rotateAngleY = 3.52556509F;

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F); // Box 40
		bodyModel[135].setRotationPoint(26.5F, -5F, -7.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F, -0.35F, 0.5F, -0.35F); // Box 41
		bodyModel[136].setRotationPoint(17F, -5F, -7.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F); // Box 42
		bodyModel[137].setRotationPoint(17F, -9.5F, -8F);

		bodyModel[138].addShapeBox(-0.5F, 0F, -3.5F, 1, 1, 4, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F, -0.3F, -0.7F, -0.4F); // Box 43
		bodyModel[138].setRotationPoint(17.5F, -9.5F, -7.5F);
		bodyModel[138].rotateAngleX = -0.68067841F;
		bodyModel[138].rotateAngleY = 2.75762022F;

		bodyModel[139].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.3F); // Box 44
		bodyModel[139].setRotationPoint(16.5F, -7.5F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.4F, 0.5F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, -0.5F, -0.4F, -1.3F, -0.5F, -0.4F, -1.3F, 0F, -0.4F, 0F); // Box 45
		bodyModel[140].setRotationPoint(23.5F, -7.5F, -7F);

		bodyModel[141].addShapeBox(0F, 0F, -0.5F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[141].setRotationPoint(-67.5F, 6.5F, -3.5F);
		bodyModel[141].rotateAngleY = 0.05235988F;
		bodyModel[141].rotateAngleZ = 0.06981317F;

		bodyModel[142].addShapeBox(0F, 0F, -0.5F, 37, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[142].setRotationPoint(-67.5F, 6.5F, 3.5F);
		bodyModel[142].rotateAngleY = -0.05235988F;
		bodyModel[142].rotateAngleZ = 0.06981317F;

		bodyModel[143].addShapeBox(0.5F, -3F, -0.5F, 2, 4, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 48
		bodyModel[143].setRotationPoint(-67.5F, 6.5F, 3.5F);
		bodyModel[143].rotateAngleY = -0.05235988F;
		bodyModel[143].rotateAngleZ = 0.06981317F;

		bodyModel[144].addShapeBox(0.5F, -3F, -0.5F, 2, 4, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 49
		bodyModel[144].setRotationPoint(-67.5F, 6.5F, -3.5F);
		bodyModel[144].rotateAngleY = 0.05235988F;
		bodyModel[144].rotateAngleZ = 0.06981317F;

		bodyModel[145].addShapeBox(-1F, 0F, -1F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[145].setRotationPoint(51.5F, -16.5F, 0F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 29
		turretModel[1] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 30
		turretModel[2] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 31
		turretModel[3] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 32
		turretModel[4] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 33
		turretModel[5] = new ModelRendererTurbo(this, 169, 17, textureX, textureY); // Box 34

		turretModel[0].addShapeBox(-5.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[0].setRotationPoint(0F, -4F, 0F);

		turretModel[1].addShapeBox(2.5F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 30
		turretModel[1].setRotationPoint(0F, -4F, 0F);

		turretModel[2].addShapeBox(2.5F, -0.5F, 1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 31
		turretModel[2].setRotationPoint(0F, -4F, 0F);

		turretModel[3].addShapeBox(-5.5F, -0.5F, 1F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[3].setRotationPoint(0F, -4F, 0F);

		turretModel[4].addShapeBox(2.5F, -0.5F, -2F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 33
		turretModel[4].setRotationPoint(0F, -4F, 0F);

		turretModel[5].addShapeBox(-5.5F, -0.5F, -2F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[5].setRotationPoint(0F, -4F, 0F);
	}

	private void inittrailerModel_1()
	{
		trailerModel[0] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 35
		trailerModel[1] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 36
		trailerModel[2] = new ModelRendererTurbo(this, 489, 25, textureX, textureY); // Box 37
		trailerModel[3] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 38
		trailerModel[4] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 39
		trailerModel[5] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 40

		trailerModel[0].addShapeBox(2.5F, -0.5F, -2F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 35
		trailerModel[0].setRotationPoint(-23.5F, -4F, 0F);

		trailerModel[1].addShapeBox(-5.5F, -0.5F, -2F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		trailerModel[1].setRotationPoint(-23.5F, -4F, 0F);

		trailerModel[2].addShapeBox(-5.5F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		trailerModel[2].setRotationPoint(-23.5F, -4F, 0F);

		trailerModel[3].addShapeBox(2.5F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 38
		trailerModel[3].setRotationPoint(-23.5F, -4F, 0F);

		trailerModel[4].addShapeBox(2.5F, -0.5F, 1F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 39
		trailerModel[4].setRotationPoint(-23.5F, -4F, 0F);

		trailerModel[5].addShapeBox(-5.5F, -0.5F, 1F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		trailerModel[5].setRotationPoint(-23.5F, -4F, 0F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[1];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 99

		gun_2_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F); // Box 99

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(73.5F, -8.2F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 100
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 101

		gun_2_Model[1][0].addShapeBox(-2.5F, -0.7F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F); // Box 100

		gun_2_Model[1][1].addShapeBox(-0.5F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F); // Box 101

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(73.5F, -8.2F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("B13FarFront", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[1];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 99

		gun_3_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F); // Box 99

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(63.5F, -11.5F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 100
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 101

		gun_3_Model[1][0].addShapeBox(-2.5F, -0.7F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F); // Box 100

		gun_3_Model[1][1].addShapeBox(-0.5F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F); // Box 101

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(63.5F, -11.5F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("B13Front", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[1];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 99

		gun_4_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F); // Box 99

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-38F, -8F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[2];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 100
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 101

		gun_4_Model[1][0].addShapeBox(-2.5F, -0.7F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F); // Box 100

		gun_4_Model[1][1].addShapeBox(-0.5F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F); // Box 101

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-38F, -8F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("B13Rear", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[1];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 99

		gun_5_Model[0][0].addShapeBox(-2F, -1.5F, -2F, 3, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1F); // Box 99

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-48F, -4.5F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[2];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 100
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 101

		gun_5_Model[1][0].addShapeBox(-2.5F, -0.7F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F, 0F, 0.4F, 0.1F); // Box 100

		gun_5_Model[1][1].addShapeBox(-0.5F, -0.5F, -0.5F, 9, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.2F, -0.2F); // Box 101

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-48F, -4.5F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("B13FarRear", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[0];

		gun_6_Model[1] = new ModelRendererTurbo[3];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 122
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 123
		gun_6_Model[1][2] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 124

		gun_6_Model[1][0].addShapeBox(-0.5F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 122

		gun_6_Model[1][1].addShapeBox(-2F, -1.3F, -2F, 2, 3, 4, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 123

		gun_6_Model[1][2].addShapeBox(0F, -1.3F, -2F, 2, 3, 4, 0F,0F, 0F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 124

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(-10F, -7.5F, 5F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("34KLeft", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[0];

		gun_7_Model[1] = new ModelRendererTurbo[3];
		gun_7_Model[1][0] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 122
		gun_7_Model[1][1] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 123
		gun_7_Model[1][2] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 124

		gun_7_Model[1][0].addShapeBox(-0.5F, -0.5F, -0.5F, 6, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.3F, -0.3F); // Box 122

		gun_7_Model[1][1].addShapeBox(-2F, -1.3F, -2F, 2, 3, 4, 0F,-0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 123

		gun_7_Model[1][2].addShapeBox(0F, -1.3F, -2F, 2, 3, 4, 0F,0F, 0F, -0.3F, 0F, -1.5F, -0.3F, 0F, -1.5F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 124

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[1])
		{
			gunPart.setRotationPoint(-10F, -7.5F, -5F);
		}


		gun_7_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("34KRight", gun_7_Model);
	}
}