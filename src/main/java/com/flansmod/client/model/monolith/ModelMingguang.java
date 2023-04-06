//This File was created with the Minecraft-SMP Modelling Toolbox 2.2.0.0
// Copyright (C) 2020 Minecraft-SMP.de
// This file is for Flan's Flying Mod Version 4.0.x+

package com.flansmod.client.model.monolith; //Path where the model is located

import com.flansmod.client.model.ModelCustomArmour;
import com.flansmod.client.tmt.ModelRendererTurbo;
import com.flansmod.client.tmt.Coord2D;
import com.flansmod.client.tmt.Shape2D;

public class ModelMingguang extends ModelCustomArmour //Same as Filename
{
	int textureX = 256;
	int textureY = 128;

	public ModelMingguang() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[153];
		leftArmModel = new ModelRendererTurbo[44];
		rightArmModel = new ModelRendererTurbo[44];
		leftLegModel = new ModelRendererTurbo[77];
		rightLegModel = new ModelRendererTurbo[77];

		initbodyModel_1();
		initleftArmModel_1();
		initrightArmModel_1();
		initleftLegModel_1();
		initrightLegModel_1();
	}

	private void initbodyModel_1()
	{
		bodyModel[0] = new ModelRendererTurbo(this, 97, 1, textureX, textureY); // Box 15
		bodyModel[1] = new ModelRendererTurbo(this, 1, 9, textureX, textureY); // Box 18
		bodyModel[2] = new ModelRendererTurbo(this, 33, 9, textureX, textureY); // Box 19
		bodyModel[3] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 289
		bodyModel[4] = new ModelRendererTurbo(this, 121, 25, textureX, textureY); // Box 290
		bodyModel[5] = new ModelRendererTurbo(this, 17, 33, textureX, textureY); // Box 291
		bodyModel[6] = new ModelRendererTurbo(this, 49, 1, textureX, textureY); // Box 292
		bodyModel[7] = new ModelRendererTurbo(this, 57, 33, textureX, textureY); // Box 293
		bodyModel[8] = new ModelRendererTurbo(this, 73, 33, textureX, textureY); // Box 294
		bodyModel[9] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 295
		bodyModel[10] = new ModelRendererTurbo(this, 62, 65, textureX, textureY); // Box 296
		bodyModel[11] = new ModelRendererTurbo(this, 121, 33, textureX, textureY); // Box 298
		bodyModel[12] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 309
		bodyModel[13] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 310
		bodyModel[14] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 317
		bodyModel[15] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 320
		bodyModel[16] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 323
		bodyModel[17] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 324
		bodyModel[18] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 325
		bodyModel[19] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 326
		bodyModel[20] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 329
		bodyModel[21] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 330
		bodyModel[22] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 339
		bodyModel[23] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 340
		bodyModel[24] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 341
		bodyModel[25] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 342
		bodyModel[26] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 343
		bodyModel[27] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 344
		bodyModel[28] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 345
		bodyModel[29] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 346
		bodyModel[30] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 347
		bodyModel[31] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 348
		bodyModel[32] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 349
		bodyModel[33] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 350
		bodyModel[34] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 351
		bodyModel[35] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 352
		bodyModel[36] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 353
		bodyModel[37] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 354
		bodyModel[38] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 355
		bodyModel[39] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 356
		bodyModel[40] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 357
		bodyModel[41] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 358
		bodyModel[42] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 359
		bodyModel[43] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 360
		bodyModel[44] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 361
		bodyModel[45] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 362
		bodyModel[46] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 363
		bodyModel[47] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 364
		bodyModel[48] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 365
		bodyModel[49] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 366
		bodyModel[50] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 367
		bodyModel[51] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 368
		bodyModel[52] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 369
		bodyModel[53] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 370
		bodyModel[54] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 371
		bodyModel[55] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 372
		bodyModel[56] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 373
		bodyModel[57] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 374
		bodyModel[58] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 375
		bodyModel[59] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 376
		bodyModel[60] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 377
		bodyModel[61] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 378
		bodyModel[62] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 379
		bodyModel[63] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 380
		bodyModel[64] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 381
		bodyModel[65] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 382
		bodyModel[66] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 383
		bodyModel[67] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 384
		bodyModel[68] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 385
		bodyModel[69] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 386
		bodyModel[70] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 387
		bodyModel[71] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 388
		bodyModel[72] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 389
		bodyModel[73] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 390
		bodyModel[74] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 391
		bodyModel[75] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 392
		bodyModel[76] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 393
		bodyModel[77] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 394
		bodyModel[78] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 395
		bodyModel[79] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 396
		bodyModel[80] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 397
		bodyModel[81] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 398
		bodyModel[82] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 399
		bodyModel[83] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 400
		bodyModel[84] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 401
		bodyModel[85] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 402
		bodyModel[86] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 403
		bodyModel[87] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 404
		bodyModel[88] = new ModelRendererTurbo(this, 0, 49, textureX, textureY); // Box 295
		bodyModel[89] = new ModelRendererTurbo(this, 113, 41, textureX, textureY); // Box 296
		bodyModel[90] = new ModelRendererTurbo(this, 49, 49, textureX, textureY); // Box 297
		bodyModel[91] = new ModelRendererTurbo(this, 57, 49, textureX, textureY); // Box 298
		bodyModel[92] = new ModelRendererTurbo(this, 73, 49, textureX, textureY); // Box 299
		bodyModel[93] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 302
		bodyModel[94] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 303
		bodyModel[95] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 304
		bodyModel[96] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 305
		bodyModel[97] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 306
		bodyModel[98] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 307
		bodyModel[99] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 322
		bodyModel[100] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 323
		bodyModel[101] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 324
		bodyModel[102] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 325
		bodyModel[103] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 326
		bodyModel[104] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 327
		bodyModel[105] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 341
		bodyModel[106] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 342
		bodyModel[107] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 343
		bodyModel[108] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 345
		bodyModel[109] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 346
		bodyModel[110] = new ModelRendererTurbo(this, 20, 100, textureX, textureY); // Box 347
		bodyModel[111] = new ModelRendererTurbo(this, 145, 1, textureX, textureY); // Box 348
		bodyModel[112] = new ModelRendererTurbo(this, 169, 1, textureX, textureY); // Box 349
		bodyModel[113] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 350
		bodyModel[114] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 351
		bodyModel[115] = new ModelRendererTurbo(this, 105, 49, textureX, textureY); // Box 352
		bodyModel[116] = new ModelRendererTurbo(this, 105, 33, textureX, textureY); // Box 353
		bodyModel[117] = new ModelRendererTurbo(this, 121, 1, textureX, textureY); // Box 354
		bodyModel[118] = new ModelRendererTurbo(this, 113, 49, textureX, textureY); // Box 355
		bodyModel[119] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 356
		bodyModel[120] = new ModelRendererTurbo(this, 25, 49, textureX, textureY); // Box 357
		bodyModel[121] = new ModelRendererTurbo(this, 57, 57, textureX, textureY); // Box 358
		bodyModel[122] = new ModelRendererTurbo(this, 81, 57, textureX, textureY); // Box 359
		bodyModel[123] = new ModelRendererTurbo(this, 97, 49, textureX, textureY); // Box 360
		bodyModel[124] = new ModelRendererTurbo(this, 57, 41, textureX, textureY); // Box 361
		bodyModel[125] = new ModelRendererTurbo(this, 25, 9, textureX, textureY); // Box 362
		bodyModel[126] = new ModelRendererTurbo(this, 121, 49, textureX, textureY); // Box 363
		bodyModel[127] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 0
		bodyModel[128] = new ModelRendererTurbo(this, 1, 57, textureX, textureY); // Box 1
		bodyModel[129] = new ModelRendererTurbo(this, 129, 17, textureX, textureY); // Box 7
		bodyModel[130] = new ModelRendererTurbo(this, 177, 1, textureX, textureY); // Box 8
		bodyModel[131] = new ModelRendererTurbo(this, 193, 1, textureX, textureY); // Box 9
		bodyModel[132] = new ModelRendererTurbo(this, 209, 1, textureX, textureY); // Box 10
		bodyModel[133] = new ModelRendererTurbo(this, 217, 1, textureX, textureY); // Box 11
		bodyModel[134] = new ModelRendererTurbo(this, 225, 1, textureX, textureY); // Box 12
		bodyModel[135] = new ModelRendererTurbo(this, 241, 1, textureX, textureY); // Box 13
		bodyModel[136] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 14
		bodyModel[137] = new ModelRendererTurbo(this, 105, 9, textureX, textureY); // Box 15
		bodyModel[138] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 16
		bodyModel[139] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 17
		bodyModel[140] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 18
		bodyModel[141] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 19
		bodyModel[142] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 20
		bodyModel[143] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 21
		bodyModel[144] = new ModelRendererTurbo(this, 0, 49, textureX, textureY); // Box 23
		bodyModel[145] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 31
		bodyModel[146] = new ModelRendererTurbo(this, 32, 65, textureX, textureY); // Box 32
		bodyModel[147] = new ModelRendererTurbo(this, 57, 9, textureX, textureY); // Box 33
		bodyModel[148] = new ModelRendererTurbo(this, 121, 9, textureX, textureY); // Box 34
		bodyModel[149] = new ModelRendererTurbo(this, 177, 9, textureX, textureY); // Box 35
		bodyModel[150] = new ModelRendererTurbo(this, 193, 9, textureX, textureY); // Box 36
		bodyModel[151] = new ModelRendererTurbo(this, 209, 9, textureX, textureY); // Box 37
		bodyModel[152] = new ModelRendererTurbo(this, 225, 9, textureX, textureY); // Box 38

		bodyModel[0].addShapeBox(-4F, 8.5F, -2F, 8, 1, 4, 0F,0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F, 0.5F, 0F, 0.7F); // Box 15
		bodyModel[0].setRotationPoint(0F, 0F, 0F);

		bodyModel[1].addShapeBox(-4F, 0F, -2F, 8, 9, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F); // Box 18
		bodyModel[1].setRotationPoint(0F, 0F, 0F);

		bodyModel[2].addShapeBox(-4F, 9.8F, -2F, 8, 5, 4, 0F,0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.1F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F, 0.5F, 0.1F, 0.5F); // Box 19
		bodyModel[2].setRotationPoint(0F, 0F, 0F);

		bodyModel[3].addShapeBox(-0.5F, 2.5F, -2.5F, 1, 4, 1, 0F,-0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F); // Box 289
		bodyModel[3].setRotationPoint(0F, 0F, 0F);

		bodyModel[4].addShapeBox(-4F, 0.5F, -2.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 290
		bodyModel[4].setRotationPoint(0F, 0F, 0F);

		bodyModel[5].addShapeBox(3F, 0.5F, -2.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 291
		bodyModel[5].setRotationPoint(0F, 0F, 0F);

		bodyModel[6].addShapeBox(-3F, 0.4F, -2.1F, 6, 1, 1, 0F,0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F); // Box 292
		bodyModel[6].setRotationPoint(0F, 0F, 0F);

		bodyModel[7].addShapeBox(-4.5F, 3.6F, -2.5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 293
		bodyModel[7].setRotationPoint(0F, 0F, 0F);

		bodyModel[8].addShapeBox(3.5F, 3.6F, -2.5F, 1, 1, 5, 0F,-0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F, -0.1F, -0.1F, 0F); // Box 294
		bodyModel[8].setRotationPoint(0F, 0F, 0F);

		bodyModel[9].addShapeBox(3F, 0.5F, 1.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 295
		bodyModel[9].setRotationPoint(0F, 0F, 0F);

		bodyModel[10].addShapeBox(-3F, -1.6F, 1.1F, 6, 3, 1, 0F,0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F); // Box 296
		bodyModel[10].setRotationPoint(0F, 0F, 0F);

		bodyModel[11].addShapeBox(-4F, 0.5F, 1.1F, 1, 4, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 298
		bodyModel[11].setRotationPoint(0F, 0F, 0F);

		bodyModel[12].addShapeBox(-3F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 309
		bodyModel[12].setRotationPoint(0F, 0F, 0F);

		bodyModel[13].addShapeBox(-3F, 2.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 310
		bodyModel[13].setRotationPoint(0F, 0F, 0F);

		bodyModel[14].addShapeBox(-3F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 317
		bodyModel[14].setRotationPoint(0F, 0F, 0F);

		bodyModel[15].addShapeBox(-3F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 320
		bodyModel[15].setRotationPoint(0F, 0F, 0F);

		bodyModel[16].addShapeBox(-3F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 323
		bodyModel[16].setRotationPoint(0F, 0F, 0F);

		bodyModel[17].addShapeBox(-4F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 324
		bodyModel[17].setRotationPoint(0F, 0F, 0F);

		bodyModel[18].addShapeBox(-4F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 325
		bodyModel[18].setRotationPoint(0F, 0F, 0F);

		bodyModel[19].addShapeBox(-4F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 326
		bodyModel[19].setRotationPoint(0F, 0F, 0F);

		bodyModel[20].addShapeBox(2F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 329
		bodyModel[20].setRotationPoint(0F, 0F, 0F);

		bodyModel[21].addShapeBox(2F, 2.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 330
		bodyModel[21].setRotationPoint(0F, 0F, 0F);

		bodyModel[22].addShapeBox(2F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 339
		bodyModel[22].setRotationPoint(0F, 0F, 0F);

		bodyModel[23].addShapeBox(3F, 4.2F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 340
		bodyModel[23].setRotationPoint(0F, 0F, 0F);

		bodyModel[24].addShapeBox(3F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 341
		bodyModel[24].setRotationPoint(0F, 0F, 0F);

		bodyModel[25].addShapeBox(2F, 5.4F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 342
		bodyModel[25].setRotationPoint(0F, 0F, 0F);

		bodyModel[26].addShapeBox(3F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 343
		bodyModel[26].setRotationPoint(0F, 0F, 0F);

		bodyModel[27].addShapeBox(2F, 6.7F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 344
		bodyModel[27].setRotationPoint(0F, 0F, 0F);

		bodyModel[28].addShapeBox(-3F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 345
		bodyModel[28].setRotationPoint(0F, 0F, 0F);

		bodyModel[29].addShapeBox(-2F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 346
		bodyModel[29].setRotationPoint(0F, 0F, 0F);

		bodyModel[30].addShapeBox(-1F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 347
		bodyModel[30].setRotationPoint(0F, 0F, 0F);

		bodyModel[31].addShapeBox(-1F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 348
		bodyModel[31].setRotationPoint(0F, 0F, 0F);

		bodyModel[32].addShapeBox(-2F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 349
		bodyModel[32].setRotationPoint(0F, 0F, 0F);

		bodyModel[33].addShapeBox(-3F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 350
		bodyModel[33].setRotationPoint(0F, 0F, 0F);

		bodyModel[34].addShapeBox(-3F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 351
		bodyModel[34].setRotationPoint(0F, 0F, 0F);

		bodyModel[35].addShapeBox(-4F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 352
		bodyModel[35].setRotationPoint(0F, 0F, 0F);

		bodyModel[36].addShapeBox(-4F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 353
		bodyModel[36].setRotationPoint(0F, 0F, 0F);

		bodyModel[37].addShapeBox(-4F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 354
		bodyModel[37].setRotationPoint(0F, 0F, 0F);

		bodyModel[38].addShapeBox(-3F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 355
		bodyModel[38].setRotationPoint(0F, 0F, 0F);

		bodyModel[39].addShapeBox(-3F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 356
		bodyModel[39].setRotationPoint(0F, 0F, 0F);

		bodyModel[40].addShapeBox(-2F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 357
		bodyModel[40].setRotationPoint(0F, 0F, 0F);

		bodyModel[41].addShapeBox(-1F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 358
		bodyModel[41].setRotationPoint(0F, 0F, 0F);

		bodyModel[42].addShapeBox(-1F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 359
		bodyModel[42].setRotationPoint(0F, 0F, 0F);

		bodyModel[43].addShapeBox(-2F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 360
		bodyModel[43].setRotationPoint(0F, 0F, 0F);

		bodyModel[44].addShapeBox(-2F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 361
		bodyModel[44].setRotationPoint(0F, 0F, 0F);

		bodyModel[45].addShapeBox(-1F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 362
		bodyModel[45].setRotationPoint(0F, 0F, 0F);

		bodyModel[46].addShapeBox(0F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 363
		bodyModel[46].setRotationPoint(0F, 0F, 0F);

		bodyModel[47].addShapeBox(0F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 364
		bodyModel[47].setRotationPoint(0F, 0F, 0F);

		bodyModel[48].addShapeBox(0F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 365
		bodyModel[48].setRotationPoint(0F, 0F, 0F);

		bodyModel[49].addShapeBox(0F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 366
		bodyModel[49].setRotationPoint(0F, 0F, 0F);

		bodyModel[50].addShapeBox(0F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 367
		bodyModel[50].setRotationPoint(0F, 0F, 0F);

		bodyModel[51].addShapeBox(1F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 368
		bodyModel[51].setRotationPoint(0F, 0F, 0F);

		bodyModel[52].addShapeBox(2F, 1.1F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 369
		bodyModel[52].setRotationPoint(0F, 0F, 0F);

		bodyModel[53].addShapeBox(2F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 370
		bodyModel[53].setRotationPoint(0F, 0F, 0F);

		bodyModel[54].addShapeBox(1F, 2.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 371
		bodyModel[54].setRotationPoint(0F, 0F, 0F);

		bodyModel[55].addShapeBox(1F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 372
		bodyModel[55].setRotationPoint(0F, 0F, 0F);

		bodyModel[56].addShapeBox(2F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 373
		bodyModel[56].setRotationPoint(0F, 0F, 0F);

		bodyModel[57].addShapeBox(3F, 4.2F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 374
		bodyModel[57].setRotationPoint(0F, 0F, 0F);

		bodyModel[58].addShapeBox(3F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 375
		bodyModel[58].setRotationPoint(0F, 0F, 0F);

		bodyModel[59].addShapeBox(3F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 376
		bodyModel[59].setRotationPoint(0F, 0F, 0F);

		bodyModel[60].addShapeBox(2F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 377
		bodyModel[60].setRotationPoint(0F, 0F, 0F);

		bodyModel[61].addShapeBox(2F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 378
		bodyModel[61].setRotationPoint(0F, 0F, 0F);

		bodyModel[62].addShapeBox(1F, 5.4F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 379
		bodyModel[62].setRotationPoint(0F, 0F, 0F);

		bodyModel[63].addShapeBox(1F, 6.7F, 1.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 380
		bodyModel[63].setRotationPoint(0F, 0F, 0F);

		bodyModel[64].addShapeBox(-4F, 6.7F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 381
		bodyModel[64].setRotationPoint(0F, 0F, 0F);

		bodyModel[65].addShapeBox(-4F, 6.7F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 382
		bodyModel[65].setRotationPoint(0F, 0F, 0F);

		bodyModel[66].addShapeBox(-4F, 6.7F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 383
		bodyModel[66].setRotationPoint(0F, 0F, 0F);

		bodyModel[67].addShapeBox(-4F, 6.7F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 384
		bodyModel[67].setRotationPoint(0F, 0F, 0F);

		bodyModel[68].addShapeBox(-4F, 5.5F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 385
		bodyModel[68].setRotationPoint(0F, 0F, 0F);

		bodyModel[69].addShapeBox(-4F, 5.5F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 386
		bodyModel[69].setRotationPoint(0F, 0F, 0F);

		bodyModel[70].addShapeBox(-4F, 5.5F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 387
		bodyModel[70].setRotationPoint(0F, 0F, 0F);

		bodyModel[71].addShapeBox(-4F, 5.5F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 388
		bodyModel[71].setRotationPoint(0F, 0F, 0F);

		bodyModel[72].addShapeBox(-4F, 4.3F, -2.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 389
		bodyModel[72].setRotationPoint(0F, 0F, 0F);

		bodyModel[73].addShapeBox(-4F, 4.3F, -1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 390
		bodyModel[73].setRotationPoint(0F, 0F, 0F);

		bodyModel[74].addShapeBox(-4F, 4.3F, 1.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 391
		bodyModel[74].setRotationPoint(0F, 0F, 0F);

		bodyModel[75].addShapeBox(-4F, 4.3F, 0.1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 392
		bodyModel[75].setRotationPoint(0F, 0F, 0F);

		bodyModel[76].addShapeBox(3F, 4.3F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 393
		bodyModel[76].setRotationPoint(0F, 0F, 0F);

		bodyModel[77].addShapeBox(3F, 4.3F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 394
		bodyModel[77].setRotationPoint(0F, 0F, 0F);

		bodyModel[78].addShapeBox(3F, 4.3F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 395
		bodyModel[78].setRotationPoint(0F, 0F, 0F);

		bodyModel[79].addShapeBox(3F, 4.3F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 396
		bodyModel[79].setRotationPoint(0F, 0F, 0F);

		bodyModel[80].addShapeBox(3F, 5.5F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 397
		bodyModel[80].setRotationPoint(0F, 0F, 0F);

		bodyModel[81].addShapeBox(3F, 5.5F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 398
		bodyModel[81].setRotationPoint(0F, 0F, 0F);

		bodyModel[82].addShapeBox(3F, 6.7F, 1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 399
		bodyModel[82].setRotationPoint(0F, 0F, 0F);

		bodyModel[83].addShapeBox(3F, 6.7F, 0.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 400
		bodyModel[83].setRotationPoint(0F, 0F, 0F);

		bodyModel[84].addShapeBox(3F, 6.7F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 401
		bodyModel[84].setRotationPoint(0F, 0F, 0F);

		bodyModel[85].addShapeBox(3F, 5.5F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 402
		bodyModel[85].setRotationPoint(0F, 0F, 0F);

		bodyModel[86].addShapeBox(3F, 5.5F, -1.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 403
		bodyModel[86].setRotationPoint(0F, 0F, 0F);

		bodyModel[87].addShapeBox(3F, 6.7F, -2.1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 404
		bodyModel[87].setRotationPoint(0F, 0F, 0F);

		bodyModel[88].addShapeBox(3F, -0.5F, -2.1F, 1, 3, 4, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, 0.9F, 0.3F, 1F, -1.1F, 0.7F, 1F, -1.1F, 0F, 0F, 0.9F, 0F, 0F); // Box 295
		bodyModel[88].setRotationPoint(0F, 0F, 0F);

		bodyModel[89].addShapeBox(-3F, 6.5F, -2.6F, 6, 3, 1, 0F,-0.9F, -0.1F, 0.4F, -0.9F, -0.1F, 0.4F, -0.9F, -0.1F, 0.4F, -0.9F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F); // Box 296
		bodyModel[89].setRotationPoint(0F, 0F, 0F);

		bodyModel[90].addShapeBox(-3.2F, 7.4F, -2.9F, 1, 6, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 297
		bodyModel[90].setRotationPoint(0F, 0F, 0F);

		bodyModel[91].addShapeBox(-3F, 13.3F, -2.9F, 6, 1, 1, 0F,0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F); // Box 298
		bodyModel[91].setRotationPoint(0F, 0F, 0F);

		bodyModel[92].addShapeBox(2.2F, 7.4F, -2.9F, 1, 6, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F); // Box 299
		bodyModel[92].setRotationPoint(0F, 0F, 0F);

		bodyModel[93].addShapeBox(-1.2F, 9.4F, -2.9F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 302
		bodyModel[93].setRotationPoint(0F, 0F, 0F);

		bodyModel[94].addShapeBox(-2.2F, 9.4F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 303
		bodyModel[94].setRotationPoint(0F, 0F, 0F);

		bodyModel[95].addShapeBox(-2.2F, 10.9F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 304
		bodyModel[95].setRotationPoint(0F, 0F, 0F);

		bodyModel[96].addShapeBox(-1.2F, 10.9F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 305
		bodyModel[96].setRotationPoint(0F, 0F, 0F);

		bodyModel[97].addShapeBox(-1.2F, 12.1F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 306
		bodyModel[97].setRotationPoint(0F, 0F, 0F);

		bodyModel[98].addShapeBox(-2.2F, 12.1F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 307
		bodyModel[98].setRotationPoint(0F, 0F, 0F);

		bodyModel[99].addShapeBox(1.2F, 9.4F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 322
		bodyModel[99].setRotationPoint(0F, 0F, 0F);

		bodyModel[100].addShapeBox(0.2F, 9.4F, -2.9F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 323
		bodyModel[100].setRotationPoint(0F, 0F, 0F);

		bodyModel[101].addShapeBox(0.2F, 10.9F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 324
		bodyModel[101].setRotationPoint(0F, 0F, 0F);

		bodyModel[102].addShapeBox(1.2F, 10.9F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 325
		bodyModel[102].setRotationPoint(0F, 0F, 0F);

		bodyModel[103].addShapeBox(1.2F, 12.1F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 326
		bodyModel[103].setRotationPoint(0F, 0F, 0F);

		bodyModel[104].addShapeBox(0.2F, 12.1F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 327
		bodyModel[104].setRotationPoint(0F, 0F, 0F);

		bodyModel[105].addShapeBox(-0.5F, 9.4F, -3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 341
		bodyModel[105].setRotationPoint(0F, 0F, 0F);

		bodyModel[106].addShapeBox(-0.5F, 10.9F, -2.9F, 1, 2, 1, 0F,0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 342
		bodyModel[106].setRotationPoint(0F, 0F, 0F);

		bodyModel[107].addShapeBox(-0.5F, 12.1F, -2.9F, 1, 2, 1, 0F,0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.4F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 343
		bodyModel[107].setRotationPoint(0F, 0F, 0F);

		bodyModel[108].addShapeBox(2F, 7.6F, -3.6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F); // Box 345
		bodyModel[108].setRotationPoint(0F, 0F, 0F);

		bodyModel[109].addShapeBox(2F, 9.4F, -3.6F, 1, 2, 1, 0F,0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 346
		bodyModel[109].setRotationPoint(0F, 0F, 0F);

		bodyModel[110].addShapeBox(3F, 7.6F, -3.6F, 1, 1, 1, 0F,0F, 0F, 0F, 1F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -0.1F, -1.2F, 0F, 0F, 0.7F, 0F, 0F, -0.3F); // Box 347
		bodyModel[110].setRotationPoint(0F, 0F, 0F);

		bodyModel[111].addShapeBox(3F, 9.4F, -3.6F, 1, 2, 1, 0F,0F, 0F, -0.3F, 0.5F, -0.1F, -1.2F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, 0F, 1F, 0F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, -0.3F); // Box 348
		bodyModel[111].setRotationPoint(0F, 0F, 0F);

		bodyModel[112].addShapeBox(-4F, 7.6F, -3.6F, 1, 1, 1, 0F,1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 0.5F, -0.1F, -1.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F); // Box 349
		bodyModel[112].setRotationPoint(0F, 0F, 0F);

		bodyModel[113].addShapeBox(-4F, 9.4F, -3.6F, 1, 2, 1, 0F,0.5F, -0.1F, -1.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.2F); // Box 350
		bodyModel[113].setRotationPoint(0F, 0F, 0F);

		bodyModel[114].addShapeBox(-3F, 7.6F, -3.6F, 1, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 351
		bodyModel[114].setRotationPoint(0F, 0F, 0F);

		bodyModel[115].addShapeBox(-3F, 9.4F, -3.6F, 1, 2, 1, 0F,0F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0.3F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 352
		bodyModel[115].setRotationPoint(0F, 0F, 0F);

		bodyModel[116].addShapeBox(3F, 7.6F, -2.4F, 1, 1, 5, 0F,0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.2F, 0F, 0F, -0.2F); // Box 353
		bodyModel[116].setRotationPoint(0F, 0F, 0F);

		bodyModel[117].addShapeBox(3F, 7.6F, 2.6F, 1, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0.2F, 1F, 0F, -1.2F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0.7F, 0.5F, -0.1F, -1.2F, 0F, 0F, -0.3F); // Box 354
		bodyModel[117].setRotationPoint(0F, 0F, 0F);

		bodyModel[118].addShapeBox(3F, 9.4F, 2.6F, 1, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0.7F, 0.5F, -0.1F, -1.2F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0.2F, 1F, 0F, -1.2F, 0F, 0F, 0F); // Box 355
		bodyModel[118].setRotationPoint(0F, 0F, 0F);

		bodyModel[119].addShapeBox(-4F, 8.5F, 2.4F, 8, 1, 1, 0F,0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -1.7F, 0F, 0F, -1.7F, 0F, 0F, 0.5F, 0F, -0.3F, 0.5F, 0F, -0.3F, -1.7F, 0F, 0F, -1.7F, 0F, 0F); // Box 356
		bodyModel[119].setRotationPoint(0F, 0F, 0F);

		bodyModel[120].addShapeBox(3F, 9.4F, -2.4F, 1, 2, 5, 0F,0F, 0F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, -0.2F, 0F, 0F, -0.2F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, -0.2F, 0F, 0F, -0.2F); // Box 357
		bodyModel[120].setRotationPoint(0F, 0F, 0F);

		bodyModel[121].addShapeBox(-3F, 9.4F, 2.6F, 6, 2, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 358
		bodyModel[121].setRotationPoint(0F, 0F, 0F);

		bodyModel[122].addShapeBox(-3F, 7.6F, 2.6F, 6, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 359
		bodyModel[122].setRotationPoint(0F, 0F, 0F);

		bodyModel[123].addShapeBox(-4F, 9.4F, -2.4F, 1, 2, 5, 0F,0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.5F, -0.1F, -0.2F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 1F, 0F, -0.2F); // Box 360
		bodyModel[123].setRotationPoint(0F, 0F, 0F);

		bodyModel[124].addShapeBox(-4F, 7.6F, -2.4F, 1, 1, 5, 0F,1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 1F, 0F, -0.2F, 0.5F, -0.1F, 0F, 0F, 0F, 0F, 0F, 0F, -0.2F, 0.5F, -0.1F, -0.2F); // Box 361
		bodyModel[124].setRotationPoint(0F, 0F, 0F);

		bodyModel[125].addShapeBox(-4F, 7.6F, 2.6F, 1, 1, 1, 0F,0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 1F, 0F, -1.2F, 0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -0.1F, -1.2F); // Box 362
		bodyModel[125].setRotationPoint(0F, 0F, 0F);

		bodyModel[126].addShapeBox(-4F, 9.4F, 2.6F, 1, 2, 1, 0F,0F, 0F, 0.7F, 0F, 0F, -0.3F, 0F, 0F, -0.3F, 0.5F, -0.1F, -1.2F, 0F, 0F, 0.2F, 0F, 0F, -0.3F, 0F, 0F, 0F, 1F, 0F, -1.2F); // Box 363
		bodyModel[126].setRotationPoint(0F, 0F, 0F);

		bodyModel[127].addShapeBox(-4F, 8.5F, -3.4F, 3, 1, 1, 0F,-0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F, -0.7F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0.5F, 0F, -0.3F); // Box 0
		bodyModel[127].setRotationPoint(0F, 0F, 0F);

		bodyModel[128].addShapeBox(1F, 8.5F, -3.4F, 3, 1, 1, 0F,0F, 0F, 0F, -0.7F, 0F, 0F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F, 0F, 0F, 0F, -0.7F, 0F, 0F, 0.5F, 0F, -0.3F, 0F, 0F, -0.3F); // Box 1
		bodyModel[128].setRotationPoint(0F, 0F, 0F);

		bodyModel[129].addShapeBox(-21.5F, -12.5F, -3.4F, 43, 43, 1, 0F,-20F, -20F, 0.4F, -20F, -20F, 0.4F, -20F, -20F, 0.4F, -20F, -20F, 0.4F, -20F, -20F, 0.2F, -20F, -20F, 0.2F, -20F, -20F, 0.2F, -20F, -20F, 0.2F); // Box 7
		bodyModel[129].setRotationPoint(0F, 0F, 0F);

		bodyModel[130].addShapeBox(-0.5F, 2.5F, -2.5F, 4, 1, 1, 0F,-0.3F, 0F, 0.4F, -0.3F, 0.5F, 0.4F, -0.3F, 0.5F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -1.1F, 0.4F, -0.3F, -1.1F, 0.4F, -0.3F, -0.6F, 0.4F); // Box 8
		bodyModel[130].setRotationPoint(0F, 0F, 0F);

		bodyModel[131].addShapeBox(-3.5F, 2.5F, -2.5F, 4, 1, 1, 0F,-0.3F, 0.5F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0.5F, 0.4F, -0.3F, -1.1F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -1.1F, 0.4F); // Box 9
		bodyModel[131].setRotationPoint(0F, 0F, 0F);

		bodyModel[132].addShapeBox(2.5F, 2.2F, -2.5F, 1, 4, 1, 0F,-0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -1F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, -1F, 0F, 0.4F); // Box 10
		bodyModel[132].setRotationPoint(0F, 0F, 0F);

		bodyModel[133].addShapeBox(-3.5F, 2.2F, -2.5F, 1, 4, 1, 0F,-0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, -0.3F, 0F, 0.4F, 0.4F, 0F, 0.4F, -1F, 0F, 0.4F, -1F, 0F, 0.4F, 0.4F, 0F, 0.4F); // Box 11
		bodyModel[133].setRotationPoint(0F, 0F, 0F);

		bodyModel[134].addShapeBox(-3.9F, 6.5F, -2.5F, 4, 1, 1, 0F,-0.3F, 0.5F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, 0.5F, 0.4F, -0.3F, -1.1F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -1.1F, 0.4F); // Box 12
		bodyModel[134].setRotationPoint(0F, 0F, 0F);

		bodyModel[135].addShapeBox(-0.1F, 6.5F, -2.5F, 4, 1, 1, 0F,-0.3F, 0.3F, 0.4F, -0.3F, 0.5F, 0.4F, -0.3F, 0.5F, 0.4F, -0.3F, 0.3F, 0.4F, -0.3F, -0.6F, 0.4F, -0.3F, -1.1F, 0.4F, -0.3F, -1.1F, 0.4F, -0.3F, -0.6F, 0.4F); // Box 13
		bodyModel[135].setRotationPoint(0F, 0F, 0F);

		bodyModel[136].addShapeBox(-3.5F, 2.7F, -2.5F, 4, 4, 1, 0F,-0.3F, 0.5F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, 0.5F, 0.3F, 0.1F, -0.5F, 0.3F, -0.3F, -0.3F, 0.3F, -0.3F, -0.3F, 0.3F, 0.1F, -0.5F, 0.3F); // Box 14
		bodyModel[136].setRotationPoint(0F, 0F, 0F);

		bodyModel[137].addShapeBox(-0.5F, 2.7F, -2.5F, 4, 4, 1, 0F,-0.3F, 0F, 0.3F, -0.3F, 0.5F, 0.3F, -0.3F, 0.5F, 0.3F, -0.3F, 0F, 0.3F, -0.3F, -0.3F, 0.3F, 0.1F, -0.5F, 0.3F, 0.1F, -0.5F, 0.3F, -0.3F, -0.3F, 0.3F); // Box 15
		bodyModel[137].setRotationPoint(0F, 0F, 0F);

		bodyModel[138].addShapeBox(2F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 16
		bodyModel[138].setRotationPoint(0F, 0F, 0F);

		bodyModel[139].addShapeBox(1F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 17
		bodyModel[139].setRotationPoint(0F, 0F, 0F);

		bodyModel[140].addShapeBox(0F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 18
		bodyModel[140].setRotationPoint(0F, 0F, 0F);

		bodyModel[141].addShapeBox(-1F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 19
		bodyModel[141].setRotationPoint(0F, 0F, 0F);

		bodyModel[142].addShapeBox(-2F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 20
		bodyModel[142].setRotationPoint(0F, 0F, 0F);

		bodyModel[143].addShapeBox(-3F, 1.1F, -2.1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 21
		bodyModel[143].setRotationPoint(0F, 0F, 0F);

		bodyModel[144].addShapeBox(-4F, -0.5F, -2.1F, 1, 3, 4, 0F,-0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -0.1F, 0F, 0.5F, -1.1F, 0.7F, 1F, 0.9F, 0.3F, 1F, 0.9F, 0F, 0F, -1.1F, 0F, 0F); // Box 23
		bodyModel[144].setRotationPoint(0F, 0F, 0F);

		bodyModel[145].addShapeBox(-3F, -1.6F, -1.9F, 1, 3, 3, 0F,0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F); // Box 31
		bodyModel[145].setRotationPoint(0F, 0F, 0F);

		bodyModel[146].addShapeBox(2F, -1.6F, -1.9F, 1, 3, 3, 0F,0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F, 0.1F, -0.1F, 0.4F); // Box 32
		bodyModel[146].setRotationPoint(0F, 0F, 0F);

		bodyModel[147].addShapeBox(-3.2F, 4F, -2.9F, 3, 1, 1, 0F,-0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 33
		bodyModel[147].setRotationPoint(0F, 0F, 0F);

		bodyModel[148].addShapeBox(-3.2F, 3.35F, -2.9F, 3, 1, 1, 0F,-1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F); // Box 34
		bodyModel[148].setRotationPoint(0F, 0F, 0F);

		bodyModel[149].addShapeBox(-3.2F, 4.65F, -2.9F, 3, 1, 1, 0F,-0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F); // Box 35
		bodyModel[149].setRotationPoint(0F, 0F, 0F);

		bodyModel[150].addShapeBox(0.2F, 3.35F, -2.9F, 3, 1, 1, 0F,-1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F); // Box 36
		bodyModel[150].setRotationPoint(0F, 0F, 0F);

		bodyModel[151].addShapeBox(0.2F, 4F, -2.9F, 3, 1, 1, 0F,-0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F, -0.4F, -0.2F, 0F); // Box 37
		bodyModel[151].setRotationPoint(0F, 0F, 0F);

		bodyModel[152].addShapeBox(0.2F, 4.65F, -2.9F, 3, 1, 1, 0F,-0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -0.4F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F, -1.2F, -0.15F, 0F); // Box 38
		bodyModel[152].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftArmModel_1()
	{
		leftArmModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 73
		leftArmModel[1] = new ModelRendererTurbo(this, 3, 65, textureX, textureY); // Box 74
		leftArmModel[2] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 75
		leftArmModel[3] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 76
		leftArmModel[4] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 77
		leftArmModel[5] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 78
		leftArmModel[6] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 79
		leftArmModel[7] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 80
		leftArmModel[8] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 81
		leftArmModel[9] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 82
		leftArmModel[10] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 83
		leftArmModel[11] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 84
		leftArmModel[12] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 85
		leftArmModel[13] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 86
		leftArmModel[14] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 87
		leftArmModel[15] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 88
		leftArmModel[16] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 89
		leftArmModel[17] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 90
		leftArmModel[18] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 91
		leftArmModel[19] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 92
		leftArmModel[20] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 93
		leftArmModel[21] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 94
		leftArmModel[22] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 95
		leftArmModel[23] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 96
		leftArmModel[24] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 97
		leftArmModel[25] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 98
		leftArmModel[26] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 99
		leftArmModel[27] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 100
		leftArmModel[28] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 101
		leftArmModel[29] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 102
		leftArmModel[30] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 103
		leftArmModel[31] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 104
		leftArmModel[32] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 105
		leftArmModel[33] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 106
		leftArmModel[34] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 107
		leftArmModel[35] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 108
		leftArmModel[36] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 109
		leftArmModel[37] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 110
		leftArmModel[38] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 111
		leftArmModel[39] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 112
		leftArmModel[40] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 113
		leftArmModel[41] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 114
		leftArmModel[42] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 115
		leftArmModel[43] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 116

		leftArmModel[0].addShapeBox(-1F, 5.5F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 73
		leftArmModel[0].setRotationPoint(0F, 0F, 0F);

		leftArmModel[1].addShapeBox(-1F, 2.5F, -2F, 4, 2, 4, 0F,0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F); // Box 74
		leftArmModel[1].setRotationPoint(0F, 0F, 0F);

		leftArmModel[2].addShapeBox(-1.2F, -2.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 75
		leftArmModel[2].setRotationPoint(0F, 0F, 0F);

		leftArmModel[3].addShapeBox(-1.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 76
		leftArmModel[3].setRotationPoint(0F, 0F, 0F);

		leftArmModel[4].addShapeBox(-1.2F, 0.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 77
		leftArmModel[4].setRotationPoint(0F, 0F, 0F);

		leftArmModel[5].addShapeBox(-0.199999999999999F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 78
		leftArmModel[5].setRotationPoint(0F, 0F, 0F);

		leftArmModel[6].addShapeBox(-0.199999999999999F, 0.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 79
		leftArmModel[6].setRotationPoint(0F, 0F, 0F);

		leftArmModel[7].addShapeBox(0.800000000000001F, 0.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 80
		leftArmModel[7].setRotationPoint(0F, 0F, 0F);

		leftArmModel[8].addShapeBox(0.800000000000001F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 81
		leftArmModel[8].setRotationPoint(0F, 0F, 0F);

		leftArmModel[9].addShapeBox(0.800000000000001F, -2.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 82
		leftArmModel[9].setRotationPoint(0F, 0F, 0F);

		leftArmModel[10].addShapeBox(-0.199999999999999F, -2.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 83
		leftArmModel[10].setRotationPoint(0F, 0F, 0F);

		leftArmModel[11].addShapeBox(2.4F, -2.2F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 84
		leftArmModel[11].setRotationPoint(0F, 0F, 0F);

		leftArmModel[12].addShapeBox(2.4F, -2.2F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 85
		leftArmModel[12].setRotationPoint(0F, 0F, 0F);

		leftArmModel[13].addShapeBox(2.4F, -2.2F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 86
		leftArmModel[13].setRotationPoint(0F, 0F, 0F);

		leftArmModel[14].addShapeBox(2.4F, -2.2F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 87
		leftArmModel[14].setRotationPoint(0F, 0F, 0F);

		leftArmModel[15].addShapeBox(2.3F, -0.7F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 88
		leftArmModel[15].setRotationPoint(0F, 0F, 0F);

		leftArmModel[16].addShapeBox(2.3F, -0.7F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 89
		leftArmModel[16].setRotationPoint(0F, 0F, 0F);

		leftArmModel[17].addShapeBox(2.3F, -0.7F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 90
		leftArmModel[17].setRotationPoint(0F, 0F, 0F);

		leftArmModel[18].addShapeBox(2.3F, -0.7F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 91
		leftArmModel[18].setRotationPoint(0F, 0F, 0F);

		leftArmModel[19].addShapeBox(2.2F, 0.8F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 92
		leftArmModel[19].setRotationPoint(0F, 0F, 0F);

		leftArmModel[20].addShapeBox(2.2F, 0.8F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 93
		leftArmModel[20].setRotationPoint(0F, 0F, 0F);

		leftArmModel[21].addShapeBox(2.2F, 0.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 94
		leftArmModel[21].setRotationPoint(0F, 0F, 0F);

		leftArmModel[22].addShapeBox(2.2F, 0.8F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 95
		leftArmModel[22].setRotationPoint(0F, 0F, 0F);

		leftArmModel[23].addShapeBox(-1.2F, -2.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 96
		leftArmModel[23].setRotationPoint(0F, 0F, 0F);

		leftArmModel[24].addShapeBox(-1.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 97
		leftArmModel[24].setRotationPoint(0F, 0F, 0F);

		leftArmModel[25].addShapeBox(-1.2F, 0.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 98
		leftArmModel[25].setRotationPoint(0F, 0F, 0F);

		leftArmModel[26].addShapeBox(-0.199999999999999F, 0.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 99
		leftArmModel[26].setRotationPoint(0F, 0F, 0F);

		leftArmModel[27].addShapeBox(-0.199999999999999F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 100
		leftArmModel[27].setRotationPoint(0F, 0F, 0F);

		leftArmModel[28].addShapeBox(-0.199999999999999F, -2.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 101
		leftArmModel[28].setRotationPoint(0F, 0F, 0F);

		leftArmModel[29].addShapeBox(0.800000000000001F, -2.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 102
		leftArmModel[29].setRotationPoint(0F, 0F, 0F);

		leftArmModel[30].addShapeBox(0.800000000000001F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 103
		leftArmModel[30].setRotationPoint(0F, 0F, 0F);

		leftArmModel[31].addShapeBox(0.8F, 0.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 104
		leftArmModel[31].setRotationPoint(0F, 0F, 0F);

		leftArmModel[32].addShapeBox(1.8F, -2.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 105
		leftArmModel[32].setRotationPoint(0F, 0F, 0F);

		leftArmModel[33].addShapeBox(1.8F, 0.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 106
		leftArmModel[33].setRotationPoint(0F, 0F, 0F);

		leftArmModel[34].addShapeBox(1.8F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 107
		leftArmModel[34].setRotationPoint(0F, 0F, 0F);

		leftArmModel[35].addShapeBox(1.8F, 0.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 108
		leftArmModel[35].setRotationPoint(0F, 0F, 0F);

		leftArmModel[36].addShapeBox(1.8F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 109
		leftArmModel[36].setRotationPoint(0F, 0F, 0F);

		leftArmModel[37].addShapeBox(1.8F, -2.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 110
		leftArmModel[37].setRotationPoint(0F, 0F, 0F);

		leftArmModel[38].addShapeBox(-1.5F, -2F, -3F, 1, 5, 6, 0F,-0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F); // Box 111
		leftArmModel[38].setRotationPoint(0F, 0F, 0F);

		leftArmModel[39].addShapeBox(-1F, 2.3F, -3F, 5, 1, 6, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 112
		leftArmModel[39].setRotationPoint(0F, 0F, 0F);

		leftArmModel[40].addShapeBox(-1F, 4.7F, -2F, 4, 1, 4, 0F,0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F); // Box 113
		leftArmModel[40].setRotationPoint(0F, 0F, 0F);

		leftArmModel[41].addShapeBox(-1.5F, -2.2F, -3.5F, 2, 2, 7, 0F,0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.5F, 0F); // Box 114
		leftArmModel[41].setRotationPoint(0F, 0F, 0F);

		leftArmModel[42].addShapeBox(0.5F, -2.2F, -3.5F, 3, 2, 7, 0F,0F, 0.5F, 0.3F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, 0F, -0.1F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.3F); // Box 115
		leftArmModel[42].setRotationPoint(0F, 0F, 0F);

		leftArmModel[43].addShapeBox(3.5F, -2.2F, -3.5F, 1, 3, 7, 0F,0F, 0.7F, 0F, 0F, -1.3F, -0.5F, 0F, -1.3F, -0.5F, 0F, 0.7F, 0F, 0F, -1.1F, 0F, -0.4F, -0.5F, -0.8F, -0.4F, -0.5F, -0.8F, 0F, -1.1F, 0F); // Box 116
		leftArmModel[43].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightArmModel_1()
	{
		rightArmModel[0] = new ModelRendererTurbo(this, 129, 1, textureX, textureY); // Box 2
		rightArmModel[1] = new ModelRendererTurbo(this, 3, 65, textureX, textureY); // Box 20
		rightArmModel[2] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 412
		rightArmModel[3] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 413
		rightArmModel[4] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 414
		rightArmModel[5] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 415
		rightArmModel[6] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 416
		rightArmModel[7] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 419
		rightArmModel[8] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 420
		rightArmModel[9] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 421
		rightArmModel[10] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 422
		rightArmModel[11] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 423
		rightArmModel[12] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 424
		rightArmModel[13] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 425
		rightArmModel[14] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 426
		rightArmModel[15] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 427
		rightArmModel[16] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 428
		rightArmModel[17] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 429
		rightArmModel[18] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 430
		rightArmModel[19] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 431
		rightArmModel[20] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 432
		rightArmModel[21] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 433
		rightArmModel[22] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 434
		rightArmModel[23] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 440
		rightArmModel[24] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 441
		rightArmModel[25] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 442
		rightArmModel[26] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 443
		rightArmModel[27] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 444
		rightArmModel[28] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 445
		rightArmModel[29] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 446
		rightArmModel[30] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 447
		rightArmModel[31] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 448
		rightArmModel[32] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 24
		rightArmModel[33] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 25
		rightArmModel[34] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 26
		rightArmModel[35] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 27
		rightArmModel[36] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 28
		rightArmModel[37] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 29
		rightArmModel[38] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 30
		rightArmModel[39] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 39
		rightArmModel[40] = new ModelRendererTurbo(this, 233, 9, textureX, textureY); // Box 40
		rightArmModel[41] = new ModelRendererTurbo(this, 25, 25, textureX, textureY); // Box 48
		rightArmModel[42] = new ModelRendererTurbo(this, 225, 25, textureX, textureY); // Box 49
		rightArmModel[43] = new ModelRendererTurbo(this, 225, 41, textureX, textureY); // Box 50

		rightArmModel[0].addShapeBox(-3F, 5.5F, -2F, 4, 4, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F, 0.15F, -0.5F, 0.15F); // Box 2
		rightArmModel[0].setRotationPoint(0F, 0F, 0F);

		rightArmModel[1].addShapeBox(-3F, 2.5F, -2F, 4, 2, 4, 0F,0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.4F, 0.1F, 0.4F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F); // Box 20
		rightArmModel[1].setRotationPoint(0F, 0F, 0F);

		rightArmModel[2].addShapeBox(-3.2F, -2.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 412
		rightArmModel[2].setRotationPoint(0F, 0F, 0F);

		rightArmModel[3].addShapeBox(-3.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 413
		rightArmModel[3].setRotationPoint(0F, 0F, 0F);

		rightArmModel[4].addShapeBox(-3.2F, 0.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 414
		rightArmModel[4].setRotationPoint(0F, 0F, 0F);

		rightArmModel[5].addShapeBox(-2.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 415
		rightArmModel[5].setRotationPoint(0F, 0F, 0F);

		rightArmModel[6].addShapeBox(-2.2F, 0.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 416
		rightArmModel[6].setRotationPoint(0F, 0F, 0F);

		rightArmModel[7].addShapeBox(-1.2F, 0.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 419
		rightArmModel[7].setRotationPoint(0F, 0F, 0F);

		rightArmModel[8].addShapeBox(-1.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 420
		rightArmModel[8].setRotationPoint(0F, 0F, 0F);

		rightArmModel[9].addShapeBox(-1.2F, -2.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 421
		rightArmModel[9].setRotationPoint(0F, 0F, 0F);

		rightArmModel[10].addShapeBox(-2.2F, -2.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 422
		rightArmModel[10].setRotationPoint(0F, 0F, 0F);

		rightArmModel[11].addShapeBox(-3.4F, -2.2F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 423
		rightArmModel[11].setRotationPoint(0F, 0F, 0F);

		rightArmModel[12].addShapeBox(-3.4F, -2.2F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 424
		rightArmModel[12].setRotationPoint(0F, 0F, 0F);

		rightArmModel[13].addShapeBox(-3.4F, -2.2F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 425
		rightArmModel[13].setRotationPoint(0F, 0F, 0F);

		rightArmModel[14].addShapeBox(-3.4F, -2.2F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 426
		rightArmModel[14].setRotationPoint(0F, 0F, 0F);

		rightArmModel[15].addShapeBox(-3.5F, -0.7F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 427
		rightArmModel[15].setRotationPoint(0F, 0F, 0F);

		rightArmModel[16].addShapeBox(-3.5F, -0.7F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 428
		rightArmModel[16].setRotationPoint(0F, 0F, 0F);

		rightArmModel[17].addShapeBox(-3.5F, -0.7F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 429
		rightArmModel[17].setRotationPoint(0F, 0F, 0F);

		rightArmModel[18].addShapeBox(-3.5F, -0.7F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 430
		rightArmModel[18].setRotationPoint(0F, 0F, 0F);

		rightArmModel[19].addShapeBox(-3.6F, 0.8F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 431
		rightArmModel[19].setRotationPoint(0F, 0F, 0F);

		rightArmModel[20].addShapeBox(-3.6F, 0.8F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 432
		rightArmModel[20].setRotationPoint(0F, 0F, 0F);

		rightArmModel[21].addShapeBox(-3.6F, 0.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 433
		rightArmModel[21].setRotationPoint(0F, 0F, 0F);

		rightArmModel[22].addShapeBox(-3.6F, 0.8F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 434
		rightArmModel[22].setRotationPoint(0F, 0F, 0F);

		rightArmModel[23].addShapeBox(-3.2F, -2.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 440
		rightArmModel[23].setRotationPoint(0F, 0F, 0F);

		rightArmModel[24].addShapeBox(-3.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 441
		rightArmModel[24].setRotationPoint(0F, 0F, 0F);

		rightArmModel[25].addShapeBox(-3.2F, 0.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 442
		rightArmModel[25].setRotationPoint(0F, 0F, 0F);

		rightArmModel[26].addShapeBox(-2.2F, 0.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 443
		rightArmModel[26].setRotationPoint(0F, 0F, 0F);

		rightArmModel[27].addShapeBox(-2.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 444
		rightArmModel[27].setRotationPoint(0F, 0F, 0F);

		rightArmModel[28].addShapeBox(-2.2F, -2.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 445
		rightArmModel[28].setRotationPoint(0F, 0F, 0F);

		rightArmModel[29].addShapeBox(-1.2F, -2.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 446
		rightArmModel[29].setRotationPoint(0F, 0F, 0F);

		rightArmModel[30].addShapeBox(-1.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 447
		rightArmModel[30].setRotationPoint(0F, 0F, 0F);

		rightArmModel[31].addShapeBox(-1.2F, 0.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 448
		rightArmModel[31].setRotationPoint(0F, 0F, 0F);

		rightArmModel[32].addShapeBox(-0.2F, -2.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 24
		rightArmModel[32].setRotationPoint(0F, 0F, 0F);

		rightArmModel[33].addShapeBox(-0.2F, 0.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 25
		rightArmModel[33].setRotationPoint(0F, 0F, 0F);

		rightArmModel[34].addShapeBox(-0.2F, -0.7F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 26
		rightArmModel[34].setRotationPoint(0F, 0F, 0F);

		rightArmModel[35].addShapeBox(-0.2F, 0.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 27
		rightArmModel[35].setRotationPoint(0F, 0F, 0F);

		rightArmModel[36].addShapeBox(-0.2F, -0.7F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 28
		rightArmModel[36].setRotationPoint(0F, 0F, 0F);

		rightArmModel[37].addShapeBox(-0.2F, -2.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 29
		rightArmModel[37].setRotationPoint(0F, 0F, 0F);

		rightArmModel[38].addShapeBox(0.5F, -2F, -3F, 1, 5, 6, 0F,-0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.1F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F, -0.1F, 0.2F, 0.1F); // Box 30
		rightArmModel[38].setRotationPoint(0F, 0F, 0F);

		rightArmModel[39].addShapeBox(-4F, 2.3F, -3F, 5, 1, 6, 0F,-0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F, -0.1F); // Box 39
		rightArmModel[39].setRotationPoint(0F, 0F, 0F);

		rightArmModel[40].addShapeBox(-3F, 4.7F, -2F, 4, 1, 4, 0F,0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.7F, 0.1F, 0.7F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F, 0.3F, 0.1F, 0.3F); // Box 40
		rightArmModel[40].setRotationPoint(0F, 0F, 0F);

		rightArmModel[41].addShapeBox(-0.5F, -2.2F, -3.5F, 2, 2, 7, 0F,0F, 0.5F, 0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0.5F, 0.3F, 0F, 0F, 0.3F, -0.5F, -0.5F, 0F, -0.5F, -0.5F, 0F, 0F, 0F, 0.3F); // Box 48
		rightArmModel[41].setRotationPoint(0F, 0F, 0F);

		rightArmModel[42].addShapeBox(-3.5F, -2.2F, -3.5F, 3, 2, 7, 0F,0F, 0.7F, 0F, 0F, 0.5F, 0.3F, 0F, 0.5F, 0.3F, 0F, 0.7F, 0F, 0F, -0.1F, 0F, 0F, 0F, 0.3F, 0F, 0F, 0.3F, 0F, -0.1F, 0F); // Box 49
		rightArmModel[42].setRotationPoint(0F, 0F, 0F);

		rightArmModel[43].addShapeBox(-4.5F, -2.2F, -3.5F, 1, 3, 7, 0F,0F, -1.3F, -0.5F, 0F, 0.7F, 0F, 0F, 0.7F, 0F, 0F, -1.3F, -0.5F, -0.4F, -0.5F, -0.8F, 0F, -1.1F, 0F, 0F, -1.1F, 0F, -0.4F, -0.5F, -0.8F); // Box 50
		rightArmModel[43].setRotationPoint(0F, 0F, 0F);
	}

	private void initleftLegModel_1()
	{
		leftLegModel[0] = new ModelRendererTurbo(this, 25, 41, textureX, textureY); // Box 300
		leftLegModel[1] = new ModelRendererTurbo(this, 65, 33, textureX, textureY); // Box 302
		leftLegModel[2] = new ModelRendererTurbo(this, 33, 41, textureX, textureY); // Box 303
		leftLegModel[3] = new ModelRendererTurbo(this, 65, 41, textureX, textureY); // Box 306
		leftLegModel[4] = new ModelRendererTurbo(this, 89, 41, textureX, textureY); // Box 308
		leftLegModel[5] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 487
		leftLegModel[6] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 488
		leftLegModel[7] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 493
		leftLegModel[8] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 494
		leftLegModel[9] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 495
		leftLegModel[10] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 496
		leftLegModel[11] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 499
		leftLegModel[12] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 500
		leftLegModel[13] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 501
		leftLegModel[14] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 502
		leftLegModel[15] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 503
		leftLegModel[16] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 504
		leftLegModel[17] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 505
		leftLegModel[18] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 506
		leftLegModel[19] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 507
		leftLegModel[20] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 508
		leftLegModel[21] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 509
		leftLegModel[22] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 510
		leftLegModel[23] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 519
		leftLegModel[24] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 520
		leftLegModel[25] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 521
		leftLegModel[26] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 522
		leftLegModel[27] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 523
		leftLegModel[28] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 524
		leftLegModel[29] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 525
		leftLegModel[30] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 526
		leftLegModel[31] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 527
		leftLegModel[32] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 528
		leftLegModel[33] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 529
		leftLegModel[34] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 530
		leftLegModel[35] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 531
		leftLegModel[36] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 532
		leftLegModel[37] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 533
		leftLegModel[38] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 534
		leftLegModel[39] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 535
		leftLegModel[40] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 536
		leftLegModel[41] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 541
		leftLegModel[42] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 542
		leftLegModel[43] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 543
		leftLegModel[44] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 544
		leftLegModel[45] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 545
		leftLegModel[46] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 546
		leftLegModel[47] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 547
		leftLegModel[48] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 548
		leftLegModel[49] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 549
		leftLegModel[50] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 550
		leftLegModel[51] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 551
		leftLegModel[52] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 552
		leftLegModel[53] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 553
		leftLegModel[54] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 554
		leftLegModel[55] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 555
		leftLegModel[56] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 556
		leftLegModel[57] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 557
		leftLegModel[58] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 558
		leftLegModel[59] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 559
		leftLegModel[60] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 560
		leftLegModel[61] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 561
		leftLegModel[62] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 562
		leftLegModel[63] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 563
		leftLegModel[64] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 564
		leftLegModel[65] = new ModelRendererTurbo(this, 9, 25, textureX, textureY); // Box 53
		leftLegModel[66] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 54
		leftLegModel[67] = new ModelRendererTurbo(this, 249, 9, textureX, textureY); // Box 57
		leftLegModel[68] = new ModelRendererTurbo(this, 73, 25, textureX, textureY); // Box 60
		leftLegModel[69] = new ModelRendererTurbo(this, 0, 41, textureX, textureY); // Box 61
		leftLegModel[70] = new ModelRendererTurbo(this, 241, 17, textureX, textureY); // Box 64
		leftLegModel[71] = new ModelRendererTurbo(this, 97, 33, textureX, textureY); // Box 65
		leftLegModel[72] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 68
		leftLegModel[73] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 69
		leftLegModel[74] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 70
		leftLegModel[75] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 71
		leftLegModel[76] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 72

		leftLegModel[0].addShapeBox(-2.3F, -2.5F, -2.3F, 1, 9, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F); // Box 300
		leftLegModel[0].setRotationPoint(0F, 0F, 0F);

		leftLegModel[1].addShapeBox(-1.8F, 6F, -3.7F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 302
		leftLegModel[1].setRotationPoint(0F, 0F, 0F);

		leftLegModel[2].addShapeBox(-2.3F, -2.5F, 3.3F, 1, 9, 1, 0F,-0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F); // Box 303
		leftLegModel[2].setRotationPoint(0F, 0F, 0F);

		leftLegModel[3].addShapeBox(-1.8F, 6F, 2.7F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F); // Box 306
		leftLegModel[3].setRotationPoint(0F, 0F, 0F);

		leftLegModel[4].addShapeBox(2.5F, 6F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 308
		leftLegModel[4].setRotationPoint(0F, 0F, 0F);

		leftLegModel[5].addShapeBox(1.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 487
		leftLegModel[5].setRotationPoint(0F, 0F, 0F);

		leftLegModel[6].addShapeBox(0.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 488
		leftLegModel[6].setRotationPoint(0F, 0F, 0F);

		leftLegModel[7].addShapeBox(0.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 493
		leftLegModel[7].setRotationPoint(0F, 0F, 0F);

		leftLegModel[8].addShapeBox(1.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 494
		leftLegModel[8].setRotationPoint(0F, 0F, 0F);

		leftLegModel[9].addShapeBox(1.4F, 0.300000000000001F, -2.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 495
		leftLegModel[9].setRotationPoint(0F, 0F, 0F);

		leftLegModel[10].addShapeBox(0.4F, 0.300000000000001F, -2.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 496
		leftLegModel[10].setRotationPoint(0F, 0F, 0F);

		leftLegModel[11].addShapeBox(-1.6F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 499
		leftLegModel[11].setRotationPoint(0F, 0F, 0F);

		leftLegModel[12].addShapeBox(-0.6F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 500
		leftLegModel[12].setRotationPoint(0F, 0F, 0F);

		leftLegModel[13].addShapeBox(0.4F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 501
		leftLegModel[13].setRotationPoint(0F, 0F, 0F);

		leftLegModel[14].addShapeBox(1.4F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 502
		leftLegModel[14].setRotationPoint(0F, 0F, 0F);

		leftLegModel[15].addShapeBox(1.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 503
		leftLegModel[15].setRotationPoint(0F, 0F, 0F);

		leftLegModel[16].addShapeBox(-0.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 504
		leftLegModel[16].setRotationPoint(0F, 0F, 0F);

		leftLegModel[17].addShapeBox(0.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 505
		leftLegModel[17].setRotationPoint(0F, 0F, 0F);

		leftLegModel[18].addShapeBox(-1.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 506
		leftLegModel[18].setRotationPoint(0F, 0F, 0F);

		leftLegModel[19].addShapeBox(-1.4F, 4.3F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 507
		leftLegModel[19].setRotationPoint(0F, 0F, 0F);

		leftLegModel[20].addShapeBox(-0.4F, 4.3F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 508
		leftLegModel[20].setRotationPoint(0F, 0F, 0F);

		leftLegModel[21].addShapeBox(0.6F, 4.3F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 509
		leftLegModel[21].setRotationPoint(0F, 0F, 0F);

		leftLegModel[22].addShapeBox(1.6F, 4.3F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 510
		leftLegModel[22].setRotationPoint(0F, 0F, 0F);

		leftLegModel[23].addShapeBox(1.3F, -1.2F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 519
		leftLegModel[23].setRotationPoint(0F, 0F, 0F);

		leftLegModel[24].addShapeBox(1.3F, -1.2F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 520
		leftLegModel[24].setRotationPoint(0F, 0F, 0F);

		leftLegModel[25].addShapeBox(1.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 521
		leftLegModel[25].setRotationPoint(0F, 0F, 0F);

		leftLegModel[26].addShapeBox(1.5F, 0.300000000000001F, -1.7F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 522
		leftLegModel[26].setRotationPoint(0F, 0F, 0F);

		leftLegModel[27].addShapeBox(1.5F, 0.300000000000001F, -0.7F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 523
		leftLegModel[27].setRotationPoint(0F, 0F, 0F);

		leftLegModel[28].addShapeBox(1.5F, 0.300000000000001F, 0.5F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 524
		leftLegModel[28].setRotationPoint(0F, 0F, 0F);

		leftLegModel[29].addShapeBox(1.6F, 1.8F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 525
		leftLegModel[29].setRotationPoint(0F, 0F, 0F);

		leftLegModel[30].addShapeBox(1.6F, 1.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 526
		leftLegModel[30].setRotationPoint(0F, 0F, 0F);

		leftLegModel[31].addShapeBox(1.6F, 1.8F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 527
		leftLegModel[31].setRotationPoint(0F, 0F, 0F);

		leftLegModel[32].addShapeBox(1.6F, 1.8F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 528
		leftLegModel[32].setRotationPoint(0F, 0F, 0F);

		leftLegModel[33].addShapeBox(1.8F, 2.8F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 529
		leftLegModel[33].setRotationPoint(0F, 0F, 0F);

		leftLegModel[34].addShapeBox(1.8F, 2.8F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 530
		leftLegModel[34].setRotationPoint(0F, 0F, 0F);

		leftLegModel[35].addShapeBox(1.8F, 2.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 531
		leftLegModel[35].setRotationPoint(0F, 0F, 0F);

		leftLegModel[36].addShapeBox(1.8F, 2.8F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 532
		leftLegModel[36].setRotationPoint(0F, 0F, 0F);

		leftLegModel[37].addShapeBox(1.9F, 4.3F, 1F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 533
		leftLegModel[37].setRotationPoint(0F, 0F, 0F);

		leftLegModel[38].addShapeBox(1.9F, 4.3F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 534
		leftLegModel[38].setRotationPoint(0F, 0F, 0F);

		leftLegModel[39].addShapeBox(1.9F, 4.3F, -1.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 535
		leftLegModel[39].setRotationPoint(0F, 0F, 0F);

		leftLegModel[40].addShapeBox(1.9F, 4.3F, -2.2F, 1, 2, 1, 0F,0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F); // Box 536
		leftLegModel[40].setRotationPoint(0F, 0F, 0F);

		leftLegModel[41].addShapeBox(1.2F, -2.7F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 541
		leftLegModel[41].setRotationPoint(0F, 0F, 0F);

		leftLegModel[42].addShapeBox(0.2F, -2.7F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 542
		leftLegModel[42].setRotationPoint(0F, 0F, 0F);

		leftLegModel[43].addShapeBox(-0.8F, -2.7F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 543
		leftLegModel[43].setRotationPoint(0F, 0F, 0F);

		leftLegModel[44].addShapeBox(-1.8F, -2.7F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 544
		leftLegModel[44].setRotationPoint(0F, 0F, 0F);

		leftLegModel[45].addShapeBox(-1.7F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 545
		leftLegModel[45].setRotationPoint(0F, 0F, 0F);

		leftLegModel[46].addShapeBox(-0.7F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 546
		leftLegModel[46].setRotationPoint(0F, 0F, 0F);

		leftLegModel[47].addShapeBox(0.3F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 547
		leftLegModel[47].setRotationPoint(0F, 0F, 0F);

		leftLegModel[48].addShapeBox(1.3F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 548
		leftLegModel[48].setRotationPoint(0F, 0F, 0F);

		leftLegModel[49].addShapeBox(1.4F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 549
		leftLegModel[49].setRotationPoint(0F, 0F, 0F);

		leftLegModel[50].addShapeBox(0.4F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 550
		leftLegModel[50].setRotationPoint(0F, 0F, 0F);

		leftLegModel[51].addShapeBox(-0.6F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 551
		leftLegModel[51].setRotationPoint(0F, 0F, 0F);

		leftLegModel[52].addShapeBox(-1.6F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 552
		leftLegModel[52].setRotationPoint(0F, 0F, 0F);

		leftLegModel[53].addShapeBox(-1.6F, 1.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 553
		leftLegModel[53].setRotationPoint(0F, 0F, 0F);

		leftLegModel[54].addShapeBox(-0.6F, 1.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 554
		leftLegModel[54].setRotationPoint(0F, 0F, 0F);

		leftLegModel[55].addShapeBox(0.4F, 1.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 555
		leftLegModel[55].setRotationPoint(0F, 0F, 0F);

		leftLegModel[56].addShapeBox(1.4F, 1.8F, 1.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 556
		leftLegModel[56].setRotationPoint(0F, 0F, 0F);

		leftLegModel[57].addShapeBox(1.5F, 2.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 557
		leftLegModel[57].setRotationPoint(0F, 0F, 0F);

		leftLegModel[58].addShapeBox(-0.5F, 2.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 558
		leftLegModel[58].setRotationPoint(0F, 0F, 0F);

		leftLegModel[59].addShapeBox(0.5F, 2.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 559
		leftLegModel[59].setRotationPoint(0F, 0F, 0F);

		leftLegModel[60].addShapeBox(-1.5F, 2.8F, 1.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 560
		leftLegModel[60].setRotationPoint(0F, 0F, 0F);

		leftLegModel[61].addShapeBox(-1.4F, 4.3F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 561
		leftLegModel[61].setRotationPoint(0F, 0F, 0F);

		leftLegModel[62].addShapeBox(-0.4F, 4.3F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 562
		leftLegModel[62].setRotationPoint(0F, 0F, 0F);

		leftLegModel[63].addShapeBox(0.6F, 4.3F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 563
		leftLegModel[63].setRotationPoint(0F, 0F, 0F);

		leftLegModel[64].addShapeBox(1.6F, 4.3F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F); // Box 564
		leftLegModel[64].setRotationPoint(0F, 0F, 0F);

		leftLegModel[65].addShapeBox(-2.3F, -2.6F, -2.1F, 2, 9, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F); // Box 53
		leftLegModel[65].setRotationPoint(0F, 0F, 0F);

		leftLegModel[66].addShapeBox(-2.3F, -2.6F, 3.15F, 2, 9, 1, 0F,-0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F); // Box 54
		leftLegModel[66].setRotationPoint(0F, 0F, 0F);

		leftLegModel[67].addShapeBox(-1F, 4.4F, -2.1F, 2, 2, 1, 0F,-0.1F, 0.5F, 1.13F, -0.1F, 0F, 1.2F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F); // Box 57
		leftLegModel[67].setRotationPoint(0F, 0F, 0F);

		leftLegModel[68].addShapeBox(2.4F, 5F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 60
		leftLegModel[68].setRotationPoint(0F, 0F, 0F);

		leftLegModel[69].addShapeBox(0.5F, 5.4F, -2.1F, 3, 1, 1, 0F,-0.1F, 0.5F, 1.3F, -0.4F, 0.5F, 1.1F, -0.4F, 0.5F, -0.6F, -0.1F, 0.5F, -0.6F, -0.1F, 0F, 1.4F, -0.4F, 0F, 1.2F, -0.4F, 0F, -1.6F, -0.1F, 0F, -1.6F); // Box 61
		leftLegModel[69].setRotationPoint(0F, 0F, 0F);

		leftLegModel[70].addShapeBox(-1F, 4.4F, 1.12F, 2, 2, 1, 0F,-0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 1.2F, -0.1F, 0.5F, 1.13F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F); // Box 64
		leftLegModel[70].setRotationPoint(0F, 0F, 0F);

		leftLegModel[71].addShapeBox(0.5F, 5.4F, 1.12F, 3, 1, 1, 0F,-0.1F, 0.5F, -0.6F, -0.4F, 0.5F, -0.6F, -0.4F, 0.5F, 1.1F, -0.1F, 0.5F, 1.3F, -0.1F, 0F, -1.6F, -0.4F, 0F, -1.6F, -0.4F, 0F, 1.2F, -0.1F, 0F, 1.4F); // Box 65
		leftLegModel[71].setRotationPoint(0F, 0F, 0F);

		leftLegModel[72].addShapeBox(-2F, 3F, -2F, 4, 5, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F); // Box 68
		leftLegModel[72].setRotationPoint(0F, 0F, 0F);

		leftLegModel[73].addShapeBox(-2F, 7F, -2F, 4, 3, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 69
		leftLegModel[73].setRotationPoint(0F, 0F, 0F);

		leftLegModel[74].addShapeBox(-2F, 8.1F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 70
		leftLegModel[74].setRotationPoint(0F, 0F, 0F);

		leftLegModel[75].addShapeBox(-2F, 10.1F, -3F, 4, 2, 5, 0F,0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 71
		leftLegModel[75].setRotationPoint(0F, 0F, 0F);

		leftLegModel[76].addShapeBox(-2F, 10.1F, -3.4F, 4, 2, 1, 0F,0.1F, -0.8F, 0.1F, 0.1F, -0.8F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 72
		leftLegModel[76].setRotationPoint(0F, 0F, 0F);
	}

	private void initrightLegModel_1()
	{
		rightLegModel[0] = new ModelRendererTurbo(this, 153, 1, textureX, textureY); // Box 22
		rightLegModel[1] = new ModelRendererTurbo(this, 17, 41, textureX, textureY); // Box 299
		rightLegModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 301
		rightLegModel[3] = new ModelRendererTurbo(this, 41, 41, textureX, textureY); // Box 304
		rightLegModel[4] = new ModelRendererTurbo(this, 49, 41, textureX, textureY); // Box 305
		rightLegModel[5] = new ModelRendererTurbo(this, 73, 41, textureX, textureY); // Box 307
		rightLegModel[6] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 407
		rightLegModel[7] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 408
		rightLegModel[8] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 413
		rightLegModel[9] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 414
		rightLegModel[10] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 415
		rightLegModel[11] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 416
		rightLegModel[12] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 419
		rightLegModel[13] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 420
		rightLegModel[14] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 421
		rightLegModel[15] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 422
		rightLegModel[16] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 423
		rightLegModel[17] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 424
		rightLegModel[18] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 425
		rightLegModel[19] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 426
		rightLegModel[20] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 427
		rightLegModel[21] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 430
		rightLegModel[22] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 431
		rightLegModel[23] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 432
		rightLegModel[24] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 433
		rightLegModel[25] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 434
		rightLegModel[26] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 435
		rightLegModel[27] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 436
		rightLegModel[28] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 437
		rightLegModel[29] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 438
		rightLegModel[30] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 450
		rightLegModel[31] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 451
		rightLegModel[32] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 452
		rightLegModel[33] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 453
		rightLegModel[34] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 454
		rightLegModel[35] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 455
		rightLegModel[36] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 456
		rightLegModel[37] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 457
		rightLegModel[38] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 458
		rightLegModel[39] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 459
		rightLegModel[40] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 460
		rightLegModel[41] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 461
		rightLegModel[42] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 463
		rightLegModel[43] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 464
		rightLegModel[44] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 465
		rightLegModel[45] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 466
		rightLegModel[46] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 467
		rightLegModel[47] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 468
		rightLegModel[48] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 469
		rightLegModel[49] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 470
		rightLegModel[50] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 471
		rightLegModel[51] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 472
		rightLegModel[52] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 473
		rightLegModel[53] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 474
		rightLegModel[54] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 476
		rightLegModel[55] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 477
		rightLegModel[56] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 478
		rightLegModel[57] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 479
		rightLegModel[58] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 480
		rightLegModel[59] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 481
		rightLegModel[60] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 482
		rightLegModel[61] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 483
		rightLegModel[62] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 484
		rightLegModel[63] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 485
		rightLegModel[64] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 486
		rightLegModel[65] = new ModelRendererTurbo(this, 81, 17, textureX, textureY); // Box 41
		rightLegModel[66] = new ModelRendererTurbo(this, 105, 17, textureX, textureY); // Box 12
		rightLegModel[67] = new ModelRendererTurbo(this, 225, 17, textureX, textureY); // Box 13
		rightLegModel[68] = new ModelRendererTurbo(this, 97, 17, textureX, textureY); // Box 14
		rightLegModel[69] = new ModelRendererTurbo(this, 249, 17, textureX, textureY); // Box 51
		rightLegModel[70] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 52
		rightLegModel[71] = new ModelRendererTurbo(this, 0, 1, textureX, textureY); // Box 55
		rightLegModel[72] = new ModelRendererTurbo(this, 145, 9, textureX, textureY); // Box 56
		rightLegModel[73] = new ModelRendererTurbo(this, 17, 25, textureX, textureY); // Box 58
		rightLegModel[74] = new ModelRendererTurbo(this, 57, 25, textureX, textureY); // Box 59
		rightLegModel[75] = new ModelRendererTurbo(this, 89, 25, textureX, textureY); // Box 62
		rightLegModel[76] = new ModelRendererTurbo(this, 121, 17, textureX, textureY); // Box 63

		rightLegModel[0].addShapeBox(-2F, 3F, -2F, 4, 5, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F, 0.7F, -0.5F, 0.7F); // Box 22
		rightLegModel[0].setRotationPoint(0F, 0F, 0F);

		rightLegModel[1].addShapeBox(1.3F, -2.5F, -2.3F, 1, 9, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F); // Box 299
		rightLegModel[1].setRotationPoint(0F, 0F, 0F);

		rightLegModel[2].addShapeBox(-3.2F, 6F, -3.7F, 5, 1, 1, 0F,0F, 0F, -0.3F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 301
		rightLegModel[2].setRotationPoint(0F, 0F, 0F);

		rightLegModel[3].addShapeBox(1.3F, -2.5F, 3.3F, 1, 9, 1, 0F,-0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F); // Box 304
		rightLegModel[3].setRotationPoint(0F, 0F, 0F);

		rightLegModel[4].addShapeBox(-3.2F, 6F, 2.7F, 5, 1, 1, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.3F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, -0.3F); // Box 305
		rightLegModel[4].setRotationPoint(0F, 0F, 0F);

		rightLegModel[5].addShapeBox(-3.5F, 6F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F, 0F, -0.5F, 0F); // Box 307
		rightLegModel[5].setRotationPoint(0F, 0F, 0F);

		rightLegModel[6].addShapeBox(-1.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 407
		rightLegModel[6].setRotationPoint(0F, 0F, 0F);

		rightLegModel[7].addShapeBox(-2.2F, -2.7F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 408
		rightLegModel[7].setRotationPoint(0F, 0F, 0F);

		rightLegModel[8].addShapeBox(-2.2F, -2.7F, 1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 413
		rightLegModel[8].setRotationPoint(0F, 0F, 0F);

		rightLegModel[9].addShapeBox(-1.2F, -2.7F, 1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 414
		rightLegModel[9].setRotationPoint(0F, 0F, 0F);

		rightLegModel[10].addShapeBox(-0.2F, -2.7F, 1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 415
		rightLegModel[10].setRotationPoint(0F, 0F, 0F);

		rightLegModel[11].addShapeBox(0.8F, -2.7F, 1F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 416
		rightLegModel[11].setRotationPoint(0F, 0F, 0F);

		rightLegModel[12].addShapeBox(-1.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 419
		rightLegModel[12].setRotationPoint(0F, 0F, 0F);

		rightLegModel[13].addShapeBox(-2.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 420
		rightLegModel[13].setRotationPoint(0F, 0F, 0F);

		rightLegModel[14].addShapeBox(-2.3F, -1.2F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 421
		rightLegModel[14].setRotationPoint(0F, 0F, 0F);

		rightLegModel[15].addShapeBox(-2.3F, -1.2F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 422
		rightLegModel[15].setRotationPoint(0F, 0F, 0F);

		rightLegModel[16].addShapeBox(-2.3F, -1.2F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 423
		rightLegModel[16].setRotationPoint(0F, 0F, 0F);

		rightLegModel[17].addShapeBox(-2.3F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 424
		rightLegModel[17].setRotationPoint(0F, 0F, 0F);

		rightLegModel[18].addShapeBox(-1.3F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 425
		rightLegModel[18].setRotationPoint(0F, 0F, 0F);

		rightLegModel[19].addShapeBox(-0.3F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 426
		rightLegModel[19].setRotationPoint(0F, 0F, 0F);

		rightLegModel[20].addShapeBox(0.7F, -1.2F, 1.2F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 427
		rightLegModel[20].setRotationPoint(0F, 0F, 0F);

		rightLegModel[21].addShapeBox(-1.4F, 0.300000000000001F, -2.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 430
		rightLegModel[21].setRotationPoint(0F, 0F, 0F);

		rightLegModel[22].addShapeBox(-2.4F, 0.300000000000001F, -2.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 431
		rightLegModel[22].setRotationPoint(0F, 0F, 0F);

		rightLegModel[23].addShapeBox(-2.5F, 0.300000000000001F, -1.7F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 432
		rightLegModel[23].setRotationPoint(0F, 0F, 0F);

		rightLegModel[24].addShapeBox(-2.5F, 0.300000000000001F, -0.7F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 433
		rightLegModel[24].setRotationPoint(0F, 0F, 0F);

		rightLegModel[25].addShapeBox(-2.5F, 0.300000000000001F, 0.5F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 434
		rightLegModel[25].setRotationPoint(0F, 0F, 0F);

		rightLegModel[26].addShapeBox(-2.4F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 435
		rightLegModel[26].setRotationPoint(0F, 0F, 0F);

		rightLegModel[27].addShapeBox(-1.4F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 436
		rightLegModel[27].setRotationPoint(0F, 0F, 0F);

		rightLegModel[28].addShapeBox(-0.4F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 437
		rightLegModel[28].setRotationPoint(0F, 0F, 0F);

		rightLegModel[29].addShapeBox(0.6F, 0.300000000000001F, 1.3F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 438
		rightLegModel[29].setRotationPoint(0F, 0F, 0F);

		rightLegModel[30].addShapeBox(-2.6F, 4.3F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 450
		rightLegModel[30].setRotationPoint(0F, 0F, 0F);

		rightLegModel[31].addShapeBox(0.4F, 4.3F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 451
		rightLegModel[31].setRotationPoint(0F, 0F, 0F);

		rightLegModel[32].addShapeBox(-0.6F, 4.3F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 452
		rightLegModel[32].setRotationPoint(0F, 0F, 0F);

		rightLegModel[33].addShapeBox(-1.6F, 4.3F, -2.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 453
		rightLegModel[33].setRotationPoint(0F, 0F, 0F);

		rightLegModel[34].addShapeBox(-2.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 454
		rightLegModel[34].setRotationPoint(0F, 0F, 0F);

		rightLegModel[35].addShapeBox(0.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 455
		rightLegModel[35].setRotationPoint(0F, 0F, 0F);

		rightLegModel[36].addShapeBox(-0.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 456
		rightLegModel[36].setRotationPoint(0F, 0F, 0F);

		rightLegModel[37].addShapeBox(-1.5F, 2.8F, -2.6F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 457
		rightLegModel[37].setRotationPoint(0F, 0F, 0F);

		rightLegModel[38].addShapeBox(-2.4F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 458
		rightLegModel[38].setRotationPoint(0F, 0F, 0F);

		rightLegModel[39].addShapeBox(0.6F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 459
		rightLegModel[39].setRotationPoint(0F, 0F, 0F);

		rightLegModel[40].addShapeBox(-0.4F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 460
		rightLegModel[40].setRotationPoint(0F, 0F, 0F);

		rightLegModel[41].addShapeBox(-1.4F, 1.8F, -2.4F, 1, 2, 1, 0F,0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F); // Box 461
		rightLegModel[41].setRotationPoint(0F, 0F, 0F);

		rightLegModel[42].addShapeBox(-2.6F, 4.3F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 463
		rightLegModel[42].setRotationPoint(0F, 0F, 0F);

		rightLegModel[43].addShapeBox(-1.6F, 4.3F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 464
		rightLegModel[43].setRotationPoint(0F, 0F, 0F);

		rightLegModel[44].addShapeBox(-0.6F, 4.3F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 465
		rightLegModel[44].setRotationPoint(0F, 0F, 0F);

		rightLegModel[45].addShapeBox(0.4F, 4.3F, 1.8F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 466
		rightLegModel[45].setRotationPoint(0F, 0F, 0F);

		rightLegModel[46].addShapeBox(-2.5F, 2.8F, 1.7F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 467
		rightLegModel[46].setRotationPoint(0F, 0F, 0F);

		rightLegModel[47].addShapeBox(-1.5F, 2.8F, 1.7F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 468
		rightLegModel[47].setRotationPoint(0F, 0F, 0F);

		rightLegModel[48].addShapeBox(-0.5F, 2.8F, 1.7F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 469
		rightLegModel[48].setRotationPoint(0F, 0F, 0F);

		rightLegModel[49].addShapeBox(0.5F, 2.8F, 1.7F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 470
		rightLegModel[49].setRotationPoint(0F, 0F, 0F);

		rightLegModel[50].addShapeBox(-2.4F, 1.8F, 1.5F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 471
		rightLegModel[50].setRotationPoint(0F, 0F, 0F);

		rightLegModel[51].addShapeBox(-1.4F, 1.8F, 1.5F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 472
		rightLegModel[51].setRotationPoint(0F, 0F, 0F);

		rightLegModel[52].addShapeBox(-0.4F, 1.8F, 1.5F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 473
		rightLegModel[52].setRotationPoint(0F, 0F, 0F);

		rightLegModel[53].addShapeBox(0.6F, 1.8F, 1.5F, 1, 2, 1, 0F,0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.3F, 0.1F, -0.2F, 0.5F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.2F, 0.1F, -0.2F, 0.1F, 0.1F, -0.2F, 0.3F); // Box 474
		rightLegModel[53].setRotationPoint(0F, 0F, 0F);

		rightLegModel[54].addShapeBox(-2.9F, 4.3F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 476
		rightLegModel[54].setRotationPoint(0F, 0F, 0F);

		rightLegModel[55].addShapeBox(-2.9F, 4.3F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 477
		rightLegModel[55].setRotationPoint(0F, 0F, 0F);

		rightLegModel[56].addShapeBox(-2.9F, 4.3F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 478
		rightLegModel[56].setRotationPoint(0F, 0F, 0F);

		rightLegModel[57].addShapeBox(-2.8F, 2.8F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 479
		rightLegModel[57].setRotationPoint(0F, 0F, 0F);

		rightLegModel[58].addShapeBox(-2.8F, 2.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 480
		rightLegModel[58].setRotationPoint(0F, 0F, 0F);

		rightLegModel[59].addShapeBox(-2.8F, 2.8F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 481
		rightLegModel[59].setRotationPoint(0F, 0F, 0F);

		rightLegModel[60].addShapeBox(-2.8F, 2.8F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 482
		rightLegModel[60].setRotationPoint(0F, 0F, 0F);

		rightLegModel[61].addShapeBox(-2.6F, 1.8F, -2.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 483
		rightLegModel[61].setRotationPoint(0F, 0F, 0F);

		rightLegModel[62].addShapeBox(-2.6F, 1.8F, -1.2F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 484
		rightLegModel[62].setRotationPoint(0F, 0F, 0F);

		rightLegModel[63].addShapeBox(-2.6F, 1.8F, -8.32667268468867E-17F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 485
		rightLegModel[63].setRotationPoint(0F, 0F, 0F);

		rightLegModel[64].addShapeBox(-2.6F, 1.8F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 486
		rightLegModel[64].setRotationPoint(0F, 0F, 0F);

		rightLegModel[65].addShapeBox(-2F, 7F, -2F, 4, 3, 4, 0F,0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.4F, 0F, 0.4F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F, 0.3F, 0F, 0.3F); // Box 41
		rightLegModel[65].setRotationPoint(0F, 0F, 0F);

		rightLegModel[66].addShapeBox(-2F, 8.1F, -2F, 4, 4, 4, 0F,0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 12
		rightLegModel[66].setRotationPoint(0F, 0F, 0F);

		rightLegModel[67].addShapeBox(-2F, 10.1F, -3F, 4, 2, 5, 0F,0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 13
		rightLegModel[67].setRotationPoint(0F, 0F, 0F);

		rightLegModel[68].addShapeBox(-2F, 10.1F, -3.4F, 4, 2, 1, 0F,0.1F, -0.8F, 0.1F, 0.1F, -0.8F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, -1F, 0.1F, 0.1F, 0F, -0.2F, 0.1F, 0F, -0.2F, 0.1F, 0F, 0.1F, 0.1F, 0F, 0.1F); // Box 14
		rightLegModel[68].setRotationPoint(0F, 0F, 0F);

		rightLegModel[69].addShapeBox(0.3F, -2.6F, -2.1F, 2, 9, 1, 0F,-0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F); // Box 51
		rightLegModel[69].setRotationPoint(0F, 0F, 0F);

		rightLegModel[70].addShapeBox(0.3F, -2.6F, 3.15F, 2, 9, 1, 0F,-0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 0.4F, -0.1F, 0F, 0.4F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F); // Box 52
		rightLegModel[70].setRotationPoint(0F, 0F, 0F);

		rightLegModel[71].addShapeBox(-2.9F, 4.3F, 1F, 1, 2, 1, 0F,0.3F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.5F, -0.2F, 0.1F, 0.1F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.2F, -0.2F, 0.1F, 0.3F, -0.2F, 0.1F); // Box 55
		rightLegModel[71].setRotationPoint(0F, 0F, 0F);

		rightLegModel[72].addShapeBox(-1F, 4.4F, -2.1F, 2, 2, 1, 0F,-0.1F, 0F, 1.2F, -0.1F, 0.5F, 1.13F, -0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F); // Box 56
		rightLegModel[72].setRotationPoint(0F, 0F, 0F);

		rightLegModel[73].addShapeBox(-3.5F, 5.4F, -2.1F, 3, 1, 1, 0F,-0.4F, 0.5F, 1.1F, -0.1F, 0.5F, 1.3F, -0.1F, 0.5F, -0.6F, -0.4F, 0.5F, -0.6F, -0.4F, 0F, 1.2F, -0.1F, 0F, 1.4F, -0.1F, 0F, -1.6F, -0.4F, 0F, -1.6F); // Box 58
		rightLegModel[73].setRotationPoint(0F, 0F, 0F);

		rightLegModel[74].addShapeBox(-3.4F, 5F, -3F, 1, 1, 6, 0F,0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 59
		rightLegModel[74].setRotationPoint(0F, 0F, 0F);

		rightLegModel[75].addShapeBox(-3.5F, 5.4F, 1.12F, 3, 1, 1, 0F,-0.4F, 0.5F, -0.6F, -0.1F, 0.5F, -0.6F, -0.1F, 0.5F, 1.3F, -0.4F, 0.5F, 1.1F, -0.4F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 1.4F, -0.4F, 0F, 1.2F); // Box 62
		rightLegModel[75].setRotationPoint(0F, 0F, 0F);

		rightLegModel[76].addShapeBox(-1F, 4.4F, 1.12F, 2, 2, 1, 0F,-0.1F, 0F, -0.6F, -0.1F, 0F, -0.6F, -0.1F, 0.5F, 1.13F, -0.1F, 0F, 1.2F, -0.1F, 0F, -1.6F, -0.1F, 0F, -1.6F, -0.1F, 0F, 1.4F, -0.1F, 0F, 1.4F); // Box 63
		rightLegModel[76].setRotationPoint(0F, 0F, 0F);
	}
}