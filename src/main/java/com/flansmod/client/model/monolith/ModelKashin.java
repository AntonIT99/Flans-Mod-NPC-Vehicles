//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kashin
// Model Creator: 
// Created on: 28.09.2021 - 14:51:17
// Last changed on: 28.09.2021 - 14:51:17

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKashin extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelKashin() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[258];
		turretModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		initturretModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 233, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 201, 33, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 273, 33, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 377, 41, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 265, 57, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 201, 65, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 409, 1, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 329, 33, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 417, 65, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 121, 73, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 241, 73, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 541
		bodyModel[46] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 542
		bodyModel[47] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 209, 17, textureX, textureY); // Box 50
		bodyModel[51] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 51
		bodyModel[52] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 24
		bodyModel[53] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 25
		bodyModel[54] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 375
		bodyModel[55] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 376
		bodyModel[56] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 377
		bodyModel[57] = new ModelRendererTurbo(this, 257, 65, textureX, textureY); // Box 378
		bodyModel[58] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 385
		bodyModel[59] = new ModelRendererTurbo(this, 57, 1, textureX, textureY); // Box 386
		bodyModel[60] = new ModelRendererTurbo(this, 417, 17, textureX, textureY); // Box 60
		bodyModel[61] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 61
		bodyModel[62] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 62
		bodyModel[63] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 63
		bodyModel[64] = new ModelRendererTurbo(this, 249, 1, textureX, textureY); // Box 64
		bodyModel[65] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 77
		bodyModel[66] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 79
		bodyModel[67] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 80
		bodyModel[68] = new ModelRendererTurbo(this, 337, 89, textureX, textureY); // Box 81
		bodyModel[69] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 82
		bodyModel[70] = new ModelRendererTurbo(this, 49, 97, textureX, textureY); // Box 83
		bodyModel[71] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 84
		bodyModel[72] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 84
		bodyModel[73] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 85
		bodyModel[74] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 86
		bodyModel[75] = new ModelRendererTurbo(this, 385, 105, textureX, textureY); // Box 87
		bodyModel[76] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 88
		bodyModel[77] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 89
		bodyModel[78] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 90
		bodyModel[79] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 91
		bodyModel[80] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 92
		bodyModel[81] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 93
		bodyModel[82] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 94
		bodyModel[83] = new ModelRendererTurbo(this, 465, 89, textureX, textureY); // Box 95
		bodyModel[84] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 96
		bodyModel[85] = new ModelRendererTurbo(this, 177, 49, textureX, textureY); // Box 97
		bodyModel[86] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 98
		bodyModel[87] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 99
		bodyModel[88] = new ModelRendererTurbo(this, 145, 33, textureX, textureY); // Box 100
		bodyModel[89] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 101
		bodyModel[90] = new ModelRendererTurbo(this, 233, 97, textureX, textureY); // Box 102
		bodyModel[91] = new ModelRendererTurbo(this, 113, 81, textureX, textureY); // Box 103
		bodyModel[92] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 104
		bodyModel[93] = new ModelRendererTurbo(this, 9, 97, textureX, textureY); // Box 105
		bodyModel[94] = new ModelRendererTurbo(this, 489, 97, textureX, textureY); // Box 106
		bodyModel[95] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 107
		bodyModel[96] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 108
		bodyModel[97] = new ModelRendererTurbo(this, 113, 105, textureX, textureY); // Box 109
		bodyModel[98] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 110
		bodyModel[99] = new ModelRendererTurbo(this, 289, 97, textureX, textureY); // Box 111
		bodyModel[100] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 112
		bodyModel[101] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 113
		bodyModel[102] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 114
		bodyModel[103] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 115
		bodyModel[104] = new ModelRendererTurbo(this, 201, 145, textureX, textureY); // Box 116
		bodyModel[105] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 117
		bodyModel[106] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 118
		bodyModel[107] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 119
		bodyModel[108] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 120
		bodyModel[109] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 121
		bodyModel[110] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 122
		bodyModel[111] = new ModelRendererTurbo(this, 161, 49, textureX, textureY); // Box 123
		bodyModel[112] = new ModelRendererTurbo(this, 225, 65, textureX, textureY); // Box 124
		bodyModel[113] = new ModelRendererTurbo(this, 49, 81, textureX, textureY); // Box 125
		bodyModel[114] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 126
		bodyModel[115] = new ModelRendererTurbo(this, 393, 105, textureX, textureY); // Box 127
		bodyModel[116] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 128
		bodyModel[117] = new ModelRendererTurbo(this, 17, 113, textureX, textureY); // Box 129
		bodyModel[118] = new ModelRendererTurbo(this, 289, 145, textureX, textureY); // Box 130
		bodyModel[119] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 131
		bodyModel[120] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 132
		bodyModel[121] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 133
		bodyModel[122] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 134
		bodyModel[123] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 135
		bodyModel[124] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 136
		bodyModel[125] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 137
		bodyModel[126] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 138
		bodyModel[127] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 139
		bodyModel[128] = new ModelRendererTurbo(this, 177, 73, textureX, textureY); // Box 140
		bodyModel[129] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 141
		bodyModel[130] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 142
		bodyModel[131] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 143
		bodyModel[132] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 144
		bodyModel[133] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 145
		bodyModel[134] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 146
		bodyModel[135] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 147
		bodyModel[136] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 148
		bodyModel[137] = new ModelRendererTurbo(this, 433, 41, textureX, textureY); // Box 149
		bodyModel[138] = new ModelRendererTurbo(this, 185, 57, textureX, textureY); // Box 150
		bodyModel[139] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 151
		bodyModel[140] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 152
		bodyModel[141] = new ModelRendererTurbo(this, 337, 57, textureX, textureY); // Box 153
		bodyModel[142] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 154
		bodyModel[143] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 155
		bodyModel[144] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 156
		bodyModel[145] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 157
		bodyModel[146] = new ModelRendererTurbo(this, 129, 73, textureX, textureY); // Box 158
		bodyModel[147] = new ModelRendererTurbo(this, 465, 73, textureX, textureY); // Box 159
		bodyModel[148] = new ModelRendererTurbo(this, 265, 81, textureX, textureY); // Box 0
		bodyModel[149] = new ModelRendererTurbo(this, 313, 81, textureX, textureY); // Box 162
		bodyModel[150] = new ModelRendererTurbo(this, 425, 137, textureX, textureY); // Box 163
		bodyModel[151] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 164
		bodyModel[152] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 165
		bodyModel[153] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 166
		bodyModel[154] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 167
		bodyModel[155] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 168
		bodyModel[156] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 169
		bodyModel[157] = new ModelRendererTurbo(this, 73, 153, textureX, textureY); // Box 170
		bodyModel[158] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 171
		bodyModel[159] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 172
		bodyModel[160] = new ModelRendererTurbo(this, 89, 89, textureX, textureY); // Box 173
		bodyModel[161] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 174
		bodyModel[162] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 175
		bodyModel[163] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 176
		bodyModel[164] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 177
		bodyModel[165] = new ModelRendererTurbo(this, 89, 81, textureX, textureY); // Box 178
		bodyModel[166] = new ModelRendererTurbo(this, 129, 81, textureX, textureY); // Box 179
		bodyModel[167] = new ModelRendererTurbo(this, 185, 81, textureX, textureY); // Box 180
		bodyModel[168] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 181
		bodyModel[169] = new ModelRendererTurbo(this, 457, 89, textureX, textureY); // Box 182
		bodyModel[170] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 183
		bodyModel[171] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 184
		bodyModel[172] = new ModelRendererTurbo(this, 193, 145, textureX, textureY); // Box 185
		bodyModel[173] = new ModelRendererTurbo(this, 169, 89, textureX, textureY); // Box 186
		bodyModel[174] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 187
		bodyModel[175] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 188
		bodyModel[176] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 189
		bodyModel[177] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 190
		bodyModel[178] = new ModelRendererTurbo(this, 361, 105, textureX, textureY); // Box 191
		bodyModel[179] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 192
		bodyModel[180] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 193
		bodyModel[181] = new ModelRendererTurbo(this, 281, 97, textureX, textureY); // Box 194
		bodyModel[182] = new ModelRendererTurbo(this, 305, 145, textureX, textureY); // Box 195
		bodyModel[183] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 196
		bodyModel[184] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 197
		bodyModel[185] = new ModelRendererTurbo(this, 361, 145, textureX, textureY); // Box 198
		bodyModel[186] = new ModelRendererTurbo(this, 97, 121, textureX, textureY); // Box 199
		bodyModel[187] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 200
		bodyModel[188] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 201
		bodyModel[189] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 202
		bodyModel[190] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 203
		bodyModel[191] = new ModelRendererTurbo(this, 441, 89, textureX, textureY); // Box 204
		bodyModel[192] = new ModelRendererTurbo(this, 113, 97, textureX, textureY); // Box 205
		bodyModel[193] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 206
		bodyModel[194] = new ModelRendererTurbo(this, 129, 97, textureX, textureY); // Box 207
		bodyModel[195] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 208
		bodyModel[196] = new ModelRendererTurbo(this, 137, 113, textureX, textureY); // Box 209
		bodyModel[197] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 210
		bodyModel[198] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 211
		bodyModel[199] = new ModelRendererTurbo(this, 473, 137, textureX, textureY); // Box 212
		bodyModel[200] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 213
		bodyModel[201] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 214
		bodyModel[202] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 215
		bodyModel[203] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 216
		bodyModel[204] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 217
		bodyModel[205] = new ModelRendererTurbo(this, 97, 153, textureX, textureY); // Box 218
		bodyModel[206] = new ModelRendererTurbo(this, 257, 97, textureX, textureY); // Box 219
		bodyModel[207] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 220
		bodyModel[208] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 221
		bodyModel[209] = new ModelRendererTurbo(this, 505, 121, textureX, textureY); // Box 222
		bodyModel[210] = new ModelRendererTurbo(this, 81, 129, textureX, textureY); // Box 223
		bodyModel[211] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 224
		bodyModel[212] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 225
		bodyModel[213] = new ModelRendererTurbo(this, 9, 153, textureX, textureY); // Box 226
		bodyModel[214] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 227
		bodyModel[215] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 228
		bodyModel[216] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 229
		bodyModel[217] = new ModelRendererTurbo(this, 137, 153, textureX, textureY); // Box 230
		bodyModel[218] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 231
		bodyModel[219] = new ModelRendererTurbo(this, 273, 153, textureX, textureY); // Box 232
		bodyModel[220] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 233
		bodyModel[221] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 234
		bodyModel[222] = new ModelRendererTurbo(this, 305, 153, textureX, textureY); // Box 235
		bodyModel[223] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 236
		bodyModel[224] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 237
		bodyModel[225] = new ModelRendererTurbo(this, 345, 153, textureX, textureY); // Box 240
		bodyModel[226] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 242
		bodyModel[227] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 243
		bodyModel[228] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 244
		bodyModel[229] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 245
		bodyModel[230] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 246
		bodyModel[231] = new ModelRendererTurbo(this, 41, 161, textureX, textureY); // Box 247
		bodyModel[232] = new ModelRendererTurbo(this, 185, 161, textureX, textureY); // Box 248
		bodyModel[233] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 249
		bodyModel[234] = new ModelRendererTurbo(this, 345, 161, textureX, textureY); // Box 250
		bodyModel[235] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 247
		bodyModel[236] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 248
		bodyModel[237] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 249
		bodyModel[238] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 250
		bodyModel[239] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 251
		bodyModel[240] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 252
		bodyModel[241] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 253
		bodyModel[242] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 254
		bodyModel[243] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 255
		bodyModel[244] = new ModelRendererTurbo(this, 9, 161, textureX, textureY); // Box 256
		bodyModel[245] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 257
		bodyModel[246] = new ModelRendererTurbo(this, 457, 161, textureX, textureY); // Box 258
		bodyModel[247] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 265
		bodyModel[248] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 266
		bodyModel[249] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 294
		bodyModel[250] = new ModelRendererTurbo(this, 9, 177, textureX, textureY); // Box 295
		bodyModel[251] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 296
		bodyModel[252] = new ModelRendererTurbo(this, 33, 177, textureX, textureY); // Box 297
		bodyModel[253] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 298
		bodyModel[254] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 309
		bodyModel[255] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 310
		bodyModel[256] = new ModelRendererTurbo(this, 153, 177, textureX, textureY); // Box 311
		bodyModel[257] = new ModelRendererTurbo(this, 457, 177, textureX, textureY); // Box 312

		bodyModel[0].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-115.5F, 0.3F, -4.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,-2.25F, 0F, -1F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-115.5F, 0.3F, -9.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 34, 4, 9, 0F,1.75F, 0F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, 0.5F, 1.75F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 2
		bodyModel[2].setRotationPoint(-109.5F, 0.3F, -9.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, -2.25F, 0F, -1F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.75F); // Box 3
		bodyModel[3].setRotationPoint(-115.5F, 0.3F, 4.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 34, 4, 9, 0F,1.75F, 0F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 3F, 1.75F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.75F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(-109.5F, 0.3F, 0.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 72, 4, 25, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F); // Box 5
		bodyModel[5].setRotationPoint(-75.5F, 0.3F, -12.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 38, 4, 25, 0F,0F, -0.5F, 0.5F, 0F, 0.75F, -0.25F, 0F, 0.75F, -0.25F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(-3.5F, 0.3F, -12.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 26, 4, 25, 0F,0F, 0.75F, -0.25F, 0F, 1.75F, -1.25F, 0F, 1.75F, -1.25F, 0F, 0.75F, -0.25F, 0F, 0F, -1.75F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -1.75F); // Box 7
		bodyModel[7].setRotationPoint(34.5F, 0.3F, -12.5F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 18, 4, 25, 0F,0F, 1.75F, -1.25F, 0F, 2.75F, -3.5F, 0F, 2.75F, -3.5F, 0F, 1.75F, -1.25F, 0F, 0F, -4.25F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -4.25F); // Box 8
		bodyModel[8].setRotationPoint(60.5F, 0.3F, -12.5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 17, 7, 18, 0F,0F, -0.25F, 0F, 0F, 1.25F, -3.5F, 0F, 1.25F, -3.5F, 0F, -0.25F, 0F, 0F, 0F, -4F, 0F, 0F, -7.25F, 0F, 0F, -7.25F, 0F, 0F, -4F); // Box 9
		bodyModel[9].setRotationPoint(78.5F, -2.7F, -9F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 10, 8, 10, 0F,0F, 0.25F, 0.5F, 0F, 1.25F, -2.25F, 0F, 1.25F, -2.25F, 0F, 0.25F, 0.5F, 0F, 0F, -3.25F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -3.25F); // Box 10
		bodyModel[10].setRotationPoint(95.5F, -3.7F, -5F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 10, 9, 4, 0F,0F, 0.25F, 0.75F, -0.25F, 1F, -1.75F, -0.25F, 1F, -1.75F, 0F, 0.25F, 0.75F, 0F, 0F, -1.75F, -5F, -5F, -1.75F, -5F, -5F, -1.75F, 0F, 0F, -1.75F); // Box 11
		bodyModel[11].setRotationPoint(105.5F, -4.7F, -2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 17, 4, 18, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 12
		bodyModel[12].setRotationPoint(-69.75F, -3.3F, -9F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 4, 18, 0F,0.25F, 0F, -4.25F, 1F, 0F, 0F, 1F, 0F, 0F, 0.25F, 0F, -4.25F, 1.25F, 0F, -4.25F, 1F, 0F, 0.75F, 1F, 0F, 0.75F, 1.25F, 0F, -4.25F); // Box 13
		bodyModel[13].setRotationPoint(-73.75F, -3.3F, -9F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 2, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0.25F, 0F, -2F, 0.25F, 0F, -2F, 0F, 0F, 0.75F); // Box 14
		bodyModel[14].setRotationPoint(-52.25F, -3.3F, -9F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 11, 4, 14, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0F); // Box 15
		bodyModel[15].setRotationPoint(-50.25F, -3.3F, -7F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F); // Box 16
		bodyModel[16].setRotationPoint(-39.25F, -3.3F, -7F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 35, 4, 20, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 17
		bodyModel[17].setRotationPoint(-36.25F, -3.3F, -10F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 1, 4, 20, 0F,0F, 0F, -0.25F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0.5F); // Box 18
		bodyModel[18].setRotationPoint(-1.25F, -3.3F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 16, 4, 14, 0F,0F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F); // Box 19
		bodyModel[19].setRotationPoint(-0.25F, -3.3F, -7F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 14, 0F,0F, 0F, -0.5F, -0.25F, 0.25F, 2.5F, -0.25F, 0.25F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.1F, -0.25F, 0F, 3F, -0.25F, 0F, 3F, 0F, 0F, -0.1F); // Box 20
		bodyModel[20].setRotationPoint(15.75F, -3.8F, -7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 26, 4, 14, 0F,-0.25F, 0.25F, 2.5F, 0.25F, 1F, 2.5F, 0.25F, 1F, 2.5F, -0.25F, 0.25F, 2.5F, -0.25F, 0F, 3F, 0.25F, 0F, 3F, 0.25F, 0F, 3F, -0.25F, 0F, 3F); // Box 21
		bodyModel[21].setRotationPoint(19.25F, -3.8F, -7F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 25, 5, 14, 0F,-0.25F, 0F, 2.5F, -0.25F, 1F, 0.25F, -0.25F, 1F, 0.25F, -0.25F, 0F, 2.5F, -0.25F, 0F, 3F, -0.25F, -2F, 0.75F, -0.25F, -2F, 0.75F, -0.25F, 0F, 3F); // Box 22
		bodyModel[22].setRotationPoint(45.25F, -4.8F, -7F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 5, 14, 0F,0F, 0F, 0.25F, -0.25F, 0F, -2.5F, -0.25F, 0F, -2.5F, 0F, 0F, 0.25F, 0F, 0F, 1F, 1.25F, -1.25F, -2.5F, 1.25F, -1.25F, -2.5F, 0F, 0F, 1F); // Box 23
		bodyModel[23].setRotationPoint(70F, -5.8F, -7F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,-2.25F, 0.75F, 1.25F, -1.75F, 2F, 1.25F, -2.75F, 3F, 2.25F, -1.25F, 1.75F, 2.5F, -1.25F, 0.75F, 0.25F, -0.25F, 0.75F, 0.5F, -2.75F, 0.75F, 3.75F, -1.25F, 0.75F, 5.25F); // Box 24
		bodyModel[24].setRotationPoint(-50.25F, -7.8F, -7F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0.25F, -0.25F, -2F, 1.25F, -0.25F, 1.25F, 0.25F, 0.75F, 0.5F, 0.25F, 0.25F, 0F, 0F, -0.25F, -2F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 3.25F, -2F, -0.25F, 3F); // Box 25
		bodyModel[25].setRotationPoint(-51.25F, -8.8F, -7F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-1.25F, 2F, 1.25F, -1.75F, 2.25F, 0.5F, -1.75F, 3F, 1F, -0.25F, 3F, 2.25F, -2.75F, 0.75F, 0.5F, -0.5F, 0.75F, -0.75F, -0.5F, 0.75F, 2.5F, -0.25F, 0.75F, 3.75F); // Box 26
		bodyModel[26].setRotationPoint(-42.25F, -7.8F, -7F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 4, 2, 0F,-1.25F, 1.75F, 2.5F, -2.75F, 3F, 2.25F, -1.75F, 2F, 1.25F, -2.25F, 0.75F, 1.25F, -1.25F, 0.75F, 5.25F, -2.75F, 0.75F, 3.75F, -0.25F, 0.75F, 0.5F, -1.25F, 0.75F, 0.25F); // Box 27
		bodyModel[27].setRotationPoint(-50.25F, -7.8F, 5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 2, 6, 4, 0F,0.25F, 0.25F, 0F, 0.25F, 0.75F, 0.5F, 1.25F, -0.25F, 1.25F, 0.25F, -0.25F, -2F, -2F, -0.25F, 3F, 0.25F, -0.25F, 3.25F, 0.25F, -0.25F, 0.25F, 0F, -0.25F, -2F); // Box 28
		bodyModel[28].setRotationPoint(-51.25F, -8.8F, 3F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 4, 4, 2, 0F,-0.25F, 3F, 2.25F, -1.75F, 3F, 1F, -1.75F, 2.25F, 0.5F, -1.25F, 2F, 1.25F, -0.25F, 0.75F, 3.75F, -0.5F, 0.75F, 2.5F, -0.5F, 0.75F, -0.75F, -2.75F, 0.75F, 0.5F); // Box 29
		bodyModel[29].setRotationPoint(-42.25F, -7.8F, 5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[30].setRotationPoint(-42.25F, -7.8F, -4F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 5, 8, 0F,0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[31].setRotationPoint(-51.25F, -8.3F, -4F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 5, 8, 0F,-0.5F, -0.75F, -0.25F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, -0.5F, -0.75F, -0.25F, 3.5F, 1F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 3.5F, 1F, -2F); // Box 32
		bodyModel[32].setRotationPoint(-53.25F, -8.3F, -4F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 10, 8, 2, 0F,-2.25F, 0.75F, 1.25F, -1.75F, 2F, 1.25F, -2.75F, 3F, 2.25F, -1.25F, 1.75F, 2.5F, -1.25F, 0.75F, -0.75F, -0.25F, 0.75F, -0.75F, -2.75F, 0.75F, 3.75F, -1.25F, 0.75F, 5.25F); // Box 33
		bodyModel[33].setRotationPoint(-0.25F, -11.8F, -7.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,-1.25F, 2F, 1.25F, -1.75F, 2.25F, 0.5F, -1.75F, 3F, 1F, -0.25F, 3F, 2.25F, -2.75F, 0.75F, -0.75F, 0.5F, 0.75F, -1.75F, 0.5F, 0.75F, 2.5F, -0.25F, 0.75F, 3.75F); // Box 34
		bodyModel[34].setRotationPoint(6.75F, -11.8F, -7.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,-0.5F, -0.25F, -1F, 1.25F, -0.25F, 1.25F, 0.25F, 0.75F, 0.5F, 0.25F, 0.25F, 0F, 0.5F, -0.25F, -2F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, 3.25F, -0.5F, -0.25F, 3F); // Box 35
		bodyModel[35].setRotationPoint(-1.25F, -12.8F, -7.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 10, 8, 2, 0F,-1.25F, 1.75F, 2.5F, -2.75F, 3F, 2.25F, -1.75F, 2F, 1.25F, -2.25F, 0.75F, 1.25F, -1.25F, 0.75F, 5.25F, -2.75F, 0.75F, 3.75F, -0.25F, 0.75F, -0.75F, -1.25F, 0.75F, -0.75F); // Box 36
		bodyModel[36].setRotationPoint(-0.25F, -11.8F, 5.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 4, 8, 2, 0F,-0.25F, 3F, 2.25F, -1.75F, 3F, 1F, -1.75F, 2.25F, 0.5F, -1.25F, 2F, 1.25F, -0.25F, 0.75F, 3.75F, 0.5F, 0.75F, 2.5F, 0.5F, 0.75F, -1.75F, -2.75F, 0.75F, -0.75F); // Box 37
		bodyModel[37].setRotationPoint(6.75F, -11.8F, 5.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 10, 4, 0F,0.25F, 0.25F, 0F, 0.25F, 0.75F, 0.5F, 1.25F, -0.25F, 1.25F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 3F, 0.25F, -0.25F, 3.25F, 0.25F, -0.25F, -0.75F, 0.5F, -0.25F, -2F); // Box 38
		bodyModel[38].setRotationPoint(-1.25F, -12.8F, 3.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 10, 6, 11, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 39
		bodyModel[39].setRotationPoint(-0.25F, -8.5F, -5.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 3, 14, 0F,-0.25F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.5F, 0F, 1.75F, -0.25F, 0F, 1.75F, -0.25F, 1.3F, 2.5F, 0.25F, 1F, 2.5F, 0.25F, 1F, 2.5F, -0.25F, 1.3F, 2.5F); // Box 40
		bodyModel[40].setRotationPoint(34.25F, -8.8F, -7F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,-0.5F, 0F, -1.5F, -0.25F, 0F, 1.75F, -0.25F, 0F, 1.75F, -0.5F, 0F, -1.5F, 0.25F, 1.5F, -1.5F, -0.25F, 1.3F, 2.5F, -0.25F, 1.3F, 2.5F, 0.25F, 1.5F, -1.5F); // Box 41
		bodyModel[41].setRotationPoint(31.75F, -8.8F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 1, 3, 14, 0F,1F, 0F, 1.75F, 0.1F, 0F, -1.75F, 0.1F, 0F, -1.75F, 1F, 0F, 1.75F, 0.25F, 1F, 2.5F, 1.5F, 1.05F, -1F, 1.5F, 1.05F, -1F, 0.25F, 1F, 2.5F); // Box 42
		bodyModel[42].setRotationPoint(45.75F, -8.8F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 6, 8, 6, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Box 43
		bodyModel[43].setRotationPoint(32.75F, -16.3F, -3F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 5, 6, 9, 0F,0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, -2.5F, -1F, 0.2F, -2.5F, -1F, 0.2F, -2.5F, -1F, 0.2F, -2.5F, -1F); // Box 44
		bodyModel[44].setRotationPoint(32.75F, -19.8F, -4.5F);

		bodyModel[45].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[45].setRotationPoint(86.5F, -4F, 0F);
		bodyModel[45].rotateAngleX = -0.13962634F;
		bodyModel[45].rotateAngleY = 0.61086524F;
		bodyModel[45].rotateAngleZ = -0.19198622F;

		bodyModel[46].addShapeBox(-1F, 0F, -10F, 1, 1, 10, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 542
		bodyModel[46].setRotationPoint(86.5F, -4F, 0F);
		bodyModel[46].rotateAngleX = 0.13962634F;
		bodyModel[46].rotateAngleY = -0.61086524F;
		bodyModel[46].rotateAngleZ = -0.19198622F;

		bodyModel[47].addShapeBox(0F, 0F, 0F, 4, 6, 16, 0F,0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0.5F); // Box 47
		bodyModel[47].setRotationPoint(-35.5F, -8.3F, -8F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 6, 3, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 1.2F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(-36.5F, -9.3F, -1.5F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 12, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(-67.75F, -4.3F, -7F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 50
		bodyModel[50].setRotationPoint(-71.75F, -4.3F, -7F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F); // Box 51
		bodyModel[51].setRotationPoint(-55.75F, -4.3F, -7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0.1F, 0.25F, 0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 1.3F, 0F, 0.75F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 24
		bodyModel[52].setRotationPoint(6.5F, -5.05F, 8.75F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0.2F, 0.5F, -0.5F, 0.1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 1.3F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 25
		bodyModel[53].setRotationPoint(6.5F, -5.05F, 10.75F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0.25F, 0.75F, -0.4F, 0.25F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, 0.35F, -0.8F, 1.5F, 0.35F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 375
		bodyModel[54].setRotationPoint(-0.5F, -3.75F, 7.75F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,0.25F, -0.4F, 0.25F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0.25F, -0.5F, 0.35F, -0.8F, 0F, 0.6F, -0.75F, 0F, 0.6F, -0.75F, -0.5F, 0.35F, -0.8F); // Box 376
		bodyModel[55].setRotationPoint(3.5F, -3.75F, 7.75F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -0.4F, 0.5F, 0.75F, -0.4F, -1F, 0.75F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, 0.6F, -0.75F, -0.25F, 0.35F, -2.05F, -0.25F, 0.35F, -2.05F, 0F, 0.6F, -0.75F); // Box 377
		bodyModel[56].setRotationPoint(10.5F, -3.75F, 7.75F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 378
		bodyModel[57].setRotationPoint(1.5F, -5.05F, 8.75F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 385
		bodyModel[58].setRotationPoint(4.5F, -1.25F, 8.85F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 386
		bodyModel[59].setRotationPoint(10.5F, -1.25F, 8.85F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 3, 2, 5, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0.25F, 0.75F, -0.4F, 0.25F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, 0.35F, -0.8F, 1.5F, 0.35F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 60
		bodyModel[60].setRotationPoint(-0.5F, -3.75F, -12.75F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,0.25F, -0.4F, 0.25F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0.25F, -0.5F, 0.35F, -0.8F, 0F, 0.6F, -0.75F, 0F, 0.6F, -0.75F, -0.5F, 0.35F, -0.8F); // Box 61
		bodyModel[61].setRotationPoint(3.5F, -3.75F, -12.75F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -0.4F, 0.5F, 0.75F, -0.4F, -1F, 0.75F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, 0.6F, -0.75F, -0.25F, 0.35F, -2.05F, -0.25F, 0.35F, -2.05F, 0F, 0.6F, -0.75F); // Box 62
		bodyModel[62].setRotationPoint(10.5F, -3.75F, -12.75F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 63
		bodyModel[63].setRotationPoint(4.5F, -1.25F, -11.85F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 64
		bodyModel[64].setRotationPoint(10.5F, -1.25F, -11.85F);

		bodyModel[65].addShapeBox(-3F, 1.5F, -2.5F, 5, 2, 5, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 77
		bodyModel[65].setRotationPoint(79.25F, -5.5F, 0F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 6, 4, 9, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -5.75F, 0F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0.5F, 0F, -5.75F, 0F, 0F); // Box 79
		bodyModel[66].setRotationPoint(-115.5F, 4.3F, -4.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,-4F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -8F, 0F, -1.75F, 3.5F, 0F, -1F, 3.5F, 0.5F, 0F, -5.75F, 0F, 0F); // Box 80
		bodyModel[67].setRotationPoint(-115.5F, 4.3F, -9.5F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 6, 4, 5, 0F,-1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, -0.75F, -5.75F, 0F, 0F, 3.5F, 0.5F, 0F, 3.5F, 0F, -1F, -8F, 0F, -1.75F); // Box 81
		bodyModel[68].setRotationPoint(-115.5F, 4.3F, 4.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 34, 4, 5, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 2.25F, 0F, 0F, -0.5F, -3.5F, 0.5F, 0.5F, 0F, 4.25F, 0.5F, 0F, 4.25F, -2.25F, -3.5F, 0F, -1.5F); // Box 82
		bodyModel[69].setRotationPoint(-109.5F, 4.3F, 5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 27, 1, 9, 0F,4.75F, 0F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 4.75F, 0F, 0F, 3.5F, 0.5F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 3.5F, 0.5F, 0F); // Box 83
		bodyModel[70].setRotationPoint(-102.5F, 7.3F, -4.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 34, 4, 5, 0F,0F, 0F, -0.5F, 0F, 0F, 2.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3.5F, 0F, -1.5F, 0F, 4.25F, -2.25F, 0F, 4.25F, 0.5F, -3.5F, 0.5F, 0.5F); // Box 84
		bodyModel[71].setRotationPoint(-109.5F, 4.3F, -10F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[72].setRotationPoint(-91.2F, -1.7F, -2.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 3, 12, 3, 0F,-0.5F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 3.7F, 0.5F, 3F, 0.3F, 0.5F, 3F, 0.3F, 0.5F, 3F, 3.7F, 0.5F, 3F); // Box 85
		bodyModel[73].setRotationPoint(-26.5F, -15.5F, -1.5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 72, 8, 25, 0F,0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0.25F, -4.75F, 0F, 0.5F, -3.75F, 0F, 0.5F, -3.75F, 0F, 0.25F, -4.75F); // Box 86
		bodyModel[74].setRotationPoint(-75.5F, 4.3F, -12.5F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 38, 4, 25, 0F,0F, 0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 4.5F, -3.75F, 0F, 4.5F, -6.5F, 0F, 4.5F, -6.5F, 0F, 4.5F, -3.75F); // Box 87
		bodyModel[75].setRotationPoint(-3.5F, 4.3F, -12.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 26, 7, 25, 0F,0F, 0F, -1.75F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -1.75F, 0F, 1.5F, -6.5F, 0F, 1.25F, -8.5F, 0F, 1.25F, -8.5F, 0F, 1.5F, -6.5F); // Box 88
		bodyModel[76].setRotationPoint(34.5F, 4.3F, -12.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 18, 4, 25, 0F,0F, 0F, -4.25F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -4.25F, 0F, 4.25F, -8.5F, 0F, 4.25F, -10.25F, 0F, 4.25F, -10.25F, 0F, 4.25F, -8.5F); // Box 89
		bodyModel[77].setRotationPoint(60.5F, 4.3F, -12.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 17, 7, 18, 0F,0F, 0F, -4F, 0F, 0F, -7.25F, 0F, 0F, -7.25F, 0F, 0F, -4F, 0F, 1.25F, -6.75F, 0F, 2F, -8.5F, 0F, 2F, -8.5F, 0F, 1.25F, -6.75F); // Box 90
		bodyModel[78].setRotationPoint(78.5F, 4.3F, -9F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 10, 8, 10, 0F,0F, 0F, -3.25F, 0F, 0F, -4.75F, 0F, 0F, -4.75F, 0F, 0F, -3.25F, 0F, 1F, -4.5F, -7.75F, 1.25F, -4.75F, -7.75F, 1.25F, -4.75F, 0F, 1F, -4.5F); // Box 91
		bodyModel[79].setRotationPoint(95.5F, 4.3F, -5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 15, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Box 92
		bodyModel[80].setRotationPoint(51.25F, -7.5F, -7F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 3, 14, 0F,0F, 0F, -1.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, 0F, 0F, -1.5F); // Box 93
		bodyModel[81].setRotationPoint(66.25F, -7.5F, -7F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 94
		bodyModel[82].setRotationPoint(69.25F, -7.5F, -3F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 3, 3, 6, 0F,0F, 0F, 0.75F, 0F, -2.5F, -1F, 0F, -2.5F, -1F, 0F, 0F, 0.75F, 0F, -1F, 0.75F, 0F, 2F, -1F, 0F, 2F, -1F, 0F, -1F, 0.75F); // Box 95
		bodyModel[83].setRotationPoint(49.25F, -9.5F, -3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[84].setRotationPoint(45F, -10.8F, -1.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 1.5F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[85].setRotationPoint(45F, -13.8F, -1.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[86].setRotationPoint(46F, -15.8F, -0.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[87].setRotationPoint(45F, -16.8F, -1.5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 1F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.25F, 0F); // Box 100
		bodyModel[88].setRotationPoint(48F, -16.8F, -1.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[89].setRotationPoint(14.5F, -32F, -2F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 9, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 102
		bodyModel[90].setRotationPoint(5.5F, -32F, -1.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 6, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F); // Box 103
		bodyModel[91].setRotationPoint(17.5F, -31F, -1.5F);

		bodyModel[92].addShapeBox(-0.5F, 0F, -0.5F, 1, 31, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 104
		bodyModel[92].setRotationPoint(17.5F, -31.5F, -1.5F);
		bodyModel[92].rotateAngleX = -0.13962634F;
		bodyModel[92].rotateAngleZ = 0.13089969F;

		bodyModel[93].addShapeBox(-0.5F, 0F, -0.5F, 1, 31, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 105
		bodyModel[93].setRotationPoint(15F, -31.5F, -1.5F);
		bodyModel[93].rotateAngleX = -0.13962634F;
		bodyModel[93].rotateAngleZ = -0.1134464F;

		bodyModel[94].addShapeBox(-0.5F, 0F, -0.5F, 1, 31, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 106
		bodyModel[94].setRotationPoint(15F, -31.5F, 1.5F);
		bodyModel[94].rotateAngleX = 0.13962634F;
		bodyModel[94].rotateAngleZ = -0.1134464F;

		bodyModel[95].addShapeBox(-0.5F, 0F, -0.5F, 1, 31, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 107
		bodyModel[95].setRotationPoint(17.5F, -31.5F, 1.5F);
		bodyModel[95].rotateAngleX = 0.13962634F;
		bodyModel[95].rotateAngleZ = 0.13089969F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F); // Box 108
		bodyModel[96].setRotationPoint(16F, -31F, -11F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 109
		bodyModel[97].setRotationPoint(16F, -31F, 1F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 110
		bodyModel[98].setRotationPoint(14.5F, -27.5F, -2F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 111
		bodyModel[99].setRotationPoint(14F, -24F, -2.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 112
		bodyModel[100].setRotationPoint(13.5F, -19.5F, -3F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 113
		bodyModel[101].setRotationPoint(13F, -15F, -4F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 8, 1, 10, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 114
		bodyModel[102].setRotationPoint(12.5F, -10F, -5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 6, 9, 0F,0F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0.25F, -0.2F, 0.5F, 0F, -0.2F, 0.5F); // Box 115
		bodyModel[103].setRotationPoint(14.5F, -9F, -4.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 4, 6, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F); // Box 116
		bodyModel[104].setRotationPoint(15.5F, -14F, -7.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 4, 1, 17, 0F,0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, 0F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.5F, 0.2F, -0.5F, 0.5F); // Box 117
		bodyModel[105].setRotationPoint(15.5F, -14.5F, -8.5F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 118
		bodyModel[106].setRotationPoint(16.5F, -16.5F, -8.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 119
		bodyModel[107].setRotationPoint(16.5F, -16.5F, 6.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[108].setRotationPoint(17F, -17.6F, 5.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[109].setRotationPoint(17F, -17.6F, -9.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 6, 1, 4, 0F,0.25F, -0.2F, 0.25F, 0F, -0.2F, -1F, 0F, -0.2F, -1F, 0.25F, -0.2F, 0.25F, 0F, -0.2F, 0.25F, 0F, -0.45F, -1F, 0F, -0.45F, -1F, 0F, -0.2F, 0.25F); // Box 122
		bodyModel[110].setRotationPoint(18.5F, -26.5F, -2F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F, -0.2F, 0.2F, -0.2F); // Box 123
		bodyModel[111].setRotationPoint(20F, -28.5F, -1F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 124
		bodyModel[112].setRotationPoint(20.5F, -29.6F, -2F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 125
		bodyModel[113].setRotationPoint(14.75F, -39F, -1.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 3, 7, 3, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 126
		bodyModel[114].setRotationPoint(-5.25F, -31F, -1.5F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[115].setRotationPoint(-5.5F, -24F, -2F);

		bodyModel[116].addShapeBox(-0.5F, 0F, -0.5F, 1, 21, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 128
		bodyModel[116].setRotationPoint(-5F, -23.5F, 1.5F);
		bodyModel[116].rotateAngleX = 0.13962634F;
		bodyModel[116].rotateAngleZ = -0.1134464F;

		bodyModel[117].addShapeBox(-0.5F, 0F, -0.5F, 1, 21, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 129
		bodyModel[117].setRotationPoint(-2.5F, -23.5F, 1.5F);
		bodyModel[117].rotateAngleX = 0.13962634F;
		bodyModel[117].rotateAngleZ = 0.13089969F;

		bodyModel[118].addShapeBox(-0.5F, 0F, -0.5F, 1, 21, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 130
		bodyModel[118].setRotationPoint(-5F, -23.5F, -1.5F);
		bodyModel[118].rotateAngleX = -0.13962634F;
		bodyModel[118].rotateAngleZ = -0.1134464F;

		bodyModel[119].addShapeBox(-0.5F, 0F, -0.5F, 1, 21, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 131
		bodyModel[119].setRotationPoint(-2.5F, -23.5F, -1.5F);
		bodyModel[119].rotateAngleX = -0.13962634F;
		bodyModel[119].rotateAngleZ = 0.13089969F;

		bodyModel[120].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 132
		bodyModel[120].setRotationPoint(-5.5F, -19.5F, -2F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 133
		bodyModel[121].setRotationPoint(-6F, -16F, -2.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 134
		bodyModel[122].setRotationPoint(-6.5F, -11.5F, -3F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 7, 1, 8, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 135
		bodyModel[123].setRotationPoint(-7F, -7F, -4F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 136
		bodyModel[124].setRotationPoint(34.5F, -24F, -1F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F, 0.7F, 0F, 0.7F); // Box 137
		bodyModel[125].setRotationPoint(34.5F, -21.5F, -1F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 138
		bodyModel[126].setRotationPoint(34.5F, -25F, -1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 139
		bodyModel[127].setRotationPoint(34.5F, -27F, -1F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 140
		bodyModel[128].setRotationPoint(34.5F, -28F, -1F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[129].setRotationPoint(36F, -25.5F, -3F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F); // Box 142
		bodyModel[130].setRotationPoint(36F, -25.5F, -1F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[131].setRotationPoint(36F, -25.5F, 0F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 144
		bodyModel[132].setRotationPoint(36F, -25.5F, -0.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 145
		bodyModel[133].setRotationPoint(36F, -25F, 2F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 146
		bodyModel[134].setRotationPoint(36F, -26F, 2F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 147
		bodyModel[135].setRotationPoint(37.25F, -25.75F, 1.5F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 148
		bodyModel[136].setRotationPoint(38F, -25F, 2.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 149
		bodyModel[137].setRotationPoint(38F, -28F, 2.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F); // Box 150
		bodyModel[138].setRotationPoint(38F, -26F, 2.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F); // Box 151
		bodyModel[139].setRotationPoint(37.25F, -24.75F, -1.5F);
		bodyModel[139].rotateAngleX = 4.71238898F;

		bodyModel[140].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F); // Box 152
		bodyModel[140].setRotationPoint(38F, -23.5F, -2F);
		bodyModel[140].rotateAngleX = 1.57079633F;

		bodyModel[141].addShapeBox(0F, 0.5F, -0.5F, 1, 3, 1, 0F,0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 153
		bodyModel[141].setRotationPoint(38F, -23.5F, -2F);
		bodyModel[141].rotateAngleX = 1.57079633F;

		bodyModel[142].addShapeBox(0F, -2.5F, -0.5F, 1, 2, 1, 0F,-0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F); // Box 154
		bodyModel[142].setRotationPoint(38F, -23.5F, -2F);
		bodyModel[142].rotateAngleX = 1.57079633F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 155
		bodyModel[143].setRotationPoint(37F, -27.5F, -2.5F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 156
		bodyModel[144].setRotationPoint(36F, -26.2F, -2.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, -1F, -0.25F); // Box 157
		bodyModel[145].setRotationPoint(36.5F, -25.5F, -2.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[146].setRotationPoint(40.9F, -10.8F, -6.75F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[147].setRotationPoint(40.9F, -10.8F, 5.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[148].setRotationPoint(40F, -11.5F, 5.2F);
		bodyModel[148].rotateAngleZ = 0.15707963F;

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[149].setRotationPoint(40F, -11.5F, -7.2F);
		bodyModel[149].rotateAngleZ = 0.15707963F;

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 163
		bodyModel[150].setRotationPoint(114F, -14.5F, -0.5F);

		bodyModel[151].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 100.5F, -0.4F, -0.4F, 100.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 100.75F, -0.4F, -0.4F, 100.75F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 164
		bodyModel[151].setRotationPoint(16.25F, -35F, 0F);
		bodyModel[151].rotateAngleZ = -0.2443461F;

		bodyModel[152].addShapeBox(0F, 0F, 0F, 9, 4, 2, 0F,0F, 0F, -0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -3.75F, -0.5F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, -3.75F, -0.5F); // Box 165
		bodyModel[152].setRotationPoint(5.5F, -31.5F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 4, 5, 13, 0F,0.2F, 0F, -1F, 0.45F, 0F, -1F, 0.45F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, -2F, -1F, 0.45F, -2F, -1F, 0.45F, -2F, -1F, 0.2F, -2F, -1F); // Box 166
		bodyModel[153].setRotationPoint(29F, -18.5F, -6.5F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 6, 13, 0F,0.2F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, -1F, 0.2F, 0F, -1F, 0.2F, -1.5F, -1F, 1F, -1.5F, -1F, 1F, -1.5F, -1F, 0.2F, -1.5F, -1F); // Box 167
		bodyModel[154].setRotationPoint(33.65F, -17F, -6.5F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 4, 11, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -3F, 0F, 0.5F, -3F, 0F, 0.5F, 0F); // Box 168
		bodyModel[155].setRotationPoint(35.65F, -17F, -5.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 2, 16, 0F,0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F); // Box 169
		bodyModel[156].setRotationPoint(34.65F, -14.5F, -8F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 2, 2, 16, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 170
		bodyModel[157].setRotationPoint(32.65F, -14.5F, -8F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 2, 11, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F); // Box 171
		bodyModel[158].setRotationPoint(29.4F, -14.5F, -5.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 172
		bodyModel[159].setRotationPoint(-35F, -12.8F, -0.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 173
		bodyModel[160].setRotationPoint(-36F, -13.5F, -1.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,0F, 1F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0.5F, 0F, 0.5F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0.5F); // Box 174
		bodyModel[161].setRotationPoint(-37F, -13.5F, -1.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, -0.5F, -0.05F, -0.3F, -0.5F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, 0F, -0.3F, -0.3F); // Box 175
		bodyModel[162].setRotationPoint(37F, -28F, -2.5F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 176
		bodyModel[163].setRotationPoint(37.2F, -27.6F, -2.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 177
		bodyModel[164].setRotationPoint(37.2F, -27.6F, -3.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F); // Box 178
		bodyModel[165].setRotationPoint(37.2F, -27.6F, -1.5F);

		bodyModel[166].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 179
		bodyModel[166].setRotationPoint(37.2F, -26F, -3.75F);
		bodyModel[166].rotateAngleX = 1.57079633F;

		bodyModel[167].addShapeBox(0F, -0.5F, -1.5F, 1, 1, 1, 0F,-0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 180
		bodyModel[167].setRotationPoint(37.2F, -26F, -3.75F);
		bodyModel[167].rotateAngleX = 1.57079633F;

		bodyModel[168].addShapeBox(0F, -0.5F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F); // Box 181
		bodyModel[168].setRotationPoint(37.2F, -26F, -3.75F);
		bodyModel[168].rotateAngleX = 1.57079633F;

		bodyModel[169].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.3F, -0.3F, -0.5F, -0.05F, -0.3F, -0.5F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.8F, -0.3F, 0F, -0.3F, -0.3F); // Box 182
		bodyModel[169].setRotationPoint(37F, -25.5F, -4.5F);
		bodyModel[169].rotateAngleX = 1.57079633F;

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 183
		bodyModel[170].setRotationPoint(37F, -25.5F, -4F);
		bodyModel[170].rotateAngleX = 1.57079633F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 4, 6, 12, 0F,0.2F, 0F, -1F, -3.3F, 0F, -2F, -3.3F, 0F, -5F, 0.2F, 0F, -4F, 0.2F, -2.5F, -1F, -3.3F, -2.5F, -2F, -3.3F, -2.5F, -5F, 0.2F, -2.5F, -4F); // Box 184
		bodyModel[171].setRotationPoint(38.15F, -19.8F, -4.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 185
		bodyModel[172].setRotationPoint(35.65F, -14.8F, -5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.3F, 0F, 0.5F, -0.3F, -1F, 0.5F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, -1F, 0.5F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 186
		bodyModel[173].setRotationPoint(38.65F, -14.8F, -5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[174].setRotationPoint(37.2F, -14.3F, -4.4F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 188
		bodyModel[175].setRotationPoint(35.65F, -14.8F, 1F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.3F, 0F, 0.5F, -0.3F, -1F, 0.5F, -0.3F, -1F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.5F, -0.3F, -1F, 0.5F, -0.3F, -1F, 0F, -0.3F, 0F); // Box 189
		bodyModel[176].setRotationPoint(38.65F, -14.8F, 1F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 190
		bodyModel[177].setRotationPoint(37.2F, -14.3F, 3.4F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 1F, -0.4F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 1F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.4F); // Box 191
		bodyModel[178].setRotationPoint(8.8F, -41F, -0.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.4F, -1F, 0.1F, -0.4F, 2.25F, 0.1F, -0.25F, 2.25F, 0.1F, -0.25F, -1F, 0.1F, -0.4F); // Box 192
		bodyModel[179].setRotationPoint(8.8F, -36F, -0.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 193
		bodyModel[180].setRotationPoint(8.8F, -44F, -0.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F); // Box 194
		bodyModel[181].setRotationPoint(31.5F, -25.5F, -1F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 195
		bodyModel[182].setRotationPoint(31F, -28F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 196
		bodyModel[183].setRotationPoint(28.75F, -20.25F, -1.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1.25F); // Box 197
		bodyModel[184].setRotationPoint(27.75F, -20.25F, -1.5F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 198
		bodyModel[185].setRotationPoint(38.75F, -20.25F, -1.5F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -0.75F, 0F); // Box 199
		bodyModel[186].setRotationPoint(41.75F, -20.25F, -1.5F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F); // Box 200
		bodyModel[187].setRotationPoint(41.75F, -26.25F, -0.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F, -0.45F, 0.1F, -0.45F); // Box 201
		bodyModel[188].setRotationPoint(27.75F, -30.25F, -0.5F);

		bodyModel[189].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 202
		bodyModel[189].setRotationPoint(16.5F, -31F, -10.5F);
		bodyModel[189].rotateAngleY = 0.40142573F;
		bodyModel[189].rotateAngleZ = -0.89011792F;

		bodyModel[190].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 203
		bodyModel[190].setRotationPoint(16.5F, -31F, -8.5F);
		bodyModel[190].rotateAngleY = 0.33161256F;
		bodyModel[190].rotateAngleZ = -0.89011792F;

		bodyModel[191].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 204
		bodyModel[191].setRotationPoint(16.5F, -31F, 10.5F);
		bodyModel[191].rotateAngleY = -0.40142573F;
		bodyModel[191].rotateAngleZ = -0.89011792F;

		bodyModel[192].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 22F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 205
		bodyModel[192].setRotationPoint(16.5F, -31F, 8.5F);
		bodyModel[192].rotateAngleY = -0.33161256F;
		bodyModel[192].rotateAngleZ = -0.89011792F;

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 206
		bodyModel[193].setRotationPoint(-117.5F, -9.5F, -0.5F);
		bodyModel[193].rotateAngleZ = 0.13962634F;

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F); // Box 207
		bodyModel[194].setRotationPoint(-28F, -21.5F, -3.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 208
		bodyModel[195].setRotationPoint(-28F, -23.5F, -3.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 209
		bodyModel[196].setRotationPoint(-28F, -20.5F, -3.5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 210
		bodyModel[197].setRotationPoint(-26F, -21.5F, -4F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, -0.5F, 0F); // Box 211
		bodyModel[198].setRotationPoint(-26F, -20.5F, -4F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 212
		bodyModel[199].setRotationPoint(-25.5F, -19.5F, -1F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 213
		bodyModel[200].setRotationPoint(-25.5F, -17F, -1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 214
		bodyModel[201].setRotationPoint(-25.5F, -20.5F, -1F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F, -0.05F, 0F, -0.05F); // Box 215
		bodyModel[202].setRotationPoint(-25.5F, -22.5F, -1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0F); // Box 216
		bodyModel[203].setRotationPoint(-24.5F, -21F, -1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 5, 2, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.9F); // Box 217
		bodyModel[204].setRotationPoint(-23F, -23.5F, -1F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.8F, -0.25F, -0.8F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 218
		bodyModel[205].setRotationPoint(-25.5F, -23.5F, -1F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 219
		bodyModel[206].setRotationPoint(-28.75F, -21.25F, -2.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[207].setRotationPoint(-26F, -21F, -3F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 221
		bodyModel[208].setRotationPoint(-26F, -21F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F); // Box 222
		bodyModel[209].setRotationPoint(-26F, -21F, -0.5F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, -0.5F, 0.5F, 0.5F, -0.5F); // Box 223
		bodyModel[210].setRotationPoint(-26F, -21F, -1F);

		bodyModel[211].addShapeBox(0F, 0.5F, -0.5F, 1, 3, 1, 0F,-1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 224
		bodyModel[211].setRotationPoint(-28F, -19F, 1.5F);
		bodyModel[211].rotateAngleX = 1.57079633F;

		bodyModel[212].addShapeBox(0F, -0.5F, -0.5F, 1, 2, 1, 0F,-1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F, -1F, -1F, 0.25F, 0.75F, -1F, 0.25F, 0.75F, -1F, 0.25F, -1F, -1F, 0.25F); // Box 225
		bodyModel[212].setRotationPoint(-28F, -19F, 1.5F);
		bodyModel[212].rotateAngleX = 1.57079633F;

		bodyModel[213].addShapeBox(0F, -2.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0F, 0.25F, -1F, 0F, 0.25F); // Box 226
		bodyModel[213].setRotationPoint(-28F, -19F, 1.5F);
		bodyModel[213].rotateAngleX = 1.57079633F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F); // Box 227
		bodyModel[214].setRotationPoint(-28.75F, -20.25F, 2.5F);
		bodyModel[214].rotateAngleX = 4.71238898F;

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 228
		bodyModel[215].setRotationPoint(-27F, -23F, 1.5F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 229
		bodyModel[216].setRotationPoint(-27.2F, -23.1F, 1.5F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 230
		bodyModel[217].setRotationPoint(-27.2F, -23.1F, 2.5F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 231
		bodyModel[218].setRotationPoint(-27.2F, -23.1F, 0.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.05F, -0.3F, -0.5F, -0.8F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.8F, -0.3F); // Box 232
		bodyModel[219].setRotationPoint(-29F, -23.5F, 1.5F);

		bodyModel[220].addShapeBox(0F, -0.5F, -0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 233
		bodyModel[220].setRotationPoint(-27.2F, -21.5F, 3.75F);
		bodyModel[220].rotateAngleX = 1.57079633F;

		bodyModel[221].addShapeBox(0F, -0.5F, 0.5F, 1, 1, 1, 0F,-0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.75F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 234
		bodyModel[221].setRotationPoint(-27.2F, -21.5F, 3.75F);
		bodyModel[221].rotateAngleX = 1.57079633F;

		bodyModel[222].addShapeBox(0F, -0.5F, -1.5F, 1, 1, 1, 0F,0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, 0F, -0.3F, 0F, -0.75F, -0.3F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F); // Box 235
		bodyModel[222].setRotationPoint(-27.2F, -21.5F, 3.75F);
		bodyModel[222].rotateAngleX = 1.57079633F;

		bodyModel[223].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F); // Box 236
		bodyModel[223].setRotationPoint(-27F, -21F, 2F);
		bodyModel[223].rotateAngleX = 1.57079633F;

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.5F, -0.8F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.8F, -0.3F, -0.5F, -0.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, -0.5F, -0.05F, -0.3F); // Box 237
		bodyModel[224].setRotationPoint(-29F, -21F, 3.5F);
		bodyModel[224].rotateAngleX = 1.57079633F;

		bodyModel[225].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 240
		bodyModel[225].setRotationPoint(-27.25F, -15.75F, -1F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[226].setRotationPoint(-27.25F, -15.75F, -3F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F); // Box 243
		bodyModel[227].setRotationPoint(-27.25F, -15.75F, 1F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 244
		bodyModel[228].setRotationPoint(-29.75F, -15.75F, -1F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 6, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F); // Box 245
		bodyModel[229].setRotationPoint(-23.75F, -15F, -0.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 246
		bodyModel[230].setRotationPoint(-27.75F, -14.75F, -1F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F); // Box 247
		bodyModel[231].setRotationPoint(-29F, -14.75F, -0.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.25F, 2.25F, 0.1F, -0.25F, -1F, 0.1F, -0.4F, -1F, 0.1F, -0.4F, 2.25F, 0.1F, -0.25F); // Box 248
		bodyModel[232].setRotationPoint(-17.2F, -19.5F, -0.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, -0.5F, -0.25F, 0F, 1F, -0.4F, 0F, 1F, -0.4F, 0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.25F); // Box 249
		bodyModel[233].setRotationPoint(-17.2F, -24.5F, -0.5F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F, -0.8F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -0.8F, 0F, -0.4F); // Box 250
		bodyModel[234].setRotationPoint(-17.2F, -27.5F, -0.5F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F); // Box 247
		bodyModel[235].setRotationPoint(-5.5F, -25F, -2F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,1.25F, -0.2F, -0.5F, -4.25F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, 1.25F, -0.2F, -0.5F, -4.25F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F); // Box 248
		bodyModel[236].setRotationPoint(-5.5F, -25F, -7F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,-0.25F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -4.25F, -0.2F, -0.5F, 1.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -4.25F, -0.2F, -0.5F, 1.25F, -0.2F, -0.5F); // Box 249
		bodyModel[237].setRotationPoint(-5.5F, -25F, 1F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.25F, -0.2F, -0.25F, -0.75F, -0.2F, -0.25F, -0.75F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.75F, -0.2F, -0.25F, -0.75F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F); // Box 250
		bodyModel[238].setRotationPoint(-5.5F, -21.5F, -2F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,1.75F, -0.2F, 0.25F, -4.25F, -0.2F, -0.25F, -0.75F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, 1.75F, -0.2F, 0.25F, -4.25F, -0.2F, -0.25F, -0.75F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F); // Box 251
		bodyModel[239].setRotationPoint(-5.5F, -21.5F, -8.25F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 4, 1, 7, 0F,-0.25F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -4.25F, -0.2F, -0.25F, 1.75F, -0.2F, 0.25F, -0.25F, -0.2F, -0.5F, -0.75F, -0.2F, -0.5F, -4.25F, -0.2F, -0.25F, 1.75F, -0.2F, 0.25F); // Box 252
		bodyModel[240].setRotationPoint(-5.5F, -21.5F, 1.25F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 253
		bodyModel[241].setRotationPoint(-4.25F, -24.5F, -2F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,1.95F, 0F, 0F, -2.55F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 1.95F, -0.5F, 0F, -2.55F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F); // Box 254
		bodyModel[242].setRotationPoint(-4.25F, -24.5F, -6F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, -2.55F, 0F, 0F, 1.95F, 0F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, -2.55F, -0.5F, 0F, 1.95F, -0.5F, 0F); // Box 255
		bodyModel[243].setRotationPoint(-4.25F, -24.5F, 2F);

		bodyModel[244].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,111.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 111.5F, -0.3F, -0.3F, 112F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 112F, -0.3F, -0.3F); // Box 256
		bodyModel[244].setRotationPoint(-6F, -24.5F, 5.5F);
		bodyModel[244].rotateAngleY = 0.04974188F;
		bodyModel[244].rotateAngleZ = 0.18325957F;

		bodyModel[245].addShapeBox(-0.5F, -0.5F, -0.5F, 1, 1, 1, 0F,111.5F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 111.5F, -0.3F, -0.3F, 112F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 112F, -0.3F, -0.3F); // Box 257
		bodyModel[245].setRotationPoint(-6F, -24.5F, -5.5F);
		bodyModel[245].rotateAngleY = -0.04974188F;
		bodyModel[245].rotateAngleZ = 0.18325957F;

		bodyModel[246].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 258
		bodyModel[246].setRotationPoint(58.75F, -9F, -1.5F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 265
		bodyModel[247].setRotationPoint(-64F, -5.75F, -1.5F);

		bodyModel[248].addShapeBox(-3F, 1.5F, -2.5F, 5, 2, 5, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 266
		bodyModel[248].setRotationPoint(-80.25F, -2.5F, 0F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 294
		bodyModel[249].setRotationPoint(-47F, -1.25F, 9.35F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 295
		bodyModel[250].setRotationPoint(-43F, -1.25F, 9.35F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.4F, 0.5F, 0.75F, -0.4F, -1F, 0.75F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, 0.6F, -0.75F, -0.25F, 0.35F, -1.2F, -0.25F, 0.35F, -1.2F, 0F, 0.6F, -0.75F); // Box 296
		bodyModel[251].setRotationPoint(-42F, -2.75F, 8.95F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0.25F, -0.4F, 0.25F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0.25F, -0.5F, 0.35F, -0.8F, 0F, 0.6F, -0.75F, 0F, 0.6F, -0.75F, -0.5F, 0.35F, -0.8F); // Box 297
		bodyModel[252].setRotationPoint(-47F, -2.75F, 8.95F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0.25F, 0.75F, -0.4F, 0.25F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, 0.35F, -0.8F, 1.5F, 0.35F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 298
		bodyModel[253].setRotationPoint(-51F, -2.75F, 8.95F);

		bodyModel[254].addShapeBox(-2F, 1.5F, -2F, 4, 2, 4, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 309
		bodyModel[254].setRotationPoint(-15F, -6.5F, 0F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 14, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[255].setRotationPoint(-110.5F, 0.25F, -7.5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 1, 15, 0F,0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F); // Box 311
		bodyModel[256].setRotationPoint(-113.5F, 0.25F, -7.5F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 2, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F); // Box 312
		bodyModel[257].setRotationPoint(-96.5F, 0.25F, -7.5F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 89, 177, textureX, textureY); // Box 29
		turretModel[1] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 30
		turretModel[2] = new ModelRendererTurbo(this, 113, 177, textureX, textureY); // Box 31
		turretModel[3] = new ModelRendererTurbo(this, 233, 177, textureX, textureY); // Box 32
		turretModel[4] = new ModelRendererTurbo(this, 129, 177, textureX, textureY); // Box 33
		turretModel[5] = new ModelRendererTurbo(this, 257, 177, textureX, textureY); // Box 34
		turretModel[6] = new ModelRendererTurbo(this, 305, 177, textureX, textureY); // Box 305
		turretModel[7] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 306
		turretModel[8] = new ModelRendererTurbo(this, 345, 177, textureX, textureY); // Box 307
		turretModel[9] = new ModelRendererTurbo(this, 369, 177, textureX, textureY); // Box 308

		turretModel[0].addShapeBox(-7F, -0.5F, -0.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		turretModel[0].setRotationPoint(-15F, -5F, 0F);

		turretModel[1].addShapeBox(1F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 30
		turretModel[1].setRotationPoint(-15F, -5F, 0F);

		turretModel[2].addShapeBox(1F, -0.5F, 1F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 31
		turretModel[2].setRotationPoint(-15F, -5F, 0F);

		turretModel[3].addShapeBox(-7F, -0.5F, 1F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		turretModel[3].setRotationPoint(-15F, -5F, 0F);

		turretModel[4].addShapeBox(1F, -0.5F, -2F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 33
		turretModel[4].setRotationPoint(-15F, -5F, 0F);

		turretModel[5].addShapeBox(-7F, -0.5F, -2F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		turretModel[5].setRotationPoint(-15F, -5F, 0F);

		turretModel[6].addShapeBox(-7F, -0.5F, 2.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 305
		turretModel[6].setRotationPoint(-15F, -5F, 0F);

		turretModel[7].addShapeBox(1F, -0.5F, 2.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 306
		turretModel[7].setRotationPoint(-15F, -5F, 0F);

		turretModel[8].addShapeBox(-7F, -0.5F, -3.5F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 307
		turretModel[8].setRotationPoint(-15F, -5F, 0F);

		turretModel[9].addShapeBox(1F, -0.5F, -3.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0F, 0F); // Box 308
		turretModel[9].setRotationPoint(-15F, -5F, 0F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[10];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 17
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 18
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 19
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 20
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 21
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 22
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 23
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 24
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 25
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 26

		gun_2_Model[0][0].addShapeBox(2F, -0.5F, 1F, 2, 3, 2, 0F,0F, 0.5F, 0F, -0.5F, -2F, 0F, -1F, -1.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0F, 0.25F, 0.5F); // Box 17

		gun_2_Model[0][1].addShapeBox(0F, -2.5F, 1F, 2, 4, 2, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 18

		gun_2_Model[0][2].addShapeBox(-3F, -2.5F, 1.5F, 3, 4, 2, 0F,0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 19

		gun_2_Model[0][3].addShapeBox(-3F, -2.5F, -3F, 3, 4, 2, 0F,0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 20

		gun_2_Model[0][4].addShapeBox(0F, -2.5F, -3F, 2, 4, 2, 0F,0F, -0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		gun_2_Model[0][5].addShapeBox(2F, -0.5F, -3F, 2, 3, 2, 0F,0F, 0.5F, 0.5F, -1F, -1.5F, -0.5F, -0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 22

		gun_2_Model[0][6].addShapeBox(2F, 1.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 23

		gun_2_Model[0][7].addShapeBox(-3F, -1.5F, -1F, 3, 3, 2, 0F,0.5F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0.5F, 0F, 0F); // Box 24

		gun_2_Model[0][8].addShapeBox(-3F, 1.5F, -3.5F, 5, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 25

		gun_2_Model[0][9].addShapeBox(-4.5F, -2.5F, -3.5F, 1, 5, 7, 0F,0F, -1F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F); // Box 26

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(79.3F, -6.5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 15
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 16

		gun_2_Model[1][0].addShapeBox(-3F, -0.5F, 0F, 10, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 15

		gun_2_Model[1][1].addShapeBox(-3F, -0.5F, -1F, 10, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 16

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(79.3F, -6.5F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("AK726Front", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[10];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 425, 9, textureX, textureY); // Box 17
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 18
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 19
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 20
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 21
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 22
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 23
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 24
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 289, 81, textureX, textureY); // Box 25
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 321, 81, textureX, textureY); // Box 26

		gun_3_Model[0][0].addShapeBox(2F, -0.5F, 1F, 2, 3, 2, 0F,0F, 0.5F, 0F, -0.5F, -2F, 0F, -1F, -1.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -1F, 0.25F, -0.5F, 0F, 0.25F, 0.5F); // Box 17

		gun_3_Model[0][1].addShapeBox(0F, -2.5F, 1F, 2, 4, 2, 0F,0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 18

		gun_3_Model[0][2].addShapeBox(-3F, -2.5F, 1.5F, 3, 4, 2, 0F,0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 19

		gun_3_Model[0][3].addShapeBox(-3F, -2.5F, -3F, 3, 4, 2, 0F,0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 20

		gun_3_Model[0][4].addShapeBox(0F, -2.5F, -3F, 2, 4, 2, 0F,0F, -0.5F, 0.5F, 0F, -1.5F, 0.5F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21

		gun_3_Model[0][5].addShapeBox(2F, -0.5F, -3F, 2, 3, 2, 0F,0F, 0.5F, 0.5F, -1F, -1.5F, -0.5F, -0.5F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0.5F, -1F, 0.25F, -0.5F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 22

		gun_3_Model[0][6].addShapeBox(2F, 1.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 23

		gun_3_Model[0][7].addShapeBox(-3F, -1.5F, -1F, 3, 3, 2, 0F,0.5F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 0.5F, 0F, 0F); // Box 24

		gun_3_Model[0][8].addShapeBox(-3F, 1.5F, -3.5F, 5, 1, 7, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.25F, 0F); // Box 25

		gun_3_Model[0][9].addShapeBox(-4.5F, -2.5F, -3.5F, 1, 5, 7, 0F,0F, -1F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -1F, 0F, 0.25F, -1F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -1F); // Box 26

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-81F, -3.5F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 15
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 481, 57, textureX, textureY); // Box 16

		gun_3_Model[1][0].addShapeBox(-3F, -0.5F, 0F, 10, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 15

		gun_3_Model[1][1].addShapeBox(-3F, -0.5F, -1F, 10, 1, 1, 0F,0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F); // Box 16

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-81F, -3.5F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("AK726Rear", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[11];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 259
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 260
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 261
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 262
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 263
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 264
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 267
		gun_4_Model[0][7] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 268
		gun_4_Model[0][8] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 269
		gun_4_Model[0][9] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 270
		gun_4_Model[0][10] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 271

		gun_4_Model[0][0].addShapeBox(-4F, 3.5F, -0.5F, 3, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F); // Box 259

		gun_4_Model[0][1].addShapeBox(-1F, 3.5F, -0.5F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 260

		gun_4_Model[0][2].addShapeBox(-4F, 3F, -1F, 3, 1, 2, 0F,-0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 261

		gun_4_Model[0][3].addShapeBox(-4F, 2F, -1F, 3, 1, 2, 0F,-0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 262

		gun_4_Model[0][4].addShapeBox(-4F, 1F, -1F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 263

		gun_4_Model[0][5].addShapeBox(-4F, 0.5F, -1F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 264

		gun_4_Model[0][6].addShapeBox(-1F, 1F, -0.5F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 267

		gun_4_Model[0][7].addShapeBox(1F, 1F, -0.5F, 2, 2, 1, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 268

		gun_4_Model[0][8].addShapeBox(1F, -0.5F, -0.5F, 2, 2, 1, 0F,0F, -0.4F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 269

		gun_4_Model[0][9].addShapeBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F,-1.1F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.1F, -0.75F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.7F, -0.25F, 0F); // Box 270

		gun_4_Model[0][10].addShapeBox(0.75F, -0.5F, -4F, 1, 1, 8, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 271

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(60.3F, -13.9F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[32];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 276
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 277
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 279
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 280
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 282
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 283
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 284
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 285
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 286
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 287
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 288
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 289
		gun_4_Model[1][12] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 290
		gun_4_Model[1][13] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 291
		gun_4_Model[1][14] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 292
		gun_4_Model[1][15] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 293
		gun_4_Model[1][16] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 43
		gun_4_Model[1][17] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 44
		gun_4_Model[1][18] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 45
		gun_4_Model[1][19] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 46
		gun_4_Model[1][20] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 47
		gun_4_Model[1][21] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 48
		gun_4_Model[1][22] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 49
		gun_4_Model[1][23] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 50
		gun_4_Model[1][24] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 51
		gun_4_Model[1][25] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 52
		gun_4_Model[1][26] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 53
		gun_4_Model[1][27] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 54
		gun_4_Model[1][28] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 55
		gun_4_Model[1][29] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 56
		gun_4_Model[1][30] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 57
		gun_4_Model[1][31] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 58

		gun_4_Model[1][0].addShapeBox(-2.25F, 1F, -3.75F, 3, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 276

		gun_4_Model[1][1].addShapeBox(1F, 1F, -3.75F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F); // Box 277

		gun_4_Model[1][2].addShapeBox(10F, 1F, -3.75F, 2, 1, 1, 0F,0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F); // Box 279

		gun_4_Model[1][3].addShapeBox(8F, 1F, -3.75F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F); // Box 280

		gun_4_Model[1][4].addShapeBox(-2.25F, 0F, -2.75F, 2, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // Box 282

		gun_4_Model[1][5].addShapeBox(-2.25F, 0F, -4.75F, 2, 3, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 2.1F, 0F, 0F, 2.1F); // Box 283

		gun_4_Model[1][6].addShapeBox(2F, 0.5F, -4.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F); // Box 284

		gun_4_Model[1][7].addShapeBox(2.5F, 0.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F); // Box 285

		gun_4_Model[1][8].addShapeBox(2.5F, 1.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 286

		gun_4_Model[1][9].addShapeBox(2F, 0.5F, -2.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F); // Box 287

		gun_4_Model[1][10].addShapeBox(2.5F, 0.5F, -2.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 288

		gun_4_Model[1][11].addShapeBox(2.5F, 1.5F, -2.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 289

		gun_4_Model[1][12].addShapeBox(9.5F, 0.5F, -4.75F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F); // Box 290

		gun_4_Model[1][13].addShapeBox(9.5F, 1.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F, -0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 291

		gun_4_Model[1][14].addShapeBox(9.5F, 1.5F, -2.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F); // Box 292

		gun_4_Model[1][15].addShapeBox(9.5F, 0.5F, -2.75F, 1, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F, -0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 293

		gun_4_Model[1][16].addShapeBox(-2.25F, 1F, 2.75F, 3, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 43

		gun_4_Model[1][17].addShapeBox(1F, 1F, 2.75F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F); // Box 44

		gun_4_Model[1][18].addShapeBox(10F, 1F, 2.75F, 2, 1, 1, 0F,0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F); // Box 45

		gun_4_Model[1][19].addShapeBox(8F, 1F, 2.75F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F); // Box 46

		gun_4_Model[1][20].addShapeBox(-2.25F, 0F, 3.75F, 2, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // Box 47

		gun_4_Model[1][21].addShapeBox(-2.25F, 0F, 1.75F, 2, 3, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 2.1F, 0F, 0F, 2.1F); // Box 48

		gun_4_Model[1][22].addShapeBox(2F, 0.5F, 1.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F); // Box 49

		gun_4_Model[1][23].addShapeBox(2.5F, 0.5F, 1.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F); // Box 50

		gun_4_Model[1][24].addShapeBox(2.5F, 1.5F, 1.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 51

		gun_4_Model[1][25].addShapeBox(2F, 0.5F, 3.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F); // Box 52

		gun_4_Model[1][26].addShapeBox(2.5F, 0.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 53

		gun_4_Model[1][27].addShapeBox(2.5F, 1.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 54

		gun_4_Model[1][28].addShapeBox(9.5F, 0.5F, 1.75F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F); // Box 55

		gun_4_Model[1][29].addShapeBox(9.5F, 1.5F, 1.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F, -0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 56

		gun_4_Model[1][30].addShapeBox(9.5F, 1.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F); // Box 57

		gun_4_Model[1][31].addShapeBox(9.5F, 0.5F, 3.75F, 1, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F, -0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 58

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(60.3F, -13.9F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[4];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 272
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 273
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 274
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 275

		gun_4_Model[2][0].addShapeBox(0.75F, 0F, -3.75F, 5, 1, 1, 0F,-0.1F, 0.4F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F); // Box 272

		gun_4_Model[2][1].addShapeBox(-2.25F, 0F, -3.75F, 3, 1, 1, 0F,0.15F, -0.1F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F); // Box 273

		gun_4_Model[2][2].addShapeBox(-2.25F, 0F, 2.75F, 3, 1, 1, 0F,0.15F, -0.1F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F); // Box 274

		gun_4_Model[2][3].addShapeBox(0.75F, 0F, 2.75F, 5, 1, 1, 0F,-0.1F, 0.4F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F); // Box 275

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(60.3F, -13.9F, 0F);
		}


		registerGunModel("VolnaFront", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[11];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 259
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 260
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 261
		gun_5_Model[0][3] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 262
		gun_5_Model[0][4] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 263
		gun_5_Model[0][5] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 264
		gun_5_Model[0][6] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 267
		gun_5_Model[0][7] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 268
		gun_5_Model[0][8] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 269
		gun_5_Model[0][9] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 270
		gun_5_Model[0][10] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 271

		gun_5_Model[0][0].addShapeBox(-4F, 3.5F, -0.5F, 3, 2, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F); // Box 259

		gun_5_Model[0][1].addShapeBox(-1F, 3.5F, -0.5F, 1, 2, 1, 0F,0F, 0.25F, 0F, 0.5F, -0.25F, 0F, 0.5F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 260

		gun_5_Model[0][2].addShapeBox(-4F, 3F, -1F, 3, 1, 2, 0F,-0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, 0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 261

		gun_5_Model[0][3].addShapeBox(-4F, 2F, -1F, 3, 1, 2, 0F,-0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 262

		gun_5_Model[0][4].addShapeBox(-4F, 1F, -1F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, -0.25F, 0F, 0.25F); // Box 263

		gun_5_Model[0][5].addShapeBox(-4F, 0.5F, -1F, 3, 1, 2, 0F,-0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, 0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.75F, -0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 264

		gun_5_Model[0][6].addShapeBox(-1F, 1F, -0.5F, 2, 2, 1, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 267

		gun_5_Model[0][7].addShapeBox(1F, 1F, -0.5F, 2, 2, 1, 0F,0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 268

		gun_5_Model[0][8].addShapeBox(1F, -0.5F, -0.5F, 2, 2, 1, 0F,0F, -0.4F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 269

		gun_5_Model[0][9].addShapeBox(-1F, -0.5F, -0.5F, 2, 2, 1, 0F,-1.1F, -0.75F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.1F, -0.75F, 0F, -0.7F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.7F, -0.25F, 0F); // Box 270

		gun_5_Model[0][10].addShapeBox(0.75F, -0.5F, -4F, 1, 1, 8, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 271

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-62.5F, -10.5F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[32];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 276
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 277
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 279
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 280
		gun_5_Model[1][4] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 282
		gun_5_Model[1][5] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 283
		gun_5_Model[1][6] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 284
		gun_5_Model[1][7] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 285
		gun_5_Model[1][8] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 286
		gun_5_Model[1][9] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 287
		gun_5_Model[1][10] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 288
		gun_5_Model[1][11] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 289
		gun_5_Model[1][12] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 290
		gun_5_Model[1][13] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 291
		gun_5_Model[1][14] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 292
		gun_5_Model[1][15] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 293
		gun_5_Model[1][16] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 43
		gun_5_Model[1][17] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 44
		gun_5_Model[1][18] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 45
		gun_5_Model[1][19] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 46
		gun_5_Model[1][20] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 47
		gun_5_Model[1][21] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 48
		gun_5_Model[1][22] = new ModelRendererTurbo(this, 433, 169, textureX, textureY); // Box 49
		gun_5_Model[1][23] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 50
		gun_5_Model[1][24] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 51
		gun_5_Model[1][25] = new ModelRendererTurbo(this, 457, 169, textureX, textureY); // Box 52
		gun_5_Model[1][26] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 53
		gun_5_Model[1][27] = new ModelRendererTurbo(this, 473, 169, textureX, textureY); // Box 54
		gun_5_Model[1][28] = new ModelRendererTurbo(this, 481, 169, textureX, textureY); // Box 55
		gun_5_Model[1][29] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 56
		gun_5_Model[1][30] = new ModelRendererTurbo(this, 497, 169, textureX, textureY); // Box 57
		gun_5_Model[1][31] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 58

		gun_5_Model[1][0].addShapeBox(-2.25F, 1F, -3.75F, 3, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 276

		gun_5_Model[1][1].addShapeBox(1F, 1F, -3.75F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F); // Box 277

		gun_5_Model[1][2].addShapeBox(10F, 1F, -3.75F, 2, 1, 1, 0F,0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F); // Box 279

		gun_5_Model[1][3].addShapeBox(8F, 1F, -3.75F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F); // Box 280

		gun_5_Model[1][4].addShapeBox(-2.25F, 0F, -2.75F, 2, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // Box 282

		gun_5_Model[1][5].addShapeBox(-2.25F, 0F, -4.75F, 2, 3, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 2.1F, 0F, 0F, 2.1F); // Box 283

		gun_5_Model[1][6].addShapeBox(2F, 0.5F, -4.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F); // Box 284

		gun_5_Model[1][7].addShapeBox(2.5F, 0.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F); // Box 285

		gun_5_Model[1][8].addShapeBox(2.5F, 1.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 286

		gun_5_Model[1][9].addShapeBox(2F, 0.5F, -2.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F); // Box 287

		gun_5_Model[1][10].addShapeBox(2.5F, 0.5F, -2.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 288

		gun_5_Model[1][11].addShapeBox(2.5F, 1.5F, -2.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 289

		gun_5_Model[1][12].addShapeBox(9.5F, 0.5F, -4.75F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F); // Box 290

		gun_5_Model[1][13].addShapeBox(9.5F, 1.5F, -4.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F, -0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 291

		gun_5_Model[1][14].addShapeBox(9.5F, 1.5F, -2.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F); // Box 292

		gun_5_Model[1][15].addShapeBox(9.5F, 0.5F, -2.75F, 1, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F, -0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 293

		gun_5_Model[1][16].addShapeBox(-2.25F, 1F, 2.75F, 3, 1, 1, 0F,0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F); // Box 43

		gun_5_Model[1][17].addShapeBox(1F, 1F, 2.75F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.15F, -0.15F); // Box 44

		gun_5_Model[1][18].addShapeBox(10F, 1F, 2.75F, 2, 1, 1, 0F,0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0.5F, -0.25F, -0.25F); // Box 45

		gun_5_Model[1][19].addShapeBox(8F, 1F, 2.75F, 1, 1, 1, 0F,0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.3F, -0.3F, 0.5F, -0.3F, -0.3F, 0F, -0.25F, -0.25F); // Box 46

		gun_5_Model[1][20].addShapeBox(-2.25F, 0F, 3.75F, 2, 3, 1, 0F,0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 2.1F, 0F, 0F, 2.1F, 0F, 0F, -2.9F, 0F, 0F, -2.9F); // Box 47

		gun_5_Model[1][21].addShapeBox(-2.25F, 0F, 1.75F, 2, 3, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -2.9F, 0F, 0F, -2.9F, 0F, 0F, 2.1F, 0F, 0F, 2.1F); // Box 48

		gun_5_Model[1][22].addShapeBox(2F, 0.5F, 1.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F); // Box 49

		gun_5_Model[1][23].addShapeBox(2.5F, 0.5F, 1.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F); // Box 50

		gun_5_Model[1][24].addShapeBox(2.5F, 1.5F, 1.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 1.75F, 0F, -1.4F, 1.75F, 0F, 0.6F, -0.25F, 0F, 0.6F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 51

		gun_5_Model[1][25].addShapeBox(2F, 0.5F, 3.75F, 1, 2, 1, 0F,-0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 1.6F, -0.25F, 0F, 1.6F, -0.25F, 0F, -2.4F, -0.25F, 0F, -2.4F); // Box 52

		gun_5_Model[1][26].addShapeBox(2.5F, 0.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 53

		gun_5_Model[1][27].addShapeBox(2.5F, 1.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 1.75F, 0F, 0.6F, 1.75F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.7F, 0F, -0.4F, -0.25F, 0F, -0.4F); // Box 54

		gun_5_Model[1][28].addShapeBox(9.5F, 0.5F, 1.75F, 1, 1, 1, 0F,-0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F, -0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F); // Box 55

		gun_5_Model[1][29].addShapeBox(9.5F, 1.5F, 1.75F, 1, 1, 1, 0F,-0.25F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.1F, 0.5F, -0.25F, 0F, 0.6F, -0.25F, -0.4F, -0.8F, -0.5F, -0.4F, -0.8F, -0.5F, -0.4F, 0F, -0.25F, -0.4F, 0F); // Box 56

		gun_5_Model[1][30].addShapeBox(9.5F, 1.5F, 3.75F, 1, 1, 1, 0F,-0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F, -0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F); // Box 57

		gun_5_Model[1][31].addShapeBox(9.5F, 0.5F, 3.75F, 1, 1, 1, 0F,-0.25F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, -0.8F, -0.25F, -0.4F, -0.8F, -0.25F, 0F, 0.6F, 0F, -0.1F, 0.5F, 0F, 0F, -1.4F, -0.25F, 0F, -1.4F); // Box 58

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-62.5F, -10.5F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[4];
		gun_5_Model[2][0] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 272
		gun_5_Model[2][1] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 273
		gun_5_Model[2][2] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 274
		gun_5_Model[2][3] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 275

		gun_5_Model[2][0].addShapeBox(0.75F, 0F, -3.75F, 5, 1, 1, 0F,-0.1F, 0.4F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F); // Box 272

		gun_5_Model[2][1].addShapeBox(-2.25F, 0F, -3.75F, 3, 1, 1, 0F,0.15F, -0.1F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F); // Box 273

		gun_5_Model[2][2].addShapeBox(-2.25F, 0F, 2.75F, 3, 1, 1, 0F,0.15F, -0.1F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, 0.4F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F, 0.15F, 0.15F, -0.25F); // Box 274

		gun_5_Model[2][3].addShapeBox(0.75F, 0F, 2.75F, 5, 1, 1, 0F,-0.1F, 0.4F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, -0.35F, -0.25F, -0.1F, 0.4F, -0.25F, -0.1F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, 0.15F, -0.1F, -0.25F, -0.1F, -0.1F, -0.25F); // Box 275

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[2])
		{
			gunPart.setRotationPoint(-62.5F, -10.5F, 0F);
		}


		registerGunModel("VolnaRear", gun_5_Model);
	}
}