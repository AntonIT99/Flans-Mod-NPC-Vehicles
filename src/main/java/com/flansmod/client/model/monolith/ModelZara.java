//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Zara
// Model Creator: 
// Created on: 25.04.2020 - 12:08:47
// Last changed on: 25.04.2020 - 12:08:47

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelZara extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelZara() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[205];
		leftFrontWheelModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftFrontWheelModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 117
		bodyModel[1] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 329, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 153, 97, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 241, 49, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 425, 49, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 425, 57, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 30
		bodyModel[24] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 33
		bodyModel[27] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 34
		bodyModel[28] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 35
		bodyModel[29] = new ModelRendererTurbo(this, 169, 97, textureX, textureY); // Box 36
		bodyModel[30] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 37
		bodyModel[31] = new ModelRendererTurbo(this, 273, 97, textureX, textureY); // Box 38
		bodyModel[32] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 39
		bodyModel[33] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 40
		bodyModel[34] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 41
		bodyModel[35] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 42
		bodyModel[36] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 43
		bodyModel[37] = new ModelRendererTurbo(this, 345, 1, textureX, textureY); // Box 44
		bodyModel[38] = new ModelRendererTurbo(this, 113, 9, textureX, textureY); // Box 45
		bodyModel[39] = new ModelRendererTurbo(this, 345, 9, textureX, textureY); // Box 46
		bodyModel[40] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 47
		bodyModel[41] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 48
		bodyModel[42] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 49
		bodyModel[43] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 50
		bodyModel[44] = new ModelRendererTurbo(this, 281, 49, textureX, textureY); // Box 51
		bodyModel[45] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 53
		bodyModel[46] = new ModelRendererTurbo(this, 305, 25, textureX, textureY); // Box 54
		bodyModel[47] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 55
		bodyModel[48] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 56
		bodyModel[49] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 57
		bodyModel[50] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 58
		bodyModel[51] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 59
		bodyModel[52] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 60
		bodyModel[53] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 61
		bodyModel[54] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 62
		bodyModel[55] = new ModelRendererTurbo(this, 401, 121, textureX, textureY); // Box 63
		bodyModel[56] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 65
		bodyModel[57] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 67
		bodyModel[58] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 68
		bodyModel[59] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 69
		bodyModel[60] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 70
		bodyModel[61] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 71
		bodyModel[62] = new ModelRendererTurbo(this, 41, 137, textureX, textureY); // Box 72
		bodyModel[63] = new ModelRendererTurbo(this, 481, 113, textureX, textureY); // Box 73
		bodyModel[64] = new ModelRendererTurbo(this, 473, 89, textureX, textureY); // Box 74
		bodyModel[65] = new ModelRendererTurbo(this, 17, 97, textureX, textureY); // Box 75
		bodyModel[66] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 76
		bodyModel[67] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 77
		bodyModel[68] = new ModelRendererTurbo(this, 209, 57, textureX, textureY); // Box 78
		bodyModel[69] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 79
		bodyModel[70] = new ModelRendererTurbo(this, 121, 145, textureX, textureY); // Box 80
		bodyModel[71] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 81
		bodyModel[72] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 82
		bodyModel[73] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 87
		bodyModel[74] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 88
		bodyModel[75] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 89
		bodyModel[76] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 90
		bodyModel[77] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 91
		bodyModel[78] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 92
		bodyModel[79] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 93
		bodyModel[80] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 94
		bodyModel[81] = new ModelRendererTurbo(this, 113, 1, textureX, textureY); // Box 95
		bodyModel[82] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 96
		bodyModel[83] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Box 97
		bodyModel[84] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 98
		bodyModel[85] = new ModelRendererTurbo(this, 457, 105, textureX, textureY); // Box 99
		bodyModel[86] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 100
		bodyModel[87] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 101
		bodyModel[88] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 102
		bodyModel[89] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 103
		bodyModel[90] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 104
		bodyModel[91] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 105
		bodyModel[92] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 106
		bodyModel[93] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 107
		bodyModel[94] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 108
		bodyModel[95] = new ModelRendererTurbo(this, 273, 121, textureX, textureY); // Box 109
		bodyModel[96] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 110
		bodyModel[97] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 111
		bodyModel[98] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 112
		bodyModel[99] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 113
		bodyModel[100] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 114
		bodyModel[101] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 115
		bodyModel[102] = new ModelRendererTurbo(this, 361, 17, textureX, textureY); // Box 116
		bodyModel[103] = new ModelRendererTurbo(this, 281, 65, textureX, textureY); // Box 117
		bodyModel[104] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 118
		bodyModel[105] = new ModelRendererTurbo(this, 281, 73, textureX, textureY); // Box 121
		bodyModel[106] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 122
		bodyModel[107] = new ModelRendererTurbo(this, 481, 105, textureX, textureY); // Box 123
		bodyModel[108] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 124
		bodyModel[109] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 125
		bodyModel[110] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 126
		bodyModel[111] = new ModelRendererTurbo(this, 409, 137, textureX, textureY); // Box 127
		bodyModel[112] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 128
		bodyModel[113] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 129
		bodyModel[114] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 130
		bodyModel[115] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 131
		bodyModel[116] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 132
		bodyModel[117] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 133
		bodyModel[118] = new ModelRendererTurbo(this, 281, 121, textureX, textureY); // Box 134
		bodyModel[119] = new ModelRendererTurbo(this, 121, 137, textureX, textureY); // Box 135
		bodyModel[120] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 137
		bodyModel[121] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 138
		bodyModel[122] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 139
		bodyModel[123] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 140
		bodyModel[124] = new ModelRendererTurbo(this, 33, 49, textureX, textureY); // Box 141
		bodyModel[125] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 142
		bodyModel[126] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 143
		bodyModel[127] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 144
		bodyModel[128] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 145
		bodyModel[129] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 146
		bodyModel[130] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 147
		bodyModel[131] = new ModelRendererTurbo(this, 217, 161, textureX, textureY); // Box 148
		bodyModel[132] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 149
		bodyModel[133] = new ModelRendererTurbo(this, 233, 169, textureX, textureY); // Box 150
		bodyModel[134] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 151
		bodyModel[135] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 152
		bodyModel[136] = new ModelRendererTurbo(this, 153, 161, textureX, textureY); // Box 153
		bodyModel[137] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 154
		bodyModel[138] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 155
		bodyModel[139] = new ModelRendererTurbo(this, 289, 121, textureX, textureY); // Box 156
		bodyModel[140] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 157
		bodyModel[141] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 159
		bodyModel[142] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 160
		bodyModel[143] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 161
		bodyModel[144] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 162
		bodyModel[145] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 163
		bodyModel[146] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 164
		bodyModel[147] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 165
		bodyModel[148] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 169
		bodyModel[149] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 170
		bodyModel[150] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 171
		bodyModel[151] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 172
		bodyModel[152] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 173
		bodyModel[153] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 174
		bodyModel[154] = new ModelRendererTurbo(this, 377, 169, textureX, textureY); // Box 175
		bodyModel[155] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 176
		bodyModel[156] = new ModelRendererTurbo(this, 409, 169, textureX, textureY); // Box 177
		bodyModel[157] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 178
		bodyModel[158] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 179
		bodyModel[159] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 180
		bodyModel[160] = new ModelRendererTurbo(this, 249, 177, textureX, textureY); // Box 181
		bodyModel[161] = new ModelRendererTurbo(this, 265, 177, textureX, textureY); // Box 182
		bodyModel[162] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 183
		bodyModel[163] = new ModelRendererTurbo(this, 377, 177, textureX, textureY); // Box 184
		bodyModel[164] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 185
		bodyModel[165] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 186
		bodyModel[166] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 187
		bodyModel[167] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 188
		bodyModel[168] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 189
		bodyModel[169] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 190
		bodyModel[170] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 191
		bodyModel[171] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 192
		bodyModel[172] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 193
		bodyModel[173] = new ModelRendererTurbo(this, 225, 193, textureX, textureY); // Box 194
		bodyModel[174] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 195
		bodyModel[175] = new ModelRendererTurbo(this, 209, 249, textureX, textureY); // Box 196
		bodyModel[176] = new ModelRendererTurbo(this, 393, 249, textureX, textureY); // Box 197
		bodyModel[177] = new ModelRendererTurbo(this, 1, 265, textureX, textureY); // Box 198
		bodyModel[178] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 199
		bodyModel[179] = new ModelRendererTurbo(this, 361, 297, textureX, textureY); // Box 200
		bodyModel[180] = new ModelRendererTurbo(this, 449, 193, textureX, textureY); // Box 202
		bodyModel[181] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 203
		bodyModel[182] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 204
		bodyModel[183] = new ModelRendererTurbo(this, 41, 185, textureX, textureY); // Box 205
		bodyModel[184] = new ModelRendererTurbo(this, 441, 225, textureX, textureY); // Box 206
		bodyModel[185] = new ModelRendererTurbo(this, 33, 65, textureX, textureY); // Box 207
		bodyModel[186] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 208
		bodyModel[187] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 209
		bodyModel[188] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 210
		bodyModel[189] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 211
		bodyModel[190] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 212
		bodyModel[191] = new ModelRendererTurbo(this, 441, 177, textureX, textureY); // Box 213
		bodyModel[192] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 214
		bodyModel[193] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 215
		bodyModel[194] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 216
		bodyModel[195] = new ModelRendererTurbo(this, 89, 185, textureX, textureY); // Box 217
		bodyModel[196] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 218
		bodyModel[197] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 219
		bodyModel[198] = new ModelRendererTurbo(this, 449, 81, textureX, textureY); // Box 220
		bodyModel[199] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 221
		bodyModel[200] = new ModelRendererTurbo(this, 481, 129, textureX, textureY); // Box 222
		bodyModel[201] = new ModelRendererTurbo(this, 137, 137, textureX, textureY); // Box 223
		bodyModel[202] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 224
		bodyModel[203] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 225
		bodyModel[204] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 226

		bodyModel[0].addShapeBox(0F, 0F, 0F, 36, 13, 32, 0F,0F, 0F, 0F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 117
		bodyModel[0].setRotationPoint(40F, -3F, -16F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 59, 13, 31, 0F,0F, 0.5F, 0F, 0F, 1.5F, -7F, 0F, 1.5F, -7F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(100F, -3F, -15.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 10, 17, 0F,0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F); // Box 2
		bodyModel[2].setRotationPoint(159F, 0F, -8.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 5, 17, 0F,0F, -0.5F, 0F, 3.5F, 0F, -6.5F, 3.5F, 0F, -6.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, -4F, 0.5F, 0F, -4F, 0F, 0F, 0F); // Box 3
		bodyModel[3].setRotationPoint(159F, -5F, -8.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 4
		bodyModel[4].setRotationPoint(173.5F, -17F, -0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 83, 9, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(-53F, 1F, -19F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 50, 9, 38, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(30F, 1F, -19F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 68, 9, 38, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 7
		bodyModel[7].setRotationPoint(-121F, 1F, -19F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 45, 9, 28, 0F,0F, 0.5F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 8
		bodyModel[8].setRotationPoint(-166F, 1F, -14F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 7, 9, 16, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0.5F, 0F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, -5F); // Box 9
		bodyModel[9].setRotationPoint(-173F, 0.5F, -8F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 24, 13, 32, 0F,0F, 0.3F, -0.3F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F); // Box 10
		bodyModel[10].setRotationPoint(76F, -3F, -16F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 12, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[11].setRotationPoint(-76F, -6.5F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 12, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(-76F, -6.5F, 2F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 12, 8, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[13].setRotationPoint(-76F, -6.5F, -6F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[14].setRotationPoint(-93.5F, -1F, -6F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-93.5F, -1F, -2F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-93.5F, -1F, 2F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[17].setRotationPoint(70.5F, -6F, -6F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[18].setRotationPoint(70.5F, -6F, -2F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 19
		bodyModel[19].setRotationPoint(70.5F, -6F, 2F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(53.5F, -11.5F, -6F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(53.5F, -11.5F, -2F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 12, 9, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(53.5F, -11.5F, 2F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 18, 4, 32, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 30
		bodyModel[23].setRotationPoint(22F, -3F, -16F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 66, 4, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[24].setRotationPoint(-44F, -3F, -11F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 25, 4, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[25].setRotationPoint(-69F, -3F, -8.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 4, 17, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 33
		bodyModel[26].setRotationPoint(-72F, -3F, -8.5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 6, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[27].setRotationPoint(-41.5F, -20F, -2.5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 17, 5, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 35
		bodyModel[28].setRotationPoint(-43.5F, -20F, -2.5F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 2, 17, 5, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 36
		bodyModel[29].setRotationPoint(-35.5F, -20F, -2.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 6, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[30].setRotationPoint(9F, -20F, -3F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 3, 17, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 38
		bodyModel[31].setRotationPoint(6F, -20F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 3, 17, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 39
		bodyModel[32].setRotationPoint(15F, -20F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 6, 2, 5, 0F,0F, 0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 40
		bodyModel[33].setRotationPoint(9F, -22F, -2.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0.5F, -1.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F); // Box 41
		bodyModel[34].setRotationPoint(7F, -22F, -2.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,0F, 0F, 0F, -0.5F, 0.5F, -2F, -0.5F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0F, 0F, 0F); // Box 42
		bodyModel[35].setRotationPoint(15F, -25F, -2.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[36].setRotationPoint(-56.5F, -16F, -3.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[37].setRotationPoint(-58F, -17F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[38].setRotationPoint(-58F, -17F, -2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 46
		bodyModel[39].setRotationPoint(-58F, -17F, 1F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 47
		bodyModel[40].setRotationPoint(-58F, -10F, -2F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.6F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 48
		bodyModel[41].setRotationPoint(-54.8F, -13F, -2.2F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, -0.6F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 49
		bodyModel[42].setRotationPoint(-58.2F, -13F, 1.2F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 50
		bodyModel[43].setRotationPoint(-54.8F, -13F, 1.2F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 51
		bodyModel[44].setRotationPoint(-58.2F, -13F, -2.2F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 53
		bodyModel[45].setRotationPoint(-58F, -10F, 1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 54
		bodyModel[46].setRotationPoint(-58F, -10F, -2F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 55
		bodyModel[47].setRotationPoint(-55F, -10F, -2F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 56
		bodyModel[48].setRotationPoint(-55F, -7F, -2F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 57
		bodyModel[49].setRotationPoint(-58F, -7F, -2F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 58
		bodyModel[50].setRotationPoint(-58F, -7F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 59
		bodyModel[51].setRotationPoint(-58F, -7F, 1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 10, 1, 21, 0F,0F, 0F, 5.3F, 0F, 0F, 5.1F, 20F, 0.3F, 4F, -20F, 0.1F, 5F, 0F, 0F, 4F, 0F, 0F, 4F, 20F, 0F, 3.5F, -20F, 0F, 4F); // Box 60
		bodyModel[52].setRotationPoint(79F, -3.5F, -10.5F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 10, 1, 18, 0F,0F, -0.49F, 6F, 0F, -0.3F, 4.8F, 20F, 0.1F, 3.4F, -20F, 0F, 4.7F, 0F, 0F, 4F, 0F, 0F, 4F, 20F, 0F, 2.5F, -20F, 0F, 4F); // Box 61
		bodyModel[53].setRotationPoint(100F, -4F, -9.5F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 10, 1, 13, 0F,0F, -0.1F, 6.1F, 0F, 0.1F, 4.8F, 20F, 0.4F, 3.5F, -20F, 0.2F, 4.7F, 0F, 0F, 4F, 0F, 0F, 4F, 20F, 0F, 2.5F, -20F, 0F, 4F); // Box 62
		bodyModel[54].setRotationPoint(120F, -4F, -7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 10, 1, 8, 0F,0F, -0.8F, 5.7F, 0F, -0.5F, 4.6F, 18F, -0.1F, 1.8F, -20F, -0.4F, 5F, 0F, 1F, 4F, 0F, 1F, 4F, 17F, 0F, 1F, -20F, 0F, 4F); // Box 63
		bodyModel[55].setRotationPoint(140F, -5F, -5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 65
		bodyModel[56].setRotationPoint(42F, -16F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[57].setRotationPoint(42F, -16F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 6, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 68
		bodyModel[58].setRotationPoint(42F, -16F, 1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[59].setRotationPoint(40.5F, -17F, -1.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[60].setRotationPoint(40.5F, -17F, -4.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 71
		bodyModel[61].setRotationPoint(40.5F, -17F, 1.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 33, 5, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[62].setRotationPoint(23.5F, -8F, -4.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[63].setRotationPoint(43.5F, -23F, -2.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 74
		bodyModel[64].setRotationPoint(46.5F, -23F, -2.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -0.5F, 0F, 0F, -1.8F, -0.5F, 0F, -1.8F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 75
		bodyModel[65].setRotationPoint(47.5F, -23F, -2F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Box 76
		bodyModel[66].setRotationPoint(41F, -23F, -2.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[67].setRotationPoint(41.5F, -21F, -5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 78
		bodyModel[68].setRotationPoint(42.5F, -18F, -2.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 18, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyModel[69].setRotationPoint(23.5F, -12.5F, -5.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 18, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[70].setRotationPoint(23.5F, -19F, -4.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 16, 2, 10, 0F,0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[71].setRotationPoint(23.5F, -24.5F, -5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 13, 15, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[72].setRotationPoint(25.5F, -22.5F, -3F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[73].setRotationPoint(23.5F, -32F, -7.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 11, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 88
		bodyModel[74].setRotationPoint(28.5F, -28.5F, -5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89
		bodyModel[75].setRotationPoint(37.5F, -26.5F, -5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[76].setRotationPoint(37.5F, -26.5F, 4F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[77].setRotationPoint(35.5F, -28.5F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[78].setRotationPoint(35.5F, -28.5F, -7F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[79].setRotationPoint(35.5F, -28.5F, 5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 94
		bodyModel[80].setRotationPoint(35.5F, -28.5F, 6F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 95
		bodyModel[81].setRotationPoint(38.8F, -26.5F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 96
		bodyModel[82].setRotationPoint(38.8F, -26.5F, 2F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 97
		bodyModel[83].setRotationPoint(38.8F, -26.5F, 0.5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 98
		bodyModel[84].setRotationPoint(38.8F, -26.5F, -1.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 5, 3, 4, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 99
		bodyModel[85].setRotationPoint(23.5F, -29.5F, -2F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 100
		bodyModel[86].setRotationPoint(28.5F, -29.5F, -2F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[87].setRotationPoint(23.5F, -32F, -9.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 102
		bodyModel[88].setRotationPoint(23.5F, -32F, -5.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 103
		bodyModel[89].setRotationPoint(22.5F, -33F, -7.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 104
		bodyModel[90].setRotationPoint(23F, -32.5F, -9F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 105
		bodyModel[91].setRotationPoint(23.5F, -32F, 5.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 106
		bodyModel[92].setRotationPoint(23.5F, -32F, 7.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 6, 6, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[93].setRotationPoint(23.5F, -32F, 3.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[94].setRotationPoint(22.5F, -33F, 5.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[95].setRotationPoint(23F, -32.5F, 4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 5, 2, 4, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -2F, 0F, 0.5F); // Box 110
		bodyModel[96].setRotationPoint(23.5F, -26.5F, -2F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 111
		bodyModel[97].setRotationPoint(23F, -26.5F, -10F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 112
		bodyModel[98].setRotationPoint(28F, -26.5F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 3, 1, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 113
		bodyModel[99].setRotationPoint(25F, -26.5F, -10F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[100].setRotationPoint(23.4F, -23.5F, -9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -4.3F, -0.3F, 0.5F, -4.3F, -0.3F, 0.5F, 3.7F, -0.3F, 0.5F, 3.7F); // Box 115
		bodyModel[101].setRotationPoint(23.4F, -23F, -9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -4.3F, -0.3F, 0.5F, -4.3F, -0.3F, 0.5F, 3.7F, -0.3F, 0.5F, 3.7F); // Box 116
		bodyModel[102].setRotationPoint(26.4F, -23F, -9F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, 3.7F, -0.3F, 0.5F, 3.7F, -0.3F, 0.5F, -4.3F, -0.3F, 0.5F, -4.3F); // Box 117
		bodyModel[103].setRotationPoint(23.4F, -23F, 8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, 3.7F, -0.3F, 0.5F, 3.7F, -0.3F, 0.5F, -4.3F, -0.3F, 0.5F, -4.3F); // Box 118
		bodyModel[104].setRotationPoint(26.4F, -23F, 8F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 121
		bodyModel[105].setRotationPoint(40.4F, -16.5F, 3.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 122
		bodyModel[106].setRotationPoint(40.4F, -16.5F, -4.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 123
		bodyModel[107].setRotationPoint(23.4F, -16.5F, -4.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 124
		bodyModel[108].setRotationPoint(23.4F, -16.5F, 3.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 125
		bodyModel[109].setRotationPoint(31.9F, -16.5F, -4.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 126
		bodyModel[110].setRotationPoint(31.9F, -16.5F, 3.5F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 127
		bodyModel[111].setRotationPoint(35.9F, -16.5F, -4.5F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 128
		bodyModel[112].setRotationPoint(35.9F, -16.5F, 3.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 129
		bodyModel[113].setRotationPoint(27.9F, -16.5F, -4.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F); // Box 130
		bodyModel[114].setRotationPoint(27.9F, -16.5F, 3.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 131
		bodyModel[115].setRotationPoint(30.5F, -19F, -6.5F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[116].setRotationPoint(30.5F, -19F, -7.5F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[117].setRotationPoint(30.5F, -19F, 4.5F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 134
		bodyModel[118].setRotationPoint(30.5F, -19F, 6.5F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[119].setRotationPoint(31.5F, -38F, -2F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0F, -1.9F); // Box 137
		bodyModel[120].setRotationPoint(31.5F, -35F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 138
		bodyModel[121].setRotationPoint(35.5F, -26.5F, -5.3F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 139
		bodyModel[122].setRotationPoint(28.5F, -26.5F, -5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 140
		bodyModel[123].setRotationPoint(33.5F, -26.5F, -5.3F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 141
		bodyModel[124].setRotationPoint(31.5F, -26.5F, -5.3F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 142
		bodyModel[125].setRotationPoint(35.5F, -26.5F, 4.3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 143
		bodyModel[126].setRotationPoint(33.5F, -26.5F, 4.3F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 144
		bodyModel[127].setRotationPoint(31.5F, -26.5F, 4.3F);

		bodyModel[128].addShapeBox(-1F, 0F, -1F, 2, 35, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 145
		bodyModel[128].setRotationPoint(33.5F, -35F, 0F);
		bodyModel[128].rotateAngleX = -0.19198622F;
		bodyModel[128].rotateAngleZ = 0.20943951F;

		bodyModel[129].addShapeBox(-1F, 0F, -1F, 2, 35, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 146
		bodyModel[129].setRotationPoint(33.5F, -35F, 0F);
		bodyModel[129].rotateAngleX = 0.19198622F;
		bodyModel[129].rotateAngleZ = 0.20943951F;

		bodyModel[130].addShapeBox(-1F, 0F, -1F, 2, 35, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 147
		bodyModel[130].setRotationPoint(33.5F, -35F, 0F);
		bodyModel[130].rotateAngleX = -0.13962634F;
		bodyModel[130].rotateAngleZ = -0.29670597F;

		bodyModel[131].addShapeBox(-1F, 0F, -1F, 2, 35, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 148
		bodyModel[131].setRotationPoint(33.5F, -35F, 0F);
		bodyModel[131].rotateAngleX = 0.13962634F;
		bodyModel[131].rotateAngleZ = -0.29670597F;

		bodyModel[132].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[132].setRotationPoint(29F, -39F, -4.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		bodyModel[133].setRotationPoint(29F, -39F, -1.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 9, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 151
		bodyModel[134].setRotationPoint(29F, -39F, 1.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 6, 4, 0F,0F, -0.5F, 0F, 0F, -1.8F, -0.5F, 0F, -1.8F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 152
		bodyModel[135].setRotationPoint(36F, -44F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 6, 5, 0F,0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 153
		bodyModel[136].setRotationPoint(35F, -44F, -2.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 3, 6, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 154
		bodyModel[137].setRotationPoint(32F, -44F, -2.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 3, 5, 5, 0F,0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.5F); // Box 155
		bodyModel[138].setRotationPoint(29.5F, -44F, -2.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 156
		bodyModel[139].setRotationPoint(31F, -39F, -2.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 2, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 157
		bodyModel[140].setRotationPoint(30F, -42F, -5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 5, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 8F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[141].setRotationPoint(76F, -3.5F, 2.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 15, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 160
		bodyModel[142].setRotationPoint(28.5F, -49F, -0.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, 0F, 6F, -0.3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, -0.3F, -0.5F, 6F, -0.3F, -0.5F, 6F, 0F, 0F, 6F, 0F, 0F, 6F); // Box 161
		bodyModel[143].setRotationPoint(33F, -36F, -10F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 6F, 0F, 0F, 6F, -0.3F, 0F, 6F, -0.3F, 0F, 6F, 0F, 0F, 6F, 0F, 0F, 6F, -0.3F, -0.5F, 6F, -0.3F, -0.5F, 6F); // Box 162
		bodyModel[144].setRotationPoint(33F, -36F, 8F);

		bodyModel[145].addShapeBox(0F, 0F, -2F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[145].setRotationPoint(-1F, -2F, -16F);
		bodyModel[145].rotateAngleY = -0.66322512F;

		bodyModel[146].addShapeBox(2F, 0F, -1.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 164
		bodyModel[146].setRotationPoint(-1F, -2F, -16F);
		bodyModel[146].rotateAngleY = -0.66322512F;
		bodyModel[146].rotateAngleZ = 0.13962634F;

		bodyModel[147].addShapeBox(2F, 0F, 0.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 165
		bodyModel[147].setRotationPoint(-1F, -2F, -16F);
		bodyModel[147].rotateAngleY = -0.66322512F;
		bodyModel[147].rotateAngleZ = 0.13962634F;

		bodyModel[148].addShapeBox(2F, 0F, 0.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 169
		bodyModel[148].setRotationPoint(-17F, -2F, 16F);
		bodyModel[148].rotateAngleY = 2.40855437F;
		bodyModel[148].rotateAngleZ = 0.13962634F;

		bodyModel[149].addShapeBox(2F, 0F, -1.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 170
		bodyModel[149].setRotationPoint(-17F, -2F, 16F);
		bodyModel[149].rotateAngleY = 2.40855437F;
		bodyModel[149].rotateAngleZ = 0.13962634F;

		bodyModel[150].addShapeBox(0F, 0F, -2F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 171
		bodyModel[150].setRotationPoint(-17F, -2F, 16F);
		bodyModel[150].rotateAngleY = 2.40855437F;

		bodyModel[151].addShapeBox(-1F, 0F, -1F, 2, 15, 2, 0F,-0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F, -0.3F, 10F, -0.3F); // Box 172
		bodyModel[151].setRotationPoint(-26F, -27F, 0F);

		bodyModel[152].addShapeBox(-1.5F, 0F, -0.5F, 1, 15, 1, 0F,-0.3F, 12F, -0.3F, -0.3F, 12F, -0.3F, -0.3F, 12F, -0.3F, -0.3F, 12F, -0.3F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 12F, 0F); // Box 173
		bodyModel[152].setRotationPoint(-26F, -63F, 0F);

		bodyModel[153].addShapeBox(-1.5F, 0F, -1.5F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[153].setRotationPoint(-30F, -37.5F, 0F);

		bodyModel[154].addShapeBox(-1.5F, 0F, -1.5F, 9, 1, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[154].setRotationPoint(-30F, -37.5F, -3F);

		bodyModel[155].addShapeBox(-1.5F, 0F, -1.5F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 176
		bodyModel[155].setRotationPoint(-30F, -37.5F, 3F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 6, 2, 4, 0F,0F, 0F, 0F, -0.5F, 2.5F, 0F, -0.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[156].setRotationPoint(-41.5F, -22F, -2F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 178
		bodyModel[157].setRotationPoint(-42.5F, -22F, -2F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 1, 5, 4, 0F,0.5F, 0F, 0F, -0.2F, -2.5F, -1F, -0.2F, -2.5F, -1F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, 0F); // Box 179
		bodyModel[158].setRotationPoint(-35.5F, -24.5F, -2F);

		bodyModel[159].addShapeBox(-1F, 10F, -1F, 2, 16, 2, 0F,-0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F); // Box 180
		bodyModel[159].setRotationPoint(-27F, -37F, 0F);
		bodyModel[159].rotateAngleX = -0.13962634F;
		bodyModel[159].rotateAngleZ = -0.20943951F;

		bodyModel[160].addShapeBox(-1F, 10F, -1F, 2, 16, 2, 0F,-0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F, -0.5F, 10F, -0.5F); // Box 181
		bodyModel[160].setRotationPoint(-27F, -37F, 0F);
		bodyModel[160].rotateAngleX = 0.13962634F;
		bodyModel[160].rotateAngleZ = -0.20943951F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		bodyModel[161].setRotationPoint(-33F, -16F, -6.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 9, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 183
		bodyModel[162].setRotationPoint(-33F, -16F, -3.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 9, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 184
		bodyModel[163].setRotationPoint(-33F, -16F, 3.5F);

		bodyModel[164].addShapeBox(0F, 0F, -2F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[164].setRotationPoint(25F, -6F, -9.5F);
		bodyModel[164].rotateAngleY = -0.52359878F;

		bodyModel[165].addShapeBox(2F, 0F, 0.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 186
		bodyModel[165].setRotationPoint(25F, -6F, -9.5F);
		bodyModel[165].rotateAngleY = -0.52359878F;
		bodyModel[165].rotateAngleZ = 0.2443461F;

		bodyModel[166].addShapeBox(2F, 0F, -1.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 187
		bodyModel[166].setRotationPoint(25F, -6F, -9.5F);
		bodyModel[166].rotateAngleY = -0.52359878F;
		bodyModel[166].rotateAngleZ = 0.2443461F;

		bodyModel[167].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 188
		bodyModel[167].setRotationPoint(-34F, -6F, -11F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 189
		bodyModel[168].setRotationPoint(-24F, -6F, -11F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 190
		bodyModel[169].setRotationPoint(-8F, -6F, -11F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 191
		bodyModel[170].setRotationPoint(2F, -6F, -11F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 192
		bodyModel[171].setRotationPoint(-22F, -6.5F, -5.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 193
		bodyModel[172].setRotationPoint(-12F, -6.5F, -5.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 68, 13, 38, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -1F, -13F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -1F, -13F); // Box 194
		bodyModel[173].setRotationPoint(-121F, 10F, -19F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 83, 13, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 195
		bodyModel[174].setRotationPoint(-53F, 10F, -19F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 50, 13, 38, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, -8F); // Box 196
		bodyModel[175].setRotationPoint(30F, 10F, -19F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 20, 13, 32, 0F,0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -7.3F, 0F, 0F, -8.5F, 0F, 0F, -8.5F, 0F, 0F, -7.3F); // Box 197
		bodyModel[176].setRotationPoint(80F, 10F, -16F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 59, 13, 31, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1F, -13F, 0F, -1F, -13F, 0F, 0F, -8F); // Box 198
		bodyModel[177].setRotationPoint(100F, 10F, -15.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 12, 12, 17, 0F,0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, -6F, 0.5F, 3F, -8F, 0.5F, 3F, -8F, 0F, 0F, -6F); // Box 199
		bodyModel[178].setRotationPoint(159F, 10F, -8.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 45, 9, 28, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -6.5F, -8F, 0F, 3F, -8F, 0F, 3F, -8F, 0F, -6.5F, -8F); // Box 200
		bodyModel[179].setRotationPoint(-166F, 10F, -14F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 7, 2, 12, 0F,0.5F, 0.5F, -3F, 0F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0.5F, -3F, -2F, -1F, -5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2F, -1F, -5F); // Box 202
		bodyModel[180].setRotationPoint(-173F, 10F, -6F);

		bodyModel[181].addShapeBox(-10F, 0F, -2.5F, 10, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 203
		bodyModel[181].setRotationPoint(-113F, -2F, -12.5F);
		bodyModel[181].rotateAngleY = -0.10471976F;

		bodyModel[182].addShapeBox(0F, 0F, -2.5F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 204
		bodyModel[182].setRotationPoint(-113F, -2F, -12.5F);
		bodyModel[182].rotateAngleY = -0.10471976F;

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 205
		bodyModel[183].setRotationPoint(-172.5F, -11F, -0.5F);

		bodyModel[184].addShapeBox(-20.7F, -5.5F, 0F, 30, 19, 1, 0F,-13F, -10F, -0.35F, -9F, -6F, -0.35F, -9F, -6F, -0.35F, -13F, -10F, -0.35F, -12.5F, -3F, -0.35F, -9F, -6F, -0.35F, -9F, -6F, -0.35F, -12.5F, -3F, -0.35F); // Box 206
		bodyModel[184].setRotationPoint(-172.5F, -11F, -0.5F);

		bodyModel[185].addShapeBox(-10.5F, -0.5F, 0F, 1, 1, 1, 0F,80F, -0.35F, -0.35F, 80F, -0.35F, -0.35F, 80F, -0.35F, -0.35F, 80F, -0.35F, -0.35F, 80F, -0.35F, -0.35F, 80F, -0.35F, -0.35F, 80F, -0.35F, -0.35F, 80F, -0.35F, -0.35F); // Box 207
		bodyModel[185].setRotationPoint(-90.5F, -43F, -0.5F);
		bodyModel[185].rotateAngleZ = 0.45378561F;

		bodyModel[186].addShapeBox(-10.5F, -0.5F, 0F, 1, 1, 1, 0F,31F, -0.35F, -0.35F, 31F, -0.35F, -0.35F, 31F, -0.35F, -0.35F, 31F, -0.35F, -0.35F, 31F, -0.35F, -0.35F, 31F, -0.35F, -0.35F, 31F, -0.35F, -0.35F, 31F, -0.35F, -0.35F); // Box 208
		bodyModel[186].setRotationPoint(10.5F, -56.5F, -0.5F);
		bodyModel[186].rotateAngleZ = -0.43633231F;

		bodyModel[187].addShapeBox(-11.5F, -0.5F, 0F, 1, 1, 1, 0F,74F, -0.35F, -0.35F, 75F, -0.35F, -0.35F, 75F, -0.35F, -0.35F, 74F, -0.35F, -0.35F, 74F, -0.35F, -0.35F, 75F, -0.35F, -0.35F, 75F, -0.35F, -0.35F, 74F, -0.35F, -0.35F); // Box 209
		bodyModel[187].setRotationPoint(112F, -25.5F, -0.5F);
		bodyModel[187].rotateAngleZ = -0.26179939F;

		bodyModel[188].addShapeBox(0F, 0F, -2.5F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 210
		bodyModel[188].setRotationPoint(-113F, -2F, 12.5F);
		bodyModel[188].rotateAngleY = 0.10471976F;

		bodyModel[189].addShapeBox(-10F, 0F, -2.5F, 10, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 211
		bodyModel[189].setRotationPoint(-113F, -2F, 12.5F);
		bodyModel[189].rotateAngleY = 0.10471976F;

		bodyModel[190].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 212
		bodyModel[190].setRotationPoint(-34F, -6F, 6F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 213
		bodyModel[191].setRotationPoint(-24F, -6F, 6F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 214
		bodyModel[192].setRotationPoint(-8F, -6F, 6F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 215
		bodyModel[193].setRotationPoint(2F, -6F, 6F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 10, 3, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -0.5F, -1.5F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, -0.5F, -1.5F); // Box 216
		bodyModel[194].setRotationPoint(-22F, -6.5F, 0.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 13, 3, 5, 0F,0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, -2F, -0.8F, -1.5F, -2F, -0.8F, -1.5F, 0F, 0F, -1F); // Box 217
		bodyModel[195].setRotationPoint(-12F, -6.5F, 0.5F);

		bodyModel[196].addShapeBox(0F, 0F, -2F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[196].setRotationPoint(-1F, -2F, 16F);
		bodyModel[196].rotateAngleY = 0.66322512F;

		bodyModel[197].addShapeBox(2F, 0F, 0.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 219
		bodyModel[197].setRotationPoint(-1F, -2F, 16F);
		bodyModel[197].rotateAngleY = 0.66322512F;
		bodyModel[197].rotateAngleZ = 0.13962634F;

		bodyModel[198].addShapeBox(2F, 0F, -1.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 220
		bodyModel[198].setRotationPoint(-1F, -2F, 16F);
		bodyModel[198].rotateAngleY = 0.66322512F;
		bodyModel[198].rotateAngleZ = 0.13962634F;

		bodyModel[199].addShapeBox(0F, 0F, -2F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[199].setRotationPoint(25F, -6F, 9.5F);
		bodyModel[199].rotateAngleY = 0.52359878F;

		bodyModel[200].addShapeBox(2F, 0F, 0.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 222
		bodyModel[200].setRotationPoint(25F, -6F, 9.5F);
		bodyModel[200].rotateAngleY = 0.52359878F;
		bodyModel[200].rotateAngleZ = 0.2443461F;

		bodyModel[201].addShapeBox(2F, 0F, -1.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 223
		bodyModel[201].setRotationPoint(25F, -6F, 9.5F);
		bodyModel[201].rotateAngleY = 0.52359878F;
		bodyModel[201].rotateAngleZ = 0.2443461F;

		bodyModel[202].addShapeBox(0F, 0F, -2F, 3, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[202].setRotationPoint(-17F, -2F, -16F);
		bodyModel[202].rotateAngleY = -2.40855437F;

		bodyModel[203].addShapeBox(2F, 0F, 0.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 225
		bodyModel[203].setRotationPoint(-17F, -2F, -16F);
		bodyModel[203].rotateAngleY = -2.40855437F;
		bodyModel[203].rotateAngleZ = 0.13962634F;

		bodyModel[204].addShapeBox(2F, 0F, -1.2F, 6, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 226
		bodyModel[204].setRotationPoint(-17F, -2F, -16F);
		bodyModel[204].rotateAngleY = -2.40855437F;
		bodyModel[204].rotateAngleZ = 0.13962634F;
	}

	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 201

		leftFrontWheelModel[0].addShapeBox(-14F, 0F, -1F, 14, 9, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		leftFrontWheelModel[0].setRotationPoint(-153F, 22F, 0F);
		leftFrontWheelModel[0].rotateAngleX = 3.14159265F;
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[5];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 23
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 24
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 26
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 27

		gun_2_Model[0][0].addShapeBox(-4F, -5F, -5F, 10, 5, 10, 0F,0F, 0F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_2_Model[0][1].addShapeBox(5.5F, -3F, -5F, 1, 3, 10, 0F,0F, 0.7F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24

		gun_2_Model[0][2].addShapeBox(-8F, -5F, -5F, 4, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_2_Model[0][3].addShapeBox(-10F, -5F, -5F, 2, 5, 10, 0F,-0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F); // Box 26

		gun_2_Model[0][4].addShapeBox(-7.5F, -4F, -7F, 3, 1, 14, 0F,0F, -0.1F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.3F, 0F); // Box 27

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(76.5F, -6F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 28
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 29

		gun_2_Model[1][0].addShapeBox(1F, -2.2F, -1.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 28

		gun_2_Model[1][1].addShapeBox(1F, -2.2F, 0.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 29

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(76.5F, -6F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("FrontGun", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[5];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 23
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 24
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 26
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 27

		gun_3_Model[0][0].addShapeBox(-4F, -5F, -5F, 10, 5, 10, 0F,0F, 0F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_3_Model[0][1].addShapeBox(5.5F, -3F, -5F, 1, 3, 10, 0F,0F, 0.7F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24

		gun_3_Model[0][2].addShapeBox(-8F, -5F, -5F, 4, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_3_Model[0][3].addShapeBox(-10F, -5F, -5F, 2, 5, 10, 0F,-0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F); // Box 26

		gun_3_Model[0][4].addShapeBox(-7.5F, -4F, -7F, 3, 1, 14, 0F,0F, -0.1F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.3F, 0F); // Box 27

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(59.5F, -11.5F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 28
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 29

		gun_3_Model[1][0].addShapeBox(1F, -2.2F, -1.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 28

		gun_3_Model[1][1].addShapeBox(1F, -2.2F, 0.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 29

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(59.5F, -11.5F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("FrontMiddleGun", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[5];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 23
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 24
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 26
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 27

		gun_4_Model[0][0].addShapeBox(-4F, -5F, -5F, 10, 5, 10, 0F,0F, 0F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_4_Model[0][1].addShapeBox(5.5F, -3F, -5F, 1, 3, 10, 0F,0F, 0.7F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24

		gun_4_Model[0][2].addShapeBox(-8F, -5F, -5F, 4, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_4_Model[0][3].addShapeBox(-10F, -5F, -5F, 2, 5, 10, 0F,-0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F); // Box 26

		gun_4_Model[0][4].addShapeBox(-7.5F, -4F, -7F, 3, 1, 14, 0F,0F, -0.1F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.3F, 0F); // Box 27

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-70F, -6.5F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[2];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 28
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 29

		gun_4_Model[1][0].addShapeBox(1F, -2.2F, -1.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 28

		gun_4_Model[1][1].addShapeBox(1F, -2.2F, 0.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 29

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(-70F, -6.5F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RearMiddleGun", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[5];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 23
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 24
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 26
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 27

		gun_5_Model[0][0].addShapeBox(-4F, -5F, -5F, 10, 5, 10, 0F,0F, 0F, 0F, -0.5F, -1.3F, 0F, -0.5F, -1.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 23

		gun_5_Model[0][1].addShapeBox(5.5F, -3F, -5F, 1, 3, 10, 0F,0F, 0.7F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24

		gun_5_Model[0][2].addShapeBox(-8F, -5F, -5F, 4, 5, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25

		gun_5_Model[0][3].addShapeBox(-10F, -5F, -5F, 2, 5, 10, 0F,-0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F, -0.5F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -4F); // Box 26

		gun_5_Model[0][4].addShapeBox(-7.5F, -4F, -7F, 3, 1, 14, 0F,0F, -0.1F, 0F, 0F, 0.2F, 0.5F, 0F, 0.2F, 0.5F, 0F, -0.1F, 0F, 0F, 0.3F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.3F, 0F); // Box 27

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-87.5F, -1F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[2];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 28
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 29

		gun_5_Model[1][0].addShapeBox(1F, -2.2F, -1.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 28

		gun_5_Model[1][1].addShapeBox(1F, -2.2F, 0.5F, 20, 1, 1, 0F,0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, 0F, 0F); // Box 29

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-87.5F, -1F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("RearGun", gun_5_Model);
	}
}