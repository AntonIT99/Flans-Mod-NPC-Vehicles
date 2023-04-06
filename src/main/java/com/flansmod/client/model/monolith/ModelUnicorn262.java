//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelUnicorn262 extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelUnicorn262() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[322];
		tailModel = new ModelRendererTurbo[71];
		leftWingModel = new ModelRendererTurbo[125];
		rightWingModel = new ModelRendererTurbo[113];
		bodyWheelModel = new ModelRendererTurbo[11];
		leftWingWheelModel = new ModelRendererTurbo[12];
		rightWingWheelModel = new ModelRendererTurbo[12];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		initbodyWheelModel_1();
		initleftWingWheelModel_1();
		initrightWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 161, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 321, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 401, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 169, 9, textureX, textureY); // Box 16
		bodyModel[9] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 18
		bodyModel[10] = new ModelRendererTurbo(this, 329, 9, textureX, textureY); // Box 23
		bodyModel[11] = new ModelRendererTurbo(this, 409, 9, textureX, textureY); // Box 24
		bodyModel[12] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 25
		bodyModel[13] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 26
		bodyModel[14] = new ModelRendererTurbo(this, 161, 17, textureX, textureY); // Box 27
		bodyModel[15] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 28
		bodyModel[16] = new ModelRendererTurbo(this, 321, 17, textureX, textureY); // Box 29
		bodyModel[17] = new ModelRendererTurbo(this, 393, 17, textureX, textureY); // Box 30
		bodyModel[18] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 31
		bodyModel[19] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 32
		bodyModel[20] = new ModelRendererTurbo(this, 161, 25, textureX, textureY); // Box 33
		bodyModel[21] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 34
		bodyModel[22] = new ModelRendererTurbo(this, 481, 1, textureX, textureY); // Box 35
		bodyModel[23] = new ModelRendererTurbo(this, 481, 17, textureX, textureY); // Box 36
		bodyModel[24] = new ModelRendererTurbo(this, 321, 25, textureX, textureY); // Box 37
		bodyModel[25] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 38
		bodyModel[26] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 417, 25, textureX, textureY); // Box 40
		bodyModel[28] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 41
		bodyModel[29] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 42
		bodyModel[30] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 43
		bodyModel[31] = new ModelRendererTurbo(this, 481, 9, textureX, textureY); // Box 44
		bodyModel[32] = new ModelRendererTurbo(this, 33, 33, textureX, textureY); // Box 45
		bodyModel[33] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 46
		bodyModel[34] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 47
		bodyModel[35] = new ModelRendererTurbo(this, 129, 33, textureX, textureY); // Box 48
		bodyModel[36] = new ModelRendererTurbo(this, 161, 33, textureX, textureY); // Box 49
		bodyModel[37] = new ModelRendererTurbo(this, 193, 33, textureX, textureY); // Box 50
		bodyModel[38] = new ModelRendererTurbo(this, 225, 33, textureX, textureY); // Box 51
		bodyModel[39] = new ModelRendererTurbo(this, 257, 33, textureX, textureY); // Box 52
		bodyModel[40] = new ModelRendererTurbo(this, 289, 33, textureX, textureY); // Box 55
		bodyModel[41] = new ModelRendererTurbo(this, 321, 33, textureX, textureY); // Box 63
		bodyModel[42] = new ModelRendererTurbo(this, 337, 33, textureX, textureY); // Box 64
		bodyModel[43] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 65
		bodyModel[44] = new ModelRendererTurbo(this, 393, 33, textureX, textureY); // Box 67
		bodyModel[45] = new ModelRendererTurbo(this, 81, 9, textureX, textureY); // Box 68
		bodyModel[46] = new ModelRendererTurbo(this, 473, 17, textureX, textureY); // Box 69
		bodyModel[47] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 70
		bodyModel[48] = new ModelRendererTurbo(this, 417, 33, textureX, textureY); // Box 71
		bodyModel[49] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 72
		bodyModel[50] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 73
		bodyModel[51] = new ModelRendererTurbo(this, 441, 33, textureX, textureY); // Box 74
		bodyModel[52] = new ModelRendererTurbo(this, 449, 33, textureX, textureY); // Box 75
		bodyModel[53] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 76
		bodyModel[54] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 77
		bodyModel[55] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 78
		bodyModel[56] = new ModelRendererTurbo(this, 481, 33, textureX, textureY); // Box 79
		bodyModel[57] = new ModelRendererTurbo(this, 489, 33, textureX, textureY); // Box 80
		bodyModel[58] = new ModelRendererTurbo(this, 497, 33, textureX, textureY); // Box 81
		bodyModel[59] = new ModelRendererTurbo(this, 505, 33, textureX, textureY); // Box 82
		bodyModel[60] = new ModelRendererTurbo(this, 1, 41, textureX, textureY); // Box 83
		bodyModel[61] = new ModelRendererTurbo(this, 9, 41, textureX, textureY); // Box 84
		bodyModel[62] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 86
		bodyModel[63] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 87
		bodyModel[64] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 88
		bodyModel[65] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 89
		bodyModel[66] = new ModelRendererTurbo(this, 121, 41, textureX, textureY); // Box 90
		bodyModel[67] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 91
		bodyModel[68] = new ModelRendererTurbo(this, 177, 41, textureX, textureY); // Box 92
		bodyModel[69] = new ModelRendererTurbo(this, 201, 41, textureX, textureY); // Box 93
		bodyModel[70] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 94
		bodyModel[71] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 95
		bodyModel[72] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 96
		bodyModel[73] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 99
		bodyModel[74] = new ModelRendererTurbo(this, 329, 41, textureX, textureY); // Box 100
		bodyModel[75] = new ModelRendererTurbo(this, 401, 41, textureX, textureY); // Box 101
		bodyModel[76] = new ModelRendererTurbo(this, 425, 41, textureX, textureY); // Box 102
		bodyModel[77] = new ModelRendererTurbo(this, 449, 41, textureX, textureY); // Box 103
		bodyModel[78] = new ModelRendererTurbo(this, 473, 41, textureX, textureY); // Box 104
		bodyModel[79] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 105
		bodyModel[80] = new ModelRendererTurbo(this, 17, 49, textureX, textureY); // Box 106
		bodyModel[81] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 107
		bodyModel[82] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 116
		bodyModel[83] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 117
		bodyModel[84] = new ModelRendererTurbo(this, 169, 49, textureX, textureY); // Box 118
		bodyModel[85] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 119
		bodyModel[86] = new ModelRendererTurbo(this, 265, 49, textureX, textureY); // Box 121
		bodyModel[87] = new ModelRendererTurbo(this, 313, 49, textureX, textureY); // Box 122
		bodyModel[88] = new ModelRendererTurbo(this, 393, 49, textureX, textureY); // Box 123
		bodyModel[89] = new ModelRendererTurbo(this, 417, 49, textureX, textureY); // Box 124
		bodyModel[90] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 125
		bodyModel[91] = new ModelRendererTurbo(this, 465, 49, textureX, textureY); // Box 126
		bodyModel[92] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 127
		bodyModel[93] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 128
		bodyModel[94] = new ModelRendererTurbo(this, 33, 57, textureX, textureY); // Box 129
		bodyModel[95] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 130
		bodyModel[96] = new ModelRendererTurbo(this, 105, 57, textureX, textureY); // Box 131
		bodyModel[97] = new ModelRendererTurbo(this, 153, 57, textureX, textureY); // Box 132
		bodyModel[98] = new ModelRendererTurbo(this, 193, 57, textureX, textureY); // Box 133
		bodyModel[99] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 134
		bodyModel[100] = new ModelRendererTurbo(this, 297, 57, textureX, textureY); // Box 135
		bodyModel[101] = new ModelRendererTurbo(this, 345, 57, textureX, textureY); // Box 136
		bodyModel[102] = new ModelRendererTurbo(this, 393, 57, textureX, textureY); // Box 137
		bodyModel[103] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 138
		bodyModel[104] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 139
		bodyModel[105] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 140
		bodyModel[106] = new ModelRendererTurbo(this, 169, 105, textureX, textureY); // Box 180
		bodyModel[107] = new ModelRendererTurbo(this, 193, 105, textureX, textureY); // Box 181
		bodyModel[108] = new ModelRendererTurbo(this, 241, 105, textureX, textureY); // Box 182
		bodyModel[109] = new ModelRendererTurbo(this, 305, 105, textureX, textureY); // Box 183
		bodyModel[110] = new ModelRendererTurbo(this, 329, 105, textureX, textureY); // Box 185
		bodyModel[111] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 186
		bodyModel[112] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 187
		bodyModel[113] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 190
		bodyModel[114] = new ModelRendererTurbo(this, 185, 113, textureX, textureY); // Box 191
		bodyModel[115] = new ModelRendererTurbo(this, 241, 113, textureX, textureY); // Box 192
		bodyModel[116] = new ModelRendererTurbo(this, 305, 113, textureX, textureY); // Box 193
		bodyModel[117] = new ModelRendererTurbo(this, 81, 121, textureX, textureY); // Box 195
		bodyModel[118] = new ModelRendererTurbo(this, 465, 121, textureX, textureY); // Box 196
		bodyModel[119] = new ModelRendererTurbo(this, 185, 129, textureX, textureY); // Box 197
		bodyModel[120] = new ModelRendererTurbo(this, 225, 129, textureX, textureY); // Box 198
		bodyModel[121] = new ModelRendererTurbo(this, 265, 129, textureX, textureY); // Box 199
		bodyModel[122] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 200
		bodyModel[123] = new ModelRendererTurbo(this, 345, 129, textureX, textureY); // Box 201
		bodyModel[124] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 202
		bodyModel[125] = new ModelRendererTurbo(this, 465, 129, textureX, textureY); // Box 203
		bodyModel[126] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 213
		bodyModel[127] = new ModelRendererTurbo(this, 73, 137, textureX, textureY); // Box 214
		bodyModel[128] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 215
		bodyModel[129] = new ModelRendererTurbo(this, 249, 137, textureX, textureY); // Box 216
		bodyModel[130] = new ModelRendererTurbo(this, 289, 137, textureX, textureY); // Box 217
		bodyModel[131] = new ModelRendererTurbo(this, 329, 137, textureX, textureY); // Box 218
		bodyModel[132] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 219
		bodyModel[133] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 220
		bodyModel[134] = new ModelRendererTurbo(this, 105, 137, textureX, textureY); // Box 221
		bodyModel[135] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 222
		bodyModel[136] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 223
		bodyModel[137] = new ModelRendererTurbo(this, 273, 105, textureX, textureY); // Box 224
		bodyModel[138] = new ModelRendererTurbo(this, 281, 105, textureX, textureY); // Box 225
		bodyModel[139] = new ModelRendererTurbo(this, 505, 105, textureX, textureY); // Box 226
		bodyModel[140] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 227
		bodyModel[141] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 228
		bodyModel[142] = new ModelRendererTurbo(this, 281, 113, textureX, textureY); // Box 229
		bodyModel[143] = new ModelRendererTurbo(this, 241, 145, textureX, textureY); // Box 231
		bodyModel[144] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 232
		bodyModel[145] = new ModelRendererTurbo(this, 321, 145, textureX, textureY); // Box 233
		bodyModel[146] = new ModelRendererTurbo(this, 57, 153, textureX, textureY); // Box 234
		bodyModel[147] = new ModelRendererTurbo(this, 89, 153, textureX, textureY); // Box 235
		bodyModel[148] = new ModelRendererTurbo(this, 121, 153, textureX, textureY); // Box 236
		bodyModel[149] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 237
		bodyModel[150] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 238
		bodyModel[151] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 239
		bodyModel[152] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 240
		bodyModel[153] = new ModelRendererTurbo(this, 297, 153, textureX, textureY); // Box 241
		bodyModel[154] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 242
		bodyModel[155] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 243
		bodyModel[156] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 244
		bodyModel[157] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 245
		bodyModel[158] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 246
		bodyModel[159] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 247
		bodyModel[160] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 248
		bodyModel[161] = new ModelRendererTurbo(this, 65, 161, textureX, textureY); // Box 249
		bodyModel[162] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 250
		bodyModel[163] = new ModelRendererTurbo(this, 145, 161, textureX, textureY); // Box 251
		bodyModel[164] = new ModelRendererTurbo(this, 145, 121, textureX, textureY); // Box 252
		bodyModel[165] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 253
		bodyModel[166] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 254
		bodyModel[167] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 255
		bodyModel[168] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 256
		bodyModel[169] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 257
		bodyModel[170] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 258
		bodyModel[171] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 259
		bodyModel[172] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 260
		bodyModel[173] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 261
		bodyModel[174] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 262
		bodyModel[175] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 263
		bodyModel[176] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 264
		bodyModel[177] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 265
		bodyModel[178] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 266
		bodyModel[179] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 268
		bodyModel[180] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 269
		bodyModel[181] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 270
		bodyModel[182] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 271
		bodyModel[183] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 272
		bodyModel[184] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 273
		bodyModel[185] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 274
		bodyModel[186] = new ModelRendererTurbo(this, 217, 169, textureX, textureY); // Box 275
		bodyModel[187] = new ModelRendererTurbo(this, 241, 169, textureX, textureY); // Box 276
		bodyModel[188] = new ModelRendererTurbo(this, 273, 169, textureX, textureY); // Box 278
		bodyModel[189] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 279
		bodyModel[190] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 280
		bodyModel[191] = new ModelRendererTurbo(this, 345, 169, textureX, textureY); // Box 281
		bodyModel[192] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 282
		bodyModel[193] = new ModelRendererTurbo(this, 393, 169, textureX, textureY); // Box 283
		bodyModel[194] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 284
		bodyModel[195] = new ModelRendererTurbo(this, 441, 169, textureX, textureY); // Box 285
		bodyModel[196] = new ModelRendererTurbo(this, 465, 169, textureX, textureY); // Box 286
		bodyModel[197] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 287
		bodyModel[198] = new ModelRendererTurbo(this, 1, 177, textureX, textureY); // Box 288
		bodyModel[199] = new ModelRendererTurbo(this, 25, 177, textureX, textureY); // Box 289
		bodyModel[200] = new ModelRendererTurbo(this, 49, 177, textureX, textureY); // Box 290
		bodyModel[201] = new ModelRendererTurbo(this, 73, 177, textureX, textureY); // Box 291
		bodyModel[202] = new ModelRendererTurbo(this, 97, 177, textureX, textureY); // Box 292
		bodyModel[203] = new ModelRendererTurbo(this, 121, 177, textureX, textureY); // Box 293
		bodyModel[204] = new ModelRendererTurbo(this, 313, 1, textureX, textureY); // Box 294
		bodyModel[205] = new ModelRendererTurbo(this, 393, 1, textureX, textureY); // Box 295
		bodyModel[206] = new ModelRendererTurbo(this, 233, 17, textureX, textureY); // Box 296
		bodyModel[207] = new ModelRendererTurbo(this, 313, 17, textureX, textureY); // Box 535
		bodyModel[208] = new ModelRendererTurbo(this, 369, 153, textureX, textureY); // Box 536
		bodyModel[209] = new ModelRendererTurbo(this, 409, 153, textureX, textureY); // Box 537
		bodyModel[210] = new ModelRendererTurbo(this, 81, 193, textureX, textureY); // Box 540
		bodyModel[211] = new ModelRendererTurbo(this, 129, 193, textureX, textureY); // Box 541
		bodyModel[212] = new ModelRendererTurbo(this, 185, 209, textureX, textureY); // Box 542
		bodyModel[213] = new ModelRendererTurbo(this, 249, 209, textureX, textureY); // Box 543
		bodyModel[214] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 545
		bodyModel[215] = new ModelRendererTurbo(this, 1, 233, textureX, textureY); // Box 546
		bodyModel[216] = new ModelRendererTurbo(this, 33, 233, textureX, textureY); // Box 525
		bodyModel[217] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 526
		bodyModel[218] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 527
		bodyModel[219] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 528
		bodyModel[220] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 529
		bodyModel[221] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 530
		bodyModel[222] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 532
		bodyModel[223] = new ModelRendererTurbo(this, 337, 385, textureX, textureY); // Box 532
		bodyModel[224] = new ModelRendererTurbo(this, 481, 377, textureX, textureY); // Box 533
		bodyModel[225] = new ModelRendererTurbo(this, 465, 193, textureX, textureY); // Box 535
		bodyModel[226] = new ModelRendererTurbo(this, 401, 193, textureX, textureY); // Box 536
		bodyModel[227] = new ModelRendererTurbo(this, 1, 385, textureX, textureY); // Box 537
		bodyModel[228] = new ModelRendererTurbo(this, 409, 385, textureX, textureY); // Box 539
		bodyModel[229] = new ModelRendererTurbo(this, 241, 233, textureX, textureY); // Box 540
		bodyModel[230] = new ModelRendererTurbo(this, 337, 241, textureX, textureY); // Box 541
		bodyModel[231] = new ModelRendererTurbo(this, 449, 385, textureX, textureY); // Box 542
		bodyModel[232] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 543
		bodyModel[233] = new ModelRendererTurbo(this, 505, 217, textureX, textureY); // Box 544
		bodyModel[234] = new ModelRendererTurbo(this, 33, 393, textureX, textureY); // Box 545
		bodyModel[235] = new ModelRendererTurbo(this, 89, 393, textureX, textureY); // Box 546
		bodyModel[236] = new ModelRendererTurbo(this, 121, 385, textureX, textureY); // Box 547
		bodyModel[237] = new ModelRendererTurbo(this, 449, 385, textureX, textureY); // Box 548
		bodyModel[238] = new ModelRendererTurbo(this, 161, 393, textureX, textureY); // Box 549
		bodyModel[239] = new ModelRendererTurbo(this, 145, 393, textureX, textureY); // Box 550
		bodyModel[240] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Box 551
		bodyModel[241] = new ModelRendererTurbo(this, 73, 393, textureX, textureY); // Box 552
		bodyModel[242] = new ModelRendererTurbo(this, 89, 217, textureX, textureY); // Box 553
		bodyModel[243] = new ModelRendererTurbo(this, 161, 361, textureX, textureY); // Box 554
		bodyModel[244] = new ModelRendererTurbo(this, 497, 329, textureX, textureY); // Box 555
		bodyModel[245] = new ModelRendererTurbo(this, 129, 377, textureX, textureY); // Box 556
		bodyModel[246] = new ModelRendererTurbo(this, 345, 25, textureX, textureY); // Box 557
		bodyModel[247] = new ModelRendererTurbo(this, 209, 377, textureX, textureY); // Box 558
		bodyModel[248] = new ModelRendererTurbo(this, 225, 377, textureX, textureY); // Box 559
		bodyModel[249] = new ModelRendererTurbo(this, 409, 249, textureX, textureY); // Box 560
		bodyModel[250] = new ModelRendererTurbo(this, 225, 305, textureX, textureY); // Box 561
		bodyModel[251] = new ModelRendererTurbo(this, 225, 249, textureX, textureY); // Box 562
		bodyModel[252] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 563
		bodyModel[253] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 564
		bodyModel[254] = new ModelRendererTurbo(this, 233, 217, textureX, textureY); // Box 565
		bodyModel[255] = new ModelRendererTurbo(this, 337, 217, textureX, textureY); // Box 566
		bodyModel[256] = new ModelRendererTurbo(this, 337, 225, textureX, textureY); // Box 567
		bodyModel[257] = new ModelRendererTurbo(this, 89, 241, textureX, textureY); // Box 568
		bodyModel[258] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 570
		bodyModel[259] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 571
		bodyModel[260] = new ModelRendererTurbo(this, 505, 193, textureX, textureY); // Box 573
		bodyModel[261] = new ModelRendererTurbo(this, 193, 201, textureX, textureY); // Box 574
		bodyModel[262] = new ModelRendererTurbo(this, 233, 201, textureX, textureY); // Box 575
		bodyModel[263] = new ModelRendererTurbo(this, 193, 209, textureX, textureY); // Box 576
		bodyModel[264] = new ModelRendererTurbo(this, 233, 209, textureX, textureY); // Box 577
		bodyModel[265] = new ModelRendererTurbo(this, 481, 217, textureX, textureY); // Box 578
		bodyModel[266] = new ModelRendererTurbo(this, 97, 225, textureX, textureY); // Box 579
		bodyModel[267] = new ModelRendererTurbo(this, 505, 225, textureX, textureY); // Box 580
		bodyModel[268] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 581
		bodyModel[269] = new ModelRendererTurbo(this, 137, 241, textureX, textureY); // Box 582
		bodyModel[270] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 583
		bodyModel[271] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Box 584
		bodyModel[272] = new ModelRendererTurbo(this, 369, 241, textureX, textureY); // Box 585
		bodyModel[273] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 586
		bodyModel[274] = new ModelRendererTurbo(this, 505, 241, textureX, textureY); // Box 587
		bodyModel[275] = new ModelRendererTurbo(this, 1, 249, textureX, textureY); // Box 588
		bodyModel[276] = new ModelRendererTurbo(this, 9, 249, textureX, textureY); // Box 589
		bodyModel[277] = new ModelRendererTurbo(this, 241, 249, textureX, textureY); // Box 590
		bodyModel[278] = new ModelRendererTurbo(this, 249, 249, textureX, textureY); // Box 591
		bodyModel[279] = new ModelRendererTurbo(this, 361, 249, textureX, textureY); // Box 592
		bodyModel[280] = new ModelRendererTurbo(this, 369, 249, textureX, textureY); // Box 593
		bodyModel[281] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 594
		bodyModel[282] = new ModelRendererTurbo(this, 41, 257, textureX, textureY); // Box 595
		bodyModel[283] = new ModelRendererTurbo(this, 73, 257, textureX, textureY); // Box 596
		bodyModel[284] = new ModelRendererTurbo(this, 113, 257, textureX, textureY); // Box 597
		bodyModel[285] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 598
		bodyModel[286] = new ModelRendererTurbo(this, 169, 257, textureX, textureY); // Box 599
		bodyModel[287] = new ModelRendererTurbo(this, 449, 257, textureX, textureY); // Box 600
		bodyModel[288] = new ModelRendererTurbo(this, 457, 257, textureX, textureY); // Box 601
		bodyModel[289] = new ModelRendererTurbo(this, 481, 257, textureX, textureY); // Box 602
		bodyModel[290] = new ModelRendererTurbo(this, 489, 257, textureX, textureY); // Box 603
		bodyModel[291] = new ModelRendererTurbo(this, 497, 257, textureX, textureY); // Box 604
		bodyModel[292] = new ModelRendererTurbo(this, 505, 257, textureX, textureY); // Box 605
		bodyModel[293] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 606
		bodyModel[294] = new ModelRendererTurbo(this, 201, 265, textureX, textureY); // Box 607
		bodyModel[295] = new ModelRendererTurbo(this, 209, 265, textureX, textureY); // Box 608
		bodyModel[296] = new ModelRendererTurbo(this, 217, 265, textureX, textureY); // Box 609
		bodyModel[297] = new ModelRendererTurbo(this, 225, 265, textureX, textureY); // Box 610
		bodyModel[298] = new ModelRendererTurbo(this, 233, 265, textureX, textureY); // Box 611
		bodyModel[299] = new ModelRendererTurbo(this, 297, 265, textureX, textureY); // Box 612
		bodyModel[300] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 613
		bodyModel[301] = new ModelRendererTurbo(this, 305, 265, textureX, textureY); // Box 616
		bodyModel[302] = new ModelRendererTurbo(this, 313, 265, textureX, textureY); // Box 617
		bodyModel[303] = new ModelRendererTurbo(this, 321, 265, textureX, textureY); // Box 618
		bodyModel[304] = new ModelRendererTurbo(this, 1, 412, textureX, textureY); // Box 648
		bodyModel[305] = new ModelRendererTurbo(this, 203, 414, textureX, textureY); // Box 649
		bodyModel[306] = new ModelRendererTurbo(this, 360, 414, textureX, textureY); // Box 650
		bodyModel[307] = new ModelRendererTurbo(this, 1, 412, textureX, textureY); // Box 651
		bodyModel[308] = new ModelRendererTurbo(this, 203, 414, textureX, textureY); // Box 652
		bodyModel[309] = new ModelRendererTurbo(this, 360, 414, textureX, textureY); // Box 653
		bodyModel[310] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 654
		bodyModel[311] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 656
		bodyModel[312] = new ModelRendererTurbo(this, 489, 145, textureX, textureY); // Box 657
		bodyModel[313] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 659
		bodyModel[314] = new ModelRendererTurbo(this, 33, 169, textureX, textureY); // Box 660
		bodyModel[315] = new ModelRendererTurbo(this, 369, 169, textureX, textureY); // Box 661
		bodyModel[316] = new ModelRendererTurbo(this, 68, 500, textureX, textureY); // Box 662
		bodyModel[317] = new ModelRendererTurbo(this, 68, 500, textureX, textureY); // Box 663
		bodyModel[318] = new ModelRendererTurbo(this, 68, 500, textureX, textureY); // Box 665
		bodyModel[319] = new ModelRendererTurbo(this, 68, 500, textureX, textureY); // Box 666
		bodyModel[320] = new ModelRendererTurbo(this, 68, 500, textureX, textureY); // Box 667
		bodyModel[321] = new ModelRendererTurbo(this, 68, 500, textureX, textureY); // Box 669

		bodyModel[0].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, -3F, -1.5F, 0F, -3F, 1.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 3.5F, -0.5F, 0F, 3.5F, 0.5F, 0F, 0F, -2F); // Box 0
		bodyModel[0].setRotationPoint(18F, -26F, -5.5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 36, 4, 1, 0F,0F, 0F, 0F, 0F, -3.5F, -2.5F, 0F, -3.5F, 2.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 2F, -2.2F, 0F, 2F, 2F, 0F, 0F, -2F); // Box 1
		bodyModel[1].setRotationPoint(18F, -24F, -7.5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 36, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, -4.2F, 0F, -2F, 4F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, -4.5F, 0F, -0.5F, 4.25F, 0F, 0F, -1F); // Box 2
		bodyModel[2].setRotationPoint(18F, -20F, -9.5F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, -5.5F, 0F, 0.5F, 5.25F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, -5.65F, 0F, -1F, 5.5F, 0F, 0.5F, 0F); // Box 3
		bodyModel[3].setRotationPoint(18F, -15F, -10.5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 1.5F, -5.65F, 0F, 1.5F, 5.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -3F, -6F, 0F, -3.5F, 5.5F, 0F, -0.5F, 0.5F); // Box 4
		bodyModel[4].setRotationPoint(18F, -13.5F, -10.5F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 3F, -5F, 0F, 3.5F, 4.5F, 0F, 0.5F, -0.5F, 0F, -1F, -2F, 0F, -4.5F, -6F, 0F, -5.5F, 5F, 0F, -2F, 1F); // Box 5
		bodyModel[5].setRotationPoint(18F, -11.5F, -9.5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F,0F, 0F, 0F, 0F, 3.5F, -4F, 0F, 3.25F, 1.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, -3.5F, -4F, 0F, -3.25F, 1.5F, 0F, 0.75F, 0.5F); // Box 6
		bodyModel[6].setRotationPoint(18F, -11.5F, -7.5F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F,0F, 0F, 0F, 0F, 4F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[7].setRotationPoint(18F, -10.75F, -3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, -2F, 0.5F, 0F, -5F, -1F, 0F, -3F, 1F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 4F, -2F, 0F, 3F, 1F, 0F, 0F, 0F); // Box 16
		bodyModel[8].setRotationPoint(18F, -28F, -5F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, 0F, 0F, 0F, -3F, -1F, 0F, -2.5F, 0.5F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 3F, -1F, 0F, 2.5F, 0.5F, 0F, -0.75F, 0F); // Box 18
		bodyModel[9].setRotationPoint(18F, -28F, -3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, 0.75F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -0.75F, 0F); // Box 23
		bodyModel[10].setRotationPoint(18F, -28F, -1F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, -3F, 1.5F, 0F, -3F, -1.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 3.5F, 0.5F, 0F, 3.5F, -0.5F, 0F, 0F, 2F); // Box 24
		bodyModel[11].setRotationPoint(18F, -26F, 4.5F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 36, 4, 1, 0F,0F, 0F, 0F, 0F, -3.5F, 2.5F, 0F, -3.5F, -2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 2F, 2F, 0F, 2F, -2.2F, 0F, 0F, 2F); // Box 25
		bodyModel[12].setRotationPoint(18F, -24F, 6.5F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 36, 5, 1, 0F,0F, 0F, 0F, 0F, -2F, 4F, 0F, -2F, -4.2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 4.25F, 0F, -0.5F, -4.5F, 0F, 0F, 1F); // Box 26
		bodyModel[13].setRotationPoint(18F, -20F, 8.5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, 0F, 0.5F, 5.25F, 0F, 0.5F, -5.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -1F, 5.5F, 0F, -1F, -5.65F, 0F, 0.5F, 0F); // Box 27
		bodyModel[14].setRotationPoint(18F, -15F, 9.5F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, 0F, 1.5F, 5.5F, 0F, 1.5F, -5.65F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, 0F, -3.5F, 5.5F, 0F, -3F, -6F, 0F, 0F, -1F); // Box 28
		bodyModel[15].setRotationPoint(18F, -13.5F, 9.5F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0.5F, -0.5F, 0F, 3.5F, 4.5F, 0F, 3F, -5F, 0F, 0F, 0F, 0F, -2F, 1F, 0F, -5.5F, 5F, 0F, -4.5F, -6F, 0F, -1F, -2F); // Box 29
		bodyModel[16].setRotationPoint(18F, -11.5F, 8.5F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 36, 1, 4, 0F,0F, -0.75F, 0.5F, 0F, 3.25F, 1.5F, 0F, 3.5F, -4F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, -3.25F, 1.5F, 0F, -3.5F, -4F, 0F, 0F, 0F); // Box 30
		bodyModel[17].setRotationPoint(18F, -11.5F, 3.5F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 36, 1, 3, 0F,0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 0F, 0F); // Box 31
		bodyModel[18].setRotationPoint(18F, -10.75F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, 0F, 0F, 0F, -3F, 1F, 0F, -5F, -1F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 3F, 1F, 0F, 4F, -2F, 0F, 1F, -0.5F); // Box 32
		bodyModel[19].setRotationPoint(18F, -28F, 3F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, 0.75F, 0F, 0F, -2.5F, 0.5F, 0F, -3F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, 2.5F, 0.5F, 0F, 3F, -1F, 0F, 0F, 0F); // Box 33
		bodyModel[20].setRotationPoint(18F, -28F, 1F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 36, 1, 2, 0F,0F, 0.75F, 0F, 0F, -2.5F, -0.5F, 0F, -2.5F, -0.5F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, 2.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, -0.75F, 0F); // Box 34
		bodyModel[21].setRotationPoint(18F, -28F, -1F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, 2.3F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -0.5F, -2.25F); // Box 35
		bodyModel[22].setRotationPoint(7F, -24F, -7.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.25F, 0F, 0.5F, 2.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0.5F, -2.25F); // Box 36
		bodyModel[23].setRotationPoint(7F, -20F, -9.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.25F, 0F, 1F, 1.75F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -1.5F); // Box 37
		bodyModel[24].setRotationPoint(7F, -15F, -10.5F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 2.75F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2.5F); // Box 38
		bodyModel[25].setRotationPoint(7F, -26F, -5.5F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -2F, 1.75F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 2.5F, -0.5F, 0F, 1F, 0.5F, 0F, 1F, -0.5F, 0F, 0F, 0F, 0F, -2.5F, -0.5F); // Box 39
		bodyModel[26].setRotationPoint(7F, -28F, -5F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 2.5F, 0.5F, 0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 4.5F, 0F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, -0.75F, 0F, 0F, -4.5F, 0F); // Box 40
		bodyModel[27].setRotationPoint(7F, -28F, -3F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 4.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 4.5F, 0F, 0F, -4.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -4.5F, 0F); // Box 41
		bodyModel[28].setRotationPoint(7F, -28F, -1F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.5F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -0.5F, 0.5F, 0F, 0F, -0.75F); // Box 42
		bodyModel[29].setRotationPoint(7F, -13.5F, -10.5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, -1.75F, 0F, -0.5F, -1F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -1.5F, 0F); // Box 43
		bodyModel[30].setRotationPoint(7F, -11.5F, -9.5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, -1.25F, -0.5F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, 1.25F, -0.5F); // Box 44
		bodyModel[31].setRotationPoint(7F, -11.5F, -7.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F); // Box 45
		bodyModel[32].setRotationPoint(7F, -10.75F, -3F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.75F, 0F, -0.5F, -2.25F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -0.5F, 2.3F); // Box 46
		bodyModel[33].setRotationPoint(7F, -24F, 6.5F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, 0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F, -2.25F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0.5F, 2.5F); // Box 47
		bodyModel[34].setRotationPoint(7F, -20F, 8.5F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 11, 1, 1, 0F,0F, -0.5F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.5F, 0F, 1F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 1.75F); // Box 48
		bodyModel[35].setRotationPoint(7F, -15F, 9.5F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.25F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2.75F); // Box 49
		bodyModel[36].setRotationPoint(7F, -26F, 4.5F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 2.5F, -0.5F, 0F, 0F, 0F, 0F, -2F, 0.5F, 0F, -2F, 1.75F, 0F, -2.5F, -0.5F, 0F, 0F, 0F, 0F, 1F, -0.5F, 0F, 1F, 0.5F); // Box 50
		bodyModel[37].setRotationPoint(7F, -28F, 3F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, 4.5F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0.5F, 0F, -4.5F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0.5F); // Box 51
		bodyModel[38].setRotationPoint(7F, -28F, 1F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1.75F, 0F, 0F, -0.75F, 0F, -0.5F, 0.5F, 0F, 0F, -1F, 0F, 0F, 1F); // Box 52
		bodyModel[39].setRotationPoint(7F, -13.5F, 9.5F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Box 55
		bodyModel[40].setRotationPoint(7F, -10.75F, 0F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, 0.1F, 0F, 0F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, 1.8F, 0F, -0.5F, 1.3F, 0F, -0.5F, -1.25F, 0F, 0F, -1.8F); // Box 63
		bodyModel[41].setRotationPoint(-3F, -24F, -8.5F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 10, 4, 14, 0F,-7F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, 0F, 0.5F, -3.5F, -7F, 0.5F, -3.5F, 0F, 0F, 0.4F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.4F); // Box 64
		bodyModel[42].setRotationPoint(-3F, -30F, -7F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 2, 8, 0F,-3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, -3F, 0F, -3F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 65
		bodyModel[43].setRotationPoint(4F, -32.5F, -4F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 1.4F, 0F, 0F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -1.4F, 0F, 0F, 2.6F, 0F, 0F, 2.25F, 0F, 0F, -2F, 0F, 0F, -2.6F); // Box 67
		bodyModel[44].setRotationPoint(-3F, -26F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.9F, -0.35F, 0F, -0.9F, -0.35F, 0F, -0.9F, 0F, 0F, -0.9F, 0F, 0F, -0.8F, -0.35F, 0F, -0.8F, -0.35F, 0F, -0.8F, 0F, 0F, -0.8F); // Box 68
		bodyModel[45].setRotationPoint(29.5F, -28F, -1F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, -0.35F, 0F, -0.8F, -0.35F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, -0.8F, -0.35F, -0.6F, -0.8F, -0.35F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 69
		bodyModel[46].setRotationPoint(29.5F, -28.4F, -1F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, -0.55F, 0.2F, -0.8F, -0.55F, 0.2F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, -0.8F, -0.55F, -0.8F, -0.8F, -0.55F, -0.8F, -0.8F, 0F, -0.6F, -0.8F); // Box 70
		bodyModel[47].setRotationPoint(30.15F, -28.4F, -1F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, -0.7F, 0.4F, -0.8F, -0.7F, 0.4F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, -0.8F, -0.55F, -1.1F, -0.8F, -0.55F, -1.1F, -0.8F, 0F, -0.6F, -0.8F); // Box 71
		bodyModel[48].setRotationPoint(30.6F, -28.6F, -1F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.15F, 0F, -0.8F, -0.75F, 0.4F, -0.8F, -0.75F, 0.4F, -0.8F, -0.15F, 0F, -0.8F, -0.3F, -0.7F, -0.8F, -0.4F, -1.4F, -0.8F, -0.4F, -1.4F, -0.8F, -0.3F, -0.7F, -0.8F); // Box 72
		bodyModel[49].setRotationPoint(30.75F, -29F, -1F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.6F, -0.8F, -0.55F, -0.8F, -0.8F, -0.55F, -0.8F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, -0.8F, -0.55F, 0.2F, -0.8F, -0.55F, 0.2F, -0.8F, 0F, 0F, -0.8F); // Box 73
		bodyModel[50].setRotationPoint(30.15F, -31.6F, -1F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.6F, -0.8F, -0.55F, -1.1F, -0.8F, -0.55F, -1.1F, -0.8F, 0F, -0.6F, -0.8F, 0F, 0F, -0.8F, -0.7F, 0.4F, -0.8F, -0.7F, 0.4F, -0.8F, 0F, 0F, -0.8F); // Box 74
		bodyModel[51].setRotationPoint(30.6F, -31.4F, -1F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.3F, -0.7F, -0.8F, -0.4F, -1.4F, -0.8F, -0.4F, -1.4F, -0.8F, -0.3F, -0.7F, -0.8F, -0.15F, 0F, -0.8F, -0.75F, 0.4F, -0.8F, -0.75F, 0.4F, -0.8F, -0.15F, 0F, -0.8F); // Box 75
		bodyModel[52].setRotationPoint(30.75F, -31F, -1F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0.2F, -0.8F, -0.75F, 0.4F, -0.8F, -0.75F, 0.4F, -0.8F, -0.25F, 0.2F, -0.8F, -0.6F, -1.2F, -0.8F, -0.4F, -1.4F, -0.8F, -0.4F, -1.4F, -0.8F, -0.6F, -1.2F, -0.8F); // Box 76
		bodyModel[53].setRotationPoint(30.75F, -29.2F, -1F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, -0.8F, -0.35F, 0F, -0.8F, -0.35F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, -0.6F, -0.8F, -0.35F, -0.6F, -0.8F, -0.35F, -0.6F, -0.8F, 0F, -0.6F, -0.8F); // Box 77
		bodyModel[54].setRotationPoint(29.5F, -31F, -1F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.55F, -0.8F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, -0.55F, -0.8F, -0.8F, -0.55F, 0.2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.55F, 0.2F, -0.8F); // Box 78
		bodyModel[55].setRotationPoint(28.5F, -31.6F, -1F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.55F, -1.1F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, -0.55F, -1.1F, -0.8F, -0.7F, 0.4F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, 0.4F, -0.8F); // Box 79
		bodyModel[56].setRotationPoint(28.05F, -31.4F, -1F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.4F, -1.4F, -0.8F, -0.3F, -0.7F, -0.8F, -0.3F, -0.7F, -0.8F, -0.4F, -1.4F, -0.8F, -0.75F, 0.4F, -0.8F, -0.15F, 0F, -0.8F, -0.15F, 0F, -0.8F, -0.75F, 0.4F, -0.8F); // Box 80
		bodyModel[57].setRotationPoint(27.9F, -31F, -1F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0.4F, -0.8F, -0.25F, 0.2F, -0.8F, -0.25F, 0.2F, -0.8F, -0.75F, 0.4F, -0.8F, -0.4F, -1.4F, -0.8F, -0.6F, -1.2F, -0.8F, -0.6F, -1.2F, -0.8F, -0.4F, -1.4F, -0.8F); // Box 81
		bodyModel[58].setRotationPoint(27.9F, -29.2F, -1F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.75F, 0.4F, -0.8F, -0.15F, 0F, -0.8F, -0.15F, 0F, -0.8F, -0.75F, 0.4F, -0.8F, -0.4F, -1.4F, -0.8F, -0.3F, -0.7F, -0.8F, -0.3F, -0.7F, -0.8F, -0.4F, -1.4F, -0.8F); // Box 82
		bodyModel[59].setRotationPoint(27.9F, -29F, -1F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.7F, 0.4F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.7F, 0.4F, -0.8F, -0.55F, -1.1F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, -0.55F, -1.1F, -0.8F); // Box 83
		bodyModel[60].setRotationPoint(28.05F, -28.6F, -1F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.55F, 0.2F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, -0.55F, 0.2F, -0.8F, -0.55F, -0.8F, -0.8F, 0F, -0.6F, -0.8F, 0F, -0.6F, -0.8F, -0.55F, -0.8F, -0.8F); // Box 84
		bodyModel[61].setRotationPoint(28.5F, -28.4F, -1F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, 0.8F, 0F, 0.5F, 0.3F, 0F, 0.5F, -0.25F, 0F, 0F, -0.8F, 0F, 0F, 3F, 0F, 0.5F, 2.5F, 0F, 0.5F, -2.25F, 0F, 0F, -3F); // Box 86
		bodyModel[62].setRotationPoint(-3F, -20F, -9.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, 2F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.25F, 0F, 0F, -2F, 0F, 0.5F, 2F, 0F, 1F, 1.75F, 0F, 1F, -1.5F, 0F, 0.5F, -2F); // Box 87
		bodyModel[63].setRotationPoint(-3F, -15F, -10.5F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 2F, 0F, -0.5F, 1.75F, 0F, -0.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -0.5F, -1.5F); // Box 88
		bodyModel[64].setRotationPoint(-3F, -13.5F, -10.5F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1F, 1F, 0F, -0.5F, 1F, 0F, -1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1F, 1F, 0F, 0.5F, 1F, 0F, 1.25F, -0.5F, 0F, 1.75F, -0.5F); // Box 89
		bodyModel[65].setRotationPoint(-3F, -11.5F, -7.5F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -1.75F, 0F, 0.5F, -2.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, -1F, 0F); // Box 90
		bodyModel[66].setRotationPoint(-3F, -11.5F, -9.5F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -1F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 91
		bodyModel[67].setRotationPoint(-3F, -10.75F, -3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 10, 4, 1, 0F,0F, 0F, -0.1F, 0F, 0F, 0.5F, 0F, 0F, -0.25F, 0F, 0F, 0.1F, 0F, 0F, -1.8F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.3F, 0F, 0F, 1.8F); // Box 92
		bodyModel[68].setRotationPoint(-3F, -24F, 7.5F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -1.4F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 1.4F, 0F, 0F, -2.6F, 0F, 0F, -2F, 0F, 0F, 2.25F, 0F, 0F, 2.6F); // Box 93
		bodyModel[69].setRotationPoint(-3F, -26F, 5F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 10, 5, 1, 0F,0F, 0F, -0.8F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.3F, 0F, 0F, 0.8F, 0F, 0F, -3F, 0F, 0.5F, -2.25F, 0F, 0.5F, 2.5F, 0F, 0F, 3F); // Box 94
		bodyModel[70].setRotationPoint(-3F, -20F, 8.5F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -2F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, 0F, 2F, 0F, 0.5F, -2F, 0F, 1F, -1.5F, 0F, 1F, 1.75F, 0F, 0.5F, 2F); // Box 95
		bodyModel[71].setRotationPoint(-3F, -15F, 9.5F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1.75F, 0F, 0F, 2F, 0F, -0.5F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 96
		bodyModel[72].setRotationPoint(-3F, -13.5F, 9.5F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 10, 1, 3, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 1F, 1F); // Box 99
		bodyModel[73].setRotationPoint(-3F, -10.75F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 0.15F, 0F, 0F, 0.9F, 0F, 0F, -1.2F, 0F, 0F, -0.5F, 0F, 0F, 1.95F, 0F, 0F, 2.6F, 0F, 0F, -2.6F, 0F, 0F, -2F); // Box 100
		bodyModel[74].setRotationPoint(-31F, -26F, -6F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, -0.55F, 0F, 0F, 0.1F, 0F, 0F, -0.1F, 0F, 0F, 0.5F, 0F, -0.5F, 1.3F, 0F, 0F, 1.8F, 0F, 0F, -1.8F, 0F, -0.5F, -1.25F); // Box 101
		bodyModel[75].setRotationPoint(-31F, -24F, -8.5F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0.5F, 0.3F, 0F, 0F, 0.8F, 0F, 0F, -0.8F, 0F, 0.5F, -0.25F, 0F, 0.5F, 2.5F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0.5F, -2.25F); // Box 102
		bodyModel[76].setRotationPoint(-31F, -20F, -9.5F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 1.75F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1.5F, 0F, 0F, -0.75F); // Box 103
		bodyModel[77].setRotationPoint(-31F, -12.5F, -10.5F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, -2.5F, 0F, 0F, -1.75F, 0F, -0.5F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, -1.5F, -1F); // Box 104
		bodyModel[78].setRotationPoint(-31F, -10.5F, -9.5F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 1.5F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -0.5F, -1.25F, 0F, 1F, 1.75F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0F, 1F, -1.5F); // Box 105
		bodyModel[79].setRotationPoint(-31F, -15F, -10.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -0.5F, 2F, 0F, -1F, 1F, 0F, -1.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.5F, 2F, 0F, 1F, 1F, 0F, 1.75F, -0.5F, 0F, 1.25F, -0.5F); // Box 106
		bodyModel[80].setRotationPoint(-31F, -10.5F, -7.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.5F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 1F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0.5F, 0F); // Box 107
		bodyModel[81].setRotationPoint(-31F, -9.75F, -3F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 1.8F, 0F, 0F, 1.8F, 0F, 0F, -2.55F, 0F, 0F, -2.55F); // Box 116
		bodyModel[82].setRotationPoint(-23F, -24F, -8.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 0.9F, 0F, 0F, 1.4F, 0F, 0F, -2.15F, 0F, 0F, -1.75F, 0F, 0F, 2.6F, 0F, 0F, 2.6F, 0F, 0F, -3.35F, 0F, 0F, -3.35F); // Box 117
		bodyModel[83].setRotationPoint(-23F, -26F, -6F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, -3.75F, 0F, 0F, -3.75F); // Box 118
		bodyModel[84].setRotationPoint(-23F, -20F, -9.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 20, 4, 1, 0F,0F, 0F, -0.85F, 0F, 0F, -0.85F, 0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, -2.55F, 0F, 0F, -2.55F, 0F, 0F, 1.8F, 0F, 0F, 1.8F); // Box 119
		bodyModel[85].setRotationPoint(-23F, -24F, 7.5F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0F, -1.55F, 0F, 0F, -1.55F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, -3.75F, 0F, 0F, -3.75F, 0F, 0F, 3F, 0F, 0F, 3F); // Box 121
		bodyModel[86].setRotationPoint(-23F, -20F, 8.5F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -1.2F, 0F, 0F, 0.9F, 0F, 0F, 0.15F, 0F, 0F, -2F, 0F, 0F, -2.6F, 0F, 0F, 2.6F, 0F, 0F, 1.95F); // Box 122
		bodyModel[87].setRotationPoint(-31F, -26F, 5F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 8, 4, 1, 0F,0F, 0F, 0.5F, 0F, 0F, -0.1F, 0F, 0F, 0.1F, 0F, 0F, -0.55F, 0F, -0.5F, -1.25F, 0F, 0F, -1.8F, 0F, 0F, 1.8F, 0F, -0.5F, 1.3F); // Box 123
		bodyModel[88].setRotationPoint(-31F, -24F, 7.5F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 8, 5, 1, 0F,0F, 0.5F, -0.25F, 0F, 0F, -0.8F, 0F, 0F, 0.8F, 0F, 0.5F, 0.3F, 0F, 0.5F, -2.25F, 0F, 0F, -3F, 0F, 0F, 3F, 0F, 0.5F, 2.5F); // Box 124
		bodyModel[89].setRotationPoint(-31F, -20F, 8.5F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -0.5F, 1.75F, 0F, 0F, -0.75F, 0F, -0.5F, -1.5F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 125
		bodyModel[90].setRotationPoint(-31F, -12.5F, 9.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, 0F, -1.75F, 0F, 0.5F, -2.5F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1.5F, -1F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F); // Box 126
		bodyModel[91].setRotationPoint(-31F, -10.5F, 8.5F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -1.25F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -0.5F, 1.5F, 0F, 1F, -1.5F, 0F, 0.5F, -2F, 0F, 0.5F, 2F, 0F, 1F, 1.75F); // Box 127
		bodyModel[92].setRotationPoint(-31F, -15F, 9.5F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, -1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, -1F, 1F, 0F, -0.5F, 2F, 0F, 1.25F, -0.5F, 0F, 1.75F, -0.5F, 0F, 1F, 1F, 0F, 0.5F, 2F); // Box 128
		bodyModel[93].setRotationPoint(-31F, -10.5F, 3.5F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 8, 1, 3, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, 0F, -0.5F, 1F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, 0.5F, 1F); // Box 129
		bodyModel[94].setRotationPoint(-31F, -9.75F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -2F, 0F, 0.5F, -2F); // Box 130
		bodyModel[95].setRotationPoint(-23F, -15F, -10.5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 131
		bodyModel[96].setRotationPoint(-23F, -12.5F, -10.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 2F, 0F, 1F, 2F, 0F, 1.5F, -2.5F, 0F, 0.5F, -2.5F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 132
		bodyModel[97].setRotationPoint(-23F, -10.5F, -9.5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, -1F, 1F, 0F, 0F, 1F, 0F, -0.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0.75F, -0.5F, 0F, 1.75F, -0.5F); // Box 133
		bodyModel[98].setRotationPoint(-23F, -10.5F, -7.5F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 134
		bodyModel[99].setRotationPoint(-23F, -9.75F, -3F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, -1.75F, 0F, 0F, -2.15F, 0F, 0F, 1.4F, 0F, 0F, 0.9F, 0F, 0F, -3.35F, 0F, 0F, -3.35F, 0F, 0F, 2.6F, 0F, 0F, 2.6F); // Box 135
		bodyModel[100].setRotationPoint(-23F, -26F, 5F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 2F, 0F, 0.5F, 2F); // Box 136
		bodyModel[101].setRotationPoint(-23F, -15F, 9.5F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, -0.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1F, 1F, 0F, 0F, 1F); // Box 137
		bodyModel[102].setRotationPoint(-23F, -12.5F, 9.5F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0.5F, -2.5F, 0F, 1.5F, -2.5F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, -1F, 0F, 0F, -1F); // Box 138
		bodyModel[103].setRotationPoint(-23F, -10.5F, 8.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 20, 1, 4, 0F,0F, -1.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 1.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, 0F, 1F, 0F, 1F, 1F); // Box 139
		bodyModel[104].setRotationPoint(-23F, -10.5F, 3.5F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 20, 1, 3, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F); // Box 140
		bodyModel[105].setRotationPoint(-23F, -9.75F, 0F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 0F, -1.75F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1.5F, 0F, 0F, -2F, 1F, 0F, -1F, -2F, 0F, -0.5F, -1F); // Box 180
		bodyModel[106].setRotationPoint(7F, -11.5F, 8.5F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 11, 1, 4, 0F,0F, -1.25F, -0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, -0.5F, 1F, 0F, 1.25F, -0.5F, 0F, 0.75F, 0.5F, 0F, 0F, 0F, 0F, 0.5F, 1F); // Box 181
		bodyModel[107].setRotationPoint(7F, -11.5F, 3.5F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, -1.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.5F, 1F, 0F, -1F, 1F, 0F, 1.75F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.5F, 1F, 0F, 1F, 1F); // Box 182
		bodyModel[108].setRotationPoint(-3F, -11.5F, 3.5F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0.5F, -2.5F, 0F, 0F, -1.75F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -1F, 0F, 0F, -1F); // Box 183
		bodyModel[109].setRotationPoint(-3F, -11.5F, 8.5F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -2F, 0.15F, 0F, -2F, 0.9F, 0F, 0.5F, 0.5F, 0F, -0.25F, 1F, 0F, 1F, -0.5F, 0F, 1F, 0.2F, 0F, 0.25F, 0.5F, 0F, 0.25F, 1F); // Box 185
		bodyModel[110].setRotationPoint(-31F, -28F, -6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, -0.25F, 0F, 1F, 0.5F, 0.5F, 0F, 1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0.5F, 0F, -1F, 0F, 0F, -0.25F, 0F); // Box 186
		bodyModel[111].setRotationPoint(-31F, -28F, -3F);

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0.75F, 0F, 0F, 1.5F, 0F, 0F, 1.5F, 0F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.75F, 0F); // Box 187
		bodyModel[112].setRotationPoint(-31F, -27.5F, -1F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -0.25F, 1F, 0F, 0.5F, 0.5F, 0F, -2F, 0.9F, 0F, -2F, 0.15F, 0F, 0.25F, 1F, 0F, 0.25F, 0.5F, 0F, 1F, 0.2F, 0F, 1F, -0.5F); // Box 190
		bodyModel[113].setRotationPoint(-31F, -28F, 4F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0.25F, 0F, 0F, 1F, 0F, 1F, 0.5F, 0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0F, 1F, 0.25F, 0.5F, 0F, 0.25F, 0F); // Box 191
		bodyModel[114].setRotationPoint(-31F, -28F, 1F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, -1.75F, 0.5F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, 1.75F, 0.5F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, 0F); // Box 192
		bodyModel[115].setRotationPoint(-46F, -28F, -3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, -2.25F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -2.25F, 0F, 0F, 2.25F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, 2.25F, 0F); // Box 193
		bodyModel[116].setRotationPoint(-46F, -29F, -1F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, -3.25F, -0.35F, 0F, -2F, 0.15F, 0F, -0.25F, 1F, 0F, -1.75F, 0.5F, 0F, 2.25F, -1.3F, 0F, 1F, -0.5F, 0F, 0.25F, 1F, 0F, 1.75F, 0.5F); // Box 195
		bodyModel[117].setRotationPoint(-46F, -28F, -6F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, -1.25F, -0.35F, 0F, 0F, 0.15F, 0F, 0F, -0.5F, 0F, -1.25F, 0.3F, 0F, 1.25F, 1.6F, 0F, 0F, 1.95F, 0F, 0F, -2F, 0F, 1.25F, -1.6F); // Box 196
		bodyModel[118].setRotationPoint(-46F, -26F, -6F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, -1.25F, -0.9F, 0F, 0F, -0.55F, 0F, 0F, 0.5F, 0F, -1.25F, 0.9F, 0F, 0F, 1.05F, 0F, -0.5F, 1.3F, 0F, -0.5F, -1.25F, 0F, 0F, -1.05F); // Box 197
		bodyModel[119].setRotationPoint(-46F, -24F, -8.5F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, 0.05F, 0F, 0.5F, 0.3F, 0F, 0.5F, -0.25F, 0F, 0F, -0.05F, 0F, -2F, 1F, 0F, 0.5F, 2.5F, 0F, 0.5F, -2.25F, 0F, -2F, -0.5F); // Box 198
		bodyModel[120].setRotationPoint(-46F, -20F, -9.5F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 2F, 0F, 0F, -0.5F, 1.5F, 0F, -0.5F, -1.25F, 0F, 2F, 0.5F, 0F, -1F, 0F, 0F, 1F, 1.75F, 0F, 1F, -1.5F, 0F, -1F, 0.5F); // Box 199
		bodyModel[121].setRotationPoint(-46F, -15F, -10.5F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 1F, 0F, 0F, 0F, 2F, 0F, 0F, -1.75F, 0F, 2F, -0.5F, 0F, -1F, -2F, 0F, -0.5F, 0F, 0F, -1.5F, -1F, 0F, -2F, 1F); // Box 200
		bodyModel[122].setRotationPoint(-46F, -10.5F, -9.5F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 1.5F, 0F, 0F, -0.5F, 1.75F, 0F, -0.5F, -1.5F, 0F, 1.5F, 0.5F, 0F, -1F, -1F, 0F, 0F, 1F, 0F, 0F, -0.75F, 0F, -2F, 0.5F); // Box 201
		bodyModel[123].setRotationPoint(-46F, -12.5F, -10.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, 0F, 0F, 0F, -0.5F, 2F, 0F, -1.25F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 2F, 0F, 1.25F, -0.5F, 0F, 0.75F, -0.5F); // Box 202
		bodyModel[124].setRotationPoint(-46F, -10.5F, -7.5F);

		bodyModel[125].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, 0F, 1F, 0F, -0.5F, 1F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1F, 0F, 0.5F, 1F, 0F, 0.5F, 0F, 0F, 0.25F, 0F); // Box 203
		bodyModel[125].setRotationPoint(-46F, -9.75F, -3F);

		bodyModel[126].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 0.5F, 0F, 1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 1.75F, 0.5F); // Box 213
		bodyModel[126].setRotationPoint(-46F, -28F, 1F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 15, 1, 2, 0F,0F, -1.75F, 0.5F, 0F, -0.25F, 1F, 0F, -2F, 0.15F, 0F, -3.25F, -0.35F, 0F, 1.75F, 0.5F, 0F, 0.25F, 1F, 0F, 1F, -0.5F, 0F, 2.25F, -1.3F); // Box 214
		bodyModel[127].setRotationPoint(-46F, -28F, 4F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, -1.25F, 0.3F, 0F, 0F, -0.5F, 0F, 0F, 0.15F, 0F, -1.25F, -0.35F, 0F, 1.25F, -1.6F, 0F, 0F, -2F, 0F, 0F, 1.95F, 0F, 1.25F, 1.6F); // Box 215
		bodyModel[128].setRotationPoint(-46F, -26F, 5F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 15, 4, 1, 0F,0F, -1.25F, 0.9F, 0F, 0F, 0.5F, 0F, 0F, -0.55F, 0F, -1.25F, -0.9F, 0F, 0F, -1.05F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.3F, 0F, 0F, 1.05F); // Box 216
		bodyModel[129].setRotationPoint(-46F, -24F, 7.5F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 15, 5, 1, 0F,0F, 0F, -0.05F, 0F, 0.5F, -0.25F, 0F, 0.5F, 0.3F, 0F, 0F, 0.05F, 0F, -2F, -0.5F, 0F, 0.5F, -2.25F, 0F, 0.5F, 2.5F, 0F, -2F, 1F); // Box 217
		bodyModel[130].setRotationPoint(-46F, -20F, 8.5F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 2F, 0.5F, 0F, -0.5F, -1.25F, 0F, -0.5F, 1.5F, 0F, 2F, 0F, 0F, -1F, 0.5F, 0F, 1F, -1.5F, 0F, 1F, 1.75F, 0F, -1F, 0F); // Box 218
		bodyModel[131].setRotationPoint(-46F, -15F, 9.5F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 2F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, 2F, 0F, 1F, 0F, 0F, -2F, 1F, 0F, -1.5F, -1F, 0F, -0.5F, 0F, 0F, -1F, -2F); // Box 219
		bodyModel[132].setRotationPoint(-46F, -10.5F, 8.5F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 15, 2, 1, 0F,0F, 1.5F, 0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1.75F, 0F, 1.5F, 0F, 0F, -2F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, 1F, 0F, -1F, -1F); // Box 220
		bodyModel[133].setRotationPoint(-46F, -12.5F, 9.5F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 15, 1, 4, 0F,0F, -0.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, -0.5F, 2F, 0F, 0F, 0F, 0F, 0.75F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0.5F, 2F, 0F, 0F, 0F); // Box 221
		bodyModel[134].setRotationPoint(-46F, -10.5F, 3.5F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 15, 1, 3, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 1F, 0F, 0F, 1F); // Box 222
		bodyModel[135].setRotationPoint(-46F, -9.75F, 0F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 223
		bodyModel[136].setRotationPoint(-2F, -34.5F, -1.5F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 224
		bodyModel[137].setRotationPoint(-2F, -34.5F, 1.5F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -2.75F, 0F, 1F, -2.75F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 2.25F, 0F, 1F, 2.25F, 0F); // Box 225
		bodyModel[138].setRotationPoint(-2F, -33.75F, 2.5F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, -5.25F, 1F, 1F, -5.25F, 1F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, 4.25F, 0.75F, 1F, 4.25F, 0.75F); // Box 226
		bodyModel[139].setRotationPoint(-3F, -31F, 4.5F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 227
		bodyModel[140].setRotationPoint(-2F, -34.5F, -2.5F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,1F, -2.75F, 0F, -1.5F, -2.75F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 2.25F, 0F, -1.5F, 2.25F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 228
		bodyModel[141].setRotationPoint(-2F, -33.75F, -4.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,1F, -5.25F, 1F, -1.5F, -5.25F, 1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 1F, 4.25F, 0.75F, -1.5F, 4.25F, 0.75F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 229
		bodyModel[142].setRotationPoint(-3F, -31F, -6.5F);

		bodyModel[143].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 1.25F, 1F, 0F, 0F, 1F, 0F, -0.25F, 0F, 0F, 0.75F, 0F, 0F, -1.25F, 1F, 0F, 0F, 1F, 0F, 0.25F, 0F, 0F, -0.75F, 0F); // Box 231
		bodyModel[143].setRotationPoint(-60F, -9.75F, -3F);

		bodyModel[144].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 2F, -1F, 0F, 0F, 0F, 0F, -0.75F, 0.5F, 0F, 0.5F, 0.5F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0.75F, 0.5F, 0F, -0.5F, 0.5F); // Box 232
		bodyModel[144].setRotationPoint(-60F, -10.5F, -7.5F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 3F, -1.75F, 0F, 1F, 0F, 0F, 2F, -0.5F, 0F, 3F, 1.75F, 0F, -3F, -3F, 0F, -1F, -2F, 0F, -2F, 1F, 0F, -4F, 2F); // Box 233
		bodyModel[145].setRotationPoint(-60F, -10.5F, -9.5F);

		bodyModel[146].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 2.75F, -2.25F, 0F, 1.5F, 0F, 0F, 1.5F, 0.5F, 0F, 2.75F, 2F, 0F, -3F, -2.75F, 0F, -1F, -1F, 0F, -2F, 0.5F, 0F, -3F, 2.75F); // Box 234
		bodyModel[146].setRotationPoint(-60F, -12.5F, -10.5F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0.5F, -2.7F, 0F, 0F, 0.05F, 0F, 0F, -0.05F, 0F, 0.5F, 2.75F, 0F, -2.75F, -1.25F, 0F, -2F, 1F, 0F, -2F, -0.5F, 0F, -2.75F, 1F); // Box 235
		bodyModel[147].setRotationPoint(-60F, -20F, -9.5F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, -2.5F, -2.55F, 0F, -1.25F, -0.9F, 0F, -1.25F, 0.9F, 0F, -2.5F, 2.5F, 0F, -0.5F, -1.7F, 0F, 0F, 1.05F, 0F, 0F, -1.05F, 0F, -0.5F, 1.75F); // Box 236
		bodyModel[148].setRotationPoint(-60F, -24F, -8.5F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 2.75F, -2.25F, 0F, 2F, 0F, 0F, 2F, 0.5F, 0F, 2.75F, 2F, 0F, -2.25F, -2.25F, 0F, -1F, 0F, 0F, -1F, 0.5F, 0F, -2.25F, 2F); // Box 237
		bodyModel[149].setRotationPoint(-60F, -15F, -10.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -3.5F, -1.1F, 0F, -1.25F, -0.35F, 0F, -1.25F, 0.3F, 0F, -3.75F, 0.75F, 0F, 2.5F, -0.05F, 0F, 1.25F, 1.6F, 0F, 1.25F, -1.6F, 0F, 2.5F, 0F); // Box 238
		bodyModel[150].setRotationPoint(-60F, -26F, -6F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -5.5F, -1.1F, 0F, -3.25F, -0.35F, 0F, -1.75F, 0.5F, 0F, -4.25F, 1F, 0F, 4.75F, -1.75F, 0F, 2.25F, -1.3F, 0F, 1.75F, 0.5F, 0F, 4.25F, 1F); // Box 239
		bodyModel[151].setRotationPoint(-60F, -28F, -6F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, 0.25F, 0F, 0F, 2.75F, 0F, 0F, 2.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, -0.25F, 0F); // Box 240
		bodyModel[152].setRotationPoint(-60F, -24F, -1F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -4.25F, 0F, 0F, -1.75F, 0.5F, 0F, -1.25F, 0F, 0F, -3.75F, 0F, 0F, 4.25F, 0F, 0F, 1.75F, 0.5F, 0F, 1.25F, 0F, 0F, 3.75F, 0F); // Box 241
		bodyModel[153].setRotationPoint(-60F, -28F, -3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, 0F, 1F, 0F, 1.25F, 1F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, 0F, 1F, 0F, -1.25F, 1F); // Box 242
		bodyModel[154].setRotationPoint(-60F, -9.75F, 0F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 14, 1, 3, 0F,0F, 0.5F, 0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0F, 0F, 2F, -1F, 0F, -0.5F, 0.5F, 0F, 0.75F, 0.5F, 0F, 0F, 0F, 0F, -2F, -1F); // Box 243
		bodyModel[155].setRotationPoint(-60F, -10.5F, 4.5F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 3F, 1.75F, 0F, 2F, -0.5F, 0F, 1F, 0F, 0F, 3F, -1.75F, 0F, -4F, 2F, 0F, -2F, 1F, 0F, -1F, -2F, 0F, -3F, -3F); // Box 244
		bodyModel[156].setRotationPoint(-60F, -10.5F, 8.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 2.75F, 2F, 0F, 1.5F, 0.5F, 0F, 1.5F, 0F, 0F, 2.75F, -2.25F, 0F, -3F, 2.75F, 0F, -2F, 0.5F, 0F, -1F, -1F, 0F, -3F, -2.75F); // Box 245
		bodyModel[157].setRotationPoint(-60F, -12.5F, 9.5F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 14, 5, 1, 0F,0F, 0.5F, 2.75F, 0F, 0F, -0.05F, 0F, 0F, 0.05F, 0F, 0.5F, -2.7F, 0F, -2.75F, 1F, 0F, -2F, -0.5F, 0F, -2F, 1F, 0F, -2.75F, -1.25F); // Box 246
		bodyModel[158].setRotationPoint(-60F, -20F, 8.5F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, 2.75F, 2F, 0F, 2F, 0.5F, 0F, 2F, 0F, 0F, 2.75F, -2.25F, 0F, -2.25F, 2F, 0F, -1F, 0.5F, 0F, -1F, 0F, 0F, -2.25F, -2.25F); // Box 247
		bodyModel[159].setRotationPoint(-60F, -15F, 9.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 14, 2, 1, 0F,0F, -3.75F, 0.75F, 0F, -1.25F, 0.3F, 0F, -1.25F, -0.35F, 0F, -3.5F, -1.1F, 0F, 2.5F, 0F, 0F, 1.25F, -1.6F, 0F, 1.25F, 1.6F, 0F, 2.5F, -0.05F); // Box 248
		bodyModel[160].setRotationPoint(-60F, -26F, 5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -4.25F, 1F, 0F, -1.75F, 0.5F, 0F, -3.25F, -0.35F, 0F, -5.5F, -1.1F, 0F, 4.25F, 1F, 0F, 1.75F, 0.5F, 0F, 2.25F, -1.3F, 0F, 4.75F, -1.75F); // Box 249
		bodyModel[161].setRotationPoint(-60F, -28F, 4F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 14, 1, 2, 0F,0F, -3.75F, 0F, 0F, -1.25F, 0F, 0F, -1.75F, 0.5F, 0F, -4.25F, 0F, 0F, 3.75F, 0F, 0F, 1.25F, 0F, 0F, 1.75F, 0.5F, 0F, 4.25F, 0F); // Box 250
		bodyModel[162].setRotationPoint(-60F, -28F, 1F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 14, 4, 1, 0F,0F, -2.5F, 2.5F, 0F, -1.25F, 0.9F, 0F, -1.25F, -0.9F, 0F, -2.5F, -2.55F, 0F, -0.5F, 1.75F, 0F, 0F, -1.05F, 0F, 0F, 1.05F, 0F, -0.5F, -1.7F); // Box 251
		bodyModel[163].setRotationPoint(-60F, -24F, 7.5F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 2F, -5.25F, 0F, 2.75F, -2.25F, 0F, 2.75F, 2F, 0F, 2F, 5.25F, 0F, -2.75F, -5.25F, 0F, -2.25F, -2.25F, 0F, -2.25F, 2F, 0F, -2.75F, 5.25F); // Box 252
		bodyModel[164].setRotationPoint(-71F, -15F, -10.5F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, -1F, -5.2F, 0F, 0.5F, -2.7F, 0F, 0.5F, 2.75F, 0F, -1F, 5.2F, 0F, -2F, -4.25F, 0F, -2.75F, -1.25F, 0F, -2.75F, 1F, 0F, -2F, 4.25F); // Box 253
		bodyModel[165].setRotationPoint(-71F, -20F, -9.5F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, -4.4F, -4.75F, 0F, -2.5F, -2.55F, 0F, -2.5F, 2.5F, 0F, -4.5F, 4.55F, 0F, 1F, -4.2F, 0F, -0.5F, -1.7F, 0F, -0.5F, 1.75F, 0F, 1F, 4.2F); // Box 254
		bodyModel[166].setRotationPoint(-71F, -24F, -8.5F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -8F, -2.6F, 0F, -5.5F, -1.1F, 0F, -4.25F, 1F, 0F, -7.25F, 1.5F, 0F, 7.5F, -3.05F, 0F, 4.75F, -1.75F, 0F, 4.25F, 1F, 0F, 7.25F, 1.5F); // Box 255
		bodyModel[167].setRotationPoint(-71F, -28F, -6F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -6F, -2.6F, 0F, -3.5F, -1.1F, 0F, -3.75F, 0.75F, 0F, -6F, 2.55F, 0F, 4.4F, -2.25F, 0F, 2.5F, -0.05F, 0F, 2.5F, 0F, 0F, 4.5F, 2.05F); // Box 256
		bodyModel[168].setRotationPoint(-71F, -26F, -6F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -7.25F, -0.5F, 0F, -4.25F, 0F, 0F, -3.75F, 0F, 0F, -6.5F, 0F, 0F, 7.25F, -0.5F, 0F, 4.25F, 0F, 0F, 3.75F, 0F, 0F, 6.5F, 0F); // Box 257
		bodyModel[169].setRotationPoint(-71F, -28F, -3F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -2F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F); // Box 258
		bodyModel[170].setRotationPoint(-71F, -24.5F, -1F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 3.25F, -5.25F, 0F, 2.75F, -2.25F, 0F, 2.75F, 2F, 0F, 3.25F, 5.25F, 0F, -4.25F, -5.5F, 0F, -3F, -2.75F, 0F, -3F, 2.75F, 0F, -4.25F, 5.5F); // Box 259
		bodyModel[171].setRotationPoint(-71F, -12.5F, -10.5F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 3F, -3.75F, 0F, 2F, -1F, 0F, 0.5F, 0.5F, 0F, 2F, 2.25F, 0F, -3.25F, -3.5F, 0F, -2F, -1F, 0F, -0.5F, 0.5F, 0F, -2F, 2.25F); // Box 260
		bodyModel[172].setRotationPoint(-71F, -10.5F, -7.5F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 4.25F, -4.5F, 0F, 3F, -1.75F, 0F, 3F, 1.75F, 0F, 4.25F, 4.5F, 0F, -4.25F, -5.5F, 0F, -3F, -3F, 0F, -4F, 2F, 0F, -5F, 4.75F); // Box 261
		bodyModel[173].setRotationPoint(-71F, -10.5F, -9.5F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 2.75F, -0.75F, 0F, 1.25F, 1F, 0F, 0.75F, 0F, 0F, 2.25F, 0F, 0F, -2.75F, -0.75F, 0F, -1.25F, 1F, 0F, -0.75F, 0F, 0F, -2.25F, 0F); // Box 262
		bodyModel[174].setRotationPoint(-71F, -9.75F, -3F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 2F, 5.25F, 0F, 2.75F, 2F, 0F, 2.75F, -2.25F, 0F, 2F, -5.25F, 0F, -2.75F, 5.25F, 0F, -2.25F, 2F, 0F, -2.25F, -2.25F, 0F, -2.75F, -5.25F); // Box 263
		bodyModel[175].setRotationPoint(-71F, -15F, 9.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 11, 5, 1, 0F,0F, -1F, 5.2F, 0F, 0.5F, 2.75F, 0F, 0.5F, -2.7F, 0F, -1F, -5.2F, 0F, -2F, 4.25F, 0F, -2.75F, 1F, 0F, -2.75F, -1.25F, 0F, -2F, -4.25F); // Box 264
		bodyModel[176].setRotationPoint(-71F, -20F, 8.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 11, 4, 1, 0F,0F, -4.5F, 4.55F, 0F, -2.5F, 2.5F, 0F, -2.5F, -2.55F, 0F, -4.4F, -4.75F, 0F, 1F, 4.2F, 0F, -0.5F, 1.75F, 0F, -0.5F, -1.7F, 0F, 1F, -4.2F); // Box 265
		bodyModel[177].setRotationPoint(-71F, -24F, 7.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -7.25F, 1.5F, 0F, -4.25F, 1F, 0F, -5.5F, -1.1F, 0F, -8F, -2.6F, 0F, 7.25F, 1.5F, 0F, 4.25F, 1F, 0F, 4.75F, -1.75F, 0F, 7.5F, -3.05F); // Box 266
		bodyModel[178].setRotationPoint(-71F, -28F, 4F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -6.5F, 0F, 0F, -3.75F, 0F, 0F, -4.25F, 0F, 0F, -7.25F, -0.5F, 0F, 6.5F, 0F, 0F, 3.75F, 0F, 0F, 4.25F, 0F, 0F, 7.25F, -0.5F); // Box 268
		bodyModel[179].setRotationPoint(-71F, -28F, 1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 3.25F, 5.25F, 0F, 2.75F, 2F, 0F, 2.75F, -2.25F, 0F, 3.25F, -5.25F, 0F, -4.25F, 5.5F, 0F, -3F, 2.75F, 0F, -3F, -2.75F, 0F, -4.25F, -5.5F); // Box 269
		bodyModel[180].setRotationPoint(-71F, -12.5F, 9.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 2F, 2.25F, 0F, 0.5F, 0.5F, 0F, 2F, -1F, 0F, 3F, -3.75F, 0F, -2F, 2.25F, 0F, -0.5F, 0.5F, 0F, -2F, -1F, 0F, -3.25F, -3.5F); // Box 270
		bodyModel[181].setRotationPoint(-71F, -10.5F, 4.5F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, 4.25F, 4.5F, 0F, 3F, 1.75F, 0F, 3F, -1.75F, 0F, 4.25F, -4.5F, 0F, -5F, 4.75F, 0F, -4F, 2F, 0F, -3F, -3F, 0F, -4.25F, -5.5F); // Box 271
		bodyModel[182].setRotationPoint(-71F, -10.5F, 8.5F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 11, 1, 3, 0F,0F, 2.25F, 0F, 0F, 0.75F, 0F, 0F, 1.25F, 1F, 0F, 2.75F, -0.75F, 0F, -2.25F, 0F, 0F, -0.75F, 0F, 0F, -1.25F, 1F, 0F, -2.75F, -0.75F); // Box 272
		bodyModel[183].setRotationPoint(-71F, -9.75F, 0F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -2.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -2.75F, 0F, 0F, 2.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 2.75F, 0F); // Box 273
		bodyModel[184].setRotationPoint(-79F, -20.75F, -1F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 3.25F, 0F, 0F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 3.25F, 0F, 0.25F, -3.25F, 0F, 0F, 0F); // Box 274
		bodyModel[185].setRotationPoint(-79F, -17F, -2F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, 2.3F, 0F, 1F, -2.3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 3.25F, 0F, 0F, -3.25F, 0F, 0F, 0F); // Box 275
		bodyModel[186].setRotationPoint(-79F, -18F, -2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 11, 2, 1, 0F,0F, -6F, 2.55F, 0F, -3.75F, 0.75F, 0F, -3.5F, -1.1F, 0F, -6F, -2.6F, 0F, 4.5F, 2.05F, 0F, 2.5F, 0F, 0F, 2.5F, -0.05F, 0F, 4.4F, -2.25F); // Box 276
		bodyModel[187].setRotationPoint(-71F, -26F, 5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -3.75F, -1F, 0F, -1F, 0.5F, 0F, -0.25F, 0F, 0F, -3.75F, 0F, 0F, 3.75F, -1F, 0F, 1F, 0.5F, 0F, 0.25F, 0F, 0F, 3.75F, 0F); // Box 278
		bodyModel[188].setRotationPoint(-79F, -21.75F, -2F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -3.75F, -1F, 0F, -1.75F, 1.4F, 0F, -1F, -1.5F, 0F, -3.75F, 0F, 0F, 3.75F, -1F, 0F, 1.25F, 0.95F, 0F, 0.25F, 0F, 0F, 3.75F, 0F); // Box 279
		bodyModel[189].setRotationPoint(-79F, -21.75F, -2F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, -1F, 0F, 2F, 1.4F, 0F, 2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 2.3F, 0F, -2F, -2.3F, 0F, 0F, 0F); // Box 280
		bodyModel[190].setRotationPoint(-79F, -18F, -2F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, 1F, -2.3F, 0F, 1F, 2.3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 3.25F, 0F, 0F, 0F); // Box 281
		bodyModel[191].setRotationPoint(-79F, -18F, 1F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -3.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -3.75F, -1F, 0F, 3.75F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0.5F, 0F, 3.75F, -1F); // Box 282
		bodyModel[192].setRotationPoint(-79F, -21.75F, 1F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -3.75F, 0F, 0F, -1F, -1.5F, 0F, -1.75F, 1.4F, 0F, -3.75F, -1F, 0F, 3.75F, 0F, 0F, 0.25F, 0F, 0F, 1.25F, 0.95F, 0F, 3.75F, -1F); // Box 283
		bodyModel[193].setRotationPoint(-79F, -21.75F, 1F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 2F, -2F, 0F, 2F, 1.4F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -2F, -2.3F, 0F, -2F, 2.3F, 0F, 0F, 0F); // Box 284
		bodyModel[194].setRotationPoint(-79F, -18F, 1F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -3.25F, 0F, 0F, 3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -3.25F, 0F, 0.25F, 3.25F, 0F, 0F, 0F); // Box 285
		bodyModel[195].setRotationPoint(-79F, -17F, 1F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 3.25F, 0F, -0.25F, -3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 3F, 0F, 0.25F, -3F, 0F, 0F, 0F); // Box 286
		bodyModel[196].setRotationPoint(-79F, -16F, -2F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -2.5F, 1.25F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 1.25F, 0F, 3F, 0F, 0F, 0F, 0F); // Box 287
		bodyModel[197].setRotationPoint(-79F, -15F, -1F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 3F, 0F, -0.25F, -3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.25F, 2F, 0F, 0.5F, -2.75F, 0F, -1F, 0F); // Box 288
		bodyModel[198].setRotationPoint(-79F, -15F, -2F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 1.75F, 0F, -2.5F, -1.25F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 1.25F, 2F, 0F, 2.5F, -1.25F, 0F, 0F, 0F); // Box 289
		bodyModel[199].setRotationPoint(-79F, -15F, -2F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, -3.25F, 0F, -0.25F, 3.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, -3F, 0F, 0.25F, 3F, 0F, 0F, 0F); // Box 290
		bodyModel[200].setRotationPoint(-79F, -16F, 1F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -3F, 0F, 0F, -2.5F, 1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 2.5F, 1.25F, 0F, 0F, 0F); // Box 291
		bodyModel[201].setRotationPoint(-79F, -15F, 0F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, -3F, 0F, -0.25F, 3F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.5F, -2.75F, 0F, 1.25F, 2F, 0F, -1F, 0F); // Box 292
		bodyModel[202].setRotationPoint(-79F, -15F, 1F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -2.5F, -1.25F, 0F, -1.5F, 1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, -1.25F, 0F, 1.25F, 2F, 0F, -1F, 0F); // Box 293
		bodyModel[203].setRotationPoint(-79F, -15F, 1F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 1, 2, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 294
		bodyModel[204].setRotationPoint(-80F, -17F, -2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Box 295
		bodyModel[205].setRotationPoint(-80F, -18F, -2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -1F); // Box 296
		bodyModel[206].setRotationPoint(-80F, -15F, -2F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 535
		bodyModel[207].setRotationPoint(-19F, -33F, -2F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 536
		bodyModel[208].setRotationPoint(-19F, -33F, -3F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F); // Box 537
		bodyModel[209].setRotationPoint(-19F, -33F, 2F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-2.25F, -2.75F, 0F, 1.75F, -2.75F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.25F, 2.25F, 0F, 1.75F, 2.25F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 540
		bodyModel[210].setRotationPoint(-19F, -32.25F, -5F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-1.75F, -3.75F, 0.25F, 1.25F, -3.75F, 0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.75F, 2.5F, 0F, 1.25F, 2.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F); // Box 541
		bodyModel[211].setRotationPoint(-17F, -29.5F, -7F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 1.75F, -2.75F, 0F, -2.25F, -2.75F, 0F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 1.75F, 2.25F, 0F, -2.25F, 2.25F, 0F); // Box 542
		bodyModel[212].setRotationPoint(-19F, -32.25F, 3F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 1.25F, -3.75F, 0.25F, -1.75F, -3.75F, 0.25F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, 1.25F, 2.5F, 0F, -1.75F, 2.5F, 0F); // Box 543
		bodyModel[213].setRotationPoint(-17F, -29.5F, 5F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, -0.75F, 0F, 0F, 3.25F, 0F, 0F, 4F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0.25F, 0F, 0F, -3.75F, 0F, 0F, -4.5F, 0F, -0.5F, -0.5F, 0F); // Box 545
		bodyModel[214].setRotationPoint(-24.5F, -29F, -3F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 6, 1, 1, 0F,-0.5F, -0.25F, 0F, 0F, 4F, 0F, 0F, 3.25F, 0F, -0.5F, -0.75F, 0F, -0.5F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, -3.75F, 0F, -0.5F, 0.25F, 0F); // Box 546
		bodyModel[215].setRotationPoint(-24.5F, -29F, 2F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		bodyModel[216].setRotationPoint(-19.5F, -28F, 0F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 526
		bodyModel[217].setRotationPoint(-18.5F, -29F, 0F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.25F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 527
		bodyModel[218].setRotationPoint(-19.5F, -29F, -0.5F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, 0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 528
		bodyModel[219].setRotationPoint(-19.5F, -29F, 1.5F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 529
		bodyModel[220].setRotationPoint(-19.5F, -29F, 0.5F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.75F, -0.75F, 1F, -0.75F, -0.75F, 1F, 0F, 0F, 1F, 0F); // Box 530
		bodyModel[221].setRotationPoint(-19.5F, -30F, -0.75F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, -0.75F, -0.75F, 0.5F, -0.75F, -0.75F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, -0.75F, -0.75F, 1F, -0.75F, -0.75F, 1F, 0F, 0F, 1F, 0F); // Box 532
		bodyModel[222].setRotationPoint(-19.5F, -30F, 1F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 21, 1, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		bodyModel[223].setRotationPoint(-23F, -18F, -11F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 8, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 533
		bodyModel[224].setRotationPoint(-3F, -26F, -7F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 9, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 535
		bodyModel[225].setRotationPoint(-15F, -26F, -0.5F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 536
		bodyModel[226].setRotationPoint(-15.5F, -26F, -0.5F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 4, 2, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 537
		bodyModel[227].setRotationPoint(-14F, -21F, -5F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 6, 2, 10, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 539
		bodyModel[228].setRotationPoint(-10F, -21F, -5F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 540
		bodyModel[229].setRotationPoint(-10F, -22F, -5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 541
		bodyModel[230].setRotationPoint(-10F, -22F, 4F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 1F, 0F, 2F); // Box 542
		bodyModel[231].setRotationPoint(-5F, -27F, -3F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 543
		bodyModel[232].setRotationPoint(-5F, -31F, -2F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 544
		bodyModel[233].setRotationPoint(-5F, -32F, -1F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 21, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 545
		bodyModel[234].setRotationPoint(-23F, -22F, -9F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 21, 4, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 546
		bodyModel[235].setRotationPoint(-23F, -22F, 6F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 1, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 547
		bodyModel[236].setRotationPoint(-24F, -22F, -9F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 1, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 548
		bodyModel[237].setRotationPoint(-24F, -24F, -8F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 1, 2, 14, 0F,0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 549
		bodyModel[238].setRotationPoint(-24F, -26F, -7F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 1, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, 2F); // Box 550
		bodyModel[239].setRotationPoint(-24F, -27F, -4F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 3F, 1F, 0F, 3F, 0F, 0F, 0F); // Box 551
		bodyModel[240].setRotationPoint(-25F, -28F, -1F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 1, 4, 12, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 552
		bodyModel[241].setRotationPoint(-22F, -25F, -6F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 553
		bodyModel[242].setRotationPoint(-24F, -28F, 0F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 1, 1, 7, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 554
		bodyModel[243].setRotationPoint(-22F, -26F, -6F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 555
		bodyModel[244].setRotationPoint(-22F, -27F, -6F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 556
		bodyModel[245].setRotationPoint(-22F, -26.5F, -1F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 557
		bodyModel[246].setRotationPoint(-22F, -26F, 1F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, -0.5F, -1F); // Box 558
		bodyModel[247].setRotationPoint(-22F, -26.5F, -6F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 5, 4, 3, 0F,0F, 0F, -2F, -3F, 0F, -2F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		bodyModel[248].setRotationPoint(-23F, -26F, -9F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 560
		bodyModel[249].setRotationPoint(-23F, -23F, 6F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 561
		bodyModel[250].setRotationPoint(-23F, -24F, 6F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 562
		bodyModel[251].setRotationPoint(-23F, -25F, 6F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 563
		bodyModel[252].setRotationPoint(-22.5F, -20F, -5.5F);
		bodyModel[252].rotateAngleZ = 0.71558499F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 564
		bodyModel[253].setRotationPoint(-22.5F, -20F, 3.5F);
		bodyModel[253].rotateAngleZ = 0.71558499F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 565
		bodyModel[254].setRotationPoint(-24F, -25F, -5F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 566
		bodyModel[255].setRotationPoint(-24F, -22F, -5F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 567
		bodyModel[256].setRotationPoint(-24F, -25F, 4F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 568
		bodyModel[257].setRotationPoint(-24F, -22F, 4F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 570
		bodyModel[258].setRotationPoint(-21.5F, -25F, -5F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 571
		bodyModel[259].setRotationPoint(-21.5F, -24.5F, -5F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 573
		bodyModel[260].setRotationPoint(-21.5F, -26F, -5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 574
		bodyModel[261].setRotationPoint(-21.5F, -26F, -3.5F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 575
		bodyModel[262].setRotationPoint(-21.5F, -24.5F, -3.5F);

		bodyModel[263].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 576
		bodyModel[263].setRotationPoint(-21.5F, -25F, -3.5F);

		bodyModel[264].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 577
		bodyModel[264].setRotationPoint(-21.5F, -24.5F, -3.5F);

		bodyModel[265].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 578
		bodyModel[265].setRotationPoint(-21.5F, -23F, -3.5F);

		bodyModel[266].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 579
		bodyModel[266].setRotationPoint(-21.5F, -23.5F, -3.5F);

		bodyModel[267].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 580
		bodyModel[267].setRotationPoint(-21.5F, -24.5F, -5F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 581
		bodyModel[268].setRotationPoint(-21.5F, -23.5F, -5F);

		bodyModel[269].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 582
		bodyModel[269].setRotationPoint(-21.5F, -23F, -5F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 583
		bodyModel[270].setRotationPoint(-21.5F, -26F, -1.5F);

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 584
		bodyModel[271].setRotationPoint(-21.5F, -25.5F, -1.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 585
		bodyModel[272].setRotationPoint(-21.5F, -27F, -1.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 586
		bodyModel[273].setRotationPoint(-21.5F, -24.5F, -1.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 587
		bodyModel[274].setRotationPoint(-21.5F, -24F, -1.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 588
		bodyModel[275].setRotationPoint(-21.5F, -25.5F, -1.5F);

		bodyModel[276].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 589
		bodyModel[276].setRotationPoint(-21.5F, -24.5F, 2.5F);

		bodyModel[277].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 590
		bodyModel[277].setRotationPoint(-21.5F, -24F, 2.5F);

		bodyModel[278].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 591
		bodyModel[278].setRotationPoint(-21.5F, -25.5F, 2.5F);

		bodyModel[279].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 592
		bodyModel[279].setRotationPoint(-21.5F, -24.5F, 1.5F);

		bodyModel[280].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 593
		bodyModel[280].setRotationPoint(-21.5F, -24F, 1.5F);

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 594
		bodyModel[281].setRotationPoint(-21.5F, -25.5F, 1.5F);

		bodyModel[282].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 595
		bodyModel[282].setRotationPoint(-21.5F, -23.5F, 1.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 596
		bodyModel[283].setRotationPoint(-21.5F, -23F, 1.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 597
		bodyModel[284].setRotationPoint(-21.5F, -24.5F, 1.5F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 598
		bodyModel[285].setRotationPoint(-21.5F, -23.5F, 2.5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 599
		bodyModel[286].setRotationPoint(-21.5F, -23F, 2.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 600
		bodyModel[287].setRotationPoint(-21.5F, -24.5F, 2.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 601
		bodyModel[288].setRotationPoint(-21.5F, -22.5F, 2.5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 602
		bodyModel[289].setRotationPoint(-21.5F, -22F, 2.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 603
		bodyModel[290].setRotationPoint(-21.5F, -23.5F, 2.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 604
		bodyModel[291].setRotationPoint(-21.5F, -23.5F, 1.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 605
		bodyModel[292].setRotationPoint(-21.5F, -22.5F, 1.5F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 606
		bodyModel[293].setRotationPoint(-21.5F, -22F, 1.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 607
		bodyModel[294].setRotationPoint(-21.5F, -25.75F, 2.75F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 608
		bodyModel[295].setRotationPoint(-21.5F, -25.25F, 2.75F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 609
		bodyModel[296].setRotationPoint(-21.5F, -26.75F, 2.75F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F, -0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F); // Box 610
		bodyModel[297].setRotationPoint(-21.5F, -26.75F, 1.5F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.4F, -0.5F, 0F, -0.5F, -0.5F, 0F); // Box 611
		bodyModel[298].setRotationPoint(-21.5F, -25.75F, 1.5F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.4F, -0.75F, -0.25F, -0.5F, -0.75F, -0.25F); // Box 612
		bodyModel[299].setRotationPoint(-21.5F, -25.25F, 1.5F);

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 613
		bodyModel[300].setRotationPoint(-22F, -21F, -1F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 616
		bodyModel[301].setRotationPoint(-12.5F, -23F, -8.5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 617
		bodyModel[302].setRotationPoint(-12.5F, -23F, -7.5F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F); // Box 618
		bodyModel[303].setRotationPoint(-12.5F, -23.5F, -8.5F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 75, 75, 1, 0F,-65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -65F, 0F, 0F, -65F, -65F, 0F, 0F, -65F, 0F, 0F, -65F, 0F, -65F, -65F, 0F); // Box 648
		bodyModel[304].setRotationPoint(6F, -36F, 1F);
		bodyModel[304].rotateAngleX = -3.12413936F;

		bodyModel[305].addShapeBox(0F, 0F, 0F, 75, 75, 1, 0F,-60F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, -60F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, -60F, -60F, 0F); // Box 649
		bodyModel[305].setRotationPoint(-73F, -17F, -67F);
		bodyModel[305].rotateAngleX = -1.65806279F;
		bodyModel[305].rotateAngleY = 0.15707963F;

		bodyModel[306].addShapeBox(0F, 0F, 0F, 75, 75, 1, 0F,-60F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, -60F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, -60F, -60F, 0F); // Box 650
		bodyModel[306].setRotationPoint(-71F, -11F, 66F);
		bodyModel[306].rotateAngleX = 1.67551608F;
		bodyModel[306].rotateAngleY = -0.13962634F;
		bodyModel[306].rotateAngleZ = 0.03490659F;

		bodyModel[307].addShapeBox(0F, 0F, 0F, 75, 75, 1, 0F,-65F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -65F, 0F, 0F, -65F, -65F, 0F, 0F, -65F, 0F, 0F, -65F, 0F, -65F, -65F, 0F); // Box 651
		bodyModel[307].setRotationPoint(6F, -46F, -1F);
		bodyModel[307].rotateAngleX = 0.01745329F;

		bodyModel[308].addShapeBox(0F, 0F, 0F, 75, 75, 1, 0F,-60F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, -60F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, -60F, -60F, 0F); // Box 652
		bodyModel[308].setRotationPoint(-70F, -18F, 84F);
		bodyModel[308].rotateAngleX = -1.50098316F;
		bodyModel[308].rotateAngleY = -0.15707963F;

		bodyModel[309].addShapeBox(0F, 0F, 0F, 75, 75, 1, 0F,-60F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -60F, 0F, 0F, -60F, -60F, 0F, 0F, -60F, 0F, 0F, -60F, 0F, -60F, -60F, 0F); // Box 653
		bodyModel[309].setRotationPoint(-71F, -15F, -82F);
		bodyModel[309].rotateAngleX = 1.44862328F;
		bodyModel[309].rotateAngleY = 0.15707963F;

		bodyModel[310].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -2F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 2F, 0F); // Box 654
		bodyModel[310].setRotationPoint(-71F, -23.5F, -1F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -5.5F, 0F, 0F, -3.75F, 0F, 0F, -4.25F, 0F, 0F, -6.25F, -0.5F, 0F, 5.5F, 0F, 0F, 3.75F, 0F, 0F, 4.25F, 0F, 0F, 6.25F, -0.5F); // Box 656
		bodyModel[311].setRotationPoint(-71F, -28F, 1F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, -3.75F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, 0F, -3.75F, 0F, 0F, 3.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 3.75F, 0F); // Box 657
		bodyModel[312].setRotationPoint(-79F, -21.75F, -1F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -4.75F, 0F, 0F, -0.25F, 0F, 0F, -1F, 0.5F, 0F, -4.75F, -1F, 0F, 3.75F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0.5F, 0F, 3.75F, -1F); // Box 659
		bodyModel[313].setRotationPoint(-79F, -22.75F, 1F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 11, 1, 2, 0F,0F, -6.25F, -0.5F, 0F, -4.25F, 0F, 0F, -3.75F, 0F, 0F, -5.5F, 0F, 0F, 6.25F, -0.5F, 0F, 4.25F, 0F, 0F, 3.75F, 0F, 0F, 5.5F, 0F); // Box 660
		bodyModel[314].setRotationPoint(-71F, -28F, -3F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, -4.75F, -1F, 0F, -1F, 0.5F, 0F, -0.25F, 0F, 0F, -4.75F, 0F, 0F, 3.75F, -1F, 0F, 1F, 0.5F, 0F, 0.25F, 0F, 0F, 3.75F, 0F); // Box 661
		bodyModel[315].setRotationPoint(-79F, -22.75F, -2F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 44, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 662
		bodyModel[316].setRotationPoint(-103F, -24F, -1F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 44, 1, 2, 0F,0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 663
		bodyModel[317].setRotationPoint(-103F, -24.5F, -1F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 44, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F); // Box 665
		bodyModel[318].setRotationPoint(-103F, -23.25F, -1F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F); // Box 666
		bodyModel[319].setRotationPoint(-107F, -24.6F, -1.25F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 667
		bodyModel[320].setRotationPoint(-107F, -23.85F, -1.25F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 669
		bodyModel[321].setRotationPoint(-107F, -23.1F, -1.25F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 105, 65, textureX, textureY); // Box 119
		tailModel[1] = new ModelRendererTurbo(this, 185, 65, textureX, textureY); // Box 120
		tailModel[2] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 121
		tailModel[3] = new ModelRendererTurbo(this, 345, 65, textureX, textureY); // Box 122
		tailModel[4] = new ModelRendererTurbo(this, 425, 65, textureX, textureY); // Box 123
		tailModel[5] = new ModelRendererTurbo(this, 1, 73, textureX, textureY); // Box 124
		tailModel[6] = new ModelRendererTurbo(this, 81, 73, textureX, textureY); // Box 125
		tailModel[7] = new ModelRendererTurbo(this, 153, 73, textureX, textureY); // Box 126
		tailModel[8] = new ModelRendererTurbo(this, 233, 73, textureX, textureY); // Box 127
		tailModel[9] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 128
		tailModel[10] = new ModelRendererTurbo(this, 393, 73, textureX, textureY); // Box 129
		tailModel[11] = new ModelRendererTurbo(this, 1, 81, textureX, textureY); // Box 130
		tailModel[12] = new ModelRendererTurbo(this, 81, 81, textureX, textureY); // Box 131
		tailModel[13] = new ModelRendererTurbo(this, 153, 81, textureX, textureY); // Box 132
		tailModel[14] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 133
		tailModel[15] = new ModelRendererTurbo(this, 305, 81, textureX, textureY); // Box 134
		tailModel[16] = new ModelRendererTurbo(this, 377, 81, textureX, textureY); // Box 135
		tailModel[17] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 136
		tailModel[18] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 137
		tailModel[19] = new ModelRendererTurbo(this, 161, 89, textureX, textureY); // Box 138
		tailModel[20] = new ModelRendererTurbo(this, 233, 89, textureX, textureY); // Box 139
		tailModel[21] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 140
		tailModel[22] = new ModelRendererTurbo(this, 305, 89, textureX, textureY); // Box 141
		tailModel[23] = new ModelRendererTurbo(this, 361, 89, textureX, textureY); // Box 142
		tailModel[24] = new ModelRendererTurbo(this, 497, 41, textureX, textureY); // Box 144
		tailModel[25] = new ModelRendererTurbo(this, 425, 89, textureX, textureY); // Box 145
		tailModel[26] = new ModelRendererTurbo(this, 1, 97, textureX, textureY); // Box 146
		tailModel[27] = new ModelRendererTurbo(this, 41, 49, textureX, textureY); // Box 147
		tailModel[28] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 148
		tailModel[29] = new ModelRendererTurbo(this, 25, 57, textureX, textureY); // Box 149
		tailModel[30] = new ModelRendererTurbo(this, 241, 57, textureX, textureY); // Box 150
		tailModel[31] = new ModelRendererTurbo(this, 49, 65, textureX, textureY); // Box 151
		tailModel[32] = new ModelRendererTurbo(this, 473, 73, textureX, textureY); // Box 152
		tailModel[33] = new ModelRendererTurbo(this, 481, 89, textureX, textureY); // Box 153
		tailModel[34] = new ModelRendererTurbo(this, 57, 97, textureX, textureY); // Box 154
		tailModel[35] = new ModelRendererTurbo(this, 497, 73, textureX, textureY); // Box 155
		tailModel[36] = new ModelRendererTurbo(this, 73, 97, textureX, textureY); // Box 156
		tailModel[37] = new ModelRendererTurbo(this, 89, 97, textureX, textureY); // Box 157
		tailModel[38] = new ModelRendererTurbo(this, 105, 97, textureX, textureY); // Box 158
		tailModel[39] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 159
		tailModel[40] = new ModelRendererTurbo(this, 185, 97, textureX, textureY); // Box 160
		tailModel[41] = new ModelRendererTurbo(this, 201, 97, textureX, textureY); // Box 164
		tailModel[42] = new ModelRendererTurbo(this, 265, 97, textureX, textureY); // Box 165
		tailModel[43] = new ModelRendererTurbo(this, 41, 105, textureX, textureY); // Box 166
		tailModel[44] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 170
		tailModel[45] = new ModelRendererTurbo(this, 393, 97, textureX, textureY); // Box 169
		tailModel[46] = new ModelRendererTurbo(this, 169, 41, textureX, textureY); // Box 172
		tailModel[47] = new ModelRendererTurbo(this, 345, 33, textureX, textureY); // Box 173
		tailModel[48] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 174
		tailModel[49] = new ModelRendererTurbo(this, 505, 65, textureX, textureY); // Box 175
		tailModel[50] = new ModelRendererTurbo(this, 505, 89, textureX, textureY); // Box 176
		tailModel[51] = new ModelRendererTurbo(this, 241, 97, textureX, textureY); // Box 177
		tailModel[52] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 178
		tailModel[53] = new ModelRendererTurbo(this, 305, 97, textureX, textureY); // Box 179
		tailModel[54] = new ModelRendererTurbo(this, 81, 105, textureX, textureY); // Box 180
		tailModel[55] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 181
		tailModel[56] = new ModelRendererTurbo(this, 145, 113, textureX, textureY); // Box 182
		tailModel[57] = new ModelRendererTurbo(this, 425, 121, textureX, textureY); // Box 183
		tailModel[58] = new ModelRendererTurbo(this, 361, 121, textureX, textureY); // Box 184
		tailModel[59] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 185
		tailModel[60] = new ModelRendererTurbo(this, 321, 41, textureX, textureY); // Box 186
		tailModel[61] = new ModelRendererTurbo(this, 225, 73, textureX, textureY); // Box 187
		tailModel[62] = new ModelRendererTurbo(this, 73, 81, textureX, textureY); // Box 188
		tailModel[63] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 189
		tailModel[64] = new ModelRendererTurbo(this, 345, 97, textureX, textureY); // Box 190
		tailModel[65] = new ModelRendererTurbo(this, 505, 97, textureX, textureY); // Box 191
		tailModel[66] = new ModelRendererTurbo(this, 121, 105, textureX, textureY); // Box 192
		tailModel[67] = new ModelRendererTurbo(this, 145, 105, textureX, textureY); // Box 193
		tailModel[68] = new ModelRendererTurbo(this, 153, 105, textureX, textureY); // Box 194
		tailModel[69] = new ModelRendererTurbo(this, 161, 105, textureX, textureY); // Box 195
		tailModel[70] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 230

		tailModel[0].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0F, 0F, -0.5F, -2.75F, -2F, -0.5F, -2.75F, 1F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, -0.25F, 2.75F, -2F, -0.25F, 2.75F, 1F, 0F, -0.5F, 0.5F); // Box 119
		tailModel[0].setRotationPoint(54F, -25F, -2F);

		tailModel[1].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, -0.25F, -2.25F, -3.75F, -0.25F, -2.25F, 3F, 0F, 0F, 0F, 0F, 0.5F, 1F, -0.25F, 1.25F, -3.75F, -0.25F, 1.25F, 3F, 0F, 0.5F, -1F); // Box 120
		tailModel[1].setRotationPoint(54F, -23F, -4F);

		tailModel[2].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, -0.25F, -3.75F, -2F, -0.25F, -3.75F, 1F, 0F, -1F, -1F, 0F, 0F, 2F, -0.25F, 2.25F, -1.75F, -0.25F, 2.25F, 1F, 0F, 0F, -2F); // Box 121
		tailModel[2].setRotationPoint(54F, -25F, -2F);

		tailModel[3].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0.5F, 0.5F, -0.5F, -2.75F, 1F, -0.5F, -2.75F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0.5F, -0.25F, 2.75F, 1F, -0.25F, 2.75F, -2F, 0F, 0F, 0F); // Box 122
		tailModel[3].setRotationPoint(54F, -25F, 1F);

		tailModel[4].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, -0.25F, -2.25F, 3F, -0.25F, -2.25F, -3.75F, 0F, 0F, 0F, 0F, 0.5F, -1F, -0.25F, 1.25F, 3F, -0.25F, 1.25F, -3.75F, 0F, 0.5F, 1F); // Box 123
		tailModel[4].setRotationPoint(54F, -23F, 3F);

		tailModel[5].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, -1F, -1F, -0.25F, -3.75F, 1F, -0.25F, -3.75F, -2F, 0F, 0F, 0F, 0F, 0F, -2F, -0.25F, 2.25F, 1F, -0.25F, 2.25F, -1.75F, 0F, 0F, 2F); // Box 124
		tailModel[5].setRotationPoint(54F, -25F, 1F);

		tailModel[6].addShapeBox(0F, 0F, 0F, 36, 1, 1, 0F,0F, 0.75F, 0F, -0.5F, -2.5F, -0.5F, -0.5F, -2.5F, -0.5F, 0F, 0.75F, 0F, 0F, -0.75F, 0F, -0.25F, 2.5F, -0.5F, -0.25F, 2.5F, -0.5F, 0F, -0.75F, 0F); // Box 125
		tailModel[6].setRotationPoint(54F, -24.75F, -0.5F);

		tailModel[7].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0F, -1F, 1.5F, 4F, -2.75F, 1.5F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0.5F, -4.5F, -2.75F, 0.5F, -4.5F, 0F, 0F, 0F, 0F); // Box 126
		tailModel[7].setRotationPoint(54F, -14.75F, -3F);

		tailModel[8].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0F, 0F, 1.5F, 4F, 0F, 1.5F, 4F, -2.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0.5F, -4.5F, 0F, 0.5F, -4.5F, -2.75F, 0F, 0F, -1F); // Box 127
		tailModel[8].setRotationPoint(54F, -14.75F, 0F);

		tailModel[9].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, -0.25F, -0.75F, -4.75F, -0.25F, -0.75F, 4F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, -0.75F, -0.75F, -4.75F, -0.75F, -0.75F, 4F, 0F, 0.5F, -0.5F); // Box 128
		tailModel[9].setRotationPoint(54F, -20.5F, -5F);

		tailModel[10].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0.5F, 0.3F, -0.75F, 1.75F, -4.75F, -0.75F, 1.75F, 4F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -1.5F, -3.25F, -4.75F, -1.5F, -3.25F, 4F, 0F, 0F, -0.25F); // Box 129
		tailModel[10].setRotationPoint(54F, -17.5F, -5F);

		tailModel[11].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0F, 0F, 1.5F, 4F, 1.75F, 1.5F, 4F, -4.75F, 0F, 0.25F, -1.5F, 0F, 0F, 0F, 0.5F, -4.5F, 1.75F, 0.5F, -4.5F, -4.75F, 0F, -0.25F, -1.5F); // Box 130
		tailModel[11].setRotationPoint(54F, -14.75F, 2F);

		tailModel[12].addShapeBox(0F, 0F, 0F, 33, 1, 3, 0F,0F, 0.25F, -1.5F, 1.5F, 4F, -4.75F, 1.5F, 4F, 1.75F, 0F, 0F, 0F, 0F, -0.25F, -1.5F, 0.5F, -4.5F, -4.75F, 0.5F, -4.5F, 1.75F, 0F, 0F, 0F); // Box 131
		tailModel[12].setRotationPoint(54F, -14.75F, -5F);

		tailModel[13].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 3.75F, -4.75F, -0.5F, 3.75F, 3.75F, 0F, 0.5F, -0.25F, 0F, -1F, -0.15F, -1.5F, -4.25F, -4.75F, -1.5F, -4.25F, 3.75F, 0F, -1F, 0F); // Box 132
		tailModel[13].setRotationPoint(54F, -15F, -5F);

		tailModel[14].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0.5F, -0.15F, -0.5F, 3.75F, -4.75F, -0.5F, 3.75F, 3.75F, 0F, 0.5F, 0F, 0F, -1F, -0.5F, -0.5F, -4.75F, -4.75F, -0.5F, -4.75F, 3.75F, 0F, -1.5F, 0F); // Box 133
		tailModel[14].setRotationPoint(54F, -14.5F, -5F);

		tailModel[15].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0F, 0F, 0.5F, 3.75F, -4.25F, 0.5F, 3.75F, 3.25F, 0F, 0.5F, -0.5F, 0F, -0.5F, -1F, 0.5F, -4.75F, -4.25F, 0.5F, -4.75F, 3.25F, 0F, -1.5F, 0F); // Box 134
		tailModel[15].setRotationPoint(54F, -14.5F, -4.5F);

		tailModel[16].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0F, 0F, -0.25F, -0.75F, 4F, -0.25F, -0.75F, -4.75F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -0.75F, -0.75F, 4F, -0.75F, -0.75F, -4.75F, 0F, 0.5F, 0.3F); // Box 135
		tailModel[16].setRotationPoint(54F, -20.5F, 4F);

		tailModel[17].addShapeBox(0F, 0F, 0F, 36, 2, 1, 0F,0F, 0.5F, -0.5F, -0.75F, 1.75F, 4F, -0.75F, 1.75F, -4.75F, 0F, 0.5F, 0.3F, 0F, 0F, -0.25F, -1.5F, -3.25F, 4F, -1.5F, -3.25F, -4.75F, 0F, 0F, 0F); // Box 136
		tailModel[17].setRotationPoint(54F, -17.5F, 4F);

		tailModel[18].addShapeBox(0F, 0F, 0F, 35, 1, 1, 0F,0F, 0.5F, -0.25F, -0.5F, 3.75F, 3.75F, -0.5F, 3.75F, -4.75F, 0F, 0.5F, 0F, 0F, -1F, 0F, -1.5F, -4.25F, 3.75F, -1.5F, -4.25F, -4.75F, 0F, -1F, -0.15F); // Box 137
		tailModel[18].setRotationPoint(54F, -15F, 4F);

		tailModel[19].addShapeBox(0F, 0F, 0F, 34, 1, 1, 0F,0F, 0.5F, 0F, -0.5F, 3.75F, 3.75F, -0.5F, 3.75F, -4.75F, 0F, 0.5F, -0.15F, 0F, -1.5F, 0F, -0.5F, -4.75F, 3.75F, -0.5F, -4.75F, -4.75F, 0F, -1F, -0.5F); // Box 138
		tailModel[19].setRotationPoint(54F, -14.5F, 4F);

		tailModel[20].addShapeBox(0F, 0F, 0F, 33, 1, 1, 0F,0F, 0.5F, -0.5F, 0.5F, 3.75F, 3.25F, 0.5F, 3.75F, -4.25F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0.5F, -4.75F, 3.25F, 0.5F, -4.75F, -4.25F, 0F, -0.5F, -1F); // Box 139
		tailModel[20].setRotationPoint(54F, -14.5F, 3.5F);

		tailModel[21].addShapeBox(0F, 0F, 0F, 26, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, -0.5F, 0F, 0F, 1F); // Box 140
		tailModel[21].setRotationPoint(55F, -26F, 0F);

		tailModel[22].addShapeBox(0F, 0F, 0F, 26, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 2F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Box 141
		tailModel[22].setRotationPoint(55F, -26F, -1F);

		tailModel[23].addShapeBox(0F, 0F, 0F, 26, 25, 2, 0F,-25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -25F, 0F, -0.5F, 0F, 0F, 0F, 0F, 2F, -0.5F, 0F, 2F, -0.5F, 0F, 0F, 0F); // Box 142
		tailModel[23].setRotationPoint(55F, -51F, -1F);

		tailModel[24].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 144
		tailModel[24].setRotationPoint(51F, -26F, -1F);

		tailModel[25].addShapeBox(0F, 0F, 0F, 26, 25, 1, 0F,-25F, 0F, -1F, 1F, 0F, -0.5F, 1F, 0F, 0F, -25F, 0F, 0F, 0F, -1F, -1F, -24F, 0F, 0F, -24F, 0F, -0.5F, 0F, -1F, 0F); // Box 145
		tailModel[25].setRotationPoint(53F, -51F, -1F);

		tailModel[26].addShapeBox(0F, 0F, 0F, 26, 25, 1, 0F,-25F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -25F, 0F, -1F, 0F, -1F, 0F, -24F, 0F, -0.5F, -24F, 0F, 0F, 0F, -1F, -1F); // Box 146
		tailModel[26].setRotationPoint(53F, -51F, 0F);

		tailModel[27].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		tailModel[27].setRotationPoint(49F, -26F, -1F);

		tailModel[28].addShapeBox(0F, 0F, 0F, 4, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0.5F); // Box 148
		tailModel[28].setRotationPoint(51F, -26F, 0F);

		tailModel[29].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 149
		tailModel[29].setRotationPoint(49F, -26F, 0F);

		tailModel[30].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 150
		tailModel[30].setRotationPoint(51F, -27F, -1F);

		tailModel[31].addShapeBox(0F, 0F, 0F, 4, 1, 1, 0F,0F, -0.75F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, 0F, -0.75F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 151
		tailModel[31].setRotationPoint(51F, -27F, 0F);

		tailModel[32].addShapeBox(0F, 0F, 0F, 8, 1, 1, 0F,0F, 0F, 0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.4F, 0.5F, 0F, -0.4F, 0F, 0F, 0F); // Box 152
		tailModel[32].setRotationPoint(81F, -23F, -0.5F);

		tailModel[33].addShapeBox(0F, 0F, 0F, 7, 28, 2, 0F,0F, 0F, -0.5F, -4.5F, -0.5F, -1F, -4.5F, -0.5F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F); // Box 153
		tailModel[33].setRotationPoint(82.5F, -51F, -1F);

		tailModel[34].addShapeBox(0F, 0F, 0F, 2, 28, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F); // Box 154
		tailModel[34].setRotationPoint(80.5F, -51F, -1F);

		tailModel[35].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 155
		tailModel[35].setRotationPoint(80.5F, -52F, -1F);

		tailModel[36].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,-0.75F, -0.25F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -0.75F, -0.25F, -1F, 0.5F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0.5F, 0F, -1F); // Box 156
		tailModel[36].setRotationPoint(78.5F, -52F, -1F);

		tailModel[37].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, -0.75F, -0.75F, -0.5F, -1F, -0.75F, -0.5F, -1F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0.5F, 0.5F, -1F, 0.5F, 0.5F, -1F, 0F, 0F, -0.5F); // Box 157
		tailModel[37].setRotationPoint(82.5F, -52F, -1F);

		tailModel[38].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.5F, 0F, 0F); // Box 158
		tailModel[38].setRotationPoint(62F, -31.5F, -2F);

		tailModel[39].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,-3F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, -2.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		tailModel[39].setRotationPoint(62F, -33F, -2F);

		tailModel[40].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 160
		tailModel[40].setRotationPoint(62F, -32F, -2F);

		tailModel[41].addShapeBox(0F, 0F, 0F, 4, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 13F, -0.5F, 0F); // Box 164
		tailModel[41].setRotationPoint(75F, -32F, -28F);

		tailModel[42].addShapeBox(0F, 0F, 0F, 4, 1, 26, 0F,-1.25F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.5F, 0F, 10F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F); // Box 165
		tailModel[42].setRotationPoint(75F, -33F, -28F);

		tailModel[43].addShapeBox(0F, 0F, 0F, 4, 1, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, 0F, 0F, -1.5F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 11.5F, -0.5F, 0F); // Box 166
		tailModel[43].setRotationPoint(75F, -31.5F, -28F);

		tailModel[44].addShapeBox(0F, 0F, 0F, 2, 1, 25, 0F,0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 0F, 0F); // Box 170
		tailModel[44].setRotationPoint(79F, -32.25F, -28F);

		tailModel[45].addShapeBox(0F, 0F, 0F, 1, 1, 25, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, -1F, -0.25F, 0F); // Box 169
		tailModel[45].setRotationPoint(81F, -32.25F, -28F);

		tailModel[46].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 172
		tailModel[46].setRotationPoint(79F, -32.25F, -3F);

		tailModel[47].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-1F, 0F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 173
		tailModel[47].setRotationPoint(81F, -32.25F, -3F);

		tailModel[48].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 174
		tailModel[48].setRotationPoint(79F, -32.25F, -2F);

		tailModel[49].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, -0.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 1F, 0F, 0F, 0F, -0.25F, 0F, -0.5F, -0.75F, 0F, -1.5F, -0.75F, 0F, 1F, -0.25F, 0F); // Box 175
		tailModel[49].setRotationPoint(81F, -32.25F, -2F);

		tailModel[50].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 0F, 0F); // Box 176
		tailModel[50].setRotationPoint(79F, -32.25F, 0F);

		tailModel[51].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,1F, 0F, 0F, -1.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, -1.5F, -0.75F, 0F, -0.5F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 177
		tailModel[51].setRotationPoint(81F, -32.25F, 0F);

		tailModel[52].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.5F, -0.5F, 0F); // Box 178
		tailModel[52].setRotationPoint(62F, -31.5F, 0F);

		tailModel[53].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,-2.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.5F, 0F, -3F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 179
		tailModel[53].setRotationPoint(62F, -33F, 0F);

		tailModel[54].addShapeBox(0F, 0F, 0F, 17, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 180
		tailModel[54].setRotationPoint(62F, -32F, 0F);

		tailModel[55].addShapeBox(0F, 0F, 0F, 4, 1, 26, 0F,13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 13F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 181
		tailModel[55].setRotationPoint(75F, -32F, 2F);

		tailModel[56].addShapeBox(0F, 0F, 0F, 4, 1, 26, 0F,10F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, -1.25F, -0.75F, 0F, 13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 182
		tailModel[56].setRotationPoint(75F, -33F, 2F);

		tailModel[57].addShapeBox(0F, 0F, 0F, 4, 1, 26, 0F,13F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 11.5F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, -1.5F, -0.75F, 0F); // Box 183
		tailModel[57].setRotationPoint(75F, -31.5F, 2F);

		tailModel[58].addShapeBox(0F, 0F, 0F, 2, 1, 25, 0F,0F, 0.25F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F); // Box 184
		tailModel[58].setRotationPoint(79F, -32.25F, 3F);

		tailModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 25, 0F,-1F, 0F, 0F, 1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -0.25F, 0F, 1F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 185
		tailModel[59].setRotationPoint(81F, -32.25F, 3F);

		tailModel[60].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0.25F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 0F, 0F); // Box 186
		tailModel[60].setRotationPoint(79F, -32.25F, 2F);

		tailModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 1F, -0.25F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 1F, -0.75F, 0F, -1F, -0.25F, 0F); // Box 187
		tailModel[61].setRotationPoint(81F, -32.25F, 2F);

		tailModel[62].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Box 188
		tailModel[62].setRotationPoint(76F, -32.25F, -29F);

		tailModel[63].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, 0F, 0.25F, -0.25F, -0.5F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0F, 0.25F, -0.5F, -0.5F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F); // Box 189
		tailModel[63].setRotationPoint(78.75F, -32.25F, -29F);

		tailModel[64].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-1.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, -1.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F); // Box 190
		tailModel[64].setRotationPoint(74.25F, -32.25F, -29F);

		tailModel[65].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, -0.25F, -0.5F, 0.25F, -0.25F, -1F, 0.25F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, 0.25F, -0.75F, -1F, 0.25F, -0.75F, 0F, -0.25F, -0.25F, 0F); // Box 191
		tailModel[65].setRotationPoint(80.75F, -32.25F, -29F);

		tailModel[66].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 192
		tailModel[66].setRotationPoint(76F, -32.25F, 28F);

		tailModel[67].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, -0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.5F, -0.5F, -0.25F, -0.25F, 0F); // Box 193
		tailModel[67].setRotationPoint(78.75F, -32.25F, 28F);

		tailModel[68].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, -0.25F, -0.75F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, -1.5F, -0.25F, -0.25F); // Box 194
		tailModel[68].setRotationPoint(74.25F, -32.25F, 28F);

		tailModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.25F, 0F, 0F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, -1F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.25F, -0.75F, -1F, -0.25F, -0.5F, -0.5F); // Box 195
		tailModel[69].setRotationPoint(80.75F, -32.25F, 28F);

		tailModel[70].addShapeBox(0F, 0F, 0F, 81, 1, 1, 0F,0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, -0.9F, 0F, 0F, -0.9F, 0F, -0.9F, 0F, 0F, -16.9F, 0F, 0F, -16.9F, -0.9F, 0F, -0.9F, -0.9F); // Box 230
		tailModel[70].setRotationPoint(-1.5F, -34.5F, 0.25F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 145, 177, textureX, textureY); // Box 278
		leftWingModel[1] = new ModelRendererTurbo(this, 193, 177, textureX, textureY); // Box 279
		leftWingModel[2] = new ModelRendererTurbo(this, 217, 177, textureX, textureY); // Box 280
		leftWingModel[3] = new ModelRendererTurbo(this, 241, 177, textureX, textureY); // Box 282
		leftWingModel[4] = new ModelRendererTurbo(this, 289, 177, textureX, textureY); // Box 283
		leftWingModel[5] = new ModelRendererTurbo(this, 313, 177, textureX, textureY); // Box 285
		leftWingModel[6] = new ModelRendererTurbo(this, 329, 177, textureX, textureY); // Box 286
		leftWingModel[7] = new ModelRendererTurbo(this, 393, 177, textureX, textureY); // Box 287
		leftWingModel[8] = new ModelRendererTurbo(this, 433, 177, textureX, textureY); // Box 289
		leftWingModel[9] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 291
		leftWingModel[10] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 292
		leftWingModel[11] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 293
		leftWingModel[12] = new ModelRendererTurbo(this, 473, 177, textureX, textureY); // Box 294
		leftWingModel[13] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 308
		leftWingModel[14] = new ModelRendererTurbo(this, 73, 193, textureX, textureY); // Box 309
		leftWingModel[15] = new ModelRendererTurbo(this, 121, 193, textureX, textureY); // Box 310
		leftWingModel[16] = new ModelRendererTurbo(this, 313, 193, textureX, textureY); // Box 311
		leftWingModel[17] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 312
		leftWingModel[18] = new ModelRendererTurbo(this, 393, 193, textureX, textureY); // Box 313
		leftWingModel[19] = new ModelRendererTurbo(this, 457, 193, textureX, textureY); // Box 314
		leftWingModel[20] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 315
		leftWingModel[21] = new ModelRendererTurbo(this, 185, 201, textureX, textureY); // Box 316
		leftWingModel[22] = new ModelRendererTurbo(this, 225, 201, textureX, textureY); // Box 317
		leftWingModel[23] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 318
		leftWingModel[24] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 319
		leftWingModel[25] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 320
		leftWingModel[26] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 321
		leftWingModel[27] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 323
		leftWingModel[28] = new ModelRendererTurbo(this, 385, 177, textureX, textureY); // Box 324
		leftWingModel[29] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 325
		leftWingModel[30] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 326
		leftWingModel[31] = new ModelRendererTurbo(this, 425, 177, textureX, textureY); // Box 327
		leftWingModel[32] = new ModelRendererTurbo(this, 57, 193, textureX, textureY); // Box 328
		leftWingModel[33] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 329
		leftWingModel[34] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 330
		leftWingModel[35] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Box 353
		leftWingModel[36] = new ModelRendererTurbo(this, 145, 281, textureX, textureY); // Box 354
		leftWingModel[37] = new ModelRendererTurbo(this, 65, 297, textureX, textureY); // Box 355
		leftWingModel[38] = new ModelRendererTurbo(this, 153, 297, textureX, textureY); // Box 357
		leftWingModel[39] = new ModelRendererTurbo(this, 345, 305, textureX, textureY); // Box 358
		leftWingModel[40] = new ModelRendererTurbo(this, 425, 305, textureX, textureY); // Box 359
		leftWingModel[41] = new ModelRendererTurbo(this, 65, 321, textureX, textureY); // Box 360
		leftWingModel[42] = new ModelRendererTurbo(this, 385, 321, textureX, textureY); // Box 361
		leftWingModel[43] = new ModelRendererTurbo(this, 137, 329, textureX, textureY); // Box 362
		leftWingModel[44] = new ModelRendererTurbo(this, 337, 193, textureX, textureY); // Box 363
		leftWingModel[45] = new ModelRendererTurbo(this, 297, 241, textureX, textureY); // Box 364
		leftWingModel[46] = new ModelRendererTurbo(this, 57, 201, textureX, textureY); // Box 366
		leftWingModel[47] = new ModelRendererTurbo(this, 105, 201, textureX, textureY); // Box 367
		leftWingModel[48] = new ModelRendererTurbo(this, 449, 265, textureX, textureY); // Box 368
		leftWingModel[49] = new ModelRendererTurbo(this, 1, 257, textureX, textureY); // Box 369
		leftWingModel[50] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 370
		leftWingModel[51] = new ModelRendererTurbo(this, 73, 257, textureX, textureY); // Box 372
		leftWingModel[52] = new ModelRendererTurbo(this, 129, 257, textureX, textureY); // Box 373
		leftWingModel[53] = new ModelRendererTurbo(this, 337, 201, textureX, textureY); // Box 375
		leftWingModel[54] = new ModelRendererTurbo(this, 145, 193, textureX, textureY); // Box 368
		leftWingModel[55] = new ModelRendererTurbo(this, 377, 193, textureX, textureY); // Box 369
		leftWingModel[56] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 370
		leftWingModel[57] = new ModelRendererTurbo(this, 489, 193, textureX, textureY); // Box 371
		leftWingModel[58] = new ModelRendererTurbo(this, 497, 185, textureX, textureY); // Box 372
		leftWingModel[59] = new ModelRendererTurbo(this, 169, 201, textureX, textureY); // Box 373
		leftWingModel[60] = new ModelRendererTurbo(this, 209, 201, textureX, textureY); // Box 374
		leftWingModel[61] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 375
		leftWingModel[62] = new ModelRendererTurbo(this, 297, 209, textureX, textureY); // Box 376
		leftWingModel[63] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 377
		leftWingModel[64] = new ModelRendererTurbo(this, 33, 217, textureX, textureY); // Box 378
		leftWingModel[65] = new ModelRendererTurbo(this, 73, 217, textureX, textureY); // Box 379
		leftWingModel[66] = new ModelRendererTurbo(this, 217, 217, textureX, textureY); // Box 380
		leftWingModel[67] = new ModelRendererTurbo(this, 241, 217, textureX, textureY); // Box 381
		leftWingModel[68] = new ModelRendererTurbo(this, 321, 217, textureX, textureY); // Box 382
		leftWingModel[69] = new ModelRendererTurbo(this, 417, 217, textureX, textureY); // Box 383
		leftWingModel[70] = new ModelRendererTurbo(this, 481, 241, textureX, textureY); // Box 384
		leftWingModel[71] = new ModelRendererTurbo(this, 457, 217, textureX, textureY); // Box 385
		leftWingModel[72] = new ModelRendererTurbo(this, 73, 225, textureX, textureY); // Box 386
		leftWingModel[73] = new ModelRendererTurbo(this, 193, 241, textureX, textureY); // Box 387
		leftWingModel[74] = new ModelRendererTurbo(this, 153, 233, textureX, textureY); // Box 388
		leftWingModel[75] = new ModelRendererTurbo(this, 25, 241, textureX, textureY); // Box 389
		leftWingModel[76] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 392
		leftWingModel[77] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 393
		leftWingModel[78] = new ModelRendererTurbo(this, 217, 281, textureX, textureY); // Box 394
		leftWingModel[79] = new ModelRendererTurbo(this, 65, 281, textureX, textureY); // Box 395
		leftWingModel[80] = new ModelRendererTurbo(this, 305, 273, textureX, textureY); // Box 439
		leftWingModel[81] = new ModelRendererTurbo(this, 1, 201, textureX, textureY); // Box 440
		leftWingModel[82] = new ModelRendererTurbo(this, 145, 201, textureX, textureY); // Box 442
		leftWingModel[83] = new ModelRendererTurbo(this, 169, 361, textureX, textureY); // Box 443
		leftWingModel[84] = new ModelRendererTurbo(this, 489, 273, textureX, textureY); // Box 444
		leftWingModel[85] = new ModelRendererTurbo(this, 209, 361, textureX, textureY); // Box 445
		leftWingModel[86] = new ModelRendererTurbo(this, 265, 361, textureX, textureY); // Box 446
		leftWingModel[87] = new ModelRendererTurbo(this, 377, 201, textureX, textureY); // Box 456
		leftWingModel[88] = new ModelRendererTurbo(this, 249, 201, textureX, textureY); // Box 457
		leftWingModel[89] = new ModelRendererTurbo(this, 25, 281, textureX, textureY); // Box 458
		leftWingModel[90] = new ModelRendererTurbo(this, 305, 281, textureX, textureY); // Box 459
		leftWingModel[91] = new ModelRendererTurbo(this, 25, 289, textureX, textureY); // Box 460
		leftWingModel[92] = new ModelRendererTurbo(this, 345, 297, textureX, textureY); // Box 461
		leftWingModel[93] = new ModelRendererTurbo(this, 1, 369, textureX, textureY); // Box 468
		leftWingModel[94] = new ModelRendererTurbo(this, 33, 369, textureX, textureY); // Box 469
		leftWingModel[95] = new ModelRendererTurbo(this, 441, 201, textureX, textureY); // Box 470
		leftWingModel[96] = new ModelRendererTurbo(this, 89, 281, textureX, textureY); // Box 471
		leftWingModel[97] = new ModelRendererTurbo(this, 129, 281, textureX, textureY); // Box 472
		leftWingModel[98] = new ModelRendererTurbo(this, 489, 201, textureX, textureY); // Box 473
		leftWingModel[99] = new ModelRendererTurbo(this, 321, 361, textureX, textureY); // Box 474
		leftWingModel[100] = new ModelRendererTurbo(this, 233, 361, textureX, textureY); // Box 475
		leftWingModel[101] = new ModelRendererTurbo(this, 297, 369, textureX, textureY); // Box 476
		leftWingModel[102] = new ModelRendererTurbo(this, 489, 361, textureX, textureY); // Box 477
		leftWingModel[103] = new ModelRendererTurbo(this, 497, 209, textureX, textureY); // Box 478
		leftWingModel[104] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 479
		leftWingModel[105] = new ModelRendererTurbo(this, 313, 289, textureX, textureY); // Box 480
		leftWingModel[106] = new ModelRendererTurbo(this, 225, 297, textureX, textureY); // Box 482
		leftWingModel[107] = new ModelRendererTurbo(this, 417, 305, textureX, textureY); // Box 483
		leftWingModel[108] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 484
		leftWingModel[109] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 485
		leftWingModel[110] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 486
		leftWingModel[111] = new ModelRendererTurbo(this, 505, 113, textureX, textureY); // Box 487
		leftWingModel[112] = new ModelRendererTurbo(this, 353, 145, textureX, textureY); // Box 521
		leftWingModel[113] = new ModelRendererTurbo(this, 337, 233, textureX, textureY); // Box 522
		leftWingModel[114] = new ModelRendererTurbo(this, 417, 145, textureX, textureY); // Box 523
		leftWingModel[115] = new ModelRendererTurbo(this, 161, 377, textureX, textureY); // Box 524
		leftWingModel[116] = new ModelRendererTurbo(this, 449, 377, textureX, textureY); // Box 525
		leftWingModel[117] = new ModelRendererTurbo(this, 169, 385, textureX, textureY); // Box 526
		leftWingModel[118] = new ModelRendererTurbo(this, 505, 161, textureX, textureY); // Box 527
		leftWingModel[119] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 528
		leftWingModel[120] = new ModelRendererTurbo(this, 321, 185, textureX, textureY); // Box 529
		leftWingModel[121] = new ModelRendererTurbo(this, 217, 385, textureX, textureY); // Box 530
		leftWingModel[122] = new ModelRendererTurbo(this, 265, 385, textureX, textureY); // Box 531
		leftWingModel[123] = new ModelRendererTurbo(this, 313, 385, textureX, textureY); // Box 532
		leftWingModel[124] = new ModelRendererTurbo(this, 273, 145, textureX, textureY); // Box 533

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, -2F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, -1.5F, 2F, 0F, -1.5F, -1.5F, 0F, -0.5F, -1.5F); // Box 278
		leftWingModel[0].setRotationPoint(-23F, -12.5F, -11.5F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -2.5F, 1.75F, 0F, -1.5F, 2F, 0F, 0F, -2F, 0F, -0.5F, -1.25F, 0F, 1F, 1.75F, 0F, 0.5F, 2F, 0F, 0.5F, -2F, 0F, 1F, -1.5F); // Box 279
		leftWingModel[1].setRotationPoint(-31F, -15F, -11.5F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, 1.75F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, -0.5F, -1.5F, 0F, 0F, 1.75F, 0F, -0.5F, 2F, 0F, -0.5F, -1.5F, 0F, 0.25F, -0.5F); // Box 280
		leftWingModel[2].setRotationPoint(-31F, -12.5F, -11.5F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, -1.5F, 2F, 0F, -0.75F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0.5F, 2F, 0F, -0.5F, 2F, 0F, -0.5F, -2F, 0F, 0.5F, -2F); // Box 282
		leftWingModel[3].setRotationPoint(-23F, -15F, -11.5F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, -0.75F, 2F, 0F, -1.75F, 1.75F, 0F, -0.5F, -1.25F, 0F, 0F, -2F, 0F, 0.5F, 2F, 0F, 1F, 1.75F, 0F, 1F, -1.5F, 0F, 0.5F, -2F); // Box 283
		leftWingModel[4].setRotationPoint(-3F, -15F, -11.5F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, 2F, 0F, -0.5F, 1.75F, 0F, -0.5F, -1.5F, 0F, 0F, -2F, 0F, -0.5F, 2F, 0F, 0F, 1.75F, 0F, 0F, -0.75F, 0F, -0.5F, -1.5F); // Box 285
		leftWingModel[5].setRotationPoint(-3F, -13.5F, -11.5F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 20, 1, 9, 0F,0F, -0.5F, 1F, 0F, 0.5F, 1F, 0F, -0.75F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, 0.75F, -0.5F, 0F, 1.75F, -0.5F); // Box 286
		leftWingModel[6].setRotationPoint(-23F, -10.5F, -12.5F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, 0F, 0.75F, 0F, -0.5F, 1F, 0F, -1.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0F, 0.75F, 0F, 0.5F, 1F, 0F, 1.75F, -0.5F, 0F, 1.25F, -0.5F); // Box 287
		leftWingModel[7].setRotationPoint(-31F, -10.5F, -12.5F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F,0F, -0.5F, 1F, 0F, 0.75F, 0.75F, 0F, -1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0.5F, 1F, 0F, -0.75F, 0.75F, 0F, 1.25F, -0.5F, 0F, 1.75F, -0.5F); // Box 289
		leftWingModel[8].setRotationPoint(-3F, -11.5F, -12.5F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, -0.75F, 2F, -2F, -1.25F, 1.75F, 0F, -1F, -1.25F, 0F, 0.3F, -1.75F, 0F, 0.5F, 2F, -2F, 1F, 1.75F, 0F, 1F, -0.75F, 0F, 0.5F, -2F); // Box 291
		leftWingModel[9].setRotationPoint(7F, -14F, -11.25F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1F, 2F, -2F, 1F, 1.75F, 0F, 1F, -1F, 0F, 1F, -2F, 0F, -0.75F, 2F, -2F, -1.25F, 1.75F, 0F, -1F, -0.5F, 0F, 0.1F, 1F); // Box 292
		leftWingModel[10].setRotationPoint(7F, -11.5F, -11.25F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -2.25F, 0F, 0F, -1F, 0F, 0F, 1F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0.75F); // Box 293
		leftWingModel[11].setRotationPoint(-33F, -13.5F, -13.25F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,0F, 0F, 0.75F, 0F, 0F, 0.75F, 0F, -1.75F, -0.5F, 5.75F, 0F, -0.5F, 0F, -1F, 0.75F, 0F, 0F, 0.75F, 0F, 1.25F, -0.5F, 3F, 1F, -0.5F); // Box 294
		leftWingModel[12].setRotationPoint(-33F, -10.5F, -12.5F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 20, 5, 15, 0F,-3F, 0.5F, 0F, 0F, 1F, 0F, 0F, 0.75F, 0F, 0F, 0F, 0F, -3F, -2.25F, 0F, 0F, -3.25F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F); // Box 308
		leftWingModel[13].setRotationPoint(-23F, -13.5F, -28.5F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 8, 5, 15, 0F,-5F, 0F, 0F, 3F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0.25F, -5F, -2.25F, 0F, 3F, -2.25F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0.25F); // Box 309
		leftWingModel[14].setRotationPoint(-31F, -13.5F, -28.5F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 3, 3, 15, 0F,0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.6F, 0.1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 1.2F, 0.1F, 0F, 1.5F, 0F); // Box 310
		leftWingModel[15].setRotationPoint(-3F, -14.5F, -28.5F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F,0F, 0F, 0F, 0F, -1F, 0F, 4F, -1.85F, 0.3F, 0F, -0.35F, 0.1F, 0F, 0F, 0F, 0F, -1F, 0F, 4F, -0.15F, 0.3F, 0F, 2F, 0F); // Box 311
		leftWingModel[16].setRotationPoint(0F, -14.25F, -28.5F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,-5.25F, -1.25F, 0F, 3F, 0F, 0F, -2F, -1F, 0.25F, 0F, -2.25F, 0.25F, -5.25F, -3F, 0F, 3F, -2.25F, 0F, -2F, -1F, 0.25F, 0F, -2F, 0.25F); // Box 312
		leftWingModel[17].setRotationPoint(-33F, -13.5F, -28.5F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 17, 4, 13, 0F,-3F, 1.25F, 0F, 0F, 1.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -3F, -1.75F, 0F, 0F, -2.75F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F); // Box 313
		leftWingModel[18].setRotationPoint(-20F, -14F, -41.5F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,-5F, 0.25F, 0F, 3F, 0.75F, 0F, 0F, -0.5F, 0F, 0F, -1F, 0F, -5F, -2.25F, 0F, 3F, -2.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F); // Box 314
		leftWingModel[19].setRotationPoint(-26F, -14.5F, -41.5F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 4, 5, 13, 0F,-5.25F, -1F, 0F, 3F, 0.25F, 0F, -2F, -1F, 0F, -0.25F, -2.25F, 0F, -5.25F, -3F, 0F, 3F, -2.25F, 0F, -2F, -1.25F, 0F, -0.25F, -2F, 0F); // Box 315
		leftWingModel[20].setRotationPoint(-28F, -14.5F, -41.5F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, 0.75F, 0F, -0.75F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F); // Box 316
		leftWingModel[21].setRotationPoint(-3F, -14.75F, -41.5F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0.75F, 0.75F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0.75F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F); // Box 317
		leftWingModel[22].setRotationPoint(0F, -14.5F, -41.5F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 17, 4, 52, 0F,-19F, 5.25F, 0F, 8F, 5.5F, 0F, 0F, 1.5F, 0F, -3F, 1.25F, 0F, -19F, -7.5F, 0F, 8F, -8.15F, 0F, 0F, -2.75F, 0F, -3F, -1.75F, 0F); // Box 318
		leftWingModel[23].setRotationPoint(-20F, -14F, -93.5F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 6, 5, 52, 0F,-22F, 4.5F, 0F, 19F, 4.75F, 0F, 3F, 0.75F, 0F, -5F, 0.25F, 0F, -22F, -8F, 0F, 19F, -8F, 0F, 3F, -2.25F, 0F, -5F, -2.25F, 0F); // Box 319
		leftWingModel[24].setRotationPoint(-26F, -14.5F, -93.5F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 4, 5, 52, 0F,-22F, 3.75F, 0F, 20F, 4.5F, 0F, 3F, 0.25F, 0F, -5.25F, -1F, 0F, -22F, -8.25F, 0F, 20F, -8F, 0F, 3F, -2.25F, 0F, -5.25F, -3F, 0F); // Box 320
		leftWingModel[25].setRotationPoint(-28F, -14.5F, -93.5F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 52, 0F,-8F, 4.75F, 0F, 7F, 4.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.75F, 0F, -8F, -5.4F, 0F, 7F, -5.75F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F); // Box 321
		leftWingModel[26].setRotationPoint(-3F, -14.75F, -93.5F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 20, 0F,-2.05F, 2.2F, -1.25F, 2.25F, 1.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0.75F, 0F, -2.05F, -2.5F, -1.25F, 2.25F, -3.25F, 0F, 0F, -1.75F, 0F, 0.75F, -0.5F, 0F); // Box 323
		leftWingModel[27].setRotationPoint(0F, -14.5F, -61.5F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.55F, 0.5F, -0.65F, 0.25F, -0.5F, -2F, 0.25F, -0.5F, -1F, -0.1F, 0.25F, -0.05F, -0.55F, 0.15F, -0.65F, 0.25F, -0.5F, -2F, 0.25F, -0.5F, -1F, -0.05F, 0.5F, 0F); // Box 324
		leftWingModel[28].setRotationPoint(2F, -16.5F, -64.5F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 30, 0F,-8F, 4.5F, 0F, 7F, 4.25F, 0F, 3.5F, 1.5F, 0.9F, -3.6F, 2.2F, -0.35F, -8F, -5.75F, 0F, 7F, -6.25F, 0F, 3.5F, -3.5F, 0.9F, -3.55F, -2.6F, -0.35F); // Box 325
		leftWingModel[29].setRotationPoint(-1F, -14.75F, -93.5F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-2.75F, 0F, -1F, 3F, 0.25F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -2.75F, -0.5F, -1F, 3F, -0.75F, 0F, 0F, 0.5F, 0F, 0F, 0.25F, 0F); // Box 326
		leftWingModel[30].setRotationPoint(-6F, -19F, -99.5F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,-1F, 0.25F, 0F, 1.25F, 0.5F, 0F, -1F, 0.25F, 0F, 2F, 0F, 0F, -1F, -0.75F, 0F, 1.25F, -0.75F, 0F, -1F, 0.5F, 0F, 2F, 0.5F, 0F); // Box 327
		leftWingModel[31].setRotationPoint(-2F, -19F, -99.5F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,-0.25F, 0.5F, 0F, 0F, 0.5F, -1.25F, -1F, 0.5F, 0F, 2F, 0.25F, 0F, -0.25F, -0.75F, 0F, 0F, -1F, -1.25F, -1F, -0.15F, 0F, 2F, 0.5F, 0F); // Box 328
		leftWingModel[32].setRotationPoint(1F, -19F, -99.5F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,0F, 0.5F, 0F, 0F, 0.25F, -0.75F, -1F, 0.25F, -0.25F, 1F, 0.5F, -0.25F, 0F, -1F, 0F, 0F, -1.25F, -0.75F, -1F, -0.5F, -0.25F, 1F, -0.15F, -0.25F); // Box 329
		leftWingModel[33].setRotationPoint(6F, -19F, -98.25F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,0F, 0.25F, 0.25F, -0.25F, 0.25F, -1.25F, 0F, 0F, -0.25F, 1F, 0.25F, -0.25F, 0F, -1.25F, 0.25F, -0.25F, -1.25F, -1.25F, 0F, -1F, -0.25F, 1F, -0.5F, -0.25F); // Box 330
		leftWingModel[34].setRotationPoint(8F, -19F, -97.25F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 28, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 353
		leftWingModel[35].setRotationPoint(-25F, -11.5F, -40F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 28, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 354
		leftWingModel[36].setRotationPoint(-25F, -8.5F, -41F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 28, 3, 13, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 355
		leftWingModel[37].setRotationPoint(-25F, -6.5F, -41F);

		leftWingModel[38].addShapeBox(0F, 0F, 0F, 28, 1, 13, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 357
		leftWingModel[38].setRotationPoint(-25F, -3.5F, -41F);

		leftWingModel[39].addShapeBox(0F, 0F, 0F, 28, 2, 11, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		leftWingModel[39].setRotationPoint(-25F, -2.5F, -40F);

		leftWingModel[40].addShapeBox(0F, 0F, 0F, 28, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 359
		leftWingModel[40].setRotationPoint(-25F, -0.5F, -40F);

		leftWingModel[41].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 360
		leftWingModel[41].setRotationPoint(-25F, 0.5F, -39F);

		leftWingModel[42].addShapeBox(0F, 0F, 0F, 28, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		leftWingModel[42].setRotationPoint(-25F, -12.5F, -40F);

		leftWingModel[43].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		leftWingModel[43].setRotationPoint(-25F, -13.5F, -39F);

		leftWingModel[44].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 363
		leftWingModel[44].setRotationPoint(-37F, -6.5F, -41F);

		leftWingModel[45].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 364
		leftWingModel[45].setRotationPoint(-37F, -13.5F, -39F);

		leftWingModel[46].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 366
		leftWingModel[46].setRotationPoint(-37F, -6.5F, -31F);

		leftWingModel[47].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 367
		leftWingModel[47].setRotationPoint(-37F, -8.5F, -31F);

		leftWingModel[48].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 368
		leftWingModel[48].setRotationPoint(-37F, -11.5F, -40F);

		leftWingModel[49].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 369
		leftWingModel[49].setRotationPoint(-37F, -11.5F, -39F);

		leftWingModel[50].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 370
		leftWingModel[50].setRotationPoint(-37F, -8.5F, -41F);

		leftWingModel[51].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F); // Box 372
		leftWingModel[51].setRotationPoint(-37F, -1.5F, -39F);

		leftWingModel[52].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F); // Box 373
		leftWingModel[52].setRotationPoint(-37F, 0.5F, -39F);

		leftWingModel[53].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0.25F, 0F, 0F, 0.25F); // Box 375
		leftWingModel[53].setRotationPoint(-37F, -3.5F, -41F);

		leftWingModel[54].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F); // Box 368
		leftWingModel[54].setRotationPoint(-43F, -6.5F, -31F);

		leftWingModel[55].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, -0.5F, -2.5F); // Box 369
		leftWingModel[55].setRotationPoint(-48F, -6.5F, -31F);

		leftWingModel[56].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, -2.5F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F); // Box 370
		leftWingModel[56].setRotationPoint(-48F, -6.5F, -41F);

		leftWingModel[57].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 371
		leftWingModel[57].setRotationPoint(-43F, -6.5F, -41F);

		leftWingModel[58].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -1.25F, 0F, -0.5F, -3F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, -0.5F, -3F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F); // Box 372
		leftWingModel[58].setRotationPoint(10F, -6.5F, -41.5F);

		leftWingModel[59].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 373
		leftWingModel[59].setRotationPoint(3F, -6.5F, -41.5F);

		leftWingModel[60].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F); // Box 374
		leftWingModel[60].setRotationPoint(3F, -6.5F, -30.5F);

		leftWingModel[61].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, -3F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, -3F, 0F, 0F, -1.25F); // Box 375
		leftWingModel[61].setRotationPoint(10F, -6.5F, -30.5F);

		leftWingModel[62].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F); // Box 376
		leftWingModel[62].setRotationPoint(-43F, -8.5F, -31F);

		leftWingModel[63].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -0.5F, 2.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, -0.5F, -4F, 0F, 0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0.5F, -2.5F); // Box 377
		leftWingModel[63].setRotationPoint(-48F, -8.5F, -31F);

		leftWingModel[64].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0.5F, -2.5F, 0F, -0.5F, 2F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, -0.5F, -4F); // Box 378
		leftWingModel[64].setRotationPoint(-48F, -3.5F, -31F);

		leftWingModel[65].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 379
		leftWingModel[65].setRotationPoint(-43F, -3.5F, -31F);

		leftWingModel[66].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0.5F, -2.5F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.5F, 0F, -0.5F, -4F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, -0.5F, 2F); // Box 380
		leftWingModel[66].setRotationPoint(-48F, -3.5F, -41F);

		leftWingModel[67].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 381
		leftWingModel[67].setRotationPoint(-43F, -3.5F, -41F);

		leftWingModel[68].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -0.5F, -4F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, -0.5F, 2.25F, 0F, 0.5F, -2.5F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.5F); // Box 382
		leftWingModel[68].setRotationPoint(-48F, -8.5F, -41F);

		leftWingModel[69].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 383
		leftWingModel[69].setRotationPoint(-43F, -8.5F, -41F);

		leftWingModel[70].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, -1.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 384
		leftWingModel[70].setRotationPoint(-43F, -11.5F, -39F);

		leftWingModel[71].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, -1.75F, -1.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.75F, -1.25F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F); // Box 385
		leftWingModel[71].setRotationPoint(-43F, -12.5F, -38F);

		leftWingModel[72].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1.75F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, -2.25F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F); // Box 386
		leftWingModel[72].setRotationPoint(-48F, -10.5F, -38F);

		leftWingModel[73].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -1.375F, -3.75F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.375F, -3.75F, 0F, 0.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.75F, -2.25F); // Box 387
		leftWingModel[73].setRotationPoint(-43F, -12.5F, -39F);

		leftWingModel[74].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -2.5F, -2.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -2.5F, -2.75F, 0F, 0.75F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, -2.25F); // Box 388
		leftWingModel[74].setRotationPoint(-48F, -11.5F, -38F);

		leftWingModel[75].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -2.625F, -3.25F, 0F, -0.625F, -2.75F, 0F, -0.625F, -2.75F, 0F, -2.625F, -3.25F, 0F, 0.75F, -2.75F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, 0.75F, -2.75F); // Box 389
		leftWingModel[75].setRotationPoint(-48F, -11.75F, -38F);

		leftWingModel[76].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -1.75F, -2.25F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1.75F, -2.25F); // Box 392
		leftWingModel[76].setRotationPoint(-43F, 0.5F, -38F);

		leftWingModel[77].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0.75F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, -2.25F, 0F, -2.5F, -3F, 0F, -0.75F, -2.25F, 0F, -0.75F, -2.25F, 0F, -2.5F, -3F); // Box 393
		leftWingModel[77].setRotationPoint(-48F, -0.5F, -38F);

		leftWingModel[78].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, -1.75F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, -2.25F); // Box 394
		leftWingModel[78].setRotationPoint(-48F, -1.5F, -38F);

		leftWingModel[79].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.5F, -1F); // Box 395
		leftWingModel[79].setRotationPoint(-43F, -1.5F, -39F);

		leftWingModel[80].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 439
		leftWingModel[80].setRotationPoint(3F, -8.5F, -41.5F);

		leftWingModel[81].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -1.75F, 0F, -0.5F, -4F, 0F, -0.5F, 1.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0.5F, -3F, 0F, 0.5F, 0.5F, 0F, 0F, 0.25F); // Box 440
		leftWingModel[81].setRotationPoint(10F, -8.5F, -41.5F);

		leftWingModel[82].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.5F, 0.25F, 0F, -2F, -2F, 0F, -2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -1.25F); // Box 442
		leftWingModel[82].setRotationPoint(10F, -11.5F, -38F);

		leftWingModel[83].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F,0F, -1F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 1F); // Box 443
		leftWingModel[83].setRotationPoint(3F, -13.5F, -39F);

		leftWingModel[84].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, -0.75F, -1F, 0F, -2.5F, -2.75F, 0F, -2.5F, -2.75F, 0F, -0.75F, -1F, 0F, -0.5F, 0.25F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -0.5F, 0.25F); // Box 444
		leftWingModel[84].setRotationPoint(10F, -12.5F, -38F);

		leftWingModel[85].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, -0.625F, -2.25F, 0F, -2.625F, -3.25F, 0F, -2.625F, -3.25F, 0F, -0.625F, -2.25F, 0F, -1F, -1F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, -1F, -1F); // Box 445
		leftWingModel[85].setRotationPoint(10F, -12.75F, -38F);

		leftWingModel[86].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, -3F, 0F, -1.375F, -4.25F, 0F, -1.375F, -4.25F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0.75F, -3F, 0F, 0.75F, -3F, 0F, 0F, -1F); // Box 446
		leftWingModel[86].setRotationPoint(3F, -13.5F, -40F);

		leftWingModel[87].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, -4F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, -3F, 0F, 0F, -1.25F); // Box 456
		leftWingModel[87].setRotationPoint(10F, -8.5F, -30.5F);

		leftWingModel[88].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 1.5F, 0F, -2F, -2F, 0F, -0.5F, 0.25F, 0F, 0F, -1.25F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 1.75F); // Box 457
		leftWingModel[88].setRotationPoint(10F, -11.5F, -32F);

		leftWingModel[89].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F); // Box 458
		leftWingModel[89].setRotationPoint(3F, -8.5F, -30.5F);

		leftWingModel[90].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 459
		leftWingModel[90].setRotationPoint(3F, -11.5F, -40.5F);

		leftWingModel[91].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F); // Box 460
		leftWingModel[91].setRotationPoint(3F, -11.5F, -31.5F);

		leftWingModel[92].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F); // Box 461
		leftWingModel[92].setRotationPoint(-37F, -3.5F, -41F);

		leftWingModel[93].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 468
		leftWingModel[93].setRotationPoint(-37F, -3.5F, -31F);

		leftWingModel[94].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, -1F, 0F, 0F, -1F); // Box 469
		leftWingModel[94].setRotationPoint(-37F, -3.5F, -31F);

		leftWingModel[95].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 470
		leftWingModel[95].setRotationPoint(3F, -3.5F, -41F);

		leftWingModel[96].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, -1F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 1F, -0.25F); // Box 471
		leftWingModel[96].setRotationPoint(3F, -3.5F, -41F);

		leftWingModel[97].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 1F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 1F, -1F); // Box 472
		leftWingModel[97].setRotationPoint(3F, -3.5F, -31F);

		leftWingModel[98].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.75F, 0F, 0F, 0F); // Box 473
		leftWingModel[98].setRotationPoint(3F, -3.5F, -31F);

		leftWingModel[99].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 0F, 1F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -2.25F, -2.75F, 0F, -2.25F, -2.75F, 0F, -1F, -1F); // Box 474
		leftWingModel[99].setRotationPoint(3F, 0.5F, -38F);

		leftWingModel[100].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, -0.5F, -1.5F, 0F, 0.75F, -2.25F, 0F, 0.75F, -2.25F, 0F, -0.5F, -1.5F, 0F, -1.25F, -2.75F, 0F, -2.5F, -3F, 0F, -2.5F, -3F, 0F, -1.25F, -2.75F); // Box 475
		leftWingModel[100].setRotationPoint(10F, -0.5F, -38F);

		leftWingModel[101].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F,0F, 0F, 1F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1F, 0F); // Box 476
		leftWingModel[101].setRotationPoint(3F, -0.5F, -39F);

		leftWingModel[102].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.75F, 0F, -0.5F, -1.5F, 0F, -1.75F, -2.25F, 0F, -1.75F, -2.25F, 0F, -0.5F, -1.5F); // Box 477
		leftWingModel[102].setRotationPoint(10F, -1.5F, -38F);

		leftWingModel[103].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.75F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, -0.5F, -4F, 0F, -0.5F, 1.5F, 0F, 0F, 0.5F); // Box 478
		leftWingModel[103].setRotationPoint(10F, -3.5F, -41F);

		leftWingModel[104].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -4F, 0F, 0F, -2.25F); // Box 479
		leftWingModel[104].setRotationPoint(10F, -3.5F, -31F);

		leftWingModel[105].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 480
		leftWingModel[105].setRotationPoint(2F, -7F, -35.5F);

		leftWingModel[106].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 482
		leftWingModel[106].setRotationPoint(2F, -7F, -33.5F);

		leftWingModel[107].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 483
		leftWingModel[107].setRotationPoint(2F, -7F, -36.5F);

		leftWingModel[108].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 484
		leftWingModel[108].setRotationPoint(9F, -7F, -35.5F);

		leftWingModel[109].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 485
		leftWingModel[109].setRotationPoint(9F, -7F, -36.5F);

		leftWingModel[110].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 486
		leftWingModel[110].setRotationPoint(9F, -7F, -33.5F);

		leftWingModel[111].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 487
		leftWingModel[111].setRotationPoint(14F, -5.5F, -35F);

		leftWingModel[112].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 521
		leftWingModel[112].setRotationPoint(-48F, -7F, -36.5F);

		leftWingModel[113].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 522
		leftWingModel[113].setRotationPoint(-48F, -7F, -35.5F);

		leftWingModel[114].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 523
		leftWingModel[114].setRotationPoint(-48F, -7F, -33.5F);

		leftWingModel[115].addShapeBox(0F, 0F, 0F, 21, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 524
		leftWingModel[115].setRotationPoint(-46F, -7F, -35.5F);

		leftWingModel[116].addShapeBox(0F, 0F, 0F, 21, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		leftWingModel[116].setRotationPoint(-46F, -7F, -36.5F);

		leftWingModel[117].addShapeBox(0F, 0F, 0F, 21, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 526
		leftWingModel[117].setRotationPoint(-46F, -7F, -33.5F);

		leftWingModel[118].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F); // Box 527
		leftWingModel[118].setRotationPoint(-48F, -7F, 35.5F);

		leftWingModel[119].addShapeBox(0F, 0F, 0F, 3, 4, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 528
		leftWingModel[119].setRotationPoint(-48F, -7F, 33.5F);

		leftWingModel[120].addShapeBox(0F, 0F, 0F, 2, 4, 1, 0F,0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 529
		leftWingModel[120].setRotationPoint(-48F, -7F, 32.5F);

		leftWingModel[121].addShapeBox(0F, 0F, 0F, 21, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 530
		leftWingModel[121].setRotationPoint(-46F, -7F, 33.5F);

		leftWingModel[122].addShapeBox(0F, 0F, 0F, 22, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 531
		leftWingModel[122].setRotationPoint(-46F, -7F, 35.5F);

		leftWingModel[123].addShapeBox(0F, 0F, 0F, 21, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 532
		leftWingModel[123].setRotationPoint(-46F, -7F, 32.5F);

		leftWingModel[124].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0F); // Box 533
		leftWingModel[124].setRotationPoint(-49F, -5.5F, -35F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 295
		rightWingModel[1] = new ModelRendererTurbo(this, 489, 177, textureX, textureY); // Box 296
		rightWingModel[2] = new ModelRendererTurbo(this, 49, 185, textureX, textureY); // Box 297
		rightWingModel[3] = new ModelRendererTurbo(this, 73, 185, textureX, textureY); // Box 298
		rightWingModel[4] = new ModelRendererTurbo(this, 121, 185, textureX, textureY); // Box 299
		rightWingModel[5] = new ModelRendererTurbo(this, 145, 185, textureX, textureY); // Box 300
		rightWingModel[6] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Box 301
		rightWingModel[7] = new ModelRendererTurbo(this, 225, 185, textureX, textureY); // Box 302
		rightWingModel[8] = new ModelRendererTurbo(this, 265, 185, textureX, textureY); // Box 303
		rightWingModel[9] = new ModelRendererTurbo(this, 433, 129, textureX, textureY); // Box 304
		rightWingModel[10] = new ModelRendererTurbo(this, 369, 137, textureX, textureY); // Box 305
		rightWingModel[11] = new ModelRendererTurbo(this, 433, 137, textureX, textureY); // Box 306
		rightWingModel[12] = new ModelRendererTurbo(this, 305, 185, textureX, textureY); // Box 307
		rightWingModel[13] = new ModelRendererTurbo(this, 361, 217, textureX, textureY); // Box 331
		rightWingModel[14] = new ModelRendererTurbo(this, 113, 217, textureX, textureY); // Box 332
		rightWingModel[15] = new ModelRendererTurbo(this, 193, 217, textureX, textureY); // Box 333
		rightWingModel[16] = new ModelRendererTurbo(this, 297, 217, textureX, textureY); // Box 334
		rightWingModel[17] = new ModelRendererTurbo(this, 433, 217, textureX, textureY); // Box 335
		rightWingModel[18] = new ModelRendererTurbo(this, 361, 241, textureX, textureY); // Box 336
		rightWingModel[19] = new ModelRendererTurbo(this, 473, 217, textureX, textureY); // Box 337
		rightWingModel[20] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 338
		rightWingModel[21] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 339
		rightWingModel[22] = new ModelRendererTurbo(this, 129, 241, textureX, textureY); // Box 340
		rightWingModel[23] = new ModelRendererTurbo(this, 193, 265, textureX, textureY); // Box 341
		rightWingModel[24] = new ModelRendererTurbo(this, 377, 241, textureX, textureY); // Box 342
		rightWingModel[25] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 343
		rightWingModel[26] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 344
		rightWingModel[27] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 345
		rightWingModel[28] = new ModelRendererTurbo(this, 465, 177, textureX, textureY); // Box 346
		rightWingModel[29] = new ModelRendererTurbo(this, 89, 257, textureX, textureY); // Box 347
		rightWingModel[30] = new ModelRendererTurbo(this, 217, 185, textureX, textureY); // Box 348
		rightWingModel[31] = new ModelRendererTurbo(this, 257, 185, textureX, textureY); // Box 349
		rightWingModel[32] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 350
		rightWingModel[33] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 351
		rightWingModel[34] = new ModelRendererTurbo(this, 297, 185, textureX, textureY); // Box 352
		rightWingModel[35] = new ModelRendererTurbo(this, 201, 329, textureX, textureY); // Box 396
		rightWingModel[36] = new ModelRendererTurbo(this, 1, 337, textureX, textureY); // Box 397
		rightWingModel[37] = new ModelRendererTurbo(this, 273, 337, textureX, textureY); // Box 398
		rightWingModel[38] = new ModelRendererTurbo(this, 361, 337, textureX, textureY); // Box 399
		rightWingModel[39] = new ModelRendererTurbo(this, 73, 345, textureX, textureY); // Box 400
		rightWingModel[40] = new ModelRendererTurbo(this, 433, 337, textureX, textureY); // Box 401
		rightWingModel[41] = new ModelRendererTurbo(this, 145, 345, textureX, textureY); // Box 402
		rightWingModel[42] = new ModelRendererTurbo(this, 1, 353, textureX, textureY); // Box 403
		rightWingModel[43] = new ModelRendererTurbo(this, 353, 353, textureX, textureY); // Box 404
		rightWingModel[44] = new ModelRendererTurbo(this, 145, 225, textureX, textureY); // Box 405
		rightWingModel[45] = new ModelRendererTurbo(this, 449, 281, textureX, textureY); // Box 406
		rightWingModel[46] = new ModelRendererTurbo(this, 417, 225, textureX, textureY); // Box 407
		rightWingModel[47] = new ModelRendererTurbo(this, 281, 289, textureX, textureY); // Box 408
		rightWingModel[48] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 409
		rightWingModel[49] = new ModelRendererTurbo(this, 281, 297, textureX, textureY); // Box 410
		rightWingModel[50] = new ModelRendererTurbo(this, 345, 289, textureX, textureY); // Box 411
		rightWingModel[51] = new ModelRendererTurbo(this, 1, 313, textureX, textureY); // Box 412
		rightWingModel[52] = new ModelRendererTurbo(this, 145, 313, textureX, textureY); // Box 413
		rightWingModel[53] = new ModelRendererTurbo(this, 1, 225, textureX, textureY); // Box 416
		rightWingModel[54] = new ModelRendererTurbo(this, 33, 225, textureX, textureY); // Box 417
		rightWingModel[55] = new ModelRendererTurbo(this, 241, 225, textureX, textureY); // Box 418
		rightWingModel[56] = new ModelRendererTurbo(this, 321, 225, textureX, textureY); // Box 419
		rightWingModel[57] = new ModelRendererTurbo(this, 73, 241, textureX, textureY); // Box 420
		rightWingModel[58] = new ModelRendererTurbo(this, 113, 241, textureX, textureY); // Box 421
		rightWingModel[59] = new ModelRendererTurbo(this, 409, 241, textureX, textureY); // Box 422
		rightWingModel[60] = new ModelRendererTurbo(this, 449, 241, textureX, textureY); // Box 423
		rightWingModel[61] = new ModelRendererTurbo(this, 449, 249, textureX, textureY); // Box 424
		rightWingModel[62] = new ModelRendererTurbo(this, 193, 257, textureX, textureY); // Box 425
		rightWingModel[63] = new ModelRendererTurbo(this, 409, 265, textureX, textureY); // Box 426
		rightWingModel[64] = new ModelRendererTurbo(this, 465, 321, textureX, textureY); // Box 427
		rightWingModel[65] = new ModelRendererTurbo(this, 137, 297, textureX, textureY); // Box 428
		rightWingModel[66] = new ModelRendererTurbo(this, 345, 337, textureX, textureY); // Box 429
		rightWingModel[67] = new ModelRendererTurbo(this, 225, 345, textureX, textureY); // Box 430
		rightWingModel[68] = new ModelRendererTurbo(this, 249, 353, textureX, textureY); // Box 431
		rightWingModel[69] = new ModelRendererTurbo(this, 433, 353, textureX, textureY); // Box 432
		rightWingModel[70] = new ModelRendererTurbo(this, 465, 353, textureX, textureY); // Box 433
		rightWingModel[71] = new ModelRendererTurbo(this, 73, 361, textureX, textureY); // Box 434
		rightWingModel[72] = new ModelRendererTurbo(this, 105, 361, textureX, textureY); // Box 435
		rightWingModel[73] = new ModelRendererTurbo(this, 137, 361, textureX, textureY); // Box 436
		rightWingModel[74] = new ModelRendererTurbo(this, 489, 265, textureX, textureY); // Box 438
		rightWingModel[75] = new ModelRendererTurbo(this, 73, 337, textureX, textureY); // Box 462
		rightWingModel[76] = new ModelRendererTurbo(this, 105, 337, textureX, textureY); // Box 463
		rightWingModel[77] = new ModelRendererTurbo(this, 249, 345, textureX, textureY); // Box 464
		rightWingModel[78] = new ModelRendererTurbo(this, 297, 361, textureX, textureY); // Box 465
		rightWingModel[79] = new ModelRendererTurbo(this, 489, 321, textureX, textureY); // Box 488
		rightWingModel[80] = new ModelRendererTurbo(this, 457, 321, textureX, textureY); // Box 489
		rightWingModel[81] = new ModelRendererTurbo(this, 217, 345, textureX, textureY); // Box 490
		rightWingModel[82] = new ModelRendererTurbo(this, 113, 225, textureX, textureY); // Box 491
		rightWingModel[83] = new ModelRendererTurbo(this, 193, 225, textureX, textureY); // Box 492
		rightWingModel[84] = new ModelRendererTurbo(this, 217, 225, textureX, textureY); // Box 493
		rightWingModel[85] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 494
		rightWingModel[86] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 495
		rightWingModel[87] = new ModelRendererTurbo(this, 489, 353, textureX, textureY); // Box 496
		rightWingModel[88] = new ModelRendererTurbo(this, 193, 361, textureX, textureY); // Box 497
		rightWingModel[89] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 498
		rightWingModel[90] = new ModelRendererTurbo(this, 353, 369, textureX, textureY); // Box 499
		rightWingModel[91] = new ModelRendererTurbo(this, 281, 265, textureX, textureY); // Box 500
		rightWingModel[92] = new ModelRendererTurbo(this, 393, 201, textureX, textureY); // Box 501
		rightWingModel[93] = new ModelRendererTurbo(this, 369, 369, textureX, textureY); // Box 502
		rightWingModel[94] = new ModelRendererTurbo(this, 57, 369, textureX, textureY); // Box 503
		rightWingModel[95] = new ModelRendererTurbo(this, 249, 369, textureX, textureY); // Box 504
		rightWingModel[96] = new ModelRendererTurbo(this, 409, 369, textureX, textureY); // Box 505
		rightWingModel[97] = new ModelRendererTurbo(this, 497, 289, textureX, textureY); // Box 506
		rightWingModel[98] = new ModelRendererTurbo(this, 169, 209, textureX, textureY); // Box 507
		rightWingModel[99] = new ModelRendererTurbo(this, 393, 369, textureX, textureY); // Box 508
		rightWingModel[100] = new ModelRendererTurbo(this, 441, 369, textureX, textureY); // Box 509
		rightWingModel[101] = new ModelRendererTurbo(this, 465, 369, textureX, textureY); // Box 510
		rightWingModel[102] = new ModelRendererTurbo(this, 209, 209, textureX, textureY); // Box 511
		rightWingModel[103] = new ModelRendererTurbo(this, 1, 377, textureX, textureY); // Box 512
		rightWingModel[104] = new ModelRendererTurbo(this, 25, 377, textureX, textureY); // Box 513
		rightWingModel[105] = new ModelRendererTurbo(this, 153, 249, textureX, textureY); // Box 514
		rightWingModel[106] = new ModelRendererTurbo(this, 73, 377, textureX, textureY); // Box 515
		rightWingModel[107] = new ModelRendererTurbo(this, 41, 377, textureX, textureY); // Box 516
		rightWingModel[108] = new ModelRendererTurbo(this, 105, 377, textureX, textureY); // Box 517
		rightWingModel[109] = new ModelRendererTurbo(this, 145, 377, textureX, textureY); // Box 518
		rightWingModel[110] = new ModelRendererTurbo(this, 497, 297, textureX, textureY); // Box 519
		rightWingModel[111] = new ModelRendererTurbo(this, 497, 305, textureX, textureY); // Box 520
		rightWingModel[112] = new ModelRendererTurbo(this, 313, 145, textureX, textureY); // Box 534

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, -2F, 0F, 1F, -2F, 0F, 1F, 2F, 0F, 0F, 2F, 0F, -0.5F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1.5F, 2F, 0F, -0.5F, 2F); // Box 295
		rightWingModel[0].setRotationPoint(-23F, -12.5F, 10.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -1.25F, 0F, 0F, -2F, 0F, -1.5F, 2F, 0F, -2.5F, 1.75F, 0F, 1F, -1.5F, 0F, 0.5F, -2F, 0F, 0.5F, 2F, 0F, 1F, 1.75F); // Box 296
		rightWingModel[1].setRotationPoint(-31F, -15F, 10.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 8, 2, 1, 0F,0F, -0.5F, -1.5F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, -0.5F, 1.75F, 0F, 0.25F, -0.5F, 0F, -0.5F, -1.5F, 0F, -0.5F, 2F, 0F, 0F, 1.75F); // Box 297
		rightWingModel[2].setRotationPoint(-31F, -12.5F, 10.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 20, 2, 1, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, -0.75F, 2F, 0F, -1.5F, 2F, 0F, 0.5F, -2F, 0F, -0.5F, -2F, 0F, -0.5F, 2F, 0F, 0.5F, 2F); // Box 298
		rightWingModel[3].setRotationPoint(-23F, -15F, 10.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 10, 1, 1, 0F,0F, 0F, -2F, 0F, -0.5F, -1.25F, 0F, -1.75F, 1.75F, 0F, -0.75F, 2F, 0F, 0.5F, -2F, 0F, 1F, -1.5F, 0F, 1F, 1.75F, 0F, 0.5F, 2F); // Box 299
		rightWingModel[4].setRotationPoint(-3F, -15F, 10.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 10, 2, 1, 0F,0F, 0F, -2F, 0F, -0.5F, -1.5F, 0F, -0.5F, 1.75F, 0F, 0F, 2F, 0F, -0.5F, -1.5F, 0F, 0F, -0.75F, 0F, 0F, 1.75F, 0F, -0.5F, 2F); // Box 300
		rightWingModel[5].setRotationPoint(-3F, -13.5F, 10.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 20, 1, 9, 0F,0F, -1.75F, -0.5F, 0F, -0.75F, -0.5F, 0F, 0.5F, 1F, 0F, -0.5F, 1F, 0F, 1.75F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.5F, 1F, 0F, 0.5F, 1F); // Box 301
		rightWingModel[6].setRotationPoint(-23F, -10.5F, 3.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 8, 1, 9, 0F,0F, -1.25F, -0.5F, 0F, -1.75F, -0.5F, 0F, -0.5F, 1F, 0F, 0F, 0.75F, 0F, 1.25F, -0.5F, 0F, 1.75F, -0.5F, 0F, 0.5F, 1F, 0F, 0F, 0.75F); // Box 302
		rightWingModel[7].setRotationPoint(-31F, -10.5F, 3.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 10, 1, 9, 0F,0F, -1.75F, -0.5F, 0F, -1.25F, -0.5F, 0F, 0.75F, 0.75F, 0F, -0.5F, 1F, 0F, 1.75F, -0.5F, 0F, 1.25F, -0.5F, 0F, -0.75F, 0.75F, 0F, 0.5F, 1F); // Box 303
		rightWingModel[8].setRotationPoint(-3F, -11.5F, 3.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 0.3F, -1.75F, 0F, -1F, -1.25F, -2F, -1.25F, 1.75F, 0F, -0.75F, 2F, 0F, 0.5F, -2F, 0F, 1F, -0.75F, -2F, 1F, 1.75F, 0F, 0.5F, 2F); // Box 304
		rightWingModel[9].setRotationPoint(7F, -14F, 10.25F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,0F, 1F, -2F, 0F, 1F, -1F, -2F, 1F, 1.75F, 0F, 1F, 2F, 0F, 0.1F, 1F, 0F, -1F, -0.5F, -2F, -1.25F, 1.75F, 0F, -0.75F, 2F); // Box 305
		rightWingModel[10].setRotationPoint(7F, -11.5F, 10.25F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -0.5F, 0F, 0F, 1F, -0.5F, 0F, -1F, 0F, 0F, -2.25F, 0F, 1.75F, 0F, 0.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		rightWingModel[11].setRotationPoint(-33F, -13.5F, 11.25F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 2, 1, 9, 0F,5.75F, 0F, -0.5F, 0F, -1.75F, -0.5F, 0F, 0F, 0.75F, 0F, 0F, 0.75F, 3F, 1F, -0.5F, 0F, 1.25F, -0.5F, 0F, 0F, 0.75F, 0F, -1F, 0.75F); // Box 307
		rightWingModel[12].setRotationPoint(-33F, -10.5F, 3.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 20, 5, 15, 0F,0F, 0F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, -3F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -3.25F, 0F, -3F, -2.25F, 0F); // Box 331
		rightWingModel[13].setRotationPoint(-23F, -13.5F, 13.5F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 8, 5, 15, 0F,0F, -1F, 0.25F, 0F, 0F, 0F, 3F, 0.5F, 0F, -5F, 0F, 0F, 0F, -1F, 0.25F, 0F, -0.5F, 0F, 3F, -2.25F, 0F, -5F, -2.25F, 0F); // Box 332
		rightWingModel[14].setRotationPoint(-31F, -13.5F, 13.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 3, 3, 15, 0F,0F, -0.25F, 0F, 0F, -0.6F, 0.1F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 1.2F, 0.1F, 0F, -0.75F, 0F, 0F, -0.25F, 0F); // Box 333
		rightWingModel[15].setRotationPoint(-3F, -14.5F, 13.5F);

		rightWingModel[16].addShapeBox(0F, 0F, 0F, 4, 2, 15, 0F,0F, -0.35F, 0.1F, 4F, -1.85F, 0.3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 4F, -0.15F, 0.3F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 334
		rightWingModel[16].setRotationPoint(0F, -14.25F, 13.5F);

		rightWingModel[17].addShapeBox(0F, 0F, 0F, 4, 5, 15, 0F,0F, -2.25F, 0.25F, -2F, -1F, 0.25F, 3F, 0F, 0F, -5.25F, -1.25F, 0F, 0F, -2F, 0.25F, -2F, -1F, 0.25F, 3F, -2.25F, 0F, -5.25F, -3F, 0F); // Box 335
		rightWingModel[17].setRotationPoint(-33F, -13.5F, 13.5F);

		rightWingModel[18].addShapeBox(0F, 0F, 0F, 17, 4, 13, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 1.5F, 0F, -3F, 1.25F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0F, -2.75F, 0F, -3F, -1.75F, 0F); // Box 336
		rightWingModel[18].setRotationPoint(-20F, -14F, 28.5F);

		rightWingModel[19].addShapeBox(0F, 0F, 0F, 6, 5, 13, 0F,0F, -1F, 0F, 0F, -0.5F, 0F, 3F, 0.75F, 0F, -5F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -1.25F, 0F, 3F, -2.25F, 0F, -5F, -2.25F, 0F); // Box 337
		rightWingModel[19].setRotationPoint(-26F, -14.5F, 28.5F);

		rightWingModel[20].addShapeBox(0F, 0F, 0F, 4, 5, 13, 0F,-0.25F, -2.25F, 0F, -2F, -1F, 0F, 3F, 0.25F, 0F, -5.25F, -1F, 0F, -0.25F, -2F, 0F, -2F, -1.25F, 0F, 3F, -2.25F, 0F, -5.25F, -3F, 0F); // Box 338
		rightWingModel[20].setRotationPoint(-28F, -14.5F, 28.5F);

		rightWingModel[21].addShapeBox(0F, 0F, 0F, 3, 2, 13, 0F,0F, -0.25F, 0F, 0F, -0.5F, 0F, -0.75F, 0.5F, 0F, 0F, 0.75F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, -0.75F, -0.25F, 0F, 0F, 0F, 0F); // Box 339
		rightWingModel[21].setRotationPoint(-3F, -14.75F, 28.5F);

		rightWingModel[22].addShapeBox(0F, 0F, 0F, 4, 2, 13, 0F,0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0.75F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -1.75F, 0F, 0.75F, -0.5F, 0F); // Box 340
		rightWingModel[22].setRotationPoint(0F, -14.5F, 28.5F);

		rightWingModel[23].addShapeBox(0F, 0F, 0F, 17, 4, 52, 0F,-3F, 1.25F, 0F, 0F, 1.5F, 0F, 8F, 5.5F, 0F, -19F, 5.25F, 0F, -3F, -1.75F, 0F, 0F, -2.75F, 0F, 8F, -8.15F, 0F, -19F, -7.5F, 0F); // Box 341
		rightWingModel[23].setRotationPoint(-20F, -14F, 41.5F);

		rightWingModel[24].addShapeBox(0F, 0F, 0F, 6, 5, 52, 0F,-5F, 0.25F, 0F, 3F, 0.75F, 0F, 19F, 4.75F, 0F, -22F, 4.5F, 0F, -5F, -2.25F, 0F, 3F, -2.25F, 0F, 19F, -8F, 0F, -22F, -8F, 0F); // Box 342
		rightWingModel[24].setRotationPoint(-26F, -14.5F, 41.5F);

		rightWingModel[25].addShapeBox(0F, 0F, 0F, 4, 5, 52, 0F,-5.25F, -1F, 0F, 3F, 0.25F, 0F, 20F, 4.5F, 0F, -22F, 3.75F, 0F, -5.25F, -3F, 0F, 3F, -2.25F, 0F, 20F, -8F, 0F, -22F, -8.25F, 0F); // Box 343
		rightWingModel[25].setRotationPoint(-28F, -14.5F, 41.5F);

		rightWingModel[26].addShapeBox(0F, 0F, 0F, 3, 2, 52, 0F,0F, 0.75F, 0F, -0.75F, 0.5F, 0F, 7F, 4.5F, 0F, -8F, 4.75F, 0F, 0F, 0F, 0F, -0.75F, -0.25F, 0F, 7F, -5.75F, 0F, -8F, -5.4F, 0F); // Box 344
		rightWingModel[26].setRotationPoint(-3F, -14.75F, 41.5F);

		rightWingModel[27].addShapeBox(0F, 0F, 0F, 4, 2, 20, 0F,0.75F, 0.75F, 0F, 0F, -0.25F, 0F, 2.25F, 1.25F, 0F, -2.05F, 2.2F, -1.25F, 0.75F, -0.5F, 0F, 0F, -1.75F, 0F, 2.25F, -3.25F, 0F, -2.05F, -2.5F, -1.25F); // Box 345
		rightWingModel[27].setRotationPoint(0F, -14.5F, 41.5F);

		rightWingModel[28].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,-0.1F, 0.25F, -0.05F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -2F, -0.55F, 0.5F, -0.65F, -0.05F, 0.5F, 0F, 0.25F, -0.5F, -1F, 0.25F, -0.5F, -2F, -0.55F, 0.15F, -0.65F); // Box 346
		rightWingModel[28].setRotationPoint(2F, -16.5F, 60.5F);

		rightWingModel[29].addShapeBox(0F, 0F, 0F, 4, 2, 30, 0F,-3.6F, 2.2F, -0.35F, 3.5F, 1.5F, 0.9F, 7F, 4.25F, 0F, -8F, 4.5F, 0F, -3.55F, -2.6F, -0.35F, 3.5F, -3.5F, 0.9F, 7F, -6.25F, 0F, -8F, -5.75F, 0F); // Box 347
		rightWingModel[29].setRotationPoint(-1F, -14.75F, 63.5F);

		rightWingModel[30].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,0F, -0.75F, 0F, 0F, 0F, 0F, 3F, 0.25F, 0F, -2.75F, 0F, -1F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 3F, -0.75F, 0F, -2.75F, -0.5F, -1F); // Box 348
		rightWingModel[30].setRotationPoint(-6F, -19F, 93.5F);

		rightWingModel[31].addShapeBox(0F, 0F, 0F, 2, 1, 6, 0F,2F, 0F, 0F, -1F, 0.25F, 0F, 1.25F, 0.5F, 0F, -1F, 0.25F, 0F, 2F, 0.5F, 0F, -1F, 0.5F, 0F, 1.25F, -0.75F, 0F, -1F, -0.75F, 0F); // Box 349
		rightWingModel[31].setRotationPoint(-2F, -19F, 93.5F);

		rightWingModel[32].addShapeBox(0F, 0F, 0F, 5, 1, 6, 0F,2F, 0.25F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, -1.25F, -0.25F, 0.5F, 0F, 2F, 0.5F, 0F, -1F, -0.15F, 0F, 0F, -1F, -1.25F, -0.25F, -0.75F, 0F); // Box 350
		rightWingModel[32].setRotationPoint(1F, -19F, 93.5F);

		rightWingModel[33].addShapeBox(0F, 0F, 0F, 2, 1, 5, 0F,1F, 0.5F, -0.25F, -1F, 0.25F, -0.25F, 0F, 0.25F, -0.75F, 0F, 0.5F, 0F, 1F, -0.15F, -0.25F, -1F, -0.5F, -0.25F, 0F, -1.25F, -0.75F, 0F, -1F, 0F); // Box 351
		rightWingModel[33].setRotationPoint(6F, -19F, 93.25F);

		rightWingModel[34].addShapeBox(0F, 0F, 0F, 2, 1, 4, 0F,1F, 0.25F, -0.25F, 0F, 0F, -0.25F, -0.25F, 0.25F, -1.25F, 0F, 0.25F, 0.25F, 1F, -0.5F, -0.25F, 0F, -1F, -0.25F, -0.25F, -1.25F, -1.25F, 0F, -1.25F, 0.25F); // Box 352
		rightWingModel[34].setRotationPoint(8F, -19F, 93.25F);

		rightWingModel[35].addShapeBox(0F, 0F, 0F, 28, 3, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 396
		rightWingModel[35].setRotationPoint(-25F, -11.5F, 29F);

		rightWingModel[36].addShapeBox(0F, 0F, 0F, 28, 2, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 397
		rightWingModel[36].setRotationPoint(-25F, -8.5F, 28F);

		rightWingModel[37].addShapeBox(0F, 0F, 0F, 28, 3, 13, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 398
		rightWingModel[37].setRotationPoint(-25F, -6.5F, 28F);

		rightWingModel[38].addShapeBox(0F, 0F, 0F, 28, 1, 13, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 399
		rightWingModel[38].setRotationPoint(-25F, -3.5F, 28F);

		rightWingModel[39].addShapeBox(0F, 0F, 0F, 28, 2, 11, 0F,0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 400
		rightWingModel[39].setRotationPoint(-25F, -2.5F, 29F);

		rightWingModel[40].addShapeBox(0F, 0F, 0F, 28, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 401
		rightWingModel[40].setRotationPoint(-25F, -0.5F, 29F);

		rightWingModel[41].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 402
		rightWingModel[41].setRotationPoint(-25F, 0.5F, 30F);

		rightWingModel[42].addShapeBox(0F, 0F, 0F, 28, 1, 11, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		rightWingModel[42].setRotationPoint(-25F, -12.5F, 29F);

		rightWingModel[43].addShapeBox(0F, 0F, 0F, 28, 1, 9, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		rightWingModel[43].setRotationPoint(-25F, -13.5F, 30F);

		rightWingModel[44].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 405
		rightWingModel[44].setRotationPoint(-37F, -6.5F, 38F);

		rightWingModel[45].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, -1F, -3F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -1F, -3F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F); // Box 406
		rightWingModel[45].setRotationPoint(-37F, -13.5F, 30F);

		rightWingModel[46].addShapeBox(0F, 0F, 0F, 12, 3, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 407
		rightWingModel[46].setRotationPoint(-37F, -6.5F, 28F);

		rightWingModel[47].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 408
		rightWingModel[47].setRotationPoint(-37F, -8.5F, 28F);

		rightWingModel[48].addShapeBox(0F, 0F, 0F, 12, 3, 11, 0F,0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 409
		rightWingModel[48].setRotationPoint(-37F, -11.5F, 29F);

		rightWingModel[49].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, -1F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 0F); // Box 410
		rightWingModel[49].setRotationPoint(-37F, -11.5F, 30F);

		rightWingModel[50].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F); // Box 411
		rightWingModel[50].setRotationPoint(-37F, -8.5F, 38F);

		rightWingModel[51].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 1F, -0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, -0.5F); // Box 412
		rightWingModel[51].setRotationPoint(-37F, -1.5F, 30F);

		rightWingModel[52].addShapeBox(0F, 0F, 0F, 12, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2.5F); // Box 413
		rightWingModel[52].setRotationPoint(-37F, 0.5F, 30F);

		rightWingModel[53].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 416
		rightWingModel[53].setRotationPoint(-43F, -6.5F, 28F);

		rightWingModel[54].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, -2.5F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, -2.5F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F); // Box 417
		rightWingModel[54].setRotationPoint(-48F, -6.5F, 28F);

		rightWingModel[55].addShapeBox(0F, 0F, 0F, 5, 3, 3, 0F,0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, -0.5F, -2.5F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, -0.5F, -2.5F); // Box 418
		rightWingModel[55].setRotationPoint(-48F, -6.5F, 38F);

		rightWingModel[56].addShapeBox(0F, 0F, 0F, 6, 3, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F); // Box 419
		rightWingModel[56].setRotationPoint(-43F, -6.5F, 38F);

		rightWingModel[57].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -0.5F, -4F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, -0.5F, 2.25F, 0F, 0.5F, -2.5F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.5F); // Box 420
		rightWingModel[57].setRotationPoint(-48F, -8.5F, 28F);

		rightWingModel[58].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0.5F, -2.5F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0.5F, 0.5F, 0F, -0.5F, -4F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, -0.5F, 2F); // Box 421
		rightWingModel[58].setRotationPoint(-48F, -3.5F, 28F);

		rightWingModel[59].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 422
		rightWingModel[59].setRotationPoint(-43F, -3.5F, 28F);

		rightWingModel[60].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0.5F, -2.5F, 0F, -0.5F, 2F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, -0.5F, -4F); // Box 423
		rightWingModel[60].setRotationPoint(-48F, -3.5F, 38F);

		rightWingModel[61].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -2F); // Box 424
		rightWingModel[61].setRotationPoint(-43F, -3.5F, 38F);

		rightWingModel[62].addShapeBox(0F, 0F, 0F, 5, 2, 3, 0F,0F, -0.5F, 2.25F, 0F, 0F, 0.25F, 0F, 0F, -2F, 0F, -0.5F, -4F, 0F, 0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0.5F, -2.5F); // Box 425
		rightWingModel[62].setRotationPoint(-48F, -8.5F, 38F);

		rightWingModel[63].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F); // Box 426
		rightWingModel[63].setRotationPoint(-43F, -8.5F, 38F);

		rightWingModel[64].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, -1.5F, -1F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 427
		rightWingModel[64].setRotationPoint(-43F, -11.5F, 30F);

		rightWingModel[65].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, -1.75F, -1.25F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.75F, -1.25F, 0F, 0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, 0F); // Box 428
		rightWingModel[65].setRotationPoint(-43F, -12.5F, 31F);

		rightWingModel[66].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -1.75F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, -2.25F, 0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F); // Box 429
		rightWingModel[66].setRotationPoint(-48F, -10.5F, 31F);

		rightWingModel[67].addShapeBox(0F, 0F, 0F, 6, 1, 9, 0F,0F, -1.375F, -3.75F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -1.375F, -3.75F, 0F, 0.75F, -2.25F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0.75F, -2.25F); // Box 430
		rightWingModel[67].setRotationPoint(-43F, -12.5F, 30F);

		rightWingModel[68].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -2.5F, -2.75F, 0F, -0.75F, -1.25F, 0F, -0.75F, -1.25F, 0F, -2.5F, -2.75F, 0F, 0.75F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, -2.25F); // Box 431
		rightWingModel[68].setRotationPoint(-48F, -11.5F, 31F);

		rightWingModel[69].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, -2.625F, -3.25F, 0F, -0.625F, -2.75F, 0F, -0.625F, -2.75F, 0F, -2.625F, -3.25F, 0F, 0.75F, -2.75F, 0F, -1F, -1.25F, 0F, -1F, -1.25F, 0F, 0.75F, -2.75F); // Box 432
		rightWingModel[69].setRotationPoint(-48F, -11.75F, 31F);

		rightWingModel[70].addShapeBox(0F, 0F, 0F, 6, 2, 7, 0F,0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, -1.75F, -2.25F, 0F, -1F, -1.5F, 0F, -1F, -1.5F, 0F, -1.75F, -2.25F); // Box 433
		rightWingModel[70].setRotationPoint(-43F, 0.5F, 31F);

		rightWingModel[71].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0.75F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.75F, -2.25F, 0F, -2.5F, -3F, 0F, -0.75F, -2.25F, 0F, -0.75F, -2.25F, 0F, -2.5F, -3F); // Box 434
		rightWingModel[71].setRotationPoint(-48F, -0.5F, 31F);

		rightWingModel[72].addShapeBox(0F, 0F, 0F, 5, 2, 7, 0F,0F, 0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0.5F, -1F, 0F, -1.75F, -2.25F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.75F, -2.25F); // Box 435
		rightWingModel[72].setRotationPoint(-48F, -1.5F, 31F);

		rightWingModel[73].addShapeBox(0F, 0F, 0F, 6, 3, 9, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -1.5F, -1F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1.5F, -1F); // Box 436
		rightWingModel[73].setRotationPoint(-43F, -1.5F, 30F);

		rightWingModel[74].addShapeBox(0F, 0F, 0F, 6, 2, 3, 0F,0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 438
		rightWingModel[74].setRotationPoint(-43F, -8.5F, 28F);

		rightWingModel[75].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, -0.25F, 0F, -1F, 0F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 1F, 0.25F, 0F, 0F, 0.25F); // Box 462
		rightWingModel[75].setRotationPoint(-37F, -3.5F, 28F);

		rightWingModel[76].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, -1F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, -1F, 0.25F); // Box 463
		rightWingModel[76].setRotationPoint(-37F, -3.5F, 28F);

		rightWingModel[77].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, -1F, -0.25F); // Box 464
		rightWingModel[77].setRotationPoint(-37F, -3.5F, 38F);

		rightWingModel[78].addShapeBox(0F, 0F, 0F, 12, 2, 3, 0F,0F, 0F, 0.25F, 0F, -1F, 0.25F, 0F, -1F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 1F, 0.25F, 0F, 1F, -1F, 0F, 0F, -1F); // Box 465
		rightWingModel[78].setRotationPoint(-37F, -3.5F, 38F);

		rightWingModel[79].addShapeBox(0F, 0F, 0F, 7, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 488
		rightWingModel[79].setRotationPoint(2F, -7F, 33.5F);

		rightWingModel[80].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 489
		rightWingModel[80].setRotationPoint(2F, -7F, 32.5F);

		rightWingModel[81].addShapeBox(0F, 0F, 0F, 7, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 490
		rightWingModel[81].setRotationPoint(2F, -7F, 35.5F);

		rightWingModel[82].addShapeBox(0F, 0F, 0F, 5, 4, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 491
		rightWingModel[82].setRotationPoint(9F, -7F, 33.5F);

		rightWingModel[83].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F); // Box 492
		rightWingModel[83].setRotationPoint(9F, -7F, 35.5F);

		rightWingModel[84].addShapeBox(0F, 0F, 0F, 5, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 493
		rightWingModel[84].setRotationPoint(9F, -7F, 32.5F);

		rightWingModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.5F); // Box 494
		rightWingModel[85].setRotationPoint(14F, -5.5F, 34F);

		rightWingModel[86].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, -3F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, -0.5F, 0.5F, 0F, -0.5F, -3F, 0F, 0F, -1.25F); // Box 495
		rightWingModel[86].setRotationPoint(10F, -6.5F, 38.5F);

		rightWingModel[87].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F); // Box 496
		rightWingModel[87].setRotationPoint(3F, -6.5F, 38.5F);

		rightWingModel[88].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 497
		rightWingModel[88].setRotationPoint(3F, -6.5F, 27.5F);

		rightWingModel[89].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, -1.25F, 0F, -0.5F, -3F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, -0.5F, -3F, 0F, -0.5F, 0.5F, 0F, 0F, 0.25F); // Box 498
		rightWingModel[89].setRotationPoint(10F, -6.5F, 27.5F);

		rightWingModel[90].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.75F, 0F, 0F, -0.5F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0F, -0.25F); // Box 499
		rightWingModel[90].setRotationPoint(3F, -8.5F, 38.5F);

		rightWingModel[91].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, 0.25F, 0F, -0.5F, 1.5F, 0F, -0.5F, -4F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F, 0.5F, 0.5F, 0F, 0.5F, -3F, 0F, 0F, -1.25F); // Box 500
		rightWingModel[91].setRotationPoint(10F, -8.5F, 38.5F);

		rightWingModel[92].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, 0F, 0F, 0F, -2F, 1.5F, 0F, -2F, -2F, 0F, -0.5F, 0.25F, 0F, 0F, -1.25F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 1.75F); // Box 501
		rightWingModel[92].setRotationPoint(10F, -11.5F, 37F);

		rightWingModel[93].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F,0F, -1F, 0F, 0F, -1.75F, -2F, 0F, -1.75F, -2F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0.5F, -0.75F, 0F, 0.5F, -0.75F, 0F, 0F, 1F); // Box 502
		rightWingModel[93].setRotationPoint(3F, -13.5F, 30F);

		rightWingModel[94].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, -0.75F, -1F, 0F, -2.5F, -2.75F, 0F, -2.5F, -2.75F, 0F, -0.75F, -1F, 0F, -0.5F, 0.25F, 0F, 1F, -2F, 0F, 1F, -2F, 0F, -0.5F, 0.25F); // Box 503
		rightWingModel[94].setRotationPoint(10F, -12.5F, 31F);

		rightWingModel[95].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, -0.625F, -2.25F, 0F, -2.625F, -3.25F, 0F, -2.625F, -3.25F, 0F, -0.625F, -2.25F, 0F, -1F, -1F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, -1F, -1F); // Box 504
		rightWingModel[95].setRotationPoint(10F, -12.75F, 31F);

		rightWingModel[96].addShapeBox(0F, 0F, 0F, 7, 1, 11, 0F,0F, 0F, -3F, 0F, -1.375F, -4.25F, 0F, -1.375F, -4.25F, 0F, 0F, -3F, 0F, 0F, -1F, 0F, 0.75F, -3F, 0F, 0.75F, -3F, 0F, 0F, -1F); // Box 505
		rightWingModel[96].setRotationPoint(3F, -13.5F, 29F);

		rightWingModel[97].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -1.75F, 0F, -0.5F, -4F, 0F, -0.5F, 1.5F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, 0F, 0.5F, -3F, 0F, 0.5F, 0.5F, 0F, 0F, 0.25F); // Box 506
		rightWingModel[97].setRotationPoint(10F, -8.5F, 27.5F);

		rightWingModel[98].addShapeBox(0F, 0F, 0F, 4, 3, 1, 0F,0F, -0.5F, 0.25F, 0F, -2F, -2F, 0F, -2F, 1.5F, 0F, 0F, 0F, 0F, 0F, 1.75F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0F, 0F, 0F, -1.25F); // Box 507
		rightWingModel[98].setRotationPoint(10F, -11.5F, 31F);

		rightWingModel[99].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, 0F, -0.5F, 0F, 0F, -1.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F); // Box 508
		rightWingModel[99].setRotationPoint(3F, -8.5F, 27.5F);

		rightWingModel[100].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, 0.25F, 0F, -0.5F, 0.25F, 0F, -0.5F, -2.25F, 0F, 0F, -0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0.5F); // Box 509
		rightWingModel[100].setRotationPoint(3F, -11.5F, 37.5F);

		rightWingModel[101].addShapeBox(0F, 0F, 0F, 7, 3, 3, 0F,0F, 0F, -0.5F, 0F, -0.5F, -2.25F, 0F, -0.5F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F); // Box 510
		rightWingModel[101].setRotationPoint(3F, -11.5F, 28.5F);

		rightWingModel[102].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.75F, 0F, 0F, 0F); // Box 511
		rightWingModel[102].setRotationPoint(3F, -3.5F, 38F);

		rightWingModel[103].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -1F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.75F, 0F, -1F, 0F, 0F, 1F, -0.25F, 0F, 0F, 0.5F, 0F, 0F, -2.25F, 0F, 1F, -1F); // Box 512
		rightWingModel[103].setRotationPoint(3F, -3.5F, 38F);

		rightWingModel[104].addShapeBox(0F, 0F, 0F, 7, 2, 3, 0F,0F, -1F, 0F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, -1F, -0.25F, 0F, 1F, -1F, 0F, 0F, -2.25F, 0F, 0F, 0.5F, 0F, 1F, -0.25F); // Box 513
		rightWingModel[104].setRotationPoint(3F, -3.5F, 28F);

		rightWingModel[105].addShapeBox(0F, 0F, 0F, 7, 1, 3, 0F,0F, 0F, 0.25F, 0F, 0F, -0.75F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, -1F, -0.75F, 0F, -1F, -0.25F, 0F, 0F, -0.25F); // Box 514
		rightWingModel[105].setRotationPoint(3F, -3.5F, 28F);

		rightWingModel[106].addShapeBox(0F, 0F, 0F, 7, 2, 7, 0F,0F, 0F, 1F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1.5F, 0F, 0F, 1F, 0F, -1F, -1F, 0F, -2.25F, -2.75F, 0F, -2.25F, -2.75F, 0F, -1F, -1F); // Box 515
		rightWingModel[106].setRotationPoint(3F, 0.5F, 31F);

		rightWingModel[107].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, -0.5F, -1.5F, 0F, 0.75F, -2.25F, 0F, 0.75F, -2.25F, 0F, -0.5F, -1.5F, 0F, -1.25F, -2.75F, 0F, -2.5F, -3F, 0F, -2.5F, -3F, 0F, -1.25F, -2.75F); // Box 516
		rightWingModel[107].setRotationPoint(10F, -0.5F, 31F);

		rightWingModel[108].addShapeBox(0F, 0F, 0F, 7, 2, 9, 0F,0F, 0F, 1F, 0F, 1F, -0.25F, 0F, 1F, -0.25F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, -1.5F, -2.5F, 0F, -1.5F, -2.5F, 0F, -1F, 0F); // Box 517
		rightWingModel[108].setRotationPoint(3F, -0.5F, 30F);

		rightWingModel[109].addShapeBox(0F, 0F, 0F, 4, 2, 7, 0F,0F, 0F, 0.75F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 0F, 0.75F, 0F, -0.5F, -1.5F, 0F, -1.75F, -2.25F, 0F, -1.75F, -2.25F, 0F, -0.5F, -1.5F); // Box 518
		rightWingModel[109].setRotationPoint(10F, -1.5F, 31F);

		rightWingModel[110].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.25F, 0F, 0.5F, 0F, 0F, 0.5F, -2.5F, 0F, 0F, -0.75F, 0F, 0F, 0.5F, 0F, -0.5F, 1.5F, 0F, -0.5F, -4F, 0F, 0F, -2.25F); // Box 519
		rightWingModel[110].setRotationPoint(10F, -3.5F, 38F);

		rightWingModel[111].addShapeBox(0F, 0F, 0F, 4, 2, 3, 0F,0F, 0F, -0.75F, 0F, 0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0F, -0.25F, 0F, 0F, -2.25F, 0F, -0.5F, -4F, 0F, -0.5F, 1.5F, 0F, 0F, 0.5F); // Box 520
		rightWingModel[111].setRotationPoint(10F, -3.5F, 28F);

		rightWingModel[112].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, -0.5F, 0F, 0F); // Box 534
		rightWingModel[112].setRotationPoint(-49F, -5.5F, 34F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 129, 361, textureX, textureY); // Box 628
		bodyWheelModel[1] = new ModelRendererTurbo(this, 369, 265, textureX, textureY); // Box 629
		bodyWheelModel[2] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 631
		bodyWheelModel[3] = new ModelRendererTurbo(this, 377, 289, textureX, textureY); // Box 632
		bodyWheelModel[4] = new ModelRendererTurbo(this, 401, 289, textureX, textureY); // Box 633
		bodyWheelModel[5] = new ModelRendererTurbo(this, 65, 297, textureX, textureY); // Box 634
		bodyWheelModel[6] = new ModelRendererTurbo(this, 153, 89, textureX, textureY); // Box 635
		bodyWheelModel[7] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 636
		bodyWheelModel[8] = new ModelRendererTurbo(this, 417, 273, textureX, textureY); // Box 637
		bodyWheelModel[9] = new ModelRendererTurbo(this, 377, 137, textureX, textureY); // Box 638
		bodyWheelModel[10] = new ModelRendererTurbo(this, 209, 393, textureX, textureY); // Box 631

		bodyWheelModel[0].addShapeBox(0F, 0F, 0F, 6, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 628
		bodyWheelModel[0].setRotationPoint(-75.5F, 1.7F, -1F);

		bodyWheelModel[1].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 629
		bodyWheelModel[1].setRotationPoint(-75.5F, 0.699999999999999F, -1F);

		bodyWheelModel[2].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 631
		bodyWheelModel[2].setRotationPoint(-75F, -0.3F, -1F);

		bodyWheelModel[3].addShapeBox(0F, 0F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 632
		bodyWheelModel[3].setRotationPoint(-75.5F, 3.7F, -1F);

		bodyWheelModel[4].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F); // Box 633
		bodyWheelModel[4].setRotationPoint(-75F, 4.7F, -1F);

		bodyWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 11, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 6F, 0F, 0F); // Box 634
		bodyWheelModel[5].setRotationPoint(-65.5F, -13.5F, -0.5F);

		bodyWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 635
		bodyWheelModel[6].setRotationPoint(-71.5F, -2.5F, -2.5F);

		bodyWheelModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 636
		bodyWheelModel[7].setRotationPoint(-73F, 2.25F, -2.5F);

		bodyWheelModel[8].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F); // Box 637
		bodyWheelModel[8].setRotationPoint(-71.5F, -1.5F, -2.5F);

		bodyWheelModel[9].addShapeBox(0F, 0F, 0F, 1, 5, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, -1.5F, -0.25F, 0F, 1.5F, -0.25F, 0F); // Box 638
		bodyWheelModel[9].setRotationPoint(-69.5F, -11.5F, -1.5F);

		bodyWheelModel[10].addShapeBox(0F, 0F, 0F, 19, 6, 1, 0F,0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 631
		bodyWheelModel[10].setRotationPoint(-64F, -9.75F, 3F);
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 273, 377, textureX, textureY); // Box 614
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 345, 273, textureX, textureY); // Box 619
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 329, 265, textureX, textureY); // Box 620
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 185, 393, textureX, textureY); // Box 621
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 505, 377, textureX, textureY); // Box 625
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 361, 265, textureX, textureY); // Box 626
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 281, 273, textureX, textureY); // Box 627
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 257, 393, textureX, textureY); // Box 632
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 185, 313, textureX, textureY); // Box 635
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 281, 393, textureX, textureY); // Box 636
		leftWingWheelModel[10] = new ModelRendererTurbo(this, 305, 393, textureX, textureY); // Box 637
		leftWingWheelModel[11] = new ModelRendererTurbo(this, 209, 313, textureX, textureY); // Box 638

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 1F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F); // Box 614
		leftWingWheelModel[0].setRotationPoint(-20F, -8.75F, -1F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 1F, 2F, 0F, 1F, 2F, 0F, -1F, 2F, 0F, -1F); // Box 619
		leftWingWheelModel[1].setRotationPoint(-16F, -11.75F, -25F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 620
		leftWingWheelModel[2].setRotationPoint(-18F, -2.75F, -26F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 621
		leftWingWheelModel[3].setRotationPoint(-20F, -0.75F, -26F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 625
		leftWingWheelModel[4].setRotationPoint(-15.5F, -11.75F, -23F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		leftWingWheelModel[5].setRotationPoint(-15.5F, 0.25F, -24F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F, -4F); // Box 627
		leftWingWheelModel[6].setRotationPoint(-15.5F, -11.75F, -19F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 632
		leftWingWheelModel[7].setRotationPoint(-19.5F, -0.3F, -22F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, -0.5F, -2F, 0.5F, -0.5F); // Box 635
		leftWingWheelModel[8].setRotationPoint(-18.5F, 4.2F, -22F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F); // Box 636
		leftWingWheelModel[9].setRotationPoint(-19.5F, 2.7F, -22F);

		leftWingWheelModel[10].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-1F, -0.5F, 0F, -1F, -0.5F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 637
		leftWingWheelModel[10].setRotationPoint(-19.5F, -2.3F, -22F);

		leftWingWheelModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,-2F, 0.5F, 0F, -2F, 0.5F, 0F, -2F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 638
		leftWingWheelModel[11].setRotationPoint(-18.5F, -2.8F, -22F);
	}

	private void initrightWingWheelModel_1()
	{
		rightWingWheelModel[0] = new ModelRendererTurbo(this, 337, 377, textureX, textureY); // Box 615
		rightWingWheelModel[1] = new ModelRendererTurbo(this, 1, 297, textureX, textureY); // Box 650
		rightWingWheelModel[2] = new ModelRendererTurbo(this, 281, 313, textureX, textureY); // Box 651
		rightWingWheelModel[3] = new ModelRendererTurbo(this, 329, 393, textureX, textureY); // Box 652
		rightWingWheelModel[4] = new ModelRendererTurbo(this, 473, 385, textureX, textureY); // Box 653
		rightWingWheelModel[5] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Box 654
		rightWingWheelModel[6] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 655
		rightWingWheelModel[7] = new ModelRendererTurbo(this, 1, 401, textureX, textureY); // Box 656
		rightWingWheelModel[8] = new ModelRendererTurbo(this, 297, 313, textureX, textureY); // Box 657
		rightWingWheelModel[9] = new ModelRendererTurbo(this, 25, 401, textureX, textureY); // Box 658
		rightWingWheelModel[10] = new ModelRendererTurbo(this, 49, 401, textureX, textureY); // Box 659
		rightWingWheelModel[11] = new ModelRendererTurbo(this, 353, 353, textureX, textureY); // Box 660

		rightWingWheelModel[0].addShapeBox(0F, 0F, 0F, 9, 6, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F, -1F, 1F, 0F, 1F, 1F, 0F, 1F); // Box 615
		rightWingWheelModel[0].setRotationPoint(-20F, -8.75F, 0F);

		rightWingWheelModel[1].addShapeBox(0F, 0F, 0F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1F, 2F, 0F, -1F, 2F, 0F, 1F, 2F, 0F, 1F); // Box 650
		rightWingWheelModel[1].setRotationPoint(-16F, -11.75F, 24F);

		rightWingWheelModel[2].addShapeBox(0F, 0F, 0F, 6, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F); // Box 651
		rightWingWheelModel[2].setRotationPoint(-18F, -2.75F, 25F);

		rightWingWheelModel[3].addShapeBox(0F, 0F, 0F, 10, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		rightWingWheelModel[3].setRotationPoint(-20F, -0.75F, 25F);

		rightWingWheelModel[4].addShapeBox(0F, 0F, 0F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 653
		rightWingWheelModel[4].setRotationPoint(-15.5F, -11.75F, 22F);

		rightWingWheelModel[5].addShapeBox(0F, 0F, 0F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 654
		rightWingWheelModel[5].setRotationPoint(-15.5F, 0.25F, 22F);

		rightWingWheelModel[6].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F); // Box 655
		rightWingWheelModel[6].setRotationPoint(-15.5F, -11.75F, 18F);

		rightWingWheelModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 656
		rightWingWheelModel[7].setRotationPoint(-19.5F, -0.3F, 20F);

		rightWingWheelModel[8].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, -2F, 0.5F, 0F, -2F, 0.5F, 0F); // Box 657
		rightWingWheelModel[8].setRotationPoint(-18.5F, 4.2F, 20F);

		rightWingWheelModel[9].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F); // Box 658
		rightWingWheelModel[9].setRotationPoint(-19.5F, 2.7F, 20F);

		rightWingWheelModel[10].addShapeBox(0F, 0F, 0F, 9, 2, 2, 0F,-1F, -0.5F, -0.5F, -1F, -0.5F, -0.5F, -1F, -0.5F, 0F, -1F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 659
		rightWingWheelModel[10].setRotationPoint(-19.5F, -2.3F, 20F);

		rightWingWheelModel[11].addShapeBox(0F, 0F, 0F, 7, 1, 2, 0F,-2F, 0.5F, -0.5F, -2F, 0.5F, -0.5F, -2F, 0.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 660
		rightWingWheelModel[11].setRotationPoint(-18.5F, -2.8F, 20F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][9];
		propellerModels[0] = makeProp1(-43F, -5F, -34.5F);
		propellerModels[1] = makeProp2(-43F, -5F, 34.5F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[9];
		prop[0] = new ModelRendererTurbo(this, 164, 284, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 164, 284, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 164, 284, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 164, 284, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 164, 284, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 164, 284, textureX, textureY);
		prop[6] = new ModelRendererTurbo(this, 164, 284, textureX, textureY);
		prop[7] = new ModelRendererTurbo(this, 164, 284, textureX, textureY);
		prop[8] = new ModelRendererTurbo(this, 164, 284, textureX, textureY);
		prop[0].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[1].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[2].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[3].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[4].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[5].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[6].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[7].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[8].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		prop[6].setRotationPoint(i, j, k);
		prop[7].setRotationPoint(i, j, k);
		prop[8].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[9];
		prop[0] = new ModelRendererTurbo(this, 165, 285, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 165, 285, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 165, 285, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 165, 285, textureX, textureY);
		prop[4] = new ModelRendererTurbo(this, 165, 285, textureX, textureY);
		prop[5] = new ModelRendererTurbo(this, 165, 285, textureX, textureY);
		prop[6] = new ModelRendererTurbo(this, 165, 285, textureX, textureY);
		prop[7] = new ModelRendererTurbo(this, 165, 285, textureX, textureY);
		prop[8] = new ModelRendererTurbo(this, 165, 285, textureX, textureY);
		prop[0].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[1].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[2].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[3].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[4].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[5].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[6].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[7].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[8].addBox(-1.5F, -4F, -0.5F, 3, 4, 1, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		prop[4].setRotationPoint(i, j, k);
		prop[5].setRotationPoint(i, j, k);
		prop[6].setRotationPoint(i, j, k);
		prop[7].setRotationPoint(i, j, k);
		prop[8].setRotationPoint(i, j, k);
		return prop;
	}
}