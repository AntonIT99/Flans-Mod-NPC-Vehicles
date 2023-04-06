//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Habsburg
// Model Creator: 
// Created on: 01.08.2020 - 11:43:48
// Last changed on: 01.08.2020 - 11:43:48

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelHabsburg extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelHabsburg() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[144];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 16
		bodyModel[15] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 17
		bodyModel[16] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 18
		bodyModel[17] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 19
		bodyModel[18] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 20
		bodyModel[19] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 21
		bodyModel[20] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 22
		bodyModel[21] = new ModelRendererTurbo(this, 105, 1, textureX, textureY); // Box 23
		bodyModel[22] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 24
		bodyModel[23] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 25
		bodyModel[24] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 26
		bodyModel[25] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 27
		bodyModel[26] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 28
		bodyModel[27] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 29
		bodyModel[28] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 30
		bodyModel[29] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 31
		bodyModel[30] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 32
		bodyModel[31] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 36
		bodyModel[32] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 37
		bodyModel[33] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 38
		bodyModel[34] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 46
		bodyModel[35] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 47
		bodyModel[36] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 48
		bodyModel[37] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 49
		bodyModel[38] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 50
		bodyModel[39] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 51
		bodyModel[40] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 52
		bodyModel[41] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 53
		bodyModel[42] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 55
		bodyModel[43] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 56
		bodyModel[44] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 57
		bodyModel[45] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 58
		bodyModel[46] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 59
		bodyModel[47] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 60
		bodyModel[48] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 61
		bodyModel[49] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 62
		bodyModel[50] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 63
		bodyModel[51] = new ModelRendererTurbo(this, 289, 49, textureX, textureY); // Box 64
		bodyModel[52] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 65
		bodyModel[53] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 66
		bodyModel[54] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 67
		bodyModel[55] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 68
		bodyModel[56] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 69
		bodyModel[57] = new ModelRendererTurbo(this, 129, 89, textureX, textureY); // Box 70
		bodyModel[58] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 71
		bodyModel[59] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 72
		bodyModel[60] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 73
		bodyModel[61] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 74
		bodyModel[62] = new ModelRendererTurbo(this, 249, 73, textureX, textureY); // Box 75
		bodyModel[63] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 76
		bodyModel[64] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 77
		bodyModel[65] = new ModelRendererTurbo(this, 129, 105, textureX, textureY); // Box 78
		bodyModel[66] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 79
		bodyModel[67] = new ModelRendererTurbo(this, 73, 105, textureX, textureY); // Box 80
		bodyModel[68] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 81
		bodyModel[69] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 82
		bodyModel[70] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 83
		bodyModel[71] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 84
		bodyModel[72] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 86
		bodyModel[73] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 87
		bodyModel[74] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 88
		bodyModel[75] = new ModelRendererTurbo(this, 185, 9, textureX, textureY); // Box 89
		bodyModel[76] = new ModelRendererTurbo(this, 297, 65, textureX, textureY); // Box 90
		bodyModel[77] = new ModelRendererTurbo(this, 217, 9, textureX, textureY); // Box 91
		bodyModel[78] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 92
		bodyModel[79] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 93
		bodyModel[80] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 94
		bodyModel[81] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 95
		bodyModel[82] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 96
		bodyModel[83] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 97
		bodyModel[84] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 78
		bodyModel[85] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 79
		bodyModel[86] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 80
		bodyModel[87] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 101
		bodyModel[88] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 110
		bodyModel[91] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 111
		bodyModel[92] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 112
		bodyModel[93] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 113
		bodyModel[94] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 114
		bodyModel[95] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 115
		bodyModel[96] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 116
		bodyModel[97] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 117
		bodyModel[98] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 118
		bodyModel[99] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 119
		bodyModel[100] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 120
		bodyModel[101] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 121
		bodyModel[102] = new ModelRendererTurbo(this, 209, 129, textureX, textureY); // Box 160
		bodyModel[103] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 161
		bodyModel[104] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 162
		bodyModel[105] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 163
		bodyModel[106] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 164
		bodyModel[107] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 165
		bodyModel[108] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 166
		bodyModel[109] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 167
		bodyModel[110] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 168
		bodyModel[111] = new ModelRendererTurbo(this, 297, 193, textureX, textureY); // Box 169
		bodyModel[112] = new ModelRendererTurbo(this, 161, 137, textureX, textureY); // Box 170
		bodyModel[113] = new ModelRendererTurbo(this, 265, 137, textureX, textureY); // Box 171
		bodyModel[114] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 172
		bodyModel[115] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 173
		bodyModel[116] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 174
		bodyModel[117] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 175
		bodyModel[118] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 176
		bodyModel[119] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 177
		bodyModel[120] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 178
		bodyModel[121] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 179
		bodyModel[122] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 180
		bodyModel[123] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 181
		bodyModel[124] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 182
		bodyModel[125] = new ModelRendererTurbo(this, 265, 121, textureX, textureY); // Box 183
		bodyModel[126] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 184
		bodyModel[127] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 185
		bodyModel[128] = new ModelRendererTurbo(this, 393, 121, textureX, textureY); // Box 186
		bodyModel[129] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 187
		bodyModel[130] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 188
		bodyModel[131] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 189
		bodyModel[132] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 190
		bodyModel[133] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 191
		bodyModel[134] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 192
		bodyModel[135] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 193
		bodyModel[136] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 194
		bodyModel[137] = new ModelRendererTurbo(this, 401, 17, textureX, textureY); // Box 195
		bodyModel[138] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 196
		bodyModel[139] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 197
		bodyModel[140] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 198
		bodyModel[141] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 199
		bodyModel[142] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 200
		bodyModel[143] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 201

		bodyModel[0].addShapeBox(0F, 0F, 0F, 8, 9, 36, 0F,25F, 0F, -1F, 25F, 0F, -1F, 25F, 0F, -1F, 25F, 0F, -1F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-4F, 0F, -18F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 21, 9, 36, 0F,0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[1].setRotationPoint(-50F, 0F, -18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 18, 9, 35, 0F,0F, 0.2F, -3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.2F, -3F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F); // Box 3
		bodyModel[2].setRotationPoint(-68F, 0F, -17.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 18, 9, 31, 0F,0F, 0.5F, -5F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.5F, -5F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F); // Box 4
		bodyModel[3].setRotationPoint(-86F, 0F, -15.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 11, 9, 23, 0F,0F, 1F, -5.5F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 1F, -5.5F, 0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F); // Box 5
		bodyModel[4].setRotationPoint(-97F, 0F, -11.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 10, 10, 14, 0F,0F, 0.2F, -5.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.2F, -5.5F, 1F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, -5F); // Box 6
		bodyModel[5].setRotationPoint(-107F, -1F, -7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 21, 9, 36, 0F,0F, 0F, -1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 7
		bodyModel[6].setRotationPoint(29F, 0F, -18F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 20, 9, 32, 0F,0F, 0F, -1F, 0F, 0.8F, -3.5F, 0F, 0.8F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(50F, 0F, -16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 13, 10, 20, 0F,0F, 0.2F, 0F, 0F, 0.8F, -4F, 0F, 0.8F, -4F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(82F, -1F, -10F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 12, 9, 26, 0F,0F, 0.8F, -0.5F, 0F, 1.2F, -3F, 0F, 1.2F, -3F, 0F, 0.8F, -0.5F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 11
		bodyModel[9].setRotationPoint(70F, 0F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 7, 12, 0F,0F, -0.2F, 0F, -0.5F, 0F, -5.5F, -0.5F, 0F, -5.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0F, 0F, 0F); // Box 12
		bodyModel[10].setRotationPoint(95F, -2F, -6F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 4, 12, 0F,0F, 0F, 0F, 0.5F, 0F, -5.5F, 0.5F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -5.5F, 2F, 0F, -5.5F, 0F, 0F, 0F); // Box 13
		bodyModel[11].setRotationPoint(95F, 5F, -6F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 14
		bodyModel[12].setRotationPoint(103F, -14F, -0.5F);
		bodyModel[12].rotateAngleZ = 0.03490659F;

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 15
		bodyModel[13].setRotationPoint(103.2F, -6F, -0.5F);
		bodyModel[13].rotateAngleZ = -0.2443461F;

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 11, 35, 0F,25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F); // Box 16
		bodyModel[14].setRotationPoint(-4F, -6.5F, -17.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 9, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[15].setRotationPoint(-37F, -6.5F, -17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 9, 34, 0F,0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F, 0F, 0F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -11F); // Box 18
		bodyModel[16].setRotationPoint(-47F, -6.5F, -17F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 11, 9, 33, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[17].setRotationPoint(29F, -6.5F, -16.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 9, 9, 33, 0F,0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, 0F); // Box 20
		bodyModel[18].setRotationPoint(40F, -6.5F, -16.5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 11, 3, 0F,-3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[19].setRotationPoint(-29F, -7F, -20.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[20].setRotationPoint(-22F, -7F, -20.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,-1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 23
		bodyModel[21].setRotationPoint(24F, -7F, -19.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 11, 3, 0F,0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[22].setRotationPoint(27F, -7F, -19.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 7, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F); // Box 25
		bodyModel[23].setRotationPoint(-29F, -7F, 17.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F); // Box 26
		bodyModel[24].setRotationPoint(-22F, -7F, 17.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 3, 11, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F); // Box 27
		bodyModel[25].setRotationPoint(24F, -7F, 16.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 7, 11, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[26].setRotationPoint(27F, -7F, 16.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 3, 13, 3, 0F,0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.5F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[27].setRotationPoint(3F, -9F, -20.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 5, 13, 3, 0F,-2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 30
		bodyModel[28].setRotationPoint(-2F, -9F, -20.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 13, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F); // Box 31
		bodyModel[29].setRotationPoint(3F, -9F, 17.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 5, 13, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.5F); // Box 32
		bodyModel[30].setRotationPoint(-2F, -9F, 17.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 26, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 36
		bodyModel[31].setRotationPoint(20F, -31.5F, -4.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 26, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[32].setRotationPoint(17F, -31.5F, -4.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 3, 26, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 38
		bodyModel[33].setRotationPoint(14F, -31.5F, -4.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 10, 4, 14, 0F,0F, 0.2F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -4.5F, 0.5F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0.5F, 0F, -4F); // Box 46
		bodyModel[34].setRotationPoint(-111F, -0.5F, -7F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 47
		bodyModel[35].setRotationPoint(35F, -24.5F, -3F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 45, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[36].setRotationPoint(37F, -64.5F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[37].setRotationPoint(36F, -19.5F, -2F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 50
		bodyModel[38].setRotationPoint(34.5F, -18.5F, -3.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 1, 1, 24, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 51
		bodyModel[39].setRotationPoint(37.5F, -41.5F, -12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 52
		bodyModel[40].setRotationPoint(37.5F, -54.5F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 53
		bodyModel[41].setRotationPoint(37.5F, -60.5F, -5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 55
		bodyModel[42].setRotationPoint(34F, -20.5F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 56
		bodyModel[43].setRotationPoint(37F, -33F, -1.5F);

		bodyModel[44].addShapeBox(0F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[44].setRotationPoint(1.5F, -4.5F, -20F);

		bodyModel[45].addShapeBox(0F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[45].setRotationPoint(1.5F, 0.5F, -20F);

		bodyModel[46].addShapeBox(-0.5F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[46].setRotationPoint(30.5F, 0.5F, -19F);
		bodyModel[46].rotateAngleY = 0.78539816F;

		bodyModel[47].addShapeBox(-0.5F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[47].setRotationPoint(30.5F, -4.5F, -19F);
		bodyModel[47].rotateAngleY = 0.78539816F;

		bodyModel[48].addShapeBox(-0.5F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[48].setRotationPoint(-25.5F, 0.5F, -20F);
		bodyModel[48].rotateAngleY = -0.78539816F;

		bodyModel[49].addShapeBox(-0.5F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[49].setRotationPoint(-25.5F, -4.5F, -20F);
		bodyModel[49].rotateAngleY = -0.78539816F;

		bodyModel[50].addShapeBox(-0.5F, 0F, -8F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 63
		bodyModel[50].setRotationPoint(-29.5F, 0.5F, 26F);
		bodyModel[50].rotateAngleY = 0.57595865F;

		bodyModel[51].addShapeBox(-0.5F, 0F, -8F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 64
		bodyModel[51].setRotationPoint(-29.5F, -4.5F, 26F);
		bodyModel[51].rotateAngleY = 0.57595865F;

		bodyModel[52].addShapeBox(0F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[52].setRotationPoint(1.5F, -4.5F, 26F);

		bodyModel[53].addShapeBox(-0.5F, 0F, -8F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[53].setRotationPoint(36F, -4.5F, 24F);
		bodyModel[53].rotateAngleY = -0.78539816F;

		bodyModel[54].addShapeBox(0F, 0F, -6F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[54].setRotationPoint(1.5F, 0.5F, 26F);

		bodyModel[55].addShapeBox(-0.5F, 0F, -8F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[55].setRotationPoint(36F, 0.5F, 24F);
		bodyModel[55].rotateAngleY = -0.78539816F;

		bodyModel[56].addShapeBox(-6F, 1.5F, -2F, 12, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[56].setRotationPoint(58.5F, -4.5F, 0F);

		bodyModel[57].addShapeBox(-6F, 1.5F, -6F, 12, 9, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[57].setRotationPoint(58.5F, -4.5F, 0F);

		bodyModel[58].addShapeBox(-6F, 1.5F, 2F, 12, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 71
		bodyModel[58].setRotationPoint(58.5F, -4.5F, 0F);

		bodyModel[59].addShapeBox(-6F, 1.5F, 2F, 12, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 72
		bodyModel[59].setRotationPoint(-55F, -4F, 0F);

		bodyModel[60].addShapeBox(-6F, 1.5F, -2F, 12, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[60].setRotationPoint(-55F, -4F, 0F);

		bodyModel[61].addShapeBox(-6F, 1.5F, -6F, 12, 9, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyModel[61].setRotationPoint(-55F, -4F, 0F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 11, 2, 7, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Box 75
		bodyModel[62].setRotationPoint(38F, -11F, -3.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 2, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[63].setRotationPoint(34F, -11F, -12.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 15, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 77
		bodyModel[64].setRotationPoint(34F, -13.8F, -7.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 11, 1, 7, 0F,0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F, 0F, -0.2F, 2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 2F); // Box 78
		bodyModel[65].setRotationPoint(38F, -13.8F, -3.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 5, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[66].setRotationPoint(28F, -11F, -5.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 3, 9, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 80
		bodyModel[67].setRotationPoint(30F, -13.8F, -4.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 81
		bodyModel[68].setRotationPoint(34F, -13F, -7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 82
		bodyModel[69].setRotationPoint(37F, -13F, -7.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 83
		bodyModel[70].setRotationPoint(34F, -13F, 6.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 84
		bodyModel[71].setRotationPoint(37F, -13F, 6.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 86
		bodyModel[72].setRotationPoint(48F, -13F, -3.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 87
		bodyModel[73].setRotationPoint(48F, -13F, 2.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 88
		bodyModel[74].setRotationPoint(48F, -13F, 0.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 89
		bodyModel[75].setRotationPoint(48F, -13F, -1.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 1F); // Box 90
		bodyModel[76].setRotationPoint(43F, -9F, -2F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 91
		bodyModel[77].setRotationPoint(41F, -13F, -4.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 92
		bodyModel[78].setRotationPoint(41F, -13F, 3.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 93
		bodyModel[79].setRotationPoint(45F, -13F, 3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 94
		bodyModel[80].setRotationPoint(45F, -13F, -4F);

		bodyModel[81].addShapeBox(-9.5F, -1F, 0F, 10, 8, 1, 0F,-0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F); // Box 95
		bodyModel[81].setRotationPoint(103F, -14F, -0.5F);
		bodyModel[81].rotateAngleZ = 0.10471976F;

		bodyModel[82].addShapeBox(-12.5F, 0F, 0F, 13, 8, 1, 0F,-0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F); // Box 96
		bodyModel[82].setRotationPoint(-110F, -16F, -0.5F);
		bodyModel[82].rotateAngleZ = 0.33161256F;

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 16, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 97
		bodyModel[83].setRotationPoint(-110F, -16F, -0.5F);
		bodyModel[83].rotateAngleZ = 0.26179939F;

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[84].setRotationPoint(24.5F, -12F, -15F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[85].setRotationPoint(24.5F, -17F, -15F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 80
		bodyModel[86].setRotationPoint(28.5F, -17F, -15F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[87].setRotationPoint(24.5F, -12F, -9F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[88].setRotationPoint(24.5F, -17F, -9F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 103
		bodyModel[89].setRotationPoint(28.5F, -17F, -9F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 110
		bodyModel[90].setRotationPoint(12.5F, -17F, -7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[91].setRotationPoint(8.5F, -17F, -7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 112
		bodyModel[92].setRotationPoint(8.5F, -12F, -7F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 113
		bodyModel[93].setRotationPoint(2.5F, -17F, -7F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[94].setRotationPoint(-1.5F, -17F, -7F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 115
		bodyModel[95].setRotationPoint(-1.5F, -12F, -7F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 116
		bodyModel[96].setRotationPoint(-13.5F, -17F, -7F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[97].setRotationPoint(-17.5F, -17F, -7F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[98].setRotationPoint(-17.5F, -12F, -7F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 119
		bodyModel[99].setRotationPoint(-23.5F, -17F, -7F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[100].setRotationPoint(-27.5F, -17F, -7F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[101].setRotationPoint(-27.5F, -12F, -7F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 14, 36, 0F,25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, 0F, 25F, 0F, -3F, 25F, 0F, -3F, 25F, 0F, -3F, 25F, 0F, -3F); // Box 160
		bodyModel[102].setRotationPoint(-4F, 9F, -18F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 21, 14, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -4.5F); // Box 161
		bodyModel[103].setRotationPoint(-50F, 9F, -18F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 18, 14, 35, 0F,0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -6F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -6F); // Box 162
		bodyModel[104].setRotationPoint(-68F, 9F, -17.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 18, 11, 31, 0F,0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, -9F, 0F, 3F, -4F, 0F, 3F, -4F, 0F, 0F, -9F); // Box 163
		bodyModel[105].setRotationPoint(-86F, 9F, -15.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 11, 11, 23, 0F,0F, 0F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, 0F, -2F, -9.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, -2F, -9.5F); // Box 164
		bodyModel[106].setRotationPoint(-97F, 9F, -11.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 10, 9, 14, 0F,1F, 0F, -5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, -5F, -3F, -3F, -6F, 0F, 0F, -5F, 0F, 0F, -5F, -3F, -3F, -6F); // Box 165
		bodyModel[107].setRotationPoint(-107F, 9F, -7F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 21, 14, 36, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -3F); // Box 166
		bodyModel[108].setRotationPoint(29F, 9F, -18F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 20, 14, 32, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -3F); // Box 167
		bodyModel[109].setRotationPoint(50F, 9F, -16F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 12, 14, 26, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -3.5F); // Box 168
		bodyModel[110].setRotationPoint(70F, 9F, -13F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 13, 11, 20, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 3F, -3F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 3F, -3F); // Box 169
		bodyModel[111].setRotationPoint(82F, 9F, -10F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 10, 4, 12, 0F,0F, 0F, 0F, 2F, 0F, -5.5F, 2F, 0F, -5.5F, 0F, 0F, 0F, 0F, 0F, -0.8F, 3.5F, 0F, -5.5F, 3.5F, 0F, -5.5F, 0F, 0F, -0.8F); // Box 170
		bodyModel[112].setRotationPoint(95F, 9F, -6F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 10, 4, 12, 0F,0F, 0F, -0.8F, 3.5F, 0F, -5.5F, 3.5F, 0F, -5.5F, 0F, 0F, -0.8F, 0F, 3F, -2F, 1F, 0F, -5.5F, 1F, 0F, -5.5F, 0F, 3F, -2F); // Box 171
		bodyModel[113].setRotationPoint(95F, 13F, -6F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 10, 9, 2, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[114].setRotationPoint(-104F, 14F, -1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[115].setRotationPoint(24.5F, -12F, 11F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[116].setRotationPoint(24.5F, -17F, 11F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 175
		bodyModel[117].setRotationPoint(28.5F, -17F, 11F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[118].setRotationPoint(24.5F, -12F, 5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[119].setRotationPoint(24.5F, -17F, 5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 178
		bodyModel[120].setRotationPoint(28.5F, -17F, 5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 179
		bodyModel[121].setRotationPoint(12.5F, -17F, 3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[122].setRotationPoint(8.5F, -17F, 3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[123].setRotationPoint(8.5F, -12F, 3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 182
		bodyModel[124].setRotationPoint(2.5F, -17F, 3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[125].setRotationPoint(-1.5F, -17F, 3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[126].setRotationPoint(-1.5F, -12F, 3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 185
		bodyModel[127].setRotationPoint(-13.5F, -17F, 3F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[128].setRotationPoint(-17.5F, -17F, 3F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[129].setRotationPoint(-17.5F, -12F, 3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F); // Box 188
		bodyModel[130].setRotationPoint(-23.5F, -17F, 3F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-1.5F, -1F, 0F, 1F, 0.2F, 0F, 1F, 0.2F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[131].setRotationPoint(-27.5F, -17F, 3F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 4, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[132].setRotationPoint(-27.5F, -12F, 3F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 191
		bodyModel[133].setRotationPoint(-39F, -20.5F, -4F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 4, 14, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[134].setRotationPoint(-37F, -19.5F, -2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 193
		bodyModel[135].setRotationPoint(-38.5F, -18.5F, -3.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 45, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[136].setRotationPoint(-36F, -64.5F, -1F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 195
		bodyModel[137].setRotationPoint(-38F, -24.5F, -3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 24, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 196
		bodyModel[138].setRotationPoint(-35.5F, -41.5F, -12F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 14, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 197
		bodyModel[139].setRotationPoint(-35.5F, -54.5F, -7F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 198
		bodyModel[140].setRotationPoint(-35.5F, -60.5F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 26, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[141].setRotationPoint(-8F, -31.5F, -4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 26, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 200
		bodyModel[142].setRotationPoint(-5F, -31.5F, -4.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 3, 26, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 201
		bodyModel[143].setRotationPoint(-11F, -31.5F, -4.5F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[6];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 146
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 147
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 148
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 149
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 150
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 151

		gun_2_Model[0][0].addShapeBox(-8.5F, -0.5F, -2F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146

		gun_2_Model[0][1].addShapeBox(-8.5F, -0.5F, -6F, 14, 2, 4, 0F,-6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147

		gun_2_Model[0][2].addShapeBox(-8.5F, -0.5F, 2F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F); // Box 148

		gun_2_Model[0][3].addShapeBox(-8.5F, -1.5F, -2F, 14, 1, 4, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149

		gun_2_Model[0][4].addShapeBox(-8.5F, -1.5F, -6F, 14, 1, 4, 0F,-6.5F, 0F, -2F, -3.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150

		gun_2_Model[0][5].addShapeBox(-8.5F, -1.5F, 2F, 14, 1, 4, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, -2F, -6.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F); // Box 151

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(58.5F, -4.5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[8];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 152
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 153
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 154
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 155
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 156
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 157
		gun_2_Model[1][6] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 158
		gun_2_Model[1][7] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 159

		gun_2_Model[1][0].addShapeBox(0F, -1.2F, -2.5F, 7, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 152

		gun_2_Model[1][1].addShapeBox(0F, -1.2F, 0.5F, 7, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 153

		gun_2_Model[1][2].addShapeBox(7F, -1.2F, 0.5F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 154

		gun_2_Model[1][3].addShapeBox(7F, -1.2F, -2.5F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 155

		gun_2_Model[1][4].addShapeBox(9F, -1.2F, -2.5F, 3, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 156

		gun_2_Model[1][5].addShapeBox(12F, -1.2F, -2.5F, 5, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 157

		gun_2_Model[1][6].addShapeBox(12F, -1.2F, 0.5F, 5, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 158

		gun_2_Model[1][7].addShapeBox(9F, -1.2F, 0.5F, 3, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 159

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(58.5F, -4.5F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[6];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 273, 113, textureX, textureY); // Box 146
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 17, 129, textureX, textureY); // Box 147
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 148
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 149
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 150
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 151

		gun_3_Model[0][0].addShapeBox(-8.5F, -0.5F, -2F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146

		gun_3_Model[0][1].addShapeBox(-8.5F, -0.5F, -6F, 14, 2, 4, 0F,-6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147

		gun_3_Model[0][2].addShapeBox(-8.5F, -0.5F, 2F, 14, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F); // Box 148

		gun_3_Model[0][3].addShapeBox(-8.5F, -1.5F, -2F, 14, 1, 4, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149

		gun_3_Model[0][4].addShapeBox(-8.5F, -1.5F, -6F, 14, 1, 4, 0F,-6.5F, 0F, -2F, -3.5F, 0F, -2F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -6.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150

		gun_3_Model[0][5].addShapeBox(-8.5F, -1.5F, 2F, 14, 1, 4, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -3.5F, 0F, -2F, -6.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -6.5F, 0F, -0.5F); // Box 151

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-55F, -4F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[8];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 152
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 153
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 154
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 155
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 156
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 361, 49, textureX, textureY); // Box 157
		gun_3_Model[1][6] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 158
		gun_3_Model[1][7] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 159

		gun_3_Model[1][0].addShapeBox(0F, -1.2F, -2.5F, 7, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 152

		gun_3_Model[1][1].addShapeBox(0F, -1.2F, 0.5F, 7, 2, 2, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 153

		gun_3_Model[1][2].addShapeBox(7F, -1.2F, 0.5F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 154

		gun_3_Model[1][3].addShapeBox(7F, -1.2F, -2.5F, 2, 2, 2, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 155

		gun_3_Model[1][4].addShapeBox(9F, -1.2F, -2.5F, 3, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 156

		gun_3_Model[1][5].addShapeBox(12F, -1.2F, -2.5F, 5, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 157

		gun_3_Model[1][6].addShapeBox(12F, -1.2F, 0.5F, 5, 2, 2, 0F,0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F); // Box 158

		gun_3_Model[1][7].addShapeBox(9F, -1.2F, 0.5F, 3, 2, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 159

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-55F, -4F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);
	}
}