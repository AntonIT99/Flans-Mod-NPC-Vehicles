//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Rotislav
// Model Creator: 
// Created on: 02.08.2020 - 11:23:31
// Last changed on: 02.08.2020 - 11:23:31

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelRotislav extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelRotislav() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[182];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 2
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 3
		bodyModel[3] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 4
		bodyModel[4] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 5
		bodyModel[5] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 6
		bodyModel[6] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 7
		bodyModel[7] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 8
		bodyModel[8] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 9
		bodyModel[9] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 10
		bodyModel[10] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 11
		bodyModel[11] = new ModelRendererTurbo(this, 193, 41, textureX, textureY); // Box 12
		bodyModel[12] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 393, 41, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 105, 81, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 417, 1, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 185, 89, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 249, 121, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 17, 9, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 177, 97, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 185, 1, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 289, 41, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 193, 49, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 77
		bodyModel[76] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 78
		bodyModel[77] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 79
		bodyModel[78] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 80
		bodyModel[79] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 81
		bodyModel[80] = new ModelRendererTurbo(this, 129, 9, textureX, textureY); // Box 29
		bodyModel[81] = new ModelRendererTurbo(this, 161, 9, textureX, textureY); // Box 30
		bodyModel[82] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 31
		bodyModel[83] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Box 32
		bodyModel[84] = new ModelRendererTurbo(this, 417, 9, textureX, textureY); // Box 34
		bodyModel[85] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 35
		bodyModel[86] = new ModelRendererTurbo(this, 473, 9, textureX, textureY); // Box 36
		bodyModel[87] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 37
		bodyModel[88] = new ModelRendererTurbo(this, 49, 17, textureX, textureY); // Box 38
		bodyModel[89] = new ModelRendererTurbo(this, 57, 17, textureX, textureY); // Box 39
		bodyModel[90] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 40
		bodyModel[91] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 41
		bodyModel[92] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 42
		bodyModel[93] = new ModelRendererTurbo(this, 129, 25, textureX, textureY); // Box 43
		bodyModel[94] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 44
		bodyModel[95] = new ModelRendererTurbo(this, 169, 25, textureX, textureY); // Box 45
		bodyModel[96] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 46
		bodyModel[97] = new ModelRendererTurbo(this, 249, 25, textureX, textureY); // Box 47
		bodyModel[98] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 48
		bodyModel[99] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 49
		bodyModel[100] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 50
		bodyModel[101] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 51
		bodyModel[102] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 52
		bodyModel[103] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Box 53
		bodyModel[104] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 106
		bodyModel[105] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 107
		bodyModel[106] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 108
		bodyModel[107] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 109
		bodyModel[108] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 110
		bodyModel[109] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 111
		bodyModel[110] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 112
		bodyModel[111] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 113
		bodyModel[112] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 114
		bodyModel[113] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 128
		bodyModel[114] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 129
		bodyModel[115] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 130
		bodyModel[116] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 131
		bodyModel[117] = new ModelRendererTurbo(this, 217, 137, textureX, textureY); // Box 132
		bodyModel[118] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 133
		bodyModel[119] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 136
		bodyModel[120] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 433, 81, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 25, 145, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 141
		bodyModel[125] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 142
		bodyModel[126] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 143
		bodyModel[127] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 144
		bodyModel[128] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 145
		bodyModel[129] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 146
		bodyModel[130] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 147
		bodyModel[131] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 148
		bodyModel[132] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 149
		bodyModel[133] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 150
		bodyModel[134] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 151
		bodyModel[135] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 152
		bodyModel[136] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 153
		bodyModel[137] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 154
		bodyModel[138] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 155
		bodyModel[139] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 156
		bodyModel[140] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 157
		bodyModel[141] = new ModelRendererTurbo(this, 337, 49, textureX, textureY); // Box 158
		bodyModel[142] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 159
		bodyModel[143] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 160
		bodyModel[144] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 161
		bodyModel[145] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 162
		bodyModel[146] = new ModelRendererTurbo(this, 425, 145, textureX, textureY); // Box 163
		bodyModel[147] = new ModelRendererTurbo(this, 457, 145, textureX, textureY); // Box 164
		bodyModel[148] = new ModelRendererTurbo(this, 321, 65, textureX, textureY); // Box 165
		bodyModel[149] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 166
		bodyModel[150] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 167
		bodyModel[151] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 168
		bodyModel[152] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 169
		bodyModel[153] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 170
		bodyModel[154] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 171
		bodyModel[155] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 172
		bodyModel[156] = new ModelRendererTurbo(this, 97, 9, textureX, textureY); // Box 173
		bodyModel[157] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 174
		bodyModel[158] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 175
		bodyModel[159] = new ModelRendererTurbo(this, 433, 9, textureX, textureY); // Box 176
		bodyModel[160] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 177
		bodyModel[161] = new ModelRendererTurbo(this, 9, 17, textureX, textureY); // Box 178
		bodyModel[162] = new ModelRendererTurbo(this, 185, 17, textureX, textureY); // Box 179
		bodyModel[163] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 180
		bodyModel[164] = new ModelRendererTurbo(this, 337, 17, textureX, textureY); // Box 181
		bodyModel[165] = new ModelRendererTurbo(this, 345, 17, textureX, textureY); // Box 182
		bodyModel[166] = new ModelRendererTurbo(this, 433, 17, textureX, textureY); // Box 183
		bodyModel[167] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 184
		bodyModel[168] = new ModelRendererTurbo(this, 385, 9, textureX, textureY); // Box 185
		bodyModel[169] = new ModelRendererTurbo(this, 393, 9, textureX, textureY); // Box 186
		bodyModel[170] = new ModelRendererTurbo(this, 497, 25, textureX, textureY); // Box 187
		bodyModel[171] = new ModelRendererTurbo(this, 401, 25, textureX, textureY); // Box 188
		bodyModel[172] = new ModelRendererTurbo(this, 241, 41, textureX, textureY); // Box 189
		bodyModel[173] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 190
		bodyModel[174] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 191
		bodyModel[175] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 192
		bodyModel[176] = new ModelRendererTurbo(this, 505, 41, textureX, textureY); // Box 193
		bodyModel[177] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 194
		bodyModel[178] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 195
		bodyModel[179] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 196
		bodyModel[180] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 197
		bodyModel[181] = new ModelRendererTurbo(this, 41, 57, textureX, textureY); // Box 198

		bodyModel[0].addShapeBox(0F, 0F, 0F, 4, 11, 37, 0F,35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-21F, -7F, -18.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 1, 11, 34, 0F,9F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 1.5F, 9F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 1.5F); // Box 2
		bodyModel[1].setRotationPoint(27F, -7F, -17F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 1, 11, 31, 0F,9F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 1.5F, 9F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 1.5F); // Box 3
		bodyModel[2].setRotationPoint(46F, -7F, -15.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 15, 11, 27, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 4
		bodyModel[3].setRotationPoint(56F, -7F, -13.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 13, 11, 21, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 5
		bodyModel[4].setRotationPoint(71F, -7F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 9, 11, 11, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 6
		bodyModel[5].setRotationPoint(84F, -7F, -5.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 11, 3, 0F,0F, 0F, 4F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 0.2F, -1F, -1F, 0.2F, -1F, -1F, 0F, 0F, 4F); // Box 7
		bodyModel[6].setRotationPoint(93F, -7F, -1.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 15, 11, 32, 0F,0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Box 8
		bodyModel[7].setRotationPoint(-71F, -7F, -16F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 11, 22, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F); // Box 9
		bodyModel[8].setRotationPoint(-86F, -7F, -11F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 8, 11, 13, 0F,0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F); // Box 10
		bodyModel[9].setRotationPoint(-94F, -7F, -6.5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 7, 11, 2, 0F,0F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 0F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 2.5F, 0F, 0F); // Box 11
		bodyModel[10].setRotationPoint(-101F, -7F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 4, 5, 37, 0F,35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F); // Box 12
		bodyModel[11].setRotationPoint(-21F, 4F, -18.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 5, 34, 0F,9F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 1.5F, 9F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 1.5F); // Box 13
		bodyModel[12].setRotationPoint(27F, 4F, -17F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 15, 5, 27, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 14
		bodyModel[13].setRotationPoint(56F, 4F, -13.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 1, 5, 31, 0F,9F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 1.5F, 9F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 1.5F); // Box 15
		bodyModel[14].setRotationPoint(46F, 4F, -15.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 13, 5, 21, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F); // Box 16
		bodyModel[15].setRotationPoint(71F, 4F, -10.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 8, 3, 3, 0F,0F, 0F, 4F, 0.2F, 1F, -1F, 0.2F, 1F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 2F, -1F, -1F, 2F, -1F, -1F, 0F, 0F, 4F); // Box 17
		bodyModel[16].setRotationPoint(93F, 4F, -1.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 9, 5, 11, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F); // Box 18
		bodyModel[17].setRotationPoint(84F, 4F, -5.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 15, 5, 32, 0F,0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F); // Box 19
		bodyModel[18].setRotationPoint(-71F, 4F, -16F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 15, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -1F); // Box 20
		bodyModel[19].setRotationPoint(-86F, 4F, -11F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 5, 13, 0F,0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, -2F); // Box 21
		bodyModel[20].setRotationPoint(-94F, 4F, -6.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 7, 5, 2, 0F,2.5F, 0F, 0F, 0F, 0F, 5.5F, 0F, 0F, 5.5F, 2.5F, 0F, 0F, 1F, -2F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 1F, -2F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-101F, 4F, -1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 1, 7, 34, 0F,9F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 1.5F, 9F, 0F, -2.5F, 9F, 0F, -4F, 9F, 0F, -4F, 9F, 0F, -2.5F); // Box 23
		bodyModel[22].setRotationPoint(27F, 9F, -17F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 8, 6, 3, 0F,0F, 0F, 4F, 4F, 1F, -1F, 4F, 1F, -1F, 0F, 0F, 4F, 0F, 0F, 0F, -2F, -2F, -1F, -2F, -2F, -1F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(93F, 9F, -1.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 9, 7, 11, 0F,0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(84F, 9F, -5.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 13, 7, 21, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F); // Box 26
		bodyModel[25].setRotationPoint(71F, 9F, -10.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 15, 7, 27, 0F,0F, 0F, 2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -2F); // Box 27
		bodyModel[26].setRotationPoint(56F, 9F, -13.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 1, 7, 31, 0F,9F, 0F, 1.5F, 9F, 0F, 0F, 9F, 0F, 0F, 9F, 0F, 1.5F, 9F, 0F, -2.5F, 9F, 0F, -4F, 9F, 0F, -4F, 9F, 0F, -2.5F); // Box 28
		bodyModel[27].setRotationPoint(46F, 9F, -15.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 4, 7, 37, 0F,35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, 0F, 35F, 0F, -4F, 35F, 0F, -4F, 35F, 0F, -4F, 35F, 0F, -4F); // Box 29
		bodyModel[28].setRotationPoint(-21F, 9F, -18.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 15, 7, 32, 0F,0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4F); // Box 30
		bodyModel[29].setRotationPoint(-71F, 9F, -16F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 15, 7, 22, 0F,0F, 0F, -1F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -1F, 0F, 0F, -5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -5F); // Box 31
		bodyModel[30].setRotationPoint(-86F, 9F, -11F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 8, 7, 11, 0F,0F, 0F, -1F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, -1F, -5F, -1F, -4F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -5F, -1F, -4F); // Box 32
		bodyModel[31].setRotationPoint(-94F, 9F, -5.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 9, 7, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(-95F, 9F, -1F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 34
		bodyModel[33].setRotationPoint(-103F, 8F, -0.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 5, 6, 15, 0F,40F, 0F, 0F, 40F, 0.5F, 0F, 40F, 0.5F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F, 40F, 0F, 0F); // Box 35
		bodyModel[34].setRotationPoint(-1F, -13F, -7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 9, 2, 39, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 36
		bodyModel[35].setRotationPoint(9.5F, -18.5F, -19.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.2F, 0.5F, -0.7F, 0.2F, -0.8F, 0.3F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.5F, -0.7F, 0.2F, -0.8F, 0.3F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 37
		bodyModel[36].setRotationPoint(18.51F, -18.5F, -9.51F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0.2F, 0F, 0.3F, 0.2F, 0F, -0.7F, 0.2F, -0.8F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0F, 0.3F, 0.2F, 0F, -0.7F, 0.2F, -0.8F, 0F, 0.2F, 0.5F); // Box 38
		bodyModel[37].setRotationPoint(18.51F, -18.5F, 7.49F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 32, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(-14F, -13F, -18F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 25, 2, 15, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 40
		bodyModel[39].setRotationPoint(18.5F, -18.5F, -7.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 3, 3, 9, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[40].setRotationPoint(37.5F, -21F, -4.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 3, 9, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Box 42
		bodyModel[41].setRotationPoint(41F, -21F, -4.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 9, 3, 12, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(28.5F, -21F, -6F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 44
		bodyModel[43].setRotationPoint(100F, -18F, -0.5F);

		bodyModel[44].addShapeBox(-0.5F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 45
		bodyModel[44].setRotationPoint(100.5F, -12F, -0.5F);
		bodyModel[44].rotateAngleZ = -0.4712389F;

		bodyModel[45].addShapeBox(-0.5F, 0F, 0F, 1, 8, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 46
		bodyModel[45].setRotationPoint(-100.5F, -13F, -0.5F);
		bodyModel[45].rotateAngleZ = 0.4712389F;

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 17, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 47
		bodyModel[46].setRotationPoint(-101F, -24F, -0.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[47].setRotationPoint(31.5F, -17F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,-1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F); // Box 49
		bodyModel[48].setRotationPoint(33F, -84F, -1.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 7, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		bodyModel[49].setRotationPoint(31F, -28.5F, -3.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F); // Box 51
		bodyModel[50].setRotationPoint(32F, -25.7F, -2.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[51].setRotationPoint(31.5F, -32.5F, -3F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, -1.8F, -1.8F, 0F, -1.8F); // Box 53
		bodyModel[52].setRotationPoint(32.5F, -30.5F, -2F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[53].setRotationPoint(35.5F, -42F, -16F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[54].setRotationPoint(35F, -59F, -10F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F,-0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F); // Box 56
		bodyModel[55].setRotationPoint(34.5F, -70F, -6F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 57
		bodyModel[56].setRotationPoint(42.5F, -16.5F, -7.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 58
		bodyModel[57].setRotationPoint(38.5F, -16.5F, -7.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 59
		bodyModel[58].setRotationPoint(34.5F, -16.5F, -7.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 60
		bodyModel[59].setRotationPoint(22.5F, -16.5F, -7.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 61
		bodyModel[60].setRotationPoint(30.5F, -16.5F, -7.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 62
		bodyModel[61].setRotationPoint(26.5F, -16.5F, -7.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 63
		bodyModel[62].setRotationPoint(18.5F, -16.5F, -7.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 64
		bodyModel[63].setRotationPoint(17F, -16.5F, -18F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 65
		bodyModel[64].setRotationPoint(17F, -16.5F, -15F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 66
		bodyModel[65].setRotationPoint(17F, -16.5F, -12F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 67
		bodyModel[66].setRotationPoint(17F, -16.5F, -9F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 15, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 68
		bodyModel[67].setRotationPoint(9.5F, -16.5F, -7.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 69
		bodyModel[68].setRotationPoint(9.5F, -16.5F, -18F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 70
		bodyModel[69].setRotationPoint(13.5F, -16.5F, -18F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 71
		bodyModel[70].setRotationPoint(9.5F, -16.5F, -15F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 72
		bodyModel[71].setRotationPoint(9.5F, -16.5F, -12F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 73
		bodyModel[72].setRotationPoint(9.5F, -16.5F, -9F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 74
		bodyModel[73].setRotationPoint(42.5F, -16.5F, -2F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 75
		bodyModel[74].setRotationPoint(42.5F, -16.5F, -5F);

		bodyModel[75].addShapeBox(-6F, 3.5F, -2F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[75].setRotationPoint(54.5F, -11.5F, 0F);

		bodyModel[76].addShapeBox(-6F, 3.5F, -6F, 12, 1, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 78
		bodyModel[76].setRotationPoint(54.5F, -11.5F, 0F);

		bodyModel[77].addShapeBox(-6F, 3.5F, 2F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 79
		bodyModel[77].setRotationPoint(54.5F, -11.5F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 2, 3, 0F,0F, 0F, 4F, 2F, 1F, -1F, 2F, 1F, -1F, 0F, 0F, 4F, 0F, 0F, 4F, 4F, -1F, -1F, 4F, -1F, -1F, 0F, 0F, 4F); // Box 80
		bodyModel[78].setRotationPoint(93F, 7F, -1.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[79].setRotationPoint(94F, -7.7F, -0.5F);
		bodyModel[79].rotateAngleZ = 0.05235988F;

		bodyModel[80].addShapeBox(-0.5F, -0.75F, -1.5F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.2F, -0.35F, -0.35F, -0.2F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F, -0.2F, -0.35F, 0F); // Box 29
		bodyModel[80].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[80].rotateAngleX = 0.29670597F;
		bodyModel[80].rotateAngleY = -1.57079633F;

		bodyModel[81].addShapeBox(-0.5F, -0.35F, -1.6F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.25F, -0.2F, -0.2F, -0.25F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 30
		bodyModel[81].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[81].rotateAngleX = 0.29670597F;
		bodyModel[81].rotateAngleY = -1.57079633F;

		bodyModel[82].addShapeBox(-0.5F, 0.25F, -1.7F, 1, 1, 1, 0F,-0.25F, -0.2F, -0.1F, -0.25F, -0.2F, -0.1F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F); // Box 31
		bodyModel[82].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[82].rotateAngleX = 0.29670597F;
		bodyModel[82].rotateAngleY = -1.57079633F;

		bodyModel[83].addShapeBox(-0.5F, 0.35F, -1.9F, 1, 1, 1, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F); // Box 32
		bodyModel[83].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[83].rotateAngleX = 0.29670597F;
		bodyModel[83].rotateAngleY = -1.57079633F;

		bodyModel[84].addShapeBox(-0.5F, -1F, -1.3F, 1, 1, 1, 0F,-0.4F, -0.4F, -0.1F, -0.4F, -0.4F, -0.1F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F, -0.35F, -0.4F, 0F); // Box 34
		bodyModel[84].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[84].rotateAngleX = 0.29670597F;
		bodyModel[84].rotateAngleY = -1.57079633F;

		bodyModel[85].addShapeBox(-0.5F, -1.25F, -1.2F, 1, 1, 1, 0F,-0.62F, -0.35F, -0.3F, -0.22F, -0.35F, -0.3F, -0.22F, -0.35F, 0F, -0.62F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F); // Box 35
		bodyModel[85].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[85].rotateAngleX = 0.29670597F;
		bodyModel[85].rotateAngleY = -1.57079633F;

		bodyModel[86].addShapeBox(-0.8F, -1.4F, -1.1F, 1, 1, 1, 0F,-0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F); // Box 36
		bodyModel[86].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[86].rotateAngleX = 0.29670597F;
		bodyModel[86].rotateAngleY = -1.57079633F;

		bodyModel[87].addShapeBox(-0.2F, -1.4F, -1.1F, 1, 1, 1, 0F,-0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F, -0.35F, -0.42F, 0F); // Box 37
		bodyModel[87].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[87].rotateAngleX = 0.29670597F;
		bodyModel[87].rotateAngleY = -1.57079633F;

		bodyModel[88].addShapeBox(-0.5F, -1.25F, -1.2F, 1, 1, 1, 0F,-0.22F, -0.35F, -0.3F, -0.62F, -0.35F, -0.3F, -0.62F, -0.35F, 0F, -0.22F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F, -0.42F, -0.35F, 0F); // Box 38
		bodyModel[88].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[88].rotateAngleX = 0.29670597F;
		bodyModel[88].rotateAngleY = -1.57079633F;

		bodyModel[89].addShapeBox(-0.75F, -1.55F, -1F, 1, 1, 1, 0F,-0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 39
		bodyModel[89].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[89].rotateAngleX = 0.29670597F;
		bodyModel[89].rotateAngleY = -1.57079633F;

		bodyModel[90].addShapeBox(-0.25F, -1.55F, -1F, 1, 1, 1, 0F,-0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.4F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F, -0.42F, -0.42F, 0F); // Box 40
		bodyModel[90].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[90].rotateAngleX = 0.29670597F;
		bodyModel[90].rotateAngleY = -1.57079633F;

		bodyModel[91].addShapeBox(-1F, -0.449999999999999F, -1.6F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, 0F, -0.3F, -0.35F, 0F); // Box 41
		bodyModel[91].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[91].rotateAngleX = 0.29670597F;
		bodyModel[91].rotateAngleY = -1.57079633F;

		bodyModel[92].addShapeBox(0F, -0.449999999999999F, -1.6F, 1, 1, 1, 0F,-0.3F, -0.35F, -0.2F, -0.3F, -0.35F, -0.2F, -0.3F, -0.35F, 0F, -0.3F, -0.35F, 0F, -0.3F, -0.45F, -0.1F, -0.3F, -0.35F, -0.1F, -0.3F, -0.35F, 0F, -0.3F, -0.45F, 0F); // Box 42
		bodyModel[92].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[92].rotateAngleX = 0.29670597F;
		bodyModel[92].rotateAngleY = -1.57079633F;

		bodyModel[93].addShapeBox(-1.5F, -0.449999999999999F, -1.7F, 1, 1, 1, 0F,-0.1F, -0.35F, -0.3F, -0.05F, -0.35F, -0.3F, -0.05F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.18F, -0.3F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.18F, -0.3F, 0F); // Box 43
		bodyModel[93].setRotationPoint(101.5F, -5.5F, 0F);
		bodyModel[93].rotateAngleX = 0.29670597F;
		bodyModel[93].rotateAngleY = -1.57079633F;

		bodyModel[94].addShapeBox(-1.5F, -0.75F, -1.45F, 1, 1, 1, 0F,-0.3F, 0.25F, -0.5F, 0F, -0.4F, -0.3F, 0F, -0.4F, 0F, -0.3F, 0.25F, 0F, -0.1F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.25F, -0.35F, 0F, -0.1F, -0.35F, 0F); // Box 44
		bodyModel[94].setRotationPoint(101.5F, -5.5F, 0F);
		bodyModel[94].rotateAngleX = 0.29670597F;
		bodyModel[94].rotateAngleY = -1.57079633F;

		bodyModel[95].addShapeBox(-0.5F, -1.8F, -0.9F, 1, 1, 1, 0F,-0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.35F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F, -0.39F, -0.38F, 0F); // Box 45
		bodyModel[95].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[95].rotateAngleX = 0.29670597F;
		bodyModel[95].rotateAngleY = -1.57079633F;

		bodyModel[96].addShapeBox(0.5F, -0.449999999999999F, -1.7F, 1, 1, 1, 0F,-0.05F, -0.35F, -0.3F, -0.1F, -0.35F, -0.3F, -0.1F, -0.35F, 0F, -0.05F, -0.35F, 0F, -0.3F, -0.1F, 0F, -0.18F, -0.3F, 0F, -0.18F, -0.3F, 0F, -0.3F, -0.1F, 0F); // Box 46
		bodyModel[96].setRotationPoint(101.5F, -5.5F, 0F);
		bodyModel[96].rotateAngleX = 0.29670597F;
		bodyModel[96].rotateAngleY = -1.57079633F;

		bodyModel[97].addShapeBox(0.5F, -0.75F, -1.45F, 1, 1, 1, 0F,0F, -0.4F, -0.3F, -0.3F, 0.25F, -0.5F, -0.3F, 0.25F, 0F, 0F, -0.4F, 0F, -0.25F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.1F, -0.35F, 0F, -0.25F, -0.35F, 0F); // Box 47
		bodyModel[97].setRotationPoint(101.5F, -5.5F, 0F);
		bodyModel[97].rotateAngleX = 0.29670597F;
		bodyModel[97].rotateAngleY = -1.57079633F;

		bodyModel[98].addShapeBox(-0.5F, 0.25F, -1.75F, 1, 1, 1, 0F,0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0.2F, -0.55F, 0F, -0.9F, -0.55F, 0F, -0.9F, -0.55F, 0F, 0.2F, -0.55F, 0F); // Box 48
		bodyModel[98].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[98].rotateAngleX = 0.29670597F;
		bodyModel[98].rotateAngleY = -1.57079633F;

		bodyModel[99].addShapeBox(-0.5F, 0.25F, -1.75F, 1, 1, 1, 0F,-0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.5F, -0.2F, 0F, -0.9F, -0.55F, 0F, 0.2F, -0.55F, 0F, 0.2F, -0.55F, 0F, -0.9F, -0.55F, 0F); // Box 49
		bodyModel[99].setRotationPoint(101.7F, -5.5F, 0F);
		bodyModel[99].rotateAngleX = 0.29670597F;
		bodyModel[99].rotateAngleY = -1.57079633F;

		bodyModel[100].addShapeBox(-0.5F, 0.25F, -1.8F, 1, 1, 1, 0F,0.4F, -0.65F, 0F, -1F, -0.4F, 0F, -1F, -0.4F, 0F, 0.4F, -0.65F, 0F, 0.4F, -0.2F, 0F, -1F, -0.45F, 0F, -1F, -0.45F, 0F, 0.4F, -0.2F, 0F); // Box 50
		bodyModel[100].setRotationPoint(101.5F, -5.5F, 0F);
		bodyModel[100].rotateAngleX = 0.29670597F;
		bodyModel[100].rotateAngleY = -1.57079633F;

		bodyModel[101].addShapeBox(-0.5F, 0.25F, -1.8F, 1, 1, 1, 0F,-1F, -0.4F, 0F, 0.4F, -0.65F, 0F, 0.4F, -0.65F, 0F, -1F, -0.4F, 0F, -1F, -0.45F, 0F, 0.4F, -0.2F, 0F, 0.4F, -0.2F, 0F, -1F, -0.45F, 0F); // Box 51
		bodyModel[101].setRotationPoint(101.5F, -5.5F, 0F);
		bodyModel[101].rotateAngleX = 0.29670597F;
		bodyModel[101].rotateAngleY = -1.57079633F;

		bodyModel[102].addShapeBox(0.45F, 0.3F, -1.7F, 1, 1, 1, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 52
		bodyModel[102].setRotationPoint(101.5F, -5.5F, 0F);
		bodyModel[102].rotateAngleX = 0.29670597F;
		bodyModel[102].rotateAngleY = -1.57079633F;

		bodyModel[103].addShapeBox(-2.2F, 0.0999999999999996F, -1.7F, 1, 1, 1, 0F,-1F, -0.4F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, -1F, -0.4F, 0F, -1F, -0.45F, 0F, 0.4F, 0.2F, 0F, 0.4F, 0.2F, 0F, -1F, -0.45F, 0F); // Box 53
		bodyModel[103].setRotationPoint(101.5F, -5.5F, 0F);
		bodyModel[103].rotateAngleX = 0.29670597F;
		bodyModel[103].rotateAngleY = -1.57079633F;

		bodyModel[104].addShapeBox(-6F, 3.5F, -6F, 12, 1, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[104].setRotationPoint(-53F, -11.5F, 0F);

		bodyModel[105].addShapeBox(-6F, 3.5F, -2F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[105].setRotationPoint(-53F, -11.5F, 0F);

		bodyModel[106].addShapeBox(-6F, 3.5F, 2F, 12, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 108
		bodyModel[106].setRotationPoint(-53F, -11.5F, 0F);

		bodyModel[107].addShapeBox(-1.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[107].setRotationPoint(-22.5F, -11F, -13.5F);

		bodyModel[108].addShapeBox(-4.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 110
		bodyModel[108].setRotationPoint(-22.5F, -11F, -13.5F);

		bodyModel[109].addShapeBox(1.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 111
		bodyModel[109].setRotationPoint(-22.5F, -11F, -13.5F);

		bodyModel[110].addShapeBox(1.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 112
		bodyModel[110].setRotationPoint(-22.5F, -11F, 12F);

		bodyModel[111].addShapeBox(-1.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[111].setRotationPoint(-22.5F, -11F, 12F);

		bodyModel[112].addShapeBox(-4.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 114
		bodyModel[112].setRotationPoint(-22.5F, -11F, 12F);

		bodyModel[113].addShapeBox(-4.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 128
		bodyModel[113].setRotationPoint(26F, -11F, -13.5F);

		bodyModel[114].addShapeBox(1.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 129
		bodyModel[114].setRotationPoint(26F, -11F, -13.5F);

		bodyModel[115].addShapeBox(-1.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[115].setRotationPoint(26F, -11F, -13.5F);

		bodyModel[116].addShapeBox(1.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 131
		bodyModel[116].setRotationPoint(26F, -11F, 12F);

		bodyModel[117].addShapeBox(-1.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[117].setRotationPoint(26F, -11F, 12F);

		bodyModel[118].addShapeBox(-4.5F, 3F, -3.5F, 3, 2, 9, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 133
		bodyModel[118].setRotationPoint(26F, -11F, 12F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		bodyModel[119].setRotationPoint(1F, -32F, -3F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 137
		bodyModel[120].setRotationPoint(1F, -32F, 1F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 138
		bodyModel[121].setRotationPoint(1F, -32F, -1F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[122].setRotationPoint(19F, -32F, -1F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 140
		bodyModel[123].setRotationPoint(19F, -32F, 1F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 6, 19, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[124].setRotationPoint(19F, -32F, -3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		bodyModel[125].setRotationPoint(6F, -20F, -5F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[126].setRotationPoint(6F, -23F, -5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 144
		bodyModel[127].setRotationPoint(8F, -23F, -5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 145
		bodyModel[128].setRotationPoint(0.5F, -23F, -5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[129].setRotationPoint(-1.5F, -23F, -5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[130].setRotationPoint(-1.5F, -20F, -5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 148
		bodyModel[131].setRotationPoint(18F, -23F, -5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[132].setRotationPoint(16F, -23F, -5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[133].setRotationPoint(16F, -20F, -5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 151
		bodyModel[134].setRotationPoint(25.5F, -23F, -5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[135].setRotationPoint(23.5F, -23F, -5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 153
		bodyModel[136].setRotationPoint(23.5F, -20F, -5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -1F); // Box 154
		bodyModel[137].setRotationPoint(-13.5F, -15.8F, -17F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -1.5F, -2F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 155
		bodyModel[138].setRotationPoint(-7.5F, -15.8F, -17F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -1.5F, -2F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 156
		bodyModel[139].setRotationPoint(-7.8F, -16.5F, -12.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -1F); // Box 157
		bodyModel[140].setRotationPoint(-13.8F, -16.5F, -12.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 3, 4, 3, 0F,-1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, -1.2F, 0F, -1.2F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F, 0F, 70F, 0F); // Box 158
		bodyModel[141].setRotationPoint(-26.5F, -80F, -1.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[142].setRotationPoint(-24F, -38F, -16F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 8, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 160
		bodyModel[143].setRotationPoint(-34F, -16F, -4.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -1.5F, -2F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 161
		bodyModel[144].setRotationPoint(-14.8F, -16.5F, -3F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -1F); // Box 162
		bodyModel[145].setRotationPoint(-20.8F, -16.5F, -3F);

		bodyModel[146].addShapeBox(-3F, 0F, 0F, 14, 10, 1, 0F,-3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F); // Box 163
		bodyModel[146].setRotationPoint(92.3F, -19.6F, -0.5F);
		bodyModel[146].rotateAngleZ = 0.08726646F;

		bodyModel[147].addShapeBox(-3F, 0F, 0F, 21, 14, 1, 0F,-3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F, -4.2F, -2.5F, -0.35F, -4.2F, -2.5F, -0.35F, -3.2F, -2.5F, -0.35F); // Box 164
		bodyModel[147].setRotationPoint(-115.4F, -24.6F, -0.5F);
		bodyModel[147].rotateAngleZ = 0.08726646F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -1F); // Box 165
		bodyModel[148].setRotationPoint(-13.5F, -15.8F, 13F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 8, 3, 4, 0F,0F, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -1.5F, -2F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 166
		bodyModel[149].setRotationPoint(-7.5F, -15.8F, 13F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 10, 4, 6, 0F,0F, 0F, 0F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -0.5F, -1.5F, -2F, -0.5F, -1.5F, 0F, 0F, 0F); // Box 167
		bodyModel[150].setRotationPoint(-7.8F, -16.5F, 6.5F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -1F); // Box 168
		bodyModel[151].setRotationPoint(-13.8F, -16.5F, 6.5F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 169
		bodyModel[152].setRotationPoint(42.5F, -16.5F, 6.5F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 170
		bodyModel[153].setRotationPoint(38.5F, -16.5F, 6.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 171
		bodyModel[154].setRotationPoint(34.5F, -16.5F, 6.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 172
		bodyModel[155].setRotationPoint(22.5F, -16.5F, 6.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 173
		bodyModel[156].setRotationPoint(30.5F, -16.5F, 6.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 174
		bodyModel[157].setRotationPoint(26.5F, -16.5F, 6.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 175
		bodyModel[158].setRotationPoint(18.5F, -16.5F, 6.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 176
		bodyModel[159].setRotationPoint(17F, -16.5F, 17F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 177
		bodyModel[160].setRotationPoint(17F, -16.5F, 14F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 178
		bodyModel[161].setRotationPoint(17F, -16.5F, 11F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 179
		bodyModel[162].setRotationPoint(17F, -16.5F, 8F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 180
		bodyModel[163].setRotationPoint(9.5F, -16.5F, 17F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 181
		bodyModel[164].setRotationPoint(13.5F, -16.5F, 17F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 182
		bodyModel[165].setRotationPoint(9.5F, -16.5F, 14F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 183
		bodyModel[166].setRotationPoint(9.5F, -16.5F, 11F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 184
		bodyModel[167].setRotationPoint(9.5F, -16.5F, 8F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 185
		bodyModel[168].setRotationPoint(42.5F, -16.5F, 1F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F, -0.1F, 0.2F, -0.1F); // Box 186
		bodyModel[169].setRotationPoint(42.5F, -16.5F, 4F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[170].setRotationPoint(6F, -20F, 3F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[171].setRotationPoint(6F, -23F, 3F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 189
		bodyModel[172].setRotationPoint(8F, -23F, 3F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 190
		bodyModel[173].setRotationPoint(0.5F, -23F, 3F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 191
		bodyModel[174].setRotationPoint(-1.5F, -23F, 3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 192
		bodyModel[175].setRotationPoint(-1.5F, -20F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 193
		bodyModel[176].setRotationPoint(18F, -23F, 3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 194
		bodyModel[177].setRotationPoint(16F, -23F, 3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 195
		bodyModel[178].setRotationPoint(16F, -20F, 3F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0F, 0F); // Box 196
		bodyModel[179].setRotationPoint(25.5F, -23F, 3F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[180].setRotationPoint(23.5F, -23F, 3F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[181].setRotationPoint(23.5F, -20F, 3F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[6];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 120
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 121
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 122
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 125
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 126
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 127

		gun_2_Model[0][0].addShapeBox(-9F, -1.5F, -2F, 15, 5, 4, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 120

		gun_2_Model[0][1].addShapeBox(-9.5F, -1.5F, -6F, 16, 5, 4, 0F,-4F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121

		gun_2_Model[0][2].addShapeBox(-9.5F, -1.5F, 2F, 16, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0.5F); // Box 122

		gun_2_Model[0][3].addShapeBox(-5.5F, -2.5F, -6.5F, 8, 1, 13, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125

		gun_2_Model[0][4].addShapeBox(2.5F, -2.5F, -6.5F, 4, 1, 13, 0F,0F, 0F, -1F, 0F, -0.9F, -4.5F, 0F, -0.9F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 126

		gun_2_Model[0][5].addShapeBox(-9.5F, -2.5F, -6.5F, 4, 1, 13, 0F,0F, -0.9F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.9F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F); // Box 127

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(54.5F, -11.5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 134
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 135

		gun_2_Model[1][0].addShapeBox(-0.5F, -0.8F, -2.2F, 20, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.2F, 0.2F); // Box 134

		gun_2_Model[1][1].addShapeBox(-0.5F, -0.8F, 1.2F, 20, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.2F, 0.2F); // Box 135

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(54.5F, -11.5F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[6];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 120
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 113, 129, textureX, textureY); // Box 121
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 122
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 145, 129, textureX, textureY); // Box 125
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 126
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 127

		gun_3_Model[0][0].addShapeBox(-9F, -1.5F, -2F, 15, 5, 4, 0F,0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 120

		gun_3_Model[0][1].addShapeBox(-9.5F, -1.5F, -6F, 16, 5, 4, 0F,-4F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121

		gun_3_Model[0][2].addShapeBox(-9.5F, -1.5F, 2F, 16, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0.5F, -4F, 0F, 0.5F); // Box 122

		gun_3_Model[0][3].addShapeBox(-5.5F, -2.5F, -6.5F, 8, 1, 13, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125

		gun_3_Model[0][4].addShapeBox(2.5F, -2.5F, -6.5F, 4, 1, 13, 0F,0F, 0F, -1F, 0F, -0.9F, -4.5F, 0F, -0.9F, -4.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F); // Box 126

		gun_3_Model[0][5].addShapeBox(-9.5F, -2.5F, -6.5F, 4, 1, 13, 0F,0F, -0.9F, -4.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.9F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F); // Box 127

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-53F, -11.5F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 134
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 135

		gun_3_Model[1][0].addShapeBox(-0.5F, -0.8F, -2.2F, 20, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.2F, 0.2F); // Box 134

		gun_3_Model[1][1].addShapeBox(-0.5F, -0.8F, 1.2F, 20, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, 0.2F, 0.2F); // Box 135

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-53F, -11.5F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[3];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 115
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 116
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 117

		gun_4_Model[0][0].addShapeBox(1.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0F, 0F, 0.2F, 0.2F, 0F, -3F, 0.2F, 0F, -3F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, -0.5F, -3F, 0.2F, -0.5F, -3F, 0F, -0.5F, 0.2F); // Box 115

		gun_4_Model[0][1].addShapeBox(-1.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 116

		gun_4_Model[0][2].addShapeBox(-4.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0.2F, 0F, -3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, -3F, 0.2F, -0.5F, -3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, -0.5F, -3F); // Box 117

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(26F, -11F, -12.5F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[2];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 118
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 119

		gun_4_Model[1][0].addShapeBox(0F, -0.5F, -2F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 118

		gun_4_Model[1][1].addShapeBox(0F, -0.5F, 1F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 119

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(26F, -11F, -12.5F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun4", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[3];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 115
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 116
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 117

		gun_5_Model[0][0].addShapeBox(1.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0F, 0F, 0.2F, 0.2F, 0F, -3F, 0.2F, 0F, -3F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, -0.5F, -3F, 0.2F, -0.5F, -3F, 0F, -0.5F, 0.2F); // Box 115

		gun_5_Model[0][1].addShapeBox(-1.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 116

		gun_5_Model[0][2].addShapeBox(-4.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0.2F, 0F, -3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, -3F, 0.2F, -0.5F, -3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, -0.5F, -3F); // Box 117

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(26F, -11F, 13F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[2];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 118
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 119

		gun_5_Model[1][0].addShapeBox(0F, -0.5F, -2F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 118

		gun_5_Model[1][1].addShapeBox(0F, -0.5F, 1F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 119

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(26F, -11F, 13F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun5", gun_5_Model);

		// Passenger 7
		ModelRendererTurbo[][] gun_6_Model = new ModelRendererTurbo[3][];

		gun_6_Model[0] = new ModelRendererTurbo[3];
		gun_6_Model[0][0] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 115
		gun_6_Model[0][1] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 116
		gun_6_Model[0][2] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 117

		gun_6_Model[0][0].addShapeBox(1.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0F, 0F, 0.2F, 0.2F, 0F, -3F, 0.2F, 0F, -3F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, -0.5F, -3F, 0.2F, -0.5F, -3F, 0F, -0.5F, 0.2F); // Box 115

		gun_6_Model[0][1].addShapeBox(-1.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 116

		gun_6_Model[0][2].addShapeBox(-4.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0.2F, 0F, -3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, -3F, 0.2F, -0.5F, -3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, -0.5F, -3F); // Box 117

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[0])
		{
			gunPart.setRotationPoint(-22.5F, -11F, -12.5F);
		}


		gun_6_Model[1] = new ModelRendererTurbo[2];
		gun_6_Model[1][0] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 118
		gun_6_Model[1][1] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 119

		gun_6_Model[1][0].addShapeBox(0F, -0.5F, -2F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 118

		gun_6_Model[1][1].addShapeBox(0F, -0.5F, 1F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 119

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_6_Model[1])
		{
			gunPart.setRotationPoint(-22.5F, -11F, -12.5F);
		}


		gun_6_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun6", gun_6_Model);

		// Passenger 8
		ModelRendererTurbo[][] gun_7_Model = new ModelRendererTurbo[3][];

		gun_7_Model[0] = new ModelRendererTurbo[3];
		gun_7_Model[0][0] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 115
		gun_7_Model[0][1] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 116
		gun_7_Model[0][2] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 117

		gun_7_Model[0][0].addShapeBox(1.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0F, 0F, 0.2F, 0.2F, 0F, -3F, 0.2F, 0F, -3F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, -0.5F, -3F, 0.2F, -0.5F, -3F, 0F, -0.5F, 0.2F); // Box 115

		gun_7_Model[0][1].addShapeBox(-1.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F); // Box 116

		gun_7_Model[0][2].addShapeBox(-4.5F, -1.5F, -4.5F, 3, 5, 9, 0F,0.2F, 0F, -3F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, -3F, 0.2F, -0.5F, -3F, 0F, -0.5F, 0.2F, 0F, -0.5F, 0.2F, 0.2F, -0.5F, -3F); // Box 117

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[0])
		{
			gunPart.setRotationPoint(-22.5F, -11F, 13F);
		}


		gun_7_Model[1] = new ModelRendererTurbo[2];
		gun_7_Model[1][0] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 118
		gun_7_Model[1][1] = new ModelRendererTurbo(this, 153, 65, textureX, textureY); // Box 119

		gun_7_Model[1][0].addShapeBox(0F, -0.5F, -2F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 118

		gun_7_Model[1][1].addShapeBox(0F, -0.5F, 1F, 13, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 119

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_7_Model[1])
		{
			gunPart.setRotationPoint(-22.5F, -11F, 13F);
		}


		gun_7_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("PassengerGun7", gun_7_Model);
	}
}