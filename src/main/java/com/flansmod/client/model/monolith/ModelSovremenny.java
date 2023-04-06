//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Sovremenny
// Model Creator: 
// Created on: 01.08.2020 - 10:13:53
// Last changed on: 01.08.2020 - 10:13:53

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSovremenny extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 256;

	public ModelSovremenny() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[272];
		//turretModel = new ModelRendererTurbo[8];
		//barrelModel = new ModelRendererTurbo[4];

		initbodyModel_1();


		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 23
		bodyModel[1] = new ModelRendererTurbo(this, 385, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 177, 33, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 369, 65, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 193, 73, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 425, 73, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 225, 113, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 289, 113, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 457, 1, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 29
		bodyModel[30] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 30
		bodyModel[31] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 31
		bodyModel[32] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 32
		bodyModel[33] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 33
		bodyModel[34] = new ModelRendererTurbo(this, 401, 129, textureX, textureY); // Box 34
		bodyModel[35] = new ModelRendererTurbo(this, 377, 17, textureX, textureY); // Box 35
		bodyModel[36] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 36
		bodyModel[37] = new ModelRendererTurbo(this, 81, 137, textureX, textureY); // Box 37
		bodyModel[38] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 38
		bodyModel[39] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 39
		bodyModel[40] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 40
		bodyModel[41] = new ModelRendererTurbo(this, 161, 145, textureX, textureY); // Box 41
		bodyModel[42] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 42
		bodyModel[43] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 43
		bodyModel[44] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 44
		bodyModel[45] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 45
		bodyModel[46] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 46
		bodyModel[47] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 47
		bodyModel[48] = new ModelRendererTurbo(this, 185, 41, textureX, textureY); // Box 48
		bodyModel[49] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 49
		bodyModel[50] = new ModelRendererTurbo(this, 353, 73, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 89, 73, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 161, 73, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 241, 153, textureX, textureY); // Box 87
		bodyModel[59] = new ModelRendererTurbo(this, 297, 73, textureX, textureY); // Box 88
		bodyModel[60] = new ModelRendererTurbo(this, 321, 73, textureX, textureY); // Box 89
		bodyModel[61] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 83
		bodyModel[62] = new ModelRendererTurbo(this, 497, 65, textureX, textureY); // Box 84
		bodyModel[63] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 85
		bodyModel[64] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 86
		bodyModel[65] = new ModelRendererTurbo(this, 57, 73, textureX, textureY); // Box 87
		bodyModel[66] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 88
		bodyModel[67] = new ModelRendererTurbo(this, 201, 81, textureX, textureY); // Box 89
		bodyModel[68] = new ModelRendererTurbo(this, 273, 81, textureX, textureY); // Box 90
		bodyModel[69] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 91
		bodyModel[70] = new ModelRendererTurbo(this, 425, 81, textureX, textureY); // Box 92
		bodyModel[71] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 93
		bodyModel[72] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 94
		bodyModel[73] = new ModelRendererTurbo(this, 289, 161, textureX, textureY); // Box 95
		bodyModel[74] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 96
		bodyModel[75] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 97
		bodyModel[76] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 98
		bodyModel[77] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 99
		bodyModel[78] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 100
		bodyModel[79] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 101
		bodyModel[80] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 102
		bodyModel[81] = new ModelRendererTurbo(this, 273, 89, textureX, textureY); // Box 104
		bodyModel[82] = new ModelRendererTurbo(this, 353, 89, textureX, textureY); // Box 105
		bodyModel[83] = new ModelRendererTurbo(this, 353, 97, textureX, textureY); // Box 106
		bodyModel[84] = new ModelRendererTurbo(this, 225, 105, textureX, textureY); // Box 107
		bodyModel[85] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 108
		bodyModel[86] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 109
		bodyModel[87] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 110
		bodyModel[88] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 111
		bodyModel[89] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 112
		bodyModel[90] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 113
		bodyModel[91] = new ModelRendererTurbo(this, 257, 105, textureX, textureY); // Box 114
		bodyModel[92] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 115
		bodyModel[93] = new ModelRendererTurbo(this, 17, 17, textureX, textureY); // Box 116
		bodyModel[94] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 117
		bodyModel[95] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 118
		bodyModel[96] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 119
		bodyModel[97] = new ModelRendererTurbo(this, 57, 81, textureX, textureY); // Box 120
		bodyModel[98] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 121
		bodyModel[99] = new ModelRendererTurbo(this, 281, 81, textureX, textureY); // Box 122
		bodyModel[100] = new ModelRendererTurbo(this, 353, 81, textureX, textureY); // Box 123
		bodyModel[101] = new ModelRendererTurbo(this, 385, 129, textureX, textureY); // Box 124
		bodyModel[102] = new ModelRendererTurbo(this, 113, 169, textureX, textureY); // Box 125
		bodyModel[103] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 126
		bodyModel[104] = new ModelRendererTurbo(this, 385, 81, textureX, textureY); // Box 127
		bodyModel[105] = new ModelRendererTurbo(this, 145, 169, textureX, textureY); // Box 128
		bodyModel[106] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 129
		bodyModel[107] = new ModelRendererTurbo(this, 353, 161, textureX, textureY); // Box 130
		bodyModel[108] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 132
		bodyModel[109] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 133
		bodyModel[110] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 134
		bodyModel[111] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 135
		bodyModel[112] = new ModelRendererTurbo(this, 441, 81, textureX, textureY); // Box 136
		bodyModel[113] = new ModelRendererTurbo(this, 289, 89, textureX, textureY); // Box 137
		bodyModel[114] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 138
		bodyModel[115] = new ModelRendererTurbo(this, 473, 145, textureX, textureY); // Box 139
		bodyModel[116] = new ModelRendererTurbo(this, 417, 113, textureX, textureY); // Box 140
		bodyModel[117] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 142
		bodyModel[118] = new ModelRendererTurbo(this, 17, 89, textureX, textureY); // Box 143
		bodyModel[119] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 144
		bodyModel[120] = new ModelRendererTurbo(this, 9, 185, textureX, textureY); // Box 145
		bodyModel[121] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 146
		bodyModel[122] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 147
		bodyModel[123] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 148
		bodyModel[124] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 149
		bodyModel[125] = new ModelRendererTurbo(this, 361, 97, textureX, textureY); // Box 150
		bodyModel[126] = new ModelRendererTurbo(this, 233, 105, textureX, textureY); // Box 151
		bodyModel[127] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 152
		bodyModel[128] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 153
		bodyModel[129] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 154
		bodyModel[130] = new ModelRendererTurbo(this, 353, 17, textureX, textureY); // Box 155
		bodyModel[131] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 41
		bodyModel[132] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 157
		bodyModel[133] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 158
		bodyModel[134] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 159
		bodyModel[135] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 160
		bodyModel[136] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 161
		bodyModel[137] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 162
		bodyModel[138] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 163
		bodyModel[139] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 164
		bodyModel[140] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 165
		bodyModel[141] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 166
		bodyModel[142] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 167
		bodyModel[143] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 168
		bodyModel[144] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 169
		bodyModel[145] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 170
		bodyModel[146] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 171
		bodyModel[147] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 172
		bodyModel[148] = new ModelRendererTurbo(this, 65, 113, textureX, textureY); // Box 24
		bodyModel[149] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 25
		bodyModel[150] = new ModelRendererTurbo(this, 481, 177, textureX, textureY); // Box 375
		bodyModel[151] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 376
		bodyModel[152] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 377
		bodyModel[153] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 378
		bodyModel[154] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 385
		bodyModel[155] = new ModelRendererTurbo(this, 17, 81, textureX, textureY); // Box 386
		bodyModel[156] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 182
		bodyModel[157] = new ModelRendererTurbo(this, 345, 193, textureX, textureY); // Box 183
		bodyModel[158] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 184
		bodyModel[159] = new ModelRendererTurbo(this, 369, 113, textureX, textureY); // Box 185
		bodyModel[160] = new ModelRendererTurbo(this, 1, 121, textureX, textureY); // Box 186
		bodyModel[161] = new ModelRendererTurbo(this, 441, 185, textureX, textureY); // Box 186
		bodyModel[162] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 187
		bodyModel[163] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 188
		bodyModel[164] = new ModelRendererTurbo(this, 345, 201, textureX, textureY); // Box 189
		bodyModel[165] = new ModelRendererTurbo(this, 481, 193, textureX, textureY); // Box 190
		bodyModel[166] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 191
		bodyModel[167] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 192
		bodyModel[168] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 193
		bodyModel[169] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 194
		bodyModel[170] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 195
		bodyModel[171] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 196
		bodyModel[172] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 197
		bodyModel[173] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 198
		bodyModel[174] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 199
		bodyModel[175] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 200
		bodyModel[176] = new ModelRendererTurbo(this, 401, 201, textureX, textureY); // Box 201
		bodyModel[177] = new ModelRendererTurbo(this, 425, 201, textureX, textureY); // Box 202
		bodyModel[178] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 203
		bodyModel[179] = new ModelRendererTurbo(this, 409, 201, textureX, textureY); // Box 204
		bodyModel[180] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 205
		bodyModel[181] = new ModelRendererTurbo(this, 153, 145, textureX, textureY); // Box 206
		bodyModel[182] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 207
		bodyModel[183] = new ModelRendererTurbo(this, 385, 145, textureX, textureY); // Box 208
		bodyModel[184] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 209
		bodyModel[185] = new ModelRendererTurbo(this, 281, 137, textureX, textureY); // Box 210
		bodyModel[186] = new ModelRendererTurbo(this, 305, 137, textureX, textureY); // Box 211
		bodyModel[187] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 212
		bodyModel[188] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 213
		bodyModel[189] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 214
		bodyModel[190] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 232
		bodyModel[191] = new ModelRendererTurbo(this, 281, 169, textureX, textureY); // Box 233
		bodyModel[192] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 234
		bodyModel[193] = new ModelRendererTurbo(this, 17, 209, textureX, textureY); // Box 235
		bodyModel[194] = new ModelRendererTurbo(this, 433, 153, textureX, textureY); // Box 236
		bodyModel[195] = new ModelRendererTurbo(this, 505, 169, textureX, textureY); // Box 237
		bodyModel[196] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 238
		bodyModel[197] = new ModelRendererTurbo(this, 57, 209, textureX, textureY); // Box 239
		bodyModel[198] = new ModelRendererTurbo(this, 81, 209, textureX, textureY); // Box 240
		bodyModel[199] = new ModelRendererTurbo(this, 113, 209, textureX, textureY); // Box 241
		bodyModel[200] = new ModelRendererTurbo(this, 89, 113, textureX, textureY); // Box 242
		bodyModel[201] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 243
		bodyModel[202] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box 244
		bodyModel[203] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 245
		bodyModel[204] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 246
		bodyModel[205] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 247
		bodyModel[206] = new ModelRendererTurbo(this, 145, 209, textureX, textureY); // Box 248
		bodyModel[207] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 249
		bodyModel[208] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 661
		bodyModel[209] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 662
		bodyModel[210] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 663
		bodyModel[211] = new ModelRendererTurbo(this, 41, 209, textureX, textureY); // Box 253
		bodyModel[212] = new ModelRendererTurbo(this, 153, 209, textureX, textureY); // Box 254
		bodyModel[213] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 255
		bodyModel[214] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 256
		bodyModel[215] = new ModelRendererTurbo(this, 201, 209, textureX, textureY); // Box 257
		bodyModel[216] = new ModelRendererTurbo(this, 225, 209, textureX, textureY); // Box 258
		bodyModel[217] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 32
		bodyModel[218] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 33
		bodyModel[219] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 34
		bodyModel[220] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 35
		bodyModel[221] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 263
		bodyModel[222] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 264
		bodyModel[223] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 265
		bodyModel[224] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 266
		bodyModel[225] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 158
		bodyModel[226] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 162
		bodyModel[227] = new ModelRendererTurbo(this, 289, 209, textureX, textureY); // Box 269
		bodyModel[228] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 270
		bodyModel[229] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 271
		bodyModel[230] = new ModelRendererTurbo(this, 409, 129, textureX, textureY); // Box 272
		bodyModel[231] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 273
		bodyModel[232] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 274
		bodyModel[233] = new ModelRendererTurbo(this, 113, 193, textureX, textureY); // Box 275
		bodyModel[234] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 276
		bodyModel[235] = new ModelRendererTurbo(this, 209, 185, textureX, textureY); // Box 277
		bodyModel[236] = new ModelRendererTurbo(this, 409, 185, textureX, textureY); // Box 278
		bodyModel[237] = new ModelRendererTurbo(this, 17, 177, textureX, textureY); // Box 279
		bodyModel[238] = new ModelRendererTurbo(this, 313, 201, textureX, textureY); // Box 280
		bodyModel[239] = new ModelRendererTurbo(this, 273, 201, textureX, textureY); // Box 281
		bodyModel[240] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 282
		bodyModel[241] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 283
		bodyModel[242] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 284
		bodyModel[243] = new ModelRendererTurbo(this, 425, 193, textureX, textureY); // Box 285
		bodyModel[244] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 286
		bodyModel[245] = new ModelRendererTurbo(this, 233, 193, textureX, textureY); // Box 287
		bodyModel[246] = new ModelRendererTurbo(this, 193, 193, textureX, textureY); // Box 288
		bodyModel[247] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 289
		bodyModel[248] = new ModelRendererTurbo(this, 169, 113, textureX, textureY); // Box 290
		bodyModel[249] = new ModelRendererTurbo(this, 153, 33, textureX, textureY); // Box 291
		bodyModel[250] = new ModelRendererTurbo(this, 137, 169, textureX, textureY); // Box 292
		bodyModel[251] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 293
		bodyModel[252] = new ModelRendererTurbo(this, 65, 121, textureX, textureY); // Box 294
		bodyModel[253] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 295
		bodyModel[254] = new ModelRendererTurbo(this, 281, 129, textureX, textureY); // Box 296
		bodyModel[255] = new ModelRendererTurbo(this, 473, 153, textureX, textureY); // Box 297
		bodyModel[256] = new ModelRendererTurbo(this, 241, 209, textureX, textureY); // Box 298
		bodyModel[257] = new ModelRendererTurbo(this, 257, 209, textureX, textureY); // Box 299
		bodyModel[258] = new ModelRendererTurbo(this, 273, 209, textureX, textureY); // Box 300
		bodyModel[259] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 301
		bodyModel[260] = new ModelRendererTurbo(this, 329, 169, textureX, textureY); // Box 302
		bodyModel[261] = new ModelRendererTurbo(this, 409, 177, textureX, textureY); // Box 303
		bodyModel[262] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 304
		bodyModel[263] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 305
		bodyModel[264] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 306
		bodyModel[265] = new ModelRendererTurbo(this, 353, 177, textureX, textureY); // Box 307
		bodyModel[266] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 308
		bodyModel[267] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 309
		bodyModel[268] = new ModelRendererTurbo(this, 409, 145, textureX, textureY); // Box 310
		bodyModel[269] = new ModelRendererTurbo(this, 497, 193, textureX, textureY); // Box 311
		bodyModel[270] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 312
		bodyModel[271] = new ModelRendererTurbo(this, 217, 209, textureX, textureY); // Box 313

		bodyModel[0].addShapeBox(0F, 0F, 0F, 162, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 23
		bodyModel[0].setRotationPoint(-123.5F, -3F, -13F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 22, 5, 26, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, -2F, 0F, 1.5F, -1F, 0F, 1.5F, -1F, -2F, 0F, -2F); // Box 1
		bodyModel[1].setRotationPoint(-123.5F, 1F, -13F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 60, 9, 26, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, -1F, -2F, 2.5F, -2.5F, -2F, 2F, -2.5F, 0F, -2.5F, -1F); // Box 2
		bodyModel[2].setRotationPoint(-101.5F, 1F, -13F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 82, 11, 26, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, 0.5F, -7F, 0F, 0.5F, -7F, 0F, 0F, -2.5F); // Box 3
		bodyModel[3].setRotationPoint(-43.5F, 1F, -13F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 13, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 4
		bodyModel[4].setRotationPoint(38.5F, -3F, -13F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 13, 4, 26, 0F,-5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(38.5F, -7F, -13F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 13, 11, 26, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.5F, -7F, 0F, 1F, -8F, 0F, 0.5F, -8F, 0F, 0.5F, -7F); // Box 6
		bodyModel[6].setRotationPoint(38.5F, 1F, -13F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 26, 11, 26, 0F,0F, 0F, -2F, 0F, 0F, -6.25F, 0F, 0F, -6.25F, 0F, 0F, -2F, 0F, 1F, -8F, 0F, 0.5F, -10.5F, 0F, 0.5F, -10.5F, 0F, 0.5F, -8F); // Box 7
		bodyModel[7].setRotationPoint(51.5F, 1F, -13F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 26, 4, 26, 0F,0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F, 0F, 0F, -2F, 0F, 0F, -6.25F, 0F, 0F, -6.25F, 0F, 0F, -2F); // Box 8
		bodyModel[8].setRotationPoint(51.5F, -3F, -13F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 26, 4, 26, 0F,0F, 0F, 0F, 0F, 0.5F, -1.75F, 0F, 0.5F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, -0.5F); // Box 9
		bodyModel[9].setRotationPoint(51.5F, -7F, -13F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 16, 4, 26, 0F,0F, 0.5F, -1.75F, 0F, 1.25F, -4.25F, 0F, 1.25F, -4.25F, 0F, 0.5F, -1.75F, 0F, 0F, -4F, 0F, -0.75F, -6.75F, 0F, -0.75F, -6.75F, 0F, 0F, -4F); // Box 10
		bodyModel[10].setRotationPoint(77.5F, -7F, -13F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 4, 26, 0F,0F, 0F, -4F, 0F, 0.75F, -6.75F, 0F, 0.75F, -6.75F, 0F, 0F, -4F, 0F, 0F, -6.25F, 0F, -0.75F, -8.5F, 0F, -0.75F, -8.5F, 0F, 0F, -6.25F); // Box 11
		bodyModel[11].setRotationPoint(77.5F, -3F, -13F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 16, 11, 26, 0F,0F, 0F, -6.25F, 0F, 0.75F, -8.5F, 0F, 0.75F, -8.5F, 0F, 0F, -6.25F, 0F, 0.5F, -10.5F, 0F, 0.5F, -11.75F, 0F, 0.5F, -11.75F, 0F, 0.5F, -10.5F); // Box 12
		bodyModel[12].setRotationPoint(77.5F, 1F, -13F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 22, 4, 14, 0F,0F, 0.75F, -0.75F, 4.25F, 0.75F, -6.75F, 4.25F, 0.75F, -6.75F, 0F, 0.75F, -0.75F, 0F, -0.75F, -2.5F, 0F, -0.75F, -6.75F, 0F, -0.75F, -6.75F, 0F, -0.75F, -2.5F); // Box 13
		bodyModel[13].setRotationPoint(93.5F, -3F, -7F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 22, 4, 14, 0F,0F, -0.75F, 1.75F, 10.5F, 2F, -6.75F, 10.5F, 2F, -6.75F, 0F, -0.75F, 1.75F, 0F, 1.25F, -0.75F, 4.25F, 1.25F, -6.75F, 4.25F, 1.25F, -6.75F, 0F, 1.25F, -0.75F); // Box 14
		bodyModel[14].setRotationPoint(93.5F, -9F, -7F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 22, 12, 8, 0F,0F, -0.25F, 0.5F, 0F, -0.25F, -3.75F, 0F, -0.25F, -3.75F, 0F, -0.25F, 0.5F, 0F, 0.5F, -2.75F, -7.5F, -0.75F, -3.75F, -7.5F, -0.75F, -3.75F, 0F, 0.5F, -2.75F); // Box 15
		bodyModel[15].setRotationPoint(93.5F, 0F, -4F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 22, 2, 8, 0F,0F, 0.5F, -2.75F, -7.5F, 1.75F, -3.75F, -7.5F, 1.75F, -3.75F, 0F, 0.5F, -2.75F, 0F, 0F, -2.75F, -9.5F, 0.5F, -3.25F, -9.5F, 0.5F, -3.25F, 0F, 0F, -2.75F); // Box 16
		bodyModel[16].setRotationPoint(93.5F, 13F, -4F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 22, 2, 8, 0F,0F, 0F, -2.75F, -9.5F, -0.5F, -3.25F, -9.5F, -0.5F, -3.25F, 0F, 0F, -2.75F, -5.5F, -0.25F, -3F, -12F, 0F, -3.75F, -12F, 0F, -3.75F, -5.5F, -0.25F, -3F); // Box 17
		bodyModel[17].setRotationPoint(93.5F, 15F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0.5F, 0.65F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.25F, 0F, 0.5F, 0.65F, -2.5F, -1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -2.5F, -1F, 0F); // Box 18
		bodyModel[18].setRotationPoint(88.5F, 13F, -1F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 19
		bodyModel[19].setRotationPoint(125F, -17.7F, -0.5F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 4, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[20].setRotationPoint(-100.5F, -5.5F, -2.5F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[21].setRotationPoint(-102.5F, -5.5F, -2.5F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[22].setRotationPoint(-91.25F, -4.5F, -4F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Box 23
		bodyModel[23].setRotationPoint(-88.25F, -4.5F, -4F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Box 24
		bodyModel[24].setRotationPoint(-97.25F, -4.5F, -4F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[25].setRotationPoint(-90.75F, -6F, -3F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 26
		bodyModel[26].setRotationPoint(-92.75F, -6F, -3F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 27
		bodyModel[27].setRotationPoint(-88.75F, -6F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 1, 6, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 28
		bodyModel[28].setRotationPoint(-125F, -8.7F, -0.5F);
		bodyModel[28].rotateAngleZ = 0.2268928F;

		bodyModel[29].addShapeBox(0F, 0F, 0F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[29].setRotationPoint(31F, -3.25F, -12F);
		bodyModel[29].rotateAngleZ = 0.27925268F;

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 4, 7, 0F,0F, 0F, 0.25F, 0F, 0F, 6.75F, 0F, 0F, 6.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 6.75F, 0F, 0F, 6.75F, 0F, 0F, 0.25F); // Box 30
		bodyModel[30].setRotationPoint(-77F, -6.7F, -3.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 12, 4, 19, 0F,0F, 0F, 0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 31
		bodyModel[31].setRotationPoint(-66F, -6.7F, -9.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 8, 4, 19, 0F,0F, 0F, -3F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -3F); // Box 32
		bodyModel[32].setRotationPoint(-62F, -10.8F, -9.5F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 32, 8, 19, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 33
		bodyModel[33].setRotationPoint(-54F, -10.8F, -9.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 6, 4, 19, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 34
		bodyModel[34].setRotationPoint(-28F, -14.8F, -9.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 2, 4, 5, 0F,-0.25F, 0F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.25F, -0.25F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, 0F, -1.25F); // Box 35
		bodyModel[35].setRotationPoint(-30F, -14.8F, -9.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 26, 8, 13, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[36].setRotationPoint(-22F, -10.8F, -6.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 26, 12, 13, 0F,0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 37
		bodyModel[37].setRotationPoint(3.8F, -15F, -6.5F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 21, 4, 11, 0F,0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 38
		bodyModel[38].setRotationPoint(3.8F, -18.7F, -5.5F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 5, 4, 13, 0F,0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 39
		bodyModel[39].setRotationPoint(24.8F, -19F, -6.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 10, 13, 0F,0.2F, 0.25F, 0.1F, 0.7F, 0.25F, 0.1F, 0.7F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0F, 0.1F, 0.7F, 0F, 0.1F, 0.7F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 40
		bodyModel[40].setRotationPoint(30F, -12.9F, -6.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 24, 8, 13, 0F,0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.75F, 0F, 0.1F, -0.75F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 41
		bodyModel[41].setRotationPoint(38.7F, -10.5F, -6.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 8, 4, 13, 0F,0F, 0F, 0.1F, -0.25F, 0F, -3.15F, -0.25F, 0F, -3.15F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.25F, 0F, -3.15F, -0.25F, 0F, -3.15F, 0F, 0F, 0.1F); // Box 42
		bodyModel[42].setRotationPoint(62F, -10.5F, -6.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Box 43
		bodyModel[43].setRotationPoint(74.25F, -9.5F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[44].setRotationPoint(77.25F, -9.5F, -4F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 6, 3, 8, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Box 45
		bodyModel[45].setRotationPoint(80.25F, -9.5F, -4F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 46
		bodyModel[46].setRotationPoint(75.75F, -11F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 47
		bodyModel[47].setRotationPoint(79.75F, -11F, -3F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 48
		bodyModel[48].setRotationPoint(77.75F, -11F, -3F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0.25F, 0F, 0F, -0.25F, 2F, 0F, -0.25F, 2F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1.25F, 0F, 1.5F, -1.25F, 0F, 1.5F, 0F, 0F, 0F); // Box 49
		bodyModel[49].setRotationPoint(86F, -10.5F, -2.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 6, 2, 13, 0F,0F, 0.25F, 0.1F, -1.75F, 0.25F, -2.15F, -1.75F, 0.25F, -2.15F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, -2.5F, 0.25F, -1.9F, -2.5F, 0.25F, -1.9F, 0F, 0.25F, 0.1F); // Box 51
		bodyModel[50].setRotationPoint(30F, -19F, -6.5F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 4, 4, 13, 0F,0F, 0.25F, 0.1F, -0.5F, 0.25F, -1.9F, -0.5F, 0.25F, -1.9F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, -2.15F, 0F, 0.25F, -2.15F, 0F, 0.25F, 0.1F); // Box 52
		bodyModel[51].setRotationPoint(30F, -17F, -6.5F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 53
		bodyModel[52].setRotationPoint(29.7F, -22.5F, -3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0.25F, -1.9F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.9F); // Box 54
		bodyModel[53].setRotationPoint(27.7F, -22.5F, -3F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 2, 4, 6, 0F,0F, 0.25F, 0.1F, 0F, 0.25F, -1.9F, 0F, 0.25F, -1.9F, 0F, 0.25F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, 0.1F); // Box 55
		bodyModel[54].setRotationPoint(31.7F, -22.5F, -3F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -1.4F, -1.75F, 0F, -1.9F, -1.75F, 0F, -1.9F, 0F, 0F, -1.4F, 0F, -0.25F, 0.1F, 0F, -0.25F, -1.9F, 0F, -0.25F, -1.9F, 0F, -0.25F, 0.1F); // Box 56
		bodyModel[55].setRotationPoint(31.7F, -24.5F, -3F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F); // Box 57
		bodyModel[56].setRotationPoint(29.7F, -24.5F, -3F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,-1.75F, 0F, -1.9F, 0F, 0F, -1.4F, 0F, 0F, -1.4F, -1.75F, 0F, -1.9F, 0F, -0.25F, -1.9F, 0F, -0.25F, 0.1F, 0F, -0.25F, 0.1F, 0F, -0.25F, -1.9F); // Box 58
		bodyModel[57].setRotationPoint(27.7F, -24.5F, -3F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 19, 4, 6, 0F,0F, 0F, -0.1F, -2.25F, 0F, -0.1F, -2.25F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -1.5F, 0F, -0.1F, -1.5F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 87
		bodyModel[58].setRotationPoint(33.7F, -14.5F, -3F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, -0.1F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 88
		bodyModel[59].setRotationPoint(40.7F, -14.5F, -4.8F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 6, 5, 2, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 89
		bodyModel[60].setRotationPoint(40.7F, -14.5F, 2.8F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 21, 4, 5, 0F,0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 83
		bodyModel[61].setRotationPoint(3.8F, -22.5F, -2.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 2, 5, 5, 0F,-0.2F, 0.25F, 0.1F, 0.05F, 0.25F, -1.15F, 0.05F, 0.25F, -1.15F, -0.2F, 0.25F, 0.1F, -0.2F, 0F, 0.1F, 0.05F, 0F, -1.15F, 0.05F, 0F, -1.15F, -0.2F, 0F, 0.1F); // Box 84
		bodyModel[62].setRotationPoint(24.8F, -23.5F, -2.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 85
		bodyModel[63].setRotationPoint(21.8F, -23.5F, -2.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F); // Box 86
		bodyModel[64].setRotationPoint(24.3F, -27F, -0.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 87
		bodyModel[65].setRotationPoint(24.3F, -29F, -1.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.3F, -1.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -1.5F, 0F, 0.3F, -1.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -1.5F); // Box 88
		bodyModel[66].setRotationPoint(26.3F, -28.5F, -2F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -0.95F, -1.5F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -0.95F, -1.5F, 0F, 0.3F, -1.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -1.5F); // Box 89
		bodyModel[67].setRotationPoint(26.3F, -30.1F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0.3F, -1.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, 0.5F, 0F, 0.3F, -1.5F, 0F, -0.95F, -1.5F, 0F, 0.3F, -1F, 0F, 0.3F, -1F, 0F, -0.95F, -1.5F); // Box 90
		bodyModel[68].setRotationPoint(26.3F, -26.9F, -2F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 6, 7, 3, 0F,0.2F, 0.25F, 0.1F, -2.05F, 0.25F, 0.1F, -2.05F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F, 0.2F, 0F, 1.1F); // Box 91
		bodyModel[69].setRotationPoint(3.8F, -29.5F, -1.5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,-0.3F, 0.25F, -0.9F, -0.8F, 0.25F, -0.65F, -0.8F, 0.25F, -0.65F, -0.3F, 0.25F, -0.9F, 0.2F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 92
		bodyModel[70].setRotationPoint(3.8F, -32.7F, -1.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 5, 10, 9, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 93
		bodyModel[71].setRotationPoint(-34.5F, -20F, -4.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 5, 10, 9, 0F,0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 94
		bodyModel[72].setRotationPoint(-34.5F, -20F, -4.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 6, 10, 10, 0F,0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 95
		bodyModel[73].setRotationPoint(-29.5F, -20.5F, -5F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 3, 10, 12, 0F,0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -0.1F); // Box 96
		bodyModel[74].setRotationPoint(-23.5F, -20.5F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 5, 12, 12, 0F,0F, 0.5F, -0.1F, 0F, 1F, -0.1F, 0F, 1F, -0.1F, 0F, 0.5F, -0.1F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F, 0F, -0.5F, 0.4F); // Box 97
		bodyModel[75].setRotationPoint(-20.5F, -22.5F, -6F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 4, 12, 12, 0F,0F, 1F, -0.1F, -0.75F, 1.5F, -1.85F, -0.75F, 1.5F, -1.85F, 0F, 1F, -0.1F, 0F, -0.5F, 0.4F, 1F, -0.5F, -1.35F, 1F, -0.5F, -1.35F, 0F, -0.5F, 0.4F); // Box 98
		bodyModel[76].setRotationPoint(-15.5F, -22.5F, -6F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0F, 0F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F); // Box 99
		bodyModel[77].setRotationPoint(-22.5F, -22.75F, -6F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 1, 12, 0F,0.5F, -0.25F, -2.35F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0.5F, -0.25F, -2.35F, 0.5F, -0.5F, -2.35F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0.5F, -0.5F, -2.35F); // Box 100
		bodyModel[78].setRotationPoint(-24.5F, -22.75F, -6F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 5, 19, 6, 0F,-1.5F, 0.25F, -2.35F, -2.75F, 0.25F, -2.35F, -2.75F, 0.25F, -2.35F, -1.5F, 0.25F, -2.35F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F); // Box 101
		bodyModel[79].setRotationPoint(-29F, -39.5F, -3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0.2F, 0.25F, 0.1F, 0.7F, 0.25F, 0.1F, 0.7F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, -0.75F, 0.1F, 0.7F, -0.75F, 0.1F, 0.7F, -0.75F, 0.1F, 0.2F, -0.75F, 0.1F); // Box 102
		bodyModel[80].setRotationPoint(34F, -13F, -7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 1.5F, 1.25F, 0F, -1F, 1.25F, 0F); // Box 104
		bodyModel[81].setRotationPoint(-28.5F, -29.75F, -9F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.75F, 0F, 0F, -0.75F, 0F, 0F, -1F, 1.25F, 0F, 1.5F, 1.25F, 0F, 1.75F, 2F, 0F, -0.75F, 2F, 0F); // Box 105
		bodyModel[82].setRotationPoint(-28.5F, -29.75F, -5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.75F, 0F, 0F, 1.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 1.25F, 0F, 1.5F, 1.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[83].setRotationPoint(-28.5F, -29.75F, 5F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.75F, 0F, 0F, 1.75F, 0F, 0F, 1.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 2F, 0F, 1.75F, 2F, 0F, 1.5F, 1.25F, 0F, -1F, 1.25F, 0F); // Box 107
		bodyModel[84].setRotationPoint(-28.5F, -29.75F, 1F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 108
		bodyModel[85].setRotationPoint(-28.6F, -31.5F, 8.25F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 109
		bodyModel[86].setRotationPoint(-28.6F, -31.5F, -9.25F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 110
		bodyModel[87].setRotationPoint(-34.8F, -29F, -5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 111
		bodyModel[88].setRotationPoint(-34.8F, -29F, 4F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 112
		bodyModel[89].setRotationPoint(-28.75F, -16.75F, -8F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.75F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, -0.75F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 113
		bodyModel[90].setRotationPoint(-28.75F, -16.75F, -9.05F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 114
		bodyModel[91].setRotationPoint(-28.75F, -16.75F, 4F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, -1F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, -1F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F); // Box 115
		bodyModel[92].setRotationPoint(-28.75F, -16.75F, 8F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[93].setRotationPoint(-28.25F, -17F, -7.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 117
		bodyModel[94].setRotationPoint(-28.25F, -18F, -7.5F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 118
		bodyModel[95].setRotationPoint(-28.25F, -19.5F, -7.5F);
		bodyModel[95].rotateAngleZ = -0.12217305F;

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 119
		bodyModel[96].setRotationPoint(-28.75F, -16.75F, 4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, -1F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, -1F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F); // Box 120
		bodyModel[97].setRotationPoint(-28.75F, -16.75F, 8.05F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[98].setRotationPoint(-28.25F, -17F, 5.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 122
		bodyModel[99].setRotationPoint(-28.25F, -18F, 5.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 123
		bodyModel[100].setRotationPoint(-28.25F, -19.5F, 5.5F);
		bodyModel[100].rotateAngleZ = -0.12217305F;

		bodyModel[101].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 124
		bodyModel[101].setRotationPoint(10.5F, -6.7F, -13F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 7, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, -5.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -5.5F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0F); // Box 125
		bodyModel[102].setRotationPoint(18.5F, -9.7F, -13F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 2.75F, 0F, 0F, 5.25F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 2.75F, 0.75F, 0F, 5.25F, 0.75F, 0F); // Box 126
		bodyModel[103].setRotationPoint(10.5F, -11.3F, -13F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 127
		bodyModel[104].setRotationPoint(12.5F, -8.3F, -13.25F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 8, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 128
		bodyModel[105].setRotationPoint(10.5F, -6.7F, 6F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 7, 6, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0.25F, 0F, 0.75F, -5.5F, 0F, 0.75F, 0F); // Box 129
		bodyModel[106].setRotationPoint(18.5F, -9.7F, 6F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 4, 7, 0F,5.25F, 0F, 0F, 2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5.25F, 0.75F, 0F, 2.75F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 130
		bodyModel[107].setRotationPoint(10.5F, -11.3F, 6F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 20, 1, 8, 0F,0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 6F, -0.75F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 6F, 0F, -0.25F); // Box 132
		bodyModel[108].setRotationPoint(-10F, -7.3F, -13.25F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 20, 1, 8, 0F,6F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 0F, -0.75F, -0.25F, 6F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 133
		bodyModel[109].setRotationPoint(-10F, -7.3F, 5.25F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 134
		bodyModel[110].setRotationPoint(-17F, -7.3F, 5.75F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 4, 1, 3, 0F,0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		bodyModel[111].setRotationPoint(-17F, -7.3F, -8.75F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 136
		bodyModel[112].setRotationPoint(1.5F, -6.5F, -13.25F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 137
		bodyModel[113].setRotationPoint(1.5F, -6.5F, 12.25F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 1.75F, 0F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 1.75F, -0.5F, 0.75F); // Box 138
		bodyModel[114].setRotationPoint(-45F, -6.7F, -13F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 3.75F, 0F, -0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 3.75F, -0.5F, -0.25F); // Box 139
		bodyModel[115].setRotationPoint(-62F, -6.7F, -12F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,1.75F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 140
		bodyModel[116].setRotationPoint(-45F, -6.7F, 10F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 142
		bodyModel[117].setRotationPoint(15.5F, -9.7F, -13F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 143
		bodyModel[118].setRotationPoint(12.5F, -8.3F, 12.25F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 3, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F); // Box 144
		bodyModel[119].setRotationPoint(15.5F, -9.7F, 6F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 20, 1, 19, 0F,0.2F, -0.5F, 0.1F, 0.2F, -0.5F, 0.1F, 0.2F, -0.5F, 0.1F, 0.2F, -0.5F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 145
		bodyModel[120].setRotationPoint(0.8F, -16F, -9.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 4, 1, 19, 0F,0.2F, -0.5F, 0.1F, -0.05F, -0.5F, -1.15F, -0.05F, -0.5F, -1.15F, 0.2F, -0.5F, 0.1F, 0.2F, 0F, 0.1F, -0.05F, 0F, -1.15F, -0.05F, 0F, -1.15F, 0.2F, 0F, 0.1F); // Box 146
		bodyModel[121].setRotationPoint(20.8F, -16F, -9.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 1, 2, 19, 0F,0.2F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, 0.2F, 0F, 0.1F, 0.2F, 0F, 0.1F, -0.8F, 0F, 0.1F, -0.8F, 0F, 0.1F, 0.2F, 0F, 0.1F); // Box 147
		bodyModel[122].setRotationPoint(0.8F, -17.5F, -9.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 148
		bodyModel[123].setRotationPoint(0.8F, -17.5F, -10F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F); // Box 149
		bodyModel[124].setRotationPoint(0.8F, -17.5F, 9F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.2F, 0F, -0.4F, 0.7F, 0F, -1.65F, 0.7F, 0F, 0.85F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.7F, 0F, -1.65F, 0.7F, 0F, 0.85F, 0.2F, 0F, -0.4F); // Box 150
		bodyModel[125].setRotationPoint(21F, -17.5F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0.2F, 0F, -0.4F, 0.7F, 0F, 0.85F, 0.7F, 0F, -1.65F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.7F, 0F, 0.85F, 0.7F, 0F, -1.65F, 0.2F, 0F, -0.4F); // Box 151
		bodyModel[126].setRotationPoint(21F, -17.5F, 9F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 1, 2, 17, 0F,0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -0.8F, 0F, -0.1F, -0.8F, 0F, -0.1F, 0.2F, 0F, -0.1F); // Box 152
		bodyModel[127].setRotationPoint(24.5F, -17.5F, -8.5F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 153
		bodyModel[128].setRotationPoint(3F, -33.7F, -2.5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, -0.25F, -0.3F, -0.25F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 154
		bodyModel[129].setRotationPoint(4.5F, -37.7F, -1F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 155
		bodyModel[130].setRotationPoint(5F, -40.7F, -0.5F);

		bodyModel[131].addShapeBox(0F, -5F, -5F, 1, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[131].setRotationPoint(6F, -38.25F, 0F);
		bodyModel[131].rotateAngleZ = 0.27925268F;

		bodyModel[132].addShapeBox(-0.5F, -0.25F, 0F, 16, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 157
		bodyModel[132].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[132].rotateAngleZ = 0.26179939F;

		bodyModel[133].addShapeBox(-0.5F, 0.6F, 0F, 16, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 158
		bodyModel[133].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[133].rotateAngleZ = 0.26179939F;

		bodyModel[134].addShapeBox(-0.5F, 0F, 0F, 16, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[134].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[134].rotateAngleZ = 0.26179939F;

		bodyModel[135].addShapeBox(0F, -0.25F, 1F, 15, 5, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 160
		bodyModel[135].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[135].rotateAngleZ = 0.26179939F;

		bodyModel[136].addShapeBox(0F, 0.75F, 0F, 15, 3, 5, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 161
		bodyModel[136].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[136].rotateAngleZ = 0.26179939F;

		bodyModel[137].addShapeBox(-0.5F, 2.75F, 0F, 16, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 162
		bodyModel[137].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[137].rotateAngleZ = 0.26179939F;

		bodyModel[138].addShapeBox(-0.5F, 3F, 0F, 16, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		bodyModel[138].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[138].rotateAngleZ = 0.26179939F;

		bodyModel[139].addShapeBox(-0.5F, 3.6F, 0F, 16, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 164
		bodyModel[139].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[139].rotateAngleZ = 0.26179939F;

		bodyModel[140].addShapeBox(-0.5F, 2.75F, 3F, 16, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 165
		bodyModel[140].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[140].rotateAngleZ = 0.26179939F;

		bodyModel[141].addShapeBox(-0.5F, 3F, 3F, 16, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 166
		bodyModel[141].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[141].rotateAngleZ = 0.26179939F;

		bodyModel[142].addShapeBox(-0.5F, 3.6F, 3F, 16, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 167
		bodyModel[142].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[142].rotateAngleZ = 0.26179939F;

		bodyModel[143].addShapeBox(-0.5F, 0.6F, 3F, 16, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 168
		bodyModel[143].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[143].rotateAngleZ = 0.26179939F;

		bodyModel[144].addShapeBox(-0.5F, 0F, 3F, 16, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[144].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[144].rotateAngleZ = 0.26179939F;

		bodyModel[145].addShapeBox(-0.5F, -0.25F, 3F, 16, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 170
		bodyModel[145].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[145].rotateAngleZ = 0.26179939F;

		bodyModel[146].addShapeBox(2F, 0.75F, 0F, 3, 6, 5, 0F,0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F); // Box 171
		bodyModel[146].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[146].rotateAngleZ = 0.26179939F;

		bodyModel[147].addShapeBox(9F, 0.75F, 0F, 2, 6, 5, 0F,0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F); // Box 172
		bodyModel[147].setRotationPoint(27.5F, -9F, -12.5F);
		bodyModel[147].rotateAngleZ = 0.26179939F;

		bodyModel[148].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0.1F, 0F, 0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 1.3F, -0.5F, 0F, 2F, -0.5F, 0.5F, 0F, 0F, 0.5F); // Box 24
		bodyModel[148].setRotationPoint(-4.5F, -11.55F, 8F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 3, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0.2F, 0.5F, -0.5F, 0.1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 2F, -0.5F, 0.5F, 1.3F, -0.5F, 0F, 0F, 0F, 0.75F); // Box 25
		bodyModel[149].setRotationPoint(-4.5F, -11.55F, 10F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 3, 3, 5, 0F,-2F, -0.4F, -0.75F, 0.75F, -0.4F, -0.25F, 0.75F, -0.4F, -0.25F, -2F, -0.4F, -0.75F, -2.75F, -0.65F, -1.25F, 1.5F, -0.15F, -0.8F, 1.5F, -0.15F, -0.8F, -2.75F, -0.65F, -1.25F); // Box 375
		bodyModel[150].setRotationPoint(-14.5F, -10.25F, 7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0.25F, -0.4F, -0.25F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0.25F, -0.4F, -0.25F, -0.5F, -0.15F, -0.8F, 0F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, -0.5F, -0.15F, -0.8F); // Box 376
		bodyModel[151].setRotationPoint(-10.5F, -10.25F, 7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, 0F, 0.5F, 0.1F, -2F, 0.5F, 0.1F, -2F, 0F, -0.4F, 0F, 0F, -0.15F, -0.75F, -0.25F, -0.9F, -2.05F, -0.25F, -0.9F, -2.05F, 0F, -0.15F, -0.75F); // Box 377
		bodyModel[152].setRotationPoint(-2.5F, -10.25F, 7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 378
		bodyModel[153].setRotationPoint(-11.5F, -11.55F, 8F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 385
		bodyModel[154].setRotationPoint(-9.5F, -7.4F, 8.1F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 386
		bodyModel[155].setRotationPoint(-1.5F, -7.4F, 8.1F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,-0.5F, -0.4F, -0.75F, 0.75F, -0.4F, -0.25F, 0.75F, -0.4F, -0.25F, -0.5F, -0.4F, -0.75F, -1F, -0.15F, -1.25F, 1.5F, 0.35F, -0.8F, 1.5F, 0.35F, -0.8F, -1F, -0.15F, -1.25F); // Box 182
		bodyModel[156].setRotationPoint(-12F, -10.25F, -12F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,0.25F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, -0.5F, 0.35F, -0.8F, 0F, 0.6F, -0.75F, 0F, 0.6F, -0.75F, -0.5F, 0.35F, -0.8F); // Box 183
		bodyModel[157].setRotationPoint(-9F, -10.25F, -12F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 5, 2, 5, 0F,0F, -0.4F, -0.25F, 0F, -0.15F, -2F, 0F, -0.15F, -2F, 0F, -0.4F, -0.25F, 0F, 0.6F, -0.75F, -0.25F, -0.4F, -2.05F, -0.25F, -0.4F, -2.05F, 0F, 0.6F, -0.75F); // Box 184
		bodyModel[158].setRotationPoint(-2F, -10.25F, -12F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 185
		bodyModel[159].setRotationPoint(-8F, -8.75F, -11.1F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 2, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, 0F); // Box 186
		bodyModel[160].setRotationPoint(-2F, -8.75F, -11.1F);

		bodyModel[161].addShapeBox(3F, 0F, -2.5F, 5, 2, 5, 0F,0F, -0.4F, -0.25F, 0F, -0.15F, -2F, 0F, -0.15F, -2F, 0F, -0.4F, -0.25F, 0F, 0.6F, -0.75F, -0.25F, -0.4F, -2.05F, -0.25F, -0.4F, -2.05F, 0F, 0.6F, -0.75F); // Box 186
		bodyModel[161].setRotationPoint(-6F, -13.25F, 0F);
		bodyModel[161].rotateAngleY = -1.57079633F;

		bodyModel[162].addShapeBox(-4F, 0F, -2.5F, 7, 2, 5, 0F,0.25F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0F, -0.4F, -0.25F, 0.25F, -0.4F, -0.25F, -0.5F, 0.35F, -0.8F, 0F, 0.6F, -0.75F, 0F, 0.6F, -0.75F, -0.5F, 0.35F, -0.8F); // Box 187
		bodyModel[162].setRotationPoint(-6F, -13.25F, 0F);
		bodyModel[162].rotateAngleY = -1.57079633F;

		bodyModel[163].addShapeBox(-7F, 0F, -2.5F, 2, 2, 5, 0F,-0.5F, -0.4F, -0.75F, 0.75F, -0.4F, -0.25F, 0.75F, -0.4F, -0.25F, -0.5F, -0.4F, -0.75F, -1F, -0.15F, -1.25F, 1.5F, 0.35F, -0.8F, 1.5F, 0.35F, -0.8F, -1F, -0.15F, -1.25F); // Box 188
		bodyModel[163].setRotationPoint(-6F, -13.25F, 0F);
		bodyModel[163].rotateAngleY = -1.57079633F;

		bodyModel[164].addShapeBox(0F, 0F, 0F, 9, 2, 9, 0F,0F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, 0F, 0.1F); // Box 189
		bodyModel[164].setRotationPoint(51.7F, -12F, -4.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 3, 2, 9, 0F,0F, 0F, -2.65F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, 0F, -2.65F, 0F, 0F, -2.65F, -0.25F, 0F, 0.1F, -0.25F, 0F, 0.1F, 0F, 0F, -2.65F); // Box 190
		bodyModel[165].setRotationPoint(49F, -12F, -4.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 191
		bodyModel[166].setRotationPoint(9.75F, -23F, -6.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.75F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, -0.75F, -0.25F, -0.1F, -1F, -0.25F, -0.1F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F); // Box 192
		bodyModel[167].setRotationPoint(9.75F, -23F, -7.55F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 193
		bodyModel[168].setRotationPoint(10.25F, -23.25F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 194
		bodyModel[169].setRotationPoint(10.25F, -24.25F, -6F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 195
		bodyModel[170].setRotationPoint(10.5F, -25.75F, -6F);
		bodyModel[170].rotateAngleZ = 0.12217305F;

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 196
		bodyModel[171].setRotationPoint(3.5F, -10.9F, -12.5F);
		bodyModel[171].rotateAngleZ = 0.12217305F;

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 197
		bodyModel[172].setRotationPoint(3.25F, -9.4F, -12.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[173].setRotationPoint(3.25F, -8.4F, -12.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[174].setRotationPoint(3F, -7.4F, -12.9F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,-0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Box 200
		bodyModel[175].setRotationPoint(52F, -12.2F, -3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 201
		bodyModel[176].setRotationPoint(59F, -12.2F, -3F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[177].setRotationPoint(56F, -12.2F, -3F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F, 3F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F, 3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 203
		bodyModel[178].setRotationPoint(3.5F, -30.25F, -8.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 9, 0F,0F, -0.3F, 0F, 3F, -0.3F, 0F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F, 0F, -0.3F, 0F, 3F, -0.3F, 0F, 0F, -0.55F, 0.25F, 0F, -0.55F, 0.25F); // Box 204
		bodyModel[179].setRotationPoint(3.5F, -30.25F, -0.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 205
		bodyModel[180].setRotationPoint(-2F, -30.25F, -0.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, -0.5F, -0.25F, 0F, 1.25F, -0.25F, 0F, 1.25F, -0.25F, -1F, -0.5F, -0.25F); // Box 206
		bodyModel[181].setRotationPoint(-1.75F, -29.75F, -0.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 207
		bodyModel[182].setRotationPoint(7F, -30.25F, -0.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 7, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1.25F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 1.25F, -0.25F); // Box 208
		bodyModel[183].setRotationPoint(7.25F, -29.75F, -0.5F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 209
		bodyModel[184].setRotationPoint(41.7F, -15.5F, -2F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, -0.5F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F); // Box 210
		bodyModel[185].setRotationPoint(42.7F, -17.5F, -1F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, 0.4F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, 0.75F, -0.2F, 0F, 0.75F, -0.2F, 0F, 0.75F, -0.2F, -0.2F, 0.75F, -0.2F); // Box 211
		bodyModel[186].setRotationPoint(42.7F, -17.5F, -1F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,-1.3F, 0.25F, 0.1F, -0.8F, 0.25F, 0.1F, 0.7F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, -1.3F, -0.75F, 0.1F, -0.8F, -0.75F, 0.1F, 0.7F, -0.75F, 0.1F, 0.2F, -0.75F, 0.1F); // Box 212
		bodyModel[187].setRotationPoint(34F, -13F, -8.7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 4, 1, 5, 0F,0.2F, 0.25F, 0.1F, 0.7F, 0.25F, 0.1F, 0.7F, 0.25F, 0.1F, 0.2F, 0.25F, 0.1F, 0.2F, -0.75F, 0.1F, 0.7F, -0.75F, 0.1F, 0.7F, -0.75F, 0.1F, 0.2F, -0.75F, 0.1F); // Box 213
		bodyModel[188].setRotationPoint(34F, -13F, 2.5F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0.2F, 0.25F, 0.1F, 0.7F, 0.25F, 0.1F, -0.8F, 0.25F, 0.1F, -1.3F, 0.25F, 0.1F, 0.2F, -0.75F, 0.1F, 0.7F, -0.75F, 0.1F, -0.8F, -0.75F, 0.1F, -1.3F, -0.75F, 0.1F); // Box 214
		bodyModel[189].setRotationPoint(34F, -13F, 7.7F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 232
		bodyModel[190].setRotationPoint(-42F, -10.8F, -13F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 2.5F, 0F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 2.5F, -0.5F, 0.75F); // Box 233
		bodyModel[191].setRotationPoint(-39F, -10.4F, -13F);

		bodyModel[192].addShapeBox(0F, 0F, 1.75F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 234
		bodyModel[192].setRotationPoint(-41.5F, -10.4F, -13F);

		bodyModel[193].addShapeBox(0F, 0F, 1.75F, 7, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 235
		bodyModel[193].setRotationPoint(-37.5F, -10.4F, -13F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 236
		bodyModel[194].setRotationPoint(-42F, -10.8F, 10F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 8, 1, 0F,2.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 237
		bodyModel[195].setRotationPoint(-39F, -10.4F, 12F);

		bodyModel[196].addShapeBox(0F, 0F, -1.75F, 4, 8, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 238
		bodyModel[196].setRotationPoint(-41.5F, -10.4F, 12F);

		bodyModel[197].addShapeBox(0F, 0F, -1.75F, 7, 5, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 239
		bodyModel[197].setRotationPoint(-37.5F, -10.4F, 12F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, 0.5F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -0.5F, 0F, -0.5F, -0.5F, -2F, 0.5F, -0.5F, 0.75F, 0F, -0.5F, 0.75F); // Box 240
		bodyModel[198].setRotationPoint(-35F, -10.8F, -13F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0.75F, 0.5F, 0F, 0.75F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0.75F, 0.5F, -0.5F, 0.75F, -0.5F, -0.5F, -2F, 0F, -0.5F, 0F); // Box 241
		bodyModel[199].setRotationPoint(-35F, -10.8F, 10F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 242
		bodyModel[200].setRotationPoint(26.2F, -29F, -7F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 243
		bodyModel[201].setRotationPoint(26.2F, -29F, 6F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 244
		bodyModel[202].setRotationPoint(33.7F, -29F, 3F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 245
		bodyModel[203].setRotationPoint(33.7F, -29F, -4F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 246
		bodyModel[204].setRotationPoint(-12F, -19.25F, -0.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 1.25F, -0.25F, -1F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, 0F, 1.25F, -0.25F); // Box 247
		bodyModel[205].setRotationPoint(-11.75F, -18.75F, -0.5F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 248
		bodyModel[206].setRotationPoint(-7F, -37F, -0.5F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		bodyModel[207].setRotationPoint(-0.5F, -4F, -12.25F);

		bodyModel[208].addShapeBox(0.05F, 0F, -7F, 1, 1, 12, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 661
		bodyModel[208].setRotationPoint(2.3F, -4.4F, -11.25F);
		bodyModel[208].rotateAngleY = -1.57079633F;

		bodyModel[209].addShapeBox(0.05F, 0F, -7F, 1, 1, 12, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 662
		bodyModel[209].setRotationPoint(2.3F, -5.1F, -11.25F);
		bodyModel[209].rotateAngleY = -1.57079633F;

		bodyModel[210].addShapeBox(0.05F, 0F, -7F, 1, 1, 12, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 663
		bodyModel[210].setRotationPoint(2.3F, -4.75F, -11.25F);
		bodyModel[210].rotateAngleY = -1.57079633F;

		bodyModel[211].addShapeBox(-1.05F, 0F, -7F, 1, 1, 12, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 253
		bodyModel[211].setRotationPoint(2.3F, -5.1F, -11.25F);
		bodyModel[211].rotateAngleY = -1.57079633F;

		bodyModel[212].addShapeBox(-1.05F, 0F, -7F, 1, 1, 12, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 254
		bodyModel[212].setRotationPoint(2.3F, -4.75F, -11.25F);
		bodyModel[212].rotateAngleY = -1.57079633F;

		bodyModel[213].addShapeBox(-1.05F, 0F, -7F, 1, 1, 12, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 255
		bodyModel[213].setRotationPoint(2.3F, -4.4F, -11.25F);
		bodyModel[213].rotateAngleY = -1.57079633F;

		bodyModel[214].addShapeBox(0F, 0F, 0F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[214].setRotationPoint(-70F, -7.2F, -3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 2, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 257
		bodyModel[215].setRotationPoint(-72F, -7.2F, -3F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F); // Box 258
		bodyModel[216].setRotationPoint(-67F, -7.2F, -3F);

		bodyModel[217].addShapeBox(0F, -0.5F, 0F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 32
		bodyModel[217].setRotationPoint(36.25F, -14.5F, -6.25F);
		bodyModel[217].rotateAngleZ = 0.27925268F;

		bodyModel[218].addShapeBox(-1.5F, 0F, 0F, 3, 1, 3, 0F,-1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 33
		bodyModel[218].setRotationPoint(36.25F, -16F, -7.25F);

		bodyModel[219].addShapeBox(-1.5F, 0F, 0F, 3, 1, 3, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 34
		bodyModel[219].setRotationPoint(36.25F, -15F, -7.25F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[220].setRotationPoint(34.75F, -14F, -7.25F);

		bodyModel[221].addShapeBox(-4F, -0.5F, 0F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 263
		bodyModel[221].setRotationPoint(-38.5F, -12.25F, -12F);
		bodyModel[221].rotateAngleZ = -0.29670597F;

		bodyModel[222].addShapeBox(-1.5F, 0F, 0F, 3, 1, 3, 0F,-1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 264
		bodyModel[222].setRotationPoint(-38.5F, -13.75F, -13F);

		bodyModel[223].addShapeBox(-1.5F, 0F, 0F, 3, 1, 3, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 265
		bodyModel[223].setRotationPoint(-38.5F, -12.75F, -13F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 266
		bodyModel[224].setRotationPoint(-40F, -11.75F, -13F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 158
		bodyModel[225].setRotationPoint(-61F, -8.8F, -10.75F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		bodyModel[226].setRotationPoint(-61.9F, -10F, -11.2F);
		bodyModel[226].rotateAngleZ = -0.15707963F;

		bodyModel[227].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,3.75F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 3.75F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 269
		bodyModel[227].setRotationPoint(-62F, -6.7F, 10F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 16, 1, 13, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 270
		bodyModel[228].setRotationPoint(-60F, -10.83F, -6.5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 271
		bodyModel[229].setRotationPoint(3.5F, -10.9F, 10.5F);
		bodyModel[229].rotateAngleZ = 0.12217305F;

		bodyModel[230].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 272
		bodyModel[230].setRotationPoint(3.25F, -9.4F, 10.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[231].setRotationPoint(3.25F, -8.4F, 10.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[232].setRotationPoint(3F, -7.4F, 10.9F);

		bodyModel[233].addShapeBox(0F, -0.25F, 1F, 15, 5, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 275
		bodyModel[233].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[233].rotateAngleZ = 0.26179939F;

		bodyModel[234].addShapeBox(0F, 0.75F, 0F, 15, 3, 5, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 276
		bodyModel[234].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[234].rotateAngleZ = 0.26179939F;

		bodyModel[235].addShapeBox(-0.5F, 0.6F, 0F, 16, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 277
		bodyModel[235].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[235].rotateAngleZ = 0.26179939F;

		bodyModel[236].addShapeBox(-0.5F, 0F, 0F, 16, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 278
		bodyModel[236].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[236].rotateAngleZ = 0.26179939F;

		bodyModel[237].addShapeBox(-0.5F, -0.25F, 0F, 16, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 279
		bodyModel[237].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[237].rotateAngleZ = 0.26179939F;

		bodyModel[238].addShapeBox(-0.5F, -0.25F, 3F, 16, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 280
		bodyModel[238].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[238].rotateAngleZ = 0.26179939F;

		bodyModel[239].addShapeBox(-0.5F, 0F, 3F, 16, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[239].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[239].rotateAngleZ = 0.26179939F;

		bodyModel[240].addShapeBox(-0.5F, 0.6F, 3F, 16, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 282
		bodyModel[240].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[240].rotateAngleZ = 0.26179939F;

		bodyModel[241].addShapeBox(-0.5F, 2.75F, 3F, 16, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 283
		bodyModel[241].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[241].rotateAngleZ = 0.26179939F;

		bodyModel[242].addShapeBox(-0.5F, 3.6F, 3F, 16, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 284
		bodyModel[242].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[242].rotateAngleZ = 0.26179939F;

		bodyModel[243].addShapeBox(-0.5F, 3F, 3F, 16, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[243].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[243].rotateAngleZ = 0.26179939F;

		bodyModel[244].addShapeBox(-0.5F, 3.6F, 0F, 16, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 286
		bodyModel[244].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[244].rotateAngleZ = 0.26179939F;

		bodyModel[245].addShapeBox(-0.5F, 3F, 0F, 16, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[245].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[245].rotateAngleZ = 0.26179939F;

		bodyModel[246].addShapeBox(-0.5F, 2.75F, 0F, 16, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 288
		bodyModel[246].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[246].rotateAngleZ = 0.26179939F;

		bodyModel[247].addShapeBox(9F, 0.75F, 0F, 2, 6, 5, 0F,0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F); // Box 289
		bodyModel[247].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[247].rotateAngleZ = 0.26179939F;

		bodyModel[248].addShapeBox(2F, 0.75F, 0F, 3, 6, 5, 0F,0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F, 0F, -0.2F, 0.5F); // Box 290
		bodyModel[248].setRotationPoint(27.5F, -9F, 7.5F);
		bodyModel[248].rotateAngleZ = 0.26179939F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 13, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[249].setRotationPoint(31F, -3.25F, 8F);
		bodyModel[249].rotateAngleZ = 0.27925268F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 3, 1, 4, 0F,0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F, 0F, -0.25F, -0.1F); // Box 292
		bodyModel[250].setRotationPoint(9.75F, -23F, 2.5F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, -1F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F, 0F, -0.25F, 0.15F, 0F, -0.25F, 0.15F, -1F, -0.25F, -0.1F, -0.75F, -0.25F, -0.1F); // Box 293
		bodyModel[251].setRotationPoint(9.75F, -23F, 6.55F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[252].setRotationPoint(10.25F, -23.25F, 4F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F, -0.7F, 0F, -0.7F); // Box 295
		bodyModel[253].setRotationPoint(10.25F, -24.25F, 4F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0F); // Box 296
		bodyModel[254].setRotationPoint(10.5F, -25.75F, 4F);
		bodyModel[254].rotateAngleZ = 0.12217305F;

		bodyModel[255].addShapeBox(-4F, -0.5F, 0F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 297
		bodyModel[255].setRotationPoint(-38.5F, -12.25F, 11F);
		bodyModel[255].rotateAngleZ = -0.29670597F;

		bodyModel[256].addShapeBox(-1.5F, 0F, 0F, 3, 1, 3, 0F,-1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 298
		bodyModel[256].setRotationPoint(-38.5F, -13.75F, 10F);

		bodyModel[257].addShapeBox(-1.5F, 0F, 0F, 3, 1, 3, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 299
		bodyModel[257].setRotationPoint(-38.5F, -12.75F, 10F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 300
		bodyModel[258].setRotationPoint(-40F, -11.75F, 10F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
		bodyModel[259].setRotationPoint(-61F, -8.8F, 9.75F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[260].setRotationPoint(-61.9F, -10F, 9.2F);
		bodyModel[260].rotateAngleZ = -0.15707963F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 303
		bodyModel[261].setRotationPoint(-0.5F, -4F, 10.25F);

		bodyModel[262].addShapeBox(0.05F, 0F, -7F, 1, 1, 12, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 304
		bodyModel[262].setRotationPoint(2.3F, -4.4F, 11.25F);
		bodyModel[262].rotateAngleY = -1.57079633F;

		bodyModel[263].addShapeBox(0.05F, 0F, -7F, 1, 1, 12, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 305
		bodyModel[263].setRotationPoint(2.3F, -5.1F, 11.25F);
		bodyModel[263].rotateAngleY = -1.57079633F;

		bodyModel[264].addShapeBox(0.05F, 0F, -7F, 1, 1, 12, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 306
		bodyModel[264].setRotationPoint(2.3F, -4.75F, 11.25F);
		bodyModel[264].rotateAngleY = -1.57079633F;

		bodyModel[265].addShapeBox(-1.05F, 0F, -7F, 1, 1, 12, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F); // Box 307
		bodyModel[265].setRotationPoint(2.3F, -4.4F, 11.25F);
		bodyModel[265].rotateAngleY = -1.57079633F;

		bodyModel[266].addShapeBox(-1.05F, 0F, -7F, 1, 1, 12, 0F,0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 308
		bodyModel[266].setRotationPoint(2.3F, -4.75F, 11.25F);
		bodyModel[266].rotateAngleY = -1.57079633F;

		bodyModel[267].addShapeBox(-1.05F, 0F, -7F, 1, 1, 12, 0F,-0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, -0.35F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Box 309
		bodyModel[267].setRotationPoint(2.3F, -5.1F, 11.25F);
		bodyModel[267].rotateAngleY = -1.57079633F;

		bodyModel[268].addShapeBox(0F, -0.5F, 0F, 4, 1, 1, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 310
		bodyModel[268].setRotationPoint(36.25F, -14.5F, 5.25F);
		bodyModel[268].rotateAngleZ = 0.27925268F;

		bodyModel[269].addShapeBox(-1.5F, 0F, 0F, 3, 1, 3, 0F,-1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -1.05F, -0.5F, -1.05F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 311
		bodyModel[269].setRotationPoint(36.25F, -16F, 4.25F);

		bodyModel[270].addShapeBox(-1.5F, 0F, 0F, 3, 1, 3, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 312
		bodyModel[270].setRotationPoint(36.25F, -15F, 4.25F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[271].setRotationPoint(34.75F, -14F, 4.25F);
	}

	

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[16];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 54
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 55
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 56
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 57
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 58
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 59
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 67
		gun_2_Model[0][7] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 68
		gun_2_Model[0][8] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 69
		gun_2_Model[0][9] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 70
		gun_2_Model[0][10] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 81
		gun_2_Model[0][11] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 82
		gun_2_Model[0][12] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 83
		gun_2_Model[0][13] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 84
		gun_2_Model[0][14] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 85
		gun_2_Model[0][15] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 86

		gun_2_Model[0][0].addShapeBox(0F, 0.7F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, 0.25F, 0F, 0F, 1.5F); // Box 54

		gun_2_Model[0][1].addShapeBox(0F, -1.3F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, 0.25F, 0F, 0F, 1.25F); // Box 55

		gun_2_Model[0][2].addShapeBox(0F, -2.3F, 1F, 4, 1, 2, 0F,0F, 0.3F, 0F, -1.7F, 0F, 0F, -2.5F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, 0F, 0F, 0.2F); // Box 56

		gun_2_Model[0][3].addShapeBox(-4F, 0.7F, 0F, 4, 2, 3, 0F,0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.3F, 0F, 0.25F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.3F, 0F, 0.25F); // Box 57

		gun_2_Model[0][4].addShapeBox(-4F, -1.3F, 0F, 4, 2, 3, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -1.5F, 0F, -0.2F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.3F, 0F, 0.25F); // Box 58

		gun_2_Model[0][5].addShapeBox(-4F, -2.3F, 0F, 4, 1, 3, 0F,-1.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -2F, -2.3F, 0.05F, -1.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -1.5F, 0F, -0.2F); // Box 59

		gun_2_Model[0][6].addShapeBox(1F, -1.6F, -1.5F, 2, 1, 3, 0F,1F, 0.7F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0.7F, -0.5F, 0F, 0F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, 0F, 0F, 0F); // Box 67

		gun_2_Model[0][7].addShapeBox(1.3F, -0.0999999999999998F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 68

		gun_2_Model[0][8].addShapeBox(-1F, -2.8F, -3.5F, 4, 4, 2, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 69

		gun_2_Model[0][9].addShapeBox(-0.5F, -2.7F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 70

		gun_2_Model[0][10].addShapeBox(-4F, -1.3F, -3F, 4, 2, 3, 0F,-1.5F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 81

		gun_2_Model[0][11].addShapeBox(-4F, -2.3F, -3F, 4, 1, 3, 0F,-2.3F, 0.05F, -1.5F, 0F, 0.3F, -2F, 0F, 0.3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 82

		gun_2_Model[0][12].addShapeBox(0F, -2.3F, -3F, 4, 1, 2, 0F,0F, -0.1F, -1F, -2.5F, -0.1F, -1F, -1.7F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.2F, -1.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F); // Box 83

		gun_2_Model[0][13].addShapeBox(0F, -1.3F, -3F, 4, 2, 2, 0F,0F, 0F, 0.2F, -1.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.75F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 84

		gun_2_Model[0][14].addShapeBox(0F, 0.7F, -3F, 4, 2, 2, 0F,0F, 0F, 1.25F, -0.75F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.75F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 85

		gun_2_Model[0][15].addShapeBox(-4F, 0.7F, -3F, 4, 2, 3, 0F,-0.3F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 86

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(78.7F, -13.5F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[6];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 71
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 72
		gun_2_Model[1][2] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 73
		gun_2_Model[1][3] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 74
		gun_2_Model[1][4] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 75
		gun_2_Model[1][5] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 76

		gun_2_Model[1][0].addShapeBox(-0.5F, -0.5F, -1.1F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 71

		gun_2_Model[1][1].addShapeBox(5.5F, -0.5F, -1.1F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 72

		gun_2_Model[1][2].addShapeBox(-0.5F, -0.5F, 0.1F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 73

		gun_2_Model[1][3].addShapeBox(5.5F, -0.5F, 0.1F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 74

		gun_2_Model[1][4].addShapeBox(-1F, -0.5F, -1.1F, 5, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F); // Box 75

		gun_2_Model[1][5].addShapeBox(-1F, -0.5F, 0.1F, 5, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(78.7F, -13.5F, 0F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("AK130Front", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[16];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 54
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 473, 1, textureX, textureY); // Box 55
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 497, 1, textureX, textureY); // Box 56
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 57
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 58
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 59
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 369, 9, textureX, textureY); // Box 67
		gun_3_Model[0][7] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 68
		gun_3_Model[0][8] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 69
		gun_3_Model[0][9] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 70
		gun_3_Model[0][10] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 81
		gun_3_Model[0][11] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 82
		gun_3_Model[0][12] = new ModelRendererTurbo(this, 385, 49, textureX, textureY); // Box 83
		gun_3_Model[0][13] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 84
		gun_3_Model[0][14] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 85
		gun_3_Model[0][15] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 86

		gun_3_Model[0][0].addShapeBox(0F, 0.7F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, 0.25F, 0F, 0F, 1.5F); // Box 54

		gun_3_Model[0][1].addShapeBox(0F, -1.3F, 1F, 4, 2, 2, 0F,0F, 0F, 0F, -0.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, -0.75F, 0F, 0.25F, 0F, 0F, 1.25F); // Box 55

		gun_3_Model[0][2].addShapeBox(0F, -2.3F, 1F, 4, 1, 2, 0F,0F, 0.3F, 0F, -1.7F, 0F, 0F, -2.5F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, 0F, 0F, -0.5F, 0F, -0.2F, -1.5F, 0F, -0.2F, 0F, 0F, 0.2F); // Box 56

		gun_3_Model[0][3].addShapeBox(-4F, 0.7F, 0F, 4, 2, 3, 0F,0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.3F, 0F, 0.25F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.3F, 0F, 0.25F); // Box 57

		gun_3_Model[0][4].addShapeBox(-4F, -1.3F, 0F, 4, 2, 3, 0F,-0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -1.5F, 0F, -0.2F, 0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.3F, 0F, 0.25F); // Box 58

		gun_3_Model[0][5].addShapeBox(-4F, -2.3F, 0F, 4, 1, 3, 0F,-1.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -2F, -2.3F, 0.05F, -1.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -1.5F, 0F, -0.2F); // Box 59

		gun_3_Model[0][6].addShapeBox(1F, -1.6F, -1.5F, 2, 1, 3, 0F,1F, 0.7F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0.7F, -0.5F, 0F, 0F, 0F, 0.3F, 1F, 0F, 0.3F, 1F, 0F, 0F, 0F, 0F); // Box 67

		gun_3_Model[0][7].addShapeBox(1.3F, -0.0999999999999998F, -1.5F, 2, 3, 3, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 68

		gun_3_Model[0][8].addShapeBox(-1F, -2.8F, -3.5F, 4, 4, 2, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 69

		gun_3_Model[0][9].addShapeBox(-0.5F, -2.7F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F, -0.5F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.3F, -0.5F, 0F, -0.3F); // Box 70

		gun_3_Model[0][10].addShapeBox(-4F, -1.3F, -3F, 4, 2, 3, 0F,-1.5F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 81

		gun_3_Model[0][11].addShapeBox(-4F, -2.3F, -3F, 4, 1, 3, 0F,-2.3F, 0.05F, -1.5F, 0F, 0.3F, -2F, 0F, 0.3F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, -0.3F, 0F, 0F); // Box 82

		gun_3_Model[0][12].addShapeBox(0F, -2.3F, -3F, 4, 1, 2, 0F,0F, -0.1F, -1F, -2.5F, -0.1F, -1F, -1.7F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.2F, -1.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F); // Box 83

		gun_3_Model[0][13].addShapeBox(0F, -1.3F, -3F, 4, 2, 2, 0F,0F, 0F, 0.2F, -1.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 1.25F, -0.75F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 84

		gun_3_Model[0][14].addShapeBox(0F, 0.7F, -3F, 4, 2, 2, 0F,0F, 0F, 1.25F, -0.75F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.75F, 0F, 0.25F, 0F, 0F, -0.3F, 0F, 0F, 0F); // Box 85

		gun_3_Model[0][15].addShapeBox(-4F, 0.7F, -3F, 4, 2, 3, 0F,-0.3F, 0F, 0.25F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0.25F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0.7F, 0F, 0F); // Box 86

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-89.7F, -8.5F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[6];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 185, 33, textureX, textureY); // Box 71
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 72
		gun_3_Model[1][2] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 73
		gun_3_Model[1][3] = new ModelRendererTurbo(this, 273, 73, textureX, textureY); // Box 74
		gun_3_Model[1][4] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 75
		gun_3_Model[1][5] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 76

		gun_3_Model[1][0].addShapeBox(-0.5F, -0.5F, -1.1F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 71

		gun_3_Model[1][1].addShapeBox(5.5F, -0.5F, -1.1F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 72

		gun_3_Model[1][2].addShapeBox(-0.5F, -0.5F, 0.1F, 7, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 73

		gun_3_Model[1][3].addShapeBox(5.5F, -0.5F, 0.1F, 7, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 74

		gun_3_Model[1][4].addShapeBox(-1F, -0.5F, -1.1F, 5, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F); // Box 75

		gun_3_Model[1][5].addShapeBox(-1F, -0.5F, 0.1F, 5, 1, 1, 0F,0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F, 0F, 0.4F, -0.05F); // Box 76

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-89.7F, -8.5F, 0F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("AK130Rear", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[3];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 215
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 216
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 217

		gun_4_Model[0][0].addShapeBox(-0.5F, -0.5F, -1.5F, 3, 5, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.4F, 0.25F, 0F, -0.4F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, -0.4F, -0.25F, 0.2F, -0.4F); // Box 215

		gun_4_Model[0][1].addShapeBox(-0.5F, -0.5F, 0.5F, 3, 5, 1, 0F,0.25F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.2F, -0.4F, -0.25F, 0.2F, -0.4F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F); // Box 216

		gun_4_Model[0][2].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 217

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(57.3F, -16.7F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[14];
		gun_4_Model[1][0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 218
		gun_4_Model[1][1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 219
		gun_4_Model[1][2] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 220
		gun_4_Model[1][3] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 221
		gun_4_Model[1][4] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 222
		gun_4_Model[1][5] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 223
		gun_4_Model[1][6] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 224
		gun_4_Model[1][7] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 225
		gun_4_Model[1][8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 226
		gun_4_Model[1][9] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 227
		gun_4_Model[1][10] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 228
		gun_4_Model[1][11] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 229
		gun_4_Model[1][12] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 230
		gun_4_Model[1][13] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 231

		gun_4_Model[1][0].addShapeBox(-1F, -0.7F, -0.5F, 2, 2, 1, 0F,-0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 218

		gun_4_Model[1][1].addShapeBox(-3F, -0.7F, -0.5F, 2, 2, 1, 0F,-0.05F, -0.95F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, -0.05F, -0.95F, -0.1F, -0.05F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, -0.05F, -0.2F, -0.1F); // Box 219

		gun_4_Model[1][2].addShapeBox(1F, -0.7F, -0.5F, 2, 2, 1, 0F,0.2F, -0.2F, -0.1F, 0.45F, -0.95F, -0.1F, 0.45F, -0.95F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, -0.55F, -0.2F, -0.1F, -0.55F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F); // Box 220

		gun_4_Model[1][3].addShapeBox(-3F, 1.15F, -0.5F, 9, 1, 1, 0F,-0.2F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 221

		gun_4_Model[1][4].addShapeBox(6.1F, 1.15F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.45F, -0.1F, -0.1F, -0.45F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.45F, -0.1F, -0.1F, -0.45F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 222

		gun_4_Model[1][5].addShapeBox(6.45F, 1.15F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.7F, -0.45F, -0.45F, -0.7F, -0.45F, -0.45F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.7F, -0.45F, -0.45F, -0.7F, -0.45F, -0.45F, -0.2F, -0.1F, -0.1F); // Box 223

		gun_4_Model[1][6].addShapeBox(-2.7F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F); // Box 224

		gun_4_Model[1][7].addShapeBox(-2.2F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.4F, -1.15F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, 0.4F, 0.35F, -0.3F, 0.4F, 0.35F, -0.3F, -0.6F, -0.45F, -0.3F, -0.6F, -0.45F, -0.3F, 0.4F, -1.15F); // Box 225

		gun_4_Model[1][8].addShapeBox(-2.2F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.4F, 0.35F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, 0.4F, -1.15F, -0.3F, 0.4F, -1.15F, -0.3F, -0.6F, -0.45F, -0.3F, -0.6F, -0.45F, -0.3F, 0.4F, 0.35F); // Box 226

		gun_4_Model[1][9].addShapeBox(-2.7F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F); // Box 227

		gun_4_Model[1][10].addShapeBox(2.6F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.4F, 0.35F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, 0.4F, -1.15F, -0.3F, 0.4F, -1.15F, -0.3F, -0.6F, -0.45F, -0.3F, -0.6F, -0.45F, -0.3F, 0.4F, 0.35F); // Box 228

		gun_4_Model[1][11].addShapeBox(1.1F, 1.25F, -0.5F, 2, 1, 1, 0F,-0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F); // Box 229

		gun_4_Model[1][12].addShapeBox(2.6F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.4F, -1.15F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, 0.4F, 0.35F, -0.3F, 0.4F, 0.35F, -0.3F, -0.6F, -0.45F, -0.3F, -0.6F, -0.45F, -0.3F, 0.4F, -1.15F); // Box 230

		gun_4_Model[1][13].addShapeBox(1.1F, 1.25F, -0.5F, 2, 1, 1, 0F,-0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F); // Box 231

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[1])
		{
			gunPart.setRotationPoint(57.3F, -16.7F, 0F);
		}


		gun_4_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("UraganFront", gun_4_Model);

		// Passenger 6
		ModelRendererTurbo[][] gun_5_Model = new ModelRendererTurbo[3][];

		gun_5_Model[0] = new ModelRendererTurbo[3];
		gun_5_Model[0][0] = new ModelRendererTurbo(this, 57, 161, textureX, textureY); // Box 215
		gun_5_Model[0][1] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 216
		gun_5_Model[0][2] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 217

		gun_5_Model[0][0].addShapeBox(-0.5F, -0.5F, -1.5F, 3, 5, 1, 0F,0.25F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.4F, 0.25F, 0F, -0.4F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, -0.4F, -0.25F, 0.2F, -0.4F); // Box 215

		gun_5_Model[0][1].addShapeBox(-0.5F, -0.5F, 0.5F, 3, 5, 1, 0F,0.25F, 0F, -0.4F, -2F, 0F, -0.4F, -2F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0.2F, -0.4F, -0.25F, 0.2F, -0.4F, -0.25F, 0.2F, 0F, -0.25F, 0.2F, 0F); // Box 216

		gun_5_Model[0][2].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 217

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[0])
		{
			gunPart.setRotationPoint(-68.7F, -11.8F, 0F);
		}


		gun_5_Model[1] = new ModelRendererTurbo[14];
		gun_5_Model[1][0] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 218
		gun_5_Model[1][1] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 219
		gun_5_Model[1][2] = new ModelRendererTurbo(this, 281, 89, textureX, textureY); // Box 220
		gun_5_Model[1][3] = new ModelRendererTurbo(this, 433, 145, textureX, textureY); // Box 221
		gun_5_Model[1][4] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 222
		gun_5_Model[1][5] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 223
		gun_5_Model[1][6] = new ModelRendererTurbo(this, 457, 17, textureX, textureY); // Box 224
		gun_5_Model[1][7] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 225
		gun_5_Model[1][8] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 226
		gun_5_Model[1][9] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 227
		gun_5_Model[1][10] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 228
		gun_5_Model[1][11] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 229
		gun_5_Model[1][12] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 230
		gun_5_Model[1][13] = new ModelRendererTurbo(this, 417, 97, textureX, textureY); // Box 231

		gun_5_Model[1][0].addShapeBox(-1F, -0.7F, -0.5F, 2, 2, 1, 0F,-0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F, -0.2F, -0.2F, -0.1F); // Box 218

		gun_5_Model[1][1].addShapeBox(-3F, -0.7F, -0.5F, 2, 2, 1, 0F,-0.05F, -0.95F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, -0.05F, -0.95F, -0.1F, -0.05F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, -0.05F, -0.2F, -0.1F); // Box 219

		gun_5_Model[1][2].addShapeBox(1F, -0.7F, -0.5F, 2, 2, 1, 0F,0.2F, -0.2F, -0.1F, 0.45F, -0.95F, -0.1F, 0.45F, -0.95F, -0.1F, 0.2F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F, -0.55F, -0.2F, -0.1F, -0.55F, -0.2F, -0.1F, 0.2F, -0.2F, -0.1F); // Box 220

		gun_5_Model[1][3].addShapeBox(-3F, 1.15F, -0.5F, 9, 1, 1, 0F,-0.2F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, 0.3F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 221

		gun_5_Model[1][4].addShapeBox(6.1F, 1.15F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.45F, -0.1F, -0.1F, -0.45F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.45F, -0.1F, -0.1F, -0.45F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F); // Box 222

		gun_5_Model[1][5].addShapeBox(6.45F, 1.15F, -0.5F, 2, 1, 1, 0F,-0.2F, -0.1F, -0.1F, -0.7F, -0.45F, -0.45F, -0.7F, -0.45F, -0.45F, -0.2F, -0.1F, -0.1F, -0.2F, -0.1F, -0.1F, -0.7F, -0.45F, -0.45F, -0.7F, -0.45F, -0.45F, -0.2F, -0.1F, -0.1F); // Box 223

		gun_5_Model[1][6].addShapeBox(-2.7F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F); // Box 224

		gun_5_Model[1][7].addShapeBox(-2.2F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.4F, -1.15F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, 0.4F, 0.35F, -0.3F, 0.4F, 0.35F, -0.3F, -0.6F, -0.45F, -0.3F, -0.6F, -0.45F, -0.3F, 0.4F, -1.15F); // Box 225

		gun_5_Model[1][8].addShapeBox(-2.2F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.4F, 0.35F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, 0.4F, -1.15F, -0.3F, 0.4F, -1.15F, -0.3F, -0.6F, -0.45F, -0.3F, -0.6F, -0.45F, -0.3F, 0.4F, 0.35F); // Box 226

		gun_5_Model[1][9].addShapeBox(-2.7F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F); // Box 227

		gun_5_Model[1][10].addShapeBox(2.6F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.4F, 0.35F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, 0.4F, -1.15F, -0.3F, 0.4F, -1.15F, -0.3F, -0.6F, -0.45F, -0.3F, -0.6F, -0.45F, -0.3F, 0.4F, 0.35F); // Box 228

		gun_5_Model[1][11].addShapeBox(1.1F, 1.25F, -0.5F, 2, 1, 1, 0F,-0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F); // Box 229

		gun_5_Model[1][12].addShapeBox(2.6F, 1.25F, -0.5F, 1, 1, 1, 0F,-0.3F, 0.4F, -1.15F, -0.3F, -0.35F, -0.45F, -0.3F, -0.35F, -0.45F, -0.3F, 0.4F, 0.35F, -0.3F, 0.4F, 0.35F, -0.3F, -0.6F, -0.45F, -0.3F, -0.6F, -0.45F, -0.3F, 0.4F, -1.15F); // Box 230

		gun_5_Model[1][13].addShapeBox(1.1F, 1.25F, -0.5F, 2, 1, 1, 0F,-0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, 0.35F, -0.2F, 0.4F, -1.15F, -0.2F, 0.4F, -1.15F); // Box 231

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_5_Model[1])
		{
			gunPart.setRotationPoint(-68.7F, -11.8F, 0F);
		}


		gun_5_Model[2] = new ModelRendererTurbo[0];

		registerGunModel("UraganRear", gun_5_Model);
	}
}