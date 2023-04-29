//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.10.2016 - 12:09:13
// Last changed on: 05.10.2016 - 12:09:13

package com.wolffsmod.model.lizard; //Path where the model is located

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.model.ModelFlanVehicle;

public class ModelM113A3 extends ModelFlanVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelM113A3() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[139];
		bodyDoorOpenModel = new ModelRendererTurbo[1];
		bodyDoorCloseModel = new ModelRendererTurbo[4];
		turretModel = new ModelRendererTurbo[27];
		barrelModel = new ModelRendererTurbo[64];
		leftTrackWheelModels = new ModelRendererTurbo[21];
		rightTrackWheelModels = new ModelRendererTurbo[21];
		leftTrackModel = new ModelRendererTurbo[13];
		rightTrackModel = new ModelRendererTurbo[13];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 633, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 633, 17, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 11
		bodyModel[10] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 12
		bodyModel[11] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 13
		bodyModel[12] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 14
		bodyModel[13] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 15
		bodyModel[14] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 17
		bodyModel[15] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 18
		bodyModel[16] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 19
		bodyModel[17] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 20
		bodyModel[18] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 21
		bodyModel[19] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 22
		bodyModel[20] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Body
		bodyModel[21] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Body
		bodyModel[22] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Body
		bodyModel[23] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Body
		bodyModel[24] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Body
		bodyModel[25] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Body
		bodyModel[26] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Body
		bodyModel[27] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 37
		bodyModel[31] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 945, 41, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 44
		bodyModel[34] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 55
		bodyModel[35] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 167
		bodyModel[36] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 168
		bodyModel[37] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 169
		bodyModel[38] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 170
		bodyModel[39] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 171
		bodyModel[40] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 179
		bodyModel[41] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 180
		bodyModel[42] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 65
		bodyModel[43] = new ModelRendererTurbo(this, 129, 49, textureX, textureY); // Box 66
		bodyModel[44] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 67
		bodyModel[45] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 68
		bodyModel[46] = new ModelRendererTurbo(this, 353, 41, textureX, textureY); // Box 69
		bodyModel[47] = new ModelRendererTurbo(this, 185, 49, textureX, textureY); // Box 70
		bodyModel[48] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 71
		bodyModel[49] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 72
		bodyModel[50] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 929, 49, textureX, textureY); // Box 74
		bodyModel[52] = new ModelRendererTurbo(this, 233, 57, textureX, textureY); // Box 75
		bodyModel[53] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 76
		bodyModel[54] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 77
		bodyModel[55] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 78
		bodyModel[56] = new ModelRendererTurbo(this, 553, 57, textureX, textureY); // Box 79
		bodyModel[57] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 80
		bodyModel[58] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 81
		bodyModel[59] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 82
		bodyModel[60] = new ModelRendererTurbo(this, 713, 49, textureX, textureY); // Box 83
		bodyModel[61] = new ModelRendererTurbo(this, 985, 49, textureX, textureY); // Box 84
		bodyModel[62] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 85
		bodyModel[63] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 86
		bodyModel[64] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 87
		bodyModel[65] = new ModelRendererTurbo(this, 817, 57, textureX, textureY); // Box 88
		bodyModel[66] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 89
		bodyModel[67] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 90
		bodyModel[68] = new ModelRendererTurbo(this, 857, 33, textureX, textureY); // Box 99
		bodyModel[69] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 100
		bodyModel[70] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 101
		bodyModel[71] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 102
		bodyModel[72] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Body
		bodyModel[73] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Body
		bodyModel[74] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Body
		bodyModel[75] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Body
		bodyModel[76] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 107
		bodyModel[77] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 108
		bodyModel[78] = new ModelRendererTurbo(this, 993, 57, textureX, textureY); // Box 109
		bodyModel[79] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 110
		bodyModel[80] = new ModelRendererTurbo(this, 633, 41, textureX, textureY); // Box 117
		bodyModel[81] = new ModelRendererTurbo(this, 985, 41, textureX, textureY); // Box 118
		bodyModel[82] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 119
		bodyModel[83] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 120
		bodyModel[84] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 121
		bodyModel[85] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 122
		bodyModel[86] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 123
		bodyModel[87] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 124
		bodyModel[88] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 125
		bodyModel[89] = new ModelRendererTurbo(this, 217, 57, textureX, textureY); // Box 126
		bodyModel[90] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 127
		bodyModel[91] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 128
		bodyModel[92] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 48
		bodyModel[93] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 49
		bodyModel[94] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 131
		bodyModel[95] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 132
		bodyModel[96] = new ModelRendererTurbo(this, 889, 49, textureX, textureY); // Box 133
		bodyModel[97] = new ModelRendererTurbo(this, 177, 65, textureX, textureY); // Box 134
		bodyModel[98] = new ModelRendererTurbo(this, 561, 65, textureX, textureY); // Box 135
		bodyModel[99] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 136
		bodyModel[100] = new ModelRendererTurbo(this, 553, 73, textureX, textureY); // Box 138
		bodyModel[101] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 139
		bodyModel[102] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 423
		bodyModel[103] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 424
		bodyModel[104] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 425
		bodyModel[105] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 426
		bodyModel[106] = new ModelRendererTurbo(this, 985, 9, textureX, textureY); // Box 155
		bodyModel[107] = new ModelRendererTurbo(this, 1001, 9, textureX, textureY); // Box 156
		bodyModel[108] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 157
		bodyModel[109] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 158
		bodyModel[110] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 159
		bodyModel[111] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 160
		bodyModel[112] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 161
		bodyModel[113] = new ModelRendererTurbo(this, 657, 33, textureX, textureY); // Box 162
		bodyModel[114] = new ModelRendererTurbo(this, 713, 33, textureX, textureY); // Box 163
		bodyModel[115] = new ModelRendererTurbo(this, 809, 33, textureX, textureY); // Box 164
		bodyModel[116] = new ModelRendererTurbo(this, 905, 33, textureX, textureY); // Box 165
		bodyModel[117] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 166
		bodyModel[118] = new ModelRendererTurbo(this, 705, 65, textureX, textureY); // Box 281
		bodyModel[119] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 282
		bodyModel[120] = new ModelRendererTurbo(this, 809, 41, textureX, textureY); // Box 283
		bodyModel[121] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 284
		bodyModel[122] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 285
		bodyModel[123] = new ModelRendererTurbo(this, 865, 65, textureX, textureY); // Box 172
		bodyModel[124] = new ModelRendererTurbo(this, 1017, 41, textureX, textureY); // Box 173
		bodyModel[125] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 174
		bodyModel[126] = new ModelRendererTurbo(this, 649, 41, textureX, textureY); // Box 175
		bodyModel[127] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 176
		bodyModel[128] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 204
		bodyModel[129] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 205
		bodyModel[130] = new ModelRendererTurbo(this, 649, 65, textureX, textureY); // Box 206
		bodyModel[131] = new ModelRendererTurbo(this, 681, 65, textureX, textureY); // Box 207
		bodyModel[132] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 208
		bodyModel[133] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 209
		bodyModel[134] = new ModelRendererTurbo(this, 889, 121, textureX, textureY); // Box 300
		bodyModel[135] = new ModelRendererTurbo(this, 905, 121, textureX, textureY); // Box 301
		bodyModel[136] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 302
		bodyModel[137] = new ModelRendererTurbo(this, 161, 129, textureX, textureY); // Box 303
		bodyModel[138] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 304

		bodyModel[0].addShapeBox(0F, 0F, 0F, 83, 7, 33, 0F,0.7F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-38.4F, -7F, -16.7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 4, 33, 0F,-4F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -4F, -0.2F, 0F, -2F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 3
		bodyModel[1].setRotationPoint(39.1F, -10.6F, -16.7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 17, 49, 0F,12F, -0.2F, -0.5F, -17.5F, -0.2F, -0.5F, -17.5F, -0.2F, 0F, 12F, -0.2F, 0F, -4F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -4F, -0.2F, 0F); // Box 4
		bodyModel[2].setRotationPoint(39.1F, -27.2F, -24.7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 64, 17, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-37.9F, -27.2F, -24.7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 69, 2, 46, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 1.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 1.2F, -0.2F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-41.4F, -27.2F, -23.2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 81, 7, 1, 0F,2.05F, -0.2F, -0.5F, -1.8F, -0.2F, -0.5F, -1.8F, -0.2F, 0F, 2.05F, -0.2F, 0F, 0.6F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-37.4F, -13.6F, -16.7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 11
		bodyModel[6].setRotationPoint(-37.35F, -13.65F, -23.2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 81, 7, 1, 0F,2.1F, -0.2F, -0.5F, -1.8F, -0.2F, -0.5F, -1.8F, -0.2F, 0F, 2.1F, -0.2F, 0F, 0.6F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-37.4F, -13.6F, 15.3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-37.35F, -13.65F, 15.8F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 3, 12, 7, 0F,14.7F, 0.2F, -0.5F, -17F, 0.2F, -0.5F, -17F, 0.2F, 0.5F, 14.7F, 0.2F, 0.5F, 12.55F, -0.2F, -0.5F, -14.5F, -0.2F, -0.5F, -14.5F, -0.2F, 0.5F, 12.55F, -0.2F, 0.5F); // Box 11
		bodyModel[9].setRotationPoint(-26.9F, -25.2F, -23.2F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 3, 12, 7, 0F,14.7F, 0.2F, -0.5F, -17F, 0.2F, -0.5F, -17F, 0.2F, 0.5F, 14.7F, 0.2F, 0.5F, 12.55F, -0.2F, -0.5F, -14.5F, -0.2F, -0.5F, -14.5F, -0.2F, 0.5F, 12.55F, -0.2F, 0.5F); // Box 12
		bodyModel[10].setRotationPoint(-26.9F, -25.2F, 15.3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 21, 18, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 13
		bodyModel[11].setRotationPoint(10.1F, -27.1F, -15.7F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 21, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 17F, -0.2F, -0.5F, 17F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 14
		bodyModel[12].setRotationPoint(11.1F, -27.1F, 1.3F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -15F, 0.5F, -0.5F, 16F, 0F, -0.5F, 16F, 0F, 0F, -15F, 0.5F, 0F); // Box 15
		bodyModel[13].setRotationPoint(27.1F, -27.1F, 1.3F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 16, 2, 24, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 17
		bodyModel[14].setRotationPoint(-25.4F, -28.2F, -12.2F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 41, 1, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 18
		bodyModel[15].setRotationPoint(-33.35F, -9.65F, 8.8F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 41, 1, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 19
		bodyModel[16].setRotationPoint(-34.35F, -9.65F, -16.2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 1, 14, 9, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 20
		bodyModel[17].setRotationPoint(10.1F, -27.1F, -24.15F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 21
		bodyModel[18].setRotationPoint(12.6F, -28F, -10.2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 14, 2, 12, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 22
		bodyModel[19].setRotationPoint(15.6F, -28F, -23.6F);

		bodyModel[20].addBox(0F, 0F, 0F, 12, 1, 4, 0F); // Body
		bodyModel[20].setRotationPoint(14F, -28F, 11F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Body
		bodyModel[21].setRotationPoint(14F, -28F, 15F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 12, 1, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[22].setRotationPoint(14F, -28F, 7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[23].setRotationPoint(27.5F, -28.3F, 11F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[24].setRotationPoint(26.5F, -28.3F, 16F);
		bodyModel[24].rotateAngleY = 0.78539816F;

		bodyModel[25].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[25].setRotationPoint(19F, -28.3F, 19.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[26].setRotationPoint(24F, -28.3F, 7F);
		bodyModel[26].rotateAngleY = -0.78539816F;

		bodyModel[27].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 34
		bodyModel[27].setRotationPoint(15F, -28.5F, 11.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 35
		bodyModel[28].setRotationPoint(15F, -28.5F, 14.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,-3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[29].setRotationPoint(15F, -28.5F, 7.5F);

		bodyModel[30].addBox(0F, 0F, 0F, 16, 5, 6, 0F); // Box 37
		bodyModel[30].setRotationPoint(-7F, -30F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,-5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(-7F, -30F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 16, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F); // Box 40
		bodyModel[32].setRotationPoint(-7F, -30F, 3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 13, 32, 0F,12F, -0.2F, -0.5F, -13.5F, -0.2F, -0.5F, -13.5F, -0.2F, 0F, 12F, -0.2F, 0F, -4F, 0.8F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -4F, 0.8F, 0F); // Box 44
		bodyModel[33].setRotationPoint(39F, -24.2F, -16.3F);

		bodyModel[34].addBox(0F, 0F, 0F, 9, 2, 9, 0F); // Box 55
		bodyModel[34].setRotationPoint(-5F, -8F, -4.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 7, 1, 8, 0F); // Box 167
		bodyModel[35].setRotationPoint(16F, -12F, 5F);

		bodyModel[36].addBox(0F, 0F, 0F, 1, 4, 8, 0F); // Box 168
		bodyModel[36].setRotationPoint(15F, -21F, 5F);

		bodyModel[37].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 169
		bodyModel[37].setRotationPoint(15F, -17F, 6.5F);

		bodyModel[38].addBox(0F, 0F, 0F, 1, 5, 1, 0F); // Box 170
		bodyModel[38].setRotationPoint(15F, -17F, 10.5F);

		bodyModel[39].addBox(0F, 0F, 0F, 9, 6, 6, 0F); // Box 171
		bodyModel[39].setRotationPoint(14F, -11F, 6F);

		bodyModel[40].addBox(0F, 0F, 0F, 1, 22, 3, 0F); // Box 179
		bodyModel[40].setRotationPoint(-6F, -28F, -1.5F);

		bodyModel[41].addBox(0F, 0F, 0F, 5, 1, 7, 0F); // Box 180
		bodyModel[41].setRotationPoint(-10.5F, -12F, -3.5F);

		bodyModel[42].addBox(0F, 0F, 0F, 6, 1, 8, 0F); // Box 65
		bodyModel[42].setRotationPoint(-5.5F, -16F, -4F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 17, 8, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 66
		bodyModel[43].setRotationPoint(-5.35F, -20.65F, 15.8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 28, 13, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 67
		bodyModel[44].setRotationPoint(-36.35F, -25.65F, 15.7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 3, 5, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 68
		bodyModel[45].setRotationPoint(-4.35F, -23F, 16.8F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 69
		bodyModel[46].setRotationPoint(4.65F, -22.5F, 18.8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 6, 5, 5, 0F,2.1F, -0.25F, -2.5F, 0F, -0.25F, 2.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -2.5F, 0F, -0.25F, 2.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 70
		bodyModel[47].setRotationPoint(20.65F, -23F, 17.8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 71
		bodyModel[48].setRotationPoint(-36.35F, -16.65F, -23.2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 8, 4, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 72
		bodyModel[49].setRotationPoint(-36.35F, -20.15F, -23.4F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 4, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 73
		bodyModel[50].setRotationPoint(-35.35F, -23.6F, -23.3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,2.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 74
		bodyModel[51].setRotationPoint(-26F, -17F, -23.2F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,2.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 75
		bodyModel[52].setRotationPoint(-23.5F, -17F, -23.2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,2.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 76
		bodyModel[53].setRotationPoint(-21F, -17F, -23.2F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 4, 7, 0F,2.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 77
		bodyModel[54].setRotationPoint(-18.5F, -17F, -23.2F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 78
		bodyModel[55].setRotationPoint(-37.4F, -14.4F, -16.7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 44, 1, 1, 0F,1.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1.25F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 79
		bodyModel[56].setRotationPoint(-37.4F, -14.4F, 15.3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 80
		bodyModel[57].setRotationPoint(2.5F, -16F, -22.2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 4, 6, 0F,-0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 81
		bodyModel[58].setRotationPoint(-4.5F, -16F, -22.2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 8, 1, 6, 0F,-0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 82
		bodyModel[59].setRotationPoint(-4.5F, -16.5F, -22.2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 7, 3, 4, 0F,-0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, -0.5F, -0.1F, -0.25F, 0F, -0.1F, -0.25F, 0F); // Box 83
		bodyModel[60].setRotationPoint(-4F, -19F, -21.2F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,2.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 84
		bodyModel[61].setRotationPoint(6.5F, -12F, -15.2F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,2.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 85
		bodyModel[62].setRotationPoint(3.5F, -12F, -15.2F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,2.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 86
		bodyModel[63].setRotationPoint(0.5F, -12F, -15.2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 5, 0F,2.1F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, -1F, -0.25F, -0.5F, -1F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 87
		bodyModel[64].setRotationPoint(-2.5F, -12F, -15.2F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 88
		bodyModel[65].setRotationPoint(-27F, -28.2F, -7.2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 89
		bodyModel[66].setRotationPoint(-28.5F, -29F, -7.2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 90
		bodyModel[67].setRotationPoint(-28.5F, -29F, 4.8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -2F, 1F, 0F); // Box 99
		bodyModel[68].setRotationPoint(38.5F, -19.8F, -9.1F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,2F, 0F, -0.1F, -4F, 0F, -0.1F, -4F, 0F, -0.1F, 2F, 0F, -0.1F, -2F, 1F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -2F, 1F, -0.1F); // Box 100
		bodyModel[69].setRotationPoint(42.3F, -16.6F, 3.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,2F, 0F, -0.1F, -4F, 0F, -0.1F, -4F, 0F, -0.1F, 2F, 0F, -0.1F, -2F, 1F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -2F, 1F, -0.1F); // Box 101
		bodyModel[70].setRotationPoint(30.6F, -27.7F, -5.8F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, 1F, 0F, -0.4F, -2F, -0.6F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, -2F, -0.6F, -0.4F); // Box 102
		bodyModel[71].setRotationPoint(30.5F, -26.9F, 11.7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F); // Body
		bodyModel[72].setRotationPoint(-42.9F, -11F, -24F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Body
		bodyModel[73].setRotationPoint(-47.9F, -11F, -24F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 9, 10, 8, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[74].setRotationPoint(-47.9F, -21F, -24F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,-3.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[75].setRotationPoint(-47.9F, -27F, -24F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 6, 8, 0F,-3.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[76].setRotationPoint(-47.9F, -27F, 16F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 9, 10, 8, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[77].setRotationPoint(-47.9F, -21F, 16F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F); // Box 109
		bodyModel[78].setRotationPoint(-47.9F, -11F, 16F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F); // Box 110
		bodyModel[79].setRotationPoint(-42.9F, -11F, 16F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 117
		bodyModel[80].setRotationPoint(-22.6F, -28.2F, -21.3F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 118
		bodyModel[81].setRotationPoint(10.2F, -28.2F, -22.3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 119
		bodyModel[82].setRotationPoint(7.2F, -28.2F, 18.7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F); // Box 120
		bodyModel[83].setRotationPoint(-35.6F, -28.2F, -14.3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 121
		bodyModel[84].setRotationPoint(-21.8F, -31.2F, 20.7F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 122
		bodyModel[85].setRotationPoint(-21.8F, -38.2F, 20.7F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0.8F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, 0.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 123
		bodyModel[86].setRotationPoint(-21.8F, -47.8F, 20.7F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,1.8F, -0.2F, -0.2F, -2.2F, -0.2F, -0.2F, -2.2F, -0.2F, -0.2F, 1.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 124
		bodyModel[87].setRotationPoint(-22.8F, -57.3F, 20.7F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F); // Box 125
		bodyModel[88].setRotationPoint(-39F, -29.6F, -2F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 2, 34, 0F,-0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F); // Box 126
		bodyModel[89].setRotationPoint(-41.4F, -28.4F, -17.2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		bodyModel[90].setRotationPoint(45.1F, -10.4F, -24.2F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[91].setRotationPoint(45.1F, -10.4F, 16.3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -3F, 0F, 0F, -2.2F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 48
		bodyModel[92].setRotationPoint(38F, -13.5F, 24.1F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, -0.2F, 0F, -1.3F, -3F, 0F, -2.6F, -3F, 0F, 0.5F, -1.7F, 0F, 1F, 7.2F, 0F, -1F, 7.2F, 0F, -2F, 7.2F, 0F, 1F, 7.2F, 0F); // Box 49
		bodyModel[93].setRotationPoint(43F, -12.2F, 24.1F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, -1.7F, 0F, -2.6F, -3F, 0F, -1.3F, -3F, 0F, 0.5F, -0.2F, 0F, 1F, 7.2F, 0F, -2F, 7.2F, 0F, -1F, 7.2F, 0F, 1F, 7.2F, 0F); // Box 131
		bodyModel[94].setRotationPoint(43F, -12.2F, -26F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, -2.2F, 0F, -0.5F, -3F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 132
		bodyModel[95].setRotationPoint(38F, -13.5F, -26F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-2.6F, -3F, 0F, 0.5F, -1.7F, 0F, 0.5F, -0.2F, 0F, -1.3F, -3F, 0F, -2F, 7.2F, 0F, 1F, 7.2F, 0F, 1F, 7.2F, 0F, -1F, 7.2F, 0F); // Box 133
		bodyModel[96].setRotationPoint(-44.5F, -12.2F, -26F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,-0.5F, -3F, 0F, 0.5F, -2.2F, 0F, 0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -1F, 4.5F, 0F, 0.5F, 4.5F, 0F, 0.5F, 4.5F, 0F, -1F, 4.5F, 0F); // Box 134
		bodyModel[97].setRotationPoint(-39.5F, -13.5F, -26F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,-0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, -2.2F, 0F, -0.5F, -3F, 0F, -1F, 4.5F, 0F, 0.5F, 4.5F, 0F, 0.5F, 4.5F, 0F, -1F, 4.5F, 0F); // Box 135
		bodyModel[98].setRotationPoint(-39.5F, -13.5F, 24.1F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.3F, -3F, 0F, 0.5F, -0.2F, 0F, 0.5F, -1.7F, 0F, -2.6F, -3F, 0F, -1F, 7.2F, 0F, 1F, 7.2F, 0F, 1F, 7.2F, 0F, -2F, 7.2F, 0F); // Box 136
		bodyModel[99].setRotationPoint(-44.5F, -12.2F, 24.1F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 72, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 138
		bodyModel[100].setRotationPoint(-34F, -13.5F, 24.1F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 72, 5, 2, 0F,0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 139
		bodyModel[101].setRotationPoint(-34F, -13.5F, -26F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 423
		bodyModel[102].setRotationPoint(32.9F, -26.9F, 21.35F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 424
		bodyModel[103].setRotationPoint(33.8F, -25.4F, 21.4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 425
		bodyModel[104].setRotationPoint(33.8F, -26.4F, 21.4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 426
		bodyModel[105].setRotationPoint(33.8F, -27.4F, 21.4F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 155
		bodyModel[106].setRotationPoint(32.9F, -26.9F, 17.8F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 156
		bodyModel[107].setRotationPoint(33.8F, -27.4F, 17.85F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 157
		bodyModel[108].setRotationPoint(33.8F, -26.4F, 17.85F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 158
		bodyModel[109].setRotationPoint(33.8F, -25.4F, 17.85F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 159
		bodyModel[110].setRotationPoint(32.9F, -26.9F, -22.2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 160
		bodyModel[111].setRotationPoint(33.8F, -27.4F, -22.15F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 161
		bodyModel[112].setRotationPoint(33.8F, -26.4F, -22.15F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 162
		bodyModel[113].setRotationPoint(33.8F, -25.4F, -22.15F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 163
		bodyModel[114].setRotationPoint(33.8F, -27.4F, -18.6F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 164
		bodyModel[115].setRotationPoint(33.8F, -26.4F, -18.6F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 165
		bodyModel[116].setRotationPoint(33.8F, -25.4F, -18.6F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 166
		bodyModel[117].setRotationPoint(32.9F, -26.9F, -18.65F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 281
		bodyModel[118].setRotationPoint(34F, -28.4F, 16.4F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 282
		bodyModel[119].setRotationPoint(34F, -27.8F, 16F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 283
		bodyModel[120].setRotationPoint(34F, -27.8F, 23F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 284
		bodyModel[121].setRotationPoint(33F, -22.8F, 23F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 285
		bodyModel[122].setRotationPoint(33F, -22.8F, 16F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 172
		bodyModel[123].setRotationPoint(34F, -28.4F, -23.6F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 173
		bodyModel[124].setRotationPoint(34F, -27.8F, -24F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 174
		bodyModel[125].setRotationPoint(34F, -27.8F, -17F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 175
		bodyModel[126].setRotationPoint(33F, -22.8F, -24F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 176
		bodyModel[127].setRotationPoint(33F, -22.8F, -17F);

		bodyModel[128].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 3, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 204
		bodyModel[128].setRotationPoint(39.8F, -3.8F, 19.8F);

		bodyModel[129].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[129].setRotationPoint(39.8F, -3.8F, 19.8F);

		bodyModel[130].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 206
		bodyModel[130].setRotationPoint(39.8F, -3.8F, 19.8F);

		bodyModel[131].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 3, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 207
		bodyModel[131].setRotationPoint(39.8F, -3.8F, -9.6F);

		bodyModel[132].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[132].setRotationPoint(39.8F, -3.8F, -9.6F);

		bodyModel[133].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 209
		bodyModel[133].setRotationPoint(39.8F, -3.8F, -9.6F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 3, 17, 2, 0F,15F, -0.2F, -0.5F, -17F, -0.2F, -0.5F, -17F, -0.2F, 0F, 15F, -0.2F, 0F, 15F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, 15F, -0.2F, 0F); // Box 300
		bodyModel[134].setRotationPoint(41.1F, -27.2F, -24.7F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 7, 17, 2, 0F,15F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 15F, -0.2F, 0F, 12F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 12F, -0.2F, 0F); // Box 301
		bodyModel[135].setRotationPoint(-26.9F, -27.2F, -24.7F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 64, 17, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 302
		bodyModel[136].setRotationPoint(-37.9F, -27.2F, 22.3F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 7, 17, 2, 0F,15F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 15F, -0.2F, 0F, 12F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 12F, -0.2F, 0F); // Box 303
		bodyModel[137].setRotationPoint(-26.9F, -27.2F, 22.3F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 17, 2, 0F,15F, -0.2F, -0.5F, -17F, -0.2F, -0.5F, -17F, -0.2F, 0F, 15F, -0.2F, 0F, 15F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, 15F, -0.2F, 0F); // Box 304
		bodyModel[138].setRotationPoint(41.1F, -27.2F, 22.3F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 182

		bodyDoorOpenModel[0].addShapeBox(0F, -3F, 0F, 29, 3, 32, 0F,0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F); // Box 182
		bodyDoorOpenModel[0].setRotationPoint(-65F, 5.5F, -16F);
		bodyDoorOpenModel[0].rotateAngleZ = 0.33161256F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 945, 57, textureX, textureY); // Box 181
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 113
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 265, 9, textureX, textureY); // Box 115
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 641, 57, textureX, textureY); // Box 116

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, 0F, 3, 20, 32, 0F,1F, 0F, 0F, -1F, 0.8F, 0F, -1F, 0.8F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyDoorCloseModel[0].setRotationPoint(-41.5F, -25.8F, -16F);
		bodyDoorCloseModel[0].rotateAngleZ = 0.13089969F;

		bodyDoorCloseModel[1].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.5F, -0.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.5F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F); // Box 113
		bodyDoorCloseModel[1].setRotationPoint(-42.9F, -27F, 13.4F);

		bodyDoorCloseModel[2].addShapeBox(0F, 0F, 0F, 1, 5, 2, 0F,0.5F, -0.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.5F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F); // Box 115
		bodyDoorCloseModel[2].setRotationPoint(-42.9F, -27F, -15.2F);

		bodyDoorCloseModel[3].addShapeBox(0F, 0F, 0F, 2, 5, 3, 0F,0.5F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0F, -0.6F, -0.4F, 0.5F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F, -0.5F, -0.6F, -0.4F, -0.5F, -0.6F, -0.4F, -0.2F, -0.6F, -0.4F); // Box 116
		bodyDoorCloseModel[3].setRotationPoint(-42.4F, -24.5F, -9.8F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Body
		turretModel[1] = new ModelRendererTurbo(this, 633, 33, textureX, textureY); // Body
		turretModel[2] = new ModelRendererTurbo(this, 945, 33, textureX, textureY); // Body
		turretModel[3] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Body
		turretModel[4] = new ModelRendererTurbo(this, 721, 65, textureX, textureY); // Box 265
		turretModel[5] = new ModelRendererTurbo(this, 929, 65, textureX, textureY); // Box 268
		turretModel[6] = new ModelRendererTurbo(this, 801, 73, textureX, textureY); // Box 269
		turretModel[7] = new ModelRendererTurbo(this, 849, 73, textureX, textureY); // Box 272
		turretModel[8] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 274
		turretModel[9] = new ModelRendererTurbo(this, 905, 81, textureX, textureY); // Box 280
		turretModel[10] = new ModelRendererTurbo(this, 961, 81, textureX, textureY); // Box 281
		turretModel[11] = new ModelRendererTurbo(this, 433, 89, textureX, textureY); // Box 286
		turretModel[12] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 287
		turretModel[13] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 288
		turretModel[14] = new ModelRendererTurbo(this, 545, 89, textureX, textureY); // Box 289
		turretModel[15] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 290
		turretModel[16] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 291
		turretModel[17] = new ModelRendererTurbo(this, 881, 65, textureX, textureY); // Box 293
		turretModel[18] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 294
		turretModel[19] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 295
		turretModel[20] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 296
		turretModel[21] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 297
		turretModel[22] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 298
		turretModel[23] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 299
		turretModel[24] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 301
		turretModel[25] = new ModelRendererTurbo(this, 553, 105, textureX, textureY); // Box 302
		turretModel[26] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 303

		turretModel[0].addBox(-5F, -0.3F, -3.5F, 1, 1, 7, 0F); // Body
		turretModel[0].setRotationPoint(1F, -31F, 0F);

		turretModel[1].addBox(-11F, 4.2F, -1.5F, 10, 1, 3, 0F); // Body
		turretModel[1].setRotationPoint(1F, -31F, 0F);
		turretModel[1].rotateAngleZ = -1.46607657F;

		turretModel[2].addShapeBox(-11F, 4.2F, 1.5F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Body
		turretModel[2].setRotationPoint(1F, -31F, 0F);
		turretModel[2].rotateAngleZ = -1.46607657F;

		turretModel[3].addShapeBox(-11F, 4.2F, -5.5F, 10, 1, 4, 0F,-3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		turretModel[3].setRotationPoint(1F, -31F, 0F);
		turretModel[3].rotateAngleZ = -1.46607657F;

		turretModel[4].addShapeBox(5.4F, -1F, -6.8F, 5, 1, 1, 0F,1.7F, 0F, -1F, 1.5F, 2F, -6F, 1.5F, 2F, 6F, 2.7F, 0F, 0.5F, 2F, 1.5F, -1.3F, 1.5F, -1.5F, -6F, 1.5F, -1.5F, 6F, 3F, 1.5F, 0.5F); // Box 265
		turretModel[4].setRotationPoint(1F, -31F, 0F);

		turretModel[5].addShapeBox(-2.35F, -4F, 6.5F, 5, 5, 1, 0F,1.5F, 0F, -3F, 1.55F, 0F, -3F, 1.55F, 0F, 2.5F, 1.52F, 0F, 2.48F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.2F, 0F, -0.53F); // Box 268
		turretModel[5].setRotationPoint(1F, -31F, 0F);

		turretModel[6].addShapeBox(-1.7F, -4F, 6.1F, 5, 5, 1, 0F,0.5F, 0F, -3F, 1.5F, 0F, -3F, 1.55F, 0F, 2.45F, 0.5F, 0F, 2.45F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.55F, 0.5F, 0F, -0.5F); // Box 269
		turretModel[6].setRotationPoint(1F, -31F, 0F);
		turretModel[6].rotateAngleY = 0.83775804F;

		turretModel[7].addShapeBox(-2.3F, -10F, 6.5F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.53F, 1.5F, 0F, -3F, 1.5F, 0F, -3F, 1.5F, 0F, 2.5F, 1.52F, 0F, 2.48F); // Box 272
		turretModel[7].setRotationPoint(1F, -31F, 0F);

		turretModel[8].addShapeBox(-1.7F, -10F, 6.1F, 5, 6, 1, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.55F, 0.5F, 0F, -0.5F, 0.5F, 0F, -3F, 1.5F, 0F, -3F, 1.55F, 0F, 2.45F, 0.5F, 0F, 2.45F); // Box 274
		turretModel[8].setRotationPoint(1F, -31F, 0F);
		turretModel[8].rotateAngleY = 0.83775804F;

		turretModel[9].addShapeBox(-3.05F, -10F, 6.35F, 5, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.55F, 0.25F, 0F, -0.5F, 1.5F, 0F, -3F, 2.5F, 0F, -3F, 2.55F, 0F, 2.45F, 1.6F, 0F, 2.45F); // Box 280
		turretModel[9].setRotationPoint(1F, -31F, 0F);
		turretModel[9].rotateAngleY = -0.83775804F;

		turretModel[10].addShapeBox(-3.05F, -4F, 6.35F, 5, 5, 1, 0F,1.55F, 0F, -3F, 2.55F, 0F, -3F, 2.55F, 0F, 2.45F, 1.55F, 0F, 2.45F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, -0.55F, 0.2F, 0F, -0.5F); // Box 281
		turretModel[10].setRotationPoint(1F, -31F, 0F);
		turretModel[10].rotateAngleY = -0.83775804F;

		turretModel[11].addShapeBox(-1.7F, -4F, -7.1F, 5, 5, 1, 0F,1.55F, 0F, 2.45F, 1.55F, 0F, 2.45F, 1.55F, 0F, -3F, 1.55F, 0F, -3F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.55F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 286
		turretModel[11].setRotationPoint(1F, -31F, 0F);
		turretModel[11].rotateAngleY = -0.83775804F;

		turretModel[12].addShapeBox(-1.7F, -10F, -7.1F, 5, 6, 1, 0F,0.5F, 0F, -0.5F, 0.2F, 0F, -0.55F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.6F, 0F, 2.45F, 1.55F, 0F, 2.45F, 1.5F, 0F, -3F, 1.5F, 0F, -3F); // Box 287
		turretModel[12].setRotationPoint(1F, -31F, 0F);
		turretModel[12].rotateAngleY = -0.83775804F;

		turretModel[13].addShapeBox(-2.35F, -4F, -7.5F, 5, 5, 1, 0F,1.52F, 0F, 2.48F, 1.55F, 0F, 2.5F, 1.55F, 0F, -3F, 1.5F, 0F, -3F, 0.2F, 0F, -0.53F, 0.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0F, 0F, 0F); // Box 288
		turretModel[13].setRotationPoint(1F, -31F, 0F);

		turretModel[14].addShapeBox(-2.3F, -10F, -7.5F, 5, 6, 1, 0F,0.2F, 0F, -0.53F, 0.2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1.52F, 0F, 2.48F, 1.5F, 0F, 2.5F, 1.5F, 0F, -3F, 1.5F, 0F, -3F); // Box 289
		turretModel[14].setRotationPoint(1F, -31F, 0F);

		turretModel[15].addShapeBox(-3F, -4F, -7.4F, 5, 5, 1, 0F,1.6F, 0F, 2.45F, 2.5F, 0F, 2.45F, 2F, 0F, -3F, 1.5F, 0F, -3F, 0.25F, 0F, -0.55F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 290
		turretModel[15].setRotationPoint(1F, -31F, 0F);
		turretModel[15].rotateAngleY = 0.83775804F;

		turretModel[16].addShapeBox(-3.05F, -10F, -7.4F, 5, 6, 1, 0F,0.2F, 0F, -0.55F, 0.5F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 1.55F, 0F, 2.45F, 2.5F, 0F, 2.45F, 2F, 0F, -3F, 1.5F, 0F, -3F); // Box 291
		turretModel[16].setRotationPoint(1F, -31F, 0F);
		turretModel[16].rotateAngleY = 0.83775804F;

		turretModel[17].addShapeBox(5.4F, -1F, 5.2F, 5, 1, 1, 0F,2.7F, 0F, 0.5F, 1.5F, 2F, 6F, 1.5F, 2F, -6F, 1.7F, 0F, -1F, 3F, 1.5F, 0.5F, 1.5F, -1.5F, 6F, 1.5F, -1.5F, -6F, 3F, 1.5F, -1F); // Box 293
		turretModel[17].setRotationPoint(1F, -31F, 0F);

		turretModel[18].addShapeBox(12F, -6F, -0.5F, 1, 5, 1, 0F,0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 294
		turretModel[18].setRotationPoint(1F, -31F, 0F);

		turretModel[19].addShapeBox(12F, -3F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		turretModel[19].setRotationPoint(2F, -31F, 0F);

		turretModel[20].addShapeBox(14F, -5F, -8.5F, 1, 5, 17, 0F,-0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -1.2F, 0F, 0F, 0.8F, 0F, -1F, 0.8F, 0F, -1F, -1.2F, 0F, 0F); // Box 296
		turretModel[20].setRotationPoint(2F, -31F, 0F);

		turretModel[21].addShapeBox(13F, -10F, -8.5F, 1, 5, 6, 0F,-0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -1.2F, 0F, 0F, 0.8F, 0F, -1F, 0.8F, 0F, 0.5F, -1.2F, 0F, 0.5F); // Box 297
		turretModel[21].setRotationPoint(2F, -31F, 0F);

		turretModel[22].addShapeBox(13F, -10F, 2.5F, 1, 5, 6, 0F,-0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -1.2F, 0F, 0.5F, 0.8F, 0F, 0.5F, 0.8F, 0F, -1F, -1.2F, 0F, 0F); // Box 298
		turretModel[22].setRotationPoint(2F, -31F, 0F);

		turretModel[23].addShapeBox(8.4F, -10F, -8.7F, 5, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 299
		turretModel[23].setRotationPoint(2F, -31F, 0F);

		turretModel[24].addShapeBox(9.4F, -5F, -8.7F, 5, 5, 1, 0F,0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F); // Box 301
		turretModel[24].setRotationPoint(2F, -31F, 0F);

		turretModel[25].addShapeBox(9.4F, -5F, 7.7F, 5, 5, 1, 0F,0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F); // Box 302
		turretModel[25].setRotationPoint(2F, -31F, 0F);

		turretModel[26].addShapeBox(8.4F, -10F, 7.7F, 5, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.8F, 0F, -0.2F, 0.8F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 303
		turretModel[26].setRotationPoint(2F, -31F, 0F);
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 697, 121, textureX, textureY); // Box 0
		barrelModel[1] = new ModelRendererTurbo(this, 585, 121, textureX, textureY); // Box 1
		barrelModel[2] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Box 2
		barrelModel[3] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 3
		barrelModel[4] = new ModelRendererTurbo(this, 737, 49, textureX, textureY); // Box 4
		barrelModel[5] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Box 5
		barrelModel[6] = new ModelRendererTurbo(this, 865, 49, textureX, textureY); // Box 6
		barrelModel[7] = new ModelRendererTurbo(this, 729, 105, textureX, textureY); // Box 7
		barrelModel[8] = new ModelRendererTurbo(this, 753, 73, textureX, textureY); // Box 8
		barrelModel[9] = new ModelRendererTurbo(this, 329, 73, textureX, textureY); // Box 9
		barrelModel[10] = new ModelRendererTurbo(this, 65, 81, textureX, textureY); // Box 10
		barrelModel[11] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 11
		barrelModel[12] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 12
		barrelModel[13] = new ModelRendererTurbo(this, 257, 57, textureX, textureY); // Box 13
		barrelModel[14] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 14
		barrelModel[15] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 15
		barrelModel[16] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 16
		barrelModel[17] = new ModelRendererTurbo(this, 969, 57, textureX, textureY); // Box 17
		barrelModel[18] = new ModelRendererTurbo(this, 1017, 57, textureX, textureY); // Box 18
		barrelModel[19] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 19
		barrelModel[20] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 20
		barrelModel[21] = new ModelRendererTurbo(this, 433, 65, textureX, textureY); // Box 21
		barrelModel[22] = new ModelRendererTurbo(this, 369, 41, textureX, textureY); // Box 22
		barrelModel[23] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 23
		barrelModel[24] = new ModelRendererTurbo(this, 825, 57, textureX, textureY); // Box 24
		barrelModel[25] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 25
		barrelModel[26] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 35
		barrelModel[27] = new ModelRendererTurbo(this, 825, 65, textureX, textureY); // Box 36
		barrelModel[28] = new ModelRendererTurbo(this, 881, 73, textureX, textureY); // Box 37
		barrelModel[29] = new ModelRendererTurbo(this, 921, 65, textureX, textureY); // Box 38
		barrelModel[30] = new ModelRendererTurbo(this, 985, 65, textureX, textureY); // Box 42
		barrelModel[31] = new ModelRendererTurbo(this, 361, 73, textureX, textureY); // Box 44
		barrelModel[32] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 45
		barrelModel[33] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 46
		barrelModel[34] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 47
		barrelModel[35] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 48
		barrelModel[36] = new ModelRendererTurbo(this, 1017, 73, textureX, textureY); // Box 49
		barrelModel[37] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 50
		barrelModel[38] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 51
		barrelModel[39] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 52
		barrelModel[40] = new ModelRendererTurbo(this, 713, 81, textureX, textureY); // Box 53
		barrelModel[41] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 54
		barrelModel[42] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 55
		barrelModel[43] = new ModelRendererTurbo(this, 361, 81, textureX, textureY); // Box 56
		barrelModel[44] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 57
		barrelModel[45] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Box 58
		barrelModel[46] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 59
		barrelModel[47] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Box 62
		barrelModel[48] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 63
		barrelModel[49] = new ModelRendererTurbo(this, 825, 81, textureX, textureY); // Box 64
		barrelModel[50] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 65
		barrelModel[51] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 66
		barrelModel[52] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 67
		barrelModel[53] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 69
		barrelModel[54] = new ModelRendererTurbo(this, 65, 89, textureX, textureY); // Box 70
		barrelModel[55] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 71
		barrelModel[56] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 72
		barrelModel[57] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 73
		barrelModel[58] = new ModelRendererTurbo(this, 689, 113, textureX, textureY); // Box 74
		barrelModel[59] = new ModelRendererTurbo(this, 393, 89, textureX, textureY); // Box 75
		barrelModel[60] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 76
		barrelModel[61] = new ModelRendererTurbo(this, 633, 89, textureX, textureY); // Box 77
		barrelModel[62] = new ModelRendererTurbo(this, 673, 89, textureX, textureY); // Box 78
		barrelModel[63] = new ModelRendererTurbo(this, 745, 89, textureX, textureY); // Box 79

		barrelModel[0].addShapeBox(-11.8F, -2.5F, -1F, 13, 2, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 0
		barrelModel[0].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[1].addShapeBox(-11.8F, -3.5F, -1F, 9, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 1
		barrelModel[1].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[2].addShapeBox(-6F, -4.2F, -1F, 4, 1, 2, 0F,0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 2
		barrelModel[2].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[3].addShapeBox(-1.7F, -4.2F, -1F, 1, 1, 2, 0F,0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 3
		barrelModel[3].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[4].addShapeBox(-0.399999999999999F, -4.2F, -1F, 1, 1, 2, 0F,0F, -0.3F, 0.1F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.1F); // Box 4
		barrelModel[4].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[5].addShapeBox(-11.8F, -4.2F, -1F, 5, 1, 2, 0F,0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 5
		barrelModel[5].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[6].addShapeBox(0.600000000000001F, -4.2F, -1F, 1, 2, 2, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 6
		barrelModel[6].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[7].addShapeBox(-11.8F, -1.2F, -1F, 5, 1, 2, 0F,0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 7
		barrelModel[7].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[8].addShapeBox(-3.3F, -1.2F, -1F, 4, 1, 2, 0F,0.4F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.4F, -0.3F, 0.2F); // Box 8
		barrelModel[8].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[9].addShapeBox(-7.3F, -1.2F, 0.5F, 4, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -1F, -0.3F, 0.2F); // Box 9
		barrelModel[9].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[10].addShapeBox(-7.3F, -1.2F, -1.5F, 4, 1, 1, 0F,-1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 10
		barrelModel[10].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[11].addShapeBox(-11.5F, -2.8F, -1F, 6, 1, 2, 0F,0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 11
		barrelModel[11].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[12].addShapeBox(-11.5F, -2.1F, -1F, 6, 1, 2, 0F,0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 12
		barrelModel[12].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[13].addShapeBox(-7.2F, -3F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 13
		barrelModel[13].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[14].addShapeBox(-6.2F, -3F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 14
		barrelModel[14].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[15].addShapeBox(-8.6F, -3F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 15
		barrelModel[15].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[16].addShapeBox(-11.6F, -3F, -1F, 1, 1, 2, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 16
		barrelModel[16].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[17].addShapeBox(-11.6F, -1.7F, -1F, 1, 1, 2, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 17
		barrelModel[17].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[18].addShapeBox(-11.9F, -2.3F, -1F, 1, 1, 2, 0F,-0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F); // Box 18
		barrelModel[18].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[19].addShapeBox(-8.6F, -1.7F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 19
		barrelModel[19].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[20].addShapeBox(-7.2F, -1.7F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 20
		barrelModel[20].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[21].addShapeBox(-6.2F, -1.9F, -1F, 1, 1, 2, 0F,-0.2F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 21
		barrelModel[21].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[22].addShapeBox(-5.4F, -3.7F, 0.8F, 1, 2, 1, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.6F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0.2F, -0.6F, -0.4F); // Box 22
		barrelModel[22].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[23].addShapeBox(-5.8F, -2.3F, 0.8F, 1, 1, 1, 0F,-0.2F, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // Box 23
		barrelModel[23].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[24].addShapeBox(-5.8F, -2.3F, 0.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 24
		barrelModel[24].setRotationPoint(13.9F, -37F, 0F);

		barrelModel[25].addShapeBox(-5.4F, -4F, 0.8F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F); // Box 25
		barrelModel[25].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[26].addShapeBox(-14F, -3.8F, 1F, 1, 3, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 35
		barrelModel[26].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[27].addShapeBox(-14F, -3.8F, -2F, 1, 3, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 36
		barrelModel[27].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[28].addShapeBox(-14F, -2.6F, -0.5F, 3, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 37
		barrelModel[28].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[29].addShapeBox(-12.7F, -4.2F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F); // Box 38
		barrelModel[29].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[30].addShapeBox(-13.7F, -4.2F, 0.8F, 2, 1, 1, 0F,0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F); // Box 42
		barrelModel[30].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[31].addShapeBox(-13.7F, -4.2F, -1.8F, 2, 1, 1, 0F,0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F); // Box 44
		barrelModel[31].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[32].addShapeBox(-14F, -4.2F, 1F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 45
		barrelModel[32].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[33].addShapeBox(-14F, -4.2F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 46
		barrelModel[33].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[34].addShapeBox(-13.7F, -4.2F, -1.8F, 2, 1, 1, 0F,0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F); // Box 47
		barrelModel[34].setRotationPoint(14.5F, -34F, 0F);

		barrelModel[35].addShapeBox(-13.7F, -4.2F, 0.8F, 2, 1, 1, 0F,0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F); // Box 48
		barrelModel[35].setRotationPoint(14.5F, -34F, 0F);

		barrelModel[36].addShapeBox(-12.7F, -4.2F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F); // Box 49
		barrelModel[36].setRotationPoint(14.5F, -34F, 0F);

		barrelModel[37].addShapeBox(-13.4F, -3.5F, 0.3F, 2, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F); // Box 50
		barrelModel[37].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[38].addShapeBox(-12.4F, -3.5F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F); // Box 51
		barrelModel[38].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[39].addShapeBox(-13.4F, -3.5F, -1.3F, 2, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F, -0.3F); // Box 52
		barrelModel[39].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[40].addShapeBox(-11.2F, -4.45F, -0.5F, 3, 1, 1, 0F,0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 53
		barrelModel[40].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[41].addShapeBox(-10.2F, -4.9F, -0.9F, 1, 1, 1, 0F,0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 54
		barrelModel[41].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[42].addShapeBox(-10.2F, -4.9F, -0.1F, 1, 1, 1, 0F,0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 55
		barrelModel[42].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[43].addShapeBox(-9.9F, -4.6F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 56
		barrelModel[43].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[44].addShapeBox(-10.4F, -4.9F, -1.1F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 57
		barrelModel[44].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[45].addShapeBox(-10.4F, -4.9F, 0.1F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 58
		barrelModel[45].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[46].addShapeBox(1.9F, -3.3F, -1F, 5, 2, 2, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 59
		barrelModel[46].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[47].addShapeBox(4.9F, -3.3F, -1F, 5, 2, 2, 0F,0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F); // Box 62
		barrelModel[47].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[48].addShapeBox(7.9F, -3.3F, -1F, 16, 2, 2, 0F,0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F); // Box 63
		barrelModel[48].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[49].addShapeBox(23.9F, -3.3F, -1F, 2, 2, 2, 0F,0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F); // Box 64
		barrelModel[49].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[50].addShapeBox(0.700000000000001F, -4.6F, -0.1F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 65
		barrelModel[50].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[51].addShapeBox(0.700000000000001F, -4.6F, -0.9F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 66
		barrelModel[51].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[52].addShapeBox(0.700000000000001F, -5F, -0.1F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 67
		barrelModel[52].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[53].addShapeBox(0.700000000000001F, -5F, -0.9F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 69
		barrelModel[53].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[54].addShapeBox(0.700000000000001F, -5.15F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F); // Box 70
		barrelModel[54].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[55].addShapeBox(0.700000000000001F, -4.7F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F); // Box 71
		barrelModel[55].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[56].addShapeBox(-2.6F, -2F, 1.8F, 3, 5, 5, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 72
		barrelModel[56].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[57].addShapeBox(-2.3F, -1.2F, 0F, 2, 1, 2, 0F,0.4F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.4F, -0.3F, 0.2F); // Box 73
		barrelModel[57].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[58].addShapeBox(-2.6F, -2.7F, 1.8F, 3, 1, 5, 0F,0F, 0.7F, 0F, 0.3F, 0.7F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -1.3F, 0F, 0.3F, -1.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 74
		barrelModel[58].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[59].addShapeBox(-2.4F, -2.7F, 1.8F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 75
		barrelModel[59].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[60].addShapeBox(-2.4F, -3F, 1.3F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 76
		barrelModel[60].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[61].addShapeBox(-2.4F, -3.5F, 0.8F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 77
		barrelModel[61].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[62].addShapeBox(-2.4F, -3.5F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 78
		barrelModel[62].setRotationPoint(14.5F, -37F, 0F);

		barrelModel[63].addShapeBox(-2.4F, -3.5F, -1F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 79
		barrelModel[63].setRotationPoint(14.5F, -37F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 889, 65, textureX, textureY); // Box 242
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 243
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 257, 73, textureX, textureY); // Box 244
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 183
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 184
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 185
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 186
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 187
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 33, 81, textureX, textureY); // Box 188
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 189
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 190
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 177, 81, textureX, textureY); // Box 191
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 192
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 681, 81, textureX, textureY); // Box 193
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 194
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 833, 81, textureX, textureY); // Box 242
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 873, 81, textureX, textureY); // Box 243
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 244
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 145, 89, textureX, textureY); // Box 201
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 202
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 203

		leftTrackWheelModels[0].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 5, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 242
		leftTrackWheelModels[0].setRotationPoint(27.8F, 0.8F, 23.5F);

		leftTrackWheelModels[1].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftTrackWheelModels[1].setRotationPoint(27.8F, 0.8F, 23.5F);

		leftTrackWheelModels[2].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 244
		leftTrackWheelModels[2].setRotationPoint(27.8F, 0.8F, 23.5F);

		leftTrackWheelModels[3].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 183
		leftTrackWheelModels[3].setRotationPoint(15.4F, 0.8F, 23.5F);

		leftTrackWheelModels[4].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 5, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 184
		leftTrackWheelModels[4].setRotationPoint(15.4F, 0.8F, 23.5F);

		leftTrackWheelModels[5].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		leftTrackWheelModels[5].setRotationPoint(15.4F, 0.8F, 23.5F);

		leftTrackWheelModels[6].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 186
		leftTrackWheelModels[6].setRotationPoint(2.6F, 0.8F, 23.5F);

		leftTrackWheelModels[7].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 5, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 187
		leftTrackWheelModels[7].setRotationPoint(2.6F, 0.8F, 23.5F);

		leftTrackWheelModels[8].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		leftTrackWheelModels[8].setRotationPoint(2.6F, 0.8F, 23.5F);

		leftTrackWheelModels[9].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 189
		leftTrackWheelModels[9].setRotationPoint(-10F, 0.8F, 23.5F);

		leftTrackWheelModels[10].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 5, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 190
		leftTrackWheelModels[10].setRotationPoint(-10F, 0.8F, 23.5F);

		leftTrackWheelModels[11].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		leftTrackWheelModels[11].setRotationPoint(-10F, 0.8F, 23.5F);

		leftTrackWheelModels[12].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 192
		leftTrackWheelModels[12].setRotationPoint(-22.4F, 0.8F, 23.5F);

		leftTrackWheelModels[13].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 5, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 193
		leftTrackWheelModels[13].setRotationPoint(-22.4F, 0.8F, 23.5F);

		leftTrackWheelModels[14].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		leftTrackWheelModels[14].setRotationPoint(-22.4F, 0.8F, 23.5F);

		leftTrackWheelModels[15].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 242
		leftTrackWheelModels[15].setRotationPoint(39.8F, -2.8F, 23.5F);

		leftTrackWheelModels[16].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		leftTrackWheelModels[16].setRotationPoint(39.8F, -2.8F, 23.5F);

		leftTrackWheelModels[17].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 244
		leftTrackWheelModels[17].setRotationPoint(39.8F, -2.8F, 23.5F);

		leftTrackWheelModels[18].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 201
		leftTrackWheelModels[18].setRotationPoint(-35.8F, -1F, 23.5F);

		leftTrackWheelModels[19].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		leftTrackWheelModels[19].setRotationPoint(-35.8F, -1F, 23.5F);

		leftTrackWheelModels[20].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 203
		leftTrackWheelModels[20].setRotationPoint(-35.8F, -1F, 23.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 210
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 601, 89, textureX, textureY); // Box 214
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 641, 89, textureX, textureY); // Box 215
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 713, 89, textureX, textureY); // Box 216
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 753, 89, textureX, textureY); // Box 217
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 905, 89, textureX, textureY); // Box 218
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 219
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 220
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 221
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 222
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 217, 97, textureX, textureY); // Box 223
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 224
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 321, 97, textureX, textureY); // Box 225
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 226
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 673, 97, textureX, textureY); // Box 227
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 257
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 258
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 259
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 481, 121, textureX, textureY); // Box 260
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Box 261
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 553, 121, textureX, textureY); // Box 262

		rightTrackWheelModels[0].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		rightTrackWheelModels[0].setRotationPoint(27.8F, 0.8F, -15.5F);

		rightTrackWheelModels[1].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 5, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 214
		rightTrackWheelModels[1].setRotationPoint(27.8F, 0.8F, -15.5F);

		rightTrackWheelModels[2].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 215
		rightTrackWheelModels[2].setRotationPoint(27.8F, 0.8F, -15.5F);

		rightTrackWheelModels[3].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 216
		rightTrackWheelModels[3].setRotationPoint(15.4F, 0.8F, -15.5F);

		rightTrackWheelModels[4].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 217
		rightTrackWheelModels[4].setRotationPoint(15.4F, 0.8F, -15.5F);

		rightTrackWheelModels[5].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 5, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 218
		rightTrackWheelModels[5].setRotationPoint(15.4F, 0.8F, -15.5F);

		rightTrackWheelModels[6].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 5, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 219
		rightTrackWheelModels[6].setRotationPoint(2.6F, 0.8F, -15.5F);

		rightTrackWheelModels[7].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		rightTrackWheelModels[7].setRotationPoint(2.6F, 0.8F, -15.5F);

		rightTrackWheelModels[8].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 221
		rightTrackWheelModels[8].setRotationPoint(2.6F, 0.8F, -15.5F);

		rightTrackWheelModels[9].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 222
		rightTrackWheelModels[9].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[10].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		rightTrackWheelModels[10].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[11].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 5, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 224
		rightTrackWheelModels[11].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[12].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 5, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 225
		rightTrackWheelModels[12].setRotationPoint(-22.4F, 0.8F, -15.5F);

		rightTrackWheelModels[13].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		rightTrackWheelModels[13].setRotationPoint(-22.4F, 0.8F, -15.5F);

		rightTrackWheelModels[14].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 227
		rightTrackWheelModels[14].setRotationPoint(-22.4F, 0.8F, -15.5F);

		rightTrackWheelModels[15].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 257
		rightTrackWheelModels[15].setRotationPoint(-35.8F, -1F, -16.5F);

		rightTrackWheelModels[16].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		rightTrackWheelModels[16].setRotationPoint(-35.8F, -1F, -16.5F);

		rightTrackWheelModels[17].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 259
		rightTrackWheelModels[17].setRotationPoint(-35.8F, -1F, -16.5F);

		rightTrackWheelModels[18].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 260
		rightTrackWheelModels[18].setRotationPoint(39.8F, -2.8F, -16.5F);

		rightTrackWheelModels[19].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 261
		rightTrackWheelModels[19].setRotationPoint(39.8F, -2.8F, -16.5F);

		rightTrackWheelModels[20].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 262
		rightTrackWheelModels[20].setRotationPoint(39.8F, -2.8F, -16.5F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 785, 97, textureX, textureY); // Box 231
		leftTrackModel[1] = new ModelRendererTurbo(this, 425, 105, textureX, textureY); // Box 232
		leftTrackModel[2] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 233
		leftTrackModel[3] = new ModelRendererTurbo(this, 353, 105, textureX, textureY); // Box 234
		leftTrackModel[4] = new ModelRendererTurbo(this, 561, 105, textureX, textureY); // Box 235
		leftTrackModel[5] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 236
		leftTrackModel[6] = new ModelRendererTurbo(this, 289, 105, textureX, textureY); // Box 237
		leftTrackModel[7] = new ModelRendererTurbo(this, 609, 105, textureX, textureY); // Box 238
		leftTrackModel[8] = new ModelRendererTurbo(this, 633, 105, textureX, textureY); // Box 239
		leftTrackModel[9] = new ModelRendererTurbo(this, 705, 105, textureX, textureY); // Box 240
		leftTrackModel[10] = new ModelRendererTurbo(this, 657, 105, textureX, textureY); // Box 241
		leftTrackModel[11] = new ModelRendererTurbo(this, 737, 105, textureX, textureY); // Box 242
		leftTrackModel[12] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 243

		leftTrackModel[0].addShapeBox(-6.5F, 1.5F, -6.5F, 51, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 231
		leftTrackModel[0].setRotationPoint(-16.6F, 4.7F, 22.5F);

		leftTrackModel[1].addShapeBox(-6.5F, 1.5F, -6.5F, 57, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 232
		leftTrackModel[1].setRotationPoint(-21.6F, -7.8F, 22.5F);

		leftTrackModel[2].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 233
		leftTrackModel[2].setRotationPoint(-19.6F, 4.7F, 22.5F);

		leftTrackModel[3].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 1, 7, 0F,0.8F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.8F, 1F, 0F, 0F, -0.2F, 0F, 0F, 3.8F, 0F, 0F, 3.8F, 0F, 0F, -0.2F, 0F); // Box 234
		leftTrackModel[3].setRotationPoint(-32.6F, 1.7F, 22.5F);

		leftTrackModel[4].addShapeBox(-6.5F, 1.5F, -6.5F, 15, 1, 7, 0F,0F, -3F, 0F, 0.8F, 3F, 0F, 0.8F, 3F, 0F, 0F, -3F, 0F, 0F, 3.8F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 3.8F, 0F); // Box 235
		leftTrackModel[4].setRotationPoint(34.4F, 1.7F, 22.5F);

		leftTrackModel[5].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,-2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F); // Box 236
		leftTrackModel[5].setRotationPoint(49.4F, -4.3F, 22.5F);

		leftTrackModel[6].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,2F, 0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0.6F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F); // Box 237
		leftTrackModel[6].setRotationPoint(49.4F, -9.3F, 22.5F);

		leftTrackModel[7].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 238
		leftTrackModel[7].setRotationPoint(-33.6F, -2.3F, 22.5F);

		leftTrackModel[8].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,-0.4F, 0F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, -0.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F); // Box 239
		leftTrackModel[8].setRotationPoint(-33.6F, -7.3F, 22.5F);

		leftTrackModel[9].addShapeBox(-6.5F, 1.5F, -6.5F, 7, 1, 7, 0F,0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 240
		leftTrackModel[9].setRotationPoint(-28.6F, -7.8F, 22.5F);

		leftTrackModel[10].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.7F, 0.4F, 0F); // Box 241
		leftTrackModel[10].setRotationPoint(-31.6F, -8.2F, 22.5F);

		leftTrackModel[11].addShapeBox(-6.5F, 1.5F, -6.5F, 9, 1, 7, 0F,0F, -0.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0.8F, 0F); // Box 242
		leftTrackModel[11].setRotationPoint(35.4F, -7.8F, 22.5F);

		leftTrackModel[12].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 243
		leftTrackModel[12].setRotationPoint(44.4F, -10F, 22.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Box 244
		rightTrackModel[1] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 245
		rightTrackModel[2] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 246
		rightTrackModel[3] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 247
		rightTrackModel[4] = new ModelRendererTurbo(this, 113, 113, textureX, textureY); // Box 248
		rightTrackModel[5] = new ModelRendererTurbo(this, 161, 113, textureX, textureY); // Box 249
		rightTrackModel[6] = new ModelRendererTurbo(this, 769, 113, textureX, textureY); // Box 250
		rightTrackModel[7] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 251
		rightTrackModel[8] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 252
		rightTrackModel[9] = new ModelRendererTurbo(this, 673, 113, textureX, textureY); // Box 253
		rightTrackModel[10] = new ModelRendererTurbo(this, 937, 113, textureX, textureY); // Box 254
		rightTrackModel[11] = new ModelRendererTurbo(this, 961, 113, textureX, textureY); // Box 255
		rightTrackModel[12] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 256

		rightTrackModel[0].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 244
		rightTrackModel[0].setRotationPoint(44.4F, -10F, -16.8F);

		rightTrackModel[1].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,2F, 0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0.6F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F); // Box 245
		rightTrackModel[1].setRotationPoint(49.4F, -9.3F, -16.8F);

		rightTrackModel[2].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,-2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F); // Box 246
		rightTrackModel[2].setRotationPoint(49.4F, -4.3F, -16.8F);

		rightTrackModel[3].addShapeBox(-6.5F, 1.5F, -6.5F, 15, 1, 7, 0F,0F, -3F, 0F, 0.8F, 3F, 0F, 0.8F, 3F, 0F, 0F, -3F, 0F, 0F, 3.8F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 3.8F, 0F); // Box 247
		rightTrackModel[3].setRotationPoint(34.4F, 1.7F, -16.8F);

		rightTrackModel[4].addShapeBox(-6.5F, 1.5F, -6.5F, 9, 1, 7, 0F,0F, -0.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0.8F, 0F); // Box 248
		rightTrackModel[4].setRotationPoint(35.4F, -7.8F, -16.8F);

		rightTrackModel[5].addShapeBox(-6.5F, 1.5F, -6.5F, 57, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 249
		rightTrackModel[5].setRotationPoint(-21.6F, -7.8F, -16.8F);

		rightTrackModel[6].addShapeBox(-6.5F, 1.5F, -6.5F, 51, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 250
		rightTrackModel[6].setRotationPoint(-16.6F, 4.7F, -16.8F);

		rightTrackModel[7].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 1, 7, 0F,0.8F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.8F, 1F, 0F, 0F, -0.2F, 0F, 0F, 3.8F, 0F, 0F, 3.8F, 0F, 0F, -0.2F, 0F); // Box 251
		rightTrackModel[7].setRotationPoint(-32.6F, 1.7F, -16.8F);

		rightTrackModel[8].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 252
		rightTrackModel[8].setRotationPoint(-19.6F, 4.7F, -16.8F);

		rightTrackModel[9].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 253
		rightTrackModel[9].setRotationPoint(-33.6F, -2.3F, -16.8F);

		rightTrackModel[10].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,-0.4F, 0F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, -0.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F); // Box 254
		rightTrackModel[10].setRotationPoint(-33.6F, -7.3F, -16.8F);

		rightTrackModel[11].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.7F, 0.4F, 0F); // Box 255
		rightTrackModel[11].setRotationPoint(-31.6F, -8.2F, -16.8F);

		rightTrackModel[12].addShapeBox(-6.5F, 1.5F, -6.5F, 7, 1, 7, 0F,0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 256
		rightTrackModel[12].setRotationPoint(-28.6F, -7.8F, -16.8F);
	}
}