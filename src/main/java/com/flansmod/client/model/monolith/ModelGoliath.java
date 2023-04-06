//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Goliath
// Model Creator: 
// Created on: 23.07.2020 - 07:13:26
// Last changed on: 23.07.2020 - 07:13:26

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelGoliath extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelGoliath() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[128];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 201, 49, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 89, 57, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 329, 57, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 401, 57, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 137, 73, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 161, 97, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 89, 105, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 217, 105, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 273, 137, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 369, 145, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 33
		bodyModel[32] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 34
		bodyModel[33] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 35
		bodyModel[34] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 36
		bodyModel[35] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 37
		bodyModel[36] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 38
		bodyModel[37] = new ModelRendererTurbo(this, 65, 57, textureX, textureY); // Box 39
		bodyModel[38] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 65
		bodyModel[39] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 111
		bodyModel[40] = new ModelRendererTurbo(this, 185, 73, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 481, 65, textureX, textureY); // Box 54
		bodyModel[43] = new ModelRendererTurbo(this, 409, 89, textureX, textureY); // Box 55
		bodyModel[44] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 56
		bodyModel[45] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 59
		bodyModel[46] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 60
		bodyModel[47] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 61
		bodyModel[48] = new ModelRendererTurbo(this, 329, 49, textureX, textureY); // Box 62
		bodyModel[49] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 63
		bodyModel[50] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 64
		bodyModel[51] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 65
		bodyModel[52] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 66
		bodyModel[53] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 70
		bodyModel[54] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 71
		bodyModel[55] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 72
		bodyModel[56] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 73
		bodyModel[57] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 74
		bodyModel[58] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 75
		bodyModel[59] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 76
		bodyModel[60] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 77
		bodyModel[61] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 78
		bodyModel[62] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 79
		bodyModel[63] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 80
		bodyModel[64] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 81
		bodyModel[65] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 82
		bodyModel[66] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 84
		bodyModel[67] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 85
		bodyModel[68] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 86
		bodyModel[69] = new ModelRendererTurbo(this, 97, 193, textureX, textureY); // Box 87
		bodyModel[70] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 88
		bodyModel[71] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 89
		bodyModel[72] = new ModelRendererTurbo(this, 425, 209, textureX, textureY); // Box 90
		bodyModel[73] = new ModelRendererTurbo(this, 57, 121, textureX, textureY); // Box 91
		bodyModel[74] = new ModelRendererTurbo(this, 209, 225, textureX, textureY); // Box 92
		bodyModel[75] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 93
		bodyModel[76] = new ModelRendererTurbo(this, 305, 233, textureX, textureY); // Box 94
		bodyModel[77] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 95
		bodyModel[78] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 96
		bodyModel[79] = new ModelRendererTurbo(this, 353, 233, textureX, textureY); // Box 97
		bodyModel[80] = new ModelRendererTurbo(this, 169, 273, textureX, textureY); // Box 98
		bodyModel[81] = new ModelRendererTurbo(this, 273, 273, textureX, textureY); // Box 99
		bodyModel[82] = new ModelRendererTurbo(this, 49, 209, textureX, textureY); // Box 100
		bodyModel[83] = new ModelRendererTurbo(this, 401, 241, textureX, textureY); // Box 101
		bodyModel[84] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 102
		bodyModel[85] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 103
		bodyModel[86] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 104
		bodyModel[87] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 105
		bodyModel[88] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 106
		bodyModel[89] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 107
		bodyModel[90] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 108
		bodyModel[91] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 109
		bodyModel[92] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 110
		bodyModel[93] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 111
		bodyModel[94] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 112
		bodyModel[95] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 113
		bodyModel[96] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 114
		bodyModel[97] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 115
		bodyModel[98] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 116
		bodyModel[99] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 117
		bodyModel[100] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 118
		bodyModel[101] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 119
		bodyModel[102] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 120
		bodyModel[103] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 121
		bodyModel[104] = new ModelRendererTurbo(this, 465, 97, textureX, textureY); // Box 122
		bodyModel[105] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 123
		bodyModel[106] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 124
		bodyModel[107] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 125
		bodyModel[108] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 126
		bodyModel[109] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 127
		bodyModel[110] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 128
		bodyModel[111] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 129
		bodyModel[112] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 130
		bodyModel[113] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 131
		bodyModel[114] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 132
		bodyModel[115] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 133
		bodyModel[116] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 134
		bodyModel[117] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 135
		bodyModel[118] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 136
		bodyModel[119] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 137
		bodyModel[120] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 138
		bodyModel[121] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 139
		bodyModel[122] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 140
		bodyModel[123] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 141
		bodyModel[124] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 142
		bodyModel[125] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 143
		bodyModel[126] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 144
		bodyModel[127] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 145

		bodyModel[0].addShapeBox(0F, 0F, 0F, 1, 10, 42, 0F,38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(0F, -6F, -21F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 30, 10, 42, 0F,0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(39F, -6F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 22, 11, 34, 0F,0F, 0F, 0F, 0F, 0.5F, -4F, 0F, 0.5F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 3
		bodyModel[2].setRotationPoint(69F, -7F, -17F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 14, 11, 26, 0F,0F, 0.5F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 4
		bodyModel[3].setRotationPoint(91F, -7F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 9, 12, 18, 0F,0F, 0F, 0F, 0F, 0.2F, -4F, 0F, 0.2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 5
		bodyModel[4].setRotationPoint(105F, -8F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 4, 10, 0F,0F, 0F, 0F, -0.5F, 0.5F, -4.5F, -0.5F, 0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, -4F, 6F, 0F, -4F, 0F, 0F, 0F); // Box 6
		bodyModel[5].setRotationPoint(114F, 4F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 27, 10, 40, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(-65F, -6F, -20F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 21, 10, 34, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-86F, -6F, -17F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 17, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-103F, -6F, -12F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 10, 12, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-115F, -6F, -6F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 9, 10, 1, 0F,0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-124F, -6F, -0.5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 9.5F, 0F, 0F, 9.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9.5F, 0F, 0F, 9.5F, 0F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-126F, -5F, -2.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 9, 11, 10, 0F,0F, 0.2F, 0F, -2F, 0.5F, -4F, -2F, 0.5F, -4F, 0F, 0.2F, 0F, 0F, 1F, 0F, -0.5F, 0.5F, -4.5F, -0.5F, 0.5F, -4.5F, 0F, 1F, 0F); // Box 14
		bodyModel[12].setRotationPoint(114F, -8F, -5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, -2F, 0F, 0F); // Box 15
		bodyModel[13].setRotationPoint(-124F, 4F, -0.5F);

		bodyModel[14].addShapeBox(-4F, 0F, -12F, 8, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(59F, -8.5F, 0F);

		bodyModel[15].addShapeBox(-12F, 0F, -12F, 8, 2, 24, 0F,-0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -8F); // Box 17
		bodyModel[15].setRotationPoint(59F, -8.5F, 0F);

		bodyModel[16].addShapeBox(4F, 0F, -12F, 8, 2, 24, 0F,0F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, 0F, 0F, 0F); // Box 18
		bodyModel[16].setRotationPoint(59F, -8.5F, 0F);

		bodyModel[17].addShapeBox(4F, 0F, -12F, 8, 2, 24, 0F,0F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(-57F, -7.75F, 0F);

		bodyModel[18].addShapeBox(-12F, 0F, -12F, 8, 2, 24, 0F,-0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -8F, -0.5F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -8F); // Box 20
		bodyModel[18].setRotationPoint(-57F, -7.75F, 0F);

		bodyModel[19].addShapeBox(-4F, 0F, -12F, 8, 2, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-57F, -7.75F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 43, 5, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-20F, -10F, -19F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 4, 4, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[21].setRotationPoint(-27F, -10F, -21F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 4, 4, 42, 0F,0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F, 0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -3F); // Box 24
		bodyModel[22].setRotationPoint(-31F, -10F, -21F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 4, 4, 42, 0F,0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(-23F, -10F, -21F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 4, 4, 42, 0F,0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F); // Box 26
		bodyModel[24].setRotationPoint(22.5F, -10F, -21F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 4, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[25].setRotationPoint(26.5F, -10F, -21F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 42, 0F,0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(30.5F, -10F, -21F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 9, 8, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(34.5F, -14F, -17F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 3, 8, 34, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(43.5F, -14F, -17F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 8, 34, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 31
		bodyModel[29].setRotationPoint(30.5F, -14F, -17F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 7, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[30].setRotationPoint(36.5F, -23.5F, -5.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 7, 11, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 33
		bodyModel[31].setRotationPoint(43.5F, -23.5F, -5.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 6, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[32].setRotationPoint(38.5F, -18.5F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 4, 8, 34, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 35
		bodyModel[33].setRotationPoint(-31.5F, -14F, -17F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 3, 8, 32, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 36
		bodyModel[34].setRotationPoint(-44.5F, -14F, -16F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 10, 8, 32, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 37
		bodyModel[35].setRotationPoint(-41.5F, -14F, -16F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 4, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[36].setRotationPoint(-39F, -18.5F, -3F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[37].setRotationPoint(-40.5F, -23.5F, -5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 1, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[38].setRotationPoint(-126F, -25F, 0F);
		bodyModel[38].rotateAngleZ = 0.12217305F;

		bodyModel[39].addShapeBox(-18F, 0F, 0F, 18, 12, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 111
		bodyModel[39].setRotationPoint(-126F, -25F, 0F);
		bodyModel[39].rotateAngleZ = 0.12217305F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 1, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 52
		bodyModel[40].setRotationPoint(35.5F, -17.3F, -4F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 11, 3, 9, 0F,-3F, -0.2F, 0F, -3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 53
		bodyModel[41].setRotationPoint(35.5F, -19.3F, -13F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 54
		bodyModel[42].setRotationPoint(38.5F, -19.3F, -22F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 11, 3, 9, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F, -3F, -0.2F, 0F); // Box 55
		bodyModel[43].setRotationPoint(35.5F, -19.3F, 4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 3, 9, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 56
		bodyModel[44].setRotationPoint(38.5F, -19.3F, 13F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,-3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 59
		bodyModel[45].setRotationPoint(-44.5F, -19.3F, -15F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 60
		bodyModel[46].setRotationPoint(-41.5F, -19.3F, -23F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 8, 3, 22, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 61
		bodyModel[47].setRotationPoint(-44.5F, -19.3F, -11F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -3F, -0.2F, 0F); // Box 62
		bodyModel[48].setRotationPoint(-44.5F, -19.3F, 11F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 63
		bodyModel[49].setRotationPoint(-41.5F, -19.3F, 15F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 10, 29, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[50].setRotationPoint(0F, -38F, -2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 10, 29, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[51].setRotationPoint(0F, -38F, -5.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 29, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 66
		bodyModel[52].setRotationPoint(0F, -38F, 2.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F); // Box 70
		bodyModel[53].setRotationPoint(33F, -56.5F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.2F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 71
		bodyModel[54].setRotationPoint(33F, -56.5F, -1.5F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.6F, 22F, -0.6F, -0.6F, 22F, -0.6F, -0.6F, 22F, -0.6F, -0.6F, 22F, -0.6F); // Box 72
		bodyModel[55].setRotationPoint(35F, -85.5F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[56].setRotationPoint(35F, -67.5F, -11F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[57].setRotationPoint(34F, -53.5F, -15F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 75
		bodyModel[58].setRotationPoint(31F, -30.5F, -4F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, -2F, 0F, -3F); // Box 76
		bodyModel[59].setRotationPoint(31F, -28.5F, -4F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 77
		bodyModel[60].setRotationPoint(120F, -24F, -0.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[61].setRotationPoint(26.5F, -15F, -9F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[62].setRotationPoint(26.5F, -20F, -9F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 80
		bodyModel[63].setRotationPoint(30.5F, -20F, -9F);

		bodyModel[64].addShapeBox(0F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[64].setRotationPoint(32.5F, -8F, -18.5F);
		bodyModel[64].rotateAngleY = -0.73303829F;

		bodyModel[65].addShapeBox(0F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[65].setRotationPoint(13.5F, -8F, -24.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 9, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 84
		bodyModel[66].setRotationPoint(105F, 4F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 14, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 85
		bodyModel[67].setRotationPoint(91F, 4F, -13F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 22, 4, 34, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 86
		bodyModel[68].setRotationPoint(69F, 4F, -17F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 30, 4, 42, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 87
		bodyModel[69].setRotationPoint(39F, 4F, -21F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 42, 0F,38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F); // Box 88
		bodyModel[70].setRotationPoint(0F, 4F, -21F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 21, 4, 34, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F); // Box 89
		bodyModel[71].setRotationPoint(-86F, 4F, -17F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 17, 4, 24, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 90
		bodyModel[72].setRotationPoint(-103F, 4F, -12F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 12, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F); // Box 91
		bodyModel[73].setRotationPoint(-115F, 4F, -6F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 27, 4, 40, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 92
		bodyModel[74].setRotationPoint(-65F, 4F, -20F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 12, 5, 12, 0F,0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 0F, 0F, -1F, -2F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, -1F, -2F); // Box 93
		bodyModel[75].setRotationPoint(-115F, 8F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 17, 5, 24, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -3F); // Box 94
		bodyModel[76].setRotationPoint(-103F, 8F, -12F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 21, 5, 34, 0F,0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -4F); // Box 95
		bodyModel[77].setRotationPoint(-86F, 8F, -17F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 27, 5, 40, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -5F); // Box 96
		bodyModel[78].setRotationPoint(-65F, 8F, -20F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 42, 0F,38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, 0F, 38F, 0F, -5F, 38F, 0F, -5F, 38F, 0F, -5F, 38F, 0F, -5F); // Box 97
		bodyModel[79].setRotationPoint(0F, 8F, -21F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 30, 5, 42, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -5F); // Box 98
		bodyModel[80].setRotationPoint(39F, 8F, -21F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 22, 5, 34, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -5F); // Box 99
		bodyModel[81].setRotationPoint(69F, 8F, -17F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 9, 5, 18, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, -0.5F, -3F, 0F, -1F, -6F, 0F, -1F, -6F, 0F, -0.5F, -3F); // Box 100
		bodyModel[82].setRotationPoint(105F, 8F, -9F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 14, 5, 26, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, -7F, 0F, -0.5F, -7F, 0F, 0F, -5F); // Box 101
		bodyModel[83].setRotationPoint(91F, 8F, -13F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 9, 5, 10, 0F,0F, 0F, 0F, 6F, 0F, -4F, 6F, 0F, -4F, 0F, 0F, 0F, 0F, -1F, -2F, 3.5F, -2.5F, -4.5F, 3.5F, -2.5F, -4.5F, 0F, -1F, -2F); // Box 102
		bodyModel[84].setRotationPoint(114F, 8F, -5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 9, 4, 1, 0F,-2F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, -2F, 0F, 0F, -5F, -1F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, -5F, -1F, 0F); // Box 103
		bodyModel[85].setRotationPoint(-124F, 8F, -0.5F);

		bodyModel[86].addShapeBox(0F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[86].setRotationPoint(-0.5F, -8F, -24.5F);

		bodyModel[87].addShapeBox(0F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[87].setRotationPoint(-14.5F, -8F, -24.5F);

		bodyModel[88].addShapeBox(0F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[88].setRotationPoint(13.5F, -8F, 18.5F);

		bodyModel[89].addShapeBox(0F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[89].setRotationPoint(-0.5F, -8F, 18.5F);

		bodyModel[90].addShapeBox(0F, 0F, -0.5F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[90].setRotationPoint(-14.5F, -8F, 18.5F);

		bodyModel[91].addShapeBox(0F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[91].setRotationPoint(-28.5F, -8F, -18.5F);
		bodyModel[91].rotateAngleY = -2.30383461F;

		bodyModel[92].addShapeBox(0F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[92].setRotationPoint(32.5F, -8F, 18.5F);
		bodyModel[92].rotateAngleY = -5.44542727F;

		bodyModel[93].addShapeBox(0F, 0F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[93].setRotationPoint(-28.5F, -8F, 19.5F);
		bodyModel[93].rotateAngleY = -3.9618974F;

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[94].setRotationPoint(26.5F, -15F, 5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[95].setRotationPoint(26.5F, -20F, 5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 114
		bodyModel[96].setRotationPoint(30.5F, -20F, 5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 115
		bodyModel[97].setRotationPoint(12.5F, -20F, -9F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[98].setRotationPoint(8.5F, -20F, -9F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[99].setRotationPoint(8.5F, -15F, -9F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 118
		bodyModel[100].setRotationPoint(12.5F, -20F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[101].setRotationPoint(8.5F, -20F, 5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[102].setRotationPoint(8.5F, -15F, 5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 10, 29, 3, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[103].setRotationPoint(14F, -38F, -5.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 10, 29, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[104].setRotationPoint(14F, -38F, -2.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 10, 29, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 123
		bodyModel[105].setRotationPoint(14F, -38F, 2.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[106].setRotationPoint(-15.5F, -20F, -2F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 125
		bodyModel[107].setRotationPoint(-11.5F, -20F, -2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[108].setRotationPoint(-15.5F, -15F, -2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F, -0.3F, 40F, -0.3F); // Box 127
		bodyModel[109].setRotationPoint(-34.5F, -56.5F, -1F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -3F, -4F, 0F, -3F, -4F, 0F, -3F, -2F, 0F, -3F); // Box 128
		bodyModel[110].setRotationPoint(-36.5F, -28.5F, -4F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[111].setRotationPoint(-36.5F, -30.5F, -4F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[112].setRotationPoint(-33.5F, -53.5F, -15F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0.2F, 0F, 0F, 4.2F, 0F, 0F, 4.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 131
		bodyModel[113].setRotationPoint(-34.5F, -56.5F, -1.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.8F, 0F, -0.8F, -0.6F, 22F, -0.6F, -0.6F, 22F, -0.6F, -0.6F, 22F, -0.6F, -0.6F, 22F, -0.6F); // Box 132
		bodyModel[114].setRotationPoint(-32.5F, -85.5F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[115].setRotationPoint(-32.5F, -67.5F, -11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 134
		bodyModel[116].setRotationPoint(-18.5F, -20F, -6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[117].setRotationPoint(-22.5F, -20F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[118].setRotationPoint(-22.5F, -15F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 137
		bodyModel[119].setRotationPoint(-18.5F, -20F, 2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[120].setRotationPoint(-22.5F, -20F, 2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[121].setRotationPoint(-22.5F, -15F, 2F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 140
		bodyModel[122].setRotationPoint(-3.5F, -20F, 4F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[123].setRotationPoint(-7.5F, -20F, 4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[124].setRotationPoint(-7.5F, -15F, 4F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 143
		bodyModel[125].setRotationPoint(-1.5F, -20F, -8F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[126].setRotationPoint(-5.5F, -20F, -8F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 145
		bodyModel[127].setRotationPoint(-5.5F, -15F, -8F);
	}

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[5];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 41
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 42
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 43
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 44
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 45

		gun_1_Model[0][0].addShapeBox(-10F, -2F, -4F, 9, 4, 8, 0F,0F, 0.5F, -1.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0.5F, -1.5F, -2F, 0.5F, 2F, 0F, 0.5F, 6F, 0F, 0.5F, 6F, -2F, 0.5F, 2F); // Box 41

		gun_1_Model[0][1].addShapeBox(-11F, -2F, -4F, 1, 4, 8, 0F,0F, 0.5F, -3F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -3F, 0F, 0.5F, -1.5F, 2F, 0.5F, 2F, 2F, 0.5F, 2F, 0F, 0.5F, -1.5F); // Box 42

		gun_1_Model[0][2].addShapeBox(-1F, -2.5F, -4F, 9, 5, 8, 0F,0F, -0.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43

		gun_1_Model[0][3].addShapeBox(-1F, -2.5F, -9F, 9, 5, 5, 0F,0F, -0.5F, -2.5F, -5F, -1.5F, -3F, -2F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, -2.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44

		gun_1_Model[0][4].addShapeBox(-1F, -2.5F, 4F, 9, 5, 5, 0F,0F, -0.5F, 0F, -2F, -1.5F, 0F, -5F, -1.5F, -3F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, -1F, 0F, 0F, 1F); // Box 45

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(59F, -11F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[4];
		gun_1_Model[1][0] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 46
		gun_1_Model[1][1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 47
		gun_1_Model[1][2] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 48
		gun_1_Model[1][3] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 49

		gun_1_Model[1][0].addShapeBox(-1F, -1F, -3F, 11, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 46

		gun_1_Model[1][1].addShapeBox(9F, -1F, -3F, 10, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.5F); // Box 47

		gun_1_Model[1][2].addShapeBox(-1F, -1F, 1F, 11, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 48

		gun_1_Model[1][3].addShapeBox(9F, -1F, 1F, 10, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.5F); // Box 49

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[1])
		{
			gunPart.setRotationPoint(59F, -11F, 0F);
		}


		gun_1_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("FrontGun", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[5];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 41
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 42
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 43
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 44
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 45

		gun_2_Model[0][0].addShapeBox(-10F, -2F, -4F, 9, 4, 8, 0F,0F, 0.5F, -1.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0.5F, -1.5F, -2F, 0.5F, 2F, 0F, 0.5F, 6F, 0F, 0.5F, 6F, -2F, 0.5F, 2F); // Box 41

		gun_2_Model[0][1].addShapeBox(-11F, -2F, -4F, 1, 4, 8, 0F,0F, 0.5F, -3F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -3F, 0F, 0.5F, -1.5F, 2F, 0.5F, 2F, 2F, 0.5F, 2F, 0F, 0.5F, -1.5F); // Box 42

		gun_2_Model[0][2].addShapeBox(-1F, -2.5F, -4F, 9, 5, 8, 0F,0F, -0.5F, 0F, -2F, -1.5F, 0F, -2F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43

		gun_2_Model[0][3].addShapeBox(-1F, -2.5F, -9F, 9, 5, 5, 0F,0F, -0.5F, -2.5F, -5F, -1.5F, -3F, -2F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, -2.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 44

		gun_2_Model[0][4].addShapeBox(-1F, -2.5F, 4F, 9, 5, 5, 0F,0F, -0.5F, 0F, -2F, -1.5F, 0F, -5F, -1.5F, -3F, 0F, -0.5F, -2.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2.5F, 0F, -1F, 0F, 0F, 1F); // Box 45

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(-57F, -10.3F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[4];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 46
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 47
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 48
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 49

		gun_2_Model[1][0].addShapeBox(-1F, -1F, -3F, 11, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 46

		gun_2_Model[1][1].addShapeBox(9F, -1F, -3F, 10, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.5F); // Box 47

		gun_2_Model[1][2].addShapeBox(-1F, -1F, 1F, 11, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 48

		gun_2_Model[1][3].addShapeBox(9F, -1F, 1F, 10, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.5F, -0.5F); // Box 49

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(-57F, -10.3F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RearGun", gun_2_Model);
	}
}