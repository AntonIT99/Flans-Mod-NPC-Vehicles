//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelAircoDH extends ModelPlane //Same as Filename
{
	int textureX = 512;
	int textureY = 512;

	public ModelAircoDH() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[390];
		tailModel = new ModelRendererTurbo[43];
		leftWingModel = new ModelRendererTurbo[51];
		rightWingModel = new ModelRendererTurbo[51];
		yawFlapModel = new ModelRendererTurbo[7];
		pitchFlapLeftModel = new ModelRendererTurbo[5];
		pitchFlapRightModel = new ModelRendererTurbo[5];
		bodyWheelModel = new ModelRendererTurbo[52];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		initpitchFlapLeftModel_1();
		initpitchFlapRightModel_1();
		initbodyWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 36, 32, textureX, textureY); // Box 4
		bodyModel[1] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 6
		bodyModel[2] = new ModelRendererTurbo(this, 2, 73, textureX, textureY); // Box 7
		bodyModel[3] = new ModelRendererTurbo(this, 2, 83, textureX, textureY); // Box 8
		bodyModel[4] = new ModelRendererTurbo(this, 2, 61, textureX, textureY); // Box 9
		bodyModel[5] = new ModelRendererTurbo(this, 18, 54, textureX, textureY); // Box 10
		bodyModel[6] = new ModelRendererTurbo(this, 18, 43, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 95, 43, textureX, textureY); // Box 12
		bodyModel[8] = new ModelRendererTurbo(this, 77, 70, textureX, textureY); // Box 13
		bodyModel[9] = new ModelRendererTurbo(this, 77, 66, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 43, 71, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 43, 75, textureX, textureY); // Box 16
		bodyModel[12] = new ModelRendererTurbo(this, 3, 94, textureX, textureY); // Box 17
		bodyModel[13] = new ModelRendererTurbo(this, 12, 94, textureX, textureY); // Box 18
		bodyModel[14] = new ModelRendererTurbo(this, 19, 94, textureX, textureY); // Box 19
		bodyModel[15] = new ModelRendererTurbo(this, 42, 89, textureX, textureY); // Box 20
		bodyModel[16] = new ModelRendererTurbo(this, 4, 107, textureX, textureY); // Box 21
		bodyModel[17] = new ModelRendererTurbo(this, 51, 88, textureX, textureY); // Box 22
		bodyModel[18] = new ModelRendererTurbo(this, 48, 99, textureX, textureY); // Box 23
		bodyModel[19] = new ModelRendererTurbo(this, 28, 94, textureX, textureY); // Box 24
		bodyModel[20] = new ModelRendererTurbo(this, 4, 126, textureX, textureY); // Box 25
		bodyModel[21] = new ModelRendererTurbo(this, 48, 118, textureX, textureY); // Box 26
		bodyModel[22] = new ModelRendererTurbo(this, 80, 79, textureX, textureY); // Box 27
		bodyModel[23] = new ModelRendererTurbo(this, 77, 62, textureX, textureY); // Box 29
		bodyModel[24] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 31
		bodyModel[25] = new ModelRendererTurbo(this, 35, 97, textureX, textureY); // Box 32
		bodyModel[26] = new ModelRendererTurbo(this, 109, 161, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 24, 84, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 24, 74, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 24, 62, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 59, 66, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 60, 73, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 59, 80, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 108, 32, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 67, 55, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 54, 55, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 41, 55, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 59, 62, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 43, 66, textureX, textureY); // Box 47
		bodyModel[39] = new ModelRendererTurbo(this, 43, 62, textureX, textureY); // Box 48
		bodyModel[40] = new ModelRendererTurbo(this, 75, 98, textureX, textureY); // Box 49
		bodyModel[41] = new ModelRendererTurbo(this, 43, 160, textureX, textureY); // Box 50
		bodyModel[42] = new ModelRendererTurbo(this, 43, 156, textureX, textureY); // Box 51
		bodyModel[43] = new ModelRendererTurbo(this, 43, 151, textureX, textureY); // Box 52
		bodyModel[44] = new ModelRendererTurbo(this, 43, 147, textureX, textureY); // Box 53
		bodyModel[45] = new ModelRendererTurbo(this, 111, 38, textureX, textureY); // Box 54
		bodyModel[46] = new ModelRendererTurbo(this, 103, 62, textureX, textureY); // Box 55
		bodyModel[47] = new ModelRendererTurbo(this, 3, 100, textureX, textureY); // Box 1
		bodyModel[48] = new ModelRendererTurbo(this, 35, 97, textureX, textureY); // Box 2
		bodyModel[49] = new ModelRendererTurbo(this, 36, 32, textureX, textureY); // Box 3
		bodyModel[50] = new ModelRendererTurbo(this, 1, 32, textureX, textureY); // Box 4
		bodyModel[51] = new ModelRendererTurbo(this, 63, 139, textureX, textureY); // Box 5
		bodyModel[52] = new ModelRendererTurbo(this, 61, 148, textureX, textureY); // Box 6
		bodyModel[53] = new ModelRendererTurbo(this, 18, 187, textureX, textureY); // Box 7
		bodyModel[54] = new ModelRendererTurbo(this, 42, 176, textureX, textureY); // Box 8
		bodyModel[55] = new ModelRendererTurbo(this, 28, 181, textureX, textureY); // Box 9
		bodyModel[56] = new ModelRendererTurbo(this, 19, 181, textureX, textureY); // Box 10
		bodyModel[57] = new ModelRendererTurbo(this, 12, 181, textureX, textureY); // Box 11
		bodyModel[58] = new ModelRendererTurbo(this, 3, 181, textureX, textureY); // Box 12
		bodyModel[59] = new ModelRendererTurbo(this, 24, 151, textureX, textureY); // Box 16
		bodyModel[60] = new ModelRendererTurbo(this, 24, 163, textureX, textureY); // Box 17
		bodyModel[61] = new ModelRendererTurbo(this, 24, 173, textureX, textureY); // Box 18
		bodyModel[62] = new ModelRendererTurbo(this, 18, 199, textureX, textureY); // Box 19
		bodyModel[63] = new ModelRendererTurbo(this, 54, 200, textureX, textureY); // Box 20
		bodyModel[64] = new ModelRendererTurbo(this, 41, 200, textureX, textureY); // Box 21
		bodyModel[65] = new ModelRendererTurbo(this, 67, 200, textureX, textureY); // Box 22
		bodyModel[66] = new ModelRendererTurbo(this, 59, 180, textureX, textureY); // Box 23
		bodyModel[67] = new ModelRendererTurbo(this, 60, 173, textureX, textureY); // Box 24
		bodyModel[68] = new ModelRendererTurbo(this, 59, 166, textureX, textureY); // Box 25
		bodyModel[69] = new ModelRendererTurbo(this, 59, 162, textureX, textureY); // Box 26
		bodyModel[70] = new ModelRendererTurbo(this, 77, 162, textureX, textureY); // Box 27
		bodyModel[71] = new ModelRendererTurbo(this, 77, 166, textureX, textureY); // Box 28
		bodyModel[72] = new ModelRendererTurbo(this, 77, 170, textureX, textureY); // Box 29
		bodyModel[73] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 30
		bodyModel[74] = new ModelRendererTurbo(this, 132, 161, textureX, textureY); // Box 31
		bodyModel[75] = new ModelRendererTurbo(this, 142, 161, textureX, textureY); // Box 33
		bodyModel[76] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 34
		bodyModel[77] = new ModelRendererTurbo(this, 132, 161, textureX, textureY); // Box 37
		bodyModel[78] = new ModelRendererTurbo(this, 142, 161, textureX, textureY); // Box 38
		bodyModel[79] = new ModelRendererTurbo(this, 93, 135, textureX, textureY); // Box 59
		bodyModel[80] = new ModelRendererTurbo(this, 119, 135, textureX, textureY); // Box 60
		bodyModel[81] = new ModelRendererTurbo(this, 91, 125, textureX, textureY); // Box 61
		bodyModel[82] = new ModelRendererTurbo(this, 93, 116, textureX, textureY); // Box 62
		bodyModel[83] = new ModelRendererTurbo(this, 93, 108, textureX, textureY); // Box 63
		bodyModel[84] = new ModelRendererTurbo(this, 93, 101, textureX, textureY); // Box 64
		bodyModel[85] = new ModelRendererTurbo(this, 93, 98, textureX, textureY); // Box 65
		bodyModel[86] = new ModelRendererTurbo(this, 93, 95, textureX, textureY); // Box 66
		bodyModel[87] = new ModelRendererTurbo(this, 93, 98, textureX, textureY); // Box 67
		bodyModel[88] = new ModelRendererTurbo(this, 119, 129, textureX, textureY); // Box 69
		bodyModel[89] = new ModelRendererTurbo(this, 119, 125, textureX, textureY); // Box 70
		bodyModel[90] = new ModelRendererTurbo(this, 116, 117, textureX, textureY); // Box 71
		bodyModel[91] = new ModelRendererTurbo(this, 116, 110, textureX, textureY); // Box 81
		bodyModel[92] = new ModelRendererTurbo(this, 116, 104, textureX, textureY); // Box 82
		bodyModel[93] = new ModelRendererTurbo(this, 116, 99, textureX, textureY); // Box 83
		bodyModel[94] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 91
		bodyModel[95] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 92
		bodyModel[96] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 93
		bodyModel[97] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 94
		bodyModel[98] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 95
		bodyModel[99] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 96
		bodyModel[100] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 97
		bodyModel[101] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 98
		bodyModel[102] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 100
		bodyModel[103] = new ModelRendererTurbo(this, 110, 94, textureX, textureY); // Box 101
		bodyModel[104] = new ModelRendererTurbo(this, 122, 93, textureX, textureY); // Box 102
		bodyModel[105] = new ModelRendererTurbo(this, 120, 141, textureX, textureY); // Box 103
		bodyModel[106] = new ModelRendererTurbo(this, 120, 145, textureX, textureY); // Box 104
		bodyModel[107] = new ModelRendererTurbo(this, 120, 151, textureX, textureY); // Box 105
		bodyModel[108] = new ModelRendererTurbo(this, 91, 125, textureX, textureY); // Box 106
		bodyModel[109] = new ModelRendererTurbo(this, 93, 116, textureX, textureY); // Box 107
		bodyModel[110] = new ModelRendererTurbo(this, 93, 108, textureX, textureY); // Box 108
		bodyModel[111] = new ModelRendererTurbo(this, 93, 101, textureX, textureY); // Box 109
		bodyModel[112] = new ModelRendererTurbo(this, 93, 98, textureX, textureY); // Box 110
		bodyModel[113] = new ModelRendererTurbo(this, 93, 98, textureX, textureY); // Box 111
		bodyModel[114] = new ModelRendererTurbo(this, 93, 95, textureX, textureY); // Box 112
		bodyModel[115] = new ModelRendererTurbo(this, 119, 129, textureX, textureY); // Box 113
		bodyModel[116] = new ModelRendererTurbo(this, 119, 125, textureX, textureY); // Box 114
		bodyModel[117] = new ModelRendererTurbo(this, 116, 110, textureX, textureY); // Box 115
		bodyModel[118] = new ModelRendererTurbo(this, 116, 104, textureX, textureY); // Box 116
		bodyModel[119] = new ModelRendererTurbo(this, 116, 99, textureX, textureY); // Box 117
		bodyModel[120] = new ModelRendererTurbo(this, 110, 94, textureX, textureY); // Box 196
		bodyModel[121] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 197
		bodyModel[122] = new ModelRendererTurbo(this, 122, 93, textureX, textureY); // Box 198
		bodyModel[123] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 199
		bodyModel[124] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 200
		bodyModel[125] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 201
		bodyModel[126] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 202
		bodyModel[127] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 203
		bodyModel[128] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 204
		bodyModel[129] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 205
		bodyModel[130] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 206
		bodyModel[131] = new ModelRendererTurbo(this, 110, 94, textureX, textureY); // Box 207
		bodyModel[132] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 208
		bodyModel[133] = new ModelRendererTurbo(this, 122, 93, textureX, textureY); // Box 209
		bodyModel[134] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 210
		bodyModel[135] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 211
		bodyModel[136] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 212
		bodyModel[137] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 213
		bodyModel[138] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 214
		bodyModel[139] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 215
		bodyModel[140] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 216
		bodyModel[141] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 217
		bodyModel[142] = new ModelRendererTurbo(this, 110, 94, textureX, textureY); // Box 218
		bodyModel[143] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 219
		bodyModel[144] = new ModelRendererTurbo(this, 122, 93, textureX, textureY); // Box 220
		bodyModel[145] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 221
		bodyModel[146] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 222
		bodyModel[147] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 223
		bodyModel[148] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 224
		bodyModel[149] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 225
		bodyModel[150] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 226
		bodyModel[151] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 227
		bodyModel[152] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 228
		bodyModel[153] = new ModelRendererTurbo(this, 110, 94, textureX, textureY); // Box 229
		bodyModel[154] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 230
		bodyModel[155] = new ModelRendererTurbo(this, 122, 93, textureX, textureY); // Box 231
		bodyModel[156] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 232
		bodyModel[157] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 233
		bodyModel[158] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 234
		bodyModel[159] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 235
		bodyModel[160] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 236
		bodyModel[161] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 237
		bodyModel[162] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 238
		bodyModel[163] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 239
		bodyModel[164] = new ModelRendererTurbo(this, 110, 94, textureX, textureY); // Box 240
		bodyModel[165] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 241
		bodyModel[166] = new ModelRendererTurbo(this, 122, 93, textureX, textureY); // Box 242
		bodyModel[167] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 243
		bodyModel[168] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 244
		bodyModel[169] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 245
		bodyModel[170] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 246
		bodyModel[171] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 247
		bodyModel[172] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 248
		bodyModel[173] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 249
		bodyModel[174] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 250
		bodyModel[175] = new ModelRendererTurbo(this, 110, 94, textureX, textureY); // Box 251
		bodyModel[176] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 252
		bodyModel[177] = new ModelRendererTurbo(this, 122, 93, textureX, textureY); // Box 253
		bodyModel[178] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 254
		bodyModel[179] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 255
		bodyModel[180] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 256
		bodyModel[181] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 257
		bodyModel[182] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 258
		bodyModel[183] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 259
		bodyModel[184] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 260
		bodyModel[185] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 261
		bodyModel[186] = new ModelRendererTurbo(this, 110, 94, textureX, textureY); // Box 262
		bodyModel[187] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 263
		bodyModel[188] = new ModelRendererTurbo(this, 122, 93, textureX, textureY); // Box 264
		bodyModel[189] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 265
		bodyModel[190] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 266
		bodyModel[191] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 267
		bodyModel[192] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 268
		bodyModel[193] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 269
		bodyModel[194] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 270
		bodyModel[195] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 271
		bodyModel[196] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 272
		bodyModel[197] = new ModelRendererTurbo(this, 110, 94, textureX, textureY); // Box 273
		bodyModel[198] = new ModelRendererTurbo(this, 115, 93, textureX, textureY); // Box 274
		bodyModel[199] = new ModelRendererTurbo(this, 122, 93, textureX, textureY); // Box 275
		bodyModel[200] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 276
		bodyModel[201] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 277
		bodyModel[202] = new ModelRendererTurbo(this, 133, 93, textureX, textureY); // Box 278
		bodyModel[203] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 279
		bodyModel[204] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 280
		bodyModel[205] = new ModelRendererTurbo(this, 134, 104, textureX, textureY); // Box 281
		bodyModel[206] = new ModelRendererTurbo(this, 134, 118, textureX, textureY); // Box 282
		bodyModel[207] = new ModelRendererTurbo(this, 134, 133, textureX, textureY); // Box 283
		bodyModel[208] = new ModelRendererTurbo(this, 109, 147, textureX, textureY); // Box 284
		bodyModel[209] = new ModelRendererTurbo(this, 120, 145, textureX, textureY); // Box 286
		bodyModel[210] = new ModelRendererTurbo(this, 120, 141, textureX, textureY); // Box 287
		bodyModel[211] = new ModelRendererTurbo(this, 152, 17, textureX, textureY); // Box 301
		bodyModel[212] = new ModelRendererTurbo(this, 195, 17, textureX, textureY); // Box 302
		bodyModel[213] = new ModelRendererTurbo(this, 152, 17, textureX, textureY); // Box 346
		bodyModel[214] = new ModelRendererTurbo(this, 195, 17, textureX, textureY); // Box 347
		bodyModel[215] = new ModelRendererTurbo(this, 183, 197, textureX, textureY); // Box 388
		bodyModel[216] = new ModelRendererTurbo(this, 156, 184, textureX, textureY); // Box 389
		bodyModel[217] = new ModelRendererTurbo(this, 211, 182, textureX, textureY); // Box 390
		bodyModel[218] = new ModelRendererTurbo(this, 245, 187, textureX, textureY); // Box 391
		bodyModel[219] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 392
		bodyModel[220] = new ModelRendererTurbo(this, 142, 141, textureX, textureY); // Box 393
		bodyModel[221] = new ModelRendererTurbo(this, 142, 145, textureX, textureY); // Box 394
		bodyModel[222] = new ModelRendererTurbo(this, 142, 151, textureX, textureY); // Box 395
		bodyModel[223] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 398
		bodyModel[224] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 409
		bodyModel[225] = new ModelRendererTurbo(this, 4, 215, textureX, textureY); // Box 410
		bodyModel[226] = new ModelRendererTurbo(this, 142, 145, textureX, textureY); // Box 439
		bodyModel[227] = new ModelRendererTurbo(this, 142, 141, textureX, textureY); // Box 440
		bodyModel[228] = new ModelRendererTurbo(this, 114, 224, textureX, textureY); // Box 25
		bodyModel[229] = new ModelRendererTurbo(this, 112, 318, textureX, textureY); // Box 26
		bodyModel[230] = new ModelRendererTurbo(this, 104, 320, textureX, textureY); // Box 27
		bodyModel[231] = new ModelRendererTurbo(this, 112, 318, textureX, textureY); // Box 28
		bodyModel[232] = new ModelRendererTurbo(this, 104, 320, textureX, textureY); // Box 29
		bodyModel[233] = new ModelRendererTurbo(this, 104, 320, textureX, textureY); // Box 61
		bodyModel[234] = new ModelRendererTurbo(this, 104, 320, textureX, textureY); // Box 62
		bodyModel[235] = new ModelRendererTurbo(this, 112, 318, textureX, textureY); // Box 63
		bodyModel[236] = new ModelRendererTurbo(this, 112, 318, textureX, textureY); // Box 64
		bodyModel[237] = new ModelRendererTurbo(this, 127, 224, textureX, textureY); // Box 96
		bodyModel[238] = new ModelRendererTurbo(this, 145, 224, textureX, textureY); // Box 97
		bodyModel[239] = new ModelRendererTurbo(this, 145, 231, textureX, textureY); // Box 98
		bodyModel[240] = new ModelRendererTurbo(this, 127, 231, textureX, textureY); // Box 99
		bodyModel[241] = new ModelRendererTurbo(this, 114, 231, textureX, textureY); // Box 100
		bodyModel[242] = new ModelRendererTurbo(this, 114, 235, textureX, textureY); // Box 101
		bodyModel[243] = new ModelRendererTurbo(this, 145, 224, textureX, textureY); // Box 102
		bodyModel[244] = new ModelRendererTurbo(this, 145, 231, textureX, textureY); // Box 103
		bodyModel[245] = new ModelRendererTurbo(this, 127, 231, textureX, textureY); // Box 104
		bodyModel[246] = new ModelRendererTurbo(this, 114, 231, textureX, textureY); // Box 105
		bodyModel[247] = new ModelRendererTurbo(this, 127, 224, textureX, textureY); // Box 106
		bodyModel[248] = new ModelRendererTurbo(this, 114, 224, textureX, textureY); // Box 107
		bodyModel[249] = new ModelRendererTurbo(this, 127, 236, textureX, textureY); // Box 108
		bodyModel[250] = new ModelRendererTurbo(this, 137, 236, textureX, textureY); // Box 109
		bodyModel[251] = new ModelRendererTurbo(this, 122, 242, textureX, textureY); // Box 110
		bodyModel[252] = new ModelRendererTurbo(this, 145, 236, textureX, textureY); // Box 111
		bodyModel[253] = new ModelRendererTurbo(this, 145, 236, textureX, textureY); // Box 112
		bodyModel[254] = new ModelRendererTurbo(this, 122, 250, textureX, textureY); // Box 113
		bodyModel[255] = new ModelRendererTurbo(this, 122, 242, textureX, textureY); // Box 114
		bodyModel[256] = new ModelRendererTurbo(this, 122, 250, textureX, textureY); // Box 115
		bodyModel[257] = new ModelRendererTurbo(this, 127, 236, textureX, textureY); // Box 116
		bodyModel[258] = new ModelRendererTurbo(this, 145, 236, textureX, textureY); // Box 117
		bodyModel[259] = new ModelRendererTurbo(this, 137, 236, textureX, textureY); // Box 118
		bodyModel[260] = new ModelRendererTurbo(this, 145, 236, textureX, textureY); // Box 119
		bodyModel[261] = new ModelRendererTurbo(this, 148, 87, textureX, textureY); // Box 0
		bodyModel[262] = new ModelRendererTurbo(this, 148, 95, textureX, textureY); // Box 1
		bodyModel[263] = new ModelRendererTurbo(this, 148, 100, textureX, textureY); // Box 2
		bodyModel[264] = new ModelRendererTurbo(this, 148, 105, textureX, textureY); // Box 3
		bodyModel[265] = new ModelRendererTurbo(this, 148, 111, textureX, textureY); // Box 0
		bodyModel[266] = new ModelRendererTurbo(this, 148, 115, textureX, textureY); // Box 1
		bodyModel[267] = new ModelRendererTurbo(this, 148, 95, textureX, textureY); // Box 2
		bodyModel[268] = new ModelRendererTurbo(this, 148, 100, textureX, textureY); // Box 3
		bodyModel[269] = new ModelRendererTurbo(this, 148, 105, textureX, textureY); // Box 4
		bodyModel[270] = new ModelRendererTurbo(this, 148, 111, textureX, textureY); // Box 5
		bodyModel[271] = new ModelRendererTurbo(this, 148, 115, textureX, textureY); // Box 6
		bodyModel[272] = new ModelRendererTurbo(this, 165, 86, textureX, textureY); // Box 7
		bodyModel[273] = new ModelRendererTurbo(this, 165, 86, textureX, textureY); // Box 8
		bodyModel[274] = new ModelRendererTurbo(this, 157, 118, textureX, textureY); // Box 9
		bodyModel[275] = new ModelRendererTurbo(this, 168, 100, textureX, textureY); // Box 10
		bodyModel[276] = new ModelRendererTurbo(this, 165, 89, textureX, textureY); // Box 11
		bodyModel[277] = new ModelRendererTurbo(this, 165, 94, textureX, textureY); // Box 12
		bodyModel[278] = new ModelRendererTurbo(this, 161, 100, textureX, textureY); // Box 13
		bodyModel[279] = new ModelRendererTurbo(this, 184, 116, textureX, textureY); // Box 0
		bodyModel[280] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 1
		bodyModel[281] = new ModelRendererTurbo(this, 177, 94, textureX, textureY); // Box 2
		bodyModel[282] = new ModelRendererTurbo(this, 183, 100, textureX, textureY); // Box 3
		bodyModel[283] = new ModelRendererTurbo(this, 176, 100, textureX, textureY); // Box 4
		bodyModel[284] = new ModelRendererTurbo(this, 168, 100, textureX, textureY); // Box 5
		bodyModel[285] = new ModelRendererTurbo(this, 161, 100, textureX, textureY); // Box 6
		bodyModel[286] = new ModelRendererTurbo(this, 181, 138, textureX, textureY); // Box 7
		bodyModel[287] = new ModelRendererTurbo(this, 166, 134, textureX, textureY); // Box 8
		bodyModel[288] = new ModelRendererTurbo(this, 181, 135, textureX, textureY); // Box 9
		bodyModel[289] = new ModelRendererTurbo(this, 171, 135, textureX, textureY); // Box 10
		bodyModel[290] = new ModelRendererTurbo(this, 165, 135, textureX, textureY); // Box 11
		bodyModel[291] = new ModelRendererTurbo(this, 166, 140, textureX, textureY); // Box 12
		bodyModel[292] = new ModelRendererTurbo(this, 166, 140, textureX, textureY); // Box 13
		bodyModel[293] = new ModelRendererTurbo(this, 166, 134, textureX, textureY); // Box 14
		bodyModel[294] = new ModelRendererTurbo(this, 208, 158, textureX, textureY); // Box 15
		bodyModel[295] = new ModelRendererTurbo(this, 209, 142, textureX, textureY); // Box 16
		bodyModel[296] = new ModelRendererTurbo(this, 209, 142, textureX, textureY); // Box 17
		bodyModel[297] = new ModelRendererTurbo(this, 187, 150, textureX, textureY); // Box 18
		bodyModel[298] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 20
		bodyModel[299] = new ModelRendererTurbo(this, 153, 144, textureX, textureY); // Box 21
		bodyModel[300] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 22
		bodyModel[301] = new ModelRendererTurbo(this, 225, 145, textureX, textureY); // Box 23
		bodyModel[302] = new ModelRendererTurbo(this, 153, 138, textureX, textureY); // Box 25
		bodyModel[303] = new ModelRendererTurbo(this, 163, 157, textureX, textureY); // Box 26
		bodyModel[304] = new ModelRendererTurbo(this, 163, 149, textureX, textureY); // Box 27
		bodyModel[305] = new ModelRendererTurbo(this, 153, 144, textureX, textureY); // Box 0
		bodyModel[306] = new ModelRendererTurbo(this, 163, 149, textureX, textureY); // Box 1
		bodyModel[307] = new ModelRendererTurbo(this, 153, 138, textureX, textureY); // Box 2
		bodyModel[308] = new ModelRendererTurbo(this, 151, 164, textureX, textureY); // Box 3
		bodyModel[309] = new ModelRendererTurbo(this, 182, 170, textureX, textureY); // Box 4
		bodyModel[310] = new ModelRendererTurbo(this, 187, 167, textureX, textureY); // Box 5
		bodyModel[311] = new ModelRendererTurbo(this, 163, 149, textureX, textureY); // Box 6
		bodyModel[312] = new ModelRendererTurbo(this, 163, 157, textureX, textureY); // Box 7
		bodyModel[313] = new ModelRendererTurbo(this, 187, 167, textureX, textureY); // Box 9
		bodyModel[314] = new ModelRendererTurbo(this, 182, 170, textureX, textureY); // Box 10
		bodyModel[315] = new ModelRendererTurbo(this, 163, 149, textureX, textureY); // Box 11
		bodyModel[316] = new ModelRendererTurbo(this, 163, 157, textureX, textureY); // Box 13
		bodyModel[317] = new ModelRendererTurbo(this, 163, 149, textureX, textureY); // Box 14
		bodyModel[318] = new ModelRendererTurbo(this, 163, 149, textureX, textureY); // Box 15
		bodyModel[319] = new ModelRendererTurbo(this, 163, 157, textureX, textureY); // Box 16
		bodyModel[320] = new ModelRendererTurbo(this, 163, 149, textureX, textureY); // Box 17
		bodyModel[321] = new ModelRendererTurbo(this, 163, 149, textureX, textureY); // Box 18
		bodyModel[322] = new ModelRendererTurbo(this, 210, 159, textureX, textureY); // Box 19
		bodyModel[323] = new ModelRendererTurbo(this, 210, 159, textureX, textureY); // Box 20
		bodyModel[324] = new ModelRendererTurbo(this, 210, 150, textureX, textureY); // Box 21
		bodyModel[325] = new ModelRendererTurbo(this, 229, 164, textureX, textureY); // Box 22
		bodyModel[326] = new ModelRendererTurbo(this, 234, 167, textureX, textureY); // Box 23
		bodyModel[327] = new ModelRendererTurbo(this, 235, 162, textureX, textureY); // Box 24
		bodyModel[328] = new ModelRendererTurbo(this, 236, 157, textureX, textureY); // Box 25
		bodyModel[329] = new ModelRendererTurbo(this, 236, 157, textureX, textureY); // Box 26
		bodyModel[330] = new ModelRendererTurbo(this, 236, 154, textureX, textureY); // Box 27
		bodyModel[331] = new ModelRendererTurbo(this, 240, 162, textureX, textureY); // Box 28
		bodyModel[332] = new ModelRendererTurbo(this, 229, 158, textureX, textureY); // Box 29
		bodyModel[333] = new ModelRendererTurbo(this, 229, 164, textureX, textureY); // Box 30
		bodyModel[334] = new ModelRendererTurbo(this, 229, 158, textureX, textureY); // Box 31
		bodyModel[335] = new ModelRendererTurbo(this, 198, 226, textureX, textureY); // MG1
		bodyModel[336] = new ModelRendererTurbo(this, 198, 226, textureX, textureY); // MG2
		bodyModel[337] = new ModelRendererTurbo(this, 198, 226, textureX, textureY); // MG3
		bodyModel[338] = new ModelRendererTurbo(this, 180, 225, textureX, textureY); // MG4
		bodyModel[339] = new ModelRendererTurbo(this, 193, 236, textureX, textureY); // MG5
		bodyModel[340] = new ModelRendererTurbo(this, 193, 236, textureX, textureY); // MG6
		bodyModel[341] = new ModelRendererTurbo(this, 193, 236, textureX, textureY); // MG7
		bodyModel[342] = new ModelRendererTurbo(this, 185, 239, textureX, textureY); // MG8
		bodyModel[343] = new ModelRendererTurbo(this, 185, 245, textureX, textureY); // MG10
		bodyModel[344] = new ModelRendererTurbo(this, 185, 242, textureX, textureY); // MG9
		bodyModel[345] = new ModelRendererTurbo(this, 190, 245, textureX, textureY); // MG11
		bodyModel[346] = new ModelRendererTurbo(this, 175, 225, textureX, textureY); // MG13
		bodyModel[347] = new ModelRendererTurbo(this, 174, 229, textureX, textureY); // MG12
		bodyModel[348] = new ModelRendererTurbo(this, 173, 236, textureX, textureY); // MG14
		bodyModel[349] = new ModelRendererTurbo(this, 183, 236, textureX, textureY); // MG15
		bodyModel[350] = new ModelRendererTurbo(this, 183, 236, textureX, textureY); // MG16
		bodyModel[351] = new ModelRendererTurbo(this, 178, 236, textureX, textureY); // MG17
		bodyModel[352] = new ModelRendererTurbo(this, 188, 236, textureX, textureY); // MG18
		bodyModel[353] = new ModelRendererTurbo(this, 188, 236, textureX, textureY); // MG19
		bodyModel[354] = new ModelRendererTurbo(this, 188, 236, textureX, textureY); // MG20
		bodyModel[355] = new ModelRendererTurbo(this, 188, 236, textureX, textureY); // MG21
		bodyModel[356] = new ModelRendererTurbo(this, 193, 232, textureX, textureY); // MG23
		bodyModel[357] = new ModelRendererTurbo(this, 193, 232, textureX, textureY); // MG22
		bodyModel[358] = new ModelRendererTurbo(this, 193, 232, textureX, textureY); // MG23
		bodyModel[359] = new ModelRendererTurbo(this, 175, 219, textureX, textureY); // MG24
		bodyModel[360] = new ModelRendererTurbo(this, 175, 216, textureX, textureY); // MG25
		bodyModel[361] = new ModelRendererTurbo(this, 175, 222, textureX, textureY); // MG26
		bodyModel[362] = new ModelRendererTurbo(this, 198, 220, textureX, textureY); // MG27
		bodyModel[363] = new ModelRendererTurbo(this, 203, 216, textureX, textureY); // MG29
		bodyModel[364] = new ModelRendererTurbo(this, 200, 219, textureX, textureY); // MG28
		bodyModel[365] = new ModelRendererTurbo(this, 208, 219, textureX, textureY); // MG31
		bodyModel[366] = new ModelRendererTurbo(this, 208, 219, textureX, textureY); // MG30
		bodyModel[367] = new ModelRendererTurbo(this, 173, 232, textureX, textureY); // MG33
		bodyModel[368] = new ModelRendererTurbo(this, 186, 232, textureX, textureY); // MG34
		bodyModel[369] = new ModelRendererTurbo(this, 185, 229, textureX, textureY); // MG32
		bodyModel[370] = new ModelRendererTurbo(this, 186, 232, textureX, textureY); // MG35
		bodyModel[371] = new ModelRendererTurbo(this, 172, 247, textureX, textureY); // MG36
		bodyModel[372] = new ModelRendererTurbo(this, 172, 241, textureX, textureY); // MG37
		bodyModel[373] = new ModelRendererTurbo(this, 172, 241, textureX, textureY); // MG38
		bodyModel[374] = new ModelRendererTurbo(this, 153, 242, textureX, textureY); // Box 2
		bodyModel[375] = new ModelRendererTurbo(this, 153, 238, textureX, textureY); // Box 3
		bodyModel[376] = new ModelRendererTurbo(this, 153, 242, textureX, textureY); // Box 4
		bodyModel[377] = new ModelRendererTurbo(this, 153, 238, textureX, textureY); // Box 5
		bodyModel[378] = new ModelRendererTurbo(this, 153, 242, textureX, textureY); // Box 6
		bodyModel[379] = new ModelRendererTurbo(this, 153, 238, textureX, textureY); // Box 7
		bodyModel[380] = new ModelRendererTurbo(this, 153, 238, textureX, textureY); // Box 8
		bodyModel[381] = new ModelRendererTurbo(this, 153, 242, textureX, textureY); // Box 9
		bodyModel[382] = new ModelRendererTurbo(this, 139, 152, textureX, textureY); // Box 0
		bodyModel[383] = new ModelRendererTurbo(this, 139, 152, textureX, textureY); // Box 1
		bodyModel[384] = new ModelRendererTurbo(this, 139, 152, textureX, textureY); // Box 2
		bodyModel[385] = new ModelRendererTurbo(this, 139, 152, textureX, textureY); // Box 3
		bodyModel[386] = new ModelRendererTurbo(this, 139, 152, textureX, textureY); // Box 4
		bodyModel[387] = new ModelRendererTurbo(this, 139, 152, textureX, textureY); // Box 5
		bodyModel[388] = new ModelRendererTurbo(this, 415, 76, textureX, textureY); // Box 4
		bodyModel[389] = new ModelRendererTurbo(this, 415, 76, textureX, textureY); // Box 5

		bodyModel[0].addShapeBox(-42F, -2F, -7F, 31, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[0].setRotationPoint(0F, -13F, 0F);

		bodyModel[1].addShapeBox(-52F, -2F, -7F, 10, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 6
		bodyModel[1].setRotationPoint(0F, -13F, 0F);

		bodyModel[2].addShapeBox(-56F, -7F, -3F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F); // Box 7
		bodyModel[2].setRotationPoint(0F, -13F, 0F);

		bodyModel[3].addShapeBox(-56F, -4F, -3F, 4, 3, 6, 0F,.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 8
		bodyModel[3].setRotationPoint(0F, -13F, 0F);

		bodyModel[4].addShapeBox(-56F, -11F, -3F, 4, 4, 6, 0F,-2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[4].setRotationPoint(0F, -13F, 0F);

		bodyModel[5].addShapeBox(-52F, -7F, -7F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[5].setRotationPoint(0F, -13F, 0F);

		bodyModel[6].addShapeBox(-42F, -11F, -7F, 37, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[6].setRotationPoint(0F, -13F, 0F);

		bodyModel[7].addShapeBox(-5F, -11F, -7F, 5, 9, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[7].setRotationPoint(0F, -13F, 0F);

		bodyModel[8].addShapeBox(-47F, -13F, -7F, 11, 2, 1, 0F,0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 13
		bodyModel[8].setRotationPoint(0F, -13F, 0F);

		bodyModel[9].addShapeBox(-47F, -15F, -7F, 11, 2, 1, 0F,-.5F, 0F, -1.2F, -3F, 0F, -1F, -3F, 0F, 1F, -.5F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		bodyModel[9].setRotationPoint(0F, -13F, 0F);

		bodyModel[10].addShapeBox(-51F, -15F, -3F, 4, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.25F, -1.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, .5F, 0F, .5F); // Box 15
		bodyModel[10].setRotationPoint(0F, -13F, 0F);

		bodyModel[11].addShapeBox(-53F, -13F, -3F, 6, 2, 2, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, -1.5F, 0F, -.5F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, .5F); // Box 16
		bodyModel[11].setRotationPoint(0F, -13F, 0F);

		bodyModel[12].addShapeBox(-36F, -13F, -7F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 17
		bodyModel[12].setRotationPoint(0F, -13F, 0F);

		bodyModel[13].addShapeBox(-33F, -12F, -7F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[13].setRotationPoint(0F, -13F, 0F);

		bodyModel[14].addShapeBox(-31F, -14F, -7F, 3, 3, 1, 0F,0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[14].setRotationPoint(0F, -13F, 0F);

		bodyModel[15].addShapeBox(-28F, -17F, -7F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[15].setRotationPoint(0F, -13F, 0F);

		bodyModel[16].addShapeBox(-25F, -17F, -7F, 14, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[16].setRotationPoint(0F, -13F, 0F);

		bodyModel[17].addShapeBox(-25F, -20F, -3F, 14, 3, 6, 0F,-1F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[17].setRotationPoint(0F, -13F, 0F);

		bodyModel[18].addShapeBox(-11F, -17F, -7F, 6, 3, 14, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[18].setRotationPoint(0F, -13F, 0F);

		bodyModel[19].addShapeBox(-28F, -14F, -7F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 24
		bodyModel[19].setRotationPoint(0F, -13F, 0F);

		bodyModel[20].addShapeBox(-25F, -14F, -7F, 14, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[20].setRotationPoint(0F, -13F, 0F);

		bodyModel[21].addShapeBox(-11F, -14F, -7F, 6, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[21].setRotationPoint(0F, -13F, 0F);

		bodyModel[22].addShapeBox(-11F, -19F, -3F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[22].setRotationPoint(0F, -13F, 0F);

		bodyModel[23].addShapeBox(-47F, -17F, -7F, 8, 2, 1, 0F,-1F, 0F, -2.5F, -2F, 0F, -2.5F, -2F, 0F, 3F, 0F, 0F, 3F, -.5F, 0F, -1.2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Box 29
		bodyModel[23].setRotationPoint(0F, -13F, 0F);

		bodyModel[24].addShapeBox(-25F, -20F, -6F, 14, 3, 3, 0F,-1F, -.8F, -1.5F, 0F, -1.5F, -1.5F, 0F, -1F, 0F, -1F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyModel[24].setRotationPoint(0F, -13F, 0F);

		bodyModel[25].addShapeBox(-11F, -19F, -6F, 6, 2, 3, 0F,0F, -.5F, -1.5F, 0F, -.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyModel[25].setRotationPoint(0F, -13F, 0F);

		bodyModel[26].addShapeBox(-5F, -17F, -1F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[26].setRotationPoint(0F, -13F, 0F);

		bodyModel[27].addShapeBox(-56F, -4F, -7F, 4, 3, 4, 0F,-1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F, -1.5F, -1.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -1F, 0F); // Box 35
		bodyModel[27].setRotationPoint(0F, -13F, 0F);

		bodyModel[28].addShapeBox(-56F, -7F, -7F, 4, 3, 4, 0F,-1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, .3F, 0F, 0F); // Box 36
		bodyModel[28].setRotationPoint(0F, -13F, 0F);

		bodyModel[29].addShapeBox(-56F, -11F, -7F, 4, 4, 4, 0F,-4F, 0F, -2F, 0F, 0F, -2F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[29].setRotationPoint(0F, -13F, 0F);

		bodyModel[30].addShapeBox(-49F, -17F, -7F, 2, 2, 4, 0F,-3F, 0F, -2.5F, 1F, 0F, -2.5F, 0F, 0F, 0F, -2F, 0F, 0F, -.5F, 0F, -2F, .5F, 0F, -1.2F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 38
		bodyModel[30].setRotationPoint(0F, -13F, 0F);

		bodyModel[31].addShapeBox(-51F, -15F, -7F, 4, 2, 4, 0F,-2.5F, 0F, -2F, .5F, 0F, -1.2F, 0F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(0F, -13F, 0F);

		bodyModel[32].addShapeBox(-53F, -13F, -7F, 6, 2, 4, 0F,-2.5F, 0F, -2F, 0F, 0F, -.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 40
		bodyModel[32].setRotationPoint(0F, -13F, 0F);

		bodyModel[33].addShapeBox(-11F, -2F, -7F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[33].setRotationPoint(0F, -13F, 0F);

		bodyModel[34].addShapeBox(-52F, -11F, -7F, 5, 4, 1, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 42
		bodyModel[34].setRotationPoint(0F, -13F, 0F);

		bodyModel[35].addShapeBox(-47F, -11F, -7F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[35].setRotationPoint(0F, -13F, 0F);

		bodyModel[36].addShapeBox(-52F, -11F, -7F, 5, 4, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[36].setRotationPoint(0F, -13F, 0F);

		bodyModel[37].addShapeBox(-47F, -18F, -5F, 6, 1, 2, 0F,-3F, -.2F, -1.5F, -1F, -.2F, -1.5F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[37].setRotationPoint(0F, -13F, 0F);

		bodyModel[38].addShapeBox(-49F, -17F, -3F, 2, 2, 1, 0F,-2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -.25F, -2F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, -.25F, .5F, 0F, 0F); // Box 47
		bodyModel[38].setRotationPoint(0F, -13F, 0F);

		bodyModel[39].addShapeBox(-47F, -18F, -3F, 5, 1, 2, 0F,-2F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, -1F); // Box 48
		bodyModel[39].setRotationPoint(0F, -13F, 0F);

		bodyModel[40].addShapeBox(-52F, -11F, -3F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[40].setRotationPoint(0F, -13F, 0F);

		bodyModel[41].addShapeBox(-53F, -13F, 1F, 6, 2, 2, 0F,-1.5F, 0F, -0.5F, 0F, 0F, -0.7F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 50
		bodyModel[41].setRotationPoint(0F, -13F, 0F);

		bodyModel[42].addShapeBox(-51F, -15F, 2F, 4, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0.5F, 0F, 0.5F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 51
		bodyModel[42].setRotationPoint(0F, -13F, 0F);

		bodyModel[43].addShapeBox(-49F, -17F, 2F, 2, 2, 1, 0F,-2F, 0F, 0F, 1F, 0F, -0.25F, 1F, 0F, 0F, -2F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 52
		bodyModel[43].setRotationPoint(0F, -13F, 0F);

		bodyModel[44].addShapeBox(-47F, -18F, 1F, 5, 1, 2, 0F,-2F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -1F, -0.5F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[44].setRotationPoint(0F, -13F, 0F);

		bodyModel[45].addShapeBox(-11F, -11F, -5F, 6, 11, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[45].setRotationPoint(0F, -13F, 0F);

		bodyModel[46].addShapeBox(-25F, -11F, -6F, 1, 9, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[46].setRotationPoint(0F, -13F, 0F);

		bodyModel[47].addShapeBox(-25F, -20F, 3F, 14, 3, 3, 0F,-1F, 0F, 0.5F, 0F, -1F, 0F, 0F, -1.5F, -1.5F, -1F, -0.8F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[47].setRotationPoint(0F, -13F, 0F);

		bodyModel[48].addShapeBox(-11F, -19F, 3F, 6, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[48].setRotationPoint(0F, -13F, 0F);

		bodyModel[49].addShapeBox(-42F, -2F, 0F, 31, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[49].setRotationPoint(0F, -13F, 0F);

		bodyModel[50].addShapeBox(-52F, -2F, 0F, 10, 2, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Box 4
		bodyModel[50].setRotationPoint(0F, -13F, 0F);

		bodyModel[51].addShapeBox(-11F, -2F, 5F, 11, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[51].setRotationPoint(0F, -13F, 0F);

		bodyModel[52].addShapeBox(-5F, -11F, 5F, 5, 9, 2, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[52].setRotationPoint(0F, -13F, 0F);

		bodyModel[53].addShapeBox(-42F, -11F, 6F, 37, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[53].setRotationPoint(0F, -13F, 0F);

		bodyModel[54].addShapeBox(-28F, -17F, 6F, 3, 3, 1, 0F,0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[54].setRotationPoint(0F, -13F, 0F);

		bodyModel[55].addShapeBox(-28F, -14F, 6F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[55].setRotationPoint(0F, -13F, 0F);

		bodyModel[56].addShapeBox(-31F, -14F, 6F, 3, 3, 1, 0F,0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[56].setRotationPoint(0F, -13F, 0F);

		bodyModel[57].addShapeBox(-33F, -12F, 6F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[57].setRotationPoint(0F, -13F, 0F);

		bodyModel[58].addShapeBox(-36F, -13F, 6F, 3, 2, 1, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[58].setRotationPoint(0F, -13F, 0F);

		bodyModel[59].addShapeBox(-56F, -11F, 3F, 4, 4, 4, 0F,-2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F); // Box 16
		bodyModel[59].setRotationPoint(0F, -13F, 0F);

		bodyModel[60].addShapeBox(-56F, -7F, 3F, 4, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -2F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F); // Box 17
		bodyModel[60].setRotationPoint(0F, -13F, 0F);

		bodyModel[61].addShapeBox(-56F, -4F, 3F, 4, 3, 4, 0F,0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -1.5F, -1.5F); // Box 18
		bodyModel[61].setRotationPoint(0F, -13F, 0F);

		bodyModel[62].addShapeBox(-52F, -7F, 6F, 10, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[62].setRotationPoint(0F, -13F, 0F);

		bodyModel[63].addShapeBox(-47F, -11F, 6F, 5, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 20
		bodyModel[63].setRotationPoint(0F, -13F, 0F);

		bodyModel[64].addShapeBox(-52F, -11F, 6F, 5, 4, 1, 0F,0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 21
		bodyModel[64].setRotationPoint(0F, -13F, 0F);

		bodyModel[65].addShapeBox(-52F, -11F, 6F, 5, 4, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[65].setRotationPoint(0F, -13F, 0F);

		bodyModel[66].addShapeBox(-53F, -13F, 3F, 6, 2, 4, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -2F); // Box 23
		bodyModel[66].setRotationPoint(0F, -13F, 0F);

		bodyModel[67].addShapeBox(-51F, -15F, 3F, 4, 2, 4, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.2F, -2.5F, 0F, -2F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -2F); // Box 24
		bodyModel[67].setRotationPoint(0F, -13F, 0F);

		bodyModel[68].addShapeBox(-49F, -17F, 3F, 2, 2, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2.5F, -3F, 0F, -2.5F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, -1.2F, -0.5F, 0F, -2F); // Box 25
		bodyModel[68].setRotationPoint(0F, -13F, 0F);

		bodyModel[69].addShapeBox(-47F, -18F, 3F, 6, 1, 2, 0F,-2F, 0F, 0F, -1F, 0F, 0F, -1F, -0.2F, -1.5F, -3F, -0.2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F); // Box 26
		bodyModel[69].setRotationPoint(0F, -13F, 0F);

		bodyModel[70].addShapeBox(-47F, -17F, 6F, 8, 2, 1, 0F,0F, 0F, 3F, -2F, 0F, 3F, -2F, 0F, -2.5F, -1F, 0F, -2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -0.5F, 0F, -1.2F); // Box 27
		bodyModel[70].setRotationPoint(0F, -13F, 0F);

		bodyModel[71].addShapeBox(-47F, -15F, 6F, 11, 2, 1, 0F,-0.5F, 0F, 1F, -3F, 0F, 1F, -3F, 0F, -1F, -0.5F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 28
		bodyModel[71].setRotationPoint(0F, -13F, 0F);

		bodyModel[72].addShapeBox(-47F, -13F, 6F, 11, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 29
		bodyModel[72].setRotationPoint(0F, -13F, 0F);

		bodyModel[73].addShapeBox(-5F, -17F, 1F, 3, 10, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.3F, 0F, -.5F, -.5F); // Box 30
		bodyModel[73].setRotationPoint(0F, -13F, 0F);

		bodyModel[74].addShapeBox(-5F, -16F, 3F, 3, 8, 1, 0F,0F, .5F, .3F, 0F, .5F, .3F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, .5F, .3F, 0F, .5F, .3F, 0F, -.7F, 0F, 0F, -.7F, 0F); // Box 31
		bodyModel[74].setRotationPoint(0F, -13F, 0F);

		bodyModel[75].addShapeBox(-5F, -14F, 4F, 3, 4, 1, 0F,0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 33
		bodyModel[75].setRotationPoint(0F, -13F, 0F);

		bodyModel[76].addShapeBox(-5F, -17F, -3F, 3, 10, 2, 0F,0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyModel[76].setRotationPoint(0F, -13F, 0F);

		bodyModel[77].addShapeBox(-5F, -16F, -4F, 3, 8, 1, 0F,0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F); // Box 37
		bodyModel[77].setRotationPoint(0F, -13F, 0F);

		bodyModel[78].addShapeBox(-5F, -14F, -5F, 3, 4, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1.3F, 0F, 0F, 1.3F, 0F); // Box 38
		bodyModel[78].setRotationPoint(0F, -13F, 0F);

		bodyModel[79].addShapeBox(-10F, -0.5F, -4F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[79].setRotationPoint(8F, -25F, 0F);

		bodyModel[80].addShapeBox(-5.5F, -0.5F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[80].setRotationPoint(8F, -25F, 0F);

		bodyModel[81].addShapeBox(-10F, -1.5F, -4F, 5, 1, 8, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[81].setRotationPoint(8F, -25F, 0F);

		bodyModel[82].addShapeBox(-10F, -2.5F, -3.5F, 5, 1, 7, 0F,0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, .3F); // Box 62
		bodyModel[82].setRotationPoint(8F, -25F, 0F);

		bodyModel[83].addShapeBox(-10F, -3.5F, -3F, 5, 1, 6, 0F,0F, -.6F, -.2F, 0F, -.6F, -.2F, 0F, -.6F, -.2F, 0F, -.6F, -.2F, 0F, .3F, .4F, 0F, .3F, .4F, 0F, .3F, .4F, 0F, .3F, .4F); // Box 63
		bodyModel[83].setRotationPoint(8F, -25F, 0F);

		bodyModel[84].addShapeBox(-10F, -3.5F, -2.5F, 5, 1, 5, 0F,0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, -.4F, .3F, 0F, -.4F, .3F, 0F, -.4F, .3F, 0F, -.4F, .3F); // Box 64
		bodyModel[84].setRotationPoint(8F, -25F, 0F);

		bodyModel[85].addShapeBox(-10F, -4.5F, 0.5F, 5, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.65F, -.2F, 0F, -.65F, -.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .6F, 0F, 0F, .6F); // Box 65
		bodyModel[85].setRotationPoint(8F, -25F, 0F);

		bodyModel[86].addShapeBox(-10F, -4.5F, -0.5F, 5, 1, 1, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[86].setRotationPoint(8F, -25F, 0F);

		bodyModel[87].addShapeBox(-10F, -4.5F, -1.5F, 5, 1, 1, 0F,0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[87].setRotationPoint(8F, -25F, 0F);

		bodyModel[88].addShapeBox(-5.5F, -1.5F, -2F, 2, 1, 4, 0F,0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[88].setRotationPoint(8F, -25F, 0F);

		bodyModel[89].addShapeBox(-5.5F, -2.5F, -1F, 2, 1, 2, 0F,0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F); // Box 70
		bodyModel[89].setRotationPoint(8F, -25F, 0F);

		bodyModel[90].addShapeBox(-3.8F, -0.5F, -2.5F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyModel[90].setRotationPoint(8F, -25F, 0F);

		bodyModel[91].addShapeBox(-3.8F, -1.5F, -2.5F, 2, 1, 5, 0F,0F, -.1F, -.4F, 0F, -.1F, -.4F, 0F, -.1F, -.4F, 0F, -.1F, -.4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81
		bodyModel[91].setRotationPoint(8F, -25F, 0F);

		bodyModel[92].addShapeBox(-3.8F, -2.5F, -2F, 2, 1, 4, 0F,0F, -.4F, -.6F, 0F, -.4F, -.6F, 0F, -.4F, -.6F, 0F, -.4F, -.6F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F, 0F, .1F, .1F); // Box 82
		bodyModel[92].setRotationPoint(8F, -25F, 0F);

		bodyModel[93].addShapeBox(-3.8F, -3F, -1.5F, 2, 1, 3, 0F,0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.5F, -1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F, 0F, -.1F, -.1F); // Box 83
		bodyModel[93].setRotationPoint(8F, -25F, 0F);

		bodyModel[94].addShapeBox(-7.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 91
		bodyModel[94].setRotationPoint(8F, -25F, 0F);

		bodyModel[95].addShapeBox(-6.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F, 0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F); // Box 92
		bodyModel[95].setRotationPoint(8F, -25F, 0F);

		bodyModel[96].addShapeBox(-6.5F, -11.5F, -0.5F, 1, 10, 1, 0F,-0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F, -0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F); // Box 93
		bodyModel[96].setRotationPoint(8F, -25F, 0F);

		bodyModel[97].addShapeBox(-8.5F, -11.5F, -1.5F, 1, 10, 3, 0F,-0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F, -0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F); // Box 94
		bodyModel[97].setRotationPoint(8F, -25F, 0F);

		bodyModel[98].addShapeBox(-8.5F, -11.5F, -0.5F, 1, 10, 1, 0F,0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F); // Box 95
		bodyModel[98].setRotationPoint(8F, -25F, 0F);

		bodyModel[99].addShapeBox(-7.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 96
		bodyModel[99].setRotationPoint(8F, -25F, 0F);

		bodyModel[100].addShapeBox(-6.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F); // Box 97
		bodyModel[100].setRotationPoint(8F, -25F, 0F);

		bodyModel[101].addShapeBox(-8.5F, -9F, -1.5F, 1, 6, 3, 0F,-0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F); // Box 98
		bodyModel[101].setRotationPoint(8F, -25F, 0F);

		bodyModel[102].addShapeBox(-6.5F, -10F, -0.5F, 2, 1, 1, 0F,0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F, .8F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, .8F, -.3F, -.2F); // Box 100
		bodyModel[102].setRotationPoint(8F, -25F, 0F);

		bodyModel[103].addShapeBox(-4.8F, -10F, -0.5F, 1, 8, 1, 0F,0F, 0F, -.2F, -.3F, -1F, -.2F, -.3F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F); // Box 101
		bodyModel[103].setRotationPoint(8F, -25F, 0F);

		bodyModel[104].addShapeBox(-7.5F, -9.3F, -0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 102
		bodyModel[104].setRotationPoint(8F, -25F, 0F);

		bodyModel[105].addShapeBox(-1.8F, -2.5F, -1F, 2, 1, 2, 0F,0F, -.5F, -.5F, 0F, -1.5F, -.5F, 0F, -1.5F, -.5F, 0F, -.5F, -.5F, 0F, .1F, .5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, .1F, .5F); // Box 103
		bodyModel[105].setRotationPoint(8F, -25F, 0F);

		bodyModel[106].addShapeBox(-1.8F, -1.5F, -2F, 2, 1, 4, 0F,0F, -.1F, -.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -.1F, -.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 104
		bodyModel[106].setRotationPoint(8F, -25F, 0F);

		bodyModel[107].addShapeBox(-1.8F, -0.5F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 105
		bodyModel[107].setRotationPoint(8F, -25F, 0F);

		bodyModel[108].addShapeBox(-10F, 0.5F, -4F, 5, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 106
		bodyModel[108].setRotationPoint(8F, -25F, 0F);

		bodyModel[109].addShapeBox(-10F, 1.5F, -3.5F, 5, 1, 7, 0F,0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.1F); // Box 107
		bodyModel[109].setRotationPoint(8F, -25F, 0F);

		bodyModel[110].addShapeBox(-10F, 2.5F, -3F, 5, 1, 6, 0F,0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, 0.3F, 0.4F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F); // Box 108
		bodyModel[110].setRotationPoint(8F, -25F, 0F);

		bodyModel[111].addShapeBox(-10F, 2.5F, -2.5F, 5, 1, 5, 0F,0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, -0.4F, 0.3F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 109
		bodyModel[111].setRotationPoint(8F, -25F, 0F);

		bodyModel[112].addShapeBox(-10F, 3.5F, 0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F); // Box 110
		bodyModel[112].setRotationPoint(8F, -25F, 0F);

		bodyModel[113].addShapeBox(-10F, 3.5F, -1.5F, 5, 1, 1, 0F,0F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.65F, -0.2F, 0F, -0.65F, -0.2F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 111
		bodyModel[113].setRotationPoint(8F, -25F, 0F);

		bodyModel[114].addShapeBox(-10F, 3.5F, -0.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 112
		bodyModel[114].setRotationPoint(8F, -25F, 0F);

		bodyModel[115].addShapeBox(-5.5F, 0.5F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 113
		bodyModel[115].setRotationPoint(8F, -25F, 0F);

		bodyModel[116].addShapeBox(-5.5F, 1.5F, -1F, 2, 1, 2, 0F,0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 114
		bodyModel[116].setRotationPoint(8F, -25F, 0F);

		bodyModel[117].addShapeBox(-3.8F, 0.5F, -2.5F, 2, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F); // Box 115
		bodyModel[117].setRotationPoint(8F, -25F, 0F);

		bodyModel[118].addShapeBox(-3.8F, 1.5F, -2F, 2, 1, 4, 0F,0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F, 0F, -0.4F, -0.6F); // Box 116
		bodyModel[118].setRotationPoint(8F, -25F, 0F);

		bodyModel[119].addShapeBox(-3.8F, 2F, -1.5F, 2, 1, 3, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Box 117
		bodyModel[119].setRotationPoint(8F, -25F, 0F);

		bodyModel[120].addShapeBox(-4.8F, -10F, -0.5F, 1, 8, 1, 0F,0F, 0F, -.2F, -.3F, -1F, -.2F, -.3F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F); // Box 196
		bodyModel[120].setRotationPoint(8F, -25F, 0F);
		bodyModel[120].rotateAngleX = 0.71558499F;

		bodyModel[121].addShapeBox(-6.5F, -10F, -0.5F, 2, 1, 1, 0F,0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F, .8F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, .8F, -.3F, -.2F); // Box 197
		bodyModel[121].setRotationPoint(8F, -25F, 0F);
		bodyModel[121].rotateAngleX = 0.71558499F;

		bodyModel[122].addShapeBox(-7.5F, -9.3F, -0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 198
		bodyModel[122].setRotationPoint(8F, -25F, 0F);
		bodyModel[122].rotateAngleX = 0.71558499F;

		bodyModel[123].addShapeBox(-8.5F, -9F, -1.5F, 1, 6, 3, 0F,-0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F); // Box 199
		bodyModel[123].setRotationPoint(8F, -25F, 0F);
		bodyModel[123].rotateAngleX = 0.71558499F;

		bodyModel[124].addShapeBox(-7.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 200
		bodyModel[124].setRotationPoint(8F, -25F, 0F);
		bodyModel[124].rotateAngleX = 0.71558499F;

		bodyModel[125].addShapeBox(-6.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F); // Box 201
		bodyModel[125].setRotationPoint(8F, -25F, 0F);
		bodyModel[125].rotateAngleX = 0.71558499F;

		bodyModel[126].addShapeBox(-6.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F, 0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F); // Box 202
		bodyModel[126].setRotationPoint(8F, -25F, 0F);
		bodyModel[126].rotateAngleX = 0.71558499F;

		bodyModel[127].addShapeBox(-6.5F, -11.5F, -0.5F, 1, 10, 1, 0F,-0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F, -0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F); // Box 203
		bodyModel[127].setRotationPoint(8F, -25F, 0F);
		bodyModel[127].rotateAngleX = 0.71558499F;

		bodyModel[128].addShapeBox(-7.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 204
		bodyModel[128].setRotationPoint(8F, -25F, 0F);
		bodyModel[128].rotateAngleX = 0.71558499F;

		bodyModel[129].addShapeBox(-8.5F, -11.5F, -1.5F, 1, 10, 3, 0F,-0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F, -0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F); // Box 205
		bodyModel[129].setRotationPoint(8F, -25F, 0F);
		bodyModel[129].rotateAngleX = 0.71558499F;

		bodyModel[130].addShapeBox(-8.5F, -11.5F, -0.5F, 1, 10, 1, 0F,0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F); // Box 206
		bodyModel[130].setRotationPoint(8F, -25F, 0F);
		bodyModel[130].rotateAngleX = 0.71558499F;

		bodyModel[131].addShapeBox(-4.8F, -10F, -0.5F, 1, 8, 1, 0F,0F, 0F, -.2F, -.3F, -1F, -.2F, -.3F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F); // Box 207
		bodyModel[131].setRotationPoint(8F, -25F, 0F);
		bodyModel[131].rotateAngleX = 1.43116999F;

		bodyModel[132].addShapeBox(-6.5F, -10F, -0.5F, 2, 1, 1, 0F,0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F, .8F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, .8F, -.3F, -.2F); // Box 208
		bodyModel[132].setRotationPoint(8F, -25F, 0F);
		bodyModel[132].rotateAngleX = 1.43116999F;

		bodyModel[133].addShapeBox(-7.5F, -9.3F, -0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 209
		bodyModel[133].setRotationPoint(8F, -25F, 0F);
		bodyModel[133].rotateAngleX = 1.43116999F;

		bodyModel[134].addShapeBox(-8.5F, -9F, -1.5F, 1, 6, 3, 0F,-0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F); // Box 210
		bodyModel[134].setRotationPoint(8F, -25F, 0F);
		bodyModel[134].rotateAngleX = 1.43116999F;

		bodyModel[135].addShapeBox(-7.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 211
		bodyModel[135].setRotationPoint(8F, -25F, 0F);
		bodyModel[135].rotateAngleX = 1.43116999F;

		bodyModel[136].addShapeBox(-6.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F); // Box 212
		bodyModel[136].setRotationPoint(8F, -25F, 0F);
		bodyModel[136].rotateAngleX = 1.43116999F;

		bodyModel[137].addShapeBox(-6.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F, 0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F); // Box 213
		bodyModel[137].setRotationPoint(8F, -25F, 0F);
		bodyModel[137].rotateAngleX = 1.43116999F;

		bodyModel[138].addShapeBox(-6.5F, -11.5F, -0.5F, 1, 10, 1, 0F,-0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F, -0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F); // Box 214
		bodyModel[138].setRotationPoint(8F, -25F, 0F);
		bodyModel[138].rotateAngleX = 1.43116999F;

		bodyModel[139].addShapeBox(-7.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 215
		bodyModel[139].setRotationPoint(8F, -25F, 0F);
		bodyModel[139].rotateAngleX = 1.43116999F;

		bodyModel[140].addShapeBox(-8.5F, -11.5F, -1.5F, 1, 10, 3, 0F,-0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F, -0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F); // Box 216
		bodyModel[140].setRotationPoint(8F, -25F, 0F);
		bodyModel[140].rotateAngleX = 1.43116999F;

		bodyModel[141].addShapeBox(-8.5F, -11.5F, -0.5F, 1, 10, 1, 0F,0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F); // Box 217
		bodyModel[141].setRotationPoint(8F, -25F, 0F);
		bodyModel[141].rotateAngleX = 1.43116999F;

		bodyModel[142].addShapeBox(-4.8F, -10F, -0.5F, 1, 8, 1, 0F,0F, 0F, -.2F, -.3F, -1F, -.2F, -.3F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F); // Box 218
		bodyModel[142].setRotationPoint(8F, -25F, 0F);
		bodyModel[142].rotateAngleX = 2.11184839F;

		bodyModel[143].addShapeBox(-6.5F, -10F, -0.5F, 2, 1, 1, 0F,0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F, .8F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, .8F, -.3F, -.2F); // Box 219
		bodyModel[143].setRotationPoint(8F, -25F, 0F);
		bodyModel[143].rotateAngleX = 2.11184839F;

		bodyModel[144].addShapeBox(-7.5F, -9.3F, -0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 220
		bodyModel[144].setRotationPoint(8F, -25F, 0F);
		bodyModel[144].rotateAngleX = 2.11184839F;

		bodyModel[145].addShapeBox(-8.5F, -9F, -1.5F, 1, 6, 3, 0F,-0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F); // Box 221
		bodyModel[145].setRotationPoint(8F, -25F, 0F);
		bodyModel[145].rotateAngleX = 2.11184839F;

		bodyModel[146].addShapeBox(-7.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 222
		bodyModel[146].setRotationPoint(8F, -25F, 0F);
		bodyModel[146].rotateAngleX = 2.11184839F;

		bodyModel[147].addShapeBox(-6.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F); // Box 223
		bodyModel[147].setRotationPoint(8F, -25F, 0F);
		bodyModel[147].rotateAngleX = 2.11184839F;

		bodyModel[148].addShapeBox(-6.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F, 0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F); // Box 224
		bodyModel[148].setRotationPoint(8F, -25F, 0F);
		bodyModel[148].rotateAngleX = 2.11184839F;

		bodyModel[149].addShapeBox(-6.5F, -11.5F, -0.5F, 1, 10, 1, 0F,-0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F, -0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F); // Box 225
		bodyModel[149].setRotationPoint(8F, -25F, 0F);
		bodyModel[149].rotateAngleX = 2.11184839F;

		bodyModel[150].addShapeBox(-7.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 226
		bodyModel[150].setRotationPoint(8F, -25F, 0F);
		bodyModel[150].rotateAngleX = 2.11184839F;

		bodyModel[151].addShapeBox(-8.5F, -11.5F, -1.5F, 1, 10, 3, 0F,-0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F, -0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F); // Box 227
		bodyModel[151].setRotationPoint(8F, -25F, 0F);
		bodyModel[151].rotateAngleX = 2.11184839F;

		bodyModel[152].addShapeBox(-8.5F, -11.5F, -0.5F, 1, 10, 1, 0F,0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F); // Box 228
		bodyModel[152].setRotationPoint(8F, -25F, 0F);
		bodyModel[152].rotateAngleX = 2.11184839F;

		bodyModel[153].addShapeBox(-4.8F, -10F, -0.5F, 1, 8, 1, 0F,0F, 0F, -.2F, -.3F, -1F, -.2F, -.3F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F); // Box 229
		bodyModel[153].setRotationPoint(8F, -25F, 0F);
		bodyModel[153].rotateAngleX = 2.7925268F;

		bodyModel[154].addShapeBox(-6.5F, -10F, -0.5F, 2, 1, 1, 0F,0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F, .8F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, .8F, -.3F, -.2F); // Box 230
		bodyModel[154].setRotationPoint(8F, -25F, 0F);
		bodyModel[154].rotateAngleX = 2.7925268F;

		bodyModel[155].addShapeBox(-7.5F, -9.3F, -0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 231
		bodyModel[155].setRotationPoint(8F, -25F, 0F);
		bodyModel[155].rotateAngleX = 2.7925268F;

		bodyModel[156].addShapeBox(-8.5F, -9F, -1.5F, 1, 6, 3, 0F,-0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F); // Box 232
		bodyModel[156].setRotationPoint(8F, -25F, 0F);
		bodyModel[156].rotateAngleX = 2.7925268F;

		bodyModel[157].addShapeBox(-7.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 233
		bodyModel[157].setRotationPoint(8F, -25F, 0F);
		bodyModel[157].rotateAngleX = 2.7925268F;

		bodyModel[158].addShapeBox(-6.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F); // Box 234
		bodyModel[158].setRotationPoint(8F, -25F, 0F);
		bodyModel[158].rotateAngleX = 2.7925268F;

		bodyModel[159].addShapeBox(-6.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F, 0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F); // Box 235
		bodyModel[159].setRotationPoint(8F, -25F, 0F);
		bodyModel[159].rotateAngleX = 2.7925268F;

		bodyModel[160].addShapeBox(-6.5F, -11.5F, -0.5F, 1, 10, 1, 0F,-0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F, -0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F); // Box 236
		bodyModel[160].setRotationPoint(8F, -25F, 0F);
		bodyModel[160].rotateAngleX = 2.7925268F;

		bodyModel[161].addShapeBox(-7.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 237
		bodyModel[161].setRotationPoint(8F, -25F, 0F);
		bodyModel[161].rotateAngleX = 2.7925268F;

		bodyModel[162].addShapeBox(-8.5F, -11.5F, -1.5F, 1, 10, 3, 0F,-0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F, -0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F); // Box 238
		bodyModel[162].setRotationPoint(8F, -25F, 0F);
		bodyModel[162].rotateAngleX = 2.7925268F;

		bodyModel[163].addShapeBox(-8.5F, -11.5F, -0.5F, 1, 10, 1, 0F,0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F); // Box 239
		bodyModel[163].setRotationPoint(8F, -25F, 0F);
		bodyModel[163].rotateAngleX = 2.7925268F;

		bodyModel[164].addShapeBox(-4.8F, -10F, -0.5F, 1, 8, 1, 0F,0F, 0F, -.2F, -.3F, -1F, -.2F, -.3F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F); // Box 240
		bodyModel[164].setRotationPoint(8F, -25F, 0F);
		bodyModel[164].rotateAngleX = 3.5081118F;

		bodyModel[165].addShapeBox(-6.5F, -10F, -0.5F, 2, 1, 1, 0F,0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F, .8F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, .8F, -.3F, -.2F); // Box 241
		bodyModel[165].setRotationPoint(8F, -25F, 0F);
		bodyModel[165].rotateAngleX = 3.5081118F;

		bodyModel[166].addShapeBox(-7.5F, -9.3F, -0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 242
		bodyModel[166].setRotationPoint(8F, -25F, 0F);
		bodyModel[166].rotateAngleX = 3.5081118F;

		bodyModel[167].addShapeBox(-8.5F, -9F, -1.5F, 1, 6, 3, 0F,-0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F); // Box 243
		bodyModel[167].setRotationPoint(8F, -25F, 0F);
		bodyModel[167].rotateAngleX = 3.5081118F;

		bodyModel[168].addShapeBox(-7.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 244
		bodyModel[168].setRotationPoint(8F, -25F, 0F);
		bodyModel[168].rotateAngleX = 3.5081118F;

		bodyModel[169].addShapeBox(-6.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F); // Box 245
		bodyModel[169].setRotationPoint(8F, -25F, 0F);
		bodyModel[169].rotateAngleX = 3.5081118F;

		bodyModel[170].addShapeBox(-6.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F, 0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F); // Box 246
		bodyModel[170].setRotationPoint(8F, -25F, 0F);
		bodyModel[170].rotateAngleX = 3.5081118F;

		bodyModel[171].addShapeBox(-6.5F, -11.5F, -0.5F, 1, 10, 1, 0F,-0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F, -0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F); // Box 247
		bodyModel[171].setRotationPoint(8F, -25F, 0F);
		bodyModel[171].rotateAngleX = 3.5081118F;

		bodyModel[172].addShapeBox(-7.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 248
		bodyModel[172].setRotationPoint(8F, -25F, 0F);
		bodyModel[172].rotateAngleX = 3.5081118F;

		bodyModel[173].addShapeBox(-8.5F, -11.5F, -1.5F, 1, 10, 3, 0F,-0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F, -0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F); // Box 249
		bodyModel[173].setRotationPoint(8F, -25F, 0F);
		bodyModel[173].rotateAngleX = 3.5081118F;

		bodyModel[174].addShapeBox(-8.5F, -11.5F, -0.5F, 1, 10, 1, 0F,0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F); // Box 250
		bodyModel[174].setRotationPoint(8F, -25F, 0F);
		bodyModel[174].rotateAngleX = 3.5081118F;

		bodyModel[175].addShapeBox(-4.8F, -10F, -0.5F, 1, 8, 1, 0F,0F, 0F, -.2F, -.3F, -1F, -.2F, -.3F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F); // Box 251
		bodyModel[175].setRotationPoint(8F, -25F, 0F);
		bodyModel[175].rotateAngleX = 4.22369679F;

		bodyModel[176].addShapeBox(-6.5F, -10F, -0.5F, 2, 1, 1, 0F,0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F, .8F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, .8F, -.3F, -.2F); // Box 252
		bodyModel[176].setRotationPoint(8F, -25F, 0F);
		bodyModel[176].rotateAngleX = 4.22369679F;

		bodyModel[177].addShapeBox(-7.5F, -9.3F, -0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 253
		bodyModel[177].setRotationPoint(8F, -25F, 0F);
		bodyModel[177].rotateAngleX = 4.22369679F;

		bodyModel[178].addShapeBox(-8.5F, -9F, -1.5F, 1, 6, 3, 0F,-0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F); // Box 254
		bodyModel[178].setRotationPoint(8F, -25F, 0F);
		bodyModel[178].rotateAngleX = 4.22369679F;

		bodyModel[179].addShapeBox(-7.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 255
		bodyModel[179].setRotationPoint(8F, -25F, 0F);
		bodyModel[179].rotateAngleX = 4.22369679F;

		bodyModel[180].addShapeBox(-6.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F); // Box 256
		bodyModel[180].setRotationPoint(8F, -25F, 0F);
		bodyModel[180].rotateAngleX = 4.22369679F;

		bodyModel[181].addShapeBox(-6.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F, 0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F); // Box 257
		bodyModel[181].setRotationPoint(8F, -25F, 0F);
		bodyModel[181].rotateAngleX = 4.22369679F;

		bodyModel[182].addShapeBox(-6.5F, -11.5F, -0.5F, 1, 10, 1, 0F,-0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F, -0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F); // Box 258
		bodyModel[182].setRotationPoint(8F, -25F, 0F);
		bodyModel[182].rotateAngleX = 4.22369679F;

		bodyModel[183].addShapeBox(-7.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 259
		bodyModel[183].setRotationPoint(8F, -25F, 0F);
		bodyModel[183].rotateAngleX = 4.22369679F;

		bodyModel[184].addShapeBox(-8.5F, -11.5F, -1.5F, 1, 10, 3, 0F,-0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F, -0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F); // Box 260
		bodyModel[184].setRotationPoint(8F, -25F, 0F);
		bodyModel[184].rotateAngleX = 4.22369679F;

		bodyModel[185].addShapeBox(-8.5F, -11.5F, -0.5F, 1, 10, 1, 0F,0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F); // Box 261
		bodyModel[185].setRotationPoint(8F, -25F, 0F);
		bodyModel[185].rotateAngleX = 4.22369679F;

		bodyModel[186].addShapeBox(-4.8F, -10F, -0.5F, 1, 8, 1, 0F,0F, 0F, -.2F, -.3F, -1F, -.2F, -.3F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F); // Box 262
		bodyModel[186].setRotationPoint(8F, -25F, 0F);
		bodyModel[186].rotateAngleX = 5.56760031F;

		bodyModel[187].addShapeBox(-6.5F, -10F, -0.5F, 2, 1, 1, 0F,0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F, .8F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, .8F, -.3F, -.2F); // Box 263
		bodyModel[187].setRotationPoint(8F, -25F, 0F);
		bodyModel[187].rotateAngleX = 5.56760031F;

		bodyModel[188].addShapeBox(-7.5F, -9.3F, -0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 264
		bodyModel[188].setRotationPoint(8F, -25F, 0F);
		bodyModel[188].rotateAngleX = 5.56760031F;

		bodyModel[189].addShapeBox(-8.5F, -9F, -1.5F, 1, 6, 3, 0F,-0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F); // Box 265
		bodyModel[189].setRotationPoint(8F, -25F, 0F);
		bodyModel[189].rotateAngleX = 5.56760031F;

		bodyModel[190].addShapeBox(-7.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 266
		bodyModel[190].setRotationPoint(8F, -25F, 0F);
		bodyModel[190].rotateAngleX = 5.56760031F;

		bodyModel[191].addShapeBox(-6.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F); // Box 267
		bodyModel[191].setRotationPoint(8F, -25F, 0F);
		bodyModel[191].rotateAngleX = 5.56760031F;

		bodyModel[192].addShapeBox(-6.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F, 0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F); // Box 268
		bodyModel[192].setRotationPoint(8F, -25F, 0F);
		bodyModel[192].rotateAngleX = 5.56760031F;

		bodyModel[193].addShapeBox(-6.5F, -11.5F, -0.5F, 1, 10, 1, 0F,-0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F, -0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F); // Box 269
		bodyModel[193].setRotationPoint(8F, -25F, 0F);
		bodyModel[193].rotateAngleX = 5.56760031F;

		bodyModel[194].addShapeBox(-7.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 270
		bodyModel[194].setRotationPoint(8F, -25F, 0F);
		bodyModel[194].rotateAngleX = 5.56760031F;

		bodyModel[195].addShapeBox(-8.5F, -11.5F, -1.5F, 1, 10, 3, 0F,-0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F, -0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F); // Box 271
		bodyModel[195].setRotationPoint(8F, -25F, 0F);
		bodyModel[195].rotateAngleX = 5.56760031F;

		bodyModel[196].addShapeBox(-8.5F, -11.5F, -0.5F, 1, 10, 1, 0F,0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F); // Box 272
		bodyModel[196].setRotationPoint(8F, -25F, 0F);
		bodyModel[196].rotateAngleX = 5.56760031F;

		bodyModel[197].addShapeBox(-4.8F, -10F, -0.5F, 1, 8, 1, 0F,0F, 0F, -.2F, -.3F, -1F, -.2F, -.3F, -1F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F); // Box 273
		bodyModel[197].setRotationPoint(8F, -25F, 0F);
		bodyModel[197].rotateAngleX = 4.9043752F;

		bodyModel[198].addShapeBox(-6.5F, -10F, -0.5F, 2, 1, 1, 0F,0F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, 0F, 0F, -.2F, .8F, -.3F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, -.2F, .8F, -.3F, -.2F); // Box 274
		bodyModel[198].setRotationPoint(8F, -25F, 0F);
		bodyModel[198].rotateAngleX = 4.9043752F;

		bodyModel[199].addShapeBox(-7.5F, -9.3F, -0.5F, 1, 1, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 275
		bodyModel[199].setRotationPoint(8F, -25F, 0F);
		bodyModel[199].rotateAngleX = 4.9043752F;

		bodyModel[200].addShapeBox(-8.5F, -9F, -1.5F, 1, 6, 3, 0F,-0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F, -0.3F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, -0.3F, 0F, -1F); // Box 276
		bodyModel[200].setRotationPoint(8F, -25F, 0F);
		bodyModel[200].rotateAngleX = 4.9043752F;

		bodyModel[201].addShapeBox(-7.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -.3F); // Box 277
		bodyModel[201].setRotationPoint(8F, -25F, 0F);
		bodyModel[201].rotateAngleX = 4.9043752F;

		bodyModel[202].addShapeBox(-6.5F, -9F, -1.5F, 1, 6, 3, 0F,0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F, 0F, 0F, -.3F, -.3F, 0F, -1F, -.3F, 0F, -1F, 0F, 0F, -.3F); // Box 278
		bodyModel[202].setRotationPoint(8F, -25F, 0F);
		bodyModel[202].rotateAngleX = 4.9043752F;

		bodyModel[203].addShapeBox(-6.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F, 0F, -3F, 0F, -.5F, -3F, -.3F, -.5F, -3F, -.3F, 0F, -3F, 0F); // Box 279
		bodyModel[203].setRotationPoint(8F, -25F, 0F);
		bodyModel[203].rotateAngleX = 4.9043752F;

		bodyModel[204].addShapeBox(-6.5F, -11.5F, -0.5F, 1, 10, 1, 0F,-0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F, -0.5F, -3F, .7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, .7F); // Box 280
		bodyModel[204].setRotationPoint(8F, -25F, 0F);
		bodyModel[204].rotateAngleX = 4.9043752F;

		bodyModel[205].addShapeBox(-7.5F, -11.5F, -1.5F, 1, 10, 3, 0F,0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F); // Box 281
		bodyModel[205].setRotationPoint(8F, -25F, 0F);
		bodyModel[205].rotateAngleX = 4.9043752F;

		bodyModel[206].addShapeBox(-8.5F, -11.5F, -1.5F, 1, 10, 3, 0F,-0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F, -0.5F, -3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, -0.3F); // Box 282
		bodyModel[206].setRotationPoint(8F, -25F, 0F);
		bodyModel[206].rotateAngleX = 4.9043752F;

		bodyModel[207].addShapeBox(-8.5F, -11.5F, -0.5F, 1, 10, 1, 0F,0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F, 0F, -3F, 0F, -0.5F, -3F, 0.7F, -0.5F, -3F, 0.7F, 0F, -3F, 0F); // Box 283
		bodyModel[207].setRotationPoint(8F, -25F, 0F);
		bodyModel[207].rotateAngleX = 4.9043752F;

		bodyModel[208].addShapeBox(-0.5F, -0.5F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[208].setRotationPoint(8F, -25F, 0F);

		bodyModel[209].addShapeBox(-1.8F, 0.5F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -0.1F, -0.5F); // Box 286
		bodyModel[209].setRotationPoint(8F, -25F, 0F);

		bodyModel[210].addShapeBox(-1.8F, 1.5F, -1F, 2, 1, 2, 0F,0F, 0.1F, 0.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.1F, 0.5F, 0F, -0.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 287
		bodyModel[210].setRotationPoint(8F, -25F, 0F);

		bodyModel[211].addShapeBox(-17F, 1F, -7F, 5, 1, 14, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 301
		bodyModel[211].setRotationPoint(0F, -13F, 0F);

		bodyModel[212].addShapeBox(-12F, 0F, -7F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 302
		bodyModel[212].setRotationPoint(0F, -13F, 0F);

		bodyModel[213].addShapeBox(-17F, -27F, -7F, 5, 1, 14, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 346
		bodyModel[213].setRotationPoint(0F, -13F, 0F);

		bodyModel[214].addShapeBox(-12F, -28F, -7F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 347
		bodyModel[214].setRotationPoint(0F, -13F, 0F);

		bodyModel[215].addShapeBox(-12F, -30F, -7F, 6, 3, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[215].setRotationPoint(0F, -13F, 0F);

		bodyModel[216].addShapeBox(-17F, -30F, -7F, 5, 1, 14, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 389
		bodyModel[216].setRotationPoint(0F, -13F, 0F);

		bodyModel[217].addShapeBox(-6F, -30F, -7F, 8, 3, 14, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 390
		bodyModel[217].setRotationPoint(0F, -13F, 0F);

		bodyModel[218].addShapeBox(2F, -29.5F, -7F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 391
		bodyModel[218].setRotationPoint(0F, -13F, 0F);

		bodyModel[219].addShapeBox(-16F, -28F, -7F, 1, 14, 1, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F); // Box 392
		bodyModel[219].setRotationPoint(0F, -13F, 0F);

		bodyModel[220].addShapeBox(2.5F, -2.5F, -1F, 1, 1, 2, 0F,0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, -.5F, -.5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F, 0F, .1F, .5F); // Box 393
		bodyModel[220].setRotationPoint(8F, -25F, 0F);

		bodyModel[221].addShapeBox(2.5F, -1.5F, -2F, 1, 1, 4, 0F,0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 394
		bodyModel[221].setRotationPoint(8F, -25F, 0F);

		bodyModel[222].addShapeBox(2.5F, -0.5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 395
		bodyModel[222].setRotationPoint(8F, -25F, 0F);

		bodyModel[223].addShapeBox(-7F, -28F, -7F, 1, 14, 1, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F); // Box 398
		bodyModel[223].setRotationPoint(0F, -13F, 0F);

		bodyModel[224].addShapeBox(-7F, -28F, 6F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F); // Box 409
		bodyModel[224].setRotationPoint(0F, -13F, 0F);

		bodyModel[225].addShapeBox(-16F, -28F, 6F, 1, 14, 1, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 410
		bodyModel[225].setRotationPoint(0F, -13F, 0F);

		bodyModel[226].addShapeBox(2.5F, 0.5F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F); // Box 439
		bodyModel[226].setRotationPoint(8F, -25F, 0F);

		bodyModel[227].addShapeBox(2.5F, 1.5F, -1F, 1, 1, 2, 0F,0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, 0.1F, 0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Box 440
		bodyModel[227].setRotationPoint(8F, -25F, 0F);

		bodyModel[228].addShapeBox(-15F, -27.5F, -2F, 3, 3, 2, 0F,-1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[228].setRotationPoint(0F, -13F, 0F);

		bodyModel[229].addShapeBox(-25F, 0F, -6.5F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 11F, 8F, 0F, 11F, 8F, 0F, -11F, -8F, 0F, -11F); // Box 26
		bodyModel[229].setRotationPoint(0F, -13F, 0F);

		bodyModel[230].addShapeBox(-17F, 15F, -18F, 2, 1, 18, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 27
		bodyModel[230].setRotationPoint(0F, -13F, 0F);

		bodyModel[231].addShapeBox(-2F, 0F, -6.5F, 2, 16, 2, 0F,0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 15F, 0F, 11F, -15F, 0F, 11F, -15F, 0F, -11F, 15F, 0F, -11F); // Box 28
		bodyModel[231].setRotationPoint(0F, -13F, 0F);

		bodyModel[232].addShapeBox(-17F, 16F, -18F, 2, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 29
		bodyModel[232].setRotationPoint(0F, -13F, 0F);

		bodyModel[233].addShapeBox(-17F, 15F, 0F, 2, 1, 18, 0F,-.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[233].setRotationPoint(0F, -13F, 0F);

		bodyModel[234].addShapeBox(-17F, 16F, 0F, 2, 1, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Box 62
		bodyModel[234].setRotationPoint(0F, -13F, 0F);

		bodyModel[235].addShapeBox(-25F, 0F, 4.5F, 2, 16, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -11F, 8F, 0F, -11F, 8F, 0F, 11F, -8F, 0F, 11F); // Box 63
		bodyModel[235].setRotationPoint(0F, -13F, 0F);

		bodyModel[236].addShapeBox(-2F, 0F, 4.5F, 2, 16, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 15F, 0F, -11F, -15F, 0F, -11F, -15F, 0F, 11F, 15F, 0F, 11F); // Box 64
		bodyModel[236].setRotationPoint(0F, -13F, 0F);

		bodyModel[237].addShapeBox(-12F, -27.5F, -2F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[237].setRotationPoint(0F, -13F, 0F);

		bodyModel[238].addShapeBox(-6F, -27.5F, -2F, 6, 3, 2, 0F,0F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 97
		bodyModel[238].setRotationPoint(0F, -13F, 0F);

		bodyModel[239].addShapeBox(-6F, -24.5F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -2F, 0F, -1F, -.5F, 0F, 0F, 0F, .5F, 0F); // Box 98
		bodyModel[239].setRotationPoint(0F, -13F, 0F);

		bodyModel[240].addShapeBox(-12F, -24.5F, -2F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 99
		bodyModel[240].setRotationPoint(0F, -13F, 0F);

		bodyModel[241].addShapeBox(-15F, -24.5F, -2F, 3, 1, 2, 0F,-1F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -1F, 0F, 0F, -.5F, 0F, .5F, 0F, -.5F, 0F, 0F); // Box 100
		bodyModel[241].setRotationPoint(0F, -13F, 0F);

		bodyModel[242].addShapeBox(-12.5F, -23.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 101
		bodyModel[242].setRotationPoint(0F, -13F, 0F);

		bodyModel[243].addShapeBox(-6F, -27.5F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F); // Box 102
		bodyModel[243].setRotationPoint(0F, -13F, 0F);

		bodyModel[244].addShapeBox(-6F, -24.5F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, -0.5F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -0.5F); // Box 103
		bodyModel[244].setRotationPoint(0F, -13F, 0F);

		bodyModel[245].addShapeBox(-12F, -24.5F, 0F, 6, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Box 104
		bodyModel[245].setRotationPoint(0F, -13F, 0F);

		bodyModel[246].addShapeBox(-15F, -24.5F, 0F, 3, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -1F); // Box 105
		bodyModel[246].setRotationPoint(0F, -13F, 0F);

		bodyModel[247].addShapeBox(-12F, -27.5F, 0F, 6, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[247].setRotationPoint(0F, -13F, 0F);

		bodyModel[248].addShapeBox(-15F, -27.5F, 0F, 3, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F); // Box 107
		bodyModel[248].setRotationPoint(0F, -13F, 0F);

		bodyModel[249].addShapeBox(-39F, -2.5F, -10F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 108
		bodyModel[249].setRotationPoint(0F, -13F, 0F);

		bodyModel[250].addShapeBox(-26.8F, -29.2F, -11F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[250].setRotationPoint(0F, -13F, 0F);
		bodyModel[250].rotateAngleZ = 0.78539816F;

		bodyModel[251].addShapeBox(-39F, -11.5F, -9F, 10, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 110
		bodyModel[251].setRotationPoint(0F, -13F, 0F);

		bodyModel[252].addShapeBox(-26.8F, -33.2F, -11F, 2, 4, 1, 0F,-.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 111
		bodyModel[252].setRotationPoint(0F, -13F, 0F);
		bodyModel[252].rotateAngleZ = 0.78539816F;

		bodyModel[253].addShapeBox(-26.8F, -28.2F, -11F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 112
		bodyModel[253].setRotationPoint(0F, -13F, 0F);
		bodyModel[253].rotateAngleZ = 0.78539816F;

		bodyModel[254].addShapeBox(-39F, -8.5F, -9F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, -.5F, 0F, -.5F, -.5F, 0F); // Box 113
		bodyModel[254].setRotationPoint(0F, -13F, 0F);

		bodyModel[255].addShapeBox(-39F, -11.5F, 7F, 10, 3, 2, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 114
		bodyModel[255].setRotationPoint(0F, -13F, 0F);

		bodyModel[256].addShapeBox(-39F, -8.5F, 7F, 10, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F, -0.5F); // Box 115
		bodyModel[256].setRotationPoint(0F, -13F, 0F);

		bodyModel[257].addShapeBox(-39F, -2.5F, 7F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 116
		bodyModel[257].setRotationPoint(0F, -13F, 0F);

		bodyModel[258].addShapeBox(-26.8F, -33.2F, 10F, 2, 4, 1, 0F,-.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 117
		bodyModel[258].setRotationPoint(0F, -13F, 0F);
		bodyModel[258].rotateAngleZ = 0.78539816F;

		bodyModel[259].addShapeBox(-26.8F, -29.2F, 10F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 118
		bodyModel[259].setRotationPoint(0F, -13F, 0F);
		bodyModel[259].rotateAngleZ = 0.78539816F;

		bodyModel[260].addShapeBox(-26.8F, -28.2F, 10F, 2, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F); // Box 119
		bodyModel[260].setRotationPoint(0F, -13F, 0F);
		bodyModel[260].rotateAngleZ = 0.78539816F;

		bodyModel[261].addShapeBox(-25F, -20.8F, -2.5F, 2, 2, 5, 0F,-.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.4F, -.4F, 0F); // Box 0
		bodyModel[261].setRotationPoint(0F, -13F, 0F);

		bodyModel[262].addShapeBox(-25F, -20.8F, -4.5F, 2, 2, 2, 0F,-.4F, -1.2F, .2F, -.4F, -1.2F, .2F, -.4F, -.4F, 0F, -.4F, -.4F, 0F, -.1F, .2F, -.3F, -.6F, .2F, -.3F, -.4F, -.4F, 0F, -.4F, -.4F, 0F); // Box 1
		bodyModel[262].setRotationPoint(0F, -13F, 0F);

		bodyModel[263].addShapeBox(-25.2F, -19F, -6.5F, 2, 2, 2, 0F,-.6F, .6F, -1.8F, -.2F, .6F, -1.8F, -.4F, -.4F, .3F, -.3F, -.4F, .3F, .5F, 0F, -.3F, -1.4F, 0F, -.3F, -1.4F, 0F, -.4F, .5F, 0F, -.4F); // Box 2
		bodyModel[263].setRotationPoint(0F, -13F, 0F);

		bodyModel[264].addShapeBox(-28F, -17F, -6.5F, 3, 3, 2, 0F,-2.3F, 0F, -.3F, .4F, 0F, -.3F, .4F, 0F, -.4F, -2.3F, 0F, -.4F, 0F, -.1F, .8F, -2F, .4F, .8F, -2F, .4F, -1.4F, 0F, -.1F, -1.4F); // Box 3
		bodyModel[264].setRotationPoint(0F, -13F, 0F);

		bodyModel[265].addShapeBox(-30.7F, -14F, -7.5F, 4, 1, 2, 0F,0F, -1.5F, -.4F, -1.3F, .1F, -.2F, -1.3F, .1F, -.4F, 0F, -1.5F, -.4F, 0F, 1.4F, -.4F, -.3F, -.6F, -.2F, -.3F, -.6F, -.4F, 0F, 1.4F, -.4F); // Box 0
		bodyModel[265].setRotationPoint(0F, -13F, 0F);

		bodyModel[266].addShapeBox(-32.7F, -13F, -7.5F, 2, 1, 2, 0F,.3F, -.8F, -.4F, 0F, -.5F, -.4F, 0F, -.5F, -.4F, .3F, -.8F, -.4F, .3F, .4F, -.4F, 0F, .4F, -.4F, 0F, .4F, -.4F, .3F, .4F, -.4F); // Box 1
		bodyModel[266].setRotationPoint(0F, -13F, 0F);

		bodyModel[267].addShapeBox(-25F, -20.8F, 2.5F, 2, 2, 2, 0F,-0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -1.2F, 0.2F, -0.4F, -1.2F, 0.2F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.6F, 0.2F, -0.3F, -0.1F, 0.2F, -0.3F); // Box 2
		bodyModel[267].setRotationPoint(0F, -13F, 0F);

		bodyModel[268].addShapeBox(-25.2F, -19F, 4.5F, 2, 2, 2, 0F,-0.3F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.2F, 0.6F, -1.8F, -0.6F, 0.6F, -1.8F, 0.5F, 0F, -0.4F, -1.4F, 0F, -0.4F, -1.4F, 0F, -0.3F, 0.5F, 0F, -0.3F); // Box 3
		bodyModel[268].setRotationPoint(0F, -13F, 0F);

		bodyModel[269].addShapeBox(-28F, -17F, 4.5F, 3, 3, 2, 0F,-2.3F, 0F, -0.4F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.3F, -2.3F, 0F, -0.3F, 0F, -0.1F, -1.4F, -2F, 0.4F, -1.4F, -2F, 0.4F, 0.8F, 0F, -0.1F, 0.8F); // Box 4
		bodyModel[269].setRotationPoint(0F, -13F, 0F);

		bodyModel[270].addShapeBox(-30.7F, -14F, 5.5F, 4, 1, 2, 0F,0F, -1.5F, -0.4F, -1.3F, 0.1F, -0.4F, -1.3F, 0.1F, -0.2F, 0F, -1.5F, -0.4F, 0F, 1.4F, -0.4F, -0.3F, -0.6F, -0.4F, -0.3F, -0.6F, -0.2F, 0F, 1.4F, -0.4F); // Box 5
		bodyModel[270].setRotationPoint(0F, -13F, 0F);

		bodyModel[271].addShapeBox(-32.7F, -13F, 5.5F, 2, 1, 2, 0F,0.3F, -0.8F, -0.4F, 0F, -0.5F, -0.4F, 0F, -0.5F, -0.4F, 0.3F, -0.8F, -0.4F, 0.3F, 0.4F, -0.4F, 0F, 0.4F, -0.4F, 0F, 0.4F, -0.4F, 0.3F, 0.4F, -0.4F); // Box 6
		bodyModel[271].setRotationPoint(0F, -13F, 0F);

		bodyModel[272].addShapeBox(-36.5F, -3F, -4F, 11, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[272].setRotationPoint(0F, -13F, 0F);

		bodyModel[273].addShapeBox(-36.5F, -3F, 3F, 11, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[273].setRotationPoint(0F, -13F, 0F);

		bodyModel[274].addShapeBox(-34.5F, -4F, -5F, 7, 1, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[274].setRotationPoint(0F, -13F, 0F);

		bodyModel[275].addShapeBox(-27.5F, -10F, 1F, 1, 7, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 10
		bodyModel[275].setRotationPoint(0F, -13F, 0F);

		bodyModel[276].addShapeBox(-34.5F, -7F, 4F, 3, 3, 1, 0F,0F, -.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 11
		bodyModel[276].setRotationPoint(0F, -13F, 0F);

		bodyModel[277].addShapeBox(-31.5F, -8F, 4F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 12
		bodyModel[277].setRotationPoint(0F, -13F, 0F);

		bodyModel[278].addShapeBox(-27.5F, -9F, 3F, 1, 6, 2, 0F,0F, 1F, .5F, 0F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 13
		bodyModel[278].setRotationPoint(0F, -13F, 0F);

		bodyModel[279].addShapeBox(-27.5F, -11F, -1F, 1, 8, 2, 0F,0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[279].setRotationPoint(0F, -13F, 0F);

		bodyModel[280].addShapeBox(-34.5F, -7F, -5F, 3, 3, 1, 0F,0F, -.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[280].setRotationPoint(0F, -13F, 0F);

		bodyModel[281].addShapeBox(-31.5F, -8F, -5F, 3, 4, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[281].setRotationPoint(0F, -13F, 0F);

		bodyModel[282].addShapeBox(-27.5F, -10F, 1F, 1, 6, 2, 0F,0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[282].setRotationPoint(0F, -13F, 0F);

		bodyModel[283].addShapeBox(-27.5F, -9F, 3F, 1, 5, 2, 0F,0F, 1F, .5F, 0F, 1F, 0F, -2F, 0F, 0F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, -1F); // Box 4
		bodyModel[283].setRotationPoint(0F, -13F, 0F);

		bodyModel[284].addShapeBox(-27.5F, -10F, -3F, 1, 7, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[284].setRotationPoint(0F, -13F, 0F);

		bodyModel[285].addShapeBox(-27.5F, -9F, -5F, 1, 6, 2, 0F,1F, 0F, -1F, -2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0.5F, 1F, 0F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[285].setRotationPoint(0F, -13F, 0F);

		bodyModel[286].addShapeBox(-36.5F, -3F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[286].setRotationPoint(0F, -13F, 0F);

		bodyModel[287].addShapeBox(-39F, -13F, -0.5F, 1, 3, 1, 0F,-.5F, 0F, -.1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.5F, 0F, -.1F, -.5F, 0F, -.1F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.5F, 0F, -.1F); // Box 8
		bodyModel[287].setRotationPoint(0F, -13F, 0F);

		bodyModel[288].addShapeBox(-38.5F, -3F, -0.5F, 2, 1, 1, 0F,0F, 0F, -.4F, 0F, .2F, .2F, 0F, .2F, .2F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, -.4F); // Box 9
		bodyModel[288].setRotationPoint(0F, -13F, 0F);

		bodyModel[289].addShapeBox(-39F, -10F, -0.5F, 1, 8, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 10
		bodyModel[289].setRotationPoint(0F, -13F, 0F);

		bodyModel[290].addShapeBox(-39.5F, -3F, -6F, 1, 1, 12, 0F,-.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F); // Box 11
		bodyModel[290].setRotationPoint(0F, -13F, 0F);

		bodyModel[291].addShapeBox(-38.5F, -10.5F, -0.5F, 1, 1, 1, 0F,0F, -.3F, 0F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, 0F, -.3F, 0F, 0F, -.3F, 0F, -.2F, -.3F, -.3F, -.2F, -.3F, -.3F, 0F, -.3F, 0F); // Box 12
		bodyModel[291].setRotationPoint(0F, -13F, 0F);

		bodyModel[292].addShapeBox(-39.5F, -10.5F, -0.5F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, -0.3F, -0.2F, -0.3F, -0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, -0.2F, -0.3F, -0.3F); // Box 13
		bodyModel[292].setRotationPoint(0F, -13F, 0F);

		bodyModel[293].addShapeBox(-39F, -13F, -0.5F, 1, 3, 1, 0F,-0.1F, 0F, -0.3F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.3F, -0.1F, 0F, -0.3F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.1F, 0F, -0.3F); // Box 14
		bodyModel[293].setRotationPoint(0F, -13F, 0F);

		bodyModel[294].addShapeBox(-47F, -11F, -6F, 4, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 15
		bodyModel[294].setRotationPoint(0F, -13F, 0F);

		bodyModel[295].addShapeBox(-44F, -10F, -6F, 1, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		bodyModel[295].setRotationPoint(0F, -13F, 0F);

		bodyModel[296].addShapeBox(-44F, -8F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 17
		bodyModel[296].setRotationPoint(0F, -13F, 0F);

		bodyModel[297].addShapeBox(-45.5F, -16F, -0.5F, 1, 15, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 18
		bodyModel[297].setRotationPoint(0F, -13F, 0F);

		bodyModel[298].addShapeBox(-40.8F, 2.3F, -2.5F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 20
		bodyModel[298].setRotationPoint(-1F, -13F, 0F);
		bodyModel[298].rotateAngleZ = -0.12217305F;

		bodyModel[299].addShapeBox(-39.8F, 2.3F, -2.5F, 2, 1, 5, 0F,0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F); // Box 21
		bodyModel[299].setRotationPoint(-1F, -13F, 0F);
		bodyModel[299].rotateAngleZ = -0.12217305F;

		bodyModel[300].addShapeBox(-44F, -8F, -6F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 22
		bodyModel[300].setRotationPoint(0F, -13F, 0F);

		bodyModel[301].addShapeBox(-44F, -8F, 2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 23
		bodyModel[301].setRotationPoint(0F, -13F, 0F);

		bodyModel[302].addShapeBox(-40.8F, 2.1F, -1F, 1, 1, 1, 0F,-.4F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.4F, 0F, 0F, -.4F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 25
		bodyModel[302].setRotationPoint(-1F, -13F, 0F);
		bodyModel[302].rotateAngleZ = -0.12217305F;

		bodyModel[303].addShapeBox(-43.8F, -9.5F, -6.5F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 26
		bodyModel[303].setRotationPoint(0F, -13F, 0F);

		bodyModel[304].addShapeBox(-43.8F, -8.5F, -6.5F, 1, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F); // Box 27
		bodyModel[304].setRotationPoint(0F, -13F, 0F);

		bodyModel[305].addShapeBox(-42.8F, 2.3F, -2.5F, 2, 1, 5, 0F,-1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F, -1F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, -1F, 0F, -2F); // Box 0
		bodyModel[305].setRotationPoint(-1F, -13F, 0F);
		bodyModel[305].rotateAngleZ = -0.12217305F;

		bodyModel[306].addShapeBox(-43.8F, -11.5F, -6.5F, 1, 2, 5, 0F,0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, -1F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F); // Box 1
		bodyModel[306].setRotationPoint(0F, -13F, 0F);

		bodyModel[307].addShapeBox(-40.8F, 2.1F, 0F, 1, 1, 1, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F); // Box 2
		bodyModel[307].setRotationPoint(-1F, -13F, 0F);
		bodyModel[307].rotateAngleZ = -0.12217305F;

		bodyModel[308].addShapeBox(-52.5F, -3F, -6F, 9, 1, 12, 0F,0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[308].setRotationPoint(0F, -13F, 0F);

		bodyModel[309].addShapeBox(-43.5F, -3F, 2F, 2, 1, 4, 0F,-.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -.5F, 0F, 0F); // Box 4
		bodyModel[309].setRotationPoint(0F, -13F, 0F);

		bodyModel[310].addShapeBox(-45.5F, -4F, -1.5F, 2, 1, 1, 0F,.2F, 0F, -.4F, .2F, 0F, -.4F, .2F, 0F, -.2F, .2F, 0F, -.2F, .4F, 0F, -.4F, .4F, 0F, -.4F, .4F, 0F, -.2F, .4F, 0F, -.2F); // Box 5
		bodyModel[310].setRotationPoint(0F, -13F, 0F);

		bodyModel[311].addShapeBox(-43.8F, -8F, -2.5F, 1, 2, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F); // Box 6
		bodyModel[311].setRotationPoint(0F, -13F, 0F);

		bodyModel[312].addShapeBox(-43.8F, -9F, -2.5F, 1, 1, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 7
		bodyModel[312].setRotationPoint(0F, -13F, 0F);

		bodyModel[313].addShapeBox(-45.5F, -4F, 0.5F, 2, 1, 1, 0F,0.2F, 0F, -0.2F, 0.2F, 0F, -0.2F, 0.2F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.2F, 0.4F, 0F, -0.4F, 0.4F, 0F, -0.4F); // Box 9
		bodyModel[313].setRotationPoint(0F, -13F, 0F);

		bodyModel[314].addShapeBox(-43.5F, -3F, -6F, 2, 1, 4, 0F,-0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 10
		bodyModel[314].setRotationPoint(0F, -13F, 0F);

		bodyModel[315].addShapeBox(-43.8F, -11F, -2.5F, 1, 2, 5, 0F,0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 11
		bodyModel[315].setRotationPoint(0F, -13F, 0F);

		bodyModel[316].addShapeBox(-43.8F, -10.4F, -0.8F, 1, 1, 5, 0F,0F, -.2F, -1.7F, 0F, -.2F, -1.7F, 0F, -.2F, -1.7F, 0F, -.2F, -1.7F, 0F, -.2F, -1.7F, 0F, -.2F, -1.7F, 0F, -.2F, -1.7F, 0F, -.2F, -1.7F); // Box 13
		bodyModel[316].setRotationPoint(0F, -13F, 0F);

		bodyModel[317].addShapeBox(-43.8F, -12.2F, -0.8F, 1, 2, 5, 0F,0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F); // Box 14
		bodyModel[317].setRotationPoint(0F, -13F, 0F);

		bodyModel[318].addShapeBox(-43.8F, -8F, 1.5F, 1, 2, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F); // Box 15
		bodyModel[318].setRotationPoint(0F, -13F, 0F);

		bodyModel[319].addShapeBox(-43.8F, -9F, 1.5F, 1, 1, 5, 0F,0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 16
		bodyModel[319].setRotationPoint(0F, -13F, 0F);

		bodyModel[320].addShapeBox(-43.8F, -11F, 1.5F, 1, 2, 5, 0F,0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F); // Box 17
		bodyModel[320].setRotationPoint(0F, -13F, 0F);

		bodyModel[321].addShapeBox(-43.8F, -9.6F, -0.8F, 1, 2, 5, 0F,0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, -1.7F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F, 0F, -1.5F, -2.2F); // Box 18
		bodyModel[321].setRotationPoint(0F, -13F, 0F);

		bodyModel[322].addShapeBox(-37.5F, -8F, -6F, 1, 6, 2, 0F,0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F); // Box 19
		bodyModel[322].setRotationPoint(0F, -13F, 0F);

		bodyModel[323].addShapeBox(-38.5F, -8F, -6F, 1, 6, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 20
		bodyModel[323].setRotationPoint(0F, -13F, 0F);

		bodyModel[324].addShapeBox(-40F, -9F, -5.5F, 3, 1, 1, 0F,0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -2F); // Box 21
		bodyModel[324].setRotationPoint(0F, -13F, 0F);

		bodyModel[325].addShapeBox(-40.5F, -6F, 5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		bodyModel[325].setRotationPoint(0F, -13F, 0F);

		bodyModel[326].addShapeBox(-40.5F, -10F, 5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		bodyModel[326].setRotationPoint(0F, -13F, 0F);

		bodyModel[327].addShapeBox(-39.5F, -13F, 5F, 1, 3, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -1F, 0F, -.2F, -1F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F); // Box 24
		bodyModel[327].setRotationPoint(0F, -13F, 0F);

		bodyModel[328].addShapeBox(-40.5F, -11.5F, 5F, 3, 2, 1, 0F,.2F, -.5F, -.5F, .2F, -.5F, -.5F, .2F, -.5F, 0F, .2F, -.5F, 0F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 25
		bodyModel[328].setRotationPoint(0F, -13F, 0F);

		bodyModel[329].addShapeBox(-40.5F, -11.5F, 5F, 3, 1, 1, 0F,-.2F, 0F, -.5F, -.2F, 0F, -.5F, -.2F, 0F, 0F, -.2F, 0F, 0F, .2F, -.5F, -.5F, .2F, -.5F, -.5F, .2F, -.5F, 0F, .2F, -.5F, 0F); // Box 26
		bodyModel[329].setRotationPoint(0F, -13F, 0F);

		bodyModel[330].addShapeBox(-40F, -12F, 5F, 2, 1, 1, 0F,-.4F, 0F, -.5F, -.4F, 0F, -.5F, -.4F, 0F, 0F, -.4F, 0F, 0F, .3F, -.5F, -.5F, .3F, -.5F, -.5F, .3F, -.5F, 0F, .3F, -.5F, 0F); // Box 27
		bodyModel[330].setRotationPoint(0F, -13F, 0F);

		bodyModel[331].addShapeBox(-39.5F, -13F, 4F, 1, 1, 1, 0F,-.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F); // Box 28
		bodyModel[331].setRotationPoint(0F, -13F, 0F);

		bodyModel[332].addShapeBox(-40.5F, -9.5F, 5F, 1, 4, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 29
		bodyModel[332].setRotationPoint(0F, -13F, 0F);

		bodyModel[333].addShapeBox(-38.5F, -6F, 5F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[333].setRotationPoint(0F, -13F, 0F);

		bodyModel[334].addShapeBox(-38.5F, -9.5F, 5F, 1, 4, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 31
		bodyModel[334].setRotationPoint(0F, -13F, 0F);

		bodyModel[335].addShapeBox(-0.5F, -1F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // MG1
		bodyModel[335].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[336].addShapeBox(-0.5F, -1F, -1.5F, 1, 1, 1, 0F,0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F); // MG2
		bodyModel[336].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[337].addShapeBox(-0.5F, -1F, 0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, -0.7F); // MG3
		bodyModel[337].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[338].addShapeBox(-0.5F, -3F, -0.5F, 7, 2, 1, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // MG4
		bodyModel[338].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[339].addShapeBox(1.5F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F, -.3F, -.5F, 0F); // MG5
		bodyModel[339].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[340].addShapeBox(1.5F, -0.5F, -0.5F, 2, 1, 1, 0F,-.3F, -0.5F, 0F, -.3F, -0.5F, 0F, -.3F, -0.5F, 0F, -.3F, -0.5F, 0F, -.8F, -.3F, 0F, -.8F, -.3F, 0F, -.8F, -.3F, 0F, -.8F, -.3F, 0F); // MG6
		bodyModel[340].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[341].addShapeBox(1.5F, -1.5F, -0.5F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG7
		bodyModel[341].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[342].addShapeBox(4F, -1.5F, -0.5F, 2, 1, 1, 0F,0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG8
		bodyModel[342].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[343].addShapeBox(5F, -0.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F); // MG10
		bodyModel[343].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[344].addShapeBox(4F, -0.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, -.5F, -.5F, 0F); // MG9
		bodyModel[344].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[345].addShapeBox(5.5F, 1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.2F, -.7F, 0F, -.2F, -.7F, 0F, -.2F, -.7F, 0F, -.2F, -.7F, 0F); // MG11
		bodyModel[345].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[346].addShapeBox(6.5F, -3F, -0.5F, 1, 2, 1, 0F,0F, 0F, .2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, 0F, .2F); // MG13
		bodyModel[346].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[347].addShapeBox(3.5F, -4F, -0.5F, 4, 1, 1, 0F,0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, -.3F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F, 0F, 0F, -.1F); // MG12
		bodyModel[347].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[348].addShapeBox(7.5F, -3.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F, 0F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, 0F, 0F, -.2F); // MG14
		bodyModel[348].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[349].addShapeBox(8F, -3.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, -.2F, 0F, .3F, -.2F, 0F, .3F, -.2F, 0F, 0F, -.2F, 0F, -.7F, -.2F, 0F, -1F, -.2F, 0F, -1F, -.2F, 0F, -.7F, -.2F); // MG15
		bodyModel[349].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[350].addShapeBox(8F, -2.5F, -0.5F, 1, 1, 1, 0F,0F, -0.7F, -0.2F, 0F, -1F, -0.2F, 0F, -1F, -0.2F, 0F, -0.7F, -0.2F, 0F, 0F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0.3F, -0.2F, 0F, 0F, -0.2F); // MG16
		bodyModel[350].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[351].addShapeBox(8.8F, -3.5F, -0.5F, 1, 2, 1, 0F,-.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F, -.15F, 0F, -.15F); // MG17
		bodyModel[351].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[352].addShapeBox(8.8F, -4.5F, -0.5F, 1, 1, 1, 0F,0F, -.6F, -.2F, -.5F, -.6F, 0F, -.5F, -.6F, 0F, 0F, -.6F, -.2F, 0F, 0F, -.2F, -.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, -.2F); // MG18
		bodyModel[352].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[353].addShapeBox(8.8F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, 0F, -0.5F, -0.6F, 0F, 0F, -0.6F, -0.2F); // MG19
		bodyModel[353].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[354].addShapeBox(8.8F, -1.5F, -0.5F, 1, 1, 1, 0F,-0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, 0F, -0.5F, -0.6F, 0F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, 0F); // MG20
		bodyModel[354].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[355].addShapeBox(8.8F, -4.5F, -0.5F, 1, 1, 1, 0F,-0.5F, -0.6F, 0F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, 0F, -0.5F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, 0F); // MG21
		bodyModel[355].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[356].addShapeBox(-1.5F, -3F, -1F, 1, 1, 2, 0F,0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // MG23
		bodyModel[356].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[357].addShapeBox(-1.5F, -4F, -1F, 1, 1, 2, 0F,0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, -.2F, -.5F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F, 0F, 0F, .2F); // MG22
		bodyModel[357].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[358].addShapeBox(-1.5F, -2F, -1F, 1, 1, 2, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F); // MG23
		bodyModel[358].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[359].addShapeBox(-11.5F, -3F, -0.5F, 10, 1, 1, 0F,0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F, 0F, -.2F, .3F); // MG24
		bodyModel[359].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[360].addShapeBox(-11.5F, -4F, -0.5F, 10, 1, 1, 0F,0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, -.7F, -.2F, 0F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, .3F, 0F, .2F, .3F); // MG25
		bodyModel[360].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[361].addShapeBox(-11.5F, -2F, -0.5F, 10, 1, 1, 0F,0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, 0.2F, 0.3F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F, 0F, -0.7F, -0.2F); // MG26
		bodyModel[361].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[362].addShapeBox(-13.5F, -3F, -0.5F, 2, 1, 1, 0F,0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F); // MG27
		bodyModel[362].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[363].addShapeBox(-1.2F, -8.2F, -5F, 1, 6, 10, 0F,-.4F, -1.5F, -3F, -.4F, -1.5F, -3F, -.4F, -1.5F, -3F, -.4F, -1.5F, -3F, -.4F, -1.5F, -3F, -.4F, -1.5F, -3F, -.4F, -1.5F, -3F, -.4F, -1.5F, -3F); // MG29
		bodyModel[363].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[364].addShapeBox(-1.2F, -4.2F, -2.5F, 1, 1, 5, 0F,-.2F, -.2F, -.15F, -.2F, -.2F, -.15F, -.2F, -.2F, -.15F, -.2F, -.2F, -.15F, -.2F, -.2F, -.15F, -.2F, -.2F, -.15F, -.2F, -.2F, -.15F, -.2F, -.2F, -.15F); // MG28
		bodyModel[364].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[365].addShapeBox(-1.2F, -6F, 1.5F, 1, 2, 1, 0F,-.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.5F, -.3F, 0F, -.5F, -.3F, 0F, -.3F, -.3F, 0F, -.3F); // MG31
		bodyModel[365].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[366].addShapeBox(-1.2F, -6F, -2.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.5F, -0.3F, 0F, -0.5F); // MG30
		bodyModel[366].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[367].addShapeBox(3.5F, -3.8F, -1.5F, 4, 1, 2, 0F,-.2F, -.3F, 0F, -.8F, -.3F, 0F, -.8F, -.3F, 0F, -.2F, -.3F, 0F, -.2F, -.3F, 0F, -.8F, -.3F, 0F, -.8F, -.3F, 0F, -.2F, -.3F, 0F); // MG33
		bodyModel[367].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[368].addShapeBox(6.5F, -3.8F, -0.5F, 1, 1, 2, 0F,-.2F, -.3F, -.5F, -.2F, -.3F, -.5F, -.4F, -.3F, -.3F, -.2F, -.3F, 0F, -.2F, -.3F, -.5F, -.2F, -.3F, -.5F, -.4F, -.3F, -.3F, -.2F, -.3F, 0F); // MG34
		bodyModel[368].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[369].addShapeBox(3.5F, -3.8F, 0.5F, 4, 1, 1, 0F,-.2F, -.3F, 0F, -.8F, -.3F, 0F, -.8F, -.3F, -.5F, -.2F, -.3F, -.5F, -.2F, -.3F, 0F, -.8F, -.3F, 0F, -.8F, -.3F, -.5F, -.2F, -.3F, -.5F); // MG32
		bodyModel[369].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[370].addShapeBox(6.5F, -3.8F, -1.5F, 1, 1, 2, 0F,-0.2F, -0.3F, 0F, -0.4F, -0.3F, -0.3F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, 0F, -0.4F, -0.3F, -0.3F, -0.2F, -0.3F, -0.5F, -0.2F, -0.3F, -0.5F); // MG35
		bodyModel[370].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[371].addShapeBox(0.7F, -4F, -2F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // MG36
		bodyModel[371].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[372].addShapeBox(-0.3F, -4F, -2F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // MG37
		bodyModel[372].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[373].addShapeBox(2.7F, -4F, -2F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // MG38
		bodyModel[373].setRotationPoint(-45F, -28.5F, 0F);

		bodyModel[374].addShapeBox(-38.5F, -12.5F, 7.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 2
		bodyModel[374].setRotationPoint(0F, -13F, 0F);

		bodyModel[375].addShapeBox(-38.5F, -13.5F, 7.5F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 3
		bodyModel[375].setRotationPoint(0F, -13F, 0F);

		bodyModel[376].addShapeBox(-34F, -12.5F, 7.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 4
		bodyModel[376].setRotationPoint(0F, -13F, 0F);

		bodyModel[377].addShapeBox(-34F, -13.5F, 7.5F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 5
		bodyModel[377].setRotationPoint(0F, -13F, 0F);

		bodyModel[378].addShapeBox(-38.5F, -12.5F, -8.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 6
		bodyModel[378].setRotationPoint(0F, -13F, 0F);

		bodyModel[379].addShapeBox(-38.5F, -13.5F, -8.5F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		bodyModel[379].setRotationPoint(0F, -13F, 0F);

		bodyModel[380].addShapeBox(-34F, -13.5F, -8.5F, 4, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 8
		bodyModel[380].setRotationPoint(0F, -13F, 0F);

		bodyModel[381].addShapeBox(-34F, -12.5F, -8.5F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		bodyModel[381].setRotationPoint(0F, -13F, 0F);

		bodyModel[382].addShapeBox(3.5F, -0.5F, -2F, 1, 1, 1, 0F,0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F); // Box 0
		bodyModel[382].setRotationPoint(8F, -25F, 0F);

		bodyModel[383].addShapeBox(3.5F, -0.5F, 1F, 1, 1, 1, 0F,0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F); // Box 1
		bodyModel[383].setRotationPoint(8F, -25F, 0F);

		bodyModel[384].addShapeBox(3.5F, -1.7F, 0.3F, 1, 1, 1, 0F,0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F); // Box 2
		bodyModel[384].setRotationPoint(8F, -25F, 0F);

		bodyModel[385].addShapeBox(3.5F, -1.7F, -1.3F, 1, 1, 1, 0F,0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F); // Box 3
		bodyModel[385].setRotationPoint(8F, -25F, 0F);

		bodyModel[386].addShapeBox(3.5F, 0.7F, 0.3F, 1, 1, 1, 0F,0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F); // Box 4
		bodyModel[386].setRotationPoint(8F, -25F, 0F);

		bodyModel[387].addShapeBox(3.5F, 0.7F, -1.3F, 1, 1, 1, 0F,0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, -.5F, -.3F, -.3F, -.5F, -.3F, -.3F, 0F, -.2F, -.2F); // Box 5
		bodyModel[387].setRotationPoint(8F, -25F, 0F);

		bodyModel[388].addShapeBox(-38F, -21F, -7.2F, 30, 30, 1, 0F,-10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F); // Box 4
		bodyModel[388].setRotationPoint(0F, -13F, 0F);

		bodyModel[389].addShapeBox(-38F, -21F, 6.2F, 30, 30, 1, 0F,-10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F, -10F, -10F, 0F); // Box 5
		bodyModel[389].setRotationPoint(0F, -13F, 0F);
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 12, 210, textureX, textureY); // Box 411
		tailModel[1] = new ModelRendererTurbo(this, 12, 217, textureX, textureY); // Box 412
		tailModel[2] = new ModelRendererTurbo(this, 12, 217, textureX, textureY); // Box 413
		tailModel[3] = new ModelRendererTurbo(this, 12, 210, textureX, textureY); // Box 414
		tailModel[4] = new ModelRendererTurbo(this, 1, 200, textureX, textureY); // Box 415
		tailModel[5] = new ModelRendererTurbo(this, 1, 200, textureX, textureY); // Box 416
		tailModel[6] = new ModelRendererTurbo(this, 12, 286, textureX, textureY); // Box 418
		tailModel[7] = new ModelRendererTurbo(this, 12, 223, textureX, textureY); // Box 419
		tailModel[8] = new ModelRendererTurbo(this, 12, 234, textureX, textureY); // Box 420
		tailModel[9] = new ModelRendererTurbo(this, 12, 246, textureX, textureY); // Box 421
		tailModel[10] = new ModelRendererTurbo(this, 12, 256, textureX, textureY); // Box 422
		tailModel[11] = new ModelRendererTurbo(this, 12, 264, textureX, textureY); // Box 423
		tailModel[12] = new ModelRendererTurbo(this, 4, 265, textureX, textureY); // Box 429
		tailModel[13] = new ModelRendererTurbo(this, 12, 234, textureX, textureY); // Box 430
		tailModel[14] = new ModelRendererTurbo(this, 12, 246, textureX, textureY); // Box 431
		tailModel[15] = new ModelRendererTurbo(this, 12, 256, textureX, textureY); // Box 432
		tailModel[16] = new ModelRendererTurbo(this, 12, 264, textureX, textureY); // Box 433
		tailModel[17] = new ModelRendererTurbo(this, 12, 282, textureX, textureY); // Box 441
		tailModel[18] = new ModelRendererTurbo(this, 12, 278, textureX, textureY); // Box 442
		tailModel[19] = new ModelRendererTurbo(this, 12, 274, textureX, textureY); // Box 443
		tailModel[20] = new ModelRendererTurbo(this, 12, 271, textureX, textureY); // Box 444
		tailModel[21] = new ModelRendererTurbo(this, 3, 284, textureX, textureY); // Box 445
		tailModel[22] = new ModelRendererTurbo(this, 4, 296, textureX, textureY); // Box 453
		tailModel[23] = new ModelRendererTurbo(this, 13, 296, textureX, textureY); // Box 454
		tailModel[24] = new ModelRendererTurbo(this, 4, 296, textureX, textureY); // Box 455
		tailModel[25] = new ModelRendererTurbo(this, 13, 296, textureX, textureY); // Box 456
		tailModel[26] = new ModelRendererTurbo(this, 27, 296, textureX, textureY); // Box 0
		tailModel[27] = new ModelRendererTurbo(this, 27, 296, textureX, textureY); // Box 1
		tailModel[28] = new ModelRendererTurbo(this, 27, 300, textureX, textureY); // Box 3
		tailModel[29] = new ModelRendererTurbo(this, 27, 300, textureX, textureY); // Box 4
		tailModel[30] = new ModelRendererTurbo(this, 27, 292, textureX, textureY); // Box 6
		tailModel[31] = new ModelRendererTurbo(this, 27, 292, textureX, textureY); // Box 7
		tailModel[32] = new ModelRendererTurbo(this, 27, 296, textureX, textureY); // Box 8
		tailModel[33] = new ModelRendererTurbo(this, 27, 296, textureX, textureY); // Box 9
		tailModel[34] = new ModelRendererTurbo(this, 27, 292, textureX, textureY); // Box 10
		tailModel[35] = new ModelRendererTurbo(this, 27, 292, textureX, textureY); // Box 11
		tailModel[36] = new ModelRendererTurbo(this, 27, 300, textureX, textureY); // Box 12
		tailModel[37] = new ModelRendererTurbo(this, 27, 300, textureX, textureY); // Box 13
		tailModel[38] = new ModelRendererTurbo(this, 25, 304, textureX, textureY); // Box 91
		tailModel[39] = new ModelRendererTurbo(this, 25, 311, textureX, textureY); // Box 92
		tailModel[40] = new ModelRendererTurbo(this, 25, 315, textureX, textureY); // Box 93
		tailModel[41] = new ModelRendererTurbo(this, 25, 315, textureX, textureY); // Box 94
		tailModel[42] = new ModelRendererTurbo(this, 25, 315, textureX, textureY); // Box 95

		tailModel[0].addShapeBox(3F, -2.4F, -31F, 78, 2, 2, 0F,1F, .5F, 0F, 0F, 6F, -28F, 0F, 6F, 28F, 1F, .5F, 0F, 1F, -.5F, 0F, 0F, -6F, -28F, 0F, -6F, 28F, 1F, -.5F, 0F); // Box 411
		tailModel[0].setRotationPoint(0F, -13F, 0F);

		tailModel[1].addShapeBox(3F, -29.4F, -31F, 77, 2, 2, 0F,0F, 0F, 0F, 0F, -6F, -28F, 0F, -6F, 28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, -28F, 0F, 6F, 28F, 0F, 0F, 0F); // Box 412
		tailModel[1].setRotationPoint(0F, -13F, 0F);

		tailModel[2].addShapeBox(3F, -29.4F, 29F, 77, 2, 2, 0F,0F, 0F, 0F, 0F, -6F, 28F, 0F, -6F, -28F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 6F, 28F, 0F, 6F, -28F, 0F, 0F, 0F); // Box 413
		tailModel[2].setRotationPoint(0F, -13F, 0F);

		tailModel[3].addShapeBox(3F, -2.4F, 29F, 78, 2, 2, 0F,1F, .5F, 0F, 0F, 6F, 28F, 0F, 6F, -28F, 1F, .5F, 0F, 1F, -.5F, 0F, 0F, -6F, 28F, 0F, -6F, -28F, 1F, -.5F, 0F); // Box 414
		tailModel[3].setRotationPoint(0F, -13F, 0F);

		tailModel[4].addShapeBox(81F, -8.4F, -3F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 415
		tailModel[4].setRotationPoint(0F, -13F, 0F);

		tailModel[5].addShapeBox(80F, -23.4F, -3F, 2, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 416
		tailModel[5].setRotationPoint(0F, -13F, 0F);

		tailModel[6].addShapeBox(64F, -26F, -0.5F, 17, 2, 1, 0F,.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F); // Box 418
		tailModel[6].setRotationPoint(0F, -13F, 0F);

		tailModel[7].addShapeBox(64F, -25F, -4F, 18, 1, 8, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 419
		tailModel[7].setRotationPoint(0F, -13F, 0F);

		tailModel[8].addShapeBox(64F, -25F, 4F, 18, 1, 10, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1F, 0F, 0F); // Box 420
		tailModel[8].setRotationPoint(0F, -13F, 0F);

		tailModel[9].addShapeBox(65F, -25F, 14F, 17, 1, 7, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -1.5F, 0F, 0F); // Box 421
		tailModel[9].setRotationPoint(0F, -13F, 0F);

		tailModel[10].addShapeBox(66F, -25F, 21F, 16, 1, 6, 0F,-.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -3F, 0F, 0F, -.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -3F, 0F, 0F); // Box 422
		tailModel[10].setRotationPoint(0F, -13F, 0F);

		tailModel[11].addShapeBox(69F, -25F, 27F, 13, 1, 4, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 1F, -4F, 0F, -.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, -4F, 0F, -.5F); // Box 423
		tailModel[11].setRotationPoint(0F, -13F, 0F);

		tailModel[12].addShapeBox(81F, -26F, -0.5F, 2, 17, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 429
		tailModel[12].setRotationPoint(0F, -13F, 0F);

		tailModel[13].addShapeBox(64F, -25F, -14F, 18, 1, 10, 0F,-1F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 430
		tailModel[13].setRotationPoint(0F, -13F, 0F);

		tailModel[14].addShapeBox(65F, -25F, -21F, 17, 1, 7, 0F,-1.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 431
		tailModel[14].setRotationPoint(0F, -13F, 0F);

		tailModel[15].addShapeBox(66F, -25F, -27F, 16, 1, 6, 0F,-3F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F); // Box 432
		tailModel[15].setRotationPoint(0F, -13F, 0F);

		tailModel[16].addShapeBox(69F, -25F, -31F, 13, 1, 4, 0F,-4F, 0F, -0.5F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, -0.5F, 0F, 1F, 1F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 433
		tailModel[16].setRotationPoint(0F, -13F, 0F);

		tailModel[17].addShapeBox(65F, -28F, -0.5F, 18, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F); // Box 441
		tailModel[17].setRotationPoint(0F, -13F, 0F);

		tailModel[18].addShapeBox(68F, -30F, -0.5F, 15, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 442
		tailModel[18].setRotationPoint(0F, -13F, 0F);

		tailModel[19].addShapeBox(68F, -31F, -0.5F, 15, 1, 1, 0F,-5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 443
		tailModel[19].setRotationPoint(0F, -13F, 0F);

		tailModel[20].addShapeBox(76F, -32F, -0.5F, 7, 1, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F); // Box 444
		tailModel[20].setRotationPoint(0F, -13F, 0F);

		tailModel[21].addShapeBox(81F, -11F, -0.5F, 2, 7, 1, 0F,-.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F, -.2F, 0F, -.2F); // Box 445
		tailModel[21].setRotationPoint(0F, -13F, 0F);

		tailModel[22].addShapeBox(31F, -25.4F, -21F, 2, 21, 2, 0F,0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.3F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 453
		tailModel[22].setRotationPoint(0F, -13F, 0F);

		tailModel[23].addShapeBox(63F, -23.4F, -9F, 2, 17, 2, 0F,0F, 0F, 0F, 0F, 0F, -.7F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -.7F); // Box 454
		tailModel[23].setRotationPoint(0F, -13F, 0F);

		tailModel[24].addShapeBox(31F, -25.4F, 19F, 2, 21, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.3F); // Box 455
		tailModel[24].setRotationPoint(0F, -13F, 0F);

		tailModel[25].addShapeBox(63F, -23.4F, 7F, 2, 17, 2, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 456
		tailModel[25].setRotationPoint(0F, -13F, 0F);

		tailModel[26].addShapeBox(33F, -26.4F, -20F, 30, 1, 1, 0F,0F, 0F, -.2F, 0F, -20F, -11F, 0F, -20F, 11F, 0F, 0F, 0F, 0F, 0F, -.2F, 0F, 20F, -11F, 0F, 20F, 11F, 0F, 0F, 0F); // Box 0
		tailModel[26].setRotationPoint(0F, -13F, 0F);

		tailModel[27].addShapeBox(33F, -4.4F, -20F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 20F, -11F, 0F, 20F, 11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, -11F, 0F, -20F, 11F, 0F, 0F, 0F); // Box 1
		tailModel[27].setRotationPoint(0F, -13F, 0F);

		tailModel[28].addShapeBox(63F, -24.4F, -9F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, -16F, -9F, 0F, -16F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, -9F, 0F, 16F, 9F, 0F, 0F, 0F); // Box 3
		tailModel[28].setRotationPoint(0F, -13F, 0F);

		tailModel[29].addShapeBox(63F, -6.4F, -9F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 16F, -9F, 0F, 16F, 9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, -9F, 0F, -16F, 9F, 0F, 0F, 0F); // Box 4
		tailModel[29].setRotationPoint(0F, -13F, 0F);

		tailModel[30].addShapeBox(1F, -28.4F, -31F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, -24F, -10F, 0F, -24F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, -10F, 0F, 24F, 10F, 0F, 0F, 0F); // Box 6
		tailModel[30].setRotationPoint(0F, -13F, 0F);

		tailModel[31].addShapeBox(1F, -2.4F, -31F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 24F, -10F, 0F, 24F, 10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, -10F, 0F, -24F, 10F, 0F, 0F, 0F); // Box 7
		tailModel[31].setRotationPoint(0F, -13F, 0F);

		tailModel[32].addShapeBox(33F, -26.4F, 19F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, -20F, 11F, 0F, -20F, -11F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 20F, 11F, 0F, 20F, -11F, 0F, 0F, -.2F); // Box 8
		tailModel[32].setRotationPoint(0F, -13F, 0F);

		tailModel[33].addShapeBox(33F, -4.4F, 19F, 30, 1, 1, 0F,0F, 0F, 0F, 0F, 20F, 11F, 0F, 20F, -11F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -20F, 11F, 0F, -20F, -11F, 0F, 0F, 0F); // Box 9
		tailModel[33].setRotationPoint(0F, -13F, 0F);

		tailModel[34].addShapeBox(1F, -28.4F, 30F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, -24F, 10F, 0F, -24F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 24F, 10F, 0F, 24F, -10F, 0F, 0F, 0F); // Box 10
		tailModel[34].setRotationPoint(0F, -13F, 0F);

		tailModel[35].addShapeBox(1F, -2.4F, 30F, 29, 1, 1, 0F,0F, 0F, 0F, 0F, 24F, 10F, 0F, 24F, -10F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -24F, 10F, 0F, -24F, -10F, 0F, 0F, 0F); // Box 11
		tailModel[35].setRotationPoint(0F, -13F, 0F);

		tailModel[36].addShapeBox(63F, -6.4F, 8F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, 16F, 9F, 0F, 16F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -16F, 9F, 0F, -16F, -9F, 0F, 0F, 0F); // Box 12
		tailModel[36].setRotationPoint(0F, -13F, 0F);

		tailModel[37].addShapeBox(63F, -24.4F, 8F, 19, 1, 1, 0F,0F, 0F, 0F, 0F, -16F, 9F, 0F, -16F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 9F, 0F, 16F, -9F, 0F, 0F, 0F); // Box 13
		tailModel[37].setRotationPoint(0F, -13F, 0F);

		tailModel[38].addShapeBox(80F, -9F, -0.5F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2F, 0F, 0F); // Box 91
		tailModel[38].setRotationPoint(0F, -13F, 0F);

		tailModel[39].addShapeBox(78F, -4F, -1F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 92
		tailModel[39].setRotationPoint(0F, -13F, 0F);

		tailModel[40].addShapeBox(80F, -3F, -0.5F, 2, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, -5F, 0F, 0F); // Box 93
		tailModel[40].setRotationPoint(0F, -13F, 0F);

		tailModel[41].addShapeBox(81F, -3F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Box 94
		tailModel[41].setRotationPoint(0F, -13F, 0F);

		tailModel[42].addShapeBox(86F, 1F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95
		tailModel[42].setRotationPoint(0F, -13F, 0F);
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 151, 34, textureX, textureY); // Box 288
		leftWingModel[1] = new ModelRendererTurbo(this, 188, 39, textureX, textureY); // Box 289
		leftWingModel[2] = new ModelRendererTurbo(this, 229, 44, textureX, textureY); // Box 290
		leftWingModel[3] = new ModelRendererTurbo(this, 273, 50, textureX, textureY); // Box 291
		leftWingModel[4] = new ModelRendererTurbo(this, 151, 60, textureX, textureY); // Box 292
		leftWingModel[5] = new ModelRendererTurbo(this, 151, 87, textureX, textureY); // Box 310
		leftWingModel[6] = new ModelRendererTurbo(this, 208, 92, textureX, textureY); // Box 311
		leftWingModel[7] = new ModelRendererTurbo(this, 267, 87, textureX, textureY); // Box 312
		leftWingModel[8] = new ModelRendererTurbo(this, 151, 134, textureX, textureY); // Box 313
		leftWingModel[9] = new ModelRendererTurbo(this, 267, 137, textureX, textureY); // Box 314
		leftWingModel[10] = new ModelRendererTurbo(this, 310, 25, textureX, textureY); // Box 316
		leftWingModel[11] = new ModelRendererTurbo(this, 287, 41, textureX, textureY); // Box 317
		leftWingModel[12] = new ModelRendererTurbo(this, 310, 35, textureX, textureY); // Box 318
		leftWingModel[13] = new ModelRendererTurbo(this, 309, 46, textureX, textureY); // Box 319
		leftWingModel[14] = new ModelRendererTurbo(this, 290, 25, textureX, textureY); // Box 320
		leftWingModel[15] = new ModelRendererTurbo(this, 333, 26, textureX, textureY); // Box 321
		leftWingModel[16] = new ModelRendererTurbo(this, 333, 36, textureX, textureY); // Box 322
		leftWingModel[17] = new ModelRendererTurbo(this, 333, 47, textureX, textureY); // Box 323
		leftWingModel[18] = new ModelRendererTurbo(this, 310, 59, textureX, textureY); // Box 324
		leftWingModel[19] = new ModelRendererTurbo(this, 288, 31, textureX, textureY); // Box 325
		leftWingModel[20] = new ModelRendererTurbo(this, 151, 60, textureX, textureY); // Box 348
		leftWingModel[21] = new ModelRendererTurbo(this, 188, 39, textureX, textureY); // Box 349
		leftWingModel[22] = new ModelRendererTurbo(this, 229, 44, textureX, textureY); // Box 350
		leftWingModel[23] = new ModelRendererTurbo(this, 273, 50, textureX, textureY); // Box 351
		leftWingModel[24] = new ModelRendererTurbo(this, 267, 137, textureX, textureY); // Box 356
		leftWingModel[25] = new ModelRendererTurbo(this, 267, 87, textureX, textureY); // Box 357
		leftWingModel[26] = new ModelRendererTurbo(this, 208, 92, textureX, textureY); // Box 358
		leftWingModel[27] = new ModelRendererTurbo(this, 151, 134, textureX, textureY); // Box 359
		leftWingModel[28] = new ModelRendererTurbo(this, 287, 41, textureX, textureY); // Box 376
		leftWingModel[29] = new ModelRendererTurbo(this, 290, 25, textureX, textureY); // Box 377
		leftWingModel[30] = new ModelRendererTurbo(this, 333, 26, textureX, textureY); // Box 378
		leftWingModel[31] = new ModelRendererTurbo(this, 310, 25, textureX, textureY); // Box 379
		leftWingModel[32] = new ModelRendererTurbo(this, 310, 35, textureX, textureY); // Box 380
		leftWingModel[33] = new ModelRendererTurbo(this, 333, 36, textureX, textureY); // Box 381
		leftWingModel[34] = new ModelRendererTurbo(this, 333, 47, textureX, textureY); // Box 382
		leftWingModel[35] = new ModelRendererTurbo(this, 309, 46, textureX, textureY); // Box 383
		leftWingModel[36] = new ModelRendererTurbo(this, 310, 59, textureX, textureY); // Box 384
		leftWingModel[37] = new ModelRendererTurbo(this, 288, 31, textureX, textureY); // Box 385
		leftWingModel[38] = new ModelRendererTurbo(this, 151, 87, textureX, textureY); // Box 386
		leftWingModel[39] = new ModelRendererTurbo(this, 151, 34, textureX, textureY); // Box 387
		leftWingModel[40] = new ModelRendererTurbo(this, 4, 235, textureX, textureY); // Box 401
		leftWingModel[41] = new ModelRendererTurbo(this, 4, 235, textureX, textureY); // Box 402
		leftWingModel[42] = new ModelRendererTurbo(this, 4, 235, textureX, textureY); // Box 403
		leftWingModel[43] = new ModelRendererTurbo(this, 4, 235, textureX, textureY); // Box 404
		leftWingModel[44] = new ModelRendererTurbo(this, 5, 305, textureX, textureY); // Box 14
		leftWingModel[45] = new ModelRendererTurbo(this, 49, 315, textureX, textureY); // Box 15
		leftWingModel[46] = new ModelRendererTurbo(this, 5, 305, textureX, textureY); // Box 16
		leftWingModel[47] = new ModelRendererTurbo(this, 5, 305, textureX, textureY); // Box 22
		leftWingModel[48] = new ModelRendererTurbo(this, 5, 305, textureX, textureY); // Box 23
		leftWingModel[49] = new ModelRendererTurbo(this, 386, 41, textureX, textureY); // Box 0
		leftWingModel[50] = new ModelRendererTurbo(this, 386, 7, textureX, textureY); // Box 1

		leftWingModel[0].addShapeBox(0F, -2F, -23F, 5, 1, 23, 0F,-.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 288
		leftWingModel[0].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[1].addShapeBox(5F, -2F, -23F, 6, 3, 23, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 289
		leftWingModel[1].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[2].addShapeBox(11F, -2F, -23F, 8, 3, 23, 0F,0F, 1F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 290
		leftWingModel[2].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[3].addShapeBox(19F, -1.5F, -23F, 6, 1, 23, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 291
		leftWingModel[3].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[4].addShapeBox(0F, 1F, -23F, 5, 1, 23, 0F,0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 292
		leftWingModel[4].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[5].addShapeBox(0F, -3F, -67F, 5, 1, 44, 0F,-.5F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 310
		leftWingModel[5].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[6].addShapeBox(5F, -3F, -67F, 6, 3, 44, 0F,0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 311
		leftWingModel[6].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[7].addShapeBox(11F, -3F, -67F, 8, 3, 44, 0F,0F, 2.5F, 0F, 0F, 2F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 312
		leftWingModel[7].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[8].addShapeBox(0F, 0F, -67F, 5, 1, 44, 0F,0F, 3F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -3F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, -0.5F, -1F, 0F); // Box 313
		leftWingModel[8].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[9].addShapeBox(19F, -2.5F, -67F, 10, 1, 44, 0F,0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 314
		leftWingModel[9].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[10].addShapeBox(5F, -5F, -73F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 316
		leftWingModel[10].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[11].addShapeBox(0F, -3F, -73F, 5, 1, 6, 0F,-.5F, 1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F); // Box 317
		leftWingModel[11].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[12].addShapeBox(11F, -5F, -73F, 8, 2, 6, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 318
		leftWingModel[12].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[13].addShapeBox(19F, -4F, -73F, 10, 1, 6, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F); // Box 319
		leftWingModel[13].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[14].addShapeBox(0F, -4.5F, -76F, 5, 1, 3, 0F,-2.5F, 0F, -1.5F, 0F, .5F, 0F, 0F, .5F, 0F, -.5F, -.5F, 2F, -2.5F, -.3F, -1.5F, 0F, -.5F, 0F, 0F, .5F, 0F, -.5F, .5F, 2F); // Box 320
		leftWingModel[14].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[15].addShapeBox(5F, -5F, -79F, 6, 1, 6, 0F,0F, 0F, -3F, 0F, 0F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 321
		leftWingModel[15].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[16].addShapeBox(11F, -5F, -81F, 8, 1, 8, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 322
		leftWingModel[16].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[17].addShapeBox(19F, -4.5F, -81F, 10, 1, 8, 0F,0F, .5F, 0F, -1F, -1F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 323
		leftWingModel[17].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[18].addShapeBox(19F, -4.5F, -83F, 9, 1, 2, 0F,-6F, -.4F, -.5F, -1F, -.8F, -1F, 0F, -1F, 0F, 0F, .5F, 0F, -6F, 0F, -.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 324
		leftWingModel[18].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[19].addShapeBox(0F, -5F, -73F, 5, 1, 6, 0F,-.5F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 325
		leftWingModel[19].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[20].addShapeBox(0F, -27F, -23F, 5, 1, 23, 0F,0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -2F, 0F, 0F, -2.5F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F); // Box 348
		leftWingModel[20].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[21].addShapeBox(5F, -30F, -23F, 6, 3, 23, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 349
		leftWingModel[21].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[22].addShapeBox(11F, -30F, -23F, 8, 3, 23, 0F,0F, 1F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 350
		leftWingModel[22].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[23].addShapeBox(19F, -29.5F, -23F, 6, 1, 23, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 351
		leftWingModel[23].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[24].addShapeBox(19F, -30.5F, -67F, 10, 1, 44, 0F,0F, 2.5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 356
		leftWingModel[24].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[25].addShapeBox(11F, -31F, -67F, 8, 3, 44, 0F,0F, 2.5F, 0F, 0F, 2F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 357
		leftWingModel[25].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[26].addShapeBox(5F, -31F, -67F, 6, 3, 44, 0F,0F, 2F, 0F, 0F, 2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F); // Box 358
		leftWingModel[26].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[27].addShapeBox(0F, -28F, -67F, 5, 1, 44, 0F,0F, 3F, 0F, 0F, 4F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, -3F, 0F, 0F, -4F, 0F, 0F, -1.5F, 0F, -0.5F, -1F, 0F); // Box 359
		leftWingModel[27].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[28].addShapeBox(0F, -31F, -73F, 5, 1, 6, 0F,-.5F, 1F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, -1F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, -.5F, 0F, 0F); // Box 376
		leftWingModel[28].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[29].addShapeBox(0F, -32.5F, -76F, 5, 1, 3, 0F,-2.5F, 0F, -1.5F, 0F, .5F, 0F, 0F, .5F, 0F, -.5F, -.5F, 2F, -2.5F, -.3F, -1.5F, 0F, -.5F, 0F, 0F, .5F, 0F, -.5F, .5F, 2F); // Box 377
		leftWingModel[29].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[30].addShapeBox(5F, -33F, -79F, 6, 1, 6, 0F,0F, 0F, -3F, 0F, 0F, -.5F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -.5F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 378
		leftWingModel[30].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[31].addShapeBox(5F, -33F, -73F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F); // Box 379
		leftWingModel[31].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[32].addShapeBox(11F, -33F, -73F, 8, 2, 6, 0F,0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 380
		leftWingModel[32].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[33].addShapeBox(11F, -33F, -81F, 8, 1, 8, 0F,0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 381
		leftWingModel[33].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[34].addShapeBox(19F, -32.5F, -81F, 10, 1, 8, 0F,0F, .5F, 0F, -1F, -1F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, -1F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 382
		leftWingModel[34].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[35].addShapeBox(19F, -32F, -73F, 10, 1, 6, 0F,0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F); // Box 383
		leftWingModel[35].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[36].addShapeBox(19F, -32.5F, -83F, 9, 1, 2, 0F,-6F, -.4F, -.5F, -1F, -.8F, -1F, 0F, -1F, 0F, 0F, .5F, 0F, -6F, 0F, -.5F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, -.5F, 0F); // Box 384
		leftWingModel[36].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[37].addShapeBox(0F, -33F, -73F, 5, 1, 6, 0F,-.5F, -1F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, -.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F); // Box 385
		leftWingModel[37].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[38].addShapeBox(0F, -31F, -67F, 5, 1, 44, 0F,-.5F, 1F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 386
		leftWingModel[38].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[39].addShapeBox(0F, -30F, -23F, 5, 1, 23, 0F,-.5F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -.5F, -1F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 387
		leftWingModel[39].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[40].addShapeBox(5F, -29F, -25F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		leftWingModel[40].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[41].addShapeBox(5F, -31F, -64F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 402
		leftWingModel[41].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[42].addShapeBox(18F, -31F, -64F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 403
		leftWingModel[42].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[43].addShapeBox(18F, -29F, -25F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 404
		leftWingModel[43].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[44].addShapeBox(5F, -29F, -63F, 1, 1, 38, 0F,0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 14
		leftWingModel[44].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[45].addShapeBox(1F, -27F, -23F, 1, 1, 23, 0F,-4F, -24F, 0F, 4F, -24F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F, -4F, 24F, 0F, 4F, 24F, 0F, -.3F, 0F, 0F, -.3F, 0F, 0F); // Box 15
		leftWingModel[45].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[46].addShapeBox(5F, -4F, -63F, 1, 1, 38, 0F,0F, 27F, 0F, 0F, 27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 0F, -27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 16
		leftWingModel[46].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[47].addShapeBox(18F, -29F, -63F, 1, 1, 38, 0F,0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, 23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 22
		leftWingModel[47].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[48].addShapeBox(18F, -4F, -63F, 1, 1, 38, 0F,0F, 27F, 0F, 0F, 27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 0F, -27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 23
		leftWingModel[48].setRotationPoint(-17F, -13F, -7F);

		leftWingModel[49].addShapeBox(-17F, -2F, -81F, 30, 1, 30, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F); // Box 0
		leftWingModel[49].setRotationPoint(0F, -13F, 0F);

		leftWingModel[50].addShapeBox(-19F, -32.85F, -81F, 30, 1, 30, 0F,-1F, 1F, -1F, -1F, 1F, -1F, -1F, -.5F, -1F, -1F, -.5F, -1F, -1F, -1.5F, -1F, -1F, -1.5F, -1F, -1F, .5F, -1F, -1F, .5F, -1F); // Box 1
		leftWingModel[50].setRotationPoint(0F, -13F, 0F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 273, 50, textureX, textureY); // Box 326
		rightWingModel[1] = new ModelRendererTurbo(this, 229, 44, textureX, textureY); // Box 327
		rightWingModel[2] = new ModelRendererTurbo(this, 188, 39, textureX, textureY); // Box 328
		rightWingModel[3] = new ModelRendererTurbo(this, 151, 60, textureX, textureY); // Box 329
		rightWingModel[4] = new ModelRendererTurbo(this, 151, 34, textureX, textureY); // Box 330
		rightWingModel[5] = new ModelRendererTurbo(this, 267, 137, textureX, textureY); // Box 331
		rightWingModel[6] = new ModelRendererTurbo(this, 267, 87, textureX, textureY); // Box 332
		rightWingModel[7] = new ModelRendererTurbo(this, 208, 92, textureX, textureY); // Box 333
		rightWingModel[8] = new ModelRendererTurbo(this, 151, 134, textureX, textureY); // Box 334
		rightWingModel[9] = new ModelRendererTurbo(this, 151, 87, textureX, textureY); // Box 335
		rightWingModel[10] = new ModelRendererTurbo(this, 288, 31, textureX, textureY); // Box 336
		rightWingModel[11] = new ModelRendererTurbo(this, 310, 25, textureX, textureY); // Box 337
		rightWingModel[12] = new ModelRendererTurbo(this, 333, 47, textureX, textureY); // Box 338
		rightWingModel[13] = new ModelRendererTurbo(this, 309, 46, textureX, textureY); // Box 339
		rightWingModel[14] = new ModelRendererTurbo(this, 310, 35, textureX, textureY); // Box 340
		rightWingModel[15] = new ModelRendererTurbo(this, 333, 36, textureX, textureY); // Box 341
		rightWingModel[16] = new ModelRendererTurbo(this, 310, 59, textureX, textureY); // Box 342
		rightWingModel[17] = new ModelRendererTurbo(this, 333, 26, textureX, textureY); // Box 343
		rightWingModel[18] = new ModelRendererTurbo(this, 290, 25, textureX, textureY); // Box 344
		rightWingModel[19] = new ModelRendererTurbo(this, 287, 41, textureX, textureY); // Box 345
		rightWingModel[20] = new ModelRendererTurbo(this, 273, 50, textureX, textureY); // Box 352
		rightWingModel[21] = new ModelRendererTurbo(this, 229, 44, textureX, textureY); // Box 353
		rightWingModel[22] = new ModelRendererTurbo(this, 188, 39, textureX, textureY); // Box 354
		rightWingModel[23] = new ModelRendererTurbo(this, 151, 60, textureX, textureY); // Box 355
		rightWingModel[24] = new ModelRendererTurbo(this, 267, 87, textureX, textureY); // Box 360
		rightWingModel[25] = new ModelRendererTurbo(this, 208, 92, textureX, textureY); // Box 361
		rightWingModel[26] = new ModelRendererTurbo(this, 151, 134, textureX, textureY); // Box 362
		rightWingModel[27] = new ModelRendererTurbo(this, 267, 137, textureX, textureY); // Box 363
		rightWingModel[28] = new ModelRendererTurbo(this, 287, 41, textureX, textureY); // Box 364
		rightWingModel[29] = new ModelRendererTurbo(this, 290, 25, textureX, textureY); // Box 365
		rightWingModel[30] = new ModelRendererTurbo(this, 333, 26, textureX, textureY); // Box 366
		rightWingModel[31] = new ModelRendererTurbo(this, 310, 25, textureX, textureY); // Box 367
		rightWingModel[32] = new ModelRendererTurbo(this, 310, 35, textureX, textureY); // Box 368
		rightWingModel[33] = new ModelRendererTurbo(this, 333, 36, textureX, textureY); // Box 369
		rightWingModel[34] = new ModelRendererTurbo(this, 333, 47, textureX, textureY); // Box 370
		rightWingModel[35] = new ModelRendererTurbo(this, 309, 46, textureX, textureY); // Box 371
		rightWingModel[36] = new ModelRendererTurbo(this, 310, 59, textureX, textureY); // Box 372
		rightWingModel[37] = new ModelRendererTurbo(this, 288, 31, textureX, textureY); // Box 373
		rightWingModel[38] = new ModelRendererTurbo(this, 151, 87, textureX, textureY); // Box 374
		rightWingModel[39] = new ModelRendererTurbo(this, 151, 34, textureX, textureY); // Box 375
		rightWingModel[40] = new ModelRendererTurbo(this, 4, 235, textureX, textureY); // Box 405
		rightWingModel[41] = new ModelRendererTurbo(this, 4, 235, textureX, textureY); // Box 406
		rightWingModel[42] = new ModelRendererTurbo(this, 4, 235, textureX, textureY); // Box 407
		rightWingModel[43] = new ModelRendererTurbo(this, 4, 235, textureX, textureY); // Box 408
		rightWingModel[44] = new ModelRendererTurbo(this, 5, 305, textureX, textureY); // Box 17
		rightWingModel[45] = new ModelRendererTurbo(this, 5, 305, textureX, textureY); // Box 18
		rightWingModel[46] = new ModelRendererTurbo(this, 49, 315, textureX, textureY); // Box 19
		rightWingModel[47] = new ModelRendererTurbo(this, 5, 305, textureX, textureY); // Box 20
		rightWingModel[48] = new ModelRendererTurbo(this, 5, 305, textureX, textureY); // Box 21
		rightWingModel[49] = new ModelRendererTurbo(this, 386, 41, textureX, textureY); // Box 2
		rightWingModel[50] = new ModelRendererTurbo(this, 386, 7, textureX, textureY); // Box 3

		rightWingModel[0].addShapeBox(19F, -1.5F, 0F, 6, 1, 23, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		rightWingModel[0].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[1].addShapeBox(11F, -2F, 0F, 8, 3, 23, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 327
		rightWingModel[1].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[2].addShapeBox(5F, -2F, 0F, 6, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 328
		rightWingModel[2].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[3].addShapeBox(0F, 1F, 0F, 5, 1, 23, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -0.5F, -2F, 0F); // Box 329
		rightWingModel[3].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[4].addShapeBox(0F, -2F, 0F, 5, 1, 23, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 330
		rightWingModel[4].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[5].addShapeBox(19F, -2.5F, 23F, 10, 1, 44, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F); // Box 331
		rightWingModel[5].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[6].addShapeBox(11F, -3F, 23F, 8, 3, 44, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F); // Box 332
		rightWingModel[6].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[7].addShapeBox(5F, -3F, 23F, 6, 3, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, -.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F); // Box 333
		rightWingModel[7].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[8].addShapeBox(0F, 0F, 23F, 5, 1, 44, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, -0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, -0.5F, -3F, 0F); // Box 334
		rightWingModel[8].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[9].addShapeBox(0F, -3F, 23F, 5, 1, 44, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 335
		rightWingModel[9].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[10].addShapeBox(0F, -5F, 67F, 5, 1, 6, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Box 336
		rightWingModel[10].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[11].addShapeBox(5F, -5F, 67F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 337
		rightWingModel[11].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[12].addShapeBox(19F, -4.5F, 73F, 10, 1, 8, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 338
		rightWingModel[12].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[13].addShapeBox(19F, -4F, 67F, 10, 1, 6, 0F,0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 339
		rightWingModel[13].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[14].addShapeBox(11F, -5F, 67F, 8, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 340
		rightWingModel[14].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[15].addShapeBox(11F, -5F, 73F, 8, 1, 8, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 341
		rightWingModel[15].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[16].addShapeBox(19F, -4.5F, 81F, 9, 1, 2, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, -1F, -0.8F, -1F, -6F, -0.4F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -6F, 0F, -0.5F); // Box 342
		rightWingModel[16].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[17].addShapeBox(5F, -5F, 73F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F); // Box 343
		rightWingModel[17].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[18].addShapeBox(0F, -4.5F, 73F, 5, 1, 3, 0F,-0.5F, -0.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, -1.5F, -0.5F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -0.3F, -1.5F); // Box 344
		rightWingModel[18].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[19].addShapeBox(0F, -3F, 67F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, -2F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, -2F); // Box 345
		rightWingModel[19].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[20].addShapeBox(19F, -29.5F, 0F, 6, 1, 23, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		rightWingModel[20].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[21].addShapeBox(11F, -30F, 0F, 8, 3, 23, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 353
		rightWingModel[21].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[22].addShapeBox(5F, -30F, 0F, 6, 3, 23, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 354
		rightWingModel[22].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[23].addShapeBox(0F, -27F, 0F, 5, 1, 23, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, -0.5F, -1F, 0F, 0F, -1F, 0F, 0F, -2.5F, 0F, -0.5F, -2F, 0F); // Box 355
		rightWingModel[23].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[24].addShapeBox(11F, -31F, 23F, 8, 3, 44, 0F,0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 2F, 0F, 0F, 2.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 0F, -3.5F, 0F); // Box 360
		rightWingModel[24].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[25].addShapeBox(5F, -31F, 23F, 6, 3, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 2F, 0F, 0F, -.5F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, -3F, 0F); // Box 361
		rightWingModel[25].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[26].addShapeBox(0F, -28F, 23F, 5, 1, 44, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 4F, 0F, 0F, 3F, 0F, -0.5F, -1F, 0F, 0F, -1.5F, 0F, 0F, -4F, 0F, -0.5F, -3F, 0F); // Box 362
		rightWingModel[26].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[27].addShapeBox(19F, -30.5F, 23F, 10, 1, 44, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2.5F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F); // Box 363
		rightWingModel[27].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[28].addShapeBox(0F, -31F, 67F, 5, 1, 6, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.5F, 1F, -2F, -0.5F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -0.5F, -1F, -2F); // Box 364
		rightWingModel[28].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[29].addShapeBox(0F, -32.5F, 73F, 5, 1, 3, 0F,-0.5F, -0.5F, 2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -2.5F, 0F, -1.5F, -0.5F, 0.5F, 2F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, -2.5F, -0.3F, -1.5F); // Box 365
		rightWingModel[29].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[30].addShapeBox(5F, -33F, 73F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3F); // Box 366
		rightWingModel[30].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[31].addShapeBox(5F, -33F, 67F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		rightWingModel[31].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[32].addShapeBox(11F, -33F, 67F, 8, 2, 6, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		rightWingModel[32].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[33].addShapeBox(11F, -33F, 73F, 8, 1, 8, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F); // Box 369
		rightWingModel[33].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[34].addShapeBox(19F, -32.5F, 73F, 10, 1, 8, 0F,0F, 0.5F, 0F, 0F, -1.5F, 0F, -1F, -1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F); // Box 370
		rightWingModel[34].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[35].addShapeBox(19F, -32F, 67F, 10, 1, 6, 0F,0F, 1F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		rightWingModel[35].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[36].addShapeBox(19F, -32.5F, 81F, 9, 1, 2, 0F,0F, 0.5F, 0F, 0F, -1F, 0F, -1F, -0.8F, -1F, -6F, -0.4F, -0.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -6F, 0F, -0.5F); // Box 372
		rightWingModel[36].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[37].addShapeBox(0F, -33F, 67F, 5, 1, 6, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, -2F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, -2F); // Box 373
		rightWingModel[37].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[38].addShapeBox(0F, -31F, 23F, 5, 1, 44, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -0.5F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F); // Box 374
		rightWingModel[38].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[39].addShapeBox(0F, -30F, 0F, 5, 1, 23, 0F,-0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -0.5F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F); // Box 375
		rightWingModel[39].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[40].addShapeBox(5F, -29F, 24F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 405
		rightWingModel[40].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[41].addShapeBox(18F, -29F, 24F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 406
		rightWingModel[41].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[42].addShapeBox(5F, -31F, 63F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		rightWingModel[42].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[43].addShapeBox(18F, -31F, 63F, 1, 27, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		rightWingModel[43].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[44].addShapeBox(5F, -4F, 25F, 1, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, 0F, 27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 0F, -27F, 0F); // Box 17
		rightWingModel[44].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[45].addShapeBox(5F, -29F, 25F, 1, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, 23F, 0F); // Box 18
		rightWingModel[45].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[46].addShapeBox(1F, -27F, 0F, 1, 1, 23, 0F,-0.3F, 0F, 0F, -0.3F, 0F, 0F, 4F, -24F, 0F, -4F, -24F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 4F, 24F, 0F, -4F, 24F, 0F); // Box 19
		rightWingModel[46].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[47].addShapeBox(18F, -29F, 25F, 1, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 23F, 0F, 0F, 23F, 0F); // Box 20
		rightWingModel[47].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[48].addShapeBox(18F, -4F, 25F, 1, 1, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 27F, 0F, 0F, 27F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -27F, 0F, 0F, -27F, 0F); // Box 21
		rightWingModel[48].setRotationPoint(-17F, -13F, 7F);

		rightWingModel[49].addShapeBox(-17F, -2F, 51F, 30, 1, 30, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Box 2
		rightWingModel[49].setRotationPoint(0F, -13F, 0F);

		rightWingModel[50].addShapeBox(-19F, -32.85F, 51F, 30, 1, 30, 0F,-1F, -0.5F, -1F, -1F, -0.5F, -1F, -1F, 1F, -1F, -1F, 1F, -1F, -1F, 0.5F, -1F, -1F, 0.5F, -1F, -1F, -1.5F, -1F, -1F, -1.5F, -1F); // Box 3
		rightWingModel[50].setRotationPoint(0F, -13F, 0F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 58, 258, textureX, textureY); // Box 446
		yawFlapModel[1] = new ModelRendererTurbo(this, 69, 258, textureX, textureY); // Box 447
		yawFlapModel[2] = new ModelRendererTurbo(this, 80, 258, textureX, textureY); // Box 448
		yawFlapModel[3] = new ModelRendererTurbo(this, 91, 258, textureX, textureY); // Box 449
		yawFlapModel[4] = new ModelRendererTurbo(this, 102, 258, textureX, textureY); // Box 450
		yawFlapModel[5] = new ModelRendererTurbo(this, 112, 258, textureX, textureY); // Box 451
		yawFlapModel[6] = new ModelRendererTurbo(this, 112, 266, textureX, textureY); // Box 452

		yawFlapModel[0].addShapeBox(0F, -9F, -0.5F, 4, 24, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F); // Box 446
		yawFlapModel[0].setRotationPoint(83F, -36.5F, 0F);

		yawFlapModel[1].addShapeBox(4F, -9.5F, -0.5F, 4, 25, 1, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F); // Box 447
		yawFlapModel[1].setRotationPoint(83F, -36.5F, 0F);

		yawFlapModel[2].addShapeBox(8F, -10.5F, -0.5F, 4, 27, 1, 0F,0F, 0F, 0F, 0F, .5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, -.5F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -.5F, 0F); // Box 448
		yawFlapModel[2].setRotationPoint(83F, -36.5F, 0F);

		yawFlapModel[3].addShapeBox(12F, -10.5F, -0.5F, 4, 27, 1, 0F,0F, .5F, 0F, 0F, -.5F, 0F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, -1F, 0F); // Box 449
		yawFlapModel[3].setRotationPoint(83F, -36.5F, 0F);

		yawFlapModel[4].addShapeBox(16F, -9.5F, -0.5F, 3, 23, 1, 0F,0F, .5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, .5F, 0F, 0F, -.5F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -.5F, 0F); // Box 450
		yawFlapModel[4].setRotationPoint(83F, -36.5F, 0F);

		yawFlapModel[5].addShapeBox(19F, -7.5F, -0.5F, 2, 6, 1, 0F,0F, 0F, 0F, -.5F, -3F, 0F, -.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		yawFlapModel[5].setRotationPoint(83F, -36.5F, 0F);

		yawFlapModel[6].addShapeBox(19F, -1.5F, -0.5F, 2, 9, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -4F, 0F, -0.5F, -4F, 0F, 0F, 0F, 0F); // Box 452
		yawFlapModel[6].setRotationPoint(83F, -36.5F, 0F);
	}

	private void initpitchFlapLeftModel_1()
	{
		pitchFlapLeftModel[0] = new ModelRendererTurbo(this, 74, 222, textureX, textureY); // Box 434
		pitchFlapLeftModel[1] = new ModelRendererTurbo(this, 74, 233, textureX, textureY); // Box 435
		pitchFlapLeftModel[2] = new ModelRendererTurbo(this, 74, 241, textureX, textureY); // Box 436
		pitchFlapLeftModel[3] = new ModelRendererTurbo(this, 74, 241, textureX, textureY); // Box 437
		pitchFlapLeftModel[4] = new ModelRendererTurbo(this, 70, 247, textureX, textureY); // Box 438

		pitchFlapLeftModel[0].addShapeBox(0F, -0.5F, -8F, 10, 1, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3.5F, 0F, 0F, 0F); // Box 434
		pitchFlapLeftModel[0].setRotationPoint(82F, -36.5F, -2F);

		pitchFlapLeftModel[1].addShapeBox(0F, -0.5F, -13F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 435
		pitchFlapLeftModel[1].setRotationPoint(82F, -36.5F, -2F);

		pitchFlapLeftModel[2].addShapeBox(0F, -0.5F, -27F, 10, 1, 14, 0F,0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 436
		pitchFlapLeftModel[2].setRotationPoint(82F, -36.5F, -2F);

		pitchFlapLeftModel[3].addShapeBox(0F, -0.5F, -30F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 437
		pitchFlapLeftModel[3].setRotationPoint(82F, -36.5F, -2F);

		pitchFlapLeftModel[4].addShapeBox(3F, -0.5F, -30F, 5, 1, 3, 0F,0F, 0F, 0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 438
		pitchFlapLeftModel[4].setRotationPoint(82F, -36.5F, -2F);
	}

	private void initpitchFlapRightModel_1()
	{
		pitchFlapRightModel[0] = new ModelRendererTurbo(this, 74, 222, textureX, textureY); // Box 424
		pitchFlapRightModel[1] = new ModelRendererTurbo(this, 74, 233, textureX, textureY); // Box 425
		pitchFlapRightModel[2] = new ModelRendererTurbo(this, 74, 241, textureX, textureY); // Box 426
		pitchFlapRightModel[3] = new ModelRendererTurbo(this, 70, 247, textureX, textureY); // Box 427
		pitchFlapRightModel[4] = new ModelRendererTurbo(this, 74, 241, textureX, textureY); // Box 428

		pitchFlapRightModel[0].addShapeBox(0F, -0.5F, 0F, 10, 1, 8, 0F,0F, 0F, 0F, -3F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		pitchFlapRightModel[0].setRotationPoint(82F, -36.5F, 2F);

		pitchFlapRightModel[1].addShapeBox(0F, -0.5F, 8F, 10, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 425
		pitchFlapRightModel[1].setRotationPoint(82F, -36.5F, 2F);

		pitchFlapRightModel[2].addShapeBox(0F, -0.5F, 13F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Box 426
		pitchFlapRightModel[2].setRotationPoint(82F, -36.5F, 2F);

		pitchFlapRightModel[3].addShapeBox(3F, -0.5F, 27F, 5, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -.5F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -.5F, 0F, 0F, .5F); // Box 427
		pitchFlapRightModel[3].setRotationPoint(82F, -36.5F, 2F);

		pitchFlapRightModel[4].addShapeBox(0F, -0.5F, 27F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, .5F, 0F, 0F, 0F); // Box 428
		pitchFlapRightModel[4].setRotationPoint(82F, -36.5F, 2F);
	}

	private void initbodyWheelModel_1()
	{
		bodyWheelModel[0] = new ModelRendererTurbo(this, 111, 312, textureX, textureY); // Box 30
		bodyWheelModel[1] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Box 31
		bodyWheelModel[2] = new ModelRendererTurbo(this, 102, 288, textureX, textureY); // Box 32
		bodyWheelModel[3] = new ModelRendererTurbo(this, 110, 299, textureX, textureY); // Box 33
		bodyWheelModel[4] = new ModelRendererTurbo(this, 110, 293, textureX, textureY); // Box 34
		bodyWheelModel[5] = new ModelRendererTurbo(this, 125, 314, textureX, textureY); // Box 35
		bodyWheelModel[6] = new ModelRendererTurbo(this, 96, 293, textureX, textureY); // Box 38
		bodyWheelModel[7] = new ModelRendererTurbo(this, 96, 299, textureX, textureY); // Box 39
		bodyWheelModel[8] = new ModelRendererTurbo(this, 96, 305, textureX, textureY); // Box 40
		bodyWheelModel[9] = new ModelRendererTurbo(this, 97, 312, textureX, textureY); // Box 41
		bodyWheelModel[10] = new ModelRendererTurbo(this, 110, 288, textureX, textureY); // Box 42
		bodyWheelModel[11] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Box 43
		bodyWheelModel[12] = new ModelRendererTurbo(this, 96, 305, textureX, textureY); // Box 44
		bodyWheelModel[13] = new ModelRendererTurbo(this, 110, 299, textureX, textureY); // Box 47
		bodyWheelModel[14] = new ModelRendererTurbo(this, 96, 299, textureX, textureY); // Box 48
		bodyWheelModel[15] = new ModelRendererTurbo(this, 96, 293, textureX, textureY); // Box 49
		bodyWheelModel[16] = new ModelRendererTurbo(this, 110, 293, textureX, textureY); // Box 50
		bodyWheelModel[17] = new ModelRendererTurbo(this, 125, 308, textureX, textureY); // Box 51
		bodyWheelModel[18] = new ModelRendererTurbo(this, 125, 303, textureX, textureY); // Box 52
		bodyWheelModel[19] = new ModelRendererTurbo(this, 125, 299, textureX, textureY); // Box 53
		bodyWheelModel[20] = new ModelRendererTurbo(this, 125, 295, textureX, textureY); // Box 54
		bodyWheelModel[21] = new ModelRendererTurbo(this, 125, 291, textureX, textureY); // Box 55
		bodyWheelModel[22] = new ModelRendererTurbo(this, 125, 308, textureX, textureY); // Box 56
		bodyWheelModel[23] = new ModelRendererTurbo(this, 125, 303, textureX, textureY); // Box 57
		bodyWheelModel[24] = new ModelRendererTurbo(this, 125, 295, textureX, textureY); // Box 59
		bodyWheelModel[25] = new ModelRendererTurbo(this, 125, 291, textureX, textureY); // Box 60
		bodyWheelModel[26] = new ModelRendererTurbo(this, 125, 291, textureX, textureY); // Box 65
		bodyWheelModel[27] = new ModelRendererTurbo(this, 125, 295, textureX, textureY); // Box 66
		bodyWheelModel[28] = new ModelRendererTurbo(this, 125, 299, textureX, textureY); // Box 67
		bodyWheelModel[29] = new ModelRendererTurbo(this, 125, 295, textureX, textureY); // Box 68
		bodyWheelModel[30] = new ModelRendererTurbo(this, 125, 291, textureX, textureY); // Box 69
		bodyWheelModel[31] = new ModelRendererTurbo(this, 102, 288, textureX, textureY); // Box 70
		bodyWheelModel[32] = new ModelRendererTurbo(this, 110, 293, textureX, textureY); // Box 71
		bodyWheelModel[33] = new ModelRendererTurbo(this, 110, 299, textureX, textureY); // Box 72
		bodyWheelModel[34] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Box 73
		bodyWheelModel[35] = new ModelRendererTurbo(this, 111, 312, textureX, textureY); // Box 74
		bodyWheelModel[36] = new ModelRendererTurbo(this, 110, 305, textureX, textureY); // Box 75
		bodyWheelModel[37] = new ModelRendererTurbo(this, 110, 299, textureX, textureY); // Box 76
		bodyWheelModel[38] = new ModelRendererTurbo(this, 110, 293, textureX, textureY); // Box 77
		bodyWheelModel[39] = new ModelRendererTurbo(this, 96, 293, textureX, textureY); // Box 78
		bodyWheelModel[40] = new ModelRendererTurbo(this, 110, 288, textureX, textureY); // Box 79
		bodyWheelModel[41] = new ModelRendererTurbo(this, 96, 299, textureX, textureY); // Box 80
		bodyWheelModel[42] = new ModelRendererTurbo(this, 96, 305, textureX, textureY); // Box 81
		bodyWheelModel[43] = new ModelRendererTurbo(this, 97, 312, textureX, textureY); // Box 82
		bodyWheelModel[44] = new ModelRendererTurbo(this, 96, 305, textureX, textureY); // Box 83
		bodyWheelModel[45] = new ModelRendererTurbo(this, 96, 299, textureX, textureY); // Box 84
		bodyWheelModel[46] = new ModelRendererTurbo(this, 96, 293, textureX, textureY); // Box 85
		bodyWheelModel[47] = new ModelRendererTurbo(this, 125, 303, textureX, textureY); // Box 86
		bodyWheelModel[48] = new ModelRendererTurbo(this, 125, 308, textureX, textureY); // Box 87
		bodyWheelModel[49] = new ModelRendererTurbo(this, 125, 314, textureX, textureY); // Box 88
		bodyWheelModel[50] = new ModelRendererTurbo(this, 125, 308, textureX, textureY); // Box 89
		bodyWheelModel[51] = new ModelRendererTurbo(this, 125, 303, textureX, textureY); // Box 90

		bodyWheelModel[0].addShapeBox(-23F, 15F, -20F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyWheelModel[0].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[1].addShapeBox(-23F, 13F, -20F, 3, 2, 2, 0F,-.6F, 0F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 31
		bodyWheelModel[1].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[2].addShapeBox(-17F, 9F, -20F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 32
		bodyWheelModel[2].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[3].addShapeBox(-22F, 11F, -20F, 4, 2, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, .4F, 0F, 0F, -1.7F, -.3F, 0F, -1.7F, -.3F, 0F, .4F, 0F, 0F); // Box 33
		bodyWheelModel[3].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[4].addShapeBox(-21F, 9F, -20F, 4, 2, 2, 0F,-1.8F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 34
		bodyWheelModel[4].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[5].addShapeBox(-21F, 15F, -21.5F, 10, 2, 3, 0F,-4F, -.5F, 0F, -4F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -.5F, 0F, -4F, -.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyWheelModel[5].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[6].addShapeBox(-15F, 9F, -20F, 4, 2, 2, 0F,0F, 0F, 0F, -1.8F, -0.7F, 0F, -1.8F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyWheelModel[6].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[7].addShapeBox(-14F, 11F, -20F, 4, 2, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.7F, -0.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.7F, -0.3F, 0F); // Box 39
		bodyWheelModel[7].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[8].addShapeBox(-12F, 13F, -20F, 3, 2, 2, 0F,0.3F, 0.3F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.3F, 0.3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 40
		bodyWheelModel[8].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[9].addShapeBox(-11F, 15F, -20F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyWheelModel[9].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[10].addShapeBox(-17F, 21F, -20F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 42
		bodyWheelModel[10].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[11].addShapeBox(-23F, 17F, -20F, 3, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.6F, 0F, 0F); // Box 43
		bodyWheelModel[11].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[12].addShapeBox(-12F, 17F, -20F, 3, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0.3F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.3F, 0.3F, 0F); // Box 44
		bodyWheelModel[12].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[13].addShapeBox(-22F, 19F, -20F, 4, 2, 2, 0F,0.4F, 0F, 0F, -1.7F, -0.3F, 0F, -1.7F, -0.3F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 47
		bodyWheelModel[13].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[14].addShapeBox(-14F, 19F, -20F, 4, 2, 2, 0F,-1.7F, -0.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.7F, -0.3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 48
		bodyWheelModel[14].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[15].addShapeBox(-15F, 21F, -20F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -0.7F, 0F, -1.8F, -0.7F, 0F, 0F, 0F, 0F); // Box 49
		bodyWheelModel[15].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[16].addShapeBox(-21F, 21F, -20F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -0.7F, 0F); // Box 50
		bodyWheelModel[16].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[17].addShapeBox(-21F, 13F, -21.5F, 10, 2, 3, 0F,-4.5F, -2F, 0F, -4.5F, -2F, 0F, -1.3F, .3F, 0F, -1.3F, .3F, 0F, -4F, .5F, 0F, -4F, .5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyWheelModel[17].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[18].addShapeBox(-20F, 11F, -21.5F, 8, 2, 3, 0F,-3.5F, -4F, 0F, -3.5F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Box 52
		bodyWheelModel[18].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[19].addShapeBox(-21F, 15F, -18.5F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyWheelModel[19].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[20].addShapeBox(-21F, 13F, -18.5F, 10, 2, 1, 0F,-1.3F, .3F, 0F, -1.3F, .3F, 0F, -1.3F, .3F, 0F, -1.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyWheelModel[20].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[21].addShapeBox(-20F, 11F, -18.5F, 8, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Box 55
		bodyWheelModel[21].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[22].addShapeBox(-21F, 17F, -21.5F, 10, 2, 3, 0F,-4F, 0.5F, 0F, -4F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, -1.3F, 0.3F, 0F, -1.3F, 0.3F, 0F); // Box 56
		bodyWheelModel[22].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[23].addShapeBox(-20F, 19F, -21.5F, 8, 2, 3, 0F,-3.5F, 2F, 0F, -3.5F, 2F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 57
		bodyWheelModel[23].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[24].addShapeBox(-21F, 17F, -18.5F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0.3F, 0F, -1.3F, 0.3F, 0F, -1.3F, 0.3F, 0F, -1.3F, 0.3F, 0F); // Box 59
		bodyWheelModel[24].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[25].addShapeBox(-20F, 19F, -18.5F, 8, 2, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 60
		bodyWheelModel[25].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[26].addShapeBox(-20F, 11F, 17.5F, 8, 2, 1, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F, -.3F, -.3F, 0F); // Box 65
		bodyWheelModel[26].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[27].addShapeBox(-21F, 13F, 17.5F, 10, 2, 1, 0F,-1.3F, .3F, 0F, -1.3F, .3F, 0F, -1.3F, .3F, 0F, -1.3F, .3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyWheelModel[27].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[28].addShapeBox(-21F, 15F, 17.5F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyWheelModel[28].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[29].addShapeBox(-21F, 17F, 17.5F, 10, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3F, 0.3F, 0F, -1.3F, 0.3F, 0F, -1.3F, 0.3F, 0F, -1.3F, 0.3F, 0F); // Box 68
		bodyWheelModel[29].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[30].addShapeBox(-20F, 19F, 17.5F, 8, 2, 1, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 69
		bodyWheelModel[30].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[31].addShapeBox(-17F, 9F, 18F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 70
		bodyWheelModel[31].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[32].addShapeBox(-21F, 9F, 18F, 4, 2, 2, 0F,-1.8F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 71
		bodyWheelModel[32].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[33].addShapeBox(-22F, 11F, 18F, 4, 2, 2, 0F,-1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, .4F, 0F, 0F, -1.7F, -.3F, 0F, -1.7F, -.3F, 0F, .4F, 0F, 0F); // Box 72
		bodyWheelModel[33].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[34].addShapeBox(-23F, 13F, 18F, 3, 2, 2, 0F,-.6F, 0F, 0F, .3F, .3F, 0F, .3F, .3F, 0F, -.6F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyWheelModel[34].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[35].addShapeBox(-23F, 15F, 18F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 74
		bodyWheelModel[35].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[36].addShapeBox(-23F, 17F, 18F, 3, 2, 2, 0F,0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, -0.6F, 0F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, -0.6F, 0F, 0F); // Box 75
		bodyWheelModel[36].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[37].addShapeBox(-22F, 19F, 18F, 4, 2, 2, 0F,0.4F, 0F, 0F, -1.7F, -0.3F, 0F, -1.7F, -0.3F, 0F, 0.4F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F); // Box 76
		bodyWheelModel[37].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[38].addShapeBox(-21F, 21F, 18F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -0.7F, 0F); // Box 77
		bodyWheelModel[38].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[39].addShapeBox(-15F, 21F, 18F, 4, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.8F, -0.7F, 0F, -1.8F, -0.7F, 0F, 0F, 0F, 0F); // Box 78
		bodyWheelModel[39].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[40].addShapeBox(-17F, 21F, 18F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 79
		bodyWheelModel[40].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[41].addShapeBox(-14F, 19F, 18F, 4, 2, 2, 0F,-1.7F, -0.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.7F, -0.3F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F); // Box 80
		bodyWheelModel[41].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[42].addShapeBox(-12F, 17F, 18F, 3, 2, 2, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0.3F, 0.3F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.3F, 0.3F, 0F); // Box 81
		bodyWheelModel[42].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[43].addShapeBox(-11F, 15F, 18F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 82
		bodyWheelModel[43].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[44].addShapeBox(-12F, 13F, 18F, 3, 2, 2, 0F,0.3F, 0.3F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, 0.3F, 0.3F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 83
		bodyWheelModel[44].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[45].addShapeBox(-14F, 11F, 18F, 4, 2, 2, 0F,1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1.7F, -0.3F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, -1.7F, -0.3F, 0F); // Box 84
		bodyWheelModel[45].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[46].addShapeBox(-15F, 9F, 18F, 4, 2, 2, 0F,0F, 0F, 0F, -1.8F, -0.7F, 0F, -1.8F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 85
		bodyWheelModel[46].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[47].addShapeBox(-20F, 11F, 19.5F, 8, 2, 3, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F); // Box 86
		bodyWheelModel[47].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[48].addShapeBox(-21F, 13F, 19.5F, 10, 2, 3, 0F,-1.3F, 0.3F, 0F, -1.3F, 0.3F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F); // Box 87
		bodyWheelModel[48].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[49].addShapeBox(-21F, 15F, 19.5F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, -0.5F, 0F, -4F, -0.5F, 0F); // Box 88
		bodyWheelModel[49].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[50].addShapeBox(-21F, 17F, 19.5F, 10, 2, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0.5F, 0F, -4F, 0.5F, 0F, -1.3F, 0.3F, 0F, -1.3F, 0.3F, 0F, -4.5F, -2F, 0F, -4.5F, -2F, 0F); // Box 89
		bodyWheelModel[50].setRotationPoint(0F, -13F, 0F);

		bodyWheelModel[51].addShapeBox(-20F, 19F, 19.5F, 8, 2, 3, 0F,-0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -3.5F, 2F, 0F, -3.5F, 2F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3.5F, -4F, 0F, -3.5F, -4F, 0F); // Box 90
		bodyWheelModel[51].setRotationPoint(0F, -13F, 0F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[1][4];
		propellerModels[0] = makeProp1(10F, -25F, 0F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[4];
		prop[0] = new ModelRendererTurbo(this, 1, 2, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 1, 2, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 1, 2, textureX, textureY);
		prop[3] = new ModelRendererTurbo(this, 1, 2, textureX, textureY);
		prop[0].addBox(-0.5F, -26F, -1F, 1, 26, 2, 0.0F);
		prop[1].addBox(-0.5F, -26F, -1F, 1, 26, 2, 0.0F);
		prop[2].addBox(-0.5F, -26F, -1F, 1, 26, 2, 0.0F);
		prop[3].addBox(-0.5F, -26F, -1F, 1, 26, 2, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		prop[3].setRotationPoint(i, j, k);
		return prop;
	}
}