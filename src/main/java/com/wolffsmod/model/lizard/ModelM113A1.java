//This File was created with the Minecraft-SMP Modelling Toolbox 2.3.0.0
// Copyright (C) 2023 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: 
// Model Creator: 
// Created on: 05.10.2016 - 12:09:13
// Last changed on: 05.10.2016 - 12:09:13

package com.wolffsmod.model.lizard; //Path where the model is located

import com.flansmod.client.tmt.ModelRendererTurbo;
import com.wolffsmod.model.ModelFlanVehicle;

public class ModelM113A1 extends ModelFlanVehicle //Same as Filename
{
	int textureX = 1024;
	int textureY = 1024;

	public ModelM113A1() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[220];
		bodyDoorOpenModel = new ModelRendererTurbo[1];
		bodyDoorCloseModel = new ModelRendererTurbo[19];
		turretModel = new ModelRendererTurbo[16];
		barrelModel = new ModelRendererTurbo[67];
		leftTrackWheelModels = new ModelRendererTurbo[6];
		rightTrackWheelModels = new ModelRendererTurbo[266];
		leftTrackModel = new ModelRendererTurbo[13];
		rightTrackModel = new ModelRendererTurbo[13];

		initbodyModel_1();
		initbodyDoorOpenModel_1();
		initbodyDoorCloseModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, 0F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 1
		bodyModel[1] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 3
		bodyModel[2] = new ModelRendererTurbo(this, 281, 1, textureX, textureY); // Box 4
		bodyModel[3] = new ModelRendererTurbo(this, 353, 1, textureX, textureY); // Box 5
		bodyModel[4] = new ModelRendererTurbo(this, 441, 1, textureX, textureY); // Box 7
		bodyModel[5] = new ModelRendererTurbo(this, 569, 1, textureX, textureY); // Box 8
		bodyModel[6] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 11
		bodyModel[7] = new ModelRendererTurbo(this, 569, 17, textureX, textureY); // Box 9
		bodyModel[8] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 10
		bodyModel[9] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Box 14
		bodyModel[10] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 15
		bodyModel[11] = new ModelRendererTurbo(this, 585, 33, textureX, textureY); // Box 17
		bodyModel[12] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 20
		bodyModel[13] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Box 21
		bodyModel[14] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 22
		bodyModel[15] = new ModelRendererTurbo(this, 297, 1, textureX, textureY); // Body
		bodyModel[16] = new ModelRendererTurbo(this, 297, 9, textureX, textureY); // Body
		bodyModel[17] = new ModelRendererTurbo(this, 297, 17, textureX, textureY); // Body
		bodyModel[18] = new ModelRendererTurbo(this, 201, 1, textureX, textureY); // Body
		bodyModel[19] = new ModelRendererTurbo(this, 257, 1, textureX, textureY); // Body
		bodyModel[20] = new ModelRendererTurbo(this, 905, 1, textureX, textureY); // Body
		bodyModel[21] = new ModelRendererTurbo(this, 913, 1, textureX, textureY); // Body
		bodyModel[22] = new ModelRendererTurbo(this, 993, 17, textureX, textureY); // Box 34
		bodyModel[23] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 35
		bodyModel[24] = new ModelRendererTurbo(this, 201, 25, textureX, textureY); // Box 36
		bodyModel[25] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 37
		bodyModel[26] = new ModelRendererTurbo(this, 233, 25, textureX, textureY); // Box 39
		bodyModel[27] = new ModelRendererTurbo(this, 641, 33, textureX, textureY); // Box 44
		bodyModel[28] = new ModelRendererTurbo(this, 449, 25, textureX, textureY); // Box 55
		bodyModel[29] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 167
		bodyModel[30] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 168
		bodyModel[31] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 169
		bodyModel[32] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 170
		bodyModel[33] = new ModelRendererTurbo(this, 377, 33, textureX, textureY); // Box 171
		bodyModel[34] = new ModelRendererTurbo(this, 401, 33, textureX, textureY); // Box 179
		bodyModel[35] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 65
		bodyModel[36] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 67
		bodyModel[37] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 70
		bodyModel[38] = new ModelRendererTurbo(this, 745, 33, textureX, textureY); // Box 88
		bodyModel[39] = new ModelRendererTurbo(this, 201, 9, textureX, textureY); // Box 89
		bodyModel[40] = new ModelRendererTurbo(this, 257, 9, textureX, textureY); // Box 90
		bodyModel[41] = new ModelRendererTurbo(this, 969, 1, textureX, textureY); // Box 99
		bodyModel[42] = new ModelRendererTurbo(this, 313, 25, textureX, textureY); // Box 100
		bodyModel[43] = new ModelRendererTurbo(this, 369, 33, textureX, textureY); // Box 101
		bodyModel[44] = new ModelRendererTurbo(this, 433, 33, textureX, textureY); // Box 102
		bodyModel[45] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Body
		bodyModel[46] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Body
		bodyModel[47] = new ModelRendererTurbo(this, 801, 33, textureX, textureY); // Box 109
		bodyModel[48] = new ModelRendererTurbo(this, 833, 33, textureX, textureY); // Box 110
		bodyModel[49] = new ModelRendererTurbo(this, 593, 33, textureX, textureY); // Box 117
		bodyModel[50] = new ModelRendererTurbo(this, 793, 33, textureX, textureY); // Box 118
		bodyModel[51] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 119
		bodyModel[52] = new ModelRendererTurbo(this, 865, 33, textureX, textureY); // Box 120
		bodyModel[53] = new ModelRendererTurbo(this, 737, 1, textureX, textureY); // Box 121
		bodyModel[54] = new ModelRendererTurbo(this, 1017, 1, textureX, textureY); // Box 122
		bodyModel[55] = new ModelRendererTurbo(this, 881, 33, textureX, textureY); // Box 123
		bodyModel[56] = new ModelRendererTurbo(this, 889, 33, textureX, textureY); // Box 124
		bodyModel[57] = new ModelRendererTurbo(this, 233, 41, textureX, textureY); // Box 125
		bodyModel[58] = new ModelRendererTurbo(this, 953, 17, textureX, textureY); // Box 126
		bodyModel[59] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 127
		bodyModel[60] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 128
		bodyModel[61] = new ModelRendererTurbo(this, 897, 33, textureX, textureY); // Box 48
		bodyModel[62] = new ModelRendererTurbo(this, 265, 41, textureX, textureY); // Box 49
		bodyModel[63] = new ModelRendererTurbo(this, 281, 41, textureX, textureY); // Box 131
		bodyModel[64] = new ModelRendererTurbo(this, 297, 41, textureX, textureY); // Box 132
		bodyModel[65] = new ModelRendererTurbo(this, 313, 41, textureX, textureY); // Box 133
		bodyModel[66] = new ModelRendererTurbo(this, 897, 41, textureX, textureY); // Box 134
		bodyModel[67] = new ModelRendererTurbo(this, 993, 41, textureX, textureY); // Box 135
		bodyModel[68] = new ModelRendererTurbo(this, 441, 41, textureX, textureY); // Box 136
		bodyModel[69] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 138
		bodyModel[70] = new ModelRendererTurbo(this, 97, 57, textureX, textureY); // Box 139
		bodyModel[71] = new ModelRendererTurbo(this, 913, 9, textureX, textureY); // Box 159
		bodyModel[72] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 160
		bodyModel[73] = new ModelRendererTurbo(this, 265, 1, textureX, textureY); // Box 161
		bodyModel[74] = new ModelRendererTurbo(this, 921, 1, textureX, textureY); // Box 162
		bodyModel[75] = new ModelRendererTurbo(this, 969, 9, textureX, textureY); // Box 163
		bodyModel[76] = new ModelRendererTurbo(this, 737, 17, textureX, textureY); // Box 164
		bodyModel[77] = new ModelRendererTurbo(this, 905, 17, textureX, textureY); // Box 165
		bodyModel[78] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Box 166
		bodyModel[79] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 172
		bodyModel[80] = new ModelRendererTurbo(this, 481, 25, textureX, textureY); // Box 173
		bodyModel[81] = new ModelRendererTurbo(this, 993, 25, textureX, textureY); // Box 174
		bodyModel[82] = new ModelRendererTurbo(this, 969, 17, textureX, textureY); // Box 175
		bodyModel[83] = new ModelRendererTurbo(this, 977, 17, textureX, textureY); // Box 176
		bodyModel[84] = new ModelRendererTurbo(this, 921, 49, textureX, textureY); // Box 204
		bodyModel[85] = new ModelRendererTurbo(this, 249, 57, textureX, textureY); // Box 205
		bodyModel[86] = new ModelRendererTurbo(this, 441, 57, textureX, textureY); // Box 206
		bodyModel[87] = new ModelRendererTurbo(this, 473, 57, textureX, textureY); // Box 207
		bodyModel[88] = new ModelRendererTurbo(this, 505, 57, textureX, textureY); // Box 208
		bodyModel[89] = new ModelRendererTurbo(this, 537, 57, textureX, textureY); // Box 209
		bodyModel[90] = new ModelRendererTurbo(this, 529, 81, textureX, textureY); // Box 300
		bodyModel[91] = new ModelRendererTurbo(this, 569, 81, textureX, textureY); // Box 301
		bodyModel[92] = new ModelRendererTurbo(this, 593, 89, textureX, textureY); // Box 302
		bodyModel[93] = new ModelRendererTurbo(this, 761, 81, textureX, textureY); // Box 304
		bodyModel[94] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Box 284
		bodyModel[95] = new ModelRendererTurbo(this, 985, 81, textureX, textureY); // Box 285
		bodyModel[96] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 286
		bodyModel[97] = new ModelRendererTurbo(this, 41, 89, textureX, textureY); // Box 287
		bodyModel[98] = new ModelRendererTurbo(this, 81, 89, textureX, textureY); // Box 288
		bodyModel[99] = new ModelRendererTurbo(this, 593, 81, textureX, textureY); // Box 289
		bodyModel[100] = new ModelRendererTurbo(this, 209, 89, textureX, textureY); // Box 290
		bodyModel[101] = new ModelRendererTurbo(this, 785, 81, textureX, textureY); // Box 291
		bodyModel[102] = new ModelRendererTurbo(this, 881, 81, textureX, textureY); // Box 292
		bodyModel[103] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 293
		bodyModel[104] = new ModelRendererTurbo(this, 449, 89, textureX, textureY); // Box 294
		bodyModel[105] = new ModelRendererTurbo(this, 529, 89, textureX, textureY); // Box 295
		bodyModel[106] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 296
		bodyModel[107] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 297
		bodyModel[108] = new ModelRendererTurbo(this, 857, 89, textureX, textureY); // Box 298
		bodyModel[109] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 299
		bodyModel[110] = new ModelRendererTurbo(this, 633, 81, textureX, textureY); // Box 300
		bodyModel[111] = new ModelRendererTurbo(this, 937, 89, textureX, textureY); // Box 301
		bodyModel[112] = new ModelRendererTurbo(this, 121, 97, textureX, textureY); // Box 273
		bodyModel[113] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 274
		bodyModel[114] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 275
		bodyModel[115] = new ModelRendererTurbo(this, 729, 9, textureX, textureY); // Box 276
		bodyModel[116] = new ModelRendererTurbo(this, 729, 25, textureX, textureY); // Box 277
		bodyModel[117] = new ModelRendererTurbo(this, 273, 41, textureX, textureY); // Box 278
		bodyModel[118] = new ModelRendererTurbo(this, 809, 57, textureX, textureY); // Box 279
		bodyModel[119] = new ModelRendererTurbo(this, 17, 73, textureX, textureY); // Box 280
		bodyModel[120] = new ModelRendererTurbo(this, 385, 73, textureX, textureY); // Box 281
		bodyModel[121] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 282
		bodyModel[122] = new ModelRendererTurbo(this, 937, 97, textureX, textureY); // Box 283
		bodyModel[123] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 284
		bodyModel[124] = new ModelRendererTurbo(this, 57, 105, textureX, textureY); // Box 285
		bodyModel[125] = new ModelRendererTurbo(this, 769, 105, textureX, textureY); // Box 286
		bodyModel[126] = new ModelRendererTurbo(this, 489, 105, textureX, textureY); // Box 287
		bodyModel[127] = new ModelRendererTurbo(this, 809, 73, textureX, textureY); // Box 288
		bodyModel[128] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 289
		bodyModel[129] = new ModelRendererTurbo(this, 817, 65, textureX, textureY); // Box 290
		bodyModel[130] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 291
		bodyModel[131] = new ModelRendererTurbo(this, 441, 97, textureX, textureY); // Box 292
		bodyModel[132] = new ModelRendererTurbo(this, 993, 97, textureX, textureY); // Box 293
		bodyModel[133] = new ModelRendererTurbo(this, 1017, 65, textureX, textureY); // Box 294
		bodyModel[134] = new ModelRendererTurbo(this, 761, 73, textureX, textureY); // Box 295
		bodyModel[135] = new ModelRendererTurbo(this, 929, 73, textureX, textureY); // Box 296
		bodyModel[136] = new ModelRendererTurbo(this, 953, 73, textureX, textureY); // Box 297
		bodyModel[137] = new ModelRendererTurbo(this, 985, 73, textureX, textureY); // Box 298
		bodyModel[138] = new ModelRendererTurbo(this, 249, 81, textureX, textureY); // Box 299
		bodyModel[139] = new ModelRendererTurbo(this, 497, 81, textureX, textureY); // Box 300
		bodyModel[140] = new ModelRendererTurbo(this, 793, 81, textureX, textureY); // Box 301
		bodyModel[141] = new ModelRendererTurbo(this, 33, 89, textureX, textureY); // Box 302
		bodyModel[142] = new ModelRendererTurbo(this, 73, 89, textureX, textureY); // Box 303
		bodyModel[143] = new ModelRendererTurbo(this, 113, 89, textureX, textureY); // Box 304
		bodyModel[144] = new ModelRendererTurbo(this, 297, 89, textureX, textureY); // Box 305
		bodyModel[145] = new ModelRendererTurbo(this, 329, 89, textureX, textureY); // Box 306
		bodyModel[146] = new ModelRendererTurbo(this, 729, 89, textureX, textureY); // Box 307
		bodyModel[147] = new ModelRendererTurbo(this, 817, 89, textureX, textureY); // Box 308
		bodyModel[148] = new ModelRendererTurbo(this, 849, 89, textureX, textureY); // Box 309
		bodyModel[149] = new ModelRendererTurbo(this, 873, 89, textureX, textureY); // Box 310
		bodyModel[150] = new ModelRendererTurbo(this, 889, 89, textureX, textureY); // Box 311
		bodyModel[151] = new ModelRendererTurbo(this, 297, 97, textureX, textureY); // Box 312
		bodyModel[152] = new ModelRendererTurbo(this, 433, 97, textureX, textureY); // Box 313
		bodyModel[153] = new ModelRendererTurbo(this, 729, 97, textureX, textureY); // Box 314
		bodyModel[154] = new ModelRendererTurbo(this, 985, 97, textureX, textureY); // Box 315
		bodyModel[155] = new ModelRendererTurbo(this, 1009, 97, textureX, textureY); // Box 316
		bodyModel[156] = new ModelRendererTurbo(this, 49, 105, textureX, textureY); // Box 317
		bodyModel[157] = new ModelRendererTurbo(this, 105, 105, textureX, textureY); // Box 318
		bodyModel[158] = new ModelRendererTurbo(this, 433, 105, textureX, textureY); // Box 319
		bodyModel[159] = new ModelRendererTurbo(this, 577, 105, textureX, textureY); // Box 320
		bodyModel[160] = new ModelRendererTurbo(this, 881, 105, textureX, textureY); // Box 321
		bodyModel[161] = new ModelRendererTurbo(this, 897, 105, textureX, textureY); // Box 322
		bodyModel[162] = new ModelRendererTurbo(this, 921, 105, textureX, textureY); // Box 323
		bodyModel[163] = new ModelRendererTurbo(this, 937, 105, textureX, textureY); // Box 324
		bodyModel[164] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 325
		bodyModel[165] = new ModelRendererTurbo(this, 969, 105, textureX, textureY); // Box 326
		bodyModel[166] = new ModelRendererTurbo(this, 25, 73, textureX, textureY); // Box 327
		bodyModel[167] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 328
		bodyModel[168] = new ModelRendererTurbo(this, 521, 81, textureX, textureY); // Box 329
		bodyModel[169] = new ModelRendererTurbo(this, 817, 81, textureX, textureY); // Box 330
		bodyModel[170] = new ModelRendererTurbo(this, 249, 89, textureX, textureY); // Box 331
		bodyModel[171] = new ModelRendererTurbo(this, 81, 113, textureX, textureY); // Box 335
		bodyModel[172] = new ModelRendererTurbo(this, 105, 113, textureX, textureY); // Box 336
		bodyModel[173] = new ModelRendererTurbo(this, 569, 105, textureX, textureY); // Box 337
		bodyModel[174] = new ModelRendererTurbo(this, 129, 113, textureX, textureY); // Box 338
		bodyModel[175] = new ModelRendererTurbo(this, 865, 105, textureX, textureY); // Box 339
		bodyModel[176] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 340
		bodyModel[177] = new ModelRendererTurbo(this, 193, 113, textureX, textureY); // Box 353
		bodyModel[178] = new ModelRendererTurbo(this, 145, 97, textureX, textureY); // Box 354
		bodyModel[179] = new ModelRendererTurbo(this, 329, 97, textureX, textureY); // Box 355
		bodyModel[180] = new ModelRendererTurbo(this, 249, 97, textureX, textureY); // Box 356
		bodyModel[181] = new ModelRendererTurbo(this, 481, 97, textureX, textureY); // Box 357
		bodyModel[182] = new ModelRendererTurbo(this, 217, 113, textureX, textureY); // Box 358
		bodyModel[183] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 359
		bodyModel[184] = new ModelRendererTurbo(this, 321, 113, textureX, textureY); // Box 360
		bodyModel[185] = new ModelRendererTurbo(this, 769, 97, textureX, textureY); // Box 361
		bodyModel[186] = new ModelRendererTurbo(this, 209, 113, textureX, textureY); // Box 362
		bodyModel[187] = new ModelRendererTurbo(this, 561, 97, textureX, textureY); // Box 363
		bodyModel[188] = new ModelRendererTurbo(this, 1, 105, textureX, textureY); // Box 364
		bodyModel[189] = new ModelRendererTurbo(this, 249, 105, textureX, textureY); // Box 365
		bodyModel[190] = new ModelRendererTurbo(this, 1017, 105, textureX, textureY); // Box 366
		bodyModel[191] = new ModelRendererTurbo(this, 913, 105, textureX, textureY); // Box 367
		bodyModel[192] = new ModelRendererTurbo(this, 1, 113, textureX, textureY); // Box 368
		bodyModel[193] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 369
		bodyModel[194] = new ModelRendererTurbo(this, 233, 113, textureX, textureY); // Box 370
		bodyModel[195] = new ModelRendererTurbo(this, 97, 113, textureX, textureY); // Box 371
		bodyModel[196] = new ModelRendererTurbo(this, 249, 113, textureX, textureY); // Box 372
		bodyModel[197] = new ModelRendererTurbo(this, 297, 113, textureX, textureY); // Box 373
		bodyModel[198] = new ModelRendererTurbo(this, 313, 113, textureX, textureY); // Box 374
		bodyModel[199] = new ModelRendererTurbo(this, 345, 113, textureX, textureY); // Box 375
		bodyModel[200] = new ModelRendererTurbo(this, 353, 113, textureX, textureY); // Box 376
		bodyModel[201] = new ModelRendererTurbo(this, 377, 113, textureX, textureY); // Box 377
		bodyModel[202] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 378
		bodyModel[203] = new ModelRendererTurbo(this, 473, 113, textureX, textureY); // Box 379
		bodyModel[204] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 380
		bodyModel[205] = new ModelRendererTurbo(this, 657, 113, textureX, textureY); // Box 381
		bodyModel[206] = new ModelRendererTurbo(this, 921, 113, textureX, textureY); // Box 382
		bodyModel[207] = new ModelRendererTurbo(this, 577, 113, textureX, textureY); // Box 409
		bodyModel[208] = new ModelRendererTurbo(this, 681, 113, textureX, textureY); // Box 410
		bodyModel[209] = new ModelRendererTurbo(this, 737, 113, textureX, textureY); // Box 411
		bodyModel[210] = new ModelRendererTurbo(this, 745, 113, textureX, textureY); // Box 412
		bodyModel[211] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 697
		bodyModel[212] = new ModelRendererTurbo(this, 425, 169, textureX, textureY); // Box 698
		bodyModel[213] = new ModelRendererTurbo(this, 489, 169, textureX, textureY); // Box 699
		bodyModel[214] = new ModelRendererTurbo(this, 545, 169, textureX, textureY); // Box 700
		bodyModel[215] = new ModelRendererTurbo(this, 553, 169, textureX, textureY); // Box 701
		bodyModel[216] = new ModelRendererTurbo(this, 561, 169, textureX, textureY); // Box 702
		bodyModel[217] = new ModelRendererTurbo(this, 569, 169, textureX, textureY); // Box 703
		bodyModel[218] = new ModelRendererTurbo(this, 577, 169, textureX, textureY); // Box 704
		bodyModel[219] = new ModelRendererTurbo(this, 585, 169, textureX, textureY); // Box 705

		bodyModel[0].addShapeBox(0F, 0F, 0F, 83, 7, 33, 0F,0.7F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.7F, -0.2F, 0F, -0.6F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 1
		bodyModel[0].setRotationPoint(-38.4F, -7F, -16.7F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 4, 33, 0F,-4F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -4F, -0.2F, 0F, -2F, -0.2F, -0.5F, -2.5F, -0.2F, -0.5F, -2.5F, -0.2F, 0F, -2F, -0.2F, 0F); // Box 3
		bodyModel[1].setRotationPoint(39.1F, -10.6F, -16.7F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 8, 17, 49, 0F,12F, -0.2F, -0.5F, -17.5F, -0.2F, -0.5F, -17.5F, -0.2F, 0F, 12F, -0.2F, 0F, -4F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -4F, -0.2F, 0F); // Box 4
		bodyModel[2].setRotationPoint(39.1F, -27.2F, -24.7F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 64, 17, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 5
		bodyModel[3].setRotationPoint(-37.9F, -27.2F, -24.7F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 37, 2, 46, 0F,0.95F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.95F, -0.2F, 0F, 0.7F, -0.3F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.7F, -0.3F, 0F); // Box 7
		bodyModel[4].setRotationPoint(-41.4F, -27.2F, -23.2F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 81, 7, 1, 0F,2.05F, -0.2F, -0.5F, -1.8F, -0.2F, -0.5F, -1.8F, -0.2F, 0F, 2.05F, -0.2F, 0F, 0.6F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F); // Box 8
		bodyModel[5].setRotationPoint(-37.4F, -13.6F, -16.7F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 11
		bodyModel[6].setRotationPoint(-37.35F, -13.65F, -23.2F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 81, 7, 1, 0F,2.1F, -0.2F, -0.5F, -1.8F, -0.2F, -0.5F, -1.8F, -0.2F, 0F, 2.1F, -0.2F, 0F, 0.6F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0.6F, -0.2F, 0F); // Box 9
		bodyModel[7].setRotationPoint(-37.4F, -13.6F, 15.3F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 80, 1, 7, 0F,2.1F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2.1F, -0.25F, 0F, 2F, -0.25F, -0.5F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0F, 2F, -0.25F, 0F); // Box 10
		bodyModel[8].setRotationPoint(-37.35F, -13.65F, 15.8F);

		bodyModel[9].addShapeBox(-1F, 0F, -17.95F, 17, 21, 19, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 17F, -0.2F, -0.5F, 17F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 14
		bodyModel[9].setRotationPoint(11.1F, -27.1F, 1.3F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 18, 1, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, -15F, 0.5F, -0.5F, 16F, 0F, -0.5F, 16F, 0F, 0F, -15F, 0.5F, 0F); // Box 15
		bodyModel[10].setRotationPoint(27.1F, -27.1F, 1.3F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 16, 3, 24, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 17
		bodyModel[11].setRotationPoint(-25.4F, -28.1F, -12.2F);

		bodyModel[12].addShapeBox(0F, 0F, 0F, 1, 14, 8, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 20
		bodyModel[12].setRotationPoint(10.1F, -27.1F, -24.15F);

		bodyModel[13].addShapeBox(0F, 0F, 0F, 17, 2, 15, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 21
		bodyModel[13].setRotationPoint(12.6F, -28F, -10.2F);

		bodyModel[14].addShapeBox(0F, 0F, 0F, 14, 2, 12, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 22
		bodyModel[14].setRotationPoint(15.6F, -28F, -23.6F);

		bodyModel[15].addBox(0F, 0F, 0F, 12, 3, 4, 0F); // Body
		bodyModel[15].setRotationPoint(14F, -28F, 11F);

		bodyModel[16].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F); // Body
		bodyModel[16].setRotationPoint(14F, -28F, 15F);

		bodyModel[17].addShapeBox(0F, 0F, 0F, 12, 3, 4, 0F,-4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[17].setRotationPoint(14F, -28F, 7F);

		bodyModel[18].addShapeBox(0F, -0.25F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[18].setRotationPoint(27.5F, -28.3F, 11F);

		bodyModel[19].addShapeBox(0F, -0.25F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[19].setRotationPoint(26.5F, -28.3F, 16F);
		bodyModel[19].rotateAngleY = 0.78539816F;

		bodyModel[20].addShapeBox(0F, -0.25F, 0F, 4, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[20].setRotationPoint(19F, -28.3F, 19.5F);

		bodyModel[21].addShapeBox(0F, -0.25F, 0F, 1, 2, 4, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[21].setRotationPoint(24F, -28.3F, 7F);
		bodyModel[21].rotateAngleY = -0.78539816F;

		bodyModel[22].addBox(0F, 0F, 0F, 10, 1, 3, 0F); // Box 34
		bodyModel[22].setRotationPoint(15F, -28.5F, 11.5F);

		bodyModel[23].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F); // Box 35
		bodyModel[23].setRotationPoint(15F, -28.5F, 14.5F);

		bodyModel[24].addShapeBox(0F, 0F, 0F, 10, 1, 4, 0F,-3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, -0.5F, -3.5F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 36
		bodyModel[24].setRotationPoint(15F, -28.5F, 7.5F);

		bodyModel[25].addBox(0F, 1F, 0F, 3, 4, 6, 0F); // Box 37
		bodyModel[25].setRotationPoint(-7F, -30F, -3F);

		bodyModel[26].addShapeBox(1F, 1F, 0F, 15, 4, 3, 0F,-5F, 0F, -0.5F, -5F, 0F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F); // Box 39
		bodyModel[26].setRotationPoint(-7F, -30F, -9F);

		bodyModel[27].addShapeBox(0F, 0F, 0F, 8, 13, 32, 0F,8F, -0.2F, -0.5F, -13.5F, -0.2F, -0.5F, -13.5F, -0.2F, 0F, 8F, -0.2F, 0F, -6F, 0.8F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, -6F, 0.8F, 0F); // Box 44
		bodyModel[27].setRotationPoint(39F, -24.2F, -16.3F);

		bodyModel[28].addBox(0F, 0F, 0F, 9, 2, 9, 0F); // Box 55
		bodyModel[28].setRotationPoint(-5F, -8F, -4.5F);

		bodyModel[29].addBox(0F, 0F, 0F, 7, 1, 8, 0F); // Box 167
		bodyModel[29].setRotationPoint(16F, -12F, 5F);

		bodyModel[30].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Box 168
		bodyModel[30].setRotationPoint(15F, -21F, 5F);

		bodyModel[31].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 169
		bodyModel[31].setRotationPoint(15F, -17F, 6.5F);

		bodyModel[32].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F); // Box 170
		bodyModel[32].setRotationPoint(15F, -17F, 10.5F);

		bodyModel[33].addBox(3F, 0F, 0F, 5, 6, 6, 0F); // Box 171
		bodyModel[33].setRotationPoint(14F, -11F, 6F);

		bodyModel[34].addBox(0F, 0F, 0.5F, 1, 22, 2, 0F); // Box 179
		bodyModel[34].setRotationPoint(-6F, -28F, -1.5F);

		bodyModel[35].addBox(0F, 0F, 0F, 7, 1, 8, 0F); // Box 65
		bodyModel[35].setRotationPoint(-5.5F, -16F, -4F);

		bodyModel[36].addShapeBox(1F, 1F, 0F, 25, 6, 6, 0F,0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 67
		bodyModel[36].setRotationPoint(-38.35F, -25.5F, 16.7F);

		bodyModel[37].addShapeBox(0F, -0.5F, 0F, 6, 6, 5, 0F,2.1F, -0.5F, -2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, 0F, 2.1F, -0.5F, 0F, 2F, -0.5F, -2.5F, 0F, -0.5F, 2.5F, 0F, -0.5F, 0F, 2F, -0.5F, 0F); // Box 70
		bodyModel[37].setRotationPoint(20.65F, -22F, 17.8F);

		bodyModel[38].addShapeBox(0F, 0F, -1F, 1, 2, 16, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 88
		bodyModel[38].setRotationPoint(-27F, -28.2F, -7.2F);

		bodyModel[39].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 89
		bodyModel[39].setRotationPoint(-28.5F, -29F, -7.2F);

		bodyModel[40].addShapeBox(0F, 0F, 0F, 4, 3, 2, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 90
		bodyModel[40].setRotationPoint(-28.5F, -29F, 4.8F);

		bodyModel[41].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -2F, 1F, 0F); // Box 99
		bodyModel[41].setRotationPoint(38.5F, -19.8F, 8.9F);

		bodyModel[42].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,2F, 0F, -0.1F, -4F, 0F, -0.1F, -4F, 0F, -0.1F, 2F, 0F, -0.1F, -2F, 1F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -2F, 1F, -0.1F); // Box 100
		bodyModel[42].setRotationPoint(42.3F, -16.6F, -7.5F);

		bodyModel[43].addShapeBox(0F, 0F, 0F, 3, 4, 1, 0F,2F, 0F, -0.1F, -4F, 0F, -0.1F, -4F, 0F, -0.1F, 2F, 0F, -0.1F, -2F, 1F, -0.1F, -0.2F, -0.3F, -0.1F, -0.2F, -0.3F, -0.1F, -2F, 1F, -0.1F); // Box 101
		bodyModel[43].setRotationPoint(30.4F, -27.7F, -5.8F);

		bodyModel[44].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.4F, -3F, 0F, -0.4F, -3F, 0F, -0.4F, 1F, 0F, -0.4F, -2F, -0.6F, -0.4F, -0.7F, -1F, -0.4F, -0.7F, -1F, -0.4F, -2F, -0.6F, -0.4F); // Box 102
		bodyModel[44].setRotationPoint(30.5F, -26.9F, 11.7F);

		bodyModel[45].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F); // Body
		bodyModel[45].setRotationPoint(-41.9F, -11F, -24F);

		bodyModel[46].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F,0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Body
		bodyModel[46].setRotationPoint(-46.9F, -11F, -24F);

		bodyModel[47].addShapeBox(0F, 0F, 0F, 5, 7, 8, 0F,-1F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -5F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Box 109
		bodyModel[47].setRotationPoint(-46.9F, -11F, 16F);

		bodyModel[48].addShapeBox(0F, 0F, 0F, 3, 4, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 3F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 3F, 0F); // Box 110
		bodyModel[48].setRotationPoint(-41.9F, -11F, 16F);

		bodyModel[49].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 117
		bodyModel[49].setRotationPoint(-22.6F, -28.2F, -21.3F);

		bodyModel[50].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 118
		bodyModel[50].setRotationPoint(10.2F, -28.2F, -22.3F);

		bodyModel[51].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 119
		bodyModel[51].setRotationPoint(7.2F, -28.2F, 18.7F);

		bodyModel[52].addShapeBox(0F, 0F, 0F, 3, 2, 3, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F); // Box 120
		bodyModel[52].setRotationPoint(-35.6F, -28.2F, -14.3F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 1, 5, 1, 0F,0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F, 0.3F, -0.2F, 0.3F); // Box 121
		bodyModel[53].setRotationPoint(-21.8F, -31.2F, 20.7F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 1, 8, 1, 0F,-0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 122
		bodyModel[54].setRotationPoint(-21.8F, -38.2F, 20.7F);

		bodyModel[55].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,0.8F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, -1.2F, -0.2F, -0.2F, 0.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 123
		bodyModel[55].setRotationPoint(-21.8F, -47.8F, 20.7F);

		bodyModel[56].addShapeBox(0F, 0F, 0F, 1, 10, 1, 0F,1.8F, -0.2F, -0.2F, -2.2F, -0.2F, -0.2F, -2.2F, -0.2F, -0.2F, 1.8F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F, -0.2F); // Box 124
		bodyModel[56].setRotationPoint(-22.8F, -57.3F, 20.7F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 4, 3, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F, 0.5F, -0.2F, 0.5F); // Box 125
		bodyModel[57].setRotationPoint(-39F, -29.6F, -2F);

		bodyModel[58].addShapeBox(0F, 0F, 0F, 1, 2, 34, 0F,-0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1.5F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, -1F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 0.5F, -0.2F, -0.2F, 1F, -0.2F, -0.2F, 1F); // Box 126
		bodyModel[58].setRotationPoint(-41.4F, -28.4F, -17.2F);

		bodyModel[59].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 127
		bodyModel[59].setRotationPoint(45.1F, -10.4F, -24.2F);

		bodyModel[60].addShapeBox(0F, 0F, 0F, 1, 4, 8, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 128
		bodyModel[60].setRotationPoint(45.1F, -10.4F, 16.3F);

		bodyModel[61].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, 0F, 0F, -0.5F, -1.5F, 0F, -0.5F, -3F, 0F, 0F, -2.2F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 48
		bodyModel[61].setRotationPoint(38F, -13.5F, 24.3F);

		bodyModel[62].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, -0.2F, 0F, -1.3F, -3F, 0F, -2.6F, -3F, 0F, 0.5F, -1.7F, 0F, 1F, 7.2F, 0F, -1F, 7.2F, 0F, -2F, 7.2F, 0F, 1F, 7.2F, 0F); // Box 49
		bodyModel[62].setRotationPoint(43F, -12.2F, 24.3F);

		bodyModel[63].addShapeBox(0F, 0F, 0F, 4, 1, 2, 0F,0.5F, -1.7F, 0F, -2.6F, -3F, 0F, -1.3F, -3F, 0F, 0.5F, -0.2F, 0F, 1F, 7.2F, 0F, -2F, 7.2F, 0F, -1F, 7.2F, 0F, 1F, 7.2F, 0F); // Box 131
		bodyModel[63].setRotationPoint(43F, -12.2F, -26.25F);

		bodyModel[64].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,0F, -2.2F, 0F, -0.5F, -3F, 0F, -0.5F, -1.5F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, -1F, 4.5F, 0F, -1F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 132
		bodyModel[64].setRotationPoint(38F, -13.5F, -26.25F);

		bodyModel[65].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-2.6F, -3F, 0F, 0.5F, -1.7F, 0F, 0.5F, -0.2F, 0F, -1.3F, -3F, 0F, -2F, 7.2F, 0F, 1F, 7.2F, 0F, 1F, 7.2F, 0F, -1F, 7.2F, 0F); // Box 133
		bodyModel[65].setRotationPoint(-44.5F, -12.2F, -26.25F);

		bodyModel[66].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,-0.5F, -3F, 0F, 0.5F, -2.2F, 0F, 0.5F, 0F, 0F, -0.5F, -1.5F, 0F, -1F, 4.5F, 0F, 0.5F, 4.5F, 0F, 0.5F, 4.5F, 0F, -1F, 4.5F, 0F); // Box 134
		bodyModel[66].setRotationPoint(-39.5F, -13.5F, -26.25F);

		bodyModel[67].addShapeBox(0F, 0F, 0F, 5, 5, 2, 0F,-0.5F, -1.5F, 0F, 0.5F, 0F, 0F, 0.5F, -2.2F, 0F, -0.5F, -3F, 0F, -1F, 4.5F, 0F, 0.5F, 4.5F, 0F, 0.5F, 4.5F, 0F, -1F, 4.5F, 0F); // Box 135
		bodyModel[67].setRotationPoint(-39.5F, -13.5F, 24.3F);

		bodyModel[68].addShapeBox(0F, 0F, 0F, 5, 1, 2, 0F,-1.3F, -3F, 0F, 0.5F, -0.2F, 0F, 0.5F, -1.7F, 0F, -2.6F, -3F, 0F, -1F, 7.2F, 0F, 1F, 7.2F, 0F, 1F, 7.2F, 0F, -2F, 7.2F, 0F); // Box 136
		bodyModel[68].setRotationPoint(-44.5F, -12.2F, 24.3F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 72, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 138
		bodyModel[69].setRotationPoint(-34F, -13.5F, 24.3F);

		bodyModel[70].addShapeBox(0F, 0F, 0F, 72, 5, 2, 0F,0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F, 0F, 4.5F, 0F); // Box 139
		bodyModel[70].setRotationPoint(-34F, -13.5F, -26.25F);

		bodyModel[71].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 159
		bodyModel[71].setRotationPoint(32.9F, -26F, -22.05F);

		bodyModel[72].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 160
		bodyModel[72].setRotationPoint(33.8F, -26.5F, -22F);

		bodyModel[73].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 161
		bodyModel[73].setRotationPoint(33.8F, -25.5F, -22F);

		bodyModel[74].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 162
		bodyModel[74].setRotationPoint(33.8F, -24.5F, -22F);

		bodyModel[75].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 163
		bodyModel[75].setRotationPoint(33.8F, -26.5F, -19F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 164
		bodyModel[76].setRotationPoint(33.8F, -25.5F, -19F);

		bodyModel[77].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 165
		bodyModel[77].setRotationPoint(33.8F, -24.5F, -19F);

		bodyModel[78].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 166
		bodyModel[78].setRotationPoint(32.9F, -26F, -19.05F);

		bodyModel[79].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 172
		bodyModel[79].setRotationPoint(34F, -27.4F, -23.1F);

		bodyModel[80].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 173
		bodyModel[80].setRotationPoint(34F, -26.8F, -23.5F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 174
		bodyModel[81].setRotationPoint(34F, -26.8F, -17.5F);

		bodyModel[82].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 175
		bodyModel[82].setRotationPoint(33F, -22.8F, -23.5F);

		bodyModel[83].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 176
		bodyModel[83].setRotationPoint(33F, -22.8F, -17.5F);

		bodyModel[84].addShapeBox(-6F, -4.5F, -7F, 12, 3, 3, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 204
		bodyModel[84].setRotationPoint(39.8F, -3.8F, 19.8F);

		bodyModel[85].addShapeBox(-5F, -1.5F, -7F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 205
		bodyModel[85].setRotationPoint(39.8F, -3.8F, 19.8F);

		bodyModel[86].addShapeBox(-6F, 1.5F, -7F, 12, 3, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 206
		bodyModel[86].setRotationPoint(39.8F, -3.8F, 19.8F);

		bodyModel[87].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 3, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Box 207
		bodyModel[87].setRotationPoint(39.8F, -3.8F, -9.6F);

		bodyModel[88].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 208
		bodyModel[88].setRotationPoint(39.8F, -3.8F, -9.6F);

		bodyModel[89].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 3, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 209
		bodyModel[89].setRotationPoint(39.8F, -3.8F, -9.6F);

		bodyModel[90].addShapeBox(0F, 0F, 0F, 3, 17, 2, 0F,15F, -0.2F, -0.5F, -17F, -0.2F, -0.5F, -17F, -0.2F, 0F, 15F, -0.2F, 0F, 15F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, 15F, -0.2F, 0F); // Box 300
		bodyModel[90].setRotationPoint(41.1F, -27.2F, -24.7F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 7, 17, 2, 0F,15.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 15.5F, -0.2F, 0F, 12.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 12.5F, -0.2F, 0F); // Box 301
		bodyModel[91].setRotationPoint(-26.9F, -27.2F, -24.7F);

		bodyModel[92].addShapeBox(0F, 0F, 0F, 64, 17, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 302
		bodyModel[92].setRotationPoint(-37.9F, -27.2F, 22.3F);

		bodyModel[93].addShapeBox(0F, 0F, 0F, 3, 17, 2, 0F,15F, -0.2F, -0.5F, -17F, -0.2F, -0.5F, -17F, -0.2F, 0F, 15F, -0.2F, 0F, 15F, -0.2F, -0.5F, -1F, -0.2F, -0.5F, -1F, -0.2F, 0F, 15F, -0.2F, 0F); // Box 304
		bodyModel[93].setRotationPoint(41.1F, -27.2F, 22.3F);

		bodyModel[94].addBox(14F, 1F, 0F, 3, 4, 6, 0F); // Box 284
		bodyModel[94].setRotationPoint(-7F, -30F, -3F);

		bodyModel[95].addShapeBox(0F, 1F, 0F, 12, 4, 6, 0F,-5F, 0F, -0.5F, -4F, 0F, -0.5F, -9F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, -4F, 0F, -0.5F, -9F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[95].setRotationPoint(-7F, -30F, -9F);

		bodyModel[96].addShapeBox(5F, 1F, 0F, 12, 4, 6, 0F,-4F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, -9F, 0F, 0F); // Box 286
		bodyModel[96].setRotationPoint(-7F, -30F, -9F);

		bodyModel[97].addShapeBox(0F, 1F, 12F, 12, 4, 6, 0F,0F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, -0.5F, -5F, 0F, -0.5F, 0F, 0F, 0F, -9F, 0F, 0F, -4F, 0F, -0.5F, -5F, 0F, -0.5F); // Box 287
		bodyModel[97].setRotationPoint(-7F, -30F, -9F);

		bodyModel[98].addShapeBox(5F, 1F, 12F, 12, 4, 6, 0F,-9F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, -4F, 0F, -0.5F, -9F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, -0.5F, -4F, 0F, -0.5F); // Box 288
		bodyModel[98].setRotationPoint(-7F, -30F, -9F);

		bodyModel[99].addShapeBox(1F, 1F, 15F, 15, 4, 3, 0F,-4.5F, 0F, 0F, -4.5F, 0F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F, -4.5F, 0F, 0F, -4.5F, 0F, 0F, -5F, 0F, -0.5F, -5F, 0F, -0.5F); // Box 289
		bodyModel[99].setRotationPoint(-7F, -30F, -9F);

		bodyModel[100].addShapeBox(50F, 0F, 0F, 19, 2, 46, 0F,0.95F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.95F, -0.2F, 0F, 0.95F, -0.3F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.95F, -0.3F, 0F); // Box 290
		bodyModel[100].setRotationPoint(-41.4F, -27.2F, -23.2F);

		bodyModel[101].addShapeBox(37.45F, 0F, 0F, 4, 2, 18, 0F,0.95F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1.5F, 0.95F, -0.2F, 0F, 0.7F, -0.3F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1.5F, 0.7F, -0.3F, 0F); // Box 291
		bodyModel[101].setRotationPoint(-41.4F, -27.2F, -23.2F);

		bodyModel[102].addShapeBox(44.1F, 0F, 0F, 4, 2, 18, 0F,-0.5F, -0.2F, -0.5F, 0.95F, -0.2F, -0.5F, 0.95F, -0.2F, 0F, -0.5F, -0.2F, -1.5F, -0.5F, -0.2F, -0.5F, 0.7F, -0.3F, -0.5F, 0.7F, -0.3F, 0F, -0.5F, -0.2F, -1.5F); // Box 292
		bodyModel[102].setRotationPoint(-41.4F, -27.2F, -23.2F);

		bodyModel[103].addShapeBox(40.45F, 0F, 0F, 3, 2, 18, 0F,-0.5F, -0.2F, -0.5F, 1.15F, -0.2F, -0.5F, 1.15F, -0.2F, -1.5F, -0.5F, -0.2F, -1.5F, -0.5F, -0.2F, -0.5F, 1.15F, -0.3F, -0.5F, 1.15F, -0.3F, -1.5F, -0.5F, -0.2F, -1.5F); // Box 293
		bodyModel[103].setRotationPoint(-41.4F, -27.2F, -23.2F);

		bodyModel[104].addShapeBox(44.1F, 0F, 28.5F, 4, 2, 18, 0F,-0.5F, -0.2F, -1.5F, 0.95F, -0.2F, 0F, 0.95F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.3F, -1.5F, 0.95F, -0.3F, 0F, 0.95F, -0.3F, -0.5F, -0.5F, -0.3F, -0.5F); // Box 294
		bodyModel[104].setRotationPoint(-41.4F, -27.2F, -23.2F);

		bodyModel[105].addShapeBox(37.45F, 0F, 28.5F, 4, 2, 18, 0F,0.95F, -0.2F, 0F, -0.5F, -0.2F, -1.5F, -0.5F, -0.2F, -0.5F, 0.95F, -0.2F, -0.5F, 0.7F, -0.3F, 0F, -0.5F, -0.2F, -1.5F, -0.5F, -0.2F, -0.5F, 0.7F, -0.3F, -0.5F); // Box 295
		bodyModel[105].setRotationPoint(-41.4F, -27.2F, -23.2F);

		bodyModel[106].addShapeBox(40.45F, 0F, 28.5F, 3, 2, 18, 0F,-0.5F, -0.2F, -1.5F, 1.15F, -0.2F, -1.5F, 1.15F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -1.5F, 1.15F, -0.3F, -1.5F, 1.15F, -0.3F, -0.5F, -0.5F, -0.2F, -0.5F); // Box 296
		bodyModel[106].setRotationPoint(-41.4F, -27.2F, -23.2F);

		bodyModel[107].addShapeBox(0F, -7.95F, 0F, 1, 21, 8, 0F,0F, -0.02F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.02F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 297
		bodyModel[107].setRotationPoint(-41F, -19.2F, -23.2F);
		bodyModel[107].rotateAngleZ = 0.17889625F;

		bodyModel[108].addShapeBox(0F, -7.95F, 0F, 1, 21, 8, 0F,0F, -0.02F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.02F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 298
		bodyModel[108].setRotationPoint(-41F, -19.2F, 14.8F);
		bodyModel[108].rotateAngleZ = 0.17889625F;

		bodyModel[109].addBox(-5F, 4F, 0F, 5, 1, 8, 0F); // Box 299
		bodyModel[109].setRotationPoint(-5.5F, -16F, -4F);

		bodyModel[110].addShapeBox(0F, -5F, 0F, 32, 5, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 300
		bodyModel[110].setRotationPoint(-22.4F, -13.6F, -17F);
		bodyModel[110].rotateAngleX = 0.2268928F;

		bodyModel[111].addShapeBox(0F, -5F, 0F, 19, 5, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 301
		bodyModel[111].setRotationPoint(-12F, -13.6F, 16F);
		bodyModel[111].rotateAngleX = -0.2268928F;

		bodyModel[112].addShapeBox(0F, 0F, 0F, 7, 17, 2, 0F,15.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 15.5F, -0.2F, 0F, 12.5F, -0.2F, -0.5F, -18F, -0.2F, -0.5F, -18F, -0.2F, 0F, 12.5F, -0.2F, 0F); // Box 273
		bodyModel[112].setRotationPoint(-26.9F, -27.2F, 22.3F);

		bodyModel[113].addShapeBox(0F, 0F, 0F, 45, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 274
		bodyModel[113].setRotationPoint(-35.4F, -10.6F, 9.3F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 45, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 275
		bodyModel[114].setRotationPoint(-35.4F, -10.6F, -15.7F);

		bodyModel[115].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 276
		bodyModel[115].setRotationPoint(-28.4F, -9.6F, 10.3F);

		bodyModel[116].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 277
		bodyModel[116].setRotationPoint(-15.4F, -9.6F, 10.3F);

		bodyModel[117].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 278
		bodyModel[117].setRotationPoint(-0.4F, -9.6F, 10.3F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 279
		bodyModel[118].setRotationPoint(-0.4F, -9.6F, -14.7F);

		bodyModel[119].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 280
		bodyModel[119].setRotationPoint(-15.4F, -9.6F, -14.7F);

		bodyModel[120].addShapeBox(0F, 0F, 0F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 281
		bodyModel[120].setRotationPoint(-28.4F, -9.6F, -14.7F);

		bodyModel[121].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 282
		bodyModel[121].setRotationPoint(-34.4F, -11F, 10F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 283
		bodyModel[122].setRotationPoint(-12.4F, -11F, 10F);

		bodyModel[123].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 284
		bodyModel[123].setRotationPoint(-12.4F, -11F, -14.5F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 21, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 285
		bodyModel[124].setRotationPoint(-34.4F, -11F, -14.5F);

		bodyModel[125].addShapeBox(1F, 0F, 0F, 25, 6, 6, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -1F, 0F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 286
		bodyModel[125].setRotationPoint(-38.35F, -19F, 16.7F);

		bodyModel[126].addShapeBox(1F, 1F, 0F, 14, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Box 287
		bodyModel[126].setRotationPoint(-11.35F, -21F, 16.7F);

		bodyModel[127].addShapeBox(1F, 1F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 288
		bodyModel[127].setRotationPoint(-11.35F, -26F, 16.7F);

		bodyModel[128].addShapeBox(1F, 1F, 0F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 289
		bodyModel[128].setRotationPoint(1.65F, -26F, 16.7F);

		bodyModel[129].addShapeBox(1F, 1F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 290
		bodyModel[129].setRotationPoint(1.65F, -25F, 17.7F);

		bodyModel[130].addShapeBox(1F, 1F, 0F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 291
		bodyModel[130].setRotationPoint(-11.35F, -25F, 17.7F);

		bodyModel[131].addShapeBox(1F, 1F, 0F, 7, 4, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 292
		bodyModel[131].setRotationPoint(-6.35F, -25F, 17.7F);

		bodyModel[132].addShapeBox(1F, 1F, 0F, 3, 4, 6, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 293
		bodyModel[132].setRotationPoint(-9.35F, -25F, 16.7F);

		bodyModel[133].addShapeBox(1F, 1F, 0F, 1, 2, 2, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 294
		bodyModel[133].setRotationPoint(-6F, -24.5F, 16.7F);

		bodyModel[134].addShapeBox(1F, 1F, 0F, 2, 1, 2, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 295
		bodyModel[134].setRotationPoint(-4.5F, -23.5F, 16.85F);

		bodyModel[135].addShapeBox(1F, 1F, 0F, 2, 1, 2, 0F,-0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 296
		bodyModel[135].setRotationPoint(-4.5F, -24.25F, 16.85F);

		bodyModel[136].addShapeBox(1F, 1F, 0F, 2, 1, 2, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 297
		bodyModel[136].setRotationPoint(-4.5F, -22.75F, 16.85F);

		bodyModel[137].addShapeBox(1F, 1F, 0F, 2, 1, 2, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 298
		bodyModel[137].setRotationPoint(-2F, -23.5F, 16.85F);

		bodyModel[138].addShapeBox(1F, 1F, 0F, 2, 1, 2, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 299
		bodyModel[138].setRotationPoint(-2F, -22.75F, 16.85F);

		bodyModel[139].addShapeBox(1F, 1F, 0F, 2, 1, 2, 0F,-0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 300
		bodyModel[139].setRotationPoint(-2F, -24.25F, 16.85F);

		bodyModel[140].addShapeBox(0F, 1F, 0.8F, 2, 2, 2, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 301
		bodyModel[140].setRotationPoint(18F, -21.5F, 18.85F);
		bodyModel[140].rotateAngleY = -0.54105207F;

		bodyModel[141].addShapeBox(0F, 1F, 0.8F, 2, 1, 2, 0F,-0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 302
		bodyModel[141].setRotationPoint(18F, -22.25F, 18.85F);
		bodyModel[141].rotateAngleY = -0.54105207F;

		bodyModel[142].addShapeBox(0F, 2F, 0.8F, 2, 1, 2, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 303
		bodyModel[142].setRotationPoint(18F, -20.75F, 18.85F);
		bodyModel[142].rotateAngleY = -0.54105207F;

		bodyModel[143].addShapeBox(7F, 2.6F, 0.8F, 2, 1, 2, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 304
		bodyModel[143].setRotationPoint(18F, -20.75F, 18.85F);
		bodyModel[143].rotateAngleY = -0.54105207F;

		bodyModel[144].addShapeBox(7F, 2.6F, 0.8F, 2, 1, 2, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 305
		bodyModel[144].setRotationPoint(18F, -21.5F, 18.85F);
		bodyModel[144].rotateAngleY = -0.54105207F;

		bodyModel[145].addShapeBox(7F, 2.6F, 0.8F, 2, 1, 2, 0F,-0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 306
		bodyModel[145].setRotationPoint(18F, -22.25F, 18.85F);
		bodyModel[145].rotateAngleY = -0.54105207F;

		bodyModel[146].addShapeBox(4.65F, 2.6F, 0.8F, 2, 1, 2, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 307
		bodyModel[146].setRotationPoint(18F, -21.5F, 18.85F);
		bodyModel[146].rotateAngleY = -0.54105207F;

		bodyModel[147].addShapeBox(4.65F, 2.6F, 0.8F, 2, 1, 2, 0F,-0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 308
		bodyModel[147].setRotationPoint(18F, -22.25F, 18.85F);
		bodyModel[147].rotateAngleY = -0.54105207F;

		bodyModel[148].addShapeBox(4.65F, 2.6F, 0.8F, 2, 1, 2, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 309
		bodyModel[148].setRotationPoint(18F, -20.75F, 18.85F);
		bodyModel[148].rotateAngleY = -0.54105207F;

		bodyModel[149].addShapeBox(2.25F, 2.6F, 0.8F, 2, 1, 2, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 310
		bodyModel[149].setRotationPoint(18F, -21.5F, 18.85F);
		bodyModel[149].rotateAngleY = -0.54105207F;

		bodyModel[150].addShapeBox(2.25F, 2.6F, 0.8F, 2, 1, 2, 0F,-0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 311
		bodyModel[150].setRotationPoint(18F, -22.25F, 18.85F);
		bodyModel[150].rotateAngleY = -0.54105207F;

		bodyModel[151].addShapeBox(2.25F, 2.6F, 0.8F, 2, 1, 2, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 312
		bodyModel[151].setRotationPoint(18F, -20.75F, 18.85F);
		bodyModel[151].rotateAngleY = -0.54105207F;

		bodyModel[152].addShapeBox(4.65F, 0.4F, 0.8F, 2, 1, 2, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 313
		bodyModel[152].setRotationPoint(18F, -21.5F, 18.85F);
		bodyModel[152].rotateAngleY = -0.54105207F;

		bodyModel[153].addShapeBox(4.65F, 0.4F, 0.8F, 2, 1, 2, 0F,-0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 314
		bodyModel[153].setRotationPoint(18F, -22.25F, 18.85F);
		bodyModel[153].rotateAngleY = -0.54105207F;

		bodyModel[154].addShapeBox(4.65F, 0.4F, 0.8F, 2, 1, 2, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 315
		bodyModel[154].setRotationPoint(18F, -20.75F, 18.85F);
		bodyModel[154].rotateAngleY = -0.54105207F;

		bodyModel[155].addShapeBox(7F, 0.4F, 0.8F, 2, 1, 2, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 316
		bodyModel[155].setRotationPoint(18F, -20.75F, 18.85F);
		bodyModel[155].rotateAngleY = -0.54105207F;

		bodyModel[156].addShapeBox(7F, 0.4F, 0.8F, 2, 1, 2, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 317
		bodyModel[156].setRotationPoint(18F, -21.5F, 18.85F);
		bodyModel[156].rotateAngleY = -0.54105207F;

		bodyModel[157].addShapeBox(7F, 0.4F, 0.8F, 2, 1, 2, 0F,-0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 318
		bodyModel[157].setRotationPoint(18F, -22.25F, 18.85F);
		bodyModel[157].rotateAngleY = -0.54105207F;

		bodyModel[158].addShapeBox(2.25F, 0.4F, 0.8F, 2, 1, 2, 0F,0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F); // Box 319
		bodyModel[158].setRotationPoint(18F, -20.75F, 18.85F);
		bodyModel[158].rotateAngleY = -0.54105207F;

		bodyModel[159].addShapeBox(2.25F, 0.4F, 0.8F, 2, 1, 2, 0F,0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F, 0F, -0.15F, -0.5F, 0F, -0.15F, -0.5F, 0F, -0.15F, 0F, 0F, -0.15F, 0F); // Box 320
		bodyModel[159].setRotationPoint(18F, -21.5F, 18.85F);
		bodyModel[159].rotateAngleY = -0.54105207F;

		bodyModel[160].addShapeBox(2.25F, 0.4F, 0.8F, 2, 1, 2, 0F,-0.6F, -0.2F, -0.5F, -0.6F, -0.2F, -0.5F, -0.6F, -0.2F, 0F, -0.6F, -0.2F, 0F, 0F, -0.1F, -0.5F, 0F, -0.1F, -0.5F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Box 321
		bodyModel[160].setRotationPoint(18F, -22.25F, 18.85F);
		bodyModel[160].rotateAngleY = -0.54105207F;

		bodyModel[161].addShapeBox(0F, 4F, 2F, 6, 5, 3, 0F,0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Box 322
		bodyModel[161].setRotationPoint(20.65F, -22F, 17.8F);

		bodyModel[162].addShapeBox(3F, -3F, 0F, 3, 2, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 323
		bodyModel[162].setRotationPoint(20.65F, -22F, 20.8F);

		bodyModel[163].addShapeBox(-9F, -3F, 0.25F, 12, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 324
		bodyModel[163].setRotationPoint(20.65F, -22F, 21.8F);

		bodyModel[164].addShapeBox(-11F, -3F, 1F, 2, 3, 1, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 325
		bodyModel[164].setRotationPoint(20.65F, -22F, 20.8F);

		bodyModel[165].addShapeBox(-20F, -3F, 0.25F, 9, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 326
		bodyModel[165].setRotationPoint(20.65F, -22F, 21.8F);

		bodyModel[166].addShapeBox(-20.25F, -2.5F, 0.25F, 1, 2, 1, 0F,-0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F, -0.25F); // Box 327
		bodyModel[166].setRotationPoint(20.65F, -22F, 21.8F);

		bodyModel[167].addShapeBox(-15F, -5F, 0F, 14, 7, 6, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 328
		bodyModel[167].setRotationPoint(-22.4F, -14.6F, -22.5F);

		bodyModel[168].addShapeBox(1F, -4F, -1F, 1, 5, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 329
		bodyModel[168].setRotationPoint(-22.4F, -13.6F, -17F);
		bodyModel[168].rotateAngleX = 0.2268928F;

		bodyModel[169].addShapeBox(30F, -4F, -1F, 1, 5, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 330
		bodyModel[169].setRotationPoint(-22.4F, -13.6F, -17F);
		bodyModel[169].rotateAngleX = 0.2268928F;

		bodyModel[170].addShapeBox(17F, -4F, -1F, 1, 5, 1, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 331
		bodyModel[170].setRotationPoint(-22.4F, -13.6F, -17F);
		bodyModel[170].rotateAngleX = 0.2268928F;

		bodyModel[171].addShapeBox(-3F, -5F, 0F, 4, 12, 4, 0F,-0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F); // Box 335
		bodyModel[171].setRotationPoint(8.6F, -20.25F, -22.5F);

		bodyModel[172].addShapeBox(-3F, -4F, 0F, 4, 5, 4, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 336
		bodyModel[172].setRotationPoint(8.6F, -19.6F, -22.5F);

		bodyModel[173].addBox(0F, 0F, 0F, 2, 8, 17, 0F); // Box 337
		bodyModel[173].setRotationPoint(9.75F, -23F, -15.5F);

		bodyModel[174].addBox(0F, 0F, 0F, 2, 6, 16, 0F); // Box 338
		bodyModel[174].setRotationPoint(9.75F, -14F, -14.5F);

		bodyModel[175].addShapeBox(0F, -7F, 0F, 2, 20, 25, 0F,0F, -7.5F, -7.5F, 0F, -7.5F, -7.5F, 0F, -7.5F, -7.5F, 0F, -7.5F, -7.5F, 0F, -7.5F, -7.5F, 0F, -7.5F, -7.5F, 0F, -7.5F, -7.5F, 0F, -7.5F, -7.5F); // Box 339
		bodyModel[175].setRotationPoint(9.6F, -22.25F, -21.5F);

		bodyModel[176].addShapeBox(0F, -7F, 0F, 2, 20, 20, 0F,0F, -8.25F, -6.5F, 0F, -8.25F, -6.5F, 0F, -8.25F, -6.5F, 0F, -8.25F, -6.5F, 0F, -8.25F, -6.5F, 0F, -8.25F, -6.5F, 0F, -8.25F, -6.5F, 0F, -8.25F, -6.5F); // Box 340
		bodyModel[176].setRotationPoint(9.6F, -14F, -13.5F);

		bodyModel[177].addBox(0F, 0F, 0F, 1, 1, 7, 0F); // Box 353
		bodyModel[177].setRotationPoint(13F, -28.25F, 9.5F);

		bodyModel[178].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 354
		bodyModel[178].setRotationPoint(12.5F, -29F, 10.5F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 355
		bodyModel[179].setRotationPoint(12.5F, -29F, 14.5F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 356
		bodyModel[180].setRotationPoint(13F, -28.5F, 16.5F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 0.15F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F); // Box 357
		bodyModel[181].setRotationPoint(13F, -28.5F, 8.5F);

		bodyModel[182].addBox(0F, 0F, 8F, 2, 5, 8, 0F); // Box 358
		bodyModel[182].setRotationPoint(28F, -26F, 2F);

		bodyModel[183].addShapeBox(0F, 0F, 1F, 2, 5, 7, 0F,7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 359
		bodyModel[183].setRotationPoint(28F, -26F, 2F);

		bodyModel[184].addShapeBox(0F, 0F, 1F, 9, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 360
		bodyModel[184].setRotationPoint(21F, -26F, 0F);

		bodyModel[185].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 361
		bodyModel[185].setRotationPoint(-39F, -27.6F, 16.7F);

		bodyModel[186].addShapeBox(0F, 0F, 0F, 2, 2, 2, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F, 1F, -0.2F, 1F); // Box 362
		bodyModel[186].setRotationPoint(-37.5F, -28.2F, 18.2F);

		bodyModel[187].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 363
		bodyModel[187].setRotationPoint(33.8F, -25.5F, 21F);

		bodyModel[188].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 364
		bodyModel[188].setRotationPoint(33.8F, -26.5F, 21F);

		bodyModel[189].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 365
		bodyModel[189].setRotationPoint(33.8F, -24.5F, 21F);

		bodyModel[190].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 366
		bodyModel[190].setRotationPoint(32.9F, -26F, 20.95F);

		bodyModel[191].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 367
		bodyModel[191].setRotationPoint(33F, -22.8F, 22.5F);

		bodyModel[192].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 368
		bodyModel[192].setRotationPoint(34F, -26.8F, 22.5F);

		bodyModel[193].addShapeBox(0F, 0F, 0F, 1, 1, 6, 0F,0F, -0.4F, -0.4F, 0F, -0.4F, -0.4F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0.2F, 0F, -0.4F, 0.2F); // Box 369
		bodyModel[193].setRotationPoint(34F, -27.4F, 16.9F);

		bodyModel[194].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 370
		bodyModel[194].setRotationPoint(34F, -26.8F, 16.5F);

		bodyModel[195].addShapeBox(0F, 0F, 0F, 2, 1, 1, 0F,0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, 0F, 0F, -0.4F, -1F, 0F, -0.4F, -1F, 0F, -0.4F, 0F, 0F, -0.4F); // Box 371
		bodyModel[195].setRotationPoint(33F, -22.8F, 16.5F);

		bodyModel[196].addShapeBox(0F, 0F, 0F, 1, 4, 1, 0F,-0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F); // Box 372
		bodyModel[196].setRotationPoint(32.9F, -26F, 17.95F);

		bodyModel[197].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 373
		bodyModel[197].setRotationPoint(33.8F, -25.5F, 18F);

		bodyModel[198].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F); // Box 374
		bodyModel[198].setRotationPoint(33.8F, -26.5F, 18F);

		bodyModel[199].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F,0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, 0F, 0.75F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F, 0.3F, -0.2F, -0.1F); // Box 375
		bodyModel[199].setRotationPoint(33.8F, -24.5F, 18F);

		bodyModel[200].addShapeBox(-5F, -1.5F, -6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 376
		bodyModel[200].setRotationPoint(48F, -6.8F, -4.6F);

		bodyModel[201].addShapeBox(-5F, -1.5F, -6.5F, 3, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Box 377
		bodyModel[201].setRotationPoint(48F, -6.8F, 16.4F);

		bodyModel[202].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 378
		bodyModel[202].setRotationPoint(-24F, -1F, -17.2F);

		bodyModel[203].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 379
		bodyModel[203].setRotationPoint(-11.5F, -1F, -17.2F);

		bodyModel[204].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 380
		bodyModel[204].setRotationPoint(1F, -1F, -17.2F);

		bodyModel[205].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 381
		bodyModel[205].setRotationPoint(14F, -1F, -17.2F);

		bodyModel[206].addShapeBox(0F, 0F, 0F, 4, 3, 34, 0F,1.5F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 1.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 382
		bodyModel[206].setRotationPoint(26.5F, -1F, -17.2F);

		bodyModel[207].addShapeBox(-1F, -5.95F, 5.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 409
		bodyModel[207].setRotationPoint(-41F, -19.2F, 14.8F);
		bodyModel[207].rotateAngleZ = 0.17889625F;

		bodyModel[208].addShapeBox(-1F, -5.95F, 1.5F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 410
		bodyModel[208].setRotationPoint(-41F, -19.2F, 14.8F);
		bodyModel[208].rotateAngleZ = 0.17889625F;

		bodyModel[209].addShapeBox(-1F, -5.95F, -33F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 411
		bodyModel[209].setRotationPoint(-41F, -19.2F, 14.8F);
		bodyModel[209].rotateAngleZ = 0.17889625F;

		bodyModel[210].addShapeBox(-1F, -5.95F, -37F, 1, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 412
		bodyModel[210].setRotationPoint(-41F, -19.2F, 14.8F);
		bodyModel[210].rotateAngleZ = 0.17889625F;

		bodyModel[211].addShapeBox(0F, 0F, 0F, 3, 3, 2, 0F,1F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, 0F, 1F, 0F, 0F, -2F, 1F, -0.5F, 0F, -0.3F, -0.5F, 0F, -0.3F, 0F, -2F, 1F, 0F); // Box 697
		bodyModel[211].setRotationPoint(38.5F, -19.8F, -11.1F);

		bodyModel[212].addShapeBox(1F, -0.25F, 1F, 15, 2, 13, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 698
		bodyModel[212].setRotationPoint(12.6F, -28F, -10.2F);

		bodyModel[213].addShapeBox(3.5F, -0.25F, -13F, 13, 2, 11, 0F,0.5F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.5F, -0.2F, 0F, 0.2F, -0.2F, -0.5F, -0.5F, -0.2F, -0.5F, -0.5F, -0.2F, 0F, 0.2F, -0.2F, 0F); // Box 699
		bodyModel[213].setRotationPoint(12.6F, -28F, -10.2F);

		bodyModel[214].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 700
		bodyModel[214].setRotationPoint(15.1F, -26.2F, -25F);

		bodyModel[215].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 701
		bodyModel[215].setRotationPoint(-3.9F, -26.2F, -25F);

		bodyModel[216].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 702
		bodyModel[216].setRotationPoint(-22.9F, -26.2F, -25F);

		bodyModel[217].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 703
		bodyModel[217].setRotationPoint(-22.9F, -26.2F, 22.6F);

		bodyModel[218].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 704
		bodyModel[218].setRotationPoint(-3.9F, -26.2F, 22.6F);

		bodyModel[219].addShapeBox(0F, 0F, 0F, 1, 12, 2, 0F,0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.5F, 0F, -0.2F, -0.5F, 0F, -0.2F, 0F, 0F, -0.2F, 0F); // Box 705
		bodyModel[219].setRotationPoint(15.1F, -26.2F, 22.6F);
	}

	private void initbodyDoorOpenModel_1()
	{
		bodyDoorOpenModel[0] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 182

		bodyDoorOpenModel[0].addShapeBox(-2F, -3.5F, 0F, 29, 3, 32, 0F,0.5F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -4.5F, 0F, 0F, 4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 4.5F, 0F); // Box 182
		bodyDoorOpenModel[0].setRotationPoint(-65F, 5.5F, -16F);
		bodyDoorOpenModel[0].rotateAngleZ = 0.17453293F;
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 825, 33, textureX, textureY); // Box 181
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 393, 113, textureX, textureY); // Box 391
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 409, 113, textureX, textureY); // Box 392
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 393
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 394
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 395
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 396
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 441, 113, textureX, textureY); // Box 397
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 489, 113, textureX, textureY); // Box 398
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 465, 113, textureX, textureY); // Box 399
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 521, 113, textureX, textureY); // Box 400
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 545, 113, textureX, textureY); // Box 401
		bodyDoorCloseModel[12] = new ModelRendererTurbo(this, 561, 113, textureX, textureY); // Box 402
		bodyDoorCloseModel[13] = new ModelRendererTurbo(this, 593, 113, textureX, textureY); // Box 403
		bodyDoorCloseModel[14] = new ModelRendererTurbo(this, 625, 113, textureX, textureY); // Box 404
		bodyDoorCloseModel[15] = new ModelRendererTurbo(this, 649, 113, textureX, textureY); // Box 405
		bodyDoorCloseModel[16] = new ModelRendererTurbo(this, 665, 113, textureX, textureY); // Box 406
		bodyDoorCloseModel[17] = new ModelRendererTurbo(this, 705, 113, textureX, textureY); // Box 407
		bodyDoorCloseModel[18] = new ModelRendererTurbo(this, 721, 113, textureX, textureY); // Box 408

		bodyDoorCloseModel[0].addShapeBox(-1.5F, -28.5F, 0.5F, 3, 24, 31, 0F,0F, 0F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F); // Box 181
		bodyDoorCloseModel[0].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[0].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[1].addShapeBox(-2.25F, -29.5F, 1F, 3, 5, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 391
		bodyDoorCloseModel[1].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[1].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[2].addShapeBox(-2.25F, -29.5F, 29F, 3, 5, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 392
		bodyDoorCloseModel[2].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[2].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[3].addShapeBox(-2.25F, -28.5F, 16F, 3, 2, 13, 0F,-0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, -0.25F, -0.5F, -2F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 393
		bodyDoorCloseModel[3].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[3].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[4].addShapeBox(-2.25F, -26.5F, 16F, 3, 14, 13, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 394
		bodyDoorCloseModel[4].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[4].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[5].addShapeBox(-2.25F, -12.5F, 16F, 3, 4, 13, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -3.25F, -0.25F, 0.5F, -3.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 395
		bodyDoorCloseModel[5].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[5].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[6].addShapeBox(-2.25F, -8.5F, 19F, 3, 1, 10, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0.5F, -1.25F, -0.25F, 0F, -1.25F); // Box 396
		bodyDoorCloseModel[6].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[6].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[7].addShapeBox(-2.75F, -24.5F, 15F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 397
		bodyDoorCloseModel[7].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[7].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[8].addShapeBox(-2.75F, -14.5F, 15F, 3, 1, 3, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 398
		bodyDoorCloseModel[8].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[8].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[9].addShapeBox(-2.65F, -25.5F, 15.4F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F); // Box 399
		bodyDoorCloseModel[9].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[9].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[10].addShapeBox(-2.65F, -15.5F, 15.4F, 3, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, -0.2F, 0F, -0.25F, -0.2F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0.5F, 0F, -0.25F, 0F, 0F); // Box 400
		bodyDoorCloseModel[10].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[10].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[11].addShapeBox(-1.75F, -20.5F, 4F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 401
		bodyDoorCloseModel[11].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[11].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[12].addShapeBox(-3.25F, -11.5F, 2F, 3, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 402
		bodyDoorCloseModel[12].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[12].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[13].addShapeBox(-3.25F, -11.5F, 11F, 3, 2, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 403
		bodyDoorCloseModel[13].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[13].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[14].addShapeBox(-3.25F, -14.5F, 2F, 3, 3, 2, 0F,-0.25F, 0F, -2.25F, -0.25F, -0.2F, -2.25F, -0.25F, -0.2F, 1.75F, -0.25F, 0F, 1.75F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 404
		bodyDoorCloseModel[14].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[14].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[15].addShapeBox(-3.25F, -14.5F, 11F, 3, 3, 2, 0F,-0.25F, 0F, 1.75F, -0.25F, -0.2F, 1.75F, -0.25F, -0.2F, -2.25F, -0.25F, 0F, -2.25F, -0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F); // Box 405
		bodyDoorCloseModel[15].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[15].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[16].addShapeBox(-3.25F, -9.5F, 11F, 3, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, 1.75F, -0.25F, -0.2F, 1.75F, -0.25F, -0.2F, -2.25F, -0.25F, 0F, -2.25F); // Box 406
		bodyDoorCloseModel[16].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[16].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[17].addShapeBox(-3.25F, -9.5F, 2F, 3, 3, 2, 0F,-0.25F, 0F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0.5F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -2.25F, -0.25F, -0.2F, -2.25F, -0.25F, -0.2F, 1.75F, -0.25F, 0F, 1.75F); // Box 407
		bodyDoorCloseModel[17].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[17].rotateAngleZ = 0.18325957F;

		bodyDoorCloseModel[18].addShapeBox(-2.75F, -26.5F, 24F, 2, 5, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 408
		bodyDoorCloseModel[18].setRotationPoint(-36.5F, 2.2F, -16F);
		bodyDoorCloseModel[18].rotateAngleZ = 0.18325957F;
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 297, 25, textureX, textureY); // Body
		turretModel[1] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Body
		turretModel[2] = new ModelRendererTurbo(this, 393, 25, textureX, textureY); // Body
		turretModel[3] = new ModelRendererTurbo(this, 425, 25, textureX, textureY); // Body
		turretModel[4] = new ModelRendererTurbo(this, 1017, 25, textureX, textureY); // Box 294
		turretModel[5] = new ModelRendererTurbo(this, 1017, 17, textureX, textureY); // Box 295
		turretModel[6] = new ModelRendererTurbo(this, 153, 113, textureX, textureY); // Box 341
		turretModel[7] = new ModelRendererTurbo(this, 177, 113, textureX, textureY); // Box 342
		turretModel[8] = new ModelRendererTurbo(this, 1017, 81, textureX, textureY); // Box 343
		turretModel[9] = new ModelRendererTurbo(this, 561, 89, textureX, textureY); // Box 344
		turretModel[10] = new ModelRendererTurbo(this, 705, 81, textureX, textureY); // Box 345
		turretModel[11] = new ModelRendererTurbo(this, 833, 89, textureX, textureY); // Box 346
		turretModel[12] = new ModelRendererTurbo(this, 913, 89, textureX, textureY); // Box 347
		turretModel[13] = new ModelRendererTurbo(this, 777, 81, textureX, textureY); // Box 348
		turretModel[14] = new ModelRendererTurbo(this, 569, 73, textureX, textureY); // Box 350
		turretModel[15] = new ModelRendererTurbo(this, 1, 89, textureX, textureY); // Box 351

		turretModel[0].addShapeBox(-6.7F, 0.7F, -3.5F, 1, 1, 7, 0F,0F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0.5F, 0.1F, 0F, 0F, 0.1F, 0F, 0F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F); // Body
		turretModel[0].setRotationPoint(1F, -31F, 0F);

		turretModel[1].addShapeBox(2F, -7.5F, -2.5F, 11, 1, 5, 0F,0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F); // Body
		turretModel[1].setRotationPoint(1F, -31F, 0F);
		turretModel[1].rotateAngleZ = 2.0943951F;

		turretModel[2].addShapeBox(2F, -7.5F, 2.5F, 11, 1, 4, 0F,0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.75F, 0F, -0.5F); // Body
		turretModel[2].setRotationPoint(1F, -31F, 0F);
		turretModel[2].rotateAngleZ = 2.0943951F;

		turretModel[3].addShapeBox(2F, -7.5F, -6.5F, 11, 1, 4, 0F,-2.75F, 0F, -0.5F, -2.75F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -2.75F, 0F, -0.5F, -2.755F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F); // Body
		turretModel[3].setRotationPoint(1F, -31F, 0F);
		turretModel[3].rotateAngleZ = 2.0943951F;

		turretModel[4].addShapeBox(15F, -4F, -0.5F, 1, 4, 1, 0F,0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 1F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F); // Box 294
		turretModel[4].setRotationPoint(1F, -31F, 0F);

		turretModel[5].addShapeBox(15F, -2.5F, -0.5F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 295
		turretModel[5].setRotationPoint(1F, -31F, 0F);

		turretModel[6].addShapeBox(4F, -1F, 6.5F, 7, 1, 1, 0F,0.2F, 1F, 0F, 0.2F, 2F, 0F, 0.2F, 2F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 1F, 0F); // Box 341
		turretModel[6].setRotationPoint(1F, -31F, 0F);
		turretModel[6].rotateAngleY = -0.52359878F;

		turretModel[7].addShapeBox(4F, -1F, -7.5F, 7, 1, 1, 0F,0.2F, 1F, 0F, 0.2F, 2F, 0F, 0.2F, 2F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, 0.2F, -1F, 0F, 0.2F, -1F, 0F, 0.2F, 1F, 0F); // Box 342
		turretModel[7].setRotationPoint(1F, -31F, 0F);
		turretModel[7].rotateAngleY = 0.52359878F;

		turretModel[8].addShapeBox(1.6F, -1F, -7.5F, 2, 3, 1, 0F,-0.8F, 0F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 343
		turretModel[8].setRotationPoint(1F, -31F, 0F);
		turretModel[8].rotateAngleY = 0.52359878F;

		turretModel[9].addShapeBox(1.6F, -1F, 6.5F, 2, 3, 1, 0F,-0.8F, 0F, 0F, 0.2F, 1F, 0F, 0.2F, 1F, 0F, -0.8F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F); // Box 344
		turretModel[9].setRotationPoint(1F, -31F, 0F);
		turretModel[9].rotateAngleY = -0.52359878F;

		turretModel[10].addShapeBox(15F, -2F, -0.5F, 1, 1, 1, 0F,0.5F, 1.25F, 0.5F, 0.5F, 1.25F, 0.5F, 0.5F, 1.25F, 0.5F, 0.5F, 1.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F, 0.5F, 0.25F, 0.5F); // Box 345
		turretModel[10].setRotationPoint(1F, -31F, 0F);

		turretModel[11].addShapeBox(11F, -2F, -0.5F, 2, 1, 1, 0F,0F, 1.1F, 0.25F, 0F, 1.1F, 0.25F, 0F, 1.1F, 0.25F, 0F, 1.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F, 0F, 0.1F, 0.25F); // Box 346
		turretModel[11].setRotationPoint(3F, -31F, 0F);

		turretModel[12].addShapeBox(10.5F, -6.6F, -2.25F, 2, 2, 1, 0F,0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F, 0.25F); // Box 347
		turretModel[12].setRotationPoint(1F, -31F, 0F);

		turretModel[13].addShapeBox(11.75F, 5.8F, -2F, 1, 4, 1, 0F,0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.3F, -0.05F, -0.25F, 0.25F, 0.26F, -0.25F, 0.25F, 0.26F, -0.25F, 0.3F, -0.05F, -0.25F); // Box 348
		turretModel[13].setRotationPoint(1F, -31F, 0F);
		turretModel[13].rotateAngleZ = 0.85521133F;

		turretModel[14].addShapeBox(14.87F, -2.95F, -2F, 1, 1, 3, 0F,0F, -0.7F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, 0.75F, 0F, -0.7F, 0.75F, -0.25F, 1F, -0.25F, 0.25F, 0.5F, -0.25F, 0.25F, 0.5F, 0.75F, -0.25F, 1F, 0.75F); // Box 350
		turretModel[14].setRotationPoint(1F, -31F, 0F);

		turretModel[15].addShapeBox(11.75F, 5.8F, 1F, 1, 4, 1, 0F,0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.25F, 0.25F, -0.25F, 0.3F, -0.05F, -0.25F, 0.25F, 0.26F, -0.25F, 0.25F, 0.26F, -0.25F, 0.3F, -0.05F, -0.25F); // Box 351
		turretModel[15].setRotationPoint(1F, -31F, 0F);
		turretModel[15].rotateAngleZ = 0.85521133F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 345, 73, textureX, textureY); // Box 0
		barrelModel[1] = new ModelRendererTurbo(this, 457, 41, textureX, textureY); // Box 1
		barrelModel[2] = new ModelRendererTurbo(this, 593, 41, textureX, textureY); // Box 2
		barrelModel[3] = new ModelRendererTurbo(this, 265, 17, textureX, textureY); // Box 3
		barrelModel[4] = new ModelRendererTurbo(this, 385, 25, textureX, textureY); // Box 4
		barrelModel[5] = new ModelRendererTurbo(this, 649, 49, textureX, textureY); // Box 5
		barrelModel[6] = new ModelRendererTurbo(this, 353, 33, textureX, textureY); // Box 6
		barrelModel[7] = new ModelRendererTurbo(this, 729, 49, textureX, textureY); // Box 7
		barrelModel[8] = new ModelRendererTurbo(this, 809, 49, textureX, textureY); // Box 8
		barrelModel[9] = new ModelRendererTurbo(this, 913, 49, textureX, textureY); // Box 9
		barrelModel[10] = new ModelRendererTurbo(this, 529, 57, textureX, textureY); // Box 10
		barrelModel[11] = new ModelRendererTurbo(this, 865, 57, textureX, textureY); // Box 11
		barrelModel[12] = new ModelRendererTurbo(this, 1001, 57, textureX, textureY); // Box 12
		barrelModel[13] = new ModelRendererTurbo(this, 409, 33, textureX, textureY); // Box 13
		barrelModel[14] = new ModelRendererTurbo(this, 649, 33, textureX, textureY); // Box 14
		barrelModel[15] = new ModelRendererTurbo(this, 665, 33, textureX, textureY); // Box 15
		barrelModel[16] = new ModelRendererTurbo(this, 769, 33, textureX, textureY); // Box 16
		barrelModel[17] = new ModelRendererTurbo(this, 849, 33, textureX, textureY); // Box 17
		barrelModel[18] = new ModelRendererTurbo(this, 249, 41, textureX, textureY); // Box 18
		barrelModel[19] = new ModelRendererTurbo(this, 865, 41, textureX, textureY); // Box 19
		barrelModel[20] = new ModelRendererTurbo(this, 273, 49, textureX, textureY); // Box 20
		barrelModel[21] = new ModelRendererTurbo(this, 665, 49, textureX, textureY); // Box 21
		barrelModel[22] = new ModelRendererTurbo(this, 353, 25, textureX, textureY); // Box 22
		barrelModel[23] = new ModelRendererTurbo(this, 569, 33, textureX, textureY); // Box 23
		barrelModel[24] = new ModelRendererTurbo(this, 697, 33, textureX, textureY); // Box 24
		barrelModel[25] = new ModelRendererTurbo(this, 769, 57, textureX, textureY); // Box 25
		barrelModel[26] = new ModelRendererTurbo(this, 481, 41, textureX, textureY); // Box 35
		barrelModel[27] = new ModelRendererTurbo(this, 1009, 41, textureX, textureY); // Box 36
		barrelModel[28] = new ModelRendererTurbo(this, 953, 57, textureX, textureY); // Box 37
		barrelModel[29] = new ModelRendererTurbo(this, 849, 49, textureX, textureY); // Box 38
		barrelModel[30] = new ModelRendererTurbo(this, 273, 57, textureX, textureY); // Box 42
		barrelModel[31] = new ModelRendererTurbo(this, 577, 57, textureX, textureY); // Box 44
		barrelModel[32] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 45
		barrelModel[33] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 46
		barrelModel[34] = new ModelRendererTurbo(this, 849, 57, textureX, textureY); // Box 47
		barrelModel[35] = new ModelRendererTurbo(this, 977, 57, textureX, textureY); // Box 48
		barrelModel[36] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 49
		barrelModel[37] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 50
		barrelModel[38] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 51
		barrelModel[39] = new ModelRendererTurbo(this, 17, 65, textureX, textureY); // Box 52
		barrelModel[40] = new ModelRendererTurbo(this, 209, 65, textureX, textureY); // Box 53
		barrelModel[41] = new ModelRendererTurbo(this, 25, 65, textureX, textureY); // Box 54
		barrelModel[42] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 55
		barrelModel[43] = new ModelRendererTurbo(this, 233, 65, textureX, textureY); // Box 56
		barrelModel[44] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 57
		barrelModel[45] = new ModelRendererTurbo(this, 265, 65, textureX, textureY); // Box 58
		barrelModel[46] = new ModelRendererTurbo(this, 521, 65, textureX, textureY); // Box 59
		barrelModel[47] = new ModelRendererTurbo(this, 545, 65, textureX, textureY); // Box 62
		barrelModel[48] = new ModelRendererTurbo(this, 457, 81, textureX, textureY); // Box 63
		barrelModel[49] = new ModelRendererTurbo(this, 609, 65, textureX, textureY); // Box 64
		barrelModel[50] = new ModelRendererTurbo(this, 273, 65, textureX, textureY); // Box 65
		barrelModel[51] = new ModelRendererTurbo(this, 633, 65, textureX, textureY); // Box 66
		barrelModel[52] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 67
		barrelModel[53] = new ModelRendererTurbo(this, 785, 65, textureX, textureY); // Box 69
		barrelModel[54] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 70
		barrelModel[55] = new ModelRendererTurbo(this, 809, 65, textureX, textureY); // Box 71
		barrelModel[56] = new ModelRendererTurbo(this, 481, 81, textureX, textureY); // Box 72
		barrelModel[57] = new ModelRendererTurbo(this, 505, 81, textureX, textureY); // Box 74
		barrelModel[58] = new ModelRendererTurbo(this, 305, 73, textureX, textureY); // Box 75
		barrelModel[59] = new ModelRendererTurbo(this, 377, 73, textureX, textureY); // Box 76
		barrelModel[60] = new ModelRendererTurbo(this, 521, 73, textureX, textureY); // Box 77
		barrelModel[61] = new ModelRendererTurbo(this, 561, 73, textureX, textureY); // Box 78
		barrelModel[62] = new ModelRendererTurbo(this, 609, 73, textureX, textureY); // Box 79
		barrelModel[63] = new ModelRendererTurbo(this, 41, 113, textureX, textureY); // Box 332
		barrelModel[64] = new ModelRendererTurbo(this, 57, 113, textureX, textureY); // Box 333
		barrelModel[65] = new ModelRendererTurbo(this, 73, 113, textureX, textureY); // Box 334
		barrelModel[66] = new ModelRendererTurbo(this, 793, 89, textureX, textureY); // Box 352

		barrelModel[0].addShapeBox(-11.8F, -1.5F, -1F, 13, 2, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0.3F, 0.05F, 0F, 0F, 0.05F, 0F); // Box 0
		barrelModel[0].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[1].addShapeBox(-11.8F, -2.5F, -1F, 9, 1, 2, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F); // Box 1
		barrelModel[1].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[2].addShapeBox(-6F, -3.2F, -1F, 4, 1, 2, 0F,0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 2
		barrelModel[2].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[3].addShapeBox(-1.7F, -3.2F, -1F, 1, 1, 2, 0F,0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0.3F, -0.3F, 0.1F, 0F, -0.3F, 0.1F); // Box 3
		barrelModel[3].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[4].addShapeBox(-0.399999999999999F, -3.2F, -1F, 1, 1, 2, 0F,0F, -0.3F, 0.1F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.1F, 0F, -0.3F, 0.1F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, 0.1F); // Box 4
		barrelModel[4].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[5].addShapeBox(-11.8F, -3.2F, -1F, 5, 1, 2, 0F,0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 5
		barrelModel[5].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[6].addShapeBox(0.600000000000001F, -3.2F, -1F, 1, 2, 2, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 6
		barrelModel[6].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[7].addShapeBox(-11.8F, -0.2F, -1F, 5, 1, 2, 0F,0F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0.8F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 7
		barrelModel[7].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[8].addShapeBox(-3.3F, -0.2F, -1F, 4, 1, 2, 0F,0.4F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.8F, 0.5F, 0.2F, 0.4F, 0.5F, 0.2F, 0.4F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.8F, -0.3F, 0.2F, 0.4F, -0.3F, 0.2F); // Box 8
		barrelModel[8].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[9].addShapeBox(-7.3F, -0.2F, 0.5F, 4, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, 0F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, -1F, -0.3F, 0.2F); // Box 9
		barrelModel[9].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[10].addShapeBox(-7.3F, -0.2F, -1.5F, 4, 1, 1, 0F,-1F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, 0F, 0F, 0.2F, -1F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F, 0F, -0.3F, 0.2F); // Box 10
		barrelModel[10].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[11].addShapeBox(-11.5F, -1.8F, -1F, 6, 1, 2, 0F,0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 11
		barrelModel[11].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[12].addShapeBox(-11.5F, -1.1F, -1F, 6, 1, 2, 0F,0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0.8F, -0.4F, 0.1F, 0F, -0.4F, 0.1F); // Box 12
		barrelModel[12].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[13].addShapeBox(-7.2F, -2F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 13
		barrelModel[13].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[14].addShapeBox(-6.2F, -2F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 14
		barrelModel[14].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[15].addShapeBox(-8.6F, -2F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 15
		barrelModel[15].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[16].addShapeBox(-11.6F, -2F, -1F, 1, 1, 2, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 16
		barrelModel[16].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[17].addShapeBox(-11.6F, -0.7F, -1F, 1, 1, 2, 0F,-0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.2F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F, -0.1F, -0.4F, 0.1F); // Box 17
		barrelModel[17].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[18].addShapeBox(-11.9F, -1.3F, -1F, 1, 1, 2, 0F,-0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F, -0.4F, -0.4F, 0.1F); // Box 18
		barrelModel[18].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[19].addShapeBox(-8.6F, -0.7F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 19
		barrelModel[19].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[20].addShapeBox(-7.2F, -0.7F, -1F, 1, 1, 2, 0F,-0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F); // Box 20
		barrelModel[20].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[21].addShapeBox(-6.2F, -0.9F, -1F, 1, 1, 2, 0F,-0.2F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, 0.5F, -0.4F, 0.1F, -0.2F, -0.4F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F, -0.2F, -0.2F, 0.1F); // Box 21
		barrelModel[21].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[22].addShapeBox(-5.4F, -2.7F, 0.8F, 1, 2, 1, 0F,-0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.6F, -0.4F, -0.6F, -0.4F, -0.4F, -0.6F, -0.4F, -0.4F, 0.2F, -0.6F, -0.4F); // Box 22
		barrelModel[22].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[23].addShapeBox(-5.8F, -1.3F, 0.8F, 1, 1, 1, 0F,-0.2F, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F); // Box 23
		barrelModel[23].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[24].addShapeBox(-5.8F, -1.3F, 0.8F, 1, 1, 1, 0F,-0.2F, -0.2F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.2F, -0.4F, -0.2F, -0.4F, -0.4F); // Box 24
		barrelModel[24].setRotationPoint(15.9F, -35.5F, 0F);

		barrelModel[25].addShapeBox(-5.4F, -3F, 0.8F, 1, 1, 3, 0F,-0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.4F, -0.25F, -0.25F, -0.2F, -0.25F, -0.25F, -0.2F); // Box 25
		barrelModel[25].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[26].addShapeBox(-14F, -2.8F, 1F, 1, 3, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 35
		barrelModel[26].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[27].addShapeBox(-14F, -2.8F, -2F, 1, 3, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F); // Box 36
		barrelModel[27].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[28].addShapeBox(-14F, -1.6F, -0.5F, 3, 1, 1, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 37
		barrelModel[28].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[29].addShapeBox(-12.7F, -3.2F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F); // Box 38
		barrelModel[29].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[30].addShapeBox(-13.7F, -3.2F, 0.8F, 2, 1, 1, 0F,0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F); // Box 42
		barrelModel[30].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[31].addShapeBox(-13.7F, -3.2F, -1.8F, 2, 1, 1, 0F,0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F); // Box 44
		barrelModel[31].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[32].addShapeBox(-14F, -3.2F, 1F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 45
		barrelModel[32].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[33].addShapeBox(-14F, -3.2F, -2F, 1, 1, 1, 0F,-0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F, -0.2F, -0.3F, -0.2F); // Box 46
		barrelModel[33].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[34].addShapeBox(-13.7F, -3.2F, -1.8F, 2, 1, 1, 0F,0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, 0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F); // Box 47
		barrelModel[34].setRotationPoint(16.5F, -32.5F, 0F);

		barrelModel[35].addShapeBox(-13.7F, -3.2F, 0.8F, 2, 1, 1, 0F,0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F, 0.1F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, 0.1F, -0.4F, -0.1F); // Box 48
		barrelModel[35].setRotationPoint(16.5F, -32.5F, 0F);

		barrelModel[36].addShapeBox(-12.7F, -3.2F, -1F, 1, 1, 2, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F); // Box 49
		barrelModel[36].setRotationPoint(16.5F, -32.5F, 0F);

		barrelModel[37].addShapeBox(-13.4F, -2.5F, 0.3F, 2, 1, 1, 0F,-0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F, -0.3F, -0.4F, -0.3F, -0.1F, -0.4F, -0.1F, -0.4F, -0.4F, -0.5F, -0.4F, -0.4F, -0.4F); // Box 50
		barrelModel[37].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[38].addShapeBox(-12.4F, -2.5F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, 0F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, -0.1F, -0.1F, -0.4F, 0F); // Box 51
		barrelModel[38].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[39].addShapeBox(-13.4F, -2.5F, -1.3F, 2, 1, 1, 0F,-0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F, -0.3F, -0.4F, -0.4F, -0.4F, -0.4F, -0.4F, -0.5F, -0.1F, -0.4F, -0.1F, -0.3F, -0.4F, -0.3F); // Box 52
		barrelModel[39].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[40].addShapeBox(-11.2F, -3.45F, -0.5F, 3, 1, 1, 0F,0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0.8F, -0.3F, 0F, 0F, -0.3F, 0F); // Box 53
		barrelModel[40].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[41].addShapeBox(-10.2F, -3.9F, -0.9F, 1, 1, 1, 0F,0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 54
		barrelModel[41].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[42].addShapeBox(-10.2F, -3.9F, -0.1F, 1, 1, 1, 0F,0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0.6F, -0.3F, -0.4F, 0F, -0.3F, -0.4F); // Box 55
		barrelModel[42].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[43].addShapeBox(-9.9F, -3.6F, -0.5F, 1, 1, 1, 0F,0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F, 0F, -0.3F, -0.2F); // Box 56
		barrelModel[43].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[44].addShapeBox(-10.4F, -3.9F, -1.1F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 57
		barrelModel[44].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[45].addShapeBox(-10.4F, -3.9F, 0.1F, 1, 1, 1, 0F,-0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F, -0.35F, -0.35F, -0.4F); // Box 58
		barrelModel[45].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[46].addShapeBox(1.9F, -2.3F, -1F, 5, 2, 2, 0F,0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F, 0.3F, -0.2F, -0.2F); // Box 59
		barrelModel[46].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[47].addShapeBox(4.9F, -2.3F, -1F, 5, 2, 2, 0F,0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F, 0.3F, -0.4F, -0.4F); // Box 62
		barrelModel[47].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[48].addShapeBox(7.9F, -2.3F, -1F, 13, 2, 2, 0F,0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F, 0.3F, -0.6F, -0.6F); // Box 63
		barrelModel[48].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[49].addShapeBox(21.9F, -2.3F, -1F, 2, 2, 2, 0F,0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F, 0.3F, -0.5F, -0.5F); // Box 64
		barrelModel[49].setRotationPoint(15.5F, -35.5F, 0F);

		barrelModel[50].addShapeBox(0.700000000000001F, -3.6F, -0.1F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 65
		barrelModel[50].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[51].addShapeBox(0.700000000000001F, -3.6F, -0.9F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 66
		barrelModel[51].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[52].addShapeBox(0.700000000000001F, -4F, -0.1F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 67
		barrelModel[52].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[53].addShapeBox(0.700000000000001F, -4F, -0.9F, 1, 1, 1, 0F,-0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.7F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.2F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F, -0.1F, -0.3F, -0.45F); // Box 69
		barrelModel[53].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[54].addShapeBox(0.700000000000001F, -4.15F, -0.5F, 1, 1, 1, 0F,-0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F, -0.1F, -0.45F, -0.7F); // Box 70
		barrelModel[54].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[55].addShapeBox(0.700000000000001F, -3.7F, -0.5F, 1, 1, 1, 0F,-0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F, -0.4F, -0.2F, -0.45F); // Box 71
		barrelModel[55].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[56].addShapeBox(-2.6F, -1F, 1.8F, 3, 5, 7, 0F,0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0.3F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 72
		barrelModel[56].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[57].addShapeBox(-2.6F, -1.7F, 1.8F, 3, 1, 7, 0F,0.1F, 0.7F, 0.1F, 0.4F, 0.7F, 0.1F, 0.4F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F, 0.1F, -1.3F, 0.1F, 0.4F, -1.3F, 0.1F, 0.4F, -0.3F, 0.1F, 0.1F, -0.3F, 0.1F); // Box 74
		barrelModel[57].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[58].addShapeBox(-2.4F, -1.7F, 1.6F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 75
		barrelModel[58].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[59].addShapeBox(-2.4F, -2F, 1.1F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 76
		barrelModel[59].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[60].addShapeBox(-2.4F, -2.5F, 0.6F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 77
		barrelModel[60].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[61].addShapeBox(-2.4F, -2.5F, 0F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 78
		barrelModel[61].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[62].addShapeBox(-2.4F, -2.5F, -1F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 79
		barrelModel[62].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[63].addShapeBox(-2.4F, -1.7F, 2.15F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 332
		barrelModel[63].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[64].addShapeBox(-2.4F, -1.7F, 2.7F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 333
		barrelModel[64].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[65].addShapeBox(-2.4F, -1.55F, 3.25F, 3, 1, 1, 0F,0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F, 0F, -0.25F, -0.25F); // Box 334
		barrelModel[65].setRotationPoint(16.5F, -35.5F, 0F);

		barrelModel[66].addShapeBox(-1.5F, -2.3F, 3.8F, 1, 1, 3, 0F,0F, 0F, 0.1F, 0F, 0F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.45F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.5F, 0.1F, 0F, -0.1F, 0.1F, 0F, -0.1F, 0.1F); // Box 352
		barrelModel[66].setRotationPoint(16.5F, -35.5F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 409, 49, textureX, textureY); // Box 242
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 1, 49, textureX, textureY); // Box 243
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 697, 49, textureX, textureY); // Box 244
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 777, 49, textureX, textureY); // Box 201
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 817, 49, textureX, textureY); // Box 202
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 881, 49, textureX, textureY); // Box 203

		leftTrackWheelModels[0].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 242
		leftTrackWheelModels[0].setRotationPoint(39.8F, -2.8F, 23.5F);

		leftTrackWheelModels[1].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 243
		leftTrackWheelModels[1].setRotationPoint(39.8F, -2.8F, 23.5F);

		leftTrackWheelModels[2].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 244
		leftTrackWheelModels[2].setRotationPoint(39.8F, -2.8F, 23.5F);

		leftTrackWheelModels[3].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 201
		leftTrackWheelModels[3].setRotationPoint(-35.8F, -1F, 23.5F);

		leftTrackWheelModels[4].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 202
		leftTrackWheelModels[4].setRotationPoint(-35.8F, -1F, 23.5F);

		leftTrackWheelModels[5].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 203
		leftTrackWheelModels[5].setRotationPoint(-35.8F, -1F, 23.5F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 913, 113, textureX, textureY); // Box 416
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 969, 113, textureX, textureY); // Box 417
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 313, 121, textureX, textureY); // Box 418
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 49, 121, textureX, textureY); // Box 425
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 153, 121, textureX, textureY); // Box 426
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 377, 121, textureX, textureY); // Box 427
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 729, 121, textureX, textureY); // Box 431
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 769, 121, textureX, textureY); // Box 432
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 801, 121, textureX, textureY); // Box 433
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 753, 113, textureX, textureY); // Box 434
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 841, 121, textureX, textureY); // Box 437
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 1, 129, textureX, textureY); // Box 438
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 33, 129, textureX, textureY); // Box 439
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 1001, 113, textureX, textureY); // Box 440
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 649, 121, textureX, textureY); // Box 441
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 97, 129, textureX, textureY); // Box 442
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 881, 113, textureX, textureY); // Box 443
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 121, 121, textureX, textureY); // Box 444
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 129, 121, textureX, textureY); // Box 445
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 137, 121, textureX, textureY); // Box 446
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 241, 121, textureX, textureY); // Box 449
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 185, 121, textureX, textureY); // Box 451
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 345, 121, textureX, textureY); // Box 453
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 209, 121, textureX, textureY); // Box 454
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 409, 121, textureX, textureY); // Box 455
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 417, 121, textureX, textureY); // Box 456
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 441, 121, textureX, textureY); // Box 457
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 497, 121, textureX, textureY); // Box 458
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 681, 121, textureX, textureY); // Box 459
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 705, 121, textureX, textureY); // Box 460
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 521, 121, textureX, textureY); // Box 461
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 713, 121, textureX, textureY); // Box 462
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 873, 121, textureX, textureY); // Box 463
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 169, 129, textureX, textureY); // Box 464
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 201, 129, textureX, textureY); // Box 465
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 897, 121, textureX, textureY); // Box 466
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 393, 129, textureX, textureY); // Box 467
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 881, 121, textureX, textureY); // Box 468
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 625, 121, textureX, textureY); // Box 469
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 1001, 121, textureX, textureY); // Box 470
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 1009, 121, textureX, textureY); // Box 471
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 1017, 121, textureX, textureY); // Box 472
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 761, 121, textureX, textureY); // Box 473
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 65, 129, textureX, textureY); // Box 474
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 441, 129, textureX, textureY); // Box 475
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 473, 129, textureX, textureY); // Box 476
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 657, 129, textureX, textureY); // Box 477
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 73, 129, textureX, textureY); // Box 478
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 233, 129, textureX, textureY); // Box 479
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 497, 129, textureX, textureY); // Box 480
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 241, 129, textureX, textureY); // Box 481
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 561, 129, textureX, textureY); // Box 482
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 297, 129, textureX, textureY); // Box 483
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 705, 129, textureX, textureY); // Box 484
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 377, 129, textureX, textureY); // Box 485
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 921, 129, textureX, textureY); // Box 486
		rightTrackWheelModels[56] = new ModelRendererTurbo(this, 969, 129, textureX, textureY); // Box 487
		rightTrackWheelModels[57] = new ModelRendererTurbo(this, 1, 137, textureX, textureY); // Box 488
		rightTrackWheelModels[58] = new ModelRendererTurbo(this, 305, 129, textureX, textureY); // Box 489
		rightTrackWheelModels[59] = new ModelRendererTurbo(this, 33, 137, textureX, textureY); // Box 490
		rightTrackWheelModels[60] = new ModelRendererTurbo(this, 65, 137, textureX, textureY); // Box 491
		rightTrackWheelModels[61] = new ModelRendererTurbo(this, 713, 129, textureX, textureY); // Box 492
		rightTrackWheelModels[62] = new ModelRendererTurbo(this, 97, 137, textureX, textureY); // Box 493
		rightTrackWheelModels[63] = new ModelRendererTurbo(this, 841, 129, textureX, textureY); // Box 494
		rightTrackWheelModels[64] = new ModelRendererTurbo(this, 849, 129, textureX, textureY); // Box 495
		rightTrackWheelModels[65] = new ModelRendererTurbo(this, 1001, 129, textureX, textureY); // Box 496
		rightTrackWheelModels[66] = new ModelRendererTurbo(this, 1009, 129, textureX, textureY); // Box 497
		rightTrackWheelModels[67] = new ModelRendererTurbo(this, 1017, 129, textureX, textureY); // Box 498
		rightTrackWheelModels[68] = new ModelRendererTurbo(this, 129, 137, textureX, textureY); // Box 499
		rightTrackWheelModels[69] = new ModelRendererTurbo(this, 145, 137, textureX, textureY); // Box 500
		rightTrackWheelModels[70] = new ModelRendererTurbo(this, 153, 137, textureX, textureY); // Box 501
		rightTrackWheelModels[71] = new ModelRendererTurbo(this, 185, 137, textureX, textureY); // Box 502
		rightTrackWheelModels[72] = new ModelRendererTurbo(this, 393, 137, textureX, textureY); // Box 503
		rightTrackWheelModels[73] = new ModelRendererTurbo(this, 441, 137, textureX, textureY); // Box 504
		rightTrackWheelModels[74] = new ModelRendererTurbo(this, 449, 137, textureX, textureY); // Box 505
		rightTrackWheelModels[75] = new ModelRendererTurbo(this, 457, 137, textureX, textureY); // Box 506
		rightTrackWheelModels[76] = new ModelRendererTurbo(this, 465, 137, textureX, textureY); // Box 507
		rightTrackWheelModels[77] = new ModelRendererTurbo(this, 481, 137, textureX, textureY); // Box 508
		rightTrackWheelModels[78] = new ModelRendererTurbo(this, 489, 137, textureX, textureY); // Box 509
		rightTrackWheelModels[79] = new ModelRendererTurbo(this, 497, 137, textureX, textureY); // Box 510
		rightTrackWheelModels[80] = new ModelRendererTurbo(this, 561, 137, textureX, textureY); // Box 511
		rightTrackWheelModels[81] = new ModelRendererTurbo(this, 577, 137, textureX, textureY); // Box 512
		rightTrackWheelModels[82] = new ModelRendererTurbo(this, 625, 137, textureX, textureY); // Box 513
		rightTrackWheelModels[83] = new ModelRendererTurbo(this, 657, 137, textureX, textureY); // Box 514
		rightTrackWheelModels[84] = new ModelRendererTurbo(this, 705, 137, textureX, textureY); // Box 515
		rightTrackWheelModels[85] = new ModelRendererTurbo(this, 713, 137, textureX, textureY); // Box 516
		rightTrackWheelModels[86] = new ModelRendererTurbo(this, 745, 137, textureX, textureY); // Box 517
		rightTrackWheelModels[87] = new ModelRendererTurbo(this, 777, 137, textureX, textureY); // Box 518
		rightTrackWheelModels[88] = new ModelRendererTurbo(this, 793, 137, textureX, textureY); // Box 519
		rightTrackWheelModels[89] = new ModelRendererTurbo(this, 825, 137, textureX, textureY); // Box 520
		rightTrackWheelModels[90] = new ModelRendererTurbo(this, 833, 137, textureX, textureY); // Box 521
		rightTrackWheelModels[91] = new ModelRendererTurbo(this, 849, 137, textureX, textureY); // Box 522
		rightTrackWheelModels[92] = new ModelRendererTurbo(this, 857, 137, textureX, textureY); // Box 523
		rightTrackWheelModels[93] = new ModelRendererTurbo(this, 921, 137, textureX, textureY); // Box 524
		rightTrackWheelModels[94] = new ModelRendererTurbo(this, 929, 137, textureX, textureY); // Box 525
		rightTrackWheelModels[95] = new ModelRendererTurbo(this, 945, 137, textureX, textureY); // Box 526
		rightTrackWheelModels[96] = new ModelRendererTurbo(this, 969, 137, textureX, textureY); // Box 527
		rightTrackWheelModels[97] = new ModelRendererTurbo(this, 1001, 137, textureX, textureY); // Box 528
		rightTrackWheelModels[98] = new ModelRendererTurbo(this, 1, 145, textureX, textureY); // Box 529
		rightTrackWheelModels[99] = new ModelRendererTurbo(this, 33, 145, textureX, textureY); // Box 530
		rightTrackWheelModels[100] = new ModelRendererTurbo(this, 41, 145, textureX, textureY); // Box 531
		rightTrackWheelModels[101] = new ModelRendererTurbo(this, 49, 145, textureX, textureY); // Box 532
		rightTrackWheelModels[102] = new ModelRendererTurbo(this, 57, 145, textureX, textureY); // Box 533
		rightTrackWheelModels[103] = new ModelRendererTurbo(this, 73, 145, textureX, textureY); // Box 534
		rightTrackWheelModels[104] = new ModelRendererTurbo(this, 81, 145, textureX, textureY); // Box 535
		rightTrackWheelModels[105] = new ModelRendererTurbo(this, 89, 145, textureX, textureY); // Box 536
		rightTrackWheelModels[106] = new ModelRendererTurbo(this, 97, 145, textureX, textureY); // Box 537
		rightTrackWheelModels[107] = new ModelRendererTurbo(this, 113, 145, textureX, textureY); // Box 538
		rightTrackWheelModels[108] = new ModelRendererTurbo(this, 145, 145, textureX, textureY); // Box 539
		rightTrackWheelModels[109] = new ModelRendererTurbo(this, 177, 145, textureX, textureY); // Box 540
		rightTrackWheelModels[110] = new ModelRendererTurbo(this, 209, 145, textureX, textureY); // Box 541
		rightTrackWheelModels[111] = new ModelRendererTurbo(this, 217, 145, textureX, textureY); // Box 542
		rightTrackWheelModels[112] = new ModelRendererTurbo(this, 249, 145, textureX, textureY); // Box 543
		rightTrackWheelModels[113] = new ModelRendererTurbo(this, 281, 145, textureX, textureY); // Box 544
		rightTrackWheelModels[114] = new ModelRendererTurbo(this, 297, 145, textureX, textureY); // Box 545
		rightTrackWheelModels[115] = new ModelRendererTurbo(this, 329, 145, textureX, textureY); // Box 546
		rightTrackWheelModels[116] = new ModelRendererTurbo(this, 553, 145, textureX, textureY); // Box 547
		rightTrackWheelModels[117] = new ModelRendererTurbo(this, 337, 145, textureX, textureY); // Box 548
		rightTrackWheelModels[118] = new ModelRendererTurbo(this, 569, 145, textureX, textureY); // Box 549
		rightTrackWheelModels[119] = new ModelRendererTurbo(this, 737, 145, textureX, textureY); // Box 550
		rightTrackWheelModels[120] = new ModelRendererTurbo(this, 745, 145, textureX, textureY); // Box 551
		rightTrackWheelModels[121] = new ModelRendererTurbo(this, 761, 145, textureX, textureY); // Box 552
		rightTrackWheelModels[122] = new ModelRendererTurbo(this, 769, 145, textureX, textureY); // Box 553
		rightTrackWheelModels[123] = new ModelRendererTurbo(this, 801, 145, textureX, textureY); // Box 554
		rightTrackWheelModels[124] = new ModelRendererTurbo(this, 825, 145, textureX, textureY); // Box 555
		rightTrackWheelModels[125] = new ModelRendererTurbo(this, 857, 145, textureX, textureY); // Box 556
		rightTrackWheelModels[126] = new ModelRendererTurbo(this, 1001, 145, textureX, textureY); // Box 557
		rightTrackWheelModels[127] = new ModelRendererTurbo(this, 1009, 145, textureX, textureY); // Box 558
		rightTrackWheelModels[128] = new ModelRendererTurbo(this, 1, 153, textureX, textureY); // Box 559
		rightTrackWheelModels[129] = new ModelRendererTurbo(this, 1017, 145, textureX, textureY); // Box 560
		rightTrackWheelModels[130] = new ModelRendererTurbo(this, 17, 153, textureX, textureY); // Box 561
		rightTrackWheelModels[131] = new ModelRendererTurbo(this, 25, 153, textureX, textureY); // Box 562
		rightTrackWheelModels[132] = new ModelRendererTurbo(this, 33, 153, textureX, textureY); // Box 563
		rightTrackWheelModels[133] = new ModelRendererTurbo(this, 49, 153, textureX, textureY); // Box 564
		rightTrackWheelModels[134] = new ModelRendererTurbo(this, 81, 153, textureX, textureY); // Box 565
		rightTrackWheelModels[135] = new ModelRendererTurbo(this, 113, 153, textureX, textureY); // Box 566
		rightTrackWheelModels[136] = new ModelRendererTurbo(this, 145, 153, textureX, textureY); // Box 567
		rightTrackWheelModels[137] = new ModelRendererTurbo(this, 153, 153, textureX, textureY); // Box 568
		rightTrackWheelModels[138] = new ModelRendererTurbo(this, 161, 153, textureX, textureY); // Box 569
		rightTrackWheelModels[139] = new ModelRendererTurbo(this, 177, 153, textureX, textureY); // Box 570
		rightTrackWheelModels[140] = new ModelRendererTurbo(this, 185, 153, textureX, textureY); // Box 571
		rightTrackWheelModels[141] = new ModelRendererTurbo(this, 193, 153, textureX, textureY); // Box 572
		rightTrackWheelModels[142] = new ModelRendererTurbo(this, 201, 153, textureX, textureY); // Box 573
		rightTrackWheelModels[143] = new ModelRendererTurbo(this, 217, 153, textureX, textureY); // Box 574
		rightTrackWheelModels[144] = new ModelRendererTurbo(this, 225, 153, textureX, textureY); // Box 575
		rightTrackWheelModels[145] = new ModelRendererTurbo(this, 257, 153, textureX, textureY); // Box 576
		rightTrackWheelModels[146] = new ModelRendererTurbo(this, 289, 153, textureX, textureY); // Box 577
		rightTrackWheelModels[147] = new ModelRendererTurbo(this, 321, 153, textureX, textureY); // Box 578
		rightTrackWheelModels[148] = new ModelRendererTurbo(this, 393, 153, textureX, textureY); // Box 579
		rightTrackWheelModels[149] = new ModelRendererTurbo(this, 417, 153, textureX, textureY); // Box 580
		rightTrackWheelModels[150] = new ModelRendererTurbo(this, 449, 153, textureX, textureY); // Box 581
		rightTrackWheelModels[151] = new ModelRendererTurbo(this, 337, 153, textureX, textureY); // Box 582
		rightTrackWheelModels[152] = new ModelRendererTurbo(this, 481, 153, textureX, textureY); // Box 583
		rightTrackWheelModels[153] = new ModelRendererTurbo(this, 489, 153, textureX, textureY); // Box 584
		rightTrackWheelModels[154] = new ModelRendererTurbo(this, 497, 153, textureX, textureY); // Box 585
		rightTrackWheelModels[155] = new ModelRendererTurbo(this, 505, 153, textureX, textureY); // Box 586
		rightTrackWheelModels[156] = new ModelRendererTurbo(this, 521, 153, textureX, textureY); // Box 587
		rightTrackWheelModels[157] = new ModelRendererTurbo(this, 529, 153, textureX, textureY); // Box 588
		rightTrackWheelModels[158] = new ModelRendererTurbo(this, 545, 153, textureX, textureY); // Box 589
		rightTrackWheelModels[159] = new ModelRendererTurbo(this, 553, 153, textureX, textureY); // Box 590
		rightTrackWheelModels[160] = new ModelRendererTurbo(this, 585, 153, textureX, textureY); // Box 591
		rightTrackWheelModels[161] = new ModelRendererTurbo(this, 617, 153, textureX, textureY); // Box 592
		rightTrackWheelModels[162] = new ModelRendererTurbo(this, 649, 153, textureX, textureY); // Box 593
		rightTrackWheelModels[163] = new ModelRendererTurbo(this, 665, 153, textureX, textureY); // Box 594
		rightTrackWheelModels[164] = new ModelRendererTurbo(this, 681, 153, textureX, textureY); // Box 595
		rightTrackWheelModels[165] = new ModelRendererTurbo(this, 689, 153, textureX, textureY); // Box 596
		rightTrackWheelModels[166] = new ModelRendererTurbo(this, 697, 153, textureX, textureY); // Box 597
		rightTrackWheelModels[167] = new ModelRendererTurbo(this, 705, 153, textureX, textureY); // Box 598
		rightTrackWheelModels[168] = new ModelRendererTurbo(this, 737, 153, textureX, textureY); // Box 599
		rightTrackWheelModels[169] = new ModelRendererTurbo(this, 745, 153, textureX, textureY); // Box 600
		rightTrackWheelModels[170] = new ModelRendererTurbo(this, 761, 153, textureX, textureY); // Box 601
		rightTrackWheelModels[171] = new ModelRendererTurbo(this, 769, 153, textureX, textureY); // Box 602
		rightTrackWheelModels[172] = new ModelRendererTurbo(this, 777, 153, textureX, textureY); // Box 603
		rightTrackWheelModels[173] = new ModelRendererTurbo(this, 809, 153, textureX, textureY); // Box 604
		rightTrackWheelModels[174] = new ModelRendererTurbo(this, 841, 153, textureX, textureY); // Box 605
		rightTrackWheelModels[175] = new ModelRendererTurbo(this, 873, 153, textureX, textureY); // Box 606
		rightTrackWheelModels[176] = new ModelRendererTurbo(this, 905, 153, textureX, textureY); // Box 607
		rightTrackWheelModels[177] = new ModelRendererTurbo(this, 929, 153, textureX, textureY); // Box 608
		rightTrackWheelModels[178] = new ModelRendererTurbo(this, 937, 153, textureX, textureY); // Box 609
		rightTrackWheelModels[179] = new ModelRendererTurbo(this, 945, 153, textureX, textureY); // Box 610
		rightTrackWheelModels[180] = new ModelRendererTurbo(this, 977, 153, textureX, textureY); // Box 611
		rightTrackWheelModels[181] = new ModelRendererTurbo(this, 985, 153, textureX, textureY); // Box 612
		rightTrackWheelModels[182] = new ModelRendererTurbo(this, 993, 153, textureX, textureY); // Box 613
		rightTrackWheelModels[183] = new ModelRendererTurbo(this, 1001, 153, textureX, textureY); // Box 614
		rightTrackWheelModels[184] = new ModelRendererTurbo(this, 1, 161, textureX, textureY); // Box 615
		rightTrackWheelModels[185] = new ModelRendererTurbo(this, 17, 161, textureX, textureY); // Box 616
		rightTrackWheelModels[186] = new ModelRendererTurbo(this, 49, 161, textureX, textureY); // Box 617
		rightTrackWheelModels[187] = new ModelRendererTurbo(this, 1017, 153, textureX, textureY); // Box 618
		rightTrackWheelModels[188] = new ModelRendererTurbo(this, 81, 161, textureX, textureY); // Box 619
		rightTrackWheelModels[189] = new ModelRendererTurbo(this, 97, 161, textureX, textureY); // Box 620
		rightTrackWheelModels[190] = new ModelRendererTurbo(this, 113, 161, textureX, textureY); // Box 621
		rightTrackWheelModels[191] = new ModelRendererTurbo(this, 121, 161, textureX, textureY); // Box 622
		rightTrackWheelModels[192] = new ModelRendererTurbo(this, 129, 161, textureX, textureY); // Box 623
		rightTrackWheelModels[193] = new ModelRendererTurbo(this, 137, 161, textureX, textureY); // Box 624
		rightTrackWheelModels[194] = new ModelRendererTurbo(this, 169, 161, textureX, textureY); // Box 625
		rightTrackWheelModels[195] = new ModelRendererTurbo(this, 177, 161, textureX, textureY); // Box 626
		rightTrackWheelModels[196] = new ModelRendererTurbo(this, 193, 161, textureX, textureY); // Box 627
		rightTrackWheelModels[197] = new ModelRendererTurbo(this, 201, 161, textureX, textureY); // Box 628
		rightTrackWheelModels[198] = new ModelRendererTurbo(this, 209, 161, textureX, textureY); // Box 629
		rightTrackWheelModels[199] = new ModelRendererTurbo(this, 241, 161, textureX, textureY); // Box 630
		rightTrackWheelModels[200] = new ModelRendererTurbo(this, 273, 161, textureX, textureY); // Box 631
		rightTrackWheelModels[201] = new ModelRendererTurbo(this, 305, 161, textureX, textureY); // Box 632
		rightTrackWheelModels[202] = new ModelRendererTurbo(this, 337, 161, textureX, textureY); // Box 633
		rightTrackWheelModels[203] = new ModelRendererTurbo(this, 361, 161, textureX, textureY); // Box 634
		rightTrackWheelModels[204] = new ModelRendererTurbo(this, 369, 161, textureX, textureY); // Box 635
		rightTrackWheelModels[205] = new ModelRendererTurbo(this, 377, 161, textureX, textureY); // Box 636
		rightTrackWheelModels[206] = new ModelRendererTurbo(this, 409, 161, textureX, textureY); // Box 637
		rightTrackWheelModels[207] = new ModelRendererTurbo(this, 417, 161, textureX, textureY); // Box 638
		rightTrackWheelModels[208] = new ModelRendererTurbo(this, 425, 161, textureX, textureY); // Box 639
		rightTrackWheelModels[209] = new ModelRendererTurbo(this, 433, 161, textureX, textureY); // Box 640
		rightTrackWheelModels[210] = new ModelRendererTurbo(this, 449, 161, textureX, textureY); // Box 641
		rightTrackWheelModels[211] = new ModelRendererTurbo(this, 465, 161, textureX, textureY); // Box 642
		rightTrackWheelModels[212] = new ModelRendererTurbo(this, 497, 161, textureX, textureY); // Box 643
		rightTrackWheelModels[213] = new ModelRendererTurbo(this, 529, 161, textureX, textureY); // Box 644
		rightTrackWheelModels[214] = new ModelRendererTurbo(this, 537, 161, textureX, textureY); // Box 645
		rightTrackWheelModels[215] = new ModelRendererTurbo(this, 553, 161, textureX, textureY); // Box 646
		rightTrackWheelModels[216] = new ModelRendererTurbo(this, 569, 161, textureX, textureY); // Box 647
		rightTrackWheelModels[217] = new ModelRendererTurbo(this, 577, 161, textureX, textureY); // Box 648
		rightTrackWheelModels[218] = new ModelRendererTurbo(this, 585, 161, textureX, textureY); // Box 649
		rightTrackWheelModels[219] = new ModelRendererTurbo(this, 593, 161, textureX, textureY); // Box 650
		rightTrackWheelModels[220] = new ModelRendererTurbo(this, 625, 161, textureX, textureY); // Box 651
		rightTrackWheelModels[221] = new ModelRendererTurbo(this, 633, 161, textureX, textureY); // Box 652
		rightTrackWheelModels[222] = new ModelRendererTurbo(this, 649, 161, textureX, textureY); // Box 653
		rightTrackWheelModels[223] = new ModelRendererTurbo(this, 657, 161, textureX, textureY); // Box 654
		rightTrackWheelModels[224] = new ModelRendererTurbo(this, 665, 161, textureX, textureY); // Box 655
		rightTrackWheelModels[225] = new ModelRendererTurbo(this, 697, 161, textureX, textureY); // Box 656
		rightTrackWheelModels[226] = new ModelRendererTurbo(this, 729, 161, textureX, textureY); // Box 657
		rightTrackWheelModels[227] = new ModelRendererTurbo(this, 761, 161, textureX, textureY); // Box 658
		rightTrackWheelModels[228] = new ModelRendererTurbo(this, 793, 161, textureX, textureY); // Box 659
		rightTrackWheelModels[229] = new ModelRendererTurbo(this, 817, 161, textureX, textureY); // Box 660
		rightTrackWheelModels[230] = new ModelRendererTurbo(this, 825, 161, textureX, textureY); // Box 661
		rightTrackWheelModels[231] = new ModelRendererTurbo(this, 833, 161, textureX, textureY); // Box 662
		rightTrackWheelModels[232] = new ModelRendererTurbo(this, 865, 161, textureX, textureY); // Box 663
		rightTrackWheelModels[233] = new ModelRendererTurbo(this, 873, 161, textureX, textureY); // Box 664
		rightTrackWheelModels[234] = new ModelRendererTurbo(this, 881, 161, textureX, textureY); // Box 665
		rightTrackWheelModels[235] = new ModelRendererTurbo(this, 889, 161, textureX, textureY); // Box 666
		rightTrackWheelModels[236] = new ModelRendererTurbo(this, 905, 161, textureX, textureY); // Box 667
		rightTrackWheelModels[237] = new ModelRendererTurbo(this, 921, 161, textureX, textureY); // Box 668
		rightTrackWheelModels[238] = new ModelRendererTurbo(this, 953, 161, textureX, textureY); // Box 669
		rightTrackWheelModels[239] = new ModelRendererTurbo(this, 985, 161, textureX, textureY); // Box 670
		rightTrackWheelModels[240] = new ModelRendererTurbo(this, 993, 161, textureX, textureY); // Box 671
		rightTrackWheelModels[241] = new ModelRendererTurbo(this, 1009, 161, textureX, textureY); // Box 672
		rightTrackWheelModels[242] = new ModelRendererTurbo(this, 1, 169, textureX, textureY); // Box 673
		rightTrackWheelModels[243] = new ModelRendererTurbo(this, 9, 169, textureX, textureY); // Box 674
		rightTrackWheelModels[244] = new ModelRendererTurbo(this, 17, 169, textureX, textureY); // Box 675
		rightTrackWheelModels[245] = new ModelRendererTurbo(this, 25, 169, textureX, textureY); // Box 676
		rightTrackWheelModels[246] = new ModelRendererTurbo(this, 57, 169, textureX, textureY); // Box 677
		rightTrackWheelModels[247] = new ModelRendererTurbo(this, 65, 169, textureX, textureY); // Box 678
		rightTrackWheelModels[248] = new ModelRendererTurbo(this, 81, 169, textureX, textureY); // Box 679
		rightTrackWheelModels[249] = new ModelRendererTurbo(this, 89, 169, textureX, textureY); // Box 680
		rightTrackWheelModels[250] = new ModelRendererTurbo(this, 97, 169, textureX, textureY); // Box 681
		rightTrackWheelModels[251] = new ModelRendererTurbo(this, 129, 169, textureX, textureY); // Box 682
		rightTrackWheelModels[252] = new ModelRendererTurbo(this, 161, 169, textureX, textureY); // Box 683
		rightTrackWheelModels[253] = new ModelRendererTurbo(this, 193, 169, textureX, textureY); // Box 684
		rightTrackWheelModels[254] = new ModelRendererTurbo(this, 225, 169, textureX, textureY); // Box 685
		rightTrackWheelModels[255] = new ModelRendererTurbo(this, 249, 169, textureX, textureY); // Box 686
		rightTrackWheelModels[256] = new ModelRendererTurbo(this, 257, 169, textureX, textureY); // Box 687
		rightTrackWheelModels[257] = new ModelRendererTurbo(this, 265, 169, textureX, textureY); // Box 688
		rightTrackWheelModels[258] = new ModelRendererTurbo(this, 297, 169, textureX, textureY); // Box 689
		rightTrackWheelModels[259] = new ModelRendererTurbo(this, 305, 169, textureX, textureY); // Box 690
		rightTrackWheelModels[260] = new ModelRendererTurbo(this, 313, 169, textureX, textureY); // Box 691
		rightTrackWheelModels[261] = new ModelRendererTurbo(this, 321, 169, textureX, textureY); // Box 692
		rightTrackWheelModels[262] = new ModelRendererTurbo(this, 337, 169, textureX, textureY); // Box 693
		rightTrackWheelModels[263] = new ModelRendererTurbo(this, 353, 169, textureX, textureY); // Box 694
		rightTrackWheelModels[264] = new ModelRendererTurbo(this, 385, 169, textureX, textureY); // Box 695
		rightTrackWheelModels[265] = new ModelRendererTurbo(this, 417, 169, textureX, textureY); // Box 696

		rightTrackWheelModels[0].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 416
		rightTrackWheelModels[0].setRotationPoint(39.8F, -2.8F, -15.5F);

		rightTrackWheelModels[1].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 417
		rightTrackWheelModels[1].setRotationPoint(39.8F, -2.8F, -15.5F);

		rightTrackWheelModels[2].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 418
		rightTrackWheelModels[2].setRotationPoint(39.8F, -2.8F, -15.5F);

		rightTrackWheelModels[3].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 425
		rightTrackWheelModels[3].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[4].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 426
		rightTrackWheelModels[4].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[5].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 427
		rightTrackWheelModels[5].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[6].addShapeBox(-6F, -4.5F, -6.5F, 12, 3, 5, 0F,-4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 431
		rightTrackWheelModels[6].setRotationPoint(-35.8F, -1F, -15.5F);

		rightTrackWheelModels[7].addShapeBox(-5F, -1.5F, -6.5F, 10, 3, 5, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 432
		rightTrackWheelModels[7].setRotationPoint(-35.8F, -1F, -15.5F);

		rightTrackWheelModels[8].addShapeBox(-6F, 1.5F, -6.5F, 12, 3, 5, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F, -4F, 0.2F, 0F); // Box 433
		rightTrackWheelModels[8].setRotationPoint(-35.8F, -1F, -15.5F);

		rightTrackWheelModels[9].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 434
		rightTrackWheelModels[9].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[10].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 437
		rightTrackWheelModels[10].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[11].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 438
		rightTrackWheelModels[11].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[12].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 439
		rightTrackWheelModels[12].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[13].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 440
		rightTrackWheelModels[13].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[14].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 441
		rightTrackWheelModels[14].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[15].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 442
		rightTrackWheelModels[15].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[16].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 443
		rightTrackWheelModels[16].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[17].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 444
		rightTrackWheelModels[17].setRotationPoint(-10F, 0.8F, -15.5F);
		rightTrackWheelModels[17].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[18].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 445
		rightTrackWheelModels[18].setRotationPoint(-10F, 0.8F, -15.5F);
		rightTrackWheelModels[18].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[19].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 446
		rightTrackWheelModels[19].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[20].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 449
		rightTrackWheelModels[20].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[21].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 451
		rightTrackWheelModels[21].setRotationPoint(-10F, 0.8F, -15.5F);
		rightTrackWheelModels[21].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[22].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 453
		rightTrackWheelModels[22].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[23].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 454
		rightTrackWheelModels[23].setRotationPoint(-10F, 0.8F, -15.5F);
		rightTrackWheelModels[23].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[24].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 455
		rightTrackWheelModels[24].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[25].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 456
		rightTrackWheelModels[25].setRotationPoint(-10F, 0.8F, -15.5F);
		rightTrackWheelModels[25].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[26].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 457
		rightTrackWheelModels[26].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[27].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 458
		rightTrackWheelModels[27].setRotationPoint(-10F, 0.8F, -15.5F);
		rightTrackWheelModels[27].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[28].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 459
		rightTrackWheelModels[28].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[29].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 460
		rightTrackWheelModels[29].setRotationPoint(-10F, 0.8F, -15.5F);
		rightTrackWheelModels[29].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[30].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 461
		rightTrackWheelModels[30].setRotationPoint(-10F, 0.8F, -15.5F);

		rightTrackWheelModels[31].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 462
		rightTrackWheelModels[31].setRotationPoint(-10F, 0.8F, -15.5F);
		rightTrackWheelModels[31].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[32].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 463
		rightTrackWheelModels[32].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[33].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 464
		rightTrackWheelModels[33].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[34].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 465
		rightTrackWheelModels[34].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[35].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 466
		rightTrackWheelModels[35].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[36].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 467
		rightTrackWheelModels[36].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[37].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 468
		rightTrackWheelModels[37].setRotationPoint(-23.5F, 0.8F, -15.5F);
		rightTrackWheelModels[37].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[38].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 469
		rightTrackWheelModels[38].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[39].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 470
		rightTrackWheelModels[39].setRotationPoint(-23.5F, 0.8F, -15.5F);
		rightTrackWheelModels[39].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[40].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 471
		rightTrackWheelModels[40].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[41].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 472
		rightTrackWheelModels[41].setRotationPoint(-23.5F, 0.8F, -15.5F);
		rightTrackWheelModels[41].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[42].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 473
		rightTrackWheelModels[42].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[43].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 474
		rightTrackWheelModels[43].setRotationPoint(-23.5F, 0.8F, -15.5F);
		rightTrackWheelModels[43].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[44].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 475
		rightTrackWheelModels[44].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[45].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 476
		rightTrackWheelModels[45].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[46].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 477
		rightTrackWheelModels[46].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[47].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 478
		rightTrackWheelModels[47].setRotationPoint(-23.5F, 0.8F, -15.5F);
		rightTrackWheelModels[47].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[48].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 479
		rightTrackWheelModels[48].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[49].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 480
		rightTrackWheelModels[49].setRotationPoint(-23.5F, 0.8F, -15.5F);
		rightTrackWheelModels[49].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[50].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 481
		rightTrackWheelModels[50].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[51].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 482
		rightTrackWheelModels[51].setRotationPoint(-23.5F, 0.8F, -15.5F);
		rightTrackWheelModels[51].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[52].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 483
		rightTrackWheelModels[52].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[53].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 484
		rightTrackWheelModels[53].setRotationPoint(-23.5F, 0.8F, -15.5F);
		rightTrackWheelModels[53].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[54].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 485
		rightTrackWheelModels[54].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[55].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 486
		rightTrackWheelModels[55].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[56].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 487
		rightTrackWheelModels[56].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[57].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 488
		rightTrackWheelModels[57].setRotationPoint(-23.5F, 0.8F, -15.5F);

		rightTrackWheelModels[58].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 489
		rightTrackWheelModels[58].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[59].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 490
		rightTrackWheelModels[59].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[60].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 491
		rightTrackWheelModels[60].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[61].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 492
		rightTrackWheelModels[61].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[62].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 493
		rightTrackWheelModels[62].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[63].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 494
		rightTrackWheelModels[63].setRotationPoint(2.5F, 0.8F, -15.5F);
		rightTrackWheelModels[63].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[64].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 495
		rightTrackWheelModels[64].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[65].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 496
		rightTrackWheelModels[65].setRotationPoint(2.5F, 0.8F, -15.5F);
		rightTrackWheelModels[65].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[66].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 497
		rightTrackWheelModels[66].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[67].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 498
		rightTrackWheelModels[67].setRotationPoint(2.5F, 0.8F, -15.5F);
		rightTrackWheelModels[67].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[68].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 499
		rightTrackWheelModels[68].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[69].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 500
		rightTrackWheelModels[69].setRotationPoint(2.5F, 0.8F, -15.5F);
		rightTrackWheelModels[69].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[70].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 501
		rightTrackWheelModels[70].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[71].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 502
		rightTrackWheelModels[71].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[72].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 503
		rightTrackWheelModels[72].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[73].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 504
		rightTrackWheelModels[73].setRotationPoint(2.5F, 0.8F, -15.5F);
		rightTrackWheelModels[73].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[74].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 505
		rightTrackWheelModels[74].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[75].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 506
		rightTrackWheelModels[75].setRotationPoint(2.5F, 0.8F, -15.5F);
		rightTrackWheelModels[75].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[76].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 507
		rightTrackWheelModels[76].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[77].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 508
		rightTrackWheelModels[77].setRotationPoint(2.5F, 0.8F, -15.5F);
		rightTrackWheelModels[77].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[78].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 509
		rightTrackWheelModels[78].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[79].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 510
		rightTrackWheelModels[79].setRotationPoint(2.5F, 0.8F, -15.5F);
		rightTrackWheelModels[79].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[80].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 511
		rightTrackWheelModels[80].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[81].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 512
		rightTrackWheelModels[81].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[82].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 513
		rightTrackWheelModels[82].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[83].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 514
		rightTrackWheelModels[83].setRotationPoint(2.5F, 0.8F, -15.5F);

		rightTrackWheelModels[84].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 515
		rightTrackWheelModels[84].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[85].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 516
		rightTrackWheelModels[85].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[86].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 517
		rightTrackWheelModels[86].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[87].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 518
		rightTrackWheelModels[87].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[88].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 519
		rightTrackWheelModels[88].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[89].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 520
		rightTrackWheelModels[89].setRotationPoint(15.5F, 0.8F, -15.5F);
		rightTrackWheelModels[89].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[90].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 521
		rightTrackWheelModels[90].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[91].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 522
		rightTrackWheelModels[91].setRotationPoint(15.5F, 0.8F, -15.5F);
		rightTrackWheelModels[91].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[92].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 523
		rightTrackWheelModels[92].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[93].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 524
		rightTrackWheelModels[93].setRotationPoint(15.5F, 0.8F, -15.5F);
		rightTrackWheelModels[93].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[94].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 525
		rightTrackWheelModels[94].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[95].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 526
		rightTrackWheelModels[95].setRotationPoint(15.5F, 0.8F, -15.5F);
		rightTrackWheelModels[95].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[96].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 527
		rightTrackWheelModels[96].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[97].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 528
		rightTrackWheelModels[97].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[98].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 529
		rightTrackWheelModels[98].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[99].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 530
		rightTrackWheelModels[99].setRotationPoint(15.5F, 0.8F, -15.5F);
		rightTrackWheelModels[99].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[100].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 531
		rightTrackWheelModels[100].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[101].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 532
		rightTrackWheelModels[101].setRotationPoint(15.5F, 0.8F, -15.5F);
		rightTrackWheelModels[101].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[102].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 533
		rightTrackWheelModels[102].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[103].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 534
		rightTrackWheelModels[103].setRotationPoint(15.5F, 0.8F, -15.5F);
		rightTrackWheelModels[103].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[104].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 535
		rightTrackWheelModels[104].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[105].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 536
		rightTrackWheelModels[105].setRotationPoint(15.5F, 0.8F, -15.5F);
		rightTrackWheelModels[105].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[106].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 537
		rightTrackWheelModels[106].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[107].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 538
		rightTrackWheelModels[107].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[108].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 539
		rightTrackWheelModels[108].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[109].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 540
		rightTrackWheelModels[109].setRotationPoint(15.5F, 0.8F, -15.5F);

		rightTrackWheelModels[110].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 541
		rightTrackWheelModels[110].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[111].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 542
		rightTrackWheelModels[111].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[112].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 543
		rightTrackWheelModels[112].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[113].addShapeBox(-1.5F, -1.5F, -7F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 544
		rightTrackWheelModels[113].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[114].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 545
		rightTrackWheelModels[114].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[115].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 546
		rightTrackWheelModels[115].setRotationPoint(28.5F, 0.8F, -15.5F);
		rightTrackWheelModels[115].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[116].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 547
		rightTrackWheelModels[116].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[117].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 548
		rightTrackWheelModels[117].setRotationPoint(28.5F, 0.8F, -15.5F);
		rightTrackWheelModels[117].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[118].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 549
		rightTrackWheelModels[118].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[119].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 550
		rightTrackWheelModels[119].setRotationPoint(28.5F, 0.8F, -15.5F);
		rightTrackWheelModels[119].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[120].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 551
		rightTrackWheelModels[120].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[121].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 552
		rightTrackWheelModels[121].setRotationPoint(28.5F, 0.8F, -15.5F);
		rightTrackWheelModels[121].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[122].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 553
		rightTrackWheelModels[122].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[123].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 554
		rightTrackWheelModels[123].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[124].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 555
		rightTrackWheelModels[124].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[125].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 556
		rightTrackWheelModels[125].setRotationPoint(28.5F, 0.8F, -15.5F);
		rightTrackWheelModels[125].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[126].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 557
		rightTrackWheelModels[126].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[127].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 558
		rightTrackWheelModels[127].setRotationPoint(28.5F, 0.8F, -15.5F);
		rightTrackWheelModels[127].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[128].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 559
		rightTrackWheelModels[128].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[129].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 560
		rightTrackWheelModels[129].setRotationPoint(28.5F, 0.8F, -15.5F);
		rightTrackWheelModels[129].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[130].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 561
		rightTrackWheelModels[130].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[131].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 562
		rightTrackWheelModels[131].setRotationPoint(28.5F, 0.8F, -15.5F);
		rightTrackWheelModels[131].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[132].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 563
		rightTrackWheelModels[132].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[133].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 564
		rightTrackWheelModels[133].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[134].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 565
		rightTrackWheelModels[134].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[135].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 566
		rightTrackWheelModels[135].setRotationPoint(28.5F, 0.8F, -15.5F);

		rightTrackWheelModels[136].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 567
		rightTrackWheelModels[136].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[137].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 568
		rightTrackWheelModels[137].setRotationPoint(28.5F, 0.8F, 23.5F);
		rightTrackWheelModels[137].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[138].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 569
		rightTrackWheelModels[138].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[139].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 570
		rightTrackWheelModels[139].setRotationPoint(28.5F, 0.8F, 23.5F);
		rightTrackWheelModels[139].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[140].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 571
		rightTrackWheelModels[140].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[141].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 572
		rightTrackWheelModels[141].setRotationPoint(28.5F, 0.8F, 23.5F);
		rightTrackWheelModels[141].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[142].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 573
		rightTrackWheelModels[142].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[143].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 574
		rightTrackWheelModels[143].setRotationPoint(28.5F, 0.8F, 23.5F);
		rightTrackWheelModels[143].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[144].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 575
		rightTrackWheelModels[144].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[145].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 576
		rightTrackWheelModels[145].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[146].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 577
		rightTrackWheelModels[146].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[147].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 578
		rightTrackWheelModels[147].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[148].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 579
		rightTrackWheelModels[148].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[149].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 580
		rightTrackWheelModels[149].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[150].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 581
		rightTrackWheelModels[150].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[151].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 582
		rightTrackWheelModels[151].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[152].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 583
		rightTrackWheelModels[152].setRotationPoint(28.5F, 0.8F, 23.5F);
		rightTrackWheelModels[152].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[153].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 584
		rightTrackWheelModels[153].setRotationPoint(28.5F, 0.8F, 23.5F);
		rightTrackWheelModels[153].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[154].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 585
		rightTrackWheelModels[154].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[155].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 586
		rightTrackWheelModels[155].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[156].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 587
		rightTrackWheelModels[156].setRotationPoint(28.5F, 0.8F, 23.5F);
		rightTrackWheelModels[156].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[157].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 588
		rightTrackWheelModels[157].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[158].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 589
		rightTrackWheelModels[158].setRotationPoint(28.5F, 0.8F, 23.5F);
		rightTrackWheelModels[158].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[159].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 590
		rightTrackWheelModels[159].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[160].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 591
		rightTrackWheelModels[160].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[161].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 592
		rightTrackWheelModels[161].setRotationPoint(28.5F, 0.8F, 23.5F);

		rightTrackWheelModels[162].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 593
		rightTrackWheelModels[162].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[163].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 594
		rightTrackWheelModels[163].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[164].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 595
		rightTrackWheelModels[164].setRotationPoint(15.5F, 0.8F, 23.5F);
		rightTrackWheelModels[164].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[165].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 596
		rightTrackWheelModels[165].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[166].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 597
		rightTrackWheelModels[166].setRotationPoint(15.5F, 0.8F, 23.5F);
		rightTrackWheelModels[166].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[167].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 598
		rightTrackWheelModels[167].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[168].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 599
		rightTrackWheelModels[168].setRotationPoint(15.5F, 0.8F, 23.5F);
		rightTrackWheelModels[168].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[169].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 600
		rightTrackWheelModels[169].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[170].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 601
		rightTrackWheelModels[170].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[171].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 602
		rightTrackWheelModels[171].setRotationPoint(15.5F, 0.8F, 23.5F);
		rightTrackWheelModels[171].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[172].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 603
		rightTrackWheelModels[172].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[173].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 604
		rightTrackWheelModels[173].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[174].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 605
		rightTrackWheelModels[174].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[175].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 606
		rightTrackWheelModels[175].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[176].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 607
		rightTrackWheelModels[176].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[177].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 608
		rightTrackWheelModels[177].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[178].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 609
		rightTrackWheelModels[178].setRotationPoint(15.5F, 0.8F, 23.5F);
		rightTrackWheelModels[178].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[179].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 610
		rightTrackWheelModels[179].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[180].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 611
		rightTrackWheelModels[180].setRotationPoint(15.5F, 0.8F, 23.5F);
		rightTrackWheelModels[180].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[181].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 612
		rightTrackWheelModels[181].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[182].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 613
		rightTrackWheelModels[182].setRotationPoint(15.5F, 0.8F, 23.5F);
		rightTrackWheelModels[182].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[183].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 614
		rightTrackWheelModels[183].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[184].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 615
		rightTrackWheelModels[184].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[185].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 616
		rightTrackWheelModels[185].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[186].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 617
		rightTrackWheelModels[186].setRotationPoint(15.5F, 0.8F, 23.5F);

		rightTrackWheelModels[187].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 618
		rightTrackWheelModels[187].setRotationPoint(15.5F, 0.8F, 23.5F);
		rightTrackWheelModels[187].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[188].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 619
		rightTrackWheelModels[188].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[189].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 620
		rightTrackWheelModels[189].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[190].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 621
		rightTrackWheelModels[190].setRotationPoint(2.5F, 0.8F, 23.5F);
		rightTrackWheelModels[190].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[191].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 622
		rightTrackWheelModels[191].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[192].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 623
		rightTrackWheelModels[192].setRotationPoint(2.5F, 0.8F, 23.5F);
		rightTrackWheelModels[192].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[193].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 624
		rightTrackWheelModels[193].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[194].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 625
		rightTrackWheelModels[194].setRotationPoint(2.5F, 0.8F, 23.5F);
		rightTrackWheelModels[194].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[195].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 626
		rightTrackWheelModels[195].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[196].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 627
		rightTrackWheelModels[196].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[197].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 628
		rightTrackWheelModels[197].setRotationPoint(2.5F, 0.8F, 23.5F);
		rightTrackWheelModels[197].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[198].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 629
		rightTrackWheelModels[198].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[199].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 630
		rightTrackWheelModels[199].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[200].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 631
		rightTrackWheelModels[200].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[201].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 632
		rightTrackWheelModels[201].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[202].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 633
		rightTrackWheelModels[202].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[203].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 634
		rightTrackWheelModels[203].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[204].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 635
		rightTrackWheelModels[204].setRotationPoint(2.5F, 0.8F, 23.5F);
		rightTrackWheelModels[204].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[205].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 636
		rightTrackWheelModels[205].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[206].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 637
		rightTrackWheelModels[206].setRotationPoint(2.5F, 0.8F, 23.5F);
		rightTrackWheelModels[206].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[207].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 638
		rightTrackWheelModels[207].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[208].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 639
		rightTrackWheelModels[208].setRotationPoint(2.5F, 0.8F, 23.5F);
		rightTrackWheelModels[208].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[209].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 640
		rightTrackWheelModels[209].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[210].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 641
		rightTrackWheelModels[210].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[211].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 642
		rightTrackWheelModels[211].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[212].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 643
		rightTrackWheelModels[212].setRotationPoint(2.5F, 0.8F, 23.5F);

		rightTrackWheelModels[213].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 644
		rightTrackWheelModels[213].setRotationPoint(2.5F, 0.8F, 23.5F);
		rightTrackWheelModels[213].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[214].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 645
		rightTrackWheelModels[214].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[215].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 646
		rightTrackWheelModels[215].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[216].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 647
		rightTrackWheelModels[216].setRotationPoint(-10.5F, 0.8F, 23.5F);
		rightTrackWheelModels[216].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[217].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 648
		rightTrackWheelModels[217].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[218].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 649
		rightTrackWheelModels[218].setRotationPoint(-10.5F, 0.8F, 23.5F);
		rightTrackWheelModels[218].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[219].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 650
		rightTrackWheelModels[219].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[220].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 651
		rightTrackWheelModels[220].setRotationPoint(-10.5F, 0.8F, 23.5F);
		rightTrackWheelModels[220].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[221].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 652
		rightTrackWheelModels[221].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[222].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 653
		rightTrackWheelModels[222].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[223].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 654
		rightTrackWheelModels[223].setRotationPoint(-10.5F, 0.8F, 23.5F);
		rightTrackWheelModels[223].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[224].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 655
		rightTrackWheelModels[224].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[225].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 656
		rightTrackWheelModels[225].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[226].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 657
		rightTrackWheelModels[226].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[227].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 658
		rightTrackWheelModels[227].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[228].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 659
		rightTrackWheelModels[228].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[229].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 660
		rightTrackWheelModels[229].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[230].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 661
		rightTrackWheelModels[230].setRotationPoint(-10.5F, 0.8F, 23.5F);
		rightTrackWheelModels[230].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[231].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 662
		rightTrackWheelModels[231].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[232].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 663
		rightTrackWheelModels[232].setRotationPoint(-10.5F, 0.8F, 23.5F);
		rightTrackWheelModels[232].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[233].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 664
		rightTrackWheelModels[233].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[234].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 665
		rightTrackWheelModels[234].setRotationPoint(-10.5F, 0.8F, 23.5F);
		rightTrackWheelModels[234].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[235].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 666
		rightTrackWheelModels[235].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[236].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 667
		rightTrackWheelModels[236].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[237].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 668
		rightTrackWheelModels[237].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[238].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 669
		rightTrackWheelModels[238].setRotationPoint(-10.5F, 0.8F, 23.5F);

		rightTrackWheelModels[239].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 670
		rightTrackWheelModels[239].setRotationPoint(-10.5F, 0.8F, 23.5F);
		rightTrackWheelModels[239].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[240].addShapeBox(-1.5F, -1.5F, -4F, 3, 3, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 671
		rightTrackWheelModels[240].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[241].addShapeBox(-2F, 4.54F, -3.25F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 672
		rightTrackWheelModels[241].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[242].addShapeBox(4.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 673
		rightTrackWheelModels[242].setRotationPoint(-24F, 0.8F, 23.5F);
		rightTrackWheelModels[242].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[243].addShapeBox(4.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 674
		rightTrackWheelModels[243].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[244].addShapeBox(4.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.3F, 0F); // Box 675
		rightTrackWheelModels[244].setRotationPoint(-24F, 0.8F, 23.5F);
		rightTrackWheelModels[244].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[245].addShapeBox(-6.5F, -4.5F, -3.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 676
		rightTrackWheelModels[245].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[246].addShapeBox(-5.5F, -2.5F, -3.25F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F); // Box 677
		rightTrackWheelModels[246].setRotationPoint(-24F, 0.8F, 23.5F);
		rightTrackWheelModels[246].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[247].addShapeBox(-2F, -5.54F, -3.25F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 678
		rightTrackWheelModels[247].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[248].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 679
		rightTrackWheelModels[248].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[249].addShapeBox(-5.5F, -1.5F, -3.25F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.3F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 680
		rightTrackWheelModels[249].setRotationPoint(-24F, 0.8F, 23.5F);
		rightTrackWheelModels[249].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[250].addShapeBox(-6.5F, 1.5F, -3.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 681
		rightTrackWheelModels[250].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[251].addShapeBox(-5.5F, -1.5F, -3.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 682
		rightTrackWheelModels[251].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[252].addShapeBox(-5.5F, -3.5F, -5.5F, 11, 2, 2, 0F,-4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 683
		rightTrackWheelModels[252].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[253].addShapeBox(-5.5F, 1.5F, -5.5F, 11, 2, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F, -4F, 1.25F, 0F); // Box 684
		rightTrackWheelModels[253].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[254].addShapeBox(-4.5F, -1.5F, -5.5F, 9, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 685
		rightTrackWheelModels[254].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[255].addShapeBox(4.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.75F, 0.25F, 0.25F, 0.75F, 0F, 0F, 0.25F, 0F); // Box 686
		rightTrackWheelModels[255].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[256].addShapeBox(4.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.25F, 0F); // Box 687
		rightTrackWheelModels[256].setRotationPoint(-24F, 0.8F, 23.5F);
		rightTrackWheelModels[256].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[257].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 3, 2, 0F,-1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F); // Box 688
		rightTrackWheelModels[257].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[258].addShapeBox(-5.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0.25F, 0.05F, 0.25F, 0F, 0.05F, 0.25F, 0F, 0.05F, 0F, 0.25F, 0.05F, 0F, 0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F); // Box 689
		rightTrackWheelModels[258].setRotationPoint(-24F, 0.8F, 23.5F);
		rightTrackWheelModels[258].rotateAngleZ = -0.75049158F;

		rightTrackWheelModels[259].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 3, 2, 0F,0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F, 0.25F, 0.75F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.75F, 0F); // Box 690
		rightTrackWheelModels[259].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[260].addShapeBox(-5.5F, -1.5F, -6.5F, 1, 4, 2, 0F,0.24F, 0.775F, 0.25F, 0F, 0.3F, 0.25F, 0F, 0.25F, 0F, 0.24F, 0.775F, 0F, 0.25F, 0.05F, 0.25F, 0F, 0.25F, 0.25F, 0F, 0.25F, 0F, 0.25F, 0.05F, 0F); // Box 691
		rightTrackWheelModels[260].setRotationPoint(-24F, 0.8F, 23.5F);
		rightTrackWheelModels[260].rotateAngleZ = 0.75049158F;

		rightTrackWheelModels[261].addShapeBox(-2F, 4.54F, -6.5F, 4, 1, 2, 0F,0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F); // Box 692
		rightTrackWheelModels[261].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[262].addShapeBox(-2F, -5.54F, -6.5F, 4, 1, 2, 0F,0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0.25F, 0.47F, 0.25F, 0F, 0.47F, 0.25F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 693
		rightTrackWheelModels[262].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[263].addShapeBox(-6.5F, -4.5F, -6.5F, 13, 3, 2, 0F,-4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -4.5F, 0.8F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F, -1F, -0.25F, 0F); // Box 694
		rightTrackWheelModels[263].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[264].addShapeBox(-5.5F, -1.5F, -6.5F, 11, 3, 2, 0F,0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F); // Box 695
		rightTrackWheelModels[264].setRotationPoint(-24F, 0.8F, 23.5F);

		rightTrackWheelModels[265].addShapeBox(4.5F, -2.5F, -6.5F, 1, 4, 2, 0F,0F, 0.05F, 0.25F, 0.25F, 0.05F, 0.25F, 0.25F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0.3F, 0.25F, 0.24F, 0.775F, 0.25F, 0.24F, 0.775F, 0F, 0F, 0.25F, 0F); // Box 696
		rightTrackWheelModels[265].setRotationPoint(-24F, 0.8F, 23.5F);
		rightTrackWheelModels[265].rotateAngleZ = 0.75049158F;
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 97, 65, textureX, textureY); // Box 231
		leftTrackModel[1] = new ModelRendererTurbo(this, 393, 65, textureX, textureY); // Box 232
		leftTrackModel[2] = new ModelRendererTurbo(this, 561, 57, textureX, textureY); // Box 233
		leftTrackModel[3] = new ModelRendererTurbo(this, 729, 57, textureX, textureY); // Box 234
		leftTrackModel[4] = new ModelRendererTurbo(this, 913, 57, textureX, textureY); // Box 235
		leftTrackModel[5] = new ModelRendererTurbo(this, 961, 57, textureX, textureY); // Box 236
		leftTrackModel[6] = new ModelRendererTurbo(this, 985, 57, textureX, textureY); // Box 237
		leftTrackModel[7] = new ModelRendererTurbo(this, 1, 65, textureX, textureY); // Box 238
		leftTrackModel[8] = new ModelRendererTurbo(this, 217, 65, textureX, textureY); // Box 239
		leftTrackModel[9] = new ModelRendererTurbo(this, 241, 65, textureX, textureY); // Box 240
		leftTrackModel[10] = new ModelRendererTurbo(this, 529, 65, textureX, textureY); // Box 241
		leftTrackModel[11] = new ModelRendererTurbo(this, 577, 65, textureX, textureY); // Box 242
		leftTrackModel[12] = new ModelRendererTurbo(this, 617, 65, textureX, textureY); // Box 243

		leftTrackModel[0].addShapeBox(-6.5F, 1.5F, -6.5F, 51, 1, 7, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 3F, 0.8F, 0F, 3F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 231
		leftTrackModel[0].setRotationPoint(-16.6F, 4.7F, 22.5F);

		leftTrackModel[1].addShapeBox(-6.5F, 1.5F, -6.5F, 57, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 232
		leftTrackModel[1].setRotationPoint(-21.6F, -7.8F, 22.5F);

		leftTrackModel[2].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 233
		leftTrackModel[2].setRotationPoint(-19.6F, 4.7F, 22.5F);

		leftTrackModel[3].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 1, 7, 0F,0.8F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.8F, 1F, 0F, 0F, -0.2F, 0F, 0F, 3.8F, 0F, 0F, 3.8F, 0F, 0F, -0.2F, 0F); // Box 234
		leftTrackModel[3].setRotationPoint(-32.6F, 1.7F, 22.5F);

		leftTrackModel[4].addShapeBox(-3.5F, 1.5F, -6.5F, 12, 1, 7, 0F,0F, -3F, 0F, 0.8F, 3F, 0F, 0.8F, 3F, 0F, 0F, -3F, 0F, 0F, 3.8F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 3.8F, 0F); // Box 235
		leftTrackModel[4].setRotationPoint(34.4F, 1.7F, 22.5F);

		leftTrackModel[5].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,-2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F); // Box 236
		leftTrackModel[5].setRotationPoint(49.4F, -4.3F, 22.5F);

		leftTrackModel[6].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,2F, 0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0.6F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F); // Box 237
		leftTrackModel[6].setRotationPoint(49.4F, -9.3F, 22.5F);

		leftTrackModel[7].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 238
		leftTrackModel[7].setRotationPoint(-33.6F, -2.3F, 22.5F);

		leftTrackModel[8].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,-0.4F, 0F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, -0.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F); // Box 239
		leftTrackModel[8].setRotationPoint(-33.6F, -7.3F, 22.5F);

		leftTrackModel[9].addShapeBox(-6.5F, 1.5F, -6.5F, 7, 1, 7, 0F,0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 240
		leftTrackModel[9].setRotationPoint(-28.6F, -7.8F, 22.5F);

		leftTrackModel[10].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.7F, 0.4F, 0F); // Box 241
		leftTrackModel[10].setRotationPoint(-31.6F, -8.2F, 22.5F);

		leftTrackModel[11].addShapeBox(-6.5F, 1.5F, -6.5F, 9, 1, 7, 0F,0F, -0.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0.8F, 0F); // Box 242
		leftTrackModel[11].setRotationPoint(35.4F, -7.8F, 22.5F);

		leftTrackModel[12].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 243
		leftTrackModel[12].setRotationPoint(44.4F, -10F, 22.5F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 769, 65, textureX, textureY); // Box 244
		rightTrackModel[1] = new ModelRendererTurbo(this, 793, 65, textureX, textureY); // Box 245
		rightTrackModel[2] = new ModelRendererTurbo(this, 897, 65, textureX, textureY); // Box 246
		rightTrackModel[3] = new ModelRendererTurbo(this, 265, 73, textureX, textureY); // Box 247
		rightTrackModel[4] = new ModelRendererTurbo(this, 313, 73, textureX, textureY); // Box 248
		rightTrackModel[5] = new ModelRendererTurbo(this, 121, 81, textureX, textureY); // Box 249
		rightTrackModel[6] = new ModelRendererTurbo(this, 345, 81, textureX, textureY); // Box 250
		rightTrackModel[7] = new ModelRendererTurbo(this, 721, 73, textureX, textureY); // Box 251
		rightTrackModel[8] = new ModelRendererTurbo(this, 1001, 65, textureX, textureY); // Box 252
		rightTrackModel[9] = new ModelRendererTurbo(this, 545, 73, textureX, textureY); // Box 253
		rightTrackModel[10] = new ModelRendererTurbo(this, 913, 73, textureX, textureY); // Box 254
		rightTrackModel[11] = new ModelRendererTurbo(this, 937, 73, textureX, textureY); // Box 255
		rightTrackModel[12] = new ModelRendererTurbo(this, 961, 73, textureX, textureY); // Box 256

		rightTrackModel[0].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0.9F, 0.4F, 0F, 0F, 0.4F, 0F); // Box 244
		rightTrackModel[0].setRotationPoint(44.4F, -10F, -16.8F);

		rightTrackModel[1].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,2F, 0.6F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 2F, 0.6F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F); // Box 245
		rightTrackModel[1].setRotationPoint(49.4F, -9.3F, -16.8F);

		rightTrackModel[2].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,-2F, 0F, 0F, 2.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F); // Box 246
		rightTrackModel[2].setRotationPoint(49.4F, -4.3F, -16.8F);

		rightTrackModel[3].addShapeBox(-3.5F, 1.5F, -6.5F, 12, 1, 7, 0F,0F, -3F, 0F, 0.8F, 3F, 0F, 0.8F, 3F, 0F, 0F, -3F, 0F, 0F, 3.8F, 0F, 0F, -2.2F, 0F, 0F, -2.2F, 0F, 0F, 3.8F, 0F); // Box 247
		rightTrackModel[3].setRotationPoint(34.4F, 1.7F, -16.8F);

		rightTrackModel[4].addShapeBox(-6.5F, 1.5F, -6.5F, 9, 1, 7, 0F,0F, -0.2F, 0F, 0F, 2.2F, 0F, 0F, 2.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, -1.8F, 0F, 0F, -1.8F, 0F, 0F, 0.8F, 0F); // Box 248
		rightTrackModel[4].setRotationPoint(35.4F, -7.8F, -16.8F);

		rightTrackModel[5].addShapeBox(-6.5F, 1.5F, -6.5F, 57, 1, 7, 0F,0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 249
		rightTrackModel[5].setRotationPoint(-21.6F, -7.8F, -16.8F);

		rightTrackModel[6].addShapeBox(-6.5F, 1.5F, -6.5F, 51, 1, 7, 0F,0F, 0F, 0F, 3F, 0F, 0F, 3F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 3F, 0.8F, 0F, 3F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 250
		rightTrackModel[6].setRotationPoint(-16.6F, 4.7F, -16.8F);

		rightTrackModel[7].addShapeBox(-6.5F, 1.5F, -6.5F, 13, 1, 7, 0F,0.8F, 1F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0.8F, 1F, 0F, 0F, -0.2F, 0F, 0F, 3.8F, 0F, 0F, 3.8F, 0F, 0F, -0.2F, 0F); // Box 251
		rightTrackModel[7].setRotationPoint(-32.6F, 1.7F, -16.8F);

		rightTrackModel[8].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F); // Box 252
		rightTrackModel[8].setRotationPoint(-19.6F, 4.7F, -16.8F);

		rightTrackModel[9].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 4, 7, 0F,2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F, 0.6F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0.6F, 0F, 0F); // Box 253
		rightTrackModel[9].setRotationPoint(-33.6F, -2.3F, -16.8F);

		rightTrackModel[10].addShapeBox(-6.5F, 1.5F, -6.5F, 1, 5, 7, 0F,-0.4F, 0F, 0F, 1F, 0.8F, 0F, 1F, 0.8F, 0F, -0.4F, 0F, 0F, 2.4F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 2.4F, 0F, 0F); // Box 254
		rightTrackModel[10].setRotationPoint(-33.6F, -7.3F, -16.8F);

		rightTrackModel[11].addShapeBox(-6.5F, 1.5F, -6.5F, 3, 1, 7, 0F,0F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.1F, 0F, 0.7F, 0.4F, 0F, 0F, 0.4F, 0F, 0F, 0.4F, 0F, 0.7F, 0.4F, 0F); // Box 255
		rightTrackModel[11].setRotationPoint(-31.6F, -8.2F, -16.8F);

		rightTrackModel[12].addShapeBox(-6.5F, 1.5F, -6.5F, 7, 1, 7, 0F,0F, 0.4F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0.4F, 0F, 0F, 0F, 0F, 0F, 0.8F, 0F, 0F, 0.8F, 0F, 0F, 0F, 0F); // Box 256
		rightTrackModel[12].setRotationPoint(-28.6F, -7.8F, -16.8F);
	}
}