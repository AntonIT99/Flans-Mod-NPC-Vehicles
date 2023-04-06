//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Oscar
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelOscar2 extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelOscar2() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[159];
		bodyDoorOpenModel = new ModelRendererTurbo[2];
		bodyDoorCloseModel = new ModelRendererTurbo[2];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 45
		bodyModel[1] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 46
		bodyModel[2] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 48
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 50
		bodyModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 51
		bodyModel[5] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 52
		bodyModel[6] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 53
		bodyModel[7] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 54
		bodyModel[8] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 55
		bodyModel[9] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 57
		bodyModel[10] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 58
		bodyModel[11] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 59
		bodyModel[12] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 60
		bodyModel[13] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 61
		bodyModel[14] = new ModelRendererTurbo(this, 345, 41, textureX, textureY); // Box 62
		bodyModel[15] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 63
		bodyModel[16] = new ModelRendererTurbo(this, 433, 49, textureX, textureY); // Box 64
		bodyModel[17] = new ModelRendererTurbo(this, 257, 81, textureX, textureY); // Box 65
		bodyModel[18] = new ModelRendererTurbo(this, 329, 81, textureX, textureY); // Box 66
		bodyModel[19] = new ModelRendererTurbo(this, 401, 89, textureX, textureY); // Box 67
		bodyModel[20] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 68
		bodyModel[21] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 69
		bodyModel[22] = new ModelRendererTurbo(this, 81, 49, textureX, textureY); // Box 70
		bodyModel[23] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 71
		bodyModel[24] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 72
		bodyModel[25] = new ModelRendererTurbo(this, 89, 121, textureX, textureY); // Box 73
		bodyModel[26] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 74
		bodyModel[27] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 75
		bodyModel[28] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 76
		bodyModel[29] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 77
		bodyModel[30] = new ModelRendererTurbo(this, 73, 161, textureX, textureY); // Box 78
		bodyModel[31] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 79
		bodyModel[32] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 80
		bodyModel[33] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 81
		bodyModel[34] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 82
		bodyModel[35] = new ModelRendererTurbo(this, 265, 161, textureX, textureY); // Box 83
		bodyModel[36] = new ModelRendererTurbo(this, 361, 169, textureX, textureY); // Box 84
		bodyModel[37] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 85
		bodyModel[38] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 86
		bodyModel[39] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 87
		bodyModel[40] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 88
		bodyModel[41] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 89
		bodyModel[42] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 90
		bodyModel[43] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 91
		bodyModel[44] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 92
		bodyModel[45] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 93
		bodyModel[46] = new ModelRendererTurbo(this, 73, 65, textureX, textureY); // Box 94
		bodyModel[47] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 95
		bodyModel[48] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 97
		bodyModel[49] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 98
		bodyModel[50] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 99
		bodyModel[51] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 100
		bodyModel[52] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 101
		bodyModel[53] = new ModelRendererTurbo(this, 145, 65, textureX, textureY); // Box 102
		bodyModel[54] = new ModelRendererTurbo(this, 233, 161, textureX, textureY); // Box 103
		bodyModel[55] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 104
		bodyModel[56] = new ModelRendererTurbo(this, 169, 65, textureX, textureY); // Box 105
		bodyModel[57] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 106
		bodyModel[58] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 107
		bodyModel[59] = new ModelRendererTurbo(this, 201, 201, textureX, textureY); // Box 108
		bodyModel[60] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 109
		bodyModel[61] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 110
		bodyModel[62] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 111
		bodyModel[63] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 112
		bodyModel[64] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 19
		bodyModel[65] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 20
		bodyModel[66] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 23
		bodyModel[67] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 24
		bodyModel[68] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 25
		bodyModel[69] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 26
		bodyModel[70] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 27
		bodyModel[71] = new ModelRendererTurbo(this, 217, 25, textureX, textureY); // Box 120
		bodyModel[72] = new ModelRendererTurbo(this, 465, 25, textureX, textureY); // Box 121
		bodyModel[73] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 122
		bodyModel[74] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 123
		bodyModel[75] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 124
		bodyModel[76] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 125
		bodyModel[77] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 126
		bodyModel[78] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 127
		bodyModel[79] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 128
		bodyModel[80] = new ModelRendererTurbo(this, 441, 25, textureX, textureY); // Box 129
		bodyModel[81] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 130
		bodyModel[82] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 131
		bodyModel[83] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 132
		bodyModel[84] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 133
		bodyModel[85] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 134
		bodyModel[86] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 135
		bodyModel[87] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 139
		bodyModel[88] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 140
		bodyModel[89] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 141
		bodyModel[90] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 143
		bodyModel[91] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 144
		bodyModel[92] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 145
		bodyModel[93] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 146
		bodyModel[94] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 147
		bodyModel[95] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 148
		bodyModel[96] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 149
		bodyModel[97] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 150
		bodyModel[98] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 151
		bodyModel[99] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 152
		bodyModel[100] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 153
		bodyModel[101] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 154
		bodyModel[102] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 155
		bodyModel[103] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 156
		bodyModel[104] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 157
		bodyModel[105] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 158
		bodyModel[106] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 159
		bodyModel[107] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 160
		bodyModel[108] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 161
		bodyModel[109] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 162
		bodyModel[110] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 163
		bodyModel[111] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 164
		bodyModel[112] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 165
		bodyModel[113] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 166
		bodyModel[114] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 167
		bodyModel[115] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 168
		bodyModel[116] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 169
		bodyModel[117] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 170
		bodyModel[118] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 171
		bodyModel[119] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 172
		bodyModel[120] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 173
		bodyModel[121] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 174
		bodyModel[122] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 175
		bodyModel[123] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 176
		bodyModel[124] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 177
		bodyModel[125] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 178
		bodyModel[126] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 179
		bodyModel[127] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 180
		bodyModel[128] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 181
		bodyModel[129] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 182
		bodyModel[130] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 183
		bodyModel[131] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 184
		bodyModel[132] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 185
		bodyModel[133] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 186
		bodyModel[134] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 187
		bodyModel[135] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 188
		bodyModel[136] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 189
		bodyModel[137] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 190
		bodyModel[138] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 191
		bodyModel[139] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 192
		bodyModel[140] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 193
		bodyModel[141] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 194
		bodyModel[142] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 195
		bodyModel[143] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 196
		bodyModel[144] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 197
		bodyModel[145] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 198
		bodyModel[146] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 199
		bodyModel[147] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 200
		bodyModel[148] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 201
		bodyModel[149] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 202
		bodyModel[150] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 203
		bodyModel[151] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 204
		bodyModel[152] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 205
		bodyModel[153] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 206
		bodyModel[154] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 207
		bodyModel[155] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 208
		bodyModel[156] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 209
		bodyModel[157] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 210
		bodyModel[158] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 211

		bodyModel[0].addShapeBox(0F, 0F, 0F, 38, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[0].setRotationPoint(45F, -11F, -4F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 60, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[1].setRotationPoint(-15F, -11F, -4F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 98, 10, 28, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 48
		bodyModel[2].setRotationPoint(-15F, -4F, -14F);

		bodyModel[3].addShapeBox(0F, 1F, -7.5F, 98, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 50
		bodyModel[3].setRotationPoint(-15F, -11F, -4F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 7, 7, 10, 0F,0F, -1F, -2.5F, 0F, -1.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[4].setRotationPoint(83F, -11F, -14F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 7, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -3F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 52
		bodyModel[5].setRotationPoint(83F, -11F, 4F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 7, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[6].setRotationPoint(83F, -11F, -4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 7, 10, 28, 0F,0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 54
		bodyModel[7].setRotationPoint(83F, -4F, -14F);

		bodyModel[8].addShapeBox(0F, 1F, -7.5F, 98, 6, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 55
		bodyModel[8].setRotationPoint(-15F, -11F, 18F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 4, 28, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -4.5F); // Box 57
		bodyModel[9].setRotationPoint(83F, 6F, -14F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 98, 4, 28, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F); // Box 58
		bodyModel[10].setRotationPoint(-15F, 6F, -14F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 8, 10, 28, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F); // Box 59
		bodyModel[11].setRotationPoint(90F, -4F, -14F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 8, 6, 28, 0F,0F, -0.5F, -3F, 0F, -0.5F, -5F, 0F, -0.5F, -4.5F, 0F, -0.5F, -3F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 60
		bodyModel[12].setRotationPoint(90F, -10F, -14F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[13].setRotationPoint(90F, -11F, -4F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[14].setRotationPoint(90F, -11F, -11F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 2, 7, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -1.5F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 63
		bodyModel[15].setRotationPoint(90F, -11F, 4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 4, 28, 0F,0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, 0F, -5F); // Box 64
		bodyModel[16].setRotationPoint(90F, 6F, -14F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 7, 4, 28, 0F,0F, 0F, -2F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3F, 0F, 0F, -2F, 0F, 0F, -6.5F, 0F, -0.5F, -8F, 0F, -0.5F, -8F, 0F, 0F, -6.5F); // Box 65
		bodyModel[17].setRotationPoint(98F, 6F, -14F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 7, 10, 28, 0F,0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3F, 0F, 0F, -2F); // Box 66
		bodyModel[18].setRotationPoint(98F, -4F, -14F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 7, 6, 28, 0F,0F, -0.5F, -5F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7F, 0F, -0.5F, -4.5F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -1F); // Box 67
		bodyModel[19].setRotationPoint(98F, -10F, -14F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[20].setRotationPoint(98F, -11F, -4F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, -1.5F, -2F, 0F, -1.5F, -4.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -2F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[21].setRotationPoint(98F, -11F, -11F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -4F, 0F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1.5F); // Box 70
		bodyModel[22].setRotationPoint(98F, -11F, 4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 33, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[23].setRotationPoint(-48F, -11F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 33, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -2.5F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1.5F); // Box 72
		bodyModel[24].setRotationPoint(-48F, -11F, 4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 33, 7, 10, 0F,0F, -1F, -5F, 0F, -1F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[25].setRotationPoint(-48F, -11F, -14F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 33, 10, 28, 0F,0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F); // Box 74
		bodyModel[26].setRotationPoint(-48F, -4F, -14F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 33, 4, 28, 0F,0F, 0F, -2F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -6.5F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -6.5F); // Box 75
		bodyModel[27].setRotationPoint(-48F, 6F, -14F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 19, 4, 28, 0F,0F, 0.5F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, -4F, 0F, -1.5F, -7F, 0F, 0F, -6.5F, 0F, 0F, -6.5F, 0F, -1.5F, -7F); // Box 76
		bodyModel[28].setRotationPoint(-67F, 6F, -14F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 19, 10, 28, 0F,0F, -0.5F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.5F, -4F); // Box 77
		bodyModel[29].setRotationPoint(-67F, -4F, -14F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 19, 6, 28, 0F,0F, 0F, -8F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -8F, 0F, 0.5F, -3.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -3.5F); // Box 78
		bodyModel[30].setRotationPoint(-67F, -10F, -14F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 19, 1, 8, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 79
		bodyModel[31].setRotationPoint(-67F, -11F, -4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F,0F, -1F, -3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 80
		bodyModel[32].setRotationPoint(-67F, -11F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 19, 1, 5, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -3F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F); // Box 81
		bodyModel[33].setRotationPoint(-67F, -11F, 4F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 17, 6, 28, 0F,0F, -2.5F, -9F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -2.5F, -9F, 0F, 1.5F, -5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 1.5F, -5F); // Box 82
		bodyModel[34].setRotationPoint(-84F, -10F, -14F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 17, 9, 28, 0F,0F, -0.5F, -5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, -0.5F, -5F, 0F, -2F, -5F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -2F, -5F); // Box 83
		bodyModel[35].setRotationPoint(-84F, -3F, -14F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 17, 3, 28, 0F,0F, 1F, -5F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 1F, -5F, 0F, -0.5F, -9F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, -0.5F, -9F); // Box 84
		bodyModel[36].setRotationPoint(-84F, 5F, -14F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 7, 6, 24, 0F,0F, -0.5F, -5.5F, 0F, -2F, -8F, 0F, -2F, -7.75F, 0F, -0.5F, -5F, 0F, 0F, -0.5F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, -0.5F); // Box 85
		bodyModel[37].setRotationPoint(105F, -10F, -12F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 7, 10, 24, 0F,0F, 0F, -0.5F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, -0.5F, 0F, -0.5F, -1.5F, 0F, -2F, -4F, 0F, -2F, -3.75F, 0F, -0.5F, -1F); // Box 86
		bodyModel[38].setRotationPoint(105F, -4F, -12F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 7, 5, 24, 0F,0F, -0.5F, -1.5F, 0F, 1F, -4F, 0F, 1F, -3.75F, 0F, -0.5F, -1F, 0F, -0.5F, -6F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, -0.5F, -6F); // Box 87
		bodyModel[39].setRotationPoint(105F, 5F, -12F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 6, 6, 16, 0F,0F, -2F, -4F, 0F, -6F, -5.5F, 0F, -6F, -5.5F, 0F, -2F, -3.75F, 0F, 1F, 0.5F, 0F, 2.5F, -3.5F, 0F, 2.5F, -3.5F, 0F, 1F, 0.5F); // Box 88
		bodyModel[40].setRotationPoint(112F, -10F, -8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 6, 8, 16, 0F,0F, 1F, 0.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0F, 1F, 0.5F, 0F, -2F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, -2F, 0.25F); // Box 89
		bodyModel[41].setRotationPoint(112F, -2F, -8F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 6, 5, 16, 0F,0F, -2F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, -2F, 0.25F, 0F, 1F, -5F, 0F, -2.5F, -6.5F, 0F, -2.5F, -6.5F, 0F, 1F, -5F); // Box 90
		bodyModel[42].setRotationPoint(112F, 2F, -8F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 4, 9, 0F,0F, 0F, 0F, 0F, -1F, -3.5F, 0F, -1F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -1.5F, -3.5F, 0F, -1.5F, -3.5F, 0F, 0F, -0.5F); // Box 91
		bodyModel[43].setRotationPoint(118F, -1.5F, -4.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, -0.5F, -2F, -0.75F, -2F, -3F, -0.75F, -2F, -3F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 1F, -3.5F, 0F, 1F, -3.5F, 0F, 0F, 0F); // Box 92
		bodyModel[44].setRotationPoint(118F, -4.5F, -4.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 2, 3, 9, 0F,0F, 0F, -0.5F, 0F, 1.5F, -3.5F, 0F, 1.5F, -3.5F, 0F, 0F, -0.5F, 0F, -1F, -3F, -0.75F, -2F, -3F, -0.75F, -2F, -3F, 0F, -1F, -3F); // Box 93
		bodyModel[45].setRotationPoint(118F, 2.5F, -4.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 32, 2, 8, 0F,0F, -0.25F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.25F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[46].setRotationPoint(-2F, -12.5F, -4F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F,0F, -1.75F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -1.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 95
		bodyModel[47].setRotationPoint(-12F, -12.5F, -4F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 7, 2, 8, 0F,0F, 0F, -1F, 0F, -1.75F, -1F, 0F, -1.75F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 97
		bodyModel[48].setRotationPoint(30F, -12.5F, -4F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 18, 6, 14, 0F,0F, -6F, -3F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, -6F, -3F, 0F, 2.5F, 1F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 2.5F, 1F); // Box 98
		bodyModel[49].setRotationPoint(-102F, -10F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 18, 6, 14, 0F,0F, 0.5F, 1F, 0F, 1.5F, 2F, 0F, 1.5F, 2F, 0F, 0.5F, 1F, 0F, -2F, 1F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, -2F, 1F); // Box 99
		bodyModel[50].setRotationPoint(-102F, -1F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 18, 3, 14, 0F,0F, 0F, 1F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 0F, 1F, 0F, -1F, -2F, 0F, 1.5F, -2F, 0F, 1.5F, -2F, 0F, -1F, -2F); // Box 100
		bodyModel[51].setRotationPoint(-102F, 3F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 15, 6, 14, 0F,0F, -1F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, -1F, -0.5F, 0F, -3F, -0.5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -3F, -0.5F); // Box 101
		bodyModel[52].setRotationPoint(-117F, -1F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 1, 13, 0F,0F, -0.4F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.4F, -1F); // Box 102
		bodyModel[53].setRotationPoint(-119F, 0.5F, -6.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 15, 4, 14, 0F,0F, -6F, -0.5F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, -6F, -0.5F, 0F, 2.05F, -0.5F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 2.05F, -0.5F); // Box 103
		bodyModel[54].setRotationPoint(-117F, -6F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 15, 4, 14, 0F,0F, -0.95F, -0.5F, 0F, -2F, 1F, 0F, -2F, 1F, 0F, -0.95F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -3F, -0.5F); // Box 104
		bodyModel[55].setRotationPoint(-117F, 1F, -7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,-0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F); // Box 105
		bodyModel[56].setRotationPoint(98F, -7.7F, -20F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 5, 1, 10, 0F,1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F); // Box 106
		bodyModel[57].setRotationPoint(98F, -7.7F, 10F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 18, 1, 14, 0F,0F, -0.25F, 0F, -6.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -6.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 107
		bodyModel[58].setRotationPoint(-114F, -0.5F, -16F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 18, 1, 14, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, -6.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -6.5F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 108
		bodyModel[59].setRotationPoint(-114F, -0.5F, 2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 109
		bodyModel[60].setRotationPoint(-112F, 2F, -5.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 8, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -2.5F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 110
		bodyModel[61].setRotationPoint(-112F, 2F, 4.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, -1F); // Box 111
		bodyModel[62].setRotationPoint(-125F, 0.5F, -6.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, -1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, -1F); // Box 112
		bodyModel[63].setRotationPoint(-125F, 0.5F, 3.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[64].setRotationPoint(-129F, 0.5F, -5.5F);

		bodyModel[65].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 20
		bodyModel[65].setRotationPoint(-127F, 1F, -5F);

		bodyModel[66].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 23
		bodyModel[66].setRotationPoint(-127F, 1F, -5F);
		bodyModel[66].rotateAngleX = 1.04719755F;

		bodyModel[67].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 24
		bodyModel[67].setRotationPoint(-127F, 1F, -5F);
		bodyModel[67].rotateAngleX = 2.0943951F;

		bodyModel[68].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 25
		bodyModel[68].setRotationPoint(-127F, 1F, -5F);
		bodyModel[68].rotateAngleX = 3.14159265F;

		bodyModel[69].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 26
		bodyModel[69].setRotationPoint(-127F, 1F, -5F);
		bodyModel[69].rotateAngleX = 4.1887902F;

		bodyModel[70].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.2F, 0.2F, -0.4F, -0.2F, 0.2F); // Box 27
		bodyModel[70].setRotationPoint(-127F, 1F, -5F);
		bodyModel[70].rotateAngleX = 5.23598776F;

		bodyModel[71].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[71].setRotationPoint(-129F, 0.5F, 4.5F);

		bodyModel[72].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[72].setRotationPoint(-127F, 1F, 5F);

		bodyModel[73].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 122
		bodyModel[73].setRotationPoint(-127F, 1F, 5F);
		bodyModel[73].rotateAngleX = 1.04719755F;

		bodyModel[74].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 123
		bodyModel[74].setRotationPoint(-127F, 1F, 5F);
		bodyModel[74].rotateAngleX = 2.0943951F;

		bodyModel[75].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[75].setRotationPoint(-127F, 1F, 5F);
		bodyModel[75].rotateAngleX = 3.14159265F;

		bodyModel[76].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[76].setRotationPoint(-127F, 1F, 5F);
		bodyModel[76].rotateAngleX = 4.1887902F;

		bodyModel[77].addShapeBox(0F, -0.5F, -0.5F, 1, 3, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.4F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, -0.4F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[77].setRotationPoint(-127F, 1F, 5F);
		bodyModel[77].rotateAngleX = 5.23598776F;

		bodyModel[78].addShapeBox(0F, 0F, 0F, 18, 10, 1, 0F,0F, 0F, -0.2F, 0F, -6.5F, -0.2F, 0F, -6.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 127
		bodyModel[78].setRotationPoint(-102F, -13F, -0.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 7, 12, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.5F, 0F, -0.2F); // Box 128
		bodyModel[79].setRotationPoint(-109F, -13F, -0.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 129
		bodyModel[80].setRotationPoint(-113F, -13F, -0.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 21, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[81].setRotationPoint(45F, -18.5F, -3.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 131
		bodyModel[82].setRotationPoint(66F, -18.5F, -3.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 8, 7, 0F,0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 132
		bodyModel[83].setRotationPoint(69F, -18.5F, -3.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 8, 7, 0F,0F, 0F, -1.5F, 0F, -0.5F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, -1F); // Box 133
		bodyModel[84].setRotationPoint(72F, -18.5F, -3.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 8, 7, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 134
		bodyModel[85].setRotationPoint(40F, -18.5F, -3.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 9, 8, 7, 0F,1F, -1F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, -1F, -3F, 2.5F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 2.5F, 0F, -3F); // Box 135
		bodyModel[86].setRotationPoint(31F, -18.5F, -3.5F);

		bodyModel[87].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 139
		bodyModel[87].setRotationPoint(-10F, -8.5F, 4.5F);
		bodyModel[87].rotateAngleZ = -0.61086524F;

		bodyModel[88].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 140
		bodyModel[88].setRotationPoint(-10F, -8.5F, 4.5F);
		bodyModel[88].rotateAngleZ = -0.61086524F;

		bodyModel[89].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 141
		bodyModel[89].setRotationPoint(-10F, -8.5F, 4.5F);
		bodyModel[89].rotateAngleZ = -0.61086524F;

		bodyModel[90].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 143
		bodyModel[90].setRotationPoint(-2F, -8.5F, 4.5F);
		bodyModel[90].rotateAngleZ = -0.61086524F;

		bodyModel[91].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		bodyModel[91].setRotationPoint(-2F, -8.5F, 4.5F);
		bodyModel[91].rotateAngleZ = -0.61086524F;

		bodyModel[92].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 145
		bodyModel[92].setRotationPoint(-2F, -8.5F, 4.5F);
		bodyModel[92].rotateAngleZ = -0.61086524F;

		bodyModel[93].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 146
		bodyModel[93].setRotationPoint(6F, -8.5F, 4.5F);
		bodyModel[93].rotateAngleZ = -0.61086524F;

		bodyModel[94].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[94].setRotationPoint(6F, -8.5F, 4.5F);
		bodyModel[94].rotateAngleZ = -0.61086524F;

		bodyModel[95].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 148
		bodyModel[95].setRotationPoint(6F, -8.5F, 4.5F);
		bodyModel[95].rotateAngleZ = -0.61086524F;

		bodyModel[96].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 149
		bodyModel[96].setRotationPoint(14F, -8.5F, 4.5F);
		bodyModel[96].rotateAngleZ = -0.61086524F;

		bodyModel[97].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[97].setRotationPoint(14F, -8.5F, 4.5F);
		bodyModel[97].rotateAngleZ = -0.61086524F;

		bodyModel[98].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 151
		bodyModel[98].setRotationPoint(14F, -8.5F, 4.5F);
		bodyModel[98].rotateAngleZ = -0.61086524F;

		bodyModel[99].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 152
		bodyModel[99].setRotationPoint(22F, -8.5F, 4.5F);
		bodyModel[99].rotateAngleZ = -0.61086524F;

		bodyModel[100].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[100].setRotationPoint(22F, -8.5F, 4.5F);
		bodyModel[100].rotateAngleZ = -0.61086524F;

		bodyModel[101].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 154
		bodyModel[101].setRotationPoint(22F, -8.5F, 4.5F);
		bodyModel[101].rotateAngleZ = -0.61086524F;

		bodyModel[102].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 155
		bodyModel[102].setRotationPoint(30F, -8.5F, 4.5F);
		bodyModel[102].rotateAngleZ = -0.61086524F;

		bodyModel[103].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 156
		bodyModel[103].setRotationPoint(30F, -8.5F, 4.5F);
		bodyModel[103].rotateAngleZ = -0.61086524F;

		bodyModel[104].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 157
		bodyModel[104].setRotationPoint(30F, -8.5F, 4.5F);
		bodyModel[104].rotateAngleZ = -0.61086524F;

		bodyModel[105].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 158
		bodyModel[105].setRotationPoint(38F, -8.5F, 4.5F);
		bodyModel[105].rotateAngleZ = -0.61086524F;

		bodyModel[106].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[106].setRotationPoint(38F, -8.5F, 4.5F);
		bodyModel[106].rotateAngleZ = -0.61086524F;

		bodyModel[107].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 160
		bodyModel[107].setRotationPoint(38F, -8.5F, 4.5F);
		bodyModel[107].rotateAngleZ = -0.61086524F;

		bodyModel[108].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 161
		bodyModel[108].setRotationPoint(46F, -8.5F, 4.5F);
		bodyModel[108].rotateAngleZ = -0.61086524F;

		bodyModel[109].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[109].setRotationPoint(46F, -8.5F, 4.5F);
		bodyModel[109].rotateAngleZ = -0.61086524F;

		bodyModel[110].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 163
		bodyModel[110].setRotationPoint(46F, -8.5F, 4.5F);
		bodyModel[110].rotateAngleZ = -0.61086524F;

		bodyModel[111].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 164
		bodyModel[111].setRotationPoint(54F, -8.5F, 4.5F);
		bodyModel[111].rotateAngleZ = -0.61086524F;

		bodyModel[112].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 165
		bodyModel[112].setRotationPoint(54F, -8.5F, 4.5F);
		bodyModel[112].rotateAngleZ = -0.61086524F;

		bodyModel[113].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 166
		bodyModel[113].setRotationPoint(54F, -8.5F, 4.5F);
		bodyModel[113].rotateAngleZ = -0.61086524F;

		bodyModel[114].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 167
		bodyModel[114].setRotationPoint(62F, -8.5F, 4.5F);
		bodyModel[114].rotateAngleZ = -0.61086524F;

		bodyModel[115].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 168
		bodyModel[115].setRotationPoint(62F, -8.5F, 4.5F);
		bodyModel[115].rotateAngleZ = -0.61086524F;

		bodyModel[116].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 169
		bodyModel[116].setRotationPoint(62F, -8.5F, 4.5F);
		bodyModel[116].rotateAngleZ = -0.61086524F;

		bodyModel[117].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 170
		bodyModel[117].setRotationPoint(70F, -8.5F, 4.5F);
		bodyModel[117].rotateAngleZ = -0.61086524F;

		bodyModel[118].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[118].setRotationPoint(70F, -8.5F, 4.5F);
		bodyModel[118].rotateAngleZ = -0.61086524F;

		bodyModel[119].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 172
		bodyModel[119].setRotationPoint(70F, -8.5F, 4.5F);
		bodyModel[119].rotateAngleZ = -0.61086524F;

		bodyModel[120].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 173
		bodyModel[120].setRotationPoint(78F, -8.5F, 4.5F);
		bodyModel[120].rotateAngleZ = -0.61086524F;

		bodyModel[121].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[121].setRotationPoint(78F, -8.5F, 4.5F);
		bodyModel[121].rotateAngleZ = -0.61086524F;

		bodyModel[122].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 175
		bodyModel[122].setRotationPoint(78F, -8.5F, 4.5F);
		bodyModel[122].rotateAngleZ = -0.61086524F;

		bodyModel[123].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 176
		bodyModel[123].setRotationPoint(-10F, -8.5F, -10.5F);
		bodyModel[123].rotateAngleZ = -0.61086524F;

		bodyModel[124].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[124].setRotationPoint(-10F, -8.5F, -10.5F);
		bodyModel[124].rotateAngleZ = -0.61086524F;

		bodyModel[125].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 178
		bodyModel[125].setRotationPoint(-10F, -8.5F, -10.5F);
		bodyModel[125].rotateAngleZ = -0.61086524F;

		bodyModel[126].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 179
		bodyModel[126].setRotationPoint(-2F, -8.5F, -10.5F);
		bodyModel[126].rotateAngleZ = -0.61086524F;

		bodyModel[127].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[127].setRotationPoint(-2F, -8.5F, -10.5F);
		bodyModel[127].rotateAngleZ = -0.61086524F;

		bodyModel[128].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 181
		bodyModel[128].setRotationPoint(-2F, -8.5F, -10.5F);
		bodyModel[128].rotateAngleZ = -0.61086524F;

		bodyModel[129].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 182
		bodyModel[129].setRotationPoint(6F, -8.5F, -10.5F);
		bodyModel[129].rotateAngleZ = -0.61086524F;

		bodyModel[130].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[130].setRotationPoint(6F, -8.5F, -10.5F);
		bodyModel[130].rotateAngleZ = -0.61086524F;

		bodyModel[131].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 184
		bodyModel[131].setRotationPoint(6F, -8.5F, -10.5F);
		bodyModel[131].rotateAngleZ = -0.61086524F;

		bodyModel[132].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 185
		bodyModel[132].setRotationPoint(14F, -8.5F, -10.5F);
		bodyModel[132].rotateAngleZ = -0.61086524F;

		bodyModel[133].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[133].setRotationPoint(14F, -8.5F, -10.5F);
		bodyModel[133].rotateAngleZ = -0.61086524F;

		bodyModel[134].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 187
		bodyModel[134].setRotationPoint(14F, -8.5F, -10.5F);
		bodyModel[134].rotateAngleZ = -0.61086524F;

		bodyModel[135].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 188
		bodyModel[135].setRotationPoint(22F, -8.5F, -10.5F);
		bodyModel[135].rotateAngleZ = -0.61086524F;

		bodyModel[136].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 189
		bodyModel[136].setRotationPoint(22F, -8.5F, -10.5F);
		bodyModel[136].rotateAngleZ = -0.61086524F;

		bodyModel[137].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 190
		bodyModel[137].setRotationPoint(22F, -8.5F, -10.5F);
		bodyModel[137].rotateAngleZ = -0.61086524F;

		bodyModel[138].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 191
		bodyModel[138].setRotationPoint(30F, -8.5F, -10.5F);
		bodyModel[138].rotateAngleZ = -0.61086524F;

		bodyModel[139].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[139].setRotationPoint(30F, -8.5F, -10.5F);
		bodyModel[139].rotateAngleZ = -0.61086524F;

		bodyModel[140].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 193
		bodyModel[140].setRotationPoint(30F, -8.5F, -10.5F);
		bodyModel[140].rotateAngleZ = -0.61086524F;

		bodyModel[141].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 194
		bodyModel[141].setRotationPoint(38F, -8.5F, -10.5F);
		bodyModel[141].rotateAngleZ = -0.61086524F;

		bodyModel[142].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[142].setRotationPoint(38F, -8.5F, -10.5F);
		bodyModel[142].rotateAngleZ = -0.61086524F;

		bodyModel[143].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 196
		bodyModel[143].setRotationPoint(38F, -8.5F, -10.5F);
		bodyModel[143].rotateAngleZ = -0.61086524F;

		bodyModel[144].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 197
		bodyModel[144].setRotationPoint(46F, -8.5F, -10.5F);
		bodyModel[144].rotateAngleZ = -0.61086524F;

		bodyModel[145].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[145].setRotationPoint(46F, -8.5F, -10.5F);
		bodyModel[145].rotateAngleZ = -0.61086524F;

		bodyModel[146].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 199
		bodyModel[146].setRotationPoint(46F, -8.5F, -10.5F);
		bodyModel[146].rotateAngleZ = -0.61086524F;

		bodyModel[147].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 200
		bodyModel[147].setRotationPoint(54F, -8.5F, -10.5F);
		bodyModel[147].rotateAngleZ = -0.61086524F;

		bodyModel[148].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[148].setRotationPoint(54F, -8.5F, -10.5F);
		bodyModel[148].rotateAngleZ = -0.61086524F;

		bodyModel[149].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 202
		bodyModel[149].setRotationPoint(54F, -8.5F, -10.5F);
		bodyModel[149].rotateAngleZ = -0.61086524F;

		bodyModel[150].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 203
		bodyModel[150].setRotationPoint(62F, -8.5F, -10.5F);
		bodyModel[150].rotateAngleZ = -0.61086524F;

		bodyModel[151].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 204
		bodyModel[151].setRotationPoint(62F, -8.5F, -10.5F);
		bodyModel[151].rotateAngleZ = -0.61086524F;

		bodyModel[152].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 205
		bodyModel[152].setRotationPoint(62F, -8.5F, -10.5F);
		bodyModel[152].rotateAngleZ = -0.61086524F;

		bodyModel[153].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 206
		bodyModel[153].setRotationPoint(70F, -8.5F, -10.5F);
		bodyModel[153].rotateAngleZ = -0.61086524F;

		bodyModel[154].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[154].setRotationPoint(70F, -8.5F, -10.5F);
		bodyModel[154].rotateAngleZ = -0.61086524F;

		bodyModel[155].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 208
		bodyModel[155].setRotationPoint(70F, -8.5F, -10.5F);
		bodyModel[155].rotateAngleZ = -0.61086524F;

		bodyModel[156].addShapeBox(-3F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 209
		bodyModel[156].setRotationPoint(78F, -8.5F, -10.5F);
		bodyModel[156].rotateAngleZ = -0.61086524F;

		bodyModel[157].addShapeBox(-1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 210
		bodyModel[157].setRotationPoint(78F, -8.5F, -10.5F);
		bodyModel[157].rotateAngleZ = -0.61086524F;

		bodyModel[158].addShapeBox(1F, 0F, 0F, 2, 11, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 211
		bodyModel[158].setRotationPoint(78F, -8.5F, -10.5F);
		bodyModel[158].rotateAngleZ = -0.61086524F;
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 212
		bodyDoorOpenModel[1] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 213

		bodyDoorOpenModel[0].addShapeBox(0F, 0.5F, 0F, 98, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 212
		bodyDoorOpenModel[0].setRotationPoint(-15F, -11F, 4F);
		bodyDoorOpenModel[0].rotateAngleX = 1.53588974F;

		bodyDoorOpenModel[1].addShapeBox(0F, 0F, -7F, 98, 1, 7, 0F,0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 213
		bodyDoorOpenModel[1].setRotationPoint(-15F, -11F, -4F);
		bodyDoorOpenModel[1].rotateAngleX = -1.53588974F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 49
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 142

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, -7F, 98, 1, 7, 0F,0F, -1F, 0.5F, 0F, -1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 49
		bodyDoorCloseModel[0].setRotationPoint(-15F, -11F, -4F);

		bodyDoorCloseModel[1].addShapeBox(0F, 0.5F, 0F, 98, 1, 7, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyDoorCloseModel[1].setRotationPoint(-15F, -11F, 4.5F);
	}
}