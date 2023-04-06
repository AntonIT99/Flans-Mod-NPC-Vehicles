//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2021 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Moskva
// Model Creator: 
// Created on: 17.10.2020 - 02:19:54
// Last changed on: 17.10.2020 - 02:19:54

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMoskva extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelMoskva() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[235];

		initbodyModel_1();

		initGuns();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 49
		bodyModel[1] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 50
		bodyModel[2] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 51
		bodyModel[3] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 52
		bodyModel[4] = new ModelRendererTurbo(this, 177, 57, textureX, textureY); // Box 53
		bodyModel[5] = new ModelRendererTurbo(this, 353, 57, textureX, textureY); // Box 54
		bodyModel[6] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 55
		bodyModel[7] = new ModelRendererTurbo(this, 185, 105, textureX, textureY); // Box 56
		bodyModel[8] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 57
		bodyModel[9] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 58
		bodyModel[10] = new ModelRendererTurbo(this, 337, 121, textureX, textureY); // Box 59
		bodyModel[11] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 13
		bodyModel[13] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 14
		bodyModel[14] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 15
		bodyModel[15] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 16
		bodyModel[16] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 17
		bodyModel[17] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 18
		bodyModel[18] = new ModelRendererTurbo(this, 169, 217, textureX, textureY); // Box 19
		bodyModel[19] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 20
		bodyModel[20] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 21
		bodyModel[21] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 22
		bodyModel[22] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 23
		bodyModel[23] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 24
		bodyModel[24] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 25
		bodyModel[25] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 26
		bodyModel[26] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 27
		bodyModel[27] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 28
		bodyModel[28] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 29
		bodyModel[29] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 137, 1, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 337, 1, textureX, textureY); // Box 40
		bodyModel[39] = new ModelRendererTurbo(this, 473, 97, textureX, textureY); // Box 41
		bodyModel[40] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 42
		bodyModel[41] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 43
		bodyModel[42] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 44
		bodyModel[43] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 45
		bodyModel[44] = new ModelRendererTurbo(this, 449, 169, textureX, textureY); // Box 46
		bodyModel[45] = new ModelRendererTurbo(this, 361, 65, textureX, textureY); // Box 47
		bodyModel[46] = new ModelRendererTurbo(this, 73, 249, textureX, textureY); // Box 48
		bodyModel[47] = new ModelRendererTurbo(this, 265, 249, textureX, textureY); // Box 49
		bodyModel[48] = new ModelRendererTurbo(this, 185, 25, textureX, textureY); // Box 50
		bodyModel[49] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 51
		bodyModel[50] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 52
		bodyModel[51] = new ModelRendererTurbo(this, 465, 201, textureX, textureY); // Box 53
		bodyModel[52] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 54
		bodyModel[53] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 55
		bodyModel[54] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 56
		bodyModel[55] = new ModelRendererTurbo(this, 289, 265, textureX, textureY); // Box 57
		bodyModel[56] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 58
		bodyModel[57] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 59
		bodyModel[58] = new ModelRendererTurbo(this, 249, 273, textureX, textureY); // Box 60
		bodyModel[59] = new ModelRendererTurbo(this, 401, 297, textureX, textureY); // Box 61
		bodyModel[60] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 68
		bodyModel[61] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 69
		bodyModel[62] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 70
		bodyModel[63] = new ModelRendererTurbo(this, 489, 1, textureX, textureY); // Box 71
		bodyModel[64] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 72
		bodyModel[65] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 73
		bodyModel[66] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 74
		bodyModel[67] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 75
		bodyModel[68] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 76
		bodyModel[69] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 77
		bodyModel[70] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 78
		bodyModel[71] = new ModelRendererTurbo(this, 313, 9, textureX, textureY); // Box 80
		bodyModel[72] = new ModelRendererTurbo(this, 337, 9, textureX, textureY); // Box 81
		bodyModel[73] = new ModelRendererTurbo(this, 457, 9, textureX, textureY); // Box 82
		bodyModel[74] = new ModelRendererTurbo(this, 497, 9, textureX, textureY); // Box 83
		bodyModel[75] = new ModelRendererTurbo(this, 137, 17, textureX, textureY); // Box 84
		bodyModel[76] = new ModelRendererTurbo(this, 201, 17, textureX, textureY); // Box 85
		bodyModel[77] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 86
		bodyModel[78] = new ModelRendererTurbo(this, 201, 57, textureX, textureY); // Box 80
		bodyModel[79] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 81
		bodyModel[80] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 82
		bodyModel[81] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 83
		bodyModel[82] = new ModelRendererTurbo(this, 385, 17, textureX, textureY); // Box 84
		bodyModel[83] = new ModelRendererTurbo(this, 361, 57, textureX, textureY); // Box 85
		bodyModel[84] = new ModelRendererTurbo(this, 377, 57, textureX, textureY); // Box 86
		bodyModel[85] = new ModelRendererTurbo(this, 449, 57, textureX, textureY); // Box 87
		bodyModel[86] = new ModelRendererTurbo(this, 449, 65, textureX, textureY); // Box 88
		bodyModel[87] = new ModelRendererTurbo(this, 465, 65, textureX, textureY); // Box 89
		bodyModel[88] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 90
		bodyModel[89] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 91
		bodyModel[90] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 92
		bodyModel[91] = new ModelRendererTurbo(this, 369, 25, textureX, textureY); // Box 93
		bodyModel[92] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 94
		bodyModel[93] = new ModelRendererTurbo(this, 209, 33, textureX, textureY); // Box 95
		bodyModel[94] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 96
		bodyModel[95] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 97
		bodyModel[96] = new ModelRendererTurbo(this, 25, 81, textureX, textureY); // Box 98
		bodyModel[97] = new ModelRendererTurbo(this, 137, 57, textureX, textureY); // Box 99
		bodyModel[98] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 74
		bodyModel[99] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 101
		bodyModel[100] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 102
		bodyModel[101] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 103
		bodyModel[102] = new ModelRendererTurbo(this, 377, 1, textureX, textureY); // Box 104
		bodyModel[103] = new ModelRendererTurbo(this, 449, 17, textureX, textureY); // Box 129
		bodyModel[104] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 130
		bodyModel[105] = new ModelRendererTurbo(this, 457, 57, textureX, textureY); // Box 131
		bodyModel[106] = new ModelRendererTurbo(this, 489, 17, textureX, textureY); // Box 132
		bodyModel[107] = new ModelRendererTurbo(this, 385, 65, textureX, textureY); // Box 133
		bodyModel[108] = new ModelRendererTurbo(this, 449, 73, textureX, textureY); // Box 53
		bodyModel[109] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 55
		bodyModel[110] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 56
		bodyModel[111] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 57
		bodyModel[112] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 58
		bodyModel[113] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 59
		bodyModel[114] = new ModelRendererTurbo(this, 137, 81, textureX, textureY); // Box 116
		bodyModel[115] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 117
		bodyModel[116] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 118
		bodyModel[117] = new ModelRendererTurbo(this, 377, 89, textureX, textureY); // Box 119
		bodyModel[118] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 120
		bodyModel[119] = new ModelRendererTurbo(this, 17, 105, textureX, textureY); // Box 121
		bodyModel[120] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 122
		bodyModel[121] = new ModelRendererTurbo(this, 449, 9, textureX, textureY); // Box 159
		bodyModel[122] = new ModelRendererTurbo(this, 137, 25, textureX, textureY); // Box 0
		bodyModel[123] = new ModelRendererTurbo(this, 489, 9, textureX, textureY); // Box 125
		bodyModel[124] = new ModelRendererTurbo(this, 369, 57, textureX, textureY); // Box 126
		bodyModel[125] = new ModelRendererTurbo(this, 465, 241, textureX, textureY); // Box 127
		bodyModel[126] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 24
		bodyModel[127] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 25
		bodyModel[128] = new ModelRendererTurbo(this, 201, 105, textureX, textureY); // Box 375
		bodyModel[129] = new ModelRendererTurbo(this, 409, 105, textureX, textureY); // Box 376
		bodyModel[130] = new ModelRendererTurbo(this, 441, 105, textureX, textureY); // Box 377
		bodyModel[131] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 378
		bodyModel[132] = new ModelRendererTurbo(this, 209, 81, textureX, textureY); // Box 385
		bodyModel[133] = new ModelRendererTurbo(this, 497, 97, textureX, textureY); // Box 386
		bodyModel[134] = new ModelRendererTurbo(this, 457, 65, textureX, textureY); // Box 144
		bodyModel[135] = new ModelRendererTurbo(this, 489, 73, textureX, textureY); // Box 145
		bodyModel[136] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 146
		bodyModel[137] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 147
		bodyModel[138] = new ModelRendererTurbo(this, 17, 121, textureX, textureY); // Box 148
		bodyModel[139] = new ModelRendererTurbo(this, 177, 105, textureX, textureY); // Box 149
		bodyModel[140] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Box 150
		bodyModel[141] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 151
		bodyModel[142] = new ModelRendererTurbo(this, 369, 105, textureX, textureY); // Box 369
		bodyModel[143] = new ModelRendererTurbo(this, 465, 105, textureX, textureY); // Box 370
		bodyModel[144] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 371
		bodyModel[145] = new ModelRendererTurbo(this, 497, 105, textureX, textureY); // Box 387
		bodyModel[146] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 388
		bodyModel[147] = new ModelRendererTurbo(this, 201, 121, textureX, textureY); // Box 165
		bodyModel[148] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 166
		bodyModel[149] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 167
		bodyModel[150] = new ModelRendererTurbo(this, 401, 113, textureX, textureY); // Box 168
		bodyModel[151] = new ModelRendererTurbo(this, 433, 113, textureX, textureY); // Box 169
		bodyModel[152] = new ModelRendererTurbo(this, 489, 129, textureX, textureY); // Box 170
		bodyModel[153] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 171
		bodyModel[154] = new ModelRendererTurbo(this, 17, 137, textureX, textureY); // Box 172
		bodyModel[155] = new ModelRendererTurbo(this, 217, 121, textureX, textureY); // Box 173
		bodyModel[156] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 174
		bodyModel[157] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 175
		bodyModel[158] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 176
		bodyModel[159] = new ModelRendererTurbo(this, 345, 137, textureX, textureY); // Box 177
		bodyModel[160] = new ModelRendererTurbo(this, 353, 129, textureX, textureY); // Box 178
		bodyModel[161] = new ModelRendererTurbo(this, 169, 137, textureX, textureY); // Box 179
		bodyModel[162] = new ModelRendererTurbo(this, 81, 313, textureX, textureY); // Box 180
		bodyModel[163] = new ModelRendererTurbo(this, 217, 313, textureX, textureY); // Box 181
		bodyModel[164] = new ModelRendererTurbo(this, 289, 321, textureX, textureY); // Box 182
		bodyModel[165] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 183
		bodyModel[166] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 185
		bodyModel[167] = new ModelRendererTurbo(this, 1, 321, textureX, textureY); // Box 186
		bodyModel[168] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 187
		bodyModel[169] = new ModelRendererTurbo(this, 9, 81, textureX, textureY); // Box 188
		bodyModel[170] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 189
		bodyModel[171] = new ModelRendererTurbo(this, 505, 137, textureX, textureY); // Box 190
		bodyModel[172] = new ModelRendererTurbo(this, 457, 113, textureX, textureY); // Box 91
		bodyModel[173] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 92
		bodyModel[174] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 93
		bodyModel[175] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 94
		bodyModel[176] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 101
		bodyModel[177] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 196
		bodyModel[178] = new ModelRendererTurbo(this, 161, 161, textureX, textureY); // Box 197
		bodyModel[179] = new ModelRendererTurbo(this, 297, 161, textureX, textureY); // Box 198
		bodyModel[180] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 199
		bodyModel[181] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 200
		bodyModel[182] = new ModelRendererTurbo(this, 217, 361, textureX, textureY); // Box 201
		bodyModel[183] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 202
		bodyModel[184] = new ModelRendererTurbo(this, 97, 417, textureX, textureY); // Box 203
		bodyModel[185] = new ModelRendererTurbo(this, 353, 361, textureX, textureY); // Box 204
		bodyModel[186] = new ModelRendererTurbo(this, 281, 417, textureX, textureY); // Box 205
		bodyModel[187] = new ModelRendererTurbo(this, 457, 265, textureX, textureY); // Box 206
		bodyModel[188] = new ModelRendererTurbo(this, 81, 273, textureX, textureY); // Box 207
		bodyModel[189] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 208
		bodyModel[190] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 541
		bodyModel[191] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 542
		bodyModel[192] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 211
		bodyModel[193] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 213
		bodyModel[194] = new ModelRendererTurbo(this, 129, 201, textureX, textureY); // Box 214
		bodyModel[195] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 215
		bodyModel[196] = new ModelRendererTurbo(this, 57, 217, textureX, textureY); // Box 216
		bodyModel[197] = new ModelRendererTurbo(this, 153, 185, textureX, textureY); // Box 217
		bodyModel[198] = new ModelRendererTurbo(this, 49, 321, textureX, textureY); // Box 218
		bodyModel[199] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 219
		bodyModel[200] = new ModelRendererTurbo(this, 449, 201, textureX, textureY); // Box 220
		bodyModel[201] = new ModelRendererTurbo(this, 321, 249, textureX, textureY); // Box 221
		bodyModel[202] = new ModelRendererTurbo(this, 289, 273, textureX, textureY); // Box 222
		bodyModel[203] = new ModelRendererTurbo(this, 361, 321, textureX, textureY); // Box 223
		bodyModel[204] = new ModelRendererTurbo(this, 465, 297, textureX, textureY); // Box 224
		bodyModel[205] = new ModelRendererTurbo(this, 257, 217, textureX, textureY); // Box 225
		bodyModel[206] = new ModelRendererTurbo(this, 481, 225, textureX, textureY); // Box 226
		bodyModel[207] = new ModelRendererTurbo(this, 465, 225, textureX, textureY); // Box 227
		bodyModel[208] = new ModelRendererTurbo(this, 353, 249, textureX, textureY); // Box 228
		bodyModel[209] = new ModelRendererTurbo(this, 401, 105, textureX, textureY); // Box 229
		bodyModel[210] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 230
		bodyModel[211] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 231
		bodyModel[212] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 232
		bodyModel[213] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 233
		bodyModel[214] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 234
		bodyModel[215] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 235
		bodyModel[216] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 236
		bodyModel[217] = new ModelRendererTurbo(this, 321, 9, textureX, textureY); // Box 237
		bodyModel[218] = new ModelRendererTurbo(this, 505, 9, textureX, textureY); // Box 238
		bodyModel[219] = new ModelRendererTurbo(this, 193, 17, textureX, textureY); // Box 239
		bodyModel[220] = new ModelRendererTurbo(this, 193, 25, textureX, textureY); // Box 240
		bodyModel[221] = new ModelRendererTurbo(this, 361, 25, textureX, textureY); // Box 241
		bodyModel[222] = new ModelRendererTurbo(this, 377, 25, textureX, textureY); // Box 242
		bodyModel[223] = new ModelRendererTurbo(this, 97, 369, textureX, textureY); // Box 243
		bodyModel[224] = new ModelRendererTurbo(this, 401, 265, textureX, textureY); // Box 244
		bodyModel[225] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 268
		bodyModel[226] = new ModelRendererTurbo(this, 257, 233, textureX, textureY); // Box 269
		bodyModel[227] = new ModelRendererTurbo(this, 129, 249, textureX, textureY); // Box 270
		bodyModel[228] = new ModelRendererTurbo(this, 289, 289, textureX, textureY); // Box 271
		bodyModel[229] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 272
		bodyModel[230] = new ModelRendererTurbo(this, 289, 297, textureX, textureY); // Box 273
		bodyModel[231] = new ModelRendererTurbo(this, 401, 297, textureX, textureY); // Box 274
		bodyModel[232] = new ModelRendererTurbo(this, 97, 369, textureX, textureY); // Box 275
		bodyModel[233] = new ModelRendererTurbo(this, 97, 369, textureX, textureY); // Box 276
		bodyModel[234] = new ModelRendererTurbo(this, 97, 369, textureX, textureY); // Box 277

		bodyModel[0].addShapeBox(0F, 0F, 0F, 45, 12, 42, 0F,0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, -4.5F); // Box 49
		bodyModel[0].setRotationPoint(-130F, -8F, -21F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 44, 12, 42, 0F,0F, 0F, 2.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2.25F, 0F, 0F, -2.75F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.75F); // Box 50
		bodyModel[1].setRotationPoint(-85F, -8F, -21F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 24, 12, 42, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F); // Box 51
		bodyModel[2].setRotationPoint(-41F, -8F, -21F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 45, 3, 42, 0F,0F, 0.5F, 1.5F, 0F, 0.5F, 7F, 0F, 0.5F, 7F, 0F, 0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 2.25F, 0F, 0F, 2.25F, 0F, 0F, 0F); // Box 52
		bodyModel[3].setRotationPoint(-130F, -11F, -21F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 44, 3, 42, 0F,0F, 0.5F, 7F, 0F, 0.5F, 6.75F, 0F, 0.5F, 6.75F, 0F, 0.5F, 7F, 0F, 0F, 2.25F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2.25F); // Box 53
		bodyModel[4].setRotationPoint(-85F, -11F, -21F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 24, 3, 42, 0F,0F, 0.5F, 6.75F, 0F, 0.5F, 5.25F, 0F, 0.5F, 5.25F, 0F, 0.5F, 6.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 54
		bodyModel[5].setRotationPoint(-41F, -11F, -21F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 48, 12, 42, 0F,0F, 0F, 2F, 0F, 2.5F, 2.25F, 0F, 2.5F, 2.25F, 0F, 0F, 2F, 0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2.5F); // Box 55
		bodyModel[6].setRotationPoint(-17F, -8F, -21F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 48, 3, 42, 0F,0F, 0.5F, 5.25F, 0F, 0.25F, 1.5F, 0F, 0.25F, 1.5F, 0F, 0.5F, 5.25F, 0F, 0F, 2F, 0F, -2.25F, 2.25F, 0F, -2.25F, 2.25F, 0F, 0F, 2F); // Box 56
		bodyModel[7].setRotationPoint(-17F, -11F, -21F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 51, 14, 42, 0F,0F, 0.5F, 2.25F, 0F, 0.25F, -4.5F, 0F, 0.25F, -4.5F, 0F, 0.5F, 2.25F, 0F, 0F, -3.5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -3.5F); // Box 57
		bodyModel[8].setRotationPoint(31F, -10F, -21F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 51, 1, 42, 0F,0F, -0.25F, 1.5F, 0F, -0.25F, -4.5F, 0F, -0.25F, -4.5F, 0F, -0.25F, 1.5F, 0F, 0F, 2.25F, 0F, 0.25F, -4.5F, 0F, 0.25F, -4.5F, 0F, 0F, 2.25F); // Box 58
		bodyModel[9].setRotationPoint(31F, -11.5F, -21F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 45, 14, 30, 0F,0F, 0.25F, 1.5F, 5.25F, 1F, -6.25F, 5.25F, 1F, -6.25F, 0F, 0.25F, 1.5F, 0F, 0F, -3F, 0F, 0F, -11.75F, 0F, 0F, -11.75F, 0F, 0F, -3F); // Box 59
		bodyModel[10].setRotationPoint(82F, -10F, -15F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 45, 1, 30, 0F,0F, 0.25F, 1.5F, 5.25F, 1F, -6.25F, 5.25F, 1F, -6.25F, 0F, 0.25F, 1.5F, 0F, -0.25F, 1.5F, 5.25F, -1F, -6.25F, 5.25F, -1F, -6.25F, 0F, -0.25F, 1.5F); // Box 11
		bodyModel[11].setRotationPoint(82F, -11F, -15F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,-0.25F, 0F, 1.75F, 6F, 0.75F, -0.75F, 6F, 0.75F, -0.75F, -0.25F, 0F, 1.75F, -0.25F, 0F, 1.75F, 6F, -1F, -0.75F, 6F, -1F, -0.75F, -0.25F, 0F, 1.75F); // Box 13
		bodyModel[12].setRotationPoint(132F, -12F, -7F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 3, 1, 42, 0F,0F, 0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.75F); // Box 14
		bodyModel[13].setRotationPoint(-133F, -11.5F, -21F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 12, 1, 42, 0F,0F, 0F, -3.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -3.25F, 0F, 0F, -3.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -3.25F); // Box 15
		bodyModel[14].setRotationPoint(-145F, -11.5F, -21F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 5, 1, 34, 0F,-0.25F, 0F, -5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.25F, 0F, -5F, -0.25F, 0F, -5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, -0.25F, 0F, -5F); // Box 16
		bodyModel[15].setRotationPoint(-150F, -11.5F, -17F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 10, 16, 6, 0F,-4.5F, 0F, 3.25F, -0.5F, 0.25F, -1F, -0.5F, 0.25F, -1F, -4.5F, 0F, 3.25F, 5F, 0F, -1.25F, -11.75F, 0F, -2F, -11.75F, 0F, -2F, 5F, 0F, -1.25F); // Box 17
		bodyModel[16].setRotationPoint(143.5F, -12F, -3F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 4, 1, 8, 0F,0F, -0.25F, 2.25F, 1.75F, 0F, -1.5F, 1.75F, 0F, -1.5F, 0F, -0.25F, 2.25F, 0F, 0F, 2.25F, 1F, -0.25F, -2F, 1F, -0.25F, -2F, 0F, 0F, 2.25F); // Box 18
		bodyModel[17].setRotationPoint(148F, -13F, -4F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 31, 12, 20, 0F,0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.5F); // Box 19
		bodyModel[18].setRotationPoint(-18.5F, -28F, -10F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 9, 18, 20, 0F,0F, 0F, -3F, 0.15F, 0F, -3F, 0.15F, 0F, -3F, 0F, 0F, -3F, -5F, 0F, 0F, 9.75F, 0F, 0F, 9.75F, 0F, 0F, -5F, 0F, 0F); // Box 20
		bodyModel[19].setRotationPoint(-23.5F, -46F, -10F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 31, 5, 20, 0F,0F, 0F, 1.5F, 0F, 0F, 1.75F, 0F, 0F, 1.75F, 0F, 0F, 1.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F); // Box 21
		bodyModel[20].setRotationPoint(-18.5F, -16F, -10F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 43, 4, 13, 0F,-7.5F, 0F, -0.25F, -1F, 0F, -3.5F, 4F, 0F, 0F, 0F, 0F, 0.5F, -7.5F, 0.6F, 0.75F, 0.25F, 0.75F, -2F, 5.5F, 0.8F, 0F, 0.25F, 0.6F, 0F); // Box 22
		bodyModel[21].setRotationPoint(-18.5F, -16F, -25F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 43, 4, 13, 0F,0F, 0F, 0.5F, 4F, 0F, 0F, -1F, 0F, -3.5F, -7.5F, 0F, -0.25F, 0.25F, 0.6F, 0F, 5.5F, 0.8F, 0F, 0.25F, 0.75F, -2F, -7.5F, 0.6F, 0.75F); // Box 23
		bodyModel[22].setRotationPoint(-18.5F, -16F, 12F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 18, 5, 12, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[23].setRotationPoint(12F, -16F, -12F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 18, 5, 12, 0F,0F, 0F, 0F, 3.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[24].setRotationPoint(12F, -16F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 22, 7, 20, 0F,-0.75F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, 0F, 0.25F, -1.25F, -0.75F, 0.25F, -1.25F, -4.75F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, -4.75F, 0F, 0F); // Box 26
		bodyModel[25].setRotationPoint(-9.5F, -35F, -10F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 3, 19, 18, 0F,0F, 0F, -0.25F, 0.25F, 0F, -3.75F, 0.25F, 0F, -3.75F, 0F, 0F, -0.25F, 0F, 0.25F, 2.75F, 1.5F, 0.25F, -2F, 1.5F, 0.25F, -2F, 0F, 0.25F, 2.75F); // Box 27
		bodyModel[26].setRotationPoint(12.5F, -35.25F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 27, 4, 10, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, 0F); // Box 28
		bodyModel[27].setRotationPoint(-11.5F, -39F, -5F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 6, 4, 14, 0F,0.5F, -1F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 0.5F, -1F, -0.5F, 0F, 0F, 0F, 0.65F, 0F, 0F, 0.65F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[28].setRotationPoint(-21F, -50F, -7F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 3, 14, 13, 0F,0F, 0F, 0F, -1.75F, 2F, -4.25F, -1.75F, 2F, -4.25F, 0F, 0F, 0F, -7.85F, 0.75F, 2.3F, 7.25F, 0.75F, -3.5F, 7.25F, 0.75F, -3.5F, -7.85F, 0.75F, 2.3F); // Box 30
		bodyModel[29].setRotationPoint(-16.5F, -50F, -6.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 3, 4, 14, 0F,3.5F, -1.75F, -3.75F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 3.5F, -1.75F, -3.75F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(-24F, -50F, -7F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 10, 7, 11, 0F,0F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0.25F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0.5F, -0.5F, 1F, 0.5F, -0.75F, 1F, 0.5F, -0.75F, 0F, 0.5F, -0.5F); // Box 32
		bodyModel[31].setRotationPoint(-13.5F, -46.4F, -5.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 2, 7, 11, 0F,-0.25F, 0F, -1.5F, 0F, 0F, -4.25F, 0F, 0F, -4.25F, -0.25F, 0F, -1.5F, -1F, 0.5F, -0.75F, 1F, 0.5F, -3.75F, 1F, 0.5F, -3.75F, -1F, 0.5F, -0.75F); // Box 33
		bodyModel[32].setRotationPoint(-3.5F, -46.4F, -5.5F);

		bodyModel[33].addShapeBox(-0.5F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 14F, 0F, 0F, 14F, 0F, 0F, 12F, 0F, 0F, 12F, 0F); // Box 34
		bodyModel[33].setRotationPoint(-8.5F, -64.4F, 0F);
		bodyModel[33].rotateAngleX = 0.2268928F;

		bodyModel[34].addShapeBox(-0.5F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 12F, 0F, 0F, 12F, 0F, 0F, 14F, 0F, 0F, 14F, 0F); // Box 35
		bodyModel[34].setRotationPoint(-8.5F, -64.4F, 0F);
		bodyModel[34].rotateAngleX = -0.2268928F;

		bodyModel[35].addShapeBox(-0.5F, 0F, -0.5F, 1, 7, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 9F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 9F, 0F); // Box 36
		bodyModel[35].setRotationPoint(-8.5F, -64.4F, 0F);
		bodyModel[35].rotateAngleZ = -0.4712389F;

		bodyModel[36].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 37
		bodyModel[36].setRotationPoint(-10F, -65.4F, -1F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 38
		bodyModel[37].setRotationPoint(-10F, -66.4F, -1F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 40
		bodyModel[38].setRotationPoint(-10F, -68.4F, -1F);

		bodyModel[39].addShapeBox(0F, -5F, -8F, 1, 10, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[39].setRotationPoint(-8.5F, -68.4F, 0F);
		bodyModel[39].rotateAngleZ = 0.31415927F;

		bodyModel[40].addShapeBox(0F, 0F, 0F, 8, 5, 11, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 42
		bodyModel[40].setRotationPoint(16F, -27.5F, -5.5F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 2, 5, 11, 0F,0F, 0F, 0.25F, 0F, 0F, 4.25F, 0F, 0F, 4.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, 4.25F, 0F, -0.5F, 4.25F, 0F, -0.5F, 0.25F); // Box 43
		bodyModel[41].setRotationPoint(24F, -27.5F, -5.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 4, 5, 19, 0F,0F, 0F, 0.25F, 1.25F, 0F, 0.25F, 1.25F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, 0.25F); // Box 44
		bodyModel[42].setRotationPoint(26F, -27.5F, -9.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 2, 5, 19, 0F,-0.25F, 0F, 0.25F, 0.75F, 0F, -3.5F, 0.75F, 0F, -3.5F, -0.25F, 0F, 0.25F, 0.5F, -0.5F, 0.25F, 0F, -0.5F, -3.5F, 0F, -0.5F, -3.5F, 0.5F, -0.5F, 0.25F); // Box 45
		bodyModel[43].setRotationPoint(31F, -27.5F, -9.5F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 19, 13, 11, 0F,0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -0.5F, 2F, 0.5F, -0.5F, 2F, 0.5F, -0.5F, 2F, 0F, -0.5F, 2F); // Box 46
		bodyModel[44].setRotationPoint(16F, -23F, -5.5F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 5, 5, 11, 0F,0F, 0F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0.75F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.75F, -2.75F, -1.5F, 0.75F, -2.75F, -1.5F, 0.75F, 0F, 0F, 0.75F); // Box 47
		bodyModel[45].setRotationPoint(33F, -23F, -5.5F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 19, 4, 13, 0F,0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 1.5F, -0.75F, 0.75F, 1.5F, -0.75F, 0.75F, 0F, 0F, 0.75F); // Box 48
		bodyModel[46].setRotationPoint(35F, -17.5F, -6.5F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 20, 4, 13, 0F,0F, -1F, 0.75F, 1.5F, -0.25F, 0.75F, 1.5F, -0.25F, 0.75F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 3F, 0F, 0.75F, 3F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 49
		bodyModel[47].setRotationPoint(35F, -14.5F, -6.5F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 2, 2, 14, 0F,0F, 0.25F, 0.25F, -0.5F, 0.25F, -2.75F, -0.5F, 0.25F, -2.75F, 0F, 0.25F, 0.25F, -1.25F, 0.75F, 0.25F, 1F, 1F, -2.75F, 1F, 1F, -2.75F, -1.25F, 0.75F, 0.25F); // Box 50
		bodyModel[48].setRotationPoint(56.5F, -14F, -7F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 13, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[49].setRotationPoint(57.75F, -14.25F, -4.5F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 4, 3, 20, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 52
		bodyModel[50].setRotationPoint(70.75F, -14.25F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 2, 3, 20, 0F,0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, -3F, 0F, 0F, 0F); // Box 53
		bodyModel[51].setRotationPoint(74.75F, -14.25F, -10F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 15, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[52].setRotationPoint(76.25F, -14.25F, -7F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 4, 2, 14, 0F,0F, 0F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0F, 0F, 0F, -0.75F, 0.75F, 0F, 2F, -1.25F, 0F, 2F, -1.25F, 0F, -0.75F, 0.75F, 0F); // Box 55
		bodyModel[53].setRotationPoint(89.25F, -14.25F, -7F);
		bodyModel[53].rotateAngleZ = 0.48869219F;

		bodyModel[54].addShapeBox(0F, 0F, 0F, 51, 1, 50, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[54].setRotationPoint(-85F, -11.7F, -25F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 28, 1, 50, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 57
		bodyModel[55].setRotationPoint(-113F, -11.7F, -25F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 21, 1, 37, 0F,0F, 0F, 0F, 0F, 0F, 3.75F, 0F, 0F, 3.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.75F, 0F, 0F, 3.75F, 0F, 0F, 0F); // Box 58
		bodyModel[56].setRotationPoint(-134F, -11.7F, -18.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 11, 1, 30, 0F,0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3.5F, 0F, 0F, 3.5F, 0F, 0F, 0F); // Box 59
		bodyModel[57].setRotationPoint(-145F, -11.7F, -15F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 3, 1, 30, 0F,0F, 0F, -5.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F, 0F, 0F, -5.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.75F); // Box 60
		bodyModel[58].setRotationPoint(-148F, -11.7F, -15F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 4, 1, 50, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 61
		bodyModel[59].setRotationPoint(-34F, -11.7F, -25F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 2, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[60].setRotationPoint(30.9F, -35.5F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1.5F, 0F, 2F, 1.5F, 0F, 2F, 0F, 0F, 2F); // Box 69
		bodyModel[61].setRotationPoint(29.9F, -37F, -3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyModel[62].setRotationPoint(29.9F, -34F, -5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[63].setRotationPoint(29.9F, -34F, 2F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F); // Box 72
		bodyModel[64].setRotationPoint(31.5F, -38F, -3.7F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.9F, -2F, 0.5F, 0.7F, -1.5F, 0.5F, 0.7F, -1.5F, 0F, -0.9F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F); // Box 73
		bodyModel[65].setRotationPoint(32.9F, -34.2F, -6.3F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, -0.9F, -2F, 0.5F, 0.7F, -1.5F, 0.5F, 0.7F, -1.5F, 0F, -0.9F, -2F); // Box 74
		bodyModel[66].setRotationPoint(32.9F, -31.2F, -6.3F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, -0.9F, -2F, 0.5F, 0.7F, -1.5F, 0.5F, 0.7F, -1.5F, 0F, -0.9F, -2F); // Box 75
		bodyModel[67].setRotationPoint(32.9F, -31.2F, 1.3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F); // Box 76
		bodyModel[68].setRotationPoint(32.9F, -33.2F, 1.3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.9F, -2F, 0.5F, 0.7F, -1.5F, 0.5F, 0.7F, -1.5F, 0F, -0.9F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F); // Box 77
		bodyModel[69].setRotationPoint(32.9F, -34.2F, 1.3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F); // Box 78
		bodyModel[70].setRotationPoint(32.9F, -33.2F, -6.3F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F); // Box 80
		bodyModel[71].setRotationPoint(31.5F, -39F, -3.7F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.75F, 0F, -1F); // Box 81
		bodyModel[72].setRotationPoint(31.5F, -37F, -3.7F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.75F, 0F, -1F); // Box 82
		bodyModel[73].setRotationPoint(31.5F, -37F, 0.699999999999999F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F); // Box 83
		bodyModel[74].setRotationPoint(31.5F, -38F, 0.699999999999999F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F); // Box 84
		bodyModel[75].setRotationPoint(31.5F, -39F, 0.699999999999999F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyModel[76].setRotationPoint(29.5F, -38F, -3F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 86
		bodyModel[77].setRotationPoint(29.5F, -38F, 1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 2, 20, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 80
		bodyModel[78].setRotationPoint(14.9F, -46.5F, -1F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 2, 3, 6, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 1.5F, 0F, 2F, 1.5F, 0F, 2F, 0F, 0F, 2F); // Box 81
		bodyModel[79].setRotationPoint(13.9F, -48F, -3F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyModel[80].setRotationPoint(13.9F, -45F, -5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 3, 3, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[81].setRotationPoint(13.9F, -45F, 2F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F); // Box 84
		bodyModel[82].setRotationPoint(15.5F, -49F, -3.7F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.9F, -2F, 0.5F, 0.7F, -1.5F, 0.5F, 0.7F, -1.5F, 0F, -0.9F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F); // Box 85
		bodyModel[83].setRotationPoint(16.9F, -45.2F, -6.3F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, -0.9F, -2F, 0.5F, 0.7F, -1.5F, 0.5F, 0.7F, -1.5F, 0F, -0.9F, -2F); // Box 86
		bodyModel[84].setRotationPoint(16.9F, -42.2F, -6.3F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, -0.9F, -2F, 0.5F, 0.7F, -1.5F, 0.5F, 0.7F, -1.5F, 0F, -0.9F, -2F); // Box 87
		bodyModel[85].setRotationPoint(16.9F, -42.2F, 1.3F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F); // Box 88
		bodyModel[86].setRotationPoint(16.9F, -44.2F, 1.3F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.9F, -2F, 0.5F, 0.7F, -1.5F, 0.5F, 0.7F, -1.5F, 0F, -0.9F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F); // Box 89
		bodyModel[87].setRotationPoint(16.9F, -45.2F, 1.3F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 1, 2, 5, 0F,0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -2F); // Box 90
		bodyModel[88].setRotationPoint(16.9F, -44.2F, -6.3F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F); // Box 91
		bodyModel[89].setRotationPoint(15.5F, -50F, -3.7F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.75F, 0F, -1F); // Box 92
		bodyModel[90].setRotationPoint(15.5F, -48F, -3.7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.75F, 0F, -1F); // Box 93
		bodyModel[91].setRotationPoint(15.5F, -48F, 0.699999999999999F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F); // Box 94
		bodyModel[92].setRotationPoint(15.5F, -49F, 0.699999999999999F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,-0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.75F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -1F); // Box 95
		bodyModel[93].setRotationPoint(15.5F, -50F, 0.699999999999999F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[94].setRotationPoint(13.5F, -49F, -3F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[95].setRotationPoint(13.5F, -49F, 1F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 1, 5, 0F,0.1F, 0F, 0F, 0.25F, 0F, -1.75F, 0.25F, 0F, -1.75F, 0.1F, 0F, 0F, 0.1F, 0.75F, 0F, 0.25F, -0.25F, -1.75F, 0.25F, -0.25F, -1.75F, 0.1F, 0.75F, 0F); // Box 98
		bodyModel[96].setRotationPoint(15.8F, -39F, -2.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.1F, 0F, 0F, 0.35F, 0F, 0F, 0.25F, -0.75F, -1F, 0.25F, -0.75F, -1F, 0.35F, 0F, 0F); // Box 99
		bodyModel[97].setRotationPoint(33.8F, -27.5F, -1.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 74
		bodyModel[98].setRotationPoint(30.7F, -28F, -10F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 2, 1, 3, 0F,0.1F, 0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0.1F, 0F, 0F, 0.35F, 0F, 0F, 0.25F, -0.75F, -1F, 0.25F, -0.75F, -1F, 0.35F, 0F, 0F); // Box 101
		bodyModel[99].setRotationPoint(33.8F, -27.5F, -1.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 102
		bodyModel[100].setRotationPoint(30.7F, -28F, 9F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 103
		bodyModel[101].setRotationPoint(25.7F, -28F, 9F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 104
		bodyModel[102].setRotationPoint(25.7F, -28F, -10F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 129
		bodyModel[103].setRotationPoint(42.5F, -24.2F, 1.8F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 130
		bodyModel[104].setRotationPoint(45.5F, -24.5F, -3.2F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0.2F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, -0.1F); // Box 131
		bodyModel[105].setRotationPoint(46.5F, -24F, -1.2F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 132
		bodyModel[106].setRotationPoint(42.5F, -24.2F, -3F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 133
		bodyModel[107].setRotationPoint(46.9F, -22F, -1.2F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 7, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[108].setRotationPoint(103.5F, -17F, -1.2F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[109].setRotationPoint(104.1F, -18F, -3.2F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[110].setRotationPoint(101.1F, -17F, 1.8F);
		bodyModel[110].rotateAngleZ = 0.26179939F;

		bodyModel[111].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 57
		bodyModel[111].setRotationPoint(101.1F, -17F, -3F);
		bodyModel[111].rotateAngleZ = 0.26179939F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, 2.5F, 0F, -0.4F, -0.4F, 0F, 0.6F, -0.4F, 0F, 0.6F, 2.5F, 0F, -0.4F); // Box 58
		bodyModel[112].setRotationPoint(57.5F, -25.5F, -0.5F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 59
		bodyModel[113].setRotationPoint(57.5F, -28.5F, -0.5F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 5, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[114].setRotationPoint(81.9F, -18.5F, -1.2F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 5, 2, 2, 0F,0F, 0.2F, -0.1F, 0F, -0.8F, -0.1F, 0F, -0.8F, -0.1F, 0F, 0.2F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, -0.1F, 0F, 0.7F, -0.1F); // Box 117
		bodyModel[115].setRotationPoint(81.5F, -20.5F, -1.2F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[116].setRotationPoint(77.5F, -20.7F, 1.8F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 119
		bodyModel[117].setRotationPoint(80.5F, -21F, -3.2F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 120
		bodyModel[118].setRotationPoint(77.5F, -20.7F, -3F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 121
		bodyModel[119].setRotationPoint(116.25F, -13.5F, -4F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 5, 2, 8, 0F,0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F); // Box 122
		bodyModel[120].setRotationPoint(111.25F, -13.5F, -4F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[121].setRotationPoint(117.25F, -15.8F, -0.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[122].setRotationPoint(116.35F, -16.5F, -1.05F);
		bodyModel[122].rotateAngleZ = 0.15707963F;

		bodyModel[123].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 125
		bodyModel[123].setRotationPoint(134.5F, -14.5F, -0.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 126
		bodyModel[124].setRotationPoint(133.6F, -15.2F, -1.05F);
		bodyModel[124].rotateAngleZ = 0.15707963F;

		bodyModel[125].addShapeBox(0F, 0F, 0F, 2, 3, 20, 0F,-3.75F, 2.25F, -7F, 2.75F, 2F, -7F, 2.75F, 2F, -7F, -3.75F, 2.25F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 127
		bodyModel[125].setRotationPoint(70.75F, -17.25F, -10F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0.1F, 0.25F, 0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 1.3F, 0F, 0.75F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 24
		bodyModel[126].setRotationPoint(44F, -17.05F, 15F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0.2F, 0.5F, -0.5F, 0.1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 1.3F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 25
		bodyModel[127].setRotationPoint(44F, -17.05F, 17F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0.25F, 0.75F, -0.4F, 0.25F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, 0.35F, -0.8F, 1.5F, 0.35F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 375
		bodyModel[128].setRotationPoint(34F, -15.75F, 14F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0.25F, -0.4F, 0.25F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0.25F, -0.5F, 0.35F, -0.8F, 0F, 0.6F, -0.75F, 0F, 0.6F, -0.75F, -0.5F, 0.35F, -0.8F); // Box 376
		bodyModel[129].setRotationPoint(40F, -15.75F, 14F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, 0.5F, 0.75F, -0.4F, -1F, 0.75F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, 0.6F, -0.75F, -0.25F, 0.35F, -2.05F, -0.25F, 0.35F, -2.05F, 0F, 0.6F, -0.75F); // Box 377
		bodyModel[130].setRotationPoint(48F, -15.75F, 14F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 378
		bodyModel[131].setRotationPoint(39F, -17.05F, 15F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 385
		bodyModel[132].setRotationPoint(41F, -13.25F, 15F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 386
		bodyModel[133].setRotationPoint(49F, -13.25F, 15F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.5F, 0F, 0.2F, 0.5F, -0.5F, 0.1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 2F, 0F, 0.5F, 1.3F, 0F, 0.75F, 0F, 0F, 0.75F); // Box 144
		bodyModel[134].setRotationPoint(44F, -17.05F, -16F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, 0.25F, -0.5F, 0.1F, 0.25F, 0F, 0.2F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.75F, 1.3F, 0F, 0.75F, 2F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 145
		bodyModel[135].setRotationPoint(44F, -17.05F, -18F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0.25F, 0.75F, -0.4F, 0.25F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, 0.35F, -0.8F, 1.5F, 0.35F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 146
		bodyModel[136].setRotationPoint(34F, -15.75F, -19F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 8, 3, 5, 0F,0.25F, -0.4F, 0.25F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0.25F, -0.5F, 0.35F, -0.8F, 0F, 0.6F, -0.75F, 0F, 0.6F, -0.75F, -0.5F, 0.35F, -0.8F); // Box 147
		bodyModel[137].setRotationPoint(40F, -15.75F, -19F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, -0.4F, 0.5F, 0.75F, -0.4F, -1F, 0.75F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, 0.6F, -0.75F, -0.25F, 0.35F, -2.05F, -0.25F, 0.35F, -2.05F, 0F, 0.6F, -0.75F); // Box 148
		bodyModel[138].setRotationPoint(48F, -15.75F, -19F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 149
		bodyModel[139].setRotationPoint(39F, -17.05F, -18F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 150
		bodyModel[140].setRotationPoint(41F, -13.25F, -18F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 151
		bodyModel[141].setRotationPoint(49F, -13.25F, -18F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0F, 0.75F, -0.4F, 0F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, -0.15F, -0.8F, 1.5F, -0.15F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 369
		bodyModel[142].setRotationPoint(56.5F, -17.5F, 0.75F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0.25F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0F, -0.5F, -0.15F, -0.8F, 0F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, -0.5F, -0.15F, -0.8F); // Box 370
		bodyModel[143].setRotationPoint(60.5F, -17.5F, 0.75F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.4F, 0.5F, 0.25F, -0.4F, -1F, 0.25F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.15F, -0.75F, -0.5F, -0.4F, -2.05F, -0.5F, -0.4F, -2.05F, 0F, -0.15F, -0.75F); // Box 371
		bodyModel[144].setRotationPoint(66.5F, -17.5F, 0.75F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 387
		bodyModel[145].setRotationPoint(58.5F, -16F, 1.25F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 388
		bodyModel[146].setRotationPoint(66.5F, -16F, 1.25F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0F, 0.75F, -0.4F, 0F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, -0.15F, -0.8F, 1.5F, -0.15F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 165
		bodyModel[147].setRotationPoint(56.5F, -17.5F, -4.75F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0.25F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0F, -0.5F, -0.15F, -0.8F, 0F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, -0.5F, -0.15F, -0.8F); // Box 166
		bodyModel[148].setRotationPoint(60.5F, -17.5F, -4.75F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.4F, 0.5F, 0.25F, -0.4F, -1F, 0.25F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.15F, -0.75F, -0.5F, -0.4F, -2.05F, -0.5F, -0.4F, -2.05F, 0F, -0.15F, -0.75F); // Box 167
		bodyModel[149].setRotationPoint(66.5F, -17.5F, -4.75F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 168
		bodyModel[150].setRotationPoint(58.5F, -16F, -4.25F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 169
		bodyModel[151].setRotationPoint(66.5F, -16F, -4.25F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0.25F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0F, -0.5F, -0.15F, -0.8F, 0F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, -0.5F, -0.15F, -0.8F); // Box 170
		bodyModel[152].setRotationPoint(-141F, -6F, 10.75F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0F, 0.75F, -0.4F, 0F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, -0.15F, -0.8F, 1.5F, -0.15F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 171
		bodyModel[153].setRotationPoint(-145F, -6F, 10.75F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.4F, 0.5F, 0.25F, -0.4F, -1F, 0.25F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.15F, -0.75F, -0.5F, -0.4F, -2.05F, -0.5F, -0.4F, -2.05F, 0F, -0.15F, -0.75F); // Box 172
		bodyModel[154].setRotationPoint(-135F, -6F, 10.75F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 173
		bodyModel[155].setRotationPoint(-143F, -4.5F, 11.25F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 174
		bodyModel[156].setRotationPoint(-135F, -4.5F, 11.25F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 6, 3, 4, 0F,0.25F, -0.4F, 0F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0.5F, 0.25F, -0.4F, 0F, -0.5F, -0.15F, -0.8F, 0F, -0.15F, -0.75F, 0F, -0.15F, -0.75F, -0.5F, -0.15F, -0.8F); // Box 175
		bodyModel[157].setRotationPoint(-141F, -6F, -14.75F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 3, 3, 4, 0F,0F, -0.4F, -0.75F, 0.75F, -0.4F, 0F, 0.75F, -0.4F, 0F, 0F, -0.4F, -0.75F, -0.25F, -0.65F, -1.25F, 1.5F, -0.15F, -0.8F, 1.5F, -0.15F, -0.8F, -0.25F, -0.65F, -1.25F); // Box 176
		bodyModel[158].setRotationPoint(-145F, -6F, -14.75F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.4F, 0.5F, 0.25F, -0.4F, -1F, 0.25F, -0.4F, -1F, 0F, -0.4F, 0.5F, 0F, -0.15F, -0.75F, -0.5F, -0.4F, -2.05F, -0.5F, -0.4F, -2.05F, 0F, -0.15F, -0.75F); // Box 177
		bodyModel[159].setRotationPoint(-135F, -6F, -14.75F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 178
		bodyModel[160].setRotationPoint(-143F, -4.5F, -14.25F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 1, 3, 3, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Box 179
		bodyModel[161].setRotationPoint(-135F, -4.5F, -14.25F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 45, 9, 42, 0F,0F, 0F, -4.5F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, -4.5F, 0F, -4.5F, -7.75F, 0F, -0.5F, -7.5F, 0F, -0.5F, -7.5F, 0F, -4.5F, -7.75F); // Box 180
		bodyModel[162].setRotationPoint(-130F, 4F, -21F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 15, 5, 36, 0F,0F, 0.5F, -3.25F, 0F, 0.5F, 0.55F, 0F, 0.5F, 0.55F, 0F, 0.5F, -3.25F, -2F, 0F, -7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -7F); // Box 181
		bodyModel[163].setRotationPoint(-145F, -1F, -18F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 15, 3, 36, 0F,-2F, 0F, -7F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -2F, 0F, -7F, -6.25F, 0.5F, -10F, 0F, 1.5F, -4.75F, 0F, 1.5F, -4.75F, -6.25F, 0.5F, -10F); // Box 182
		bodyModel[164].setRotationPoint(-145F, 4F, -18F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,-0.5F, -6F, -0.25F, 0F, 0F, 3F, 0F, 0F, -2.5F, -0.25F, -6F, 0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F); // Box 183
		bodyModel[165].setRotationPoint(-134F, -8F, -18F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 4, 7, 1, 0F,-0.25F, -6F, 0.25F, 0F, 0F, -2.5F, 0F, 0F, 3F, -0.5F, -6F, -0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -0.5F, -0.5F); // Box 185
		bodyModel[166].setRotationPoint(-134F, -8F, 17F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 3, 5, 36, 0F,1.75F, 0.5F, -7.7F, 0F, 0.5F, -3.25F, 0F, 0.5F, -3.25F, 1.75F, 0.5F, -7.7F, -1.25F, -2.75F, -7.25F, 2F, 0F, -7F, 2F, 0F, -7F, -1.25F, -2.75F, -7.25F); // Box 186
		bodyModel[167].setRotationPoint(-148F, -1F, -18F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 187
		bodyModel[168].setRotationPoint(-147F, -11F, -13F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 188
		bodyModel[169].setRotationPoint(-147F, -11F, 12F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 189
		bodyModel[170].setRotationPoint(-149.8F, -11F, -7.5F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F, -0.2F, -0.5F, -0.2F); // Box 190
		bodyModel[171].setRotationPoint(-149.8F, -11F, 6.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 91
		bodyModel[172].setRotationPoint(-14.75F, -28.5F, 8.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		bodyModel[173].setRotationPoint(-14.75F, -32.2F, 8F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 93
		bodyModel[174].setRotationPoint(-15F, -38.7F, 7.5F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 94
		bodyModel[175].setRotationPoint(-15F, -42F, 6.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,0F, 0F, 0F, 1.25F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 1.25F, 1F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F); // Box 101
		bodyModel[176].setRotationPoint(-17.5F, -35F, 8.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 196
		bodyModel[177].setRotationPoint(6.25F, -24.5F, -14F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 197
		bodyModel[178].setRotationPoint(6.25F, -28.2F, -13.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[179].setRotationPoint(1.5F, -34.7F, -12.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 199
		bodyModel[180].setRotationPoint(1.5F, -38F, -11.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 7, 2, 5, 0F,-3F, 0F, 0F, -0.5F, 0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, 1.25F, 1F, 0F, 0F, 1F, 0F); // Box 200
		bodyModel[181].setRotationPoint(3.5F, -31F, -12.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 44, 9, 42, 0F,0F, 0F, -2.75F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.75F, 0F, -0.5F, -7.5F, 0F, 2F, -7.5F, 0F, 2F, -7.5F, 0F, -0.5F, -7.5F); // Box 201
		bodyModel[182].setRotationPoint(-85F, 4F, -21F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 24, 11, 42, 0F,0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -2.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F, 0F, 0F, -7.5F); // Box 202
		bodyModel[183].setRotationPoint(-41F, 4F, -21F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 48, 11, 42, 0F,0F, 0F, -2.5F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -2.5F, 0F, 0F, -7.5F, 0F, 0.25F, -9F, 0F, 0.25F, -9F, 0F, 0F, -7.5F); // Box 203
		bodyModel[184].setRotationPoint(-17F, 4F, -21F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 45, 11, 30, 0F,0F, 0F, -3F, 0F, 0F, -11.75F, 0F, 0F, -11.75F, 0F, 0F, -3F, 0F, 0.25F, -7.25F, -3.25F, 1F, -14.5F, -3.25F, 1F, -14.5F, 0F, 0.25F, -7.25F); // Box 204
		bodyModel[185].setRotationPoint(82F, 4F, -15F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 51, 11, 42, 0F,0F, 0F, -3.5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -3.5F, 0F, 0.25F, -9F, 0F, 0.25F, -13.25F, 0F, 0.25F, -13.25F, 0F, 0.25F, -9F); // Box 205
		bodyModel[186].setRotationPoint(31F, 4F, -21F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 10, 15, 14, 0F,0F, 0F, 1.75F, 6F, 1F, -0.75F, 6F, 1F, -0.75F, 0F, 0F, 1.75F, 5F, 0F, -3.75F, -3.5F, 0F, -5.25F, -3.5F, 0F, -5.25F, 5F, 0F, -3.75F); // Box 206
		bodyModel[187].setRotationPoint(132F, -11F, -7F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 10, 11, 14, 0F,5F, 0F, -3.75F, -3.5F, 0F, -5.25F, -3.5F, 0F, -5.25F, 5F, 0F, -3.75F, 8.25F, 1F, -6.5F, -11F, 1F, -6.75F, -11F, 1F, -6.75F, 8.25F, 1F, -6.5F); // Box 207
		bodyModel[188].setRotationPoint(132F, 4F, -7F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 10, 11, 6, 0F,5F, 0F, -1.25F, -11.75F, 0F, -2F, -11.75F, 0F, -2F, 5F, 0F, -1.25F, 12.5F, 1F, -2.75F, -18.25F, -1.25F, -2.5F, -18.25F, -1.25F, -2.5F, 12.5F, 1F, -2.75F); // Box 208
		bodyModel[189].setRotationPoint(143.5F, 4F, -3F);

		bodyModel[190].addShapeBox(-1F, 0F, 0F, 1, 1, 10, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[190].setRotationPoint(123F, -13F, 0F);
		bodyModel[190].rotateAngleX = -0.13962634F;
		bodyModel[190].rotateAngleY = 0.61086524F;
		bodyModel[190].rotateAngleZ = -0.19198622F;

		bodyModel[191].addShapeBox(-1F, 0F, -10F, 1, 1, 10, 0F,0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 542
		bodyModel[191].setRotationPoint(123F, -13F, 0F);
		bodyModel[191].rotateAngleX = 0.13962634F;
		bodyModel[191].rotateAngleY = -0.61086524F;
		bodyModel[191].rotateAngleZ = -0.19198622F;

		bodyModel[192].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,1.8F, 0F, 0.05F, 0.05F, 0F, 0.05F, -1.2F, 0F, 0.3F, 0.55F, 0F, 0.3F, 1.8F, -0.75F, 0.05F, 0.05F, -0.75F, 0.05F, -1.2F, -1.75F, 0.3F, 0.55F, -1.75F, 0.3F); // Box 211
		bodyModel[192].setRotationPoint(-10F, -57F, 0F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 2, 4, 12, 0F,0.55F, 0F, 0.3F, -1.2F, 0F, 0.3F, 0.05F, 0F, 0.05F, 1.8F, 0F, 0.05F, 0.55F, -1.75F, 0.3F, -1.2F, -1.75F, 0.3F, 0.05F, -0.75F, 0.05F, 1.8F, -0.75F, 0.05F); // Box 213
		bodyModel[193].setRotationPoint(-10F, -57F, -12F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F,1.3F, 0F, 0.05F, 0.05F, 0F, 0.05F, -1.2F, 0F, 0.3F, 0.3F, 0F, 0.3F, 1.3F, -0.75F, 0.05F, 0.05F, -0.75F, 0.05F, -1.2F, -1.75F, 0.3F, 0.3F, -1.75F, 0.3F); // Box 214
		bodyModel[194].setRotationPoint(-10F, -53F, 0F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 4, 11, 0F,0.3F, 0F, 0.3F, -1.2F, 0F, 0.3F, 0.05F, 0F, 0.05F, 1.3F, 0F, 0.05F, 0.3F, -1.75F, 0.3F, -1.2F, -1.75F, 0.3F, 0.05F, -0.75F, 0.05F, 1.3F, -0.75F, 0.05F); // Box 215
		bodyModel[195].setRotationPoint(-10F, -53F, -11F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F); // Box 216
		bodyModel[196].setRotationPoint(-137F, -5F, -4F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 5, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 217
		bodyModel[197].setRotationPoint(-23.5F, -27F, -2.5F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 12, 2, 24, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 218
		bodyModel[198].setRotationPoint(-22.5F, -25F, -12F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,-3.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[199].setRotationPoint(-22.5F, -25F, -17F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 12, 2, 5, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -3.5F, 0F, 0F); // Box 220
		bodyModel[200].setRotationPoint(-22.5F, -25F, 12F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F,-3.5F, 0F, 0F, -1.25F, 0F, 0F, 2.25F, 0F, 0F, 0.25F, 0F, 0F, -3.5F, 0F, 0F, -1.25F, 0F, 0F, 2.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 221
		bodyModel[201].setRotationPoint(16.5F, -25.2F, -12.5F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 12, 2, 7, 0F,0.25F, 0F, 0F, 2.25F, 0F, 0F, -1.25F, 0F, 0F, -3.5F, 0F, 0F, 0.25F, 0F, 0F, 2.25F, 0F, 0F, -1.25F, 0F, 0F, -3.5F, 0F, 0F); // Box 222
		bodyModel[202].setRotationPoint(16.5F, -25.2F, 5.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 22, 2, 20, 0F,0.5F, 0.25F, -1.75F, 0F, 0.25F, -1.5F, 0F, 0.25F, -1.5F, 0.25F, 0.25F, -1.75F, -0.5F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, -0.75F, 0F, -1.5F); // Box 223
		bodyModel[203].setRotationPoint(-9.5F, -37F, -10F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 3, 2, 20, 0F,0F, 0.25F, -1.5F, 0F, 0.25F, -5.25F, 0F, 0.25F, -5.25F, 0F, 0.25F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -5.25F, 0F, 0F, -5.25F, 0F, 0F, -1.5F); // Box 224
		bodyModel[204].setRotationPoint(12.5F, -37F, -10F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0.5F, 0.25F, -1.25F, 1.25F, 0.25F, -1.5F, 0F, 0.25F, -2F, -0.75F, 0.25F, -2F, 0.5F, 0F, -1.5F, 1.25F, 0F, -1.5F, 0F, 0F, -2F, -0.75F, 0F, -2F); // Box 225
		bodyModel[205].setRotationPoint(2.5F, -37F, 7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,-0.75F, 0.25F, -2F, 0F, 0.25F, -2F, 3.25F, 0.25F, -1F, 0.75F, 0.25F, -1.25F, -0.75F, 0F, -2F, 0F, 0F, -2F, 3.25F, 0F, -1F, 0.75F, 0F, -1.5F); // Box 226
		bodyModel[206].setRotationPoint(-16.5F, -37F, -14F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F); // Box 227
		bodyModel[207].setRotationPoint(-19.25F, -48.75F, -16F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 10, 0F,0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 228
		bodyModel[208].setRotationPoint(-19.25F, -48.75F, 6F);

		bodyModel[209].addShapeBox(-0.5F, -4F, -0.5F, 1, 5, 1, 0F,-0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 229
		bodyModel[209].setRotationPoint(-18.75F, -25F, 16.5F);
		bodyModel[209].rotateAngleX = 0.08726646F;

		bodyModel[210].addShapeBox(-0.5F, -4F, -0.5F, 1, 5, 1, 0F,-0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 230
		bodyModel[210].setRotationPoint(-18.75F, -25F, 16F);
		bodyModel[210].rotateAngleX = 0.13962634F;

		bodyModel[211].addShapeBox(-0.5F, -4F, -0.5F, 1, 5, 1, 0F,-0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 231
		bodyModel[211].setRotationPoint(-18.75F, -25F, 15.5F);
		bodyModel[211].rotateAngleX = 0.19198622F;

		bodyModel[212].addShapeBox(-0.5F, -4F, -0.5F, 1, 5, 1, 0F,-0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 232
		bodyModel[212].setRotationPoint(-18.75F, -25F, 15F);
		bodyModel[212].rotateAngleX = 0.2443461F;

		bodyModel[213].addShapeBox(-0.5F, -4F, -0.5F, 1, 5, 1, 0F,-0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 233
		bodyModel[213].setRotationPoint(-18.75F, -25F, -16.5F);
		bodyModel[213].rotateAngleX = -0.08726646F;

		bodyModel[214].addShapeBox(-0.5F, -4F, -0.5F, 1, 5, 1, 0F,-0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 234
		bodyModel[214].setRotationPoint(-18.75F, -25F, -16F);
		bodyModel[214].rotateAngleX = -0.13962634F;

		bodyModel[215].addShapeBox(-0.5F, -4F, -0.5F, 1, 5, 1, 0F,-0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 235
		bodyModel[215].setRotationPoint(-18.75F, -25F, -15.5F);
		bodyModel[215].rotateAngleX = -0.19198622F;

		bodyModel[216].addShapeBox(-0.5F, -4F, -0.5F, 1, 5, 1, 0F,-0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 19.5F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 236
		bodyModel[216].setRotationPoint(-18.75F, -25F, -15F);
		bodyModel[216].rotateAngleX = -0.2443461F;

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 237
		bodyModel[217].setRotationPoint(3F, -37F, -4F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 18F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F); // Box 238
		bodyModel[218].setRotationPoint(3F, -37F, 3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F); // Box 239
		bodyModel[219].setRotationPoint(-19.25F, -57.75F, -14.75F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F); // Box 240
		bodyModel[220].setRotationPoint(-19.25F, -57.75F, -8.25F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F); // Box 241
		bodyModel[221].setRotationPoint(-19.25F, -57.75F, 13.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F, -0.4F, 8F, -0.4F); // Box 242
		bodyModel[222].setRotationPoint(-19.25F, -57.75F, 7.25F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 15, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 243
		bodyModel[223].setRotationPoint(-76F, -11.75F, -19.5F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,-2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 244
		bodyModel[224].setRotationPoint(15F, -18F, 14F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,-2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, -2.5F, 0F, -2.5F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F); // Box 268
		bodyModel[225].setRotationPoint(-8F, -18F, -23.5F);

		bodyModel[226].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[226].setRotationPoint(-3F, -16.2F, 25.5F);
		bodyModel[226].rotateAngleY = -0.08726646F;

		bodyModel[227].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[227].setRotationPoint(-3F, -16.7F, 24.1F);
		bodyModel[227].rotateAngleY = -0.08726646F;

		bodyModel[228].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[228].setRotationPoint(-3F, -17F, 22.9F);
		bodyModel[228].rotateAngleY = -0.08726646F;

		bodyModel[229].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[229].setRotationPoint(2F, -16.2F, -24.5F);
		bodyModel[229].rotateAngleY = 0.08726646F;

		bodyModel[230].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[230].setRotationPoint(2F, -16.7F, -23.3F);
		bodyModel[230].rotateAngleY = 0.08726646F;

		bodyModel[231].addShapeBox(0F, 0F, -0.5F, 14, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[231].setRotationPoint(2F, -17F, -21.9F);
		bodyModel[231].rotateAngleY = 0.08726646F;

		bodyModel[232].addShapeBox(0F, 0F, 0F, 15, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[232].setRotationPoint(-47F, -11.75F, 6.5F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 15, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 276
		bodyModel[233].setRotationPoint(-110.5F, -11.75F, 6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 15, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 277
		bodyModel[234].setRotationPoint(-141.5F, -11.75F, -12.25F);
	}

	private void initGuns() {
	}
	{

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[7];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 245
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 246
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 247
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 248
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 249
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Box 250
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 251

		gun_2_Model[0][0].addShapeBox(1F, 1.5F, -3.5F, 2, 1, 7, 0F,-0.5F, 1F, 0.25F, 0.5F, -0.25F, -1F, 0.5F, -0.25F, -1F, -0.5F, 1F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0.25F); // Box 245

		gun_2_Model[0][1].addShapeBox(-1F, 0.5F, -3.5F, 2, 2, 7, 0F,0F, 1F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 246

		gun_2_Model[0][2].addShapeBox(-2F, 0.5F, -3.5F, 1, 2, 7, 0F,0.5F, 1.25F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0.5F, 1.25F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 247

		gun_2_Model[0][3].addShapeBox(-4F, 0.5F, -3.5F, 1, 2, 7, 0F,0.75F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.75F, 0.5F, -0.5F, 0.75F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, -0.5F); // Box 248

		gun_2_Model[0][4].addShapeBox(-3F, 0.5F, -3.5F, 1, 2, 7, 0F,0.5F, 0.5F, 0F, -0.5F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0F); // Box 249

		gun_2_Model[0][5].addShapeBox(-4F, -1F, -3.5F, 2, 1, 7, 0F,0.75F, -0.25F, -1.25F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, -0.5F); // Box 250

		gun_2_Model[0][6].addShapeBox(-4F, -1.7F, -2.5F, 3, 1, 5, 0F,-2.25F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -2.25F, 0.25F, -0.75F, 0.75F, -0.05F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.75F, -0.05F, -0.25F); // Box 251

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(18.5F, -19.5F, 17.5F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[2];
		gun_2_Model[1][0] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 264
		gun_2_Model[1][1] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 265

		gun_2_Model[1][0].addShapeBox(3F, -0.5F, -0.05F, 6, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 264

		gun_2_Model[1][1].addShapeBox(3F, -0.5F, -0.95F, 6, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 265

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[1])
		{
			gunPart.setRotationPoint(18.5F, -19.5F, 17.5F);
		}


		gun_2_Model[2] = new ModelRendererTurbo[14];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 252
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 253
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 254
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 255
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 256
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 257
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 258
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 259
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 260
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 261
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 262
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 263
		gun_2_Model[2][12] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 266
		gun_2_Model[2][13] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 267

		gun_2_Model[2][0].addShapeBox(-2.5F, -1F, -1F, 5, 2, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 252

		gun_2_Model[2][1].addShapeBox(-2.5F, -2F, -1F, 5, 1, 2, 0F,-1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 253

		gun_2_Model[2][2].addShapeBox(-2.5F, 1F, -1F, 5, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F); // Box 254

		gun_2_Model[2][3].addShapeBox(-2.5F, -2F, -3F, 5, 1, 2, 0F,-1.6F, 0.25F, -0.5F, -1.6F, 0.25F, -0.5F, -1.6F, 0.75F, 0F, -1.6F, 0.75F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F); // Box 255

		gun_2_Model[2][4].addShapeBox(-2.5F, 1F, -3F, 5, 1, 2, 0F,-0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -1.6F, 0F, -0.5F, -1.35F, 0F, -0.5F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F); // Box 256

		gun_2_Model[2][5].addShapeBox(-2.5F, -1F, -3F, 5, 2, 2, 0F,-0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F); // Box 257

		gun_2_Model[2][6].addShapeBox(-2.5F, -2F, 1F, 5, 1, 2, 0F,-1.6F, 0.75F, 0F, -1.6F, 0.75F, 0F, -1.6F, 0.25F, -0.5F, -1.6F, 0.25F, -0.5F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F); // Box 258

		gun_2_Model[2][7].addShapeBox(-2.5F, 1F, 1F, 5, 1, 2, 0F,0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0F, -0.5F, -1.6F, 0F, -0.5F); // Box 259

		gun_2_Model[2][8].addShapeBox(-2.5F, -1F, 1F, 5, 2, 2, 0F,0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 260

		gun_2_Model[2][9].addShapeBox(1.7F, -0.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 261

		gun_2_Model[2][10].addShapeBox(2F, -0.5F, -0.95F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 262

		gun_2_Model[2][11].addShapeBox(2F, -0.5F, -0.05F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 263

		gun_2_Model[2][12].addShapeBox(3F, -0.5F, -0.05F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 266

		gun_2_Model[2][13].addShapeBox(3F, -0.5F, -0.95F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 267

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(18.5F, -19.5F, 17.5F);
		}


		registerGunModel("AK725Port", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[7];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 245
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 17, 217, textureX, textureY); // Box 246
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 25, 193, textureX, textureY); // Box 247
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 248
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 249
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Box 250
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 251

		gun_3_Model[0][0].addShapeBox(1F, 1.5F, -3.5F, 2, 1, 7, 0F,-0.5F, 1F, 0.25F, 0.5F, -0.25F, -1F, 0.5F, -0.25F, -1F, -0.5F, 1F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, -1F, 0.5F, 0F, -1F, -0.5F, 0F, 0.25F); // Box 245

		gun_3_Model[0][1].addShapeBox(-1F, 0.5F, -3.5F, 2, 2, 7, 0F,0F, 1F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 246

		gun_3_Model[0][2].addShapeBox(-2F, 0.5F, -3.5F, 1, 2, 7, 0F,0.5F, 1.25F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, 0.25F, 0.5F, 1.25F, 0.25F, 0.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.5F, 0F, 0.25F); // Box 247

		gun_3_Model[0][3].addShapeBox(-4F, 0.5F, -3.5F, 1, 2, 7, 0F,0.75F, 0.5F, -0.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.75F, 0.5F, -0.5F, 0.75F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, -0.5F); // Box 248

		gun_3_Model[0][4].addShapeBox(-3F, 0.5F, -3.5F, 1, 2, 7, 0F,0.5F, 0.5F, 0F, -0.5F, 1.25F, 0.25F, -0.5F, 1.25F, 0.25F, 0.5F, 0.5F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0F); // Box 249

		gun_3_Model[0][5].addShapeBox(-4F, -1F, -3.5F, 2, 1, 7, 0F,0.75F, -0.25F, -1.25F, -0.5F, -0.25F, -1F, -0.5F, -0.25F, -1F, 0.75F, -0.25F, -1.25F, 0.75F, 0F, -0.5F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0.75F, 0F, -0.5F); // Box 250

		gun_3_Model[0][6].addShapeBox(-4F, -1.7F, -2.5F, 3, 1, 5, 0F,-2.25F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -0.5F, 0.25F, -0.75F, -2.25F, 0.25F, -0.75F, 0.75F, -0.05F, -0.25F, 0F, 0.25F, 0.5F, 0F, 0.25F, 0.5F, 0.75F, -0.05F, -0.25F); // Box 251

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-4.5F, -19.5F, -20F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[2];
		gun_3_Model[1][0] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 264
		gun_3_Model[1][1] = new ModelRendererTurbo(this, 177, 121, textureX, textureY); // Box 265

		gun_3_Model[1][0].addShapeBox(3F, -0.5F, -0.05F, 6, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 264

		gun_3_Model[1][1].addShapeBox(3F, -0.5F, -0.95F, 6, 1, 1, 0F,0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F, 0F, -0.36F, -0.36F); // Box 265

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[1])
		{
			gunPart.setRotationPoint(-4.5F, -19.5F, -20F);
		}


		gun_3_Model[2] = new ModelRendererTurbo[14];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 252
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 129, 185, textureX, textureY); // Box 253
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 169, 185, textureX, textureY); // Box 254
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 255
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 497, 201, textureX, textureY); // Box 256
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 257
		gun_3_Model[2][6] = new ModelRendererTurbo(this, 465, 217, textureX, textureY); // Box 258
		gun_3_Model[2][7] = new ModelRendererTurbo(this, 497, 217, textureX, textureY); // Box 259
		gun_3_Model[2][8] = new ModelRendererTurbo(this, 17, 241, textureX, textureY); // Box 260
		gun_3_Model[2][9] = new ModelRendererTurbo(this, 385, 57, textureX, textureY); // Box 261
		gun_3_Model[2][10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 262
		gun_3_Model[2][11] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 263
		gun_3_Model[2][12] = new ModelRendererTurbo(this, 489, 41, textureX, textureY); // Box 266
		gun_3_Model[2][13] = new ModelRendererTurbo(this, 313, 57, textureX, textureY); // Box 267

		gun_3_Model[2][0].addShapeBox(-2.5F, -1F, -1F, 5, 2, 2, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 252

		gun_3_Model[2][1].addShapeBox(-2.5F, -2F, -1F, 5, 1, 2, 0F,-1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F); // Box 253

		gun_3_Model[2][2].addShapeBox(-2.5F, 1F, -1F, 5, 1, 2, 0F,0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F, -1.6F, 0.5F, 0F); // Box 254

		gun_3_Model[2][3].addShapeBox(-2.5F, -2F, -3F, 5, 1, 2, 0F,-1.6F, 0.25F, -0.5F, -1.6F, 0.25F, -0.5F, -1.6F, 0.75F, 0F, -1.6F, 0.75F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F); // Box 255

		gun_3_Model[2][4].addShapeBox(-2.5F, 1F, -3F, 5, 1, 2, 0F,-0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -1.6F, 0F, -0.5F, -1.35F, 0F, -0.5F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F); // Box 256

		gun_3_Model[2][5].addShapeBox(-2.5F, -1F, -3F, 5, 2, 2, 0F,-0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F); // Box 257

		gun_3_Model[2][6].addShapeBox(-2.5F, -2F, 1F, 5, 1, 2, 0F,-1.6F, 0.75F, 0F, -1.6F, 0.75F, 0F, -1.6F, 0.25F, -0.5F, -1.6F, 0.25F, -0.5F, 0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F); // Box 258

		gun_3_Model[2][7].addShapeBox(-2.5F, 1F, 1F, 5, 1, 2, 0F,0.25F, 0.1F, 0F, 0.25F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0.5F, 0F, -1.35F, 0F, -0.5F, -1.6F, 0F, -0.5F); // Box 259

		gun_3_Model[2][8].addShapeBox(-2.5F, -1F, 1F, 5, 2, 2, 0F,0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F, 0.25F, -0.1F, 0F, 0.25F, -0.1F, 0F, -0.5F, -0.1F, 0F, -0.5F, -0.1F, 0F); // Box 260

		gun_3_Model[2][9].addShapeBox(1.7F, -0.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F); // Box 261

		gun_3_Model[2][10].addShapeBox(2F, -0.5F, -0.95F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 262

		gun_3_Model[2][11].addShapeBox(2F, -0.5F, -0.05F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 263

		gun_3_Model[2][12].addShapeBox(3F, -0.5F, -0.05F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 266

		gun_3_Model[2][13].addShapeBox(3F, -0.5F, -0.95F, 1, 1, 1, 0F,0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, -0.5F, -0.35F, -0.35F, -0.5F, -0.35F, -0.35F, 0F, -0.2F, -0.2F); // Box 267

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(-4.5F, -19.5F, -20F);
		}


		registerGunModel("AK725Starboard", gun_3_Model);
	}
}