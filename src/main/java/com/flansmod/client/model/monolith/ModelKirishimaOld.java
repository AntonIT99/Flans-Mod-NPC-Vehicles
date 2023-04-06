//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: Kirishima
// Model Creator: 
// Created on: 17.06.2015 - 19:50:04
// Last changed on: 17.06.2015 - 19:50:04

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelKirishimaOld extends ModelVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelKirishimaOld() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[266];
		leftFrontWheelModel = new ModelRendererTurbo[1];

		initbodyModel_1();
		initleftFrontWheelModel_1();

		initGuns();

		translateAll(0F, 24F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 121, 65, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 345, 89, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 97, 105, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 593, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 697, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 13
		bodyModel[14] = new ModelRendererTurbo(this, 665, 57, textureX, textureY); // Box 14
		bodyModel[15] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 15
		bodyModel[16] = new ModelRendererTurbo(this, 897, 49, textureX, textureY); // Box 16
		bodyModel[17] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 17
		bodyModel[18] = new ModelRendererTurbo(this, 793, 57, textureX, textureY); // Box 18
		bodyModel[19] = new ModelRendererTurbo(this, 865, 73, textureX, textureY); // Box 19
		bodyModel[20] = new ModelRendererTurbo(this, 449, 105, textureX, textureY); // Box 20
		bodyModel[21] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 21
		bodyModel[22] = new ModelRendererTurbo(this, 785, 121, textureX, textureY); // Box 22
		bodyModel[23] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 23
		bodyModel[24] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 24
		bodyModel[25] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 25
		bodyModel[26] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 26
		bodyModel[27] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 27
		bodyModel[28] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 28
		bodyModel[29] = new ModelRendererTurbo(this, 105, 153, textureX, textureY); // Box 30
		bodyModel[30] = new ModelRendererTurbo(this, 953, 121, textureX, textureY); // Box 31
		bodyModel[31] = new ModelRendererTurbo(this, 385, 161, textureX, textureY); // Box 32
		bodyModel[32] = new ModelRendererTurbo(this, 481, 161, textureX, textureY); // Box 33
		bodyModel[33] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 34
		bodyModel[34] = new ModelRendererTurbo(this, 561, 169, textureX, textureY); // Box 35
		bodyModel[35] = new ModelRendererTurbo(this, 593, 169, textureX, textureY); // Box 36
		bodyModel[36] = new ModelRendererTurbo(this, 681, 169, textureX, textureY); // Box 37
		bodyModel[37] = new ModelRendererTurbo(this, 201, 177, textureX, textureY); // Box 38
		bodyModel[38] = new ModelRendererTurbo(this, 809, 177, textureX, textureY); // Box 39
		bodyModel[39] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Box 40
		bodyModel[40] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 41
		bodyModel[41] = new ModelRendererTurbo(this, 65, 193, textureX, textureY); // Box 42
		bodyModel[42] = new ModelRendererTurbo(this, 257, 193, textureX, textureY); // Box 43
		bodyModel[43] = new ModelRendererTurbo(this, 297, 201, textureX, textureY); // Box 44
		bodyModel[44] = new ModelRendererTurbo(this, 353, 209, textureX, textureY); // Box 45
		bodyModel[45] = new ModelRendererTurbo(this, 457, 209, textureX, textureY); // Box 46
		bodyModel[46] = new ModelRendererTurbo(this, 129, 217, textureX, textureY); // Box 47
		bodyModel[47] = new ModelRendererTurbo(this, 513, 217, textureX, textureY); // Box 48
		bodyModel[48] = new ModelRendererTurbo(this, 569, 225, textureX, textureY); // Box 49
		bodyModel[49] = new ModelRendererTurbo(this, 697, 225, textureX, textureY); // Box 50
		bodyModel[50] = new ModelRendererTurbo(this, 753, 225, textureX, textureY); // Box 51
		bodyModel[51] = new ModelRendererTurbo(this, 857, 193, textureX, textureY); // Box 52
		bodyModel[52] = new ModelRendererTurbo(this, 641, 169, textureX, textureY); // Box 53
		bodyModel[53] = new ModelRendererTurbo(this, 441, 161, textureX, textureY); // Box 54
		bodyModel[54] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 55
		bodyModel[55] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 56
		bodyModel[56] = new ModelRendererTurbo(this, 505, 1, textureX, textureY); // Box 57
		bodyModel[57] = new ModelRendererTurbo(this, 473, 33, textureX, textureY); // Box 58
		bodyModel[58] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 59
		bodyModel[59] = new ModelRendererTurbo(this, 289, 1, textureX, textureY); // Box 60
		bodyModel[60] = new ModelRendererTurbo(this, 425, 1, textureX, textureY); // Box 61
		bodyModel[61] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 62
		bodyModel[62] = new ModelRendererTurbo(this, 185, 233, textureX, textureY); // Box 63
		bodyModel[63] = new ModelRendererTurbo(this, 705, 1, textureX, textureY); // Box 64
		bodyModel[64] = new ModelRendererTurbo(this, 865, 1, textureX, textureY); // Box 65
		bodyModel[65] = new ModelRendererTurbo(this, 705, 17, textureX, textureY); // Box 66
		bodyModel[66] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 67
		bodyModel[67] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 68
		bodyModel[68] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 69
		bodyModel[69] = new ModelRendererTurbo(this, 521, 33, textureX, textureY); // Box 70
		bodyModel[70] = new ModelRendererTurbo(this, 977, 41, textureX, textureY); // Box 71
		bodyModel[71] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 72
		bodyModel[72] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 73
		bodyModel[73] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 74
		bodyModel[74] = new ModelRendererTurbo(this, 465, 57, textureX, textureY); // Box 75
		bodyModel[75] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 76
		bodyModel[76] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 77
		bodyModel[77] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 78
		bodyModel[78] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 79
		bodyModel[79] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 98
		bodyModel[80] = new ModelRendererTurbo(this, 977, 73, textureX, textureY); // Box 81
		bodyModel[81] = new ModelRendererTurbo(this, 1001, 73, textureX, textureY); // Box 82
		bodyModel[82] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 83
		bodyModel[83] = new ModelRendererTurbo(this, 601, 105, textureX, textureY); // Box 84
		bodyModel[84] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 88
		bodyModel[85] = new ModelRendererTurbo(this, 281, 17, textureX, textureY); // Box 89
		bodyModel[86] = new ModelRendererTurbo(this, 521, 17, textureX, textureY); // Box 90
		bodyModel[87] = new ModelRendererTurbo(this, 601, 17, textureX, textureY); // Box 91
		bodyModel[88] = new ModelRendererTurbo(this, 617, 1, textureX, textureY); // Box 92
		bodyModel[89] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 93
		bodyModel[90] = new ModelRendererTurbo(this, 1009, 1, textureX, textureY); // Box 94
		bodyModel[91] = new ModelRendererTurbo(this, 617, 9, textureX, textureY); // Box 95
		bodyModel[92] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 96
		bodyModel[93] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 97
		bodyModel[94] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 98
		bodyModel[95] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 99
		bodyModel[96] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 100
		bodyModel[97] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 101
		bodyModel[98] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 102
		bodyModel[99] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 103
		bodyModel[100] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 104
		bodyModel[101] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 105
		bodyModel[102] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 106
		bodyModel[103] = new ModelRendererTurbo(this, 529, 161, textureX, textureY); // Box 107
		bodyModel[104] = new ModelRendererTurbo(this, 417, 209, textureX, textureY); // Box 108
		bodyModel[105] = new ModelRendererTurbo(this, 953, 177, textureX, textureY); // Box 109
		bodyModel[106] = new ModelRendererTurbo(this, 657, 225, textureX, textureY); // Box 110
		bodyModel[107] = new ModelRendererTurbo(this, 769, 177, textureX, textureY); // Box 111
		bodyModel[108] = new ModelRendererTurbo(this, 809, 225, textureX, textureY); // Box 112
		bodyModel[109] = new ModelRendererTurbo(this, 353, 65, textureX, textureY); // Box 113
		bodyModel[110] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 115
		bodyModel[111] = new ModelRendererTurbo(this, 481, 73, textureX, textureY); // Box 141
		bodyModel[112] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 143
		bodyModel[113] = new ModelRendererTurbo(this, 121, 201, textureX, textureY); // Box 146
		bodyModel[114] = new ModelRendererTurbo(this, 993, 121, textureX, textureY); // Box 147
		bodyModel[115] = new ModelRendererTurbo(this, 897, 177, textureX, textureY); // Box 148
		bodyModel[116] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 149
		bodyModel[117] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 152
		bodyModel[118] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 159
		bodyModel[119] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 160
		bodyModel[120] = new ModelRendererTurbo(this, 105, 145, textureX, textureY); // Box 172
		bodyModel[121] = new ModelRendererTurbo(this, 169, 145, textureX, textureY); // Box 173
		bodyModel[122] = new ModelRendererTurbo(this, 625, 17, textureX, textureY); // Box 174
		bodyModel[123] = new ModelRendererTurbo(this, 497, 49, textureX, textureY); // Box 175
		bodyModel[124] = new ModelRendererTurbo(this, 969, 49, textureX, textureY); // Box 176
		bodyModel[125] = new ModelRendererTurbo(this, 1017, 49, textureX, textureY); // Box 177
		bodyModel[126] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 180
		bodyModel[127] = new ModelRendererTurbo(this, 137, 65, textureX, textureY); // Box 181
		bodyModel[128] = new ModelRendererTurbo(this, 833, 241, textureX, textureY); // Box 184
		bodyModel[129] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 185
		bodyModel[130] = new ModelRendererTurbo(this, 65, 249, textureX, textureY); // Box 186
		bodyModel[131] = new ModelRendererTurbo(this, 257, 241, textureX, textureY); // Box 187
		bodyModel[132] = new ModelRendererTurbo(this, 945, 241, textureX, textureY); // Box 188
		bodyModel[133] = new ModelRendererTurbo(this, 281, 257, textureX, textureY); // Box 189
		bodyModel[134] = new ModelRendererTurbo(this, 105, 161, textureX, textureY); // Box 198
		bodyModel[135] = new ModelRendererTurbo(this, 865, 17, textureX, textureY); // Box 199
		bodyModel[136] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 200
		bodyModel[137] = new ModelRendererTurbo(this, 409, 65, textureX, textureY); // Box 201
		bodyModel[138] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 202
		bodyModel[139] = new ModelRendererTurbo(this, 353, 193, textureX, textureY); // Box 203
		bodyModel[140] = new ModelRendererTurbo(this, 209, 169, textureX, textureY); // Box 204
		bodyModel[141] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 205
		bodyModel[142] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 206
		bodyModel[143] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 207
		bodyModel[144] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 208
		bodyModel[145] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 209
		bodyModel[146] = new ModelRendererTurbo(this, 425, 17, textureX, textureY); // Box 210
		bodyModel[147] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 211
		bodyModel[148] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 212
		bodyModel[149] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 213
		bodyModel[150] = new ModelRendererTurbo(this, 777, 273, textureX, textureY); // Box 223
		bodyModel[151] = new ModelRendererTurbo(this, 833, 273, textureX, textureY); // Box 224
		bodyModel[152] = new ModelRendererTurbo(this, 249, 265, textureX, textureY); // Box 225
		bodyModel[153] = new ModelRendererTurbo(this, 129, 145, textureX, textureY); // Box 226
		bodyModel[154] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 227
		bodyModel[155] = new ModelRendererTurbo(this, 65, 209, textureX, textureY); // Box 229
		bodyModel[156] = new ModelRendererTurbo(this, 169, 169, textureX, textureY); // Box 230
		bodyModel[157] = new ModelRendererTurbo(this, 353, 217, textureX, textureY); // Box 231
		bodyModel[158] = new ModelRendererTurbo(this, 873, 65, textureX, textureY); // Box 238
		bodyModel[159] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 239
		bodyModel[160] = new ModelRendererTurbo(this, 153, 193, textureX, textureY); // Box 240
		bodyModel[161] = new ModelRendererTurbo(this, 377, 145, textureX, textureY); // Box 241
		bodyModel[162] = new ModelRendererTurbo(this, 265, 25, textureX, textureY); // Box 242
		bodyModel[163] = new ModelRendererTurbo(this, 257, 129, textureX, textureY); // Box 243
		bodyModel[164] = new ModelRendererTurbo(this, 985, 25, textureX, textureY); // Box 247
		bodyModel[165] = new ModelRendererTurbo(this, 489, 161, textureX, textureY); // Box 248
		bodyModel[166] = new ModelRendererTurbo(this, 641, 169, textureX, textureY); // Box 249
		bodyModel[167] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 250
		bodyModel[168] = new ModelRendererTurbo(this, 697, 169, textureX, textureY); // Box 251
		bodyModel[169] = new ModelRendererTurbo(this, 769, 169, textureX, textureY); // Box 252
		bodyModel[170] = new ModelRendererTurbo(this, 425, 33, textureX, textureY); // Box 256
		bodyModel[171] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 257
		bodyModel[172] = new ModelRendererTurbo(this, 953, 177, textureX, textureY); // Box 258
		bodyModel[173] = new ModelRendererTurbo(this, 465, 41, textureX, textureY); // Box 259
		bodyModel[174] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 260
		bodyModel[175] = new ModelRendererTurbo(this, 553, 185, textureX, textureY); // Box 261
		bodyModel[176] = new ModelRendererTurbo(this, 641, 185, textureX, textureY); // Box 268
		bodyModel[177] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 269
		bodyModel[178] = new ModelRendererTurbo(this, 697, 185, textureX, textureY); // Box 270
		bodyModel[179] = new ModelRendererTurbo(this, 209, 193, textureX, textureY); // Box 274
		bodyModel[180] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 275
		bodyModel[181] = new ModelRendererTurbo(this, 769, 185, textureX, textureY); // Box 276
		bodyModel[182] = new ModelRendererTurbo(this, 305, 193, textureX, textureY); // Box 280
		bodyModel[183] = new ModelRendererTurbo(this, 889, 57, textureX, textureY); // Box 281
		bodyModel[184] = new ModelRendererTurbo(this, 273, 193, textureX, textureY); // Box 282
		bodyModel[185] = new ModelRendererTurbo(this, 449, 145, textureX, textureY); // Box 307
		bodyModel[186] = new ModelRendererTurbo(this, 577, 145, textureX, textureY); // Box 308
		bodyModel[187] = new ModelRendererTurbo(this, 785, 153, textureX, textureY); // Box 309
		bodyModel[188] = new ModelRendererTurbo(this, 41, 9, textureX, textureY); // Box 310
		bodyModel[189] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Box 311
		bodyModel[190] = new ModelRendererTurbo(this, 617, 17, textureX, textureY); // Box 312
		bodyModel[191] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 313
		bodyModel[192] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 314
		bodyModel[193] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Box 315
		bodyModel[194] = new ModelRendererTurbo(this, 489, 49, textureX, textureY); // Box 316
		bodyModel[195] = new ModelRendererTurbo(this, 321, 193, textureX, textureY); // Box 317
		bodyModel[196] = new ModelRendererTurbo(this, 385, 193, textureX, textureY); // Box 318
		bodyModel[197] = new ModelRendererTurbo(this, 441, 193, textureX, textureY); // Box 319
		bodyModel[198] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 320
		bodyModel[199] = new ModelRendererTurbo(this, 89, 65, textureX, textureY); // Box 321
		bodyModel[200] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 322
		bodyModel[201] = new ModelRendererTurbo(this, 337, 65, textureX, textureY); // Box 323
		bodyModel[202] = new ModelRendererTurbo(this, 441, 65, textureX, textureY); // Box 324
		bodyModel[203] = new ModelRendererTurbo(this, 537, 209, textureX, textureY); // Box 325
		bodyModel[204] = new ModelRendererTurbo(this, 673, 65, textureX, textureY); // Box 326
		bodyModel[205] = new ModelRendererTurbo(this, 665, 65, textureX, textureY); // Box 306
		bodyModel[206] = new ModelRendererTurbo(this, 457, 73, textureX, textureY); // Box 307
		bodyModel[207] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 328
		bodyModel[208] = new ModelRendererTurbo(this, 785, 113, textureX, textureY); // Box 329
		bodyModel[209] = new ModelRendererTurbo(this, 809, 113, textureX, textureY); // Box 330
		bodyModel[210] = new ModelRendererTurbo(this, 473, 49, textureX, textureY); // Box 331
		bodyModel[211] = new ModelRendererTurbo(this, 561, 41, textureX, textureY); // Box 332
		bodyModel[212] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 333
		bodyModel[213] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 334
		bodyModel[214] = new ModelRendererTurbo(this, 529, 161, textureX, textureY); // Box 335
		bodyModel[215] = new ModelRendererTurbo(this, 401, 145, textureX, textureY); // Box 336
		bodyModel[216] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 337
		bodyModel[217] = new ModelRendererTurbo(this, 953, 9, textureX, textureY); // Box 338
		bodyModel[218] = new ModelRendererTurbo(this, 1009, 9, textureX, textureY); // Box 339
		bodyModel[219] = new ModelRendererTurbo(this, 209, 25, textureX, textureY); // Box 340
		bodyModel[220] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 341
		bodyModel[221] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 342
		bodyModel[222] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 343
		bodyModel[223] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 344
		bodyModel[224] = new ModelRendererTurbo(this, 0, 400, textureX, textureY); // Box 345
		bodyModel[225] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 346
		bodyModel[226] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 347
		bodyModel[227] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 348
		bodyModel[228] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 349
		bodyModel[229] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 350
		bodyModel[230] = new ModelRendererTurbo(this, 793, 73, textureX, textureY); // Box 351
		bodyModel[231] = new ModelRendererTurbo(this, 441, 145, textureX, textureY); // Box 352
		bodyModel[232] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 353
		bodyModel[233] = new ModelRendererTurbo(this, 1, 209, textureX, textureY); // Box 354
		bodyModel[234] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 355
		bodyModel[235] = new ModelRendererTurbo(this, 65, 185, textureX, textureY); // Box 356
		bodyModel[236] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 357
		bodyModel[237] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 358
		bodyModel[238] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 360
		bodyModel[239] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 361
		bodyModel[240] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 362
		bodyModel[241] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 363
		bodyModel[242] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 364
		bodyModel[243] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 365
		bodyModel[244] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 366
		bodyModel[245] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 367
		bodyModel[246] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 368
		bodyModel[247] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 369
		bodyModel[248] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 370
		bodyModel[249] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 371
		bodyModel[250] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 372
		bodyModel[251] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 373
		bodyModel[252] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 374
		bodyModel[253] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 375
		bodyModel[254] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 376
		bodyModel[255] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 377
		bodyModel[256] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 378
		bodyModel[257] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 379
		bodyModel[258] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 380
		bodyModel[259] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 381
		bodyModel[260] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 382
		bodyModel[261] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 383
		bodyModel[262] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 384
		bodyModel[263] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 386
		bodyModel[264] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 387
		bodyModel[265] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Box 388

		bodyModel[0].addBox(0F, 0F, -23F, 80, 10, 46, 0F); // Box 1
		bodyModel[0].setRotationPoint(-20F, -25F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, -23F, 60, 10, 46, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 1
		bodyModel[1].setRotationPoint(-80F, -25F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, -17F, 25, 10, 34, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F); // Box 2
		bodyModel[2].setRotationPoint(-105F, -25F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, -13.5F, 36, 10, 27, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 3
		bodyModel[3].setRotationPoint(-141F, -25F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, -7.5F, 19, 7, 15, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F); // Box 4
		bodyModel[4].setRotationPoint(-160F, -25F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, -23F, 40, 10, 46, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 5
		bodyModel[5].setRotationPoint(60F, -25F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, -19F, 35, 10, 38, 0F,0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F); // Box 6
		bodyModel[6].setRotationPoint(100F, -25F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, -12F, 27, 10, 24, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F); // Box 7
		bodyModel[7].setRotationPoint(135F, -25F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, -10F, 27, 10, 20, 0F,0F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -3F, 0F, 0F, -4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -4F); // Box 8
		bodyModel[8].setRotationPoint(162F, -25F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, -10F, 27, 7, 20, 0F,0F, 0F, -4F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -4F, 0F, 0F, -6F, -3F, 0F, -10F, -3F, 0F, -10F, 0F, 0F, -6F); // Box 9
		bodyModel[9].setRotationPoint(162F, -15F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, -12F, 27, 7, 24, 0F,0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, -2F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -6F); // Box 10
		bodyModel[10].setRotationPoint(135F, -15F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, -19F, 35, 7, 38, 0F,0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -3F); // Box 11
		bodyModel[11].setRotationPoint(100F, -15F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, -23F, 60, 7, 46, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F); // Box 12
		bodyModel[12].setRotationPoint(-80F, -15F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, -23F, 80, 7, 46, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F); // Box 13
		bodyModel[13].setRotationPoint(-20F, -15F, 0F);

		bodyModel[14].addShapeBox(0F, 0F, -23F, 40, 7, 46, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -3F); // Box 14
		bodyModel[14].setRotationPoint(60F, -15F, 0F);

		bodyModel[15].addShapeBox(0F, 0F, -17F, 25, 7, 34, 0F,0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -6.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6.5F); // Box 15
		bodyModel[15].setRotationPoint(-105F, -15F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, -9F, 24, 5, 18, 0F,0F, 0F, -5F, 0F, 0F, -9F, 0F, 0F, -9F, 0F, 0F, -5F, 0F, 0F, -9F, -20F, 0F, -9F, -20F, 0F, -9F, 0F, 0F, -9F); // Box 16
		bodyModel[16].setRotationPoint(162F, -8F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, -7.5F, 19, 3, 15, 0F,1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 17
		bodyModel[17].setRotationPoint(-160F, -18F, 0F);

		bodyModel[18].addShapeBox(0F, 0F, -12F, 27, 5, 24, 0F,0F, 0F, -6F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -6F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F, 0F, 0F, -12F); // Box 18
		bodyModel[18].setRotationPoint(135F, -8F, 0F);

		bodyModel[19].addShapeBox(0F, 0F, -19F, 35, 5, 38, 0F,0F, 0F, -3F, 0F, 0F, -13F, 0F, 0F, -13F, 0F, 0F, -3F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -19F, 0F, 0F, -19F); // Box 19
		bodyModel[19].setRotationPoint(100F, -8F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, -23F, 40, 5, 46, 0F,0F, 0F, -3F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, -3F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F); // Box 20
		bodyModel[20].setRotationPoint(60F, -8F, 0F);

		bodyModel[21].addShapeBox(0F, 0F, -23F, 80, 5, 46, 0F,0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F); // Box 21
		bodyModel[21].setRotationPoint(-20F, -8F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, -23F, 60, 5, 46, 0F,0F, 0F, -8F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -8F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F, 0F, 0F, -23F); // Box 22
		bodyModel[22].setRotationPoint(-80F, -8F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, -17F, 25, 5, 34, 0F,0F, 0F, -6.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -6.5F, -2F, 0F, -17F, 0F, 0F, -17F, 0F, 0F, -17F, -2F, 0F, -17F); // Box 23
		bodyModel[23].setRotationPoint(-105F, -8F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, -10F, 27, 5, 20, 0F,0F, 0F, 1F, 4F, 2F, -10F, 4F, 2F, -10F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, -10F, 0F, 0F, -10F, 0F, 0F, -3F); // Box 24
		bodyModel[24].setRotationPoint(162F, -30F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 25
		bodyModel[25].setRotationPoint(190.4F, -41F, -0.5F);

		bodyModel[26].addShapeBox(0F, 0F, -13.5F, 36, 7, 27, 0F,0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, -4F, -10.5F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, -4F, -10.5F); // Box 26
		bodyModel[26].setRotationPoint(-141F, -15F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, -7.5F, 18, 3, 15, 0F,1F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -6F, 1F, -3F, -6F, 0F, 0F, -4.5F, 0F, 0F, -4.5F, 1F, -3F, -6F); // Box 27
		bodyModel[27].setRotationPoint(-159F, -15F, 0F);

		bodyModel[28].addShapeBox(0F, 0F, -11F, 51, 6, 22, 0F,0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 28
		bodyModel[28].setRotationPoint(111F, -29F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, -15F, 15, 6, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 30
		bodyModel[29].setRotationPoint(93F, -30F, 0F);

		bodyModel[30].addShapeBox(0F, 0F, -15F, 3, 6, 30, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 31
		bodyModel[30].setRotationPoint(108F, -30F, 0F);

		bodyModel[31].addShapeBox(0F, 0F, -15F, 9, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 32
		bodyModel[31].setRotationPoint(80F, -30F, -3F);

		bodyModel[32].addShapeBox(0F, 0F, -15F, 4, 6, 34, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Box 33
		bodyModel[32].setRotationPoint(89F, -30F, -2F);

		bodyModel[33].addShapeBox(0F, 0F, -15F, 3, 6, 36, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 34
		bodyModel[33].setRotationPoint(77F, -30F, -3F);

		bodyModel[34].addShapeBox(0F, 0F, -15F, 3, 6, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 35
		bodyModel[34].setRotationPoint(74F, -30F, -1F);

		bodyModel[35].addShapeBox(0F, 0F, -15F, 3, 6, 40, 0F,0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F); // Box 36
		bodyModel[35].setRotationPoint(71F, -30F, -5F);

		bodyModel[36].addShapeBox(0F, 0F, -15F, 19, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 37
		bodyModel[36].setRotationPoint(52F, -30F, -6F);

		bodyModel[37].addShapeBox(0F, 0F, -15F, 3, 6, 42, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 38
		bodyModel[37].setRotationPoint(49F, -30F, -6F);

		bodyModel[38].addShapeBox(0F, 0F, -15F, 4, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[38].setRotationPoint(45F, -30F, -3F);

		bodyModel[39].addShapeBox(0F, 0F, -15F, 3, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 40
		bodyModel[39].setRotationPoint(42F, -30F, -6F);

		bodyModel[40].addShapeBox(0F, 0F, -15F, 9, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 41
		bodyModel[40].setRotationPoint(33F, -30F, -6F);

		bodyModel[41].addShapeBox(0F, 0F, -15F, 5, 6, 42, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 42
		bodyModel[41].setRotationPoint(28F, -30F, -6F);

		bodyModel[42].addShapeBox(0F, 0F, -15F, 2, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 43
		bodyModel[42].setRotationPoint(26F, -30F, -3F);

		bodyModel[43].addShapeBox(0F, 0F, -15F, 4, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 44
		bodyModel[43].setRotationPoint(22F, -30F, -6F);

		bodyModel[44].addShapeBox(0F, 0F, -15F, 9, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[44].setRotationPoint(13F, -30F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, -15F, 4, 6, 42, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 46
		bodyModel[45].setRotationPoint(9F, -30F, -6F);

		bodyModel[46].addShapeBox(0F, 0F, -15F, 3, 6, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[46].setRotationPoint(6F, -30F, -3F);

		bodyModel[47].addShapeBox(0F, 0F, -15F, 5, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 48
		bodyModel[47].setRotationPoint(1F, -30F, -6F);

		bodyModel[48].addShapeBox(0F, 0F, -15F, 19, 6, 42, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 49
		bodyModel[48].setRotationPoint(-18F, -30F, -6F);

		bodyModel[49].addShapeBox(0F, 0F, -15F, 3, 6, 42, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 50
		bodyModel[49].setRotationPoint(-21F, -30F, -6F);

		bodyModel[50].addShapeBox(0F, 0F, -15F, 10, 6, 34, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 51
		bodyModel[50].setRotationPoint(-31F, -30F, -2F);

		bodyModel[51].addShapeBox(0F, 0F, -15F, 2, 6, 34, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 52
		bodyModel[51].setRotationPoint(-33F, -30F, -2F);

		bodyModel[52].addShapeBox(0F, 0F, -15F, 12, 6, 27, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 53
		bodyModel[52].setRotationPoint(-45F, -30F, 3F);

		bodyModel[53].addShapeBox(0F, 0F, -15F, 13, 6, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 54
		bodyModel[53].setRotationPoint(-58F, -30F, 3F);

		bodyModel[54].addShapeBox(0F, 0F, -6F, 14, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 55
		bodyModel[54].setRotationPoint(-72F, -30F, 3F);

		bodyModel[55].addShapeBox(0F, 0F, -6F, 5, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		bodyModel[55].setRotationPoint(-63F, -30F, 9F);

		bodyModel[56].addShapeBox(0F, 0F, -6F, 9, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6F); // Box 57
		bodyModel[56].setRotationPoint(-72F, -30F, 9F);

		bodyModel[57].addShapeBox(0F, 0F, -9F, 14, 6, 9, 0F,0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[57].setRotationPoint(-72F, -30F, -3F);

		bodyModel[58].addShapeBox(10F, 0F, -4F, 2, 6, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		bodyModel[58].setRotationPoint(-72F, -30F, -3F);
		bodyModel[58].rotateAngleY = -0.57595865F;

		bodyModel[59].addShapeBox(0F, 0F, -3.5F, 2, 6, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		bodyModel[59].setRotationPoint(-37F, -30F, -12.5F);
		bodyModel[59].rotateAngleY = -1.57079633F;

		bodyModel[60].addShapeBox(0F, 0F, -3.5F, 3, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 61
		bodyModel[60].setRotationPoint(-33F, -30F, -12F);
		bodyModel[60].rotateAngleY = -1.57079633F;

		bodyModel[61].addShapeBox(0F, 0F, -3.5F, 2, 6, 4, 0F,0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[61].setRotationPoint(-45.5F, -30F, 12.5F);
		bodyModel[61].rotateAngleY = -1.57079633F;

		bodyModel[62].addShapeBox(0F, 0F, -13.5F, 22, 4, 27, 0F,-5F, 2F, -13.5F, 0F, 0F, -3F, 0F, 0F, -3F, -5F, 2F, -13.5F, -9F, -0.1F, -13.5F, 2F, 0F, -12F, 2F, 0F, -12F, -9F, -0.1F, -13.5F); // Box 63
		bodyModel[62].setRotationPoint(-127F, -8F, 0F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 64
		bodyModel[63].setRotationPoint(110F, -31.2F, 0F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 65
		bodyModel[64].setRotationPoint(118F, -31.2F, 0F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[65].setRotationPoint(110F, -31.2F, -8F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 8, 2, 8, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[66].setRotationPoint(118F, -31.2F, -8F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 8, 7, 8, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[67].setRotationPoint(89F, -36F, -8F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 8, 7, 8, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[68].setRotationPoint(97F, -36F, -8F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 8, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 70
		bodyModel[69].setRotationPoint(97F, -36F, 0F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 8, 7, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 71
		bodyModel[70].setRotationPoint(89F, -36F, 0F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 72
		bodyModel[71].setRotationPoint(-30.8F, -33.2F, -8F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 73
		bodyModel[72].setRotationPoint(-22.8F, -33.2F, -8F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 74
		bodyModel[73].setRotationPoint(-22.8F, -33.2F, 0F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 8, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 75
		bodyModel[74].setRotationPoint(-30.8F, -33.2F, 0F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,-2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 76
		bodyModel[75].setRotationPoint(-94.8F, -27.6F, -8F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 77
		bodyModel[76].setRotationPoint(-86.8F, -27.6F, -8F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F); // Box 78
		bodyModel[77].setRotationPoint(-86.8F, -27.6F, 0F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 8, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2F); // Box 79
		bodyModel[78].setRotationPoint(-94.8F, -27.6F, 0F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 98
		bodyModel[79].setRotationPoint(-133F, -12F, -0.5F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 81
		bodyModel[80].setRotationPoint(2F, -53F, 0F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 82
		bodyModel[81].setRotationPoint(6F, -53F, 0F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 83
		bodyModel[82].setRotationPoint(2F, -53F, -4F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 84
		bodyModel[83].setRotationPoint(6F, -53F, -4F);

		bodyModel[84].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 88
		bodyModel[84].setRotationPoint(6F, -55F, 0F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 89
		bodyModel[85].setRotationPoint(2F, -55F, 0F);

		bodyModel[86].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 90
		bodyModel[86].setRotationPoint(6F, -55F, -4F);

		bodyModel[87].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 91
		bodyModel[87].setRotationPoint(2F, -55F, -4F);

		bodyModel[88].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 92
		bodyModel[88].setRotationPoint(3F, -56F, 0F);

		bodyModel[89].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 93
		bodyModel[89].setRotationPoint(3F, -56F, -3F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 94
		bodyModel[90].setRotationPoint(6F, -56F, 0F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 95
		bodyModel[91].setRotationPoint(6F, -56F, -3F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 96
		bodyModel[92].setRotationPoint(31.5F, -56F, -3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 97
		bodyModel[93].setRotationPoint(28.5F, -56F, -3F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 98
		bodyModel[94].setRotationPoint(27.5F, -55F, -4F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 99
		bodyModel[95].setRotationPoint(31.5F, -55F, -4F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 100
		bodyModel[96].setRotationPoint(31.5F, -56F, 0F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 101
		bodyModel[97].setRotationPoint(28.5F, -56F, 0F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 102
		bodyModel[98].setRotationPoint(27.5F, -55F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 103
		bodyModel[99].setRotationPoint(31.5F, -55F, 0F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 104
		bodyModel[100].setRotationPoint(27.5F, -53F, 0F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 105
		bodyModel[101].setRotationPoint(31.5F, -53F, 0F);

		bodyModel[102].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 106
		bodyModel[102].setRotationPoint(31.5F, -53F, -4F);

		bodyModel[103].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 107
		bodyModel[103].setRotationPoint(27.5F, -53F, -4F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 12, 6, 28, 0F,0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -6F, -2F, 0F, -6F, 0F, 0F, 0F); // Box 108
		bodyModel[104].setRotationPoint(78F, -35F, -14F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 7, 6, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 109
		bodyModel[105].setRotationPoint(71F, -35F, -14F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 4, 6, 28, 0F,0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F); // Box 110
		bodyModel[106].setRotationPoint(67F, -35F, -14F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 11, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F); // Box 111
		bodyModel[107].setRotationPoint(65F, -41F, -9F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 6, 11, 18, 0F,0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 112
		bodyModel[108].setRotationPoint(76F, -41F, -9F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 15, 1, 18, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Box 113
		bodyModel[109].setRotationPoint(55.5F, -45.5F, -9F);

		bodyModel[110].addShapeBox(0F, -2F, 0F, 7, 7, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 115
		bodyModel[110].setRotationPoint(58F, -45.5F, -5F);

		bodyModel[111].addShapeBox(5F, 0F, 0F, 4, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 141
		bodyModel[111].setRotationPoint(59F, -53F, -3F);

		bodyModel[112].addShapeBox(5F, 0F, 0F, 5, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		bodyModel[112].setRotationPoint(59F, -48F, -3F);

		bodyModel[113].addShapeBox(0F, -2F, 0F, 14, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 146
		bodyModel[113].setRotationPoint(64F, -42.5F, -8F);

		bodyModel[114].addShapeBox(0F, -2F, 0F, 7, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 147
		bodyModel[114].setRotationPoint(71F, -42.5F, -4F);

		bodyModel[115].addShapeBox(0F, -2F, 0F, 7, 10, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 148
		bodyModel[115].setRotationPoint(77F, -42.5F, -7F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 5, 6, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 149
		bodyModel[116].setRotationPoint(76.5F, -50.5F, -5F);

		bodyModel[117].addShapeBox(0F, -2F, 0F, 8, 4, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 152
		bodyModel[117].setRotationPoint(69F, -46.5F, -6F);

		bodyModel[118].addShapeBox(0F, -2F, 0F, 6, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 159
		bodyModel[118].setRotationPoint(68F, -53.5F, -6F);

		bodyModel[119].addShapeBox(0F, -2F, 0F, 4, 7, 12, 0F,0F, 0F, 0F, 1F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F); // Box 160
		bodyModel[119].setRotationPoint(74F, -53.5F, -6F);

		bodyModel[120].addShapeBox(0F, -2F, 0F, 7, 7, 4, 0F,0F, 5F, 0F, 1F, 5F, 0F, 1F, 5F, 0F, 0F, 5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 172
		bodyModel[120].setRotationPoint(57F, -33.5F, -2F);

		bodyModel[121].addShapeBox(0F, -2F, 0F, 7, 7, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F); // Box 173
		bodyModel[121].setRotationPoint(57F, -30.5F, -3F);

		bodyModel[122].addShapeBox(-0.5F, -5.5F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 174
		bodyModel[122].setRotationPoint(60.5F, -36.5F, -4F);
		bodyModel[122].rotateAngleZ = 0.55850536F;

		bodyModel[123].addShapeBox(-0.5F, -5.5F, -0.5F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 175
		bodyModel[123].setRotationPoint(60.5F, -36.5F, -4F);
		bodyModel[123].rotateAngleZ = -0.55850536F;

		bodyModel[124].addShapeBox(-0.5F, -5.5F, -0.5F, 1, 12, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 176
		bodyModel[124].setRotationPoint(60.5F, -36.5F, 3F);
		bodyModel[124].rotateAngleZ = 0.55850536F;

		bodyModel[125].addShapeBox(-0.5F, -5.5F, -0.5F, 1, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 177
		bodyModel[125].setRotationPoint(60.5F, -36.5F, 3F);
		bodyModel[125].rotateAngleZ = -0.55850536F;

		bodyModel[126].addShapeBox(0F, 0F, 0F, 4, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 180
		bodyModel[126].setRotationPoint(54.5F, -48.5F, -1.5F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 181
		bodyModel[127].setRotationPoint(55.5F, -50F, -1F);

		bodyModel[128].addShapeBox(0F, 0F, 0F, 26, 4, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 184
		bodyModel[128].setRotationPoint(29F, -33F, -13F);

		bodyModel[129].addShapeBox(0F, 0F, 0F, 12, 4, 18, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 185
		bodyModel[129].setRotationPoint(17F, -33F, -9F);

		bodyModel[130].addShapeBox(0F, 0F, 0F, 14, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 186
		bodyModel[130].setRotationPoint(2F, -33F, -7F);

		bodyModel[131].addShapeBox(0F, 0F, 0F, 10, 4, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 187
		bodyModel[131].setRotationPoint(-9F, -33F, -7F);

		bodyModel[132].addShapeBox(0F, 0F, 0F, 8, 2, 28, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 188
		bodyModel[132].setRotationPoint(20F, -35F, -14F);

		bodyModel[133].addShapeBox(0F, 0F, 0F, 5, 2, 28, 0F,0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F); // Box 189
		bodyModel[133].setRotationPoint(15F, -35F, -14F);

		bodyModel[134].addShapeBox(0F, 0F, 0F, 6, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 198
		bodyModel[134].setRotationPoint(23.5F, -47F, -3F);

		bodyModel[135].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 199
		bodyModel[135].setRotationPoint(23.8F, -49F, -2F);

		bodyModel[136].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 200
		bodyModel[136].setRotationPoint(26.2F, -49F, -2F);

		bodyModel[137].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 201
		bodyModel[137].setRotationPoint(24.5F, -50F, -2F);

		bodyModel[138].addShapeBox(0F, 0F, 0F, 1, 11, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 202
		bodyModel[138].setRotationPoint(23.8F, -45F, -2F);

		bodyModel[139].addShapeBox(0F, 0F, 0F, 8, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 203
		bodyModel[139].setRotationPoint(10F, -39F, -6F);

		bodyModel[140].addShapeBox(0F, 0F, 0F, 4, 7, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 204
		bodyModel[140].setRotationPoint(18F, -39F, -6F);

		bodyModel[141].addShapeBox(0F, 0F, 0F, 1, 34, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[141].setRotationPoint(15F, -71F, -0.5F);

		bodyModel[142].addShapeBox(0F, 0F, 0F, 1, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 206
		bodyModel[142].setRotationPoint(14F, -68F, -0.5F);
		bodyModel[142].rotateAngleX = -0.13962634F;
		bodyModel[142].rotateAngleZ = -0.13962634F;

		bodyModel[143].addShapeBox(0F, 0F, 0F, 1, 36, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 207
		bodyModel[143].setRotationPoint(14F, -68F, -0.5F);
		bodyModel[143].rotateAngleX = 0.13962634F;
		bodyModel[143].rotateAngleZ = -0.13962634F;

		bodyModel[144].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 208
		bodyModel[144].setRotationPoint(11F, -49F, -6F);

		bodyModel[145].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 209
		bodyModel[145].setRotationPoint(13F, -68.5F, -2F);

		bodyModel[146].addShapeBox(0F, 0F, -0.5F, 8, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 210
		bodyModel[146].setRotationPoint(7F, -68.5F, -4.5F);
		bodyModel[146].rotateAngleY = 0.52359878F;

		bodyModel[147].addShapeBox(0F, 0F, -0.5F, 8, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 211
		bodyModel[147].setRotationPoint(7F, -68.5F, 3.5F);
		bodyModel[147].rotateAngleY = -0.52359878F;

		bodyModel[148].addShapeBox(0F, 0F, -0.5F, 4, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 212
		bodyModel[148].setRotationPoint(12F, -71F, 0F);

		bodyModel[149].addShapeBox(-0.5F, 0F, 0F, 1, 80, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 213
		bodyModel[149].setRotationPoint(17F, -145F, -0.5F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 10, 7, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 223
		bodyModel[150].setRotationPoint(-10F, -39F, -7F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 10, 8, 14, 0F,0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		bodyModel[151].setRotationPoint(-10F, -47F, -7F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 10, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		bodyModel[152].setRotationPoint(-11.5F, -48F, -7F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 6, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 226
		bodyModel[153].setRotationPoint(-9.5F, -49F, -3F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 227
		bodyModel[154].setRotationPoint(-7.5F, -53F, -2F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 5, 2, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 229
		bodyModel[155].setRotationPoint(-14.5F, -43F, -6F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 5, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F); // Box 230
		bodyModel[156].setRotationPoint(-13.5F, -41F, -4F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 7, 13, 10, 0F,-2F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 231
		bodyModel[157].setRotationPoint(48.5F, -36F, -5F);

		bodyModel[158].addShapeBox(0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 238
		bodyModel[158].setRotationPoint(10.3F, -73F, 0F);
		bodyModel[158].rotateAngleZ = -0.73303829F;

		bodyModel[159].addShapeBox(0F, 0F, -0.5F, 1, 5, 1, 0F,-0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.4F); // Box 239
		bodyModel[159].setRotationPoint(10F, -72.5F, 0F);
		bodyModel[159].rotateAngleZ = 0.10471976F;

		bodyModel[160].addShapeBox(-9.4F, -3F, -0.5F, 15, 9, 1, 0F,-5.2F, -3.2F, -0.4F, -5.2F, -3.2F, -0.4F, -5.2F, -3.2F, -0.4F, -5.2F, -3.2F, -0.4F, -5.2F, -3.2F, -0.4F, -5.2F, -3.2F, -0.4F, -5.2F, -3.2F, -0.4F, -5.2F, -3.2F, -0.4F); // Box 240
		bodyModel[160].setRotationPoint(-160F, -34.5F, 0F);
		bodyModel[160].rotateAngleX = 0.05235988F;
		bodyModel[160].rotateAngleY = -0.17453293F;
		bodyModel[160].rotateAngleZ = 0.13962634F;

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 241
		bodyModel[161].setRotationPoint(5F, -28F, -22F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		bodyModel[162].setRotationPoint(7F, -28.2F, -23F);

		bodyModel[163].addShapeBox(0F, 0F, 1F, 1, 1, 7, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 243
		bodyModel[163].setRotationPoint(7F, -27.2F, -27F);

		bodyModel[164].addShapeBox(0F, 0F, -15F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		bodyModel[164].setRotationPoint(47F, -28.2F, -8F);

		bodyModel[165].addShapeBox(0F, 0F, -15F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		bodyModel[165].setRotationPoint(45F, -28F, -7F);

		bodyModel[166].addShapeBox(0F, 0F, -14F, 1, 1, 7, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 249
		bodyModel[166].setRotationPoint(47F, -27.2F, -12F);

		bodyModel[167].addShapeBox(0F, 0F, -15F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		bodyModel[167].setRotationPoint(76F, -28.2F, -6F);

		bodyModel[168].addShapeBox(0F, 0F, -15F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		bodyModel[168].setRotationPoint(74F, -28F, -5F);

		bodyModel[169].addShapeBox(0F, 0F, -14F, 1, 1, 7, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 252
		bodyModel[169].setRotationPoint(76F, -27.2F, -10F);

		bodyModel[170].addShapeBox(0F, 0F, 15F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		bodyModel[170].setRotationPoint(47F, -28.2F, 6F);

		bodyModel[171].addShapeBox(0F, 0F, 15F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		bodyModel[171].setRotationPoint(45F, -28F, 2F);

		bodyModel[172].addShapeBox(0F, 0F, 14F, 1, 1, 7, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 258
		bodyModel[172].setRotationPoint(47F, -27.2F, 5F);

		bodyModel[173].addShapeBox(0F, 0F, 15F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		bodyModel[173].setRotationPoint(76F, -28.2F, 4F);

		bodyModel[174].addShapeBox(0F, 0F, 15F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		bodyModel[174].setRotationPoint(74F, -28F, 0F);

		bodyModel[175].addShapeBox(0F, 0F, 14F, 1, 1, 7, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 261
		bodyModel[175].setRotationPoint(76F, -27.2F, 3F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 268
		bodyModel[176].setRotationPoint(5F, -28F, 17F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 269
		bodyModel[177].setRotationPoint(7F, -28.2F, 21F);

		bodyModel[178].addShapeBox(0F, 0F, 1F, 1, 1, 7, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 270
		bodyModel[178].setRotationPoint(7F, -27.2F, 20F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[179].setRotationPoint(-37F, -28F, -18F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[180].setRotationPoint(-35F, -28.2F, -19F);

		bodyModel[181].addShapeBox(0F, 0F, 1F, 1, 1, 7, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 276
		bodyModel[181].setRotationPoint(-35F, -27.2F, -23F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 5, 3, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[182].setRotationPoint(-37F, -28F, 13F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[183].setRotationPoint(-35F, -28.2F, 17F);

		bodyModel[184].addShapeBox(0F, 0F, 1F, 1, 1, 7, 0F,-0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F, -0.3F); // Box 282
		bodyModel[184].setRotationPoint(-35F, -27.2F, 16F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 307
		bodyModel[185].setRotationPoint(-115F, -8F, 8F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 308
		bodyModel[186].setRotationPoint(-125F, -7F, 4F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 309
		bodyModel[187].setRotationPoint(-118F, -8F, 8F);

		bodyModel[188].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 310
		bodyModel[188].setRotationPoint(-117F, -7.5F, 8.5F);

		bodyModel[189].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 311
		bodyModel[189].setRotationPoint(-117F, -7.5F, 8.5F);
		bodyModel[189].rotateAngleX = 2.0943951F;

		bodyModel[190].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 312
		bodyModel[190].setRotationPoint(-117F, -7.5F, 8.5F);
		bodyModel[190].rotateAngleX = 4.1887902F;

		bodyModel[191].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 313
		bodyModel[191].setRotationPoint(-117F, -6.5F, 4.5F);
		bodyModel[191].rotateAngleX = 4.1887902F;

		bodyModel[192].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 314
		bodyModel[192].setRotationPoint(-117F, -6.5F, 4.5F);
		bodyModel[192].rotateAngleX = 2.0943951F;

		bodyModel[193].addShapeBox(-10F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 315
		bodyModel[193].setRotationPoint(-118F, -7F, 4F);

		bodyModel[194].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 316
		bodyModel[194].setRotationPoint(-117F, -6.5F, 4.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 317
		bodyModel[195].setRotationPoint(-115F, -8F, -9F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Box 318
		bodyModel[196].setRotationPoint(-125F, -7F, -5F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 319
		bodyModel[197].setRotationPoint(-118F, -8F, -9F);

		bodyModel[198].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 320
		bodyModel[198].setRotationPoint(-117F, -7.5F, -8.5F);

		bodyModel[199].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 321
		bodyModel[199].setRotationPoint(-117F, -7.5F, -8.5F);
		bodyModel[199].rotateAngleX = 2.0943951F;

		bodyModel[200].addShapeBox(0F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 322
		bodyModel[200].setRotationPoint(-117F, -7.5F, -8.5F);
		bodyModel[200].rotateAngleX = 4.1887902F;

		bodyModel[201].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 323
		bodyModel[201].setRotationPoint(-117F, -6.5F, -4.5F);
		bodyModel[201].rotateAngleX = 4.1887902F;

		bodyModel[202].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 324
		bodyModel[202].setRotationPoint(-117F, -6.5F, -4.5F);
		bodyModel[202].rotateAngleX = 2.0943951F;

		bodyModel[203].addShapeBox(-10F, 0F, 0F, 15, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 325
		bodyModel[203].setRotationPoint(-118F, -7F, -5F);

		bodyModel[204].addShapeBox(-10F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 326
		bodyModel[204].setRotationPoint(-117F, -6.5F, -4.5F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 6, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 306
		bodyModel[205].setRotationPoint(62.5F, -55.7F, -7F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 3, 1, 14, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Box 307
		bodyModel[206].setRotationPoint(59.5F, -55.7F, -7F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 328
		bodyModel[207].setRotationPoint(-160F, -35F, -0.5F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Box 329
		bodyModel[208].setRotationPoint(42.5F, -60F, 0F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 330
		bodyModel[209].setRotationPoint(46.5F, -60F, 0F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 331
		bodyModel[210].setRotationPoint(46.5F, -62F, 0F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 332
		bodyModel[211].setRotationPoint(42.5F, -62F, 0F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 333
		bodyModel[212].setRotationPoint(46.5F, -62F, -4F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 4, 2, 4, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 334
		bodyModel[213].setRotationPoint(42.5F, -62F, -4F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,-1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 335
		bodyModel[214].setRotationPoint(42.5F, -60F, -4F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 4, 28, 4, 0F,0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 336
		bodyModel[215].setRotationPoint(46.5F, -60F, -4F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F); // Box 337
		bodyModel[216].setRotationPoint(46.5F, -63F, 0F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F); // Box 338
		bodyModel[217].setRotationPoint(46.5F, -63F, -3F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0.2F, 0F, 0F, -0.8F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0.2F, 0F, 0F); // Box 339
		bodyModel[218].setRotationPoint(43.5F, -63F, -3F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0.2F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, -0.8F, 0F, -0.8F); // Box 340
		bodyModel[219].setRotationPoint(43.5F, -63F, 0F);

		bodyModel[220].addShapeBox(0F, -2F, 0F, 10, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 341
		bodyModel[220].setRotationPoint(66F, -57.5F, -8F);

		bodyModel[221].addShapeBox(0F, -2F, 0F, 4, 4, 16, 0F,0F, 0F, 0F, 1F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F); // Box 342
		bodyModel[221].setRotationPoint(76F, -57.5F, -8F);

		bodyModel[222].addShapeBox(0F, -2F, 0F, 3, 3, 26, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 343
		bodyModel[222].setRotationPoint(63F, -56.5F, -13F);

		bodyModel[223].addShapeBox(0F, -2F, 0F, 10, 1, 18, 0F,0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 344
		bodyModel[223].setRotationPoint(66F, -58.5F, -9F);

		bodyModel[224].addShapeBox(0F, -2F, 0F, 5, 1, 18, 0F,0F, 1F, -4F, 1F, -0.9F, -4F, 1F, -0.9F, -4F, 0F, 1F, -4F, 0F, 0F, 0F, 1F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F); // Box 345
		bodyModel[224].setRotationPoint(76F, -58.5F, -9F);

		bodyModel[225].addShapeBox(-0.5F, 0F, 0F, 1, 1, 20, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 346
		bodyModel[225].setRotationPoint(17F, -128F, -10F);

		bodyModel[226].addShapeBox(-0.5F, 0F, 0F, 1, 1, 30, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 347
		bodyModel[226].setRotationPoint(17F, -97F, -15F);

		bodyModel[227].addShapeBox(-0.5F, 0F, 0F, 1, 1, 30, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 348
		bodyModel[227].setRotationPoint(66F, -97F, -15F);

		bodyModel[228].addShapeBox(-0.5F, 0F, 0F, 1, 1, 20, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 349
		bodyModel[228].setRotationPoint(66F, -128F, -10F);

		bodyModel[229].addShapeBox(-0.5F, 0F, 0F, 1, 70, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 350
		bodyModel[229].setRotationPoint(66F, -145F, -0.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 4, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Box 351
		bodyModel[230].setRotationPoint(62F, -78.5F, -2F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 1, 34, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 352
		bodyModel[231].setRotationPoint(64F, -81F, -0.5F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 1, 54, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[232].setRotationPoint(63F, -78F, -0.5F);
		bodyModel[232].rotateAngleX = 0.19198622F;
		bodyModel[232].rotateAngleZ = -0.2268928F;

		bodyModel[233].addShapeBox(0F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Box 354
		bodyModel[233].setRotationPoint(60F, -59F, -6F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 1, 54, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 355
		bodyModel[234].setRotationPoint(63F, -78F, -0.5F);
		bodyModel[234].rotateAngleX = -0.19198622F;
		bodyModel[234].rotateAngleZ = -0.2268928F;

		bodyModel[235].addShapeBox(0F, -2F, 0F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, -1F, 0F, 0F, 0F); // Box 356
		bodyModel[235].setRotationPoint(65F, -81.5F, -3F);

		bodyModel[236].addShapeBox(-0.5F, 0F, 0F, 1, 1, 36, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 357
		bodyModel[236].setRotationPoint(66F, -77F, -18F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[237].setRotationPoint(64F, -24.8F, -24F);
		bodyModel[237].rotateAngleY = 0.10471976F;
		bodyModel[237].rotateAngleZ = -0.26179939F;

		bodyModel[238].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[238].setRotationPoint(41F, -24.8F, -24F);
		bodyModel[238].rotateAngleZ = -0.26179939F;

		bodyModel[239].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 361
		bodyModel[239].setRotationPoint(19F, -24.8F, -24F);
		bodyModel[239].rotateAngleZ = -0.26179939F;

		bodyModel[240].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 362
		bodyModel[240].setRotationPoint(-3F, -24.8F, -24F);
		bodyModel[240].rotateAngleZ = -0.26179939F;

		bodyModel[241].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 363
		bodyModel[241].setRotationPoint(-22F, -24.8F, -24F);
		bodyModel[241].rotateAngleZ = -0.26179939F;

		bodyModel[242].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 364
		bodyModel[242].setRotationPoint(-43F, -24.8F, -22F);
		bodyModel[242].rotateAngleY = -0.06981317F;
		bodyModel[242].rotateAngleZ = -0.26179939F;

		bodyModel[243].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 365
		bodyModel[243].setRotationPoint(-61F, -24.8F, -20F);
		bodyModel[243].rotateAngleY = -0.10471976F;
		bodyModel[243].rotateAngleZ = -0.26179939F;

		bodyModel[244].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 366
		bodyModel[244].setRotationPoint(-82F, -24.8F, -18F);
		bodyModel[244].rotateAngleY = -0.10471976F;
		bodyModel[244].rotateAngleZ = -0.26179939F;

		bodyModel[245].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 367
		bodyModel[245].setRotationPoint(-82F, -24.8F, -18F);
		bodyModel[245].rotateAngleY = -0.10471976F;
		bodyModel[245].rotateAngleZ = -0.26179939F;

		bodyModel[246].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 368
		bodyModel[246].setRotationPoint(-104F, -24.8F, -15F);
		bodyModel[246].rotateAngleY = -0.10471976F;
		bodyModel[246].rotateAngleZ = -0.26179939F;

		bodyModel[247].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 369
		bodyModel[247].setRotationPoint(-129F, -24.8F, -10F);
		bodyModel[247].rotateAngleY = -0.17453293F;
		bodyModel[247].rotateAngleZ = -0.26179939F;

		bodyModel[248].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 370
		bodyModel[248].setRotationPoint(-147F, -24.8F, -7F);
		bodyModel[248].rotateAngleY = -0.17453293F;
		bodyModel[248].rotateAngleZ = -0.26179939F;

		bodyModel[249].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 371
		bodyModel[249].setRotationPoint(64F, -24.8F, 22F);
		bodyModel[249].rotateAngleY = -0.10471976F;
		bodyModel[249].rotateAngleZ = -0.26179939F;

		bodyModel[250].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 372
		bodyModel[250].setRotationPoint(41F, -24.8F, 22F);
		bodyModel[250].rotateAngleZ = -0.26179939F;

		bodyModel[251].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 373
		bodyModel[251].setRotationPoint(19F, -24.8F, 22F);
		bodyModel[251].rotateAngleZ = -0.26179939F;

		bodyModel[252].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 374
		bodyModel[252].setRotationPoint(-3F, -24.8F, 22F);
		bodyModel[252].rotateAngleZ = -0.26179939F;

		bodyModel[253].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 375
		bodyModel[253].setRotationPoint(-22F, -24.8F, 22F);
		bodyModel[253].rotateAngleZ = -0.26179939F;

		bodyModel[254].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[254].setRotationPoint(-43F, -24.8F, 20F);
		bodyModel[254].rotateAngleY = 0.06981317F;
		bodyModel[254].rotateAngleZ = -0.26179939F;

		bodyModel[255].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[255].setRotationPoint(-61F, -24.8F, 18F);
		bodyModel[255].rotateAngleY = 0.10471976F;
		bodyModel[255].rotateAngleZ = -0.26179939F;

		bodyModel[256].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 378
		bodyModel[256].setRotationPoint(-82F, -24.8F, 16F);
		bodyModel[256].rotateAngleY = 0.10471976F;
		bodyModel[256].rotateAngleZ = -0.26179939F;

		bodyModel[257].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 379
		bodyModel[257].setRotationPoint(-104F, -24.8F, 13F);
		bodyModel[257].rotateAngleY = 0.10471976F;
		bodyModel[257].rotateAngleZ = -0.26179939F;

		bodyModel[258].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[258].setRotationPoint(-129F, -24.8F, 8F);
		bodyModel[258].rotateAngleY = 0.17453293F;
		bodyModel[258].rotateAngleZ = -0.26179939F;

		bodyModel[259].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[259].setRotationPoint(-147F, -24.8F, 5F);
		bodyModel[259].rotateAngleY = 0.17453293F;
		bodyModel[259].rotateAngleZ = -0.26179939F;

		bodyModel[260].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 382
		bodyModel[260].setRotationPoint(86F, -24.8F, 20F);
		bodyModel[260].rotateAngleY = -0.17453293F;
		bodyModel[260].rotateAngleZ = -0.26179939F;

		bodyModel[261].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 383
		bodyModel[261].setRotationPoint(107F, -24.8F, 17F);
		bodyModel[261].rotateAngleY = -0.2443461F;
		bodyModel[261].rotateAngleZ = -0.26179939F;

		bodyModel[262].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 384
		bodyModel[262].setRotationPoint(127F, -24.8F, 13F);
		bodyModel[262].rotateAngleY = -0.27925268F;
		bodyModel[262].rotateAngleZ = -0.26179939F;

		bodyModel[263].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 386
		bodyModel[263].setRotationPoint(86F, -24.8F, -22F);
		bodyModel[263].rotateAngleY = 0.17453293F;
		bodyModel[263].rotateAngleZ = -0.26179939F;

		bodyModel[264].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 387
		bodyModel[264].setRotationPoint(107F, -24.8F, -19F);
		bodyModel[264].rotateAngleY = 0.2443461F;
		bodyModel[264].rotateAngleZ = -0.26179939F;

		bodyModel[265].addShapeBox(0F, 0F, 0F, 20, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 388
		bodyModel[265].setRotationPoint(127F, -24.8F, -15F);
		bodyModel[265].rotateAngleY = 0.27925268F;
		bodyModel[265].rotateAngleZ = -0.26179939F;
		
	
	}

	
	
	private void initleftFrontWheelModel_1()
	{
		leftFrontWheelModel[0] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 97

		leftFrontWheelModel[0].addShapeBox(-7F, 0F, -1F, 10, 6, 2, 0F,-1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -1F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -2F, 0F, 0F); // Box 97
		leftFrontWheelModel[0].setRotationPoint(-132F, -10F, 0F);
	}
	
	

	private void initGuns() {
	}
	{

		// Passenger 2
		ModelRendererTurbo[][] gun_1_Model = new ModelRendererTurbo[3][];

		gun_1_Model[0] = new ModelRendererTurbo[7];
		gun_1_Model[0][0] = new ModelRendererTurbo(this, 1, 800, textureX, textureY); // Box 80
		gun_1_Model[0][1] = new ModelRendererTurbo(this, 33, 800, textureX, textureY); // Box 81
		gun_1_Model[0][2] = new ModelRendererTurbo(this, 65, 801, textureX, textureY); // Box 82
		gun_1_Model[0][3] = new ModelRendererTurbo(this, 97, 800, textureX, textureY); // Box 83
		gun_1_Model[0][4] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 84
		gun_1_Model[0][5] = new ModelRendererTurbo(this, 145, 750, textureX, textureY); // Box 85
		gun_1_Model[0][6] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 18

		gun_1_Model[0][0].addShapeBox(0F, -3F, 0F, 7, 3, 6, 0F,0F, 1.5F, 0F, 0F, 0.8F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 80

		gun_1_Model[0][1].addShapeBox(0F, -3F, -6F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.8F, 0F, 0F, 1.5F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81

		gun_1_Model[0][2].addShapeBox(-8.5F, -3F, 0F, 8, 3, 6, 0F,2F, 1.8F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F, 1F); // Box 82

		gun_1_Model[0][3].addShapeBox(-8.5F, -3F, -6F, 8, 3, 6, 0F,0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, 2F, 1.8F, 0F, 0F, 0F, 1F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, 2F, 0F, 0F); // Box 83

		gun_1_Model[0][4].addShapeBox(7F, -3F, -5F, 1, 3, 10, 0F,0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 2F); // Box 84

		gun_1_Model[0][5].addShapeBox(7F, -3F, -5F, 1, 1, 10, 0F,0F, -0.2F, -5F, 1F, -1F, -3F, 1F, -1F, -3F, 0F, -0.2F, -5F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F); // Box 85

		gun_1_Model[0][6].addShapeBox(7F, -4F, -5F, 1, 1, 10, 0F,0F, -0.2F, -5F, -1F, -0.2F, -5F, -1F, -0.2F, -5F, 0F, -0.2F, -5F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F); // Box 18

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[0])
		{
			gunPart.setRotationPoint(117F, -31.2F, 0F);
		}


		gun_1_Model[1] = new ModelRendererTurbo[0];

		gun_1_Model[2] = new ModelRendererTurbo[12];
		gun_1_Model[2][0] = new ModelRendererTurbo(this, 25, 800, textureX, textureY); // Box 86
		gun_1_Model[2][1] = new ModelRendererTurbo(this, 57, 800, textureX, textureY); // Box 87
		gun_1_Model[2][2] = new ModelRendererTurbo(this, 89, 800, textureX, textureY); // Box 88
		gun_1_Model[2][3] = new ModelRendererTurbo(this, 137, 800, textureX, textureY); // Box 89
		gun_1_Model[2][4] = new ModelRendererTurbo(this, 161, 800, textureX, textureY); // Box 90
		gun_1_Model[2][5] = new ModelRendererTurbo(this, 177, 800, textureX, textureY); // Box 91
		gun_1_Model[2][6] = new ModelRendererTurbo(this, 193, 800, textureX, textureY); // Box 92
		gun_1_Model[2][7] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 93
		gun_1_Model[2][8] = new ModelRendererTurbo(this, 209, 800, textureX, textureY); // Box 94
		gun_1_Model[2][9] = new ModelRendererTurbo(this, 217, 800, textureX, textureY); // Box 95
		gun_1_Model[2][10] = new ModelRendererTurbo(this, 233, 800, textureX, textureY); // Box 96
		gun_1_Model[2][11] = new ModelRendererTurbo(this, 249, 800, textureX, textureY); // Box 97

		gun_1_Model[2][0].addShapeBox(5.5F, -3.8F, -2.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_1_Model[2][1].addShapeBox(9F, -3.8F, -2.5F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87

		gun_1_Model[2][2].addShapeBox(9.5F, -2.8F, -2.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0F, 0.5F, 0F); // Box 88

		gun_1_Model[2][3].addShapeBox(10.5F, -2.7F, -2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89

		gun_1_Model[2][4].addShapeBox(14.5F, -2.7F, -2F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 90

		gun_1_Model[2][5].addShapeBox(18.5F, -2.7F, -2F, 5, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 91

		gun_1_Model[2][6].addShapeBox(5.5F, -3.8F, 0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92

		gun_1_Model[2][7].addShapeBox(9F, -3.8F, 0.5F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93

		gun_1_Model[2][8].addShapeBox(9.5F, -2.8F, 0.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0F, 0.5F, 0F); // Box 94

		gun_1_Model[2][9].addShapeBox(10.5F, -2.7F, 1F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95

		gun_1_Model[2][10].addShapeBox(14.5F, -2.7F, 1F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 96

		gun_1_Model[2][11].addShapeBox(18.5F, -2.7F, 1F, 5, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 97

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_1_Model[2])
		{
			gunPart.setRotationPoint(117F, -31.2F, 0F);
		}


		registerGunModel("PassengerGun1", gun_1_Model);

		// Passenger 3
		ModelRendererTurbo[][] gun_2_Model = new ModelRendererTurbo[3][];

		gun_2_Model[0] = new ModelRendererTurbo[7];
		gun_2_Model[0][0] = new ModelRendererTurbo(this, 1, 800, textureX, textureY); // Box 80
		gun_2_Model[0][1] = new ModelRendererTurbo(this, 33, 800, textureX, textureY); // Box 81
		gun_2_Model[0][2] = new ModelRendererTurbo(this, 65, 801, textureX, textureY); // Box 82
		gun_2_Model[0][3] = new ModelRendererTurbo(this, 97, 800, textureX, textureY); // Box 83
		gun_2_Model[0][4] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 84
		gun_2_Model[0][5] = new ModelRendererTurbo(this, 145, 750, textureX, textureY); // Box 85
		gun_2_Model[0][6] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 18

		gun_2_Model[0][0].addShapeBox(0F, -3F, 0F, 7, 3, 6, 0F,0F, 1.5F, 0F, 0F, 0.8F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 80

		gun_2_Model[0][1].addShapeBox(0F, -3F, -6F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.8F, 0F, 0F, 1.5F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81

		gun_2_Model[0][2].addShapeBox(-8.5F, -3F, 0F, 8, 3, 6, 0F,2F, 1.8F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F, 1F); // Box 82

		gun_2_Model[0][3].addShapeBox(-8.5F, -3F, -6F, 8, 3, 6, 0F,0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, 2F, 1.8F, 0F, 0F, 0F, 1F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, 2F, 0F, 0F); // Box 83

		gun_2_Model[0][4].addShapeBox(7F, -3F, -5F, 1, 3, 10, 0F,0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 2F); // Box 84

		gun_2_Model[0][5].addShapeBox(7F, -3F, -5F, 1, 1, 10, 0F,0F, -0.2F, -5F, 1F, -1F, -3F, 1F, -1F, -3F, 0F, -0.2F, -5F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F); // Box 85

		gun_2_Model[0][6].addShapeBox(7F, -4F, -5F, 1, 1, 10, 0F,0F, -0.2F, -5F, -1F, -0.2F, -5F, -1F, -0.2F, -5F, 0F, -0.2F, -5F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F); // Box 18

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[0])
		{
			gunPart.setRotationPoint(96F, -36F, 0F);
		}


		gun_2_Model[1] = new ModelRendererTurbo[0];

		gun_2_Model[2] = new ModelRendererTurbo[12];
		gun_2_Model[2][0] = new ModelRendererTurbo(this, 25, 800, textureX, textureY); // Box 86
		gun_2_Model[2][1] = new ModelRendererTurbo(this, 57, 800, textureX, textureY); // Box 87
		gun_2_Model[2][2] = new ModelRendererTurbo(this, 89, 800, textureX, textureY); // Box 88
		gun_2_Model[2][3] = new ModelRendererTurbo(this, 137, 800, textureX, textureY); // Box 89
		gun_2_Model[2][4] = new ModelRendererTurbo(this, 161, 800, textureX, textureY); // Box 90
		gun_2_Model[2][5] = new ModelRendererTurbo(this, 177, 800, textureX, textureY); // Box 91
		gun_2_Model[2][6] = new ModelRendererTurbo(this, 193, 800, textureX, textureY); // Box 92
		gun_2_Model[2][7] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 93
		gun_2_Model[2][8] = new ModelRendererTurbo(this, 209, 800, textureX, textureY); // Box 94
		gun_2_Model[2][9] = new ModelRendererTurbo(this, 217, 800, textureX, textureY); // Box 95
		gun_2_Model[2][10] = new ModelRendererTurbo(this, 233, 800, textureX, textureY); // Box 96
		gun_2_Model[2][11] = new ModelRendererTurbo(this, 249, 800, textureX, textureY); // Box 97

		gun_2_Model[2][0].addShapeBox(5.5F, -3.8F, -2.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_2_Model[2][1].addShapeBox(9F, -3.8F, -2.5F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87

		gun_2_Model[2][2].addShapeBox(9.5F, -2.8F, -2.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0F, 0.5F, 0F); // Box 88

		gun_2_Model[2][3].addShapeBox(10.5F, -2.7F, -2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89

		gun_2_Model[2][4].addShapeBox(14.5F, -2.7F, -2F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 90

		gun_2_Model[2][5].addShapeBox(18.5F, -2.7F, -2F, 5, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 91

		gun_2_Model[2][6].addShapeBox(5.5F, -3.8F, 0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92

		gun_2_Model[2][7].addShapeBox(9F, -3.8F, 0.5F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93

		gun_2_Model[2][8].addShapeBox(9.5F, -2.8F, 0.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0F, 0.5F, 0F); // Box 94

		gun_2_Model[2][9].addShapeBox(10.5F, -2.7F, 1F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95

		gun_2_Model[2][10].addShapeBox(14.5F, -2.7F, 1F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 96

		gun_2_Model[2][11].addShapeBox(18.5F, -2.7F, 1F, 5, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 97

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_2_Model[2])
		{
			gunPart.setRotationPoint(96F, -36F, 0F);
		}


		registerGunModel("PassengerGun2", gun_2_Model);

		// Passenger 4
		ModelRendererTurbo[][] gun_3_Model = new ModelRendererTurbo[3][];

		gun_3_Model[0] = new ModelRendererTurbo[7];
		gun_3_Model[0][0] = new ModelRendererTurbo(this, 1, 800, textureX, textureY); // Box 80
		gun_3_Model[0][1] = new ModelRendererTurbo(this, 33, 800, textureX, textureY); // Box 81
		gun_3_Model[0][2] = new ModelRendererTurbo(this, 65, 801, textureX, textureY); // Box 82
		gun_3_Model[0][3] = new ModelRendererTurbo(this, 97, 800, textureX, textureY); // Box 83
		gun_3_Model[0][4] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 84
		gun_3_Model[0][5] = new ModelRendererTurbo(this, 145, 750, textureX, textureY); // Box 85
		gun_3_Model[0][6] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 18

		gun_3_Model[0][0].addShapeBox(0F, -3F, 0F, 7, 3, 6, 0F,0F, 1.5F, 0F, 0F, 0.8F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 80

		gun_3_Model[0][1].addShapeBox(0F, -3F, -6F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.8F, 0F, 0F, 1.5F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81

		gun_3_Model[0][2].addShapeBox(-8.5F, -3F, 0F, 8, 3, 6, 0F,2F, 1.8F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F, 1F); // Box 82

		gun_3_Model[0][3].addShapeBox(-8.5F, -3F, -6F, 8, 3, 6, 0F,0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, 2F, 1.8F, 0F, 0F, 0F, 1F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, 2F, 0F, 0F); // Box 83

		gun_3_Model[0][4].addShapeBox(7F, -3F, -5F, 1, 3, 10, 0F,0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 2F); // Box 84

		gun_3_Model[0][5].addShapeBox(7F, -3F, -5F, 1, 1, 10, 0F,0F, -0.2F, -5F, 1F, -1F, -3F, 1F, -1F, -3F, 0F, -0.2F, -5F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F); // Box 85

		gun_3_Model[0][6].addShapeBox(7F, -4F, -5F, 1, 1, 10, 0F,0F, -0.2F, -5F, -1F, -0.2F, -5F, -1F, -0.2F, -5F, 0F, -0.2F, -5F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F); // Box 18

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[0])
		{
			gunPart.setRotationPoint(-86F, -27.5F, 0F);
		}


		gun_3_Model[1] = new ModelRendererTurbo[0];

		gun_3_Model[2] = new ModelRendererTurbo[12];
		gun_3_Model[2][0] = new ModelRendererTurbo(this, 25, 800, textureX, textureY); // Box 86
		gun_3_Model[2][1] = new ModelRendererTurbo(this, 57, 800, textureX, textureY); // Box 87
		gun_3_Model[2][2] = new ModelRendererTurbo(this, 89, 800, textureX, textureY); // Box 88
		gun_3_Model[2][3] = new ModelRendererTurbo(this, 137, 800, textureX, textureY); // Box 89
		gun_3_Model[2][4] = new ModelRendererTurbo(this, 161, 800, textureX, textureY); // Box 90
		gun_3_Model[2][5] = new ModelRendererTurbo(this, 177, 800, textureX, textureY); // Box 91
		gun_3_Model[2][6] = new ModelRendererTurbo(this, 193, 800, textureX, textureY); // Box 92
		gun_3_Model[2][7] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 93
		gun_3_Model[2][8] = new ModelRendererTurbo(this, 209, 800, textureX, textureY); // Box 94
		gun_3_Model[2][9] = new ModelRendererTurbo(this, 217, 800, textureX, textureY); // Box 95
		gun_3_Model[2][10] = new ModelRendererTurbo(this, 233, 800, textureX, textureY); // Box 96
		gun_3_Model[2][11] = new ModelRendererTurbo(this, 249, 800, textureX, textureY); // Box 97

		gun_3_Model[2][0].addShapeBox(5.5F, -3.8F, -2.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_3_Model[2][1].addShapeBox(9F, -3.8F, -2.5F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87

		gun_3_Model[2][2].addShapeBox(9.5F, -2.8F, -2.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0F, 0.5F, 0F); // Box 88

		gun_3_Model[2][3].addShapeBox(10.5F, -2.7F, -2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89

		gun_3_Model[2][4].addShapeBox(14.5F, -2.7F, -2F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 90

		gun_3_Model[2][5].addShapeBox(18.5F, -2.7F, -2F, 5, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 91

		gun_3_Model[2][6].addShapeBox(5.5F, -3.8F, 0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92

		gun_3_Model[2][7].addShapeBox(9F, -3.8F, 0.5F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93

		gun_3_Model[2][8].addShapeBox(9.5F, -2.8F, 0.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0F, 0.5F, 0F); // Box 94

		gun_3_Model[2][9].addShapeBox(10.5F, -2.7F, 1F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95

		gun_3_Model[2][10].addShapeBox(14.5F, -2.7F, 1F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 96

		gun_3_Model[2][11].addShapeBox(18.5F, -2.7F, 1F, 5, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 97

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_3_Model[2])
		{
			gunPart.setRotationPoint(-86F, -27.5F, 0F);
		}


		registerGunModel("PassengerGun3", gun_3_Model);

		// Passenger 5
		ModelRendererTurbo[][] gun_4_Model = new ModelRendererTurbo[3][];

		gun_4_Model[0] = new ModelRendererTurbo[7];
		gun_4_Model[0][0] = new ModelRendererTurbo(this, 1, 800, textureX, textureY); // Box 80
		gun_4_Model[0][1] = new ModelRendererTurbo(this, 33, 800, textureX, textureY); // Box 81
		gun_4_Model[0][2] = new ModelRendererTurbo(this, 65, 801, textureX, textureY); // Box 82
		gun_4_Model[0][3] = new ModelRendererTurbo(this, 97, 800, textureX, textureY); // Box 83
		gun_4_Model[0][4] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 84
		gun_4_Model[0][5] = new ModelRendererTurbo(this, 145, 750, textureX, textureY); // Box 85
		gun_4_Model[0][6] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 18

		gun_4_Model[0][0].addShapeBox(0F, -3F, 0F, 7, 3, 6, 0F,0F, 1.5F, 0F, 0F, 0.8F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 2F); // Box 80

		gun_4_Model[0][1].addShapeBox(0F, -3F, -6F, 7, 3, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.8F, 0F, 0F, 1.5F, 0F, 0F, 0F, 2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 81

		gun_4_Model[0][2].addShapeBox(-8.5F, -3F, 0F, 8, 3, 6, 0F,2F, 1.8F, 0F, 0.5F, 1.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 2F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 2F, 0F, 0F, 1F); // Box 82

		gun_4_Model[0][3].addShapeBox(-8.5F, -3F, -6F, 8, 3, 6, 0F,0F, 0F, -1F, 0.5F, 0F, 0F, 0.5F, 1.5F, 0F, 2F, 1.8F, 0F, 0F, 0F, 1F, 0.5F, 0F, 2F, 0.5F, 0F, 0F, 2F, 0F, 0F); // Box 83

		gun_4_Model[0][4].addShapeBox(7F, -3F, -5F, 1, 3, 10, 0F,0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 2F, 3F, 0F, -3F, 3F, 0F, -3F, 0F, 0F, 2F); // Box 84

		gun_4_Model[0][5].addShapeBox(7F, -3F, -5F, 1, 1, 10, 0F,0F, -0.2F, -5F, 1F, -1F, -3F, 1F, -1F, -3F, 0F, -0.2F, -5F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F); // Box 85

		gun_4_Model[0][6].addShapeBox(7F, -4F, -5F, 1, 1, 10, 0F,0F, -0.2F, -5F, -1F, -0.2F, -5F, -1F, -0.2F, -5F, 0F, -0.2F, -5F, 0F, 0F, 0F, 1F, 0F, -3F, 1F, 0F, -3F, 0F, 0F, 0F); // Box 18

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[0])
		{
			gunPart.setRotationPoint(-22F, -33.2F, 0F);
		}


		gun_4_Model[1] = new ModelRendererTurbo[0];

		gun_4_Model[2] = new ModelRendererTurbo[12];
		gun_4_Model[2][0] = new ModelRendererTurbo(this, 25, 800, textureX, textureY); // Box 86
		gun_4_Model[2][1] = new ModelRendererTurbo(this, 57, 800, textureX, textureY); // Box 87
		gun_4_Model[2][2] = new ModelRendererTurbo(this, 89, 800, textureX, textureY); // Box 88
		gun_4_Model[2][3] = new ModelRendererTurbo(this, 137, 800, textureX, textureY); // Box 89
		gun_4_Model[2][4] = new ModelRendererTurbo(this, 161, 800, textureX, textureY); // Box 90
		gun_4_Model[2][5] = new ModelRendererTurbo(this, 177, 800, textureX, textureY); // Box 91
		gun_4_Model[2][6] = new ModelRendererTurbo(this, 193, 800, textureX, textureY); // Box 92
		gun_4_Model[2][7] = new ModelRendererTurbo(this, 121, 800, textureX, textureY); // Box 93
		gun_4_Model[2][8] = new ModelRendererTurbo(this, 209, 800, textureX, textureY); // Box 94
		gun_4_Model[2][9] = new ModelRendererTurbo(this, 217, 800, textureX, textureY); // Box 95
		gun_4_Model[2][10] = new ModelRendererTurbo(this, 233, 800, textureX, textureY); // Box 96
		gun_4_Model[2][11] = new ModelRendererTurbo(this, 249, 800, textureX, textureY); // Box 97

		gun_4_Model[2][0].addShapeBox(5.5F, -3.8F, -2.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 86

		gun_4_Model[2][1].addShapeBox(9F, -3.8F, -2.5F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 87

		gun_4_Model[2][2].addShapeBox(9.5F, -2.8F, -2.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0F, 0.5F, 0F); // Box 88

		gun_4_Model[2][3].addShapeBox(10.5F, -2.7F, -2F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 89

		gun_4_Model[2][4].addShapeBox(14.5F, -2.7F, -2F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 90

		gun_4_Model[2][5].addShapeBox(18.5F, -2.7F, -2F, 5, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 91

		gun_4_Model[2][6].addShapeBox(5.5F, -3.8F, 0.5F, 3, 3, 2, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Box 92

		gun_4_Model[2][7].addShapeBox(9F, -3.8F, 0.5F, 1, 3, 2, 0F,0F, 0F, 0F, -0.5F, -0.9F, 0F, -0.5F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Box 93

		gun_4_Model[2][8].addShapeBox(9.5F, -2.8F, 0.5F, 1, 1, 2, 0F,0F, 0.1F, 0F, 0.5F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0F, 0.1F, 0F, 0F, 0.5F, 0F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0F, 0.5F, 0F); // Box 94

		gun_4_Model[2][9].addShapeBox(10.5F, -2.7F, 1F, 4, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 95

		gun_4_Model[2][10].addShapeBox(14.5F, -2.7F, 1F, 4, 1, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 96

		gun_4_Model[2][11].addShapeBox(18.5F, -2.7F, 1F, 5, 1, 1, 0F,0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F, 0F, -0.15F, -0.15F); // Box 97

		//Gun Origin
		for (ModelRendererTurbo gunPart : gun_4_Model[2])
		{
			gunPart.setRotationPoint(-22F, -33.2F, 0F);
		}


		registerGunModel("PassengerGun4", gun_4_Model);

		
		
	}
	
}