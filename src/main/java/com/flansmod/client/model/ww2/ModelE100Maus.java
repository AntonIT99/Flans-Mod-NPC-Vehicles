//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.2.4
// Copyright (C) 2016 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

// Model: E100
// Model Creator: 
// Created on: 12.07.2016 - 19:40:42
// Last changed on: 12.07.2016 - 19:40:42

package com.flansmod.client.model.ww2; //Path where the model is located

import com.flansmod.client.model.ModelVehicle;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;
import com.flansmod.common.vector.Vector3f;

public class ModelE100Maus extends ModelVehicle //Same as Filename
{
	int textureX = 512;
	int textureY = 4096;

	public ModelE100Maus() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[300];
		bodyDoorCloseModel = new ModelRendererTurbo[194];
		turretModel = new ModelRendererTurbo[76];
		barrelModel = new ModelRendererTurbo[88];
		leftTrackWheelModels = new ModelRendererTurbo[54];
		rightTrackWheelModels = new ModelRendererTurbo[56];
		leftTrackModel = new ModelRendererTurbo[15];
		rightTrackModel = new ModelRendererTurbo[15];
		
		turretScale = new Vector3f(0.85F, 0.85F, 0.85F);
		turretTrans = new Vector3f(0, 4/16F, 0);

		initbodyModel_1();
		initbodyDoorCloseModel_1();
		initturretModel_1();
		initbarrelModel_1();
		initleftTrackWheelModels_1();
		initrightTrackWheelModels_1();
		initleftTrackModel_1();
		initrightTrackModel_1();

		translateAll(0F, -1F, 0F);


		flipAll();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 10, 441, textureX, textureY); // Import Box0
		bodyModel[1] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import Box1
		bodyModel[2] = new ModelRendererTurbo(this, 92, 390, textureX, textureY); // Import Box2
		bodyModel[3] = new ModelRendererTurbo(this, 198, 389, textureX, textureY); // Import Box3
		bodyModel[4] = new ModelRendererTurbo(this, 0, 368, textureX, textureY); // Import Box4
		bodyModel[5] = new ModelRendererTurbo(this, 243, 346, textureX, textureY); // Import Box5
		bodyModel[6] = new ModelRendererTurbo(this, 54, 403, textureX, textureY); // Import Box6
		bodyModel[7] = new ModelRendererTurbo(this, 162, 403, textureX, textureY); // Import Box7
		bodyModel[8] = new ModelRendererTurbo(this, 54, 390, textureX, textureY); // Import Box8
		bodyModel[9] = new ModelRendererTurbo(this, 162, 390, textureX, textureY); // Import Box9
		bodyModel[10] = new ModelRendererTurbo(this, 32, 503, textureX, textureY); // Import Box66
		bodyModel[11] = new ModelRendererTurbo(this, 18, 503, textureX, textureY); // Import Box67
		bodyModel[12] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Import Box68
		bodyModel[13] = new ModelRendererTurbo(this, 0, 503, textureX, textureY); // Import Box73
		bodyModel[14] = new ModelRendererTurbo(this, 32, 503, textureX, textureY); // Import Box74
		bodyModel[15] = new ModelRendererTurbo(this, 18, 503, textureX, textureY); // Import Box75
		bodyModel[16] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box174
		bodyModel[17] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box175
		bodyModel[18] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box176
		bodyModel[19] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box177
		bodyModel[20] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box178
		bodyModel[21] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box179
		bodyModel[22] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box180
		bodyModel[23] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box181
		bodyModel[24] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box182
		bodyModel[25] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box183
		bodyModel[26] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box184
		bodyModel[27] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box185
		bodyModel[28] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box186
		bodyModel[29] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box187
		bodyModel[30] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box188
		bodyModel[31] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box189
		bodyModel[32] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box190
		bodyModel[33] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box191
		bodyModel[34] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box192
		bodyModel[35] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box193
		bodyModel[36] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box194
		bodyModel[37] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box195
		bodyModel[38] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box196
		bodyModel[39] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box197
		bodyModel[40] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box198
		bodyModel[41] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box199
		bodyModel[42] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box200
		bodyModel[43] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box201
		bodyModel[44] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box202
		bodyModel[45] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box203
		bodyModel[46] = new ModelRendererTurbo(this, 2, 441, textureX, textureY); // Import Box204
		bodyModel[47] = new ModelRendererTurbo(this, 2, 456, textureX, textureY); // Import Box205
		bodyModel[48] = new ModelRendererTurbo(this, 24, 442, textureX, textureY); // Import Box220
		bodyModel[49] = new ModelRendererTurbo(this, 24, 461, textureX, textureY); // Import Box221
		bodyModel[50] = new ModelRendererTurbo(this, 24, 442, textureX, textureY); // Import Box222
		bodyModel[51] = new ModelRendererTurbo(this, 24, 461, textureX, textureY); // Import Box223
		bodyModel[52] = new ModelRendererTurbo(this, 0, 390, textureX, textureY); // Import Box198
		bodyModel[53] = new ModelRendererTurbo(this, 0, 405, textureX, textureY); // Import Box199
		bodyModel[54] = new ModelRendererTurbo(this, 280, 403, textureX, textureY); // Import Box132
		bodyModel[55] = new ModelRendererTurbo(this, 280, 370, textureX, textureY); // Import Box133
		bodyModel[56] = new ModelRendererTurbo(this, 280, 386, textureX, textureY); // Import Box134
		bodyModel[57] = new ModelRendererTurbo(this, 314, 372, textureX, textureY); // Import Box135
		bodyModel[58] = new ModelRendererTurbo(this, 314, 390, textureX, textureY); // Import Box136
		bodyModel[59] = new ModelRendererTurbo(this, 215, 409, textureX, textureY); // Import Box119
		bodyModel[60] = new ModelRendererTurbo(this, 215, 391, textureX, textureY); // Import Box120
		bodyModel[61] = new ModelRendererTurbo(this, 215, 399, textureX, textureY); // Import Box121
		bodyModel[62] = new ModelRendererTurbo(this, 110, 399, textureX, textureY); // Import Box151
		bodyModel[63] = new ModelRendererTurbo(this, 110, 389, textureX, textureY); // Import Box152
		bodyModel[64] = new ModelRendererTurbo(this, 215, 399, textureX, textureY); // Import Box26
		bodyModel[65] = new ModelRendererTurbo(this, 215, 391, textureX, textureY); // Import Box27
		bodyModel[66] = new ModelRendererTurbo(this, 215, 409, textureX, textureY); // Import Box28
		bodyModel[67] = new ModelRendererTurbo(this, 316, 426, textureX, textureY); // Import Box308
		bodyModel[68] = new ModelRendererTurbo(this, 316, 409, textureX, textureY); // Import Box309
		bodyModel[69] = new ModelRendererTurbo(this, 344, 414, textureX, textureY); // Import Box311
		bodyModel[70] = new ModelRendererTurbo(this, 348, 390, textureX, textureY); // Import Box312
		bodyModel[71] = new ModelRendererTurbo(this, 110, 399, textureX, textureY); // Import Box313
		bodyModel[72] = new ModelRendererTurbo(this, 300, 461, textureX, textureY); // Import Box314
		bodyModel[73] = new ModelRendererTurbo(this, 300, 441, textureX, textureY); // Import Box315
		bodyModel[74] = new ModelRendererTurbo(this, 300, 451, textureX, textureY); // Import Box316
		bodyModel[75] = new ModelRendererTurbo(this, 322, 492, textureX, textureY); // Import Box318
		bodyModel[76] = new ModelRendererTurbo(this, 280, 403, textureX, textureY); // Import Box321
		bodyModel[77] = new ModelRendererTurbo(this, 280, 370, textureX, textureY); // Import Box322
		bodyModel[78] = new ModelRendererTurbo(this, 280, 386, textureX, textureY); // Import Box323
		bodyModel[79] = new ModelRendererTurbo(this, 316, 426, textureX, textureY); // Import Box324
		bodyModel[80] = new ModelRendererTurbo(this, 316, 409, textureX, textureY); // Import Box325
		bodyModel[81] = new ModelRendererTurbo(this, 344, 414, textureX, textureY); // Import Box326
		bodyModel[82] = new ModelRendererTurbo(this, 371, 489, textureX, textureY); // Import Box327
		bodyModel[83] = new ModelRendererTurbo(this, 316, 458, textureX, textureY); // Import Box328
		bodyModel[84] = new ModelRendererTurbo(this, 316, 467, textureX, textureY); // Import Box329
		bodyModel[85] = new ModelRendererTurbo(this, 316, 449, textureX, textureY); // Import Box330
		bodyModel[86] = new ModelRendererTurbo(this, 110, 389, textureX, textureY); // Import Box331
		bodyModel[87] = new ModelRendererTurbo(this, 110, 399, textureX, textureY); // Import Box332
		bodyModel[88] = new ModelRendererTurbo(this, 110, 389, textureX, textureY); // Import Box333
		bodyModel[89] = new ModelRendererTurbo(this, 316, 458, textureX, textureY); // Import Box334
		bodyModel[90] = new ModelRendererTurbo(this, 316, 467, textureX, textureY); // Import Box335
		bodyModel[91] = new ModelRendererTurbo(this, 316, 449, textureX, textureY); // Import Box336
		bodyModel[92] = new ModelRendererTurbo(this, 110, 389, textureX, textureY); // Import Box337
		bodyModel[93] = new ModelRendererTurbo(this, 110, 399, textureX, textureY); // Import Box338
		bodyModel[94] = new ModelRendererTurbo(this, 110, 389, textureX, textureY); // Import Box339
		bodyModel[95] = new ModelRendererTurbo(this, 316, 458, textureX, textureY); // Import Box340
		bodyModel[96] = new ModelRendererTurbo(this, 316, 467, textureX, textureY); // Import Box341
		bodyModel[97] = new ModelRendererTurbo(this, 316, 449, textureX, textureY); // Import Box342
		bodyModel[98] = new ModelRendererTurbo(this, 316, 458, textureX, textureY); // Import Box346
		bodyModel[99] = new ModelRendererTurbo(this, 316, 467, textureX, textureY); // Import Box347
		bodyModel[100] = new ModelRendererTurbo(this, 316, 449, textureX, textureY); // Import Box348
		bodyModel[101] = new ModelRendererTurbo(this, 300, 461, textureX, textureY); // Import Box349
		bodyModel[102] = new ModelRendererTurbo(this, 300, 441, textureX, textureY); // Import Box350
		bodyModel[103] = new ModelRendererTurbo(this, 300, 451, textureX, textureY); // Import Box351
		bodyModel[104] = new ModelRendererTurbo(this, 334, 474, textureX, textureY); // Import Box352
		bodyModel[105] = new ModelRendererTurbo(this, 334, 456, textureX, textureY); // Import Box353
		bodyModel[106] = new ModelRendererTurbo(this, 334, 456, textureX, textureY); // Import Box354
		bodyModel[107] = new ModelRendererTurbo(this, 334, 474, textureX, textureY); // Import Box355
		bodyModel[108] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box356
		bodyModel[109] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box357
		bodyModel[110] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box358
		bodyModel[111] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box359
		bodyModel[112] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box360
		bodyModel[113] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box361
		bodyModel[114] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box362
		bodyModel[115] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box363
		bodyModel[116] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box364
		bodyModel[117] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box365
		bodyModel[118] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box366
		bodyModel[119] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box367
		bodyModel[120] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box368
		bodyModel[121] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box369
		bodyModel[122] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box370
		bodyModel[123] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box371
		bodyModel[124] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box374
		bodyModel[125] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box375
		bodyModel[126] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box377
		bodyModel[127] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box378
		bodyModel[128] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box404
		bodyModel[129] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box405
		bodyModel[130] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box406
		bodyModel[131] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box407
		bodyModel[132] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box408
		bodyModel[133] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box409
		bodyModel[134] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box410
		bodyModel[135] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box411
		bodyModel[136] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box412
		bodyModel[137] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box413
		bodyModel[138] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box414
		bodyModel[139] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box415
		bodyModel[140] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box416
		bodyModel[141] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box417
		bodyModel[142] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box418
		bodyModel[143] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box419
		bodyModel[144] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box420
		bodyModel[145] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box421
		bodyModel[146] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box422
		bodyModel[147] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box423
		bodyModel[148] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box424
		bodyModel[149] = new ModelRendererTurbo(this, 21, 389, textureX, textureY); // Import Box425
		bodyModel[150] = new ModelRendererTurbo(this, 21, 398, textureX, textureY); // Import Box426
		bodyModel[151] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box427
		bodyModel[152] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box428
		bodyModel[153] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box429
		bodyModel[154] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box430
		bodyModel[155] = new ModelRendererTurbo(this, 24, 418, textureX, textureY); // Import Box431
		bodyModel[156] = new ModelRendererTurbo(this, 0, 418, textureX, textureY); // Import Box432
		bodyModel[157] = new ModelRendererTurbo(this, 0, 418, textureX, textureY); // Import Box433
		bodyModel[158] = new ModelRendererTurbo(this, 370, 368, textureX, textureY); // Import Box434
		bodyModel[159] = new ModelRendererTurbo(this, 365, 376, textureX, textureY); // Import Box435
		bodyModel[160] = new ModelRendererTurbo(this, 365, 368, textureX, textureY); // Import Box436
		bodyModel[161] = new ModelRendererTurbo(this, 467, 369, textureX, textureY); // Import Box14
		bodyModel[162] = new ModelRendererTurbo(this, 467, 388, textureX, textureY); // Import Box15
		bodyModel[163] = new ModelRendererTurbo(this, 467, 382, textureX, textureY); // Import Box16
		bodyModel[164] = new ModelRendererTurbo(this, 431, 382, textureX, textureY); // Import Box27
		bodyModel[165] = new ModelRendererTurbo(this, 431, 369, textureX, textureY); // Import Box28
		bodyModel[166] = new ModelRendererTurbo(this, 431, 388, textureX, textureY); // Import Box29
		bodyModel[167] = new ModelRendererTurbo(this, 91, 414, textureX, textureY); // Import Box446
		bodyModel[168] = new ModelRendererTurbo(this, 71, 414, textureX, textureY); // Import Box447
		bodyModel[169] = new ModelRendererTurbo(this, 56, 414, textureX, textureY); // Import Box448
		bodyModel[170] = new ModelRendererTurbo(this, 306, 376, textureX, textureY); // Import Box449
		bodyModel[171] = new ModelRendererTurbo(this, 306, 372, textureX, textureY); // Import Box450
		bodyModel[172] = new ModelRendererTurbo(this, 306, 366, textureX, textureY); // Import Box451
		bodyModel[173] = new ModelRendererTurbo(this, 306, 376, textureX, textureY); // Import Box452
		bodyModel[174] = new ModelRendererTurbo(this, 268, 367, textureX, textureY); // Import Box453
		bodyModel[175] = new ModelRendererTurbo(this, 268, 378, textureX, textureY); // Import Box454
		bodyModel[176] = new ModelRendererTurbo(this, 268, 373, textureX, textureY); // Import Box455
		bodyModel[177] = new ModelRendererTurbo(this, 268, 378, textureX, textureY); // Import Box456
		bodyModel[178] = new ModelRendererTurbo(this, 1, 359, textureX, textureY); // Import Box78
		bodyModel[179] = new ModelRendererTurbo(this, 29, 362, textureX, textureY); // Import Box79
		bodyModel[180] = new ModelRendererTurbo(this, 24, 363, textureX, textureY); // Import Box80
		bodyModel[181] = new ModelRendererTurbo(this, 24, 363, textureX, textureY); // Import Box81
		bodyModel[182] = new ModelRendererTurbo(this, 14, 354, textureX, textureY); // Import Box82
		bodyModel[183] = new ModelRendererTurbo(this, 14, 360, textureX, textureY); // Import Box83
		bodyModel[184] = new ModelRendererTurbo(this, 14, 364, textureX, textureY); // Import Box84
		bodyModel[185] = new ModelRendererTurbo(this, 452, 382, textureX, textureY); // Import Box464
		bodyModel[186] = new ModelRendererTurbo(this, 488, 382, textureX, textureY); // Import Box465
		bodyModel[187] = new ModelRendererTurbo(this, 488, 392, textureX, textureY); // Import Box466
		bodyModel[188] = new ModelRendererTurbo(this, 488, 387, textureX, textureY); // Import Box467
		bodyModel[189] = new ModelRendererTurbo(this, 452, 387, textureX, textureY); // Import Box468
		bodyModel[190] = new ModelRendererTurbo(this, 452, 392, textureX, textureY); // Import Box469
		bodyModel[191] = new ModelRendererTurbo(this, 329, 443, textureX, textureY); // Import Box474
		bodyModel[192] = new ModelRendererTurbo(this, 329, 451, textureX, textureY); // Import Box475
		bodyModel[193] = new ModelRendererTurbo(this, 329, 451, textureX, textureY); // Import Box476
		bodyModel[194] = new ModelRendererTurbo(this, 329, 443, textureX, textureY); // Import Box477
		bodyModel[195] = new ModelRendererTurbo(this, 329, 457, textureX, textureY); // Import Box478
		bodyModel[196] = new ModelRendererTurbo(this, 329, 457, textureX, textureY); // Import Box479
		bodyModel[197] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Import Box426
		bodyModel[198] = new ModelRendererTurbo(this, 0, 464, textureX, textureY); // Import Box427
		bodyModel[199] = new ModelRendererTurbo(this, 375, 402, textureX, textureY); // Import Box465
		bodyModel[200] = new ModelRendererTurbo(this, 375, 419, textureX, textureY); // Import Box466
		bodyModel[201] = new ModelRendererTurbo(this, 375, 436, textureX, textureY); // Import Box467
		bodyModel[202] = new ModelRendererTurbo(this, 400, 402, textureX, textureY); // Import Box470
		bodyModel[203] = new ModelRendererTurbo(this, 400, 402, textureX, textureY); // Import Box471
		bodyModel[204] = new ModelRendererTurbo(this, 375, 419, textureX, textureY); // Import Box472
		bodyModel[205] = new ModelRendererTurbo(this, 375, 402, textureX, textureY); // Import Box473
		bodyModel[206] = new ModelRendererTurbo(this, 375, 436, textureX, textureY); // Import Box474
		bodyModel[207] = new ModelRendererTurbo(this, 400, 414, textureX, textureY); // Import Box475
		bodyModel[208] = new ModelRendererTurbo(this, 400, 414, textureX, textureY); // Import Box476
		bodyModel[209] = new ModelRendererTurbo(this, 400, 414, textureX, textureY); // Import Box477
		bodyModel[210] = new ModelRendererTurbo(this, 400, 414, textureX, textureY); // Import Box478
		bodyModel[211] = new ModelRendererTurbo(this, 420, 421, textureX, textureY); // Import Box482
		bodyModel[212] = new ModelRendererTurbo(this, 400, 421, textureX, textureY); // Import Box483
		bodyModel[213] = new ModelRendererTurbo(this, 400, 439, textureX, textureY); // Import Box485
		bodyModel[214] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box486
		bodyModel[215] = new ModelRendererTurbo(this, 400, 432, textureX, textureY); // Import Box487
		bodyModel[216] = new ModelRendererTurbo(this, 420, 434, textureX, textureY); // Import Box488
		bodyModel[217] = new ModelRendererTurbo(this, 420, 434, textureX, textureY); // Import Box489
		bodyModel[218] = new ModelRendererTurbo(this, 420, 421, textureX, textureY); // Import Box490
		bodyModel[219] = new ModelRendererTurbo(this, 420, 421, textureX, textureY); // Import Box491
		bodyModel[220] = new ModelRendererTurbo(this, 420, 421, textureX, textureY); // Import Box492
		bodyModel[221] = new ModelRendererTurbo(this, 400, 421, textureX, textureY); // Import Box493
		bodyModel[222] = new ModelRendererTurbo(this, 400, 432, textureX, textureY); // Import Box494
		bodyModel[223] = new ModelRendererTurbo(this, 420, 434, textureX, textureY); // Import Box495
		bodyModel[224] = new ModelRendererTurbo(this, 420, 434, textureX, textureY); // Import Box496
		bodyModel[225] = new ModelRendererTurbo(this, 420, 421, textureX, textureY); // Import Box497
		bodyModel[226] = new ModelRendererTurbo(this, 420, 421, textureX, textureY); // Import Box498
		bodyModel[227] = new ModelRendererTurbo(this, 400, 421, textureX, textureY); // Import Box499
		bodyModel[228] = new ModelRendererTurbo(this, 400, 432, textureX, textureY); // Import Box500
		bodyModel[229] = new ModelRendererTurbo(this, 420, 434, textureX, textureY); // Import Box501
		bodyModel[230] = new ModelRendererTurbo(this, 420, 434, textureX, textureY); // Import Box502
		bodyModel[231] = new ModelRendererTurbo(this, 420, 421, textureX, textureY); // Import Box503
		bodyModel[232] = new ModelRendererTurbo(this, 400, 421, textureX, textureY); // Import Box504
		bodyModel[233] = new ModelRendererTurbo(this, 420, 421, textureX, textureY); // Import Box505
		bodyModel[234] = new ModelRendererTurbo(this, 420, 434, textureX, textureY); // Import Box506
		bodyModel[235] = new ModelRendererTurbo(this, 400, 432, textureX, textureY); // Import Box507
		bodyModel[236] = new ModelRendererTurbo(this, 420, 434, textureX, textureY); // Import Box508
		bodyModel[237] = new ModelRendererTurbo(this, 400, 450, textureX, textureY); // Import Box509
		bodyModel[238] = new ModelRendererTurbo(this, 400, 439, textureX, textureY); // Import Box510
		bodyModel[239] = new ModelRendererTurbo(this, 400, 414, textureX, textureY); // Import Box511
		bodyModel[240] = new ModelRendererTurbo(this, 400, 414, textureX, textureY); // Import Box512
		bodyModel[241] = new ModelRendererTurbo(this, 400, 414, textureX, textureY); // Import Box513
		bodyModel[242] = new ModelRendererTurbo(this, 400, 414, textureX, textureY); // Import Box514
		bodyModel[243] = new ModelRendererTurbo(this, 418, 441, textureX, textureY); // Import Box515
		bodyModel[244] = new ModelRendererTurbo(this, 418, 441, textureX, textureY); // Import Box516
		bodyModel[245] = new ModelRendererTurbo(this, 380, 466, textureX, textureY); // Import Box518
		bodyModel[246] = new ModelRendererTurbo(this, 380, 457, textureX, textureY); // Import Box519
		bodyModel[247] = new ModelRendererTurbo(this, 380, 466, textureX, textureY); // Import Box520
		bodyModel[248] = new ModelRendererTurbo(this, 396, 479, textureX, textureY); // Import Box521
		bodyModel[249] = new ModelRendererTurbo(this, 402, 461, textureX, textureY); // Import Box522
		bodyModel[250] = new ModelRendererTurbo(this, 380, 457, textureX, textureY); // Import Box523
		bodyModel[251] = new ModelRendererTurbo(this, 380, 476, textureX, textureY); // Import Box524
		bodyModel[252] = new ModelRendererTurbo(this, 396, 470, textureX, textureY); // Import Box525
		bodyModel[253] = new ModelRendererTurbo(this, 380, 476, textureX, textureY); // Import Box526
		bodyModel[254] = new ModelRendererTurbo(this, 361, 439, textureX, textureY); // Import Box527
		bodyModel[255] = new ModelRendererTurbo(this, 361, 431, textureX, textureY); // Import Box529
		bodyModel[256] = new ModelRendererTurbo(this, 361, 431, textureX, textureY); // Import Box530
		bodyModel[257] = new ModelRendererTurbo(this, 361, 439, textureX, textureY); // Import Box531
		bodyModel[258] = new ModelRendererTurbo(this, 361, 431, textureX, textureY); // Import Box532
		bodyModel[259] = new ModelRendererTurbo(this, 361, 439, textureX, textureY); // Import Box533
		bodyModel[260] = new ModelRendererTurbo(this, 361, 431, textureX, textureY); // Import Box534
		bodyModel[261] = new ModelRendererTurbo(this, 361, 439, textureX, textureY); // Import Box535
		bodyModel[262] = new ModelRendererTurbo(this, 479, 402, textureX, textureY); // Import Box536
		bodyModel[263] = new ModelRendererTurbo(this, 458, 398, textureX, textureY); // Import Box537
		bodyModel[264] = new ModelRendererTurbo(this, 458, 398, textureX, textureY); // Import Box538
		bodyModel[265] = new ModelRendererTurbo(this, 479, 402, textureX, textureY); // Import Box539
		bodyModel[266] = new ModelRendererTurbo(this, 458, 408, textureX, textureY); // Import Box540
		bodyModel[267] = new ModelRendererTurbo(this, 458, 408, textureX, textureY); // Import Box541
		bodyModel[268] = new ModelRendererTurbo(this, 10, 470, textureX, textureY); // Import Box542
		bodyModel[269] = new ModelRendererTurbo(this, 0, 470, textureX, textureY); // Import Box543
		bodyModel[270] = new ModelRendererTurbo(this, 0, 479, textureX, textureY); // Import Box544
		bodyModel[271] = new ModelRendererTurbo(this, 0, 488, textureX, textureY); // Import Box537
		bodyModel[272] = new ModelRendererTurbo(this, 181, 416, textureX, textureY); // Import Box413
		bodyModel[273] = new ModelRendererTurbo(this, 176, 416, textureX, textureY); // Import Box583
		bodyModel[274] = new ModelRendererTurbo(this, 176, 416, textureX, textureY); // Import Box584
		bodyModel[275] = new ModelRendererTurbo(this, 188, 416, textureX, textureY); // Import Box585
		bodyModel[276] = new ModelRendererTurbo(this, 181, 416, textureX, textureY); // Import Box543
		bodyModel[277] = new ModelRendererTurbo(this, 176, 416, textureX, textureY); // Import Box544
		bodyModel[278] = new ModelRendererTurbo(this, 188, 416, textureX, textureY); // Import Box545
		bodyModel[279] = new ModelRendererTurbo(this, 176, 416, textureX, textureY); // Import Box546
		bodyModel[280] = new ModelRendererTurbo(this, 181, 416, textureX, textureY); // Import Box547
		bodyModel[281] = new ModelRendererTurbo(this, 176, 416, textureX, textureY); // Import Box548
		bodyModel[282] = new ModelRendererTurbo(this, 188, 416, textureX, textureY); // Import Box549
		bodyModel[283] = new ModelRendererTurbo(this, 176, 416, textureX, textureY); // Import Box550
		bodyModel[284] = new ModelRendererTurbo(this, 181, 416, textureX, textureY); // Import Box551
		bodyModel[285] = new ModelRendererTurbo(this, 176, 416, textureX, textureY); // Import Box552
		bodyModel[286] = new ModelRendererTurbo(this, 188, 416, textureX, textureY); // Import Box553
		bodyModel[287] = new ModelRendererTurbo(this, 176, 416, textureX, textureY); // Import Box554
		bodyModel[288] = new ModelRendererTurbo(this, 115, 407, textureX, textureY); // Import Box887
		bodyModel[289] = new ModelRendererTurbo(this, 104, 414, textureX, textureY); // Import Box888
		bodyModel[290] = new ModelRendererTurbo(this, 115, 414, textureX, textureY); // Import Box889
		bodyModel[291] = new ModelRendererTurbo(this, 104, 410, textureX, textureY); // Import Box890
		bodyModel[292] = new ModelRendererTurbo(this, 104, 407, textureX, textureY); // Import Box891
		bodyModel[293] = new ModelRendererTurbo(this, 115, 410, textureX, textureY); // Import Box892
		bodyModel[294] = new ModelRendererTurbo(this, 104, 418, textureX, textureY); // Import Box893
		bodyModel[295] = new ModelRendererTurbo(this, 79, 400, textureX, textureY); // Import Box896
		bodyModel[296] = new ModelRendererTurbo(this, 91, 400, textureX, textureY); // Import Box897
		bodyModel[297] = new ModelRendererTurbo(this, 91, 400, textureX, textureY); // Import Box898
		bodyModel[298] = new ModelRendererTurbo(this, 88, 409, textureX, textureY); // Import Box899
		bodyModel[299] = new ModelRendererTurbo(this, 88, 409, textureX, textureY); // Import Box900

		bodyModel[0].addShapeBox(0F, 0F, 0F, 125, 23, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -12F, 0F, 0F); // Import Box0
		bodyModel[0].setRotationPoint(-70F, -22.5F, -18F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 8, 11, 36, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box1
		bodyModel[1].setRotationPoint(55F, -22.5F, -18F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 15, 11, 36, 0F,0F, -1.75F, 0F, -0.125F, -10F, 0F, -0.125F, -10F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F); // Import Box2
		bodyModel[2].setRotationPoint(63F, -22.5F, -18F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 22, 12, 36, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10.5F, 0F, 0F, -10.5F, 0F, 0F, 0F, 0F, 0F); // Import Box3
		bodyModel[3].setRotationPoint(55F, -11.5F, -18F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 125, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.25F, 0.05F, 0F, 14F, -3.25F, -0.1F, 14F, -3.25F, 0F, -5.25F, 0.05F, 0F); // Import Box4
		bodyModel[4].setRotationPoint(-70F, -22.5F, -26F);

		bodyModel[5].addShapeBox(0F, 0F, -8F, 125, 10, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -5.25F, 0.05F, 0F, 14F, -3.25F, 0F, 14F, -3.25F, -0.1F, -5.25F, 0.05F, 0F); // Import Box5
		bodyModel[5].setRotationPoint(-70F, -22.5F, 26F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.775F, -0.1F, 0F, 2.875F, -0.1F, 0F, 2.875F, 0F, 0F, -0.775F, 0F); // Import Box6
		bodyModel[6].setRotationPoint(55F, -22.5F, -26F);

		bodyModel[7].addShapeBox(0F, 0F, -8F, 8, 1, 8, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, -0.775F, 0F, 0F, 2.875F, 0F, 0F, 2.875F, -0.1F, 0F, -0.775F, -0.1F); // Import Box7
		bodyModel[7].setRotationPoint(55F, -22.5F, 26F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 15, 1, 8, 0F,0F, -1.75F, 0F, -0.125F, -10F, 0F, -0.125F, -10F, 0F, 0F, -1.75F, 0F, 0F, 2.875F, -0.1F, -1F, 10F, 0F, -1F, 10F, 0F, 0F, 2.875F, 0F); // Import Box8
		bodyModel[8].setRotationPoint(63F, -22.5F, -26F);

		bodyModel[9].addShapeBox(0F, 0F, -8F, 15, 1, 8, 0F,0F, -1.75F, 0F, -0.125F, -10F, 0F, -0.125F, -10F, 0F, 0F, -1.75F, 0F, 0F, 2.875F, 0F, -1F, 10F, 0F, -1F, 10F, 0F, 0F, 2.875F, -0.1F); // Import Box9
		bodyModel[9].setRotationPoint(63F, -22.5F, 26F);

		bodyModel[10].addBox(0F, -1.25F, -1F, 88, 5, 2, 0F); // Import Box66
		bodyModel[10].setRotationPoint(-41F, -7F, -18F);

		bodyModel[11].addShapeBox(-3F, -1.25F, -1F, 3, 5, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box67
		bodyModel[11].setRotationPoint(-41F, -7F, -18F);

		bodyModel[12].addShapeBox(-3F, -1.25F, -1F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box68
		bodyModel[12].setRotationPoint(50F, -7F, -18F);

		bodyModel[13].addShapeBox(-3F, -1.25F, 0F, 4, 5, 2, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box73
		bodyModel[13].setRotationPoint(50F, -7F, 17F);

		bodyModel[14].addBox(0F, -1.25F, 0F, 88, 5, 2, 0F); // Import Box74
		bodyModel[14].setRotationPoint(-41F, -7F, 17F);

		bodyModel[15].addShapeBox(-3F, -1.25F, 0F, 3, 5, 2, 0F,0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F); // Import Box75
		bodyModel[15].setRotationPoint(-41F, -7F, 17F);

		bodyModel[16].addBox(-5F, -1.5F, -0.5F, 7, 9, 2, 0F); // Import Box174
		bodyModel[16].setRotationPoint(48F, -5F, -18F);

		bodyModel[17].addShapeBox(-5F, 0.5F, -0.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box175
		bodyModel[17].setRotationPoint(48F, 2F, -18F);

		bodyModel[18].addShapeBox(-5F, 0.5F, -0.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box176
		bodyModel[18].setRotationPoint(36F, 2F, -18F);

		bodyModel[19].addBox(-5F, -1.5F, -0.5F, 7, 9, 2, 0F); // Import Box177
		bodyModel[19].setRotationPoint(36F, -5F, -18F);

		bodyModel[20].addShapeBox(-5F, 0.5F, -0.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box178
		bodyModel[20].setRotationPoint(11F, 2F, -18F);

		bodyModel[21].addBox(-5F, -1.5F, -0.5F, 7, 9, 2, 0F); // Import Box179
		bodyModel[21].setRotationPoint(11F, -5F, -18F);

		bodyModel[22].addShapeBox(-5F, 0.5F, -0.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box180
		bodyModel[22].setRotationPoint(23F, 2F, -18F);

		bodyModel[23].addBox(-5F, -1.5F, -0.5F, 7, 9, 2, 0F); // Import Box181
		bodyModel[23].setRotationPoint(23F, -5F, -18F);

		bodyModel[24].addShapeBox(-5F, 0.5F, -0.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box182
		bodyModel[24].setRotationPoint(-14F, 2F, -18F);

		bodyModel[25].addBox(-5F, -1.5F, -0.5F, 7, 9, 2, 0F); // Import Box183
		bodyModel[25].setRotationPoint(-14F, -5F, -18F);

		bodyModel[26].addShapeBox(-5F, 0.5F, -0.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box184
		bodyModel[26].setRotationPoint(-2F, 2F, -18F);

		bodyModel[27].addBox(-5F, -1.5F, -0.5F, 7, 9, 2, 0F); // Import Box185
		bodyModel[27].setRotationPoint(-2F, -5F, -18F);

		bodyModel[28].addShapeBox(-5F, 0.5F, -0.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box186
		bodyModel[28].setRotationPoint(-38F, 2F, -18F);

		bodyModel[29].addBox(-5F, -1.5F, -0.5F, 7, 9, 2, 0F); // Import Box187
		bodyModel[29].setRotationPoint(-38F, -5F, -18F);

		bodyModel[30].addShapeBox(-5F, 0.5F, -0.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box188
		bodyModel[30].setRotationPoint(-26F, 2F, -18F);

		bodyModel[31].addBox(-5F, -1.5F, -0.5F, 7, 9, 2, 0F); // Import Box189
		bodyModel[31].setRotationPoint(-26F, -5F, -18F);

		bodyModel[32].addShapeBox(-5F, 0.5F, -1.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box190
		bodyModel[32].setRotationPoint(-38F, 2F, 18F);

		bodyModel[33].addBox(-5F, -1.5F, -1.5F, 7, 9, 2, 0F); // Import Box191
		bodyModel[33].setRotationPoint(-38F, -5F, 18F);

		bodyModel[34].addShapeBox(-5F, 0.5F, -1.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box192
		bodyModel[34].setRotationPoint(-26F, 2F, 18F);

		bodyModel[35].addBox(-5F, -1.5F, -1.5F, 7, 9, 2, 0F); // Import Box193
		bodyModel[35].setRotationPoint(-26F, -5F, 18F);

		bodyModel[36].addBox(-5F, -1.5F, -1.5F, 7, 9, 2, 0F); // Import Box194
		bodyModel[36].setRotationPoint(-14F, -5F, 18F);

		bodyModel[37].addShapeBox(-5F, 0.5F, -1.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box195
		bodyModel[37].setRotationPoint(-14F, 2F, 18F);

		bodyModel[38].addBox(-5F, -1.5F, -1.5F, 7, 9, 2, 0F); // Import Box196
		bodyModel[38].setRotationPoint(-2F, -5F, 18F);

		bodyModel[39].addShapeBox(-5F, 0.5F, -1.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box197
		bodyModel[39].setRotationPoint(-2F, 2F, 18F);

		bodyModel[40].addBox(-5F, -1.5F, -1.5F, 7, 9, 2, 0F); // Import Box198
		bodyModel[40].setRotationPoint(11F, -5F, 18F);

		bodyModel[41].addShapeBox(-5F, 0.5F, -1.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box199
		bodyModel[41].setRotationPoint(11F, 2F, 18F);

		bodyModel[42].addBox(-5F, -1.5F, -1.5F, 7, 9, 2, 0F); // Import Box200
		bodyModel[42].setRotationPoint(23F, -5F, 18F);

		bodyModel[43].addShapeBox(-5F, 0.5F, -1.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box201
		bodyModel[43].setRotationPoint(23F, 2F, 18F);

		bodyModel[44].addBox(-5F, -1.5F, -1.5F, 7, 9, 2, 0F); // Import Box202
		bodyModel[44].setRotationPoint(36F, -5F, 18F);

		bodyModel[45].addShapeBox(-5F, 0.5F, -1.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box203
		bodyModel[45].setRotationPoint(36F, 2F, 18F);

		bodyModel[46].addBox(-5F, -1.5F, -1.5F, 7, 9, 2, 0F); // Import Box204
		bodyModel[46].setRotationPoint(48F, -5F, 18F);

		bodyModel[47].addShapeBox(-5F, 0.5F, -1.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box205
		bodyModel[47].setRotationPoint(48F, 2F, 18F);

		bodyModel[48].addBox(-5F, -8.5F, -0.5F, 7, 13, 2, 0F); // Import Box220
		bodyModel[48].setRotationPoint(-53F, -5F, -18F);

		bodyModel[49].addShapeBox(-5F, -1.5F, -0.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box221
		bodyModel[49].setRotationPoint(-53F, 1F, -18F);

		bodyModel[50].addBox(-5F, -8.5F, -1.5F, 7, 13, 2, 0F); // Import Box222
		bodyModel[50].setRotationPoint(-53F, -5F, 18F);

		bodyModel[51].addShapeBox(-5F, -1.5F, -1.5F, 7, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box223
		bodyModel[51].setRotationPoint(-53F, 1F, 18F);

		bodyModel[52].addShapeBox(0F, 0F, -8F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, -1.075F, 0F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.075F, 0F, 0F); // Import Box198
		bodyModel[52].setRotationPoint(-64.76F, -12.45F, 26F);

		bodyModel[53].addShapeBox(0F, 0F, 0F, 2, 2, 8, 0F,0F, 0F, 0F, 0F, 0.05F, 0F, 0F, 0.05F, 0F, 0F, 0F, 0F, -1.075F, 0F, 0F, 1.075F, 0F, 0F, 1.075F, 0F, 0F, -1.075F, 0F, 0F); // Import Box199
		bodyModel[53].setRotationPoint(-64.76F, -12.45F, -26F);

		bodyModel[54].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box132
		bodyModel[54].setRotationPoint(-45F, -24F, -21F);

		bodyModel[55].addShapeBox(-6F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box133
		bodyModel[55].setRotationPoint(-45F, -24F, -21F);

		bodyModel[56].addShapeBox(-9F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box134
		bodyModel[56].setRotationPoint(-45F, -24F, -21F);

		bodyModel[57].addShapeBox(0F, 0F, 0F, 13, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box135
		bodyModel[57].setRotationPoint(-49F, -23F, -7F);

		bodyModel[58].addShapeBox(-1F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box136
		bodyModel[58].setRotationPoint(-50F, -23F, -7F);

		bodyModel[59].addShapeBox(1F, 0.2F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Import Box119
		bodyModel[59].setRotationPoint(-46F, -24F, -2.5F);

		bodyModel[60].addShapeBox(-3F, 0.2F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box120
		bodyModel[60].setRotationPoint(-45F, -24F, -2.5F);

		bodyModel[61].addShapeBox(-4F, 0.2F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Import Box121
		bodyModel[61].setRotationPoint(-45F, -24F, -2.5F);

		bodyModel[62].addShapeBox(-3F, 0.8F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box151
		bodyModel[62].setRotationPoint(-54F, -24F, -2.5F);

		bodyModel[63].addShapeBox(0F, 0.8F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box152
		bodyModel[63].setRotationPoint(-54F, -24F, -2.5F);

		bodyModel[64].addShapeBox(-3.5F, 0.2F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Import Box26
		bodyModel[64].setRotationPoint(-37.5F, -24F, -2.5F);

		bodyModel[65].addShapeBox(-2.5F, 0.2F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box27
		bodyModel[65].setRotationPoint(-37.5F, -24F, -2.5F);

		bodyModel[66].addShapeBox(1.5F, 0.2F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Import Box28
		bodyModel[66].setRotationPoint(-38.5F, -24F, -2.5F);

		bodyModel[67].addShapeBox(-9F, 0F, 0F, 3, 1, 12, 0F,0.5F, 0F, -2.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -2.5F); // Import Box308
		bodyModel[67].setRotationPoint(-45F, -23F, -21F);

		bodyModel[68].addShapeBox(-6F, 0F, 0F, 6, 1, 12, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box309
		bodyModel[68].setRotationPoint(-45F, -23F, -21F);

		bodyModel[69].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-0.5F, 0F, 0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, -0.5F, 0F, 0.5F); // Import Box311
		bodyModel[69].setRotationPoint(-45F, -23F, -21F);

		bodyModel[70].addShapeBox(14F, 0F, 0F, 2, 1, 14, 0F,0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F); // Import Box312
		bodyModel[70].setRotationPoint(-50F, -23F, -7F);

		bodyModel[71].addShapeBox(-4F, 0.8F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box313
		bodyModel[71].setRotationPoint(-54F, -24F, -2.5F);

		bodyModel[72].addShapeBox(-4.5F, -0.9F, -0.5F, 1, 1, 6, 0F,0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F); // Import Box314
		bodyModel[72].setRotationPoint(-54F, -23F, -2.5F);

		bodyModel[73].addShapeBox(-3.5F, -0.9F, -0.5F, 4, 1, 6, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box315
		bodyModel[73].setRotationPoint(-54F, -23F, -2.5F);

		bodyModel[74].addShapeBox(0.5F, -0.9F, -0.5F, 1, 1, 6, 0F,0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F); // Import Box316
		bodyModel[74].setRotationPoint(-54F, -23F, -2.5F);

		bodyModel[75].addShapeBox(-1F, 0F, 0F, 16, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box318
		bodyModel[75].setRotationPoint(-56F, -22.75F, -23F);

		bodyModel[76].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F); // Import Box321
		bodyModel[76].setRotationPoint(-45F, -24F, 9F);

		bodyModel[77].addShapeBox(-6F, 0F, 0F, 6, 1, 12, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		bodyModel[77].setRotationPoint(-45F, -24F, 9F);

		bodyModel[78].addShapeBox(-9F, 0F, 0F, 3, 1, 12, 0F,0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F); // Import Box323
		bodyModel[78].setRotationPoint(-45F, -24F, 9F);

		bodyModel[79].addShapeBox(-9F, 0F, 0F, 3, 1, 12, 0F,0.5F, 0F, -2.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -2.5F); // Import Box324
		bodyModel[79].setRotationPoint(-45F, -23F, 9F);

		bodyModel[80].addShapeBox(-6F, 0F, 0F, 6, 1, 12, 0F,0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F, 0.5F, 0F, 0.5F); // Import Box325
		bodyModel[80].setRotationPoint(-45F, -23F, 9F);

		bodyModel[81].addShapeBox(0F, 0F, 0F, 3, 1, 12, 0F,-0.5F, 0F, 0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, 0.5F, 0F, -2.5F, 0.5F, 0F, -2.5F, -0.5F, 0F, 0.5F); // Import Box326
		bodyModel[81].setRotationPoint(-45F, -23F, 9F);

		bodyModel[82].addShapeBox(-1F, 0F, 0F, 16, 1, 15, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box327
		bodyModel[82].setRotationPoint(-56F, -22.75F, 8F);

		bodyModel[83].addShapeBox(-4F, 0F, 0F, 1, 1, 5, 0F,0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F); // Import Box328
		bodyModel[83].setRotationPoint(-59F, -23.9F, -7.5F);

		bodyModel[84].addShapeBox(-3F, 0F, 0F, 3, 1, 5, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box329
		bodyModel[84].setRotationPoint(-59F, -23.9F, -7.5F);

		bodyModel[85].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F); // Import Box330
		bodyModel[85].setRotationPoint(-59F, -23.9F, -7.5F);

		bodyModel[86].addShapeBox(-3.5F, 0.5F, 0.5F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box331
		bodyModel[86].setRotationPoint(-59F, -23.9F, -7.5F);

		bodyModel[87].addShapeBox(-2.5F, 0.5F, 0.5F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box332
		bodyModel[87].setRotationPoint(-59F, -23.9F, -7.5F);

		bodyModel[88].addShapeBox(-0.5F, 0.5F, 0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box333
		bodyModel[88].setRotationPoint(-59F, -23.9F, -7.5F);

		bodyModel[89].addShapeBox(-4F, 0F, 0F, 1, 1, 5, 0F,0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F); // Import Box334
		bodyModel[89].setRotationPoint(-59F, -23.9F, 2.5F);

		bodyModel[90].addShapeBox(-3F, 0F, 0F, 3, 1, 5, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box335
		bodyModel[90].setRotationPoint(-59F, -23.9F, 2.5F);

		bodyModel[91].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F); // Import Box336
		bodyModel[91].setRotationPoint(-59F, -23.9F, 2.5F);

		bodyModel[92].addShapeBox(-3.5F, 0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box337
		bodyModel[92].setRotationPoint(-59F, -23.9F, 3.5F);

		bodyModel[93].addShapeBox(-2.5F, 0.5F, -0.5F, 2, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box338
		bodyModel[93].setRotationPoint(-59F, -23.9F, 3.5F);

		bodyModel[94].addShapeBox(-0.5F, 0.5F, -0.5F, 1, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box339
		bodyModel[94].setRotationPoint(-59F, -23.9F, 3.5F);

		bodyModel[95].addShapeBox(-4F, 0F, 0F, 1, 1, 5, 0F,0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0.1F, -0.125F, -0.9F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0.1F, -0.125F, -0.9F); // Import Box340
		bodyModel[95].setRotationPoint(-59F, -23F, 2.5F);

		bodyModel[96].addShapeBox(-3F, 0F, 0F, 3, 1, 5, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F); // Import Box341
		bodyModel[96].setRotationPoint(-59F, -23F, 2.5F);

		bodyModel[97].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0.1F, 0.1F, -0.125F, -0.9F, 0.1F, -0.125F, -0.9F, 0F, -0.125F, 0.1F); // Import Box342
		bodyModel[97].setRotationPoint(-59F, -23F, 2.5F);

		bodyModel[98].addShapeBox(-4F, 0F, 0F, 1, 1, 5, 0F,0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0.1F, -0.125F, -0.9F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0.1F, -0.125F, -0.9F); // Import Box346
		bodyModel[98].setRotationPoint(-59F, -23F, -7.5F);

		bodyModel[99].addShapeBox(-3F, 0F, 0F, 3, 1, 5, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F, 0F, -0.125F, 0.1F); // Import Box347
		bodyModel[99].setRotationPoint(-59F, -23F, -7.5F);

		bodyModel[100].addShapeBox(0F, 0F, 0F, 1, 1, 5, 0F,0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0.1F, 0.1F, -0.125F, -0.9F, 0.1F, -0.125F, -0.9F, 0F, -0.125F, 0.1F); // Import Box348
		bodyModel[100].setRotationPoint(-59F, -23F, -7.5F);

		bodyModel[101].addShapeBox(-4.5F, 0.1F, -0.5F, 1, 1, 6, 0F,0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F); // Import Box349
		bodyModel[101].setRotationPoint(-54F, -23F, -2.5F);

		bodyModel[102].addShapeBox(-3.5F, 0.1F, -0.5F, 4, 1, 6, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box350
		bodyModel[102].setRotationPoint(-54F, -23F, -2.5F);

		bodyModel[103].addShapeBox(0.5F, 0.1F, -0.5F, 1, 1, 6, 0F,0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F); // Import Box351
		bodyModel[103].setRotationPoint(-54F, -23F, -2.5F);

		bodyModel[104].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box352
		bodyModel[104].setRotationPoint(-67F, -22.6F, -22F);

		bodyModel[105].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box353
		bodyModel[105].setRotationPoint(-67F, -22.6F, 9F);

		bodyModel[106].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box354
		bodyModel[106].setRotationPoint(-40.5F, -22.6F, 9F);

		bodyModel[107].addShapeBox(0F, 0F, 0F, 9, 1, 13, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box355
		bodyModel[107].setRotationPoint(-40.5F, -22.6F, -22F);

		bodyModel[108].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box356
		bodyModel[108].setRotationPoint(-63.5F, -19F, 25F);

		bodyModel[109].addShapeBox(-0.5F, -0.5F, -1.2F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box357
		bodyModel[109].setRotationPoint(-63.5F, -19F, 26F);

		bodyModel[110].addShapeBox(-0.5F, -2.5F, -1.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box358
		bodyModel[110].setRotationPoint(-63.5F, -19F, 26F);

		bodyModel[111].addShapeBox(-0.5F, -2.5F, -1.5F, 2, 2, 2, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box359
		bodyModel[111].setRotationPoint(-62.5F, -14F, 26F);

		bodyModel[112].addShapeBox(-0.5F, -2.5F, -1.5F, 2, 2, 2, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box360
		bodyModel[112].setRotationPoint(-33.5F, -14F, 26F);

		bodyModel[113].addShapeBox(-0.5F, -0.5F, -1.2F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box361
		bodyModel[113].setRotationPoint(-33.5F, -19F, 26F);

		bodyModel[114].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box362
		bodyModel[114].setRotationPoint(-33.5F, -19F, 25F);

		bodyModel[115].addShapeBox(-0.5F, -2.5F, -1.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box363
		bodyModel[115].setRotationPoint(-32.5F, -19F, 26F);

		bodyModel[116].addShapeBox(-0.5F, -2.5F, -1.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box364
		bodyModel[116].setRotationPoint(9.5F, -19F, 26F);

		bodyModel[117].addShapeBox(-0.5F, -2.5F, -1.5F, 2, 2, 2, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box365
		bodyModel[117].setRotationPoint(8.5F, -14F, 26F);

		bodyModel[118].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box366
		bodyModel[118].setRotationPoint(8.5F, -19F, 25F);

		bodyModel[119].addShapeBox(-0.5F, -0.5F, -1.2F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box367
		bodyModel[119].setRotationPoint(8.5F, -19F, 26F);

		bodyModel[120].addShapeBox(-0.5F, -2.5F, -1.5F, 2, 2, 2, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box368
		bodyModel[120].setRotationPoint(-20.5F, -14F, 26F);

		bodyModel[121].addShapeBox(-0.5F, -0.5F, -1.2F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box369
		bodyModel[121].setRotationPoint(-21.5F, -19F, 26F);

		bodyModel[122].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box370
		bodyModel[122].setRotationPoint(-21.5F, -19F, 25F);

		bodyModel[123].addShapeBox(-0.5F, -2.5F, -1.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box371
		bodyModel[123].setRotationPoint(-21.5F, -19F, 26F);

		bodyModel[124].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box374
		bodyModel[124].setRotationPoint(50.5F, -19F, 25F);

		bodyModel[125].addShapeBox(-0.5F, -0.5F, -1.2F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box375
		bodyModel[125].setRotationPoint(50.5F, -19F, 26F);

		bodyModel[126].addShapeBox(-0.5F, -0.5F, -1.2F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box377
		bodyModel[126].setRotationPoint(20.5F, -19F, 26F);

		bodyModel[127].addShapeBox(0F, 0F, 0F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box378
		bodyModel[127].setRotationPoint(20.5F, -19F, 25F);

		bodyModel[128].addShapeBox(-0.5F, -2.5F, -2.5F, 2, 2, 2, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box404
		bodyModel[128].setRotationPoint(-62.5F, -14F, -24F);

		bodyModel[129].addShapeBox(-0.5F, -0.5F, -2.8F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box405
		bodyModel[129].setRotationPoint(-63.5F, -19F, -24F);

		bodyModel[130].addShapeBox(0F, 0F, -3F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box406
		bodyModel[130].setRotationPoint(-63.5F, -19F, -25F);

		bodyModel[131].addShapeBox(-0.5F, -2.5F, -2.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box407
		bodyModel[131].setRotationPoint(-63.5F, -19F, -24F);

		bodyModel[132].addShapeBox(-0.5F, -2.5F, -2.5F, 2, 2, 2, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box408
		bodyModel[132].setRotationPoint(-33.5F, -14F, -24F);

		bodyModel[133].addShapeBox(-0.5F, -0.5F, -2.8F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box409
		bodyModel[133].setRotationPoint(-33.5F, -19F, -24F);

		bodyModel[134].addShapeBox(0F, 0F, -3F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box410
		bodyModel[134].setRotationPoint(-33.5F, -19F, -25F);

		bodyModel[135].addShapeBox(-0.5F, -2.5F, -2.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box411
		bodyModel[135].setRotationPoint(-32.5F, -19F, -24F);

		bodyModel[136].addShapeBox(-0.5F, -2.5F, -2.5F, 2, 2, 2, 0F,0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box412
		bodyModel[136].setRotationPoint(-20.5F, -14F, -24F);

		bodyModel[137].addShapeBox(-0.5F, -0.5F, -2.8F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box413
		bodyModel[137].setRotationPoint(-21.5F, -19F, -24F);

		bodyModel[138].addShapeBox(0F, 0F, -3F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box414
		bodyModel[138].setRotationPoint(-21.5F, -19F, -25F);

		bodyModel[139].addShapeBox(-0.5F, -2.5F, -2.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box415
		bodyModel[139].setRotationPoint(-21.5F, -19F, -24F);

		bodyModel[140].addShapeBox(-0.5F, -2.5F, -2.5F, 2, 2, 2, 0F,-0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box416
		bodyModel[140].setRotationPoint(8.5F, -14F, -24F);

		bodyModel[141].addShapeBox(-0.5F, -0.5F, -2.8F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box417
		bodyModel[141].setRotationPoint(8.5F, -19F, -24F);

		bodyModel[142].addShapeBox(0F, 0F, -3F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box418
		bodyModel[142].setRotationPoint(8.5F, -19F, -25F);

		bodyModel[143].addShapeBox(-0.5F, -2.5F, -2.5F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box419
		bodyModel[143].setRotationPoint(9.5F, -19F, -24F);

		bodyModel[144].addShapeBox(-0.75F, -2.5F, -2.5F, 2, 1, 2, 0F,0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box420
		bodyModel[144].setRotationPoint(21.5F, -14F, -24F);

		bodyModel[145].addShapeBox(-0.5F, -0.5F, -2.8F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box421
		bodyModel[145].setRotationPoint(20.5F, -19F, -24F);

		bodyModel[146].addShapeBox(0F, 0F, -3F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box422
		bodyModel[146].setRotationPoint(20.5F, -19F, -25F);

		bodyModel[147].addShapeBox(-0.5F, -3F, -2.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box423
		bodyModel[147].setRotationPoint(20.5F, -19F, -24F);

		bodyModel[148].addShapeBox(-0.25F, -2.5F, -2.5F, 2, 1, 2, 0F,-0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box424
		bodyModel[148].setRotationPoint(50.5F, -14F, -24F);

		bodyModel[149].addShapeBox(0F, 0F, -3F, 2, 2, 3, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Import Box425
		bodyModel[149].setRotationPoint(50.5F, -19F, -25F);

		bodyModel[150].addShapeBox(-0.5F, -0.5F, -2.8F, 3, 3, 2, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F); // Import Box426
		bodyModel[150].setRotationPoint(50.5F, -19F, -24F);

		bodyModel[151].addShapeBox(-0.5F, -3F, -2.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box427
		bodyModel[151].setRotationPoint(51.5F, -19F, -24F);

		bodyModel[152].addShapeBox(-0.5F, -3F, 0.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box428
		bodyModel[152].setRotationPoint(51.5F, -19F, 24F);

		bodyModel[153].addShapeBox(-0.25F, -2.5F, 0.5F, 2, 1, 2, 0F,-0.125F, 0F, 0F, 0.125F, 0F, 0F, 0.125F, 0F, 0F, -0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box429
		bodyModel[153].setRotationPoint(50.5F, -14F, 24F);

		bodyModel[154].addShapeBox(-0.75F, -2.5F, 0.5F, 2, 1, 2, 0F,0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, 0.125F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box430
		bodyModel[154].setRotationPoint(21.5F, -14F, 24F);

		bodyModel[155].addShapeBox(-0.5F, -3F, 0.5F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box431
		bodyModel[155].setRotationPoint(20.5F, -19F, 24F);

		bodyModel[156].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box432
		bodyModel[156].setRotationPoint(-48.75F, -23.5F, -7.5F);

		bodyModel[157].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box433
		bodyModel[157].setRotationPoint(-39.25F, -23.5F, -7.5F);

		bodyModel[158].addBox(0F, 0F, 0F, 13, 1, 30, 0F); // Import Box434
		bodyModel[158].setRotationPoint(37F, -22.6F, -15F);

		bodyModel[159].addShapeBox(0F, 0F, -2F, 13, 1, 2, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box435
		bodyModel[159].setRotationPoint(37F, -22.6F, -15F);

		bodyModel[160].addShapeBox(0F, 0F, 30F, 13, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box436
		bodyModel[160].setRotationPoint(37F, -22.6F, -15F);

		bodyModel[161].addShapeBox(0F, 0F, -4F, 8, 1, 9, 0F,0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box14
		bodyModel[161].setRotationPoint(41F, -23F, -11F);

		bodyModel[162].addShapeBox(0F, 0F, 5F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -1F); // Import Box15
		bodyModel[162].setRotationPoint(41F, -23F, -11F);

		bodyModel[163].addShapeBox(0F, 0F, -5F, 8, 1, 1, 0F,-3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, -3F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import Box16
		bodyModel[163].setRotationPoint(41F, -23F, -11F);

		bodyModel[164].addShapeBox(0F, 0F, 5F, 8, 1, 1, 0F,0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F, 0F, 0F, 2F, 0F, 0F, 0F, -1F, 0F, 0F, -3F, 0F, -1F); // Import Box27
		bodyModel[164].setRotationPoint(41F, -23F, 10F);

		bodyModel[165].addShapeBox(0F, 0F, -4F, 8, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F); // Import Box28
		bodyModel[165].setRotationPoint(41F, -23F, 10F);

		bodyModel[166].addShapeBox(0F, 0F, -6F, 8, 1, 2, 0F,-1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box29
		bodyModel[166].setRotationPoint(41F, -23F, 10F);

		bodyModel[167].addShapeBox(-3.5F, 0.2F, 0F, 1, 2, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F, 1F, 0F, -1F); // Import Box446
		bodyModel[167].setRotationPoint(43.5F, -24.25F, -2.5F);

		bodyModel[168].addShapeBox(-2.5F, 0.2F, 0F, 3, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box447
		bodyModel[168].setRotationPoint(43.5F, -24.25F, -2.5F);

		bodyModel[169].addShapeBox(1.5F, 0.2F, 0F, 1, 2, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 1F, 1F, 0F, -1F, 1F, 0F, -1F, 0F, 0F, 1F); // Import Box448
		bodyModel[169].setRotationPoint(42.5F, -24.25F, -2.5F);

		bodyModel[170].addShapeBox(-2.85F, -0.25F, -1F, 1, 2, 2, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box449
		bodyModel[170].setRotationPoint(54F, -23.75F, 8F);
		bodyModel[170].rotateAngleY = -1.57079633F;

		bodyModel[171].addShapeBox(-2.5F, -0.9F, -1F, 4, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Import Box450
		bodyModel[171].setRotationPoint(54F, -23.75F, 8F);
		bodyModel[171].rotateAngleY = -1.57079633F;

		bodyModel[172].addShapeBox(-2.5F, -0.15F, -1.1F, 4, 2, 2, 0F,-0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F); // Import Box451
		bodyModel[172].setRotationPoint(54F, -23.75F, 8F);
		bodyModel[172].rotateAngleY = -1.57079633F;

		bodyModel[173].addShapeBox(0.85F, -0.25F, -1F, 1, 2, 2, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box452
		bodyModel[173].setRotationPoint(54F, -23.75F, 8F);
		bodyModel[173].rotateAngleY = -1.57079633F;

		bodyModel[174].addShapeBox(-1.5F, -0.15F, -1.1F, 4, 2, 2, 0F,-0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F, -0.375F, 0F, -0.2F); // Import Box453
		bodyModel[174].setRotationPoint(54F, -23.75F, -8F);
		bodyModel[174].rotateAngleY = -1.57079633F;

		bodyModel[175].addShapeBox(1.85F, -0.25F, -1F, 1, 2, 2, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box454
		bodyModel[175].setRotationPoint(54F, -23.75F, -8F);
		bodyModel[175].rotateAngleY = -1.57079633F;

		bodyModel[176].addShapeBox(-1.5F, -0.9F, -1F, 4, 1, 2, 0F,0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F); // Import Box455
		bodyModel[176].setRotationPoint(54F, -23.75F, -8F);
		bodyModel[176].rotateAngleY = -1.57079633F;

		bodyModel[177].addShapeBox(-1.85F, -0.25F, -1F, 1, 2, 2, 0F,-0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F, -0.35F, 0F, 0F); // Import Box456
		bodyModel[177].setRotationPoint(54F, -23.75F, -8F);
		bodyModel[177].rotateAngleY = -1.57079633F;

		bodyModel[178].addBox(0F, 0F, 0F, 2, 2, 4, 0F); // Import Box78
		bodyModel[178].setRotationPoint(69.75F, -17F, -2F);

		bodyModel[179].addShapeBox(0F, 0F, 0F, 1, 2, 2, 0F,0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F, 0F, 0F, -0.6F); // Import Box79
		bodyModel[179].setRotationPoint(70.25F, -19F, -1F);

		bodyModel[180].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box80
		bodyModel[180].setRotationPoint(70.25F, -18.5F, 0.8F);

		bodyModel[181].addShapeBox(0F, 0F, 0F, 1, 2, 1, 0F,-0.2F, 0F, -1.2F, -0.2F, 0F, -1.2F, -0.2F, 0F, 0.8F, -0.2F, 0F, 0.8F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F, -0.2F, 0F, -0.2F); // Import Box81
		bodyModel[181].setRotationPoint(70.25F, -18.5F, -1.8F);

		bodyModel[182].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F); // Import Box82
		bodyModel[182].setRotationPoint(69.75F, -19.75F, -1F);

		bodyModel[183].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box83
		bodyModel[183].setRotationPoint(69.75F, -18.75F, -1F);

		bodyModel[184].addShapeBox(0F, 0F, 0F, 2, 1, 2, 0F,0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box84
		bodyModel[184].setRotationPoint(69.75F, -20.75F, -1F);

		bodyModel[185].addShapeBox(4.5F, -1F, -4.5F, 3, 1, 1, 0F,-0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Import Box464
		bodyModel[185].setRotationPoint(41F, -23F, 10F);
		bodyModel[185].rotateAngleY = -0.17453293F;

		bodyModel[186].addShapeBox(4.5F, -1F, 3.5F, 3, 1, 1, 0F,-0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, -0.25F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Import Box465
		bodyModel[186].setRotationPoint(41F, -23F, -10F);
		bodyModel[186].rotateAngleY = 0.17453293F;

		bodyModel[187].addShapeBox(6.8F, -0.3F, -3F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box466
		bodyModel[187].setRotationPoint(41F, -23F, -10F);
		bodyModel[187].rotateAngleY = -0.34906585F;

		bodyModel[188].addShapeBox(6.8F, -0.3F, -2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box467
		bodyModel[188].setRotationPoint(41F, -23F, -10F);
		bodyModel[188].rotateAngleY = -0.34906585F;

		bodyModel[189].addShapeBox(6.8F, -0.3F, 2F, 2, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F); // Import Box468
		bodyModel[189].setRotationPoint(41F, -23F, 10F);
		bodyModel[189].rotateAngleY = 0.34906585F;

		bodyModel[190].addShapeBox(6.8F, -0.3F, 1F, 2, 1, 1, 0F,-0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box469
		bodyModel[190].setRotationPoint(41F, -23F, 10F);
		bodyModel[190].rotateAngleY = 0.34906585F;

		bodyModel[191].addShapeBox(0.5F, 0F, -0.5F, 6, 2, 2, 0F,0F, 0F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, 0F, 0F, -0.2F); // Import Box474
		bodyModel[191].setRotationPoint(74.5F, -15F, 16F);
		bodyModel[191].rotateAngleZ = -0.55850536F;

		bodyModel[192].addShapeBox(0.5F, 2F, -0.5F, 6, 1, 2, 0F,0F, 0F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.75F, -0.25F, -0.2F, -0.75F, -0.25F, -0.2F, 0F, 0F, -0.2F); // Import Box475
		bodyModel[192].setRotationPoint(74.5F, -15F, 16F);
		bodyModel[192].rotateAngleZ = -0.55850536F;

		bodyModel[193].addShapeBox(0.5F, 3F, -1.5F, 6, 1, 2, 0F,0F, 0F, -0.2F, -0.25F, 0.5F, -0.2F, -0.25F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.75F, -0.25F, -0.2F, -0.75F, -0.25F, -0.2F, 0F, 0F, -0.2F); // Import Box476
		bodyModel[193].setRotationPoint(74.5F, -15F, -16F);
		bodyModel[193].rotateAngleZ = -0.55850536F;

		bodyModel[194].addShapeBox(0.5F, 0F, -1.5F, 6, 3, 2, 0F,0F, 0F, -0.2F, -0.5F, 0.5F, -0.2F, -0.5F, 0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, 0F, 0F, -0.2F); // Import Box477
		bodyModel[194].setRotationPoint(74.5F, -15F, -16F);
		bodyModel[194].rotateAngleZ = -0.55850536F;

		bodyModel[195].addShapeBox(-0.5F, 0F, -1.5F, 1, 4, 2, 0F,-0.25F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.25F, -0.5F, -0.2F); // Import Box478
		bodyModel[195].setRotationPoint(74.5F, -15F, -16F);
		bodyModel[195].rotateAngleZ = -0.55850536F;

		bodyModel[196].addShapeBox(-0.5F, 0F, -0.5F, 1, 3, 2, 0F,-0.25F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.25F, -0.5F, -0.2F, -0.25F, -0.5F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, -0.2F, -0.25F, -0.5F, -0.2F); // Import Box479
		bodyModel[196].setRotationPoint(74.5F, -15F, 16F);
		bodyModel[196].rotateAngleZ = -0.55850536F;

		bodyModel[197].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-0.375F, -0.125F, -0.125F, -0.375F, -0.125F, -0.125F, -0.375F, -0.125F, -0.125F, -0.375F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Import Box426
		bodyModel[197].setRotationPoint(-49.5F, -24F, 3.5F);
		bodyModel[197].rotateAngleY = 0.78539816F;

		bodyModel[198].addShapeBox(-3F, 0F, 0F, 3, 1, 1, 0F,-0.375F, -0.125F, -0.125F, -0.375F, -0.125F, -0.125F, -0.375F, -0.125F, -0.125F, -0.375F, -0.125F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F); // Import Box427
		bodyModel[198].setRotationPoint(-35.5F, -24F, 3.5F);
		bodyModel[198].rotateAngleY = -0.78539816F;

		bodyModel[199].addBox(0F, 1.4F, 0.25F, 3, 6, 8, 0F); // Import Box465
		bodyModel[199].setRotationPoint(-67F, -11F, 9F);
		bodyModel[199].rotateAngleZ = 0.48869219F;

		bodyModel[200].addShapeBox(-1F, 1.4F, 0.25F, 1, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box466
		bodyModel[200].setRotationPoint(-67F, -11F, 9F);
		bodyModel[200].rotateAngleZ = 0.48869219F;

		bodyModel[201].addBox(2.4F, 0.5F, -0.25F, 1, 8, 9, 0F); // Import Box467
		bodyModel[201].setRotationPoint(-67F, -11F, 9F);
		bodyModel[201].rotateAngleZ = 0.48869219F;

		bodyModel[202].addShapeBox(0F, 6.4F, 1.25F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F); // Import Box470
		bodyModel[202].setRotationPoint(-67F, -11F, 9F);
		bodyModel[202].rotateAngleZ = 0.48869219F;

		bodyModel[203].addShapeBox(0F, 6.4F, -0.25F, 3, 2, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -1F, 0F); // Import Box471
		bodyModel[203].setRotationPoint(-67F, -11F, -16F);
		bodyModel[203].rotateAngleZ = 0.48869219F;

		bodyModel[204].addShapeBox(-1F, 1.4F, -1.25F, 1, 6, 8, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box472
		bodyModel[204].setRotationPoint(-67F, -11F, -16F);
		bodyModel[204].rotateAngleZ = 0.48869219F;

		bodyModel[205].addBox(0F, 1.4F, -1.25F, 3, 6, 8, 0F); // Import Box473
		bodyModel[205].setRotationPoint(-67F, -11F, -16F);
		bodyModel[205].rotateAngleZ = 0.48869219F;

		bodyModel[206].addBox(2.4F, 0.5F, -1.75F, 1, 8, 9, 0F); // Import Box474
		bodyModel[206].setRotationPoint(-67F, -11F, -16F);
		bodyModel[206].rotateAngleZ = 0.48869219F;

		bodyModel[207].addShapeBox(-0.4F, -1.6F, -0.25F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box475
		bodyModel[207].setRotationPoint(-67F, -11F, -16F);
		bodyModel[207].rotateAngleZ = 0.48869219F;

		bodyModel[208].addShapeBox(-0.4F, -1.6F, 0.75F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box476
		bodyModel[208].setRotationPoint(-67F, -11F, -16F);
		bodyModel[208].rotateAngleZ = 0.48869219F;

		bodyModel[209].addShapeBox(-0.4F, -1.6F, 4.75F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box477
		bodyModel[209].setRotationPoint(-67F, -11F, -16F);
		bodyModel[209].rotateAngleZ = 0.48869219F;

		bodyModel[210].addShapeBox(-0.4F, -1.6F, 3.75F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box478
		bodyModel[210].setRotationPoint(-67F, -11F, -16F);
		bodyModel[210].rotateAngleZ = 0.48869219F;

		bodyModel[211].addShapeBox(-1.4F, -9.6F, -1.25F, 4, 8, 1, 0F,-1F, 1F, 0F, -1F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box482
		bodyModel[211].setRotationPoint(-67F, -11F, -16F);
		bodyModel[211].rotateAngleZ = 0.48869219F;

		bodyModel[212].addShapeBox(-1.4F, -9.6F, -0.25F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box483
		bodyModel[212].setRotationPoint(-67F, -11F, -16F);
		bodyModel[212].rotateAngleZ = 0.48869219F;

		bodyModel[213].addBox(-1F, -7.6F, -1.75F, 4, 1, 9, 0F); // Import Box485
		bodyModel[213].setRotationPoint(-67F, -11F, -16F);
		bodyModel[213].rotateAngleZ = 0.48869219F;

		bodyModel[214].addShapeBox(-2F, -7.6F, -1.75F, 1, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box486
		bodyModel[214].setRotationPoint(-67F, -11F, -16F);
		bodyModel[214].rotateAngleZ = 0.48869219F;

		bodyModel[215].addShapeBox(-3.4F, -13.6F, -0.25F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box487
		bodyModel[215].setRotationPoint(-67F, -11F, -16F);
		bodyModel[215].rotateAngleZ = 0.48869219F;

		bodyModel[216].addShapeBox(-3.4F, -13.6F, -1.25F, 2, 4, 1, 0F,0F, -1F, 0F, 3F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box488
		bodyModel[216].setRotationPoint(-67F, -11F, -16F);
		bodyModel[216].rotateAngleZ = 0.48869219F;

		bodyModel[217].addShapeBox(-3.4F, -13.6F, 1.75F, 2, 4, 1, 0F,0F, 0F, 0F, 4F, 0F, 0F, 3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Import Box489
		bodyModel[217].setRotationPoint(-67F, -11F, -16F);
		bodyModel[217].rotateAngleZ = 0.48869219F;

		bodyModel[218].addShapeBox(-1.4F, -9.6F, 1.75F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box490
		bodyModel[218].setRotationPoint(-67F, -11F, -16F);
		bodyModel[218].rotateAngleZ = 0.48869219F;

		bodyModel[219].addShapeBox(-1.4F, -9.6F, 5.75F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box491
		bodyModel[219].setRotationPoint(-67F, -11F, -16F);
		bodyModel[219].rotateAngleZ = 0.48869219F;

		bodyModel[220].addShapeBox(-1.4F, -9.6F, 2.75F, 4, 8, 1, 0F,-1F, 1F, 0F, -1F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box492
		bodyModel[220].setRotationPoint(-67F, -11F, -16F);
		bodyModel[220].rotateAngleZ = 0.48869219F;

		bodyModel[221].addShapeBox(-1.4F, -9.6F, 3.75F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box493
		bodyModel[221].setRotationPoint(-67F, -11F, -16F);
		bodyModel[221].rotateAngleZ = 0.48869219F;

		bodyModel[222].addShapeBox(-3.4F, -13.6F, 3.75F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box494
		bodyModel[222].setRotationPoint(-67F, -11F, -16F);
		bodyModel[222].rotateAngleZ = 0.48869219F;

		bodyModel[223].addShapeBox(-3.4F, -13.6F, 2.75F, 2, 4, 1, 0F,0F, -1F, 0F, 3F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box495
		bodyModel[223].setRotationPoint(-67F, -11F, -16F);
		bodyModel[223].rotateAngleZ = 0.48869219F;

		bodyModel[224].addShapeBox(-3.4F, -13.6F, 5.75F, 2, 4, 1, 0F,0F, 0F, 0F, 4F, 0F, 0F, 3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Import Box496
		bodyModel[224].setRotationPoint(-67F, -11F, -16F);
		bodyModel[224].rotateAngleZ = 0.48869219F;

		bodyModel[225].addShapeBox(-1.4F, -9.6F, 0.25F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box497
		bodyModel[225].setRotationPoint(-67F, -11F, 16F);
		bodyModel[225].rotateAngleZ = 0.48869219F;

		bodyModel[226].addShapeBox(-1.4F, -9.6F, -2.75F, 4, 8, 1, 0F,-1F, 1F, 0F, -1F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box498
		bodyModel[226].setRotationPoint(-67F, -11F, 16F);
		bodyModel[226].rotateAngleZ = 0.48869219F;

		bodyModel[227].addShapeBox(-1.4F, -9.6F, -1.75F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box499
		bodyModel[227].setRotationPoint(-67F, -11F, 16F);
		bodyModel[227].rotateAngleZ = 0.48869219F;

		bodyModel[228].addShapeBox(-3.4F, -13.6F, -1.75F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box500
		bodyModel[228].setRotationPoint(-67F, -11F, 16F);
		bodyModel[228].rotateAngleZ = 0.48869219F;

		bodyModel[229].addShapeBox(-3.4F, -13.6F, -2.75F, 2, 4, 1, 0F,0F, -1F, 0F, 3F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box501
		bodyModel[229].setRotationPoint(-67F, -11F, 16F);
		bodyModel[229].rotateAngleZ = 0.48869219F;

		bodyModel[230].addShapeBox(-3.4F, -13.6F, 0.25F, 2, 4, 1, 0F,0F, 0F, 0F, 4F, 0F, 0F, 3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Import Box502
		bodyModel[230].setRotationPoint(-67F, -11F, 16F);
		bodyModel[230].rotateAngleZ = 0.48869219F;

		bodyModel[231].addShapeBox(-1.4F, -9.6F, -6.75F, 4, 8, 1, 0F,-1F, 1F, 0F, -1F, 3F, 0F, 0F, 4F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box503
		bodyModel[231].setRotationPoint(-67F, -11F, 16F);
		bodyModel[231].rotateAngleZ = 0.48869219F;

		bodyModel[232].addShapeBox(-1.4F, -9.6F, -5.75F, 4, 8, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box504
		bodyModel[232].setRotationPoint(-67F, -11F, 16F);
		bodyModel[232].rotateAngleZ = 0.48869219F;

		bodyModel[233].addShapeBox(-1.4F, -9.6F, -3.75F, 4, 8, 1, 0F,0F, 0F, 0F, 0F, 4F, 0F, -1F, 3F, 0F, -1F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box505
		bodyModel[233].setRotationPoint(-67F, -11F, 16F);
		bodyModel[233].rotateAngleZ = 0.48869219F;

		bodyModel[234].addShapeBox(-3.4F, -13.6F, -6.75F, 2, 4, 1, 0F,0F, -1F, 0F, 3F, -1F, 0F, 4F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box506
		bodyModel[234].setRotationPoint(-67F, -11F, 16F);
		bodyModel[234].rotateAngleZ = 0.48869219F;

		bodyModel[235].addShapeBox(-3.4F, -13.6F, -5.75F, 6, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box507
		bodyModel[235].setRotationPoint(-67F, -11F, 16F);
		bodyModel[235].rotateAngleZ = 0.48869219F;

		bodyModel[236].addShapeBox(-3.4F, -13.6F, -3.75F, 2, 4, 1, 0F,0F, 0F, 0F, 4F, 0F, 0F, 3F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -1F, 0F, 0F, -1F, 0F); // Import Box508
		bodyModel[236].setRotationPoint(-67F, -11F, 16F);
		bodyModel[236].rotateAngleZ = 0.48869219F;

		bodyModel[237].addShapeBox(-2F, -7.6F, -7.25F, 1, 1, 9, 0F,0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F); // Import Box509
		bodyModel[237].setRotationPoint(-67F, -11F, 16F);
		bodyModel[237].rotateAngleZ = 0.48869219F;

		bodyModel[238].addBox(-1F, -7.6F, -7.25F, 4, 1, 9, 0F); // Import Box510
		bodyModel[238].setRotationPoint(-67F, -11F, 16F);
		bodyModel[238].rotateAngleZ = 0.48869219F;

		bodyModel[239].addShapeBox(-0.4F, -1.6F, -5.75F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box511
		bodyModel[239].setRotationPoint(-67F, -11F, 16F);
		bodyModel[239].rotateAngleZ = 0.48869219F;

		bodyModel[240].addShapeBox(-0.4F, -1.6F, -4.75F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box512
		bodyModel[240].setRotationPoint(-67F, -11F, 16F);
		bodyModel[240].rotateAngleZ = 0.48869219F;

		bodyModel[241].addShapeBox(-0.4F, -1.6F, -1.75F, 2, 3, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box513
		bodyModel[241].setRotationPoint(-67F, -11F, 16F);
		bodyModel[241].rotateAngleZ = 0.48869219F;

		bodyModel[242].addShapeBox(-0.4F, -1.6F, -0.75F, 2, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box514
		bodyModel[242].setRotationPoint(-67F, -11F, 16F);
		bodyModel[242].rotateAngleZ = 0.48869219F;

		bodyModel[243].addShapeBox(2.2F, -7.6F, -7.25F, 1, 1, 9, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Import Box515
		bodyModel[243].setRotationPoint(-67F, -11F, 16F);
		bodyModel[243].rotateAngleZ = 0.48869219F;

		bodyModel[244].addShapeBox(2.2F, -7.6F, -1.75F, 1, 1, 9, 0F,0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F, 0F, 0.2F, 0.2F); // Import Box516
		bodyModel[244].setRotationPoint(-67F, -11F, -16F);
		bodyModel[244].rotateAngleZ = 0.48869219F;

		bodyModel[245].addShapeBox(0.5F, 0.1F, -0.5F, 1, 1, 6, 0F,0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F); // Import Box518
		bodyModel[245].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[245].rotateAngleZ = 2.05948852F;

		bodyModel[246].addShapeBox(-3.5F, 0.1F, -0.5F, 4, 1, 6, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box519
		bodyModel[246].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[246].rotateAngleZ = 2.05948852F;

		bodyModel[247].addShapeBox(0.5F, -0.9F, -0.5F, 1, 1, 6, 0F,0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F); // Import Box520
		bodyModel[247].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[247].rotateAngleZ = 2.05948852F;

		bodyModel[248].addShapeBox(0F, -0.2F, 0F, 1, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box521
		bodyModel[248].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[248].rotateAngleZ = 2.05948852F;

		bodyModel[249].addShapeBox(-3F, -0.2F, 0F, 3, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box522
		bodyModel[249].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[249].rotateAngleZ = 2.05948852F;

		bodyModel[250].addShapeBox(-3.5F, -0.9F, -0.5F, 4, 1, 6, 0F,0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, 0F); // Import Box523
		bodyModel[250].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[250].rotateAngleZ = 2.05948852F;

		bodyModel[251].addShapeBox(-4.5F, 0.1F, -0.5F, 1, 1, 6, 0F,0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F); // Import Box524
		bodyModel[251].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[251].rotateAngleZ = 2.05948852F;

		bodyModel[252].addShapeBox(-4F, -0.2F, 0F, 1, 1, 5, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box525
		bodyModel[252].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[252].rotateAngleZ = 2.05948852F;

		bodyModel[253].addShapeBox(-4.5F, -0.9F, -0.5F, 1, 1, 6, 0F,0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F, 0F, -0.125F, -1F, 0F, -0.125F, 0F, 0F, -0.125F, 0F, 0F, -0.125F, -1F); // Import Box526
		bodyModel[253].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[253].rotateAngleZ = 2.05948852F;

		bodyModel[254].addShapeBox(-5.5F, 0.1F, -5.5F, 3, 1, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box527
		bodyModel[254].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[254].rotateAngleZ = 2.05948852F;

		bodyModel[255].addShapeBox(-5.5F, -0.55F, -5.5F, 3, 1, 3, 0F,-1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box529
		bodyModel[255].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[255].rotateAngleZ = 2.05948852F;

		bodyModel[256].addShapeBox(-5.5F, -0.55F, 2.5F, 3, 1, 3, 0F,-1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box530
		bodyModel[256].setRotationPoint(-61.5F, -5F, 2.5F);
		bodyModel[256].rotateAngleZ = 2.05948852F;

		bodyModel[257].addShapeBox(-5.5F, 0.1F, 2.5F, 3, 1, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box531
		bodyModel[257].setRotationPoint(-61.5F, -5F, 2.5F);
		bodyModel[257].rotateAngleZ = 2.05948852F;

		bodyModel[258].addShapeBox(1.5F, -0.55F, 1.5F, 3, 1, 3, 0F,-1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box532
		bodyModel[258].setRotationPoint(-61.5F, -5F, 2.5F);
		bodyModel[258].rotateAngleZ = 2.05948852F;

		bodyModel[259].addShapeBox(1.5F, 0.0999999999999999F, 1.5F, 3, 1, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box533
		bodyModel[259].setRotationPoint(-61.5F, -5F, 2.5F);
		bodyModel[259].rotateAngleZ = 2.05948852F;

		bodyModel[260].addShapeBox(1.5F, -0.55F, -4.5F, 3, 1, 3, 0F,-1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box534
		bodyModel[260].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[260].rotateAngleZ = 2.05948852F;

		bodyModel[261].addShapeBox(1.5F, 0.0999999999999999F, -4.5F, 3, 1, 3, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box535
		bodyModel[261].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[261].rotateAngleZ = 2.05948852F;

		bodyModel[262].addShapeBox(-6F, -0.35F, -12.5F, 5, 1, 5, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box536
		bodyModel[262].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[262].rotateAngleZ = 2.05948852F;

		bodyModel[263].addShapeBox(-6F, -1F, -12.5F, 5, 1, 5, 0F,-1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box537
		bodyModel[263].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[263].rotateAngleZ = 2.05948852F;

		bodyModel[264].addShapeBox(-6F, -1F, 7.5F, 5, 1, 5, 0F,-1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, -1F, -0.25F, -1F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F); // Import Box538
		bodyModel[264].setRotationPoint(-61.5F, -5F, 2.5F);
		bodyModel[264].rotateAngleZ = 2.05948852F;

		bodyModel[265].addShapeBox(-6F, -0.35F, 7.5F, 5, 1, 5, 0F,0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, -0.1F, 0F); // Import Box539
		bodyModel[265].setRotationPoint(-61.5F, -5F, 2.5F);
		bodyModel[265].rotateAngleZ = 2.05948852F;

		bodyModel[266].addShapeBox(-4F, -1.1F, 8.75F, 2, 1, 2, 0F,-0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F); // Import Box540
		bodyModel[266].setRotationPoint(-61.5F, -5F, 2.5F);
		bodyModel[266].rotateAngleZ = 2.05948852F;

		bodyModel[267].addShapeBox(-4F, -1.1F, -10.75F, 2, 1, 2, 0F,-0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F, -0.125F, -0.1F, -0.125F); // Import Box541
		bodyModel[267].setRotationPoint(-61.5F, -5F, -2.5F);
		bodyModel[267].rotateAngleZ = 2.05948852F;

		bodyModel[268].addBox(0.25F, 0F, 0F, 2, 1, 3, 0F); // Import Box542
		bodyModel[268].setRotationPoint(-66.5F, -14.5F, 19F);

		bodyModel[269].addShapeBox(-0.75F, 0F, 0F, 1, 1, 3, 0F,-0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F, -0.5F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.25F, 0F); // Import Box543
		bodyModel[269].setRotationPoint(-66.5F, -14.5F, 19F);

		bodyModel[270].addShapeBox(0F, 0F, 0F, 2, 4, 2, 0F,0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 2.1F, 0F, -0.25F, 2.1F, 0F, -0.25F, -0.75F, -0.5F, -0.25F); // Import Box544
		bodyModel[270].setRotationPoint(-72F, -22.5F, -26.25F);

		bodyModel[271].addShapeBox(0F, 0F, -2F, 2, 4, 2, 0F,0F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, -0.5F, -0.25F, -0.75F, -0.5F, -0.25F, 2.1F, 0F, -0.25F, 2.1F, 0F, -0.25F, -0.75F, -0.5F, -0.25F); // Import Box537
		bodyModel[271].setRotationPoint(-72F, -22.5F, 26.25F);

		bodyModel[272].addShapeBox(0F, 0F, -2F, 1, 1, 4, 0F,0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F); // Import Box413
		bodyModel[272].setRotationPoint(77.75F, -11.5F, 16.5F);
		bodyModel[272].rotateAngleZ = 0.78539816F;

		bodyModel[273].addShapeBox(0F, 0F, 1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box583
		bodyModel[273].setRotationPoint(77.75F, -11.5F, 16.5F);

		bodyModel[274].addShapeBox(0F, 0F, -2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box584
		bodyModel[274].setRotationPoint(77.75F, -11.5F, 16.5F);

		bodyModel[275].addShapeBox(0F, 3F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box585
		bodyModel[275].setRotationPoint(77.75F, -11.5F, 16.5F);

		bodyModel[276].addShapeBox(0F, 0F, -2F, 1, 1, 4, 0F,0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F); // Import Box543
		bodyModel[276].setRotationPoint(77.75F, -11.5F, -16.5F);
		bodyModel[276].rotateAngleZ = 0.78539816F;

		bodyModel[277].addShapeBox(0F, 0F, 1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box544
		bodyModel[277].setRotationPoint(77.75F, -11.5F, -16.5F);

		bodyModel[278].addShapeBox(0F, 3F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box545
		bodyModel[278].setRotationPoint(77.75F, -11.5F, -16.5F);

		bodyModel[279].addShapeBox(0F, 0F, -2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box546
		bodyModel[279].setRotationPoint(77.75F, -11.5F, -16.5F);

		bodyModel[280].addShapeBox(-1F, -1F, -2F, 1, 1, 4, 0F,0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F); // Import Box547
		bodyModel[280].setRotationPoint(-69.75F, -20.5F, -25.25F);
		bodyModel[280].rotateAngleZ = 0.78539816F;

		bodyModel[281].addShapeBox(-1F, 0F, 1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box548
		bodyModel[281].setRotationPoint(-69.75F, -20.5F, -25.25F);

		bodyModel[282].addShapeBox(-1F, 3F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box549
		bodyModel[282].setRotationPoint(-69.75F, -20.5F, -25.25F);

		bodyModel[283].addShapeBox(-1F, 0F, -2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box550
		bodyModel[283].setRotationPoint(-69.75F, -20.5F, -25.25F);

		bodyModel[284].addShapeBox(-1F, -1F, -2F, 1, 1, 4, 0F,0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F, 0.1F, 0.1F, 0.25F); // Import Box551
		bodyModel[284].setRotationPoint(-69.75F, -20.5F, 25.25F);
		bodyModel[284].rotateAngleZ = 0.78539816F;

		bodyModel[285].addShapeBox(-1F, 0F, -2F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box552
		bodyModel[285].setRotationPoint(-69.75F, -20.5F, 25.25F);

		bodyModel[286].addShapeBox(-1F, 3F, -1F, 1, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box553
		bodyModel[286].setRotationPoint(-69.75F, -20.5F, 25.25F);

		bodyModel[287].addShapeBox(-1F, 0F, 1F, 1, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box554
		bodyModel[287].setRotationPoint(-69.75F, -20.5F, 25.25F);

		bodyModel[288].addBox(0F, 0F, 1F, 3, 1, 1, 0F); // Import Box887
		bodyModel[288].setRotationPoint(-69.5F, -22.75F, -25.5F);

		bodyModel[289].addShapeBox(0F, -1.5F, 1F, 3, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box888
		bodyModel[289].setRotationPoint(-69.5F, -22.75F, -25.5F);

		bodyModel[290].addShapeBox(0F, -1.5F, 0F, 3, 2, 1, 0F,-1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F); // Import Box889
		bodyModel[290].setRotationPoint(-69.5F, -22.75F, -25.5F);

		bodyModel[291].addShapeBox(0F, -1.5F, 2F, 3, 2, 1, 0F,-0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -1.25F, 0F, -0.25F, -1.25F, 0F, -0.25F); // Import Box890
		bodyModel[291].setRotationPoint(-69.5F, -22.75F, -25.5F);

		bodyModel[292].addShapeBox(0F, 0F, 0F, 3, 1, 1, 0F,-1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box891
		bodyModel[292].setRotationPoint(-69.5F, -22.75F, -25.5F);

		bodyModel[293].addShapeBox(0F, 0F, 2F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box892
		bodyModel[293].setRotationPoint(-69.5F, -22.75F, -25.5F);

		bodyModel[294].addShapeBox(0.5F, -1.75F, 0.5F, 2, 1, 2, 0F,-0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F, -0.3F, 0F, -0.3F); // Import Box893
		bodyModel[294].setRotationPoint(-69.5F, -22.75F, -25.5F);

		bodyModel[295].addBox(0F, 0F, 0F, 2, 2, 5, 0F); // Import Box896
		bodyModel[295].setRotationPoint(-56.7F, -25F, -18F);

		bodyModel[296].addShapeBox(0F, 0F, -1F, 2, 2, 1, 0F,-0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box897
		bodyModel[296].setRotationPoint(-56.7F, -25F, -18F);

		bodyModel[297].addShapeBox(0F, 0F, 4.75F, 2, 2, 1, 0F,0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, -0.5F, -0.5F, -0.25F, -0.5F, -0.5F, -0.25F); // Import Box898
		bodyModel[297].setRotationPoint(-56.7F, -25F, -18F);

		bodyModel[298].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F,0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.5F, -0.25F, 0.125F, 0.5F, -0.25F, 0.125F, 0.5F, -0.25F, 0.125F, 0.5F, -0.25F); // Import Box899
		bodyModel[298].setRotationPoint(-56.7F, -25F, -18F);

		bodyModel[299].addShapeBox(0F, 0F, 4F, 2, 2, 1, 0F,0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.125F, -0.25F, 0.125F, 0.5F, -0.25F, 0.125F, 0.5F, -0.25F, 0.125F, 0.5F, -0.25F, 0.125F, 0.5F, -0.25F); // Import Box900
		bodyModel[299].setRotationPoint(-56.7F, -25F, -18F);
	}

	private void initbodyDoorCloseModel_1()
	{
		bodyDoorCloseModel[0] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Import Box555
		bodyDoorCloseModel[1] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Import Box559
		bodyDoorCloseModel[2] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box560
		bodyDoorCloseModel[3] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box564
		bodyDoorCloseModel[4] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Import Box565
		bodyDoorCloseModel[5] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Import Box566
		bodyDoorCloseModel[6] = new ModelRendererTurbo(this, 0, 37, textureX, textureY); // Import Box567
		bodyDoorCloseModel[7] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Import Box568
		bodyDoorCloseModel[8] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box569
		bodyDoorCloseModel[9] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Import Box570
		bodyDoorCloseModel[10] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Import Box571
		bodyDoorCloseModel[11] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box576
		bodyDoorCloseModel[12] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box577
		bodyDoorCloseModel[13] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box578
		bodyDoorCloseModel[14] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box579
		bodyDoorCloseModel[15] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box581
		bodyDoorCloseModel[16] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box582
		bodyDoorCloseModel[17] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box583
		bodyDoorCloseModel[18] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box584
		bodyDoorCloseModel[19] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box585
		bodyDoorCloseModel[20] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box586
		bodyDoorCloseModel[21] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box587
		bodyDoorCloseModel[22] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box588
		bodyDoorCloseModel[23] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Import Box589
		bodyDoorCloseModel[24] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Import Box590
		bodyDoorCloseModel[25] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box591
		bodyDoorCloseModel[26] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box592
		bodyDoorCloseModel[27] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Import Box593
		bodyDoorCloseModel[28] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Import Box594
		bodyDoorCloseModel[29] = new ModelRendererTurbo(this, 0, 37, textureX, textureY); // Import Box595
		bodyDoorCloseModel[30] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Import Box600
		bodyDoorCloseModel[31] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Import Box601
		bodyDoorCloseModel[32] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box602
		bodyDoorCloseModel[33] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Import Box603
		bodyDoorCloseModel[34] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box604
		bodyDoorCloseModel[35] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box605
		bodyDoorCloseModel[36] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box606
		bodyDoorCloseModel[37] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box607
		bodyDoorCloseModel[38] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box608
		bodyDoorCloseModel[39] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box609
		bodyDoorCloseModel[40] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box610
		bodyDoorCloseModel[41] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box611
		bodyDoorCloseModel[42] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box612
		bodyDoorCloseModel[43] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box613
		bodyDoorCloseModel[44] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box614
		bodyDoorCloseModel[45] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box615
		bodyDoorCloseModel[46] = new ModelRendererTurbo(this, 0, 37, textureX, textureY); // Import Box616
		bodyDoorCloseModel[47] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Import Box617
		bodyDoorCloseModel[48] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Import Box618
		bodyDoorCloseModel[49] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box619
		bodyDoorCloseModel[50] = new ModelRendererTurbo(this, 95, 25, textureX, textureY); // Import Box620
		bodyDoorCloseModel[51] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Import Box621
		bodyDoorCloseModel[52] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Import Box622
		bodyDoorCloseModel[53] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Import Box623
		bodyDoorCloseModel[54] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box624
		bodyDoorCloseModel[55] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Import Box625
		bodyDoorCloseModel[56] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Import Box630
		bodyDoorCloseModel[57] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box631
		bodyDoorCloseModel[58] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box632
		bodyDoorCloseModel[59] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box633
		bodyDoorCloseModel[60] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box634
		bodyDoorCloseModel[61] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box635
		bodyDoorCloseModel[62] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box636
		bodyDoorCloseModel[63] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box637
		bodyDoorCloseModel[64] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box638
		bodyDoorCloseModel[65] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box639
		bodyDoorCloseModel[66] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Import Box640
		bodyDoorCloseModel[67] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Import Box641
		bodyDoorCloseModel[68] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box642
		bodyDoorCloseModel[69] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Import Box643
		bodyDoorCloseModel[70] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Import Box644
		bodyDoorCloseModel[71] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Import Box645
		bodyDoorCloseModel[72] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box646
		bodyDoorCloseModel[73] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Import Box647
		bodyDoorCloseModel[74] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box648
		bodyDoorCloseModel[75] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box649
		bodyDoorCloseModel[76] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box650
		bodyDoorCloseModel[77] = new ModelRendererTurbo(this, 139, 37, textureX, textureY); // Import Box651
		bodyDoorCloseModel[78] = new ModelRendererTurbo(this, 33, 66, textureX, textureY); // Import Box632
		bodyDoorCloseModel[79] = new ModelRendererTurbo(this, 33, 58, textureX, textureY); // Import Box633
		bodyDoorCloseModel[80] = new ModelRendererTurbo(this, 24, 58, textureX, textureY); // Import Box634
		bodyDoorCloseModel[81] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // Import Box635
		bodyDoorCloseModel[82] = new ModelRendererTurbo(this, 95, 14, textureX, textureY); // Import Box643
		bodyDoorCloseModel[83] = new ModelRendererTurbo(this, 120, 14, textureX, textureY); // Import Box644
		bodyDoorCloseModel[84] = new ModelRendererTurbo(this, 95, 20, textureX, textureY); // Import Box645
		bodyDoorCloseModel[85] = new ModelRendererTurbo(this, 120, 20, textureX, textureY); // Import Box646
		bodyDoorCloseModel[86] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box647
		bodyDoorCloseModel[87] = new ModelRendererTurbo(this, 120, 25, textureX, textureY); // Import Box648
		bodyDoorCloseModel[88] = new ModelRendererTurbo(this, 95, 25, textureX, textureY); // Import Box651
		bodyDoorCloseModel[89] = new ModelRendererTurbo(this, 120, 25, textureX, textureY); // Import Box652
		bodyDoorCloseModel[90] = new ModelRendererTurbo(this, 95, 28, textureX, textureY); // Import Box653
		bodyDoorCloseModel[91] = new ModelRendererTurbo(this, 120, 28, textureX, textureY); // Import Box654
		bodyDoorCloseModel[92] = new ModelRendererTurbo(this, 95, 32, textureX, textureY); // Import Box655
		bodyDoorCloseModel[93] = new ModelRendererTurbo(this, 120, 32, textureX, textureY); // Import Box656
		bodyDoorCloseModel[94] = new ModelRendererTurbo(this, 95, 37, textureX, textureY); // Import Box657
		bodyDoorCloseModel[95] = new ModelRendererTurbo(this, 120, 37, textureX, textureY); // Import Box658
		bodyDoorCloseModel[96] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Import Box659
		bodyDoorCloseModel[97] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Import Box660
		bodyDoorCloseModel[98] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box661
		bodyDoorCloseModel[99] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box662
		bodyDoorCloseModel[100] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Import Box663
		bodyDoorCloseModel[101] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Import Box664
		bodyDoorCloseModel[102] = new ModelRendererTurbo(this, 0, 37, textureX, textureY); // Import Box665
		bodyDoorCloseModel[103] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Import Box666
		bodyDoorCloseModel[104] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box667
		bodyDoorCloseModel[105] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Import Box668
		bodyDoorCloseModel[106] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Import Box669
		bodyDoorCloseModel[107] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box670
		bodyDoorCloseModel[108] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box671
		bodyDoorCloseModel[109] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box672
		bodyDoorCloseModel[110] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box673
		bodyDoorCloseModel[111] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box674
		bodyDoorCloseModel[112] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box675
		bodyDoorCloseModel[113] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box676
		bodyDoorCloseModel[114] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box677
		bodyDoorCloseModel[115] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box678
		bodyDoorCloseModel[116] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box679
		bodyDoorCloseModel[117] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box680
		bodyDoorCloseModel[118] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box681
		bodyDoorCloseModel[119] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Import Box682
		bodyDoorCloseModel[120] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Import Box683
		bodyDoorCloseModel[121] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box684
		bodyDoorCloseModel[122] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box685
		bodyDoorCloseModel[123] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Import Box686
		bodyDoorCloseModel[124] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Import Box687
		bodyDoorCloseModel[125] = new ModelRendererTurbo(this, 0, 37, textureX, textureY); // Import Box688
		bodyDoorCloseModel[126] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Import Box689
		bodyDoorCloseModel[127] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Import Box690
		bodyDoorCloseModel[128] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box691
		bodyDoorCloseModel[129] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Import Box692
		bodyDoorCloseModel[130] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box693
		bodyDoorCloseModel[131] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box694
		bodyDoorCloseModel[132] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box695
		bodyDoorCloseModel[133] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box696
		bodyDoorCloseModel[134] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box697
		bodyDoorCloseModel[135] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box698
		bodyDoorCloseModel[136] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box699
		bodyDoorCloseModel[137] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box700
		bodyDoorCloseModel[138] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box701
		bodyDoorCloseModel[139] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box702
		bodyDoorCloseModel[140] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box703
		bodyDoorCloseModel[141] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box704
		bodyDoorCloseModel[142] = new ModelRendererTurbo(this, 0, 37, textureX, textureY); // Import Box705
		bodyDoorCloseModel[143] = new ModelRendererTurbo(this, 0, 32, textureX, textureY); // Import Box706
		bodyDoorCloseModel[144] = new ModelRendererTurbo(this, 0, 28, textureX, textureY); // Import Box707
		bodyDoorCloseModel[145] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box708
		bodyDoorCloseModel[146] = new ModelRendererTurbo(this, 95, 25, textureX, textureY); // Import Box709
		bodyDoorCloseModel[147] = new ModelRendererTurbo(this, 0, 20, textureX, textureY); // Import Box710
		bodyDoorCloseModel[148] = new ModelRendererTurbo(this, 0, 14, textureX, textureY); // Import Box711
		bodyDoorCloseModel[149] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Import Box712
		bodyDoorCloseModel[150] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box713
		bodyDoorCloseModel[151] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Import Box714
		bodyDoorCloseModel[152] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Import Box715
		bodyDoorCloseModel[153] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box716
		bodyDoorCloseModel[154] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box717
		bodyDoorCloseModel[155] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box718
		bodyDoorCloseModel[156] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box719
		bodyDoorCloseModel[157] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box720
		bodyDoorCloseModel[158] = new ModelRendererTurbo(this, 0, 72, textureX, textureY); // Import Box721
		bodyDoorCloseModel[159] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box722
		bodyDoorCloseModel[160] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box723
		bodyDoorCloseModel[161] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box724
		bodyDoorCloseModel[162] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Import Box725
		bodyDoorCloseModel[163] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Import Box726
		bodyDoorCloseModel[164] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box727
		bodyDoorCloseModel[165] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Import Box728
		bodyDoorCloseModel[166] = new ModelRendererTurbo(this, 0, 76, textureX, textureY); // Import Box729
		bodyDoorCloseModel[167] = new ModelRendererTurbo(this, 0, 68, textureX, textureY); // Import Box730
		bodyDoorCloseModel[168] = new ModelRendererTurbo(this, 0, 57, textureX, textureY); // Import Box731
		bodyDoorCloseModel[169] = new ModelRendererTurbo(this, 0, 44, textureX, textureY); // Import Box732
		bodyDoorCloseModel[170] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box733
		bodyDoorCloseModel[171] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box734
		bodyDoorCloseModel[172] = new ModelRendererTurbo(this, 0, 0, textureX, textureY); // Import Box735
		bodyDoorCloseModel[173] = new ModelRendererTurbo(this, 139, 37, textureX, textureY); // Import Box736
		bodyDoorCloseModel[174] = new ModelRendererTurbo(this, 33, 66, textureX, textureY); // Import Box737
		bodyDoorCloseModel[175] = new ModelRendererTurbo(this, 33, 58, textureX, textureY); // Import Box738
		bodyDoorCloseModel[176] = new ModelRendererTurbo(this, 24, 58, textureX, textureY); // Import Box739
		bodyDoorCloseModel[177] = new ModelRendererTurbo(this, 13, 58, textureX, textureY); // Import Box740
		bodyDoorCloseModel[178] = new ModelRendererTurbo(this, 95, 14, textureX, textureY); // Import Box741
		bodyDoorCloseModel[179] = new ModelRendererTurbo(this, 120, 14, textureX, textureY); // Import Box742
		bodyDoorCloseModel[180] = new ModelRendererTurbo(this, 95, 20, textureX, textureY); // Import Box743
		bodyDoorCloseModel[181] = new ModelRendererTurbo(this, 120, 20, textureX, textureY); // Import Box744
		bodyDoorCloseModel[182] = new ModelRendererTurbo(this, 0, 25, textureX, textureY); // Import Box745
		bodyDoorCloseModel[183] = new ModelRendererTurbo(this, 120, 25, textureX, textureY); // Import Box746
		bodyDoorCloseModel[184] = new ModelRendererTurbo(this, 95, 25, textureX, textureY); // Import Box747
		bodyDoorCloseModel[185] = new ModelRendererTurbo(this, 120, 25, textureX, textureY); // Import Box748
		bodyDoorCloseModel[186] = new ModelRendererTurbo(this, 95, 28, textureX, textureY); // Import Box749
		bodyDoorCloseModel[187] = new ModelRendererTurbo(this, 120, 28, textureX, textureY); // Import Box750
		bodyDoorCloseModel[188] = new ModelRendererTurbo(this, 95, 32, textureX, textureY); // Import Box751
		bodyDoorCloseModel[189] = new ModelRendererTurbo(this, 120, 32, textureX, textureY); // Import Box752
		bodyDoorCloseModel[190] = new ModelRendererTurbo(this, 95, 37, textureX, textureY); // Import Box753
		bodyDoorCloseModel[191] = new ModelRendererTurbo(this, 120, 37, textureX, textureY); // Import Box754
		bodyDoorCloseModel[192] = new ModelRendererTurbo(this, 13, 44, textureX, textureY); // Import Box755
		bodyDoorCloseModel[193] = new ModelRendererTurbo(this, 13, 44, textureX, textureY); // Import Box756

		bodyDoorCloseModel[0].addShapeBox(0F, 0F, -4F, 43, 1, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box555
		bodyDoorCloseModel[0].setRotationPoint(-27F, -22.5F, -26F);

		bodyDoorCloseModel[1].addShapeBox(0F, 1F, -7F, 43, 1, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box559
		bodyDoorCloseModel[1].setRotationPoint(-27F, -22.5F, -26F);

		bodyDoorCloseModel[2].addShapeBox(0F, 3F, -8F, 43, 1, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box560
		bodyDoorCloseModel[2].setRotationPoint(-27F, -22.5F, -26F);

		bodyDoorCloseModel[3].addShapeBox(0F, 4.5F, -8.5F, 43, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box564
		bodyDoorCloseModel[3].setRotationPoint(-27F, -22.5F, -26F);

		bodyDoorCloseModel[4].addShapeBox(0F, 7F, -10F, 43, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box565
		bodyDoorCloseModel[4].setRotationPoint(-27F, -22.5F, -26F);

		bodyDoorCloseModel[5].addShapeBox(0F, 5F, -9F, 43, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, 0F, 0F, -1F); // Import Box566
		bodyDoorCloseModel[5].setRotationPoint(-27F, -22.5F, -26F);

		bodyDoorCloseModel[6].addShapeBox(0F, 10F, -11F, 43, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box567
		bodyDoorCloseModel[6].setRotationPoint(-27F, -22.5F, -26F);

		bodyDoorCloseModel[7].addShapeBox(1F, 1F, -4F, 2, 8, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box568
		bodyDoorCloseModel[7].setRotationPoint(-26.5F, -22.5F, -26F);

		bodyDoorCloseModel[8].addShapeBox(1F, 2F, -7F, 2, 7, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box569
		bodyDoorCloseModel[8].setRotationPoint(-26.5F, -22.5F, -26F);

		bodyDoorCloseModel[9].addShapeBox(1F, 4F, -9F, 2, 5, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box570
		bodyDoorCloseModel[9].setRotationPoint(-26.5F, -22.5F, -26F);

		bodyDoorCloseModel[10].addShapeBox(1F, 7F, -10F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box571
		bodyDoorCloseModel[10].setRotationPoint(-26.5F, -22.5F, -26F);

		bodyDoorCloseModel[11].addShapeBox(0F, 1F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box576
		bodyDoorCloseModel[11].setRotationPoint(-22F, -19.5F, -34F);

		bodyDoorCloseModel[12].addShapeBox(0F, 0F, -1.25F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box577
		bodyDoorCloseModel[12].setRotationPoint(-22F, -19.5F, -34F);

		bodyDoorCloseModel[13].addShapeBox(0F, 2F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box578
		bodyDoorCloseModel[13].setRotationPoint(-22F, -19.5F, -34F);

		bodyDoorCloseModel[14].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box579
		bodyDoorCloseModel[14].setRotationPoint(-22F, -19.5F, -34F);

		bodyDoorCloseModel[15].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box581
		bodyDoorCloseModel[15].setRotationPoint(-22F, -19.5F, -34F);

		bodyDoorCloseModel[16].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box582
		bodyDoorCloseModel[16].setRotationPoint(-22F, -19.5F, -34F);

		bodyDoorCloseModel[17].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box583
		bodyDoorCloseModel[17].setRotationPoint(8F, -19.5F, -34F);

		bodyDoorCloseModel[18].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box584
		bodyDoorCloseModel[18].setRotationPoint(8F, -19.5F, -34F);

		bodyDoorCloseModel[19].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box585
		bodyDoorCloseModel[19].setRotationPoint(8F, -19.5F, -34F);

		bodyDoorCloseModel[20].addShapeBox(0F, 0F, -1.25F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box586
		bodyDoorCloseModel[20].setRotationPoint(8F, -19.5F, -34F);

		bodyDoorCloseModel[21].addShapeBox(0F, 1F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box587
		bodyDoorCloseModel[21].setRotationPoint(8F, -19.5F, -34F);

		bodyDoorCloseModel[22].addShapeBox(0F, 2F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box588
		bodyDoorCloseModel[22].setRotationPoint(8F, -19.5F, -34F);

		bodyDoorCloseModel[23].addShapeBox(-1F, 0F, -4F, 43, 1, 4, 0F,-0.5F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F); // Import Box589
		bodyDoorCloseModel[23].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[24].addShapeBox(-1F, 1F, -7F, 43, 1, 3, 0F,-1F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 2F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, -1F, 0F, 0F); // Import Box590
		bodyDoorCloseModel[24].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[25].addShapeBox(-1F, 3F, -8F, 43, 1, 1, 0F,-1.25F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1.5F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, -1.5F, 0F, 0F); // Import Box591
		bodyDoorCloseModel[25].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[26].addShapeBox(-1F, 4.5F, -8.5F, 43, 1, 1, 0F,-1.5F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, 0.5F, -0.5F, -1.25F, 0.5F, -0.5F, -1.5F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, -1F, 0F, -1.5F, -1F, 0F); // Import Box592
		bodyDoorCloseModel[26].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[27].addShapeBox(-1F, 7F, -10F, 43, 3, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.75F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -2.75F, 0F, -1F); // Import Box593
		bodyDoorCloseModel[27].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[28].addShapeBox(-1F, 5F, -9F, 43, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, -1F, -2F, 0F, -1F); // Import Box594
		bodyDoorCloseModel[28].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[29].addShapeBox(-1F, 10F, -11F, 43, 5, 1, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box595
		bodyDoorCloseModel[29].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[30].addShapeBox(39F, 7F, -10F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box600
		bodyDoorCloseModel[30].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[31].addShapeBox(39F, 4F, -9F, 2, 5, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box601
		bodyDoorCloseModel[31].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[32].addShapeBox(39F, 2F, -7F, 2, 7, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box602
		bodyDoorCloseModel[32].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[33].addShapeBox(39F, 1F, -4F, 2, 8, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box603
		bodyDoorCloseModel[33].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[34].addShapeBox(0F, 1F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box604
		bodyDoorCloseModel[34].setRotationPoint(-64F, -19.5F, -34F);

		bodyDoorCloseModel[35].addShapeBox(0F, 0F, -1.25F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box605
		bodyDoorCloseModel[35].setRotationPoint(-64F, -19.5F, -34F);

		bodyDoorCloseModel[36].addShapeBox(0F, 2F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box606
		bodyDoorCloseModel[36].setRotationPoint(-64F, -19.5F, -34F);

		bodyDoorCloseModel[37].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box607
		bodyDoorCloseModel[37].setRotationPoint(-64F, -19.5F, -34F);

		bodyDoorCloseModel[38].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box608
		bodyDoorCloseModel[38].setRotationPoint(-64F, -19.5F, -34F);

		bodyDoorCloseModel[39].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box609
		bodyDoorCloseModel[39].setRotationPoint(-64F, -19.5F, -34F);

		bodyDoorCloseModel[40].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box610
		bodyDoorCloseModel[40].setRotationPoint(-34F, -19.5F, -34F);

		bodyDoorCloseModel[41].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box611
		bodyDoorCloseModel[41].setRotationPoint(-34F, -19.5F, -34F);

		bodyDoorCloseModel[42].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box612
		bodyDoorCloseModel[42].setRotationPoint(-34F, -19.5F, -34F);

		bodyDoorCloseModel[43].addShapeBox(0F, 0F, -1.25F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box613
		bodyDoorCloseModel[43].setRotationPoint(-34F, -19.5F, -34F);

		bodyDoorCloseModel[44].addShapeBox(0F, 1F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box614
		bodyDoorCloseModel[44].setRotationPoint(-34F, -19.5F, -34F);

		bodyDoorCloseModel[45].addShapeBox(0F, 2F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box615
		bodyDoorCloseModel[45].setRotationPoint(-34F, -19.5F, -34F);

		bodyDoorCloseModel[46].addShapeBox(0F, 10F, -11F, 43, 5, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box616
		bodyDoorCloseModel[46].setRotationPoint(16F, -22.5F, -26F);

		bodyDoorCloseModel[47].addShapeBox(0F, 7F, -10F, 43, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -1F, 0F, 0F, -1F); // Import Box617
		bodyDoorCloseModel[47].setRotationPoint(16F, -22.5F, -26F);

		bodyDoorCloseModel[48].addShapeBox(0F, 5F, -9F, 43, 2, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, -4F, 0F, 1F, -4F, 0F, -1F, 0F, 0F, -1F); // Import Box618
		bodyDoorCloseModel[48].setRotationPoint(16F, -22.5F, -26F);

		bodyDoorCloseModel[49].addShapeBox(0F, 4.5F, -8.5F, 43, 1, 1, 0F,0F, -0.5F, 0.5F, -4F, -0.5F, 0.5F, -4F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, -4F, -0.5F, -0.5F, -4F, -1F, 0F, 0F, -1F, 0F); // Import Box619
		bodyDoorCloseModel[49].setRotationPoint(16F, -22.5F, -26F);

		bodyDoorCloseModel[50].addShapeBox(0F, 3F, -8F, 8, 1, 1, 0F,0F, -1F, 0F, 0F, -2.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 2.5F, -0.5F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box620
		bodyDoorCloseModel[50].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[51].addShapeBox(0F, 1F, -7F, 43, 1, 3, 0F,0F, -2F, 0F, -4F, -2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -4F, 2F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box621
		bodyDoorCloseModel[51].setRotationPoint(16F, -22.5F, -26F);

		bodyDoorCloseModel[52].addShapeBox(0F, 0F, -4F, 43, 1, 4, 0F,0F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -4F, 1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box622
		bodyDoorCloseModel[52].setRotationPoint(16F, -22.5F, -26F);

		bodyDoorCloseModel[53].addShapeBox(36F, 1F, -4F, 2, 6, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box623
		bodyDoorCloseModel[53].setRotationPoint(18.5F, -22.5F, -26F);

		bodyDoorCloseModel[54].addShapeBox(36F, 2F, -7F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box624
		bodyDoorCloseModel[54].setRotationPoint(18.5F, -22.5F, -26F);

		bodyDoorCloseModel[55].addShapeBox(36F, 4F, -9F, 2, 5, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box625
		bodyDoorCloseModel[55].setRotationPoint(18.5F, -22.5F, -26F);

		bodyDoorCloseModel[56].addShapeBox(36F, 7F, -10F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box630
		bodyDoorCloseModel[56].setRotationPoint(18.5F, -22.5F, -26F);

		bodyDoorCloseModel[57].addShapeBox(0F, 2F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box631
		bodyDoorCloseModel[57].setRotationPoint(20F, -19.5F, -34F);

		bodyDoorCloseModel[58].addShapeBox(0F, 1F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box632
		bodyDoorCloseModel[58].setRotationPoint(20F, -19.5F, -34F);

		bodyDoorCloseModel[59].addShapeBox(0F, 0F, -1.25F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box633
		bodyDoorCloseModel[59].setRotationPoint(20F, -19.5F, -34F);

		bodyDoorCloseModel[60].addShapeBox(0F, 0F, -1.25F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box634
		bodyDoorCloseModel[60].setRotationPoint(50F, -19.5F, -34F);

		bodyDoorCloseModel[61].addShapeBox(0F, 1F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box635
		bodyDoorCloseModel[61].setRotationPoint(50F, -19.5F, -34F);

		bodyDoorCloseModel[62].addShapeBox(0F, 2F, -1.25F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box636
		bodyDoorCloseModel[62].setRotationPoint(50F, -19.5F, -34F);

		bodyDoorCloseModel[63].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box637
		bodyDoorCloseModel[63].setRotationPoint(50F, -19.5F, -34F);

		bodyDoorCloseModel[64].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box638
		bodyDoorCloseModel[64].setRotationPoint(50F, -19.5F, -34F);

		bodyDoorCloseModel[65].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box639
		bodyDoorCloseModel[65].setRotationPoint(50F, -19.5F, -34F);

		bodyDoorCloseModel[66].addShapeBox(-2F, 7F, -10F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box640
		bodyDoorCloseModel[66].setRotationPoint(18.5F, -22.5F, -26F);

		bodyDoorCloseModel[67].addShapeBox(-2F, 4F, -9F, 2, 5, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box641
		bodyDoorCloseModel[67].setRotationPoint(18.5F, -22.5F, -26F);

		bodyDoorCloseModel[68].addShapeBox(-2F, 2F, -7F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box642
		bodyDoorCloseModel[68].setRotationPoint(18.5F, -22.5F, -26F);

		bodyDoorCloseModel[69].addShapeBox(-2F, 1F, -4F, 2, 6, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box643
		bodyDoorCloseModel[69].setRotationPoint(18.5F, -22.5F, -26F);

		bodyDoorCloseModel[70].addShapeBox(36F, 7F, -10F, 2, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box644
		bodyDoorCloseModel[70].setRotationPoint(-23.5F, -22.5F, -26F);

		bodyDoorCloseModel[71].addShapeBox(36F, 4F, -9F, 2, 5, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box645
		bodyDoorCloseModel[71].setRotationPoint(-23.5F, -22.5F, -26F);

		bodyDoorCloseModel[72].addShapeBox(36F, 2F, -7F, 2, 6, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Import Box646
		bodyDoorCloseModel[72].setRotationPoint(-23.5F, -22.5F, -26F);

		bodyDoorCloseModel[73].addShapeBox(36F, 1F, -4F, 2, 6, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box647
		bodyDoorCloseModel[73].setRotationPoint(-23.5F, -22.5F, -26F);

		bodyDoorCloseModel[74].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box648
		bodyDoorCloseModel[74].setRotationPoint(20F, -19.5F, -34F);

		bodyDoorCloseModel[75].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box649
		bodyDoorCloseModel[75].setRotationPoint(20F, -19.5F, -34F);

		bodyDoorCloseModel[76].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box650
		bodyDoorCloseModel[76].setRotationPoint(20F, -19.5F, -34F);

		bodyDoorCloseModel[77].addShapeBox(2F, 10F, -11F, 4, 5, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F); // Import Box651
		bodyDoorCloseModel[77].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[78].addShapeBox(2.5F, 7F, -10F, 1, 2, 1, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0.125F, 0F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F); // Import Box632
		bodyDoorCloseModel[78].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[79].addShapeBox(1F, 4F, -9F, 1, 5, 2, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import Box633
		bodyDoorCloseModel[79].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[80].addShapeBox(1F, 2F, -7F, 1, 7, 3, 0F,0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import Box634
		bodyDoorCloseModel[80].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[81].addShapeBox(1F, 1F, -4F, 1, 8, 4, 0F,0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import Box635
		bodyDoorCloseModel[81].setRotationPoint(-69F, -22.5F, -26F);

		bodyDoorCloseModel[82].addShapeBox(0F, 0F, -4F, 8, 1, 4, 0F,0F, -1F, 0F, 0F, -2.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 3F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box643
		bodyDoorCloseModel[82].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[83].addShapeBox(8F, 2F, -4F, 16, 1, 4, 0F,0F, -0.75F, 0F, -1.1F, -8F, 0F, -1.1F, -8F, 0F, 0F, 0.25F, 0F, 0F, 1F, 0F, -2F, 8F, 0F, -2F, 8F, 0F, 0F, 0F, 0F); // Import Box644
		bodyDoorCloseModel[83].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[84].addShapeBox(0F, 1F, -7F, 8, 1, 3, 0F,0F, -2F, 0F, 0F, -3.75F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F, 0F, 0F, 0F); // Import Box645
		bodyDoorCloseModel[84].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[85].addShapeBox(8F, 3F, -7F, 15, 1, 3, 0F,0F, -1.75F, 0F, -0.5F, -7.5F, 0F, -0.1F, -7F, 0F, 0F, 0.25F, 0F, 0F, 2F, 0F, -1.5F, 7.5F, 0F, -1F, 7F, 0F, 0F, 0F, 0F); // Import Box646
		bodyDoorCloseModel[85].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[86].addShapeBox(0F, 3F, -8F, 43, 1, 1, 0F,0F, -1F, 0F, -4F, -1F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -4F, 0.5F, -0.5F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box647
		bodyDoorCloseModel[86].setRotationPoint(16F, -22.5F, -26F);

		bodyDoorCloseModel[87].addShapeBox(8F, 5F, -8F, 15, 1, 1, 0F,0F, -0.75F, 0F, -1.25F, -6F, 0F, -0.5F, -5.5F, 0F, 0F, 0.25F, 0F, 0F, 0.5F, -0.5F, -2F, 5.75F, -0.25F, -1.5F, 5.5F, 0F, 0F, 0F, 0F); // Import Box648
		bodyDoorCloseModel[87].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[88].addShapeBox(0F, 4.5F, -8.5F, 8, 1, 1, 0F,0F, -0.5F, 0.5F, 0F, -2.25F, 0.5F, 0F, -1.25F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 1.5F, -0.5F, 0F, 1F, 0F, 0F, -1F, 0F); // Import Box651
		bodyDoorCloseModel[88].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[89].addShapeBox(8F, 6.5F, -8.5F, 15, 1, 1, 0F,0F, -0.25F, 0.5F, -2.75F, -5.5F, 0.5F, -1.25F, -4.5F, -0.5F, 0F, 0.75F, -0.5F, 0F, -0.5F, -0.5F, -2.5F, 4.5F, -0.5F, -2F, 4.25F, -0.25F, 0F, -1F, 0F); // Import Box652
		bodyDoorCloseModel[89].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[90].addShapeBox(0F, 5F, -9F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1.5F, 1F, 0F, 1.5F, -1F, 0F, 0F, -1F); // Import Box653
		bodyDoorCloseModel[90].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[91].addShapeBox(8F, 7F, -9F, 12, 2, 1, 0F,0F, 0.25F, 0F, 0.25F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, 1F, -2F, 4.75F, 1F, -1.75F, 4.75F, -1F, 0F, -0.5F, -1F); // Import Box654
		bodyDoorCloseModel[91].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[92].addShapeBox(0F, 7F, -10F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0.25F, 0.5F, 0F, 0.25F, -0.5F, 0F, 0F, -1F); // Import Box655
		bodyDoorCloseModel[92].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[93].addShapeBox(8F, 9F, -10F, 11, 3, 1, 0F,0F, 0.5F, 0F, -1F, -4.75F, 0F, -0.75F, -4.75F, 0F, 0F, 0.5F, 0F, 0F, -1.75F, 0.5F, -2.75F, 2.75F, 0.25F, -2.5F, 2.75F, -0.25F, 0F, -1.75F, -0.5F); // Import Box656
		bodyDoorCloseModel[93].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[94].addShapeBox(0F, 10F, -11F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, -0.25F, -0.5F, 0F, -0.25F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0.25F, 0F, 0F, 0F); // Import Box657
		bodyDoorCloseModel[94].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[95].addShapeBox(8F, 10F, -11F, 8, 5, 1, 0F,0F, -0.25F, -0.5F, 0.25F, -4.75F, -0.75F, 0.5F, -4.75F, 0.75F, 0F, -0.25F, 0.5F, 0F, 0F, -0.25F, -2.5F, 0F, -0.5F, -2.5F, 0F, 0.5F, 0F, 0F, 0.25F); // Import Box658
		bodyDoorCloseModel[95].setRotationPoint(55F, -22.5F, -26F);

		bodyDoorCloseModel[96].addShapeBox(0F, 0F, 0F, 43, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F); // Import Box659
		bodyDoorCloseModel[96].setRotationPoint(-27F, -22.5F, 26F);

		bodyDoorCloseModel[97].addShapeBox(0F, 1F, 4F, 43, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2F, 0F); // Import Box660
		bodyDoorCloseModel[97].setRotationPoint(-27F, -22.5F, 26F);

		bodyDoorCloseModel[98].addShapeBox(0F, 3F, 7F, 43, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import Box661
		bodyDoorCloseModel[98].setRotationPoint(-27F, -22.5F, 26F);

		bodyDoorCloseModel[99].addShapeBox(0F, 4.5F, 7.5F, 43, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box662
		bodyDoorCloseModel[99].setRotationPoint(-27F, -22.5F, 26F);

		bodyDoorCloseModel[100].addShapeBox(0F, 7F, 9F, 43, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box663
		bodyDoorCloseModel[100].setRotationPoint(-27F, -22.5F, 26F);

		bodyDoorCloseModel[101].addShapeBox(0F, 5F, 8F, 43, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1F); // Import Box664
		bodyDoorCloseModel[101].setRotationPoint(-27F, -22.5F, 26F);

		bodyDoorCloseModel[102].addShapeBox(0F, 10F, 10F, 43, 5, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box665
		bodyDoorCloseModel[102].setRotationPoint(-27F, -22.5F, 26F);

		bodyDoorCloseModel[103].addShapeBox(1F, 1F, -4F, 2, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box666
		bodyDoorCloseModel[103].setRotationPoint(-26.5F, -22.5F, 30F);

		bodyDoorCloseModel[104].addShapeBox(1F, 2F, 4F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box667
		bodyDoorCloseModel[104].setRotationPoint(-26.5F, -22.5F, 26F);

		bodyDoorCloseModel[105].addShapeBox(1F, 4F, 1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box668
		bodyDoorCloseModel[105].setRotationPoint(-26.5F, -22.5F, 32F);

		bodyDoorCloseModel[106].addShapeBox(1F, 7F, 2F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box669
		bodyDoorCloseModel[106].setRotationPoint(-26.5F, -22.5F, 33F);

		bodyDoorCloseModel[107].addShapeBox(0F, 1F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box670
		bodyDoorCloseModel[107].setRotationPoint(-22F, -19.5F, 28F);

		bodyDoorCloseModel[108].addShapeBox(0F, 0F, -1.75F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box671
		bodyDoorCloseModel[108].setRotationPoint(-22F, -19.5F, 28F);

		bodyDoorCloseModel[109].addShapeBox(0F, 2F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box672
		bodyDoorCloseModel[109].setRotationPoint(-22F, -19.5F, 28F);

		bodyDoorCloseModel[110].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box673
		bodyDoorCloseModel[110].setRotationPoint(-22F, -19.5F, 37F);

		bodyDoorCloseModel[111].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box674
		bodyDoorCloseModel[111].setRotationPoint(-22F, -19.5F, 37F);

		bodyDoorCloseModel[112].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box675
		bodyDoorCloseModel[112].setRotationPoint(-22F, -19.5F, 37F);

		bodyDoorCloseModel[113].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box676
		bodyDoorCloseModel[113].setRotationPoint(8F, -19.5F, 37F);

		bodyDoorCloseModel[114].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box677
		bodyDoorCloseModel[114].setRotationPoint(8F, -19.5F, 37F);

		bodyDoorCloseModel[115].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box678
		bodyDoorCloseModel[115].setRotationPoint(8F, -19.5F, 37F);

		bodyDoorCloseModel[116].addShapeBox(0F, 0F, -1.75F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box679
		bodyDoorCloseModel[116].setRotationPoint(8F, -19.5F, 28F);

		bodyDoorCloseModel[117].addShapeBox(0F, 1F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box680
		bodyDoorCloseModel[117].setRotationPoint(8F, -19.5F, 28F);

		bodyDoorCloseModel[118].addShapeBox(0F, 2F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box681
		bodyDoorCloseModel[118].setRotationPoint(8F, -19.5F, 28F);

		bodyDoorCloseModel[119].addShapeBox(-1F, 0F, 0F, 43, 1, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, -1F, 1F, 0F); // Import Box682
		bodyDoorCloseModel[119].setRotationPoint(-69F, -22.5F, 26F);

		bodyDoorCloseModel[120].addShapeBox(-1F, 1F, 4F, 43, 1, 3, 0F,-0.5F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, -1F, -2F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, -1.5F, 2F, 0F); // Import Box683
		bodyDoorCloseModel[120].setRotationPoint(-69F, -22.5F, 26F);

		bodyDoorCloseModel[121].addShapeBox(-1F, 3F, 7F, 43, 1, 1, 0F,-1F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1.25F, -1F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, -1.5F, 0.5F, -0.5F); // Import Box684
		bodyDoorCloseModel[121].setRotationPoint(-69F, -22.5F, 26F);

		bodyDoorCloseModel[122].addShapeBox(-1F, 4.5F, 7.5F, 43, 1, 1, 0F,-1.25F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0.5F, -1.5F, -0.5F, 0.5F, -1.5F, -1F, 0F, 0F, -1F, 0F, 0F, -0.5F, -0.5F, -1.5F, -0.5F, -0.5F); // Import Box685
		bodyDoorCloseModel[122].setRotationPoint(-69F, -22.5F, 26F);

		bodyDoorCloseModel[123].addShapeBox(-1F, 7F, 9F, 43, 3, 1, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2.75F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -2.75F, 0F, 1F); // Import Box686
		bodyDoorCloseModel[123].setRotationPoint(-69F, -22.5F, 26F);

		bodyDoorCloseModel[124].addShapeBox(-1F, 5F, 8F, 43, 2, 1, 0F,-1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 1F, -2F, 0F, 1F); // Import Box687
		bodyDoorCloseModel[124].setRotationPoint(-69F, -22.5F, 26F);

		bodyDoorCloseModel[125].addShapeBox(-1F, 10F, 10F, 43, 5, 1, 0F,-7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F); // Import Box688
		bodyDoorCloseModel[125].setRotationPoint(-69F, -22.5F, 26F);

		bodyDoorCloseModel[126].addShapeBox(39F, 7F, 2F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box689
		bodyDoorCloseModel[126].setRotationPoint(-69F, -22.5F, 33F);

		bodyDoorCloseModel[127].addShapeBox(39F, 4F, 1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box690
		bodyDoorCloseModel[127].setRotationPoint(-69F, -22.5F, 32F);

		bodyDoorCloseModel[128].addShapeBox(39F, 2F, 4F, 2, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box691
		bodyDoorCloseModel[128].setRotationPoint(-69F, -22.5F, 26F);

		bodyDoorCloseModel[129].addShapeBox(39F, 1F, -4F, 2, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box692
		bodyDoorCloseModel[129].setRotationPoint(-69F, -22.5F, 30F);

		bodyDoorCloseModel[130].addShapeBox(0F, 1F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box693
		bodyDoorCloseModel[130].setRotationPoint(-64F, -19.5F, 28F);

		bodyDoorCloseModel[131].addShapeBox(0F, 0F, -1.75F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box694
		bodyDoorCloseModel[131].setRotationPoint(-64F, -19.5F, 28F);

		bodyDoorCloseModel[132].addShapeBox(0F, 2F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box695
		bodyDoorCloseModel[132].setRotationPoint(-64F, -19.5F, 28F);

		bodyDoorCloseModel[133].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box696
		bodyDoorCloseModel[133].setRotationPoint(-64F, -19.5F, 37F);

		bodyDoorCloseModel[134].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box697
		bodyDoorCloseModel[134].setRotationPoint(-64F, -19.5F, 37F);

		bodyDoorCloseModel[135].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box698
		bodyDoorCloseModel[135].setRotationPoint(-64F, -19.5F, 37F);

		bodyDoorCloseModel[136].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box699
		bodyDoorCloseModel[136].setRotationPoint(-34F, -19.5F, 37F);

		bodyDoorCloseModel[137].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box700
		bodyDoorCloseModel[137].setRotationPoint(-34F, -19.5F, 37F);

		bodyDoorCloseModel[138].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box701
		bodyDoorCloseModel[138].setRotationPoint(-34F, -19.5F, 37F);

		bodyDoorCloseModel[139].addShapeBox(0F, 0F, -1.75F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box702
		bodyDoorCloseModel[139].setRotationPoint(-34F, -19.5F, 28F);

		bodyDoorCloseModel[140].addShapeBox(0F, 1F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box703
		bodyDoorCloseModel[140].setRotationPoint(-34F, -19.5F, 28F);

		bodyDoorCloseModel[141].addShapeBox(0F, 2F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box704
		bodyDoorCloseModel[141].setRotationPoint(-34F, -19.5F, 28F);

		bodyDoorCloseModel[142].addShapeBox(0F, 10F, 10F, 43, 5, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box705
		bodyDoorCloseModel[142].setRotationPoint(16F, -22.5F, 26F);

		bodyDoorCloseModel[143].addShapeBox(0F, 7F, 9F, 43, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 1F); // Import Box706
		bodyDoorCloseModel[143].setRotationPoint(16F, -22.5F, 26F);

		bodyDoorCloseModel[144].addShapeBox(0F, 5F, 8F, 43, 2, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, -4F, 0F, -1F, -4F, 0F, 1F, 0F, 0F, 1F); // Import Box707
		bodyDoorCloseModel[144].setRotationPoint(16F, -22.5F, 26F);

		bodyDoorCloseModel[145].addShapeBox(0F, 4.5F, 7.5F, 43, 1, 1, 0F,0F, 0.5F, -0.5F, -4F, 0.5F, -0.5F, -4F, -0.5F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, -4F, -1F, 0F, -4F, -0.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box708
		bodyDoorCloseModel[145].setRotationPoint(16F, -22.5F, 26F);

		bodyDoorCloseModel[146].addShapeBox(0F, 3F, 7F, 8, 1, 1, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 2.5F, -0.5F, 0F, 0.5F, -0.5F); // Import Box709
		bodyDoorCloseModel[146].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[147].addShapeBox(0F, 1F, 4F, 43, 1, 3, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 2F, 0F, 0F, 2F, 0F); // Import Box710
		bodyDoorCloseModel[147].setRotationPoint(16F, -22.5F, 26F);

		bodyDoorCloseModel[148].addShapeBox(0F, 0F, 0F, 43, 1, 4, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 1F, 0F, 0F, 1F, 0F); // Import Box711
		bodyDoorCloseModel[148].setRotationPoint(16F, -22.5F, 26F);

		bodyDoorCloseModel[149].addShapeBox(36F, 1F, -4F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box712
		bodyDoorCloseModel[149].setRotationPoint(18.5F, -22.5F, 30F);

		bodyDoorCloseModel[150].addShapeBox(36F, 2F, 4F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box713
		bodyDoorCloseModel[150].setRotationPoint(18.5F, -22.5F, 26F);

		bodyDoorCloseModel[151].addShapeBox(36F, 4F, 1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box714
		bodyDoorCloseModel[151].setRotationPoint(18.5F, -22.5F, 32F);

		bodyDoorCloseModel[152].addShapeBox(36F, 7F, 2F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box715
		bodyDoorCloseModel[152].setRotationPoint(18.5F, -22.5F, 33F);

		bodyDoorCloseModel[153].addShapeBox(0F, 2F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box716
		bodyDoorCloseModel[153].setRotationPoint(20F, -19.5F, 28F);

		bodyDoorCloseModel[154].addShapeBox(0F, 1F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box717
		bodyDoorCloseModel[154].setRotationPoint(20F, -19.5F, 28F);

		bodyDoorCloseModel[155].addShapeBox(0F, 0F, -1.75F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box718
		bodyDoorCloseModel[155].setRotationPoint(20F, -19.5F, 28F);

		bodyDoorCloseModel[156].addShapeBox(0F, 0F, -1.75F, 3, 1, 9, 0F,-1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box719
		bodyDoorCloseModel[156].setRotationPoint(50F, -19.5F, 28F);

		bodyDoorCloseModel[157].addShapeBox(0F, 1F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box720
		bodyDoorCloseModel[157].setRotationPoint(50F, -19.5F, 28F);

		bodyDoorCloseModel[158].addShapeBox(0F, 2F, -1.75F, 3, 1, 9, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F); // Import Box721
		bodyDoorCloseModel[158].setRotationPoint(50F, -19.5F, 28F);

		bodyDoorCloseModel[159].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box722
		bodyDoorCloseModel[159].setRotationPoint(50F, -19.5F, 37F);

		bodyDoorCloseModel[160].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box723
		bodyDoorCloseModel[160].setRotationPoint(50F, -19.5F, 37F);

		bodyDoorCloseModel[161].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box724
		bodyDoorCloseModel[161].setRotationPoint(50F, -19.5F, 37F);

		bodyDoorCloseModel[162].addShapeBox(-2F, 7F, 2F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box725
		bodyDoorCloseModel[162].setRotationPoint(18.5F, -22.5F, 33F);

		bodyDoorCloseModel[163].addShapeBox(-2F, 4F, 1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box726
		bodyDoorCloseModel[163].setRotationPoint(18.5F, -22.5F, 32F);

		bodyDoorCloseModel[164].addShapeBox(-2F, 2F, -1F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box727
		bodyDoorCloseModel[164].setRotationPoint(18.5F, -22.5F, 31F);

		bodyDoorCloseModel[165].addShapeBox(-2F, 1F, -4F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box728
		bodyDoorCloseModel[165].setRotationPoint(18.5F, -22.5F, 30F);

		bodyDoorCloseModel[166].addShapeBox(36F, 7F, 2F, 2, 2, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box729
		bodyDoorCloseModel[166].setRotationPoint(-23.5F, -22.5F, 33F);

		bodyDoorCloseModel[167].addShapeBox(36F, 4F, 1F, 2, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box730
		bodyDoorCloseModel[167].setRotationPoint(-23.5F, -22.5F, 32F);

		bodyDoorCloseModel[168].addShapeBox(36F, 2F, 4F, 2, 6, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box731
		bodyDoorCloseModel[168].setRotationPoint(-23.5F, -22.5F, 26F);

		bodyDoorCloseModel[169].addShapeBox(36F, 1F, -4F, 2, 6, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box732
		bodyDoorCloseModel[169].setRotationPoint(-23.5F, -22.5F, 30F);

		bodyDoorCloseModel[170].addShapeBox(0F, 0.2F, -2F, 3, 1, 1, 0F,-1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F); // Import Box733
		bodyDoorCloseModel[170].setRotationPoint(20F, -19.5F, 37F);

		bodyDoorCloseModel[171].addShapeBox(0F, 1F, -2F, 3, 1, 1, 0F,-0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F, -0.2F, -0.2F, -0.125F); // Import Box734
		bodyDoorCloseModel[171].setRotationPoint(20F, -19.5F, 37F);

		bodyDoorCloseModel[172].addShapeBox(0F, 1.8F, -2F, 3, 1, 1, 0F,-0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -0.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F, -1.2F, 0F, -0.125F); // Import Box735
		bodyDoorCloseModel[172].setRotationPoint(20F, -19.5F, 37F);

		bodyDoorCloseModel[173].addShapeBox(2F, 10F, 10F, 4, 5, 1, 0F,0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F); // Import Box736
		bodyDoorCloseModel[173].setRotationPoint(-69F, -22.5F, 26F);

		bodyDoorCloseModel[174].addShapeBox(2.5F, 7F, 2F, 1, 2, 1, 0F,0.125F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -2.5F, 0F, 0F, 2.5F, 0F, 0F, 2.5F, 0F, 0F, -2.5F, 0F, 0F); // Import Box737
		bodyDoorCloseModel[174].setRotationPoint(-69F, -22.5F, 33F);

		bodyDoorCloseModel[175].addShapeBox(1F, 4F, 1F, 1, 5, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import Box738
		bodyDoorCloseModel[175].setRotationPoint(-69F, -22.5F, 32F);

		bodyDoorCloseModel[176].addShapeBox(1F, 2F, 4F, 1, 7, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import Box739
		bodyDoorCloseModel[176].setRotationPoint(-69F, -22.5F, 26F);

		bodyDoorCloseModel[177].addShapeBox(1F, 1F, -4F, 1, 8, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, -4F, 0F, 0F, 4F, 0F, 0F, 4F, 0F, 0F, -4F, 0F, 0F); // Import Box740
		bodyDoorCloseModel[177].setRotationPoint(-69F, -22.5F, 30F);

		bodyDoorCloseModel[178].addShapeBox(0F, 0F, 0F, 8, 1, 4, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -2.75F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 3F, 0F, 0F, 1F, 0F); // Import Box741
		bodyDoorCloseModel[178].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[179].addShapeBox(8F, 2F, 0F, 16, 1, 4, 0F,0F, 0.25F, 0F, -1.1F, -8F, 0F, -1.1F, -8F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -2F, 8F, 0F, -2F, 8F, 0F, 0F, 1F, 0F); // Import Box742
		bodyDoorCloseModel[179].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[180].addShapeBox(0F, 1F, 4F, 8, 1, 3, 0F,0F, 0F, 0F, 0F, -1.75F, 0F, 0F, -3.75F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 4F, 0F, 0F, 2F, 0F); // Import Box743
		bodyDoorCloseModel[180].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[181].addShapeBox(8F, 3F, 4F, 15, 1, 3, 0F,0F, 0.25F, 0F, -0.1F, -7F, 0F, -0.5F, -7.5F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, -1F, 7F, 0F, -1.5F, 7.5F, 0F, 0F, 2F, 0F); // Import Box744
		bodyDoorCloseModel[181].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[182].addShapeBox(0F, 3F, 7F, 43, 1, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, -4F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0.5F, -0.5F, 0F, 0.5F, -0.5F); // Import Box745
		bodyDoorCloseModel[182].setRotationPoint(16F, -22.5F, 26F);

		bodyDoorCloseModel[183].addShapeBox(8F, 5F, 7F, 15, 1, 1, 0F,0F, 0.25F, 0F, -0.5F, -5.5F, 0F, -1.25F, -6F, 0F, 0F, -0.75F, 0F, 0F, 0F, 0F, -1.5F, 5.5F, 0F, -2F, 5.75F, -0.25F, 0F, 0.5F, -0.5F); // Import Box746
		bodyDoorCloseModel[183].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[184].addShapeBox(0F, 4.5F, 7.5F, 8, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, -1.25F, -0.5F, 0F, -2.25F, 0.5F, 0F, -0.5F, 0.5F, 0F, -1F, 0F, 0F, 1F, 0F, 0F, 1.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box747
		bodyDoorCloseModel[184].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[185].addShapeBox(8F, 6.5F, 7.5F, 15, 1, 1, 0F,0F, 0.75F, -0.5F, -1.25F, -4.5F, -0.5F, -2.75F, -5.5F, 0.5F, 0F, -0.25F, 0.5F, 0F, -1F, 0F, -2F, 4.25F, -0.25F, -2.5F, 4.5F, -0.5F, 0F, -0.5F, -0.5F); // Import Box748
		bodyDoorCloseModel[185].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[186].addShapeBox(0F, 5F, 8F, 8, 2, 1, 0F,0F, 0F, 0F, 0F, -2F, 0F, 0F, -1.75F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 1.5F, -1F, 0F, 1.5F, 1F, 0F, 0F, 1F); // Import Box749
		bodyDoorCloseModel[186].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[187].addShapeBox(8F, 7F, 8F, 12, 2, 1, 0F,0F, 0.25F, 0F, 0.5F, -5F, 0F, 0.25F, -5F, 0F, 0F, 0.25F, 0F, 0F, -0.5F, -1F, -1.75F, 4.75F, -1F, -2F, 4.75F, 1F, 0F, -0.5F, 1F); // Import Box750
		bodyDoorCloseModel[187].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[188].addShapeBox(0F, 7F, 9F, 8, 3, 1, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0.25F, -0.5F, 0F, 0.25F, 0.5F, 0F, 0F, 1F); // Import Box751
		bodyDoorCloseModel[188].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[189].addShapeBox(8F, 9F, 9F, 11, 3, 1, 0F,0F, 0.5F, 0F, -0.75F, -4.75F, 0F, -1F, -4.75F, 0F, 0F, 0.5F, 0F, 0F, -1.75F, -0.5F, -2.5F, 2.75F, -0.25F, -2.75F, 2.75F, 0.25F, 0F, -1.75F, 0.5F); // Import Box752
		bodyDoorCloseModel[189].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[190].addShapeBox(0F, 10F, 10F, 8, 5, 1, 0F,0F, 0F, 0F, 0F, -0.25F, 0.5F, 0F, -0.25F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F); // Import Box753
		bodyDoorCloseModel[190].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[191].addShapeBox(8F, 10F, 10F, 8, 5, 1, 0F,0F, -0.25F, 0.5F, 0.5F, -4.75F, 0.75F, 0.25F, -4.75F, -0.75F, 0F, -0.25F, -0.5F, 0F, 0F, 0.25F, -2.5F, 0F, 0.5F, -2.5F, 0F, -0.5F, 0F, 0F, -0.25F); // Import Box754
		bodyDoorCloseModel[191].setRotationPoint(55F, -22.5F, 26F);

		bodyDoorCloseModel[192].addShapeBox(1F, 1F, -10F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Import Box755
		bodyDoorCloseModel[192].setRotationPoint(-65F, -14.5F, 36F);

		bodyDoorCloseModel[193].addShapeBox(1F, 1F, 0F, 1, 3, 10, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, 0F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -1.25F, 0F, 0F); // Import Box756
		bodyDoorCloseModel[193].setRotationPoint(-65F, -14.5F, -36F);
	}

	private void initturretModel_1()
	{
		turretModel[0] = new ModelRendererTurbo(this, 0, 1930, textureX, textureY); // Import Box309
		turretModel[1] = new ModelRendererTurbo(this, 0, 2001, textureX, textureY); // Import Box310
		turretModel[2] = new ModelRendererTurbo(this, 0, 2069, textureX, textureY); // Import Box311
		turretModel[3] = new ModelRendererTurbo(this, 0, 2131, textureX, textureY); // Import Box312
		turretModel[4] = new ModelRendererTurbo(this, 0, 2179, textureX, textureY); // Import Box313
		turretModel[5] = new ModelRendererTurbo(this, 0, 2225, textureX, textureY); // Import Box314
		turretModel[6] = new ModelRendererTurbo(this, 0, 2270, textureX, textureY); // Import Box315
		turretModel[7] = new ModelRendererTurbo(this, 0, 2314, textureX, textureY); // Import Box316
		turretModel[8] = new ModelRendererTurbo(this, 0, 2359, textureX, textureY); // Import Box317
		turretModel[9] = new ModelRendererTurbo(this, 0, 2405, textureX, textureY); // Import Box318
		turretModel[10] = new ModelRendererTurbo(this, 0, 2450, textureX, textureY); // Import Box319
		turretModel[11] = new ModelRendererTurbo(this, 0, 2496, textureX, textureY); // Import Box320
		turretModel[12] = new ModelRendererTurbo(this, 0, 2540, textureX, textureY); // Import Box321
		turretModel[13] = new ModelRendererTurbo(this, 0, 2584, textureX, textureY); // Import Box322
		turretModel[14] = new ModelRendererTurbo(this, 0, 2584, textureX, textureY); // Import Box324
		turretModel[15] = new ModelRendererTurbo(this, 0, 2584, textureX, textureY); // Import Box325
		turretModel[16] = new ModelRendererTurbo(this, 0, 2584, textureX, textureY); // Import Box326
		turretModel[17] = new ModelRendererTurbo(this, 0, 2598, textureX, textureY); // Import Box327
		turretModel[18] = new ModelRendererTurbo(this, 0, 2608, textureX, textureY); // Import Box328
		turretModel[19] = new ModelRendererTurbo(this, 0, 2618, textureX, textureY); // Import Box329
		turretModel[20] = new ModelRendererTurbo(this, 0, 2628, textureX, textureY); // Import Box330
		turretModel[21] = new ModelRendererTurbo(this, 0, 2608, textureX, textureY); // Import Box331
		turretModel[22] = new ModelRendererTurbo(this, 0, 2598, textureX, textureY); // Import Box332
		turretModel[23] = new ModelRendererTurbo(this, 0, 2628, textureX, textureY); // Import Box333
		turretModel[24] = new ModelRendererTurbo(this, 0, 2618, textureX, textureY); // Import Box334
		turretModel[25] = new ModelRendererTurbo(this, 0, 2638, textureX, textureY); // Import Box335
		turretModel[26] = new ModelRendererTurbo(this, 0, 2638, textureX, textureY); // Import Box336
		turretModel[27] = new ModelRendererTurbo(this, 0, 2638, textureX, textureY); // Import Box337
		turretModel[28] = new ModelRendererTurbo(this, 0, 2638, textureX, textureY); // Import Box338
		turretModel[29] = new ModelRendererTurbo(this, 0, 2645, textureX, textureY); // Import Box339
		turretModel[30] = new ModelRendererTurbo(this, 0, 2655, textureX, textureY); // Import Box340
		turretModel[31] = new ModelRendererTurbo(this, 0, 2661, textureX, textureY); // Import Box341
		turretModel[32] = new ModelRendererTurbo(this, 0, 2669, textureX, textureY); // Import Box342
		turretModel[33] = new ModelRendererTurbo(this, 0, 2678, textureX, textureY); // Import Box343
		turretModel[34] = new ModelRendererTurbo(this, 0, 2655, textureX, textureY); // Import Box344
		turretModel[35] = new ModelRendererTurbo(this, 0, 2661, textureX, textureY); // Import Box345
		turretModel[36] = new ModelRendererTurbo(this, 0, 2669, textureX, textureY); // Import Box346
		turretModel[37] = new ModelRendererTurbo(this, 0, 2678, textureX, textureY); // Import Box347
		turretModel[38] = new ModelRendererTurbo(this, 0, 2685, textureX, textureY); // Import Box348
		turretModel[39] = new ModelRendererTurbo(this, 0, 2695, textureX, textureY); // Import Box349
		turretModel[40] = new ModelRendererTurbo(this, 0, 2705, textureX, textureY); // Import Box350
		turretModel[41] = new ModelRendererTurbo(this, 0, 2715, textureX, textureY); // Import Box351
		turretModel[42] = new ModelRendererTurbo(this, 0, 2685, textureX, textureY); // Import Box352
		turretModel[43] = new ModelRendererTurbo(this, 0, 2695, textureX, textureY); // Import Box353
		turretModel[44] = new ModelRendererTurbo(this, 0, 2705, textureX, textureY); // Import Box354
		turretModel[45] = new ModelRendererTurbo(this, 0, 2715, textureX, textureY); // Import Box355
		turretModel[46] = new ModelRendererTurbo(this, 0, 2661, textureX, textureY); // Import Box356
		turretModel[47] = new ModelRendererTurbo(this, 0, 2655, textureX, textureY); // Import Box357
		turretModel[48] = new ModelRendererTurbo(this, 0, 2678, textureX, textureY); // Import Box358
		turretModel[49] = new ModelRendererTurbo(this, 0, 2669, textureX, textureY); // Import Box359
		turretModel[50] = new ModelRendererTurbo(this, 0, 2725, textureX, textureY); // Import Box360
		turretModel[51] = new ModelRendererTurbo(this, 0, 2763, textureX, textureY); // Import Box361
		turretModel[52] = new ModelRendererTurbo(this, 0, 2763, textureX, textureY); // Import Box362
		turretModel[53] = new ModelRendererTurbo(this, 0, 2763, textureX, textureY); // Import Box363
		turretModel[54] = new ModelRendererTurbo(this, 0, 2763, textureX, textureY); // Import Box364
		turretModel[55] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box365
		turretModel[56] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box366
		turretModel[57] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box367
		turretModel[58] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box368
		turretModel[59] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box369
		turretModel[60] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box370
		turretModel[61] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box371
		turretModel[62] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box372
		turretModel[63] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box373
		turretModel[64] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box374
		turretModel[65] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box375
		turretModel[66] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box376
		turretModel[67] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box377
		turretModel[68] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box378
		turretModel[69] = new ModelRendererTurbo(this, 0, 2771, textureX, textureY); // Import Box379
		turretModel[70] = new ModelRendererTurbo(this, 0, 2782, textureX, textureY); // Import Box380
		turretModel[71] = new ModelRendererTurbo(this, 0, 2794, textureX, textureY); // Import Box381
		turretModel[72] = new ModelRendererTurbo(this, 0, 2805, textureX, textureY); // Import Box382
		turretModel[73] = new ModelRendererTurbo(this, 0, 2817, textureX, textureY); // Import Box383
		turretModel[74] = new ModelRendererTurbo(this, 0, 2830, textureX, textureY); // Import Box384
		turretModel[75] = new ModelRendererTurbo(this, 0, 2830, textureX, textureY); // Import Box385

		turretModel[0].addShapeBox(0F, 0F, 0F, 65, 27, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, 0F, 16F); // Import Box309
		turretModel[0].setRotationPoint(-29F, -49.5F, -19F);

		turretModel[1].addShapeBox(0F, 0F, 0F, 2, 27, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 14.51888F, 0F, 0F, 16F, 0F, 0F, 16F, 0F, -2.5F, 14.51888F); // Import Box310
		turretModel[1].setRotationPoint(-31F, -49.5F, -19F);

		turretModel[2].addShapeBox(0F, 0F, 0F, 10, 19, 38, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 11.259F, 0F, 0F, 11.259F, 0F, 0F, 11.259F, 5F, 0F, 11.259F); // Import Box311
		turretModel[2].setRotationPoint(-41F, -49.5F, -19F);

		turretModel[3].addShapeBox(0F, 0F, 0F, 15, 3, 38, 0F,0F, 0F, 11.259F, 0F, 0F, 11.259F, 0F, 0F, 11.259F, 0F, 0F, 11.259F, 0F, 0F, 13.037F, 0F, 0F, 13.037F, 0F, 0F, 13.037F, 0F, 0F, 13.037F); // Import Box312
		turretModel[3].setRotationPoint(-46F, -30.5F, -19F);

		turretModel[4].addShapeBox(0F, 0F, 0F, 15, 3, 38, 0F,0F, 0F, 13.037F, 0F, 0F, 13.037F, 0F, 0F, 13.037F, 0F, 0F, 13.037F, -1F, -0.5F, 14.51888F, 0F, -0.5F, 14.51888F, 0F, -0.5F, 14.51888F, -1F, -0.5F, 14.51888F); // Import Box313
		turretModel[4].setRotationPoint(-46F, -27.5F, -19F);

		turretModel[5].addShapeBox(0F, 0F, 0F, 6, 3, 38, 0F,0F, 0F, 0F, -5F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.7777777F, 0F, 0F, 1.7777777F, 0F, 0F, 1.7777777F, 0F, 0F, 1.7777777F); // Import Box314
		turretModel[5].setRotationPoint(36F, -49.5F, -19F);

		turretModel[6].addShapeBox(0F, 0F, 0F, 9, 3, 38, 0F,0F, 0F, 1.77777777F, -3F, 0F, 1.77777777F, -3F, 0F, 1.77777777F, 0F, 0F, 1.77777777F, 0F, 0F, 3.5555555F, 0.5F, 0F, 3.5555555F, 0.5F, 0F, 3.5555555F, 0F, 0F, 3.5555555F); // Import Box315
		turretModel[6].setRotationPoint(36F, -46.5F, -19F);

		turretModel[7].addShapeBox(0F, 0F, 0F, 9, 3, 38, 0F,0F, 0F, 3.5555555F, 0.5F, 0F, 3.5555555F, 0.5F, 0F, 3.5555555F, 0F, 0F, 3.5555555F, 0F, 0.5F, 5.629F, 2.5F, 0.5F, 5.629F, 2.5F, 0.5F, 5.629F, 0F, 0.5F, 5.629F); // Import Box316
		turretModel[7].setRotationPoint(36F, -43.5F, -19F);

		turretModel[8].addShapeBox(0F, 0F, 0F, 12, 4, 38, 0F,0F, 0F, 5.629F, -0.5F, 0F, 5.629F, -0.5F, 0F, 5.629F, 0F, 0F, 5.629F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F); // Import Box317
		turretModel[8].setRotationPoint(36F, -40F, -19F);

		turretModel[9].addShapeBox(0F, 0F, 0F, 12, 4, 38, 0F,0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 8F, 0F, 0F, 10.37F, -1F, 0F, 10.37F, -1F, 0F, 10.37F, 0F, 0F, 10.37F); // Import Box318
		turretModel[9].setRotationPoint(36F, -36F, -19F);

		turretModel[10].addShapeBox(0F, 0F, 0F, 11, 3, 38, 0F,0F, 0F, 10.37F, 0F, 0F, 10.37F, 0F, 0F, 10.37F, 0F, 0F, 10.37F, 0F, 0.5F, 12.44444F, -3F, 0.5F, 12.44444F, -3F, 0.5F, 12.44444F, 0F, 0.5F, 12.44444F); // Import Box319
		turretModel[10].setRotationPoint(36F, -32F, -19F);

		turretModel[11].addShapeBox(0F, 0F, 0F, 8, 3, 38, 0F,0F, 0F, 12.44444F, 0F, 0F, 12.44444F, 0F, 0F, 12.44444F, 0F, 0F, 12.44444F, 0F, 0F, 14.22222F, -3F, 0F, 14.22222F, -3F, 0F, 14.22222F, 0F, 0F, 14.22222F); // Import Box320
		turretModel[11].setRotationPoint(36F, -28.5F, -19F);

		turretModel[12].addShapeBox(0F, 0F, 0F, 5, 3, 38, 0F,0F, 0F, 14.22222F, 0F, 0F, 14.22222F, 0F, 0F, 14.22222F, 0F, 0F, 14.22222F, 0F, 0F, 16F, -4.5F, 0F, 16F, -4.5F, 0F, 16F, 0F, 0F, 16F); // Import Box321
		turretModel[12].setRotationPoint(36F, -25.5F, -19F);

		turretModel[13].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, -2F, -2.666F, 0F, -2.666F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.333F, 0F, -1.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box322
		turretModel[13].setRotationPoint(22F, -54.5F, 6.5F);

		turretModel[14].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-2.666F, 0F, -2.666F, 0F, 0F, -2F, 0F, 0F, 0F, -2F, 0F, 0F, -1.333F, 0F, -1.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box324
		turretModel[14].setRotationPoint(18F, -54.5F, 6.5F);

		turretModel[15].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,-2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2.666F, 0F, -2.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.333F, 0F, -1.333F); // Import Box325
		turretModel[15].setRotationPoint(18F, -54.5F, 10.5F);

		turretModel[16].addShapeBox(0F, 0F, 0F, 4, 5, 4, 0F,0F, 0F, 0F, -2F, 0F, 0F, -2.666F, 0F, -2.666F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, -1.333F, 0F, -1.333F, 0F, 0F, 0F); // Import Box326
		turretModel[16].setRotationPoint(22F, -54.5F, 10.5F);

		turretModel[17].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F); // Import Box327
		turretModel[17].setRotationPoint(-2.5F, -50.5F, -9.5F);

		turretModel[18].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box328
		turretModel[18].setRotationPoint(-2.5F, -50.5F, -14.5F);

		turretModel[19].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box329
		turretModel[19].setRotationPoint(-7.5F, -50.5F, -14.5F);

		turretModel[20].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F); // Import Box330
		turretModel[20].setRotationPoint(-7.5F, -50.5F, -9.5F);

		turretModel[21].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box331
		turretModel[21].setRotationPoint(-2.5F, -50.5F, 4.5F);

		turretModel[22].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F); // Import Box332
		turretModel[22].setRotationPoint(-2.5F, -50.5F, 9.5F);

		turretModel[23].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F); // Import Box333
		turretModel[23].setRotationPoint(-7.5F, -50.5F, 9.5F);

		turretModel[24].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box334
		turretModel[24].setRotationPoint(-7.5F, -50.5F, 4.5F);

		turretModel[25].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Import Box335
		turretModel[25].setRotationPoint(7.5F, -50.5F, -13F);

		turretModel[26].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box336
		turretModel[26].setRotationPoint(7.5F, -50.5F, -16F);

		turretModel[27].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box337
		turretModel[27].setRotationPoint(4.5F, -50.5F, -16F);

		turretModel[28].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Import Box338
		turretModel[28].setRotationPoint(4.5F, -50.5F, -13F);

		turretModel[29].addShapeBox(0F, 0F, 0F, 2, 3, 2, 0F,0F, -2F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box339
		turretModel[29].setRotationPoint(7.5F, -54F, -14F);

		turretModel[30].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box340
		turretModel[30].setRotationPoint(-27.5F, -49.7F, -3F);

		turretModel[31].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Import Box341
		turretModel[31].setRotationPoint(-27.5F, -49.7F, 0F);

		turretModel[32].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Import Box342
		turretModel[32].setRotationPoint(-24.5F, -49.7F, 0F);

		turretModel[33].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box343
		turretModel[33].setRotationPoint(-24.5F, -49.7F, -3F);

		turretModel[34].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box344
		turretModel[34].setRotationPoint(-37.5F, -49.7F, -3F);

		turretModel[35].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Import Box345
		turretModel[35].setRotationPoint(-37.5F, -49.7F, 0F);

		turretModel[36].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Import Box346
		turretModel[36].setRotationPoint(-34.5F, -49.7F, 0F);

		turretModel[37].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box347
		turretModel[37].setRotationPoint(-34.5F, -49.7F, -3F);

		turretModel[38].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F); // Import Box348
		turretModel[38].setRotationPoint(-24.5F, -49.9F, 0F);

		turretModel[39].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box349
		turretModel[39].setRotationPoint(-24.5F, -49.9F, -5F);

		turretModel[40].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box350
		turretModel[40].setRotationPoint(-29.5F, -49.9F, -5F);

		turretModel[41].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F); // Import Box351
		turretModel[41].setRotationPoint(-29.5F, -49.9F, 0F);

		turretModel[42].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F); // Import Box352
		turretModel[42].setRotationPoint(3.5F, -49.9F, 0F);

		turretModel[43].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box353
		turretModel[43].setRotationPoint(3.5F, -49.9F, -5F);

		turretModel[44].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,-1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box354
		turretModel[44].setRotationPoint(-1.5F, -49.9F, -5F);

		turretModel[45].addShapeBox(0F, 0F, 0F, 5, 1, 5, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.666F, 0F, -1.666F); // Import Box355
		turretModel[45].setRotationPoint(-1.5F, -49.9F, 0F);

		turretModel[46].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F); // Import Box356
		turretModel[46].setRotationPoint(0.5F, -49.7F, 0F);

		turretModel[47].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,-1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box357
		turretModel[47].setRotationPoint(0.5F, -49.7F, -3F);

		turretModel[48].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box358
		turretModel[48].setRotationPoint(3.5F, -49.7F, -3F);

		turretModel[49].addShapeBox(0F, 0F, 0F, 3, 1, 3, 0F,0F, 0.5F, 0F, 0F, 0.5F, 0F, -1F, 0.5F, -1F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, -1F, 0F, 0F, 0F); // Import Box359
		turretModel[49].setRotationPoint(3.5F, -49.7F, 0F);

		turretModel[50].addShapeBox(0F, 0F, 0F, 71, 1, 32, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box360
		turretModel[50].setRotationPoint(-38F, -49.7F, -16F);

		turretModel[51].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box361
		turretModel[51].setRotationPoint(-17F, -49.7F, -18F);

		turretModel[52].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box362
		turretModel[52].setRotationPoint(7F, -49.7F, -18F);

		turretModel[53].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box363
		turretModel[53].setRotationPoint(-17F, -49.7F, 16F);

		turretModel[54].addShapeBox(0F, 0F, 0F, 8, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box364
		turretModel[54].setRotationPoint(7F, -49.7F, 16F);

		turretModel[55].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box365
		turretModel[55].setRotationPoint(30F, -50.3F, 11.5F);

		turretModel[56].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box366
		turretModel[56].setRotationPoint(31F, -50.3F, 11.5F);

		turretModel[57].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box367
		turretModel[57].setRotationPoint(29F, -50.3F, 11.5F);

		turretModel[58].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box368
		turretModel[58].setRotationPoint(30F, -50.3F, -14.5F);

		turretModel[59].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box369
		turretModel[59].setRotationPoint(31F, -50.3F, -14.5F);

		turretModel[60].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box370
		turretModel[60].setRotationPoint(29F, -50.3F, -14.5F);

		turretModel[61].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box371
		turretModel[61].setRotationPoint(4F, -50.3F, 11.5F);

		turretModel[62].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box372
		turretModel[62].setRotationPoint(5F, -50.3F, 11.5F);

		turretModel[63].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box373
		turretModel[63].setRotationPoint(3F, -50.3F, 11.5F);

		turretModel[64].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box374
		turretModel[64].setRotationPoint(-35F, -50.3F, 7.5F);

		turretModel[65].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box375
		turretModel[65].setRotationPoint(-34F, -50.3F, 7.5F);

		turretModel[66].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box376
		turretModel[66].setRotationPoint(-36F, -50.3F, 7.5F);

		turretModel[67].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box377
		turretModel[67].setRotationPoint(-35F, -50.3F, -10.5F);

		turretModel[68].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box378
		turretModel[68].setRotationPoint(-34F, -50.3F, -10.5F);

		turretModel[69].addShapeBox(0F, 0F, 0F, 1, 1, 3, 0F,0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F); // Import Box379
		turretModel[69].setRotationPoint(-36F, -50.3F, -10.5F);

		turretModel[70].addShapeBox(-1F, 7F, 0F, 1, 4, 4, 0F,0F, -1.333F, -1.333F, 0F, -1.333F, -1.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box380
		turretModel[70].setRotationPoint(-41F, -49.5F, -4F);
		turretModel[70].rotateAngleZ = -0.25732262F;

		turretModel[71].addShapeBox(-1F, 7F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.333F, -1.333F, 0F, -1.333F, -1.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box381
		turretModel[71].setRotationPoint(-41F, -49.5F, 0F);
		turretModel[71].rotateAngleZ = -0.25732262F;

		turretModel[72].addShapeBox(-1F, 11F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.333F, -1.333F, 0F, -1.333F, -1.333F); // Import Box382
		turretModel[72].setRotationPoint(-41F, -49.5F, 0F);
		turretModel[72].rotateAngleZ = -0.25732262F;

		turretModel[73].addShapeBox(-1F, 11F, 0F, 1, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.333F, -1.333F, 0F, -1.333F, -1.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box383
		turretModel[73].setRotationPoint(-41F, -49.5F, -4F);
		turretModel[73].rotateAngleZ = -0.25732262F;

		turretModel[74].addShapeBox(-0.5F, 7F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box384
		turretModel[74].setRotationPoint(-41F, -49.5F, -3F);
		turretModel[74].rotateAngleZ = -0.25732262F;

		turretModel[75].addShapeBox(-0.5F, 7F, 0F, 1, 4, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box385
		turretModel[75].setRotationPoint(-41F, -49.5F, 1F);
		turretModel[75].rotateAngleZ = -0.25732262F;
	}

	private void initbarrelModel_1()
	{
		barrelModel[0] = new ModelRendererTurbo(this, 0, 2826, textureX, textureY); // Import Box386
		barrelModel[1] = new ModelRendererTurbo(this, 0, 2856, textureX, textureY); // Import Box387
		barrelModel[2] = new ModelRendererTurbo(this, 0, 2884, textureX, textureY); // Import Box389
		barrelModel[3] = new ModelRendererTurbo(this, 0, 2912, textureX, textureY); // Import Box390
		barrelModel[4] = new ModelRendererTurbo(this, 0, 2941, textureX, textureY); // Import Box392
		barrelModel[5] = new ModelRendererTurbo(this, 0, 2970, textureX, textureY); // Import Box393
		barrelModel[6] = new ModelRendererTurbo(this, 0, 2999, textureX, textureY); // Import Box394
		barrelModel[7] = new ModelRendererTurbo(this, 0, 3026, textureX, textureY); // Import Box395
		barrelModel[8] = new ModelRendererTurbo(this, 0, 3054, textureX, textureY); // Import Box396
		barrelModel[9] = new ModelRendererTurbo(this, 0, 3060, textureX, textureY); // Import Box397
		barrelModel[10] = new ModelRendererTurbo(this, 0, 3067, textureX, textureY); // Import Box398
		barrelModel[11] = new ModelRendererTurbo(this, 0, 3076, textureX, textureY); // Import Box399
		barrelModel[12] = new ModelRendererTurbo(this, 0, 3087, textureX, textureY); // Import Box400
		barrelModel[13] = new ModelRendererTurbo(this, 0, 3094, textureX, textureY); // Import Box401
		barrelModel[14] = new ModelRendererTurbo(this, 0, 3102, textureX, textureY); // Import Box402
		barrelModel[15] = new ModelRendererTurbo(this, 0, 3110, textureX, textureY); // Import Box403
		barrelModel[16] = new ModelRendererTurbo(this, 0, 3054, textureX, textureY); // Import Box404
		barrelModel[17] = new ModelRendererTurbo(this, 0, 3060, textureX, textureY); // Import Box405
		barrelModel[18] = new ModelRendererTurbo(this, 0, 3067, textureX, textureY); // Import Box406
		barrelModel[19] = new ModelRendererTurbo(this, 0, 3076, textureX, textureY); // Import Box407
		barrelModel[20] = new ModelRendererTurbo(this, 0, 3087, textureX, textureY); // Import Box408
		barrelModel[21] = new ModelRendererTurbo(this, 0, 3094, textureX, textureY); // Import Box409
		barrelModel[22] = new ModelRendererTurbo(this, 0, 3102, textureX, textureY); // Import Box410
		barrelModel[23] = new ModelRendererTurbo(this, 0, 3110, textureX, textureY); // Import Box411
		barrelModel[24] = new ModelRendererTurbo(this, 0, 3117, textureX, textureY); // Import Box412
		barrelModel[25] = new ModelRendererTurbo(this, 0, 3139, textureX, textureY); // Import Box413
		barrelModel[26] = new ModelRendererTurbo(this, 0, 3160, textureX, textureY); // Import Box414
		barrelModel[27] = new ModelRendererTurbo(this, 0, 3160, textureX, textureY); // Import Box415
		barrelModel[28] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box416
		barrelModel[29] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box417
		barrelModel[30] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box418
		barrelModel[31] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box419
		barrelModel[32] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box420
		barrelModel[33] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box421
		barrelModel[34] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box422
		barrelModel[35] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box423
		barrelModel[36] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box424
		barrelModel[37] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box425
		barrelModel[38] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box426
		barrelModel[39] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box427
		barrelModel[40] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box428
		barrelModel[41] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box429
		barrelModel[42] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box430
		barrelModel[43] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box431
		barrelModel[44] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box432
		barrelModel[45] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box433
		barrelModel[46] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box434
		barrelModel[47] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box435
		barrelModel[48] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box436
		barrelModel[49] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box437
		barrelModel[50] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box438
		barrelModel[51] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box439
		barrelModel[52] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box440
		barrelModel[53] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box441
		barrelModel[54] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box442
		barrelModel[55] = new ModelRendererTurbo(this, 0, 3182, textureX, textureY); // Import Box443
		barrelModel[56] = new ModelRendererTurbo(this, 0, 3187, textureX, textureY); // Import Box444
		barrelModel[57] = new ModelRendererTurbo(this, 0, 3195, textureX, textureY); // Import Box445
		barrelModel[58] = new ModelRendererTurbo(this, 0, 3202, textureX, textureY); // Import Box446
		barrelModel[59] = new ModelRendererTurbo(this, 0, 3209, textureX, textureY); // Import Box447
		barrelModel[60] = new ModelRendererTurbo(this, 0, 3217, textureX, textureY); // Import Box450
		barrelModel[61] = new ModelRendererTurbo(this, 0, 3223, textureX, textureY); // Import Box456
		barrelModel[62] = new ModelRendererTurbo(this, 0, 3223, textureX, textureY); // Import Box457
		barrelModel[63] = new ModelRendererTurbo(this, 0, 3223, textureX, textureY); // Import Box458
		barrelModel[64] = new ModelRendererTurbo(this, 0, 3223, textureX, textureY); // Import Box459
		barrelModel[65] = new ModelRendererTurbo(this, 0, 3239, textureX, textureY); // Import Box460
		barrelModel[66] = new ModelRendererTurbo(this, 0, 3239, textureX, textureY); // Import Box461
		barrelModel[67] = new ModelRendererTurbo(this, 0, 3239, textureX, textureY); // Import Box462
		barrelModel[68] = new ModelRendererTurbo(this, 0, 3239, textureX, textureY); // Import Box463
		barrelModel[69] = new ModelRendererTurbo(this, 0, 3253, textureX, textureY); // Import Box464
		barrelModel[70] = new ModelRendererTurbo(this, 0, 3253, textureX, textureY); // Import Box465
		barrelModel[71] = new ModelRendererTurbo(this, 0, 3253, textureX, textureY); // Import Box466
		barrelModel[72] = new ModelRendererTurbo(this, 0, 3253, textureX, textureY); // Import Box467
		barrelModel[73] = new ModelRendererTurbo(this, 0, 3264, textureX, textureY); // Import Box468
		barrelModel[74] = new ModelRendererTurbo(this, 0, 3272, textureX, textureY); // Import Box469
		barrelModel[75] = new ModelRendererTurbo(this, 0, 3272, textureX, textureY); // Import Box474
		barrelModel[76] = new ModelRendererTurbo(this, 0, 3272, textureX, textureY); // Import Box475
		barrelModel[77] = new ModelRendererTurbo(this, 0, 3272, textureX, textureY); // Import Box476
		barrelModel[78] = new ModelRendererTurbo(this, 0, 3264, textureX, textureY); // Import Box477
		barrelModel[79] = new ModelRendererTurbo(this, 0, 3264, textureX, textureY); // Import Box478
		barrelModel[80] = new ModelRendererTurbo(this, 0, 3264, textureX, textureY); // Import Box479
		barrelModel[81] = new ModelRendererTurbo(this, 0, 3283, textureX, textureY); // Import Box480
		barrelModel[82] = new ModelRendererTurbo(this, 0, 3299, textureX, textureY); // Import Box481
		barrelModel[83] = new ModelRendererTurbo(this, 0, 3303, textureX, textureY); // Import Box482
		barrelModel[84] = new ModelRendererTurbo(this, 0, 3311, textureX, textureY); // Import Box483
		barrelModel[85] = new ModelRendererTurbo(this, 0, 3217, textureX, textureY); // Import Box501
		barrelModel[86] = new ModelRendererTurbo(this, 0, 3217, textureX, textureY); // Import Box502
		barrelModel[87] = new ModelRendererTurbo(this, 0, 3217, textureX, textureY); // Import Box503

		barrelModel[0].addShapeBox(0F, -9F, -10.5F, 12, 3, 21, 0F,0F, 0F, 0F, -3.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box386
		barrelModel[0].setRotationPoint(42F, -37F, 0F);

		barrelModel[1].addShapeBox(0F, -11F, -10.5F, 8, 2, 21, 0F,-2F, 0F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box387
		barrelModel[1].setRotationPoint(42F, -37F, 0F);

		barrelModel[2].addShapeBox(0F, -6F, -10.5F, 13, 4, 21, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box389
		barrelModel[2].setRotationPoint(42F, -37F, 0F);

		barrelModel[3].addShapeBox(0F, -2F, -10.5F, 14, 4, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box390
		barrelModel[3].setRotationPoint(42F, -37F, 0F);

		barrelModel[4].addShapeBox(0F, 2F, -10.5F, 14, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box392
		barrelModel[4].setRotationPoint(42F, -37F, 0F);

		barrelModel[5].addShapeBox(0F, 5F, -10.5F, 14, 3, 21, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box393
		barrelModel[5].setRotationPoint(42F, -37F, 0F);

		barrelModel[6].addShapeBox(-10F, 8F, -10.5F, 22, 3, 21, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box394
		barrelModel[6].setRotationPoint(42F, -37F, 0F);

		barrelModel[7].addShapeBox(-6F, 11F, -10.5F, 14, 2, 21, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, -6F, -0.5F, 0F, -6F, -0.5F, 0F, 0F, -1F, 0F); // Import Box395
		barrelModel[7].setRotationPoint(42F, -37F, 0F);

		barrelModel[8].addShapeBox(0F, -11F, -11.5F, 8, 2, 1, 0F,-2F, -1F, 0F, -5F, -1F, 0F, -2F, -0.5F, 0F, -2F, 0F, 0F, 0F, 0.5F, 0F, -2F, 0.5F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box396
		barrelModel[8].setRotationPoint(42F, -37F, 0F);

		barrelModel[9].addShapeBox(0F, -9F, -11.5F, 12, 3, 1, 0F,0F, -0.5F, 0F, -6F, -0.5F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box397
		barrelModel[9].setRotationPoint(42F, -37F, 0F);

		barrelModel[10].addShapeBox(0F, -6F, -11.5F, 13, 4, 1, 0F,0F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -3F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F); // Import Box398
		barrelModel[10].setRotationPoint(42F, -37F, 0F);

		barrelModel[11].addShapeBox(0F, -2F, -11.5F, 14, 4, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box399
		barrelModel[11].setRotationPoint(42F, -37F, 0F);

		barrelModel[12].addShapeBox(0F, 2F, -11.5F, 14, 3, 1, 0F,0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box400
		barrelModel[12].setRotationPoint(42F, -37F, 0F);

		barrelModel[13].addShapeBox(0F, 5F, -11.5F, 14, 3, 1, 0F,0F, 0F, 0F, -4.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -7F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F); // Import Box401
		barrelModel[13].setRotationPoint(42F, -37F, 0F);

		barrelModel[14].addShapeBox(-10F, 8F, -11.5F, 22, 3, 1, 0F,0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -10F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box402
		barrelModel[14].setRotationPoint(42F, -37F, 0F);

		barrelModel[15].addShapeBox(-10F, 11F, -11.5F, 18, 2, 1, 0F,1F, 0F, 0F, -6F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, -1.5F, 0F, -7F, -1.5F, 0F, -6F, -0.5F, 0F, 0F, -1F, 0F); // Import Box403
		barrelModel[15].setRotationPoint(42F, -37F, 0F);

		barrelModel[16].addShapeBox(0F, -11F, 10.5F, 8, 2, 1, 0F,-2F, 0F, 0F, -2F, -0.5F, 0F, -5F, -1F, 0F, -2F, -1F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -2F, 0.5F, 0F, 0F, 0.5F, 0F); // Import Box404
		barrelModel[16].setRotationPoint(42F, -37F, 0F);

		barrelModel[17].addShapeBox(0F, -9F, 10.5F, 12, 3, 1, 0F,0F, 0F, 0F, -3.5F, 0F, 0F, -6F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, -3.5F, 0F, 0F, 0F, 0F, 0F); // Import Box405
		barrelModel[17].setRotationPoint(42F, -37F, 0F);

		barrelModel[18].addShapeBox(0F, -6F, 10.5F, 13, 4, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, -3F, 0F, 0F, 0F, 0F, 0F); // Import Box406
		barrelModel[18].setRotationPoint(42F, -37F, 0F);

		barrelModel[19].addShapeBox(0F, -2F, 10.5F, 14, 4, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F); // Import Box407
		barrelModel[19].setRotationPoint(42F, -37F, 0F);

		barrelModel[20].addShapeBox(0F, 2F, 10.5F, 14, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F); // Import Box408
		barrelModel[20].setRotationPoint(42F, -37F, 0F);

		barrelModel[21].addShapeBox(0F, 5F, 10.5F, 14, 3, 1, 0F,0F, 0F, 0F, -0.5F, 0F, 0F, -4.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, 0F, 0F, -7F, 0F, 0F, 0F, 0F, 0F); // Import Box409
		barrelModel[21].setRotationPoint(42F, -37F, 0F);

		barrelModel[22].addShapeBox(-10F, 8F, 10.5F, 22, 3, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -4F, 0F, 0F, -10F, 0F, 0F, 0F, 0F, 0F); // Import Box410
		barrelModel[22].setRotationPoint(42F, -37F, 0F);

		barrelModel[23].addShapeBox(-10F, 11F, 10.5F, 18, 2, 1, 0F,1F, 0F, 0F, 0F, 0F, 0F, -6F, 0F, 0F, 1F, 0F, 0F, 0F, -1F, 0F, -6F, -0.5F, 0F, -7F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Box411
		barrelModel[23].setRotationPoint(42F, -37F, 0F);

		barrelModel[24].addShapeBox(6F, -9F, 2F, 9, 10, 8, 0F,0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -5F, -4F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box412
		barrelModel[24].setRotationPoint(42F, -37F, 0F);

		barrelModel[25].addShapeBox(6F, -9F, -6F, 9, 10, 8, 0F,-2.5F, 0F, 1F, 0F, -4F, -4F, 0F, -3F, 0F, 0F, 1.5F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box413
		barrelModel[25].setRotationPoint(42F, -37F, 0F);

		barrelModel[26].addShapeBox(6F, 1F, -6F, 9, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -5F, -4F, 0F, -3F, 0F, 0F, 1.5F, 0F); // Import Box414
		barrelModel[26].setRotationPoint(42F, -37F, 0F);

		barrelModel[27].addShapeBox(6F, 1F, 2F, 9, 9, 8, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 1.5F, 0F, 0F, -3F, 0F, 0F, -5F, -4F, 0F, 1.5F, 0F); // Import Box415
		barrelModel[27].setRotationPoint(42F, -37F, 0F);

		barrelModel[28].addShapeBox(12.5F, -5.5F, -6F, 3, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box416
		barrelModel[28].setRotationPoint(42F, -37F, 0F);

		barrelModel[29].addShapeBox(12.5F, -5.5F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box417
		barrelModel[29].setRotationPoint(42F, -37F, 0F);

		barrelModel[30].addShapeBox(12.5F, -4.5F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Import Box418
		barrelModel[30].setRotationPoint(42F, -37F, 0F);

		barrelModel[31].addShapeBox(12.5F, -4.5F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box419
		barrelModel[31].setRotationPoint(42F, -37F, 0F);

		barrelModel[32].addShapeBox(12.5F, -2F, -9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Import Box420
		barrelModel[32].setRotationPoint(42F, -37F, 0F);

		barrelModel[33].addShapeBox(12.5F, -2F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box421
		barrelModel[33].setRotationPoint(42F, -37F, 0F);

		barrelModel[34].addShapeBox(12.5F, -3F, -9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box422
		barrelModel[34].setRotationPoint(42F, -37F, 0F);

		barrelModel[35].addShapeBox(12.5F, -3F, -10F, 3, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box423
		barrelModel[35].setRotationPoint(42F, -37F, 0F);

		barrelModel[36].addShapeBox(12.5F, 5.5F, -9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Import Box424
		barrelModel[36].setRotationPoint(42F, -37F, 0F);

		barrelModel[37].addShapeBox(12.5F, 5.5F, -10F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box425
		barrelModel[37].setRotationPoint(42F, -37F, 0F);

		barrelModel[38].addShapeBox(12.5F, 4.5F, -9F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box426
		barrelModel[38].setRotationPoint(42F, -37F, 0F);

		barrelModel[39].addShapeBox(12.5F, 4.5F, -10F, 3, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box427
		barrelModel[39].setRotationPoint(42F, -37F, 0F);

		barrelModel[40].addShapeBox(12.5F, 5F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box428
		barrelModel[40].setRotationPoint(42F, -37F, 0F);

		barrelModel[41].addShapeBox(12.5F, 5F, -6F, 3, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box429
		barrelModel[41].setRotationPoint(42F, -37F, 0F);

		barrelModel[42].addShapeBox(12.5F, 6F, -6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box430
		barrelModel[42].setRotationPoint(42F, -37F, 0F);

		barrelModel[43].addShapeBox(12.5F, 6F, -5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Import Box431
		barrelModel[43].setRotationPoint(42F, -37F, 0F);

		barrelModel[44].addShapeBox(12.5F, 5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box432
		barrelModel[44].setRotationPoint(42F, -37F, 0F);

		barrelModel[45].addShapeBox(12.5F, 5F, 5F, 3, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box433
		barrelModel[45].setRotationPoint(42F, -37F, 0F);

		barrelModel[46].addShapeBox(12.5F, 6F, 5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box434
		barrelModel[46].setRotationPoint(42F, -37F, 0F);

		barrelModel[47].addShapeBox(12.5F, 6F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Import Box435
		barrelModel[47].setRotationPoint(42F, -37F, 0F);

		barrelModel[48].addShapeBox(12.5F, -5.5F, 5F, 3, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box436
		barrelModel[48].setRotationPoint(42F, -37F, 0F);

		barrelModel[49].addShapeBox(12.5F, -5.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box437
		barrelModel[49].setRotationPoint(42F, -37F, 0F);

		barrelModel[50].addShapeBox(12.5F, -4.5F, 6F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Import Box438
		barrelModel[50].setRotationPoint(42F, -37F, 0F);

		barrelModel[51].addShapeBox(12.5F, -4.5F, 5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box439
		barrelModel[51].setRotationPoint(42F, -37F, 0F);

		barrelModel[52].addShapeBox(12.5F, -0.5F, 8.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box440
		barrelModel[52].setRotationPoint(42F, -37F, 0F);

		barrelModel[53].addShapeBox(12.5F, 0.5F, 8.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F); // Import Box441
		barrelModel[53].setRotationPoint(42F, -37F, 0F);

		barrelModel[54].addShapeBox(12.5F, 0.5F, 7.5F, 3, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box442
		barrelModel[54].setRotationPoint(42F, -37F, 0F);

		barrelModel[55].addShapeBox(12.5F, -0.5F, 7.5F, 3, 1, 1, 0F,0F, -0.333F, -0.333F, 0F, -0.333F, -0.333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box443
		barrelModel[55].setRotationPoint(42F, -37F, 0F);

		barrelModel[56].addShapeBox(13.5F, 0F, -10F, 2, 2, 2, 0F,0F, -0.6666F, -0.6666F, 0F, -0.6666F, -0.6666F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box444
		barrelModel[56].setRotationPoint(42F, -37F, 0F);

		barrelModel[57].addShapeBox(13.5F, 0F, -8F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6666F, -0.6666F, 0F, -0.6666F, 1.3334F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F); // Import Box445
		barrelModel[57].setRotationPoint(42F, -37F, 0F);

		barrelModel[58].addShapeBox(13.5F, 2F, -8F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6666F, -0.6666F, 0F, -0.6666F, 1.3334F); // Import Box446
		barrelModel[58].setRotationPoint(42F, -37F, 0F);

		barrelModel[59].addShapeBox(13.5F, 2F, -10F, 2, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.6666F, -0.6666F, 0F, -0.6666F, -0.6666F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box447
		barrelModel[59].setRotationPoint(42F, -37F, 0F);

		barrelModel[60].addShapeBox(15.5F, 1F, -9F, 21, 1, 1, 0F,0F, 0.33333F, 0.33333F, 0F, -0.3333F, -0.3333F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box450
		barrelModel[60].setRotationPoint(42F, -37F, 0F);

		barrelModel[61].addShapeBox(15F, -5.5F, -4F, 6, 6, 6, 0F,0F, -2F, -2F, 0F, -2.666F, -2.666F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box456
		barrelModel[61].setRotationPoint(42F, -37F, 0F);

		barrelModel[62].addShapeBox(15F, -5.5F, 2F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.666F, -2.666F, 0F, -2F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F); // Import Box457
		barrelModel[62].setRotationPoint(42F, -37F, 0F);

		barrelModel[63].addShapeBox(15F, 0.5F, 2F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -2.666F, -2.666F, 0F, -2F, -2F); // Import Box458
		barrelModel[63].setRotationPoint(42F, -37F, 0F);

		barrelModel[64].addShapeBox(15F, 0.5F, -4F, 6, 6, 6, 0F,0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2F, -2F, 0F, -2.666F, -2.666F, 0F, -1F, 0F, 0F, 0F, 0F); // Import Box459
		barrelModel[64].setRotationPoint(42F, -37F, 0F);

		barrelModel[65].addShapeBox(21F, -3.5F, -2F, 8, 4, 4, 0F,0F, -1.3333F, -1.3333F, 0F, -2.3333F, -2.3333F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box460
		barrelModel[65].setRotationPoint(42F, -37F, 0F);

		barrelModel[66].addShapeBox(21F, -3.5F, 2F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.3333F, -2.3333F, 0F, -1.3333F, -1.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F); // Import Box461
		barrelModel[66].setRotationPoint(42F, -37F, 0F);

		barrelModel[67].addShapeBox(21F, 0.5F, 2F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.3333F, -2.3333F, 0F, -1.3333F, -1.3333F); // Import Box462
		barrelModel[67].setRotationPoint(42F, -37F, 0F);

		barrelModel[68].addShapeBox(21F, 0.5F, -2F, 8, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.3333F, -1.3333F, 0F, -2.3333F, -2.3333F, 0F, -1.5F, 0F, 0F, 0F, 0F); // Import Box463
		barrelModel[68].setRotationPoint(42F, -37F, 0F);

		barrelModel[69].addShapeBox(29F, -3.5F, -2F, 73, 4, 4, 0F,0F, -2.3333F, -2.3333F, 0F, -3F, -3F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, 0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box464
		barrelModel[69].setRotationPoint(42F, -37F, 0F);

		barrelModel[70].addShapeBox(29F, -3.5F, 2F, 73, 4, 4, 0F,0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, -3F, 0F, -2.3333F, -2.3333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1.5F); // Import Box465
		barrelModel[70].setRotationPoint(42F, -37F, 0F);

		barrelModel[71].addShapeBox(29F, 0.5F, 2F, 73, 4, 4, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, 0F, -1.5F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, -3F, -3F, 0F, -2.3333F, -2.3333F); // Import Box466
		barrelModel[71].setRotationPoint(42F, -37F, 0F);

		barrelModel[72].addShapeBox(29F, 0.5F, -2F, 73, 4, 4, 0F,0F, 0F, -1.5F, 0F, 0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.3333F, -2.3333F, 0F, -3F, -3F, 0F, -2.5F, 0F, 0F, -1.5F, 0F); // Import Box467
		barrelModel[72].setRotationPoint(42F, -37F, 0F);

		barrelModel[73].addShapeBox(102F, -1F, 0F, 5, 2, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Box468
		barrelModel[73].setRotationPoint(42F, -37F, 0F);

		barrelModel[74].addShapeBox(102F, -1F, 0F, 5, 2, 2, 0F,0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F); // Import Box469
		barrelModel[74].setRotationPoint(42F, -37F, 0F);

		barrelModel[75].addShapeBox(102F, 0F, 0F, 5, 2, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box474
		barrelModel[75].setRotationPoint(42F, -37F, 0F);

		barrelModel[76].addShapeBox(102F, 0F, 2F, 5, 2, 2, 0F,0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F); // Import Box475
		barrelModel[76].setRotationPoint(42F, -37F, 0F);

		barrelModel[77].addShapeBox(102F, -1F, 2F, 5, 2, 2, 0F,0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.5F, -0.5F, 0F, -1.5F, -0.5F, 0F, -1.25F, -0.75F, 0F, -1.25F, -0.75F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box476
		barrelModel[77].setRotationPoint(42F, -37F, 0F);

		barrelModel[78].addShapeBox(102F, -1F, 2F, 5, 2, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F); // Import Box477
		barrelModel[78].setRotationPoint(42F, -37F, 0F);

		barrelModel[79].addShapeBox(102F, 0F, 2F, 5, 2, 2, 0F,0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F); // Import Box478
		barrelModel[79].setRotationPoint(42F, -37F, 0F);

		barrelModel[80].addShapeBox(102F, 0F, 0F, 5, 2, 2, 0F,0F, -1.25F, -1.25F, 0F, -1.25F, -1.25F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, -1F, 0F, -0.5F, -1F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box479
		barrelModel[80].setRotationPoint(42F, -37F, 0F);

		barrelModel[81].addShapeBox(29.5F, 2.8F, -8.5F, 5, 1, 11, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box480
		barrelModel[81].setRotationPoint(42F, -37F, 0F);

		barrelModel[82].addShapeBox(29.5F, 2.8F, -9.5F, 5, 1, 1, 0F,0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Import Box481
		barrelModel[82].setRotationPoint(42F, -37F, 0F);

		barrelModel[83].addShapeBox(29.5F, 2.8F, 2.5F, 5, 1, 2, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, -0.5F, 0F, 0.5F, -0.5F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F); // Import Box482
		barrelModel[83].setRotationPoint(42F, -37F, 0F);

		barrelModel[84].addShapeBox(29.5F, 1.3F, 3.5F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Import Box483
		barrelModel[84].setRotationPoint(42F, -37F, 0F);

		barrelModel[85].addShapeBox(15.5F, 1F, -8F, 21, 1, 1, 0F,0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3333F, -0.3333F, 0F, 0.33333F, 0.33333F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F); // Import Box501
		barrelModel[85].setRotationPoint(42F, -37F, 0F);

		barrelModel[86].addShapeBox(15.5F, 2F, -8F, 21, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.3333F, -0.3333F, 0F, 0.33333F, 0.33333F); // Import Box502
		barrelModel[86].setRotationPoint(42F, -37F, 0F);

		barrelModel[87].addShapeBox(15.5F, 2F, -9F, 21, 1, 1, 0F,0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.33333F, 0.33333F, 0F, -0.3333F, -0.3333F, 0F, 0F, 0F, 0F, 1F, 0F); // Import Box503
		barrelModel[87].setRotationPoint(42F, -37F, 0F);
	}

	private void initleftTrackWheelModels_1()
	{
		leftTrackWheelModels[0] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape126
		leftTrackWheelModels[1] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape127
		leftTrackWheelModels[2] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape128
		leftTrackWheelModels[3] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape129
		leftTrackWheelModels[4] = new ModelRendererTurbo(this, 405, 144, textureX, textureY); // Import Shape130
		leftTrackWheelModels[5] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape131
		leftTrackWheelModels[6] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape132
		leftTrackWheelModels[7] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape133
		leftTrackWheelModels[8] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape134
		leftTrackWheelModels[9] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape135
		leftTrackWheelModels[10] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape136
		leftTrackWheelModels[11] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape137
		leftTrackWheelModels[12] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape138
		leftTrackWheelModels[13] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape139
		leftTrackWheelModels[14] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape140
		leftTrackWheelModels[15] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape141
		leftTrackWheelModels[16] = new ModelRendererTurbo(this, 405, 144, textureX, textureY); // Import Shape142
		leftTrackWheelModels[17] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape143
		leftTrackWheelModels[18] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape144
		leftTrackWheelModels[19] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape145
		leftTrackWheelModels[20] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape146
		leftTrackWheelModels[21] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape147
		leftTrackWheelModels[22] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape148
		leftTrackWheelModels[23] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape149
		leftTrackWheelModels[24] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape150
		leftTrackWheelModels[25] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape151
		leftTrackWheelModels[26] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape152
		leftTrackWheelModels[27] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape153
		leftTrackWheelModels[28] = new ModelRendererTurbo(this, 405, 144, textureX, textureY); // Import Shape154
		leftTrackWheelModels[29] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape155
		leftTrackWheelModels[30] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape156
		leftTrackWheelModels[31] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape157
		leftTrackWheelModels[32] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape158
		leftTrackWheelModels[33] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape159
		leftTrackWheelModels[34] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape160
		leftTrackWheelModels[35] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape161
		leftTrackWheelModels[36] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape162
		leftTrackWheelModels[37] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape163
		leftTrackWheelModels[38] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape164
		leftTrackWheelModels[39] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape165
		leftTrackWheelModels[40] = new ModelRendererTurbo(this, 405, 144, textureX, textureY); // Import Shape166
		leftTrackWheelModels[41] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape167
		leftTrackWheelModels[42] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape168
		leftTrackWheelModels[43] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape169
		leftTrackWheelModels[44] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape170
		leftTrackWheelModels[45] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape171
		leftTrackWheelModels[46] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape172
		leftTrackWheelModels[47] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape173
		leftTrackWheelModels[48] = new ModelRendererTurbo(this, 346, 162, textureX, textureY); // Import Shape211
		leftTrackWheelModels[49] = new ModelRendererTurbo(this, 290, 142, textureX, textureY); // Import Shape212
		leftTrackWheelModels[50] = new ModelRendererTurbo(this, 346, 162, textureX, textureY); // Import Shape213
		leftTrackWheelModels[51] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape214
		leftTrackWheelModels[52] = new ModelRendererTurbo(this, 290, 163, textureX, textureY); // Import Shape215
		leftTrackWheelModels[53] = new ModelRendererTurbo(this, 391, 163, textureX, textureY); // Import Shape216

		leftTrackWheelModels[0].addShape3D(3F, -3F, -8F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape126
		leftTrackWheelModels[0].setRotationPoint(46.75F, 0.75F, 22.75F);

		leftTrackWheelModels[1].addShape3D(7.5F, -7.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape127
		leftTrackWheelModels[1].setRotationPoint(46.75F, 0.75F, 23.25F);

		leftTrackWheelModels[2].addShape3D(7.5F, -7.5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape128
		leftTrackWheelModels[2].setRotationPoint(46.75F, 0.75F, 23.25F);

		leftTrackWheelModels[3].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape129
		leftTrackWheelModels[3].setRotationPoint(46.75F, 0.75F, 23.75F);

		leftTrackWheelModels[4].addShape3D(6F, -6F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 1, 12, 12, 40, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape130
		leftTrackWheelModels[4].setRotationPoint(34.5F, 0.75F, 27.25F);

		leftTrackWheelModels[5].addShape3D(7.5F, -7.5F, -2.2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape131
		leftTrackWheelModels[5].setRotationPoint(34.5F, 0.75F, 18F);

		leftTrackWheelModels[6].addShape3D(7.5F, -7.5F, -4.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape132
		leftTrackWheelModels[6].setRotationPoint(34.5F, 0.75F, 18F);

		leftTrackWheelModels[7].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape133
		leftTrackWheelModels[7].setRotationPoint(34.5F, 0.75F, 18F);

		leftTrackWheelModels[8].addShape3D(3F, -3F, -7F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape134
		leftTrackWheelModels[8].setRotationPoint(34.5F, 0.75F, 23.75F);

		leftTrackWheelModels[9].addShape3D(7.5F, -7.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape135
		leftTrackWheelModels[9].setRotationPoint(34.5F, 0.75F, 28.5F);

		leftTrackWheelModels[10].addShape3D(7.5F, -7.5F, -4.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape136
		leftTrackWheelModels[10].setRotationPoint(34.5F, 0.75F, 27.5F);

		leftTrackWheelModels[11].addShape3D(6F, -6F, -3F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape137
		leftTrackWheelModels[11].setRotationPoint(34.5F, 0.75F, 28F);

		leftTrackWheelModels[12].addShape3D(3F, -3F, -8F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape138
		leftTrackWheelModels[12].setRotationPoint(21.75F, 0.75F, 22.75F);

		leftTrackWheelModels[13].addShape3D(7.5F, -7.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape139
		leftTrackWheelModels[13].setRotationPoint(21.75F, 0.75F, 23.25F);

		leftTrackWheelModels[14].addShape3D(7.5F, -7.5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape140
		leftTrackWheelModels[14].setRotationPoint(21.75F, 0.75F, 23.25F);

		leftTrackWheelModels[15].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape141
		leftTrackWheelModels[15].setRotationPoint(21.75F, 0.75F, 23.75F);

		leftTrackWheelModels[16].addShape3D(6F, -6F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 1, 12, 12, 40, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape142
		leftTrackWheelModels[16].setRotationPoint(9.5F, 0.75F, 27.25F);

		leftTrackWheelModels[17].addShape3D(7.5F, -7.5F, -2.2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape143
		leftTrackWheelModels[17].setRotationPoint(9.5F, 0.75F, 18F);

		leftTrackWheelModels[18].addShape3D(7.5F, -7.5F, -4.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape144
		leftTrackWheelModels[18].setRotationPoint(9.5F, 0.75F, 18F);

		leftTrackWheelModels[19].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape145
		leftTrackWheelModels[19].setRotationPoint(9.5F, 0.75F, 18F);

		leftTrackWheelModels[20].addShape3D(3F, -3F, -7F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape146
		leftTrackWheelModels[20].setRotationPoint(9.5F, 0.75F, 23.75F);

		leftTrackWheelModels[21].addShape3D(7.5F, -7.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape147
		leftTrackWheelModels[21].setRotationPoint(9.5F, 0.75F, 28.5F);

		leftTrackWheelModels[22].addShape3D(7.5F, -7.5F, -4.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape148
		leftTrackWheelModels[22].setRotationPoint(9.5F, 0.75F, 27.5F);

		leftTrackWheelModels[23].addShape3D(6F, -6F, -3F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape149
		leftTrackWheelModels[23].setRotationPoint(9.5F, 0.75F, 28F);

		leftTrackWheelModels[24].addShape3D(3F, -3F, -8F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape150
		leftTrackWheelModels[24].setRotationPoint(-3.25F, 0.75F, 22.75F);

		leftTrackWheelModels[25].addShape3D(7.5F, -7.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape151
		leftTrackWheelModels[25].setRotationPoint(-3.25F, 0.75F, 23.25F);

		leftTrackWheelModels[26].addShape3D(7.5F, -7.5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape152
		leftTrackWheelModels[26].setRotationPoint(-3.25F, 0.75F, 23.25F);

		leftTrackWheelModels[27].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape153
		leftTrackWheelModels[27].setRotationPoint(-3.25F, 0.75F, 23.75F);

		leftTrackWheelModels[28].addShape3D(6F, -6F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 1, 12, 12, 40, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape154
		leftTrackWheelModels[28].setRotationPoint(-15.5F, 0.75F, 27.25F);

		leftTrackWheelModels[29].addShape3D(7.5F, -7.5F, -2.2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape155
		leftTrackWheelModels[29].setRotationPoint(-15.5F, 0.75F, 18F);

		leftTrackWheelModels[30].addShape3D(7.5F, -7.5F, -4.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape156
		leftTrackWheelModels[30].setRotationPoint(-15.5F, 0.75F, 18F);

		leftTrackWheelModels[31].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape157
		leftTrackWheelModels[31].setRotationPoint(-15.5F, 0.75F, 18F);

		leftTrackWheelModels[32].addShape3D(3F, -3F, -7F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape158
		leftTrackWheelModels[32].setRotationPoint(-15.5F, 0.75F, 23.75F);

		leftTrackWheelModels[33].addShape3D(7.5F, -7.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape159
		leftTrackWheelModels[33].setRotationPoint(-15.5F, 0.75F, 28.5F);

		leftTrackWheelModels[34].addShape3D(7.5F, -7.5F, -4.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape160
		leftTrackWheelModels[34].setRotationPoint(-15.5F, 0.75F, 27.5F);

		leftTrackWheelModels[35].addShape3D(6F, -6F, -3F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape161
		leftTrackWheelModels[35].setRotationPoint(-15.5F, 0.75F, 28F);

		leftTrackWheelModels[36].addShape3D(3F, -3F, -8F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape162
		leftTrackWheelModels[36].setRotationPoint(-27.25F, 0.75F, 22.75F);

		leftTrackWheelModels[37].addShape3D(7.5F, -7.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape163
		leftTrackWheelModels[37].setRotationPoint(-27.25F, 0.75F, 23.25F);

		leftTrackWheelModels[38].addShape3D(7.5F, -7.5F, -1.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape164
		leftTrackWheelModels[38].setRotationPoint(-27.25F, 0.75F, 23.25F);

		leftTrackWheelModels[39].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape165
		leftTrackWheelModels[39].setRotationPoint(-27.25F, 0.75F, 23.75F);

		leftTrackWheelModels[40].addShape3D(6F, -6F, -5.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 1, 12, 12, 40, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape166
		leftTrackWheelModels[40].setRotationPoint(-39.5F, 0.75F, 27.25F);

		leftTrackWheelModels[41].addShape3D(7.5F, -7.5F, -2.2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape167
		leftTrackWheelModels[41].setRotationPoint(-39.5F, 0.75F, 18F);

		leftTrackWheelModels[42].addShape3D(7.5F, -7.5F, -4.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape168
		leftTrackWheelModels[42].setRotationPoint(-39.5F, 0.75F, 18F);

		leftTrackWheelModels[43].addShape3D(6F, -6F, -2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape169
		leftTrackWheelModels[43].setRotationPoint(-39.5F, 0.75F, 18F);

		leftTrackWheelModels[44].addShape3D(3F, -3F, -7F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape170
		leftTrackWheelModels[44].setRotationPoint(-39.5F, 0.75F, 23.75F);

		leftTrackWheelModels[45].addShape3D(7.5F, -7.5F, -1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape171
		leftTrackWheelModels[45].setRotationPoint(-39.5F, 0.75F, 28.5F);

		leftTrackWheelModels[46].addShape3D(7.5F, -7.5F, -4.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape172
		leftTrackWheelModels[46].setRotationPoint(-39.5F, 0.75F, 27.5F);

		leftTrackWheelModels[47].addShape3D(6F, -6F, -3F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape173
		leftTrackWheelModels[47].setRotationPoint(-39.5F, 0.75F, 28F);

		leftTrackWheelModels[48].addShape3D(6F, -6F, 1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape211
		leftTrackWheelModels[48].setRotationPoint(63.5F, -5.25F, 22.75F);

		leftTrackWheelModels[49].addShape3D(7.5F, -7.5F, -10F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape212
		leftTrackWheelModels[49].setRotationPoint(63.5F, -5.25F, 22.75F);

		leftTrackWheelModels[50].addShape3D(6F, -6F, -8F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape213
		leftTrackWheelModels[50].setRotationPoint(63.5F, -5.25F, 22.75F);

		leftTrackWheelModels[51].addShape3D(3F, -3F, -7F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape214
		leftTrackWheelModels[51].setRotationPoint(63.5F, -5.25F, 22.75F);

		leftTrackWheelModels[52].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape215
		leftTrackWheelModels[52].setRotationPoint(63.5F, -5.25F, 22.75F);

		leftTrackWheelModels[53].addShape3D(6F, -6F, -8F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 12, 12, 12, 40, 12, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape216
		leftTrackWheelModels[53].setRotationPoint(-53.5F, -2F, 23F);
	}

	private void initrightTrackWheelModels_1()
	{
		rightTrackWheelModels[0] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape12
		rightTrackWheelModels[1] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape13
		rightTrackWheelModels[2] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape14
		rightTrackWheelModels[3] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape15
		rightTrackWheelModels[4] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape16
		rightTrackWheelModels[5] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape17
		rightTrackWheelModels[6] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape18
		rightTrackWheelModels[7] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape19
		rightTrackWheelModels[8] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape20
		rightTrackWheelModels[9] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape21
		rightTrackWheelModels[10] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape22
		rightTrackWheelModels[11] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape23
		rightTrackWheelModels[12] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape24
		rightTrackWheelModels[13] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape25
		rightTrackWheelModels[14] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape26
		rightTrackWheelModels[15] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape27
		rightTrackWheelModels[16] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape28
		rightTrackWheelModels[17] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape29
		rightTrackWheelModels[18] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape30
		rightTrackWheelModels[19] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape31
		rightTrackWheelModels[20] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape32
		rightTrackWheelModels[21] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape33
		rightTrackWheelModels[22] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape34
		rightTrackWheelModels[23] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape35
		rightTrackWheelModels[24] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape36
		rightTrackWheelModels[25] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape37
		rightTrackWheelModels[26] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape38
		rightTrackWheelModels[27] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape39
		rightTrackWheelModels[28] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape40
		rightTrackWheelModels[29] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape41
		rightTrackWheelModels[30] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape42
		rightTrackWheelModels[31] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape43
		rightTrackWheelModels[32] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape44
		rightTrackWheelModels[33] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape45
		rightTrackWheelModels[34] = new ModelRendererTurbo(this, 346, 142, textureX, textureY); // Import Shape46
		rightTrackWheelModels[35] = new ModelRendererTurbo(this, 290, 184, textureX, textureY); // Import Shape47
		rightTrackWheelModels[36] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape48
		rightTrackWheelModels[37] = new ModelRendererTurbo(this, 405, 144, textureX, textureY); // Import Shape59
		rightTrackWheelModels[38] = new ModelRendererTurbo(this, 405, 144, textureX, textureY); // Import Shape60
		rightTrackWheelModels[39] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape61
		rightTrackWheelModels[40] = new ModelRendererTurbo(this, 405, 144, textureX, textureY); // Import Shape62
		rightTrackWheelModels[41] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape63
		rightTrackWheelModels[42] = new ModelRendererTurbo(this, 405, 144, textureX, textureY); // Import Shape64
		rightTrackWheelModels[43] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape65
		rightTrackWheelModels[44] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape69
		rightTrackWheelModels[45] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape70
		rightTrackWheelModels[46] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape71
		rightTrackWheelModels[47] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape72
		rightTrackWheelModels[48] = new ModelRendererTurbo(this, 290, 163, textureX, textureY); // Import Shape206
		rightTrackWheelModels[49] = new ModelRendererTurbo(this, 290, 142, textureX, textureY); // Import Shape207
		rightTrackWheelModels[50] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape208
		rightTrackWheelModels[51] = new ModelRendererTurbo(this, 346, 162, textureX, textureY); // Import Shape209
		rightTrackWheelModels[52] = new ModelRendererTurbo(this, 346, 162, textureX, textureY); // Import Shape210
		rightTrackWheelModels[53] = new ModelRendererTurbo(this, 391, 163, textureX, textureY); // Import Shape218
		rightTrackWheelModels[54] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape219
		rightTrackWheelModels[55] = new ModelRendererTurbo(this, 347, 178, textureX, textureY); // Import Shape224

		rightTrackWheelModels[0].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape12
		rightTrackWheelModels[0].setRotationPoint(46.75F, 0.75F, -22.75F);

		rightTrackWheelModels[1].addShape3D(6F, -6F, 2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape13
		rightTrackWheelModels[1].setRotationPoint(46.75F, 0.75F, -22.75F);

		rightTrackWheelModels[2].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape14
		rightTrackWheelModels[2].setRotationPoint(46.75F, 0.75F, -22.75F);

		rightTrackWheelModels[3].addShape3D(7.5F, -7.5F, 0.2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape15
		rightTrackWheelModels[3].setRotationPoint(34.5F, 0.75F, -18F);

		rightTrackWheelModels[4].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape16
		rightTrackWheelModels[4].setRotationPoint(34.5F, 0.75F, -18F);

		rightTrackWheelModels[5].addShape3D(6F, -6F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape17
		rightTrackWheelModels[5].setRotationPoint(34.5F, 0.75F, -18F);

		rightTrackWheelModels[6].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape18
		rightTrackWheelModels[6].setRotationPoint(34.5F, 0.75F, -27.5F);

		rightTrackWheelModels[7].addShape3D(6F, -6F, 1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape19
		rightTrackWheelModels[7].setRotationPoint(34.5F, 0.75F, -28F);

		rightTrackWheelModels[8].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape20
		rightTrackWheelModels[8].setRotationPoint(34.5F, 0.75F, -27.5F);

		rightTrackWheelModels[9].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape21
		rightTrackWheelModels[9].setRotationPoint(9.5F, 0.75F, -27.5F);

		rightTrackWheelModels[10].addShape3D(6F, -6F, 1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape22
		rightTrackWheelModels[10].setRotationPoint(9.5F, 0.75F, -28F);

		rightTrackWheelModels[11].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape23
		rightTrackWheelModels[11].setRotationPoint(9.5F, 0.75F, -27.5F);

		rightTrackWheelModels[12].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape24
		rightTrackWheelModels[12].setRotationPoint(9.5F, 0.75F, -18F);

		rightTrackWheelModels[13].addShape3D(6F, -6F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape25
		rightTrackWheelModels[13].setRotationPoint(9.5F, 0.75F, -18F);

		rightTrackWheelModels[14].addShape3D(7.5F, -7.5F, 0.2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape26
		rightTrackWheelModels[14].setRotationPoint(9.5F, 0.75F, -18F);

		rightTrackWheelModels[15].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape27
		rightTrackWheelModels[15].setRotationPoint(21.75F, 0.75F, -22.75F);

		rightTrackWheelModels[16].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape28
		rightTrackWheelModels[16].setRotationPoint(21.75F, 0.75F, -22.75F);

		rightTrackWheelModels[17].addShape3D(6F, -6F, 2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape29
		rightTrackWheelModels[17].setRotationPoint(21.75F, 0.75F, -22.75F);

		rightTrackWheelModels[18].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape30
		rightTrackWheelModels[18].setRotationPoint(-15.5F, 0.75F, -27.5F);

		rightTrackWheelModels[19].addShape3D(6F, -6F, 1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape31
		rightTrackWheelModels[19].setRotationPoint(-15.5F, 0.75F, -28F);

		rightTrackWheelModels[20].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape32
		rightTrackWheelModels[20].setRotationPoint(-15.5F, 0.75F, -27.5F);

		rightTrackWheelModels[21].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape33
		rightTrackWheelModels[21].setRotationPoint(-15.5F, 0.75F, -18F);

		rightTrackWheelModels[22].addShape3D(6F, -6F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape34
		rightTrackWheelModels[22].setRotationPoint(-15.5F, 0.75F, -18F);

		rightTrackWheelModels[23].addShape3D(7.5F, -7.5F, 0.2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape35
		rightTrackWheelModels[23].setRotationPoint(-15.5F, 0.75F, -18F);

		rightTrackWheelModels[24].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape36
		rightTrackWheelModels[24].setRotationPoint(-3.25F, 0.75F, -22.75F);

		rightTrackWheelModels[25].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape37
		rightTrackWheelModels[25].setRotationPoint(-3.25F, 0.75F, -22.75F);

		rightTrackWheelModels[26].addShape3D(6F, -6F, 2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape38
		rightTrackWheelModels[26].setRotationPoint(-3.25F, 0.75F, -22.75F);

		rightTrackWheelModels[27].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape39
		rightTrackWheelModels[27].setRotationPoint(-39.5F, 0.75F, -27.5F);

		rightTrackWheelModels[28].addShape3D(6F, -6F, 1F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape40
		rightTrackWheelModels[28].setRotationPoint(-39.5F, 0.75F, -28F);

		rightTrackWheelModels[29].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape41
		rightTrackWheelModels[29].setRotationPoint(-39.5F, 0.75F, -27.5F);

		rightTrackWheelModels[30].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape42
		rightTrackWheelModels[30].setRotationPoint(-39.5F, 0.75F, -18F);

		rightTrackWheelModels[31].addShape3D(6F, -6F, 0.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape43
		rightTrackWheelModels[31].setRotationPoint(-39.5F, 0.75F, -18F);

		rightTrackWheelModels[32].addShape3D(7.5F, -7.5F, 0.2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape44
		rightTrackWheelModels[32].setRotationPoint(-39.5F, 0.75F, -18F);

		rightTrackWheelModels[33].addShape3D(7.5F, -7.5F, 2.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape45
		rightTrackWheelModels[33].setRotationPoint(-27.25F, 0.75F, -22.75F);

		rightTrackWheelModels[34].addShape3D(7.5F, -7.5F, 0F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape46
		rightTrackWheelModels[34].setRotationPoint(-27.25F, 0.75F, -22.75F);

		rightTrackWheelModels[35].addShape3D(6F, -6F, 2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape47
		rightTrackWheelModels[35].setRotationPoint(-27.25F, 0.75F, -22.75F);

		rightTrackWheelModels[36].addShape3D(3F, -3F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape48
		rightTrackWheelModels[36].setRotationPoint(46.75F, 0.75F, -22.75F);

		rightTrackWheelModels[37].addShape3D(6F, -6F, 4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 1, 12, 12, 40, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape59
		rightTrackWheelModels[37].setRotationPoint(34.5F, 0.75F, -27.5F);

		rightTrackWheelModels[38].addShape3D(6F, -6F, 4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 1, 12, 12, 40, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape60
		rightTrackWheelModels[38].setRotationPoint(9.5F, 0.75F, -27.5F);

		rightTrackWheelModels[39].addShape3D(3F, -3F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape61
		rightTrackWheelModels[39].setRotationPoint(21.75F, 0.75F, -22.75F);

		rightTrackWheelModels[40].addShape3D(6F, -6F, 4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 1, 12, 12, 40, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape62
		rightTrackWheelModels[40].setRotationPoint(-15.5F, 0.75F, -27.5F);

		rightTrackWheelModels[41].addShape3D(3F, -3F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape63
		rightTrackWheelModels[41].setRotationPoint(-3.25F, 0.75F, -22.75F);

		rightTrackWheelModels[42].addShape3D(6F, -6F, 4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 1, 12, 12, 40, 1, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape64
		rightTrackWheelModels[42].setRotationPoint(-39.5F, 0.75F, -27.5F);

		rightTrackWheelModels[43].addShape3D(3F, -3F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape65
		rightTrackWheelModels[43].setRotationPoint(-39.5F, 0.75F, -22.75F);

		rightTrackWheelModels[44].addShape3D(3F, -3F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape69
		rightTrackWheelModels[44].setRotationPoint(-27.25F, 0.75F, -22.75F);

		rightTrackWheelModels[45].addShape3D(3F, -3F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape70
		rightTrackWheelModels[45].setRotationPoint(-15.5F, 0.75F, -22.75F);

		rightTrackWheelModels[46].addShape3D(3F, -3F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape71
		rightTrackWheelModels[46].setRotationPoint(9.5F, 0.75F, -22.75F);

		rightTrackWheelModels[47].addShape3D(3F, -3F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape72
		rightTrackWheelModels[47].setRotationPoint(34.5F, 0.75F, -22.75F);

		rightTrackWheelModels[48].addShape3D(7.5F, -7.5F, 7.5F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape206
		rightTrackWheelModels[48].setRotationPoint(63.5F, -5.25F, -22.25F);

		rightTrackWheelModels[49].addShape3D(7.5F, -7.5F, -4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(11, 0, 11, 0), new Coord2D(15, 4, 15, 4), new Coord2D(15, 11, 15, 11), new Coord2D(11, 15, 11, 15), new Coord2D(4, 15, 4, 15), new Coord2D(0, 11, 0, 11), new Coord2D(0, 4, 0, 4) }), 2, 15, 15, 52, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,7 ,6 ,7 ,6 ,7 ,6 ,7}); // Import Shape207
		rightTrackWheelModels[49].setRotationPoint(63.5F, -5.25F, -22.25F);

		rightTrackWheelModels[50].addShape3D(3F, -3F, -5F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape208
		rightTrackWheelModels[50].setRotationPoint(63.5F, -5.25F, -22.25F);

		rightTrackWheelModels[51].addShape3D(6F, -6F, -2F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape209
		rightTrackWheelModels[51].setRotationPoint(63.5F, -5.25F, -22.25F);

		rightTrackWheelModels[52].addShape3D(6F, -6F, 6F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 2, 12, 12, 40, 2, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape210
		rightTrackWheelModels[52].setRotationPoint(63.5F, -5.25F, -22.25F);

		rightTrackWheelModels[53].addShape3D(6F, -6F, -4F, new Shape2D(new Coord2D[] { new Coord2D(4, 0, 4, 0), new Coord2D(8, 0, 8, 0), new Coord2D(12, 4, 12, 4), new Coord2D(12, 8, 12, 8), new Coord2D(8, 12, 8, 12), new Coord2D(4, 12, 4, 12), new Coord2D(0, 8, 0, 8), new Coord2D(0, 4, 0, 4) }), 12, 12, 12, 40, 12, ModelRendererTurbo.MR_FRONT, new float[] {6 ,4 ,6 ,4 ,6 ,4 ,6 ,4}); // Import Shape218
		rightTrackWheelModels[53].setRotationPoint(-53.5F, -2F, -23F);

		rightTrackWheelModels[54].addShape3D(3F, -3F, -6F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape219
		rightTrackWheelModels[54].setRotationPoint(-53.5F, -2F, -23F);

		rightTrackWheelModels[55].addShape3D(3F, -3F, -7F, new Shape2D(new Coord2D[] { new Coord2D(2, 0, 2, 0), new Coord2D(4, 0, 4, 0), new Coord2D(6, 2, 6, 2), new Coord2D(6, 4, 6, 4), new Coord2D(4, 6, 4, 6), new Coord2D(2, 6, 2, 6), new Coord2D(0, 4, 0, 4), new Coord2D(0, 2, 0, 2) }), 13, 6, 6, 20, 13, ModelRendererTurbo.MR_FRONT, new float[] {3 ,2 ,3 ,2 ,3 ,2 ,3 ,2}); // Import Shape224
		rightTrackWheelModels[55].setRotationPoint(-53.5F, -2F, 23F);
	}

	private void initleftTrackModel_1()
	{
		leftTrackModel[0] = new ModelRendererTurbo(this, 289, 28, textureX, textureY); // Import Box182
		leftTrackModel[1] = new ModelRendererTurbo(this, 418, 50, textureX, textureY); // Import Box183
		leftTrackModel[2] = new ModelRendererTurbo(this, 368, 73, textureX, textureY); // Import Box184
		leftTrackModel[3] = new ModelRendererTurbo(this, 282, 119, textureX, textureY); // Import Box185
		leftTrackModel[4] = new ModelRendererTurbo(this, 385, 119, textureX, textureY); // Import Box186
		leftTrackModel[5] = new ModelRendererTurbo(this, 385, 96, textureX, textureY); // Import Box187
		leftTrackModel[6] = new ModelRendererTurbo(this, 288, 96, textureX, textureY); // Import Box188
		leftTrackModel[7] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Import Box189
		leftTrackModel[8] = new ModelRendererTurbo(this, 315, 50, textureX, textureY); // Import Box190
		leftTrackModel[9] = new ModelRendererTurbo(this, 289, 5, textureX, textureY); // Import Box191
		leftTrackModel[10] = new ModelRendererTurbo(this, 419, 5, textureX, textureY); // Import Box192
		leftTrackModel[11] = new ModelRendererTurbo(this, 337, 96, textureX, textureY); // Import Box193
		leftTrackModel[12] = new ModelRendererTurbo(this, 437, 96, textureX, textureY); // Import Box194
		leftTrackModel[13] = new ModelRendererTurbo(this, 437, 119, textureX, textureY); // Import Box195
		leftTrackModel[14] = new ModelRendererTurbo(this, 333, 119, textureX, textureY); // Import Box196

		leftTrackModel[0].addShapeBox(0F, 0F, -17F, 92, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box182
		leftTrackModel[0].setRotationPoint(-42.5F, 8F, 35F);

		leftTrackModel[1].addShapeBox(-12.5F, -5F, -17F, 12, 2, 17, 0F,0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Import Box183
		leftTrackModel[1].setRotationPoint(-42.5F, 8F, 35F);

		leftTrackModel[2].addShapeBox(-0.5F, -5F, -17F, 18, 2, 17, 0F,-0.5F, -5F, 0F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, -0.5F, -5F, 0F, -1F, 5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 5F, 0F); // Import Box184
		leftTrackModel[2].setRotationPoint(49.5F, 8F, 35F);

		leftTrackModel[3].addShapeBox(-0.5F, -5F, -17F, 7, 2, 17, 0F,-0.5F, -5.25F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, -5.25F, 0F, -1.5F, 5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 5F, 0F); // Import Box185
		leftTrackModel[3].setRotationPoint(66F, 1.5F, 35F);

		leftTrackModel[4].addShapeBox(0F, 0F, -17F, 4, 2, 17, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box186
		leftTrackModel[4].setRotationPoint(70.5F, -3F, 35F);
		leftTrackModel[4].rotateAngleZ = 1.57079633F;

		leftTrackModel[5].addShapeBox(-0.5F, 3F, -17F, 7, 2, 17, 0F,-1.5F, 5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 5F, 0F, -0.5F, -5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, -5F, 0F); // Import Box187
		leftTrackModel[5].setRotationPoint(66F, -12F, 35F);

		leftTrackModel[6].addShapeBox(-7F, 0F, -17F, 6, 2, 17, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box188
		leftTrackModel[6].setRotationPoint(67F, -14F, 35F);

		leftTrackModel[7].addShapeBox(-21F, 0F, -17F, 20, 2, 17, 0F,0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, -0.25F, 3F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 3F, 0F); // Import Box189
		leftTrackModel[7].setRotationPoint(60F, -14F, 35F);

		leftTrackModel[8].addShapeBox(-32F, 0F, -17F, 32, 2, 17, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.25F, 2.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 2.5F, 0F); // Import Box190
		leftTrackModel[8].setRotationPoint(39F, -11F, 35F);

		leftTrackModel[9].addShapeBox(-45F, 0F, -17F, 45, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box191
		leftTrackModel[9].setRotationPoint(7F, -8.5F, 35F);

		leftTrackModel[10].addShapeBox(-13F, 1F, -17F, 12, 2, 17, 0F,0F, -1.5F, 0F, 1F, -2.25F, 0F, 1F, -2.25F, 0F, 0F, -1F, 0F, 0.25F, 1F, 0F, 0.75F, 2.25F, 0F, 0.75F, 2.25F, 0F, 0.25F, 1F, 0F); // Import Box192
		leftTrackModel[10].setRotationPoint(-38F, -11.75F, 35F);

		leftTrackModel[11].addShapeBox(-4F, 0F, -17F, 4, 2, 17, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box193
		leftTrackModel[11].setRotationPoint(-51F, -9.75F, 35F);

		leftTrackModel[12].addShapeBox(-0.5F, 3F, -17F, 6, 2, 17, 0F,0F, -1.5F, 0F, -1.5F, 4.25F, 0F, -1.5F, 4.25F, 0F, 0F, -1.5F, 0F, -2F, 0F, 0F, -0.5F, -4.25F, 0F, -0.5F, -4.25F, 0F, -2F, 0F, 0F); // Import Box194
		leftTrackModel[12].setRotationPoint(-60F, -8.5F, 35F);

		leftTrackModel[13].addShapeBox(0F, 0F, -17F, 4, 2, 17, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box195
		leftTrackModel[13].setRotationPoint(-60.5F, 0F, 35F);
		leftTrackModel[13].rotateAngleZ = 1.57079633F;

		leftTrackModel[14].addShapeBox(-0.5F, -5F, -17F, 6, 2, 17, 0F,-2F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -2F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, -1.5F, 0F); // Import Box196
		leftTrackModel[14].setRotationPoint(-60F, 5F, 35F);
	}

	private void initrightTrackModel_1()
	{
		rightTrackModel[0] = new ModelRendererTurbo(this, 289, 28, textureX, textureY); // Import Box167
		rightTrackModel[1] = new ModelRendererTurbo(this, 418, 50, textureX, textureY); // Import Box168
		rightTrackModel[2] = new ModelRendererTurbo(this, 368, 73, textureX, textureY); // Import Box169
		rightTrackModel[3] = new ModelRendererTurbo(this, 282, 119, textureX, textureY); // Import Box170
		rightTrackModel[4] = new ModelRendererTurbo(this, 385, 119, textureX, textureY); // Import Box171
		rightTrackModel[5] = new ModelRendererTurbo(this, 385, 96, textureX, textureY); // Import Box172
		rightTrackModel[6] = new ModelRendererTurbo(this, 288, 96, textureX, textureY); // Import Box173
		rightTrackModel[7] = new ModelRendererTurbo(this, 289, 73, textureX, textureY); // Import Box174
		rightTrackModel[8] = new ModelRendererTurbo(this, 289, 5, textureX, textureY); // Import Box176
		rightTrackModel[9] = new ModelRendererTurbo(this, 419, 5, textureX, textureY); // Import Box177
		rightTrackModel[10] = new ModelRendererTurbo(this, 337, 96, textureX, textureY); // Import Box178
		rightTrackModel[11] = new ModelRendererTurbo(this, 437, 96, textureX, textureY); // Import Box179
		rightTrackModel[12] = new ModelRendererTurbo(this, 437, 119, textureX, textureY); // Import Box180
		rightTrackModel[13] = new ModelRendererTurbo(this, 333, 119, textureX, textureY); // Import Box181
		rightTrackModel[14] = new ModelRendererTurbo(this, 315, 50, textureX, textureY); // Import Box197

		rightTrackModel[0].addShapeBox(0F, 0F, 0F, 92, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F); // Import Box167
		rightTrackModel[0].setRotationPoint(-42.5F, 8F, -35F);

		rightTrackModel[1].addShapeBox(-12.5F, -5F, 0F, 12, 2, 17, 0F,0F, 0F, 0F, 0.5F, -5F, 0F, 0.5F, -5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 5F, 0F, 0F, 5F, 0F, 0F, 0F, 0F); // Import Box168
		rightTrackModel[1].setRotationPoint(-42.5F, 8F, -35F);

		rightTrackModel[2].addShapeBox(-0.5F, -5F, 0F, 18, 2, 17, 0F,-0.5F, -5F, 0F, -1F, 1.25F, 0F, -1F, 1.25F, 0F, -0.5F, -5F, 0F, -1F, 5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1F, 5F, 0F); // Import Box169
		rightTrackModel[2].setRotationPoint(49.5F, 8F, -35F);

		rightTrackModel[3].addShapeBox(-0.5F, -5F, 0F, 7, 2, 17, 0F,-0.5F, -5.25F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, -5.25F, 0F, -1.5F, 5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 5F, 0F); // Import Box170
		rightTrackModel[3].setRotationPoint(66F, 1.5F, -35F);

		rightTrackModel[4].addShapeBox(0F, 0F, 0F, 4, 2, 17, 0F,0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box171
		rightTrackModel[4].setRotationPoint(70.5F, -3F, -35F);
		rightTrackModel[4].rotateAngleZ = 1.57079633F;

		rightTrackModel[5].addShapeBox(-0.5F, 3F, 0F, 7, 2, 17, 0F,-1.5F, 5F, 0F, 0F, -1.5F, 0F, 0F, -1.5F, 0F, -1.5F, 5F, 0F, -0.5F, -5F, 0F, -2F, -0.5F, 0F, -2F, -0.5F, 0F, -0.5F, -5F, 0F); // Import Box172
		rightTrackModel[5].setRotationPoint(66F, -12F, -35F);

		rightTrackModel[6].addShapeBox(-7F, 0F, 0F, 6, 2, 17, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F); // Import Box173
		rightTrackModel[6].setRotationPoint(67F, -14F, -35F);

		rightTrackModel[7].addShapeBox(-21F, 0F, 0F, 20, 2, 17, 0F,0F, -3F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, -3F, 0F, -0.25F, 3F, 0F, 1.25F, 0F, 0F, 1.25F, 0F, 0F, -0.25F, 3F, 0F); // Import Box174
		rightTrackModel[7].setRotationPoint(60F, -14F, -35F);

		rightTrackModel[8].addShapeBox(-45F, 0F, 0F, 45, 2, 17, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F); // Import Box176
		rightTrackModel[8].setRotationPoint(7F, -8.5F, -35F);

		rightTrackModel[9].addShapeBox(-13F, 1F, 0F, 12, 2, 17, 0F,0F, -1F, 0F, 1F, -2.25F, 0F, 1F, -2.25F, 0F, 0F, -1F, 0F, 0.25F, 1F, 0F, 0.75F, 2.25F, 0F, 0.75F, 2.25F, 0F, 0.25F, 1F, 0F); // Import Box177
		rightTrackModel[9].setRotationPoint(-38F, -11.75F, -35F);

		rightTrackModel[10].addShapeBox(-4F, 0F, 0F, 4, 2, 17, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, -0.25F, 0F, 0F, -0.25F, 0F, 0F, 0F, 0F, 0F); // Import Box178
		rightTrackModel[10].setRotationPoint(-51F, -9.75F, -35F);

		rightTrackModel[11].addShapeBox(-0.5F, 3F, 0F, 6, 2, 17, 0F,0F, -1.5F, 0F, -1.5F, 4.25F, 0F, -1.5F, 4.25F, 0F, 0F, -1.5F, 0F, -2F, 0F, 0F, -0.5F, -4.25F, 0F, -0.5F, -4.25F, 0F, -2F, 0F, 0F); // Import Box179
		rightTrackModel[11].setRotationPoint(-60F, -8.5F, -35F);

		rightTrackModel[12].addShapeBox(0F, 0F, 0F, 4, 2, 17, 0F,0.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, 0F, 0F, 0F); // Import Box180
		rightTrackModel[12].setRotationPoint(-60.5F, 0F, -35F);
		rightTrackModel[12].rotateAngleZ = 1.57079633F;

		rightTrackModel[13].addShapeBox(-0.5F, -5F, 0F, 6, 2, 17, 0F,-2F, 0F, 0F, -0.5F, -3F, 0F, -0.5F, -3F, 0F, -2F, 0F, 0F, 0F, -1.5F, 0F, -0.5F, 3F, 0F, -0.5F, 3F, 0F, 0F, -1.5F, 0F); // Import Box181
		rightTrackModel[13].setRotationPoint(-60F, 5F, -35F);

		rightTrackModel[14].addShapeBox(-32F, 0F, 0F, 32, 2, 17, 0F,0F, -2.5F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -2.5F, 0F, -0.25F, 2.5F, 0F, 0.25F, 0F, 0F, 0.25F, 0F, 0F, -0.25F, 2.5F, 0F); // Import Box197
		rightTrackModel[14].setRotationPoint(39F, -11F, -35F);
	}
}