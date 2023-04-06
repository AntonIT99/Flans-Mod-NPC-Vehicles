//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2022 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: SB2M
// Model Creator: 
// Created on: 08.09.2022 - 12:15:58
// Last changed on: 08.09.2022 - 12:15:58

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelPlane;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelSB2M extends ModelPlane //Same as Filename
{
	int textureX = 1024;
	int textureY = 512;

	public ModelSB2M() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[341];
		tailModel = new ModelRendererTurbo[34];
		leftWingModel = new ModelRendererTurbo[38];
		rightWingModel = new ModelRendererTurbo[16];
		yawFlapModel = new ModelRendererTurbo[16];
		tailWheelModel = new ModelRendererTurbo[5];
		leftWingWheelModel = new ModelRendererTurbo[10];

		initbodyModel_1();
		inittailModel_1();
		initleftWingModel_1();
		initrightWingModel_1();
		inityawFlapModel_1();
		inittailWheelModel_1();
		initleftWingWheelModel_1();

		initPropeller();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 2
		bodyModel[3] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 3
		bodyModel[4] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 4
		bodyModel[5] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 5
		bodyModel[6] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 6
		bodyModel[7] = new ModelRendererTurbo(this, 601, 1, textureX, textureY); // Box 7
		bodyModel[8] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 8
		bodyModel[9] = new ModelRendererTurbo(this, 729, 1, textureX, textureY); // Box 9
		bodyModel[10] = new ModelRendererTurbo(this, 801, 1, textureX, textureY); // Box 10
		bodyModel[11] = new ModelRendererTurbo(this, 849, 1, textureX, textureY); // Box 11
		bodyModel[12] = new ModelRendererTurbo(this, 873, 1, textureX, textureY); // Box 12
		bodyModel[13] = new ModelRendererTurbo(this, 369, 17, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 441, 17, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 585, 1, textureX, textureY); // Box 23
		bodyModel[16] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 24
		bodyModel[17] = new ModelRendererTurbo(this, 801, 17, textureX, textureY); // Box 25
		bodyModel[18] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 26
		bodyModel[19] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 27
		bodyModel[20] = new ModelRendererTurbo(this, 1001, 17, textureX, textureY); // Box 28
		bodyModel[21] = new ModelRendererTurbo(this, 81, 25, textureX, textureY); // Box 29
		bodyModel[22] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 30
		bodyModel[23] = new ModelRendererTurbo(this, 241, 25, textureX, textureY); // Box 31
		bodyModel[24] = new ModelRendererTurbo(this, 601, 25, textureX, textureY); // Box 32
		bodyModel[25] = new ModelRendererTurbo(this, 681, 25, textureX, textureY); // Box 33
		bodyModel[26] = new ModelRendererTurbo(this, 329, 25, textureX, textureY); // Box 34
		bodyModel[27] = new ModelRendererTurbo(this, 785, 1, textureX, textureY); // Box 35
		bodyModel[28] = new ModelRendererTurbo(this, 753, 25, textureX, textureY); // Box 36
		bodyModel[29] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 37
		bodyModel[30] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 38
		bodyModel[31] = new ModelRendererTurbo(this, 913, 33, textureX, textureY); // Box 39
		bodyModel[32] = new ModelRendererTurbo(this, 681, 41, textureX, textureY); // Box 40
		bodyModel[33] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 41
		bodyModel[34] = new ModelRendererTurbo(this, 777, 41, textureX, textureY); // Box 42
		bodyModel[35] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 43
		bodyModel[36] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 44
		bodyModel[37] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 45
		bodyModel[38] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 46
		bodyModel[39] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 47
		bodyModel[40] = new ModelRendererTurbo(this, 369, 49, textureX, textureY); // Box 58
		bodyModel[41] = new ModelRendererTurbo(this, 593, 49, textureX, textureY); // Box 59
		bodyModel[42] = new ModelRendererTurbo(this, 433, 57, textureX, textureY); // Box 61
		bodyModel[43] = new ModelRendererTurbo(this, 497, 57, textureX, textureY); // Box 62
		bodyModel[44] = new ModelRendererTurbo(this, 953, 25, textureX, textureY); // Box 63
		bodyModel[45] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 64
		bodyModel[46] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 65
		bodyModel[47] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 66
		bodyModel[48] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 67
		bodyModel[49] = new ModelRendererTurbo(this, 929, 57, textureX, textureY); // Box 68
		bodyModel[50] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 69
		bodyModel[51] = new ModelRendererTurbo(this, 329, 65, textureX, textureY); // Box 70
		bodyModel[52] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 71
		bodyModel[53] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 72
		bodyModel[54] = new ModelRendererTurbo(this, 401, 65, textureX, textureY); // Box 73
		bodyModel[55] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 274
		bodyModel[56] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 275
		bodyModel[57] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 276
		bodyModel[58] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 277
		bodyModel[59] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 86
		bodyModel[60] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 87
		bodyModel[61] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 88
		bodyModel[62] = new ModelRendererTurbo(this, 681, 129, textureX, textureY); // Box 89
		bodyModel[63] = new ModelRendererTurbo(this, 393, 265, textureX, textureY); // Box 156
		bodyModel[64] = new ModelRendererTurbo(this, 793, 265, textureX, textureY); // Box 157
		bodyModel[65] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Box 158
		bodyModel[66] = new ModelRendererTurbo(this, 657, 273, textureX, textureY); // Box 159
		bodyModel[67] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 165
		bodyModel[68] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 166
		bodyModel[69] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 167
		bodyModel[70] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 168
		bodyModel[71] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 169
		bodyModel[72] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 170
		bodyModel[73] = new ModelRendererTurbo(this, 273, 1, textureX, textureY); // Box 171
		bodyModel[74] = new ModelRendererTurbo(this, 361, 1, textureX, textureY); // Box 172
		bodyModel[75] = new ModelRendererTurbo(this, 369, 1, textureX, textureY); // Box 173
		bodyModel[76] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 174
		bodyModel[77] = new ModelRendererTurbo(this, 449, 1, textureX, textureY); // Box 175
		bodyModel[78] = new ModelRendererTurbo(this, 521, 1, textureX, textureY); // Box 176
		bodyModel[79] = new ModelRendererTurbo(this, 529, 1, textureX, textureY); // Box 177
		bodyModel[80] = new ModelRendererTurbo(this, 641, 1, textureX, textureY); // Box 178
		bodyModel[81] = new ModelRendererTurbo(this, 793, 25, textureX, textureY); // Box 223
		bodyModel[82] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 224
		bodyModel[83] = new ModelRendererTurbo(this, 33, 25, textureX, textureY); // Box 225
		bodyModel[84] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 226
		bodyModel[85] = new ModelRendererTurbo(this, 145, 41, textureX, textureY); // Box 227
		bodyModel[86] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 228
		bodyModel[87] = new ModelRendererTurbo(this, 849, 41, textureX, textureY); // Box 230
		bodyModel[88] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Box 231
		bodyModel[89] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 232
		bodyModel[90] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 233
		bodyModel[91] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 234
		bodyModel[92] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 235
		bodyModel[93] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Box 237
		bodyModel[94] = new ModelRendererTurbo(this, 145, 49, textureX, textureY); // Box 238
		bodyModel[95] = new ModelRendererTurbo(this, 1001, 33, textureX, textureY); // Box 239
		bodyModel[96] = new ModelRendererTurbo(this, 209, 49, textureX, textureY); // Box 240
		bodyModel[97] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 259
		bodyModel[98] = new ModelRendererTurbo(this, 57, 65, textureX, textureY); // Box 260
		bodyModel[99] = new ModelRendererTurbo(this, 745, 65, textureX, textureY); // Box 261
		bodyModel[100] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 262
		bodyModel[101] = new ModelRendererTurbo(this, 337, 73, textureX, textureY); // Box 263
		bodyModel[102] = new ModelRendererTurbo(this, 369, 73, textureX, textureY); // Box 264
		bodyModel[103] = new ModelRendererTurbo(this, 761, 65, textureX, textureY); // Box 265
		bodyModel[104] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 266
		bodyModel[105] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 267
		bodyModel[106] = new ModelRendererTurbo(this, 249, 65, textureX, textureY); // Box 268
		bodyModel[107] = new ModelRendererTurbo(this, 313, 89, textureX, textureY); // Box 269
		bodyModel[108] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 270
		bodyModel[109] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 271
		bodyModel[110] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 272
		bodyModel[111] = new ModelRendererTurbo(this, 393, 145, textureX, textureY); // Box 273
		bodyModel[112] = new ModelRendererTurbo(this, 377, 97, textureX, textureY); // Box 0
		bodyModel[113] = new ModelRendererTurbo(this, 793, 113, textureX, textureY); // Box 1
		bodyModel[114] = new ModelRendererTurbo(this, 569, 121, textureX, textureY); // Box 2
		bodyModel[115] = new ModelRendererTurbo(this, 505, 73, textureX, textureY); // Box 3
		bodyModel[116] = new ModelRendererTurbo(this, 745, 73, textureX, textureY); // Box 4
		bodyModel[117] = new ModelRendererTurbo(this, 657, 49, textureX, textureY); // Box 5
		bodyModel[118] = new ModelRendererTurbo(this, 65, 65, textureX, textureY); // Box 6
		bodyModel[119] = new ModelRendererTurbo(this, 585, 65, textureX, textureY); // Box 7
		bodyModel[120] = new ModelRendererTurbo(this, 737, 65, textureX, textureY); // Box 8
		bodyModel[121] = new ModelRendererTurbo(this, 753, 65, textureX, textureY); // Box 9
		bodyModel[122] = new ModelRendererTurbo(this, 49, 73, textureX, textureY); // Box 10
		bodyModel[123] = new ModelRendererTurbo(this, 833, 73, textureX, textureY); // Box 11
		bodyModel[124] = new ModelRendererTurbo(this, 921, 73, textureX, textureY); // Box 12
		bodyModel[125] = new ModelRendererTurbo(this, 1009, 73, textureX, textureY); // Box 13
		bodyModel[126] = new ModelRendererTurbo(this, 225, 81, textureX, textureY); // Box 14
		bodyModel[127] = new ModelRendererTurbo(this, 201, 73, textureX, textureY); // Box 15
		bodyModel[128] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 16
		bodyModel[129] = new ModelRendererTurbo(this, 577, 73, textureX, textureY); // Box 18
		bodyModel[130] = new ModelRendererTurbo(this, 233, 81, textureX, textureY); // Box 19
		bodyModel[131] = new ModelRendererTurbo(this, 241, 81, textureX, textureY); // Box 20
		bodyModel[132] = new ModelRendererTurbo(this, 489, 81, textureX, textureY); // Box 21
		bodyModel[133] = new ModelRendererTurbo(this, 337, 81, textureX, textureY); // Box 22
		bodyModel[134] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 23
		bodyModel[135] = new ModelRendererTurbo(this, 649, 81, textureX, textureY); // Box 24
		bodyModel[136] = new ModelRendererTurbo(this, 857, 81, textureX, textureY); // Box 25
		bodyModel[137] = new ModelRendererTurbo(this, 929, 81, textureX, textureY); // Box 26
		bodyModel[138] = new ModelRendererTurbo(this, 409, 97, textureX, textureY); // Box 27
		bodyModel[139] = new ModelRendererTurbo(this, 321, 89, textureX, textureY); // Box 28
		bodyModel[140] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 29
		bodyModel[141] = new ModelRendererTurbo(this, 1001, 81, textureX, textureY); // Box 30
		bodyModel[142] = new ModelRendererTurbo(this, 25, 89, textureX, textureY); // Box 31
		bodyModel[143] = new ModelRendererTurbo(this, 993, 89, textureX, textureY); // Box 32
		bodyModel[144] = new ModelRendererTurbo(this, 641, 97, textureX, textureY); // Box 33
		bodyModel[145] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 34
		bodyModel[146] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 35
		bodyModel[147] = new ModelRendererTurbo(this, 601, 121, textureX, textureY); // Box 232
		bodyModel[148] = new ModelRendererTurbo(this, 561, 177, textureX, textureY); // Box 219
		bodyModel[149] = new ModelRendererTurbo(this, 57, 185, textureX, textureY); // Box 220
		bodyModel[150] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Box 221
		bodyModel[151] = new ModelRendererTurbo(this, 729, 145, textureX, textureY); // Box 222
		bodyModel[152] = new ModelRendererTurbo(this, 201, 89, textureX, textureY); // Box 223
		bodyModel[153] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 224
		bodyModel[154] = new ModelRendererTurbo(this, 817, 145, textureX, textureY); // Box 225
		bodyModel[155] = new ModelRendererTurbo(this, 113, 185, textureX, textureY); // Box 226
		bodyModel[156] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 229
		bodyModel[157] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 230
		bodyModel[158] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 231
		bodyModel[159] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 233
		bodyModel[160] = new ModelRendererTurbo(this, 945, 97, textureX, textureY); // Box 234
		bodyModel[161] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 235
		bodyModel[162] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 236
		bodyModel[163] = new ModelRendererTurbo(this, 401, 137, textureX, textureY); // Box 237
		bodyModel[164] = new ModelRendererTurbo(this, 1001, 89, textureX, textureY); // Box 238
		bodyModel[165] = new ModelRendererTurbo(this, 417, 105, textureX, textureY); // Box 239
		bodyModel[166] = new ModelRendererTurbo(this, 641, 105, textureX, textureY); // Box 240
		bodyModel[167] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 241
		bodyModel[168] = new ModelRendererTurbo(this, 201, 113, textureX, textureY); // Box 242
		bodyModel[169] = new ModelRendererTurbo(this, 329, 113, textureX, textureY); // Box 243
		bodyModel[170] = new ModelRendererTurbo(this, 825, 113, textureX, textureY); // Box 244
		bodyModel[171] = new ModelRendererTurbo(this, 985, 113, textureX, textureY); // Box 245
		bodyModel[172] = new ModelRendererTurbo(this, 1009, 137, textureX, textureY); // Box 334
		bodyModel[173] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 335
		bodyModel[174] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 336
		bodyModel[175] = new ModelRendererTurbo(this, 377, 153, textureX, textureY); // Box 337
		bodyModel[176] = new ModelRendererTurbo(this, 673, 129, textureX, textureY); // Box 338
		bodyModel[177] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 339
		bodyModel[178] = new ModelRendererTurbo(this, 329, 121, textureX, textureY); // Box 340
		bodyModel[179] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 341
		bodyModel[180] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 342
		bodyModel[181] = new ModelRendererTurbo(this, 329, 129, textureX, textureY); // Box 343
		bodyModel[182] = new ModelRendererTurbo(this, 977, 129, textureX, textureY); // Box 344
		bodyModel[183] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 345
		bodyModel[184] = new ModelRendererTurbo(this, 1017, 129, textureX, textureY); // Box 346
		bodyModel[185] = new ModelRendererTurbo(this, 25, 137, textureX, textureY); // Box 347
		bodyModel[186] = new ModelRendererTurbo(this, 209, 137, textureX, textureY); // Box 348
		bodyModel[187] = new ModelRendererTurbo(this, 809, 145, textureX, textureY); // Box 349
		bodyModel[188] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 350
		bodyModel[189] = new ModelRendererTurbo(this, 777, 177, textureX, textureY); // Box 351
		bodyModel[190] = new ModelRendererTurbo(this, 849, 177, textureX, textureY); // Box 352
		bodyModel[191] = new ModelRendererTurbo(this, 313, 185, textureX, textureY); // Box 353
		bodyModel[192] = new ModelRendererTurbo(this, 369, 185, textureX, textureY); // Box 354
		bodyModel[193] = new ModelRendererTurbo(this, 161, 193, textureX, textureY); // Box 355
		bodyModel[194] = new ModelRendererTurbo(this, 313, 161, textureX, textureY); // Box 356
		bodyModel[195] = new ModelRendererTurbo(this, 609, 161, textureX, textureY); // Box 357
		bodyModel[196] = new ModelRendererTurbo(this, 401, 169, textureX, textureY); // Box 358
		bodyModel[197] = new ModelRendererTurbo(this, 417, 137, textureX, textureY); // Box 359
		bodyModel[198] = new ModelRendererTurbo(this, 537, 145, textureX, textureY); // Box 360
		bodyModel[199] = new ModelRendererTurbo(this, 401, 161, textureX, textureY); // Box 361
		bodyModel[200] = new ModelRendererTurbo(this, 521, 161, textureX, textureY); // Box 362
		bodyModel[201] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 363
		bodyModel[202] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 364
		bodyModel[203] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 365
		bodyModel[204] = new ModelRendererTurbo(this, 625, 145, textureX, textureY); // Box 366
		bodyModel[205] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Box 367
		bodyModel[206] = new ModelRendererTurbo(this, 769, 161, textureX, textureY); // Box 368
		bodyModel[207] = new ModelRendererTurbo(this, 329, 153, textureX, textureY); // Box 369
		bodyModel[208] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 370
		bodyModel[209] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 371
		bodyModel[210] = new ModelRendererTurbo(this, 785, 161, textureX, textureY); // Box 372
		bodyModel[211] = new ModelRendererTurbo(this, 329, 161, textureX, textureY); // Box 373
		bodyModel[212] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 374
		bodyModel[213] = new ModelRendererTurbo(this, 537, 161, textureX, textureY); // Box 375
		bodyModel[214] = new ModelRendererTurbo(this, 601, 161, textureX, textureY); // Box 376
		bodyModel[215] = new ModelRendererTurbo(this, 921, 177, textureX, textureY); // Box 377
		bodyModel[216] = new ModelRendererTurbo(this, 585, 193, textureX, textureY); // Box 378
		bodyModel[217] = new ModelRendererTurbo(this, 73, 209, textureX, textureY); // Box 379
		bodyModel[218] = new ModelRendererTurbo(this, 961, 217, textureX, textureY); // Box 380
		bodyModel[219] = new ModelRendererTurbo(this, 569, 225, textureX, textureY); // Box 381
		bodyModel[220] = new ModelRendererTurbo(this, 57, 241, textureX, textureY); // Box 382
		bodyModel[221] = new ModelRendererTurbo(this, 521, 177, textureX, textureY); // Box 383
		bodyModel[222] = new ModelRendererTurbo(this, 729, 177, textureX, textureY); // Box 384
		bodyModel[223] = new ModelRendererTurbo(this, 1001, 177, textureX, textureY); // Box 385
		bodyModel[224] = new ModelRendererTurbo(this, 625, 161, textureX, textureY); // Box 386
		bodyModel[225] = new ModelRendererTurbo(this, 745, 161, textureX, textureY); // Box 387
		bodyModel[226] = new ModelRendererTurbo(this, 801, 161, textureX, textureY); // Box 388
		bodyModel[227] = new ModelRendererTurbo(this, 817, 161, textureX, textureY); // Box 389
		bodyModel[228] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 390
		bodyModel[229] = new ModelRendererTurbo(this, 617, 177, textureX, textureY); // Box 391
		bodyModel[230] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 392
		bodyModel[231] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 393
		bodyModel[232] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 394
		bodyModel[233] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 395
		bodyModel[234] = new ModelRendererTurbo(this, 177, 169, textureX, textureY); // Box 396
		bodyModel[235] = new ModelRendererTurbo(this, 185, 169, textureX, textureY); // Box 397
		bodyModel[236] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 398
		bodyModel[237] = new ModelRendererTurbo(this, 201, 169, textureX, textureY); // Box 399
		bodyModel[238] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 400
		bodyModel[239] = new ModelRendererTurbo(this, 793, 169, textureX, textureY); // Box 401
		bodyModel[240] = new ModelRendererTurbo(this, 1017, 169, textureX, textureY); // Box 402
		bodyModel[241] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 403
		bodyModel[242] = new ModelRendererTurbo(this, 273, 217, textureX, textureY); // Box 404
		bodyModel[243] = new ModelRendererTurbo(this, 769, 217, textureX, textureY); // Box 405
		bodyModel[244] = new ModelRendererTurbo(this, 361, 225, textureX, textureY); // Box 406
		bodyModel[245] = new ModelRendererTurbo(this, 793, 241, textureX, textureY); // Box 407
		bodyModel[246] = new ModelRendererTurbo(this, 729, 249, textureX, textureY); // Box 408
		bodyModel[247] = new ModelRendererTurbo(this, 617, 273, textureX, textureY); // Box 409
		bodyModel[248] = new ModelRendererTurbo(this, 609, 185, textureX, textureY); // Box 410
		bodyModel[249] = new ModelRendererTurbo(this, 801, 185, textureX, textureY); // Box 411
		bodyModel[250] = new ModelRendererTurbo(this, 873, 185, textureX, textureY); // Box 412
		bodyModel[251] = new ModelRendererTurbo(this, 537, 177, textureX, textureY); // Box 413
		bodyModel[252] = new ModelRendererTurbo(this, 609, 177, textureX, textureY); // Box 414
		bodyModel[253] = new ModelRendererTurbo(this, 873, 177, textureX, textureY); // Box 415
		bodyModel[254] = new ModelRendererTurbo(this, 945, 177, textureX, textureY); // Box 416
		bodyModel[255] = new ModelRendererTurbo(this, 425, 225, textureX, textureY); // Box 417
		bodyModel[256] = new ModelRendererTurbo(this, 497, 225, textureX, textureY); // Box 418
		bodyModel[257] = new ModelRendererTurbo(this, 985, 233, textureX, textureY); // Box 419
		bodyModel[258] = new ModelRendererTurbo(this, 89, 225, textureX, textureY); // Box 420
		bodyModel[259] = new ModelRendererTurbo(this, 593, 241, textureX, textureY); // Box 421
		bodyModel[260] = new ModelRendererTurbo(this, 81, 257, textureX, textureY); // Box 422
		bodyModel[261] = new ModelRendererTurbo(this, 73, 273, textureX, textureY); // Box 423
		bodyModel[262] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 424
		bodyModel[263] = new ModelRendererTurbo(this, 33, 97, textureX, textureY); // Box 592
		bodyModel[264] = new ModelRendererTurbo(this, 105, 185, textureX, textureY); // Box 593
		bodyModel[265] = new ModelRendererTurbo(this, 433, 25, textureX, textureY); // Box 594
		bodyModel[266] = new ModelRendererTurbo(this, 585, 97, textureX, textureY); // Box 595
		bodyModel[267] = new ModelRendererTurbo(this, 793, 97, textureX, textureY); // Box 596
		bodyModel[268] = new ModelRendererTurbo(this, 161, 185, textureX, textureY); // Import 
		bodyModel[269] = new ModelRendererTurbo(this, 1017, 177, textureX, textureY); // Box 905
		bodyModel[270] = new ModelRendererTurbo(this, 177, 185, textureX, textureY); // Box 906
		bodyModel[271] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Import 
		bodyModel[272] = new ModelRendererTurbo(this, 649, 97, textureX, textureY); // Import 
		bodyModel[273] = new ModelRendererTurbo(this, 33, 105, textureX, textureY); // Import 
		bodyModel[274] = new ModelRendererTurbo(this, 649, 105, textureX, textureY); // Import 
		bodyModel[275] = new ModelRendererTurbo(this, 33, 113, textureX, textureY); // Import 
		bodyModel[276] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 922
		bodyModel[277] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 927
		bodyModel[278] = new ModelRendererTurbo(this, 833, 113, textureX, textureY); // Box 929
		bodyModel[279] = new ModelRendererTurbo(this, 33, 121, textureX, textureY); // Box 930
		bodyModel[280] = new ModelRendererTurbo(this, 185, 185, textureX, textureY); // Box 444
		bodyModel[281] = new ModelRendererTurbo(this, 193, 185, textureX, textureY); // Box 445
		bodyModel[282] = new ModelRendererTurbo(this, 201, 185, textureX, textureY); // Box 446
		bodyModel[283] = new ModelRendererTurbo(this, 361, 185, textureX, textureY); // Box 447
		bodyModel[284] = new ModelRendererTurbo(this, 417, 185, textureX, textureY); // Box 448
		bodyModel[285] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 449
		bodyModel[286] = new ModelRendererTurbo(this, 521, 129, textureX, textureY); // Box 450
		bodyModel[287] = new ModelRendererTurbo(this, 833, 129, textureX, textureY); // Box 451
		bodyModel[288] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 452
		bodyModel[289] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 83
		bodyModel[290] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 84
		bodyModel[291] = new ModelRendererTurbo(this, 177, 137, textureX, textureY); // Box 85
		bodyModel[292] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Box 86
		bodyModel[293] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 87
		bodyModel[294] = new ModelRendererTurbo(this, 729, 145, textureX, textureY); // Box 88
		bodyModel[295] = new ModelRendererTurbo(this, 857, 265, textureX, textureY); // Box 465
		bodyModel[296] = new ModelRendererTurbo(this, 769, 273, textureX, textureY); // Box 466
		bodyModel[297] = new ModelRendererTurbo(this, 521, 193, textureX, textureY); // Box 468
		bodyModel[298] = new ModelRendererTurbo(this, 961, 273, textureX, textureY); // Box 469
		bodyModel[299] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 470
		bodyModel[300] = new ModelRendererTurbo(this, 33, 161, textureX, textureY); // Box 471
		bodyModel[301] = new ModelRendererTurbo(this, 817, 177, textureX, textureY); // Box 472
		bodyModel[302] = new ModelRendererTurbo(this, 737, 73, textureX, textureY); // Box 473
		bodyModel[303] = new ModelRendererTurbo(this, 489, 89, textureX, textureY); // Box 474
		bodyModel[304] = new ModelRendererTurbo(this, 889, 177, textureX, textureY); // Box 475
		bodyModel[305] = new ModelRendererTurbo(this, 961, 177, textureX, textureY); // Box 476
		bodyModel[306] = new ModelRendererTurbo(this, 945, 105, textureX, textureY); // Box 477
		bodyModel[307] = new ModelRendererTurbo(this, 817, 113, textureX, textureY); // Box 478
		bodyModel[308] = new ModelRendererTurbo(this, 561, 193, textureX, textureY); // Box 479
		bodyModel[309] = new ModelRendererTurbo(this, 561, 121, textureX, textureY); // Box 480
		bodyModel[310] = new ModelRendererTurbo(this, 673, 137, textureX, textureY); // Box 481
		bodyModel[311] = new ModelRendererTurbo(this, 569, 193, textureX, textureY); // Box 482
		bodyModel[312] = new ModelRendererTurbo(this, 809, 153, textureX, textureY); // Box 485
		bodyModel[313] = new ModelRendererTurbo(this, 105, 193, textureX, textureY); // Box 487
		bodyModel[314] = new ModelRendererTurbo(this, 577, 193, textureX, textureY); // Box 489
		bodyModel[315] = new ModelRendererTurbo(this, 81, 201, textureX, textureY); // Box 490
		bodyModel[316] = new ModelRendererTurbo(this, 89, 201, textureX, textureY); // Box 491
		bodyModel[317] = new ModelRendererTurbo(this, 361, 193, textureX, textureY); // Box 492
		bodyModel[318] = new ModelRendererTurbo(this, 97, 201, textureX, textureY); // Box 493
		bodyModel[319] = new ModelRendererTurbo(this, 729, 193, textureX, textureY); // Box 494
		bodyModel[320] = new ModelRendererTurbo(this, 1, 281, textureX, textureY); // Box 495
		bodyModel[321] = new ModelRendererTurbo(this, 905, 209, textureX, textureY); // Box 496
		bodyModel[322] = new ModelRendererTurbo(this, 777, 193, textureX, textureY); // Box 497
		bodyModel[323] = new ModelRendererTurbo(this, 793, 193, textureX, textureY); // Box 498
		bodyModel[324] = new ModelRendererTurbo(this, 913, 209, textureX, textureY); // Box 499
		bodyModel[325] = new ModelRendererTurbo(this, 921, 209, textureX, textureY); // Box 500
		bodyModel[326] = new ModelRendererTurbo(this, 849, 193, textureX, textureY); // Box 501
		bodyModel[327] = new ModelRendererTurbo(this, 865, 193, textureX, textureY); // Box 502
		bodyModel[328] = new ModelRendererTurbo(this, 929, 209, textureX, textureY); // Box 503
		bodyModel[329] = new ModelRendererTurbo(this, 937, 209, textureX, textureY); // Box 504
		bodyModel[330] = new ModelRendererTurbo(this, 921, 193, textureX, textureY); // Box 505
		bodyModel[331] = new ModelRendererTurbo(this, 937, 193, textureX, textureY); // Box 506
		bodyModel[332] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 507
		bodyModel[333] = new ModelRendererTurbo(this, 289, 281, textureX, textureY); // Box 508
		bodyModel[334] = new ModelRendererTurbo(this, 345, 281, textureX, textureY); // Box 509
		bodyModel[335] = new ModelRendererTurbo(this, 881, 281, textureX, textureY); // Box 510
		bodyModel[336] = new ModelRendererTurbo(this, 1, 289, textureX, textureY); // Box 511
		bodyModel[337] = new ModelRendererTurbo(this, 209, 289, textureX, textureY); // Box 512
		bodyModel[338] = new ModelRendererTurbo(this, 897, 289, textureX, textureY); // Box 513
		bodyModel[339] = new ModelRendererTurbo(this, 273, 297, textureX, textureY); // Box 514
		bodyModel[340] = new ModelRendererTurbo(this, 337, 313, textureX, textureY); // Box 515

		bodyModel[0].addShapeBox(0F, 0F, 0F, 33, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4.9F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, -3.4F, 0F, 0F, -5F, -6.2F, 0F, -3.5F, -3F); // Box 0
		bodyModel[0].setRotationPoint(26F, -30F, 0F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 33, 13, 9, 0F,0F, -1F, 0F, 0F, -3.5F, 0F, 0F, -6.5F, -5F, 0F, -5F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, -0.5F); // Box 1
		bodyModel[1].setRotationPoint(26F, -51F, 0F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 36, 13, 9, 0F,0F, -3.5F, 0F, 0F, -5F, 0F, 0F, -6.5F, -7.5F, 0F, -6.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.3F, 0F, 0F, -3.5F); // Box 2
		bodyModel[2].setRotationPoint(59F, -51F, 0F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 36, 14, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7.3F, 0F, 0F, -3.5F, 0F, -6F, 0F, 0F, -8.1F, 0F, 0F, -8.1F, -8.2F, 0F, -6.2F, -5F); // Box 3
		bodyModel[3].setRotationPoint(59F, -38F, 0F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 30, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3F, 0F, -0.5F, -1.5F); // Box 4
		bodyModel[4].setRotationPoint(-4F, -30F, 0F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 30, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 4.5F, 0F, 0F, 4F, 0F, 0F, -0.5F, -1.5F, 0F, 0.5F, -1.5F); // Box 5
		bodyModel[5].setRotationPoint(-34F, -30F, 0F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 23, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1.2F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 0.5F, -1.5F, 0F, 0.5F, -1F); // Box 6
		bodyModel[6].setRotationPoint(-57F, -30F, 0F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 12, 8, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.4F); // Box 7
		bodyModel[7].setRotationPoint(-89F, -38F, 0F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 30, 13, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3F, 0F, -4F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F); // Box 8
		bodyModel[8].setRotationPoint(-34F, -51F, 0F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 23, 13, 9, 0F,0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -4F, -2.5F, 0F, -4.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Box 9
		bodyModel[9].setRotationPoint(-57F, -51F, 0F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 12, 5, 9, 0F,0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -3.4F, 0F, -1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Box 10
		bodyModel[10].setRotationPoint(-89F, -43F, 0F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 9, 32, 1, 0F,0F, -0.3F, 0F, 0F, -4.9F, 0F, 0.2F, -4.9F, -0.299999999999999F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 1F); // Box 11
		bodyModel[11].setRotationPoint(87F, -76F, 0F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 23, 31, 1, 0F,-22F, 0F, 0F, 0F, 0F, 0F, -4.16333634234434E-16F, 0F, -0.2F, -23F, 0F, -0.5F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F); // Box 12
		bodyModel[12].setRotationPoint(64F, -76F, 0F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 30, 5, 4, 0F,0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F); // Box 21
		bodyModel[13].setRotationPoint(-4F, -43F, 5F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F,0F, -0.5F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, -1.5F, 0F, -0.5F, -1F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, 0.5F); // Box 22
		bodyModel[14].setRotationPoint(-4F, -48F, 4F);

		bodyModel[15].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, -1F, 0F, 0F, -1.1F, 0F, 0F, 0F, -2.8F, 0F, 0F, -3F, 0F, 0F, -5F, 0F, 0F, -4.6F, 0F, -0.1F, 2.8F, 0F, -0.5F, 3F); // Box 23
		bodyModel[15].setRotationPoint(-4F, -51F, 0F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 20, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 4.9F, 0F, 0F, 4.5F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F); // Box 24
		bodyModel[16].setRotationPoint(-77F, -30F, 0F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, 0.1F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.2F); // Box 25
		bodyModel[17].setRotationPoint(-77F, -38F, 8F);

		bodyModel[18].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0.1F, 0F, 0F, 0.8F, -2.1F, 0F, 0.8F, 1.8F, 0F, 0F, -0.4F, 0F, 0F, -2.8F, 0F, 0F, -3F, 0F, 0F, 3.5F, 0F, 0F, 3F); // Box 26
		bodyModel[18].setRotationPoint(-77F, -43F, 5F);

		bodyModel[19].addShapeBox(0F, 0F, 0F, 8, 5, 9, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, -1.1F, -4.9F, 0F, -1.9F, -4.9F, 0F, -2.5F, -4.1F, 0F, -2.5F, -3.9F, 0F, 0F, -0.5F, 0F, 0F, -1F); // Box 27
		bodyModel[19].setRotationPoint(-97F, -43F, 0F);

		bodyModel[20].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, 1.2F, 0.9F, 0F, 1F, 0.6F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -1.8F, 0F, 0F, -2.3F, 0F, 0F, 2.4F, 0F, 0F, 2F); // Box 28
		bodyModel[20].setRotationPoint(-97F, -38F, 7F);

		bodyModel[21].addShapeBox(0F, 0F, 0F, 23, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F); // Box 29
		bodyModel[21].setRotationPoint(-57F, -38F, 0F);

		bodyModel[22].addShapeBox(0F, 0F, 0F, 30, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, 0.1F); // Box 30
		bodyModel[22].setRotationPoint(-34F, -38F, 0F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 30, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -0.9F); // Box 31
		bodyModel[23].setRotationPoint(-4F, -38F, 0F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 33, 8, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.6F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -6.1F, 0F, 0F, -1.5F); // Box 32
		bodyModel[24].setRotationPoint(26F, -38F, 0F);

		bodyModel[25].addShapeBox(0F, 0F, 0F, 36, 2, 4, 0F,0F, 0F, 0F, 0F, 2F, 0F, 0F, 2.1F, -3.2F, 0F, 0.2F, 0F, 0F, 0.6F, 0F, 0F, -4.2F, 0F, 0F, -4.2F, -3.7F, 0F, -1F, -1.2F); // Box 33
		bodyModel[25].setRotationPoint(59F, -30F, 0F);

		bodyModel[26].addShapeBox(0F, 0F, 0F, 12, 11, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.2F, 0F, 0F, 1.4F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1F, 0F, -4.5F, -1.2F); // Box 34
		bodyModel[26].setRotationPoint(-89F, -30F, 0F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, -1.8F, 0F, 0F, -2.3F, 0F, 0F, 2.4F, 0F, 0F, 2F, 0F, 1.4F, 0.9F, 0F, 1.3F, 0.6F, 0F, 0.5F, -0.2F, 0F, 0.4F, 0F); // Box 35
		bodyModel[27].setRotationPoint(-97F, -30F, 7F);

		bodyModel[28].addShapeBox(0F, 0F, 0F, 8, 6, 9, 0F,0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, -0.5F, -1.1F, 0F, -0.4F, -1F, 0F, -1.4F, 0F, 0F, -1.2F, 0F, 0F, -1.2F, -9F, 0F, -1.5F, -8.6F); // Box 36
		bodyModel[28].setRotationPoint(-97F, -24F, 0F);

		bodyModel[29].addShapeBox(0F, 0F, 0F, 33, 6, 9, 0F,0F, 0F, -0.5F, 0F, 0.5F, -4.9F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, -3F, 0F, -5F, -6.2F, 0F, -3.4F, 0F, 0F, 0F, 0F); // Box 37
		bodyModel[29].setRotationPoint(26F, -30F, -9F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 33, 13, 9, 0F,0F, -5F, -3.5F, 0F, -6.5F, -5F, 0F, -3.5F, 0F, 0F, -1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 38
		bodyModel[30].setRotationPoint(26F, -51F, -9F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 36, 13, 9, 0F,0F, -6.5F, -5F, 0F, -6.5F, -7.5F, 0F, -5F, 0F, 0F, -3.5F, 0F, 0F, 0F, -3.5F, 0F, 0F, -7.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 39
		bodyModel[31].setRotationPoint(59F, -51F, -9F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 36, 14, 9, 0F,0F, 0F, -3.5F, 0F, 0F, -7.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -6.2F, -5F, 0F, -8.1F, -8.2F, 0F, -8.1F, 0F, 0F, -6F, 0F); // Box 40
		bodyModel[32].setRotationPoint(59F, -38F, -9F);

		bodyModel[33].addShapeBox(0F, 0F, 0F, 30, 6, 9, 0F,0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1.5F, 0F, -3.5F, -3F, 0F, 0F, 0F, 0F, 4F, 0F); // Box 41
		bodyModel[33].setRotationPoint(-4F, -30F, -9F);

		bodyModel[34].addShapeBox(0F, 0F, 0F, 30, 6, 9, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1.5F, 0F, -0.5F, -1.5F, 0F, 4F, 0F, 0F, 4.5F, 0F); // Box 42
		bodyModel[34].setRotationPoint(-34F, -30F, -9F);

		bodyModel[35].addShapeBox(0F, 0F, 0F, 23, 6, 9, 0F,0F, 0F, 1.2F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1.5F, 0F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 43
		bodyModel[35].setRotationPoint(-57F, -30F, -9F);

		bodyModel[36].addShapeBox(0F, 0F, 0F, 12, 8, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.4F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 44
		bodyModel[36].setRotationPoint(-89F, -38F, -9F);

		bodyModel[37].addShapeBox(0F, 0F, 0F, 30, 13, 9, 0F,0F, -4F, -2.5F, 0F, -3.5F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 45
		bodyModel[37].setRotationPoint(-34F, -51F, -9F);

		bodyModel[38].addShapeBox(0F, 0F, 0F, 23, 13, 9, 0F,0F, -4.5F, -2F, 0F, -4F, -2.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 46
		bodyModel[38].setRotationPoint(-57F, -51F, -9F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 12, 5, 9, 0F,0F, -1F, -5F, 0F, 0F, -3.4F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 47
		bodyModel[39].setRotationPoint(-89F, -43F, -9F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 30, 5, 4, 0F,0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 58
		bodyModel[40].setRotationPoint(-4F, -43F, -9F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 30, 5, 3, 0F,0F, -0.5F, -1F, 0F, -2F, -1.5F, 0F, -2F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -2.5F); // Box 59
		bodyModel[41].setRotationPoint(-4F, -48F, -7F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 20, 6, 9, 0F,0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0.5F, -1F, 0F, 4.5F, 0F, 0F, 4.9F, 0F); // Box 61
		bodyModel[42].setRotationPoint(-77F, -30F, -9F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 20, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, 1.2F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 62
		bodyModel[43].setRotationPoint(-77F, -38F, -9F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 20, 5, 1, 0F,0F, 0F, -0.4F, 0F, 0.800000000000001F, 1.8F, 0F, 0.8F, -2.1F, 0F, 0.1F, 0F, 0F, 0F, 3F, 0F, 0F, 3.5F, 0F, 0F, -3F, 0F, 0F, -2.8F); // Box 63
		bodyModel[44].setRotationPoint(-77F, -43F, -6F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 8, 5, 9, 0F,0F, -1.9F, -4.9F, 0F, -1.1F, -4.9F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, -1F, 0F, 0F, -0.5F, 0F, -2.5F, -3.9F, 0F, -2.5F, -4.1F); // Box 64
		bodyModel[45].setRotationPoint(-97F, -43F, -9F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 8, 8, 1, 0F,0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 1F, 0.6F, 0F, 1.2F, 0.9F, 0F, 0F, 2F, 0F, 0F, 2.4F, 0F, 0F, -2.3F, 0F, 0F, -1.8F); // Box 65
		bodyModel[46].setRotationPoint(-97F, -38F, -8F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 23, 8, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 66
		bodyModel[47].setRotationPoint(-57F, -38F, -10F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 30, 8, 10, 0F,0F, 0F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.1F, 0F, 0F, -0.9F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 67
		bodyModel[48].setRotationPoint(-34F, -38F, -10F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 30, 8, 10, 0F,0F, 0F, -1F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.9F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 68
		bodyModel[49].setRotationPoint(-4F, -38F, -10F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 33, 8, 10, 0F,0F, 0F, -1.5F, 0F, 0F, -4.6F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, -0.4F, -6.1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 69
		bodyModel[50].setRotationPoint(26F, -38F, -10F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 36, 2, 4, 0F,0F, 0.2F, 0F, 0F, 2.1F, -3.2F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, -1F, -1.2F, 0F, -4.2F, -3.7F, 0F, -4.2F, 0F, 0F, 0.6F, 0F); // Box 70
		bodyModel[51].setRotationPoint(59F, -30F, -4F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 12, 11, 9, 0F,0F, 0F, 1.4F, 0F, 0F, 1.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, -1.2F, 0F, -4.5F, -1F, 0F, 0F, 0F, 0F, -0.2F, 0F); // Box 71
		bodyModel[52].setRotationPoint(-89F, -30F, -9F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 8, 6, 1, 0F,0F, 0F, 2F, 0F, 0F, 2.4F, 0F, 0F, -2.3F, 0F, 0F, -1.8F, 0F, 0.4F, 0F, 0F, 0.5F, -0.2F, 0F, 1.3F, 0.6F, 0F, 1.4F, 0.9F); // Box 72
		bodyModel[53].setRotationPoint(-97F, -30F, -8F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 8, 6, 9, 0F,0F, -0.4F, -1F, 0F, -0.5F, -1.1F, 0F, -1.9F, 0F, 0F, -1.9F, 0F, 0F, -1.5F, -8.6F, 0F, -1.2F, -9F, 0F, -1.2F, 0F, 0F, -1.4F, 0F); // Box 73
		bodyModel[54].setRotationPoint(-97F, -24F, -9F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 72, 6, 5, 0F,-2.5F, -2.22044604925031E-16F, 1F, -6F, 1F, 1.4F, -11F, 0F, -1F, -2.9F, 0F, 0F, 2F, -0.5F, 1F, 12F, -0.5F, 1F, 2F, -0.5F, -1F, 1F, -0.5F, 0F); // Box 274
		bodyModel[55].setRotationPoint(-68F, -40F, 9.5F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 72, 5, 5, 0F,2F, -0.5F, 1F, 12F, -0.5F, 1F, 2F, -0.5F, -1F, 1F, -0.5F, 0F, -2F, 0F, 0.5F, -6F, 0F, 1F, -11F, 0F, -1F, -3F, 0F, 0F); // Box 275
		bodyModel[56].setRotationPoint(-68F, -35F, 9.5F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 72, 6, 5, 0F,-3F, 0F, 0F, -11F, 0F, 1F, -12F, 0F, 1F, -3F, 0F, 0.5F, 1F, -0.5F, 0F, 2F, -0.5F, 1F, -2F, -0.5F, 1F, 1F, -0.5F, 1F); // Box 276
		bodyModel[57].setRotationPoint(-68F, -40F, 14.5F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 72, 5, 5, 0F,1F, -0.5F, 0F, 2F, -0.5F, 1F, -2F, -0.5F, 1F, 1F, -0.5F, 1F, -3F, 0F, 0F, -11F, 0F, 1F, -12F, 0F, 1F, -3F, 0F, 0.5F); // Box 277
		bodyModel[58].setRotationPoint(-68F, -35F, 14.5F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 72, 6, 5, 0F,-2.9F, 0F, 0F, -11F, 0F, -1F, -6F, 1F, 1.4F, -2.5F, -2.22044604925031E-16F, 1F, 1F, -0.5F, 0F, 2F, -0.5F, -1F, 12F, -0.5F, 1F, 2F, -0.5F, 1F); // Box 86
		bodyModel[59].setRotationPoint(-68F, -40F, -14.5F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 72, 5, 5, 0F,1F, -0.5F, 0F, 2F, -0.5F, -1F, 12F, -0.5F, 1F, 2F, -0.5F, 1F, -3F, 0F, 0F, -11F, 0F, -1F, -6F, 0F, 1F, -2F, 0F, 0.5F); // Box 87
		bodyModel[60].setRotationPoint(-68F, -35F, -14.5F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 72, 6, 5, 0F,-3F, 0F, 0.5F, -12F, 0F, 1F, -11F, 0F, 1F, -3F, 0F, 0F, 1F, -0.5F, 1F, -2F, -0.5F, 1F, 2F, -0.5F, 1F, 1F, -0.5F, 0F); // Box 88
		bodyModel[61].setRotationPoint(-68F, -40F, -19.5F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 72, 5, 5, 0F,1F, -0.5F, 1F, -2F, -0.5F, 1F, 2F, -0.5F, 1F, 1F, -0.5F, 0F, -3F, 0F, 0.5F, -12F, 0F, 1F, -11F, 0F, 1F, -3F, 0F, 0F); // Box 89
		bodyModel[62].setRotationPoint(-68F, -35F, -19.5F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 31, 2, 44, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -21F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -21F, 0F, -3F); // Box 156
		bodyModel[63].setRotationPoint(58F, -45F, 3F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 10, 2, 43, 0F,0F, 0F, 1F, 8F, 0F, -8F, 1F, 0F, -7F, 0F, 0F, 1F, 0F, 0F, 1F, 8F, 0F, -8F, 1F, 0F, -7F, 0F, 0F, 1F); // Box 157
		bodyModel[64].setRotationPoint(89F, -45F, 4F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 31, 2, 44, 0F,-21F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, -21F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 158
		bodyModel[65].setRotationPoint(58F, -45F, -47F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 10, 2, 43, 0F,0F, 0F, 1F, 1F, 0F, -7F, 8F, 0F, -8F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -7F, 8F, 0F, -8F, 0F, 0F, 1F); // Box 159
		bodyModel[66].setRotationPoint(89F, -45F, -47F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 165
		bodyModel[67].setRotationPoint(-109F, -33F, -2F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 166
		bodyModel[68].setRotationPoint(-109F, -29F, -2F);
		bodyModel[68].rotateAngleZ = 0.52359878F;

		bodyModel[69].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 167
		bodyModel[69].setRotationPoint(-107F, -25.5F, -2F);
		bodyModel[69].rotateAngleZ = 0.83775804F;

		bodyModel[70].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 168
		bodyModel[70].setRotationPoint(-103F, -22F, -2F);
		bodyModel[70].rotateAngleZ = 1.30899694F;

		bodyModel[71].addShapeBox(0F, -4F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 169
		bodyModel[71].setRotationPoint(-109F, -33F, -2F);
		bodyModel[71].rotateAngleZ = -0.52359878F;

		bodyModel[72].addShapeBox(0F, -5F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 170
		bodyModel[72].setRotationPoint(-107F, -36.5F, -2F);
		bodyModel[72].rotateAngleZ = -0.90757121F;

		bodyModel[73].addShapeBox(0F, -7F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 171
		bodyModel[73].setRotationPoint(-103F, -39.5F, -2F);
		bodyModel[73].rotateAngleZ = -1.22173048F;

		bodyModel[74].addShapeBox(0F, -7F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 172
		bodyModel[74].setRotationPoint(-103F, -39.5F, 1F);
		bodyModel[74].rotateAngleZ = -1.22173048F;

		bodyModel[75].addShapeBox(0F, -5F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 173
		bodyModel[75].setRotationPoint(-107F, -36.5F, 1F);
		bodyModel[75].rotateAngleZ = -0.90757121F;

		bodyModel[76].addShapeBox(0F, -4F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 174
		bodyModel[76].setRotationPoint(-109F, -33F, 1F);
		bodyModel[76].rotateAngleZ = -0.52359878F;

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 175
		bodyModel[77].setRotationPoint(-109F, -33F, 1F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 176
		bodyModel[78].setRotationPoint(-109F, -29F, 1F);
		bodyModel[78].rotateAngleZ = 0.52359878F;

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 177
		bodyModel[79].setRotationPoint(-107F, -25.5F, 1F);
		bodyModel[79].rotateAngleZ = 0.83775804F;

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 7, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 178
		bodyModel[80].setRotationPoint(-103F, -22F, 1F);
		bodyModel[80].rotateAngleZ = 1.30899694F;

		bodyModel[81].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 223
		bodyModel[81].setRotationPoint(-107F, -35F, 2F);
		bodyModel[81].rotateAngleX = -0.2268928F;
		bodyModel[81].rotateAngleY = -0.73303829F;
		bodyModel[81].rotateAngleZ = -0.17453293F;

		bodyModel[82].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 224
		bodyModel[82].setRotationPoint(-104.5F, -34.1F, 5F);
		bodyModel[82].rotateAngleX = -0.19198622F;
		bodyModel[82].rotateAngleY = -1.1693706F;
		bodyModel[82].rotateAngleZ = -0.06981317F;

		bodyModel[83].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 5, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 225
		bodyModel[83].setRotationPoint(-101F, -33.3F, 6.55F);
		bodyModel[83].rotateAngleX = -0.15707963F;
		bodyModel[83].rotateAngleY = -1.15191731F;
		bodyModel[83].rotateAngleZ = -0.08726646F;

		bodyModel[84].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 6, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 226
		bodyModel[84].setRotationPoint(-100.5F, -27.3F, 6.55F);
		bodyModel[84].rotateAngleX = 0.15707963F;
		bodyModel[84].rotateAngleY = -1.15191731F;
		bodyModel[84].rotateAngleZ = -0.08726646F;

		bodyModel[85].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 227
		bodyModel[85].setRotationPoint(-104F, -26.5F, 5F);
		bodyModel[85].rotateAngleX = 0.20943951F;
		bodyModel[85].rotateAngleY = -1.15191731F;
		bodyModel[85].rotateAngleZ = 0.01745329F;

		bodyModel[86].addShapeBox(-0.5F, -0.5F, 0F, 1, 1, 4, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 228
		bodyModel[86].setRotationPoint(-106.5F, -25.5F, 2F);
		bodyModel[86].rotateAngleX = 0.2268928F;
		bodyModel[86].rotateAngleY = -0.73303829F;
		bodyModel[86].rotateAngleZ = 0.12217305F;

		bodyModel[87].addShapeBox(-0.5F, -0.5F, -4F, 1, 1, 4, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 230
		bodyModel[87].setRotationPoint(-107F, -35F, -2F);
		bodyModel[87].rotateAngleX = 0.2268928F;
		bodyModel[87].rotateAngleY = 0.73303829F;
		bodyModel[87].rotateAngleZ = -0.17453293F;

		bodyModel[88].addShapeBox(-0.5F, -0.5F, -4F, 1, 1, 4, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 231
		bodyModel[88].setRotationPoint(-104.5F, -34.1F, -5F);
		bodyModel[88].rotateAngleX = 0.19198622F;
		bodyModel[88].rotateAngleY = 1.1693706F;
		bodyModel[88].rotateAngleZ = -0.06981317F;

		bodyModel[89].addShapeBox(-0.5F, -0.5F, -5F, 1, 1, 5, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 232
		bodyModel[89].setRotationPoint(-101F, -33.5F, -6.5F);
		bodyModel[89].rotateAngleX = 0.15707963F;
		bodyModel[89].rotateAngleY = 1.15191731F;
		bodyModel[89].rotateAngleZ = -0.08726646F;

		bodyModel[90].addShapeBox(-0.5F, -0.5F, -3F, 1, 1, 3, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 233
		bodyModel[90].setRotationPoint(-106.5F, -25.5F, -2F);
		bodyModel[90].rotateAngleX = -0.2268928F;
		bodyModel[90].rotateAngleY = 0.73303829F;
		bodyModel[90].rotateAngleZ = 0.17453293F;

		bodyModel[91].addShapeBox(-0.5F, -0.5F, -4F, 1, 1, 4, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 234
		bodyModel[91].setRotationPoint(-104.5F, -26.3F, -4.4F);
		bodyModel[91].rotateAngleX = -0.19198622F;
		bodyModel[91].rotateAngleY = 1.1693706F;
		bodyModel[91].rotateAngleZ = -0.05235988F;

		bodyModel[92].addShapeBox(-0.5F, -0.5F, -6F, 1, 1, 6, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 235
		bodyModel[92].setRotationPoint(-101F, -27F, -5.8F);
		bodyModel[92].rotateAngleX = -0.15707963F;
		bodyModel[92].rotateAngleY = 1.11701072F;
		bodyModel[92].rotateAngleZ = -0.05235988F;

		bodyModel[93].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, 0F, -2F, -0.2F, 0F, -2F, -0.2F, 0F, 1.75F, -0.2F, 0F, 1.75F); // Box 237
		bodyModel[93].setRotationPoint(-70F, -48F, 4F);

		bodyModel[94].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F); // Box 238
		bodyModel[94].setRotationPoint(-70F, -50F, 0F);

		bodyModel[95].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 1.75F, -0.2F, 0F, 1.75F, -0.2F, 0F, -2F, -0.2F, 0F, -2F); // Box 239
		bodyModel[95].setRotationPoint(-70F, -48F, -5F);

		bodyModel[96].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F); // Box 240
		bodyModel[96].setRotationPoint(-70F, -50F, -4F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F, -0.2F, 0F, -3F, -0.2F, 0F, -3F); // Box 259
		bodyModel[97].setRotationPoint(-63F, -48F, -5F);

		bodyModel[98].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F); // Box 260
		bodyModel[98].setRotationPoint(-63F, -50F, 0F);

		bodyModel[99].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F); // Box 261
		bodyModel[99].setRotationPoint(-63F, -50F, -4F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F); // Box 262
		bodyModel[100].setRotationPoint(-63F, -48F, 4F);

		bodyModel[101].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 263
		bodyModel[101].setRotationPoint(-70F, -48.9F, -4F);
		bodyModel[101].rotateAngleX = -0.29670597F;
		bodyModel[101].rotateAngleZ = -0.01745329F;

		bodyModel[102].addShapeBox(0F, 0F, 0F, 13, 1, 1, 0F,-0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 264
		bodyModel[102].setRotationPoint(-70F, -48.9F, 4F);
		bodyModel[102].rotateAngleX = -1.23918377F;
		bodyModel[102].rotateAngleZ = -0.01745329F;

		bodyModel[103].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,-0.2F, -1.25F, 0.5F, -0.2F, -1.25F, 0.5F, -0.2F, -0.5F, -1.75F, -0.2F, -0.5F, -1.75F, -0.2F, 0F, -4F, -0.2F, 0F, -4F, -0.2F, 0F, 2.75F, -0.2F, 0F, 2.75F); // Box 265
		bodyModel[103].setRotationPoint(-71F, -51F, 2F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 1, 8, 2, 0F,-0.2F, -0.5F, -1.75F, -0.2F, -0.5F, -1.75F, -0.2F, -1.25F, 0.5F, -0.2F, -1.25F, 0.5F, -0.2F, 0F, 2.75F, -0.2F, 0F, 2.75F, -0.2F, 0F, -4F, -0.2F, 0F, -4F); // Box 266
		bodyModel[104].setRotationPoint(-71F, -51F, -4F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 267
		bodyModel[105].setRotationPoint(-71F, -50.5F, -2.5F);

		bodyModel[106].addShapeBox(-2F, -1F, -0.5F, 2, 8, 1, 0F,-1.75F, -0.5F, -0.2F, 0.5F, -1.25F, -0.2F, 0.5F, -1.25F, -0.2F, -1.75F, -0.5F, -0.2F, 5.75F, 0F, -0.2F, -6.5F, 0F, -0.2F, -6.5F, 0F, -0.2F, 5.75F, 0F, -0.2F); // Box 268
		bodyModel[106].setRotationPoint(-71F, -50F, 2F);
		bodyModel[106].rotateAngleY = -0.29670597F;
		bodyModel[106].rotateAngleZ = 0.01745329F;

		bodyModel[107].addShapeBox(-2F, -1F, -0.5F, 2, 8, 1, 0F,-1.75F, -0.5F, -0.2F, 0.5F, -1.25F, -0.2F, 0.5F, -1.25F, -0.2F, -1.75F, -0.5F, -0.2F, 5.75F, 0F, -0.2F, -6.5F, 0F, -0.2F, -6.5F, 0F, -0.2F, 5.75F, 0F, -0.2F); // Box 269
		bodyModel[107].setRotationPoint(-71F, -50F, -2F);
		bodyModel[107].rotateAngleY = 0.29670597F;

		bodyModel[108].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 270
		bodyModel[108].setRotationPoint(-4F, -43F, 0F);

		bodyModel[109].addShapeBox(0F, 0F, 0F, 8, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 271
		bodyModel[109].setRotationPoint(-4F, -43F, -6F);

		bodyModel[110].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 272
		bodyModel[110].setRotationPoint(16F, -43F, -6F);

		bodyModel[111].addShapeBox(0F, 0F, 0F, 10, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 273
		bodyModel[111].setRotationPoint(16F, -43F, 0F);

		bodyModel[112].addShapeBox(-11F, -1.5F, -1F, 13, 2, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 0
		bodyModel[112].setRotationPoint(27F, -51F, 0F);

		bodyModel[113].addShapeBox(2F, -1.5F, -0.5F, 11, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 1
		bodyModel[113].setRotationPoint(27F, -51F, 0F);

		bodyModel[114].addShapeBox(2F, -0.5F, -0.5F, 15, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 2
		bodyModel[114].setRotationPoint(27F, -51F, 0F);

		bodyModel[115].addShapeBox(2F, -1.5F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 3
		bodyModel[115].setRotationPoint(27F, -51F, 0F);

		bodyModel[116].addShapeBox(2F, -0.5F, -0.5F, 5, 1, 1, 0F,0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F); // Box 4
		bodyModel[116].setRotationPoint(27F, -51F, 0F);

		bodyModel[117].addShapeBox(6.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 5
		bodyModel[117].setRotationPoint(27F, -51F, 0F);

		bodyModel[118].addShapeBox(6.5F, -0.5F, -0.5F, 1, 1, 1, 0F,0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, -0.5F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 6
		bodyModel[118].setRotationPoint(27F, -51F, 0F);

		bodyModel[119].addShapeBox(12F, -1.5F, -0.5F, 1, 2, 1, 0F,0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F); // Box 7
		bodyModel[119].setRotationPoint(27F, -51F, 0F);

		bodyModel[120].addShapeBox(12.5F, -1.5F, -0.5F, 1, 1, 1, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F); // Box 8
		bodyModel[120].setRotationPoint(27F, -51F, 0F);

		bodyModel[121].addShapeBox(-0.5F, -0.5F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 9
		bodyModel[121].setRotationPoint(27F, -51F, 0F);

		bodyModel[122].addShapeBox(-12F, -1F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.3F, -0.4F, -0.3F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.4F, -0.3F, -0.3F); // Box 10
		bodyModel[122].setRotationPoint(27F, -51F, 0F);

		bodyModel[123].addShapeBox(-11F, -1.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 11
		bodyModel[123].setRotationPoint(27F, -51F, 0F);

		bodyModel[124].addShapeBox(-13F, -1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 12
		bodyModel[124].setRotationPoint(27F, -51F, 0F);

		bodyModel[125].addShapeBox(-13F, 1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 13
		bodyModel[125].setRotationPoint(27F, -51F, 0F);

		bodyModel[126].addShapeBox(-11F, 1.5F, -1.5F, 1, 1, 3, 0F,0F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, 0F, -0.75F, 0F); // Box 14
		bodyModel[126].setRotationPoint(27F, -51F, 0F);

		bodyModel[127].addShapeBox(-11F, 0.5F, -1F, 1, 1, 2, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 15
		bodyModel[127].setRotationPoint(27F, -51F, 0F);

		bodyModel[128].addShapeBox(-13.25F, -1.25F, 0.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.25F, -0.25F, 0F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 16
		bodyModel[128].setRotationPoint(27F, -51F, 0F);

		bodyModel[129].addShapeBox(-13.25F, 0.75F, 0.75F, 1, 1, 1, 0F,0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F, -0.25F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 18
		bodyModel[129].setRotationPoint(27F, -51F, 0F);

		bodyModel[130].addShapeBox(-13.25F, -0.25F, 0.75F, 1, 1, 1, 0F,0F, 0.25F, -0.25F, -0.25F, 0.25F, -0.25F, -0.25F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Box 19
		bodyModel[130].setRotationPoint(27F, -51F, 0F);

		bodyModel[131].addShapeBox(-13F, -1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F); // Box 20
		bodyModel[131].setRotationPoint(27F, -51F, 0F);

		bodyModel[132].addShapeBox(-13F, 1.5F, -1.5F, 2, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.75F, 0F, 0F, -2.75F, 0F, -0.75F, 0F, 0F, -0.75F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F); // Box 21
		bodyModel[132].setRotationPoint(27F, -51F, 0F);

		bodyModel[133].addShapeBox(-13.25F, -1.25F, -1.75F, 1, 1, 1, 0F,-0.25F, 0F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.5F, -0.25F, 0F, -0.5F, 0F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 22
		bodyModel[133].setRotationPoint(27F, -51F, 0F);

		bodyModel[134].addShapeBox(-13.25F, 0.75F, -1.75F, 1, 1, 1, 0F,0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F, -0.25F, -0.25F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F, -0.25F, -0.5F, -0.25F, -0.25F, -0.5F); // Box 23
		bodyModel[134].setRotationPoint(27F, -51F, 0F);

		bodyModel[135].addShapeBox(-13.25F, -0.25F, -1.75F, 1, 1, 1, 0F,0F, 0.25F, 0F, -0.25F, 0.25F, 0F, -0.25F, 0.25F, -0.25F, 0F, 0.25F, -0.25F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.25F, 0F, 0F, -0.25F); // Box 24
		bodyModel[135].setRotationPoint(27F, -51F, 0F);

		bodyModel[136].addShapeBox(-5F, -1.5F, -1.8F, 4, 2, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -0.1F, -0.8F, -0.2F, -0.1F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 25
		bodyModel[136].setRotationPoint(27F, -51F, 0F);

		bodyModel[137].addShapeBox(-10F, -1F, -1F, 4, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 26
		bodyModel[137].setRotationPoint(27F, -51F, 0F);

		bodyModel[138].addShapeBox(-7F, -1.6F, -0.5F, 7, 2, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 27
		bodyModel[138].setRotationPoint(27F, -51F, 0F);

		bodyModel[139].addShapeBox(-7F, -2.6F, -0.5F, 6, 1, 1, 0F,0F, -0.9F, -0.2F, 0F, -0.9F, 0.6F, 0F, -0.9F, -1F, 0F, -0.9F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.6F, 0F, 0F, -1F, 0F, 0F, -0.2F); // Box 28
		bodyModel[139].setRotationPoint(27F, -51F, 0F);

		bodyModel[140].addShapeBox(-6F, -1.5F, -1.8F, 1, 2, 1, 0F,0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 29
		bodyModel[140].setRotationPoint(27F, -51F, 0F);

		bodyModel[141].addShapeBox(-0.95F, -3.5F, -2.45F, 1, 2, 1, 0F,0F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, -0.2F, 0F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, -0.6F, 0F, -0.2F, -0.6F); // Box 30
		bodyModel[141].setRotationPoint(27F, -51F, 0F);

		bodyModel[142].addShapeBox(-1.5F, -2.6F, -3F, 1, 1, 3, 0F,-0.5F, -0.9F, -0.5F, 0F, -0.9F, -0.5F, 0F, -0.9F, 0F, -0.5F, -0.9F, 0F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Box 31
		bodyModel[142].setRotationPoint(27F, -51F, 0F);

		bodyModel[143].addShapeBox(-0.5F, -0.5F, -1.5F, 1, 1, 3, 0F,-0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F); // Box 32
		bodyModel[143].setRotationPoint(27F, -51F, 0F);

		bodyModel[144].addShapeBox(-1F, 0.5F, -1.5F, 2, 2, 3, 0F,0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, -0.8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 33
		bodyModel[144].setRotationPoint(27F, -51F, 0F);

		bodyModel[145].addShapeBox(-1F, -0.5F, -1.5F, 2, 2, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F); // Box 34
		bodyModel[145].setRotationPoint(27F, -51F, 0F);

		bodyModel[146].addShapeBox(-1F, -0.5F, 0.5F, 2, 2, 1, 0F,-0.5F, 0F, -0.8F, -0.5F, 0F, -0.8F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, -0.2F, -0.8F, 0F, -0.2F, -0.8F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 35
		bodyModel[146].setRotationPoint(27F, -51F, 0F);

		bodyModel[147].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F); // Box 232
		bodyModel[147].setRotationPoint(-30F, -26.5F, 26F);

		bodyModel[148].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 219
		bodyModel[148].setRotationPoint(-53F, -29F, 26F);

		bodyModel[149].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 220
		bodyModel[149].setRotationPoint(-53F, -27F, 26F);

		bodyModel[150].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 221
		bodyModel[150].setRotationPoint(-57F, -27F, 26F);

		bodyModel[151].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 222
		bodyModel[151].setRotationPoint(-57F, -29F, 26F);

		bodyModel[152].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 223
		bodyModel[152].setRotationPoint(-57.5F, -27F, 28F);

		bodyModel[153].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F); // Box 224
		bodyModel[153].setRotationPoint(-58.5F, -27F, 28F);

		bodyModel[154].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F); // Box 225
		bodyModel[154].setRotationPoint(-57F, -25F, 26F);

		bodyModel[155].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 226
		bodyModel[155].setRotationPoint(-53F, -25F, 26F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F); // Box 229
		bodyModel[156].setRotationPoint(-34F, -27F, 26F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F); // Box 230
		bodyModel[157].setRotationPoint(-34F, -29F, 26F);

		bodyModel[158].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F); // Box 231
		bodyModel[158].setRotationPoint(-34F, -25F, 26F);

		bodyModel[159].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F, 0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F); // Box 233
		bodyModel[159].setRotationPoint(-30F, -29F, 28.5F);

		bodyModel[160].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 234
		bodyModel[160].setRotationPoint(-26F, -29F, 28.5F);

		bodyModel[161].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 235
		bodyModel[161].setRotationPoint(-26F, -25F, 28.5F);

		bodyModel[162].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 236
		bodyModel[162].setRotationPoint(-26F, -26.5F, 26F);

		bodyModel[163].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 237
		bodyModel[163].setRotationPoint(-26F, -26.5F, 30F);

		bodyModel[164].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 238
		bodyModel[164].setRotationPoint(-23F, -27F, 28F);

		bodyModel[165].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 239
		bodyModel[165].setRotationPoint(-25F, -27F, 28F);

		bodyModel[166].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 240
		bodyModel[166].setRotationPoint(-25F, -27F, 29F);

		bodyModel[167].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 241
		bodyModel[167].setRotationPoint(-23F, -27F, 29F);

		bodyModel[168].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 242
		bodyModel[168].setRotationPoint(-25F, -26F, 29F);

		bodyModel[169].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 243
		bodyModel[169].setRotationPoint(-23F, -26F, 29F);

		bodyModel[170].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 244
		bodyModel[170].setRotationPoint(-23F, -26F, 28F);

		bodyModel[171].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 245
		bodyModel[171].setRotationPoint(-25F, -26F, 28F);

		bodyModel[172].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 334
		bodyModel[172].setRotationPoint(-51.5F, -31F, 28F);

		bodyModel[173].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 335
		bodyModel[173].setRotationPoint(-40.5F, -31F, 28F);

		bodyModel[174].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F); // Box 336
		bodyModel[174].setRotationPoint(-30F, -26.5F, 17F);

		bodyModel[175].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F, 0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F); // Box 337
		bodyModel[175].setRotationPoint(-30F, -29F, 19.5F);

		bodyModel[176].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 338
		bodyModel[176].setRotationPoint(-26F, -29F, 19.5F);

		bodyModel[177].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 339
		bodyModel[177].setRotationPoint(-25F, -27F, 19F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 340
		bodyModel[178].setRotationPoint(-25F, -27F, 20F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 341
		bodyModel[179].setRotationPoint(-26F, -26.5F, 21F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 342
		bodyModel[180].setRotationPoint(-23F, -27F, 20F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 343
		bodyModel[181].setRotationPoint(-25F, -26F, 19F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 344
		bodyModel[182].setRotationPoint(-25F, -26F, 20F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 345
		bodyModel[183].setRotationPoint(-26F, -26.5F, 17F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 346
		bodyModel[184].setRotationPoint(-23F, -26F, 19F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 347
		bodyModel[185].setRotationPoint(-23F, -26F, 20F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 348
		bodyModel[186].setRotationPoint(-23F, -27F, 19F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 349
		bodyModel[187].setRotationPoint(-26F, -25F, 19.5F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F); // Box 350
		bodyModel[188].setRotationPoint(-34F, -25F, 17F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F); // Box 351
		bodyModel[189].setRotationPoint(-34F, -27F, 17F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F); // Box 352
		bodyModel[190].setRotationPoint(-34F, -29F, 17F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 353
		bodyModel[191].setRotationPoint(-53F, -29F, 17F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 354
		bodyModel[192].setRotationPoint(-53F, -27F, 17F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 355
		bodyModel[193].setRotationPoint(-53F, -25F, 17F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 356
		bodyModel[194].setRotationPoint(-57F, -29F, 17F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 357
		bodyModel[195].setRotationPoint(-57F, -27F, 17F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F); // Box 358
		bodyModel[196].setRotationPoint(-57F, -25F, 17F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F); // Box 359
		bodyModel[197].setRotationPoint(-58.5F, -27F, 19F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 360
		bodyModel[198].setRotationPoint(-57.5F, -27F, 19F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 361
		bodyModel[199].setRotationPoint(-51.5F, -31F, 19F);

		bodyModel[200].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 362
		bodyModel[200].setRotationPoint(-40.5F, -31F, 19F);

		bodyModel[201].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F); // Box 363
		bodyModel[201].setRotationPoint(-30F, -26.5F, -23F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F, 0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F); // Box 364
		bodyModel[202].setRotationPoint(-30F, -29F, -20.5F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 365
		bodyModel[203].setRotationPoint(-26F, -29F, -20.5F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 366
		bodyModel[204].setRotationPoint(-25F, -27F, -21F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 367
		bodyModel[205].setRotationPoint(-25F, -27F, -20F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 368
		bodyModel[206].setRotationPoint(-26F, -26.5F, -19F);

		bodyModel[207].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 369
		bodyModel[207].setRotationPoint(-23F, -27F, -20F);

		bodyModel[208].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 370
		bodyModel[208].setRotationPoint(-25F, -26F, -21F);

		bodyModel[209].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 371
		bodyModel[209].setRotationPoint(-25F, -26F, -20F);

		bodyModel[210].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 372
		bodyModel[210].setRotationPoint(-26F, -26.5F, -23F);

		bodyModel[211].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 373
		bodyModel[211].setRotationPoint(-23F, -26F, -21F);

		bodyModel[212].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 374
		bodyModel[212].setRotationPoint(-23F, -26F, -20F);

		bodyModel[213].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 375
		bodyModel[213].setRotationPoint(-23F, -27F, -21F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 376
		bodyModel[214].setRotationPoint(-26F, -25F, -20.5F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F); // Box 377
		bodyModel[215].setRotationPoint(-34F, -25F, -23F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F); // Box 378
		bodyModel[216].setRotationPoint(-34F, -27F, -23F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F); // Box 379
		bodyModel[217].setRotationPoint(-34F, -29F, -23F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 380
		bodyModel[218].setRotationPoint(-53F, -29F, -23F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 381
		bodyModel[219].setRotationPoint(-53F, -27F, -23F);

		bodyModel[220].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 382
		bodyModel[220].setRotationPoint(-53F, -25F, -23F);

		bodyModel[221].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 383
		bodyModel[221].setRotationPoint(-57F, -29F, -23F);

		bodyModel[222].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 384
		bodyModel[222].setRotationPoint(-57F, -27F, -23F);

		bodyModel[223].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F); // Box 385
		bodyModel[223].setRotationPoint(-57F, -25F, -23F);

		bodyModel[224].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F); // Box 386
		bodyModel[224].setRotationPoint(-58.5F, -27F, -21F);

		bodyModel[225].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 387
		bodyModel[225].setRotationPoint(-57.5F, -27F, -21F);

		bodyModel[226].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 388
		bodyModel[226].setRotationPoint(-51.5F, -31F, -21F);

		bodyModel[227].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 389
		bodyModel[227].setRotationPoint(-40.5F, -31F, -21F);

		bodyModel[228].addShapeBox(0F, 0F, 0F, 4, 1, 6, 0F,0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F, 0F, -0.4F, -1.6F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1.6F); // Box 390
		bodyModel[228].setRotationPoint(-30F, -26.5F, -32F);

		bodyModel[229].addShapeBox(0F, 0F, 0F, 4, 6, 1, 0F,0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F, 0F, -1.6F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, -1.6F, -0.4F); // Box 391
		bodyModel[229].setRotationPoint(-30F, -29F, -29.5F);

		bodyModel[230].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 392
		bodyModel[230].setRotationPoint(-26F, -29F, -29.5F);

		bodyModel[231].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 393
		bodyModel[231].setRotationPoint(-25F, -27F, -30F);

		bodyModel[232].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 394
		bodyModel[232].setRotationPoint(-25F, -27F, -29F);

		bodyModel[233].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 395
		bodyModel[233].setRotationPoint(-26F, -26.5F, -28F);

		bodyModel[234].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F, -0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F); // Box 396
		bodyModel[234].setRotationPoint(-23F, -27F, -29F);

		bodyModel[235].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 397
		bodyModel[235].setRotationPoint(-25F, -26F, -30F);

		bodyModel[236].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 398
		bodyModel[236].setRotationPoint(-25F, -26F, -29F);

		bodyModel[237].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F); // Box 399
		bodyModel[237].setRotationPoint(-26F, -26.5F, -32F);

		bodyModel[238].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F, -0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F); // Box 400
		bodyModel[238].setRotationPoint(-23F, -26F, -30F);

		bodyModel[239].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, -0.1F, -1F, 0F, -0.1F, -1F, 0F, -0.1F, 0.2F, -0.75F, -0.1F, 0.2F, -0.75F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0.2F, -0.9F, -0.75F, 0.2F, -0.9F); // Box 401
		bodyModel[239].setRotationPoint(-23F, -26F, -29F);

		bodyModel[240].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,-0.75F, 0.2F, -0.9F, 0F, 0.2F, -0.9F, 0F, 0F, -0.1F, -0.75F, 0F, -0.1F, -0.75F, -0.1F, 0.2F, 0F, -0.1F, 0.2F, 0F, -0.1F, -1F, -0.75F, -0.1F, -1F); // Box 402
		bodyModel[240].setRotationPoint(-23F, -27F, -30F);

		bodyModel[241].addShapeBox(0F, 0F, 0F, 5, 2, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 403
		bodyModel[241].setRotationPoint(-26F, -25F, -29.5F);

		bodyModel[242].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F); // Box 404
		bodyModel[242].setRotationPoint(-34F, -25F, -32F);

		bodyModel[243].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.75F, -2.75F, 0F, -0.75F, -2.75F, 0F, 0F, 0F); // Box 405
		bodyModel[243].setRotationPoint(-34F, -27F, -32F);

		bodyModel[244].addShapeBox(0F, 0F, 0F, 8, 2, 6, 0F,0F, 0F, -2F, 0F, -2.75F, -2.75F, 0F, -2.75F, -2.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0.75F, -2.75F, 0F, 0.75F, -2.75F, 0F, 0F, 0F); // Box 406
		bodyModel[244].setRotationPoint(-34F, -29F, -32F);

		bodyModel[245].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 407
		bodyModel[245].setRotationPoint(-53F, -29F, -32F);

		bodyModel[246].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyModel[246].setRotationPoint(-53F, -27F, -32F);

		bodyModel[247].addShapeBox(0F, 0F, 0F, 19, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F); // Box 409
		bodyModel[247].setRotationPoint(-53F, -25F, -32F);

		bodyModel[248].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F, 0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F); // Box 410
		bodyModel[248].setRotationPoint(-57F, -29F, -32F);

		bodyModel[249].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F, 0F, -0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -2F); // Box 411
		bodyModel[249].setRotationPoint(-57F, -27F, -32F);

		bodyModel[250].addShapeBox(0F, 0F, 0F, 4, 2, 6, 0F,0F, 0.5F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -2F, 0F, -2F, -2.5F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -2F, -2.5F); // Box 412
		bodyModel[250].setRotationPoint(-57F, -25F, -32F);

		bodyModel[251].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,-0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, -0.8F, -0.25F, -0.25F); // Box 413
		bodyModel[251].setRotationPoint(-58.5F, -27F, -30F);

		bodyModel[252].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 414
		bodyModel[252].setRotationPoint(-57.5F, -27F, -30F);

		bodyModel[253].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 415
		bodyModel[253].setRotationPoint(-51.5F, -31F, -30F);

		bodyModel[254].addShapeBox(0F, 0F, 0F, 5, 3, 2, 0F,0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F, 0F, -0.75F, -0.75F); // Box 416
		bodyModel[254].setRotationPoint(-40.5F, -31F, -30F);

		bodyModel[255].addShapeBox(0F, 0F, 0F, 7, 1, 12, 0F,0F, 0.5F, -1F, -1.25F, 0F, 0F, -1.25F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F); // Box 417
		bodyModel[255].setRotationPoint(-77F, -42.5F, -6F);

		bodyModel[256].addShapeBox(0F, 0F, 0F, 6, 4, 16, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 418
		bodyModel[256].setRotationPoint(-77F, -38.5F, -8F);

		bodyModel[257].addShapeBox(0F, 0F, 0F, 6, 3, 12, 0F,0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F); // Box 419
		bodyModel[257].setRotationPoint(-77F, -41.5F, -6F);

		bodyModel[258].addShapeBox(0F, 0F, 0F, 6, 4, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 420
		bodyModel[258].setRotationPoint(-77F, -34.5F, -3F);

		bodyModel[259].addShapeBox(0F, 0F, 0F, 10, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 421
		bodyModel[259].setRotationPoint(-67F, -38F, -8F);

		bodyModel[260].addShapeBox(0F, 0F, 0F, 10, 8, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 422
		bodyModel[260].setRotationPoint(-67F, -38F, 5F);

		bodyModel[261].addShapeBox(0F, 0F, 0F, 10, 3, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 423
		bodyModel[261].setRotationPoint(-67F, -32F, -4F);

		bodyModel[262].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 424
		bodyModel[262].setRotationPoint(-57.5F, -46F, -4F);
		bodyModel[262].rotateAngleX = 0.01745329F;
		bodyModel[262].rotateAngleY = 0.01745329F;
		bodyModel[262].rotateAngleZ = -0.17453293F;

		bodyModel[263].addShapeBox(-0.5F, 0F, -0.5F, 1, 6, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 592
		bodyModel[263].setRotationPoint(-69F, -36.5F, 0F);

		bodyModel[264].addShapeBox(-0.5F, 0F, -0.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		bodyModel[264].setRotationPoint(-69F, -37.5F, 0F);

		bodyModel[265].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 5, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F); // Box 594
		bodyModel[265].setRotationPoint(-67F, -37.5F, -2F);

		bodyModel[266].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 595
		bodyModel[266].setRotationPoint(-67F, -39.5F, -2F);

		bodyModel[267].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 596
		bodyModel[267].setRotationPoint(-67F, -39.5F, 2F);

		bodyModel[268].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, -1.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Import 
		bodyModel[268].setRotationPoint(-69.5F, -31F, -1F);

		bodyModel[269].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 905
		bodyModel[269].setRotationPoint(-74F, -32.5F, -6F);
		bodyModel[269].rotateAngleZ = 0.41887903F;

		bodyModel[270].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 906
		bodyModel[270].setRotationPoint(-74F, -32.5F, -6F);
		bodyModel[270].rotateAngleZ = 0.41887903F;

		bodyModel[271].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, 0.3F, 0.0F, 0.2F); // Import 
		bodyModel[271].setRotationPoint(-71.7F, -42.78F, -0.5F);

		bodyModel[272].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, -0.5F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, -0.5F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F); // Import 
		bodyModel[272].setRotationPoint(-71.7F, -43.3F, -0.5F);

		bodyModel[273].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.2F, -0.5F, 0.0F, -0.3F, -0.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F, -0.5F, -0.5F, -0.3F, 0.0F, -0.5F, 0.2F); // Import 
		bodyModel[273].setRotationPoint(-71.2F, -43.3F, -0.5F);

		bodyModel[274].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.5F, 0.0F, -0.3F, 0.0F, 0.0F, 0.2F, 0.0F, 0.0F, 0.2F, -0.5F, 0.0F, -0.3F, -0.5F, -0.5F, -0.3F, 0.0F, -0.5F, 0.2F, 0.0F, -0.5F, 0.2F, -0.5F, -0.5F, -0.3F); // Import 
		bodyModel[274].setRotationPoint(-72.7F, -43.3F, -0.5F);

		bodyModel[275].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F); // Import 
		bodyModel[275].setRotationPoint(-72F, -43.6F, -0.5F);

		bodyModel[276].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 922
		bodyModel[276].setRotationPoint(-65F, -39.5F, -6F);

		bodyModel[277].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 927
		bodyModel[277].setRotationPoint(-65F, -39.5F, -6F);

		bodyModel[278].addShapeBox(-0.5F, 0F, -0.5F, 1, 1, 1, 0F,-0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 929
		bodyModel[278].setRotationPoint(-65F, -39.5F, -6.75F);

		bodyModel[279].addShapeBox(-0.5F, 0F, -0.5F, 1, 2, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 930
		bodyModel[279].setRotationPoint(-65F, -39.5F, -6.75F);

		bodyModel[280].addShapeBox(0F, -1F, 0F, 1, 1, 2, 0F,0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, -0.5F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 444
		bodyModel[280].setRotationPoint(-74F, -32.5F, 4F);
		bodyModel[280].rotateAngleZ = 0.41887903F;

		bodyModel[281].addShapeBox(0F, 0F, 0F, 1, 3, 2, 0F,0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F); // Box 445
		bodyModel[281].setRotationPoint(-74F, -32.5F, 4F);
		bodyModel[281].rotateAngleZ = 0.41887903F;

		bodyModel[282].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 446
		bodyModel[282].setRotationPoint(-66F, -38.25F, -7.5F);

		bodyModel[283].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 447
		bodyModel[283].setRotationPoint(-71.7F, -40.78F, 2.5F);

		bodyModel[284].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 448
		bodyModel[284].setRotationPoint(-71.7F, -40.78F, 0F);

		bodyModel[285].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		bodyModel[285].setRotationPoint(-71.7F, -40.78F, -5F);

		bodyModel[286].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 450
		bodyModel[286].setRotationPoint(-71.7F, -40.78F, -3.5F);

		bodyModel[287].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 451
		bodyModel[287].setRotationPoint(-71.7F, -38.78F, -3.5F);

		bodyModel[288].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 452
		bodyModel[288].setRotationPoint(-71.7F, -38.78F, -5F);

		bodyModel[289].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.45F, 0F, -0.45F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Box 83
		bodyModel[289].setRotationPoint(-78F, -47.5F, -0.5F);

		bodyModel[290].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Box 84
		bodyModel[290].setRotationPoint(-93F, -47F, -0.5F);

		bodyModel[291].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 85
		bodyModel[291].setRotationPoint(-93F, -48.6F, -0.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 86
		bodyModel[292].setRotationPoint(-93F, -48.1F, 0.05F);

		bodyModel[293].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F); // Box 87
		bodyModel[293].setRotationPoint(-93F, -47.5F, -0.5F);

		bodyModel[294].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,-0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F, -0.3F, 0F, -0.4F); // Box 88
		bodyModel[294].setRotationPoint(-93F, -48.1F, -1F);

		bodyModel[295].addShapeBox(0F, 0F, 0F, 9, 32, 1, 0F,0F, 0F, -0.2F, 0.2F, -4.9F, -0.299999999999999F, 0F, -4.9F, 0F, 0F, -0.3F, 0F, 0F, 0F, 1F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 465
		bodyModel[295].setRotationPoint(87F, -76F, -1F);

		bodyModel[296].addShapeBox(0F, 0F, 0F, 23, 31, 1, 0F,-23F, 0F, -0.5F, -4.16333634234434E-16F, 0F, -0.2F, 0F, 0F, 0F, -22F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 1F, 0F, 0F, 0F, 1F, 0F, 0F); // Box 466
		bodyModel[296].setRotationPoint(64F, -76F, -1F);

		bodyModel[297].addShapeBox(0F, 0F, 0F, 8, 4, 3, 0F,0F, 0F, -3F, 0F, 0F, -3.2F, 0F, -1.1F, 0F, 0F, -1F, 0F, 0F, -0.5F, 3F, 0F, 0F, 2.9F, 0F, 0F, -4.6F, 0F, 0F, -5F); // Box 468
		bodyModel[297].setRotationPoint(-4F, -51F, -3F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 10, 2, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 469
		bodyModel[298].setRotationPoint(-98F, -24F, -4F);

		bodyModel[299].addShapeBox(0F, 0F, 0F, 2, 14, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 470
		bodyModel[299].setRotationPoint(-89.5F, -38F, -4F);
		bodyModel[299].rotateAngleX = 0.01745329F;
		bodyModel[299].rotateAngleY = 0.01745329F;
		bodyModel[299].rotateAngleZ = -0.17453293F;

		bodyModel[300].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F); // Box 471
		bodyModel[300].setRotationPoint(-58F, -48F, 4F);

		bodyModel[301].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F, -0.2F, 0F, -3F, -0.2F, 0F, -3F); // Box 472
		bodyModel[301].setRotationPoint(-58F, -48F, -5F);

		bodyModel[302].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F); // Box 473
		bodyModel[302].setRotationPoint(-58F, -50F, -4F);

		bodyModel[303].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F); // Box 474
		bodyModel[303].setRotationPoint(-58F, -50F, 0F);

		bodyModel[304].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F); // Box 475
		bodyModel[304].setRotationPoint(4F, -50.5F, 4F);

		bodyModel[305].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F, -0.2F, 0F, -3F, -0.2F, 0F, -3F); // Box 476
		bodyModel[305].setRotationPoint(4F, -50.5F, -5F);

		bodyModel[306].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F); // Box 477
		bodyModel[306].setRotationPoint(4F, -52.5F, -4F);

		bodyModel[307].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F); // Box 478
		bodyModel[307].setRotationPoint(4F, -52.5F, 0F);

		bodyModel[308].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F); // Box 479
		bodyModel[308].setRotationPoint(0F, -50.5F, 4F);

		bodyModel[309].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F); // Box 480
		bodyModel[309].setRotationPoint(0F, -52.5F, 0F);

		bodyModel[310].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F); // Box 481
		bodyModel[310].setRotationPoint(0F, -52.5F, -4F);

		bodyModel[311].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F, -0.2F, 0F, -3F, -0.2F, 0F, -3F); // Box 482
		bodyModel[311].setRotationPoint(0F, -50.5F, -5F);

		bodyModel[312].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F); // Box 485
		bodyModel[312].setRotationPoint(-8F, -52.5F, -4F);

		bodyModel[313].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F); // Box 487
		bodyModel[313].setRotationPoint(-8F, -52.5F, 0F);

		bodyModel[314].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F, -0.2F, 0F, -3F, -0.2F, 0F, -3F); // Box 489
		bodyModel[314].setRotationPoint(-8F, -50.5F, -5F);

		bodyModel[315].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F); // Box 490
		bodyModel[315].setRotationPoint(-8F, -50.5F, 4F);

		bodyModel[316].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F, -0.2F, 0F, -3F, -0.2F, 0F, -3F); // Box 491
		bodyModel[316].setRotationPoint(-4F, -50.5F, -5F);

		bodyModel[317].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F); // Box 492
		bodyModel[317].setRotationPoint(-4F, -52.5F, -4F);

		bodyModel[318].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F); // Box 493
		bodyModel[318].setRotationPoint(-4F, -50.5F, 4F);

		bodyModel[319].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F); // Box 494
		bodyModel[319].setRotationPoint(-4F, -52.5F, 0F);

		bodyModel[320].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 495
		bodyModel[320].setRotationPoint(-19F, -46.4F, -7.25F);

		bodyModel[321].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F, -0.2F, 0F, -3F, -0.2F, 0F, -3F); // Box 496
		bodyModel[321].setRotationPoint(-12F, -50.5F, -5F);

		bodyModel[322].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F); // Box 497
		bodyModel[322].setRotationPoint(-12F, -52.5F, -4F);

		bodyModel[323].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F); // Box 498
		bodyModel[323].setRotationPoint(-12F, -52.5F, 0F);

		bodyModel[324].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F); // Box 499
		bodyModel[324].setRotationPoint(-12F, -50.5F, 4F);

		bodyModel[325].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F, -0.2F, 0F, -3F, -0.2F, 0F, -3F); // Box 500
		bodyModel[325].setRotationPoint(-16F, -50.5F, -5F);

		bodyModel[326].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F); // Box 501
		bodyModel[326].setRotationPoint(-16F, -52.5F, -4F);

		bodyModel[327].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F); // Box 502
		bodyModel[327].setRotationPoint(-16F, -52.5F, 0F);

		bodyModel[328].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F); // Box 503
		bodyModel[328].setRotationPoint(-16F, -50.5F, 4F);

		bodyModel[329].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F, -0.2F, 0F, -3F, -0.2F, 0F, -3F); // Box 504
		bodyModel[329].setRotationPoint(-19F, -50.5F, -5F);

		bodyModel[330].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F); // Box 505
		bodyModel[330].setRotationPoint(-19F, -52.5F, -4F);

		bodyModel[331].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,-0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -2F, 0.25F, -0.2F, -2F, 0.25F, -0.2F, -0.25F, 0F, -0.2F, -0.25F, 0F, -0.2F, 1.75F, 0F, -0.2F, 1.75F, 0F); // Box 506
		bodyModel[331].setRotationPoint(-19F, -52.5F, 0F);

		bodyModel[332].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,-0.2F, -0.75F, 0F, -0.2F, -0.75F, 0F, -0.2F, 0F, -0.75F, -0.2F, 0F, -0.75F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, 2.25F, -0.2F, -0.5F, 2.25F); // Box 507
		bodyModel[332].setRotationPoint(-19F, -50.5F, 4F);

		bodyModel[333].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 508
		bodyModel[333].setRotationPoint(-19F, -46.4F, 6F);

		bodyModel[334].addShapeBox(0F, 0F, 0F, 24, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 509
		bodyModel[334].setRotationPoint(-19F, -52.7F, -0.5F);

		bodyModel[335].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 510
		bodyModel[335].setRotationPoint(30F, -46F, 8.6F);
		bodyModel[335].rotateAngleY = -0.08726646F;

		bodyModel[336].addShapeBox(0F, 0F, 0F, 20, 20, 0, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 511
		bodyModel[336].setRotationPoint(30F, -46F, -8.5F);
		bodyModel[336].rotateAngleY = 0.10471976F;

		bodyModel[337].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 512
		bodyModel[337].setRotationPoint(-53F, -42.5F, 123.5F);
		bodyModel[337].rotateAngleX = 0.03490659F;
		bodyModel[337].rotateAngleY = 0.01745329F;
		bodyModel[337].rotateAngleZ = -0.01745329F;

		bodyModel[338].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 513
		bodyModel[338].setRotationPoint(-53F, -43.2F, -153.5F);
		bodyModel[338].rotateAngleX = -0.03490659F;

		bodyModel[339].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 514
		bodyModel[339].setRotationPoint(-53F, -36.2F, -137.5F);
		bodyModel[339].rotateAngleX = -0.10471976F;

		bodyModel[340].addShapeBox(0F, 0F, 0F, 30, 0, 30, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 515
		bodyModel[340].setRotationPoint(-53F, -33.5F, 106.5F);
		bodyModel[340].rotateAngleX = 0.08726646F;
	}

	private void inittailModel_1()
	{
		tailModel[0] = new ModelRendererTurbo(this, 721, 1, textureX, textureY); // Box 0
		tailModel[1] = new ModelRendererTurbo(this, 561, 17, textureX, textureY); // Box 1
		tailModel[2] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 2
		tailModel[3] = new ModelRendererTurbo(this, 817, 33, textureX, textureY); // Box 3
		tailModel[4] = new ModelRendererTurbo(this, 649, 1, textureX, textureY); // Box 4
		tailModel[5] = new ModelRendererTurbo(this, 841, 1, textureX, textureY); // Box 5
		tailModel[6] = new ModelRendererTurbo(this, 145, 25, textureX, textureY); // Box 6
		tailModel[7] = new ModelRendererTurbo(this, 505, 17, textureX, textureY); // Box 7
		tailModel[8] = new ModelRendererTurbo(this, 153, 25, textureX, textureY); // Box 8
		tailModel[9] = new ModelRendererTurbo(this, 785, 25, textureX, textureY); // Box 9
		tailModel[10] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 10
		tailModel[11] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 11
		tailModel[12] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 12
		tailModel[13] = new ModelRendererTurbo(this, 457, 33, textureX, textureY); // Box 13
		tailModel[14] = new ModelRendererTurbo(this, 465, 33, textureX, textureY); // Box 14
		tailModel[15] = new ModelRendererTurbo(this, 545, 33, textureX, textureY); // Box 15
		tailModel[16] = new ModelRendererTurbo(this, 553, 33, textureX, textureY); // Box 16
		tailModel[17] = new ModelRendererTurbo(this, 441, 49, textureX, textureY); // Box 242
		tailModel[18] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 243
		tailModel[19] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 244
		tailModel[20] = new ModelRendererTurbo(this, 41, 65, textureX, textureY); // Box 245
		tailModel[21] = new ModelRendererTurbo(this, 841, 33, textureX, textureY); // Box 246
		tailModel[22] = new ModelRendererTurbo(this, 769, 41, textureX, textureY); // Box 247
		tailModel[23] = new ModelRendererTurbo(this, 457, 49, textureX, textureY); // Box 248
		tailModel[24] = new ModelRendererTurbo(this, 857, 41, textureX, textureY); // Box 249
		tailModel[25] = new ModelRendererTurbo(this, 153, 49, textureX, textureY); // Box 250
		tailModel[26] = new ModelRendererTurbo(this, 545, 57, textureX, textureY); // Box 251
		tailModel[27] = new ModelRendererTurbo(this, 905, 49, textureX, textureY); // Box 252
		tailModel[28] = new ModelRendererTurbo(this, 905, 41, textureX, textureY); // Box 253
		tailModel[29] = new ModelRendererTurbo(this, 217, 49, textureX, textureY); // Box 254
		tailModel[30] = new ModelRendererTurbo(this, 489, 57, textureX, textureY); // Box 255
		tailModel[31] = new ModelRendererTurbo(this, 65, 49, textureX, textureY); // Box 256
		tailModel[32] = new ModelRendererTurbo(this, 833, 57, textureX, textureY); // Box 257
		tailModel[33] = new ModelRendererTurbo(this, 841, 57, textureX, textureY); // Box 258

		tailModel[0].addShapeBox(-3F, -2F, 2F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		tailModel[0].setRotationPoint(-103F, -28F, 0F);
		tailModel[0].rotateAngleY = 3.14159265F;

		tailModel[1].addShapeBox(-3F, -1F, 2F, 6, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 1
		tailModel[1].setRotationPoint(-103F, -28F, 0F);
		tailModel[1].rotateAngleY = 3.14159265F;

		tailModel[2].addShapeBox(3F, -1.75F, 2F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.5F, -0.25F); // Box 2
		tailModel[2].setRotationPoint(-103F, -28F, 0F);
		tailModel[2].rotateAngleY = 3.14159265F;

		tailModel[3].addShapeBox(3F, -1.25F, 2F, 8, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 3
		tailModel[3].setRotationPoint(-103F, -28F, 0F);
		tailModel[3].rotateAngleY = 3.14159265F;

		tailModel[4].addShapeBox(10F, -2.25F, 2F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 4
		tailModel[4].setRotationPoint(-103F, -28F, 0F);
		tailModel[4].rotateAngleY = 3.14159265F;

		tailModel[5].addShapeBox(10F, -4.25F, 2F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F); // Box 5
		tailModel[5].setRotationPoint(-103F, -28F, 0F);
		tailModel[5].rotateAngleY = 3.14159265F;

		tailModel[6].addShapeBox(-3.5F, -4.25F, 2F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F); // Box 6
		tailModel[6].setRotationPoint(-103F, -28F, 0F);
		tailModel[6].rotateAngleY = 3.14159265F;

		tailModel[7].addShapeBox(0F, -3F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 7
		tailModel[7].setRotationPoint(-103F, -28F, 0F);
		tailModel[7].rotateAngleY = 3.14159265F;

		tailModel[8].addShapeBox(0F, -3F, 3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 8
		tailModel[8].setRotationPoint(-103F, -28F, 0F);
		tailModel[8].rotateAngleY = 3.14159265F;

		tailModel[9].addShapeBox(0F, -3F, 1F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 9
		tailModel[9].setRotationPoint(-103F, -28F, 0F);
		tailModel[9].rotateAngleY = 3.14159265F;

		tailModel[10].addShapeBox(-6F, -3.25F, 2F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 10
		tailModel[10].setRotationPoint(-103F, -28F, 0F);
		tailModel[10].rotateAngleY = 3.14159265F;

		tailModel[11].addShapeBox(-5F, -3.25F, 2F, 2, 2, 1, 0F,0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F); // Box 11
		tailModel[11].setRotationPoint(-103F, -28F, 0F);
		tailModel[11].rotateAngleY = 3.14159265F;

		tailModel[12].addShapeBox(-5F, -1.25F, 2F, 2, 2, 1, 0F,0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F); // Box 12
		tailModel[12].setRotationPoint(-103F, -28F, 0F);
		tailModel[12].rotateAngleY = 3.14159265F;

		tailModel[13].addShapeBox(-3.25F, -1.25F, 2F, 1, 3, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F); // Box 13
		tailModel[13].setRotationPoint(-103F, -28F, 0F);
		tailModel[13].rotateAngleY = 3.14159265F;

		tailModel[14].addShapeBox(-2.75F, -1.5F, 2F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F); // Box 14
		tailModel[14].setRotationPoint(-103F, -28F, 0F);
		tailModel[14].rotateAngleY = 3.14159265F;

		tailModel[15].addShapeBox(-0.75F, -1.3F, 2F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F); // Box 15
		tailModel[15].setRotationPoint(-103F, -28F, 0F);
		tailModel[15].rotateAngleY = 3.14159265F;

		tailModel[16].addShapeBox(-1F, -1.3F, 2F, 1, 2, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F); // Box 16
		tailModel[16].setRotationPoint(-103F, -28F, 0F);
		tailModel[16].rotateAngleY = 3.14159265F;

		tailModel[17].addShapeBox(-3F, -2F, -3F, 6, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		tailModel[17].setRotationPoint(-103F, -28F, 0F);
		tailModel[17].rotateAngleY = 3.14159265F;

		tailModel[18].addShapeBox(-3F, -1F, -3F, 6, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 243
		tailModel[18].setRotationPoint(-103F, -28F, 0F);
		tailModel[18].rotateAngleY = 3.14159265F;

		tailModel[19].addShapeBox(3F, -1.75F, -3F, 10, 1, 1, 0F,0F, 0F, -0.25F, 0F, -0.125F, -0.375F, 0F, -0.125F, -0.375F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.625F, -0.375F, 0F, -0.625F, -0.375F, 0F, -0.5F, -0.25F); // Box 244
		tailModel[19].setRotationPoint(-103F, -28F, 0F);
		tailModel[19].rotateAngleY = 3.14159265F;

		tailModel[20].addShapeBox(3F, -1.25F, -3F, 8, 1, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F); // Box 245
		tailModel[20].setRotationPoint(-103F, -28F, 0F);
		tailModel[20].rotateAngleY = 3.14159265F;

		tailModel[21].addShapeBox(10F, -2.25F, -3F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 246
		tailModel[21].setRotationPoint(-103F, -28F, 0F);
		tailModel[21].rotateAngleY = 3.14159265F;

		tailModel[22].addShapeBox(10F, -4.25F, -3F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F); // Box 247
		tailModel[22].setRotationPoint(-103F, -28F, 0F);
		tailModel[22].rotateAngleY = 3.14159265F;

		tailModel[23].addShapeBox(-3.5F, -4.25F, -3F, 1, 3, 1, 0F,-0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, 0F, -0.5F, -0.45F, -0.7F, -0.5F, -0.45F); // Box 248
		tailModel[23].setRotationPoint(-103F, -28F, 0F);
		tailModel[23].rotateAngleY = 3.14159265F;

		tailModel[24].addShapeBox(0F, -3F, -3F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		tailModel[24].setRotationPoint(-103F, -28F, 0F);
		tailModel[24].rotateAngleY = 3.14159265F;

		tailModel[25].addShapeBox(0F, -3F, -2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 250
		tailModel[25].setRotationPoint(-103F, -28F, 0F);
		tailModel[25].rotateAngleY = 3.14159265F;

		tailModel[26].addShapeBox(0F, -3F, -4F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 251
		tailModel[26].setRotationPoint(-103F, -28F, 0F);
		tailModel[26].rotateAngleY = 3.14159265F;

		tailModel[27].addShapeBox(-6F, -3.25F, -3F, 1, 4, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Box 252
		tailModel[27].setRotationPoint(-103F, -28F, 0F);
		tailModel[27].rotateAngleY = 3.14159265F;

		tailModel[28].addShapeBox(-5F, -3.25F, -3F, 2, 2, 1, 0F,0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F); // Box 253
		tailModel[28].setRotationPoint(-103F, -28F, 0F);
		tailModel[28].rotateAngleY = 3.14159265F;

		tailModel[29].addShapeBox(-5F, -1.25F, -3F, 2, 2, 1, 0F,0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F, 0F, -1.3F, -0.25F, 0F, -1.3F, -0.25F, 0F, -0.5F, -0.25F); // Box 254
		tailModel[29].setRotationPoint(-103F, -28F, 0F);
		tailModel[29].rotateAngleY = 3.14159265F;

		tailModel[30].addShapeBox(-3.25F, -1.25F, -3F, 1, 3, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F); // Box 255
		tailModel[30].setRotationPoint(-103F, -28F, 0F);
		tailModel[30].rotateAngleY = 3.14159265F;

		tailModel[31].addShapeBox(-2.75F, -1.5F, -3F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F); // Box 256
		tailModel[31].setRotationPoint(-103F, -28F, 0F);
		tailModel[31].rotateAngleY = 3.14159265F;

		tailModel[32].addShapeBox(-0.75F, -1.3F, -3F, 1, 2, 1, 0F,-0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F); // Box 257
		tailModel[32].setRotationPoint(-103F, -28F, 0F);
		tailModel[32].rotateAngleY = 3.14159265F;

		tailModel[33].addShapeBox(-1F, -1.3F, -3F, 1, 2, 1, 0F,0F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.1F, -0.5F, -0.25F, -0.3F, -0.5F, -0.25F); // Box 258
		tailModel[33].setRotationPoint(-103F, -28F, 0F);
		tailModel[33].rotateAngleY = 3.14159265F;
	}

	private void initleftWingModel_1()
	{
		leftWingModel[0] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 224
		leftWingModel[1] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Box 225
		leftWingModel[2] = new ModelRendererTurbo(this, 313, 153, textureX, textureY); // Box 226
		leftWingModel[3] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 227
		leftWingModel[4] = new ModelRendererTurbo(this, 729, 145, textureX, textureY); // Box 228
		leftWingModel[5] = new ModelRendererTurbo(this, 521, 177, textureX, textureY); // Box 229
		leftWingModel[6] = new ModelRendererTurbo(this, 177, 89, textureX, textureY); // Box 230
		leftWingModel[7] = new ModelRendererTurbo(this, 729, 177, textureX, textureY); // Box 231
		leftWingModel[8] = new ModelRendererTurbo(this, 801, 177, textureX, textureY); // Box 232
		leftWingModel[9] = new ModelRendererTurbo(this, 873, 177, textureX, textureY); // Box 233
		leftWingModel[10] = new ModelRendererTurbo(this, 945, 177, textureX, textureY); // Box 235
		leftWingModel[11] = new ModelRendererTurbo(this, 1, 185, textureX, textureY); // Box 236
		leftWingModel[12] = new ModelRendererTurbo(this, 777, 209, textureX, textureY); // Box 237
		leftWingModel[13] = new ModelRendererTurbo(this, 577, 97, textureX, textureY); // Box 238
		leftWingModel[14] = new ModelRendererTurbo(this, 833, 209, textureX, textureY); // Box 239
		leftWingModel[15] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 240
		leftWingModel[16] = new ModelRendererTurbo(this, 209, 217, textureX, textureY); // Box 135
		leftWingModel[17] = new ModelRendererTurbo(this, 897, 217, textureX, textureY); // Box 136
		leftWingModel[18] = new ModelRendererTurbo(this, 297, 225, textureX, textureY); // Box 137
		leftWingModel[19] = new ModelRendererTurbo(this, 993, 105, textureX, textureY); // Box 138
		leftWingModel[20] = new ModelRendererTurbo(this, 729, 217, textureX, textureY); // Box 139
		leftWingModel[21] = new ModelRendererTurbo(this, 385, 225, textureX, textureY); // Box 140
		leftWingModel[22] = new ModelRendererTurbo(this, 977, 129, textureX, textureY); // Box 141
		leftWingModel[23] = new ModelRendererTurbo(this, 449, 225, textureX, textureY); // Box 142
		leftWingModel[24] = new ModelRendererTurbo(this, 521, 225, textureX, textureY); // Box 143
		leftWingModel[25] = new ModelRendererTurbo(this, 841, 233, textureX, textureY); // Box 144
		leftWingModel[26] = new ModelRendererTurbo(this, 1, 241, textureX, textureY); // Box 145
		leftWingModel[27] = new ModelRendererTurbo(this, 889, 249, textureX, textureY); // Box 146
		leftWingModel[28] = new ModelRendererTurbo(this, 209, 257, textureX, textureY); // Box 147
		leftWingModel[29] = new ModelRendererTurbo(this, 945, 249, textureX, textureY); // Box 148
		leftWingModel[30] = new ModelRendererTurbo(this, 265, 257, textureX, textureY); // Box 149
		leftWingModel[31] = new ModelRendererTurbo(this, 353, 257, textureX, textureY); // Box 150
		leftWingModel[32] = new ModelRendererTurbo(this, 505, 273, textureX, textureY); // Box 241
		leftWingModel[33] = new ModelRendererTurbo(this, 1, 193, textureX, textureY); // Box 242
		leftWingModel[34] = new ModelRendererTurbo(this, 953, 185, textureX, textureY); // Box 243
		leftWingModel[35] = new ModelRendererTurbo(this, 721, 273, textureX, textureY); // Box 462
		leftWingModel[36] = new ModelRendererTurbo(this, 617, 201, textureX, textureY); // Box 463
		leftWingModel[37] = new ModelRendererTurbo(this, 833, 209, textureX, textureY); // Box 464

		leftWingModel[0].addShapeBox(0F, 0F, 0F, 16, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 224
		leftWingModel[0].setRotationPoint(-83F, -39F, -59F);

		leftWingModel[1].addShapeBox(0F, 0F, 0F, 16, 6, 24, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 225
		leftWingModel[1].setRotationPoint(-83F, -45F, -59F);

		leftWingModel[2].addShapeBox(0F, 0F, 0F, 16, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 226
		leftWingModel[2].setRotationPoint(-83F, -26F, -59F);

		leftWingModel[3].addShapeBox(0F, 0F, 0F, 7, 13, 8, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 227
		leftWingModel[3].setRotationPoint(-90F, -39F, -59F);

		leftWingModel[4].addShapeBox(0F, 0F, 0F, 7, 6, 24, 0F,0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 228
		leftWingModel[4].setRotationPoint(-90F, -45F, -59F);

		leftWingModel[5].addShapeBox(0F, 0F, 0F, 7, 6, 24, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F); // Box 229
		leftWingModel[5].setRotationPoint(-90F, -26F, -59F);

		leftWingModel[6].addShapeBox(0F, 0F, 0F, 7, 13, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 230
		leftWingModel[6].setRotationPoint(-90F, -39F, -43F);

		leftWingModel[7].addShapeBox(0F, 0F, 0F, 11, 13, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 231
		leftWingModel[7].setRotationPoint(-67F, -39F, -58F);

		leftWingModel[8].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 232
		leftWingModel[8].setRotationPoint(-67F, -44F, -58F);

		leftWingModel[9].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 233
		leftWingModel[9].setRotationPoint(-67F, -26F, -58F);

		leftWingModel[10].addShapeBox(0F, 0F, 0F, 16, 13, 22, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 235
		leftWingModel[10].setRotationPoint(-56F, -39F, -58F);

		leftWingModel[11].addShapeBox(0F, 0F, 0F, 16, 5, 22, 0F,0F, 0F, -8F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 236
		leftWingModel[11].setRotationPoint(-56F, -44F, -58F);

		leftWingModel[12].addShapeBox(0F, 0F, 0F, 16, 5, 22, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1.5F, -9F, 0F, -1.5F, -9F, 0F, 0F, -8F); // Box 237
		leftWingModel[12].setRotationPoint(-56F, -26F, -58F);

		leftWingModel[13].addShapeBox(0F, 0F, 0F, 23, 5, 14, 0F,0F, 0F, -5F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 238
		leftWingModel[13].setRotationPoint(-40F, -42F, -54F);

		leftWingModel[14].addShapeBox(0F, 0F, 0F, 26, 5, 14, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0.5F, -5F, -6F, -2F, -6F, -6F, -2F, -6F, 0F, 0.5F, -5F); // Box 239
		leftWingModel[14].setRotationPoint(-40F, -28F, -54F);

		leftWingModel[15].addShapeBox(0F, 0F, 0F, 26, 8, 14, 0F,0F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, 0F); // Box 240
		leftWingModel[15].setRotationPoint(-40F, -37F, -54F);

		leftWingModel[16].addShapeBox(0F, 0F, 0F, 16, 13, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 135
		leftWingModel[16].setRotationPoint(-83F, -39F, 35F);

		leftWingModel[17].addShapeBox(0F, 0F, 0F, 16, 6, 24, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 136
		leftWingModel[17].setRotationPoint(-83F, -45F, 35F);

		leftWingModel[18].addShapeBox(0F, 0F, 0F, 16, 6, 24, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 137
		leftWingModel[18].setRotationPoint(-83F, -26F, 35F);

		leftWingModel[19].addShapeBox(0F, 0F, 0F, 7, 13, 8, 0F,0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F); // Box 138
		leftWingModel[19].setRotationPoint(-90F, -39F, 51F);

		leftWingModel[20].addShapeBox(0F, 0F, 0F, 7, 6, 24, 0F,0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F); // Box 139
		leftWingModel[20].setRotationPoint(-90F, -45F, 35F);

		leftWingModel[21].addShapeBox(0F, 0F, 0F, 7, 6, 24, 0F,0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, -4F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, -4F, -8F); // Box 140
		leftWingModel[21].setRotationPoint(-90F, -26F, 35F);

		leftWingModel[22].addShapeBox(0F, 0F, 0F, 7, 13, 8, 0F,0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F); // Box 141
		leftWingModel[22].setRotationPoint(-90F, -39F, 35F);

		leftWingModel[23].addShapeBox(0F, 0F, 0F, 11, 13, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 142
		leftWingModel[23].setRotationPoint(-67F, -39F, 36F);

		leftWingModel[24].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 143
		leftWingModel[24].setRotationPoint(-67F, -44F, 36F);

		leftWingModel[25].addShapeBox(0F, 0F, 0F, 11, 5, 22, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F, 0F, 0F, -8F); // Box 144
		leftWingModel[25].setRotationPoint(-67F, -26F, 36F);

		leftWingModel[26].addShapeBox(0F, 0F, 0F, 16, 13, 22, 0F,0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -4F, 0F, -2F, -4F, 0F, 0F, 0F); // Box 145
		leftWingModel[26].setRotationPoint(-56F, -39F, 36F);

		leftWingModel[27].addShapeBox(0F, 0F, 0F, 16, 5, 22, 0F,0F, 0F, -8F, 0F, -2F, -9F, 0F, -2F, -9F, 0F, 0F, -8F, 0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F); // Box 146
		leftWingModel[27].setRotationPoint(-56F, -44F, 36F);

		leftWingModel[28].addShapeBox(0F, 0F, 0F, 16, 5, 22, 0F,0F, 0F, 0F, 0F, 2F, -4F, 0F, 2F, -4F, 0F, 0F, 0F, 0F, 0F, -8F, 0F, -1.5F, -9F, 0F, -1.5F, -9F, 0F, 0F, -8F); // Box 147
		leftWingModel[28].setRotationPoint(-56F, -26F, 36F);

		leftWingModel[29].addShapeBox(0F, 0F, 0F, 23, 5, 14, 0F,0F, 0F, -5F, 0F, -4F, -6F, 0F, -4F, -6F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F); // Box 148
		leftWingModel[29].setRotationPoint(-40F, -42F, 40F);

		leftWingModel[30].addShapeBox(0F, 0F, 0F, 26, 5, 14, 0F,0F, 0F, 0F, 0F, 1F, -5F, 0F, 1F, -5F, 0F, 0F, 0F, 0F, 0.5F, -5F, -6F, -2F, -6F, -6F, -2F, -6F, 0F, 0.5F, -5F); // Box 149
		leftWingModel[30].setRotationPoint(-40F, -28F, 40F);

		leftWingModel[31].addShapeBox(0F, 0F, 0F, 26, 8, 14, 0F,0F, 0F, 0F, -3F, 0F, -5F, -3F, 0F, -5F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 1F, 0F); // Box 150
		leftWingModel[31].setRotationPoint(-40F, -37F, 40F);

		leftWingModel[32].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 241
		leftWingModel[32].setRotationPoint(-98F, -35F, -49F);

		leftWingModel[33].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 242
		leftWingModel[33].setRotationPoint(-101F, -35F, -49F);

		leftWingModel[34].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F); // Box 243
		leftWingModel[34].setRotationPoint(-103.5F, -35F, -49F);

		leftWingModel[35].addShapeBox(0F, 0F, 0F, 16, 4, 4, 0F,0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F, 0F, -1F, -1F); // Box 462
		leftWingModel[35].setRotationPoint(-98F, -35F, 45F);

		leftWingModel[36].addShapeBox(0F, 0F, 0F, 4, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 463
		leftWingModel[36].setRotationPoint(-101F, -35F, 45F);

		leftWingModel[37].addShapeBox(0F, 0F, 0F, 2, 4, 4, 0F,0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F, 0F, -1.9F, -1.9F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, -1.9F, -1.9F); // Box 464
		leftWingModel[37].setRotationPoint(-103.5F, -35F, 45F);
	}

	private void initrightWingModel_1()
	{
		rightWingModel[0] = new ModelRendererTurbo(this, 617, 81, textureX, textureY); // Box 283
		rightWingModel[1] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 284
		rightWingModel[2] = new ModelRendererTurbo(this, 105, 89, textureX, textureY); // Box 285
		rightWingModel[3] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 286
		rightWingModel[4] = new ModelRendererTurbo(this, 441, 73, textureX, textureY); // Box 287
		rightWingModel[5] = new ModelRendererTurbo(this, 513, 73, textureX, textureY); // Box 288
		rightWingModel[6] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 289
		rightWingModel[7] = new ModelRendererTurbo(this, 865, 81, textureX, textureY); // Box 290
		rightWingModel[8] = new ModelRendererTurbo(this, 801, 129, textureX, textureY); // Box 90
		rightWingModel[9] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 91
		rightWingModel[10] = new ModelRendererTurbo(this, 521, 145, textureX, textureY); // Box 92
		rightWingModel[11] = new ModelRendererTurbo(this, 1, 217, textureX, textureY); // Box 93
		rightWingModel[12] = new ModelRendererTurbo(this, 937, 81, textureX, textureY); // Box 94
		rightWingModel[13] = new ModelRendererTurbo(this, 929, 89, textureX, textureY); // Box 95
		rightWingModel[14] = new ModelRendererTurbo(this, 313, 97, textureX, textureY); // Box 96
		rightWingModel[15] = new ModelRendererTurbo(this, 521, 97, textureX, textureY); // Box 97

		rightWingModel[0].addShapeBox(0F, 0F, 0F, 68, 6, 38, 0F,-2.9F, 0F, 0.5F, -8F, 0F, 1F, -13F, -1F, 1F, -3F, -1F, 0F, 1F, -0.5F, 1F, 2F, -0.5F, 1F, -3F, 0.5F, 1F, 0.5F, 0.5F, 0F); // Box 283
		rightWingModel[0].setRotationPoint(-68F, -40F, 20.5F);

		rightWingModel[1].addShapeBox(0F, 0F, 0F, 68, 5, 37, 0F,1F, 1.5F, 1F, 2F, 1.5F, 1F, -3F, 0.5F, 1F, 0.5F, 0.5F, 0F, -3F, -2F, 1.5F, -8F, -2F, 1F, -13F, -1F, 1F, -3F, -1F, 0F); // Box 284
		rightWingModel[1].setRotationPoint(-68F, -33F, 21.5F);

		rightWingModel[2].addShapeBox(0F, 0F, 0F, 43, 6, 114, 0F,10F, -1F, 1F, -1F, -1F, 0F, -13F, 3F, 0F, -3F, 4F, 0F, 13.5F, 0.5F, 1F, 9F, 0.5F, 0F, -6F, -7.5F, 0F, 0.5F, -8.5F, 0F); // Box 285
		rightWingModel[2].setRotationPoint(-55F, -40F, 59.5F);

		rightWingModel[3].addShapeBox(0F, 0F, 0F, 43, 6, 114, 0F,13.5F, 0.5F, 1F, 9F, 0.5F, 0F, -6F, 8.5F, 0F, 0.5F, 9.5F, 0F, 10F, -2F, 1F, -1F, -2F, 0F, -13F, -13F, 0F, -3F, -13.5F, 0F); // Box 286
		rightWingModel[3].setRotationPoint(-55F, -33F, 59.5F);

		rightWingModel[4].addShapeBox(0F, 0F, 0F, 27, 2, 5, 0F,0F, 0F, 0F, 0F, -1F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, 3.5F, -0.5F, 0F, 7F, 0.5F, 0F, 5F, 0F, 0F, 1.5F, -1F, 0F); // Box 287
		rightWingModel[4].setRotationPoint(-52F, -44F, 173.5F);

		rightWingModel[5].addShapeBox(0F, 0F, 0F, 27, 2, 5, 0F,3.5F, 1.5F, 0F, 7F, 0.5F, 0F, 5F, 1F, 0F, 1.5F, 2F, 0F, 0F, -1.5F, 0F, 0F, -1F, 0F, -2F, -2F, 0F, -2F, -2.5F, 0F); // Box 288
		rightWingModel[5].setRotationPoint(-52F, -41F, 173.5F);

		rightWingModel[6].addShapeBox(0F, 0F, 0F, 27, 2, 7, 0F,-2F, 0.5F, 0F, -2F, -0.5F, 0F, -5F, -0.2F, 0F, -8F, 0.2F, 0F, 1.5F, -1F, 0F, 5F, 0F, 0F, -4F, -0.5F, 1F, -7F, -1F, 1F); // Box 289
		rightWingModel[6].setRotationPoint(-52F, -44F, 178.5F);

		rightWingModel[7].addShapeBox(0F, 0F, 0F, 27, 2, 7, 0F,1.5F, 1F, 0F, 5F, 0F, 0F, -4F, 0.5F, 1F, -7F, 1F, 1F, -2F, -1.5F, 0F, -2F, -1F, 0F, -5F, -1.2F, 0F, -8F, -1.8F, 0F); // Box 290
		rightWingModel[7].setRotationPoint(-52F, -42F, 178.5F);

		rightWingModel[8].addShapeBox(0F, 0F, 0F, 68, 6, 38, 0F,-3F, -1F, 0F, -13F, -1F, 1F, -8F, 0F, 1F, -2.9F, 0F, 0.5F, 0.5F, 0.5F, 0F, -3F, 0.5F, 1F, 2F, -0.5F, 1F, 1F, -0.5F, 1F); // Box 90
		rightWingModel[8].setRotationPoint(-68F, -40F, -58.5F);

		rightWingModel[9].addShapeBox(0F, 0F, 0F, 68, 5, 37, 0F,0.5F, 0.5F, 0F, -3F, 0.5F, 1F, 2F, 1.5F, 1F, 1F, 1.5F, 1F, -3F, -1F, 0F, -13F, -1F, 1F, -8F, -2F, 1F, -3F, -2F, 1.5F); // Box 91
		rightWingModel[9].setRotationPoint(-68F, -33F, -58.5F);

		rightWingModel[10].addShapeBox(0F, 0F, 0F, 43, 6, 114, 0F,-3F, 4F, 0F, -13F, 3F, 0F, -1F, -1F, 0F, 10F, -1F, 1F, 0.5F, -8.5F, 0F, -6F, -7.5F, 0F, 9F, 0.5F, 0F, 13.5F, 0.5F, 1F); // Box 92
		rightWingModel[10].setRotationPoint(-55F, -40F, -173.5F);

		rightWingModel[11].addShapeBox(0F, 0F, 0F, 43, 6, 114, 0F,0.5F, 9.5F, 0F, -6F, 8.5F, 0F, 9F, 0.5F, 0F, 13.5F, 0.5F, 1F, -3F, -13.5F, 0F, -13F, -13F, 0F, -1F, -2F, 0F, 10F, -2F, 1F); // Box 93
		rightWingModel[11].setRotationPoint(-55F, -33F, -173.5F);

		rightWingModel[12].addShapeBox(0F, 0F, 0F, 27, 2, 5, 0F,-2F, 0.5F, 0F, -2F, -0.5F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.5F, -1F, 0F, 5F, 0F, 0F, 7F, 0.5F, 0F, 3.5F, -0.5F, 0F); // Box 94
		rightWingModel[12].setRotationPoint(-52F, -44F, -178.5F);

		rightWingModel[13].addShapeBox(0F, 0F, 0F, 27, 2, 5, 0F,1.5F, 2F, 0F, 5F, 1F, 0F, 7F, 0.5F, 0F, 3.5F, 1.5F, 0F, -2F, -2.5F, 0F, -2F, -2F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0F); // Box 95
		rightWingModel[13].setRotationPoint(-52F, -41F, -178.5F);

		rightWingModel[14].addShapeBox(0F, 0F, 0F, 27, 2, 7, 0F,-8F, 0.2F, 0F, -5F, -0.2F, 0F, -2F, -0.5F, 0F, -2F, 0.5F, 0F, -7F, -1F, 1F, -4F, -0.5F, 1F, 5F, 0F, 0F, 1.5F, -1F, 0F); // Box 96
		rightWingModel[14].setRotationPoint(-52F, -44F, -185.5F);

		rightWingModel[15].addShapeBox(0F, 0F, 0F, 27, 2, 7, 0F,-7F, 1F, 1F, -4F, 0.5F, 1F, 5F, 0F, 0F, 1.5F, 1F, 0F, -8F, -1.8F, 0F, -5F, -1.2F, 0F, -2F, -1F, 0F, -2F, -1.5F, 0F); // Box 97
		rightWingModel[15].setRotationPoint(-52F, -42F, -185.5F);
	}

	private void inityawFlapModel_1()
	{
		yawFlapModel[0] = new ModelRendererTurbo(this, 929, 1, textureX, textureY); // Box 13
		yawFlapModel[1] = new ModelRendererTurbo(this, 953, 1, textureX, textureY); // Box 14
		yawFlapModel[2] = new ModelRendererTurbo(this, 977, 1, textureX, textureY); // Box 15
		yawFlapModel[3] = new ModelRendererTurbo(this, 1001, 1, textureX, textureY); // Box 16
		yawFlapModel[4] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 17
		yawFlapModel[5] = new ModelRendererTurbo(this, 25, 17, textureX, textureY); // Box 18
		yawFlapModel[6] = new ModelRendererTurbo(this, 41, 17, textureX, textureY); // Box 19
		yawFlapModel[7] = new ModelRendererTurbo(this, 65, 17, textureX, textureY); // Box 20
		yawFlapModel[8] = new ModelRendererTurbo(this, 225, 49, textureX, textureY); // Box 50
		yawFlapModel[9] = new ModelRendererTurbo(this, 249, 49, textureX, textureY); // Box 51
		yawFlapModel[10] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 52
		yawFlapModel[11] = new ModelRendererTurbo(this, 297, 49, textureX, textureY); // Box 53
		yawFlapModel[12] = new ModelRendererTurbo(this, 321, 49, textureX, textureY); // Box 54
		yawFlapModel[13] = new ModelRendererTurbo(this, 1009, 33, textureX, textureY); // Box 55
		yawFlapModel[14] = new ModelRendererTurbo(this, 345, 49, textureX, textureY); // Box 56
		yawFlapModel[15] = new ModelRendererTurbo(this, 729, 217, textureX, textureY); // Box 467

		yawFlapModel[0].addShapeBox(0F, -14F, 0F, 9, 26, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.1F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 13
		yawFlapModel[0].setRotationPoint(96F, -57F, 0F);
		yawFlapModel[0].rotateAngleZ = -0.01745329F;

		yawFlapModel[1].addShapeBox(9F, -14F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, -1.5F, 0F, 0F, -5.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, -0.7F, 0F, 0F, -0.2F); // Box 14
		yawFlapModel[1].setRotationPoint(96F, -57F, 0F);
		yawFlapModel[1].rotateAngleZ = -0.01745329F;

		yawFlapModel[2].addShapeBox(9F, -1F, 0F, 9, 13, 1, 0F,0F, 0F, 0F, 2F, 0F, 0F, -3F, 0F, -0.7F, 0F, 0F, -0.2F, 0F, 0F, 0F, 3.5F, 0F, 0F, -2F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 15
		yawFlapModel[2].setRotationPoint(96F, -57F, 0F);
		yawFlapModel[2].rotateAngleZ = -0.01745329F;

		yawFlapModel[3].addShapeBox(9F, 12F, 0F, 9, 10, 1, 0F,0F, 0F, 0F, 3.5F, 0F, 0F, -2F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, 0F, -0.5F, -2F, 0F, -4F, -4F, -0.7F, 0F, -1.5F, -0.2F); // Box 16
		yawFlapModel[3].setRotationPoint(96F, -57F, 0F);
		yawFlapModel[3].rotateAngleZ = -0.01745329F;

		yawFlapModel[4].addShapeBox(-1F, 12F, 0F, 10, 10, 1, 0F,0F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.1F, 0F, 3.5F, 0F, 0F, 1F, 0F, 0F, -1.5F, -0.2F, 0F, 1.5F, -0.2F); // Box 17
		yawFlapModel[4].setRotationPoint(96F, -57F, 0F);
		yawFlapModel[4].rotateAngleZ = -0.01745329F;

		yawFlapModel[5].addShapeBox(9F, -23F, 0F, 5, 9, 1, 0F,0F, 0.5F, 0F, -0.5F, -3F, 0F, -5F, -4.5F, -0.2F, 0F, -4.5F, -0.2F, 0F, 0F, 0F, 2.5F, 0F, 0F, -1.5F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 18
		yawFlapModel[5].setRotationPoint(96F, -57F, 0F);
		yawFlapModel[5].rotateAngleZ = -0.01745329F;

		yawFlapModel[6].addShapeBox(0F, -23F, 0F, 9, 9, 1, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, -4.5F, -0.2F, 0F, -4F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.3F); // Box 19
		yawFlapModel[6].setRotationPoint(96F, -57F, 0F);
		yawFlapModel[6].rotateAngleZ = -0.01745329F;

		yawFlapModel[7].addShapeBox(-9F, -23F, 0F, 9, 9, 1, 0F,-3F, -0.5F, 0F, 0F, 0.5F, 0F, 0F, -4F, -0.5F, 0.3F, -3.3F, -0.200000000000001F, 1.3F, -4.8F, 0F, 0F, 0F, 0F, 0F, 0F, -0.300000000000001F, 0.3F, -4.8F, -0.2F); // Box 20
		yawFlapModel[7].setRotationPoint(96F, -57F, 0F);
		yawFlapModel[7].rotateAngleZ = -0.01745329F;

		yawFlapModel[8].addShapeBox(0F, -14F, 0F, 9, 26, 1, 0F,0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 50
		yawFlapModel[8].setRotationPoint(96F, -57F, -1F);
		yawFlapModel[8].rotateAngleZ = -0.01745329F;

		yawFlapModel[9].addShapeBox(9F, -14F, 0F, 9, 13, 1, 0F,0F, 0F, -0.2F, -5.5F, 0F, -0.2F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -3F, 0F, -0.7F, 2F, 0F, 0F, 0F, 0F, 0F); // Box 51
		yawFlapModel[9].setRotationPoint(96F, -57F, -1F);
		yawFlapModel[9].rotateAngleZ = -0.01745329F;

		yawFlapModel[10].addShapeBox(9F, -1F, 0F, 9, 13, 1, 0F,0F, 0F, -0.2F, -3F, 0F, -0.7F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, -2F, 0F, -0.2F, 3.5F, 0F, 0F, 0F, 0F, 0F); // Box 52
		yawFlapModel[10].setRotationPoint(96F, -57F, -1F);
		yawFlapModel[10].rotateAngleZ = -0.01745329F;

		yawFlapModel[11].addShapeBox(9F, 12F, 0F, 9, 10, 1, 0F,0F, 0F, -0.2F, -2F, 0F, -0.2F, 3.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, -0.2F, -4F, -4F, -0.7F, -0.5F, -2F, 0F, 0F, 1F, 0F); // Box 53
		yawFlapModel[11].setRotationPoint(96F, -57F, -1F);
		yawFlapModel[11].rotateAngleZ = -0.01745329F;

		yawFlapModel[12].addShapeBox(-1F, 12F, 0F, 10, 10, 1, 0F,0F, 0F, -0.1F, 0F, 0F, -0.2F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, -0.2F, 0F, -1.5F, -0.2F, 0F, 1F, 0F, 0F, 3.5F, 0F); // Box 54
		yawFlapModel[12].setRotationPoint(96F, -57F, -1F);
		yawFlapModel[12].rotateAngleZ = -0.01745329F;

		yawFlapModel[13].addShapeBox(9F, -23F, 0F, 5, 9, 1, 0F,0F, -4.5F, -0.2F, -5F, -4.5F, -0.2F, -0.5F, -3F, 0F, 0F, 0.5F, 0F, 0F, 0F, -0.2F, -1.5F, 0F, -0.2F, 2.5F, 0F, 0F, 0F, 0F, 0F); // Box 55
		yawFlapModel[13].setRotationPoint(96F, -57F, -1F);
		yawFlapModel[13].rotateAngleZ = -0.01745329F;

		yawFlapModel[14].addShapeBox(0F, -23F, 0F, 9, 9, 1, 0F,0F, -4F, -0.5F, 0F, -4.5F, -0.2F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 56
		yawFlapModel[14].setRotationPoint(96F, -57F, -1F);
		yawFlapModel[14].rotateAngleZ = -0.01745329F;

		yawFlapModel[15].addShapeBox(-9F, -23F, 0F, 9, 9, 1, 0F,0.3F, -3.3F, -0.200000000000001F, 0F, -4F, -0.5F, 0F, 0.5F, 0F, -3F, -0.5F, 0F, 0.3F, -4.8F, -0.2F, 0F, 0F, -0.300000000000001F, 0F, 0F, 0F, 1.3F, -4.8F, 0F); // Box 467
		yawFlapModel[15].setRotationPoint(96F, -57F, -1F);
		yawFlapModel[15].rotateAngleZ = -0.01745329F;
	}

	private void inittailWheelModel_1()
	{
		tailWheelModel[0] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 256
		tailWheelModel[1] = new ModelRendererTurbo(this, 689, 33, textureX, textureY); // Box 257
		tailWheelModel[2] = new ModelRendererTurbo(this, 721, 33, textureX, textureY); // Box 258
		tailWheelModel[3] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 259
		tailWheelModel[4] = new ModelRendererTurbo(this, 1009, 49, textureX, textureY); // Box 260

		tailWheelModel[0].addShapeBox(0F, 0F, 0F, 10, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 256
		tailWheelModel[0].setRotationPoint(83F, -27.5F, -2F);

		tailWheelModel[1].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,-3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 257
		tailWheelModel[1].setRotationPoint(83F, -30.5F, -2F);

		tailWheelModel[2].addShapeBox(0F, 0F, 0F, 10, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F); // Box 258
		tailWheelModel[2].setRotationPoint(83F, -23.5F, -2F);

		tailWheelModel[3].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 259
		tailWheelModel[3].setRotationPoint(80F, -34.5F, -3F);
		tailWheelModel[3].rotateAngleZ = 0.57595865F;

		tailWheelModel[4].addShapeBox(0F, 0F, 0F, 4, 13, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 260
		tailWheelModel[4].setRotationPoint(80F, -34.5F, 2F);
		tailWheelModel[4].rotateAngleZ = 0.57595865F;
	}

	private void initleftWingWheelModel_1()
	{
		leftWingWheelModel[0] = new ModelRendererTurbo(this, 953, 97, textureX, textureY); // Box 246
		leftWingWheelModel[1] = new ModelRendererTurbo(this, 377, 105, textureX, textureY); // Box 247
		leftWingWheelModel[2] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 248
		leftWingWheelModel[3] = new ModelRendererTurbo(this, 209, 73, textureX, textureY); // Box 249
		leftWingWheelModel[4] = new ModelRendererTurbo(this, 1009, 81, textureX, textureY); // Box 250
		leftWingWheelModel[5] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 160
		leftWingWheelModel[6] = new ModelRendererTurbo(this, 585, 145, textureX, textureY); // Box 161
		leftWingWheelModel[7] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 162
		leftWingWheelModel[8] = new ModelRendererTurbo(this, 209, 97, textureX, textureY); // Box 163
		leftWingWheelModel[9] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 164

		leftWingWheelModel[0].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 246
		leftWingWheelModel[0].setRotationPoint(-67F, -2F, -50F);

		leftWingWheelModel[1].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 247
		leftWingWheelModel[1].setRotationPoint(-67F, -7F, -50F);

		leftWingWheelModel[2].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 248
		leftWingWheelModel[2].setRotationPoint(-67F, -12F, -50F);

		leftWingWheelModel[3].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 249
		leftWingWheelModel[3].setRotationPoint(-61F, -23F, -51F);

		leftWingWheelModel[4].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 250
		leftWingWheelModel[4].setRotationPoint(-61F, -23F, -44F);

		leftWingWheelModel[5].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F); // Box 160
		leftWingWheelModel[5].setRotationPoint(-67F, -2F, 44F);

		leftWingWheelModel[6].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 161
		leftWingWheelModel[6].setRotationPoint(-67F, -7F, 44F);

		leftWingWheelModel[7].addShapeBox(0F, 0F, 0F, 15, 5, 6, 0F,-5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 162
		leftWingWheelModel[7].setRotationPoint(-67F, -12F, 44F);

		leftWingWheelModel[8].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 163
		leftWingWheelModel[8].setRotationPoint(-61F, -23F, 50F);

		leftWingWheelModel[9].addShapeBox(0F, 0F, 0F, 3, 20, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 164
		leftWingWheelModel[9].setRotationPoint(-61F, -23F, 43F);
	}

	private void initPropeller()
	{
		propellerModels = new ModelRendererTurbo[2][3];
		propellerModels[0] = makeProp1(-91F, -33F, -47F);
		propellerModels[1] = makeProp2(-91F, -33F, 47F);
	}

	private ModelRendererTurbo[] makeProp1(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-0.5F, -25F, -1.5F, 1, 25, 3, 0.0F);
		prop[1].addBox(-0.5F, -25F, -1.5F, 1, 25, 3, 0.0F);
		prop[2].addBox(-0.5F, -25F, -1.5F, 1, 25, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}

	private ModelRendererTurbo[] makeProp2(float i, float j, float k)
	{
		ModelRendererTurbo[] prop = new ModelRendererTurbo[3];
		prop[0] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[1] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[2] = new ModelRendererTurbo(this, 0, 0, textureX, textureY);
		prop[0].addBox(-0.5F, -25F, -1.5F, 1, 25, 3, 0.0F);
		prop[1].addBox(-0.5F, -25F, -1.5F, 1, 25, 3, 0.0F);
		prop[2].addBox(-0.5F, -25F, -1.5F, 1, 25, 3, 0.0F);
		prop[0].setRotationPoint(i, j, k);
		prop[1].setRotationPoint(i, j, k);
		prop[2].setRotationPoint(i, j, k);
		return prop;
	}
}